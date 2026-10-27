package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class SmallCharMatcher extends com.google.common.base.CharMatcher.NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] r1, long r2, boolean r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r5)
            r0.table = r1
            r0.filter = r2
            r0.containsZero = r4
            return
    }

    private boolean checkFilter(int r5) {
            r4 = this;
            long r0 = r4.filter
            long r0 = r0 >> r5
            r2 = 1
            long r0 = r0 & r2
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto Lc
            r5 = 1
            return r5
        Lc:
            r5 = 0
            return r5
    }

    @com.google.common.annotations.VisibleForTesting
    static int chooseTableSize(int r6) {
            r0 = 1
            if (r6 != r0) goto L5
            r6 = 2
            return r6
        L5:
            int r1 = r6 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            int r0 = r1 << 1
        Ld:
            double r1 = (double) r0
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r1 = r1 * r3
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1a
            int r0 = r0 << 1
            goto Ld
        L1a:
            return r0
    }

    static com.google.common.base.CharMatcher from(java.util.BitSet r9, java.lang.String r10) {
            int r0 = r9.cardinality()
            r1 = 0
            boolean r6 = r9.get(r1)
            int r0 = chooseTableSize(r0)
            char[] r3 = new char[r0]
            int r0 = r0 + (-1)
            int r1 = r9.nextSetBit(r1)
            r4 = 0
        L17:
            r2 = -1
            if (r1 == r2) goto L35
            r7 = 1
            long r7 = r7 << r1
            long r7 = r7 | r4
            int r2 = smear(r1)
        L22:
            r2 = r2 & r0
            char r4 = r3[r2]
            if (r4 != 0) goto L32
            char r4 = (char) r1
            r3[r2] = r4
            int r1 = r1 + 1
            int r1 = r9.nextSetBit(r1)
            r4 = r7
            goto L17
        L32:
            int r2 = r2 + 1
            goto L22
        L35:
            com.google.common.base.SmallCharMatcher r2 = new com.google.common.base.SmallCharMatcher
            r7 = r10
            r2.<init>(r3, r4, r6, r7)
            return r2
    }

    static int smear(int r1) {
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            r0 = 15
            int r1 = java.lang.Integer.rotateLeft(r1, r0)
            r0 = 461845907(0x1b873593, float:2.2368498E-22)
            int r1 = r1 * r0
            return r1
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char r7) {
            r6 = this;
            if (r7 != 0) goto L5
            boolean r7 = r6.containsZero
            return r7
        L5:
            boolean r0 = r6.checkFilter(r7)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            char[] r0 = r6.table
            int r0 = r0.length
            r2 = 1
            int r0 = r0 - r2
            int r3 = smear(r7)
            r3 = r3 & r0
            r4 = r3
        L18:
            char[] r5 = r6.table
            char r5 = r5[r4]
            if (r5 != 0) goto L1f
            return r1
        L1f:
            if (r5 != r7) goto L22
            return r2
        L22:
            int r4 = r4 + 1
            r4 = r4 & r0
            if (r4 != r3) goto L18
            return r1
    }

    @Override // com.google.common.base.CharMatcher
    void setBits(java.util.BitSet r5) {
            r4 = this;
            boolean r0 = r4.containsZero
            r1 = 0
            if (r0 == 0) goto L8
            r5.set(r1)
        L8:
            char[] r0 = r4.table
            int r2 = r0.length
        Lb:
            if (r1 >= r2) goto L17
            char r3 = r0[r1]
            if (r3 == 0) goto L14
            r5.set(r3)
        L14:
            int r1 = r1 + 1
            goto Lb
        L17:
            return
    }
}
