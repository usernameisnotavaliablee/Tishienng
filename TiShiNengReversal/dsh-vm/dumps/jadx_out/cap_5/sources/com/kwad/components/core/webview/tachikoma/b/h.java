package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.components.core.webview.tachikoma.b.w {
    private com.kwad.components.core.webview.tachikoma.b.h.a agx;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.components.core.webview.tachikoma.b.h r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.core.response.a.a {
        public int agy;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.components.core.webview.tachikoma.b.h.a r1) {
            r0 = this;
            r0.agx = r1
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            super.a(r1, r2)
            com.kwad.components.core.webview.tachikoma.b.h$a r1 = r0.agx
            if (r1 == 0) goto La
            r1.a(r0)
        La:
            return
    }

    public final void aY(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 1
            goto L5
        L4:
            r2 = 2
        L5:
            com.kwad.components.core.webview.tachikoma.b.h$b r0 = new com.kwad.components.core.webview.tachikoma.b.h$b
            r0.<init>()
            r0.agy = r2
            r1.b(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getPlayEndType"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.b.w, com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 0
            r1.agx = r0
            return
    }
}
