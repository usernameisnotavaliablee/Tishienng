package kotlin.reflect.full;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KClasses")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n295#2,2:280\n295#2,2:282\n808#2,11:284\n808#2,11:295\n774#2:306\n865#2,2:307\n774#2:309\n865#2,2:310\n808#2,11:312\n774#2:323\n865#2,2:324\n774#2:326\n865#2,2:327\n774#2:329\n865#2,2:330\n774#2:332\n865#2,2:333\n774#2:335\n865#2,2:336\n774#2:338\n865#2,2:339\n774#2:341\n865#2,2:342\n1617#2,9:344\n1869#2:353\n1870#2:355\n1626#2:356\n1563#2:357\n1634#2,3:358\n669#2,4:361\n1740#2,3:365\n673#2,7:368\n1563#2:375\n1634#2,3:376\n1#3:354\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n*L\n36#1:280,2\n47#1:282,2\n87#1:284,11\n94#1:295,11\n101#1:306\n101#1:307,2\n108#1:309\n108#1:310,2\n117#1:312,11\n124#1:323\n124#1:324,2\n131#1:326\n131#1:327,2\n139#1:329\n139#1:330,2\n146#1:332\n146#1:333,2\n153#1:335\n153#1:336,2\n160#1:338\n160#1:339,2\n167#1:341\n167#1:342,2\n182#1:344,9\n182#1:353\n182#1:355\n182#1:356\n221#1:357\n221#1:358,3\n274#1:361,4\n274#1:365,3\n274#1:368,7\n198#1:375\n198#1:376,3\n182#1:354\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.utils.b.f<kotlin.reflect.r, kotlin.reflect.r> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ boolean b(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.r r1 = (kotlin.reflect.r) r1
                boolean r1 = r0.f(r1)
                return r1
        }

        public boolean f(kotlin.reflect.r r2) {
                r1 = this;
                java.lang.String r0 = "current"
                kotlin.jvm.internal.g0.p(r2, r0)
                C extends java.lang.Iterable<R> r0 = r1.a
                java.util.LinkedList r0 = (java.util.LinkedList) r0
                r0.add(r2)
                r2 = 1
                return r2
        }
    }


    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.c<?>> A(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.h0 r1 = (kotlin.reflect.jvm.internal.h0) r1
            kotlin.s r1 = r1.j0()
            java.lang.Object r1 = r1.getValue()
            kotlin.reflect.jvm.internal.h0$b r1 = (kotlin.reflect.jvm.internal.h0.b) r1
            java.util.Collection r1 = r1.N()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void B(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.r C(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.z2 r0 = new kotlin.reflect.jvm.internal.z2
            r1 = r3
            kotlin.reflect.jvm.internal.h0 r1 = (kotlin.reflect.jvm.internal.h0) r1
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r1.k0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.s()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.full.d r2 = new kotlin.reflect.full.d
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void D(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.i<?>> E(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Collection r3 = r3.o()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            boolean r2 = r1 instanceof kotlin.reflect.i
            if (r2 == 0) goto L14
            r0.add(r1)
            goto L14
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void F(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.i<?>> G(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.J()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = W(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.i
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void H(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<kotlin.reflect.q<T, ?, ?>> I(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.J()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = W(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.q
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void J(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.i<?>> K(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.J()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = X(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.i
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void L(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<kotlin.reflect.p<T, ?>> M(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.J()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = X(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.p
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void N(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> kotlin.reflect.i<T> O(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.h0 r3 = (kotlin.reflect.jvm.internal.h0) r3
            java.util.Collection r3 = r3.f()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            r1 = r0
            kotlin.reflect.i r1 = (kotlin.reflect.i) r1
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlin.reflect.jvm.internal.m1 r1 = (kotlin.reflect.jvm.internal.m1) r1
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r1.M0()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.j r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r1
            boolean r1 = r1.m0()
            if (r1 == 0) goto L11
            goto L38
        L37:
            r0 = 0
        L38:
            kotlin.reflect.i r0 = (kotlin.reflect.i) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void P(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.i<?>> Q(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.h0 r3 = (kotlin.reflect.jvm.internal.h0) r3
            kotlin.s r3 = r3.j0()
            java.lang.Object r3 = r3.getValue()
            kotlin.reflect.jvm.internal.h0$b r3 = (kotlin.reflect.jvm.internal.h0.b) r3
            java.util.Collection r3 = r3.K()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            boolean r2 = r1 instanceof kotlin.reflect.i
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L32:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void R(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.o<?>> S(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.K()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = X(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.o
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void T(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.d<?>> U(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r3 = r3.i()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            kotlin.reflect.r r1 = (kotlin.reflect.r) r1
            kotlin.reflect.g r1 = r1.n()
            boolean r2 = r1 instanceof kotlin.reflect.d
            if (r2 == 0) goto L2b
            kotlin.reflect.d r1 = (kotlin.reflect.d) r1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L14
            r0.add(r1)
            goto L14
        L32:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void V(kotlin.reflect.d r0) {
            return
    }

    private static final boolean W(kotlin.reflect.jvm.internal.e0<?> r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r0.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.f0()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private static final boolean X(kotlin.reflect.jvm.internal.e0<?> r0) {
            boolean r0 = W(r0)
            r0 = r0 ^ 1
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static final boolean Y(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r0 != 0) goto L2f
            java.util.List r2 = kotlin.collections.f0.l(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.reflect.full.h$b r0 = kotlin.reflect.full.h.b.a
            kotlin.reflect.full.f r1 = new kotlin.reflect.full.f
            r1.<init>(r0)
            kotlin.reflect.full.g r0 = new kotlin.reflect.full.g
            r0.<init>(r3)
            java.lang.Boolean r2 = kotlin.reflect.jvm.internal.impl.utils.b.e(r2, r1, r0)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    private static final java.lang.Iterable Z(kotlin.reflect.p r0, kotlin.reflect.d r1) {
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    private static final java.lang.Iterable a(kotlin.reflect.r r8) {
            kotlin.reflect.g r0 = r8.n()
            boolean r1 = r0 instanceof kotlin.reflect.d
            r2 = 0
            if (r1 == 0) goto Lc
            kotlin.reflect.d r0 = (kotlin.reflect.d) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L8e
            java.util.List r0 = r0.i()
            java.util.List r1 = r8.getArguments()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
        L20:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            kotlin.jvm.internal.g0.n(r8, r1)
            r3 = r8
            kotlin.reflect.jvm.internal.z2 r3 = (kotlin.reflect.jvm.internal.z2) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.h2 r3 = kotlin.reflect.jvm.internal.impl.types.h2.f(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.f0.d0(r0, r5)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r0.next()
            kotlin.reflect.r r5 = (kotlin.reflect.r) r5
            kotlin.jvm.internal.g0.n(r5, r1)
            r6 = r5
            kotlin.reflect.jvm.internal.z2 r6 = (kotlin.reflect.jvm.internal.z2) r6
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r3.p(r6, r7)
            if (r6 == 0) goto L69
            kotlin.reflect.jvm.internal.z2 r5 = new kotlin.reflect.jvm.internal.z2
            r7 = 2
            r5.<init>(r6, r2, r7, r2)
            r4.add(r5)
            goto L41
        L69:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type substitution failed: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r8)
            r8 = 41
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L8d:
            return r4
        L8e:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Supertype not a class: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    private static final java.lang.Boolean a0(kotlin.reflect.d r0, kotlin.reflect.d r1) {
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private static final java.lang.reflect.Type b(kotlin.reflect.d r0) {
            kotlin.reflect.jvm.internal.h0 r0 = (kotlin.reflect.jvm.internal.h0) r0
            java.lang.Class r0 = r0.c()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static final boolean b0(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "derived"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = Y(r2, r1)
            return r1
    }

    static /* synthetic */ java.lang.reflect.Type c(kotlin.reflect.d r0) {
            java.lang.reflect.Type r0 = b(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    public static final <T> T c0(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.C(r2)
            if (r1 == 0) goto L11
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.safeCast"
            kotlin.jvm.internal.g0.n(r2, r1)
            return r2
        L11:
            r1 = 0
            return r1
    }

    static /* synthetic */ java.lang.Iterable d(kotlin.reflect.r r0) {
            java.lang.Iterable r0 = a(r0)
            return r0
    }

    static /* synthetic */ java.lang.Iterable e(kotlin.reflect.p r0, kotlin.reflect.d r1) {
            java.lang.Iterable r0 = Z(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Boolean f(kotlin.reflect.d r0, kotlin.reflect.d r1) {
            java.lang.Boolean r0 = a0(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T> T g(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.C(r3)
            if (r0 == 0) goto L11
            java.lang.String r2 = "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.cast"
            kotlin.jvm.internal.g0.n(r3, r2)
            return r3
        L11:
            kotlin.TypeCastException r3 = new kotlin.TypeCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value cannot be cast to "
            r0.append(r1)
            java.lang.String r2 = r2.x()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T> T h(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.Collection r0 = r7.f()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = r1
        L12:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r0.next()
            r5 = r4
            kotlin.reflect.i r5 = (kotlin.reflect.i) r5
            java.util.List r5 = r5.getParameters()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L33
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L33
            goto L4a
        L33:
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r5.next()
            kotlin.reflect.KParameter r6 = (kotlin.reflect.KParameter) r6
            boolean r6 = r6.p()
            if (r6 != 0) goto L37
            goto L12
        L4a:
            if (r2 == 0) goto L4d
            goto L54
        L4d:
            r2 = 1
            r3 = r4
            goto L12
        L50:
            if (r2 != 0) goto L53
            goto L54
        L53:
            r1 = r3
        L54:
            kotlin.reflect.i r1 = (kotlin.reflect.i) r1
            if (r1 == 0) goto L61
            java.util.Map r7 = kotlin.collections.i1.z()
            java.lang.Object r7 = r1.callBy(r7)
            return r7
        L61:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class should have a single no-arg constructor: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.d<?>> i(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Collection r4 = k(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r4.next()
            kotlin.reflect.r r1 = (kotlin.reflect.r) r1
            kotlin.reflect.g r2 = r1.n()
            boolean r3 = r2 instanceof kotlin.reflect.d
            if (r3 == 0) goto L31
            kotlin.reflect.d r2 = (kotlin.reflect.d) r2
            goto L32
        L31:
            r2 = 0
        L32:
            if (r2 == 0) goto L38
            r0.add(r2)
            goto L1a
        L38:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r4 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Supertype not a class: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L4f:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void j(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.r> k(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r3 = r3.i()
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.reflect.full.e r0 = kotlin.reflect.full.e.a
            kotlin.reflect.jvm.internal.impl.utils.b$h r1 = new kotlin.reflect.jvm.internal.impl.utils.b$h
            r1.<init>()
            kotlin.reflect.full.h$a r2 = new kotlin.reflect.full.h$a
            r2.<init>()
            java.lang.Object r3 = kotlin.reflect.jvm.internal.impl.utils.b.c(r3, r0, r1, r2)
            java.lang.String r0 = "dfs(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.util.Collection r3 = (java.util.Collection) r3
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void l(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.d<?> m(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r2 = r2.y()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            r1 = r0
            kotlin.reflect.d r1 = (kotlin.reflect.d) r1
            boolean r1 = r1.B()
            if (r1 == 0) goto Lf
            goto L24
        L23:
            r0 = 0
        L24:
            kotlin.reflect.d r0 = (kotlin.reflect.d) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void n(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object o(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.d r1 = m(r1)
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.A()
            return r1
        L10:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void p(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.i<?>> q(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.h0 r3 = (kotlin.reflect.jvm.internal.h0) r3
            kotlin.s r3 = r3.j0()
            java.lang.Object r3 = r3.getValue()
            kotlin.reflect.jvm.internal.h0$b r3 = (kotlin.reflect.jvm.internal.h0.b) r3
            java.util.Collection r3 = r3.N()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            boolean r2 = r1 instanceof kotlin.reflect.i
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L32:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void r(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.i<?>> s(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.O()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = W(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.i
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void t(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<kotlin.reflect.q<T, ?, ?>> u(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.O()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = W(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.q
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void v(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Collection<kotlin.reflect.i<?>> w(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.O()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = X(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.i
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void x(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<kotlin.reflect.p<T, ?>> y(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
            kotlin.s r4 = r4.j0()
            java.lang.Object r4 = r4.getValue()
            kotlin.reflect.jvm.internal.h0$b r4 = (kotlin.reflect.jvm.internal.h0.b) r4
            java.util.Collection r4 = r4.O()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.e0 r2 = (kotlin.reflect.jvm.internal.e0) r2
            boolean r3 = X(r2)
            if (r3 == 0) goto L20
            boolean r2 = r2 instanceof kotlin.reflect.p
            if (r2 == 0) goto L20
            r0.add(r1)
            goto L20
        L3b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void z(kotlin.reflect.d r0) {
            return
    }
}
