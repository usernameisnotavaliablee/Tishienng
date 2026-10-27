package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r2 implements java.io.Closeable {
    static final java.util.regex.Pattern o = null;
    public static final java.nio.charset.Charset p = null;
    static final java.nio.charset.Charset q = null;
    private static final java.util.concurrent.ThreadFactory r = null;
    static java.util.concurrent.ThreadPoolExecutor s;
    private static final java.io.OutputStream t = null;
    private final java.io.File a;

    /* renamed from: b, reason: collision with root package name */
    private final java.io.File f4645b;

    /* renamed from: c, reason: collision with root package name */
    private final java.io.File f4646c;

    /* renamed from: d, reason: collision with root package name */
    private final java.io.File f4647d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4648e;

    /* renamed from: f, reason: collision with root package name */
    private long f4649f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4650g;

    /* renamed from: h, reason: collision with root package name */
    private long f4651h;

    /* renamed from: i, reason: collision with root package name */
    private java.io.Writer f4652i;

    /* renamed from: j, reason: collision with root package name */
    private int f4653j;

    /* renamed from: k, reason: collision with root package name */
    private final java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2.f> f4654k;
    private int l;
    private long m;
    private final java.util.concurrent.Callable<java.lang.Void> n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.util.concurrent.ThreadFactory {
        private final java.util.concurrent.atomic.AtomicInteger a;

        a() {
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
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "disklrucache#"
                r1.<init>(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r3.a
                int r2 = r2.getAndIncrement()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r4, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.util.concurrent.Callable<java.lang.Void> {
        final /* synthetic */ com.amap.api.col.s.r2 a;

        b(com.amap.api.col.s.r2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        private java.lang.Void a() throws java.lang.Exception {
                r3 = this;
                com.amap.api.col.s.r2 r0 = r3.a
                monitor-enter(r0)
                com.amap.api.col.s.r2 r1 = r3.a     // Catch: java.lang.Throwable -> Le
                java.io.Writer r1 = com.amap.api.col.s.r2.d(r1)     // Catch: java.lang.Throwable -> Le
                r2 = 0
                if (r1 != 0) goto L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r2
            Le:
                r1 = move-exception
                goto L29
            L10:
                com.amap.api.col.s.r2 r1 = r3.a     // Catch: java.lang.Throwable -> Le
                com.amap.api.col.s.r2.m(r1)     // Catch: java.lang.Throwable -> Le
                com.amap.api.col.s.r2 r1 = r3.a     // Catch: java.lang.Throwable -> Le
                boolean r1 = com.amap.api.col.s.r2.p(r1)     // Catch: java.lang.Throwable -> Le
                if (r1 == 0) goto L27
                com.amap.api.col.s.r2 r1 = r3.a     // Catch: java.lang.Throwable -> Le
                com.amap.api.col.s.r2.t(r1)     // Catch: java.lang.Throwable -> Le
                com.amap.api.col.s.r2 r1 = r3.a     // Catch: java.lang.Throwable -> Le
                com.amap.api.col.s.r2.u(r1)     // Catch: java.lang.Throwable -> Le
            L27:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r2
            L29:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r1
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Void call() throws java.lang.Exception {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c extends java.io.OutputStream {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.OutputStream
        public final void write(int r1) throws java.io.IOException {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class d {
        private final com.amap.api.col.s.r2.f a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f4655b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4656c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4657d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.r2 f4658e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class a extends java.io.FilterOutputStream {
            final /* synthetic */ com.amap.api.col.s.r2.d a;

            private a(com.amap.api.col.s.r2.d r1, java.io.OutputStream r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    return
            }

            /* synthetic */ a(com.amap.api.col.s.r2.d r1, java.io.OutputStream r2, byte r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.close()     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.amap.api.col.s.r2$d r0 = r1.a
                    com.amap.api.col.s.r2.d.f(r0)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.flush()     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.amap.api.col.s.r2$d r0 = r1.a
                    com.amap.api.col.s.r2.d.f(r0)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int r2) {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.write(r2)     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.amap.api.col.s.r2$d r2 = r1.a
                    com.amap.api.col.s.r2.d.f(r2)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] r2, int r3, int r4) {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.write(r2, r3, r4)     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.amap.api.col.s.r2$d r2 = r1.a
                    com.amap.api.col.s.r2.d.f(r2)
                    return
            }
        }

        private d(com.amap.api.col.s.r2 r1, com.amap.api.col.s.r2.f r2) {
                r0 = this;
                r0.f4658e = r1
                r0.<init>()
                r0.a = r2
                boolean r2 = com.amap.api.col.s.r2.f.l(r2)
                if (r2 == 0) goto Lf
                r1 = 0
                goto L15
            Lf:
                int r1 = com.amap.api.col.s.r2.x(r1)
                boolean[] r1 = new boolean[r1]
            L15:
                r0.f4655b = r1
                return
        }

        /* synthetic */ d(com.amap.api.col.s.r2 r1, com.amap.api.col.s.r2.f r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ com.amap.api.col.s.r2.f a(com.amap.api.col.s.r2.d r0) {
                com.amap.api.col.s.r2$f r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean[] d(com.amap.api.col.s.r2.d r0) {
                boolean[] r0 = r0.f4655b
                return r0
        }

        static /* synthetic */ boolean f(com.amap.api.col.s.r2.d r1) {
                r0 = 1
                r1.f4656c = r0
                return r0
        }

        public final java.io.OutputStream b() throws java.io.IOException {
                r4 = this;
                com.amap.api.col.s.r2 r0 = r4.f4658e
                int r0 = com.amap.api.col.s.r2.x(r0)
                if (r0 <= 0) goto L53
                com.amap.api.col.s.r2 r0 = r4.f4658e
                monitor-enter(r0)
                com.amap.api.col.s.r2$f r1 = r4.a     // Catch: java.lang.Throwable -> L22
                com.amap.api.col.s.r2$d r1 = com.amap.api.col.s.r2.f.h(r1)     // Catch: java.lang.Throwable -> L22
                if (r1 != r4) goto L4b
                com.amap.api.col.s.r2$f r1 = r4.a     // Catch: java.lang.Throwable -> L22
                boolean r1 = com.amap.api.col.s.r2.f.l(r1)     // Catch: java.lang.Throwable -> L22
                r2 = 0
                if (r1 != 0) goto L24
                boolean[] r1 = r4.f4655b     // Catch: java.lang.Throwable -> L22
                r3 = 1
                r1[r2] = r3     // Catch: java.lang.Throwable -> L22
                goto L24
            L22:
                r1 = move-exception
                goto L51
            L24:
                com.amap.api.col.s.r2$f r1 = r4.a     // Catch: java.lang.Throwable -> L22
                java.io.File r1 = r1.i(r2)     // Catch: java.lang.Throwable -> L22
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L30
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L30
                goto L3e
            L30:
                com.amap.api.col.s.r2 r3 = r4.f4658e     // Catch: java.lang.Throwable -> L22
                java.io.File r3 = com.amap.api.col.s.r2.z(r3)     // Catch: java.lang.Throwable -> L22
                r3.mkdirs()     // Catch: java.lang.Throwable -> L22
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L45
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L45
            L3e:
                com.amap.api.col.s.r2$d$a r1 = new com.amap.api.col.s.r2$d$a     // Catch: java.lang.Throwable -> L22
                r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return r1
            L45:
                java.io.OutputStream r1 = com.amap.api.col.s.r2.s()     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return r1
            L4b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
                r1.<init>()     // Catch: java.lang.Throwable -> L22
                throw r1     // Catch: java.lang.Throwable -> L22
            L51:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                throw r1
            L53:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected index 0 to be greater than 0 and less than the maximum value count of "
                r1.<init>(r2)
                com.amap.api.col.s.r2 r2 = r4.f4658e
                int r2 = com.amap.api.col.s.r2.x(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final void c() throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.f4656c
                r1 = 1
                if (r0 == 0) goto L17
                com.amap.api.col.s.r2 r0 = r3.f4658e
                r2 = 0
                com.amap.api.col.s.r2.g(r0, r3, r2)
                com.amap.api.col.s.r2 r0 = r3.f4658e
                com.amap.api.col.s.r2$f r2 = r3.a
                java.lang.String r2 = com.amap.api.col.s.r2.f.k(r2)
                r0.q(r2)
                goto L1c
            L17:
                com.amap.api.col.s.r2 r0 = r3.f4658e
                com.amap.api.col.s.r2.g(r0, r3, r1)
            L1c:
                r3.f4657d = r1
                return
        }

        public final void e() throws java.io.IOException {
                r2 = this;
                com.amap.api.col.s.r2 r0 = r2.f4658e
                r1 = 0
                com.amap.api.col.s.r2.g(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class e implements java.io.Closeable {
        private final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private final long f4659b;

        /* renamed from: c, reason: collision with root package name */
        private final java.io.InputStream[] f4660c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f4661d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.r2 f4662e;

        private e(com.amap.api.col.s.r2 r1, java.lang.String r2, long r3, java.io.InputStream[] r5, long[] r6) {
                r0 = this;
                r0.f4662e = r1
                r0.<init>()
                r0.a = r2
                r0.f4659b = r3
                r0.f4660c = r5
                r0.f4661d = r6
                return
        }

        /* synthetic */ e(com.amap.api.col.s.r2 r1, java.lang.String r2, long r3, java.io.InputStream[] r5, long[] r6, byte r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5, r6)
                return
        }

        public final java.io.InputStream a() {
                r2 = this;
                java.io.InputStream[] r0 = r2.f4660c
                r1 = 0
                r0 = r0[r1]
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
                r4 = this;
                java.io.InputStream[] r0 = r4.f4660c
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                com.amap.api.col.s.r2.h(r3)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class f {
        private final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f4663b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4664c;

        /* renamed from: d, reason: collision with root package name */
        private com.amap.api.col.s.r2.d f4665d;

        /* renamed from: e, reason: collision with root package name */
        private long f4666e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.r2 f4667f;

        private f(com.amap.api.col.s.r2 r1, java.lang.String r2) {
                r0 = this;
                r0.f4667f = r1
                r0.<init>()
                r0.a = r2
                int r1 = com.amap.api.col.s.r2.x(r1)
                long[] r1 = new long[r1]
                r0.f4663b = r1
                return
        }

        /* synthetic */ f(com.amap.api.col.s.r2 r1, java.lang.String r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ long a(com.amap.api.col.s.r2.f r0, long r1) {
                r0.f4666e = r1
                return r1
        }

        static /* synthetic */ com.amap.api.col.s.r2.d b(com.amap.api.col.s.r2.f r0, com.amap.api.col.s.r2.d r1) {
                r0.f4665d = r1
                return r1
        }

        private static java.io.IOException d(java.lang.String[] r3) throws java.io.IOException {
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected journal line: "
                r1.<init>(r2)
                java.lang.String r3 = java.util.Arrays.toString(r3)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        static /* synthetic */ void f(com.amap.api.col.s.r2.f r4, java.lang.String[] r5) throws java.io.IOException {
                int r0 = r5.length
                com.amap.api.col.s.r2 r1 = r4.f4667f
                int r1 = com.amap.api.col.s.r2.x(r1)
                if (r0 != r1) goto L20
                r0 = 0
            La:
                int r1 = r5.length     // Catch: java.lang.NumberFormatException -> L1b
                if (r0 >= r1) goto L1a
                long[] r1 = r4.f4663b     // Catch: java.lang.NumberFormatException -> L1b
                r2 = r5[r0]     // Catch: java.lang.NumberFormatException -> L1b
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1b
                r1[r0] = r2     // Catch: java.lang.NumberFormatException -> L1b
                int r0 = r0 + 1
                goto La
            L1a:
                return
            L1b:
                java.io.IOException r4 = d(r5)
                throw r4
            L20:
                java.io.IOException r4 = d(r5)
                throw r4
        }

        static /* synthetic */ boolean g(com.amap.api.col.s.r2.f r1) {
                r0 = 1
                r1.f4664c = r0
                return r0
        }

        static /* synthetic */ com.amap.api.col.s.r2.d h(com.amap.api.col.s.r2.f r0) {
                com.amap.api.col.s.r2$d r0 = r0.f4665d
                return r0
        }

        static /* synthetic */ long[] j(com.amap.api.col.s.r2.f r0) {
                long[] r0 = r0.f4663b
                return r0
        }

        static /* synthetic */ java.lang.String k(com.amap.api.col.s.r2.f r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean l(com.amap.api.col.s.r2.f r0) {
                boolean r0 = r0.f4664c
                return r0
        }

        static /* synthetic */ long m(com.amap.api.col.s.r2.f r2) {
                long r0 = r2.f4666e
                return r0
        }

        public final java.io.File c(int r5) {
                r4 = this;
                java.io.File r0 = new java.io.File
                com.amap.api.col.s.r2 r1 = r4.f4667f
                java.io.File r1 = com.amap.api.col.s.r2.z(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r4.a
                r2.append(r3)
                java.lang.String r3 = "."
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0.<init>(r1, r5)
                return r0
        }

        public final java.lang.String e() throws java.io.IOException {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long[] r1 = r7.f4663b
                int r2 = r1.length
                r3 = 0
            L9:
                if (r3 >= r2) goto L18
                r4 = r1[r3]
                r6 = 32
                r0.append(r6)
                r0.append(r4)
                int r3 = r3 + 1
                goto L9
            L18:
                java.lang.String r0 = r0.toString()
                return r0
        }

        public final java.io.File i(int r5) {
                r4 = this;
                java.io.File r0 = new java.io.File
                com.amap.api.col.s.r2 r1 = r4.f4667f
                java.io.File r1 = com.amap.api.col.s.r2.z(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r4.a
                r2.append(r3)
                java.lang.String r3 = "."
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = ".tmp"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0.<init>(r1, r5)
                return r0
        }
    }

    static {
            java.lang.String r0 = "[a-z0-9_-]{1,120}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.amap.api.col.s.r2.o = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.amap.api.col.s.r2.p = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.amap.api.col.s.r2.q = r0
            com.amap.api.col.s.r2$a r8 = new com.amap.api.col.s.r2$a
            r8.<init>()
            com.amap.api.col.s.r2.r = r8
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            r2 = 0
            r3 = 1
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)
            com.amap.api.col.s.r2.s = r1
            com.amap.api.col.s.r2$c r0 = new com.amap.api.col.s.r2$c
            r0.<init>()
            com.amap.api.col.s.r2.t = r0
            return
    }

    private r2(java.io.File r7, long r8) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f4651h = r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r6.f4653j = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 0
            r4 = 1061158912(0x3f400000, float:0.75)
            r5 = 1
            r2.<init>(r3, r4, r5)
            r6.f4654k = r2
            r6.m = r0
            com.amap.api.col.s.r2$b r0 = new com.amap.api.col.s.r2$b
            r0.<init>(r6)
            r6.n = r0
            r6.a = r7
            r6.f4648e = r5
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal"
            r0.<init>(r7, r1)
            r6.f4645b = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.tmp"
            r0.<init>(r7, r1)
            r6.f4646c = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r7, r1)
            r6.f4647d = r0
            r6.f4650g = r5
            r6.f4649f = r8
            return
    }

    private void A() throws java.io.IOException {
            r8 = this;
            java.io.File r0 = r8.f4646c
            i(r0)
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r8.f4654k
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            com.amap.api.col.s.r2$f r1 = (com.amap.api.col.s.r2.f) r1
            com.amap.api.col.s.r2$d r2 = com.amap.api.col.s.r2.f.h(r1)
            r3 = 0
            if (r2 != 0) goto L34
        L22:
            int r2 = r8.f4650g
            if (r3 >= r2) goto Lf
            long r4 = r8.f4651h
            long[] r2 = com.amap.api.col.s.r2.f.j(r1)
            r6 = r2[r3]
            long r4 = r4 + r6
            r8.f4651h = r4
            int r3 = r3 + 1
            goto L22
        L34:
            r2 = 0
            com.amap.api.col.s.r2.f.b(r1, r2)
        L38:
            int r2 = r8.f4650g
            if (r3 >= r2) goto L4d
            java.io.File r2 = r1.c(r3)
            i(r2)
            java.io.File r2 = r1.i(r3)
            i(r2)
            int r3 = r3 + 1
            goto L38
        L4d:
            r0.remove()
            goto Lf
        L51:
            return
    }

    private synchronized void B() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.f4652i     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto Le8
        Lc:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L9
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9
            java.io.File r3 = r6.f4646c     // Catch: java.lang.Throwable -> L9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9
            java.nio.charset.Charset r3 = com.amap.api.col.s.r2.p     // Catch: java.lang.Throwable -> L9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            int r1 = r6.f4648e     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L8b
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            int r1 = r6.f4650g     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L8b
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8b
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r1 = r6.f4654k     // Catch: java.lang.Throwable -> L8b
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8b
        L5e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8b
            com.amap.api.col.s.r2$f r2 = (com.amap.api.col.s.r2.f) r2     // Catch: java.lang.Throwable -> L8b
            com.amap.api.col.s.r2$d r3 = com.amap.api.col.s.r2.f.h(r2)     // Catch: java.lang.Throwable -> L8b
            r4 = 10
            if (r3 == 0) goto L8d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "DIRTY "
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = com.amap.api.col.s.r2.f.k(r2)     // Catch: java.lang.Throwable -> L8b
            r3.append(r2)     // Catch: java.lang.Throwable -> L8b
            r3.append(r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8b
            r0.write(r2)     // Catch: java.lang.Throwable -> L8b
            goto L5e
        L8b:
            r1 = move-exception
            goto Le4
        L8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "CLEAN "
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = com.amap.api.col.s.r2.f.k(r2)     // Catch: java.lang.Throwable -> L8b
            r3.append(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = r2.e()     // Catch: java.lang.Throwable -> L8b
            r3.append(r2)     // Catch: java.lang.Throwable -> L8b
            r3.append(r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8b
            r0.write(r2)     // Catch: java.lang.Throwable -> L8b
            goto L5e
        Lad:
            r0.close()     // Catch: java.lang.Throwable -> L9
            java.io.File r0 = r6.f4645b     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L9
            r1 = 1
            if (r0 == 0) goto Lc0
            java.io.File r0 = r6.f4645b     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.f4647d     // Catch: java.lang.Throwable -> L9
            j(r0, r2, r1)     // Catch: java.lang.Throwable -> L9
        Lc0:
            java.io.File r0 = r6.f4646c     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.f4645b     // Catch: java.lang.Throwable -> L9
            r3 = 0
            j(r0, r2, r3)     // Catch: java.lang.Throwable -> L9
            java.io.File r0 = r6.f4647d     // Catch: java.lang.Throwable -> L9
            r0.delete()     // Catch: java.lang.Throwable -> L9
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L9
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9
            java.io.File r4 = r6.f4645b     // Catch: java.lang.Throwable -> L9
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L9
            java.nio.charset.Charset r1 = com.amap.api.col.s.r2.p     // Catch: java.lang.Throwable -> L9
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r6.f4652i = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r6)
            return
        Le4:
            r0.close()     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        Le8:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private boolean C() {
            r2 = this;
            int r0 = r2.l
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r1 = r2.f4654k
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private void D() {
            r2 = this;
            java.io.Writer r0 = r2.f4652i
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)
            throw r0
    }

    private void E() throws java.io.IOException {
            r5 = this;
        L0:
            long r0 = r5.f4651h
            long r2 = r5.f4649f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L14
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r5.f4654k
            int r0 = r0.size()
            int r1 = r5.f4653j
            if (r0 <= r1) goto L13
            goto L14
        L13:
            return
        L14:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r5.f4654k
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r5.q(r0)
            goto L0
    }

    public static com.amap.api.col.s.r2 b(java.io.File r6, long r7) throws java.io.IOException {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L61
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r6, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L28
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "journal"
            r1.<init>(r6, r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L24
            r0.delete()
            goto L28
        L24:
            r2 = 0
            j(r0, r1, r2)
        L28:
            com.amap.api.col.s.r2 r0 = new com.amap.api.col.s.r2
            r0.<init>(r6, r7)
            java.io.File r1 = r0.f4645b
            boolean r1 = r1.exists()
            if (r1 == 0) goto L55
            r0.y()     // Catch: java.lang.Throwable -> L52
            r0.A()     // Catch: java.lang.Throwable -> L52
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L52
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L52
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L52
            java.io.File r4 = r0.f4645b     // Catch: java.lang.Throwable -> L52
            r5 = 1
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L52
            java.nio.charset.Charset r4 = com.amap.api.col.s.r2.p     // Catch: java.lang.Throwable -> L52
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L52
            r0.f4652i = r1     // Catch: java.lang.Throwable -> L52
            return r0
        L52:
            r0.o()
        L55:
            r6.mkdirs()
            com.amap.api.col.s.r2 r0 = new com.amap.api.col.s.r2
            r0.<init>(r6, r7)
            r0.B()
            return r0
        L61:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "maxSize <= 0"
            r6.<init>(r7)
            throw r6
    }

    static /* synthetic */ java.io.Writer d(com.amap.api.col.s.r2 r0) {
            java.io.Writer r0 = r0.f4652i
            return r0
    }

    private synchronized void f(com.amap.api.col.s.r2.d r10, boolean r11) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            com.amap.api.col.s.r2$f r0 = com.amap.api.col.s.r2.d.a(r10)     // Catch: java.lang.Throwable -> L30
            com.amap.api.col.s.r2$d r1 = com.amap.api.col.s.r2.f.h(r0)     // Catch: java.lang.Throwable -> L30
            if (r1 != r10) goto L102
            r1 = 0
            if (r11 == 0) goto L49
            boolean r2 = com.amap.api.col.s.r2.f.l(r0)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L49
            r2 = 0
        L15:
            int r3 = r9.f4650g     // Catch: java.lang.Throwable -> L30
            if (r2 >= r3) goto L49
            boolean[] r3 = com.amap.api.col.s.r2.d.d(r10)     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3[r2]     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L36
            java.io.File r3 = r0.i(r2)     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L33
            r10.e()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r9)
            return
        L30:
            r10 = move-exception
            goto L108
        L33:
            int r2 = r2 + 1
            goto L15
        L36:
            r10.e()     // Catch: java.lang.Throwable -> L30
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = "Newly created entry didn't create value for index "
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = r11.concat(r0)     // Catch: java.lang.Throwable -> L30
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L30
            throw r10     // Catch: java.lang.Throwable -> L30
        L49:
            int r10 = r9.f4650g     // Catch: java.lang.Throwable -> L30
            if (r1 >= r10) goto L7d
            java.io.File r10 = r0.i(r1)     // Catch: java.lang.Throwable -> L30
            if (r11 == 0) goto L77
            boolean r2 = r10.exists()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L7a
            java.io.File r2 = r0.c(r1)     // Catch: java.lang.Throwable -> L30
            r10.renameTo(r2)     // Catch: java.lang.Throwable -> L30
            long[] r10 = com.amap.api.col.s.r2.f.j(r0)     // Catch: java.lang.Throwable -> L30
            r3 = r10[r1]     // Catch: java.lang.Throwable -> L30
            long r5 = r2.length()     // Catch: java.lang.Throwable -> L30
            long[] r10 = com.amap.api.col.s.r2.f.j(r0)     // Catch: java.lang.Throwable -> L30
            r10[r1] = r5     // Catch: java.lang.Throwable -> L30
            long r7 = r9.f4651h     // Catch: java.lang.Throwable -> L30
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f4651h = r7     // Catch: java.lang.Throwable -> L30
            goto L7a
        L77:
            i(r10)     // Catch: java.lang.Throwable -> L30
        L7a:
            int r1 = r1 + 1
            goto L49
        L7d:
            int r10 = r9.l     // Catch: java.lang.Throwable -> L30
            int r10 = r10 + 1
            r9.l = r10     // Catch: java.lang.Throwable -> L30
            r10 = 0
            com.amap.api.col.s.r2.f.b(r0, r10)     // Catch: java.lang.Throwable -> L30
            boolean r10 = com.amap.api.col.s.r2.f.l(r0)     // Catch: java.lang.Throwable -> L30
            r10 = r10 | r11
            r1 = 10
            if (r10 == 0) goto Lc1
            com.amap.api.col.s.r2.f.g(r0)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.f4652i     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "CLEAN "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = com.amap.api.col.s.r2.f.k(r0)     // Catch: java.lang.Throwable -> L30
            r2.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r0.e()     // Catch: java.lang.Throwable -> L30
            r2.append(r3)     // Catch: java.lang.Throwable -> L30
            r2.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L30
            r10.write(r1)     // Catch: java.lang.Throwable -> L30
            if (r11 == 0) goto Le4
            long r10 = r9.m     // Catch: java.lang.Throwable -> L30
            r1 = 1
            long r1 = r1 + r10
            r9.m = r1     // Catch: java.lang.Throwable -> L30
            com.amap.api.col.s.r2.f.a(r0, r10)     // Catch: java.lang.Throwable -> L30
            goto Le4
        Lc1:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r10 = r9.f4654k     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = com.amap.api.col.s.r2.f.k(r0)     // Catch: java.lang.Throwable -> L30
            r10.remove(r11)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.f4652i     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "REMOVE "
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = com.amap.api.col.s.r2.f.k(r0)     // Catch: java.lang.Throwable -> L30
            r11.append(r0)     // Catch: java.lang.Throwable -> L30
            r11.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L30
            r10.write(r11)     // Catch: java.lang.Throwable -> L30
        Le4:
            java.io.Writer r10 = r9.f4652i     // Catch: java.lang.Throwable -> L30
            r10.flush()     // Catch: java.lang.Throwable -> L30
            long r10 = r9.f4651h     // Catch: java.lang.Throwable -> L30
            long r0 = r9.f4649f     // Catch: java.lang.Throwable -> L30
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto Lf7
            boolean r10 = r9.C()     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L100
        Lf7:
            java.util.concurrent.ThreadPoolExecutor r10 = v()     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.n     // Catch: java.lang.Throwable -> L30
            r10.submit(r11)     // Catch: java.lang.Throwable -> L30
        L100:
            monitor-exit(r9)
            return
        L102:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            r10.<init>()     // Catch: java.lang.Throwable -> L30
            throw r10     // Catch: java.lang.Throwable -> L30
        L108:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
    }

    static /* synthetic */ void g(com.amap.api.col.s.r2 r0, com.amap.api.col.s.r2.d r1, boolean r2) throws java.io.IOException {
            r0.f(r1, r2)
            return
    }

    public static void h(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.Exception -> L5 java.lang.RuntimeException -> L6
        L5:
            return
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    private static void i(java.io.File r1) throws java.io.IOException {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L13
            boolean r1 = r1.delete()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>()
            throw r1
        L13:
            return
    }

    private static void j(java.io.File r0, java.io.File r1, boolean r2) throws java.io.IOException {
            if (r2 == 0) goto L5
            i(r1)
        L5:
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    static /* synthetic */ void m(com.amap.api.col.s.r2 r0) throws java.io.IOException {
            r0.E()
            return
    }

    private static void n(java.io.File r4) throws java.io.IOException {
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L2f
            int r4 = r0.length
            r1 = 0
        L8:
            if (r1 >= r4) goto L2e
            r2 = r0[r1]
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L15
            n(r2)
        L15:
            boolean r3 = r2.delete()
            if (r3 == 0) goto L1e
            int r1 = r1 + 1
            goto L8
        L1e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "failed to delete file: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            r4.<init>(r0)
            throw r4
        L2e:
            return
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "not a readable directory: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    static /* synthetic */ boolean p(com.amap.api.col.s.r2 r0) {
            boolean r0 = r0.C()
            return r0
    }

    private synchronized com.amap.api.col.s.r2.d r(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            r4.D()     // Catch: java.lang.Throwable -> L1d
            w(r5)     // Catch: java.lang.Throwable -> L1d
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r4.f4654k     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L1d
            com.amap.api.col.s.r2$f r0 = (com.amap.api.col.s.r2.f) r0     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 != 0) goto L1f
            com.amap.api.col.s.r2$f r0 = new com.amap.api.col.s.r2$f     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L1d
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r2 = r4.f4654k     // Catch: java.lang.Throwable -> L1d
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r5 = move-exception
            goto L4f
        L1f:
            com.amap.api.col.s.r2$d r2 = com.amap.api.col.s.r2.f.h(r0)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L28
            monitor-exit(r4)
            r5 = 0
            return r5
        L28:
            com.amap.api.col.s.r2$d r2 = new com.amap.api.col.s.r2$d     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r4, r0, r1)     // Catch: java.lang.Throwable -> L1d
            com.amap.api.col.s.r2.f.b(r0, r2)     // Catch: java.lang.Throwable -> L1d
            java.io.Writer r0 = r4.f4652i     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "DIRTY "
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            r1.append(r5)     // Catch: java.lang.Throwable -> L1d
            r5 = 10
            r1.append(r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r0.write(r5)     // Catch: java.lang.Throwable -> L1d
            java.io.Writer r5 = r4.f4652i     // Catch: java.lang.Throwable -> L1d
            r5.flush()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r2
        L4f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r5
    }

    static /* synthetic */ java.io.OutputStream s() {
            java.io.OutputStream r0 = com.amap.api.col.s.r2.t
            return r0
    }

    static /* synthetic */ void t(com.amap.api.col.s.r2 r0) throws java.io.IOException {
            r0.B()
            return
    }

    static /* synthetic */ int u(com.amap.api.col.s.r2 r1) {
            r0 = 0
            r1.l = r0
            return r0
    }

    private static java.util.concurrent.ThreadPoolExecutor v() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.amap.api.col.s.r2.s     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto La
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
        La:
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L20
            r0 = 256(0x100, float:3.59E-43)
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.ThreadFactory r8 = com.amap.api.col.s.r2.r     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r3 = 1
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.s.r2.s = r1     // Catch: java.lang.Throwable -> L20
        L20:
            java.util.concurrent.ThreadPoolExecutor r0 = com.amap.api.col.s.r2.s
            return r0
    }

    private static void w(java.lang.String r3) {
            java.util.regex.Pattern r0 = com.amap.api.col.s.r2.o
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "keys must match regex [a-z0-9_-]{1,120}: \""
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "\""
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static /* synthetic */ int x(com.amap.api.col.s.r2 r0) {
            int r0 = r0.f4650g
            return r0
    }

    private void y() throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = ", "
            com.amap.api.col.s.s2 r1 = new com.amap.api.col.s.s2
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r11.f4645b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.amap.api.col.s.r2.p
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.a()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r1.a()     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r1.a()     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r1.a()     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L108
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L108
            int r7 = r11.f4648e     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch: java.lang.Throwable -> L82
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L108
            int r4 = r11.f4650g     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L82
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L108
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L108
            r0 = 0
            r2 = 0
        L56:
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r4 = 32
            int r5 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            java.lang.String r6 = "unexpected journal line: "
            r7 = -1
            if (r5 == r7) goto Lf1
            int r8 = r5 + 1
            int r4 = r3.indexOf(r4, r8)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            if (r4 != r7) goto L85
            java.lang.String r8 = r3.substring(r8)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r9 = 6
            if (r5 != r9) goto L89
            java.lang.String r9 = "REMOVE"
            boolean r9 = r3.startsWith(r9)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            if (r9 == 0) goto L89
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r3 = r11.f4654k     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r3.remove(r8)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            goto Le3
        L82:
            r0 = move-exception
            goto L133
        L85:
            java.lang.String r8 = r3.substring(r8, r4)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
        L89:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r9 = r11.f4654k     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            com.amap.api.col.s.r2$f r9 = (com.amap.api.col.s.r2.f) r9     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            if (r9 != 0) goto L9d
            com.amap.api.col.s.r2$f r9 = new com.amap.api.col.s.r2$f     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r9.<init>(r11, r8, r0)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r10 = r11.f4654k     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r10.put(r8, r9)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
        L9d:
            r8 = 5
            if (r4 == r7) goto Lc1
            if (r5 != r8) goto Lc1
            java.lang.String r10 = "CLEAN"
            boolean r10 = r3.startsWith(r10)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            if (r10 == 0) goto Lc1
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            java.lang.String r4 = " "
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            com.amap.api.col.s.r2.f.g(r9)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r4 = 0
            com.amap.api.col.s.r2.f.b(r9, r4)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            com.amap.api.col.s.r2.f.f(r9, r3)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            goto Le3
        Lc1:
            if (r4 != r7) goto Ld6
            if (r5 != r8) goto Ld6
            java.lang.String r8 = "DIRTY"
            boolean r8 = r3.startsWith(r8)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            if (r8 == 0) goto Ld6
            com.amap.api.col.s.r2$d r3 = new com.amap.api.col.s.r2$d     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r3.<init>(r11, r9, r0)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            com.amap.api.col.s.r2.f.b(r9, r3)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            goto Le3
        Ld6:
            if (r4 != r7) goto Le7
            r4 = 4
            if (r5 != r4) goto Le7
            java.lang.String r4 = "READ"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            if (r4 == 0) goto Le7
        Le3:
            int r2 = r2 + 1
            goto L56
        Le7:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            throw r0     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
        Lf1:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
            throw r0     // Catch: java.lang.Throwable -> L82 java.io.EOFException -> Lfb
        Lfb:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r11.f4654k     // Catch: java.lang.Throwable -> L82
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L82
            int r2 = r2 - r0
            r11.l = r2     // Catch: java.lang.Throwable -> L82
            h(r1)
            return
        L108:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = "unexpected journal header: ["
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L82
            r7.append(r2)     // Catch: java.lang.Throwable -> L82
            r7.append(r0)     // Catch: java.lang.Throwable -> L82
            r7.append(r3)     // Catch: java.lang.Throwable -> L82
            r7.append(r0)     // Catch: java.lang.Throwable -> L82
            r7.append(r5)     // Catch: java.lang.Throwable -> L82
            r7.append(r0)     // Catch: java.lang.Throwable -> L82
            r7.append(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L82
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L82
            throw r4     // Catch: java.lang.Throwable -> L82
        L133:
            h(r1)
            throw r0
    }

    static /* synthetic */ java.io.File z(com.amap.api.col.s.r2 r0) {
            java.io.File r0 = r0.a
            return r0
    }

    public final synchronized com.amap.api.col.s.r2.e a(java.lang.String r12) throws java.io.IOException {
            r11 = this;
            monitor-enter(r11)
            r11.D()     // Catch: java.lang.Throwable -> L7c
            w(r12)     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r11.f4654k     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L7c
            com.amap.api.col.s.r2$f r0 = (com.amap.api.col.s.r2.f) r0     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            if (r0 != 0) goto L14
            monitor-exit(r11)
            return r1
        L14:
            boolean r2 = com.amap.api.col.s.r2.f.l(r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L1c
            monitor-exit(r11)
            return r1
        L1c:
            int r2 = r11.f4650g     // Catch: java.lang.Throwable -> L7c
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch: java.lang.Throwable -> L7c
            r2 = 0
            r3 = 0
        L22:
            int r4 = r11.f4650g     // Catch: java.io.FileNotFoundException -> L38 java.lang.Throwable -> L7c
            if (r3 >= r4) goto L3a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            java.io.File r5 = r0.c(r3)     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            r8[r3] = r4     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            int r3 = r3 + 1
            goto L22
        L34:
            r0 = move-exception
            r12 = r0
            r4 = r11
            goto L8f
        L38:
            r4 = r11
            goto L7f
        L3a:
            int r1 = r11.l     // Catch: java.lang.Throwable -> L7c
            int r1 = r1 + 1
            r11.l = r1     // Catch: java.lang.Throwable -> L7c
            java.io.Writer r1 = r11.f4652i     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7c
            r2.append(r12)     // Catch: java.lang.Throwable -> L7c
            r3 = 10
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            boolean r1 = r11.C()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L67
            java.util.concurrent.ThreadPoolExecutor r1 = v()     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.n     // Catch: java.lang.Throwable -> L34
            r1.submit(r2)     // Catch: java.lang.Throwable -> L34
        L67:
            com.amap.api.col.s.r2$e r3 = new com.amap.api.col.s.r2$e     // Catch: java.lang.Throwable -> L7c
            long r6 = com.amap.api.col.s.r2.f.m(r0)     // Catch: java.lang.Throwable -> L7c
            long[] r9 = com.amap.api.col.s.r2.f.j(r0)     // Catch: java.lang.Throwable -> L7c
            r10 = 0
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r11)
            return r3
        L79:
            r0 = move-exception
        L7a:
            r12 = r0
            goto L8f
        L7c:
            r0 = move-exception
            r4 = r11
            goto L7a
        L7f:
            int r12 = r4.f4650g     // Catch: java.lang.Throwable -> L79
            if (r2 >= r12) goto L8d
            r12 = r8[r2]     // Catch: java.lang.Throwable -> L79
            if (r12 == 0) goto L8d
            h(r12)     // Catch: java.lang.Throwable -> L79
            int r2 = r2 + 1
            goto L7f
        L8d:
            monitor-exit(r11)
            return r1
        L8f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L79
            throw r12
    }

    public final java.io.File c() {
            r1 = this;
            java.io.File r0 = r1.a
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.io.Writer r0 = r3.f4652i     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L7
            monitor-exit(r3)
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r1 = r3.f4654k     // Catch: java.lang.Throwable -> L30
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L30
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L30
            com.amap.api.col.s.r2$f r1 = (com.amap.api.col.s.r2.f) r1     // Catch: java.lang.Throwable -> L30
            com.amap.api.col.s.r2$d r2 = com.amap.api.col.s.r2.f.h(r1)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L16
            com.amap.api.col.s.r2$d r1 = com.amap.api.col.s.r2.f.h(r1)     // Catch: java.lang.Throwable -> L30
            r1.e()     // Catch: java.lang.Throwable -> L30
            goto L16
        L30:
            r0 = move-exception
            goto L3f
        L32:
            r3.E()     // Catch: java.lang.Throwable -> L30
            java.io.Writer r0 = r3.f4652i     // Catch: java.lang.Throwable -> L30
            r0.close()     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r3.f4652i = r0     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return
        L3f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    public final void e(int r2) {
            r1 = this;
            r0 = 10
            if (r2 >= r0) goto L7
            r2 = 10
            goto Ld
        L7:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r2 <= r0) goto Ld
            r2 = 10000(0x2710, float:1.4013E-41)
        Ld:
            r1.f4653j = r2
            return
    }

    public final com.amap.api.col.s.r2.d k(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            com.amap.api.col.s.r2$d r1 = r0.r(r1)
            return r1
    }

    public final synchronized void l() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.D()     // Catch: java.lang.Throwable -> Le
            r1.E()     // Catch: java.lang.Throwable -> Le
            java.io.Writer r0 = r1.f4652i     // Catch: java.lang.Throwable -> Le
            r0.flush()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public final void o() throws java.io.IOException {
            r1 = this;
            r1.close()
            java.io.File r0 = r1.a
            n(r0)
            return
    }

    public final synchronized boolean q(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            r7.D()     // Catch: java.lang.Throwable -> L3e
            w(r8)     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r7.f4654k     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L3e
            com.amap.api.col.s.r2$f r0 = (com.amap.api.col.s.r2.f) r0     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 == 0) goto L8a
            com.amap.api.col.s.r2$d r2 = com.amap.api.col.s.r2.f.h(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L19
            goto L8a
        L19:
            int r2 = r7.f4650g     // Catch: java.lang.Throwable -> L3e
            if (r1 >= r2) goto L56
            java.io.File r2 = r0.c(r1)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L40
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L2e
            goto L40
        L2e:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "failed to delete "
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L3e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L3e:
            r8 = move-exception
            goto L8c
        L40:
            long r2 = r7.f4651h     // Catch: java.lang.Throwable -> L3e
            long[] r4 = com.amap.api.col.s.r2.f.j(r0)     // Catch: java.lang.Throwable -> L3e
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 - r5
            r7.f4651h = r2     // Catch: java.lang.Throwable -> L3e
            long[] r2 = com.amap.api.col.s.r2.f.j(r0)     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            r2[r1] = r3     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 1
            goto L19
        L56:
            int r0 = r7.l     // Catch: java.lang.Throwable -> L3e
            r1 = 1
            int r0 = r0 + r1
            r7.l = r0     // Catch: java.lang.Throwable -> L3e
            java.io.Writer r0 = r7.f4652i     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            r2.append(r8)     // Catch: java.lang.Throwable -> L3e
            r3 = 10
            r2.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            r0.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap<java.lang.String, com.amap.api.col.s.r2$f> r0 = r7.f4654k     // Catch: java.lang.Throwable -> L3e
            r0.remove(r8)     // Catch: java.lang.Throwable -> L3e
            boolean r8 = r7.C()     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L88
            java.util.concurrent.ThreadPoolExecutor r8 = v()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.n     // Catch: java.lang.Throwable -> L3e
            r8.submit(r0)     // Catch: java.lang.Throwable -> L3e
        L88:
            monitor-exit(r7)
            return r1
        L8a:
            monitor-exit(r7)
            return r1
        L8c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            throw r8
    }
}
