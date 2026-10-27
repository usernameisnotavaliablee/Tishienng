package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class w implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c agJ;

    @androidx.annotation.NonNull
    private java.util.concurrent.CopyOnWriteArrayList<com.kwad.sdk.core.b> agK;


    public w() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.agK = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.tachikoma.b.w r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.agJ
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            r1.agJ = r3
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.sdk.core.b> r2 = r1.agK
            int r2 = r2.size()
            if (r2 <= 0) goto L25
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.sdk.core.b> r2 = r1.agK
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()
            com.kwad.sdk.core.b r3 = (com.kwad.sdk.core.b) r3
            r1.b(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.sdk.core.b> r0 = r1.agK
            r0.remove(r3)
            goto L10
        L25:
            return
    }

    public final void b(com.kwad.sdk.core.b r2) {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r0 = r1.agJ
            if (r0 == 0) goto Ld
            com.kwad.components.core.webview.tachikoma.b.w$1 r0 = new com.kwad.components.core.webview.tachikoma.b.w$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
        Ld:
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.sdk.core.b> r0 = r1.agK
            r0.add(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public void onDestroy() {
            r1 = this;
            r0 = 0
            r1.agJ = r0
            return
    }
}
