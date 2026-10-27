package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ReferenceCountedOpenSslServerContext extends io.netty.handler.ssl.ReferenceCountedOpenSslContext {
    private static final byte[] ID = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.ssl.OpenSslServerSessionContext sessionContext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ExtendedTrustManagerVerifyCallback extends io.netty.handler.ssl.ReferenceCountedOpenSslContext.AbstractCertificateVerifier {
        private final javax.net.ssl.X509ExtendedTrustManager manager;

        ExtendedTrustManagerVerifyCallback(io.netty.handler.ssl.OpenSslEngineMap r1, javax.net.ssl.X509ExtendedTrustManager r2) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                javax.net.ssl.X509ExtendedTrustManager r1 = io.netty.handler.ssl.OpenSslTlsv13X509ExtendedTrustManager.wrap(r2, r1)
                r0.manager = r1
                return
        }

        @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext.AbstractCertificateVerifier
        void verify(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2, java.security.cert.X509Certificate[] r3, java.lang.String r4) throws java.lang.Exception {
                r1 = this;
                javax.net.ssl.X509ExtendedTrustManager r0 = r1.manager
                io.netty.handler.ssl.t.a(r0, r3, r4, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OpenSslServerCertificateCallback implements io.netty.internal.tcnative.CertificateCallback {
        private final io.netty.handler.ssl.OpenSslEngineMap engineMap;
        private final io.netty.handler.ssl.OpenSslKeyMaterialManager keyManagerHolder;

        OpenSslServerCertificateCallback(io.netty.handler.ssl.OpenSslEngineMap r1, io.netty.handler.ssl.OpenSslKeyMaterialManager r2) {
                r0 = this;
                r0.<init>()
                r0.engineMap = r1
                r0.keyManagerHolder = r2
                return
        }

        public void handle(long r1, byte[] r3, byte[][] r4) throws java.lang.Exception {
                r0 = this;
                io.netty.handler.ssl.OpenSslEngineMap r3 = r0.engineMap
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r3.get(r1)
                io.netty.handler.ssl.OpenSslKeyMaterialManager r2 = r0.keyManagerHolder     // Catch: java.lang.Throwable -> Lc
                r2.setKeyMaterialServerSide(r1)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r2 = move-exception
                io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.access$000()
                java.lang.String r4 = "Failed to set the server-side key material"
                r3.debug(r4, r2)
                r1.initHandshakeException(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OpenSslSniHostnameMatcher implements io.netty.internal.tcnative.SniHostNameMatcher {
        private final io.netty.handler.ssl.OpenSslEngineMap engineMap;

        OpenSslSniHostnameMatcher(io.netty.handler.ssl.OpenSslEngineMap r1) {
                r0 = this;
                r0.<init>()
                r0.engineMap = r1
                return
        }

        public boolean match(long r2, java.lang.String r4) {
                r1 = this;
                io.netty.handler.ssl.OpenSslEngineMap r0 = r1.engineMap
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r0.get(r2)
                if (r0 == 0) goto L13
                java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.UTF_8
                byte[] r2 = r4.getBytes(r2)
                boolean r2 = r0.checkSniHostnameMatch(r2)
                return r2
            L13:
                io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.access$000()
                java.lang.String r0 = "No ReferenceCountedOpenSslEngine found for SSL pointer: {}"
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r4.warn(r0, r2)
                r2 = 0
                return r2
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
                r1.checkClientTrusted(r2, r3)
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.ReferenceCountedOpenSslServerContext> r0 = io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.logger = r0
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [110, 101, 116, 116, 121} // fill-array
            io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.ID = r0
            return
    }

    ReferenceCountedOpenSslServerContext(java.security.cert.X509Certificate[] r20, javax.net.ssl.TrustManagerFactory r21, java.security.cert.X509Certificate[] r22, java.security.PrivateKey r23, java.lang.String r24, javax.net.ssl.KeyManagerFactory r25, java.lang.Iterable<java.lang.String> r26, io.netty.handler.ssl.CipherSuiteFilter r27, io.netty.handler.ssl.ApplicationProtocolConfig r28, long r29, long r31, io.netty.handler.ssl.ClientAuth r33, java.lang.String[] r34, boolean r35, boolean r36, java.lang.String r37) throws javax.net.ssl.SSLException {
            r19 = this;
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r9 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toNegotiator(r28)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r10 = r29
            r12 = r31
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            return
    }

    ReferenceCountedOpenSslServerContext(java.security.cert.X509Certificate[] r17, javax.net.ssl.TrustManagerFactory r18, java.security.cert.X509Certificate[] r19, java.security.PrivateKey r20, java.lang.String r21, javax.net.ssl.KeyManagerFactory r22, java.lang.Iterable<java.lang.String> r23, io.netty.handler.ssl.CipherSuiteFilter r24, io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r25, long r26, long r28, io.netty.handler.ssl.ClientAuth r30, java.lang.String[] r31, boolean r32, boolean r33, java.lang.String r34) throws javax.net.ssl.SSLException {
            r16 = this;
            r9 = 1
            r15 = 1
            r1 = r16
            r10 = r19
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r7 = r28
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15)
            long r2 = r1.ctx     // Catch: java.lang.Throwable -> L3c
            io.netty.handler.ssl.OpenSslEngineMap r0 = r1.engineMap     // Catch: java.lang.Throwable -> L3c
            r27 = r17
            r28 = r18
            r29 = r19
            r30 = r20
            r31 = r21
            r32 = r22
            r33 = r34
            r26 = r0
            r23 = r1
            r24 = r2
            io.netty.handler.ssl.OpenSslServerSessionContext r0 = newSessionContext(r23, r24, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L3e
            r1 = r23
            r1.sessionContext = r0     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r0 = move-exception
            goto L41
        L3e:
            r0 = move-exception
            r1 = r23
        L41:
            r1.release()
            throw r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.logger
            return r0
    }

    static io.netty.handler.ssl.OpenSslServerSessionContext newSessionContext(io.netty.handler.ssl.ReferenceCountedOpenSslContext r3, long r4, io.netty.handler.ssl.OpenSslEngineMap r6, java.security.cert.X509Certificate[] r7, javax.net.ssl.TrustManagerFactory r8, java.security.cert.X509Certificate[] r9, java.security.PrivateKey r10, java.lang.String r11, javax.net.ssl.KeyManagerFactory r12, java.lang.String r13) throws javax.net.ssl.SSLException {
            r0 = 0
            r1 = 10
            r2 = 0
            io.netty.internal.tcnative.SSLContext.setVerify(r4, r0, r1)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            boolean r0 = io.netty.handler.ssl.OpenSsl.useKeyManagerFactory()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            if (r0 != 0) goto L27
            if (r12 != 0) goto L1f
            java.lang.String r12 = "keyCertChain"
            io.netty.util.internal.ObjectUtil.checkNotNull(r9, r12)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.setKeyMaterial(r4, r9, r10, r11)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r9 = r2
            goto L63
        L19:
            r3 = move-exception
            goto L109
        L1c:
            r3 = move-exception
            goto L101
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.lang.String r4 = "KeyManagerFactory not supported"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            throw r3     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
        L27:
            if (r12 != 0) goto L52
            char[] r12 = io.netty.handler.ssl.SslContext.keyStorePassword(r11)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.security.KeyStore r9 = io.netty.handler.ssl.SslContext.buildKeyStore(r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.util.Enumeration r10 = r9.aliases()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            boolean r10 = r10.hasMoreElements()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            if (r10 == 0) goto L41
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r10 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r10.<init>()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            goto L4e
        L41:
            io.netty.handler.ssl.OpenSslCachingX509KeyManagerFactory r10 = new io.netty.handler.ssl.OpenSslCachingX509KeyManagerFactory     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.lang.String r0 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            javax.net.ssl.KeyManagerFactory r0 = javax.net.ssl.KeyManagerFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
        L4e:
            r10.init(r9, r12)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r12 = r10
        L52:
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r9 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.providerFor(r12, r11)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$OpenSslServerCertificateCallback r10 = new io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$OpenSslServerCertificateCallback     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> Lff
            io.netty.handler.ssl.OpenSslKeyMaterialManager r11 = new io.netty.handler.ssl.OpenSslKeyMaterialManager     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> Lff
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> Lff
            r10.<init>(r6, r11)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> Lff
            io.netty.internal.tcnative.SSLContext.setCertificateCallback(r4, r10)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> Lff
        L63:
            if (r7 == 0) goto L74
            javax.net.ssl.TrustManagerFactory r8 = io.netty.handler.ssl.SslContext.buildTrustManagerFactory(r7, r8, r13)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            goto L81
        L6a:
            r3 = move-exception
            r2 = r9
            goto L109
        L6e:
            r3 = move-exception
            goto Lf6
        L71:
            r3 = move-exception
            goto Lfe
        L74:
            if (r8 != 0) goto L81
            java.lang.String r7 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            javax.net.ssl.TrustManagerFactory r8 = javax.net.ssl.TrustManagerFactory.getInstance(r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            r8.init(r2)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
        L81:
            javax.net.ssl.TrustManager[] r7 = r8.getTrustManagers()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            javax.net.ssl.X509TrustManager r7 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.chooseTrustManager(r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            boolean r8 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.useExtendedTrustManager(r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            if (r8 == 0) goto L9c
            io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$ExtendedTrustManagerVerifyCallback r8 = new io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$ExtendedTrustManagerVerifyCallback     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            javax.net.ssl.X509ExtendedTrustManager r10 = io.netty.handler.ssl.z.a(r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            r8.<init>(r6, r10)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            io.netty.internal.tcnative.SSLContext.setCertVerifyCallback(r4, r8)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            goto La4
        L9c:
            io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$TrustManagerVerifyCallback r8 = new io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$TrustManagerVerifyCallback     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            io.netty.internal.tcnative.SSLContext.setCertVerifyCallback(r4, r8)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
        La4:
            java.security.cert.X509Certificate[] r8 = r7.getAcceptedIssuers()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            if (r8 == 0) goto Ldb
            int r10 = r8.length     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            if (r10 <= 0) goto Ldb
            r10 = 0
            io.netty.buffer.ByteBufAllocator r12 = io.netty.buffer.ByteBufAllocator.DEFAULT     // Catch: java.lang.Throwable -> Ld6
            long r10 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toBIO(r12, r8)     // Catch: java.lang.Throwable -> Ld6
            boolean r8 = io.netty.internal.tcnative.SSLContext.setCACertificateBio(r4, r10)     // Catch: java.lang.Throwable -> Ld6
            if (r8 == 0) goto Lbf
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.freeBio(r10)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            goto Ldb
        Lbf:
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r4.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = "unable to setup accepted issuers for trustmanager "
            r4.append(r5)     // Catch: java.lang.Throwable -> Ld6
            r4.append(r7)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Ld6
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Ld6
            throw r3     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            r3 = move-exception
            io.netty.handler.ssl.ReferenceCountedOpenSslContext.freeBio(r10)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            throw r3     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
        Ldb:
            int r7 = io.netty.util.internal.PlatformDependent.javaVersion()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            r8 = 8
            if (r7 < r8) goto Leb
            io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$OpenSslSniHostnameMatcher r7 = new io.netty.handler.ssl.ReferenceCountedOpenSslServerContext$OpenSslSniHostnameMatcher     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
            io.netty.internal.tcnative.SSLContext.setSniHostnameMatcher(r4, r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e javax.net.ssl.SSLException -> L71
        Leb:
            io.netty.handler.ssl.OpenSslServerSessionContext r4 = new io.netty.handler.ssl.OpenSslServerSessionContext     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r3, r9)     // Catch: java.lang.Throwable -> L6a
            byte[] r3 = io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.ID     // Catch: java.lang.Throwable -> L6a
            r4.setSessionIdContext(r3)     // Catch: java.lang.Throwable -> L6a
            return r4
        Lf6:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "unable to setup trustmanager"
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L6a
            throw r4     // Catch: java.lang.Throwable -> L6a
        Lfe:
            throw r3     // Catch: java.lang.Throwable -> L6a
        Lff:
            r3 = move-exception
            r2 = r9
        L101:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "failed to set certificate and key"
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L109:
            if (r2 == 0) goto L10e
            r2.destroy()
        L10e:
            throw r3
    }

    @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext, io.netty.handler.ssl.SslContext
    public io.netty.handler.ssl.OpenSslServerSessionContext sessionContext() {
            r1 = this;
            io.netty.handler.ssl.OpenSslServerSessionContext r0 = r1.sessionContext
            return r0
    }

    @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext, io.netty.handler.ssl.SslContext
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.OpenSslSessionContext sessionContext() {
            r1 = this;
            io.netty.handler.ssl.OpenSslServerSessionContext r0 = r1.sessionContext()
            return r0
    }

    @Override // io.netty.handler.ssl.ReferenceCountedOpenSslContext, io.netty.handler.ssl.SslContext
    public /* bridge */ /* synthetic */ javax.net.ssl.SSLSessionContext sessionContext() {
            r1 = this;
            io.netty.handler.ssl.OpenSslServerSessionContext r0 = r1.sessionContext()
            return r0
    }
}
