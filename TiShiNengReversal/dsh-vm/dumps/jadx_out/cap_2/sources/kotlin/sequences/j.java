package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class j<T> implements kotlin.sequences.m<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<T> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<T>, l3.a {
        private T a;
        private int b;
        final /* synthetic */ kotlin.sequences.j<T> c;

        a(kotlin.sequences.j<T> r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r1 = -2
                r0.b = r1
                return
        }

        private final void a() {
                r2 = this;
                int r0 = r2.b
                r1 = -2
                if (r0 != r1) goto L10
                kotlin.sequences.j<T> r0 = r2.c
                kotlin.jvm.functions.Function0 r0 = kotlin.sequences.j.c(r0)
                java.lang.Object r0 = r0.invoke()
                goto L1f
            L10:
                kotlin.sequences.j<T> r0 = r2.c
                kotlin.jvm.functions.Function1 r0 = kotlin.sequences.j.d(r0)
                T r1 = r2.a
                kotlin.jvm.internal.g0.m(r1)
                java.lang.Object r0 = r0.invoke(r1)
            L1f:
                r2.a = r0
                if (r0 != 0) goto L25
                r0 = 0
                goto L26
            L25:
                r0 = 1
            L26:
                r2.b = r0
                return
        }

        public final T c() {
                r1 = this;
                T r0 = r1.a
                return r0
        }

        public final int e() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final void f(T r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public final void g(int r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                if (r0 >= 0) goto L7
                r2.a()
            L7:
                int r0 = r2.b
                r1 = 1
                if (r0 != r1) goto Ld
                return r1
            Ld:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                int r0 = r2.b
                if (r0 >= 0) goto L7
                r2.a()
            L7:
                int r0 = r2.b
                if (r0 == 0) goto L16
                T r0 = r2.a
                java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"
                kotlin.jvm.internal.g0.n(r0, r1)
                r1 = -1
                r2.b = r1
                return r0
            L16:
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

    public j(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "getInitialValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "getNextValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 c(kotlin.sequences.j r0) {
            kotlin.jvm.functions.Function0<T> r0 = r0.a
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 d(kotlin.sequences.j r0) {
            kotlin.jvm.functions.Function1<T, T> r0 = r0.b
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.j$a r0 = new kotlin.sequences.j$a
            r0.<init>(r1)
            return r0
    }
}
