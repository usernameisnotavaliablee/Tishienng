package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FullHttpResponse extends io.netty.handler.codec.http.HttpResponse, io.netty.handler.codec.http.FullHttpMessage {
    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpResponse copy();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpResponse duplicate();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpResponse replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.FullHttpResponse mo39retain();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.FullHttpResponse mo40retain(int r1);

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpResponse retainedDuplicate();

    @Override // io.netty.handler.codec.http.HttpResponse, io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpRequest
    io.netty.handler.codec.http.FullHttpResponse setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1);

    io.netty.handler.codec.http.FullHttpResponse setStatus(io.netty.handler.codec.http.HttpResponseStatus r1);

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.FullHttpResponse mo41touch();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.FullHttpResponse mo42touch(java.lang.Object r1);
}
