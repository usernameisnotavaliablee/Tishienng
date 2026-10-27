package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class AdViewImpl extends android.widget.FrameLayout implements com.beizi.ad.internal.a {
    private static android.widget.FrameLayout U;
    private static com.beizi.ad.internal.view.f V;
    private static com.beizi.ad.internal.view.AdWebView.b W;
    private androidx.appcompat.widget.AppCompatTextView A;
    private android.widget.ImageView B;
    private android.os.CountDownTimer C;
    private androidx.appcompat.widget.AppCompatImageView D;
    private long E;
    private android.view.GestureDetector F;
    private float G;
    private float H;
    private float I;
    private float J;
    private android.widget.FrameLayout K;
    private android.widget.FrameLayout L;
    private java.lang.String M;
    private java.lang.String N;
    private java.lang.String O;
    private java.lang.String P;
    private java.lang.String Q;
    private boolean R;
    private com.beizi.ad.internal.view.AdWebView S;
    private boolean T;
    protected android.view.ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    protected com.beizi.ad.internal.view.AdViewImpl.a f7090b;
    public int bottomPadding;

    /* renamed from: c, reason: collision with root package name */
    protected com.beizi.ad.internal.view.c f7091c;
    public int clickCount;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f7092d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f7093e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f7094f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f7095g;

    /* renamed from: h, reason: collision with root package name */
    protected com.beizi.ad.internal.e f7096h;

    /* renamed from: i, reason: collision with root package name */
    protected com.beizi.ad.internal.f.a.C0104a f7097i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f7098j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f7099k;
    int l;
    public int leftPadding;
    public int loadCount;
    private android.view.View m;
    public com.beizi.ad.internal.d mAdFetcher;
    private int n;
    private int o;
    private java.lang.String p;
    private com.beizi.ad.a q;
    private com.beizi.ad.l r;
    public int rightPadding;
    private com.beizi.ad.d s;
    public com.beizi.ad.internal.f.c serverResponse;
    private com.beizi.ad.internal.view.AdViewImpl.c t;
    public int topPadding;
    private final android.os.Handler u;
    private com.beizi.ad.internal.view.AdViewImpl.b v;
    private boolean w;
    private boolean x;
    private boolean y;
    private androidx.appcompat.widget.AppCompatTextView z;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.view.AdViewImpl$14, reason: invalid class name */
    static /* synthetic */ class AnonymousClass14 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.internal.view.f$a[] r0 = com.beizi.ad.internal.view.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a = r0
                com.beizi.ad.internal.view.f$a r1 = com.beizi.ad.internal.view.f.a.f7222g     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.internal.view.f$a r1 = com.beizi.ad.internal.view.f.a.f7219d     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.internal.view.f$a r1 = com.beizi.ad.internal.view.f.a.f7220e     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.beizi.ad.internal.view.f$a r1 = com.beizi.ad.internal.view.f.a.f7218c     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.beizi.ad.internal.view.f$a r1 = com.beizi.ad.internal.view.f.a.f7221f     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.beizi.ad.internal.view.f$a r1 = com.beizi.ad.internal.view.f.a.a     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a     // Catch: java.lang.NoSuchFieldError -> L54
                com.beizi.ad.internal.view.f$a r1 = com.beizi.ad.internal.view.f.a.f7217b     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }

        public AnonymousClass14() {
                r1 = this;
                r1.<init>()
                return
        }
    }
















    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7121b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.beizi.ad.internal.view.AdViewImpl$a$a, reason: collision with other inner class name */
        enum EnumC0112a extends java.lang.Enum<com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a> {
            public static final com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a a = null;

            /* renamed from: b, reason: collision with root package name */
            public static final com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a f7122b = null;

            /* renamed from: c, reason: collision with root package name */
            public static final com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a f7123c = null;

            /* renamed from: d, reason: collision with root package name */
            public static final com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a f7124d = null;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a[] f7125e = null;

            static {
                    com.beizi.ad.internal.view.AdViewImpl$a$a r0 = new com.beizi.ad.internal.view.AdViewImpl$a$a
                    java.lang.String r1 = "UNCHANGE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.a = r0
                    com.beizi.ad.internal.view.AdViewImpl$a$a r1 = new com.beizi.ad.internal.view.AdViewImpl$a$a
                    java.lang.String r3 = "STATE_PREPARE_CHANGE"
                    r4 = 1
                    r1.<init>(r3, r4)
                    com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7122b = r1
                    com.beizi.ad.internal.view.AdViewImpl$a$a r3 = new com.beizi.ad.internal.view.AdViewImpl$a$a
                    java.lang.String r5 = "STATE_BACKGROUND"
                    r6 = 2
                    r3.<init>(r5, r6)
                    com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7123c = r3
                    com.beizi.ad.internal.view.AdViewImpl$a$a r5 = new com.beizi.ad.internal.view.AdViewImpl$a$a
                    java.lang.String r7 = "FINISHCLOSE"
                    r8 = 3
                    r5.<init>(r7, r8)
                    com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7124d = r5
                    r7 = 4
                    com.beizi.ad.internal.view.AdViewImpl$a$a[] r7 = new com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a[r7]
                    r7[r2] = r0
                    r7[r4] = r1
                    r7[r6] = r3
                    r7[r8] = r5
                    com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7125e = r7
                    return
            }

            EnumC0112a(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a valueOf(java.lang.String r1) {
                    java.lang.Class<com.beizi.ad.internal.view.AdViewImpl$a$a> r0 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.beizi.ad.internal.view.AdViewImpl$a$a r1 = (com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a) r1
                    return r1
            }

            public static com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a[] values() {
                    com.beizi.ad.internal.view.AdViewImpl$a$a[] r0 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7125e
                    java.lang.Object r0 = r0.clone()
                    com.beizi.ad.internal.view.AdViewImpl$a$a[] r0 = (com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a[]) r0
                    return r0
            }
        }

        a() {
                r1 = this;
                r1.<init>()
                com.beizi.ad.internal.view.AdViewImpl$a$a r0 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.a
                r1.a = r0
                r0 = 0
                r1.f7121b = r0
                return
        }

        public synchronized void a(com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a r4) {
                r3 = this;
                monitor-enter(r3)
                com.beizi.ad.internal.view.AdViewImpl$a$a r0 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7122b     // Catch: java.lang.Throwable -> Le
                if (r4 != r0) goto L10
                com.beizi.ad.internal.view.AdViewImpl$a$a r1 = r3.a     // Catch: java.lang.Throwable -> Le
                com.beizi.ad.internal.view.AdViewImpl$a$a r2 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.a     // Catch: java.lang.Throwable -> Le
                if (r1 != r2) goto L10
                r3.a = r0     // Catch: java.lang.Throwable -> Le
                goto L10
            Le:
                r4 = move-exception
                goto L2a
            L10:
                com.beizi.ad.internal.view.AdViewImpl$a$a r1 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7123c     // Catch: java.lang.Throwable -> Le
                if (r4 != r1) goto L1a
                com.beizi.ad.internal.view.AdViewImpl$a$a r2 = r3.a     // Catch: java.lang.Throwable -> Le
                if (r2 != r0) goto L1a
                r3.a = r1     // Catch: java.lang.Throwable -> Le
            L1a:
                com.beizi.ad.internal.view.AdViewImpl$a$a r0 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7124d     // Catch: java.lang.Throwable -> Le
                if (r4 != r0) goto L28
                com.beizi.ad.internal.view.AdViewImpl$a$a r4 = r3.a     // Catch: java.lang.Throwable -> Le
                if (r4 != r1) goto L28
                boolean r4 = r3.f7121b     // Catch: java.lang.Throwable -> Le
                if (r4 == 0) goto L28
                r3.a = r0     // Catch: java.lang.Throwable -> Le
            L28:
                monitor-exit(r3)
                return
            L2a:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
                throw r4
        }

        public void a(boolean r1) {
                r0 = this;
                r0.f7121b = r1
                return
        }

        public boolean a() {
                r1 = this;
                boolean r0 = r1.f7121b
                return r0
        }

        public void b() {
                r1 = this;
                com.beizi.ad.internal.view.AdViewImpl$a$a r0 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.a
                r1.a = r0
                return
        }

        public com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a c() {
                r1 = this;
                com.beizi.ad.internal.view.AdViewImpl$a$a r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements com.beizi.ad.internal.c {
        final /* synthetic */ com.beizi.ad.internal.view.AdViewImpl a;

        /* renamed from: b, reason: collision with root package name */
        private android.os.Handler f7126b;

        /* renamed from: c, reason: collision with root package name */
        private com.beizi.ad.internal.f.b f7127c;













        public b(com.beizi.ad.internal.view.AdViewImpl r1, android.os.Handler r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f7126b = r2
                return
        }

        static /* synthetic */ com.beizi.ad.internal.f.b a(com.beizi.ad.internal.view.AdViewImpl.b r0) {
                com.beizi.ad.internal.f.b r0 = r0.f7127c
                return r0
        }

        @Override // com.beizi.ad.internal.c
        public void a() {
                r3 = this;
                com.beizi.ad.internal.view.AdViewImpl r0 = r3.a
                long r1 = java.lang.System.currentTimeMillis()
                com.beizi.ad.internal.view.AdViewImpl.a(r0, r1)
                android.os.Handler r0 = r3.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$6 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$6
                r1.<init>(r3)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(int r3) {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$7 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$7
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(long r3) {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$4 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$4
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(com.beizi.ad.internal.f.b r3) {
                r2 = this;
                r2.f7127c = r3
                com.beizi.ad.internal.k r0 = r3.a()
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7002d
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2c
                com.beizi.ad.internal.k r0 = r3.a()
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7003e
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2c
                com.beizi.ad.internal.k r0 = r3.a()
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.a
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L27
                goto L2c
            L27:
                r3 = 0
                r2.a(r3)
                return
            L2c:
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$1 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$1
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(java.lang.String r3) {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$5 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$5
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(java.lang.String r3, int r4) {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$3 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$3
                r1.<init>(r2, r3, r4)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$12 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$12
                r1.<init>(r2, r3, r4)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void b() {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$9 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$9
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void c() {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$8 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$8
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void d() {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$10 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$10
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void e() {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$11 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$11
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.c
        public void f() {
                r2 = this;
                android.os.Handler r0 = r2.f7126b
                com.beizi.ad.internal.view.AdViewImpl$b$2 r1 = new com.beizi.ad.internal.view.AdViewImpl$b$2
                r1.<init>(r2)
                r0.post(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {
        public static final java.util.ArrayList<android.util.Pair<java.lang.String, com.beizi.ad.internal.view.AdViewImpl.c>> a = null;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.beizi.ad.internal.view.AdViewImpl.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    AdViewImpl(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    AdViewImpl(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    AdViewImpl(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r5 = 0
            r2.a = r5
            r2.m = r5
            java.lang.String r0 = ""
            r2.p = r0
            com.beizi.ad.internal.view.AdViewImpl$a r0 = new com.beizi.ad.internal.view.AdViewImpl$a
            r0.<init>()
            r2.f7090b = r0
            com.beizi.ad.internal.view.AdViewImpl$1 r0 = new com.beizi.ad.internal.view.AdViewImpl$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.u = r0
            r0 = 0
            r2.f7092d = r0
            r2.f7093e = r0
            r2.f7094f = r0
            r1 = 1
            r2.f7095g = r1
            r2.w = r0
            r2.x = r1
            r2.f7096h = r5
            r2.f7097i = r5
            r2.y = r0
            r2.f7098j = r0
            r2.f7099k = r0
            r2.T = r0
            r2.l = r0
            r2.a(r3, r4)
            return
    }

    AdViewImpl(android.content.Context r5, android.view.ViewGroup r6, android.view.View r7) {
            r4 = this;
            r0 = 0
            r1 = 0
            r4.<init>(r5, r0, r1)
            r4.a = r0
            r4.m = r0
            java.lang.String r2 = ""
            r4.p = r2
            com.beizi.ad.internal.view.AdViewImpl$a r2 = new com.beizi.ad.internal.view.AdViewImpl$a
            r2.<init>()
            r4.f7090b = r2
            com.beizi.ad.internal.view.AdViewImpl$1 r2 = new com.beizi.ad.internal.view.AdViewImpl$1
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r4, r3)
            r4.u = r2
            r4.f7092d = r1
            r4.f7093e = r1
            r4.f7094f = r1
            r2 = 1
            r4.f7095g = r2
            r4.w = r1
            r4.x = r2
            r4.f7096h = r0
            r4.f7097i = r0
            r4.y = r1
            r4.f7098j = r1
            r4.f7099k = r1
            r4.T = r1
            r4.l = r1
            r4.a = r6
            r4.m = r7
            r4.a(r5, r0)
            return
    }

    static /* synthetic */ float a(com.beizi.ad.internal.view.AdViewImpl r0, float r1) {
            r0.G = r1
            return r1
    }

    static /* synthetic */ long a(com.beizi.ad.internal.view.AdViewImpl r0, long r1) {
            r0.E = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.internal.view.AdWebView a(com.beizi.ad.internal.view.AdViewImpl r0) {
            com.beizi.ad.internal.view.AdWebView r0 = r0.S
            return r0
    }

    private void a(int r3, int r4) {
            r2 = this;
            r0 = 1
            r2.f7092d = r0
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L25
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.width
            if (r0 <= 0) goto L17
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r3
        L17:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.height
            if (r0 <= 0) goto L25
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.height = r4
        L25:
            boolean r0 = r2.w
            if (r0 == 0) goto L59
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L59
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L59
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r1 = r1.width
            if (r1 <= 0) goto L4b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.width = r3
        L4b:
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            int r3 = r3.height
            if (r3 <= 0) goto L59
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r3.height = r4
        L59:
            return
    }

    private void a(android.webkit.WebView r4, android.content.Context r5) {
            r3 = this;
            java.lang.Class r0 = com.beizi.ad.AdActivity.a()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)
            java.lang.String r0 = "ACTIVITY_TYPE"
            java.lang.String r2 = "BROWSER"
            r1.putExtra(r0, r2)
            java.util.LinkedList<android.webkit.WebView> r0 = com.beizi.ad.internal.activity.a.a
            r0.add(r4)
            r5.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L1e
            return
        L1e:
            java.util.LinkedList<android.webkit.WebView> r4 = com.beizi.ad.internal.activity.a.a
            r4.remove()
            return
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.view.AdViewImpl r0, boolean r1) {
            r0.T = r1
            return r1
    }

    static /* synthetic */ float b(com.beizi.ad.internal.view.AdViewImpl r0, float r1) {
            r0.H = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.a b(com.beizi.ad.internal.view.AdViewImpl r0) {
            com.beizi.ad.a r0 = r0.q
            return r0
    }

    static /* synthetic */ float c(com.beizi.ad.internal.view.AdViewImpl r0, float r1) {
            r0.I = r1
            return r1
    }

    static /* synthetic */ void c(com.beizi.ad.internal.view.AdViewImpl r0) {
            r0.g()
            return
    }

    static /* synthetic */ float d(com.beizi.ad.internal.view.AdViewImpl r0, float r1) {
            r0.J = r1
            return r1
    }

    static /* synthetic */ androidx.appcompat.widget.AppCompatImageView d(com.beizi.ad.internal.view.AdViewImpl r0) {
            androidx.appcompat.widget.AppCompatImageView r0 = r0.D
            return r0
    }

    static /* synthetic */ androidx.appcompat.widget.AppCompatTextView e(com.beizi.ad.internal.view.AdViewImpl r0) {
            androidx.appcompat.widget.AppCompatTextView r0 = r0.z
            return r0
    }

    static /* synthetic */ android.os.CountDownTimer f(com.beizi.ad.internal.view.AdViewImpl r0) {
            android.os.CountDownTimer r0 = r0.C
            return r0
    }

    static /* synthetic */ androidx.appcompat.widget.AppCompatTextView g(com.beizi.ad.internal.view.AdViewImpl r0) {
            androidx.appcompat.widget.AppCompatTextView r0 = r0.A
            return r0
    }

    private void g() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            android.webkit.WebView r1 = new android.webkit.WebView
            android.content.MutableContextWrapper r2 = new android.content.MutableContextWrapper
            android.content.Context r3 = r4.getContext()
            r2.<init>(r3)
            r1.<init>(r2)
            com.beizi.ad.internal.h.x.a(r1)
            java.lang.String r2 = "aHR0cDovL3Nka2RvYy5iZWl6aS5iaXovIy96aC1jbi9ndWlkZS9Vc2VQcml2YWN5"
            java.lang.String r2 = com.beizi.ad.lance.a.b.b(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L2b
            java.util.Map r3 = com.beizi.ad.lance.a.j.a()
            r1.loadUrl(r2, r3)
        L2b:
            r4.a(r1, r0)
            return
    }

    public static android.widget.FrameLayout getMRAIDFullscreenContainer() {
            android.widget.FrameLayout r0 = com.beizi.ad.internal.view.AdViewImpl.U
            return r0
    }

    public static com.beizi.ad.internal.view.f getMRAIDFullscreenImplementation() {
            com.beizi.ad.internal.view.f r0 = com.beizi.ad.internal.view.AdViewImpl.V
            return r0
    }

    public static com.beizi.ad.internal.view.AdWebView.b getMRAIDFullscreenListener() {
            com.beizi.ad.internal.view.AdWebView$b r0 = com.beizi.ad.internal.view.AdViewImpl.W
            return r0
    }

    private void h() {
            r4 = this;
            com.beizi.ad.internal.f.c r0 = r4.serverResponse     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L15
            boolean r0 = r0.N()     // Catch: java.lang.Exception -> L52
            com.beizi.ad.internal.f.c r1 = r4.serverResponse     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = r1.L()     // Catch: java.lang.Exception -> L52
            com.beizi.ad.internal.f.c r2 = r4.serverResponse     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r2.M()     // Catch: java.lang.Exception -> L52
            goto L18
        L15:
            r1 = 0
            r0 = 0
            r2 = r1
        L18:
            r3 = 3
            if (r0 != 0) goto L34
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L29
            com.beizi.ad.a r0 = r4.q     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            r0.a(r3)     // Catch: java.lang.Exception -> L52
            return
        L29:
            com.beizi.ad.a r0 = r4.q     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            r1 = 1
            r4.T = r1     // Catch: java.lang.Exception -> L52
            r0.a()     // Catch: java.lang.Exception -> L52
            return
        L34:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L42
            com.beizi.ad.a r0 = r4.q     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L52
            r0.a(r3)     // Catch: java.lang.Exception -> L52
            return
        L42:
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.a()     // Catch: java.lang.Exception -> L52
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Exception -> L52
            com.beizi.ad.internal.view.AdViewImpl$13 r3 = new com.beizi.ad.internal.view.AdViewImpl$13     // Catch: java.lang.Exception -> L52
            r3.<init>(r4)     // Catch: java.lang.Exception -> L52
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L52
        L52:
            return
    }

    static /* synthetic */ void h(com.beizi.ad.internal.view.AdViewImpl r0) {
            r0.h()
            return
    }

    static /* synthetic */ com.beizi.ad.l i(com.beizi.ad.internal.view.AdViewImpl r0) {
            com.beizi.ad.l r0 = r0.r
            return r0
    }

    static /* synthetic */ com.beizi.ad.d j(com.beizi.ad.internal.view.AdViewImpl r0) {
            com.beizi.ad.d r0 = r0.s
            return r0
    }

    public static void setMRAIDFullscreenContainer(android.widget.FrameLayout r0) {
            com.beizi.ad.internal.view.AdViewImpl.U = r0
            return
    }

    public static void setMRAIDFullscreenImplementation(com.beizi.ad.internal.view.f r0) {
            com.beizi.ad.internal.view.AdViewImpl.V = r0
            return
    }

    public static void setMRAIDFullscreenListener(com.beizi.ad.internal.view.AdWebView.b r0) {
            com.beizi.ad.internal.view.AdViewImpl.W = r0
            return
    }

    protected android.content.Context a(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            boolean r0 = r0 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L13
            android.content.Context r2 = r2.getContext()
            android.content.MutableContextWrapper r2 = (android.content.MutableContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            return r2
        L13:
            android.content.Context r2 = r1.getContext()
            return r2
    }

    void a(int r2, int r3, int r4, int r5, com.beizi.ad.internal.view.f.a r6, boolean r7, com.beizi.ad.internal.view.f r8) {
            r1 = this;
            r1.a(r2, r3)
            androidx.appcompat.widget.AppCompatTextView r4 = r1.A
            com.beizi.ad.internal.h.u.a(r4)
            int r4 = r1.l
            if (r4 > 0) goto L23
            com.beizi.ad.internal.view.AdWebView r4 = r8.f7204b
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1112014848(0x42480000, float:50.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r1.l = r4
        L23:
            com.beizi.ad.internal.view.AdViewImpl$10 r4 = new com.beizi.ad.internal.view.AdViewImpl$10
            android.content.Context r5 = r1.getContext()
            r4.<init>(r1, r5, r8)
            r1.A = r4
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r5 = r1.l
            r7 = 17
            r4.<init>(r5, r5, r7)
            r5 = 2
            int r3 = r3 / r5
            int r7 = r1.l
            int r0 = r7 / 2
            int r3 = r3 - r0
            int r2 = r2 / r5
            int r7 = r7 / r5
            int r2 = r2 - r7
            int[] r7 = com.beizi.ad.internal.view.AdViewImpl.AnonymousClass14.a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            r7 = 1
            if (r6 == r7) goto L72
            if (r6 == r5) goto L6d
            r5 = 3
            if (r6 == r5) goto L68
            r5 = 5
            if (r6 == r5) goto L65
            r5 = 6
            if (r6 == r5) goto L60
            r5 = 7
            if (r6 == r5) goto L5b
            goto L74
        L5b:
            r4.leftMargin = r2
            r4.bottomMargin = r3
            goto L74
        L60:
            r4.rightMargin = r2
            r4.bottomMargin = r3
            goto L74
        L65:
            r4.bottomMargin = r3
            goto L74
        L68:
            r4.leftMargin = r2
            r4.topMargin = r3
            goto L74
        L6d:
            r4.rightMargin = r2
            r4.topMargin = r3
            goto L74
        L72:
            r4.topMargin = r3
        L74:
            androidx.appcompat.widget.AppCompatTextView r2 = r1.A
            r2.setLayoutParams(r4)
            androidx.appcompat.widget.AppCompatTextView r2 = r1.A
            r3 = 0
            r2.setBackgroundColor(r3)
            androidx.appcompat.widget.AppCompatTextView r2 = r1.A
            com.beizi.ad.internal.view.AdViewImpl$11 r3 = new com.beizi.ad.internal.view.AdViewImpl$11
            r3.<init>(r1, r8)
            r2.setOnClickListener(r3)
            com.beizi.ad.internal.view.AdWebView r2 = r8.f7204b
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L9e
            com.beizi.ad.internal.view.AdWebView r2 = r8.f7204b
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.appcompat.widget.AppCompatTextView r3 = r1.A
            r2.addView(r3)
        L9e:
            return
    }

    protected void a(int r5, int r6, com.beizi.ad.internal.view.f r7) {
            r4 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = r4.A
            com.beizi.ad.internal.h.u.a(r0)
            r0 = 0
            r4.A = r0
            com.beizi.ad.internal.view.AdWebView r1 = r7.f7204b
            boolean r2 = r1.a
            r3 = 0
            if (r2 == 0) goto L53
            com.beizi.ad.internal.h.u.a(r1)
            android.view.ViewGroup r1 = r7.d()
            if (r1 == 0) goto L21
            android.view.ViewGroup r1 = r7.d()
            com.beizi.ad.internal.view.AdWebView r2 = r7.f7204b
            r1.addView(r2, r3)
        L21:
            android.app.Activity r1 = r7.c()
            if (r1 == 0) goto L2e
            android.app.Activity r1 = r7.c()
            r1.finish()
        L2e:
            com.beizi.ad.internal.k r1 = r4.getMediaType()
            com.beizi.ad.internal.k r2 = com.beizi.ad.internal.k.f7002d
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L53
            com.beizi.ad.internal.view.AdWebView r1 = r7.f7204b
            android.content.Context r1 = r1.getContext()
            boolean r1 = r1 instanceof android.content.MutableContextWrapper
            if (r1 == 0) goto L53
            com.beizi.ad.internal.view.AdWebView r7 = r7.f7204b
            android.content.Context r7 = r7.getContext()
            android.content.MutableContextWrapper r7 = (android.content.MutableContextWrapper) r7
            android.content.Context r1 = r4.getContext()
            r7.setBaseContext(r1)
        L53:
            com.beizi.ad.internal.view.AdViewImpl.U = r0
            com.beizi.ad.internal.view.AdViewImpl.V = r0
            com.beizi.ad.internal.view.AdViewImpl.W = r0
            r4.a(r5, r6)
            r5 = 1
            r4.f7094f = r5
            r4.f7093e = r3
            return
    }

    void a(int r2, int r3, boolean r4, com.beizi.ad.internal.view.f r5, com.beizi.ad.internal.view.AdWebView.b r6) {
            r1 = this;
            r1.a(r2, r3)
            android.content.Context r2 = r1.getContext()
            androidx.appcompat.widget.AppCompatTextView r2 = com.beizi.ad.internal.h.u.b(r2)
            r1.A = r2
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            com.beizi.ad.internal.view.AdWebView r3 = r5.f7204b
            boolean r3 = r3.a
            if (r3 != 0) goto L31
            r3 = 0
            android.view.View r0 = r1.getChildAt(r3)
            if (r0 == 0) goto L31
            int r0 = r1.getMeasuredWidth()
            android.view.View r3 = r1.getChildAt(r3)
            int r3 = r3.getMeasuredWidth()
            int r0 = r0 - r3
            int r0 = r0 / 2
            r2.rightMargin = r0
        L31:
            androidx.appcompat.widget.AppCompatTextView r3 = r1.A
            r3.setLayoutParams(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = r1.A
            com.beizi.ad.internal.view.AdViewImpl$9 r3 = new com.beizi.ad.internal.view.AdViewImpl$9
            r3.<init>(r1, r5)
            r2.setOnClickListener(r3)
            com.beizi.ad.internal.view.AdWebView r2 = r5.f7204b
            boolean r2 = r2.a
            if (r2 == 0) goto L4a
            r1.a(r5, r4, r6)
            goto L4f
        L4a:
            androidx.appcompat.widget.AppCompatTextView r2 = r1.A
            r1.addView(r2)
        L4f:
            r2 = 1
            r1.f7093e = r2
            return
    }

    void a(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.setBackgroundColor(r0)
            com.beizi.ad.internal.view.AdViewImpl$b r1 = new com.beizi.ad.internal.view.AdViewImpl$b
            android.os.Handler r2 = r3.u
            r1.<init>(r3, r2)
            r3.v = r1
            com.beizi.ad.internal.e r1 = new com.beizi.ad.internal.e
            java.lang.String r2 = com.beizi.ad.internal.h.o.a()
            r1.<init>(r4, r2)
            r3.f7096h = r1
            android.view.GestureDetector r1 = new android.view.GestureDetector
            com.beizi.ad.internal.view.AdViewImpl$12 r2 = new com.beizi.ad.internal.view.AdViewImpl$12
            r2.<init>(r3)
            r1.<init>(r2)
            r3.F = r1
            r3.setPadding(r0, r0, r0, r0)
            com.beizi.ad.internal.d r0 = new com.beizi.ad.internal.d
            r0.<init>(r3)
            r3.mAdFetcher = r0
            if (r5 == 0) goto L33
            r3.b(r4, r5)
        L33:
            com.beizi.ad.internal.e r4 = r3.f7096h     // Catch: java.lang.Exception -> L5b
            android.content.Context r4 = r4.b()     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = "urlTemplate"
            java.lang.String r0 = "aHR0cHM6Ly9hcGkuaHRwLmFkLXNjb3BlLmNvbS5jbi9tYi9zZGsvZXZlbnQvdjE/ZXh0SW5mbz13QkxRZVA4Ym1xNkF1SjVEYVp5YzV4UVFVXzkyT1drU1VkeV82VjRuMlJBM01iZ2VodzZKNjdaZndjRFFDbWozdVR5aENrclQ4bk1Bc1EmcmVxdWVzdFV1aWQ9X19SRVFVRVNUVVVJRF9fJmV2ZW50VHlwZT1fX0VWRU5UVFlQRV9fJmFwcElEPV9fQVBQSURfXyZzcGFjZUlEPV9fU1BBQ0VJRF9fJmNoYW5uZWxJRD1fX0NIQU5ORUxJRF9fJmNoYW5uZWxBcHBJRD1fX0NIQU5ORUxBUFBJRF9fJmNoYW5uZWxTcGFjZUlEPV9fQ0hBTk5FTFNQQUNFSURfXyZ0cz1fX1RTX18maXA9X19JUF9fJm5ldFR5cGU9X19ORVRUWVBFX18mY2Fycmllcj1fX0NBUlJJRVJfXyZlcnJJbmZvPV9fRVJSSU5GT19fJnNka0V4dEluZm89X19TREtFWFRJTkZPX18maW1laT1fX0lNRUlfXyZhbmRyb2lkSUQ9X19BTkRST0lESURfXyZpZGZhPV9fSURGQV9fJmlkZnY9X19JREZWX18mbWFjPV9fTUFDX18mdWlkPV9fVUlEX18mc2RrVmVyc2lvbj1fX1NES1ZFUlNJT05fXyZhcHBWZXJpc29uPV9fQVBQVkVSU0lPTl9f"
            java.lang.String r0 = com.beizi.ad.lance.a.b.b(r0)     // Catch: java.lang.Exception -> L5b
            java.lang.Object r4 = com.beizi.ad.internal.h.m.b(r4, r5, r0)     // Catch: java.lang.Exception -> L5b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L5b
            r3.P = r4     // Catch: java.lang.Exception -> L5b
            com.beizi.ad.internal.e r4 = r3.f7096h     // Catch: java.lang.Exception -> L5b
            android.content.Context r4 = r4.b()     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = "eventsList"
            java.lang.String r0 = "[1, 2, 3, 4, 5, 6]"
            java.lang.Object r4 = com.beizi.ad.internal.h.m.b(r4, r5, r0)     // Catch: java.lang.Exception -> L5b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L5b
            r3.Q = r4     // Catch: java.lang.Exception -> L5b
        L5b:
            return
    }

    protected abstract void a(com.beizi.ad.internal.d.e r1);

    protected abstract void a(com.beizi.ad.internal.view.c r1);

    protected void a(com.beizi.ad.internal.view.f r3, boolean r4, com.beizi.ad.internal.view.AdWebView.b r5) {
            r2 = this;
            com.beizi.ad.internal.view.AdWebView r4 = r3.f7204b
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.a(r4)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            android.content.Context r0 = r2.getContext()
            r4.<init>(r0)
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            com.beizi.ad.internal.h.u.a(r0)
            com.beizi.ad.internal.view.AdWebView r0 = r3.f7204b
            r4.addView(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = r2.A
            if (r0 != 0) goto L34
            android.content.Context r0 = r2.getContext()
            androidx.appcompat.widget.AppCompatTextView r0 = com.beizi.ad.internal.h.u.b(r0)
            r2.A = r0
            com.beizi.ad.internal.view.AdViewImpl$8 r1 = new com.beizi.ad.internal.view.AdViewImpl$8
            r1.<init>(r2, r3)
            r0.setOnClickListener(r1)
        L34:
            androidx.appcompat.widget.AppCompatTextView r0 = r2.A
            r4.addView(r0)
            com.beizi.ad.internal.view.AdViewImpl.U = r4
            com.beizi.ad.internal.view.AdViewImpl.V = r3
            com.beizi.ad.internal.view.AdViewImpl.W = r5
            java.lang.Class r3 = com.beizi.ad.AdActivity.a()
            android.content.Intent r4 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L60
            android.content.Context r5 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L60
            r4.<init>(r5, r3)     // Catch: android.content.ActivityNotFoundException -> L60
            java.lang.String r3 = "ACTIVITY_TYPE"
            java.lang.String r5 = "MRAID"
            r4.putExtra(r3, r5)     // Catch: android.content.ActivityNotFoundException -> L60
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r4.setFlags(r3)     // Catch: android.content.ActivityNotFoundException -> L60
            android.content.Context r3 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L60
            r3.startActivity(r4)     // Catch: android.content.ActivityNotFoundException -> L60
            return
        L60:
            r3 = 0
            com.beizi.ad.internal.view.AdViewImpl.U = r3
            com.beizi.ad.internal.view.AdViewImpl.V = r3
            com.beizi.ad.internal.view.AdViewImpl.W = r3
            return
    }

    boolean a() {
            r1 = this;
            boolean r0 = r1.f7093e
            return r0
    }

    public abstract void activityOnDestroy();

    public abstract void activityOnPause();

    public abstract void activityOnResume();

    public void addBannerCloseBtn() {
            r2 = this;
            android.widget.ImageView r0 = r2.B
            com.beizi.ad.internal.h.u.a(r0)
            android.content.Context r0 = r2.getContext()
            android.widget.ImageView r0 = com.beizi.ad.internal.h.u.a(r0)
            r2.B = r0
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.B
            r1 = 1
            r0.setEnabled(r1)
            android.widget.ImageView r0 = r2.B
            com.beizi.ad.internal.view.AdViewImpl$21 r1 = new com.beizi.ad.internal.view.AdViewImpl$21
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    public void addCloseButton(int r15, int r16, int r17, android.view.View r18, boolean r19) {
            r14 = this;
            r6 = r16
            r8 = r17
            androidx.appcompat.widget.AppCompatTextView r2 = r14.A
            com.beizi.ad.internal.h.u.a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.z
            com.beizi.ad.internal.h.u.a(r2)
            android.os.CountDownTimer r2 = r14.C
            if (r2 == 0) goto L15
            r2.cancel()
        L15:
            android.content.Context r2 = r14.getContext()
            int r3 = r14.leftPadding
            int r4 = r14.topPadding
            int r5 = r14.rightPadding
            int r7 = r14.bottomPadding
            androidx.appcompat.widget.AppCompatTextView r2 = com.beizi.ad.internal.h.u.a(r2, r3, r4, r5, r7)
            r14.A = r2
            r13 = 0
            r2 = -1
            if (r8 == r2) goto L67
            android.content.Context r7 = r14.getContext()
            int r9 = r14.leftPadding
            int r10 = r14.topPadding
            int r11 = r14.rightPadding
            int r12 = r14.bottomPadding
            androidx.appcompat.widget.AppCompatTextView r0 = com.beizi.ad.internal.h.u.a(r7, r8, r9, r10, r11, r12)
            r14.z = r0
            if (r6 <= 0) goto L48
            int r0 = r8 - r6
            androidx.appcompat.widget.AppCompatTextView r2 = r14.A
            r2.setEnabled(r13)
            r6 = r0
            goto L52
        L48:
            if (r6 != r2) goto L51
            androidx.appcompat.widget.AppCompatTextView r0 = r14.A
            r2 = 8
            r0.setVisibility(r2)
        L51:
            r6 = 0
        L52:
            com.beizi.ad.internal.view.AdViewImpl$4 r0 = new com.beizi.ad.internal.view.AdViewImpl$4
            int r2 = r8 * 1000
            long r2 = (long) r2
            r4 = 50
            r1 = r14
            r8 = r18
            r7 = r19
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r14.C = r0
            r0.start()
            goto L9a
        L67:
            if (r6 == r2) goto Lc8
            if (r15 == r2) goto Lc8
            android.content.Context r0 = r14.getContext()
            int r2 = r14.leftPadding
            int r3 = r14.topPadding
            int r4 = r14.rightPadding
            int r5 = r14.bottomPadding
            r1 = r15
            androidx.appcompat.widget.AppCompatTextView r0 = com.beizi.ad.internal.h.u.a(r0, r1, r2, r3, r4, r5)
            r14.z = r0
            if (r6 <= 0) goto L89
            androidx.appcompat.widget.AppCompatTextView r0 = r14.A
            r0.setEnabled(r13)
            int r13 = r15 - r6
            r6 = r13
            goto L8a
        L89:
            r6 = 0
        L8a:
            com.beizi.ad.internal.view.AdViewImpl$5 r0 = new com.beizi.ad.internal.view.AdViewImpl$5
            int r1 = r15 * 1000
            long r2 = (long) r1
            r4 = 50
            r1 = r14
            r0.<init>(r1, r2, r4, r6)
            r14.C = r0
            r0.start()
        L9a:
            androidx.appcompat.widget.AppCompatTextView r0 = r14.A
            com.beizi.ad.internal.view.AdViewImpl$7 r1 = new com.beizi.ad.internal.view.AdViewImpl$7
            r8 = r18
            r2 = r19
            r1.<init>(r14, r2, r8)
            r0.setOnClickListener(r1)
            boolean r0 = r14.e()
            if (r0 == 0) goto Lb3
            android.view.ViewParent r0 = r8.getParent()
            goto Lb7
        Lb3:
            android.view.ViewParent r0 = r14.getParent()
        Lb7:
            boolean r1 = r0 instanceof android.widget.FrameLayout
            if (r1 == 0) goto L109
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            androidx.appcompat.widget.AppCompatTextView r1 = r14.A
            r0.addView(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = r14.z
            r0.addView(r1)
            return
        Lc8:
            r8 = r18
            if (r15 == r2) goto L109
            android.content.Context r0 = r14.getContext()
            int r2 = r14.leftPadding
            int r3 = r14.topPadding
            int r4 = r14.rightPadding
            int r5 = r14.bottomPadding
            r1 = r15
            androidx.appcompat.widget.AppCompatTextView r0 = com.beizi.ad.internal.h.u.a(r0, r1, r2, r3, r4, r5)
            r14.z = r0
            com.beizi.ad.internal.view.AdViewImpl$6 r0 = new com.beizi.ad.internal.view.AdViewImpl$6
            int r1 = r15 * 1000
            long r2 = (long) r1
            r4 = 50
            r1 = r14
            r0.<init>(r1, r2, r4)
            r14.C = r0
            r0.start()
            boolean r0 = r14.e()
            if (r0 == 0) goto Lfa
            android.view.ViewParent r0 = r8.getParent()
            goto Lfe
        Lfa:
            android.view.ViewParent r0 = r14.getParent()
        Lfe:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L109
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            androidx.appcompat.widget.AppCompatTextView r2 = r14.z
            r0.addView(r2)
        L109:
            return
    }

    public void addDownloadTextView(android.view.View r10) {
            r9 = this;
            com.beizi.ad.internal.f.c r0 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lc3
            if (r10 != 0) goto L8
            goto Lc3
        L8:
            int r0 = r0.I()     // Catch: java.lang.Exception -> Lc3
            r1 = 2
            if (r0 == r1) goto L12
            r2 = 5
            if (r0 != r2) goto Lc3
        L12:
            com.beizi.ad.internal.f.c r0 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            java.lang.String r4 = r0.B()     // Catch: java.lang.Exception -> Lc3
            com.beizi.ad.internal.f.c r0 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = r0.D()     // Catch: java.lang.Exception -> Lc3
            com.beizi.ad.internal.f.c r2 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            java.lang.String r2 = r2.C()     // Catch: java.lang.Exception -> Lc3
            com.beizi.ad.internal.f.c r3 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            java.lang.String r3 = r3.F()     // Catch: java.lang.Exception -> Lc3
            com.beizi.ad.internal.f.c r5 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            java.lang.String r5 = r5.E()     // Catch: java.lang.Exception -> Lc3
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lc3
            if (r6 != 0) goto L38
            r6 = r3
            goto L39
        L38:
            r6 = r5
        L39:
            com.beizi.ad.internal.f.c r3 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            java.lang.String r5 = r3.G()     // Catch: java.lang.Exception -> Lc3
            com.beizi.ad.internal.f.c r3 = r9.serverResponse     // Catch: java.lang.Exception -> Lc3
            java.lang.String r7 = r3.H()     // Catch: java.lang.Exception -> Lc3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc3
            r3.<init>()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r8 = "应用名称："
            r3.append(r8)     // Catch: java.lang.Exception -> Lc3
            r3.append(r4)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r8 = " | 开发者："
            r3.append(r8)     // Catch: java.lang.Exception -> Lc3
            r3.append(r0)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = " | 应用版本："
            r3.append(r0)     // Catch: java.lang.Exception -> Lc3
            r3.append(r2)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = " | <u>权限详情</u> | <u>隐私协议</u> | <u>功能介绍</u>"
            r3.append(r0)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> Lc3
            android.view.ViewParent r10 = r10.getParent()     // Catch: java.lang.Exception -> Lc3
            android.widget.TextView r8 = new android.widget.TextView     // Catch: java.lang.Exception -> Lc3
            android.content.Context r2 = r9.getContext()     // Catch: java.lang.Exception -> Lc3
            r8.<init>(r2)     // Catch: java.lang.Exception -> Lc3
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch: java.lang.Exception -> Lc3
            r8.setText(r0)     // Catch: java.lang.Exception -> Lc3
            r0 = 1086324736(0x40c00000, float:6.0)
            r8.setTextSize(r1, r0)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = "#999999"
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> Lc3
            r8.setTextColor(r0)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = "#333333"
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> Lc3
            r2 = 1065353216(0x3f800000, float:1.0)
            r8.setShadowLayer(r2, r2, r2, r0)     // Catch: java.lang.Exception -> Lc3
            r0 = 10
            r8.setPadding(r0, r0, r0, r0)     // Catch: java.lang.Exception -> Lc3
            com.beizi.ad.internal.view.AdViewImpl$17 r2 = new com.beizi.ad.internal.view.AdViewImpl$17     // Catch: java.lang.Exception -> Lc3
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lc3
            r8.setOnClickListener(r2)     // Catch: java.lang.Exception -> Lc3
            android.content.Context r0 = r9.getContext()     // Catch: java.lang.Exception -> Lc3
            int r0 = com.beizi.ad.lance.a.q.d(r0)     // Catch: java.lang.Exception -> Lc3
            int r0 = r0 * 2
            int r0 = r0 / 3
            boolean r1 = r10 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> Lc3
            if (r1 == 0) goto Lc3
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10     // Catch: java.lang.Exception -> Lc3
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lc3
            r2 = -2
            r3 = 83
            r1.<init>(r0, r2, r3)     // Catch: java.lang.Exception -> Lc3
            r10.addView(r8, r1)     // Catch: java.lang.Exception -> Lc3
        Lc3:
            return
    }

    public void addInterstitialCloseButton(int r10, int r11, android.view.View r12, boolean r13) {
            r9 = this;
            androidx.appcompat.widget.AppCompatTextView r3 = r9.z
            com.beizi.ad.internal.h.u.a(r3)
            r3 = -1
            if (r11 == r3) goto L2d
            android.content.Context r3 = r9.getContext()
            androidx.appcompat.widget.AppCompatTextView r3 = com.beizi.ad.internal.h.u.a(r3, r11)
            r9.z = r3
            if (r10 <= 0) goto L18
            int r0 = r11 - r10
            r6 = r0
            goto L1a
        L18:
            r0 = 0
            r6 = 0
        L1a:
            com.beizi.ad.internal.view.AdViewImpl$19 r0 = new com.beizi.ad.internal.view.AdViewImpl$19
            int r2 = r11 * 1000
            long r2 = (long) r2
            r4 = 50
            r1 = r9
            r8 = r12
            r7 = r13
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r9.C = r0
            r0.start()
            goto L4d
        L2d:
            if (r10 == r3) goto L67
            android.content.Context r2 = r9.getContext()
            androidx.appcompat.widget.AppCompatTextView r2 = com.beizi.ad.internal.h.u.a(r2, r10)
            r9.z = r2
            com.beizi.ad.internal.view.AdViewImpl$20 r2 = new com.beizi.ad.internal.view.AdViewImpl$20
            int r0 = r10 * 1000
            long r3 = (long) r0
            r0 = r2
            r2 = r3
            r4 = 50
            r1 = r9
            r7 = r12
            r6 = r13
            r0.<init>(r1, r2, r4, r6, r7)
            r9.C = r0
            r0.start()
        L4d:
            boolean r0 = r9.e()
            if (r0 == 0) goto L58
            android.view.ViewParent r0 = r12.getParent()
            goto L5c
        L58:
            android.view.ViewParent r0 = r9.getParent()
        L5c:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L67
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            androidx.appcompat.widget.AppCompatTextView r2 = r9.z
            r0.addView(r2)
        L67:
            return
    }

    public void addMuteButton(com.beizi.ad.internal.video.AdVideoView r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = r1.D
            com.beizi.ad.internal.h.u.a(r0)
            android.content.Context r0 = r1.getContext()
            androidx.appcompat.widget.AppCompatImageView r3 = com.beizi.ad.internal.h.u.a(r0, r3)
            r1.D = r3
            com.beizi.ad.internal.view.AdViewImpl$18 r0 = new com.beizi.ad.internal.view.AdViewImpl$18
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            boolean r3 = r1.e()
            if (r3 == 0) goto L22
            android.view.ViewParent r2 = r2.getParent()
            goto L26
        L22:
            android.view.ViewParent r2 = r1.getParent()
        L26:
            boolean r3 = r2 instanceof android.widget.FrameLayout
            if (r3 == 0) goto L31
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            androidx.appcompat.widget.AppCompatImageView r3 = r1.D
            r2.addView(r3)
        L31:
            return
    }

    public void addSkipView(int r7, android.view.View r8) {
            r6 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = r6.A
            com.beizi.ad.internal.h.u.a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = r6.z
            com.beizi.ad.internal.h.u.a(r0)
            android.os.CountDownTimer r0 = r6.C
            if (r0 == 0) goto L11
            r0.cancel()
        L11:
            if (r7 > 0) goto L14
            r7 = 5
        L14:
            com.beizi.ad.internal.view.AdViewImpl$2 r0 = new com.beizi.ad.internal.view.AdViewImpl$2
            int r7 = r7 * 1000
            long r2 = (long) r7
            r4 = 50
            r1 = r6
            r0.<init>(r1, r2, r4)
            r1.C = r0
            r0.start()
            r7 = 0
            r8.setVisibility(r7)
            com.beizi.ad.internal.view.AdViewImpl$3 r7 = new com.beizi.ad.internal.view.AdViewImpl$3
            r7.<init>(r6)
            r8.setOnClickListener(r7)
            return
    }

    void b() {
            r0 = this;
            r0.getVisibility()
            return
    }

    protected abstract void b(android.content.Context r1, android.util.AttributeSet r2);

    void c() {
            r0 = this;
            r0.getVisibility()
            return
    }

    public void clearAdRequest() {
            r1 = this;
            r0 = 0
            r1.f7097i = r0
            return
    }

    public void closeAd() {
            r1 = this;
            com.beizi.ad.internal.c r0 = r1.getAdDispatcher()     // Catch: java.lang.Exception -> Lc
            r0.b()     // Catch: java.lang.Exception -> Lc
            android.os.CountDownTimer r0 = r1.C     // Catch: java.lang.Exception -> Lc
            r0.cancel()     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    public void createAdLogo(com.beizi.ad.internal.f.c.a r3, com.beizi.ad.internal.f.c.a r4) {
            r2 = this;
            android.widget.FrameLayout r0 = r2.K
            com.beizi.ad.internal.h.u.a(r0)
            android.widget.FrameLayout r0 = r2.L
            com.beizi.ad.internal.h.u.a(r0)
            java.lang.String r0 = r3.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            android.content.MutableContextWrapper r0 = new android.content.MutableContextWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            android.widget.FrameLayout r3 = com.beizi.ad.internal.h.u.b(r0, r3)
            r2.K = r3
        L23:
            java.lang.String r3 = r4.a()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3c
            android.content.MutableContextWrapper r3 = new android.content.MutableContextWrapper
            android.content.Context r0 = r2.getContext()
            r3.<init>(r0)
            android.widget.FrameLayout r3 = com.beizi.ad.internal.h.u.a(r3, r4)
            r2.L = r3
        L3c:
            return
    }

    abstract boolean d();

    public void destroy() {
            r1 = this;
            com.beizi.ad.internal.view.c r0 = r1.f7091c
            if (r0 == 0) goto La
            r0.destroy()
            r0 = 0
            r1.f7091c = r0
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.F
            r0.onTouchEvent(r2)
            boolean r2 = super.dispatchTouchEvent(r2)
            return r2
    }

    abstract boolean e();

    abstract void f();

    protected void finalize() {
            r1 = this;
            super.finalize()     // Catch: java.lang.Throwable -> L4
            goto L5
        L4:
        L5:
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            if (r0 == 0) goto Lc
            r0.a()
        Lc:
            return
    }

    public com.beizi.ad.internal.c getAdDispatcher() {
            r1 = this;
            com.beizi.ad.internal.view.AdViewImpl$b r0 = r1.v
            return r0
    }

    public java.lang.String getAdId() {
            r1 = this;
            java.lang.String r0 = r1.O
            return r0
    }

    public com.beizi.ad.a getAdListener() {
            r1 = this;
            com.beizi.ad.a r0 = r1.q
            return r0
    }

    public com.beizi.ad.internal.e getAdParameters() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            return r0
    }

    public com.beizi.ad.internal.f.a.C0104a getAdRequest() {
            r1 = this;
            com.beizi.ad.internal.f.a$a r0 = r1.f7097i
            return r0
    }

    public com.beizi.ad.c getAdSize() {
            r3 = this;
            com.beizi.ad.c r0 = new com.beizi.ad.c
            int r1 = r3.n
            int r2 = r3.o
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.String getAdUnitId() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            java.lang.String r0 = r0.c()
            return r0
    }

    public com.beizi.ad.d getAppEventListener() {
            r1 = this;
            com.beizi.ad.d r0 = r1.s
            return r0
    }

    public java.lang.String getAuctionStrategyData() {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.serverResponse
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.R()
            return r0
    }

    com.beizi.ad.internal.view.AdViewImpl.c getBrowserStyle() {
            r1 = this;
            com.beizi.ad.internal.view.AdViewImpl$c r0 = r1.t
            return r0
    }

    int getContainerHeight() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            int r0 = r0.g()
            return r0
    }

    int getContainerWidth() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            int r0 = r0.f()
            return r0
    }

    public int getCreativeHeight() {
            r1 = this;
            int r0 = r1.o
            return r0
    }

    public int getCreativeWidth() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    public java.lang.String getLandingPageUrl() {
            r1 = this;
            java.lang.String r0 = r1.N
            return r0
    }

    public boolean getLoadsInBackground() {
            r1 = this;
            boolean r0 = r1.f7095g
            return r0
    }

    public java.lang.String getMediationAdapterClassName() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.os.Handler getMyHandler() {
            r1 = this;
            android.os.Handler r0 = r1.u
            return r0
    }

    public boolean getOpensNativeBrowser() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            boolean r0 = r0.h()
            return r0
    }

    public java.lang.String getPrice() {
            r1 = this;
            java.lang.String r0 = r1.M
            return r0
    }

    public com.beizi.ad.l getRewaredVideoAdListener() {
            r1 = this;
            com.beizi.ad.l r0 = r1.r
            return r0
    }

    public java.util.Map getSensorData() {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.serverResponse
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map r0 = r0.Q()
            return r0
    }

    public boolean getShowLoadingIndicator() {
            r1 = this;
            boolean r0 = r1.x
            return r0
    }

    public android.view.ViewGroup getSplashParent() {
            r1 = this;
            android.view.ViewGroup r0 = r1.a
            return r0
    }

    public boolean isCloseMarketDialog() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            if (r0 == 0) goto L9
            boolean r0 = r0.l()
            return r0
        L9:
            r0 = 1
            return r0
    }

    public boolean isDownloadApp() {
            r1 = this;
            boolean r0 = r1.R
            return r0
    }

    public void isLoadToShow(com.beizi.ad.internal.view.AdWebView r1) {
            r0 = this;
            r0.S = r1
            r1 = 1
            r0.T = r1
            com.beizi.ad.a r1 = r0.q
            if (r1 == 0) goto Lc
            r1.a()
        Lc:
            return
    }

    public boolean isLoaded() {
            r1 = this;
            boolean r0 = r1.T
            return r0
    }

    public boolean isLoading() {
            r1 = this;
            boolean r0 = r1.y
            return r0
    }

    @Override // com.beizi.ad.internal.a
    public boolean isReadyToStart() {
            r2 = this;
            boolean r0 = r2.a()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.beizi.ad.internal.e r0 = r2.f7096h
            if (r0 == 0) goto L18
            boolean r0 = r0.j()
            if (r0 == 0) goto L18
            com.beizi.ad.internal.f.a$a r0 = r2.f7097i
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            return r1
    }

    public boolean isRewardedVideo() {
            r1 = this;
            boolean r0 = r1.f7098j
            return r0
    }

    public boolean loadAd(com.beizi.ad.internal.f.a.C0104a r3) {
            r2 = this;
            r2.f7097i = r3
            boolean r3 = r2.isReadyToStart()
            r0 = 0
            if (r3 != 0) goto L12
            com.beizi.ad.a r3 = r2.q
            if (r3 == 0) goto L11
            r1 = 4
            r3.a(r1)
        L11:
            return r0
        L12:
            int r3 = r2.getWindowVisibility()
            r1 = 1
            if (r3 != 0) goto L31
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            if (r3 == 0) goto L31
            r3.a()
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            r3.c()
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            r3.b()
            r2.y = r1
            r2.loadCount = r1
            r2.clickCount = r0
            return r1
        L31:
            android.view.ViewGroup r3 = r2.a
            if (r3 == 0) goto L4c
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            if (r3 == 0) goto L4c
            r3.a()
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            r3.c()
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            r3.b()
            r2.y = r1
            r2.loadCount = r1
            r2.clickCount = r0
        L4c:
            return r0
    }

    public void onCreateLifeCycle() {
            r0 = this;
            return
    }

    public void onDestoryLifeCycle() {
            r1 = this;
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            return
    }

    public void onPauseLifeCycle() {
            r0 = this;
            return
    }

    public void onRestartLifeCycle() {
            r0 = this;
            return
    }

    public void onResumeLifeCycle() {
            r2 = this;
            com.beizi.ad.internal.view.AdViewImpl$a r0 = r2.f7090b
            com.beizi.ad.internal.view.AdViewImpl$a$a r1 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7124d
            r0.a(r1)
            com.beizi.ad.internal.view.AdViewImpl$a r0 = r2.f7090b
            com.beizi.ad.internal.view.AdViewImpl$a$a r0 = r0.c()
            if (r0 != r1) goto L16
            com.beizi.ad.internal.c r0 = r2.getAdDispatcher()
            r0.b()
        L16:
            return
    }

    public void onStartLifeCycle() {
            r0 = this;
            return
    }

    public void onStopLifeCycle() {
            r2 = this;
            com.beizi.ad.internal.view.AdViewImpl$a r0 = r2.f7090b
            com.beizi.ad.internal.view.AdViewImpl$a$a r1 = com.beizi.ad.internal.view.AdViewImpl.a.EnumC0112a.f7123c
            r0.a(r1)
            return
    }

    public void openAdInNativeBrowser(boolean r1) {
            r0 = this;
            r0.setOpensNativeBrowser(r1)
            return
    }

    public void pingClick(java.lang.String r2) {
            r1 = this;
            boolean r0 = com.beizi.ad.internal.h.o.a(r2)
            if (r0 != 0) goto L11
            com.beizi.ad.internal.i r0 = new com.beizi.ad.internal.i
            r0.<init>(r2)
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]
            r0.execute(r2)
        L11:
            return
    }

    public void pingConvert(java.lang.String r2) {
            r1 = this;
            boolean r0 = com.beizi.ad.internal.h.o.a(r2)
            if (r0 != 0) goto L11
            com.beizi.ad.internal.i r0 = new com.beizi.ad.internal.i
            r0.<init>(r2)
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]
            r0.execute(r2)
        L11:
            return
    }

    public void sendLossNotificationWithInfo(java.util.Map r2) {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.serverResponse
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.b(r2)
        La:
            return
    }

    public void sendWinNotificationWithInfo(java.util.Map r2) {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.serverResponse
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.a(r2)
        La:
            return
    }

    void setAdExtInfo(java.lang.String r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setAdId(java.lang.String r1) {
            r0 = this;
            r0.O = r1
            return
    }

    public void setAdListener(com.beizi.ad.a r2) {
            r1 = this;
            boolean r0 = r1.f7098j
            if (r0 == 0) goto L5
            return
        L5:
            r1.q = r2
            return
    }

    public void setAdUnitId(java.lang.String r2) {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            r0.b(r2)
            return
    }

    public void setAppEventListener(com.beizi.ad.d r1) {
            r0 = this;
            r0.s = r1
            return
    }

    protected void setBrowserStyle(com.beizi.ad.internal.view.AdViewImpl.c r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setCloseButtonPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.leftPadding = r1
            r0.topPadding = r2
            r0.rightPadding = r3
            r0.bottomPadding = r4
            return
    }

    public void setCloseMarketDialog(boolean r2) {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            return
    }

    void setCreativeHeight(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    void setCreativeWidth(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setDownloadApp(boolean r1) {
            r0 = this;
            r0.R = r1
            return
    }

    public void setLandingPageUrl(java.lang.String r1) {
            r0 = this;
            r0.N = r1
            return
    }

    public void setLoadsInBackground(boolean r1) {
            r0 = this;
            r0.f7095g = r1
            return
    }

    public void setOpensNativeBrowser(boolean r2) {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            r0.b(r2)
            return
    }

    public void setPrice(java.lang.String r1) {
            r0 = this;
            r0.M = r1
            return
    }

    public void setRewardedVideoAdListener(com.beizi.ad.l r2) {
            r1 = this;
            boolean r0 = r1.f7098j
            if (r0 != 0) goto L5
            return
        L5:
            r1.r = r2
            return
    }

    protected void setShouldResizeParent(boolean r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void setShowLoadingIndicator(boolean r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public void showAd() {
            r8 = this;
            android.view.ViewGroup r0 = r8.a     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto Lf
            r0.removeAllViews()     // Catch: java.lang.Exception -> Ld
            android.view.ViewGroup r0 = r8.a     // Catch: java.lang.Exception -> Ld
            r0.addView(r8)     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r2 = r8
            goto L54
        Lf:
            com.beizi.ad.internal.view.AdWebView r0 = r8.S     // Catch: java.lang.Exception -> Ld
            com.beizi.ad.internal.f.c r1 = r0.ad     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto L2a
            com.beizi.ad.internal.k r1 = r1.a     // Catch: java.lang.Exception -> Ld
            com.beizi.ad.internal.k r2 = com.beizi.ad.internal.k.a     // Catch: java.lang.Exception -> Ld
            if (r1 != r2) goto L2a
            android.view.View r1 = r8.m     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto L2a
            int r0 = r0.getAutoCloseTime()     // Catch: java.lang.Exception -> Ld
            android.view.View r1 = r8.m     // Catch: java.lang.Exception -> Ld
            r8.addSkipView(r0, r1)     // Catch: java.lang.Exception -> Ld
            r2 = r8
            goto L4a
        L2a:
            int r4 = r0.getShowCloseBtnTime()     // Catch: java.lang.Exception -> Ld
            com.beizi.ad.internal.view.AdWebView r0 = r8.S     // Catch: java.lang.Exception -> Ld
            int r5 = r0.getAutoCloseTime()     // Catch: java.lang.Exception -> Ld
            com.beizi.ad.internal.view.AdWebView r6 = r8.S     // Catch: java.lang.Exception -> Ld
            com.beizi.ad.internal.f.c r0 = r6.ad     // Catch: java.lang.Exception -> Ld
            com.beizi.ad.model.f$a r0 = r0.x()     // Catch: java.lang.Exception -> Ld
            com.beizi.ad.model.f$a r1 = com.beizi.ad.model.f.a.f7423b     // Catch: java.lang.Exception -> Ld
            if (r0 != r1) goto L43
            r0 = 1
            r7 = 1
            goto L45
        L43:
            r0 = 0
            r7 = 0
        L45:
            r3 = -1
            r2 = r8
            r2.addCloseButton(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L54
        L4a:
            com.beizi.ad.internal.view.AdWebView r0 = r2.S     // Catch: java.lang.Exception -> L54
            com.beizi.ad.internal.view.AdViewImpl$15 r1 = new com.beizi.ad.internal.view.AdViewImpl$15     // Catch: java.lang.Exception -> L54
            r1.<init>(r8)     // Catch: java.lang.Exception -> L54
            r0.post(r1)     // Catch: java.lang.Exception -> L54
        L54:
            return
    }

    public void showAdLogo(android.view.View r7) {
            r6 = this;
            android.widget.FrameLayout r0 = r6.K     // Catch: java.lang.Exception -> L90
            com.beizi.ad.internal.h.u.a(r0)     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout r0 = r6.L     // Catch: java.lang.Exception -> L90
            com.beizi.ad.internal.h.u.a(r0)     // Catch: java.lang.Exception -> L90
            boolean r0 = r6.e()     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L15
            android.view.ViewParent r7 = r7.getParent()     // Catch: java.lang.Exception -> L90
            goto L16
        L15:
            r7 = r6
        L16:
            boolean r0 = r7 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L90
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> L90
            android.content.Context r1 = r6.getContext()     // Catch: java.lang.Exception -> L90
            r0.<init>(r1)     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L90
            r2 = 17
            r3 = -2
            r1.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L90
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout r1 = r6.L     // Catch: java.lang.Exception -> L90
            r4 = 0
            if (r1 == 0) goto L4a
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L90
            r5.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L90
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout r1 = r6.L     // Catch: java.lang.Exception -> L90
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout r1 = r6.L     // Catch: java.lang.Exception -> L90
            com.beizi.ad.internal.view.AdViewImpl$16 r5 = new com.beizi.ad.internal.view.AdViewImpl$16     // Catch: java.lang.Exception -> L90
            r5.<init>(r6)     // Catch: java.lang.Exception -> L90
            r1.setOnClickListener(r5)     // Catch: java.lang.Exception -> L90
        L4a:
            android.widget.FrameLayout r1 = r6.K     // Catch: java.lang.Exception -> L90
            if (r1 == 0) goto L5b
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L90
            r5.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L90
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout r1 = r6.K     // Catch: java.lang.Exception -> L90
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L90
        L5b:
            android.widget.FrameLayout r1 = r6.K     // Catch: java.lang.Exception -> L90
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L90
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1     // Catch: java.lang.Exception -> L90
            r5 = 5
            r1.setMargins(r5, r4, r4, r4)     // Catch: java.lang.Exception -> L90
            r1.gravity = r2     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout r2 = r6.K     // Catch: java.lang.Exception -> L90
            r2.setLayoutParams(r1)     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L90
            r2 = 85
            r1.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L90
            r7.addView(r0, r1)     // Catch: java.lang.Exception -> L90
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L90
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7     // Catch: java.lang.Exception -> L90
            android.content.Context r1 = r6.getContext()     // Catch: java.lang.Exception -> L90
            r2 = 1094713344(0x41400000, float:12.0)
            int r1 = com.beizi.ad.internal.h.u.a(r1, r2)     // Catch: java.lang.Exception -> L90
            r7.setMargins(r4, r4, r1, r1)     // Catch: java.lang.Exception -> L90
            r0.setLayoutParams(r7)     // Catch: java.lang.Exception -> L90
        L90:
            return
    }

    public void showBannerCloseBtn(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.FrameLayout
            if (r0 == 0) goto Ld
            android.widget.ImageView r0 = r1.B
            if (r0 == 0) goto Ld
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.addView(r0)
        Ld:
            return
    }
}
