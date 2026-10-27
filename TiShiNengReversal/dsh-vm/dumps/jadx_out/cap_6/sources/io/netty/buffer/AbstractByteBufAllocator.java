package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractByteBufAllocator implements io.netty.buffer.ByteBufAllocator {
    static final int CALCULATE_THRESHOLD = 4194304;
    static final int DEFAULT_INITIAL_CAPACITY = 256;
    static final int DEFAULT_MAX_CAPACITY = Integer.MAX_VALUE;
    static final int DEFAULT_MAX_COMPONENTS = 16;
    private final boolean directByDefault;
    private final io.netty.buffer.ByteBuf emptyBuf;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.buffer.AbstractByteBufAllocator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$util$ResourceLeakDetector$Level = null;

        static {
                io.netty.util.ResourceLeakDetector$Level[] r0 = io.netty.util.ResourceLeakDetector.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.buffer.AbstractByteBufAllocator.AnonymousClass1.$SwitchMap$io$netty$util$ResourceLeakDetector$Level = r0
                io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.SIMPLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.buffer.AbstractByteBufAllocator.AnonymousClass1.$SwitchMap$io$netty$util$ResourceLeakDetector$Level     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.ADVANCED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.buffer.AbstractByteBufAllocator.AnonymousClass1.$SwitchMap$io$netty$util$ResourceLeakDetector$Level     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.PARANOID     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "toLeakAwareBuffer"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.Class<io.netty.buffer.AbstractByteBufAllocator> r1 = io.netty.buffer.AbstractByteBufAllocator.class
            io.netty.util.ResourceLeakDetector.addExclusions(r1, r0)
            return
    }

    protected AbstractByteBufAllocator() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected AbstractByteBufAllocator(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Ld
            boolean r1 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.directByDefault = r1
            io.netty.buffer.EmptyByteBuf r1 = new io.netty.buffer.EmptyByteBuf
            r1.<init>(r0)
            r0.emptyBuf = r1
            return
    }

    protected static io.netty.buffer.ByteBuf toLeakAwareBuffer(io.netty.buffer.ByteBuf r2) {
            int[] r0 = io.netty.buffer.AbstractByteBufAllocator.AnonymousClass1.$SwitchMap$io$netty$util$ResourceLeakDetector$Level
            io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.getLevel()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L16
            r1 = 3
            if (r0 == r1) goto L16
            goto L32
        L16:
            io.netty.util.ResourceLeakDetector<io.netty.buffer.ByteBuf> r0 = io.netty.buffer.AbstractByteBuf.leakDetector
            io.netty.util.ResourceLeakTracker r0 = r0.track(r2)
            if (r0 == 0) goto L32
            io.netty.buffer.AdvancedLeakAwareByteBuf r1 = new io.netty.buffer.AdvancedLeakAwareByteBuf
            r1.<init>(r2, r0)
            return r1
        L24:
            io.netty.util.ResourceLeakDetector<io.netty.buffer.ByteBuf> r0 = io.netty.buffer.AbstractByteBuf.leakDetector
            io.netty.util.ResourceLeakTracker r0 = r0.track(r2)
            if (r0 == 0) goto L32
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = new io.netty.buffer.SimpleLeakAwareByteBuf
            r1.<init>(r2, r0)
            return r1
        L32:
            return r2
    }

    protected static io.netty.buffer.CompositeByteBuf toLeakAwareBuffer(io.netty.buffer.CompositeByteBuf r2) {
            int[] r0 = io.netty.buffer.AbstractByteBufAllocator.AnonymousClass1.$SwitchMap$io$netty$util$ResourceLeakDetector$Level
            io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.getLevel()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L16
            r1 = 3
            if (r0 == r1) goto L16
            goto L32
        L16:
            io.netty.util.ResourceLeakDetector<io.netty.buffer.ByteBuf> r0 = io.netty.buffer.AbstractByteBuf.leakDetector
            io.netty.util.ResourceLeakTracker r0 = r0.track(r2)
            if (r0 == 0) goto L32
            io.netty.buffer.AdvancedLeakAwareCompositeByteBuf r1 = new io.netty.buffer.AdvancedLeakAwareCompositeByteBuf
            r1.<init>(r2, r0)
            return r1
        L24:
            io.netty.util.ResourceLeakDetector<io.netty.buffer.ByteBuf> r0 = io.netty.buffer.AbstractByteBuf.leakDetector
            io.netty.util.ResourceLeakTracker r0 = r0.track(r2)
            if (r0 == 0) goto L32
            io.netty.buffer.SimpleLeakAwareCompositeByteBuf r1 = new io.netty.buffer.SimpleLeakAwareCompositeByteBuf
            r1.<init>(r2, r0)
            return r1
        L32:
            return r2
    }

    private static void validate(int r3, int r4) {
            java.lang.String r0 = "initialCapacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r0)
            if (r3 > r4) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "initialCapacity: %d (expected: not greater than maxCapacity(%d)"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf buffer() {
            r1 = this;
            boolean r0 = r1.directByDefault
            if (r0 == 0) goto L9
            io.netty.buffer.ByteBuf r0 = r1.directBuffer()
            return r0
        L9:
            io.netty.buffer.ByteBuf r0 = r1.heapBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf buffer(int r2) {
            r1 = this;
            boolean r0 = r1.directByDefault
            if (r0 == 0) goto L9
            io.netty.buffer.ByteBuf r2 = r1.directBuffer(r2)
            return r2
        L9:
            io.netty.buffer.ByteBuf r2 = r1.heapBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf buffer(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.directByDefault
            if (r0 == 0) goto L9
            io.netty.buffer.ByteBuf r2 = r1.directBuffer(r2, r3)
            return r2
        L9:
            io.netty.buffer.ByteBuf r2 = r1.heapBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public int calculateNewCapacity(int r4, int r5) {
            r3 = this;
            java.lang.String r0 = "minNewCapacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            if (r4 > r5) goto L24
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r4 != r0) goto Lc
            return r0
        Lc:
            if (r4 <= r0) goto L18
            int r4 = r4 / r0
            int r4 = r4 * r0
            int r1 = r5 - r0
            if (r4 <= r1) goto L16
            return r5
        L16:
            int r4 = r4 + r0
            return r4
        L18:
            r0 = 64
        L1a:
            if (r0 >= r4) goto L1f
            int r0 = r0 << 1
            goto L1a
        L1f:
            int r4 = java.lang.Math.min(r0, r5)
            return r4
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "minNewCapacity: %d (expected: not greater than maxCapacity(%d)"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeBuffer() {
            r1 = this;
            boolean r0 = r1.directByDefault
            if (r0 == 0) goto L9
            io.netty.buffer.CompositeByteBuf r0 = r1.compositeDirectBuffer()
            return r0
        L9:
            io.netty.buffer.CompositeByteBuf r0 = r1.compositeHeapBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeBuffer(int r2) {
            r1 = this;
            boolean r0 = r1.directByDefault
            if (r0 == 0) goto L9
            io.netty.buffer.CompositeByteBuf r2 = r1.compositeDirectBuffer(r2)
            return r2
        L9:
            io.netty.buffer.CompositeByteBuf r2 = r1.compositeHeapBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeDirectBuffer() {
            r1 = this;
            r0 = 16
            io.netty.buffer.CompositeByteBuf r0 = r1.compositeDirectBuffer(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeDirectBuffer(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = new io.netty.buffer.CompositeByteBuf
            r1 = 1
            r0.<init>(r2, r1, r3)
            io.netty.buffer.CompositeByteBuf r3 = toLeakAwareBuffer(r0)
            return r3
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeHeapBuffer() {
            r1 = this;
            r0 = 16
            io.netty.buffer.CompositeByteBuf r0 = r1.compositeHeapBuffer(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeHeapBuffer(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = new io.netty.buffer.CompositeByteBuf
            r1 = 0
            r0.<init>(r2, r1, r3)
            io.netty.buffer.CompositeByteBuf r3 = toLeakAwareBuffer(r0)
            return r3
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf directBuffer() {
            r2 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1 = 2147483647(0x7fffffff, float:NaN)
            io.netty.buffer.ByteBuf r0 = r2.directBuffer(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf directBuffer(int r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            io.netty.buffer.ByteBuf r2 = r1.directBuffer(r2, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf directBuffer(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L7
            if (r2 != 0) goto L7
            io.netty.buffer.ByteBuf r1 = r0.emptyBuf
            return r1
        L7:
            validate(r1, r2)
            io.netty.buffer.ByteBuf r1 = r0.newDirectBuffer(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf heapBuffer() {
            r2 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1 = 2147483647(0x7fffffff, float:NaN)
            io.netty.buffer.ByteBuf r0 = r2.heapBuffer(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf heapBuffer(int r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            io.netty.buffer.ByteBuf r2 = r1.heapBuffer(r2, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf heapBuffer(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L7
            if (r2 != 0) goto L7
            io.netty.buffer.ByteBuf r1 = r0.emptyBuf
            return r1
        L7:
            validate(r1, r2)
            io.netty.buffer.ByteBuf r1 = r0.newHeapBuffer(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf ioBuffer() {
            r2 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L14
            boolean r0 = r2.isDirectBufferPooled()
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            io.netty.buffer.ByteBuf r0 = r2.heapBuffer(r1)
            return r0
        L14:
            io.netty.buffer.ByteBuf r0 = r2.directBuffer(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf ioBuffer(int r2) {
            r1 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 != 0) goto L12
            boolean r0 = r1.isDirectBufferPooled()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            io.netty.buffer.ByteBuf r2 = r1.heapBuffer(r2)
            return r2
        L12:
            io.netty.buffer.ByteBuf r2 = r1.directBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf ioBuffer(int r2, int r3) {
            r1 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 != 0) goto L12
            boolean r0 = r1.isDirectBufferPooled()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            io.netty.buffer.ByteBuf r2 = r1.heapBuffer(r2, r3)
            return r2
        L12:
            io.netty.buffer.ByteBuf r2 = r1.directBuffer(r2, r3)
            return r2
    }

    protected abstract io.netty.buffer.ByteBuf newDirectBuffer(int r1, int r2);

    protected abstract io.netty.buffer.ByteBuf newHeapBuffer(int r1, int r2);

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(directByDefault: "
            r0.append(r1)
            boolean r1 = r2.directByDefault
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
