package com.kwad.components.offline.api.tk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TemplateConfig extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.tk.model.TemplateConfig> {
    public java.lang.String bundleFile;
    public java.lang.String bundleId;
    public java.lang.String md5;
    public java.lang.String sha256;
    public java.lang.String version;
    public java.lang.String versionCode;

    public TemplateConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.tk.model.TemplateConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.TemplateConfig r1 = (com.kwad.components.offline.api.tk.model.TemplateConfig) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.tk.model.TemplateConfig r2, org.json.JSONObject r3) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "bundleId"
            java.lang.String r0 = r3.optString(r0)
            r2.bundleId = r0
            java.lang.String r0 = "bundleFile"
            java.lang.String r0 = r3.optString(r0)
            r2.bundleFile = r0
            java.lang.String r0 = "version"
            java.lang.String r0 = r3.optString(r0)
            r2.version = r0
            java.lang.String r0 = "md5"
            java.lang.String r0 = r3.optString(r0)
            r2.md5 = r0
            java.lang.String r0 = "sha256"
            java.lang.String r3 = r3.optString(r0)
            r2.sha256 = r3
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.TemplateConfig r1) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.TemplateConfig r1 = (com.kwad.components.offline.api.tk.model.TemplateConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.TemplateConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.TemplateConfig r1 = (com.kwad.components.offline.api.tk.model.TemplateConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.TemplateConfig r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.TemplateConfig r3, org.json.JSONObject r4) {
            r2 = this;
            if (r4 != 0) goto L7
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L7:
            java.lang.String r0 = r3.bundleId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = "bundleId"
            java.lang.String r1 = r3.bundleId
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
        L16:
            java.lang.String r0 = r3.bundleFile
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            java.lang.String r0 = "bundleFile"
            java.lang.String r1 = r3.bundleFile
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
        L25:
            java.lang.String r0 = r3.version
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "version"
            java.lang.String r1 = r3.version
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
        L34:
            java.lang.String r0 = r3.md5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "md5"
            java.lang.String r1 = r3.md5
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
        L43:
            java.lang.String r0 = r3.sha256
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L52
            java.lang.String r0 = "sha256"
            java.lang.String r3 = r3.sha256
            com.kwad.sdk.utils.aa.putValue(r4, r0, r3)
        L52:
            return r4
    }
}
