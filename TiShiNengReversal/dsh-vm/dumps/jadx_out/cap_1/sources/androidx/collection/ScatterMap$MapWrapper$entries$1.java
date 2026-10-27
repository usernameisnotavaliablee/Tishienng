package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n1726#2,3:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n*L\n712#1:1851,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ScatterMap$MapWrapper$entries$1<K, V> implements java.util.Set<java.util.Map.Entry<? extends K, ? extends V>>, l3.a {
    final /* synthetic */ androidx.collection.ScatterMap<K, V> this$0;

    ScatterMap$MapWrapper$entries$1(androidx.collection.ScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    public boolean add(java.util.Map.Entry<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends V>> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public boolean contains(@org.jetbrains.annotations.NotNull java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.collection.ScatterMap<K, V> r0 = r2.this$0
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r3 = r3.getValue()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            androidx.collection.ScatterMap<K, V> r0 = r4.this$0
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r1 != 0) goto L18
            r5 = 0
            return r5
        L38:
            return r2
    }

    public int getSize() {
            r1 = this;
            androidx.collection.ScatterMap<K, V> r0 = r1.this$0
            int r0 = r0._size
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.ScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1 r0 = new androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1
            androidx.collection.ScatterMap<K, V> r1 = r3.this$0
            r2 = 0
            r0.<init>(r1, r2)
            java.util.Iterator r0 = kotlin.sequences.p.a(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = kotlin.jvm.internal.u.a(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r2 = kotlin.jvm.internal.u.b(r1, r2)
            return r2
    }
}
