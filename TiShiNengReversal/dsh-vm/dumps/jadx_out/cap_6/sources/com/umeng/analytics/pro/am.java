package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class am {
    private static javax.net.ssl.HostnameVerifier a;


    static {
            return
    }

    public am() {
            r0 = this;
            r0.<init>()
            return
    }

    private static javax.net.ssl.HostnameVerifier a() {
            javax.net.ssl.HostnameVerifier r0 = com.umeng.analytics.pro.am.a
            if (r0 != 0) goto Lb
            com.umeng.analytics.pro.am$1 r0 = new com.umeng.analytics.pro.am$1
            r0.<init>()
            com.umeng.analytics.pro.am.a = r0
        Lb:
            javax.net.ssl.HostnameVerifier r0 = com.umeng.analytics.pro.am.a
            return r0
    }

    private static javax.net.ssl.HttpsURLConnection a(java.lang.String r3, java.lang.String r4, byte[] r5) {
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L63
            r1.<init>(r3)     // Catch: java.lang.Exception -> L63
            java.net.URLConnection r3 = r1.openConnection()     // Catch: java.lang.Exception -> L63
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Exception -> L62
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L62
            r2.<init>()     // Catch: java.lang.Exception -> L62
            r1.init(r0, r0, r2)     // Catch: java.lang.Exception -> L62
            javax.net.ssl.SSLSocketFactory r0 = r1.getSocketFactory()     // Catch: java.lang.Exception -> L62
            r3.setSSLSocketFactory(r0)     // Catch: java.lang.Exception -> L62
            javax.net.ssl.HostnameVerifier r0 = a()     // Catch: java.lang.Exception -> L62
            r3.setHostnameVerifier(r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "POST"
            r3.setRequestMethod(r0)     // Catch: java.lang.Exception -> L62
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)     // Catch: java.lang.Exception -> L62
            r1 = 1
            r3.setDoOutput(r1)     // Catch: java.lang.Exception -> L62
            r3.setDoInput(r1)     // Catch: java.lang.Exception -> L62
            r3.setReadTimeout(r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/octet-stream"
            r3.addRequestProperty(r0, r1)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Exception -> L62
            r3.addRequestProperty(r4, r0)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = "User-Agent"
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getCustomAgt()     // Catch: java.lang.Exception -> L62
            r3.setRequestProperty(r4, r0)     // Catch: java.lang.Exception -> L62
            r3.connect()     // Catch: java.lang.Exception -> L62
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch: java.lang.Exception -> L62
            r4.write(r5)     // Catch: java.lang.Exception -> L62
            r4.flush()     // Catch: java.lang.Exception -> L62
            r4.close()     // Catch: java.lang.Exception -> L62
            return r3
        L62:
            r0 = r3
        L63:
            return r0
    }

    public static byte[] a(java.lang.String r0, java.lang.String r1) {
            byte[] r1 = r1.getBytes()
            byte[] r0 = a(r0, r1)
            return r0
    }

    public static byte[] a(java.lang.String r3, byte[] r4) {
            java.lang.String r0 = "ak"
            r1 = 0
            java.lang.String r2 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L49
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L49
            byte[] r4 = com.umeng.analytics.pro.at.a(r4, r2)     // Catch: java.lang.Throwable -> L49
            javax.net.ssl.HttpsURLConnection r3 = a(r3, r0, r4)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L49
            int r4 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L49
            r2 = 200(0xc8, float:2.8E-43)
            if (r4 != r2) goto L49
            java.io.InputStream r4 = r3.getInputStream()     // Catch: java.lang.Throwable -> L49
            byte[] r2 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.getHeaderField(r0)     // Catch: java.lang.Throwable -> L36
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L39
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L36
            byte[] r1 = com.umeng.analytics.pro.at.a(r2, r3)     // Catch: java.lang.Throwable -> L36
            goto L40
        L36:
            r3 = move-exception
            r1 = r2
            goto L45
        L39:
            java.lang.String r3 = "MobclickRT"
            java.lang.String r0 = "ccg 应答不包含ak!"
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r0)     // Catch: java.lang.Throwable -> L36
        L40:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r4)     // Catch: java.lang.Throwable -> L49
            return r1
        L44:
            r3 = move-exception
        L45:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r4)     // Catch: java.lang.Throwable -> L49
            throw r3     // Catch: java.lang.Throwable -> L49
        L49:
            return r1
    }

    public static void b(java.lang.String r2, byte[] r3) {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L32
            com.umeng.analytics.pro.at.a(r3, r1)     // Catch: java.lang.Throwable -> L18
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L18
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L18
            byte[] r3 = com.umeng.analytics.pro.at.a(r3, r1)     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r3 = r0
        L19:
            java.lang.String r1 = "appkey"
            javax.net.ssl.HttpsURLConnection r0 = a(r2, r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L34
            int r2 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L32
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L2a
            goto L34
        L2a:
            java.lang.String r2 = "MobclickRT"
            java.lang.String r3 = "SC event report successful."
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r3)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            goto L3a
        L34:
            if (r0 == 0) goto L3d
        L36:
            r0.disconnect()     // Catch: java.lang.Throwable -> L3d
            goto L3d
        L3a:
            if (r0 == 0) goto L3d
            goto L36
        L3d:
            return
    }
}
