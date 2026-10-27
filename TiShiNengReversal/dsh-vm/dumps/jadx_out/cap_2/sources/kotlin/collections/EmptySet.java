package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class EmptySet implements java.util.Set, java.io.Serializable, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.EmptySet INSTANCE = null;
    private static final long serialVersionUID = 3406603774387020532L;

    static {
            kotlin.collections.EmptySet r0 = new kotlin.collections.EmptySet
            r0.<init>()
            kotlin.collections.EmptySet.INSTANCE = r0
            return
    }

    private EmptySet() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.INSTANCE
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    public boolean add(java.lang.Void r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
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
            boolean r0 = r2 instanceof java.lang.Void
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Void r2 = (java.lang.Void) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public boolean contains(@org.jetbrains.annotations.NotNull java.lang.Void r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = r2.isEmpty()
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Le
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public int getSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator iterator() {
            r1 = this;
            kotlin.collections.t0 r0 = kotlin.collections.t0.a
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
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
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

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[]"
            return r0
    }
}
