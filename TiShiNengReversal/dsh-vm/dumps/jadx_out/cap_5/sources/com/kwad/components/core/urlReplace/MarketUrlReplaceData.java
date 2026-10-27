package com.kwad.components.core.urlReplace;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MarketUrlReplaceData extends com.kwad.sdk.core.response.model.BaseResultData implements com.kwad.sdk.core.b, java.io.Serializable {
    private static final long serialVersionUID = 4953795264697162439L;
    private com.kwad.components.core.urlReplace.MarketUrlReplaceData.urlInfo data;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.urlReplace.MarketUrlReplaceData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class urlInfo extends com.kwad.sdk.core.response.a.a implements java.io.Serializable {
        private static final long serialVersionUID = 201762827228761165L;
        public java.lang.String miMarketUrl;
        public boolean replaceSuccess;
        final /* synthetic */ com.kwad.components.core.urlReplace.MarketUrlReplaceData this$0;

        private urlInfo(com.kwad.components.core.urlReplace.MarketUrlReplaceData r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ urlInfo(com.kwad.components.core.urlReplace.MarketUrlReplaceData r1, com.kwad.components.core.urlReplace.MarketUrlReplaceData.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public MarketUrlReplaceData() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getMiMarketUrl() {
            r1 = this;
            com.kwad.components.core.urlReplace.MarketUrlReplaceData$urlInfo r0 = r1.data
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = r0.miMarketUrl
            return r0
    }

    public boolean isParseSuccess() {
            r2 = this;
            com.kwad.components.core.urlReplace.MarketUrlReplaceData$urlInfo r0 = r2.data
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.miMarketUrl
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean isReplaceSuccess() {
            r1 = this;
            com.kwad.components.core.urlReplace.MarketUrlReplaceData$urlInfo r0 = r1.data
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.replaceSuccess
            return r0
    }

    @Override // com.kwad.sdk.core.response.model.BaseResultData, com.kwad.sdk.core.b
    public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r3) {
            r2 = this;
            super.parseJson(r3)
            if (r3 != 0) goto L6
            goto L42
        L6:
            java.lang.String r0 = "data"
            java.lang.String r3 = r3.optString(r0)     // Catch: java.lang.Exception -> L40
            java.lang.Class<com.kwad.sdk.core.a.e> r0 = com.kwad.sdk.core.a.e.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)     // Catch: java.lang.Exception -> L40
            com.kwad.sdk.core.a.e r0 = (com.kwad.sdk.core.a.e) r0     // Catch: java.lang.Exception -> L40
            boolean r1 = com.kwad.sdk.utils.bp.isNullString(r3)     // Catch: java.lang.Exception -> L40
            if (r1 != 0) goto L42
            if (r0 == 0) goto L42
            java.lang.String r3 = r0.getResponseData(r3)     // Catch: java.lang.Exception -> L40
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L40
            r0.<init>(r3)     // Catch: java.lang.Exception -> L40
            com.kwad.components.core.urlReplace.MarketUrlReplaceData$urlInfo r3 = new com.kwad.components.core.urlReplace.MarketUrlReplaceData$urlInfo     // Catch: java.lang.Exception -> L40
            r1 = 0
            r3.<init>(r2, r1)     // Catch: java.lang.Exception -> L40
            r2.data = r3     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "miMarketUrl"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.Exception -> L40
            r3.miMarketUrl = r1     // Catch: java.lang.Exception -> L40
            com.kwad.components.core.urlReplace.MarketUrlReplaceData$urlInfo r3 = r2.data     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "replaceSuccess"
            boolean r0 = r0.optBoolean(r1)     // Catch: java.lang.Exception -> L40
            r3.replaceSuccess = r0     // Catch: java.lang.Exception -> L40
            return
        L40:
            r3 = move-exception
            goto L43
        L42:
            return
        L43:
            java.lang.String r0 = "json bug"
            java.lang.String r1 = r3.toString()
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            return
    }
}
