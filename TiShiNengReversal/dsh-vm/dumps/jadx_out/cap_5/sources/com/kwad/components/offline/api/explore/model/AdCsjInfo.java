package com.kwad.components.offline.api.explore.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AdCsjInfo extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.explore.model.AdCsjInfo> implements java.io.Serializable {
    private static final long serialVersionUID = -6149616231567033423L;
    public long adId;
    public int adOperationType;
    public java.lang.String reqId;

    public AdCsjInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.explore.model.AdCsjInfo r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.AdCsjInfo r1 = (com.kwad.components.offline.api.explore.model.AdCsjInfo) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.explore.model.AdCsjInfo r1, org.json.JSONObject r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.AdCsjInfo r1) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.AdCsjInfo r1 = (com.kwad.components.offline.api.explore.model.AdCsjInfo) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.explore.model.AdCsjInfo r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.explore.model.AdCsjInfo r1 = (com.kwad.components.offline.api.explore.model.AdCsjInfo) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.AdCsjInfo r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.explore.model.AdCsjInfo r1, org.json.JSONObject r2) {
            r0 = this;
            if (r2 != 0) goto L8
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            return r1
        L8:
            return r2
    }
}
