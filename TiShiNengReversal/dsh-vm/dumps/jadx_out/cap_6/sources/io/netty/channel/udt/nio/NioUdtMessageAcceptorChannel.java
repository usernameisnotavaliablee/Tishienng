package io.netty.channel.udt.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NioUdtMessageAcceptorChannel extends io.netty.channel.udt.nio.NioUdtAcceptorChannel {
    public NioUdtMessageAcceptorChannel() {
            r1 = this;
            com.barchart.udt.TypeUDT r0 = com.barchart.udt.TypeUDT.DATAGRAM
            r1.<init>(r0)
            return
    }

    @Override // io.netty.channel.udt.nio.NioUdtAcceptorChannel
    protected io.netty.channel.udt.UdtChannel newConnectorChannel(com.barchart.udt.nio.SocketChannelUDT r2) {
            r1 = this;
            io.netty.channel.udt.nio.NioUdtMessageConnectorChannel r0 = new io.netty.channel.udt.nio.NioUdtMessageConnectorChannel
            r0.<init>(r1, r2)
            return r0
    }
}
