package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class BloomFilter<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
    private final com.google.common.hash.BloomFilterStrategies.LockFreeBitArray bits;
    private final com.google.common.hash.Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final com.google.common.hash.BloomFilter.Strategy strategy;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.hash.BloomFilter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SerialForm<T> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final com.google.common.hash.Funnel<? super T> funnel;
        final int numHashFunctions;
        final com.google.common.hash.BloomFilter.Strategy strategy;

        SerialForm(com.google.common.hash.BloomFilter<T> r2) {
                r1 = this;
                r1.<init>()
                com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = com.google.common.hash.BloomFilter.access$000(r2)
                java.util.concurrent.atomic.AtomicLongArray r0 = r0.data
                long[] r0 = com.google.common.hash.BloomFilterStrategies.LockFreeBitArray.toPlainArray(r0)
                r1.data = r0
                int r0 = com.google.common.hash.BloomFilter.access$100(r2)
                r1.numHashFunctions = r0
                com.google.common.hash.Funnel r0 = com.google.common.hash.BloomFilter.access$200(r2)
                r1.funnel = r0
                com.google.common.hash.BloomFilter$Strategy r2 = com.google.common.hash.BloomFilter.access$300(r2)
                r1.strategy = r2
                return
        }

        java.lang.Object readResolve() {
                r6 = this;
                com.google.common.hash.BloomFilter r0 = new com.google.common.hash.BloomFilter
                com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = new com.google.common.hash.BloomFilterStrategies$LockFreeBitArray
                long[] r2 = r6.data
                r1.<init>(r2)
                int r2 = r6.numHashFunctions
                com.google.common.hash.Funnel<? super T> r3 = r6.funnel
                com.google.common.hash.BloomFilter$Strategy r4 = r6.strategy
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Strategy extends java.io.Serializable {
        <T> boolean mightContain(T r1, com.google.common.hash.Funnel<? super T> r2, int r3, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r4);

        int ordinal();

        <T> boolean put(T r1, com.google.common.hash.Funnel<? super T> r2, int r3, com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r4);
    }

    private BloomFilter(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r5, int r6, com.google.common.hash.Funnel<? super T> r7, com.google.common.hash.BloomFilter.Strategy r8) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r6 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "numHashFunctions (%s) must be > 0"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r6)
            r2 = 255(0xff, float:3.57E-43)
            if (r6 > r2) goto L14
            r0 = 1
        L14:
            java.lang.String r1 = "numHashFunctions (%s) must be <= 255"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r6)
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r5 = (com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) r5
            r4.bits = r5
            r4.numHashFunctions = r6
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.hash.Funnel r5 = (com.google.common.hash.Funnel) r5
            r4.funnel = r5
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.hash.BloomFilter$Strategy r5 = (com.google.common.hash.BloomFilter.Strategy) r5
            r4.strategy = r5
            return
    }

    /* synthetic */ BloomFilter(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r1, int r2, com.google.common.hash.Funnel r3, com.google.common.hash.BloomFilter.Strategy r4, com.google.common.hash.BloomFilter.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ com.google.common.hash.BloomFilterStrategies.LockFreeBitArray access$000(com.google.common.hash.BloomFilter r0) {
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r0.bits
            return r0
    }

    static /* synthetic */ int access$100(com.google.common.hash.BloomFilter r0) {
            int r0 = r0.numHashFunctions
            return r0
    }

    static /* synthetic */ com.google.common.hash.Funnel access$200(com.google.common.hash.BloomFilter r0) {
            com.google.common.hash.Funnel<? super T> r0 = r0.funnel
            return r0
    }

    static /* synthetic */ com.google.common.hash.BloomFilter.Strategy access$300(com.google.common.hash.BloomFilter r0) {
            com.google.common.hash.BloomFilter$Strategy r0 = r0.strategy
            return r0
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r2, int r3) {
            long r0 = (long) r3
            com.google.common.hash.BloomFilter r2 = create(r2, r0)
            return r2
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r2, int r3, double r4) {
            long r0 = (long) r3
            com.google.common.hash.BloomFilter r2 = create(r2, r0, r4)
            return r2
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r2, long r3) {
            r0 = 4584304132692975288(0x3f9eb851eb851eb8, double:0.03)
            com.google.common.hash.BloomFilter r2 = create(r2, r3, r0)
            return r2
    }

    public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r6, long r7, double r9) {
            com.google.common.hash.BloomFilterStrategies r5 = com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_64
            r0 = r6
            r1 = r7
            r3 = r9
            com.google.common.hash.BloomFilter r6 = create(r0, r1, r3, r5)
            return r6
    }

    @com.google.common.annotations.VisibleForTesting
    static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> r6, long r7, double r9, com.google.common.hash.BloomFilter.Strategy r11) {
            com.google.common.base.Preconditions.checkNotNull(r6)
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "Expected insertions (%s) must be >= 0"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r7)
            r0 = 0
            int r5 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.String r1 = "False positive probability (%s) must be > 0.0"
            java.lang.Double r5 = java.lang.Double.valueOf(r9)
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r5 >= 0) goto L2c
            r2 = 1
        L2c:
            java.lang.String r0 = "False positive probability (%s) must be < 1.0"
            java.lang.Double r1 = java.lang.Double.valueOf(r9)
            com.google.common.base.Preconditions.checkArgument(r2, r0, r1)
            com.google.common.base.Preconditions.checkNotNull(r11)
            if (r4 != 0) goto L3c
            r7 = 1
        L3c:
            long r9 = optimalNumOfBits(r7, r9)
            int r7 = optimalNumOfHashFunctions(r7, r9)
            com.google.common.hash.BloomFilter r8 = new com.google.common.hash.BloomFilter     // Catch: java.lang.IllegalArgumentException -> L4f
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = new com.google.common.hash.BloomFilterStrategies$LockFreeBitArray     // Catch: java.lang.IllegalArgumentException -> L4f
            r0.<init>(r9)     // Catch: java.lang.IllegalArgumentException -> L4f
            r8.<init>(r0, r7, r6, r11)     // Catch: java.lang.IllegalArgumentException -> L4f
            return r8
        L4f:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Could not create BloomFilter of "
            r8.append(r11)
            r8.append(r9)
            java.lang.String r9 = " bits"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8, r6)
            throw r7
    }

    @com.google.common.annotations.VisibleForTesting
    static long optimalNumOfBits(long r3, double r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            r5 = 1
        L8:
            long r3 = -r3
            double r3 = (double) r3
            double r5 = java.lang.Math.log(r5)
            double r3 = r3 * r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.log(r5)
            double r5 = java.lang.Math.log(r5)
            double r0 = r0 * r5
            double r3 = r3 / r0
            long r3 = (long) r3
            return r3
    }

    @com.google.common.annotations.VisibleForTesting
    static int optimalNumOfHashFunctions(long r0, long r2) {
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.log(r0)
            double r2 = r2 * r0
            long r0 = java.lang.Math.round(r2)
            int r1 = (int) r0
            r0 = 1
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream r9, com.google.common.hash.Funnel<? super T> r10) throws java.io.IOException {
            java.lang.String r0 = "InputStream"
            com.google.common.base.Preconditions.checkNotNull(r9, r0)
            java.lang.String r0 = "Funnel"
            com.google.common.base.Preconditions.checkNotNull(r10, r0)
            r0 = -1
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.RuntimeException -> L4b
            r1.<init>(r9)     // Catch: java.lang.RuntimeException -> L4b
            byte r9 = r1.readByte()     // Catch: java.lang.RuntimeException -> L4b
            byte r2 = r1.readByte()     // Catch: java.lang.RuntimeException -> L48
            int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)     // Catch: java.lang.RuntimeException -> L48
            int r0 = r1.readInt()     // Catch: java.lang.RuntimeException -> L44
            com.google.common.hash.BloomFilterStrategies[] r3 = com.google.common.hash.BloomFilterStrategies.values()     // Catch: java.lang.RuntimeException -> L34
            r3 = r3[r9]     // Catch: java.lang.RuntimeException -> L34
            long[] r4 = new long[r0]     // Catch: java.lang.RuntimeException -> L34
            r5 = 0
        L29:
            if (r5 >= r0) goto L39
            long r6 = r1.readLong()     // Catch: java.lang.RuntimeException -> L34
            r4[r5] = r6     // Catch: java.lang.RuntimeException -> L34
            int r5 = r5 + 1
            goto L29
        L34:
            r10 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L4e
        L39:
            com.google.common.hash.BloomFilter r1 = new com.google.common.hash.BloomFilter     // Catch: java.lang.RuntimeException -> L34
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r5 = new com.google.common.hash.BloomFilterStrategies$LockFreeBitArray     // Catch: java.lang.RuntimeException -> L34
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L34
            r1.<init>(r5, r2, r10, r3)     // Catch: java.lang.RuntimeException -> L34
            return r1
        L44:
            r10 = move-exception
        L45:
            r0 = r9
            r9 = -1
            goto L4e
        L48:
            r10 = move-exception
            r2 = -1
            goto L45
        L4b:
            r10 = move-exception
            r9 = -1
            r2 = -1
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unable to deserialize BloomFilter from InputStream. strategyOrdinal: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " numHashFunctions: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " dataLength: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r9, r10)
            throw r0
    }

    private java.lang.Object writeReplace() {
            r1 = this;
            com.google.common.hash.BloomFilter$SerialForm r0 = new com.google.common.hash.BloomFilter$SerialForm
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public boolean apply(T r1) {
            r0 = this;
            boolean r1 = r0.mightContain(r1)
            return r1
    }

    public long approximateElementCount() {
            r4 = this;
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r4.bits
            long r0 = r0.bitSize()
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r2 = r4.bits
            long r2 = r2.bitCount()
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            double r2 = -r2
            double r2 = java.lang.Math.log1p(r2)
            double r2 = -r2
            double r2 = r2 * r0
            int r0 = r4.numHashFunctions
            double r0 = (double) r0
            double r2 = r2 / r0
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            long r0 = com.google.common.math.DoubleMath.roundToLong(r2, r0)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    long bitSize() {
            r2 = this;
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r2.bits
            long r0 = r0.bitSize()
            return r0
    }

    public com.google.common.hash.BloomFilter<T> copy() {
            r5 = this;
            com.google.common.hash.BloomFilter r0 = new com.google.common.hash.BloomFilter
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r5.bits
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r1.copy()
            int r2 = r5.numHashFunctions
            com.google.common.hash.Funnel<? super T> r3 = r5.funnel
            com.google.common.hash.BloomFilter$Strategy r4 = r5.strategy
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.hash.BloomFilter
            r2 = 0
            if (r1 == 0) goto L30
            com.google.common.hash.BloomFilter r5 = (com.google.common.hash.BloomFilter) r5
            int r1 = r4.numHashFunctions
            int r3 = r5.numHashFunctions
            if (r1 != r3) goto L30
            com.google.common.hash.Funnel<? super T> r1 = r4.funnel
            com.google.common.hash.Funnel<? super T> r3 = r5.funnel
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r4.bits
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r3 = r5.bits
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            com.google.common.hash.BloomFilter$Strategy r1 = r4.strategy
            com.google.common.hash.BloomFilter$Strategy r5 = r5.strategy
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L30
            return r0
        L30:
            return r2
    }

    public double expectedFpp() {
            r4 = this;
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r4.bits
            long r0 = r0.bitCount()
            double r0 = (double) r0
            long r2 = r4.bitSize()
            double r2 = (double) r2
            double r0 = r0 / r2
            int r2 = r4.numHashFunctions
            double r2 = (double) r2
            double r0 = java.lang.Math.pow(r0, r2)
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.numHashFunctions
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.common.hash.Funnel<? super T> r1 = r6.funnel
            com.google.common.hash.BloomFilter$Strategy r2 = r6.strategy
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r3 = r6.bits
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            int r0 = com.google.common.base.Objects.hashCode(r4)
            return r0
    }

    public boolean isCompatible(com.google.common.hash.BloomFilter<T> r6) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            if (r5 == r6) goto L2d
            int r0 = r5.numHashFunctions
            int r1 = r6.numHashFunctions
            if (r0 != r1) goto L2d
            long r0 = r5.bitSize()
            long r2 = r6.bitSize()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2d
            com.google.common.hash.BloomFilter$Strategy r0 = r5.strategy
            com.google.common.hash.BloomFilter$Strategy r1 = r6.strategy
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            com.google.common.hash.Funnel<? super T> r0 = r5.funnel
            com.google.common.hash.Funnel<? super T> r6 = r6.funnel
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L2d
            r6 = 1
            return r6
        L2d:
            r6 = 0
            return r6
    }

    public boolean mightContain(T r5) {
            r4 = this;
            com.google.common.hash.BloomFilter$Strategy r0 = r4.strategy
            com.google.common.hash.Funnel<? super T> r1 = r4.funnel
            int r2 = r4.numHashFunctions
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r3 = r4.bits
            boolean r5 = r0.mightContain(r5, r1, r2, r3)
            return r5
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean put(T r5) {
            r4 = this;
            com.google.common.hash.BloomFilter$Strategy r0 = r4.strategy
            com.google.common.hash.Funnel<? super T> r1 = r4.funnel
            int r2 = r4.numHashFunctions
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r3 = r4.bits
            boolean r5 = r0.put(r5, r1, r2, r3)
            return r5
    }

    public void putAll(com.google.common.hash.BloomFilter<T> r14) {
            r13 = this;
            com.google.common.base.Preconditions.checkNotNull(r14)
            r0 = 0
            r1 = 1
            if (r13 == r14) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "Cannot combine a BloomFilter with itself."
            com.google.common.base.Preconditions.checkArgument(r2, r3)
            int r2 = r13.numHashFunctions
            int r3 = r14.numHashFunctions
            if (r2 != r3) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            java.lang.String r5 = "BloomFilters must have the same number of hash functions (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r4, r5, r2, r3)
            long r2 = r13.bitSize()
            long r4 = r14.bitSize()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2b
            r7 = 1
            goto L2c
        L2b:
            r7 = 0
        L2c:
            long r9 = r13.bitSize()
            long r11 = r14.bitSize()
            java.lang.String r8 = "BloomFilters must have the same size underlying bit arrays (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r7, r8, r9, r11)
            com.google.common.hash.BloomFilter$Strategy r0 = r13.strategy
            com.google.common.hash.BloomFilter$Strategy r1 = r14.strategy
            boolean r0 = r0.equals(r1)
            com.google.common.hash.BloomFilter$Strategy r1 = r13.strategy
            com.google.common.hash.BloomFilter$Strategy r2 = r14.strategy
            java.lang.String r3 = "BloomFilters must have equal strategies (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            com.google.common.hash.Funnel<? super T> r0 = r13.funnel
            com.google.common.hash.Funnel<? super T> r1 = r14.funnel
            boolean r0 = r0.equals(r1)
            com.google.common.hash.Funnel<? super T> r1 = r13.funnel
            com.google.common.hash.Funnel<? super T> r2 = r14.funnel
            java.lang.String r3 = "BloomFilters must have equal funnels (%s != %s)"
            com.google.common.base.Preconditions.checkArgument(r0, r3, r1, r2)
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = r13.bits
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r14 = r14.bits
            r0.putAll(r14)
            return
    }

    public void writeTo(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r4)
            com.google.common.hash.BloomFilter$Strategy r4 = r3.strategy
            int r4 = r4.ordinal()
            long r1 = (long) r4
            byte r4 = com.google.common.primitives.SignedBytes.checkedCast(r1)
            r0.writeByte(r4)
            int r4 = r3.numHashFunctions
            long r1 = (long) r4
            byte r4 = com.google.common.primitives.UnsignedBytes.checkedCast(r1)
            r0.writeByte(r4)
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r4 = r3.bits
            java.util.concurrent.atomic.AtomicLongArray r4 = r4.data
            int r4 = r4.length()
            r0.writeInt(r4)
            r4 = 0
        L29:
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r3.bits
            java.util.concurrent.atomic.AtomicLongArray r1 = r1.data
            int r1 = r1.length()
            if (r4 >= r1) goto L41
            com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r1 = r3.bits
            java.util.concurrent.atomic.AtomicLongArray r1 = r1.data
            long r1 = r1.get(r4)
            r0.writeLong(r1)
            int r4 = r4 + 1
            goto L29
        L41:
            return
    }
}
