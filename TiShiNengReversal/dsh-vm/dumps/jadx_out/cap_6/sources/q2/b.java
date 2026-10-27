package q2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.app.Application r6) {
            java.lang.String r0 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6
            r0 = 0
            if (r6 == 0) goto L3f
            java.util.List r1 = r6.getScanResults()
            android.net.wifi.WifiInfo r6 = r6.getConnectionInfo()
            if (r1 == 0) goto L3f
            if (r6 == 0) goto L3f
            r2 = 0
        L18:
            int r3 = r1.size()
            if (r2 >= r3) goto L3f
            java.lang.Object r3 = r1.get(r2)
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
            java.lang.String r4 = r6.getBSSID()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3c
            java.lang.String r4 = r6.getBSSID()
            java.lang.String r5 = r3.BSSID
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L3c
            java.lang.String r0 = r3.BSSID
        L3c:
            int r2 = r2 + 1
            goto L18
        L3f:
            return r0
    }

    public static java.lang.String b(android.content.Context r2) {
            java.lang.String r0 = d()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = c(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            return r0
        L16:
            java.lang.String r2 = q2.a.a(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L21
            return r2
        L21:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String c(android.content.Context r6) {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.nextElement()
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1
            r2 = 0
            byte[] r3 = new byte[r2]
            byte[] r3 = r1.getHardwareAddress()     // Catch: java.net.SocketException -> L1a
            goto L1b
        L1a:
        L1b:
            java.lang.String r1 = r1.getDisplayName()
            java.lang.String r4 = "wifi.interface"
            java.lang.String r4 = e(r6, r4)
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L6
            if (r3 == 0) goto L6
            int r1 = r3.length
            if (r1 != 0) goto L31
            goto L6
        L31:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r0 = r3.length
            r1 = 0
        L38:
            r4 = 1
            if (r1 >= r0) goto L51
            r5 = r3[r1]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r5
            java.lang.String r5 = "%02X:"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r6.append(r4)
            int r1 = r1 + 1
            goto L38
        L51:
            int r0 = r6.length()
            if (r0 <= 0) goto L5f
            int r0 = r6.length()
            int r0 = r0 - r4
            r6.deleteCharAt(r0)
        L5f:
            java.lang.String r6 = r6.toString()
            return r6
        L64:
            java.lang.String r6 = ""
            return r6
    }

    public static java.lang.String d() {
            java.lang.String r0 = "cat /sys/class/net/wlan0/address"
            r1 = 0
            com.snail.antifake.deviceid.e$a r0 = com.snail.antifake.deviceid.e.b(r0, r1)
            java.lang.String r0 = r0.b
            return r0
    }

    private static java.lang.String e(android.content.Context r5, java.lang.String r6) {
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r5 = r5.loadClass(r0)     // Catch: java.lang.Exception -> L26
            java.lang.String r0 = "native_get"
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L26
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L26
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r0, r2)     // Catch: java.lang.Exception -> L26
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L26
            r2[r4] = r6     // Catch: java.lang.Exception -> L26
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L26
            java.lang.Object r5 = r0.invoke(r5, r2)     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L26
            return r5
        L26:
            r5 = 0
            return r5
    }
}
