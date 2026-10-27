package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n92#2,14:110\n60#2,5:124\n60#2,5:129\n60#2,5:134\n10557#3,5:139\n10557#3,5:144\n1617#4,9:149\n1869#4:158\n1870#4:160\n1626#4:161\n1#5:159\n37#6:162\n36#6,3:163\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n*L\n58#1:110,14\n63#1:124,5\n68#1:129,5\n74#1:134,5\n76#1:139,5\n80#1:144,5\n46#1:149,9\n46#1:158\n46#1:160\n46#1:161\n46#1:159\n49#1:162\n49#1:163,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f implements kotlin.reflect.jvm.internal.impl.resolve.scopes.k {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i e;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f> r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.class
            java.lang.String r2 = "kotlinScopes"
            java.lang.String r3 = "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.f = r1
            return
    }

    public f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull x3.u r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r4) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "jPackage"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "packageFragment"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0
            r0.<init>(r2, r3, r4)
            r1.d = r0
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.e = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] i(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r0) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = l(r0)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] k() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.e
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f.f
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k[]) r0
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] l(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r5) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0 = r5.c
            java.util.Map r0 = r0.J0()
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.x) r2
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r5.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r3 = r3.b()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r4 = r5.c
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r3.c(r4, r2)
            if (r2 == 0) goto L15
            r1.add(r2)
            goto L15
        L37:
            kotlin.reflect.jvm.internal.impl.utils.j r5 = f4.a.b(r1)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.k[r0]
            java.lang.Object[] r5 = r5.toArray(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r5 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k[]) r5
            return r5
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6, @org.jetbrains.annotations.NotNull t3.b r7) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r7, r0)
            r5.e(r6, r7)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r5.d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r1 = r5.k()
            java.util.Collection r0 = r0.a(r6, r7)
            int r2 = r1.length
            r3 = 0
        L19:
            if (r3 >= r2) goto L28
            r4 = r1[r3]
            java.util.Collection r4 = r4.a(r6, r7)
            java.util.Collection r0 = f4.a.a(r0, r4)
            int r3 = r3 + 1
            goto L19
        L28:
            if (r0 != 0) goto L2f
            java.util.Set r6 = kotlin.collections.u1.k()
            return r6
        L2f:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r5.k()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L19
            r4 = r0[r3]
            java.util.Set r4 = r4.b()
            kotlin.collections.f0.s0(r1, r4)
            int r3 = r3 + 1
            goto Lb
        L19:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r5.d
            java.util.Set r0 = r0.b()
            r1.addAll(r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6, @org.jetbrains.annotations.NotNull t3.b r7) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r7, r0)
            r5.e(r6, r7)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r5.d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r1 = r5.k()
            java.util.Collection r0 = r0.c(r6, r7)
            int r2 = r1.length
            r3 = 0
        L19:
            if (r3 >= r2) goto L28
            r4 = r1[r3]
            java.util.Collection r4 = r4.c(r6, r7)
            java.util.Collection r0 = f4.a.a(r0, r4)
            int r3 = r3 + 1
            goto L19
        L28:
            if (r0 != 0) goto L2f
            java.util.Set r6 = kotlin.collections.u1.k()
            return r6
        L2f:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r5.k()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L19
            r4 = r0[r3]
            java.util.Set r4 = r4.d()
            kotlin.collections.f0.s0(r1, r4)
            int r3 = r3 + 1
            goto Lb
        L19:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r5.d
            java.util.Set r0 = r0.d()
            r1.addAll(r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull t3.b r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            t3.c r0 = r0.l()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r1 = r2.c
            s3.a.b(r0, r4, r1, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r2.k()
            java.lang.Iterable r0 = kotlin.collections.n.K5(r0)
            java.util.Set r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.m.a(r0)
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r1 = r2.d
            java.util.Set r1 = r1.f()
            r0.addAll(r1)
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r7, @org.jetbrains.annotations.NotNull t3.b r8) {
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r8, r0)
            r6.e(r7, r8)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r6.d
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.m0(r7, r8)
            if (r0 == 0) goto L16
            return r0
        L16:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r6.k()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L1d:
            if (r3 >= r1) goto L3c
            r4 = r0[r3]
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.g(r7, r8)
            if (r4 == 0) goto L39
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            if (r5 == 0) goto L38
            r5 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.c0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.c0) r5
            boolean r5 = r5.q0()
            if (r5 == 0) goto L38
            if (r2 != 0) goto L39
            r2 = r4
            goto L39
        L38:
            return r4
        L39:
            int r3 = r3 + 1
            goto L1d
        L3c:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r7) {
            r5 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r5.d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r1 = r5.k()
            java.util.Collection r0 = r0.h(r6, r7)
            int r2 = r1.length
            r3 = 0
        L16:
            if (r3 >= r2) goto L25
            r4 = r1[r3]
            java.util.Collection r4 = r4.h(r6, r7)
            java.util.Collection r0 = f4.a.a(r0, r4)
            int r3 = r3 + 1
            goto L16
        L25:
            if (r0 != 0) goto L2c
            java.util.Set r6 = kotlin.collections.u1.k()
            return r6
        L2c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "scope for "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r1 = r2.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
