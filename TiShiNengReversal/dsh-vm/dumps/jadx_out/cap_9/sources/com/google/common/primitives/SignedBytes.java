package com.google.common.primitives;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum LexicographicalComparator extends java.lang.Enum<com.google.common.primitives.SignedBytes.LexicographicalComparator> implements java.util.Comparator<byte[]> {
        private static final /* synthetic */ com.google.common.primitives.SignedBytes.LexicographicalComparator[] $VALUES = null;
        public static final com.google.common.primitives.SignedBytes.LexicographicalComparator INSTANCE = null;

        static {
                com.google.common.primitives.SignedBytes$LexicographicalComparator r0 = new com.google.common.primitives.SignedBytes$LexicographicalComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.primitives.SignedBytes.LexicographicalComparator.INSTANCE = r0
                r1 = 1
                com.google.common.primitives.SignedBytes$LexicographicalComparator[] r1 = new com.google.common.primitives.SignedBytes.LexicographicalComparator[r1]
                r1[r2] = r0
                com.google.common.primitives.SignedBytes.LexicographicalComparator.$VALUES = r1
                return
        }

        LexicographicalComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.primitives.SignedBytes.LexicographicalComparator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.primitives.SignedBytes$LexicographicalComparator> r0 = com.google.common.primitives.SignedBytes.LexicographicalComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.primitives.SignedBytes$LexicographicalComparator r1 = (com.google.common.primitives.SignedBytes.LexicographicalComparator) r1
                return r1
        }

        public static com.google.common.primitives.SignedBytes.LexicographicalComparator[] values() {
                com.google.common.primitives.SignedBytes$LexicographicalComparator[] r0 = com.google.common.primitives.SignedBytes.LexicographicalComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.primitives.SignedBytes$LexicographicalComparator[] r0 = (com.google.common.primitives.SignedBytes.LexicographicalComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(byte[] r1, byte[] r2) {
                r0 = this;
                byte[] r1 = (byte[]) r1
                byte[] r2 = (byte[]) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(byte[] r5, byte[] r6) {
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                r2 = r5[r1]
                r3 = r6[r1]
                int r2 = com.google.common.primitives.SignedBytes.compare(r2, r3)
                if (r2 == 0) goto L14
                return r2
            L14:
                int r1 = r1 + 1
                goto L7
            L17:
                int r5 = r5.length
                int r6 = r6.length
                int r5 = r5 - r6
                return r5
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "SignedBytes.lexicographicalComparator()"
                return r0
        }
    }

    private SignedBytes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte checkedCast(long r4) {
            int r0 = (int) r4
            byte r0 = (byte) r0
            long r1 = (long) r0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "Out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r4)
            return r0
    }

    public static int compare(byte r0, byte r1) {
            int r0 = r0 - r1
            return r0
    }

    public static java.lang.String join(java.lang.String r3, byte... r4) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r4.length
            if (r0 != 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 5
            r0.<init>(r1)
            r1 = 0
            r1 = r4[r1]
            r0.append(r1)
            r1 = 1
        L18:
            int r2 = r4.length
            if (r1 >= r2) goto L26
            r0.append(r3)
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L26:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.util.Comparator<byte[]> lexicographicalComparator() {
            com.google.common.primitives.SignedBytes$LexicographicalComparator r0 = com.google.common.primitives.SignedBytes.LexicographicalComparator.INSTANCE
            return r0
    }

    public static byte max(byte... r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r3[r1]
        Ld:
            int r1 = r3.length
            if (r2 >= r1) goto L18
            r1 = r3[r2]
            if (r1 <= r0) goto L15
            r0 = r1
        L15:
            int r2 = r2 + 1
            goto Ld
        L18:
            return r0
    }

    public static byte min(byte... r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r3[r1]
        Ld:
            int r1 = r3.length
            if (r2 >= r1) goto L18
            r1 = r3[r2]
            if (r1 >= r0) goto L15
            r0 = r1
        L15:
            int r2 = r2 + 1
            goto Ld
        L18:
            return r0
    }

    public static byte saturatedCast(long r3) {
            r0 = 127(0x7f, double:6.27E-322)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            r3 = 127(0x7f, float:1.78E-43)
            return r3
        L9:
            r0 = -128(0xffffffffffffff80, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L12
            r3 = -128(0xffffffffffffff80, float:NaN)
            return r3
        L12:
            int r4 = (int) r3
            byte r3 = (byte) r4
            return r3
    }

    public static void sortDescending(byte[] r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            r0 = 0
            int r1 = r2.length
            sortDescending(r2, r0, r1)
            return
    }

    public static void sortDescending(byte[] r1, int r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            int r0 = r1.length
            com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
            java.util.Arrays.sort(r1, r2, r3)
            com.google.common.primitives.Bytes.reverse(r1, r2, r3)
            return
    }
}
