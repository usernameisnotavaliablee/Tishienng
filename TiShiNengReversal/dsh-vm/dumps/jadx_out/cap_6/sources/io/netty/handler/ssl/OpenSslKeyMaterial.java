package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
interface OpenSslKeyMaterial extends io.netty.util.ReferenceCounted {
    java.security.cert.X509Certificate[] certificateChain();

    long certificateChainAddress();

    long privateKeyAddress();

    boolean release();

    boolean release(int r1);

    io.netty.handler.ssl.OpenSslKeyMaterial retain();

    io.netty.handler.ssl.OpenSslKeyMaterial retain(int r1);

    io.netty.handler.ssl.OpenSslKeyMaterial touch();

    io.netty.handler.ssl.OpenSslKeyMaterial touch(java.lang.Object r1);
}
