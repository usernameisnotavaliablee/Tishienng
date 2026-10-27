package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ThreadLocalUnmarshallerProvider implements io.netty.handler.codec.marshalling.UnmarshallerProvider {
    private final org.jboss.marshalling.MarshallingConfiguration config;
    private final org.jboss.marshalling.MarshallerFactory factory;
    private final io.netty.util.concurrent.FastThreadLocal<org.jboss.marshalling.Unmarshaller> unmarshallers;

    public ThreadLocalUnmarshallerProvider(org.jboss.marshalling.MarshallerFactory r2, org.jboss.marshalling.MarshallingConfiguration r3) {
            r1 = this;
            r1.<init>()
            io.netty.util.concurrent.FastThreadLocal r0 = new io.netty.util.concurrent.FastThreadLocal
            r0.<init>()
            r1.unmarshallers = r0
            r1.factory = r2
            r1.config = r3
            return
    }

    @Override // io.netty.handler.codec.marshalling.UnmarshallerProvider
    public org.jboss.marshalling.Unmarshaller getUnmarshaller(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.concurrent.FastThreadLocal<org.jboss.marshalling.Unmarshaller> r2 = r1.unmarshallers
            java.lang.Object r2 = r2.get()
            org.jboss.marshalling.Unmarshaller r2 = (org.jboss.marshalling.Unmarshaller) r2
            if (r2 != 0) goto L17
            org.jboss.marshalling.MarshallerFactory r2 = r1.factory
            org.jboss.marshalling.MarshallingConfiguration r0 = r1.config
            org.jboss.marshalling.Unmarshaller r2 = r2.createUnmarshaller(r0)
            io.netty.util.concurrent.FastThreadLocal<org.jboss.marshalling.Unmarshaller> r0 = r1.unmarshallers
            r0.set(r2)
        L17:
            return r2
    }
}
