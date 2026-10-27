package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class EmptyPriorityQueue<T> implements io.netty.util.internal.PriorityQueue<T> {
    private static final io.netty.util.internal.PriorityQueue<java.lang.Object> INSTANCE = null;

    static {
            io.netty.util.internal.EmptyPriorityQueue r0 = new io.netty.util.internal.EmptyPriorityQueue
            r0.<init>()
            io.netty.util.internal.EmptyPriorityQueue.INSTANCE = r0
            return
    }

    private EmptyPriorityQueue() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> io.netty.util.internal.EmptyPriorityQueue<V> instance() {
            io.netty.util.internal.PriorityQueue<java.lang.Object> r0 = io.netty.util.internal.EmptyPriorityQueue.INSTANCE
            io.netty.util.internal.EmptyPriorityQueue r0 = (io.netty.util.internal.EmptyPriorityQueue) r0
            return r0
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Collection
    public void clear() {
            r0 = this;
            return
    }

    @Override // io.netty.util.internal.PriorityQueue
    public void clearIgnoringIndexes() {
            r0 = this;
            return
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<?> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.util.internal.PriorityQueue
    public boolean containsTyped(T r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Queue
    public T element() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.internal.PriorityQueue
            if (r0 == 0) goto Le
            io.netty.util.internal.PriorityQueue r2 = (io.netty.util.internal.PriorityQueue) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Queue
    public boolean offer(T r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Queue
    public T peek() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Queue
    public T poll() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.util.internal.PriorityQueue
    public void priorityChanged(T r1) {
            r0 = this;
            return
    }

    @Override // java.util.Queue
    public T remove() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.util.internal.PriorityQueue
    public boolean removeTyped(T r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Collection
    public int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_OBJECTS
            return r0
    }

    @Override // java.util.Collection
    public <T1> T1[] toArray(T1[] r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto L7
            r0 = 0
            r1 = 0
            r3[r0] = r1
        L7:
            return r3
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class<io.netty.util.internal.EmptyPriorityQueue> r0 = io.netty.util.internal.EmptyPriorityQueue.class
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
