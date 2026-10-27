package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h<T> implements kotlin.sequences.m<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;
    private final boolean b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<T>, l3.a {
        private final java.util.Iterator<T> a;
        private int b;
        private T c;
        final /* synthetic */ kotlin.sequences.h<T> d;

        a(kotlin.sequences.h<T> r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                kotlin.sequences.m r1 = kotlin.sequences.h.e(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.a = r1
                r1 = -1
                r0.b = r1
                return
        }

        private final void a() {
                r3 = this;
            L0:
                java.util.Iterator<T> r0 = r3.a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L2c
                java.util.Iterator<T> r0 = r3.a
                java.lang.Object r0 = r0.next()
                kotlin.sequences.h<T> r1 = r3.d
                kotlin.jvm.functions.Function1 r1 = kotlin.sequences.h.c(r1)
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                kotlin.sequences.h<T> r2 = r3.d
                boolean r2 = kotlin.sequences.h.d(r2)
                if (r1 != r2) goto L0
                r3.c = r0
                r0 = 1
                r3.b = r0
                return
            L2c:
                r0 = 0
                r3.b = r0
                return
        }

        public final java.util.Iterator<T> c() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                return r0
        }

        public final T e() {
                r1 = this;
                T r0 = r1.c
                return r0
        }

        public final int f() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final void g(T r1) {
                r0 = this;
                r0.c = r1
                return
        }

        public final void h(int r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                r1 = -1
                if (r0 != r1) goto L8
                r2.a()
            L8:
                int r0 = r2.b
                r1 = 1
                if (r0 != r1) goto Le
                return r1
            Le:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                int r0 = r3.b
                r1 = -1
                if (r0 != r1) goto L8
                r3.a()
            L8:
                int r0 = r3.b
                if (r0 == 0) goto L14
                T r0 = r3.c
                r2 = 0
                r3.c = r2
                r3.b = r1
                return r0
            L14:
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

    public h(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public /* synthetic */ h(kotlin.sequences.m r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r2 = 1
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 c(kotlin.sequences.h r0) {
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r0 = r0.c
            return r0
    }

    public static final /* synthetic */ boolean d(kotlin.sequences.h r0) {
            boolean r0 = r0.b
            return r0
    }

    public static final /* synthetic */ kotlin.sequences.m e(kotlin.sequences.h r0) {
            kotlin.sequences.m<T> r0 = r0.a
            return r0
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.sequences.h$a r0 = new kotlin.sequences.h$a
            r0.<init>(r1)
            return r0
    }
}
