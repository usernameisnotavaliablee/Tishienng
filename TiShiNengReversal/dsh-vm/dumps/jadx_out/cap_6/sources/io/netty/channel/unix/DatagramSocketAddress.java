package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DatagramSocketAddress extends java.net.InetSocketAddress {
    private static final long serialVersionUID = 3094819287843178401L;
    private final io.netty.channel.unix.DatagramSocketAddress localAddress;
    private final int receivedAmount;

    DatagramSocketAddress(java.lang.String r1, int r2, int r3, io.netty.channel.unix.DatagramSocketAddress r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.receivedAmount = r3
            r0.localAddress = r4
            return
    }

    public io.netty.channel.unix.DatagramSocketAddress localAddress() {
            r1 = this;
            io.netty.channel.unix.DatagramSocketAddress r0 = r1.localAddress
            return r0
    }

    public int receivedAmount() {
            r1 = this;
            int r0 = r1.receivedAmount
            return r0
    }
}
