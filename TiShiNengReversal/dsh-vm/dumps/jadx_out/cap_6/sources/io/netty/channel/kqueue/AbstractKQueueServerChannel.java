package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractKQueueServerChannel extends io.netty.channel.kqueue.AbstractKQueueChannel implements io.netty.channel.ServerChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KQueueServerSocketUnsafe extends io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final byte[] acceptedAddress;
        final /* synthetic */ io.netty.channel.kqueue.AbstractKQueueServerChannel this$0;

        static {
                return
        }

        KQueueServerSocketUnsafe(io.netty.channel.kqueue.AbstractKQueueServerChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r1 = 26
                byte[] r1 = new byte[r1]
                r0.acceptedAddress = r1
                return
        }

        @Override // io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe
        void readReady(io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r8) {
                r7 = this;
                io.netty.channel.kqueue.AbstractKQueueServerChannel r0 = r7.this$0
                io.netty.channel.kqueue.KQueueChannelConfig r0 = r0.config()
                io.netty.channel.kqueue.AbstractKQueueServerChannel r1 = r7.this$0
                boolean r1 = r1.shouldBreakReadReady(r0)
                if (r1 == 0) goto L12
                r7.clearReadFilter0()
                return
            L12:
                io.netty.channel.kqueue.AbstractKQueueServerChannel r1 = r7.this$0
                io.netty.channel.ChannelPipeline r1 = r1.pipeline()
                r8.reset(r0)
                r2 = 1
                r8.attemptedBytesRead(r2)
                r7.readReadyBefore()
            L22:
                io.netty.channel.kqueue.AbstractKQueueServerChannel r3 = r7.this$0     // Catch: java.lang.Throwable -> L33
                io.netty.channel.kqueue.BsdSocket r3 = r3.socket     // Catch: java.lang.Throwable -> L33
                byte[] r4 = r7.acceptedAddress     // Catch: java.lang.Throwable -> L33
                int r3 = r3.accept(r4)     // Catch: java.lang.Throwable -> L33
                r4 = -1
                if (r3 != r4) goto L35
                r8.lastBytesRead(r4)     // Catch: java.lang.Throwable -> L33
                goto L51
            L33:
                r2 = move-exception
                goto L52
            L35:
                r8.lastBytesRead(r2)     // Catch: java.lang.Throwable -> L33
                r8.incMessagesRead(r2)     // Catch: java.lang.Throwable -> L33
                r4 = 0
                r7.readPending = r4     // Catch: java.lang.Throwable -> L33
                io.netty.channel.kqueue.AbstractKQueueServerChannel r5 = r7.this$0     // Catch: java.lang.Throwable -> L33
                byte[] r6 = r7.acceptedAddress     // Catch: java.lang.Throwable -> L33
                r4 = r6[r4]     // Catch: java.lang.Throwable -> L33
                io.netty.channel.Channel r3 = r5.newChildChannel(r3, r6, r2, r4)     // Catch: java.lang.Throwable -> L33
                r1.fireChannelRead(r3)     // Catch: java.lang.Throwable -> L33
                boolean r3 = r8.continueReading()     // Catch: java.lang.Throwable -> L33
                if (r3 != 0) goto L22
            L51:
                r2 = 0
            L52:
                r8.readComplete()     // Catch: java.lang.Throwable -> L5e
                r1.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L5e
                if (r2 == 0) goto L60
                r1.fireExceptionCaught(r2)     // Catch: java.lang.Throwable -> L5e
                goto L60
            L5e:
                r8 = move-exception
                goto L64
            L60:
                r7.readReadyFinally(r0)
                return
            L64:
                r7.readReadyFinally(r0)
                throw r8
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.kqueue.AbstractKQueueServerChannel.METADATA = r0
            return
    }

    AbstractKQueueServerChannel(io.netty.channel.kqueue.BsdSocket r2) {
            r1 = this;
            boolean r0 = io.netty.channel.kqueue.AbstractKQueueChannel.isSoErrorZero(r2)
            r1.<init>(r2, r0)
            return
    }

    AbstractKQueueServerChannel(io.netty.channel.kqueue.BsdSocket r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel
    protected boolean doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.kqueue.KQueueEventLoop
            return r1
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isOpen() {
            r1 = this;
            boolean r0 = super.isOpen()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.kqueue.AbstractKQueueServerChannel.METADATA
            return r0
    }

    abstract io.netty.channel.Channel newChildChannel(int r1, byte[] r2, int r3, int r4) throws java.lang.Exception;

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueServerChannel$KQueueServerSocketUnsafe r0 = new io.netty.channel.kqueue.AbstractKQueueServerChannel$KQueueServerSocketUnsafe
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected java.net.InetSocketAddress remoteAddress0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress0() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.remoteAddress0()
            return r0
    }
}
