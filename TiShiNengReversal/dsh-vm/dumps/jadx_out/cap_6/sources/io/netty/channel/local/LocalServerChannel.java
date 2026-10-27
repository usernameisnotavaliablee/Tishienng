package io.netty.channel.local;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LocalServerChannel extends io.netty.channel.AbstractServerChannel {
    private volatile boolean acceptInProgress;
    private final io.netty.channel.ChannelConfig config;
    private final java.util.Queue<java.lang.Object> inboundBuffer;
    private volatile io.netty.channel.local.LocalAddress localAddress;
    private final java.lang.Runnable shutdownHook;
    private volatile int state;



    public LocalServerChannel() {
            r3 = this;
            r3.<init>()
            io.netty.channel.DefaultChannelConfig r0 = new io.netty.channel.DefaultChannelConfig
            r0.<init>(r3)
            r3.config = r0
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r3.inboundBuffer = r1
            io.netty.channel.local.LocalServerChannel$1 r1 = new io.netty.channel.local.LocalServerChannel$1
            r1.<init>(r3)
            r3.shutdownHook = r1
            io.netty.channel.ChannelConfig r1 = r3.config()
            io.netty.channel.PreferHeapByteBufAllocator r2 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r0 = r0.getAllocator()
            r2.<init>(r0)
            r1.setAllocator(r2)
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.local.LocalServerChannel r0, io.netty.channel.local.LocalChannel r1) {
            r0.serve0(r1)
            return
    }

    private void readInbound() {
            r3 = this;
            io.netty.channel.Channel$Unsafe r0 = r3.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.recvBufAllocHandle()
            io.netty.channel.ChannelConfig r1 = r3.config()
            r0.reset(r1)
            io.netty.channel.ChannelPipeline r1 = r3.pipeline()
        L13:
            java.util.Queue<java.lang.Object> r2 = r3.inboundBuffer
            java.lang.Object r2 = r2.poll()
            if (r2 != 0) goto L1c
            goto L25
        L1c:
            r1.fireChannelRead(r2)
            boolean r2 = r0.continueReading()
            if (r2 != 0) goto L13
        L25:
            r1.fireChannelReadComplete()
            return
    }

    private void serve0(io.netty.channel.local.LocalChannel r2) {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.inboundBuffer
            r0.add(r2)
            boolean r2 = r1.acceptInProgress
            if (r2 == 0) goto Lf
            r2 = 0
            r1.acceptInProgress = r2
            r1.readInbound()
        Lf:
            return
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.ChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBeginRead() throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.acceptInProgress
            if (r0 == 0) goto L5
            return
        L5:
            java.util.Queue<java.lang.Object> r0 = r1.inboundBuffer
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            r0 = 1
            r1.acceptInProgress = r0
            return
        L11:
            r1.readInbound()
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.localAddress
            io.netty.channel.local.LocalAddress r2 = io.netty.channel.local.LocalChannelRegistry.register(r1, r0, r2)
            r1.localAddress = r2
            r2 = 1
            r1.state = r2
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 > r1) goto L14
            io.netty.channel.local.LocalAddress r0 = r2.localAddress
            if (r0 == 0) goto L11
            io.netty.channel.local.LocalAddress r0 = r2.localAddress
            io.netty.channel.local.LocalChannelRegistry.unregister(r0)
            r0 = 0
            r2.localAddress = r0
        L11:
            r0 = 2
            r2.state = r0
        L14:
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDeregister() throws java.lang.Exception {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.util.concurrent.SingleThreadEventExecutor r0 = (io.netty.util.concurrent.SingleThreadEventExecutor) r0
            java.lang.Runnable r1 = r2.shutdownHook
            r0.removeShutdownHook(r1)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doRegister() throws java.lang.Exception {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.util.concurrent.SingleThreadEventExecutor r0 = (io.netty.util.concurrent.SingleThreadEventExecutor) r0
            java.lang.Runnable r1 = r2.shutdownHook
            r0.addShutdownHook(r1)
            return
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.SingleThreadEventLoop
            return r1
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r2 = this;
            int r0 = r2.state
            r1 = 2
            if (r0 >= r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.local.LocalAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.localAddress()
            io.netty.channel.local.LocalAddress r0 = (io.netty.channel.local.LocalAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress localAddress() {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.localAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.localAddress
            return r0
    }

    protected io.netty.channel.local.LocalChannel newLocalChannel(io.netty.channel.local.LocalChannel r2) {
            r1 = this;
            io.netty.channel.local.LocalChannel r0 = new io.netty.channel.local.LocalChannel
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.channel.AbstractServerChannel, io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.local.LocalAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.remoteAddress()
            io.netty.channel.local.LocalAddress r0 = (io.netty.channel.local.LocalAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractServerChannel, io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress() {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.remoteAddress()
            return r0
    }

    io.netty.channel.local.LocalChannel serve(io.netty.channel.local.LocalChannel r3) {
            r2 = this;
            io.netty.channel.local.LocalChannel r3 = r2.newLocalChannel(r3)
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L12
            r2.serve0(r3)
            return r3
        L12:
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.channel.local.LocalServerChannel$2 r1 = new io.netty.channel.local.LocalServerChannel$2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }
}
