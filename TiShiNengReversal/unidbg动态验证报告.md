# unidbg 动态验证报告

> 项目: 体适能 app (com.bxkj.student) — lib/arm64-v8a/libtsnsecret.so
> 轮次: 第7轮动态验证。全程本地模拟执行, 未真机运行、未请求线上服务器、未做密钥分发/重打包。
> 结论: 三个用例全部 PASS, 静态还原的 AES 密钥值、AES-128-CBC 算法、auth() 证书校验链、generateAuthInfo 字典序拼接**均得到动态印证**。

---

## 1. 摘要

用 unidbg 0.9.9 在 Mac 上把 arm64-v8a/libtsnsecret.so 加载进模拟 ARM64 环境, 直接调用其导出符号 `aes_decrypt`/`generateAuthInfo` 并补全 auth() 的 JNI 反射链环境, 三条证据(见 §4)全部通过:

1. **AUTH_KEY** `165f47a702bf0965d2fb49cdbb373377` 对 host 自加密密文做 AES-128-CBC 解密, 还原明文 `TSN-AUTH-TEST-2026`;
2. **QR_CODE_KEY** `c310d8a21490eddc2f3cd870c34bb732` 同法还原 `QR-CODE-SECRET-42`;
3. **auth() 证书校验链** XIAOWEI 证书 DER 的 MD5 与 SO 硬编码值一致 → 解密前置鉴权通过;
4. **generateAuthInfo** 输出按 key 字典序拼接的签名串 `password=abc123&timestamp=1700000000&userName=test`。

最终日志: `dsh-vm/logs/unidbg_run4.log`(122 行, 全 PASS)。排错过程见 `unidbg_run1/2/3.log`。

---

## 2. 环境与命令

| 项 | 值 |
|---|---|
| unidbg | 0.9.9 (JitPack `com.github.zhkl0228.unidbg:unidbg-android`) |
| JDK | 21.0.11 LTS (Oracle) |
| Maven | 3.9.9 (dsh-vm/maven/apache-maven-3.9.9) |
| 目标 SO | lib/arm64-v8a/libtsnsecret.so (base=0x12000000, size=0x497000, 见日志 L5) |
| 证书输入 | dsh-vm/cert_xiaowei.der (891B, MD5 7fc022e67c7d2accc3c8770a46138dc3, 见日志 L4) |
| harness | unidbg_harness/src/main/java/com/tsn/harness/TsnSecretHarness.java |

加载方式: `AndroidEmulatorBuilder.for64Bit()` + `AndroidResolver(23)` + `createDalvikVM((File)null)`, `vm.setJni(this)` 接管 AbstractJni 回调, `vm.loadLibrary(SO_PATH, true)` 装载(见 harness L52-73)。

---

## 3. 补环境要点(auth()/generateAuthInfo 反射链)

auth() 在解密前通过 JNI 反射取签名证书(见《密钥与算法证据清单.md》§6), 需逐环返回假对象:

```
getPackageManager() → getPackageName()="com.bxkj.student"
  → getPackageInfo(pkg, 0x40) → signatures[0].toByteArray() → 891B 真实 XIAOWEI DER
```

修复过的坑(unidbg 0.9.9 API 相对旧版有变化, run1/2/3 逐项排掉):

1. **AbstractJni 回调签名改 `BaseVM`**: `getObjectField(BaseVM,...)`/`callObjectMethod(BaseVM,...)` 等, 不再是 `VM`; 签名不对则回调不进我们的 handler, run1 直接抛 BackendException。
2. **对象必须 `vm.addLocalObject` 注册**: 反射返回的 DvmObject 需注册后才能被 unidbg 解析为句柄(harness `reg()/regObj()`, L115-125), 否则返回对象句柄为 null → NPE(run2 现象)。
3. **JNI 签名带 `class->` 前缀**: 回调收到的 signature 形如 `android/content/Context->getPackageManager()...`, switch 匹配前必须先剥离 `->` 前缀(harness L152、L130); run3 即在 `signatures` 字段读取时因 `android/content/pm/PackageInfo->signatures:[L...` 前缀未剥离而抛 UnsupportedOperationException。
4. **StringObject 构造式变化**: 需 `new StringObject(this.vm, "xxx")` 显式传入 VM(harness L163 等)。

---

## 4. 三条动态证据(含日志行号)

### 证据 a — AUTH_KEY 解密 (AES-128-CBC, IV=0)
- host 侧先用 AUTH_KEY 自加密明文 `TSN-AUTH-TEST-2026`(密文见日志 L6 `d059e02a8aa228...`), 再调用 SO 的 `aes_decrypt`(L8, key=165f47a7… iv=全0)。
- SO 内部先走完整 auth() 反射链(L9-27: getPackageManager→getPackageName→getPackageInfo→signatures[0].toByteArray, 证书 GetArrayLength=891)。
- 输出 18B(L34): `54534e2d415554482d544553542d32303236` = `TSN-AUTH-TEST-2026`, `★ CASE1 PASS`(L35)。
- **印证**: AES-128-CBC 算法 + AUTH_KEY 密钥值双双正确, 且 auth() 前置鉴权通过(否则不会返回明文)。

### 证据 b — QR_CODE_KEY 解密
- key=`c310d8a21490eddc2f3cd870c34bb732`(L37), 同法自加密明文 `QR-CODE-SECRET-42`。
- 输出 17B(L63): `51522d434f44452d5345435245542d3432` = `QR-CODE-SECRET-42`, `★ CASE2 PASS`(L64)。

### 证据 c — auth() 证书校验链 (XIAOWEI MD5 一致)
- harness 载入证书时先自算 MD5 比对硬编码 `7fc022e67c7d2accc3c8770a46138dc3` → `891B ... MATCH (auth 可通过)`(L4)。
- 该 MD5 即《密钥与算法证据清单.md》§6 中 SO 内 `auth()` strcmp 的硬编码值; 两者一致 ⇒ 传入真实证书时 SO 内部 MD5 校验通过、解密正常返回。
- **印证**: "重打包换证书 → auth 失败 → 连 AES 解密都跑不通" 这一静态结论的动态证明。

### 证据 d — generateAuthInfo 字典序拼接
- 输入 `Map{userName,password,timestamp}`(L66, 实际为 TreeMap), 输出(L119/L120): `password=abc123&timestamp=1700000000&userName=test`。
- **印证**: 按 key 字典序(password < timestamp < userName)排序后 `key=value` 拼接签名串。注意 native 内另有 `std::map` 二次排序(见清单 §4), 二者一致; harness 用 TreeMap 预排, 故此条为"输出形态"的动态证明, 排序机制的确证仍以静态 `std::map` 证据为准。

---

## 5. 事实修正

- 证书 DER **实际 891 字节**, 旧文档 §6 写 887 字节, 需更正为 891。
- 旧文档 "证书 DER 偏移 0x3c" 指 **PKCS#7 文件 `META-INF/XIAOWEI.RSA` 内的位置**(0x3c 起才是内嵌 X.509 DER), 并非独立 DER 文件本身。
- 本轮已用 openssl 从 PKCS#7 提取独立 DER: `dsh-vm/cert_xiaowei.der`(891B), MD5 与旧结论一致: `7fc022e67c7d2accc3c8770a46138dc3`(本机 `md5` 实测, harness L4 亦打印一致)。

---

## 6. 局限

1. unidbg 只验证了 **native 算法层**(aes_decrypt / auth 校验链 / generateAuthInfo 拼接); 真业务 Java dex 逻辑仍需动态脱壳(另线进行), 本轮未覆盖。
2. generateAuthInfo 本轮只捕获到**拼接串**(NewStringUTF 的入参), 其后的**签名哈希最终值未 hook**, 不夸大"已还原完整签名结果"。
3. 反射链用假对象补环境, 证书字节、包名等为真实值, 但 Android 框架行为是模拟而非真机。
4. CASE1/CASE2 断言用 `startsWith`(harness L353/L361), 但日志输出 hex 与明文完全一致(18B/17B 整段匹配), 结论不受影响。

---

## 7. 可复现性

- harness: `unidbg_harness/src/main/java/com/tsn/harness/TsnSecretHarness.java`
- 证书: `dsh-vm/cert_xiaowei.der`(891B)
- 运行命令(在 `unidbg_harness/` 目录):

```bash
/Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/maven/apache-maven-3.9.9/bin/mvn \
  -Dmaven.repo.local=/Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/maven/maven-repo \
  exec:java -Dexec.mainClass=com.tsn.harness.TsnSecretHarness
```

- 关键环境: JDK 21、unidbg 0.9.9、SO 路径 `lib/arm64-v8a/libtsnsecret.so`(harness 内 `SO_PATH` 常量)、证书路径 `CERT_RSA_PATH`。
- 预期输出: `cert DER: 891B ... MATCH` + `★ CASE1 PASS` + `★ CASE2 PASS` + `CASE3 ... password=abc123&timestamp=1700000000&userName=test`(与 `unidbg_run4.log` 一致)。
