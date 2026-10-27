package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ao implements com.kwad.sdk.core.webview.c.a {
    private java.util.List<com.kwad.components.core.webview.jshandler.ao.c> mHolders;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.kwad.sdk.core.download.a.a {
        private com.kwad.components.core.webview.jshandler.ao.c adP;

        public a(com.kwad.components.core.webview.jshandler.ao.c r1) {
                r0 = this;
                r0.<init>()
                r0.adP = r1
                return
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onDownloadFailed() {
                r3 = this;
                com.kwad.components.core.webview.jshandler.ao$c r0 = r3.adP
                r1 = 1
                r2 = 0
                com.kwad.components.core.webview.jshandler.ao.b(r0, r1, r2)
                return
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onDownloadFinished() {
                r3 = this;
                com.kwad.components.core.webview.jshandler.ao$c r0 = r3.adP
                r1 = 5
                r2 = 1065353216(0x3f800000, float:1.0)
                com.kwad.components.core.webview.jshandler.ao.b(r0, r1, r2)
                return
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onIdle() {
                r3 = this;
                com.kwad.components.core.webview.jshandler.ao$c r0 = r3.adP
                r1 = 1
                r2 = 0
                com.kwad.components.core.webview.jshandler.ao.b(r0, r1, r2)
                return
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onInstalled() {
                r3 = this;
                com.kwad.components.core.webview.jshandler.ao$c r0 = r3.adP
                r1 = 6
                r2 = 1065353216(0x3f800000, float:1.0)
                com.kwad.components.core.webview.jshandler.ao.b(r0, r1, r2)
                return
        }

        @Override // com.kwad.sdk.core.download.a.a
        public final void onPaused(int r3) {
                r2 = this;
                com.kwad.components.core.webview.jshandler.ao$c r0 = r2.adP
                r1 = 1065353216(0x3f800000, float:1.0)
                float r3 = (float) r3
                float r3 = r3 * r1
                r1 = 1120403456(0x42c80000, float:100.0)
                float r3 = r3 / r1
                r1 = 3
                com.kwad.components.core.webview.jshandler.ao.b(r0, r1, r3)
                return
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onProgressUpdate(int r3) {
                r2 = this;
                com.kwad.components.core.webview.jshandler.ao$c r0 = r2.adP
                r1 = 1065353216(0x3f800000, float:1.0)
                float r3 = (float) r3
                float r3 = r3 * r1
                r1 = 1120403456(0x42c80000, float:100.0)
                float r3 = r3 / r1
                r1 = 2
                com.kwad.components.core.webview.jshandler.ao.b(r0, r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.core.response.a.a {
        public long creativeId;

        public b() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.creativeId = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c {
        private com.kwad.components.core.e.d.c adQ;
        private com.kwad.components.core.webview.jshandler.ao.a adR;
        private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
        private com.kwad.sdk.core.webview.c.c qn;

        public c(com.kwad.components.core.e.d.c r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
                r0 = this;
                r0.<init>()
                r0.adQ = r1
                r0.mAdTemplate = r2
                return
        }

        static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.ao.c r0) {
                com.kwad.sdk.core.webview.c.c r0 = r0.qn
                return r0
        }

        static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.ao.c r0, com.kwad.sdk.core.webview.c.c r1) {
                r0.qn = r1
                return r1
        }

        static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.core.webview.jshandler.ao.c r0) {
                com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
                return r0
        }

        public final void a(com.kwad.components.core.webview.jshandler.ao.a r2) {
                r1 = this;
                com.kwad.components.core.e.d.c r0 = r1.adQ
                r0.b(r2)
                r1.adR = r2
                return
        }

        public final void destroy() {
                r2 = this;
                com.kwad.components.core.e.d.c r0 = r2.adQ
                if (r0 == 0) goto Lb
                com.kwad.components.core.webview.jshandler.ao$a r1 = r2.adR
                if (r1 == 0) goto Lb
                r0.c(r1)
            Lb:
                return
        }

        public final long getCreativeId() {
                r2 = this;
                com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
                if (r0 != 0) goto L7
                r0 = -1
                return r0
            L7:
                long r0 = com.kwad.sdk.core.response.b.e.ev(r0)
                return r0
        }
    }

    public ao(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r6, java.util.List<com.kwad.components.core.e.d.c> r7) {
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.mHolders = r0
            if (r6 == 0) goto L2f
            if (r7 != 0) goto Lf
            goto L2f
        Lf:
            int r0 = r6.size()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2f
            java.lang.Object r2 = r6.get(r1)
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            java.lang.Object r3 = r7.get(r1)
            com.kwad.components.core.e.d.c r3 = (com.kwad.components.core.e.d.c) r3
            com.kwad.components.core.webview.jshandler.ao$c r4 = new com.kwad.components.core.webview.jshandler.ao$c
            r4.<init>(r3, r2)
            java.util.List<com.kwad.components.core.webview.jshandler.ao$c> r2 = r5.mHolders
            r2.add(r4)
            int r1 = r1 + 1
            goto L14
        L2f:
            return
    }

    private com.kwad.components.core.webview.jshandler.ao.c R(long r7) {
            r6 = this;
            r0 = -1
            r2 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L8
            return r2
        L8:
            java.util.List<com.kwad.components.core.webview.jshandler.ao$c> r0 = r6.mHolders
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.webview.jshandler.ao$c r1 = (com.kwad.components.core.webview.jshandler.ao.c) r1
            long r3 = r1.getCreativeId()
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto Le
            return r1
        L23:
            return r2
    }

    private static void a(com.kwad.components.core.webview.jshandler.ao.c r6, int r7, float r8) {
            if (r6 == 0) goto L66
            com.kwad.sdk.core.webview.c.c r0 = com.kwad.components.core.webview.jshandler.ao.c.a(r6)
            if (r0 != 0) goto L9
            goto L66
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyDownloadProgress: "
            r0.<init>(r1)
            com.kwad.sdk.core.webview.c.c r1 = com.kwad.components.core.webview.jshandler.ao.c.a(r6)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiProgressListener"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.webview.c.c r0 = com.kwad.components.core.webview.jshandler.ao.c.a(r6)
            com.kwad.components.core.webview.jshandler.bc$a r1 = new com.kwad.components.core.webview.jshandler.bc$a
            r1.<init>()
            r1.aep = r8
            r1.status = r7
            long r7 = r6.getCreativeId()
            r1.creativeId = r7
            com.kwad.sdk.core.response.model.AdTemplate r7 = com.kwad.components.core.webview.jshandler.ao.c.b(r6)
            com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r7)
            long r7 = r7.totalBytes
            r1.totalBytes = r7
            com.kwad.sdk.core.response.model.AdTemplate r6 = com.kwad.components.core.webview.jshandler.ao.c.b(r6)
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r6)
            long r6 = r6.soFarBytes
            r1.soFarBytes = r6
            long r2 = r1.totalBytes
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L60
            float r6 = (float) r6
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r7
            float r7 = (float) r2
            float r6 = r6 / r7
            r1.aeq = r6
            goto L63
        L60:
            r6 = 0
            r1.aeq = r6
        L63:
            r0.a(r1)
        L66:
            return
    }

    static /* synthetic */ void b(com.kwad.components.core.webview.jshandler.ao.c r0, int r1, float r2) {
            a(r0, r1, r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            if (r3 == 0) goto L22
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L22
            r0.<init>(r3)     // Catch: java.lang.Exception -> L22
            com.kwad.components.core.webview.jshandler.ao$b r3 = new com.kwad.components.core.webview.jshandler.ao$b     // Catch: java.lang.Exception -> L22
            r3.<init>()     // Catch: java.lang.Exception -> L22
            r3.parseJson(r0)     // Catch: java.lang.Exception -> L22
            long r0 = r3.creativeId     // Catch: java.lang.Exception -> L22
            com.kwad.components.core.webview.jshandler.ao$c r3 = r2.R(r0)     // Catch: java.lang.Exception -> L22
            if (r3 == 0) goto L22
            com.kwad.components.core.webview.jshandler.ao.c.a(r3, r4)     // Catch: java.lang.Exception -> L22
            com.kwad.components.core.webview.jshandler.ao$a r4 = new com.kwad.components.core.webview.jshandler.ao$a     // Catch: java.lang.Exception -> L22
            r4.<init>(r3)     // Catch: java.lang.Exception -> L22
            r3.a(r4)     // Catch: java.lang.Exception -> L22
        L22:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerMultiProgressListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            java.util.List<com.kwad.components.core.webview.jshandler.ao$c> r0 = r2.mHolders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.webview.jshandler.ao$c r1 = (com.kwad.components.core.webview.jshandler.ao.c) r1
            r1.destroy()
            goto L6
        L16:
            return
    }
}
