package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ContextBoundUnmarshallerProvider extends io.netty.handler.codec.marshalling.DefaultUnmarshallerProvider {
    private static final io.netty.util.AttributeKey<org.jboss.marshalling.Unmarshaller> UNMARSHALLER = null;

    static {
            java.lang.Class<io.netty.handler.codec.marshalling.ContextBoundUnmarshallerProvider> r0 = io.netty.handler.codec.marshalling.ContextBoundUnmarshallerProvider.class
            java.lang.String r1 = "UNMARSHALLER"
            io.netty.util.AttributeKey r0 = io.netty.util.AttributeKey.valueOf(r0, r1)
            io.netty.handler.codec.marshalling.ContextBoundUnmarshallerProvider.UNMARSHALLER = r0
            return
    }

    public ContextBoundUnmarshallerProvider(org.jboss.marshalling.MarshallerFactory r1, org.jboss.marshalling.MarshallingConfiguration r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.marshalling.DefaultUnmarshallerProvider, io.netty.handler.codec.marshalling.UnmarshallerProvider
    public org.jboss.marshalling.Unmarshaller getUnmarshaller(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.Channel r0 = r3.channel()
            io.netty.util.AttributeKey<org.jboss.marshalling.Unmarshaller> r1 = io.netty.handler.codec.marshalling.ContextBoundUnmarshallerProvider.UNMARSHALLER
            io.netty.util.Attribute r0 = r0.attr(r1)
            java.lang.Object r1 = r0.get()
            org.jboss.marshalling.Unmarshaller r1 = (org.jboss.marshalling.Unmarshaller) r1
            if (r1 != 0) goto L1a
            org.jboss.marshalling.Unmarshaller r3 = super.getUnmarshaller(r3)
            r0.set(r3)
            return r3
        L1a:
            return r1
    }
}
