package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ReferenceCountedOpenSslClientContext extends io.netty.handler.ssl.ReferenceCountedOpenSslContext {
    private static final java.util.Set<java.lang.String> SUPPORTED_KEY_TYPES = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.ssl.OpenSslSessionContext sessionContext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ExtendedTrustManagerVerifyCallback extends io.netty.handler.ssl.ReferenceCountedOpenSslContext.AbstractCertificateVerifier {
        private final javax.net.ssl.X509ExtendedTrustManager manager;

        ExtendedTrustManagerVerifyCallback(io.netty.handler.ssl.OpenSslEngineMap r1, javax.net.ssl.X509ExtendedTrustManager r2) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                javax.net.ssl.X509ExtendedTrustManager r1 = io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager.wrap(r2, r1)
                r0.manager = r1
                return
        }

        @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext.AbstractCertificateVerifier
        void verify(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2, java.security.cert.X509Certificate[] r3, java.lang.String r4) throws java.lang.Exception {
                r1 = this;
                javax.net.ssl.X509ExtendedTrustManager r0 = r1.manager
                io.netty.handler.ssl.s.a(r0, r3, r4, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OpenSslClientCertificateCallback implements io.netty.internal.tcnative.CertificateCallback {
        private final io.netty.handler.ssl.OpenSslEngineMap engineMap;
        private final io.netty.handler.ssl.OpenSslKeyMaterialManager keyManagerHolder;

        OpenSslClientCertificateCallback(io.netty.handler.ssl.OpenSslEngineMap r1, io.netty.handler.ssl.OpenSslKeyMaterialManager r2) {
                r0 = this;
                r0.<init>()
                r0.engineMap = r1
                r0.keyManagerHolder = r2
                return
        }

        private static java.lang.String clientKeyType(byte r1) {
                r0 = 1
                if (r1 == r0) goto L17
                r0 = 3
                if (r1 == r0) goto L14
                switch(r1) {
                    case 64: goto L11;
                    case 65: goto Le;
                    case 66: goto Lb;
                    default: goto L9;
                }
            L9:
                r1 = 0
                return r1
            Lb:
                java.lang.String r1 = "EC_EC"
                return r1
            Le:
                java.lang.String r1 = "EC_RSA"
                return r1
            L11:
                java.lang.String r1 = "EC"
                return r1
            L14:
                java.lang.String r1 = "DH_RSA"
                return r1
            L17:
                java.lang.String r1 = "RSA"
                return r1
        }

        private static java.util.Set<java.lang.String> supportedClientKeyTypes(byte[] r4) {
                if (r4 != 0) goto L7
                java.util.Set r4 = io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.access$100()
                return r4
            L7:
                java.util.HashSet r0 = new java.util.HashSet
                int r1 = r4.length
                r0.<init>(r1)
                int r1 = r4.length
                r2 = 0
            Lf:
                if (r2 >= r1) goto L20
                r3 = r4[r2]
                java.lang.String r3 = clientKeyType(r3)
                if (r3 != 0) goto L1a
                goto L1d
            L1a:
                r0.add(r3)
            L1d:
                int r2 = r2 + 1
                goto Lf
            L20:
                return r0
        }

        public void handle(long r4, byte[] r6, byte[][] r7) throws java.lang.Exception {
                r3 = this;
                io.netty.handler.ssl.OpenSslEngineMap r0 = r3.engineMap
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r4 = r0.get(r4)
                java.util.Set r5 = supportedClientKeyTypes(r6)     // Catch: java.lang.Throwable -> L29
                r6 = 0
                java.lang.String[] r0 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L29
                java.lang.Object[] r5 = r5.toArray(r0)     // Catch: java.lang.Throwable -> L29
                java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L29
                if (r7 != 0) goto L17
                r6 = 0
                goto L2c
            L17:
                int r0 = r7.length     // Catch: java.lang.Throwable -> L29
                javax.security.auth.x500.X500Principal[] r0 = new javax.security.auth.x500.X500Principal[r0]     // Catch: java.lang.Throwable -> L29
            L1a:
                int r1 = r7.length     // Catch: java.lang.Throwable -> L29
                if (r6 >= r1) goto L2b
                javax.security.auth.x500.X500Principal r1 = new javax.security.auth.x500.X500Principal     // Catch: java.lang.Throwable -> L29
                r2 = r7[r6]     // Catch: java.lang.Throwable -> L29
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L29
                r0[r6] = r1     // Catch: java.lang.Throwable -> L29
                int r6 = r6 + 1
                goto L1a
            L29:
                r5 = move-exception
                goto L32
            L2b:
                r6 = r0
            L2c:
                io.netty.handler.ssl.OpenSslKeyMaterialManager r7 = r3.keyManagerHolder     // Catch: java.lang.Throwable -> L29
                r7.setKeyMaterialClientSide(r4, r5, r6)     // Catch: java.lang.Throwable -> L29
                return
            L32:
                io.netty.util.internal.logging.InternalLogger r6 = io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.access$000()
                java.lang.String r7 = "request of key failed"
                r6.debug(r7, r5)
                r4.initHandshakeException(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class OpenSslClientSessionContext extends io.netty.handler.ssl.OpenSslSessionContext {
        OpenSslClientSessionContext(io.netty.handler.ssl.ReferenceCountedOpenSslContext r1, io.netty.handler.ssl.OpenSslKeyMaterialProvider r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // javax.net.ssl.SSLSessionContext
        public int getSessionCacheSize() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // javax.net.ssl.SSLSessionContext
        public int getSessionTimeout() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.ssl.OpenSslSessionContext
        public boolean isSessionCacheEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.ssl.OpenSslSessionContext
        public void setSessionCacheEnabled(boolean r1) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.SSLSessionContext
        public void setSessionCacheSize(int r1) {
                r0 = this;
                if (r1 < 0) goto L3
                return
            L3:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>()
                throw r1
        }

        @Override // javax.net.ssl.SSLSessionContext
        public void setSessionTimeout(int r1) {
                r0 = this;
                if (r1 < 0) goto L3
                return
            L3:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>()
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TrustManagerVerifyCallback extends io.netty.handler.ssl.ReferenceCountedOpenSslContext.AbstractCertificateVerifier {
        private final javax.net.ssl.X509TrustManager manager;

        TrustManagerVerifyCallback(io.netty.handler.ssl.OpenSslEngineMap r1, javax.net.ssl.X509TrustManager r2) {
                r0 = this;
                r0.<init>(r1)
                r0.manager = r2
                return
        }

        @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext.AbstractCertificateVerifier
        void verify(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1, java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.lang.Exception {
                r0 = this;
                javax.net.ssl.X509TrustManager r1 = r0.manager
                r1.checkServerTrusted(r2, r3)
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.ReferenceCountedOpenSslClientContext> r0 = io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.logger = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.lang.String r1 = "EC_RSA"
            java.lang.String r2 = "EC_EC"
            java.lang.String r3 = "RSA"
            java.lang.String r4 = "DH_RSA"
            java.lang.String r5 = "EC"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.SUPPORTED_KEY_TYPES = r0
            return
    }

    ReferenceCountedOpenSslClientContext(java.security.cert.X509Certificate[] r17, javax.net.ssl.TrustManagerFactory r18, java.security.cert.X509Certificate[] r19, java.security.PrivateKey r20, java.lang.String r21, javax.net.ssl.KeyManagerFactory r22, java.lang.Iterable<java.lang.String> r23, io.netty.handler.ssl.CipherSuiteFilter r24, io.netty.handler.ssl.ApplicationProtocolConfig r25, java.lang.String[] r26, long r27, long r29, boolean r31, java.lang.String r32) throws javax.net.ssl.SSLException {
            r16 = this;
            io.netty.handler.ssl.ClientAuth r11 = io.netty.handler.ssl.ClientAuth.NONE
            r13 = 0
            r15 = 1
            r9 = 0
            r1 = r16
            r10 = r19
            r2 = r23
            r3 = r24
            r4 = r25
            r12 = r26
            r5 = r27
            r7 = r29
            r14 = r31
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15)
            long r2 = r1.ctx     // Catch: java.lang.Throwable -> L33
            io.netty.handler.ssl.OpenSslEngineMap r4 = r1.engineMap     // Catch: java.lang.Throwable -> L33
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r32
            io.netty.handler.ssl.OpenSslSessionContext r0 = newSessionContext(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L33
            r1.sessionContext = r0     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            r1.release()
            throw r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.logger
            return r0
    }

    static /* synthetic */ java.util.Set access$100() {
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.SUPPORTED_KEY_TYPES
            return r0
    }

    static io.netty.handler.ssl.OpenSslSessionContext newSessionContext(io.netty.handler.ssl.ReferenceCountedOpenSslContext r2, long r3, io.netty.handler.ssl.OpenSslEngineMap r5, java.security.cert.X509Certificate[] r6, javax.net.ssl.TrustManagerFactory r7, java.security.cert.X509Certificate[] r8, java.security.PrivateKey r9, java.lang.String r10, javax.net.ssl.KeyManagerFactory r11, java.lang.String r12) throws javax.net.ssl.SSLException {
            if (r9 != 0) goto L4
            if (r8 != 0) goto L9
        L4:
            if (r9 == 0) goto L11
            if (r8 == 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Either both keyCertChain and key needs to be null or none of them"
            r2.<init>(r3)
            throw r2
        L11:
            r0 = 0
            boolean r1 = io.netty.handler.ssl.OpenSsl.useKeyManagerFactory()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            if (r1 != 0) goto L30
            if (r11 != 0) goto L28
            if (r8 == 0) goto L26
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.setKeyMaterial(r3, r8, r9, r10)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L26
        L20:
            r2 = move-exception
            goto Ld9
        L23:
            r2 = move-exception
            goto Ld1
        L26:
            r8 = r0
            goto L7f
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.lang.String r3 = "KeyManagerFactory not supported"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            throw r2     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
        L30:
            if (r11 != 0) goto L61
            if (r8 == 0) goto L61
            char[] r11 = io.netty.handler.ssl.SslContext.keyStorePassword(r10)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.security.KeyStore r8 = io.netty.handler.ssl.SslContext.buildKeyStore(r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.util.Enumeration r9 = r8.aliases()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            boolean r9 = r9.hasMoreElements()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            if (r9 == 0) goto L4c
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r9 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r9.<init>()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L59
        L4c:
            io.netty.handler.ssl.OpenSslCachingX509KeyManagerFactory r9 = new io.netty.handler.ssl.OpenSslCachingX509KeyManagerFactory     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            java.lang.String r1 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            javax.net.ssl.KeyManagerFactory r1 = javax.net.ssl.KeyManagerFactory.getInstance(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
        L59:
            r9.init(r8, r11)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r8 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.providerFor(r9, r10)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L69
        L61:
            if (r11 == 0) goto L68
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r8 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.providerFor(r11, r10)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L69
        L68:
            r8 = r0
        L69:
            if (r8 == 0) goto L7f
            io.netty.handler.ssl.OpenSslKeyMaterialManager r9 = new io.netty.handler.ssl.OpenSslKeyMaterialManager     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7c
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7c
            io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$OpenSslClientCertificateCallback r10 = new io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$OpenSslClientCertificateCallback     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7c
            r10.<init>(r5, r9)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7c
            io.netty.internal.tcnative.SSLContext.setCertificateCallback(r3, r10)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L7c
            goto L7f
        L79:
            r2 = move-exception
            r0 = r8
            goto Ld9
        L7c:
            r2 = move-exception
            r0 = r8
            goto Ld1
        L7f:
            r9 = 1
            r10 = 10
            io.netty.internal.tcnative.SSLContext.setVerify(r3, r9, r10)     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L8e
            javax.net.ssl.TrustManagerFactory r7 = io.netty.handler.ssl.SslContext.buildTrustManagerFactory(r6, r7, r12)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            goto L9b
        L8c:
            r2 = move-exception
            goto Lc4
        L8e:
            if (r7 != 0) goto L9b
            java.lang.String r6 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            javax.net.ssl.TrustManagerFactory r7 = javax.net.ssl.TrustManagerFactory.getInstance(r6)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            r7.init(r0)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
        L9b:
            javax.net.ssl.TrustManager[] r6 = r7.getTrustManagers()     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            javax.net.ssl.X509TrustManager r6 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.chooseTrustManager(r6)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            boolean r7 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.useExtendedTrustManager(r6)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            if (r7 == 0) goto Lb6
            io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$ExtendedTrustManagerVerifyCallback r7 = new io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$ExtendedTrustManagerVerifyCallback     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            javax.net.ssl.X509ExtendedTrustManager r6 = io.netty.handler.ssl.z.a(r6)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            io.netty.internal.tcnative.SSLContext.setCertVerifyCallback(r3, r7)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            goto Lbe
        Lb6:
            io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$TrustManagerVerifyCallback r7 = new io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$TrustManagerVerifyCallback     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
            io.netty.internal.tcnative.SSLContext.setCertVerifyCallback(r3, r7)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8c
        Lbe:
            io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$OpenSslClientSessionContext r3 = new io.netty.handler.ssl.ReferenceCountedOpenSslClientContext$OpenSslClientSessionContext     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r8)     // Catch: java.lang.Throwable -> L79
            return r3
        Lc4:
            if (r8 == 0) goto Lc9
            r8.destroy()     // Catch: java.lang.Throwable -> L79
        Lc9:
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "unable to setup trustmanager"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L79
            throw r3     // Catch: java.lang.Throwable -> L79
        Ld1:
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "failed to set certificate and key"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        Ld9:
            if (r0 == 0) goto Lde
            r0.destroy()
        Lde:
            throw r2
    }

    @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext, io.netty.handler.ssl.SslContext
    public io.netty.handler.ssl.OpenSslSessionContext sessionContext() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSessionContext r0 = r1.sessionContext
            return r0
    }

    @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext, io.netty.handler.ssl.SslContext
    public /* bridge */ /* synthetic */ javax.net.ssl.SSLSessionContext sessionContext() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSessionContext r0 = r1.sessionContext()
            return r0
    }
}
