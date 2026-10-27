package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class GlobalConfig {

    @com.beizi.fusion.model.JsonNode(key = "adPlusConfig")
    private com.beizi.fusion.model.AdPlusConfig adPlusConfig;

    @com.beizi.fusion.model.JsonNode(key = "bannerExcutorForLieYing")
    private java.lang.Object bannerExcutorForLieYing;

    @com.beizi.fusion.model.JsonNode(key = "configVersion")
    private java.lang.String configVersion;

    @com.beizi.fusion.model.JsonNode(key = "configurator")
    private com.beizi.fusion.model.Configurator configurator;

    @com.beizi.fusion.model.JsonNode(key = "crashUrl")
    private java.lang.String crashUrl;

    @com.beizi.fusion.model.JsonNode(key = "expireTime")
    private int expireTime;

    @com.beizi.fusion.model.JsonNode(key = "hr")
    private java.lang.Object hr;

    @com.beizi.fusion.model.JsonNode(key = "incentiveConfig")
    private com.beizi.fusion.model.IncentiveConfig incentiveConfig;

    @com.beizi.fusion.model.JsonNode(key = "lastUpdateTime")
    private long lastUpdateTime;

    @com.beizi.fusion.model.JsonNode(key = "manager")
    private com.beizi.fusion.model.Manager manager;

    @com.beizi.fusion.model.JsonNode(key = "maxValidTime")
    private long maxValidTime;

    @com.beizi.fusion.model.JsonNode(key = "messenger")
    private com.beizi.fusion.model.Messenger messenger;

    @com.beizi.fusion.model.JsonNode(key = "smFlag")
    private java.lang.String smFlag;

    @com.beizi.fusion.model.JsonNode(key = "taskConfig")
    private com.beizi.fusion.model.TaskConfig taskConfig;

    public GlobalConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.beizi.fusion.model.GlobalConfig objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.GlobalConfig> r0 = com.beizi.fusion.model.GlobalConfig.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.GlobalConfig r1 = (com.beizi.fusion.model.GlobalConfig) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.beizi.fusion.model.GlobalConfig objectFromData(java.lang.String r0, java.lang.String r1) {
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.beizi.fusion.model.GlobalConfig> r1 = com.beizi.fusion.model.GlobalConfig.class
            java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
            com.beizi.fusion.model.GlobalConfig r0 = (com.beizi.fusion.model.GlobalConfig) r0     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static java.lang.String objectToJson(java.lang.Object r1) {
            java.lang.Class<com.beizi.fusion.model.GlobalConfig> r0 = com.beizi.fusion.model.GlobalConfig.class
            java.lang.String r1 = com.beizi.fusion.model.JsonResolver.toJson(r1, r0)     // Catch: java.lang.Exception -> L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    public com.beizi.fusion.model.AdPlusConfig getAdPlusConfig() {
            r1 = this;
            com.beizi.fusion.model.AdPlusConfig r0 = r1.adPlusConfig
            return r0
    }

    public java.lang.Object getBannerExcutorForLieYing() {
            r1 = this;
            java.lang.Object r0 = r1.bannerExcutorForLieYing
            return r0
    }

    public java.lang.String getConfigVersion() {
            r1 = this;
            java.lang.String r0 = r1.configVersion
            return r0
    }

    public com.beizi.fusion.model.Configurator getConfigurator() {
            r1 = this;
            com.beizi.fusion.model.Configurator r0 = r1.configurator
            return r0
    }

    public java.lang.String getCrashUrl() {
            r1 = this;
            java.lang.String r0 = r1.crashUrl
            return r0
    }

    public int getExpireTime() {
            r1 = this;
            int r0 = r1.expireTime
            return r0
    }

    public java.lang.Object getHr() {
            r1 = this;
            java.lang.Object r0 = r1.hr
            return r0
    }

    public com.beizi.fusion.model.IncentiveConfig getIncentiveConfig() {
            r1 = this;
            com.beizi.fusion.model.IncentiveConfig r0 = r1.incentiveConfig
            return r0
    }

    public long getLastUpdateTime() {
            r2 = this;
            long r0 = r2.lastUpdateTime
            return r0
    }

    public com.beizi.fusion.model.Manager getManager() {
            r1 = this;
            com.beizi.fusion.model.Manager r0 = r1.manager
            return r0
    }

    public long getMaxValidTime() {
            r2 = this;
            long r0 = r2.maxValidTime
            return r0
    }

    public com.beizi.fusion.model.Messenger getMessenger() {
            r1 = this;
            com.beizi.fusion.model.Messenger r0 = r1.messenger
            return r0
    }

    public java.lang.String getSmFlag() {
            r1 = this;
            java.lang.String r0 = r1.smFlag
            return r0
    }

    public com.beizi.fusion.model.TaskConfig getTaskConfig() {
            r1 = this;
            com.beizi.fusion.model.TaskConfig r0 = r1.taskConfig
            return r0
    }

    public void setAdPlusConfig(com.beizi.fusion.model.AdPlusConfig r1) {
            r0 = this;
            r0.adPlusConfig = r1
            return
    }

    public void setBannerExcutorForLieYing(java.lang.Object r1) {
            r0 = this;
            r0.bannerExcutorForLieYing = r1
            return
    }

    public void setConfigVersion(java.lang.String r1) {
            r0 = this;
            r0.configVersion = r1
            return
    }

    public void setConfigurator(com.beizi.fusion.model.Configurator r1) {
            r0 = this;
            r0.configurator = r1
            return
    }

    public void setCrashUrl(java.lang.String r1) {
            r0 = this;
            r0.crashUrl = r1
            return
    }

    public void setExpireTime(int r1) {
            r0 = this;
            r0.expireTime = r1
            return
    }

    public void setHr(java.lang.Object r1) {
            r0 = this;
            r0.hr = r1
            return
    }

    public void setIncentiveConfig(com.beizi.fusion.model.IncentiveConfig r1) {
            r0 = this;
            r0.incentiveConfig = r1
            return
    }

    public void setLastUpdateTime(long r1) {
            r0 = this;
            r0.lastUpdateTime = r1
            return
    }

    public void setManager(com.beizi.fusion.model.Manager r1) {
            r0 = this;
            r0.manager = r1
            return
    }

    public void setMaxValidTime(long r1) {
            r0 = this;
            r0.maxValidTime = r1
            return
    }

    public void setMessenger(com.beizi.fusion.model.Messenger r1) {
            r0 = this;
            r0.messenger = r1
            return
    }

    public void setSmFlag(java.lang.String r1) {
            r0 = this;
            r0.smFlag = r1
            return
    }

    public void setTaskConfig(com.beizi.fusion.model.TaskConfig r1) {
            r0 = this;
            r0.taskConfig = r1
            return
    }
}
