package com.kwad.components.core.widget.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a implements com.kwad.sdk.core.j.a, com.kwad.sdk.utils.ca.a {
    private final java.util.concurrent.atomic.AtomicBoolean ajo;
    private java.util.Set<com.kwad.sdk.core.j.c> ajp;
    private final int ajq;
    protected final com.kwad.sdk.utils.ca bQ;
    private final android.view.View mRootView;


    public a(@androidx.annotation.NonNull android.view.View r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.ajo = r0
            r2.mRootView = r3
            r2.ajq = r4
            com.kwad.sdk.utils.ca r3 = new com.kwad.sdk.utils.ca
            r3.<init>(r2)
            r2.bQ = r3
            return
    }

    private void bc(boolean r3) {
            r2 = this;
            java.util.Set<com.kwad.sdk.core.j.c> r0 = r2.ajp
            if (r0 != 0) goto L5
            goto L21
        L5:
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.kwad.sdk.core.j.c r1 = (com.kwad.sdk.core.j.c) r1
            if (r1 == 0) goto L9
            if (r3 == 0) goto L1d
            r1.bt()
            goto L9
        L1d:
            r1.bu()
            goto L9
        L21:
            return
    }

    private void ki() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.ajo
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto Lc
            r2.bc(r1)
        Lc:
            return
    }

    private void wk() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.ajo
            r1 = 0
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lc
            r2.bc(r1)
        Lc:
            return
    }

    public void a(android.os.Message r4) {
            r3 = this;
            int r4 = r4.what
            r0 = 666(0x29a, float:9.33E-43)
            if (r4 != r0) goto L10
            r3.wh()
            com.kwad.sdk.utils.ca r4 = r3.bQ
            r1 = 500(0x1f4, double:2.47E-321)
            r4.sendEmptyMessageDelayed(r0, r1)
        L10:
            return
    }

    @Override // com.kwad.sdk.core.j.a
    @androidx.annotation.MainThread
    public final void a(com.kwad.sdk.core.j.c r2) {
            r1 = this;
            com.kwad.sdk.utils.ap.checkUiThread()
            if (r2 != 0) goto L6
            return
        L6:
            com.kwad.components.core.widget.a.a$1 r0 = new com.kwad.components.core.widget.a.a$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            java.util.Set<com.kwad.sdk.core.j.c> r0 = r1.ajp
            if (r0 != 0) goto L19
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.ajp = r0
        L19:
            java.util.Set<com.kwad.sdk.core.j.c> r0 = r1.ajp
            r0.add(r2)
            return
    }

    public abstract boolean ae();

    @Override // com.kwad.sdk.core.j.a
    @androidx.annotation.MainThread
    public final void b(com.kwad.sdk.core.j.c r2) {
            r1 = this;
            com.kwad.sdk.utils.ap.checkUiThread()
            if (r2 != 0) goto L6
            goto Ld
        L6:
            java.util.Set<com.kwad.sdk.core.j.c> r0 = r1.ajp
            if (r0 == 0) goto Ld
            r0.remove(r2)
        Ld:
            return
    }

    @Override // com.kwad.sdk.core.j.a
    @androidx.annotation.CallSuper
    public final void release() {
            r1 = this;
            r1.wj()
            java.util.Set<com.kwad.sdk.core.j.c> r0 = r1.ajp
            if (r0 == 0) goto La
            r0.clear()
        La:
            return
    }

    public final void wh() {
            r1 = this;
            boolean r0 = r1.ae()
            if (r0 == 0) goto La
            r1.ki()
            return
        La:
            r1.wk()
            return
    }

    public final void wi() {
            r2 = this;
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 666(0x29a, float:9.33E-43)
            r0.removeMessages(r1)
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r0.sendEmptyMessage(r1)
            return
    }

    public final void wj() {
            r2 = this;
            r2.wh()
            com.kwad.sdk.utils.ca r0 = r2.bQ
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    @Override // com.kwad.sdk.core.j.a
    @androidx.annotation.MainThread
    public final boolean wl() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.ajo
            boolean r0 = r0.get()
            return r0
    }
}
