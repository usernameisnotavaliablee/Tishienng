package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CompatibleMarshallingEncoder extends io.netty.handler.codec.MessageToByteEncoder<java.lang.Object> {
    private final io.netty.handler.codec.marshalling.MarshallerProvider provider;

    public CompatibleMarshallingEncoder(io.netty.handler.codec.marshalling.MarshallerProvider r1) {
            r0 = this;
            r0.<init>()
            r0.provider = r1
            return
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected void encode(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.marshalling.MarshallerProvider r0 = r1.provider
            org.jboss.marshalling.Marshaller r2 = r0.getMarshaller(r2)
            io.netty.handler.codec.marshalling.ChannelBufferByteOutput r0 = new io.netty.handler.codec.marshalling.ChannelBufferByteOutput
            r0.<init>(r4)
            r2.start(r0)
            r2.writeObject(r3)
            r2.finish()
            r2.close()
            return
    }
}
