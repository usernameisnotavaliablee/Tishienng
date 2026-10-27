package com.kwad.components.core.webview.jshandler.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e implements com.kwad.sdk.core.webview.c.a {
    private static java.text.SimpleDateFormat aeK;
    private final java.lang.ref.WeakReference<android.content.Context> aeJ;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String aeM;
        private byte[] aeN;
        private java.lang.String aeO;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterParseJson(@androidx.annotation.Nullable org.json.JSONObject r3) {
                r2 = this;
                super.afterParseJson(r3)
                java.lang.String r3 = r2.aeM
                java.lang.String r0 = ";base64,"
                java.lang.String[] r3 = r3.split(r0)
                int r0 = r3.length
                r1 = 2
                if (r0 < r1) goto L2e
                r0 = 0
                r0 = r3[r0]
                java.lang.String r1 = "data:"
                boolean r1 = r0.startsWith(r1)
                if (r1 == 0) goto L21
                r1 = 5
                java.lang.String r0 = r0.substring(r1)
                r2.aeO = r0
            L21:
                com.kwad.sdk.core.a.c$a r0 = com.kwad.sdk.core.a.c.Hi()
                r1 = 1
                r3 = r3[r1]
                byte[] r3 = r0.decode(r3)
                r2.aeN = r3
            L2e:
                return
        }

        public final byte[] uN() {
                r1 = this;
                byte[] r0 = r1.aeN
                return r0
        }

        public final java.lang.String uO() {
                r1 = this;
                java.lang.String r0 = r1.aeO
                return r0
        }
    }

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMddHHmmss"
            r0.<init>(r1)
            com.kwad.components.core.webview.jshandler.a.e.aeK = r0
            return
    }

    public e(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.aeJ = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.a.e r0, com.kwad.sdk.core.webview.c.c r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.a.e r0, com.kwad.sdk.core.webview.c.c r1, java.lang.String r2, int r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void a(com.kwad.sdk.core.webview.c.c r3, java.lang.String r4, int r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyError msg: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SaveImageHandler"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.core.webview.jshandler.a.e$3 r0 = new com.kwad.components.core.webview.jshandler.a.e$3
            r0.<init>(r2, r3, r5, r4)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    private void b(com.kwad.sdk.core.webview.c.c r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifySuccess function callback: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SaveImageHandler"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.core.webview.jshandler.a.e$2 r0 = new com.kwad.components.core.webview.jshandler.a.e$2
            r0.<init>(r2, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    static /* synthetic */ java.text.SimpleDateFormat uM() {
            java.text.SimpleDateFormat r0 = com.kwad.components.core.webview.jshandler.a.e.aeK
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.aeJ
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.kwad.components.core.webview.jshandler.a.e$1 r1 = new com.kwad.components.core.webview.jshandler.a.e$1
            r1.<init>(r2, r3, r0, r4)
            com.kwad.sdk.utils.h.execute(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "saveImage"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
