package com.bumptech.glide.disklrucache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b implements java.io.Closeable {

    /* renamed from: o, reason: collision with root package name */
    static final java.lang.String f339o = "journal";

    /* renamed from: p, reason: collision with root package name */
    static final java.lang.String f340p = "journal.tmp";

    /* renamed from: q, reason: collision with root package name */
    static final java.lang.String f341q = "journal.bkp";

    /* renamed from: r, reason: collision with root package name */
    static final java.lang.String f342r = "libcore.io.DiskLruCache";

    /* renamed from: s, reason: collision with root package name */
    static final java.lang.String f343s = "1";

    /* renamed from: t, reason: collision with root package name */
    static final long f344t = -1;

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.String f345u = "CLEAN";

    /* renamed from: v, reason: collision with root package name */
    private static final java.lang.String f346v = "DIRTY";

    /* renamed from: w, reason: collision with root package name */
    private static final java.lang.String f347w = "REMOVE";

    /* renamed from: x, reason: collision with root package name */
    private static final java.lang.String f348x = "READ";
    private final java.io.File a;
    private final java.io.File b;
    private final java.io.File c;
    private final java.io.File d;
    private final int e;
    private long f;
    private final int g;
    private long h;
    private java.io.Writer i;
    private final java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b.d> j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private long f349l;

    /* renamed from: m, reason: collision with root package name */
    final java.util.concurrent.ThreadPoolExecutor f350m;

    /* renamed from: n, reason: collision with root package name */
    private final java.util.concurrent.Callable<java.lang.Void> f351n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.concurrent.Callable<java.lang.Void> {
        final /* synthetic */ com.bumptech.glide.disklrucache.b a;

        a(com.bumptech.glide.disklrucache.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Void call() throws java.lang.Exception {
                r1 = this;
                java.lang.Void r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.Void call2() throws java.lang.Exception {
                r4 = this;
                com.bumptech.glide.disklrucache.b r0 = r4.a
                monitor-enter(r0)
                com.bumptech.glide.disklrucache.b r1 = r4.a     // Catch: java.lang.Throwable -> Le
                java.io.Writer r1 = com.bumptech.glide.disklrucache.b.a(r1)     // Catch: java.lang.Throwable -> Le
                r2 = 0
                if (r1 != 0) goto L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r2
            Le:
                r1 = move-exception
                goto L2a
            L10:
                com.bumptech.glide.disklrucache.b r1 = r4.a     // Catch: java.lang.Throwable -> Le
                com.bumptech.glide.disklrucache.b.e(r1)     // Catch: java.lang.Throwable -> Le
                com.bumptech.glide.disklrucache.b r1 = r4.a     // Catch: java.lang.Throwable -> Le
                boolean r1 = com.bumptech.glide.disklrucache.b.h(r1)     // Catch: java.lang.Throwable -> Le
                if (r1 == 0) goto L28
                com.bumptech.glide.disklrucache.b r1 = r4.a     // Catch: java.lang.Throwable -> Le
                com.bumptech.glide.disklrucache.b.i(r1)     // Catch: java.lang.Throwable -> Le
                com.bumptech.glide.disklrucache.b r1 = r4.a     // Catch: java.lang.Throwable -> Le
                r3 = 0
                com.bumptech.glide.disklrucache.b.j(r1, r3)     // Catch: java.lang.Throwable -> Le
            L28:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r2
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.disklrucache.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0015b implements java.util.concurrent.ThreadFactory {
        private ThreadFactoryC0015b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ThreadFactoryC0015b(com.bumptech.glide.disklrucache.b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                monitor-enter(r2)
                java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> Le
                java.lang.String r1 = "glide-disk-lru-cache-thread"
                r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
                r3 = 1
                r0.setPriority(r3)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r2)
                return r0
            Le:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class c {
        private final com.bumptech.glide.disklrucache.b.d a;
        private final boolean[] b;
        private boolean c;
        final /* synthetic */ com.bumptech.glide.disklrucache.b d;

        private c(com.bumptech.glide.disklrucache.b r1, com.bumptech.glide.disklrucache.b.d r2) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r0.a = r2
                boolean r2 = com.bumptech.glide.disklrucache.b.d.e(r2)
                if (r2 == 0) goto Lf
                r1 = 0
                goto L15
            Lf:
                int r1 = com.bumptech.glide.disklrucache.b.d(r1)
                boolean[] r1 = new boolean[r1]
            L15:
                r0.b = r1
                return
        }

        /* synthetic */ c(com.bumptech.glide.disklrucache.b r1, com.bumptech.glide.disklrucache.b.d r2, com.bumptech.glide.disklrucache.b.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ com.bumptech.glide.disklrucache.b.d c(com.bumptech.glide.disklrucache.b.c r0) {
                com.bumptech.glide.disklrucache.b$d r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean[] d(com.bumptech.glide.disklrucache.b.c r0) {
                boolean[] r0 = r0.b
                return r0
        }

        private java.io.InputStream h(int r5) throws java.io.IOException {
                r4 = this;
                com.bumptech.glide.disklrucache.b r0 = r4.d
                monitor-enter(r0)
                com.bumptech.glide.disklrucache.b$d r1 = r4.a     // Catch: java.lang.Throwable -> L16
                com.bumptech.glide.disklrucache.b$c r1 = com.bumptech.glide.disklrucache.b.d.g(r1)     // Catch: java.lang.Throwable -> L16
                if (r1 != r4) goto L27
                com.bumptech.glide.disklrucache.b$d r1 = r4.a     // Catch: java.lang.Throwable -> L16
                boolean r1 = com.bumptech.glide.disklrucache.b.d.e(r1)     // Catch: java.lang.Throwable -> L16
                r2 = 0
                if (r1 != 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return r2
            L16:
                r5 = move-exception
                goto L2d
            L18:
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L25
                com.bumptech.glide.disklrucache.b$d r3 = r4.a     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L25
                java.io.File r5 = r3.j(r5)     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L25
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L25
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return r1
            L25:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return r2
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
                r5.<init>()     // Catch: java.lang.Throwable -> L16
                throw r5     // Catch: java.lang.Throwable -> L16
            L2d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r5
        }

        public void a() throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.disklrucache.b r0 = r2.d
                r1 = 0
                com.bumptech.glide.disklrucache.b.g(r0, r2, r1)
                return
        }

        public void b() {
                r1 = this;
                boolean r0 = r1.c
                if (r0 != 0) goto L7
                r1.a()     // Catch: java.io.IOException -> L7
            L7:
                return
        }

        public void e() throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.disklrucache.b r0 = r2.d
                r1 = 1
                com.bumptech.glide.disklrucache.b.g(r0, r2, r1)
                r2.c = r1
                return
        }

        public java.io.File f(int r4) throws java.io.IOException {
                r3 = this;
                com.bumptech.glide.disklrucache.b r0 = r3.d
                monitor-enter(r0)
                com.bumptech.glide.disklrucache.b$d r1 = r3.a     // Catch: java.lang.Throwable -> L19
                com.bumptech.glide.disklrucache.b$c r1 = com.bumptech.glide.disklrucache.b.d.g(r1)     // Catch: java.lang.Throwable -> L19
                if (r1 != r3) goto L2c
                com.bumptech.glide.disklrucache.b$d r1 = r3.a     // Catch: java.lang.Throwable -> L19
                boolean r1 = com.bumptech.glide.disklrucache.b.d.e(r1)     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                boolean[] r1 = r3.b     // Catch: java.lang.Throwable -> L19
                r2 = 1
                r1[r4] = r2     // Catch: java.lang.Throwable -> L19
                goto L1b
            L19:
                r4 = move-exception
                goto L32
            L1b:
                com.bumptech.glide.disklrucache.b$d r1 = r3.a     // Catch: java.lang.Throwable -> L19
                java.io.File r4 = r1.k(r4)     // Catch: java.lang.Throwable -> L19
                com.bumptech.glide.disklrucache.b r1 = r3.d     // Catch: java.lang.Throwable -> L19
                java.io.File r1 = com.bumptech.glide.disklrucache.b.f(r1)     // Catch: java.lang.Throwable -> L19
                r1.mkdirs()     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r4
            L2c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
                r4.<init>()     // Catch: java.lang.Throwable -> L19
                throw r4     // Catch: java.lang.Throwable -> L19
            L32:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r4
        }

        public java.lang.String g(int r1) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = r0.h(r1)
                if (r1 == 0) goto Lb
                java.lang.String r1 = com.bumptech.glide.disklrucache.b.c(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        public void i(int r4, java.lang.String r5) throws java.io.IOException {
                r3 = this;
                r0 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1b
                java.io.File r4 = r3.f(r4)     // Catch: java.lang.Throwable -> L1b
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L1b
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L1b
                java.nio.charset.Charset r2 = com.bumptech.glide.disklrucache.d.b     // Catch: java.lang.Throwable -> L1b
                r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1b
                r4.write(r5)     // Catch: java.lang.Throwable -> L18
                com.bumptech.glide.disklrucache.d.a(r4)
                return
            L18:
                r5 = move-exception
                r0 = r4
                goto L1c
            L1b:
                r5 = move-exception
            L1c:
                com.bumptech.glide.disklrucache.d.a(r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class d {
        private final java.lang.String a;
        private final long[] b;
        java.io.File[] c;
        java.io.File[] d;
        private boolean e;
        private com.bumptech.glide.disklrucache.b.c f;
        private long g;
        final /* synthetic */ com.bumptech.glide.disklrucache.b h;

        private d(com.bumptech.glide.disklrucache.b r7, java.lang.String r8) {
                r6 = this;
                r6.h = r7
                r6.<init>()
                r6.a = r8
                int r0 = com.bumptech.glide.disklrucache.b.d(r7)
                long[] r0 = new long[r0]
                r6.b = r0
                int r0 = com.bumptech.glide.disklrucache.b.d(r7)
                java.io.File[] r0 = new java.io.File[r0]
                r6.c = r0
                int r0 = com.bumptech.glide.disklrucache.b.d(r7)
                java.io.File[] r0 = new java.io.File[r0]
                r6.d = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r8)
                r8 = 46
                r0.append(r8)
                int r8 = r0.length()
                r1 = 0
            L2e:
                int r2 = com.bumptech.glide.disklrucache.b.d(r7)
                if (r1 >= r2) goto L64
                r0.append(r1)
                java.io.File[] r2 = r6.c
                java.io.File r3 = new java.io.File
                java.io.File r4 = com.bumptech.glide.disklrucache.b.f(r7)
                java.lang.String r5 = r0.toString()
                r3.<init>(r4, r5)
                r2[r1] = r3
                java.lang.String r2 = ".tmp"
                r0.append(r2)
                java.io.File[] r2 = r6.d
                java.io.File r3 = new java.io.File
                java.io.File r4 = com.bumptech.glide.disklrucache.b.f(r7)
                java.lang.String r5 = r0.toString()
                r3.<init>(r4, r5)
                r2[r1] = r3
                r0.setLength(r8)
                int r1 = r1 + 1
                goto L2e
            L64:
                return
        }

        /* synthetic */ d(com.bumptech.glide.disklrucache.b r1, java.lang.String r2, com.bumptech.glide.disklrucache.b.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ long[] a(com.bumptech.glide.disklrucache.b.d r0) {
                long[] r0 = r0.b
                return r0
        }

        static /* synthetic */ java.lang.String b(com.bumptech.glide.disklrucache.b.d r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ long c(com.bumptech.glide.disklrucache.b.d r2) {
                long r0 = r2.g
                return r0
        }

        static /* synthetic */ long d(com.bumptech.glide.disklrucache.b.d r0, long r1) {
                r0.g = r1
                return r1
        }

        static /* synthetic */ boolean e(com.bumptech.glide.disklrucache.b.d r0) {
                boolean r0 = r0.e
                return r0
        }

        static /* synthetic */ boolean f(com.bumptech.glide.disklrucache.b.d r0, boolean r1) {
                r0.e = r1
                return r1
        }

        static /* synthetic */ com.bumptech.glide.disklrucache.b.c g(com.bumptech.glide.disklrucache.b.d r0) {
                com.bumptech.glide.disklrucache.b$c r0 = r0.f
                return r0
        }

        static /* synthetic */ com.bumptech.glide.disklrucache.b.c h(com.bumptech.glide.disklrucache.b.d r0, com.bumptech.glide.disklrucache.b.c r1) {
                r0.f = r1
                return r1
        }

        static /* synthetic */ void i(com.bumptech.glide.disklrucache.b.d r0, java.lang.String[] r1) throws java.io.IOException {
                r0.n(r1)
                return
        }

        private java.io.IOException m(java.lang.String[] r4) throws java.io.IOException {
                r3 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected journal line: "
                r1.append(r2)
                java.lang.String r4 = java.util.Arrays.toString(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private void n(java.lang.String[] r5) throws java.io.IOException {
                r4 = this;
                int r0 = r5.length
                com.bumptech.glide.disklrucache.b r1 = r4.h
                int r1 = com.bumptech.glide.disklrucache.b.d(r1)
                if (r0 != r1) goto L20
                r0 = 0
            La:
                int r1 = r5.length     // Catch: java.lang.NumberFormatException -> L1b
                if (r0 >= r1) goto L1a
                long[] r1 = r4.b     // Catch: java.lang.NumberFormatException -> L1b
                r2 = r5[r0]     // Catch: java.lang.NumberFormatException -> L1b
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1b
                r1[r0] = r2     // Catch: java.lang.NumberFormatException -> L1b
                int r0 = r0 + 1
                goto La
            L1a:
                return
            L1b:
                java.io.IOException r5 = r4.m(r5)
                throw r5
            L20:
                java.io.IOException r5 = r4.m(r5)
                throw r5
        }

        public java.io.File j(int r2) {
                r1 = this;
                java.io.File[] r0 = r1.c
                r2 = r0[r2]
                return r2
        }

        public java.io.File k(int r2) {
                r1 = this;
                java.io.File[] r0 = r1.d
                r2 = r0[r2]
                return r2
        }

        public java.lang.String l() throws java.io.IOException {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long[] r1 = r7.b
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class e {
        private final java.lang.String a;
        private final long b;
        private final long[] c;
        private final java.io.File[] d;
        final /* synthetic */ com.bumptech.glide.disklrucache.b e;

        private e(com.bumptech.glide.disklrucache.b r1, java.lang.String r2, long r3, java.io.File[] r5, long[] r6) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                r0.d = r5
                r0.c = r6
                return
        }

        /* synthetic */ e(com.bumptech.glide.disklrucache.b r1, java.lang.String r2, long r3, java.io.File[] r5, long[] r6, com.bumptech.glide.disklrucache.b.a r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5, r6)
                return
        }

        public com.bumptech.glide.disklrucache.b.c a() throws java.io.IOException {
                r4 = this;
                com.bumptech.glide.disklrucache.b r0 = r4.e
                java.lang.String r1 = r4.a
                long r2 = r4.b
                com.bumptech.glide.disklrucache.b$c r0 = com.bumptech.glide.disklrucache.b.b(r0, r1, r2)
                return r0
        }

        public java.io.File b(int r2) {
                r1 = this;
                java.io.File[] r0 = r1.d
                r2 = r0[r2]
                return r2
        }

        public long c(int r4) {
                r3 = this;
                long[] r0 = r3.c
                r1 = r0[r4]
                return r1
        }

        public java.lang.String d(int r3) throws java.io.IOException {
                r2 = this;
                java.io.FileInputStream r0 = new java.io.FileInputStream
                java.io.File[] r1 = r2.d
                r3 = r1[r3]
                r0.<init>(r3)
                java.lang.String r3 = com.bumptech.glide.disklrucache.b.c(r0)
                return r3
        }
    }

    private b(java.io.File r17, int r18, int r19, long r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r0.<init>()
            r2 = 0
            r0.h = r2
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1061158912(0x3f400000, float:0.75)
            r6 = 1
            r7 = 0
            r4.<init>(r7, r5, r6)
            r0.j = r4
            r0.f349l = r2
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r14 = new java.util.concurrent.LinkedBlockingQueue
            r14.<init>()
            com.bumptech.glide.disklrucache.b$b r15 = new com.bumptech.glide.disklrucache.b$b
            r2 = 0
            r15.<init>(r2)
            r9 = 0
            r10 = 1
            r11 = 60
            r8.<init>(r9, r10, r11, r13, r14, r15)
            r0.f350m = r8
            com.bumptech.glide.disklrucache.b$a r2 = new com.bumptech.glide.disklrucache.b$a
            r2.<init>(r0)
            r0.f351n = r2
            r0.a = r1
            r2 = r18
            r0.e = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal"
            r2.<init>(r1, r3)
            r0.b = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.tmp"
            r2.<init>(r1, r3)
            r0.c = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.bkp"
            r2.<init>(r1, r3)
            r0.d = r2
            r1 = r19
            r0.g = r1
            r1 = r20
            r0.f = r1
            return
    }

    private synchronized void A() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.i     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            l(r0)     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto Lee
        Lc:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L9
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9
            java.io.File r3 = r6.c     // Catch: java.lang.Throwable -> L9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9
            java.nio.charset.Charset r3 = com.bumptech.glide.disklrucache.d.a     // Catch: java.lang.Throwable -> L9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            int r1 = r6.e     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L8e
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            int r1 = r6.g     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L8e
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r1 = r6.j     // Catch: java.lang.Throwable -> L8e
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8e
        L5e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8e
            com.bumptech.glide.disklrucache.b$d r2 = (com.bumptech.glide.disklrucache.b.d) r2     // Catch: java.lang.Throwable -> L8e
            com.bumptech.glide.disklrucache.b$c r3 = com.bumptech.glide.disklrucache.b.d.g(r2)     // Catch: java.lang.Throwable -> L8e
            r4 = 10
            if (r3 == 0) goto L90
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = com.bumptech.glide.disklrucache.b.d.b(r2)     // Catch: java.lang.Throwable -> L8e
            r3.append(r2)     // Catch: java.lang.Throwable -> L8e
            r3.append(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            r0.write(r2)     // Catch: java.lang.Throwable -> L8e
            goto L5e
        L8e:
            r1 = move-exception
            goto Lea
        L90:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "CLEAN "
            r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = com.bumptech.glide.disklrucache.b.d.b(r2)     // Catch: java.lang.Throwable -> L8e
            r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r2.l()     // Catch: java.lang.Throwable -> L8e
            r3.append(r2)     // Catch: java.lang.Throwable -> L8e
            r3.append(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            r0.write(r2)     // Catch: java.lang.Throwable -> L8e
            goto L5e
        Lb3:
            l(r0)     // Catch: java.lang.Throwable -> L9
            java.io.File r0 = r6.b     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L9
            r1 = 1
            if (r0 == 0) goto Lc6
            java.io.File r0 = r6.b     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.d     // Catch: java.lang.Throwable -> L9
            C(r0, r2, r1)     // Catch: java.lang.Throwable -> L9
        Lc6:
            java.io.File r0 = r6.c     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.b     // Catch: java.lang.Throwable -> L9
            r3 = 0
            C(r0, r2, r3)     // Catch: java.lang.Throwable -> L9
            java.io.File r0 = r6.d     // Catch: java.lang.Throwable -> L9
            r0.delete()     // Catch: java.lang.Throwable -> L9
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L9
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9
            java.io.File r4 = r6.b     // Catch: java.lang.Throwable -> L9
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L9
            java.nio.charset.Charset r1 = com.bumptech.glide.disklrucache.d.a     // Catch: java.lang.Throwable -> L9
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r6.i = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r6)
            return
        Lea:
            l(r0)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        Lee:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private static void C(java.io.File r0, java.io.File r1, boolean r2) throws java.io.IOException {
            if (r2 == 0) goto L5
            n(r1)
        L5:
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    private void E() throws java.io.IOException {
            r5 = this;
        L0:
            long r0 = r5.h
            long r2 = r5.f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r5.j
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r5.B(r0)
            goto L0
        L22:
            return
    }

    static /* synthetic */ java.io.Writer a(com.bumptech.glide.disklrucache.b r0) {
            java.io.Writer r0 = r0.i
            return r0
    }

    static /* synthetic */ com.bumptech.glide.disklrucache.b.c b(com.bumptech.glide.disklrucache.b r0, java.lang.String r1, long r2) throws java.io.IOException {
            com.bumptech.glide.disklrucache.b$c r0 = r0.p(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.String c(java.io.InputStream r0) throws java.io.IOException {
            java.lang.String r0 = u(r0)
            return r0
    }

    static /* synthetic */ int d(com.bumptech.glide.disklrucache.b r0) {
            int r0 = r0.g
            return r0
    }

    static /* synthetic */ void e(com.bumptech.glide.disklrucache.b r0) throws java.io.IOException {
            r0.E()
            return
    }

    static /* synthetic */ java.io.File f(com.bumptech.glide.disklrucache.b r0) {
            java.io.File r0 = r0.a
            return r0
    }

    static /* synthetic */ void g(com.bumptech.glide.disklrucache.b r0, com.bumptech.glide.disklrucache.b.c r1, boolean r2) throws java.io.IOException {
            r0.m(r1, r2)
            return
    }

    static /* synthetic */ boolean h(com.bumptech.glide.disklrucache.b r0) {
            boolean r0 = r0.v()
            return r0
    }

    static /* synthetic */ void i(com.bumptech.glide.disklrucache.b r0) throws java.io.IOException {
            r0.A()
            return
    }

    static /* synthetic */ int j(com.bumptech.glide.disklrucache.b r0, int r1) {
            r0.k = r1
            return r1
    }

    private void k() {
            r2 = this;
            java.io.Writer r0 = r2.i
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)
            throw r0
    }

    @android.annotation.TargetApi(26)
    private static void l(java.io.Writer r2) throws java.io.IOException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto La
            r2.close()
            return
        La:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = com.bumptech.glide.disklrucache.a.a(r1)
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.close()     // Catch: java.lang.Throwable -> L25
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L25:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    private synchronized void m(com.bumptech.glide.disklrucache.b.c r10, boolean r11) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.disklrucache.b$d r0 = com.bumptech.glide.disklrucache.b.c.c(r10)     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.disklrucache.b$c r1 = com.bumptech.glide.disklrucache.b.d.g(r0)     // Catch: java.lang.Throwable -> L30
            if (r1 != r10) goto L10b
            r1 = 0
            if (r11 == 0) goto L50
            boolean r2 = com.bumptech.glide.disklrucache.b.d.e(r0)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L50
            r2 = 0
        L15:
            int r3 = r9.g     // Catch: java.lang.Throwable -> L30
            if (r2 >= r3) goto L50
            boolean[] r3 = com.bumptech.glide.disklrucache.b.c.d(r10)     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3[r2]     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L36
            java.io.File r3 = r0.k(r2)     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L33
            r10.a()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r9)
            return
        L30:
            r10 = move-exception
            goto L111
        L33:
            int r2 = r2 + 1
            goto L15
        L36:
            r10.a()     // Catch: java.lang.Throwable -> L30
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r11.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch: java.lang.Throwable -> L30
            r11.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L30
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L30
            throw r10     // Catch: java.lang.Throwable -> L30
        L50:
            int r10 = r9.g     // Catch: java.lang.Throwable -> L30
            if (r1 >= r10) goto L84
            java.io.File r10 = r0.k(r1)     // Catch: java.lang.Throwable -> L30
            if (r11 == 0) goto L7e
            boolean r2 = r10.exists()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L81
            java.io.File r2 = r0.j(r1)     // Catch: java.lang.Throwable -> L30
            r10.renameTo(r2)     // Catch: java.lang.Throwable -> L30
            long[] r10 = com.bumptech.glide.disklrucache.b.d.a(r0)     // Catch: java.lang.Throwable -> L30
            r3 = r10[r1]     // Catch: java.lang.Throwable -> L30
            long r5 = r2.length()     // Catch: java.lang.Throwable -> L30
            long[] r10 = com.bumptech.glide.disklrucache.b.d.a(r0)     // Catch: java.lang.Throwable -> L30
            r10[r1] = r5     // Catch: java.lang.Throwable -> L30
            long r7 = r9.h     // Catch: java.lang.Throwable -> L30
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.h = r7     // Catch: java.lang.Throwable -> L30
            goto L81
        L7e:
            n(r10)     // Catch: java.lang.Throwable -> L30
        L81:
            int r1 = r1 + 1
            goto L50
        L84:
            int r10 = r9.k     // Catch: java.lang.Throwable -> L30
            r1 = 1
            int r10 = r10 + r1
            r9.k = r10     // Catch: java.lang.Throwable -> L30
            r10 = 0
            com.bumptech.glide.disklrucache.b.d.h(r0, r10)     // Catch: java.lang.Throwable -> L30
            boolean r10 = com.bumptech.glide.disklrucache.b.d.e(r0)     // Catch: java.lang.Throwable -> L30
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto Lcc
            com.bumptech.glide.disklrucache.b.d.f(r0, r1)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            r10.append(r3)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = com.bumptech.glide.disklrucache.b.d.b(r0)     // Catch: java.lang.Throwable -> L30
            r10.append(r1)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r0.l()     // Catch: java.lang.Throwable -> L30
            r10.append(r1)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            r10.append(r2)     // Catch: java.lang.Throwable -> L30
            if (r11 == 0) goto Lef
            long r10 = r9.f349l     // Catch: java.lang.Throwable -> L30
            r1 = 1
            long r1 = r1 + r10
            r9.f349l = r1     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.disklrucache.b.d.d(r0, r10)     // Catch: java.lang.Throwable -> L30
            goto Lef
        Lcc:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r10 = r9.j     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = com.bumptech.glide.disklrucache.b.d.b(r0)     // Catch: java.lang.Throwable -> L30
            r10.remove(r11)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            r10.append(r3)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = com.bumptech.glide.disklrucache.b.d.b(r0)     // Catch: java.lang.Throwable -> L30
            r10.append(r11)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            r10.append(r2)     // Catch: java.lang.Throwable -> L30
        Lef:
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            q(r10)     // Catch: java.lang.Throwable -> L30
            long r10 = r9.h     // Catch: java.lang.Throwable -> L30
            long r0 = r9.f     // Catch: java.lang.Throwable -> L30
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L102
            boolean r10 = r9.v()     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L109
        L102:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f350m     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f351n     // Catch: java.lang.Throwable -> L30
            r10.submit(r11)     // Catch: java.lang.Throwable -> L30
        L109:
            monitor-exit(r9)
            return
        L10b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            r10.<init>()     // Catch: java.lang.Throwable -> L30
            throw r10     // Catch: java.lang.Throwable -> L30
        L111:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
    }

    private static void n(java.io.File r1) throws java.io.IOException {
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

    private synchronized com.bumptech.glide.disklrucache.b.c p(java.lang.String r6, long r7) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            r5.k()     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r5.j     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.disklrucache.b$d r0 = (com.bumptech.glide.disklrucache.b.d) r0     // Catch: java.lang.Throwable -> L1e
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L22
            if (r0 == 0) goto L20
            long r1 = com.bumptech.glide.disklrucache.b.d.c(r0)     // Catch: java.lang.Throwable -> L1e
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L22
            goto L20
        L1e:
            r6 = move-exception
            goto L60
        L20:
            monitor-exit(r5)
            return r3
        L22:
            if (r0 != 0) goto L2f
            com.bumptech.glide.disklrucache.b$d r0 = new com.bumptech.glide.disklrucache.b$d     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r7 = r5.j     // Catch: java.lang.Throwable -> L1e
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L1e
            goto L37
        L2f:
            com.bumptech.glide.disklrucache.b$c r7 = com.bumptech.glide.disklrucache.b.d.g(r0)     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L37
            monitor-exit(r5)
            return r3
        L37:
            com.bumptech.glide.disklrucache.b$c r7 = new com.bumptech.glide.disklrucache.b$c     // Catch: java.lang.Throwable -> L1e
            r7.<init>(r5, r0, r3)     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.disklrucache.b.d.h(r0, r7)     // Catch: java.lang.Throwable -> L1e
            java.io.Writer r8 = r5.i     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch: java.lang.Throwable -> L1e
            java.io.Writer r8 = r5.i     // Catch: java.lang.Throwable -> L1e
            r0 = 32
            r8.append(r0)     // Catch: java.lang.Throwable -> L1e
            java.io.Writer r8 = r5.i     // Catch: java.lang.Throwable -> L1e
            r8.append(r6)     // Catch: java.lang.Throwable -> L1e
            java.io.Writer r6 = r5.i     // Catch: java.lang.Throwable -> L1e
            r8 = 10
            r6.append(r8)     // Catch: java.lang.Throwable -> L1e
            java.io.Writer r6 = r5.i     // Catch: java.lang.Throwable -> L1e
            q(r6)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r5)
            return r7
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1e
            throw r6
    }

    @android.annotation.TargetApi(26)
    private static void q(java.io.Writer r2) throws java.io.IOException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto La
            r2.flush()
            return
        La:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = com.bumptech.glide.disklrucache.a.a(r1)
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.flush()     // Catch: java.lang.Throwable -> L25
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L25:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    private static java.lang.String u(java.io.InputStream r2) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.charset.Charset r1 = com.bumptech.glide.disklrucache.d.b
            r0.<init>(r2, r1)
            java.lang.String r2 = com.bumptech.glide.disklrucache.d.c(r0)
            return r2
    }

    private boolean v() {
            r2 = this;
            int r0 = r2.k
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r1 = r2.j
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static com.bumptech.glide.disklrucache.b w(java.io.File r10, int r11, int r12, long r13) throws java.io.IOException {
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            if (r12 <= 0) goto L62
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r10, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "journal"
            r1.<init>(r10, r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L26
            r0.delete()
            goto L2a
        L26:
            r2 = 0
            C(r0, r1, r2)
        L2a:
            com.bumptech.glide.disklrucache.b r3 = new com.bumptech.glide.disklrucache.b
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7)
            java.io.File r10 = r3.b
            boolean r10 = r10.exists()
            if (r10 == 0) goto L52
            r3.y()     // Catch: java.io.IOException -> L42
            r3.x()     // Catch: java.io.IOException -> L42
            return r3
        L42:
            r0 = move-exception
            r10 = r0
            java.io.PrintStream r11 = java.lang.System.out
            java.util.Objects.toString(r4)
            r10.getMessage()
            r11.getClass()
            r3.delete()
        L52:
            r4.mkdirs()
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            com.bumptech.glide.disklrucache.b r4 = new com.bumptech.glide.disklrucache.b
            r4.<init>(r5, r6, r7, r8)
            r4.A()
            return r4
        L62:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "valueCount <= 0"
            r10.<init>(r11)
            throw r10
        L6a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "maxSize <= 0"
            r10.<init>(r11)
            throw r10
    }

    private void x() throws java.io.IOException {
            r8 = this;
            java.io.File r0 = r8.c
            n(r0)
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r8.j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.disklrucache.b$d r1 = (com.bumptech.glide.disklrucache.b.d) r1
            com.bumptech.glide.disklrucache.b$c r2 = com.bumptech.glide.disklrucache.b.d.g(r1)
            r3 = 0
            if (r2 != 0) goto L34
        L22:
            int r2 = r8.g
            if (r3 >= r2) goto Lf
            long r4 = r8.h
            long[] r2 = com.bumptech.glide.disklrucache.b.d.a(r1)
            r6 = r2[r3]
            long r4 = r4 + r6
            r8.h = r4
            int r3 = r3 + 1
            goto L22
        L34:
            r2 = 0
            com.bumptech.glide.disklrucache.b.d.h(r1, r2)
        L38:
            int r2 = r8.g
            if (r3 >= r2) goto L4d
            java.io.File r2 = r1.j(r3)
            n(r2)
            java.io.File r2 = r1.k(r3)
            n(r2)
            int r3 = r3 + 1
            goto L38
        L4d:
            r0.remove()
            goto Lf
        L51:
            return
    }

    private void y() throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.disklrucache.c r1 = new com.bumptech.glide.disklrucache.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.disklrucache.d.a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.d()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = r1.d()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = r1.d()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = r1.d()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = r1.d()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L8e
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L8e
            int r7 = r9.e     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L8e
            int r4 = r9.g     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L8e
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L8e
            r0 = 0
        L55:
            java.lang.String r2 = r1.d()     // Catch: java.lang.Throwable -> L5f java.io.EOFException -> L61
            r9.z(r2)     // Catch: java.lang.Throwable -> L5f java.io.EOFException -> L61
            int r0 = r0 + 1
            goto L55
        L5f:
            r0 = move-exception
            goto Lbc
        L61:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r2 = r9.j     // Catch: java.lang.Throwable -> L5f
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 - r2
            r9.k = r0     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r1.c()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L74
            r9.A()     // Catch: java.lang.Throwable -> L5f
            goto L8a
        L74:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L5f
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L5f
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5f
            java.io.File r4 = r9.b     // Catch: java.lang.Throwable -> L5f
            r5 = 1
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L5f
            java.nio.charset.Charset r4 = com.bumptech.glide.disklrucache.d.a     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            r9.i = r0     // Catch: java.lang.Throwable -> L5f
        L8a:
            com.bumptech.glide.disklrucache.d.a(r1)
            return
        L8e:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r7.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch: java.lang.Throwable -> L5f
            r7.append(r2)     // Catch: java.lang.Throwable -> L5f
            r7.append(r0)     // Catch: java.lang.Throwable -> L5f
            r7.append(r3)     // Catch: java.lang.Throwable -> L5f
            r7.append(r0)     // Catch: java.lang.Throwable -> L5f
            r7.append(r5)     // Catch: java.lang.Throwable -> L5f
            r7.append(r0)     // Catch: java.lang.Throwable -> L5f
            r7.append(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            throw r4     // Catch: java.lang.Throwable -> L5f
        Lbc:
            com.bumptech.glide.disklrucache.d.a(r1)
            throw r0
    }

    private void z(java.lang.String r9) throws java.io.IOException {
            r8 = this;
            r0 = 32
            int r1 = r9.indexOf(r0)
            java.lang.String r2 = "unexpected journal line: "
            r3 = -1
            if (r1 == r3) goto L9c
            int r4 = r1 + 1
            int r0 = r9.indexOf(r0, r4)
            if (r0 != r3) goto L28
            java.lang.String r4 = r9.substring(r4)
            r5 = 6
            if (r1 != r5) goto L2c
            java.lang.String r5 = "REMOVE"
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L2c
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r9 = r8.j
            r9.remove(r4)
            return
        L28:
            java.lang.String r4 = r9.substring(r4, r0)
        L2c:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r5 = r8.j
            java.lang.Object r5 = r5.get(r4)
            com.bumptech.glide.disklrucache.b$d r5 = (com.bumptech.glide.disklrucache.b.d) r5
            r6 = 0
            if (r5 != 0) goto L41
            com.bumptech.glide.disklrucache.b$d r5 = new com.bumptech.glide.disklrucache.b$d
            r5.<init>(r8, r4, r6)
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r7 = r8.j
            r7.put(r4, r5)
        L41:
            r4 = 5
            if (r0 == r3) goto L64
            if (r1 != r4) goto L64
            java.lang.String r7 = "CLEAN"
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L64
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r9 = r9.split(r0)
            com.bumptech.glide.disklrucache.b.d.f(r5, r1)
            com.bumptech.glide.disklrucache.b.d.h(r5, r6)
            com.bumptech.glide.disklrucache.b.d.i(r5, r9)
            return
        L64:
            if (r0 != r3) goto L79
            if (r1 != r4) goto L79
            java.lang.String r4 = "DIRTY"
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto L79
            com.bumptech.glide.disklrucache.b$c r9 = new com.bumptech.glide.disklrucache.b$c
            r9.<init>(r8, r5, r6)
            com.bumptech.glide.disklrucache.b.d.h(r5, r9)
            return
        L79:
            if (r0 != r3) goto L87
            r0 = 4
            if (r1 != r0) goto L87
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L87
            return
        L87:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L9c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    public synchronized boolean B(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            r7.k()     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r7.j     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L43
            com.bumptech.glide.disklrucache.b$d r0 = (com.bumptech.glide.disklrucache.b.d) r0     // Catch: java.lang.Throwable -> L43
            r1 = 0
            if (r0 == 0) goto L8f
            com.bumptech.glide.disklrucache.b$c r2 = com.bumptech.glide.disklrucache.b.d.g(r0)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L17
            goto L8f
        L17:
            int r2 = r7.g     // Catch: java.lang.Throwable -> L43
            if (r1 >= r2) goto L5b
            java.io.File r2 = r0.j(r1)     // Catch: java.lang.Throwable -> L43
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L45
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L2c
            goto L45
        L2c:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch: java.lang.Throwable -> L43
            r0.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L43
            throw r8     // Catch: java.lang.Throwable -> L43
        L43:
            r8 = move-exception
            goto L91
        L45:
            long r2 = r7.h     // Catch: java.lang.Throwable -> L43
            long[] r4 = com.bumptech.glide.disklrucache.b.d.a(r0)     // Catch: java.lang.Throwable -> L43
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L43
            long r2 = r2 - r5
            r7.h = r2     // Catch: java.lang.Throwable -> L43
            long[] r2 = com.bumptech.glide.disklrucache.b.d.a(r0)     // Catch: java.lang.Throwable -> L43
            r3 = 0
            r2[r1] = r3     // Catch: java.lang.Throwable -> L43
            int r1 = r1 + 1
            goto L17
        L5b:
            int r0 = r7.k     // Catch: java.lang.Throwable -> L43
            r1 = 1
            int r0 = r0 + r1
            r7.k = r0     // Catch: java.lang.Throwable -> L43
            java.io.Writer r0 = r7.i     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch: java.lang.Throwable -> L43
            java.io.Writer r0 = r7.i     // Catch: java.lang.Throwable -> L43
            r2 = 32
            r0.append(r2)     // Catch: java.lang.Throwable -> L43
            java.io.Writer r0 = r7.i     // Catch: java.lang.Throwable -> L43
            r0.append(r8)     // Catch: java.lang.Throwable -> L43
            java.io.Writer r0 = r7.i     // Catch: java.lang.Throwable -> L43
            r2 = 10
            r0.append(r2)     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r7.j     // Catch: java.lang.Throwable -> L43
            r0.remove(r8)     // Catch: java.lang.Throwable -> L43
            boolean r8 = r7.v()     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto L8d
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f350m     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f351n     // Catch: java.lang.Throwable -> L43
            r8.submit(r0)     // Catch: java.lang.Throwable -> L43
        L8d:
            monitor-exit(r7)
            return r1
        L8f:
            monitor-exit(r7)
            return r1
        L91:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L43
            throw r8
    }

    public synchronized void D(long r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f = r1     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.ThreadPoolExecutor r1 = r0.f350m     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.Callable<java.lang.Void> r2 = r0.f351n     // Catch: java.lang.Throwable -> Lc
            r1.submit(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.io.Writer r0 = r3.i     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L7
            monitor-exit(r3)
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r1 = r3.j     // Catch: java.lang.Throwable -> L30
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L30
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.disklrucache.b$d r1 = (com.bumptech.glide.disklrucache.b.d) r1     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.disklrucache.b$c r2 = com.bumptech.glide.disklrucache.b.d.g(r1)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L16
            com.bumptech.glide.disklrucache.b$c r1 = com.bumptech.glide.disklrucache.b.d.g(r1)     // Catch: java.lang.Throwable -> L30
            r1.a()     // Catch: java.lang.Throwable -> L30
            goto L16
        L30:
            r0 = move-exception
            goto L3f
        L32:
            r3.E()     // Catch: java.lang.Throwable -> L30
            java.io.Writer r0 = r3.i     // Catch: java.lang.Throwable -> L30
            l(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r3.i = r0     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return
        L3f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    public void delete() throws java.io.IOException {
            r1 = this;
            r1.close()
            java.io.File r0 = r1.a
            com.bumptech.glide.disklrucache.d.b(r0)
            return
    }

    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.k()     // Catch: java.lang.Throwable -> Le
            r1.E()     // Catch: java.lang.Throwable -> Le
            java.io.Writer r0 = r1.i     // Catch: java.lang.Throwable -> Le
            q(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            java.io.Writer r0 = r1.i     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public com.bumptech.glide.disklrucache.b.c o(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = -1
            com.bumptech.glide.disklrucache.b$c r3 = r2.p(r3, r0)
            return r3
    }

    public synchronized com.bumptech.glide.disklrucache.b.e r(java.lang.String r9) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            r8.k()     // Catch: java.lang.Throwable -> L75
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.disklrucache.b$d> r0 = r8.j     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L75
            com.bumptech.glide.disklrucache.b$d r0 = (com.bumptech.glide.disklrucache.b.d) r0     // Catch: java.lang.Throwable -> L75
            r1 = 0
            if (r0 != 0) goto L11
            monitor-exit(r8)
            return r1
        L11:
            boolean r2 = com.bumptech.glide.disklrucache.b.d.e(r0)     // Catch: java.lang.Throwable -> L75
            if (r2 != 0) goto L19
            monitor-exit(r8)
            return r1
        L19:
            java.io.File[] r2 = r0.c     // Catch: java.lang.Throwable -> L75
            int r3 = r2.length     // Catch: java.lang.Throwable -> L75
            r4 = 0
        L1d:
            if (r4 >= r3) goto L30
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L29
            monitor-exit(r8)
            return r1
        L29:
            int r4 = r4 + 1
            goto L1d
        L2c:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L78
        L30:
            int r1 = r8.k     // Catch: java.lang.Throwable -> L75
            int r1 = r1 + 1
            r8.k = r1     // Catch: java.lang.Throwable -> L75
            java.io.Writer r1 = r8.i     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "READ"
            r1.append(r2)     // Catch: java.lang.Throwable -> L75
            java.io.Writer r1 = r8.i     // Catch: java.lang.Throwable -> L75
            r2 = 32
            r1.append(r2)     // Catch: java.lang.Throwable -> L75
            java.io.Writer r1 = r8.i     // Catch: java.lang.Throwable -> L75
            r1.append(r9)     // Catch: java.lang.Throwable -> L75
            java.io.Writer r1 = r8.i     // Catch: java.lang.Throwable -> L75
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> L75
            boolean r1 = r8.v()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L5d
            java.util.concurrent.ThreadPoolExecutor r1 = r8.f350m     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Callable<java.lang.Void> r2 = r8.f351n     // Catch: java.lang.Throwable -> L2c
            r1.submit(r2)     // Catch: java.lang.Throwable -> L2c
        L5d:
            r1 = r0
            com.bumptech.glide.disklrucache.b$e r0 = new com.bumptech.glide.disklrucache.b$e     // Catch: java.lang.Throwable -> L75
            long r3 = com.bumptech.glide.disklrucache.b.d.c(r1)     // Catch: java.lang.Throwable -> L75
            java.io.File[] r5 = r1.c     // Catch: java.lang.Throwable -> L75
            long[] r6 = com.bumptech.glide.disklrucache.b.d.a(r1)     // Catch: java.lang.Throwable -> L75
            r7 = 0
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r8)
            return r0
        L72:
            r0 = move-exception
        L73:
            r9 = r0
            goto L78
        L75:
            r0 = move-exception
            r1 = r8
            goto L73
        L78:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L72
            throw r9
    }

    public java.io.File s() {
            r1 = this;
            java.io.File r0 = r1.a
            return r0
    }

    public synchronized long size() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.h     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized long t() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.f     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
