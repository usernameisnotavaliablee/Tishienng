package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingListIterator<E> extends com.google.common.collect.ForwardingIterator<E> implements java.util.ListIterator<E> {
    protected ForwardingListIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.ListIterator
    public void add(E r2) {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            r0.add(r2)
            return
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Iterator delegate() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    protected abstract java.util.ListIterator<E> delegate();

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E previous() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            java.lang.Object r0 = r0.previous()
            return r0
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public void set(E r2) {
            r1 = this;
            java.util.ListIterator r0 = r1.delegate()
            r0.set(r2)
            return
    }
}
