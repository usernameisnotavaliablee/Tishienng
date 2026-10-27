package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class l<R> implements com.bumptech.glide.load.engine.h.b<R>, com.bumptech.glide.util.pool.a.f {

    /* renamed from: z, reason: collision with root package name */
    private static final com.bumptech.glide.load.engine.l.c f418z = null;
    final com.bumptech.glide.load.engine.l.e a;
    private final com.bumptech.glide.util.pool.c b;
    private final com.bumptech.glide.load.engine.p.a c;
    private final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.l<?>> d;
    private final com.bumptech.glide.load.engine.l.c e;
    private final com.bumptech.glide.load.engine.m f;
    private final com.bumptech.glide.load.engine.executor.a g;
    private final com.bumptech.glide.load.engine.executor.a h;
    private final com.bumptech.glide.load.engine.executor.a i;
    private final com.bumptech.glide.load.engine.executor.a j;
    private final java.util.concurrent.atomic.AtomicInteger k;

    /* renamed from: l, reason: collision with root package name */
    private com.bumptech.glide.load.c f419l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f420m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f421n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f422o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f423p;

    /* renamed from: q, reason: collision with root package name */
    private com.bumptech.glide.load.engine.u<?> f424q;

    /* renamed from: r, reason: collision with root package name */
    com.bumptech.glide.load.DataSource f425r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f426s;

    /* renamed from: t, reason: collision with root package name */
    com.bumptech.glide.load.engine.GlideException f427t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f428u;

    /* renamed from: v, reason: collision with root package name */
    com.bumptech.glide.load.engine.p<?> f429v;

    /* renamed from: w, reason: collision with root package name */
    private com.bumptech.glide.load.engine.h<R> f430w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f431x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f432y;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements java.lang.Runnable {
        private final com.bumptech.glide.request.i a;
        final /* synthetic */ com.bumptech.glide.load.engine.l b;

        a(com.bumptech.glide.load.engine.l r1, com.bumptech.glide.request.i r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bumptech.glide.request.i r0 = r4.a
                java.lang.Object r0 = r0.g()
                monitor-enter(r0)
                com.bumptech.glide.load.engine.l r1 = r4.b     // Catch: java.lang.Throwable -> L28
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L28
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L1e
                com.bumptech.glide.load.engine.l$e r2 = r2.a     // Catch: java.lang.Throwable -> L1e
                com.bumptech.glide.request.i r3 = r4.a     // Catch: java.lang.Throwable -> L1e
                boolean r2 = r2.d(r3)     // Catch: java.lang.Throwable -> L1e
                if (r2 == 0) goto L20
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L1e
                com.bumptech.glide.request.i r3 = r4.a     // Catch: java.lang.Throwable -> L1e
                r2.e(r3)     // Catch: java.lang.Throwable -> L1e
                goto L20
            L1e:
                r2 = move-exception
                goto L2a
            L20:
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L1e
                r2.i()     // Catch: java.lang.Throwable -> L1e
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                return
            L28:
                r1 = move-exception
                goto L2c
            L2a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
                throw r2     // Catch: java.lang.Throwable -> L28
            L2c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements java.lang.Runnable {
        private final com.bumptech.glide.request.i a;
        final /* synthetic */ com.bumptech.glide.load.engine.l b;

        b(com.bumptech.glide.load.engine.l r1, com.bumptech.glide.request.i r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bumptech.glide.request.i r0 = r4.a
                java.lang.Object r0 = r0.g()
                monitor-enter(r0)
                com.bumptech.glide.load.engine.l r1 = r4.b     // Catch: java.lang.Throwable -> L36
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L36
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.l$e r2 = r2.a     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.request.i r3 = r4.a     // Catch: java.lang.Throwable -> L2c
                boolean r2 = r2.d(r3)     // Catch: java.lang.Throwable -> L2c
                if (r2 == 0) goto L2e
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.p<?> r2 = r2.f429v     // Catch: java.lang.Throwable -> L2c
                r2.b()     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.request.i r3 = r4.a     // Catch: java.lang.Throwable -> L2c
                r2.f(r3)     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.request.i r3 = r4.a     // Catch: java.lang.Throwable -> L2c
                r2.s(r3)     // Catch: java.lang.Throwable -> L2c
                goto L2e
            L2c:
                r2 = move-exception
                goto L38
            L2e:
                com.bumptech.glide.load.engine.l r2 = r4.b     // Catch: java.lang.Throwable -> L2c
                r2.i()     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                return
            L36:
                r1 = move-exception
                goto L3a
            L38:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
                throw r2     // Catch: java.lang.Throwable -> L36
            L3a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class c {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public <R> com.bumptech.glide.load.engine.p<R> a(com.bumptech.glide.load.engine.u<R> r7, boolean r8, com.bumptech.glide.load.c r9, com.bumptech.glide.load.engine.p.a r10) {
                r6 = this;
                com.bumptech.glide.load.engine.p r0 = new com.bumptech.glide.load.engine.p
                r3 = 1
                r1 = r7
                r2 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d {
        final com.bumptech.glide.request.i a;
        final java.util.concurrent.Executor b;

        d(com.bumptech.glide.request.i r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.bumptech.glide.load.engine.l.d
                if (r0 == 0) goto Lf
                com.bumptech.glide.load.engine.l$d r2 = (com.bumptech.glide.load.engine.l.d) r2
                com.bumptech.glide.request.i r0 = r1.a
                com.bumptech.glide.request.i r2 = r2.a
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.bumptech.glide.request.i r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e implements java.lang.Iterable<com.bumptech.glide.load.engine.l.d> {
        private final java.util.List<com.bumptech.glide.load.engine.l.d> a;

        e() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 2
                r0.<init>(r1)
                r2.<init>(r0)
                return
        }

        e(java.util.List<com.bumptech.glide.load.engine.l.d> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        private static com.bumptech.glide.load.engine.l.d f(com.bumptech.glide.request.i r2) {
                com.bumptech.glide.load.engine.l$d r0 = new com.bumptech.glide.load.engine.l$d
                java.util.concurrent.Executor r1 = com.bumptech.glide.util.e.a()
                r0.<init>(r2, r1)
                return r0
        }

        void a(com.bumptech.glide.request.i r3, java.util.concurrent.Executor r4) {
                r2 = this;
                java.util.List<com.bumptech.glide.load.engine.l$d> r0 = r2.a
                com.bumptech.glide.load.engine.l$d r1 = new com.bumptech.glide.load.engine.l$d
                r1.<init>(r3, r4)
                r0.add(r1)
                return
        }

        void clear() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.l$d> r0 = r1.a
                r0.clear()
                return
        }

        boolean d(com.bumptech.glide.request.i r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.l$d> r0 = r1.a
                com.bumptech.glide.load.engine.l$d r2 = f(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        com.bumptech.glide.load.engine.l.e e() {
                r3 = this;
                com.bumptech.glide.load.engine.l$e r0 = new com.bumptech.glide.load.engine.l$e
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<com.bumptech.glide.load.engine.l$d> r2 = r3.a
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        void g(com.bumptech.glide.request.i r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.l$d> r0 = r1.a
                com.bumptech.glide.load.engine.l$d r2 = f(r2)
                r0.remove(r2)
                return
        }

        boolean isEmpty() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.l$d> r0 = r1.a
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.lang.Iterable
        @androidx.annotation.NonNull
        public java.util.Iterator<com.bumptech.glide.load.engine.l.d> iterator() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.l$d> r0 = r1.a
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        int size() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.l$d> r0 = r1.a
                int r0 = r0.size()
                return r0
        }
    }

    static {
            com.bumptech.glide.load.engine.l$c r0 = new com.bumptech.glide.load.engine.l$c
            r0.<init>()
            com.bumptech.glide.load.engine.l.f418z = r0
            return
    }

    l(com.bumptech.glide.load.engine.executor.a r10, com.bumptech.glide.load.engine.executor.a r11, com.bumptech.glide.load.engine.executor.a r12, com.bumptech.glide.load.engine.executor.a r13, com.bumptech.glide.load.engine.m r14, com.bumptech.glide.load.engine.p.a r15, androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.l<?>> r16) {
            r9 = this;
            com.bumptech.glide.load.engine.l$c r8 = com.bumptech.glide.load.engine.l.f418z
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @androidx.annotation.VisibleForTesting
    l(com.bumptech.glide.load.engine.executor.a r2, com.bumptech.glide.load.engine.executor.a r3, com.bumptech.glide.load.engine.executor.a r4, com.bumptech.glide.load.engine.executor.a r5, com.bumptech.glide.load.engine.m r6, com.bumptech.glide.load.engine.p.a r7, androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.l<?>> r8, com.bumptech.glide.load.engine.l.c r9) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.l$e r0 = new com.bumptech.glide.load.engine.l$e
            r0.<init>()
            r1.a = r0
            com.bumptech.glide.util.pool.c r0 = com.bumptech.glide.util.pool.c.a()
            r1.b = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.k = r0
            r1.g = r2
            r1.h = r3
            r1.i = r4
            r1.j = r5
            r1.f = r6
            r1.c = r7
            r1.d = r8
            r1.e = r9
            return
    }

    private com.bumptech.glide.load.engine.executor.a j() {
            r1 = this;
            boolean r0 = r1.f421n
            if (r0 == 0) goto L7
            com.bumptech.glide.load.engine.executor.a r0 = r1.i
            return r0
        L7:
            boolean r0 = r1.f422o
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.executor.a r0 = r1.j
            return r0
        Le:
            com.bumptech.glide.load.engine.executor.a r0 = r1.h
            return r0
    }

    private boolean n() {
            r1 = this;
            boolean r0 = r1.f428u
            if (r0 != 0) goto Lf
            boolean r0 = r1.f426s
            if (r0 != 0) goto Lf
            boolean r0 = r1.f431x
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private synchronized void r() {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.load.c r0 = r3.f419l     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2e
            com.bumptech.glide.load.engine.l$e r0 = r3.a     // Catch: java.lang.Throwable -> L2c
            r0.clear()     // Catch: java.lang.Throwable -> L2c
            r0 = 0
            r3.f419l = r0     // Catch: java.lang.Throwable -> L2c
            r3.f429v = r0     // Catch: java.lang.Throwable -> L2c
            r3.f424q = r0     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            r3.f428u = r1     // Catch: java.lang.Throwable -> L2c
            r3.f431x = r1     // Catch: java.lang.Throwable -> L2c
            r3.f426s = r1     // Catch: java.lang.Throwable -> L2c
            r3.f432y = r1     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.engine.h<R> r2 = r3.f430w     // Catch: java.lang.Throwable -> L2c
            r2.y(r1)     // Catch: java.lang.Throwable -> L2c
            r3.f430w = r0     // Catch: java.lang.Throwable -> L2c
            r3.f427t = r0     // Catch: java.lang.Throwable -> L2c
            r3.f425r = r0     // Catch: java.lang.Throwable -> L2c
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.l<?>> r0 = r3.d     // Catch: java.lang.Throwable -> L2c
            r0.release(r3)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r0 = move-exception
            goto L34
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    synchronized void a(com.bumptech.glide.request.i r3, java.util.concurrent.Executor r4) {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.pool.c r0 = r2.b     // Catch: java.lang.Throwable -> L1c
            r0.c()     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.l$e r0 = r2.a     // Catch: java.lang.Throwable -> L1c
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r2.f426s     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            if (r0 == 0) goto L1e
            r2.k(r1)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.l$b r0 = new com.bumptech.glide.load.engine.l$b     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r4.execute(r0)     // Catch: java.lang.Throwable -> L1c
            goto L36
        L1c:
            r3 = move-exception
            goto L38
        L1e:
            boolean r0 = r2.f428u     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L2e
            r2.k(r1)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.l$a r0 = new com.bumptech.glide.load.engine.l$a     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r4.execute(r0)     // Catch: java.lang.Throwable -> L1c
            goto L36
        L2e:
            boolean r3 = r2.f431x     // Catch: java.lang.Throwable -> L1c
            r3 = r3 ^ r1
            java.lang.String r4 = "Cannot add callbacks to a cancelled EngineJob"
            com.bumptech.glide.util.k.a(r3, r4)     // Catch: java.lang.Throwable -> L1c
        L36:
            monitor-exit(r2)
            return
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(com.bumptech.glide.load.engine.GlideException r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f427t = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            r0.o()
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(com.bumptech.glide.load.engine.u<R> r1, com.bumptech.glide.load.DataSource r2, boolean r3) {
            r0 = this;
            monitor-enter(r0)
            r0.f424q = r1     // Catch: java.lang.Throwable -> Lc
            r0.f425r = r2     // Catch: java.lang.Throwable -> Lc
            r0.f432y = r3     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            r0.p()
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void d(com.bumptech.glide.load.engine.h<?> r2) {
            r1 = this;
            com.bumptech.glide.load.engine.executor.a r0 = r1.j()
            r0.execute(r2)
            return
    }

    @androidx.annotation.GuardedBy("this")
    void e(com.bumptech.glide.request.i r2) {
            r1 = this;
            com.bumptech.glide.load.engine.GlideException r0 = r1.f427t     // Catch: java.lang.Throwable -> L6
            r2.b(r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            com.bumptech.glide.load.engine.b r0 = new com.bumptech.glide.load.engine.b
            r0.<init>(r2)
            throw r0
    }

    @androidx.annotation.GuardedBy("this")
    void f(com.bumptech.glide.request.i r4) {
            r3 = this;
            com.bumptech.glide.load.engine.p<?> r0 = r3.f429v     // Catch: java.lang.Throwable -> La
            com.bumptech.glide.load.DataSource r1 = r3.f425r     // Catch: java.lang.Throwable -> La
            boolean r2 = r3.f432y     // Catch: java.lang.Throwable -> La
            r4.c(r0, r1, r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r4 = move-exception
            com.bumptech.glide.load.engine.b r0 = new com.bumptech.glide.load.engine.b
            r0.<init>(r4)
            throw r0
    }

    void g() {
            r2 = this;
            boolean r0 = r2.n()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            r2.f431x = r0
            com.bumptech.glide.load.engine.h<R> r0 = r2.f430w
            r0.a()
            com.bumptech.glide.load.engine.m r0 = r2.f
            com.bumptech.glide.load.c r1 = r2.f419l
            r0.b(r2, r1)
            return
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @androidx.annotation.NonNull
    public com.bumptech.glide.util.pool.c h() {
            r1 = this;
            com.bumptech.glide.util.pool.c r0 = r1.b
            return r0
    }

    void i() {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.util.pool.c r0 = r3.b     // Catch: java.lang.Throwable -> L27
            r0.c()     // Catch: java.lang.Throwable -> L27
            boolean r0 = r3.n()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "Not yet complete!"
            com.bumptech.glide.util.k.a(r0, r1)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.atomic.AtomicInteger r0 = r3.k     // Catch: java.lang.Throwable -> L27
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L27
            if (r0 < 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r2 = "Can't decrement below 0"
            com.bumptech.glide.util.k.a(r1, r2)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            com.bumptech.glide.load.engine.p<?> r0 = r3.f429v     // Catch: java.lang.Throwable -> L27
            r3.r()     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r0 = move-exception
            goto L31
        L29:
            r0 = 0
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L30
            r0.e()
        L30:
            return
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    synchronized void k(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.n()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Not yet complete!"
            com.bumptech.glide.util.k.a(r0, r1)     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.atomic.AtomicInteger r0 = r2.k     // Catch: java.lang.Throwable -> L1a
            int r3 = r0.getAndAdd(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            com.bumptech.glide.load.engine.p<?> r3 = r2.f429v     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            r3.b()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L1e
        L1c:
            monitor-exit(r2)
            return
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    @androidx.annotation.VisibleForTesting
    synchronized com.bumptech.glide.load.engine.l<R> l(com.bumptech.glide.load.c r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            monitor-enter(r0)
            r0.f419l = r1     // Catch: java.lang.Throwable -> Ld
            r0.f420m = r2     // Catch: java.lang.Throwable -> Ld
            r0.f421n = r3     // Catch: java.lang.Throwable -> Ld
            r0.f422o = r4     // Catch: java.lang.Throwable -> Ld
            r0.f423p = r5     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r0
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    synchronized boolean m() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f431x     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    void o() {
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.util.pool.c r0 = r4.b     // Catch: java.lang.Throwable -> Lf
            r0.c()     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r4.f431x     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r4.r()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            goto L68
        L11:
            com.bumptech.glide.load.engine.l$e r0 = r4.a     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L60
            boolean r0 = r4.f428u     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L58
            r0 = 1
            r4.f428u = r0     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.c r1 = r4.f419l     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.l$e r2 = r4.a     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.l$e r2 = r2.e()     // Catch: java.lang.Throwable -> Lf
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Lf
            int r3 = r3 + r0
            r4.k(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.m r0 = r4.f
            r3 = 0
            r0.a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.l$d r1 = (com.bumptech.glide.load.engine.l.d) r1
            java.util.concurrent.Executor r2 = r1.b
            com.bumptech.glide.load.engine.l$a r3 = new com.bumptech.glide.load.engine.l$a
            com.bumptech.glide.request.i r1 = r1.a
            r3.<init>(r4, r1)
            r2.execute(r3)
            goto L3b
        L54:
            r4.i()
            return
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    void p() {
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.util.pool.c r0 = r5.b     // Catch: java.lang.Throwable -> L14
            r0.c()     // Catch: java.lang.Throwable -> L14
            boolean r0 = r5.f431x     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.bumptech.glide.load.engine.u<?> r0 = r5.f424q     // Catch: java.lang.Throwable -> L14
            r0.recycle()     // Catch: java.lang.Throwable -> L14
            r5.r()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            goto L7e
        L16:
            com.bumptech.glide.load.engine.l$e r0 = r5.a     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L76
            boolean r0 = r5.f426s     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L6e
            com.bumptech.glide.load.engine.l$c r0 = r5.e     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.u<?> r1 = r5.f424q     // Catch: java.lang.Throwable -> L14
            boolean r2 = r5.f420m     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.c r3 = r5.f419l     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.p$a r4 = r5.c     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.p r0 = r0.a(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L14
            r5.f429v = r0     // Catch: java.lang.Throwable -> L14
            r0 = 1
            r5.f426s = r0     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.l$e r1 = r5.a     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.l$e r1 = r1.e()     // Catch: java.lang.Throwable -> L14
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L14
            int r2 = r2 + r0
            r5.k(r2)     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.c r0 = r5.f419l     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.p<?> r2 = r5.f429v     // Catch: java.lang.Throwable -> L14
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.m r3 = r5.f
            r3.a(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.l$d r1 = (com.bumptech.glide.load.engine.l.d) r1
            java.util.concurrent.Executor r2 = r1.b
            com.bumptech.glide.load.engine.l$b r3 = new com.bumptech.glide.load.engine.l$b
            com.bumptech.glide.request.i r1 = r1.a
            r3.<init>(r5, r1)
            r2.execute(r3)
            goto L51
        L6a:
            r5.i()
            return
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L76:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L7e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    boolean q() {
            r1 = this;
            boolean r0 = r1.f423p
            return r0
    }

    synchronized void s(com.bumptech.glide.request.i r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.util.pool.c r0 = r1.b     // Catch: java.lang.Throwable -> L1f
            r0.c()     // Catch: java.lang.Throwable -> L1f
            com.bumptech.glide.load.engine.l$e r0 = r1.a     // Catch: java.lang.Throwable -> L1f
            r0.g(r2)     // Catch: java.lang.Throwable -> L1f
            com.bumptech.glide.load.engine.l$e r2 = r1.a     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L2c
            r1.g()     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1.f426s     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L21
            boolean r2 = r1.f428u     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L2c
            goto L21
        L1f:
            r2 = move-exception
            goto L2e
        L21:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.k     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L2c
            r1.r()     // Catch: java.lang.Throwable -> L1f
        L2c:
            monitor-exit(r1)
            return
        L2e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    public synchronized void t(com.bumptech.glide.load.engine.h<R> r2) {
            r1 = this;
            monitor-enter(r1)
            r1.f430w = r2     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r2.I()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.executor.a r0 = r1.g     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r2 = move-exception
            goto L17
        Le:
            com.bumptech.glide.load.engine.executor.a r0 = r1.j()     // Catch: java.lang.Throwable -> Lc
        L12:
            r0.execute(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
