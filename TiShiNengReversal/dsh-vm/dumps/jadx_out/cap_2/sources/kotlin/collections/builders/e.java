package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e<V> extends kotlin.collections.g<V> implements java.util.Collection<V>, l3.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.collections.builders.MapBuilder<?, V> a;

    public e(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<?, V> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.collections.g
    public int a() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // kotlin.collections.g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder<?, V> d() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<V> iterator() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            kotlin.collections.builders.MapBuilder$f r0 = r0.valuesIterator$kotlin_stdlib()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            boolean r2 = r0.removeValue$kotlin_stdlib(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<?, V> r0 = r1.a
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.retainAll(r2)
            return r2
    }
}
