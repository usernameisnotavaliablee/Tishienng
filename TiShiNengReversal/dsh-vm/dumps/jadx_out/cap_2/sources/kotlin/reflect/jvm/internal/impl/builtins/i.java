package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nfunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n1#2:302\n1563#3:303\n1634#3,3:304\n230#3,2:307\n1563#3:309\n1634#3,3:310\n1563#3:313\n1634#3,3:314\n1604#3,4:317\n*S KotlinDebug\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n*L\n160#1:303\n160#1:304,3\n195#1:307,2\n200#1:309\n200#1:310,3\n222#1:313\n222#1:314,3\n225#1:317,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {
    public static final int a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.D
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r1.b(r0)
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            java.util.Map r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.builtins.o.q
            java.lang.Object r1 = kotlin.collections.i1.K(r1, r0)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlin.reflect.jvm.internal.impl.resolve.constants.n r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.n) r1
            java.lang.Object r1 = r1.a()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            return r1
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r9, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r10, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r11, @org.jetbrains.annotations.Nullable java.util.List<kotlin.reflect.jvm.internal.impl.name.f> r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r13, boolean r14) {
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "contextReceiverTypes"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "returnType"
            kotlin.jvm.internal.g0.p(r13, r0)
            r6 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.util.List r7 = g(r1, r2, r3, r4, r5, r6)
            int r9 = r3.size()
            int r10 = r2.size()
            int r9 = r9 + r10
            if (r1 != 0) goto L30
            r10 = 0
            goto L31
        L30:
            r10 = 1
        L31:
            int r9 = r9 + r10
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = f(r6, r9, r14)
            if (r1 == 0) goto L3c
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8 = u(r8, r6)
        L3c:
            r10 = r2
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L4d
            int r10 = r2.size()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8 = t(r8, r6, r10)
        L4d:
            kotlin.reflect.jvm.internal.impl.types.t1 r8 = kotlin.reflect.jvm.internal.impl.types.u1.b(r8)
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = kotlin.reflect.jvm.internal.impl.types.w0.h(r8, r9, r7)
            return r7
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 c(kotlin.reflect.jvm.internal.impl.builtins.j r9, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10, kotlin.reflect.jvm.internal.impl.types.t0 r11, java.util.List r12, java.util.List r13, java.util.List r14, kotlin.reflect.jvm.internal.impl.types.t0 r15, boolean r16, int r17, java.lang.Object r18) {
            r0 = r17
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L10
            r0 = 0
            r8 = 0
        L8:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            goto L13
        L10:
            r8 = r16
            goto L8
        L13:
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = b(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.name.f d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.E
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = r2.b(r0)
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.util.Map r2 = r2.a()
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.f0.n5(r2)
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.y
            if (r1 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.resolve.constants.y r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.y) r2
            goto L29
        L28:
            r2 = r0
        L29:
            if (r2 == 0) goto L42
            java.lang.Object r2 = r2.a()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L42
            boolean r1 = kotlin.reflect.jvm.internal.impl.name.f.j(r2)
            if (r1 == 0) goto L3a
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            return r2
        L42:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            p(r2)
            int r0 = a(r2)
            if (r0 != 0) goto L13
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
        L13:
            java.util.List r2 = r2.G0()
            r1 = 0
            java.util.List r2 = r2.subList(r1, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = (kotlin.reflect.jvm.internal.impl.types.c2) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            r0.add(r1)
            goto L2d
        L41:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r1, int r2, boolean r3) {
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r3 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r1.Y(r2)
            goto L10
        Lc:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r1.D(r2)
        L10:
            kotlin.jvm.internal.g0.m(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> g(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r10, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r11, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r12, @org.jetbrains.annotations.Nullable java.util.List<kotlin.reflect.jvm.internal.impl.name.f> r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r15) {
            java.lang.String r0 = "contextReceiverTypes"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "returnType"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.size()
            int r2 = r11.size()
            int r1 = r1 + r2
            r2 = 0
            r3 = 1
            if (r10 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            int r1 = r1 + r4
            int r1 = r1 + r3
            r0.<init>(r1)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r11, r3)
            r1.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        L3c:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r11.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            kotlin.reflect.jvm.internal.impl.types.c2 r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r3)
            r1.add(r3)
            goto L3c
        L50:
            r0.addAll(r1)
            r11 = 0
            if (r10 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.types.c2 r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r10)
            goto L5c
        L5b:
            r10 = r11
        L5c:
            kotlin.reflect.jvm.internal.impl.utils.a.a(r0, r10)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r10 = r12.iterator()
        L65:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lce
            java.lang.Object r12 = r10.next()
            int r1 = r2 + 1
            if (r2 >= 0) goto L76
            kotlin.collections.f0.b0()
        L76:
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = (kotlin.reflect.jvm.internal.impl.types.t0) r12
            if (r13 == 0) goto L89
            java.lang.Object r2 = r13.get(r2)
            kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
            if (r2 == 0) goto L89
            boolean r3 = r2.i()
            if (r3 != 0) goto L89
            goto L8a
        L89:
            r2 = r11
        L8a:
            if (r2 == 0) goto Lc3
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.k r3 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k
            kotlin.reflect.jvm.internal.impl.name.c r5 = kotlin.reflect.jvm.internal.impl.builtins.o.a.E
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.builtins.o.m
            kotlin.reflect.jvm.internal.impl.resolve.constants.y r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.y
            java.lang.String r2 = r2.b()
            java.lang.String r7 = "asString(...)"
            kotlin.jvm.internal.g0.o(r2, r7)
            r6.<init>(r2)
            kotlin.Pair r2 = kotlin.o0.a(r4, r6)
            java.util.Map r6 = kotlin.collections.i1.k(r2)
            r8 = 8
            r9 = 0
            r7 = 0
            r4 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r15 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r12.getAnnotations()
            java.util.List r2 = kotlin.collections.f0.F4(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r15 = r15.a(r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.D(r12, r15)
            goto Lc4
        Lc3:
            r4 = r15
        Lc4:
            kotlin.reflect.jvm.internal.impl.types.c2 r12 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r12)
            r0.add(r12)
            r2 = r1
            r15 = r4
            goto L65
        Lce:
            kotlin.reflect.jvm.internal.impl.types.c2 r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r14)
            r0.add(r10)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.C0(r2)
            if (r0 != 0) goto L12
            return r1
        L12:
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.p(r2)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r2 = i(r2)
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.e i(kotlin.reflect.jvm.internal.impl.name.d r3) {
            boolean r0 = r3.f()
            if (r0 == 0) goto L2d
            boolean r0 = r3.e()
            if (r0 == 0) goto Ld
            goto L2d
        Ld:
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$a r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.f.c
            kotlin.reflect.jvm.internal.impl.builtins.functions.f r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r3.m()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.j()
            java.lang.String r3 = r3.b()
            java.lang.String r2 = "asString(...)"
            kotlin.jvm.internal.g0.o(r3, r2)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r3 = r0.b(r1, r3)
            return r3
        L2d:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = h(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.t0 k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            p(r1)
            boolean r0 = s(r1)
            if (r0 != 0) goto L10
            r1 = 0
            return r1
        L10:
            int r0 = a(r1)
            java.util.List r1 = r1.G0()
            java.lang.Object r1 = r1.get(r0)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = (kotlin.reflect.jvm.internal.impl.types.c2) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            p(r1)
            java.util.List r1 = r1.G0()
            java.lang.Object r1 = kotlin.collections.f0.u3(r1)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = (kotlin.reflect.jvm.internal.impl.types.c2) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            p(r2)
            java.util.List r0 = r2.G0()
            int r1 = a(r2)
            boolean r2 = n(r2)
            int r1 = r1 + r2
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.util.List r2 = r0.subList(r1, r2)
            return r2
    }

    public static final boolean n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = p(r1)
            if (r0 == 0) goto L13
            boolean r1 = s(r1)
            if (r1 == 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static final boolean o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = h(r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$a r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.a.f
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 != 0) goto L1c
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$d r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.d.f
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 == 0) goto L1a
            goto L1c
        L1a:
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    public static final boolean p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            r0 = 0
            if (r2 == 0) goto L18
            boolean r2 = o(r2)
            r1 = 1
            if (r2 != r1) goto L18
            return r1
        L18:
            return r0
    }

    public static final boolean q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = j(r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$a r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.a.f
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            return r1
    }

    public static final boolean r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = j(r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$d r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.d.f
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            return r1
    }

    private static final boolean s(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.C
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r1.b(r0)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.o.a.D
            boolean r0 = r8.l(r3)
            if (r0 == 0) goto L13
            return r8
        L13:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.k r1 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.builtins.o.q
            kotlin.reflect.jvm.internal.impl.resolve.constants.n r4 = new kotlin.reflect.jvm.internal.impl.resolve.constants.n
            r4.<init>(r10)
            kotlin.Pair r10 = kotlin.o0.a(r2, r4)
            java.util.Map r4 = kotlin.collections.i1.k(r10)
            r6 = 8
            r7 = 0
            r5 = 0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List r8 = kotlin.collections.f0.F4(r8, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8 = r0.a(r8)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.o.a.C
            boolean r0 = r8.l(r3)
            if (r0 == 0) goto L13
            return r8
        L13:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.k r1 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k
            java.util.Map r4 = kotlin.collections.i1.z()
            r6 = 8
            r7 = 0
            r5 = 0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List r8 = kotlin.collections.f0.F4(r8, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8 = r0.a(r8)
            return r8
    }
}
