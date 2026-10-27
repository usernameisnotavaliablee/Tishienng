# 体适能逆向取证工作区（TishinengReversal）

> 校园体育打卡 App **`com.bxkj.student`（"体适能"）** 的 Android APK 逆向取证工作区 —— **私有备份仓库**。

本仓库不是可编译的 Gradle 应用，而是对 `com.bxkj.student` APK 进行**静态 + 动态逆向取证**的完整工作区：解包证据、分析脚本、反汇编输出、脱壳产物和取证报告全部归档于此，仅作个人备份与交接用。

---

## 一、项目概况

| 项 | 内容 |
|---|---|
| 目标应用 | 体适能（`com.bxkj.student`，博星科技），校园体育打卡 App |
| 分析性质 | 授权样本的本地逆向取证（静态 AXML/DEX/ELF + 动态 unidbg/模拟器/Frida） |
| 当前阶段 | 第 8 轮静态收官完成（2026-08-15），**核心取证目标全部完成**；第 9 轮动态方案已规划（未授权未执行） |
| 仓库用途 | 私有备份（不对外分发，不重打包，不主动请求线上服务） |

### 核心结论速览

- **脱壳成功**：360 壳下，采用 Frida 16.7.19 **无 hook 匿名内存扫描**（任何 hook 都会触发 `DisableVerifier` 崩溃），得到完整业务代码：`cap_4` = `com.bxkj.student`（7027 类）、`cap_8` = `com.acse`（6331 类），方法体完整。
- **native 鉴权闭环**：`libtsnsecret.so` 由 unidbg 0.9.9 本地 ARM64 模拟三用例通过，动态印证 AES-128-CBC、`auth()` 证书校验链、`generateAuthInfo` 字典序拼接。
- **灰产 SDK 实锤**：`com.acse.ottn` 是「无障碍自动点击 + 淘宝客/电商导流 + 广告刷量 + 插件静默安装」SDK，含 C2 任务、截图/位置上报、约 50 个目标 App（详见取证报告）。
- **主程序风险点**：淘宝/京东入口为用户点击触发的 CPS 导购；另有设备指纹上报、native 鉴权链、`SecretActivity`（exported 免密登录后门，8 个 UUID 白名单疑似失效）等风险。
- **第 8 轮静态收官**：14 cap + 8 输入 SHA-256 基线、8 个 cap 批量 jadx（全退出码 0）、7 个 acse Activity 的 native onCreate **入口映射**（interface11→libjiagu 壳，`libjgdtc.so` 运行时生成磁盘不存在，**静态不可判定**为合法结论）、43+1 SO 排除表 0 个 acse 候选、acse URL 表 10 条零漂移。

> 📄 完整法律分析见《[体适能APP违法控诉书.md](体适能APP违法控诉书.md)》，详细证据见下方报告索引。

---

## 二、目录结构

### 提交到仓库（证据与分析产物）

```
根目录
├── AndroidManifest.xml        # 解包后的二进制 Manifest（证据输入，不改动）
├── classes.dex                # 原版解包 DEX（43MB，证据输入，保留 v2/v3 签名）
├── res/  assets/  lib/        # 解包资源 / assets / native .so（证据输入）
├── adjars/  META-INF/  com/  kotlin/  junit/  org/  pinyindb/
├── *.py                       # 分析脚本：axml_decode / probe_dex_* / so_recon / disasm_so / key_hunt / global_xref …
├── recon_*.txt  dis_*.txt  str_*.txt   # SO 画像 / 函数反汇编 / 字符串提取
├── *.md                       # 报告、交接记录、索引（见下）
├── tsn/                       # assets 资源分析脚本与输出
├── unidbg_harness/            # unidbg native 算法验证工程（Java/Maven）
├── tools/                     # JADX（本地工具副本，已损坏，用 dsh-vm/tools/bin/jadx）
└── dsh-vm/dumps/              # ★脱壳产物：14 个内存 dump dex + jadx_out 反编译源码（cap_0..9）
    dsh-vm/frida/              # ★脱壳脚本（dump_dex.py 等）+ classes.txt
    dsh-vm/logs/               # 各阶段运行日志（unidbg / dump / jadx / round8_*）
    dsh-vm/cert_xiaowei.*      # XIAOWEI 证书 DER/PEM（891B，unidbg 鉴权用例）
```

### 被 .gitignore 忽略（可重建环境，不提交）

```
sdk/                  # Android SDK（cmdline-tools/emulator/platform-tools/system-images，4.6GB）
avd-home/             # AVD 模拟器镜像（1.1GB）
dsh-vm/sdk maven pyvenv* tools base.apk   # dsh-vm 内的可重建环境（模拟器 SDK、Maven、
                                          # Python venv、JADX、132MB 原包——超过 GitHub 单文件限制）
.ds_store / 日志 / out/ / __pycache__ 等
```

> 说明：`dsh-vm/base.apk`（132MB 原版包，SHA-256 已记录于交接文档与 `dsh-vm/logs/round8_manifest_sha256.txt`）超过 GitHub 100MB 单文件限制，只留在本地磁盘，其完整性校验值在文档中留存。

---

## 三、报告与证据索引

| 文档 | 内容 |
|---|---|
| [文档目录.md](文档目录.md) | ★所有脚本 / recon / dis_ / str_ / 第 8 轮日志的完整用途索引 |
| [AGENTS.md](AGENTS.md) | ★仓库指南：项目范围 / 当前状态 / 文件索引速查 / 经验教训与避坑指南 / 规范 |
| [HANDOFF.md](HANDOFF.md) | ★当前状态交接（唯一交接文档，2026-08-15 整合原三份 HANDOFF） |
| [体适能APP违法控诉书.md](体适能APP违法控诉书.md) | 面向公众的完整违法控诉书（法律条文精确到条） |
| [体适能_不合规披露报告.md](体适能_不合规披露报告.md) | 综合披露报告（含脱壳后整合章节） |
| [体适能_脱壳取证_acse.ottn.md](体适能_脱壳取证_acse.ottn.md) | ★灰产 SDK（com.acse.ottn）深度取证（含第 317 行措辞细化） |
| [体适能_脱壳取证_无障碍与保活机制.md](体适能_脱壳取证_无障碍与保活机制.md) | ★无障碍滥用 / 防杀保活机制代码级深挖 |
| [体适能_脱壳取证_业务调用链.md](体适能_脱壳取证_业务调用链.md) | 主业务调用链：电商拉起 / 指纹上报 / native 鉴权 / SecretActivity |
| [体适能_脱壳取证_native入口映射.md](体适能_脱壳取证_native入口映射.md) | ★第 8 轮：7 Activity native 入口映射 + 43+1 SO 排除表 + URL 复核 |
| [libjiagu逆向技术报告.md](libjiagu逆向技术报告.md) | ★360 加固运行时逆向（魔改 RC4 / 硬编码密钥 / VMP） |
| [unidbg动态验证报告.md](unidbg动态验证报告.md) | unidbg 三用例动态证据与复现命令 |
| [密钥与算法证据清单.md](密钥与算法证据清单.md) | 密钥 / 算法证据汇总 |
| [第8轮_静态取证计划_修订版.md](第8轮_静态取证计划_修订版.md) | 第 8 轮修订版计划（10 条） |
| [第9轮_动态取证方案_acse_native实现定位.md](第9轮_动态取证方案_acse_native实现定位.md) | 第 9 轮动态方案（未授权仅规划，含授权清单） |
| [GitHub公开前敏感信息分级清单.md](GitHub公开前敏感信息分级清单.md) | 敏感信息分级（本仓库为私有备份，仅存档） |

---

## 四、常用命令

```bash
python3 probe_dex_structure.py classes.dex      # 探测 360 加固 DEX 结构
python3 axml_decode.py AndroidManifest.xml > out/manifest_decoded.xml
python3 so_recon.py lib/arm64-v8a/libtsnsecret.so
python3 disasm_so.py lib/arm64-v8a/libtsnsecret.so --list 'auth|AES'
JADX_OPTS="-Duser.home=$PWD/dsh-vm/tools/jadx-home" dsh-vm/tools/bin/jadx -m fallback -j 1 -d out/jadx classes.dex   # 1.5.1；根 tools/ 已损坏
mvn -f unidbg_harness/pom.xml package             # unidbg 验证工程
```

依赖：SO 分析需 `pyelftools`，反汇编需 `capstone`（本机缺失且离线不可装，见 AGENTS.md 避坑指南）；JADX 处理 360 混淆代码必须用 `-m fallback` 并把 `user.home` 指到工作区内。

---

## 五、环境与交接要点

- 模拟器必须在 **APFS 的 Desktop 副本**（本工作区）运行；exFAT 卷会导致 QEMU 静默卡死（**exFAT 备份已弃用**）。
- 360 壳反 hook：任何 Frida Java/native hook 都会崩溃，动态手段只能无 hook（logcat / 抓包 / 内存扫描）。
- 子代理 bash 有 60 秒超时：大体积 git add / 批量 jadx 必须在父 shell 用长超时执行。
- 详细排坑与下一步见 [HANDOFF.md](HANDOFF.md)，仓库规范与避坑指南见 [AGENTS.md](AGENTS.md)。

---

## 六、边界声明

全部工作在本地沙箱完成：仅读代码、自存档；不登录任何账号、不对线上服务器发起主动请求、不重打包分发、不提交个人数据。动态手段（启动 App / AVD / 网络请求）一律需用户显式授权。本仓库为私有备份用途。
