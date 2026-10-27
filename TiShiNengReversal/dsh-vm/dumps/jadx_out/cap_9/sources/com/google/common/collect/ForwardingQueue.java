package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingQueue<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Queue<E> {
    protected ForwardingQueue() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract java.util.Queue<E> delegate();

    @Override // java.util.Queue
    public E element() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.element()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offer(E r2) {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // java.util.Queue
    public E peek() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.peek()
            return r0
    }

    @Override // java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E poll() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.poll()
            return r0
    }

    @Override // java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E remove() {
            r1 = this;
            java.util.Queue r0 = r1.delegate()
            java.lang.Object r0 = r0.remove()
            return r0
    }

    protected boolean standardOffer(E r1) {
            r0 = this;
            boolean r1 = r0.add(r1)     // Catch: java.lang.IllegalStateException -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }

    protected E standardPeek() {
            r1 = this;
            java.lang.Object r0 = r1.element()     // Catch: java.util.NoSuchElementException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    protected E standardPoll() {
            r1 = this;
            java.lang.Object r0 = r1.remove()     // Catch: java.util.NoSuchElementException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }
}
