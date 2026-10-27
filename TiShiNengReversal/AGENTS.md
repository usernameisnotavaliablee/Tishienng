# Repository Guidelines

## 项目范围与目录结构

本仓库是对校园体育打卡 App `com.bxkj.student`（“体适能”）的 Android APK 逆向取证工作区，不是可编译的 Gradle 应用。`AndroidManifest.xml`、`classes.dex`、`res/`、`assets/`、`lib/`、`adjars/` 是解包后的证据输入，应保持不变；根目录 Markdown/TXT 是报告、交接记录和分析输出，`文档目录.md` 是索引。根目录 Python 脚本负责 AXML、DEX、ELF/SO 和交叉引用分析；`tsn/` 分析资源，`unidbg_harness/` 验证 native 算法，`dsh-vm/` 保存模拟器、Frida、dump 和 JADX 产物，`tools/` 保存 JADX。

## 项目历史与当前状态

上一阶段从“真业务代码尚未脱壳”推进到第 7 轮收尾：原版 `base.apk` 已与解包 `classes.dex` 校验一致，且保留 v2/v3 签名。`libtsnsecret.so` 已由 unidbg 0.9.9 在本地 ARM64 模拟环境中三用例通过，动态印证 AES-128-CBC、`auth()` 证书校验链和 `generateAuthInfo` 字典序拼接。由于 360 壳会在任何 Frida Java/native hook 后于 `DisableVerifier` 崩溃，最终采用 Frida 16.7.19 的无 hook 匿名内存扫描，得到完整业务代码：`cap_4` 为 `com.bxkj.student`（7027 类），`cap_8` 为 `com.acse`（6331 类），方法体完整。模拟器必须在 APFS 的 Desktop 副本运行；exFAT 会导致 QEMU 静默卡死。

当前核心目标已完成。`com.acse.ottn` 已被代码级取证为无障碍自动点击、淘宝客/电商导流、广告刷量和插件静默安装 SDK，涉及 C2 任务、截图/位置上报和约 50 个目标 App。主程序的淘宝/京东入口是用户点击触发的 CPS 导购；设备指纹、native 鉴权和 `SecretActivity` 风险另见业务调用链报告。以后以最新交接文档和“后续深挖修正”章节为准：`HomeKeyReceiver` 是空壳，`m1.java` 才动态监听熄屏/系统对话框；acse 未发现 `startForeground`、`AlarmManager`、`JobScheduler` 或 `BOOT_COMPLETED` 保活，`StartProcreeService` 也是空壳；`performGlobalAction(8)` 是锁屏而非 HOME。

第 8 轮（2026-08-15）静态收官已完成：14 个 cap dex + 8 个输入文件 SHA-256 基线（`dsh-vm/logs/round8_manifest_sha256.txt`）；cap_0 管线确认纯壳（4 壳类：StubApp/Configuration/DtcLoader/a）；8 个 cap 批量 jadx 反编译（`-m fallback -j 1`，全退出码 0，产物 `dsh-vm/dumps/jadx_out/cap_{0,1,2,3,5,6,7,9}`，19/19 重哈希一致）；7 个 acse Activity 的 native onCreate 入口映射（`interface11`→libjiagu 壳，业务模块 `libjgdtc.so` 运行时生成、磁盘不存在，**静态不可判定**为合法结论）；43+1 SO 排除表 0 个 acse 候选；acse URL 表 10 条零漂移、清单封闭。产物已提交 git（`64207a7`）。第 9 轮 acse native 实现定位方案已有（`第9轮_动态取证方案_acse_native实现定位.md`），**本轮（2026-09-06）将更新为可执行版**；用户已授权"本地 AVD + 断网 + 无 hook 只读内存扫描"（**暂缓执行，待方案文档批准后进入**）；exFAT 备份已按用户指示弃用，Desktop APFS（本工作区）为唯一权威工作区。

## 分析、构建与开发命令

仓库没有顶层 Gradle 构建或自动化应用运行流程。常用命令：

```bash
python3 probe_dex_structure.py classes.dex
python3 axml_decode.py AndroidManifest.xml > out/manifest_decoded.xml
python3 so_recon.py lib/arm64-v8a/libtsnsecret.so
python3 disasm_so.py lib/arm64-v8a/libtsnsecret.so --list 'auth|AES'
JADX_OPTS="-Duser.home=$PWD/dsh-vm/tools/jadx-home" dsh-vm/tools/bin/jadx -m fallback -j 1 -d out/jadx classes.dex   # 1.5.1；根 tools/ 已损坏
mvn -f unidbg_harness/pom.xml package
```

SO 分析需要 `pyelftools`，反汇编还需要 `capstone`（本机均缺失且离线不可装，见避坑指南）。JADX 处理 360 混淆代码时必须用 `-m fallback`（simple 模式退出码 1），并把 `user.home` 指到工作区内；合规要求 `-j 1` 单线程、按 cap 顺序执行。派生文件放入明确的 `out/` 等目录，记录输入、命令和工具版本，不覆盖原始证据。

## 文件索引（速查）

完整索引见 `文档目录.md`；当前状态交接见 `HANDOFF.md`（唯一交接文档）。核心产物：

- **报告**：`体适能_脱壳取证_acse.ottn.md`（acse SDK 取证）、`体适能_脱壳取证_无障碍与保活机制.md`、`体适能_脱壳取证_业务调用链.md`、`体适能_脱壳取证_native入口映射.md`（第8轮：7 Activity 入口映射 + 43+1 SO 排除表 + URL 复核）、`libjiagu逆向技术报告.md`、`unidbg动态验证报告.md`、`密钥与算法证据清单.md`、`设备指纹SO分析.md`、`第8轮_静态取证计划_修订版.md`、`第9轮_动态取证方案_acse_native实现定位.md`（**本轮将更新为可执行版**）
- **计划产出（推进计划）**：`证据索引_控诉书_披露报告_交叉引用.md`、`投诉材料/`（正式投诉书_结构化版.md / 隐私政策与SDK采集字段比对表.md / 公开资料查证记录.md / 公开资料证据/）、`体适能APP违法控诉书_中性化版.md`
- **脚本**：`axml_decode.py`、`probe_dex_structure.py`、`probe_blob_cipher.py`、`decode_jiagu_meta.py`（DEFAULT_PATH + argv 覆盖）、`so_recon.py`、`disasm_so.py`、`key_hunt.py`、`global_xref.py`、`replace_law_refs.py`、`md_to_docx.py`；`tsn/` 资产分析脚本；`dsh-vm/frida/dump_dex.py`（★脱壳，无 hook 内存扫描）
- **脱壳产物**：`dsh-vm/dumps/dexcap/`（14 个 dex，cap_4=主业务 7027 类、cap_8=acse 6331 类）、`dsh-vm/dumps/jadx_out/cap_{0..9}/`（反编译源码，已入库）
- **日志**：`dsh-vm/logs/`（unidbg_run4.log、jadx_cap_*.log、round8_manifest_sha256.txt、round8_*.md）
- **证据输入（勿改）**：`AndroidManifest.xml`、`classes.dex`、`res/`、`assets/`、`lib/`、`adjars/`
- **环境（忽略/可重建）**：`dsh-vm/tools/ sdk/ maven/ pyvenv16/ avd-home/`、根 `sdk/ avd-home/`；`dsh-vm/base.apk`（132MB 超 GitHub 单文件限制，不入库）

## 经验教训与避坑指南

| 坑 | 教训 |
|---|---|
| 360 反 hook | 任何 Frida hook（Java/native）都会在 `art::Runtime::DisableVerifier` 崩溃 → 动态手段只能用无 hook：logcat/抓包/匿名内存扫描（`dump_dex.py`） |
| frida 版本 | 17.17.0 的 Java bridge 不可用（"Java is not defined"）→ 用 `dsh-vm/pyvenv16`（frida 16.7.19） |
| jadx | 根 `tools/` 已损坏（zip 校验失败）→ 用 `dsh-vm/tools/bin/jadx` 1.5.1；360 混淆必须 `-m fallback` + `-Duser.home=$PWD/dsh-vm/tools/jadx-home`；`-j 1` 单线程 |
| 模拟器 | 只能从 APFS Desktop 副本跑（exFAT 静默卡死）；用毕 `adb shell reboot -p` 关机否则占 7GB；avdmanager 有 bug（hwMap is null）→ 手写 `tsn30.ini`/`config.ini`；qemu 需 `DYLD_FALLBACK_LIBRARY_PATH` |
| exFAT | **已弃用**（用户指示）；`ditto` 不可用须 `cp`；当前沙箱拒绝 exFAT 写入且用户拒绝提权 → 不要再尝试 |
| 子代理 bash 60s 超时 | 子代理 bash 有 60 秒硬超时，大体积 `git add`/批量 jadx 会被杀（表现为"卡死"）→ 这类操作在父 shell 用长 `timeoutMs` 执行 |
| 沙箱/审批 | 当前 workspace-write 仅工作区可写；子代理无权提权；外部路径写入需用户审批，被拒即放弃、不绕过 |
| 工具链 | pyelftools/capstone 本机缺失且离线不可装（轮子缓存 0）→ SO 分析用自写 stdlib 解析器 + `strings`/`nm`/`otool`，capstone 缺口如实记录为工具阻塞 |
| macOS 无 timeout 命令 | 别用 `timeout`；用父 shell 的 `timeoutMs` |
| decode_jiagu_meta.py | 已修硬编码 Win 路径为 `DEFAULT_PATH`（cap_0）+ argv 覆盖 |
| git | 提交主题简短中文；冲突**源码为准**；不提交凭据/私钥/个人数据；超大文件（base.apk 132MB 等）不入库 |

## 推进计划（2026-09-06）

> 本小节为下一段工作的权威计划。执行顺序：**证据整理 → 投诉材料完善 → 第 9 轮方案文档更新**。第 9 轮 AVD 扫描已获用户授权但**暂缓执行**，待方案文档批准后进行。

### 1. 执行顺序与授权状态

| 事项 | 状态 | 说明 |
|---|---|---|
| 执行顺序 | **证据整理优先 → 投诉材料 → 第 9 轮方案文档** | 用户已确认 |
| 第 9 轮 | **只先出方案文档**（更新 `第9轮_动态取证方案_acse_native实现定位.md`），**本轮不执行 AVD 扫描** | 文档获批后再单独决定执行 |
| AVD 扫描授权 | **已获用户授权**：本地 AVD + 断网 + 无 hook 只读内存扫描 | **暂缓执行**，待方案文档批准 |
| 联网查公开资料 | **已获用户授权** | 仅用于投诉材料：隐私政策/备案状态/工商主体 |

### 2. 证据整理任务清单（先行）

- **E1 交叉引用表**：新写 `证据索引_控诉书_披露报告_交叉引用.md`。以披露报告 §10（`体适能_不合规披露报告.md:671-730`，函数地址级证据底座）为锚点，逐条映射控诉书 10 章 → 证据文件:行号/偏移 → 证据级别（实锤/强推断/未发现）→ 备注。控诉书某主张无对应行则标注"缺口"，供投诉阶段补证据。
- **E2 cap_12/13 噪音复检**：`dsh-vm/dumps/dexcap/cap_12_sz284.dex`（284B）与 `cap_13_sz96220.dex`（96KB）跑 `probe_dex_structure.py` + `strings` + jadx；确认无业务内容写入 `dsh-vm/logs/round9_noise_dex_recheck.md` 终结排除；发现新类升级复检。
- **E3 git 清理**：新增 `unidbg_harness/dependency-reduced-pom.xml`（Maven 副产物）建议进 `.gitignore`；删除 4 个已废弃文档（`体适能_新增不合规点与法条标注补充_替换后.md`、`小米15+MuMu脱壳执行计划.md`、`无Root脱壳实操手册.md`、`真机脱壳完整手册.md`）；未跟踪 `CLAUDE.md` 入库。提交前核对 `GitHub公开前敏感信息分级清单.md` 红线（不提交凭据/私钥/超大文件/完整密钥）。

### 3. 投诉材料完善任务清单

- **C1 联网查证公开资料**（可与证据整理并行）：隐私政策全文（boxkj.com / gxapp.iydsj.com / 应用商店）、全国教育App备案（`app.eduyun.cn`）、博星科技工商主体（`www.gsxt.gov.cn` → 爱企查/天眼查/企查查 → 官网页脚 ICP，补注册全称/住所/统一社会信用代码/法人/成立日期/ICP 备案号）。留存 HTML 快照 + URL/日期/SHA-256 到 `投诉材料/公开资料证据/`，写 `投诉材料/公开资料查证记录.md`。需登录/验证码则如实记录"无法在线核验"。
- **C2 正式投诉书**：新写 `投诉材料/正式投诉书_结构化版.md`——投诉人/被投诉人（引用 C1 工商信息）/事实清单（编号挂接 E1）/违反法条（引用 `体适能_新增不合规点与法条标注补充_法条全称版.md` 逐条全文）/诉求（下架整改/暂停强制推广/落实隐私政策/审计第三方 SDK 处理关系）/证据附件索引/递交渠道（12321/12377/工信部/网信办/属地通管局/教育主管部门）。
- **C3 隐私政策比对表**：新写 `投诉材料/隐私政策与SDK采集字段比对表.md`——6 家广告 SDK（穿山甲/广点通/百度广告/快手/倍孜/AdScope）+ 百度人脸 + 友盟/极光/高德 × 采集字段（代码证据）│ 隐私政策是否披露（对照 C1 原文）│ 裁决（披露/部分披露/未披露）│ 证据出处。
- **C4 措辞中性化**：新写 `体适能APP违法控诉书_中性化版.md`、重写 `体适能APP控诉_流媒体版.md`。按 `GitHub公开前敏感信息分级清单.md:65` 删除"灰产/特洛伊木马/帮别人刷单"等情绪定性词→事实化；泛化具体高校（"泥河"）；强定性词改"具备 X 能力，未取得动态行为证据"；流媒体版去 emoji 夸张定性、补"事实-推断分界"声明。**只删情绪词，保留路径/行号/组件名等硬证据**。

### 4. 第 9 轮方案文档更新要点（本轮只做文档）

更新 `第9轮_动态取证方案_acse_native实现定位.md` 为可执行版：
- **授权状态**：标注"本地 AVD + 断网 + 无 hook 只读内存扫描"已获用户授权（暂缓执行，待本文档批准）。
- **静态先行（执行顺序第一步）**：修复 `libjiagu_a64.so` 段头（SHT_NULL）后重试 nm/objdump → 复用第 6 轮 recon/dis 产物交叉分析 → capstone 离线获取可行性（如实记录阻塞）。**静态穷尽后仍无结果才进入动态执行。**
- **动态执行计划（获批后执行）**：AVD 断网扫描（QEMU `-net none` 无网卡 + 系统内飞行模式 + 断网四验 + spawn-gated 无 hook SO 扫描 + 显式 `am start` 触发 7 个 acse Activity + JNI 注册表静态解析 + 多轮试错）。主路径无 hook（3a）；hook 路径（3b libart/libdl 系统导出观察）需单独确认。
- **停止条件**：静态穷尽 + 动态 N 轮无产出 → 记录「未发现」结案，不强造证据。
- **边界清单更新**：重写约束映射表（已授权/需再确认/红线）。需单独确认项：`am start` 显式触发 7 个 Activity（属"启动 App"）；libart/libdl hook。
- **环境核实记录**：`llvm-objdump`/`llvm-readelf` **不存在**（已核实）→ 反汇编仅靠 LLVM `nm -D`（能读 ELF）+ `strings` + 自写 stdlib ELF 解析器；`dsh-vm/dumps/dexcap/` 为**单层目录**（cap_12/13 直接在其下）。

### 5. 关键风险

| 风险 | 等级 | 规避 |
|---|---|---|
| 断网突破（SLIRP 默认 NAT 出网；裸 IP C2 无需 DNS） | **最高** | 主方案必须 QEMU 无网卡（`-net none`）而非仅封 DNS；启动后先断网四验再扫描；扫描全程不开外发 socket |
| 360 壳对抗（抹魔数/反 frida/反模拟器） | 高 | 沿用 round-7 spawn-gated 无 hook 扫描；多时间点提前；只读不写；不 hook 壳代码 |
| 7 个 acse Activity 干净启动不触发 | 高 | 显式 `am start` + 主/子进程双扫；失败记录「未发现」而非强造证据 |
| 联网抓取遇反爬/验证码 | 中 | 多渠道备选；留存快照+检索词+日期；无法核验如实标注 |
| 输出文档再引入敏感信息 | 中 | 全部按 `敏感清单` 统一替换表处理；涉密字段用"证据附件（封存）"引用，正文不贴裸密钥 |
| 中性化改写丢失证据精度 | 中 | 只删情绪定性词；改写后 diff 复核 |
| 交叉引用表行号漂移 | 中 | 以当前披露报告实际行号为准；生成后 grep 复核 |
| R1 文档把执行边界写宽 | 低 | 需单独确认项明确标注，不默认纳入 |

---

## 编码、测试与证据规范

Python 使用 UTF-8、四空格缩进、标准库导入在前、`snake_case` 命名；报告保留既有中文文件名和 `recon_`、`dis_`、`str_` 前缀。没有统一 lint 或测试套件；修改脚本后用已知样本做 smoke test，检查退出码和输出，并与源二进制比对。报告必须区分“实锤、强推断、未发现”，尽量附文件路径、行号/偏移、命令和版本。

## 提交、协作与安全边界

提交主题使用简短、描述性的中文，例如 `补充 libtsnsecret 鉴权证据`。PR 应说明证据或流程变化、验证命令及重新生成的文件。
