package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.jshandler.a.b acc;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    /* renamed from: com.kwad.components.core.webview.jshandler.a$a, reason: collision with other inner class name */
    public static class C0094a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String NN;
        public java.lang.String acf;
        public java.lang.String acg;

        public C0094a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void c(com.kwad.components.core.webview.jshandler.a.C0094a r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class c extends com.kwad.sdk.core.response.a.a {
        public int ach;
        public long aci;
        public boolean acj;
        public int errorCode;

        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a(com.kwad.components.core.webview.jshandler.a.b r1) {
            r0 = this;
            r0.<init>()
            r0.acc = r1
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.a.b a(com.kwad.components.core.webview.jshandler.a r0) {
            com.kwad.components.core.webview.jshandler.a$b r0 = r0.acc
            return r0
    }

    private void b(com.kwad.components.core.webview.jshandler.a.C0094a r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.a$1 r0 = new com.kwad.components.core.webview.jshandler.a$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.a$a r3 = new com.kwad.components.core.webview.jshandler.a$a     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            r3.parseJson(r0)     // Catch: java.lang.Throwable -> L10
            r1.b(r3)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "adOutCallback"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
