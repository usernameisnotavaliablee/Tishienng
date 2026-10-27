package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2DataFrame extends io.netty.handler.codec.http2.Http2StreamFrame, io.netty.buffer.ByteBufHolder {
    @Override // io.netty.buffer.ByteBufHolder
    io.netty.buffer.ByteBuf content();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http2.Http2DataFrame copy();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http2.Http2DataFrame duplicate();

    int initialFlowControlledBytes();

    boolean isEndStream();

    int padding();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http2.Http2DataFrame replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http2.Http2DataFrame mo39retain();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http2.Http2DataFrame mo40retain(int r1);

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http2.Http2DataFrame retainedDuplicate();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http2.Http2DataFrame mo41touch();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http2.Http2DataFrame mo42touch(java.lang.Object r1);
}
