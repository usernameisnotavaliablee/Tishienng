package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class LexicographicalOrdering<T> extends com.google.common.collect.Ordering<java.lang.Iterable<T>> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator<? super T> elementOrder;

    LexicographicalOrdering(java.util.Comparator<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.elementOrder = r1
            return
    }

    public int compare(java.lang.Iterable<T> r4, java.lang.Iterable<T> r5) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L27
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r4 = 1
            return r4
        L16:
            java.util.Comparator<? super T> r0 = r3.elementOrder
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r5.next()
            int r0 = r0.compare(r1, r2)
            if (r0 == 0) goto L8
            return r0
        L27:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L2f
            r4 = -1
            return r4
        L2f:
            r4 = 0
            return r4
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r1 = r0.compare(r1, r2)
            return r1
    }

    @Override // java.util.Comparator
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.LexicographicalOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.LexicographicalOrdering r2 = (com.google.common.collect.LexicographicalOrdering) r2
            java.util.Comparator<? super T> r0 = r1.elementOrder
            java.util.Comparator<? super T> r2 = r2.elementOrder
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.util.Comparator<? super T> r0 = r2.elementOrder
            int r0 = r0.hashCode()
            r1 = 2075626741(0x7bb78cf5, float:1.9060985E36)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Comparator<? super T> r1 = r2.elementOrder
            r0.append(r1)
            java.lang.String r1 = ".lexicographical()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
