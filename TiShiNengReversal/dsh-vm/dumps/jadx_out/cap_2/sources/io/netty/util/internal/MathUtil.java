package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MathUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
            return
    }

    private MathUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static int compare(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            return r1
        L6:
            if (r0 <= 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static int findNextPositivePowerOfTwo(int r1) {
            r0 = 1
            int r1 = r1 - r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 32 - r1
            int r1 = r0 << r1
            return r1
    }

    public static boolean isOutOfBounds(int r1, int r2, int r3) {
            r0 = r1 | r2
            int r1 = r1 + r2
            r2 = r0 | r1
            int r3 = r3 - r1
            r1 = r2 | r3
            if (r1 >= 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static int safeFindNextPositivePowerOfTwo(int r1) {
            if (r1 > 0) goto L4
            r1 = 1
            return r1
        L4:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 < r0) goto L9
            return r0
        L9:
            int r1 = findNextPositivePowerOfTwo(r1)
            return r1
    }
}
