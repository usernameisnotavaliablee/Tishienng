package p2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: p2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0089a {
        void a();

        void b(boolean r1);
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r5, java.lang.String r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 23
            if (r0 < r2) goto L2a
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Exception -> L2a
            java.lang.String r3 = r5.getPackageName()     // Catch: java.lang.Exception -> L2a
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> L2a
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Exception -> L2a
            int r0 = r0.targetSdkVersion     // Catch: java.lang.Exception -> L2a
            if (r0 < r2) goto L22
            int r5 = androidx.core.app.q.a(r5, r6)     // Catch: java.lang.Exception -> L2a
            if (r5 != 0) goto L21
            return r1
        L21:
            return r4
        L22:
            int r5 = androidx.core.content.PermissionChecker.checkSelfPermission(r5, r6)     // Catch: java.lang.Exception -> L2a
            if (r5 != 0) goto L29
            return r1
        L29:
            return r4
        L2a:
            return r1
    }

    public static java.lang.String b() {
            java.lang.String r0 = "cat /proc/cpuinfo"
            r1 = 0
            com.snail.antifake.deviceid.e$a r0 = com.snail.antifake.deviceid.e.b(r0, r1)
            if (r0 != 0) goto Lc
            java.lang.String r0 = ""
            return r0
        Lc:
            java.lang.String r0 = r0.b
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = "ro.kernel.qemu"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    public static java.lang.String d(android.content.Context r0) {
            java.lang.String r0 = o2.a.a(r0)
            return r0
    }

    public static java.lang.String e(android.content.Context r0) {
            java.lang.String r0 = o2.b.b(r0)
            return r0
    }

    public static java.lang.String f(android.content.Context r0) {
            java.lang.String r0 = o2.c.b(r0)
            return r0
    }

    public static java.lang.String g() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/tty/drivers"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.exists()
            if (r2 == 0) goto L39
            boolean r2 = r0.canRead()
            if (r2 == 0) goto L39
            r2 = 1024(0x400, float:1.435E-42)
            char[] r3 = new char[r2]     // Catch: java.lang.Exception -> L34
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L34
            r4.<init>(r0)     // Catch: java.lang.Exception -> L34
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L34
            java.lang.String r5 = "UTF-8"
            r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L34
        L28:
            r4 = 0
            int r5 = r0.read(r3, r4, r2)     // Catch: java.lang.Exception -> L34
            if (r5 >= 0) goto L30
            goto L34
        L30:
            r1.append(r3, r4, r5)     // Catch: java.lang.Exception -> L34
            goto L28
        L34:
            java.lang.String r0 = r1.toString()
            return r0
        L39:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean h() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/dev/socket/qemud"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            return r0
    }

    public static boolean i() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/dev/socket/qemud"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            return r0
    }

    private static boolean j() {
            java.lang.String r0 = com.snail.antifake.deviceid.a.e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L14
            java.lang.String r1 = "x86"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    private static boolean k() {
            java.lang.String r0 = "cat /proc/cpuinfo"
            r1 = 0
            com.snail.antifake.deviceid.e$a r0 = com.snail.antifake.deviceid.e.b(r0, r1)
            if (r0 != 0) goto Lc
            java.lang.String r0 = ""
            goto Le
        Lc:
            java.lang.String r0 = r0.b
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L2e
            java.lang.String r2 = r0.toLowerCase()
            java.lang.String r3 = "intel"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L2c
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "amd"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L2e
        L2c:
            r0 = 1
            return r0
        L2e:
            return r1
    }

    public static boolean l(android.content.Context r2) {
            java.lang.String r2 = "ro.product.model"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L1e
            java.lang.String r2 = com.snail.antifake.jni.PropertiesGet.a(r2)
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r0 = "sdk"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1e
            return r1
        L1e:
            java.lang.String r2 = "ro.product.manufacturer"
            java.lang.String r2 = com.snail.antifake.jni.PropertiesGet.a(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3d
            java.lang.String r2 = "ro.product.manufacture"
            java.lang.String r2 = com.snail.antifake.jni.PropertiesGet.a(r2)
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r0 = "unknown"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L3d
            return r1
        L3d:
            java.lang.String r2 = "ro.product.device"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5a
            java.lang.String r2 = com.snail.antifake.jni.PropertiesGet.a(r2)
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r0 = "generic"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L5a
            return r1
        L5a:
            r2 = 0
            return r2
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static boolean m(android.content.Context r2) {
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> Ld
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> Ld
            java.lang.String r0 = r0.getDeviceId()     // Catch: java.lang.Exception -> Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = o2.b.b(r2)
            java.lang.String r2 = o2.c.b(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L2a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            return r2
    }

    public static boolean n(android.content.Context r1) {
            boolean r0 = o(r1)
            if (r0 != 0) goto L1b
            boolean r1 = l(r1)
            if (r1 != 0) goto L1b
            boolean r1 = j()
            if (r1 != 0) goto L1b
            boolean r1 = k()
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }

    public static boolean o(android.content.Context r1) {
            java.lang.String r1 = "ro.kernel.qemu"
            java.lang.String r1 = com.snail.antifake.jni.PropertiesGet.a(r1)
            java.lang.String r0 = "1"
            boolean r1 = r0.equals(r1)
            return r1
    }
}
