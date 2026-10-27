package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class FilteredKeyMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.FilteredMultimap<K, V> {
    final com.google.common.base.Predicate<? super K> keyPredicate;
    final com.google.common.collect.Multimap<K, V> unfiltered;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AddRejectingList<K, V> extends com.google.common.collect.ForwardingList<V> {
        final K key;

        AddRejectingList(K r1) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                return
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int r2, V r3) {
                r1 = this;
                r3 = 0
                com.google.common.base.Preconditions.checkPositionIndex(r2, r3)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "Key does not satisfy predicate: "
                r3.append(r0)
                K r0 = r1.key
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V r2) {
                r1 = this;
                r0 = 0
                r1.add(r0, r2)
                r2 = 1
                return r2
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public boolean addAll(int r2, java.util.Collection<? extends V> r3) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                r3 = 0
                com.google.common.base.Preconditions.checkPositionIndex(r2, r3)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "Key does not satisfy predicate: "
                r3.append(r0)
                K r0 = r1.key
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r2) {
                r1 = this;
                r0 = 0
                r1.addAll(r0, r2)
                r2 = 1
                return r2
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.List r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.List r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.List<V> delegate() {
                r1 = this;
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AddRejectingSet<K, V> extends com.google.common.collect.ForwardingSet<V> {
        final K key;

        AddRejectingSet(K r1) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V r3) {
                r2 = this;
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Key does not satisfy predicate: "
                r0.append(r1)
                K r1 = r2.key
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Key does not satisfy predicate: "
                r0.append(r1)
                K r1 = r2.key
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
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
                java.util.Set r0 = java.util.Collections.EMPTY_SET
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class Entries extends com.google.common.collect.ForwardingCollection<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.collect.FilteredKeyMultimap this$0;

        Entries(com.google.common.collect.FilteredKeyMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Collection r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.Collection<java.util.Map.Entry<K, V>> delegate() {
                r2 = this;
                com.google.common.collect.FilteredKeyMultimap r0 = r2.this$0
                com.google.common.collect.Multimap<K, V> r0 = r0.unfiltered
                java.util.Collection r0 = r0.entries()
                com.google.common.collect.FilteredKeyMultimap r1 = r2.this$0
                com.google.common.base.Predicate r1 = r1.entryPredicate()
                java.util.Collection r0 = com.google.common.collect.Collections2.filter(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L33
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.FilteredKeyMultimap r0 = r2.this$0
                com.google.common.collect.Multimap<K, V> r0 = r0.unfiltered
                java.lang.Object r1 = r3.getKey()
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L33
                com.google.common.collect.FilteredKeyMultimap r0 = r2.this$0
                com.google.common.base.Predicate<? super K> r0 = r0.keyPredicate
                java.lang.Object r1 = r3.getKey()
                boolean r0 = r0.apply(r1)
                if (r0 == 0) goto L33
                com.google.common.collect.FilteredKeyMultimap r0 = r2.this$0
                com.google.common.collect.Multimap<K, V> r0 = r0.unfiltered
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                boolean r3 = r0.remove(r1, r3)
                return r3
            L33:
                r3 = 0
                return r3
        }
    }

    FilteredKeyMultimap(com.google.common.collect.Multimap<K, V> r1, com.google.common.base.Predicate<? super K> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Multimap r1 = (com.google.common.collect.Multimap) r1
            r0.unfiltered = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
            r0.keyPredicate = r1
            return
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
            r1 = this;
            java.util.Set r0 = r1.keySet()
            r0.clear()
            return
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lf
            com.google.common.base.Predicate<? super K> r0 = r1.keyPredicate
            boolean r2 = r0.apply(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
            r2 = this;
            com.google.common.collect.Multimap<K, V> r0 = r2.unfiltered
            java.util.Map r0 = r0.asMap()
            com.google.common.base.Predicate<? super K> r1 = r2.keyPredicate
            java.util.Map r0 = com.google.common.collect.Maps.filterKeys(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
            r1 = this;
            com.google.common.collect.FilteredKeyMultimap$Entries r0 = new com.google.common.collect.FilteredKeyMultimap$Entries
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
            r2 = this;
            com.google.common.collect.Multimap<K, V> r0 = r2.unfiltered
            java.util.Set r0 = r0.keySet()
            com.google.common.base.Predicate<? super K> r1 = r2.keyPredicate
            java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
            r2 = this;
            com.google.common.collect.Multimap<K, V> r0 = r2.unfiltered
            com.google.common.collect.Multiset r0 = r0.keys()
            com.google.common.base.Predicate<? super K> r1 = r2.keyPredicate
            com.google.common.collect.Multiset r0 = com.google.common.collect.Multisets.filter(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<V> createValues() {
            r1 = this;
            com.google.common.collect.FilteredMultimapValues r0 = new com.google.common.collect.FilteredMultimapValues
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.FilteredMultimap
    public com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate() {
            r1 = this;
            com.google.common.base.Predicate<? super K> r0 = r1.keyPredicate
            com.google.common.base.Predicate r0 = com.google.common.collect.Maps.keyPredicateOnEntries(r0)
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> get(K r2) {
            r1 = this;
            com.google.common.base.Predicate<? super K> r0 = r1.keyPredicate
            boolean r0 = r0.apply(r2)
            if (r0 == 0) goto Lf
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            java.util.Collection r2 = r0.get(r2)
            return r2
        Lf:
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            boolean r0 = r0 instanceof com.google.common.collect.SetMultimap
            if (r0 == 0) goto L1b
            com.google.common.collect.FilteredKeyMultimap$AddRejectingSet r0 = new com.google.common.collect.FilteredKeyMultimap$AddRejectingSet
            r0.<init>(r2)
            return r0
        L1b:
            com.google.common.collect.FilteredKeyMultimap$AddRejectingList r0 = new com.google.common.collect.FilteredKeyMultimap$AddRejectingList
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> removeAll(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto Ld
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            java.util.Collection r2 = r0.removeAll(r2)
            return r2
        Ld:
            java.util.Collection r2 = r1.unmodifiableEmptyCollection()
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
            r3 = this;
            java.util.Map r0 = r3.asMap()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            int r1 = r1 + r2
            goto Ld
        L1f:
            return r1
    }

    public com.google.common.collect.Multimap<K, V> unfiltered() {
            r1 = this;
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            return r0
    }

    java.util.Collection<V> unmodifiableEmptyCollection() {
            r1 = this;
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            boolean r0 = r0 instanceof com.google.common.collect.SetMultimap
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            return r0
        Lb:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
    }
}
