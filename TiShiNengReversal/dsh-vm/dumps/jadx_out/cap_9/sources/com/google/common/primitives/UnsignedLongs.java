package com.google.common.primitives;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.UnsignedLongs.LexicographicalComparator> implements java.util.Comparator<long[]> {
        private static final /* synthetic */ com.google.common.primitives.UnsignedLongs.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.UnsignedLongs.LexicographicalComparator INSTANCE = null;

        static {
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator r0 = new com.google.common.primitives.UnsignedLongs$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.UnsignedLongs.LexicographicalComparator.INSTANCE = r0
                r1 = 1
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator[] r1 = new com.google.common.primitives.UnsignedLongs.LexicographicalComparator[r1]
                r1[r2] = r0
                com.google.common.primitives.UnsignedLongs.LexicographicalComparator.$VALUES = r1
                return
        }

        LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.UnsignedLongs.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.UnsignedLongs$LexicographicalComparator> r0 = com.google.common.primitives.UnsignedLongs.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator r1 = (com.google.common.primitives.UnsignedLongs.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.UnsignedLongs.LexicographicalComparator[] values() {
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator[] r0 = com.google.common.primitives.UnsignedLongs.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.UnsignedLongs$LexicographicalComparator[] r0 = (com.google.common.primitives.UnsignedLongs.LexicographicalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(long[] r1, long[] r2) {
                r0 = this;
                long[] r1 = (long[]) r1
                long[] r2 = (long[]) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(long[] r8, long[] r9) {
                r7 = this;
                int r0 = r8.length
                int r1 = r9.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L19
                r2 = r8[r1]
                r4 = r9[r1]
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L16
                int r8 = com.google.common.primitives.UnsignedLongs.compare(r2, r4)
                return r8
            L16:
                int r1 = r1 + 1
                goto L7
            L19:
                int r8 = r8.length
                int r9 = r9.length
                int r8 = r8 - r9
                return r8
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "UnsignedLongs.lexicographicalComparator()"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ParseOverflowDetection {
        static final int[] maxSafeDigits = null;
        static final long[] maxValueDivs = null;
        static final int[] maxValueMods = null;

        static {
                r0 = 37
                long[] r1 = new long[r0]
                com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueDivs = r1
                int[] r1 = new int[r0]
                com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueMods = r1
                int[] r0 = new int[r0]
                com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits = r0
                java.math.BigInteger r0 = new java.math.BigInteger
                java.lang.String r1 = "10000000000000000"
                r2 = 16
                r0.<init>(r1, r2)
                r1 = 2
            L18:
                r2 = 36
                if (r1 > r2) goto L41
                long[] r2 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueDivs
                long r3 = (long) r1
                r5 = -1
                long r7 = com.google.common.primitives.UnsignedLongs.divide(r5, r3)
                r2[r1] = r7
                int[] r2 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueMods
                long r3 = com.google.common.primitives.UnsignedLongs.remainder(r5, r3)
                int r4 = (int) r3
                r2[r1] = r4
                int[] r2 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits
                java.lang.String r3 = r0.toString(r1)
                int r3 = r3.length()
                int r3 = r3 + (-1)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L18
            L41:
                return
        }

        private ParseOverflowDetection() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean overflowInParse(long r5, int r7, int r8) {
                r0 = 0
                r2 = 1
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 < 0) goto L1e
                long[] r0 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueDivs
                r3 = r0[r8]
                r0 = 0
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 >= 0) goto L11
                return r0
            L11:
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 <= 0) goto L16
                return r2
            L16:
                int[] r5 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxValueMods
                r5 = r5[r8]
                if (r7 <= r5) goto L1d
                return r2
            L1d:
                return r0
            L1e:
                return r2
        }
    }

    private UnsignedLongs() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(long r0, long r2) {
            long r0 = flip(r0)
            long r2 = flip(r2)
            int r0 = com.google.common.primitives.Longs.compare(r0, r2)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long decode(java.lang.String r4) {
            com.google.common.primitives.ParseRequest r0 = com.google.common.primitives.ParseRequest.fromString(r4)
            java.lang.String r1 = r0.rawValue     // Catch: java.lang.NumberFormatException -> Ld
            int r0 = r0.radix     // Catch: java.lang.NumberFormatException -> Ld
            long r0 = parseUnsignedLong(r1, r0)     // Catch: java.lang.NumberFormatException -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error parsing value: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            r1.initCause(r0)
            throw r1
    }

    public static long divide(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
            int r5 = compare(r5, r7)
            if (r5 >= 0) goto Ld
            return r0
        Ld:
            r5 = 1
            return r5
        L10:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L16
            long r5 = r5 / r7
            return r5
        L16:
            r0 = 1
            long r1 = r5 >>> r0
            long r1 = r1 / r7
            long r1 = r1 << r0
            long r3 = r1 * r7
            long r5 = r5 - r3
            int r5 = compare(r5, r7)
            if (r5 < 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            long r5 = (long) r0
            long r1 = r1 + r5
            return r1
    }

    private static long flip(long r2) {
            r0 = -9223372036854775808
            long r2 = r2 ^ r0
            return r2
    }

    public static java.lang.String join(java.lang.String r4, long... r5) {
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r5.length
            if (r0 != 0) goto L9
            java.lang.String r4 = ""
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 5
            r0.<init>(r1)
            r1 = 0
            r1 = r5[r1]
            java.lang.String r1 = toString(r1)
            r0.append(r1)
            r1 = 1
        L1c:
            int r2 = r5.length
            if (r1 >= r2) goto L2e
            r0.append(r4)
            r2 = r5[r1]
            java.lang.String r2 = toString(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L1c
        L2e:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.util.Comparator<long[]> lexicographicalComparator() {
            com.google.common.primitives.UnsignedLongs$LexicographicalComparator r0 = com.google.common.primitives.UnsignedLongs.LexicographicalComparator.INSTANCE
            return r0
    }

    public static long max(long... r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r6[r1]
            long r0 = flip(r0)
        L11:
            int r3 = r6.length
            if (r2 >= r3) goto L22
            r3 = r6[r2]
            long r3 = flip(r3)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1f
            r0 = r3
        L1f:
            int r2 = r2 + 1
            goto L11
        L22:
            long r0 = flip(r0)
            return r0
    }

    public static long min(long... r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r6[r1]
            long r0 = flip(r0)
        L11:
            int r3 = r6.length
            if (r2 >= r3) goto L22
            r3 = r6[r2]
            long r3 = flip(r3)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1f
            r0 = r3
        L1f:
            int r2 = r2 + 1
            goto L11
        L22:
            long r0 = flip(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long parseUnsignedLong(java.lang.String r2) {
            r0 = 10
            long r0 = parseUnsignedLong(r2, r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long parseUnsignedLong(java.lang.String r7, int r8) {
            com.google.common.base.Preconditions.checkNotNull(r7)
            int r0 = r7.length()
            if (r0 == 0) goto L70
            r0 = 2
            if (r8 < r0) goto L59
            r0 = 36
            if (r8 > r0) goto L59
            int[] r0 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.maxSafeDigits
            r0 = r0[r8]
            int r0 = r0 + (-1)
            r1 = 0
            r3 = 0
        L19:
            int r4 = r7.length()
            if (r3 >= r4) goto L58
            char r4 = r7.charAt(r3)
            int r4 = java.lang.Character.digit(r4, r8)
            r5 = -1
            if (r4 == r5) goto L52
            if (r3 <= r0) goto L4a
            boolean r5 = com.google.common.primitives.UnsignedLongs.ParseOverflowDetection.overflowInParse(r1, r4, r8)
            if (r5 != 0) goto L33
            goto L4a
        L33:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too large for unsigned long: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L4a:
            long r5 = (long) r8
            long r1 = r1 * r5
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L19
        L52:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            r8.<init>(r7)
            throw r8
        L58:
            return r1
        L59:
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "illegal radix: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L70:
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.String r8 = "empty string"
            r7.<init>(r8)
            throw r7
    }

    public static long remainder(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lf
            int r0 = compare(r5, r7)
            if (r0 >= 0) goto Ld
            return r5
        Ld:
            long r5 = r5 - r7
            return r5
        Lf:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L15
            long r5 = r5 % r7
            return r5
        L15:
            r2 = 1
            long r3 = r5 >>> r2
            long r3 = r3 / r7
            long r2 = r3 << r2
            long r2 = r2 * r7
            long r5 = r5 - r2
            int r2 = compare(r5, r7)
            if (r2 < 0) goto L25
            goto L26
        L25:
            r7 = r0
        L26:
            long r5 = r5 - r7
            return r5
    }

    public static void sort(long[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            r0 = 0
            int r1 = r2.length
            sort(r2, r0, r1)
            return
    }

    public static void sort(long[] r3, int r4, int r5) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r3.length
            com.google.common.base.Preconditions.checkPositionIndexes(r4, r5, r0)
            r0 = r4
        L8:
            if (r0 >= r5) goto L15
            r1 = r3[r0]
            long r1 = flip(r1)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L8
        L15:
            java.util.Arrays.sort(r3, r4, r5)
        L18:
            if (r4 >= r5) goto L25
            r0 = r3[r4]
            long r0 = flip(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L18
        L25:
            return
    }

    public static void sortDescending(long[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            r0 = 0
            int r1 = r2.length
            sortDescending(r2, r0, r1)
            return
    }

    public static void sortDescending(long[] r5, int r6, int r7) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r5.length
            com.google.common.base.Preconditions.checkPositionIndexes(r6, r7, r0)
            r0 = r6
        L8:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 >= r7) goto L17
            r3 = r5[r0]
            long r1 = r1 ^ r3
            r5[r0] = r1
            int r0 = r0 + 1
            goto L8
        L17:
            java.util.Arrays.sort(r5, r6, r7)
        L1a:
            if (r6 >= r7) goto L24
            r3 = r5[r6]
            long r3 = r3 ^ r1
            r5[r6] = r3
            int r6 = r6 + 1
            goto L1a
        L24:
            return
    }

    public static java.lang.String toString(long r1) {
            r0 = 10
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(long r9, int r11) {
            r0 = 2
            r1 = 1
            if (r11 < r0) goto La
            r0 = 36
            if (r11 > r0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r2 = "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r11)
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto L19
            java.lang.String r9 = "0"
            return r9
        L19:
            if (r0 <= 0) goto L20
            java.lang.String r9 = java.lang.Long.toString(r9, r11)
            return r9
        L20:
            r0 = 64
            char[] r4 = new char[r0]
            int r5 = r11 + (-1)
            r6 = r11 & r5
            if (r6 != 0) goto L3e
            int r6 = java.lang.Integer.numberOfTrailingZeros(r11)
        L2e:
            int r0 = r0 + (-1)
            int r1 = (int) r9
            r1 = r1 & r5
            char r1 = java.lang.Character.forDigit(r1, r11)
            r4[r0] = r1
            long r9 = r9 >>> r6
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 != 0) goto L2e
            goto L6d
        L3e:
            r0 = r11 & 1
            if (r0 != 0) goto L49
            long r0 = r9 >>> r1
            int r5 = r11 >>> 1
            long r5 = (long) r5
            long r0 = r0 / r5
            goto L4e
        L49:
            long r0 = (long) r11
            long r0 = divide(r9, r0)
        L4e:
            long r5 = (long) r11
            long r7 = r0 * r5
            long r9 = r9 - r7
            int r10 = (int) r9
            char r9 = java.lang.Character.forDigit(r10, r11)
            r10 = 63
            r4[r10] = r9
        L5b:
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L6c
            int r10 = r10 + (-1)
            long r7 = r0 % r5
            int r9 = (int) r7
            char r9 = java.lang.Character.forDigit(r9, r11)
            r4[r10] = r9
            long r0 = r0 / r5
            goto L5b
        L6c:
            r0 = r10
        L6d:
            java.lang.String r9 = new java.lang.String
            int r10 = 64 - r0
            r9.<init>(r4, r0, r10)
            return r9
    }
}
