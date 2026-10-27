package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n {
    public n() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L39
            java.lang.String r0 = "wifi"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L11
            r1 = 1
            return r1
        L11:
            java.lang.String r0 = "2g"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            r1 = 2
            return r1
        L1b:
            java.lang.String r0 = "3g"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            r1 = 3
            return r1
        L25:
            java.lang.String r0 = "4g"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2f
            r1 = 4
            return r1
        L2f:
            java.lang.String r0 = "5g"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L39
            r1 = 5
            return r1
        L39:
            r1 = 0
            return r1
    }

    public static java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = "unknown"
            java.lang.String r0 = cn.jiguang.f.b.f(r0)
            return r0
    }

    public static boolean a() {
            r0 = 10000(0x2710, float:1.4013E-41)
            boolean r0 = a(r0)
            return r0
    }

    private static boolean a(int r5) {
            android.net.ConnectivityManager r0 = b()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L4f
            android.net.Network r1 = androidx.work.impl.constraints.trackers.a.a(r0)
            if (r1 != 0) goto L15
            boolean r5 = a(r0, r5)
            return r5
        L15:
            android.net.NetworkCapabilities r1 = r0.getNetworkCapabilities(r1)
            if (r1 != 0) goto L20
            boolean r5 = a(r0, r5)
            return r5
        L20:
            r2 = 12
            boolean r2 = r1.hasCapability(r2)
            r3 = 16
            boolean r3 = r1.hasCapability(r3)
            if (r2 == 0) goto L4a
            if (r3 != 0) goto L31
            goto L4a
        L31:
            r2 = 0
            r3 = 1
            if (r5 == 0) goto L3a
            if (r5 == r3) goto L38
            return r3
        L38:
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            boolean r1 = r1.hasTransport(r4)
            if (r1 != 0) goto L49
            boolean r5 = a(r0, r5)
            if (r5 == 0) goto L48
            goto L49
        L48:
            return r2
        L49:
            return r3
        L4a:
            boolean r5 = a(r0, r5)
            return r5
        L4f:
            boolean r5 = a(r0, r5)
            return r5
    }

    private static boolean a(android.net.ConnectivityManager r3, int r4) {
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            r0 = 0
            if (r3 == 0) goto L22
            boolean r1 = r3.isConnected()
            if (r1 != 0) goto Le
            goto L22
        Le:
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 1
            if (r1 != r4) goto L14
            return r2
        L14:
            int r3 = r3.getType()
            if (r4 != 0) goto L1f
            boolean r3 = b(r3)
            return r3
        L1f:
            if (r3 != r4) goto L22
            return r2
        L22:
            return r0
    }

    public static int b(android.content.Context r0) {
            java.lang.String r0 = a(r0)
            int r0 = a(r0)
            return r0
    }

    public static android.net.ConnectivityManager b() {
            android.content.Context r0 = cn.jiguang.av.c.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = cn.jiguang.av.p.a(r0, r2)
            if (r2 != 0) goto L11
            return r1
        L11:
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            return r0
    }

    private static boolean b(int r1) {
            if (r1 == 0) goto L14
            r0 = 4
            if (r1 == r0) goto L14
            r0 = 5
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 6
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 != r0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static java.lang.String c() {
            android.net.ConnectivityManager r0 = b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L2e
            android.net.Network r2 = androidx.work.impl.constraints.trackers.a.a(r0)
            if (r2 != 0) goto L17
            return r1
        L17:
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            r2 = 3
            boolean r2 = r0.hasTransport(r2)
            boolean r3 = r0.hasTransport(r5)
            boolean r4 = r0.hasTransport(r4)
            r5 = r4
            r4 = r2
            goto L49
        L2e:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 != 0) goto L35
            return r1
        L35:
            int r0 = r0.getType()
            if (r0 == 0) goto L48
            if (r0 == r5) goto L46
            r2 = 9
            r3 = 0
            if (r0 == r2) goto L44
        L42:
            r5 = 0
            goto L49
        L44:
            r4 = 1
            goto L42
        L46:
            r3 = 1
            goto L42
        L48:
            r3 = 0
        L49:
            if (r4 == 0) goto L4e
            java.lang.String r0 = "ethernet"
            return r0
        L4e:
            if (r3 == 0) goto L54
            java.lang.String r0 = "wifi"
            return r0
        L54:
            if (r5 == 0) goto L59
            java.lang.String r0 = "cellular"
            return r0
        L59:
            return r1
    }

    public static java.lang.String c(android.content.Context r0) {
            java.lang.String r0 = "unknown"
            java.lang.String r0 = cn.jiguang.f.b.f(r0)
            return r0
    }
}
