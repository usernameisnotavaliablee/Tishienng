package com.kwad.components.core.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l {
    private static volatile com.kwad.components.core.proxy.l Wi;
    private final java.util.List<com.kwad.components.core.proxy.m> mListeners;






    public l() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mListeners = r0
            return
    }

    static /* synthetic */ java.util.List a(com.kwad.components.core.proxy.l r0) {
            java.util.List<com.kwad.components.core.proxy.m> r0 = r0.mListeners
            return r0
    }

    private void c(com.kwad.sdk.g.a<com.kwad.components.core.proxy.m> r2) {
            r1 = this;
            com.kwad.components.core.proxy.l$5 r0 = new com.kwad.components.core.proxy.l$5
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    public static com.kwad.components.core.proxy.l rV() {
            com.kwad.components.core.proxy.l r0 = com.kwad.components.core.proxy.l.Wi
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.proxy.l> r0 = com.kwad.components.core.proxy.l.class
            monitor-enter(r0)
            com.kwad.components.core.proxy.l r1 = com.kwad.components.core.proxy.l.Wi     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.proxy.l r1 = new com.kwad.components.core.proxy.l     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.proxy.l.Wi = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.components.core.proxy.l r0 = com.kwad.components.core.proxy.l.Wi
            return r0
    }

    public final void a(com.kwad.components.core.proxy.f r2, android.os.Bundle r3) {
            r1 = this;
            com.kwad.components.core.proxy.l$1 r0 = new com.kwad.components.core.proxy.l$1
            r0.<init>(r1, r2, r3)
            r1.c(r0)
            return
    }

    public final void a(com.kwad.components.core.proxy.m r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.proxy.m> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    public final void e(com.kwad.components.core.proxy.f r2) {
            r1 = this;
            com.kwad.components.core.proxy.l$2 r0 = new com.kwad.components.core.proxy.l$2
            r0.<init>(r1, r2)
            r1.c(r0)
            return
    }

    public final void f(com.kwad.components.core.proxy.f r2) {
            r1 = this;
            com.kwad.components.core.proxy.l$3 r0 = new com.kwad.components.core.proxy.l$3
            r0.<init>(r1, r2)
            r1.c(r0)
            return
    }

    public final void g(com.kwad.components.core.proxy.f r2) {
            r1 = this;
            com.kwad.components.core.proxy.l$4 r0 = new com.kwad.components.core.proxy.l$4
            r0.<init>(r1, r2)
            r1.c(r0)
            return
    }
}
