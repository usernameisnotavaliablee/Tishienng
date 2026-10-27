package com.kwad.components.offline.api.core.adlive.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KSAdLiveRoomItemInfo extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo> implements java.io.Serializable {
    private static final long serialVersionUID = -6149616231567033413L;
    public java.lang.String imageUrl;
    public java.lang.String itemId;
    public java.lang.String price;
    public java.lang.String title;

    public KSAdLiveRoomItemInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r5, org.json.JSONObject r6) {
            r4 = this;
            if (r6 != 0) goto L3
            goto L49
        L3:
            java.lang.String r0 = "itemId"
            java.lang.String r1 = r6.optString(r0)
            r5.itemId = r1
            java.lang.Object r0 = r6.opt(r0)
            java.lang.Object r1 = org.json.JSONObject.NULL
            java.lang.String r2 = ""
            if (r0 != r1) goto L17
            r5.itemId = r2
        L17:
            java.lang.String r0 = "imageUrl"
            java.lang.String r3 = r6.optString(r0)
            r5.imageUrl = r3
            java.lang.Object r0 = r6.opt(r0)
            if (r0 != r1) goto L27
            r5.imageUrl = r2
        L27:
            java.lang.String r0 = "title"
            java.lang.String r3 = r6.optString(r0)
            r5.title = r3
            java.lang.Object r0 = r6.opt(r0)
            if (r0 != r1) goto L37
            r5.title = r2
        L37:
            java.lang.String r0 = "templateVersion"
            java.lang.String r0 = r6.optString(r0)
            r5.price = r0
            java.lang.String r0 = "price"
            java.lang.Object r6 = r6.opt(r0)
            if (r6 != r1) goto L49
            r5.price = r2
        L49:
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r1 = (com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r4, org.json.JSONObject r5) {
            r3 = this;
            if (r5 != 0) goto L7
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
        L7:
            java.lang.String r0 = r4.itemId
            java.lang.String r1 = ""
            if (r0 == 0) goto L1a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "itemId"
            java.lang.String r2 = r4.itemId
            com.kwad.sdk.utils.aa.putValue(r5, r0, r2)
        L1a:
            java.lang.String r0 = r4.imageUrl
            if (r0 == 0) goto L2b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "imageUrl"
            java.lang.String r2 = r4.imageUrl
            com.kwad.sdk.utils.aa.putValue(r5, r0, r2)
        L2b:
            java.lang.String r0 = r4.title
            if (r0 == 0) goto L3c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "title"
            java.lang.String r2 = r4.title
            com.kwad.sdk.utils.aa.putValue(r5, r0, r2)
        L3c:
            java.lang.String r0 = r4.price
            if (r0 == 0) goto L4d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "price"
            java.lang.String r4 = r4.price
            com.kwad.sdk.utils.aa.putValue(r5, r0, r4)
        L4d:
            return r5
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r1) {
            r0 = this;
            com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r1 = (com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo r1 = (com.kwad.components.offline.api.core.adlive.model.KSAdLiveRoomItemInfo) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }
}
