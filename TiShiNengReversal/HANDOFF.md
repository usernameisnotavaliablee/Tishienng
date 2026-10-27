# HANDOFF — 当前状态交接（接手从这里开始）

> 最后更新：2026-08-15（第 8 轮静态取证收尾后整合）
> 本文件为**唯一**交接文档：已整合原《HANDOFF逆向交接文档.md》（第 1–6 轮）、《HANDOFF-2026.8.14-23:18.md》（第 7 轮）与旧版 HANDOFF.md 的全部内容，两份旧 HANDOFF 已删除。与 AGENTS.md（仓库指南）冲突时以 AGENTS.md 为准。

---

## 0. 一句话现状

**核心取证目标已全部完成。** `com.bxkj.student`（体适能）的 360 壳已脱（cap_4/cap_8 全量业务类、方法体完整），`com.acse.ottn` 灰产 SDK 已代码级实锤，native 鉴权链已由 unidbg 动态验证闭环；第 8 轮静态收官（SHA 清单 / 批量 jadx / native 入口映射 / 43+1 SO 排除表 / URL 复核）全部完成并已提交 git（`64207a7`）。第 9 轮 acse native 实现定位方案已有，**本轮（2026-09-06）将更新为可执行版**；用户已授权"本地 AVD + 断网 + 无 hook 只读内存扫描"（**暂缓执行，待方案文档批准后进行**）。exFAT 备份已按用户指示弃用，**Desktop APFS 副本（本工作区）为唯一权威工作区**。

---

## 1. 项目基本信息

| 项 | 值 |
|---|---|
| 应用名 | 体适能（校园体育打卡 / 体测 / 人脸防代跑） |
| 包名 | `com.bxkj.student` |
| 版本 | versionName `2.0.22` / versionCode `20220` |
| 厂商 | 博星科技（boxkj.com / tsnkj.com） |
| targetSdk / minSdk | 30 / 21（2026 年仍停在 2020 年的 target，合规问题） |
| 加固 | 360 加固（libjiagu，壳 dex `classes.dex` 45MB 仅 4 个壳类） |
| 权威工作区 | `/Users/mac/Desktop/tishineng.apk/`（APFS，git 仓库） |
| 弃用工作区 | `/Volumes/前任肥胖/下载/tishineng.apk/`（exFAT 备份，**用户已指示不再维护**，可能为旧版本） |
| 原版包 | `dsh-vm/base.apk`（132MB；classes.dex MD5 与解包树一致；v2/v3 签名块完好） |
| 本机环境 | Apple M2 MacBook-Mini 16GB，macOS 26.5，JDK 21，Py 3.14.6，HVF 可用 |
| ⚠️ 别混淆 | `Downloads\base.apk\` 是另一个 app（U校园/Unipus），与本项目无关 |

---

## 2. 加固与加密机制（结论）

### 2.1 Java 层：360 加固（核心障碍，已突破）
- `classes.dex`（45MB）是空壳：`class_defs_size=4`，只有 `com.stub.StubApp`、`com.tianyu.util.Configuration`、`com.tianyu.util.DtcLoader`、`com.tianyu.util.a` 四个壳类；真实业务代码加密在 ~45MB 夹带数据里，运行时由 `libjiagu.so`/`libjiagu_a64.so` 解密、`InMemoryDexClassLoader` 加载。
- 熵分析（32 段香农熵）：非单一 AES blob，而是 360 自有"分段压缩 + 加密"容器。
- **第 6 轮静态逆了加固运行时**（`libjiagu逆向技术报告.md`）：`libjiagu_a64.so` 蓄意破坏 ELF section header（nm 报 `SHT_NULL`）但 program header + DYNAMIC 完好；内部解密原语 = **自研魔改 RC4**（`i+=2`、`j=j+S[i]+1`、初值 `i=3,j=5`，Python 已复刻）；密钥明文硬编码（`76 56 57 34 23 91 23 53 56 74` @0x18a04+0x7456）；类名索引区单字节 XOR 0xa6 → appid `7418FDAAB59B1C0C` + `com.bxkj.student.splash`。
- **但真业务 dex 正文（~6.8MB 满熵）静态不可解**：解密器被 VMP 虚拟化（`interpreter_wrap_*`）、二级 SO 运行时内存生成非磁盘文件（libjgdtc.so 同理）、密钥运行时派生 → 必须动态脱壳（第 7 轮已用无 hook 内存扫描突破）。
- **第 8 轮补充**：7 个 acse Activity 的 native onCreate 实现**静态不可判定**（合法结论）——`com.stub.StubApp.interface11(int)` 为壳装载索引、实现在 libjiagu 内；二级业务模块 `libjgdtc.so`（DtcLoader.java 加载，硬编码回退 `/data/data/com.bxkj.student/lib/libjgdtc.so`）**磁盘不存在、运行时生成**。

### 2.2 业务层：自研 native 加密库 `libtsnsecret.so`（明文未加固）
- 加固不保护 SO；符号零混淆（OLLVM 平坦化除外），**RegisterNatives 动态注册**故无 `Java_` 前缀：`aes_decrypt`/`rsa_decrypt`/`generateAuthInfo`/`getSignatureByte`/`authS`/`auth_sjk`/`native_auth_5dm`/`native_auth_1ahs`/`formatSignature`。
- 硬编码密钥常量名：`AUTH_KEY`、`QR_CODE_KEY`、`SIGNATRUE_QZONE`、`WJXY_NFC_KEY`、`BJYDDXSJXY_NFC_KEY`（全文见 `密钥与算法证据清单.md`）。
- 服务器：`a.tsnkj.com`(API)/`h.tsnkj.com`(web)/`m.boxkj.com`(后台)/`circle.h5.tsnkj.com`/`pgyer.com`(蒲公英热更)。
- **第 8 轮补充**：tsnsecret 的 Java 装载器藏于 `com/google/android/datatransport/Transform.java`（loadLibrary:16，15 个 native 方法 a/d/e/f/g/h/i/k/r/s/t/u/v/w/x @27-67）；schoolUrl 链：cap_4 `com/bxkj/base/v2/data/b.java` M()=385-422 → :393 l() → b0/b.java:161-168 → `Transform.k`（native 解密，密文 `05dbfd8c595b3687f8351745f27c449b`=:392）。

### 2.3 关键认知
> 讽刺点：花钱上 360 加固保护 Java 层，核心密码学库却明文导出符号 + 硬编码密钥名。安全感错配。拿 native 算法与密钥**根本不需要脱壳**；脱壳只为读真业务 Java dex。

---

## 3. 轮次进度总览

| 轮次 | 关键进展 | 主要产物 |
|---|---|---|
| 第 1–4 轮 | 解包、AXML 解码、dex 结构探测、SO 侦察 | `manifest_decoded.xml`、`reverse-analysis.md`、recon_*.txt |
| 第 5 轮 | 无 Root 静态深挖：AES/RSA/签名算法反汇编、硬编码密钥全套、acse 灰产 manifest 证据 | `密钥与算法证据清单.md`、`设备指纹SO分析.md`、`第5轮交接_无Root静态深挖.md`、dis_*.txt |
| 第 6 轮 | 逆向 360 加固运行时（魔改 RC4、硬编码密钥、XOR 0xa6 索引）；资产深挖 | `libjiagu逆向技术报告.md`、`assets深挖分析.md`、`深挖补充证据.md` |
| 第 7 轮（2026-08-14） | 环境迁 M2 Mac；unidbg 动态验证闭环；**无 hook 内存扫描动态脱壳成功**（cap_4=com.bxkj.student 7027 类、cap_8=com.acse 6331 类）；acse SDK 取证实锤 | `unidbg动态验证报告.md`、`体适能_脱壳取证_acse.ottn.md`、`体适能_脱壳取证_无障碍与保活机制.md`、`体适能_脱壳取证_业务调用链.md` |
| 第 8 轮（2026-08-15） | 静态收官：14 cap + 8 输入 SHA-256 清单；cap_0 管线；8 个 cap 批量 jadx（fallback，全退出码 0）；7 Activity native 入口映射；43+1 SO 排除表（0 acse 候选）；URL 复核 10 行零漂移 | `第8轮_静态取证计划_修订版.md`、`体适能_脱壳取证_native入口映射.md`、`dsh-vm/logs/round8_*.md|txt`、jadx_cap_*.log |
| 第 9 轮（规划→文档更新中） | acse native 实现定位：方案已有，**本轮（2026-09-06）将更新为可执行版**；AVD 扫描授权已获但**暂缓执行**，待方案文档批准 | `第9轮_动态取证方案_acse_native实现定位.md` |

---

## 4. 已完成的取证结论（实锤级别）

### 4.1 脱壳（第 7 轮核心突破）
- **方法**：360 壳对任何 Frida hook（Java 或 native）都在 `art::Runtime::DisableVerifier` 处 SIGSEGV → 只能用**无 hook 匿名内存扫描** + native libc write 落盘（`dsh-vm/frida/dump_dex.py`，frida 16.7.19 / pyvenv16 环境）。
- **产物**：14 个内存 dump dex（`dsh-vm/dumps/dexcap/`，结构校验全部通过）：cap_4（9.5MB，7027 类）= 主业务全量；cap_8（9.4MB，6331 类）= acse 全量；cap_1/2/3/5/6/7/9 = 第三方库；cap_0/10/11 = 45MB 壳；cap_12/13 = 噪音。
- **验证**：jadx 反编译 `SplashActivity.java` 527 行真实代码、方法体完整（非空/无抽取）。反编译源码 `dsh-vm/dumps/jadx_out/cap_4/`、`cap_8/`。

### 4.2 native 鉴权（unidbg 动态验证，闭环）
`libtsnsecret.so` 在 unidbg 0.9.9 模拟 ARM64 中三用例全 PASS（`dsh-vm/logs/unidbg_run4.log`）：
1. `aes_decrypt(AUTH_KEY)` 往返 → AES-128-CBC，`AUTH_KEY=165f47a702bf0965d2fb49cdbb373377`（QR_CODE_KEY=`c310d8a21490eddc2f3cd870c34bb732`）。
2. `auth()` 前置鉴权链：喂真实 XIAOWEI 证书 DER（891B，`dsh-vm/cert_xiaowei.der`）→ 通过；**动态证明"重打包换证书 → auth 失败"**。
3. `generateAuthInfo` 字典序签名（Map 排序拼接）✓。
- unidbg 补环境要点（harness 已改好）：AbstractJni 回调用 BaseVM 签名；回调签名 strip `类名->` 前缀；DvmObject 需 `vm.addLocalObject()`；`StringObject(VM,String)`；`ArrayObject(DvmObject...)`。
- 运行：`cd unidbg_harness && dsh-vm/maven/apache-maven-3.9.9/bin/mvn -Dmaven.repo.local=.../dsh-vm/maven/maven-repo exec:java -Dexec.mainClass=com.tsn.harness.TsnSecretHarness`

### 4.3 灰产 SDK：com.acse.ottn（实锤）
- 无障碍自动点击 + 淘宝客/电商导流 + 广告刷量 + 插件静默安装 SDK（非广告标准件）；寄生多款校园体育 App（`l0.java:81-89` 硬编码包名）。
- 无障碍自动化：`d.java`（5450 行）硬编码约 50 个目标 App 的 Activity；`b.java` 手势执行器（CLICK/LONG_CLICK/SCROLL/SET_TEXT、dispatchGesture、performGlobalAction），**自动抢微信红包**（b.java:1189-1354）。
- C2/导流闭环：Retrofit `api/push_ad_ecpm`、`api/an/gc/scroll`、`api/an/gc/lon_lat`、`api/sys_pic`；任务模型带 tkl_url/spop_deeplink/微信小程序；`l4.java` 分发 deeplink/小程序/淘口令/H5。
- 通信与隐藏：上报域名 `report.idazhe.net`、`tongji.oozk.cn`；日志过滤器隐藏裸 IP `118.89.189.246`；**SSL 校验绕过**（HostnameVerifier 恒 true + 自定义 TrustManager，q3.java）。
- 静默装插件：内置伪装 `detn.mp3` 的 APK，运行期释放 `text.apk` 并触发 INSTALL_PACKAGE（w1.java:129-166、243-271）。
- 截屏上报：`a3.java` 截屏 → 裁剪 → JPEG q20 → Base64 → api/sys_pic；每日心跳 + C2 下发 AccessiblityModel（约 45 字段）。
- **后续修正（重要）**：`HomeKeyReceiver` 是空壳，`m1.java` 才动态监听熄屏/系统对话框；acse **未发现** `startForeground`/`AlarmManager`/`JobScheduler`/`BOOT_COMPLETED` 保活，`StartProcreeService` 也是空壳；`performGlobalAction(8)` = **锁屏**（GLOBAL_ACTION_LOCK_SCREEN）而非 HOME（配 force-lock + b4.java 锁屏悬浮层）。

### 4.4 主业务调用链（实锤/强推断）
1. **电商拉起**：首页商城 Banner 用户点击拉起 taobao://（bannerType=4）/ jdMobile://（bannerType=3）——HomeFragment.java:146-231，属 CPS 导购、非后台静默。
2. **指纹上报闭环**：uniqueCode = MD5(android_id→UUID[兜底IMEI] + 百度联天 LH.getId)，随每个请求头（y/c.java:210-219）；域名经 native Transform.k 解密。
3. **native 鉴权链**：每请求拦截器生成 appId/appSecret/sign（y/c.java:244-287）；人脸/跑步经 Transform.s 加密上传。
4. **自启动**：主程序无 BOOT_COMPLETED/电源类动态注册，JPush enableAutoWakeup(false)；主程序自启动未实锤。
5. **SecretActivity**：exported=true 无权限"切服+任意用户免密登录"后门，8 UUID 白名单与 MD5 格式不一致疑似失效（事实+推断）。

### 4.5 第 8 轮新增：native 入口映射与 SO 排除（`体适能_脱壳取证_native入口映射.md`）
- **7 个 acse Activity 的 native onCreate 全部静态不可判定**（ExcessActivity/SeedWebViewActivity/SeedingLoadingActivity/TransparentGreenActivity/WXActivity/WhiteActivity/AccessibiltyTsnPermissionGreenActivity），interface11 壳索引 ID 逐一记录（如 ExcessActivity ID=9579(0x256b)，static{} 行 7-8）。
- interface11 装载链：`StubApp.java:181` native 声明；attachBaseContext 611-855；`c="libjiagu"` 28-29；libjiagu.so:702、_a64:815、_x86:793、_x64:767、_mips:749；System.load 782/830；`/.jiagu/` 目录 :715。
- **libjgdtc.so 运行时生成、磁盘不存在**（DtcLoader.java + find 零命中）；`libjiagu_a64.so` 段头损坏（nm 报 SHT_NULL）、dynsym 仅 2 空符号。
- **43+1 SO 排除表：0 个 acse 候选**（86 个 SO strings 扫 `com/acse` 0 命中、无 `Java_com_acse*` 符号；libX86Bridge.so 仅导出 `Java_com_stub_StubApp_interface13`）；SO 分类：41 第三方 / 1 壳 / 1 已映射（libtsnsecret）/ 0 未知。
- 8 处 loadLibrary 全为第三方（easyar/jiguang/baidu×4/amap/datatransport）；**com/acse 无任何 loadLibrary**。

### 4.6 第 8 轮新增：URL 复核与 schoolUrl 链
- acse URL 表 10 条逐条 grep 复核**零漂移**、清单封闭（19 明文 / 10 端点 / 3 个 ss/ 路径 / 4 个 idazhe 子域）；全树唯一表外明文 = 百度人脸 SDK 私有 IP 测试端点 `http://10.138.32.176:8518/api/v3/person/verify_sec?appid=7758258`（SecRequest.java:6，仅备注）。
- schoolUrl 链复核：cap_4 `b.java` M()=385-422、密文 `05dbfd8c595b3687f8351745f27c449b`=:392、:393 l() → b0/b.java:161-168 → Transform.k ✅；retrofit/b.java:28-36 同密文 + 2 个新密文（`7ff944758843f909e729065961954713`、`f16f7cfccc6d82a3a6ae248da4d16a1d`）。
- **结论维持**：落地 URL 由服务器模型字段（spop_link/origin_url/tkl_url）动态下发，Java 层无明文（acse.ottn.md:317 措辞已细化："业务基址(schoolUrl)在 native 侧解密、落地 URL 由服务器字段下发"）。

---

## 5. 文件索引

### 5.1 根目录报告（详见 `文档目录.md`）
| 文件 | 内容 |
|---|---|
| `文档目录.md` | ★全项目索引（脚本/TXT/报告/第8轮日志/第9轮方案） |
| `AGENTS.md` | ★仓库指南：范围/当前状态/文件索引/避坑指南/规范 |
| `HANDOFF.md` | ★本文件（唯一交接文档） |
| `README.md` / `reverse-analysis.md` | 项目说明 / 第一轮分析（RSA 公钥全文、41 个 API 端点） |
| `体适能APP违法控诉书.md`、`体适能_不合规披露报告.md`、`体适能APP控诉_流媒体版.md` | 法律分析/披露报告（含法条标注补充版） |
| `体适能_脱壳取证_acse.ottn.md` | ★acse 灰产 SDK 深度取证（含第 317 行措辞细化） |
| `体适能_脱壳取证_无障碍与保活机制.md` | ★acse 无障碍滥用 + 防杀保活（含修正） |
| `体适能_脱壳取证_业务调用链.md` | ★主业务调用链（电商拉起/指纹/native 鉴权/SecretActivity） |
| `体适能_脱壳取证_native入口映射.md` | ★第 8 轮：7 Activity native 入口映射 + 43+1 SO 排除表 + URL 复核 |
| `libjiagu逆向技术报告.md` | ★360 加固运行时逆向（魔改 RC4/硬编码密钥/VMP） |
| `unidbg动态验证报告.md` | ★unidbg 三用例动态证据 + 补环境要点 |
| `密钥与算法证据清单.md` | 全部密钥/算法证据（含第 7 轮动态验证节） |
| `设备指纹SO分析.md`、`assets深挖分析.md`、`深挖补充证据.md` | SO/资产/补充深挖 |
| `第8轮_静态取证计划_修订版.md` | 第 8 轮修订版计划（10 条） |
| `第9轮_动态取证方案_acse_native实现定位.md` | ★第 9 轮方案（**本轮将更新为可执行版**；AVD 扫描授权已获但暂缓执行） |
| `GitHub公开前敏感信息分级清单.md` | 公开仓库前脱敏清单（当前为私有备份未脱敏） |
| `无Root脱壳实操手册.md`、`真机脱壳完整手册.md`、`小米15+MuMu脱壳执行计划.md`、`脱壳与解密分析.md`、`jiagu_脱壳进度.md`、`本轮工作总结_脱壳攻坚与能力测试.md` | 历史过程文档 |

### 5.2 脚本（根目录 + tsn/ + dsh-vm/）
- AXML/dex：`axml_decode.py`、`probe_dex_structure.py`、`probe_blob_cipher.py`、`decode_jiagu_meta.py`（第 8 轮已修：`DEFAULT_PATH` + `sys.argv[1]` 覆盖，本机默认 cap_0）。
- SO：`so_recon.py`、`disasm_so.py`、`key_hunt.py`、`global_xref.py`（需 pyelftools/capstone，**本机缺失**，见 §7）。
- 资产：`tsn/scan_assets.py`、`tsn/analyze_czl.py`、`tsn/czl_records.py`、`tsn/czl_keyfirst.py`、`tsn/wbsafe_strings.py`。
- 报告：`replace_law_refs.py`、`md_to_docx.py`。
- 脱壳：`dsh-vm/frida/dump_dex.py`(.js) ★最终可用；`memscan.py`、`force_load.py`、`anti_detect.js`、`capture_dex.js`（留档，不可用）。

### 5.3 dsh-vm/ 产物
| 路径 | 内容 | 是否入库 |
|---|---|---|
| `dsh-vm/dumps/dexcap/` | 14 个内存 dump dex | ✅ 入库 |
| `dsh-vm/dumps/jadx_out/` | cap_0/1/2/3/4/5/6/7/8/9 反编译源码（第 8 轮补齐 8 个 cap，共 10 个目录） | ✅ 入库（提交 64207a7） |
| `dsh-vm/logs/` | unidbg_run4.log、jadx_cap_*.log、round8_*.md\|txt（SHA 清单/工具链/smoke/汇总/verify） | ✅ 入库 |
| `dsh-vm/frida/` | dump_dex.py + frida-server + classes.txt | ✅ 脚本入库，frida-server 二进制不入 |
| `dsh-vm/base.apk` | 原版包 132MB | ❌ 超 GitHub 100MB，留本地 |
| `dsh-vm/cert_xiaowei.der/.pem` | XIAOWEI 证书（891B） | ✅ 入库 |
| `dsh-vm/tools/`、`sdk/`、`maven/`、`pyvenv16/`、`avd-home/` | jadx-1.5.1 / SDK / Maven / frida 环境 / AVD | ❌ 可重建，忽略 |

### 5.4 证据输入（保持不变，勿覆盖）
`AndroidManifest.xml`、`classes.dex`、`res/`、`assets/`、`lib/`（43 个 SO ×2 ABI）、`adjars/`。

### 5.5 git 状态
- 提交历史：`13a9a21` 控诉书 → `0e17139` README rename → `205bc90` 初始化备份 → `64207a7` 第 8 轮静态取证收尾（19787 文件，含 8 个 jadx_out 目录 + round8 日志 + 3 份新报告 + 3 个修改文件）。
- 工作区当前应干净。规则：提交主题用简短中文；冲突时**源码为准**；不要提交凭据/私钥/个人数据。

---

## 6. 环境要点与避坑指南（重踩过的坑，别重踩）

| 项 | 结论 |
|---|---|
| 模拟器运行位置 | **只能从 APFS 的 Desktop 副本（本工作区）跑**；exFAT 卷会导致 QEMU 静默卡死（日志停在 Found systemPath） |
| exFAT 备份 | **已弃用**（用户 2026-08-15 指示"不用管 exFAT 备份了"）；`ditto` 在 exFAT 报 Invalid argument，必须用 `cp`；且当前沙箱（workspace-write）拒绝 exFAT 写入、用户拒绝提权 → 别再尝试 |
| 360 反 hook | 任何 frida hook 都会崩（DisableVerifier SIGSEGV）→ 动态手段只能无 hook：logcat/抓包/内存扫描 |
| frida 版本 | 17.17.0 的 Java bridge 不可用（"Java is not defined"）→ 用 pyvenv16（frida 16.7.19）+ frida-legacy-compat |
| jadx | **根目录 `tools/` 已损坏**（zip 校验失败）→ 用 `dsh-vm/tools/bin/jadx` 1.5.1；360 混淆必须 `-m fallback`（simple 模式 exit 1）+ `-Duser.home=$PWD/dsh-vm/tools/jadx-home`（绕过 ~/Library 沙箱）；合规要求 `-j 1` 单线程、按 cap 顺序执行 |
| 子代理 bash 超时 | **子代理 bash 有 60 秒硬超时**：大体积 `git add`/批量 jadx 等操作会被杀（表现为子代理"卡死"）→ 这类操作必须在**父 shell** 用更长的 `timeoutMs` 执行 |
| 沙箱与审批 | 当前 DSH 文件策略 workspace-write（仅工作区可写）；exFAT 等外部路径需提权（用户可拒绝，被拒即放弃）；子代理无权提权 |
| 模拟器关机 | `adb shell reboot -p`（guest 关机 → 模拟器自动退出；`adb emu kill` 已不可用），用毕必须关，否则占 7GB 内存 |
| AVD 配置 | avdmanager 有 bug（hwMap is null）→ 手写 `tsn30.ini` + `tsn30.avd/config.ini`（模板在 `avd-home/.android/avd/`） |
| `~/.android` 写入 | 被沙箱拦截 → `HOME=<可写目录>` + `ANDROID_SDK_HOME/ANDROID_USER_HOME/ANDROID_AVD_HOME`；主代理 adb 用 `/tmp/dshvm-home` |
| qemu dylib | 子进程直跑报 dyld 找不到 dylib → 带 `DYLD_FALLBACK_LIBRARY_PATH=<pkg>/lib64:<pkg>/lib64/qt/lib:<pkg>/lib64/gles_angle` |
| exFAT 解压嵌套 | sdk 包在 exFAT 解压产生嵌套路径（platform-tools/platform-tools/adb 等）；已弃用 exFAT，不再涉及 |
| write/edit 在 exFAT | 报 ENOTSUP → 曾用 bash heredoc 绕；已弃用 exFAT，不再涉及 |
| 工具链离线 | pyelftools/capstone 本机不可用且**离线装不了**（轮子缓存 0）→ SO 分析用自写 stdlib 解析器 + `strings`/`nm`/`otool`（capstone 缺口记录为工具阻塞） |
| macOS 无 timeout | 别用 `timeout` 命令（不存在）；用父 shell 的 timeoutMs |
| decode_jiagu_meta.py | 已修硬编码 Win 路径为 `DEFAULT_PATH`（cap_0 自动）+ argv 覆盖；输出 XOR 0xc6 索引表 + XOR 0x86 可读串 |

---

## 7. 工具链现状与阻塞

- **pyelftools / capstone 缺失且离线不可装**（系统 python3、dsh-vm/pyvenv、pyvenv16 均无；`~/Library/Caches/pip/wheels` 63 个 wheel 中 0 个 elftools/capstone）→ SO 工作 = 第 6 轮产物（recon_*/dis_*/设备指纹SO分析.md）+ 自写 ELF 解析器（纯 stdlib）+ strings/nm/otool；**capstone 反汇编缺口 = 工具阻塞**。
- **jadx**：`dsh-vm/tools/bin/jadx` 1.5.1 可用（根 tools/ 损坏）；`JADX_OPTS="-Duser.home=$PWD/dsh-vm/tools/jadx-home" dsh-vm/tools/bin/jadx -m fallback -j 1 -d <out> <dex>`。
- **unidbg**：0.9.9 + Maven 3.9.9（dsh-vm/maven/）可用，harness 已闭环。
- 第 8 轮验证：19/19 重哈希一致；8 个 cap jadx 全退出码 0（round8_verify.md）。

---

## 8. 下一步候选（按 2026-09-06 确认的执行顺序）

> **执行顺序**：**证据整理 → 投诉材料完善 → 第 9 轮方案文档更新**。第 9 轮 AVD 扫描已获用户授权但**暂缓执行**，待方案文档批准后进行。投诉材料**允许联网查公开资料**（隐私政策/备案状态/工商主体）。

### 8.1 证据整理（先行）

1. **交叉引用表**：新写 `证据索引_控诉书_披露报告_交叉引用.md`——以披露报告 §10（`体适能_不合规披露报告.md:671-730`）为锚点，逐条映射控诉书 10 章到证据文件:行号/偏移，标注证据级别与缺口。
2. **cap_12/13 噪音复检**：`dsh-vm/dumps/dexcap/cap_12_sz284.dex`（284B）与 `cap_13_sz96220.dex`（96KB）跑 `probe_dex_structure.py` + `strings` + jadx，结果写 `dsh-vm/logs/round9_noise_dex_recheck.md`。
3. **git 清理**：新增 `unidbg_harness/dependency-reduced-pom.xml` 建议进 `.gitignore`；删除 4 个已废弃文档（`体适能_新增不合规点与法条标注补充_替换后.md`、`小米15+MuMu脱壳执行计划.md`、`无Root脱壳实操手册.md`、`真机脱壳完整手册.md`）；未跟踪 `CLAUDE.md` 入库。提交前核对 `GitHub公开前敏感信息分级清单.md` 红线。

### 8.2 投诉材料完善

1. **联网查证公开资料**：隐私政策全文（boxkj.com / gxapp.iydsj.com / 应用商店）、全国教育App备案（`app.eduyun.cn`）、博星科技工商主体（`www.gsxt.gov.cn` → 爱企查/天眼查/企查查 → 官网页脚 ICP，补注册全称/住所/统一社会信用代码/法人/成立日期/ICP 备案号）。留存 HTML 快照到 `投诉材料/公开资料证据/`，写 `投诉材料/公开资料查证记录.md`。需登录/验证码则如实记录"无法在线核验"。
2. **正式投诉书**：新写 `投诉材料/正式投诉书_结构化版.md`——投诉人/被投诉人/事实清单（编号挂接交叉引用表）/违反法条（引用法条全称版逐条全文）/诉求/证据附件索引/递交渠道（12321/12377/工信部/网信办/属地通管局/教育主管部门）。
3. **隐私政策比对表**：新写 `投诉材料/隐私政策与SDK采集字段比对表.md`——6 家广告 SDK（穿山甲/广点通/百度广告/快手/倍孜/AdScope）+ 百度人脸 + 友盟/极光/高德 × 采集字段 │ 隐私政策是否披露 │ 裁决 │ 证据出处。
4. **措辞中性化**：新写 `体适能APP违法控诉书_中性化版.md`、重写 `体适能APP控诉_流媒体版.md`。按 `GitHub公开前敏感信息分级清单.md:65` 删除情绪定性词→事实化；泛化具体高校（"泥河"）；强定性词改"具备 X 能力，未取得动态行为证据"。**只删情绪词，保留路径/行号/组件名等硬证据**。

### 8.3 第 9 轮方案文档更新（本轮只做文档，不执行）

更新 `第9轮_动态取证方案_acse_native实现定位.md` 为可执行版：
- **授权状态**：标注"本地 AVD + 断网 + 无 hook 只读内存扫描"已获用户授权（暂缓执行，待本文档批准）。
- **静态先行**：修复 `libjiagu_a64.so` 段头（SHT_NULL）后重试 nm/objdump → 复用第 6 轮 recon/dis 产物交叉分析 → capstone 离线获取可行性（如实记录阻塞）。**静态穷尽后仍无结果才进入动态执行。**
- **动态执行计划（获批后执行）**：AVD 断网扫描（QEMU `-net none` 无网卡 + 系统内飞行模式 + 断网四验 + spawn-gated 无 hook SO 扫描 + 显式 `am start` 触发 7 个 acse Activity + JNI 注册表静态解析 + 多轮试错）。主路径无 hook（3a）；hook 路径（3b libart/libdl）需单独确认。
- **停止条件**：静态穷尽 + 动态 N 轮无产出 → 记录「未发现」结案，不强造证据。
- **环境核实记录**：`llvm-objdump`/`llvm-readelf` **不存在**（已核实）→ 反汇编仅靠 LLVM `nm -D`（能读 ELF）+ `strings` + 自写 stdlib ELF 解析器；`dsh-vm/dumps/dexcap/` 为**单层目录**（cap_12/13 直接在其下）。
- **需单独确认项**：`am start` 显式触发 7 个 Activity（属"启动 App"）；libart/libdl hook。

### 8.4 其他（非本轮）

- **若公开仓库**：先按 `GitHub公开前敏感信息分级清单.md` 脱敏，删除 HANDOFF/AGENTS 中的密钥/域名等敏感值（当前为私有备份，未脱敏）。
- **可选深挖**：cap_12/13 噪音 dex 复检已并入 8.1；动态行为观察（无 hook logcat 抓启动链，需授权启动）并入 8.3 动态执行计划。

---

## 9. 边界声明

全部工作本地沙箱完成：仅读代码、自存档；不登录、不访问生产接口、不主动请求线上服务、不重打包分发；提取的密钥/算法仅用于验证与取证记录。本仓库为私有备份用途。动态手段一律离线/无网络；启动 App、AVD、生产网络请求等均需用户显式授权。
