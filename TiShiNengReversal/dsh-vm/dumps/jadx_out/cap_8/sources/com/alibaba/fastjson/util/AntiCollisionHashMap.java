package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AntiCollisionHashMap<K, V> extends java.util.AbstractMap<K, V> implements java.util.Map<K, V>, java.lang.Cloneable, java.io.Serializable {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    static final int KEY = 16777619;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int M_MASK = -2023358765;
    static final int SEED = -2128831035;
    private static final long serialVersionUID = 362498820763181265L;
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    volatile transient java.util.Set<K> keySet;
    final float loadFactor;
    volatile transient int modCount;
    final int random;
    transient int size;
    transient com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V>[] table;
    int threshold;
    volatile transient java.util.Collection<V> values;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.alibaba.fastjson.util.AntiCollisionHashMap$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Entry<K, V> implements java.util.Map.Entry<K, V> {
        final int hash;
        final K key;
        com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> next;
        V value;

        Entry(int r1, K r2, V r3, com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> r4) {
                r0 = this;
                r0.<init>()
                r0.value = r3
                r0.next = r4
                r0.key = r2
                r0.hash = r1
                return
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r3.getKey()
                java.lang.Object r2 = r4.getKey()
                if (r0 == r2) goto L1a
                if (r0 == 0) goto L2d
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L2d
            L1a:
                java.lang.Object r0 = r3.getValue()
                java.lang.Object r4 = r4.getValue()
                if (r0 == r4) goto L2e
                if (r0 == 0) goto L2d
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L2d
                goto L2e
            L2d:
                return r1
            L2e:
                r4 = 1
                return r4
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
                r3 = this;
                K r0 = r3.key
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                V r2 = r3.value
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r2.hashCode()
            L14:
                r0 = r0 ^ r1
                return r0
        }

        void recordAccess(com.alibaba.fastjson.util.AntiCollisionHashMap<K, V> r1) {
                r0 = this;
                return
        }

        void recordRemoval(com.alibaba.fastjson.util.AntiCollisionHashMap<K, V> r1) {
                r0 = this;
                return
        }

        @Override // java.util.Map.Entry
        public final V setValue(V r2) {
                r1 = this;
                V r0 = r1.value
                r1.value = r2
                return r0
        }

        public final java.lang.String toString() {
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EntryIterator extends com.alibaba.fastjson.util.AntiCollisionHashMap<K, V>.HashIterator<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.alibaba.fastjson.util.AntiCollisionHashMap this$0;

        private EntryIterator(com.alibaba.fastjson.util.AntiCollisionHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ EntryIterator(com.alibaba.fastjson.util.AntiCollisionHashMap r1, com.alibaba.fastjson.util.AntiCollisionHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r0 = r1.nextEntry()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.alibaba.fastjson.util.AntiCollisionHashMap this$0;

        private EntrySet(com.alibaba.fastjson.util.AntiCollisionHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ EntrySet(com.alibaba.fastjson.util.AntiCollisionHashMap r1, com.alibaba.fastjson.util.AntiCollisionHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
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
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r3.this$0
                java.lang.Object r2 = r4.getKey()
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r0 = r0.getEntry(r2)
                if (r0 == 0) goto L1c
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r4 = 1
                return r4
            L1c:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                java.util.Iterator r0 = r0.newEntryIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r2 = r0.removeMapping(r2)
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
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class HashIterator<E> implements java.util.Iterator<E> {
        com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> current;
        int expectedModCount;
        int index;
        com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> next;
        final /* synthetic */ com.alibaba.fastjson.util.AntiCollisionHashMap this$0;

        HashIterator(com.alibaba.fastjson.util.AntiCollisionHashMap r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                int r0 = r3.modCount
                r2.expectedModCount = r0
                int r0 = r3.size
                if (r0 <= 0) goto L1f
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r3 = r3.table
            Lf:
                int r0 = r2.index
                int r1 = r3.length
                if (r0 >= r1) goto L1f
                int r1 = r0 + 1
                r2.index = r1
                r0 = r3[r0]
                r2.next = r0
                if (r0 != 0) goto L1f
                goto Lf
            L1f:
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r0 = r1.next
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        final com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> nextEntry() {
                r4 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r4.this$0
                int r0 = r0.modCount
                int r1 = r4.expectedModCount
                if (r0 != r1) goto L2f
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r0 = r4.next
                if (r0 == 0) goto L29
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r1 = r0.next
                r4.next = r1
                if (r1 != 0) goto L26
                com.alibaba.fastjson.util.AntiCollisionHashMap r1 = r4.this$0
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r1.table
            L16:
                int r2 = r4.index
                int r3 = r1.length
                if (r2 >= r3) goto L26
                int r3 = r2 + 1
                r4.index = r3
                r2 = r1[r2]
                r4.next = r2
                if (r2 != 0) goto L26
                goto L16
            L26:
                r4.current = r0
                return r0
            L29:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
            L2f:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r0 = r2.current
                if (r0 == 0) goto L25
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r2.this$0
                int r0 = r0.modCount
                int r1 = r2.expectedModCount
                if (r0 != r1) goto L1f
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r0 = r2.current
                K r0 = r0.key
                r1 = 0
                r2.current = r1
                com.alibaba.fastjson.util.AntiCollisionHashMap r1 = r2.this$0
                r1.removeEntryForKey(r0)
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r2.this$0
                int r0 = r0.modCount
                r2.expectedModCount = r0
                return
            L1f:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class KeyIterator extends com.alibaba.fastjson.util.AntiCollisionHashMap<K, V>.HashIterator<K> {
        final /* synthetic */ com.alibaba.fastjson.util.AntiCollisionHashMap this$0;

        private KeyIterator(com.alibaba.fastjson.util.AntiCollisionHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ KeyIterator(com.alibaba.fastjson.util.AntiCollisionHashMap r1, com.alibaba.fastjson.util.AntiCollisionHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public K next() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getKey()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class KeySet extends java.util.AbstractSet<K> {
        final /* synthetic */ com.alibaba.fastjson.util.AntiCollisionHashMap this$0;

        private KeySet(com.alibaba.fastjson.util.AntiCollisionHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ KeySet(com.alibaba.fastjson.util.AntiCollisionHashMap r1, com.alibaba.fastjson.util.AntiCollisionHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                java.util.Iterator r0 = r0.newKeyIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r2 = r0.removeEntryForKey(r2)
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
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ValueIterator extends com.alibaba.fastjson.util.AntiCollisionHashMap<K, V>.HashIterator<V> {
        final /* synthetic */ com.alibaba.fastjson.util.AntiCollisionHashMap this$0;

        private ValueIterator(com.alibaba.fastjson.util.AntiCollisionHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ ValueIterator(com.alibaba.fastjson.util.AntiCollisionHashMap r1, com.alibaba.fastjson.util.AntiCollisionHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public V next() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r0 = r1.nextEntry()
                V r0 = r0.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Values extends java.util.AbstractCollection<V> {
        final /* synthetic */ com.alibaba.fastjson.util.AntiCollisionHashMap this$0;

        private Values(com.alibaba.fastjson.util.AntiCollisionHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ Values(com.alibaba.fastjson.util.AntiCollisionHashMap r1, com.alibaba.fastjson.util.AntiCollisionHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                java.util.Iterator r0 = r0.newValueIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.alibaba.fastjson.util.AntiCollisionHashMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    public AntiCollisionHashMap() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.keySet = r0
            r3.values = r0
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 99999(0x1869f, float:1.40128E-40)
            int r1 = r1.nextInt(r2)
            r3.random = r1
            r3.entrySet = r0
            r0 = 1061158912(0x3f400000, float:0.75)
            r3.loadFactor = r0
            r0 = 12
            r3.threshold = r0
            r0 = 16
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry[] r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap.Entry[r0]
            r3.table = r0
            r3.init()
            return
    }

    public AntiCollisionHashMap(int r2) {
            r1 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r2, r0)
            return
    }

    public AntiCollisionHashMap(int r4, float r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.keySet = r0
            r3.values = r0
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 99999(0x1869f, float:1.40128E-40)
            int r1 = r1.nextInt(r2)
            r3.random = r1
            r3.entrySet = r0
            if (r4 < 0) goto L58
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 <= r0) goto L20
            r4 = 1073741824(0x40000000, float:2.0)
        L20:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L41
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 != 0) goto L41
            r0 = 1
        L2c:
            if (r0 >= r4) goto L31
            int r0 = r0 << 1
            goto L2c
        L31:
            r3.loadFactor = r5
            float r4 = (float) r0
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.threshold = r4
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry[] r4 = new com.alibaba.fastjson.util.AntiCollisionHashMap.Entry[r0]
            r3.table = r4
            r3.init()
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal load factor: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal initial capacity: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    public AntiCollisionHashMap(java.util.Map<? extends K, ? extends V> r4) {
            r3 = this;
            int r0 = r4.size()
            float r0 = (float) r0
            r1 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 / r1
            int r0 = (int) r0
            int r0 = r0 + 1
            r2 = 16
            int r0 = java.lang.Math.max(r0, r2)
            r3.<init>(r0, r1)
            r3.putAllForCreate(r4)
            return
    }

    private boolean containsNullValue() {
            r5 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r5.table
            r1 = 0
            r2 = 0
        L4:
            int r3 = r0.length
            if (r2 >= r3) goto L17
            r3 = r0[r2]
        L9:
            if (r3 == 0) goto L14
            V r4 = r3.value
            if (r4 != 0) goto L11
            r0 = 1
            return r0
        L11:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r3 = r3.next
            goto L9
        L14:
            int r2 = r2 + 1
            goto L4
        L17:
            return r1
    }

    private java.util.Set<java.util.Map.Entry<K, V>> entrySet0() {
            r2 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.entrySet
            if (r0 == 0) goto L5
            return r0
        L5:
            com.alibaba.fastjson.util.AntiCollisionHashMap$EntrySet r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap$EntrySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.entrySet = r0
            return r0
    }

    private V getForNullKey() {
            r2 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r2.table
            r1 = 0
            r0 = r0[r1]
        L5:
            if (r0 == 0) goto L11
            K r1 = r0.key
            if (r1 != 0) goto Le
            V r0 = r0.value
            return r0
        Le:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r0 = r0.next
            goto L5
        L11:
            r0 = 0
            return r0
    }

    static int hash(int r2) {
            int r2 = r2 * r2
            int r0 = r2 >>> 20
            int r1 = r2 >>> 12
            r0 = r0 ^ r1
            r2 = r2 ^ r0
            int r0 = r2 >>> 7
            r0 = r0 ^ r2
            int r2 = r2 >>> 4
            r2 = r2 ^ r0
            return r2
    }

    private int hashString(java.lang.String r4) {
            r3 = this;
            r0 = -2128831035(0xffffffff811c9dc5, float:-2.876587E-38)
            int r1 = r3.random
            int r1 = r1 * r0
            r0 = 0
        L8:
            int r2 = r4.length()
            if (r0 >= r2) goto L1b
            r2 = 16777619(0x1000193, float:2.3511016E-38)
            int r1 = r1 * r2
            char r2 = r4.charAt(r0)
            r1 = r1 ^ r2
            int r0 = r0 + 1
            goto L8
        L1b:
            int r4 = r1 >> 1
            r4 = r4 ^ r1
            r0 = -2023358765(0xffffffff8765fed3, float:-1.7302931E-34)
            r4 = r4 & r0
            return r4
    }

    static int indexFor(int r0, int r1) {
            int r1 = r1 + (-1)
            r0 = r0 & r1
            return r0
    }

    private void putAllForCreate(java.util.Map<? extends K, ? extends V> r3) {
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
            r2.putForCreate(r1, r0)
            goto L8
        L20:
            return
    }

    private void putForCreate(K r5, V r6) {
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            goto L1c
        L4:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L14
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r4.hashString(r0)
            int r0 = hash(r0)
            goto L1c
        L14:
            int r0 = r5.hashCode()
            int r0 = hash(r0)
        L1c:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r4.table
            int r1 = r1.length
            int r1 = indexFor(r0, r1)
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r2 = r4.table
            r2 = r2[r1]
        L27:
            if (r2 == 0) goto L3f
            int r3 = r2.hash
            if (r3 != r0) goto L3c
            K r3 = r2.key
            if (r3 == r5) goto L39
            if (r5 == 0) goto L3c
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3c
        L39:
            r2.value = r6
            return
        L3c:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r2 = r2.next
            goto L27
        L3f:
            r4.createEntry(r0, r5, r6, r1)
            return
    }

    private V putForNullKey(V r4) {
            r3 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r3.table
            r1 = 0
            r0 = r0[r1]
        L5:
            if (r0 == 0) goto L16
            K r2 = r0.key
            if (r2 != 0) goto L13
            V r1 = r0.value
            r0.value = r4
            r0.recordAccess(r3)
            return r1
        L13:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r0 = r0.next
            goto L5
        L16:
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
            r0 = 0
            r3.addEntry(r1, r0, r4, r1)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            r5.defaultReadObject()
            int r0 = r5.readInt()
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry[] r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap.Entry[r0]
            r4.table = r0
            r4.init()
            int r0 = r5.readInt()
            r1 = 0
        L13:
            if (r1 >= r0) goto L23
            java.lang.Object r2 = r5.readObject()
            java.lang.Object r3 = r5.readObject()
            r4.putForCreate(r2, r3)
            int r1 = r1 + 1
            goto L13
        L23:
            return
    }

    private void writeObject(java.io.ObjectOutputStream r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.size
            if (r0 <= 0) goto Ld
            java.util.Set r0 = r3.entrySet0()
            java.util.Iterator r0 = r0.iterator()
            goto Le
        Ld:
            r0 = 0
        Le:
            r4.defaultWriteObject()
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r3.table
            int r1 = r1.length
            r4.writeInt(r1)
            int r1 = r3.size
            r4.writeInt(r1)
            if (r0 == 0) goto L39
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeObject(r1)
            goto L1e
        L39:
            return
    }

    void addEntry(int r4, K r5, V r6, int r7) {
            r3 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r3.table
            r1 = r0[r7]
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r2 = new com.alibaba.fastjson.util.AntiCollisionHashMap$Entry
            r2.<init>(r4, r5, r6, r1)
            r0[r7] = r2
            int r4 = r3.size
            int r5 = r4 + 1
            r3.size = r5
            int r5 = r3.threshold
            if (r4 < r5) goto L1d
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r4 = r3.table
            int r4 = r4.length
            int r4 = r4 * 2
            r3.resize(r4)
        L1d:
            return
    }

    int capacity() {
            r1 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r1.table
            int r0 = r0.length
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r4.table
            r1 = 0
            r2 = 0
        La:
            int r3 = r0.length
            if (r2 >= r3) goto L13
            r3 = 0
            r0[r2] = r3
            int r2 = r2 + 1
            goto La
        L13:
            r4.size = r1
            return
    }

    @Override // java.util.AbstractMap
    public java.lang.Object clone() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L8
            com.alibaba.fastjson.util.AntiCollisionHashMap r1 = (com.alibaba.fastjson.util.AntiCollisionHashMap) r1     // Catch: java.lang.CloneNotSupportedException -> L8
            goto L9
        L8:
            r1 = r0
        L9:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r2 = r3.table
            int r2 = r2.length
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry[] r2 = new com.alibaba.fastjson.util.AntiCollisionHashMap.Entry[r2]
            r1.table = r2
            r1.entrySet = r0
            r0 = 0
            r1.modCount = r0
            r1.size = r0
            r1.init()
            r1.putAllForCreate(r3)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r1 = r0.getEntry(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L7
            boolean r6 = r5.containsNullValue()
            return r6
        L7:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r5.table
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r0.length
            if (r2 >= r3) goto L22
            r3 = r0[r2]
        L10:
            if (r3 == 0) goto L1f
            V r4 = r3.value
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1c
            r6 = 1
            return r6
        L1c:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r3 = r3.next
            goto L10
        L1f:
            int r2 = r2 + 1
            goto Lb
        L22:
            return r1
    }

    void createEntry(int r4, K r5, V r6, int r7) {
            r3 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r3.table
            r1 = r0[r7]
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r2 = new com.alibaba.fastjson.util.AntiCollisionHashMap$Entry
            r2.<init>(r4, r5, r6, r1)
            r0[r7] = r2
            int r4 = r3.size
            int r4 = r4 + 1
            r3.size = r4
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.entrySet0()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L7
            java.lang.Object r4 = r3.getForNullKey()
            return r4
        L7:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L17
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.hashString(r0)
            int r0 = hash(r0)
            goto L1f
        L17:
            int r0 = r4.hashCode()
            int r0 = hash(r0)
        L1f:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r3.table
            int r2 = r1.length
            int r2 = indexFor(r0, r2)
            r1 = r1[r2]
        L28:
            if (r1 == 0) goto L3e
            int r2 = r1.hash
            if (r2 != r0) goto L3b
            K r2 = r1.key
            if (r2 == r4) goto L38
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L3b
        L38:
            V r4 = r1.value
            return r4
        L3b:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r1 = r1.next
            goto L28
        L3e:
            r4 = 0
            return r4
    }

    final com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> getEntry(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 0
            goto L1c
        L4:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L14
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.hashString(r0)
            int r0 = hash(r0)
            goto L1c
        L14:
            int r0 = r4.hashCode()
            int r0 = hash(r0)
        L1c:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r3.table
            int r2 = r1.length
            int r2 = indexFor(r0, r2)
            r1 = r1[r2]
        L25:
            if (r1 == 0) goto L3b
            int r2 = r1.hash
            if (r2 != r0) goto L38
            K r2 = r1.key
            if (r2 == r4) goto L37
            if (r4 == 0) goto L38
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L38
        L37:
            return r1
        L38:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r1 = r1.next
            goto L25
        L3b:
            r4 = 0
            return r4
    }

    void init() {
            r0 = this;
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            java.util.Set<K> r0 = r2.keySet
            if (r0 == 0) goto L5
            return r0
        L5:
            com.alibaba.fastjson.util.AntiCollisionHashMap$KeySet r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap$KeySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.keySet = r0
            return r0
    }

    float loadFactor() {
            r1 = this;
            float r0 = r1.loadFactor
            return r0
    }

    java.util.Iterator<java.util.Map.Entry<K, V>> newEntryIterator() {
            r2 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$EntryIterator r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap$EntryIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    java.util.Iterator<K> newKeyIterator() {
            r2 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$KeyIterator r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap$KeyIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    java.util.Iterator<V> newValueIterator() {
            r2 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$ValueIterator r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap$ValueIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r5, V r6) {
            r4 = this;
            if (r5 != 0) goto L7
            java.lang.Object r5 = r4.putForNullKey(r6)
            return r5
        L7:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L17
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r4.hashString(r0)
            int r0 = hash(r0)
            goto L1f
        L17:
            int r0 = r5.hashCode()
            int r0 = hash(r0)
        L1f:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r4.table
            int r1 = r1.length
            int r1 = indexFor(r0, r1)
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r2 = r4.table
            r2 = r2[r1]
        L2a:
            if (r2 == 0) goto L45
            int r3 = r2.hash
            if (r3 != r0) goto L42
            K r3 = r2.key
            if (r3 == r5) goto L3a
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L42
        L3a:
            V r5 = r2.value
            r2.value = r6
            r2.recordAccess(r4)
            return r5
        L42:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r2 = r2.next
            goto L2a
        L45:
            int r2 = r4.modCount
            int r2 = r2 + 1
            r4.modCount = r2
            r4.addEntry(r0, r5, r6, r1)
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r3.size()
            if (r0 != 0) goto L7
            goto L49
        L7:
            int r1 = r2.threshold
            if (r0 <= r1) goto L29
            float r0 = (float) r0
            float r1 = r2.loadFactor
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            int r0 = (int) r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 <= r1) goto L19
            r0 = 1073741824(0x40000000, float:2.0)
        L19:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r2.table
            int r1 = r1.length
        L1c:
            if (r1 >= r0) goto L21
            int r1 = r1 << 1
            goto L1c
        L21:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r2.table
            int r0 = r0.length
            if (r1 <= r0) goto L29
            r2.resize(r1)
        L29:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L31
        L49:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r1) {
            r0 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry r1 = r0.removeEntryForKey(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            V r1 = r1.value
            return r1
    }

    final com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> removeEntryForKey(java.lang.Object r7) {
            r6 = this;
            if (r7 != 0) goto L4
            r0 = 0
            goto L1c
        L4:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L14
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r6.hashString(r0)
            int r0 = hash(r0)
            goto L1c
        L14:
            int r0 = r7.hashCode()
            int r0 = hash(r0)
        L1c:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r6.table
            int r1 = r1.length
            int r1 = indexFor(r0, r1)
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r2 = r6.table
            r2 = r2[r1]
            r3 = r2
        L28:
            if (r2 == 0) goto L58
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r4 = r2.next
            int r5 = r2.hash
            if (r5 != r0) goto L55
            K r5 = r2.key
            if (r5 == r7) goto L3c
            if (r7 == 0) goto L55
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L55
        L3c:
            int r7 = r6.modCount
            int r7 = r7 + 1
            r6.modCount = r7
            int r7 = r6.size
            int r7 = r7 + (-1)
            r6.size = r7
            if (r3 != r2) goto L4f
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r7 = r6.table
            r7[r1] = r4
            goto L51
        L4f:
            r3.next = r4
        L51:
            r2.recordRemoval(r6)
            return r2
        L55:
            r3 = r2
            r2 = r4
            goto L28
        L58:
            return r2
    }

    final com.alibaba.fastjson.util.AntiCollisionHashMap.Entry<K, V> removeMapping(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r7 = 0
            return r7
        L6:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getKey()
            if (r0 != 0) goto L10
            r0 = 0
            goto L27
        L10:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L1f
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r6.hashString(r0)
            int r0 = hash(r0)
            goto L27
        L1f:
            int r0 = r0.hashCode()
            int r0 = hash(r0)
        L27:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r1 = r6.table
            int r1 = r1.length
            int r1 = indexFor(r0, r1)
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r2 = r6.table
            r2 = r2[r1]
            r3 = r2
        L33:
            if (r2 == 0) goto L5d
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r4 = r2.next
            int r5 = r2.hash
            if (r5 != r0) goto L5a
            boolean r5 = r2.equals(r7)
            if (r5 == 0) goto L5a
            int r7 = r6.modCount
            int r7 = r7 + 1
            r6.modCount = r7
            int r7 = r6.size
            int r7 = r7 + (-1)
            r6.size = r7
            if (r3 != r2) goto L54
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r7 = r6.table
            r7[r1] = r4
            goto L56
        L54:
            r3.next = r4
        L56:
            r2.recordRemoval(r6)
            return r2
        L5a:
            r3 = r2
            r2 = r4
            goto L33
        L5d:
            return r2
    }

    void resize(int r3) {
            r2 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r2.table
            int r0 = r0.length
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Ld
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.threshold = r3
            return
        Ld:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry[] r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap.Entry[r3]
            r2.transfer(r0)
            r2.table = r0
            float r3 = (float) r3
            float r0 = r2.loadFactor
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.threshold = r3
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    void transfer(com.alibaba.fastjson.util.AntiCollisionHashMap.Entry[] r8) {
            r7 = this;
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V>[] r0 = r7.table
            int r1 = r8.length
            r2 = 0
        L4:
            int r3 = r0.length
            if (r2 >= r3) goto L24
            r3 = r0[r2]
            if (r3 == 0) goto L21
            r4 = 0
            r0[r2] = r4
        Le:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Entry<K, V> r4 = r3.next
            int r5 = r3.hash
            int r5 = indexFor(r5, r1)
            r6 = r8[r5]
            r3.next = r6
            r8[r5] = r3
            if (r4 != 0) goto L1f
            goto L21
        L1f:
            r3 = r4
            goto Le
        L21:
            int r2 = r2 + 1
            goto L4
        L24:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
            r2 = this;
            java.util.Collection<V> r0 = r2.values
            if (r0 == 0) goto L5
            return r0
        L5:
            com.alibaba.fastjson.util.AntiCollisionHashMap$Values r0 = new com.alibaba.fastjson.util.AntiCollisionHashMap$Values
            r1 = 0
            r0.<init>(r2, r1)
            r2.values = r0
            return r0
    }
}
