package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class t {
    private static volatile java.lang.Object a;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentHashMap f924c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentHashMap f925d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f926e = null;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f927f;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.commons.L.t.f924c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.commons.L.t.f925d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.commons.L.t.f926e = r0
            java.lang.String r0 = ""
            cn.jiguang.commons.L.t.f927f = r0
            return
    }

    public t() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r3) {
            if (r3 != 0) goto L2e
            java.util.concurrent.atomic.AtomicReference r3 = cn.jiguang.commons.L.t.f926e
            java.lang.Object r0 = r3.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L29
            int r0 = e()
            r0 = r0 | 4239(0x108f, float:5.94E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            boolean r1 = androidx.camera.view.p.a(r3, r2, r1)
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.lang.Object r3 = r3.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
        L29:
            int r3 = r0.intValue()
            return r3
        L2e:
            int r0 = e()
            r0 = r0 | 4239(0x108f, float:5.94E-42)
            r3 = r3 | r0
            return r3
    }

    private static int a(android.content.pm.ApplicationInfo r3, boolean r4) {
            r0 = -1
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.flags     // Catch: java.lang.Exception -> L42
            r2 = r1 & 1
            if (r2 == 0) goto L12
            r3 = r1 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L10
            r3 = 2
            return r3
        L10:
            r3 = 1
            return r3
        L12:
            java.lang.String r4 = c(r3, r4)     // Catch: java.lang.Exception -> L42
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L42
            if (r1 == 0) goto L1d
            return r0
        L1d:
            java.lang.String r1 = "/system/"
            boolean r1 = r4.startsWith(r1)     // Catch: java.lang.Exception -> L42
            if (r1 != 0) goto L40
            java.lang.String r1 = "/vendor/"
            boolean r1 = r4.startsWith(r1)     // Catch: java.lang.Exception -> L42
            if (r1 != 0) goto L40
            java.lang.String r1 = "/product/"
            boolean r1 = r4.startsWith(r1)     // Catch: java.lang.Exception -> L42
            if (r1 != 0) goto L40
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Exception -> L42
            boolean r3 = r4.contains(r3)     // Catch: java.lang.Exception -> L42
            if (r3 != 0) goto L3e
            goto L40
        L3e:
            r3 = 0
            return r3
        L40:
            r3 = 3
            return r3
        L42:
            return r0
    }

    public static int a(boolean r1) {
            r0 = 0
            int r1 = a(r0, r1, r0, r0)
            return r1
    }

    public static int a(boolean r2, boolean r3, int r4, boolean r5) {
            if (r2 == 0) goto Ld
            if (r5 == 0) goto L5
            return r4
        L5:
            int r2 = e()
            r2 = r2 | 4239(0x108f, float:5.94E-42)
            r2 = r2 | r4
            return r2
        Ld:
            cn.jiguang.commons.g.l r2 = cn.jiguang.commons.g.l.a()
            r5 = 1038(0x40e, float:1.455E-42)
            boolean r5 = r2.a(r5, r3)
            r0 = 1300(0x514, float:1.822E-42)
            boolean r2 = r2.a(r0, r3)
            r3 = 4
            if (r5 == 0) goto L25
            int r0 = e()
            r3 = r3 | r0
        L25:
            if (r2 == 0) goto L29
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        L29:
            if (r4 == 0) goto L42
            if (r5 != 0) goto L3b
            r5 = r4 & (-65)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L3a
            r5 = -134217793(0xfffffffff7ffffbf, float:-1.03845535E34)
            r4 = r4 & r5
            goto L3b
        L3a:
            r4 = r5
        L3b:
            if (r2 != 0) goto L3f
            r4 = r4 & (-4097(0xffffffffffffefff, float:NaN))
        L3f:
            r2 = r3 | r4
            return r2
        L42:
            return r3
    }

    public static long a(android.content.pm.PackageInfo r2, boolean r3) {
            r0 = 0
            if (r3 != 0) goto L5
            return r0
        L5:
            if (r2 == 0) goto La
            long r2 = r2.firstInstallTime
            return r2
        La:
            return r0
    }

    public static android.content.pm.PackageInfo a() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            java.lang.String r0 = r0.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r0 = a(r0, r1)
            return r0
    }

    public static android.content.pm.PackageInfo a(java.lang.String r1, boolean r2) {
            r0 = 0
            android.content.pm.PackageInfo r1 = a(r1, r2, r0, r0)
            return r1
    }

    public static android.content.pm.PackageInfo a(java.lang.String r1, boolean r2, int r3) {
            r0 = 0
            android.content.pm.PackageInfo r1 = a(r1, r2, r3, r0)
            return r1
    }

    public static android.content.pm.PackageInfo a(java.lang.String r3, boolean r4, int r5, boolean r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = d(r3)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            android.content.pm.PackageInfo r2 = d(r3, r5)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r4 = move-exception
            goto L28
        L15:
            r2 = r1
        L16:
            if (r2 != 0) goto L27
            if (r6 == 0) goto L1d
            if (r5 == 0) goto L1d
            goto L22
        L1d:
            r6 = 1
            int r5 = a(r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L13
        L22:
            android.content.pm.PackageInfo r3 = c(r3, r5)     // Catch: java.lang.Throwable -> L13
            return r3
        L27:
            return r2
        L28:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "get package info error: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "PackageUtils"
            cn.jiguang.commons.w.a.a(r5, r3, r4)
            return r1
    }

    public static java.lang.String a(android.content.pm.PackageInfo r2) {
            r0 = 0
            if (r2 == 0) goto L1d
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            if (r2 != 0) goto L8
            goto L1d
        L8:
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L1d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1d
            java.lang.CharSequence r2 = r2.loadLabel(r1)     // Catch: java.lang.Exception -> L1d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L1d
            java.lang.String r2 = c(r2)     // Catch: java.lang.Exception -> L1d
            return r2
        L1d:
            return r0
    }

    private static java.lang.String a(android.content.pm.PackageInfo r4, java.lang.String r5) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.packageName
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.ConcurrentHashMap r2 = cn.jiguang.commons.L.t.f925d
            java.lang.Object r3 = r2.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L26
            return r3
        L26:
            android.content.pm.Signature[] r4 = e(r4)
            if (r4 == 0) goto L6c
            int r3 = r4.length
            if (r3 != 0) goto L30
            goto L6c
        L30:
            r3 = 0
            r4 = r4[r3]     // Catch: java.lang.Exception -> L6c
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Exception -> L6c
            java.lang.String r3 = cn.jiguang.commons.a.d.f944g     // Catch: java.lang.Exception -> L6c
            boolean r3 = android.text.TextUtils.equals(r5, r3)     // Catch: java.lang.Exception -> L6c
            if (r3 == 0) goto L44
            byte[] r4 = cn.jiguang.commons.L.k.c(r4)     // Catch: java.lang.Exception -> L6c
            goto L5f
        L44:
            java.lang.String r3 = cn.jiguang.commons.a.d.f945h     // Catch: java.lang.Exception -> L6c
            boolean r3 = android.text.TextUtils.equals(r5, r3)     // Catch: java.lang.Exception -> L6c
            if (r3 == 0) goto L51
            byte[] r4 = cn.jiguang.commons.L.k.e(r4)     // Catch: java.lang.Exception -> L6c
            goto L5f
        L51:
            java.lang.String r3 = cn.jiguang.commons.a.d.f946i     // Catch: java.lang.Exception -> L6c
            boolean r5 = android.text.TextUtils.equals(r5, r3)     // Catch: java.lang.Exception -> L6c
            if (r5 == 0) goto L5e
            byte[] r4 = cn.jiguang.commons.L.k.f(r4)     // Catch: java.lang.Exception -> L6c
            goto L5f
        L5e:
            r4 = 0
        L5f:
            if (r4 != 0) goto L62
            return r0
        L62:
            r5 = 58
            java.lang.String r4 = cn.jiguang.commons.L.k.a(r4, r5)     // Catch: java.lang.Exception -> L6c
            r2.put(r1, r4)     // Catch: java.lang.Exception -> L6c
            return r4
        L6c:
            return r0
    }

    private static java.lang.String a(java.lang.String r1) {
            java.lang.String r0 = "\n|\r|\r\n|\n\r|\t"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            return r1
    }

    private static java.lang.String a(java.lang.String r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static int c(android.content.pm.PackageInfo r0, boolean r1) {
            if (r0 == 0) goto Lb
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto Lb
            int r0 = a(r0, r1)
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public static int c(java.lang.String r4, boolean r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.content.Context r5 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L45
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = cn.jiguang.commons.a.d.f941d     // Catch: java.lang.Throwable -> L45
            r1.setClassName(r4, r2)     // Catch: java.lang.Throwable -> L45
            android.content.pm.ResolveInfo r1 = r5.resolveService(r1, r0)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L1e
            r1 = 2
            goto L1f
        L1e:
            r1 = 0
        L1f:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = cn.jiguang.commons.a.d.f942e     // Catch: java.lang.Throwable -> L44
            r2.setClassName(r4, r3)     // Catch: java.lang.Throwable -> L44
            android.content.pm.ResolveInfo r2 = r5.resolveService(r2, r0)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L31
            int r1 = r1 + 1
        L31:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = cn.jiguang.commons.a.d.f943f     // Catch: java.lang.Throwable -> L44
            r2.setClassName(r4, r3)     // Catch: java.lang.Throwable -> L44
            android.content.pm.ResolveInfo r4 = r5.resolveService(r2, r0)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L43
            int r1 = r1 + 4
        L43:
            return r1
        L44:
            r0 = r1
        L45:
            return r0
    }

    private static android.content.pm.PackageInfo c(java.lang.String r3, int r4) {
            java.lang.String r0 = a(r3, r4)
            java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.commons.L.t.f924c
            java.lang.Object r2 = r1.get(r0)
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            if (r2 == 0) goto Lf
            return r2
        Lf:
            android.content.pm.PackageInfo r3 = f(r3, r4)
            if (r3 == 0) goto L1b
            f()
            r1.put(r0, r3)
        L1b:
            return r3
    }

    public static java.lang.String c() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L1d
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Exception -> L1d
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L1d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1d
            java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch: java.lang.Exception -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1d
            java.lang.String r0 = c(r0)     // Catch: java.lang.Exception -> L1d
            return r0
        L1d:
            r0 = 0
            return r0
    }

    public static java.lang.String c(android.content.pm.ApplicationInfo r1, boolean r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r1 == 0) goto L9
            java.lang.String r1 = r1.sourceDir
            return r1
        L9:
            return r0
    }

    private static java.lang.String c(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L23
            java.lang.String r0 = a(r6)
            byte[] r1 = r6.getBytes()     // Catch: java.lang.Throwable -> L23
            int r2 = r1.length     // Catch: java.lang.Throwable -> L23
            r3 = 30
            if (r2 <= r3) goto L23
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "UTF-8"
            r5 = 0
            r2.<init>(r1, r5, r3, r4)     // Catch: java.lang.Throwable -> L23
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r0.substring(r5, r1)     // Catch: java.lang.Throwable -> L23
        L23:
            return r6
    }

    public static boolean c(int r2) {
            r0 = 1
            if (r2 == r0) goto Lc
            r1 = 2
            if (r2 == r1) goto Lc
            r1 = 3
            if (r2 != r1) goto La
            goto Lc
        La:
            r2 = 0
            return r2
        Lc:
            return r0
    }

    public static boolean c(android.content.pm.PackageInfo r3) {
            r0 = 0
            if (r3 == 0) goto L1c
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            if (r1 == 0) goto L1c
            cn.jiguang.commons.g.l r1 = cn.jiguang.commons.g.l.a()
            r2 = 1033(0x409, float:1.448E-42)
            boolean r0 = r1.a(r2, r0)
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo
            int r3 = a(r3, r0)
            boolean r3 = c(r3)
            return r3
        L1c:
            return r0
    }

    public static long d(android.content.pm.PackageInfo r2, boolean r3) {
            r0 = 0
            if (r3 != 0) goto L5
            return r0
        L5:
            if (r2 == 0) goto La
            long r2 = r2.lastUpdateTime
            return r2
        La:
            return r0
    }

    private static android.content.pm.PackageInfo d(java.lang.String r3, int r4) {
            int r4 = a(r4)
            java.lang.String r0 = a(r3, r4)
            java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.commons.L.t.f924c
            java.lang.Object r2 = r1.get(r0)
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            if (r2 == 0) goto L13
            return r2
        L13:
            android.content.pm.PackageInfo r3 = f(r3, r4)
            if (r3 == 0) goto L20
            f()
            r1.put(r0, r3)
            return r3
        L20:
            r3 = 0
            return r3
    }

    public static java.lang.String d() {
            java.lang.String r0 = cn.jiguang.commons.L.t.f927f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = cn.jiguang.commons.L.t.f927f
            return r0
        Lb:
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            java.lang.String r0 = r0.getPackageName()
            cn.jiguang.commons.L.t.f927f = r0
            return r0
    }

    public static boolean d(java.lang.String r1) {
            java.lang.String r0 = d()
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            return r1
    }

    public static java.lang.String[] d(android.content.pm.PackageInfo r4) {
            r0 = 0
            if (r4 == 0) goto L1f
            android.content.pm.ServiceInfo[] r4 = r4.services     // Catch: java.lang.Exception -> L22
            if (r4 == 0) goto L1f
            int r1 = r4.length     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto Lb
            goto L1f
        Lb:
            int r1 = r4.length     // Catch: java.lang.Exception -> L22
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L22
            int r2 = r4.length     // Catch: java.lang.Exception -> L22
            if (r2 <= 0) goto L1e
            r2 = 0
        L12:
            int r3 = r4.length     // Catch: java.lang.Exception -> L22
            if (r2 >= r3) goto L1e
            r3 = r4[r2]     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = r3.name     // Catch: java.lang.Exception -> L22
            r1[r2] = r3     // Catch: java.lang.Exception -> L22
            int r2 = r2 + 1
            goto L12
        L1e:
            return r1
        L1f:
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L22
            return r4
        L22:
            java.lang.String[] r4 = new java.lang.String[r0]
            return r4
    }

    private static int e() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            r0 = 134217792(0x8000040, float:3.8518893E-34)
            return r0
        La:
            r0 = 64
            return r0
    }

    public static android.content.pm.PackageInfo e(java.lang.String r7, int r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = cn.jiguang.commons.L.t.a     // Catch: java.lang.Exception -> L3f
            r2 = 0
            if (r0 != 0) goto L41
            java.lang.Class<cn.jiguang.commons.L.t> r0 = cn.jiguang.commons.L.t.class
            monitor-enter(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.Object r3 = cn.jiguang.commons.L.t.a     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L3b
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ="
            byte[] r4 = android.util.Base64.decode(r4, r2)     // Catch: java.lang.Throwable -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "Z2V0UGFja2FnZU1hbmFnZXI="
            byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: java.lang.Throwable -> L39
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r3 = r3.getMethod(r4, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = r3.invoke(r1, r1)     // Catch: java.lang.Throwable -> L39
            cn.jiguang.commons.L.t.a = r3     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r8 = move-exception
            goto L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L41
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r8     // Catch: java.lang.Exception -> L3f
        L3f:
            r8 = move-exception
            goto L89
        L41:
            java.lang.Object r0 = cn.jiguang.commons.L.t.a     // Catch: java.lang.Exception -> L3f
            android.os.IInterface r0 = (android.os.IInterface) r0     // Catch: java.lang.Exception -> L3f
            android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Exception -> L3f
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch: java.lang.Exception -> L3f
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = r0.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L78
            r3.writeInterfaceToken(r5)     // Catch: java.lang.Throwable -> L78
            r3.writeString(r7)     // Catch: java.lang.Throwable -> L78
            long r5 = (long) r8     // Catch: java.lang.Throwable -> L78
            r3.writeLong(r5)     // Catch: java.lang.Throwable -> L78
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L78
            r8 = 3
            r0.transact(r8, r3, r4, r2)     // Catch: java.lang.Throwable -> L78
            r4.readException()     // Catch: java.lang.Throwable -> L78
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L7a
            android.os.Parcelable$Creator r8 = android.content.pm.PackageInfo.CREATOR     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = r8.createFromParcel(r4)     // Catch: java.lang.Throwable -> L78
            android.content.pm.PackageInfo r8 = (android.content.pm.PackageInfo) r8     // Catch: java.lang.Throwable -> L78
            goto L7b
        L78:
            r8 = move-exception
            goto L82
        L7a:
            r8 = r1
        L7b:
            r3.recycle()     // Catch: java.lang.Exception -> L3f
            r4.recycle()     // Catch: java.lang.Exception -> L3f
            return r8
        L82:
            r3.recycle()     // Catch: java.lang.Exception -> L3f
            r4.recycle()     // Catch: java.lang.Exception -> L3f
            throw r8     // Catch: java.lang.Exception -> L3f
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "b method failed: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ", error: "
            r0.append(r7)
            java.lang.String r7 = r8.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "PackageUtils"
            cn.jiguang.commons.w.a.f(r8, r7)
            return r1
    }

    public static java.lang.String e(android.content.pm.PackageInfo r0, boolean r1) {
            if (r1 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r1 = cn.jiguang.commons.a.d.f944g
            java.lang.String r0 = a(r0, r1)
            return r0
    }

    private static android.content.pm.Signature[] e(android.content.pm.PackageInfo r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L25
            android.content.pm.SigningInfo r1 = androidx.core.content.pm.a.a(r3)
            if (r1 == 0) goto L24
            boolean r0 = cn.jiguang.commons.L.g1.a(r1)
            android.content.pm.SigningInfo r3 = androidx.core.content.pm.a.a(r3)
            if (r0 == 0) goto L1f
            android.content.pm.Signature[] r3 = cn.jiguang.commons.L.h1.a(r3)
            return r3
        L1f:
            android.content.pm.Signature[] r3 = cn.jiguang.commons.L.i1.a(r3)
            return r3
        L24:
            return r0
        L25:
            android.content.pm.Signature[] r3 = r3.signatures
            return r3
    }

    private static android.content.pm.PackageInfo f(java.lang.String r1, int r2) {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> Lf
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> Lf
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto Lf
            return r0
        Lf:
            android.content.pm.PackageInfo r1 = e(r1, r2)     // Catch: java.lang.Exception -> L1e
            if (r1 == 0) goto L1e
            java.lang.String r2 = r1.packageName     // Catch: java.lang.Exception -> L1e
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e
            if (r2 != 0) goto L1e
            return r1
        L1e:
            r1 = 0
            return r1
    }

    private static void f() {
            java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.L.t.f924c
            int r1 = r0.size()
            r2 = 100
            if (r1 >= r2) goto Lb
            return
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = cn.jiguang.commons.L.h.a()
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.startsWith(r1)
            if (r2 != 0) goto L2c
            r0.remove()
            goto L2c
        L42:
            java.lang.String r0 = "PackageUtils"
            java.lang.String r1 = "Cache full, cleared non-current app entries"
            cn.jiguang.commons.w.a.a(r0, r1)
            return
    }

    public static java.lang.String[] f(android.content.pm.PackageInfo r1, boolean r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r1 == 0) goto L9
            java.lang.String[] r1 = r1.requestedPermissions
            return r1
        L9:
            return r0
    }

    public static java.lang.String g(android.content.pm.PackageInfo r0, boolean r1) {
            if (r1 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r1 = cn.jiguang.commons.a.d.f945h
            java.lang.String r0 = a(r0, r1)
            return r0
    }

    public static java.lang.String h(android.content.pm.PackageInfo r0, boolean r1) {
            if (r1 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r1 = cn.jiguang.commons.a.d.f946i
            java.lang.String r0 = a(r0, r1)
            return r0
    }
}
