package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ReverseOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Ordering<? super T> forwardOrder;

    ReverseOrdering(com.google.common.collect.Ordering<? super T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Ordering r1 = (com.google.common.collect.Ordering) r1
            r0.forwardOrder = r1
            return
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.ReverseOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.ReverseOrdering r2 = (com.google.common.collect.ReverseOrdering) r2
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            com.google.common.collect.Ordering<? super T> r2 = r2.forwardOrder
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            int r0 = r0.hashCode()
            int r0 = -r0
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(java.lang.Iterable<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(E r2, E r3) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(E r2, E r3, E r4, E... r5) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(java.util.Iterator<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.min(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(java.lang.Iterable<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(E r2, E r3) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(E r2, E r3, E r4, E... r5) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(java.util.Iterator<E> r2) {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            java.lang.Object r2 = r0.max(r2)
            return r2
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.forwardOrder
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.common.collect.Ordering<? super T> r1 = r2.forwardOrder
            r0.append(r1)
            java.lang.String r1 = ".reverse()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
