package io.netty.util.internal.shaded.org.jctools.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Pow2 {
    public static final int MAX_POW2 = 1073741824;

    public Pow2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long align(long r2, int r4) {
            boolean r0 = isPowerOfTwo(r4)
            if (r0 == 0) goto Le
            int r4 = r4 + (-1)
            long r0 = (long) r4
            long r2 = r2 + r0
            int r4 = ~r4
            long r0 = (long) r4
            long r2 = r2 & r0
            return r2
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "alignment must be a power of 2:"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static boolean isPowerOfTwo(int r1) {
            int r0 = r1 + (-1)
            r1 = r1 & r0
            if (r1 != 0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    public static int roundToPowerOfTwo(int r3) {
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 > r0) goto L2d
            if (r3 < 0) goto L11
            r0 = 1
            int r3 = r3 - r0
            int r3 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r3 = 32 - r3
            int r3 = r0 << r3
            return r3
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Given value:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ". Expecting value >= 0."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "There is no larger power of 2 int for value:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " since it exceeds 2^31."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
