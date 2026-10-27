package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x3 implements java.util.concurrent.ThreadFactory {

    /* renamed from: k, reason: collision with root package name */
    private static final int f4836k = 0;
    private static final int l = 0;
    private static final int m = 0;
    private final java.util.concurrent.atomic.AtomicLong a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ThreadFactory f4837b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.Thread.UncaughtExceptionHandler f4838c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f4839d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.Integer f4840e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.Boolean f4841f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4842g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4843h;

    /* renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> f4844i;

    /* renamed from: j, reason: collision with root package name */
    private final int f4845j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ java.lang.Runnable a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.x3 f4846b;

        a(com.amap.api.col.s.x3 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f4846b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.a     // Catch: java.lang.Throwable -> L5
                r0.run()     // Catch: java.lang.Throwable -> L5
            L5:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private java.util.concurrent.ThreadFactory a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.Thread.UncaughtExceptionHandler f4847b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f4848c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Integer f4849d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.Boolean f4850e;

        /* renamed from: f, reason: collision with root package name */
        private int f4851f;

        /* renamed from: g, reason: collision with root package name */
        private int f4852g;

        /* renamed from: h, reason: collision with root package name */
        private int f4853h;

        /* renamed from: i, reason: collision with root package name */
        private java.util.concurrent.BlockingQueue<java.lang.Runnable> f4854i;

        public b() {
                r1 = this;
                r1.<init>()
                int r0 = com.amap.api.col.s.x3.e()
                r1.f4851f = r0
                int r0 = com.amap.api.col.s.x3.f()
                r1.f4852g = r0
                r0 = 30
                r1.f4853h = r0
                return
        }

        static /* synthetic */ java.util.concurrent.ThreadFactory c(com.amap.api.col.s.x3.b r0) {
                java.util.concurrent.ThreadFactory r0 = r0.a
                return r0
        }

        static /* synthetic */ int d(com.amap.api.col.s.x3.b r0) {
                int r0 = r0.f4851f
                return r0
        }

        private void e() {
                r1 = this;
                r0 = 0
                r1.a = r0
                r1.f4847b = r0
                r1.f4848c = r0
                r1.f4849d = r0
                r1.f4850e = r0
                return
        }

        static /* synthetic */ int f(com.amap.api.col.s.x3.b r0) {
                int r0 = r0.f4853h
                return r0
        }

        static /* synthetic */ java.util.concurrent.BlockingQueue g(com.amap.api.col.s.x3.b r0) {
                java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r0.f4854i
                return r0
        }

        static /* synthetic */ java.lang.String h(com.amap.api.col.s.x3.b r0) {
                java.lang.String r0 = r0.f4848c
                return r0
        }

        static /* synthetic */ java.lang.Integer i(com.amap.api.col.s.x3.b r0) {
                java.lang.Integer r0 = r0.f4849d
                return r0
        }

        static /* synthetic */ java.lang.Boolean j(com.amap.api.col.s.x3.b r0) {
                java.lang.Boolean r0 = r0.f4850e
                return r0
        }

        static /* synthetic */ java.lang.Thread.UncaughtExceptionHandler k(com.amap.api.col.s.x3.b r0) {
                java.lang.Thread$UncaughtExceptionHandler r0 = r0.f4847b
                return r0
        }

        public final com.amap.api.col.s.x3.b a(java.lang.String r1) {
                r0 = this;
                r0.f4848c = r1
                return r0
        }

        public final com.amap.api.col.s.x3 b() {
                r2 = this;
                com.amap.api.col.s.x3 r0 = new com.amap.api.col.s.x3
                r1 = 0
                r0.<init>(r2, r1)
                r2.e()
                return r0
        }
    }

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.amap.api.col.s.x3.f4836k = r0
            int r1 = r0 + (-1)
            r2 = 4
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 2
            int r1 = java.lang.Math.max(r2, r1)
            com.amap.api.col.s.x3.l = r1
            int r0 = r0 * 2
            int r0 = r0 + 1
            com.amap.api.col.s.x3.m = r0
            return
    }

    private x3(com.amap.api.col.s.x3.b r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ThreadFactory r0 = com.amap.api.col.s.x3.b.c(r3)
            if (r0 != 0) goto L10
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r2.f4837b = r0
            goto L16
        L10:
            java.util.concurrent.ThreadFactory r0 = com.amap.api.col.s.x3.b.c(r3)
            r2.f4837b = r0
        L16:
            int r0 = com.amap.api.col.s.x3.b.d(r3)
            r2.f4842g = r0
            int r1 = com.amap.api.col.s.x3.m
            r2.f4843h = r1
            if (r1 < r0) goto L6d
            int r0 = com.amap.api.col.s.x3.b.f(r3)
            r2.f4845j = r0
            java.util.concurrent.BlockingQueue r0 = com.amap.api.col.s.x3.b.g(r3)
            if (r0 != 0) goto L38
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            r2.f4844i = r0
            goto L3e
        L38:
            java.util.concurrent.BlockingQueue r0 = com.amap.api.col.s.x3.b.g(r3)
            r2.f4844i = r0
        L3e:
            java.lang.String r0 = com.amap.api.col.s.x3.b.h(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4d
            java.lang.String r0 = "amap-threadpool"
            r2.f4839d = r0
            goto L53
        L4d:
            java.lang.String r0 = com.amap.api.col.s.x3.b.h(r3)
            r2.f4839d = r0
        L53:
            java.lang.Integer r0 = com.amap.api.col.s.x3.b.i(r3)
            r2.f4840e = r0
            java.lang.Boolean r0 = com.amap.api.col.s.x3.b.j(r3)
            r2.f4841f = r0
            java.lang.Thread$UncaughtExceptionHandler r3 = com.amap.api.col.s.x3.b.k(r3)
            r2.f4838c = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>()
            r2.a = r3
            return
        L6d:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "maxPoolSize must > corePoolSize!"
            r3.<init>(r0)
            throw r3
    }

    /* synthetic */ x3(com.amap.api.col.s.x3.b r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ int e() {
            int r0 = com.amap.api.col.s.x3.l
            return r0
    }

    static /* synthetic */ int f() {
            int r0 = com.amap.api.col.s.x3.m
            return r0
    }

    private java.util.concurrent.ThreadFactory g() {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = r1.f4837b
            return r0
    }

    private java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f4839d
            return r0
    }

    private java.lang.Boolean i() {
            r1 = this;
            java.lang.Boolean r0 = r1.f4841f
            return r0
    }

    private java.lang.Integer j() {
            r1 = this;
            java.lang.Integer r0 = r1.f4840e
            return r0
    }

    private java.lang.Thread.UncaughtExceptionHandler k() {
            r1 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f4838c
            return r0
    }

    public final int a() {
            r1 = this;
            int r0 = r1.f4842g
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.f4843h
            return r0
    }

    public final java.util.concurrent.BlockingQueue<java.lang.Runnable> c() {
            r1 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r1.f4844i
            return r0
    }

    public final int d() {
            r1 = this;
            int r0 = r1.f4845j
            return r0
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r5) {
            r4 = this;
            com.amap.api.col.s.x3$a r0 = new com.amap.api.col.s.x3$a
            r0.<init>(r4, r5)
            java.util.concurrent.ThreadFactory r0 = r4.g()
            java.lang.Thread r5 = r0.newThread(r5)
            java.lang.String r0 = r4.h()
            if (r0 == 0) goto L3f
            java.util.concurrent.atomic.AtomicLong r0 = r4.a
            long r0 = r0.incrementAndGet()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.h()
            r1.append(r2)
            java.lang.String r2 = "-%d"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = java.lang.String.format(r1, r2)
            r5.setName(r0)
        L3f:
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.k()
            if (r0 == 0) goto L4c
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.k()
            r5.setUncaughtExceptionHandler(r0)
        L4c:
            java.lang.Integer r0 = r4.j()
            if (r0 == 0) goto L5d
            java.lang.Integer r0 = r4.j()
            int r0 = r0.intValue()
            r5.setPriority(r0)
        L5d:
            java.lang.Boolean r0 = r4.i()
            if (r0 == 0) goto L6e
            java.lang.Boolean r0 = r4.i()
            boolean r0 = r0.booleanValue()
            r5.setDaemon(r0)
        L6e:
            return r5
    }
}
