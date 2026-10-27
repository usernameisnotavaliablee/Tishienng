package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d<T> implements kotlin.sequences.m<T>, kotlin.sequences.e<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;
    private final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<T>, l3.a {
        private final java.util.Iterator<T> a;
        private int b;

        a(kotlin.sequences.d<T> r2) {
                r1 = this;
                r1.<init>()
                kotlin.sequences.m r0 = kotlin.sequences.d.d(r2)
                java.util.Iterator r0 = r0.iterator()
                r1.a = r0
                int r2 = kotlin.sequences.d.c(r2)
                r1.b = r2
                return
        }

        private final void a() {
                r1 = this;
            L0:
                int r0 = r1.b
                if (r0 <= 0) goto L18
                java.util.Iterator<T> r0 = r1.a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L18
                java.util.Iterator<T> r0 = r1.a
                r0.next()
                int r0 = r1.b
                int r0 = r0 + (-1)
                r1.b = r0
                goto L0
            L18:
                return
        }

        public final java.util.Iterator<T> c() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                return r0
        }

        public final int e() {
                r1 = this;
                int r0 = r1.b
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
                r1.a()
                java.util.Iterator<T> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                r1.a()
                java.util.Iterator<T> r0 = r1.a
                java.lang.Object r0 = r0.next()
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

    public d(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            if (r3 < 0) goto Lf
            return
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "count must be non-negative, but was "
            r2.append(r0)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final /* synthetic */ int c(kotlin.sequences.d r0) {
            int r0 = r0.b
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.m d(kotlin.sequences.d r0) {
            kotlin.sequences.m<T> r0 = r0.a
            return r0
    }

    @Override // kotlin.sequences.e
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<T> a(int r3) {
            r2 = this;
            int r0 = r2.b
            int r0 = r0 + r3
            if (r0 >= 0) goto Lb
            kotlin.sequences.d r0 = new kotlin.sequences.d
            r0.<init>(r2, r3)
            return r0
        Lb:
            kotlin.sequences.d r3 = new kotlin.sequences.d
            kotlin.sequences.m<T> r1 = r2.a
            r3.<init>(r1, r0)
            return r3
    }

    @Override // kotlin.sequences.e
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<T> b(int r4) {
            r3 = this;
            int r0 = r3.b
            int r1 = r0 + r4
            if (r1 >= 0) goto Lc
            kotlin.sequences.q0 r0 = new kotlin.sequences.q0
            r0.<init>(r3, r4)
            return r0
        Lc:
            kotlin.sequences.p0 r4 = new kotlin.sequences.p0
            kotlin.sequences.m<T> r2 = r3.a
            r4.<init>(r2, r0, r1)
            return r4
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.d$a r0 = new kotlin.sequences.d$a
            r0.<init>(r1)
            return r0
    }
}
