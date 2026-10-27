package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FullHttpRequest extends io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.FullHttpMessage {
    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpRequest copy();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpRequest duplicate();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpRequest replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.FullHttpRequest mo39retain();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.FullHttpRequest mo40retain(int r1);

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpRequest retainedDuplicate();

    io.netty.handler.codec.http.FullHttpRequest setMethod(io.netty.handler.codec.http.HttpMethod r1);

    io.netty.handler.codec.http.FullHttpRequest setProtocolVersion(io.netty.handler.codec.http.HttpVersion r1);

    io.netty.handler.codec.http.FullHttpRequest setUri(java.lang.String r1);

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.FullHttpRequest mo41touch();

    @Override // io.netty.handler.codec.http.FullHttpMessage, io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.FullHttpRequest mo42touch(java.lang.Object r1);
}
