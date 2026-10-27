package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g2 extends com.amap.api.col.s.d2 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    private static java.util.Set<java.lang.Integer> f4456e;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.ref.WeakReference<android.content.Context> f4457f;

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.concurrent.ThreadFactory f4458g = null;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f4459d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.s.z3 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.i1 f4460b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4461c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.g2 f4462d;

        a(com.amap.api.col.s.g2 r1, com.amap.api.col.s.i1 r2, boolean r3) {
                r0 = this;
                r0.f4462d = r1
                r0.f4460b = r2
                r0.f4461c = r3
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.s.z3
        public final void a() {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1c
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.s.i1 r1 = r2.f4460b     // Catch: java.lang.Throwable -> L19
                com.amap.api.col.s.e2.e(r1)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                boolean r0 = r2.f4461c     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L1c
                com.amap.api.col.s.g2 r0 = r2.f4462d     // Catch: java.lang.Throwable -> L1c
                android.content.Context r0 = com.amap.api.col.s.g2.f(r0)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.s.h2.d(r0)     // Catch: java.lang.Throwable -> L1c
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
            final /* synthetic */ com.amap.api.col.s.g2.b a;

            a(com.amap.api.col.s.g2.b r1, java.lang.Runnable r2, java.lang.String r3) {
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
                com.amap.api.col.s.g2$b$a r0 = new com.amap.api.col.s.g2$b$a
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
            com.amap.api.col.s.g2.f4456e = r0
            com.amap.api.col.s.g2$b r0 = new com.amap.api.col.s.g2$b
            r0.<init>()
            com.amap.api.col.s.g2.f4458g = r0
            return
    }

    private g2(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.f4459d = r4
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L3a
            r3.a = r4     // Catch: java.lang.Throwable -> L3a
            r0 = 1
            if (r4 != 0) goto L14
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r3)     // Catch: java.lang.Throwable -> L3a
            r3.f4393b = r0     // Catch: java.lang.Throwable -> L3a
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
            r3.f4393b = r4     // Catch: java.lang.Throwable -> L3a
            return
        L35:
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r3)     // Catch: java.lang.Throwable -> L3a
            r3.f4393b = r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            return
    }

    static /* synthetic */ android.content.Context f(com.amap.api.col.s.g2 r0) {
            android.content.Context r0 = r0.f4459d
            return r0
    }

    public static synchronized com.amap.api.col.s.g2 g(android.content.Context r3, com.amap.api.col.s.i1 r4) throws com.amap.api.col.s.bv {
            java.lang.Class<com.amap.api.col.s.g2> r0 = com.amap.api.col.s.g2.class
            monitor-enter(r0)
            if (r4 == 0) goto L53
            java.lang.String r1 = r4.d()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L4b
            java.lang.String r1 = ""
            java.lang.String r2 = r4.d()     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L4b
            java.util.Set<java.lang.Integer> r1 = com.amap.api.col.s.g2.f4456e     // Catch: java.lang.Throwable -> L43
            int r2 = r4.hashCode()     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L43
            boolean r1 = r1.add(r2)     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L2d
            com.amap.api.col.s.d2 r3 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L43
            com.amap.api.col.s.g2 r3 = (com.amap.api.col.s.g2) r3     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r3
        L2d:
            com.amap.api.col.s.d2 r1 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L39
            com.amap.api.col.s.g2 r1 = new com.amap.api.col.s.g2     // Catch: java.lang.Throwable -> L43
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L43
            com.amap.api.col.s.d2.f4392c = r1     // Catch: java.lang.Throwable -> L43
            goto L3c
        L39:
            r3 = 0
            r1.f4393b = r3     // Catch: java.lang.Throwable -> L43
        L3c:
            com.amap.api.col.s.d2 r3 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L43
            boolean r1 = r3.f4393b     // Catch: java.lang.Throwable -> L43
            r3.c(r4, r1)     // Catch: java.lang.Throwable -> L43
        L43:
            com.amap.api.col.s.d2 r3 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L49
            com.amap.api.col.s.g2 r3 = (com.amap.api.col.s.g2) r3     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            return r3
        L49:
            r3 = move-exception
            goto L5b
        L4b:
            com.amap.api.col.s.bv r3 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "sdk name is invalid"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        L53:
            com.amap.api.col.s.bv r3 = new com.amap.api.col.s.bv     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "sdk info is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r3
    }

    public static void h(com.amap.api.col.s.i1 r6, java.lang.String r7, com.amap.api.col.s.bv r8) {
            java.lang.String r2 = r8.c()
            java.lang.String r3 = r8.d()
            java.lang.String r4 = r8.e()
            java.lang.String r5 = r8.b()
            r0 = r6
            r1 = r7
            j(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void i(com.amap.api.col.s.i1 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r4 = ""
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            j(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void j(com.amap.api.col.s.i1 r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            com.amap.api.col.s.d2 r0 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L39
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
            com.amap.api.col.s.d2 r3 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "networkError"
            r3.b(r2, r4, r5)     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }

    public static void k() {
            java.lang.ref.WeakReference<android.content.Context> r0 = com.amap.api.col.s.g2.f4457f
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L16
            java.lang.ref.WeakReference<android.content.Context> r0 = com.amap.api.col.s.g2.f4457f
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            com.amap.api.col.s.e2.c(r0)
            return
        L16:
            com.amap.api.col.s.d2 r0 = com.amap.api.col.s.d2.f4392c
            if (r0 == 0) goto L1d
            r0.a()
        L1d:
            return
    }

    public static void l(com.amap.api.col.s.i1 r1, java.lang.String r2, java.lang.String r3) {
            com.amap.api.col.s.d2 r0 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L7
            r0.b(r1, r2, r3)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public static synchronized com.amap.api.col.s.g2 n() {
            java.lang.Class<com.amap.api.col.s.g2> r0 = com.amap.api.col.s.g2.class
            monitor-enter(r0)
            com.amap.api.col.s.d2 r1 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L9
            com.amap.api.col.s.g2 r1 = (com.amap.api.col.s.g2) r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static void o(java.lang.Throwable r2, java.lang.String r3, java.lang.String r4) {
            com.amap.api.col.s.d2 r0 = com.amap.api.col.s.d2.f4392c     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L8
            r1 = 1
            r0.d(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    @Override // com.amap.api.col.s.d2
    protected final void a() {
            r1 = this;
            android.content.Context r0 = r1.f4459d
            com.amap.api.col.s.e2.c(r0)
            return
    }

    @Override // com.amap.api.col.s.d2
    protected final void b(com.amap.api.col.s.i1 r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            android.content.Context r0 = r1.f4459d
            com.amap.api.col.s.h2.h(r2, r0, r4, r3)
            return
    }

    @Override // com.amap.api.col.s.d2
    protected final void c(com.amap.api.col.s.i1 r3, boolean r4) {
            r2 = this;
            com.amap.api.col.s.y3 r0 = com.amap.api.col.s.y3.e()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.g2$a r1 = new com.amap.api.col.s.g2$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            r0.c(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.col.s.d2
    protected final void d(java.lang.Throwable r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.content.Context r0 = r1.f4459d
            com.amap.api.col.s.h2.g(r0, r2, r3, r4, r5)
            return
    }

    public final void m(java.lang.Throwable r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 1
            r1.d(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L7
        L7:
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
