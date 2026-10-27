package xyz.adscope.amps.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSInitImplement implements xyz.adscope.amps.init.inter.IAMPSInitInterface {
    private xyz.adscope.amps.model.AMPSGlobalModel ampsGlobalModel;
    private android.content.Context context;
    private xyz.adscope.amps.config.inter.IConfigInterface iAdConfig;
    private xyz.adscope.amps.init.AMPSInitUserAgent initUserAgent;
    private boolean isCallBackInitResult;
    private xyz.adscope.amps.init.AMPSInitConfig mAMPSAdConfig;
    private xyz.adscope.amps.config.AMPSPrivacyConfig mAMPSPrivacyConfig;
    private android.os.Handler mHandler;




    public AMPSInitImplement() {
            r2 = this;
            r2.<init>()
            xyz.adscope.amps.config.AMPSConfigManager r0 = new xyz.adscope.amps.config.AMPSConfigManager
            r0.<init>()
            r2.iAdConfig = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mHandler = r0
            xyz.adscope.amps.init.AMPSInitUserAgent r0 = new xyz.adscope.amps.init.AMPSInitUserAgent
            r0.<init>()
            r2.initUserAgent = r0
            return
    }

    static /* synthetic */ void access$000(xyz.adscope.amps.init.AMPSInitImplement r0, android.content.Context r1, xyz.adscope.amps.init.inter.IAMPSInitCallback r2) {
            r0.asyncUpdateInfo(r1, r2)
            return
    }

    static /* synthetic */ android.os.Handler access$100(xyz.adscope.amps.init.AMPSInitImplement r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    static /* synthetic */ boolean access$200(xyz.adscope.amps.init.AMPSInitImplement r0) {
            boolean r0 = r0.isCallBackInitResult
            return r0
    }

    static /* synthetic */ boolean access$202(xyz.adscope.amps.init.AMPSInitImplement r0, boolean r1) {
            r0.isCallBackInitResult = r1
            return r1
    }

    static /* synthetic */ xyz.adscope.amps.model.AMPSGlobalModel access$300(xyz.adscope.amps.init.AMPSInitImplement r0) {
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.ampsGlobalModel
            return r0
    }

    static /* synthetic */ void access$400(xyz.adscope.amps.init.AMPSInitImplement r0, xyz.adscope.amps.init.AMPSInitConfig r1) {
            r0.preInitAdSource(r1)
            return
    }

    static /* synthetic */ void access$500(xyz.adscope.amps.init.AMPSInitImplement r0) {
            r0.updateNetWorkConfig()
            return
    }

    static /* synthetic */ void access$600(xyz.adscope.amps.init.AMPSInitImplement r0) {
            r0.initInterrupterBlackList()
            return
    }

    private void asyncGetDb() {
            r0 = this;
            return
    }

    private void asyncUpdateInfo(android.content.Context r3, xyz.adscope.amps.init.inter.IAMPSInitCallback r4) {
            r2 = this;
            r2.asyncGetDb()
            xyz.adscope.amps.config.inter.IConfigInterface r0 = r2.iAdConfig
            r0.setContext(r3)
            xyz.adscope.amps.config.inter.IConfigInterface r3 = r2.iAdConfig
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r2.ampsGlobalModel
            xyz.adscope.amps.init.AMPSInitImplement$2 r1 = new xyz.adscope.amps.init.AMPSInitImplement$2
            r1.<init>(r2, r4)
            r3.initConfigureFile(r0, r1)
            return
    }

    private void initInterrupterBlackList() {
            r2 = this;
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r2.ampsGlobalModel     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L5
            goto L34
        L5:
            xyz.adscope.amps.plan.BetaPlanMediation r0 = xyz.adscope.amps.plan.BetaPlanMediation.getInstance()     // Catch: java.lang.Exception -> L34
            boolean r0 = r0.isExecuteHapBetaPlan()     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L10
            goto L34
        L10:
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r2.ampsGlobalModel     // Catch: java.lang.Exception -> L34
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L19
            goto L34
        L19:
            xyz.adscope.amps.model.config.response.BlackRuleModel r0 = r0.getBlackRule()     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L20
            goto L34
        L20:
            java.util.List r0 = r0.getBlackList()     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L34
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L2d
            goto L34
        L2d:
            xyz.adscope.amps.tool.util.AMPSIntentInterrupter r1 = xyz.adscope.amps.tool.util.AMPSIntentInterrupter.getInstance()     // Catch: java.lang.Exception -> L34
            r1.initInterrupter(r0)     // Catch: java.lang.Exception -> L34
        L34:
            return
    }

    private void initNetWork() {
            r3 = this;
            xyz.adscope.common.network.KalleConfig$Builder r0 = xyz.adscope.common.network.KalleConfig.newBuilder()
            xyz.adscope.common.network.JsonConverter r1 = new xyz.adscope.common.network.JsonConverter
            android.content.Context r2 = r3.context
            r1.<init>(r2)
            xyz.adscope.common.network.KalleConfig$Builder r0 = r0.converter(r1)
            xyz.adscope.common.network.KalleConfig r0 = r0.build()
            xyz.adscope.common.network.Kalle.setConfig(r0)
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            if (r0 == 0) goto L2b
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.Headers r0 = r0.getHeaders()
            java.lang.String r1 = "Accept-Encrypt"
            java.lang.String r2 = "101,1001"
            r0.add2(r1, r2)
        L2b:
            return
    }

    private void preInitAdSource(xyz.adscope.amps.init.AMPSInitConfig r5) {
            r4 = this;
            if (r5 == 0) goto L4f
            java.util.List r0 = r5.getAdapterNameList()
            if (r0 == 0) goto L4f
            java.util.List r0 = r5.getAdapterNameList()
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L14
            goto L4f
        L14:
            java.util.List r5 = r5.getAdapterNameList()
            r0 = 0
        L19:
            int r1 = r5.size()
            if (r0 >= r1) goto L4f
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            xyz.adscope.amps.manager.AMPSAdSourceDataProvider r2 = xyz.adscope.amps.manager.AMPSAdSourceDataProvider.getInstance()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r2.getAdSourceByAdapterName(r1)
            xyz.adscope.amps.init.inter.AMPSChannelInitMediation r1 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterInit(r1)
            if (r2 == 0) goto L4c
            if (r1 != 0) goto L36
            goto L4c
        L36:
            java.lang.String r2 = r2.getAppId()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L4c
            xyz.adscope.amps.init.AMPSInitAdapterConfig r3 = new xyz.adscope.amps.init.AMPSInitAdapterConfig
            r3.<init>()
            r3.setAppId(r2)
            r2 = 0
            r1.initSDK(r3, r2)
        L4c:
            int r0 = r0 + 1
            goto L19
        L4f:
            return
    }

    private void startInitCountTimer(xyz.adscope.amps.init.inter.IAMPSInitCallback r5) {
            r4 = this;
            android.os.Handler r0 = r4.mHandler
            if (r0 != 0) goto L5
            return
        L5:
            xyz.adscope.amps.init.AMPSInitImplement$3 r1 = new xyz.adscope.amps.init.AMPSInitImplement$3
            r1.<init>(r4, r5)
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }

    private void syncStartService() {
            r2 = this;
            r2.initNetWork()
            xyz.adscope.amps.tool.crash.AMPSCrashHandler r0 = xyz.adscope.amps.tool.crash.AMPSCrashHandler.getInstance()
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r1 = r1.getContext()
            r0.init(r1)
            xyz.adscope.amps.init.AMPSInitUserAgent r0 = r2.initUserAgent
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            android.content.Context r1 = r1.getContext()
            r0.getUserAgent(r1)
            return
    }

    private void updateNetWorkConfig() {
            r3 = this;
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            if (r0 == 0) goto L3a
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r3.ampsGlobalModel
            if (r0 == 0) goto L3a
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            if (r0 == 0) goto L3a
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r3.ampsGlobalModel
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            if (r0 == 0) goto L3a
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.Headers r0 = r0.getHeaders()
            java.lang.String r1 = "Accept-Encrypt"
            r0.remove2(r1)
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.Headers r0 = r0.getHeaders()
            xyz.adscope.amps.model.AMPSGlobalModel r2 = r3.ampsGlobalModel
            java.lang.String r2 = r2.getAcceptEncrypt()
            r0.add2(r1, r2)
        L3a:
            return
    }

    public xyz.adscope.amps.config.AMPSPrivacyConfig getAMPSPrivacyConfig() {
            r1 = this;
            xyz.adscope.amps.config.AMPSPrivacyConfig r0 = r1.mAMPSPrivacyConfig
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.IAMPSInitInterface
    public xyz.adscope.amps.model.AMPSGlobalModel getGlobalModel() {
            r1 = this;
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r1.ampsGlobalModel
            return r0
    }

    @Override // xyz.adscope.amps.init.inter.IAMPSInitInterface
    public void init(android.content.Context r2, xyz.adscope.amps.init.AMPSInitConfig r3, xyz.adscope.amps.model.AMPSGlobalModel r4, xyz.adscope.amps.init.inter.IAMPSInitCallback r5) {
            r1 = this;
            r1.context = r2
            r1.ampsGlobalModel = r4
            if (r3 == 0) goto L19
            java.lang.String r4 = r3.getAppId()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L19
            xyz.adscope.amps.model.AMPSGlobalModel r4 = r1.ampsGlobalModel
            java.lang.String r0 = r3.getAppId()
            r4.setAppId(r0)
        L19:
            xyz.adscope.amps.model.AMPSGlobalModel r4 = r1.ampsGlobalModel
            java.lang.String r0 = xyz.adscope.amps.tool.util.AMPSStringUtil.createRequestId()
            r4.setStartId(r0)
            xyz.adscope.amps.model.AMPSGlobalModel r4 = r1.ampsGlobalModel
            r4.setAmpsInitConfig(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = " init execute appId:"
            r4.append(r0)
            java.lang.String r3 = r3.getAppId()
            r4.append(r3)
            java.lang.String r3 = ", sdkVersion:"
            r4.append(r3)
            java.lang.String r3 = xyz.adscope.amps.AMPSSDK.getSdkVersion()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.i(r4, r3)
            r1.startInitCountTimer(r5)
            r1.syncStartService()
            java.util.concurrent.ThreadPoolExecutor r3 = xyz.adscope.amps.tool.thread.AMPSThreadPool.getInitRequestPool()
            xyz.adscope.amps.init.AMPSInitImplement$1 r4 = new xyz.adscope.amps.init.AMPSInitImplement$1
            r4.<init>(r1, r2, r5)
            r3.execute(r4)
            return
    }

    @Override // xyz.adscope.amps.init.inter.IAMPSInitInterface
    public boolean isInitSuccess() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void setAMPSAdConfig(xyz.adscope.amps.init.AMPSInitConfig r1) {
            r0 = this;
            r0.mAMPSAdConfig = r1
            return
    }
}
