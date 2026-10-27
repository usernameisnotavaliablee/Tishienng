# 第9轮 动态取证方案:acse native 实现定位(未授权,仅规划)

> 状态:仅规划,未执行。本文件不含任何动态执行结果;凡需"启动 App / 模拟执行 / 网络请求"的操作均待用户显式授权。
> 日期:2026-08-15

## 1. 目标与现状结论

**目标**:定位 7 个 acse Activity 的 native onCreate 实际行为与 acse 业务 native 实现,回答"acse 的 native 层到底做什么"。

**现状结论(承第 8 轮《体适能_脱壳取证_native入口映射.md》§3/§4,均为实锤级静态事实)**:

| # | 结论 | 证据性质 |
|---|---|---|
| 1 | 7 个 acse Activity(ExcessActivity / SeedWebViewActivity / SeedingLoadingActivity / TransparentGreenActivity / WXActivity / WhiteActivity / AccessibiltyTsnPermissionGreenActivity)的 onCreate 为 native,实现静态不可判定(合法结论,非证据缺失) | 实锤 |
| 2 | `com.stub.StubApp.interface11(int)` 为壳装载索引,实现在 libjiagu 壳内 | 实锤 |
| 3 | 二级业务模块 `libjgdtc.so`(由 DtcLoader.java 加载,硬编码回退 `/data/data/com.bxkj.student/lib/libjgdtc.so`)运行时生成、磁盘不存在 | 实锤 |
| 4 | `assets/libjiagu_a64.so` 段头损坏(nm 报 SHT_NULL),dynsym 仅 2 个空符号 | 实锤 |
| 5 | 43+1 SO 排除表:0 个 acse 候选;86 个 SO strings 扫 `com/acse` 0 命中,无 `Java_com_acse*` 符号 | 实锤 |
| 6 | 8 处 loadLibrary 全为第三方库 | 实锤 |
| 7 | tsnsecret 已 unidbg 闭环(AES-128-CBC / auth() / generateAuthInfo);cap_0 纯壳 | 实锤 |

即:acse 的 native 入口与业务 native 代码在当前静态产物中**不存在于磁盘**,只可能存在于 libjiagu 壳运行时内存(解密后)与 libjgdtc.so 运行时生成产物中。

## 2. 静态路径已穷尽清单

| 路径 | 工具 / 参数 | 结果 |
|---|---|---|
| cap dex SHA-256 清单 | 本地脚本 + hashlib | 14 个 cap + 8 个输入文件指纹已归档,供后续产物比对 |
| jadx fallback 反编译 | `dsh-vm/tools/bin/jadx` 1.5.1,`-m fallback -j 1` | 8 个 cap 反编译完成,退出码 0 |
| decode_jiagu_meta | 自写 stdlib 解析器 | XOR 0xc6 索引表 + 0x86 可读串已解码,壳元数据可用 |
| ELF 段头损坏分析 | 自写 stdlib ELF 解析器 + nm | `libjiagu_a64.so` SHT_NULL、dynsym 仅 2 空符号,静态不可进一步解析 |
| nm + strings + otool | 系统工具 | 全部 SO 扫描完成,无 acse native 符号 |
| 43+1 SO 排除表 | strings 全量扫描 | 0 个 acse 候选(86 SO 中 `com/acse` 0 命中,无 `Java_com_acse*`) |
| URL 复核 | grep 比对 | 10 行 URL 零漂移,网络面已固定 |

**结论**:静态可及路径已穷尽;继续推进的唯一出口是动态手段(需授权)或修复段头/引入新工具链(见 §5、§7)。

## 3. 剩余未知点

1. **libjiagu 运行时生成/解密算法**:业务 dex(含 acse 类)与 libjgdtc.so 在运行时如何被生成、解密、装载;算法与密钥未知。
2. **interface11 壳内实现细节**:`com.stub.StubApp.interface11(int)` 在 libjiagu 内的具体逻辑(索引→装载行为)。
3. **acse native onCreate 实际行为**:7 个 Activity 的 native onCreate 在被调用时执行什么(仅动态可见)。
4. **libjgdtc.so 内容**:DtcLoader 运行时加载的二级模块的真实代码与行为(磁盘不存在,仅运行时存在)。

## 4. 动态方案候选与约束映射表

| 候选方案 | 触碰的约束 | 需要的授权 | 可行性备注 |
|---|---|---|---|
| 授权真机 + Frida memscan | 违反"不启动 App"、可能触碰"不访问生产网络" | 用户显式授权"启动 App" | 已知 360 壳对 Frida Java/native hook 敏感(DisableVerifier 崩溃),仅 memscan 类无 hook 手段可考虑 |
| 无 hook 匿名内存扫描(复用第 7 轮方法) | 违反"不启动 App" | 用户显式授权"启动 App" | 第 7 轮已证明可行(得到 cap_4=com.bxkj.student、cap_8=com.acse),本轮可定向扫 libjgdtc.so 与 native onCreate 地址 |
| unidbg 模拟执行 libjiagu | 触碰"不启动 App"(模拟执行亦属运行壳代码)、可能触发壳内联网逻辑 | 用户显式授权(离线沙箱内模拟执行) | 复用 tsnsecret 的 unidbg 0.9.9 方法学;须强制离线阻断网络 |
| 模拟器镜像安装运行 | **违反"不用 AVD"** | 不可行(约束冲突) | 直接排除 |
| 任何发起生产网络请求的验证 | **违反"不访问生产网络"** | 不可行(约束冲突) | 直接排除,unidbg/内存扫描一律离线 |

**标注**:前两种(真机 Frida / 无 hook 内存扫描)需用户显式授权"启动 App";模拟器路径违反"不用 AVD";生产网络请求违反"不访问生产网络"——以上均在授权前不得执行。

## 5. 静态边界内替代路径(无需授权,可先行)

1. **修复 libjiagu_a64.so 段头后重试 nm/objdump**:段头 SHT_NULL 疑似被 360 壳破坏;尝试按 ELF 规范重建 section header 后重跑 nm/objdump,可能恢复符号表/重定位(纯静态、零风险)。
2. **capstone 离线获取可行性**:当前 capstone 缺失且离线不可装(见 §7);若能获得离线 wheel(如从本机其他环境复制),可对修复后 SO 做反汇编。**当前阻塞**。
3. **复用第 6 轮 recon_*/dis_* 产物交叉分析**:对已有 SO 分析产物做交叉比对,排查被遗漏的 acse 关联(如间接 JNI 注册、反射加载)。
4. **复用 tsnsecret 的 unidbg 方法学**:把已验证的 unidbg 0.9.9 沙箱方法迁移到 libjiagu 模拟(仍属 §4 动态范畴,需授权)。

## 6. 验收标准与授权清单

**验收标准**:定位 acse native onCreate 的真实实现(地址级/指令级证据)或给出可复现的动态取证产物(内存 dump + 反汇编 + 调用链),并在报告中区分"实锤/强推断/未发现"。

**需要用户显式授权的操作清单**:

| 操作 | 授权后做什么 | 预期产出 | 风险 |
|---|---|---|---|
| 真机启动 App + Frida memscan | 授权真机运行 App,memscan 定位 libjgdtc.so 与 7 个 native onCreate 地址,只读扫描不 hook | 运行时 SO dump、native 地址表、调用链 | 壳反调试崩溃;样本为第三方 SDK,需按取证边界处理 |
| 无 hook 匿名内存扫描(真机) | 复用第 7 轮方法扫描业务代码与 acse 内存 | 完整运行时镜像(类比 cap_4/cap_8) | 同上;扫描量大 |
| unidbg 模拟执行 libjiagu(离线) | 离线沙箱模拟 interface11 装载流程 | 解密后的 dex/SO 产物、算法与密钥证据 | 模拟不完整导致误判;须强制断网 |

未授权前:仅执行 §5 静态边界内路径。

## 7. 工具链阻塞(如实记录)

- **pyelftools / capstone 缺失且离线不可装**:系统 python3、dsh-vm/pyvenv、pyvenv16 均未安装,轮子缓存为 0,无网络安装途径。SO 分析因此退化为自写 stdlib 解析器 + strings/nm/otool(§2 已列)。
- **jadx 可用副本**:`dsh-vm/tools/bin/jadx` 1.5.1(根目录 tools/ 已损坏,zip 校验失败),参数 `-m fallback -j 1`。
- 上述阻塞不影响 §5 的段头修复路径,但限制深度反汇编能力。
