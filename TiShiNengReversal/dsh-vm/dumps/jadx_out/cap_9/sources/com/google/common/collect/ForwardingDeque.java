package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingDeque<E> extends com.google.common.collect.ForwardingQueue<E> implements java.util.Deque<E> {
    protected ForwardingDeque() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Deque
    public void addFirst(E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            r0.addFirst(r2)
            return
    }

    @Override // java.util.Deque
    public void addLast(E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            r0.addLast(r2)
            return
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract java.util.Deque<E> delegate();

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Queue delegate() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            return r0
    }

    @Override // java.util.Deque
    public java.util.Iterator<E> descendingIterator() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.util.Iterator r0 = r0.descendingIterator()
            return r0
    }

    @Override // java.util.Deque
    public E getFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.getFirst()
            return r0
    }

    @Override // java.util.Deque
    public E getLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.getLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offerFirst(E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.offerFirst(r2)
            return r2
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offerLast(E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.offerLast(r2)
            return r2
    }

    @Override // java.util.Deque
    public E peekFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.peekFirst()
            return r0
    }

    @Override // java.util.Deque
    public E peekLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.peekLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E pollFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.pollFirst()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E pollLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.pollLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E pop() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.pop()
            return r0
    }

    @Override // java.util.Deque
    public void push(E r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            r0.push(r2)
            return
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E removeFirst() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.removeFirst()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeFirstOccurrence(java.lang.Object r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.removeFirstOccurrence(r2)
            return r2
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E removeLast() {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            java.lang.Object r0 = r0.removeLast()
            return r0
    }

    @Override // java.util.Deque
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeLastOccurrence(java.lang.Object r2) {
            r1 = this;
            java.util.Deque r0 = r1.delegate()
            boolean r2 = r0.removeLastOccurrence(r2)
            return r2
    }
}
