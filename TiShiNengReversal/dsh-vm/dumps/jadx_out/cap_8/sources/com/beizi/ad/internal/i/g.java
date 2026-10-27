package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class g {
    private final java.util.concurrent.atomic.AtomicInteger a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f6978b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.beizi.ad.internal.i.e f6979c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.List<com.beizi.ad.internal.i.b> f6980d;

    /* renamed from: e, reason: collision with root package name */
    private final com.beizi.ad.internal.i.b f6981e;

    /* renamed from: f, reason: collision with root package name */
    private final com.beizi.ad.internal.i.c f6982f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a extends android.os.Handler implements com.beizi.ad.internal.i.b {
        private final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.List<com.beizi.ad.internal.i.b> f6983b;

        public a(java.lang.String r2, java.util.List<com.beizi.ad.internal.i.b> r3) {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                r1.a = r2
                r1.f6983b = r3
                return
        }

        @Override // com.beizi.ad.internal.i.b
        public void a(java.io.File r1, java.lang.String r2, int r3) {
                r0 = this;
                android.os.Message r2 = r0.obtainMessage()
                r2.arg1 = r3
                r2.obj = r1
                r0.sendMessage(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r6) {
                r5 = this;
                java.util.List<com.beizi.ad.internal.i.b> r0 = r5.f6983b
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                com.beizi.ad.internal.i.b r1 = (com.beizi.ad.internal.i.b) r1
                java.lang.Object r2 = r6.obj
                java.io.File r2 = (java.io.File) r2
                java.lang.String r3 = r5.a
                int r4 = r6.arg1
                r1.a(r2, r3, r4)
                goto L6
            L1e:
                return
        }
    }

    public g(java.lang.String r3, com.beizi.ad.internal.i.c r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.f6980d = r0
            java.lang.Object r1 = com.beizi.ad.internal.i.k.a(r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.f6978b = r1
            java.lang.Object r4 = com.beizi.ad.internal.i.k.a(r4)
            com.beizi.ad.internal.i.c r4 = (com.beizi.ad.internal.i.c) r4
            r2.f6982f = r4
            com.beizi.ad.internal.i.g$a r4 = new com.beizi.ad.internal.i.g$a
            r4.<init>(r3, r0)
            r2.f6981e = r4
            return
    }

    private synchronized void a() throws com.beizi.ad.internal.i.m {
            r1 = this;
            monitor-enter(r1)
            com.beizi.ad.internal.i.e r0 = r1.f6979c     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            com.beizi.ad.internal.i.e r0 = r1.c()     // Catch: java.lang.Throwable -> La
            goto Le
        La:
            r0 = move-exception
            goto L12
        Lc:
            com.beizi.ad.internal.i.e r0 = r1.f6979c     // Catch: java.lang.Throwable -> La
        Le:
            r1.f6979c = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    private synchronized void b() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a     // Catch: java.lang.Throwable -> L12
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L12
            if (r0 > 0) goto L14
            com.beizi.ad.internal.i.e r0 = r1.f6979c     // Catch: java.lang.Throwable -> L12
            r0.a()     // Catch: java.lang.Throwable -> L12
            r0 = 0
            r1.f6979c = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L16
        L14:
            monitor-exit(r1)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    private com.beizi.ad.internal.i.e c() throws com.beizi.ad.internal.i.m {
            r4 = this;
            com.beizi.ad.internal.i.h r0 = new com.beizi.ad.internal.i.h
            java.lang.String r1 = r4.f6978b
            com.beizi.ad.internal.i.c r2 = r4.f6982f
            com.beizi.ad.internal.i.b.c r2 = r2.f6959d
            r0.<init>(r1, r2)
            com.beizi.ad.internal.i.a.b r1 = new com.beizi.ad.internal.i.a.b
            com.beizi.ad.internal.i.c r2 = r4.f6982f
            java.lang.String r3 = r4.f6978b
            java.io.File r2 = r2.a(r3)
            com.beizi.ad.internal.i.c r3 = r4.f6982f
            com.beizi.ad.internal.i.a.a r3 = r3.f6958c
            r1.<init>(r2, r3)
            com.beizi.ad.internal.i.e r2 = new com.beizi.ad.internal.i.e
            r2.<init>(r0, r1)
            com.beizi.ad.internal.i.b r0 = r4.f6981e
            r2.a(r0)
            return r2
    }

    public void a(com.beizi.ad.internal.i.d r2, java.net.Socket r3) throws com.beizi.ad.internal.i.m, java.io.IOException {
            r1 = this;
            r1.a()
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a     // Catch: java.lang.Throwable -> L11
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L11
            com.beizi.ad.internal.i.e r0 = r1.f6979c     // Catch: java.lang.Throwable -> L11
            r0.a(r2, r3)     // Catch: java.lang.Throwable -> L11
            r1.b()
            return
        L11:
            r2 = move-exception
            r1.b()
            throw r2
    }
}
