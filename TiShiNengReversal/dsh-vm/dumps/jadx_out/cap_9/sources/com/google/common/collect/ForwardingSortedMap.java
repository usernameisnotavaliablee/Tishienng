package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingSortedMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.SortedMap<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected class StandardKeySet extends com.google.common.collect.Maps.SortedKeySet<K, V> {
        final /* synthetic */ com.google.common.collect.ForwardingSortedMap this$0;

        public StandardKeySet(com.google.common.collect.ForwardingSortedMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }
    }

    protected ForwardingSortedMap() {
            r0 = this;
            r0.<init>()
            return
    }

    private int unsafeCompare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.Comparator r0 = r1.comparator()
            if (r0 != 0) goto Ld
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r3)
            return r2
        Ld:
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.SortedMap
    public java.util.Comparator<? super K> comparator() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Map delegate() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected abstract java.util.SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public K firstKey() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.lang.Object r0 = r0.firstKey()
            return r0
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> headMap(K r2) {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.SortedMap r2 = r0.headMap(r2)
            return r2
    }

    @Override // java.util.SortedMap
    public K lastKey() {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.lang.Object r0 = r0.lastKey()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap
    @com.google.common.annotations.Beta
    protected boolean standardContainsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            r0 = 0
            java.util.SortedMap r1 = r2.tailMap(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.firstKey()     // Catch: java.lang.Throwable -> L11
            int r3 = r2.unsafeCompare(r1, r3)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L11
            r3 = 1
            return r3
        L11:
            return r0
    }

    @com.google.common.annotations.Beta
    protected java.util.SortedMap<K, V> standardSubMap(K r3, K r4) {
            r2 = this;
            int r0 = r2.unsafeCompare(r3, r4)
            if (r0 > 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "fromKey must be <= toKey"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            java.util.SortedMap r3 = r2.tailMap(r3)
            java.util.SortedMap r3 = r3.headMap(r4)
            return r3
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> subMap(K r2, K r3) {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.SortedMap r2 = r0.subMap(r2, r3)
            return r2
    }

    @Override // java.util.SortedMap
    public java.util.SortedMap<K, V> tailMap(K r2) {
            r1 = this;
            java.util.SortedMap r0 = r1.delegate()
            java.util.SortedMap r2 = r0.tailMap(r2)
            return r2
    }
}
