package io.netty.handler.address;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class DynamicAddressConnectHandler extends io.netty.channel.ChannelOutboundHandlerAdapter {


    public DynamicAddressConnectHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void connect(io.netty.channel.ChannelHandlerContext r2, java.net.SocketAddress r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) {
            r1 = this;
            java.net.SocketAddress r0 = r1.remoteAddress(r3, r4)     // Catch: java.lang.Exception -> L15
            java.net.SocketAddress r3 = r1.localAddress(r3, r4)     // Catch: java.lang.Exception -> L15
            io.netty.channel.ChannelFuture r2 = r2.connect(r0, r3, r5)
            io.netty.handler.address.DynamicAddressConnectHandler$1 r3 = new io.netty.handler.address.DynamicAddressConnectHandler$1
            r3.<init>(r1)
            r2.addListener(r3)
            return
        L15:
            r2 = move-exception
            r5.setFailure(r2)
            return
    }

    protected java.net.SocketAddress localAddress(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            return r2
    }

    protected java.net.SocketAddress remoteAddress(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            return r1
    }
}
