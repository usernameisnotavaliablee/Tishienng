# 体适能 APK 逆向材料 — GitHub 公开前敏感信息分级清单

## Context

要把本目录下的逆向分析材料推到 GitHub 公开。本目录混合了：
- 21 份 Markdown 文档（披露/控诉/手册/技术报告/进度/交接）
- 一批 `dis_*.txt`（SO 反汇编片段）、`recon_*.txt`、`netscan_*.txt`、`AndroidManifest.xml` 与解码版
- 工具脚本（`*.py`）和 jadx 自带 README

公开这些材料带来两类风险：
1. **协议武器化风险** —— AES/RSA/DES key、RC4 魔改算法常量、签名校验路径、第三方 AppKey 明文，组合后足以伪造客户端请求或攻击线上服务
2. **法律风险** —— 对运营方"博星科技/体适能"的强定性表述（"灰产/特洛伊木马/帮别人刷单"等）与具体高校点名，未取得动态行为证据

目标：把所有材料按"直接可推 / 脱敏后可推 / 不公开仅作监管封存"三档分级，并给出每个文件的脱敏要点。

---

## 一、❌ 不公开（仅作监管/司法封存）

这些文件即使脱敏，剩余信息密度仍足以重建攻击链路。

### 业务密钥与算法的"原始证据包"
| 文件 | 关键风险 |
|------|---------|
| `密钥与算法证据清单.md` | 5 个 AES-128 业务密钥 hex + 弱 NFC key + 算法路径汇总，等价于一份"伪造请求工具书" |
| `第5轮交接_无Root静态深挖.md` | 含完整 RSA 私钥 base64（疑似快手 SDK 内嵌） |
| `HANDOFF逆向交接文档.md` | 汇总性文档，含友盟 AppKey 明文 + 加固/签名/密钥全索引 |
| `dsh-vm/dumps/**`（含 `jadx_out/` 反编译源码 cap_4/cap_8） | 真业务 + 灰产 SDK 源码（全量类），等价于脱壳产物，进 `.gitignore` |
| `dsh-vm/frida/dump_dex.*`、`dsh-vm/pyvenv16/`、`dsh-vm/tools/` | 脱壳工具链 + frida 环境 + jadx，可重建取证/攻击链路 |
| `unidbg动态验证报告.md` | 含 AES 密钥值 hex（AUTH_KEY/QR_CODE_KEY）+ auth 证书 MD5 + 算法验证命令；或按统一替换表脱敏后移入⚠️ |
| `HANDOFF-2026.8.14-23:18.md` | 含密钥值（AUTH_KEY/QR_CODE_KEY hex）+ 脱壳操作步骤索引；或按统一替换表脱敏后移入⚠️ |

### SO 反汇编片段（攻击链路重建材料）
- `dis_aes_decrypt.txt`（含 movk/movz 立即数即密文片段）
- `dis_rsa_decrypt.txt`
- `dis_auth.txt` / `dis_authS.txt` / `dis_auth_sjk.txt`（签名校验函数体）
- `dis_buildKeyValue.txt`（参数序列化）
- `dis_generateAuthInfo.txt`（鉴权信息生成）
- `dis_getSig.txt`（APK 证书 MD5 校验）
- `dis_umeng_getNativeID.txt` / `dis_umeng_xpCy.txt`（友盟 ZID 算法）
- `dis_emu_*.txt` / `dis_lt_*.txt` / `dis_ti_*.txt` / `dis_sg_*.txt`（加固 anti-emulator/anti-debug 路径）
- `dis_devInfo_*.txt` / `dis_commonV2_*.txt`（设备指纹算法）

### 第三方凭证清单
- `AndroidManifest.xml`（二进制 AXML，等价于解码版）
- `manifest_decoded.xml`（明文 AppKey：高德 amap key、UMENG_APPKEY、JPUSH_APPKEY、Tencent QQ scheme）

> 处理建议：本地保留，作为向 12321 / 12377 / 工信部 / 网信办实名提交时的封存证据。**不进 git，加入 `.gitignore`。**

---

## 二、⚠️ 脱敏后可推

### 长报告类（10 份）
| 文件 | 主要脱敏点 |
|------|-----------|
| `libjiagu逆向技术报告.md` | 360 appid `7418fdaab59b1c0c` → `<JIAGU_APPID>`；魔改 RC4 的 10 字节 key + i+=2/j+=S[i]+1 算法常量删除，仅保留"魔改 RC4"事实判断 |
| `jiagu_脱壳进度.md` | 同上，加固 appid 与 RC4 常量统一占位 |
| `assets深挖分析.md` | 腾讯 DES `asdfghjk` 与 AES `4026aec5f46360286842041e8cd49856`、模拟器检测路径全集 → 占位 |
| `reverse-analysis.md` | RSA-2048 公钥整段 → `<RSA-2048 PUB KEY, redacted>`；41 个 API 端点的 `2a36d143` 租户标识 → `<TENANT>`；JNI 工程 Windows 绝对路径 `C:/Android/...` → 相对 |
| `设备指纹SO分析.md` | OAID/IMEI 获取路径函数偏移如包含 vivo/小米 SDK 内 appid 一并占位 |
| `深挖补充证据.md` | 签名证书 SHA-256 截断为前 8 字节 + `...redacted`；OPPO/快手第三方域名保留 |
| `无Root脱壳实操手册.md` | 完整可直接复制运行的 Frida dump/anti-antifake 脚本 → 改为思路描述或加合规警告 |
| `本轮工作总结_脱壳攻坚与能力测试.md` | 引用上游内部文档名（"密钥与算法证据清单.md"等）→ 删除引用条目 |
| `体适能_不合规披露报告.md` | **高优先级**。5 个 AES key、RC4 10B key、腾讯 DES、快手 RSA 位置、高德/友盟/极光 AppKey 明文全部 → 占位；`auth()` 字典序签名步骤 → 仅保留"native 完成 AES+RSA+签名校验"的事实判断；`BJYDDXSJXY` 推测高校名 → "某学院 NFC 未替换出厂默认"；定性词"灰产/特洛伊木马"→ "具备 X 能力，未取得动态行为证据" |
| `体适能APP控诉_流媒体版.md` | **法律风险为主**。"半夜帮别人刷单/偷看微信淘宝/灰产"等情绪定性 → 事实化改写；具体高校隐喻（"泥河"）→ 删除或泛化；"东哥冲业绩"等真人/品牌影射 → 删除；正文开头加显眼"事实-推断分界"声明 |
| `体适能_脱壳取证_acse.ottn.md` | C2 域名 `report.idazhe.net` / `tongji.oozk.cn` / 裸 IP `118.89.189.246` 建议脱敏为占位或保留并注明"仅取证用途"；AES key 片段占位；强定性词"灰产"→"具备 X 能力，未取得动态行为证据"（动态未闭环处） |
| `体适能_脱壳取证_业务调用链.md` | 同上 C2/域名处理；`uniqueCode`/签名串步骤仅保留"native 完成鉴权/签名"事实判断；SecretActivity 白名单 UUID 值占位 |

### 法条标注补充（3 份重复内容 → 合并为 1 份）
- `体适能_新增不合规点与法条标注补充.md`
- `体适能_新增不合规点与法条标注补充_替换后.md`
- `体适能_新增不合规点与法条标注补充_法条全称版.md`

> 三份是同一文档的三种法条引用风格。**只保留法条全称版**，删另两份。脱敏要点：作者邮箱 `thisismrjiang@foxmail.com` 移到末尾"联系方式"小节；SDK 接口路径里 `2a36d143` 占位化；强定性词事实化。

---

## 三、✅ 直接可推

| 文件 | 备注 |
|------|------|
| `真机脱壳完整手册.md` | 教学内容为主，无业务密钥；建议开头加一句"仅用于自有/合法授权 APK" |
| `脱壳与解密分析.md` | 脱敏 360 appid 后即可，主要是结构性分析 |
| `小米15+MuMu脱壳执行计划.md` | 执行计划，无密钥 |
| `README.md`（根目录） | jadx 上游 README，与本项目无关，建议归到 `tools/` 下避免混淆 |
| `tools\README.md` | 同上 |
| `recon_commonV2.txt` / `recon_devInfo.txt` | 仅含导出符号与公开路径，无密钥 |
| `netscan_all.txt` | 仅 `.comment` 段编译器 banner |
| `*.properties`（HMSCore-hatool / agconnect-core / firebase-*） | 仅版本号 |
| `*.py` 工具脚本（`axml_decode.py` / `disasm_so.py` / `key_hunt.py` / `probe_*.py` 等） | 通用逆向工具，非项目特异 |

---

## 四、跨文件统一替换表（脱敏时全局执行）

| 原文 | 替换为 |
|------|--------|
| `165f47a702bf0965d2fb49cdbb373377` (AUTH_KEY) | `<AES_AUTH_KEY>` |
| `c310d8a21490eddc2f3cd870c34bb732` (QR_CODE_KEY) | `<AES_QR_KEY>` |
| `ec96e9ac1149251acbb1b0c5777cae95` (SIGNATRUE_QZONE) | `<AES_QZONE_KEY>` |
| `201703141727` (WJXY_NFC_KEY) | `<NFC_KEY_WEAK>` |
| `FFFFFFFFFFFF` (BJYDDXSJXY_NFC_KEY) | `<MIFARE_DEFAULT>`（公知值，可保留） |
| `76 56 57 34 23 91 23 53 56 74` (360 RC4) | `<RC4_KEY_10B>` |
| `asdfghjk` (Tencent DES) | `<TENCENT_DES_KEY>` |
| `4026aec5f46360286842041e8cd49856` (Tencent AES) | `<TENCENT_AES_KEY>` |
| `7418FDAAB59B1C0C` / `7418fdaab59b1c0c` (360 appid) | `<JIAGU_APPID>` |
| `20450635af5f34ecb0270d71e9ae9c2e` (高德) | `<AMAP_APPKEY>` |
| `59a61305a3251138c9000c17` (友盟) | `<UMENG_APPKEY>` |
| `371eb09af9255d557b1e697e` (极光) | `<JPUSH_APPKEY>` |
| `5A:67:17:86:A4:31:50:C7:...` (签名 SHA-256) | 截断为前 8 字节 + `...redacted` |
| `2a36d143` (路径中租户标识) | `<TENANT>` |
| `C:/Android/Code/dependencies/TsnJNISecret/...` | 相对路径 |
| `report.idazhe.net` / `tongji.oozk.cn` / `118.89.189.246`（acse.ottn C2/上报域名+裸 IP） | `<C2_DOMAIN_1>` / `<C2_DOMAIN_2>` / `<C2_IP>`（或保留并注明"仅取证用途"） |

---

## 五、推送前的执行顺序建议

1. 在仓库根创建 `.gitignore`，排除"不公开"清单的所有文件（密钥证据 .md / `dis_*.txt` / `manifest_decoded.xml` / `AndroidManifest.xml` 二进制版 / 提取出的 `.so` / `classes.dex` / `assets/` 等）
2. 把"不公开"那一批文件从 git 工作树移到 `D:\ClaudeCode\tishineng-evidence-sealed\`（按 CLAUDE.md 临时文件惯例）作为本地封存
3. 对"脱敏后可推"清单按统一替换表批量改写
4. 三份"补充"合并为一份
5. 在仓库根添加一份 `DISCLAIMER.md`：
   - 静态分析免责（未对线上服务发起请求、未重打包、未传播脱壳产物）
   - "事实 vs. 推断" 分界声明
   - 脱敏说明（密钥/AppKey/算法常量已替换为占位符，原始证据仅向监管机关提交）
6. 推送前 `git status` 复核一遍，确认没有意外把 `.dex` / `.so` / `dis_*.txt` 加入

---

## 六、验证

推送前手动检查（不需要运行测试，是文档审查类任务）：
- `git ls-files` 输出对照"不公开"清单，确认零交集
- 全文 grep 一遍替换表里的原文字符串，应零命中
- 抽 2-3 份脱敏后的报告通读，确认事实陈述和"嫌疑/需动态取证"标注一致
- 流媒体版重读一遍，确认所有"灰产/特洛伊木马/帮别人刷单"等词已事实化
