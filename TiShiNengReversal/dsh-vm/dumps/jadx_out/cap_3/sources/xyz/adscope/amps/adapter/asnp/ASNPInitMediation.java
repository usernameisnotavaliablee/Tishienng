package xyz.adscope.amps.adapter.asnp;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPInitMediation extends xyz.adscope.amps.init.inter.AMPSChannelInitMediation {
    private static xyz.adscope.amps.adapter.asnp.ASNPInitMediation instance;
    private static java.util.List<xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack> mCallBackList;
    private boolean isInit;
    private boolean isInitIng;
    private java.lang.String mApiKey;



    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation.mCallBackList = r0
            return
    }

    public ASNPInitMediation() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInit = r0
            r1.isInitIng = r0
            return
    }

    public static /* synthetic */ boolean access$002(xyz.adscope.amps.adapter.asnp.ASNPInitMediation r0, boolean r1) {
            r0.isInitIng = r1
            return r1
    }

    public static /* synthetic */ boolean access$102(xyz.adscope.amps.adapter.asnp.ASNPInitMediation r0, boolean r1) {
            r0.isInit = r1
            return r1
    }

    public static /* synthetic */ java.util.List access$200() {
            java.util.List<xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack> r0 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.mCallBackList
            return r0
    }

    public static synchronized xyz.adscope.amps.adapter.asnp.ASNPInitMediation getInstance() {
            java.lang.Class<xyz.adscope.amps.adapter.asnp.ASNPInitMediation> r0 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.class
            monitor-enter(r0)
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation r1 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.adapter.asnp.ASNPInitMediation> r1 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation r2 = new xyz.adscope.amps.adapter.asnp.ASNPInitMediation     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation r1 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private void initASNPSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r5, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r6) {
            r4 = this;
            android.content.Context r0 = xyz.adscope.amps.AMPSSDK.getContext()
            if (r0 == 0) goto L13e
            if (r5 == 0) goto L13e
            java.lang.String r1 = r5.getAppId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L14
            goto L13e
        L14:
            java.lang.String r6 = r5.getAppId()
            xyz.adscope.ad.publish.ASNPInitConfig$Builder r1 = new xyz.adscope.ad.publish.ASNPInitConfig$Builder
            r1.<init>(r6)
            java.lang.String r6 = "AdScopeADN"
            r4.mApiKey = r6
            boolean r6 = r5.isDebug()
            r1.setDebugSetting(r6)
            java.util.Map r6 = r5.getLocalExtraMap()
            if (r6 == 0) goto L125
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_ASNP
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L3f
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.AMPS_LOCAL_EXTRA_DATA_ASNP
            java.lang.Object r6 = r6.get(r2)
            java.util.Map r6 = (java.util.Map) r6
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r6 == 0) goto L125
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_API_KEY
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L5a
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_API_KEY
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto L5a
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L5a
            java.lang.String r2 = (java.lang.String) r2
            r4.mApiKey = r2
        L5a:
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_USE_HTTPS
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L77
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_USE_HTTPS
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto L77
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L77
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.setUseHttps(r2)
        L77:
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_USER_ID
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L90
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_USER_ID
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto L90
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L90
            java.lang.String r2 = (java.lang.String) r2
            r1.setUserId(r2)
        L90:
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_OPTION_FIELDS
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto La9
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_OPTION_FIELDS
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto La9
            boolean r3 = r2 instanceof java.util.Map
            if (r3 == 0) goto La9
            java.util.Map r2 = (java.util.Map) r2
            r1.setOptionFields(r2)
        La9:
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_CURRENCY
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto Ldd
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_CURRENCY
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto Ldd
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto Ldd
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 <= 0) goto Ldd
            java.util.Iterator r2 = r2.iterator()
        Lc9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ldd
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r1.addCurrency(r3)
            goto Lc9
        Ldd:
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_COUNTRY_CN
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto Lfa
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_COUNTRY_CN
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto Lfa
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto Lfa
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setCountryCN(r2)
        Lfa:
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_UI_MODEL
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L125
            java.lang.String r2 = xyz.adscope.amps.common.AMPSConstants.ASNP_LOCAL_EXTRA_KEY_UI_MODEL
            java.lang.Object r6 = r6.get(r2)
            if (r6 == 0) goto L125
            boolean r2 = r6 instanceof java.lang.Integer
            if (r2 == 0) goto L125
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_AUTO
            r3 = 1
            if (r6 == r3) goto L120
            r3 = 2
            if (r6 == r3) goto L11d
            goto L122
        L11d:
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_LIGHT
            goto L122
        L120:
            xyz.adscope.ad.publish.ASNPConstants$UiModel r2 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK
        L122:
            r1.setUiModel(r2)
        L125:
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation$1 r6 = new xyz.adscope.amps.adapter.asnp.ASNPInitMediation$1
            r6.<init>(r4, r5)
            r1.setAdCustomController(r6)
            xyz.adscope.ad.publish.ASNPAdSDK r5 = xyz.adscope.ad.publish.ASNPAdSDK.getInstance()
            xyz.adscope.ad.publish.ASNPInitConfig r6 = r1.build()
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation$2 r1 = new xyz.adscope.amps.adapter.asnp.ASNPInitMediation$2
            r1.<init>(r4)
            r5.init(r0, r6, r1)
            return
        L13e:
            r5 = 0
            r4.isInitIng = r5
            xyz.adscope.amps.common.AMPSError r5 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r5.<init>(r1, r0)
            r4.initSDKFail(r6, r5)
            return
    }

    public java.lang.String getApiKey() {
            r1 = this;
            java.lang.String r0 = r1.mApiKey
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkName() {
            r1 = this;
            java.lang.String r0 = "ASNP"
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public java.lang.String getNetworkVersion() {
            r1 = this;
            xyz.adscope.ad.publish.ASNPAdSDK r0 = xyz.adscope.ad.publish.ASNPAdSDK.getInstance()
            java.lang.String r0 = r0.getSDKVersionName()
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.AMPSChannelInitMediation
    public void initSDK(xyz.adscope.amps.init.AMPSInitAdapterConfig r3, xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack r4) {
            r2 = this;
            java.lang.String r0 = "xyz.adscope.ad.publish.ASNPAdSDK"
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
            if (r4 == 0) goto L2a
            java.util.List<xyz.adscope.amps.init.inter.IAMPSChannelInitCallBack> r0 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.mCallBackList
            r0.add(r4)
        L2a:
            boolean r0 = r2.isInitIng
            if (r0 == 0) goto L2f
            return
        L2f:
            r0 = 1
            r2.isInitIng = r0
            r2.initASNPSDK(r3, r4)
            return
    }
}
