package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class n<E> extends rx.internal.util.unsafe.l<E> {
    private static final long O = 0;
    private volatile long producerIndex;

    static {
            java.lang.Class<rx.internal.util.unsafe.n> r0 = rx.internal.util.unsafe.n.class
            java.lang.String r1 = "producerIndex"
            long r0 = rx.internal.util.unsafe.n0.a(r0, r1)
            rx.internal.util.unsafe.n.O = r0
            return
    }

    public n(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected final boolean t(long r9, long r11) {
            r8 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.n.O
            r1 = r8
            r4 = r9
            r6 = r11
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            return r9
    }

    protected final long u() {
            r2 = this;
            long r0 = r2.producerIndex
            return r0
    }
}
