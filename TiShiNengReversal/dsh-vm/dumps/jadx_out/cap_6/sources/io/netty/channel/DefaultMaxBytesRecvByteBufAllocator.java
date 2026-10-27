package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultMaxBytesRecvByteBufAllocator implements io.netty.channel.MaxBytesRecvByteBufAllocator {
    private volatile int maxBytesPerIndividualRead;
    private volatile int maxBytesPerRead;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.DefaultMaxBytesRecvByteBufAllocator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HandleImpl implements io.netty.channel.RecvByteBufAllocator.ExtendedHandle {
        private int attemptBytesRead;
        private int bytesToRead;
        private final io.netty.util.UncheckedBooleanSupplier defaultMaybeMoreSupplier;
        private int individualReadMax;
        private int lastBytesRead;
        final /* synthetic */ io.netty.channel.DefaultMaxBytesRecvByteBufAllocator this$0;


        private HandleImpl(io.netty.channel.DefaultMaxBytesRecvByteBufAllocator r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                io.netty.channel.DefaultMaxBytesRecvByteBufAllocator$HandleImpl$1 r1 = new io.netty.channel.DefaultMaxBytesRecvByteBufAllocator$HandleImpl$1
                r1.<init>(r0)
                r0.defaultMaybeMoreSupplier = r1
                return
        }

        /* synthetic */ HandleImpl(io.netty.channel.DefaultMaxBytesRecvByteBufAllocator r1, io.netty.channel.DefaultMaxBytesRecvByteBufAllocator.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ int access$000(io.netty.channel.DefaultMaxBytesRecvByteBufAllocator.HandleImpl r0) {
                int r0 = r0.attemptBytesRead
                return r0
        }

        static /* synthetic */ int access$100(io.netty.channel.DefaultMaxBytesRecvByteBufAllocator.HandleImpl r0) {
                int r0 = r0.lastBytesRead
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public io.netty.buffer.ByteBuf allocate(io.netty.buffer.ByteBufAllocator r2) {
                r1 = this;
                int r0 = r1.guess()
                io.netty.buffer.ByteBuf r2 = r2.ioBuffer(r0)
                return r2
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int attemptedBytesRead() {
                r1 = this;
                int r0 = r1.attemptBytesRead
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void attemptedBytesRead(int r1) {
                r0 = this;
                r0.attemptBytesRead = r1
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public boolean continueReading() {
                r1 = this;
                io.netty.util.UncheckedBooleanSupplier r0 = r1.defaultMaybeMoreSupplier
                boolean r0 = r1.continueReading(r0)
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.ExtendedHandle
        public boolean continueReading(io.netty.util.UncheckedBooleanSupplier r2) {
                r1 = this;
                int r0 = r1.bytesToRead
                if (r0 <= 0) goto Lc
                boolean r2 = r2.get()
                if (r2 == 0) goto Lc
                r2 = 1
                return r2
            Lc:
                r2 = 0
                return r2
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int guess() {
                r2 = this;
                int r0 = r2.individualReadMax
                int r1 = r2.bytesToRead
                int r0 = java.lang.Math.min(r0, r1)
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void incMessagesRead(int r1) {
                r0 = this;
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int lastBytesRead() {
                r1 = this;
                int r0 = r1.lastBytesRead
                return r0
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void lastBytesRead(int r2) {
                r1 = this;
                r1.lastBytesRead = r2
                int r0 = r1.bytesToRead
                int r0 = r0 - r2
                r1.bytesToRead = r0
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void readComplete() {
                r0 = this;
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public void reset(io.netty.channel.ChannelConfig r1) {
                r0 = this;
                io.netty.channel.DefaultMaxBytesRecvByteBufAllocator r1 = r0.this$0
                int r1 = r1.maxBytesPerRead()
                r0.bytesToRead = r1
                io.netty.channel.DefaultMaxBytesRecvByteBufAllocator r1 = r0.this$0
                int r1 = r1.maxBytesPerIndividualRead()
                r0.individualReadMax = r1
                return
        }
    }

    public DefaultMaxBytesRecvByteBufAllocator() {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r0, r0)
            return
    }

    public DefaultMaxBytesRecvByteBufAllocator(int r1, int r2) {
            r0 = this;
            r0.<init>()
            checkMaxBytesPerReadPair(r1, r2)
            r0.maxBytesPerRead = r1
            r0.maxBytesPerIndividualRead = r2
            return
    }

    private static void checkMaxBytesPerReadPair(int r3, int r4) {
            java.lang.String r0 = "maxBytesPerRead"
            io.netty.util.internal.ObjectUtil.checkPositive(r3, r0)
            java.lang.String r0 = "maxBytesPerIndividualRead"
            io.netty.util.internal.ObjectUtil.checkPositive(r4, r0)
            if (r3 < r4) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "maxBytesPerRead cannot be less than maxBytesPerIndividualRead ("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "): "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public int maxBytesPerIndividualRead() {
            r1 = this;
            int r0 = r1.maxBytesPerIndividualRead
            return r0
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public io.netty.channel.DefaultMaxBytesRecvByteBufAllocator maxBytesPerIndividualRead(int r5) {
            r4 = this;
            java.lang.String r0 = "maxBytesPerIndividualRead"
            io.netty.util.internal.ObjectUtil.checkPositive(r5, r0)
            monitor-enter(r4)
            int r0 = r4.maxBytesPerRead()     // Catch: java.lang.Throwable -> L10
            if (r5 > r0) goto L12
            r4.maxBytesPerIndividualRead = r5     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            r5 = move-exception
            goto L31
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r2.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "maxBytesPerIndividualRead cannot be greater than maxBytesPerRead ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L10
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "): "
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            r2.append(r5)     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L31:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r5
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public /* bridge */ /* synthetic */ io.netty.channel.MaxBytesRecvByteBufAllocator maxBytesPerIndividualRead(int r1) {
            r0 = this;
            io.netty.channel.DefaultMaxBytesRecvByteBufAllocator r1 = r0.maxBytesPerIndividualRead(r1)
            return r1
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public int maxBytesPerRead() {
            r1 = this;
            int r0 = r1.maxBytesPerRead
            return r0
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public io.netty.channel.DefaultMaxBytesRecvByteBufAllocator maxBytesPerRead(int r5) {
            r4 = this;
            java.lang.String r0 = "maxBytesPerRead"
            io.netty.util.internal.ObjectUtil.checkPositive(r5, r0)
            monitor-enter(r4)
            int r0 = r4.maxBytesPerIndividualRead()     // Catch: java.lang.Throwable -> L10
            if (r5 < r0) goto L12
            r4.maxBytesPerRead = r5     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            r5 = move-exception
            goto L31
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r2.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "maxBytesPerRead cannot be less than maxBytesPerIndividualRead ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L10
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "): "
            r2.append(r0)     // Catch: java.lang.Throwable -> L10
            r2.append(r5)     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L31:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r5
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public /* bridge */ /* synthetic */ io.netty.channel.MaxBytesRecvByteBufAllocator maxBytesPerRead(int r1) {
            r0 = this;
            io.netty.channel.DefaultMaxBytesRecvByteBufAllocator r1 = r0.maxBytesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public io.netty.channel.DefaultMaxBytesRecvByteBufAllocator maxBytesPerReadPair(int r1, int r2) {
            r0 = this;
            checkMaxBytesPerReadPair(r1, r2)
            monitor-enter(r0)
            r0.maxBytesPerRead = r1     // Catch: java.lang.Throwable -> La
            r0.maxBytesPerIndividualRead = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public /* bridge */ /* synthetic */ io.netty.channel.MaxBytesRecvByteBufAllocator maxBytesPerReadPair(int r1, int r2) {
            r0 = this;
            io.netty.channel.DefaultMaxBytesRecvByteBufAllocator r1 = r0.maxBytesPerReadPair(r1, r2)
            return r1
    }

    @Override // io.netty.channel.MaxBytesRecvByteBufAllocator
    public synchronized java.util.Map.Entry<java.lang.Integer, java.lang.Integer> maxBytesPerReadPair() {
            r3 = this;
            monitor-enter(r3)
            java.util.AbstractMap$SimpleEntry r0 = new java.util.AbstractMap$SimpleEntry     // Catch: java.lang.Throwable -> L14
            int r1 = r3.maxBytesPerRead     // Catch: java.lang.Throwable -> L14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L14
            int r2 = r3.maxBytesPerIndividualRead     // Catch: java.lang.Throwable -> L14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // io.netty.channel.RecvByteBufAllocator
    public io.netty.channel.RecvByteBufAllocator.Handle newHandle() {
            r2 = this;
            io.netty.channel.DefaultMaxBytesRecvByteBufAllocator$HandleImpl r0 = new io.netty.channel.DefaultMaxBytesRecvByteBufAllocator$HandleImpl
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
