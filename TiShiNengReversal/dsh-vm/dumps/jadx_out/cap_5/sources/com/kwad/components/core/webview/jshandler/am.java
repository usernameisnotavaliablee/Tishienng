package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class am implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b acw;
    private int adC;
    private com.kwad.components.core.webview.jshandler.am.a adD;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void onAdShow();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends com.kwad.sdk.core.report.a implements com.kwad.sdk.core.b {
        private java.lang.String NN;
        private java.lang.String Pj;
        private int actionType;
        private int adE;
        private com.kwad.sdk.core.response.model.AdTemplate adTemplate;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int d(com.kwad.components.core.webview.jshandler.am.b r0) {
                int r0 = r0.actionType
                return r0
        }

        static /* synthetic */ java.lang.String e(com.kwad.components.core.webview.jshandler.am.b r0) {
                java.lang.String r0 = r0.Pj
                return r0
        }

        static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate f(com.kwad.components.core.webview.jshandler.am.b r0) {
                com.kwad.sdk.core.response.model.AdTemplate r0 = r0.adTemplate
                return r0
        }

        static /* synthetic */ int g(com.kwad.components.core.webview.jshandler.am.b r0) {
                int r0 = r0.adE
                return r0
        }

        static /* synthetic */ java.lang.String h(com.kwad.components.core.webview.jshandler.am.b r0) {
                java.lang.String r0 = r0.NN
                return r0
        }

        public final int getActionType() {
                r1 = this;
                int r0 = r1.actionType
                return r0
        }

        public final java.lang.String os() {
                r1 = this;
                java.lang.String r0 = r1.NN
                return r0
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r4) {
                r3 = this;
                java.lang.String r0 = "adTemplate"
                if (r4 != 0) goto L5
                goto L67
            L5:
                java.lang.String r1 = "actionType"
                int r1 = r4.optInt(r1)
                r3.actionType = r1
                java.lang.String r1 = "refreshType"
                int r1 = r4.optInt(r1)
                r3.adE = r1
                java.lang.String r1 = "payload"
                java.lang.String r1 = r4.optString(r1)
                r3.Pj = r1
                java.lang.String r1 = "creativeId"
                java.lang.String r1 = r4.optString(r1)
                r3.NN = r1
                boolean r1 = r4.has(r0)     // Catch: java.lang.Exception -> L3b
                if (r1 == 0) goto L4b
                java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L3b
                com.kwad.sdk.core.response.model.AdTemplate r1 = r3.adTemplate     // Catch: java.lang.Exception -> L3b
                if (r1 != 0) goto L3d
                com.kwad.sdk.core.response.model.AdTemplate r1 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Exception -> L3b
                r1.<init>()     // Catch: java.lang.Exception -> L3b
                r3.adTemplate = r1     // Catch: java.lang.Exception -> L3b
                goto L3d
            L3b:
                r0 = move-exception
                goto L48
            L3d:
                com.kwad.sdk.core.response.model.AdTemplate r1 = r3.adTemplate     // Catch: java.lang.Exception -> L3b
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3b
                r2.<init>(r0)     // Catch: java.lang.Exception -> L3b
                r1.parseJson(r2)     // Catch: java.lang.Exception -> L3b
                goto L4b
            L48:
                com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            L4b:
                com.kwad.sdk.core.response.model.AdTemplate r0 = r3.adTemplate
                if (r0 != 0) goto L67
                java.lang.String r0 = "adCacheId"
                boolean r1 = r4.has(r0)
                if (r1 == 0) goto L67
                int r4 = r4.optInt(r0)
                com.kwad.sdk.core.response.model.AdResultData r4 = com.kwad.components.core.o.a.e.a.a.aI(r4)
                java.lang.String r0 = r3.NN
                com.kwad.sdk.core.response.model.AdTemplate r4 = com.kwad.sdk.core.response.b.c.a(r4, r0)
                r3.adTemplate = r4
            L67:
                return
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "actionType"
                int r2 = r3.actionType
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "payload"
                java.lang.String r2 = r3.Pj
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "refreshType"
                int r2 = r3.adE
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "adTemplate"
                com.kwad.sdk.core.response.model.AdTemplate r2 = r3.adTemplate
                com.kwad.sdk.utils.aa.a(r0, r1, r2)
                java.lang.String r1 = "creativeId"
                java.lang.String r2 = r3.NN
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }

        public final java.lang.String uD() {
                r1 = this;
                java.lang.String r0 = r1.Pj
                return r0
        }
    }

    public am(com.kwad.sdk.core.webview.b r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.adC = r0
            r1.acw = r2
            return
    }

    private com.kwad.sdk.core.response.model.AdTemplate c(@androidx.annotation.NonNull com.kwad.components.core.webview.jshandler.am.b r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.components.core.webview.jshandler.am.b.f(r2)
            if (r0 == 0) goto Lb
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.components.core.webview.jshandler.am.b.f(r2)
            return r2
        Lb:
            com.kwad.sdk.core.webview.b r0 = r1.acw
            java.lang.String r2 = com.kwad.components.core.webview.jshandler.am.b.h(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.dk(r2)
            return r2
    }

    public final void a(com.kwad.components.core.webview.jshandler.am.a r1) {
            r0 = this;
            r0.adD = r1
            return
    }

    @android.annotation.SuppressLint({"SwitchIntDef"})
    protected void a(@androidx.annotation.NonNull com.kwad.components.core.webview.jshandler.am.b r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleH5Log actionType actionType"
            r0.<init>(r1)
            int r1 = com.kwad.components.core.webview.jshandler.am.b.d(r8)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WebCardLogHandler"
            com.kwad.sdk.core.d.c.d(r1, r0)
            int r0 = com.kwad.components.core.webview.jshandler.am.b.d(r8)
            r1 = 1
            if (r0 != r1) goto L8f
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            java.lang.String r2 = com.kwad.components.core.webview.jshandler.am.b.e(r8)
            com.kwad.sdk.core.adlog.c.b r0 = r0.ds(r2)
            com.kwad.components.core.webview.jshandler.am$a r2 = r7.adD
            if (r2 == 0) goto L32
            r2.onAdShow()
        L32:
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.components.core.webview.jshandler.am.b.f(r8)
            r3 = 0
            if (r2 == 0) goto L46
            int r2 = r7.adC
            r0.dh(r2)
            com.kwad.sdk.core.response.model.AdTemplate r8 = com.kwad.components.core.webview.jshandler.am.b.f(r8)
            r7.b(r1, r8, r3, r0)
            return
        L46:
            java.lang.String r2 = r8.os()
            boolean r2 = com.kwad.sdk.utils.bp.isNullString(r2)
            if (r2 == 0) goto L5a
            com.kwad.sdk.core.webview.b r8 = r7.acw
            com.kwad.sdk.core.response.model.AdTemplate r8 = r8.getAdTemplate()
            r7.b(r1, r8, r3, r0)
            return
        L5a:
            com.kwad.sdk.core.webview.b r1 = r7.acw
            java.util.List r1 = r1.KI()
            if (r1 == 0) goto L8e
            com.kwad.sdk.core.webview.b r1 = r7.acw
            java.util.List r1 = r1.KI()
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r1.next()
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            java.lang.String r4 = r8.os()
            long r5 = com.kwad.sdk.core.response.b.e.ev(r2)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r4 = com.kwad.sdk.utils.bp.isEquals(r4, r5)
            if (r4 == 0) goto L6c
            r8 = 0
            r7.b(r8, r2, r3, r0)
        L8e:
            return
        L8f:
            int r0 = com.kwad.components.core.webview.jshandler.am.b.d(r8)
            r1 = 2
            if (r0 != r1) goto Lc5
            com.kwad.sdk.core.webview.b r0 = r7.acw
            com.kwad.sdk.widget.g r0 = r0.aMN
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            int r2 = r7.adC
            com.kwad.sdk.core.adlog.c.b r1 = r1.dh(r2)
            java.lang.String r2 = com.kwad.components.core.webview.jshandler.am.b.e(r8)
            com.kwad.sdk.core.adlog.c.b r1 = r1.ds(r2)
            if (r0 == 0) goto Lb6
            com.kwad.sdk.utils.aj$a r0 = r0.getTouchCoords()
            r1.f(r0)
        Lb6:
            r7.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r8 = r7.c(r8)
            com.kwad.sdk.core.webview.b r0 = r7.acw
            org.json.JSONObject r0 = r0.mReportExtData
            com.kwad.sdk.core.adlog.c.a(r8, r1, r0)
            return
        Lc5:
            int r0 = com.kwad.components.core.webview.jshandler.am.b.d(r8)
            r1 = 12006(0x2ee6, float:1.6824E-41)
            if (r0 != r1) goto Ldf
            com.kwad.components.core.p.a r0 = com.kwad.components.core.p.a.se()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r7.c(r8)
            int r8 = com.kwad.components.core.webview.jshandler.am.b.g(r8)
            int r2 = r7.adC
            r0.f(r1, r8, r2)
            return
        Ldf:
            int r0 = com.kwad.components.core.webview.jshandler.am.b.d(r8)
            r1 = 140(0x8c, float:1.96E-43)
            if (r0 != r1) goto L100
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            java.lang.String r1 = com.kwad.components.core.webview.jshandler.am.b.e(r8)
            com.kwad.sdk.core.adlog.c.b r0 = r0.ds(r1)
            com.kwad.sdk.core.response.model.AdTemplate r8 = r7.c(r8)
            com.kwad.sdk.core.webview.b r1 = r7.acw
            org.json.JSONObject r1 = r1.mReportExtData
            com.kwad.sdk.core.adlog.c.d(r8, r1, r0)
            return
        L100:
            int r0 = com.kwad.components.core.webview.jshandler.am.b.d(r8)
            r1 = 141(0x8d, float:1.98E-43)
            if (r0 != r1) goto L121
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            java.lang.String r1 = com.kwad.components.core.webview.jshandler.am.b.e(r8)
            com.kwad.sdk.core.adlog.c.b r0 = r0.ds(r1)
            com.kwad.sdk.core.response.model.AdTemplate r8 = r7.c(r8)
            com.kwad.sdk.core.webview.b r1 = r7.acw
            org.json.JSONObject r1 = r1.mReportExtData
            com.kwad.sdk.core.adlog.c.e(r8, r1, r0)
            return
        L121:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r7.c(r8)
            int r1 = com.kwad.components.core.webview.jshandler.am.b.d(r8)
            com.kwad.sdk.core.webview.b r2 = r7.acw
            org.json.JSONObject r2 = r2.mReportExtData
            java.lang.String r3 = com.kwad.components.core.webview.jshandler.am.b.e(r8)
            com.kwad.sdk.core.adlog.c.a(r0, r1, r2, r3)
            com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.vI()
            java.lang.String r8 = com.kwad.components.core.webview.jshandler.am.b.e(r8)
            r0.bi(r8)
            return
    }

    protected void a(com.kwad.sdk.core.adlog.c.b r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            r0 = -1
            com.kwad.components.core.webview.jshandler.am$b r1 = new com.kwad.components.core.webview.jshandler.am$b     // Catch: org.json.JSONException -> L1a
            r1.<init>()     // Catch: org.json.JSONException -> L1a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            r2.<init>(r4)     // Catch: org.json.JSONException -> L1a
            r1.parseJson(r2)     // Catch: org.json.JSONException -> L1a
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.c(r1)     // Catch: org.json.JSONException -> L1a
            if (r4 != 0) goto L1c
            java.lang.String r4 = "native adTemplate is null"
            r5.onError(r0, r4)     // Catch: org.json.JSONException -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L24
        L1c:
            r3.a(r1)     // Catch: org.json.JSONException -> L1a
            r4 = 0
            r5.a(r4)     // Catch: org.json.JSONException -> L1a
            return
        L24:
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            java.lang.String r4 = r4.getMessage()
            r5.onError(r0, r4)
            return
    }

    protected void b(boolean r1, com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.Nullable org.json.JSONObject r3, @androidx.annotation.Nullable com.kwad.sdk.core.adlog.c.b r4) {
            r0 = this;
            com.kwad.components.core.t.b r1 = com.kwad.components.core.t.b.sY()
            r3 = 0
            r1.a(r2, r3, r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "log"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
