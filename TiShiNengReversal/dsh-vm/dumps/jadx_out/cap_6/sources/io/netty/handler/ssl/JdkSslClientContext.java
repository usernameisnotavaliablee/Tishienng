package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class JdkSslClientContext extends io.netty.handler.ssl.JdkSslContext {
    @java.lang.Deprecated
    public JdkSslClientContext() throws javax.net.ssl.SSLException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(java.io.File r2) throws javax.net.ssl.SSLException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(java.io.File r11, javax.net.ssl.TrustManagerFactory r12) throws javax.net.ssl.SSLException {
            r10 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r4 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator r5 = io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.INSTANCE
            r6 = 0
            r8 = 0
            r3 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(java.io.File r16, javax.net.ssl.TrustManagerFactory r17, java.io.File r18, java.io.File r19, java.lang.String r20, javax.net.ssl.KeyManagerFactory r21, java.lang.Iterable<java.lang.String> r22, io.netty.handler.ssl.CipherSuiteFilter r23, io.netty.handler.ssl.ApplicationProtocolConfig r24, long r25, long r27) throws javax.net.ssl.SSLException {
            r15 = this;
            r0 = 0
            r1 = r24
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r10 = io.netty.handler.ssl.JdkSslContext.toNegotiator(r1, r0)
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r25
            r13 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(java.io.File r22, javax.net.ssl.TrustManagerFactory r23, java.io.File r24, java.io.File r25, java.lang.String r26, javax.net.ssl.KeyManagerFactory r27, java.lang.Iterable<java.lang.String> r28, io.netty.handler.ssl.CipherSuiteFilter r29, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r30, long r31, long r33) throws javax.net.ssl.SSLException {
            r21 = this;
            java.security.cert.X509Certificate[] r1 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r22)
            java.security.cert.X509Certificate[] r3 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r24)
            java.security.PrivateKey r4 = io.netty.handler.ssl.SslContext.toPrivateKeyInternal(r25, r26)
            java.lang.String r11 = java.security.KeyStore.getDefaultType()
            r0 = 0
            r2 = r23
            r5 = r26
            r6 = r27
            r7 = r31
            r9 = r33
            javax.net.ssl.SSLContext r13 = newSSLContext(r0, r1, r2, r3, r4, r5, r6, r7, r9, r11)
            io.netty.handler.ssl.ClientAuth r18 = io.netty.handler.ssl.ClientAuth.NONE
            r19 = 0
            r20 = 0
            r14 = 1
            r12 = r21
            r15 = r28
            r16 = r29
            r17 = r30
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(java.io.File r12, javax.net.ssl.TrustManagerFactory r13, java.lang.Iterable<java.lang.String> r14, io.netty.handler.ssl.CipherSuiteFilter r15, io.netty.handler.ssl.ApplicationProtocolConfig r16, long r17, long r19) throws javax.net.ssl.SSLException {
            r11 = this;
            r0 = 0
            r1 = r16
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r6 = io.netty.handler.ssl.JdkSslContext.toNegotiator(r1, r0)
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(java.io.File r12, javax.net.ssl.TrustManagerFactory r13, java.lang.Iterable<java.lang.String> r14, io.netty.handler.ssl.CipherSuiteFilter r15, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r16, long r17, long r19) throws javax.net.ssl.SSLException {
            r11 = this;
            r1 = 0
            r0 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(java.io.File r11, javax.net.ssl.TrustManagerFactory r12, java.lang.Iterable<java.lang.String> r13, java.lang.Iterable<java.lang.String> r14, long r15, long r17) throws javax.net.ssl.SSLException {
            r10 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r4 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.ApplicationProtocolConfig r14 = io.netty.handler.ssl.SslContext.toApplicationProtocolConfig(r14)
            r0 = 0
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r5 = io.netty.handler.ssl.JdkSslContext.toNegotiator(r14, r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r15
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    JdkSslClientContext(java.security.Provider r22, java.io.File r23, javax.net.ssl.TrustManagerFactory r24, java.lang.Iterable<java.lang.String> r25, io.netty.handler.ssl.CipherSuiteFilter r26, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r27, long r28, long r30) throws javax.net.ssl.SSLException {
            r21 = this;
            java.security.cert.X509Certificate[] r1 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r23)
            r6 = 0
            java.lang.String r11 = java.security.KeyStore.getDefaultType()
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r22
            r2 = r24
            r7 = r28
            r9 = r30
            javax.net.ssl.SSLContext r13 = newSSLContext(r0, r1, r2, r3, r4, r5, r6, r7, r9, r11)
            io.netty.handler.ssl.ClientAuth r18 = io.netty.handler.ssl.ClientAuth.NONE
            r19 = 0
            r20 = 0
            r14 = 1
            r12 = r21
            r15 = r25
            r16 = r26
            r17 = r27
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return
    }

    JdkSslClientContext(java.security.Provider r13, java.security.cert.X509Certificate[] r14, javax.net.ssl.TrustManagerFactory r15, java.security.cert.X509Certificate[] r16, java.security.PrivateKey r17, java.lang.String r18, javax.net.ssl.KeyManagerFactory r19, java.lang.Iterable<java.lang.String> r20, io.netty.handler.ssl.CipherSuiteFilter r21, io.netty.handler.ssl.ApplicationProtocolConfig r22, java.lang.String[] r23, long r24, long r26, java.lang.String r28) throws javax.net.ssl.SSLException {
            r12 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r24
            r9 = r26
            r11 = r28
            javax.net.ssl.SSLContext r1 = newSSLContext(r0, r1, r2, r3, r4, r5, r6, r7, r9, r11)
            r13 = 0
            r14 = r22
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r5 = io.netty.handler.ssl.JdkSslContext.toNegotiator(r14, r13)
            io.netty.handler.ssl.ClientAuth r6 = io.netty.handler.ssl.ClientAuth.NONE
            r8 = 0
            r2 = 1
            r0 = r12
            r3 = r20
            r4 = r21
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @java.lang.Deprecated
    public JdkSslClientContext(javax.net.ssl.TrustManagerFactory r2) throws javax.net.ssl.SSLException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    private static javax.net.ssl.SSLContext newSSLContext(java.security.Provider r0, java.security.cert.X509Certificate[] r1, javax.net.ssl.TrustManagerFactory r2, java.security.cert.X509Certificate[] r3, java.security.PrivateKey r4, java.lang.String r5, javax.net.ssl.KeyManagerFactory r6, long r7, long r9, java.lang.String r11) throws javax.net.ssl.SSLException {
            if (r1 == 0) goto L6
            javax.net.ssl.TrustManagerFactory r2 = io.netty.handler.ssl.SslContext.buildTrustManagerFactory(r1, r2, r11)     // Catch: java.lang.Exception -> L4f
        L6:
            r1 = 0
            if (r3 == 0) goto Ld
            javax.net.ssl.KeyManagerFactory r6 = io.netty.handler.ssl.SslContext.buildKeyManagerFactory(r3, r4, r5, r6, r1)     // Catch: java.lang.Exception -> L4f
        Ld:
            java.lang.String r3 = "TLS"
            if (r0 != 0) goto L16
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch: java.lang.Exception -> L4f
            goto L1a
        L16:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r3, r0)     // Catch: java.lang.Exception -> L4f
        L1a:
            if (r6 != 0) goto L1e
            r3 = r1
            goto L22
        L1e:
            javax.net.ssl.KeyManager[] r3 = r6.getKeyManagers()     // Catch: java.lang.Exception -> L4f
        L22:
            if (r2 != 0) goto L26
            r2 = r1
            goto L2a
        L26:
            javax.net.ssl.TrustManager[] r2 = r2.getTrustManagers()     // Catch: java.lang.Exception -> L4f
        L2a:
            r0.init(r3, r2, r1)     // Catch: java.lang.Exception -> L4f
            javax.net.ssl.SSLSessionContext r1 = r0.getClientSessionContext()     // Catch: java.lang.Exception -> L4f
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r4 = 0
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L42
            long r6 = java.lang.Math.min(r7, r2)     // Catch: java.lang.Exception -> L4f
            int r7 = (int) r6     // Catch: java.lang.Exception -> L4f
            r1.setSessionCacheSize(r7)     // Catch: java.lang.Exception -> L4f
        L42:
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4e
            long r2 = java.lang.Math.min(r9, r2)     // Catch: java.lang.Exception -> L4f
            int r3 = (int) r2     // Catch: java.lang.Exception -> L4f
            r1.setSessionTimeout(r3)     // Catch: java.lang.Exception -> L4f
        L4e:
            return r0
        L4f:
            r0 = move-exception
            boolean r1 = r0 instanceof javax.net.ssl.SSLException
            if (r1 == 0) goto L57
            javax.net.ssl.SSLException r0 = (javax.net.ssl.SSLException) r0
            throw r0
        L57:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            java.lang.String r2 = "failed to initialize the client-side SSL context"
            r1.<init>(r2, r0)
            throw r1
    }
}
