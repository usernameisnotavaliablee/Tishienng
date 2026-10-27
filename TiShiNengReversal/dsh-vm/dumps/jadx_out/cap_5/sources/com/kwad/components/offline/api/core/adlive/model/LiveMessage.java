package com.kwad.components.offline.api.core.adlive.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class LiveMessage extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.core.adlive.model.LiveMessage> implements java.io.Serializable {
    private static final long serialVersionUID = 2264410572624564928L;
    public java.lang.String content;
    public long mSortRank;
    public java.lang.String userName;

    public LiveMessage() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean isInValid() {
            r1 = this;
            java.lang.String r0 = r1.userName
            boolean r0 = com.kwad.components.offline.api.core.utils.LiveStringUtil.isNullString(r0)
            if (r0 != 0) goto L13
            java.lang.String r0 = r1.content
            boolean r0 = com.kwad.components.offline.api.core.utils.LiveStringUtil.isNullString(r0)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.core.adlive.model.LiveMessage r5, org.json.JSONObject r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "userName"
            java.lang.String r1 = r6.optString(r0)
            r5.userName = r1
            java.lang.Object r0 = r6.opt(r0)
            java.lang.Object r1 = org.json.JSONObject.NULL
            java.lang.String r2 = ""
            if (r0 != r1) goto L17
            r5.userName = r2
        L17:
            java.lang.String r0 = "content"
            java.lang.String r3 = r6.optString(r0)
            r5.content = r3
            java.lang.Object r0 = r6.opt(r0)
            if (r0 != r1) goto L27
            r5.content = r2
        L27:
            java.lang.String r0 = "sortRank"
            int r6 = r6.optInt(r0)
            long r0 = (long) r6
            r5.mSortRank = r0
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.core.adlive.model.LiveMessage r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.core.adlive.model.LiveMessage r1 = (com.kwad.components.offline.api.core.adlive.model.LiveMessage) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.core.adlive.model.LiveMessage r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.core.adlive.model.LiveMessage r5, org.json.JSONObject r6) {
            r4 = this;
            if (r6 != 0) goto L7
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
        L7:
            java.lang.String r0 = r5.userName
            java.lang.String r1 = ""
            if (r0 == 0) goto L1a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "userName"
            java.lang.String r2 = r5.userName
            com.kwad.sdk.utils.aa.putValue(r6, r0, r2)
        L1a:
            java.lang.String r0 = r5.content
            if (r0 == 0) goto L2b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "content"
            java.lang.String r1 = r5.content
            com.kwad.sdk.utils.aa.putValue(r6, r0, r1)
        L2b:
            long r0 = r5.mSortRank
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L38
            java.lang.String r5 = "sortRank"
            com.kwad.sdk.utils.aa.putValue(r6, r5, r0)
        L38:
            return r6
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.core.adlive.model.LiveMessage r1) {
            r0 = this;
            com.kwad.components.offline.api.core.adlive.model.LiveMessage r1 = (com.kwad.components.offline.api.core.adlive.model.LiveMessage) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.core.adlive.model.LiveMessage r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.core.adlive.model.LiveMessage r1 = (com.kwad.components.offline.api.core.adlive.model.LiveMessage) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }
}
