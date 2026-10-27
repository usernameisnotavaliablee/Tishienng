package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k<T> implements kotlin.sequences.m<kotlin.collections.a1<? extends T>> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<kotlin.collections.a1<? extends T>>, l3.a {
        private final java.util.Iterator<T> a;
        private int b;

        a(kotlin.sequences.k<T> r1) {
                r0 = this;
                r0.<init>()
                kotlin.sequences.m r1 = kotlin.sequences.k.c(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.a = r1
                return
        }

        public final int a() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final java.util.Iterator<T> c() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                return r0
        }

        public kotlin.collections.a1<T> e() {
                r3 = this;
                kotlin.collections.a1 r0 = new kotlin.collections.a1
                int r1 = r3.b
                int r2 = r1 + 1
                r3.b = r2
                if (r1 >= 0) goto Ld
                kotlin.collections.f0.b0()
            Ld:
                java.util.Iterator<T> r2 = r3.a
                java.lang.Object r2 = r2.next()
                r0.<init>(r1, r2)
                return r0
        }

        public final void f(int r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                kotlin.collections.a1 r0 = r1.e()
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

    public k(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public static final /* synthetic */ kotlin.sequences.m c(kotlin.sequences.k r0) {
            kotlin.sequences.m<T> r0 = r0.a
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.collections.a1<T>> iterator() {
            r1 = this;
            kotlin.sequences.k$a r0 = new kotlin.sequences.k$a
            r0.<init>(r1)
            return r0
    }
}
