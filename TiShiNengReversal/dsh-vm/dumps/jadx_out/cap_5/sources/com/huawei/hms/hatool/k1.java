package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class k1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends java.lang.Exception {
        a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public k1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.huawei.hms.hatool.p0 a(java.lang.String r1, byte[] r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            java.lang.String r0 = "POST"
            com.huawei.hms.hatool.p0 r1 = b(r1, r2, r3, r0)
            return r1
    }

    public static com.huawei.hms.hatool.p0 b(java.lang.String r6, byte[] r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
            java.lang.String r0 = "hmsSdk"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 == 0) goto L12
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0
            r7 = -100
            r6.<init>(r7, r2)
            return r6
        L12:
            r1 = -101(0xffffffffffffff9b, float:NaN)
            r3 = 0
            r4 = -102(0xffffffffffffff9a, float:NaN)
            int r5 = r7.length     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L8a java.net.UnknownHostException -> La9 java.net.ConnectException -> Lc3 javax.net.ssl.SSLHandshakeException -> Ldd javax.net.ssl.SSLPeerUnverifiedException -> Lf7 java.lang.SecurityException -> L112 com.huawei.hms.hatool.k1.a -> L12d
            java.net.HttpURLConnection r6 = c(r6, r5, r8, r9)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L8a java.net.UnknownHostException -> La9 java.net.ConnectException -> Lc3 javax.net.ssl.SSLHandshakeException -> Ldd javax.net.ssl.SSLPeerUnverifiedException -> Lf7 java.lang.SecurityException -> L112 com.huawei.hms.hatool.k1.a -> L12d
            if (r6 != 0) goto L33
            com.huawei.hms.hatool.p0 r7 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L73 java.net.UnknownHostException -> L75 java.net.ConnectException -> L77 javax.net.ssl.SSLHandshakeException -> L79 javax.net.ssl.SSLPeerUnverifiedException -> L7c java.lang.SecurityException -> L7f com.huawei.hms.hatool.k1.a -> L82
            r7.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L73 java.net.UnknownHostException -> L75 java.net.ConnectException -> L77 javax.net.ssl.SSLHandshakeException -> L79 javax.net.ssl.SSLPeerUnverifiedException -> L7c java.lang.SecurityException -> L7f com.huawei.hms.hatool.k1.a -> L82
            com.huawei.hms.hatool.i0.c(r3)
            com.huawei.hms.hatool.i0.c(r3)
            if (r6 == 0) goto L2e
            com.huawei.hms.hatool.i0.f(r6)
        L2e:
            return r7
        L2f:
            r7 = move-exception
            r8 = r3
            goto L148
        L33:
            java.io.OutputStream r8 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L73 java.net.UnknownHostException -> L75 java.net.ConnectException -> L77 javax.net.ssl.SSLHandshakeException -> L79 javax.net.ssl.SSLPeerUnverifiedException -> L7c java.lang.SecurityException -> L7f com.huawei.hms.hatool.k1.a -> L82
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L8c java.net.UnknownHostException -> Lab java.net.ConnectException -> Lc5 javax.net.ssl.SSLHandshakeException -> Ldf javax.net.ssl.SSLPeerUnverifiedException -> Lf9 java.lang.SecurityException -> L114 com.huawei.hms.hatool.k1.a -> L12f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L8c java.net.UnknownHostException -> Lab java.net.ConnectException -> Lc5 javax.net.ssl.SSLHandshakeException -> Ldf javax.net.ssl.SSLPeerUnverifiedException -> Lf9 java.lang.SecurityException -> L114 com.huawei.hms.hatool.k1.a -> L12f
            r9.write(r7)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c java.net.UnknownHostException -> L5e java.net.ConnectException -> L61 javax.net.ssl.SSLHandshakeException -> L64 javax.net.ssl.SSLPeerUnverifiedException -> L67 java.lang.SecurityException -> L6a com.huawei.hms.hatool.k1.a -> L6d
            r9.flush()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c java.net.UnknownHostException -> L5e java.net.ConnectException -> L61 javax.net.ssl.SSLHandshakeException -> L64 javax.net.ssl.SSLPeerUnverifiedException -> L67 java.lang.SecurityException -> L6a com.huawei.hms.hatool.k1.a -> L6d
            int r4 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c java.net.UnknownHostException -> L5e java.net.ConnectException -> L61 javax.net.ssl.SSLHandshakeException -> L64 javax.net.ssl.SSLPeerUnverifiedException -> L67 java.lang.SecurityException -> L6a com.huawei.hms.hatool.k1.a -> L6d
            java.lang.String r7 = e(r6)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c java.net.UnknownHostException -> L5e java.net.ConnectException -> L61 javax.net.ssl.SSLHandshakeException -> L64 javax.net.ssl.SSLPeerUnverifiedException -> L67 java.lang.SecurityException -> L6a com.huawei.hms.hatool.k1.a -> L6d
            com.huawei.hms.hatool.p0 r3 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c java.net.UnknownHostException -> L5e java.net.ConnectException -> L61 javax.net.ssl.SSLHandshakeException -> L64 javax.net.ssl.SSLPeerUnverifiedException -> L67 java.lang.SecurityException -> L6a com.huawei.hms.hatool.k1.a -> L6d
            r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c java.net.UnknownHostException -> L5e java.net.ConnectException -> L61 javax.net.ssl.SSLHandshakeException -> L64 javax.net.ssl.SSLPeerUnverifiedException -> L67 java.lang.SecurityException -> L6a com.huawei.hms.hatool.k1.a -> L6d
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            com.huawei.hms.hatool.i0.f(r6)
            return r3
        L59:
            r7 = move-exception
            goto L149
        L5c:
            r3 = r6
            goto L8e
        L5e:
            r3 = r6
            goto Lad
        L61:
            r3 = r6
            goto Lc7
        L64:
            r3 = r6
            goto Le1
        L67:
            r3 = r6
            goto Lfc
        L6a:
            r3 = r6
            goto L117
        L6d:
            r3 = r6
            goto L132
        L70:
            r7 = move-exception
            goto L148
        L73:
            r8 = r3
            goto L8c
        L75:
            r8 = r3
            goto Lab
        L77:
            r8 = r3
            goto Lc5
        L79:
            r8 = r3
            goto Ldf
        L7c:
            r8 = r3
            goto Lf9
        L7f:
            r8 = r3
            goto L114
        L82:
            r8 = r3
            goto L12f
        L85:
            r7 = move-exception
            r6 = r3
            r8 = r6
            goto L148
        L8a:
            r6 = r3
            r8 = r6
        L8c:
            r9 = r3
            goto L5c
        L8e:
            java.lang.String r6 = "events PostRequest(byte[]): IOException occurred."
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> La4
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r3 == 0) goto La3
            com.huawei.hms.hatool.i0.f(r3)
        La3:
            return r6
        La4:
            r7 = move-exception
            r6 = r3
            r3 = r9
            goto L148
        La9:
            r6 = r3
            r8 = r6
        Lab:
            r9 = r3
            goto L5e
        Lad:
            java.lang.String r6 = "No address associated with hostname or No network"
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> La4
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r3 == 0) goto Lc2
            com.huawei.hms.hatool.i0.f(r3)
        Lc2:
            return r6
        Lc3:
            r6 = r3
            r8 = r6
        Lc5:
            r9 = r3
            goto L61
        Lc7:
            java.lang.String r6 = "Network is unreachable or Connection refused"
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> La4
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r3 == 0) goto Ldc
            com.huawei.hms.hatool.i0.f(r3)
        Ldc:
            return r6
        Ldd:
            r6 = r3
            r8 = r6
        Ldf:
            r9 = r3
            goto L64
        Le1:
            java.lang.String r6 = "Chain validation failed,Certificate expired"
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> La4
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r3 == 0) goto Lf6
            com.huawei.hms.hatool.i0.f(r3)
        Lf6:
            return r6
        Lf7:
            r6 = r3
            r8 = r6
        Lf9:
            r9 = r3
            goto L67
        Lfc:
            java.lang.String r6 = "Certificate has not been verified,Request is restricted!"
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> La4
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r3 == 0) goto L111
            com.huawei.hms.hatool.i0.f(r3)
        L111:
            return r6
        L112:
            r6 = r3
            r8 = r6
        L114:
            r9 = r3
            goto L6a
        L117:
            java.lang.String r6 = "SecurityException with HttpClient. Please check INTERNET permission."
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> La4
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r3 == 0) goto L12c
            com.huawei.hms.hatool.i0.f(r3)
        L12c:
            return r6
        L12d:
            r6 = r3
            r8 = r6
        L12f:
            r9 = r3
            goto L6d
        L132:
            java.lang.String r6 = "PostRequest(byte[]): No ssl socket factory set!"
            com.huawei.hms.hatool.j1.m(r0, r6)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.p0 r6 = new com.huawei.hms.hatool.p0     // Catch: java.lang.Throwable -> La4
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> La4
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r3 == 0) goto L147
            com.huawei.hms.hatool.i0.f(r3)
        L147:
            return r6
        L148:
            r9 = r3
        L149:
            com.huawei.hms.hatool.i0.c(r9)
            com.huawei.hms.hatool.i0.c(r8)
            if (r6 == 0) goto L154
            com.huawei.hms.hatool.i0.f(r6)
        L154:
            throw r7
    }

    private static java.net.HttpURLConnection c(java.lang.String r2, int r3, java.util.Map<java.lang.String, java.lang.String> r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            java.lang.String r2 = "hmsSdk"
            java.lang.String r3 = "CreateConnection: invalid urlPath."
            com.huawei.hms.hatool.j1.e(r2, r3)
            r2 = 0
            return r2
        Lf:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            d(r2)
            r2.setRequestMethod(r5)
            r5 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r5)
            r2.setReadTimeout(r5)
            r5 = 1
            r2.setDoOutput(r5)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json; charset=UTF-8"
            r2.setRequestProperty(r0, r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Content-Length"
            r2.setRequestProperty(r0, r3)
            java.lang.String r3 = "Connection"
            java.lang.String r0 = "close"
            r2.setRequestProperty(r3, r0)
            if (r4 == 0) goto L79
            int r3 = r4.size()
            if (r3 >= r5) goto L4c
            goto L79
        L4c:
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L54
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L6f
            goto L54
        L6f:
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r2.setRequestProperty(r5, r4)
            goto L54
        L79:
            return r2
    }

    private static void d(java.net.HttpURLConnection r2) {
            java.lang.String r0 = "hmsSdk"
            boolean r1 = r2 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L3a
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2
            android.content.Context r1 = com.huawei.hms.hatool.y0.q()     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L17 java.security.GeneralSecurityException -> L1a java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L20
            com.huawei.secure.android.common.ssl.h r0 = com.huawei.secure.android.common.ssl.h.f(r1)     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L17 java.security.GeneralSecurityException -> L1a java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L20
            goto L24
        L11:
            java.lang.String r1 = "getSocketFactory(): Illegal Access Exception "
        L13:
            com.huawei.hms.hatool.j1.m(r0, r1)
            goto L23
        L17:
            java.lang.String r1 = "getSocketFactory(): IO Exception!"
            goto L13
        L1a:
            java.lang.String r1 = "getSocketFactory(): General Security Exception"
            goto L13
        L1d:
            java.lang.String r1 = "getSocketFactory(): Key Store exception"
            goto L13
        L20:
            java.lang.String r1 = "getSocketFactory(): Algorithm Exception!"
            goto L13
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L32
            r2.setSSLSocketFactory(r0)
            e2.b r0 = new e2.b
            r0.<init>()
            r2.setHostnameVerifier(r0)
            return
        L32:
            com.huawei.hms.hatool.k1$a r2 = new com.huawei.hms.hatool.k1$a
            java.lang.String r0 = "No ssl socket factory set"
            r2.<init>(r0)
            throw r2
        L3a:
            return
    }

    private static java.lang.String e(java.net.HttpURLConnection r4) {
            r0 = 0
            java.io.InputStream r0 = r4.getInputStream()     // Catch: java.lang.Throwable -> Ld java.io.IOException -> Lf
            java.lang.String r4 = com.huawei.hms.hatool.i0.b(r0)     // Catch: java.lang.Throwable -> Ld java.io.IOException -> Lf
            com.huawei.hms.hatool.i0.c(r0)
            return r4
        Ld:
            r4 = move-exception
            goto L2f
        Lf:
            int r4 = r4.getResponseCode()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "hmsSdk"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r2.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "When Response Content From Connection inputStream operation exception! "
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            r2.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> Ld
            com.huawei.hms.hatool.j1.m(r1, r4)     // Catch: java.lang.Throwable -> Ld
            com.huawei.hms.hatool.i0.c(r0)
            java.lang.String r4 = ""
            return r4
        L2f:
            com.huawei.hms.hatool.i0.c(r0)
            throw r4
    }
}
