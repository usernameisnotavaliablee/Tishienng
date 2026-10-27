package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,527:1\n1740#2,3:528\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n65#1:528,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class l<T> implements java.util.Collection<T>, l3.a {

    @org.jetbrains.annotations.NotNull
    private final T[] a;
    private final boolean b;

    public l(@org.jetbrains.annotations.NotNull T[] r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public int a() {
            r1 = this;
            T[] r0 = r1.a
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public boolean add(T r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> r2) {
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
            T[] r0 = r1.a
            boolean r2 = kotlin.collections.a0.B8(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L28:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final T[] d() {
            r1 = this;
            T[] r0 = r1.a
            return r0
    }

    public final boolean e() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            T[] r0 = r1.a
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            T[] r0 = r1.a
            java.util.Iterator r0 = kotlin.jvm.internal.h.a(r0)
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
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.a()
            return r0
    }

    @Override // java.util.Collection
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] toArray() {
            r2 = this;
            T[] r0 = r2.a
            boolean r1 = r2.b
            java.lang.Object[] r0 = kotlin.collections.g0.i(r0, r1)
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
