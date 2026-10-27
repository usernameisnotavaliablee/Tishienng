# 体适能 (com.bxkj.student) —— 设备指纹采集 / 反卸载 / 监控类 native SO 静态逆向报告

> 纯静态、离线分析。目标：博星科技「体适能」校园打卡 app，360 加固但 native SO 全明文。
> 工具：`tsn/so_recon.py`（ELF/符号/字符串侦察）+ `tsn/disasm_so.py`（capstone ARM64 反汇编，带 ADRP 字符串解析 + GOT 重定位还原）。
> 架构样本：`lib/arm64-v8a/`。日期：2026-05-31。
>
> 重要结论（先说）：**这六个 SO 内部全部没有硬编码任何回传域名 / URL / http 调用**（netscan 全 SO 仅命中编译器版本串里的 googlesource）。
> 即采集动作在 native 完成、结果回吐给 Java 层，**网络回传由各自 Java 层 SDK 负责**，不在 SO 内。下文每条结论均带「函数 / 字符串 / 偏移」作证。

---

## 0. 总览表

| SO | 大小 | 厂商归属 | 导出业务函数 | 采集字段 / 行为 | 手段 | SO内回传迹象 |
|---|---|---|---|---|---|---|
| libdevInfo.so | 280 KB | 倍孜 beizi 广告 | `getBootMark` / `getUpdateMark` | boot_id（开机随机UUID）+ /data/data 安装时间戳 | fopen + stat | 无 |
| libcommonV2DevInfo.so | 268 KB | adscope（岩鼠广告） | `getDevUpdateMark` | /data/data 安装时间戳 | stat | 无 |
| libumeng-spy.so | 539 KB | 友盟+ U-Zid(umzid) | `Spy.getNativeID/getNativeTag` + `callhoo.xpCy` | 生成友盟设备指纹 zid + Root/模拟器/Xposed/Substrate/QEMU 反作弊 | 读 ro.* 属性 / popen / fork / 读 /proc/self/{status,maps} / 检测特征文件；OLLVM 平坦化 | 无（友盟Java层回传） |
| libti-monitor.so | 115 KB | 快手 Kwai（KOOM/artti） | `JvmtiHelper.*` / `Agent_OnAttach` | **监控本APP自身**：内存分配/GC/线程栈/卡顿/崩溃栈 | JVMTI agent + xhook + unwindstack | 无 |
| libliantian.so | 100 KB | 百度 liantian（联天/移动安全风控） | `check_vendor` / `get_cpuid` / `get_vendor_drm` | **永久硬件指纹**：eMMC CID + SoC DRM cpuid | open `/dev/vmdrm0` + ioctl + `system()` 跑 `vm -c` 直写 MMIO 寄存器；读 `/sys/class/block/mmcblk0/device/cid` | 无 |
| libsgcore.so | 92 KB | 快手 Kwai 安全 core | `SGCore.getMagic` / `getClock` | 反作弊 token(magic) + 时间校验(clock)；具体设备字段被加密 | 读 system property + 加密字符串表；OLLVM 混淆 | 无 |
| libemulator_check.so | 10 KB | com.snail.antifake（开源） | `EmulatorDetectUtil.detect` / `my_sigaction` | 仅返回 isEmulator 布尔，不采集字段 | 自修改代码(SMC) icache 一致性探测 QEMU | 无 |

> 归类提醒：**libti-monitor / libsgcore / libemulator_check 不是设备指纹采集器**。
> - ti-monitor = 快手性能/稳定性监控（监控 app 自己，不是监控用户）。
> - sgcore = 快手安全风控 core（防作弊 token）。
> - emulator_check = 纯模拟器检测，返回布尔值。
> 真正"设备标识符采集"的是：libdevInfo、libcommonV2DevInfo、libliantian（外加 libumeng-spy 的 zid）。

---

## 1. libdevInfo.so —— 倍孜 beizi 反卸载指纹（boot_id + 安装时间）

- 厂商：导出符号前缀 `Java_com_beizi_ad_internal_utilities_DeviceInfo_*` → 倍孜 beizi 广告 SDK。
- 导入仅 `fopen / pthread_*`；无 openssl、无 socket、无 system。编译器 clang 9.0.8。

### 1.1 getBootMark @0x13ffc（size 368）—— 读 boot_id
证据（`dis_devInfo_bootmark.txt`）：
```
0x14020  add  x0, x0, #0xa70   ; -> 0x35a70 = '/proc/sys/kernel/random/boot_id'
0x1402c  bl   #0x13ed0          ; fopen 打开该文件
0x14050..0x14088 循环 w8<0x24(36)  ; 逐字节读取 boot_id（36字符的UUID）
0x140a8  add  x1, x1, #0xa90    ; -> 'java/lang/String'
0x140c0  add  x1, x1, #0xaa1    ; -> 'UTF-8'
0x140e0  add  x3, x3, #0xaae    ; -> '([BLjava/lang/String;)V'  → new String(byte[],"UTF-8")
0x140f0  mov  w8, #0x25(='%')   ; 过滤/替换字符（去掉'-'）
```
- 采集字段：`/proc/sys/kernel/random/boot_id`，内核每次开机随机生成的 UUID。
- 语义：同一开机周期内 boot_id 不变 → 用作「本次启动标识」，做会话级/短期设备关联与去重。

### 1.2 getUpdateMark @0x143ac（size 400）—— 读安装时间戳
证据（`dis_devInfo_updatemark.txt`）：
```
0x143d8  add  x0, x0, #0xac6   ; -> 0x35ac6 = '/data/data'
0x143e4  bl   #0x13e10          ; sub_13e10 = [GOT] stat   ← 见 dis_devInfo_sub13e10.txt
0x143fc  ldr  x9, [x8, #0x50]   ; 读 stat 缓冲区时间字段(+0x50)
0x14404  ldr  x10,[x8, #0x48]   ; 读 stat 缓冲区时间字段(+0x48)
                                ; → __u32toa 转十进制字符串(见PLT _ZNSt6__ndk16__itoa8__u32toaEjPc)
```
- `sub_13e10` 经 GOT 还原为 `stat`（`dis_devInfo_sub13e10.txt`：`ldr x17,[x16,#0xe10] ; -> [GOT] stat`）。
- 采集字段：对 `/data/data` 目录 `stat()`，取其时间字段（约 +0x48/+0x50，访问/修改时间秒+纳秒），格式化成数字串。
- 语义：`/data/data` 目录的创建/修改时间 ≈ **app 数据目录建立时间 = 安装时间**。即使卸载重装，可据此识别"是不是新装/重装"。

### 1.3 结论
**getBootMark + getUpdateMark = 倍孜 SDK 的 bootMark/updateMark 反卸载设备指纹对**：boot_id（开机标识）拼安装时间戳，无需任何权限即可生成可跨重装弱关联的设备标记。这是倍孜官方文档里的标准"防作弊/反卸载"标识。SO 内不回传，由倍孜 Java 层上报。

---

## 2. libcommonV2DevInfo.so —— adscope（岩鼠）安装时间指纹

- 厂商：JNI_OnLoad 动态注册到 Java 类 `xyz/adscope/common/v2/dev/info/DevSysMark`（字符串 @0x3519d 区 + recon 命中）→ adscope 广告（上海岩鼠）。
- 导出：`_Z16getDevUpdateMarkP7_JNIEnvP7_jclass` @0x138dc（C++ mangled，未额外混淆）。导入仅 pthread；编译器 clang 9.0.9。

### 2.1 getDevUpdateMark @0x138dc（size 500）
证据（`dis_commonV2_updatemark.txt`）：
```
0x13904  add  x0, x0, #0xb0   ; -> 0x340b0 = '/data/data'
0x13910  bl   #0x13740         ; sub_13740 = [GOT] stat  ← 见 dis_commonV2_sub13740.txt
0x13918  ldr  w0, [sp,#0x48] / ldr x20,[sp,#0x50]  ; 取 stat 时间字段
... 经 basic_string::append 拼成字符串 ...
0x139e0  blr  x8              ; env->NewStringUTF(...) 回吐 Java String
```
- `sub_13740` 经 GOT 还原为 `stat`（`dis_commonV2_sub13740.txt`：`ldr x17,[x16,#0xe38] ; -> [GOT] stat`）。
- 采集字段：与 beizi 完全同款手法——`stat("/data/data")` 取时间字段，格式化为安装时间指纹串。

### 2.2 结论
adscope 的 `getDevUpdateMark` = **安装时间反卸载标识**，技术与倍孜雷同（业内通用的"无权限 install-time 指纹"套路）。SO 内不回传。

---

## 3. libumeng-spy.so —— 友盟 U-Zid 设备指纹 + 第二套环境反作弊

- 厂商：`Java_com_umeng_umzid_Spy_getNativeID / getNativeTag / getNativeLibraryVersion` → 友盟+ U-Zid（umzid，统计/设备唯一标识）。另导出 `Java_com_support_callhoo_NativeMethodDef_xpCy`（"xp"=Xposed 检测命名空间，第三方壳）。
- 导入关键：`__system_property_get`、`fopen`、**`fork`**、**`popen`**、`read`、`fread`（`recon_umeng.txt`）→ 具备读系统属性 + 起子进程跑 shell 探测的能力。
- 代码强 OLLVM 平坦化：`getNativeID`@0x84cc、`xpCy`@0x42124 开头即 `adr/ldrsw/eor/br x4`（`blr x2`）计算跳转分发器（见 `dis_umeng_getNativeID.txt`、`dis_umeng_xpCy.txt`），线性反汇编只能看到分发头。**函数体被混淆，精确控制流需 unidbg 模拟或去平坦化，标注：需进一步反混淆。**

### 3.1 检测特征字符串全集（`recon_umeng.txt` + `str_umeng_full.txt`，rodata 无 null 紧凑排布）
- Root 路径/文件：`/data/local/xbin`、`/data/local/bin`、`/system/sd/xbin`、`su`；读 `/proc/self/status`、`/proc/self/maps`
- Hook 框架：`XposedBridge.jar`、`libsubstrate.so`（Cydia Substrate）
- 模拟器 socket / trace：`/dev/socket/geny`（Genymotion）、`/dev/socket/qemu`、`/sys/qemu_trace`
- 模拟器/QEMU 属性与库：`libGLESv1_CM_tian...`、`system/lib/egl/`、`ttVM_x86.rc`（天天模拟器 TiantianVM）、`ueventd.shamu.rc`、`init.svc.qemu-pr`、`qemu.sf.fake_camera`、`qemu.sf.lcd_density`、`ro.kernel.qemu.gles`、`ro.product.model`、`ro.product.name`
- 加密：`AES-128/192/256-ECB` 与 `-GCM`（OpenSSL EVP 名）→ getNativeID 在 native 内**对采集到的设备信息做 AES 加密**后再回吐 Java。

### 3.2 结论
- `Spy.getNativeID` = 友盟设备唯一标识（umeng zid / UMID）的 native 生成器：综合多项设备特征 + 上面的反作弊判定，AES 加密后返回。
- `callhoo.xpCy` + 上述字符串 = **第二套（独立于 snail.antifake 的）环境检测**：Root / Xposed / Substrate / Genymotion / QEMU / 天天模拟器 / 假摄像头。
- 采集字段：综合设备指纹（zid，具体明细因混淆未逐项拆出）+ 环境风险标志位。
- SO 内无域名；回传走友盟统计 Java SDK。

---

## 4. libti-monitor.so —— 快手 KOOM/artti 性能监控（监控本APP，非设备指纹）

- 归属：所有导出为 `Java_com_kwai_performance_stability_artti_monitor_JvmtiHelper_*`（`recon_timonitor.txt`）→ 快手 Kwai 开源性能稳定性套件（KOOM / artti = ART Tooling Interface = JVMTI）。
- 导入：`unwindstack::UnwinderFromJavaThread`（native 栈回溯）、`__system_property_get`、`open/opendir/readdir`、pthread；clang 12.0.8。

### 4.1 它监控什么（`str_timonitor_all.txt` 全字符串作证）
- 加载 JVMTI agent：`libopenjdkjvmti.so`、`loadTiAgent`、`ArtPlugin_Initialize`、`Could not load jvmti plugin`、`Agent_OnAttach`@0x18510。
- 内存/对象：`getObjectSize`、`alloc_obj::%s; size::%llu; stack::%s`、`Failure running GetObjectSize`、`JNI_getObjSize`@0x19480（→ KOOM 内存泄漏监控）。
- GC：`gc_start:%llu, end:%llu, dur:%llu`。
- 线程/栈/卡顿/崩溃：`threadDumpStr`、`threadState`、`fastUnwindStack`、`javaUnwindCost`、`nativeUnwindCost`、`GetStackTrace`、`(...)[Ljava/lang/StackTraceElement;`、`backtraces`。
- 类加载：`class_load:%s, len:%u`。
- 调试通道：`enableJdwp`@0x9338（字符串 `jvmti-jdwp` / `Jdwp Enabled` @0x23ff/0x2963，见 `dis_ti_jdwp.txt`）、`disableJdwp`、`SetJdwpAllowed successful`、`Jdwp Reset`。
- hook：`xhook_register/refresh/clear/enable_sigsegv_protection`（PLT inline hook 框架）。
- `__system_property_get` 只读 `ro.build.version.sdk`。

### 4.2 结论
**这是 APM（应用性能监控）/ 内存泄漏(KOOM) / 卡顿 / 崩溃栈采集 Agent，监控目标是本 app 自身的运行时**（内存分配、GC、线程栈、JVMTI 事件），**不采集任何设备标识符、无网络回传**。
唯一值得标注的"能力面"：它能**开关 JDWP 调试**（`SetJdwpAllowed`），即具备运行时调试通道控制——属性能调试用途，但客观上是一个可被滥用的调试开关。

---

## 5. libliantian.so —— 百度 liantian（联天）硬件级永久指纹采集 ★重点

- 归属：JNI_OnLoad @0x3434 注册到 Java 类 `com/baidu/liantian/jni/Asc`（字符串 @0x13faa，见 `dis_lt_jnionload.txt`）→ 百度 liantian（联天）移动安全/广告反作弊 SDK。（注：用户笔记里的"脸天"是音近误记，实为 **baidu liantian，非人脸**。）
- 导入：**`system`**、`open`、`opendir`、`read`、`readdir`、`fopen`、`__system_property_get`（`recon_liantian.txt`）。PLT 确认 `sub_12e0=[GOT]system`、`sub_12b0=[GOT]open`（`dis_lt_plt.txt`）。
- 导出：`check_vendor`@0x134ac、`check_vendor_v11`、`get_vendor_drm`@0x13024、`get_cpuid`@0x1380c、`vendor_encode_v11`/`vendor_decode_v1`/`vendor_decode_v11`、`vendor_do_fail`。

### 5.1 采集的硬件标识符
**(a) eMMC CID（闪存芯片永久序列号）** —— `recon_liantian.txt`：
```
/sys/class/block/mmcblk0/device/cid
/dev/block/platform
Serial
```
eMMC CID 是存储芯片出厂烧死的唯一 ID，**抹机/恢复出厂都不变**，是最强不可重置设备指纹之一。

**(b) SoC DRM cpuid（芯片级唯一 ID，经 /dev/vmdrm0）** —— `dis_lt_drm.txt` / `dis_lt_cpuid.txt`：
```
0x13064  open('/dev/vmdrm0', 2)             ; 打开厂商 DRM/TEE 设备节点
... ioctl 取版本/数据 ...
'drm: cpuid ( %08x%08x )'                    ; 读出 64-bit 芯片唯一ID
get_cpuid: '%08x%08x' 把 cpuid 格式化成16位hex串
vendor_decode_v1(...)                         ; 14字节定长编解码（'len(%d != 14) error'）
```

### 5.2 ★直接操作硬件寄存器（system 执行 `vm -c`）
`get_cpuid`/`get_vendor_drm`/`check_vendor` 通过 `system()`（`sub_12e0`）执行以下 shell（字符串作证）：
```
vm -c 'chmod 0666 /dev/vmdrm0'                       ; 放开设备节点权限
vm -c 'io -4 -w 0xff760000 0xffffffff'                ; 向物理地址 0xff760000 做32位MMIO寄存器写
vm -c 'echo "[ffffffc04d114cc0] mali_fence: signaled" > /dev/tty'  ; 伪造内核日志（反分析诱饵）
vm -c 'chmod 0600 /dev/vmdrm0'                       ; 复原权限
```
- `io -4 -w 0xff760000` = 直接读/写 SoC 的 MMIO 寄存器（特权操作），用于触发/读取芯片烧录的唯一 ID（vendor DRM/TEE key）。
- `mali_fence ... > /dev/tty` 那条是 **anti-analysis 诱饵**（伪造 GPU 内核日志混淆分析者）。
- `open /dev/mem` 字符串也在库内（`recon_liantian.txt`）→ 具备读物理内存意图。

### 5.3 结论
**libliantian 是百度 liantian（联天）的硬件级设备指纹采集 + 风控 SO**：采集 eMMC CID 与 SoC DRM cpuid（均为不可重置永久硬件 ID），并通过 `system()` 调 `vm` 工具直写 MMIO 寄存器 / 操作 `/dev/vmdrm0` 来榨取芯片级唯一标识，配 14 字节定长编码混淆。这是本批里**侵入性最强**的采集手段。SO 内无域名，回传走百度 SDK Java 层。
（注：`vm`/`io` 多为带 root 时才成功的特权命令，无 root 大概率失败回退，但意图明确。）

---

## 6. libsgcore.so —— 快手 SGCore 安全/风控 core（设备字段被加密）

- 归属：`Java_com_kwai_sgcore_SGCore_getMagic`@0x44f0、`getClock`@0x3d58 → 快手 Kwai 安全（Security Guard）core。
- 导入：`__system_property_find` + `__system_property_get`、`fopen`、`sscanf/strtok/strstr/strcasecmp`（`recon_sgcore.txt`、`str_sgcore_all.txt`）。
- 反混淆状态：`getMagic`/`getClock` 均为 OLLVM 平坦化分发器（`adr x1 / subs / br x9`，见 `dis_sg_magic.txt`、`dis_sg_clock.txt`），**函数体混淆**；rodata 字符串表被 XOR 加密（满屏 `did8eie8B`、`fif8gig8`、`bib8cic8!` 等乱码）。明文残片仅：`illegaldescriptor`、`java/lang/String`、`([BLjava/lang/String;)V`（返回加密 byte[]）、`sen enter source:`、`%ld::%ld`、`Vuz4fCHxn1CO`、`quajdsfjasodfue`、`ro.build.version.sdk`。

### 6.1 结论（部分定性）
- 定性：快手系（kwad 广告/快手 SDK）的**安全风控 core** —— `getMagic` 生成防作弊签名 token、`getClock` 做服务器时间校验/防重放。
- 采集字段：会读 system property（`__system_property_find/get`）并解析文件（sscanf/strtok），但**具体采集哪些字段藏在 XOR 加密字符串表里、且符号被 OLLVM 混淆**。
- **标注：符号/字符串被混淆，精确字段清单需进一步去混淆或 unidbg 动态跑出。** Not 人脸、Not 单纯指纹采集，是综合安全 core。SO 内无明文域名。

---

## 7. libemulator_check.so —— snail.antifake 自修改代码反模拟器（10KB）

- 归属：`Java_com_snail_antifake_jni_EmulatorDetectUtil_detect`@0xc18、`my_sigaction`@0xb3c、`load`@0xb68 + 全局 `asmcheck/old_handlers/handledSignals/a`（`recon_emucheck.txt`）→ 开源库 com.snail.antifake。导入仅 `fopen`。clang 8.0.7。

### 7.1 手段 = SMC（自修改代码）icache 一致性探测
证据（`dis_emu_detect.txt`、`dis_emu_load.txt`、`dis_emu_sigaction.txt`、`dis_emu_shellcode.txt`）：
1. **装信号处理器**：`load`/`detect` 先对信号 11(SEGV)/6(ABRT)/8(FPE)/4(ILL)/7(BUS) 调 `my_sigaction`（`add x2,x19,#0x20/0x40/0x60/0x80` 五次 `bl my_sigaction-helper`），探测崩溃时打 `'Crash detect  signal %d'` 日志（tag `'lishang'`）。
2. **mmap RWX 页**：`mmap(0, len, PROT=7(RWX), MAP=0x22(PRIVATE|ANON), -1, 0)`（`0xcc8` 处）；失败则 `fopen('/dev/zero','w+')`（@0xf3a/@0xf44）再 `mmap(...,PROT=7,flags=2,fd)` 兜底。
3. **拷贝并执行 shellcode**：把 `asmcheck`（@0xf68，已 dump）拷进 RWX 页，`blr` 调用。
4. **shellcode 自身改自己**（`dis_emu_shellcode.txt`）：循环里 `str x1,[x3]` 把数据写回自己 0xf84 处的指令流再重复执行——真 ARM 硬件因 i-cache 与 d-cache 不一致会得到一种结果；QEMU/二进制翻译（模拟器）会立即让改写生效 → 返回值不同。`detect` 末尾 `cmp w8,#1; cset w0,eq`（ret==1→真机；走 0xe4c 的 `mov w0,#0xa` 兜底分支→模拟器）。

### 7.2 结论
**纯 CPU 行为反模拟器**：靠自修改代码的指令缓存一致性差异区分真机/QEMU。**不采集任何设备字段、不读属性文件、无网络**，只返回 `isEmulator` 布尔。（snail.antifake 里基于 qemu 属性/geny socket 的文件特征检测在其 Java 层，native 这部分只做 CPU 探测。）

---

## 8. 取证文件索引（均在 `C:\Users\Administrator\Downloads\tsn\`）

| 文件 | 内容 |
|---|---|
| recon_devInfo.txt / recon_commonV2.txt / recon_umeng.txt / recon_timonitor.txt / recon_liantian.txt / recon_sgcore.txt / recon_emucheck.txt | 各 SO 的 ELF/符号/字符串侦察 |
| dis_devInfo_bootmark.txt / dis_devInfo_updatemark.txt / dis_devInfo_sub13e10.txt | beizi getBootMark/getUpdateMark + stat 还原 |
| dis_commonV2_updatemark.txt / dis_commonV2_sub13740.txt | adscope getDevUpdateMark + stat 还原 |
| dis_umeng_getNativeID.txt / dis_umeng_xpCy.txt / dis_umeng_getNativeTag.txt / str_umeng_full.txt | 友盟 zid + 反作弊（OLLVM 头 + 特征串） |
| str_timonitor_all.txt / dis_ti_jdwp.txt | 快手 artti 监控全字符串 + JDWP |
| dis_lt_drm.txt / dis_lt_cpuid.txt / dis_lt_checkvendor.txt / dis_lt_jnionload.txt / dis_lt_plt.txt / str_liantian_full.txt | 百度 liantian 硬件指纹 + system/open 还原 |
| dis_sg_magic.txt / dis_sg_clock.txt / str_sgcore_all.txt | 快手 sgcore（混淆，部分定性） |
| dis_emu_detect.txt / dis_emu_load.txt / dis_emu_sigaction.txt / dis_emu_shellcode.txt | snail.antifake SMC 探测全链 |
| netscan_all.txt | 六个 SO 的域名/URL/字段名扫描（结论：均无回传域名） |

> 未拆净/需后续：libumeng-spy 的 getNativeID 函数体、libsgcore 的 getMagic/getClock 字段清单——均因 OLLVM 平坦化 + 字符串加密，纯静态线性反汇编不足，需 unidbg 模拟执行或去平坦化。已在对应章节标注。
