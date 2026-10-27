package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CompatibleMarshallingDecoder extends io.netty.handler.codec.ReplayingDecoder<java.lang.Void> {
    private boolean discardingTooLongFrame;
    protected final int maxObjectSize;
    protected final io.netty.handler.codec.marshalling.UnmarshallerProvider provider;

    public CompatibleMarshallingDecoder(io.netty.handler.codec.marshalling.UnmarshallerProvider r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.provider = r1
            r0.maxObjectSize = r2
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r3.discardingTooLongFrame
            if (r0 == 0) goto Lf
            int r4 = r3.actualReadableBytes()
            r5.skipBytes(r4)
            r3.checkpoint()
            return
        Lf:
            io.netty.handler.codec.marshalling.UnmarshallerProvider r0 = r3.provider
            org.jboss.marshalling.Unmarshaller r4 = r0.getUnmarshaller(r4)
            io.netty.handler.codec.marshalling.ChannelBufferByteInput r0 = new io.netty.handler.codec.marshalling.ChannelBufferByteInput
            r0.<init>(r5)
            int r5 = r3.maxObjectSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L2a
            io.netty.handler.codec.marshalling.LimitingByteInput r5 = new io.netty.handler.codec.marshalling.LimitingByteInput
            int r1 = r3.maxObjectSize
            long r1 = (long) r1
            r5.<init>(r0, r1)
            r0 = r5
        L2a:
            r4.start(r0)     // Catch: java.lang.Throwable -> L3b io.netty.handler.codec.marshalling.LimitingByteInput.TooBigObjectException -> L3d
            java.lang.Object r5 = r4.readObject()     // Catch: java.lang.Throwable -> L3b io.netty.handler.codec.marshalling.LimitingByteInput.TooBigObjectException -> L3d
            r4.finish()     // Catch: java.lang.Throwable -> L3b io.netty.handler.codec.marshalling.LimitingByteInput.TooBigObjectException -> L3d
            r6.add(r5)     // Catch: java.lang.Throwable -> L3b io.netty.handler.codec.marshalling.LimitingByteInput.TooBigObjectException -> L3d
            r4.close()
            return
        L3b:
            r5 = move-exception
            goto L46
        L3d:
            r5 = 1
            r3.discardingTooLongFrame = r5     // Catch: java.lang.Throwable -> L3b
            io.netty.handler.codec.TooLongFrameException r5 = new io.netty.handler.codec.TooLongFrameException     // Catch: java.lang.Throwable -> L3b
            r5.<init>()     // Catch: java.lang.Throwable -> L3b
            throw r5     // Catch: java.lang.Throwable -> L3b
        L46:
            r4.close()
            throw r5
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decodeLast(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            int r0 = r5.readableBytes()
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 == r1) goto La
            goto L1a
        La:
            int r0 = r5.readerIndex()
            byte r0 = r5.getByte(r0)
            r2 = 121(0x79, float:1.7E-43)
            if (r0 != r2) goto L1a
            r5.skipBytes(r1)
            return
        L1a:
            r3.decode(r4, r5, r6)
        L1d:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.TooLongFrameException
            if (r0 == 0) goto L8
            r2.close()
            return
        L8:
            super.exceptionCaught(r2, r3)
            return
    }
}
