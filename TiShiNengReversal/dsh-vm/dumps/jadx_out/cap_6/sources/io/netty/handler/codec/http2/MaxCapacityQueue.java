package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class MaxCapacityQueue<E> implements java.util.Queue<E> {
    private final int maxCapacity;
    private final java.util.Queue<E> queue;

    MaxCapacityQueue(java.util.Queue<E> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.queue = r1
            r0.maxCapacity = r2
            return
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(E r1) {
            r0 = this;
            boolean r1 = r0.offer(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r4) {
            r3 = this;
            int r0 = r3.maxCapacity
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            if (r0 < r1) goto L14
            java.util.Queue<E> r0 = r3.queue
            boolean r4 = r0.addAll(r4)
            return r4
        L14:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
    }

    @Override // java.util.Collection
    public void clear() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            r0.clear()
            return
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.Queue
    public E element() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            java.lang.Object r0 = r0.element()
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Queue
    public boolean offer(E r3) {
            r2 = this;
            int r0 = r2.maxCapacity
            java.util.Queue<E> r1 = r2.queue
            int r1 = r1.size()
            if (r0 > r1) goto Lc
            r3 = 0
            return r3
        Lc:
            java.util.Queue<E> r0 = r2.queue
            boolean r3 = r0.offer(r3)
            return r3
    }

    @Override // java.util.Queue
    public E peek() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            java.lang.Object r0 = r0.peek()
            return r0
    }

    @Override // java.util.Queue
    public E poll() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            java.lang.Object r0 = r0.poll()
            return r0
    }

    @Override // java.util.Queue
    public E remove() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            java.lang.Object r0 = r0.remove()
            return r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @Override // java.util.Collection
    public int size() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.Queue<E> r0 = r1.queue
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
