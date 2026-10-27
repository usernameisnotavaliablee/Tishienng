package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a8 implements java.util.concurrent.ThreadFactory {

    /* renamed from: k, reason: collision with root package name */
    private static final int f2965k = 0;
    private static final int l = 0;
    private static final int m = 0;
    private final java.util.concurrent.atomic.AtomicLong a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ThreadFactory f2966b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.Thread.UncaughtExceptionHandler f2967c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f2968d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.Integer f2969e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.Boolean f2970f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2971g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2972h;

    /* renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> f2973i;

    /* renamed from: j, reason: collision with root package name */
    private final int f2974j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ java.lang.Runnable a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.a8 f2975b;

        a(com.amap.api.col.p0003l.a8 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f2975b = r1
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
        private java.lang.Thread.UncaughtExceptionHandler f2976b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f2977c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Integer f2978d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.Boolean f2979e;

        /* renamed from: f, reason: collision with root package name */
        private int f2980f;

        /* renamed from: g, reason: collision with root package name */
        private int f2981g;

        /* renamed from: h, reason: collision with root package name */
        private int f2982h;

        /* renamed from: i, reason: collision with root package name */
        private java.util.concurrent.BlockingQueue<java.lang.Runnable> f2983i;

        public b() {
                r1 = this;
                r1.<init>()
                int r0 = com.amap.api.col.p0003l.a8.e()
                r1.f2980f = r0
                int r0 = com.amap.api.col.p0003l.a8.f()
                r1.f2981g = r0
                r0 = 30
                r1.f2982h = r0
                return
        }

        static /* synthetic */ java.util.concurrent.ThreadFactory f(com.amap.api.col.3l.a8.b r0) {
                java.util.concurrent.ThreadFactory r0 = r0.a
                return r0
        }

        static /* synthetic */ int g(com.amap.api.col.3l.a8.b r0) {
                int r0 = r0.f2980f
                return r0
        }

        static /* synthetic */ int i(com.amap.api.col.3l.a8.b r0) {
                int r0 = r0.f2982h
                return r0
        }

        private void j() {
                r1 = this;
                r0 = 0
                r1.a = r0
                r1.f2976b = r0
                r1.f2977c = r0
                r1.f2978d = r0
                r1.f2979e = r0
                return
        }

        static /* synthetic */ java.util.concurrent.BlockingQueue k(com.amap.api.col.3l.a8.b r0) {
                java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r0.f2983i
                return r0
        }

        static /* synthetic */ java.lang.String l(com.amap.api.col.3l.a8.b r0) {
                java.lang.String r0 = r0.f2977c
                return r0
        }

        static /* synthetic */ java.lang.Integer m(com.amap.api.col.3l.a8.b r0) {
                java.lang.Integer r0 = r0.f2978d
                return r0
        }

        static /* synthetic */ java.lang.Boolean n(com.amap.api.col.3l.a8.b r0) {
                java.lang.Boolean r0 = r0.f2979e
                return r0
        }

        static /* synthetic */ java.lang.Thread.UncaughtExceptionHandler o(com.amap.api.col.3l.a8.b r0) {
                java.lang.Thread$UncaughtExceptionHandler r0 = r0.f2976b
                return r0
        }

        public final com.amap.api.col.3l.a8.b a() {
                r1 = this;
                r0 = 1
                r1.f2980f = r0
                return r1
        }

        public final com.amap.api.col.3l.a8.b b(int r2) {
                r1 = this;
                int r0 = r1.f2980f
                if (r0 <= 0) goto L7
                r1.f2981g = r2
                return r1
            L7:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "corePoolSize  must > 0!"
                r2.<init>(r0)
                throw r2
        }

        public final com.amap.api.col.3l.a8.b c(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.f2977c = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Naming pattern must not be null!"
                r2.<init>(r0)
                throw r2
        }

        public final com.amap.api.col.3l.a8.b d(java.lang.Thread.UncaughtExceptionHandler r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.f2976b = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Uncaught exception handler must not be null!"
                r2.<init>(r0)
                throw r2
        }

        public final com.amap.api.col.3l.a8.b e(java.util.concurrent.BlockingQueue<java.lang.Runnable> r1) {
                r0 = this;
                r0.f2983i = r1
                return r0
        }

        public final com.amap.api.col.p0003l.a8 h() {
                r2 = this;
                com.amap.api.col.3l.a8 r0 = new com.amap.api.col.3l.a8
                r1 = 0
                r0.<init>(r2, r1)
                r2.j()
                return r0
        }
    }

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.amap.api.col.p0003l.a8.f2965k = r0
            int r1 = r0 + (-1)
            r2 = 4
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 2
            int r1 = java.lang.Math.max(r2, r1)
            com.amap.api.col.p0003l.a8.l = r1
            int r0 = r0 * 2
            int r0 = r0 + 1
            com.amap.api.col.p0003l.a8.m = r0
            return
    }

    private a8(com.amap.api.col.3l.a8.b r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ThreadFactory r0 = com.amap.api.col.3l.a8.b.f(r3)
            if (r0 != 0) goto L10
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r2.f2966b = r0
            goto L16
        L10:
            java.util.concurrent.ThreadFactory r0 = com.amap.api.col.3l.a8.b.f(r3)
            r2.f2966b = r0
        L16:
            int r0 = com.amap.api.col.3l.a8.b.g(r3)
            r2.f2971g = r0
            int r1 = com.amap.api.col.p0003l.a8.m
            r2.f2972h = r1
            if (r1 < r0) goto L6d
            int r0 = com.amap.api.col.3l.a8.b.i(r3)
            r2.f2974j = r0
            java.util.concurrent.BlockingQueue r0 = com.amap.api.col.3l.a8.b.k(r3)
            if (r0 != 0) goto L38
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            r2.f2973i = r0
            goto L3e
        L38:
            java.util.concurrent.BlockingQueue r0 = com.amap.api.col.3l.a8.b.k(r3)
            r2.f2973i = r0
        L3e:
            java.lang.String r0 = com.amap.api.col.3l.a8.b.l(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4d
            java.lang.String r0 = "amap-threadpool"
            r2.f2968d = r0
            goto L53
        L4d:
            java.lang.String r0 = com.amap.api.col.3l.a8.b.l(r3)
            r2.f2968d = r0
        L53:
            java.lang.Integer r0 = com.amap.api.col.3l.a8.b.m(r3)
            r2.f2969e = r0
            java.lang.Boolean r0 = com.amap.api.col.3l.a8.b.n(r3)
            r2.f2970f = r0
            java.lang.Thread$UncaughtExceptionHandler r3 = com.amap.api.col.3l.a8.b.o(r3)
            r2.f2967c = r3
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

    /* synthetic */ a8(com.amap.api.col.3l.a8.b r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ int e() {
            int r0 = com.amap.api.col.p0003l.a8.l
            return r0
    }

    static /* synthetic */ int f() {
            int r0 = com.amap.api.col.p0003l.a8.m
            return r0
    }

    private java.util.concurrent.ThreadFactory g() {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = r1.f2966b
            return r0
    }

    private java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f2968d
            return r0
    }

    private java.lang.Boolean i() {
            r1 = this;
            java.lang.Boolean r0 = r1.f2970f
            return r0
    }

    private java.lang.Integer j() {
            r1 = this;
            java.lang.Integer r0 = r1.f2969e
            return r0
    }

    private java.lang.Thread.UncaughtExceptionHandler k() {
            r1 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f2967c
            return r0
    }

    public final int a() {
            r1 = this;
            int r0 = r1.f2971g
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.f2972h
            return r0
    }

    public final java.util.concurrent.BlockingQueue<java.lang.Runnable> c() {
            r1 = this;
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r0 = r1.f2973i
            return r0
    }

    public final int d() {
            r1 = this;
            int r0 = r1.f2974j
            return r0
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r5) {
            r4 = this;
            com.amap.api.col.3l.a8$a r0 = new com.amap.api.col.3l.a8$a
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
