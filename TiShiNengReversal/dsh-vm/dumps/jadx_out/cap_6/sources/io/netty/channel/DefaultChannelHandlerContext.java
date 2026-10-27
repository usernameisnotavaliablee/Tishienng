package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DefaultChannelHandlerContext extends io.netty.channel.AbstractChannelHandlerContext {
    private final io.netty.channel.ChannelHandler handler;

    DefaultChannelHandlerContext(io.netty.channel.DefaultChannelPipeline r2, io.netty.util.concurrent.EventExecutor r3, java.lang.String r4, io.netty.channel.ChannelHandler r5) {
            r1 = this;
            java.lang.Class r0 = r5.getClass()
            r1.<init>(r2, r3, r4, r0)
            r1.handler = r5
            return
    }

    @Override // io.netty.channel.ChannelHandlerContext
    public io.netty.channel.ChannelHandler handler() {
            r1 = this;
            io.netty.channel.ChannelHandler r0 = r1.handler
            return r0
    }
}
