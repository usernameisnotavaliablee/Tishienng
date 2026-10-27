package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NetworkUtil {
    public static int NET_CNNT_BAIDU_OK = 1;
    public static int NET_CNNT_BAIDU_TIMEOUT = 2;
    public static int NET_ERROR = 4;
    public static int NET_NOT_PREPARE = 3;
    private static int TIMEOUT = 3000;

    static {
            return
    }

    public NetworkUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean connectionNetwork() {
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            java.lang.String r2 = "http://www.baidu.com"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            int r0 = cn.bluemobi.dylan.http.NetworkUtil.TIMEOUT     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r1.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r1.connect()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r1.disconnect()
            r0 = 1
            return r0
        L1b:
            r0 = move-exception
            goto L27
        L1d:
            r0 = r1
            goto L2d
        L20:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L27
        L25:
            goto L2d
        L27:
            if (r1 == 0) goto L2c
            r1.disconnect()
        L2c:
            throw r0
        L2d:
            if (r0 == 0) goto L32
            r0.disconnect()
        L32:
            r0 = 0
            return r0
    }

    public static java.lang.String getLocalIpAddress() {
            java.lang.String r0 = ""
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L31
        L6:
            boolean r2 = r1.hasMoreElements()     // Catch: java.net.SocketException -> L31
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.nextElement()     // Catch: java.net.SocketException -> L31
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.net.SocketException -> L31
            java.util.Enumeration r2 = r2.getInetAddresses()     // Catch: java.net.SocketException -> L31
        L16:
            boolean r3 = r2.hasMoreElements()     // Catch: java.net.SocketException -> L31
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.nextElement()     // Catch: java.net.SocketException -> L31
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.net.SocketException -> L31
            boolean r4 = r3.isLoopbackAddress()     // Catch: java.net.SocketException -> L31
            if (r4 != 0) goto L16
            java.lang.String r3 = r3.getHostAddress()     // Catch: java.net.SocketException -> L31
            java.lang.String r0 = r3.toString()     // Catch: java.net.SocketException -> L31
            goto L16
        L31:
            return r0
    }

    public static int getNetState(android.content.Context r1) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Exception -> L2b
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2b
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2b
            boolean r0 = r1.isAvailable()     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L28
            boolean r1 = r1.isConnected()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L28
            boolean r1 = connectionNetwork()     // Catch: java.lang.Exception -> L2b
            if (r1 != 0) goto L25
            int r1 = cn.bluemobi.dylan.http.NetworkUtil.NET_CNNT_BAIDU_TIMEOUT     // Catch: java.lang.Exception -> L2b
            return r1
        L25:
            int r1 = cn.bluemobi.dylan.http.NetworkUtil.NET_CNNT_BAIDU_OK     // Catch: java.lang.Exception -> L2b
            return r1
        L28:
            int r1 = cn.bluemobi.dylan.http.NetworkUtil.NET_NOT_PREPARE     // Catch: java.lang.Exception -> L2b
            return r1
        L2b:
            int r1 = cn.bluemobi.dylan.http.NetworkUtil.NET_ERROR
            return r1
    }

    public static boolean is2G(android.content.Context r3) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            if (r3 == 0) goto L24
            int r0 = r3.getSubtype()
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L23
            int r0 = r3.getSubtype()
            if (r0 == r2) goto L23
            int r3 = r3.getSubtype()
            r0 = 4
            if (r3 != r0) goto L24
        L23:
            return r2
        L24:
            r3 = 0
            return r3
    }

    public static boolean is3G(android.content.Context r1) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L16
            int r1 = r1.getType()
            if (r1 != 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static boolean isNetworkAvailable(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0 = 0
            if (r1 != 0) goto L14
            return r0
        L14:
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L23
            boolean r1 = r1.isAvailable()
            if (r1 != 0) goto L21
            goto L23
        L21:
            r1 = 1
            return r1
        L23:
            return r0
    }

    public static boolean isWifi(android.content.Context r1) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L16
            int r1 = r1.getType()
            r0 = 1
            if (r1 != r0) goto L16
            return r0
        L16:
            r1 = 0
            return r1
    }

    public static boolean isWifiEnabled(android.content.Context r2) {
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            if (r1 == 0) goto L22
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            android.net.NetworkInfo$State r0 = r0.getState()
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTED
            if (r0 == r1) goto L29
        L22:
            int r2 = r2.getNetworkType()
            r0 = 3
            if (r2 != r0) goto L2b
        L29:
            r2 = 1
            return r2
        L2b:
            r2 = 0
            return r2
    }
}
