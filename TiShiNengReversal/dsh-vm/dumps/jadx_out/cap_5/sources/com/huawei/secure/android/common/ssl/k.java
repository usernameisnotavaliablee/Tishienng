package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k implements javax.net.ssl.X509TrustManager {
    private static final java.lang.String c = "SX509TM";
    public static final java.lang.String d = "hmsrootcas.bks";
    private static final java.lang.String e = "";
    private static final java.lang.String f = "X509";
    private static final java.lang.String g = "bks";
    private static final java.lang.String h = "AndroidCAStore";
    protected java.util.List<javax.net.ssl.X509TrustManager> a;
    private java.security.cert.X509Certificate[] b;

    public k(android.content.Context r2) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalArgumentException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public k(android.content.Context r2, boolean r3) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalArgumentException {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            if (r2 == 0) goto L28
            com.huawei.secure.android.common.ssl.util.c.b(r2)
            if (r3 == 0) goto L14
            r1.a()
        L14:
            r1.b(r2)
            java.util.List<javax.net.ssl.X509TrustManager> r2 = r1.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L20
            return
        L20:
            java.security.cert.CertificateException r2 = new java.security.cert.CertificateException
            java.lang.String r3 = "X509TrustManager is empty"
            r2.<init>(r3)
            throw r2
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "context is null"
            r2.<init>(r3)
            throw r2
    }

    public k(java.io.InputStream r2, java.lang.String r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r1.d(r2, r3)
            return
    }

    public k(java.io.InputStream r2, java.lang.String r3, boolean r4) throws java.lang.IllegalArgumentException {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            if (r4 == 0) goto Lf
            r1.a()
        Lf:
            r1.d(r2, r3)
            return
    }

    public k(java.lang.String r2) throws java.lang.IllegalArgumentException, java.io.FileNotFoundException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public k(java.lang.String r2, boolean r3) throws java.lang.IllegalArgumentException, java.io.FileNotFoundException {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = ""
            r1.d(r0, r2)     // Catch: java.lang.Throwable -> L1d
            com.huawei.secure.android.common.ssl.util.g.g(r0)
            if (r3 == 0) goto L1c
            r1.a()
        L1c:
            return
        L1d:
            r2 = move-exception
            goto L21
        L1f:
            r2 = move-exception
            r0 = 0
        L21:
            com.huawei.secure.android.common.ssl.util.g.g(r0)
            throw r2
    }

    private void a() {
            r7 = this;
            java.lang.String r0 = "loadSystemCA"
            java.lang.String r1 = "SX509TM"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "AndroidCAStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            r4 = 0
            r0.load(r4, r4)     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            java.lang.String r4 = "X509"
            javax.net.ssl.TrustManagerFactory r4 = javax.net.ssl.TrustManagerFactory.getInstance(r4)     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            r4.init(r0)     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            javax.net.ssl.TrustManager[] r0 = r4.getTrustManagers()     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            r4 = 0
        L23:
            int r5 = r0.length     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            if (r4 >= r5) goto L5b
            r5 = r0[r4]     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            boolean r6 = r5 instanceof javax.net.ssl.X509TrustManager     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            if (r6 == 0) goto L40
            java.util.List<javax.net.ssl.X509TrustManager> r6 = r7.a     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            javax.net.ssl.X509TrustManager r5 = (javax.net.ssl.X509TrustManager) r5     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            r6.add(r5)     // Catch: java.security.NoSuchAlgorithmException -> L34 java.io.IOException -> L36 java.security.cert.CertificateException -> L38 java.security.KeyStoreException -> L3a java.lang.NegativeArraySizeException -> L3c java.lang.OutOfMemoryError -> L3e
            goto L40
        L34:
            r0 = move-exception
            goto L43
        L36:
            r0 = move-exception
            goto L43
        L38:
            r0 = move-exception
            goto L43
        L3a:
            r0 = move-exception
            goto L43
        L3c:
            r0 = move-exception
            goto L43
        L3e:
            r0 = move-exception
            goto L43
        L40:
            int r4 = r4 + 1
            goto L23
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadSystemCA: exception : "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r1, r0)
        L5b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "loadSystemCA: cost : "
            r0.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r0.append(r4)
            java.lang.String r2 = " ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r1, r0)
            return
    }

    private void b(android.content.Context r7) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException {
            r6 = this;
            java.lang.String r0 = "loadBksCA"
            java.lang.String r1 = "SX509TM"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.io.InputStream r0 = com.huawei.secure.android.common.ssl.util.a.o(r7)
            if (r0 == 0) goto L3c
            java.lang.String r4 = "get bks not from assets"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r4)     // Catch: java.io.IOException -> L1a java.security.cert.CertificateException -> L1c java.security.KeyStoreException -> L1e java.security.NoSuchAlgorithmException -> L20 java.lang.OutOfMemoryError -> L22
            r6.c(r0)     // Catch: java.io.IOException -> L1a java.security.cert.CertificateException -> L1c java.security.KeyStoreException -> L1e java.security.NoSuchAlgorithmException -> L20 java.lang.OutOfMemoryError -> L22
            goto L3c
        L1a:
            r0 = move-exception
            goto L23
        L1c:
            r0 = move-exception
            goto L23
        L1e:
            r0 = move-exception
            goto L23
        L20:
            r0 = move-exception
            goto L23
        L22:
            r0 = move-exception
        L23:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadBksCA: exception : "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r1, r0)
            goto L3e
        L3c:
            if (r0 != 0) goto L50
        L3e:
            java.lang.String r0 = " get bks from assets "
            com.huawei.secure.android.common.ssl.util.h.e(r1, r0)
            android.content.res.AssetManager r7 = r7.getAssets()
            java.lang.String r0 = "hmsrootcas.bks"
            java.io.InputStream r7 = r7.open(r0)
            r6.c(r7)
        L50:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "loadBksCA: cost : "
            r7.append(r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r7.append(r4)
            java.lang.String r0 = " ms"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r1, r7)
            return
    }

    private void c(java.io.InputStream r5) throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.cert.CertificateException, java.io.IOException {
            r4 = this;
            java.lang.String r0 = "X509"
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "bks"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = ""
            char[] r2 = r2.toCharArray()     // Catch: java.lang.Throwable -> L2e
            r1.load(r5, r2)     // Catch: java.lang.Throwable -> L2e
            r0.init(r1)     // Catch: java.lang.Throwable -> L2e
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()     // Catch: java.lang.Throwable -> L2e
            r1 = 0
        L1d:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2e
            if (r1 >= r2) goto L33
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.util.List<javax.net.ssl.X509TrustManager> r3 = r4.a     // Catch: java.lang.Throwable -> L2e
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2     // Catch: java.lang.Throwable -> L2e
            r3.add(r2)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L37
        L30:
            int r1 = r1 + 1
            goto L1d
        L33:
            com.huawei.secure.android.common.ssl.util.g.g(r5)
            return
        L37:
            com.huawei.secure.android.common.ssl.util.g.g(r5)
            throw r0
    }

    private void d(java.io.InputStream r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "SX509TM"
            if (r7 == 0) goto L89
            if (r8 == 0) goto L89
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "X509"
            javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r3)     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            java.lang.String r4 = "bks"
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            char[] r8 = r8.toCharArray()     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            r4.load(r7, r8)     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            r3.init(r4)     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            javax.net.ssl.TrustManager[] r8 = r3.getTrustManagers()     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            r3 = 0
        L25:
            int r4 = r8.length     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            if (r3 >= r4) goto L47
            r4 = r8[r3]     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            boolean r5 = r4 instanceof javax.net.ssl.X509TrustManager     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            if (r5 == 0) goto L44
            java.util.List<javax.net.ssl.X509TrustManager> r5 = r6.a     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            r5.add(r4)     // Catch: java.lang.Throwable -> L36 java.security.NoSuchAlgorithmException -> L38 java.io.IOException -> L3a java.security.cert.CertificateException -> L3c java.security.KeyStoreException -> L3e java.lang.NegativeArraySizeException -> L40 java.lang.OutOfMemoryError -> L42
            goto L44
        L36:
            r8 = move-exception
            goto L85
        L38:
            r8 = move-exception
            goto L4b
        L3a:
            r8 = move-exception
            goto L4b
        L3c:
            r8 = move-exception
            goto L4b
        L3e:
            r8 = move-exception
            goto L4b
        L40:
            r8 = move-exception
            goto L4b
        L42:
            r8 = move-exception
            goto L4b
        L44:
            int r3 = r3 + 1
            goto L25
        L47:
            com.huawei.secure.android.common.ssl.util.g.g(r7)
            goto L66
        L4b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "loadInputStream: exception : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L36
            r3.append(r8)     // Catch: java.lang.Throwable -> L36
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L36
            com.huawei.secure.android.common.ssl.util.h.d(r0, r8)     // Catch: java.lang.Throwable -> L36
            com.huawei.secure.android.common.ssl.util.g.g(r7)
        L66:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "loadInputStream: cost : "
            r7.append(r8)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r7.append(r3)
            java.lang.String r8 = " ms"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r0, r7)
            return
        L85:
            com.huawei.secure.android.common.ssl.util.g.g(r7)
            throw r8
        L89:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "inputstream or trustPwd is null"
            r7.<init>(r8)
            throw r7
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r6, java.lang.String r7) throws java.security.cert.CertificateException {
            r5 = this;
            java.lang.String r0 = "checkClientTrusted: "
            java.lang.String r1 = "SX509TM"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r0)
            java.util.List<javax.net.ssl.X509TrustManager> r0 = r5.a
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "checkServerTrusted CertificateException"
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            r2.checkServerTrusted(r6, r7)     // Catch: java.security.cert.CertificateException -> L1f
            return
        L1f:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r1, r2)
            goto Ld
        L37:
            java.security.cert.CertificateException r6 = new java.security.cert.CertificateException
            r6.<init>(r3)
            throw r6
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r12, java.lang.String r13) throws java.security.cert.CertificateException {
            r11 = this;
            r11.g(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkServerTrusted begin,size="
            r0.append(r1)
            int r1 = r12.length
            r0.append(r1)
            java.lang.String r1 = ",authType="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SX509TM"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = r12.length
            r4 = 0
            r5 = 0
        L29:
            if (r5 >= r0) goto L78
            r6 = r12[r5]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "server ca chain: getSubjectDN is :"
            r7.append(r8)
            java.security.Principal r8 = r6.getSubjectDN()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "IssuerDN :"
            r7.append(r8)
            java.security.Principal r8 = r6.getIssuerDN()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "SerialNumber : "
            r7.append(r8)
            java.math.BigInteger r6 = r6.getSerialNumber()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r1, r6)
            int r5 = r5 + 1
            goto L29
        L78:
            java.util.List<javax.net.ssl.X509TrustManager> r0 = r11.a
            int r0 = r0.size()
            r5 = 0
        L7f:
            if (r5 >= r0) goto L145
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.security.cert.CertificateException -> Ld9
            r6.<init>()     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r7 = "check server i="
            r6.append(r7)     // Catch: java.security.cert.CertificateException -> Ld9
            r6.append(r5)     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.security.cert.CertificateException -> Ld9
            com.huawei.secure.android.common.ssl.util.h.e(r1, r6)     // Catch: java.security.cert.CertificateException -> Ld9
            java.util.List<javax.net.ssl.X509TrustManager> r6 = r11.a     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.Object r6 = r6.get(r5)     // Catch: java.security.cert.CertificateException -> Ld9
            javax.net.ssl.X509TrustManager r6 = (javax.net.ssl.X509TrustManager) r6     // Catch: java.security.cert.CertificateException -> Ld9
            java.security.cert.X509Certificate[] r7 = r6.getAcceptedIssuers()     // Catch: java.security.cert.CertificateException -> Ld9
            if (r7 == 0) goto Ldb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.security.cert.CertificateException -> Ld9
            r8.<init>()     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r9 = "client root ca size="
            r8.append(r9)     // Catch: java.security.cert.CertificateException -> Ld9
            int r9 = r7.length     // Catch: java.security.cert.CertificateException -> Ld9
            r8.append(r9)     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r8 = r8.toString()     // Catch: java.security.cert.CertificateException -> Ld9
            com.huawei.secure.android.common.ssl.util.h.e(r1, r8)     // Catch: java.security.cert.CertificateException -> Ld9
            r8 = 0
        Lb9:
            int r9 = r7.length     // Catch: java.security.cert.CertificateException -> Ld9
            if (r8 >= r9) goto Ldb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.security.cert.CertificateException -> Ld9
            r9.<init>()     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r10 = "client root ca getIssuerDN :"
            r9.append(r10)     // Catch: java.security.cert.CertificateException -> Ld9
            r10 = r7[r8]     // Catch: java.security.cert.CertificateException -> Ld9
            java.security.Principal r10 = r10.getIssuerDN()     // Catch: java.security.cert.CertificateException -> Ld9
            r9.append(r10)     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r9 = r9.toString()     // Catch: java.security.cert.CertificateException -> Ld9
            com.huawei.secure.android.common.ssl.util.h.b(r1, r9)     // Catch: java.security.cert.CertificateException -> Ld9
            int r8 = r8 + 1
            goto Lb9
        Ld9:
            r6 = move-exception
            goto Lfc
        Ldb:
            r6.checkServerTrusted(r12, r13)     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.security.cert.CertificateException -> Ld9
            r6.<init>()     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r7 = "checkServerTrusted end, "
            r6.append(r7)     // Catch: java.security.cert.CertificateException -> Ld9
            int r7 = r12.length     // Catch: java.security.cert.CertificateException -> Ld9
            int r7 = r7 + (-1)
            r7 = r12[r7]     // Catch: java.security.cert.CertificateException -> Ld9
            java.security.Principal r7 = r7.getIssuerDN()     // Catch: java.security.cert.CertificateException -> Ld9
            r6.append(r7)     // Catch: java.security.cert.CertificateException -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.security.cert.CertificateException -> Ld9
            com.huawei.secure.android.common.ssl.util.h.e(r1, r6)     // Catch: java.security.cert.CertificateException -> Ld9
            return
        Lfc:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkServerTrusted error :"
            r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            r7.append(r8)
            java.lang.String r8 = " , time : "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r1, r7)
            int r7 = r0 + (-1)
            if (r5 != r7) goto L141
            int r13 = r12.length
            if (r13 <= 0) goto L140
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "root ca issuer : "
            r13.append(r0)
            int r0 = r12.length
            int r0 = r0 + (-1)
            r12 = r12[r0]
            java.security.Principal r12 = r12.getIssuerDN()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r1, r12)
        L140:
            throw r6
        L141:
            int r5 = r5 + 1
            goto L7f
        L145:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "checkServerTrusted: cost : "
            r12.append(r13)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r12.append(r4)
            java.lang.String r13 = " ms"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r1, r12)
            return
    }

    public java.security.cert.X509Certificate[] e() {
            r1 = this;
            java.security.cert.X509Certificate[] r0 = r1.b
            return r0
    }

    public java.util.List<javax.net.ssl.X509TrustManager> f() {
            r1 = this;
            java.util.List<javax.net.ssl.X509TrustManager> r0 = r1.a
            return r0
    }

    public void g(java.security.cert.X509Certificate[] r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L23
            r0.<init>()     // Catch: java.lang.Exception -> L23
            java.util.List<javax.net.ssl.X509TrustManager> r1 = r3.a     // Catch: java.lang.Exception -> L23
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
            java.lang.String r1 = "SX509TM"
            com.huawei.secure.android.common.ssl.util.h.d(r1, r0)
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            return r0
    }

    public void h(java.util.List<javax.net.ssl.X509TrustManager> r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
