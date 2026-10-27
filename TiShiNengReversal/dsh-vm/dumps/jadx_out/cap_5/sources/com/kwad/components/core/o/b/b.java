package com.kwad.components.core.o.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private static final java.util.concurrent.atomic.AtomicBoolean mHasInit = null;


    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.kwad.components.core.o.b.b.mHasInit = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    @com.ksad.annotation.invoker.ForInvoker(methodId = "initOC")
    public static void ax(android.content.Context r0) {
            com.kwad.components.offline.a.b.aF(r0)
            com.kwad.components.offline.b.b.aF(r0)
            com.kwad.components.offline.c.b.aF(r0)
            com.kwad.components.offline.d.c.aF(r0)
            return
    }

    public static void init(android.content.Context r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.o.b.b.mHasInit
            boolean r1 = r0.get()
            if (r1 == 0) goto L9
            return
        L9:
            r1 = 1
            r0.set(r1)
            com.kwad.components.offline.api.OfflineHostProvider r0 = com.kwad.components.offline.api.OfflineHostProvider.get()
            com.kwad.components.core.o.b.a.j r1 = new com.kwad.components.core.o.b.a.j
            r1.<init>()
            r0.init(r2, r1)
            com.kwad.components.core.o.b.b$1 r0 = new com.kwad.components.core.o.b.b$1
            r0.<init>(r2)
            com.kwad.sdk.utils.h.execute(r0)
            return
    }
}
