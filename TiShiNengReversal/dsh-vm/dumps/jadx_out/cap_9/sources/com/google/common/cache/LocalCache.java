package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class LocalCache<K, V> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V> {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final java.util.Queue<?> DISCARDING_QUEUE = null;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> UNSET = null;
    static final java.util.logging.Logger logger = null;
    final int concurrencyLevel;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    final com.google.common.cache.CacheLoader<? super K, V> defaultLoader;
    final com.google.common.cache.LocalCache.EntryFactory entryFactory;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final com.google.common.cache.AbstractCache.StatsCounter globalStatsCounter;
    final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.util.Set<K> keySet;
    final com.google.common.cache.LocalCache.Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final com.google.common.cache.RemovalListener<K, V> removalListener;
    final java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final com.google.common.cache.LocalCache.Segment<K, V>[] segments;
    final com.google.common.base.Ticker ticker;
    final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
    final com.google.common.cache.LocalCache.Strength valueStrength;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    java.util.Collection<V> values;
    final com.google.common.cache.Weigher<K, V> weigher;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class AbstractCacheSet<T> extends java.util.AbstractSet<T> {

        @com.google.j2objc.annotations.Weak
        final java.util.concurrent.ConcurrentMap<?, ?> map;
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        AbstractCacheSet(com.google.common.cache.LocalCache r1, java.util.concurrent.ConcurrentMap<?, ?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.map = r2
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AbstractReferenceEntry<K, V> implements com.google.common.cache.ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class AccessQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        final com.google.common.cache.ReferenceEntry<K, V> head;



        AccessQueue() {
                r1 = this;
                r1.<init>()
                com.google.common.cache.LocalCache$AccessQueue$1 r0 = new com.google.common.cache.LocalCache$AccessQueue$1
                r0.<init>(r1)
                r1.head = r0
                return
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
            L6:
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 == r1) goto L13
                com.google.common.cache.ReferenceEntry r1 = r0.getNextInAccessQueue()
                com.google.common.cache.LocalCache.nullifyAccessOrder(r0)
                r0 = r1
                goto L6
            L13:
                r1.setNextInAccessQueue(r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                r0.setPreviousInAccessQueue(r0)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2
                com.google.common.cache.ReferenceEntry r2 = r2.getNextInAccessQueue()
                com.google.common.cache.LocalCache$NullEntry r0 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r2 == r0) goto Lc
                r2 = 1
                return r2
            Lc:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$AccessQueue$2 r0 = new com.google.common.cache.LocalCache$AccessQueue$2
                com.google.common.cache.ReferenceEntry r1 = r2.peek()
                r0.<init>(r2, r1)
                return r0
        }

        public boolean offer(com.google.common.cache.ReferenceEntry<K, V> r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInAccessQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getPreviousInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r3)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.LocalCache.connectAccessOrder(r3, r0)
                r3 = 1
                return r3
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(java.lang.Object r1) {
                r0 = this;
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1
                boolean r1 = r0.offer(r1)
                return r1
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> peek() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lb
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object peek() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.peek()
                return r0
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> poll() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 0
                return r0
            Lc:
                r2.remove(r0)
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object poll() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.poll()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInAccessQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r1)
                com.google.common.cache.LocalCache.nullifyAccessOrder(r3)
                com.google.common.cache.LocalCache$NullEntry r3 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r1 == r3) goto L16
                r3 = 1
                return r3
            L16:
                r3 = 0
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r3 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r3.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                r1 = 0
            L7:
                com.google.common.cache.ReferenceEntry<K, V> r2 = r3.head
                if (r0 == r2) goto L12
                int r1 = r1 + 1
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                goto L7
            L12:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum EntryFactory extends java.lang.Enum<com.google.common.cache.LocalCache.EntryFactory> {
        private static final /* synthetic */ com.google.common.cache.LocalCache.EntryFactory[] $VALUES = null;
        static final int ACCESS_MASK = 1;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG = null;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG_ACCESS = null;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG_ACCESS_WRITE = null;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG_WRITE = null;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK = null;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK_ACCESS = null;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK_ACCESS_WRITE = null;
        static final int WEAK_MASK = 4;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK_WRITE = null;
        static final int WRITE_MASK = 2;
        static final com.google.common.cache.LocalCache.EntryFactory[] factories = null;









        static {
                com.google.common.cache.LocalCache$EntryFactory$1 r0 = new com.google.common.cache.LocalCache$EntryFactory$1
                java.lang.String r1 = "STRONG"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.cache.LocalCache.EntryFactory.STRONG = r0
                com.google.common.cache.LocalCache$EntryFactory$2 r1 = new com.google.common.cache.LocalCache$EntryFactory$2
                java.lang.String r3 = "STRONG_ACCESS"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.cache.LocalCache.EntryFactory.STRONG_ACCESS = r1
                com.google.common.cache.LocalCache$EntryFactory$3 r3 = new com.google.common.cache.LocalCache$EntryFactory$3
                java.lang.String r5 = "STRONG_WRITE"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.common.cache.LocalCache.EntryFactory.STRONG_WRITE = r3
                com.google.common.cache.LocalCache$EntryFactory$4 r5 = new com.google.common.cache.LocalCache$EntryFactory$4
                java.lang.String r7 = "STRONG_ACCESS_WRITE"
                r8 = 3
                r5.<init>(r7, r8)
                com.google.common.cache.LocalCache.EntryFactory.STRONG_ACCESS_WRITE = r5
                com.google.common.cache.LocalCache$EntryFactory$5 r7 = new com.google.common.cache.LocalCache$EntryFactory$5
                java.lang.String r9 = "WEAK"
                r10 = 4
                r7.<init>(r9, r10)
                com.google.common.cache.LocalCache.EntryFactory.WEAK = r7
                com.google.common.cache.LocalCache$EntryFactory$6 r9 = new com.google.common.cache.LocalCache$EntryFactory$6
                java.lang.String r11 = "WEAK_ACCESS"
                r12 = 5
                r9.<init>(r11, r12)
                com.google.common.cache.LocalCache.EntryFactory.WEAK_ACCESS = r9
                com.google.common.cache.LocalCache$EntryFactory$7 r11 = new com.google.common.cache.LocalCache$EntryFactory$7
                java.lang.String r13 = "WEAK_WRITE"
                r14 = 6
                r11.<init>(r13, r14)
                com.google.common.cache.LocalCache.EntryFactory.WEAK_WRITE = r11
                com.google.common.cache.LocalCache$EntryFactory$8 r13 = new com.google.common.cache.LocalCache$EntryFactory$8
                java.lang.String r15 = "WEAK_ACCESS_WRITE"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.google.common.cache.LocalCache.EntryFactory.WEAK_ACCESS_WRITE = r13
                r15 = 8
                r17 = 7
                com.google.common.cache.LocalCache$EntryFactory[] r2 = new com.google.common.cache.LocalCache.EntryFactory[r15]
                r2[r16] = r0
                r2[r4] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                com.google.common.cache.LocalCache.EntryFactory.$VALUES = r2
                com.google.common.cache.LocalCache$EntryFactory[] r2 = new com.google.common.cache.LocalCache.EntryFactory[r15]
                r2[r16] = r0
                r2[r4] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                com.google.common.cache.LocalCache.EntryFactory.factories = r2
                return
        }

        EntryFactory(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ EntryFactory(java.lang.String r1, int r2, com.google.common.cache.LocalCache.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static com.google.common.cache.LocalCache.EntryFactory getFactory(com.google.common.cache.LocalCache.Strength r2, boolean r3, boolean r4) {
                com.google.common.cache.LocalCache$Strength r0 = com.google.common.cache.LocalCache.Strength.WEAK
                r1 = 0
                if (r2 != r0) goto L7
                r2 = 4
                goto L8
            L7:
                r2 = 0
            L8:
                r2 = r2 | r3
                if (r4 == 0) goto Lc
                r1 = 2
            Lc:
                r2 = r2 | r1
                com.google.common.cache.LocalCache$EntryFactory[] r3 = com.google.common.cache.LocalCache.EntryFactory.factories
                r2 = r3[r2]
                return r2
        }

        public static com.google.common.cache.LocalCache.EntryFactory valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.LocalCache$EntryFactory> r0 = com.google.common.cache.LocalCache.EntryFactory.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.LocalCache$EntryFactory r1 = (com.google.common.cache.LocalCache.EntryFactory) r1
                return r1
        }

        public static com.google.common.cache.LocalCache.EntryFactory[] values() {
                com.google.common.cache.LocalCache$EntryFactory[] r0 = com.google.common.cache.LocalCache.EntryFactory.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.LocalCache$EntryFactory[] r0 = (com.google.common.cache.LocalCache.EntryFactory[]) r0
                return r0
        }

        <K, V> void copyAccessEntry(com.google.common.cache.ReferenceEntry<K, V> r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r2 = this;
                long r0 = r3.getAccessTime()
                r4.setAccessTime(r0)
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r4)
                com.google.common.cache.ReferenceEntry r0 = r3.getNextInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r4, r0)
                com.google.common.cache.LocalCache.nullifyAccessOrder(r3)
                return
        }

        <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> r2, com.google.common.cache.ReferenceEntry<K, V> r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                java.lang.Object r0 = r3.getKey()
                int r3 = r3.getHash()
                com.google.common.cache.ReferenceEntry r2 = r1.newEntry(r2, r0, r3, r4)
                return r2
        }

        <K, V> void copyWriteEntry(com.google.common.cache.ReferenceEntry<K, V> r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r2 = this;
                long r0 = r3.getWriteTime()
                r4.setWriteTime(r0)
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r4)
                com.google.common.cache.ReferenceEntry r0 = r3.getNextInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r4, r0)
                com.google.common.cache.LocalCache.nullifyWriteOrder(r3)
                return
        }

        abstract <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntryIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        EntryIterator(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                com.google.common.cache.LocalCache$WriteThroughEntry r0 = r1.nextEntry()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntrySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        EntrySet(com.google.common.cache.LocalCache r1, java.util.concurrent.ConcurrentMap<?, ?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
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
                com.google.common.cache.LocalCache r2 = r3.this$0
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L27
                com.google.common.cache.LocalCache r2 = r3.this$0
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.valueEquivalence
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L27
                r4 = 1
                return r4
            L27:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$EntryIterator r0 = new com.google.common.cache.LocalCache$EntryIterator
                com.google.common.cache.LocalCache r1 = r2.this$0
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
                com.google.common.cache.LocalCache r2 = r3.this$0
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L1c
                r4 = 1
                return r4
            L1c:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class HashIterator<T> implements java.util.Iterator<T> {

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        com.google.common.cache.LocalCache.Segment<K, V> currentSegment;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> currentTable;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry lastReturned;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.ReferenceEntry<K, V> nextEntry;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex;
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        HashIterator(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.common.cache.LocalCache$Segment<K, V>[] r1 = r1.segments
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
                com.google.common.cache.LocalCache r1 = r3.this$0
                com.google.common.cache.LocalCache$Segment<K, V>[] r1 = r1.segments
                int r2 = r0 + (-1)
                r3.nextSegmentIndex = r2
                r0 = r1[r0]
                r3.currentSegment = r0
                int r0 = r0.count
                if (r0 == 0) goto L11
                com.google.common.cache.LocalCache$Segment<K, V> r0 = r3.currentSegment
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r0.table
                r3.currentTable = r0
                int r0 = r0.length()
                int r0 = r0 + (-1)
                r3.nextTableIndex = r0
                boolean r0 = r3.nextInTable()
                if (r0 == 0) goto L11
            L39:
                return
        }

        boolean advanceTo(com.google.common.cache.ReferenceEntry<K, V> r5) {
                r4 = this;
                com.google.common.cache.LocalCache r0 = r4.this$0     // Catch: java.lang.Throwable -> L24
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L24
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L24
                java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L24
                com.google.common.cache.LocalCache r3 = r4.this$0     // Catch: java.lang.Throwable -> L24
                java.lang.Object r5 = r3.getLiveValue(r5, r0)     // Catch: java.lang.Throwable -> L24
                if (r5 == 0) goto L26
                com.google.common.cache.LocalCache$WriteThroughEntry r0 = new com.google.common.cache.LocalCache$WriteThroughEntry     // Catch: java.lang.Throwable -> L24
                com.google.common.cache.LocalCache r1 = r4.this$0     // Catch: java.lang.Throwable -> L24
                r0.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L24
                r4.nextExternal = r0     // Catch: java.lang.Throwable -> L24
                com.google.common.cache.LocalCache$Segment<K, V> r5 = r4.currentSegment
                r5.postReadCleanup()
                r5 = 1
                return r5
            L24:
                r5 = move-exception
                goto L2d
            L26:
                com.google.common.cache.LocalCache$Segment<K, V> r5 = r4.currentSegment
                r5.postReadCleanup()
                r5 = 0
                return r5
            L2d:
                com.google.common.cache.LocalCache$Segment<K, V> r0 = r4.currentSegment
                r0.postReadCleanup()
                throw r5
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r1.nextExternal
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public abstract T next();

        com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextEntry() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r1.nextExternal
                if (r0 == 0) goto Lc
                r1.lastReturned = r0
                r1.advance()
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r1.lastReturned
                return r0
            Lc:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        boolean nextInChain() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextEntry
                if (r0 == 0) goto L19
            L4:
                com.google.common.cache.ReferenceEntry r0 = r0.getNext()
                r1.nextEntry = r0
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextEntry
                if (r0 == 0) goto L19
                boolean r0 = r1.advanceTo(r0)
                if (r0 == 0) goto L16
                r0 = 1
                return r0
            L16:
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextEntry
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
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r1 = r3.currentTable
                int r2 = r0 + (-1)
                r3.nextTableIndex = r2
                java.lang.Object r0 = r1.get(r0)
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
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
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r2.lastReturned
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.cache.LocalCache r0 = r2.this$0
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r1 = r2.lastReturned
                java.lang.Object r1 = r1.getKey()
                r0.remove(r1)
                r0 = 0
                r2.lastReturned = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeyIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<K> {
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        KeyIterator(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
                r1 = this;
                com.google.common.cache.LocalCache$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getKey()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<K> {
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        KeySet(com.google.common.cache.LocalCache r1, java.util.concurrent.ConcurrentMap<?, ?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$KeyIterator r0 = new com.google.common.cache.LocalCache$KeyIterator
                com.google.common.cache.LocalCache r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                java.lang.Object r2 = r0.remove(r2)
                if (r2 == 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class LoadingSerializationProxy<K, V> extends com.google.common.cache.LocalCache.ManualSerializationProxy<K, V> implements com.google.common.cache.LoadingCache<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 1;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient com.google.common.cache.LoadingCache<K, V> autoDelegate;

        LoadingSerializationProxy(com.google.common.cache.LocalCache<K, V> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
                r1 = this;
                r2.defaultReadObject()
                com.google.common.cache.CacheBuilder r2 = r1.recreateCacheBuilder()
                com.google.common.cache.CacheLoader<? super K, V> r0 = r1.loader
                com.google.common.cache.LoadingCache r2 = r2.build(r0)
                r1.autoDelegate = r2
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                return r0
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K r2) {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K r2) throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r2) throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                com.google.common.collect.ImmutableMap r2 = r0.getAll(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K r2) {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                java.lang.Object r2 = r0.getUnchecked(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K r2) {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                r0.refresh(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class LoadingValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.util.concurrent.SettableFuture<V> futureValue;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> oldValue;
        final com.google.common.base.Stopwatch stopwatch;


        public LoadingValueReference() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference r0 = com.google.common.cache.LocalCache.unset()
                r1.<init>(r0)
                return
        }

        public LoadingValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r2) {
                r1 = this;
                r1.<init>()
                com.google.common.util.concurrent.SettableFuture r0 = com.google.common.util.concurrent.SettableFuture.create()
                r1.futureValue = r0
                com.google.common.base.Stopwatch r0 = com.google.common.base.Stopwatch.createUnstarted()
                r1.stopwatch = r0
                r1.oldValue = r2
                return
        }

        private com.google.common.util.concurrent.ListenableFuture<V> fullyFailedFuture(java.lang.Throwable r1) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.immediateFailedFuture(r1)
                return r1
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                return r0
        }

        public long elapsedNanos() {
                r2 = this;
                com.google.common.base.Stopwatch r0 = r2.stopwatch
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                long r0 = r0.elapsed(r1)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                r0 = 0
                return r0
        }

        public com.google.common.cache.LocalCache.ValueReference<K, V> getOldValue() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                int r0 = r0.getWeight()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                boolean r0 = r0.isActive()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 1
                return r0
        }

        public com.google.common.util.concurrent.ListenableFuture<V> loadFuture(K r2, com.google.common.cache.CacheLoader<? super K, V> r3) {
                r1 = this;
                com.google.common.base.Stopwatch r0 = r1.stopwatch     // Catch: java.lang.Throwable -> L1a
                r0.start()     // Catch: java.lang.Throwable -> L1a
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1a
                if (r0 != 0) goto L21
                java.lang.Object r2 = r3.load(r2)     // Catch: java.lang.Throwable -> L1a
                boolean r3 = r1.set(r2)     // Catch: java.lang.Throwable -> L1a
                if (r3 == 0) goto L1c
                com.google.common.util.concurrent.SettableFuture<V> r2 = r1.futureValue     // Catch: java.lang.Throwable -> L1a
                return r2
            L1a:
                r2 = move-exception
                goto L3b
            L1c:
                com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.immediateFuture(r2)     // Catch: java.lang.Throwable -> L1a
                return r2
            L21:
                com.google.common.util.concurrent.ListenableFuture r2 = r3.reload(r2, r0)     // Catch: java.lang.Throwable -> L1a
                if (r2 != 0) goto L2d
                r2 = 0
                com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.immediateFuture(r2)     // Catch: java.lang.Throwable -> L1a
                return r2
            L2d:
                com.google.common.cache.LocalCache$LoadingValueReference$1 r3 = new com.google.common.cache.LocalCache$LoadingValueReference$1     // Catch: java.lang.Throwable -> L1a
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L1a
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()     // Catch: java.lang.Throwable -> L1a
                com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.transform(r2, r3, r0)     // Catch: java.lang.Throwable -> L1a
                return r2
            L3b:
                boolean r3 = r1.setException(r2)
                if (r3 == 0) goto L44
                com.google.common.util.concurrent.SettableFuture<V> r3 = r1.futureValue
                goto L48
            L44:
                com.google.common.util.concurrent.ListenableFuture r3 = r1.fullyFailedFuture(r2)
            L48:
                boolean r2 = r2 instanceof java.lang.InterruptedException
                if (r2 == 0) goto L53
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r2.interrupt()
            L53:
                return r3
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
                r0 = this;
                if (r1 == 0) goto L6
                r0.set(r1)
                return
            L6:
                com.google.common.cache.LocalCache$ValueReference r1 = com.google.common.cache.LocalCache.unset()
                r0.oldValue = r1
                return
        }

        public boolean set(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
                r1 = this;
                com.google.common.util.concurrent.SettableFuture<V> r0 = r1.futureValue
                boolean r2 = r0.set(r2)
                return r2
        }

        public boolean setException(java.lang.Throwable r2) {
                r1 = this;
                com.google.common.util.concurrent.SettableFuture<V> r0 = r1.futureValue
                boolean r2 = r0.setException(r2)
                return r2
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.util.concurrent.SettableFuture<V> r0 = r1.futureValue
                java.lang.Object r0 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class LocalLoadingCache<K, V> extends com.google.common.cache.LocalCache.LocalManualCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        LocalLoadingCache(com.google.common.cache.CacheBuilder<? super K, ? super V> r2, com.google.common.cache.CacheLoader<? super K, V> r3) {
                r1 = this;
                com.google.common.cache.LocalCache r0 = new com.google.common.cache.LocalCache
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.cache.CacheLoader r3 = (com.google.common.cache.CacheLoader) r3
                r0.<init>(r2, r3)
                r2 = 0
                r1.<init>(r0, r2)
                return
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K r1) {
                r0 = this;
                java.lang.Object r1 = r0.getUnchecked(r1)
                return r1
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K r2) throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                java.lang.Object r2 = r0.getOrLoad(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r2) throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                com.google.common.collect.ImmutableMap r2 = r0.getAll(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K r2) {
                r1 = this;
                java.lang.Object r2 = r1.get(r2)     // Catch: java.util.concurrent.ExecutionException -> L5
                return r2
            L5:
                r2 = move-exception
                com.google.common.util.concurrent.UncheckedExecutionException r0 = new com.google.common.util.concurrent.UncheckedExecutionException
                java.lang.Throwable r2 = r2.getCause()
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K r2) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.refresh(r2)
                return
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        java.lang.Object writeReplace() {
                r2 = this;
                com.google.common.cache.LocalCache$LoadingSerializationProxy r0 = new com.google.common.cache.LocalCache$LoadingSerializationProxy
                com.google.common.cache.LocalCache<K, V> r1 = r2.localCache
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class LocalManualCache<K, V> implements com.google.common.cache.Cache<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 1;
        final com.google.common.cache.LocalCache<K, V> localCache;


        LocalManualCache(com.google.common.cache.CacheBuilder<? super K, ? super V> r3) {
                r2 = this;
                com.google.common.cache.LocalCache r0 = new com.google.common.cache.LocalCache
                r1 = 0
                r0.<init>(r3, r1)
                r2.<init>(r0)
                return
        }

        private LocalManualCache(com.google.common.cache.LocalCache<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.localCache = r1
                return
        }

        /* synthetic */ LocalManualCache(com.google.common.cache.LocalCache r1, com.google.common.cache.LocalCache.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.Cache
        public java.util.concurrent.ConcurrentMap<K, V> asMap() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                return r0
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.cleanUp()
                return
        }

        @Override // com.google.common.cache.Cache
        public V get(K r3, java.util.concurrent.Callable<? extends V> r4) throws java.util.concurrent.ExecutionException {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.cache.LocalCache<K, V> r0 = r2.localCache
                com.google.common.cache.LocalCache$LocalManualCache$1 r1 = new com.google.common.cache.LocalCache$LocalManualCache$1
                r1.<init>(r2, r4)
                java.lang.Object r3 = r0.get(r3, r1)
                return r3
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> r2) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                com.google.common.collect.ImmutableMap r2 = r0.getAllPresent(r2)
                return r2
        }

        @Override // com.google.common.cache.Cache
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public V getIfPresent(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                java.lang.Object r2 = r0.getIfPresent(r2)
                return r2
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(java.lang.Object r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.remove(r2)
                return
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.clear()
                return
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(java.lang.Iterable<?> r2) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.invalidateAll(r2)
                return
        }

        @Override // com.google.common.cache.Cache
        public void put(K r2, V r3) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.put(r2, r3)
                return
        }

        @Override // com.google.common.cache.Cache
        public void putAll(java.util.Map<? extends K, ? extends V> r2) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.putAll(r2)
                return
        }

        @Override // com.google.common.cache.Cache
        public long size() {
                r2 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r2.localCache
                long r0 = r0.longSize()
                return r0
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.cache.CacheStats stats() {
                r5 = this;
                com.google.common.cache.AbstractCache$SimpleStatsCounter r0 = new com.google.common.cache.AbstractCache$SimpleStatsCounter
                r0.<init>()
                com.google.common.cache.LocalCache<K, V> r1 = r5.localCache
                com.google.common.cache.AbstractCache$StatsCounter r1 = r1.globalStatsCounter
                r0.incrementBy(r1)
                com.google.common.cache.LocalCache<K, V> r1 = r5.localCache
                com.google.common.cache.LocalCache$Segment<K, V>[] r1 = r1.segments
                int r2 = r1.length
                r3 = 0
            L12:
                if (r3 >= r2) goto L1e
                r4 = r1[r3]
                com.google.common.cache.AbstractCache$StatsCounter r4 = r4.statsCounter
                r0.incrementBy(r4)
                int r3 = r3 + 1
                goto L12
            L1e:
                com.google.common.cache.CacheStats r0 = r0.snapshot()
                return r0
        }

        java.lang.Object writeReplace() {
                r2 = this;
                com.google.common.cache.LocalCache$ManualSerializationProxy r0 = new com.google.common.cache.LocalCache$ManualSerializationProxy
                com.google.common.cache.LocalCache<K, V> r1 = r2.localCache
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ManualSerializationProxy<K, V> extends com.google.common.cache.ForwardingCache<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        transient com.google.common.cache.Cache<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
        final com.google.common.cache.LocalCache.Strength keyStrength;
        final com.google.common.cache.CacheLoader<? super K, V> loader;
        final long maxWeight;
        final com.google.common.cache.RemovalListener<? super K, ? super V> removalListener;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final com.google.common.base.Ticker ticker;
        final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
        final com.google.common.cache.LocalCache.Strength valueStrength;
        final com.google.common.cache.Weigher<K, V> weigher;

        private ManualSerializationProxy(com.google.common.cache.LocalCache.Strength r2, com.google.common.cache.LocalCache.Strength r3, com.google.common.base.Equivalence<java.lang.Object> r4, com.google.common.base.Equivalence<java.lang.Object> r5, long r6, long r8, long r10, com.google.common.cache.Weigher<K, V> r12, int r13, com.google.common.cache.RemovalListener<? super K, ? super V> r14, com.google.common.base.Ticker r15, com.google.common.cache.CacheLoader<? super K, V> r16) {
                r1 = this;
                r1.<init>()
                r1.keyStrength = r2
                r1.valueStrength = r3
                r1.keyEquivalence = r4
                r1.valueEquivalence = r5
                r1.expireAfterWriteNanos = r6
                r1.expireAfterAccessNanos = r8
                r1.maxWeight = r10
                r1.weigher = r12
                r1.concurrencyLevel = r13
                r1.removalListener = r14
                com.google.common.base.Ticker r2 = com.google.common.base.Ticker.systemTicker()
                if (r15 == r2) goto L24
                com.google.common.base.Ticker r2 = com.google.common.cache.CacheBuilder.NULL_TICKER
                if (r15 != r2) goto L22
                goto L24
            L22:
                r0 = r15
                goto L26
            L24:
                r2 = 0
                r0 = r2
            L26:
                r1.ticker = r0
                r2 = r16
                r1.loader = r2
                return
        }

        ManualSerializationProxy(com.google.common.cache.LocalCache<K, V> r17) {
                r16 = this;
                r0 = r17
                com.google.common.cache.LocalCache$Strength r1 = r0.keyStrength
                com.google.common.cache.LocalCache$Strength r2 = r0.valueStrength
                com.google.common.base.Equivalence<java.lang.Object> r3 = r0.keyEquivalence
                com.google.common.base.Equivalence<java.lang.Object> r4 = r0.valueEquivalence
                long r5 = r0.expireAfterWriteNanos
                long r7 = r0.expireAfterAccessNanos
                long r9 = r0.maxWeight
                com.google.common.cache.Weigher<K, V> r11 = r0.weigher
                int r12 = r0.concurrencyLevel
                com.google.common.cache.RemovalListener<K, V> r13 = r0.removalListener
                com.google.common.base.Ticker r14 = r0.ticker
                com.google.common.cache.CacheLoader<? super K, V> r15 = r0.defaultLoader
                r0 = r16
                r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r15)
                return
        }

        private void readObject(java.io.ObjectInputStream r1) throws java.io.IOException, java.lang.ClassNotFoundException {
                r0 = this;
                r1.defaultReadObject()
                com.google.common.cache.CacheBuilder r1 = r0.recreateCacheBuilder()
                com.google.common.cache.Cache r1 = r1.build()
                r0.delegate = r1
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.cache.Cache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        protected com.google.common.cache.Cache<K, V> delegate() {
                r1 = this;
                com.google.common.cache.Cache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.cache.Cache r0 = r1.delegate()
                return r0
        }

        com.google.common.cache.CacheBuilder<K, V> recreateCacheBuilder() {
                r6 = this;
                com.google.common.cache.CacheBuilder r0 = com.google.common.cache.CacheBuilder.newBuilder()
                com.google.common.cache.LocalCache$Strength r1 = r6.keyStrength
                com.google.common.cache.CacheBuilder r0 = r0.setKeyStrength(r1)
                com.google.common.cache.LocalCache$Strength r1 = r6.valueStrength
                com.google.common.cache.CacheBuilder r0 = r0.setValueStrength(r1)
                com.google.common.base.Equivalence<java.lang.Object> r1 = r6.keyEquivalence
                com.google.common.cache.CacheBuilder r0 = r0.keyEquivalence(r1)
                com.google.common.base.Equivalence<java.lang.Object> r1 = r6.valueEquivalence
                com.google.common.cache.CacheBuilder r0 = r0.valueEquivalence(r1)
                int r1 = r6.concurrencyLevel
                com.google.common.cache.CacheBuilder r0 = r0.concurrencyLevel(r1)
                com.google.common.cache.RemovalListener<? super K, ? super V> r1 = r6.removalListener
                com.google.common.cache.CacheBuilder r0 = r0.removalListener(r1)
                r1 = 0
                r0.strictParsing = r1
                long r1 = r6.expireAfterWriteNanos
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L38
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.expireAfterWrite(r1, r5)
            L38:
                long r1 = r6.expireAfterAccessNanos
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L43
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.expireAfterAccess(r1, r3)
            L43:
                com.google.common.cache.Weigher<K, V> r1 = r6.weigher
                com.google.common.cache.CacheBuilder$OneWeigher r2 = com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE
                r3 = -1
                if (r1 == r2) goto L58
                r0.weigher(r1)
                long r1 = r6.maxWeight
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L61
                r0.maximumWeight(r1)
                goto L61
            L58:
                long r1 = r6.maxWeight
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L61
                r0.maximumSize(r1)
            L61:
                com.google.common.base.Ticker r1 = r6.ticker
                if (r1 == 0) goto L68
                r0.ticker(r1)
            L68:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum NullEntry extends java.lang.Enum<com.google.common.cache.LocalCache.NullEntry> implements com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ com.google.common.cache.LocalCache.NullEntry[] $VALUES = null;
        public static final com.google.common.cache.LocalCache.NullEntry INSTANCE = null;

        static {
                com.google.common.cache.LocalCache$NullEntry r0 = new com.google.common.cache.LocalCache$NullEntry
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.cache.LocalCache.NullEntry.INSTANCE = r0
                r1 = 1
                com.google.common.cache.LocalCache$NullEntry[] r1 = new com.google.common.cache.LocalCache.NullEntry[r1]
                r1[r2] = r0
                com.google.common.cache.LocalCache.NullEntry.$VALUES = r1
                return
        }

        NullEntry(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.cache.LocalCache.NullEntry valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.LocalCache$NullEntry> r0 = com.google.common.cache.LocalCache.NullEntry.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.LocalCache$NullEntry r1 = (com.google.common.cache.LocalCache.NullEntry) r1
                return r1
        }

        public static com.google.common.cache.LocalCache.NullEntry[] values() {
                com.google.common.cache.LocalCache$NullEntry[] r0 = com.google.common.cache.LocalCache.NullEntry.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.LocalCache$NullEntry[] r0 = (com.google.common.cache.LocalCache.NullEntry[]) r0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public java.lang.Object getKey() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInAccessQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInWriteQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInAccessQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInWriteQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> getValueReference() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Segment<K, V> extends java.util.concurrent.locks.ReentrantLock {

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> accessQueue;
        volatile int count;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final java.lang.ref.ReferenceQueue<K> keyReferenceQueue;

        @com.google.j2objc.annotations.Weak
        final com.google.common.cache.LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final java.util.concurrent.atomic.AtomicInteger readCount;
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> recencyQueue;
        final com.google.common.cache.AbstractCache.StatsCounter statsCounter;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        volatile java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> table;
        int threshold;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        long totalWeight;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final java.lang.ref.ReferenceQueue<V> valueReferenceQueue;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> writeQueue;


        Segment(com.google.common.cache.LocalCache<K, V> r2, int r3, long r4, com.google.common.cache.AbstractCache.StatsCounter r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.readCount = r0
                r1.map = r2
                r1.maxSegmentWeight = r4
                java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r6)
                com.google.common.cache.AbstractCache$StatsCounter r4 = (com.google.common.cache.AbstractCache.StatsCounter) r4
                r1.statsCounter = r4
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r1.newEntryArray(r3)
                r1.initTable(r3)
                boolean r3 = r2.usesKeyReferences()
                r4 = 0
                if (r3 == 0) goto L2a
                java.lang.ref.ReferenceQueue r3 = new java.lang.ref.ReferenceQueue
                r3.<init>()
                goto L2b
            L2a:
                r3 = r4
            L2b:
                r1.keyReferenceQueue = r3
                boolean r3 = r2.usesValueReferences()
                if (r3 == 0) goto L38
                java.lang.ref.ReferenceQueue r4 = new java.lang.ref.ReferenceQueue
                r4.<init>()
            L38:
                r1.valueReferenceQueue = r4
                boolean r3 = r2.usesAccessQueue()
                if (r3 == 0) goto L46
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
                r3.<init>()
                goto L4a
            L46:
                java.util.Queue r3 = com.google.common.cache.LocalCache.discardingQueue()
            L4a:
                r1.recencyQueue = r3
                boolean r3 = r2.usesWriteQueue()
                if (r3 == 0) goto L58
                com.google.common.cache.LocalCache$WriteQueue r3 = new com.google.common.cache.LocalCache$WriteQueue
                r3.<init>()
                goto L5c
            L58:
                java.util.Queue r3 = com.google.common.cache.LocalCache.discardingQueue()
            L5c:
                r1.writeQueue = r3
                boolean r2 = r2.usesAccessQueue()
                if (r2 == 0) goto L6a
                com.google.common.cache.LocalCache$AccessQueue r2 = new com.google.common.cache.LocalCache$AccessQueue
                r2.<init>()
                goto L6e
            L6a:
                java.util.Queue r2 = com.google.common.cache.LocalCache.discardingQueue()
            L6e:
                r1.accessQueue = r2
                return
        }

        void cleanUp() {
                r2 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r2.map
                com.google.common.base.Ticker r0 = r0.ticker
                long r0 = r0.read()
                r2.runLockedCleanup(r0)
                r2.runUnlockedCleanup()
                return
        }

        void clear() {
                r11 = this;
                int r0 = r11.count
                if (r0 == 0) goto L9d
                r11.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r11.map     // Catch: java.lang.Throwable -> L43
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L43
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L43
                r11.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L43
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r11.table     // Catch: java.lang.Throwable -> L43
                r1 = 0
                r2 = 0
            L16:
                int r3 = r0.length()     // Catch: java.lang.Throwable -> L43
                if (r2 >= r3) goto L66
                java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L43
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3     // Catch: java.lang.Throwable -> L43
            L22:
                if (r3 == 0) goto L62
                com.google.common.cache.LocalCache$ValueReference r4 = r3.getValueReference()     // Catch: java.lang.Throwable -> L43
                boolean r4 = r4.isActive()     // Catch: java.lang.Throwable -> L43
                if (r4 == 0) goto L5c
                java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L43
                com.google.common.cache.LocalCache$ValueReference r4 = r3.getValueReference()     // Catch: java.lang.Throwable -> L43
                java.lang.Object r8 = r4.get()     // Catch: java.lang.Throwable -> L43
                if (r6 == 0) goto L46
                if (r8 != 0) goto L3f
                goto L46
            L3f:
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L43
            L41:
                r10 = r4
                goto L49
            L43:
                r0 = move-exception
                r5 = r11
                goto L96
            L46:
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L43
                goto L41
            L49:
                int r7 = r3.getHash()     // Catch: java.lang.Throwable -> L43
                com.google.common.cache.LocalCache$ValueReference r4 = r3.getValueReference()     // Catch: java.lang.Throwable -> L43
                int r9 = r4.getWeight()     // Catch: java.lang.Throwable -> L43
                r5 = r11
                r5.enqueueNotification(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5a
                goto L5d
            L5a:
                r0 = move-exception
                goto L96
            L5c:
                r5 = r11
            L5d:
                com.google.common.cache.ReferenceEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L5a
                goto L22
            L62:
                r5 = r11
                int r2 = r2 + 1
                goto L16
            L66:
                r5 = r11
                r2 = 0
            L68:
                int r3 = r0.length()     // Catch: java.lang.Throwable -> L5a
                if (r2 >= r3) goto L75
                r3 = 0
                r0.set(r2, r3)     // Catch: java.lang.Throwable -> L5a
                int r2 = r2 + 1
                goto L68
            L75:
                r11.clearReferenceQueues()     // Catch: java.lang.Throwable -> L5a
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r5.writeQueue     // Catch: java.lang.Throwable -> L5a
                r0.clear()     // Catch: java.lang.Throwable -> L5a
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r5.accessQueue     // Catch: java.lang.Throwable -> L5a
                r0.clear()     // Catch: java.lang.Throwable -> L5a
                java.util.concurrent.atomic.AtomicInteger r0 = r5.readCount     // Catch: java.lang.Throwable -> L5a
                r0.set(r1)     // Catch: java.lang.Throwable -> L5a
                int r0 = r5.modCount     // Catch: java.lang.Throwable -> L5a
                int r0 = r0 + 1
                r5.modCount = r0     // Catch: java.lang.Throwable -> L5a
                r5.count = r1     // Catch: java.lang.Throwable -> L5a
                r11.unlock()
                r11.postWriteCleanup()
                return
            L96:
                r11.unlock()
                r11.postWriteCleanup()
                throw r0
            L9d:
                r5 = r11
                return
        }

        void clearKeyReferenceQueue() {
                r1 = this;
            L0:
                java.lang.ref.ReferenceQueue<K> r0 = r1.keyReferenceQueue
                java.lang.ref.Reference r0 = r0.poll()
                if (r0 == 0) goto L9
                goto L0
            L9:
                return
        }

        void clearReferenceQueues() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.usesKeyReferences()
                if (r0 == 0) goto Lb
                r1.clearKeyReferenceQueue()
            Lb:
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.usesValueReferences()
                if (r0 == 0) goto L16
                r1.clearValueReferenceQueue()
            L16:
                return
        }

        void clearValueReferenceQueue() {
                r1 = this;
            L0:
                java.lang.ref.ReferenceQueue<V> r0 = r1.valueReferenceQueue
                java.lang.ref.Reference r0 = r0.poll()
                if (r0 == 0) goto L9
                goto L0
            L9:
                return
        }

        boolean containsKey(java.lang.Object r5, int r6) {
                r4 = this;
                int r0 = r4.count     // Catch: java.lang.Throwable -> L26
                r1 = 0
                if (r0 == 0) goto L28
                com.google.common.cache.LocalCache<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L26
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L26
                long r2 = r0.read()     // Catch: java.lang.Throwable -> L26
                com.google.common.cache.ReferenceEntry r5 = r4.getLiveEntry(r5, r6, r2)     // Catch: java.lang.Throwable -> L26
                if (r5 != 0) goto L17
                r4.postReadCleanup()
                return r1
            L17:
                com.google.common.cache.LocalCache$ValueReference r5 = r5.getValueReference()     // Catch: java.lang.Throwable -> L26
                java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L26
                if (r5 == 0) goto L22
                r1 = 1
            L22:
                r4.postReadCleanup()
                return r1
            L26:
                r5 = move-exception
                goto L2c
            L28:
                r4.postReadCleanup()
                return r1
            L2c:
                r4.postReadCleanup()
                throw r5
        }

        @com.google.common.annotations.VisibleForTesting
        boolean containsValue(java.lang.Object r10) {
                r9 = this;
                int r0 = r9.count     // Catch: java.lang.Throwable -> L39
                r1 = 0
                if (r0 == 0) goto L3e
                com.google.common.cache.LocalCache<K, V> r0 = r9.map     // Catch: java.lang.Throwable -> L39
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L39
                long r2 = r0.read()     // Catch: java.lang.Throwable -> L39
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r9.table     // Catch: java.lang.Throwable -> L39
                int r4 = r0.length()     // Catch: java.lang.Throwable -> L39
                r5 = 0
            L14:
                if (r5 >= r4) goto L3e
                java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L39
                com.google.common.cache.ReferenceEntry r6 = (com.google.common.cache.ReferenceEntry) r6     // Catch: java.lang.Throwable -> L39
            L1c:
                if (r6 == 0) goto L3b
                java.lang.Object r7 = r9.getLiveValue(r6, r2)     // Catch: java.lang.Throwable -> L39
                if (r7 != 0) goto L25
                goto L34
            L25:
                com.google.common.cache.LocalCache<K, V> r8 = r9.map     // Catch: java.lang.Throwable -> L39
                com.google.common.base.Equivalence<java.lang.Object> r8 = r8.valueEquivalence     // Catch: java.lang.Throwable -> L39
                boolean r7 = r8.equivalent(r10, r7)     // Catch: java.lang.Throwable -> L39
                if (r7 == 0) goto L34
                r9.postReadCleanup()
                r10 = 1
                return r10
            L34:
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L39
                goto L1c
            L39:
                r10 = move-exception
                goto L42
            L3b:
                int r5 = r5 + 1
                goto L14
            L3e:
                r9.postReadCleanup()
                return r1
            L42:
                r9.postReadCleanup()
                throw r10
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.ReferenceEntry<K, V> r5, com.google.common.cache.ReferenceEntry<K, V> r6) {
                r4 = this;
                java.lang.Object r0 = r5.getKey()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                com.google.common.cache.LocalCache$ValueReference r0 = r5.getValueReference()
                java.lang.Object r2 = r0.get()
                if (r2 != 0) goto L19
                boolean r3 = r0.isActive()
                if (r3 == 0) goto L19
                return r1
            L19:
                com.google.common.cache.LocalCache<K, V> r1 = r4.map
                com.google.common.cache.LocalCache$EntryFactory r1 = r1.entryFactory
                com.google.common.cache.ReferenceEntry r5 = r1.copyEntry(r4, r5, r6)
                java.lang.ref.ReferenceQueue<V> r6 = r4.valueReferenceQueue
                com.google.common.cache.LocalCache$ValueReference r6 = r0.copyFor(r6, r2, r5)
                r5.setValueReference(r6)
                return r5
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void drainKeyReferenceQueue() {
                r3 = this;
                r0 = 0
            L1:
                java.lang.ref.ReferenceQueue<K> r1 = r3.keyReferenceQueue
                java.lang.ref.Reference r1 = r1.poll()
                if (r1 == 0) goto L16
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1
                com.google.common.cache.LocalCache<K, V> r2 = r3.map
                r2.reclaimKey(r1)
                int r0 = r0 + 1
                r1 = 16
                if (r0 != r1) goto L1
            L16:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void drainRecencyQueue() {
                r2 = this;
            L0:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r2.recencyQueue
                java.lang.Object r0 = r0.poll()
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
                if (r0 == 0) goto L18
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r1 = r2.accessQueue
                boolean r1 = r1.contains(r0)
                if (r1 == 0) goto L0
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r1 = r2.accessQueue
                r1.add(r0)
                goto L0
            L18:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void drainReferenceQueues() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.usesKeyReferences()
                if (r0 == 0) goto Lb
                r1.drainKeyReferenceQueue()
            Lb:
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.usesValueReferences()
                if (r0 == 0) goto L16
                r1.drainValueReferenceQueue()
            L16:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void drainValueReferenceQueue() {
                r3 = this;
                r0 = 0
            L1:
                java.lang.ref.ReferenceQueue<V> r1 = r3.valueReferenceQueue
                java.lang.ref.Reference r1 = r1.poll()
                if (r1 == 0) goto L16
                com.google.common.cache.LocalCache$ValueReference r1 = (com.google.common.cache.LocalCache.ValueReference) r1
                com.google.common.cache.LocalCache<K, V> r2 = r3.map
                r2.reclaimValue(r1)
                int r0 = r0 + 1
                r1 = 16
                if (r0 != r1) goto L1
            L16:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void enqueueNotification(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r5, int r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r7, int r8, com.google.common.cache.RemovalCause r9) {
                r4 = this;
                long r0 = r4.totalWeight
                long r2 = (long) r8
                long r0 = r0 - r2
                r4.totalWeight = r0
                boolean r6 = r9.wasEvicted()
                if (r6 == 0) goto L11
                com.google.common.cache.AbstractCache$StatsCounter r6 = r4.statsCounter
                r6.recordEviction()
            L11:
                com.google.common.cache.LocalCache<K, V> r6 = r4.map
                java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> r6 = r6.removalNotificationQueue
                java.util.Queue<?> r8 = com.google.common.cache.LocalCache.DISCARDING_QUEUE
                if (r6 == r8) goto L24
                com.google.common.cache.RemovalNotification r5 = com.google.common.cache.RemovalNotification.create(r5, r7, r9)
                com.google.common.cache.LocalCache<K, V> r6 = r4.map
                java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> r6 = r6.removalNotificationQueue
                r6.offer(r5)
            L24:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void evictEntries(com.google.common.cache.ReferenceEntry<K, V> r6) {
                r5 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r5.map
                boolean r0 = r0.evictsBySize()
                if (r0 != 0) goto L9
                goto L4d
            L9:
                r5.drainRecencyQueue()
                com.google.common.cache.LocalCache$ValueReference r0 = r6.getValueReference()
                int r0 = r0.getWeight()
                long r0 = (long) r0
                long r2 = r5.maxSegmentWeight
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L2e
                int r0 = r6.getHash()
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.SIZE
                boolean r6 = r5.removeEntry(r6, r0, r1)
                if (r6 == 0) goto L28
                goto L2e
            L28:
                java.lang.AssertionError r6 = new java.lang.AssertionError
                r6.<init>()
                throw r6
            L2e:
                long r0 = r5.totalWeight
                long r2 = r5.maxSegmentWeight
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L4d
                com.google.common.cache.ReferenceEntry r6 = r5.getNextEvictable()
                int r0 = r6.getHash()
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.SIZE
                boolean r6 = r5.removeEntry(r6, r0, r1)
                if (r6 == 0) goto L47
                goto L2e
            L47:
                java.lang.AssertionError r6 = new java.lang.AssertionError
                r6.<init>()
                throw r6
            L4d:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void expand() {
                r11 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r11.table
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
                if (r5 >= r1) goto L75
                java.lang.Object r6 = r0.get(r5)
                com.google.common.cache.ReferenceEntry r6 = (com.google.common.cache.ReferenceEntry) r6
                if (r6 == 0) goto L72
                com.google.common.cache.ReferenceEntry r7 = r6.getNext()
                int r8 = r6.getHash()
                r8 = r8 & r4
                if (r7 != 0) goto L3d
                r3.set(r8, r6)
                goto L72
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
                com.google.common.cache.ReferenceEntry r7 = r7.getNext()
                goto L3e
            L4e:
                r3.set(r8, r9)
            L51:
                if (r6 == r9) goto L72
                int r7 = r6.getHash()
                r7 = r7 & r4
                java.lang.Object r8 = r3.get(r7)
                com.google.common.cache.ReferenceEntry r8 = (com.google.common.cache.ReferenceEntry) r8
                com.google.common.cache.ReferenceEntry r8 = r11.copyEntry(r6, r8)
                if (r8 == 0) goto L68
                r3.set(r7, r8)
                goto L6d
            L68:
                r11.removeCollectedEntry(r6)
                int r2 = r2 + (-1)
            L6d:
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()
                goto L51
            L72:
                int r5 = r5 + 1
                goto L24
            L75:
                r11.table = r3
                r11.count = r2
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void expireEntries(long r4) {
                r3 = this;
                r3.drainRecencyQueue()
            L3:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r3.writeQueue
                java.lang.Object r0 = r0.peek()
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
                if (r0 == 0) goto L28
                com.google.common.cache.LocalCache<K, V> r1 = r3.map
                boolean r1 = r1.isExpired(r0, r4)
                if (r1 == 0) goto L28
                int r1 = r0.getHash()
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.EXPIRED
                boolean r0 = r3.removeEntry(r0, r1, r2)
                if (r0 == 0) goto L22
                goto L3
            L22:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                r4.<init>()
                throw r4
            L28:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r3.accessQueue
                java.lang.Object r0 = r0.peek()
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
                if (r0 == 0) goto L4d
                com.google.common.cache.LocalCache<K, V> r1 = r3.map
                boolean r1 = r1.isExpired(r0, r4)
                if (r1 == 0) goto L4d
                int r1 = r0.getHash()
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.EXPIRED
                boolean r0 = r3.removeEntry(r0, r1, r2)
                if (r0 == 0) goto L47
                goto L28
            L47:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                r4.<init>()
                throw r4
            L4d:
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V get(java.lang.Object r11, int r12) {
                r10 = this;
                int r0 = r10.count     // Catch: java.lang.Throwable -> L36
                r1 = 0
                if (r0 == 0) goto L3c
                com.google.common.cache.LocalCache<K, V> r0 = r10.map     // Catch: java.lang.Throwable -> L36
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L36
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L36
                com.google.common.cache.ReferenceEntry r3 = r10.getLiveEntry(r11, r12, r7)     // Catch: java.lang.Throwable -> L36
                if (r3 != 0) goto L17
                r10.postReadCleanup()
                return r1
            L17:
                com.google.common.cache.LocalCache$ValueReference r11 = r3.getValueReference()     // Catch: java.lang.Throwable -> L36
                java.lang.Object r6 = r11.get()     // Catch: java.lang.Throwable -> L36
                if (r6 == 0) goto L39
                r10.recordRead(r3, r7)     // Catch: java.lang.Throwable -> L36
                java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L36
                com.google.common.cache.LocalCache<K, V> r11 = r10.map     // Catch: java.lang.Throwable -> L36
                com.google.common.cache.CacheLoader<? super K, V> r9 = r11.defaultLoader     // Catch: java.lang.Throwable -> L36
                r2 = r10
                r5 = r12
                java.lang.Object r11 = r2.scheduleRefresh(r3, r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L36
                r10.postReadCleanup()
                return r11
            L36:
                r0 = move-exception
                r11 = r0
                goto L40
            L39:
                r10.tryDrainReferenceQueues()     // Catch: java.lang.Throwable -> L36
            L3c:
                r10.postReadCleanup()
                return r1
            L40:
                r10.postReadCleanup()
                throw r11
        }

        V get(K r10, int r11, com.google.common.cache.CacheLoader<? super K, V> r12) throws java.util.concurrent.ExecutionException {
                r9 = this;
                com.google.common.base.Preconditions.checkNotNull(r10)
                com.google.common.base.Preconditions.checkNotNull(r12)
                int r0 = r9.count     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                if (r0 == 0) goto L55
                com.google.common.cache.ReferenceEntry r2 = r9.getEntry(r10, r11)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                if (r2 == 0) goto L55
                com.google.common.cache.LocalCache<K, V> r0 = r9.map     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                long r6 = r0.read()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                java.lang.Object r5 = r9.getLiveValue(r2, r6)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                if (r5 == 0) goto L3f
                r9.recordRead(r2, r6)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                com.google.common.cache.AbstractCache$StatsCounter r0 = r9.statsCounter     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                r1 = 1
                r0.recordHits(r1)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
                r1 = r9
                r3 = r10
                r4 = r11
                r8 = r12
                java.lang.Object r10 = r1.scheduleRefresh(r2, r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L33 java.util.concurrent.ExecutionException -> L36
                r9.postReadCleanup()
                return r10
            L33:
                r0 = move-exception
            L34:
                r10 = r0
                goto L7c
            L36:
                r0 = move-exception
            L37:
                r10 = r0
                goto L61
            L39:
                r0 = move-exception
                r1 = r9
                goto L34
            L3c:
                r0 = move-exception
                r1 = r9
                goto L37
            L3f:
                r1 = r9
                r3 = r10
                r4 = r11
                r8 = r12
                com.google.common.cache.LocalCache$ValueReference r10 = r2.getValueReference()     // Catch: java.lang.Throwable -> L33 java.util.concurrent.ExecutionException -> L36
                boolean r11 = r10.isLoading()     // Catch: java.lang.Throwable -> L33 java.util.concurrent.ExecutionException -> L36
                if (r11 == 0) goto L59
                java.lang.Object r10 = r9.waitForLoadingValue(r2, r3, r10)     // Catch: java.lang.Throwable -> L33 java.util.concurrent.ExecutionException -> L36
                r9.postReadCleanup()
                return r10
            L55:
                r1 = r9
                r3 = r10
                r4 = r11
                r8 = r12
            L59:
                java.lang.Object r10 = r9.lockedGetOrLoad(r3, r4, r8)     // Catch: java.lang.Throwable -> L33 java.util.concurrent.ExecutionException -> L36
                r9.postReadCleanup()
                return r10
            L61:
                java.lang.Throwable r11 = r10.getCause()     // Catch: java.lang.Throwable -> L33
                boolean r12 = r11 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L33
                if (r12 != 0) goto L74
                boolean r12 = r11 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L33
                if (r12 == 0) goto L73
                com.google.common.util.concurrent.UncheckedExecutionException r10 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L33
                r10.<init>(r11)     // Catch: java.lang.Throwable -> L33
                throw r10     // Catch: java.lang.Throwable -> L33
            L73:
                throw r10     // Catch: java.lang.Throwable -> L33
            L74:
                com.google.common.util.concurrent.ExecutionError r10 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> L33
                java.lang.Error r11 = (java.lang.Error) r11     // Catch: java.lang.Throwable -> L33
                r10.<init>(r11)     // Catch: java.lang.Throwable -> L33
                throw r10     // Catch: java.lang.Throwable -> L33
            L7c:
                r9.postReadCleanup()
                throw r10
        }

        V getAndRecordStats(K r4, int r5, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r6, com.google.common.util.concurrent.ListenableFuture<V> r7) throws java.util.concurrent.ExecutionException {
                r3 = this;
                java.lang.Object r7 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r7)     // Catch: java.lang.Throwable -> L31
                if (r7 == 0) goto L15
                com.google.common.cache.AbstractCache$StatsCounter r0 = r3.statsCounter     // Catch: java.lang.Throwable -> L13
                long r1 = r6.elapsedNanos()     // Catch: java.lang.Throwable -> L13
                r0.recordLoadSuccess(r1)     // Catch: java.lang.Throwable -> L13
                r3.storeLoadedValue(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
                return r7
            L13:
                r0 = move-exception
                goto L33
            L15:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch: java.lang.Throwable -> L13
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.append(r2)     // Catch: java.lang.Throwable -> L13
                r1.append(r4)     // Catch: java.lang.Throwable -> L13
                java.lang.String r2 = "."
                r1.append(r2)     // Catch: java.lang.Throwable -> L13
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
                throw r0     // Catch: java.lang.Throwable -> L13
            L31:
                r0 = move-exception
                r7 = 0
            L33:
                if (r7 != 0) goto L41
                com.google.common.cache.AbstractCache$StatsCounter r7 = r3.statsCounter
                long r1 = r6.elapsedNanos()
                r7.recordLoadException(r1)
                r3.removeLoadingValue(r4, r5, r6)
            L41:
                throw r0
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.ReferenceEntry<K, V> getEntry(java.lang.Object r4, int r5) {
                r3 = this;
                com.google.common.cache.ReferenceEntry r0 = r3.getFirst(r5)
            L4:
                if (r0 == 0) goto L27
                int r1 = r0.getHash()
                if (r1 == r5) goto Ld
                goto L22
            Ld:
                java.lang.Object r1 = r0.getKey()
                if (r1 != 0) goto L17
                r3.tryDrainReferenceQueues()
                goto L22
            L17:
                com.google.common.cache.LocalCache<K, V> r2 = r3.map
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.keyEquivalence
                boolean r1 = r2.equivalent(r4, r1)
                if (r1 == 0) goto L22
                return r0
            L22:
                com.google.common.cache.ReferenceEntry r0 = r0.getNext()
                goto L4
            L27:
                r4 = 0
                return r4
        }

        com.google.common.cache.ReferenceEntry<K, V> getFirst(int r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r2.table
                int r1 = r0.length()
                int r1 = r1 + (-1)
                r3 = r3 & r1
                java.lang.Object r3 = r0.get(r3)
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3
                return r3
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.ReferenceEntry<K, V> getLiveEntry(java.lang.Object r2, int r3, long r4) {
                r1 = this;
                com.google.common.cache.ReferenceEntry r2 = r1.getEntry(r2, r3)
                r3 = 0
                if (r2 != 0) goto L8
                return r3
            L8:
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.isExpired(r2, r4)
                if (r0 == 0) goto L14
                r1.tryExpireEntries(r4)
                return r3
            L14:
                return r2
        }

        V getLiveValue(com.google.common.cache.ReferenceEntry<K, V> r4, long r5) {
                r3 = this;
                java.lang.Object r0 = r4.getKey()
                r1 = 0
                if (r0 != 0) goto Lb
                r3.tryDrainReferenceQueues()
                return r1
            Lb:
                com.google.common.cache.LocalCache$ValueReference r0 = r4.getValueReference()
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L19
                r3.tryDrainReferenceQueues()
                return r1
            L19:
                com.google.common.cache.LocalCache<K, V> r2 = r3.map
                boolean r4 = r2.isExpired(r4, r5)
                if (r4 == 0) goto L25
                r3.tryExpireEntries(r5)
                return r1
            L25:
                return r0
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        com.google.common.cache.ReferenceEntry<K, V> getNextEvictable() {
                r3 = this;
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r3.accessQueue
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r0.next()
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1
                com.google.common.cache.LocalCache$ValueReference r2 = r1.getValueReference()
                int r2 = r2.getWeight()
                if (r2 <= 0) goto L6
                return r1
            L1d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        void initTable(java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r7) {
                r6 = this;
                int r0 = r7.length()
                int r0 = r0 * 3
                int r0 = r0 / 4
                r6.threshold = r0
                com.google.common.cache.LocalCache<K, V> r0 = r6.map
                boolean r0 = r0.customWeigher()
                if (r0 != 0) goto L1f
                int r0 = r6.threshold
                long r1 = (long) r0
                long r3 = r6.maxSegmentWeight
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L1f
                int r0 = r0 + 1
                r6.threshold = r0
            L1f:
                r6.table = r7
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.LocalCache.LoadingValueReference<K, V> insertLoadingValueReference(K r9, int r10, boolean r11) {
                r8 = this;
                r8.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r8.map     // Catch: java.lang.Throwable -> L50
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L50
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L50
                r8.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L50
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r2 = r8.table     // Catch: java.lang.Throwable -> L50
                int r3 = r2.length()     // Catch: java.lang.Throwable -> L50
                int r3 = r3 + (-1)
                r3 = r3 & r10
                java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L50
                com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> L50
                r5 = r4
            L1e:
                if (r5 == 0) goto L74
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L50
                int r7 = r5.getHash()     // Catch: java.lang.Throwable -> L50
                if (r7 != r10) goto L6f
                if (r6 == 0) goto L6f
                com.google.common.cache.LocalCache<K, V> r7 = r8.map     // Catch: java.lang.Throwable -> L50
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L50
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L50
                if (r6 == 0) goto L6f
                com.google.common.cache.LocalCache$ValueReference r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L50
                boolean r10 = r9.isLoading()     // Catch: java.lang.Throwable -> L50
                if (r10 != 0) goto L67
                if (r11 == 0) goto L52
                long r10 = r5.getWriteTime()     // Catch: java.lang.Throwable -> L50
                long r0 = r0 - r10
                com.google.common.cache.LocalCache<K, V> r10 = r8.map     // Catch: java.lang.Throwable -> L50
                long r10 = r10.refreshNanos     // Catch: java.lang.Throwable -> L50
                int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
                if (r2 >= 0) goto L52
                goto L67
            L50:
                r9 = move-exception
                goto L90
            L52:
                int r10 = r8.modCount     // Catch: java.lang.Throwable -> L50
                int r10 = r10 + 1
                r8.modCount = r10     // Catch: java.lang.Throwable -> L50
                com.google.common.cache.LocalCache$LoadingValueReference r10 = new com.google.common.cache.LocalCache$LoadingValueReference     // Catch: java.lang.Throwable -> L50
                r10.<init>(r9)     // Catch: java.lang.Throwable -> L50
                r5.setValueReference(r10)     // Catch: java.lang.Throwable -> L50
                r8.unlock()
                r8.postWriteCleanup()
                return r10
            L67:
                r8.unlock()
                r8.postWriteCleanup()
                r9 = 0
                return r9
            L6f:
                com.google.common.cache.ReferenceEntry r5 = r5.getNext()     // Catch: java.lang.Throwable -> L50
                goto L1e
            L74:
                int r11 = r8.modCount     // Catch: java.lang.Throwable -> L50
                int r11 = r11 + 1
                r8.modCount = r11     // Catch: java.lang.Throwable -> L50
                com.google.common.cache.LocalCache$LoadingValueReference r11 = new com.google.common.cache.LocalCache$LoadingValueReference     // Catch: java.lang.Throwable -> L50
                r11.<init>()     // Catch: java.lang.Throwable -> L50
                com.google.common.cache.ReferenceEntry r9 = r8.newEntry(r9, r10, r4)     // Catch: java.lang.Throwable -> L50
                r9.setValueReference(r11)     // Catch: java.lang.Throwable -> L50
                r2.set(r3, r9)     // Catch: java.lang.Throwable -> L50
                r8.unlock()
                r8.postWriteCleanup()
                return r11
            L90:
                r8.unlock()
                r8.postWriteCleanup()
                throw r9
        }

        com.google.common.util.concurrent.ListenableFuture<V> loadAsync(K r7, int r8, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r9, com.google.common.cache.CacheLoader<? super K, V> r10) {
                r6 = this;
                com.google.common.util.concurrent.ListenableFuture r5 = r9.loadFuture(r7, r10)
                com.google.common.cache.LocalCache$Segment$1 r0 = new com.google.common.cache.LocalCache$Segment$1
                r1 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.util.concurrent.Executor r7 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r5.addListener(r0, r7)
                return r5
        }

        V loadSync(K r1, int r2, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r3, com.google.common.cache.CacheLoader<? super K, V> r4) throws java.util.concurrent.ExecutionException {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r4 = r3.loadFuture(r1, r4)
                java.lang.Object r1 = r0.getAndRecordStats(r1, r2, r3, r4)
                return r1
        }

        V lockedGetOrLoad(K r16, int r17, com.google.common.cache.CacheLoader<? super K, V> r18) throws java.util.concurrent.ExecutionException {
                r15 = this;
                r0 = r16
                r3 = r17
                r15.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r15.map     // Catch: java.lang.Throwable -> L63
                com.google.common.base.Ticker r1 = r1.ticker     // Catch: java.lang.Throwable -> L63
                long r1 = r1.read()     // Catch: java.lang.Throwable -> L63
                r15.preWriteCleanup(r1)     // Catch: java.lang.Throwable -> L63
                int r4 = r15.count     // Catch: java.lang.Throwable -> L63
                r7 = 1
                int r8 = r4 + (-1)
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r9 = r15.table     // Catch: java.lang.Throwable -> L63
                int r4 = r9.length()     // Catch: java.lang.Throwable -> L63
                int r4 = r4 - r7
                r10 = r3 & r4
                java.lang.Object r4 = r9.get(r10)     // Catch: java.lang.Throwable -> L63
                r11 = r4
                com.google.common.cache.ReferenceEntry r11 = (com.google.common.cache.ReferenceEntry) r11     // Catch: java.lang.Throwable -> L63
                r12 = r11
            L28:
                r13 = 0
                if (r12 == 0) goto L9e
                r4 = r1
                java.lang.Object r2 = r12.getKey()     // Catch: java.lang.Throwable -> L63
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> L63
                if (r1 != r3) goto L97
                if (r2 == 0) goto L97
                com.google.common.cache.LocalCache<K, V> r1 = r15.map     // Catch: java.lang.Throwable -> L63
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.keyEquivalence     // Catch: java.lang.Throwable -> L63
                boolean r1 = r1.equivalent(r0, r2)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L97
                com.google.common.cache.LocalCache$ValueReference r14 = r12.getValueReference()     // Catch: java.lang.Throwable -> L63
                boolean r1 = r14.isLoading()     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L4f
                r1 = 0
                r2 = 0
                goto La0
            L4f:
                r5 = r4
                java.lang.Object r4 = r14.get()     // Catch: java.lang.Throwable -> L63
                if (r4 != 0) goto L66
                int r5 = r14.getWeight()     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L63
                r1 = r15
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L63
                r3 = r17
                goto L7a
            L63:
                r0 = move-exception
                goto Ldc
            L66:
                com.google.common.cache.LocalCache<K, V> r3 = r15.map     // Catch: java.lang.Throwable -> L63
                boolean r3 = r3.isExpired(r12, r5)     // Catch: java.lang.Throwable -> L63
                if (r3 == 0) goto L88
                int r5 = r14.getWeight()     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.EXPIRED     // Catch: java.lang.Throwable -> L63
                r1 = r15
                r3 = r17
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L63
            L7a:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r2 = r15.writeQueue     // Catch: java.lang.Throwable -> L63
                r2.remove(r12)     // Catch: java.lang.Throwable -> L63
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r2 = r15.accessQueue     // Catch: java.lang.Throwable -> L63
                r2.remove(r12)     // Catch: java.lang.Throwable -> L63
                r15.count = r8     // Catch: java.lang.Throwable -> L63
            L86:
                r2 = 1
                goto La0
            L88:
                r15.recordLockedRead(r12, r5)     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.AbstractCache$StatsCounter r0 = r15.statsCounter     // Catch: java.lang.Throwable -> L63
                r0.recordHits(r7)     // Catch: java.lang.Throwable -> L63
                r15.unlock()
                r15.postWriteCleanup()
                return r4
            L97:
                r5 = r4
                com.google.common.cache.ReferenceEntry r12 = r12.getNext()     // Catch: java.lang.Throwable -> L63
                r1 = r5
                goto L28
            L9e:
                r14 = r13
                goto L86
            La0:
                if (r2 == 0) goto Lb7
                com.google.common.cache.LocalCache$LoadingValueReference r13 = new com.google.common.cache.LocalCache$LoadingValueReference     // Catch: java.lang.Throwable -> L63
                r13.<init>()     // Catch: java.lang.Throwable -> L63
                if (r12 != 0) goto Lb4
                com.google.common.cache.ReferenceEntry r12 = r15.newEntry(r0, r3, r11)     // Catch: java.lang.Throwable -> L63
                r12.setValueReference(r13)     // Catch: java.lang.Throwable -> L63
                r9.set(r10, r12)     // Catch: java.lang.Throwable -> L63
                goto Lb7
            Lb4:
                r12.setValueReference(r13)     // Catch: java.lang.Throwable -> L63
            Lb7:
                r15.unlock()
                r15.postWriteCleanup()
                if (r2 == 0) goto Ld7
                monitor-enter(r12)     // Catch: java.lang.Throwable -> Ld0
                r2 = r18
                java.lang.Object r0 = r15.loadSync(r0, r3, r13, r2)     // Catch: java.lang.Throwable -> Lcd
                monitor-exit(r12)     // Catch: java.lang.Throwable -> Lcd
                com.google.common.cache.AbstractCache$StatsCounter r2 = r15.statsCounter
                r2.recordMisses(r7)
                return r0
            Lcd:
                r0 = move-exception
                monitor-exit(r12)     // Catch: java.lang.Throwable -> Lcd
                throw r0     // Catch: java.lang.Throwable -> Ld0
            Ld0:
                r0 = move-exception
                com.google.common.cache.AbstractCache$StatsCounter r2 = r15.statsCounter
                r2.recordMisses(r7)
                throw r0
            Ld7:
                java.lang.Object r0 = r15.waitForLoadingValue(r12, r0, r14)
                return r0
            Ldc:
                r15.unlock()
                r15.postWriteCleanup()
                throw r0
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        com.google.common.cache.ReferenceEntry<K, V> newEntry(K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                com.google.common.cache.LocalCache$EntryFactory r0 = r0.entryFactory
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.cache.ReferenceEntry r2 = r0.newEntry(r1, r2, r3, r4)
                return r2
        }

        java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> newEntryArray(int r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
                r0.<init>(r2)
                return r0
        }

        void postReadCleanup() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.readCount
                int r0 = r0.incrementAndGet()
                r0 = r0 & 63
                if (r0 != 0) goto Ld
                r1.cleanUp()
            Ld:
                return
        }

        void postWriteCleanup() {
                r0 = this;
                r0.runUnlockedCleanup()
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void preWriteCleanup(long r1) {
                r0 = this;
                r0.runLockedCleanup(r1)
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V put(K r13, int r14, V r15, boolean r16) {
                r12 = this;
                r12.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r12.map     // Catch: java.lang.Throwable -> L1a
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L1a
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L1a
                r12.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> L1a
                int r0 = r12.count     // Catch: java.lang.Throwable -> L1a
                int r0 = r0 + 1
                int r1 = r12.threshold     // Catch: java.lang.Throwable -> L1a
                if (r0 <= r1) goto L1e
                r12.expand()     // Catch: java.lang.Throwable -> L1a
                goto L1e
            L1a:
                r0 = move-exception
                r13 = r0
                goto Leb
            L1e:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r12.table     // Catch: java.lang.Throwable -> L1a
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L1a
                int r1 = r1 + (-1)
                r9 = r14 & r1
                java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L1a
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch: java.lang.Throwable -> L1a
                r10 = r1
            L2f:
                r11 = 0
                if (r10 == 0) goto Lcc
                java.lang.Object r2 = r10.getKey()     // Catch: java.lang.Throwable -> L1a
                int r4 = r10.getHash()     // Catch: java.lang.Throwable -> L1a
                if (r4 != r14) goto Lc3
                if (r2 == 0) goto Lc3
                com.google.common.cache.LocalCache<K, V> r4 = r12.map     // Catch: java.lang.Throwable -> L1a
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.keyEquivalence     // Catch: java.lang.Throwable -> L1a
                boolean r2 = r4.equivalent(r13, r2)     // Catch: java.lang.Throwable -> L1a
                if (r2 == 0) goto Lc3
                com.google.common.cache.LocalCache$ValueReference r0 = r10.getValueReference()     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L1a
                if (r4 != 0) goto L8f
                int r1 = r12.modCount     // Catch: java.lang.Throwable -> L1a
                int r1 = r1 + 1
                r12.modCount = r1     // Catch: java.lang.Throwable -> L1a
                boolean r1 = r0.isActive()     // Catch: java.lang.Throwable -> L1a
                if (r1 == 0) goto L76
                int r5 = r0.getWeight()     // Catch: java.lang.Throwable -> L1a
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L1a
                r1 = r12
                r2 = r13
                r3 = r14
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1a
                r1 = r12
                r3 = r13
                r4 = r15
                r5 = r7
                r2 = r10
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
                int r13 = r12.count     // Catch: java.lang.Throwable -> L1a
                r7 = r2
                goto L83
            L76:
                r1 = r12
                r3 = r13
                r4 = r15
                r5 = r7
                r2 = r10
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
                r7 = r2
                int r13 = r12.count     // Catch: java.lang.Throwable -> L1a
                int r13 = r13 + 1
            L83:
                r12.count = r13     // Catch: java.lang.Throwable -> L1a
                r12.evictEntries(r7)     // Catch: java.lang.Throwable -> L1a
            L88:
                r12.unlock()
                r12.postWriteCleanup()
                return r11
            L8f:
                r8 = r7
                r7 = r10
                if (r16 == 0) goto L9d
                r12.recordLockedRead(r7, r8)     // Catch: java.lang.Throwable -> L1a
                r12.unlock()
                r12.postWriteCleanup()
                return r4
            L9d:
                int r2 = r12.modCount     // Catch: java.lang.Throwable -> L1a
                int r2 = r2 + 1
                r12.modCount = r2     // Catch: java.lang.Throwable -> L1a
                int r5 = r0.getWeight()     // Catch: java.lang.Throwable -> L1a
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L1a
                r1 = r12
                r2 = r13
                r3 = r14
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1a
                r0 = r4
                r1 = r12
                r3 = r13
                r4 = r15
                r2 = r7
                r5 = r8
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
                r7 = r2
                r12.evictEntries(r7)     // Catch: java.lang.Throwable -> L1a
                r12.unlock()
                r12.postWriteCleanup()
                return r0
            Lc3:
                r5 = r7
                r7 = r10
                com.google.common.cache.ReferenceEntry r10 = r7.getNext()     // Catch: java.lang.Throwable -> L1a
                r7 = r5
                goto L2f
            Lcc:
                r5 = r7
                int r7 = r12.modCount     // Catch: java.lang.Throwable -> L1a
                int r7 = r7 + 1
                r12.modCount = r7     // Catch: java.lang.Throwable -> L1a
                com.google.common.cache.ReferenceEntry r1 = r12.newEntry(r13, r14, r1)     // Catch: java.lang.Throwable -> L1a
                r3 = r13
                r4 = r15
                r2 = r1
                r1 = r12
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
                r0.set(r9, r2)     // Catch: java.lang.Throwable -> L1a
                int r13 = r12.count     // Catch: java.lang.Throwable -> L1a
                int r13 = r13 + 1
                r12.count = r13     // Catch: java.lang.Throwable -> L1a
                r12.evictEntries(r2)     // Catch: java.lang.Throwable -> L1a
                goto L88
            Leb:
                r12.unlock()
                r12.postWriteCleanup()
                throw r13
        }

        boolean reclaimKey(com.google.common.cache.ReferenceEntry<K, V> r13, int r14) {
                r12 = this;
                r12.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r12.table     // Catch: java.lang.Throwable -> L47
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L47
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L47
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5     // Catch: java.lang.Throwable -> L47
                r6 = r5
            L14:
                if (r6 == 0) goto L52
                if (r6 != r13) goto L4a
                int r13 = r12.modCount     // Catch: java.lang.Throwable -> L47
                int r13 = r13 + r2
                r12.modCount = r13     // Catch: java.lang.Throwable -> L47
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L47
                com.google.common.cache.LocalCache$ValueReference r13 = r6.getValueReference()     // Catch: java.lang.Throwable -> L47
                java.lang.Object r9 = r13.get()     // Catch: java.lang.Throwable -> L47
                com.google.common.cache.LocalCache$ValueReference r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L47
                com.google.common.cache.RemovalCause r11 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L47
                r4 = r12
                r8 = r14
                com.google.common.cache.ReferenceEntry r13 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L44
                int r14 = r4.count     // Catch: java.lang.Throwable -> L44
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L44
                r4.count = r14     // Catch: java.lang.Throwable -> L44
                r12.unlock()
                r12.postWriteCleanup()
                return r2
            L44:
                r0 = move-exception
            L45:
                r13 = r0
                goto L5b
            L47:
                r0 = move-exception
                r4 = r12
                goto L45
            L4a:
                r4 = r12
                r8 = r14
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L44
                r14 = r8
                goto L14
            L52:
                r4 = r12
                r12.unlock()
                r12.postWriteCleanup()
                r13 = 0
                return r13
            L5b:
                r12.unlock()
                r12.postWriteCleanup()
                throw r13
        }

        boolean reclaimValue(K r13, int r14, com.google.common.cache.LocalCache.ValueReference<K, V> r15) {
                r12 = this;
                r12.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r12.table     // Catch: java.lang.Throwable -> L5d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5d
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5     // Catch: java.lang.Throwable -> L5d
                r6 = r5
            L14:
                r3 = 0
                if (r6 == 0) goto L78
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L5d
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L5d
                if (r4 != r14) goto L6e
                if (r7 == 0) goto L6e
                com.google.common.cache.LocalCache<K, V> r4 = r12.map     // Catch: java.lang.Throwable -> L5d
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.keyEquivalence     // Catch: java.lang.Throwable -> L5d
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L5d
                if (r4 == 0) goto L6e
                com.google.common.cache.LocalCache$ValueReference r13 = r6.getValueReference()     // Catch: java.lang.Throwable -> L5d
                if (r13 != r15) goto L60
                int r13 = r12.modCount     // Catch: java.lang.Throwable -> L5d
                int r13 = r13 + r2
                r12.modCount = r13     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r9 = r15.get()     // Catch: java.lang.Throwable -> L5d
                com.google.common.cache.RemovalCause r11 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L5d
                r4 = r12
                r8 = r14
                r10 = r15
                com.google.common.cache.ReferenceEntry r13 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5a
                int r14 = r4.count     // Catch: java.lang.Throwable -> L5a
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L5a
                r4.count = r14     // Catch: java.lang.Throwable -> L5a
                r12.unlock()
                boolean r13 = r12.isHeldByCurrentThread()
                if (r13 != 0) goto L59
                r12.postWriteCleanup()
            L59:
                return r2
            L5a:
                r0 = move-exception
            L5b:
                r13 = r0
                goto L86
            L5d:
                r0 = move-exception
                r4 = r12
                goto L5b
            L60:
                r4 = r12
                r12.unlock()
                boolean r13 = r12.isHeldByCurrentThread()
                if (r13 != 0) goto L6d
                r12.postWriteCleanup()
            L6d:
                return r3
            L6e:
                r4 = r12
                r8 = r14
                r10 = r15
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L5a
                r14 = r8
                r15 = r10
                goto L14
            L78:
                r4 = r12
                r12.unlock()
                boolean r13 = r12.isHeldByCurrentThread()
                if (r13 != 0) goto L85
                r12.postWriteCleanup()
            L85:
                return r3
            L86:
                r12.unlock()
                boolean r14 = r12.isHeldByCurrentThread()
                if (r14 != 0) goto L92
                r12.postWriteCleanup()
            L92:
                throw r13
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void recordLockedRead(com.google.common.cache.ReferenceEntry<K, V> r2, long r3) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.recordsAccess()
                if (r0 == 0) goto Lb
                r2.setAccessTime(r3)
            Lb:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r1.accessQueue
                r3.add(r2)
                return
        }

        void recordRead(com.google.common.cache.ReferenceEntry<K, V> r2, long r3) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.recordsAccess()
                if (r0 == 0) goto Lb
                r2.setAccessTime(r3)
            Lb:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r1.recencyQueue
                r3.add(r2)
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void recordWrite(com.google.common.cache.ReferenceEntry<K, V> r5, int r6, long r7) {
                r4 = this;
                r4.drainRecencyQueue()
                long r0 = r4.totalWeight
                long r2 = (long) r6
                long r0 = r0 + r2
                r4.totalWeight = r0
                com.google.common.cache.LocalCache<K, V> r6 = r4.map
                boolean r6 = r6.recordsAccess()
                if (r6 == 0) goto L14
                r5.setAccessTime(r7)
            L14:
                com.google.common.cache.LocalCache<K, V> r6 = r4.map
                boolean r6 = r6.recordsWrite()
                if (r6 == 0) goto L1f
                r5.setWriteTime(r7)
            L1f:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r6 = r4.accessQueue
                r6.add(r5)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r6 = r4.writeQueue
                r6.add(r5)
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V refresh(K r2, int r3, com.google.common.cache.CacheLoader<? super K, V> r4, boolean r5) {
                r1 = this;
                com.google.common.cache.LocalCache$LoadingValueReference r5 = r1.insertLoadingValueReference(r2, r3, r5)
                r0 = 0
                if (r5 != 0) goto L8
                return r0
            L8:
                com.google.common.util.concurrent.ListenableFuture r2 = r1.loadAsync(r2, r3, r5, r4)
                boolean r3 = r2.isDone()
                if (r3 == 0) goto L17
                java.lang.Object r2 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r2)     // Catch: java.lang.Throwable -> L17
                return r2
            L17:
                return r0
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V remove(java.lang.Object r12, int r13) {
                r11 = this;
                r11.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r11.map     // Catch: java.lang.Throwable -> L72
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L72
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L72
                r11.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L72
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r11.table     // Catch: java.lang.Throwable -> L72
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L72
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L72
                r4 = r2
                com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> L72
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L75
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L72
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L72
                if (r3 != r13) goto L7d
                if (r6 == 0) goto L7d
                com.google.common.cache.LocalCache<K, V> r3 = r11.map     // Catch: java.lang.Throwable -> L72
                com.google.common.base.Equivalence<java.lang.Object> r3 = r3.keyEquivalence     // Catch: java.lang.Throwable -> L72
                boolean r3 = r3.equivalent(r12, r6)     // Catch: java.lang.Throwable -> L72
                if (r3 == 0) goto L7d
                com.google.common.cache.LocalCache$ValueReference r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L72
                java.lang.Object r8 = r9.get()     // Catch: java.lang.Throwable -> L72
                if (r8 == 0) goto L4a
                com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L46
            L44:
                r10 = r12
                goto L53
            L46:
                r0 = move-exception
                r12 = r0
                r3 = r11
                goto L85
            L4a:
                boolean r12 = r9.isActive()     // Catch: java.lang.Throwable -> L72
                if (r12 == 0) goto L75
                com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L72
                goto L44
            L53:
                int r12 = r11.modCount     // Catch: java.lang.Throwable -> L72
                int r12 = r12 + 1
                r11.modCount = r12     // Catch: java.lang.Throwable -> L72
                r3 = r11
                r7 = r13
                com.google.common.cache.ReferenceEntry r12 = r3.removeValueFromChain(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6f
                int r13 = r3.count     // Catch: java.lang.Throwable -> L6f
                int r13 = r13 + (-1)
                r0.set(r1, r12)     // Catch: java.lang.Throwable -> L6f
                r3.count = r13     // Catch: java.lang.Throwable -> L6f
                r11.unlock()
                r11.postWriteCleanup()
                return r8
            L6f:
                r0 = move-exception
            L70:
                r12 = r0
                goto L85
            L72:
                r0 = move-exception
                r3 = r11
                goto L70
            L75:
                r3 = r11
                r11.unlock()
                r11.postWriteCleanup()
                return r2
            L7d:
                r3 = r11
                r7 = r13
                com.google.common.cache.ReferenceEntry r5 = r5.getNext()     // Catch: java.lang.Throwable -> L6f
                r13 = r7
                goto L1f
            L85:
                r11.unlock()
                r11.postWriteCleanup()
                throw r12
        }

        boolean remove(java.lang.Object r13, int r14, java.lang.Object r15) {
                r12 = this;
                r12.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r12.map     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L80
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L80
                r12.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L80
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r12.table     // Catch: java.lang.Throwable -> L80
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L80
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L80
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5     // Catch: java.lang.Throwable -> L80
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L92
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L80
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L80
                if (r4 != r14) goto L8a
                if (r7 == 0) goto L8a
                com.google.common.cache.LocalCache<K, V> r4 = r12.map     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.keyEquivalence     // Catch: java.lang.Throwable -> L80
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L80
                if (r4 == 0) goto L8a
                com.google.common.cache.LocalCache$ValueReference r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L80
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L80
                com.google.common.cache.LocalCache<K, V> r13 = r12.map     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Equivalence<java.lang.Object> r13 = r13.valueEquivalence     // Catch: java.lang.Throwable -> L80
                boolean r13 = r13.equivalent(r15, r9)     // Catch: java.lang.Throwable -> L80
                if (r13 == 0) goto L52
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L4e
            L4c:
                r11 = r13
                goto L5d
            L4e:
                r0 = move-exception
                r13 = r0
                r4 = r12
                goto L94
            L52:
                if (r9 != 0) goto L92
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L80
                if (r13 == 0) goto L92
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L80
                goto L4c
            L5d:
                int r13 = r12.modCount     // Catch: java.lang.Throwable -> L80
                int r13 = r13 + r2
                r12.modCount = r13     // Catch: java.lang.Throwable -> L80
                r4 = r12
                r8 = r14
                com.google.common.cache.ReferenceEntry r13 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7d
                int r14 = r4.count     // Catch: java.lang.Throwable -> L7d
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L7d
                r4.count = r14     // Catch: java.lang.Throwable -> L7d
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L7d
                if (r11 != r13) goto L75
                goto L76
            L75:
                r2 = 0
            L76:
                r12.unlock()
                r12.postWriteCleanup()
                return r2
            L7d:
                r0 = move-exception
            L7e:
                r13 = r0
                goto L94
            L80:
                r0 = move-exception
                r4 = r12
                goto L7e
            L83:
                r12.unlock()
                r12.postWriteCleanup()
                return r3
            L8a:
                r4 = r12
                r8 = r14
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L7d
                r14 = r8
                goto L1f
            L92:
                r4 = r12
                goto L83
            L94:
                r12.unlock()
                r12.postWriteCleanup()
                throw r13
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void removeCollectedEntry(com.google.common.cache.ReferenceEntry<K, V> r7) {
                r6 = this;
                java.lang.Object r1 = r7.getKey()
                int r2 = r7.getHash()
                com.google.common.cache.LocalCache$ValueReference r0 = r7.getValueReference()
                java.lang.Object r3 = r0.get()
                com.google.common.cache.LocalCache$ValueReference r0 = r7.getValueReference()
                int r4 = r0.getWeight()
                com.google.common.cache.RemovalCause r5 = com.google.common.cache.RemovalCause.COLLECTED
                r0 = r6
                r0.enqueueNotification(r1, r2, r3, r4, r5)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r1 = r0.writeQueue
                r1.remove(r7)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r1 = r0.accessQueue
                r1.remove(r7)
                return
        }

        @com.google.common.annotations.VisibleForTesting
        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        boolean removeEntry(com.google.common.cache.ReferenceEntry<K, V> r13, int r14, com.google.common.cache.RemovalCause r15) {
                r12 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r12.table
                int r1 = r0.length()
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5
                r6 = r5
            L11:
                if (r6 == 0) goto L42
                if (r6 != r13) goto L3a
                int r13 = r12.modCount
                int r13 = r13 + r2
                r12.modCount = r13
                java.lang.Object r7 = r6.getKey()
                com.google.common.cache.LocalCache$ValueReference r13 = r6.getValueReference()
                java.lang.Object r9 = r13.get()
                com.google.common.cache.LocalCache$ValueReference r10 = r6.getValueReference()
                r4 = r12
                r8 = r14
                r11 = r15
                com.google.common.cache.ReferenceEntry r13 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11)
                int r14 = r4.count
                int r14 = r14 - r2
                r0.set(r1, r13)
                r4.count = r14
                return r2
            L3a:
                r4 = r12
                r8 = r14
                r11 = r15
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()
                goto L11
            L42:
                r4 = r12
                r13 = 0
                return r13
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        com.google.common.cache.ReferenceEntry<K, V> removeEntryFromChain(com.google.common.cache.ReferenceEntry<K, V> r4, com.google.common.cache.ReferenceEntry<K, V> r5) {
                r3 = this;
                int r0 = r3.count
                com.google.common.cache.ReferenceEntry r1 = r5.getNext()
            L6:
                if (r4 == r5) goto L1a
                com.google.common.cache.ReferenceEntry r2 = r3.copyEntry(r4, r1)
                if (r2 == 0) goto L10
                r1 = r2
                goto L15
            L10:
                r3.removeCollectedEntry(r4)
                int r0 = r0 + (-1)
            L15:
                com.google.common.cache.ReferenceEntry r4 = r4.getNext()
                goto L6
            L1a:
                r3.count = r0
                return r1
        }

        boolean removeLoadingValue(K r9, int r10, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r11) {
                r8 = this;
                r8.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r8.table     // Catch: java.lang.Throwable -> L40
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L40
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L40
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3     // Catch: java.lang.Throwable -> L40
                r4 = r3
            L13:
                r5 = 0
                if (r4 == 0) goto L50
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L40
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L40
                if (r7 != r10) goto L57
                if (r6 == 0) goto L57
                com.google.common.cache.LocalCache<K, V> r7 = r8.map     // Catch: java.lang.Throwable -> L40
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L40
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L40
                if (r6 == 0) goto L57
                com.google.common.cache.LocalCache$ValueReference r9 = r4.getValueReference()     // Catch: java.lang.Throwable -> L40
                if (r9 != r11) goto L50
                boolean r9 = r11.isActive()     // Catch: java.lang.Throwable -> L40
                if (r9 == 0) goto L42
                com.google.common.cache.LocalCache$ValueReference r9 = r11.getOldValue()     // Catch: java.lang.Throwable -> L40
                r4.setValueReference(r9)     // Catch: java.lang.Throwable -> L40
                goto L49
            L40:
                r9 = move-exception
                goto L5c
            L42:
                com.google.common.cache.ReferenceEntry r9 = r8.removeEntryFromChain(r3, r4)     // Catch: java.lang.Throwable -> L40
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L40
            L49:
                r8.unlock()
                r8.postWriteCleanup()
                return r2
            L50:
                r8.unlock()
                r8.postWriteCleanup()
                return r5
            L57:
                com.google.common.cache.ReferenceEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L40
                goto L13
            L5c:
                r8.unlock()
                r8.postWriteCleanup()
                throw r9
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain(com.google.common.cache.ReferenceEntry<K, V> r7, com.google.common.cache.ReferenceEntry<K, V> r8, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r9, int r10, V r11, com.google.common.cache.LocalCache.ValueReference<K, V> r12, com.google.common.cache.RemovalCause r13) {
                r6 = this;
                int r4 = r12.getWeight()
                r0 = r6
                r1 = r9
                r2 = r10
                r3 = r11
                r5 = r13
                r0.enqueueNotification(r1, r2, r3, r4, r5)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r9 = r0.writeQueue
                r9.remove(r8)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r9 = r0.accessQueue
                r9.remove(r8)
                boolean r9 = r12.isLoading()
                if (r9 == 0) goto L21
                r8 = 0
                r12.notifyNewValue(r8)
                return r7
            L21:
                com.google.common.cache.ReferenceEntry r7 = r6.removeEntryFromChain(r7, r8)
                return r7
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V replace(K r14, int r15, V r16) {
                r13 = this;
                r13.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r13.map     // Catch: java.lang.Throwable -> L63
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L63
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L63
                r13.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> L63
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r13.table     // Catch: java.lang.Throwable -> L63
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L63
                int r1 = r1 + (-1)
                r9 = r15 & r1
                java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L63
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L63
                r1 = r2
            L20:
                r10 = 0
                if (r1 == 0) goto L66
                java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L63
                int r5 = r1.getHash()     // Catch: java.lang.Throwable -> L63
                if (r5 != r15) goto L95
                if (r4 == 0) goto L95
                com.google.common.cache.LocalCache<K, V> r5 = r13.map     // Catch: java.lang.Throwable -> L63
                com.google.common.base.Equivalence<java.lang.Object> r5 = r5.keyEquivalence     // Catch: java.lang.Throwable -> L63
                boolean r5 = r5.equivalent(r14, r4)     // Catch: java.lang.Throwable -> L63
                if (r5 == 0) goto L95
                r11 = r7
                com.google.common.cache.LocalCache$ValueReference r7 = r1.getValueReference()     // Catch: java.lang.Throwable -> L63
                java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L63
                if (r6 != 0) goto L6d
                boolean r14 = r7.isActive()     // Catch: java.lang.Throwable -> L63
                if (r14 == 0) goto L66
                int r14 = r13.modCount     // Catch: java.lang.Throwable -> L63
                int r14 = r14 + 1
                r13.modCount = r14     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L63
                r5 = r15
                r3 = r1
                r1 = r13
                com.google.common.cache.ReferenceEntry r14 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L63
                int r2 = r13.count     // Catch: java.lang.Throwable -> L63
                int r2 = r2 + (-1)
                r0.set(r9, r14)     // Catch: java.lang.Throwable -> L63
                r13.count = r2     // Catch: java.lang.Throwable -> L63
                goto L66
            L63:
                r0 = move-exception
                r14 = r0
                goto La0
            L66:
                r13.unlock()
                r13.postWriteCleanup()
                return r10
            L6d:
                r0 = r1
                r4 = r6
                int r2 = r13.modCount     // Catch: java.lang.Throwable -> L63
                int r2 = r2 + 1
                r13.modCount = r2     // Catch: java.lang.Throwable -> L63
                int r5 = r7.getWeight()     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L63
                r1 = r13
                r2 = r14
                r3 = r15
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L63
                r7 = r4
                r1 = r13
                r3 = r14
                r4 = r16
                r2 = r0
                r5 = r11
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L63
                r13.evictEntries(r2)     // Catch: java.lang.Throwable -> L63
                r13.unlock()
                r13.postWriteCleanup()
                return r7
            L95:
                r3 = r2
                r5 = r7
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = r2.getNext()     // Catch: java.lang.Throwable -> L63
                r1 = r2
                r2 = r3
                r7 = r5
                goto L20
            La0:
                r13.unlock()
                r13.postWriteCleanup()
                throw r14
        }

        boolean replace(K r17, int r18, V r19, V r20) {
                r16 = this;
                r1 = r16
                r3 = r18
                r1.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r1.map     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L67
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L67
                r1.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r1.table     // Catch: java.lang.Throwable -> L67
                int r2 = r0.length()     // Catch: java.lang.Throwable -> L67
                r9 = 1
                int r2 = r2 - r9
                r10 = r3 & r2
                java.lang.Object r2 = r0.get(r10)     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L67
                r4 = r2
            L23:
                r11 = 0
                if (r4 == 0) goto L69
                r5 = r4
                java.lang.Object r4 = r5.getKey()     // Catch: java.lang.Throwable -> L67
                int r6 = r5.getHash()     // Catch: java.lang.Throwable -> L67
                if (r6 != r3) goto La9
                if (r4 == 0) goto La9
                com.google.common.cache.LocalCache<K, V> r6 = r1.map     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Equivalence<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L67
                r12 = r17
                boolean r6 = r6.equivalent(r12, r4)     // Catch: java.lang.Throwable -> L67
                if (r6 == 0) goto La9
                r13 = r7
                com.google.common.cache.LocalCache$ValueReference r7 = r5.getValueReference()     // Catch: java.lang.Throwable -> L67
                java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L67
                if (r6 != 0) goto L70
                boolean r8 = r7.isActive()     // Catch: java.lang.Throwable -> L67
                if (r8 == 0) goto L69
                int r8 = r1.modCount     // Catch: java.lang.Throwable -> L67
                int r8 = r8 + r9
                r1.modCount = r8     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L67
                r15 = r5
                r5 = r3
                r3 = r15
                com.google.common.cache.ReferenceEntry r2 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L67
                int r3 = r1.count     // Catch: java.lang.Throwable -> L67
                int r3 = r3 - r9
                r0.set(r10, r2)     // Catch: java.lang.Throwable -> L67
                r1.count = r3     // Catch: java.lang.Throwable -> L67
                goto L69
            L67:
                r0 = move-exception
                goto Lba
            L69:
                r1.unlock()
                r1.postWriteCleanup()
                return r11
            L70:
                r0 = r5
                r4 = r6
                com.google.common.cache.LocalCache<K, V> r2 = r1.map     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.valueEquivalence     // Catch: java.lang.Throwable -> L67
                r3 = r19
                boolean r2 = r2.equivalent(r3, r4)     // Catch: java.lang.Throwable -> L67
                if (r2 == 0) goto La4
                int r2 = r1.modCount     // Catch: java.lang.Throwable -> L67
                int r2 = r2 + r9
                r1.modCount = r2     // Catch: java.lang.Throwable -> L67
                int r5 = r7.getWeight()     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L67
                r3 = r18
                r2 = r12
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
                r1 = r16
                r3 = r17
                r4 = r20
                r2 = r0
                r5 = r13
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
                r1.evictEntries(r2)     // Catch: java.lang.Throwable -> L67
                r1.unlock()
                r1.postWriteCleanup()
                return r9
            La4:
                r2 = r0
                r1.recordLockedRead(r2, r13)     // Catch: java.lang.Throwable -> L67
                goto L69
            La9:
                r3 = r19
                r4 = r2
                r2 = r5
                r13 = r7
                com.google.common.cache.ReferenceEntry r2 = r2.getNext()     // Catch: java.lang.Throwable -> L67
                r3 = r4
                r4 = r2
                r2 = r3
                r3 = r18
                r7 = r13
                goto L23
            Lba:
                r1.unlock()
                r1.postWriteCleanup()
                throw r0
        }

        void runLockedCleanup(long r2) {
                r1 = this;
                boolean r0 = r1.tryLock()
                if (r0 == 0) goto L1b
                r1.drainReferenceQueues()     // Catch: java.lang.Throwable -> L16
                r1.expireEntries(r2)     // Catch: java.lang.Throwable -> L16
                java.util.concurrent.atomic.AtomicInteger r2 = r1.readCount     // Catch: java.lang.Throwable -> L16
                r3 = 0
                r2.set(r3)     // Catch: java.lang.Throwable -> L16
                r1.unlock()
                return
            L16:
                r2 = move-exception
                r1.unlock()
                throw r2
            L1b:
                return
        }

        void runUnlockedCleanup() {
                r1 = this;
                boolean r0 = r1.isHeldByCurrentThread()
                if (r0 != 0) goto Lb
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                r0.processPendingNotifications()
            Lb:
                return
        }

        V scheduleRefresh(com.google.common.cache.ReferenceEntry<K, V> r4, K r5, int r6, V r7, long r8, com.google.common.cache.CacheLoader<? super K, V> r10) {
                r3 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r3.map
                boolean r0 = r0.refreshes()
                if (r0 == 0) goto L27
                long r0 = r4.getWriteTime()
                long r8 = r8 - r0
                com.google.common.cache.LocalCache<K, V> r0 = r3.map
                long r0 = r0.refreshNanos
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 <= 0) goto L27
                com.google.common.cache.LocalCache$ValueReference r4 = r4.getValueReference()
                boolean r4 = r4.isLoading()
                if (r4 != 0) goto L27
                r4 = 1
                java.lang.Object r4 = r3.refresh(r5, r6, r10, r4)
                if (r4 == 0) goto L27
                return r4
            L27:
                return r7
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        void setValue(com.google.common.cache.ReferenceEntry<K, V> r4, K r5, V r6, long r7) {
                r3 = this;
                com.google.common.cache.LocalCache$ValueReference r0 = r4.getValueReference()
                com.google.common.cache.LocalCache<K, V> r1 = r3.map
                com.google.common.cache.Weigher<K, V> r1 = r1.weigher
                int r5 = r1.weigh(r5, r6)
                if (r5 < 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                java.lang.String r2 = "Weights must be non-negative"
                com.google.common.base.Preconditions.checkState(r1, r2)
                com.google.common.cache.LocalCache<K, V> r1 = r3.map
                com.google.common.cache.LocalCache$Strength r1 = r1.valueStrength
                com.google.common.cache.LocalCache$ValueReference r1 = r1.referenceValue(r3, r4, r6, r5)
                r4.setValueReference(r1)
                r3.recordWrite(r4, r5, r7)
                r0.notifyNewValue(r6)
                return
        }

        boolean storeLoadedValue(K r14, int r15, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r16, V r17) {
                r13 = this;
                r13.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r13.map     // Catch: java.lang.Throwable -> L1d
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L1d
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L1d
                r13.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> L1d
                int r0 = r13.count     // Catch: java.lang.Throwable -> L1d
                r9 = 1
                int r0 = r0 + r9
                int r4 = r13.threshold     // Catch: java.lang.Throwable -> L1d
                if (r0 <= r4) goto L20
                r13.expand()     // Catch: java.lang.Throwable -> L1d
                int r0 = r13.count     // Catch: java.lang.Throwable -> L1d
                int r0 = r0 + r9
                goto L20
            L1d:
                r0 = move-exception
                goto Lc6
            L20:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r13.table     // Catch: java.lang.Throwable -> L1d
                int r4 = r10.length()     // Catch: java.lang.Throwable -> L1d
                int r4 = r4 - r9
                r11 = r15 & r4
                java.lang.Object r4 = r10.get(r11)     // Catch: java.lang.Throwable -> L1d
                com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> L1d
                r12 = r4
            L30:
                if (r12 == 0) goto Lac
                java.lang.Object r5 = r12.getKey()     // Catch: java.lang.Throwable -> L1d
                int r6 = r12.getHash()     // Catch: java.lang.Throwable -> L1d
                if (r6 != r15) goto La4
                if (r5 == 0) goto La4
                com.google.common.cache.LocalCache<K, V> r6 = r13.map     // Catch: java.lang.Throwable -> L1d
                com.google.common.base.Equivalence<java.lang.Object> r6 = r6.keyEquivalence     // Catch: java.lang.Throwable -> L1d
                boolean r5 = r6.equivalent(r14, r5)     // Catch: java.lang.Throwable -> L1d
                if (r5 == 0) goto La4
                com.google.common.cache.LocalCache$ValueReference r4 = r12.getValueReference()     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r5 = r4.get()     // Catch: java.lang.Throwable -> L1d
                r6 = r16
                if (r6 == r4) goto L6e
                if (r5 != 0) goto L5b
                com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r10 = com.google.common.cache.LocalCache.UNSET     // Catch: java.lang.Throwable -> L1d
                if (r4 == r10) goto L5b
                goto L6e
            L5b:
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L1d
                r5 = 0
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r17
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1d
                r13.unlock()
                r13.postWriteCleanup()
                r0 = 0
                return r0
            L6e:
                int r2 = r13.modCount     // Catch: java.lang.Throwable -> L1d
                int r2 = r2 + r9
                r13.modCount = r2     // Catch: java.lang.Throwable -> L1d
                boolean r2 = r6.isActive()     // Catch: java.lang.Throwable -> L1d
                if (r2 == 0) goto L8f
                if (r5 != 0) goto L7f
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L1d
            L7d:
                r4 = r5
                goto L82
            L7f:
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L1d
                goto L7d
            L82:
                int r5 = r6.getWeight()     // Catch: java.lang.Throwable -> L1d
                r1 = r13
                r3 = r15
                r6 = r2
                r2 = r14
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1d
                int r0 = r0 + (-1)
            L8f:
                r1 = r13
                r3 = r14
                r4 = r17
                r5 = r7
                r2 = r12
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
                r13.count = r0     // Catch: java.lang.Throwable -> L1d
                r13.evictEntries(r2)     // Catch: java.lang.Throwable -> L1d
            L9d:
                r13.unlock()
                r13.postWriteCleanup()
                return r9
            La4:
                r6 = r16
                r2 = r12
                com.google.common.cache.ReferenceEntry r12 = r2.getNext()     // Catch: java.lang.Throwable -> L1d
                goto L30
            Lac:
                int r2 = r13.modCount     // Catch: java.lang.Throwable -> L1d
                int r2 = r2 + r9
                r13.modCount = r2     // Catch: java.lang.Throwable -> L1d
                com.google.common.cache.ReferenceEntry r2 = r13.newEntry(r14, r15, r4)     // Catch: java.lang.Throwable -> L1d
                r1 = r13
                r3 = r14
                r4 = r17
                r5 = r7
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
                r10.set(r11, r2)     // Catch: java.lang.Throwable -> L1d
                r13.count = r0     // Catch: java.lang.Throwable -> L1d
                r13.evictEntries(r2)     // Catch: java.lang.Throwable -> L1d
                goto L9d
            Lc6:
                r13.unlock()
                r13.postWriteCleanup()
                throw r0
        }

        void tryDrainReferenceQueues() {
                r1 = this;
                boolean r0 = r1.tryLock()
                if (r0 == 0) goto L12
                r1.drainReferenceQueues()     // Catch: java.lang.Throwable -> Ld
                r1.unlock()
                return
            Ld:
                r0 = move-exception
                r1.unlock()
                throw r0
            L12:
                return
        }

        void tryExpireEntries(long r2) {
                r1 = this;
                boolean r0 = r1.tryLock()
                if (r0 == 0) goto L12
                r1.expireEntries(r2)     // Catch: java.lang.Throwable -> Ld
                r1.unlock()
                return
            Ld:
                r2 = move-exception
                r1.unlock()
                throw r2
            L12:
                return
        }

        V waitForLoadingValue(com.google.common.cache.ReferenceEntry<K, V> r5, K r6, com.google.common.cache.LocalCache.ValueReference<K, V> r7) throws java.util.concurrent.ExecutionException {
                r4 = this;
                boolean r0 = r7.isLoading()
                if (r0 == 0) goto L4c
                boolean r0 = java.lang.Thread.holdsLock(r5)
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Recursive load of: %s"
                com.google.common.base.Preconditions.checkState(r0, r2, r6)
                java.lang.Object r7 = r7.waitForValue()     // Catch: java.lang.Throwable -> L28
                if (r7 == 0) goto L2a
                com.google.common.cache.LocalCache<K, V> r6 = r4.map     // Catch: java.lang.Throwable -> L28
                com.google.common.base.Ticker r6 = r6.ticker     // Catch: java.lang.Throwable -> L28
                long r2 = r6.read()     // Catch: java.lang.Throwable -> L28
                r4.recordRead(r5, r2)     // Catch: java.lang.Throwable -> L28
                com.google.common.cache.AbstractCache$StatsCounter r5 = r4.statsCounter
                r5.recordMisses(r1)
                return r7
            L28:
                r5 = move-exception
                goto L46
            L2a:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r5 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch: java.lang.Throwable -> L28
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
                r7.<init>()     // Catch: java.lang.Throwable -> L28
                java.lang.String r0 = "CacheLoader returned null for key "
                r7.append(r0)     // Catch: java.lang.Throwable -> L28
                r7.append(r6)     // Catch: java.lang.Throwable -> L28
                java.lang.String r6 = "."
                r7.append(r6)     // Catch: java.lang.Throwable -> L28
                java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L28
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L28
                throw r5     // Catch: java.lang.Throwable -> L28
            L46:
                com.google.common.cache.AbstractCache$StatsCounter r6 = r4.statsCounter
                r6.recordMisses(r1)
                throw r5
            L4c:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SoftValueReference<K, V> extends java.lang.ref.SoftReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.cache.ReferenceEntry<K, V> entry;

        SoftValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.entry = r3
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r2, V r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                com.google.common.cache.LocalCache$SoftValueReference r0 = new com.google.common.cache.LocalCache$SoftValueReference
                r0.<init>(r2, r3, r4)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.entry
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Strength extends java.lang.Enum<com.google.common.cache.LocalCache.Strength> {
        private static final /* synthetic */ com.google.common.cache.LocalCache.Strength[] $VALUES = null;
        public static final com.google.common.cache.LocalCache.Strength SOFT = null;
        public static final com.google.common.cache.LocalCache.Strength STRONG = null;
        public static final com.google.common.cache.LocalCache.Strength WEAK = null;




        static {
                com.google.common.cache.LocalCache$Strength$1 r0 = new com.google.common.cache.LocalCache$Strength$1
                java.lang.String r1 = "STRONG"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.cache.LocalCache.Strength.STRONG = r0
                com.google.common.cache.LocalCache$Strength$2 r1 = new com.google.common.cache.LocalCache$Strength$2
                java.lang.String r3 = "SOFT"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.cache.LocalCache.Strength.SOFT = r1
                com.google.common.cache.LocalCache$Strength$3 r3 = new com.google.common.cache.LocalCache$Strength$3
                java.lang.String r5 = "WEAK"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.common.cache.LocalCache.Strength.WEAK = r3
                r5 = 3
                com.google.common.cache.LocalCache$Strength[] r5 = new com.google.common.cache.LocalCache.Strength[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.common.cache.LocalCache.Strength.$VALUES = r5
                return
        }

        Strength(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Strength(java.lang.String r1, int r2, com.google.common.cache.LocalCache.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.cache.LocalCache.Strength valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.LocalCache$Strength> r0 = com.google.common.cache.LocalCache.Strength.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.LocalCache$Strength r1 = (com.google.common.cache.LocalCache.Strength) r1
                return r1
        }

        public static com.google.common.cache.LocalCache.Strength[] values() {
                com.google.common.cache.LocalCache$Strength[] r0 = com.google.common.cache.LocalCache.Strength.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.LocalCache$Strength[] r0 = (com.google.common.cache.LocalCache.Strength[]) r0
                return r0
        }

        abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();

        abstract <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> r1, com.google.common.cache.ReferenceEntry<K, V> r2, V r3, int r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongAccessEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        StrongAccessEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextAccess = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        StrongAccessWriteEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.ReferenceEntry r3 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextAccess = r3
                com.google.common.cache.ReferenceEntry r3 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousAccess = r3
                r0.writeTime = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextWrite = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StrongEntry<K, V> extends com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V> {
        final int hash;
        final K key;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final com.google.common.cache.ReferenceEntry<K, V> next;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;

        StrongEntry(K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                r1.<init>()
                com.google.common.cache.LocalCache$ValueReference r0 = com.google.common.cache.LocalCache.unset()
                r1.valueReference = r0
                r1.key = r2
                r1.hash = r3
                r1.next = r4
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.next
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.valueReference
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1) {
                r0 = this;
                r0.valueReference = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StrongValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final V referent;

        StrongValueReference(V r1) {
                r0 = this;
                r0.<init>()
                r0.referent = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
                r1 = this;
                V r0 = r1.referent
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class StrongWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        StrongWriteEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.writeTime = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextWrite = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ValueIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<V> {
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        ValueIterator(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
                r1 = this;
                com.google.common.cache.LocalCache$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getValue()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ValueReference<K, V> {
        com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2, com.google.common.cache.ReferenceEntry<K, V> r3);

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V get();

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1);

        V waitForValue() throws java.util.concurrent.ExecutionException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class Values extends java.util.AbstractCollection<V> {
        private final java.util.concurrent.ConcurrentMap<?, ?> map;
        final /* synthetic */ com.google.common.cache.LocalCache this$0;

        Values(com.google.common.cache.LocalCache r1, java.util.concurrent.ConcurrentMap<?, ?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.map = r2
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$ValueIterator r0 = new com.google.common.cache.LocalCache$ValueIterator
                com.google.common.cache.LocalCache r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<?, ?> r0 = r1.map
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakAccessEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        WeakAccessEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextAccess = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        volatile long accessTime;
        com.google.common.cache.ReferenceEntry<K, V> nextAccess;
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousAccess;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        WeakAccessWriteEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.ReferenceEntry r3 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextAccess = r3
                com.google.common.cache.ReferenceEntry r3 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousAccess = r3
                r0.writeTime = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextWrite = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class WeakEntry<K, V> extends java.lang.ref.WeakReference<K> implements com.google.common.cache.ReferenceEntry<K, V> {
        final int hash;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final com.google.common.cache.ReferenceEntry<K, V> next;
        volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;

        WeakEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r2, r1)
                com.google.common.cache.LocalCache$ValueReference r1 = com.google.common.cache.LocalCache.unset()
                r0.valueReference = r1
                r0.hash = r3
                r0.next = r4
                return
        }

        public long getAccessTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.next
                return r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.valueReference
                return r0
        }

        public long getWriteTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public void setAccessTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1) {
                r0 = this;
                r0.valueReference = r1
                return
        }

        public void setWriteTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class WeakValueReference<K, V> extends java.lang.ref.WeakReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        final com.google.common.cache.ReferenceEntry<K, V> entry;

        WeakValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.entry = r3
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r2, V r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                com.google.common.cache.LocalCache$WeakValueReference r0 = new com.google.common.cache.LocalCache$WeakValueReference
                r0.<init>(r2, r3, r4)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.entry
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        com.google.common.cache.ReferenceEntry<K, V> nextWrite;
        com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        WeakWriteEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.writeTime = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.nextWrite = r1
                com.google.common.cache.ReferenceEntry r1 = com.google.common.cache.LocalCache.nullEntry()
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeightedSoftValueReference<K, V> extends com.google.common.cache.LocalCache.SoftValueReference<K, V> {
        final int weight;

        WeightedSoftValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.weight = r4
                return
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r3, V r4, com.google.common.cache.ReferenceEntry<K, V> r5) {
                r2 = this;
                com.google.common.cache.LocalCache$WeightedSoftValueReference r0 = new com.google.common.cache.LocalCache$WeightedSoftValueReference
                int r1 = r2.weight
                r0.<init>(r3, r4, r5, r1)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                int r0 = r1.weight
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeightedStrongValueReference<K, V> extends com.google.common.cache.LocalCache.StrongValueReference<K, V> {
        final int weight;

        WeightedStrongValueReference(V r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.weight = r2
                return
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                int r0 = r1.weight
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeightedWeakValueReference<K, V> extends com.google.common.cache.LocalCache.WeakValueReference<K, V> {
        final int weight;

        WeightedWeakValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.weight = r4
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r3, V r4, com.google.common.cache.ReferenceEntry<K, V> r5) {
                r2 = this;
                com.google.common.cache.LocalCache$WeightedWeakValueReference r0 = new com.google.common.cache.LocalCache$WeightedWeakValueReference
                int r1 = r2.weight
                r0.<init>(r3, r4, r5, r1)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                int r0 = r1.weight
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WriteQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        final com.google.common.cache.ReferenceEntry<K, V> head;



        WriteQueue() {
                r1 = this;
                r1.<init>()
                com.google.common.cache.LocalCache$WriteQueue$1 r0 = new com.google.common.cache.LocalCache$WriteQueue$1
                r0.<init>(r1)
                r1.head = r0
                return
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
            L6:
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 == r1) goto L13
                com.google.common.cache.ReferenceEntry r1 = r0.getNextInWriteQueue()
                com.google.common.cache.LocalCache.nullifyWriteOrder(r0)
                r0 = r1
                goto L6
            L13:
                r1.setNextInWriteQueue(r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                r0.setPreviousInWriteQueue(r0)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2
                com.google.common.cache.ReferenceEntry r2 = r2.getNextInWriteQueue()
                com.google.common.cache.LocalCache$NullEntry r0 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r2 == r0) goto Lc
                r2 = 1
                return r2
            Lc:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$WriteQueue$2 r0 = new com.google.common.cache.LocalCache$WriteQueue$2
                com.google.common.cache.ReferenceEntry r1 = r2.peek()
                r0.<init>(r2, r1)
                return r0
        }

        public boolean offer(com.google.common.cache.ReferenceEntry<K, V> r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInWriteQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getPreviousInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r3)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.LocalCache.connectWriteOrder(r3, r0)
                r3 = 1
                return r3
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(java.lang.Object r1) {
                r0 = this;
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1
                boolean r1 = r0.offer(r1)
                return r1
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> peek() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lb
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object peek() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.peek()
                return r0
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> poll() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 0
                return r0
            Lc:
                r2.remove(r0)
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object poll() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.poll()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInWriteQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r1)
                com.google.common.cache.LocalCache.nullifyWriteOrder(r3)
                com.google.common.cache.LocalCache$NullEntry r3 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r1 == r3) goto L16
                r3 = 1
                return r3
            L16:
                r3 = 0
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r3 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r3.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                r1 = 0
            L7:
                com.google.common.cache.ReferenceEntry<K, V> r2 = r3.head
                if (r0 == r2) goto L12
                int r1 = r1 + 1
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                goto L7
            L12:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class WriteThroughEntry implements java.util.Map.Entry<K, V> {
        final K key;
        final /* synthetic */ com.google.common.cache.LocalCache this$0;
        V value;

        WriteThroughEntry(com.google.common.cache.LocalCache r1, K r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }

        @Override // java.util.Map.Entry
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

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                K r0 = r2.key
                int r0 = r0.hashCode()
                V r1 = r2.value
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                com.google.common.cache.LocalCache r0 = r2.this$0
                K r1 = r2.key
                java.lang.Object r0 = r0.put(r1, r3)
                r2.value = r3
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.cache.LocalCache> r0 = com.google.common.cache.LocalCache.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.cache.LocalCache.logger = r0
            com.google.common.cache.LocalCache$1 r0 = new com.google.common.cache.LocalCache$1
            r0.<init>()
            com.google.common.cache.LocalCache.UNSET = r0
            com.google.common.cache.LocalCache$2 r0 = new com.google.common.cache.LocalCache$2
            r0.<init>()
            com.google.common.cache.LocalCache.DISCARDING_QUEUE = r0
            return
    }

    LocalCache(com.google.common.cache.CacheBuilder<? super K, ? super V> r12, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.CacheLoader<? super K, V> r13) {
            r11 = this;
            r11.<init>()
            int r0 = r12.getConcurrencyLevel()
            r1 = 65536(0x10000, float:9.1835E-41)
            int r0 = java.lang.Math.min(r0, r1)
            r11.concurrencyLevel = r0
            com.google.common.cache.LocalCache$Strength r0 = r12.getKeyStrength()
            r11.keyStrength = r0
            com.google.common.cache.LocalCache$Strength r1 = r12.getValueStrength()
            r11.valueStrength = r1
            com.google.common.base.Equivalence r1 = r12.getKeyEquivalence()
            r11.keyEquivalence = r1
            com.google.common.base.Equivalence r1 = r12.getValueEquivalence()
            r11.valueEquivalence = r1
            long r1 = r12.getMaximumWeight()
            r11.maxWeight = r1
            com.google.common.cache.Weigher r3 = r12.getWeigher()
            r11.weigher = r3
            long r3 = r12.getExpireAfterAccessNanos()
            r11.expireAfterAccessNanos = r3
            long r3 = r12.getExpireAfterWriteNanos()
            r11.expireAfterWriteNanos = r3
            long r3 = r12.getRefreshNanos()
            r11.refreshNanos = r3
            com.google.common.cache.RemovalListener r3 = r12.getRemovalListener()
            r11.removalListener = r3
            com.google.common.cache.CacheBuilder$NullListener r4 = com.google.common.cache.CacheBuilder.NullListener.INSTANCE
            if (r3 != r4) goto L54
            java.util.Queue r3 = discardingQueue()
            goto L59
        L54:
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
        L59:
            r11.removalNotificationQueue = r3
            boolean r3 = r11.recordsTime()
            com.google.common.base.Ticker r3 = r12.getTicker(r3)
            r11.ticker = r3
            boolean r3 = r11.usesAccessEntries()
            boolean r4 = r11.usesWriteEntries()
            com.google.common.cache.LocalCache$EntryFactory r0 = com.google.common.cache.LocalCache.EntryFactory.getFactory(r0, r3, r4)
            r11.entryFactory = r0
            com.google.common.base.Supplier r0 = r12.getStatsCounterSupplier()
            java.lang.Object r0 = r0.get()
            com.google.common.cache.AbstractCache$StatsCounter r0 = (com.google.common.cache.AbstractCache.StatsCounter) r0
            r11.globalStatsCounter = r0
            r11.defaultLoader = r13
            int r13 = r12.getInitialCapacity()
            r0 = 1073741824(0x40000000, float:2.0)
            int r13 = java.lang.Math.min(r13, r0)
            boolean r0 = r11.evictsBySize()
            if (r0 == 0) goto L9d
            boolean r0 = r11.customWeigher()
            if (r0 != 0) goto L9d
            long r3 = (long) r13
            long r0 = java.lang.Math.min(r3, r1)
            int r13 = (int) r0
        L9d:
            r0 = 0
            r1 = 1
            r2 = 1
            r3 = 0
        La1:
            int r4 = r11.concurrencyLevel
            if (r2 >= r4) goto Lb9
            boolean r4 = r11.evictsBySize()
            if (r4 == 0) goto Lb4
            int r4 = r2 * 20
            long r4 = (long) r4
            long r6 = r11.maxWeight
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto Lb9
        Lb4:
            int r3 = r3 + 1
            int r2 = r2 << 1
            goto La1
        Lb9:
            int r3 = 32 - r3
            r11.segmentShift = r3
            int r3 = r2 + (-1)
            r11.segmentMask = r3
            com.google.common.cache.LocalCache$Segment[] r3 = r11.newSegmentArray(r2)
            r11.segments = r3
            int r3 = r13 / r2
            int r4 = r3 * r2
            if (r4 >= r13) goto Lcf
            int r3 = r3 + 1
        Lcf:
            if (r1 >= r3) goto Ld4
            int r1 = r1 << 1
            goto Lcf
        Ld4:
            boolean r13 = r11.evictsBySize()
            if (r13 == 0) goto L101
            long r3 = r11.maxWeight
            long r5 = (long) r2
            long r7 = r3 / r5
            r9 = 1
            long r7 = r7 + r9
            long r3 = r3 % r5
        Le3:
            com.google.common.cache.LocalCache$Segment<K, V>[] r13 = r11.segments
            int r2 = r13.length
            if (r0 >= r2) goto L11b
            long r5 = (long) r0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto Lee
            long r7 = r7 - r9
        Lee:
            com.google.common.base.Supplier r2 = r12.getStatsCounterSupplier()
            java.lang.Object r2 = r2.get()
            com.google.common.cache.AbstractCache$StatsCounter r2 = (com.google.common.cache.AbstractCache.StatsCounter) r2
            com.google.common.cache.LocalCache$Segment r2 = r11.createSegment(r1, r7, r2)
            r13[r0] = r2
            int r0 = r0 + 1
            goto Le3
        L101:
            com.google.common.cache.LocalCache$Segment<K, V>[] r13 = r11.segments
            int r2 = r13.length
            if (r0 >= r2) goto L11b
            com.google.common.base.Supplier r2 = r12.getStatsCounterSupplier()
            java.lang.Object r2 = r2.get()
            com.google.common.cache.AbstractCache$StatsCounter r2 = (com.google.common.cache.AbstractCache.StatsCounter) r2
            r3 = -1
            com.google.common.cache.LocalCache$Segment r2 = r11.createSegment(r1, r3, r2)
            r13[r0] = r2
            int r0 = r0 + 1
            goto L101
        L11b:
            return
    }

    static /* synthetic */ java.util.ArrayList access$200(java.util.Collection r0) {
            java.util.ArrayList r0 = toArrayList(r0)
            return r0
    }

    static <K, V> void connectAccessOrder(com.google.common.cache.ReferenceEntry<K, V> r0, com.google.common.cache.ReferenceEntry<K, V> r1) {
            r0.setNextInAccessQueue(r1)
            r1.setPreviousInAccessQueue(r0)
            return
    }

    static <K, V> void connectWriteOrder(com.google.common.cache.ReferenceEntry<K, V> r0, com.google.common.cache.ReferenceEntry<K, V> r1) {
            r0.setNextInWriteQueue(r1)
            r1.setPreviousInWriteQueue(r0)
            return
    }

    static <E> java.util.Queue<E> discardingQueue() {
            java.util.Queue<?> r0 = com.google.common.cache.LocalCache.DISCARDING_QUEUE
            return r0
    }

    static <K, V> com.google.common.cache.ReferenceEntry<K, V> nullEntry() {
            com.google.common.cache.LocalCache$NullEntry r0 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
            return r0
    }

    static <K, V> void nullifyAccessOrder(com.google.common.cache.ReferenceEntry<K, V> r1) {
            com.google.common.cache.ReferenceEntry r0 = nullEntry()
            r1.setNextInAccessQueue(r0)
            r1.setPreviousInAccessQueue(r0)
            return
    }

    static <K, V> void nullifyWriteOrder(com.google.common.cache.ReferenceEntry<K, V> r1) {
            com.google.common.cache.ReferenceEntry r0 = nullEntry()
            r1.setNextInWriteQueue(r0)
            r1.setPreviousInWriteQueue(r0)
            return
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

    static <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> unset() {
            com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r0 = com.google.common.cache.LocalCache.UNSET
            return r0
    }

    public void cleanUp() {
            r4 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r4.segments
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.cleanUp()
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r4 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r4.segments
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
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            boolean r3 = r1.containsKey(r3, r0)
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            com.google.common.base.Ticker r3 = r0.ticker
            long r3 = r3.read()
            com.google.common.cache.LocalCache$Segment<K, V>[] r5 = r0.segments
            r6 = -1
            r8 = 0
        L13:
            r9 = 3
            if (r8 >= r9) goto L6d
            int r9 = r5.length
            r10 = 0
            r12 = 0
        L1a:
            if (r12 >= r9) goto L5d
            r13 = r5[r12]
            int r14 = r13.count
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r14 = r13.table
            r15 = 0
            r16 = 0
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L53
            java.lang.Object r2 = r14.get(r15)
            com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2
        L31:
            if (r2 == 0) goto L4e
            r17 = r5
            java.lang.Object r5 = r13.getLiveValue(r2, r3)
            r18 = r2
            if (r5 == 0) goto L47
            com.google.common.base.Equivalence<java.lang.Object> r2 = r0.valueEquivalence
            boolean r2 = r2.equivalent(r1, r5)
            if (r2 == 0) goto L47
            r1 = 1
            return r1
        L47:
            com.google.common.cache.ReferenceEntry r2 = r18.getNext()
            r5 = r17
            goto L31
        L4e:
            r17 = r5
            int r15 = r15 + 1
            goto L25
        L53:
            r17 = r5
            int r2 = r13.modCount
            long r13 = (long) r2
            long r10 = r10 + r13
            int r12 = r12 + 1
            r2 = 0
            goto L1a
        L5d:
            r17 = r5
            r16 = 0
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 != 0) goto L66
            goto L6f
        L66:
            int r8 = r8 + 1
            r6 = r10
            r5 = r17
            r2 = 0
            goto L13
        L6d:
            r16 = 0
        L6f:
            return r16
    }

    @com.google.common.annotations.VisibleForTesting
    com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.ReferenceEntry<K, V> r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
            r1 = this;
            int r0 = r2.getHash()
            com.google.common.cache.LocalCache$Segment r0 = r1.segmentFor(r0)
            com.google.common.cache.ReferenceEntry r2 = r0.copyEntry(r2, r3)
            return r2
    }

    com.google.common.cache.LocalCache.Segment<K, V> createSegment(int r7, long r8, com.google.common.cache.AbstractCache.StatsCounter r10) {
            r6 = this;
            com.google.common.cache.LocalCache$Segment r0 = new com.google.common.cache.LocalCache$Segment
            r1 = r6
            r2 = r7
            r3 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    boolean customWeigher() {
            r2 = this;
            com.google.common.cache.Weigher<K, V> r0 = r2.weigher
            com.google.common.cache.CacheBuilder$OneWeigher r1 = com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.common.annotations.GwtIncompatible
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.common.cache.LocalCache$EntrySet r0 = new com.google.common.cache.LocalCache$EntrySet
            r0.<init>(r1, r1)
            r1.entrySet = r0
            return r0
    }

    boolean evictsBySize() {
            r5 = this;
            long r0 = r5.maxWeight
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    boolean expires() {
            r1 = this;
            boolean r0 = r1.expiresAfterWrite()
            if (r0 != 0) goto Lf
            boolean r0 = r1.expiresAfterAccess()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    boolean expiresAfterAccess() {
            r5 = this;
            long r0 = r5.expireAfterAccessNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    boolean expiresAfterWrite() {
            r5 = this;
            long r0 = r5.expireAfterWriteNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.get(r3, r0)
            return r3
    }

    V get(K r3, com.google.common.cache.CacheLoader<? super K, V> r4) throws java.util.concurrent.ExecutionException {
            r2 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r2.hash(r0)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.get(r3, r0, r4)
            return r3
    }

    com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r8) throws java.util.concurrent.ExecutionException {
            r7 = this;
            java.util.LinkedHashMap r0 = com.google.common.collect.Maps.newLinkedHashMap()
            java.util.LinkedHashSet r1 = com.google.common.collect.Sets.newLinkedHashSet()
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
            r3 = 0
        Le:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r8.next()
            java.lang.Object r5 = r7.get(r4)
            boolean r6 = r0.containsKey(r4)
            if (r6 != 0) goto Le
            r0.put(r4, r5)
            if (r5 != 0) goto L2d
            int r3 = r3 + 1
            r1.add(r4)
            goto Le
        L2d:
            int r2 = r2 + 1
            goto Le
        L30:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L54
            if (r8 != 0) goto L87
            com.google.common.cache.CacheLoader<? super K, V> r8 = r7.defaultLoader     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            java.util.Map r8 = r7.loadAll(r1, r8)     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
        L40:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            if (r5 == 0) goto L87
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            java.lang.Object r6 = r8.get(r5)     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            if (r6 == 0) goto L56
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            goto L40
        L54:
            r8 = move-exception
            goto L96
        L56:
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r8 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            r4.<init>()     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            java.lang.String r6 = "loadAll failed to return a value for "
            r4.append(r6)     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            r4.append(r5)     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
            throw r8     // Catch: java.lang.Throwable -> L54 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L6d
        L6d:
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L54
        L71:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L87
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L54
            int r3 = r3 + (-1)
            com.google.common.cache.CacheLoader<? super K, V> r4 = r7.defaultLoader     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r7.get(r1, r4)     // Catch: java.lang.Throwable -> L54
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L54
            goto L71
        L87:
            com.google.common.collect.ImmutableMap r8 = com.google.common.collect.ImmutableMap.copyOf(r0)     // Catch: java.lang.Throwable -> L54
            com.google.common.cache.AbstractCache$StatsCounter r0 = r7.globalStatsCounter
            r0.recordHits(r2)
            com.google.common.cache.AbstractCache$StatsCounter r0 = r7.globalStatsCounter
            r0.recordMisses(r3)
            return r8
        L96:
            com.google.common.cache.AbstractCache$StatsCounter r0 = r7.globalStatsCounter
            r0.recordHits(r2)
            com.google.common.cache.AbstractCache$StatsCounter r0 = r7.globalStatsCounter
            r0.recordMisses(r3)
            throw r8
    }

    com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> r6) {
            r5 = this;
            java.util.LinkedHashMap r0 = com.google.common.collect.Maps.newLinkedHashMap()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = 0
        La:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r6.next()
            java.lang.Object r4 = r5.get(r3)
            if (r4 != 0) goto L1d
            int r2 = r2 + 1
            goto La
        L1d:
            r0.put(r3, r4)
            int r1 = r1 + 1
            goto La
        L23:
            com.google.common.cache.AbstractCache$StatsCounter r6 = r5.globalStatsCounter
            r6.recordHits(r1)
            com.google.common.cache.AbstractCache$StatsCounter r6 = r5.globalStatsCounter
            r6.recordMisses(r2)
            com.google.common.collect.ImmutableMap r6 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r6
    }

    com.google.common.cache.ReferenceEntry<K, V> getEntry(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            com.google.common.cache.ReferenceEntry r3 = r1.getEntry(r3, r0)
            return r3
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V getIfPresent(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r2.hash(r0)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.get(r3, r0)
            r0 = 1
            if (r3 != 0) goto L19
            com.google.common.cache.AbstractCache$StatsCounter r1 = r2.globalStatsCounter
            r1.recordMisses(r0)
            return r3
        L19:
            com.google.common.cache.AbstractCache$StatsCounter r1 = r2.globalStatsCounter
            r1.recordHits(r0)
            return r3
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V getLiveValue(com.google.common.cache.ReferenceEntry<K, V> r3, long r4) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.common.cache.LocalCache$ValueReference r0 = r3.getValueReference()
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L13
            return r1
        L13:
            boolean r3 = r2.isExpired(r3, r4)
            if (r3 == 0) goto L1a
            return r1
        L1a:
            return r0
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V getOrDefault(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    V getOrLoad(K r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.cache.CacheLoader<? super K, V> r0 = r1.defaultLoader
            java.lang.Object r2 = r1.get(r2, r0)
            return r2
    }

    int hash(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.base.Equivalence<java.lang.Object> r0 = r1.keyEquivalence
            int r2 = r0.hash(r2)
            int r2 = rehash(r2)
            return r2
    }

    void invalidateAll(java.lang.Iterable<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r2.next()
            r1.remove(r0)
            goto L4
        L12:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
            r9 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r9.segments
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

    boolean isExpired(com.google.common.cache.ReferenceEntry<K, V> r7, long r8) {
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r7)
            boolean r0 = r6.expiresAfterAccess()
            r1 = 1
            if (r0 == 0) goto L17
            long r2 = r7.getAccessTime()
            long r2 = r8 - r2
            long r4 = r6.expireAfterAccessNanos
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L17
            return r1
        L17:
            boolean r0 = r6.expiresAfterWrite()
            if (r0 == 0) goto L29
            long r2 = r7.getWriteTime()
            long r8 = r8 - r2
            long r2 = r6.expireAfterWriteNanos
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 < 0) goto L29
            return r1
        L29:
            r7 = 0
            return r7
    }

    @com.google.common.annotations.VisibleForTesting
    boolean isLive(com.google.common.cache.ReferenceEntry<K, V> r2, long r3) {
            r1 = this;
            int r0 = r2.getHash()
            com.google.common.cache.LocalCache$Segment r0 = r1.segmentFor(r0)
            java.lang.Object r2 = r0.getLiveValue(r2, r3)
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
            com.google.common.cache.LocalCache$KeySet r0 = new com.google.common.cache.LocalCache$KeySet
            r0.<init>(r1, r1)
            r1.keySet = r0
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    java.util.Map<K, V> loadAll(java.util.Set<? extends K> r7, com.google.common.cache.CacheLoader<? super K, V> r8) throws java.util.concurrent.ExecutionException {
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Stopwatch r0 = com.google.common.base.Stopwatch.createStarted()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.loadAll(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Error -> L91 java.lang.Exception -> L98 java.lang.RuntimeException -> L9f java.lang.InterruptedException -> La6 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> Lb4
            if (r7 == 0) goto L6c
            r0.stop()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = 1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadSuccess(r0)
            return r7
        L4a:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L6c:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L8e:
            r7 = move-exception
            r1 = 0
            goto Lb7
        L91:
            r7 = move-exception
            com.google.common.util.concurrent.ExecutionError r8 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L98:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L9f:
            r7 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r8 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        La6:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8e
            r8.interrupt()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        Lb4:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r7 = move-exception
        Lb7:
            if (r1 != 0) goto Lc4
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadException(r0)
        Lc4:
            throw r7
    }

    long longSize() {
            r7 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r7.segments
            r1 = 0
            r3 = 0
            r4 = 0
        L6:
            int r5 = r0.length
            if (r4 >= r5) goto L16
            r5 = r0[r4]
            int r5 = r5.count
            int r5 = java.lang.Math.max(r3, r5)
            long r5 = (long) r5
            long r1 = r1 + r5
            int r4 = r4 + 1
            goto L6
        L16:
            return r1
    }

    @com.google.common.annotations.VisibleForTesting
    com.google.common.cache.ReferenceEntry<K, V> newEntry(K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
            r1 = this;
            com.google.common.cache.LocalCache$Segment r0 = r1.segmentFor(r3)
            r0.lock()
            com.google.common.cache.ReferenceEntry r2 = r0.newEntry(r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            r0.unlock()
            return r2
        Lf:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    final com.google.common.cache.LocalCache.Segment<K, V>[] newSegmentArray(int r1) {
            r0 = this;
            com.google.common.cache.LocalCache$Segment[] r1 = new com.google.common.cache.LocalCache.Segment[r1]
            return r1
    }

    @com.google.common.annotations.VisibleForTesting
    com.google.common.cache.LocalCache.ValueReference<K, V> newValueReference(com.google.common.cache.ReferenceEntry<K, V> r3, V r4, int r5) {
            r2 = this;
            int r0 = r3.getHash()
            com.google.common.cache.LocalCache$Strength r1 = r2.valueStrength
            com.google.common.cache.LocalCache$Segment r0 = r2.segmentFor(r0)
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.cache.LocalCache$ValueReference r3 = r1.referenceValue(r0, r3, r4, r5)
            return r3
    }

    void processPendingNotifications() {
            r4 = this;
        L0:
            java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> r0 = r4.removalNotificationQueue
            java.lang.Object r0 = r0.poll()
            com.google.common.cache.RemovalNotification r0 = (com.google.common.cache.RemovalNotification) r0
            if (r0 == 0) goto L1b
            com.google.common.cache.RemovalListener<K, V> r1 = r4.removalListener     // Catch: java.lang.Throwable -> L10
            r1.onRemoval(r0)     // Catch: java.lang.Throwable -> L10
            goto L0
        L10:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.cache.LocalCache.logger
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "Exception thrown by removal listener"
            r1.log(r2, r3, r0)
            goto L0
        L1b:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.cache.LocalCache$Segment r1 = r3.segmentFor(r0)
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
    public V putIfAbsent(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.cache.LocalCache$Segment r1 = r3.segmentFor(r0)
            r2 = 1
            java.lang.Object r4 = r1.put(r4, r0, r5, r2)
            return r4
    }

    void reclaimKey(com.google.common.cache.ReferenceEntry<K, V> r3) {
            r2 = this;
            int r0 = r3.getHash()
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            r1.reclaimKey(r3, r0)
            return
    }

    void reclaimValue(com.google.common.cache.LocalCache.ValueReference<K, V> r4) {
            r3 = this;
            com.google.common.cache.ReferenceEntry r0 = r4.getEntry()
            int r1 = r0.getHash()
            com.google.common.cache.LocalCache$Segment r2 = r3.segmentFor(r1)
            java.lang.Object r0 = r0.getKey()
            r2.reclaimValue(r0, r1, r4)
            return
    }

    boolean recordsAccess() {
            r1 = this;
            boolean r0 = r1.expiresAfterAccess()
            return r0
    }

    boolean recordsTime() {
            r1 = this;
            boolean r0 = r1.recordsWrite()
            if (r0 != 0) goto Lf
            boolean r0 = r1.recordsAccess()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    boolean recordsWrite() {
            r1 = this;
            boolean r0 = r1.expiresAfterWrite()
            if (r0 != 0) goto Lf
            boolean r0 = r1.refreshes()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    void refresh(K r5) {
            r4 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r4.hash(r0)
            com.google.common.cache.LocalCache$Segment r1 = r4.segmentFor(r0)
            com.google.common.cache.CacheLoader<? super K, V> r2 = r4.defaultLoader
            r3 = 0
            r1.refresh(r5, r0, r2, r3)
            return
    }

    boolean refreshes() {
            r5 = this;
            long r0 = r5.refreshNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.remove(r3, r0)
            return r3
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r2 = this;
            if (r3 == 0) goto L12
            if (r4 != 0) goto L5
            goto L12
        L5:
            int r0 = r2.hash(r3)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            boolean r3 = r1.remove(r3, r0, r4)
            return r3
        L12:
            r3 = 0
            return r3
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K r3, V r4) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r2.hash(r3)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.replace(r3, r0, r4)
            return r3
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r4, V r5) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r5)
            if (r4 != 0) goto La
            r3 = 0
            return r3
        La:
            int r0 = r2.hash(r3)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            boolean r3 = r1.replace(r3, r0, r4, r5)
            return r3
    }

    com.google.common.cache.LocalCache.Segment<K, V> segmentFor(int r3) {
            r2 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r2.segments
            int r1 = r2.segmentShift
            int r3 = r3 >>> r1
            int r1 = r2.segmentMask
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r2 = this;
            long r0 = r2.longSize()
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }

    boolean usesAccessEntries() {
            r1 = this;
            boolean r0 = r1.usesAccessQueue()
            if (r0 != 0) goto Lf
            boolean r0 = r1.recordsAccess()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    boolean usesAccessQueue() {
            r1 = this;
            boolean r0 = r1.expiresAfterAccess()
            if (r0 != 0) goto Lf
            boolean r0 = r1.evictsBySize()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    boolean usesKeyReferences() {
            r2 = this;
            com.google.common.cache.LocalCache$Strength r0 = r2.keyStrength
            com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.STRONG
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    boolean usesValueReferences() {
            r2 = this;
            com.google.common.cache.LocalCache$Strength r0 = r2.valueStrength
            com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.STRONG
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    boolean usesWriteEntries() {
            r1 = this;
            boolean r0 = r1.usesWriteQueue()
            if (r0 != 0) goto Lf
            boolean r0 = r1.recordsWrite()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    boolean usesWriteQueue() {
            r1 = this;
            boolean r0 = r1.expiresAfterWrite()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection<V> r0 = r1.values
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.common.cache.LocalCache$Values r0 = new com.google.common.cache.LocalCache$Values
            r0.<init>(r1, r1)
            r1.values = r0
            return r0
    }
}
