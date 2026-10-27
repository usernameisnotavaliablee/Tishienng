package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractCoalescingBufferQueue {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.ArrayDeque<java.lang.Object> bufAndListenerPairs;
    private int readableBytes;
    private final io.netty.channel.PendingBytesTracker tracker;

    static {
            java.lang.Class<io.netty.channel.AbstractCoalescingBufferQueue> r0 = io.netty.channel.AbstractCoalescingBufferQueue.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.AbstractCoalescingBufferQueue.logger = r0
            return
    }

    protected AbstractCoalescingBufferQueue(io.netty.channel.Channel r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r3)
            r1.bufAndListenerPairs = r0
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            io.netty.channel.PendingBytesTracker r2 = io.netty.channel.PendingBytesTracker.newTracker(r2)
        L12:
            r1.tracker = r2
            return
    }

    private void addFirst(io.netty.buffer.ByteBuf r2, io.netty.channel.ChannelFutureListener r3) {
            r1 = this;
            if (r3 == 0) goto L7
            java.util.ArrayDeque<java.lang.Object> r0 = r1.bufAndListenerPairs
            r0.addFirst(r3)
        L7:
            java.util.ArrayDeque<java.lang.Object> r3 = r1.bufAndListenerPairs
            r3.addFirst(r2)
            int r2 = r2.readableBytes()
            r1.incrementReadableBytes(r2)
            return
    }

    private void decrementReadableBytes(int r4) {
            r3 = this;
            int r0 = r3.readableBytes
            int r0 = r0 - r4
            r3.readableBytes = r0
            io.netty.channel.PendingBytesTracker r0 = r3.tracker
            if (r0 == 0) goto Ld
            long r1 = (long) r4
            r0.decrementPendingOutboundBytes(r1)
        Ld:
            return
    }

    private void incrementReadableBytes(int r4) {
            r3 = this;
            int r0 = r3.readableBytes
            int r1 = r0 + r4
            if (r1 < r0) goto L11
            r3.readableBytes = r1
            io.netty.channel.PendingBytesTracker r0 = r3.tracker
            if (r0 == 0) goto L10
            long r1 = (long) r4
            r0.incrementPendingOutboundBytes(r1)
        L10:
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buffer queue length overflow: "
            r1.append(r2)
            int r2 = r3.readableBytes
            r1.append(r2)
            java.lang.String r2 = " + "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private void releaseAndCompleteAll(io.netty.channel.ChannelFuture r5) {
            r4 = this;
            int r0 = r4.readableBytes
            r4.decrementReadableBytes(r0)
            r0 = 0
        L6:
            java.util.ArrayDeque<java.lang.Object> r1 = r4.bufAndListenerPairs
            java.lang.Object r1 = r1.poll()
            if (r1 != 0) goto L17
            if (r0 != 0) goto L11
            return
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L17:
            boolean r2 = r1 instanceof io.netty.buffer.ByteBuf     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L21
            io.netty.util.ReferenceCountUtil.safeRelease(r1)     // Catch: java.lang.Throwable -> L1f
            goto L6
        L1f:
            r1 = move-exception
            goto L27
        L21:
            io.netty.channel.ChannelFutureListener r1 = (io.netty.channel.ChannelFutureListener) r1     // Catch: java.lang.Throwable -> L1f
            r1.operationComplete(r5)     // Catch: java.lang.Throwable -> L1f
            goto L6
        L27:
            if (r0 != 0) goto L2b
            r0 = r1
            goto L6
        L2b:
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.AbstractCoalescingBufferQueue.logger
            java.lang.String r3 = "Throwable being suppressed because Throwable {} is already pending"
            r2.info(r3, r0, r1)
            goto L6
    }

    private static io.netty.channel.ChannelFutureListener toChannelFutureListener(io.netty.channel.ChannelPromise r1) {
            boolean r0 = r1.isVoid()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            io.netty.channel.DelegatingChannelPromiseNotifier r0 = new io.netty.channel.DelegatingChannelPromiseNotifier
            r0.<init>(r1)
            return r0
    }

    public final void add(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r0 = 0
            r1.add(r2, r0)
            return
    }

    public final void add(io.netty.buffer.ByteBuf r2, io.netty.channel.ChannelFutureListener r3) {
            r1 = this;
            java.util.ArrayDeque<java.lang.Object> r0 = r1.bufAndListenerPairs
            r0.add(r2)
            if (r3 == 0) goto Lc
            java.util.ArrayDeque<java.lang.Object> r0 = r1.bufAndListenerPairs
            r0.add(r3)
        Lc:
            int r2 = r2.readableBytes()
            r1.incrementReadableBytes(r2)
            return
    }

    public final void add(io.netty.buffer.ByteBuf r1, io.netty.channel.ChannelPromise r2) {
            r0 = this;
            io.netty.channel.ChannelFutureListener r2 = toChannelFutureListener(r2)
            r0.add(r1, r2)
            return
    }

    public final void addFirst(io.netty.buffer.ByteBuf r1, io.netty.channel.ChannelPromise r2) {
            r0 = this;
            io.netty.channel.ChannelFutureListener r2 = toChannelFutureListener(r2)
            r0.addFirst(r1, r2)
            return
    }

    protected abstract io.netty.buffer.ByteBuf compose(io.netty.buffer.ByteBufAllocator r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3);

    protected io.netty.buffer.ByteBuf composeFirst(io.netty.buffer.ByteBufAllocator r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            return r2
    }

    protected final io.netty.buffer.ByteBuf composeIntoComposite(io.netty.buffer.ByteBufAllocator r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            int r0 = r1.size()
            int r0 = r0 + 2
            io.netty.buffer.CompositeByteBuf r2 = r2.compositeBuffer(r0)
            r0 = 1
            r2.addComponent(r0, r3)     // Catch: java.lang.Throwable -> L12
            r2.addComponent(r0, r4)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r3 = move-exception
            r2.release()
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            io.netty.util.internal.PlatformDependent.throwException(r3)
            return r2
    }

    protected final io.netty.buffer.ByteBuf copyAndCompose(io.netty.buffer.ByteBufAllocator r3, io.netty.buffer.ByteBuf r4, io.netty.buffer.ByteBuf r5) {
            r2 = this;
            int r0 = r4.readableBytes()
            int r1 = r5.readableBytes()
            int r0 = r0 + r1
            io.netty.buffer.ByteBuf r3 = r3.ioBuffer(r0)
            io.netty.buffer.ByteBuf r0 = r3.writeBytes(r4)     // Catch: java.lang.Throwable -> L15
            r0.writeBytes(r5)     // Catch: java.lang.Throwable -> L15
            goto L1f
        L15:
            r0 = move-exception
            r3.release()
            io.netty.util.ReferenceCountUtil.safeRelease(r5)
            io.netty.util.internal.PlatformDependent.throwException(r0)
        L1f:
            r4.release()
            r5.release()
            return r3
    }

    public final void copyTo(io.netty.channel.AbstractCoalescingBufferQueue r3) {
            r2 = this;
            java.util.ArrayDeque<java.lang.Object> r0 = r3.bufAndListenerPairs
            java.util.ArrayDeque<java.lang.Object> r1 = r2.bufAndListenerPairs
            r0.addAll(r1)
            int r0 = r2.readableBytes
            r3.incrementReadableBytes(r0)
            return
    }

    public final boolean isEmpty() {
            r1 = this;
            java.util.ArrayDeque<java.lang.Object> r0 = r1.bufAndListenerPairs
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final int readableBytes() {
            r1 = this;
            int r0 = r1.readableBytes
            return r0
    }

    public final void releaseAndFailAll(io.netty.channel.ChannelOutboundInvoker r1, java.lang.Throwable r2) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r1.newFailedFuture(r2)
            r0.releaseAndCompleteAll(r1)
            return
    }

    public final io.netty.buffer.ByteBuf remove(io.netty.buffer.ByteBufAllocator r6, int r7, io.netty.channel.ChannelPromise r8) {
            r5 = this;
            java.lang.String r0 = "bytes"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r7, r0)
            java.lang.String r0 = "aggregatePromise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r8, r0)
            java.util.ArrayDeque<java.lang.Object> r0 = r5.bufAndListenerPairs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            io.netty.buffer.ByteBuf r6 = r5.removeEmptyValue()
            return r6
        L17:
            int r0 = r5.readableBytes
            int r7 = java.lang.Math.min(r7, r0)
            r0 = 0
            r1 = r7
            r2 = r0
        L20:
            java.util.ArrayDeque<java.lang.Object> r3 = r5.bufAndListenerPairs     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto L29
            goto L77
        L29:
            boolean r4 = r3 instanceof io.netty.channel.ChannelFutureListener     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L35
            io.netty.channel.ChannelFutureListener r3 = (io.netty.channel.ChannelFutureListener) r3     // Catch: java.lang.Throwable -> L33
            r8.addListener(r3)     // Catch: java.lang.Throwable -> L33
            goto L20
        L33:
            r6 = move-exception
            goto L6b
        L35:
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3     // Catch: java.lang.Throwable -> L33
            int r4 = r3.readableBytes()     // Catch: java.lang.Throwable -> L57
            if (r4 <= r1) goto L5a
            java.util.ArrayDeque<java.lang.Object> r0 = r5.bufAndListenerPairs     // Catch: java.lang.Throwable -> L57
            r0.addFirst(r3)     // Catch: java.lang.Throwable -> L57
            if (r1 <= 0) goto L77
            io.netty.buffer.ByteBuf r0 = r3.readRetainedSlice(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L50
            io.netty.buffer.ByteBuf r6 = r5.composeFirst(r6, r0)     // Catch: java.lang.Throwable -> L33
        L4e:
            r2 = r6
            goto L55
        L50:
            io.netty.buffer.ByteBuf r6 = r5.compose(r6, r2, r0)     // Catch: java.lang.Throwable -> L33
            goto L4e
        L55:
            r1 = 0
            goto L77
        L57:
            r6 = move-exception
            r0 = r3
            goto L6b
        L5a:
            int r4 = r3.readableBytes()     // Catch: java.lang.Throwable -> L57
            int r1 = r1 - r4
            if (r2 != 0) goto L66
            io.netty.buffer.ByteBuf r2 = r5.composeFirst(r6, r3)     // Catch: java.lang.Throwable -> L57
            goto L20
        L66:
            io.netty.buffer.ByteBuf r2 = r5.compose(r6, r2, r3)     // Catch: java.lang.Throwable -> L57
            goto L20
        L6b:
            io.netty.util.ReferenceCountUtil.safeRelease(r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r2)
            r8.setFailure(r6)
            io.netty.util.internal.PlatformDependent.throwException(r6)
        L77:
            int r7 = r7 - r1
            r5.decrementReadableBytes(r7)
            return r2
    }

    protected abstract io.netty.buffer.ByteBuf removeEmptyValue();

    public final io.netty.buffer.ByteBuf removeFirst(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            java.util.ArrayDeque<java.lang.Object> r0 = r3.bufAndListenerPairs
            java.lang.Object r0 = r0.poll()
            if (r0 != 0) goto La
            r4 = 0
            return r4
        La:
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            int r1 = r0.readableBytes()
            r3.decrementReadableBytes(r1)
            java.util.ArrayDeque<java.lang.Object> r1 = r3.bufAndListenerPairs
            java.lang.Object r1 = r1.peek()
            boolean r2 = r1 instanceof io.netty.channel.ChannelFutureListener
            if (r2 == 0) goto L27
            io.netty.channel.ChannelFutureListener r1 = (io.netty.channel.ChannelFutureListener) r1
            r4.addListener(r1)
            java.util.ArrayDeque<java.lang.Object> r4 = r3.bufAndListenerPairs
            r4.poll()
        L27:
            return r0
    }

    protected final int size() {
            r1 = this;
            java.util.ArrayDeque<java.lang.Object> r0 = r1.bufAndListenerPairs
            int r0 = r0.size()
            return r0
    }

    public final void writeAndRemoveAll(io.netty.channel.ChannelHandlerContext r7) {
            r6 = this;
            int r0 = r6.readableBytes
            r6.decrementReadableBytes(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L8:
            java.util.ArrayDeque<java.lang.Object> r3 = r6.bufAndListenerPairs
            java.lang.Object r3 = r3.poll()
            if (r3 != 0) goto L25
            if (r1 == 0) goto L1c
            io.netty.channel.ChannelPromise r3 = r7.voidPromise()     // Catch: java.lang.Throwable -> L1a
            r7.write(r1, r3)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L4b
        L1c:
            if (r2 != 0) goto L1f
            return
        L1f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L25:
            boolean r4 = r3 instanceof io.netty.buffer.ByteBuf     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L36
            if (r1 == 0) goto L32
            io.netty.channel.ChannelPromise r4 = r7.voidPromise()     // Catch: java.lang.Throwable -> L1a
            r7.write(r1, r4)     // Catch: java.lang.Throwable -> L1a
        L32:
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3     // Catch: java.lang.Throwable -> L1a
            r1 = r3
            goto L8
        L36:
            boolean r4 = r3 instanceof io.netty.channel.ChannelPromise     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L41
            io.netty.channel.ChannelPromise r3 = (io.netty.channel.ChannelPromise) r3     // Catch: java.lang.Throwable -> L1a
            r7.write(r1, r3)     // Catch: java.lang.Throwable -> L1a
        L3f:
            r1 = r0
            goto L8
        L41:
            io.netty.channel.ChannelFuture r4 = r7.write(r1)     // Catch: java.lang.Throwable -> L1a
            io.netty.channel.ChannelFutureListener r3 = (io.netty.channel.ChannelFutureListener) r3     // Catch: java.lang.Throwable -> L1a
            r4.addListener(r3)     // Catch: java.lang.Throwable -> L1a
            goto L3f
        L4b:
            if (r2 != 0) goto L4f
            r2 = r3
            goto L8
        L4f:
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.channel.AbstractCoalescingBufferQueue.logger
            java.lang.String r5 = "Throwable being suppressed because Throwable {} is already pending"
            r4.info(r5, r2, r3)
            goto L8
    }
}
