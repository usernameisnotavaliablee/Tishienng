package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface HttpContent extends io.netty.handler.codec.http.HttpObject, io.netty.buffer.ByteBufHolder {
    io.netty.handler.codec.http.HttpContent copy();

    io.netty.handler.codec.http.HttpContent duplicate();

    io.netty.handler.codec.http.HttpContent replace(io.netty.buffer.ByteBuf r1);

    /* renamed from: retain */
    io.netty.handler.codec.http.HttpContent mo39retain();

    /* renamed from: retain */
    io.netty.handler.codec.http.HttpContent mo40retain(int r1);

    io.netty.handler.codec.http.HttpContent retainedDuplicate();

    /* renamed from: touch */
    io.netty.handler.codec.http.HttpContent mo41touch();

    /* renamed from: touch */
    io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r1);
}
