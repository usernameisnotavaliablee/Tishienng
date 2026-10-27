package com.umeng.umzid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.SharedPreferences a(android.content.Context r2) {
            if (r2 == 0) goto La
            java.lang.String r0 = "umzid_general_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
        La:
            r2 = 0
            return r2
    }

    public static synchronized java.lang.String a(java.lang.String r5, java.lang.String r6) {
            java.lang.Class<com.umeng.umzid.a> r0 = com.umeng.umzid.a.class
            monitor-enter(r0)
            r1 = 0
            android.net.Uri r2 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.lang.String r2 = r2.getHost()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.net.URLConnection r5 = r3.openConnection()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            com.umeng.umzid.b r3 = new com.umeng.umzid.b     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r5.setHostnameVerifier(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.lang.String r2 = "TLS"
            javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r3.<init>()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2.init(r1, r1, r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            javax.net.ssl.SSLSocketFactory r2 = r2.getSocketFactory()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r5.setSSLSocketFactory(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/octet-stream"
            r5.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2 = 30000(0x7530, float:4.2039E-41)
            r5.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r5.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.lang.String r2 = "POST"
            r5.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2 = 1
            r5.setDoOutput(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r5.setDoInput(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.io.OutputStream r2 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r4.write(r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r4.close()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            byte[] r6 = r3.toByteArray()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r3.flush()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r3.close()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            goto L75
        L72:
            r5 = move-exception
            goto Lbe
        L74:
            r6 = r1
        L75:
            java.lang.String r3 = "7EC2papS9acZxgIb"
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            byte[] r6 = a(r6, r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2.write(r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2.flush()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2.close()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            int r6 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 != r2) goto Lc0
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r2.<init>()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
        L9d:
            int r3 = r5.read(r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r4 = -1
            if (r3 == r4) goto La9
            r4 = 0
            r2.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            goto L9d
        La9:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.lang.String r6 = "7EC2papS9acZxgIb"
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            byte[] r5 = a(r5, r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> Lc0
            monitor-exit(r0)
            return r6
        Lbe:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r5
        Lc0:
            monitor-exit(r0)
            return r1
    }

    public static byte[] a(byte[] r3, byte[] r4) {
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 == 0) goto L20
            if (r4 == 0) goto L20
            int r0 = r4.length
            if (r0 != 0) goto Lb
            goto L20
        Lb:
            r0 = 0
        Lc:
            int r1 = r3.length
            if (r0 >= r1) goto L20
            r1 = r3[r0]
            int r2 = r4.length
            int r2 = r0 % r2
            r2 = r4[r2]
            r1 = r1 ^ r2
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto Lc
        L20:
            return r3
    }
}
