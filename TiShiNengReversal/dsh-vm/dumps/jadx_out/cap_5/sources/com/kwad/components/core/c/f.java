package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {
    private java.util.Map<java.lang.Integer, com.kwad.sdk.core.response.model.AdResultData> NI;
    private java.util.concurrent.atomic.AtomicInteger NJ;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        static com.kwad.components.core.c.f NK;

        static {
                com.kwad.components.core.c.f r0 = new com.kwad.components.core.c.f
                r0.<init>()
                com.kwad.components.core.c.f.a.NK = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public f() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.NI = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.NJ = r0
            return
    }

    public static com.kwad.components.core.c.f ol() {
            com.kwad.components.core.c.f r0 = com.kwad.components.core.c.f.a.NK
            return r0
    }

    public final com.kwad.sdk.core.response.model.AdResultData d(int r2, boolean r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.response.model.AdResultData> r3 = r1.NI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.get(r0)
            com.kwad.sdk.core.response.model.AdResultData r3 = (com.kwad.sdk.core.response.model.AdResultData) r3
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.response.model.AdResultData> r0 = r1.NI
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r3
    }

    public final int l(com.kwad.sdk.core.response.model.AdResultData r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.NJ
            int r0 = r0.incrementAndGet()
            java.util.Map<java.lang.Integer, com.kwad.sdk.core.response.model.AdResultData> r1 = r3.NI
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r4)
            return r0
    }
}
