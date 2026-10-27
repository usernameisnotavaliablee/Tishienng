package rx.internal.util.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d<E> extends rx.internal.util.atomic.a<E> {
    private static final java.lang.Integer g = null;
    final java.util.concurrent.atomic.AtomicLong c;
    long d;
    final java.util.concurrent.atomic.AtomicLong e;
    final int f;

    static {
            java.lang.String r0 = "jctools.spsc.max.lookahead.step"
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            rx.internal.util.atomic.d.g = r0
            return
    }

    public d(int r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.c = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.e = r0
            int r2 = r2 / 4
            java.lang.Integer r0 = rx.internal.util.atomic.d.g
            int r0 = r0.intValue()
            int r2 = java.lang.Math.min(r2, r0)
            r1.f = r2
            return
    }

    private long r() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.e
            long r0 = r0.get()
            return r0
    }

    private long s() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.c
            long r0 = r0.get()
            return r0
    }

    private void t(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.e
            r0.lazySet(r2)
            return
    }

    private void u(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.c
            r0.lazySet(r2)
            return
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.s()
            long r2 = r5.r()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            java.util.Iterator r0 = super.iterator()
            return r0
    }

    @Override // java.util.Queue
    public boolean offer(E r9) {
            r8 = this;
            if (r9 == 0) goto L3a
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r8.a
            int r1 = r8.b
            java.util.concurrent.atomic.AtomicLong r2 = r8.c
            long r2 = r2.get()
            int r4 = r8.d(r2, r1)
            long r5 = r8.d
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L2f
            int r5 = r8.f
            long r5 = (long) r5
            long r5 = r5 + r2
            int r1 = r8.d(r5, r1)
            java.lang.Object r1 = r8.j(r0, r1)
            if (r1 != 0) goto L27
            r8.d = r5
            goto L2f
        L27:
            java.lang.Object r1 = r8.j(r0, r4)
            if (r1 == 0) goto L2f
            r9 = 0
            return r9
        L2f:
            r8.n(r0, r4, r9)
            r0 = 1
            long r2 = r2 + r0
            r8.u(r2)
            r9 = 1
            return r9
        L3a:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "Null is not a valid element"
            r9.<init>(r0)
            throw r9
    }

    @Override // java.util.Queue
    public E peek() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.e
            long r0 = r0.get()
            int r0 = r2.a(r0)
            java.lang.Object r0 = r2.g(r0)
            return r0
    }

    @Override // java.util.Queue
    public E poll() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r6.e
            long r0 = r0.get()
            int r2 = r6.a(r0)
            java.util.concurrent.atomic.AtomicReferenceArray<E> r3 = r6.a
            java.lang.Object r4 = r6.j(r3, r2)
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            r6.n(r3, r2, r5)
            r2 = 1
            long r0 = r0 + r2
            r6.t(r0)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r7 = this;
            long r0 = r7.r()
        L4:
            long r2 = r7.s()
            long r4 = r7.r()
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
