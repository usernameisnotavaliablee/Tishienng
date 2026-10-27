package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class EpollRecvByteAllocatorHandle extends io.netty.channel.RecvByteBufAllocator.DelegatingHandle implements io.netty.channel.RecvByteBufAllocator.ExtendedHandle {
    private final io.netty.util.UncheckedBooleanSupplier defaultMaybeMoreDataSupplier;
    private boolean isEdgeTriggered;
    private final io.netty.channel.unix.PreferredDirectByteBufAllocator preferredDirectByteBufAllocator;
    private boolean receivedRdHup;


    EpollRecvByteAllocatorHandle(io.netty.channel.RecvByteBufAllocator.ExtendedHandle r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.unix.PreferredDirectByteBufAllocator r1 = new io.netty.channel.unix.PreferredDirectByteBufAllocator
            r1.<init>()
            r0.preferredDirectByteBufAllocator = r1
            io.netty.channel.epoll.EpollRecvByteAllocatorHandle$1 r1 = new io.netty.channel.epoll.EpollRecvByteAllocatorHandle$1
            r1.<init>(r0)
            r0.defaultMaybeMoreDataSupplier = r1
            return
    }

    @Override // io.netty.channel.RecvByteBufAllocator.DelegatingHandle, io.netty.channel.RecvByteBufAllocator.Handle
    public final io.netty.buffer.ByteBuf allocate(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            io.netty.channel.unix.PreferredDirectByteBufAllocator r0 = r1.preferredDirectByteBufAllocator
            r0.updateAllocator(r2)
            io.netty.channel.RecvByteBufAllocator$Handle r2 = r1.delegate()
            io.netty.channel.unix.PreferredDirectByteBufAllocator r0 = r1.preferredDirectByteBufAllocator
            io.netty.buffer.ByteBuf r2 = r2.allocate(r0)
            return r2
    }

    @Override // io.netty.channel.RecvByteBufAllocator.DelegatingHandle, io.netty.channel.RecvByteBufAllocator.Handle
    public final boolean continueReading() {
            r1 = this;
            io.netty.util.UncheckedBooleanSupplier r0 = r1.defaultMaybeMoreDataSupplier
            boolean r0 = r1.continueReading(r0)
            return r0
    }

    @Override // io.netty.channel.RecvByteBufAllocator.ExtendedHandle
    public final boolean continueReading(io.netty.util.UncheckedBooleanSupplier r2) {
            r1 = this;
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate()
            io.netty.channel.RecvByteBufAllocator$ExtendedHandle r0 = (io.netty.channel.RecvByteBufAllocator.ExtendedHandle) r0
            boolean r2 = r0.continueReading(r2)
            return r2
    }

    final void edgeTriggered(boolean r1) {
            r0 = this;
            r0.isEdgeTriggered = r1
            return
    }

    final boolean isEdgeTriggered() {
            r1 = this;
            boolean r0 = r1.isEdgeTriggered
            return r0
    }

    final boolean isReceivedRdHup() {
            r1 = this;
            boolean r0 = r1.receivedRdHup
            return r0
    }

    boolean maybeMoreDataToRead() {
            r2 = this;
            boolean r0 = r2.isEdgeTriggered
            if (r0 == 0) goto La
            int r0 = r2.lastBytesRead()
            if (r0 > 0) goto L18
        La:
            boolean r0 = r2.isEdgeTriggered
            if (r0 != 0) goto L1a
            int r0 = r2.lastBytesRead()
            int r1 = r2.attemptedBytesRead()
            if (r0 != r1) goto L1a
        L18:
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    final void receivedRdHup() {
            r1 = this;
            r0 = 1
            r1.receivedRdHup = r0
            return
    }
}
