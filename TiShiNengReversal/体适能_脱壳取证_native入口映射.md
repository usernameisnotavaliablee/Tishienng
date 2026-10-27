# 体适能_脱壳取证_native入口映射

> 第 8 轮静态取证产出（2026-08-15）。计划：`第8轮_静态取证计划_修订版.md`；输入基线：`dsh-vm/logs/round8_manifest_sha256.txt`；工具链预检：`dsh-vm/logs/round8_toolchain.md`。
> 证据级别约定（AGENTS.md）：实锤 / 强推断 / 未发现。本文所有行号基于 `dsh-vm/dumps/jadx_out/cap_8/sources/`（jadx 1.5.1, -m fallback, -j 1）与 `dsh-vm/dumps/jadx_out/cap_0/sources/`。

---

## 1. 结论先行

1. **com.acse.ottn 的 7 个 Activity 的 `native onCreate` 实现 = 静态不可判定**（实锤级证据支持"不可判定"，非推测）：7 个类的 `static{}` 全部只调用 `com.stub.StubApp.interface11(<int>)`（壳装载器索引），`onCreate` 为 hoisted `public native void onCreate(Bundle)`，**com/acse 全子树 0 处 `System.loadLibrary`**，磁盘上无任何可静态归因的 native 实现或 RegisterNatives 表。
2. **`interface11` 的 native 实现位于 360 壳 libjiagu**（实锤）：cap_0（壳）的 `StubApp.attachBaseContext` 展示完整装载链——从 `/.jiagu/` 目录加载 `libjiagu`/`libjiagu_a64.so` 等家族；libjiagu 逆向报告 §5 已证实其业务解密模块为**运行时生成的二级 SO**，密钥信息论上不在磁盘 → 静态不可恢复（既有结论，本轮复核不变）。
3. **唯一有静态可见装载器的 acse 生态 native 桥 = tsnsecret**（实锤，已闭环）：装载器藏在 `com/google/android/datatransport/Transform.java`（`System.loadLibrary("tsnsecret")`，15 个单字母 native 方法），算法已由 unidbg 0.9.9 三用例动态验证（AES-128-CBC / auth() / generateAuthInfo）。**tsnsecret 归类为"已映射"，不是待排除的第三方**。
4. **cap_8 全树仅 8 个文件含 `System.loadLibrary`，全部属第三方 SDK**（实锤）：EasyAR(AR)、极光推送、百度（人脸/liantian）、高德地图、Google 搬运类 Transform——与 acse 业务 native 无静态可证关联。
5. 结论链完整：7/7 Activity 入口 → 壳索引（interface11）→ 壳 native（libjiagu）→ 运行时二级模块 → **静态不可判定**。这是计划认可的合法交付。

## 2. 范围、方法与输入

- 输入：cap_8（acse 全量，6331 类）、cap_0（360 壳，4 类）、lib/ 全部 SO、assets/libjiagu*.so；哈希见 `round8_manifest_sha256.txt`（cap_8 = `7ac0ab45…`，cap_0 = classes.dex = `e821483b…`）。
- 方法：jadx（1.5.1, fallback, -j 1）+ grep 交叉引用 + `decode_jiagu_meta.py`（XOR 0xc6/0x86）+ 既有报告（libjiagu逆向技术报告.md、设备指纹SO分析.md、体适能_脱壳取证_acse.ottn.md、体适能_脱壳取证_业务调用链.md）。
- 合规：纯静态，未启动 app、未访问网络、未运行任何 .so、未重打包。

## 3. 7 Activity 入口映射表（实锤）

出处约定：`文件:行` 均指 cap_8 jadx 输出；`onCreate` = `public native void onCreate(android.os.Bundle)` 声明行；`static{}` = `StubApp.interface11(ID)` 调用行，ID 取自调用前一行的寄存器赋值（jadx fallback 渲染）。

| # | Activity | onCreate 行 | static{} 行 | interface11 ID (hex) | 语义 |
|---|---|---|---|---|---|
| 1 | ExcessActivity | 44 | 7–8 | 9579 (0x256b) | 壳装载器索引 |
| 2 | SeedWebViewActivity | 200 | 102–103 | 9584 (0x2570) | 同上 |
| 3 | SeedingLoadingActivity | 148 | 90–91 | 9587 (0x2573) | 同上 |
| 4 | TransparentGreenActivity | 772 | 152–153 | 9591 (0x2577) | 同上 |
| 5 | WXActivity | 69 | 32–33 | 9593 (0x2579) | 同上 |
| 6 | WhiteActivity | 43 | 31–32 | 9595 (0x257b) | 同上 |
| 7 | AccessibiltyTsnPermissionGreenActivity | 1618 | 755–756 | 9560 (0x2558) | 同上 |

示例（ExcessActivity.java）：
```java
7:            r0 = 9579(0x256b, float:1.3423E-41)
8:            com.stub.StubApp.interface11(r0)
```
ID 是壳装载器索引（与业务逻辑无直接对应），实现位于 libjiagu（见 §4）。7 个 ID：9560, 9579, 9584, 9587, 9591, 9593, 9595 —— 与壳容器索引表语义一致（cap_0 元数据解码出的索引区见 §5）。

## 4. interface11 语义与壳装载链（实锤）

cap_0（壳）jadx 输出 `com/stub/StubApp.java`：
- **181 行**：`public static native void interface11(int r0);` —— 声明级，无实现（预期）。
- **attachBaseContext（611–855 行）** 完整装载链：`/.jiagu/` 目录（715 行）；`c = "libjiagu"`（28-29 行）→ `libjiagu.so`（702 行 `System.loadLibrary("jiagu")`）、`libjiagu_a64.so`（815 行）、`libjiagu_x86.so`（793 行）、`libjiagu_x64.so`（767 行）、`libjiagu_mips.so`（749 行）、以及从 `.jiagu` 目录 `System.load` 的 `libjiagu_64.so`/`libjiagu.so`（782/830 行）。
- **ChangeTopApplication（57–67 行）**：调用 native `interface7(app, ctx)` 替换顶层 Application。
- **onCreate（1078–1125 行）**：`interface21(app)`（1089 行）等 native 调用。

→ `interface11` 实现位于 libjiagu；libjiagu逆向技术报告.md §5 结论（业务 dex 体 VMP + 运行时生成二级 SO + 运行时密钥，密钥信息论上不在磁盘）本轮复核**不变**。静态层面：无 RegisterNatives、无 JNI_OnLoad 导出可证实现（工具链限制见 §9）。

**本轮新增直接证据（壳 native 层）**：
- **二级模块 `libjgdtc.so` 磁盘不存在**（实锤）：`com/tianyu/util/DtcLoader.java` 静态块 `System.loadLibrary("jgdtc")`（6-7 行），回退 `System.load(<nativeLibraryDir>/libjgdtc.so)`（13、54、61 行），硬编码兜底 `/data/data/com.bxkj.student/lib/libjgdtc.so`（61 行）；`StubApp.attachBaseContext` 在 667 行调用 `DtcLoader.init()`。全工作区 `find -name '*jgdtc*'` 零命中 → **该模块是运行时生成/注入的**（与 libjiagu 报告 §5"运行时生成二级 SO"互相印证）。
- **libjiagu_a64.so 段头损坏 + 无 JNI 符号**（实锤）：`nm -D assets/libjiagu_a64.so` 报错 `invalid sh_type for string table section [index 0]: expected SHT_STRTAB, but got SHT_NULL`（= 段头被有意破坏，与 libjiagu 报告一致）；dynsym 仅 2 个空未定义符号，**无 interface11 / JNI_OnLoad / Java_* 导出**；`strings -a` 无 `interface11` / `RegisterNatives` 字面量 → 壳 native 层亦无静态可证实现。

## 5. cap_0 壳管道收口

- `probe_dex_structure.py cap_0`：class_defs_size=4，data_size=18180（0x4704），map 16 项 —— 壳特征确认。
- `decode_jiagu_meta.py`（已修 Windows 硬编码路径为 CLI 参数，默认指向本机 cap_0）：XOR 0xc6 头部索引表（leading u32: 0x2b10=11024, 6, 0x70=112…）；XOR 0x86 文本区解出可读字符串（大小写翻转）：`com.bXkj.STUdenT.SPlaSh.sPlaSh`（= com.bxkj.student.Splash.Splash）、`jiagUveRSion`（= jiaguVersion）、`PRoTecT-Time`（= Protect-Time）、`com/stub/stub`、`STUb`、`RkeY`（= rKey）、`official`、`checksUm` 等 —— 与 libjiagu 报告"容器索引 + 元数据"一致。
- jadx cap_0 → 4 类：`com/stub/StubApp.java`（1126 行）、`com/tianyu/util/{a,Configuration,DtcLoader}.java`。
- **结论**：cap_0 为纯壳，产出为 StubApp 声明级（interface11 等 40+ native 方法仅声明）；"恢复壳内业务实现" = **静态不可判定**（不承诺，计划明示）。

## 6. loadLibrary 关键证据（实锤）

cap_8 全树含 `System.loadLibrary` 的文件共 **8 个**，全部第三方：

| 文件 | SDK | 与 acse 业务 native 关联 |
|---|---|---|
| cn/easyar/Engine.java | EasyAR（AR SDK） | 无 |
| cn/jiguang/internal/JNAction.java | 极光推送 | 无 |
| com/baidu/idl/main/facesdk/test/PaddleLiteTest.java | 百度人脸 | 无 |
| com/baidu/idl/main/facesdk/FaceAuth.java | 百度人脸 | 无 |
| com/baidu/liantian/jni/Asc.java | 百度 liantian（设备指纹） | 无（独立 SDK，见设备指纹SO分析.md） |
| com/baidu/vis/unified/license/AndroidLicenser.java | 百度 vis | 无 |
| com/autonavi/base/amap/mapcore/AeUtil.java | 高德地图 | 无 |
| com/google/android/datatransport/Transform.java | **tsnsecret 装载器（已映射）** | 已 unidbg 验证闭环 |

**`com/acse` 子树：0 处 `System.loadLibrary`；`com/acse/ottn/activity`：0 处。** → 7 个 Activity 的 native 方法在 Java 层无任何静态可证的解析库归属（关键证据，支撑 §1 结论）。

## 7. SO 排除表（43 项 + ABI 差异项）

**名单核对**：`lib/arm64-v8a/` = 43 个，`lib/armeabi-v7a/` = 43 个。两目录名称**不一致**（diff 实测）：arm64 独有 `libjutils.so`（1,402,104 B），v7a 独有 `libndkbitmap.so`（13,452 B），其余 42 个同名。下表以 arm64 口径 43 行为准，`libndkbitmap.so` 单列。方法：既有报告（设备指纹SO分析.md / libjiagu逆向技术报告.md / 密钥与算法证据清单.md / recon_*.txt / dis_*.txt）+ `nm -D`/`strings -a` 补证（本机实测，无 pyelftools/capstone）。

**总览**：第三方 SDK 41 个（≈95.3%）、360 壳自身 1 个（libX86Bridge.so）、已映射业务库 1 个（libtsnsecret.so）、未知/待定 0 个。**与 acse 业务 native 相关的候选：0 个**（见 §7.2）。

### 7.1 43 行排除表

| # | SO 名 | arm64(B) | armeabi(B) | 归类结论 | 证据（nm/strings 实测或报告） |
|---|---|---|---|---|---|
| 1 | libAMapSDK_MAP_v10_0_600.so | 19,998,832 | 13,411,708 | 高德地图 AMap | `Java_com_autonavi_base_ae_gmap_*` 155 导出 |
| 2 | libavmdl_lite.so | 747,584 | 423,536 | 字节 ttvideo 加载器 | `AVMDL-1.1.37.41-boringssl-lite`、`com/bykv/vk/component/ttvideo/...` |
| 3 | libbd_unifylicense.so | 379,296 | 235,396 | 百度人脸授权 | `Java_com_baidu_vis_unified_license_AndroidLicenser_*` |
| 4 | libbdface_sdk.so | 3,108,240 | 1,874,232 | 百度人脸 SDK | `Java_com_baidu_idl_main_facesdk_model_BDFace*`（33） |
| 5 | libBugly_Native.so | 195,200 | 182,320 | 腾讯 Bugly | `BUGLY_CHANNEL_SESSION`、bugly.qq.com |
| 6 | libBugly.so | 190,656 | 165,628 | 腾讯 Bugly | 同上 |
| 7 | libc++_shared.so | 936,368 | 558,988 | NDK libc++ 运行时（无关） | `_ZNSt6__ndk1*` |
| 8 | libcommonV2DevInfo.so | 268,344 | 149,132 | adscope（岩鼠广告） | recon_commonV2.txt `xyz/adscope/common/v2/dev/info/...` |
| 9 | libdevInfo.so | 280,632 | 153,228 | 倍孜 beizi 广告 | recon_devInfo.txt `Java_com_beizi_ad_internal_utilities_DeviceInfo_*` |
| 10 | libEasyAR.so | 12,415,120 | 9,022,528 | EasyAR（AR SDK） | sense-r.easyar.com |
| 11 | libemulator_check.so | 10,192 | 13,792 | com.snail.antifake（模拟器检测） | recon_emucheck.txt `Java_com_snail_antifake_jni_EmulatorDetectUtil_detect` |
| 12 | libijkffmpeg.so | 3,581,144 | 2,849,520 | Bilibili ijkplayer | `avcodec_configuration` |
| 13 | libijkplayer.so | 381,024 | 248,404 | Bilibili ijkplayer | `ijkplayer`、4 个 Java_ 导出 |
| 14 | libijksdl.so | 481,112 | 214,528 | Bilibili ijkplayer | `SDL_AoutOpenAudio` |
| 15 | libimage_processing_util_jni.so | 28,944 | 21,692 | AndroidX CameraX | `Java_androidx_camera_core_ImageProcessingUtil_*` |
| 16 | libjniPdfium.so | 55,144 | 50,648 | PdfiumAndroid | `Java_com_shockwave_pdfium_PdfiumCore_*` |
| 17 | libjutils.so | 1,402,104 | —（v7a 无） | 腾讯 jutils（JNI 工具） | `jutils.version`；ABI 差异项 |
| 18 | libliantian.so | 100,168 | 87,456 | 百度联天（硬件指纹） | recon_liantian.txt `/dev/vmdrm0`、`mmcblk0/device/cid` |
| 19 | libmaparmor.so | 5,824 | 9,600 | 字节穿山甲组件 | strings `bytedance` |
| 20 | libmmkv.so | 597,000 | 371,332 | 腾讯 MMKV | `mmkvInitialize` |
| 21 | libmodft2.so | 554,880 | 521,640 | 福昕 Foxit 修改版 FreeType2 | `FT_*` 全套 |
| 22 | libmodpdfium.so | 5,216,024 | 4,683,804 | 福昕 Foxit 修改版 PDFium | `CPWL_Utils::GetGraphics_Foxit` |
| 23 | libmodpng.so | 214,840 | 148,852 | 福昕 Foxit 修改版 libpng | `png_*` 全套 |
| 24 | libomesStdSco.so | 2,480,872 | 2,244,324 | OPPO OMES 安全组件 | `com/oplus/omes/stdsco/*`、infrasec-openapi-cn.heytapmobi.com |
| 25 | libpaddle_light_api_shared.so | 5,335,696 | 3,287,028 | 百度 PaddleLite | `paddle::lite_api::Tensor` |
| 26 | libpanglearmor.so | 251,120 | 153,072 | 字节穿山甲 Pangle | code.byted.org |
| 27 | libpangleflipped.so | 10,064 | 9,756 | 字节穿山甲（反逆向） | `com/bytedance/pangle/flipped/FlippedV2Impl` |
| 28 | libPglbizssdk_ml.so | 1,075,752 | 659,512 | 字节穿山甲 ML SDK | HANDOFF:144 |
| 29 | libpl_droidsonroids_gif.so | 42,928 | 42,636 | droidsonroids GIF | `Java_pl_droidsonroids_gif_GifInfoHandle_*` |
| 30 | libplt-base.so | 373,056 | 245,956 | 快手 Kwai 性能/hook 基础库 | `Java_com_kuaishou_xhook_NativeHandler_*`、`kwai_process_vm_readv/writev` |
| 31 | libproperty_get.so | 5,984 | 9,364 | com.snail.antifake 配套 | `Java_com_snail_antifake_jni_PropertiesGet_*` |
| 32 | libscannative.so | 2,607,552 | 1,570,684 | 华为 HMS ScanKit | `Java_com_huawei_hms_scankit_util_OpencvJNI_*` |
| 33 | libsgcore.so | 92,360 | 112,500 | 快手 SGCore | recon_sgcore.txt `Java_com_kwai_sgcore_SGCore_getMagic/getClock` |
| 34 | libsoundtouch.so | 501,520 | 325,268 | SoundTouch 音频（开源） | `Java_net_surina_soundtouch_SoundTouch_*` |
| 35 | libsqlcipher.so | 3,392,968 | 2,168,608 | SQLCipher（加密 DB） | 脱壳与解密分析.md:131 |
| 36 | libti-monitor.so | 115,872 | 66,324 | 快手 KOOM/artti 监控 | recon_timonitor.txt `Java_com_kwai_performance_stability_artti_monitor_*` |
| 37 | libtobEmbedEncrypt.so | 10,504 | 18,352 | 字节 embedapplog 埋点加密 | `Java_com_bytedance_embedapplog_util_TTEncryptUtils_*` |
| 38 | libtsnsecret.so | 11,982,808 | 8,588,140 | **已映射业务库** | unidbg 动态验证报告.md；密钥与算法证据清单.md §1-§7 |
| 39 | libtt_ugen_layout.so | 440,672 | 342,084 | 字节穿山甲 UGeno | `com/bytedance/adsdk/ugeno/yoga/YogaNative` |
| 40 | libttmplayer_lite.so | 1,502,480 | 1,161,536 | 字节 ttvideo 播放器 | `com/bykv/vk/component/ttvideo/player/TTPlayer` |
| 41 | libumeng-spy.so | 539,240 | 539,240 | 友盟 U-Zid | recon_umeng.txt `Java_com_umeng_umzid_Spy_*`（两 ABI MD5 不同） |
| 42 | libX86Bridge.so | 67,472 | 66,808 | **360 壳自身**（StubApp x86 桥） | nm 导出 `Java_com_stub_StubApp_interface13`；两 ABI 唯一含 `StubApp` 串；mtime 4月2 异于其余 1月1（壳注入特征） |
| 43 | libxeno_native.so | 21,597,896 | 16,008,520 | 第三方 AI 人脸几何（强推断：MediaPipe+aimatter） | strings `mediapipe::`/`drishti::face_geometry`/`blazeface_subgraph_linked.cc` |
| 43+ | libndkbitmap.so | —（arm64 无） | 13,452 | cjump ndk-bitmap（仅 v7a） | `Java_tv_cjump_jni_NativeBitmapFactory_*`；ABI 差异项 |

### 7.2 候选与结论

- **候选列表：空（0 个）**——`lib/` 下没有任何 SO 可被指认为 com.acse.ottn 业务 native 实现库。
- **理由（实锤级）**：86 个 SO（43×2 ABI）`strings -a` 全扫 `com/acse`、`acse/ottn` **0 命中**；`nm -D` 无任何 `Java_com_acse*` JNI 注册符号；唯一含壳桩的 `libX86Bridge.so` 仅导出 `Java_com_stub_StubApp_interface13`（360 壳 x86 桥，无 acse 业务符号）。
- **归属**：acse 7 个 Activity 的 native onCreate 实现在静态可读范围**未发现**（证据级别：未发现），最可能位于 360 壳运行时（assets/libjiagu_a64.so / libjiagu.so）或壳运行时内存生成的二级 SO（libjiagu逆向技术报告.md §5）；进一步定位须动态脱壳后 dump。

## 8. URL 复核+增量

**复核基准**：《体适能_脱壳取证_acse.ottn.md》URL 表（第 236-247 行）+ 第 317 行结论。源码基准：`dsh-vm/dumps/jadx_out/cap_8/sources/` 与 `cap_4/sources/`。复核方式：逐条 grep 对照 + com/acse 全包 https?:// 明文穷尽扫描。

### 8.1 逐条对照（10 条，零漂移）

| # | URL | 报告引用 | 实际位置 | 裁决 |
|---|---|---|---|---|
| 1 | `http://report.idazhe.net/ss/` | g0.java:43 | com/acse/ottn/g0.java:43（release 分支） | ✅ 一致 |
| 2 | `http://t.idazhe.net/ss/` | g0.java:40 | com/acse/ottn/g0.java:40（debug 分支） | ✅ 一致 |
| 3 | `http://tongji.oozk.cn` | l1.java:43 | com/acse/ottn/l1.java:43（release） | ✅ 一致 |
| 4 | `http://a.idazhe.net/ss/tongji_oozk_cn/` | l1.java:40 | com/acse/ottn/l1.java:40（debug） | ✅ 一致 |
| 5 | `http://118.89.189.246`（隐藏 C2 裸 IP） | q3.java:36-37 | com/acse/ottn/q3.java:36-37 | ✅ 一致 |
| 6 | `https://www.idazhe.net/course/snt-*` | h0.java:758/761/876/879 | 同文件同 4 行（协议页分发） | ✅ 一致 |
| 7 | `https://mh5.huachenjie.com/h5/contract/document.html?code=501/502/801/802` | h0.java:646/653/806/813 | 同文件同 4 行 | ✅ 一致 |
| 8 | `https://www.boxkj.com/resources/user_agreement*.html` | h0.java:632/792 | 同文件同 2 行 | ✅ 一致 |
| 9 | `https://api2.lptiyu.com/v3/api.php/Login/*` | h0.java:639/799 | 同文件同 2 行 | ✅ 一致 |
| 10 | `https://h5.gxapp.iydsj.com/gxapp/privacy_policy/*` | h0.java:625/785 | 同文件同 2 行 | ✅ 一致 |

### 8.2 增量结果

- **acse 包内无新增**：com/acse/ottn 明文 https?:// 共 19 处、10 个端点，全部已列报告表内；`ss/` 路径仅 3 处（g0:40/43、l1:40）；idazhe.net 子域仅 report./t./a./www. 四个。
- **全树唯一表外明文 URL**：`http://10.138.32.176:8518/api/v3/person/verify_sec?appid=7758258`（com/baidu/idl/face/platform/ui/utils/SecRequest.java:6）—— 百度人脸 SDK 私有 IP 测试端点（疑似遗留），非 acse 代码，**仅备注、不入本表**。
- **schoolUrl 链复核**：cap_4 `com/bxkj/base/v2/data/b.java` M() = 385-422 行 ✅；密文 `05dbfd8c595b3687f8351745f27c449b` = :392 ✅；:393 `l()` → b0/b.java:161-168 → `Transform.k` ✅；SharedPreferences `schoolUrl` 读取+回退重解密 = :394-410，`P0()` setter = :494-501 ✅。另发现 retrofit/b.java:28-36 用同密文 + 2 个新密文（`7ff944758843f909e729065961954713`、`f16f7cfccc6d82a3a6ae248da4d16a1d`）解密 v2 baseUrl —— 进一步印证"业务基址 native 侧解密"。
- **cap_4 业务侧佐证**：`https://device.jpush.cn/v3/aliases` 明文白名单位于 cap_4 `y/c.java:155`（在业务调用链报告"y/c.java:122-166"区间内），非 acse 表范围，仅备注。

### 8.3 裁决

**第 317 行结论维持成立**（无新证据推翻）：落地 URL 为服务器模型字段（`spop_link`/`origin_url`/`tkl_url`/`tkl_turn_url`，AccessiblityModel.java:42-67）动态下发；业务基址 schoolUrl 经 `Transform.k`（native）解密，Java 层无明文。仅两处精度补充：
1. acse 自有明文端点 = 两套统计基址(g0/l1) + 隐藏 C2 IP(q3) + 14 个协议页(h0)，"静态列不出最终导流 URL 明文"表述精确；
2. 措辞建议（非事实修订）：第 317 行"落地页最终 URL 拼接在 native 侧"细化为"**业务基址(schoolUrl)在 native 侧解密、落地 URL 由服务器字段下发**"。

## 9. 证据级别汇总

| 结论 | 级别 | 支撑 |
|---|---|---|
| 7 Activity native onCreate 静态不可判定 | 实锤（不可判定性） | §3 表 + §6 loadLibrary=0 |
| interface11 实现位于 libjiagu | 实锤（强推断→实锤） | §4 StubApp 装载链 + libjiagu 报告 |
| libjgdtc.so 二级模块运行时生成、磁盘不存在 | 实锤 | §4 DtcLoader.java + find 零命中 |
| libjiagu_a64.so 段头损坏、无 interface11/JNI 导出 | 实锤 | §4 nm 报错 SHT_NULL + dynsym 仅 2 空符号 |
| 43+1 SO 排除表（0 个 acse 候选） | 实锤 | §7 表（strings 86 SO 全扫 0 命中、无 Java_com_acse*） |
| tsnsecret 已映射（unidbg 闭环） | 实锤 | unidbg 动态验证报告 |
| cap_0 为纯壳、业务不可静态恢复 | 实锤 | §5 + libjiagu 报告 §5 |
| 8 个 loadLibrary 全第三方 | 实锤 | §6 表 |
| acse URL 表 10 条零漂移、清单封闭 | 实锤 | §8（逐条 grep + 明文穷尽） |
| 第 317 行"静态列不出导流 URL 明文"结论维持 | 实锤 | §8.3（无新证据推翻） |

## 10. 附录：工具链阻塞与命令

- **工具链阻塞（如实记录）**：本机无 pyelftools/capstone（系统 python3、dsh-vm/pyvenv、pyvenv16 均无；`~/Library/Caches/pip/wheels` 63 个 wheel 中 0 个 elftools/capstone → 离线安装不可行）。SO 工作=复用第 6 轮产物（recon_*/dis_*/设备指纹SO分析.md）+ 自写 ELF 解析器（纯 stdlib 结构分析）+ `strings`/`nm`/`otool`；**capstone 反汇编缺口 = 工具阻塞**，本报告不含任何新反汇编结果。
- 命令记录：
  - `JADX_OPTS="-Duser.home=$PWD/dsh-vm/tools/jadx-home" dsh-vm/tools/bin/jadx -m fallback -j 1 -d <out> <dex>`（1.5.1）
  - `python3 decode_jiagu_meta.py [dex]`（本机默认 cap_0）
  - `python3 probe_dex_structure.py <dex>`
- 输入哈希基线：`dsh-vm/logs/round8_manifest_sha256.txt`（14 cap + 8 输入文件）。
