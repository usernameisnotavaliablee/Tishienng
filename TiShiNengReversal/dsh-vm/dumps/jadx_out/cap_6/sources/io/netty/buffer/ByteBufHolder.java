package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ByteBufHolder extends io.netty.util.ReferenceCounted {
    io.netty.buffer.ByteBuf content();

    io.netty.buffer.ByteBufHolder copy();

    io.netty.buffer.ByteBufHolder duplicate();

    io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1);

    /* renamed from: retain */
    io.netty.buffer.ByteBufHolder mo39retain();

    /* renamed from: retain */
    io.netty.buffer.ByteBufHolder mo40retain(int r1);

    io.netty.buffer.ByteBufHolder retainedDuplicate();

    /* renamed from: touch */
    io.netty.buffer.ByteBufHolder mo41touch();

    /* renamed from: touch */
    io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1);
}
