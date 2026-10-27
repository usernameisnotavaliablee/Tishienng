package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface HttpData extends io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder {
    void addContent(io.netty.buffer.ByteBuf r1, boolean r2) throws java.io.IOException;

    void checkSize(long r1) throws java.io.IOException;

    io.netty.handler.codec.http.multipart.HttpData copy();

    long definedLength();

    void delete();

    io.netty.handler.codec.http.multipart.HttpData duplicate();

    byte[] get() throws java.io.IOException;

    io.netty.buffer.ByteBuf getByteBuf() throws java.io.IOException;

    java.nio.charset.Charset getCharset();

    io.netty.buffer.ByteBuf getChunk(int r1) throws java.io.IOException;

    java.io.File getFile() throws java.io.IOException;

    long getMaxSize();

    java.lang.String getString() throws java.io.IOException;

    java.lang.String getString(java.nio.charset.Charset r1) throws java.io.IOException;

    boolean isCompleted();

    boolean isInMemory();

    long length();

    boolean renameTo(java.io.File r1) throws java.io.IOException;

    io.netty.handler.codec.http.multipart.HttpData replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.HttpData mo39retain();

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.HttpData mo40retain(int r1);

    io.netty.handler.codec.http.multipart.HttpData retainedDuplicate();

    void setCharset(java.nio.charset.Charset r1);

    void setContent(io.netty.buffer.ByteBuf r1) throws java.io.IOException;

    void setContent(java.io.File r1) throws java.io.IOException;

    void setContent(java.io.InputStream r1) throws java.io.IOException;

    void setMaxSize(long r1);

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.HttpData mo41touch();

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r1);
}
