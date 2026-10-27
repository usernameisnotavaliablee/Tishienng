package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslCachingX509KeyManagerFactory extends javax.net.ssl.KeyManagerFactory {


    public OpenSslCachingX509KeyManagerFactory(javax.net.ssl.KeyManagerFactory r3) {
            r2 = this;
            io.netty.handler.ssl.OpenSslCachingX509KeyManagerFactory$1 r0 = new io.netty.handler.ssl.OpenSslCachingX509KeyManagerFactory$1
            r0.<init>(r3)
            java.security.Provider r1 = r3.getProvider()
            java.lang.String r3 = r3.getAlgorithm()
            r2.<init>(r0, r1, r3)
            return
    }
}
