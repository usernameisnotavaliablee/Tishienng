package io.netty.handler.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChunkedInput<B> {
    void close() throws java.lang.Exception;

    boolean isEndOfInput() throws java.lang.Exception;

    long length();

    long progress();

    B readChunk(io.netty.buffer.ByteBufAllocator r1) throws java.lang.Exception;

    @java.lang.Deprecated
    B readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;
}
