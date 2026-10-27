package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class LimitQueue<E> extends java.util.concurrent.ConcurrentLinkedQueue<E> {
    private static final java.lang.String TAG = "LimitQueue";
    private static final long serialVersionUID = -4636313759149307798L;
    private boolean deduplication;
    private int limit;

    public LimitQueue(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.deduplication = r0
            r1.limit = r2
            return
    }

    public LimitQueue(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.limit = r1
            r0.deduplication = r2
            return
    }

    public LimitQueue(java.util.Collection<? extends E> r2, boolean r3) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>(r0, r3)
            r1.addAll(r2)
            return
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E r3) {
            r2 = this;
            boolean r0 = r2.deduplication
            if (r0 == 0) goto L7
            super.remove(r3)
        L7:
            int r0 = super.size()
            int r1 = r2.limit
            if (r0 < r1) goto L12
            super.poll()
        L12:
            boolean r3 = super.add(r3)
            return r3
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            int r0 = r3.size()
            int r1 = r2.limit
            if (r0 <= r1) goto La
            r3 = 0
            return r3
        La:
            boolean r0 = r2.deduplication
            if (r0 == 0) goto L11
            super.removeAll(r3)
        L11:
            int r0 = r3.size()
            int r1 = super.size()
            int r0 = r0 + r1
            int r1 = r2.limit
            int r0 = r0 - r1
        L1d:
            if (r0 <= 0) goto L25
            super.poll()
            int r0 = r0 + (-1)
            goto L1d
        L25:
            boolean r3 = super.addAll(r3)
            return r3
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r0 = this;
            super.clear()
            return
    }

    public E get(int r5) {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
            r2 = 0
        L6:
            if (r2 > r5) goto L15
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r1 = r0.next()
            int r2 = r2 + 1
            goto L6
        L15:
            return r1
    }

    public int getLimit() {
            r1 = this;
            int r0 = r1.limit
            return r0
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E r3) {
            r2 = this;
            boolean r0 = r2.deduplication
            if (r0 == 0) goto L7
            super.remove(r3)
        L7:
            int r0 = super.size()
            int r1 = r2.limit
            if (r0 < r1) goto L12
            super.poll()
        L12:
            boolean r3 = super.offer(r3)
            return r3
    }

    public E peekLast() {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10
            java.lang.Object r1 = r0.next()
            goto L5
        L10:
            return r1
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
            r1 = this;
            java.lang.Object r0 = super.poll()
            return r0
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
            r2 = this;
            java.lang.Object r0 = super.remove()     // Catch: java.util.NoSuchElementException -> L5
            return r0
        L5:
            java.lang.String r0 = "LimitQueue"
            java.lang.String r1 = "remove failed, limitQueue is empty"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            r0 = 0
            return r0
    }
}
