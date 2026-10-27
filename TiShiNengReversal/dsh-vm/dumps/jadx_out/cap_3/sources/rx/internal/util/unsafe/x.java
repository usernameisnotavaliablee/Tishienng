package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class x<E> extends rx.internal.util.unsafe.t<E> {
    protected static final long L = 0;
    private volatile long producerIndex;

    static {
            java.lang.Class<rx.internal.util.unsafe.x> r0 = rx.internal.util.unsafe.x.class
            java.lang.String r1 = "producerIndex"
            long r0 = rx.internal.util.unsafe.n0.a(r0, r1)
            rx.internal.util.unsafe.x.L = r0
            return
    }

    public x(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected final long q() {
            r2 = this;
            long r0 = r2.producerIndex
            return r0
    }

    protected final void r(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.x.L
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }
}
