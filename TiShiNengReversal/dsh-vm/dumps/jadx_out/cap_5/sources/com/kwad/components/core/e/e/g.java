package com.kwad.components.core.e.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g {
    private final java.util.List<com.kwad.components.core.e.e.f> PY;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private static final com.kwad.components.core.e.e.g PZ = null;

        static {
                com.kwad.components.core.e.e.g r0 = new com.kwad.components.core.e.e.g
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.core.e.e.g.a.PZ = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.e.e.g qb() {
                com.kwad.components.core.e.e.g r0 = com.kwad.components.core.e.e.g.a.PZ
                return r0
        }
    }

    private g() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.PY = r0
            return
    }

    /* synthetic */ g(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.core.e.e.g pY() {
            com.kwad.components.core.e.e.g r0 = com.kwad.components.core.e.e.g.a.qb()
            return r0
    }

    public final void a(com.kwad.components.core.e.e.f r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.e.e.f> r0 = r1.PY
            r0.add(r2)
            return
    }

    public final void b(com.kwad.components.core.e.e.f r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.e.e.f> r0 = r1.PY
            r0.remove(r2)
        L7:
            return
    }

    public final void pZ() {
            r2 = this;
            java.util.List<com.kwad.components.core.e.e.f> r0 = r2.PY
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.e.e.f r1 = (com.kwad.components.core.e.e.f) r1
            r1.show()
            goto L6
        L16:
            return
    }

    public final void qa() {
            r2 = this;
            java.util.List<com.kwad.components.core.e.e.f> r0 = r2.PY
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.e.e.f r1 = (com.kwad.components.core.e.e.f) r1
            r1.dismiss()
            goto L6
        L16:
            return
    }
}
