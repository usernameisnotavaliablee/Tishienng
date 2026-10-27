package kotlin.reflect.jvm.internal.calls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,392:1\n1#2:393\n1563#3:394\n1634#3,3:395\n1563#3:398\n1634#3,3:399\n1634#3,3:402\n1761#3,3:405\n1761#3,3:408\n1374#3:411\n1460#3,2:412\n1563#3:414\n1634#3,3:415\n1462#3,3:418\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n*L\n262#1:394\n262#1:395,3\n264#1:398\n264#1:399,3\n308#1:402,3\n328#1:405,3\n329#1:408,3\n257#1:411\n257#1:412,2\n258#1:414\n258#1:415,3\n257#1:418,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n {
    private static final boolean a(java.lang.reflect.Member r0) {
            java.lang.Class r0 = r0.getDeclaringClass()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            kotlin.reflect.d r0 = k3.a.i(r0)
            boolean r0 = r0.v()
            r0 = r0 ^ 1
            return r0
    }

    public static final /* synthetic */ void b(kotlin.reflect.jvm.internal.calls.g r0, int r1, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, boolean r3) {
            g(r0, r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.reflect.Method c(java.lang.Class r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.reflect.Method r0 = k(r0, r1)
            return r0
    }

    public static final /* synthetic */ java.util.List d(kotlin.reflect.jvm.internal.impl.types.e1 r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.util.List r0 = p(r0, r1)
            return r0
    }

    public static final /* synthetic */ java.util.List e(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0, java.lang.reflect.Member r1, kotlin.jvm.functions.Function1 r2) {
            java.util.List r0 = r(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Class f(kotlin.reflect.jvm.internal.impl.types.t0 r0) {
            java.lang.Class r0 = t(r0)
            return r0
    }

    private static final void g(kotlin.reflect.jvm.internal.calls.g<?> r3, int r4, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5, boolean r6) {
            int r0 = kotlin.reflect.jvm.internal.calls.i.a(r3)
            if (r0 != r4) goto L7
            return
        L7:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r1.append(r2)
            int r2 = kotlin.reflect.jvm.internal.calls.i.a(r3)
            r1.append(r2)
            java.lang.String r2 = " != "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "\nCalling: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "\nParameter types: "
            r1.append(r4)
            java.util.List r3 = r3.b()
            r1.append(r3)
            java.lang.String r3 = ")\nDefault: "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object h(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r0 == 0) goto L13
            r0 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.s1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.s1) r0
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.e(r0)
            if (r0 == 0) goto L13
            goto L2b
        L13:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = l(r2)
            if (r0 == 0) goto L2b
            java.lang.Class r0 = t(r0)
            if (r0 == 0) goto L2b
            java.lang.reflect.Method r2 = m(r0, r2)
            if (r2 != 0) goto L26
            goto L2b
        L26:
            r0 = 0
            java.lang.Object r1 = r2.invoke(r1, r0)
        L2b:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.jvm.internal.calls.g<M> i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.calls.g<? extends M> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.a(r4)
            if (r0 != 0) goto L96
            java.util.List r0 = r4.A0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.j.h(r1)
            if (r1 == 0) goto L2f
            goto L96
        L49:
            java.util.List r0 = r4.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.j.h(r1)
            if (r1 == 0) goto L66
            goto L96
        L80:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r4.getReturnType()
            if (r0 == 0) goto L8e
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.c(r0)
            r1 = 1
            if (r0 != r1) goto L8e
            goto L96
        L8e:
            boolean r0 = q(r4)
            if (r0 == 0) goto L95
            goto L96
        L95:
            return r3
        L96:
            kotlin.reflect.jvm.internal.calls.m r0 = new kotlin.reflect.jvm.internal.calls.m
            r0.<init>(r4, r3, r5)
            return r0
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.calls.g j(kotlin.reflect.jvm.internal.calls.g r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.reflect.jvm.internal.calls.g r0 = i(r0, r1, r2)
            return r0
    }

    private static final java.lang.reflect.Method k(java.lang.Class<?> r4, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5) {
            java.lang.String r0 = "box-impl"
            java.lang.reflect.Method r1 = m(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.Class r1 = r1.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L18
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L18
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L18
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.NoSuchMethodException -> L18
            return r0
        L18:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No box method found in inline class: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (calling "
            r1.append(r4)
            r1.append(r5)
            r4 = 41
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 l(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r3.f0()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r3.c0()
            if (r0 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r0.getType()
            return r3
        Lf:
            r0 = 0
            if (r1 != 0) goto L13
            return r0
        L13:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            if (r2 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r1.getType()
            return r3
        L1c:
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r3.b()
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
            goto L28
        L27:
            r3 = r0
        L28:
            if (r3 == 0) goto L2f
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.s()
            return r3
        L2f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.reflect.Method m(@org.jetbrains.annotations.NotNull java.lang.Class<?> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "unbox-impl"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L15
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.NoSuchMethodException -> L15
            return r0
        L15:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No unbox method found in inline class: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " (calling "
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.util.List<java.lang.reflect.Method> n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r7) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.g2.a(r7)
            java.util.List r0 = o(r0)
            r1 = 0
            if (r0 == 0) goto L7a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.f0.d0(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unbox-impl-"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r2.add(r4)
            goto L21
        L42:
            kotlin.reflect.jvm.internal.impl.types.w1 r7 = r7.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r7 = r7.c()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r7 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r7
            java.lang.Class r7 = kotlin.reflect.jvm.internal.p3.s(r7)
            kotlin.jvm.internal.g0.m(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = kotlin.collections.f0.d0(r2, r3)
            r0.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L65:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Method r3 = r7.getDeclaredMethod(r3, r1)
            r0.add(r3)
            goto L65
        L79:
            return r0
        L7a:
            return r1
    }

    private static final java.util.List<java.lang.String> o(kotlin.reflect.jvm.internal.impl.types.e1 r7) {
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.i(r7)
            if (r0 == 0) goto L91
            kotlin.reflect.jvm.internal.impl.types.w1 r7 = r7.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r7 = r7.c()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r7 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r7
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.t(r7)
            kotlin.jvm.internal.g0.m(r7)
            java.util.List r7 = r7.c()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L2b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r7.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
            java.lang.Object r1 = r1.component2()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            java.util.List r1 = o(r1)
            if (r1 == 0) goto L82
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.getIdentifier()
            r5.append(r6)
            r6 = 45
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.add(r4)
            goto L5a
        L82:
            java.lang.String r1 = r2.getIdentifier()
            java.util.List r3 = kotlin.collections.f0.l(r1)
        L8a:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.collections.f0.s0(r0, r3)
            goto L2b
        L90:
            return r0
        L91:
            r7 = 0
            return r7
    }

    private static final java.util.List<java.lang.reflect.Method> p(kotlin.reflect.jvm.internal.impl.types.e1 r1, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            java.util.List r0 = n(r1)
            if (r0 != 0) goto L19
            java.lang.Class r1 = t(r1)
            if (r1 == 0) goto L17
            java.lang.reflect.Method r1 = m(r1, r2)
            if (r1 == 0) goto L17
            java.util.List r1 = kotlin.collections.f0.l(r1)
            return r1
        L17:
            r1 = 0
            return r1
        L19:
            return r0
    }

    private static final boolean q(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = l(r2)
            r0 = 0
            if (r2 == 0) goto Lf
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.h(r2)
            r1 = 1
            if (r2 != r1) goto Lf
            return r1
        Lf:
            return r0
    }

    private static final java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3, java.lang.reflect.Member r4, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.d, java.lang.Boolean> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r3.f0()
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L17
            r0.add(r1)
            goto L7e
        L17:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            if (r1 == 0) goto L40
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.j r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r4
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r4.J()
            java.lang.String r5 = "getConstructedClass(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            boolean r5 = r4.k()
            if (r5 == 0) goto L7e
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.b()
            java.lang.String r5 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.s()
            r0.add(r4)
            goto L7e
        L40:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r3.b()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto L7e
            java.lang.Object r5 = r5.invoke(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L7e
            if (r4 == 0) goto L75
            boolean r4 = a(r4)
            r5 = 1
            if (r4 != r5) goto L75
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r1.s()
            java.lang.String r5 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.C(r4)
            r0.add(r4)
            goto L7e
        L75:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r1.s()
            r0.add(r4)
        L7e:
            java.util.List r3 = r3.g()
            java.lang.String r4 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L8d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            r0.add(r4)
            goto L8d
        La1:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Class<?> s(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r4) {
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L42
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.b(r4)
            if (r0 == 0) goto L42
            r0 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            java.lang.Class r1 = kotlin.reflect.jvm.internal.p3.s(r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r1 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class object for the class "
            r2.append(r3)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " cannot be found (classId="
            r2.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r4
            kotlin.reflect.jvm.internal.impl.name.b r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.n(r4)
            r2.append(r4)
            r4 = 41
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L42:
            r4 = 0
            return r4
    }

    private static final java.lang.Class<?> t(kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r3.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            java.lang.Class r0 = s(r0)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.j2.l(r3)
            if (r2 != 0) goto L17
            goto L2a
        L17:
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.resolve.j.k(r3)
            if (r3 != 0) goto L1e
            return r1
        L1e:
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.j2.l(r3)
            if (r2 != 0) goto L2b
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.j.t0(r3)
            if (r3 != 0) goto L2b
        L2a:
            return r0
        L2b:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.n(r1)
            kotlin.jvm.internal.g0.m(r1)
            java.lang.String r1 = r1.b()
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(r1)
            return r1
    }
}
