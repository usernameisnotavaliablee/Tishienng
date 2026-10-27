# 体适能 APK（com.bxkj.student）assets 目录深挖分析

> 合规静态逆向 / 技术批评取证用途。本轮聚焦前几轮未定性的"可能藏加密数据或敏感配置"的文件。
> 分析时间：2026-05-31。工作目录 `assets\`，共 **367 个文件**。
> 方法：os.walk 全量遍历 + 魔数/熵/可打印率判定 + 针对性解码（XOR-TLV、gzip、zip、ELF strings）。

---

## 0. 总体归类（按扩展名）

| 扩展名 | 数量 | 真实类型 | 是否敏感 |
|---|---|---|---|
| .png | 189 | PNG 图标/纹理（少量是伪装的 zip/gzip，见下） | 否 |
| .data | 96 | 混杂：高德地图瓦片/样式(gzip)、PNG、自定义二进制(SB13/PVR) | 主要是地图资源，无密钥 |
| .csv | 18 | 体测动作姿态模板（MediaPipe 33 关键点） | 否（业务数据） |
| .json | 8 | **明文配置：快手/华为/腾讯/OAID 厂商** | **是（域名/appid）** |
| .binarypb | 7 | Google MLKit Pose protobuf 计算图 | 否 |
| .js/.html | 8 | AAChart 图表库 + Highcharts | 否 |
| .ms | 3 | 阿里 MNN 人脸模型（MSL2 魔数，前几轮已定性） | 否 |
| .so | 2 | libjiagu*（360 加固，前几轮已定性） | 否 |
| .tflite | 2 | TensorFlow Lite（TFL3）MLKit Pose 模型 | 否 |
| .bks | 3 | 华为 BouncyCastle 证书库（前几轮已定性） | 否 |
| 无扩展名 | 5 | .jgapp(360 appid) + **libwbsafeedit×4(腾讯 ELF)** | **是（硬编码密钥）** |
| .czl | 1 | **na.czl = 模拟器检测黑名单（XOR-TLV）** | **是（反作弊指纹）** |
| 其它 | .ck/.zip/.xml/.fnt/.list/.face-android/.prof 等 | 见正文 | 部分 |

---

## 1. 【高价值】libwbsafeedit ×4 —— 腾讯 QQ 互联 OpenSDK 密码安全控件，硬编码密钥

**结论：不是"微博安全编辑"，而是腾讯 QQ 互联开放平台（com.tencent.open）的网页登录密码输入安全控件（wb = web）。**

| 文件 | 架构 | 大小 | 类型 |
|---|---|---|---|
| `libwbsafeedit` | ARM 32 (EL 01) | 17636 | ELF .so |
| `libwbsafeedit_64` | ARM64 (EL 02) | 18024 | ELF .so |
| `libwbsafeedit_x86` | x86 | 17600 | ELF .so |
| `libwbsafeedit_x86_64` | x86_64 | 18344 | ELF .so |

JNI 符号（证据）：
```
Java_com_tencent_open_web_security_JniInterface_clearAllPWD
Java_com_tencent_open_web_security_JniInterface_getPWDKeyToMD5
Java_com_tencent_open_web_security_JniInterface_insetTextToArray
Java_com_tencent_open_web_security_JniInterface_BackSpaceChar
Java_com_tencent_open_web_security_JniInterface_e1 / d1 / e2 / d2   (加解密入口)
```

**.rodata 中硬编码的明文密钥（合规批评核心证据，原样抄录）：**
```
DES 密钥（8字节）:  asdfghjk
AES 密钥（32字符）: 4026aec5f46360286842041e8cd49856
算法套件:           DES/CBC/PKCS5Padding   +   AES/GCM/NoPadding
其它字符串:         OpenSDK_SO、SecretKeySpec、IvParameterSpec、android/util/Base64、格式串 %s%02x
```
锐评点：QQ 互联 OpenSDK 在所有架构的 native 库里**明文硬编码对称密钥**（弱 DES 密钥 `asdfghjk` 是行业里被反复点名的样例级密钥），任何人 strings 一下就能拿到，所谓"安全编辑控件"的加密形同虚设。该控件用于 H5 授权登录时对密码框做"加密"，密钥写死即等于无密钥。

---

## 2. 【高价值】na.czl —— 模拟器/虚拟机检测黑名单（XOR-TLV，已完整解密）

- 路径：`assets\na.czl`  大小：2094 字节  原始熵 7.24（看似加密）
- 真实类型：**自定义 TLV 容器，每条记录用首字节做单字节 XOR 密钥**，不是高德配置。
- 编码格式（已破解）：
  ```
  记录头 = 00 01 01 00 | LEN(1B) | 00 | VALUE(LEN 字节)
  VALUE[0] = 本条 XOR 密钥；明文 = VALUE[1:] 逐字节 XOR VALUE[0]
  ```
- 解出 **59 条记录，全部是模拟器/Root/VM 特征文件路径**。完整明文（节选证据）：

```
/dev/socket/qemud          /dev/qemu_pipe           /goldfish
/system/lib/libc_malloc_debug_qemu.so               /sys/qemu_trace
/system/bin/microvirt-prop  /system/lib/libdroid4x.so  /system/bin/windroyed
/system/bin/nox-prop  /system/bin/ttVM-prop  /system/bin/droid4x-prop
/data/.bluestacks.prop  /data/app/com.bluestacks.appmart-1.apk  ...home/searchapp/setup
/dev/vboxuser  /fstab.vbox86  /init.vbox86.rc  /sys/bus/pci/drivers/vboxguest/*
/init.svc.droid4x  /init.svc.noxd  /init.svc.microvirtd
/androVM.vbox_dpi  /system/bin/qemu_props  /system/bin/androVM-prop
/system/lib/arm/libhoudini.so（x86 转译层）  /system/lib/libali{gl2,tag}.so
/system/lib/libcloudlet{event,os}.so  /dev/socket/genyd  /dev/socket/baseband_genyd
/system/lib/{vbox,nemu}{guest,sf,video}.ko  /system/lib/vpipe*.ko
/ueventd.{nox,android_x86}.rc  /init.{nox,android_x86}.rc  /fstab.nox
```
覆盖的模拟器：QEMU/Goldfish、BlueStacks、夜神(Nox)、逍遥(microvirt)、Droid4X、Genymotion(genyd)、AndroVM、VirtualBox、NemuVM、雷电(vbox86) 以及 Houdini ARM 转译。

锐评点：这是典型的**反作弊/防代刷打卡指纹**。校园体育打卡 app 在端侧检测设备是否模拟器，目的是阻止学生用模拟器伪造跑步/体测数据，但反过来也说明 app 持续在做设备环境探测（读取大量系统路径），属于强环境感知行为。

---

## 3. 【高价值】明文 JSON 配置 —— 第三方 SDK 域名/AppID（原样抄录）

### 3.1 `ksad_idc.json`（快手广告/内容 SDK 的 IDC 域名表）
```
api : open.e.kuaishou.com / open.e.kuaishou.cn
ulog: ulog-sdk.gifshow.com / ulog-sdk.ksapisrv.com
cdn : w1.kskwai.com / w2.kskwai.com / w1.gskwai.com / w2.gskwai.com
zt  : zt.gifshow.com / api.kuaishouzt.com / api.kwaizt.com
```
证据：app 内置**快手广告/联盟 SDK**（gifshow=快手），打卡 app 里塞快手广告域名属于广告 SDK 堆叠的延续。

### 3.2 `supplierconfig.json`（OAID 移动安全联盟厂商配置）
```
supplier.vivo.appid = 100215079
supplier.xiaomi = {}  huawei = {}  oppo = {}
```
证据：用于 OAID（匿名设备标识符）采集；vivo 渠道注册了 appid `100215079`。OAID 是用于广告追踪/设备画像的标识。

### 3.3 `com.tencent.open.config.json`（QQ 互联）
```
Common_ta_enable = 1     (打开腾讯统计上报)
Common_frequency = 24
```

### 3.4 华为 GRS 路由配置（HMS 全球路由，非本 app 私有）
- `grs_sdk_server_config.json`：grs.dbankcloud.{com,cn,asia,eu} / grs.platform.dbankcloud.ru
- `grs_sdk_global_route_config_mlkit.json`：MLKit 分析上报域名
  metrics1.data.hicloud.com:6447 / metrics-dra.dt.hicloud.com:6447 / metrics5.data.hicloud.com:6447 / metrics.dt.dbankcloud.ru
- 说明：这是华为 HMS Core/MLKit SDK 标准内置文件，证明集成了华为 ML Kit（配合下面的 pose 模型）。

---

## 4. 体测姿态模板 `assets\pose\*.csv`（18 个，业务核心数据）

- 结构：每行 = `图片帧名, 动作标签label, 99 个浮点数`（共 101 列）。99 = **MediaPipe/MLKit Pose 33 个关键点 × (x,y,z)**。
- 这是训练好的"标准动作样本库"，端侧用 KNN/模板匹配判定动作阶段（up/down/open/close）。
- 各文件动作与标签（已统计）：

| CSV | 动作 | 标签（计数） |
|---|---|---|
| pushups_up_out_basic | 俯卧撑+深蹲混合 | pushups_up/down, squats_up/down |
| squat_csvs_out_basic | 深蹲 | squat_up(191)/squat_down(225) |
| jump_csvs_out_basic | 开合跳 | jump_open(785)/jump_close(718) |
| yinti_csvs_out_basic | 引体向上 | up/down |
| jiantui_csvs_out_basic | 健腿/高抬 | up/down |
| gaotaitui | 高抬腿 | up/down |
| shuipingkaihetiao / zhibikaihetiao / down_jump_close | 水平/直臂/开合跳 | open/close |
| kuo_xiong | 扩胸 | open/close |
| tiaosheng | 跳绳 | up/down |
| shou_bi_hua_quan | 手臂画圈 | up/down |
| zha_ma_bu | 扎马步 | up/down |
| houtituitiao | 后踢腿跳 | up/down |
| shen_to_ce_xiang_shen_zhan / you_ti_ce / zuo_ti_ce | 侧向伸展/体侧 | left/normal/right |
| yuan_di_man_pao | 原地慢跑 | left/right |

无密钥/无敏感信息，但暴露了"哪些动作可被 AI 判定"的完整清单（可用于分析判定逻辑、构造对抗样本绕过）。

---

## 5. AI 模型文件归类（非加密，自带明文头）

### 5.1 PaddleLite 人脸活体模型（前几轮误标为 MNN，实为百度 Paddle）
6 个 `*.model.*` 文件头部是**明文 key=value 元数据**（非加密）：
```
align    : model_type=rgb_align    train_frame=paddle  pre_frame=paddle_lite
blur     : model_type=blur         threshold=0.45
detect   : model_type=detect_rgb   threshold=0.65   (人脸检测)
eyes     : model_type=eye_close
mouth    : model_type=mouth_close
occlusion: model_type=occlussion(原文拼写)
公共字段 : encrypt_version=2.0.0.0  model_revision=2.7_d13c94d9b7c90f764
```
配合 `baidu-idl-license.face-android`（百度 IDL 人脸 SDK license，纯 hex），确认这是**百度活体检测/人脸采集**模型组（detect/align/blur/eye/mouth/occlusion = 完整活体判定流水线：检测+对齐+模糊+睁眼+张嘴+遮挡）。注：另有 `detect.ms/corner.ms/angle.ms`（MSL2 魔数）是阿里 MNN 模型，两套人脸引擎并存。

### 5.2 Google MLKit Pose（TensorFlow Lite + protobuf）
- `mlkit_pose/*.tflite`：TFL3 魔数，`pose_landmark_detector_lite_f16_inf.tflite`(2.8MB) + `pose_person_detector_f16.tflite`(2.96MB)
- `mlkit_pose/*.binarypb`：MediaPipe 计算图（pose_tracking/non_tracking × cpu/gpu/nnapi）
- `mlkit_pose/benchmark_*.data`：实为 JPEG 测试图（伪 .data 扩展名）
- 用途：实时人体姿态识别，喂给第 4 节的 CSV 模板做动作计数。

---

## 6. 高德地图资源（`map_assets/`、`ae/`、`amap_*`）—— 大量伪 .data

- `map_assets/*.data` 绝大多数是 **gzip**（魔数 1f8b），解开后是地图样式/瓦片 JSON 或 PNG：
  - `config_*.data` 解压 = `{"data":[{"stylefile_sh":"style_1_sh","iconsfile":"icons_1,icons_9",...}]}`（地图样式索引）
  - `icons_*.data`/`style_*.data` = gzip 包的 PNG 图标/矢量样式
  - `bktile*.data`、`tmc_*_allinone.data`、`lineround.data` = 自定义二进制（魔数 `SB13 4d00` 或 `PVR\x03`），低熵，是地图渲染纹理/路况底图
- `amap_resource1_0_0.png` 其实是 **ZIP（APK 资源包）**，内含 22 个 `res/drawable-*/amap_map3d_*.png`（高德 3D 地图 UI 资源）
- `ae/`（高德 AR 导航引擎 AGNavi）：
  - `GNaviConfig.xml`：明文，仅目录配置 `./data_v6/ ./res920/`
  - `res.ck`：32 位 hex 校验值 `6a99be7e3b71ecdfbba3067b4547be1f`（md5 样式 checksum）
  - `res.zip`：内含 `global.db`，魔数 **`GDB0`**（非标准 SQLite，是高德自有 GeoDB 格式，无法用 sqlite 打开）
- 结论：高德 SDK 标准资源，无密钥/无敏感配置。

---

## 7. 其它已定性小文件

| 文件 | 类型 | 内容 |
|---|---|---|
| `.jgapp` | 文本 16B | 360 加固 appid `7418fdaab59b1c0c`（前几轮已定性） |
| `PublicSuffixDatabase.list` | okhttp PSL | 公共后缀表（含 salesforce.com 等），okhttp 内置，非敏感 |
| `map_assets/anscii.fnt` | BMFont | 位图字体描述 `info face="Arial"` |
| `amap_sdk_shaders/*.glsl` | 明文 GLSL | OpenGL 着色器源码 |
| `AAChart*.js / AAHighcharts*.js` | JS 库 | Highcharts 图表（体测数据可视化） |
| `dexopt/baseline.prof*` | ART profile | 启动优化基线（前几轮已定性） |
| `sightplus/argame0*.jpg` | JPEG | AR 小游戏背景图 |
| `lottie_json/*.json` | Lottie 动画 | shake_phone/swipe_right/twist 引导动画 |

---

## 8. 加密/可解文件最终清单

| 文件 | 表观 | 实际 | 是否解开 |
|---|---|---|---|
| **na.czl** | 高熵 7.24 | XOR-TLV 模拟器黑名单 | ✅ 59 条全解出 |
| **libwbsafeedit×4** | ELF | 腾讯密码控件，含硬编码 DES/AES 密钥 | ✅ strings 提取密钥 |
| map_assets/*.data | 高熵 8.0 | gzip 压缩的地图资源 | ✅ 全部 gunzip |
| *.bks (3) | 高熵 7.6 | BouncyCastle 证书库（口令保护，含证书非私钥） | 标准库，未爆破口令 |
| *.model.* / *.ms / *.tflite | 高熵 8.0 | AI 模型权重（明文头+二进制权重） | 头已读，权重无需解 |
| ae/res.zip→global.db | GDB0 | 高德私有 GeoDB | 非 SQLite，未解（地图数据，无敏感） |

**真正藏敏感信息的只有两个：`na.czl`（反作弊指纹）和 `libwbsafeedit`（硬编码弱密钥）。** 其余高熵文件都是压缩资源或模型权重，无密钥。

---

## 9. 给技术锐评的弹药（一句话版）

1. 腾讯 QQ OpenSDK 的 `libwbsafeedit` 在四种架构 native 库里**明文硬编码 DES 密钥 `asdfghjk` 和 AES 密钥 `4026aec5f46360286842041e8cd49856`**——密码框"安全加密"等于裸奔。
2. `na.czl` 是 59 条模拟器/VM 检测路径黑名单（XOR 弱混淆，首字节即密钥），证明 app 做强环境探测，主要为防代刷打卡。
3. 一个校园打卡 app 内置了**快手广告 SDK（ksad_idc.json）、OAID 厂商采集（vivo appid 100215079）、腾讯统计、华为 HMS/MLKit、百度活体 + 阿里 MNN + Google MLKit 三套 AI 引擎**——SDK 与广告/追踪能力严重堆叠。
4. 体测判定全靠 `pose/*.csv` 端侧模板匹配（明文，33 关键点），判定逻辑完全暴露在客户端。


