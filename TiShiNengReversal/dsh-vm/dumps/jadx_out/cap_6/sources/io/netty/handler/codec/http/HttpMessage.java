package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface HttpMessage extends io.netty.handler.codec.http.HttpObject {
    @java.lang.Deprecated
    io.netty.handler.codec.http.HttpVersion getProtocolVersion();

    io.netty.handler.codec.http.HttpHeaders headers();

    io.netty.handler.codec.http.HttpVersion protocolVersion();

    io.netty.handler.codec.http.HttpMessage setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1);
}
