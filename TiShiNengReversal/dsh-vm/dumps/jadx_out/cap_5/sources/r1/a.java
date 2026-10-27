package r1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static javax.net.ssl.HttpsURLConnection a(java.lang.String r3, android.content.Context r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            java.net.URLConnection r3 = r0.openConnection()
            boolean r0 = r3 instanceof javax.net.ssl.HttpsURLConnection
            java.lang.String r2 = "URLConnectionHelper"
            if (r0 == 0) goto L5d
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3
            javax.net.ssl.SSLSocketFactory r0 = s1.a.b(r4)     // Catch: java.lang.IllegalArgumentException -> L28
            r3.setSSLSocketFactory(r0)     // Catch: java.lang.IllegalArgumentException -> L28
            javax.net.ssl.HostnameVerifier r0 = s1.a.a()     // Catch: java.lang.IllegalArgumentException -> L28
            r3.setHostnameVerifier(r0)     // Catch: java.lang.IllegalArgumentException -> L28
            goto L2d
        L28:
            java.lang.String r0 = "init https ssl socket failed."
            com.huawei.hms.framework.common.Logger.w(r2, r0)
        L2d:
            r0 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r0)
            r3.setReadTimeout(r0)
            r0 = 1
            r3.setDoOutput(r0)
            r0 = 0
            r3.setUseCaches(r0)
            java.lang.String r0 = "NetworkKit-grs"
            java.lang.String r4 = q1.a.d(r4, r0, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "request to grs server with a User-Agent header is: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.huawei.hms.framework.common.Logger.d(r2, r5)
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
            return r3
        L5d:
            java.lang.String r3 = "urlConnection is not an instance of HttpsURLConnection"
            com.huawei.hms.framework.common.Logger.w(r2, r3)
            return r1
    }

    public static void b(javax.net.ssl.HttpsURLConnection r1, java.lang.String r2) {
            java.lang.String r0 = "URLConnectionHelper"
            if (r2 != 0) goto La
            java.lang.String r1 = "sendHttpBody: The Body Data is Null"
        L6:
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            return
        La:
            if (r1 != 0) goto Lf
            java.lang.String r1 = "sendHttpBody: HttpsURLConnection is Null"
            goto L6
        Lf:
            java.io.OutputStream r1 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Throwable -> L23
            r1.write(r2)     // Catch: java.lang.Throwable -> L23
            r1.flush()     // Catch: java.lang.Throwable -> L23
            com.huawei.hms.framework.common.IoUtils.closeSecure(r1)
            return
        L23:
            r2 = move-exception
            goto L27
        L25:
            r2 = move-exception
            r1 = 0
        L27:
            com.huawei.hms.framework.common.IoUtils.closeSecure(r1)
            throw r2
    }
}
