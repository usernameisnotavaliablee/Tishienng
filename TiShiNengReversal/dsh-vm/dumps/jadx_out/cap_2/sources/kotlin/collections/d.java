package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n360#2,7:182\n388#2,7:189\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:182,7\n29#1:189,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d<E> extends kotlin.collections.b<E> implements java.util.List<E>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.d.a Companion = null;
    private static final int maxArraySize = 2147483639;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void a(int r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "startIndex: "
                if (r4 < 0) goto L26
                if (r5 > r6) goto L26
                if (r4 > r5) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r4 = " > endIndex: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r6.<init>(r4)
                throw r6
            L26:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r4)
                java.lang.String r4 = ", endIndex: "
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", size: "
                r2.append(r4)
                r2.append(r6)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4)
                throw r1
        }

        public final void b(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 >= r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", size: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public final void c(int r4, int r5) {
                r3 = this;
                if (r4 < 0) goto L5
                if (r4 > r5) goto L5
                return
            L5:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "index: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", size: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public final void d(int r4, int r5, int r6) {
                r3 = this;
                java.lang.String r0 = "fromIndex: "
                if (r4 < 0) goto L26
                if (r5 > r6) goto L26
                if (r4 > r5) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r4)
                java.lang.String r4 = " > toIndex: "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r6.<init>(r4)
                throw r6
            L26:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r4)
                java.lang.String r4 = ", toIndex: "
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", size: "
                r2.append(r4)
                r2.append(r6)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4)
                throw r1
        }

        public final int e(int r3, int r4) {
                r2 = this;
                int r0 = r3 >> 1
                int r3 = r3 + r0
                int r0 = r3 - r4
                if (r0 >= 0) goto L8
                r3 = r4
            L8:
                r0 = 2147483639(0x7ffffff7, float:NaN)
                int r1 = r3 - r0
                if (r1 <= 0) goto L16
                if (r4 <= r0) goto L15
                r3 = 2147483647(0x7fffffff, float:NaN)
                return r3
            L15:
                return r0
            L16:
                return r3
        }

        public final boolean f(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4, @org.jetbrains.annotations.NotNull java.util.Collection<?> r5) {
                r3 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "other"
                kotlin.jvm.internal.g0.p(r5, r0)
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r0 == r1) goto L16
                return r2
            L16:
                java.util.Iterator r5 = r5.iterator()
                java.util.Iterator r4 = r4.iterator()
            L1e:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L33
                java.lang.Object r0 = r4.next()
                java.lang.Object r1 = r5.next()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 != 0) goto L1e
                return r2
            L33:
                r4 = 1
                return r4
        }

        public final int g(@org.jetbrains.annotations.NotNull java.util.Collection<?> r3) {
                r2 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Iterator r3 = r3.iterator()
                r0 = 1
            La:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r3.next()
                int r0 = r0 * 31
                if (r1 == 0) goto L1d
                int r1 = r1.hashCode()
                goto L1e
            L1d:
                r1 = 0
            L1e:
                int r0 = r0 + r1
                goto La
            L20:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements java.util.Iterator<E>, l3.a {
        private int a;
        final /* synthetic */ kotlin.collections.d<E> b;

        public b(kotlin.collections.d r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        protected final int a() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        protected final void c(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.a
                kotlin.collections.d<E> r1 = r2.b
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L13
                kotlin.collections.d<E> r0 = r3.b
                int r1 = r3.a
                int r2 = r1 + 1
                r3.a = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
            L13:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends kotlin.collections.d<E>.b implements java.util.ListIterator<E>, l3.a {
        final /* synthetic */ kotlin.collections.d<E> c;

        public c(kotlin.collections.d r2, int r3) {
                r1 = this;
                r1.c = r2
                r1.<init>(r2)
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r2 = r2.size()
                r0.c(r3, r2)
                r1.c(r3)
                return
        }

        @Override // java.util.ListIterator
        public void add(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.a()
                if (r0 <= 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.a()
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                boolean r0 = r2.hasPrevious()
                if (r0 == 0) goto L1a
                kotlin.collections.d<E> r0 = r2.c
                int r1 = r2.a()
                int r1 = r1 + (-1)
                r2.c(r1)
                int r1 = r2.a()
                java.lang.Object r0 = r0.get(r1)
                return r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.a()
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator
        public void set(E r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    private static final class C0012d<E> extends kotlin.collections.d<E> implements java.util.RandomAccess {

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.d<E> a;
        private final int b;
        private int c;

        public C0012d(@org.jetbrains.annotations.NotNull kotlin.collections.d<? extends E> r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r2 = r2.size()
                r0.d(r3, r4, r2)
                int r4 = r4 - r3
                r1.c = r4
                return
        }

        @Override // kotlin.collections.d, java.util.List
        public E get(int r3) {
                r2 = this;
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r2.c
                r0.b(r3, r1)
                kotlin.collections.d<E> r0 = r2.a
                int r1 = r2.b
                int r1 = r1 + r3
                java.lang.Object r3 = r0.get(r1)
                return r3
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        @Override // kotlin.collections.d, java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.List<E> subList(int r4, int r5) {
                r3 = this;
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r3.c
                r0.d(r4, r5, r1)
                kotlin.collections.d$d r0 = new kotlin.collections.d$d
                kotlin.collections.d<E> r1 = r3.a
                int r2 = r3.b
                int r4 = r4 + r2
                int r2 = r2 + r5
                r0.<init>(r1, r4, r2)
                return r0
        }
    }

    static {
            kotlin.collections.d$a r0 = new kotlin.collections.d$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.d.Companion = r0
            return
    }

    protected d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.List
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r0.f(r1, r2)
            return r2
    }

    @Override // java.util.List
    public abstract E get(int r1);

    @Override // kotlin.collections.b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r1 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r0 = r0.g(r1)
            return r0
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r4 = -1
            return r4
    }

    @Override // kotlin.collections.b, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.collections.d$b r0 = new kotlin.collections.d$b
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            return r3
        L1d:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            kotlin.collections.d$c r0 = new kotlin.collections.d$c
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            kotlin.collections.d$c r0 = new kotlin.collections.d$c
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public E remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            kotlin.collections.d$d r0 = new kotlin.collections.d$d
            r0.<init>(r1, r2, r3)
            return r0
    }
}
