package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SimpleChannelInboundHandler<I> extends io.netty.channel.ChannelInboundHandlerAdapter {
    private final boolean autoRelease;
    private final io.netty.util.internal.TypeParameterMatcher matcher;

    protected SimpleChannelInboundHandler() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    protected SimpleChannelInboundHandler(java.lang.Class<? extends I> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    protected SimpleChannelInboundHandler(java.lang.Class<? extends I> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            io.netty.util.internal.TypeParameterMatcher r1 = io.netty.util.internal.TypeParameterMatcher.get(r1)
            r0.matcher = r1
            r0.autoRelease = r2
            return
    }

    protected SimpleChannelInboundHandler(boolean r3) {
            r2 = this;
            r2.<init>()
            java.lang.Class<io.netty.channel.SimpleChannelInboundHandler> r0 = io.netty.channel.SimpleChannelInboundHandler.class
            java.lang.String r1 = "I"
            io.netty.util.internal.TypeParameterMatcher r0 = io.netty.util.internal.TypeParameterMatcher.find(r2, r0, r1)
            r2.matcher = r0
            r2.autoRelease = r3
            return
    }

    public boolean acceptInboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.internal.TypeParameterMatcher r0 = r1.matcher
            boolean r2 = r0.match(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            r0 = 1
            boolean r1 = r2.acceptInboundMessage(r4)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r2.channelRead0(r3, r4)     // Catch: java.lang.Throwable -> Lb
            goto L11
        Lb:
            r3 = move-exception
            goto L1b
        Ld:
            r0 = 0
            r3.fireChannelRead(r4)     // Catch: java.lang.Throwable -> Lb
        L11:
            boolean r3 = r2.autoRelease
            if (r3 == 0) goto L1a
            if (r0 == 0) goto L1a
            io.netty.util.ReferenceCountUtil.release(r4)
        L1a:
            return
        L1b:
            boolean r1 = r2.autoRelease
            if (r1 == 0) goto L24
            if (r0 == 0) goto L24
            io.netty.util.ReferenceCountUtil.release(r4)
        L24:
            throw r3
    }

    protected abstract void channelRead0(io.netty.channel.ChannelHandlerContext r1, I r2) throws java.lang.Exception;
}
