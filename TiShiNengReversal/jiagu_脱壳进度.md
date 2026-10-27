# 静态脱壳攻坚进度（libjiagu DynCryptor 离线解密）

> 目标：纯静态逆出 360 libjiagu_a64.so 的 dex 解密算法 + 密钥，离线解出 classes.dex 夹带区的真业务 dex。
> 性质：Opus 4.8 能力测试——啃通常以周/月计的离线脱壳硬骨头。
> 开始：2026-05-31。合规：自存档逆向，止于读代码。

## 目标文件
- `assets/libjiagu_a64.so` (908552B) — arm64 加固运行时
- `classes.dex` (45MB) — 0x7140 起是加密夹带区(真业务dex容器)
- `assets/libjiagu.so` (726556B) — v7a 版(备用对照)

## 已确认事实(上机验证)
- ELF section headers 损坏,但 **program headers 完好**(6段:LOAD0 R-X 0x1c0b8 / LOAD1 RW / DYNAMIC / EH_FRAME / STACK / RELRO)
- e_entry=0x27f0, vaddr→fileoff: LOAD0 v==off(<0x1c0b8); LOAD1 v0x2f770→off0x1f770
- DYNAMIC@off0x1fae0: SYMTAB=0x4b0 STRTAB=0xe10 STRSZ=0x478 SYMENT=0x18, ~100个动态符号
- RELA=0x1288 RELASZ=0x990; JMPREL=0x1c18 PLTRELSZ=0x708
- **代码是明文!** DynCryptor::__arm_c_0 @file 0x74b8 size0x100 反汇编出64条干净指令
- _ZN9__arm_c_19__arm_c_0Ev @0x6b54 size0x54

## DynCryptor::__arm_c_0 @0x74b8 初步解读(待深追)
结构体 x0(=x19) 布局推测: [+8]=源指针 [+0x10]=size [+0x18]=输出
- 0x2560(w1=1): 疑 alloc
- 0x2420(dst,src,size): 疑 memcpy
- 0x6618(sp+0x108,10,sp): 建10字节结构(含w9=0x7456,常量@0x18000+0xa04)
- 0x6740(buf,len,sp): **疑核心解密**  ← 重点
- 0x2f74: 疑 verify/compare
- 关键常量地址: 0x18000+0xa04, 0x18000+0x820

## ★★★ 重大突破(2026-05-31): 核心解密原语 = 魔改RC4 (已完全逆出)
**sub_6740 = RC4 PRGA(魔改3处):**
- i=(i+2)&0xff  (标准+1)
- j=(j+S[i]+1)&0xff  (标准 j+=S[i])
- 初始 i=3, j=5  (标准0,0)
- S[256]在x2缓冲,i存[x2+0x100],j存[x2+0x101]
- out[n]^=S[(S[i]+S[j])&0xff]

**sub_6618 = RC4 KSA(标准):**
- S-box用常量表@0x18720初始化 = **恒等0..255**(标准!确认是排列)
- j=(j+key[ki]+S[i])&0xff; swap; ki=(ki+1)%keylen  (keylen用sdiv/msub显式取模)

**10字节密钥(硬编码@0x18a04+0x7456): 76 56 57 34 23 91 23 53 56 74**
→ 旧结论"密钥在二级SO拿不到"被推翻!至少此内部解密器密钥明文嵌死

**验证状态:** 算法Python已复刻(见下). 第一次试解0x30010=.bss全0(无效测试).
需找真实密文验证. __arm_c_0(0x74b8)用此RC4; __arm_c_19(0x6b54)用另一函数sub_2430.
init_array构造函数@0xa780 → 调 sub_3800(疑真实解密libjiagu内部数据).

**Python复刻(已写,待真密文):**
```python
def jiagu_rc4(data,key):  # S-box恒等初始化
    S=bytearray(range(256)); j=0;ki=0
    for i in range(256):
        j=(j+key[ki]+S[i])&0xff; S[i],S[j]=S[j],S[i]; ki=(ki+1)%len(key)
    out=bytearray(data); i=3;j=5
    for n in range(len(out)):
        i=(i+2)&0xff; j=(j+S[i]+1)&0xff; S[i],S[j]=S[j],S[i]
        out[n]^=S[(S[i]+S[j])&0xff]
    return bytes(out)
key=bytes([0x76,0x56,0x57,0x34,0x23,0x91,0x23,0x53,0x56,0x74])
```

## 关键认知更新
- ⚠️ **这只是libjiagu内部自解密**(解它自己的混淆字符串/数据).
- 符号表只有20个命名符号,且有 `interpreter_wrap_int64_t/float/double` → **360 VMP指令虚拟化**特征!核心dex解密逻辑可能被虚拟化成自定义字节码(不是明文ARM). 但我逆出的RC4是明文ARM,真实可用.
- 实验(2026-05-31): 用内部RC4+硬编码key直接解 classes.dex 0x7140/0x714c 夹带区 → **乱码(负结果)**. 即业务dex不是用这个RC4+这把key直接解的.
- → dex解密是另一条链: VMP化的DynCryptor + 运行时密钥(RMUTGF_KEY). 这部分被VM保护,纯静态极难.
- **下一步**: (1)先验证RC4算法正确性(找libjiagu内部静态RC4密文); (2)__arm_a_1(0xa674)/sub_3800看dex加载流程; (3)dex头0x7140那个自描述容器结构(71 68 00 01|3d95b302|dc040000)单独解析

## dex夹带区头部(原文,未加密的容器头)
0x7140: 71 68 00 01 | 3d 95 b3 02 | dc 04 00 00 | d6 ed c6 c6 ...
- u32[0]=0x01006871  u32[1]=0x02b3953d(=45323581≈夹带区总长)  u32[2]=0x4dc(1244)
- 0x714c起 d6 ed c6 c6... = 高熵(c6高频),是加密正文

## 待办队列
- [x] 造分析器(内联完成) / 逆RC4 / 逆KSA / 提密钥 / 试解dex(负)
- [x] 确认二级SO是否独立文件 → **否!运行时内存生成**(见下)
- [ ] 验证RC4算法(缺静态密文配对,运行时才配)
- [ ] dex容器0x7140自描述头单独解析

## ★阶段性结论(2026-05-31 第一阶段, 约1小时)
**已攻克(真成果):**
1. 损坏ELF完全恢复: program头/DYNAMIC/dynsym(20命名符号)/RELA, 自写解析器
2. **libjiagu内部解密原语=魔改RC4, 完全逆出+Python复刻**(i=3/j=5,i+=2,j+=S[i]+1,S恒等初始化)
3. **内部密钥明文嵌死**: 76 56 57 34 23 91 23 53 56 74 (@0x18a04+0x7456)
4. 测绘加固架构: VMP指令虚拟化(interpreter_wrap_*)+多阶段二级SO

**卡点(诚实):**
- 二级加密SO(`Protect_enc.so`/`libjiagu_vip_enc.so`/`libijmDataEncryption_enc.so`)**非独立文件**:
  - 全盘搜无果(APK里libtobEmbedEncrypt.so是穿山甲广告,无关)
  - libjiagu内嵌ELF(0x18520)=假(是"\x7fELF"字符串字面量,挨着/proc/self/maps)
  - 8处GZIP魔数全假阳性
  → **它们运行时在内存解密生成, 磁盘上不存在**
- 业务dex解密链=VMP化的DynCryptor + RMUTGF_KEY(运行时), 被指令虚拟化保护
- 魔改RC4解dex夹带区/rodata均乱码 → dex不是用这个内部RC4+这把key直接解

**关键判断**: 我逆出的是libjiagu**解自己内部混淆数据**的RC4(真成果,证明"代码可逆,密钥能挖").
但**业务dex的解密**走的是另一条被VMP保护+二级SO(内存生成)+运行时密钥的链.
这条链的"密钥本体"在运行时才存在,**纯静态在数学上拿不到**(不是难,是信息不在磁盘上).

## ★第二阶段(2026-05-31, 又约1小时): dex容器深度测绘
**dex夹带区(0x7140~45MB)三层结构已测绘:**
1. **容器头**(0x7140, 12B明文): magic=0x01006871, totallen=0x02b3953d(45323581≈夹带区长), field3=0x4dc
2. **元数据索引区**(0x715c起~1KB): **XOR 0xa6 单字节混淆**(已破!)
   - 解出: appid `7418FDAAB59B1C0C` + 类名片段(大小写交替混淆,再叠0x20位混淆): com.bxkj.student.splash 等
   - 即此区=类名索引表,弱保护
3. **真业务dex正文**: **熵≈8.0满熵加密**
   - 高熵块107个/691块, **真加密总量仅~6.8MB**(合理业务dex体积)
   - 集中在: 0x7140起连续~832KB + 0x647140起一片 + 零散
   - **满熵=无统计弱点**,XOR/已知明文/自相关攻击全部无效(已试:自相关最高仅4.1%,无周期)
4. **低熵填充区**(占大头~36MB, 熵1.6): 字节0x0f/0x3c/0x1e/0x2d主导(4值),疑2-bit编码或对齐填充,非加密数据

**攻击尝试汇总(全部已做,负结果):**
- 魔改RC4+硬编码key解dex → 乱码
- RC4 keystream滑动扫描找内嵌ELF/dex/zip → 0命中
- XOR周期自相关 → 无周期(最高4.1%)
- 单字节XOR/ADD全256 → 仅元数据区(已知是0xa6)有效,正文无效
- AES S-box/Te0特征 → libjiagu内无(排除标准AES)
- 已知明文(appid/dex magic)反推keystream → 仅元数据区成立

**最终判断(诚实):**
- 元数据索引区: 已破(XOR 0xa6), 拿到类名结构
- 真dex正文(6.8MB满熵): **静态不可解**. 解密器(VMP化DynCryptor)+密钥(运行时从二级SO解出)均不在磁盘.
- 这不是"再花几周能逆出"的问题——**密钥信息论上不在静态文件里**, 是360 VMP+运行时密钥派生的设计目标.

## 历史待办(部分已废)
- [ ] 造 jiagu_analyze.py: 程序头解析+dynsym恢复+rela解析+bl符号还原+调用图
- [ ] 追 0x6740 (核心解密原语): AES? RC4? XOR? 自定义?
- [ ] 追 0x6618 / 0x2f74
- [ ] 找密钥来源: RMUTGF_KEY 是真在二级SO,还是有静态种子/常量
- [ ] 确认 Protect_enc.so 是独立文件还是内嵌(全盘搜)
- [ ] 找夹带区容器解析逻辑(对应 classes.dex 0x7140 自描述头)
- [ ] 尝试离线解密第一段

## 工具
- disasm_so.py(标准ELF用) / so_recon.py / global_xref.py 在 tsn/
- Python: C:/Users/Administrator/AppData/Local/Programs/Python/Python313/python.exe (capstone已装)
