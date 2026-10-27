package com.kwad.components.ad.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private final java.util.concurrent.atomic.AtomicBoolean qY;
    private final java.util.List<com.kwad.components.ad.b.a.b> qZ;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.i.e ra = null;

        static {
                com.kwad.components.ad.i.e r0 = new com.kwad.components.ad.i.e
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.i.e.a.ra = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.i.e gf() {
                com.kwad.components.ad.i.e r0 = com.kwad.components.ad.i.e.a.ra
                return r0
        }
    }

    private e() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.qY = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.qZ = r0
            return
    }

    /* synthetic */ e(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.ad.i.e ge() {
            com.kwad.components.ad.i.e r0 = com.kwad.components.ad.i.e.a.gf()
            return r0
    }

    public final boolean T() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.qY
            boolean r0 = r0.get()
            return r0
    }

    public final void a(com.kwad.components.ad.b.a.b r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.ad.b.a.b> r0 = r1.qZ
            r0.add(r2)
        L7:
            return
    }

    public final void b(com.kwad.components.ad.b.a.b r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.ad.b.a.b> r0 = r1.qZ
            r0.remove(r2)
        L7:
            return
    }

    public final void ga() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.qY
            r1 = 1
            r0.set(r1)
            java.util.List<com.kwad.components.ad.b.a.b> r0 = r2.qZ
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.b.a.b r1 = (com.kwad.components.ad.b.a.b) r1
            r1.U()
            goto Lc
        L1c:
            return
    }

    public final void gc() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.qY
            r1 = 0
            r0.set(r1)
            java.util.List<com.kwad.components.ad.b.a.b> r0 = r2.qZ
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.b.a.b r1 = (com.kwad.components.ad.b.a.b) r1
            r1.V()
            goto Lc
        L1c:
            return
    }
}
