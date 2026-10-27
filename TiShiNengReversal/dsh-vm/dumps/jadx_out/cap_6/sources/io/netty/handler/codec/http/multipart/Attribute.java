package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Attribute extends io.netty.handler.codec.http.multipart.HttpData {
    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.Attribute copy();

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.Attribute duplicate();

    java.lang.String getValue() throws java.io.IOException;

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.Attribute replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.Attribute mo39retain();

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.Attribute mo40retain(int r1);

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.Attribute retainedDuplicate();

    void setValue(java.lang.String r1) throws java.io.IOException;

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.Attribute mo41touch();

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.Attribute mo42touch(java.lang.Object r1);
}
