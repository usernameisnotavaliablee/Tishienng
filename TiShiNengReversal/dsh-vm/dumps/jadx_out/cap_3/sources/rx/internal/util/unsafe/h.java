package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class h<E> extends rx.internal.util.unsafe.f<E> {
    private static final long x = 0;
    private static final int y = 0;
    protected final long[] w;

    static {
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            java.lang.Class<long[]> r1 = long[].class
            int r2 = r0.arrayIndexScale(r1)
            r3 = 8
            if (r3 != r2) goto L1f
            int r2 = rx.internal.util.unsafe.f.s
            int r3 = r2 + 3
            rx.internal.util.unsafe.h.y = r3
            int r0 = r0.arrayBaseOffset(r1)
            r1 = 32
            int r3 = r3 - r2
            int r1 = r1 << r3
            int r0 = r0 + r1
            long r0 = (long) r0
            rx.internal.util.unsafe.h.x = r0
            return
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unexpected long[] element size"
            r0.<init>(r1)
            throw r0
    }

    public h(int r11) {
            r10 = this;
            r10.<init>(r11)
            long r0 = r10.q
            r2 = 1
            long r0 = r0 + r2
            int r11 = (int) r0
            int r0 = rx.internal.util.unsafe.f.s
            int r0 = r11 << r0
            int r0 = r0 + 64
            long[] r0 = new long[r0]
            r10.w = r0
            r0 = 0
            r8 = r0
        L16:
            long r0 = (long) r11
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 >= 0) goto L27
            long[] r5 = r10.w
            long r6 = r10.q(r8)
            r4 = r10
            r4.s(r5, r6, r8)
            long r8 = r8 + r2
            goto L16
        L27:
            return
    }

    protected final long q(long r5) {
            r4 = this;
            long r0 = rx.internal.util.unsafe.h.x
            long r2 = r4.q
            long r5 = r5 & r2
            int r2 = rx.internal.util.unsafe.h.y
            long r5 = r5 << r2
            long r0 = r0 + r5
            return r0
    }

    protected final long r(long[] r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = r0.getLongVolatile(r2, r3)
            return r2
    }

    protected final void s(long[] r7, long r8, long r10) {
            r6 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            r1 = r7
            r2 = r8
            r4 = r10
            r0.putOrderedLong(r1, r2, r4)
            return
    }
}
