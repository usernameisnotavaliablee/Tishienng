package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p0<T> implements kotlin.sequences.m<T>, kotlin.sequences.e<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;
    private final int b;
    private final int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<T>, l3.a {
        private final java.util.Iterator<T> a;
        private int b;
        final /* synthetic */ kotlin.sequences.p0<T> c;

        a(kotlin.sequences.p0<T> r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                kotlin.sequences.m r1 = kotlin.sequences.p0.d(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.a = r1
                return
        }

        private final void a() {
                r2 = this;
            L0:
                int r0 = r2.b
                kotlin.sequences.p0<T> r1 = r2.c
                int r1 = kotlin.sequences.p0.e(r1)
                if (r0 >= r1) goto L1e
                java.util.Iterator<T> r0 = r2.a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1e
                java.util.Iterator<T> r0 = r2.a
                r0.next()
                int r0 = r2.b
                int r0 = r0 + 1
                r2.b = r0
                goto L0
            L1e:
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
                r2 = this;
                r2.a()
                int r0 = r2.b
                kotlin.sequences.p0<T> r1 = r2.c
                int r1 = kotlin.sequences.p0.c(r1)
                if (r0 >= r1) goto L17
                java.util.Iterator<T> r0 = r2.a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L17
                r0 = 1
                return r0
            L17:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                r2.a()
                int r0 = r2.b
                kotlin.sequences.p0<T> r1 = r2.c
                int r1 = kotlin.sequences.p0.c(r1)
                if (r0 >= r1) goto L1a
                int r0 = r2.b
                int r0 = r0 + 1
                r2.b = r0
                java.util.Iterator<T> r0 = r2.a
                java.lang.Object r0 = r0.next()
                return r0
            L1a:
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

    public p0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            if (r3 < 0) goto L53
            if (r4 < 0) goto L38
            if (r4 < r3) goto L15
            return
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "endIndex should be not less than startIndex, but was "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = " < "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "endIndex should be non-negative, but is "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "startIndex should be non-negative, but is "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final /* synthetic */ int c(kotlin.sequences.p0 r0) {
            int r0 = r0.c
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.m d(kotlin.sequences.p0 r0) {
            kotlin.sequences.m<T> r0 = r0.a
            return r0
    }

    public static final /* synthetic */ int e(kotlin.sequences.p0 r0) {
            int r0 = r0.b
            return r0
    }

    private final int f() {
            r2 = this;
            int r0 = r2.c
            int r1 = r2.b
            int r0 = r0 - r1
            return r0
    }

    @Override // kotlin.sequences.e
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<T> a(int r4) {
            r3 = this;
            int r0 = r3.f()
            if (r4 < r0) goto Lb
            kotlin.sequences.m r4 = kotlin.sequences.x.l()
            return r4
        Lb:
            kotlin.sequences.p0 r0 = new kotlin.sequences.p0
            kotlin.sequences.m<T> r1 = r3.a
            int r2 = r3.b
            int r2 = r2 + r4
            int r4 = r3.c
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // kotlin.sequences.e
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<T> b(int r4) {
            r3 = this;
            int r0 = r3.f()
            if (r4 < r0) goto L7
            return r3
        L7:
            kotlin.sequences.p0 r0 = new kotlin.sequences.p0
            kotlin.sequences.m<T> r1 = r3.a
            int r2 = r3.b
            int r4 = r4 + r2
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.p0$a r0 = new kotlin.sequences.p0$a
            r0.<init>(r1)
            return r0
    }
}
