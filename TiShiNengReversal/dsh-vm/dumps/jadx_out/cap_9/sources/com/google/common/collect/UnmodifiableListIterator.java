package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class UnmodifiableListIterator<E> extends com.google.common.collect.UnmodifiableIterator<E> implements java.util.ListIterator<E> {
    protected UnmodifiableListIterator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void set(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
