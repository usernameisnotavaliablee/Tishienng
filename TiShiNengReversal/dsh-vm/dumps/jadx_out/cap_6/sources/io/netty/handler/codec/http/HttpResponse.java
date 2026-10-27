package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface HttpResponse extends io.netty.handler.codec.http.HttpMessage {
    @java.lang.Deprecated
    io.netty.handler.codec.http.HttpResponseStatus getStatus();

    @Override // io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    io.netty.handler.codec.http.HttpResponse setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1);

    io.netty.handler.codec.http.HttpResponse setStatus(io.netty.handler.codec.http.HttpResponseStatus r1);

    io.netty.handler.codec.http.HttpResponseStatus status();
}
