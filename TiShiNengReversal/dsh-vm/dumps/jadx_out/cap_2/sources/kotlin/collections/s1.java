package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class s1<T> extends kotlin.collections.d<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.ListIterator<T>, l3.a {
        private final java.util.ListIterator<T> a;
        final /* synthetic */ kotlin.collections.s1<T> b;

        a(kotlin.collections.s1<? extends T> r2, int r3) {
                r1 = this;
                r1.b = r2
                r1.<init>()
                java.util.List r0 = kotlin.collections.s1.e(r2)
                int r2 = kotlin.collections.n0.b1(r2, r3)
                java.util.ListIterator r2 = r0.listIterator(r2)
                r1.a = r2
                return
        }

        public final java.util.ListIterator<T> a() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.a
                return r0
        }

        @Override // java.util.ListIterator
        public void add(T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.a
                boolean r0 = r0.hasPrevious()
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.a
                java.lang.Object r0 = r0.previous()
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r2 = this;
                kotlin.collections.s1<T> r0 = r2.b
                java.util.ListIterator<T> r1 = r2.a
                int r1 = r1.previousIndex()
                int r0 = kotlin.collections.n0.a1(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator
        public T previous() {
                r1 = this;
                java.util.ListIterator<T> r0 = r1.a
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r2 = this;
                kotlin.collections.s1<T> r0 = r2.b
                java.util.ListIterator<T> r1 = r2.a
                int r1 = r1.nextIndex()
                int r0 = kotlin.collections.n0.a1(r0, r1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Operation is not supported for read-only collection"
                r2.<init>(r0)
                throw r2
        }
    }

    public s1(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public static final /* synthetic */ java.util.List e(kotlin.collections.s1 r0) {
            java.util.List<T> r0 = r0.a
            return r0
    }

    @Override // kotlin.collections.d, java.util.List
    public T get(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.a
            int r2 = kotlin.collections.n0.Z0(r1, r2)
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // kotlin.collections.d, kotlin.collections.b
    public int getSize() {
            r1 = this;
            java.util.List<T> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // kotlin.collections.d, kotlin.collections.b, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // kotlin.collections.d, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<T> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // kotlin.collections.d, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<T> listIterator(int r2) {
            r1 = this;
            kotlin.collections.s1$a r0 = new kotlin.collections.s1$a
            r0.<init>(r1, r2)
            return r0
    }
}
