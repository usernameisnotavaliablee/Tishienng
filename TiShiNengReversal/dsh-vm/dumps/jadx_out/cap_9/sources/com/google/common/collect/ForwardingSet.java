package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingSet<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Set<E> {
    protected ForwardingSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Set r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.Set r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract java.util.Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            java.util.Set r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    protected boolean standardEquals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Sets.equalsImpl(r0, r1)
            return r1
    }

    protected int standardHashCode() {
            r1 = this;
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.google.common.collect.Sets.removeAllImpl(r0, r1)
            return r1
    }
}
