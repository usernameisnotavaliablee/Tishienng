package xyz.adscope.amps.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSInitConfig {
    private java.util.List<java.lang.String> adapterNameList;
    private java.lang.String appId;
    private java.lang.String appName;
    private java.lang.String city;
    private java.lang.String customGAID;
    private java.lang.String customOAID;
    private boolean debug;
    private boolean isUseHttps;
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> localExtraMap;
    private java.lang.String optionInfo;
    private boolean personalRecommend;
    private xyz.adscope.amps.config.AMPSPrivacyConfig privacyConfig;
    private java.lang.String province;
    private java.lang.String region;
    private java.lang.String userId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.util.List<java.lang.String> adapterNameList;
        private java.lang.String appId;
        private java.lang.String appName;
        private java.lang.String city;
        private java.lang.String customGAID;
        private boolean debug;
        private boolean isUseHttps;
        private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> localExtraMap;
        private java.lang.String optionInfo;
        private xyz.adscope.amps.config.AMPSPrivacyConfig privacyConfig;
        private java.lang.String province;
        private java.lang.String region;
        private java.lang.String userId;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.appId = r0
                r1.appName = r0
                r1.optionInfo = r0
                r1.province = r0
                r1.city = r0
                r1.region = r0
                r1.customGAID = r0
                r1.userId = r0
                r0 = 0
                r1.isUseHttps = r0
                return
        }

        public xyz.adscope.amps.init.AMPSInitConfig build() {
                r2 = this;
                xyz.adscope.amps.init.AMPSInitConfig r0 = new xyz.adscope.amps.init.AMPSInitConfig
                r0.<init>()
                java.lang.String r1 = r2.appId
                xyz.adscope.amps.init.AMPSInitConfig.access$000(r0, r1)
                java.lang.String r1 = r2.appName
                xyz.adscope.amps.init.AMPSInitConfig.access$100(r0, r1)
                boolean r1 = r2.debug
                xyz.adscope.amps.init.AMPSInitConfig.access$200(r0, r1)
                xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r2.privacyConfig
                if (r1 == 0) goto L22
                boolean r1 = r1.isSupportPersonalized()
                if (r1 != 0) goto L22
                r1 = 0
                r0.setPersonalRecommend(r1)
            L22:
                xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r2.privacyConfig
                xyz.adscope.amps.init.AMPSInitConfig.access$300(r0, r1)
                java.util.List<java.lang.String> r1 = r2.adapterNameList
                xyz.adscope.amps.init.AMPSInitConfig.access$400(r0, r1)
                java.lang.String r1 = r2.optionInfo
                xyz.adscope.amps.init.AMPSInitConfig.access$500(r0, r1)
                java.lang.String r1 = r2.province
                xyz.adscope.amps.init.AMPSInitConfig.access$600(r0, r1)
                java.lang.String r1 = r2.city
                xyz.adscope.amps.init.AMPSInitConfig.access$700(r0, r1)
                boolean r1 = r2.isUseHttps
                xyz.adscope.amps.init.AMPSInitConfig.access$800(r0, r1)
                xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r2.privacyConfig
                if (r1 == 0) goto L57
                java.lang.String r1 = r1.getDevOaid()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L57
                xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r2.privacyConfig
                java.lang.String r1 = r1.getDevOaid()
                xyz.adscope.amps.init.AMPSInitConfig.access$900(r0, r1)
            L57:
                java.lang.String r1 = r2.customGAID
                xyz.adscope.amps.init.AMPSInitConfig.access$1000(r0, r1)
                java.lang.String r1 = r2.userId
                xyz.adscope.amps.init.AMPSInitConfig.access$1100(r0, r1)
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.localExtraMap
                xyz.adscope.amps.init.AMPSInitConfig.access$1200(r0, r1)
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder openDebugLog(boolean r1) {
                r0 = this;
                r0.debug = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setAMPSPrivacyConfig(xyz.adscope.amps.config.AMPSPrivacyConfig r1) {
                r0 = this;
                r0.privacyConfig = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setAdapterNameList(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.adapterNameList = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setAppId(java.lang.String r1) {
                r0 = this;
                r0.appId = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setAppName(java.lang.String r1) {
                r0 = this;
                r0.appName = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setCity(java.lang.String r1) {
                r0 = this;
                r0.city = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setCustomGAID(java.lang.String r1) {
                r0 = this;
                r0.customGAID = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setIsUseHttps(boolean r1) {
                r0 = this;
                r0.isUseHttps = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setLocalExtraMap(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r1) {
                r0 = this;
                r0.localExtraMap = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setOptionInfoMap(java.lang.String r1) {
                r0 = this;
                r0.optionInfo = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setProvince(java.lang.String r1) {
                r0 = this;
                r0.province = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setRegion(java.lang.String r1) {
                r0 = this;
                r0.region = r1
                return r0
        }

        public xyz.adscope.amps.init.AMPSInitConfig.Builder setUserId(java.lang.String r1) {
                r0 = this;
                r0.userId = r1
                return r0
        }
    }

    public AMPSInitConfig() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.appId = r0
            r2.appName = r0
            r1 = 1
            r2.personalRecommend = r1
            r2.optionInfo = r0
            r2.province = r0
            r2.city = r0
            r2.region = r0
            r2.customGAID = r0
            r2.userId = r0
            r0 = 0
            r2.isUseHttps = r0
            return
    }

    static /* synthetic */ void access$000(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setAppId(r1)
            return
    }

    static /* synthetic */ void access$100(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setAppName(r1)
            return
    }

    static /* synthetic */ void access$1000(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setCustomGAID(r1)
            return
    }

    static /* synthetic */ void access$1100(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setUserId(r1)
            return
    }

    static /* synthetic */ void access$1200(xyz.adscope.amps.init.AMPSInitConfig r0, java.util.Map r1) {
            r0.setLocalExtraMap(r1)
            return
    }

    static /* synthetic */ void access$200(xyz.adscope.amps.init.AMPSInitConfig r0, boolean r1) {
            r0.setDebug(r1)
            return
    }

    static /* synthetic */ void access$300(xyz.adscope.amps.init.AMPSInitConfig r0, xyz.adscope.amps.config.AMPSPrivacyConfig r1) {
            r0.setPrivacyConfig(r1)
            return
    }

    static /* synthetic */ void access$400(xyz.adscope.amps.init.AMPSInitConfig r0, java.util.List r1) {
            r0.setAdapterNameList(r1)
            return
    }

    static /* synthetic */ void access$500(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setOptionInfo(r1)
            return
    }

    static /* synthetic */ void access$600(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setProvince(r1)
            return
    }

    static /* synthetic */ void access$700(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setCity(r1)
            return
    }

    static /* synthetic */ void access$800(xyz.adscope.amps.init.AMPSInitConfig r0, boolean r1) {
            r0.setUseHttps(r1)
            return
    }

    static /* synthetic */ void access$900(xyz.adscope.amps.init.AMPSInitConfig r0, java.lang.String r1) {
            r0.setCustomOAID(r1)
            return
    }

    private void setAdapterNameList(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.adapterNameList = r1
            return
    }

    private void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    private void setAppName(java.lang.String r1) {
            r0 = this;
            r0.appName = r1
            return
    }

    private void setCity(java.lang.String r1) {
            r0 = this;
            r0.city = r1
            return
    }

    private void setCustomGAID(java.lang.String r1) {
            r0 = this;
            r0.customGAID = r1
            return
    }

    private void setCustomOAID(java.lang.String r1) {
            r0 = this;
            r0.customOAID = r1
            return
    }

    private void setDebug(boolean r1) {
            r0 = this;
            r0.debug = r1
            return
    }

    private void setLocalExtraMap(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r1) {
            r0 = this;
            r0.localExtraMap = r1
            return
    }

    private void setOptionInfo(java.lang.String r1) {
            r0 = this;
            r0.optionInfo = r1
            return
    }

    private void setPrivacyConfig(xyz.adscope.amps.config.AMPSPrivacyConfig r1) {
            r0 = this;
            r0.privacyConfig = r1
            return
    }

    private void setProvince(java.lang.String r1) {
            r0 = this;
            r0.province = r1
            return
    }

    private void setRegion(java.lang.String r1) {
            r0 = this;
            r0.region = r1
            return
    }

    private void setUseHttps(boolean r1) {
            r0 = this;
            r0.isUseHttps = r1
            return
    }

    private void setUserId(java.lang.String r1) {
            r0 = this;
            r0.userId = r1
            return
    }

    public void clear() {
            r2 = this;
            r0 = 0
            r2.privacyConfig = r0
            java.util.List<java.lang.String> r1 = r2.adapterNameList
            if (r1 == 0) goto Lc
            r1.clear()
            r2.adapterNameList = r0
        Lc:
            return
    }

    public java.util.List<java.lang.String> getAdapterNameList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.adapterNameList
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public java.lang.String getAppName() {
            r1 = this;
            java.lang.String r0 = r1.appName
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.city
            return r0
    }

    public java.lang.String getCustomGAID() {
            r1 = this;
            java.lang.String r0 = r1.customGAID
            return r0
    }

    public java.lang.String getCustomOAID() {
            r1 = this;
            java.lang.String r0 = r1.customOAID
            return r0
    }

    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> getLocalExtraMap() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.localExtraMap
            return r0
    }

    public java.lang.String getOptionInfo() {
            r1 = this;
            java.lang.String r0 = r1.optionInfo
            return r0
    }

    public xyz.adscope.amps.config.AMPSPrivacyConfig getPrivacyConfig() {
            r1 = this;
            xyz.adscope.amps.config.AMPSPrivacyConfig r0 = r1.privacyConfig
            return r0
    }

    public java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.province
            return r0
    }

    public java.lang.String getRegion() {
            r1 = this;
            java.lang.String r0 = r1.region
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.userId
            return r0
    }

    public boolean isDebug() {
            r1 = this;
            boolean r0 = r1.debug
            return r0
    }

    public boolean isPersonalRecommend() {
            r1 = this;
            boolean r0 = r1.personalRecommend
            return r0
    }

    public boolean isUseHttps() {
            r1 = this;
            boolean r0 = r1.isUseHttps
            return r0
    }

    public void setPersonalRecommend(boolean r1) {
            r0 = this;
            r0.personalRecommend = r1
            return
    }
}
