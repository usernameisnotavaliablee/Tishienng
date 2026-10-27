package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k<T> extends kotlin.collections.j<T> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.utils.k.b c = null;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object a;
    private int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a<T> implements java.util.Iterator<T>, l3.d {

        @org.jetbrains.annotations.NotNull
        private final java.util.Iterator<T> a;

        public a(@org.jetbrains.annotations.NotNull T[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                java.util.Iterator r2 = kotlin.jvm.internal.h.a(r2)
                r1.a = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Void a() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.a
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
                r0 = this;
                r0.a()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final <T> kotlin.reflect.jvm.internal.impl.utils.k<T> a() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.utils.k r0 = new kotlin.reflect.jvm.internal.impl.utils.k
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final <T> kotlin.reflect.jvm.internal.impl.utils.k<T> b(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r3) {
                r2 = this;
                java.lang.String r0 = "set"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.utils.k r0 = new kotlin.reflect.jvm.internal.impl.utils.k
                r1 = 0
                r0.<init>(r1)
                r0.addAll(r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c<T> implements java.util.Iterator<T>, l3.d {
        private final T a;
        private boolean b;

        public c(T r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r1 = 1
                r0.b = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Void a() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.b
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto La
                r0 = 0
                r1.b = r0
                T r0 = r1.a
                return r0
            La:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
                r0 = this;
                r0.a()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.utils.k$b r0 = new kotlin.reflect.jvm.internal.impl.utils.k$b
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.utils.k.c = r0
            return
    }

    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ k(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.reflect.jvm.internal.impl.utils.k<T> a() {
            kotlin.reflect.jvm.internal.impl.utils.k$b r0 = kotlin.reflect.jvm.internal.impl.utils.k.c
            kotlin.reflect.jvm.internal.impl.utils.k r0 = r0.a()
            return r0
    }

    @Override // kotlin.collections.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            if (r0 != 0) goto La
            r4.a = r5
            goto L78
        La:
            int r0 = r4.size()
            r2 = 0
            if (r0 != r1) goto L26
            java.lang.Object r0 = r4.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r5)
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.lang.Object r0 = r4.a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r5
            r4.a = r3
            goto L78
        L26:
            int r0 = r4.size()
            r3 = 5
            if (r0 >= r3) goto L66
            java.lang.Object r0 = r4.a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.g0.n(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.collections.n.B8(r0, r5)
            if (r3 == 0) goto L3d
            return r2
        L3d:
            int r2 = r4.size()
            r3 = 4
            if (r2 != r3) goto L51
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.util.LinkedHashSet r0 = kotlin.collections.u1.o(r0)
            r0.add(r5)
            goto L63
        L51:
            int r2 = r4.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r5
        L63:
            r4.a = r0
            goto L78
        L66:
            java.lang.Object r0 = r4.a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.g0.n(r0, r3)
            java.util.Set r0 = kotlin.jvm.internal.u0.o(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L78
            return r2
        L78:
            int r5 = r4.size()
            int r5 = r5 + r1
            r4.d(r5)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.d(r0)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L16
            java.lang.Object r0 = r2.a
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            return r3
        L16:
            int r0 = r2.size()
            r1 = 5
            if (r0 >= r1) goto L2b
            java.lang.Object r0 = r2.a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = kotlin.collections.n.B8(r0, r3)
            return r3
        L2b:
            java.lang.Object r0 = r2.a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.util.Set r0 = (java.util.Set) r0
            boolean r3 = r0.contains(r3)
            return r3
    }

    public void d(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // kotlin.collections.j
    public int getSize() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r3 = this;
            int r0 = r3.size()
            if (r0 != 0) goto Ld
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            java.util.Iterator r0 = r0.iterator()
            return r0
        Ld:
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L1c
            kotlin.reflect.jvm.internal.impl.utils.k$c r0 = new kotlin.reflect.jvm.internal.impl.utils.k$c
            java.lang.Object r1 = r3.a
            r0.<init>(r1)
            return r0
        L1c:
            int r0 = r3.size()
            r1 = 5
            if (r0 >= r1) goto L32
            kotlin.reflect.jvm.internal.impl.utils.k$a r0 = new kotlin.reflect.jvm.internal.impl.utils.k$a
            java.lang.Object r1 = r3.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.g0.n(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.<init>(r1)
            return r0
        L32:
            java.lang.Object r0 = r3.a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.util.Set r0 = kotlin.jvm.internal.u0.o(r0)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
