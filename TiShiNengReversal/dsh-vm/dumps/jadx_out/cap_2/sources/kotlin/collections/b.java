package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1761#2,3:51\n1740#2,3:54\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:51,3\n22#1:54,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b<E> implements java.util.Collection<E>, l3.a {
    protected b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.CharSequence a(kotlin.collections.b r0, java.lang.Object r1) {
            java.lang.CharSequence r0 = d(r0, r1)
            return r0
    }

    private static final java.lang.CharSequence d(kotlin.collections.b r0, java.lang.Object r1) {
            if (r1 != r0) goto L5
            java.lang.String r0 = "(this Collection)"
            return r0
        L5:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
    }

    @Override // java.util.Collection
    public boolean add(E r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r2) {
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
    public boolean contains(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r0 = r3.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r0.next()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto Lc
            r4 = 1
            return r4
        L1e:
            return r1
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

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Iterator<E> iterator();

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
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Collection
    @org.jetbrains.annotations.NotNull
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = kotlin.jvm.internal.u.a(r1)
            return r0
    }

    @Override // java.util.Collection
    @org.jetbrains.annotations.NotNull
    public <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r2 = kotlin.jvm.internal.u.b(r1, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r9 = this;
            kotlin.collections.a r6 = new kotlin.collections.a
            r6.<init>(r9)
            r7 = 24
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r0 = r9
            java.lang.String r1 = kotlin.collections.r0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }
}
