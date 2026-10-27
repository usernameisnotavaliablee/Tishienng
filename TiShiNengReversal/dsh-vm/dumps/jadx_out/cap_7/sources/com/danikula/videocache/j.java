package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
final class j {
    private final java.util.concurrent.atomic.AtomicInteger a;
    private final java.lang.String b;
    private volatile com.danikula.videocache.h c;
    private final java.util.List<com.danikula.videocache.e> d;
    private final com.danikula.videocache.e e;
    private final com.danikula.videocache.f f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a extends android.os.Handler implements com.danikula.videocache.e {
        private final java.lang.String a;
        private final java.util.List<com.danikula.videocache.e> b;

        public a(java.lang.String r2, java.util.List<com.danikula.videocache.e> r3) {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        @Override // com.danikula.videocache.e
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
                java.util.List<com.danikula.videocache.e> r0 = r5.b
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                com.danikula.videocache.e r1 = (com.danikula.videocache.e) r1
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

    public j(java.lang.String r3, com.danikula.videocache.f r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.d = r0
            java.lang.Object r1 = com.danikula.videocache.n.d(r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.b = r1
            java.lang.Object r4 = com.danikula.videocache.n.d(r4)
            com.danikula.videocache.f r4 = (com.danikula.videocache.f) r4
            r2.f = r4
            com.danikula.videocache.j$a r4 = new com.danikula.videocache.j$a
            r4.<init>(r3, r0)
            r2.e = r4
            return
    }

    private synchronized void a() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a     // Catch: java.lang.Throwable -> L12
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L12
            if (r0 > 0) goto L14
            com.danikula.videocache.h r0 = r1.c     // Catch: java.lang.Throwable -> L12
            r0.m()     // Catch: java.lang.Throwable -> L12
            r0 = 0
            r1.c = r0     // Catch: java.lang.Throwable -> L12
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

    private com.danikula.videocache.h c() throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            com.danikula.videocache.k r0 = new com.danikula.videocache.k
            java.lang.String r1 = r4.b
            com.danikula.videocache.f r2 = r4.f
            com.danikula.videocache.sourcestorage.c r2 = r2.d
            r0.<init>(r1, r2)
            com.danikula.videocache.file.b r1 = new com.danikula.videocache.file.b
            com.danikula.videocache.f r2 = r4.f
            java.lang.String r3 = r4.b
            java.io.File r2 = r2.a(r3)
            com.danikula.videocache.f r3 = r4.f
            com.danikula.videocache.file.a r3 = r3.c
            r1.<init>(r2, r3)
            com.danikula.videocache.h r2 = new com.danikula.videocache.h
            r2.<init>(r0, r1)
            com.danikula.videocache.e r0 = r4.e
            r2.t(r0)
            return r2
    }

    private synchronized void g() throws com.danikula.videocache.ProxyCacheException {
            r1 = this;
            monitor-enter(r1)
            com.danikula.videocache.h r0 = r1.c     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            com.danikula.videocache.h r0 = r1.c()     // Catch: java.lang.Throwable -> La
            goto Le
        La:
            r0 = move-exception
            goto L12
        Lc:
            com.danikula.videocache.h r0 = r1.c     // Catch: java.lang.Throwable -> La
        Le:
            r1.c = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public int b() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a
            int r0 = r0.get()
            return r0
    }

    public void d(com.danikula.videocache.g r2, java.net.Socket r3) throws com.danikula.videocache.ProxyCacheException, java.io.IOException {
            r1 = this;
            r1.g()
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a     // Catch: java.lang.Throwable -> L11
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L11
            com.danikula.videocache.h r0 = r1.c     // Catch: java.lang.Throwable -> L11
            r0.s(r2, r3)     // Catch: java.lang.Throwable -> L11
            r1.a()
            return
        L11:
            r2 = move-exception
            r1.a()
            throw r2
    }

    public void e(com.danikula.videocache.e r2) {
            r1 = this;
            java.util.List<com.danikula.videocache.e> r0 = r1.d
            r0.add(r2)
            return
    }

    public void f() {
            r2 = this;
            java.util.List<com.danikula.videocache.e> r0 = r2.d
            r0.clear()
            com.danikula.videocache.h r0 = r2.c
            if (r0 == 0) goto L16
            com.danikula.videocache.h r0 = r2.c
            r1 = 0
            r0.t(r1)
            com.danikula.videocache.h r0 = r2.c
            r0.m()
            r2.c = r1
        L16:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.a
            r1 = 0
            r0.set(r1)
            return
    }

    public void h(com.danikula.videocache.e r2) {
            r1 = this;
            java.util.List<com.danikula.videocache.e> r0 = r1.d
            r0.remove(r2)
            return
    }
}
