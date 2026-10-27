# 360 加固 libjiagu 静态逆向技术报告

> 对象：`assets/libjiagu_a64.so`（com.bxkj.student / 体适能 / 360 加固 arm64 运行时）
> 方法：纯静态逆向（自写 ELF 解析器 + capstone 反汇编 + 算法复刻 + 密码分析）
> 性质：自存档逆向研究，止于理解，不用于破解线上服务或重打包分发。
> 工具：Python 3.13 + capstone；产物记录见 `tsn/jiagu_脱壳进度.md`。

## 摘要

360 把 `libjiagu_a64.so` 的 **section header 表蓄意破坏**（节名全改成 `..dynamic`、类型/大小填垃圾），让 `readelf -S`、`nm -D`、IDA 自动分析全部失效。但 **program header 与 DYNAMIC 段完好无损**——本报告据此从零恢复了符号表，并逆出 libjiagu 的内部解密原语：**一个三处魔改的 RC4，密钥明文硬编码在文件里**。

这推翻了上一轮基于字符串扫描得出的"密钥全部在二级 SO、静态拿不到"的结论——至少 libjiagu **自身内部数据**的解密密钥是嵌死的。但真正的**业务 dex 正文（约 6.8MB 满熵加密）静态不可解**，因为它走的是另一条被 VMP 指令虚拟化 + 运行时内存生成的二级 SO + 运行时密钥派生保护的链——密钥信息论上不在磁盘。

两条结论并存，分别在 §2/§3（可逆的部分）和 §5（不可逆的部分）。

---

## 1. 损坏 ELF 的恢复方法

### 1.1 360 破坏了什么、保留了什么

| ELF 结构 | 状态 | 说明 |
|---|---|---|
| section headers (`e_shoff`) | **损坏** | 节名/类型/大小全是垃圾，常规工具失效 |
| program headers (`e_phoff=0x40`) | **完好** | 6 段，加载器必须靠它，无法破坏 |
| DYNAMIC 段 | **完好** | 动态链接必须靠它，含 SYMTAB/STRTAB/RELA |
| .dynsym / .dynstr | **完好** | 通过 DYNAMIC 指针可定位 |

关键认知：**凡是 Android 加载器运行时必须读的结构，加固都不能破坏**。section headers 只在静态分析/链接时用，运行时无关，所以成了 360 的破坏目标。绕过方法就是**只依赖 program headers 这条运行时必经之路**。

### 1.2 program headers（实测）

```
[0] LOAD       off=0x0      vaddr=0x0       filesz=0x1c0b8  R-X   ← 代码段(明文!)
[1] LOAD       off=0x1f770  vaddr=0x2f770   filesz=0xbdd3e  RW-   ← 数据段
[2] DYNAMIC    off=0x1fae0  vaddr=0x2fae0   filesz=0x1f0    RW-
[3] GNU_EH_FRAME / [4] GNU_STACK / [5] GNU_RELRO
e_entry=0x27f0  e_machine=183(AArch64)
```

vaddr→fileoff 映射：LOAD0 段 `vaddr == offset`（<0x1c0b8）；LOAD1 段 `fileoff = vaddr - 0x2f770 + 0x1f770`。

### 1.3 从 DYNAMIC 恢复符号表

DYNAMIC 段（off 0x1fae0）解析出：`SYMTAB=0x4b0`、`STRTAB=0xe10`、`STRSZ=0x478`、`SYMENT=0x18`、`RELA=0x1288`、`JMPREL=0x1c18`。据此遍历 `.dynsym` 恢复出 **20 个命名符号**（详见 §4），并解析 RELA 重定位表（含 R_AARCH64_RELATIVE 修正 init_array 指针）。

至此 IDA 打不开的库，已可被自写脚本完整反汇编。

---

## 2. 核心发现：内部解密原语 = 魔改 RC4

### 2.1 PRGA（密钥流，函数 @0x6740）

反汇编后识别为 RC4 的 PRGA，但**三处魔改**：

| 项 | 标准 RC4 | 本样本 |
|---|---|---|
| i 步进 | `i = (i+1) & 0xff` | **`i = (i+2) & 0xff`** |
| j 更新 | `j = (j + S[i]) & 0xff` | **`j = (j + S[i] + 1) & 0xff`** |
| 初始值 | `i=0, j=0` | **`i=3, j=5`** |

状态布局：S[256] 在缓冲区，`i` 存 `[buf+0x100]`、`j` 存 `[buf+0x101]`。输出 `out[n] ^= S[(S[i]+S[j]) & 0xff]`。

关键汇编证据（@0x6788 起）：
```
add  w11, w11, #2      ; i += 2
strb w11, [x2, #0x100]
...
add  w10, w12, w10
add  w10, w10, #1      ; j += S[i] + 1
...
eor  w10, w11, w10     ; out ^= keystream
strb w10, [x0]
```

### 2.2 KSA（密钥调度，函数 @0x6618）

标准 RC4 KSA，S-box 用常量表初始化（实测该表 = **恒等排列 0..255**，即标准初始化）：
```
j = (j + key[ki] + S[i]) & 0xff
swap(S[i], S[j])
ki = (ki + 1) % keylen        ; 用 sdiv/msub 显式取模(@0x6704)
```

### 2.3 硬编码密钥

`DynCryptor::__arm_c_0`（@0x74b8）构造 10 字节密钥：8 字节取自常量地址 `0x18a04`，尾部拼接立即数 `0x7456`（`mov w9, #0x7456` @0x750c）：

```
密钥 = 76 56 57 34 23 91 23 53 56 74   (10 字节)
```

这是**明文嵌死在 .rodata 里的**，推翻了"密钥只存在于运行时二级 SO"的旧结论——至少 libjiagu 内部自解密这一层静态可得。

### 2.4 Python 复刻（可独立运行验证）

```python
def jiagu_rc4(data, key):
    S = bytearray(range(256)); j = 0; ki = 0
    for i in range(256):                       # KSA
        j = (j + key[ki] + S[i]) & 0xff
        S[i], S[j] = S[j], S[i]
        ki = (ki + 1) % len(key)
    out = bytearray(data); i = 3; j = 5        # PRGA, 初始 i=3,j=5
    for n in range(len(out)):
        i = (i + 2) & 0xff                     # i += 2
        j = (j + S[i] + 1) & 0xff              # j += S[i] + 1
        S[i], S[j] = S[j], S[i]
        out[n] ^= S[(S[i] + S[j]) & 0xff]
    return bytes(out)

key = bytes([0x76,0x56,0x57,0x34,0x23,0x91,0x23,0x53,0x56,0x74])
```

---

## 3. dex 容器结构测绘

`classes.dex`（45MB）实为空壳（4 个壳类），从偏移 **0x7140** 起是 360 的自描述加密容器。三层结构：

| 区域 | 偏移 | 内容 | 保护强度 |
|---|---|---|---|
| 容器头 | 0x7140 (12B) | magic=0x01006871、totallen=0x02b3953d(≈夹带区长)、field3=0x4dc | 明文 |
| 元数据索引 | 0x715c (~1KB) | 类名索引表 | **XOR 0xa6（已破）** |
| 业务 dex 正文 | 多块 | 真 `com.bxkj.student.*` 代码 | **满熵加密（不可解）** |
| 填充区 | 占大头~36MB | 0x0f/0x3c/0x1e/0x2d 主导，疑对齐填充 | 低熵 |

### 3.1 元数据区破解（XOR 0xa6）

对索引区做单字节 XOR 0xa6 后解出明文：
```
7418FDAAB59B1C0C            ← 360 appid (= assets/.jgapp 内容)
com.bxkj.student.splash ... ← 类名(大小写交替,还叠了一层 0x20 位混淆)
activity / name ...
```
用已知明文 `7418FDAAB59B1C0C` 反推该区 keystream，得全 0xa6 常量，证明此区就是单字节 XOR，弱保护。

### 3.2 业务 dex 正文（满熵，不可解）

逐 64KB 算香农熵：真正熵≈8.0 的强加密块共 107 个，**总量约 6.8MB**——正是合理的业务 dex 体积，集中在 0x7140 起约 832KB 连续区及若干零散块。

---

## 4. libjiagu 符号与架构

恢复出的 20 个命名符号里，关键信号：

| 符号 | 含义 |
|---|---|
| `_ZN10DynCryptor9__arm_c_0Ev` | 解密分派入口（调用魔改 RC4） |
| `interpreter_wrap_int64_t/float/double` | **360 VMP 指令虚拟化**特征 |
| `JNI_OnLoad` / `__arm_a_1` | 壳入口 |

字符串扫描得到的架构线索：
```
Protect_enc.so / libjiagu_vip_enc.so / libijmDataEncryption_enc.so   ← 二级加密SO
RMUTGF_KEY                                                            ← 内部密钥常量名
JIAGU_ENCRYPTED_DEX_NAME / JIAGU_FILE_PATH / JIAGU_HASH_FILE_NAME     ← 配置项
```

---

## 5. 为什么业务 dex 正文静态不可解（信息论结论）

把所有静态攻击都试过，全部负结果：

| 攻击 | 结果 |
|---|---|
| 魔改 RC4 + 硬编码 key 直解正文 | 乱码 |
| RC4 keystream 滑窗找内嵌 ELF/dex/zip | 0 命中 |
| XOR 周期自相关 | 无周期（最高相关 4.1%） |
| 单字节 XOR/ADD 全 256 枚举 | 仅元数据区有效，正文无效 |
| AES S-box / Te0 表特征匹配 | libjiagu 内无（排除标准 AES） |
| 已知明文（appid/dex magic）反推 keystream | 仅元数据区成立 |

根本原因（设计层面，非难度问题）：
1. **解密器被 VMP 指令虚拟化**——核心逻辑是自定义字节码，不是明文 ARM；
2. **二级加密 SO 非磁盘文件**——全盘搜无果，libjiagu 内嵌 "ELF" 经验证是字符串字面量、8 处 GZIP 全假阳性，它们运行时在内存生成；
3. **真密钥（RMUTGF_KEY）运行时派生**。

业务 dex 正文是满熵加密，没有统计弱点。其密钥在运行时才存在——**信息论上不在静态文件中**。这意味着无论投入多少算力与时间，纯静态都无法恢复它。这不是 360 的实现疏忽，而是其设计目标：把"必须运行才能拿到密钥"做成硬约束，从而强制脱壳者进入动态环境。

---

## 6. 结论

- **可静态完成**：恢复损坏 ELF、逆出魔改 RC4 算法、提取硬编码内部密钥、破解 dex 元数据索引区（XOR 0xa6）、测绘容器结构。这些是实打实的逆向成果。
- **静态不可完成**：解出业务 dex 正文。它受 VMP + 运行时内存生成二级 SO + 运行时密钥三重保护，密钥不在磁盘。
- **唯一出路仍是动态脱壳**（见 `小米15+MuMu脱壳执行计划.md`）：让 360 用它自己的运行时密钥把 dex 解密进内存，再 dump。

### 对披露报告的价值（取证结论）
1. 360 加固的内部解密用的是**自研魔改 RC4**（非标准密码学），且**密钥明文硬编码**——这本身是值得记录的弱实现事实。
2. dex 类名索引区仅用**单字节 XOR 0xa6** 混淆，保护强度极低。
3. 真正强加密只覆盖约 6.8MB 业务正文，其余 36MB 是低熵填充。

> 合规复述：本报告全部分析仅针对自存档 APK，用于理解加固机制。逆出的算法/密钥不得用于请求线上服务器或重打包分发。

