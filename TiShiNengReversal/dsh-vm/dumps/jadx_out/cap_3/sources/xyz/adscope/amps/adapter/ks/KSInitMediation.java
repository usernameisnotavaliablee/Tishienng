package xyz.adscope.amps.adapter.ks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSInitMediation extends xyz.adscope.amps.init.inter.AMPSChannelInitMediation {
    private static xyz.adscope.amps.adapter.ks.KSInitMediation instance;
    private java.lang.String ipAddress;
    private boolean isCanUseShakeAd;
    private boolean isInit;



    public KSInitMediation() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInit = r0
            r0 = 1
            r1.isCanUseShakeAd = r0
            return
    }

    public static /* synthetic */ boolean access$002(xyz.adscope.amps.adapter.ks.KSInitMediation r0, boolean r1) {
            r0.isInit = r1
            return r1
    }

    public static synchronized xyz.adscope.amps.adapter.ks.KSInitMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.adapter.ks.KSInitMediation> r0 = xyz.adscope.amps.adapter.ks.KSInitMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.adapter.ks.KSInitMediation r1 = xyz.adscope.amps.adapter.ks.KSInitMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.adapter.ks.KSInitMediation> r1 = xyz.adscope.amps.adapter.ks.KSInitMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.adapter.ks.KSInitMediation r2 = new xyz.adscope.amps.adapter.ks.KSInitMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.adapter.ks.KSInitMediation.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.adapter.ks.KSInitMediation r1 = xyz.adscope.amps.adapter.ks.KSInitMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private void initKSSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r7, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r8) {
            r6 = this;
            android.content.Context r0 = xyz.adscope.amps.AMPSSDK.getContext()
            if (r0 == 0) goto La3
            if (r7 == 0) goto La3
            java.lang.String r1 = r7.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L14
            goto La3
        L14:
            xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r7.getPrivacyConfig()
            r2 = 1
            if (r1 == 0) goto L2c
            boolean r3 = r1.isCanUseWifiState()
            boolean r4 = r1.isCanUseShakeAd()
            r6.isCanUseShakeAd = r4
            java.lang.String r4 = r1.getIP()
            r6.ipAddress = r4
            goto L2d
        L2c:
            r3 = 1
        L2d:
            boolean r4 = r7.isPersonalRecommend()
            if (r4 != 0) goto L37
            r4 = 0
            com.kwad.sdk.api.KsAdSDK.setPersonalRecommend(r4)
        L37:
            java.util.Map r4 = r7.getLocalExtraMap()
            if (r4 == 0) goto L69
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_KS
            boolean r5 = r4.containsKey(r5)
            if (r5 == 0) goto L69
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_KS
            java.lang.Object r4 = r4.get(r5)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L69
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.KS_LOCAL_EXTRA_KEY_SHOW_NOTIFICATION
            boolean r5 = r4.containsKey(r5)
            if (r5 == 0) goto L69
            java.lang.String r5 = xyz.adscope.amps.common.AMPSConstants.KS_LOCAL_EXTRA_KEY_SHOW_NOTIFICATION
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L69
            boolean r5 = r4 instanceof java.lang.Boolean
            if (r5 == 0) goto L69
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r2 = r4.booleanValue()
        L69:
            java.lang.String r4 = r7.getAppId()
            com.kwad.sdk.api.SdkConfig$Builder r5 = new com.kwad.sdk.api.SdkConfig$Builder
            r5.<init>()
            com.kwad.sdk.api.SdkConfig$Builder r4 = r5.appId(r4)
            java.lang.String r7 = r7.getAppName()
            com.kwad.sdk.api.SdkConfig$Builder r7 = r4.appName(r7)
            com.kwad.sdk.api.SdkConfig$Builder r7 = r7.canReadNearbyWifiList(r3)
            xyz.adscope.amps.adapter.ks.KSInitMediation$2 r3 = new xyz.adscope.amps.adapter.ks.KSInitMediation$2
            r3.<init>(r6, r1)
            com.kwad.sdk.api.SdkConfig$Builder r7 = r7.customController(r3)
            com.kwad.sdk.api.SdkConfig$Builder r7 = r7.showNotification(r2)
            xyz.adscope.amps.adapter.ks.KSInitMediation$1 r1 = new xyz.adscope.amps.adapter.ks.KSInitMediation$1
            r1.<init>(r6, r8)
            com.kwad.sdk.api.SdkConfig$Builder r7 = r7.setStartCallback(r1)
            com.kwad.sdk.api.SdkConfig r7 = r7.build()
            com.kwad.sdk.api.KsAdSDK.init(r0, r7)
            com.kwad.sdk.api.KsAdSDK.start()
            return
        La3:
            xyz.adscope.amps.common.AMPSError r7 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r7.<init>(r1, r0)
            r6.initSDKFail(r8, r7)
            return
    }

    public java.lang.String getBidToken(java.lang.String r5) {
            r4 = this;
            r0 = 0
            com.kwad.sdk.api.KsScene$Builder r1 = new com.kwad.sdk.api.KsScene$Builder     // Catch: java.lang.NumberFormatException -> L1a
            long r2 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L1a
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L1a
            com.kwad.sdk.api.KsScene r5 = r1.build()     // Catch: java.lang.NumberFormatException -> L1a
            com.kwad.sdk.api.KsLoadManager r1 = com.kwad.sdk.api.KsAdSDK.getLoadManager()     // Catch: java.lang.NumberFormatException -> L1a
            if (r1 != 0) goto L15
            return r0
        L15:
            java.lang.String r5 = r1.getBidRequestToken(r5)     // Catch: java.lang.NumberFormatException -> L1a
            return r5
        L1a:
            return r0
    }

    public java.lang.String getIpAddress() {
            r1 = this;
            java.lang.String r0 = r1.ipAddress
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkName() {
            r1 = this;
            java.lang.String r0 = "KS"
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkVersion() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.api.KsAdSDK.getSDKVersion()
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public void initSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r3, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r4) {
            r2 = this;
            java.lang.String r0 = "com.kwad.sdk.api.KsAdSDK"
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
            r2.initKSSDK(r3, r4)
            return
    }

    public boolean isCanUseShakeAd() {
            r1 = this;
            boolean r0 = r1.isCanUseShakeAd
            return r0
    }
}
