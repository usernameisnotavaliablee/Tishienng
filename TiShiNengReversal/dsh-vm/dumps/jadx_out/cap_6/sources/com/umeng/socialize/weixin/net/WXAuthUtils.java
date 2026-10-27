package com.umeng.socialize.weixin.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXAuthUtils {
    public WXAuthUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String convertStreamToString(java.io.InputStream r3) {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r3)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        Lf:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            if (r2 == 0) goto L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            java.lang.String r2 = "/n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L20
            goto Lf
        L1e:
            r0 = move-exception
            goto L34
        L20:
            r0 = move-exception
            goto L2b
        L22:
            r3.close()     // Catch: java.io.IOException -> L26
            goto L2f
        L26:
            r3 = move-exception
            com.umeng.socialize.utils.SLog.error(r3)
            goto L2f
        L2b:
            com.umeng.socialize.utils.SLog.error(r0)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L2f:
            java.lang.String r3 = r1.toString()
            return r3
        L34:
            r3.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r3 = move-exception
            com.umeng.socialize.utils.SLog.error(r3)
        L3c:
            throw r0
    }

    public static java.lang.String request(java.lang.String r2) {
            java.lang.String r0 = ""
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L1d
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1d
            java.net.URLConnection r2 = r1.openConnection()     // Catch: java.lang.Exception -> L1d
            if (r2 != 0) goto Le
            goto L17
        Le:
            r2.connect()     // Catch: java.lang.Exception -> L1d
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L1d
            if (r2 != 0) goto L18
        L17:
            return r0
        L18:
            java.lang.String r2 = convertStreamToString(r2)     // Catch: java.lang.Exception -> L1d
            return r2
        L1d:
            r2 = move-exception
            com.umeng.socialize.utils.SLog.error(r2)
            return r0
    }
}
