package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MarshallingDecoder extends io.netty.handler.codec.LengthFieldBasedFrameDecoder {
    private final io.netty.handler.codec.marshalling.UnmarshallerProvider provider;

    public MarshallingDecoder(io.netty.handler.codec.marshalling.UnmarshallerProvider r2) {
            r1 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1.<init>(r2, r0)
            return
    }

    public MarshallingDecoder(io.netty.handler.codec.marshalling.UnmarshallerProvider r7, int r8) {
            r6 = this;
            r4 = 0
            r5 = 4
            r2 = 0
            r3 = 4
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.provider = r7
            return
    }

    @Override // io.netty.handler.codec.LengthFieldBasedFrameDecoder
    protected java.lang.Object decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r1 = this;
            java.lang.Object r3 = super.decode(r2, r3)
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            if (r3 != 0) goto La
            r2 = 0
            return r2
        La:
            io.netty.handler.codec.marshalling.UnmarshallerProvider r0 = r1.provider
            org.jboss.marshalling.Unmarshaller r2 = r0.getUnmarshaller(r2)
            io.netty.handler.codec.marshalling.ChannelBufferByteInput r0 = new io.netty.handler.codec.marshalling.ChannelBufferByteInput
            r0.<init>(r3)
            r2.start(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r2.readObject()     // Catch: java.lang.Throwable -> L23
            r2.finish()     // Catch: java.lang.Throwable -> L23
            r2.close()
            return r3
        L23:
            r3 = move-exception
            r2.close()
            throw r3
    }

    @Override // io.netty.handler.codec.LengthFieldBasedFrameDecoder
    protected io.netty.buffer.ByteBuf extractFrame(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r2.slice(r3, r4)
            return r1
    }
}
