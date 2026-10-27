package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class KQueueRecvByteAllocatorHandle extends io.netty.channel.RecvByteBufAllocator.DelegatingHandle implements io.netty.channel.RecvByteBufAllocator.ExtendedHandle {
    private final io.netty.util.UncheckedBooleanSupplier defaultMaybeMoreDataSupplier;
    private long numberBytesPending;
    private boolean overrideGuess;
    private final io.netty.channel.unix.PreferredDirectByteBufAllocator preferredDirectByteBufAllocator;
    private boolean readEOF;


    KQueueRecvByteAllocatorHandle(io.netty.channel.RecvByteBufAllocator.ExtendedHandle r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.unix.PreferredDirectByteBufAllocator r1 = new io.netty.channel.unix.PreferredDirectByteBufAllocator
            r1.<init>()
            r0.preferredDirectByteBufAllocator = r1
            io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle$1 r1 = new io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle$1
            r1.<init>(r0)
            r0.defaultMaybeMoreDataSupplier = r1
            return
    }

    private int guess0() {
            r4 = this;
            long r0 = r4.numberBytesPending
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r0, r2)
            int r1 = (int) r0
            return r1
    }

    @Override // io.netty.channel.RecvByteBufAllocator.DelegatingHandle, io.netty.channel.RecvByteBufAllocator.Handle
    public io.netty.buffer.ByteBuf allocate(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            io.netty.channel.unix.PreferredDirectByteBufAllocator r0 = r1.preferredDirectByteBufAllocator
            r0.updateAllocator(r2)
            boolean r2 = r1.overrideGuess
            if (r2 == 0) goto L14
            io.netty.channel.unix.PreferredDirectByteBufAllocator r2 = r1.preferredDirectByteBufAllocator
            int r0 = r1.guess0()
            io.netty.buffer.ByteBuf r2 = r2.ioBuffer(r0)
            return r2
        L14:
            io.netty.channel.RecvByteBufAllocator$Handle r2 = r1.delegate()
            io.netty.channel.unix.PreferredDirectByteBufAllocator r0 = r1.preferredDirectByteBufAllocator
            io.netty.buffer.ByteBuf r2 = r2.allocate(r0)
            return r2
    }

    @Override // io.netty.channel.RecvByteBufAllocator.DelegatingHandle, io.netty.channel.RecvByteBufAllocator.Handle
    public boolean continueReading() {
            r1 = this;
            io.netty.util.UncheckedBooleanSupplier r0 = r1.defaultMaybeMoreDataSupplier
            boolean r0 = r1.continueReading(r0)
            return r0
    }

    @Override // io.netty.channel.RecvByteBufAllocator.ExtendedHandle
    public boolean continueReading(io.netty.util.UncheckedBooleanSupplier r2) {
            r1 = this;
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate()
            io.netty.channel.RecvByteBufAllocator$ExtendedHandle r0 = (io.netty.channel.RecvByteBufAllocator.ExtendedHandle) r0
            boolean r2 = r0.continueReading(r2)
            return r2
    }

    @Override // io.netty.channel.RecvByteBufAllocator.DelegatingHandle, io.netty.channel.RecvByteBufAllocator.Handle
    public int guess() {
            r1 = this;
            boolean r0 = r1.overrideGuess
            if (r0 == 0) goto L9
            int r0 = r1.guess0()
            return r0
        L9:
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate()
            int r0 = r0.guess()
            return r0
    }

    boolean isReadEOF() {
            r1 = this;
            boolean r0 = r1.readEOF
            return r0
    }

    @Override // io.netty.channel.RecvByteBufAllocator.DelegatingHandle, io.netty.channel.RecvByteBufAllocator.Handle
    public void lastBytesRead(int r7) {
            r6 = this;
            r0 = 0
            if (r7 >= 0) goto L5
            goto Ld
        L5:
            long r2 = r6.numberBytesPending
            long r4 = (long) r7
            long r2 = r2 - r4
            long r0 = java.lang.Math.max(r0, r2)
        Ld:
            r6.numberBytesPending = r0
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r6.delegate()
            r0.lastBytesRead(r7)
            return
    }

    boolean maybeMoreDataToRead() {
            r5 = this;
            long r0 = r5.numberBytesPending
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    void numberBytesPending(long r1) {
            r0 = this;
            r0.numberBytesPending = r1
            return
    }

    void readEOF() {
            r1 = this;
            r0 = 1
            r1.readEOF = r0
            return
    }

    @Override // io.netty.channel.RecvByteBufAllocator.DelegatingHandle, io.netty.channel.RecvByteBufAllocator.Handle
    public void reset(io.netty.channel.ChannelConfig r2) {
            r1 = this;
            r0 = r2
            io.netty.channel.kqueue.KQueueChannelConfig r0 = (io.netty.channel.kqueue.KQueueChannelConfig) r0
            boolean r0 = r0.getRcvAllocTransportProvidesGuess()
            r1.overrideGuess = r0
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.delegate()
            r0.reset(r2)
            return
    }
}
