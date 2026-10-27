package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Manager {

    @com.beizi.fusion.model.JsonNode(key = "adSpaces")
    private java.util.List<com.beizi.fusion.model.AdSpacesBean> adSpaces;

    @com.beizi.fusion.model.JsonNode(key = "configVersion")
    private java.lang.String configVersion;

    @com.beizi.fusion.model.JsonNode(key = "init")
    private com.beizi.fusion.model.Manager.InitBean init;

    @com.beizi.fusion.model.JsonNode(key = "openSDKId")
    private java.lang.String openSDKId;

    @com.beizi.fusion.model.JsonNode(key = "openSensor")
    private int openSensor;

    @com.beizi.fusion.model.JsonNode(key = "personalRecommend")
    private int personalRecommend;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class InitBean {

        @com.beizi.fusion.model.JsonNode(key = "workers")
        private java.util.List<java.lang.String> workers;



        public InitBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.util.List<com.beizi.fusion.model.Manager.InitBean> arrayInitBeanFromData(java.lang.String r1) {
                com.beizi.fusion.model.Manager$InitBean$1 r0 = new com.beizi.fusion.model.Manager$InitBean$1
                r0.<init>()
                java.lang.reflect.Type r0 = r0.getType()
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L10
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L10
                return r1
            L10:
                r1 = 0
                return r1
        }

        public static java.util.List<com.beizi.fusion.model.Manager.InitBean> arrayInitBeanFromData(java.lang.String r1, java.lang.String r2) {
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
                com.beizi.fusion.model.Manager$InitBean$2 r1 = new com.beizi.fusion.model.Manager$InitBean$2     // Catch: java.lang.Throwable -> L1d
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

        public static com.beizi.fusion.model.Manager.InitBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.Manager$InitBean> r0 = com.beizi.fusion.model.Manager.InitBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.Manager$InitBean r1 = (com.beizi.fusion.model.Manager.InitBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public static com.beizi.fusion.model.Manager.InitBean objectFromData(java.lang.String r0, java.lang.String r1) {
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
                java.lang.Class<com.beizi.fusion.model.Manager$InitBean> r1 = com.beizi.fusion.model.Manager.InitBean.class
                java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
                com.beizi.fusion.model.Manager$InitBean r0 = (com.beizi.fusion.model.Manager.InitBean) r0     // Catch: java.lang.Throwable -> L12
                return r0
            L12:
                r0 = 0
                return r0
        }

        public java.util.List<java.lang.String> getWorkers() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.workers
                return r0
        }

        public void setWorkers(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.workers = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "InitBean{workers="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r2.workers
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public Manager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.beizi.fusion.model.Manager> arrayManagerBeanFromData(java.lang.String r1) {
            com.beizi.fusion.model.Manager$1 r0 = new com.beizi.fusion.model.Manager$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L10
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.util.List<com.beizi.fusion.model.Manager> arrayManagerBeanFromData(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.beizi.fusion.model.Manager$2 r1 = new com.beizi.fusion.model.Manager$2     // Catch: java.lang.Throwable -> L1d
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

    public static com.beizi.fusion.model.Manager objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.Manager> r0 = com.beizi.fusion.model.Manager.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.Manager r1 = (com.beizi.fusion.model.Manager) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.beizi.fusion.model.Manager objectFromData(java.lang.String r0, java.lang.String r1) {
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.beizi.fusion.model.Manager> r1 = com.beizi.fusion.model.Manager.class
            java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
            com.beizi.fusion.model.Manager r0 = (com.beizi.fusion.model.Manager) r0     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public java.util.List<com.beizi.fusion.model.AdSpacesBean> getAdSpaces() {
            r1 = this;
            java.util.List<com.beizi.fusion.model.AdSpacesBean> r0 = r1.adSpaces
            return r0
    }

    public java.lang.String getConfigVersion() {
            r1 = this;
            java.lang.String r0 = r1.configVersion
            return r0
    }

    public com.beizi.fusion.model.Manager.InitBean getInit() {
            r1 = this;
            com.beizi.fusion.model.Manager$InitBean r0 = r1.init
            return r0
    }

    public java.lang.String getOpenSDKId() {
            r1 = this;
            java.lang.String r0 = r1.openSDKId
            return r0
    }

    public int getOpenSensor() {
            r1 = this;
            int r0 = r1.openSensor
            return r0
    }

    public int getPersonalRecommend() {
            r1 = this;
            int r0 = r1.personalRecommend
            return r0
    }

    public void setAdSpaces(java.util.List<com.beizi.fusion.model.AdSpacesBean> r1) {
            r0 = this;
            r0.adSpaces = r1
            return
    }

    public void setConfigVersion(java.lang.String r1) {
            r0 = this;
            r0.configVersion = r1
            return
    }

    public void setInit(com.beizi.fusion.model.Manager.InitBean r1) {
            r0 = this;
            r0.init = r1
            return
    }

    public void setOpenSDKId(java.lang.String r1) {
            r0 = this;
            r0.openSDKId = r1
            return
    }

    public void setOpenSensor(int r1) {
            r0 = this;
            r0.openSensor = r1
            return
    }

    public void setPersonalRecommend(int r1) {
            r0 = this;
            r0.personalRecommend = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Manager{configVersion='"
            r0.append(r1)
            java.lang.String r1 = r2.configVersion
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", init="
            r0.append(r1)
            com.beizi.fusion.model.Manager$InitBean r1 = r2.init
            r0.append(r1)
            java.lang.String r1 = ", adSpaces="
            r0.append(r1)
            java.util.List<com.beizi.fusion.model.AdSpacesBean> r1 = r2.adSpaces
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
