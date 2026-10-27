package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractEpollStreamChannel extends io.netty.channel.epoll.AbstractEpollChannel implements io.netty.channel.socket.DuplexChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private java.nio.channels.WritableByteChannel byteChannel;
    private final java.lang.Runnable flushTask;
    private io.netty.channel.unix.FileDescriptor pipeIn;
    private io.netty.channel.unix.FileDescriptor pipeOut;
    private volatile java.util.Queue<io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask> spliceQueue;








    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EpollSocketWritableByteChannel extends io.netty.channel.unix.SocketWritableByteChannel {
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollStreamChannel this$0;

        EpollSocketWritableByteChannel(io.netty.channel.epoll.AbstractEpollStreamChannel r1) {
                r0 = this;
                r0.this$0 = r1
                io.netty.channel.epoll.LinuxSocket r1 = r1.socket
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.unix.SocketWritableByteChannel
        protected io.netty.buffer.ByteBufAllocator alloc() {
                r1 = this;
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r1.this$0
                io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class EpollStreamUnsafe extends io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe {
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollStreamChannel this$0;

        EpollStreamUnsafe(io.netty.channel.epoll.AbstractEpollStreamChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        private void handleReadException(io.netty.channel.ChannelPipeline r3, io.netty.buffer.ByteBuf r4, java.lang.Throwable r5, boolean r6, io.netty.channel.epoll.EpollRecvByteAllocatorHandle r7) {
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
                r7.readComplete()
                r3.fireChannelReadComplete()
                r3.fireExceptionCaught(r5)
                if (r6 != 0) goto L23
                boolean r3 = r5 instanceof java.io.IOException
                if (r3 == 0) goto L22
                goto L23
            L22:
                return
            L23:
                r2.shutdownInput(r0)
                return
        }

        @Override // io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe
        void epollInReady() {
                r10 = this;
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r10.this$0
                io.netty.channel.epoll.EpollChannelConfig r1 = r0.config()
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r10.this$0
                boolean r0 = r0.shouldBreakEpollInReady(r1)
                if (r0 == 0) goto L12
                r10.clearEpollIn0()
                return
            L12:
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r7 = r10.recvBufAllocHandle()
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r10.this$0
                int r2 = io.netty.channel.epoll.Native.EPOLLET
                boolean r0 = r0.isFlagSet(r2)
                r7.edgeTriggered(r0)
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r10.this$0
                io.netty.channel.ChannelPipeline r3 = r0.pipeline()
                io.netty.buffer.ByteBufAllocator r0 = r1.getAllocator()
                r7.reset(r1)
                r10.epollInBefore()
                r2 = 0
                r4 = r2
            L33:
                r5 = 0
                if (r4 != 0) goto L46
                io.netty.channel.epoll.AbstractEpollStreamChannel r4 = r10.this$0     // Catch: java.lang.Throwable -> L3f
                java.util.Queue r4 = io.netty.channel.epoll.AbstractEpollStreamChannel.access$400(r4)     // Catch: java.lang.Throwable -> L3f
                if (r4 == 0) goto L62
                goto L46
            L3f:
                r0 = move-exception
                r5 = r0
                r4 = r2
                r6 = 0
            L43:
                r2 = r10
                goto Lb8
            L46:
                java.lang.Object r6 = r4.peek()     // Catch: java.lang.Throwable -> L3f
                io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask r6 = (io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask) r6     // Catch: java.lang.Throwable -> L3f
                if (r6 == 0) goto L62
                boolean r6 = r6.spliceIn(r7)     // Catch: java.lang.Throwable -> L3f
                if (r6 == 0) goto L60
                io.netty.channel.epoll.AbstractEpollStreamChannel r6 = r10.this$0     // Catch: java.lang.Throwable -> L3f
                boolean r6 = r6.isActive()     // Catch: java.lang.Throwable -> L3f
                if (r6 == 0) goto La2
                r4.remove()     // Catch: java.lang.Throwable -> L3f
                goto La2
            L60:
                r9 = 0
                goto La9
            L62:
                io.netty.buffer.ByteBuf r6 = r7.allocate(r0)     // Catch: java.lang.Throwable -> L3f
                io.netty.channel.epoll.AbstractEpollStreamChannel r8 = r10.this$0     // Catch: java.lang.Throwable -> L8b
                int r8 = r8.doReadBytes(r6)     // Catch: java.lang.Throwable -> L8b
                r7.lastBytesRead(r8)     // Catch: java.lang.Throwable -> L8b
                int r8 = r7.lastBytesRead()     // Catch: java.lang.Throwable -> L8b
                r9 = 1
                if (r8 > 0) goto L91
                r6.release()     // Catch: java.lang.Throwable -> L8b
                int r0 = r7.lastBytesRead()     // Catch: java.lang.Throwable -> L3f
                if (r0 >= 0) goto L80
                goto L81
            L80:
                r9 = 0
            L81:
                if (r9 == 0) goto La9
                r10.readPending = r5     // Catch: java.lang.Throwable -> L86
                goto La9
            L86:
                r0 = move-exception
                r5 = r0
                r4 = r2
                r6 = r9
                goto L43
            L8b:
                r0 = move-exception
                r2 = r10
                r5 = r0
                r4 = r6
                r6 = 0
                goto Lb8
            L91:
                r7.incMessagesRead(r9)     // Catch: java.lang.Throwable -> L8b
                r10.readPending = r5     // Catch: java.lang.Throwable -> L8b
                r3.fireChannelRead(r6)     // Catch: java.lang.Throwable -> L8b
                io.netty.channel.epoll.AbstractEpollStreamChannel r6 = r10.this$0     // Catch: java.lang.Throwable -> L3f
                boolean r6 = r6.shouldBreakEpollInReady(r1)     // Catch: java.lang.Throwable -> L3f
                if (r6 == 0) goto La2
                goto L60
            La2:
                boolean r6 = r7.continueReading()     // Catch: java.lang.Throwable -> L3f
                if (r6 != 0) goto L33
                goto L60
            La9:
                r7.readComplete()     // Catch: java.lang.Throwable -> L86
                r3.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L86
                if (r9 == 0) goto Lb4
                r10.shutdownInput(r5)     // Catch: java.lang.Throwable -> L86
            Lb4:
                r10.epollInFinally(r1)
                return
            Lb8:
                r2.handleReadException(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lbf
                r10.epollInFinally(r1)
                return
            Lbf:
                r0 = move-exception
                r10.epollInFinally(r1)
                throw r0
        }

        @Override // io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe
        io.netty.channel.epoll.EpollRecvByteAllocatorHandle newEpollHandle(io.netty.channel.RecvByteBufAllocator.ExtendedHandle r2) {
                r1 = this;
                io.netty.channel.epoll.EpollRecvByteAllocatorStreamingHandle r0 = new io.netty.channel.epoll.EpollRecvByteAllocatorStreamingHandle
                r0.<init>(r2)
                return r0
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe
        protected java.util.concurrent.Executor prepareToClose() {
                r1 = this;
                java.util.concurrent.Executor r0 = super.prepareToClose()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class SpliceFdTask extends io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final io.netty.channel.unix.FileDescriptor fd;
        private int offset;
        private final io.netty.channel.ChannelPromise promise;
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollStreamChannel this$0;

        static {
                return
        }

        SpliceFdTask(io.netty.channel.epoll.AbstractEpollStreamChannel r1, io.netty.channel.unix.FileDescriptor r2, int r3, int r4, io.netty.channel.ChannelPromise r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r4, r5)
                r0.fd = r2
                r0.promise = r5
                r0.offset = r3
                return
        }

        @Override // io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask
        public boolean spliceIn(io.netty.channel.RecvByteBufAllocator.Handle r14) {
                r13 = this;
                int r0 = r13.len
                r1 = 1
                if (r0 != 0) goto Lb
                io.netty.channel.ChannelPromise r14 = r13.promise
                r14.setSuccess()
                return r1
            Lb:
                io.netty.channel.unix.FileDescriptor[] r0 = io.netty.channel.unix.FileDescriptor.pipe()     // Catch: java.lang.Throwable -> L54
                r2 = 0
                r3 = r0[r2]     // Catch: java.lang.Throwable -> L54
                r4 = r0[r1]     // Catch: java.lang.Throwable -> L54
                int r14 = r13.spliceIn(r4, r14)     // Catch: java.lang.Throwable -> L25
                if (r14 <= 0) goto L57
                int r0 = r13.len     // Catch: java.lang.Throwable -> L25
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r5) goto L28
                int r0 = r0 - r14
                r13.len = r0     // Catch: java.lang.Throwable -> L25
                goto L28
            L25:
                r0 = move-exception
                r14 = r0
                goto L5e
            L28:
                int r5 = r3.intValue()     // Catch: java.lang.Throwable -> L25
                io.netty.channel.unix.FileDescriptor r0 = r13.fd     // Catch: java.lang.Throwable -> L25
                int r8 = r0.intValue()     // Catch: java.lang.Throwable -> L25
                int r0 = r13.offset     // Catch: java.lang.Throwable -> L25
                long r9 = (long) r0     // Catch: java.lang.Throwable -> L25
                long r11 = (long) r14     // Catch: java.lang.Throwable -> L25
                r6 = -1
                int r0 = io.netty.channel.epoll.Native.splice(r5, r6, r8, r9, r11)     // Catch: java.lang.Throwable -> L25
                int r5 = r13.offset     // Catch: java.lang.Throwable -> L25
                int r5 = r5 + r0
                r13.offset = r5     // Catch: java.lang.Throwable -> L25
                int r14 = r14 - r0
                if (r14 > 0) goto L28
                int r14 = r13.len     // Catch: java.lang.Throwable -> L25
                if (r14 != 0) goto L57
                io.netty.channel.ChannelPromise r14 = r13.promise     // Catch: java.lang.Throwable -> L25
                r14.setSuccess()     // Catch: java.lang.Throwable -> L25
                io.netty.channel.epoll.AbstractEpollStreamChannel.access$700(r3)     // Catch: java.lang.Throwable -> L54
                io.netty.channel.epoll.AbstractEpollStreamChannel.access$700(r4)     // Catch: java.lang.Throwable -> L54
                return r1
            L54:
                r0 = move-exception
                r14 = r0
                goto L65
            L57:
                io.netty.channel.epoll.AbstractEpollStreamChannel.access$700(r3)     // Catch: java.lang.Throwable -> L54
                io.netty.channel.epoll.AbstractEpollStreamChannel.access$700(r4)     // Catch: java.lang.Throwable -> L54
                return r2
            L5e:
                io.netty.channel.epoll.AbstractEpollStreamChannel.access$700(r3)     // Catch: java.lang.Throwable -> L54
                io.netty.channel.epoll.AbstractEpollStreamChannel.access$700(r4)     // Catch: java.lang.Throwable -> L54
                throw r14     // Catch: java.lang.Throwable -> L54
            L65:
                io.netty.channel.ChannelPromise r0 = r13.promise
                r0.setFailure(r14)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class SpliceInChannelTask extends io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask implements io.netty.channel.ChannelFutureListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final io.netty.channel.epoll.AbstractEpollStreamChannel ch;
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollStreamChannel this$0;

        static {
                return
        }

        SpliceInChannelTask(io.netty.channel.epoll.AbstractEpollStreamChannel r1, io.netty.channel.epoll.AbstractEpollStreamChannel r2, int r3, io.netty.channel.ChannelPromise r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r3, r4)
                r0.ch = r2
                return
        }

        public void operationComplete(io.netty.channel.ChannelFuture r2) throws java.lang.Exception {
                r1 = this;
                boolean r0 = r2.isSuccess()
                if (r0 != 0) goto Lf
                io.netty.channel.ChannelPromise r0 = r1.promise
                java.lang.Throwable r2 = r2.cause()
                r0.setFailure(r2)
            Lf:
                return
        }

        public /* bridge */ /* synthetic */ void operationComplete(io.netty.util.concurrent.Future r1) throws java.lang.Exception {
                r0 = this;
                io.netty.channel.ChannelFuture r1 = (io.netty.channel.ChannelFuture) r1
                r0.operationComplete(r1)
                return
        }

        @Override // io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask
        public boolean spliceIn(io.netty.channel.RecvByteBufAllocator.Handle r9) {
                r8 = this;
                int r0 = r8.len
                r1 = 1
                if (r0 != 0) goto Lb
                io.netty.channel.ChannelPromise r9 = r8.promise
                r9.setSuccess()
                return r1
            Lb:
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r8.ch     // Catch: java.lang.Throwable -> L28
                io.netty.channel.unix.FileDescriptor r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.access$500(r0)     // Catch: java.lang.Throwable -> L28
                r2 = 0
                if (r0 != 0) goto L2a
                io.netty.channel.unix.FileDescriptor[] r0 = io.netty.channel.unix.FileDescriptor.pipe()     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel r3 = r8.ch     // Catch: java.lang.Throwable -> L28
                r4 = r0[r2]     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel.access$602(r3, r4)     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel r3 = r8.ch     // Catch: java.lang.Throwable -> L28
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L28
                io.netty.channel.unix.FileDescriptor r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.access$502(r3, r0)     // Catch: java.lang.Throwable -> L28
                goto L2a
            L28:
                r9 = move-exception
                goto L87
            L2a:
                int r9 = r8.spliceIn(r0, r9)     // Catch: java.lang.Throwable -> L28
                if (r9 <= 0) goto L81
                int r0 = r8.len     // Catch: java.lang.Throwable -> L28
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r3) goto L3a
                int r0 = r0 - r9
                r8.len = r0     // Catch: java.lang.Throwable -> L28
            L3a:
                int r0 = r8.len     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L41
                io.netty.channel.ChannelPromise r0 = r8.promise     // Catch: java.lang.Throwable -> L28
                goto L4b
            L41:
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r8.ch     // Catch: java.lang.Throwable -> L28
                io.netty.channel.ChannelPromise r0 = r0.newPromise()     // Catch: java.lang.Throwable -> L28
                io.netty.channel.ChannelPromise r0 = r0.addListener(r8)     // Catch: java.lang.Throwable -> L28
            L4b:
                io.netty.channel.epoll.AbstractEpollStreamChannel r3 = r8.this$0     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.EpollChannelConfig r3 = r3.config()     // Catch: java.lang.Throwable -> L28
                boolean r3 = r3.isAutoRead()     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel r4 = r8.ch     // Catch: java.lang.Throwable -> L28
                io.netty.channel.Channel$Unsafe r4 = r4.unsafe()     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceOutTask r5 = new io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceOutTask     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel r6 = r8.this$0     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel r7 = r8.ch     // Catch: java.lang.Throwable -> L28
                r5.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> L28
                r4.write(r5, r0)     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.AbstractEpollStreamChannel r9 = r8.ch     // Catch: java.lang.Throwable -> L28
                io.netty.channel.Channel$Unsafe r9 = r9.unsafe()     // Catch: java.lang.Throwable -> L28
                r9.flush()     // Catch: java.lang.Throwable -> L28
                if (r3 == 0) goto L81
                boolean r9 = r0.isDone()     // Catch: java.lang.Throwable -> L28
                if (r9 != 0) goto L81
                io.netty.channel.epoll.AbstractEpollStreamChannel r9 = r8.this$0     // Catch: java.lang.Throwable -> L28
                io.netty.channel.epoll.EpollChannelConfig r9 = r9.config()     // Catch: java.lang.Throwable -> L28
                r9.setAutoRead(r2)     // Catch: java.lang.Throwable -> L28
            L81:
                int r9 = r8.len     // Catch: java.lang.Throwable -> L28
                if (r9 != 0) goto L86
                return r1
            L86:
                return r2
            L87:
                io.netty.channel.ChannelPromise r0 = r8.promise
                r0.setFailure(r9)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected abstract class SpliceInTask {
        int len;
        final io.netty.channel.ChannelPromise promise;
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollStreamChannel this$0;

        protected SpliceInTask(io.netty.channel.epoll.AbstractEpollStreamChannel r1, int r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.promise = r3
                r0.len = r2
                return
        }

        protected final int spliceIn(io.netty.channel.unix.FileDescriptor r11, io.netty.channel.RecvByteBufAllocator.Handle r12) throws java.io.IOException {
                r10 = this;
                int r12 = r12.guess()
                int r0 = r10.len
                int r12 = java.lang.Math.min(r12, r0)
                r0 = 0
            Lb:
                io.netty.channel.epoll.AbstractEpollStreamChannel r1 = r10.this$0
                io.netty.channel.epoll.LinuxSocket r1 = r1.socket
                int r2 = r1.intValue()
                int r5 = r11.intValue()
                r6 = -1
                long r8 = (long) r12
                r3 = -1
                int r1 = io.netty.channel.epoll.Native.splice(r2, r3, r5, r6, r8)
                if (r1 != 0) goto L23
                return r0
            L23:
                int r0 = r0 + r1
                int r12 = r12 - r1
                goto Lb
        }

        abstract boolean spliceIn(io.netty.channel.RecvByteBufAllocator.Handle r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class SpliceOutTask {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean autoRead;
        private final io.netty.channel.epoll.AbstractEpollStreamChannel ch;
        private int len;
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollStreamChannel this$0;

        static {
                return
        }

        SpliceOutTask(io.netty.channel.epoll.AbstractEpollStreamChannel r1, io.netty.channel.epoll.AbstractEpollStreamChannel r2, int r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.ch = r2
                r0.len = r3
                r0.autoRead = r4
                return
        }

        public boolean spliceOut() throws java.lang.Exception {
                r10 = this;
                r1 = 1
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r10.ch     // Catch: java.io.IOException -> L33
                io.netty.channel.unix.FileDescriptor r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.access$600(r0)     // Catch: java.io.IOException -> L33
                int r2 = r0.intValue()     // Catch: java.io.IOException -> L33
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r10.ch     // Catch: java.io.IOException -> L33
                io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> L33
                int r5 = r0.intValue()     // Catch: java.io.IOException -> L33
                int r0 = r10.len     // Catch: java.io.IOException -> L33
                long r8 = (long) r0     // Catch: java.io.IOException -> L33
                r3 = -1
                r6 = -1
                int r0 = io.netty.channel.epoll.Native.splice(r2, r3, r5, r6, r8)     // Catch: java.io.IOException -> L33
                int r2 = r10.len     // Catch: java.io.IOException -> L33
                int r2 = r2 - r0
                r10.len = r2     // Catch: java.io.IOException -> L33
                if (r2 != 0) goto L36
                boolean r0 = r10.autoRead     // Catch: java.io.IOException -> L33
                if (r0 == 0) goto L35
                io.netty.channel.epoll.AbstractEpollStreamChannel r0 = r10.this$0     // Catch: java.io.IOException -> L33
                io.netty.channel.epoll.EpollChannelConfig r0 = r0.config()     // Catch: java.io.IOException -> L33
                r0.setAutoRead(r1)     // Catch: java.io.IOException -> L33
                goto L35
            L33:
                r0 = move-exception
                goto L38
            L35:
                return r1
            L36:
                r0 = 0
                return r0
            L38:
                boolean r2 = r10.autoRead
                if (r2 == 0) goto L45
                io.netty.channel.epoll.AbstractEpollStreamChannel r2 = r10.this$0
                io.netty.channel.epoll.EpollChannelConfig r2 = r2.config()
                r2.setAutoRead(r1)
            L45:
                throw r0
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.epoll.AbstractEpollStreamChannel.METADATA = r0
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
            io.netty.channel.epoll.AbstractEpollStreamChannel.EXPECTED_TYPES = r0
            java.lang.Class<io.netty.channel.epoll.AbstractEpollStreamChannel> r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.epoll.AbstractEpollStreamChannel.logger = r0
            return
    }

    protected AbstractEpollStreamChannel(int r2) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    protected AbstractEpollStreamChannel(io.netty.channel.Channel r2, int r3) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
    }

    AbstractEpollStreamChannel(io.netty.channel.Channel r2, io.netty.channel.epoll.LinuxSocket r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            io.netty.channel.epoll.AbstractEpollStreamChannel$1 r2 = new io.netty.channel.epoll.AbstractEpollStreamChannel$1
            r2.<init>(r1)
            r1.flushTask = r2
            int r2 = r1.flags
            int r3 = io.netty.channel.epoll.Native.EPOLLRDHUP
            r2 = r2 | r3
            r1.flags = r2
            return
    }

    AbstractEpollStreamChannel(io.netty.channel.Channel r1, io.netty.channel.epoll.LinuxSocket r2, java.net.SocketAddress r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            io.netty.channel.epoll.AbstractEpollStreamChannel$1 r1 = new io.netty.channel.epoll.AbstractEpollStreamChannel$1
            r1.<init>(r0)
            r0.flushTask = r1
            int r1 = r0.flags
            int r2 = io.netty.channel.epoll.Native.EPOLLRDHUP
            r1 = r1 | r2
            r0.flags = r1
            return
    }

    AbstractEpollStreamChannel(io.netty.channel.epoll.LinuxSocket r2) {
            r1 = this;
            boolean r0 = io.netty.channel.epoll.AbstractEpollChannel.isSoErrorZero(r2)
            r1.<init>(r2, r0)
            return
    }

    protected AbstractEpollStreamChannel(io.netty.channel.epoll.LinuxSocket r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            io.netty.channel.epoll.AbstractEpollStreamChannel$1 r2 = new io.netty.channel.epoll.AbstractEpollStreamChannel$1
            r2.<init>(r1)
            r1.flushTask = r2
            int r2 = r1.flags
            int r3 = io.netty.channel.epoll.Native.EPOLLRDHUP
            r2 = r2 | r3
            r1.flags = r2
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.epoll.AbstractEpollStreamChannel r0) {
            r0.clearSpliceQueue()
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.epoll.AbstractEpollStreamChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.shutdownInput0(r1)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.epoll.AbstractEpollStreamChannel r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            r0.shutdownOutputDone(r1, r2)
            return
    }

    static /* synthetic */ void access$300(io.netty.channel.ChannelFuture r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            shutdownDone(r0, r1, r2)
            return
    }

    static /* synthetic */ java.util.Queue access$400(io.netty.channel.epoll.AbstractEpollStreamChannel r0) {
            java.util.Queue<io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask> r0 = r0.spliceQueue
            return r0
    }

    static /* synthetic */ io.netty.channel.unix.FileDescriptor access$500(io.netty.channel.epoll.AbstractEpollStreamChannel r0) {
            io.netty.channel.unix.FileDescriptor r0 = r0.pipeOut
            return r0
    }

    static /* synthetic */ io.netty.channel.unix.FileDescriptor access$502(io.netty.channel.epoll.AbstractEpollStreamChannel r0, io.netty.channel.unix.FileDescriptor r1) {
            r0.pipeOut = r1
            return r1
    }

    static /* synthetic */ io.netty.channel.unix.FileDescriptor access$600(io.netty.channel.epoll.AbstractEpollStreamChannel r0) {
            io.netty.channel.unix.FileDescriptor r0 = r0.pipeIn
            return r0
    }

    static /* synthetic */ io.netty.channel.unix.FileDescriptor access$602(io.netty.channel.epoll.AbstractEpollStreamChannel r0, io.netty.channel.unix.FileDescriptor r1) {
            r0.pipeIn = r1
            return r1
    }

    static /* synthetic */ void access$700(io.netty.channel.unix.FileDescriptor r0) {
            safeClosePipe(r0)
            return
    }

    private void addToSpliceQueue(io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask r2) {
            r1 = this;
            java.util.Queue<io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask> r0 = r1.spliceQueue
            if (r0 != 0) goto L16
            monitor-enter(r1)
            java.util.Queue<io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask> r0 = r1.spliceQueue     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            java.util.Queue r0 = io.netty.util.internal.PlatformDependent.newMpscQueue()     // Catch: java.lang.Throwable -> L10
            r1.spliceQueue = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L14
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            goto L16
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
        L16:
            r0.add(r2)
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
            io.netty.channel.epoll.EpollChannelConfig r5 = r2.config()
            r5.setMaxBytesPerGatheringWrite(r3)
            return
        L12:
            r7 = 4096(0x1000, double:2.0237E-320)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L24
            long r3 = r3 >>> r0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L24
            io.netty.channel.epoll.EpollChannelConfig r5 = r2.config()
            r5.setMaxBytesPerGatheringWrite(r3)
        L24:
            return
    }

    private void clearSpliceQueue() {
            r3 = this;
            java.util.Queue<io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask> r0 = r3.spliceQueue
            if (r0 != 0) goto L5
            goto Le
        L5:
            r1 = 0
        L6:
            java.lang.Object r2 = r0.poll()
            io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInTask r2 = (io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceInTask) r2
            if (r2 != 0) goto Lf
        Le:
            return
        Lf:
            if (r1 != 0) goto L16
            java.nio.channels.ClosedChannelException r1 = new java.nio.channels.ClosedChannelException
            r1.<init>()
        L16:
            io.netty.channel.ChannelPromise r2 = r2.promise
            r2.tryFailure(r1)
            goto L6
    }

    private int doWriteMultiple(io.netty.channel.ChannelOutboundBuffer r4) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.epoll.EpollChannelConfig r0 = r3.config()
            long r0 = r0.getMaxBytesPerGatheringWrite()
            io.netty.channel.EventLoop r2 = r3.eventLoop()
            io.netty.channel.epoll.EpollEventLoop r2 = (io.netty.channel.epoll.EpollEventLoop) r2
            io.netty.channel.unix.IovArray r2 = r2.cleanIovArray()
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

    private void failSpliceIfClosed(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 != 0) goto L1d
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
            r0.<init>()
            boolean r2 = r2.tryFailure(r0)
            if (r2 == 0) goto L1d
            io.netty.channel.EventLoop r2 = r1.eventLoop()
            io.netty.channel.epoll.AbstractEpollStreamChannel$2 r0 = new io.netty.channel.epoll.AbstractEpollStreamChannel$2
            r0.<init>(r1)
            r2.execute(r0)
        L1d:
            return
    }

    private static void safeClosePipe(io.netty.channel.unix.FileDescriptor r2) {
            if (r2 == 0) goto L16
            r2.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L16
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.logger
            java.lang.String r1 = "Error while closing a pipe"
            r0.warn(r1, r2)
        L16:
            return
    }

    private static void shutdownDone(io.netty.channel.ChannelFuture r2, io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            java.lang.Throwable r2 = r2.cause()
            java.lang.Throwable r3 = r3.cause()
            if (r2 == 0) goto L17
            if (r3 == 0) goto L13
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.logger
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
            io.netty.channel.epoll.LinuxSocket r0 = r3.socket     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            r2 = 0
            r0.shutdown(r1, r2)     // Catch: java.lang.Throwable -> Lb
            r4.setSuccess()     // Catch: java.lang.Throwable -> Lb
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
            io.netty.channel.epoll.AbstractEpollStreamChannel$7 r1 = new io.netty.channel.epoll.AbstractEpollStreamChannel$7
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
            io.netty.channel.epoll.EpollChannelConfig r13 = r11.config()
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
            io.netty.channel.epoll.LinuxSocket r3 = r7.socket
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
            io.netty.channel.epoll.LinuxSocket r1 = r8.socket
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
            long r4 = r12.transferred()
            long r8 = r12.count()
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L11
            r11.remove()
            r11 = 0
            return r11
        L11:
            io.netty.channel.epoll.LinuxSocket r0 = r10.socket
            long r2 = r12.position()
            long r6 = r8 - r4
            r1 = r12
            long r2 = r0.sendFile(r1, r2, r4, r6)
            r6 = 0
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 <= 0) goto L34
            r11.progress(r2)
            long r0 = r1.transferred()
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 < 0) goto L32
            r11.remove()
        L32:
            r11 = 1
            return r11
        L34:
            if (r12 != 0) goto L39
            r10.validateFileRegion(r1, r4)
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
            io.netty.channel.epoll.AbstractEpollStreamChannel$EpollSocketWritableByteChannel r0 = new io.netty.channel.epoll.AbstractEpollStreamChannel$EpollSocketWritableByteChannel
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

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r2 = this;
            super.doClose()     // Catch: java.lang.Throwable -> L11
            io.netty.channel.unix.FileDescriptor r0 = r2.pipeIn
            safeClosePipe(r0)
            io.netty.channel.unix.FileDescriptor r0 = r2.pipeOut
            safeClosePipe(r0)
            r2.clearSpliceQueue()
            return
        L11:
            r0 = move-exception
            io.netty.channel.unix.FileDescriptor r1 = r2.pipeIn
            safeClosePipe(r1)
            io.netty.channel.unix.FileDescriptor r1 = r2.pipeOut
            safeClosePipe(r1)
            r2.clearSpliceQueue()
            throw r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected final void doShutdownOutput() throws java.lang.Exception {
            r3 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r3.socket
            r1 = 0
            r2 = 1
            r0.shutdown(r1, r2)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r4) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.epoll.EpollChannelConfig r0 = r3.config()
            int r0 = r0.getWriteSpinCount()
        L8:
            int r1 = r4.size()
            r2 = 1
            if (r1 <= r2) goto L1d
            java.lang.Object r2 = r4.current()
            boolean r2 = r2 instanceof io.netty.buffer.ByteBuf
            if (r2 == 0) goto L1d
            int r1 = r3.doWriteMultiple(r4)
        L1b:
            int r0 = r0 - r1
            goto L2a
        L1d:
            if (r1 != 0) goto L25
            int r4 = io.netty.channel.epoll.Native.EPOLLOUT
            r3.clearFlag(r4)
            return
        L25:
            int r1 = r3.doWriteSingle(r4)
            goto L1b
        L2a:
            if (r0 > 0) goto L8
            if (r0 != 0) goto L3d
            int r4 = io.netty.channel.epoll.Native.EPOLLOUT
            r3.clearFlag(r4)
            io.netty.channel.EventLoop r4 = r3.eventLoop()
            java.lang.Runnable r0 = r3.flushTask
            r4.execute(r0)
            return
        L3d:
            int r4 = io.netty.channel.epoll.Native.EPOLLOUT
            r3.setFlag(r4)
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
            boolean r1 = r0 instanceof io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceOutTask
            if (r1 == 0) goto L3a
            io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceOutTask r0 = (io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceOutTask) r0
            boolean r0 = r0.spliceOut()
            if (r0 != 0) goto L35
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L35:
            r3.remove()
            r3 = 1
            return r3
        L3a:
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
            if (r0 != 0) goto L3a
            boolean r0 = r4 instanceof io.netty.channel.epoll.AbstractEpollStreamChannel.SpliceOutTask
            if (r0 == 0) goto L1a
            return r4
        L1a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.epoll.AbstractEpollStreamChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L3a:
            return r4
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isInputShutdown() {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            boolean r0 = r0.isInputShutdown()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isOpen() {
            r1 = this;
            boolean r0 = super.isOpen()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isOutputShutdown() {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            boolean r0 = r0.isOutputShutdown()
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isShutdown() {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.epoll.AbstractEpollStreamChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe r0 = new io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe
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
            io.netty.channel.epoll.AbstractEpollStreamChannel$6 r1 = new io.netty.channel.epoll.AbstractEpollStreamChannel$6
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
            io.netty.channel.Channel$Unsafe r0 = r2.unsafe()
            io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe r0 = (io.netty.channel.epoll.AbstractEpollStreamChannel.EpollStreamUnsafe) r0
            java.util.concurrent.Executor r0 = r0.prepareToClose()
            if (r0 == 0) goto L15
            io.netty.channel.epoll.AbstractEpollStreamChannel$4 r1 = new io.netty.channel.epoll.AbstractEpollStreamChannel$4
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
        L15:
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L23
            r2.shutdownInput0(r3)
            return r3
        L23:
            io.netty.channel.epoll.AbstractEpollStreamChannel$5 r1 = new io.netty.channel.epoll.AbstractEpollStreamChannel$5
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
            io.netty.channel.epoll.AbstractEpollStreamChannel$3 r1 = new io.netty.channel.epoll.AbstractEpollStreamChannel$3
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }

    public final io.netty.channel.ChannelFuture spliceTo(io.netty.channel.epoll.AbstractEpollStreamChannel r2, int r3) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.spliceTo(r2, r3, r0)
            return r2
    }

    public final io.netty.channel.ChannelFuture spliceTo(io.netty.channel.epoll.AbstractEpollStreamChannel r3, int r4, io.netty.channel.ChannelPromise r5) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            io.netty.channel.EventLoop r1 = r2.eventLoop()
            if (r0 != r1) goto L5c
            java.lang.String r0 = "len"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            io.netty.channel.epoll.EpollChannelConfig r0 = r3.config()
            io.netty.channel.epoll.EpollMode r0 = r0.getEpollMode()
            io.netty.channel.epoll.EpollMode r1 = io.netty.channel.epoll.EpollMode.LEVEL_TRIGGERED
            if (r0 != r1) goto L45
            io.netty.channel.epoll.EpollChannelConfig r0 = r2.config()
            io.netty.channel.epoll.EpollMode r0 = r0.getEpollMode()
            if (r0 != r1) goto L45
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            boolean r0 = r2.isOpen()
            if (r0 != 0) goto L39
            java.nio.channels.ClosedChannelException r3 = new java.nio.channels.ClosedChannelException
            r3.<init>()
            r5.tryFailure(r3)
            return r5
        L39:
            io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask r0 = new io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceInChannelTask
            r0.<init>(r2, r3, r4, r5)
            r2.addToSpliceQueue(r0)
            r2.failSpliceIfClosed(r5)
            return r5
        L45:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "spliceTo() supported only when using "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L5c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "EventLoops are not the same."
            r3.<init>(r4)
            throw r3
    }

    public final io.netty.channel.ChannelFuture spliceTo(io.netty.channel.unix.FileDescriptor r2, int r3, int r4) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.spliceTo(r2, r3, r4, r0)
            return r2
    }

    public final io.netty.channel.ChannelFuture spliceTo(io.netty.channel.unix.FileDescriptor r7, int r8, int r9, io.netty.channel.ChannelPromise r10) {
            r6 = this;
            java.lang.String r0 = "len"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r9, r0)
            java.lang.String r0 = "offset"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r8, r0)
            io.netty.channel.epoll.EpollChannelConfig r0 = r6.config()
            io.netty.channel.epoll.EpollMode r0 = r0.getEpollMode()
            io.netty.channel.epoll.EpollMode r1 = io.netty.channel.epoll.EpollMode.LEVEL_TRIGGERED
            if (r0 != r1) goto L3c
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r10, r0)
            boolean r0 = r6.isOpen()
            if (r0 != 0) goto L2a
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException
            r7.<init>()
            r10.tryFailure(r7)
            return r10
        L2a:
            io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask r0 = new io.netty.channel.epoll.AbstractEpollStreamChannel$SpliceFdTask
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r1
            r6.addToSpliceQueue(r0)
            r6.failSpliceIfClosed(r5)
            return r5
        L3c:
            r7 = r6
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "spliceTo() supported only when using "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }
}
