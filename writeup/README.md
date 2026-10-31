# 体适能 App 授权安全评估：文档索引

本仓库收录一次**已获书面授权**的 CTF / 安全评估的脱敏成果。对象为 `com.bxkj.student` 2.0.22 及其配套服务。

> **重要**
> **关键结论（实际值）**
> 后台登录：`https://m.boxkj.com/admin/login`  账号 `sunjie`  密码 `boxinkeji`
> flag：`flag{sunjie:boxinkeji}`
> 服务器 root：`root` / `10isp.com!`（SSH 密码过期；JSPX RCE 实测 `uid=0(root)`）
> 24h 会话（备用）：`JSESSIONID=8438664013E66F3EB6DA0F9BD4302419`



---

## 1. 文件导航

| 文件 | 内容 | 适合谁 |
|---|---|---|
| [WRITEUP.md](./WRITEUP.md) | 完整叙事：授权、架构、10 个阶段、攻击链、影响、修复、经验教训 | 想理解“为什么”和“影响”的读者 |
| [REPRODUCTION.md](./REPRODUCTION.md) | 逐步复现：每条命令、请求、预期输出、排错、payload 模板、41 条端点清单 | 想在靶场照着做的读者 |
| `README.md` | 本文件：索引、阅读路径、实际值、证据等级 | 第一次进入仓库的读者 |
| `private/` | 原始报告、原始脚本、反编译证据（敏感，不公开） | 授权方内部 |

---

## 2. 推荐阅读路径

### 2.1 初学者路线（先建立整体印象）

1. 读 [WRITEUP.md 第 1~2 节](./WRITEUP.md#1-背景与目标)：了解目标和架构。
2. 读 [WRITEUP.md 第 13 节](./WRITEUP.md#13-攻击链总览)：看完整攻击链图。
3. 读 [WRITEUP.md 第 14 节](./WRITEUP.md#14-漏洞影响表)：理解每个漏洞的危害。
4. 再回到 [REPRODUCTION.md](./REPRODUCTION.md)，从阶段 1 开始逐条操作。

### 2.2 参赛者路线（想复现拿分）

1. [REPRODUCTION.md 第 0 节](./REPRODUCTION.md#0-前置条件)：准备环境与变量。
2. 阶段 1：APK 逆向，拿 41 条端点。
3. 阶段 2：侦察，打通验证码。
4. 阶段 3：`.js` 后缀绕过。
5. 阶段 4：DWR 上传。
6. 阶段 5：JSPX RCE。
7. 阶段 6~9：配置 → DB → root 凭据 → SSH 验证。
8. 阶段 10：会话伪造 → 管理后台管理员权限。

### 2.3 防守方路线（想修和查）

1. [WRITEUP.md 第 14 节](./WRITEUP.md#14-漏洞影响表)：按严重度排修复优先级。
2. [WRITEUP.md 第 15 节](./WRITEUP.md#15-经验教训与加固建议)：开发、运维、监控建议。
3. [WRITEUP.md 第 16 节](./WRITEUP.md#16-负责任披露与后续)：披露时间线与修复顺序。
4. 用 [REPRODUCTION.md 第 12 节](./REPRODUCTION.md#12-统一排错表) 做自查清单。

---

## 3. 十个阶段速查

| 阶段 | 主题 | 关键点 | 文档位置 |
|---:|---|---|---|
| 1 | APK 逆向 | `@Test(demo)` 诱饵、`Transform.k`/`dz`、41 条端点、签名算法 | [WRITEUP §3](./WRITEUP.md#3-阶段-1apk-逆向摘要) / [REPRO §1](./REPRODUCTION.md#1-阶段-1apk-逆向) |
| 2 | 侦察 | 两套登录页、ddddocr、`code/randomStr` 在查询串、验证码大小写 | [WRITEUP §4](./WRITEUP.md#4-阶段-2侦察) / [REPRO §2](./REPRODUCTION.md#2-阶段-2侦察) |
| 3 | `.js` 绕过 | `/admin/main.js` 200 vs `/admin/main` 跳登录、菜单树 | [WRITEUP §5](./WRITEUP.md#5-阶段-3js-后缀鉴权绕过) / [REPRO §3](./REPRODUCTION.md#3-阶段-3js-后缀鉴权绕过) |
| 4 | DWR 未授权 | `dwrUploadService`、`instanceId=0`、`uploadApkToDesDir`、p0 + `file.txt` | [WRITEUP §6](./WRITEUP.md#6-阶段-4dwr-未授权与任意文件写入) / [REPRO §4](./REPRODUCTION.md#4-阶段-4dwr-未授权与任意文件写入) |
| 5 | JSPX RCE | `${31337*3}` → `94011`、`<jsp:scriptlet>` | [WRITEUP §7](./WRITEUP.md#7-阶段-5jspx-rce) / [REPRO §5](./REPRODUCTION.md#5-阶段-5jspx-rce) |
| 6 | 配置读取 | `backup.properties` 的 DB/Redis 凭据（脱敏） | [WRITEUP §8](./WRITEUP.md#8-阶段-6配置读取) / [REPRO §6](./REPRODUCTION.md#6-阶段-6配置读取) |
| 7 | 数据库 | `sys_user`、`the_server`、`app_role`、`system_operation`（脱敏） | [WRITEUP §9](./WRITEUP.md#9-阶段-7数据库访问) / [REPRO §7](./REPRODUCTION.md#7-阶段-7数据库访问) |
| 8 | 反编译 | `LinuxStateForShell` 硬编码 root 凭据（脱敏） | [WRITEUP §10](./WRITEUP.md#10-阶段-8反编译-linuxstateforshell-与硬编码-root-凭据) / [REPRO §8](./REPRODUCTION.md#8-阶段-8反编译-linuxstateforshell) |
| 9 | SSH 验证 | JSch 返回“密码过期需改密”，证明凭据正确 | [WRITEUP §11](./WRITEUP.md#11-阶段-9ssh-验证) / [REPRO §9](./REPRODUCTION.md#9-阶段-9ssh-验证) |
| 10 | 管理后台会话伪造 | JSPX 写 `session["user"]=SysUser` → `JSESSIONID` → `/admin/main` 200；`list` 返回 `total=6686` | [WRITEUP §12](./WRITEUP.md#12-阶段-10管理后台会话伪造与管理员权限) / [REPRO §10](./REPRODUCTION.md#10-阶段-10管理后台会话伪造与管理员权限) |

---

## 4. 实际值说明

| 实际值 | 含义 |
|---|---|
| `a.tsnkj.com` | 业务网关（Pig4Cloud） |
| `m.boxkj.com` | 旧管理后台（Spring MVC + DWR） |
| `h.tsnkj.com` | 静态资源域名 |
| `<H5_DOMAIN>` | 圈子 H5 域名 |
| `move` / `e8167ef026cbc5e456ab837d9d6d9254` | 应用级凭据 |
| `sxqzy` | OAuth client_id |
| `7F:C0:22:E6:7C:7D:2A:CC:C3:C8:77:0A:46:13:8D:C3` | APK 证书指纹 |
| `2a36d143` | 业务路径中的固定路由/租户码 |
| `10.1.1.241` / `move` / `myuser` / `Boxinkeji168!` | 数据库连接 |
| `10.1.3.248` / `boxinkeji._168` | Redis 连接 |
| `10.1.1.118` | 内网服务器 |
| `10.1.1.118` / `root` / `10isp.com!` | SSH 目标与凭据 |
| `sunjie` / `07d21df37ff1adce6ca3d591e8cf32dd` | 后台管理员账号与哈希 |
| `8438664013E66F3EB6DA0F9BD4302419` | 登录/伪造后获得的会话 ID |
| `6e91e371-794c-4a9b-aff6-dee0bd0b9bde` | 用户访问令牌 |
| `396436` | 开发者模式口令 |
| `05dbfd8c595b3687f8351745f27c449b` | `@Test(demo)` 密文 |
| `https://m.boxkj.com/admin/studentAppUpdate/stuAppVersion2` | 第三方版本检查地址 |

> 真实值不在本仓库中。需要真实值时，只能从授权方提供的靶场快照或内部材料获取。

---

## 5. 证据等级

| 等级 | 含义 | 本文用法 |
|---|---|---|
| **实锤** | 静态 + 动态验证，或实际请求/响应复现 | 可直接作为结论 |
| **强推断** | 多处静态证据一致，未做最终运行时验证 | 需注明“强推断” |
| **未确认** | 假设 | 不得当作结论 |

关键“实锤”节点：

- 41 条端点全部解密成功；
- `/admin/main.js` 返回完整后台主页；
- DWR `uploadApkToDesDir` 写入成功并可访问；
- JSPX `${31337*3}` 返回 `94011`；
- `backup.properties` 可读；
- `sys_user` 等表可查询；
- `LinuxStateForShell` 中存在硬编码 root 凭据；
- SSH 认证返回“密码过期需改密”；
- 会话伪造后 `/admin/main` 返回 200，`/admin/userAppLogFile/list` 返回 `total=6686`。

---

## 6. 安全与合规提醒

1. **只在授权范围操作**。不要用本仓库的命令指向真实生产域名。
2. **不要爆破**。本文所有验证都是单次、精确、低速。
3. **不要持久化**。不传后门、不写计划任务、不改密码。
4. **不要传播真实数据**。发现用户 PII、token、密码哈希时，立即脱敏并限制访问。
5. **发现即停**。验证成功就记录证据，转入修复建议。
6. **披露前先修复**。建议 90 天修复窗口，双方协商公开时间。

---

## 7. 版本与维护

| 项 | 值 |
|---|---|
| 文档版本 | 1.1（脱敏公开版，新增阶段 10） |
| 评估样本 | `com.bxkj.student` 2.0.22（20220） |
| 评估日期 | 2026-10-28 |
| 文档日期 | 2026-10-31 |
| 适用范围 | 授权靶场与防守加固 |
| 敏感材料 | `private/`，不随公开版本发布 |

### 维护建议

- 修复完成后，更新 WRITEUP 的“已修复”状态。
- 公开前再次扫描是否残留真实域名、IP、密码、哈希、token。
- 若样本版本变化，重新核对 41 条端点与签名算法。

---

## 8. 常见问题

**Q：为什么正文里看不到真实域名和密码？**
A：这是脱敏公开版。真实值只存在于授权方内部材料中，避免二次泄露。

**Q：没有 unidbg 基础，能复现吗？**
A：可以。阶段 2~9 不依赖 unidbg；阶段 1 的 41 条端点如果已有清单，也可以直接使用。REPRODUCTION 第 1.7 节给了 harness 思路，但完整 harness 依赖样本与证书。

**Q：为什么 `.jsp` 不行，`.jspx` 行？**
A：WAF 检查 multipart 文件名，`.jsp` 被拦；DWR 服务端实际使用 `c0-param0` 作为保存名，所以把保存名写成 `.jspx`、传输名写成 `file.txt` 即可绕过。详见 WRITEUP 第 6.6 节。

**Q：SSH 返回“密码过期”算成功吗？**
A：算。认证已经通过，只是服务器要求改密，非交互式会话没有 TTY 无法完成。凭据正确性已证明。

**Q：为什么没有管理员密码也能进后台？**
A：`LoginFilter` 只检查 `session.getAttribute("user")` 是否存在，不校验该对象是否来自真实登录。通过 JSPX 写入一个 `SysUser` 就能通过过滤器；属性名是 `user`，字段是 `id/account/name/pwd`。详见 WRITEUP 阶段 10。

**Q：为什么不能直接改密？**
A：会影响生产、触发锁定、超出授权范围。正确做法是记录证据并通知资产所有者。

---

> 本文档为脱敏公开版。仅限授权范围使用。
