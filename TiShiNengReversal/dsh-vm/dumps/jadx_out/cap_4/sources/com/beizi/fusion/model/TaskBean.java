package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TaskBean {

    @com.beizi.fusion.model.JsonNode(key = "backTaskArray")
    private java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean> backTaskArray;

    @com.beizi.fusion.model.JsonNode(key = "checkInterval")
    private long checkInterval;

    @com.beizi.fusion.model.JsonNode(key = "expired")
    private long expired;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BackTaskArrayBean {

        @com.beizi.fusion.model.JsonNode(key = "action")
        private java.util.List<java.lang.String> action;

        @com.beizi.fusion.model.JsonNode(key = "apps")
        private java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean.AppLinkBean> apps;

        @com.beizi.fusion.model.JsonNode(key = "contentUrl")
        private java.lang.String contentUrl;

        @com.beizi.fusion.model.JsonNode(key = "method")
        private java.lang.String method;

        @com.beizi.fusion.model.JsonNode(key = "repeatCount")
        private int repeatCount;

        @com.beizi.fusion.model.JsonNode(key = "report")
        private java.util.List<java.lang.String> report;

        @com.beizi.fusion.model.JsonNode(key = "showTime")
        private long showTime;

        @com.beizi.fusion.model.JsonNode(key = "sleepTime")
        private long sleepTime;

        @com.beizi.fusion.model.JsonNode(key = "type")
        private int type;

        @com.beizi.fusion.model.JsonNode(key = "userAgent")
        private java.lang.String userAgent;



        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class AppLinkBean {

            @com.beizi.fusion.model.JsonNode(key = "appLinkId")
            private java.lang.String appLinkId;

            @com.beizi.fusion.model.JsonNode(key = "testLink")
            private java.lang.String testLink;

            public AppLinkBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getAppLinkId() {
                    r1 = this;
                    java.lang.String r0 = r1.appLinkId
                    return r0
            }

            public java.lang.String getTestLink() {
                    r1 = this;
                    java.lang.String r0 = r1.testLink
                    return r0
            }

            public void setAppLinkId(java.lang.String r1) {
                    r0 = this;
                    r0.appLinkId = r1
                    return
            }

            public void setTestLink(java.lang.String r1) {
                    r0 = this;
                    r0.testLink = r1
                    return
            }
        }

        public BackTaskArrayBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean> arrayBackTaskArrayBeanFromData(java.lang.String r1) {
                com.beizi.fusion.model.TaskBean$BackTaskArrayBean$1 r0 = new com.beizi.fusion.model.TaskBean$BackTaskArrayBean$1
                r0.<init>()
                java.lang.reflect.Type r0 = r0.getType()
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L10
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L10
                return r1
            L10:
                r1 = 0
                return r1
        }

        public static java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean> arrayBackTaskArrayBeanFromData(java.lang.String r1, java.lang.String r2) {
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
                com.beizi.fusion.model.TaskBean$BackTaskArrayBean$2 r1 = new com.beizi.fusion.model.TaskBean$BackTaskArrayBean$2     // Catch: java.lang.Throwable -> L1d
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

        public static com.beizi.fusion.model.TaskBean.BackTaskArrayBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.TaskBean$BackTaskArrayBean> r0 = com.beizi.fusion.model.TaskBean.BackTaskArrayBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.TaskBean$BackTaskArrayBean r1 = (com.beizi.fusion.model.TaskBean.BackTaskArrayBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public static com.beizi.fusion.model.TaskBean.BackTaskArrayBean objectFromData(java.lang.String r0, java.lang.String r1) {
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
                java.lang.Class<com.beizi.fusion.model.TaskBean$BackTaskArrayBean> r1 = com.beizi.fusion.model.TaskBean.BackTaskArrayBean.class
                java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
                com.beizi.fusion.model.TaskBean$BackTaskArrayBean r0 = (com.beizi.fusion.model.TaskBean.BackTaskArrayBean) r0     // Catch: java.lang.Throwable -> L12
                return r0
            L12:
                r0 = 0
                return r0
        }

        public java.util.List<java.lang.String> getAction() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.action
                return r0
        }

        public java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean.AppLinkBean> getApps() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.TaskBean$BackTaskArrayBean$AppLinkBean> r0 = r1.apps
                return r0
        }

        public java.lang.String getContentUrl() {
                r1 = this;
                java.lang.String r0 = r1.contentUrl
                return r0
        }

        public java.lang.String getMethod() {
                r1 = this;
                java.lang.String r0 = r1.method
                return r0
        }

        public int getRepeatCount() {
                r1 = this;
                int r0 = r1.repeatCount
                return r0
        }

        public java.util.List<java.lang.String> getReport() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.report
                return r0
        }

        public long getShowTime() {
                r2 = this;
                long r0 = r2.showTime
                return r0
        }

        public long getSleepTime() {
                r2 = this;
                long r0 = r2.sleepTime
                return r0
        }

        public int getType() {
                r1 = this;
                int r0 = r1.type
                return r0
        }

        public java.lang.String getUserAgent() {
                r1 = this;
                java.lang.String r0 = r1.userAgent
                return r0
        }

        public void setAction(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.action = r1
                return
        }

        public void setApps(java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean.AppLinkBean> r1) {
                r0 = this;
                r0.apps = r1
                return
        }

        public void setContentUrl(java.lang.String r1) {
                r0 = this;
                r0.contentUrl = r1
                return
        }

        public void setMethod(java.lang.String r1) {
                r0 = this;
                r0.method = r1
                return
        }

        public void setRepeatCount(int r1) {
                r0 = this;
                r0.repeatCount = r1
                return
        }

        public void setReport(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.report = r1
                return
        }

        public void setShowTime(long r1) {
                r0 = this;
                r0.showTime = r1
                return
        }

        public void setSleepTime(long r1) {
                r0 = this;
                r0.sleepTime = r1
                return
        }

        public void setType(int r1) {
                r0 = this;
                r0.type = r1
                return
        }

        public void setUserAgent(java.lang.String r1) {
                r0 = this;
                r0.userAgent = r1
                return
        }
    }

    public TaskBean() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.beizi.fusion.model.TaskBean> arrayTaskBeanFromData(java.lang.String r1) {
            com.beizi.fusion.model.TaskBean$1 r0 = new com.beizi.fusion.model.TaskBean$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L10
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.util.List<com.beizi.fusion.model.TaskBean> arrayTaskBeanFromData(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.beizi.fusion.model.TaskBean$2 r1 = new com.beizi.fusion.model.TaskBean$2     // Catch: java.lang.Throwable -> L1d
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

    public static com.beizi.fusion.model.TaskBean objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.TaskBean> r0 = com.beizi.fusion.model.TaskBean.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.TaskBean r1 = (com.beizi.fusion.model.TaskBean) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public static com.beizi.fusion.model.TaskBean objectFromData(java.lang.String r0, java.lang.String r1) {
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class<com.beizi.fusion.model.TaskBean> r1 = com.beizi.fusion.model.TaskBean.class
            java.lang.Object r0 = com.beizi.fusion.model.JsonResolver.fromJson(r0, r1)     // Catch: java.lang.Throwable -> L12
            com.beizi.fusion.model.TaskBean r0 = (com.beizi.fusion.model.TaskBean) r0     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean> getBackTaskArray() {
            r1 = this;
            java.util.List<com.beizi.fusion.model.TaskBean$BackTaskArrayBean> r0 = r1.backTaskArray
            return r0
    }

    public long getCheckInterval() {
            r2 = this;
            long r0 = r2.checkInterval
            return r0
    }

    public long getExpired() {
            r2 = this;
            long r0 = r2.expired
            return r0
    }

    public void setBackTaskArray(java.util.List<com.beizi.fusion.model.TaskBean.BackTaskArrayBean> r1) {
            r0 = this;
            r0.backTaskArray = r1
            return
    }

    public void setCheckInterval(long r1) {
            r0 = this;
            r0.checkInterval = r1
            return
    }

    public void setExpired(long r1) {
            r0 = this;
            r0.expired = r1
            return
    }
}
