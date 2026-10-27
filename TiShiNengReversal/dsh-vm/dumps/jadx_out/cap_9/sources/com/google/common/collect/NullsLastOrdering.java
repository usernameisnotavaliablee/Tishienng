package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class NullsLastOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Ordering<? super T> ordering;

    NullsLastOrdering(com.google.common.collect.Ordering<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.ordering = r1
            return
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r3) {
            r1 = this;
            if (r2 != r3) goto L4
            r2 = 0
            return r2
        L4:
            if (r2 != 0) goto L8
            r2 = 1
            return r2
        L8:
            if (r3 != 0) goto Lc
            r2 = -1
            return r2
        Lc:
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.NullsLastOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.NullsLastOrdering r2 = (com.google.common.collect.NullsLastOrdering) r2
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            com.google.common.collect.Ordering<? super T> r2 = r2.ordering
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            com.google.common.collect.Ordering<? super T> r0 = r2.ordering
            int r0 = r0.hashCode()
            r1 = -921210296(0xffffffffc9177248, float:-620324.5)
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> nullsFirst() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            com.google.common.collect.Ordering r0 = r0.nullsFirst()
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> nullsLast() {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.collect.Ordering r0 = r0.nullsFirst()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.common.collect.Ordering<? super T> r1 = r2.ordering
            r0.append(r1)
            java.lang.String r1 = ".nullsLast()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
