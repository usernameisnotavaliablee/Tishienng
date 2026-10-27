package io.netty.channel;

import io.netty.channel.Channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ChannelInitializer<C extends io.netty.channel.Channel> extends io.netty.channel.ChannelInboundHandlerAdapter {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.Set<io.netty.channel.ChannelHandlerContext> initMap;


    static {
            java.lang.Class<io.netty.channel.ChannelInitializer> r0 = io.netty.channel.ChannelInitializer.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.ChannelInitializer.logger = r0
            return
    }

    public ChannelInitializer() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.initMap = r0
            return
    }

    static /* synthetic */ java.util.Set access$000(io.netty.channel.ChannelInitializer r0) {
            java.util.Set<io.netty.channel.ChannelHandlerContext> r0 = r0.initMap
            return r0
    }

    private boolean initChannel(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            java.util.Set<io.netty.channel.ChannelHandlerContext> r0 = r2.initMap
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto L3d
            io.netty.channel.Channel r0 = r3.channel()     // Catch: java.lang.Throwable -> L1d
            r2.initChannel(r0)     // Catch: java.lang.Throwable -> L1d
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            io.netty.channel.ChannelHandlerContext r0 = r3.context(r2)
            if (r0 == 0) goto L2c
        L19:
            r3.remove(r2)
            goto L2c
        L1d:
            r0 = move-exception
            r2.exceptionCaught(r3, r0)     // Catch: java.lang.Throwable -> L2e
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            io.netty.channel.ChannelHandlerContext r0 = r3.context(r2)
            if (r0 == 0) goto L2c
            goto L19
        L2c:
            r3 = 1
            return r3
        L2e:
            r0 = move-exception
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            io.netty.channel.ChannelHandlerContext r1 = r3.context(r2)
            if (r1 == 0) goto L3c
            r3.remove(r2)
        L3c:
            throw r0
        L3d:
            r3 = 0
            return r3
    }

    private void removeState(io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            boolean r0 = r3.isRemoved()
            if (r0 == 0) goto Lc
            java.util.Set<io.netty.channel.ChannelHandlerContext> r0 = r2.initMap
            r0.remove(r3)
            return
        Lc:
            io.netty.util.concurrent.EventExecutor r0 = r3.executor()
            io.netty.channel.ChannelInitializer$1 r1 = new io.netty.channel.ChannelInitializer$1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelRegistered(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.initChannel(r2)
            if (r0 == 0) goto L11
            io.netty.channel.ChannelPipeline r0 = r2.pipeline()
            r0.fireChannelRegistered()
            r1.removeState(r2)
            return
        L11:
            r2.fireChannelRegistered()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r4, java.lang.Throwable r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.ChannelInitializer.logger
            boolean r1 = r0.isWarnEnabled()
            if (r1 == 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to initialize a channel. Closing: "
            r1.append(r2)
            io.netty.channel.Channel r2 = r4.channel()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.warn(r1, r5)
        L20:
            r4.close()
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isRegistered()
            if (r0 == 0) goto L13
            boolean r0 = r1.initChannel(r2)
            if (r0 == 0) goto L13
            r1.removeState(r2)
        L13:
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            java.util.Set<io.netty.channel.ChannelHandlerContext> r0 = r1.initMap
            r0.remove(r2)
            return
    }

    protected abstract void initChannel(C r1) throws java.lang.Exception;
}
