package cn.jiguang.commons.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static final java.lang.String a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f1088c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f1089d;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f1090e;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f1091f;

    /* renamed from: g, reason: collision with root package name */
    private static long f1092g;

    /* renamed from: h, reason: collision with root package name */
    private static long f1093h;

    /* renamed from: i, reason: collision with root package name */
    private static long f1094i;

    /* renamed from: j, reason: collision with root package name */
    private static long f1095j;

    /* renamed from: k, reason: collision with root package name */
    private static final cn.jiguang.commons.f.d.c f1096k = null;
    private static final java.util.LinkedList l = null;

    class a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.f.d a;

        a(cn.jiguang.commons.f.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
                cn.jiguang.commons.f.d$c r1 = cn.jiguang.commons.f.d.c()
                r2 = 3000(0xbb8, double:1.482E-320)
                r0.a(r1, r2)
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.f.d a = null;

        static {
                cn.jiguang.commons.f.d r0 = new cn.jiguang.commons.f.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.f.d.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.f.d a() {
                cn.jiguang.commons.f.d r0 = cn.jiguang.commons.f.d.b.a
                return r0
        }
    }

    public static class c implements java.lang.Runnable {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        private void a(org.json.JSONObject r5) {
                r4 = this;
                java.lang.String r0 = "af"
                java.lang.String r1 = ""
                java.lang.String r0 = r5.optString(r0, r1)
                java.lang.String r2 = "sign"
                java.lang.String r1 = r5.optString(r2, r1)
                cn.jiguang.commons.f.d.c(r1)
                java.lang.String r1 = "al_idx"
                r2 = 0
                int r1 = r5.optInt(r1, r2)
                cn.jiguang.commons.f.d.c(r1)
                java.lang.String r1 = "req_gap"
                r2 = 43200(0xa8c0, double:2.13436E-319)
                long r1 = r5.optLong(r1, r2)
                cn.jiguang.commons.f.d.d(r1)
                java.lang.String r1 = "t_interval"
                r2 = 172800(0x2a300, double:8.53745E-319)
                long r1 = r5.optLong(r1, r2)
                cn.jiguang.commons.f.d.a(r1)
                cn.jiguang.commons.f.d.a()
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5b
                java.lang.String r5 = "null"
                boolean r5 = r5.equalsIgnoreCase(r0)
                if (r5 != 0) goto L5b
                java.lang.String r5 = cn.jiguang.commons.a.d.c.f959d
                java.lang.String r5 = cn.jiguang.commons.L.z.c(r0, r5)
                int r0 = cn.jiguang.commons.f.d.f()
                java.lang.String r0 = cn.jiguang.commons.f.d.a(r0)
                java.lang.String r1 = "al"
                cn.jiguang.commons.L.m.a(r0, r1, r5)
                r5 = 1
                cn.jiguang.commons.f.d.a(r1, r5)
            L5b:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                boolean r0 = cn.jiguang.commons.f.d.d()     // Catch: java.lang.Throwable -> L2c
                java.lang.String r1 = "ActiveConfigManager"
                if (r0 != 0) goto Le
                java.lang.String r0 = "Cannot request config"
                cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L2c
                return
            Le:
                java.lang.String r0 = cn.jiguang.commons.f.d.e()     // Catch: java.lang.Throwable -> L2c
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
                cn.jiguang.commons.f.d.c(r2)     // Catch: java.lang.Throwable -> L2c
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2c
                if (r2 == 0) goto L20
                goto L2c
            L20:
                cn.jiguang.commons.y.a.c(r1)     // Catch: java.lang.Throwable -> L2c
                org.json.JSONObject r0 = cn.jiguang.commons.f.d.a(r0)     // Catch: java.lang.Throwable -> L2c
                if (r0 == 0) goto L2c
                r4.a(r0)     // Catch: java.lang.Throwable -> L2c
            L2c:
                return
        }
    }

    static {
            r0 = 35
            byte[] r0 = new byte[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [88, 84, 109, 120, 101, 43, 31, 15, 122, 109, 37, 116, 7, 21, 125, 61, 56, 123, 64, 85, 106, 96, 56, 114, 94, 15, 110, 97, 57, 104, 82, 19, 47, 112, 101} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.f.d.a = r0
            r0 = 40
            byte[] r0 = new byte[r0]
            r0 = {x005c: FILL_ARRAY_DATA , data: [121, 68, 84, 105, 123, 44, 62, 31, 67, 124, 59, 115, 38, 5, 68, 44, 37, 127, 97, 70, 22, 55, 98, 102, 100, 67, 72, 55, 107, 120, 62, 71, 73, 54, 113, 116, 34, 6, 88, 106} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.f.d.f1088c = r0
            r0 = 0
            cn.jiguang.commons.f.d.f1089d = r0
            java.lang.String r0 = ""
            cn.jiguang.commons.f.d.f1090e = r0
            cn.jiguang.commons.f.d.f1091f = r0
            r0 = 0
            cn.jiguang.commons.f.d.f1092g = r0
            cn.jiguang.commons.f.d.f1093h = r0
            r0 = 43200(0xa8c0, double:2.13436E-319)
            cn.jiguang.commons.f.d.f1094i = r0
            r0 = 172800(0x2a300, double:8.53745E-319)
            cn.jiguang.commons.f.d.f1095j = r0
            cn.jiguang.commons.f.d$c r0 = new cn.jiguang.commons.f.d$c
            r0.<init>()
            cn.jiguang.commons.f.d.f1096k = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            cn.jiguang.commons.f.d.l = r0
            k()
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ d(cn.jiguang.commons.f.d.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ long a(long r0) {
            cn.jiguang.commons.f.d.f1095j = r0
            return r0
    }

    static /* synthetic */ java.lang.String a(int r0) {
            java.lang.String r0 = d(r0)
            return r0
    }

    private static java.lang.String a(org.json.JSONObject r3) {
            java.lang.String r3 = r3.toString()
            r0 = 1
            java.lang.String r3 = cn.jiguang.commons.L.ad.c(r3, r0)
            java.util.LinkedList r0 = cn.jiguang.commons.f.d.l
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            cn.jiguang.commons.x.c r1 = d(r1)     // Catch: java.lang.Throwable -> L31
            r1.a(r3)     // Catch: java.lang.Throwable -> L31
            cn.jiguang.commons.x.d r1 = cn.jiguang.commons.x.e.e(r1)     // Catch: java.lang.Throwable -> L31
            boolean r2 = a(r1)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto Lf
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> L31
            return r3
        L31:
            goto Lf
        L33:
            r3 = 0
            return r3
    }

    static /* synthetic */ org.json.JSONObject a(java.lang.String r0) {
            org.json.JSONObject r0 = f(r0)
            return r0
    }

    private static org.json.JSONObject a(java.lang.String r2, long r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "appkey"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "uid"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = i()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "sign"
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "al"
            java.lang.String r3 = ""
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "ver"
            r3 = 1
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "al_idx"
            int r3 = cn.jiguang.commons.f.d.f1089d     // Catch: java.lang.Throwable -> L2e
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L2e
            return r0
        L2e:
            r2 = 0
            return r2
    }

    static /* synthetic */ void a() {
            o()
            return
    }

    public static void a(java.lang.String r3, boolean r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L4d
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = new java.io.File
            android.content.Context r2 = cn.jiguang.commons.L.h.a()
            java.io.File r2 = r2.getFilesDir()
            r1.<init>(r2, r3)
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            boolean r3 = r1.isDirectory()     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L26
            goto L4d
        L26:
            java.io.File[] r3 = r1.listFiles()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            int r1 = r3.length     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L30
            goto L4d
        L30:
            a(r3, r0, r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L3e
            goto L4d
        L3e:
            if (r4 == 0) goto L42
            cn.jiguang.commons.f.d.f1090e = r3     // Catch: java.lang.Throwable -> L4d
        L42:
            java.lang.String r4 = cn.jiguang.commons.a.d.c.f959d     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = cn.jiguang.commons.L.z.c(r3, r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = cn.jiguang.commons.a.d.a.f949c     // Catch: java.lang.Throwable -> L4d
            cn.jiguang.commons.L.m.c(r4, r3)     // Catch: java.lang.Throwable -> L4d
        L4d:
            return
    }

    private static void a(java.io.File[] r3, java.lang.StringBuilder r4, boolean r5) {
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto L3d
            r1 = r3[r0]
            boolean r2 = r1.exists()
            if (r2 == 0) goto L3a
            boolean r2 = r1.isFile()
            if (r2 != 0) goto L13
            goto L3a
        L13:
            java.lang.String r1 = cn.jiguang.commons.L.m.g(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L1e
            goto L3a
        L1e:
            java.lang.String r2 = cn.jiguang.commons.a.d.c.f959d
            java.lang.String r1 = cn.jiguang.commons.L.z.a(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L2b
            goto L3a
        L2b:
            if (r5 == 0) goto L3a
            r4.append(r1)
            int r1 = r3.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L3a
            java.lang.String r1 = "&&"
            r4.append(r1)
        L3a:
            int r0 = r0 + 1
            goto L1
        L3d:
            return
    }

    private static boolean a(cn.jiguang.commons.x.d r2) {
            if (r2 == 0) goto L16
            int r0 = r2.d()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L16
            java.lang.String r2 = r2.a()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    static /* synthetic */ int c(int r0) {
            cn.jiguang.commons.f.d.f1089d = r0
            return r0
    }

    static /* synthetic */ long c(long r0) {
            cn.jiguang.commons.f.d.f1092g = r0
            return r0
    }

    static /* synthetic */ cn.jiguang.commons.f.d.c c() {
            cn.jiguang.commons.f.d$c r0 = cn.jiguang.commons.f.d.f1096k
            return r0
    }

    static /* synthetic */ java.lang.String c(java.lang.String r0) {
            cn.jiguang.commons.f.d.f1091f = r0
            return r0
    }

    static /* synthetic */ long d(long r0) {
            cn.jiguang.commons.f.d.f1094i = r0
            return r0
    }

    private static cn.jiguang.commons.x.c d(java.lang.String r2) {
            cn.jiguang.commons.x.c r0 = new cn.jiguang.commons.x.c
            r0.<init>(r2)
            java.lang.String r2 = "Content-Type"
            java.lang.String r1 = "text/plain"
            r0.a(r2, r1)
            java.lang.String r2 = "Accept"
            java.lang.String r1 = "application/json"
            r0.a(r2, r1)
            java.lang.String r2 = "Charset"
            java.lang.String r1 = "UTF-8"
            r0.a(r2, r1)
            return r0
    }

    private static java.lang.String d(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afm_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ".cache"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    static /* synthetic */ boolean d() {
            boolean r0 = l()
            return r0
    }

    static /* synthetic */ java.lang.String e() {
            java.lang.String r0 = m()
            return r0
    }

    public static java.util.HashMap e(java.lang.String r12) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r2 = "&&"
            java.lang.String[] r12 = r12.split(r2)     // Catch: java.lang.Throwable -> L65
            int r2 = r12.length     // Catch: java.lang.Throwable -> L65
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L1a:
            if (r3 >= r2) goto L6a
            r9 = r12[r3]     // Catch: java.lang.Throwable -> L5e
            int r4 = r4 + 1
            java.lang.String r10 = "&"
            java.lang.String[] r9 = r9.split(r10)     // Catch: java.lang.Throwable -> L5e
            int r10 = r9.length     // Catch: java.lang.Throwable -> L5e
            r11 = 2
            if (r10 >= r11) goto L2d
            int r5 = r5 + 1
            goto L62
        L2d:
            r10 = r9[r1]     // Catch: java.lang.Throwable -> L5e
            r11 = 1
            r9 = r9[r11]     // Catch: java.lang.Throwable -> L5e
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L5e
            if (r11 != 0) goto L60
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L3f
            goto L60
        L3f:
            boolean r11 = cn.jiguang.commons.L.a.c(r9)     // Catch: java.lang.Throwable -> L5e
            if (r11 != 0) goto L48
            int r7 = r7 + 1
            goto L62
        L48:
            boolean r11 = r0.containsKey(r9)     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto L50
            int r8 = r8 + 1
        L50:
            java.lang.String r11 = "@"
            java.lang.String[] r10 = r10.split(r11)     // Catch: java.lang.Throwable -> L5e
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch: java.lang.Throwable -> L5e
            r0.put(r9, r10)     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r1 = r4
            goto L69
        L60:
            int r6 = r6 + 1
        L62:
            int r3 = r3 + 1
            goto L1a
        L65:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L69:
            r4 = r1
        L6a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "parse pkg: t="
            r12.append(r1)
            r12.append(r4)
            java.lang.String r1 = ", r="
            r12.append(r1)
            int r1 = r0.size()
            r12.append(r1)
            java.lang.String r1 = ", sf="
            r12.append(r1)
            r12.append(r5)
            java.lang.String r1 = ", se="
            r12.append(r1)
            r12.append(r6)
            java.lang.String r1 = ", sni="
            r12.append(r1)
            r12.append(r7)
            java.lang.String r1 = ", d="
            r12.append(r1)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "ActiveConfigManager"
            cn.jiguang.commons.w.a.a(r1, r12)
            return r0
    }

    static /* synthetic */ int f() {
            int r0 = cn.jiguang.commons.f.d.f1089d
            return r0
    }

    private static org.json.JSONObject f(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 1
            java.lang.String r4 = cn.jiguang.commons.L.ad.a(r4, r0)     // Catch: java.lang.Throwable -> L3c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "ActiveConfigManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "acf map cf: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3c
            r2.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3c
            cn.jiguang.commons.w.a.a(r4, r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "code"
            int r4 = r0.optInt(r4)     // Catch: java.lang.Throwable -> L3c
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r4 == r2) goto L33
            return r1
        L33:
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L3c
            return r4
        L3c:
            return r1
    }

    public static synchronized java.lang.String g() {
            java.lang.Class<cn.jiguang.commons.f.d> r0 = cn.jiguang.commons.f.d.class
            monitor-enter(r0)
            java.lang.String r1 = cn.jiguang.commons.f.d.f1090e     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            java.lang.String r1 = cn.jiguang.commons.f.d.f1090e     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        Lf:
            r1 = move-exception
            goto L37
        L11:
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f949c     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = cn.jiguang.commons.L.m.j(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L25
            java.lang.String r2 = cn.jiguang.commons.a.d.c.f959d     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = cn.jiguang.commons.L.z.a(r1, r2)     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.commons.f.d.f1090e = r1     // Catch: java.lang.Throwable -> Lf
        L25:
            java.lang.String r1 = cn.jiguang.commons.f.d.f1090e     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L33
            java.lang.String r1 = "al"
            r2 = 1
            a(r1, r2)     // Catch: java.lang.Throwable -> Lf
        L33:
            java.lang.String r1 = cn.jiguang.commons.f.d.f1090e     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static cn.jiguang.commons.f.d h() {
            cn.jiguang.commons.f.d r0 = cn.jiguang.commons.f.d.b.a()
            return r0
    }

    private static java.lang.String i() {
            java.lang.String r0 = cn.jiguang.commons.f.d.f1091f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = cn.jiguang.commons.f.d.f1091f
            java.lang.String r1 = "null"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L13
            goto L16
        L13:
            java.lang.String r0 = cn.jiguang.commons.f.d.f1091f
            return r0
        L16:
            java.lang.String r0 = ""
            return r0
    }

    private static void j() {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            java.lang.String r1 = "last_time"
            r2 = 0
            long r4 = r0.a(r1, r2)
            cn.jiguang.commons.f.d.f1092g = r4
            java.lang.String r1 = "last_all_time"
            long r1 = r0.a(r1, r2)
            cn.jiguang.commons.f.d.f1093h = r1
            java.lang.String r1 = "sign"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.a(r1, r2)
            cn.jiguang.commons.f.d.f1091f = r1
            java.lang.String r1 = "al_idx"
            r2 = 0
            int r1 = r0.a(r1, r2)
            cn.jiguang.commons.f.d.f1089d = r1
            java.lang.String r1 = "req_gap"
            r2 = 43200(0xa8c0, double:2.13436E-319)
            long r1 = r0.a(r1, r2)
            cn.jiguang.commons.f.d.f1094i = r1
            java.lang.String r1 = "t_interval"
            r2 = 172800(0x2a300, double:8.53745E-319)
            long r0 = r0.a(r1, r2)
            cn.jiguang.commons.f.d.f1095j = r0
            return
    }

    private static void k() {
            java.util.LinkedList r0 = cn.jiguang.commons.f.d.l
            r0.clear()
            java.lang.String r1 = cn.jiguang.commons.f.d.a
            r0.add(r1)
            java.lang.String r1 = cn.jiguang.commons.f.d.f1088c
            r0.add(r1)
            return
    }

    private static boolean l() {
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()
            r1 = 1100(0x44c, float:1.541E-42)
            r2 = 0
            java.util.List r0 = r0.c(r1, r2)
            java.lang.String r1 = "ActiveConfigManager"
            if (r0 == 0) goto L1b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            java.lang.String r0 = " al sz >0,not need req"
        L17:
            cn.jiguang.commons.w.a.a(r1, r0)
            return r2
        L1b:
            cn.jiguang.commons.g.l r0 = cn.jiguang.commons.g.l.a()
            r3 = 1110(0x456, float:1.555E-42)
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L30
            boolean r0 = cn.jiguang.commons.L.u.j()
            if (r0 == 0) goto L30
            java.lang.String r0 = " app list file sz >0,not need req"
            goto L17
        L30:
            java.lang.String r0 = "need req"
            cn.jiguang.commons.w.a.a(r1, r0)
            r0 = 1
            return r0
    }

    private static java.lang.String m() {
            r0 = 0
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.d()     // Catch: java.lang.Throwable -> L29
            cn.jiguang.commons.g.p r2 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L29
            long r2 = r2.l()     // Catch: java.lang.Throwable -> L29
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L29
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1e
            goto L29
        L1e:
            org.json.JSONObject r1 = a(r1, r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L25
            return r0
        L25:
            java.lang.String r0 = a(r1)     // Catch: java.lang.Throwable -> L29
        L29:
            return r0
    }

    private static void o() {
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()
            long r1 = cn.jiguang.commons.f.d.f1092g
            java.lang.String r3 = "last_time"
            r0.c(r3, r1)
            java.lang.String r1 = cn.jiguang.commons.f.d.f1091f
            java.lang.String r2 = "sign"
            r0.c(r2, r1)
            int r1 = cn.jiguang.commons.f.d.f1089d
            java.lang.String r2 = "al_idx"
            r0.c(r2, r1)
            long r1 = cn.jiguang.commons.f.d.f1094i
            java.lang.String r3 = "req_gap"
            r0.c(r3, r1)
            long r1 = cn.jiguang.commons.f.d.f1095j
            java.lang.String r3 = "t_interval"
            r0.c(r3, r1)
            return
    }

    public void n() {
            r12 = this;
            j()
            long r0 = cn.jiguang.commons.f.d.f1092g
            long r2 = cn.jiguang.commons.f.d.f1094i
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.String r6 = "ActiveConfigManager"
            boolean r0 = cn.jiguang.commons.y.a.a(r6, r0, r2)
            if (r0 != 0) goto L14
            goto L27
        L14:
            long r7 = cn.jiguang.commons.f.d.f1092g
            long r0 = cn.jiguang.commons.f.d.f1094i
            long r9 = r0 * r4
            cn.jiguang.commons.f.d$a r11 = new cn.jiguang.commons.f.d$a
            r11.<init>(r12)
            java.lang.String r6 = "ActiveConfigManager"
            boolean r0 = cn.jiguang.commons.y.a.a(r6, r7, r9, r11)
            if (r0 == 0) goto L28
        L27:
            return
        L28:
            cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
            cn.jiguang.commons.f.d$c r1 = cn.jiguang.commons.f.d.f1096k
            r2 = 3000(0xbb8, double:1.482E-320)
            r0.a(r1, r2)
            return
    }
}
