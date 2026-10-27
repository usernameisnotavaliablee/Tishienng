package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class f<E> extends rx.internal.util.unsafe.g<E> {
    protected static final int s = 0;
    protected static final int t = 32;
    private static final long u = 0;
    private static final int v = 0;
    protected final long q;
    protected final E[] r;

    static {
            java.lang.String r0 = "sparse.shift"
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            rx.internal.util.unsafe.f.s = r0
            sun.misc.Unsafe r1 = rx.internal.util.unsafe.n0.a
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            int r3 = r1.arrayIndexScale(r2)
            r4 = 4
            if (r4 != r3) goto L1d
            int r3 = r0 + 2
            rx.internal.util.unsafe.f.v = r3
            goto L25
        L1d:
            r4 = 8
            if (r4 != r3) goto L34
            int r3 = r0 + 3
            rx.internal.util.unsafe.f.v = r3
        L25:
            int r1 = r1.arrayBaseOffset(r2)
            int r2 = rx.internal.util.unsafe.f.v
            int r2 = r2 - r0
            r0 = 32
            int r0 = r0 << r2
            int r1 = r1 + r0
            long r0 = (long) r1
            rx.internal.util.unsafe.f.u = r0
            return
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown pointer size"
            r0.<init>(r1)
            throw r0
    }

    public f(int r3) {
            r2 = this;
            r2.<init>()
            int r3 = rx.internal.util.unsafe.p.b(r3)
            int r0 = r3 + (-1)
            long r0 = (long) r0
            r2.q = r0
            int r0 = rx.internal.util.unsafe.f.s
            int r3 = r3 << r0
            int r3 = r3 + 64
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.r = r3
            return
    }

    protected final long a(long r3) {
            r2 = this;
            long r0 = r2.q
            long r3 = r2.d(r3, r0)
            return r3
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.poll()
            if (r0 != 0) goto L0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld
            goto L0
        Ld:
            return
    }

    protected final long d(long r3, long r5) {
            r2 = this;
            long r0 = rx.internal.util.unsafe.f.u
            long r3 = r3 & r5
            int r5 = rx.internal.util.unsafe.f.v
            long r3 = r3 << r5
            long r0 = r0 + r3
            return r0
    }

    protected final E e(long r2) {
            r1 = this;
            E[] r0 = r1.r
            java.lang.Object r2 = r1.f(r0, r2)
            return r2
    }

    protected final E f(E[] r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            java.lang.Object r2 = r0.getObject(r2, r3)
            return r2
    }

    protected final E g(long r2) {
            r1 = this;
            E[] r0 = r1.r
            java.lang.Object r2 = r1.j(r0, r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    protected final E j(E[] r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            java.lang.Object r2 = r0.getObjectVolatile(r2, r3)
            return r2
    }

    protected final void m(long r2, E r4) {
            r1 = this;
            E[] r0 = r1.r
            r1.n(r0, r2, r4)
            return
    }

    protected final void n(E[] r2, long r3, E r5) {
            r1 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            r0.putOrderedObject(r2, r3, r5)
            return
    }

    protected final void o(long r2, E r4) {
            r1 = this;
            E[] r0 = r1.r
            r1.p(r0, r2, r4)
            return
    }

    protected final void p(E[] r2, long r3, E r5) {
            r1 = this;
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            r0.putObject(r2, r3, r5)
            return
    }
}
