package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class x implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener Bm;
    private com.kwad.sdk.core.webview.c.c acS;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public boolean agO;
        public int agP;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public x() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.webview.tachikoma.b.x$1 r0 = new com.kwad.components.core.webview.tachikoma.b.x$1
            r0.<init>(r1)
            r1.Bm = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.b.x r0, int r1) {
            r0.bk(r1)
            return
    }

    private void bk(int r3) {
            r2 = this;
            com.kwad.components.core.webview.tachikoma.b.x$a r0 = new com.kwad.components.core.webview.tachikoma.b.x$a
            r0.<init>()
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.components.core.t.a r1 = com.kwad.components.core.t.a.aC(r1)
            boolean r1 = r1.sW()
            r0.agO = r1
            r0.agP = r3
            com.kwad.sdk.core.webview.c.c r3 = r2.acS
            if (r3 == 0) goto L1c
            r3.a(r0)
        L1c:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.acS = r2
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.components.core.t.a r1 = com.kwad.components.core.t.a.aC(r1)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2 = r0.Bm
            r1.a(r2)
            r1 = 1
            r0.bk(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerAudioFocusListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r2.Bm
            r0.b(r1)
            r0 = 0
            r2.acS = r0
            return
    }
}
