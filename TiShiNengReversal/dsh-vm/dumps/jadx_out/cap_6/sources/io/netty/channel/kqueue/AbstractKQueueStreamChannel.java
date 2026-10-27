package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractKQueueStreamChannel extends io.netty.channel.kqueue.AbstractKQueueChannel implements io.netty.channel.socket.DuplexChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private java.nio.channels.WritableByteChannel byteChannel;
    private final java.lang.Runnable flushTask;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class KQueueSocketWritableByteChannel extends io.netty.channel.unix.SocketWritableByteChannel {
        final /* synthetic */ io.netty.channel.kqueue.AbstractKQueueStreamChannel this$0;

        KQueueSocketWritableByteChannel(io.netty.channel.kqueue.AbstractKQueueStreamChannel r1) {
                r0 = this;
                r0.this$0 = r1
                io.netty.channel.kqueue.BsdSocket r1 = r1.socket
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.unix.SocketWritableByteChannel
        protected io.netty.buffer.ByteBufAllocator alloc() {
                r1 = this;
                io.netty.channel.kqueue.AbstractKQueueStreamChannel r0 = r1.this$0
                io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class KQueueStreamUnsafe extends io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe {
        final /* synthetic */ io.netty.channel.kqueue.AbstractKQueueStreamChannel this$0;

        KQueueStreamUnsafe(io.netty.channel.kqueue.AbstractKQueueStreamChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        private void handleReadException(io.netty.channel.ChannelPipeline r3, io.netty.buffer.ByteBuf r4, java.lang.Throwable r5, boolean r6, io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r7) {
                r2 = this;
                r0 = 0
                if (r4 == 0) goto L12
                boolean r1 = r4.isReadable()
                if (r1 == 0) goto Lf
                r2.readPending = r0
                r3.fireChannelRead(r4)
                goto L12
            Lf:
                r4.release()
            L12:
                boolean r4 = r2.failConnectPromise(r5)
                if (r4 != 0) goto L2a
                r7.readComplete()
                r3.fireChannelReadComplete()
                r3.fireExceptionCaught(r5)
                if (r6 != 0) goto L27
                boolean r3 = r5 instanceof java.io.IOException
                if (r3 == 0) goto L2a
            L27:
                r2.shutdownInput(r0)
            L2a:
                return
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe
        protected java.util.concurrent.Executor prepareToClose() {
                r1 = this;
                java.util.concurrent.Executor r0 = super.prepareToClose()
                return r0
        }

        @Override // io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe
        void readReady(io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r9) {
                r8 = this;
                io.netty.channel.kqueue.AbstractKQueueStreamChannel r0 = r8.this$0
                io.netty.channel.kqueue.KQueueChannelConfig r1 = r0.config()
                io.netty.channel.kqueue.AbstractKQueueStreamChannel r0 = r8.this$0
                boolean r0 = r0.shouldBreakReadReady(r1)
                if (r0 == 0) goto L12
                r8.clearReadFilter0()
                return
            L12:
                io.netty.channel.kqueue.AbstractKQueueStreamChannel r0 = r8.this$0
                io.netty.channel.ChannelPipeline r3 = r0.pipeline()
                io.netty.buffer.ByteBufAllocator r0 = r1.getAllocator()
                r9.reset(r1)
                r8.readReadyBefore()
            L22:
                r2 = 0
                r4 = 0
                io.netty.buffer.ByteBuf r5 = r9.allocate(r0)     // Catch: java.lang.Throwable -> L4e
                io.netty.channel.kqueue.AbstractKQueueStreamChannel r6 = r8.this$0     // Catch: java.lang.Throwable -> L54
                int r6 = r6.doReadBytes(r5)     // Catch: java.lang.Throwable -> L54
                r9.lastBytesRead(r6)     // Catch: java.lang.Throwable -> L54
                int r6 = r9.lastBytesRead()     // Catch: java.lang.Throwable -> L54
                r7 = 1
                if (r6 > 0) goto L5b
                r5.release()     // Catch: java.lang.Throwable -> L54
                int r0 = r9.lastBytesRead()     // Catch: java.lang.Throwable -> L4e
                if (r0 >= 0) goto L42
                goto L43
            L42:
                r7 = 0
            L43:
                if (r7 == 0) goto L73
                r8.readPending = r2     // Catch: java.lang.Throwable -> L48
                goto L73
            L48:
                r0 = move-exception
                r2 = r8
                r5 = r0
                r6 = r7
                r7 = r9
                goto L82
            L4e:
                r0 = move-exception
                r2 = r8
                r7 = r9
                r5 = r0
                r6 = 0
                goto L82
            L54:
                r0 = move-exception
                r2 = r8
                r7 = r9
                r4 = r5
                r6 = 0
                r5 = r0
                goto L82
            L5b:
                r9.incMessagesRead(r7)     // Catch: java.lang.Throwable -> L54
                r8.readPending = r2     // Catch: java.lang.Throwable -> L54
                r3.fireChannelRead(r5)     // Catch: java.lang.Throwable -> L54
                io.netty.channel.kqueue.AbstractKQueueStreamChannel r5 = r8.this$0     // Catch: java.lang.Throwable -> L4e
                boolean r5 = r5.shouldBreakReadReady(r1)     // Catch: java.lang.Throwable -> L4e
                if (r5 == 0) goto L6c
                goto L72
            L6c:
                boolean r5 = r9.continueReading()     // Catch: java.lang.Throwable -> L4e
                if (r5 != 0) goto L22
            L72:
                r7 = 0
            L73:
                r9.readComplete()     // Catch: java.lang.Throwable -> L48
                r3.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L48
                if (r7 == 0) goto L7e
                r8.shutdownInput(r2)     // Catch: java.lang.Throwable -> L48
            L7e:
                r8.readReadyFinally(r1)
                return
            L82:
                r2.handleReadException(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L89
                r8.readReadyFinally(r1)
                return
            L89:
                r0 = move-exception
                r9 = r0
                r8.readReadyFinally(r1)
                throw r9
        }
    }

    static {
            java.lang.Class<io.netty.channel.kqueue.AbstractKQueueStreamChannel> r0 = io.netty.channel.kqueue.AbstractKQueueStreamChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.kqueue.AbstractKQueueStreamChannel.logger = r0
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.kqueue.AbstractKQueueStreamChannel.METADATA = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " (expected: "
            r0.append(r1)
            java.lang.Class<io.netty.buffer.ByteBuf> r1 = io.netty.buffer.ByteBuf.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Class<io.netty.channel.DefaultFileRegion> r1 = io.netty.channel.DefaultFileRegion.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.channel.kqueue.AbstractKQueueStreamChannel.EXPECTED_TYPES = r0
            return
    }

    AbstractKQueueStreamChannel(io.netty.channel.Channel r1, io.netty.channel.kqueue.BsdSocket r2, java.net.SocketAddress r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$1 r1 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$1
            r1.<init>(r0)
            r0.flushTask = r1
            return
    }

    AbstractKQueueStreamChannel(io.netty.channel.Channel r1, io.netty.channel.kqueue.BsdSocket r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$1 r1 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$1
            r1.<init>(r0)
            r0.flushTask = r1
            return
    }

    AbstractKQueueStreamChannel(io.netty.channel.kqueue.BsdSocket r3) {
            r2 = this;
            r0 = 0
            boolean r1 = io.netty.channel.kqueue.AbstractKQueueChannel.isSoErrorZero(r3)
            r2.<init>(r0, r3, r1)
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.kqueue.AbstractKQueueStreamChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.shutdownInput0(r1)
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.kqueue.AbstractKQueueStreamChannel r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            r0.shutdownOutputDone(r1, r2)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.ChannelFuture r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            shutdownDone(r0, r1, r2)
            return
    }

    private void adjustMaxBytesPerGatheringWrite(long r3, long r5, long r7) {
            r2 = this;
            r0 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L12
            long r3 = r3 << r0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L24
            io.netty.channel.kqueue.KQueueChannelConfig r5 = r2.config()
            r5.setMaxBytesPerGatheringWrite(r3)
            return
        L12:
            r7 = 4096(0x1000, double:2.0237E-320)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L24
            long r3 = r3 >>> r0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L24
            io.netty.channel.kqueue.KQueueChannelConfig r5 = r2.config()
            r5.setMaxBytesPerGatheringWrite(r3)
        L24:
            return
    }

    private int doWriteMultiple(io.netty.channel.ChannelOutboundBuffer r4) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.kqueue.KQueueChannelConfig r0 = r3.config()
            long r0 = r0.getMaxBytesPerGatheringWrite()
            io.netty.channel.EventLoop r2 = r3.eventLoop()
            io.netty.channel.kqueue.KQueueEventLoop r2 = (io.netty.channel.kqueue.KQueueEventLoop) r2
            io.netty.channel.unix.IovArray r2 = r2.cleanArray()
            r2.maxBytes(r0)
            r4.forEachFlushedMessage(r2)
            int r0 = r2.count()
            r1 = 1
            if (r0 < r1) goto L24
            int r4 = r3.writeBytesMultiple(r4, r2)
            return r4
        L24:
            r0 = 0
            r4.removeBytes(r0)
            r4 = 0
            return r4
    }

    private static void shutdownDone(io.netty.channel.ChannelFuture r2, io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            java.lang.Throwable r2 = r2.cause()
            java.lang.Throwable r3 = r3.cause()
            if (r2 == 0) goto L17
            if (r3 == 0) goto L13
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.kqueue.AbstractKQueueStreamChannel.logger
            java.lang.String r1 = "Exception suppressed because a previous exception occurred."
            r0.debug(r1, r3)
        L13:
            r4.setFailure(r2)
            return
        L17:
            if (r3 == 0) goto L1d
            r4.setFailure(r3)
            return
        L1d:
            r4.setSuccess()
            return
    }

    private void shutdownInput0(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r3.socket     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            r2 = 0
            r0.shutdown(r1, r2)     // Catch: java.lang.Throwable -> Lb
            r4.setSuccess()
            return
        Lb:
            r0 = move-exception
            r4.setFailure(r0)
            return
    }

    private void shutdownOutputDone(io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.ChannelFuture r0 = r2.shutdownInput()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto Le
            shutdownDone(r3, r0, r4)
            return
        Le:
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$5 r1 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$5
            r1.<init>(r2, r3, r4)
            r0.addListener(r1)
            return
    }

    private int writeBytes(io.netty.channel.ChannelOutboundBuffer r12, io.netty.buffer.ByteBuf r13) throws java.lang.Exception {
            r11 = this;
            int r0 = r13.readableBytes()
            if (r0 != 0) goto Lb
            r12.remove()
            r12 = 0
            return r12
        Lb:
            boolean r1 = r13.hasMemoryAddress()
            if (r1 != 0) goto L18
            int r1 = r13.nioBufferCount()
            r2 = 1
            if (r1 != r2) goto L1a
        L18:
            r4 = r12
            goto L2f
        L1a:
            java.nio.ByteBuffer[] r5 = r13.nioBuffers()
            int r6 = r5.length
            long r7 = (long) r0
            io.netty.channel.kqueue.KQueueChannelConfig r13 = r11.config()
            long r9 = r13.getMaxBytesPerGatheringWrite()
            r3 = r11
            r4 = r12
            int r12 = r3.writeBytesMultiple(r4, r5, r6, r7, r9)
            return r12
        L2f:
            int r12 = r11.doWriteBytes(r4, r13)
            return r12
    }

    private int writeBytesMultiple(io.netty.channel.ChannelOutboundBuffer r8, io.netty.channel.unix.IovArray r9) throws java.io.IOException {
            r7 = this;
            long r1 = r9.size()
            int r0 = r9.count()
            io.netty.channel.kqueue.BsdSocket r3 = r7.socket
            r4 = 0
            long r4 = r9.memoryAddress(r4)
            long r3 = r3.writevAddresses(r4, r0)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L26
            long r5 = r9.maxBytes()
            r0 = r7
            r0.adjustMaxBytesPerGatheringWrite(r1, r3, r5)
            r8.removeBytes(r3)
            r8 = 1
            return r8
        L26:
            r8 = 2147483647(0x7fffffff, float:NaN)
            return r8
    }

    private int writeBytesMultiple(io.netty.channel.ChannelOutboundBuffer r9, java.nio.ByteBuffer[] r10, int r11, long r12, long r14) throws java.io.IOException {
            r8 = this;
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L6
            r2 = r14
            goto L7
        L6:
            r2 = r12
        L7:
            io.netty.channel.kqueue.BsdSocket r1 = r8.socket
            r5 = r2
            r3 = 0
            r2 = r10
            r4 = r11
            long r10 = r1.writev(r2, r3, r4, r5)
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L23
            r1 = r8
            r2 = r5
            r4 = r10
            r6 = r14
            r1.adjustMaxBytesPerGatheringWrite(r2, r4, r6)
            r9.removeBytes(r4)
            r9 = 1
            return r9
        L23:
            r9 = 2147483647(0x7fffffff, float:NaN)
            return r9
    }

    private int writeDefaultFileRegion(io.netty.channel.ChannelOutboundBuffer r11, io.netty.channel.DefaultFileRegion r12) throws java.lang.Exception {
            r10 = this;
            long r0 = r12.count()
            long r6 = r12.transferred()
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L11
            r11.remove()
            r11 = 0
            return r11
        L11:
            io.netty.channel.kqueue.BsdSocket r2 = r10.socket
            long r4 = r12.position()
            long r8 = r0 - r6
            r3 = r12
            long r4 = r2.sendFile(r3, r4, r6, r8)
            r8 = 0
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 <= 0) goto L34
            r11.progress(r4)
            long r2 = r3.transferred()
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 < 0) goto L32
            r11.remove()
        L32:
            r11 = 1
            return r11
        L34:
            if (r12 != 0) goto L39
            r10.validateFileRegion(r3, r6)
        L39:
            r11 = 2147483647(0x7fffffff, float:NaN)
            return r11
    }

    private int writeFileRegion(io.netty.channel.ChannelOutboundBuffer r6, io.netty.channel.FileRegion r7) throws java.lang.Exception {
            r5 = this;
            long r0 = r7.transferred()
            long r2 = r7.count()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L11
            r6.remove()
            r6 = 0
            return r6
        L11:
            java.nio.channels.WritableByteChannel r0 = r5.byteChannel
            if (r0 != 0) goto L1c
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$KQueueSocketWritableByteChannel r0 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$KQueueSocketWritableByteChannel
            r0.<init>(r5)
            r5.byteChannel = r0
        L1c:
            java.nio.channels.WritableByteChannel r0 = r5.byteChannel
            long r1 = r7.transferred()
            long r0 = r7.transferTo(r0, r1)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L40
            r6.progress(r0)
            long r0 = r7.transferred()
            long r2 = r7.count()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3e
            r6.remove()
        L3e:
            r6 = 1
            return r6
        L40:
            r6 = 2147483647(0x7fffffff, float:NaN)
            return r6
    }

    @Override // io.netty.channel.AbstractChannel
    protected final void doShutdownOutput() throws java.lang.Exception {
            r3 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r3.socket
            r1 = 0
            r2 = 1
            r0.shutdown(r1, r2)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r6) throws java.lang.Exception {
            r5 = this;
            io.netty.channel.kqueue.KQueueChannelConfig r0 = r5.config()
            int r0 = r0.getWriteSpinCount()
        L8:
            int r1 = r6.size()
            r2 = 0
            r3 = 1
            if (r1 <= r3) goto L1e
            java.lang.Object r4 = r6.current()
            boolean r4 = r4 instanceof io.netty.buffer.ByteBuf
            if (r4 == 0) goto L1e
            int r1 = r5.doWriteMultiple(r6)
        L1c:
            int r0 = r0 - r1
            goto L29
        L1e:
            if (r1 != 0) goto L24
            r5.writeFilter(r2)
            return
        L24:
            int r1 = r5.doWriteSingle(r6)
            goto L1c
        L29:
            if (r0 > 0) goto L8
            if (r0 != 0) goto L3a
            r5.writeFilter(r2)
            io.netty.channel.EventLoop r6 = r5.eventLoop()
            java.lang.Runnable r0 = r5.flushTask
            r6.execute(r0)
            return
        L3a:
            r5.writeFilter(r3)
            return
    }

    protected int doWriteSingle(io.netty.channel.ChannelOutboundBuffer r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r3.current()
            boolean r1 = r0 instanceof io.netty.buffer.ByteBuf
            if (r1 == 0) goto Lf
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            int r3 = r2.writeBytes(r3, r0)
            return r3
        Lf:
            boolean r1 = r0 instanceof io.netty.channel.DefaultFileRegion
            if (r1 == 0) goto L1a
            io.netty.channel.DefaultFileRegion r0 = (io.netty.channel.DefaultFileRegion) r0
            int r3 = r2.writeDefaultFileRegion(r3, r0)
            return r3
        L1a:
            boolean r1 = r0 instanceof io.netty.channel.FileRegion
            if (r1 == 0) goto L25
            io.netty.channel.FileRegion r0 = (io.netty.channel.FileRegion) r0
            int r3 = r2.writeFileRegion(r3, r0)
            return r3
        L25:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>()
            throw r3
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L11
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            boolean r0 = io.netty.channel.unix.UnixChannelUtil.isBufferCopyNeededForWrite(r4)
            if (r0 == 0) goto L10
            io.netty.buffer.ByteBuf r4 = r3.newDirectBuffer(r4)
        L10:
            return r4
        L11:
            boolean r0 = r4 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L16
            return r4
        L16:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.kqueue.AbstractKQueueStreamChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isInputShutdown() {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            boolean r0 = r0.isInputShutdown()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isOpen() {
            r1 = this;
            boolean r0 = super.isOpen()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isOutputShutdown() {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            boolean r0 = r0.isOutputShutdown()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isShutdown() {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.kqueue.AbstractKQueueStreamChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$KQueueStreamUnsafe r0 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$KQueueStreamUnsafe
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdown() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdown(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdown(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.ChannelFuture r0 = r2.shutdownOutput()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto Le
            r2.shutdownOutputDone(r0, r3)
            return r3
        Le:
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$4 r1 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$4
            r1.<init>(r2, r3)
            r0.addListener(r1)
            return r3
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownInput() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdownInput(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownInput(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.shutdownInput0(r3)
            return r3
        Le:
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$3 r1 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$3
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownOutput() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdownOutput(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownOutput(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L14
            io.netty.channel.Channel$Unsafe r0 = r2.unsafe()
            io.netty.channel.AbstractChannel$AbstractUnsafe r0 = (io.netty.channel.AbstractChannel.AbstractUnsafe) r0
            r0.shutdownOutput(r3)
            return r3
        L14:
            io.netty.channel.kqueue.AbstractKQueueStreamChannel$2 r1 = new io.netty.channel.kqueue.AbstractKQueueStreamChannel$2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }
}
