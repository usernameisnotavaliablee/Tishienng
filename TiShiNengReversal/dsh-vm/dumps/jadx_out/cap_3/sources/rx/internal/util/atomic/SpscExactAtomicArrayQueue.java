package rx.internal.util.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SpscExactAtomicArrayQueue<T> extends java.util.concurrent.atomic.AtomicReferenceArray<T> implements java.util.Queue<T> {
    private static final long serialVersionUID = 6210984603741293445L;
    final int capacitySkip;
    final java.util.concurrent.atomic.AtomicLong consumerIndex;
    final int mask;
    final java.util.concurrent.atomic.AtomicLong producerIndex;

    public SpscExactAtomicArrayQueue(int r3) {
            r2 = this;
            int r0 = rx.internal.util.unsafe.p.b(r3)
            r2.<init>(r0)
            int r0 = r2.length()
            int r1 = r0 + (-1)
            r2.mask = r1
            int r0 = r0 - r3
            r2.capacitySkip = r0
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>()
            r2.producerIndex = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>()
            r2.consumerIndex = r3
            return
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Queue
    public T element() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.producerIndex
            java.util.concurrent.atomic.AtomicLong r1 = r2.consumerIndex
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Queue
    public boolean offer(T r7) {
            r6 = this;
            r7.getClass()
            java.util.concurrent.atomic.AtomicLong r0 = r6.producerIndex
            long r0 = r0.get()
            int r2 = r6.mask
            int r3 = r6.capacitySkip
            long r3 = (long) r3
            long r3 = r3 + r0
            int r4 = (int) r3
            r3 = r4 & r2
            java.lang.Object r3 = r6.get(r3)
            if (r3 == 0) goto L1a
            r7 = 0
            return r7
        L1a:
            int r3 = (int) r0
            r2 = r2 & r3
            java.util.concurrent.atomic.AtomicLong r3 = r6.producerIndex
            r4 = 1
            long r0 = r0 + r4
            r3.lazySet(r0)
            r6.lazySet(r2, r7)
            r7 = 1
            return r7
    }

    @Override // java.util.Queue
    public T peek() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.consumerIndex
            long r0 = r0.get()
            int r1 = (int) r0
            int r0 = r2.mask
            r0 = r0 & r1
            java.lang.Object r0 = r2.get(r0)
            return r0
    }

    @Override // java.util.Queue
    public T poll() {
            r8 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r8.consumerIndex
            long r0 = r0.get()
            int r2 = (int) r0
            int r3 = r8.mask
            r2 = r2 & r3
            java.lang.Object r3 = r8.get(r2)
            r4 = 0
            if (r3 != 0) goto L12
            return r4
        L12:
            java.util.concurrent.atomic.AtomicLong r5 = r8.consumerIndex
            r6 = 1
            long r0 = r0 + r6
            r5.lazySet(r0)
            r8.lazySet(r2, r4)
            return r3
    }

    @Override // java.util.Queue
    public T remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public int size() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r7.consumerIndex
            long r0 = r0.get()
        L6:
            java.util.concurrent.atomic.AtomicLong r2 = r7.producerIndex
            long r2 = r2.get()
            java.util.concurrent.atomic.AtomicLong r4 = r7.consumerIndex
            long r4 = r4.get()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L19
            long r2 = r2 - r4
            int r0 = (int) r2
            return r0
        L19:
            r0 = r4
            goto L6
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
