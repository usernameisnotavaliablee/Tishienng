package kotlin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {
    private static final int a(int r0, int r1, int r2) {
            int r0 = e(r0, r2)
            int r1 = e(r1, r2)
            int r0 = r0 - r1
            int r0 = e(r0, r2)
            return r0
    }

    private static final long b(long r0, long r2, long r4) {
            long r0 = f(r0, r4)
            long r2 = f(r2, r4)
            long r0 = r0 - r2
            long r0 = f(r0, r4)
            return r0
    }

    @kotlin.PublishedApi
    public static final int c(int r0, int r1, int r2) {
            if (r2 <= 0) goto Lb
            if (r0 < r1) goto L5
            goto Lf
        L5:
            int r0 = a(r1, r0, r2)
            int r1 = r1 - r0
            return r1
        Lb:
            if (r2 >= 0) goto L17
            if (r0 > r1) goto L10
        Lf:
            return r1
        L10:
            int r2 = -r2
            int r0 = a(r0, r1, r2)
            int r1 = r1 + r0
            return r1
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }

    @kotlin.PublishedApi
    public static final long d(long r5, long r7, long r9) {
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L16
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto Lc
            r5 = r7
            goto L1f
        Lc:
            r3 = r7
            r7 = r5
            r5 = r3
            long r7 = b(r5, r7, r9)
            long r7 = r5 - r7
            return r7
        L16:
            r3 = r7
            r7 = r5
            r5 = r3
            if (r2 >= 0) goto L2a
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L20
        L1f:
            return r5
        L20:
            long r9 = -r9
            r3 = r7
            r7 = r5
            r5 = r3
            long r5 = b(r5, r7, r9)
            long r7 = r7 + r5
            return r7
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Step is zero."
            r5.<init>(r6)
            throw r5
    }

    private static final int e(int r0, int r1) {
            int r0 = r0 % r1
            if (r0 < 0) goto L4
            return r0
        L4:
            int r0 = r0 + r1
            return r0
    }

    private static final long f(long r3, long r5) {
            long r3 = r3 % r5
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            return r3
        L8:
            long r3 = r3 + r5
            return r3
    }
}
