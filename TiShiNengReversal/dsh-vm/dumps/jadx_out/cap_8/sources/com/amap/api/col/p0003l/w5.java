package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w5 extends com.amap.api.col.p0003l.r5 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    private static java.util.concurrent.ExecutorService f4096e;

    /* renamed from: f, reason: collision with root package name */
    private static java.util.Set<java.lang.Integer> f4097f;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.ref.WeakReference<android.content.Context> f4098g;

    /* renamed from: h, reason: collision with root package name */
    private static final java.util.concurrent.ThreadFactory f4099h = null;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f4100d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.p4 f4101d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4102e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.w5 f4103g;

        a(com.amap.api.col.p0003l.w5 r1, com.amap.api.col.p0003l.p4 r2, boolean r3) {
                r0 = this;
                r0.f4103g = r1
                r0.f4101d = r2
                r0.f4102e = r3
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1c
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.p4 r1 = r2.f4101d     // Catch: java.lang.Throwable -> L19
                com.amap.api.col.p0003l.s5.e(r1)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                boolean r0 = r2.f4102e     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L1c
                com.amap.api.col.3l.w5 r0 = r2.f4103g     // Catch: java.lang.Throwable -> L1c
                android.content.Context r0 = com.amap.api.col.p0003l.w5.f(r0)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.p0003l.x5.e(r0)     // Catch: java.lang.Throwable -> L1c
                return
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.Throwable -> L1c
            L1c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.util.concurrent.ThreadFactory {
        private final java.util.concurrent.atomic.AtomicInteger a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a extends java.lang.Thread {
            final /* synthetic */ com.amap.api.col.3l.w5.b a;

            a(com.amap.api.col.3l.w5.b r1, java.lang.Runnable r2, java.lang.String r3) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2, r3)
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                    r0 = this;
                    super.run()     // Catch: java.lang.Throwable -> L3
                L3:
                    return
            }
        }

        b() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.a = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                com.amap.api.col.3l.w5$b$a r0 = new com.amap.api.col.3l.w5$b$a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "pama#"
                r1.<init>(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r3.a
                int r2 = r2.getAndIncrement()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r3, r4, r1)
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            com.amap.api.col.p0003l.w5.f4097f = r0
            com.amap.api.col.3l.w5$b r0 = new com.amap.api.col.3l.w5$b
            r0.<init>()
            com.amap.api.col.p0003l.w5.f4099h = r0
            return
    }

    private w5(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.f4100d = r4
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L3a
            r3.a = r4     // Catch: java.lang.Throwable -> L3a
            r0 = 1
            if (r4 != 0) goto L14
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r3)     // Catch: java.lang.Throwable -> L3a
            r3.f3854b = r0     // Catch: java.lang.Throwable -> L3a
            return
        L14:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "com.amap.apis.utils.core.dynamiccore"
            boolean r1 = r4.startsWith(r1)     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L35
            java.lang.String r1 = "com.amap.api"
            int r1 = r4.indexOf(r1)     // Catch: java.lang.Throwable -> L3a
            r2 = -1
            if (r1 != r2) goto L31
            java.lang.String r1 = "com.loc"
            int r4 = r4.indexOf(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == r2) goto L35
        L31:
            r4 = 0
            r3.f3854b = r4     // Catch: java.lang.Throwable -> L3a
            return
        L35:
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r3)     // Catch: java.lang.Throwable -> L3a
            r3.f3854b = r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            return
    }

    static /* synthetic */ android.content.Context f(com.amap.api.col.p0003l.w5 r0) {
            android.content.Context r0 = r0.f4100d
            return r0
    }

    public static synchronized com.amap.api.col.p0003l.w5 g(android.content.Context r3, com.amap.api.col.p0003l.p4 r4) throws com.amap.api.col.p0003l.fk {
            java.lang.Class<com.amap.api.col.3l.w5> r0 = com.amap.api.col.p0003l.w5.class
            monitor-enter(r0)
            if (r4 == 0) goto L53
            java.lang.String r1 = r4.a()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L4b
            java.lang.String r1 = ""
            java.lang.String r2 = r4.a()     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L4b
            java.util.Set<java.lang.Integer> r1 = com.amap.api.col.p0003l.w5.f4097f     // Catch: java.lang.Throwable -> L43
            int r2 = r4.hashCode()     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L43
            boolean r1 = r1.add(r2)     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L2d
            com.amap.api.col.3l.r5 r3 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L43
            com.amap.api.col.3l.w5 r3 = (com.amap.api.col.p0003l.w5) r3     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r3
        L2d:
            com.amap.api.col.3l.r5 r1 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L39
            com.amap.api.col.3l.w5 r1 = new com.amap.api.col.3l.w5     // Catch: java.lang.Throwable -> L43
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L43
            com.amap.api.col.p0003l.r5.f3853c = r1     // Catch: java.lang.Throwable -> L43
            goto L3c
        L39:
            r3 = 0
            r1.f3854b = r3     // Catch: java.lang.Throwable -> L43
        L3c:
            com.amap.api.col.3l.r5 r3 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L43
            boolean r1 = r3.f3854b     // Catch: java.lang.Throwable -> L43
            r3.c(r4, r1)     // Catch: java.lang.Throwable -> L43
        L43:
            com.amap.api.col.3l.r5 r3 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L49
            com.amap.api.col.3l.w5 r3 = (com.amap.api.col.p0003l.w5) r3     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            return r3
        L49:
            r3 = move-exception
            goto L5b
        L4b:
            com.amap.api.col.3l.fk r3 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "sdk name is invalid"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        L53:
            com.amap.api.col.3l.fk r3 = new com.amap.api.col.3l.fk     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "sdk info is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r3
    }

    public static void h(android.content.Context r1) {
            if (r1 != 0) goto L3
            goto L12
        L3:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L12
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L12
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            com.amap.api.col.p0003l.w5.f4098g = r0     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public static void i(android.content.Context r6, com.amap.api.col.p0003l.p4 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            com.amap.api.col.p0003l.x5.g(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void j(com.amap.api.col.p0003l.p4 r6, java.lang.String r7, com.amap.api.col.p0003l.fk r8) {
            if (r8 == 0) goto L17
            java.lang.String r2 = r8.c()
            java.lang.String r3 = r8.d()
            java.lang.String r4 = r8.e()
            java.lang.String r5 = r8.b()
            r0 = r6
            r1 = r7
            l(r0, r1, r2, r3, r4, r5)
        L17:
            return
    }

    public static void k(com.amap.api.col.p0003l.p4 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r4 = ""
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            l(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void l(com.amap.api.col.p0003l.p4 r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            com.amap.api.col.3l.r5 r0 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "path:"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            r0.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = ",type:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L39
            r0.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = ",gsid:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L39
            r0.append(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = ",csid:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L39
            r0.append(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = ",code:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L39
            r0.append(r7)     // Catch: java.lang.Throwable -> L39
            com.amap.api.col.3l.r5 r3 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "networkError"
            r3.b(r2, r4, r5)     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }

    public static synchronized void m() {
            java.lang.Class<com.amap.api.col.3l.w5> r0 = com.amap.api.col.p0003l.w5.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = com.amap.api.col.p0003l.w5.f4096e     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto La
            r1.shutdown()     // Catch: java.lang.Throwable -> Ld
        La:
            com.amap.api.col.p0003l.p6.d()     // Catch: java.lang.Throwable -> Ld
        Ld:
            com.amap.api.col.3l.r5 r1 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L20
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L25
            com.amap.api.col.3l.r5 r2 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L25
            if (r1 != r2) goto L20
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.a     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L20
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)     // Catch: java.lang.Throwable -> L25
        L20:
            r1 = 0
            com.amap.api.col.p0003l.r5.f3853c = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            return
        L25:
            monitor-exit(r0)
            return
    }

    public static void n(android.content.Context r6, com.amap.api.col.p0003l.p4 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            com.amap.api.col.p0003l.x5.g(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void o(com.amap.api.col.p0003l.p4 r1, java.lang.String r2, java.lang.String r3) {
            com.amap.api.col.3l.r5 r0 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L7
            r0.b(r1, r2, r3)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public static void p(java.lang.Throwable r2, java.lang.String r3, java.lang.String r4) {
            com.amap.api.col.3l.r5 r0 = com.amap.api.col.p0003l.r5.f3853c     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L8
            r1 = 1
            r0.d(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public static void q() {
            java.lang.ref.WeakReference<android.content.Context> r0 = com.amap.api.col.p0003l.w5.f4098g
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L16
            java.lang.ref.WeakReference<android.content.Context> r0 = com.amap.api.col.p0003l.w5.f4098g
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            com.amap.api.col.p0003l.s5.c(r0)
            return
        L16:
            com.amap.api.col.3l.r5 r0 = com.amap.api.col.p0003l.r5.f3853c
            if (r0 == 0) goto L1d
            r0.a()
        L1d:
            return
    }

    @java.lang.Deprecated
    public static synchronized java.util.concurrent.ExecutorService r() {
            java.lang.Class<com.amap.api.col.3l.w5> r1 = com.amap.api.col.p0003l.w5.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = com.amap.api.col.p0003l.w5.f4096e     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Ld
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
        Ld:
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L23
            r0 = 256(0x100, float:3.59E-43)
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.ThreadFactory r9 = com.amap.api.col.p0003l.w5.f4099h     // Catch: java.lang.Throwable -> L23
            r3 = 1
            r4 = 1
            r5 = 0
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.p0003l.w5.f4096e = r2     // Catch: java.lang.Throwable -> L23
        L23:
            java.util.concurrent.ExecutorService r0 = com.amap.api.col.p0003l.w5.f4096e     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return r0
        L27:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    @Override // com.amap.api.col.p0003l.r5
    protected final void a() {
            r1 = this;
            android.content.Context r0 = r1.f4100d
            com.amap.api.col.p0003l.s5.c(r0)
            return
    }

    @Override // com.amap.api.col.p0003l.r5
    protected final void b(com.amap.api.col.p0003l.p4 r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            android.content.Context r0 = r1.f4100d
            com.amap.api.col.p0003l.x5.l(r2, r0, r4, r3)
            return
    }

    @Override // com.amap.api.col.p0003l.r5
    protected final void c(com.amap.api.col.p0003l.p4 r3, boolean r4) {
            r2 = this;
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.3l.w5$a r1 = new com.amap.api.col.3l.w5$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.col.p0003l.r5
    protected final void d(java.lang.Throwable r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.content.Context r0 = r1.f4100d
            com.amap.api.col.p0003l.x5.k(r0, r2, r3, r4, r5)
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L14
        L3:
            r0 = 0
            r1 = 0
            r2.d(r4, r0, r1, r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.a
            if (r0 == 0) goto L14
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch: java.lang.Throwable -> Lf
        Lf:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.a
            r0.uncaughtException(r3, r4)
        L14:
            return
    }
}
