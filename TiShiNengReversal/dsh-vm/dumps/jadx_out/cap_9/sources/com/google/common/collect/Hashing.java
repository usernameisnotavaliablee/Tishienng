package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Hashing {
    private static final long C1 = -862048943;
    private static final long C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
            r0 = this;
            r0.<init>()
            return
    }

    static int closedTableSize(int r3, double r4) {
            r0 = 2
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Integer.highestOneBit(r3)
            double r1 = (double) r0
            double r4 = r4 * r1
            int r4 = (int) r4
            if (r3 <= r4) goto L17
            int r3 = r0 << 1
            if (r3 <= 0) goto L14
            return r3
        L14:
            r3 = 1073741824(0x40000000, float:2.0)
            return r3
        L17:
            return r0
    }

    static boolean needsResizing(int r4, int r5, double r6) {
            double r0 = (double) r4
            double r2 = (double) r5
            double r6 = r6 * r2
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto Le
            r4 = 1073741824(0x40000000, float:2.0)
            if (r5 >= r4) goto Le
            r4 = 1
            return r4
        Le:
            r4 = 0
            return r4
    }

    static int smear(int r4) {
            long r0 = (long) r4
            r2 = -862048943(0xffffffffcc9e2d51, double:NaN)
            long r0 = r0 * r2
            int r4 = (int) r0
            r0 = 15
            int r4 = java.lang.Integer.rotateLeft(r4, r0)
            long r0 = (long) r4
            r2 = 461845907(0x1b873593, double:2.281821963E-315)
            long r0 = r0 * r2
            int r4 = (int) r0
            return r4
    }

    static int smearedHash(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            int r0 = smear(r0)
            return r0
    }
}
