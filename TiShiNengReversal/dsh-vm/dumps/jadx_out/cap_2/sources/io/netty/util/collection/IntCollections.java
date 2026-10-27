package io.netty.util.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class IntCollections {
    private static final io.netty.util.collection.IntObjectMap<java.lang.Object> EMPTY_MAP = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.util.collection.IntCollections$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class EmptyMap implements io.netty.util.collection.IntObjectMap<java.lang.Object> {
        private EmptyMap() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ EmptyMap(io.netty.util.collection.IntCollections.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Map
        public void clear() {
                r0 = this;
                return
        }

        @Override // io.netty.util.collection.IntObjectMap
        public boolean containsKey(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.Map
        public boolean containsKey(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.Map
        public boolean containsValue(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // io.netty.util.collection.IntObjectMap
        public java.lang.Iterable<io.netty.util.collection.IntObjectMap.PrimitiveEntry<java.lang.Object>> entries() {
                r1 = this;
                java.util.Set r0 = java.util.Collections.EMPTY_SET
                return r0
        }

        @Override // java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.Integer, java.lang.Object>> entrySet() {
                r1 = this;
                java.util.Set r0 = java.util.Collections.EMPTY_SET
                return r0
        }

        @Override // io.netty.util.collection.IntObjectMap
        public java.lang.Object get(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.Map
        public java.lang.Object get(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.Map
        public boolean isEmpty() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.Map
        public java.util.Set<java.lang.Integer> keySet() {
                r1 = this;
                java.util.Set r0 = java.util.Collections.EMPTY_SET
                return r0
        }

        @Override // io.netty.util.collection.IntObjectMap
        public java.lang.Object put(int r1, java.lang.Object r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "put"
                r1.<init>(r2)
                throw r1
        }

        /* renamed from: put, reason: avoid collision after fix types in other method */
        public java.lang.Object put2(java.lang.Integer r1, java.lang.Object r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Integer r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r1 = r0.put2(r1, r2)
                return r1
        }

        @Override // java.util.Map
        public void putAll(java.util.Map<? extends java.lang.Integer, ?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // io.netty.util.collection.IntObjectMap
        public java.lang.Object remove(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.Map
        public java.lang.Object remove(java.lang.Object r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.Map
        public int size() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Map
        public java.util.Collection<java.lang.Object> values() {
                r1 = this;
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class UnmodifiableMap<V> implements io.netty.util.collection.IntObjectMap<V> {
        private java.lang.Iterable<io.netty.util.collection.IntObjectMap.PrimitiveEntry<V>> entries;
        private java.util.Set<java.util.Map.Entry<java.lang.Integer, V>> entrySet;
        private java.util.Set<java.lang.Integer> keySet;
        private final io.netty.util.collection.IntObjectMap<V> map;
        private java.util.Collection<V> values;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class EntryImpl implements io.netty.util.collection.IntObjectMap.PrimitiveEntry<V> {
            private final io.netty.util.collection.IntObjectMap.PrimitiveEntry<V> entry;
            final /* synthetic */ io.netty.util.collection.IntCollections.UnmodifiableMap this$0;

            EntryImpl(io.netty.util.collection.IntCollections.UnmodifiableMap r1, io.netty.util.collection.IntObjectMap.PrimitiveEntry<V> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.entry = r2
                    return
            }

            @Override // io.netty.util.collection.IntObjectMap.PrimitiveEntry
            public int key() {
                    r1 = this;
                    io.netty.util.collection.IntObjectMap$PrimitiveEntry<V> r0 = r1.entry
                    int r0 = r0.key()
                    return r0
            }

            @Override // io.netty.util.collection.IntObjectMap.PrimitiveEntry
            public void setValue(V r2) {
                    r1 = this;
                    java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                    java.lang.String r0 = "setValue"
                    r2.<init>(r0)
                    throw r2
            }

            @Override // io.netty.util.collection.IntObjectMap.PrimitiveEntry
            public V value() {
                    r1 = this;
                    io.netty.util.collection.IntObjectMap$PrimitiveEntry<V> r0 = r1.entry
                    java.lang.Object r0 = r0.value()
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class IteratorImpl implements java.util.Iterator<io.netty.util.collection.IntObjectMap.PrimitiveEntry<V>> {
            final java.util.Iterator<io.netty.util.collection.IntObjectMap.PrimitiveEntry<V>> iter;
            final /* synthetic */ io.netty.util.collection.IntCollections.UnmodifiableMap this$0;

            IteratorImpl(io.netty.util.collection.IntCollections.UnmodifiableMap r1, java.util.Iterator<io.netty.util.collection.IntObjectMap.PrimitiveEntry<V>> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.iter = r2
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<io.netty.util.collection.IntObjectMap$PrimitiveEntry<V>> r0 = r1.iter
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public io.netty.util.collection.IntObjectMap.PrimitiveEntry<V> next() {
                    r3 = this;
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L16
                    io.netty.util.collection.IntCollections$UnmodifiableMap$EntryImpl r0 = new io.netty.util.collection.IntCollections$UnmodifiableMap$EntryImpl
                    io.netty.util.collection.IntCollections$UnmodifiableMap r1 = r3.this$0
                    java.util.Iterator<io.netty.util.collection.IntObjectMap$PrimitiveEntry<V>> r2 = r3.iter
                    java.lang.Object r2 = r2.next()
                    io.netty.util.collection.IntObjectMap$PrimitiveEntry r2 = (io.netty.util.collection.IntObjectMap.PrimitiveEntry) r2
                    r0.<init>(r1, r2)
                    return r0
                L16:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                    r1 = this;
                    io.netty.util.collection.IntObjectMap$PrimitiveEntry r0 = r1.next()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "remove"
                    r0.<init>(r1)
                    throw r0
            }
        }

        UnmodifiableMap(io.netty.util.collection.IntObjectMap<V> r1) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                return
        }

        static /* synthetic */ io.netty.util.collection.IntObjectMap access$100(io.netty.util.collection.IntCollections.UnmodifiableMap r0) {
                io.netty.util.collection.IntObjectMap<V> r0 = r0.map
                return r0
        }

        @Override // java.util.Map
        public void clear() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "clear"
                r0.<init>(r1)
                throw r0
        }

        @Override // io.netty.util.collection.IntObjectMap
        public boolean containsKey(int r2) {
                r1 = this;
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.Map
        public boolean containsKey(java.lang.Object r2) {
                r1 = this;
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.Map
        public boolean containsValue(java.lang.Object r2) {
                r1 = this;
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // io.netty.util.collection.IntObjectMap
        public java.lang.Iterable<io.netty.util.collection.IntObjectMap.PrimitiveEntry<V>> entries() {
                r1 = this;
                java.lang.Iterable<io.netty.util.collection.IntObjectMap$PrimitiveEntry<V>> r0 = r1.entries
                if (r0 != 0) goto Lb
                io.netty.util.collection.IntCollections$UnmodifiableMap$1 r0 = new io.netty.util.collection.IntCollections$UnmodifiableMap$1
                r0.<init>(r1)
                r1.entries = r0
            Lb:
                java.lang.Iterable<io.netty.util.collection.IntObjectMap$PrimitiveEntry<V>> r0 = r1.entries
                return r0
        }

        @Override // java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.Integer, V>> entrySet() {
                r1 = this;
                java.util.Set<java.util.Map$Entry<java.lang.Integer, V>> r0 = r1.entrySet
                if (r0 != 0) goto L10
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                java.util.Set r0 = r0.entrySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                r1.entrySet = r0
            L10:
                java.util.Set<java.util.Map$Entry<java.lang.Integer, V>> r0 = r1.entrySet
                return r0
        }

        @Override // io.netty.util.collection.IntObjectMap
        public V get(int r2) {
                r1 = this;
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // java.util.Map
        public V get(java.lang.Object r2) {
                r1 = this;
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // java.util.Map
        public boolean isEmpty() {
                r1 = this;
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Map
        public java.util.Set<java.lang.Integer> keySet() {
                r1 = this;
                java.util.Set<java.lang.Integer> r0 = r1.keySet
                if (r0 != 0) goto L10
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                java.util.Set r0 = r0.keySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                r1.keySet = r0
            L10:
                java.util.Set<java.lang.Integer> r0 = r1.keySet
                return r0
        }

        @Override // io.netty.util.collection.IntObjectMap
        public V put(int r1, V r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "put"
                r1.<init>(r2)
                throw r1
        }

        /* renamed from: put, reason: avoid collision after fix types in other method */
        public V put2(java.lang.Integer r1, V r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "put"
                r1.<init>(r2)
                throw r1
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Integer r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r1 = r0.put2(r1, r2)
                return r1
        }

        @Override // java.util.Map
        public void putAll(java.util.Map<? extends java.lang.Integer, ? extends V> r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "putAll"
                r2.<init>(r0)
                throw r2
        }

        @Override // io.netty.util.collection.IntObjectMap
        public V remove(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "remove"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Map
        public V remove(java.lang.Object r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "remove"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Map
        public int size() {
                r1 = this;
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Map
        public java.util.Collection<V> values() {
                r1 = this;
                java.util.Collection<V> r0 = r1.values
                if (r0 != 0) goto L10
                io.netty.util.collection.IntObjectMap<V> r0 = r1.map
                java.util.Collection r0 = r0.values()
                java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
                r1.values = r0
            L10:
                java.util.Collection<V> r0 = r1.values
                return r0
        }
    }

    static {
            io.netty.util.collection.IntCollections$EmptyMap r0 = new io.netty.util.collection.IntCollections$EmptyMap
            r1 = 0
            r0.<init>(r1)
            io.netty.util.collection.IntCollections.EMPTY_MAP = r0
            return
    }

    private IntCollections() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> io.netty.util.collection.IntObjectMap<V> emptyMap() {
            io.netty.util.collection.IntObjectMap<java.lang.Object> r0 = io.netty.util.collection.IntCollections.EMPTY_MAP
            return r0
    }

    public static <V> io.netty.util.collection.IntObjectMap<V> unmodifiableMap(io.netty.util.collection.IntObjectMap<V> r1) {
            io.netty.util.collection.IntCollections$UnmodifiableMap r0 = new io.netty.util.collection.IntCollections$UnmodifiableMap
            r0.<init>(r1)
            return r0
    }
}
