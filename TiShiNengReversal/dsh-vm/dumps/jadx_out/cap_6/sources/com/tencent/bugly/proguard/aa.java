package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class aa {
    private static final java.util.Map<java.lang.String, java.lang.String> W = null;
    private static com.tencent.bugly.proguard.aa aq;
    public long A;
    public long B;
    public long C;
    public boolean D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public boolean I;
    public boolean J;
    public java.util.HashMap<java.lang.String, java.lang.String> K;
    public java.util.List<java.lang.String> L;
    public boolean M;
    public com.tencent.bugly.proguard.q N;
    public final android.content.SharedPreferences O;
    public final android.content.SharedPreferences P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final java.lang.Object T;
    public final java.lang.Object U;
    public final java.lang.Object V;
    private final android.content.Context X;
    private java.lang.String Y;
    private java.lang.String Z;
    public final long a;
    private java.lang.String aa;
    private java.lang.String ab;
    private java.lang.String ac;
    private java.lang.String ad;
    private long ae;
    private long af;
    private long ag;
    private java.lang.String ah;
    private java.lang.String ai;
    private java.lang.String aj;
    private java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> ak;
    private java.lang.String al;
    private java.lang.Boolean am;
    private java.lang.String an;
    private java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> ao;
    private java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> ap;
    private final java.util.Map<java.lang.String, java.lang.String> ar;
    private final java.util.Map<java.lang.String, java.lang.String> as;
    private final java.util.Map<java.lang.String, java.lang.String> at;
    private final java.lang.Object au;
    private final java.lang.Object av;
    private final java.lang.Object aw;
    private final java.lang.Object ax;
    private final java.util.List<java.lang.Integer> ay;
    public final byte b;
    public java.lang.String c;
    public final java.lang.String d;
    public java.lang.String e;
    public boolean f;
    public final java.lang.String g;
    public java.lang.String h;
    public final java.lang.String i;

    @java.lang.Deprecated
    public final java.lang.String j;
    public final java.lang.String k;
    public java.lang.String l;
    public long m;
    public boolean n;
    public java.lang.String o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f11q;
    public java.lang.String r;
    public java.lang.String s;
    public java.lang.String t;
    public java.lang.String u;
    public java.util.List<java.lang.String> v;
    public int w;
    public int x;
    public java.lang.String y;
    public long z;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tencent.bugly.proguard.aa.W = r0
            r0 = 0
            com.tencent.bugly.proguard.aa.aq = r0
            return
    }

    private aa(android.content.Context r9) {
            r8 = this;
            r8.<init>()
            r0 = 1
            r8.f = r0
            java.lang.String r1 = "com.tencent.bugly"
            r8.g = r1
            java.lang.String r1 = "4.1.9.3"
            r8.h = r1
            java.lang.String r1 = ""
            r8.i = r1
            r8.j = r1
            java.lang.String r2 = "unknown"
            r8.l = r2
            r8.ab = r2
            r8.ac = r1
            r3 = 0
            r8.m = r3
            r5 = 0
            r8.ad = r5
            r6 = -1
            r8.ae = r6
            r8.af = r6
            r8.ag = r6
            r8.ah = r5
            r8.ai = r5
            r8.aj = r5
            r8.ak = r5
            r6 = 0
            r8.n = r6
            r8.al = r5
            r8.o = r5
            r8.f11q = r5
            r8.r = r5
            r8.s = r5
            r8.am = r5
            r8.an = r5
            r8.t = r5
            r8.u = r5
            r8.ao = r5
            r8.ap = r5
            r8.v = r5
            r7 = -1
            r8.w = r7
            r8.x = r7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8.ar = r7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8.as = r7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8.at = r7
            r8.y = r2
            r8.z = r3
            r8.A = r3
            r8.B = r3
            r8.C = r3
            r8.D = r6
            r8.E = r5
            r8.F = r5
            r8.G = r5
            r8.H = r1
            r8.I = r6
            r8.J = r6
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r8.K = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.L = r1
            r8.M = r6
            r8.N = r5
            r8.Q = r0
            r8.R = r0
            r8.S = r6
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r8.au = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r8.T = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r8.av = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r8.aw = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r8.U = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r8.V = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r8.ax = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.ay = r1
            long r1 = java.lang.System.currentTimeMillis()
            r8.a = r1
            android.content.Context r1 = com.tencent.bugly.proguard.ap.a(r9)
            r8.X = r1
            r8.b = r0
            android.content.pm.PackageInfo r1 = com.tencent.bugly.proguard.z.b(r9)
            if (r1 == 0) goto Lf7
            java.lang.String r2 = r1.versionName     // Catch: java.lang.Throwable -> Lf3
            r8.o = r2     // Catch: java.lang.Throwable -> Lf3
            r8.E = r2     // Catch: java.lang.Throwable -> Lf3
            int r1 = r1.versionCode     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> Lf3
            r8.F = r1     // Catch: java.lang.Throwable -> Lf3
            goto Lf7
        Lf3:
            r1 = move-exception
            com.tencent.bugly.proguard.al.a(r1)
        Lf7:
            java.lang.String r1 = com.tencent.bugly.proguard.z.a(r9)
            r8.c = r1
            int r1 = android.os.Process.myPid()
            java.lang.String r1 = com.tencent.bugly.proguard.z.a(r1)
            r8.d = r1
            java.lang.String r1 = com.tencent.bugly.proguard.z.c(r9)
            r8.f11q = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Android "
            r1.<init>(r2)
            java.lang.String r2 = com.tencent.bugly.proguard.ab.b()
            r1.append(r2)
            java.lang.String r2 = ",level "
            r1.append(r2)
            int r2 = com.tencent.bugly.proguard.ab.c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.k = r1
            java.util.Map r1 = com.tencent.bugly.proguard.z.d(r9)
            if (r1 == 0) goto L1a7
            java.util.List r2 = com.tencent.bugly.proguard.z.a(r1)     // Catch: java.lang.Throwable -> L14b
            r8.v = r2     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = "BUGLY_APPID"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto L14d
            r8.r = r2     // Catch: java.lang.Throwable -> L14b
            java.lang.String r3 = "APP_ID"
            r8.b(r3, r2)     // Catch: java.lang.Throwable -> L14b
            goto L14d
        L14b:
            r1 = move-exception
            goto L1a4
        L14d:
            java.lang.String r2 = "BUGLY_APP_VERSION"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto L159
            r8.o = r2     // Catch: java.lang.Throwable -> L14b
        L159:
            java.lang.String r2 = "BUGLY_APP_CHANNEL"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto L165
            r8.s = r2     // Catch: java.lang.Throwable -> L14b
        L165:
            java.lang.String r2 = "BUGLY_ENABLE_DEBUG"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto L177
            java.lang.String r3 = "true"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L14b
            r8.D = r2     // Catch: java.lang.Throwable -> L14b
        L177:
            java.lang.String r2 = "com.tencent.rdm.uuid"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L14b
            if (r2 == 0) goto L183
            r8.G = r2     // Catch: java.lang.Throwable -> L14b
        L183:
            java.lang.String r2 = "BUGLY_APP_BUILD_NO"
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L14b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L14b
            if (r3 != 0) goto L197
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L14b
            r8.p = r2     // Catch: java.lang.Throwable -> L14b
        L197:
            java.lang.String r2 = "BUGLY_AREA"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L14b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L14b
            if (r1 == 0) goto L1a7
            r8.H = r1     // Catch: java.lang.Throwable -> L14b
            goto L1a7
        L1a4:
            com.tencent.bugly.proguard.al.a(r1)
        L1a7:
            java.lang.String r1 = "bugly_db_"
            java.io.File r1 = r9.getDatabasePath(r1)     // Catch: java.lang.Throwable -> L1bd
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L1bd
            if (r1 != 0) goto L1bf
            r8.J = r0     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r0 = "App is first time to be installed on the device."
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1bd
            com.tencent.bugly.proguard.al.c(r0, r1)     // Catch: java.lang.Throwable -> L1bd
            goto L1bf
        L1bd:
            boolean r0 = com.tencent.bugly.proguard.p.c
        L1bf:
            java.lang.String r0 = "BUGLY_COMMON_VALUES"
            android.content.SharedPreferences r0 = com.tencent.bugly.proguard.ap.a(r0, r9)
            r8.O = r0
            java.lang.String r0 = "BUGLY_RESERVED_VALUES"
            android.content.SharedPreferences r0 = com.tencent.bugly.proguard.ap.a(r0, r9)
            r8.P = r0
            java.lang.String r9 = com.tencent.bugly.proguard.ab.a(r9)
            r8.aj = r9
            r8.E()
            java.lang.String r9 = "com info create end"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.bugly.proguard.al.c(r9, r0)
            return
    }

    public static int B() {
            int r0 = com.tencent.bugly.proguard.ab.c()
            return r0
    }

    @java.lang.Deprecated
    public static boolean C() {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Detect if the emulator is unavailable"
            com.tencent.bugly.proguard.al.a(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean D() {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Detect if the device hook is unavailable"
            com.tencent.bugly.proguard.al.a(r2, r1)
            return r0
    }

    private void E() {
            r9 = this;
            android.content.SharedPreferences r0 = r9.P     // Catch: java.lang.Throwable -> L42
            java.util.Map r0 = r0.getAll()     // Catch: java.lang.Throwable -> L42
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "put reserved request data from sp, key:%s value:%s"
            java.lang.Object r6 = r1.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r7 = r1.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L42
            r2[r4] = r6     // Catch: java.lang.Throwable -> L42
            r2[r3] = r7     // Catch: java.lang.Throwable -> L42
            com.tencent.bugly.proguard.al.c(r5, r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L42
            r9.a(r2, r1, r4)     // Catch: java.lang.Throwable -> L42
            goto Le
        L42:
            r0 = move-exception
            goto L83
        L44:
            java.util.Map<java.lang.String, java.lang.String> r0 = com.tencent.bugly.proguard.aa.W     // Catch: java.lang.Throwable -> L42
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        L4e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "put reserved request data from cache, key:%s value:%s"
            java.lang.Object r6 = r1.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r7 = r1.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L42
            r8[r4] = r6     // Catch: java.lang.Throwable -> L42
            r8[r3] = r7     // Catch: java.lang.Throwable -> L42
            com.tencent.bugly.proguard.al.c(r5, r8)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r1.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L42
            r9.a(r5, r1, r3)     // Catch: java.lang.Throwable -> L42
            goto L4e
        L7d:
            java.util.Map<java.lang.String, java.lang.String> r0 = com.tencent.bugly.proguard.aa.W     // Catch: java.lang.Throwable -> L42
            r0.clear()     // Catch: java.lang.Throwable -> L42
            return
        L83:
            com.tencent.bugly.proguard.al.b(r0)
            return
    }

    private java.lang.String F() {
            r2 = this;
            java.lang.String r0 = r2.ad
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = "androidid"
            r1 = 0
            java.lang.String r0 = com.tencent.bugly.proguard.ap.d(r0, r1)
            r2.ad = r0
        L11:
            java.lang.String r0 = r2.ad
            return r0
    }

    private static java.lang.String G() {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            boolean r1 = com.tencent.bugly.proguard.ap.b(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "-"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
        L16:
            return r0
    }

    public static synchronized com.tencent.bugly.proguard.aa a(android.content.Context r2) {
            java.lang.Class<com.tencent.bugly.proguard.aa> r0 = com.tencent.bugly.proguard.aa.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.aq     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.bugly.proguard.aa r1 = new com.tencent.bugly.proguard.aa     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.aa.aq = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.aq     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private void a(java.lang.String r6, java.lang.String r7, boolean r8) {
            r5 = this;
            boolean r0 = com.tencent.bugly.proguard.ap.b(r6)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            java.lang.String r7 = "key should not be empty %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r1] = r6
            com.tencent.bugly.proguard.al.d(r7, r8)
            return
        L12:
            java.lang.String r0 = "putExtraRequestData key:%s value:%s save:%s"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r2] = r7
            r1 = 2
            r4[r1] = r3
            com.tencent.bugly.proguard.al.c(r0, r4)
            java.lang.Object r0 = r5.ax
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            java.util.Map<java.lang.String, java.lang.String> r7 = r5.as     // Catch: java.lang.Throwable -> L41
            r7.remove(r6)     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences r7 = r5.P     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences$Editor r6 = r7.remove(r6)     // Catch: java.lang.Throwable -> L41
            r6.apply()     // Catch: java.lang.Throwable -> L41
            goto L57
        L41:
            r6 = move-exception
            goto L59
        L43:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.as     // Catch: java.lang.Throwable -> L41
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L57
            android.content.SharedPreferences r8 = r5.P     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch: java.lang.Throwable -> L41
            android.content.SharedPreferences$Editor r6 = r8.putString(r6, r7)     // Catch: java.lang.Throwable -> L41
            r6.apply()     // Catch: java.lang.Throwable -> L41
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r6
    }

    public static synchronized com.tencent.bugly.proguard.aa b() {
            java.lang.Class<com.tencent.bugly.proguard.aa> r0 = com.tencent.bugly.proguard.aa.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.aq     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @java.lang.Deprecated
    public static java.lang.String n() {
            java.lang.String r0 = ""
            return r0
    }

    public final synchronized java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> A() {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> r0 = r2.ao     // Catch: java.lang.Throwable -> Lb
            java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> r1 = r2.ap     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r0.putAll(r1)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto Lf
        Ld:
            monitor-exit(r2)
            return r0
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final void a(int r5, boolean r6) {
            r4 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "setActivityForeState, hash:%s isFore:%s"
            com.tencent.bugly.proguard.al.c(r1, r2)
            if (r6 == 0) goto L22
            java.util.List<java.lang.Integer> r6 = r4.ay
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.add(r5)
            goto L34
        L22:
            java.util.List<java.lang.Integer> r6 = r4.ay
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.remove(r5)
            java.util.List<java.lang.Integer> r5 = r4.ay
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5.remove(r6)
        L34:
            com.tencent.bugly.proguard.q r5 = r4.N
            if (r5 == 0) goto L44
            java.util.List<java.lang.Integer> r6 = r4.ay
            int r6 = r6.size()
            if (r6 <= 0) goto L41
            r3 = 1
        L41:
            r5.setNativeIsAppForeground(r3)
        L44:
            return
    }

    public final void a(java.lang.String r4) {
            r3 = this;
            r3.aa = r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "deviceId"
            com.tencent.bugly.proguard.ap.c(r0, r4)
        Ld:
            java.lang.Object r0 = r3.ax
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.as     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "E8"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    public final void a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = com.tencent.bugly.proguard.ap.b(r4)
            if (r0 != 0) goto L1a
            boolean r0 = com.tencent.bugly.proguard.ap.b(r5)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            java.lang.Object r0 = r3.av
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.ar     // Catch: java.lang.Throwable -> L17
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4
        L1a:
            java.lang.String r0 = "key&value should not be empty %s %s"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            com.tencent.bugly.proguard.al.d(r0, r1)
            return
    }

    public final boolean a() {
            r4 = this;
            java.util.List<java.lang.Integer> r0 = r4.ay
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r3
            java.lang.String r1 = "isAppForeground:%s"
            com.tencent.bugly.proguard.al.c(r1, r2)
            return r0
    }

    public final void b(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.Z
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r0 = "change deviceModel，old:%s new:%s"
            com.tencent.bugly.proguard.al.a(r0, r1)
            r3.Z = r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "deviceModel"
            com.tencent.bugly.proguard.ap.c(r0, r4)
        L1d:
            return
    }

    public final void b(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = com.tencent.bugly.proguard.ap.b(r4)
            if (r0 != 0) goto L1a
            boolean r0 = com.tencent.bugly.proguard.ap.b(r5)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            java.lang.Object r0 = r3.aw
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.at     // Catch: java.lang.Throwable -> L17
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4
        L1a:
            java.lang.String r0 = "server key&value should not be empty %s %s"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            com.tencent.bugly.proguard.al.d(r0, r1)
            return
    }

    public final void c() {
            r2 = this;
            java.lang.Object r0 = r2.au
            monitor-enter(r0)
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lf
            r2.Y = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final synchronized void c(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9
            r0.ab = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final java.lang.String d() {
            r2 = this;
            java.lang.Object r0 = r2.au
            monitor-enter(r0)
            java.lang.String r1 = r2.Y     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            r2.c()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            java.lang.String r1 = r2.Y     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final synchronized void d(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9
            r0.ac = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.e
            boolean r0 = com.tencent.bugly.proguard.ap.b(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.e
            return r0
        Lb:
            java.lang.String r0 = r1.r
            return r0
    }

    public final void e(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            java.lang.String r2 = r2.trim()
            r1.ai = r2
        Lc:
            return
    }

    public final java.lang.String f() {
            r2 = this;
            java.lang.Object r0 = r2.V
            monitor-enter(r0)
            java.lang.String r1 = r2.l     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final java.lang.String f(java.lang.String r4) {
            r3 = this;
            boolean r0 = com.tencent.bugly.proguard.ap.b(r4)
            if (r0 == 0) goto L17
            java.lang.String r0 = "key should not be empty %s"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            com.tencent.bugly.proguard.al.d(r0, r1)
            r4 = 0
            return r4
        L17:
            java.lang.Object r0 = r3.av
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.ar     // Catch: java.lang.Throwable -> L24
            java.lang.Object r4 = r1.remove(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public final java.lang.String g() {
            r2 = this;
            java.lang.String r0 = r2.aa
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.lang.String r1 = "deviceId"
            java.lang.String r0 = com.tencent.bugly.proguard.ap.d(r1, r0)
            r2.aa = r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.String r0 = r2.F()
            r2.aa = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L23
            java.lang.String r0 = G()
            r2.aa = r0
        L23:
            java.lang.String r0 = r2.aa
            if (r0 == 0) goto L2d
            com.tencent.bugly.proguard.ap.c(r1, r0)
            java.lang.String r0 = r2.aa
            return r0
        L2d:
            java.lang.String r0 = ""
            return r0
    }

    public final java.lang.String g(java.lang.String r4) {
            r3 = this;
            boolean r0 = com.tencent.bugly.proguard.ap.b(r4)
            if (r0 == 0) goto L17
            java.lang.String r0 = "key should not be empty %s"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            com.tencent.bugly.proguard.al.d(r0, r1)
            r4 = 0
            return r4
        L17:
            java.lang.Object r0 = r3.av
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.ar     // Catch: java.lang.Throwable -> L24
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public final synchronized java.lang.String h() {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.Z     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return r0
        L7:
            java.lang.String r0 = "deviceModel"
            r1 = 0
            java.lang.String r0 = com.tencent.bugly.proguard.ap.d(r0, r1)     // Catch: java.lang.Throwable -> L21
            r4.Z = r0     // Catch: java.lang.Throwable -> L21
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            java.lang.String r3 = "collect device model from sp:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L21
            r1[r2] = r0     // Catch: java.lang.Throwable -> L21
            com.tencent.bugly.proguard.al.c(r3, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r4.Z     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)
            return r0
        L21:
            r0 = move-exception
            goto L4c
        L23:
            boolean r0 = r4.n     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L32
            java.lang.String r0 = "not allow collect device model"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L21
            com.tencent.bugly.proguard.al.c(r0, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "fail"
            monitor-exit(r4)
            return r0
        L32:
            java.lang.String r0 = com.tencent.bugly.proguard.ab.a()     // Catch: java.lang.Throwable -> L21
            r4.Z = r0     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "collect device model:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L21
            r1[r2] = r0     // Catch: java.lang.Throwable -> L21
            com.tencent.bugly.proguard.al.c(r3, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "deviceModel"
            java.lang.String r1 = r4.Z     // Catch: java.lang.Throwable -> L21
            com.tencent.bugly.proguard.ap.c(r0, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r4.Z     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)
            return r0
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    public final synchronized java.lang.String i() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.ac     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final long j() {
            r5 = this;
            long r0 = r5.ae
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            long r0 = com.tencent.bugly.proguard.ab.e()
            r5.ae = r0
        Le:
            long r0 = r5.ae
            return r0
    }

    public final long k() {
            r5 = this;
            long r0 = r5.af
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            long r0 = com.tencent.bugly.proguard.ab.i()
            r5.af = r0
        Le:
            long r0 = r5.af
            return r0
    }

    public final long l() {
            r5 = this;
            long r0 = r5.ag
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            long r0 = com.tencent.bugly.proguard.ab.k()
            r5.ag = r0
        Le:
            long r0 = r5.ag
            return r0
    }

    public final java.lang.String m() {
            r3 = this;
            java.lang.String r0 = r3.ai
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L18
            java.lang.String r0 = r3.ai
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "get cpu type from so:%s"
            com.tencent.bugly.proguard.al.c(r0, r2)
            java.lang.String r0 = r3.ai
            return r0
        L18:
            java.lang.String r0 = r3.aj
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = r3.aj
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "get cpu type from lib dir:%s"
            com.tencent.bugly.proguard.al.c(r0, r2)
            java.lang.String r0 = r3.aj
            return r0
        L2e:
            java.lang.String r0 = "unknown"
            return r0
    }

    public final java.lang.String o() {
            r6 = this;
            r0 = 0
            android.content.Context r1 = r6.X     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "BuglySdkInfos"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L47
            java.util.Map r1 = r1.getAll()     // Catch: java.lang.Throwable -> L47
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L4b
            java.lang.Object r2 = r6.T     // Catch: java.lang.Throwable -> L47
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L47
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L41
        L1e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L41
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L41
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r6.K     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3c
            r4.put(r5, r3)     // Catch: java.lang.Throwable -> L3c
            goto L1e
        L3c:
            r3 = move-exception
            com.tencent.bugly.proguard.al.a(r3)     // Catch: java.lang.Throwable -> L41
            goto L1e
        L41:
            r1 = move-exception
            goto L45
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            goto L4b
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r1 = move-exception
            com.tencent.bugly.proguard.al.a(r1)
        L4b:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r6.K
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r6.K
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L62:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L90
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r4 = "["
            r1.append(r4)
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = ","
            r1.append(r4)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = "] "
            r1.append(r3)
            goto L62
        L90:
            java.lang.String r2 = "SDK_INFO = %s"
            java.lang.String r3 = r1.toString()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r3
            com.tencent.bugly.proguard.al.c(r2, r4)
            java.lang.String r0 = "SDK_INFO"
            java.lang.String r2 = r1.toString()
            r6.b(r0, r2)
            java.lang.String r0 = r1.toString()
            return r0
        Lac:
            java.lang.String r1 = "SDK_INFO is empty"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.c(r1, r0)
            r0 = 0
            return r0
    }

    public final synchronized java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> p() {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> r0 = r2.ak     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1e
            if (r0 > 0) goto Lc
            goto L20
        Lc:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1e
            java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> r1 = r2.ak     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            java.util.Map<java.lang.String, com.tencent.bugly.crashreport.common.info.PlugInBean> r1 = r2.ak     // Catch: java.lang.Throwable -> L1e
            r0.putAll(r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return r0
        L1e:
            r0 = move-exception
            goto L23
        L20:
            monitor-exit(r2)
            r0 = 0
            return r0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public final java.lang.String q() {
            r1 = this;
            java.lang.String r0 = r1.al
            if (r0 != 0) goto La
            java.lang.String r0 = com.tencent.bugly.proguard.ab.m()
            r1.al = r0
        La:
            java.lang.String r0 = r1.al
            return r0
    }

    public final java.lang.Boolean r() {
            r1 = this;
            java.lang.Boolean r0 = r1.am
            if (r0 != 0) goto Le
            boolean r0 = com.tencent.bugly.proguard.ab.q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.am = r0
        Le:
            java.lang.Boolean r0 = r1.am
            return r0
    }

    public final java.lang.String s() {
            r3 = this;
            java.lang.String r0 = r3.an
            if (r0 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.tencent.bugly.proguard.ab.n()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.an = r0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "ROM ID: %s"
            com.tencent.bugly.proguard.al.a(r0, r1)
        L21:
            java.lang.String r0 = r3.an
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.String> t() {
            r3 = this;
            java.lang.Object r0 = r3.av
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.ar     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            if (r1 > 0) goto L10
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L19
        L10:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.ar     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public final void u() {
            r2 = this;
            java.lang.Object r0 = r2.av
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.ar     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final int v() {
            r2 = this;
            java.lang.Object r0 = r2.av
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.ar     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final java.util.Set<java.lang.String> w() {
            r2 = this;
            java.lang.Object r0 = r2.av
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.ar     // Catch: java.lang.Throwable -> Lb
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final java.util.Map<java.lang.String, java.lang.String> x() {
            r3 = this;
            java.lang.Object r0 = r3.ax
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.as     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            if (r1 > 0) goto L10
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L19
        L10:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.as     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public final java.util.Map<java.lang.String, java.lang.String> y() {
            r3 = this;
            java.lang.Object r0 = r3.aw
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.at     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            if (r1 > 0) goto L10
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L19
        L10:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.at     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public final int z() {
            r2 = this;
            java.lang.Object r0 = r2.U
            monitor-enter(r0)
            int r1 = r2.w     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
