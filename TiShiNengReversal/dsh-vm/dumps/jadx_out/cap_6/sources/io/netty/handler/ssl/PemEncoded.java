package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
interface PemEncoded extends io.netty.buffer.ByteBufHolder {
    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.ssl.PemEncoded copy();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.ssl.PemEncoded duplicate();

    boolean isSensitive();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.ssl.PemEncoded replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.ssl.PemEncoded mo39retain();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.ssl.PemEncoded mo40retain(int r1);

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.ssl.PemEncoded retainedDuplicate();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.ssl.PemEncoded mo41touch();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.ssl.PemEncoded mo42touch(java.lang.Object r1);
}
