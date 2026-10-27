package z3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class c implements java.util.Collection<z3.b>, l3.a {

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<z3.b> a;

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public boolean a(@org.jetbrains.annotations.NotNull z3.b r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set<z3.b> r0 = r1.a
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(z3.b r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends z3.b> r2) {
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
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof z3.b
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            z3.b r2 = (z3.b) r2
            boolean r2 = r1.a(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set<z3.b> r0 = r1.a
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<z3.b> d() {
            r1 = this;
            java.util.Set<z3.b> r0 = r1.a
            return r0
    }

    public int e() {
            r1 = this;
            java.util.Set<z3.b> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Collection
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof z3.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set<z3.b> r1 = r3.a
            z3.c r4 = (z3.c) r4
            java.util.Set<z3.b> r4 = r4.a
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            java.util.Set<z3.b> r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.Set<z3.b> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<z3.b> iterator() {
            r1 = this;
            java.util.Set<z3.b> r0 = r1.a
            java.util.Iterator r0 = r0.iterator()
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
    public boolean removeIf(java.util.function.Predicate<? super z3.b> r2) {
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
            int r0 = r1.e()
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

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = z3.a.a(r1)
            return r0
    }
}
