package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class InsecureTrustManagerFactory extends io.netty.handler.ssl.util.SimpleTrustManagerFactory {
    public static final javax.net.ssl.TrustManagerFactory INSTANCE = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final javax.net.ssl.TrustManager tm = null;


    static {
            java.lang.Class<io.netty.handler.ssl.util.InsecureTrustManagerFactory> r0 = io.netty.handler.ssl.util.InsecureTrustManagerFactory.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.util.InsecureTrustManagerFactory.logger = r0
            io.netty.handler.ssl.util.InsecureTrustManagerFactory r0 = new io.netty.handler.ssl.util.InsecureTrustManagerFactory
            r0.<init>()
            io.netty.handler.ssl.util.InsecureTrustManagerFactory.INSTANCE = r0
            io.netty.handler.ssl.util.InsecureTrustManagerFactory$1 r0 = new io.netty.handler.ssl.util.InsecureTrustManagerFactory$1
            r0.<init>()
            io.netty.handler.ssl.util.InsecureTrustManagerFactory.tm = r0
            return
    }

    private InsecureTrustManagerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.util.InsecureTrustManagerFactory.logger
            return r0
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected javax.net.ssl.TrustManager[] engineGetTrustManagers() {
            r3 = this;
            r0 = 1
            javax.net.ssl.TrustManager[] r0 = new javax.net.ssl.TrustManager[r0]
            javax.net.ssl.TrustManager r1 = io.netty.handler.ssl.util.InsecureTrustManagerFactory.tm
            r2 = 0
            r0[r2] = r1
            return r0
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected void engineInit(java.security.KeyStore r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected void engineInit(javax.net.ssl.ManagerFactoryParameters r1) throws java.lang.Exception {
            r0 = this;
            return
    }
}
