package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AdPlusConfig {

    @com.beizi.fusion.model.JsonNode(key = "adUrl")
    private java.lang.String adUrl;

    @com.beizi.fusion.model.JsonNode(key = "h5RedirectBlackList")
    private java.util.List<java.lang.String> h5RedirectBlackList;

    @com.beizi.fusion.model.JsonNode(key = "version")
    private java.lang.String version;

    public AdPlusConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.beizi.fusion.model.AdPlusConfig objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.AdPlusConfig> r0 = com.beizi.fusion.model.AdPlusConfig.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.AdPlusConfig r1 = (com.beizi.fusion.model.AdPlusConfig) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.beizi.fusion.model.AdPlusConfig objectFromData(java.lang.String r0, java.lang.String r1) {
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.beizi.fusion.model.AdPlusConfig> r1 = com.beizi.fusion.model.AdPlusConfig.class
            java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
            com.beizi.fusion.model.AdPlusConfig r0 = (com.beizi.fusion.model.AdPlusConfig) r0     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public java.lang.String getAdUrl() {
            r1 = this;
            java.lang.String r0 = r1.adUrl
            return r0
    }

    public java.util.List<java.lang.String> getH5RedirectBlackList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.h5RedirectBlackList
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public void setAdUrl(java.lang.String r1) {
            r0 = this;
            r0.adUrl = r1
            return
    }

    public void setH5RedirectBlackList(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.h5RedirectBlackList = r1
            return
    }

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.version = r1
            return
    }
}
