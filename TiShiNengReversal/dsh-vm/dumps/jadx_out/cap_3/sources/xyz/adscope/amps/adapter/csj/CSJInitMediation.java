package xyz.adscope.amps.adapter.csj;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CSJInitMediation extends xyz.adscope.amps.init.inter.AMPSChannelInitMediation {
    private static xyz.adscope.amps.adapter.csj.CSJInitMediation instance;
    private static java.util.List<xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack> mCallBackList;
    private boolean isInit;
    private boolean isInitIng;




    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            xyz.adscope.amps.adapter.csj.CSJInitMediation.mCallBackList = r0
            return
    }

    public CSJInitMediation() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInit = r0
            r1.isInitIng = r0
            return
    }

    public static /* synthetic */ boolean access$002(xyz.adscope.amps.adapter.csj.CSJInitMediation r0, boolean r1) {
            r0.isInitIng = r1
            return r1
    }

    public static /* synthetic */ boolean access$102(xyz.adscope.amps.adapter.csj.CSJInitMediation r0, boolean r1) {
            r0.isInit = r1
            return r1
    }

    public static /* synthetic */ java.util.List access$200() {
            java.util.List<xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack> r0 = xyz.adscope.amps.adapter.csj.CSJInitMediation.mCallBackList
            return r0
    }

    private static com.bytedance.sdk.openadsdk.TTAdConfig buildConfig(xyz.adscope.amps.init.AMPSInitAdapterConfig r3) {
            com.bytedance.sdk.openadsdk.TTAdConfig$Builder r0 = new com.bytedance.sdk.openadsdk.TTAdConfig$Builder
            r0.<init>()
            java.lang.String r1 = r3.getAppId()
            r0.appId(r1)
            boolean r1 = r3.isDebug()
            r0.debug(r1)
            r1 = 0
            r0.supportMultiProcess(r1)
            r0.useMediation(r1)
            java.lang.String r1 = getData(r3)
            r0.data(r1)
            xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r3.getPrivacyConfig()
            xyz.adscope.amps.adapter.csj.CSJInitMediation$2 r2 = new xyz.adscope.amps.adapter.csj.CSJInitMediation$2
            r2.<init>(r1, r3)
            r0.customController(r2)
            java.util.Map r3 = r3.getLocalExtraMap()     // Catch: java.lang.Exception -> L121
            if (r3 != 0) goto L38
        L33:
            com.bytedance.sdk.openadsdk.TTAdConfig r3 = r0.build()     // Catch: java.lang.Exception -> L121
            return r3
        L38:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_CSJ     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L49
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_CSJ     // Catch: java.lang.Exception -> L121
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> L121
            goto L4a
        L49:
            r3 = 0
        L4a:
            if (r3 != 0) goto L4d
            goto L33
        L4d:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_PAID     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L6a
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_PAID     // Catch: java.lang.Exception -> L121
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L6a
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L121
            if (r2 == 0) goto L6a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L121
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L121
            r0.paid(r1)     // Catch: java.lang.Exception -> L121
        L6a:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_KEYWORDS     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L83
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_KEYWORDS     // Catch: java.lang.Exception -> L121
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L83
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L121
            if (r2 == 0) goto L83
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L121
            r0.keywords(r1)     // Catch: java.lang.Exception -> L121
        L83:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_TITLE_BAR_THEME     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto La0
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_TITLE_BAR_THEME     // Catch: java.lang.Exception -> L121
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto La0
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L121
            if (r2 == 0) goto La0
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L121
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L121
            r0.titleBarTheme(r1)     // Catch: java.lang.Exception -> L121
        La0:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_ALLOW_SHOW_NOTIFY     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto Lbd
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_ALLOW_SHOW_NOTIFY     // Catch: java.lang.Exception -> L121
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto Lbd
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L121
            if (r2 == 0) goto Lbd
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L121
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L121
            r0.allowShowNotify(r1)     // Catch: java.lang.Exception -> L121
        Lbd:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_DIRECT_DOWNLOAD_NETWORK_TYPE     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto Ldf
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_DIRECT_DOWNLOAD_NETWORK_TYPE     // Catch: java.lang.Exception -> L121
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto Ldf
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Exception -> L121
            boolean r2 = r2.isArray()     // Catch: java.lang.Exception -> L121
            if (r2 == 0) goto Ldf
            int[] r1 = (int[]) r1     // Catch: java.lang.Exception -> L121
            int r2 = r1.length     // Catch: java.lang.Exception -> L121
            if (r2 <= 0) goto Ldf
            r0.directDownloadNetworkType(r1)     // Catch: java.lang.Exception -> L121
        Ldf:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_AGE_GROUP     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto Lfc
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_AGE_GROUP     // Catch: java.lang.Exception -> L121
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto Lfc
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L121
            if (r2 == 0) goto Lfc
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L121
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L121
            r0.setAgeGroup(r1)     // Catch: java.lang.Exception -> L121
        Lfc:
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_THEME_STATUS     // Catch: java.lang.Exception -> L121
            boolean r1 = r3.containsKey(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L119
            java.lang.String r1 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_KEY_THEME_STATUS     // Catch: java.lang.Exception -> L121
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L121
            if (r1 == 0) goto L119
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L121
            if (r2 == 0) goto L119
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L121
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L121
            r0.themeStatus(r1)     // Catch: java.lang.Exception -> L121
        L119:
            xyz.adscope.amps.adapter.csj.CSJInitMediation$3 r1 = new xyz.adscope.amps.adapter.csj.CSJInitMediation$3     // Catch: java.lang.Exception -> L121
            r1.<init>(r3)     // Catch: java.lang.Exception -> L121
            r0.setMediationConfig(r1)     // Catch: java.lang.Exception -> L121
        L121:
            com.bytedance.sdk.openadsdk.TTAdConfig r3 = r0.build()
            return r3
    }

    public static com.bytedance.sdk.openadsdk.TTAdManager get() {
            com.bytedance.sdk.openadsdk.TTAdManager r0 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()
            return r0
    }

    private static java.lang.String getData(xyz.adscope.amps.init.AMPSInitAdapterConfig r10) {
            java.lang.String r0 = "name"
            java.util.Map r1 = r10.getLocalExtraMap()     // Catch: java.lang.Exception -> L9d
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.String r3 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_CSJ     // Catch: java.lang.Exception -> L9d
            boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Exception -> L9d
            if (r3 == 0) goto L1a
            java.lang.String r3 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_CSJ     // Catch: java.lang.Exception -> L9d
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> L9d
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L9d
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 == 0) goto L34
            java.lang.String r3 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_DATA     // Catch: java.lang.Exception -> L9d
            boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Exception -> L9d
            if (r3 == 0) goto L34
            java.lang.String r3 = xyz.adscope.amps.common.AMPSConstants.CSJ_LOCAL_EXTRA_DATA     // Catch: java.lang.Exception -> L9d
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> L9d
            if (r1 == 0) goto L34
            boolean r3 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L9d
            if (r3 == 0) goto L34
            r2 = r1
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch: java.lang.Exception -> L9d
        L34:
            if (r2 != 0) goto L3b
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L9d
            r2.<init>()     // Catch: java.lang.Exception -> L9d
        L3b:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L9d
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = "is_shake_ads"
            java.lang.String r5 = "personal_ads_type"
            r6 = 0
            if (r3 != 0) goto L59
            boolean r3 = r1.contains(r5)     // Catch: java.lang.Exception -> L9d
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Exception -> L9d
            if (r1 == 0) goto L58
            r6 = 1
            r6 = r3
            r1 = 1
            goto L5a
        L58:
            r6 = r3
        L59:
            r1 = 0
        L5a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9d
            r3.<init>()     // Catch: java.lang.Exception -> L9d
            r3.put(r0, r5)     // Catch: java.lang.Exception -> L9d
            boolean r5 = r10.isPersonalRecommend()     // Catch: java.lang.Exception -> L9d
            java.lang.String r7 = "1"
            java.lang.String r8 = "0"
            java.lang.String r9 = "value"
            if (r5 != 0) goto L72
            r3.put(r9, r8)     // Catch: java.lang.Exception -> L9d
            goto L75
        L72:
            r3.put(r9, r7)     // Catch: java.lang.Exception -> L9d
        L75:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9d
            r5.<init>()     // Catch: java.lang.Exception -> L9d
            r5.put(r0, r4)     // Catch: java.lang.Exception -> L9d
            xyz.adscope.amps.config.AMPSPrivacyConfig r10 = r10.getPrivacyConfig()     // Catch: java.lang.Exception -> L9d
            if (r10 == 0) goto L8e
            boolean r10 = r10.isCanUseShakeAd()     // Catch: java.lang.Exception -> L9d
            if (r10 == 0) goto L8a
            goto L8b
        L8a:
            r7 = r8
        L8b:
            r5.put(r9, r7)     // Catch: java.lang.Exception -> L9d
        L8e:
            if (r6 != 0) goto L93
            r2.put(r3)     // Catch: java.lang.Exception -> L9d
        L93:
            if (r1 != 0) goto L98
            r2.put(r5)     // Catch: java.lang.Exception -> L9d
        L98:
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Exception -> L9d
            return r10
        L9d:
            java.lang.String r10 = ""
            return r10
    }

    public static synchronized xyz.adscope.amps.adapter.csj.CSJInitMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.adapter.csj.CSJInitMediation> r0 = xyz.adscope.amps.adapter.csj.CSJInitMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.adapter.csj.CSJInitMediation r1 = xyz.adscope.amps.adapter.csj.CSJInitMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.adapter.csj.CSJInitMediation> r1 = xyz.adscope.amps.adapter.csj.CSJInitMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.adapter.csj.CSJInitMediation r2 = new xyz.adscope.amps.adapter.csj.CSJInitMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.adapter.csj.CSJInitMediation.instance = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            goto L1c
        L18:
            xyz.adscope.amps.adapter.csj.CSJInitMediation r1 = xyz.adscope.amps.adapter.csj.CSJInitMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private void initCSJSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r3, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r4) {
            r2 = this;
            android.content.Context r0 = xyz.adscope.amps.AMPSSDK.getContext()
            if (r0 == 0) goto L2b
            if (r3 == 0) goto L2b
            java.lang.String r1 = r3.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L13
            goto L2b
        L13:
            android.content.Context r4 = r0.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.bytedance.sdk.openadsdk.TTAdConfig r3 = buildConfig(r3)
            com.bytedance.sdk.openadsdk.TTAdSdk.init(r4, r3)
            xyz.adscope.amps.adapter.csj.CSJInitMediation$1 r3 = new xyz.adscope.amps.adapter.csj.CSJInitMediation$1
            r3.<init>(r2)
            com.bytedance.sdk.openadsdk.TTAdSdk.start(r3)
            return
        L2b:
            r3 = 0
            r2.isInitIng = r3
            xyz.adscope.amps.common.AMPSError r3 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r3.<init>(r1, r0)
            r2.initSDKFail(r4, r3)
            return
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkName() {
            r1 = this;
            java.lang.String r0 = "CSJ"
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkVersion() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTAdManager r0 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()
            if (r0 == 0) goto Lf
            com.bytedance.sdk.openadsdk.TTAdManager r0 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()
            java.lang.String r0 = r0.getSDKVersion()
            return r0
        Lf:
            java.lang.String r0 = "6.8.1.7"
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public void initSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r3, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r4) {
            r2 = this;
            java.lang.String r0 = "com.bytedance.sdk.openadsdk.TTAdSdk"
            boolean r0 = xyz.adscope.common.tool.utils.SystemUtil.hasSdk(r0)
            if (r0 != 0) goto L1b
            xyz.adscope.amps.common.AMPSError r3 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_SDK_NOT_IMPORT
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r3.<init>(r1, r0)
            r2.initSDKFail(r4, r3)
            return
        L1b:
            boolean r0 = com.bytedance.sdk.openadsdk.TTAdSdk.isSdkReady()
            if (r0 != 0) goto L39
            boolean r0 = r2.isInit
            if (r0 == 0) goto L26
            goto L39
        L26:
            if (r4 == 0) goto L2d
            java.util.List<xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack> r0 = xyz.adscope.amps.adapter.csj.CSJInitMediation.mCallBackList
            r0.add(r4)
        L2d:
            boolean r0 = r2.isInitIng
            if (r0 == 0) goto L32
            return
        L32:
            r0 = 1
            r2.isInitIng = r0
            r2.initCSJSDK(r3, r4)
            return
        L39:
            r2.initSDKSuccess(r4)
            return
    }
}
