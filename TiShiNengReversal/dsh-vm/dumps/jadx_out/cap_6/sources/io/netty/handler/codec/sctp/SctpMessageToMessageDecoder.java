package io.netty.handler.codec.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SctpMessageToMessageDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.channel.sctp.SctpMessage> {
    public SctpMessageToMessageDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public boolean acceptInboundMessage(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.channel.sctp.SctpMessage
            r1 = 0
            if (r0 == 0) goto L25
            io.netty.channel.sctp.SctpMessage r4 = (io.netty.channel.sctp.SctpMessage) r4
            boolean r4 = r4.isComplete()
            r0 = 1
            if (r4 == 0) goto Lf
            return r0
        Lf:
            io.netty.handler.codec.CodecException r4 = new io.netty.handler.codec.CodecException
            java.lang.Class<io.netty.handler.codec.sctp.SctpMessageCompletionHandler> r2 = io.netty.handler.codec.sctp.SctpMessageCompletionHandler.class
            java.lang.String r2 = r2.getSimpleName()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r2
            java.lang.String r1 = "Received SctpMessage is not complete, please add %s in the pipeline before this handler"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r4.<init>(r0)
            throw r4
        L25:
            return r1
    }
}
