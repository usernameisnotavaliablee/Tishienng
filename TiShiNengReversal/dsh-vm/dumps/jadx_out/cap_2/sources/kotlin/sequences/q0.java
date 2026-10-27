package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q0<T> implements kotlin.sequences.m<T>, kotlin.sequences.e<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;
    private final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<T>, l3.a {
        private int a;
        private final java.util.Iterator<T> b;

        a(kotlin.sequences.q0<T> r2) {
                r1 = this;
                r1.<init>()
                int r0 = kotlin.sequences.q0.c(r2)
                r1.a = r0
                kotlin.sequences.m r2 = kotlin.sequences.q0.d(r2)
                java.util.Iterator r2 = r2.iterator()
                r1.b = r2
                return
        }

        public final java.util.Iterator<T> a() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.b
                return r0
        }

        public final int c() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public final void e(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.a
                if (r0 <= 0) goto Le
                java.util.Iterator<T> r0 = r1.b
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                int r0 = r1.a
                if (r0 == 0) goto Lf
                int r0 = r0 + (-1)
                r1.a = r0
                java.util.Iterator<T> r0 = r1.b
                java.lang.Object r0 = r0.next()
                return r0
            Lf:
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

    public q0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, int r3) {
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

    public static final /* synthetic */ int c(kotlin.sequences.q0 r0) {
            int r0 = r0.b
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.m d(kotlin.sequences.q0 r0) {
            kotlin.sequences.m<T> r0 = r0.a
            return r0
    }

    @Override // kotlin.sequences.e
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<T> a(int r4) {
            r3 = this;
            int r0 = r3.b
            if (r4 < r0) goto L9
            kotlin.sequences.m r4 = kotlin.sequences.x.l()
            return r4
        L9:
            kotlin.sequences.p0 r1 = new kotlin.sequences.p0
            kotlin.sequences.m<T> r2 = r3.a
            r1.<init>(r2, r4, r0)
            return r1
    }

    @Override // kotlin.sequences.e
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<T> b(int r3) {
            r2 = this;
            int r0 = r2.b
            if (r3 < r0) goto L5
            return r2
        L5:
            kotlin.sequences.q0 r0 = new kotlin.sequences.q0
            kotlin.sequences.m<T> r1 = r2.a
            r0.<init>(r1, r3)
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.q0$a r0 = new kotlin.sequences.q0$a
            r0.<init>(r1)
            return r0
    }
}
