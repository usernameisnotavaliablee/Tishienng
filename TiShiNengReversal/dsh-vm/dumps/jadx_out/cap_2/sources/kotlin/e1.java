package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.ExperimentalUnsignedTypes
@kotlin.jvm.JvmInline
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n58#1:83,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e1 implements java.util.Collection<kotlin.d1>, l3.a {

    @org.jetbrains.annotations.NotNull
    private final long[] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements java.util.Iterator<kotlin.d1>, l3.a {

        @org.jetbrains.annotations.NotNull
        private final long[] a;
        private int b;

        public a(@org.jetbrains.annotations.NotNull long[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public long a() {
                r3 = this;
                int r0 = r3.b
                long[] r1 = r3.a
                int r2 = r1.length
                if (r0 >= r2) goto L12
                int r2 = r0 + 1
                r3.b = r2
                r0 = r1[r0]
                long r0 = kotlin.d1.k(r0)
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                int r1 = r3.b
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                long[] r1 = r2.a
                int r1 = r1.length
                if (r0 >= r1) goto L9
                r0 = 1
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ kotlin.d1 next() {
                r2 = this;
                long r0 = r2.a()
                kotlin.d1 r0 = kotlin.d1.b(r0)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    @kotlin.PublishedApi
    private /* synthetic */ e1(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final /* synthetic */ kotlin.e1 d(long[] r1) {
            kotlin.e1 r0 = new kotlin.e1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static long[] e(int r0) {
            long[] r0 = new long[r0]
            long[] r0 = f(r0)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static long[] f(@org.jetbrains.annotations.NotNull long[] r1) {
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    public static boolean j(long[] r0, long r1) {
            boolean r0 = kotlin.collections.n.A8(r0, r1)
            return r0
    }

    public static boolean m(long[] r4, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.d1> r5) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof kotlin.d1
            if (r2 == 0) goto L31
            kotlin.d1 r0 = (kotlin.d1) r0
            long r2 = r0.q0()
            boolean r0 = kotlin.collections.n.A8(r4, r2)
            if (r0 == 0) goto L31
            goto L16
        L31:
            r4 = 0
            return r4
        L33:
            return r1
    }

    public static boolean n(long[] r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.e1
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.e1 r3 = (kotlin.e1) r3
            long[] r3 = r3.z()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    public static final boolean o(long[] r0, long[] r1) {
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    public static final long p(long[] r2, int r3) {
            r0 = r2[r3]
            long r2 = kotlin.d1.k(r0)
            return r2
    }

    public static int r(long[] r0) {
            int r0 = r0.length
            return r0
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void t() {
            return
    }

    public static int u(long[] r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public static boolean v(long[] r0) {
            int r0 = r0.length
            if (r0 != 0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.Iterator<kotlin.d1> w(long[] r1) {
            kotlin.e1$a r0 = new kotlin.e1$a
            r0.<init>(r1)
            return r0
    }

    public static final void x(long[] r0, int r1, long r2) {
            r0[r1] = r2
            return
    }

    public static java.lang.String y(long[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ULongArray(storage="
            r0.append(r1)
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean a(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(kotlin.d1 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends kotlin.d1> r2) {
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
    public final /* bridge */ boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.d1
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            kotlin.d1 r3 = (kotlin.d1) r3
            long r0 = r3.q0()
            boolean r3 = r2.g(r0)
            return r3
    }

    @Override // java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            long[] r0 = r1.a
            boolean r2 = m(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            long[] r0 = r1.a
            boolean r2 = n(r0, r2)
            return r2
    }

    public boolean g(long r2) {
            r1 = this;
            long[] r0 = r1.a
            boolean r2 = j(r0, r2)
            return r2
    }

    @Override // java.util.Collection
    public int hashCode() {
            r1 = this;
            long[] r0 = r1.a
            int r0 = u(r0)
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            long[] r0 = r1.a
            boolean r0 = v(r0)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.d1> iterator() {
            r1 = this;
            long[] r0 = r1.a
            java.util.Iterator r0 = w(r0)
            return r0
    }

    public int q() {
            r1 = this;
            long[] r0 = r1.a
            int r0 = r(r0)
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
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = r1.q()
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

    public java.lang.String toString() {
            r1 = this;
            long[] r0 = r1.a
            java.lang.String r0 = y(r0)
            return r0
    }

    public final /* synthetic */ long[] z() {
            r1 = this;
            long[] r0 = r1.a
            return r0
    }
}
