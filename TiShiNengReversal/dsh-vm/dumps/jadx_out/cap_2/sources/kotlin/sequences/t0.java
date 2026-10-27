package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t0<T, R> implements kotlin.sequences.m<R> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, R> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<R>, l3.a {
        private final java.util.Iterator<T> a;
        final /* synthetic */ kotlin.sequences.t0<T, R> b;

        a(kotlin.sequences.t0<T, R> r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                kotlin.sequences.m r1 = kotlin.sequences.t0.c(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.a = r1
                return
        }

        public final java.util.Iterator<T> a() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public R next() {
                r2 = this;
                kotlin.sequences.t0<T, R> r0 = r2.b
                kotlin.jvm.functions.Function1 r0 = kotlin.sequences.t0.d(r0)
                java.util.Iterator<T> r1 = r2.a
                java.lang.Object r1 = r1.next()
                java.lang.Object r0 = r0.invoke(r1)
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

    public t0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transformer"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public static final /* synthetic */ kotlin.sequences.m c(kotlin.sequences.t0 r0) {
            kotlin.sequences.m<T> r0 = r0.a
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 d(kotlin.sequences.t0 r0) {
            kotlin.jvm.functions.Function1<T, R> r0 = r0.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <E> kotlin.sequences.m<E> e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super R, ? extends java.util.Iterator<? extends E>> r4) {
            r3 = this;
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.sequences.i r0 = new kotlin.sequences.i
            kotlin.sequences.m<T> r1 = r3.a
            kotlin.jvm.functions.Function1<T, R> r2 = r3.b
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<R> iterator() {
            r1 = this;
            kotlin.sequences.t0$a r0 = new kotlin.sequences.t0$a
            r0.<init>(r1)
            return r0
    }
}
