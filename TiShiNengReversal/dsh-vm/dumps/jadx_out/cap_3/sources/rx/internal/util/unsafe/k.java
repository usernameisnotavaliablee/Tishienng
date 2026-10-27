package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class k<E> extends rx.internal.util.unsafe.m<E> {
    private static final long p0 = 0;
    private volatile long consumerIndex;

    static {
            java.lang.Class<rx.internal.util.unsafe.k> r0 = rx.internal.util.unsafe.k.class
            java.lang.String r1 = "consumerIndex"
            long r0 = rx.internal.util.unsafe.n0.a(r0, r1)
            rx.internal.util.unsafe.k.p0 = r0
            return
    }

    public k(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected final boolean v(long r9, long r11) {
            r8 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.k.p0
            r1 = r8
            r4 = r9
            r6 = r11
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            return r9
    }

    protected final long w() {
            r2 = this;
            long r0 = r2.consumerIndex
            return r0
    }
}
