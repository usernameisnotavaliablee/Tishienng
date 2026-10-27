package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class UnpooledByteBufAllocator extends io.netty.buffer.AbstractByteBufAllocator implements io.netty.buffer.ByteBufAllocatorMetricProvider {
    public static final io.netty.buffer.UnpooledByteBufAllocator DEFAULT = null;
    private final boolean disableLeakDetector;
    private final io.netty.buffer.UnpooledByteBufAllocator.UnpooledByteBufAllocatorMetric metric;
    private final boolean noCleaner;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.buffer.UnpooledByteBufAllocator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstrumentedUnpooledDirectByteBuf extends io.netty.buffer.UnpooledDirectByteBuf {
        InstrumentedUnpooledDirectByteBuf(io.netty.buffer.UnpooledByteBufAllocator r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf
        protected java.nio.ByteBuffer allocateDirect(int r3) {
                r2 = this;
                java.nio.ByteBuffer r3 = super.allocateDirect(r3)
                io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r0 = (io.netty.buffer.UnpooledByteBufAllocator) r0
                int r1 = r3.capacity()
                r0.incrementDirect(r1)
                return r3
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf
        protected void freeDirect(java.nio.ByteBuffer r2) {
                r1 = this;
                int r0 = r2.capacity()
                super.freeDirect(r2)
                io.netty.buffer.ByteBufAllocator r2 = r1.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r2 = (io.netty.buffer.UnpooledByteBufAllocator) r2
                r2.decrementDirect(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstrumentedUnpooledHeapByteBuf extends io.netty.buffer.UnpooledHeapByteBuf {
        InstrumentedUnpooledHeapByteBuf(io.netty.buffer.UnpooledByteBufAllocator r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.buffer.UnpooledHeapByteBuf
        protected byte[] allocateArray(int r3) {
                r2 = this;
                byte[] r3 = super.allocateArray(r3)
                io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r0 = (io.netty.buffer.UnpooledByteBufAllocator) r0
                int r1 = r3.length
                r0.incrementHeap(r1)
                return r3
        }

        @Override // io.netty.buffer.UnpooledHeapByteBuf
        protected void freeArray(byte[] r2) {
                r1 = this;
                int r0 = r2.length
                super.freeArray(r2)
                io.netty.buffer.ByteBufAllocator r2 = r1.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r2 = (io.netty.buffer.UnpooledByteBufAllocator) r2
                r2.decrementHeap(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstrumentedUnpooledUnsafeDirectByteBuf extends io.netty.buffer.UnpooledUnsafeDirectByteBuf {
        InstrumentedUnpooledUnsafeDirectByteBuf(io.netty.buffer.UnpooledByteBufAllocator r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf
        protected java.nio.ByteBuffer allocateDirect(int r3) {
                r2 = this;
                java.nio.ByteBuffer r3 = super.allocateDirect(r3)
                io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r0 = (io.netty.buffer.UnpooledByteBufAllocator) r0
                int r1 = r3.capacity()
                r0.incrementDirect(r1)
                return r3
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf
        protected void freeDirect(java.nio.ByteBuffer r2) {
                r1 = this;
                int r0 = r2.capacity()
                super.freeDirect(r2)
                io.netty.buffer.ByteBufAllocator r2 = r1.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r2 = (io.netty.buffer.UnpooledByteBufAllocator) r2
                r2.decrementDirect(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstrumentedUnpooledUnsafeHeapByteBuf extends io.netty.buffer.UnpooledUnsafeHeapByteBuf {
        InstrumentedUnpooledUnsafeHeapByteBuf(io.netty.buffer.UnpooledByteBufAllocator r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.buffer.UnpooledUnsafeHeapByteBuf, io.netty.buffer.UnpooledHeapByteBuf
        protected byte[] allocateArray(int r3) {
                r2 = this;
                byte[] r3 = super.allocateArray(r3)
                io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r0 = (io.netty.buffer.UnpooledByteBufAllocator) r0
                int r1 = r3.length
                r0.incrementHeap(r1)
                return r3
        }

        @Override // io.netty.buffer.UnpooledHeapByteBuf
        protected void freeArray(byte[] r2) {
                r1 = this;
                int r0 = r2.length
                super.freeArray(r2)
                io.netty.buffer.ByteBufAllocator r2 = r1.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r2 = (io.netty.buffer.UnpooledByteBufAllocator) r2
                r2.decrementHeap(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf extends io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf {
        InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf(io.netty.buffer.UnpooledByteBufAllocator r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf, io.netty.buffer.UnpooledDirectByteBuf
        protected java.nio.ByteBuffer allocateDirect(int r3) {
                r2 = this;
                java.nio.ByteBuffer r3 = super.allocateDirect(r3)
                io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r0 = (io.netty.buffer.UnpooledByteBufAllocator) r0
                int r1 = r3.capacity()
                r0.incrementDirect(r1)
                return r3
        }

        @Override // io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf, io.netty.buffer.UnpooledDirectByteBuf
        protected void freeDirect(java.nio.ByteBuffer r2) {
                r1 = this;
                int r0 = r2.capacity()
                super.freeDirect(r2)
                io.netty.buffer.ByteBufAllocator r2 = r1.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r2 = (io.netty.buffer.UnpooledByteBufAllocator) r2
                r2.decrementDirect(r0)
                return
        }

        @Override // io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf
        java.nio.ByteBuffer reallocateDirect(java.nio.ByteBuffer r3, int r4) {
                r2 = this;
                int r0 = r3.capacity()
                java.nio.ByteBuffer r3 = super.reallocateDirect(r3, r4)
                io.netty.buffer.ByteBufAllocator r4 = r2.alloc()
                io.netty.buffer.UnpooledByteBufAllocator r4 = (io.netty.buffer.UnpooledByteBufAllocator) r4
                int r1 = r3.capacity()
                int r1 = r1 - r0
                r4.incrementDirect(r1)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class UnpooledByteBufAllocatorMetric implements io.netty.buffer.ByteBufAllocatorMetric {
        final io.netty.util.internal.LongCounter directCounter;
        final io.netty.util.internal.LongCounter heapCounter;

        private UnpooledByteBufAllocatorMetric() {
                r1 = this;
                r1.<init>()
                io.netty.util.internal.LongCounter r0 = io.netty.util.internal.PlatformDependent.newLongCounter()
                r1.directCounter = r0
                io.netty.util.internal.LongCounter r0 = io.netty.util.internal.PlatformDependent.newLongCounter()
                r1.heapCounter = r0
                return
        }

        /* synthetic */ UnpooledByteBufAllocatorMetric(io.netty.buffer.UnpooledByteBufAllocator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
                r0.append(r1)
                java.lang.String r1 = "(usedHeapMemory: "
                r0.append(r1)
                long r1 = r3.usedHeapMemory()
                r0.append(r1)
                java.lang.String r1 = "; usedDirectMemory: "
                r0.append(r1)
                long r1 = r3.usedDirectMemory()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // io.netty.buffer.ByteBufAllocatorMetric
        public long usedDirectMemory() {
                r2 = this;
                io.netty.util.internal.LongCounter r0 = r2.directCounter
                long r0 = r0.value()
                return r0
        }

        @Override // io.netty.buffer.ByteBufAllocatorMetric
        public long usedHeapMemory() {
                r2 = this;
                io.netty.util.internal.LongCounter r0 = r2.heapCounter
                long r0 = r0.value()
                return r0
        }
    }

    static {
            io.netty.buffer.UnpooledByteBufAllocator r0 = new io.netty.buffer.UnpooledByteBufAllocator
            boolean r1 = io.netty.util.internal.PlatformDependent.directBufferPreferred()
            r0.<init>(r1)
            io.netty.buffer.UnpooledByteBufAllocator.DEFAULT = r0
            return
    }

    public UnpooledByteBufAllocator(boolean r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public UnpooledByteBufAllocator(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.useDirectBufferNoCleaner()
            r1.<init>(r2, r3, r0)
            return
    }

    public UnpooledByteBufAllocator(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            r1.<init>(r2)
            io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric r2 = new io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric
            r0 = 0
            r2.<init>(r0)
            r1.metric = r2
            r1.disableLeakDetector = r3
            if (r4 == 0) goto L1d
            boolean r2 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r2 == 0) goto L1d
            boolean r2 = io.netty.util.internal.PlatformDependent.hasDirectBufferNoCleanerConstructor()
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r1.noCleaner = r2
            return
    }

    @Override // io.netty.buffer.AbstractByteBufAllocator, io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeDirectBuffer(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = new io.netty.buffer.CompositeByteBuf
            r1 = 1
            r0.<init>(r2, r1, r3)
            boolean r3 = r2.disableLeakDetector
            if (r3 == 0) goto Lb
            return r0
        Lb:
            io.netty.buffer.CompositeByteBuf r3 = io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBufAllocator, io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeHeapBuffer(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = new io.netty.buffer.CompositeByteBuf
            r1 = 0
            r0.<init>(r2, r1, r3)
            boolean r3 = r2.disableLeakDetector
            if (r3 == 0) goto Lb
            return r0
        Lb:
            io.netty.buffer.CompositeByteBuf r3 = io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer(r0)
            return r3
    }

    void decrementDirect(int r4) {
            r3 = this;
            io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric r0 = r3.metric
            io.netty.util.internal.LongCounter r0 = r0.directCounter
            int r4 = -r4
            long r1 = (long) r4
            r0.add(r1)
            return
    }

    void decrementHeap(int r4) {
            r3 = this;
            io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric r0 = r3.metric
            io.netty.util.internal.LongCounter r0 = r0.heapCounter
            int r4 = -r4
            long r1 = (long) r4
            r0.add(r1)
            return
    }

    void incrementDirect(int r4) {
            r3 = this;
            io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric r0 = r3.metric
            io.netty.util.internal.LongCounter r0 = r0.directCounter
            long r1 = (long) r4
            r0.add(r1)
            return
    }

    void incrementHeap(int r4) {
            r3 = this;
            io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric r0 = r3.metric
            io.netty.util.internal.LongCounter r0 = r0.heapCounter
            long r1 = (long) r4
            r0.add(r1)
            return
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public boolean isDirectBufferPooled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocatorMetricProvider
    public io.netty.buffer.ByteBufAllocatorMetric metric() {
            r1 = this;
            io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric r0 = r1.metric
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBufAllocator
    protected io.netty.buffer.ByteBuf newDirectBuffer(int r2, int r3) {
            r1 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L16
            boolean r0 = r1.noCleaner
            if (r0 == 0) goto L10
            io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf r0 = new io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf
            r0.<init>(r1, r2, r3)
            goto L1b
        L10:
            io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf r0 = new io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf
            r0.<init>(r1, r2, r3)
            goto L1b
        L16:
            io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf r0 = new io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf
            r0.<init>(r1, r2, r3)
        L1b:
            boolean r2 = r1.disableLeakDetector
            if (r2 == 0) goto L20
            return r0
        L20:
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer(r0)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBufAllocator
    protected io.netty.buffer.ByteBuf newHeapBuffer(int r2, int r3) {
            r1 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto Lc
            io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf r0 = new io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf
            r0.<init>(r1, r2, r3)
            return r0
        Lc:
            io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf r0 = new io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf
            r0.<init>(r1, r2, r3)
            return r0
    }
}
