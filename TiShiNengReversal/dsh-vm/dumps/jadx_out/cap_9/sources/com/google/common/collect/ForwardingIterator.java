package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingIterator<T> extends com.google.common.collect.ForwardingObject implements java.util.Iterator<T> {
    protected ForwardingIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract java.util.Iterator<T> delegate();

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            boolean r0 = r0.hasNext()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public T next() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            java.lang.Object r0 = r0.next()
            return r0
    }

    public void remove() {
            r1 = this;
            java.util.Iterator r0 = r1.delegate()
            r0.remove()
            return
    }
}
