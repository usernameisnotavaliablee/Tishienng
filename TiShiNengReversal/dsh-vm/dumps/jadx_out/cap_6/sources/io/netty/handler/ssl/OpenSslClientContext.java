package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslClientContext extends io.netty.handler.ssl.OpenSslContext {
    private final io.netty.handler.ssl.OpenSslSessionContext sessionContext;

    @java.lang.Deprecated
    public OpenSslClientContext() throws javax.net.ssl.SSLException {
            r14 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r8 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            r10 = 0
            r12 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslClientContext(java.io.File r2) throws javax.net.ssl.SSLException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public OpenSslClientContext(java.io.File r15, javax.net.ssl.TrustManagerFactory r16) throws javax.net.ssl.SSLException {
            r14 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r8 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            r10 = 0
            r12 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslClientContext(java.io.File r18, javax.net.ssl.TrustManagerFactory r19, java.io.File r20, java.io.File r21, java.lang.String r22, javax.net.ssl.KeyManagerFactory r23, java.lang.Iterable<java.lang.String> r24, io.netty.handler.ssl.CipherSuiteFilter r25, io.netty.handler.ssl.ApplicationProtocolConfig r26, long r27, long r29) throws javax.net.ssl.SSLException {
            r17 = this;
            java.security.cert.X509Certificate[] r1 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r18)
            java.security.cert.X509Certificate[] r3 = io.netty.handler.ssl.SslContext.toX509CertificatesInternal(r20)
            java.security.PrivateKey r4 = io.netty.handler.ssl.SslContext.toPrivateKeyInternal(r21, r22)
            r15 = 0
            java.lang.String r16 = java.security.KeyStore.getDefaultType()
            r10 = 0
            r0 = r17
            r2 = r19
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r11 = r27
            r13 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16)
            return
    }

    @java.lang.Deprecated
    public OpenSslClientContext(java.io.File r15, javax.net.ssl.TrustManagerFactory r16, java.lang.Iterable<java.lang.String> r17, io.netty.handler.ssl.ApplicationProtocolConfig r18, long r19, long r21) throws javax.net.ssl.SSLException {
            r14 = this;
            r6 = 0
            io.netty.handler.ssl.IdentityCipherSuiteFilter r8 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r7 = r17
            r9 = r18
            r10 = r19
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslClientContext(java.io.File r15, javax.net.ssl.TrustManagerFactory r16, java.lang.Iterable<java.lang.String> r17, io.netty.handler.ssl.CipherSuiteFilter r18, io.netty.handler.ssl.ApplicationProtocolConfig r19, long r20, long r22) throws javax.net.ssl.SSLException {
            r14 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    @java.lang.Deprecated
    public OpenSslClientContext(javax.net.ssl.TrustManagerFactory r2) throws javax.net.ssl.SSLException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    OpenSslClientContext(java.security.cert.X509Certificate[] r16, javax.net.ssl.TrustManagerFactory r17, java.security.cert.X509Certificate[] r18, java.security.PrivateKey r19, java.lang.String r20, javax.net.ssl.KeyManagerFactory r21, java.lang.Iterable<java.lang.String> r22, io.netty.handler.ssl.CipherSuiteFilter r23, io.netty.handler.ssl.ApplicationProtocolConfig r24, java.lang.String[] r25, long r26, long r28, boolean r30, java.lang.String r31) throws javax.net.ssl.SSLException {
            r15 = this;
            io.netty.handler.ssl.ClientAuth r11 = io.netty.handler.ssl.ClientAuth.NONE
            r13 = 0
            r9 = 0
            r1 = r15
            r10 = r18
            r2 = r22
            r3 = r23
            r4 = r24
            r12 = r25
            r5 = r26
            r7 = r28
            r14 = r30
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            io.netty.handler.ssl.OpenSslKeyMaterialProvider.validateKeyMaterialSupported(r18, r19, r20)     // Catch: java.lang.Throwable -> L35
            long r2 = r15.ctx     // Catch: java.lang.Throwable -> L35
            io.netty.handler.ssl.OpenSslEngineMap r4 = r15.engineMap     // Catch: java.lang.Throwable -> L35
            r1 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r31
            io.netty.handler.ssl.OpenSslSessionContext r0 = io.netty.handler.ssl.ReferenceCountedOpenSslClientContext.newSessionContext(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L35
            r15.sessionContext = r0     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r0 = move-exception
            r15.release()
            throw r0
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
