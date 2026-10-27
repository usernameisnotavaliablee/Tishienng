package com.kwad.components.offline.api.explore.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FuncInfo extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.explore.model.FuncInfo> implements java.io.Serializable {
    public static final int EXTRA_TYPE_HAS_CSJ = 1;
    public static final int EXTRA_TYPE_HAS_GROMORE = 2;
    public static final int REPORT_AD_EXPOSED = 1;
    public static final int REPORT_AD_NOT_EXPOSED = 0;
    public static final int REPORT_SCENE_DRAW = 6;
    public static final int REPORT_SCENE_FEED = 5;
    public static final int REPORT_SCENE_FULL = 2;
    public static final int REPORT_SCENE_INTERSTITIAL = 4;
    public static final int REPORT_SCENE_REWARD = 1;
    public static final int REPORT_SCENE_SPLASH = 3;
    public static final int VALUE_FROM_CPM = 1;
    public static final int VALUE_FROM_EXTRA = 2;
    public static final int VALUE_FROM_PRICE = 3;
    private static final long serialVersionUID = -6149616231567033421L;
    public long adId;
    public int adOperationType;
    public java.lang.String adSource;
    public int adSubType;
    public java.lang.String appName;
    public int biddingType;
    public int count;
    public java.lang.String endCardUrl;
    public int exposed;
    public int extraFlagType;
    public int failedCount;
    public java.lang.String imageUrl;
    public java.lang.String landUrl;
    public long llsId;
    public java.lang.String name;
    public java.lang.String pkgName;
    public java.lang.String relateId;
    public java.lang.String reqId;
    public int scene;
    public int sdkType;
    public long timeCost;
    public long timestamp;
    public int type;
    public double value;
    public int valueFrom;
    public java.lang.String videoUrl;

    public FuncInfo() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.adSubType = r0
            r0 = -1
            r1.biddingType = r0
            return
    }

    public FuncInfo(int r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.adSubType = r0
            r0 = -1
            r1.biddingType = r0
            r1.type = r2
            r1.name = r3
            r1.scene = r4
            r1.sdkType = r5
            long r2 = java.lang.System.currentTimeMillis()
            r1.timestamp = r2
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.explore.model.FuncInfo r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.FuncInfo r1 = (com.kwad.components.offline.api.explore.model.FuncInfo) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.explore.model.FuncInfo r1, org.json.JSONObject r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.FuncInfo r1) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.FuncInfo r1 = (com.kwad.components.offline.api.explore.model.FuncInfo) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.FuncInfo r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.FuncInfo r1 = (com.kwad.components.offline.api.explore.model.FuncInfo) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.FuncInfo r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.FuncInfo r1, org.json.JSONObject r2) {
            r0 = this;
            if (r2 != 0) goto L8
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            return r1
        L8:
            return r2
    }
}
