# 体适能 APK —— com.acse.ottn 脱壳源码取证分析

> 取证对象：`dsh-vm/dumps/jadx_out/cap_8/sources/com/acse/ottn/`（全量 472 个 `.java`，含 `._` AppleDouble 垃圾文件，实际源码约 236 个类）
> 反编译形态：jadx 输出为**类 smali 的寄存器伪汇编**（含 `r8-map-id` 注释、`StubApp.interface11()` 加固桩），部分 Activity 的 `onCreate` 被抽为 `public native void onCreate(...)`（壳保护），但方法体其余部分与字符串常量完整可读。
> 结论先行：**com.acse.ottn 不是普通广告 SDK，而是一套「无障碍自动点击 + 淘宝客/电商导流 + 广告刷量 + 插件静默安装」的灰产 SDK**，服务器下发任务、本地自动化执行、导流变现闭环完整。

---

## 一、总览与类地图

### 1.1 组件清单（对照 manifest 已知能力）

| 类别 | 类 | 文件 | 一句话职责 |
|---|---|---|---|
| 无障碍服务 | `ShopHelperService` | `service/ShopHelperService.java` | 事件分发中枢，把无障碍事件交给自动化引擎 `d` |
| 自动化引擎 | `d` | `d.java`（5450 行） | 页面识别 + 自动滚动/自动点击"立即领取"/点击京东标题 + 心跳 |
| 导流跳转器 | `l4` | `l4.java`（665 行） | deeplink / 微信小程序 / 淘口令 / H5 落地页分发 |
| 页面编码表 | `o` | `o.java`（603 行） | 目标 App 包名→页面编码（tbsy/jdwm/tmsy/…） |
| 埋点/心跳 | `q2` | `q2.java`（564 行） | 设备指纹 + 心跳上报 + 服务器配置回写（含 AES key） |
| 网络层 | `q3`/`g0`/`l1`/`j4` | 同名 `.java` | Retrofit 基类 + 两套统计域名 + 全部 C2 接口 |
| 安装器 | `w1` | `w1.java`（277 行） | 释放内置 APK（detn.mp3）并触发 INSTALL_PACKAGE |
| 设备管理 | `MyDeviceAdminReceiver`/`l2`/`b4` | `receiver/`+`l2.java`+`b4.java` | 设备管理员激活检测 + "ScreenLock" 悬浮锁屏层 |
| Home键/熄屏 | `HomeKeyReceiver`/`m1` | `receiver/`+`m1.java` | 监听 Home/熄屏 → 关广告 Activity / 弹导流弹窗 |
| 常驻服务 | `MainService` 等 11 个 | `service/*.java` | 承接服务器下发的 `AccessiblityModel` 任务 |
| 落地页 | `SeedingLoadingActivity`/`SeedWebViewActivity`/`ExcessActivity`/`WhiteActivity`/`WXActivity`/`TransparentGreenActivity`/`AccessibiltyTsnPermissionGreenActivity` | `activity/*.java` | H5 导流页 / 微信小程序 / 权限诱导 |
| 配置常量 | `l0` | `l0.java`（166 行） | 宿主包名白名单、AES key、电池白名单开关 |
| 存储 | `n3` | `n3.java`（189 行） | MMKV 键值存储（含迁移） |
| 时间工具 | `s0` | `s0.java`（511 行） | 日期/时分工具（供频控用） |
| 任务模型 | `model/AccessiblityModel.java` 等 | `model/*.java` | 服务器任务/广告/插件数据模型 |

### 1.2 宿主关系（`l0.java:77-90`）

```java
String r3 = "com.acse.oozk"                                  // l0.java:77  统计渠道包名
String r1 = "com.zjwh.android_wh_physicalfitness"            // l0.java:81  ★宿主=体适能
String r1 = "com.huachenjie.shandong_school"                 // l0.java:83  华辰杰·山东学校
String r1 = "com.huachenjie.shandong_school_pro"             // l0.java:85
String r1 = "com.bxkj.student"                               // l0.java:87  博学·学生
String r1 = "com.lptiyu.tanke"                               // l0.java:89  乐跑体育·坦克
```

说明：`com.acse.ottn` 是一套被**多个校园体育/体测/校园跑类 App 内嵌的灰产 SDK**；`com.acse.oozk` 是它自己的统计包名（对应域名 `tongji.oozk.cn`）。

---

## 二、逐组件行为证据

### 2.1 ShopHelperService —— 无障碍事件分发中枢

`service/ShopHelperService.java` 的 `onAccessibilityEvent`（106-290 行）按事件类型分发：

| 事件类型 | 行为 | 证据行 |
|---|---|---|
| `TYPE_WINDOW_STATE_CHANGED`(32) | `d.d().a(this, event)` 交给自动化引擎做**页面识别** | 259-265 |
| `TYPE_VIEW_CLICKED`(1)/`TYPE_VIEW_LONG_CLICKED`(2) | `d.d().b(this, event)` 点击事件处理 | 281-284 |
| `TYPE_WINDOWS_CHANGED`(4194304) | `d.d().h(this)` | 141-145 |
| `TYPE_VIEW_SCROLLED`(4096) | `d4.c().a(this)` 滚动处理 | 226-228 |
| `TYPE_VIEW_TEXT_SELECTION_CHANGED`(8192) | **微信识别**：包名==`com.tencent.mm` 且类名==`android.widget.TextView` → `b.c().a(2000)` + `d.d().e()` | 188-223 |

关键字符串原文（微信匹配，214-216 行）：

```java
java.lang.String r1 = "com.tencent.mm"          // ShopHelperService.java:211
java.lang.String r0 = "android.widget.TextView"  // ShopHelperService.java:215
```

启动器检测 `getCurrentAppLocation`（24-93 行）判断用户是否在桌面：

```java
"com.miui.home.launcher.Launcher"                    // :74  MIUI
"com.bbk.launcher2.Launcher"                          // :66  vivo/OPPO
"com.huawei.android.launcher.unihome.UniHomeLauncher" // :58  华为
"com.android.launcher.Launcher"                       // :50  原生
"com.hihonor.android.launcher.unihome.UniHomeLauncher"// :42  荣耀
```

`onServiceConnected`（316-336）自动执行 SDK 初始化 `AcseHelpManager$InitSdk.build()` —— 即无障碍一被授予即自启全套逻辑。

### 2.2 d.java —— 自动化引擎（最核心）

`d.java`（5450 行）是「读屏 + 滚动 + 点击」执行器，硬编码约 **50 个目标 App 的活动类名**做页面识别：

```
com.taobao.android.detail.wrapper.activity.DetailActivity      // d.java:2214
com.taobao.tao.detail.activity.DetailActivity                  // d.java:2376
com.taobao.tao.backflow.dialog.a                                // d.java:2412  ★淘宝回流弹窗
com.taobao.tao.TBMainActivity                                   // d.java:2484
com.taobao.tao.welcome.Welcome                                  // d.java:2520
com.tmall.wireless.maintab.module.TMMainTabActivity             // d.java:2538
com.tmall.wireless.xdetail.activity.TMXDetailActivity           // d.java:2328
com.jd.lib.productdetail.ProductDetailActivity                  // d.java:2436  ★京东商品详情
com.jd.lib.hourlygo.home.HourlyGoLayerActivity                  // d.java:1992  ★京东小时购
com.jingdong.app.mall.MainFrameActivity                         // d.java:2442
com.ss.android.ugc.aweme.main.MainActivity                      // d.java:2346  抖音
com.bytedance.android.shopping.anchorv4.containers.ProductDetailActivity // d.java:2256  抖音电商
com.xingin.xhs.index.v2.IndexActivityV2                         // d.java:2334  小红书
com.yxcorp.gifshow.HomeActivity                                  // d.java:2340  快手
com.sina.weibo.SplashActivity                                   // d.java:2370  微博
com.alipay.android.living.activity.LivingNotTransparentDetailActivity // d.java:2388  支付宝生活
com.tencent.qqlive.vc.VCPageActivity                             // d.java:2466  腾讯视频
com.iqiyi.vipcashier.activity.PhonePayActivity                   // d.java:2208  爱奇艺
com.youku.android.paysdk.cashier.VipPaymentActivity              // d.java:2580  优酷
com.sankuai.waimai.business.* (多个)                             // d.java:2037/2322/2472/2352/2226  美团/外卖/超市
me.ele.shopdetailv2.ShopDetailV2Activity                         // d.java:2229  饿了么
com.achievo.vipshop.* (多个)                                     // d.java:2250/2358/2406  唯品会
com.didi.sdk.app.MainActivity                                    // d.java:2280  滴滴
com.suning.mobile.ebuy.host.MainActivity                         // d.java:2460  苏宁
com.baidu.netdisk.advertise.ui.AdvertiseContentActivity          // d.java:2292  百度网盘
com.yum.android.superkfc.ui.v5.HomeV5Activity                    // d.java:2592  肯德基
com.mc10086.cmcc.view.tabs.AppTabFragment                        // d.java:2478  中国移动
com.sinovatech.unicom.basic.ui.activity.MainActivity             // d.java:2220  中国联通
com.ct.client.activity.MainActivity                              // d.java:2454  中国电信
com.starbucks.cn.home.revamp.RevampMainActivity                  // d.java:2310  星巴克
com.huaxiaozhu.sdk.app.MainActivity                              // d.java:2430  花小猪
...
```

页面被识别后执行的动作（字符串证据）：

| 动作 | 字符串 | 证据行 |
|---|---|---|
| 自动点击"立即领取" | `"立即领取"` + `"=找到了 并且已经点击 text ="` | d.java:3141、4914、3713 |
| 点击处文字上报 | `"点击处文字="` | d.java:4178 |
| 点击京东标题 | `getJDTitleId jd id is ` / `jd_view_id` / `click_jd_title` | d.java:3471、3479、4813、4843 |
| 停留读屏时长 | `b.c().a(3500)` 等（3500/2000ms） | d.java:3137-3138、219 |
| 页面编码 | `"jdwm"`/`"tbsy"`/`"tmsy"`/`"jdsy"`/`"jdxq"`/`"aqy"`/`"zfbvideo"`/`"tm"` | d.java:2846、3170、3269、3332、2830、2950+ |
| 淘宝识别 | `"当前是淘宝"` / `"当前是淘宝请求"` / `"当前是淘宝请求间隔"` | d.java:3352、3371、3390 |
| 天猫识别 | `"com.tmall.wireless"` | d.java:2972、3141 |
| 心跳上报 | `"appHeartbeat"` | d.java:4649、5380 |

> 语义：当用户打开淘宝/京东/天猫/美团/抖音电商等 App 的**特定详情/活动页**时，该 SDK 通过无障碍读取节点树，自动**滚动页面**（读屏停留，模拟"浏览时长"）、自动点击**"立即领取"**优惠券按钮、点击**京东商品标题**，并将"点击处文字"作为点击数据上报。这是典型的**广告刷量 + 领券自动化**行为。

### 2.3 落地页 / WebView / 小程序

- `SeedWebViewActivity.java` 的 `a(String url)`（113-197 行）配置了一个**全权限 WebView**：
  ```java
  r0.setJavaScriptEnabled(1)                  // :131
  r0.setJavaScriptCanOpenWindowsAutomatically(1) // :133
  r0.setPluginState(PluginState.ON)           // :134
  r0.setAllowFileAccess(1)                    // :136
  r0.setMixedContentMode(0)                   // :141  MIXED_CONTENT_ALWAYS_ALLOW
  // 反射开启 setAllowUniversalAccessFromFileURLs(true)   // :149-158
  r0.loadUrl(r8)                              // :172
  ```
  `shouldOverrideUrlLoading` 一律 `loadUrl(r2)` 在本 WebView 内打开（:48-52）。加载的 URL 由服务器模型 `spop_link`/`origin_url` 经 `l4.java` 传入（见 2.4）。`onCreate` 为 native（壳保护），但 `loadH5Url` 日志与加载逻辑完整。

- `SeedingLoadingActivity.java`：收到回调 `(code, url)` 后写入 code（`o.c().a(ctx, code)`，:67-69）并调用 `l4.c().a(ctx, url, "", "")` 跳转（:73-75），延时 finish。是导流中转页。

- `WXActivity.java`（48-67 行）：用微信 OpenSDK `WXLaunchMiniProgram.Req` **拉起微信小程序**（`userName`+`path` 从输入框取值，属调试/能力页面，但同款逻辑在 `l4.java:474-487` 被正式使用）。

### 2.4 l4.java —— 导流分发器（StartAppUtil）

`l4.java` 是"自动开券/自动跳转"的决策器：

- **跳转方式** `a(ctx, deeplink, link, jump_type)`（474-525 行）：
  - `jump_type=="1"` → 拉起微信小程序（`WXLaunchMiniProgram`，userName=link、path=deeplink）
  - 否则 → `Intent(ACTION_VIEW).setData(Uri.parse(deeplink)).addCategory(BROWSABLE)` + `FLAG_ACTIVITY_NEW_TASK` 直接 startActivity（即 `taobao://`/`tbopen://` 等 deeplink）
  - 失败 → 上报 `"open_browser_fail"`（:520-522）

- **自动开券分发**（`auto_open_coupon` 字段，140-305 行）：
  | 值 | 动作 | 证据行 |
  |---|---|---|
  | `"1"` | 启动 `SeedingLoadingActivity`（H5 导流页） | 147-149、585-614 |
  | `"3"` | 启动 `ExcessService`（带 password/deeplink/link/jump_type） | 178-239 |
  | `"4"` | 启动 `WebViewService`（`url`=origin_url、`shortLink`=tkl_turn_url） | 246-268 |
  | `"5"` | **复制淘口令** `o.c().a(service, tkl_turn_url)` 再跳转 | 156-170 |
  | `"6"`/`"8888"` | 弹悬浮窗广告 | 273-305 |

- 落地页选择 `b(ctx, model)`（548-664 行）：`to_loading=="1"`→`SeedingLoadingActivity`、`"2"`→`ExcessActivity`，否则 deeplink 跳转。

### 2.5 各 Service 行为

| Service | onCreate/onStartCommand 行为 | 证据 |
|---|---|---|
| `CircleFlowService` | 收到 `model`(AccessiblityModel) → `i0.d().b(this, model)`（悬浮球/转盘流程） | CircleFlowService.java:56-60 |
| `CountdownService` | → `o0.a().b(this, model)`（倒计时任务） | CountdownService.java:54-55 |
| `ExcessiveService` | 处理 `sessionID`/`open_battery_white`（电池白名单），随后 `stopSelf()` | ExcessiveService.java:44-75 |
| `StartProcreeService` | 仅打日志 `"启动StartProcreeService"`，**空壳** | StartProcreeService.java:25-27 |
| `LjFirstService` | → `e2.a().a(this, model)`（"拉接/拉活首启"流程） | LjFirstService.java:63-64 |
| `MainService` | 按 `service_control=="0"/"1"` 调 `m2.c()`/`m2.a()`（主浮窗），实现 `a.u0` 回调 | MainService.java:154-175 |
| `WebViewService` | 含 TimerTask，承接 H5 页加载 | WebViewService.java:17/185 |

所有 Service 的共同点：**通过 Intent extra `"model"` 接收服务器下发的 `AccessiblityModel` 任务**再分发执行。

### 2.6 设备管理员 / 锁屏

- `MyDeviceAdminReceiver.java`：`onReceive` **为空实现**（:13-15）。即设备管理员激活后本身**无任何 onEnabled 回调动作**。
- `l2.java`（无障碍服务助手）：
  - 获取 `DevicePolicyManager`，构造 `ComponentName(this, MyDeviceAdminReceiver.class)` 并 `isAdminActive()`（86-91 行，SDK<28 分支）——用于**检测是否仍持有设备管理员权限**（防卸载/保持激活状态判断）。
  - 设置 `eventTypes|=32`、`flags|=32` 后 `setServiceInfo`（101-114 行，动态追加窗口状态监听）。
  - Handler 收到 `what==1` → `performGlobalAction(8)`（=**GLOBAL_ACTION_HOME，模拟 Home 键**）（45-51 行）。
- `b4.java`：名为 **ScreenLock** 的透明悬浮 ImageView（`ScreenLock_Width/Height/PositionX/Y`，6-9 行），用 `WindowManager.addView` 加到屏幕角落（128-170 行），OnClick 仅记录时间戳。是**锁屏/悬浮层**机制（配合 `startForeground` 类能力保持前台，但本包内未直接调用 `startForeground`）。

> 注意：全包内**未检索到 `lockNow()`** 调用；manifest 的 `force-lock` 能力在 com.acse 反编译 Java 层未见落地（可能在 native `onCreate` 或未使用）。

---

## 三、导流 / 变现目标清单

### 3.1 目标 App 包名/类名（导流与自动点击对象）

| 平台 | 包名/类名 | 出现处 |
|---|---|---|
| 淘宝 | `com.taobao.taobao`、`com.taobao.tao.main`、`com.taobao.shangou`（闪购）、`com.taobao.idlefish.home`（闲鱼）、`com.taobao.taobao.fz`、`com.taobao.tao.backflow.dialog.a` | o.java:359/375、d.java:2412 |
| 天猫 | `com.tmall.wireless`、`com.tmall.wireless.main` | o.java:375、d.java:2972 |
| 京东 | `com.jingdong.app.mall`、`com.jingdong.app.wm`、`com.jingdong.app.mall.main` | o.java:379/381、d.java:2442 |
| 抖音 | `com.ss.android.ugc.aweme.mall`、`com.ss.android.ugc.awemem` | o.java |
| 小红书 | `com.xingin.xhs` | o.java:361 |
| 快手 | `com.kuaishou.nebulam` | o.java:363 |
| 微博 | `com.sina.weibo.main` | o.java |
| 苏宁 | `com.suning.mobile.main` | o.java |
| 腾讯视频 | `com.tencent.qqlive` | o.java |
| 百度网盘 | `com.baidu.netdiskm` | o.java:367 |
| 支付宝/美团/滴滴/唯品会/肯德基/星巴克/花小猪/三运营商 | 见 2.2 表 | d.java |

### 3.2 服务器接口（变现/控制通道，`j4.java` 全量）

```java
POST api/plugin_change          // 更换插件         j4.java:6
POST api/an/gc/pn              // 无障碍取任务→AccessiblityModel  j4.java:9
POST api/an/gc/scroll          // 无障碍滚动任务→AccessiblityModel  j4.java:54
POST api/an/gc/mt_ele          // 美团/饿了么任务    j4.java:18
POST api/an/gc/allocation_app  // 分配要打开的应用(导流) j4.java:93
POST api/push_ad_ecpm          // 推送广告ECPM(广告变现) j4.java:60
POST api/an/gc/lon_lat         // 上报经纬度(GPS)   j4.java:69
POST api/sys_pic               // 上传系统图片/截图 j4.java:63
POST api/cut_down              // 返回 AdInfoModel(广告) j4.java:42
POST api/report                // 上报             j4.java:45
POST api/member                // 会员             j4.java:51
POST api/an/gc/verify / allocation_result / get_app_list / save_settings / local_ref / jlj / set_close_status / get_close_status ...
POST api/check_session / data_check / mobile_app / mobile_check / sys_state / time_limit / limit_tips / clear_ad_time / close_remind / close_plugin / plugin_check / oppo_state
```

### 3.3 域名 / C2 / 统计端点

| 域名 | 用途 | 证据 |
|---|---|---|
| `http://report.idazhe.net/ss/` | 埋点/心跳上报（release 基址） | g0.java:43 |
| `http://t.idazhe.net/ss/` | 上报（debug 基址） | g0.java:40 |
| `http://tongji.oozk.cn` | 统计（release 基址，oozk=自家包名） | l1.java:43 |
| `http://a.idazhe.net/ss/tongji_oozk_cn/` | 统计（debug） | l1.java:40 |
| `http://118.89.189.246` | **隐藏 C2 裸 IP**：日志过滤器刻意**不打印**含此 IP 的请求 | q3.java:36-37 |
| `https://www.idazhe.net/course/snt-*?name=省钱助手/DETN` | 服务协议/隐私（SNT=省钱助手） | h0.java:758/761/876/879 |
| `https://mh5.huachenjie.com/h5/contract/document.html?code=501/502/801/802` | 华辰杰协议页 | h0.java:646/653/806/813 |
| `https://www.boxkj.com/resources/user_agreement*.html` | 博学科技协议 | h0.java:632/792 |
| `https://api2.lptiyu.com/v3/api.php/Login/*` | 乐跑体育协议/接口 | h0.java:639/799 |
| `https://h5.gxapp.iydsj.com/gxapp/privacy_policy/*` | 另一渠道协议 | h0.java:625/785 |

> 网络层安全特征（`q3.java:84-89、153-158`）：自定义 `HostnameVerifier.verify()` **恒返回 true** + 自定义 `X509TrustManager`（`x3.d()`），即**信任所有 HTTPS 证书**（SSL 校验绕过）——灰产 SDK 的典型特征。

### 3.4 内置隐藏 APK（静默安装）

`w1.java`（InstallUtils）：
```java
// 从 assets 读 "detn.mp3"（实为 APK，伪装成音频）
InputStream r1 = assets.open("detn.mp3")            // w1.java:243
// 写入 getExternalFilesDir("apk")/text.apk
String r0 = r0.getPath() + "/text.apk"              // w1.java:264
r4.a(r1, r2);                                       // 拷贝字节 :270
r4.a(r2, r5);                                       // 触发安装 :271
// 安装：ACTION INSTALL_PACKAGE + application/vnd.android.package-archive
String r1 = "android.intent.action.INSTALL_PACKAGE"  // w1.java:129
r6.startActivityForResult(r0, 10010)                // w1.java:166
```
- `detn.mp3` 对应 `h0.java` 里协议页 `?name=DETN` —— 即**内嵌一个名为 DETN 的插件/母体 APK**，运行期释放并诱导安装（`startActivityForResult` 走系统安装器，需用户确认，非 root 静默，但属"引导安装第三方 APK"）。
- `PlunInstallModel`（isInstallPlun/isNewApk/packageName/version）用于上报本机是否已装该插件。

---

## 四、拉活链路

> 全包内**未发现** `AlarmManager`、`JobScheduler`、`startForeground` 的直接调用（与多数灰产 App 不同），拉活主要靠**广播监听 + 无障碍自持 + 前台服务化常驻**。

| 机制 | 证据 |
|---|---|
| 动态注册 `CLOSE_SYSTEM_DIALOGS`（Home/最近任务） | m1.java:411-416 |
| 动态注册 `SCREEN_OFF`（熄屏） | m1.java:417-422 |
| Home/熄屏时 `finishAndRemoveTask()` 关闭自家广告 Activity | m1.java:77、124、255 |
| 静态 `HomeKeyReceiver`（manifest 注册）监听 `homekey`/`recentapps` | HomeKeyReceiver.java:124-148 |
| Home 键触发"导流弹窗"频控：按当前时刻 `HHmm` 落在 [800,1400) 或 [1400,2100) 分上下午两个时段，且与 `am_show_seed_dialog`/`pm_show_seed_dialog` 记录不同才弹 | HomeKeyReceiver.java:98-114 |
| 无障碍 `onServiceConnected` 即自启 SDK（`AcseHelpManager.InitSdk.build()`） | ShopHelperService.java:325-329 |
| 无障碍 `performGlobalAction(8)` 模拟 Home（`l2` Handler） | l2.java:45-51 |
| 电池优化白名单诱导 `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` | b5.java:132 |
| 心跳上报后依据服务器返回重配（`aes_key`/`show_ad_activity`/`applet_data` 等） | q2.java:42-118 |

**埋点载荷**（`q2.java:221-321`）会采集：`sessionid`、`ak`(APP_KEY 联盟密钥)、`open_all_permission`、`flow_permission`(悬浮窗)、`accessiblity_permission`、`battery_permission`、`mobile_id`、`is_snt`、`accessiblity_list`、`maven_version=1.2.6.6`、`mobile`(品牌)、`mobile_version_release`、`app_versione`、`app_system_model`、`system_model`、`time`、`new_version` —— 是**完整的设备/权限画像 + 渠道回传**。

`q2.a()`（372-418 行）会**枚举本机所有已安装的无障碍服务**（应用名+包名+service 路径）上报 `accessiblity_list` —— 属**竞品/风控探测**。

---

## 五、"事实 / 推断"分界总结

### 事实（代码可证，均附行号）

1. 拥有无障碍服务并**实时读窗口、自动滚动、自动点击"立即领取"、点击京东标题**（ShopHelperService + d.java）。
2. 硬编码约 50 个电商/外卖/视频/出行 App 的**具体 Activity 类名**做精准页面识别（d.java）。
3. 服务器通过 `api/an/gc/*`、`api/push_ad_ecpm`、`api/cut_down` 等接口下发任务/广告/插件，含**淘口令(tkl)、deeplink、短链、微信小程序 userName/path**（j4.java + AccessiblityModel + l4.java）。
4. 内置**伪装成 detn.mp3 的 APK**，运行期释放为 text.apk 并触发安装（w1.java）。
5. **SSL 证书校验绕过**（HostnameVerifier 恒 true + 自定义 TrustManager，q3.java）且刻意**隐藏裸 IP 118.89.189.246 的请求日志**。
6. 上报**经纬度（lon_lat）、系统截图（sys_pic）、竞品无障碍服务清单（accessiblity_list）**。
7. 监听 Home 键/熄屏，频控弹出导流弹窗、关闭自家广告 Activity；无障碍自启、设备管理员激活检测、电池白名单诱导。

### 推断（由事实合理外推，非代码直接写死）

- "阅读/浏览/点击"自动化服务于**广告曝光刷量 + 淘宝客佣金（领券下单 CPS）**变现，属主动灰产而非被动广告展示。
- 多套协议域名（idazhe.net/省钱助手/DETN、huachenjie、boxkj、lptiyu、iydsj）表明这是一套**白标/多渠道分发的同源 SDK**，投放在校园体育类 App 中。
- `118.89.189.246` 被隐藏于日志、且基础地址抽象在 `q3.c()`，推测是**核心任务/C2 下发服务器**（可能下发 `api/an/gc/*` 任务与插件更新）。

### 分界结论

- **不是"广告 SDK 标准件"**：穿山甲/优量汇/GDT 等标准广告 SDK 不会申请无障碍服务做自动点击、不会硬编码目标 App 的内部 Activity、不会内置伪装 APK、不会绕过 SSL、不会上报经纬度/截图/竞品服务。
- **是"主动灰产行为"**：这是典型的"**购物返利/淘宝客导流 + 广告刷量 + 插件分发**"黑灰产 SDK，借"购物助手/省钱助手"名义，寄生在校园体育/体测 App（体适能、山东学校、学生、乐跑体育）中，通过无障碍权限在用户无感知下自动领券/浏览/点击并导流变现。

### 取证遗留

- 若干 Activity 的 `onCreate` 为 `native`（壳/加固），**业务基址(schoolUrl)在 native 侧解密（cap_4 b.java M()=385-422 → b0.java:161-168 → Transform.k）、落地 URL 由服务器模型字段（spop_link/origin_url/tkl_url）动态下发**，Java 层只能证明"服务器字段 → 传入 WebView/落地页"的完整链路，无法静态列出最终导流 URL 明文。（措辞细化依据：第8轮《native入口映射》§8.2/§8.3）
- 未在 com.acse 内发现 `lockNow()` 调用，`force-lock` 能力仅见于 manifest/资源，行为落地需结合 native 层或运行时动态验证。


---

## 六、后续深挖修正与新增（2026-08-14，完整论证见《体适能_脱壳取证_无障碍与保活机制.md》）

> 脱壳源码进一步深挖后，对本文 §2.1/§2.6 与 §四 的部分旧结论做**修正**，并新增三条实锤。逐条带文件:行号。

**A. 修正①：manifest 广播 action 与 Home 键监听归属**
- manifest 里 `BOOT_COMPLETED` / `ACTION_POWER_*` / `BATTERY_*` / `TIME_SET` / `TIMEZONE_CHANGED` / `DEVICE_STORAGE_*` / `CONNECTIVITY_CHANGE` 等广播 action **全部属于 androidx.work（WorkManager 的 `ConstraintProxy*` / `RescheduleReceiver`）**，与 acse.ottn 无关（`manifest_decoded.xml:1171-1210`）。
- acse 的 `HomeKeyReceiver` 在 manifest **无 `<intent-filter>`**，且 Java 层**无 registerReceiver**（`HomeKeyReceiver.java:149` 仅空 `onReceive`，半成品空壳）。
- acse 真正生效的 Home/熄屏监听是 **`m1.java` 动态注册** `CLOSE_SYSTEM_DIALOGS` + `SCREEN_OFF` → `finishAndRemoveTask()` 抹掉自家导流 Activity（`m1.java:409-427/75-77/122-124`）。

**B. 修正②：保活不靠 startForeground/AlarmManager/JobScheduler/BOOT_COMPLETED**
- acse 完全**不靠** `startForeground` / `AlarmManager` / `JobScheduler` / `BOOT_COMPLETED` 保活（全树 grep 0 命中）；`StartProcreeService` 是空壳（`StartProcreeService.java:30`，仅日志）。
- 真实保活 = **无障碍系统服务自持 + 10 个 exported Service + 8 套 TYPE_APPLICATION_OVERLAY 悬浮窗 + 独立进程 .LoadingActivity + Green Activity 逐项诱导开启权限**。
- **"被杀后 Java 层自动复活"不成立**。

**C. 新增实锤：手势执行器 + 自动抢微信红包 + 截屏上报链**
- `b.java` 是点击/滚动/输入/坐标手势执行器（`performAction` CLICK=16 / LONG_CLICK=32 / SCROLL=4096 / SET_TEXT=2097152、`dispatchGesture`、`performGlobalAction`）。
- **自动抢微信红包**：`b.java:1189-1354` 找 `com.tencent.mm:id/e7t` + "[微信红包]" 点击；`b.java:1144-1164` CountDownTimer 每 50ms 找 `com.tencent.mm:id/gix`。
- `a3.java` 截屏引擎 `takeScreenshot` → 按节点 bounds 裁剪 → JPEG(q20) → Base64（`imageBase64` 字段）→ `api/sys_pic` 上报（`a3.java:142-246/600-636`、`j4.java:63`）。
- 触发双轨 = 本地 `Timer.scheduleAtFixedRate` 每日心跳 + C2 下发 `AccessiblityModel`（约 45 字段：key_content / find_type / tkl_url / spop_deeplink / auto_open_coupon / service_control 等）。

**D. 新增实锤：锁屏触发点**
- `l2.java:45-51` `performGlobalAction(8)` = `GLOBAL_ACTION_LOCK_SCREEN`（SDK≥28）——等价 lockNow 的无障碍锁屏触发点。
- 配合 `res/cq.xml` force-lock 设备管理员策略 + `b4.java` `TYPE_ACCESSIBILITY_OVERLAY` 锁屏悬浮层。

