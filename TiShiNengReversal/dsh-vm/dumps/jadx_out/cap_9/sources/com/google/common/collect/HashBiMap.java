package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class HashBiMap<K, V> extends java.util.AbstractMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @com.google.j2objc.annotations.RetainedWith
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.collect.BiMap<V, K> inverse;
    private transient java.util.Set<K> keySet;
    transient K[] keys;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient java.util.Set<V> valueSet;
    transient V[] values;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntryForKey extends com.google.common.collect.AbstractMapEntry<K, V> {
        int index;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final K key;
        final /* synthetic */ com.google.common.collect.HashBiMap this$0;

        EntryForKey(com.google.common.collect.HashBiMap r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                K[] r1 = r1.keys
                r1 = r1[r2]
                r0.key = r1
                r0.index = r2
                return
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public V getValue() {
                r2 = this;
                r2.updateIndex()
                int r0 = r2.index
                r1 = -1
                if (r0 != r1) goto La
                r0 = 0
                return r0
            La:
                com.google.common.collect.HashBiMap r1 = r2.this$0
                V[] r1 = r1.values
                r0 = r1[r0]
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V r5) {
                r4 = this;
                r4.updateIndex()
                int r0 = r4.index
                r1 = -1
                if (r0 != r1) goto L11
                com.google.common.collect.HashBiMap r0 = r4.this$0
                K r1 = r4.key
                java.lang.Object r5 = r0.put(r1, r5)
                return r5
            L11:
                com.google.common.collect.HashBiMap r1 = r4.this$0
                V[] r1 = r1.values
                r0 = r1[r0]
                boolean r1 = com.google.common.base.Objects.equal(r0, r5)
                if (r1 == 0) goto L1e
                return r5
            L1e:
                com.google.common.collect.HashBiMap r1 = r4.this$0
                int r2 = r4.index
                r3 = 0
                com.google.common.collect.HashBiMap.access$200(r1, r2, r5, r3)
                return r0
        }

        void updateIndex() {
                r3 = this;
                int r0 = r3.index
                r1 = -1
                if (r0 == r1) goto L19
                com.google.common.collect.HashBiMap r1 = r3.this$0
                int r2 = r1.size
                if (r0 > r2) goto L19
                K[] r1 = r1.keys
                r0 = r1[r0]
                K r1 = r3.key
                boolean r0 = com.google.common.base.Objects.equal(r0, r1)
                if (r0 != 0) goto L18
                goto L19
            L18:
                return
            L19:
                com.google.common.collect.HashBiMap r0 = r3.this$0
                K r1 = r3.key
                int r0 = r0.findEntryByKey(r1)
                r3.index = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class EntryForValue<K, V> extends com.google.common.collect.AbstractMapEntry<V, K> {
        final com.google.common.collect.HashBiMap<K, V> biMap;
        int index;
        final V value;

        EntryForValue(com.google.common.collect.HashBiMap<K, V> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.biMap = r1
                V[] r1 = r1.values
                r1 = r1[r2]
                r0.value = r1
                r0.index = r2
                return
        }

        private void updateIndex() {
                r3 = this;
                int r0 = r3.index
                r1 = -1
                if (r0 == r1) goto L19
                com.google.common.collect.HashBiMap<K, V> r1 = r3.biMap
                int r2 = r1.size
                if (r0 > r2) goto L19
                V r2 = r3.value
                V[] r1 = r1.values
                r0 = r1[r0]
                boolean r0 = com.google.common.base.Objects.equal(r2, r0)
                if (r0 != 0) goto L18
                goto L19
            L18:
                return
            L19:
                com.google.common.collect.HashBiMap<K, V> r0 = r3.biMap
                V r1 = r3.value
                int r0 = r0.findEntryByValue(r1)
                r3.index = r0
                return
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getKey() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getValue() {
                r2 = this;
                r2.updateIndex()
                int r0 = r2.index
                r1 = -1
                if (r0 != r1) goto La
                r0 = 0
                return r0
            La:
                com.google.common.collect.HashBiMap<K, V> r1 = r2.biMap
                K[] r1 = r1.keys
                r0 = r1[r0]
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K setValue(K r5) {
                r4 = this;
                r4.updateIndex()
                int r0 = r4.index
                r1 = -1
                r2 = 0
                if (r0 != r1) goto L12
                com.google.common.collect.HashBiMap<K, V> r0 = r4.biMap
                V r1 = r4.value
                java.lang.Object r5 = r0.putInverse(r1, r5, r2)
                return r5
            L12:
                com.google.common.collect.HashBiMap<K, V> r1 = r4.biMap
                K[] r1 = r1.keys
                r0 = r1[r0]
                boolean r1 = com.google.common.base.Objects.equal(r0, r5)
                if (r1 == 0) goto L1f
                return r5
            L1f:
                com.google.common.collect.HashBiMap<K, V> r1 = r4.biMap
                int r3 = r4.index
                com.google.common.collect.HashBiMap.access$400(r1, r3, r5, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntrySet extends com.google.common.collect.HashBiMap.View<K, V, java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.collect.HashBiMap this$0;

        EntrySet(com.google.common.collect.HashBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L26
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                com.google.common.collect.HashBiMap r2 = r3.this$0
                int r0 = r2.findEntryByKey(r0)
                r2 = -1
                if (r0 == r2) goto L26
                com.google.common.collect.HashBiMap r2 = r3.this$0
                V[] r2 = r2.values
                r0 = r2[r0]
                boolean r4 = com.google.common.base.Objects.equal(r4, r0)
                if (r4 == 0) goto L26
                r4 = 1
                return r4
            L26:
                return r1
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* bridge */ /* synthetic */ java.lang.Object forEntry(int r1) {
                r0 = this;
                java.util.Map$Entry r1 = r0.forEntry(r1)
                return r1
        }

        @Override // com.google.common.collect.HashBiMap.View
        java.util.Map.Entry<K, V> forEntry(int r3) {
                r2 = this;
                com.google.common.collect.HashBiMap$EntryForKey r0 = new com.google.common.collect.HashBiMap$EntryForKey
                com.google.common.collect.HashBiMap r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                if (r0 == 0) goto L2e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                int r1 = com.google.common.collect.Hashing.smearedHash(r0)
                com.google.common.collect.HashBiMap r2 = r3.this$0
                int r0 = r2.findEntryByKey(r0, r1)
                r2 = -1
                if (r0 == r2) goto L2e
                com.google.common.collect.HashBiMap r2 = r3.this$0
                V[] r2 = r2.values
                r2 = r2[r0]
                boolean r4 = com.google.common.base.Objects.equal(r4, r2)
                if (r4 == 0) goto L2e
                com.google.common.collect.HashBiMap r4 = r3.this$0
                r4.removeEntryKeyHashKnown(r0, r1)
                r4 = 1
                return r4
            L2e:
                r4 = 0
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Inverse<K, V> extends java.util.AbstractMap<V, K> implements com.google.common.collect.BiMap<V, K>, java.io.Serializable {
        private final com.google.common.collect.HashBiMap<K, V> forward;
        private transient java.util.Set<java.util.Map.Entry<V, K>> inverseEntrySet;

        Inverse(com.google.common.collect.HashBiMap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.forward = r1
                return
        }

        @com.google.common.annotations.GwtIncompatible("serialization")
        private void readObject(java.io.ObjectInputStream r1) throws java.lang.ClassNotFoundException, java.io.IOException {
                r0 = this;
                r1.defaultReadObject()
                com.google.common.collect.HashBiMap<K, V> r1 = r0.forward
                com.google.common.collect.HashBiMap.access$302(r1, r0)
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                r0.clear()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<V, K>> entrySet() {
                r2 = this;
                java.util.Set<java.util.Map$Entry<V, K>> r0 = r2.inverseEntrySet
                if (r0 != 0) goto Ld
                com.google.common.collect.HashBiMap$InverseEntrySet r0 = new com.google.common.collect.HashBiMap$InverseEntrySet
                com.google.common.collect.HashBiMap<K, V> r1 = r2.forward
                r0.<init>(r1)
                r2.inverseEntrySet = r0
            Ld:
                return r0
        }

        @Override // com.google.common.collect.BiMap
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public K forcePut(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r4) {
                r2 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r2.forward
                r1 = 1
                java.lang.Object r3 = r0.putInverse(r3, r4, r1)
                return r3
        }

        @Override // java.util.AbstractMap, java.util.Map
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public K get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                java.lang.Object r2 = r0.getInverse(r2)
                return r2
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<K, V> inverse() {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<V> keySet() {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                java.util.Set r0 = r0.values()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public K put(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r4) {
                r2 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r2.forward
                r1 = 0
                java.lang.Object r3 = r0.putInverse(r3, r4, r1)
                return r3
        }

        @Override // java.util.AbstractMap, java.util.Map
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public K remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                java.lang.Object r2 = r0.removeInverse(r2)
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                int r0 = r0.size
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Collection values() {
                r1 = this;
                java.util.Set r0 = r1.values()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public java.util.Set<K> values() {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.forward
                java.util.Set r0 = r0.keySet()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class InverseEntrySet<K, V> extends com.google.common.collect.HashBiMap.View<K, V, java.util.Map.Entry<V, K>> {
        InverseEntrySet(com.google.common.collect.HashBiMap<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L26
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                com.google.common.collect.HashBiMap<K, V> r2 = r3.biMap
                int r0 = r2.findEntryByValue(r0)
                r2 = -1
                if (r0 == r2) goto L26
                com.google.common.collect.HashBiMap<K, V> r2 = r3.biMap
                K[] r2 = r2.keys
                r0 = r2[r0]
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L26
                r4 = 1
                return r4
            L26:
                return r1
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* bridge */ /* synthetic */ java.lang.Object forEntry(int r1) {
                r0 = this;
                java.util.Map$Entry r1 = r0.forEntry(r1)
                return r1
        }

        @Override // com.google.common.collect.HashBiMap.View
        java.util.Map.Entry<V, K> forEntry(int r3) {
                r2 = this;
                com.google.common.collect.HashBiMap$EntryForValue r0 = new com.google.common.collect.HashBiMap$EntryForValue
                com.google.common.collect.HashBiMap<K, V> r1 = r2.biMap
                r0.<init>(r1, r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                if (r0 == 0) goto L2e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                int r1 = com.google.common.collect.Hashing.smearedHash(r0)
                com.google.common.collect.HashBiMap<K, V> r2 = r3.biMap
                int r0 = r2.findEntryByValue(r0, r1)
                r2 = -1
                if (r0 == r2) goto L2e
                com.google.common.collect.HashBiMap<K, V> r2 = r3.biMap
                K[] r2 = r2.keys
                r2 = r2[r0]
                boolean r4 = com.google.common.base.Objects.equal(r2, r4)
                if (r4 == 0) goto L2e
                com.google.common.collect.HashBiMap<K, V> r4 = r3.biMap
                r4.removeEntryValueHashKnown(r0, r1)
                r4 = 1
                return r4
            L2e:
                r4 = 0
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeySet extends com.google.common.collect.HashBiMap.View<K, V, K> {
        final /* synthetic */ com.google.common.collect.HashBiMap this$0;

        KeySet(com.google.common.collect.HashBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.HashBiMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.HashBiMap.View
        K forEntry(int r2) {
                r1 = this;
                com.google.common.collect.HashBiMap r0 = r1.this$0
                K[] r0 = r0.keys
                r2 = r0[r2]
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                int r0 = com.google.common.collect.Hashing.smearedHash(r3)
                com.google.common.collect.HashBiMap r1 = r2.this$0
                int r3 = r1.findEntryByKey(r3, r0)
                r1 = -1
                if (r3 == r1) goto L14
                com.google.common.collect.HashBiMap r1 = r2.this$0
                r1.removeEntryKeyHashKnown(r3, r0)
                r3 = 1
                return r3
            L14:
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ValueSet extends com.google.common.collect.HashBiMap.View<K, V, V> {
        final /* synthetic */ com.google.common.collect.HashBiMap this$0;

        ValueSet(com.google.common.collect.HashBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.HashBiMap r0 = r1.this$0
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // com.google.common.collect.HashBiMap.View
        V forEntry(int r2) {
                r1 = this;
                com.google.common.collect.HashBiMap r0 = r1.this$0
                V[] r0 = r0.values
                r2 = r0[r2]
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                int r0 = com.google.common.collect.Hashing.smearedHash(r3)
                com.google.common.collect.HashBiMap r1 = r2.this$0
                int r3 = r1.findEntryByValue(r3, r0)
                r1 = -1
                if (r3 == r1) goto L14
                com.google.common.collect.HashBiMap r1 = r2.this$0
                r1.removeEntryValueHashKnown(r3, r0)
                r3 = 1
                return r3
            L14:
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class View<K, V, T> extends java.util.AbstractSet<T> {
        final com.google.common.collect.HashBiMap<K, V> biMap;


        View(com.google.common.collect.HashBiMap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.biMap = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.biMap
                r0.clear()
                return
        }

        abstract T forEntry(int r1);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<T> iterator() {
                r1 = this;
                com.google.common.collect.HashBiMap$View$1 r0 = new com.google.common.collect.HashBiMap$View$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.HashBiMap<K, V> r0 = r1.biMap
                int r0 = r0.size
                return r0
        }
    }

    private HashBiMap(int r1) {
            r0 = this;
            r0.<init>()
            r0.init(r1)
            return
    }

    static /* synthetic */ int access$000(com.google.common.collect.HashBiMap r0) {
            int r0 = r0.firstInInsertionOrder
            return r0
    }

    static /* synthetic */ int[] access$100(com.google.common.collect.HashBiMap r0) {
            int[] r0 = r0.nextInInsertionOrder
            return r0
    }

    static /* synthetic */ void access$200(com.google.common.collect.HashBiMap r0, int r1, java.lang.Object r2, boolean r3) {
            r0.replaceValueInEntry(r1, r2, r3)
            return
    }

    static /* synthetic */ com.google.common.collect.BiMap access$302(com.google.common.collect.HashBiMap r0, com.google.common.collect.BiMap r1) {
            r0.inverse = r1
            return r1
    }

    static /* synthetic */ void access$400(com.google.common.collect.HashBiMap r0, int r1, java.lang.Object r2, boolean r3) {
            r0.replaceKeyInEntry(r1, r2, r3)
            return
    }

    private int bucket(int r2) {
            r1 = this;
            int[] r0 = r1.hashTableKToV
            int r0 = r0.length
            int r0 = r0 + (-1)
            r2 = r2 & r0
            return r2
    }

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create() {
            r0 = 16
            com.google.common.collect.HashBiMap r0 = create(r0)
            return r0
    }

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create(int r1) {
            com.google.common.collect.HashBiMap r0 = new com.google.common.collect.HashBiMap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.collect.HashBiMap<K, V> create(java.util.Map<? extends K, ? extends V> r1) {
            int r0 = r1.size()
            com.google.common.collect.HashBiMap r0 = create(r0)
            r0.putAll(r1)
            return r0
    }

    private static int[] createFilledWithAbsent(int r1) {
            int[] r1 = new int[r1]
            r0 = -1
            java.util.Arrays.fill(r1, r0)
            return r1
    }

    private void deleteFromTableKToV(int r6, int r7) {
            r5 = this;
            r0 = -1
            if (r6 == r0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            com.google.common.base.Preconditions.checkArgument(r1)
            int r7 = r5.bucket(r7)
            int[] r1 = r5.hashTableKToV
            r2 = r1[r7]
            if (r2 != r6) goto L1c
            int[] r2 = r5.nextInBucketKToV
            r3 = r2[r6]
            r1[r7] = r3
            r2[r6] = r0
            return
        L1c:
            int[] r7 = r5.nextInBucketKToV
            r7 = r7[r2]
        L20:
            r4 = r2
            r2 = r7
            r7 = r4
            if (r2 == r0) goto L35
            if (r2 != r6) goto L30
            int[] r1 = r5.nextInBucketKToV
            r2 = r1[r6]
            r1[r7] = r2
            r1[r6] = r0
            return
        L30:
            int[] r7 = r5.nextInBucketKToV
            r7 = r7[r2]
            goto L20
        L35:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected to find entry with key "
            r0.append(r1)
            K[] r1 = r5.keys
            r6 = r1[r6]
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }

    private void deleteFromTableVToK(int r6, int r7) {
            r5 = this;
            r0 = -1
            if (r6 == r0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            com.google.common.base.Preconditions.checkArgument(r1)
            int r7 = r5.bucket(r7)
            int[] r1 = r5.hashTableVToK
            r2 = r1[r7]
            if (r2 != r6) goto L1c
            int[] r2 = r5.nextInBucketVToK
            r3 = r2[r6]
            r1[r7] = r3
            r2[r6] = r0
            return
        L1c:
            int[] r7 = r5.nextInBucketVToK
            r7 = r7[r2]
        L20:
            r4 = r2
            r2 = r7
            r7 = r4
            if (r2 == r0) goto L35
            if (r2 != r6) goto L30
            int[] r1 = r5.nextInBucketVToK
            r2 = r1[r6]
            r1[r7] = r2
            r1[r6] = r0
            return
        L30:
            int[] r7 = r5.nextInBucketVToK
            r7 = r7[r2]
            goto L20
        L35:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected to find entry with value "
            r0.append(r1)
            V[] r1 = r5.values
            r6 = r1[r6]
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }

    private void ensureCapacity(int r5) {
            r4 = this;
            int[] r0 = r4.nextInBucketKToV
            int r1 = r0.length
            if (r1 >= r5) goto L3a
            int r0 = r0.length
            int r0 = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(r0, r5)
            K[] r1 = r4.keys
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.keys = r1
            V[] r1 = r4.values
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.values = r1
            int[] r1 = r4.nextInBucketKToV
            int[] r1 = expandAndFillWithAbsent(r1, r0)
            r4.nextInBucketKToV = r1
            int[] r1 = r4.nextInBucketVToK
            int[] r1 = expandAndFillWithAbsent(r1, r0)
            r4.nextInBucketVToK = r1
            int[] r1 = r4.prevInInsertionOrder
            int[] r1 = expandAndFillWithAbsent(r1, r0)
            r4.prevInInsertionOrder = r1
            int[] r1 = r4.nextInInsertionOrder
            int[] r0 = expandAndFillWithAbsent(r1, r0)
            r4.nextInInsertionOrder = r0
        L3a:
            int[] r0 = r4.hashTableKToV
            int r0 = r0.length
            if (r0 >= r5) goto L85
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = com.google.common.collect.Hashing.closedTableSize(r5, r0)
            int[] r0 = createFilledWithAbsent(r5)
            r4.hashTableKToV = r0
            int[] r5 = createFilledWithAbsent(r5)
            r4.hashTableVToK = r5
            r5 = 0
        L52:
            int r0 = r4.size
            if (r5 >= r0) goto L85
            K[] r0 = r4.keys
            r0 = r0[r5]
            int r0 = com.google.common.collect.Hashing.smearedHash(r0)
            int r0 = r4.bucket(r0)
            int[] r1 = r4.nextInBucketKToV
            int[] r2 = r4.hashTableKToV
            r3 = r2[r0]
            r1[r5] = r3
            r2[r0] = r5
            V[] r0 = r4.values
            r0 = r0[r5]
            int r0 = com.google.common.collect.Hashing.smearedHash(r0)
            int r0 = r4.bucket(r0)
            int[] r1 = r4.nextInBucketVToK
            int[] r2 = r4.hashTableVToK
            r3 = r2[r0]
            r1[r5] = r3
            r2[r0] = r5
            int r5 = r5 + 1
            goto L52
        L85:
            return
    }

    private static int[] expandAndFillWithAbsent(int[] r2, int r3) {
            int r0 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r3)
            r1 = -1
            java.util.Arrays.fill(r2, r0, r3, r1)
            return r2
    }

    private void insertIntoTableKToV(int r4, int r5) {
            r3 = this;
            r0 = -1
            if (r4 == r0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            com.google.common.base.Preconditions.checkArgument(r0)
            int r5 = r3.bucket(r5)
            int[] r0 = r3.nextInBucketKToV
            int[] r1 = r3.hashTableKToV
            r2 = r1[r5]
            r0[r4] = r2
            r1[r5] = r4
            return
    }

    private void insertIntoTableVToK(int r4, int r5) {
            r3 = this;
            r0 = -1
            if (r4 == r0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            com.google.common.base.Preconditions.checkArgument(r0)
            int r5 = r3.bucket(r5)
            int[] r0 = r3.nextInBucketVToK
            int[] r1 = r3.hashTableVToK
            r2 = r1[r5]
            r0[r4] = r2
            r1[r5] = r4
            return
    }

    private void moveEntryToIndex(int r6, int r7) {
            r5 = this;
            if (r6 != r7) goto L3
            return
        L3:
            int[] r0 = r5.prevInInsertionOrder
            r0 = r0[r6]
            int[] r1 = r5.nextInInsertionOrder
            r1 = r1[r6]
            r5.setSucceeds(r0, r7)
            r5.setSucceeds(r7, r1)
            K[] r0 = r5.keys
            r1 = r0[r6]
            V[] r2 = r5.values
            r3 = r2[r6]
            r0[r7] = r1
            r2[r7] = r3
            int r0 = com.google.common.collect.Hashing.smearedHash(r1)
            int r0 = r5.bucket(r0)
            int[] r1 = r5.hashTableKToV
            r2 = r1[r0]
            if (r2 != r6) goto L2e
            r1[r0] = r7
            goto L3b
        L2e:
            int[] r0 = r5.nextInBucketKToV
            r0 = r0[r2]
        L32:
            r4 = r2
            r2 = r0
            r0 = r4
            if (r2 != r6) goto L70
            int[] r1 = r5.nextInBucketKToV
            r1[r0] = r7
        L3b:
            int[] r0 = r5.nextInBucketKToV
            r1 = r0[r6]
            r0[r7] = r1
            r1 = -1
            r0[r6] = r1
            int r0 = com.google.common.collect.Hashing.smearedHash(r3)
            int r0 = r5.bucket(r0)
            int[] r2 = r5.hashTableVToK
            r3 = r2[r0]
            if (r3 != r6) goto L55
            r2[r0] = r7
            goto L62
        L55:
            int[] r0 = r5.nextInBucketVToK
            r0 = r0[r3]
        L59:
            r4 = r3
            r3 = r0
            r0 = r4
            if (r3 != r6) goto L6b
            int[] r2 = r5.nextInBucketVToK
            r2[r0] = r7
        L62:
            int[] r0 = r5.nextInBucketVToK
            r2 = r0[r6]
            r0[r7] = r2
            r0[r6] = r1
            return
        L6b:
            int[] r0 = r5.nextInBucketVToK
            r0 = r0[r3]
            goto L59
        L70:
            int[] r0 = r5.nextInBucketKToV
            r0 = r0[r2]
            goto L32
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            int r0 = com.google.common.collect.Serialization.readCount(r3)
            r1 = 16
            r2.init(r1)
            com.google.common.collect.Serialization.populateMap(r2, r3, r0)
            return
    }

    private void removeEntry(int r3, int r4, int r5) {
            r2 = this;
            r0 = -1
            r1 = 1
            if (r3 == r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.common.base.Preconditions.checkArgument(r0)
            r2.deleteFromTableKToV(r3, r4)
            r2.deleteFromTableVToK(r3, r5)
            int[] r4 = r2.prevInInsertionOrder
            r4 = r4[r3]
            int[] r5 = r2.nextInInsertionOrder
            r5 = r5[r3]
            r2.setSucceeds(r4, r5)
            int r4 = r2.size
            int r4 = r4 - r1
            r2.moveEntryToIndex(r4, r3)
            K[] r3 = r2.keys
            int r4 = r2.size
            int r5 = r4 + (-1)
            r0 = 0
            r3[r5] = r0
            V[] r3 = r2.values
            int r5 = r4 + (-1)
            r3[r5] = r0
            int r4 = r4 - r1
            r2.size = r4
            int r3 = r2.modCount
            int r3 = r3 + r1
            r2.modCount = r3
            return
    }

    private void replaceKeyInEntry(int r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r6, boolean r7) {
            r4 = this;
            r0 = -1
            if (r5 == r0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            com.google.common.base.Preconditions.checkArgument(r1)
            int r1 = com.google.common.collect.Hashing.smearedHash(r6)
            int r2 = r4.findEntryByKey(r6, r1)
            int r3 = r4.lastInInsertionOrder
            if (r2 == r0) goto L3f
            if (r7 == 0) goto L28
            int[] r7 = r4.prevInInsertionOrder
            r3 = r7[r2]
            int[] r7 = r4.nextInInsertionOrder
            r7 = r7[r2]
            r4.removeEntryKeyHashKnown(r2, r1)
            int r0 = r4.size
            if (r5 != r0) goto L40
            r5 = r2
            goto L40
        L28:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Key already present in map: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L3f:
            r7 = -2
        L40:
            if (r3 != r5) goto L47
            int[] r0 = r4.prevInInsertionOrder
            r3 = r0[r5]
            goto L4c
        L47:
            int r0 = r4.size
            if (r3 != r0) goto L4c
            r3 = r2
        L4c:
            if (r7 != r5) goto L53
            int[] r7 = r4.nextInInsertionOrder
            r2 = r7[r5]
            goto L59
        L53:
            int r0 = r4.size
            if (r7 != r0) goto L58
            goto L59
        L58:
            r2 = r7
        L59:
            int[] r7 = r4.prevInInsertionOrder
            r7 = r7[r5]
            int[] r0 = r4.nextInInsertionOrder
            r0 = r0[r5]
            r4.setSucceeds(r7, r0)
            K[] r7 = r4.keys
            r7 = r7[r5]
            int r7 = com.google.common.collect.Hashing.smearedHash(r7)
            r4.deleteFromTableKToV(r5, r7)
            K[] r7 = r4.keys
            r7[r5] = r6
            int r6 = com.google.common.collect.Hashing.smearedHash(r6)
            r4.insertIntoTableKToV(r5, r6)
            r4.setSucceeds(r3, r5)
            r4.setSucceeds(r5, r2)
            return
    }

    private void replaceValueInEntry(int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r5, boolean r6) {
            r3 = this;
            r0 = -1
            if (r4 == r0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            com.google.common.base.Preconditions.checkArgument(r1)
            int r1 = com.google.common.collect.Hashing.smearedHash(r5)
            int r2 = r3.findEntryByValue(r5, r1)
            if (r2 == r0) goto L35
            if (r6 == 0) goto L1e
            r3.removeEntryValueHashKnown(r2, r1)
            int r6 = r3.size
            if (r4 != r6) goto L35
            r4 = r2
            goto L35
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Value already present in map: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L35:
            V[] r6 = r3.values
            r6 = r6[r4]
            int r6 = com.google.common.collect.Hashing.smearedHash(r6)
            r3.deleteFromTableVToK(r4, r6)
            V[] r6 = r3.values
            r6[r4] = r5
            r3.insertIntoTableVToK(r4, r1)
            return
    }

    private void setSucceeds(int r3, int r4) {
            r2 = this;
            r0 = -2
            if (r3 != r0) goto L6
            r2.firstInInsertionOrder = r4
            goto La
        L6:
            int[] r1 = r2.nextInInsertionOrder
            r1[r3] = r4
        La:
            if (r4 != r0) goto Lf
            r2.lastInInsertionOrder = r3
            return
        Lf:
            int[] r0 = r2.prevInInsertionOrder
            r0[r4] = r3
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r1) throws java.io.IOException {
            r0 = this;
            r1.defaultWriteObject()
            com.google.common.collect.Serialization.writeMap(r0, r1)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r4 = this;
            K[] r0 = r4.keys
            int r1 = r4.size
            r2 = 0
            r3 = 0
            java.util.Arrays.fill(r0, r2, r1, r3)
            V[] r0 = r4.values
            int r1 = r4.size
            java.util.Arrays.fill(r0, r2, r1, r3)
            int[] r0 = r4.hashTableKToV
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r4.hashTableVToK
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r4.nextInBucketKToV
            int r3 = r4.size
            java.util.Arrays.fill(r0, r2, r3, r1)
            int[] r0 = r4.nextInBucketVToK
            int r3 = r4.size
            java.util.Arrays.fill(r0, r2, r3, r1)
            int[] r0 = r4.prevInInsertionOrder
            int r3 = r4.size
            java.util.Arrays.fill(r0, r2, r3, r1)
            int[] r0 = r4.nextInInsertionOrder
            int r3 = r4.size
            java.util.Arrays.fill(r0, r2, r3, r1)
            r4.size = r2
            r0 = -2
            r4.firstInInsertionOrder = r0
            r4.lastInInsertionOrder = r0
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.findEntryByKey(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.findEntryByValue(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 != 0) goto Lb
            com.google.common.collect.HashBiMap$EntrySet r0 = new com.google.common.collect.HashBiMap$EntrySet
            r0.<init>(r1)
            r1.entrySet = r0
        Lb:
            return r0
    }

    int findEntry(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, int r2, int[] r3, int[] r4, java.lang.Object[] r5) {
            r0 = this;
            int r2 = r0.bucket(r2)
            r2 = r3[r2]
        L6:
            r3 = -1
            if (r2 == r3) goto L15
            r3 = r5[r2]
            boolean r3 = com.google.common.base.Objects.equal(r3, r1)
            if (r3 == 0) goto L12
            return r2
        L12:
            r2 = r4[r2]
            goto L6
        L15:
            return r3
    }

    int findEntryByKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r2)
            int r2 = r1.findEntryByKey(r2, r0)
            return r2
    }

    int findEntryByKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7, int r8) {
            r6 = this;
            int[] r3 = r6.hashTableKToV
            int[] r4 = r6.nextInBucketKToV
            K[] r5 = r6.keys
            r0 = r6
            r1 = r7
            r2 = r8
            int r7 = r0.findEntry(r1, r2, r3, r4, r5)
            return r7
    }

    int findEntryByValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r2)
            int r2 = r1.findEntryByValue(r2, r0)
            return r2
    }

    int findEntryByValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7, int r8) {
            r6 = this;
            int[] r3 = r6.hashTableVToK
            int[] r4 = r6.nextInBucketVToK
            V[] r5 = r6.values
            r0 = r6
            r1 = r7
            r2 = r8
            int r7 = r0.findEntry(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V forcePut(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.put(r2, r3, r0)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.findEntryByKey(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            V[] r0 = r1.values
            r2 = r0[r2]
            return r2
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    K getInverse(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.findEntryByValue(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            K[] r0 = r1.keys
            r2 = r0[r2]
            return r2
    }

    void init(int r3) {
            r2 = this;
            java.lang.String r0 = "expectedSize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = com.google.common.collect.Hashing.closedTableSize(r3, r0)
            r1 = 0
            r2.size = r1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2.keys = r1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2.values = r1
            int[] r1 = createFilledWithAbsent(r0)
            r2.hashTableKToV = r1
            int[] r0 = createFilledWithAbsent(r0)
            r2.hashTableVToK = r0
            int[] r0 = createFilledWithAbsent(r3)
            r2.nextInBucketKToV = r0
            int[] r0 = createFilledWithAbsent(r3)
            r2.nextInBucketVToK = r0
            r0 = -2
            r2.firstInInsertionOrder = r0
            r2.lastInInsertionOrder = r0
            int[] r0 = createFilledWithAbsent(r3)
            r2.prevInInsertionOrder = r0
            int[] r3 = createFilledWithAbsent(r3)
            r2.nextInInsertionOrder = r3
            return
    }

    @Override // com.google.common.collect.BiMap
    public com.google.common.collect.BiMap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.BiMap<V, K> r0 = r1.inverse
            if (r0 != 0) goto Lb
            com.google.common.collect.HashBiMap$Inverse r0 = new com.google.common.collect.HashBiMap$Inverse
            r0.<init>(r1)
            r1.inverse = r0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set<K> r0 = r1.keySet
            if (r0 != 0) goto Lb
            com.google.common.collect.HashBiMap$KeySet r0 = new com.google.common.collect.HashBiMap$KeySet
            r0.<init>(r1)
            r1.keySet = r0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.put(r2, r3, r0)
            return r2
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r7, boolean r8) {
            r5 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r6)
            int r1 = r5.findEntryByKey(r6, r0)
            r2 = -1
            if (r1 == r2) goto L1a
            V[] r6 = r5.values
            r6 = r6[r1]
            boolean r0 = com.google.common.base.Objects.equal(r6, r7)
            if (r0 == 0) goto L16
            return r7
        L16:
            r5.replaceValueInEntry(r1, r7, r8)
            return r6
        L1a:
            int r1 = com.google.common.collect.Hashing.smearedHash(r7)
            int r3 = r5.findEntryByValue(r7, r1)
            r4 = 1
            if (r8 == 0) goto L2b
            if (r3 == r2) goto L35
            r5.removeEntryValueHashKnown(r3, r1)
            goto L35
        L2b:
            if (r3 != r2) goto L2f
            r8 = 1
            goto L30
        L2f:
            r8 = 0
        L30:
            java.lang.String r2 = "Value already present: %s"
            com.google.common.base.Preconditions.checkArgument(r8, r2, r7)
        L35:
            int r8 = r5.size
            int r8 = r8 + r4
            r5.ensureCapacity(r8)
            K[] r8 = r5.keys
            int r2 = r5.size
            r8[r2] = r6
            V[] r6 = r5.values
            r6[r2] = r7
            r5.insertIntoTableKToV(r2, r0)
            int r6 = r5.size
            r5.insertIntoTableVToK(r6, r1)
            int r6 = r5.lastInInsertionOrder
            int r7 = r5.size
            r5.setSucceeds(r6, r7)
            int r6 = r5.size
            r7 = -2
            r5.setSucceeds(r6, r7)
            int r6 = r5.size
            int r6 = r6 + r4
            r5.size = r6
            int r6 = r5.modCount
            int r6 = r6 + r4
            r5.modCount = r6
            r6 = 0
            return r6
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    K putInverse(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r7, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r8, boolean r9) {
            r6 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r7)
            int r1 = r6.findEntryByValue(r7, r0)
            r2 = -1
            if (r1 == r2) goto L1a
            K[] r7 = r6.keys
            r7 = r7[r1]
            boolean r0 = com.google.common.base.Objects.equal(r7, r8)
            if (r0 == 0) goto L16
            return r8
        L16:
            r6.replaceKeyInEntry(r1, r8, r9)
            return r7
        L1a:
            int r1 = r6.lastInInsertionOrder
            int r3 = com.google.common.collect.Hashing.smearedHash(r8)
            int r4 = r6.findEntryByKey(r8, r3)
            r5 = 1
            if (r9 == 0) goto L31
            if (r4 == r2) goto L3b
            int[] r9 = r6.prevInInsertionOrder
            r1 = r9[r4]
            r6.removeEntryKeyHashKnown(r4, r3)
            goto L3b
        L31:
            if (r4 != r2) goto L35
            r9 = 1
            goto L36
        L35:
            r9 = 0
        L36:
            java.lang.String r2 = "Key already present: %s"
            com.google.common.base.Preconditions.checkArgument(r9, r2, r8)
        L3b:
            int r9 = r6.size
            int r9 = r9 + r5
            r6.ensureCapacity(r9)
            K[] r9 = r6.keys
            int r2 = r6.size
            r9[r2] = r8
            V[] r8 = r6.values
            r8[r2] = r7
            r6.insertIntoTableKToV(r2, r3)
            int r7 = r6.size
            r6.insertIntoTableVToK(r7, r0)
            r7 = -2
            if (r1 != r7) goto L59
            int r7 = r6.firstInInsertionOrder
            goto L5d
        L59:
            int[] r7 = r6.nextInInsertionOrder
            r7 = r7[r1]
        L5d:
            int r8 = r6.size
            r6.setSucceeds(r1, r8)
            int r8 = r6.size
            r6.setSucceeds(r8, r7)
            int r7 = r6.size
            int r7 = r7 + r5
            r6.size = r7
            int r7 = r6.modCount
            int r7 = r7 + r5
            r6.modCount = r7
            r7 = 0
            return r7
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r3)
            int r3 = r2.findEntryByKey(r3, r0)
            r1 = -1
            if (r3 != r1) goto Ld
            r3 = 0
            return r3
        Ld:
            V[] r1 = r2.values
            r1 = r1[r3]
            r2.removeEntryKeyHashKnown(r3, r0)
            return r1
    }

    void removeEntry(int r2) {
            r1 = this;
            K[] r0 = r1.keys
            r0 = r0[r2]
            int r0 = com.google.common.collect.Hashing.smearedHash(r0)
            r1.removeEntryKeyHashKnown(r2, r0)
            return
    }

    void removeEntryKeyHashKnown(int r2, int r3) {
            r1 = this;
            V[] r0 = r1.values
            r0 = r0[r2]
            int r0 = com.google.common.collect.Hashing.smearedHash(r0)
            r1.removeEntry(r2, r3, r0)
            return
    }

    void removeEntryValueHashKnown(int r2, int r3) {
            r1 = this;
            K[] r0 = r1.keys
            r0 = r0[r2]
            int r0 = com.google.common.collect.Hashing.smearedHash(r0)
            r1.removeEntry(r2, r0, r3)
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    K removeInverse(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            int r0 = com.google.common.collect.Hashing.smearedHash(r3)
            int r3 = r2.findEntryByValue(r3, r0)
            r1 = -1
            if (r3 != r1) goto Ld
            r3 = 0
            return r3
        Ld:
            K[] r1 = r2.keys
            r1 = r1[r3]
            r2.removeEntryValueHashKnown(r3, r0)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Set r0 = r1.values()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public java.util.Set<V> values() {
            r1 = this;
            java.util.Set<V> r0 = r1.valueSet
            if (r0 != 0) goto Lb
            com.google.common.collect.HashBiMap$ValueSet r0 = new com.google.common.collect.HashBiMap$ValueSet
            r0.<init>(r1)
            r1.valueSet = r0
        Lb:
            return r0
    }
}
