package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Configurator {

    @com.beizi.fusion.model.JsonNode(key = "checkInterval")
    private long checkInterval;

    @com.beizi.fusion.model.JsonNode(key = "configUrl")
    private java.lang.String configUrl;

    @com.beizi.fusion.model.JsonNode(key = "configVersion")
    private java.lang.String configVersion;

    @com.beizi.fusion.model.JsonNode(key = "id")
    private java.lang.String id;

    @com.beizi.fusion.model.JsonNode(key = "job")
    private java.lang.String job;

    @com.beizi.fusion.model.JsonNode(key = "s2sbidding")
    private com.beizi.fusion.model.S2SBiddingConfig s2sbidding;

    @com.beizi.fusion.model.JsonNode(key = "version")
    private java.lang.String version;



    public Configurator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.beizi.fusion.model.Configurator> arraySdkConfigFromData(java.lang.String r1) {
            com.beizi.fusion.model.Configurator$1 r0 = new com.beizi.fusion.model.Configurator$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L10
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.util.List<com.beizi.fusion.model.Configurator> arraySdkConfigFromData(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.beizi.fusion.model.Configurator$2 r1 = new com.beizi.fusion.model.Configurator$2     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Throwable -> L1d
            org.json.JSONArray r2 = r0.getJSONArray(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r2, r1)     // Catch: java.lang.Throwable -> L1d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
    }

    public static com.beizi.fusion.model.Configurator objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.Configurator> r0 = com.beizi.fusion.model.Configurator.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.Configurator r1 = (com.beizi.fusion.model.Configurator) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.beizi.fusion.model.Configurator objectFromData(java.lang.String r0, java.lang.String r1) {
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.beizi.fusion.model.Configurator> r1 = com.beizi.fusion.model.Configurator.class
            java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
            com.beizi.fusion.model.Configurator r0 = (com.beizi.fusion.model.Configurator) r0     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public long getCheckInterval() {
            r2 = this;
            long r0 = r2.checkInterval
            return r0
    }

    public java.lang.String getConfigUrl() {
            r1 = this;
            java.lang.String r0 = r1.configUrl
            return r0
    }

    public java.lang.String getConfigVersion() {
            r1 = this;
            java.lang.String r0 = r1.configVersion
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getJob() {
            r1 = this;
            java.lang.String r0 = r1.job
            return r0
    }

    public com.beizi.fusion.model.S2SBiddingConfig getS2sbidding() {
            r1 = this;
            com.beizi.fusion.model.S2SBiddingConfig r0 = r1.s2sbidding
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public void setCheckInterval(long r1) {
            r0 = this;
            r0.checkInterval = r1
            return
    }

    public void setConfigUrl(java.lang.String r1) {
            r0 = this;
            r0.configUrl = r1
            return
    }

    public void setConfigVersion(java.lang.String r1) {
            r0 = this;
            r0.configVersion = r1
            return
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setJob(java.lang.String r1) {
            r0 = this;
            r0.job = r1
            return
    }

    public void setS2sbidding(com.beizi.fusion.model.S2SBiddingConfig r1) {
            r0 = this;
            r0.s2sbidding = r1
            return
    }

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.version = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Configurator{id='"
            r0.append(r1)
            java.lang.String r1 = r4.id
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", job='"
            r0.append(r2)
            java.lang.String r2 = r4.job
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", version='"
            r0.append(r2)
            java.lang.String r2 = r4.version
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", configVersion='"
            r0.append(r2)
            java.lang.String r2 = r4.configVersion
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", checkInterval="
            r0.append(r2)
            long r2 = r4.checkInterval
            r0.append(r2)
            java.lang.String r2 = ", configUrl='"
            r0.append(r2)
            java.lang.String r2 = r4.configUrl
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
