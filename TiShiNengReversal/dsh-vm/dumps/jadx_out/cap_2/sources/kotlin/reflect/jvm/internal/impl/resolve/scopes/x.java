package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n3301#2,10:60\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n*L\n36#1:60,10\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.x.a d = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1563#2:60\n1634#2,3:61\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n*L\n50#1:60\n50#1:61,3\n*E\n"})
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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k a(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.t0> r4) {
                r2 = this;
                java.lang.String r0 = "message"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "types"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.f0.d0(r4, r1)
                r0.<init>(r1)
                java.util.Iterator r4 = r4.iterator()
            L1b:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r4.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r1.r()
                r0.add(r1)
                goto L1b
            L2f:
                kotlin.reflect.jvm.internal.impl.utils.j r4 = f4.a.b(r0)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.b$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.d
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.b(r3, r4)
                int r4 = r4.size()
                r1 = 1
                if (r4 > r1) goto L41
                return r0
            L41:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.x r4 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.x
                r1 = 0
                r4.<init>(r3, r0, r1)
                return r4
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.x$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.x$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.x.d = r0
            return
    }

    private x(java.lang.String r1, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            return
    }

    public /* synthetic */ x(java.lang.String r1, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a k(kotlin.reflect.jvm.internal.impl.descriptors.d1 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = p(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a l(kotlin.reflect.jvm.internal.impl.descriptors.w0 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = q(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a m(kotlin.reflect.jvm.internal.impl.descriptors.a r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = o(r0)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k n(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.t0> r2) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.x$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.x.d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r0.a(r1, r2)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.a o(kotlin.reflect.jvm.internal.impl.descriptors.a r1) {
            java.lang.String r0 = "$this$selectMostSpecificInEachOverridableGroup"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.a p(kotlin.reflect.jvm.internal.impl.descriptors.d1 r1) {
            java.lang.String r0 = "$this$selectMostSpecificInEachOverridableGroup"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.a q(kotlin.reflect.jvm.internal.impl.descriptors.w0 r1) {
            java.lang.String r0 = "$this$selectMostSpecificInEachOverridableGroup"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Collection r2 = super.a(r2, r3)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.u r3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.u.a
            java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.resolve.p.b(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Collection r2 = super.c(r2, r3)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.v r3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.v.a
            java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.resolve.p.b(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Collection r4 = super.h(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r2
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r2 == 0) goto L33
            r5.add(r1)
            goto L1e
        L33:
            r0.add(r1)
            goto L1e
        L37:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r5, r0)
            java.lang.Object r5 = r4.component1()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r4.component2()
            java.util.List r4 = (java.util.List) r4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>"
            kotlin.jvm.internal.g0.n(r5, r0)
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.reflect.jvm.internal.impl.resolve.scopes.w r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.w.a
            java.util.Collection r5 = kotlin.reflect.jvm.internal.impl.resolve.p.b(r5, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = kotlin.collections.f0.I4(r5, r4)
            java.util.Collection r4 = (java.util.Collection) r4
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.resolve.scopes.k j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.c
            return r0
    }
}
