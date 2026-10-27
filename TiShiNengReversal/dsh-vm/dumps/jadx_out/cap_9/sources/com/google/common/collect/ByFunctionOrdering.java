package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ByFunctionOrdering<F, T> extends com.google.common.collect.Ordering<F> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.base.Function<F, ? extends T> function;
    final com.google.common.collect.Ordering<T> ordering;

    ByFunctionOrdering(com.google.common.base.Function<F, ? extends T> r1, com.google.common.collect.Ordering<T> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Function r1 = (com.google.common.base.Function) r1
            r0.function = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Ordering r1 = (com.google.common.collect.Ordering) r1
            r0.ordering = r1
            return
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F r3, F r4) {
            r2 = this;
            com.google.common.collect.Ordering<T> r0 = r2.ordering
            com.google.common.base.Function<F, ? extends T> r1 = r2.function
            java.lang.Object r3 = r1.apply(r3)
            com.google.common.base.Function<F, ? extends T> r1 = r2.function
            java.lang.Object r4 = r1.apply(r4)
            int r3 = r0.compare(r3, r4)
            return r3
    }

    @Override // java.util.Comparator
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.collect.ByFunctionOrdering
            r2 = 0
            if (r1 == 0) goto L20
            com.google.common.collect.ByFunctionOrdering r5 = (com.google.common.collect.ByFunctionOrdering) r5
            com.google.common.base.Function<F, ? extends T> r1 = r4.function
            com.google.common.base.Function<F, ? extends T> r3 = r5.function
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            com.google.common.collect.Ordering<T> r1 = r4.ordering
            com.google.common.collect.Ordering<T> r5 = r5.ordering
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public int hashCode() {
            r4 = this;
            com.google.common.base.Function<F, ? extends T> r0 = r4.function
            com.google.common.collect.Ordering<T> r1 = r4.ordering
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = com.google.common.base.Objects.hashCode(r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.common.collect.Ordering<T> r1 = r2.ordering
            r0.append(r1)
            java.lang.String r1 = ".onResultOf("
            r0.append(r1)
            com.google.common.base.Function<F, ? extends T> r1 = r2.function
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
