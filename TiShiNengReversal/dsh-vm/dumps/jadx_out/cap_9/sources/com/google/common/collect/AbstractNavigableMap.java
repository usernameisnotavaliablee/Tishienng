package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractNavigableMap<K, V> extends com.google.common.collect.Maps.IteratorBasedAbstractMap<K, V> implements java.util.NavigableMap<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.AbstractNavigableMap$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DescendingMap extends com.google.common.collect.Maps.DescendingMap<K, V> {
        final /* synthetic */ com.google.common.collect.AbstractNavigableMap this$0;

        private DescendingMap(com.google.common.collect.AbstractNavigableMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ DescendingMap(com.google.common.collect.AbstractNavigableMap r1, com.google.common.collect.AbstractNavigableMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
                r1 = this;
                com.google.common.collect.AbstractNavigableMap r0 = r1.this$0
                java.util.Iterator r0 = r0.descendingEntryIterator()
                return r0
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        java.util.NavigableMap<K, V> forward() {
                r1 = this;
                com.google.common.collect.AbstractNavigableMap r0 = r1.this$0
                return r0
        }
    }

    AbstractNavigableMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> ceilingEntry(K r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.ceilingEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    abstract java.util.Iterator<java.util.Map.Entry<K, V>> descendingEntryIterator();

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> descendingKeySet() {
            r1 = this;
            java.util.NavigableMap r0 = r1.descendingMap()
            java.util.NavigableSet r0 = r0.navigableKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> descendingMap() {
            r2 = this;
            com.google.common.collect.AbstractNavigableMap$DescendingMap r0 = new com.google.common.collect.AbstractNavigableMap$DescendingMap
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> firstEntry() {
            r2 = this;
            java.util.Iterator r0 = r2.entryIterator()
            r1 = 0
            java.lang.Object r0 = com.google.common.collect.Iterators.getNext(r0, r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.SortedMap
    public K firstKey() {
            r1 = this;
            java.util.Map$Entry r0 = r1.firstEntry()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.getKey()
            return r0
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> floorEntry(K r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K floorKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.floorEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public abstract V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> headMap(K r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableMap r2 = r1.headMap(r2, r0)
            return r2
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> higherEntry(K r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K higherKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.higherEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.navigableKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> lastEntry() {
            r2 = this;
            java.util.Iterator r0 = r2.descendingEntryIterator()
            r1 = 0
            java.lang.Object r0 = com.google.common.collect.Iterators.getNext(r0, r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.SortedMap
    public K lastKey() {
            r1 = this;
            java.util.Map$Entry r0 = r1.lastEntry()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.getKey()
            return r0
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> lowerEntry(K r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.lowerEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> navigableKeySet() {
            r1 = this;
            com.google.common.collect.Maps$NavigableKeySet r0 = new com.google.common.collect.Maps$NavigableKeySet
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> pollFirstEntry() {
            r1 = this;
            java.util.Iterator r0 = r1.entryIterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.NavigableMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Map.Entry<K, V> pollLastEntry() {
            r1 = this;
            java.util.Iterator r0 = r1.descendingEntryIterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> subMap(K r3, K r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
            return r3
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public java.util.SortedMap<K, V> tailMap(K r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableMap r2 = r1.tailMap(r2, r0)
            return r2
    }
}
