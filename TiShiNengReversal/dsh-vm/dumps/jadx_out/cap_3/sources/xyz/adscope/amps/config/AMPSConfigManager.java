package xyz.adscope.amps.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSConfigManager implements xyz.adscope.amps.config.inter.IConfigInterface {
    private xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask adConfigSchedulerTask;
    private xyz.adscope.amps.model.AMPSGlobalModel ampsGlobalModel;
    private xyz.adscope.amps.tool.task.AMPSTimerOutTask ampsTimerOutTask;
    private int configUpdateStatus;
    private android.content.Context context;
    private xyz.adscope.amps.tool.crash.inter.ICrashRouter iCrashRouter;
    private xyz.adscope.amps.tool.request.inter.IHttpRequest iHttpRequest;
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.String> mCfgMD5List;
    private int mIntervalTime;
    private xyz.adscope.amps.config.AMPSConfigResponseInfo responseInfo;




    public AMPSConfigManager() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.tool.crash.AMPSCrashRouter r0 = new xyz.adscope.amps.tool.crash.AMPSCrashRouter
            r0.<init>()
            r1.iCrashRouter = r0
            xyz.adscope.amps.tool.request.AMPSHttpRequest r0 = new xyz.adscope.amps.tool.request.AMPSHttpRequest
            r0.<init>()
            r1.iHttpRequest = r0
            r0 = 0
            r1.configUpdateStatus = r0
            r0 = 300000(0x493e0, float:4.2039E-40)
            r1.mIntervalTime = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mCfgMD5List = r0
            xyz.adscope.amps.tool.task.AMPSTimerOutTask r0 = new xyz.adscope.amps.tool.task.AMPSTimerOutTask
            r0.<init>()
            r1.ampsTimerOutTask = r0
            return
    }

    static /* synthetic */ int access$002(xyz.adscope.amps.config.AMPSConfigManager r0, int r1) {
            r0.configUpdateStatus = r1
            return r1
    }

    static /* synthetic */ xyz.adscope.amps.tool.task.AMPSTimerOutTask access$100(xyz.adscope.amps.config.AMPSConfigManager r0) {
            xyz.adscope.amps.tool.task.AMPSTimerOutTask r0 = r0.ampsTimerOutTask
            return r0
    }

    static /* synthetic */ void access$200(xyz.adscope.amps.config.AMPSConfigManager r0, xyz.adscope.amps.config.inter.IConfigInfoCallback r1, java.lang.String r2) {
            r0.failResultCallback(r1, r2)
            return
    }

    static /* synthetic */ xyz.adscope.amps.model.AMPSGlobalModel access$300(xyz.adscope.amps.config.AMPSConfigManager r0) {
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.ampsGlobalModel
            return r0
    }

    static /* synthetic */ void access$400(xyz.adscope.amps.config.AMPSConfigManager r0) {
            r0.putCfgMD5ToList()
            return
    }

    private void failResultCallback(xyz.adscope.amps.config.inter.IConfigInfoCallback r4, java.lang.String r5) {
            r3 = this;
            if (r4 == 0) goto L1f
            xyz.adscope.amps.common.AMPSError r0 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_INIT_FAIL
            java.lang.String r2 = r1.getErrorCode()
            java.lang.String r1 = r1.getErrorMsg()
            r0.<init>(r2, r1)
            r4.failCallBack(r0)
            xyz.adscope.amps.tool.task.AMPSTimerOutTask r4 = r3.ampsTimerOutTask
            r0 = 1
            r4.setIsExecuteConfig(r0)
            xyz.adscope.amps.tool.task.AMPSTimerOutTask r4 = r3.ampsTimerOutTask
            r4.cancelTimerTask()
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "e : "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.i(r5, r4)
            return
    }

    private synchronized boolean isConfigCanUpdate() {
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            xyz.adscope.amps.config.AMPSConfigResponseInfo r1 = r8.responseInfo     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L8
            monitor-exit(r8)
            return r0
        L8:
            long r1 = r1.getLastUpdateTime()     // Catch: java.lang.Throwable -> L64
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L64
            long r3 = r3 - r1
            int r5 = r8.mIntervalTime     // Catch: java.lang.Throwable -> L64
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1a
            monitor-exit(r8)
            return r0
        L1a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r3 = r8.mCfgMD5List     // Catch: java.lang.Throwable -> L64
            r4 = 1
            if (r3 == 0) goto L49
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L64
            if (r3 <= r4) goto L49
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r3 = r8.mCfgMD5List     // Catch: java.lang.Throwable -> L64
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L64
            r5 = 1
            r6 = 0
        L2f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r7 = r8.mCfgMD5List     // Catch: java.lang.Throwable -> L64
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L64
            if (r5 >= r7) goto L4a
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r7 = r8.mCfgMD5List     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L64
            boolean r7 = r3.equals(r7)     // Catch: java.lang.Throwable -> L64
            if (r7 != 0) goto L44
            goto L4a
        L44:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L2f
        L49:
            r6 = 0
        L4a:
            r3 = 7
            if (r6 >= r3) goto L50
            int r3 = r4 << r6
            goto L52
        L50:
            r3 = 96
        L52:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L64
            long r5 = r5 - r1
            int r1 = r8.mIntervalTime     // Catch: java.lang.Throwable -> L64
            int r1 = r1 * r3
            long r1 = (long) r1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L62
            monitor-exit(r8)
            return r0
        L62:
            monitor-exit(r8)
            return r4
        L64:
            monitor-exit(r8)
            return r0
    }

    private boolean isUseHttps() {
            r1 = this;
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r1.ampsGlobalModel
            if (r0 == 0) goto Lf
            xyz.adscope.amps.init.AMPSInitConfig r0 = r0.getAmpsInitConfig()
            if (r0 == 0) goto Lf
            boolean r0 = r0.isUseHttps()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private void putCfgMD5ToList() {
            r3 = this;
            r0 = 0
            xyz.adscope.amps.config.AMPSConfigResponseInfo r1 = r3.responseInfo     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r1.getConfigVersion()     // Catch: java.lang.Exception -> L2b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2b
            if (r2 != 0) goto L12
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r2 = r3.mCfgMD5List     // Catch: java.lang.Exception -> L2b
            r2.add(r0, r1)     // Catch: java.lang.Exception -> L2b
        L12:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r1 = r3.mCfgMD5List     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2b
            int r1 = r1.size()     // Catch: java.lang.Exception -> L2b
            r2 = 8
            if (r1 <= r2) goto L2b
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r1 = r3.mCfgMD5List     // Catch: java.lang.Exception -> L2b
            int r1 = r1.size()     // Catch: java.lang.Exception -> L2b
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r2 = r3.mCfgMD5List     // Catch: java.lang.Exception -> L2b
            int r1 = r1 + (-1)
            r2.remove(r1)     // Catch: java.lang.Exception -> L2b
        L2b:
            r3.configUpdateStatus = r0
            return
    }

    private void syncLocalOrCacheConfig(xyz.adscope.amps.model.AMPSGlobalModel r4, xyz.adscope.amps.config.inter.IConfigInfoCallback r5) {
            r3 = this;
            boolean r0 = r3.checkConfig()
            if (r0 == 0) goto La
            r3.requestConfigureFile(r4, r5)
            return
        La:
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r3.responseInfo
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            r4.setConfigureResponseModel(r0)
            android.content.Context r1 = r3.context
            xyz.adscope.common.info.DeviceInfo r1 = xyz.adscope.common.info.DeviceInfo.getInstance(r1)
            long r1 = r1.getTimeStamp()
            r4.setSdkInitEndTime(r1)
            if (r0 == 0) goto L2d
            if (r5 == 0) goto L46
            r5.successCallBack()
            xyz.adscope.amps.tool.task.AMPSTimerOutTask r4 = r3.ampsTimerOutTask
            r4.cancelTimerTask()
            return
        L2d:
            if (r5 == 0) goto L46
            xyz.adscope.amps.common.AMPSError r4 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_INIT_FAIL
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r4.<init>(r1, r0)
            r5.failCallBack(r4)
            xyz.adscope.amps.tool.task.AMPSTimerOutTask r4 = r3.ampsTimerOutTask
            r4.cancelTimerTask()
        L46:
            return
    }

    @Override // xyz.adscope.amps.config.inter.IConfigInterface
    public boolean checkConfig() {
            r14 = this;
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r14.responseInfo
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            r1 = 0
            if (r0 == 0) goto L40
            long r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getTimeStamp()
            long r4 = r0.getLastUpdateTime()
            xyz.adscope.amps.model.config.response.ConfigModel r6 = r0.getConfig()
            if (r6 == 0) goto L28
            xyz.adscope.amps.model.config.response.ConfigModel r6 = r0.getConfig()
            long r6 = r6.getMaxExpireTime()
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            long r8 = r0.getExpireTime()
            goto L2b
        L28:
            r6 = 0
            r8 = r6
        L2b:
            r0 = 1
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L37
            long r11 = r2 - r4
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L37
            return r0
        L37:
            if (r10 <= 0) goto L3f
            long r2 = r2 - r4
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L3f
            return r0
        L3f:
            return r1
        L40:
            java.lang.String r0 = "amps_log_tag"
            java.lang.String r2 = "first launch and heartConfig is null return true!"
            xyz.adscope.common.tool.LogUtil.i(r0, r2)
            return r1
    }

    @Override // xyz.adscope.amps.config.inter.IConfigInterface
    public void initConfigureFile(xyz.adscope.amps.model.AMPSGlobalModel r3, xyz.adscope.amps.config.inter.IConfigInfoCallback r4) {
            r2 = this;
            r2.ampsGlobalModel = r3
            java.lang.String r0 = "amps_log_tag"
            java.lang.String r1 = "initConfigureFile() execute"
            xyz.adscope.common.tool.LogUtil.i(r0, r1)
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r2.responseInfo
            if (r0 != 0) goto L13
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = xyz.adscope.amps.config.AMPSConfigResponseInfo.getInstance()
            r2.responseInfo = r0
        L13:
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r2.responseInfo
            boolean r0 = r0.isInit()
            if (r0 != 0) goto L24
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r2.responseInfo
            boolean r1 = r2.isUseHttps()
            r0.init(r1)
        L24:
            if (r3 == 0) goto L3d
            xyz.adscope.amps.init.AMPSInitConfig r0 = r3.getAmpsInitConfig()
            if (r0 == 0) goto L38
            boolean r0 = r0.isPersonalRecommend()
            if (r0 == 0) goto L3d
            android.content.Context r0 = r2.context
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.initOaid(r0)
            goto L3d
        L38:
            android.content.Context r0 = r2.context
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.initOaid(r0)
        L3d:
            xyz.adscope.amps.tool.crash.inter.ICrashRouter r0 = r2.iCrashRouter
            boolean r0 = r0.lastLaunchCrashedBecauseOfSDK()
            if (r0 == 0) goto L49
            r2.requestConfigureFile(r3, r4)
            goto L4f
        L49:
            r2.syncLocalOrCacheConfig(r3, r4)
            r2.schedulerUpdateConfigureFile()
        L4f:
            xyz.adscope.amps.report.AMPSReportMediation r3 = xyz.adscope.amps.report.AMPSReportMediation.getInstance()
            xyz.adscope.amps.config.AMPSConfigManager$1 r4 = new xyz.adscope.amps.config.AMPSConfigManager$1
            r4.<init>(r2)
            r3.registerAnalyseUpdate(r4)
            return
    }

    public void requestConfigureFile() {
            r5 = this;
            r0 = 0
            int r1 = r5.configUpdateStatus     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L6
            goto L60
        L6:
            r1 = 1
            r5.configUpdateStatus = r1     // Catch: java.lang.Throwable -> L97
            boolean r2 = r5.isConfigCanUpdate()     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L12
            r5.configUpdateStatus = r0     // Catch: java.lang.Throwable -> L97
            return
        L12:
            xyz.adscope.amps.config.AMPSConfigResponseInfo r2 = r5.responseInfo     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L4b
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r2 = r2.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L4b
            xyz.adscope.amps.config.AMPSConfigResponseInfo r2 = r5.responseInfo     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r2 = r2.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.model.config.response.ConfigModel r2 = r2.getConfig()     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L4b
            xyz.adscope.amps.config.AMPSConfigResponseInfo r2 = r5.responseInfo     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r2 = r2.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.model.config.response.ConfigModel r2 = r2.getConfig()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.getConfigURL()     // Catch: java.lang.Throwable -> L97
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L4b
            xyz.adscope.amps.config.AMPSConfigResponseInfo r2 = r5.responseInfo     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r2 = r2.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.model.config.response.ConfigModel r2 = r2.getConfig()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.getConfigURL()     // Catch: java.lang.Throwable -> L97
            goto L61
        L4b:
            boolean r2 = r5.isUseHttps()     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L54
            java.lang.String r2 = "aHR0cHM6Ly9zZGstYXBpLmJlaXppLmJpei92MS9hcGkvc2RrL2NmZw=="
            goto L56
        L54:
            java.lang.String r2 = "aHR0cDovL3Nkay1hcGkuYmVpemkuYml6L3YxL2FwaS9zZGsvY2Zn"
        L56:
            java.lang.String r2 = xyz.adscope.common.tool.security.Base64Util.decode(r2)     // Catch: java.lang.Throwable -> L97
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L61
        L60:
            return
        L61:
            android.content.Context r3 = r5.context     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.config.AMPSConfigRequestInfo r3 = xyz.adscope.amps.config.AMPSConfigRequestInfo.getInstance(r3)     // Catch: java.lang.Throwable -> L97
            boolean r4 = r3.isInit     // Catch: java.lang.Throwable -> L97
            if (r4 != 0) goto L74
            xyz.adscope.amps.model.AMPSGlobalModel r4 = r5.ampsGlobalModel     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.init.AMPSInitConfig r4 = r4.getAmpsInitConfig()     // Catch: java.lang.Throwable -> L97
            r3.init(r4)     // Catch: java.lang.Throwable -> L97
        L74:
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r3 = r3.getConfigureRequestModel()     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.model.config.request.AMPSExtModel r4 = new xyz.adscope.amps.model.config.request.AMPSExtModel     // Catch: java.lang.Throwable -> L97
            r4.<init>()     // Catch: java.lang.Throwable -> L97
            r4.setIsLogReq(r1)     // Catch: java.lang.Throwable -> L97
            r3.setExt(r4)     // Catch: java.lang.Throwable -> L97
            xyz.adscope.common.json.JSONParse r1 = new xyz.adscope.common.json.JSONParse     // Catch: java.lang.Throwable -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r1.toJson(r3)     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.tool.request.inter.IHttpRequest r3 = r5.iHttpRequest     // Catch: java.lang.Throwable -> L97
            xyz.adscope.amps.config.AMPSConfigManager$3 r4 = new xyz.adscope.amps.config.AMPSConfigManager$3     // Catch: java.lang.Throwable -> L97
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97
            r3.doRequestWithJson(r2, r1, r4)     // Catch: java.lang.Throwable -> L97
            return
        L97:
            r5.configUpdateStatus = r0
            return
    }

    @Override // xyz.adscope.amps.config.inter.IConfigInterface
    public void requestConfigureFile(xyz.adscope.amps.model.AMPSGlobalModel r5, xyz.adscope.amps.config.inter.IConfigInfoCallback r6) {
            r4 = this;
            r0 = 1
            r4.configUpdateStatus = r0
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r4.responseInfo
            if (r0 == 0) goto L3c
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            if (r0 == 0) goto L3c
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r4.responseInfo
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            if (r0 == 0) goto L3c
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r4.responseInfo
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            java.lang.String r0 = r0.getConfigURL()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3c
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r4.responseInfo
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.ConfigModel r0 = r0.getConfig()
            java.lang.String r0 = r0.getConfigURL()
            goto L55
        L3c:
            boolean r0 = r4.isUseHttps()
            if (r0 == 0) goto L45
            java.lang.String r0 = "aHR0cHM6Ly9zZGstYXBpLmJlaXppLmJpei92MS9hcGkvc2RrL2NmZw=="
            goto L47
        L45:
            java.lang.String r0 = "aHR0cDovL3Nkay1hcGkuYmVpemkuYml6L3YxL2FwaS9zZGsvY2Zn"
        L47:
            java.lang.String r0 = xyz.adscope.common.tool.security.Base64Util.decode(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L55
            r5 = 0
            r4.configUpdateStatus = r5
            return
        L55:
            android.content.Context r1 = r4.context
            xyz.adscope.amps.config.AMPSConfigRequestInfo r1 = xyz.adscope.amps.config.AMPSConfigRequestInfo.getInstance(r1)
            boolean r2 = r1.isInit
            if (r2 != 0) goto L66
            xyz.adscope.amps.init.AMPSInitConfig r2 = r5.getAmpsInitConfig()
            r1.init(r2)
        L66:
            xyz.adscope.amps.model.config.request.AMPSConfigRequestModel r1 = r1.getConfigureRequestModel()
            xyz.adscope.common.json.JSONParse r2 = new xyz.adscope.common.json.JSONParse
            r2.<init>()
            java.lang.String r1 = r2.toJson(r1)
            xyz.adscope.amps.tool.request.inter.IHttpRequest r2 = r4.iHttpRequest
            xyz.adscope.amps.config.AMPSConfigManager$2 r3 = new xyz.adscope.amps.config.AMPSConfigManager$2
            r3.<init>(r4, r5, r6)
            r2.doRequestWithJson(r0, r1, r3)
            return
    }

    @Override // xyz.adscope.amps.config.inter.IConfigInterface
    public void schedulerUpdateConfigureFile() {
            r2 = this;
            xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0 = r2.adConfigSchedulerTask
            if (r0 != 0) goto L10
            xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0 = new xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask
            r0.<init>(r2)
            r2.adConfigSchedulerTask = r0
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r2.ampsGlobalModel
            r0.setAdScopeGlobalModel(r1)
        L10:
            xyz.adscope.amps.tool.task.scheduler.AMPSConfigSchedulerTask r0 = r2.adConfigSchedulerTask
            r0.startSchedulerTask()
            return
    }

    @Override // xyz.adscope.amps.config.inter.IConfigInterface
    public void setContext(android.content.Context r1) {
            r0 = this;
            r0.context = r1
            return
    }

    @Override // xyz.adscope.amps.config.inter.IConfigInterface
    public void updateConfigureFile(xyz.adscope.amps.model.AMPSGlobalModel r2, java.lang.String r3) {
            r1 = this;
            xyz.adscope.amps.config.AMPSConfigResponseInfo r0 = r1.responseInfo
            r0.parseResponse(r3)
            java.lang.String r3 = "amps_crash_reason_key"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            xyz.adscope.amps.tool.persistent.sp.AMPSSpUtil.put(r3, r0)
            xyz.adscope.amps.config.AMPSConfigResponseInfo r3 = r1.responseInfo
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r3 = r3.getConfigureResponseModel()
            r2.setConfigureResponseModel(r3)
            xyz.adscope.amps.report.AMPSReportMediation r2 = xyz.adscope.amps.report.AMPSReportMediation.getInstance()
            r2.initLogStrategy()
            r1.schedulerUpdateConfigureFile()
            return
    }
}
