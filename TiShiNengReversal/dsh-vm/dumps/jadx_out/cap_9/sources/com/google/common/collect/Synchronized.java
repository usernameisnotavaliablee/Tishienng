package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Synchronized {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.Synchronized$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedAsMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, java.util.Collection<V>> {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> asMapEntrySet;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Collection<java.util.Collection<V>> asMapValues;

        SynchronizedAsMap(java.util.Map<K, java.util.Collection<V>> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(java.lang.Object r2) {
                r1 = this;
                java.util.Collection r0 = r1.values()
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> entrySet() {
                r4 = this;
                java.lang.Object r0 = r4.mutex
                monitor-enter(r0)
                java.util.Set<java.util.Map$Entry<K, java.util.Collection<V>>> r1 = r4.asMapEntrySet     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                com.google.common.collect.Synchronized$SynchronizedAsMapEntries r1 = new com.google.common.collect.Synchronized$SynchronizedAsMapEntries     // Catch: java.lang.Throwable -> L19
                java.util.Map r2 = r4.delegate()     // Catch: java.lang.Throwable -> L19
                java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r4.mutex     // Catch: java.lang.Throwable -> L19
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L19
                r4.asMapEntrySet = r1     // Catch: java.lang.Throwable -> L19
                goto L1b
            L19:
                r1 = move-exception
                goto L1f
            L1b:
                java.util.Set<java.util.Map$Entry<K, java.util.Collection<V>>> r1 = r4.asMapEntrySet     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r1) {
                r0 = this;
                java.util.Collection r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Collection<V> get(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.lang.Object r3 = super.get(r3)     // Catch: java.lang.Throwable -> L15
                java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L15
                if (r3 != 0) goto Ld
                r3 = 0
                goto L13
            Ld:
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L15
                java.util.Collection r3 = com.google.common.collect.Synchronized.access$400(r3, r1)     // Catch: java.lang.Throwable -> L15
            L13:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return r3
            L15:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Collection<java.util.Collection<V>> values() {
                r4 = this;
                java.lang.Object r0 = r4.mutex
                monitor-enter(r0)
                java.util.Collection<java.util.Collection<V>> r1 = r4.asMapValues     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                com.google.common.collect.Synchronized$SynchronizedAsMapValues r1 = new com.google.common.collect.Synchronized$SynchronizedAsMapValues     // Catch: java.lang.Throwable -> L19
                java.util.Map r2 = r4.delegate()     // Catch: java.lang.Throwable -> L19
                java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r4.mutex     // Catch: java.lang.Throwable -> L19
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L19
                r4.asMapValues = r1     // Catch: java.lang.Throwable -> L19
                goto L1b
            L19:
                r1 = move-exception
                goto L1f
            L1b:
                java.util.Collection<java.util.Collection<V>> r1 = r4.asMapValues     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedAsMapEntries<K, V> extends com.google.common.collect.Synchronized.SynchronizedSet<java.util.Map.Entry<K, java.util.Collection<V>>> {
        private static final long serialVersionUID = 0;


        SynchronizedAsMapEntries(java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = com.google.common.collect.Maps.containsEntryImpl(r1, r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = com.google.common.collect.Collections2.containsAllImpl(r1, r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r3 != r2) goto L4
                r3 = 1
                return r3
            L4:
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                boolean r3 = com.google.common.collect.Sets.equalsImpl(r1, r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                r2 = this;
                com.google.common.collect.Synchronized$SynchronizedAsMapEntries$1 r0 = new com.google.common.collect.Synchronized$SynchronizedAsMapEntries$1
                java.util.Iterator r1 = super.iterator()
                r0.<init>(r2, r1)
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = com.google.common.collect.Maps.removeEntryImpl(r1, r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L11
                boolean r3 = com.google.common.collect.Iterators.removeAll(r1, r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L11
                boolean r3 = com.google.common.collect.Iterators.retainAll(r1, r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object[] r1 = com.google.common.collect.ObjectArrays.toArrayImpl(r1)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object[] r3 = com.google.common.collect.ObjectArrays.toArrayImpl(r1, r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedAsMapValues<V> extends com.google.common.collect.Synchronized.SynchronizedCollection<java.util.Collection<V>> {
        private static final long serialVersionUID = 0;


        SynchronizedAsMapValues(java.util.Collection<java.util.Collection<V>> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Collection<V>> iterator() {
                r2 = this;
                com.google.common.collect.Synchronized$SynchronizedAsMapValues$1 r0 = new com.google.common.collect.Synchronized$SynchronizedAsMapValues$1
                java.util.Iterator r1 = super.iterator()
                r0.<init>(r2, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static class SynchronizedBiMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.j2objc.annotations.RetainedWith
        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private transient com.google.common.collect.BiMap<V, K> inverse;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private transient java.util.Set<V> valueSet;

        private SynchronizedBiMap(com.google.common.collect.BiMap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.BiMap<V, K> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.inverse = r3
                return
        }

        /* synthetic */ SynchronizedBiMap(com.google.common.collect.BiMap r1, java.lang.Object r2, com.google.common.collect.BiMap r3, com.google.common.collect.Synchronized.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        com.google.common.collect.BiMap<K, V> delegate() {
                r1 = this;
                java.util.Map r0 = super.delegate()
                com.google.common.collect.BiMap r0 = (com.google.common.collect.BiMap) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.BiMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Map delegate() {
                r1 = this;
                com.google.common.collect.BiMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(K r3, V r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.BiMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.forcePut(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.BiMap
        public com.google.common.collect.BiMap<V, K> inverse() {
                r4 = this;
                java.lang.Object r0 = r4.mutex
                monitor-enter(r0)
                com.google.common.collect.BiMap<V, K> r1 = r4.inverse     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                com.google.common.collect.Synchronized$SynchronizedBiMap r1 = new com.google.common.collect.Synchronized$SynchronizedBiMap     // Catch: java.lang.Throwable -> L19
                com.google.common.collect.BiMap r2 = r4.delegate()     // Catch: java.lang.Throwable -> L19
                com.google.common.collect.BiMap r2 = r2.inverse()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r4.mutex     // Catch: java.lang.Throwable -> L19
                r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L19
                r4.inverse = r1     // Catch: java.lang.Throwable -> L19
                goto L1b
            L19:
                r1 = move-exception
                goto L1f
            L1b:
                com.google.common.collect.BiMap<V, K> r1 = r4.inverse     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Collection values() {
                r1 = this;
                java.util.Set r0 = r1.values()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Set<V> values() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Set<V> r1 = r3.valueSet     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.BiMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = r1.values()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = com.google.common.collect.Synchronized.set(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.valueSet = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Set<V> r1 = r3.valueSet     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static class SynchronizedCollection<E> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Collection<E> {
        private static final long serialVersionUID = 0;

        private SynchronizedCollection(java.util.Collection<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ SynchronizedCollection(java.util.Collection r1, java.lang.Object r2, com.google.common.collect.Synchronized.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.Collection
        public boolean add(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.add(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.addAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Collection
        public void clear() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.clear()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r1
        }

        public boolean contains(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        public boolean containsAll(java.util.Collection<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Collection r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        java.util.Collection<E> delegate() {
                r1 = this;
                java.lang.Object r0 = super.delegate()
                java.util.Collection r0 = (java.util.Collection) r0
                return r0
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public java.util.Iterator<E> iterator() {
                r1 = this;
                java.util.Collection r0 = r1.delegate()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        public boolean remove(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        public boolean removeAll(java.util.Collection<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        public boolean retainAll(java.util.Collection<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.retainAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Collection
        public int size() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public java.lang.Object[] toArray() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object[] r1 = r1.toArray()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public <T> T[] toArray(T[] r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Collection r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object[] r3 = r1.toArray(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SynchronizedDeque<E> extends com.google.common.collect.Synchronized.SynchronizedQueue<E> implements java.util.Deque<E> {
        private static final long serialVersionUID = 0;

        SynchronizedDeque(java.util.Deque<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.Deque
        public void addFirst(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.addFirst(r3)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // java.util.Deque
        public void addLast(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.addLast(r3)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Deque r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Deque r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.Deque<E> delegate() {
                r1 = this;
                java.util.Queue r0 = super.delegate()
                java.util.Deque r0 = (java.util.Deque) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Queue delegate() {
                r1 = this;
                java.util.Deque r0 = r1.delegate()
                return r0
        }

        @Override // java.util.Deque
        public java.util.Iterator<E> descendingIterator() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Iterator r1 = r1.descendingIterator()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public E getFirst() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.getFirst()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public E getLast() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.getLast()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public boolean offerFirst(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.offerFirst(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Deque
        public boolean offerLast(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.offerLast(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Deque
        public E peekFirst() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.peekFirst()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public E peekLast() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.peekLast()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public E pollFirst() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.pollFirst()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public E pollLast() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.pollLast()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public E pop() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.pop()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public void push(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.push(r3)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // java.util.Deque
        public E removeFirst() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.removeFirstOccurrence(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Deque
        public E removeLast() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.removeLast()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Deque r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.removeLastOccurrence(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static class SynchronizedEntry<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedEntry(java.util.Map.Entry<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Map$Entry r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        java.util.Map.Entry<K, V> delegate() {
                r1 = this;
                java.lang.Object r0 = super.delegate()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map$Entry r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map$Entry r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map$Entry r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map$Entry r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map$Entry r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.setValue(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedList<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.List<E> {
        private static final long serialVersionUID = 0;

        SynchronizedList(java.util.List<E> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // java.util.List
        public void add(int r3, E r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.add(r3, r4)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // java.util.List
        public boolean addAll(int r3, java.util.Collection<? extends E> r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.addAll(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.List r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.List r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.List<E> delegate() {
                r1 = this;
                java.util.Collection r0 = super.delegate()
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r3 != r2) goto L4
                r3 = 1
                return r3
            L4:
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        @Override // java.util.List
        public E get(int r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r3 = r1.indexOf(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r3 = r1.lastIndexOf(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.List
        public java.util.ListIterator<E> listIterator() {
                r1 = this;
                java.util.List r0 = r1.delegate()
                java.util.ListIterator r0 = r0.listIterator()
                return r0
        }

        @Override // java.util.List
        public java.util.ListIterator<E> listIterator(int r2) {
                r1 = this;
                java.util.List r0 = r1.delegate()
                java.util.ListIterator r2 = r0.listIterator(r2)
                return r2
        }

        @Override // java.util.List
        public E remove(int r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.List
        public E set(int r3, E r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.set(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.List
        public java.util.List<E> subList(int r3, int r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.List r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = r1.subList(r3, r4)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = com.google.common.collect.Synchronized.access$200(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedListMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        com.google.common.collect.ListMultimap<K, V> delegate() {
                r1 = this;
                com.google.common.collect.Multimap r0 = super.delegate()
                com.google.common.collect.ListMultimap r0 = (com.google.common.collect.ListMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
                r1 = this;
                com.google.common.collect.ListMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.ListMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.List<V> get(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.ListMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = com.google.common.collect.Synchronized.access$200(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.List<V> removeAll(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.ListMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.List r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.List r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.List<V> replaceValues(K r3, java.lang.Iterable<? extends V> r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.ListMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.List r3 = r1.replaceValues(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Map<K, V> {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Set<K> keySet;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Collection<V> values;

        SynchronizedMap(java.util.Map<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.Map
        public void clear() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.clear()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r1
        }

        @Override // java.util.Map
        public boolean containsKey(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        public boolean containsValue(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsValue(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Map r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        java.util.Map<K, V> delegate() {
                r1 = this;
                java.lang.Object r0 = super.delegate()
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Set<java.util.Map$Entry<K, V>> r1 = r3.entrySet     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                java.util.Map r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = com.google.common.collect.Synchronized.set(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.entrySet = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Set<java.util.Map$Entry<K, V>> r1 = r3.entrySet     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // java.util.Map
        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r3 != r2) goto L4
                r3 = 1
                return r3
            L4:
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        public V get(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Map
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Map
        public boolean isEmpty() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Map
        public java.util.Set<K> keySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Set<K> r1 = r3.keySet     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                java.util.Map r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = com.google.common.collect.Synchronized.set(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.keySet = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Set<K> r1 = r3.keySet     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // java.util.Map
        public V put(K r3, V r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.put(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.putAll(r3)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // java.util.Map
        public V remove(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Map
        public int size() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Map r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public java.util.Collection<V> values() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Collection<V> r1 = r3.values     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                java.util.Map r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Collection r1 = com.google.common.collect.Synchronized.access$500(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.values = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Collection<V> r1 = r3.values     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements com.google.common.collect.Multimap<K, V> {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Map<K, java.util.Collection<V>> asMap;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Collection<java.util.Map.Entry<K, V>> entries;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Set<K> keySet;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient com.google.common.collect.Multiset<K> keys;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Collection<V> valuesCollection;

        SynchronizedMultimap(com.google.common.collect.Multimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Map<K, java.util.Collection<V>> asMap() {
                r4 = this;
                java.lang.Object r0 = r4.mutex
                monitor-enter(r0)
                java.util.Map<K, java.util.Collection<V>> r1 = r4.asMap     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                com.google.common.collect.Synchronized$SynchronizedAsMap r1 = new com.google.common.collect.Synchronized$SynchronizedAsMap     // Catch: java.lang.Throwable -> L19
                com.google.common.collect.Multimap r2 = r4.delegate()     // Catch: java.lang.Throwable -> L19
                java.util.Map r2 = r2.asMap()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r4.mutex     // Catch: java.lang.Throwable -> L19
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L19
                r4.asMap = r1     // Catch: java.lang.Throwable -> L19
                goto L1b
            L19:
                r1 = move-exception
                goto L1f
            L1b:
                java.util.Map<K, java.util.Collection<V>> r1 = r4.asMap     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.clear()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsEntry(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsEntry(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsValue(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsValue(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        com.google.common.collect.Multimap<K, V> delegate() {
                r1 = this;
                java.lang.Object r0 = super.delegate()
                com.google.common.collect.Multimap r0 = (com.google.common.collect.Multimap) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.Multimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Collection<java.util.Map$Entry<K, V>> r1 = r3.entries     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.Multimap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Collection r1 = r1.entries()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Collection r1 = com.google.common.collect.Synchronized.access$400(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.entries = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Collection<java.util.Map$Entry<K, V>> r1 = r3.entries     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r3 != r2) goto L4
                r3 = 1
                return r3
            L4:
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        public java.util.Collection<V> get(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Collection r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Collection r3 = com.google.common.collect.Synchronized.access$400(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Multimap
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public boolean isEmpty() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Set<K> keySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Set<K> r1 = r3.keySet     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.Multimap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = com.google.common.collect.Synchronized.access$300(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.keySet = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Set<K> r1 = r3.keySet     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public com.google.common.collect.Multiset<K> keys() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset<K> r1 = r3.keys     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.Multimap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                com.google.common.collect.Multiset r1 = r1.keys()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                com.google.common.collect.Multiset r1 = com.google.common.collect.Synchronized.multiset(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.keys = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                com.google.common.collect.Multiset<K> r1 = r3.keys     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public boolean put(K r3, V r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.put(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.putAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(K r3, java.lang.Iterable<? extends V> r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.putAll(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.remove(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        public java.util.Collection<V> removeAll(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Collection r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        public java.util.Collection<V> replaceValues(K r3, java.lang.Iterable<? extends V> r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Collection r3 = r1.replaceValues(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Collection<V> values() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Collection<V> r1 = r3.valuesCollection     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.Multimap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Collection r1 = com.google.common.collect.Synchronized.access$500(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.valuesCollection = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Collection<V> r1 = r3.valuesCollection     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedMultiset<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements com.google.common.collect.Multiset<E> {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Set<E> elementSet;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

        SynchronizedMultiset(com.google.common.collect.Multiset<E> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // com.google.common.collect.Multiset
        public int add(E r3, int r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r3 = r1.add(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multiset
        public int count(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r3 = r1.count(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        com.google.common.collect.Multiset<E> delegate() {
                r1 = this;
                java.util.Collection r0 = super.delegate()
                com.google.common.collect.Multiset r0 = (com.google.common.collect.Multiset) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Multiset
        public java.util.Set<E> elementSet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Set<E> r1 = r3.elementSet     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.Multiset r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = r1.elementSet()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = com.google.common.collect.Synchronized.access$300(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.elementSet = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Set<E> r1 = r3.elementSet     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // com.google.common.collect.Multiset
        public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Set<com.google.common.collect.Multiset$Entry<E>> r1 = r3.entrySet     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.Multiset r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = com.google.common.collect.Synchronized.access$300(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.entrySet = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Set<com.google.common.collect.Multiset$Entry<E>> r1 = r3.entrySet     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r3 != r2) goto L4
                r3 = 1
                return r3
            L4:
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Multiset
        public int remove(java.lang.Object r3, int r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r3 = r1.remove(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multiset
        public int setCount(E r3, int r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r3 = r1.setCount(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Multiset
        public boolean setCount(E r3, int r4, int r5) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Multiset r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.setCount(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    @com.google.common.annotations.VisibleForTesting
    static class SynchronizedNavigableMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedSortedMap<K, V> implements java.util.NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.NavigableSet<K> descendingKeySet;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.NavigableMap<K, V> descendingMap;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.NavigableSet<K> navigableKeySet;

        SynchronizedNavigableMap(java.util.NavigableMap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> ceilingEntry(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = r1.ceilingEntry(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = com.google.common.collect.Synchronized.access$700(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.ceilingKey(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.NavigableMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Map delegate() {
                r1 = this;
                java.util.NavigableMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.NavigableMap<K, V> delegate() {
                r1 = this;
                java.util.SortedMap r0 = super.delegate()
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.SortedMap delegate() {
                r1 = this;
                java.util.NavigableMap r0 = r1.delegate()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableSet<K> r1 = r3.descendingKeySet     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                java.util.NavigableMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L19
                java.util.NavigableSet r1 = r1.descendingKeySet()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L19
                java.util.NavigableSet r1 = com.google.common.collect.Synchronized.navigableSet(r1, r2)     // Catch: java.lang.Throwable -> L19
                r3.descendingKeySet = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L19:
                r1 = move-exception
                goto L1d
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> descendingMap() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableMap<K, V> r1 = r3.descendingMap     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                java.util.NavigableMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L19
                java.util.NavigableMap r1 = r1.descendingMap()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L19
                java.util.NavigableMap r1 = com.google.common.collect.Synchronized.navigableMap(r1, r2)     // Catch: java.lang.Throwable -> L19
                r3.descendingMap = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L19:
                r1 = move-exception
                goto L1d
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> firstEntry() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = r1.firstEntry()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = com.google.common.collect.Synchronized.access$700(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> floorEntry(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = r1.floorEntry(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = com.google.common.collect.Synchronized.access$700(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // java.util.NavigableMap
        public K floorKey(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.floorKey(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> headMap(K r3, boolean r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.NavigableMap r3 = r1.headMap(r3, r4)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.NavigableMap r3 = com.google.common.collect.Synchronized.navigableMap(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap<K, V> headMap(K r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableMap r2 = r1.headMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> higherEntry(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = r1.higherEntry(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = com.google.common.collect.Synchronized.access$700(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // java.util.NavigableMap
        public K higherKey(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.higherKey(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.navigableKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> lastEntry() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = r1.lastEntry()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = com.google.common.collect.Synchronized.access$700(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> lowerEntry(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = r1.lowerEntry(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r3 = com.google.common.collect.Synchronized.access$700(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.lowerKey(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableSet<K> r1 = r3.navigableKeySet     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                java.util.NavigableMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L19
                java.util.NavigableSet r1 = r1.navigableKeySet()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L19
                java.util.NavigableSet r1 = com.google.common.collect.Synchronized.navigableSet(r1, r2)     // Catch: java.lang.Throwable -> L19
                r3.navigableKeySet = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L19:
                r1 = move-exception
                goto L1d
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> pollFirstEntry() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = r1.pollFirstEntry()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = com.google.common.collect.Synchronized.access$700(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, V> pollLastEntry() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = r1.pollLastEntry()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map$Entry r1 = com.google.common.collect.Synchronized.access$700(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> subMap(K r3, boolean r4, K r5, boolean r6) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.NavigableMap r3 = r1.subMap(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.NavigableMap r3 = com.google.common.collect.Synchronized.navigableMap(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap<K, V> subMap(K r3, K r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, V> tailMap(K r3, boolean r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.NavigableMap r3 = r1.tailMap(r3, r4)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.NavigableMap r3 = com.google.common.collect.Synchronized.navigableMap(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap<K, V> tailMap(K r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableMap r2 = r1.tailMap(r2, r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    @com.google.common.annotations.VisibleForTesting
    static class SynchronizedNavigableSet<E> extends com.google.common.collect.Synchronized.SynchronizedSortedSet<E> implements java.util.NavigableSet<E> {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.NavigableSet<E> descendingSet;

        SynchronizedNavigableSet(java.util.NavigableSet<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.NavigableSet
        public E ceiling(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.ceiling(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.NavigableSet r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.NavigableSet r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.NavigableSet<E> delegate() {
                r1 = this;
                java.util.SortedSet r0 = super.delegate()
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Set delegate() {
                r1 = this;
                java.util.NavigableSet r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.SortedSet delegate() {
                r1 = this;
                java.util.NavigableSet r0 = r1.delegate()
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
                r1 = this;
                java.util.NavigableSet r0 = r1.delegate()
                java.util.Iterator r0 = r0.descendingIterator()
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.NavigableSet<E> r1 = r3.descendingSet     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                java.util.NavigableSet r1 = r3.delegate()     // Catch: java.lang.Throwable -> L19
                java.util.NavigableSet r1 = r1.descendingSet()     // Catch: java.lang.Throwable -> L19
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L19
                java.util.NavigableSet r1 = com.google.common.collect.Synchronized.navigableSet(r1, r2)     // Catch: java.lang.Throwable -> L19
                r3.descendingSet = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L19:
                r1 = move-exception
                goto L1d
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return r1
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // java.util.NavigableSet
        public E floor(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.floor(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(E r3, boolean r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.NavigableSet r3 = r1.headSet(r3, r4)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.NavigableSet r3 = com.google.common.collect.Synchronized.navigableSet(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<E> headSet(E r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableSet r2 = r1.headSet(r2, r0)
                return r2
        }

        @Override // java.util.NavigableSet
        public E higher(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.higher(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.NavigableSet
        public E lower(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.lower(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.pollFirst()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.pollLast()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(E r3, boolean r4, E r5, boolean r6) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.NavigableSet r3 = r1.subSet(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.NavigableSet r3 = com.google.common.collect.Synchronized.navigableSet(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<E> subSet(E r3, E r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableSet r3 = r2.subSet(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(E r3, boolean r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.NavigableSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.NavigableSet r3 = r1.tailSet(r3, r4)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.NavigableSet r3 = com.google.common.collect.Synchronized.navigableSet(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet<E> tailSet(E r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableSet r2 = r1.tailSet(r2, r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SynchronizedObject implements java.io.Serializable {

        @com.google.common.annotations.GwtIncompatible
        private static final long serialVersionUID = 0;
        final java.lang.Object delegate;
        final java.lang.Object mutex;

        SynchronizedObject(java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                r0.delegate = r1
                if (r2 != 0) goto Lc
                r2 = r0
            Lc:
                r0.mutex = r2
                return
        }

        @com.google.common.annotations.GwtIncompatible
        private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
                r1 = this;
                java.lang.Object r0 = r1.mutex
                monitor-enter(r0)
                r2.defaultWriteObject()     // Catch: java.lang.Throwable -> L8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                throw r2
        }

        java.lang.Object delegate() {
                r1 = this;
                java.lang.Object r0 = r1.delegate
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.lang.Object r1 = r2.delegate     // Catch: java.lang.Throwable -> Lb
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return r1
            Lb:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedQueue<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.Queue<E> {
        private static final long serialVersionUID = 0;

        SynchronizedQueue(java.util.Queue<E> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Queue r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Queue r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.Queue<E> delegate() {
                r1 = this;
                java.util.Collection r0 = super.delegate()
                java.util.Queue r0 = (java.util.Queue) r0
                return r0
        }

        @Override // java.util.Queue
        public E element() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Queue r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.element()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Queue
        public boolean offer(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Queue r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.offer(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // java.util.Queue
        public E peek() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Queue r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.peek()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Queue
        public E poll() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Queue r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.Queue
        public E remove() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Queue r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.remove()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedRandomAccessList<E> extends com.google.common.collect.Synchronized.SynchronizedList<E> implements java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        SynchronizedRandomAccessList(java.util.List<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SynchronizedSet<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.Set<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSet(java.util.Set<E> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.Set<E> delegate() {
                r1 = this;
                java.util.Collection r0 = super.delegate()
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r3 != r2) goto L4
                r3 = 1
                return r3
            L4:
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.Set r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedSetMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        SynchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        com.google.common.collect.SetMultimap<K, V> delegate() {
                r1 = this;
                com.google.common.collect.Multimap r0 = super.delegate()
                com.google.common.collect.SetMultimap r0 = (com.google.common.collect.SetMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection entries() {
                r1 = this;
                java.util.Set r0 = r1.entries()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                java.util.Set<java.util.Map$Entry<K, V>> r1 = r3.entrySet     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.google.common.collect.SetMultimap r1 = r3.delegate()     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = r1.entries()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L18
                java.util.Set r1 = com.google.common.collect.Synchronized.set(r1, r2)     // Catch: java.lang.Throwable -> L18
                r3.entrySet = r1     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r1 = move-exception
                goto L1e
            L1a:
                java.util.Set<java.util.Map$Entry<K, V>> r1 = r3.entrySet     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return r1
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.Set<V> get(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.SetMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Set r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Set r3 = com.google.common.collect.Synchronized.set(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.Set<V> removeAll(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.SetMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Set r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.Set r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.Set<V> replaceValues(K r3, java.lang.Iterable<? extends V> r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.SetMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Set r3 = r1.replaceValues(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SynchronizedSortedMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, V> implements java.util.SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedMap(java.util.SortedMap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Comparator r1 = r1.comparator()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.SortedMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Map delegate() {
                r1 = this;
                java.util.SortedMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.SortedMap<K, V> delegate() {
                r1 = this;
                java.util.Map r0 = super.delegate()
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        @Override // java.util.SortedMap
        public K firstKey() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.firstKey()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public java.util.SortedMap<K, V> headMap(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.SortedMap r3 = r1.headMap(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.SortedMap r3 = com.google.common.collect.Synchronized.sortedMap(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // java.util.SortedMap
        public K lastKey() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.lastKey()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public java.util.SortedMap<K, V> subMap(K r3, K r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.SortedMap r3 = r1.subMap(r3, r4)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.SortedMap r3 = com.google.common.collect.Synchronized.sortedMap(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        public java.util.SortedMap<K, V> tailMap(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedMap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.SortedMap r3 = r1.tailMap(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.SortedMap r3 = com.google.common.collect.Synchronized.sortedMap(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SynchronizedSortedSet<E> extends com.google.common.collect.Synchronized.SynchronizedSet<E> implements java.util.SortedSet<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSet(java.util.SortedSet<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Comparator r1 = r1.comparator()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.SortedSet r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.SortedSet r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.util.Set delegate() {
                r1 = this;
                java.util.SortedSet r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        java.util.SortedSet<E> delegate() {
                r1 = this;
                java.util.Set r0 = super.delegate()
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                return r0
        }

        @Override // java.util.SortedSet
        public E first() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.first()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public java.util.SortedSet<E> headSet(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = r1.headSet(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = com.google.common.collect.Synchronized.access$100(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // java.util.SortedSet
        public E last() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r1 = r1.last()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        public java.util.SortedSet<E> subSet(E r3, E r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = r1.subSet(r3, r4)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r4 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = com.google.common.collect.Synchronized.access$100(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        public java.util.SortedSet<E> tailSet(E r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                java.util.SortedSet r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = r1.tailSet(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = com.google.common.collect.Synchronized.access$100(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SynchronizedSortedSetMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ com.google.common.collect.SetMultimap delegate() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        com.google.common.collect.SortedSetMultimap<K, V> delegate() {
                r1 = this;
                com.google.common.collect.SetMultimap r0 = super.delegate()
                com.google.common.collect.SortedSetMultimap r0 = (com.google.common.collect.SortedSetMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.SortedSet<V> get(K r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.SortedSetMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.SortedSet r3 = com.google.common.collect.Synchronized.access$100(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection removeAll(java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Set removeAll(java.lang.Object r1) {
                r0 = this;
                java.util.SortedSet r1 = r0.removeAll(r1)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.SortedSet<V> removeAll(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.SortedSetMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.SortedSet r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.SortedSet r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                java.util.SortedSet r1 = r0.replaceValues(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.SortedSet<V> replaceValues(K r3, java.lang.Iterable<? extends V> r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.SortedSetMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.SortedSet r3 = r1.replaceValues(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public java.util.Comparator<? super V> valueComparator() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.SortedSetMultimap r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.util.Comparator r1 = r1.valueComparator()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SynchronizedTable<R, C, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements com.google.common.collect.Table<R, C, V> {



        SynchronizedTable(com.google.common.collect.Table<R, C, V> r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.Table
        public java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Set r1 = r1.cellSet()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Set r1 = com.google.common.collect.Synchronized.set(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // com.google.common.collect.Table
        public void clear() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.clear()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r1
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, V> column(@org.checkerframework.checker.nullness.compatqual.NullableDecl C r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map r3 = r1.column(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map r3 = com.google.common.collect.Synchronized.map(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Table
        public java.util.Set<C> columnKeySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Set r1 = r1.columnKeySet()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Set r1 = com.google.common.collect.Synchronized.set(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, java.util.Map<R, V>> columnMap() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r3.delegate()     // Catch: java.lang.Throwable -> L1c
                java.util.Map r1 = r1.columnMap()     // Catch: java.lang.Throwable -> L1c
                com.google.common.collect.Synchronized$SynchronizedTable$2 r2 = new com.google.common.collect.Synchronized$SynchronizedTable$2     // Catch: java.lang.Throwable -> L1c
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c
                java.util.Map r1 = com.google.common.collect.Maps.transformValues(r1, r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L1c
                java.util.Map r1 = com.google.common.collect.Synchronized.map(r1, r2)     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                return r1
            L1c:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                throw r1
        }

        @Override // com.google.common.collect.Table
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.contains(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Table
        public boolean containsColumn(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsColumn(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Table
        public boolean containsRow(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsRow(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Table
        public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r3 = r1.containsValue(r3)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        com.google.common.collect.Table<R, C, V> delegate() {
                r1 = this;
                java.lang.Object r0 = super.delegate()
                com.google.common.collect.Table r0 = (com.google.common.collect.Table) r0
                return r0
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.collect.Table r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.Table
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> L11
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return r3
            L11:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }

        @Override // com.google.common.collect.Table
        public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.get(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Table
        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Table
        public boolean isEmpty() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Table
        public V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl R r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl C r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r5) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.put(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Table
        public void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Lc
                r1.putAll(r3)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // com.google.common.collect.Table
        public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r3 = r1.remove(r3, r4)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r3
            Ld:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<C, V> row(@org.checkerframework.checker.nullness.compatqual.NullableDecl R r3) {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Map r3 = r1.row(r3)     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r2.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Map r3 = com.google.common.collect.Synchronized.map(r3, r1)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L13:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }

        @Override // com.google.common.collect.Table
        public java.util.Set<R> rowKeySet() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Set r1 = r1.rowKeySet()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Set r1 = com.google.common.collect.Synchronized.set(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // com.google.common.collect.Table
        public java.util.Map<R, java.util.Map<C, V>> rowMap() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r3.delegate()     // Catch: java.lang.Throwable -> L1c
                java.util.Map r1 = r1.rowMap()     // Catch: java.lang.Throwable -> L1c
                com.google.common.collect.Synchronized$SynchronizedTable$1 r2 = new com.google.common.collect.Synchronized$SynchronizedTable$1     // Catch: java.lang.Throwable -> L1c
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c
                java.util.Map r1 = com.google.common.collect.Maps.transformValues(r1, r2)     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L1c
                java.util.Map r1 = com.google.common.collect.Synchronized.map(r1, r2)     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                return r1
            L1c:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                throw r1
        }

        @Override // com.google.common.collect.Table
        public int size() {
                r2 = this;
                java.lang.Object r0 = r2.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r2.delegate()     // Catch: java.lang.Throwable -> Ld
                int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            Ld:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // com.google.common.collect.Table
        public java.util.Collection<V> values() {
                r3 = this;
                java.lang.Object r0 = r3.mutex
                monitor-enter(r0)
                com.google.common.collect.Table r1 = r3.delegate()     // Catch: java.lang.Throwable -> L13
                java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L13
                java.lang.Object r2 = r3.mutex     // Catch: java.lang.Throwable -> L13
                java.util.Collection r1 = com.google.common.collect.Synchronized.access$500(r1, r2)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }
    }

    private Synchronized() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.SortedSet access$100(java.util.SortedSet r0, java.lang.Object r1) {
            java.util.SortedSet r0 = sortedSet(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.List access$200(java.util.List r0, java.lang.Object r1) {
            java.util.List r0 = list(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Set access$300(java.util.Set r0, java.lang.Object r1) {
            java.util.Set r0 = typePreservingSet(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Collection access$400(java.util.Collection r0, java.lang.Object r1) {
            java.util.Collection r0 = typePreservingCollection(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Collection access$500(java.util.Collection r0, java.lang.Object r1) {
            java.util.Collection r0 = collection(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Map.Entry access$700(java.util.Map.Entry r0, java.lang.Object r1) {
            java.util.Map$Entry r0 = nullableSynchronizedEntry(r0, r1)
            return r0
    }

    static <K, V> com.google.common.collect.BiMap<K, V> biMap(com.google.common.collect.BiMap<K, V> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            boolean r0 = r2 instanceof com.google.common.collect.Synchronized.SynchronizedBiMap
            if (r0 != 0) goto L10
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableBiMap
            if (r0 == 0) goto L9
            return r2
        L9:
            com.google.common.collect.Synchronized$SynchronizedBiMap r0 = new com.google.common.collect.Synchronized$SynchronizedBiMap
            r1 = 0
            r0.<init>(r2, r3, r1, r1)
            return r0
        L10:
            return r2
    }

    private static <E> java.util.Collection<E> collection(java.util.Collection<E> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            com.google.common.collect.Synchronized$SynchronizedCollection r0 = new com.google.common.collect.Synchronized$SynchronizedCollection
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    static <E> java.util.Deque<E> deque(java.util.Deque<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedDeque r0 = new com.google.common.collect.Synchronized$SynchronizedDeque
            r0.<init>(r1, r2)
            return r0
    }

    private static <E> java.util.List<E> list(java.util.List<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.common.collect.Synchronized$SynchronizedRandomAccessList r0 = new com.google.common.collect.Synchronized$SynchronizedRandomAccessList
            r0.<init>(r1, r2)
            return r0
        La:
            com.google.common.collect.Synchronized$SynchronizedList r0 = new com.google.common.collect.Synchronized$SynchronizedList
            r0.<init>(r1, r2)
            return r0
    }

    static <K, V> com.google.common.collect.ListMultimap<K, V> listMultimap(com.google.common.collect.ListMultimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedListMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.BaseImmutableMultimap
            if (r0 == 0) goto L9
            return r1
        L9:
            com.google.common.collect.Synchronized$SynchronizedListMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedListMultimap
            r0.<init>(r1, r2)
            return r0
        Lf:
            return r1
    }

    @com.google.common.annotations.VisibleForTesting
    static <K, V> java.util.Map<K, V> map(java.util.Map<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedMap r0 = new com.google.common.collect.Synchronized$SynchronizedMap
            r0.<init>(r1, r2)
            return r0
    }

    static <K, V> com.google.common.collect.Multimap<K, V> multimap(com.google.common.collect.Multimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.BaseImmutableMultimap
            if (r0 == 0) goto L9
            return r1
        L9:
            com.google.common.collect.Synchronized$SynchronizedMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedMultimap
            r0.<init>(r1, r2)
            return r0
        Lf:
            return r1
    }

    static <E> com.google.common.collect.Multiset<E> multiset(com.google.common.collect.Multiset<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedMultiset
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableMultiset
            if (r0 == 0) goto L9
            return r1
        L9:
            com.google.common.collect.Synchronized$SynchronizedMultiset r0 = new com.google.common.collect.Synchronized$SynchronizedMultiset
            r0.<init>(r1, r2)
            return r0
        Lf:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    static <K, V> java.util.NavigableMap<K, V> navigableMap(java.util.NavigableMap<K, V> r1) {
            r0 = 0
            java.util.NavigableMap r1 = navigableMap(r1, r0)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    static <K, V> java.util.NavigableMap<K, V> navigableMap(java.util.NavigableMap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedNavigableMap r0 = new com.google.common.collect.Synchronized$SynchronizedNavigableMap
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static <E> java.util.NavigableSet<E> navigableSet(java.util.NavigableSet<E> r1) {
            r0 = 0
            java.util.NavigableSet r1 = navigableSet(r1, r0)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    static <E> java.util.NavigableSet<E> navigableSet(java.util.NavigableSet<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedNavigableSet r0 = new com.google.common.collect.Synchronized$SynchronizedNavigableSet
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static <K, V> java.util.Map.Entry<K, V> nullableSynchronizedEntry(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Map.Entry<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.google.common.collect.Synchronized$SynchronizedEntry r0 = new com.google.common.collect.Synchronized$SynchronizedEntry
            r0.<init>(r1, r2)
            return r0
    }

    static <E> java.util.Queue<E> queue(java.util.Queue<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedQueue
            if (r0 == 0) goto L5
            return r1
        L5:
            com.google.common.collect.Synchronized$SynchronizedQueue r0 = new com.google.common.collect.Synchronized$SynchronizedQueue
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    static <E> java.util.Set<E> set(java.util.Set<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedSet r0 = new com.google.common.collect.Synchronized$SynchronizedSet
            r0.<init>(r1, r2)
            return r0
    }

    static <K, V> com.google.common.collect.SetMultimap<K, V> setMultimap(com.google.common.collect.SetMultimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedSetMultimap
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.common.collect.BaseImmutableMultimap
            if (r0 == 0) goto L9
            return r1
        L9:
            com.google.common.collect.Synchronized$SynchronizedSetMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedSetMultimap
            r0.<init>(r1, r2)
            return r0
        Lf:
            return r1
    }

    static <K, V> java.util.SortedMap<K, V> sortedMap(java.util.SortedMap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedSortedMap r0 = new com.google.common.collect.Synchronized$SynchronizedSortedMap
            r0.<init>(r1, r2)
            return r0
    }

    private static <E> java.util.SortedSet<E> sortedSet(java.util.SortedSet<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedSortedSet r0 = new com.google.common.collect.Synchronized$SynchronizedSortedSet
            r0.<init>(r1, r2)
            return r0
    }

    static <K, V> com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap
            if (r0 == 0) goto L5
            return r1
        L5:
            com.google.common.collect.Synchronized$SynchronizedSortedSetMultimap r0 = new com.google.common.collect.Synchronized$SynchronizedSortedSetMultimap
            r0.<init>(r1, r2)
            return r0
    }

    static <R, C, V> com.google.common.collect.Table<R, C, V> table(com.google.common.collect.Table<R, C, V> r1, java.lang.Object r2) {
            com.google.common.collect.Synchronized$SynchronizedTable r0 = new com.google.common.collect.Synchronized$SynchronizedTable
            r0.<init>(r1, r2)
            return r0
    }

    private static <E> java.util.Collection<E> typePreservingCollection(java.util.Collection<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.SortedSet
            if (r0 == 0) goto Lb
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            java.util.SortedSet r1 = sortedSet(r1, r2)
            return r1
        Lb:
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L16
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = set(r1, r2)
            return r1
        L16:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L21
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = list(r1, r2)
            return r1
        L21:
            java.util.Collection r1 = collection(r1, r2)
            return r1
    }

    private static <E> java.util.Set<E> typePreservingSet(java.util.Set<E> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.SortedSet
            if (r0 == 0) goto Lb
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            java.util.SortedSet r1 = sortedSet(r1, r2)
            return r1
        Lb:
            java.util.Set r1 = set(r1, r2)
            return r1
    }
}
