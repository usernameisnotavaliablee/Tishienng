package io.netty.util.internal;

import io.netty.util.internal.PriorityQueueNode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DefaultPriorityQueue<T extends io.netty.util.internal.PriorityQueueNode> extends java.util.AbstractQueue<T> implements io.netty.util.internal.PriorityQueue<T> {
    private static final io.netty.util.internal.PriorityQueueNode[] EMPTY_ARRAY = null;
    private final java.util.Comparator<T> comparator;
    private T[] queue;
    private int size;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.util.internal.DefaultPriorityQueue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PriorityQueueIterator implements java.util.Iterator<T> {
        private int index;
        final /* synthetic */ io.netty.util.internal.DefaultPriorityQueue this$0;

        private PriorityQueueIterator(io.netty.util.internal.DefaultPriorityQueue r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ PriorityQueueIterator(io.netty.util.internal.DefaultPriorityQueue r1, io.netty.util.internal.DefaultPriorityQueue.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                io.netty.util.internal.DefaultPriorityQueue r1 = r2.this$0
                int r1 = io.netty.util.internal.DefaultPriorityQueue.access$100(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.index
                io.netty.util.internal.DefaultPriorityQueue r1 = r3.this$0
                int r1 = io.netty.util.internal.DefaultPriorityQueue.access$100(r1)
                if (r0 >= r1) goto L19
                io.netty.util.internal.DefaultPriorityQueue r0 = r3.this$0
                io.netty.util.internal.PriorityQueueNode[] r0 = io.netty.util.internal.DefaultPriorityQueue.access$200(r0)
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                r0 = r0[r1]
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                io.netty.util.internal.PriorityQueueNode r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "remove"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            r0 = 0
            io.netty.util.internal.PriorityQueueNode[] r0 = new io.netty.util.internal.PriorityQueueNode[r0]
            io.netty.util.internal.DefaultPriorityQueue.EMPTY_ARRAY = r0
            return
    }

    public DefaultPriorityQueue(java.util.Comparator<T> r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "comparator"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r1.comparator = r2
            if (r3 == 0) goto L12
            io.netty.util.internal.PriorityQueueNode[] r2 = new io.netty.util.internal.PriorityQueueNode[r3]
            goto L14
        L12:
            io.netty.util.internal.PriorityQueueNode[] r2 = io.netty.util.internal.DefaultPriorityQueue.EMPTY_ARRAY
        L14:
            io.netty.util.internal.PriorityQueueNode[] r2 = (io.netty.util.internal.PriorityQueueNode[]) r2
            r1.queue = r2
            return
    }

    static /* synthetic */ int access$100(io.netty.util.internal.DefaultPriorityQueue r0) {
            int r0 = r0.size
            return r0
    }

    static /* synthetic */ io.netty.util.internal.PriorityQueueNode[] access$200(io.netty.util.internal.DefaultPriorityQueue r0) {
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r0.queue
            return r0
    }

    private void bubbleDown(int r7, T r8) {
            r6 = this;
            int r0 = r6.size
            int r0 = r0 >>> 1
        L4:
            if (r7 >= r0) goto L36
            int r1 = r7 << 1
            int r2 = r1 + 1
            T extends io.netty.util.internal.PriorityQueueNode[] r3 = r6.queue
            r4 = r3[r2]
            int r1 = r1 + 2
            int r5 = r6.size
            if (r1 >= r5) goto L23
            java.util.Comparator<T extends io.netty.util.internal.PriorityQueueNode> r5 = r6.comparator
            r3 = r3[r1]
            int r3 = r5.compare(r4, r3)
            if (r3 <= 0) goto L23
            T extends io.netty.util.internal.PriorityQueueNode[] r2 = r6.queue
            r4 = r2[r1]
            goto L24
        L23:
            r1 = r2
        L24:
            java.util.Comparator<T extends io.netty.util.internal.PriorityQueueNode> r2 = r6.comparator
            int r2 = r2.compare(r8, r4)
            if (r2 > 0) goto L2d
            goto L36
        L2d:
            T extends io.netty.util.internal.PriorityQueueNode[] r2 = r6.queue
            r2[r7] = r4
            r4.priorityQueueIndex(r6, r7)
            r7 = r1
            goto L4
        L36:
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r6.queue
            r0[r7] = r8
            r8.priorityQueueIndex(r6, r7)
            return
    }

    private void bubbleUp(int r4, T r5) {
            r3 = this;
        L0:
            if (r4 <= 0) goto L1c
            int r0 = r4 + (-1)
            int r0 = r0 >>> 1
            T extends io.netty.util.internal.PriorityQueueNode[] r1 = r3.queue
            r1 = r1[r0]
            java.util.Comparator<T extends io.netty.util.internal.PriorityQueueNode> r2 = r3.comparator
            int r2 = r2.compare(r5, r1)
            if (r2 < 0) goto L13
            goto L1c
        L13:
            T extends io.netty.util.internal.PriorityQueueNode[] r2 = r3.queue
            r2[r4] = r1
            r1.priorityQueueIndex(r3, r4)
            r4 = r0
            goto L0
        L1c:
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r3.queue
            r0[r4] = r5
            r5.priorityQueueIndex(r3, r4)
            return
    }

    private boolean contains(io.netty.util.internal.PriorityQueueNode r2, int r3) {
            r1 = this;
            if (r3 < 0) goto L12
            int r0 = r1.size
            if (r3 >= r0) goto L12
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r1.queue
            r3 = r0[r3]
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.size
            if (r1 >= r2) goto L18
            T extends io.netty.util.internal.PriorityQueueNode[] r2 = r4.queue
            r2 = r2[r1]
            if (r2 == 0) goto L15
            r3 = -1
            r2.priorityQueueIndex(r4, r3)
            T extends io.netty.util.internal.PriorityQueueNode[] r2 = r4.queue
            r3 = 0
            r2[r1] = r3
        L15:
            int r1 = r1 + 1
            goto L2
        L18:
            r4.size = r0
            return
    }

    @Override // io.netty.util.internal.PriorityQueue
    public void clearIgnoringIndexes() {
            r1 = this;
            r0 = 0
            r1.size = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.internal.PriorityQueueNode
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            io.netty.util.internal.PriorityQueueNode r2 = (io.netty.util.internal.PriorityQueueNode) r2
            int r0 = r2.priorityQueueIndex(r1)
            boolean r2 = r1.contains(r2, r0)
            return r2
    }

    public boolean containsTyped(T r2) {
            r1 = this;
            int r0 = r2.priorityQueueIndex(r1)
            boolean r2 = r1.contains(r2, r0)
            return r2
    }

    @Override // io.netty.util.internal.PriorityQueue
    public /* bridge */ /* synthetic */ boolean containsTyped(java.lang.Object r1) {
            r0 = this;
            io.netty.util.internal.PriorityQueueNode r1 = (io.netty.util.internal.PriorityQueueNode) r1
            boolean r1 = r0.containsTyped(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            io.netty.util.internal.DefaultPriorityQueue$PriorityQueueIterator r0 = new io.netty.util.internal.DefaultPriorityQueue$PriorityQueueIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public boolean offer(T r6) {
            r5 = this;
            int r0 = r6.priorityQueueIndex(r5)
            r1 = -1
            if (r0 != r1) goto L2e
            int r0 = r5.size
            T extends io.netty.util.internal.PriorityQueueNode[] r1 = r5.queue
            int r2 = r1.length
            r3 = 1
            if (r0 < r2) goto L24
            int r0 = r1.length
            int r2 = r1.length
            r4 = 64
            if (r2 >= r4) goto L19
            int r2 = r1.length
            int r2 = r2 + 2
            goto L1b
        L19:
            int r2 = r1.length
            int r2 = r2 >>> r3
        L1b:
            int r0 = r0 + r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            io.netty.util.internal.PriorityQueueNode[] r0 = (io.netty.util.internal.PriorityQueueNode[]) r0
            r5.queue = r0
        L24:
            int r0 = r5.size
            int r1 = r0 + 1
            r5.size = r1
            r5.bubbleUp(r0, r6)
            return r3
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "e.priorityQueueIndex(): "
            r2.append(r3)
            int r3 = r6.priorityQueueIndex(r5)
            r2.append(r3)
            java.lang.String r3 = " (expected: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ") + e: "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // java.util.Queue
    public /* bridge */ /* synthetic */ boolean offer(java.lang.Object r1) {
            r0 = this;
            io.netty.util.internal.PriorityQueueNode r1 = (io.netty.util.internal.PriorityQueueNode) r1
            boolean r1 = r0.offer(r1)
            return r1
    }

    @Override // java.util.Queue
    public T peek() {
            r2 = this;
            int r0 = r2.size
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r2.queue
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.Queue
    public /* bridge */ /* synthetic */ java.lang.Object peek() {
            r1 = this;
            io.netty.util.internal.PriorityQueueNode r0 = r1.peek()
            return r0
    }

    @Override // java.util.Queue
    public T poll() {
            r6 = this;
            int r0 = r6.size
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r6.queue
            r2 = 0
            r0 = r0[r2]
            r3 = -1
            r0.priorityQueueIndex(r6, r3)
            T extends io.netty.util.internal.PriorityQueueNode[] r3 = r6.queue
            int r4 = r6.size
            int r4 = r4 + (-1)
            r6.size = r4
            r5 = r3[r4]
            r3[r4] = r1
            if (r4 == 0) goto L20
            r6.bubbleDown(r2, r5)
        L20:
            return r0
    }

    @Override // java.util.Queue
    public /* bridge */ /* synthetic */ java.lang.Object poll() {
            r1 = this;
            io.netty.util.internal.PriorityQueueNode r0 = r1.poll()
            return r0
    }

    public void priorityChanged(T r4) {
            r3 = this;
            int r0 = r4.priorityQueueIndex(r3)
            boolean r1 = r3.contains(r4, r0)
            if (r1 != 0) goto Lb
            return
        Lb:
            if (r0 != 0) goto L11
            r3.bubbleDown(r0, r4)
            return
        L11:
            int r1 = r0 + (-1)
            int r1 = r1 >>> 1
            T extends io.netty.util.internal.PriorityQueueNode[] r2 = r3.queue
            r1 = r2[r1]
            java.util.Comparator<T extends io.netty.util.internal.PriorityQueueNode> r2 = r3.comparator
            int r1 = r2.compare(r4, r1)
            if (r1 >= 0) goto L25
            r3.bubbleUp(r0, r4)
            return
        L25:
            r3.bubbleDown(r0, r4)
            return
    }

    @Override // io.netty.util.internal.PriorityQueue
    public /* bridge */ /* synthetic */ void priorityChanged(java.lang.Object r1) {
            r0 = this;
            io.netty.util.internal.PriorityQueueNode r1 = (io.netty.util.internal.PriorityQueueNode) r1
            r0.priorityChanged(r1)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            io.netty.util.internal.PriorityQueueNode r1 = (io.netty.util.internal.PriorityQueueNode) r1     // Catch: java.lang.ClassCastException -> L7
            boolean r1 = r0.removeTyped(r1)
            return r1
        L7:
            r1 = 0
            return r1
    }

    public boolean removeTyped(T r7) {
            r6 = this;
            int r0 = r7.priorityQueueIndex(r6)
            boolean r1 = r6.contains(r7, r0)
            if (r1 != 0) goto Lc
            r7 = 0
            return r7
        Lc:
            r1 = -1
            r7.priorityQueueIndex(r6, r1)
            int r1 = r6.size
            r2 = 1
            int r1 = r1 - r2
            r6.size = r1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r0) goto L1c
            goto L34
        L1c:
            T extends io.netty.util.internal.PriorityQueueNode[] r4 = r6.queue
            r5 = r4[r1]
            r4[r0] = r5
            r4[r1] = r3
            java.util.Comparator<T extends io.netty.util.internal.PriorityQueueNode> r1 = r6.comparator
            int r7 = r1.compare(r7, r5)
            if (r7 >= 0) goto L30
            r6.bubbleDown(r0, r5)
            goto L33
        L30:
            r6.bubbleUp(r0, r5)
        L33:
            return r2
        L34:
            T extends io.netty.util.internal.PriorityQueueNode[] r7 = r6.queue
            r7[r0] = r3
            return r2
    }

    @Override // io.netty.util.internal.PriorityQueue
    public /* bridge */ /* synthetic */ boolean removeTyped(java.lang.Object r1) {
            r0 = this;
            io.netty.util.internal.PriorityQueueNode r1 = (io.netty.util.internal.PriorityQueueNode) r1
            boolean r1 = r0.removeTyped(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
            r2 = this;
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r2.queue
            int r1 = r2.size
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <X> X[] toArray(X[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.size
            if (r0 >= r1) goto L10
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r3.queue
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r1, r4)
            return r4
        L10:
            T extends io.netty.util.internal.PriorityQueueNode[] r0 = r3.queue
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.size
            if (r0 <= r1) goto L1e
            r0 = 0
            r4[r1] = r0
        L1e:
            return r4
    }
}
