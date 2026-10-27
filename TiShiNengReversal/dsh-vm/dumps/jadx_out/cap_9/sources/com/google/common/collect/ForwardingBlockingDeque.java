package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingBlockingDeque<E> extends com.google.common.collect.ForwardingDeque<E> implements java.util.concurrent.BlockingDeque<E> {
    protected ForwardingBlockingDeque() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Deque delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Queue delegate() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract java.util.concurrent.BlockingDeque<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> r2) {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            int r2 = r0.drainTo(r2)
            return r2
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> r2, int r3) {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            int r2 = r0.drainTo(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            boolean r2 = r0.offer(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            boolean r2 = r0.offerFirst(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            boolean r2 = r0.offerLast(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E poll(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r2 = r0.poll(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollFirst(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r2 = r0.pollFirst(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollLast(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r2 = r0.pollLast(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            r0.put(r2)
            return
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            r0.putFirst(r2)
            return
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            r0.putLast(r2)
            return
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            int r0 = r0.remainingCapacity()
            return r0
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r0 = r0.take()
            return r0
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r0 = r0.takeFirst()
            return r0
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingDeque r0 = r1.delegate()
            java.lang.Object r0 = r0.takeLast()
            return r0
    }
}
