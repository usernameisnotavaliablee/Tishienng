package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class TransformedListIterator<F, T> extends com.google.common.collect.TransformedIterator<F, T> implements java.util.ListIterator<T> {
    TransformedListIterator(java.util.ListIterator<? extends F> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.util.ListIterator<? extends F> backingIterator() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            java.util.ListIterator r0 = com.google.common.collect.Iterators.cast(r0)
            return r0
    }

    @Override // java.util.ListIterator
    public void add(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final T previous() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            java.lang.Object r0 = r0.previous()
            java.lang.Object r0 = r1.transform(r0)
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.backingIterator()
            int r0 = r0.previousIndex()
            return r0
    }

    public void set(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
