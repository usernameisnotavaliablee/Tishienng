package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultMarshallerProvider implements io.netty.handler.codec.marshalling.MarshallerProvider {
    private final org.jboss.marshalling.MarshallingConfiguration config;
    private final org.jboss.marshalling.MarshallerFactory factory;

    public DefaultMarshallerProvider(org.jboss.marshalling.MarshallerFactory r1, org.jboss.marshalling.MarshallingConfiguration r2) {
            r0 = this;
            r0.<init>()
            r0.factory = r1
            r0.config = r2
            return
    }

    @Override // io.netty.handler.codec.marshalling.MarshallerProvider
    public org.jboss.marshalling.Marshaller getMarshaller(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            org.jboss.marshalling.MarshallerFactory r2 = r1.factory
            org.jboss.marshalling.MarshallingConfiguration r0 = r1.config
            org.jboss.marshalling.Marshaller r2 = r2.createMarshaller(r0)
            return r2
    }
}
