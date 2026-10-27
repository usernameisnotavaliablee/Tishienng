package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractBiMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Map<K, V> delegate;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

    @com.google.j2objc.annotations.RetainedWith
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient com.google.common.collect.AbstractBiMap<V, K> inverse;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<K> keySet;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<V> valueSet;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class BiMapEntry extends com.google.common.collect.ForwardingMapEntry<K, V> {
        private final java.util.Map.Entry<K, V> delegate;
        final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;

        BiMapEntry(com.google.common.collect.AbstractBiMap r1, java.util.Map.Entry<K, V> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.delegate = r2
                return
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Map$Entry r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        protected java.util.Map.Entry<K, V> delegate() {
                r1 = this;
                java.util.Map$Entry<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V r6) {
                r5 = this;
                com.google.common.collect.AbstractBiMap r0 = r5.this$0
                r0.checkValue(r6)
                com.google.common.collect.AbstractBiMap r0 = r5.this$0
                java.util.Set r0 = r0.entrySet()
                boolean r0 = r0.contains(r5)
                java.lang.String r1 = "entry no longer in map"
                com.google.common.base.Preconditions.checkState(r0, r1)
                java.lang.Object r0 = r5.getValue()
                boolean r0 = com.google.common.base.Objects.equal(r6, r0)
                if (r0 == 0) goto L1f
                return r6
            L1f:
                com.google.common.collect.AbstractBiMap r0 = r5.this$0
                boolean r0 = r0.containsValue(r6)
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "value already present: %s"
                com.google.common.base.Preconditions.checkArgument(r0, r3, r6)
                java.util.Map$Entry<K, V> r0 = r5.delegate
                java.lang.Object r0 = r0.setValue(r6)
                com.google.common.collect.AbstractBiMap r3 = r5.this$0
                java.lang.Object r4 = r5.getKey()
                java.lang.Object r3 = r3.get(r4)
                boolean r3 = com.google.common.base.Objects.equal(r6, r3)
                com.google.common.base.Preconditions.checkState(r3, r1)
                com.google.common.collect.AbstractBiMap r1 = r5.this$0
                java.lang.Object r3 = r5.getKey()
                com.google.common.collect.AbstractBiMap.access$500(r1, r3, r2, r0, r6)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class EntrySet extends com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>> {
        final java.util.Set<java.util.Map.Entry<K, V>> esDelegate;
        final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;

        private EntrySet(com.google.common.collect.AbstractBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.Map r1 = com.google.common.collect.AbstractBiMap.access$100(r1)
                java.util.Set r1 = r1.entrySet()
                r0.esDelegate = r1
                return
        }

        /* synthetic */ EntrySet(com.google.common.collect.AbstractBiMap r1, com.google.common.collect.AbstractBiMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                boolean r2 = com.google.common.collect.Maps.containsEntryImpl(r0, r2)
                return r2
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = r0.standardContainsAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.Set<java.util.Map.Entry<K, V>> delegate() {
                r1 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.esDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                java.util.Iterator r0 = r0.entrySetIterator()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.esDelegate
                boolean r0 = r0.contains(r3)
                if (r0 != 0) goto La
                r3 = 0
                return r3
            La:
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.AbstractBiMap r0 = r2.this$0
                com.google.common.collect.AbstractBiMap<V, K> r0 = r0.inverse
                java.util.Map r0 = com.google.common.collect.AbstractBiMap.access$100(r0)
                java.lang.Object r1 = r3.getValue()
                r0.remove(r1)
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.esDelegate
                r0.remove(r3)
                r3 = 1
                return r3
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = r0.standardRemoveAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = r0.standardRetainAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.Object[] r0 = r1.standardToArray()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.Object[] r1 = r0.standardToArray(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Inverse<K, V> extends com.google.common.collect.AbstractBiMap<K, V> {

        @com.google.common.annotations.GwtIncompatible
        private static final long serialVersionUID = 0;

        Inverse(java.util.Map<K, V> r2, com.google.common.collect.AbstractBiMap<V, K> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void readObject(java.io.ObjectInputStream r1) throws java.io.IOException, java.lang.ClassNotFoundException {
                r0 = this;
                r1.defaultReadObject()
                java.lang.Object r1 = r1.readObject()
                com.google.common.collect.AbstractBiMap r1 = (com.google.common.collect.AbstractBiMap) r1
                r0.setInverse(r1)
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
                r1 = this;
                r2.defaultWriteObject()
                com.google.common.collect.BiMap r0 = r1.inverse()
                r2.writeObject(r0)
                return
        }

        @Override // com.google.common.collect.AbstractBiMap
        K checkKey(K r2) {
                r1 = this;
                com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
                java.lang.Object r2 = r0.checkValue(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractBiMap
        V checkValue(V r2) {
                r1 = this;
                com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
                java.lang.Object r2 = r0.checkKey(r2)
                return r2
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Map r0 = super.delegate()
                return r0
        }

        @com.google.common.annotations.GwtIncompatible
        java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.BiMap r0 = r1.inverse()
                com.google.common.collect.BiMap r0 = r0.inverse()
                return r0
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Collection values() {
                r1 = this;
                java.util.Set r0 = super.values()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class KeySet extends com.google.common.collect.ForwardingSet<K> {
        final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;

        private KeySet(com.google.common.collect.AbstractBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ KeySet(com.google.common.collect.AbstractBiMap r1, com.google.common.collect.AbstractBiMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.Set<K> delegate() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                java.util.Map r0 = com.google.common.collect.AbstractBiMap.access$100(r0)
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Iterator r0 = com.google.common.collect.Maps.keyIterator(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                com.google.common.collect.AbstractBiMap.access$200(r0, r2)
                r2 = 1
                return r2
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = r0.standardRemoveAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = r0.standardRetainAll(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ValueSet extends com.google.common.collect.ForwardingSet<V> {
        final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;
        final java.util.Set<V> valuesDelegate;

        private ValueSet(com.google.common.collect.AbstractBiMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.common.collect.AbstractBiMap<V, K> r1 = r1.inverse
                java.util.Set r1 = r1.keySet()
                r0.valuesDelegate = r1
                return
        }

        /* synthetic */ ValueSet(com.google.common.collect.AbstractBiMap r1, com.google.common.collect.AbstractBiMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.Set<V> delegate() {
                r1 = this;
                java.util.Set<V> r0 = r1.valuesDelegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<V> iterator() {
                r1 = this;
                com.google.common.collect.AbstractBiMap r0 = r1.this$0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Iterator r0 = com.google.common.collect.Maps.valueIterator(r0)
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.Object[] r0 = r1.standardToArray()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.Object[] r1 = r0.standardToArray(r1)
                return r1
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.standardToString()
                return r0
        }
    }

    private AbstractBiMap(java.util.Map<K, V> r1, com.google.common.collect.AbstractBiMap<V, K> r2) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            r0.inverse = r2
            return
    }

    /* synthetic */ AbstractBiMap(java.util.Map r1, com.google.common.collect.AbstractBiMap r2, com.google.common.collect.AbstractBiMap.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    AbstractBiMap(java.util.Map<K, V> r1, java.util.Map<V, K> r2) {
            r0 = this;
            r0.<init>()
            r0.setDelegates(r1, r2)
            return
    }

    static /* synthetic */ java.util.Map access$100(com.google.common.collect.AbstractBiMap r0) {
            java.util.Map<K, V> r0 = r0.delegate
            return r0
    }

    static /* synthetic */ java.lang.Object access$200(com.google.common.collect.AbstractBiMap r0, java.lang.Object r1) {
            java.lang.Object r0 = r0.removeFromBothMaps(r1)
            return r0
    }

    static /* synthetic */ void access$500(com.google.common.collect.AbstractBiMap r0, java.lang.Object r1, boolean r2, java.lang.Object r3, java.lang.Object r4) {
            r0.updateInverseMap(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$600(com.google.common.collect.AbstractBiMap r0, java.lang.Object r1) {
            r0.removeFromInverseMap(r1)
            return
    }

    private V putInBothMaps(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r4, boolean r5) {
            r2 = this;
            r2.checkKey(r3)
            r2.checkValue(r4)
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L17
            java.lang.Object r1 = r2.get(r3)
            boolean r1 = com.google.common.base.Objects.equal(r4, r1)
            if (r1 == 0) goto L17
            return r4
        L17:
            if (r5 == 0) goto L21
            com.google.common.collect.BiMap r5 = r2.inverse()
            r5.remove(r4)
            goto L2c
        L21:
            boolean r5 = r2.containsValue(r4)
            r5 = r5 ^ 1
            java.lang.String r1 = "value already present: %s"
            com.google.common.base.Preconditions.checkArgument(r5, r1, r4)
        L2c:
            java.util.Map<K, V> r5 = r2.delegate
            java.lang.Object r5 = r5.put(r3, r4)
            r2.updateInverseMap(r3, r0, r5, r4)
            return r5
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private V removeFromBothMaps(java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, V> r0 = r1.delegate
            java.lang.Object r2 = r0.remove(r2)
            r1.removeFromInverseMap(r2)
            return r2
    }

    private void removeFromInverseMap(V r2) {
            r1 = this;
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            java.util.Map<K, V> r0 = r0.delegate
            r0.remove(r2)
            return
    }

    private void updateInverseMap(K r1, boolean r2, V r3, V r4) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.removeFromInverseMap(r3)
        L5:
            com.google.common.collect.AbstractBiMap<V, K> r2 = r0.inverse
            java.util.Map<K, V> r2 = r2.delegate
            r2.put(r4, r1)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    K checkKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1) {
            r0 = this;
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    V checkValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
            r0 = this;
            return r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.delegate
            r0.clear()
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            java.util.Map<K, V> r0 = r0.delegate
            r0.clear()
            return
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected java.util.Map<K, V> delegate() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.entrySet
            if (r0 != 0) goto Lc
            com.google.common.collect.AbstractBiMap$EntrySet r0 = new com.google.common.collect.AbstractBiMap$EntrySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.entrySet = r0
        Lc:
            return r0
    }

    java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
            r2 = this;
            java.util.Map<K, V> r0 = r2.delegate
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.AbstractBiMap$1 r1 = new com.google.common.collect.AbstractBiMap$1
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V forcePut(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.putInBothMaps(r2, r3, r0)
            return r2
    }

    @Override // com.google.common.collect.BiMap
    public com.google.common.collect.BiMap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.AbstractBiMap<V, K> r0 = r1.inverse
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            java.util.Set<K> r0 = r2.keySet
            if (r0 != 0) goto Lc
            com.google.common.collect.AbstractBiMap$KeySet r0 = new com.google.common.collect.AbstractBiMap$KeySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.keySet = r0
        Lc:
            return r0
    }

    com.google.common.collect.AbstractBiMap<V, K> makeInverse(java.util.Map<V, K> r2) {
            r1 = this;
            com.google.common.collect.AbstractBiMap$Inverse r0 = new com.google.common.collect.AbstractBiMap$Inverse
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.putInBothMaps(r2, r3, r0)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L8
        L20:
            return
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r1.removeFromBothMaps(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    void setDelegates(java.util.Map<K, V> r4, java.util.Map<V, K> r5) {
            r3 = this;
            java.util.Map<K, V> r0 = r3.delegate
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.common.base.Preconditions.checkState(r0)
            com.google.common.collect.AbstractBiMap<V, K> r0 = r3.inverse
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.google.common.base.Preconditions.checkState(r0)
            boolean r0 = r4.isEmpty()
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r5.isEmpty()
            com.google.common.base.Preconditions.checkArgument(r0)
            if (r4 == r5) goto L27
            r1 = 1
        L27:
            com.google.common.base.Preconditions.checkArgument(r1)
            r3.delegate = r4
            com.google.common.collect.AbstractBiMap r4 = r3.makeInverse(r5)
            r3.inverse = r4
            return
    }

    void setInverse(com.google.common.collect.AbstractBiMap<V, K> r1) {
            r0 = this;
            r0.inverse = r1
            return
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.Set r0 = r1.values()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<V> values() {
            r2 = this;
            java.util.Set<V> r0 = r2.valueSet
            if (r0 != 0) goto Lc
            com.google.common.collect.AbstractBiMap$ValueSet r0 = new com.google.common.collect.AbstractBiMap$ValueSet
            r1 = 0
            r0.<init>(r2, r1)
            r2.valueSet = r0
        Lc:
            return r0
    }
}
