package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class TransformedIterator<F, T> implements java.util.Iterator<T> {
    final java.util.Iterator<? extends F> backingIterator;

    TransformedIterator(java.util.Iterator<? extends F> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Iterator r1 = (java.util.Iterator) r1
            r0.backingIterator = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            java.lang.Object r0 = r0.next()
            java.lang.Object r0 = r1.transform(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.backingIterator
            r0.remove()
            return
    }

    abstract T transform(F r1);
}
