package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private java.util.Set<com.kwad.components.core.t.c.b> YJ;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static com.kwad.components.core.t.c YK;

        static {
                com.kwad.components.core.t.c r0 = new com.kwad.components.core.t.c
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.core.t.c.a.YK = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.t.c tb() {
                com.kwad.components.core.t.c r0 = com.kwad.components.core.t.c.a.YK
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void onPageClose();
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.YJ = r0
            return
    }

    /* synthetic */ c(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.core.t.c sZ() {
            com.kwad.components.core.t.c r0 = com.kwad.components.core.t.c.a.tb()
            return r0
    }

    public final void a(com.kwad.components.core.t.c.b r2) {
            r1 = this;
            java.util.Set<com.kwad.components.core.t.c$b> r0 = r1.YJ
            r0.add(r2)
            return
    }

    public final void b(com.kwad.components.core.t.c.b r2) {
            r1 = this;
            java.util.Set<com.kwad.components.core.t.c$b> r0 = r1.YJ
            r0.remove(r2)
            return
    }

    public final void ta() {
            r2 = this;
            java.util.Set<com.kwad.components.core.t.c$b> r0 = r2.YJ
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto L1f
        L9:
            java.util.Set<com.kwad.components.core.t.c$b> r0 = r2.YJ
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.t.c$b r1 = (com.kwad.components.core.t.c.b) r1
            r1.onPageClose()
            goto Lf
        L1f:
            return
    }
}
