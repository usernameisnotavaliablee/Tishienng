package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o implements javax.net.ssl.X509TrustManager {
    private static final java.lang.String c = "WebViewX509TrustManger";
    private java.security.cert.X509Certificate a;
    private java.util.List<javax.net.ssl.X509TrustManager> b;

    public o(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            if (r2 == 0) goto L25
            com.huawei.secure.android.common.ssl.util.c.b(r2)
            com.huawei.secure.android.common.ssl.util.k r0 = new com.huawei.secure.android.common.ssl.util.k
            r0.<init>(r2)
            java.security.cert.X509Certificate r2 = r0.c()
            r1.a = r2
            if (r2 == 0) goto L1d
            return
        L1d:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "WebViewX509TrustManger cannot get cbg root ca"
            r2.<init>(r0)
            throw r2
        L25:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "WebViewX509TrustManger context is null"
            r2.<init>(r0)
            throw r2
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r3, java.lang.String r4) throws java.security.cert.CertificateException {
            r2 = this;
            java.lang.String r0 = "WebViewX509TrustManger"
            java.lang.String r1 = "checkClientTrusted"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            java.util.List<javax.net.ssl.X509TrustManager> r0 = r2.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c
            java.util.List<javax.net.ssl.X509TrustManager> r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            r0.checkClientTrusted(r3, r4)
            return
        L1c:
            java.security.cert.CertificateException r3 = new java.security.cert.CertificateException
            java.lang.String r4 = "checkClientTrusted CertificateException"
            r3.<init>(r4)
            throw r3
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r5, java.lang.String r6) throws java.security.cert.CertificateException {
            r4 = this;
            java.lang.String r6 = "checkServerTrusted"
            java.lang.String r0 = "WebViewX509TrustManger"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r6)
            r6 = 0
            r1 = 0
        L9:
            int r2 = r5.length
            if (r1 >= r2) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkServerTrusted "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " : "
            r2.append(r3)
            r3 = r5[r1]
            java.security.Principal r3 = r3.getIssuerDN()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r0, r2)
            int r1 = r1 + 1
            goto L9
        L35:
            int r1 = r5.length
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r1]
            r2 = 0
        L39:
            int r3 = r5.length
            if (r2 >= r3) goto L47
            int r3 = r5.length
            int r3 = r3 + (-1)
            int r3 = r3 - r2
            r3 = r5[r3]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L39
        L47:
            java.security.cert.CertificateException r5 = new java.security.cert.CertificateException
            java.lang.String r2 = "CBG root CA CertificateException"
            r5.<init>(r2)
            java.security.cert.X509Certificate r2 = r4.a     // Catch: java.security.cert.CertificateException -> L56 java.security.SignatureException -> L58 java.security.InvalidKeyException -> L5a java.security.NoSuchAlgorithmException -> L5c java.security.NoSuchProviderException -> L5e
            boolean r6 = com.huawei.secure.android.common.ssl.util.e.f(r2, r1)     // Catch: java.security.cert.CertificateException -> L56 java.security.SignatureException -> L58 java.security.InvalidKeyException -> L5a java.security.NoSuchAlgorithmException -> L5c java.security.NoSuchProviderException -> L5e
            goto Ldc
        L56:
            r5 = move-exception
            goto L60
        L58:
            r1 = move-exception
            goto L79
        L5a:
            r1 = move-exception
            goto L92
        L5c:
            r1 = move-exception
            goto Lab
        L5e:
            r1 = move-exception
            goto Lc4
        L60:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkServerTrusted CertificateException: "
            r1.append(r2)
            java.lang.String r2 = r5.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r0, r1)
            goto Ldc
        L79:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkServerTrusted SignatureException: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r0, r1)
            goto Ldc
        L92:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkServerTrusted InvalidKeyException: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r0, r1)
            goto Ldc
        Lab:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkServerTrusted NoSuchAlgorithmException: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r0, r1)
            goto Ldc
        Lc4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkServerTrusted NoSuchProviderException: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r0, r1)
        Ldc:
            if (r6 == 0) goto Ldf
            return
        Ldf:
            throw r5
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L23
            r0.<init>()     // Catch: java.lang.Exception -> L23
            java.util.List<javax.net.ssl.X509TrustManager> r1 = r3.b     // Catch: java.lang.Exception -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L23
        Lb:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L23
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2     // Catch: java.lang.Exception -> L23
            java.security.cert.X509Certificate[] r2 = r2.getAcceptedIssuers()     // Catch: java.lang.Exception -> L23
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Exception -> L23
            r0.addAll(r2)     // Catch: java.lang.Exception -> L23
            goto Lb
        L23:
            r0 = move-exception
            goto L32
        L25:
            int r1 = r0.size()     // Catch: java.lang.Exception -> L23
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r1]     // Catch: java.lang.Exception -> L23
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Exception -> L23
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0     // Catch: java.lang.Exception -> L23
            return r0
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getAcceptedIssuers exception : "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "WebViewX509TrustManger"
            com.huawei.secure.android.common.ssl.util.h.d(r1, r0)
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            return r0
    }
}
