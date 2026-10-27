package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g implements com.kwad.components.offline.api.core.api.ILifeCycle {
    private final java.util.concurrent.atomic.AtomicInteger RJ;
    private final java.util.Map<java.lang.Integer, com.kwad.sdk.core.c.d> RK;


    public g() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.RJ = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.RK = r0
            return
    }

    @Override // com.kwad.components.offline.api.core.api.ILifeCycle
    public final android.app.Activity getCurrentActivity() {
            r1 = this;
            com.kwad.sdk.core.c.b.Ho()
            android.app.Activity r0 = com.kwad.sdk.core.c.b.getCurrentActivity()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.ILifeCycle
    public final boolean isAppOnForeground() {
            r1 = this;
            com.kwad.sdk.core.c.b.Ho()
            boolean r0 = com.kwad.sdk.core.c.b.isAppOnForeground()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.ILifeCycle
    public final int registerLifeCycleListener(com.kwad.components.offline.api.core.api.ILifeCycleListener r4) {
            r3 = this;
            com.kwad.components.core.o.b.a.g$1 r0 = new com.kwad.components.core.o.b.a.g$1
            r0.<init>(r3, r4)
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.b.a(r0)
            java.util.concurrent.atomic.AtomicInteger r4 = r3.RJ
            int r4 = r4.incrementAndGet()
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.c.d> r1 = r3.RK
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r0)
            return r4
    }

    @Override // com.kwad.components.offline.api.core.api.ILifeCycle
    public final void unregisterLifeCycleListener(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.c.d> r0 = r2.RK
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            com.kwad.sdk.core.c.d r0 = (com.kwad.sdk.core.c.d) r0
            if (r0 == 0) goto L14
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.b.b(r0)
        L14:
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.c.d> r0 = r2.RK
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.remove(r3)
            return
    }
}
