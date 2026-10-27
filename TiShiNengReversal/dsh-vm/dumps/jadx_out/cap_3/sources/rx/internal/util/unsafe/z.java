package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class z<E> extends rx.internal.util.unsafe.e0<E> {
    public z(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private long q() {
            r3 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r1 = rx.internal.util.unsafe.b0.p0
            long r0 = r0.getLongVolatile(r3, r1)
            return r0
    }

    private long r() {
            r3 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r1 = rx.internal.util.unsafe.f0.O
            long r0 = r0.getLongVolatile(r3, r1)
            return r0
    }

    private void s(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.b0.p0
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }

    private void t(long r7) {
            r6 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.f0.O
            r1 = r6
            r4 = r7
            r0.putOrderedLong(r1, r2, r4)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.r()
            long r2 = r5.q()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public boolean offer(E r7) {
            r6 = this;
            if (r7 == 0) goto L1d
            E[] r0 = r6.r
            long r1 = r6.producerIndex
            long r3 = r6.a(r1)
            java.lang.Object r5 = r6.j(r0, r3)
            if (r5 == 0) goto L12
            r7 = 0
            return r7
        L12:
            r6.n(r0, r3, r7)
            r3 = 1
            long r1 = r1 + r3
            r6.t(r1)
            r7 = 1
            return r7
        L1d:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null elements not allowed"
            r7.<init>(r0)
            throw r7
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E peek() {
            r2 = this;
            long r0 = r2.consumerIndex
            long r0 = r2.a(r0)
            java.lang.Object r0 = r2.g(r0)
            return r0
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E poll() {
            r7 = this;
            long r0 = r7.consumerIndex
            long r2 = r7.a(r0)
            E[] r4 = r7.r
            java.lang.Object r5 = r7.j(r4, r2)
            r6 = 0
            if (r5 != 0) goto L10
            return r6
        L10:
            r7.n(r4, r2, r6)
            r2 = 1
            long r0 = r0 + r2
            r7.s(r0)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public int size() {
            r7 = this;
            long r0 = r7.q()
        L4:
            long r2 = r7.r()
            long r4 = r7.q()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            long r2 = r2 - r4
            int r0 = (int) r2
            return r0
        L13:
            r0 = r4
            goto L4
    }
}
