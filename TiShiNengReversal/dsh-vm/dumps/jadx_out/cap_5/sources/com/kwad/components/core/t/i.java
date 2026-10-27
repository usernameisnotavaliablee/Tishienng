package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i {
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.kwad.components.core.t.i.a> YR = null;
    public static final long YS = 0;
    private static final java.util.Map<java.lang.Integer, com.kwad.sdk.utils.bg> YT = null;
    private static java.util.Map<java.lang.Integer, java.lang.Long> YU;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private long II;
        private final com.kwad.sdk.components.t YW;
        private final java.util.concurrent.atomic.AtomicInteger YX;
        private long YY;
        private long YZ;
        private long Za;

        public a(com.kwad.sdk.components.t r3, long r4, long r6, long r8, long r10) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.YX = r0
                r2.YW = r3
                r3 = 1
                r0.set(r3)
                r2.YY = r4
                r2.II = r6
                r2.YZ = r8
                r2.Za = r10
                return
        }

        static /* synthetic */ void a(com.kwad.components.core.t.i.a r0) {
                r0.tl()
                return
        }

        static /* synthetic */ com.kwad.sdk.components.t b(com.kwad.components.core.t.i.a r0) {
                com.kwad.sdk.components.t r0 = r0.YW
                return r0
        }

        static /* synthetic */ int c(com.kwad.components.core.t.i.a r0) {
                int r0 = r0.tm()
                return r0
        }

        private void tl() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.YX
                r0.incrementAndGet()
                return
        }

        private int tm() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.YX
                int r0 = r0.decrementAndGet()
                return r0
        }

        public final long tg() {
                r2 = this;
                long r0 = r2.YY
                return r0
        }

        public final long th() {
                r2 = this;
                long r0 = r2.II
                return r0
        }

        public final long ti() {
                r2 = this;
                long r0 = r2.YZ
                return r0
        }

        public final long tj() {
                r2 = this;
                long r0 = r2.Za
                return r0
        }

        public final com.kwad.sdk.components.t tk() {
                r1 = this;
                com.kwad.sdk.components.t r0 = r1.YW
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.kwad.components.core.t.i.YR = r0
            java.lang.Long r0 = com.kwad.sdk.core.config.e.Gn()
            long r0 = r0.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.kwad.components.core.t.i.YS = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.kwad.components.core.t.i.YT = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.components.core.t.i.YU = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.sdk.components.t a(java.lang.Integer r2) {
            r0 = 0
            if (r2 == 0) goto L25
            int r1 = r2.intValue()
            if (r1 != 0) goto La
            goto L25
        La:
            e(r2)     // Catch: java.lang.Exception -> L1f
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.kwad.components.core.t.i$a> r1 = com.kwad.components.core.t.i.YR     // Catch: java.lang.Exception -> L1f
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Exception -> L1f
            com.kwad.components.core.t.i$a r2 = (com.kwad.components.core.t.i.a) r2     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L21
            com.kwad.components.core.t.i.a.a(r2)     // Catch: java.lang.Exception -> L1f
            com.kwad.sdk.components.t r2 = com.kwad.components.core.t.i.a.b(r2)     // Catch: java.lang.Exception -> L1f
            return r2
        L1f:
            r2 = move-exception
            goto L22
        L21:
            return r0
        L22:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
        L25:
            return r0
    }

    public static void a(java.lang.Integer r11, com.kwad.sdk.components.t r12, long r13, long r15, long r17, long r19) {
            if (r12 != 0) goto Lb
            if (r11 == 0) goto La
            int r0 = r11.intValue()
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            e(r11)     // Catch: java.lang.Exception -> L2c
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.kwad.components.core.t.i$a> r0 = com.kwad.components.core.t.i.YR     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = r0.get(r11)     // Catch: java.lang.Exception -> L2c
            com.kwad.components.core.t.i$a r1 = (com.kwad.components.core.t.i.a) r1     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L1c
            com.kwad.components.core.t.i.a.a(r1)     // Catch: java.lang.Exception -> L2c
            return
        L1c:
            com.kwad.components.core.t.i$a r1 = new com.kwad.components.core.t.i$a     // Catch: java.lang.Exception -> L2c
            r2 = r12
            r3 = r13
            r5 = r15
            r7 = r17
            r9 = r19
            r1.<init>(r2, r3, r5, r7, r9)     // Catch: java.lang.Exception -> L2c
            r0.put(r11, r1)     // Catch: java.lang.Exception -> L2c
            return
        L2c:
            r0 = move-exception
            r11 = r0
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r11)
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.core.t.i.a b(java.lang.Integer r2) {
            r0 = 0
            if (r2 == 0) goto L21
            int r1 = r2.intValue()
            if (r1 != 0) goto La
            goto L21
        La:
            e(r2)     // Catch: java.lang.Exception -> L1b
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.kwad.components.core.t.i$a> r1 = com.kwad.components.core.t.i.YR     // Catch: java.lang.Exception -> L1b
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Exception -> L1b
            com.kwad.components.core.t.i$a r2 = (com.kwad.components.core.t.i.a) r2     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L1d
            com.kwad.components.core.t.i.a.a(r2)     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            r2 = move-exception
            goto L1e
        L1d:
            return r0
        L1e:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
        L21:
            return r0
    }

    public static void c(java.lang.Integer r1) {
            if (r1 == 0) goto L21
            int r0 = r1.intValue()
            if (r0 != 0) goto L9
            goto L21
        L9:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.kwad.components.core.t.i$a> r0 = com.kwad.components.core.t.i.YR     // Catch: java.lang.Exception -> L1d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1d
            com.kwad.components.core.t.i$a r0 = (com.kwad.components.core.t.i.a) r0     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L21
            int r0 = com.kwad.components.core.t.i.a.c(r0)     // Catch: java.lang.Exception -> L1d
            if (r0 != 0) goto L21
            d(r1)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
        L21:
            return
    }

    private static void d(java.lang.Integer r3) {
            if (r3 == 0) goto L1b
            int r0 = r3.intValue()
            if (r0 != 0) goto L9
            goto L1b
        L9:
            e(r3)
            com.kwad.components.core.t.i$1 r0 = new com.kwad.components.core.t.i$1
            r0.<init>(r3)
            java.util.Map<java.lang.Integer, com.kwad.sdk.utils.bg> r1 = com.kwad.components.core.t.i.YT
            r1.put(r3, r0)
            long r1 = com.kwad.components.core.t.i.YS
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
        L1b:
            return
    }

    private static void e(java.lang.Integer r2) {
            java.util.Map<java.lang.Integer, com.kwad.sdk.utils.bg> r0 = com.kwad.components.core.t.i.YT
            java.lang.Object r1 = r0.get(r2)
            com.kwad.sdk.utils.bg r1 = (com.kwad.sdk.utils.bg) r1
            if (r1 == 0) goto L10
            com.kwad.sdk.utils.bw.c(r1)
            r0.remove(r2)
        L10:
            return
    }

    static /* synthetic */ java.util.concurrent.ConcurrentHashMap te() {
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.kwad.components.core.t.i$a> r0 = com.kwad.components.core.t.i.YR
            return r0
    }

    static /* synthetic */ java.util.Map tf() {
            java.util.Map<java.lang.Integer, java.lang.Long> r0 = com.kwad.components.core.t.i.YU
            return r0
    }
}
