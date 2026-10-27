package q2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static java.lang.String a = "02:00:00:00:00:00";

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2) {
            java.lang.String r0 = c(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L13
            java.lang.String r1 = q2.a.a
            boolean r1 = r1.endsWith(r0)
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.String r2 = b(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L22
            java.lang.String r0 = q2.a.a
            r0.endsWith(r2)
        L22:
            return r2
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private static java.lang.String b(android.content.Context r3) {
            r0 = 0
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L4a
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "wifi"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Exception -> L4a
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3     // Catch: java.lang.Exception -> L4a
            if (r3 != 0) goto L15
            r1 = r0
            goto L19
        L15:
            android.net.wifi.WifiInfo r1 = r3.getConnectionInfo()     // Catch: java.lang.Exception -> L4a
        L19:
            if (r1 == 0) goto L20
            java.lang.String r1 = r1.getMacAddress()     // Catch: java.lang.Exception -> L4a
            goto L21
        L20:
            r1 = r0
        L21:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L39
            if (r2 != 0) goto L28
            goto L49
        L28:
            if (r3 == 0) goto L3b
            boolean r2 = r3.isWifiEnabled()     // Catch: java.lang.Exception -> L39
            if (r2 != 0) goto L3b
            r2 = 1
            r3.setWifiEnabled(r2)     // Catch: java.lang.Exception -> L39
            r2 = 0
            r3.setWifiEnabled(r2)     // Catch: java.lang.Exception -> L39
            goto L3b
        L39:
            r0 = r1
            goto L4a
        L3b:
            if (r3 != 0) goto L3e
            goto L42
        L3e:
            android.net.wifi.WifiInfo r0 = r3.getConnectionInfo()     // Catch: java.lang.Exception -> L39
        L42:
            if (r0 == 0) goto L49
            java.lang.String r3 = r0.getMacAddress()     // Catch: java.lang.Exception -> L39
            return r3
        L49:
            return r1
        L4a:
            return r0
    }

    @android.annotation.SuppressLint({"HardwareIds"})
    private static java.lang.String c(android.content.Context r6) {
            r0 = 0
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L72
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r1)     // Catch: java.lang.Exception -> L72
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6     // Catch: java.lang.Exception -> L72
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = "mService"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L72
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L72
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Exception -> L72
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = "getConnectionInfo"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r0)     // Catch: java.lang.Exception -> L72
            r3.setAccessible(r2)     // Catch: java.lang.Exception -> L72
            java.lang.Object r4 = r3.invoke(r1, r0)     // Catch: java.lang.Exception -> L72
            android.net.wifi.WifiInfo r4 = (android.net.wifi.WifiInfo) r4     // Catch: java.lang.Exception -> L72
            if (r4 == 0) goto L39
            goto L4d
        L39:
            boolean r5 = r6.isWifiEnabled()     // Catch: java.lang.Exception -> L72
            if (r5 != 0) goto L4d
            r6.setWifiEnabled(r2)     // Catch: java.lang.Exception -> L72
            r4 = 0
            r6.setWifiEnabled(r4)     // Catch: java.lang.Exception -> L72
            java.lang.Object r6 = r3.invoke(r1, r0)     // Catch: java.lang.Exception -> L72
            r4 = r6
            android.net.wifi.WifiInfo r4 = (android.net.wifi.WifiInfo) r4     // Catch: java.lang.Exception -> L72
        L4d:
            java.lang.Class r6 = r4.getClass()     // Catch: java.lang.Exception -> L6b
            java.lang.String r1 = "mMacAddress"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r1)     // Catch: java.lang.Exception -> L6b
            r6.setAccessible(r2)     // Catch: java.lang.Exception -> L6b
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Exception -> L6b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L6b
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L69
            if (r0 != 0) goto L67
            return r6
        L67:
            r0 = r6
            goto L6c
        L69:
            goto L67
        L6b:
        L6c:
            if (r4 == 0) goto L72
            java.lang.String r0 = r4.getMacAddress()     // Catch: java.lang.Exception -> L72
        L72:
            return r0
    }
}
