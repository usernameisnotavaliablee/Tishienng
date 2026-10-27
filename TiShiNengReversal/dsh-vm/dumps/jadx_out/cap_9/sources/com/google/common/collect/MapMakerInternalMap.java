package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable {
    static final long CLEANUP_EXECUTOR_DELAY_SECS = 60;
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> UNSET_WEAK_VALUE_REFERENCE = null;
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> entryHelper;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient java.util.Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segments;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient java.util.Collection<V> values;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AbstractSerializationProxy<K, V> extends com.google.common.collect.ForwardingConcurrentMap<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient java.util.concurrent.ConcurrentMap<K, V> delegate;
        final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
        final com.google.common.collect.MapMakerInternalMap.Strength keyStrength;
        final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
        final com.google.common.collect.MapMakerInternalMap.Strength valueStrength;

        AbstractSerializationProxy(com.google.common.collect.MapMakerInternalMap.Strength r1, com.google.common.collect.MapMakerInternalMap.Strength r2, com.google.common.base.Equivalence<java.lang.Object> r3, com.google.common.base.Equivalence<java.lang.Object> r4, int r5, java.util.concurrent.ConcurrentMap<K, V> r6) {
                r0 = this;
                r0.<init>()
                r0.keyStrength = r1
                r0.valueStrength = r2
                r0.keyEquivalence = r3
                r0.valueEquivalence = r4
                r0.concurrencyLevel = r5
                r0.delegate = r6
                return
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.concurrent.ConcurrentMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Map delegate() {
                r1 = this;
                java.util.concurrent.ConcurrentMap r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected java.util.concurrent.ConcurrentMap<K, V> delegate() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<K, V> r0 = r1.delegate
                return r0
        }

        void readEntries(java.io.ObjectInputStream r4) throws java.io.IOException, java.lang.ClassNotFoundException {
                r3 = this;
            L0:
                java.lang.Object r0 = r4.readObject()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.Object r1 = r4.readObject()
                java.util.concurrent.ConcurrentMap<K, V> r2 = r3.delegate
                r2.put(r0, r1)
                goto L0
        }

        com.google.common.collect.MapMaker readMapMaker(java.io.ObjectInputStream r2) throws java.io.IOException {
                r1 = this;
                int r2 = r2.readInt()
                com.google.common.collect.MapMaker r0 = new com.google.common.collect.MapMaker
                r0.<init>()
                com.google.common.collect.MapMaker r2 = r0.initialCapacity(r2)
                com.google.common.collect.MapMakerInternalMap$Strength r0 = r1.keyStrength
                com.google.common.collect.MapMaker r2 = r2.setKeyStrength(r0)
                com.google.common.collect.MapMakerInternalMap$Strength r0 = r1.valueStrength
                com.google.common.collect.MapMaker r2 = r2.setValueStrength(r0)
                com.google.common.base.Equivalence<java.lang.Object> r0 = r1.keyEquivalence
                com.google.common.collect.MapMaker r2 = r2.keyEquivalence(r0)
                int r0 = r1.concurrencyLevel
                com.google.common.collect.MapMaker r2 = r2.concurrencyLevel(r0)
                return r2
        }

        void writeMapTo(java.io.ObjectOutputStream r4) throws java.io.IOException {
                r3 = this;
                java.util.concurrent.ConcurrentMap<K, V> r0 = r3.delegate
                int r0 = r0.size()
                r4.writeInt(r0)
                java.util.concurrent.ConcurrentMap<K, V> r0 = r3.delegate
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                r4.writeObject(r2)
                java.lang.Object r1 = r1.getValue()
                r4.writeObject(r1)
                goto L13
            L2e:
                r0 = 0
                r4.writeObject(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AbstractStrongKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        final int hash;
        final K key;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final E next;

        AbstractStrongKeyEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r3) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.hash = r2
                r0.next = r3
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.next
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AbstractWeakKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        final int hash;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final E next;

        AbstractWeakKeyEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r4) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.hash = r3
                r0.next = r4
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.next
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CleanupMapTask implements java.lang.Runnable {
        final java.lang.ref.WeakReference<com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?>> mapReference;

        public CleanupMapTask(com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?> r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mapReference = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.ref.WeakReference<com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?>> r0 = r4.mapReference
                java.lang.Object r0 = r0.get()
                com.google.common.collect.MapMakerInternalMap r0 = (com.google.common.collect.MapMakerInternalMap) r0
                if (r0 == 0) goto L19
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r0.segments
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.runCleanup()
                int r2 = r2 + 1
                goto Le
            L18:
                return
            L19:
                java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DummyInternalEntry implements com.google.common.collect.MapMakerInternalMap.InternalEntry<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> {
        private DummyInternalEntry() {
                r1 = this;
                r1.<init>()
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public java.lang.Object getKey() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public com.google.common.collect.MapMakerInternalMap.DummyInternalEntry getNext() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.DummyInternalEntry getNext() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$DummyInternalEntry r0 = r1.getNext()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public java.lang.Object getValue() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntryIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        EntryIterator(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r0 = r1.nextEntry()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntrySet extends com.google.common.collect.MapMakerInternalMap.SafeToArraySet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        EntrySet(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto Lf
                return r1
            Lf:
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L29
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0
                com.google.common.base.Equivalence r2 = r2.valueEquivalence()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L29
                r4 = 1
                return r4
            L29:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$EntryIterator r0 = new com.google.common.collect.MapMakerInternalMap$EntryIterator
                com.google.common.collect.MapMakerInternalMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L1c
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L1c
                r4 = 1
                return r4
            L1c:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class HashIterator<T> implements java.util.Iterator<T> {

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> currentSegment;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        java.util.concurrent.atomic.AtomicReferenceArray<E> currentTable;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry lastReturned;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        E nextEntry;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex;
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        HashIterator(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r1 = r1.segments
                int r1 = r1.length
                int r1 = r1 + (-1)
                r0.nextSegmentIndex = r1
                r1 = -1
                r0.nextTableIndex = r1
                r0.advance()
                return
        }

        final void advance() {
                r3 = this;
                r0 = 0
                r3.nextExternal = r0
                boolean r0 = r3.nextInChain()
                if (r0 == 0) goto La
                goto L39
            La:
                boolean r0 = r3.nextInTable()
                if (r0 == 0) goto L11
                goto L39
            L11:
                int r0 = r3.nextSegmentIndex
                if (r0 < 0) goto L39
                com.google.common.collect.MapMakerInternalMap r1 = r3.this$0
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r1 = r1.segments
                int r2 = r0 + (-1)
                r3.nextSegmentIndex = r2
                r0 = r1[r0]
                r3.currentSegment = r0
                int r0 = r0.count
                if (r0 == 0) goto L11
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.currentSegment
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r0.table
                r3.currentTable = r0
                int r0 = r0.length()
                int r0 = r0 + (-1)
                r3.nextTableIndex = r0
                boolean r0 = r3.nextInTable()
                if (r0 == 0) goto L11
            L39:
                return
        }

        boolean advanceTo(E r4) {
                r3 = this;
                java.lang.Object r0 = r4.getKey()     // Catch: java.lang.Throwable -> L1c
                com.google.common.collect.MapMakerInternalMap r1 = r3.this$0     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r4 = r1.getLiveValue(r4)     // Catch: java.lang.Throwable -> L1c
                if (r4 == 0) goto L1e
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r1 = new com.google.common.collect.MapMakerInternalMap$WriteThroughEntry     // Catch: java.lang.Throwable -> L1c
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0     // Catch: java.lang.Throwable -> L1c
                r1.<init>(r2, r0, r4)     // Catch: java.lang.Throwable -> L1c
                r3.nextExternal = r1     // Catch: java.lang.Throwable -> L1c
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r4 = r3.currentSegment
                r4.postReadCleanup()
                r4 = 1
                return r4
            L1c:
                r4 = move-exception
                goto L25
            L1e:
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r4 = r3.currentSegment
                r4.postReadCleanup()
                r4 = 0
                return r4
            L25:
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.currentSegment
                r0.postReadCleanup()
                throw r4
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r1.nextExternal
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public abstract T next();

        com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextEntry() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r1.nextExternal
                if (r0 == 0) goto Lc
                r1.lastReturned = r0
                r1.advance()
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r1.lastReturned
                return r0
            Lc:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        boolean nextInChain() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.nextEntry
                if (r0 == 0) goto L19
            L4:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r0.getNext()
                r1.nextEntry = r0
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.nextEntry
                if (r0 == 0) goto L19
                boolean r0 = r1.advanceTo(r0)
                if (r0 == 0) goto L16
                r0 = 1
                return r0
            L16:
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.nextEntry
                goto L4
            L19:
                r0 = 0
                return r0
        }

        boolean nextInTable() {
                r3 = this;
            L0:
                int r0 = r3.nextTableIndex
                if (r0 < 0) goto L22
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r1 = r3.currentTable
                int r2 = r0 + (-1)
                r3.nextTableIndex = r2
                java.lang.Object r0 = r1.get(r0)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r0
                r3.nextEntry = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.advanceTo(r0)
                if (r0 != 0) goto L20
                boolean r0 = r3.nextInChain()
                if (r0 == 0) goto L0
            L20:
                r0 = 1
                return r0
            L22:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r2.lastReturned
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                com.google.common.collect.MapMakerInternalMap r0 = r2.this$0
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r1 = r2.lastReturned
                java.lang.Object r1 = r1.getKey()
                r0.remove(r1)
                r0 = 0
                r2.lastReturned = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface InternalEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> {
        E copy(S r1, E r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r3);

        com.google.common.collect.MapMakerInternalMap.Strength keyStrength();

        E newEntry(S r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r4);

        S newSegment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> r1, int r2, int r3);

        void setValue(S r1, E r2, V r3);

        com.google.common.collect.MapMakerInternalMap.Strength valueStrength();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeyIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        KeyIterator(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getKey()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeySet extends com.google.common.collect.MapMakerInternalMap.SafeToArraySet<K> {
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        KeySet(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$KeyIterator r0 = new com.google.common.collect.MapMakerInternalMap$KeyIterator
                com.google.common.collect.MapMakerInternalMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                java.lang.Object r2 = r0.remove(r2)
                if (r2 == 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class SafeToArraySet<E> extends java.util.AbstractSet<E> {
        private SafeToArraySet() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SafeToArraySet(com.google.common.collect.MapMakerInternalMap.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.concurrent.locks.ReentrantLock {
        volatile int count;

        @com.google.j2objc.annotations.Weak
        final com.google.common.collect.MapMakerInternalMap<K, V, E, S> map;
        final int maxSegmentSize;
        int modCount;
        final java.util.concurrent.atomic.AtomicInteger readCount;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        volatile java.util.concurrent.atomic.AtomicReferenceArray<E> table;
        int threshold;

        Segment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> r2, int r3, int r4) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.readCount = r0
                r1.map = r2
                r1.maxSegmentSize = r4
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.newEntryArray(r3)
                r1.initTable(r2)
                return
        }

        static <K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> boolean isCollected(E r0) {
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        abstract E castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1);

        void clear() {
                r4 = this;
                int r0 = r4.count
                if (r0 == 0) goto L32
                r4.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r4.table     // Catch: java.lang.Throwable -> L18
                r1 = 0
                r2 = 0
            Lb:
                int r3 = r0.length()     // Catch: java.lang.Throwable -> L18
                if (r2 >= r3) goto L1a
                r3 = 0
                r0.set(r2, r3)     // Catch: java.lang.Throwable -> L18
                int r2 = r2 + 1
                goto Lb
            L18:
                r0 = move-exception
                goto L2e
            L1a:
                r4.maybeClearReferenceQueues()     // Catch: java.lang.Throwable -> L18
                java.util.concurrent.atomic.AtomicInteger r0 = r4.readCount     // Catch: java.lang.Throwable -> L18
                r0.set(r1)     // Catch: java.lang.Throwable -> L18
                int r0 = r4.modCount     // Catch: java.lang.Throwable -> L18
                int r0 = r0 + 1
                r4.modCount = r0     // Catch: java.lang.Throwable -> L18
                r4.count = r1     // Catch: java.lang.Throwable -> L18
                r4.unlock()
                return
            L2e:
                r4.unlock()
                throw r0
            L32:
                return
        }

        <T> void clearReferenceQueue(java.lang.ref.ReferenceQueue<T> r2) {
                r1 = this;
            L0:
                java.lang.ref.Reference r0 = r2.poll()
                if (r0 == 0) goto L7
                goto L0
            L7:
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        boolean clearValueForTesting(K r9, int r10, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> r11) {
                r8 = this;
                r8.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r8.table     // Catch: java.lang.Throwable -> L40
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L40
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L40
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L40
                r4 = r3
            L13:
                r5 = 0
                if (r4 == 0) goto L4b
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L40
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L40
                if (r7 != r10) goto L46
                if (r6 == 0) goto L46
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L40
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L40
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L40
                if (r6 == 0) goto L46
                r9 = r4
                com.google.common.collect.MapMakerInternalMap$WeakValueEntry r9 = (com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r9     // Catch: java.lang.Throwable -> L40
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r9 = r9.getValueReference()     // Catch: java.lang.Throwable -> L40
                if (r9 != r11) goto L42
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r8.removeFromChain(r3, r4)     // Catch: java.lang.Throwable -> L40
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L40
                r8.unlock()
                return r2
            L40:
                r9 = move-exception
                goto L4f
            L42:
                r8.unlock()
                return r5
            L46:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L40
                goto L13
            L4b:
                r8.unlock()
                return r5
            L4f:
                r8.unlock()
                throw r9
        }

        boolean containsKey(java.lang.Object r3, int r4) {
                r2 = this;
                int r0 = r2.count     // Catch: java.lang.Throwable -> L13
                r1 = 0
                if (r0 == 0) goto L19
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r2.getLiveEntry(r3, r4)     // Catch: java.lang.Throwable -> L13
                if (r3 == 0) goto L15
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L13
                if (r3 == 0) goto L15
                r1 = 1
                goto L15
            L13:
                r3 = move-exception
                goto L1d
            L15:
                r2.postReadCleanup()
                return r1
            L19:
                r2.postReadCleanup()
                return r1
            L1d:
                r2.postReadCleanup()
                throw r3
        }

        @com.google.common.annotations.VisibleForTesting
        boolean containsValue(java.lang.Object r8) {
                r7 = this;
                int r0 = r7.count     // Catch: java.lang.Throwable -> L33
                r1 = 0
                if (r0 == 0) goto L38
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r7.table     // Catch: java.lang.Throwable -> L33
                int r2 = r0.length()     // Catch: java.lang.Throwable -> L33
                r3 = 0
            Lc:
                if (r3 >= r2) goto L38
                java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> L33
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r4     // Catch: java.lang.Throwable -> L33
            L14:
                if (r4 == 0) goto L35
                java.lang.Object r5 = r7.getLiveValue(r4)     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                goto L2e
            L1d:
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r6 = r7.map     // Catch: java.lang.Throwable -> L33
                com.google.common.base.Equivalence r6 = r6.valueEquivalence()     // Catch: java.lang.Throwable -> L33
                boolean r5 = r6.equivalent(r8, r5)     // Catch: java.lang.Throwable -> L33
                if (r5 == 0) goto L2e
                r7.postReadCleanup()
                r8 = 1
                return r8
            L2e:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L33
                goto L14
            L33:
                r8 = move-exception
                goto L3c
            L35:
                int r3 = r3 + 1
                goto Lc
            L38:
                r7.postReadCleanup()
                return r1
            L3c:
                r7.postReadCleanup()
                throw r8
        }

        E copyEntry(E r3, E r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r0.copy(r1, r3, r4)
                return r3
        }

        E copyForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r2.castForTesting(r3)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r2.castForTesting(r4)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r0.copy(r1, r3, r4)
                return r3
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void drainKeyReferenceQueue(java.lang.ref.ReferenceQueue<K> r4) {
                r3 = this;
                r0 = 0
            L1:
                java.lang.ref.Reference r1 = r4.poll()
                if (r1 == 0) goto L14
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r1
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r3.map
                r2.reclaimKey(r1)
                int r0 = r0 + 1
                r1 = 16
                if (r0 != r1) goto L1
            L14:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void drainValueReferenceQueue(java.lang.ref.ReferenceQueue<V> r4) {
                r3 = this;
                r0 = 0
            L1:
                java.lang.ref.Reference r1 = r4.poll()
                if (r1 == 0) goto L14
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = (com.google.common.collect.MapMakerInternalMap.WeakValueReference) r1
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r3.map
                r2.reclaimValue(r1)
                int r0 = r0 + 1
                r1 = 16
                if (r0 != r1) goto L1
            L14:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void expand() {
                r11 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r11.table
                int r1 = r0.length()
                r2 = 1073741824(0x40000000, float:2.0)
                if (r1 < r2) goto Lb
                return
            Lb:
                int r2 = r11.count
                int r3 = r1 << 1
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r11.newEntryArray(r3)
                int r4 = r3.length()
                int r4 = r4 * 3
                int r4 = r4 / 4
                r11.threshold = r4
                int r4 = r3.length()
                int r4 = r4 + (-1)
                r5 = 0
            L24:
                if (r5 >= r1) goto L72
                java.lang.Object r6 = r0.get(r5)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r6
                if (r6 == 0) goto L6f
                com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r6.getNext()
                int r8 = r6.getHash()
                r8 = r8 & r4
                if (r7 != 0) goto L3d
                r3.set(r8, r6)
                goto L6f
            L3d:
                r9 = r6
            L3e:
                if (r7 == 0) goto L4e
                int r10 = r7.getHash()
                r10 = r10 & r4
                if (r10 == r8) goto L49
                r9 = r7
                r8 = r10
            L49:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r7.getNext()
                goto L3e
            L4e:
                r3.set(r8, r9)
            L51:
                if (r6 == r9) goto L6f
                int r7 = r6.getHash()
                r7 = r7 & r4
                java.lang.Object r8 = r3.get(r7)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r8
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = r11.copyEntry(r6, r8)
                if (r8 == 0) goto L68
                r3.set(r7, r8)
                goto L6a
            L68:
                int r2 = r2 + (-1)
            L6a:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = r6.getNext()
                goto L51
            L6f:
                int r5 = r5 + 1
                goto L24
            L72:
                r11.table = r3
                r11.count = r2
                return
        }

        V get(java.lang.Object r1, int r2) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r0.getLiveEntry(r1, r2)     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto Lb
                r0.postReadCleanup()
                r1 = 0
                return r1
            Lb:
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L17
                r0.tryDrainReferenceQueues()     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r1 = move-exception
                goto L1b
            L17:
                r0.postReadCleanup()
                return r1
            L1b:
                r0.postReadCleanup()
                throw r1
        }

        E getEntry(java.lang.Object r4, int r5) {
                r3 = this;
                int r0 = r3.count
                if (r0 == 0) goto L2b
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r3.getFirst(r5)
            L8:
                if (r0 == 0) goto L2b
                int r1 = r0.getHash()
                if (r1 == r5) goto L11
                goto L26
            L11:
                java.lang.Object r1 = r0.getKey()
                if (r1 != 0) goto L1b
                r3.tryDrainReferenceQueues()
                goto L26
            L1b:
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r3.map
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.keyEquivalence
                boolean r1 = r2.equivalent(r4, r1)
                if (r1 == 0) goto L26
                return r0
            L26:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r0.getNext()
                goto L8
            L2b:
                r4 = 0
                return r4
        }

        E getFirst(int r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r2.table
                int r1 = r0.length()
                int r1 = r1 + (-1)
                r3 = r3 & r1
                java.lang.Object r3 = r0.get(r3)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3
                return r3
        }

        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        E getLiveEntry(java.lang.Object r1, int r2) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r0.getEntry(r1, r2)
                return r1
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V getLiveValue(E r3) {
                r2 = this;
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 != 0) goto Lb
                r2.tryDrainReferenceQueues()
                return r1
            Lb:
                java.lang.Object r3 = r3.getValue()
                if (r3 != 0) goto L15
                r2.tryDrainReferenceQueues()
                return r1
            L15:
                return r3
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V getLiveValueForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r0.castForTesting(r1)
                java.lang.Object r1 = r0.getLiveValue(r1)
                return r1
        }

        java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        void initTable(java.util.concurrent.atomic.AtomicReferenceArray<E> r3) {
                r2 = this;
                int r0 = r3.length()
                int r0 = r0 * 3
                int r0 = r0 / 4
                r2.threshold = r0
                int r1 = r2.maxSegmentSize
                if (r0 != r1) goto L12
                int r0 = r0 + 1
                r2.threshold = r0
            L12:
                r2.table = r3
                return
        }

        void maybeClearReferenceQueues() {
                r0 = this;
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void maybeDrainReferenceQueues() {
                r0 = this;
                return
        }

        java.util.concurrent.atomic.AtomicReferenceArray<E> newEntryArray(int r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
                r0.<init>(r2)
                return r0
        }

        E newEntryForTesting(K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r5) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = r2.castForTesting(r5)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r0.newEntry(r1, r3, r4, r5)
                return r3
        }

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1, V r2) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        void postReadCleanup() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.readCount
                int r0 = r0.incrementAndGet()
                r0 = r0 & 63
                if (r0 != 0) goto Ld
                r1.runCleanup()
            Ld:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void preWriteCleanup() {
                r0 = this;
                r0.runLockedCleanup()
                return
        }

        V put(K r9, int r10, V r11, boolean r12) {
                r8 = this;
                r8.lock()
                r8.preWriteCleanup()     // Catch: java.lang.Throwable -> L16
                int r0 = r8.count     // Catch: java.lang.Throwable -> L16
                int r0 = r0 + 1
                int r1 = r8.threshold     // Catch: java.lang.Throwable -> L16
                if (r0 <= r1) goto L19
                r8.expand()     // Catch: java.lang.Throwable -> L16
                int r0 = r8.count     // Catch: java.lang.Throwable -> L16
                int r0 = r0 + 1
                goto L19
            L16:
                r9 = move-exception
                goto L8f
            L19:
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r1 = r8.table     // Catch: java.lang.Throwable -> L16
                int r2 = r1.length()     // Catch: java.lang.Throwable -> L16
                int r2 = r2 + (-1)
                r2 = r2 & r10
                java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L16
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L16
                r4 = r3
            L29:
                r5 = 0
                if (r4 == 0) goto L71
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L16
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L16
                if (r7 != r10) goto L6c
                if (r6 == 0) goto L6c
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L16
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L16
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L16
                if (r6 == 0) goto L6c
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L16
                if (r9 != 0) goto L59
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L16
                int r9 = r9 + 1
                r8.modCount = r9     // Catch: java.lang.Throwable -> L16
                r8.setValue(r4, r11)     // Catch: java.lang.Throwable -> L16
                int r9 = r8.count     // Catch: java.lang.Throwable -> L16
                r8.count = r9     // Catch: java.lang.Throwable -> L16
                r8.unlock()
                return r5
            L59:
                if (r12 == 0) goto L5f
                r8.unlock()
                return r9
            L5f:
                int r10 = r8.modCount     // Catch: java.lang.Throwable -> L16
                int r10 = r10 + 1
                r8.modCount = r10     // Catch: java.lang.Throwable -> L16
                r8.setValue(r4, r11)     // Catch: java.lang.Throwable -> L16
                r8.unlock()
                return r9
            L6c:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L16
                goto L29
            L71:
                int r12 = r8.modCount     // Catch: java.lang.Throwable -> L16
                int r12 = r12 + 1
                r8.modCount = r12     // Catch: java.lang.Throwable -> L16
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r12 = r8.map     // Catch: java.lang.Throwable -> L16
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r12 = r12.entryHelper     // Catch: java.lang.Throwable -> L16
                com.google.common.collect.MapMakerInternalMap$Segment r4 = r8.self()     // Catch: java.lang.Throwable -> L16
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r12.newEntry(r4, r9, r10, r3)     // Catch: java.lang.Throwable -> L16
                r8.setValue(r9, r11)     // Catch: java.lang.Throwable -> L16
                r1.set(r2, r9)     // Catch: java.lang.Throwable -> L16
                r8.count = r0     // Catch: java.lang.Throwable -> L16
                r8.unlock()
                return r5
            L8f:
                r8.unlock()
                throw r9
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        boolean reclaimKey(E r5, int r6) {
                r4 = this;
                r4.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r4.table     // Catch: java.lang.Throwable -> L2c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L2c
                r2 = 1
                int r1 = r1 - r2
                r6 = r6 & r1
                java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L2c
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r1     // Catch: java.lang.Throwable -> L2c
                r3 = r1
            L13:
                if (r3 == 0) goto L33
                if (r3 != r5) goto L2e
                int r5 = r4.modCount     // Catch: java.lang.Throwable -> L2c
                int r5 = r5 + r2
                r4.modCount = r5     // Catch: java.lang.Throwable -> L2c
                com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = r4.removeFromChain(r1, r3)     // Catch: java.lang.Throwable -> L2c
                int r1 = r4.count     // Catch: java.lang.Throwable -> L2c
                int r1 = r1 - r2
                r0.set(r6, r5)     // Catch: java.lang.Throwable -> L2c
                r4.count = r1     // Catch: java.lang.Throwable -> L2c
                r4.unlock()
                return r2
            L2c:
                r5 = move-exception
                goto L38
            L2e:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L2c
                goto L13
            L33:
                r4.unlock()
                r5 = 0
                return r5
            L38:
                r4.unlock()
                throw r5
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        boolean reclaimValue(K r9, int r10, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> r11) {
                r8 = this;
                r8.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r8.table     // Catch: java.lang.Throwable -> L4a
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4a
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L4a
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L4a
                r4 = r3
            L13:
                r5 = 0
                if (r4 == 0) goto L55
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L4a
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L4a
                if (r7 != r10) goto L50
                if (r6 == 0) goto L50
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L4a
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L4a
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L4a
                if (r6 == 0) goto L50
                r9 = r4
                com.google.common.collect.MapMakerInternalMap$WeakValueEntry r9 = (com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r9     // Catch: java.lang.Throwable -> L4a
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r9 = r9.getValueReference()     // Catch: java.lang.Throwable -> L4a
                if (r9 != r11) goto L4c
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L4a
                int r9 = r9 + r2
                r8.modCount = r9     // Catch: java.lang.Throwable -> L4a
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r8.removeFromChain(r3, r4)     // Catch: java.lang.Throwable -> L4a
                int r10 = r8.count     // Catch: java.lang.Throwable -> L4a
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L4a
                r8.count = r10     // Catch: java.lang.Throwable -> L4a
                r8.unlock()
                return r2
            L4a:
                r9 = move-exception
                goto L59
            L4c:
                r8.unlock()
                return r5
            L50:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L4a
                goto L13
            L55:
                r8.unlock()
                return r5
            L59:
                r8.unlock()
                throw r9
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        V remove(java.lang.Object r8, int r9) {
                r7 = this;
                r7.lock()
                r7.preWriteCleanup()     // Catch: java.lang.Throwable -> L53
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r7.table     // Catch: java.lang.Throwable -> L53
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L53
                int r1 = r1 + (-1)
                r1 = r1 & r9
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L53
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2     // Catch: java.lang.Throwable -> L53
                r3 = r2
            L16:
                r4 = 0
                if (r3 == 0) goto L5e
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L53
                int r6 = r3.getHash()     // Catch: java.lang.Throwable -> L53
                if (r6 != r9) goto L59
                if (r5 == 0) goto L59
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r6 = r7.map     // Catch: java.lang.Throwable -> L53
                com.google.common.base.Equivalence<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L53
                boolean r5 = r6.equivalent(r8, r5)     // Catch: java.lang.Throwable -> L53
                if (r5 == 0) goto L59
                java.lang.Object r8 = r3.getValue()     // Catch: java.lang.Throwable -> L53
                if (r8 == 0) goto L36
                goto L3c
            L36:
                boolean r9 = isCollected(r3)     // Catch: java.lang.Throwable -> L53
                if (r9 == 0) goto L55
            L3c:
                int r9 = r7.modCount     // Catch: java.lang.Throwable -> L53
                int r9 = r9 + 1
                r7.modCount = r9     // Catch: java.lang.Throwable -> L53
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r7.removeFromChain(r2, r3)     // Catch: java.lang.Throwable -> L53
                int r2 = r7.count     // Catch: java.lang.Throwable -> L53
                int r2 = r2 + (-1)
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L53
                r7.count = r2     // Catch: java.lang.Throwable -> L53
                r7.unlock()
                return r8
            L53:
                r8 = move-exception
                goto L62
            L55:
                r7.unlock()
                return r4
            L59:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L53
                goto L16
            L5e:
                r7.unlock()
                return r4
            L62:
                r7.unlock()
                throw r8
        }

        boolean remove(java.lang.Object r9, int r10, java.lang.Object r11) {
                r8 = this;
                r8.lock()
                r8.preWriteCleanup()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r8.table     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r8.map     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence r10 = r10.valueEquivalence()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = 1
                goto L47
            L41:
                boolean r9 = isCollected(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.modCount = r9     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r8.removeFromChain(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.count     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.count = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        boolean removeEntryForTesting(E r6) {
                r5 = this;
                int r0 = r6.getHash()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r1 = r5.table
                int r2 = r1.length()
                r3 = 1
                int r2 = r2 - r3
                r0 = r0 & r2
                java.lang.Object r2 = r1.get(r0)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2
                r4 = r2
            L14:
                if (r4 == 0) goto L2f
                if (r4 != r6) goto L2a
                int r6 = r5.modCount
                int r6 = r6 + r3
                r5.modCount = r6
                com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = r5.removeFromChain(r2, r4)
                int r2 = r5.count
                int r2 = r2 - r3
                r1.set(r0, r6)
                r5.count = r2
                return r3
            L2a:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()
                goto L14
            L2f:
                r6 = 0
                return r6
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        E removeFromChain(E r4, E r5) {
                r3 = this;
                int r0 = r3.count
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r5.getNext()
            L6:
                if (r4 == r5) goto L17
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = r3.copyEntry(r4, r1)
                if (r2 == 0) goto L10
                r1 = r2
                goto L12
            L10:
                int r0 = r0 + (-1)
            L12:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()
                goto L6
            L17:
                r3.count = r0
                return r1
        }

        E removeFromChainForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r2) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r0.castForTesting(r1)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = r0.castForTesting(r2)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r0.removeFromChain(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        boolean removeTableEntryForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r0.castForTesting(r1)
                boolean r1 = r0.removeEntryForTesting(r1)
                return r1
        }

        V replace(K r8, int r9, V r10) {
                r7 = this;
                r7.lock()
                r7.preWriteCleanup()     // Catch: java.lang.Throwable -> L4f
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r7.table     // Catch: java.lang.Throwable -> L4f
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4f
                int r1 = r1 + (-1)
                r1 = r1 & r9
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L4f
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r2     // Catch: java.lang.Throwable -> L4f
                r3 = r2
            L16:
                r4 = 0
                if (r3 == 0) goto L67
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L4f
                int r6 = r3.getHash()     // Catch: java.lang.Throwable -> L4f
                if (r6 != r9) goto L62
                if (r5 == 0) goto L62
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r6 = r7.map     // Catch: java.lang.Throwable -> L4f
                com.google.common.base.Equivalence<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L4f
                boolean r5 = r6.equivalent(r8, r5)     // Catch: java.lang.Throwable -> L4f
                if (r5 == 0) goto L62
                java.lang.Object r8 = r3.getValue()     // Catch: java.lang.Throwable -> L4f
                if (r8 != 0) goto L55
                boolean r8 = isCollected(r3)     // Catch: java.lang.Throwable -> L4f
                if (r8 == 0) goto L51
                int r8 = r7.modCount     // Catch: java.lang.Throwable -> L4f
                int r8 = r8 + 1
                r7.modCount = r8     // Catch: java.lang.Throwable -> L4f
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = r7.removeFromChain(r2, r3)     // Catch: java.lang.Throwable -> L4f
                int r9 = r7.count     // Catch: java.lang.Throwable -> L4f
                int r9 = r9 + (-1)
                r0.set(r1, r8)     // Catch: java.lang.Throwable -> L4f
                r7.count = r9     // Catch: java.lang.Throwable -> L4f
                goto L51
            L4f:
                r8 = move-exception
                goto L6b
            L51:
                r7.unlock()
                return r4
            L55:
                int r9 = r7.modCount     // Catch: java.lang.Throwable -> L4f
                int r9 = r9 + 1
                r7.modCount = r9     // Catch: java.lang.Throwable -> L4f
                r7.setValue(r3, r10)     // Catch: java.lang.Throwable -> L4f
                r7.unlock()
                return r8
            L62:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L4f
                goto L16
            L67:
                r7.unlock()
                return r4
            L6b:
                r7.unlock()
                throw r8
        }

        boolean replace(K r9, int r10, V r11, V r12) {
                r8 = this;
                r8.lock()
                r8.preWriteCleanup()     // Catch: java.lang.Throwable -> L4d
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r8.table     // Catch: java.lang.Throwable -> L4d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L4d
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L4d
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L74
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L4d
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L4d
                if (r7 != r10) goto L6f
                if (r6 == 0) goto L6f
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L4d
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L4d
                if (r6 == 0) goto L6f
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L4d
                if (r9 != 0) goto L53
                boolean r9 = isCollected(r4)     // Catch: java.lang.Throwable -> L4d
                if (r9 == 0) goto L4f
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L4d
                int r9 = r9 + r2
                r8.modCount = r9     // Catch: java.lang.Throwable -> L4d
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r8.removeFromChain(r3, r4)     // Catch: java.lang.Throwable -> L4d
                int r10 = r8.count     // Catch: java.lang.Throwable -> L4d
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L4d
                r8.count = r10     // Catch: java.lang.Throwable -> L4d
                goto L4f
            L4d:
                r9 = move-exception
                goto L78
            L4f:
                r8.unlock()
                return r5
            L53:
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r8.map     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.Equivalence r10 = r10.valueEquivalence()     // Catch: java.lang.Throwable -> L4d
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L4d
                if (r9 == 0) goto L6b
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L4d
                int r9 = r9 + r2
                r8.modCount = r9     // Catch: java.lang.Throwable -> L4d
                r8.setValue(r4, r12)     // Catch: java.lang.Throwable -> L4d
                r8.unlock()
                return r2
            L6b:
                r8.unlock()
                return r5
            L6f:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L4d
                goto L16
            L74:
                r8.unlock()
                return r5
            L78:
                r8.unlock()
                throw r9
        }

        void runCleanup() {
                r0 = this;
                r0.runLockedCleanup()
                return
        }

        void runLockedCleanup() {
                r2 = this;
                boolean r0 = r2.tryLock()
                if (r0 == 0) goto L18
                r2.maybeDrainReferenceQueues()     // Catch: java.lang.Throwable -> L13
                java.util.concurrent.atomic.AtomicInteger r0 = r2.readCount     // Catch: java.lang.Throwable -> L13
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L13
                r2.unlock()
                return
            L13:
                r0 = move-exception
                r2.unlock()
                throw r0
            L18:
                return
        }

        abstract S self();

        void setTableEntryForTesting(int r2, com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r1.table
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r1.castForTesting(r3)
                r0.set(r2, r3)
                return
        }

        void setValue(E r3, V r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                r0.setValue(r1, r3, r4)
                return
        }

        void setValueForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r3, V r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r2.castForTesting(r3)
                r0.setValue(r1, r3, r4)
                return
        }

        void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> r2) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        void tryDrainReferenceQueues() {
                r1 = this;
                boolean r0 = r1.tryLock()
                if (r0 == 0) goto L12
                r1.maybeDrainReferenceQueues()     // Catch: java.lang.Throwable -> Ld
                r1.unlock()
                return
            Ld:
                r0 = move-exception
                r1.unlock()
                throw r0
            L12:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SerializationProxy<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        SerializationProxy(com.google.common.collect.MapMakerInternalMap.Strength r1, com.google.common.collect.MapMakerInternalMap.Strength r2, com.google.common.base.Equivalence<java.lang.Object> r3, com.google.common.base.Equivalence<java.lang.Object> r4, int r5, java.util.concurrent.ConcurrentMap<K, V> r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
                r1 = this;
                r2.defaultReadObject()
                com.google.common.collect.MapMaker r0 = r1.readMapMaker(r2)
                java.util.concurrent.ConcurrentMap r0 = r0.makeMap()
                r1.delegate = r0
                r1.readEntries(r2)
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<K, V> r0 = r1.delegate
                return r0
        }

        private void writeObject(java.io.ObjectOutputStream r1) throws java.io.IOException {
                r0 = this;
                r1.defaultWriteObject()
                r0.writeMapTo(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Strength extends java.lang.Enum<com.google.common.collect.MapMakerInternalMap.Strength> {
        private static final /* synthetic */ com.google.common.collect.MapMakerInternalMap.Strength[] $VALUES = null;
        public static final com.google.common.collect.MapMakerInternalMap.Strength STRONG = null;
        public static final com.google.common.collect.MapMakerInternalMap.Strength WEAK = null;



        static {
                com.google.common.collect.MapMakerInternalMap$Strength$1 r0 = new com.google.common.collect.MapMakerInternalMap$Strength$1
                java.lang.String r1 = "STRONG"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.collect.MapMakerInternalMap.Strength.STRONG = r0
                com.google.common.collect.MapMakerInternalMap$Strength$2 r1 = new com.google.common.collect.MapMakerInternalMap$Strength$2
                java.lang.String r3 = "WEAK"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.collect.MapMakerInternalMap.Strength.WEAK = r1
                r3 = 2
                com.google.common.collect.MapMakerInternalMap$Strength[] r3 = new com.google.common.collect.MapMakerInternalMap.Strength[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.common.collect.MapMakerInternalMap.Strength.$VALUES = r3
                return
        }

        Strength(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Strength(java.lang.String r1, int r2, com.google.common.collect.MapMakerInternalMap.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.MapMakerInternalMap.Strength valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.MapMakerInternalMap$Strength> r0 = com.google.common.collect.MapMakerInternalMap.Strength.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.MapMakerInternalMap$Strength r1 = (com.google.common.collect.MapMakerInternalMap.Strength) r1
                return r1
        }

        public static com.google.common.collect.MapMakerInternalMap.Strength[] values() {
                com.google.common.collect.MapMakerInternalMap$Strength[] r0 = com.google.common.collect.MapMakerInternalMap.Strength.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.MapMakerInternalMap$Strength[] r0 = (com.google.common.collect.MapMakerInternalMap.Strength[]) r0
                return r0
        }

        abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.INSTANCE = r0
                    return
            }

            Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static <K> com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<K> instance() {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper<?> r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = r2.copy(r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry
                    r1.<init>(r2, r3, r4)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r2
                    com.google.common.collect.MapMaker$Dummy r3 = (com.google.common.collect.MapMaker.Dummy) r3
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        StrongKeyDummyValueEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r4) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry
                K r1 = r3.key
                int r2 = r3.hash
                r0.<init>(r1, r2, r4)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public com.google.common.collect.MapMaker.Dummy getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = com.google.common.collect.MapMaker.Dummy.VALUE
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = r1.getValue()
                return r0
        }

        void setValue(com.google.common.collect.MapMaker.Dummy r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
        StrongKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = r0.castForTesting(r1)
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment self() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r0 = r1.self()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> self() {
                r0 = this;
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private volatile V value;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.INSTANCE = r0
                    return
            }

            Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r2.copy(r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry
                    r1.<init>(r2, r3, r4)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    r2.setValue(r3)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        StrongKeyStrongValueEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 0
                r0.value = r1
                return
        }

        com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r4) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry
                K r1 = r3.key
                int r2 = r3.hash
                r0.<init>(r1, r2, r4)
                V r4 = r3.value
                r0.value = r4
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        void setValue(V r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
        StrongKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r0.castForTesting(r1)
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment self() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r0 = r1.self()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> self() {
                r0 = this;
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> valueReference;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.INSTANCE = r0
                    return
            }

            Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> r2, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r4) {
                    r1 = this;
                    boolean r0 = com.google.common.collect.MapMakerInternalMap.Segment.isCollected(r3)
                    if (r0 == 0) goto L8
                    r2 = 0
                    return r2
                L8:
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment.access$100(r2)
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = r3.copy(r2, r4)
                    return r2
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry
                    r1.<init>(r2, r3, r4)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    java.lang.ref.ReferenceQueue r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment.access$100(r1)
                    r2.setValue(r3, r1)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }
        }

        StrongKeyWeakValueEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = com.google.common.collect.MapMakerInternalMap.unsetWeakValueReference()
                r0.valueReference = r1
                return
        }

        static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$600(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry r0) {
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r0.valueReference
                return r0
        }

        static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$602(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry r0, com.google.common.collect.MapMakerInternalMap.WeakValueReference r1) {
                r0.valueReference = r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                r0.clear()
                return
        }

        com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> copy(java.lang.ref.ReferenceQueue<V> r4, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r5) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry
                K r1 = r3.key
                int r2 = r3.hash
                r0.<init>(r1, r2, r5)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r5 = r3.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r4 = r5.copyFor(r4, r0)
                r0.valueReference = r4
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getValueReference() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                return r0
        }

        void setValue(V r3, java.lang.ref.ReferenceQueue<V> r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r2.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r1 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                r1.<init>(r4, r3, r2)
                r2.valueReference = r1
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        StrongKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForValues = r1
                return
        }

        static /* synthetic */ java.lang.ref.ReferenceQueue access$100(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment r0) {
                java.lang.ref.ReferenceQueue<V> r0 = r0.queueForValues
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.castForTesting(r1)
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
                r1 = this;
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.castForTesting(r1)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = r1.getValueReference()
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                r1.drainValueReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r3, V r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r0 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                java.lang.ref.ReferenceQueue<V> r1 = r2.queueForValues
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r3 = r2.castForTesting(r3)
                r0.<init>(r1, r4, r3)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment self() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r0 = r1.self()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> self() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r2, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> r3) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = r1.castForTesting(r2)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.access$600(r2)
                com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.access$602(r2, r3)
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface StrongValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ValueIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        ValueIterator(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getValue()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class Values extends java.util.AbstractCollection<V> {
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        Values(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$ValueIterator r0 = new com.google.common.collect.MapMakerInternalMap$ValueIterator
                com.google.common.collect.MapMakerInternalMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.INSTANCE = r0
                    return
            }

            Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static <K> com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<K> instance() {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper<?> r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> r2, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r4) {
                    r1 = this;
                    java.lang.Object r0 = r3.getKey()
                    if (r0 != 0) goto L8
                    r2 = 0
                    return r2
                L8:
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment.access$200(r2)
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r2 = r3.copy(r2, r4)
                    return r2
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> r2, K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r5) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment.access$200(r2)
                    r0.<init>(r2, r3, r4, r5)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r2
                    com.google.common.collect.MapMaker$Dummy r3 = (com.google.common.collect.MapMaker.Dummy) r3
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> r1, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        WeakKeyDummyValueEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> copy(java.lang.ref.ReferenceQueue<K> r4, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r5) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry
                java.lang.Object r1 = r3.getKey()
                int r2 = r3.hash
                r0.<init>(r4, r1, r2, r5)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public com.google.common.collect.MapMaker.Dummy getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = com.google.common.collect.MapMaker.Dummy.VALUE
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = r1.getValue()
                return r0
        }

        void setValue(com.google.common.collect.MapMaker.Dummy r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        WeakKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForKeys = r1
                return
        }

        static /* synthetic */ java.lang.ref.ReferenceQueue access$200(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment r0) {
                java.lang.ref.ReferenceQueue<K> r0 = r0.queueForKeys
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = r0.castForTesting(r1)
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.drainKeyReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment self() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r0 = r1.self()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> self() {
                r0 = this;
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private volatile V value;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.INSTANCE = r0
                    return
            }

            Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> r2, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r4) {
                    r1 = this;
                    java.lang.Object r0 = r3.getKey()
                    if (r0 != 0) goto L8
                    r2 = 0
                    return r2
                L8:
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment.access$300(r2)
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r2 = r3.copy(r2, r4)
                    return r2
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> r2, K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r5) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment.access$300(r2)
                    r0.<init>(r2, r3, r4, r5)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    r2.setValue(r3)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        WeakKeyStrongValueEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 0
                r0.value = r1
                return
        }

        com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> copy(java.lang.ref.ReferenceQueue<K> r4, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r5) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry
                java.lang.Object r1 = r3.getKey()
                int r2 = r3.hash
                r0.<init>(r4, r1, r2, r5)
                V r4 = r3.value
                r0.setValue(r4)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        void setValue(V r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        WeakKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForKeys = r1
                return
        }

        static /* synthetic */ java.lang.ref.ReferenceQueue access$300(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment r0) {
                java.lang.ref.ReferenceQueue<K> r0 = r0.queueForKeys
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = r0.castForTesting(r1)
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.drainKeyReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment self() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r0 = r1.self()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> self() {
                r0 = this;
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> valueReference;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.INSTANCE = r0
                    return
            }

            Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> r3, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r5) {
                    r2 = this;
                    java.lang.Object r0 = r4.getKey()
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    boolean r0 = com.google.common.collect.MapMakerInternalMap.Segment.isCollected(r4)
                    if (r0 == 0) goto Lf
                    return r1
                Lf:
                    java.lang.ref.ReferenceQueue r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$400(r3)
                    java.lang.ref.ReferenceQueue r3 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$500(r3)
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r3 = r4.copy(r0, r3, r5)
                    return r3
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> r2, K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r5) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$400(r2)
                    r0.<init>(r2, r3, r4, r5)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    java.lang.ref.ReferenceQueue r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$500(r1)
                    r2.setValue(r3, r1)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }
        }

        WeakKeyWeakValueEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = com.google.common.collect.MapMakerInternalMap.unsetWeakValueReference()
                r0.valueReference = r1
                return
        }

        static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$700(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry r0) {
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r0.valueReference
                return r0
        }

        static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$702(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry r0, com.google.common.collect.MapMakerInternalMap.WeakValueReference r1) {
                r0.valueReference = r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                r0.clear()
                return
        }

        com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> copy(java.lang.ref.ReferenceQueue<K> r4, java.lang.ref.ReferenceQueue<V> r5, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r6) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry
                java.lang.Object r1 = r3.getKey()
                int r2 = r3.hash
                r0.<init>(r4, r1, r2, r6)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r4 = r3.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r4 = r4.copyFor(r5, r0)
                r0.valueReference = r4
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getValueReference() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                return r0
        }

        void setValue(V r3, java.lang.ref.ReferenceQueue<V> r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r2.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r1 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                r1.<init>(r4, r3, r2)
                r2.valueReference = r1
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        WeakKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForKeys = r1
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForValues = r1
                return
        }

        static /* synthetic */ java.lang.ref.ReferenceQueue access$400(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment r0) {
                java.lang.ref.ReferenceQueue<K> r0 = r0.queueForKeys
                return r0
        }

        static /* synthetic */ java.lang.ref.ReferenceQueue access$500(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment r0) {
                java.lang.ref.ReferenceQueue<V> r0 = r0.queueForValues
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.castForTesting(r1)
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<K> getKeyReferenceQueueForTesting() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        java.lang.ref.ReferenceQueue<V> getValueReferenceQueueForTesting() {
                r1 = this;
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.castForTesting(r1)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = r1.getValueReference()
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.drainKeyReferenceQueue(r0)
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                r1.drainValueReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r3, V r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r0 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                java.lang.ref.ReferenceQueue<V> r1 = r2.queueForValues
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r3 = r2.castForTesting(r3)
                r0.<init>(r1, r4, r3)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment self() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r0 = r1.self()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> self() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r2, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> r3) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r2 = r1.castForTesting(r2)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.access$700(r2)
                com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.access$702(r2, r3)
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface WeakValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        void clearValue();

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> getValueReference();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface WeakValueReference<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        void clear();

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> r1, E r2);

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V get();

        E getEntry();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakValueReferenceImpl<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<V> implements com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> {

        @com.google.j2objc.annotations.Weak
        final E entry;

        WeakValueReferenceImpl(java.lang.ref.ReferenceQueue<V> r1, V r2, E r3) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.entry = r3
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> r3, E r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r0 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                java.lang.Object r1 = r2.get()
                r0.<init>(r3, r1, r4)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.entry
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class WriteThroughEntry extends com.google.common.collect.AbstractMapEntry<K, V> {
        final K key;
        final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;
        V value;

        WriteThroughEntry(com.google.common.collect.MapMakerInternalMap r1, K r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L21
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.key
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L21
                V r0 = r3.value
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L21
                r4 = 1
                return r4
            L21:
                return r1
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                K r0 = r2.key
                int r0 = r0.hashCode()
                V r1 = r2.value
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r2.this$0
                K r1 = r2.key
                java.lang.Object r0 = r0.put(r1, r3)
                r2.value = r3
                return r0
        }
    }

    static {
            com.google.common.collect.MapMakerInternalMap$1 r0 = new com.google.common.collect.MapMakerInternalMap$1
            r0.<init>()
            com.google.common.collect.MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE = r0
            return
    }

    private MapMakerInternalMap(com.google.common.collect.MapMaker r5, com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> r6) {
            r4 = this;
            r4.<init>()
            int r0 = r5.getConcurrencyLevel()
            r1 = 65536(0x10000, float:9.1835E-41)
            int r0 = java.lang.Math.min(r0, r1)
            r4.concurrencyLevel = r0
            com.google.common.base.Equivalence r0 = r5.getKeyEquivalence()
            r4.keyEquivalence = r0
            r4.entryHelper = r6
            int r5 = r5.getInitialCapacity()
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = java.lang.Math.min(r5, r6)
            r6 = 0
            r0 = 1
            r1 = 1
            r2 = 0
        L25:
            int r3 = r4.concurrencyLevel
            if (r1 >= r3) goto L2e
            int r2 = r2 + 1
            int r1 = r1 << 1
            goto L25
        L2e:
            int r2 = 32 - r2
            r4.segmentShift = r2
            int r2 = r1 + (-1)
            r4.segmentMask = r2
            com.google.common.collect.MapMakerInternalMap$Segment[] r2 = r4.newSegmentArray(r1)
            r4.segments = r2
            int r2 = r5 / r1
            int r1 = r1 * r2
            if (r1 >= r5) goto L44
            int r2 = r2 + 1
        L44:
            if (r0 >= r2) goto L49
            int r0 = r0 << 1
            goto L44
        L49:
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r5 = r4.segments
            int r1 = r5.length
            if (r6 >= r1) goto L58
            r1 = -1
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r4.createSegment(r0, r1)
            r5[r6] = r1
            int r6 = r6 + 1
            goto L49
        L58:
            return
    }

    static /* synthetic */ java.util.ArrayList access$900(java.util.Collection r0) {
            java.util.ArrayList r0 = toArrayList(r0)
            return r0
    }

    static <K, V> com.google.common.collect.MapMakerInternalMap<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>, ?> create(com.google.common.collect.MapMaker r3) {
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L18:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            if (r0 != r1) goto L30
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r2 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            if (r0 != r2) goto L30
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L30:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r2 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            if (r0 != r2) goto L48
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L48
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L48:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            if (r0 != r2) goto L5e
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r2) goto L5e
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L5e:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    static <K> com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?>, ?> createWithDummyValues(com.google.common.collect.MapMaker r3) {
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L18:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r2 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            if (r0 != r2) goto L30
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L30
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L30:
            com.google.common.collect.MapMakerInternalMap$Strength r3 = r3.getValueStrength()
            if (r3 != r2) goto L3e
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Map cannot have both weak and dummy values"
            r3.<init>(r0)
            throw r3
        L3e:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    static int rehash(int r2) {
            int r0 = r2 << 15
            r0 = r0 ^ (-12931(0xffffffffffffcd7d, float:NaN))
            int r2 = r2 + r0
            int r0 = r2 >>> 10
            r2 = r2 ^ r0
            int r0 = r2 << 3
            int r2 = r2 + r0
            int r0 = r2 >>> 6
            r2 = r2 ^ r0
            int r0 = r2 << 2
            int r1 = r2 << 14
            int r0 = r0 + r1
            int r2 = r2 + r0
            int r0 = r2 >>> 16
            r2 = r2 ^ r0
            return r2
    }

    private static <E> java.util.ArrayList<E> toArrayList(java.util.Collection<E> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
            com.google.common.collect.Iterators.addAll(r0, r2)
            return r0
    }

    static <K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> unsetWeakValueReference() {
            com.google.common.collect.MapMakerInternalMap$WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap$DummyInternalEntry> r0 = com.google.common.collect.MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r4 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r4.segments
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.clear()
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            boolean r3 = r1.containsKey(r3, r0)
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r18) {
            r17 = this;
            r0 = r18
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = r17
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r3 = r2.segments
            r4 = -1
            r6 = 0
        Ld:
            r7 = 3
            if (r6 >= r7) goto L61
            int r7 = r3.length
            r8 = 0
            r10 = 0
        L14:
            if (r10 >= r7) goto L55
            r11 = r3[r10]
            int r12 = r11.count
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r12 = r11.table
            r13 = 0
        L1d:
            int r14 = r12.length()
            if (r13 >= r14) goto L4b
            java.lang.Object r14 = r12.get(r13)
            com.google.common.collect.MapMakerInternalMap$InternalEntry r14 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r14
        L29:
            if (r14 == 0) goto L45
            java.lang.Object r15 = r11.getLiveValue(r14)
            r16 = 0
            if (r15 == 0) goto L3f
            com.google.common.base.Equivalence r1 = r2.valueEquivalence()
            boolean r1 = r1.equivalent(r0, r15)
            if (r1 == 0) goto L3f
            r0 = 1
            return r0
        L3f:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r14 = r14.getNext()
            r1 = 0
            goto L29
        L45:
            r16 = 0
            int r13 = r13 + 1
            r1 = 0
            goto L1d
        L4b:
            r16 = 0
            int r1 = r11.modCount
            long r11 = (long) r1
            long r8 = r8 + r11
            int r10 = r10 + 1
            r1 = 0
            goto L14
        L55:
            r16 = 0
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 != 0) goto L5c
            goto L63
        L5c:
            int r6 = r6 + 1
            r4 = r8
            r1 = 0
            goto Ld
        L61:
            r16 = 0
        L63:
            return r16
    }

    @com.google.common.annotations.VisibleForTesting
    E copyEntry(E r2, E r3) {
            r1 = this;
            int r0 = r2.getHash()
            com.google.common.collect.MapMakerInternalMap$Segment r0 = r1.segmentFor(r0)
            com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = r0.copyEntry(r2, r3)
            return r2
    }

    com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> createSegment(int r2, int r3) {
            r1 = this;
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r1.entryHelper
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r0.newSegment(r1, r2, r3)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.common.collect.MapMakerInternalMap$EntrySet r0 = new com.google.common.collect.MapMakerInternalMap$EntrySet
            r0.<init>(r1)
            r1.entrySet = r0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.get(r3, r0)
            return r3
    }

    E getEntry(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r1.getEntry(r3, r0)
            return r3
    }

    V getLiveValue(E r3) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto Lf
            return r1
        Lf:
            return r3
    }

    int hash(java.lang.Object r2) {
            r1 = this;
            com.google.common.base.Equivalence<java.lang.Object> r0 = r1.keyEquivalence
            int r2 = r0.hash(r2)
            int r2 = rehash(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
            r9 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r9.segments
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = 0
        L7:
            int r7 = r0.length
            if (r4 >= r7) goto L1a
            r7 = r0[r4]
            int r7 = r7.count
            if (r7 == 0) goto L11
            return r3
        L11:
            r7 = r0[r4]
            int r7 = r7.modCount
            long r7 = (long) r7
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto L7
        L1a:
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 == 0) goto L37
            r4 = 0
        L1f:
            int r7 = r0.length
            if (r4 >= r7) goto L32
            r7 = r0[r4]
            int r7 = r7.count
            if (r7 == 0) goto L29
            return r3
        L29:
            r7 = r0[r4]
            int r7 = r7.modCount
            long r7 = (long) r7
            long r5 = r5 - r7
            int r4 = r4 + 1
            goto L1f
        L32:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L37
            return r3
        L37:
            r0 = 1
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    boolean isLiveForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r2) {
            r1 = this;
            int r0 = r2.getHash()
            com.google.common.collect.MapMakerInternalMap$Segment r0 = r1.segmentFor(r0)
            java.lang.Object r2 = r0.getLiveValueForTesting(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set<K> r0 = r1.keySet
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.common.collect.MapMakerInternalMap$KeySet r0 = new com.google.common.collect.MapMakerInternalMap$KeySet
            r0.<init>(r1)
            r1.keySet = r0
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
            r1 = this;
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r1.entryHelper
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r0.keyStrength()
            return r0
    }

    final com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] newSegmentArray(int r1) {
            r0 = this;
            com.google.common.collect.MapMakerInternalMap$Segment[] r1 = new com.google.common.collect.MapMakerInternalMap.Segment[r1]
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V put(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r3.segmentFor(r0)
            r2 = 0
            java.lang.Object r4 = r1.put(r4, r0, r5, r2)
            return r4
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V putIfAbsent(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r3.segmentFor(r0)
            r2 = 1
            java.lang.Object r4 = r1.put(r4, r0, r5, r2)
            return r4
    }

    void reclaimKey(E r3) {
            r2 = this;
            int r0 = r3.getHash()
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            r1.reclaimKey(r3, r0)
            return
    }

    void reclaimValue(com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> r4) {
            r3 = this;
            com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r4.getEntry()
            int r1 = r0.getHash()
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r3.segmentFor(r1)
            java.lang.Object r0 = r0.getKey()
            r2.reclaimValue(r0, r1, r4)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.remove(r3, r0)
            return r3
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r2 = this;
            if (r3 == 0) goto L12
            if (r4 != 0) goto L5
            goto L12
        L5:
            int r0 = r2.hash(r3)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            boolean r3 = r1.remove(r3, r0, r4)
            return r3
        L12:
            r3 = 0
            return r3
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V replace(K r3, V r4) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r2.hash(r3)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.replace(r3, r0, r4)
            return r3
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean replace(K r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r4, V r5) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r5)
            if (r4 != 0) goto La
            r3 = 0
            return r3
        La:
            int r0 = r2.hash(r3)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.segmentFor(r0)
            boolean r3 = r1.replace(r3, r0, r4, r5)
            return r3
    }

    com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segmentFor(int r3) {
            r2 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r2.segments
            int r1 = r2.segmentShift
            int r3 = r3 >>> r1
            int r1 = r2.segmentMask
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r6 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r6.segments
            r1 = 0
            r3 = 0
        L5:
            int r4 = r0.length
            if (r3 >= r4) goto L11
            r4 = r0[r3]
            int r4 = r4.count
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L5
        L11:
            int r0 = com.google.common.primitives.Ints.saturatedCast(r1)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    com.google.common.base.Equivalence<java.lang.Object> valueEquivalence() {
            r1 = this;
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r1.entryHelper
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r0.valueStrength()
            com.google.common.base.Equivalence r0 = r0.defaultEquivalence()
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
            r1 = this;
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r1.entryHelper
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r0.valueStrength()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection<V> r0 = r1.values
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.common.collect.MapMakerInternalMap$Values r0 = new com.google.common.collect.MapMakerInternalMap$Values
            r0.<init>(r1)
            r1.values = r0
            return r0
    }

    java.lang.Object writeReplace() {
            r7 = this;
            com.google.common.collect.MapMakerInternalMap$SerializationProxy r0 = new com.google.common.collect.MapMakerInternalMap$SerializationProxy
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r1 = r7.entryHelper
            com.google.common.collect.MapMakerInternalMap$Strength r1 = r1.keyStrength()
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r7.entryHelper
            com.google.common.collect.MapMakerInternalMap$Strength r2 = r2.valueStrength()
            com.google.common.base.Equivalence<java.lang.Object> r3 = r7.keyEquivalence
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r4 = r7.entryHelper
            com.google.common.collect.MapMakerInternalMap$Strength r4 = r4.valueStrength()
            com.google.common.base.Equivalence r4 = r4.defaultEquivalence()
            int r5 = r7.concurrencyLevel
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
