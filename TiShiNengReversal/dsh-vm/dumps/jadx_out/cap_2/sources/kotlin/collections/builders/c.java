package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c<K, V> extends kotlin.collections.builders.a<java.util.Map.Entry<K, V>, K, V> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.collections.builders.MapBuilder<K, V> a;

    public c(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.collections.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = r0.f(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.util.Map.Entry<K, V>> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            boolean r2 = r0.containsAllEntries$kotlin_stdlib(r2)
            return r2
    }

    @Override // kotlin.collections.builders.a
    public boolean d(@org.jetbrains.annotations.NotNull java.util.Map.Entry<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            boolean r2 = r0.containsEntry$kotlin_stdlib(r2)
            return r2
    }

    @Override // kotlin.collections.builders.a
    public boolean e(@org.jetbrains.annotations.NotNull java.util.Map.Entry<K, V> r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            boolean r2 = r0.removeEntry$kotlin_stdlib(r2)
            return r2
    }

    public boolean f(@org.jetbrains.annotations.NotNull java.util.Map.Entry<K, V> r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder<K, V> g() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            return r0
    }

    @Override // kotlin.collections.j
    public int getSize() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            kotlin.collections.builders.MapBuilder$b r0 = r0.entriesIterator$kotlin_stdlib()
            return r0
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.retainAll(r2)
            return r2
    }
}
