package xyz.adscope.amps.adapter.gdt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTInitMediation extends xyz.adscope.amps.init.inter.AMPSChannelInitMediation {
    private static final int GDT_PERSONAL_RECOMMEND_CLOSE = 1;
    private static final int GDT_PERSONAL_RECOMMEND_OPEN = 0;
    private static xyz.adscope.amps.adapter.gdt.GDTInitMediation instance;
    private xyz.adscope.amps.config.AMPSPrivacyConfig ampsPrivacyConfig;
    private boolean isInit;
    private java.lang.String userAgent;


    public GDTInitMediation() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInit = r0
            return
    }

    public static synchronized xyz.adscope.amps.adapter.gdt.GDTInitMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.adapter.gdt.GDTInitMediation> r0 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r1 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.adapter.gdt.GDTInitMediation> r1 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r2 = new xyz.adscope.amps.adapter.gdt.GDTInitMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.adapter.gdt.GDTInitMediation.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r1 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private void initGDTSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r9, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r10) {
            r8 = this;
            android.content.Context r0 = xyz.adscope.amps.AMPSSDK.getContext()
            if (r0 == 0) goto L13c
            if (r9 == 0) goto L13c
            java.lang.String r1 = r9.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L14
            goto L13c
        L14:
            xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r9.getPrivacyConfig()
            r8.ampsPrivacyConfig = r1
            if (r1 == 0) goto Le6
            boolean r1 = r1.isCanUseAndroidId()
            xyz.adscope.amps.config.AMPSPrivacyConfig r2 = r8.ampsPrivacyConfig
            boolean r2 = r2.isCanUseMacAddress()
            xyz.adscope.amps.config.AMPSPrivacyConfig r3 = r8.ampsPrivacyConfig
            boolean r3 = r3.isCanUseLocation()
            xyz.adscope.amps.config.AMPSPrivacyConfig r4 = r8.ampsPrivacyConfig
            boolean r4 = r4.isCanUseIP()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            java.lang.String r7 = "android_id"
            r5.put(r7, r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r6 = "device_id"
            r5.put(r6, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = "mac_address"
            r5.put(r2, r1)
            if (r3 != 0) goto L5b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "cell_id"
            r5.put(r2, r1)
        L5b:
            if (r4 != 0) goto L69
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "mipaddr"
            r5.put(r2, r1)
            java.lang.String r2 = "wipaddr"
            r5.put(r2, r1)
        L69:
            com.qq.e.comm.managers.setting.GlobalSetting.setAgreeReadPrivacyInfo(r5)
            xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r8.ampsPrivacyConfig
            boolean r1 = r1.isCanUseAppList()
            com.qq.e.comm.managers.setting.GlobalSetting.setEnableCollectAppInstallStatus(r1)
            xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r8.ampsPrivacyConfig
            boolean r1 = r1.isCanUseShakeAd()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r1 != 0) goto L89
            java.lang.String r1 = "shakable"
            java.lang.String r4 = "0"
            r2.put(r1, r4)
        L89:
            if (r3 != 0) goto Ldd
            xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r8.ampsPrivacyConfig
            xyz.adscope.amps.config.model.AMPSLocation r1 = r1.getLocation()
            if (r1 == 0) goto Ldd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            double r4 = r1.getLatitude()
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "lng"
            r2.put(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            double r5 = r1.getLongitude()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "lat"
            r2.put(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = java.lang.System.currentTimeMillis()
            r1.append(r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "loc_time"
            r2.put(r3, r1)
        Ldd:
            int r1 = r2.size()
            if (r1 <= 0) goto Le6
            com.qq.e.comm.managers.setting.GlobalSetting.setExtraUserData(r2)
        Le6:
            java.util.Map r1 = r9.getLocalExtraMap()
            if (r1 == 0) goto L117
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_GDT
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L117
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_GDT
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L117
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.GDT_LOCAL_EXTRA_KEY_CONV_OPTIMIZE_INFO
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L117
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.GDT_LOCAL_EXTRA_KEY_CONV_OPTIMIZE_INFO
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L117
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L117
            java.util.Map r1 = (java.util.Map) r1
            com.qq.e.comm.managers.setting.GlobalSetting.setConvOptimizeInfo(r1)
        L117:
            java.lang.String r1 = r9.getAppId()
            boolean r9 = r9.isPersonalRecommend()
            r2 = 1
            r9 = r9 ^ r2
            com.qq.e.comm.managers.setting.GlobalSetting.setPersonalizedState(r9)
            com.qq.e.comm.managers.GDTAdSdk.initWithoutStart(r0, r1)
            xyz.adscope.amps.adapter.gdt.GDTInitMediation$1 r9 = new xyz.adscope.amps.adapter.gdt.GDTInitMediation$1
            r9.<init>(r8)
            com.qq.e.comm.managers.GDTAdSdk.start(r9)
            r8.isInit = r2
            java.lang.String r9 = "amps_log_tag"
            java.lang.String r0 = "GDTSDK init success"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r9, r0)
            r8.initSDKSuccess(r10)
            return
        L13c:
            xyz.adscope.amps.common.AMPSError r9 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r9.<init>(r1, r0)
            r8.initSDKFail(r10, r9)
            return
    }

    public xyz.adscope.amps.config.AMPSPrivacyConfig getAmpsPrivacyConfig() {
            r1 = this;
            xyz.adscope.amps.config.AMPSPrivacyConfig r0 = r1.ampsPrivacyConfig
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkName() {
            r1 = this;
            java.lang.String r0 = "GDT"
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkVersion() {
            r1 = this;
            java.lang.String r0 = com.qq.e.comm.managers.status.SDKStatus.getIntegrationSDKVersion()
            return r0
    }

    public java.lang.String getUserAgent(android.content.Context r2) {
            r1 = this;
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r0 = r1.userAgent
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10
            java.lang.String r2 = r1.userAgent
            return r2
        L10:
            java.lang.String r2 = android.webkit.WebSettings.getDefaultUserAgent(r2)
            return r2
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public void initSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r3, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r4) {
            r2 = this;
            java.lang.String r0 = "com.qq.e.comm.managers.GDTAdSdk"
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
            boolean r0 = r2.isInit
            if (r0 == 0) goto L23
            r2.initSDKSuccess(r4)
            return
        L23:
            r2.initGDTSDK(r3, r4)
            return
    }
}
