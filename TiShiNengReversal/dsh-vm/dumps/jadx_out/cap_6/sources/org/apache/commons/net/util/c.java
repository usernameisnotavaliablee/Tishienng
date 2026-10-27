package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class c {
    private static final java.lang.String a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private final java.security.cert.X509Certificate[] a;
        private final java.security.PrivateKey b;
        private final java.lang.String c;

        a(java.security.KeyStore r2, java.lang.String r3, java.lang.String r4) throws java.security.GeneralSecurityException {
                r1 = this;
                r1.<init>()
                r1.c = r3
                char[] r4 = r4.toCharArray()
                java.security.Key r4 = r2.getKey(r3, r4)
                java.security.PrivateKey r4 = (java.security.PrivateKey) r4
                r1.b = r4
                java.security.cert.Certificate[] r2 = r2.getCertificateChain(r3)
                int r3 = r2.length
                java.security.cert.X509Certificate[] r3 = new java.security.cert.X509Certificate[r3]
                r4 = 0
            L19:
                int r0 = r2.length
                if (r4 >= r0) goto L25
                r0 = r2[r4]
                java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
                r3[r4] = r0
                int r4 = r4 + 1
                goto L19
            L25:
                r1.a = r3
                return
        }

        final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }

        final java.security.cert.X509Certificate[] b() {
                r1 = this;
                java.security.cert.X509Certificate[] r0 = r1.a
                return r0
        }

        final java.security.PrivateKey c() {
                r1 = this;
                java.security.PrivateKey r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends javax.net.ssl.X509ExtendedKeyManager {
        private final org.apache.commons.net.util.c.a a;

        b(org.apache.commons.net.util.c.a r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String chooseClientAlias(java.lang.String[] r1, java.security.Principal[] r2, java.net.Socket r3) {
                r0 = this;
                org.apache.commons.net.util.c$a r1 = r0.a
                java.lang.String r1 = r1.a()
                return r1
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String chooseServerAlias(java.lang.String r1, java.security.Principal[] r2, java.net.Socket r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.security.cert.X509Certificate[] getCertificateChain(java.lang.String r1) {
                r0 = this;
                org.apache.commons.net.util.c$a r1 = r0.a
                java.security.cert.X509Certificate[] r1 = r1.b()
                return r1
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String[] getClientAliases(java.lang.String r1, java.security.Principal[] r2) {
                r0 = this;
                org.apache.commons.net.util.c$a r1 = r0.a
                java.lang.String r1 = r1.a()
                java.lang.String[] r1 = new java.lang.String[]{r1}
                return r1
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.security.PrivateKey getPrivateKey(java.lang.String r1) {
                r0 = this;
                org.apache.commons.net.util.c$a r1 = r0.a
                java.security.PrivateKey r1 = r1.c()
                return r1
        }

        @Override // javax.net.ssl.X509KeyManager
        public java.lang.String[] getServerAliases(java.lang.String r1, java.security.Principal[] r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            org.apache.commons.net.util.c.a = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.net.ssl.KeyManager a(java.io.File r2, java.lang.String r3) throws java.io.IOException, java.security.GeneralSecurityException {
            java.lang.String r0 = org.apache.commons.net.util.c.a
            r1 = 0
            javax.net.ssl.KeyManager r2 = c(r0, r2, r3, r1, r3)
            return r2
    }

    public static javax.net.ssl.KeyManager b(java.io.File r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException, java.security.GeneralSecurityException {
            java.lang.String r0 = org.apache.commons.net.util.c.a
            javax.net.ssl.KeyManager r1 = c(r0, r1, r2, r3, r2)
            return r1
    }

    public static javax.net.ssl.KeyManager c(java.lang.String r0, java.io.File r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException, java.security.GeneralSecurityException {
            java.security.KeyStore r0 = f(r0, r1, r2)
            javax.net.ssl.KeyManager r0 = d(r0, r3, r4)
            return r0
    }

    public static javax.net.ssl.KeyManager d(java.security.KeyStore r1, java.lang.String r2, java.lang.String r3) throws java.security.GeneralSecurityException {
            org.apache.commons.net.util.c$a r0 = new org.apache.commons.net.util.c$a
            if (r2 == 0) goto L5
            goto L9
        L5:
            java.lang.String r2 = e(r1)
        L9:
            r0.<init>(r1, r2, r3)
            org.apache.commons.net.util.c$b r1 = new org.apache.commons.net.util.c$b
            r1.<init>(r0)
            return r1
    }

    private static java.lang.String e(java.security.KeyStore r3) throws java.security.KeyStoreException {
            java.util.Enumeration r0 = r3.aliases()
        L4:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r3.isKeyEntry(r1)
            if (r2 == 0) goto L4
            return r1
        L17:
            java.security.KeyStoreException r3 = new java.security.KeyStoreException
            java.lang.String r0 = "Cannot find a private key entry"
            r3.<init>(r0)
            throw r3
    }

    private static java.security.KeyStore f(java.lang.String r2, java.io.File r3, java.lang.String r4) throws java.security.KeyStoreException, java.io.IOException, java.security.GeneralSecurityException {
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L18
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
            char[] r3 = r4.toCharArray()     // Catch: java.lang.Throwable -> L15
            r2.load(r1, r3)     // Catch: java.lang.Throwable -> L15
            org.apache.commons.net.io.l.a(r1)
            return r2
        L15:
            r2 = move-exception
            r0 = r1
            goto L19
        L18:
            r2 = move-exception
        L19:
            org.apache.commons.net.io.l.a(r0)
            throw r2
    }
}
