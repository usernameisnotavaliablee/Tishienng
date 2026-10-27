package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MarshallingEncoder extends io.netty.handler.codec.MessageToByteEncoder<java.lang.Object> {
    private static final byte[] LENGTH_PLACEHOLDER = null;
    private final io.netty.handler.codec.marshalling.MarshallerProvider provider;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            io.netty.handler.codec.marshalling.MarshallingEncoder.LENGTH_PLACEHOLDER = r0
            return
    }

    public MarshallingEncoder(io.netty.handler.codec.marshalling.MarshallerProvider r1) {
            r0 = this;
            r0.<init>()
            r0.provider = r1
            return
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected void encode(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4, io.netty.buffer.ByteBuf r5) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.marshalling.MarshallerProvider r0 = r2.provider
            org.jboss.marshalling.Marshaller r3 = r0.getMarshaller(r3)
            int r0 = r5.writerIndex()
            byte[] r1 = io.netty.handler.codec.marshalling.MarshallingEncoder.LENGTH_PLACEHOLDER
            r5.writeBytes(r1)
            io.netty.handler.codec.marshalling.ChannelBufferByteOutput r1 = new io.netty.handler.codec.marshalling.ChannelBufferByteOutput
            r1.<init>(r5)
            r3.start(r1)
            r3.writeObject(r4)
            r3.finish()
            r3.close()
            int r3 = r5.writerIndex()
            int r3 = r3 - r0
            int r3 = r3 + (-4)
            r5.setInt(r0, r3)
            return
    }
}
