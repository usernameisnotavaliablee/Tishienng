package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.net.ConnectivityManager a() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = cn.jiguang.commons.L.u.a(r2)
            if (r2 != 0) goto L11
            return r1
        L11:
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            return r0
    }

    private static java.lang.String a(android.net.ConnectivityManager r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "NetworkUtils"
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto L53
            boolean r2 = r4.isConnected()     // Catch: java.lang.Exception -> L1b
            if (r2 != 0) goto L11
            goto L53
        L11:
            int r4 = r4.getType()     // Catch: java.lang.Exception -> L1b
            r2 = 1
            if (r4 != r2) goto L1d
            java.lang.String r4 = "WiFi"
            return r4
        L1b:
            r4 = move-exception
            goto L59
        L1d:
            boolean r2 = c(r4)     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L28
            java.lang.String r4 = cn.jiguang.commons.L.ae.g()     // Catch: java.lang.Exception -> L1b
            return r4
        L28:
            r2 = 9
            if (r4 != r2) goto L2f
            java.lang.String r4 = "Ethernet"
            return r4
        L2f:
            r2 = 17
            if (r4 != r2) goto L36
            java.lang.String r4 = "VPN"
            return r4
        L36:
            r2 = 7
            if (r4 != r2) goto L3c
            java.lang.String r4 = "Bluetooth"
            return r4
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b
            r2.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r3 = "Unknown network type: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1b
            r2.append(r4)     // Catch: java.lang.Exception -> L1b
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L1b
            cn.jiguang.commons.w.a.f(r1, r4)     // Catch: java.lang.Exception -> L1b
            java.lang.String r4 = "Unknown"
            return r4
        L53:
            java.lang.String r4 = "No active network connection"
            cn.jiguang.commons.w.a.f(r1, r4)     // Catch: java.lang.Exception -> L1b
            return r0
        L59:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error in network info fallback: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r4)
            return r0
    }

    private static boolean a(int r5) {
            android.net.ConnectivityManager r0 = a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L52
            android.net.Network r2 = androidx.work.impl.constraints.trackers.a.a(r0)
            if (r2 != 0) goto L19
            boolean r5 = a(r0, r5)
            return r5
        L19:
            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r2)
            if (r2 != 0) goto L24
            boolean r5 = a(r0, r5)
            return r5
        L24:
            r3 = 12
            boolean r3 = r2.hasCapability(r3)
            r4 = 16
            boolean r4 = r2.hasCapability(r4)
            if (r3 == 0) goto L4d
            if (r4 != 0) goto L35
            goto L4d
        L35:
            r3 = 1
            if (r5 == 0) goto L3d
            if (r5 == r3) goto L3b
            return r3
        L3b:
            r4 = 1
            goto L3e
        L3d:
            r4 = 0
        L3e:
            boolean r2 = r2.hasTransport(r4)
            if (r2 != 0) goto L4c
            boolean r5 = a(r0, r5)
            if (r5 == 0) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            return r3
        L4d:
            boolean r5 = a(r0, r5)
            return r5
        L52:
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
            boolean r3 = c(r3)
            return r3
        L1f:
            if (r3 != r4) goto L22
            return r2
        L22:
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = ""
            java.lang.String r1 = "NetworkUtils"
            android.net.ConnectivityManager r2 = a()     // Catch: java.lang.Exception -> L10
            if (r2 != 0) goto L13
            java.lang.String r2 = "ConnectivityManager null"
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            r2 = move-exception
            goto L7e
        L13:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L10
            r4 = 23
            if (r3 < r4) goto L2e
            android.net.Network r3 = androidx.work.impl.constraints.trackers.a.a(r2)     // Catch: java.lang.Exception -> L10
            if (r3 != 0) goto L25
            java.lang.String r3 = "No active network"
        L21:
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Exception -> L10
            goto L2e
        L25:
            android.net.NetworkCapabilities r3 = r2.getNetworkCapabilities(r3)     // Catch: java.lang.Exception -> L10
            if (r3 != 0) goto L33
            java.lang.String r3 = "Network capabilities null"
            goto L21
        L2e:
            java.lang.String r0 = a(r2)     // Catch: java.lang.Exception -> L10
            return r0
        L33:
            r4 = 12
            boolean r4 = r3.hasCapability(r4)     // Catch: java.lang.Exception -> L10
            r5 = 16
            boolean r5 = r3.hasCapability(r5)     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L7b
            if (r5 != 0) goto L44
            goto L7b
        L44:
            r4 = 1
            boolean r4 = r3.hasTransport(r4)     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L4e
            java.lang.String r0 = "WiFi"
            return r0
        L4e:
            r4 = 0
            boolean r4 = r3.hasTransport(r4)     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L5a
            java.lang.String r0 = cn.jiguang.commons.L.ae.g()     // Catch: java.lang.Exception -> L10
            return r0
        L5a:
            r4 = 3
            boolean r4 = r3.hasTransport(r4)     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L64
            java.lang.String r0 = "Ethernet"
            return r0
        L64:
            r4 = 4
            boolean r4 = r3.hasTransport(r4)     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L6e
            java.lang.String r0 = "VPN"
            return r0
        L6e:
            r4 = 2
            boolean r3 = r3.hasTransport(r4)     // Catch: java.lang.Exception -> L10
            if (r3 == 0) goto L78
            java.lang.String r0 = "Bluetooth"
            return r0
        L78:
            java.lang.String r3 = "Unknown network transport"
            goto L21
        L7b:
            java.lang.String r3 = "Network not connected"
            goto L21
        L7e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error getting current network type: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.c(r1, r2)
            return r0
    }

    private static boolean c(int r1) {
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

    public static boolean d() {
            r0 = 10000(0x2710, float:1.4013E-41)
            boolean r0 = a(r0)
            return r0
    }

    public static boolean e() {
            r0 = 0
            boolean r0 = a(r0)
            return r0
    }

    public static boolean f() {
            r0 = 0
            android.net.ConnectivityManager r1 = a()     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L8
            return r0
        L8:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L35
            r3 = 23
            if (r2 < r3) goto L35
            android.net.Network r2 = androidx.work.impl.constraints.trackers.a.a(r1)     // Catch: java.lang.Throwable -> L35
            android.net.LinkProperties r1 = r1.getLinkProperties(r2)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L35
            java.util.List r1 = r1.getLinkAddresses()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L20:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            android.net.LinkAddress r2 = (android.net.LinkAddress) r2     // Catch: java.lang.Throwable -> L35
            java.net.InetAddress r2 = r2.getAddress()     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L20
            r0 = 1
        L35:
            return r0
    }

    public static boolean g() {
            r0 = 1
            boolean r0 = a(r0)
            return r0
    }
}
