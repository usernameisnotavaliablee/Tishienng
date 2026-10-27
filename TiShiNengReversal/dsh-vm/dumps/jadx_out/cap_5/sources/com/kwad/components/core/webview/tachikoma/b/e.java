package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.core.webview.tachikoma.b.w {
    private final com.kwad.components.core.webview.tachikoma.b.e.b agv;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.kwad.sdk.core.b {
        public int height;

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
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "height"
                int r2 = r3.height
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        @androidx.annotation.MainThread
        int km();
    }

    public e(com.kwad.components.core.webview.tachikoma.b.e.b r1) {
            r0 = this;
            r0.<init>()
            r0.agv = r1
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.b.e$a r2 = new com.kwad.components.core.webview.tachikoma.b.e$a
            r0 = 0
            r2.<init>(r0)
            com.kwad.components.core.webview.tachikoma.b.e$b r0 = r1.agv
            if (r0 == 0) goto L13
            int r0 = r0.km()
            r2.height = r0
            r3.a(r2)
        L13:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getBottomLimitHeight"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
