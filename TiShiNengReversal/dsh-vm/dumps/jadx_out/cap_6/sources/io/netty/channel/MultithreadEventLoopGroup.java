package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class MultithreadEventLoopGroup extends io.netty.util.concurrent.MultithreadEventExecutorGroup implements io.netty.channel.EventLoopGroup {
    private static final int DEFAULT_EVENT_LOOP_THREADS = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.channel.MultithreadEventLoopGroup> r0 = io.netty.channel.MultithreadEventLoopGroup.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.MultithreadEventLoopGroup.logger = r0
            int r1 = io.netty.util.NettyRuntime.availableProcessors()
            int r1 = r1 * 2
            java.lang.String r2 = "io.netty.eventLoopThreads"
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r2, r1)
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            io.netty.channel.MultithreadEventLoopGroup.DEFAULT_EVENT_LOOP_THREADS = r1
            boolean r2 = r0.isDebugEnabled()
            if (r2 == 0) goto L2a
            java.lang.String r2 = "-Dio.netty.eventLoopThreads: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.debug(r2, r1)
        L2a:
            return
    }

    protected MultithreadEventLoopGroup(int r1, java.util.concurrent.Executor r2, io.netty.util.concurrent.EventExecutorChooserFactory r3, java.lang.Object... r4) {
            r0 = this;
            if (r1 != 0) goto L4
            int r1 = io.netty.channel.MultithreadEventLoopGroup.DEFAULT_EVENT_LOOP_THREADS
        L4:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    protected MultithreadEventLoopGroup(int r1, java.util.concurrent.Executor r2, java.lang.Object... r3) {
            r0 = this;
            if (r1 != 0) goto L4
            int r1 = io.netty.channel.MultithreadEventLoopGroup.DEFAULT_EVENT_LOOP_THREADS
        L4:
            r0.<init>(r1, r2, r3)
            return
    }

    protected MultithreadEventLoopGroup(int r1, java.util.concurrent.ThreadFactory r2, java.lang.Object... r3) {
            r0 = this;
            if (r1 != 0) goto L4
            int r1 = io.netty.channel.MultithreadEventLoopGroup.DEFAULT_EVENT_LOOP_THREADS
        L4:
            r0.<init>(r1, r2, r3)
            return
    }

    protected abstract io.netty.channel.EventLoop newChild(java.util.concurrent.Executor r1, java.lang.Object... r2) throws java.lang.Exception;

    /* renamed from: newChild */
    protected /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor mo96newChild(java.util.concurrent.Executor r1, java.lang.Object[] r2) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.EventLoop r1 = r0.newChild(r1, r2)
            return r1
    }

    protected java.util.concurrent.ThreadFactory newDefaultThreadFactory() {
            r3 = this;
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            java.lang.Class r1 = r3.getClass()
            r2 = 10
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.EventLoop next() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = super.next()
            io.netty.channel.EventLoop r0 = (io.netty.channel.EventLoop) r0
            return r0
    }

    /* renamed from: next, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor m121next() {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            return r0
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.ChannelFuture register(io.netty.channel.Channel r2) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            io.netty.channel.ChannelFuture r2 = r0.register(r2)
            return r2
    }

    @Override // io.netty.channel.EventLoopGroup
    @java.lang.Deprecated
    public io.netty.channel.ChannelFuture register(io.netty.channel.Channel r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            io.netty.channel.ChannelFuture r2 = r0.register(r2, r3)
            return r2
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.ChannelFuture register(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            io.netty.channel.ChannelFuture r2 = r0.register(r2)
            return r2
    }
}
