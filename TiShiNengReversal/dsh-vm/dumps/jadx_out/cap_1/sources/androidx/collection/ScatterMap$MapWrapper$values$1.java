package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n1726#2,3:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n*L\n749#1:1851,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ScatterMap$MapWrapper$values$1<V> implements java.util.Collection<V>, l3.a {
    final /* synthetic */ androidx.collection.ScatterMap<K, V> this$0;

    ScatterMap$MapWrapper$values$1(androidx.collection.ScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Collection
    public boolean add(V r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            androidx.collection.ScatterMap<K, V> r0 = r1.this$0
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            androidx.collection.ScatterMap<K, V> r0 = r3.this$0
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r4.next()
            boolean r1 = r0.containsValue(r1)
            if (r1 != 0) goto L18
            r4 = 0
            return r4
        L2a:
            return r2
    }

    public int getSize() {
            r1 = this;
            androidx.collection.ScatterMap<K, V> r0 = r1.this$0
            int r0 = r0._size
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.ScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<V> iterator() {
            r3 = this;
            androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1 r0 = new androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1
            androidx.collection.ScatterMap<K, V> r1 = r3.this$0
            r2 = 0
            r0.<init>(r1, r2)
            java.util.Iterator r0 = kotlin.sequences.p.a(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean removeIf(java.util.function.Predicate<? super V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = kotlin.jvm.internal.u.a(r1)
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r2 = kotlin.jvm.internal.u.b(r1, r2)
            return r2
    }
}
