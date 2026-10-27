package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class PairwiseEquivalence<T> extends com.google.common.base.Equivalence<java.lang.Iterable<T>> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    final com.google.common.base.Equivalence<? super T> elementEquivalence;

    PairwiseEquivalence(com.google.common.base.Equivalence<? super T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Equivalence r1 = (com.google.common.base.Equivalence) r1
            r0.elementEquivalence = r1
            return
    }

    protected boolean doEquivalent(java.lang.Iterable<T> r5, java.lang.Iterable<T> r6) {
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L26
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L26
            com.google.common.base.Equivalence<? super T> r0 = r4.elementEquivalence
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.next()
            boolean r0 = r0.equivalent(r2, r3)
            if (r0 != 0) goto L8
            return r1
        L26:
            boolean r5 = r5.hasNext()
            if (r5 != 0) goto L34
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L34
            r5 = 1
            return r5
        L34:
            return r1
    }

    @Override // com.google.common.base.Equivalence
    protected /* bridge */ /* synthetic */ boolean doEquivalent(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r1 = r0.doEquivalent(r1, r2)
            return r1
    }

    protected int doHash(java.lang.Iterable<T> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 78721(0x13381, float:1.10312E-40)
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r4.next()
            int r0 = r0 * 24943
            com.google.common.base.Equivalence<? super T> r2 = r3.elementEquivalence
            int r1 = r2.hash(r1)
            int r0 = r0 + r1
            goto L7
        L1b:
            return r0
    }

    @Override // com.google.common.base.Equivalence
    protected /* bridge */ /* synthetic */ int doHash(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r1 = r0.doHash(r1)
            return r1
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.base.PairwiseEquivalence
            if (r0 == 0) goto Lf
            com.google.common.base.PairwiseEquivalence r2 = (com.google.common.base.PairwiseEquivalence) r2
            com.google.common.base.Equivalence<? super T> r0 = r1.elementEquivalence
            com.google.common.base.Equivalence<? super T> r2 = r2.elementEquivalence
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            com.google.common.base.Equivalence<? super T> r0 = r2.elementEquivalence
            int r0 = r0.hashCode()
            r1 = 1185147655(0x46a3eb07, float:20981.514)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.common.base.Equivalence<? super T> r1 = r2.elementEquivalence
            r0.append(r1)
            java.lang.String r1 = ".pairwise()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
