package com.kwad.components.core.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.core.k.a.b> Rl;
    private volatile boolean Rm;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.k.a$a, reason: collision with other inner class name */
    static final class C0079a {
        private static final com.kwad.components.core.k.a Rn = null;

        static {
                com.kwad.components.core.k.a r0 = new com.kwad.components.core.k.a
                r0.<init>()
                com.kwad.components.core.k.a.C0079a.Rn = r0
                return
        }

        public C0079a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.k.a qq() {
                com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.C0079a.Rn
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private final com.kwad.components.core.k.a.c Ro;
        public boolean Rp;

        public b(com.kwad.components.core.k.a.c r1) {
                r0 = this;
                r0.<init>()
                r0.Ro = r1
                return
        }

        static /* synthetic */ com.kwad.components.core.k.a.c d(com.kwad.components.core.k.a.b r0) {
                com.kwad.components.core.k.a$c r0 = r0.Ro
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void bF();
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.Rl = r0
            return
    }

    public static boolean b(com.kwad.components.core.k.a.b r0) {
            if (r0 != 0) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r0.Rp
            return r0
    }

    public static com.kwad.components.core.k.a qp() {
            com.kwad.components.core.k.a r0 = com.kwad.components.core.k.a.C0079a.qq()
            return r0
    }

    public final void a(com.kwad.components.core.k.a.b r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.core.k.a$b> r0 = r1.Rl
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r1.Rm
            if (r0 != 0) goto L12
            r0 = 1
            r1.Rm = r0
            r2.Rp = r0
        L12:
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.core.k.a$b> r0 = r1.Rl
            r0.add(r2)
            return
    }

    public final void c(com.kwad.components.core.k.a.b r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L1e
        L3:
            boolean r0 = r3.Rp
            r1 = 0
            if (r0 == 0) goto Lc
            r3.Rp = r1
            r2.Rm = r1
        Lc:
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.core.k.a$b> r0 = r2.Rl
            r0.remove(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.core.k.a$b> r3 = r2.Rl
            int r3 = r3.size()
            if (r3 != 0) goto L1a
            goto L1e
        L1a:
            boolean r3 = r2.Rm
            if (r3 == 0) goto L1f
        L1e:
            return
        L1f:
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.core.k.a$b> r3 = r2.Rl
            java.lang.Object r3 = r3.get(r1)
            com.kwad.components.core.k.a$b r3 = (com.kwad.components.core.k.a.b) r3
            r0 = 1
            r3.Rp = r0
            r2.Rm = r0
            java.util.concurrent.CopyOnWriteArrayList<com.kwad.components.core.k.a$b> r3 = r2.Rl
            java.lang.Object r3 = r3.get(r1)
            com.kwad.components.core.k.a$b r3 = (com.kwad.components.core.k.a.b) r3
            com.kwad.components.core.k.a$c r3 = com.kwad.components.core.k.a.b.d(r3)
            r3.bF()
            return
    }
}
