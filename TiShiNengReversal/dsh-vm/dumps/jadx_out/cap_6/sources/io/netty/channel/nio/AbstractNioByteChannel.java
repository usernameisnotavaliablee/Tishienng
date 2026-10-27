package io.netty.channel.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractNioByteChannel extends io.netty.channel.nio.AbstractNioChannel {
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private final java.lang.Runnable flushTask;
    private boolean inputClosedSeenErrorOnRead;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected class NioByteUnsafe extends io.netty.channel.nio.AbstractNioChannel.AbstractNioUnsafe {
        final /* synthetic */ io.netty.channel.nio.AbstractNioByteChannel this$0;

        protected NioByteUnsafe(io.netty.channel.nio.AbstractNioByteChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        private void closeOnRead(io.netty.channel.ChannelPipeline r3) {
                r2 = this;
                io.netty.channel.nio.AbstractNioByteChannel r0 = r2.this$0
                boolean r0 = r0.isInputShutdown0()
                if (r0 != 0) goto L27
                io.netty.channel.nio.AbstractNioByteChannel r0 = r2.this$0
                io.netty.channel.ChannelConfig r0 = r0.config()
                boolean r0 = io.netty.channel.nio.AbstractNioByteChannel.access$000(r0)
                if (r0 == 0) goto L1f
                io.netty.channel.nio.AbstractNioByteChannel r0 = r2.this$0
                r0.shutdownInput()
                io.netty.channel.socket.ChannelInputShutdownEvent r0 = io.netty.channel.socket.ChannelInputShutdownEvent.INSTANCE
                r3.fireUserEventTriggered(r0)
                return
            L1f:
                io.netty.channel.ChannelPromise r3 = r2.voidPromise()
                r2.close(r3)
                return
            L27:
                io.netty.channel.nio.AbstractNioByteChannel r0 = r2.this$0
                r1 = 1
                io.netty.channel.nio.AbstractNioByteChannel.access$102(r0, r1)
                io.netty.channel.socket.ChannelInputShutdownReadComplete r0 = io.netty.channel.socket.ChannelInputShutdownReadComplete.INSTANCE
                r3.fireUserEventTriggered(r0)
                return
        }

        private void handleReadException(io.netty.channel.ChannelPipeline r3, io.netty.buffer.ByteBuf r4, java.lang.Throwable r5, boolean r6, io.netty.channel.RecvByteBufAllocator.Handle r7) {
                r2 = this;
                if (r4 == 0) goto L14
                boolean r0 = r4.isReadable()
                if (r0 == 0) goto L11
                io.netty.channel.nio.AbstractNioByteChannel r0 = r2.this$0
                r1 = 0
                r0.readPending = r1
                r3.fireChannelRead(r4)
                goto L14
            L11:
                r4.release()
            L14:
                r7.readComplete()
                r3.fireChannelReadComplete()
                r3.fireExceptionCaught(r5)
                if (r6 != 0) goto L25
                boolean r4 = r5 instanceof java.io.IOException
                if (r4 == 0) goto L24
                goto L25
            L24:
                return
            L25:
                r2.closeOnRead(r3)
                return
        }

        @Override // io.netty.channel.nio.AbstractNioChannel.NioUnsafe
        public final void read() {
                r9 = this;
                io.netty.channel.nio.AbstractNioByteChannel r0 = r9.this$0
                io.netty.channel.ChannelConfig r1 = r0.config()
                io.netty.channel.nio.AbstractNioByteChannel r0 = r9.this$0
                boolean r0 = r0.shouldBreakReadReady(r1)
                if (r0 == 0) goto L14
                io.netty.channel.nio.AbstractNioByteChannel r0 = r9.this$0
                r0.clearReadPending()
                return
            L14:
                io.netty.channel.nio.AbstractNioByteChannel r0 = r9.this$0
                io.netty.channel.ChannelPipeline r3 = r0.pipeline()
                io.netty.buffer.ByteBufAllocator r0 = r1.getAllocator()
                io.netty.channel.RecvByteBufAllocator$Handle r7 = r9.recvBufAllocHandle()
                r7.reset(r1)
            L25:
                r2 = 0
                r4 = 0
                io.netty.buffer.ByteBuf r5 = r7.allocate(r0)     // Catch: java.lang.Throwable -> L54
                io.netty.channel.nio.AbstractNioByteChannel r6 = r9.this$0     // Catch: java.lang.Throwable -> L59
                int r6 = r6.doReadBytes(r5)     // Catch: java.lang.Throwable -> L59
                r7.lastBytesRead(r6)     // Catch: java.lang.Throwable -> L59
                int r6 = r7.lastBytesRead()     // Catch: java.lang.Throwable -> L59
                r8 = 1
                if (r6 > 0) goto L5e
                r5.release()     // Catch: java.lang.Throwable -> L59
                int r0 = r7.lastBytesRead()     // Catch: java.lang.Throwable -> L54
                if (r0 >= 0) goto L45
                goto L46
            L45:
                r8 = 0
            L46:
                if (r8 == 0) goto L52
                io.netty.channel.nio.AbstractNioByteChannel r0 = r9.this$0     // Catch: java.lang.Throwable -> L4d
                r0.readPending = r2     // Catch: java.lang.Throwable -> L4d
                goto L52
            L4d:
                r0 = move-exception
                r2 = r9
                r5 = r0
                r6 = r8
                goto L91
            L52:
                r2 = r8
                goto L6e
            L54:
                r0 = move-exception
                r6 = 0
                r2 = r9
            L57:
                r5 = r0
                goto L91
            L59:
                r0 = move-exception
                r2 = r9
                r4 = r5
                r6 = 0
                goto L57
            L5e:
                r7.incMessagesRead(r8)     // Catch: java.lang.Throwable -> L59
                io.netty.channel.nio.AbstractNioByteChannel r6 = r9.this$0     // Catch: java.lang.Throwable -> L59
                r6.readPending = r2     // Catch: java.lang.Throwable -> L59
                r3.fireChannelRead(r5)     // Catch: java.lang.Throwable -> L59
                boolean r5 = r7.continueReading()     // Catch: java.lang.Throwable -> L54
                if (r5 != 0) goto L25
            L6e:
                r7.readComplete()     // Catch: java.lang.Throwable -> L7a
                r3.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L7a
                if (r2 == 0) goto L7f
                r9.closeOnRead(r3)     // Catch: java.lang.Throwable -> L7a
                goto L7f
            L7a:
                r0 = move-exception
                r5 = r0
                r6 = r2
                r2 = r9
                goto L91
            L7f:
                io.netty.channel.nio.AbstractNioByteChannel r0 = r9.this$0
                boolean r0 = r0.readPending
                if (r0 != 0) goto L8f
                boolean r0 = r1.isAutoRead()
                if (r0 != 0) goto L8f
                r9.removeReadOp()
                return
            L8f:
                r2 = r9
                goto La3
            L91:
                r2.handleReadException(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La4
                io.netty.channel.nio.AbstractNioByteChannel r0 = r2.this$0
                boolean r0 = r0.readPending
                if (r0 != 0) goto La3
                boolean r0 = r1.isAutoRead()
                if (r0 != 0) goto La3
                r9.removeReadOp()
            La3:
                return
            La4:
                r0 = move-exception
                io.netty.channel.nio.AbstractNioByteChannel r3 = r2.this$0
                boolean r3 = r3.readPending
                if (r3 != 0) goto Lb4
                boolean r1 = r1.isAutoRead()
                if (r1 != 0) goto Lb4
                r9.removeReadOp()
            Lb4:
                throw r0
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.nio.AbstractNioByteChannel.METADATA = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " (expected: "
            r0.append(r1)
            java.lang.Class<io.netty.buffer.ByteBuf> r1 = io.netty.buffer.ByteBuf.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Class<io.netty.channel.FileRegion> r1 = io.netty.channel.FileRegion.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.channel.nio.AbstractNioByteChannel.EXPECTED_TYPES = r0
            return
    }

    protected AbstractNioByteChannel(io.netty.channel.Channel r2, java.nio.channels.SelectableChannel r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            io.netty.channel.nio.AbstractNioByteChannel$1 r2 = new io.netty.channel.nio.AbstractNioByteChannel$1
            r2.<init>(r1)
            r1.flushTask = r2
            return
    }

    static /* synthetic */ boolean access$000(io.netty.channel.ChannelConfig r0) {
            boolean r0 = isAllowHalfClosure(r0)
            return r0
    }

    static /* synthetic */ boolean access$102(io.netty.channel.nio.AbstractNioByteChannel r0, boolean r1) {
            r0.inputClosedSeenErrorOnRead = r1
            return r1
    }

    private int doWriteInternal(io.netty.channel.ChannelOutboundBuffer r8, java.lang.Object r9) throws java.lang.Exception {
            r7 = this;
            boolean r0 = r9 instanceof io.netty.buffer.ByteBuf
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L26
            io.netty.buffer.ByteBuf r9 = (io.netty.buffer.ByteBuf) r9
            boolean r0 = r9.isReadable()
            if (r0 != 0) goto L12
            r8.remove()
            return r2
        L12:
            int r0 = r7.doWriteBytes(r9)
            if (r0 <= 0) goto L59
            long r2 = (long) r0
            r8.progress(r2)
            boolean r9 = r9.isReadable()
            if (r9 != 0) goto L25
            r8.remove()
        L25:
            return r1
        L26:
            boolean r0 = r9 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L5d
            io.netty.channel.FileRegion r9 = (io.netty.channel.FileRegion) r9
            long r3 = r9.transferred()
            long r5 = r9.count()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L3c
            r8.remove()
            return r2
        L3c:
            long r2 = r7.doWriteFileRegion(r9)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L59
            r8.progress(r2)
            long r2 = r9.transferred()
            long r4 = r9.count()
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 < 0) goto L58
            r8.remove()
        L58:
            return r1
        L59:
            r8 = 2147483647(0x7fffffff, float:NaN)
            return r8
        L5d:
            java.lang.Error r8 = new java.lang.Error
            r8.<init>()
            throw r8
    }

    private static boolean isAllowHalfClosure(io.netty.channel.ChannelConfig r1) {
            boolean r0 = r1 instanceof io.netty.channel.socket.SocketChannelConfig
            if (r0 == 0) goto Le
            io.netty.channel.socket.SocketChannelConfig r1 = (io.netty.channel.socket.SocketChannelConfig) r1
            boolean r1 = r1.isAllowHalfClosure()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    protected final void clearOpWrite() {
            r3 = this;
            java.nio.channels.SelectionKey r0 = r3.selectionKey()
            boolean r1 = r0.isValid()
            if (r1 != 0) goto Lb
            goto L18
        Lb:
            int r1 = r0.interestOps()
            r2 = r1 & 4
            if (r2 == 0) goto L18
            r1 = r1 & (-5)
            r0.interestOps(r1)
        L18:
            return
    }

    protected abstract int doReadBytes(io.netty.buffer.ByteBuf r1) throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.ChannelConfig r0 = r2.config()
            int r0 = r0.getWriteSpinCount()
        L8:
            java.lang.Object r1 = r3.current()
            if (r1 != 0) goto L12
            r2.clearOpWrite()
            return
        L12:
            int r1 = r2.doWriteInternal(r3, r1)
            int r0 = r0 - r1
            if (r0 > 0) goto L8
            if (r0 >= 0) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            r2.incompleteWrite(r3)
            return
    }

    protected final int doWrite0(io.netty.channel.ChannelOutboundBuffer r2) throws java.lang.Exception {
            r1 = this;
            java.lang.Object r0 = r2.current()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object r0 = r2.current()
            int r2 = r1.doWriteInternal(r2, r0)
            return r2
    }

    protected abstract int doWriteBytes(io.netty.buffer.ByteBuf r1) throws java.lang.Exception;

    protected abstract long doWriteFileRegion(io.netty.channel.FileRegion r1) throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected final java.lang.Object filterOutboundMessage(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L13
            r0 = r4
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            boolean r1 = r0.isDirect()
            if (r1 == 0) goto Le
            return r4
        Le:
            io.netty.buffer.ByteBuf r4 = r3.newDirectBuffer(r0)
            return r4
        L13:
            boolean r0 = r4 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L18
            return r4
        L18:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.nio.AbstractNioByteChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    protected final void incompleteWrite(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r1.setOpWrite()
            return
        L6:
            r1.clearOpWrite()
            io.netty.channel.nio.NioEventLoop r2 = r1.eventLoop()
            java.lang.Runnable r0 = r1.flushTask
            r2.execute(r0)
            return
    }

    protected boolean isInputShutdown0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.nio.AbstractNioByteChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.nio.AbstractNioChannel.AbstractNioUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe r0 = new io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe
            r0.<init>(r1)
            return r0
    }

    protected final void setOpWrite() {
            r3 = this;
            java.nio.channels.SelectionKey r0 = r3.selectionKey()
            boolean r1 = r0.isValid()
            if (r1 != 0) goto Lb
            goto L18
        Lb:
            int r1 = r0.interestOps()
            r2 = r1 & 4
            if (r2 != 0) goto L18
            r1 = r1 | 4
            r0.interestOps(r1)
        L18:
            return
    }

    final boolean shouldBreakReadReady(io.netty.channel.ChannelConfig r2) {
            r1 = this;
            boolean r0 = r1.isInputShutdown0()
            if (r0 == 0) goto L12
            boolean r0 = r1.inputClosedSeenErrorOnRead
            if (r0 != 0) goto L10
            boolean r2 = isAllowHalfClosure(r2)
            if (r2 != 0) goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    protected abstract io.netty.channel.ChannelFuture shutdownInput();
}
