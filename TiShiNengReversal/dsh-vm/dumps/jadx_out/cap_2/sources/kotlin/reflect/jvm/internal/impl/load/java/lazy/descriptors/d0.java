package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyJavaPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1617#2,9:97\n1869#2:106\n1870#2:109\n1626#2:110\n1563#2:111\n1634#2,3:112\n1#3:107\n1#3:108\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment\n*L\n46#1:97,9\n46#1:106\n46#1:109\n46#1:110\n55#1:111\n55#1:112,3\n46#1:108\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h0 {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] o = null;

    @org.jetbrains.annotations.NotNull
    private final x3.u g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.List<kotlin.reflect.jvm.internal.impl.name.c>> l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g m;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[] r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0.a.a = r0
                return
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0> r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0.class
            java.lang.String r2 = "binaryClasses"
            java.lang.String r3 = "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "partToFacade"
            java.lang.String r5 = "getPartToFacade()Ljava/util/HashMap;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r2)
            r2 = 2
            kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0.o = r2
            return
    }

    public d0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r9, @org.jetbrains.annotations.NotNull x3.u r10) {
            r8 = this;
            java.lang.String r0 = "outerContext"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "jPackage"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r9.d()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r10.d()
            r8.<init>(r0, r1)
            r8.g = r10
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r8
            r2 = r9
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r9 = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.f(r2, r3, r4, r5, r6, r7)
            r3.h = r9
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r2.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.f()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = r0.f()
            r3.i = r0
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r9.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a0 r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a0
            r1.<init>(r8)
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r0.e(r1)
            r3.j = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f
            r0.<init>(r9, r10, r8)
            r3.k = r0
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r9.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b0 r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b0
            r1.<init>(r8)
            java.util.List r2 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r0.a(r1, r2)
            r3.l = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r9.a()
            kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = r0.i()
            boolean r0 = r0.a()
            if (r0 == 0) goto L77
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10 = r10.b()
            goto L7b
        L77:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r9, r10)
        L7b:
            r3.m = r10
            kotlin.reflect.jvm.internal.impl.storage.n r9 = r9.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c0 r10 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c0
            r10.<init>(r8)
            kotlin.reflect.jvm.internal.impl.storage.i r9 = r9.e(r10)
            r3.n = r9
            return
    }

    static /* synthetic */ java.util.Map E0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0) {
            java.util.Map r0 = H0(r0)
            return r0
    }

    static /* synthetic */ java.util.List F0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0) {
            java.util.List r0 = N0(r0)
            return r0
    }

    static /* synthetic */ java.util.HashMap G0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0) {
            java.util.HashMap r0 = M0(r0)
            return r0
    }

    private static final java.util.Map H0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r6) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r6.h
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r0 = r0.o()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r6.d()
            java.lang.String r1 = r1.a()
            java.util.List r0 = r0.a(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            kotlin.reflect.jvm.internal.impl.name.b$a r3 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(r2)
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.e()
            java.lang.String r5 = "getFqNameForTopLevelClassMaybeWithDollars(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            kotlin.reflect.jvm.internal.impl.name.b r3 = r3.c(r4)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r6.h
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4 = r4.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r4 = r4.j()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r5 = r6.i
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r4, r3, r5)
            if (r3 == 0) goto L57
            kotlin.Pair r2 = kotlin.o0.a(r2, r3)
            goto L58
        L57:
            r2 = 0
        L58:
            if (r2 == 0) goto L21
            r1.add(r2)
            goto L21
        L5e:
            java.util.Map r6 = kotlin.collections.i1.B0(r1)
            return r6
    }

    private static final java.util.HashMap M0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r5 = r5.J0()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r1 = (kotlin.reflect.jvm.internal.impl.load.kotlin.x) r1
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(r2)
            java.lang.String r3 = "byInternalName(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r1.e()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = r1.c()
            int[] r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0.a.a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 == r4) goto L4d
            r1 = 2
            if (r3 == r1) goto L49
            goto L11
        L49:
            r0.put(r2, r2)
            goto L11
        L4d:
            java.lang.String r1 = r1.e()
            if (r1 != 0) goto L54
            goto L11
        L54:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r1 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(r1)
            r0.put(r2, r1)
            goto L11
        L5c:
            return r0
    }

    private static final java.util.List N0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r2) {
            x3.u r2 = r2.g
            java.util.Collection r2 = r2.o()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            x3.u r1 = (x3.u) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            r0.add(r1)
            goto L17
        L2b:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.d I0(@org.jetbrains.annotations.NotNull x3.g r2) {
            r1 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r0 = r1.k
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0 = r0.j()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r0.l0(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.kotlin.x> J0() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.j
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0.o
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f K0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.c> L0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.List<kotlin.reflect.jvm.internal.impl.name.c>> r0 = r1.l
            java.lang.Object r0 = r0.invoke()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.m
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.y r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.y
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Lazy Java package fragment: "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.d()
            r0.append(r1)
            java.lang.String r1 = " of module "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r2.h
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r1.m()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
