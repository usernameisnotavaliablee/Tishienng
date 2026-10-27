package com.beizi.ad.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {
    private static boolean F = false;
    private static boolean G = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f6829g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f6830h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f6831i = "";
    private static java.lang.String m = "USED_AD_UNIT_IDS_KEY";
    private static com.beizi.ad.internal.h n = null;
    private static java.lang.String o = "BeiZiImpl";
    private android.os.HandlerThread A;
    private android.util.DisplayMetrics B;
    private boolean C;
    private boolean D;
    private com.beizi.ad.internal.i.f E;
    private int H;
    private java.util.List<com.beizi.ad.internal.b> I;
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f6832b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List<java.lang.String> f6833c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6834d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f6835e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap<java.lang.String, java.lang.String> f6836f;

    /* renamed from: j, reason: collision with root package name */
    public android.content.Context f6837j;

    /* renamed from: k, reason: collision with root package name */
    public float f6838k;
    public float l;
    private java.util.HashSet<java.lang.String> p;
    private java.util.HashSet<java.lang.String> q;
    private java.util.HashSet<java.lang.String> r;
    private java.util.HashSet<java.lang.String> s;
    private java.util.HashSet<java.lang.String> t;
    private java.util.HashSet<java.lang.String> u;
    private int v;
    private boolean w;
    private boolean x;
    private android.os.Handler y;
    private android.os.Handler z;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.h$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.internal.k[] r0 = com.beizi.ad.internal.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.h.AnonymousClass3.a = r0
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.h.AnonymousClass3.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7002d     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.h.AnonymousClass3.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7003e     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.beizi.ad.internal.h.AnonymousClass3.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7005g     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.beizi.ad.internal.h.AnonymousClass3.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7004f     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass3() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public h() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r1 = 0
            r4.f6832b = r1
            r4.f6834d = r0
            java.lang.String r2 = ""
            r4.f6835e = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.f6836f = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.p = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.q = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.r = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.s = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.t = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.u = r2
            r2 = -1
            r4.v = r2
            com.beizi.ad.internal.h$1 r2 = new com.beizi.ad.internal.h$1
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r4, r3)
            r4.y = r2
            r4.z = r1
            r4.A = r1
            r4.C = r0
            r4.D = r0
            r4.H = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.I = r0
            return
    }

    static /* synthetic */ int a(com.beizi.ad.internal.h r2) {
            int r0 = r2.H
            int r1 = r0 + 1
            r2.H = r1
            return r0
    }

    static /* synthetic */ int a(com.beizi.ad.internal.h r0, int r1) {
            r0.H = r1
            return r1
    }

    public static com.beizi.ad.internal.h a() {
            java.lang.Class<com.beizi.ad.internal.h> r0 = com.beizi.ad.internal.h.class
            monitor-enter(r0)
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.n     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.beizi.ad.internal.h r1 = new com.beizi.ad.internal.h     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.beizi.ad.internal.h.n = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.n     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    static /* synthetic */ java.util.List b(com.beizi.ad.internal.h r0) {
            java.util.List<com.beizi.ad.internal.b> r0 = r0.I
            return r0
    }

    static /* synthetic */ int c(com.beizi.ad.internal.h r2) {
            int r0 = r2.H
            int r1 = r0 + (-1)
            r2.H = r1
            return r0
    }

    static /* synthetic */ int d(com.beizi.ad.internal.h r0) {
            int r0 = r0.H
            return r0
    }

    private com.beizi.ad.internal.i.f q() {
            r4 = this;
            android.content.Context r0 = r4.f6837j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.beizi.ad.internal.i.f$a r1 = new com.beizi.ad.internal.i.f$a
            r1.<init>(r0)
            r2 = 52428800(0x3200000, double:2.5903269E-316)
            com.beizi.ad.internal.i.f$a r0 = r1.a(r2)
            com.beizi.ad.internal.i.f r0 = r0.a()
            return r0
    }

    private void r() {
            r5 = this;
            r0 = 1
            java.lang.String r1 = "android.content.pm.PackageParser$Package"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L15
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L15
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L15
        L15:
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L35
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r2.invoke(r3, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "mHiddenApiWarningShown"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L35
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L35
            r1.setBoolean(r2, r0)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    public void a(android.content.Context r1) {
            r0 = this;
            r0.f6837j = r1
            return
    }

    public void a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.Class<com.beizi.ad.internal.h> r0 = com.beizi.ad.internal.h.class
            monitor-enter(r0)
            if (r3 == 0) goto L36
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L32
            r2.f6837j = r1     // Catch: java.lang.Throwable -> L32
            com.beizi.ad.internal.h.f6829g = r4     // Catch: java.lang.Throwable -> L1b
            com.beizi.ad.internal.a.a r4 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Throwable -> L1b
            r4.b()     // Catch: java.lang.Throwable -> L1b
            r2.m()     // Catch: java.lang.Throwable -> L1b
        L1b:
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L32
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Throwable -> L32
            r2.B = r3     // Catch: java.lang.Throwable -> L32
            r3 = 1
            r2.D = r3     // Catch: java.lang.Throwable -> L32
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r4 = 28
            if (r3 < r4) goto L34
            r2.r()     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r3 = move-exception
            goto L3e
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "Context cannot be null."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L32
            throw r3     // Catch: java.lang.Throwable -> L32
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
    }

    public void a(com.beizi.ad.internal.b r2) {
            r1 = this;
            java.util.List<com.beizi.ad.internal.b> r0 = r1.I
            r0.add(r2)
            return
    }

    public void a(com.beizi.ad.internal.k r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = com.beizi.ad.internal.h.o.a(r3)
            if (r0 != 0) goto L3b
            int[] r0 = com.beizi.ad.internal.h.AnonymousClass3.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L36
            r0 = 2
            if (r2 == r0) goto L30
            r0 = 3
            if (r2 == r0) goto L2a
            r0 = 4
            if (r2 == r0) goto L24
            r0 = 5
            if (r2 == r0) goto L1e
            goto L3b
        L1e:
            java.util.HashSet<java.lang.String> r2 = r1.t
            r2.add(r3)
            return
        L24:
            java.util.HashSet<java.lang.String> r2 = r1.s
            r2.add(r3)
            return
        L2a:
            java.util.HashSet<java.lang.String> r2 = r1.r
            r2.add(r3)
            return
        L30:
            java.util.HashSet<java.lang.String> r2 = r1.q
            r2.add(r3)
            return
        L36:
            java.util.HashSet<java.lang.String> r2 = r1.p
            r2.add(r3)
        L3b:
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f6832b = r1
            return
    }

    public void a(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.f6833c = r1
            return
    }

    public com.beizi.ad.internal.i.f b() {
            r1 = this;
            android.content.Context r0 = r1.f6837j
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.beizi.ad.internal.i.f r0 = r1.E
            if (r0 != 0) goto L10
            com.beizi.ad.internal.i.f r0 = r1.q()
            r1.E = r0
        L10:
            return r0
    }

    public java.lang.String b(java.lang.String r2) {
            r1 = this;
            com.beizi.ad.model.b r0 = new com.beizi.ad.model.b
            r0.<init>()
            r0.a(r2)
            java.lang.String r2 = com.beizi.ad.internal.h.o.a()
            r0.b(r2)
            r2 = 0
            r0.a(r2)
            com.beizi.ad.v2.e.b r2 = new com.beizi.ad.v2.e.b
            r2.<init>()
            java.lang.String r2 = r2.a(r0)
            return r2
    }

    public android.os.Handler c() {
            r2 = this;
            android.os.Handler r0 = r2.z
            if (r0 != 0) goto L21
            android.os.HandlerThread r0 = r2.A
            if (r0 != 0) goto L14
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "BackgroundHandler"
            r0.<init>(r1)
            r2.A = r0
            r0.start()
        L14:
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r2.A
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r2.z = r0
        L21:
            android.os.Handler r0 = r2.z
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = com.beizi.ad.internal.h.f6829g
            return r0
    }

    public android.content.Context e() {
            r1 = this;
            android.content.Context r0 = r1.f6837j
            return r0
    }

    public java.lang.String f() {
            r3 = this;
            java.lang.String r0 = "aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAw"
            java.lang.String r0 = com.beizi.ad.lance.a.b.b(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lf
            java.lang.String r0 = ""
            return r0
        Lf:
            boolean r1 = r3.a
            if (r1 == 0) goto L1b
            java.lang.String r1 = "http:"
            java.lang.String r2 = "https:"
            java.lang.String r0 = r0.replace(r1, r2)
        L1b:
            return r0
    }

    public float g() {
            r1 = this;
            float r0 = r1.f6838k
            return r0
    }

    public float h() {
            r1 = this;
            float r0 = r1.l
            return r0
    }

    public float i() {
            r2 = this;
            float r0 = r2.f6838k
            float r1 = r2.l
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public android.util.DisplayMetrics j() {
            r1 = this;
            android.util.DisplayMetrics r0 = r1.B
            return r0
    }

    public java.util.HashSet<java.lang.String> k() {
            r1 = this;
            java.util.HashSet<java.lang.String> r0 = r1.u
            return r0
    }

    public java.lang.String l() {
            r2 = this;
            java.lang.String r0 = r2.f6832b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f()
            r0.append(r1)
            java.lang.String r1 = "/mb/sdk0/json"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1e:
            java.lang.String r0 = r2.f6832b
            return r0
    }

    public void m() {
            r2 = this;
            android.content.Context r0 = r2.f6837j     // Catch: java.lang.Exception -> L14
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L14
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Exception -> L14
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Exception -> L14
            com.beizi.ad.internal.h$2 r1 = new com.beizi.ad.internal.h$2     // Catch: java.lang.Exception -> L14
            r1.<init>(r2)     // Catch: java.lang.Exception -> L14
            r0.registerActivityLifecycleCallbacks(r1)     // Catch: java.lang.Exception -> L14
        L14:
            return
    }

    public java.util.List<java.lang.String> n() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f6833c
            return r0
    }

    public int o() {
            r1 = this;
            int r0 = r1.v
            return r0
    }

    public boolean p() {
            r1 = this;
            boolean r0 = r1.x
            if (r0 == 0) goto L7
            boolean r0 = r1.w
            return r0
        L7:
            r0 = 1
            r1.x = r0
            boolean r0 = com.beizi.ad.lance.a.r.a()
            r1.w = r0
            return r0
    }
}
