package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FullHttpMessage extends io.netty.handler.codec.http.HttpMessage, io.netty.handler.codec.http.LastHttpContent {
    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpMessage copy();

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpMessage duplicate();

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpMessage replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.FullHttpMessage mo39retain();

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.FullHttpMessage mo40retain(int r1);

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.FullHttpMessage retainedDuplicate();

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.FullHttpMessage mo41touch();

    @Override // io.netty.handler.codec.http.LastHttpContent, io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.FullHttpMessage mo42touch(java.lang.Object r1);
}
