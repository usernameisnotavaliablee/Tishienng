package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SslContextBuilder {
    private io.netty.handler.ssl.ApplicationProtocolConfig apn;
    private io.netty.handler.ssl.CipherSuiteFilter cipherFilter;
    private java.lang.Iterable<java.lang.String> ciphers;
    private io.netty.handler.ssl.ClientAuth clientAuth;
    private boolean enableOcsp;
    private final boolean forServer;
    private java.security.PrivateKey key;
    private java.security.cert.X509Certificate[] keyCertChain;
    private javax.net.ssl.KeyManagerFactory keyManagerFactory;
    private java.lang.String keyPassword;
    private java.lang.String keyStoreType;
    private java.lang.String[] protocols;
    private io.netty.handler.ssl.SslProvider provider;
    private long sessionCacheSize;
    private long sessionTimeout;
    private java.security.Provider sslContextProvider;
    private boolean startTls;
    private java.security.cert.X509Certificate[] trustCertCollection;
    private javax.net.ssl.TrustManagerFactory trustManagerFactory;

    private SslContextBuilder(boolean r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.ssl.IdentityCipherSuiteFilter r0 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            r1.cipherFilter = r0
            io.netty.handler.ssl.ClientAuth r0 = io.netty.handler.ssl.ClientAuth.NONE
            r1.clientAuth = r0
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            r1.keyStoreType = r0
            r1.forServer = r2
            return
    }

    public static io.netty.handler.ssl.SslContextBuilder forClient() {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static io.netty.handler.ssl.SslContextBuilder forServer(java.io.File r2, java.io.File r3) {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.SslContextBuilder r2 = r0.keyManager(r2, r3)
            return r2
    }

    public static io.netty.handler.ssl.SslContextBuilder forServer(java.io.File r2, java.io.File r3, java.lang.String r4) {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.SslContextBuilder r2 = r0.keyManager(r2, r3, r4)
            return r2
    }

    public static io.netty.handler.ssl.SslContextBuilder forServer(java.io.InputStream r2, java.io.InputStream r3) {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.SslContextBuilder r2 = r0.keyManager(r2, r3)
            return r2
    }

    public static io.netty.handler.ssl.SslContextBuilder forServer(java.io.InputStream r2, java.io.InputStream r3, java.lang.String r4) {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.SslContextBuilder r2 = r0.keyManager(r2, r3, r4)
            return r2
    }

    public static io.netty.handler.ssl.SslContextBuilder forServer(java.security.PrivateKey r2, java.lang.String r3, java.security.cert.X509Certificate... r4) {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.SslContextBuilder r2 = r0.keyManager(r2, r3, r4)
            return r2
    }

    public static io.netty.handler.ssl.SslContextBuilder forServer(java.security.PrivateKey r2, java.security.cert.X509Certificate... r3) {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.SslContextBuilder r2 = r0.keyManager(r2, r3)
            return r2
    }

    public static io.netty.handler.ssl.SslContextBuilder forServer(javax.net.ssl.KeyManagerFactory r2) {
            io.netty.handler.ssl.SslContextBuilder r0 = new io.netty.handler.ssl.SslContextBuilder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.ssl.SslContextBuilder r2 = r0.keyManager(r2)
            return r2
    }

    public io.netty.handler.ssl.SslContextBuilder applicationProtocolConfig(io.netty.handler.ssl.ApplicationProtocolConfig r1) {
            r0 = this;
            r0.apn = r1
            return r0
    }

    public io.netty.handler.ssl.SslContext build() throws javax.net.ssl.SSLException {
            r22 = this;
            r0 = r22
            boolean r1 = r0.forServer
            if (r1 == 0) goto L43
            io.netty.handler.ssl.SslProvider r2 = r0.provider
            java.security.Provider r3 = r0.sslContextProvider
            java.security.cert.X509Certificate[] r4 = r0.trustCertCollection
            javax.net.ssl.TrustManagerFactory r5 = r0.trustManagerFactory
            java.security.cert.X509Certificate[] r6 = r0.keyCertChain
            java.security.PrivateKey r7 = r0.key
            java.lang.String r8 = r0.keyPassword
            javax.net.ssl.KeyManagerFactory r9 = r0.keyManagerFactory
            java.lang.Iterable<java.lang.String> r10 = r0.ciphers
            io.netty.handler.ssl.CipherSuiteFilter r11 = r0.cipherFilter
            io.netty.handler.ssl.ApplicationProtocolConfig r12 = r0.apn
            long r13 = r0.sessionCacheSize
            r15 = r2
            long r1 = r0.sessionTimeout
            r16 = r1
            io.netty.handler.ssl.ClientAuth r1 = r0.clientAuth
            java.lang.String[] r2 = r0.protocols
            r18 = r1
            boolean r1 = r0.startTls
            r19 = r1
            boolean r1 = r0.enableOcsp
            r20 = r1
            java.lang.String r1 = r0.keyStoreType
            r21 = r18
            r18 = r2
            r2 = r15
            r15 = r16
            r17 = r21
            r21 = r1
            io.netty.handler.ssl.SslContext r1 = io.netty.handler.ssl.SslContext.newServerContextInternal(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)
            return r1
        L43:
            io.netty.handler.ssl.SslProvider r2 = r0.provider
            java.security.Provider r3 = r0.sslContextProvider
            java.security.cert.X509Certificate[] r4 = r0.trustCertCollection
            javax.net.ssl.TrustManagerFactory r5 = r0.trustManagerFactory
            java.security.cert.X509Certificate[] r6 = r0.keyCertChain
            java.security.PrivateKey r7 = r0.key
            java.lang.String r8 = r0.keyPassword
            javax.net.ssl.KeyManagerFactory r9 = r0.keyManagerFactory
            java.lang.Iterable<java.lang.String> r10 = r0.ciphers
            io.netty.handler.ssl.CipherSuiteFilter r11 = r0.cipherFilter
            io.netty.handler.ssl.ApplicationProtocolConfig r12 = r0.apn
            java.lang.String[] r13 = r0.protocols
            long r14 = r0.sessionCacheSize
            r16 = r2
            long r1 = r0.sessionTimeout
            r17 = r1
            boolean r1 = r0.enableOcsp
            java.lang.String r2 = r0.keyStoreType
            r19 = r2
            r2 = r16
            r16 = r17
            r18 = r1
            io.netty.handler.ssl.SslContext r1 = io.netty.handler.ssl.SslContext.newClientContextInternal(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19)
            return r1
    }

    public io.netty.handler.ssl.SslContextBuilder ciphers(java.lang.Iterable<java.lang.String> r2) {
            r1 = this;
            io.netty.handler.ssl.IdentityCipherSuiteFilter r0 = io.netty.handler.ssl.IdentityCipherSuiteFilter.INSTANCE
            io.netty.handler.ssl.SslContextBuilder r2 = r1.ciphers(r2, r0)
            return r2
    }

    public io.netty.handler.ssl.SslContextBuilder ciphers(java.lang.Iterable<java.lang.String> r2, io.netty.handler.ssl.CipherSuiteFilter r3) {
            r1 = this;
            java.lang.String r0 = "cipherFilter"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r1.ciphers = r2
            r1.cipherFilter = r3
            return r1
    }

    public io.netty.handler.ssl.SslContextBuilder clientAuth(io.netty.handler.ssl.ClientAuth r2) {
            r1 = this;
            java.lang.String r0 = "clientAuth"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.ssl.ClientAuth r2 = (io.netty.handler.ssl.ClientAuth) r2
            r1.clientAuth = r2
            return r1
    }

    public io.netty.handler.ssl.SslContextBuilder enableOcsp(boolean r1) {
            r0 = this;
            r0.enableOcsp = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder keyManager(java.io.File r2, java.io.File r3) {
            r1 = this;
            r0 = 0
            io.netty.handler.ssl.SslContextBuilder r2 = r1.keyManager(r2, r3, r0)
            return r2
    }

    public io.netty.handler.ssl.SslContextBuilder keyManager(java.io.File r3, java.io.File r4, java.lang.String r5) {
            r2 = this;
            java.security.cert.X509Certificate[] r3 = io.netty.handler.ssl.SslContext.toX509Certificates(r3)     // Catch: java.lang.Exception -> L25
            java.security.PrivateKey r4 = io.netty.handler.ssl.SslContext.toPrivateKey(r4, r5)     // Catch: java.lang.Exception -> Ld
            io.netty.handler.ssl.SslContextBuilder r3 = r2.keyManager(r4, r5, r3)
            return r3
        Ld:
            r3 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "File does not contain valid private key: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4, r3)
            throw r5
        L25:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "File does not contain valid certificates: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3, r4)
            throw r5
    }

    public io.netty.handler.ssl.SslContextBuilder keyManager(java.io.InputStream r2, java.io.InputStream r3) {
            r1 = this;
            r0 = 0
            io.netty.handler.ssl.SslContextBuilder r2 = r1.keyManager(r2, r3, r0)
            return r2
    }

    public io.netty.handler.ssl.SslContextBuilder keyManager(java.io.InputStream r1, java.io.InputStream r2, java.lang.String r3) {
            r0 = this;
            java.security.cert.X509Certificate[] r1 = io.netty.handler.ssl.SslContext.toX509Certificates(r1)     // Catch: java.lang.Exception -> L16
            java.security.PrivateKey r2 = io.netty.handler.ssl.SslContext.toPrivateKey(r2, r3)     // Catch: java.lang.Exception -> Ld
            io.netty.handler.ssl.SslContextBuilder r1 = r0.keyManager(r2, r3, r1)
            return r1
        Ld:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Input stream does not contain valid private key."
            r2.<init>(r3, r1)
            throw r2
        L16:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Input stream not contain valid certificates."
            r2.<init>(r3, r1)
            throw r2
    }

    public io.netty.handler.ssl.SslContextBuilder keyManager(java.security.PrivateKey r5, java.lang.String r6, java.security.cert.X509Certificate... r7) {
            r4 = this;
            boolean r0 = r4.forServer
            if (r0 == 0) goto L1a
            java.lang.String r0 = "keyCertChain required for servers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            int r0 = r7.length
            if (r0 == 0) goto L12
            java.lang.String r0 = "key required for servers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            goto L1a
        L12:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "keyCertChain must be non-empty"
            r5.<init>(r6)
            throw r5
        L1a:
            r0 = 0
            if (r7 == 0) goto L3d
            int r1 = r7.length
            if (r1 != 0) goto L21
            goto L3d
        L21:
            int r1 = r7.length
            r2 = 0
        L23:
            if (r2 >= r1) goto L34
            r3 = r7[r2]
            if (r3 == 0) goto L2c
            int r2 = r2 + 1
            goto L23
        L2c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "keyCertChain contains null entry"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r7 = r7.clone()
            java.security.cert.X509Certificate[] r7 = (java.security.cert.X509Certificate[]) r7
            r4.keyCertChain = r7
            goto L3f
        L3d:
            r4.keyCertChain = r0
        L3f:
            r4.key = r5
            r4.keyPassword = r6
            r4.keyManagerFactory = r0
            return r4
    }

    public io.netty.handler.ssl.SslContextBuilder keyManager(java.security.PrivateKey r2, java.security.cert.X509Certificate... r3) {
            r1 = this;
            r0 = 0
            io.netty.handler.ssl.SslContextBuilder r2 = r1.keyManager(r2, r0, r3)
            return r2
    }

    public io.netty.handler.ssl.SslContextBuilder keyManager(javax.net.ssl.KeyManagerFactory r2) {
            r1 = this;
            boolean r0 = r1.forServer
            if (r0 == 0) goto L9
            java.lang.String r0 = "keyManagerFactory required for servers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
        L9:
            r0 = 0
            r1.keyCertChain = r0
            r1.key = r0
            r1.keyPassword = r0
            r1.keyManagerFactory = r2
            return r1
    }

    public io.netty.handler.ssl.SslContextBuilder keyStoreType(java.lang.String r1) {
            r0 = this;
            r0.keyStoreType = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder protocols(java.lang.String... r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto La
        L4:
            java.lang.Object r1 = r1.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
        La:
            r0.protocols = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder sessionCacheSize(long r1) {
            r0 = this;
            r0.sessionCacheSize = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder sessionTimeout(long r1) {
            r0 = this;
            r0.sessionTimeout = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder sslContextProvider(java.security.Provider r1) {
            r0 = this;
            r0.sslContextProvider = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder sslProvider(io.netty.handler.ssl.SslProvider r1) {
            r0 = this;
            r0.provider = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder startTls(boolean r1) {
            r0 = this;
            r0.startTls = r1
            return r0
    }

    public io.netty.handler.ssl.SslContextBuilder trustManager(java.io.File r5) {
            r4 = this;
            java.security.cert.X509Certificate[] r0 = io.netty.handler.ssl.SslContext.toX509Certificates(r5)     // Catch: java.lang.Exception -> L9
            io.netty.handler.ssl.SslContextBuilder r5 = r4.trustManager(r0)     // Catch: java.lang.Exception -> L9
            return r5
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "File does not contain valid certificates: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    public io.netty.handler.ssl.SslContextBuilder trustManager(java.io.InputStream r3) {
            r2 = this;
            java.security.cert.X509Certificate[] r3 = io.netty.handler.ssl.SslContext.toX509Certificates(r3)     // Catch: java.lang.Exception -> L9
            io.netty.handler.ssl.SslContextBuilder r3 = r2.trustManager(r3)     // Catch: java.lang.Exception -> L9
            return r3
        L9:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Input stream does not contain valid certificates."
            r0.<init>(r1, r3)
            throw r0
    }

    public io.netty.handler.ssl.SslContextBuilder trustManager(javax.net.ssl.TrustManagerFactory r2) {
            r1 = this;
            r0 = 0
            r1.trustCertCollection = r0
            r1.trustManagerFactory = r2
            return r1
    }

    public io.netty.handler.ssl.SslContextBuilder trustManager(java.security.cert.X509Certificate... r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto La
            java.lang.Object r2 = r2.clone()
            java.security.cert.X509Certificate[] r2 = (java.security.cert.X509Certificate[]) r2
            goto Lb
        La:
            r2 = r0
        Lb:
            r1.trustCertCollection = r2
            r1.trustManagerFactory = r0
            return r1
    }
}
