package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FileUpload extends io.netty.handler.codec.http.multipart.HttpData {
    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.FileUpload copy();

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.FileUpload duplicate();

    java.lang.String getContentTransferEncoding();

    java.lang.String getContentType();

    java.lang.String getFilename();

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.FileUpload replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.FileUpload mo39retain();

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.FileUpload mo40retain(int r1);

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.http.multipart.FileUpload retainedDuplicate();

    void setContentTransferEncoding(java.lang.String r1);

    void setContentType(java.lang.String r1);

    void setFilename(java.lang.String r1);

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.FileUpload mo41touch();

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.FileUpload mo42touch(java.lang.Object r1);
}
