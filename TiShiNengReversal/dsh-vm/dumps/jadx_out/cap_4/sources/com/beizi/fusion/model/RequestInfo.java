package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RequestInfo {
    private static com.beizi.fusion.model.RequestInfo mInstance;
    private java.lang.String adConfigVersion;
    private java.lang.String appId;
    private java.lang.String appVersion;
    private java.lang.String appVersionCode;
    private java.lang.String channelStr;
    private java.lang.String configVersion;
    private android.content.Context context;
    private java.lang.String customOaid;
    private com.beizi.fusion.model.DevInfo devInfo;
    private com.beizi.fusion.model.EnvInfo envInfo;
    private java.lang.String eventVersion;
    private java.lang.String forbidSensor;
    private java.lang.String installTime;
    public boolean isInit;
    private java.lang.String nowTime;
    private java.lang.String packageName;
    private java.lang.String sdkVersion;
    private java.lang.String taskVersion;
    private java.lang.String updateTime;

    private RequestInfo(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isInit = r0
            java.lang.String r0 = "0"
            r1.forbidSensor = r0
            r1.context = r2
            return
    }

    public static com.beizi.fusion.model.RequestInfo getInstance(android.content.Context r2) {
            com.beizi.fusion.model.RequestInfo r0 = com.beizi.fusion.model.RequestInfo.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.model.RequestInfo> r0 = com.beizi.fusion.model.RequestInfo.class
            monitor-enter(r0)
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.model.RequestInfo r1 = new com.beizi.fusion.model.RequestInfo     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.model.RequestInfo.mInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.beizi.fusion.model.RequestInfo r2 = com.beizi.fusion.model.RequestInfo.mInstance
            return r2
    }

    public java.lang.String getAdConfigVersion() {
            r1 = this;
            java.lang.String r0 = r1.adConfigVersion
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public java.lang.String getAppVersion() {
            r1 = this;
            java.lang.String r0 = r1.appVersion
            return r0
    }

    public java.lang.String getAppVersionCode() {
            r1 = this;
            java.lang.String r0 = r1.appVersionCode
            return r0
    }

    public java.lang.String getChannelStr() {
            r1 = this;
            java.lang.String r0 = r1.channelStr
            return r0
    }

    public java.lang.String getConfigVersion() {
            r1 = this;
            java.lang.String r0 = r1.configVersion
            return r0
    }

    public java.lang.String getCustomOaid() {
            r1 = this;
            java.lang.String r0 = r1.customOaid
            return r0
    }

    public com.beizi.fusion.model.DevInfo getDevInfo() {
            r1 = this;
            com.beizi.fusion.model.DevInfo r0 = r1.devInfo
            return r0
    }

    public com.beizi.fusion.model.EnvInfo getEnvInfo() {
            r1 = this;
            com.beizi.fusion.model.EnvInfo r0 = r1.envInfo
            return r0
    }

    public java.lang.String getEventVersion() {
            r1 = this;
            java.lang.String r0 = r1.eventVersion
            return r0
    }

    public java.lang.String getForbidSensor() {
            r1 = this;
            java.lang.String r0 = r1.forbidSensor
            return r0
    }

    public java.lang.String getInstallTime() {
            r1 = this;
            java.lang.String r0 = r1.installTime
            return r0
    }

    public java.lang.String getNowTime() {
            r1 = this;
            java.lang.String r0 = r1.nowTime
            return r0
    }

    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.packageName
            return r0
    }

    public java.lang.String getSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.sdkVersion
            return r0
    }

    public java.lang.String getTaskVersion() {
            r1 = this;
            java.lang.String r0 = r1.taskVersion
            return r0
    }

    public java.lang.String getUpdateTime() {
            r1 = this;
            java.lang.String r0 = r1.updateTime
            return r0
    }

    public com.beizi.fusion.model.RequestInfo init() {
            r2 = this;
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            java.lang.String r0 = r0.b()
            r2.appId = r0
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            java.lang.String r0 = r0.c()
            r2.channelStr = r0
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            java.lang.String r0 = r0.d()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            java.lang.String r0 = r0.d()
            r2.customOaid = r0
            goto L43
        L2d:
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            if (r0 == 0) goto L43
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            java.lang.String r0 = r0.getDevOaid()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L43
            r2.customOaid = r0
        L43:
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            if (r0 == 0) goto L57
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            boolean r0 = r0.forbidSensor()
            if (r0 == 0) goto L57
            java.lang.String r0 = "1"
            r2.forbidSensor = r0
        L57:
            android.content.Context r0 = r2.context
            java.lang.String r0 = com.beizi.fusion.tool.ap.c(r0)
            r2.packageName = r0
            android.content.Context r0 = r2.context
            long r0 = com.beizi.fusion.tool.ap.a(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.installTime = r0
            android.content.Context r0 = r2.context
            long r0 = com.beizi.fusion.tool.ap.b(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.updateTime = r0
            android.content.Context r0 = r2.context
            java.lang.String r0 = com.beizi.fusion.tool.ap.d(r0)
            r2.appVersion = r0
            android.content.Context r0 = r2.context
            int r0 = com.beizi.fusion.tool.ap.e(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.appVersionCode = r0
            java.lang.String r0 = "5.2.1.20"
            r2.sdkVersion = r0
            com.beizi.fusion.model.DevInfo r0 = new com.beizi.fusion.model.DevInfo
            android.content.Context r1 = r2.context
            r0.<init>(r1)
            r2.devInfo = r0
            com.beizi.fusion.model.EnvInfo r0 = new com.beizi.fusion.model.EnvInfo
            android.content.Context r1 = r2.context
            r0.<init>(r1)
            r2.envInfo = r0
            r0 = 1
            r2.isInit = r0
            com.beizi.fusion.model.RequestInfo r0 = com.beizi.fusion.model.RequestInfo.mInstance
            return r0
    }

    public boolean isInit() {
            r1 = this;
            boolean r0 = r1.isInit
            return r0
    }

    public void setAdConfigVersion(java.lang.String r1) {
            r0 = this;
            r0.adConfigVersion = r1
            return
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    public void setAppVersion(java.lang.String r1) {
            r0 = this;
            r0.appVersion = r1
            return
    }

    public void setAppVersionCode(java.lang.String r1) {
            r0 = this;
            r0.appVersionCode = r1
            return
    }

    public void setChannelStr(java.lang.String r1) {
            r0 = this;
            r0.channelStr = r1
            return
    }

    public void setConfigVersion(java.lang.String r1) {
            r0 = this;
            r0.configVersion = r1
            return
    }

    public void setCustomOaid(java.lang.String r1) {
            r0 = this;
            r0.customOaid = r1
            return
    }

    public void setDevInfo(com.beizi.fusion.model.DevInfo r1) {
            r0 = this;
            r0.devInfo = r1
            return
    }

    public void setEnvInfo(com.beizi.fusion.model.EnvInfo r1) {
            r0 = this;
            r0.envInfo = r1
            return
    }

    public void setEventVersion(java.lang.String r1) {
            r0 = this;
            r0.eventVersion = r1
            return
    }

    public void setInstallTime(java.lang.String r1) {
            r0 = this;
            r0.installTime = r1
            return
    }

    public void setNowTime(java.lang.String r1) {
            r0 = this;
            r0.nowTime = r1
            return
    }

    public void setPackageName(java.lang.String r1) {
            r0 = this;
            r0.packageName = r1
            return
    }

    public void setSdkVersion(java.lang.String r1) {
            r0 = this;
            r0.sdkVersion = r1
            return
    }

    public void setTaskVersion(java.lang.String r1) {
            r0 = this;
            r0.taskVersion = r1
            return
    }

    public void setUpdateTime(java.lang.String r1) {
            r0 = this;
            r0.updateTime = r1
            return
    }

    public void updateUserAgent(java.lang.String r2) {
            r1 = this;
            com.beizi.fusion.model.EnvInfo r0 = r1.envInfo
            if (r0 != 0) goto L5
            return
        L5:
            r0.setUserAgent(r2)
            return
    }
}
