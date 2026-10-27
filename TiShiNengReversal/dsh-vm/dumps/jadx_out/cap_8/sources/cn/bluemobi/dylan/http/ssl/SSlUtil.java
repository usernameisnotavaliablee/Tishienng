package cn.bluemobi.dylan.http.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SSlUtil {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MyTrustManager implements javax.net.ssl.X509TrustManager {
        private javax.net.ssl.X509TrustManager defaultTrustManager;
        private javax.net.ssl.X509TrustManager localTrustManager;

        public MyTrustManager(javax.net.ssl.X509TrustManager r3) throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
                javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
                r1 = 0
                r0.init(r1)
                javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
                javax.net.ssl.X509TrustManager r0 = cn.bluemobi.dylan.http.ssl.SSlUtil.access$000(r0)
                r2.defaultTrustManager = r0
                r2.localTrustManager = r3
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) throws java.security.cert.CertificateException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.security.cert.CertificateException {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.defaultTrustManager     // Catch: java.security.cert.CertificateException -> L6
                r0.checkServerTrusted(r2, r3)     // Catch: java.security.cert.CertificateException -> L6
                return
            L6:
                javax.net.ssl.X509TrustManager r0 = r1.localTrustManager
                r0.checkServerTrusted(r2, r3)
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                r0 = 0
                java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SSLParams {
        public javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        public javax.net.ssl.X509TrustManager trustManager;

        public SSLParams() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class UnSafeHostnameVerifier implements javax.net.ssl.HostnameVerifier {
        final /* synthetic */ cn.bluemobi.dylan.http.ssl.SSlUtil this$0;

        private UnSafeHostnameVerifier(cn.bluemobi.dylan.http.ssl.SSlUtil r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class UnSafeTrustManager implements javax.net.ssl.X509TrustManager {
        public UnSafeTrustManager() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) throws java.security.cert.CertificateException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) throws java.security.cert.CertificateException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                r0 = 0
                java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
                return r0
        }
    }

    public SSlUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ javax.net.ssl.X509TrustManager access$000(javax.net.ssl.TrustManager[] r0) {
            javax.net.ssl.X509TrustManager r0 = chooseTrustManager(r0)
            return r0
    }

    private static javax.net.ssl.X509TrustManager chooseTrustManager(javax.net.ssl.TrustManager[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager
            if (r3 == 0) goto Ld
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r4 = 0
            return r4
    }

    public static cn.bluemobi.dylan.http.ssl.SSlUtil.SSLParams getSslSocketFactory(java.io.InputStream[] r3, java.io.InputStream r4, java.lang.String r5) {
            cn.bluemobi.dylan.http.ssl.SSlUtil$SSLParams r0 = new cn.bluemobi.dylan.http.ssl.SSlUtil$SSLParams
            r0.<init>()
            javax.net.ssl.TrustManager[] r3 = prepareTrustManager(r3)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            javax.net.ssl.KeyManager[] r4 = prepareKeyManager(r4, r5)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            if (r3 == 0) goto L1f
            cn.bluemobi.dylan.http.ssl.SSlUtil$MyTrustManager r1 = new cn.bluemobi.dylan.http.ssl.SSlUtil$MyTrustManager     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            javax.net.ssl.X509TrustManager r3 = chooseTrustManager(r3)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r1.<init>(r3)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            goto L24
        L1f:
            cn.bluemobi.dylan.http.ssl.SSlUtil$UnSafeTrustManager r1 = new cn.bluemobi.dylan.http.ssl.SSlUtil$UnSafeTrustManager     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r1.<init>()     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
        L24:
            r3 = 1
            javax.net.ssl.TrustManager[] r3 = new javax.net.ssl.TrustManager[r3]     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r2 = 0
            r3[r2] = r1     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r2 = 0
            r5.init(r4, r3, r2)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            javax.net.ssl.SSLSocketFactory r3 = r5.getSocketFactory()     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r0.sSLSocketFactory = r3     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r0.trustManager = r1     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            return r0
        L37:
            r3 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
        L3e:
            r3 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
        L45:
            r3 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
    }

    private static javax.net.ssl.KeyManager[] prepareKeyManager(java.io.InputStream r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L27
            if (r4 != 0) goto L6
            goto L27
        L6:
            java.lang.String r1 = "BKS"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Throwable -> L27
            char[] r2 = r4.toCharArray()     // Catch: java.lang.Throwable -> L27
            r1.load(r3, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Throwable -> L27
            javax.net.ssl.KeyManagerFactory r3 = javax.net.ssl.KeyManagerFactory.getInstance(r3)     // Catch: java.lang.Throwable -> L27
            char[] r4 = r4.toCharArray()     // Catch: java.lang.Throwable -> L27
            r3.init(r1, r4)     // Catch: java.lang.Throwable -> L27
            javax.net.ssl.KeyManager[] r3 = r3.getKeyManagers()     // Catch: java.lang.Throwable -> L27
            return r3
        L27:
            return r0
    }

    private static javax.net.ssl.TrustManager[] prepareTrustManager(java.io.InputStream... r9) {
            r0 = 0
            if (r9 == 0) goto L45
            int r1 = r9.length
            if (r1 > 0) goto L7
            goto L45
        L7:
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = java.security.KeyStore.getDefaultType()     // Catch: java.lang.Throwable -> L45
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch: java.lang.Throwable -> L45
            r2.load(r0)     // Catch: java.lang.Throwable -> L45
            int r3 = r9.length     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r5 = 0
        L1b:
            if (r4 >= r3) goto L35
            r6 = r9[r4]     // Catch: java.lang.Throwable -> L45
            int r7 = r5 + 1
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Throwable -> L45
            java.security.cert.Certificate r8 = r1.generateCertificate(r6)     // Catch: java.lang.Throwable -> L45
            r2.setCertificateEntry(r5, r8)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L31
            r6.close()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45
        L31:
            int r4 = r4 + 1
            r5 = r7
            goto L1b
        L35:
            java.lang.String r9 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45
            javax.net.ssl.TrustManagerFactory r9 = javax.net.ssl.TrustManagerFactory.getInstance(r9)     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45
            r9.init(r2)     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45
            javax.net.ssl.TrustManager[] r9 = r9.getTrustManagers()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45 java.lang.Throwable -> L45
            return r9
        L45:
            return r0
    }
}
