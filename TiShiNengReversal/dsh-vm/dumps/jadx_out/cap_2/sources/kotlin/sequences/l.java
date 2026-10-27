package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l<T1, T2, V> implements kotlin.sequences.m<V> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T1> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T2> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<T1, T2, V> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<V>, l3.a {
        private final java.util.Iterator<T1> a;
        private final java.util.Iterator<T2> b;
        final /* synthetic */ kotlin.sequences.l<T1, T2, V> c;

        a(kotlin.sequences.l<T1, T2, V> r2) {
                r1 = this;
                r1.c = r2
                r1.<init>()
                kotlin.sequences.m r0 = kotlin.sequences.l.c(r2)
                java.util.Iterator r0 = r0.iterator()
                r1.a = r0
                kotlin.sequences.m r2 = kotlin.sequences.l.d(r2)
                java.util.Iterator r2 = r2.iterator()
                r1.b = r2
                return
        }

        public final java.util.Iterator<T1> a() {
                r1 = this;
                java.util.Iterator<T1> r0 = r1.a
                return r0
        }

        public final java.util.Iterator<T2> c() {
                r1 = this;
                java.util.Iterator<T2> r0 = r1.b
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T1> r0 = r1.a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L12
                java.util.Iterator<T2> r0 = r1.b
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public V next() {
                r3 = this;
                kotlin.sequences.l<T1, T2, V> r0 = r3.c
                kotlin.jvm.functions.Function2 r0 = kotlin.sequences.l.e(r0)
                java.util.Iterator<T1> r1 = r3.a
                java.lang.Object r1 = r1.next()
                java.util.Iterator<T2> r2 = r3.b
                java.lang.Object r2 = r2.next()
                java.lang.Object r0 = r0.invoke(r1, r2)
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

    public l(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends V> r4) {
            r1 = this;
            java.lang.String r0 = "sequence1"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sequence2"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public static final /* synthetic */ kotlin.sequences.m c(kotlin.sequences.l r0) {
            kotlin.sequences.m<T1> r0 = r0.a
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.m d(kotlin.sequences.l r0) {
            kotlin.sequences.m<T2> r0 = r0.b
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 e(kotlin.sequences.l r0) {
            kotlin.jvm.functions.Function2<T1, T2, V> r0 = r0.c
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<V> iterator() {
            r1 = this;
            kotlin.sequences.l$a r0 = new kotlin.sequences.l$a
            r0.<init>(r1)
            return r0
    }
}
