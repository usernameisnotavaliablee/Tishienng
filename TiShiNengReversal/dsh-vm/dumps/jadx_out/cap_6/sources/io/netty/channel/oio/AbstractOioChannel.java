package io.netty.channel.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractOioChannel extends io.netty.channel.AbstractChannel {
    protected static final int SO_TIMEOUT = 1000;
    private final java.lang.Runnable clearReadPendingRunnable;
    boolean readPending;
    private final java.lang.Runnable readTask;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DefaultOioUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        final /* synthetic */ io.netty.channel.oio.AbstractOioChannel this$0;

        private DefaultOioUnsafe(io.netty.channel.oio.AbstractOioChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ DefaultOioUnsafe(io.netty.channel.oio.AbstractOioChannel r1, io.netty.channel.oio.AbstractOioChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) {
                r2 = this;
                boolean r0 = r5.setUncancellable()
                if (r0 == 0) goto L3a
                boolean r0 = r2.ensureOpen(r5)
                if (r0 != 0) goto Ld
                goto L3a
            Ld:
                io.netty.channel.oio.AbstractOioChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L2f
                boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L2f
                io.netty.channel.oio.AbstractOioChannel r1 = r2.this$0     // Catch: java.lang.Throwable -> L2f
                r1.doConnect(r3, r4)     // Catch: java.lang.Throwable -> L2f
                io.netty.channel.oio.AbstractOioChannel r4 = r2.this$0     // Catch: java.lang.Throwable -> L2f
                boolean r4 = r4.isActive()     // Catch: java.lang.Throwable -> L2f
                r2.safeSetSuccess(r5)     // Catch: java.lang.Throwable -> L2f
                if (r0 != 0) goto L3a
                if (r4 == 0) goto L3a
                io.netty.channel.oio.AbstractOioChannel r4 = r2.this$0     // Catch: java.lang.Throwable -> L2f
                io.netty.channel.ChannelPipeline r4 = r4.pipeline()     // Catch: java.lang.Throwable -> L2f
                r4.fireChannelActive()     // Catch: java.lang.Throwable -> L2f
                return
            L2f:
                r4 = move-exception
                java.lang.Throwable r3 = r2.annotateConnectException(r4, r3)
                r2.safeSetFailure(r5, r3)
                r2.closeIfClosed()
            L3a:
                return
        }
    }

    protected AbstractOioChannel(io.netty.channel.Channel r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.oio.AbstractOioChannel$1 r1 = new io.netty.channel.oio.AbstractOioChannel$1
            r1.<init>(r0)
            r0.readTask = r1
            io.netty.channel.oio.AbstractOioChannel$2 r1 = new io.netty.channel.oio.AbstractOioChannel$2
            r1.<init>(r0)
            r0.clearReadPendingRunnable = r1
            return
    }

    protected final void clearReadPending() {
            r3 = this;
            boolean r0 = r3.isRegistered()
            r1 = 0
            if (r0 == 0) goto L1a
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            boolean r2 = r0.inEventLoop()
            if (r2 == 0) goto L14
            r3.readPending = r1
            return
        L14:
            java.lang.Runnable r1 = r3.clearReadPendingRunnable
            r0.execute(r1)
            return
        L1a:
            r3.readPending = r1
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBeginRead() throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.readPending
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.readPending = r0
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            java.lang.Runnable r1 = r2.readTask
            r0.execute(r1)
            return
    }

    protected abstract void doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception;

    protected abstract void doRead();

    @Override // io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.ThreadPerChannelEventLoop
            return r1
    }

    @java.lang.Deprecated
    protected boolean isReadPending() {
            r1 = this;
            boolean r0 = r1.readPending
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.oio.AbstractOioChannel$DefaultOioUnsafe r0 = new io.netty.channel.oio.AbstractOioChannel$DefaultOioUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    protected void setReadPending(boolean r3) {
            r2 = this;
            boolean r0 = r2.isRegistered()
            if (r0 == 0) goto L1c
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L13
            r2.readPending = r3
            return
        L13:
            io.netty.channel.oio.AbstractOioChannel$3 r1 = new io.netty.channel.oio.AbstractOioChannel$3
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L1c:
            r2.readPending = r3
            return
    }
}
