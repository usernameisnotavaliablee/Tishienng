package io.netty.channel.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractNioMessageChannel extends io.netty.channel.nio.AbstractNioChannel {
    boolean inputShutdown;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.nio.AbstractNioMessageChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class NioMessageUnsafe extends io.netty.channel.nio.AbstractNioChannel.AbstractNioUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.List<java.lang.Object> readBuf;
        final /* synthetic */ io.netty.channel.nio.AbstractNioMessageChannel this$0;

        static {
                return
        }

        private NioMessageUnsafe(io.netty.channel.nio.AbstractNioMessageChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.readBuf = r1
                return
        }

        /* synthetic */ NioMessageUnsafe(io.netty.channel.nio.AbstractNioMessageChannel r1, io.netty.channel.nio.AbstractNioMessageChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.nio.AbstractNioChannel.NioUnsafe
        public void read() {
                r10 = this;
                io.netty.channel.nio.AbstractNioMessageChannel r0 = r10.this$0
                io.netty.channel.ChannelConfig r0 = r0.config()
                io.netty.channel.nio.AbstractNioMessageChannel r1 = r10.this$0
                io.netty.channel.ChannelPipeline r1 = r1.pipeline()
                io.netty.channel.nio.AbstractNioMessageChannel r2 = r10.this$0
                io.netty.channel.nio.AbstractNioChannel$NioUnsafe r2 = r2.unsafe()
                io.netty.channel.RecvByteBufAllocator$Handle r2 = r2.recvBufAllocHandle()
                r2.reset(r0)
            L19:
                r3 = 1
                r4 = 0
                io.netty.channel.nio.AbstractNioMessageChannel r5 = r10.this$0     // Catch: java.lang.Throwable -> L36
                java.util.List<java.lang.Object> r6 = r10.readBuf     // Catch: java.lang.Throwable -> L36
                int r5 = r5.doReadMessages(r6)     // Catch: java.lang.Throwable -> L36
                if (r5 != 0) goto L26
                goto L33
            L26:
                if (r5 >= 0) goto L2a
                r5 = 1
                goto L34
            L2a:
                r2.incMessagesRead(r5)     // Catch: java.lang.Throwable -> L36
                boolean r5 = r2.continueReading()     // Catch: java.lang.Throwable -> L36
                if (r5 != 0) goto L19
            L33:
                r5 = 0
            L34:
                r6 = 0
                goto L39
            L36:
                r5 = move-exception
                r6 = r5
                r5 = 0
            L39:
                java.util.List<java.lang.Object> r7 = r10.readBuf     // Catch: java.lang.Throwable -> L52
                int r7 = r7.size()     // Catch: java.lang.Throwable -> L52
                r8 = 0
            L40:
                if (r8 >= r7) goto L54
                io.netty.channel.nio.AbstractNioMessageChannel r9 = r10.this$0     // Catch: java.lang.Throwable -> L52
                r9.readPending = r4     // Catch: java.lang.Throwable -> L52
                java.util.List<java.lang.Object> r9 = r10.readBuf     // Catch: java.lang.Throwable -> L52
                java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> L52
                r1.fireChannelRead(r9)     // Catch: java.lang.Throwable -> L52
                int r8 = r8 + 1
                goto L40
            L52:
                r1 = move-exception
                goto L8d
            L54:
                java.util.List<java.lang.Object> r4 = r10.readBuf     // Catch: java.lang.Throwable -> L52
                r4.clear()     // Catch: java.lang.Throwable -> L52
                r2.readComplete()     // Catch: java.lang.Throwable -> L52
                r1.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L52
                if (r6 == 0) goto L6a
                io.netty.channel.nio.AbstractNioMessageChannel r2 = r10.this$0     // Catch: java.lang.Throwable -> L52
                boolean r5 = r2.closeOnReadError(r6)     // Catch: java.lang.Throwable -> L52
                r1.fireExceptionCaught(r6)     // Catch: java.lang.Throwable -> L52
            L6a:
                if (r5 == 0) goto L7d
                io.netty.channel.nio.AbstractNioMessageChannel r1 = r10.this$0     // Catch: java.lang.Throwable -> L52
                r1.inputShutdown = r3     // Catch: java.lang.Throwable -> L52
                boolean r1 = r1.isOpen()     // Catch: java.lang.Throwable -> L52
                if (r1 == 0) goto L7d
                io.netty.channel.ChannelPromise r1 = r10.voidPromise()     // Catch: java.lang.Throwable -> L52
                r10.close(r1)     // Catch: java.lang.Throwable -> L52
            L7d:
                io.netty.channel.nio.AbstractNioMessageChannel r1 = r10.this$0
                boolean r1 = r1.readPending
                if (r1 != 0) goto L8c
                boolean r0 = r0.isAutoRead()
                if (r0 != 0) goto L8c
                r10.removeReadOp()
            L8c:
                return
            L8d:
                io.netty.channel.nio.AbstractNioMessageChannel r2 = r10.this$0
                boolean r2 = r2.readPending
                if (r2 != 0) goto L9c
                boolean r0 = r0.isAutoRead()
                if (r0 != 0) goto L9c
                r10.removeReadOp()
            L9c:
                throw r1
        }
    }

    protected AbstractNioMessageChannel(io.netty.channel.Channel r1, java.nio.channels.SelectableChannel r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    protected boolean closeOnReadError(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.isActive()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r3 instanceof java.net.PortUnreachableException
            if (r0 == 0) goto Le
            r3 = 0
            return r3
        Le:
            boolean r3 = r3 instanceof java.io.IOException
            if (r3 == 0) goto L16
            boolean r3 = r2 instanceof io.netty.channel.ServerChannel
            r3 = r3 ^ r1
            return r3
        L16:
            return r1
    }

    protected boolean continueOnWriteError() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doBeginRead() throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.inputShutdown
            if (r0 == 0) goto L5
            return
        L5:
            super.doBeginRead()
            return
    }

    protected abstract int doReadMessages(java.util.List<java.lang.Object> r1) throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r6) throws java.lang.Exception {
            r5 = this;
            java.nio.channels.SelectionKey r0 = r5.selectionKey()
            int r1 = r0.interestOps()
        L8:
            java.lang.Object r2 = r6.current()
            if (r2 != 0) goto L18
            r6 = r1 & 4
            if (r6 == 0) goto L3c
            r6 = r1 & (-5)
            r0.interestOps(r6)
            goto L3c
        L18:
            io.netty.channel.ChannelConfig r3 = r5.config()     // Catch: java.lang.Exception -> L2e
            int r3 = r3.getWriteSpinCount()     // Catch: java.lang.Exception -> L2e
            int r3 = r3 + (-1)
        L22:
            if (r3 < 0) goto L33
            boolean r4 = r5.doWriteMessage(r2, r6)     // Catch: java.lang.Exception -> L2e
            if (r4 == 0) goto L30
            r6.remove()     // Catch: java.lang.Exception -> L2e
            goto L8
        L2e:
            r2 = move-exception
            goto L3d
        L30:
            int r3 = r3 + (-1)
            goto L22
        L33:
            r2 = r1 & 4
            if (r2 != 0) goto L3c
            r2 = r1 | 4
            r0.interestOps(r2)     // Catch: java.lang.Exception -> L2e
        L3c:
            return
        L3d:
            boolean r3 = r5.continueOnWriteError()
            if (r3 == 0) goto L47
            r6.remove(r2)
            goto L8
        L47:
            throw r2
    }

    protected abstract boolean doWriteMessage(java.lang.Object r1, io.netty.channel.ChannelOutboundBuffer r2) throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.nio.AbstractNioChannel.AbstractNioUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.nio.AbstractNioMessageChannel$NioMessageUnsafe r0 = new io.netty.channel.nio.AbstractNioMessageChannel$NioMessageUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
