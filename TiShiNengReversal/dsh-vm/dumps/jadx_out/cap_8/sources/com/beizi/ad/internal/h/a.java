package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static com.beizi.ad.internal.h.a J = null;
    public static java.lang.String a = "SDK_UID_KEY";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f6839b = "SDK_UID_KEY_NEW";
    private java.lang.String A;
    private java.lang.String B;
    private java.lang.String C;
    private long D;
    private long E;
    private java.lang.String F;
    private android.content.Context G;
    private java.lang.String H;
    private java.lang.String I;
    private com.beizi.fusion.model.RequestInfo K;
    private com.beizi.fusion.model.DevInfo L;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6840c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f6841d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f6842e;

    /* renamed from: f, reason: collision with root package name */
    private com.beizi.ad.model.f.b f6843f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6844g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f6845h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f6846i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f6847j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f6848k;
    private java.lang.String l;
    private java.lang.String m;
    private boolean n;
    private java.lang.String o;
    private java.lang.String p;
    private boolean q;
    private boolean r;
    private java.lang.String s;
    private java.lang.String t;
    private java.lang.String u;
    private java.lang.String v;
    private java.lang.String w;
    private java.lang.String x;
    private java.lang.String y;
    private java.lang.String z;

    static {
            return
    }

    private a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f6841d = r0
            r1 = 0
            r2.f6840c = r1
            com.beizi.ad.model.f$b r1 = com.beizi.ad.model.f.b.f7435f
            r2.f6843f = r1
            r2.f6844g = r0
            r2.f6845h = r0
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()
            android.content.Context r0 = r0.e()
            r2.G = r0
            if (r0 != 0) goto L1e
            goto L26
        L1e:
            com.beizi.fusion.model.RequestInfo r0 = com.beizi.fusion.model.RequestInfo.getInstance(r0)
            r2.K = r0
            if (r0 != 0) goto L27
        L26:
            return
        L27:
            boolean r1 = r0.isInit
            if (r1 != 0) goto L2e
            r0.init()
        L2e:
            com.beizi.fusion.model.RequestInfo r0 = r2.K
            com.beizi.fusion.model.DevInfo r0 = r0.getDevInfo()
            r2.L = r0
            return
    }

    private void F() {
            r6 = this;
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L6c
            android.content.Context r0 = r0.f6837j     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L6c
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch: java.lang.Throwable -> L6c
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Throwable -> L6c
            r0.getMetrics(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            int r2 = r1.widthPixels     // Catch: java.lang.Throwable -> L6c
            r0.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "_"
            r0.append(r2)     // Catch: java.lang.Throwable -> L6c
            int r2 = r1.heightPixels     // Catch: java.lang.Throwable -> L6c
            r0.append(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            r6.f6844g = r0     // Catch: java.lang.Throwable -> L6c
            int r0 = r1.heightPixels     // Catch: java.lang.Throwable -> L6c
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L6c
            float r2 = r1.ydpi     // Catch: java.lang.Throwable -> L6c
            float r0 = r0 / r2
            int r2 = r1.widthPixels     // Catch: java.lang.Throwable -> L6c
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L6c
            float r1 = r1.xdpi     // Catch: java.lang.Throwable -> L6c
            float r2 = r2 / r1
            float r2 = r2 * r2
            float r0 = r0 * r0
            float r2 = r2 + r0
            double r0 = (double) r2     // Catch: java.lang.Throwable -> L6c
            double r0 = java.lang.Math.sqrt(r0)     // Catch: java.lang.Throwable -> L6c
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "%.2f"
            double r0 = r0 * r2
            long r0 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L6c
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L6c
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L6c
            r6.f6845h = r0     // Catch: java.lang.Throwable -> L6c
        L6c:
            return
    }

    private boolean G() {
            r2 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "HONOR"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    private java.lang.String H() {
            r5 = this;
            java.lang.String r0 = ""
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "/data/data"
            android.system.StructStat r2 = android.system.Os.stat(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto Ld
            return r0
        Ld:
            r3 = 27
            if (r1 < r3) goto L32
            android.system.StructTimespec r1 = com.beizi.ad.internal.h.y.a(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            long r3 = com.beizi.ad.internal.h.z.a(r1)     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "."
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            long r3 = com.beizi.ad.internal.h.a0.a(r1)     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L45
            return r0
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L45
            long r2 = r2.st_atime     // Catch: java.lang.Throwable -> L45
            r1.append(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = ".0"
            r1.append(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L45
        L45:
            return r0
    }

    private boolean I() {
            r2 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "VIVO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    private boolean J() {
            r2 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "OPPO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "REALME"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    private boolean K() {
            r2 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "REDMI"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    public static synchronized com.beizi.ad.internal.h.a a() {
            java.lang.Class<com.beizi.ad.internal.h.a> r0 = com.beizi.ad.internal.h.a.class
            monitor-enter(r0)
            com.beizi.ad.internal.h.a r1 = com.beizi.ad.internal.h.a.J     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.lang.Class<com.beizi.ad.internal.h.a> r1 = com.beizi.ad.internal.h.a.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1c
            com.beizi.ad.internal.h.a r2 = com.beizi.ad.internal.h.a.J     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            com.beizi.ad.internal.h.a r2 = new com.beizi.ad.internal.h.a     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            com.beizi.ad.internal.h.a.J = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L1e
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            goto L22
        L1e:
            com.beizi.ad.internal.h.a r1 = com.beizi.ad.internal.h.a.J     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    public long A() {
            r5 = this;
            long r0 = r5.D
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            com.beizi.fusion.model.RequestInfo r0 = r5.K
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getInstallTime()     // Catch: java.lang.NumberFormatException -> L16
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L16
            r5.D = r0     // Catch: java.lang.NumberFormatException -> L16
        L16:
            long r0 = r5.D
            return r0
    }

    public long B() {
            r5 = this;
            long r0 = r5.E
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            com.beizi.fusion.model.RequestInfo r0 = r5.K
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getUpdateTime()     // Catch: java.lang.NumberFormatException -> L16
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L16
            r5.E = r0     // Catch: java.lang.NumberFormatException -> L16
        L16:
            long r0 = r5.E
            return r0
    }

    public java.lang.String C() {
            r1 = this;
            java.lang.String r0 = r1.F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L12
            com.beizi.fusion.model.RequestInfo r0 = r1.K
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getPackageName()
            r1.F = r0
        L12:
            java.lang.String r0 = r1.F
            return r0
    }

    public java.lang.String D() {
            r1 = this;
            java.lang.String r0 = r1.H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2b
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L2b
            boolean r0 = r0.o()     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L21
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L2b
            android.content.Context r0 = r0.e()     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = com.beizi.ad.lance.a.q.k(r0)     // Catch: java.lang.Exception -> L2b
            r1.H = r0     // Catch: java.lang.Exception -> L2b
            goto L2b
        L21:
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.a()     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r0.p()     // Catch: java.lang.Exception -> L2b
            r1.H = r0     // Catch: java.lang.Exception -> L2b
        L2b:
            java.lang.String r0 = r1.H
            return r0
    }

    public java.lang.String E() {
            r2 = this;
            java.lang.String r0 = r2.I     // Catch: java.lang.Throwable -> L46
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L46
            boolean r0 = r2.I()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L1d
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L46
            android.content.Context r0 = r0.f6837j     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "com.bbk.appstore"
            java.lang.String r0 = com.beizi.ad.lance.a.q.b(r0, r1)     // Catch: java.lang.Throwable -> L46
            r2.I = r0     // Catch: java.lang.Throwable -> L46
            goto L46
        L1d:
            boolean r0 = r2.J()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L32
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L46
            android.content.Context r0 = r0.f6837j     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "com.heytap.market"
            java.lang.String r0 = com.beizi.ad.lance.a.q.b(r0, r1)     // Catch: java.lang.Throwable -> L46
            r2.I = r0     // Catch: java.lang.Throwable -> L46
            goto L46
        L32:
            boolean r0 = r2.K()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L46
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L46
            android.content.Context r0 = r0.f6837j     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "com.xiaomi.market"
            java.lang.String r0 = com.beizi.ad.lance.a.q.b(r0, r1)     // Catch: java.lang.Throwable -> L46
            r2.I = r0     // Catch: java.lang.Throwable -> L46
        L46:
            java.lang.String r0 = r2.I
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f6847j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = r1.H()
            r1.f6847j = r0
        Le:
            java.lang.String r0 = r1.f6847j
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L20
            com.beizi.fusion.model.DevInfo r0 = r1.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getRomVersion()
            r1.p = r0
            goto L20
        L13:
            com.beizi.fusion.tool.ac r0 = com.beizi.fusion.tool.ac.a()     // Catch: java.lang.Throwable -> L20
            r0.b()     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L20
            r1.p = r0     // Catch: java.lang.Throwable -> L20
        L20:
            java.lang.String r0 = r1.p
            return r0
    }

    public java.lang.String d() {
            r3 = this;
            java.lang.String r0 = r3.f6841d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25
            com.beizi.fusion.model.DevInfo r0 = r3.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getSdkUID()
            r3.f6841d = r0
            goto L25
        L13:
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            java.lang.String r1 = com.beizi.ad.internal.h.a.f6839b
            java.lang.String r2 = ""
            java.lang.Object r0 = com.beizi.ad.internal.h.m.b(r0, r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r3.f6841d = r0
        L25:
            java.lang.String r0 = r3.f6841d
            return r0
    }

    public java.lang.String e() {
            r2 = this;
            java.lang.String r0 = r2.f6846i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3e
            com.beizi.fusion.model.DevInfo r0 = r2.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getDensity()
            r2.f6846i = r0
            goto L3e
        L13:
            java.lang.String r0 = r2.f6846i     // Catch: java.lang.Exception -> L3e
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Exception -> L3e
            android.content.Context r1 = r1.f6837j     // Catch: java.lang.Exception -> L3e
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L3e
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Exception -> L3e
            float r1 = r1.density     // Catch: java.lang.Exception -> L3e
            r0.append(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = ""
            r0.append(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L3e
            r2.f6846i = r0     // Catch: java.lang.Exception -> L3e
        L3e:
            java.lang.String r0 = r2.f6846i
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.f6842e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            com.beizi.fusion.model.DevInfo r0 = r1.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getRoot()
            r1.f6842e = r0
            goto L19
        L13:
            java.lang.String r0 = com.beizi.ad.lance.a.q.a()
            r1.f6842e = r0
        L19:
            java.lang.String r0 = r1.f6842e
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f6844g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            com.beizi.fusion.model.DevInfo r0 = r1.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getResolution()
            r1.f6844g = r0
            goto L16
        L13:
            r1.F()
        L16:
            java.lang.String r0 = r1.f6844g
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f6845h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            com.beizi.fusion.model.DevInfo r0 = r1.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getScreenSize()
            r1.f6845h = r0
            goto L16
        L13:
            r1.F()
        L16:
            java.lang.String r0 = r1.f6845h
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.f6848k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            com.beizi.ad.lance.a.q.j(r0)
        L11:
            java.lang.String r0 = r1.f6848k
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = com.beizi.ad.lance.a.q.b()
            r1.l = r0
        Le:
            java.lang.String r0 = r1.l
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            boolean r0 = r1.G()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r1.m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1a
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            java.lang.String r0 = com.beizi.ad.lance.a.q.b(r0)
            r1.m = r0
        L1a:
            java.lang.String r0 = r1.m
            return r0
    }

    public java.lang.String l() {
            r2 = this;
            boolean r0 = r2.G()
            if (r0 == 0) goto L1c
            java.lang.String r0 = r2.o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            java.lang.String r1 = "com.huawei.hwid"
            java.lang.String r0 = com.beizi.ad.lance.a.q.a(r0, r1)
            r2.o = r0
        L1c:
            java.lang.String r0 = r2.o
            return r0
    }

    public boolean m() {
            r2 = this;
            boolean r0 = r2.n
            if (r0 != 0) goto L12
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.content.Context r0 = r0.f6837j
            java.lang.String r1 = "com.tencent.mm"
            boolean r0 = com.beizi.ad.lance.a.h.a(r0, r1)
            r2.n = r0
        L12:
            boolean r0 = r2.n
            return r0
    }

    public com.beizi.ad.model.f.b n() {
            r3 = this;
            com.beizi.ad.model.f$b r0 = r3.f6843f
            com.beizi.ad.model.f$b r1 = com.beizi.ad.model.f.b.f7435f
            if (r0 != r1) goto L69
            com.beizi.fusion.model.DevInfo r2 = r3.L
            if (r2 == 0) goto L28
            java.lang.String r0 = r2.getDevType()
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1b
            com.beizi.ad.model.f$b r0 = com.beizi.ad.model.f.b.f7431b
            r3.f6843f = r0
            goto L69
        L1b:
            java.lang.String r1 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L69
            com.beizi.ad.model.f$b r0 = com.beizi.ad.model.f.b.f7432c
            r3.f6843f = r0
            goto L69
        L28:
            if (r0 != r1) goto L69
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L48
            android.content.Context r0 = r0.f6837j     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L48
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> L48
            int r0 = r0.getPhoneType()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L43
            com.beizi.ad.model.f$b r0 = com.beizi.ad.model.f.b.f7431b     // Catch: java.lang.Throwable -> L48
            r3.f6843f = r0     // Catch: java.lang.Throwable -> L48
            goto L69
        L43:
            com.beizi.ad.model.f$b r0 = com.beizi.ad.model.f.b.f7432c     // Catch: java.lang.Throwable -> L48
            r3.f6843f = r0     // Catch: java.lang.Throwable -> L48
            goto L69
        L48:
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L69
            android.content.Context r0 = r0.f6837j     // Catch: java.lang.Throwable -> L69
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L69
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L69
            int r0 = r0.screenLayout     // Catch: java.lang.Throwable -> L69
            r0 = r0 & 15
            r1 = 4
            if (r0 == r1) goto L65
            r1 = 3
            if (r0 == r1) goto L65
            com.beizi.ad.model.f$b r0 = com.beizi.ad.model.f.b.f7431b     // Catch: java.lang.Throwable -> L69
            r3.f6843f = r0     // Catch: java.lang.Throwable -> L69
            goto L69
        L65:
            com.beizi.ad.model.f$b r0 = com.beizi.ad.model.f.b.f7432c     // Catch: java.lang.Throwable -> L69
            r3.f6843f = r0     // Catch: java.lang.Throwable -> L69
        L69:
            com.beizi.ad.model.f$b r0 = r3.f6843f
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            boolean r0 = r1.q
            if (r0 == 0) goto L7
            java.lang.String r0 = r1.s
            return r0
        L7:
            r0 = 1
            r1.q = r0
            java.lang.String r0 = com.beizi.ad.lance.a.r.d()
            r1.s = r0
            return r0
    }

    public java.lang.String p() {
            r1 = this;
            boolean r0 = r1.r
            if (r0 == 0) goto L7
            java.lang.String r0 = r1.t
            return r0
        L7:
            r0 = 1
            r1.r = r0
            java.lang.String r0 = com.beizi.ad.lance.a.r.c()
            r1.t = r0
            return r0
    }

    public java.lang.String q() {
            r1 = this;
            java.lang.String r0 = com.beizi.ad.lance.a.r.b()
            return r0
    }

    public java.lang.String r() {
            r2 = this;
            java.lang.String r0 = r2.u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.u = r0
        L27:
            java.lang.String r0 = r2.u
            return r0
    }

    public java.lang.String s() {
            r1 = this;
            java.lang.String r0 = r1.v
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L17
            com.beizi.fusion.model.DevInfo r0 = r1.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getBrand()
            r1.v = r0
            goto L17
        L13:
            java.lang.String r0 = android.os.Build.BRAND
            r1.v = r0
        L17:
            java.lang.String r0 = r1.v
            return r0
    }

    public java.lang.String t() {
            r1 = this;
            java.lang.String r0 = r1.w
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L17
            com.beizi.fusion.model.DevInfo r0 = r1.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getModel()
            r1.w = r0
            goto L17
        L13:
            java.lang.String r0 = android.os.Build.MODEL
            r1.w = r0
        L17:
            java.lang.String r0 = r1.w
            return r0
    }

    public java.lang.String u() {
            r1 = this;
            java.lang.String r0 = r1.x
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = com.beizi.fusion.tool.p.d()
            r1.x = r0
        Le:
            java.lang.String r0 = r1.x
            return r0
    }

    public java.lang.String v() {
            r1 = this;
            java.lang.String r0 = r1.y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1d
            com.beizi.fusion.model.DevInfo r0 = r1.L
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getLanguage()
            r1.y = r0
            goto L1d
        L13:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            r1.y = r0
        L1d:
            java.lang.String r0 = r1.y
            return r0
    }

    public java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.G
            java.lang.String r0 = com.beizi.ad.lance.a.n.a(r0)
            r1.z = r0
        L10:
            java.lang.String r0 = r1.z
            return r0
    }

    public java.lang.String x() {
            r1 = this;
            java.lang.String r0 = r1.A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.G
            java.lang.String r0 = com.beizi.ad.lance.a.n.b(r0)
            r1.A = r0
        L10:
            java.lang.String r0 = r1.A
            return r0
    }

    public java.lang.String y() {
            r1 = this;
            java.lang.String r0 = r1.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L12
            com.beizi.fusion.model.RequestInfo r0 = r1.K
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getAppVersion()
            r1.B = r0
        L12:
            java.lang.String r0 = r1.B
            return r0
    }

    public java.lang.String z() {
            r1 = this;
            java.lang.String r0 = r1.C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L12
            com.beizi.fusion.model.RequestInfo r0 = r1.K
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getSdkVersion()
            r1.C = r0
        L12:
            java.lang.String r0 = r1.C
            return r0
    }
}
