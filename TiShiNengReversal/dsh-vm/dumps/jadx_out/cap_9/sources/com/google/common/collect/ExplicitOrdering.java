package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ExplicitOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.ImmutableMap<T, java.lang.Integer> rankMap;

    ExplicitOrdering(com.google.common.collect.ImmutableMap<T, java.lang.Integer> r1) {
            r0 = this;
            r0.<init>()
            r0.rankMap = r1
            return
    }

    ExplicitOrdering(java.util.List<T> r1) {
            r0 = this;
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.Maps.indexMap(r1)
            r0.<init>(r1)
            return
    }

    private int rank(T r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<T, java.lang.Integer> r0 = r1.rankMap
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r2 = r0.intValue()
            return r2
        Lf:
            com.google.common.collect.Ordering$IncomparableValueException r0 = new com.google.common.collect.Ordering$IncomparableValueException
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T r1, T r2) {
            r0 = this;
            int r1 = r0.rank(r1)
            int r2 = r0.rank(r2)
            int r1 = r1 - r2
            return r1
    }

    @Override // java.util.Comparator
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.collect.ExplicitOrdering
            if (r0 == 0) goto Lf
            com.google.common.collect.ExplicitOrdering r2 = (com.google.common.collect.ExplicitOrdering) r2
            com.google.common.collect.ImmutableMap<T, java.lang.Integer> r0 = r1.rankMap
            com.google.common.collect.ImmutableMap<T, java.lang.Integer> r2 = r2.rankMap
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableMap<T, java.lang.Integer> r0 = r1.rankMap
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ordering.explicit("
            r0.append(r1)
            com.google.common.collect.ImmutableMap<T, java.lang.Integer> r1 = r2.rankMap
            com.google.common.collect.ImmutableSet r1 = r1.keySet()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
