package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class NetworkUtil {
    private static final java.lang.String PROXY_HOST = "http.proxyHost";
    private static final java.lang.String PROXY_PORT = "http.proxyPort";
    private static final java.lang.String VPN_MARK_PPP = "ppp0";
    private static final java.lang.String VPN_MARK_TUN = "tun0";

    private NetworkUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getConnectType(android.content.Context r2) {
            if (r2 != 0) goto L9
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_UNKNOWN
            int r2 = r2.getCode()
            return r2
        L9:
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L28
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = xyz.adscope.common.v2.dev.info.PermissionUtil.isPermissionGranted(r2, r1)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L28
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 != 0) goto L32
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_UNKNOWN
            int r2 = r2.getCode()
            return r2
        L32:
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L40
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_WIFI
            int r2 = r2.getCode()
            return r2
        L40:
            if (r0 != 0) goto L90
            int r0 = r2.getSubtype()
            java.lang.String r2 = r2.getSubtypeName()
            switch(r0) {
                case 1: goto L89;
                case 2: goto L89;
                case 3: goto L82;
                case 4: goto L89;
                case 5: goto L82;
                case 6: goto L82;
                case 7: goto L89;
                case 8: goto L82;
                case 9: goto L82;
                case 10: goto L82;
                case 11: goto L89;
                case 12: goto L82;
                case 13: goto L7b;
                case 14: goto L82;
                case 15: goto L82;
                case 16: goto L89;
                case 17: goto L82;
                case 18: goto L7b;
                case 19: goto L4d;
                case 20: goto L74;
                default: goto L4d;
            }
        L4d:
            java.lang.String r0 = "TD-SCDMA"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L6d
            java.lang.String r0 = "WCDMA"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L6d
            java.lang.String r0 = "CDMA2000"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L66
            goto L6d
        L66:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_UNKNOWN
            int r2 = r2.getCode()
            return r2
        L6d:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_3G
            int r2 = r2.getCode()
            return r2
        L74:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_5G
            int r2 = r2.getCode()
            return r2
        L7b:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_4G
            int r2 = r2.getCode()
            return r2
        L82:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_3G
            int r2 = r2.getCode()
            return r2
        L89:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_2G
            int r2 = r2.getCode()
            return r2
        L90:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_UNKNOWN
            int r2 = r2.getCode()
            return r2
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static boolean isNetworkValid(android.content.Context r4) {
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L2f
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r4 = xyz.adscope.common.v2.dev.info.PermissionUtil.isPermissionGranted(r4, r2)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2f
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2f
            r2 = 23
            r3 = 1
            if (r4 < r2) goto L22
            android.net.Network r4 = androidx.work.impl.constraints.trackers.a.a(r1)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L21
            return r3
        L21:
            return r0
        L22:
            android.net.NetworkInfo r4 = r1.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2f
            boolean r4 = r4.isAvailable()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2f
            return r3
        L2f:
            return r0
    }

    public static boolean isProxyConnected(android.content.Context r1) {
            java.lang.String r1 = "http.proxyHost"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r0 = "http.proxyPort"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static boolean isVPNConnected() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L2e
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.net.SocketException -> L2e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.net.SocketException -> L2e
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.net.SocketException -> L2e
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()     // Catch: java.net.SocketException -> L2e
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.net.SocketException -> L2e
            java.lang.String r1 = r1.getName()     // Catch: java.net.SocketException -> L2e
            java.lang.String r2 = "tun0"
            boolean r2 = r2.equals(r1)     // Catch: java.net.SocketException -> L2e
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ppp0"
            boolean r1 = r2.equals(r1)     // Catch: java.net.SocketException -> L2e
            if (r1 == 0) goto Lc
        L2c:
            r0 = 1
            return r0
        L2e:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
        L32:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static boolean isWifiConnected(android.content.Context r4) {
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = xyz.adscope.common.v2.dev.info.PermissionUtil.isPermissionGranted(r4, r0)
            r1 = 0
            if (r0 == 0) goto L41
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r0 < r2) goto L2a
            android.net.Network r0 = androidx.work.impl.constraints.trackers.a.a(r4)
            android.net.NetworkCapabilities r4 = r4.getNetworkCapabilities(r0)
            if (r4 == 0) goto L29
            boolean r4 = r4.hasTransport(r3)
            if (r4 == 0) goto L29
            return r3
        L29:
            return r1
        L2a:
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()
            if (r4 == 0) goto L41
            java.lang.String r4 = r4.getTypeName()
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "wifi"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L41
            return r3
        L41:
            return r1
    }
}
