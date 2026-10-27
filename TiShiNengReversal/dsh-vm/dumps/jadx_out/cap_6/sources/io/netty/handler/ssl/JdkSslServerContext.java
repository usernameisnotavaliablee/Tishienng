package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class JdkSslServerContext extends io.netty.handler.ssl.JdkSslContext {
    @java.lang.Deprecated
    public JdkSslServerContext(java.io.File r14, java.io.File r15) throws javax.net.ssl.SSLException {
            r13 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r6 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator r7 = io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.INSTANCE
            r10 = 0
            r12 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r0 = r13
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12)
            return
    }

    @java.lang.Deprecated
    public JdkSslServerContext(java.io.File r12, java.io.File r13, java.lang.String r14) throws javax.net.ssl.SSLException {
            r11 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r5 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator r6 = io.netty.handler.ssl.JdkDefaultApplicationProtocolNegotiator.INSTANCE
            r7 = 0
            r9 = 0
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return
    }

    @java.lang.Deprecated
    public JdkSslServerContext(java.io.File r15, java.io.File r16, java.lang.String r17, java.lang.Iterable<java.lang.String> r18, io.netty.handler.ssl.CipherSuiteFilter r19, io.netty.handler.ssl.ApplicationProtocolConfig r20, long r21, long r23) throws javax.net.ssl.SSLException {
            r14 = this;
            r0 = 1
            r1 = r20
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r8 = io.netty.handler.ssl.JdkSslContext.toNegotiator(r1, r0)
            java.lang.String r13 = java.security.KeyStore.getDefaultType()
            r2 = 0
            r1 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11, r13)
            return
    }

    @java.lang.Deprecated
    public JdkSslServerContext(java.io.File r14, java.io.File r15, java.lang.String r16, java.lang.Iterable<java.lang.String> r17, io.netty.handler.ssl.CipherSuiteFilter r18, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r19, long r20, long r22) throws javax.net.ssl.SSLException {
            r13 = this;
            r1 = 0
            java.lang.String r12 = java.security.KeyStore.getDefaultType()
            r0 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12)
            return
    }

    @java.lang.Deprecated
    public JdkSslServerContext(java.io.File r14, java.io.File r15, java.lang.String r16, java.lang.Iterable<java.lang.String> r17, java.lang.Iterable<java.lang.String> r18, long r19, long r21) throws javax.net.ssl.SSLException {
            r13 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r6 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.ApplicationProtocolConfig r0 = io.netty.handler.ssl.SslContext.toApplicationProtocolConfig(r18)
            r1 = 1
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r7 = io.netty.handler.ssl.JdkSslContext.toNegotiator(r0, r1)
            java.lang.String r12 = java.security.KeyStore.getDefaultType()
            r1 = 0
            r0 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r8 = r19
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12)
            return
    }

    @java.lang.Deprecated
    public JdkSslServerContext(java.io.File r22, javax.net.ssl.TrustManagerFactory r23, java.io.File r24, java.io.File r25, java.lang.String r26, javax.net.ssl.KeyManagerFactory r27, java.lang.Iterable<java.lang.String> r28, io.netty.handler.ssl.CipherSuiteFilter r29, io.netty.handler.ssl.ApplicationProtocolConfig r30, long r31, long r33) throws javax.net.ssl.SSLException {
            r21 = this;
            java.security.cert.X509Certificate[] r1 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r22)
            java.security.cert.X509Certificate[] r3 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r24)
            java.security.PrivateKey r4 = io.netty.handler.ssl.SslContext.toPrivateKeyInternal(r25, r26)
            r11 = 0
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
            r14 = 0
            r12 = r21
            r15 = r28
            r16 = r29
            r17 = r30
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return
    }

    @java.lang.Deprecated
    public JdkSslServerContext(java.io.File r22, javax.net.ssl.TrustManagerFactory r23, java.io.File r24, java.io.File r25, java.lang.String r26, javax.net.ssl.KeyManagerFactory r27, java.lang.Iterable<java.lang.String> r28, io.netty.handler.ssl.CipherSuiteFilter r29, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r30, long r31, long r33) throws javax.net.ssl.SSLException {
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
            r14 = 0
            r12 = r21
            r15 = r28
            r16 = r29
            r17 = r30
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return
    }

    JdkSslServerContext(java.security.Provider r17, java.io.File r18, java.io.File r19, java.lang.String r20, java.lang.Iterable<java.lang.String> r21, io.netty.handler.ssl.CipherSuiteFilter r22, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r23, long r24, long r26, java.lang.String r28) throws javax.net.ssl.SSLException {
            r16 = this;
            java.security.cert.X509Certificate[] r3 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r18)
            java.security.PrivateKey r4 = io.netty.handler.ssl.SslContext.toPrivateKeyInternal(r19, r20)
            r6 = 0
            r1 = 0
            r2 = 0
            r0 = r17
            r5 = r20
            r7 = r24
            r9 = r26
            r11 = r28
            javax.net.ssl.SSLContext r8 = newSSLContext(r0, r1, r2, r3, r4, r5, r6, r7, r9, r11)
            io.netty.handler.ssl.ClientAuth r13 = io.netty.handler.ssl.ClientAuth.NONE
            r14 = 0
            r15 = 0
            r9 = 0
            r7 = r16
            r10 = r21
            r11 = r22
            r12 = r23
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    JdkSslServerContext(java.security.Provider r13, java.security.cert.X509Certificate[] r14, javax.net.ssl.TrustManagerFactory r15, java.security.cert.X509Certificate[] r16, java.security.PrivateKey r17, java.lang.String r18, javax.net.ssl.KeyManagerFactory r19, java.lang.Iterable<java.lang.String> r20, io.netty.handler.ssl.CipherSuiteFilter r21, io.netty.handler.ssl.ApplicationProtocolConfig r22, long r23, long r25, io.netty.handler.ssl.ClientAuth r27, java.lang.String[] r28, boolean r29, java.lang.String r30) throws javax.net.ssl.SSLException {
            r12 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r23
            r9 = r25
            r11 = r30
            javax.net.ssl.SSLContext r1 = newSSLContext(r0, r1, r2, r3, r4, r5, r6, r7, r9, r11)
            r13 = 1
            r14 = r22
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator r5 = io.netty.handler.ssl.JdkSslContext.toNegotiator(r14, r13)
            r2 = 0
            r0 = r12
            r3 = r20
            r4 = r21
            r6 = r27
            r7 = r28
            r8 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private static javax.net.ssl.SSLContext newSSLContext(java.security.Provider r0, java.security.cert.X509Certificate[] r1, javax.net.ssl.TrustManagerFactory r2, java.security.cert.X509Certificate[] r3, java.security.PrivateKey r4, java.lang.String r5, javax.net.ssl.KeyManagerFactory r6, long r7, long r9, java.lang.String r11) throws javax.net.ssl.SSLException {
            if (r4 != 0) goto Ld
            if (r6 == 0) goto L5
            goto Ld
        L5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key, keyManagerFactory"
            r0.<init>(r1)
            throw r0
        Ld:
            if (r1 == 0) goto L13
            javax.net.ssl.TrustManagerFactory r2 = io.netty.handler.ssl.SslContext.buildTrustManagerFactory(r1, r2, r11)     // Catch: java.lang.Exception -> L58
        L13:
            r1 = 0
            if (r4 == 0) goto L1a
            javax.net.ssl.KeyManagerFactory r6 = io.netty.handler.ssl.SslContext.buildKeyManagerFactory(r3, r4, r5, r6, r1)     // Catch: java.lang.Exception -> L58
        L1a:
            java.lang.String r3 = "TLS"
            if (r0 != 0) goto L23
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch: java.lang.Exception -> L58
            goto L27
        L23:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r3, r0)     // Catch: java.lang.Exception -> L58
        L27:
            javax.net.ssl.KeyManager[] r3 = r6.getKeyManagers()     // Catch: java.lang.Exception -> L58
            if (r2 != 0) goto L2f
            r2 = r1
            goto L33
        L2f:
            javax.net.ssl.TrustManager[] r2 = r2.getTrustManagers()     // Catch: java.lang.Exception -> L58
        L33:
            r0.init(r3, r2, r1)     // Catch: java.lang.Exception -> L58
            javax.net.ssl.SSLSessionContext r1 = r0.getServerSessionContext()     // Catch: java.lang.Exception -> L58
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r4 = 0
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4b
            long r6 = java.lang.Math.min(r7, r2)     // Catch: java.lang.Exception -> L58
            int r7 = (int) r6     // Catch: java.lang.Exception -> L58
            r1.setSessionCacheSize(r7)     // Catch: java.lang.Exception -> L58
        L4b:
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 <= 0) goto L57
            long r2 = java.lang.Math.min(r9, r2)     // Catch: java.lang.Exception -> L58
            int r3 = (int) r2     // Catch: java.lang.Exception -> L58
            r1.setSessionTimeout(r3)     // Catch: java.lang.Exception -> L58
        L57:
            return r0
        L58:
            r0 = move-exception
            boolean r1 = r0 instanceof javax.net.ssl.SSLException
            if (r1 == 0) goto L60
            javax.net.ssl.SSLException r0 = (javax.net.ssl.SSLException) r0
            throw r0
        L60:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            java.lang.String r2 = "failed to initialize the server-side SSL context"
            r1.<init>(r2, r0)
            throw r1
    }
}
