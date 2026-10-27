package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ThreadLocalMarshallerProvider implements io.netty.handler.codec.marshalling.MarshallerProvider {
    private final org.jboss.marshalling.MarshallingConfiguration config;
    private final org.jboss.marshalling.MarshallerFactory factory;
    private final io.netty.util.concurrent.FastThreadLocal<org.jboss.marshalling.Marshaller> marshallers;

    public ThreadLocalMarshallerProvider(org.jboss.marshalling.MarshallerFactory r2, org.jboss.marshalling.MarshallingConfiguration r3) {
            r1 = this;
            r1.<init>()
            io.netty.util.concurrent.FastThreadLocal r0 = new io.netty.util.concurrent.FastThreadLocal
            r0.<init>()
            r1.marshallers = r0
            r1.factory = r2
            r1.config = r3
            return
    }

    @Override // io.netty.handler.codec.marshalling.MarshallerProvider
    public org.jboss.marshalling.Marshaller getMarshaller(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.concurrent.FastThreadLocal<org.jboss.marshalling.Marshaller> r2 = r1.marshallers
            java.lang.Object r2 = r2.get()
            org.jboss.marshalling.Marshaller r2 = (org.jboss.marshalling.Marshaller) r2
            if (r2 != 0) goto L17
            org.jboss.marshalling.MarshallerFactory r2 = r1.factory
            org.jboss.marshalling.MarshallingConfiguration r0 = r1.config
            org.jboss.marshalling.Marshaller r2 = r2.createMarshaller(r0)
            io.netty.util.concurrent.FastThreadLocal<org.jboss.marshalling.Marshaller> r0 = r1.marshallers
            r0.set(r2)
        L17:
            return r2
    }
}
