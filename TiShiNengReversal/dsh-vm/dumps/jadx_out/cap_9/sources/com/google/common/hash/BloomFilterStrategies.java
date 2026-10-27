package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
enum BloomFilterStrategies extends java.lang.Enum<com.google.common.hash.BloomFilterStrategies> implements com.google.common.hash.BloomFilter.Strategy {
    private static final /* synthetic */ com.google.common.hash.BloomFilterStrategies[] $VALUES = null;
    public static final com.google.common.hash.BloomFilterStrategies MURMUR128_MITZ_32 = null;
    public static final com.google.common.hash.BloomFilterStrategies MURMUR128_MITZ_64 = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final com.google.common.hash.LongAddable bitCount;
        final java.util.concurrent.atomic.AtomicLongArray data;

        LockFreeBitArray(long r4) {
                r3 = this;
                r0 = 64
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                long r4 = com.google.common.math.LongMath.divide(r4, r0, r2)
                int r4 = com.google.common.primitives.Ints.checkedCast(r4)
                long[] r4 = new long[r4]
                r3.<init>(r4)
                return
        }

        LockFreeBitArray(long[] r7) {
                r6 = this;
                r6.<init>()
                int r0 = r7.length
                r1 = 0
                if (r0 <= 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                java.lang.String r2 = "data length is zero!"
                com.google.common.base.Preconditions.checkArgument(r0, r2)
                java.util.concurrent.atomic.AtomicLongArray r0 = new java.util.concurrent.atomic.AtomicLongArray
                r0.<init>(r7)
                r6.data = r0
                com.google.common.hash.LongAddable r0 = com.google.common.hash.LongAddables.create()
                r6.bitCount = r0
                int r0 = r7.length
                r2 = 0
            L1f:
                if (r1 >= r0) goto L2c
                r4 = r7[r1]
                int r4 = java.lang.Long.bitCount(r4)
                long r4 = (long) r4
                long r2 = r2 + r4
                int r1 = r1 + 1
                goto L1f
            L2c:
                com.google.common.hash.LongAddable r7 = r6.bitCount
                r7.add(r2)
                return
        }

        public static long[] toPlainArray(java.util.concurrent.atomic.AtomicLongArray r5) {
                int r0 = r5.length()
                long[] r1 = new long[r0]
                r2 = 0
            L7:
                if (r2 >= r0) goto L12
                long r3 = r5.get(r2)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L7
            L12:
                return r1
        }

        long bitCount() {
                r2 = this;
                com.google.common.hash.LongAddable r0 = r2.bitCount
                long r0 = r0.sum()
                return r0
        }

        long bitSize() {
                r4 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r4.data
                int r0 = r0.length()
                long r0 = (long) r0
                r2 = 64
                long r0 = r0 * r2
                return r0
        }

        com.google.common.hash.BloomFilterStrategies.LockFreeBitArray copy() {
                r2 = this;
                com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r0 = new com.google.common.hash.BloomFilterStrategies$LockFreeBitArray
                java.util.concurrent.atomic.AtomicLongArray r1 = r2.data
                long[] r1 = toPlainArray(r1)
                r0.<init>(r1)
                return r0
        }

        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.hash.BloomFilterStrategies.LockFreeBitArray
                if (r0 == 0) goto L17
                com.google.common.hash.BloomFilterStrategies$LockFreeBitArray r2 = (com.google.common.hash.BloomFilterStrategies.LockFreeBitArray) r2
                java.util.concurrent.atomic.AtomicLongArray r0 = r1.data
                long[] r0 = toPlainArray(r0)
                java.util.concurrent.atomic.AtomicLongArray r2 = r2.data
                long[] r2 = toPlainArray(r2)
                boolean r2 = java.util.Arrays.equals(r0, r2)
                return r2
            L17:
                r2 = 0
                return r2
        }

        boolean get(long r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r4.data
                r1 = 6
                long r1 = r5 >>> r1
                int r2 = (int) r1
                long r0 = r0.get(r2)
                r2 = 1
                int r6 = (int) r5
                long r5 = r2 << r6
                long r5 = r5 & r0
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto L18
                r5 = 1
                return r5
            L18:
                r5 = 0
                return r5
        }

        public int hashCode() {
                r1 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r1.data
                long[] r0 = toPlainArray(r0)
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        void putAll(com.google.common.hash.BloomFilterStrategies.LockFreeBitArray r12) {
                r11 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r11.data
                int r0 = r0.length()
                java.util.concurrent.atomic.AtomicLongArray r1 = r12.data
                int r1 = r1.length()
                r2 = 0
                if (r0 != r1) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                java.util.concurrent.atomic.AtomicLongArray r1 = r11.data
                int r1 = r1.length()
                java.util.concurrent.atomic.AtomicLongArray r3 = r12.data
                int r3 = r3.length()
                java.lang.String r4 = "BitArrays must be of equal length (%s != %s)"
                com.google.common.base.Preconditions.checkArgument(r0, r4, r1, r3)
                r6 = 0
            L24:
                java.util.concurrent.atomic.AtomicLongArray r0 = r11.data
                int r0 = r0.length()
                if (r6 >= r0) goto L59
                java.util.concurrent.atomic.AtomicLongArray r0 = r12.data
                long r0 = r0.get(r6)
            L32:
                java.util.concurrent.atomic.AtomicLongArray r2 = r11.data
                long r7 = r2.get(r6)
                long r9 = r7 | r0
                int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r2 != 0) goto L3f
                goto L56
            L3f:
                java.util.concurrent.atomic.AtomicLongArray r5 = r11.data
                boolean r2 = r5.compareAndSet(r6, r7, r9)
                if (r2 == 0) goto L32
                int r0 = java.lang.Long.bitCount(r9)
                int r1 = java.lang.Long.bitCount(r7)
                int r0 = r0 - r1
                com.google.common.hash.LongAddable r1 = r11.bitCount
                long r2 = (long) r0
                r1.add(r2)
            L56:
                int r6 = r6 + 1
                goto L24
            L59:
                return
        }

        boolean set(long r11) {
                r10 = this;
                boolean r0 = r10.get(r11)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 6
                long r2 = r11 >>> r0
                int r5 = (int) r2
                r2 = 1
                int r12 = (int) r11
                long r11 = r2 << r12
            L11:
                java.util.concurrent.atomic.AtomicLongArray r0 = r10.data
                long r6 = r0.get(r5)
                long r8 = r6 | r11
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 != 0) goto L1e
                return r1
            L1e:
                java.util.concurrent.atomic.AtomicLongArray r4 = r10.data
                boolean r0 = r4.compareAndSet(r5, r6, r8)
                if (r0 == 0) goto L11
                com.google.common.hash.LongAddable r11 = r10.bitCount
                r11.increment()
                r11 = 1
                return r11
        }
    }

    static {
            com.google.common.hash.BloomFilterStrategies$1 r0 = new com.google.common.hash.BloomFilterStrategies$1
            java.lang.String r1 = "MURMUR128_MITZ_32"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_32 = r0
            com.google.common.hash.BloomFilterStrategies$2 r1 = new com.google.common.hash.BloomFilterStrategies$2
            java.lang.String r3 = "MURMUR128_MITZ_64"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.common.hash.BloomFilterStrategies.MURMUR128_MITZ_64 = r1
            r3 = 2
            com.google.common.hash.BloomFilterStrategies[] r3 = new com.google.common.hash.BloomFilterStrategies[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.google.common.hash.BloomFilterStrategies.$VALUES = r3
            return
    }

    BloomFilterStrategies(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ BloomFilterStrategies(java.lang.String r1, int r2, com.google.common.hash.BloomFilterStrategies.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.hash.BloomFilterStrategies valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.hash.BloomFilterStrategies> r0 = com.google.common.hash.BloomFilterStrategies.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.hash.BloomFilterStrategies r1 = (com.google.common.hash.BloomFilterStrategies) r1
            return r1
    }

    public static com.google.common.hash.BloomFilterStrategies[] values() {
            com.google.common.hash.BloomFilterStrategies[] r0 = com.google.common.hash.BloomFilterStrategies.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.hash.BloomFilterStrategies[] r0 = (com.google.common.hash.BloomFilterStrategies[]) r0
            return r0
    }
}
