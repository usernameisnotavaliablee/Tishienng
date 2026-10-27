package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.Boolean f683b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f684c;


    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r3) {
            java.lang.String r0 = "AuthUtils"
            java.lang.String r1 = " sync status"
            cn.jiguang.w.f.c(r0, r1)
            cn.jiguang.av.b$1 r0 = new cn.jiguang.av.b$1
            r0.<init>(r3)
            r1 = 8000(0x1f40, double:3.9525E-320)
            java.lang.String r3 = "DELAY_TASK"
            cn.jiguang.au.d.a(r3, r0, r1)
            return
    }

    public static void a(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enableAutoWakeup status: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AuthUtils"
            cn.jiguang.w.f.c(r1, r0)
            d(r2, r3)
            cn.jiguang.ad.a.a(r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "enable_auto_wakeup"
            r0.putBoolean(r1, r3)
            java.lang.String r3 = "a8"
            cn.jiguang.a.a.a(r2, r3, r0)
            return
    }

    public static void a(boolean r0, boolean r1) {
            cn.jiguang.av.b.f684c = r1
            cn.jiguang.av.b.a = r0
            return
    }

    public static boolean a() {
            boolean r0 = cn.jiguang.av.b.a
            return r0
    }

    public static void b(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enableipv6 priority status: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AuthUtils"
            cn.jiguang.w.f.c(r1, r0)
            f(r2, r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "enable_ci_priority"
            r0.putBoolean(r1, r3)
            java.lang.String r3 = "a11"
            cn.jiguang.a.a.a(r2, r3, r0)
            return
    }

    public static boolean b() {
            boolean r0 = cn.jiguang.av.b.f684c
            return r0
    }

    public static boolean b(android.content.Context r1) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.f()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static void c(android.content.Context r0, boolean r1) {
            return
    }

    static /* synthetic */ boolean c() {
            boolean r0 = cn.jiguang.av.b.f684c
            return r0
    }

    public static boolean c(android.content.Context r1) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.h()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static void d(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enableAutoWakeup config status: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AuthUtils"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.f()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            cn.jiguang.e.b.a(r2, r0)
            return
    }

    public static boolean d(android.content.Context r1) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.i()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static void e(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setDynamicLoad config enable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AuthUtils"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.h()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            cn.jiguang.e.b.a(r2, r0)
            return
    }

    public static boolean e(android.content.Context r1) {
            java.lang.Boolean r0 = cn.jiguang.av.b.f683b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L10
            cn.jiguang.e.a r0 = cn.jiguang.e.a.g()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L17
            cn.jiguang.av.b.f683b = r1     // Catch: java.lang.Throwable -> L17
        L10:
            java.lang.Boolean r1 = cn.jiguang.av.b.f683b     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static void f(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IPV6First config enable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AuthUtils"
            cn.jiguang.w.f.c(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            cn.jiguang.av.b.f683b = r0
            cn.jiguang.e.a r0 = cn.jiguang.e.a.g()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            cn.jiguang.e.b.a(r2, r0)
            return
    }

    public static void g(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setAppTerminate config enable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AuthUtils"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.i()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            cn.jiguang.e.a r3 = r0.a(r3)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            cn.jiguang.e.b.a(r2, r0)
            return
    }
}
