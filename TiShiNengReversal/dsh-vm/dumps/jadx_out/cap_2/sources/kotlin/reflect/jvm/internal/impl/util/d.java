package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n11408#2,11:146\n13537#2,2:157\n13539#2:160\n11419#2:161\n1#3:159\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n140#1:146,11\n140#1:157,2\n140#1:160\n140#1:161\n140#1:159\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d<T> extends kotlin.reflect.jvm.internal.impl.util.c<T> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.util.d.a c = null;

    @org.jetbrains.annotations.NotNull
    private java.lang.Object[] a;
    private int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.collections.c<T> {
        private int c;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.util.d<T> d;

        b(kotlin.reflect.jvm.internal.impl.util.d<T> r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = -1
                r0.c = r1
                return
        }

        @Override // kotlin.collections.c
        protected void a() {
                r2 = this;
            L0:
                int r0 = r2.c
                int r0 = r0 + 1
                r2.c = r0
                kotlin.reflect.jvm.internal.impl.util.d<T> r1 = r2.d
                java.lang.Object[] r1 = kotlin.reflect.jvm.internal.impl.util.d.e(r1)
                int r1 = r1.length
                if (r0 >= r1) goto L1b
                kotlin.reflect.jvm.internal.impl.util.d<T> r0 = r2.d
                java.lang.Object[] r0 = kotlin.reflect.jvm.internal.impl.util.d.e(r0)
                int r1 = r2.c
                r0 = r0[r1]
                if (r0 == 0) goto L0
            L1b:
                int r0 = r2.c
                kotlin.reflect.jvm.internal.impl.util.d<T> r1 = r2.d
                java.lang.Object[] r1 = kotlin.reflect.jvm.internal.impl.util.d.e(r1)
                int r1 = r1.length
                if (r0 < r1) goto L2a
                r2.c()
                return
            L2a:
                kotlin.reflect.jvm.internal.impl.util.d<T> r0 = r2.d
                java.lang.Object[] r0 = kotlin.reflect.jvm.internal.impl.util.d.e(r0)
                int r1 = r2.c
                r0 = r0[r1]
                java.lang.String r1 = "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"
                kotlin.jvm.internal.g0.n(r0, r1)
                r2.e(r0)
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.util.d$a r0 = new kotlin.reflect.jvm.internal.impl.util.d$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.util.d.c = r0
            return
    }

    public d() {
            r2 = this;
            r0 = 20
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private d(java.lang.Object[] r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.a = r2
            r1.b = r3
            return
    }

    public static final /* synthetic */ java.lang.Object[] e(kotlin.reflect.jvm.internal.impl.util.d r0) {
            java.lang.Object[] r0 = r0.a
            return r0
    }

    private final void f(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.a
            int r1 = r0.length
            if (r1 <= r3) goto L6
            return
        L6:
            int r0 = r0.length
        L7:
            int r0 = r0 * 2
            if (r0 <= r3) goto L7
            java.lang.Object[] r3 = r2.a
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.a = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void d(int r2, @org.jetbrains.annotations.NotNull T r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.f(r2)
            java.lang.Object[] r0 = r1.a
            r0 = r0[r2]
            if (r0 != 0) goto L16
            int r0 = r1.a()
            int r0 = r0 + 1
            r1.b = r0
        L16:
            java.lang.Object[] r0 = r1.a
            r0[r2] = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @org.jetbrains.annotations.Nullable
    public T get(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.a
            java.lang.Object r2 = kotlin.collections.n.hf(r0, r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.util.d$b r0 = new kotlin.reflect.jvm.internal.impl.util.d$b
            r0.<init>(r1)
            return r0
    }
}
