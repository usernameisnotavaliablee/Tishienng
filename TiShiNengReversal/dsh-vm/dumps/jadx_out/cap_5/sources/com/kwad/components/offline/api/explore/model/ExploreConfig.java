package com.kwad.components.offline.api.explore.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ExploreConfig extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.explore.model.ExploreConfig> implements java.io.Serializable {
    private static final long serialVersionUID = -5149616231567033423L;
    public long byteCount;
    public java.lang.String downgradeKey;
    public long funcSwitch;
    public java.lang.String injectConfigStr;
    public long maxClusterInterval;
    public long maxElementInterval;
    public long posIdInvalidInSecs;
    public int reportCountLimit;
    public double sampleRate;
    public java.lang.String testReportUrlV2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TTInjectConfig extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig> implements java.io.Serializable {
        private static final long serialVersionUID = -5149616231567033422L;
        public java.lang.String adAppNameKey;
        public java.lang.String adIdKey;
        public java.lang.String adNativeName;
        public java.lang.String adPkgNameKey;
        public java.lang.String adSdkName;
        public java.lang.String adSlotKey;
        public java.lang.String adSourceKey;
        public java.lang.String bidTypeKey;
        public java.lang.String callbackDrawFeedAdLoad;
        public java.lang.String callbackError;
        public java.lang.String callbackFeedAdLoad;
        public java.lang.String callbackFullAdLoad;
        public java.lang.String callbackRewardAdLoad;
        public java.lang.String callbackSplashAdLoad;
        public java.lang.String cpKey;
        public java.lang.String createAdMethod;
        public java.lang.String endCardUrlKey;
        public java.lang.String feedInterfaceName;
        public java.lang.String fullScreenVideoAdInteractionListenerName;
        public java.lang.String getManagerMethod;
        public java.lang.String getMediaExtraInfoMethod;
        public java.lang.String getSdkVersionMethod;
        public java.lang.String imageUrlKey;
        public java.lang.String initName;
        public java.lang.String key;
        public java.lang.String landUrlKey1;
        public java.lang.String landUrlKey2;
        public java.lang.String landUrlObPrefix;
        public long llsIdValidInterval;
        public java.lang.String loadDrawFeedMethod;
        public java.lang.String loadFeedMethod;
        public java.lang.String loadFullMethod;
        public java.lang.String loadRewardMethod;
        public java.lang.String loadSplashMethod;
        public java.lang.String managerName;
        public int maxSize;
        public java.lang.String maxVersion;
        public java.lang.String minVersion;
        public java.lang.String onAdShowMethod;
        public java.lang.String onSplashAdShowMethod;
        public java.lang.String pangleKeyWord;
        public java.util.List<java.lang.String> passList;
        public java.lang.String pkgNameKey;
        public java.lang.String registerViewForInteraction;
        public java.lang.String rewardAdInteractionListenerName;
        public java.lang.String setFullScreenVideoAdInteractionListenerMethod;
        public java.lang.String setRewardAdInteractionListenerMethod;
        public java.lang.String setSplashListenerMethod;
        public java.lang.String splashAdInteractionListenerName;
        public java.lang.String targetName;
        public java.lang.String targetTypeName;
        public java.lang.String videoUrlKey;

        public TTInjectConfig() {
                r2 = this;
                r2.<init>()
                r0 = 1000(0x3e8, double:4.94E-321)
                r2.llsIdValidInterval = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.passList = r0
                return
        }

        @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
        public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig r1, org.json.JSONObject r2) {
                r0 = this;
                com.kwad.components.offline.api.explore.model.ExploreConfig$TTInjectConfig r1 = (com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig) r1
                r0.parseJson2(r1, r2)
                return
        }

        /* renamed from: parseJson, reason: avoid collision after fix types in other method */
        public void parseJson2(com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig r1, org.json.JSONObject r2) {
                r0 = this;
                return
        }

        @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
        public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig r1) {
                r0 = this;
                com.kwad.components.offline.api.explore.model.ExploreConfig$TTInjectConfig r1 = (com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig) r1
                org.json.JSONObject r1 = r0.toJson2(r1)
                return r1
        }

        @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
        public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig r1, org.json.JSONObject r2) {
                r0 = this;
                com.kwad.components.offline.api.explore.model.ExploreConfig$TTInjectConfig r1 = (com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig) r1
                org.json.JSONObject r1 = r0.toJson2(r1, r2)
                return r1
        }

        /* renamed from: toJson, reason: avoid collision after fix types in other method */
        public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig r2) {
                r1 = this;
                r0 = 0
                org.json.JSONObject r2 = r1.toJson2(r2, r0)
                return r2
        }

        /* renamed from: toJson, reason: avoid collision after fix types in other method */
        public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig r1, org.json.JSONObject r2) {
                r0 = this;
                if (r2 != 0) goto L8
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                return r1
            L8:
                return r2
        }
    }

    public ExploreConfig() {
            r4 = this;
            r4.<init>()
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.byteCount = r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.sampleRate = r2
            r2 = 300(0x12c, double:1.48E-321)
            r4.posIdInvalidInSecs = r2
            r2 = 2000(0x7d0, double:9.88E-321)
            r4.maxClusterInterval = r2
            r4.maxElementInterval = r0
            java.lang.String r0 = ""
            r4.testReportUrlV2 = r0
            r0 = 5
            r4.reportCountLimit = r0
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.explore.model.ExploreConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.ExploreConfig r1 = (com.kwad.components.offline.api.explore.model.ExploreConfig) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.explore.model.ExploreConfig r1, org.json.JSONObject r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.ExploreConfig r1) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.ExploreConfig r1 = (com.kwad.components.offline.api.explore.model.ExploreConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.ExploreConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.ExploreConfig r1 = (com.kwad.components.offline.api.explore.model.ExploreConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.ExploreConfig r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.ExploreConfig r1, org.json.JSONObject r2) {
            r0 = this;
            if (r2 != 0) goto L8
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            return r1
        L8:
            return r2
    }
}
