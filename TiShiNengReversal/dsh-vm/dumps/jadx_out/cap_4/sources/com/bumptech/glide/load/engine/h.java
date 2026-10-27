package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class h<R> implements com.bumptech.glide.load.engine.f.a, java.lang.Runnable, java.lang.Comparable<com.bumptech.glide.load.engine.h<?>>, com.bumptech.glide.util.pool.a.f {
    private static final java.lang.String G = "DecodeJob";
    private com.bumptech.glide.load.DataSource A;
    private com.bumptech.glide.load.data.d<?> B;
    private volatile com.bumptech.glide.load.engine.f C;
    private volatile boolean D;
    private volatile boolean E;
    private boolean F;
    private final com.bumptech.glide.load.engine.g<R> a;
    private final java.util.List<java.lang.Throwable> b;
    private final com.bumptech.glide.util.pool.c c;
    private final com.bumptech.glide.load.engine.h.e d;
    private final androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.h<?>> e;
    private final com.bumptech.glide.load.engine.h.d<?> f;
    private final com.bumptech.glide.load.engine.h.f g;
    private com.bumptech.glide.d h;
    private com.bumptech.glide.load.c i;
    private com.bumptech.glide.Priority j;
    private com.bumptech.glide.load.engine.n k;

    /* renamed from: l, reason: collision with root package name */
    private int f403l;

    /* renamed from: m, reason: collision with root package name */
    private int f404m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f405n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.f f406o;

    /* renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.load.engine.h.b<R> f407p;

    /* renamed from: q, reason: collision with root package name */
    private int f408q;

    /* renamed from: r, reason: collision with root package name */
    private com.bumptech.glide.load.engine.h.EnumC0024h f409r;

    /* renamed from: s, reason: collision with root package name */
    private com.bumptech.glide.load.engine.h.g f410s;

    /* renamed from: t, reason: collision with root package name */
    private long f411t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f412u;

    /* renamed from: v, reason: collision with root package name */
    private java.lang.Object f413v;

    /* renamed from: w, reason: collision with root package name */
    private java.lang.Thread f414w;

    /* renamed from: x, reason: collision with root package name */
    private com.bumptech.glide.load.c f415x;

    /* renamed from: y, reason: collision with root package name */
    private com.bumptech.glide.load.c f416y;

    /* renamed from: z, reason: collision with root package name */
    private java.lang.Object f417z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;
        static final /* synthetic */ int[] c = null;

        static {
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.load.engine.h.a.c = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.bumptech.glide.load.engine.h.a.c     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                com.bumptech.glide.load.engine.h$h[] r2 = com.bumptech.glide.load.engine.h.EnumC0024h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.bumptech.glide.load.engine.h.a.b = r2
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.h.EnumC0024h.b     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r2 = com.bumptech.glide.load.engine.h.a.b     // Catch: java.lang.NoSuchFieldError -> L38
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.h.EnumC0024h.c     // Catch: java.lang.NoSuchFieldError -> L38
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                r2 = 3
                int[] r3 = com.bumptech.glide.load.engine.h.a.b     // Catch: java.lang.NoSuchFieldError -> L43
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.d     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r3 = com.bumptech.glide.load.engine.h.a.b     // Catch: java.lang.NoSuchFieldError -> L4e
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.f     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r5 = 4
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r3 = com.bumptech.glide.load.engine.h.a.b     // Catch: java.lang.NoSuchFieldError -> L59
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.a     // Catch: java.lang.NoSuchFieldError -> L59
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r5 = 5
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                com.bumptech.glide.load.engine.h$g[] r3 = com.bumptech.glide.load.engine.h.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.bumptech.glide.load.engine.h.a.a = r3
                com.bumptech.glide.load.engine.h$g r4 = com.bumptech.glide.load.engine.h.g.a     // Catch: java.lang.NoSuchFieldError -> L6a
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6a
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L6a
            L6a:
                int[] r1 = com.bumptech.glide.load.engine.h.a.a     // Catch: java.lang.NoSuchFieldError -> L74
                com.bumptech.glide.load.engine.h$g r3 = com.bumptech.glide.load.engine.h.g.b     // Catch: java.lang.NoSuchFieldError -> L74
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L74
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L74
            L74:
                int[] r0 = com.bumptech.glide.load.engine.h.a.a     // Catch: java.lang.NoSuchFieldError -> L7e
                com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.h.g.c     // Catch: java.lang.NoSuchFieldError -> L7e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7e
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7e
            L7e:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface b<R> {
        void b(com.bumptech.glide.load.engine.GlideException r1);

        void c(com.bumptech.glide.load.engine.u<R> r1, com.bumptech.glide.load.DataSource r2, boolean r3);

        void d(com.bumptech.glide.load.engine.h<?> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class c<Z> implements com.bumptech.glide.load.engine.i.a<Z> {
        private final com.bumptech.glide.load.DataSource a;
        final /* synthetic */ com.bumptech.glide.load.engine.h b;

        c(com.bumptech.glide.load.engine.h r1, com.bumptech.glide.load.DataSource r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // com.bumptech.glide.load.engine.i.a
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.engine.u<Z> a(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<Z> r3) {
                r2 = this;
                com.bumptech.glide.load.engine.h r0 = r2.b
                com.bumptech.glide.load.DataSource r1 = r2.a
                com.bumptech.glide.load.engine.u r3 = r0.x(r1, r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d<Z> {
        private com.bumptech.glide.load.c a;
        private com.bumptech.glide.load.h<Z> b;
        private com.bumptech.glide.load.engine.t<Z> c;

        d() {
                r0 = this;
                r0.<init>()
                return
        }

        void a() {
                r1 = this;
                r0 = 0
                r1.a = r0
                r1.b = r0
                r1.c = r0
                return
        }

        void b(com.bumptech.glide.load.engine.h.e r5, com.bumptech.glide.load.f r6) {
                r4 = this;
                java.lang.String r0 = "DecodeJob.encode"
                com.bumptech.glide.util.pool.b.a(r0)
                com.bumptech.glide.load.engine.cache.a r5 = r5.a()     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.c r0 = r4.a     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.engine.e r1 = new com.bumptech.glide.load.engine.e     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.h<Z> r2 = r4.b     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.engine.t<Z> r3 = r4.c     // Catch: java.lang.Throwable -> L20
                r1.<init>(r2, r3, r6)     // Catch: java.lang.Throwable -> L20
                r5.a(r0, r1)     // Catch: java.lang.Throwable -> L20
                com.bumptech.glide.load.engine.t<Z> r5 = r4.c
                r5.e()
                com.bumptech.glide.util.pool.b.e()
                return
            L20:
                r5 = move-exception
                com.bumptech.glide.load.engine.t<Z> r6 = r4.c
                r6.e()
                com.bumptech.glide.util.pool.b.e()
                throw r5
        }

        boolean c() {
                r1 = this;
                com.bumptech.glide.load.engine.t<Z> r0 = r1.c
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        <X> void d(com.bumptech.glide.load.c r1, com.bumptech.glide.load.h<X> r2, com.bumptech.glide.load.engine.t<X> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface e {
        com.bumptech.glide.load.engine.cache.a a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        f() {
                r0 = this;
                r0.<init>()
                return
        }

        private boolean a(boolean r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 != 0) goto La
                if (r2 != 0) goto La
                boolean r2 = r1.b
                if (r2 == 0) goto L10
            La:
                boolean r2 = r1.a
                if (r2 == 0) goto L10
                r2 = 1
                return r2
            L10:
                r2 = 0
                return r2
        }

        synchronized boolean b() {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.b = r0     // Catch: java.lang.Throwable -> Lb
                r0 = 0
                boolean r0 = r1.a(r0)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return r0
            Lb:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r0
        }

        synchronized boolean c() {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.c = r0     // Catch: java.lang.Throwable -> Lb
                r0 = 0
                boolean r0 = r1.a(r0)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return r0
            Lb:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r0
        }

        synchronized boolean d(boolean r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.a = r0     // Catch: java.lang.Throwable -> La
                boolean r2 = r1.a(r2)     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)
                return r2
            La:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                throw r2
        }

        synchronized void e() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.b = r0     // Catch: java.lang.Throwable -> La
                r1.a = r0     // Catch: java.lang.Throwable -> La
                r1.c = r0     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)
                return
            La:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum g extends java.lang.Enum<com.bumptech.glide.load.engine.h.g> {
        public static final com.bumptech.glide.load.engine.h.g a = null;
        public static final com.bumptech.glide.load.engine.h.g b = null;
        public static final com.bumptech.glide.load.engine.h.g c = null;
        private static final /* synthetic */ com.bumptech.glide.load.engine.h.g[] d = null;

        static {
                com.bumptech.glide.load.engine.h$g r0 = new com.bumptech.glide.load.engine.h$g
                java.lang.String r1 = "INITIALIZE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.h.g.a = r0
                com.bumptech.glide.load.engine.h$g r1 = new com.bumptech.glide.load.engine.h$g
                java.lang.String r3 = "SWITCH_TO_SOURCE_SERVICE"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.load.engine.h.g.b = r1
                com.bumptech.glide.load.engine.h$g r3 = new com.bumptech.glide.load.engine.h$g
                java.lang.String r5 = "DECODE_DATA"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.load.engine.h.g.c = r3
                r5 = 3
                com.bumptech.glide.load.engine.h$g[] r5 = new com.bumptech.glide.load.engine.h.g[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.bumptech.glide.load.engine.h.g.d = r5
                return
        }

        g(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.load.engine.h.g valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.engine.h$g> r0 = com.bumptech.glide.load.engine.h.g.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.engine.h$g r1 = (com.bumptech.glide.load.engine.h.g) r1
                return r1
        }

        public static com.bumptech.glide.load.engine.h.g[] values() {
                com.bumptech.glide.load.engine.h$g[] r0 = com.bumptech.glide.load.engine.h.g.d
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.engine.h$g[] r0 = (com.bumptech.glide.load.engine.h.g[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC0024h extends java.lang.Enum<com.bumptech.glide.load.engine.h.EnumC0024h> {
        public static final com.bumptech.glide.load.engine.h.EnumC0024h a = null;
        public static final com.bumptech.glide.load.engine.h.EnumC0024h b = null;
        public static final com.bumptech.glide.load.engine.h.EnumC0024h c = null;
        public static final com.bumptech.glide.load.engine.h.EnumC0024h d = null;
        public static final com.bumptech.glide.load.engine.h.EnumC0024h e = null;
        public static final com.bumptech.glide.load.engine.h.EnumC0024h f = null;
        private static final /* synthetic */ com.bumptech.glide.load.engine.h.EnumC0024h[] g = null;

        static {
                com.bumptech.glide.load.engine.h$h r0 = new com.bumptech.glide.load.engine.h$h
                java.lang.String r1 = "INITIALIZE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.load.engine.h.EnumC0024h.a = r0
                com.bumptech.glide.load.engine.h$h r1 = new com.bumptech.glide.load.engine.h$h
                java.lang.String r3 = "RESOURCE_CACHE"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.load.engine.h.EnumC0024h.b = r1
                com.bumptech.glide.load.engine.h$h r3 = new com.bumptech.glide.load.engine.h$h
                java.lang.String r5 = "DATA_CACHE"
                r6 = 2
                r3.<init>(r5, r6)
                com.bumptech.glide.load.engine.h.EnumC0024h.c = r3
                com.bumptech.glide.load.engine.h$h r5 = new com.bumptech.glide.load.engine.h$h
                java.lang.String r7 = "SOURCE"
                r8 = 3
                r5.<init>(r7, r8)
                com.bumptech.glide.load.engine.h.EnumC0024h.d = r5
                com.bumptech.glide.load.engine.h$h r7 = new com.bumptech.glide.load.engine.h$h
                java.lang.String r9 = "ENCODE"
                r10 = 4
                r7.<init>(r9, r10)
                com.bumptech.glide.load.engine.h.EnumC0024h.e = r7
                com.bumptech.glide.load.engine.h$h r9 = new com.bumptech.glide.load.engine.h$h
                java.lang.String r11 = "FINISHED"
                r12 = 5
                r9.<init>(r11, r12)
                com.bumptech.glide.load.engine.h.EnumC0024h.f = r9
                r11 = 6
                com.bumptech.glide.load.engine.h$h[] r11 = new com.bumptech.glide.load.engine.h.EnumC0024h[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.bumptech.glide.load.engine.h.EnumC0024h.g = r11
                return
        }

        EnumC0024h(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.load.engine.h.EnumC0024h valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.engine.h$h> r0 = com.bumptech.glide.load.engine.h.EnumC0024h.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.engine.h$h r1 = (com.bumptech.glide.load.engine.h.EnumC0024h) r1
                return r1
        }

        public static com.bumptech.glide.load.engine.h.EnumC0024h[] values() {
                com.bumptech.glide.load.engine.h$h[] r0 = com.bumptech.glide.load.engine.h.EnumC0024h.g
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.engine.h$h[] r0 = (com.bumptech.glide.load.engine.h.EnumC0024h[]) r0
                return r0
        }
    }

    h(com.bumptech.glide.load.engine.h.e r2, androidx.core.util.Pools.Pool<com.bumptech.glide.load.engine.h<?>> r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.g r0 = new com.bumptech.glide.load.engine.g
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            com.bumptech.glide.util.pool.c r0 = com.bumptech.glide.util.pool.c.a()
            r1.c = r0
            com.bumptech.glide.load.engine.h$d r0 = new com.bumptech.glide.load.engine.h$d
            r0.<init>()
            r1.f = r0
            com.bumptech.glide.load.engine.h$f r0 = new com.bumptech.glide.load.engine.h$f
            r0.<init>()
            r1.g = r0
            r1.d = r2
            r1.e = r3
            return
    }

    private void C() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r3.f414w = r0
            long r0 = com.bumptech.glide.util.g.b()
            r3.f411t = r0
            r0 = 0
        Ld:
            boolean r1 = r3.E
            if (r1 != 0) goto L35
            com.bumptech.glide.load.engine.f r1 = r3.C
            if (r1 == 0) goto L35
            com.bumptech.glide.load.engine.f r0 = r3.C
            boolean r0 = r0.a()
            if (r0 != 0) goto L35
            com.bumptech.glide.load.engine.h$h r1 = r3.f409r
            com.bumptech.glide.load.engine.h$h r1 = r3.n(r1)
            r3.f409r = r1
            com.bumptech.glide.load.engine.f r1 = r3.m()
            r3.C = r1
            com.bumptech.glide.load.engine.h$h r1 = r3.f409r
            com.bumptech.glide.load.engine.h$h r2 = com.bumptech.glide.load.engine.h.EnumC0024h.d
            if (r1 != r2) goto Ld
            r3.c()
            return
        L35:
            com.bumptech.glide.load.engine.h$h r1 = r3.f409r
            com.bumptech.glide.load.engine.h$h r2 = com.bumptech.glide.load.engine.h.EnumC0024h.f
            if (r1 == r2) goto L3f
            boolean r1 = r3.E
            if (r1 == 0) goto L44
        L3f:
            if (r0 != 0) goto L44
            r3.u()
        L44:
            return
    }

    private <Data, ResourceType> com.bumptech.glide.load.engine.u<R> D(Data r7, com.bumptech.glide.load.DataSource r8, com.bumptech.glide.load.engine.s<Data, ResourceType, R> r9) throws com.bumptech.glide.load.engine.GlideException {
            r6 = this;
            com.bumptech.glide.load.f r2 = r6.o(r8)
            com.bumptech.glide.d r0 = r6.h
            com.bumptech.glide.Registry r0 = r0.i()
            com.bumptech.glide.load.data.e r1 = r0.l(r7)
            int r3 = r6.f403l     // Catch: java.lang.Throwable -> L20
            int r4 = r6.f404m     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.load.engine.h$c r5 = new com.bumptech.glide.load.engine.h$c     // Catch: java.lang.Throwable -> L20
            r5.<init>(r6, r8)     // Catch: java.lang.Throwable -> L20
            r0 = r9
            com.bumptech.glide.load.engine.u r7 = r0.b(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L20
            r1.b()
            return r7
        L20:
            r0 = move-exception
            r7 = r0
            r1.b()
            throw r7
    }

    private void E() {
            r3 = this;
            int[] r0 = com.bumptech.glide.load.engine.h.a.a
            com.bumptech.glide.load.engine.h$g r1 = r3.f410s
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L30
            r1 = 3
            if (r0 != r1) goto L17
            r3.l()
            return
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized run reason: "
            r1.append(r2)
            com.bumptech.glide.load.engine.h$g r2 = r3.f410s
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L30:
            r3.C()
            return
        L34:
            com.bumptech.glide.load.engine.h$h r0 = com.bumptech.glide.load.engine.h.EnumC0024h.a
            com.bumptech.glide.load.engine.h$h r0 = r3.n(r0)
            r3.f409r = r0
            com.bumptech.glide.load.engine.f r0 = r3.m()
            r3.C = r0
            r3.C()
            return
    }

    private void F() {
            r3 = this;
            com.bumptech.glide.util.pool.c r0 = r3.c
            r0.c()
            boolean r0 = r3.D
            r1 = 1
            if (r0 == 0) goto L29
            java.util.List<java.lang.Throwable> r0 = r3.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            r0 = 0
            goto L21
        L14:
            java.util.List<java.lang.Throwable> r0 = r3.b
            int r2 = r0.size()
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Already notified"
            r1.<init>(r2, r0)
            throw r1
        L29:
            r3.D = r1
            return
    }

    private int getPriority() {
            r1 = this;
            com.bumptech.glide.Priority r0 = r1.j
            int r0 = r0.ordinal()
            return r0
    }

    private <Data> com.bumptech.glide.load.engine.u<R> j(com.bumptech.glide.load.data.d<?> r4, Data r5, com.bumptech.glide.load.DataSource r6) throws com.bumptech.glide.load.engine.GlideException {
            r3 = this;
            if (r5 != 0) goto L7
            r4.b()
            r4 = 0
            return r4
        L7:
            long r0 = com.bumptech.glide.util.g.b()     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.load.engine.u r5 = r3.k(r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "DecodeJob"
            r2 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r2)     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L2f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r6.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Decoded result "
            r6.append(r2)     // Catch: java.lang.Throwable -> L2d
            r6.append(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2d
            r3.q(r6, r0)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r5 = move-exception
            goto L33
        L2f:
            r4.b()
            return r5
        L33:
            r4.b()
            throw r5
    }

    private <Data> com.bumptech.glide.load.engine.u<R> k(Data r3, com.bumptech.glide.load.DataSource r4) throws com.bumptech.glide.load.engine.GlideException {
            r2 = this;
            com.bumptech.glide.load.engine.g<R> r0 = r2.a
            java.lang.Class r1 = r3.getClass()
            com.bumptech.glide.load.engine.s r0 = r0.h(r1)
            com.bumptech.glide.load.engine.u r3 = r2.D(r3, r4, r0)
            return r3
    }

    private void l() {
            r4 = this;
            java.lang.String r0 = "DecodeJob"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L37
            long r0 = r4.f411t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "data: "
            r2.append(r3)
            java.lang.Object r3 = r4.f417z
            r2.append(r3)
            java.lang.String r3 = ", cache key: "
            r2.append(r3)
            com.bumptech.glide.load.c r3 = r4.f415x
            r2.append(r3)
            java.lang.String r3 = ", fetcher: "
            r2.append(r3)
            com.bumptech.glide.load.data.d<?> r3 = r4.B
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Retrieved data"
            r4.r(r3, r0, r2)
        L37:
            com.bumptech.glide.load.data.d<?> r0 = r4.B     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            java.lang.Object r1 = r4.f417z     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            com.bumptech.glide.load.DataSource r2 = r4.A     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            com.bumptech.glide.load.engine.u r0 = r4.j(r0, r1, r2)     // Catch: com.bumptech.glide.load.engine.GlideException -> L42
            goto L50
        L42:
            r0 = move-exception
            com.bumptech.glide.load.c r1 = r4.f416y
            com.bumptech.glide.load.DataSource r2 = r4.A
            r0.setLoggingDetails(r1, r2)
            java.util.List<java.lang.Throwable> r1 = r4.b
            r1.add(r0)
            r0 = 0
        L50:
            if (r0 == 0) goto L5a
            com.bumptech.glide.load.DataSource r1 = r4.A
            boolean r2 = r4.F
            r4.t(r0, r1, r2)
            goto L5d
        L5a:
            r4.C()
        L5d:
            return
    }

    private com.bumptech.glide.load.engine.f m() {
            r3 = this;
            int[] r0 = com.bumptech.glide.load.engine.h.a.b
            com.bumptech.glide.load.engine.h$h r1 = r3.f409r
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L41
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 3
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 != r1) goto L18
            r0 = 0
            return r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized stage: "
            r1.append(r2)
            com.bumptech.glide.load.engine.h$h r2 = r3.f409r
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L31:
            com.bumptech.glide.load.engine.y r0 = new com.bumptech.glide.load.engine.y
            com.bumptech.glide.load.engine.g<R> r1 = r3.a
            r0.<init>(r1, r3)
            return r0
        L39:
            com.bumptech.glide.load.engine.c r0 = new com.bumptech.glide.load.engine.c
            com.bumptech.glide.load.engine.g<R> r1 = r3.a
            r0.<init>(r1, r3)
            return r0
        L41:
            com.bumptech.glide.load.engine.v r0 = new com.bumptech.glide.load.engine.v
            com.bumptech.glide.load.engine.g<R> r1 = r3.a
            r0.<init>(r1, r3)
            return r0
    }

    private com.bumptech.glide.load.engine.h.EnumC0024h n(com.bumptech.glide.load.engine.h.EnumC0024h r4) {
            r3 = this;
            int[] r0 = com.bumptech.glide.load.engine.h.a.b
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L4d
            r1 = 2
            if (r0 == r1) goto L43
            r1 = 3
            if (r0 == r1) goto L40
            r1 = 4
            if (r0 == r1) goto L40
            r1 = 5
            if (r0 != r1) goto L29
            com.bumptech.glide.load.engine.j r4 = r3.f405n
            boolean r4 = r4.b()
            if (r4 == 0) goto L22
            com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.b
            return r4
        L22:
            com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.b
            com.bumptech.glide.load.engine.h$h r4 = r3.n(r4)
            return r4
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized stage: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L40:
            com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.f
            return r4
        L43:
            boolean r4 = r3.f412u
            if (r4 == 0) goto L4a
            com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.f
            return r4
        L4a:
            com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.d
            return r4
        L4d:
            com.bumptech.glide.load.engine.j r4 = r3.f405n
            boolean r4 = r4.a()
            if (r4 == 0) goto L58
            com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.c
            return r4
        L58:
            com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.EnumC0024h.c
            com.bumptech.glide.load.engine.h$h r4 = r3.n(r4)
            return r4
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.f o(com.bumptech.glide.load.DataSource r4) {
            r3 = this;
            com.bumptech.glide.load.f r0 = r3.f406o
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L9
            return r0
        L9:
            com.bumptech.glide.load.DataSource r1 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            if (r4 == r1) goto L18
            com.bumptech.glide.load.engine.g<R> r4 = r3.a
            boolean r4 = r4.w()
            if (r4 == 0) goto L16
            goto L18
        L16:
            r4 = 0
            goto L19
        L18:
            r4 = 1
        L19:
            com.bumptech.glide.load.e<java.lang.Boolean> r1 = com.bumptech.glide.load.resource.bitmap.u.k
            java.lang.Object r2 = r0.c(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L2c
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2b
            if (r4 == 0) goto L2c
        L2b:
            return r0
        L2c:
            com.bumptech.glide.load.f r0 = new com.bumptech.glide.load.f
            r0.<init>()
            com.bumptech.glide.load.f r2 = r3.f406o
            r0.d(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.e(r1, r4)
            return r0
    }

    private void q(java.lang.String r2, long r3) {
            r1 = this;
            r0 = 0
            r1.r(r2, r3, r0)
            return
    }

    private void r(java.lang.String r1, long r2, java.lang.String r4) {
            r0 = this;
            com.bumptech.glide.util.g.a(r2)
            com.bumptech.glide.load.engine.n r1 = r0.k
            java.util.Objects.toString(r1)
            if (r4 == 0) goto L17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r4)
        L17:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.getName()
            return
    }

    private void s(com.bumptech.glide.load.engine.u<R> r2, com.bumptech.glide.load.DataSource r3, boolean r4) {
            r1 = this;
            r1.F()
            com.bumptech.glide.load.engine.h$b<R> r0 = r1.f407p
            r0.c(r2, r3, r4)
            return
    }

    private void t(com.bumptech.glide.load.engine.u<R> r2, com.bumptech.glide.load.DataSource r3, boolean r4) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.q
            if (r0 == 0) goto La
            r0 = r2
            com.bumptech.glide.load.engine.q r0 = (com.bumptech.glide.load.engine.q) r0
            r0.initialize()
        La:
            com.bumptech.glide.load.engine.h$d<?> r0 = r1.f
            boolean r0 = r0.c()
            if (r0 == 0) goto L18
            com.bumptech.glide.load.engine.t r2 = com.bumptech.glide.load.engine.t.c(r2)
            r0 = r2
            goto L19
        L18:
            r0 = 0
        L19:
            r1.s(r2, r3, r4)
            com.bumptech.glide.load.engine.h$h r2 = com.bumptech.glide.load.engine.h.EnumC0024h.e
            r1.f409r = r2
            com.bumptech.glide.load.engine.h$d<?> r2 = r1.f     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            com.bumptech.glide.load.engine.h$d<?> r2 = r1.f     // Catch: java.lang.Throwable -> L32
            com.bumptech.glide.load.engine.h$e r3 = r1.d     // Catch: java.lang.Throwable -> L32
            com.bumptech.glide.load.f r4 = r1.f406o     // Catch: java.lang.Throwable -> L32
            r2.b(r3, r4)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r2 = move-exception
            goto L3d
        L34:
            if (r0 == 0) goto L39
            r0.e()
        L39:
            r1.v()
            return
        L3d:
            if (r0 == 0) goto L42
            r0.e()
        L42:
            throw r2
    }

    private void u() {
            r3 = this;
            r3.F()
            com.bumptech.glide.load.engine.GlideException r0 = new com.bumptech.glide.load.engine.GlideException
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<java.lang.Throwable> r2 = r3.b
            r1.<init>(r2)
            java.lang.String r2 = "Failed to load resource"
            r0.<init>(r2, r1)
            com.bumptech.glide.load.engine.h$b<R> r1 = r3.f407p
            r1.b(r0)
            r3.w()
            return
    }

    private void v() {
            r1 = this;
            com.bumptech.glide.load.engine.h$f r0 = r1.g
            boolean r0 = r0.b()
            if (r0 == 0) goto Lb
            r1.z()
        Lb:
            return
    }

    private void w() {
            r1 = this;
            com.bumptech.glide.load.engine.h$f r0 = r1.g
            boolean r0 = r0.c()
            if (r0 == 0) goto Lb
            r1.z()
        Lb:
            return
    }

    private void z() {
            r4 = this;
            com.bumptech.glide.load.engine.h$f r0 = r4.g
            r0.e()
            com.bumptech.glide.load.engine.h$d<?> r0 = r4.f
            r0.a()
            com.bumptech.glide.load.engine.g<R> r0 = r4.a
            r0.a()
            r0 = 0
            r4.D = r0
            r1 = 0
            r4.h = r1
            r4.i = r1
            r4.f406o = r1
            r4.j = r1
            r4.k = r1
            r4.f407p = r1
            r4.f409r = r1
            r4.C = r1
            r4.f414w = r1
            r4.f415x = r1
            r4.f417z = r1
            r4.A = r1
            r4.B = r1
            r2 = 0
            r4.f411t = r2
            r4.E = r0
            r4.f413v = r1
            java.util.List<java.lang.Throwable> r0 = r4.b
            r0.clear()
            androidx.core.util.Pools$Pool<com.bumptech.glide.load.engine.h<?>> r0 = r4.e
            r0.release(r4)
            return
    }

    boolean I() {
            r2 = this;
            com.bumptech.glide.load.engine.h$h r0 = com.bumptech.glide.load.engine.h.EnumC0024h.a
            com.bumptech.glide.load.engine.h$h r0 = r2.n(r0)
            com.bumptech.glide.load.engine.h$h r1 = com.bumptech.glide.load.engine.h.EnumC0024h.b
            if (r0 == r1) goto L11
            com.bumptech.glide.load.engine.h$h r1 = com.bumptech.glide.load.engine.h.EnumC0024h.c
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    public void a() {
            r1 = this;
            r0 = 1
            r1.E = r0
            com.bumptech.glide.load.engine.f r0 = r1.C
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(com.bumptech.glide.load.c r3, java.lang.Exception r4, com.bumptech.glide.load.data.d<?> r5, com.bumptech.glide.load.DataSource r6) {
            r2 = this;
            r5.b()
            com.bumptech.glide.load.engine.GlideException r0 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r1 = "Fetching data failed"
            r0.<init>(r1, r4)
            java.lang.Class r4 = r5.a()
            r0.setLoggingDetails(r3, r6, r4)
            java.util.List<java.lang.Throwable> r3 = r2.b
            r3.add(r0)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread r4 = r2.f414w
            if (r3 == r4) goto L28
            com.bumptech.glide.load.engine.h$g r3 = com.bumptech.glide.load.engine.h.g.b
            r2.f410s = r3
            com.bumptech.glide.load.engine.h$b<R> r3 = r2.f407p
            r3.d(r2)
            return
        L28:
            r2.C()
            return
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c() {
            r1 = this;
            com.bumptech.glide.load.engine.h$g r0 = com.bumptech.glide.load.engine.h.g.b
            r1.f410s = r0
            com.bumptech.glide.load.engine.h$b<R> r0 = r1.f407p
            r0.d(r1)
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.NonNull com.bumptech.glide.load.engine.h<?> r1) {
            r0 = this;
            com.bumptech.glide.load.engine.h r1 = (com.bumptech.glide.load.engine.h) r1
            int r1 = r0.i(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d(com.bumptech.glide.load.c r1, java.lang.Object r2, com.bumptech.glide.load.data.d<?> r3, com.bumptech.glide.load.DataSource r4, com.bumptech.glide.load.c r5) {
            r0 = this;
            r0.f415x = r1
            r0.f417z = r2
            r0.B = r3
            r0.A = r4
            r0.f416y = r5
            com.bumptech.glide.load.engine.g<R> r2 = r0.a
            java.util.List r2 = r2.c()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            if (r1 == r2) goto L18
            r3 = 1
        L18:
            r0.F = r3
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread r2 = r0.f414w
            if (r1 == r2) goto L2c
            com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.h.g.c
            r0.f410s = r1
            com.bumptech.glide.load.engine.h$b<R> r1 = r0.f407p
            r1.d(r0)
            return
        L2c:
            java.lang.String r1 = "DecodeJob.decodeFromRetrievedData"
            com.bumptech.glide.util.pool.b.a(r1)
            r0.l()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.util.pool.b.e()
            return
        L38:
            r1 = move-exception
            com.bumptech.glide.util.pool.b.e()
            throw r1
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @androidx.annotation.NonNull
    public com.bumptech.glide.util.pool.c h() {
            r1 = this;
            com.bumptech.glide.util.pool.c r0 = r1.c
            return r0
    }

    public int i(@androidx.annotation.NonNull com.bumptech.glide.load.engine.h<?> r3) {
            r2 = this;
            int r0 = r2.getPriority()
            int r1 = r3.getPriority()
            int r0 = r0 - r1
            if (r0 != 0) goto L10
            int r0 = r2.f408q
            int r3 = r3.f408q
            int r0 = r0 - r3
        L10:
            return r0
    }

    com.bumptech.glide.load.engine.h<R> p(com.bumptech.glide.d r17, java.lang.Object r18, com.bumptech.glide.load.engine.n r19, com.bumptech.glide.load.c r20, int r21, int r22, java.lang.Class<?> r23, java.lang.Class<R> r24, com.bumptech.glide.Priority r25, com.bumptech.glide.load.engine.j r26, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r27, boolean r28, boolean r29, boolean r30, com.bumptech.glide.load.f r31, com.bumptech.glide.load.engine.h.b<R> r32, int r33) {
            r16 = this;
            r0 = r16
            com.bumptech.glide.load.engine.g<R> r1 = r0.a
            com.bumptech.glide.load.engine.h$e r15 = r0.d
            r2 = r17
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r7 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r11 = r31
            r1.u(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.h = r2
            r0.i = r4
            r0.j = r10
            r1 = r19
            r0.k = r1
            r0.f403l = r5
            r0.f404m = r6
            r0.f405n = r7
            r1 = r30
            r0.f412u = r1
            r0.f406o = r11
            r1 = r32
            r0.f407p = r1
            r1 = r33
            r0.f408q = r1
            com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.h.g.a
            r0.f410s = r1
            r0.f413v = r3
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            java.lang.String r0 = "DecodeJob#run(model=%s)"
            java.lang.Object r1 = r4.f413v
            com.bumptech.glide.util.pool.b.b(r0, r1)
            com.bumptech.glide.load.data.d<?> r0 = r4.B
            boolean r1 = r4.E     // Catch: java.lang.Throwable -> L19 com.bumptech.glide.load.engine.b -> L1b
            if (r1 == 0) goto L1d
            r4.u()     // Catch: java.lang.Throwable -> L19 com.bumptech.glide.load.engine.b -> L1b
            if (r0 == 0) goto L15
            r0.b()
        L15:
            com.bumptech.glide.util.pool.b.e()
            return
        L19:
            r1 = move-exception
            goto L29
        L1b:
            r1 = move-exception
            goto L4e
        L1d:
            r4.E()     // Catch: java.lang.Throwable -> L19 com.bumptech.glide.load.engine.b -> L1b
            if (r0 == 0) goto L25
            r0.b()
        L25:
            com.bumptech.glide.util.pool.b.e()
            return
        L29:
            java.lang.String r2 = "DecodeJob"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            com.bumptech.glide.load.engine.h$h r2 = r4.f409r     // Catch: java.lang.Throwable -> L38
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r1 = move-exception
            goto L4f
        L3a:
            com.bumptech.glide.load.engine.h$h r2 = r4.f409r     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.h.EnumC0024h.e     // Catch: java.lang.Throwable -> L38
            if (r2 == r3) goto L48
            java.util.List<java.lang.Throwable> r2 = r4.b     // Catch: java.lang.Throwable -> L38
            r2.add(r1)     // Catch: java.lang.Throwable -> L38
            r4.u()     // Catch: java.lang.Throwable -> L38
        L48:
            boolean r2 = r4.E     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L4d
            throw r1     // Catch: java.lang.Throwable -> L38
        L4d:
            throw r1     // Catch: java.lang.Throwable -> L38
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L38
        L4f:
            if (r0 == 0) goto L54
            r0.b()
        L54:
            com.bumptech.glide.util.pool.b.e()
            throw r1
    }

    @androidx.annotation.NonNull
    <Z> com.bumptech.glide.load.engine.u<Z> x(com.bumptech.glide.load.DataSource r12, @androidx.annotation.NonNull com.bumptech.glide.load.engine.u<Z> r13) {
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L20
            com.bumptech.glide.load.engine.g<R> r0 = r11.a
            com.bumptech.glide.load.i r0 = r0.r(r8)
            com.bumptech.glide.d r2 = r11.h
            int r3 = r11.f403l
            int r4 = r11.f404m
            com.bumptech.glide.load.engine.u r2 = r0.a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L22
        L20:
            r0 = r13
            r7 = r1
        L22:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L2b
            r13.recycle()
        L2b:
            com.bumptech.glide.load.engine.g<R> r13 = r11.a
            boolean r13 = r13.v(r0)
            if (r13 == 0) goto L41
            com.bumptech.glide.load.engine.g<R> r13 = r11.a
            com.bumptech.glide.load.h r1 = r13.n(r0)
            com.bumptech.glide.load.f r13 = r11.f406o
            com.bumptech.glide.load.EncodeStrategy r13 = r1.b(r13)
        L3f:
            r10 = r1
            goto L44
        L41:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
            goto L3f
        L44:
            com.bumptech.glide.load.engine.g<R> r1 = r11.a
            com.bumptech.glide.load.c r2 = r11.f415x
            boolean r1 = r1.x(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.engine.j r3 = r11.f405n
            boolean r12 = r3.d(r1, r12, r13)
            if (r12 == 0) goto Lb3
            if (r10 == 0) goto La5
            int[] r12 = com.bumptech.glide.load.engine.h.a.c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L92
            r1 = 2
            if (r12 != r1) goto L7b
            com.bumptech.glide.load.engine.w r1 = new com.bumptech.glide.load.engine.w
            com.bumptech.glide.load.engine.g<R> r12 = r11.a
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r12.b()
            com.bumptech.glide.load.c r3 = r11.f415x
            com.bumptech.glide.load.c r4 = r11.i
            int r5 = r11.f403l
            int r6 = r11.f404m
            com.bumptech.glide.load.f r9 = r11.f406o
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L9b
        L7b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L92:
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d
            com.bumptech.glide.load.c r12 = r11.f415x
            com.bumptech.glide.load.c r13 = r11.i
            r1.<init>(r12, r13)
        L9b:
            com.bumptech.glide.load.engine.t r12 = com.bumptech.glide.load.engine.t.c(r0)
            com.bumptech.glide.load.engine.h$d<?> r13 = r11.f
            r13.d(r1, r10, r12)
            return r12
        La5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        Lb3:
            return r0
    }

    void y(boolean r2) {
            r1 = this;
            com.bumptech.glide.load.engine.h$f r0 = r1.g
            boolean r2 = r0.d(r2)
            if (r2 == 0) goto Lb
            r1.z()
        Lb:
            return
    }
}
