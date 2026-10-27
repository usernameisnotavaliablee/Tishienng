package io.netty.channel.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SctpNotificationHandler extends com.sun.nio.sctp.AbstractNotificationHandler<java.lang.Object> {
    private final io.netty.channel.sctp.SctpChannel sctpChannel;

    public SctpNotificationHandler(io.netty.channel.sctp.SctpChannel r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.sctpChannel = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "sctpChannel"
            r2.<init>(r0)
            throw r2
    }

    private void fireEvent(com.sun.nio.sctp.Notification r2) {
            r1 = this;
            io.netty.channel.sctp.SctpChannel r0 = r1.sctpChannel
            io.netty.channel.ChannelPipeline r0 = r0.pipeline()
            r0.fireUserEventTriggered(r2)
            return
    }

    public com.sun.nio.sctp.HandlerResult handleNotification(com.sun.nio.sctp.AssociationChangeNotification r1, java.lang.Object r2) {
            r0 = this;
            r0.fireEvent(r1)
            com.sun.nio.sctp.HandlerResult r1 = com.sun.nio.sctp.HandlerResult.CONTINUE
            return r1
    }

    public com.sun.nio.sctp.HandlerResult handleNotification(com.sun.nio.sctp.PeerAddressChangeNotification r1, java.lang.Object r2) {
            r0 = this;
            r0.fireEvent(r1)
            com.sun.nio.sctp.HandlerResult r1 = com.sun.nio.sctp.HandlerResult.CONTINUE
            return r1
    }

    public com.sun.nio.sctp.HandlerResult handleNotification(com.sun.nio.sctp.SendFailedNotification r1, java.lang.Object r2) {
            r0 = this;
            r0.fireEvent(r1)
            com.sun.nio.sctp.HandlerResult r1 = com.sun.nio.sctp.HandlerResult.CONTINUE
            return r1
    }

    public com.sun.nio.sctp.HandlerResult handleNotification(com.sun.nio.sctp.ShutdownNotification r1, java.lang.Object r2) {
            r0 = this;
            r0.fireEvent(r1)
            io.netty.channel.sctp.SctpChannel r1 = r0.sctpChannel
            r1.close()
            com.sun.nio.sctp.HandlerResult r1 = com.sun.nio.sctp.HandlerResult.RETURN
            return r1
    }
}
