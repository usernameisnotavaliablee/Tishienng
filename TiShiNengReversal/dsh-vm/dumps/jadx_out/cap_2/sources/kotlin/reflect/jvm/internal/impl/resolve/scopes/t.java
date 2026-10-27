package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSubstitutingScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n382#2,3:112\n385#2,4:116\n19#3:115\n1#4:120\n*S KotlinDebug\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n*L\n52#1:112,3\n52#1:116,4\n54#1:115\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t implements kotlin.reflect.jvm.internal.impl.resolve.scopes.k {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.h2 d;

    @org.jetbrains.annotations.Nullable
    private java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.k> e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s f;

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r4) {
            r2 = this;
            java.lang.String r0 = "workerScope"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "givenSubstitutor"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.b = r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.r r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.r
            r3.<init>(r4)
            kotlin.s r3 = kotlin.t.c(r3)
            r2.c = r3
            kotlin.reflect.jvm.internal.impl.types.f2 r3 = r4.j()
            java.lang.String r4 = "getSubstitution(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            r4 = 1
            r0 = 0
            r1 = 0
            kotlin.reflect.jvm.internal.impl.types.f2 r3 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e.h(r3, r1, r4, r0)
            kotlin.reflect.jvm.internal.impl.types.h2 r3 = r3.c()
            r2.d = r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.s r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.s
            r3.<init>(r2)
            kotlin.s r3 = kotlin.t.c(r3)
            r2.f = r3
            return
    }

    private static final java.util.Collection i(kotlin.reflect.jvm.internal.impl.resolve.scopes.t r3) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r3.b
            r1 = 0
            r2 = 3
            java.util.Collection r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.n.a.a(r0, r1, r1, r2, r1)
            java.util.Collection r3 = r3.m(r0)
            return r3
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h2 j(kotlin.reflect.jvm.internal.impl.types.h2 r0) {
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = o(r0)
            return r0
    }

    static /* synthetic */ java.util.Collection k(kotlin.reflect.jvm.internal.impl.resolve.scopes.t r0) {
            java.util.Collection r0 = i(r0)
            return r0
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> l() {
            r1 = this;
            kotlin.s r0 = r1.f
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> java.util.Collection<D> m(java.util.Collection<? extends D> r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r2.d
            boolean r0 = r0.k()
            if (r0 == 0) goto L9
            return r3
        L9:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L10
            return r3
        L10:
            int r0 = r3.size()
            java.util.LinkedHashSet r0 = kotlin.reflect.jvm.internal.impl.utils.a.g(r0)
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r1
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r2.n(r1)
            r0.add(r1)
            goto L1c
        L30:
            return r0
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.k> D n(D r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r3.d
            boolean r0 = r0.k()
            if (r0 == 0) goto L9
            return r4
        L9:
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.k> r0 = r3.e
            if (r0 != 0) goto L14
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.e = r0
        L14:
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.descriptors.k> r0 = r3.e
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L69
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g1
            if (r1 == 0) goto L4e
            r1 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.g1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.g1) r1
            kotlin.reflect.jvm.internal.impl.types.h2 r2 = r3.d
            kotlin.reflect.jvm.internal.impl.descriptors.l r1 = r1.c(r2)
            if (r1 == 0) goto L32
            r0.put(r4, r1)
            goto L69
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " substitution fails"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
        L4e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown descriptor in scope: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L69:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r1
            java.lang.String r4 = "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute"
            kotlin.jvm.internal.g0.n(r1, r4)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.types.h2 o(kotlin.reflect.jvm.internal.impl.types.h2 r0) {
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r0.j()
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r0.c()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Collection r2 = r0.a(r2, r3)
            java.util.Collection r2 = r1.m(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Set r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Collection r2 = r0.c(r2, r3)
            java.util.Collection r2 = r1.m(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Set r0 = r0.d()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k.b.a(r0, r1, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Set r0 = r0.f()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r0.g(r2, r3)
            if (r2 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r1.n(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r2
            return r2
        L19:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.Collection r2 = r1.l()
            return r2
    }
}
