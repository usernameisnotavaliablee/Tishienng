package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class IncentiveConfig {

    @com.beizi.fusion.model.JsonNode(key = "authUrl")
    private java.lang.String authUrl;

    @com.beizi.fusion.model.JsonNode(key = "configVersion")
    private java.lang.String configVersion;

    @com.beizi.fusion.model.JsonNode(key = "macro")
    private java.lang.String macro;

    @com.beizi.fusion.model.JsonNode(key = "rtaUrl")
    private java.lang.String rtaUrl;

    @com.beizi.fusion.model.JsonNode(key = "transferUrl")
    private java.lang.String transferUrl;

    @com.beizi.fusion.model.JsonNode(key = "userInfoUrl")
    private java.lang.String userInfoUrl;

    public IncentiveConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.beizi.fusion.model.IncentiveConfig objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.IncentiveConfig> r0 = com.beizi.fusion.model.IncentiveConfig.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.IncentiveConfig r1 = (com.beizi.fusion.model.IncentiveConfig) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.beizi.fusion.model.IncentiveConfig objectFromData(java.lang.String r0, java.lang.String r1) {
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.beizi.fusion.model.IncentiveConfig> r1 = com.beizi.fusion.model.IncentiveConfig.class
            java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
            com.beizi.fusion.model.IncentiveConfig r0 = (com.beizi.fusion.model.IncentiveConfig) r0     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public java.lang.String getAuthUrl() {
            r1 = this;
            java.lang.String r0 = r1.authUrl
            return r0
    }

    public java.lang.String getConfigVersion() {
            r1 = this;
            java.lang.String r0 = r1.configVersion
            return r0
    }

    public java.lang.String getMacro() {
            r1 = this;
            java.lang.String r0 = r1.macro
            return r0
    }

    public java.lang.String getRtaUrl() {
            r1 = this;
            java.lang.String r0 = r1.rtaUrl
            return r0
    }

    public java.lang.String getTransferUrl() {
            r1 = this;
            java.lang.String r0 = r1.transferUrl
            return r0
    }

    public java.lang.String getUserInfoUrl() {
            r1 = this;
            java.lang.String r0 = r1.userInfoUrl
            return r0
    }

    public void setAuthUrl(java.lang.String r1) {
            r0 = this;
            r0.authUrl = r1
            return
    }

    public void setConfigVersion(java.lang.String r1) {
            r0 = this;
            r0.configVersion = r1
            return
    }

    public void setMacro(java.lang.String r1) {
            r0 = this;
            r0.macro = r1
            return
    }

    public void setRtaUrl(java.lang.String r1) {
            r0 = this;
            r0.rtaUrl = r1
            return
    }

    public void setTransferUrl(java.lang.String r1) {
            r0 = this;
            r0.transferUrl = r1
            return
    }

    public void setUserInfoUrl(java.lang.String r1) {
            r0 = this;
            r0.userInfoUrl = r1
            return
    }
}
