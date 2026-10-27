package com.tsn.chat.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends io.netty.handler.codec.ByteToMessageDecoder {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            int r2 = r3.readableBytes()
            r3.markReaderIndex()
            r3.readByte()
            short r0 = r3.readShort()
            r3.resetReaderIndex()
            if (r2 >= r0) goto L14
            return
        L14:
            io.netty.buffer.ByteBuf r2 = r3.readBytes(r0)
            r4.add(r2)
            return
    }
}
