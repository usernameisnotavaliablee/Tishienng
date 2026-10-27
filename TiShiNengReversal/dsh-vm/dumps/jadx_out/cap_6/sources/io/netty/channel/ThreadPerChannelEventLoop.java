package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ThreadPerChannelEventLoop extends io.netty.channel.SingleThreadEventLoop {
    private io.netty.channel.Channel ch;
    private final io.netty.channel.ThreadPerChannelEventLoopGroup parent;



    public ThreadPerChannelEventLoop(io.netty.channel.ThreadPerChannelEventLoopGroup r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r3.executor
            r1 = 1
            r2.<init>(r3, r0, r1)
            r2.parent = r3
            return
    }

    static /* synthetic */ io.netty.channel.Channel access$002(io.netty.channel.ThreadPerChannelEventLoop r0, io.netty.channel.Channel r1) {
            r0.ch = r1
            return r1
    }

    protected void deregister() {
            r1 = this;
            r0 = 0
            r1.ch = r0
            io.netty.channel.ThreadPerChannelEventLoopGroup r0 = r1.parent
            java.util.Set<io.netty.channel.EventLoop> r0 = r0.activeChildren
            r0.remove(r1)
            io.netty.channel.ThreadPerChannelEventLoopGroup r0 = r1.parent
            java.util.Queue<io.netty.channel.EventLoop> r0 = r0.idleChildren
            r0.add(r1)
            return
    }

    @Override // io.netty.channel.SingleThreadEventLoop, io.netty.channel.EventLoopGroup
    @java.lang.Deprecated
    public io.netty.channel.ChannelFuture register(io.netty.channel.Channel r1, io.netty.channel.ChannelPromise r2) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = super.register(r1, r2)
            io.netty.channel.ThreadPerChannelEventLoop$2 r2 = new io.netty.channel.ThreadPerChannelEventLoop$2
            r2.<init>(r0)
            io.netty.channel.ChannelFuture r1 = r1.addListener(r2)
            return r1
    }

    @Override // io.netty.channel.SingleThreadEventLoop, io.netty.channel.EventLoopGroup
    public io.netty.channel.ChannelFuture register(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.ChannelFuture r2 = super.register(r2)
            io.netty.channel.ThreadPerChannelEventLoop$1 r0 = new io.netty.channel.ThreadPerChannelEventLoop$1
            r0.<init>(r1)
            io.netty.channel.ChannelFuture r2 = r2.addListener(r0)
            return r2
    }

    @Override // io.netty.channel.SingleThreadEventLoop
    public int registeredChannels() {
            r1 = this;
            r0 = 1
            return r0
    }

    protected void run() {
            r2 = this;
        L0:
            java.lang.Runnable r0 = r2.takeTask()
            if (r0 == 0) goto Lc
            r0.run()
            r2.updateLastExecutionTime()
        Lc:
            io.netty.channel.Channel r0 = r2.ch
            boolean r1 = r2.isShuttingDown()
            if (r1 == 0) goto L2c
            if (r0 == 0) goto L25
            io.netty.channel.Channel$Unsafe r1 = r0.unsafe()
            io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
            io.netty.channel.ChannelPromise r0 = r0.voidPromise()
            r1.close(r0)
        L25:
            boolean r0 = r2.confirmShutdown()
            if (r0 == 0) goto L0
            return
        L2c:
            if (r0 == 0) goto L0
            boolean r0 = r0.isRegistered()
            if (r0 != 0) goto L0
            r2.runAllTasks()
            r2.deregister()
            goto L0
    }
}
