package io.netty.handler.ipfilter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UniqueIpFilter extends io.netty.handler.ipfilter.AbstractRemoteAddressFilter<java.net.InetSocketAddress> {
    private final java.util.Set<java.net.InetAddress> connected;


    public UniqueIpFilter() {
            r1 = this;
            r1.<init>()
            io.netty.util.internal.ConcurrentSet r0 = new io.netty.util.internal.ConcurrentSet
            r0.<init>()
            r1.connected = r0
            return
    }

    static /* synthetic */ java.util.Set access$000(io.netty.handler.ipfilter.UniqueIpFilter r0) {
            java.util.Set<java.net.InetAddress> r0 = r0.connected
            return r0
    }

    /* renamed from: accept, reason: avoid collision after fix types in other method */
    protected boolean accept2(io.netty.channel.ChannelHandlerContext r2, java.net.InetSocketAddress r3) throws java.lang.Exception {
            r1 = this;
            java.net.InetAddress r3 = r3.getAddress()
            java.util.Set<java.net.InetAddress> r0 = r1.connected
            boolean r0 = r0.add(r3)
            if (r0 != 0) goto Le
            r2 = 0
            return r2
        Le:
            io.netty.channel.Channel r2 = r2.channel()
            io.netty.channel.ChannelFuture r2 = r2.closeFuture()
            io.netty.handler.ipfilter.UniqueIpFilter$1 r0 = new io.netty.handler.ipfilter.UniqueIpFilter$1
            r0.<init>(r1, r3)
            r2.addListener(r0)
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.ipfilter.AbstractRemoteAddressFilter
    protected /* bridge */ /* synthetic */ boolean accept(io.netty.channel.ChannelHandlerContext r1, java.net.InetSocketAddress r2) throws java.lang.Exception {
            r0 = this;
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            boolean r1 = r0.accept2(r1, r2)
            return r1
    }
}
