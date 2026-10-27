package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class PlatformConfig {
    public static java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig.Platform> configs;
    private static java.lang.String sFileProvider;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class APPIDPlatform implements com.umeng.socialize.PlatformConfig.Platform {
        public java.lang.String agentId;
        public java.lang.String appId;
        public java.lang.String appkey;
        public java.lang.String click_key;
        public java.lang.String fileProvider;
        private com.umeng.socialize.bean.SHARE_MEDIA p;
        public java.lang.String redirectUrl;
        public java.lang.String schema;

        public APPIDPlatform(com.umeng.socialize.bean.SHARE_MEDIA r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.appId = r0
                r1.appkey = r0
                r1.redirectUrl = r0
                r1.fileProvider = r0
                r1.click_key = r0
                r1.agentId = r0
                r1.schema = r0
                r1.p = r2
                return
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public java.lang.String getAppSecret() {
                r1 = this;
                java.lang.String r0 = r1.appkey
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public java.lang.String getAppid() {
                r1 = this;
                java.lang.String r0 = r1.appId
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public java.lang.String getClick_key() {
                r1 = this;
                java.lang.String r0 = r1.click_key
                return r0
        }

        public java.lang.String getFileProvider() {
                r1 = this;
                java.lang.String r0 = r1.fileProvider
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = com.umeng.socialize.PlatformConfig.access$000()
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public com.umeng.socialize.bean.SHARE_MEDIA getName() {
                r1 = this;
                com.umeng.socialize.bean.SHARE_MEDIA r0 = r1.p
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public boolean isConfigured() {
                r1 = this;
                java.lang.String r0 = r1.appId
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L12
                java.lang.String r0 = r1.appkey
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public void parse(org.json.JSONObject r1) {
                r0 = this;
                return
        }

        public void setFileProvider(java.lang.String r1) {
                r0 = this;
                r0.fileProvider = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CustomPlatform implements com.umeng.socialize.PlatformConfig.Platform {
        public static final java.lang.String Name = "g+";
        public java.lang.String appId;
        public java.lang.String appkey;
        public java.lang.String click_key;
        private com.umeng.socialize.bean.SHARE_MEDIA p;

        public CustomPlatform(com.umeng.socialize.bean.SHARE_MEDIA r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.appId = r0
                r1.appkey = r0
                r1.click_key = r0
                r1.p = r2
                return
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public java.lang.String getAppSecret() {
                r1 = this;
                java.lang.String r0 = r1.appkey
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public java.lang.String getAppid() {
                r1 = this;
                java.lang.String r0 = r1.appId
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public java.lang.String getClick_key() {
                r1 = this;
                java.lang.String r0 = r1.click_key
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public com.umeng.socialize.bean.SHARE_MEDIA getName() {
                r1 = this;
                com.umeng.socialize.bean.SHARE_MEDIA r0 = r1.p
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public boolean isConfigured() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public void parse(org.json.JSONObject r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Platform {
        java.lang.String getAppSecret();

        java.lang.String getAppid();

        java.lang.String getClick_key();

        com.umeng.socialize.bean.SHARE_MEDIA getName();

        boolean isConfigured();

        void parse(org.json.JSONObject r1);
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.socialize.PlatformConfig.configs = r0
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.VKONTAKTE
            com.umeng.socialize.PlatformConfig$APPIDPlatform r3 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r3.<init>(r1)
            r0.put(r2, r3)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WXWORK
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.FACEBOOK_MESSAGER
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.DOUBAN
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN_CIRCLE
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.ALIPAY
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.DROPBOX
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.FACEBOOK
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.TWITTER
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.TUMBLR
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.PINTEREST
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.POCKET
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WHATSAPP
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.EMAIL
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SMS
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.LINKEDIN
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.LINE
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.FLICKR
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.EVERNOTE
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.FOURSQUARE
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.YNOTE
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.KAKAO
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.INSTAGRAM
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.MORE
            com.umeng.socialize.PlatformConfig$CustomPlatform r2 = new com.umeng.socialize.PlatformConfig$CustomPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.DINGTALK
            com.umeng.socialize.PlatformConfig$APPIDPlatform r3 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r3.<init>(r1)
            r0.put(r2, r3)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_PUBLISH
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_FRIENDS
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.HONOR
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = new com.umeng.socialize.PlatformConfig$APPIDPlatform
            r2.<init>(r1)
            r0.put(r1, r2)
            return
    }

    public PlatformConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = com.umeng.socialize.PlatformConfig.sFileProvider
            return r0
    }

    public static void disableAndroidId() {
            java.lang.String r0 = "com.umeng.commonsdk.UMConfigure"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "disableAidCollect"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L16
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L16
            r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    public static java.lang.String getFileProvider() {
            java.lang.String r0 = com.umeng.socialize.PlatformConfig.sFileProvider
            return r0
    }

    public static com.umeng.socialize.PlatformConfig.Platform getPlatform(com.umeng.socialize.bean.SHARE_MEDIA r1) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            java.lang.Object r1 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$Platform r1 = (com.umeng.socialize.PlatformConfig.Platform) r1
            return r1
    }

    public static void setAlipay(java.lang.String r3) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.ALIPAY
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            return
    }

    public static void setBytedance(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r5.replace(r1, r2)
            r0.click_key = r3
            java.lang.String r3 = r6.replace(r1, r2)
            r0.appkey = r3
            java.lang.String r3 = r7.replace(r1, r2)
            r0.setFileProvider(r3)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_PUBLISH
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r5.replace(r1, r2)
            r0.click_key = r3
            java.lang.String r3 = r6.replace(r1, r2)
            r0.appkey = r3
            java.lang.String r3 = r7.replace(r1, r2)
            r0.setFileProvider(r3)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_FRIENDS
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r4 = r4.replace(r1, r2)
            r0.appId = r4
            java.lang.String r4 = r5.replace(r1, r2)
            r0.click_key = r4
            java.lang.String r4 = r6.replace(r1, r2)
            r0.appkey = r4
            java.lang.String r4 = r7.replace(r1, r2)
            r0.setFileProvider(r4)
            setFileProvider(r7)
            return
    }

    public static void setDing(java.lang.String r3) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.DINGTALK
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            return
    }

    @java.lang.Deprecated
    public static void setDingFileProvider(java.lang.String r3) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.DINGTALK
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r1 = r3.replace(r1, r2)
            r0.setFileProvider(r1)
            setFileProvider(r3)
            return
    }

    public static void setDropbox(java.lang.String r3, java.lang.String r4) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.DROPBOX
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appkey = r3
            return
    }

    public static void setFileProvider(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L8
            com.umeng.socialize.PlatformConfig.sFileProvider = r1
        L8:
            return
    }

    public static void setHonor(java.lang.String r3, java.lang.String r4) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.HONOR
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appkey = r3
            return
    }

    public static void setHonorRedirectUrl(java.lang.String r2) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.HONOR
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            r0.redirectUrl = r2
            return
    }

    public static void setKakao(java.lang.String r3) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.KAKAO
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            return
    }

    public static void setPinterest(java.lang.String r3) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.PINTEREST
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            return
    }

    @java.lang.Deprecated
    public static void setQQFileProvider(java.lang.String r4) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r4.replace(r1, r2)
            r0.setFileProvider(r3)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = r4.replace(r1, r2)
            r0.setFileProvider(r1)
            setFileProvider(r4)
            return
    }

    public static void setQQZone(java.lang.String r4, java.lang.String r5) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r5.replace(r1, r2)
            r0.appkey = r3
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r4 = r4.replace(r1, r2)
            r0.appId = r4
            java.lang.String r4 = r5.replace(r1, r2)
            r0.appkey = r4
            return
    }

    @java.lang.Deprecated
    public static void setSinaFileProvider(java.lang.String r3) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r1 = r3.replace(r1, r2)
            r0.setFileProvider(r1)
            setFileProvider(r3)
            return
    }

    public static void setSinaWeibo(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appkey = r3
            r0.redirectUrl = r5
            return
    }

    public static void setTwitter(java.lang.String r3, java.lang.String r4) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.TWITTER
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appkey = r3
            return
    }

    public static void setVKontakte(java.lang.String r3, java.lang.String r4) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.VKONTAKTE
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appkey = r3
            return
    }

    @java.lang.Deprecated
    public static void setWXFileProvider(java.lang.String r4) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r4.replace(r1, r2)
            r0.setFileProvider(r3)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r3 = r4.replace(r1, r2)
            r0.setFileProvider(r3)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = r4.replace(r1, r2)
            r0.setFileProvider(r1)
            setFileProvider(r4)
            return
    }

    public static void setWXWork(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WXWORK
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appkey = r3
            java.lang.String r3 = r5.replace(r1, r2)
            r0.agentId = r3
            java.lang.String r3 = r6.replace(r1, r2)
            r0.schema = r3
            return
    }

    @java.lang.Deprecated
    public static void setWXWorkFileProvider(java.lang.String r3) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WXWORK
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r1 = r3.replace(r1, r2)
            r0.setFileProvider(r1)
            setFileProvider(r3)
            return
    }

    public static void setWeixin(java.lang.String r4, java.lang.String r5) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r5.replace(r1, r2)
            r0.appkey = r3
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appId = r3
            java.lang.String r3 = r5.replace(r1, r2)
            r0.appkey = r3
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r4 = r4.replace(r1, r2)
            r0.appId = r4
            java.lang.String r4 = r5.replace(r1, r2)
            r0.appkey = r4
            return
    }

    public static void setYixin(java.lang.String r4) {
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r4.replace(r1, r2)
            r0.appId = r3
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r0 = com.umeng.socialize.PlatformConfig.configs
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN_CIRCLE
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0
            java.lang.String r4 = r4.replace(r1, r2)
            r0.appId = r4
            return
    }
}
