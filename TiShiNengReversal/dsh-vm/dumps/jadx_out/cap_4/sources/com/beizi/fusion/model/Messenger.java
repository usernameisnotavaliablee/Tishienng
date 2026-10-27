package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Messenger {

    @com.beizi.fusion.model.JsonNode(key = "checkInterval")
    private long checkInterval;

    @com.beizi.fusion.model.JsonNode(key = "configVersion")
    private java.lang.String configVersion;

    @com.beizi.fusion.model.JsonNode(key = "events")
    private java.util.List<com.beizi.fusion.model.Messenger.EventsBean> events;

    @com.beizi.fusion.model.JsonNode(key = "expireTime")
    private long expireTime;

    @com.beizi.fusion.model.JsonNode(key = "fileMaxSize")
    private java.lang.String fileMaxSize;

    @com.beizi.fusion.model.JsonNode(key = "id")
    private java.lang.String id;

    @com.beizi.fusion.model.JsonNode(key = "job")
    private java.lang.String job;

    @com.beizi.fusion.model.JsonNode(key = "version")
    private java.lang.String version;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EventsBean {

        @com.beizi.fusion.model.JsonNode(key = "codes")
        private java.util.List<java.lang.String> codes;

        @com.beizi.fusion.model.JsonNode(key = "isOnline")
        private java.lang.String isOnline;

        @com.beizi.fusion.model.JsonNode(key = "offlineUrl")
        private java.lang.String offlineUrl;

        @com.beizi.fusion.model.JsonNode(key = "uploadUrl")
        private java.lang.String uploadUrl;



        public EventsBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.util.List<com.beizi.fusion.model.Messenger.EventsBean> arrayEventsBeanFromData(java.lang.String r1) {
                com.beizi.fusion.model.Messenger$EventsBean$1 r0 = new com.beizi.fusion.model.Messenger$EventsBean$1
                r0.<init>()
                java.lang.reflect.Type r0 = r0.getType()
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L10
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L10
                return r1
            L10:
                r1 = 0
                return r1
        }

        public static java.util.List<com.beizi.fusion.model.Messenger.EventsBean> arrayEventsBeanFromData(java.lang.String r1, java.lang.String r2) {
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
                com.beizi.fusion.model.Messenger$EventsBean$2 r1 = new com.beizi.fusion.model.Messenger$EventsBean$2     // Catch: java.lang.Throwable -> L1d
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

        public static com.beizi.fusion.model.Messenger.EventsBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.Messenger$EventsBean> r0 = com.beizi.fusion.model.Messenger.EventsBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.Messenger$EventsBean r1 = (com.beizi.fusion.model.Messenger.EventsBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public static com.beizi.fusion.model.Messenger.EventsBean objectFromData(java.lang.String r0, java.lang.String r1) {
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
                java.lang.Class<com.beizi.fusion.model.Messenger$EventsBean> r1 = com.beizi.fusion.model.Messenger.EventsBean.class
                java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
                com.beizi.fusion.model.Messenger$EventsBean r0 = (com.beizi.fusion.model.Messenger.EventsBean) r0     // Catch: java.lang.Throwable -> L12
                return r0
            L12:
                r0 = 0
                return r0
        }

        public java.util.List<java.lang.String> getCodes() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.codes
                return r0
        }

        public java.lang.String getIsOnline() {
                r1 = this;
                java.lang.String r0 = r1.isOnline
                return r0
        }

        public java.lang.String getOfflineUrl() {
                r1 = this;
                java.lang.String r0 = r1.offlineUrl
                return r0
        }

        public java.lang.String getUploadUrl() {
                r1 = this;
                java.lang.String r0 = r1.uploadUrl
                return r0
        }

        public void setCodes(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.codes = r1
                return
        }

        public void setIsOnline(java.lang.String r1) {
                r0 = this;
                r0.isOnline = r1
                return
        }

        public void setOfflineUrl(java.lang.String r1) {
                r0 = this;
                r0.offlineUrl = r1
                return
        }

        public void setUploadUrl(java.lang.String r1) {
                r0 = this;
                r0.uploadUrl = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "EventsBean{uploadUrl='"
                r0.append(r1)
                java.lang.String r1 = r3.uploadUrl
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", offlineUrl='"
                r0.append(r2)
                java.lang.String r2 = r3.offlineUrl
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", isOnline='"
                r0.append(r2)
                java.lang.String r2 = r3.isOnline
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", codes="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r3.codes
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public Messenger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.beizi.fusion.model.Messenger> arrayMessengerFromData(java.lang.String r1) {
            com.beizi.fusion.model.Messenger$1 r0 = new com.beizi.fusion.model.Messenger$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L10
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.util.List<com.beizi.fusion.model.Messenger> arrayMessengerFromData(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.beizi.fusion.model.Messenger$2 r1 = new com.beizi.fusion.model.Messenger$2     // Catch: java.lang.Throwable -> L1d
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

    public static com.beizi.fusion.model.Messenger objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.Messenger> r0 = com.beizi.fusion.model.Messenger.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.Messenger r1 = (com.beizi.fusion.model.Messenger) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.beizi.fusion.model.Messenger objectFromData(java.lang.String r0, java.lang.String r1) {
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.beizi.fusion.model.Messenger> r1 = com.beizi.fusion.model.Messenger.class
            java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
            com.beizi.fusion.model.Messenger r0 = (com.beizi.fusion.model.Messenger) r0     // Catch: java.lang.Throwable -> L12
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

    public java.lang.String getConfigVersion() {
            r1 = this;
            java.lang.String r0 = r1.configVersion
            return r0
    }

    public java.util.List<com.beizi.fusion.model.Messenger.EventsBean> getEvents() {
            r1 = this;
            java.util.List<com.beizi.fusion.model.Messenger$EventsBean> r0 = r1.events
            return r0
    }

    public long getExpireTime() {
            r2 = this;
            long r0 = r2.expireTime
            return r0
    }

    public java.lang.String getFileMaxSize() {
            r1 = this;
            java.lang.String r0 = r1.fileMaxSize
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

    public void setConfigVersion(java.lang.String r1) {
            r0 = this;
            r0.configVersion = r1
            return
    }

    public void setEvents(java.util.List<com.beizi.fusion.model.Messenger.EventsBean> r1) {
            r0 = this;
            r0.events = r1
            return
    }

    public void setExpireTime(long r1) {
            r0 = this;
            r0.expireTime = r1
            return
    }

    public void setFileMaxSize(java.lang.String r1) {
            r0 = this;
            r0.fileMaxSize = r1
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

    public void setVersion(java.lang.String r1) {
            r0 = this;
            r0.version = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Messenger{configVersion='"
            r0.append(r1)
            java.lang.String r1 = r4.configVersion
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", id='"
            r0.append(r2)
            java.lang.String r2 = r4.id
            r0.append(r2)
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
            java.lang.String r2 = ", checkInterval="
            r0.append(r2)
            long r2 = r4.checkInterval
            r0.append(r2)
            java.lang.String r2 = ", expireTime="
            r0.append(r2)
            long r2 = r4.expireTime
            r0.append(r2)
            java.lang.String r2 = ", fileMaxSize='"
            r0.append(r2)
            java.lang.String r2 = r4.fileMaxSize
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", events="
            r0.append(r1)
            java.util.List<com.beizi.fusion.model.Messenger$EventsBean> r1 = r4.events
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
