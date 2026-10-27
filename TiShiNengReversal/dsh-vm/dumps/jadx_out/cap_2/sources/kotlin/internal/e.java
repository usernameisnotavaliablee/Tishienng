package kotlin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    private static final int a(int r1, int r2, int r3) {
            int r1 = kotlin.r0.a(r1, r3)
            int r2 = kotlin.r0.a(r2, r3)
            int r0 = kotlin.u0.a(r1, r2)
            int r1 = r1 - r2
            int r1 = kotlin.z0.k(r1)
            if (r0 < 0) goto L14
            return r1
        L14:
            int r1 = r1 + r3
            int r1 = kotlin.z0.k(r1)
            return r1
    }

    private static final long b(long r1, long r3, long r5) {
            long r1 = kotlin.s0.a(r1, r5)
            long r3 = kotlin.s0.a(r3, r5)
            int r0 = androidx.collection.a.a(r1, r3)
            long r1 = r1 - r3
            long r1 = kotlin.d1.k(r1)
            if (r0 < 0) goto L14
            return r1
        L14:
            long r1 = r1 + r5
            long r1 = kotlin.d1.k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    public static final long c(long r8, long r10, long r12) {
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L20
            int r0 = androidx.collection.a.a(r8, r10)
            if (r0 < 0) goto Le
            r8 = r10
            goto L2b
        Le:
            long r12 = kotlin.d1.k(r12)
            r6 = r10
            r10 = r8
            r8 = r6
            long r10 = b(r8, r10, r12)
            long r10 = r8 - r10
            long r8 = kotlin.d1.k(r10)
            return r8
        L20:
            r6 = r10
            r10 = r8
            r8 = r6
            if (r2 >= 0) goto L3e
            int r0 = androidx.collection.a.a(r10, r8)
            if (r0 > 0) goto L2c
        L2b:
            return r8
        L2c:
            long r12 = -r12
            long r4 = kotlin.d1.k(r12)
            r2 = r8
            r0 = r10
            long r8 = b(r0, r2, r4)
            long r10 = r2 + r8
            long r8 = kotlin.d1.k(r10)
            return r8
        L3e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Step is zero."
            r8.<init>(r9)
            throw r8
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    public static final int d(int r1, int r2, int r3) {
            if (r3 <= 0) goto L17
            int r0 = kotlin.u0.a(r1, r2)
            if (r0 < 0) goto L9
            goto L1f
        L9:
            int r3 = kotlin.z0.k(r3)
            int r1 = a(r2, r1, r3)
            int r2 = r2 - r1
            int r1 = kotlin.z0.k(r2)
            return r1
        L17:
            if (r3 >= 0) goto L2f
            int r0 = kotlin.u0.a(r1, r2)
            if (r0 > 0) goto L20
        L1f:
            return r2
        L20:
            int r3 = -r3
            int r3 = kotlin.z0.k(r3)
            int r1 = a(r1, r2, r3)
            int r2 = r2 + r1
            int r1 = kotlin.z0.k(r2)
            return r1
        L2f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Step is zero."
            r1.<init>(r2)
            throw r1
    }
}
