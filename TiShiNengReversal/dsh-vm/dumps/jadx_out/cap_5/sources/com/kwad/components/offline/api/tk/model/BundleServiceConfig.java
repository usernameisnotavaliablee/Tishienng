package com.kwad.components.offline.api.tk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class BundleServiceConfig extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.tk.model.BundleServiceConfig> implements java.io.Serializable {
    public java.lang.String bundleName;
    public int loadType;

    public BundleServiceConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.tk.model.BundleServiceConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.BundleServiceConfig r1 = (com.kwad.components.offline.api.tk.model.BundleServiceConfig) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.tk.model.BundleServiceConfig r4, org.json.JSONObject r5) {
            r3 = this;
            if (r5 != 0) goto L3
            goto L28
        L3:
            java.lang.String r0 = "bundleName"
            java.lang.String r1 = r5.optString(r0)
            r4.bundleName = r1
            java.lang.Object r0 = r5.opt(r0)
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r0 != r1) goto L17
            java.lang.String r0 = ""
            r4.bundleName = r0
        L17:
            java.lang.String r0 = "loadType"
            int r2 = r5.optInt(r0)
            r4.loadType = r2
            java.lang.Object r5 = r5.opt(r0)
            if (r5 != r1) goto L28
            r5 = -1
            r4.loadType = r5
        L28:
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.BundleServiceConfig r1) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.BundleServiceConfig r1 = (com.kwad.components.offline.api.tk.model.BundleServiceConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.BundleServiceConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.BundleServiceConfig r1 = (com.kwad.components.offline.api.tk.model.BundleServiceConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.BundleServiceConfig r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.BundleServiceConfig r3, org.json.JSONObject r4) {
            r2 = this;
            if (r4 != 0) goto L7
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L7:
            java.lang.String r0 = r3.bundleName
            if (r0 == 0) goto L1a
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "bundleName"
            java.lang.String r1 = r3.bundleName
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
        L1a:
            int r3 = r3.loadType
            r0 = -1
            if (r3 == r0) goto L24
            java.lang.String r0 = "loadType"
            com.kwad.sdk.utils.aa.putValue(r4, r0, r3)
        L24:
            return r4
    }
}
