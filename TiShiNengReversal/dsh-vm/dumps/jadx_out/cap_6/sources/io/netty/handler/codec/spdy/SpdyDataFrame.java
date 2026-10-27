package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SpdyDataFrame extends io.netty.buffer.ByteBufHolder, io.netty.handler.codec.spdy.SpdyStreamFrame {
    @Override // io.netty.buffer.ByteBufHolder
    io.netty.buffer.ByteBuf content();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.spdy.SpdyDataFrame copy();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.spdy.SpdyDataFrame duplicate();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.spdy.SpdyDataFrame replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.spdy.SpdyDataFrame mo39retain();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.spdy.SpdyDataFrame mo40retain(int r1);

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.spdy.SpdyDataFrame retainedDuplicate();

    io.netty.handler.codec.spdy.SpdyDataFrame setLast(boolean r1);

    io.netty.handler.codec.spdy.SpdyDataFrame setStreamId(int r1);

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.spdy.SpdyDataFrame mo41touch();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.spdy.SpdyDataFrame mo42touch(java.lang.Object r1);
}
