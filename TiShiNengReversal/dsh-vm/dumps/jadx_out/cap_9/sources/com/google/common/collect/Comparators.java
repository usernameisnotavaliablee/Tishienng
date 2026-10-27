package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Comparators {
    private Comparators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> boolean isInOrder(java.lang.Iterable<? extends T> r2, java.util.Comparator<T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            int r0 = r3.compare(r0, r1)
            if (r0 <= 0) goto L23
            r2 = 0
            return r2
        L23:
            r0 = r1
            goto L11
        L25:
            r2 = 1
            return r2
    }

    public static <T> boolean isInStrictOrder(java.lang.Iterable<? extends T> r2, java.util.Comparator<T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            int r0 = r3.compare(r0, r1)
            if (r0 < 0) goto L23
            r2 = 0
            return r2
        L23:
            r0 = r1
            goto L11
        L25:
            r2 = 1
            return r2
    }

    public static <T, S extends T> java.util.Comparator<java.lang.Iterable<S>> lexicographical(java.util.Comparator<T> r1) {
            com.google.common.collect.LexicographicalOrdering r0 = new com.google.common.collect.LexicographicalOrdering
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            r0.<init>(r1)
            return r0
    }
}
