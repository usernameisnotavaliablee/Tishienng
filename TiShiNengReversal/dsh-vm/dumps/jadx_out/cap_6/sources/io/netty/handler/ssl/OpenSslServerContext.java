package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslServerContext extends io.netty.handler.ssl.OpenSslContext {
    private final io.netty.handler.ssl.OpenSslServerSessionContext sessionContext;

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r2, java.io.File r3) throws javax.net.ssl.SSLException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r12, java.io.File r13, java.lang.String r14) throws javax.net.ssl.SSLException {
            r11 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r5 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.ApplicationProtocolConfig r6 = io.netty.handler.ssl.ApplicationProtocolConfig.DISABLED
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
    public OpenSslServerContext(java.io.File r12, java.io.File r13, java.lang.String r14, java.lang.Iterable<java.lang.String> r15, io.netty.handler.ssl.ApplicationProtocolConfig r16, long r17, long r19) throws javax.net.ssl.SSLException {
            r11 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r5 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r15, java.io.File r16, java.lang.String r17, java.lang.Iterable<java.lang.String> r18, io.netty.handler.ssl.CipherSuiteFilter r19, io.netty.handler.ssl.ApplicationProtocolConfig r20, long r21, long r23) throws javax.net.ssl.SSLException {
            r14 = this;
            r2 = 0
            r6 = 0
            r1 = 0
            r0 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r12 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r11, java.io.File r12, java.lang.String r13, java.lang.Iterable<java.lang.String> r14, java.lang.Iterable<java.lang.String> r15, long r16, long r18) throws javax.net.ssl.SSLException {
            r10 = this;
            io.netty.handler.ssl.ApplicationProtocolConfig r5 = io.netty.handler.ssl.SslContext.toApplicationProtocolConfig(r15)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r6 = r16
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r12, java.io.File r13, java.lang.String r14, javax.net.ssl.TrustManagerFactory r15, java.lang.Iterable<java.lang.String> r16, io.netty.handler.ssl.ApplicationProtocolConfig r17, long r18, long r20) throws javax.net.ssl.SSLException {
            r11 = this;
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r6 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toNegotiator(r17)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r15, java.io.File r16, java.lang.String r17, javax.net.ssl.TrustManagerFactory r18, java.lang.Iterable<java.lang.String> r19, io.netty.handler.ssl.CipherSuiteFilter r20, io.netty.handler.ssl.ApplicationProtocolConfig r21, long r22, long r24) throws javax.net.ssl.SSLException {
            r14 = this;
            r6 = 0
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r9 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toNegotiator(r21)
            r1 = 0
            r0 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r2 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r15, java.io.File r16, java.lang.String r17, javax.net.ssl.TrustManagerFactory r18, java.lang.Iterable<java.lang.String> r19, io.netty.handler.ssl.CipherSuiteFilter r20, io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r21, long r22, long r24) throws javax.net.ssl.SSLException {
            r14 = this;
            r1 = 0
            r6 = 0
            r0 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r2 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r15, java.io.File r16, java.lang.String r17, javax.net.ssl.TrustManagerFactory r18, java.lang.Iterable<java.lang.String> r19, io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r20, long r21, long r23) throws javax.net.ssl.SSLException {
            r14 = this;
            r6 = 0
            r8 = 0
            r1 = 0
            r0 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r2 = r18
            r7 = r19
            r9 = r20
            r10 = r21
            r12 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r15, javax.net.ssl.TrustManagerFactory r16, java.io.File r17, java.io.File r18, java.lang.String r19, javax.net.ssl.KeyManagerFactory r20, java.lang.Iterable<java.lang.String> r21, io.netty.handler.ssl.CipherSuiteFilter r22, io.netty.handler.ssl.ApplicationProtocolConfig r23, long r24, long r26) throws javax.net.ssl.SSLException {
            r14 = this;
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r9 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toNegotiator(r23)
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r10 = r24
            r12 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslServerContext(java.io.File r20, javax.net.ssl.TrustManagerFactory r21, java.io.File r22, java.io.File r23, java.lang.String r24, javax.net.ssl.KeyManagerFactory r25, java.lang.Iterable<java.lang.String> r26, io.netty.handler.ssl.CipherSuiteFilter r27, io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r28, long r29, long r31) throws javax.net.ssl.SSLException {
            r19 = this;
            java.security.cert.X509Certificate[] r1 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r20)
            java.security.cert.X509Certificate[] r3 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r22)
            java.security.PrivateKey r4 = io.netty.handler.ssl.SslContext.toPrivateKeyInternal(r23, r24)
            io.netty.handler.ssl.ClientAuth r14 = io.netty.handler.ssl.ClientAuth.NONE
            r17 = 0
            java.lang.String r18 = java.security.KeyStore.getDefaultType()
            r15 = 0
            r16 = 0
            r0 = r19
            r2 = r21
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r12 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            return
    }

    OpenSslServerContext(java.security.cert.X509Certificate[] r20, javax.net.ssl.TrustManagerFactory r21, java.security.cert.X509Certificate[] r22, java.security.PrivateKey r23, java.lang.String r24, javax.net.ssl.KeyManagerFactory r25, java.lang.Iterable<java.lang.String> r26, io.netty.handler.ssl.CipherSuiteFilter r27, io.netty.handler.ssl.ApplicationProtocolConfig r28, long r29, long r31, io.netty.handler.ssl.ClientAuth r33, java.lang.String[] r34, boolean r35, boolean r36, java.lang.String r37) throws javax.net.ssl.SSLException {
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

    private OpenSslServerContext(java.security.cert.X509Certificate[] r16, javax.net.ssl.TrustManagerFactory r17, java.security.cert.X509Certificate[] r18, java.security.PrivateKey r19, java.lang.String r20, javax.net.ssl.KeyManagerFactory r21, java.lang.Iterable<java.lang.String> r22, io.netty.handler.ssl.CipherSuiteFilter r23, io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r24, long r25, long r27, io.netty.handler.ssl.ClientAuth r29, java.lang.String[] r30, boolean r31, boolean r32, java.lang.String r33) throws javax.net.ssl.SSLException {
            r15 = this;
            r9 = 1
            r1 = r15
            r10 = r18
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r7 = r27
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            io.netty.handler.ssl.OpenSslKeyMaterialProvider.validateKeyMaterialSupported(r18, r19, r20)     // Catch: java.lang.Throwable -> L3b
            long r2 = r15.ctx     // Catch: java.lang.Throwable -> L3b
            io.netty.handler.ssl.OpenSslEngineMap r0 = r15.engineMap     // Catch: java.lang.Throwable -> L3b
            r22 = r15
            r26 = r16
            r27 = r17
            r28 = r18
            r29 = r19
            r30 = r20
            r31 = r21
            r32 = r33
            r25 = r0
            r23 = r2
            io.netty.handler.ssl.OpenSslServerSessionContext r0 = io.netty.handler.ssl.ReferenceCountedOpenSslServerContext.newSessionContext(r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> L3b
            r15.sessionContext = r0     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r0 = move-exception
            r15.release()
            throw r0
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
