package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i<T, R, E> implements kotlin.sequences.m<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, R> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<R, java.util.Iterator<E>> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.sequences.i.a a = null;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;

        static {
                kotlin.sequences.i$a r0 = new kotlin.sequences.i$a
                r0.<init>()
                kotlin.sequences.i.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements java.util.Iterator<E>, l3.a {
        private final java.util.Iterator<T> a;
        private java.util.Iterator<? extends E> b;
        private int c;
        final /* synthetic */ kotlin.sequences.i<T, R, E> d;

        b(kotlin.sequences.i<T, R, E> r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                kotlin.sequences.m r1 = kotlin.sequences.i.d(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.a = r1
                return
        }

        private final boolean a() {
                r4 = this;
                java.util.Iterator<? extends E> r0 = r4.b
                r1 = 1
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Le
                r4.c = r1
                return r1
            Le:
                java.util.Iterator<T> r0 = r4.a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L3d
                java.util.Iterator<T> r0 = r4.a
                java.lang.Object r0 = r0.next()
                kotlin.sequences.i<T, R, E> r2 = r4.d
                kotlin.jvm.functions.Function1 r2 = kotlin.sequences.i.c(r2)
                kotlin.sequences.i<T, R, E> r3 = r4.d
                kotlin.jvm.functions.Function1 r3 = kotlin.sequences.i.e(r3)
                java.lang.Object r0 = r3.invoke(r0)
                java.lang.Object r0 = r2.invoke(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto Le
                r4.b = r0
                r4.c = r1
                return r1
            L3d:
                r0 = 2
                r4.c = r0
                r0 = 0
                r4.b = r0
                r0 = 0
                return r0
        }

        public final java.util.Iterator<E> c() {
                r1 = this;
                java.util.Iterator<? extends E> r0 = r1.b
                return r0
        }

        public final java.util.Iterator<T> e() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                return r0
        }

        public final int f() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        public final void g(java.util.Iterator<? extends E> r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public final void h(int r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.c
                r1 = 1
                if (r0 != r1) goto L6
                return r1
            L6:
                r1 = 2
                if (r0 != r1) goto Lb
                r0 = 0
                return r0
            Lb:
                boolean r0 = r2.a()
                return r0
        }

        @Override // java.util.Iterator
        public E next() {
                r2 = this;
                int r0 = r2.c
                r1 = 2
                if (r0 == r1) goto L21
                if (r0 != 0) goto L14
                boolean r0 = r2.a()
                if (r0 == 0) goto Le
                goto L14
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
            L14:
                r0 = 0
                r2.c = r0
                java.util.Iterator<? extends E> r0 = r2.b
                kotlin.jvm.internal.g0.m(r0)
                java.lang.Object r0 = r0.next()
                return r0
            L21:
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

    public i(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super R, ? extends java.util.Iterator<? extends E>> r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transformer"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 c(kotlin.sequences.i r0) {
            kotlin.jvm.functions.Function1<R, java.util.Iterator<E>> r0 = r0.c
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.m d(kotlin.sequences.i r0) {
            kotlin.sequences.m<T> r0 = r0.a
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 e(kotlin.sequences.i r0) {
            kotlin.jvm.functions.Function1<T, R> r0 = r0.b
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.sequences.i$b r0 = new kotlin.sequences.i$b
            r0.<init>(r1)
            return r0
    }
}
