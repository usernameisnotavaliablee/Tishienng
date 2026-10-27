package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingNavigableMap<K, V> extends com.google.common.collect.ForwardingSortedMap<K, V> implements java.util.NavigableMap<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected class StandardDescendingMap extends com.google.common.collect.Maps.DescendingMap<K, V> {
        final /* synthetic */ com.google.common.collect.ForwardingNavigableMap this$0;


        public StandardDescendingMap(com.google.common.collect.ForwardingNavigableMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        protected java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
                r1 = this;
                com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1 r0 = new com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        java.util.NavigableMap<K, V> forward() {
                r1 = this;
                com.google.common.collect.ForwardingNavigableMap r0 = r1.this$0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected class StandardNavigableKeySet extends com.google.common.collect.Maps.NavigableKeySet<K, V> {
        final /* synthetic */ com.google.common.collect.ForwardingNavigableMap this$0;

        public StandardNavigableKeySet(com.google.common.collect.ForwardingNavigableMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }
    }

    protected ForwardingNavigableMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> ceilingEntry(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.ceilingEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.ceilingKey(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Map delegate() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected abstract java.util.NavigableMap<K, V> delegate();

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.SortedMap delegate() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> descendingKeySet() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.descendingKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> descendingMap() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r0 = r0.descendingMap()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> firstEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.firstEntry()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> floorEntry(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.floorEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public K floorKey(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.floorKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> headMap(K r2, boolean r3) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r2 = r0.headMap(r2, r3)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> higherEntry(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.higherEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public K higherKey(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.higherKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lastEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.lastEntry()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> lowerEntry(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r2 = r0.lowerEntry(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K r2) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.lang.Object r2 = r0.lowerKey(r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableSet<K> navigableKeySet() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.navigableKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> pollFirstEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.pollFirstEntry()
            return r0
    }

    @Override // java.util.NavigableMap
    public java.util.Map.Entry<K, V> pollLastEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.Map$Entry r0 = r0.pollLastEntry()
            return r0
    }

    protected java.util.Map.Entry<K, V> standardCeilingEntry(K r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    protected K standardCeilingKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.ceilingEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @com.google.common.annotations.Beta
    protected java.util.NavigableSet<K> standardDescendingKeySet() {
            r1 = this;
            java.util.NavigableMap r0 = r1.descendingMap()
            java.util.NavigableSet r0 = r0.navigableKeySet()
            return r0
    }

    protected java.util.Map.Entry<K, V> standardFirstEntry() {
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            r1 = 0
            java.lang.Object r0 = com.google.common.collect.Iterables.getFirst(r0, r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    protected K standardFirstKey() {
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

    protected java.util.Map.Entry<K, V> standardFloorEntry(K r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    protected K standardFloorKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.floorEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    protected java.util.SortedMap<K, V> standardHeadMap(K r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableMap r2 = r1.headMap(r2, r0)
            return r2
    }

    protected java.util.Map.Entry<K, V> standardHigherEntry(K r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    protected K standardHigherKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.higherEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    protected java.util.Map.Entry<K, V> standardLastEntry() {
            r2 = this;
            java.util.NavigableMap r0 = r2.descendingMap()
            java.util.Set r0 = r0.entrySet()
            r1 = 0
            java.lang.Object r0 = com.google.common.collect.Iterables.getFirst(r0, r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    protected K standardLastKey() {
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

    protected java.util.Map.Entry<K, V> standardLowerEntry(K r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    protected K standardLowerKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.lowerEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    protected java.util.Map.Entry<K, V> standardPollFirstEntry() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    protected java.util.Map.Entry<K, V> standardPollLastEntry() {
            r1 = this;
            java.util.NavigableMap r0 = r1.descendingMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    protected java.util.SortedMap<K, V> standardSubMap(K r3, K r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
            return r3
    }

    protected java.util.SortedMap<K, V> standardTailMap(K r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableMap r2 = r1.tailMap(r2, r0)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> subMap(K r2, boolean r3, K r4, boolean r5) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r2 = r0.subMap(r2, r3, r4, r5)
            return r2
    }

    @Override // java.util.NavigableMap
    public java.util.NavigableMap<K, V> tailMap(K r2, boolean r3) {
            r1 = this;
            java.util.NavigableMap r0 = r1.delegate()
            java.util.NavigableMap r2 = r0.tailMap(r2, r3)
            return r2
    }
}
