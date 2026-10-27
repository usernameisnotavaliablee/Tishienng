package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class c {
    private static final byte[] a = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f861c;

    /* renamed from: d, reason: collision with root package name */
    public static int f862d;

    /* renamed from: e, reason: collision with root package name */
    public static int f863e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile java.util.List f864f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile java.util.List f865g;

    /* renamed from: h, reason: collision with root package name */
    private static java.util.List f866h;

    /* renamed from: i, reason: collision with root package name */
    private static java.util.List f867i;

    /* renamed from: j, reason: collision with root package name */
    private static final java.io.FilenameFilter f868j = null;

    class a implements java.io.FilenameFilter {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File r1, java.lang.String r2) {
                r0 = this;
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                if (r1 != 0) goto L10
                java.lang.String r1 = "^([A-Za-z]{1}[A-Za-z\\d_]*\\.)+[A-Za-z][A-Za-z\\d_]*$"
                boolean r1 = r2.matches(r1)
                if (r1 == 0) goto L10
                r1 = 1
                return r1
            L10:
                r1 = 0
                return r1
        }
    }

    static {
            r0 = 20
            byte[] r0 = new byte[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [111, 115, 101, 121, 78, 106, 124, 119, 125, 92, 69, 125, 88, 119, 114, 91, 65, 126, 109, 101} // fill-array
            cn.jiguang.commons.L.c.a = r0
            r0 = 1
            cn.jiguang.commons.L.c.f861c = r0
            r0 = 2
            cn.jiguang.commons.L.c.f862d = r0
            cn.jiguang.commons.L.c.f863e = r0
            r0 = 0
            cn.jiguang.commons.L.c.f864f = r0
            cn.jiguang.commons.L.c.f865g = r0
            cn.jiguang.commons.L.c.f866h = r0
            cn.jiguang.commons.L.c.f867i = r0
            cn.jiguang.commons.L.c$a r0 = new cn.jiguang.commons.L.c$a
            r0.<init>()
            cn.jiguang.commons.L.c.f868j = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r1) {
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            int r1 = (int) r1
            int r1 = r1 + 1
            return r1
    }

    public static cn.jiguang.commons.c.e a(android.content.pm.PackageInfo r9, boolean r10) {
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L32
            r1 = 1300(0x514, float:1.822E-42)
            boolean r3 = r0.a(r1, r10)     // Catch: java.lang.Exception -> L32
            r1 = 1038(0x40e, float:1.455E-42)
            boolean r4 = r0.a(r1, r10)     // Catch: java.lang.Exception -> L32
            r1 = 1034(0x40a, float:1.449E-42)
            boolean r5 = r0.a(r1, r10)     // Catch: java.lang.Exception -> L32
            r1 = 1039(0x40f, float:1.456E-42)
            boolean r6 = r0.a(r1, r10)     // Catch: java.lang.Exception -> L32
            r1 = 1033(0x409, float:1.448E-42)
            boolean r7 = r0.a(r1, r10)     // Catch: java.lang.Exception -> L32
            r1 = 1103(0x44f, float:1.546E-42)
            boolean r8 = r0.a(r1, r10)     // Catch: java.lang.Exception -> L32
            r2 = r9
            cn.jiguang.commons.c.e r9 = a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2e
            return r9
        L2e:
            r0 = move-exception
            r1 = r2
        L30:
            r9 = r0
            goto L35
        L32:
            r0 = move-exception
            r1 = r9
            goto L30
        L35:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "get config err:"
            r10.append(r0)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "AppUtils"
            cn.jiguang.commons.w.a.c(r10, r9)
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            cn.jiguang.commons.c.e r9 = a(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private static cn.jiguang.commons.c.e a(android.content.pm.PackageInfo r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            cn.jiguang.commons.c.e r1 = new cn.jiguang.commons.c.e     // Catch: java.lang.Exception -> L59
            r1.<init>()     // Catch: java.lang.Exception -> L59
            java.lang.String r2 = r4.packageName     // Catch: java.lang.Exception -> L59
            r1.f1007c = r2     // Catch: java.lang.Exception -> L59
            java.lang.String r2 = r4.versionName     // Catch: java.lang.Exception -> L59
            r1.f1008d = r2     // Catch: java.lang.Exception -> L59
            int r2 = r4.versionCode     // Catch: java.lang.Exception -> L59
            r1.f1009e = r2     // Catch: java.lang.Exception -> L59
            long r2 = cn.jiguang.commons.L.t.a(r4, r7)     // Catch: java.lang.Exception -> L59
            r1.f1015k = r2     // Catch: java.lang.Exception -> L59
            long r7 = cn.jiguang.commons.L.t.d(r4, r8)     // Catch: java.lang.Exception -> L59
            r1.l = r7     // Catch: java.lang.Exception -> L59
            java.lang.String r7 = cn.jiguang.commons.L.t.a(r4)     // Catch: java.lang.Exception -> L28
            r1.a = r7     // Catch: java.lang.Exception -> L28
            goto L2c
        L28:
            java.lang.String r7 = r4.packageName     // Catch: java.lang.Exception -> L59
            r1.a = r7     // Catch: java.lang.Exception -> L59
        L2c:
            int r7 = cn.jiguang.commons.L.t.c(r4, r9)     // Catch: java.lang.Exception -> L59
            r1.f1010f = r7     // Catch: java.lang.Exception -> L59
            java.lang.String[] r5 = cn.jiguang.commons.L.t.f(r4, r5)     // Catch: java.lang.Exception -> L59
            r1.m = r5     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = cn.jiguang.commons.L.t.e(r4, r6)     // Catch: java.lang.Exception -> L59
            r1.f1012h = r5     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = cn.jiguang.commons.L.t.g(r4, r6)     // Catch: java.lang.Exception -> L59
            r1.f1013i = r5     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = cn.jiguang.commons.L.t.h(r4, r6)     // Catch: java.lang.Exception -> L59
            r1.f1014j = r5     // Catch: java.lang.Exception -> L59
            java.lang.String[] r5 = cn.jiguang.commons.L.t.d(r4)     // Catch: java.lang.Exception -> L59
            r1.n = r5     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = r4.packageName     // Catch: java.lang.Exception -> L59
            int r5 = cn.jiguang.commons.L.t.c(r5, r10)     // Catch: java.lang.Exception -> L59
            r1.f1011g = r5     // Catch: java.lang.Exception -> L59
            return r1
        L59:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Error converting package info: "
            r6.append(r7)
            java.lang.String r4 = r4.packageName
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "AppUtils"
            cn.jiguang.commons.w.a.a(r6, r4, r5)
            return r0
    }

    private static cn.jiguang.commons.c.e a(java.lang.String r1, boolean r2, int r3) {
            if (r2 != 0) goto L7
            cn.jiguang.commons.c.e r1 = d(r1)
            return r1
        L7:
            r2 = 1
            r0 = 0
            android.content.pm.PackageInfo r2 = cn.jiguang.commons.L.t.a(r1, r0, r3, r2)     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L31
            cn.jiguang.commons.c.e r2 = a(r2, r0)     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L31
            return r2
        L16:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "create app info from pkg err:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppUtils"
            cn.jiguang.commons.w.a.c(r3, r2)
        L31:
            cn.jiguang.commons.c.e r1 = d(r1)
            return r1
    }

    private static cn.jiguang.commons.c.e a(org.json.JSONObject r7) {
            java.lang.String r0 = ""
            cn.jiguang.commons.c.e r1 = new cn.jiguang.commons.c.e     // Catch: java.lang.Exception -> L65
            r1.<init>()     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "name"
            java.lang.String r2 = r7.optString(r2, r0)     // Catch: java.lang.Exception -> L65
            r1.a = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "pkg"
            java.lang.String r2 = r7.optString(r2, r0)     // Catch: java.lang.Exception -> L65
            r1.f1007c = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "vn"
            java.lang.String r2 = r7.optString(r2, r0)     // Catch: java.lang.Exception -> L65
            r1.f1008d = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "vc"
            r3 = 0
            int r2 = r7.optInt(r2, r3)     // Catch: java.lang.Exception -> L65
            r1.f1009e = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "it"
            int r2 = r7.optInt(r2, r3)     // Catch: java.lang.Exception -> L65
            r1.f1010f = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "ts"
            int r2 = r7.optInt(r2, r3)     // Catch: java.lang.Exception -> L65
            r1.f1011g = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "fit"
            r3 = 0
            long r5 = r7.optLong(r2, r3)     // Catch: java.lang.Exception -> L65
            r1.f1015k = r5     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "lut"
            long r2 = r7.optLong(r2, r3)     // Catch: java.lang.Exception -> L65
            r1.l = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "sm"
            java.lang.String r2 = r7.optString(r2, r0)     // Catch: java.lang.Exception -> L65
            r1.f1012h = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "ss"
            java.lang.String r2 = r7.optString(r2, r0)     // Catch: java.lang.Exception -> L65
            r1.f1013i = r2     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = "sa"
            java.lang.String r7 = r7.optString(r2, r0)     // Catch: java.lang.Exception -> L65
            r1.f1014j = r7     // Catch: java.lang.Exception -> L65
            return r1
        L65:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parse app info from json failed: "
            r0.append(r1)
            java.lang.String r1 = r7.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AppUtils"
            cn.jiguang.commons.w.a.a(r1, r0, r7)
            r7 = 0
            return r7
    }

    private static java.lang.String a(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.equals(r2, r3)
            java.lang.String r1 = "1"
            if (r0 != 0) goto L10
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto Lf
            goto L10
        Lf:
            return r2
        L10:
            return r1
    }

    public static java.lang.String a(java.util.List r6) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L96
            r0.<init>()     // Catch: java.lang.Exception -> L96
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L96
        L9:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L91
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L96
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L9
            java.lang.String r2 = r1.f1007c     // Catch: java.lang.Exception -> L96
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L96
            if (r2 == 0) goto L20
            goto L9
        L20:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L96
            r2.<init>()     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.a     // Catch: java.lang.Exception -> L96
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "pkg"
            java.lang.String r4 = r1.f1007c     // Catch: java.lang.Exception -> L96
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "vn"
            java.lang.String r4 = r1.f1008d     // Catch: java.lang.Exception -> L96
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "vc"
            int r4 = r1.f1009e     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "it"
            int r4 = r1.f1010f     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "ts"
            int r4 = r1.f1011g     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "fit"
            long r4 = r1.f1015k     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "lut"
            long r4 = r1.l     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "sm"
            java.lang.String r4 = r1.f1012h     // Catch: java.lang.Exception -> L96
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "ss"
            java.lang.String r4 = r1.f1013i     // Catch: java.lang.Exception -> L96
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L96
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "sa"
            java.lang.String r1 = r1.f1014j     // Catch: java.lang.Exception -> L96
            java.lang.String r1 = g(r1)     // Catch: java.lang.Exception -> L96
            r2.put(r3, r1)     // Catch: java.lang.Exception -> L96
            r0.put(r2)     // Catch: java.lang.Exception -> L96
            goto L9
        L91:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Exception -> L96
            return r6
        L96:
            r6 = move-exception
            java.lang.String r0 = "AppUtils"
            java.lang.String r1 = "Error converting app list to JSON"
            cn.jiguang.commons.w.a.a(r0, r1, r6)
            r6 = 0
            return r6
    }

    public static java.util.List a() {
            java.util.List r0 = cn.jiguang.commons.L.c.f866h     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto Ld
            int r0 = r0.size()     // Catch: java.lang.Exception -> L1a
            if (r0 <= 0) goto Ld
            java.util.List r0 = cn.jiguang.commons.L.c.f866h     // Catch: java.lang.Exception -> L1a
            return r0
        Ld:
            java.lang.String r0 = cn.jiguang.commons.a.d.a.f956j     // Catch: java.lang.Exception -> L1a
            java.lang.String r0 = cn.jiguang.commons.L.m.j(r0)     // Catch: java.lang.Exception -> L1a
            java.util.List r0 = f(r0)     // Catch: java.lang.Exception -> L1a
            cn.jiguang.commons.L.c.f866h = r0     // Catch: java.lang.Exception -> L1a
            return r0
        L1a:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public static java.util.List a(int r3, boolean r4, boolean r5) {
            java.lang.String r0 = "AppUtils"
            java.util.List r1 = a(r4)     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L2b
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto Lf
            goto L2b
        Lf:
            java.util.List r4 = a(r1, r4)     // Catch: java.lang.Exception -> L1f
            if (r4 == 0) goto L21
            int r1 = r4.size()     // Catch: java.lang.Exception -> L1f
            if (r1 <= 0) goto L21
            c(r3, r4)     // Catch: java.lang.Exception -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L33
        L21:
            if (r5 == 0) goto L2a
            cn.jiguang.commons.d.c r5 = cn.jiguang.commons.d.c.a()     // Catch: java.lang.Exception -> L1f
            r5.a(r3, r4)     // Catch: java.lang.Exception -> L1f
        L2a:
            return r4
        L2b:
            java.lang.String r3 = "no apps found"
            cn.jiguang.commons.w.a.f(r0, r3)     // Catch: java.lang.Exception -> L1f
            java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> L1f
            return r3
        L33:
            java.lang.String r4 = "Error getting installed apps info"
            cn.jiguang.commons.w.a.a(r0, r4, r3)
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }

    public static java.util.List a(java.util.List r11, boolean r12) {
            java.lang.String r1 = "AppUtils"
            if (r11 == 0) goto L6b
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto Lb
            goto L6b
        Lb:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r11.size()
            r2.<init>(r0)
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            r3 = 1300(0x514, float:1.822E-42)
            boolean r5 = r0.a(r3, r12)
            r3 = 1038(0x40e, float:1.455E-42)
            boolean r6 = r0.a(r3, r12)
            r3 = 1034(0x40a, float:1.449E-42)
            boolean r7 = r0.a(r3, r12)
            r3 = 1039(0x40f, float:1.456E-42)
            boolean r8 = r0.a(r3, r12)
            r3 = 1033(0x409, float:1.448E-42)
            boolean r9 = r0.a(r3, r12)
            r3 = 1103(0x44f, float:1.546E-42)
            boolean r10 = r0.a(r3, r12)
            java.util.Map r12 = c()
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L61
        L44:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L64
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Exception -> L61
            r4 = r0
            android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4     // Catch: java.lang.Exception -> L61
            if (r4 != 0) goto L54
            goto L44
        L54:
            cn.jiguang.commons.c.e r0 = a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L44
            a(r0, r12)     // Catch: java.lang.Exception -> L61
            r2.add(r0)     // Catch: java.lang.Exception -> L61
            goto L44
        L61:
            r0 = move-exception
            r11 = r0
            goto L65
        L64:
            return r2
        L65:
            java.lang.String r12 = "Error converting package info list"
            cn.jiguang.commons.w.a.a(r1, r12, r11)
            return r2
        L6b:
            java.lang.String r11 = "PackageInfo list is null or empty"
            cn.jiguang.commons.w.a.f(r1, r11)
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            return r11
    }

    public static java.util.List a(boolean r2) {
            int r0 = cn.jiguang.commons.L.c.f863e     // Catch: java.lang.Exception -> Le
            int r1 = cn.jiguang.commons.L.c.f861c     // Catch: java.lang.Exception -> Le
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.util.List r2 = a(r2, r0)     // Catch: java.lang.Exception -> Le
            return r2
        Le:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get installed apps err:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "AppUtils"
            cn.jiguang.commons.w.a.c(r0, r2)
            r2 = 0
            return r2
    }

    private static java.util.List a(boolean r7, boolean r8) {
            if (r8 == 0) goto L10
            java.util.List r0 = c(r7)
            cn.jiguang.commons.E.e r1 = cn.jiguang.commons.E.e.c()
            int r2 = cn.jiguang.commons.E.e.f775c
        Lc:
            r1.a(r2)
            goto L1b
        L10:
            java.util.List r0 = d(r7)
            cn.jiguang.commons.E.e r1 = cn.jiguang.commons.E.e.c()
            int r2 = cn.jiguang.commons.E.e.a
            goto Lc
        L1b:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L2f
            if (r8 == 0) goto L2e
            int r3 = r0.size()
            if (r3 != r1) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "first try:"
            r3.append(r4)
            java.lang.String r4 = "cmd"
            java.lang.String r5 = "api"
            if (r8 == 0) goto L41
            r6 = r5
            goto L42
        L41:
            r6 = r4
        L42:
            r3.append(r6)
            java.lang.String r6 = ", apps:"
            r3.append(r6)
            if (r0 == 0) goto L51
            int r6 = r0.size()
            goto L52
        L51:
            r6 = 0
        L52:
            r3.append(r6)
            java.lang.String r6 = ", needFallback:"
            r3.append(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "AppUtils"
            cn.jiguang.commons.w.a.a(r6, r3)
            if (r1 == 0) goto La3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r8 == 0) goto L71
            r1 = r5
            goto L72
        L71:
            r1 = r4
        L72:
            r0.append(r1)
            java.lang.String r1 = " failed, try "
            r0.append(r1)
            if (r8 == 0) goto L7d
            goto L7e
        L7d:
            r4 = r5
        L7e:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.f(r6, r0)
            if (r8 == 0) goto L98
            java.util.List r0 = d(r7)
            cn.jiguang.commons.E.e r7 = cn.jiguang.commons.E.e.c()
            int r8 = cn.jiguang.commons.E.e.a
        L94:
            r7.a(r8)
            goto La3
        L98:
            java.util.List r0 = c(r7)
            cn.jiguang.commons.E.e r7 = cn.jiguang.commons.E.e.c()
            int r8 = cn.jiguang.commons.E.e.f775c
            goto L94
        La3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "final result:"
            r7.append(r8)
            if (r0 == 0) goto Lb3
            int r2 = r0.size()
        Lb3:
            r7.append(r2)
            java.lang.String r8 = " apps"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.jiguang.commons.w.a.a(r6, r7)
            return r0
    }

    private static void a(int r4, java.util.List r5) {
            java.lang.String r5 = ",size="
            java.lang.String r0 = "AppUtils"
            java.lang.String r1 = e(r4)     // Catch: java.lang.Exception -> L4f
            java.util.List r1 = e(r1)     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L64
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L4f
            if (r2 != 0) goto L64
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r3 = "bk c :key="
            r2.append(r3)     // Catch: java.lang.Exception -> L4f
            r2.append(r4)     // Catch: java.lang.Exception -> L4f
            r2.append(r5)     // Catch: java.lang.Exception -> L4f
            int r3 = r1.size()     // Catch: java.lang.Exception -> L4f
            r2.append(r3)     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L4f
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L4f
            cn.jiguang.commons.L.c.f866h = r1     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = a(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r3 = "bk json data size:key="
            r2.append(r3)     // Catch: java.lang.Exception -> L4f
            r2.append(r4)     // Catch: java.lang.Exception -> L4f
            r2.append(r5)     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L51
            int r5 = r1.length()     // Catch: java.lang.Exception -> L4f
            goto L52
        L4f:
            r5 = move-exception
            goto L79
        L51:
            r5 = 0
        L52:
            r2.append(r5)     // Catch: java.lang.Exception -> L4f
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L4f
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Exception -> L4f
            java.lang.String r5 = d(r4)     // Catch: java.lang.Exception -> L4f
            cn.jiguang.commons.L.m.c(r5, r1)     // Catch: java.lang.Exception -> L4f
            return
        L64:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r5.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = "no old cache, sk bk:key="
            r5.append(r1)     // Catch: java.lang.Exception -> L4f
            r5.append(r4)     // Catch: java.lang.Exception -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4f
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Exception -> L4f
            return
        L79:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "backup err:key="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ","
            r1.append(r4)
            java.lang.String r4 = r5.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r4, r5)
            return
    }

    private static void a(cn.jiguang.commons.c.e r2, java.util.Map r3) {
            if (r2 == 0) goto L50
            java.lang.String r0 = r2.f1007c     // Catch: java.lang.Exception -> L35
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto Lb
            goto L50
        Lb:
            java.lang.String r0 = r2.f1007c     // Catch: java.lang.Exception -> L35
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L35
            cn.jiguang.commons.c.e r3 = (cn.jiguang.commons.c.e) r3     // Catch: java.lang.Exception -> L35
            if (r3 != 0) goto L16
            goto L50
        L16:
            java.lang.String r0 = r2.f1012h     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r3.f1012h     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = a(r0, r1)     // Catch: java.lang.Exception -> L35
            r2.f1012h = r0     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r2.f1013i     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r3.f1013i     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = a(r0, r1)     // Catch: java.lang.Exception -> L35
            r2.f1013i = r0     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r2.f1014j     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = r3.f1014j     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = a(r0, r3)     // Catch: java.lang.Exception -> L35
            r2.f1014j = r3     // Catch: java.lang.Exception -> L35
            return
        L35:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "process sign cmp failed:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppUtils"
            cn.jiguang.commons.w.a.c(r3, r2)
        L50:
            return
    }

    public static void a(java.lang.String r4) {
            java.lang.String r0 = "AppUtils"
            r1 = 0
            cn.jiguang.commons.L.c.f864f = r1     // Catch: java.lang.Exception -> L23
            cn.jiguang.commons.L.c.f865g = r1     // Catch: java.lang.Exception -> L23
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L23
            r1.a(r4)     // Catch: java.lang.Exception -> L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r1.<init>()     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "cache cleared:key="
            r1.append(r2)     // Catch: java.lang.Exception -> L23
            r1.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L23
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L23
            return
        L23:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "clear cache err:key="
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = ","
            r2.append(r4)
            java.lang.String r4 = r1.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r4, r1)
            return
    }

    public static cn.jiguang.commons.c.e c(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L8
            r4 = 0
            return r4
        L8:
            cn.jiguang.commons.c.e r0 = new cn.jiguang.commons.c.e
            r0.<init>()
            r0.f1007c = r4
            java.lang.String r4 = ""
            r0.a = r4
            r0.f1008d = r4
            r1 = 0
            r0.f1009e = r1
            r0.f1010f = r1
            r0.f1011g = r1
            long r2 = java.lang.System.currentTimeMillis()
            r0.f1015k = r2
            r0.l = r2
            r0.f1012h = r4
            r0.f1013i = r4
            r0.f1014j = r4
            java.lang.String[] r4 = new java.lang.String[r1]
            r0.m = r4
            java.lang.String[] r4 = new java.lang.String[r1]
            r0.n = r4
            return r0
    }

    private static java.lang.String c(java.util.List r6) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L8a
            r0.<init>()     // Catch: java.lang.Exception -> L8a
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L8a
        L9:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L8a
            if (r1 == 0) goto L85
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L8a
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1     // Catch: java.lang.Exception -> L8a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8a
            r2.<init>()     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "pkg"
            java.lang.String r4 = r1.f1007c     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.a     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "vn"
            java.lang.String r4 = r1.f1008d     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "vc"
            int r4 = r1.f1009e     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "it"
            int r4 = r1.f1010f     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "ts"
            int r4 = r1.f1011g     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "fit"
            long r4 = r1.f1015k     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "lut"
            long r4 = r1.l     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "sm"
            java.lang.String r4 = r1.f1012h     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "ss"
            java.lang.String r4 = r1.f1013i     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = "sa"
            java.lang.String r1 = r1.f1014j     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = g(r1)     // Catch: java.lang.Exception -> L8a
            r2.put(r3, r1)     // Catch: java.lang.Exception -> L8a
            r0.put(r2)     // Catch: java.lang.Exception -> L8a
            goto L9
        L85:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Exception -> L8a
            return r6
        L8a:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "convert basic json failed: "
            r0.append(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AppUtils"
            cn.jiguang.commons.w.a.a(r1, r0, r6)
            java.lang.String r6 = "[]"
            return r6
    }

    public static java.util.List c(int r1) {
            r0 = 1100(0x44c, float:1.541E-42)
            if (r0 != r1) goto L1b
            java.util.List r1 = cn.jiguang.commons.L.c.f864f
            if (r1 == 0) goto L10
            java.util.List r1 = cn.jiguang.commons.L.c.f864f
            int r1 = r1.size()
            if (r1 > 0) goto L18
        L10:
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f954h
            java.util.List r1 = e(r1)
            cn.jiguang.commons.L.c.f864f = r1
        L18:
            java.util.List r1 = cn.jiguang.commons.L.c.f864f
            return r1
        L1b:
            r0 = 1110(0x456, float:1.555E-42)
            if (r0 != r1) goto L36
            java.util.List r1 = cn.jiguang.commons.L.c.f865g
            if (r1 == 0) goto L2b
            java.util.List r1 = cn.jiguang.commons.L.c.f865g
            int r1 = r1.size()
            if (r1 > 0) goto L33
        L2b:
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f957k
            java.util.List r1 = e(r1)
            cn.jiguang.commons.L.c.f865g = r1
        L33:
            java.util.List r1 = cn.jiguang.commons.L.c.f865g
            return r1
        L36:
            r1 = 0
            return r1
    }

    private static java.util.List c(boolean r10) {
            java.lang.String r0 = "AppUtils"
            r1 = 0
            cn.jiguang.commons.g.l r2 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Throwable -> L15
            r3 = 1108(0x454, float:1.553E-42)
            boolean r2 = r2.a(r3, r10)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            java.lang.String r10 = "App list API collection is disabled by user or server config"
            cn.jiguang.commons.w.a.f(r0, r10)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r10 = move-exception
            goto L6d
        L17:
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L15
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L15
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> L15
            byte[] r4 = cn.jiguang.commons.L.c.a     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = cn.jiguang.commons.L.n.c(r4)     // Catch: java.lang.Throwable -> L15
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L15
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L15
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r6)     // Catch: java.lang.Throwable -> L15
            int r10 = cn.jiguang.commons.L.t.a(r10)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L15
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L15
            r4[r8] = r10     // Catch: java.lang.Throwable -> L15
            java.lang.Object r10 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L15
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L15
            if (r10 == 0) goto L5f
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L5f
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L5a
            r2 = 3025(0xbd1, float:4.239E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            goto L69
        L5a:
            r1 = move-exception
            r9 = r1
            r1 = r10
            r10 = r9
            goto L6d
        L5f:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L5a
            r2 = 3027(0xbd3, float:4.242E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
        L69:
            r1.d(r2)     // Catch: java.lang.Throwable -> L5a
            return r10
        L6d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getInstalledAppsFromApi failed: "
            r2.append(r3)
            java.lang.String r10 = r10.getMessage()
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r10)
            cn.jiguang.commons.A.a r10 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.d(r0)
            return r1
    }

    private static java.util.Map c() {
            java.lang.String r0 = "AppUtils"
            r1 = 1100(0x44c, float:1.541E-42)
            java.util.List r1 = c(r1)     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L5e
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r2 == 0) goto L11
            goto L5e
        L11:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L3e
            int r3 = r1.size()     // Catch: java.lang.Exception -> L3e
            int r3 = a(r3)     // Catch: java.lang.Exception -> L3e
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L3e
        L22:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L40
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L3e
            cn.jiguang.commons.c.e r3 = (cn.jiguang.commons.c.e) r3     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L22
            java.lang.String r4 = r3.f1007c     // Catch: java.lang.Exception -> L3e
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L3e
            if (r4 != 0) goto L22
            java.lang.String r4 = r3.f1007c     // Catch: java.lang.Exception -> L3e
            r2.put(r4, r3)     // Catch: java.lang.Exception -> L3e
            goto L22
        L3e:
            r1 = move-exception
            goto L66
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "loaded cached app map: "
            r1.append(r3)     // Catch: java.lang.Exception -> L3e
            int r3 = r2.size()     // Catch: java.lang.Exception -> L3e
            r1.append(r3)     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = " apps"
            r1.append(r3)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L3e
            return r2
        L5e:
            java.lang.String r1 = "no cached app list for signature comparison"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L3e
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Exception -> L3e
            return r0
        L66:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load cached app map failed: "
            r2.append(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r2, r1)
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
    }

    private static void c(int r3, java.util.List r4) {
            java.lang.String r0 = "AppUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b
            r1.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = "save app list files only start, configId="
            r1.append(r2)     // Catch: java.lang.Exception -> L1b
            r1.append(r3)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = ", size="
            r1.append(r2)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto L1d
            int r2 = r4.size()     // Catch: java.lang.Exception -> L1b
            goto L1e
        L1b:
            r4 = move-exception
            goto L4c
        L1d:
            r2 = 0
        L1e:
            r1.append(r2)     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L1b
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L1b
            a(r3, r4)     // Catch: java.lang.Exception -> L1b
            boolean r4 = d(r3, r4)     // Catch: java.lang.Exception -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b
            r1.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = "save app list files only end, configId="
            r1.append(r2)     // Catch: java.lang.Exception -> L1b
            r1.append(r3)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = ", success="
            r1.append(r2)     // Catch: java.lang.Exception -> L1b
            r1.append(r4)     // Catch: java.lang.Exception -> L1b
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L1b
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L1b
            return
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "save app list files only failed:key="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ","
            r1.append(r3)
            java.lang.String r3 = r4.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r3, r4)
            return
    }

    private static cn.jiguang.commons.c.e d(java.lang.String r1) {
            cn.jiguang.commons.c.e r0 = new cn.jiguang.commons.c.e
            r0.<init>()
            r0.f1007c = r1
            return r0
    }

    private static java.lang.String d(int r1) {
            r0 = 1110(0x456, float:1.555E-42)
            if (r0 != r1) goto L7
            java.lang.String r1 = cn.jiguang.commons.a.d.a.m
            return r1
        L7:
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f956j
            return r1
    }

    private static java.lang.String d(java.util.List r8) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L53
            r0.<init>()     // Catch: java.lang.Exception -> L53
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L53
        L9:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L53
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L53
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1     // Catch: java.lang.Exception -> L53
            java.lang.String[] r2 = r1.n     // Catch: java.lang.Exception -> L53
            if (r2 == 0) goto L9
            int r2 = r2.length     // Catch: java.lang.Exception -> L53
            if (r2 <= 0) goto L9
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L53
            r2.<init>()     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "pkg"
            java.lang.String r4 = r1.f1007c     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = g(r4)     // Catch: java.lang.Exception -> L53
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L53
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L53
            r3.<init>()     // Catch: java.lang.Exception -> L53
            java.lang.String[] r1 = r1.n     // Catch: java.lang.Exception -> L53
            int r4 = r1.length     // Catch: java.lang.Exception -> L53
            r5 = 0
        L35:
            if (r5 >= r4) goto L45
            r6 = r1[r5]     // Catch: java.lang.Exception -> L53
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L53
            if (r7 != 0) goto L42
            r3.put(r6)     // Catch: java.lang.Exception -> L53
        L42:
            int r5 = r5 + 1
            goto L35
        L45:
            java.lang.String r1 = "svcs"
            r2.put(r1, r3)     // Catch: java.lang.Exception -> L53
            r0.put(r2)     // Catch: java.lang.Exception -> L53
            goto L9
        L4e:
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L53
            return r8
        L53:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "convert service json failed: "
            r0.append(r1)
            java.lang.String r1 = r8.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AppUtils"
            cn.jiguang.commons.w.a.a(r1, r0, r8)
            java.lang.String r8 = "[]"
            return r8
    }

    public static java.util.List d() {
            java.util.List r0 = cn.jiguang.commons.L.c.f867i
            if (r0 == 0) goto Ld
            int r0 = r0.size()
            if (r0 <= 0) goto Ld
            java.util.List r0 = cn.jiguang.commons.L.c.f867i
            return r0
        Ld:
            java.util.List r0 = e()
            cn.jiguang.commons.L.c.f867i = r0
            return r0
    }

    private static java.util.List d(boolean r9) {
            r0 = 3028(0xbd4, float:4.243E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "AppUtils"
            r2 = 0
            cn.jiguang.commons.g.l r3 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1b
            r4 = 1109(0x455, float:1.554E-42)
            boolean r3 = r3.a(r4, r9)     // Catch: java.lang.Exception -> L1b
            if (r3 != 0) goto L1e
            java.lang.String r9 = "App list CMD collection is disabled by user or server config"
            cn.jiguang.commons.w.a.f(r1, r9)     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            r9 = move-exception
            goto La6
        L1e:
            java.util.List r3 = cn.jiguang.commons.L.aa.a()     // Catch: java.lang.Exception -> L1b
            if (r3 == 0) goto L9e
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto L2c
            goto L9e
        L2c:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1b
            r4.<init>()     // Catch: java.lang.Exception -> L1b
            cn.jiguang.commons.g.l r5 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1b
            r6 = 1105(0x451, float:1.548E-42)
            boolean r5 = r5.a(r6, r9)     // Catch: java.lang.Exception -> L1b
            if (r5 == 0) goto L57
            int r6 = cn.jiguang.commons.L.t.a(r9)     // Catch: java.lang.Throwable -> L42
            goto L58
        L42:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b
            r7.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r8 = "throwable="
            r7.append(r8)     // Catch: java.lang.Exception -> L1b
            r7.append(r6)     // Catch: java.lang.Exception -> L1b
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> L1b
            cn.jiguang.commons.w.a.c(r1, r6)     // Catch: java.lang.Exception -> L1b
        L57:
            r6 = 0
        L58:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L1b
        L5c:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Exception -> L1b
            if (r7 == 0) goto L85
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Exception -> L1b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L1b
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L1b
            if (r8 == 0) goto L6f
            goto L5c
        L6f:
            if (r5 == 0) goto L77
            r8 = 1
            android.content.pm.PackageInfo r8 = cn.jiguang.commons.L.t.a(r7, r9, r6, r8)     // Catch: java.lang.Exception -> L1b
            goto L78
        L77:
            r8 = r2
        L78:
            if (r8 != 0) goto L81
            android.content.pm.PackageInfo r8 = new android.content.pm.PackageInfo     // Catch: java.lang.Exception -> L1b
            r8.<init>()     // Catch: java.lang.Exception -> L1b
            r8.packageName = r7     // Catch: java.lang.Exception -> L1b
        L81:
            r4.add(r8)     // Catch: java.lang.Exception -> L1b
            goto L5c
        L85:
            boolean r9 = r4.isEmpty()     // Catch: java.lang.Exception -> L1b
            if (r9 != 0) goto L96
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1b
            r0 = 3026(0xbd2, float:4.24E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L1b
            goto L9a
        L96:
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1b
        L9a:
            r9.d(r0)     // Catch: java.lang.Exception -> L1b
            return r4
        L9e:
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> L1b
            r9.d(r0)     // Catch: java.lang.Exception -> L1b
            return r2
        La6:
            java.lang.String r0 = "Error getting installed apps from shell"
            cn.jiguang.commons.w.a.a(r1, r0, r9)
            cn.jiguang.commons.A.a r9 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.d(r0)
            return r2
    }

    private static boolean d(int r6, java.util.List r7) {
            java.lang.String r0 = "AppUtils"
            r1 = 0
            java.lang.String r2 = c(r7)     // Catch: java.lang.Exception -> L24
            java.lang.String r3 = d(r7)     // Catch: java.lang.Exception -> L24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L24
            r4.<init>()     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = "save key="
            r4.append(r5)     // Catch: java.lang.Exception -> L24
            r4.append(r6)     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = ",basicSize="
            r4.append(r5)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L27
            int r5 = r2.length()     // Catch: java.lang.Exception -> L24
            goto L28
        L24:
            r7 = move-exception
            goto Lbc
        L27:
            r5 = 0
        L28:
            r4.append(r5)     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = ",serviceSize="
            r4.append(r5)     // Catch: java.lang.Exception -> L24
            if (r3 == 0) goto L37
            int r5 = r3.length()     // Catch: java.lang.Exception -> L24
            goto L38
        L37:
            r5 = 0
        L38:
            r4.append(r5)     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L24
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L24
            e(r6, r7)     // Catch: java.lang.Exception -> L24
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L24
            r7.<init>()     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = "me ca up, configId="
            r7.append(r4)     // Catch: java.lang.Exception -> L24
            r7.append(r6)     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = ", s="
            r7.append(r4)     // Catch: java.lang.Exception -> L24
            r4 = 1100(0x44c, float:1.541E-42)
            if (r4 != r6) goto L62
            java.util.List r4 = cn.jiguang.commons.L.c.f864f     // Catch: java.lang.Exception -> L24
            if (r4 == 0) goto L6d
            java.util.List r4 = cn.jiguang.commons.L.c.f864f     // Catch: java.lang.Exception -> L24
            goto L68
        L62:
            java.util.List r4 = cn.jiguang.commons.L.c.f865g     // Catch: java.lang.Exception -> L24
            if (r4 == 0) goto L6d
            java.util.List r4 = cn.jiguang.commons.L.c.f865g     // Catch: java.lang.Exception -> L24
        L68:
            int r4 = r4.size()     // Catch: java.lang.Exception -> L24
            goto L6e
        L6d:
            r4 = 0
        L6e:
            r7.append(r4)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L24
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = e(r6)     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = f(r6)     // Catch: java.lang.Exception -> L24
            boolean r7 = cn.jiguang.commons.L.m.c(r7, r2)     // Catch: java.lang.Exception -> L24
            boolean r2 = cn.jiguang.commons.L.m.c(r4, r3)     // Catch: java.lang.Exception -> L24
            if (r7 == 0) goto L8e
            if (r2 == 0) goto L8e
            r3 = 1
            goto L8f
        L8e:
            r3 = 0
        L8f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L24
            r4.<init>()     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = "save c al, configId="
            r4.append(r5)     // Catch: java.lang.Exception -> L24
            r4.append(r6)     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = ", bs="
            r4.append(r5)     // Catch: java.lang.Exception -> L24
            r4.append(r7)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = ", ss="
            r4.append(r7)     // Catch: java.lang.Exception -> L24
            r4.append(r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = ", als="
            r4.append(r7)     // Catch: java.lang.Exception -> L24
            r4.append(r3)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Exception -> L24
            cn.jiguang.commons.w.a.a(r0, r7)     // Catch: java.lang.Exception -> L24
            return r3
        Lbc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "save failed:key="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ","
            r2.append(r6)
            java.lang.String r6 = r7.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r6, r7)
            return r1
    }

    private static java.lang.String e(int r1) {
            r0 = 1110(0x456, float:1.555E-42)
            if (r0 != r1) goto L7
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f957k
            return r1
        L7:
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f954h
            return r1
    }

    public static java.util.List e() {
            java.lang.String r0 = "AppUtils"
            java.lang.String r1 = ""
            java.lang.String r2 = cn.jiguang.commons.a.d.a.f955i     // Catch: java.lang.Exception -> L13
            java.lang.String r2 = cn.jiguang.commons.L.m.j(r2)     // Catch: java.lang.Exception -> L13
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L15
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> L13
            return r0
        L13:
            r1 = move-exception
            goto L82
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L13
            r3.<init>()     // Catch: java.lang.Exception -> L13
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L13
            r4.<init>(r2)     // Catch: java.lang.Exception -> L13
            r2 = 0
            r5 = 0
        L21:
            int r6 = r4.length()     // Catch: java.lang.Exception -> L13
            if (r5 >= r6) goto L64
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch: java.lang.Exception -> L13
            cn.jiguang.commons.c.e r7 = new cn.jiguang.commons.c.e     // Catch: java.lang.Exception -> L13
            r7.<init>()     // Catch: java.lang.Exception -> L13
            java.lang.String r8 = "pkg"
            java.lang.String r8 = r6.optString(r8, r1)     // Catch: java.lang.Exception -> L13
            r7.f1007c = r8     // Catch: java.lang.Exception -> L13
            java.lang.String r8 = "svcs"
            org.json.JSONArray r6 = r6.optJSONArray(r8)     // Catch: java.lang.Exception -> L13
            if (r6 == 0) goto L5e
            int r8 = r6.length()     // Catch: java.lang.Exception -> L13
            if (r8 <= 0) goto L5e
            int r8 = r6.length()     // Catch: java.lang.Exception -> L13
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch: java.lang.Exception -> L13
            r9 = 0
        L4d:
            int r10 = r6.length()     // Catch: java.lang.Exception -> L13
            if (r9 >= r10) goto L5c
            java.lang.String r10 = r6.optString(r9, r1)     // Catch: java.lang.Exception -> L13
            r8[r9] = r10     // Catch: java.lang.Exception -> L13
            int r9 = r9 + 1
            goto L4d
        L5c:
            r7.n = r8     // Catch: java.lang.Exception -> L13
        L5e:
            r3.add(r7)     // Catch: java.lang.Exception -> L13
            int r5 = r5 + 1
            goto L21
        L64:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13
            r1.<init>()     // Catch: java.lang.Exception -> L13
            java.lang.String r2 = "service info loaded: "
            r1.append(r2)     // Catch: java.lang.Exception -> L13
            int r2 = r3.size()     // Catch: java.lang.Exception -> L13
            r1.append(r2)     // Catch: java.lang.Exception -> L13
            java.lang.String r2 = " apps"
            r1.append(r2)     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L13
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L13
            return r3
        L82:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load service info failed: "
            r2.append(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r0, r2, r1)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    private static java.util.List e(java.lang.String r11) {
            java.lang.String r0 = ""
            java.lang.String r11 = cn.jiguang.commons.L.m.j(r11)     // Catch: java.lang.Exception -> L8d
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L8d
            if (r1 == 0) goto Lf
            java.util.List r11 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> L8d
            return r11
        Lf:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8d
            r1.<init>()     // Catch: java.lang.Exception -> L8d
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L8d
            r2.<init>(r11)     // Catch: java.lang.Exception -> L8d
            r11 = 0
            r3 = 0
        L1b:
            int r4 = r2.length()     // Catch: java.lang.Exception -> L8d
            if (r3 >= r4) goto L8c
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch: java.lang.Exception -> L8d
            cn.jiguang.commons.c.e r5 = new cn.jiguang.commons.c.e     // Catch: java.lang.Exception -> L8d
            r5.<init>()     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "pkg"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L8d
            r5.f1007c = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "name"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L8d
            r5.a = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "vn"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L8d
            r5.f1008d = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "vc"
            int r6 = r4.optInt(r6, r11)     // Catch: java.lang.Exception -> L8d
            r5.f1009e = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "it"
            int r6 = r4.optInt(r6, r11)     // Catch: java.lang.Exception -> L8d
            r5.f1010f = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "ts"
            int r6 = r4.optInt(r6, r11)     // Catch: java.lang.Exception -> L8d
            r5.f1011g = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "fit"
            r7 = 0
            long r9 = r4.optLong(r6, r7)     // Catch: java.lang.Exception -> L8d
            r5.f1015k = r9     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "lut"
            long r6 = r4.optLong(r6, r7)     // Catch: java.lang.Exception -> L8d
            r5.l = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "sm"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L8d
            r5.f1012h = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "ss"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L8d
            r5.f1013i = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "sa"
            java.lang.String r4 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L8d
            r5.f1014j = r4     // Catch: java.lang.Exception -> L8d
            r1.add(r5)     // Catch: java.lang.Exception -> L8d
            int r3 = r3 + 1
            goto L1b
        L8c:
            return r1
        L8d:
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            return r11
    }

    public static java.util.List e(boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = cn.jiguang.commons.L.u.j()     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "AppUtils"
            if (r1 == 0) goto L6f
            java.lang.String r1 = cn.jiguang.commons.L.m.a()     // Catch: java.lang.Exception -> L5d
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L5d
            if (r3 == 0) goto L18
            goto L7f
        L18:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L5d
            r3.<init>(r1)     // Catch: java.lang.Exception -> L5d
            boolean r1 = r3.exists()     // Catch: java.lang.Exception -> L5d
            if (r1 == 0) goto L7f
            boolean r1 = r3.isDirectory()     // Catch: java.lang.Exception -> L5d
            if (r1 != 0) goto L2a
            goto L7f
        L2a:
            java.io.FilenameFilter r1 = cn.jiguang.commons.L.c.f868j     // Catch: java.lang.Exception -> L5d
            java.lang.String[] r1 = r3.list(r1)     // Catch: java.lang.Exception -> L5d
            if (r1 == 0) goto L74
            int r3 = r1.length     // Catch: java.lang.Exception -> L5d
            if (r3 <= 0) goto L74
            cn.jiguang.commons.g.l r3 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L5d
            r4 = 1105(0x451, float:1.548E-42)
            boolean r3 = r3.a(r4, r7)     // Catch: java.lang.Exception -> L5d
            r4 = 0
            if (r3 == 0) goto L5f
            int r7 = cn.jiguang.commons.L.t.a(r7)     // Catch: java.lang.Throwable -> L47
            goto L60
        L47:
            r7 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d
            r5.<init>()     // Catch: java.lang.Exception -> L5d
            java.lang.String r6 = "throwable="
            r5.append(r6)     // Catch: java.lang.Exception -> L5d
            r5.append(r7)     // Catch: java.lang.Exception -> L5d
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Exception -> L5d
            cn.jiguang.commons.w.a.c(r2, r7)     // Catch: java.lang.Exception -> L5d
            goto L5f
        L5d:
            goto L74
        L5f:
            r7 = 0
        L60:
            int r2 = r1.length     // Catch: java.lang.Exception -> L5d
        L61:
            if (r4 >= r2) goto L74
            r5 = r1[r4]     // Catch: java.lang.Exception -> L5d
            cn.jiguang.commons.c.e r5 = a(r5, r3, r7)     // Catch: java.lang.Exception -> L5d
            r0.add(r5)     // Catch: java.lang.Exception -> L5d
            int r4 = r4 + 1
            goto L61
        L6f:
            java.lang.String r7 = "No permission to read external storage"
            cn.jiguang.commons.w.a.f(r2, r7)     // Catch: java.lang.Exception -> L5d
        L74:
            int r7 = r0.size()
            if (r7 <= 0) goto L7f
            r7 = 1110(0x456, float:1.555E-42)
            c(r7, r0)
        L7f:
            return r0
    }

    public static java.util.Map e(java.util.List r3) {
            if (r3 == 0) goto L37
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L37
        L9:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r3.size()
            int r1 = a(r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            cn.jiguang.commons.c.e r1 = (cn.jiguang.commons.c.e) r1
            if (r1 == 0) goto L1a
            java.lang.String r2 = r1.f1007c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r1.f1007c
            r0.put(r2, r1)
            goto L1a
        L36:
            return r0
        L37:
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            return r3
    }

    private static void e(int r1, java.util.List r2) {
            r0 = 1110(0x456, float:1.555E-42)
            if (r0 != r1) goto L7
            cn.jiguang.commons.L.c.f865g = r2
            return
        L7:
            cn.jiguang.commons.L.c.f864f = r2
            return
    }

    private static java.lang.String f(int r1) {
            r0 = 1110(0x456, float:1.555E-42)
            if (r0 != r1) goto L7
            java.lang.String r1 = cn.jiguang.commons.a.d.a.l
            return r1
        L7:
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f955i
            return r1
    }

    public static java.util.List f(java.lang.String r6) {
            java.lang.String r0 = "AppUtils"
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lb
            if (r1 == 0) goto Ld
            java.util.List r6 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> Lb
            return r6
        Lb:
            r6 = move-exception
            goto L72
        Ld:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lb
            r1.<init>(r6)     // Catch: java.lang.Exception -> Lb
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb
            int r2 = r1.length()     // Catch: java.lang.Exception -> Lb
            r6.<init>(r2)     // Catch: java.lang.Exception -> Lb
            r2 = 0
        L1c:
            int r3 = r1.length()     // Catch: java.lang.Exception -> Lb
            if (r2 >= r3) goto L54
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.c.e r3 = a(r3)     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L51
            r6.add(r3)     // Catch: java.lang.Exception -> L30
            goto L51
        L30:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb
            r4.<init>()     // Catch: java.lang.Exception -> Lb
            java.lang.String r5 = "parse app info failed at index "
            r4.append(r5)     // Catch: java.lang.Exception -> Lb
            r4.append(r2)     // Catch: java.lang.Exception -> Lb
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch: java.lang.Exception -> Lb
            java.lang.String r5 = r3.getMessage()     // Catch: java.lang.Exception -> Lb
            r4.append(r5)     // Catch: java.lang.Exception -> Lb
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lb
            cn.jiguang.commons.w.a.a(r0, r4, r3)     // Catch: java.lang.Exception -> Lb
        L51:
            int r2 = r2 + 1
            goto L1c
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb
            r1.<init>()     // Catch: java.lang.Exception -> Lb
            java.lang.String r2 = "parsed app list: "
            r1.append(r2)     // Catch: java.lang.Exception -> Lb
            int r2 = r6.size()     // Catch: java.lang.Exception -> Lb
            r1.append(r2)     // Catch: java.lang.Exception -> Lb
            java.lang.String r2 = " items"
            r1.append(r2)     // Catch: java.lang.Exception -> Lb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lb
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> Lb
            return r6
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "json parse failed: "
            r1.append(r2)
            java.lang.String r2 = r6.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r1, r6)
            java.util.List r6 = a()
            return r6
    }

    private static java.lang.String g(java.lang.String r0) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.String r0 = ""
            return r0
    }
}
