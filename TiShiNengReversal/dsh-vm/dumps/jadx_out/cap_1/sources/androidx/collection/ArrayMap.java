package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ArrayMap<K, V> extends androidx.collection.SimpleArrayMap<K, V> implements java.util.Map<K, V> {

    @androidx.annotation.Nullable
    androidx.collection.ArrayMap<K, V>.EntrySet mEntrySet;

    @androidx.annotation.Nullable
    androidx.collection.ArrayMap<K, V>.KeySet mKeySet;

    @androidx.annotation.Nullable
    androidx.collection.ArrayMap<K, V>.ValueCollection mValues;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        EntrySet(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @androidx.annotation.NonNull
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                androidx.collection.ArrayMap$MapIterator r0 = new androidx.collection.ArrayMap$MapIterator
                androidx.collection.ArrayMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeyIterator extends androidx.collection.IndexBasedArrayIterator<K> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        KeyIterator(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                int r1 = r1.size()
                r0.<init>(r1)
                return
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected K elementAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                java.lang.Object r2 = r0.keyAt(r2)
                return r2
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.removeAt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeySet implements java.util.Set<K> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        KeySet(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@androidx.annotation.NonNull java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@androidx.annotation.NonNull java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = androidx.collection.ArrayMap.equalsSetHelper(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                androidx.collection.ArrayMap r0 = r4.this$0
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = 0
            La:
                if (r0 < 0) goto L1e
                androidx.collection.ArrayMap r3 = r4.this$0
                java.lang.Object r3 = r3.keyAt(r0)
                if (r3 != 0) goto L16
                r3 = 0
                goto L1a
            L16:
                int r3 = r3.hashCode()
            L1a:
                int r2 = r2 + r3
                int r0 = r0 + (-1)
                goto La
            L1e:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @androidx.annotation.NonNull
        public java.util.Iterator<K> iterator() {
                r2 = this;
                androidx.collection.ArrayMap$KeyIterator r0 = new androidx.collection.ArrayMap$KeyIterator
                androidx.collection.ArrayMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto Lf
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.removeAt(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@androidx.annotation.NonNull java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r2 = r0.removeAll(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@androidx.annotation.NonNull java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r2 = r0.retainAll(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        @androidx.annotation.NonNull
        public java.lang.Object[] toArray() {
                r4 = this;
                androidx.collection.ArrayMap r0 = r4.this$0
                int r0 = r0.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
            L9:
                if (r2 >= r0) goto L16
                androidx.collection.ArrayMap r3 = r4.this$0
                java.lang.Object r3 = r3.keyAt(r2)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L9
            L16:
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        @androidx.annotation.NonNull
        public <T> T[] toArray(@androidx.annotation.NonNull T[] r4) {
                r3 = this;
                int r0 = r3.size()
                int r1 = r4.length
                if (r1 >= r0) goto L15
                java.lang.Class r4 = r4.getClass()
                java.lang.Class r4 = r4.getComponentType()
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
                java.lang.Object[] r4 = (java.lang.Object[]) r4
            L15:
                r1 = 0
            L16:
                if (r1 >= r0) goto L23
                androidx.collection.ArrayMap r2 = r3.this$0
                java.lang.Object r2 = r2.keyAt(r1)
                r4[r1] = r2
                int r1 = r1 + 1
                goto L16
            L23:
                int r1 = r4.length
                if (r1 <= r0) goto L29
                r1 = 0
                r4[r0] = r1
            L29:
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class MapIterator implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        MapIterator(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                int r1 = r1.size()
                int r1 = r1 + (-1)
                r0.mEnd = r1
                r1 = -1
                r0.mIndex = r1
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r4.mEntryValid
                if (r0 == 0) goto L33
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                androidx.collection.ArrayMap r2 = r4.this$0
                int r3 = r4.mIndex
                java.lang.Object r2 = r2.keyAt(r3)
                boolean r0 = androidx.collection.internal.ContainerHelpersKt.equal(r0, r2)
                if (r0 == 0) goto L32
                java.lang.Object r5 = r5.getValue()
                androidx.collection.ArrayMap r0 = r4.this$0
                int r2 = r4.mIndex
                java.lang.Object r0 = r0.valueAt(r2)
                boolean r5 = androidx.collection.internal.ContainerHelpersKt.equal(r5, r0)
                if (r5 == 0) goto L32
                r5 = 1
                return r5
            L32:
                return r1
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r5.<init>(r0)
                throw r5
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto Ld
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                java.lang.Object r0 = r0.keyAt(r1)
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto Ld
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                java.lang.Object r0 = r0.valueAt(r1)
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.mIndex
                int r1 = r2.mEnd
                if (r0 >= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                boolean r0 = r3.mEntryValid
                if (r0 == 0) goto L26
                androidx.collection.ArrayMap r0 = r3.this$0
                int r1 = r3.mIndex
                java.lang.Object r0 = r0.keyAt(r1)
                androidx.collection.ArrayMap r1 = r3.this$0
                int r2 = r3.mIndex
                java.lang.Object r1 = r1.valueAt(r2)
                r2 = 0
                if (r0 != 0) goto L19
                r0 = 0
                goto L1d
            L19:
                int r0 = r0.hashCode()
            L1d:
                if (r1 != 0) goto L20
                goto L24
            L20:
                int r2 = r1.hashCode()
            L24:
                r0 = r0 ^ r2
                return r0
            L26:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                int r0 = r2.mIndex
                r1 = 1
                int r0 = r0 + r1
                r2.mIndex = r0
                r2.mEntryValid = r1
                return r2
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto L1b
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                r0.removeAt(r1)
                int r0 = r2.mIndex
                int r0 = r0 + (-1)
                r2.mIndex = r0
                int r0 = r2.mEnd
                int r0 = r0 + (-1)
                r2.mEnd = r0
                r0 = 0
                r2.mEntryValid = r0
                return
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto Ld
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                java.lang.Object r3 = r0.setValueAt(r1, r3)
                return r3
            Ld:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r3.<init>(r0)
                throw r3
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ValueCollection implements java.util.Collection<V> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        ValueCollection(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public boolean add(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public boolean addAll(@androidx.annotation.NonNull java.util.Collection<? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r2 = r0.__restricted$indexOfValue(r2)
                if (r2 < 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        @androidx.annotation.NonNull
        public java.util.Iterator<V> iterator() {
                r2 = this;
                androidx.collection.ArrayMap$ValueIterator r0 = new androidx.collection.ArrayMap$ValueIterator
                androidx.collection.ArrayMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r2 = r0.__restricted$indexOfValue(r2)
                if (r2 < 0) goto Lf
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.removeAt(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public boolean removeAll(@androidx.annotation.NonNull java.util.Collection<?> r6) {
                r5 = this;
                androidx.collection.ArrayMap r0 = r5.this$0
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r1 >= r0) goto L23
                androidx.collection.ArrayMap r3 = r5.this$0
                java.lang.Object r3 = r3.valueAt(r1)
                boolean r3 = r6.contains(r3)
                r4 = 1
                if (r3 == 0) goto L21
                androidx.collection.ArrayMap r2 = r5.this$0
                r2.removeAt(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = 1
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public boolean retainAll(@androidx.annotation.NonNull java.util.Collection<?> r6) {
                r5 = this;
                androidx.collection.ArrayMap r0 = r5.this$0
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r1 >= r0) goto L23
                androidx.collection.ArrayMap r3 = r5.this$0
                java.lang.Object r3 = r3.valueAt(r1)
                boolean r3 = r6.contains(r3)
                r4 = 1
                if (r3 != 0) goto L21
                androidx.collection.ArrayMap r2 = r5.this$0
                r2.removeAt(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = 1
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public int size() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Collection
        @androidx.annotation.NonNull
        public java.lang.Object[] toArray() {
                r4 = this;
                androidx.collection.ArrayMap r0 = r4.this$0
                int r0 = r0.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
            L9:
                if (r2 >= r0) goto L16
                androidx.collection.ArrayMap r3 = r4.this$0
                java.lang.Object r3 = r3.valueAt(r2)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L9
            L16:
                return r1
        }

        @Override // java.util.Collection
        @androidx.annotation.NonNull
        public <T> T[] toArray(@androidx.annotation.NonNull T[] r4) {
                r3 = this;
                int r0 = r3.size()
                int r1 = r4.length
                if (r1 >= r0) goto L15
                java.lang.Class r4 = r4.getClass()
                java.lang.Class r4 = r4.getComponentType()
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
                java.lang.Object[] r4 = (java.lang.Object[]) r4
            L15:
                r1 = 0
            L16:
                if (r1 >= r0) goto L23
                androidx.collection.ArrayMap r2 = r3.this$0
                java.lang.Object r2 = r2.valueAt(r1)
                r4[r1] = r2
                int r1 = r1 + 1
                goto L16
            L23:
                int r1 = r4.length
                if (r1 <= r0) goto L29
                r1 = 0
                r4[r0] = r1
            L29:
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ValueIterator extends androidx.collection.IndexBasedArrayIterator<V> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        ValueIterator(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                int r1 = r1.size()
                r0.<init>(r1)
                return
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected V elementAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                java.lang.Object r2 = r0.valueAt(r2)
                return r2
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.removeAt(r2)
                return
        }
    }

    public ArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public ArrayMap(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ArrayMap(@androidx.annotation.Nullable androidx.collection.SimpleArrayMap r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static <T> boolean equalsSetHelper(java.util.Set<T> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1c
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1c
            return r0
        L1c:
            return r2
    }

    public boolean containsAll(@androidx.annotation.NonNull java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsKey(r1)
            return r1
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsValue(r1)
            return r1
    }

    @Override // java.util.Map
    @androidx.annotation.NonNull
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            androidx.collection.ArrayMap<K, V>$EntrySet r0 = r1.mEntrySet
            if (r0 != 0) goto Lb
            androidx.collection.ArrayMap$EntrySet r0 = new androidx.collection.ArrayMap$EntrySet
            r0.<init>(r1)
            r1.mEntrySet = r0
        Lb:
            return r0
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            return r1
    }

    @Override // java.util.Map
    @androidx.annotation.NonNull
    public java.util.Set<K> keySet() {
            r1 = this;
            androidx.collection.ArrayMap<K, V>$KeySet r0 = r1.mKeySet
            if (r0 != 0) goto Lb
            androidx.collection.ArrayMap$KeySet r0 = new androidx.collection.ArrayMap$KeySet
            r0.<init>(r1)
            r1.mKeySet = r0
        Lb:
            return r0
    }

    @Override // java.util.Map
    public void putAll(@androidx.annotation.NonNull java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r2.size()
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L14
        L2c:
            return
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    public boolean removeAll(@androidx.annotation.NonNull java.util.Collection<?> r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L8
        L16:
            int r3 = r2.size()
            if (r0 == r3) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public boolean retainAll(@androidx.annotation.NonNull java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.size()
            int r1 = r4.size()
            r2 = 1
            int r1 = r1 - r2
        La:
            if (r1 < 0) goto L1c
            java.lang.Object r3 = r4.keyAt(r1)
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L19
            r4.removeAt(r1)
        L19:
            int r1 = r1 + (-1)
            goto La
        L1c:
            int r5 = r4.size()
            if (r0 == r5) goto L23
            return r2
        L23:
            r5 = 0
            return r5
    }

    @Override // java.util.Map
    @androidx.annotation.NonNull
    public java.util.Collection<V> values() {
            r1 = this;
            androidx.collection.ArrayMap<K, V>$ValueCollection r0 = r1.mValues
            if (r0 != 0) goto Lb
            androidx.collection.ArrayMap$ValueCollection r0 = new androidx.collection.ArrayMap$ValueCollection
            r0.<init>(r1)
            r1.mValues = r0
        Lb:
            return r0
    }
}
