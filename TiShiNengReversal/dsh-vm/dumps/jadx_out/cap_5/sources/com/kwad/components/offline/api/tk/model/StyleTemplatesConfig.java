package com.kwad.components.offline.api.tk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class StyleTemplatesConfig extends com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse<com.kwad.components.offline.api.tk.model.StyleTemplatesConfig> implements java.io.Serializable {
    private static final long serialVersionUID = -6279192768068169498L;
    public java.util.List<com.kwad.components.offline.api.tk.model.StyleTemplate> styleTemplates;

    public StyleTemplatesConfig() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.styleTemplates = r0
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ void parseJson(com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r1 = (com.kwad.components.offline.api.tk.model.StyleTemplatesConfig) r1
            r0.parseJson2(r1, r2)
            return
    }

    /* renamed from: parseJson, reason: avoid collision after fix types in other method */
    public void parseJson2(com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r4, org.json.JSONObject r5) {
            r3 = this;
            if (r5 != 0) goto L3
            goto L2d
        L3:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.styleTemplates = r0
            java.lang.String r0 = "styleTemplates"
            org.json.JSONArray r5 = r5.optJSONArray(r0)
            if (r5 == 0) goto L2d
            r0 = 0
        L13:
            int r1 = r5.length()
            if (r0 >= r1) goto L2d
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = new com.kwad.components.offline.api.tk.model.StyleTemplate
            r1.<init>()
            org.json.JSONObject r2 = r5.optJSONObject(r0)
            r1.parseJson(r2)
            java.util.List<com.kwad.components.offline.api.tk.model.StyleTemplate> r2 = r4.styleTemplates
            r2.add(r1)
            int r0 = r0 + 1
            goto L13
        L2d:
            return
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r1) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r1 = (com.kwad.components.offline.api.tk.model.StyleTemplatesConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.model.BaseOfflineCompoJsonParse
    public /* bridge */ /* synthetic */ org.json.JSONObject toJson(com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r1, org.json.JSONObject r2) {
            r0 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r1 = (com.kwad.components.offline.api.tk.model.StyleTemplatesConfig) r1
            org.json.JSONObject r1 = r0.toJson2(r1, r2)
            return r1
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r2) {
            r1 = this;
            r0 = 0
            org.json.JSONObject r2 = r1.toJson2(r2, r0)
            return r2
    }

    /* renamed from: toJson, reason: avoid collision after fix types in other method */
    public org.json.JSONObject toJson2(com.kwad.components.offline.api.tk.model.StyleTemplatesConfig r2, org.json.JSONObject r3) {
            r1 = this;
            if (r3 != 0) goto L7
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L7:
            java.lang.String r0 = "styleTemplates"
            java.util.List<com.kwad.components.offline.api.tk.model.StyleTemplate> r2 = r2.styleTemplates
            com.kwad.sdk.utils.aa.putValue(r3, r0, r2)
            return r3
    }
}
