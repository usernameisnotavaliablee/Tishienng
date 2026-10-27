package com.kwad.components.offline.api.tk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class StyleTemplate extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.tk.model.StyleTemplate> implements java.io.Serializable {
    private static final long serialVersionUID = -6279192768068169498L;
    public java.lang.String jsStr;
    public java.lang.String loadErrorMsg;
    public java.lang.Throwable loadException;
    public java.lang.String templateId;
    public java.lang.String templateMd5;
    public java.lang.String templateUrl;
    public java.lang.String templateVersion;
    public int templateVersionCode;
    public int tkSouce;

    public StyleTemplate() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getTKConfigFileName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.templateId
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            int r1 = r2.templateVersionCode
            r0.append(r1)
            java.lang.String r1 = ".json"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getTKJsFileName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.templateId
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r1 = r2.templateVersionCode
            r0.append(r1)
            java.lang.String r1 = ".js"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getTemplateKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.templateId
            r0.append(r1)
            int r1 = r2.templateVersionCode
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.tk.model.StyleTemplate r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = (com.kwad.components.offline.api.tk.model.StyleTemplate) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.tk.model.StyleTemplate r5, org.json.JSONObject r6) {
            r4 = this;
            if (r6 != 0) goto L3
            goto L4f
        L3:
            java.lang.String r0 = "templateId"
            java.lang.String r1 = r6.optString(r0)
            r5.templateId = r1
            java.lang.Object r0 = r6.opt(r0)
            java.lang.Object r1 = org.json.JSONObject.NULL
            java.lang.String r2 = ""
            if (r0 != r1) goto L17
            r5.templateId = r2
        L17:
            java.lang.String r0 = "templateUrl"
            java.lang.String r3 = r6.optString(r0)
            r5.templateUrl = r3
            java.lang.Object r0 = r6.opt(r0)
            if (r0 != r1) goto L27
            r5.templateUrl = r2
        L27:
            java.lang.String r0 = "templateVersion"
            java.lang.String r3 = r6.optString(r0)
            r5.templateVersion = r3
            java.lang.Object r0 = r6.opt(r0)
            if (r0 != r1) goto L37
            r5.templateVersion = r2
        L37:
            java.lang.String r0 = "templateVersionCode"
            int r0 = r6.optInt(r0)
            r5.templateVersionCode = r0
            java.lang.String r0 = "templateMd5"
            java.lang.String r3 = r6.optString(r0)
            r5.templateMd5 = r3
            java.lang.Object r6 = r6.opt(r0)
            if (r6 != r1) goto L4f
            r5.templateMd5 = r2
        L4f:
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.StyleTemplate r1) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = (com.kwad.components.offline.api.tk.model.StyleTemplate) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.StyleTemplate r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = (com.kwad.components.offline.api.tk.model.StyleTemplate) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.StyleTemplate r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.StyleTemplate r4, org.json.JSONObject r5) {
            r3 = this;
            if (r5 != 0) goto L7
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
        L7:
            java.lang.String r0 = r4.templateId
            java.lang.String r1 = ""
            if (r0 == 0) goto L1a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "templateId"
            java.lang.String r2 = r4.templateId
            com.kwad.sdk.utils.aa.putValue(r5, r0, r2)
        L1a:
            java.lang.String r0 = r4.templateUrl
            if (r0 == 0) goto L2b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "templateUrl"
            java.lang.String r2 = r4.templateUrl
            com.kwad.sdk.utils.aa.putValue(r5, r0, r2)
        L2b:
            java.lang.String r0 = r4.templateVersion
            if (r0 == 0) goto L3c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "templateVersion"
            java.lang.String r2 = r4.templateVersion
            com.kwad.sdk.utils.aa.putValue(r5, r0, r2)
        L3c:
            int r0 = r4.templateVersionCode
            if (r0 == 0) goto L45
            java.lang.String r2 = "templateVersionCode"
            com.kwad.sdk.utils.aa.putValue(r5, r2, r0)
        L45:
            java.lang.String r0 = r4.templateMd5
            if (r0 == 0) goto L56
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            java.lang.String r0 = "templateMd5"
            java.lang.String r4 = r4.templateMd5
            com.kwad.sdk.utils.aa.putValue(r5, r0, r4)
        L56:
            return r5
    }
}
