package com.kwad.components.offline.api.core.adlive.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KSAdLiveEndResultData extends com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData implements java.io.Serializable {
    private static final long serialVersionUID = -6047167317852134995L;
    public com.kwad.components.offline.api.core.adlive.model.KSAdLivePushEndInfo mQLivePushEndInfo;

    public KSAdLiveEndResultData() {
            r1 = this;
            r1.<init>()
            com.kwad.components.offline.api.core.adlive.model.KSAdLivePushEndInfo r0 = new com.kwad.components.offline.api.core.adlive.model.KSAdLivePushEndInfo
            r0.<init>()
            r1.mQLivePushEndInfo = r0
            return
    }

    public void parseJson(com.kwad.components.offline.api.core.adlive.model.KSAdLiveEndResultData r1, org.json.JSONObject r2) {
            r0 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.kwad.components.offline.api.core.adlive.model.KSAdLivePushEndInfo r1 = r1.mQLivePushEndInfo
            r1.parseJson(r2)
            return
    }

    @Override // com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData
    public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
            r0 = this;
            super.parseJson(r1)
            r0.parseJson(r0, r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.network.model.CommonOfflineCompoResultData
    public org.json.JSONObject toJson() {
            r1 = this;
            org.json.JSONObject r0 = super.toJson()
            r1.toJson(r1, r0)
            return r0
    }

    public org.json.JSONObject toJson(com.kwad.components.offline.api.core.adlive.model.KSAdLiveEndResultData r1, org.json.JSONObject r2) {
            r0 = this;
            if (r2 != 0) goto L7
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L7:
            com.kwad.components.offline.api.core.adlive.model.KSAdLivePushEndInfo r1 = r1.mQLivePushEndInfo
            r1.toJson(r2)
            return r2
    }
}
