package io.netty.util.internal.shaded.org.jctools.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class RangeUtil {
    public RangeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkGreaterThanOrEqual(int r2, int r3, java.lang.String r4) {
            if (r2 < r3) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ": "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = " (expected: >= "
            r1.append(r2)
            r1.append(r3)
            r2 = 41
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static int checkLessThan(int r2, int r3, java.lang.String r4) {
            if (r2 >= r3) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ": "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = " (expected: < "
            r1.append(r2)
            r1.append(r3)
            r2 = 41
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static int checkLessThanOrEqual(int r3, long r4, java.lang.String r6) {
            long r0 = (long) r3
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L6
            return r3
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ": "
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = " (expected: <= "
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static long checkPositive(long r3, java.lang.String r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = " (expected: > 0)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int checkPositiveOrZero(int r2, java.lang.String r3) {
            if (r2 < 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " (expected: >= 0)"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }
}
