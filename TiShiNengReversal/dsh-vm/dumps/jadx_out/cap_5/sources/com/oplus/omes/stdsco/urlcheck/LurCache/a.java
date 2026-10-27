package com.oplus.omes.stdsco.urlcheck.LurCache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements java.io.Closeable {
    private static final java.io.OutputStream A = null;
    static final java.lang.String o = "journal";
    static final java.lang.String p = "journal.tmp";
    static final java.lang.String q = "journal.bkp";
    static final java.lang.String r = "libcore.io.DiskLruCache";
    static final java.lang.String s = "1";
    static final long t = -1;
    static final java.lang.String u = "[a-z0-9_-]{1,120}";
    static final java.util.regex.Pattern v = null;
    private static final java.lang.String w = "CLEAN";
    private static final java.lang.String x = "DIRTY";
    private static final java.lang.String y = "REMOVE";
    private static final java.lang.String z = "READ";
    private final java.io.File a;
    private final java.io.File b;
    private final java.io.File c;
    private final java.io.File d;
    private final int e;
    private long f;
    private final int g;
    private long h;
    private java.io.Writer i;
    private final java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a.d> j;
    private int k;
    private long l;
    final java.util.concurrent.ThreadPoolExecutor m;
    private final java.util.concurrent.Callable<java.lang.Void> n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.oplus.omes.stdsco.urlcheck.LurCache.a$a, reason: collision with other inner class name */
    class CallableC0173a implements java.util.concurrent.Callable<java.lang.Void> {
        final /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a a;

        CallableC0173a(com.oplus.omes.stdsco.urlcheck.LurCache.a r1) {
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
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r4.a
                monitor-enter(r0)
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.a     // Catch: java.lang.Throwable -> Le
                java.io.Writer r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.a(r1)     // Catch: java.lang.Throwable -> Le
                r2 = 0
                if (r1 != 0) goto L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r2
            Le:
                r1 = move-exception
                goto L2a
            L10:
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.a     // Catch: java.lang.Throwable -> Le
                com.oplus.omes.stdsco.urlcheck.LurCache.a.b(r1)     // Catch: java.lang.Throwable -> Le
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.a     // Catch: java.lang.Throwable -> Le
                boolean r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.g(r1)     // Catch: java.lang.Throwable -> Le
                if (r1 == 0) goto L28
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.a     // Catch: java.lang.Throwable -> Le
                com.oplus.omes.stdsco.urlcheck.LurCache.a.j(r1)     // Catch: java.lang.Throwable -> Le
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.a     // Catch: java.lang.Throwable -> Le
                r3 = 0
                com.oplus.omes.stdsco.urlcheck.LurCache.a.k(r1, r3)     // Catch: java.lang.Throwable -> Le
            L28:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r2
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends java.io.OutputStream {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.OutputStream
        public void write(int r1) throws java.io.IOException {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class c {
        private final com.oplus.omes.stdsco.urlcheck.LurCache.a.d a;
        private final boolean[] b;
        private boolean c;
        private boolean d;
        final /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.oplus.omes.stdsco.urlcheck.LurCache.a$c$a, reason: collision with other inner class name */
        private class C0174a extends java.io.FilterOutputStream {
            final /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a.c a;

            private C0174a(com.oplus.omes.stdsco.urlcheck.LurCache.a.c r1, java.io.OutputStream r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    return
            }

            /* synthetic */ C0174a(com.oplus.omes.stdsco.urlcheck.LurCache.a.c r1, java.io.OutputStream r2, com.oplus.omes.stdsco.urlcheck.LurCache.a.CallableC0173a r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                    r2 = this;
                    java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> L6
                    r0.close()     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.oplus.omes.stdsco.urlcheck.LurCache.a$c r0 = r2.a
                    r1 = 1
                    com.oplus.omes.stdsco.urlcheck.LurCache.a.c.e(r0, r1)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                    r2 = this;
                    java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> L6
                    r0.flush()     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.oplus.omes.stdsco.urlcheck.LurCache.a$c r0 = r2.a
                    r1 = 1
                    com.oplus.omes.stdsco.urlcheck.LurCache.a.c.e(r0, r1)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int r2) {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.write(r2)     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.oplus.omes.stdsco.urlcheck.LurCache.a$c r2 = r1.a
                    r0 = 1
                    com.oplus.omes.stdsco.urlcheck.LurCache.a.c.e(r2, r0)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] r2, int r3, int r4) {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.write(r2, r3, r4)     // Catch: java.io.IOException -> L6
                    return
                L6:
                    com.oplus.omes.stdsco.urlcheck.LurCache.a$c r2 = r1.a
                    r3 = 1
                    com.oplus.omes.stdsco.urlcheck.LurCache.a.c.e(r2, r3)
                    return
            }
        }

        private c(com.oplus.omes.stdsco.urlcheck.LurCache.a r1, com.oplus.omes.stdsco.urlcheck.LurCache.a.d r2) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.a = r2
                boolean r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.e(r2)
                if (r2 == 0) goto Lf
                r1 = 0
                goto L15
            Lf:
                int r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.e(r1)
                boolean[] r1 = new boolean[r1]
            L15:
                r0.b = r1
                return
        }

        /* synthetic */ c(com.oplus.omes.stdsco.urlcheck.LurCache.a r1, com.oplus.omes.stdsco.urlcheck.LurCache.a.d r2, com.oplus.omes.stdsco.urlcheck.LurCache.a.CallableC0173a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a.d c(com.oplus.omes.stdsco.urlcheck.LurCache.a.c r0) {
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r0 = r0.a
                return r0
        }

        static /* synthetic */ boolean[] d(com.oplus.omes.stdsco.urlcheck.LurCache.a.c r0) {
                boolean[] r0 = r0.b
                return r0
        }

        static /* synthetic */ boolean e(com.oplus.omes.stdsco.urlcheck.LurCache.a.c r0, boolean r1) {
                r0.c = r1
                return r1
        }

        public void a() throws java.io.IOException {
                r2 = this;
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r2.e
                r1 = 0
                com.oplus.omes.stdsco.urlcheck.LurCache.a.i(r0, r2, r1)
                return
        }

        public void b() {
                r1 = this;
                boolean r0 = r1.d
                if (r0 != 0) goto L7
                r1.a()     // Catch: java.io.IOException -> L7
            L7:
                return
        }

        public void f() throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.c
                r1 = 1
                if (r0 == 0) goto L17
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r3.e
                r2 = 0
                com.oplus.omes.stdsco.urlcheck.LurCache.a.i(r0, r3, r2)
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r3.e
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r2 = r3.a
                java.lang.String r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.b(r2)
                r0.B(r2)
                goto L1c
            L17:
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r3.e
                com.oplus.omes.stdsco.urlcheck.LurCache.a.i(r0, r3, r1)
            L1c:
                r3.d = r1
                return
        }

        public java.lang.String g(int r1) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = r0.h(r1)
                if (r1 == 0) goto Lb
                java.lang.String r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        public java.io.InputStream h(int r5) throws java.io.IOException {
                r4 = this;
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r4.e
                monitor-enter(r0)
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r1 = r4.a     // Catch: java.lang.Throwable -> L16
                com.oplus.omes.stdsco.urlcheck.LurCache.a$c r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r1)     // Catch: java.lang.Throwable -> L16
                if (r1 != r4) goto L27
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r1 = r4.a     // Catch: java.lang.Throwable -> L16
                boolean r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.e(r1)     // Catch: java.lang.Throwable -> L16
                r2 = 0
                if (r1 != 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return r2
            L16:
                r5 = move-exception
                goto L2d
            L18:
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L25
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r3 = r4.a     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L25
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

        public java.io.OutputStream i(int r4) throws java.io.IOException {
                r3 = this;
                if (r4 < 0) goto L55
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r3.e
                int r0 = com.oplus.omes.stdsco.urlcheck.LurCache.a.e(r0)
                if (r4 >= r0) goto L55
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r3.e
                monitor-enter(r0)
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r1 = r3.a     // Catch: java.lang.Throwable -> L23
                com.oplus.omes.stdsco.urlcheck.LurCache.a$c r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r1)     // Catch: java.lang.Throwable -> L23
                if (r1 != r3) goto L4d
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r1 = r3.a     // Catch: java.lang.Throwable -> L23
                boolean r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.e(r1)     // Catch: java.lang.Throwable -> L23
                if (r1 != 0) goto L25
                boolean[] r1 = r3.b     // Catch: java.lang.Throwable -> L23
                r2 = 1
                r1[r4] = r2     // Catch: java.lang.Throwable -> L23
                goto L25
            L23:
                r4 = move-exception
                goto L53
            L25:
                com.oplus.omes.stdsco.urlcheck.LurCache.a$d r1 = r3.a     // Catch: java.lang.Throwable -> L23
                java.io.File r4 = r1.k(r4)     // Catch: java.lang.Throwable -> L23
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23 java.io.FileNotFoundException -> L31
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L23 java.io.FileNotFoundException -> L31
                goto L3f
            L31:
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r3.e     // Catch: java.lang.Throwable -> L23
                java.io.File r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.f(r1)     // Catch: java.lang.Throwable -> L23
                r1.mkdirs()     // Catch: java.lang.Throwable -> L23
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23 java.io.FileNotFoundException -> L47
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L23 java.io.FileNotFoundException -> L47
            L3f:
                com.oplus.omes.stdsco.urlcheck.LurCache.a$c$a r4 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$c$a     // Catch: java.lang.Throwable -> L23
                r2 = 0
                r4.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L23
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                return r4
            L47:
                java.io.OutputStream r4 = com.oplus.omes.stdsco.urlcheck.LurCache.a.h()     // Catch: java.lang.Throwable -> L23
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                return r4
            L4d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
                r4.<init>()     // Catch: java.lang.Throwable -> L23
                throw r4     // Catch: java.lang.Throwable -> L23
            L53:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                throw r4
            L55:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected index "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r4)
                com.oplus.omes.stdsco.urlcheck.LurCache.a r4 = r3.e
                int r4 = com.oplus.omes.stdsco.urlcheck.LurCache.a.e(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public void j(int r4, java.lang.String r5) throws java.io.IOException {
                r3 = this;
                r0 = 0
                java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L16
                java.io.OutputStream r4 = r3.i(r4)     // Catch: java.lang.Throwable -> L16
                java.nio.charset.Charset r2 = com.oplus.omes.stdsco.urlcheck.LurCache.c.b     // Catch: java.lang.Throwable -> L16
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L16
                r1.write(r5)     // Catch: java.lang.Throwable -> L13
                com.oplus.omes.stdsco.urlcheck.LurCache.c.a(r1)
                return
            L13:
                r4 = move-exception
                r0 = r1
                goto L17
            L16:
                r4 = move-exception
            L17:
                com.oplus.omes.stdsco.urlcheck.LurCache.c.a(r0)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class d {
        private final java.lang.String a;
        private final long[] b;
        private boolean c;
        private com.oplus.omes.stdsco.urlcheck.LurCache.a.c d;
        private long e;
        final /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a f;

        private d(com.oplus.omes.stdsco.urlcheck.LurCache.a r1, java.lang.String r2) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                r0.a = r2
                int r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.e(r1)
                long[] r1 = new long[r1]
                r0.b = r1
                return
        }

        /* synthetic */ d(com.oplus.omes.stdsco.urlcheck.LurCache.a r1, java.lang.String r2, com.oplus.omes.stdsco.urlcheck.LurCache.a.CallableC0173a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ long[] a(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0) {
                long[] r0 = r0.b
                return r0
        }

        static /* synthetic */ java.lang.String b(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ long c(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r2) {
                long r0 = r2.e
                return r0
        }

        static /* synthetic */ long d(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0, long r1) {
                r0.e = r1
                return r1
        }

        static /* synthetic */ boolean e(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0) {
                boolean r0 = r0.c
                return r0
        }

        static /* synthetic */ boolean f(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0, boolean r1) {
                r0.c = r1
                return r1
        }

        static /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a.c g(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0) {
                com.oplus.omes.stdsco.urlcheck.LurCache.a$c r0 = r0.d
                return r0
        }

        static /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a.c h(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0, com.oplus.omes.stdsco.urlcheck.LurCache.a.c r1) {
                r0.d = r1
                return r1
        }

        static /* synthetic */ void i(com.oplus.omes.stdsco.urlcheck.LurCache.a.d r0, java.lang.String[] r1) throws java.io.IOException {
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
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.f
                int r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.e(r1)
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

        public java.io.File j(int r5) {
                r4 = this;
                java.io.File r0 = new java.io.File
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.f
                java.io.File r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.f(r1)
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

        public java.io.File k(int r5) {
                r4 = this;
                java.io.File r0 = new java.io.File
                com.oplus.omes.stdsco.urlcheck.LurCache.a r1 = r4.f
                java.io.File r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.f(r1)
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
    public final class e implements java.io.Closeable {
        private final java.lang.String a;
        private final long b;
        private final java.io.InputStream[] c;
        private final long[] d;
        final /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a e;

        private e(com.oplus.omes.stdsco.urlcheck.LurCache.a r1, java.lang.String r2, long r3, java.io.InputStream[] r5, long[] r6) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.d = r6
                return
        }

        /* synthetic */ e(com.oplus.omes.stdsco.urlcheck.LurCache.a r1, java.lang.String r2, long r3, java.io.InputStream[] r5, long[] r6, com.oplus.omes.stdsco.urlcheck.LurCache.a.CallableC0173a r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5, r6)
                return
        }

        public com.oplus.omes.stdsco.urlcheck.LurCache.a.c a() throws java.io.IOException {
                r4 = this;
                com.oplus.omes.stdsco.urlcheck.LurCache.a r0 = r4.e
                java.lang.String r1 = r4.a
                long r2 = r4.b
                com.oplus.omes.stdsco.urlcheck.LurCache.a$c r0 = com.oplus.omes.stdsco.urlcheck.LurCache.a.c(r0, r1, r2)
                return r0
        }

        public java.io.InputStream b(int r2) {
                r1 = this;
                java.io.InputStream[] r0 = r1.c
                r2 = r0[r2]
                return r2
        }

        public long c(int r4) {
                r3 = this;
                long[] r0 = r3.d
                r1 = r0[r4]
                return r1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                java.io.InputStream[] r0 = r4.c
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                com.oplus.omes.stdsco.urlcheck.LurCache.c.a(r3)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        public java.lang.String getString(int r1) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = r0.b(r1)
                java.lang.String r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d(r1)
                return r1
        }
    }

    static {
            java.lang.String r0 = "[a-z0-9_-]{1,120}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.oplus.omes.stdsco.urlcheck.LurCache.a.v = r0
            com.oplus.omes.stdsco.urlcheck.LurCache.a$b r0 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$b
            r0.<init>()
            com.oplus.omes.stdsco.urlcheck.LurCache.a.A = r0
            return
    }

    private a(java.io.File r14, int r15, int r16, long r17) {
            r13 = this;
            r13.<init>()
            r0 = 0
            r13.h = r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 1061158912(0x3f400000, float:0.75)
            r4 = 1
            r5 = 0
            r2.<init>(r5, r3, r4)
            r13.j = r2
            r13.l = r0
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r12 = new java.util.concurrent.LinkedBlockingQueue
            r12.<init>()
            r7 = 0
            r8 = 1
            r9 = 60
            r6.<init>(r7, r8, r9, r11, r12)
            r13.m = r6
            com.oplus.omes.stdsco.urlcheck.LurCache.a$a r0 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$a
            r0.<init>(r13)
            r13.n = r0
            r13.a = r14
            r13.e = r15
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal"
            r0.<init>(r14, r1)
            r13.b = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.tmp"
            r0.<init>(r14, r1)
            r13.c = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r14, r1)
            r13.d = r0
            r14 = r16
            r13.g = r14
            r0 = r17
            r13.f = r0
            return
    }

    private synchronized void A() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.i     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.lang.Throwable -> L9
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
            java.nio.charset.Charset r3 = com.oplus.omes.stdsco.urlcheck.LurCache.c.a     // Catch: java.lang.Throwable -> L9
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
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r1 = r6.j     // Catch: java.lang.Throwable -> L8e
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8e
        L5e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8e
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r2 = (com.oplus.omes.stdsco.urlcheck.LurCache.a.d) r2     // Catch: java.lang.Throwable -> L8e
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r3 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r2)     // Catch: java.lang.Throwable -> L8e
            r4 = 10
            if (r3 == 0) goto L90
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.b(r2)     // Catch: java.lang.Throwable -> L8e
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
            java.lang.String r5 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.b(r2)     // Catch: java.lang.Throwable -> L8e
            r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r2.l()     // Catch: java.lang.Throwable -> L8e
            r3.append(r2)     // Catch: java.lang.Throwable -> L8e
            r3.append(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            r0.write(r2)     // Catch: java.lang.Throwable -> L8e
            goto L5e
        Lb3:
            r0.close()     // Catch: java.lang.Throwable -> L9
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
            java.nio.charset.Charset r1 = com.oplus.omes.stdsco.urlcheck.LurCache.c.a     // Catch: java.lang.Throwable -> L9
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r6.i = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r6)
            return
        Lea:
            r0.close()     // Catch: java.lang.Throwable -> L9
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
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r0 = r5.j
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

    private void F(java.lang.String r4) {
            r3 = this;
            java.util.regex.Pattern r0 = com.oplus.omes.stdsco.urlcheck.LurCache.a.v
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "keys must match regex [a-z0-9_-]{1,120}: \""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "\""
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    static /* synthetic */ java.io.Writer a(com.oplus.omes.stdsco.urlcheck.LurCache.a r0) {
            java.io.Writer r0 = r0.i
            return r0
    }

    static /* synthetic */ void b(com.oplus.omes.stdsco.urlcheck.LurCache.a r0) throws java.io.IOException {
            r0.E()
            return
    }

    static /* synthetic */ com.oplus.omes.stdsco.urlcheck.LurCache.a.c c(com.oplus.omes.stdsco.urlcheck.LurCache.a r0, java.lang.String r1, long r2) throws java.io.IOException {
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r0 = r0.p(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.String d(java.io.InputStream r0) throws java.io.IOException {
            java.lang.String r0 = u(r0)
            return r0
    }

    static /* synthetic */ int e(com.oplus.omes.stdsco.urlcheck.LurCache.a r0) {
            int r0 = r0.g
            return r0
    }

    static /* synthetic */ java.io.File f(com.oplus.omes.stdsco.urlcheck.LurCache.a r0) {
            java.io.File r0 = r0.a
            return r0
    }

    static /* synthetic */ boolean g(com.oplus.omes.stdsco.urlcheck.LurCache.a r0) {
            boolean r0 = r0.v()
            return r0
    }

    static /* synthetic */ java.io.OutputStream h() {
            java.io.OutputStream r0 = com.oplus.omes.stdsco.urlcheck.LurCache.a.A
            return r0
    }

    static /* synthetic */ void i(com.oplus.omes.stdsco.urlcheck.LurCache.a r0, com.oplus.omes.stdsco.urlcheck.LurCache.a.c r1, boolean r2) throws java.io.IOException {
            r0.m(r1, r2)
            return
    }

    static /* synthetic */ void j(com.oplus.omes.stdsco.urlcheck.LurCache.a r0) throws java.io.IOException {
            r0.A()
            return
    }

    static /* synthetic */ int k(com.oplus.omes.stdsco.urlcheck.LurCache.a r0, int r1) {
            r0.k = r1
            return r1
    }

    private void l() {
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

    private synchronized void m(com.oplus.omes.stdsco.urlcheck.LurCache.a.c r10, boolean r11) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r0 = com.oplus.omes.stdsco.urlcheck.LurCache.a.c.c(r10)     // Catch: java.lang.Throwable -> L30
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r0)     // Catch: java.lang.Throwable -> L30
            if (r1 != r10) goto L10d
            r1 = 0
            if (r11 == 0) goto L50
            boolean r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.e(r0)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L50
            r2 = 0
        L15:
            int r3 = r9.g     // Catch: java.lang.Throwable -> L30
            if (r2 >= r3) goto L50
            boolean[] r3 = com.oplus.omes.stdsco.urlcheck.LurCache.a.c.d(r10)     // Catch: java.lang.Throwable -> L30
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
            goto L113
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
            long[] r10 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.a(r0)     // Catch: java.lang.Throwable -> L30
            r3 = r10[r1]     // Catch: java.lang.Throwable -> L30
            long r5 = r2.length()     // Catch: java.lang.Throwable -> L30
            long[] r10 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.a(r0)     // Catch: java.lang.Throwable -> L30
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
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.h(r0, r10)     // Catch: java.lang.Throwable -> L30
            boolean r10 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.e(r0)     // Catch: java.lang.Throwable -> L30
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto Lcb
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.f(r0, r1)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.b(r0)     // Catch: java.lang.Throwable -> L30
            r1.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r0.l()     // Catch: java.lang.Throwable -> L30
            r1.append(r3)     // Catch: java.lang.Throwable -> L30
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L30
            r10.write(r1)     // Catch: java.lang.Throwable -> L30
            if (r11 == 0) goto Lf1
            long r10 = r9.l     // Catch: java.lang.Throwable -> L30
            r1 = 1
            long r1 = r1 + r10
            r9.l = r1     // Catch: java.lang.Throwable -> L30
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.d(r0, r10)     // Catch: java.lang.Throwable -> L30
            goto Lf1
        Lcb:
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r10 = r9.j     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.b(r0)     // Catch: java.lang.Throwable -> L30
            r10.remove(r11)     // Catch: java.lang.Throwable -> L30
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r11.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.b(r0)     // Catch: java.lang.Throwable -> L30
            r11.append(r0)     // Catch: java.lang.Throwable -> L30
            r11.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L30
            r10.write(r11)     // Catch: java.lang.Throwable -> L30
        Lf1:
            java.io.Writer r10 = r9.i     // Catch: java.lang.Throwable -> L30
            r10.flush()     // Catch: java.lang.Throwable -> L30
            long r10 = r9.h     // Catch: java.lang.Throwable -> L30
            long r0 = r9.f     // Catch: java.lang.Throwable -> L30
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L104
            boolean r10 = r9.v()     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L10b
        L104:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.m     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.n     // Catch: java.lang.Throwable -> L30
            r10.submit(r11)     // Catch: java.lang.Throwable -> L30
        L10b:
            monitor-exit(r9)
            return
        L10d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            r10.<init>()     // Catch: java.lang.Throwable -> L30
            throw r10     // Catch: java.lang.Throwable -> L30
        L113:
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

    private synchronized com.oplus.omes.stdsco.urlcheck.LurCache.a.c p(java.lang.String r6, long r7) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            r5.l()     // Catch: java.lang.Throwable -> L21
            r5.F(r6)     // Catch: java.lang.Throwable -> L21
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r0 = r5.j     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L21
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r0 = (com.oplus.omes.stdsco.urlcheck.LurCache.a.d) r0     // Catch: java.lang.Throwable -> L21
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L25
            if (r0 == 0) goto L23
            long r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.c(r0)     // Catch: java.lang.Throwable -> L21
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L25
            goto L23
        L21:
            r6 = move-exception
            goto L64
        L23:
            monitor-exit(r5)
            return r3
        L25:
            if (r0 != 0) goto L32
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r0 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$d     // Catch: java.lang.Throwable -> L21
            r0.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L21
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r7 = r5.j     // Catch: java.lang.Throwable -> L21
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L21
            goto L3a
        L32:
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r7 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r0)     // Catch: java.lang.Throwable -> L21
            if (r7 == 0) goto L3a
            monitor-exit(r5)
            return r3
        L3a:
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r7 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$c     // Catch: java.lang.Throwable -> L21
            r7.<init>(r5, r0, r3)     // Catch: java.lang.Throwable -> L21
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.h(r0, r7)     // Catch: java.lang.Throwable -> L21
            java.io.Writer r8 = r5.i     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch: java.lang.Throwable -> L21
            r0.append(r6)     // Catch: java.lang.Throwable -> L21
            r6 = 10
            r0.append(r6)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L21
            r8.write(r6)     // Catch: java.lang.Throwable -> L21
            java.io.Writer r6 = r5.i     // Catch: java.lang.Throwable -> L21
            r6.flush()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r5)
            return r7
        L64:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L21
            throw r6
    }

    private static java.lang.String u(java.io.InputStream r2) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.charset.Charset r1 = com.oplus.omes.stdsco.urlcheck.LurCache.c.b
            r0.<init>(r2, r1)
            java.lang.String r2 = com.oplus.omes.stdsco.urlcheck.LurCache.c.c(r0)
            return r2
    }

    private boolean v() {
            r2 = this;
            int r0 = r2.k
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r1 = r2.j
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static com.oplus.omes.stdsco.urlcheck.LurCache.a w(java.io.File r10, int r11, int r12, long r13) throws java.io.IOException {
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
            com.oplus.omes.stdsco.urlcheck.LurCache.a r3 = new com.oplus.omes.stdsco.urlcheck.LurCache.a
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
            com.oplus.omes.stdsco.urlcheck.LurCache.a r4 = new com.oplus.omes.stdsco.urlcheck.LurCache.a
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
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r0 = r8.j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r1 = (com.oplus.omes.stdsco.urlcheck.LurCache.a.d) r1
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r1)
            r3 = 0
            if (r2 != 0) goto L34
        L22:
            int r2 = r8.g
            if (r3 >= r2) goto Lf
            long r4 = r8.h
            long[] r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.a(r1)
            r6 = r2[r3]
            long r4 = r4 + r6
            r8.h = r4
            int r3 = r3 + 1
            goto L22
        L34:
            r2 = 0
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.h(r1, r2)
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
            com.oplus.omes.stdsco.urlcheck.LurCache.b r1 = new com.oplus.omes.stdsco.urlcheck.LurCache.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.oplus.omes.stdsco.urlcheck.LurCache.c.a
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
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r2 = r9.j     // Catch: java.lang.Throwable -> L5f
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
            java.nio.charset.Charset r4 = com.oplus.omes.stdsco.urlcheck.LurCache.c.a     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            r9.i = r0     // Catch: java.lang.Throwable -> L5f
        L8a:
            com.oplus.omes.stdsco.urlcheck.LurCache.c.a(r1)
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
            com.oplus.omes.stdsco.urlcheck.LurCache.c.a(r1)
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
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r9 = r8.j
            r9.remove(r4)
            return
        L28:
            java.lang.String r4 = r9.substring(r4, r0)
        L2c:
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r5 = r8.j
            java.lang.Object r5 = r5.get(r4)
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r5 = (com.oplus.omes.stdsco.urlcheck.LurCache.a.d) r5
            r6 = 0
            if (r5 != 0) goto L41
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r5 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$d
            r5.<init>(r8, r4, r6)
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r7 = r8.j
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
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.f(r5, r1)
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.h(r5, r6)
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.i(r5, r9)
            return
        L64:
            if (r0 != r3) goto L79
            if (r1 != r4) goto L79
            java.lang.String r4 = "DIRTY"
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto L79
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r9 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$c
            r9.<init>(r8, r5, r6)
            com.oplus.omes.stdsco.urlcheck.LurCache.a.d.h(r5, r9)
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
            r7.l()     // Catch: java.lang.Throwable -> L46
            r7.F(r8)     // Catch: java.lang.Throwable -> L46
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r0 = r7.j     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L46
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r0 = (com.oplus.omes.stdsco.urlcheck.LurCache.a.d) r0     // Catch: java.lang.Throwable -> L46
            r1 = 0
            if (r0 == 0) goto L93
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r0)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1a
            goto L93
        L1a:
            int r2 = r7.g     // Catch: java.lang.Throwable -> L46
            if (r1 >= r2) goto L5e
            java.io.File r2 = r0.j(r1)     // Catch: java.lang.Throwable -> L46
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L48
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L2f
            goto L48
        L2f:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch: java.lang.Throwable -> L46
            r0.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L46
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L46
            throw r8     // Catch: java.lang.Throwable -> L46
        L46:
            r8 = move-exception
            goto L95
        L48:
            long r2 = r7.h     // Catch: java.lang.Throwable -> L46
            long[] r4 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.a(r0)     // Catch: java.lang.Throwable -> L46
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L46
            long r2 = r2 - r5
            r7.h = r2     // Catch: java.lang.Throwable -> L46
            long[] r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.a(r0)     // Catch: java.lang.Throwable -> L46
            r3 = 0
            r2[r1] = r3     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + 1
            goto L1a
        L5e:
            int r0 = r7.k     // Catch: java.lang.Throwable -> L46
            r1 = 1
            int r0 = r0 + r1
            r7.k = r0     // Catch: java.lang.Throwable -> L46
            java.io.Writer r0 = r7.i     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch: java.lang.Throwable -> L46
            r2.append(r8)     // Catch: java.lang.Throwable -> L46
            r3 = 10
            r2.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L46
            r0.append(r2)     // Catch: java.lang.Throwable -> L46
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r0 = r7.j     // Catch: java.lang.Throwable -> L46
            r0.remove(r8)     // Catch: java.lang.Throwable -> L46
            boolean r8 = r7.v()     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L91
            java.util.concurrent.ThreadPoolExecutor r8 = r7.m     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.n     // Catch: java.lang.Throwable -> L46
            r8.submit(r0)     // Catch: java.lang.Throwable -> L46
        L91:
            monitor-exit(r7)
            return r1
        L93:
            monitor-exit(r7)
            return r1
        L95:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
    }

    public synchronized void D(long r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f = r1     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.ThreadPoolExecutor r1 = r0.m     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.Callable<java.lang.Void> r2 = r0.n     // Catch: java.lang.Throwable -> Lc
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
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r1 = r3.j     // Catch: java.lang.Throwable -> L30
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L30
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L30
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r1 = (com.oplus.omes.stdsco.urlcheck.LurCache.a.d) r1     // Catch: java.lang.Throwable -> L30
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r1)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L16
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r1 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.g(r1)     // Catch: java.lang.Throwable -> L30
            r1.a()     // Catch: java.lang.Throwable -> L30
            goto L16
        L30:
            r0 = move-exception
            goto L3f
        L32:
            r3.E()     // Catch: java.lang.Throwable -> L30
            java.io.Writer r0 = r3.i     // Catch: java.lang.Throwable -> L30
            r0.close()     // Catch: java.lang.Throwable -> L30
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
            com.oplus.omes.stdsco.urlcheck.LurCache.c.b(r0)
            return
    }

    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.l()     // Catch: java.lang.Throwable -> Le
            r1.E()     // Catch: java.lang.Throwable -> Le
            java.io.Writer r0 = r1.i     // Catch: java.lang.Throwable -> Le
            r0.flush()     // Catch: java.lang.Throwable -> Le
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

    public com.oplus.omes.stdsco.urlcheck.LurCache.a.c o(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = -1
            com.oplus.omes.stdsco.urlcheck.LurCache.a$c r3 = r2.p(r3, r0)
            return r3
    }

    public synchronized com.oplus.omes.stdsco.urlcheck.LurCache.a.e q(java.lang.String r12) throws java.io.IOException {
            r11 = this;
            monitor-enter(r11)
            r11.l()     // Catch: java.lang.Throwable -> L7d
            r11.F(r12)     // Catch: java.lang.Throwable -> L7d
            java.util.LinkedHashMap<java.lang.String, com.oplus.omes.stdsco.urlcheck.LurCache.a$d> r0 = r11.j     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L7d
            com.oplus.omes.stdsco.urlcheck.LurCache.a$d r0 = (com.oplus.omes.stdsco.urlcheck.LurCache.a.d) r0     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            if (r0 != 0) goto L14
            monitor-exit(r11)
            return r1
        L14:
            boolean r2 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.e(r0)     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L1c
            monitor-exit(r11)
            return r1
        L1c:
            int r2 = r11.g     // Catch: java.lang.Throwable -> L7d
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            r3 = 0
        L22:
            int r4 = r11.g     // Catch: java.io.FileNotFoundException -> L38 java.lang.Throwable -> L7d
            if (r3 >= r4) goto L3a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            java.io.File r5 = r0.j(r3)     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            r8[r3] = r4     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            int r3 = r3 + 1
            goto L22
        L34:
            r0 = move-exception
            r12 = r0
            r4 = r11
            goto L90
        L38:
            r4 = r11
            goto L80
        L3a:
            int r1 = r11.k     // Catch: java.lang.Throwable -> L7d
            int r1 = r1 + 1
            r11.k = r1     // Catch: java.lang.Throwable -> L7d
            java.io.Writer r1 = r11.i     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7d
            r2.append(r12)     // Catch: java.lang.Throwable -> L7d
            r3 = 10
            r2.append(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r11.v()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L68
            java.util.concurrent.ThreadPoolExecutor r1 = r11.m     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.n     // Catch: java.lang.Throwable -> L34
            r1.submit(r2)     // Catch: java.lang.Throwable -> L34
        L68:
            com.oplus.omes.stdsco.urlcheck.LurCache.a$e r3 = new com.oplus.omes.stdsco.urlcheck.LurCache.a$e     // Catch: java.lang.Throwable -> L7d
            long r6 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.c(r0)     // Catch: java.lang.Throwable -> L7d
            long[] r9 = com.oplus.omes.stdsco.urlcheck.LurCache.a.d.a(r0)     // Catch: java.lang.Throwable -> L7d
            r10 = 0
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r11)
            return r3
        L7a:
            r0 = move-exception
        L7b:
            r12 = r0
            goto L90
        L7d:
            r0 = move-exception
            r4 = r11
            goto L7b
        L80:
            int r12 = r4.g     // Catch: java.lang.Throwable -> L7a
            if (r2 >= r12) goto L8e
            r12 = r8[r2]     // Catch: java.lang.Throwable -> L7a
            if (r12 == 0) goto L8e
            com.oplus.omes.stdsco.urlcheck.LurCache.c.a(r12)     // Catch: java.lang.Throwable -> L7a
            int r2 = r2 + 1
            goto L80
        L8e:
            monitor-exit(r11)
            return r1
        L90:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7a
            throw r12
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
