package rx.internal.util.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class a<E> extends java.util.AbstractQueue<E> {
    protected final java.util.concurrent.atomic.AtomicReferenceArray<E> a;
    protected final int b;

    public a(int r2) {
            r1 = this;
            r1.<init>()
            int r2 = rx.internal.util.unsafe.p.b(r2)
            int r0 = r2 + (-1)
            r1.b = r0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.a = r0
            return
    }

    protected final int a(long r1) {
            r0 = this;
            int r2 = (int) r1
            int r1 = r0.b
            r1 = r1 & r2
            return r1
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

    protected final int d(long r1, int r3) {
            r0 = this;
            int r2 = (int) r1
            r1 = r2 & r3
            return r1
    }

    protected final E e(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    protected final E f(java.util.concurrent.atomic.AtomicReferenceArray<E> r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    protected final E g(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.a
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

    protected final E j(java.util.concurrent.atomic.AtomicReferenceArray<E> r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    protected final void m(int r2, E r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.a
            r0.lazySet(r2, r3)
            return
    }

    protected final void n(java.util.concurrent.atomic.AtomicReferenceArray<E> r1, int r2, E r3) {
            r0 = this;
            r1.lazySet(r2, r3)
            return
    }

    protected final void o(int r2, E r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r1.a
            r0.lazySet(r2, r3)
            return
    }

    protected final void p(java.util.concurrent.atomic.AtomicReferenceArray<E> r1, int r2, E r3) {
            r0 = this;
            r1.lazySet(r2, r3)
            return
    }

    protected final void q(java.util.concurrent.atomic.AtomicReferenceArray<E> r1, int r2, E r3) {
            r0 = this;
            r1.set(r2, r3)
            return
    }
}
