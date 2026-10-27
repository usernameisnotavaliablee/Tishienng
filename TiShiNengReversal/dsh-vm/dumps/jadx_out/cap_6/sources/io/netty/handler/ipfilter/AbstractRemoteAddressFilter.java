package io.netty.handler.ipfilter;

import java.net.SocketAddress;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractRemoteAddressFilter<T extends java.net.SocketAddress> extends io.netty.channel.ChannelInboundHandlerAdapter {
    public AbstractRemoteAddressFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean handleNewChannel(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.Channel r0 = r3.channel()
            java.net.SocketAddress r0 = r0.remoteAddress()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            io.netty.channel.ChannelPipeline r1 = r3.pipeline()
            r1.remove(r2)
            boolean r1 = r2.accept(r3, r0)
            if (r1 == 0) goto L1d
            r2.channelAccepted(r3, r0)
            goto L2c
        L1d:
            io.netty.channel.ChannelFuture r0 = r2.channelRejected(r3, r0)
            if (r0 == 0) goto L29
            io.netty.channel.ChannelFutureListener r3 = io.netty.channel.ChannelFutureListener.CLOSE
            r0.addListener(r3)
            goto L2c
        L29:
            r3.close()
        L2c:
            r3 = 1
            return r3
    }

    protected abstract boolean accept(io.netty.channel.ChannelHandlerContext r1, T r2) throws java.lang.Exception;

    protected void channelAccepted(io.netty.channel.ChannelHandlerContext r1, T r2) {
            r0 = this;
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r3.handleNewChannel(r4)
            if (r0 == 0) goto La
            r4.fireChannelActive()
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot determine to accept or reject a channel: "
            r1.append(r2)
            io.netty.channel.Channel r4 = r4.channel()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRegistered(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.handleNewChannel(r1)
            r1.fireChannelRegistered()
            return
    }

    protected io.netty.channel.ChannelFuture channelRejected(io.netty.channel.ChannelHandlerContext r1, T r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
