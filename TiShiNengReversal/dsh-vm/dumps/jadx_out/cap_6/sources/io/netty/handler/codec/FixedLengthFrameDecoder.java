package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FixedLengthFrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private final int frameLength;

    public FixedLengthFrameDecoder(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "frameLength"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.frameLength = r2
            return
    }

    protected java.lang.Object decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r1 = this;
            int r2 = r3.readableBytes()
            int r0 = r1.frameLength
            if (r2 >= r0) goto La
            r2 = 0
            return r2
        La:
            io.netty.buffer.ByteBuf r2 = r3.readRetainedSlice(r0)
            return r2
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected final void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            java.lang.Object r1 = r0.decode(r1, r2)
            if (r1 == 0) goto L9
            r3.add(r1)
        L9:
            return
    }
}
