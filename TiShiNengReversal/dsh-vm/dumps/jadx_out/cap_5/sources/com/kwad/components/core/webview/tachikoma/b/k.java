package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k extends com.kwad.components.core.webview.tachikoma.b.w {
    com.kwad.components.core.webview.tachikoma.b.k.b agA;
    private com.kwad.sdk.core.webview.c.c qn;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.kwad.sdk.core.b {
        public long creativeId;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
                r0 = this;
                return
        }

        @Override // com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "creativeId"
                long r2 = r4.creativeId
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void S(long r1);
    }

    public k() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.b.k$1 r0 = new com.kwad.components.core.webview.tachikoma.b.k$1
            r0.<init>(r1)
            r1.agA = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.tachikoma.b.k r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.qn
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.qn = r2
            com.kwad.components.core.webview.tachikoma.b.k$b r1 = r0.agA
            com.kwad.components.core.e.d.a.a(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerAdConvertListener"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.b.k$b r0 = r1.agA
            com.kwad.components.core.e.d.a.b(r0)
            return
    }
}
