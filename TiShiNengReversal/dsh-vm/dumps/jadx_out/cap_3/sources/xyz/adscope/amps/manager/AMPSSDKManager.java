package xyz.adscope.amps.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSSDKManager {
    public static long initStartTime;
    private static xyz.adscope.amps.manager.AMPSSDKManager instance;
    private xyz.adscope.amps.model.AMPSGlobalModel ampsGlobalModel;
    private xyz.adscope.amps.init.inter.IAMPSInitInterface iampsInitInterface;
    private xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus initStatus;
    private xyz.adscope.amps.init.AMPSInitConfig mAMPSAdConfig;
    private xyz.adscope.amps.config.AMPSPrivacyConfig mAMPSPrivacyConfig;
    private java.lang.String mAppId;
    private android.content.Context mContext;
    private java.util.List<xyz.adscope.amps.init.inter.IAMPSInitCallback> mInitCallBackList;
    private java.lang.String userAgent;

    static {
            return
    }

    private AMPSSDKManager() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusNormal
            r1.initStatus = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mInitCallBackList = r0
            xyz.adscope.amps.init.AMPSInitImplement r0 = new xyz.adscope.amps.init.AMPSInitImplement
            r0.<init>()
            r1.iampsInitInterface = r0
            return
    }

    public static synchronized xyz.adscope.amps.manager.AMPSSDKManager getInstance() {
            java.lang.Class<xyz.adscope.amps.manager.AMPSSDKManager> r0 = xyz.adscope.amps.manager.AMPSSDKManager.class
            monitor-enter(r0)
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.manager.AMPSSDKManager> r1 = xyz.adscope.amps.manager.AMPSSDKManager.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.manager.AMPSSDKManager r2 = new xyz.adscope.amps.manager.AMPSSDKManager     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.manager.AMPSSDKManager.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public xyz.adscope.amps.init.AMPSInitConfig getAMPSAdConfig() {
            r1 = this;
            xyz.adscope.amps.init.AMPSInitConfig r0 = r1.mAMPSAdConfig
            return r0
    }

    public xyz.adscope.amps.config.AMPSPrivacyConfig getAMPSPrivacyConfig() {
            r1 = this;
            xyz.adscope.amps.config.AMPSPrivacyConfig r0 = r1.mAMPSPrivacyConfig
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.mAppId
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public xyz.adscope.amps.init.inter.IAMPSInitInterface getIAMPSInitInterface() {
            r1 = this;
            xyz.adscope.amps.init.inter.IAMPSInitInterface r0 = r1.iampsInitInterface
            return r0
    }

    public java.lang.String getSdkVersion() {
            r1 = this;
            java.lang.String r0 = "5.1.0.32"
            return r0
    }

    public java.lang.String getUserAgent() {
            r1 = this;
            java.lang.String r0 = r1.userAgent
            return r0
    }

    public void handleInitResultCallBack(int r3) {
            r2 = this;
            java.util.List<xyz.adscope.amps.init.inter.IAMPSInitCallback> r0 = r2.mInitCallBackList
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto La
            goto L59
        La:
            if (r3 != r1) goto L31
            java.util.List<xyz.adscope.amps.init.inter.IAMPSInitCallback> r3 = r2.mInitCallBackList
            if (r3 == 0) goto L59
            int r3 = r3.size()
            if (r3 <= 0) goto L59
            java.util.List<xyz.adscope.amps.init.inter.IAMPSInitCallback> r3 = r2.mInitCallBackList
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r3.next()
            xyz.adscope.amps.init.inter.IAMPSInitCallback r0 = (xyz.adscope.amps.init.inter.IAMPSInitCallback) r0
            if (r0 == 0) goto L2d
            r0.successCallback()
        L2d:
            r3.remove()
            goto L1c
        L31:
            if (r3 != 0) goto L59
            java.util.List<xyz.adscope.amps.init.inter.IAMPSInitCallback> r3 = r2.mInitCallBackList
            if (r3 == 0) goto L59
            int r3 = r3.size()
            if (r3 <= 0) goto L59
            java.util.List<xyz.adscope.amps.init.inter.IAMPSInitCallback> r3 = r2.mInitCallBackList
            java.util.Iterator r3 = r3.iterator()
        L43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r3.next()
            xyz.adscope.amps.init.inter.IAMPSInitCallback r0 = (xyz.adscope.amps.init.inter.IAMPSInitCallback) r0
            if (r0 == 0) goto L55
            r1 = 0
            r0.failCallback(r1)
        L55:
            r3.remove()
            goto L43
        L59:
            return
    }

    public void initialize(android.content.Context r7, xyz.adscope.amps.init.AMPSInitConfig r8, xyz.adscope.amps.init.inter.IAMPSInitCallback r9) {
            r6 = this;
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = r6.sdkInitStatus()     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r1 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusSuccess     // Catch: java.lang.Throwable -> L112
            if (r0 != r1) goto Lc
            r9.successCallback()     // Catch: java.lang.Throwable -> L112
            return
        Lc:
            xyz.adscope.amps.model.AMPSGlobalModel r0 = new xyz.adscope.amps.model.AMPSGlobalModel     // Catch: java.lang.Throwable -> L112
            r0.<init>()     // Catch: java.lang.Throwable -> L112
            r6.ampsGlobalModel = r0     // Catch: java.lang.Throwable -> L112
            android.content.Context r0 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L112
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L112
            r6.setContext(r0)     // Catch: java.lang.Throwable -> L112
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.manager.AMPSSDKManager.initStartTime = r0     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r6.ampsGlobalModel     // Catch: java.lang.Throwable -> L112
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            r0.setInitStartTime(r1)     // Catch: java.lang.Throwable -> L112
            r0 = 0
            java.lang.String r2 = ""
            if (r8 != 0) goto L90
            xyz.adscope.amps.common.AMPSError r7 = new xyz.adscope.amps.common.AMPSError     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r8.<init>()     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r3 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusFail     // Catch: java.lang.Throwable -> L112
            int r4 = r3.getCode()     // Catch: java.lang.Throwable -> L112
            r8.append(r4)     // Catch: java.lang.Throwable -> L112
            r8.append(r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = r3.getMsg()     // Catch: java.lang.Throwable -> L112
            r7.<init>(r8, r4)     // Catch: java.lang.Throwable -> L112
            r9.failCallback(r7)     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.model.AMPSGlobalModel r7 = r6.ampsGlobalModel     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r8 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_INIT_FAIL_CONFIG_NULL     // Catch: java.lang.Throwable -> L112
            java.lang.String r9 = r8.getErrorCode()     // Catch: java.lang.Throwable -> L112
            r7.setErrorCode(r9)     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.model.AMPSGlobalModel r7 = r6.ampsGlobalModel     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = r8.getErrorMsg()     // Catch: java.lang.Throwable -> L112
            r7.setErrorMsg(r8)     // Catch: java.lang.Throwable -> L112
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            long r4 = xyz.adscope.amps.manager.AMPSSDKManager.initStartTime     // Catch: java.lang.Throwable -> L112
            long r7 = r7 - r4
            xyz.adscope.amps.report.AMPSReportLoader r9 = xyz.adscope.amps.report.AMPSReportLoader.getInstance()     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_INIT_FAIL_CODE     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = r4.getCodeStr()     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r5.<init>()     // Catch: java.lang.Throwable -> L112
            r5.append(r7)     // Catch: java.lang.Throwable -> L112
            r5.append(r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L112
            r9.reportInitLog(r4, r7)     // Catch: java.lang.Throwable -> L112
            r6.initStatus = r3     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.manager.AMPSSDKManager.initStartTime = r0     // Catch: java.lang.Throwable -> L112
            return
        L90:
            java.lang.String r3 = r8.getAppId()     // Catch: java.lang.Throwable -> L112
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L112
            if (r4 == 0) goto Lf7
            xyz.adscope.amps.common.AMPSError r7 = new xyz.adscope.amps.common.AMPSError     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r8.<init>()     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r3 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusFail     // Catch: java.lang.Throwable -> L112
            int r4 = r3.getCode()     // Catch: java.lang.Throwable -> L112
            r8.append(r4)     // Catch: java.lang.Throwable -> L112
            r8.append(r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = r3.getMsg()     // Catch: java.lang.Throwable -> L112
            r7.<init>(r8, r4)     // Catch: java.lang.Throwable -> L112
            r9.failCallback(r7)     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.model.AMPSGlobalModel r7 = r6.ampsGlobalModel     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r8 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_INIT_FAIL_APPID_NULL     // Catch: java.lang.Throwable -> L112
            java.lang.String r9 = r8.getErrorCode()     // Catch: java.lang.Throwable -> L112
            r7.setErrorCode(r9)     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.model.AMPSGlobalModel r7 = r6.ampsGlobalModel     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = r8.getErrorMsg()     // Catch: java.lang.Throwable -> L112
            r7.setErrorMsg(r8)     // Catch: java.lang.Throwable -> L112
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            long r4 = xyz.adscope.amps.manager.AMPSSDKManager.initStartTime     // Catch: java.lang.Throwable -> L112
            long r7 = r7 - r4
            xyz.adscope.amps.report.AMPSReportLoader r9 = xyz.adscope.amps.report.AMPSReportLoader.getInstance()     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_INIT_FAIL_CODE     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = r4.getCodeStr()     // Catch: java.lang.Throwable -> L112
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r5.<init>()     // Catch: java.lang.Throwable -> L112
            r5.append(r7)     // Catch: java.lang.Throwable -> L112
            r5.append(r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L112
            r9.reportInitLog(r4, r7)     // Catch: java.lang.Throwable -> L112
            r6.initStatus = r3     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.manager.AMPSSDKManager.initStartTime = r0     // Catch: java.lang.Throwable -> L112
            return
        Lf7:
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusLoading     // Catch: java.lang.Throwable -> L112
            r6.initStatus = r0     // Catch: java.lang.Throwable -> L112
            r6.mAMPSAdConfig = r8     // Catch: java.lang.Throwable -> L112
            r6.setAppId(r3)     // Catch: java.lang.Throwable -> L112
            r6.setAMPSAdConfig(r8)     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.init.inter.IAMPSInitInterface r0 = r6.iampsInitInterface     // Catch: java.lang.Throwable -> L112
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L112
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)     // Catch: java.lang.Throwable -> L112
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r6.ampsGlobalModel     // Catch: java.lang.Throwable -> L112
            r0.init(r7, r8, r1, r9)     // Catch: java.lang.Throwable -> L112
        L112:
            return
    }

    public xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus sdkInitStatus() {
            r1 = this;
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = r1.initStatus
            return r0
    }

    public void setAMPSAdConfig(xyz.adscope.amps.init.AMPSInitConfig r1) {
            r0 = this;
            r0.mAMPSAdConfig = r1
            return
    }

    public void setAMPSPrivacyConfig(xyz.adscope.amps.config.AMPSPrivacyConfig r1) {
            r0 = this;
            r0.mAMPSPrivacyConfig = r1
            return
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.mAppId = r1
            return
    }

    public void setContext(android.content.Context r1) {
            r0 = this;
            r0.mContext = r1
            return
    }

    public void setInitResultCallBack(xyz.adscope.amps.init.inter.IAMPSInitCallback r3) {
            r2 = this;
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = r2.initStatus
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r1 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusSuccess
            if (r0 != r1) goto La
            r3.successCallback()
            return
        La:
            xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r1 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusFail
            if (r0 != r1) goto L13
            r0 = 0
            r3.failCallback(r0)
            return
        L13:
            java.util.List<xyz.adscope.amps.init.inter.IAMPSInitCallback> r0 = r2.mInitCallBackList
            r0.add(r3)
            return
    }

    public void setInitStatus(xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus r1) {
            r0 = this;
            r0.initStatus = r1
            return
    }

    public void setUserAgent(java.lang.String r1) {
            r0 = this;
            r0.userAgent = r1
            return
    }
}
