package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class u2 {
    public static com.acse.ottn.u2 a;

    public u2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r5) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 != 0) goto Lf
            goto L4d
        Lf:
            int r1 = r0.getType()
            r2 = 1
            if (r1 != r2) goto L17
            return r2
        L17:
            if (r1 != 0) goto L4d
            int r0 = r0.getSubtype()
            java.lang.String r1 = "phone"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5
            r1 = 13
            r3 = 4
            if (r0 != r1) goto L31
            boolean r1 = r5.isNetworkRoaming()
            if (r1 != 0) goto L31
            return r3
        L31:
            r1 = 3
            if (r0 == r1) goto L4c
            r4 = 8
            if (r0 == r4) goto L4c
            r4 = 5
            if (r0 != r4) goto L42
            boolean r4 = r5.isNetworkRoaming()
            if (r4 != 0) goto L42
            goto L4c
        L42:
            r1 = 2
            if (r0 == r2) goto L4c
            if (r0 == r1) goto L4c
            if (r0 != r3) goto L4c
            r5.isNetworkRoaming()
        L4c:
            return r1
        L4d:
            r5 = 0
            return r5
    }

    public static com.acse.ottn.u2 a() {
            com.acse.ottn.u2 r0 = com.acse.ottn.u2.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.u2> r0 = com.acse.ottn.u2.class
            monitor-enter(r0)
            com.acse.ottn.u2 r1 = com.acse.ottn.u2.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.u2 r1 = new com.acse.ottn.u2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.u2.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.u2 r0 = com.acse.ottn.u2.a
            return r0
    }

    public static int b(android.content.Context r1) {
            if (r1 == 0) goto L1b
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L1b
            boolean r0 = r1.isAvailable()
            if (r0 == 0) goto L1b
            int r1 = r1.getType()
            return r1
        L1b:
            r1 = -1
            return r1
    }

    public static boolean e(android.content.Context r1) {
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.String r0 = "gps"
            boolean r1 = r1.isProviderEnabled(r0)
            return r1
    }

    public static boolean f(android.content.Context r1) {
            if (r1 == 0) goto L1b
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L1b
            int r0 = r1.getType()
            if (r0 != 0) goto L1b
            boolean r1 = r1.isAvailable()
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static boolean g(android.content.Context r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L15
            boolean r1 = r1.isAvailable()
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final java.lang.String a(int r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r4 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            int r2 = r4 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            int r2 = r4 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public final java.lang.String b() {
            r4 = this;
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L3f
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.net.SocketException -> L3f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.net.SocketException -> L3f
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.net.SocketException -> L3f
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()     // Catch: java.net.SocketException -> L3f
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.net.SocketException -> L3f
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch: java.net.SocketException -> L3f
            java.util.ArrayList r1 = java.util.Collections.list(r1)     // Catch: java.net.SocketException -> L3f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.net.SocketException -> L3f
        L24:
            boolean r2 = r1.hasNext()     // Catch: java.net.SocketException -> L3f
            if (r2 == 0) goto Lc
            java.lang.Object r2 = r1.next()     // Catch: java.net.SocketException -> L3f
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch: java.net.SocketException -> L3f
            boolean r3 = r2.isLoopbackAddress()     // Catch: java.net.SocketException -> L3f
            if (r3 != 0) goto L24
            boolean r3 = r2 instanceof java.net.Inet4Address     // Catch: java.net.SocketException -> L3f
            if (r3 == 0) goto L24
            java.lang.String r0 = r2.getHostAddress()     // Catch: java.net.SocketException -> L3f
            return r0
        L3f:
            java.lang.String r0 = ""
            return r0
    }

    public final java.lang.Object c() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.u2 r0 = com.acse.ottn.u2.a
            return r0
    }

    public java.lang.String c(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L31
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Exception -> L31
            r2 = 0
            android.net.NetworkInfo r2 = r1.getNetworkInfo(r2)     // Catch: java.lang.Exception -> L31
            r3 = 1
            android.net.NetworkInfo r1 = r1.getNetworkInfo(r3)     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto L24
            boolean r2 = r2.isConnected()     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto L24
            java.lang.String r5 = r4.b()     // Catch: java.lang.Exception -> L31
            return r5
        L24:
            if (r1 == 0) goto L38
            boolean r1 = r1.isConnected()     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L38
            java.lang.String r5 = r4.d(r5)     // Catch: java.lang.Exception -> L31
            return r5
        L31:
            java.lang.String r5 = "getIpAddress"
            java.lang.String r1 = "getIpAddress is null"
            com.acse.ottn.h2.a(r5, r1)
        L38:
            return r0
    }

    public final java.lang.String d(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L22
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "wifi"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Exception -> L22
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3     // Catch: java.lang.Exception -> L22
            android.net.wifi.WifiInfo r3 = r3.getConnectionInfo()     // Catch: java.lang.Exception -> L22
            int r3 = r3.getIpAddress()     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = r2.a(r3)     // Catch: java.lang.Exception -> L22
            return r3
        L22:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r1 = "WifiManager"
            com.acse.ottn.h2.a(r1, r3)
            return r0
    }
}
