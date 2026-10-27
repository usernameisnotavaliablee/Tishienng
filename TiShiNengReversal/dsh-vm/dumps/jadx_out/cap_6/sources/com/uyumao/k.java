package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements javax.net.ssl.HostnameVerifier {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
                r0 = this;
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L18
                java.lang.String r2 = "yumao.puata.info"
                boolean r2 = r2.equalsIgnoreCase(r1)
                if (r2 != 0) goto L16
                java.lang.String r2 = "preulogs.umeng.com"
                boolean r1 = r2.equalsIgnoreCase(r1)
                if (r1 == 0) goto L18
            L16:
                r1 = 1
                return r1
            L18:
                r1 = 0
                return r1
        }
    }

    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized java.lang.String a(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            java.lang.Class<com.uyumao.k> r0 = com.uyumao.k.class
            monitor-enter(r0)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.net.URLConnection r7 = r2.openConnection()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            javax.net.ssl.HttpsURLConnection r7 = (javax.net.ssl.HttpsURLConnection) r7     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            com.uyumao.k$a r2 = new com.uyumao.k$a     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r7.setHostnameVerifier(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.lang.String r2 = "TLS"
            javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r3.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2.init(r1, r1, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            javax.net.ssl.SSLSocketFactory r2 = r2.getSocketFactory()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r7.setSSLSocketFactory(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.lang.String r2 = "appkey"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r7.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/octet-stream"
            r7.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2 = 30000(0x7530, float:4.2039E-41)
            r7.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r7.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.lang.String r2 = "POST"
            r7.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2 = 1
            r7.setDoOutput(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r7.setDoInput(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r4.write(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r4.close()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            byte[] r8 = r3.toByteArray()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r3.flush()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r3.close()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            goto L76
        L73:
            r6 = move-exception
            goto Lda
        L75:
            r8 = r1
        L76:
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            byte[] r8 = a(r8, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2.write(r8)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2.flush()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2.close()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            int r8 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 != r2) goto Ldc
            java.io.InputStream r8 = r7.getInputStream()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r3.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
        La0:
            int r4 = r8.read(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r5 = -1
            if (r4 == r5) goto Lac
            r5 = 0
            r3.write(r2, r5, r4)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            goto La0
        Lac:
            java.lang.String r8 = "none"
            java.lang.String r7 = r7.getContentEncoding()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            if (r7 == 0) goto Lc2
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            byte[] r7 = r3.toByteArray()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            goto Ld8
        Lc2:
            byte[] r7 = r3.toByteArray()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            byte[] r6 = a(r7, r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> Ldc
            r6 = r7
        Ld8:
            monitor-exit(r0)
            return r6
        Lda:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r6
        Ldc:
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
