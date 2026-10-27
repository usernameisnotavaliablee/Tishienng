package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKFunctionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n2746#2,3:236\n1761#2,3:240\n1563#2:244\n1634#2,3:245\n1563#2:249\n1634#2,3:250\n1563#2:253\n1634#2,3:254\n1563#2:257\n1634#2,3:258\n183#3:239\n184#3:243\n1#4:248\n*S KotlinDebug\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl\n*L\n157#1:236,3\n164#1:240,3\n72#1:244\n72#1:245,3\n87#1:249\n87#1:250,3\n123#1:253\n123#1:254,3\n128#1:257\n128#1:258,3\n164#1:239\n164#1:243\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m1 extends kotlin.reflect.jvm.internal.e0<java.lang.Object> implements kotlin.jvm.internal.c0<java.lang.Object>, kotlin.reflect.i<java.lang.Object>, kotlin.reflect.jvm.internal.p {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] m = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl g;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String h;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s l;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.m1> r1 = kotlin.reflect.jvm.internal.m1.class
            java.lang.String r2 = "descriptor"
            java.lang.String r3 = "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.m1.m = r1
            return
    }

    public m1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Object r11) {
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.g0.p(r10, r0)
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    private m1(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1, java.lang.String r2, java.lang.String r3, kotlin.reflect.jvm.internal.impl.descriptors.y r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            r0.h = r3
            r0.i = r5
            kotlin.reflect.jvm.internal.j1 r1 = new kotlin.reflect.jvm.internal.j1
            r1.<init>(r0, r2)
            kotlin.reflect.jvm.internal.f3$a r1 = kotlin.reflect.jvm.internal.f3.b(r4, r1)
            r0.j = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.k1 r2 = new kotlin.reflect.jvm.internal.k1
            r2.<init>(r0)
            kotlin.s r2 = kotlin.t.b(r1, r2)
            r0.k = r2
            kotlin.reflect.jvm.internal.l1 r2 = new kotlin.reflect.jvm.internal.l1
            r2.<init>(r0)
            kotlin.s r1 = kotlin.t.b(r1, r2)
            r0.l = r1
            return
    }

    /* synthetic */ m1(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r7, java.lang.String r8, java.lang.String r9, kotlin.reflect.jvm.internal.impl.descriptors.y r10, java.lang.Object r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L6
            java.lang.Object r11 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public m1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r11) {
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r11, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r11.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            kotlin.reflect.jvm.internal.k3 r0 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.r r0 = r0.g(r11)
            java.lang.String r4 = r0.a()
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private static final kotlin.reflect.jvm.internal.calls.g J0(kotlin.reflect.jvm.internal.m1 r11) {
            kotlin.reflect.jvm.internal.k3 r0 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.r r1 = r0.g(r1)
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.r.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L9e
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r11.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.k r5 = r2.b()
            java.lang.String r6 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.j.d(r5)
            if (r5 == 0) goto L4f
            boolean r5 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            if (r5 == 0) goto L4f
            kotlin.reflect.jvm.internal.impl.descriptors.j r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r2
            boolean r2 = r2.m0()
            if (r2 != 0) goto L30
            goto L4f
        L30:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.y r11 = r11.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.k r11 = r11.b()
            r1.append(r11)
            java.lang.String r11 = " cannot have default arguments"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L4f:
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r11.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r11.N0(r2)
            if (r2 == 0) goto L76
            kotlin.reflect.jvm.internal.r r0 = r0.g(r2)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.r$e r0 = (kotlin.reflect.jvm.internal.r.e) r0
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r11.X()
            java.lang.String r2 = r0.c()
            java.lang.String r0 = r0.b()
            java.lang.reflect.Method r0 = r1.H(r2, r0, r4)
            goto L13a
        L76:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r11.X()
            kotlin.reflect.jvm.internal.r$e r1 = (kotlin.reflect.jvm.internal.r.e) r1
            java.lang.String r2 = r1.c()
            java.lang.String r1 = r1.b()
            kotlin.reflect.jvm.internal.calls.g r5 = r11.W()
            java.lang.reflect.Member r5 = r5.c()
            kotlin.jvm.internal.g0.m(r5)
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            r5 = r5 ^ r4
            java.lang.reflect.Method r0 = r0.H(r2, r1, r5)
            goto L13a
        L9e:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.r.d
            r2 = 10
            if (r0 == 0) goto Lf9
            boolean r0 = r11.b0()
            if (r0 == 0) goto Lea
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r11.X()
            java.lang.Class r4 = r0.c()
            java.util.List r11 = r11.getParameters()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = kotlin.collections.f0.d0(r11, r2)
            r5.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        Lc5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r11.next()
            kotlin.reflect.KParameter r0 = (kotlin.reflect.KParameter) r0
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.g0.m(r0)
            r5.add(r0)
            goto Lc5
        Ldc:
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r6 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r7 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r3 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
            r8 = 0
            r9 = 16
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        Lea:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r11.X()
            kotlin.reflect.jvm.internal.r$d r1 = (kotlin.reflect.jvm.internal.r.d) r1
            java.lang.String r1 = r1.b()
            java.lang.reflect.Constructor r0 = r0.G(r1)
            goto L13a
        Lf9:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.r.a
            if (r0 == 0) goto L139
            kotlin.reflect.jvm.internal.r$a r1 = (kotlin.reflect.jvm.internal.r.a) r1
            java.util.List r8 = r1.d()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r11 = r11.X()
            java.lang.Class r4 = r11.c()
            r11 = r8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = kotlin.collections.f0.d0(r11, r2)
            r5.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L11b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L12f
            java.lang.Object r0 = r11.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r0 = r0.getName()
            r5.add(r0)
            goto L11b
        L12f:
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r6 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r7 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r3 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L139:
            r0 = r3
        L13a:
            boolean r1 = r0 instanceof java.lang.reflect.Constructor
            if (r1 == 0) goto L149
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.calls.h r0 = r11.i0(r0, r1, r4)
            goto L18b
        L149:
            boolean r1 = r0 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L18a
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.p3.l()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r1.b(r2)
            if (r1 == 0) goto L17b
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            boolean r1 = r1.l0()
            if (r1 != 0) goto L17b
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            kotlin.reflect.jvm.internal.calls.h$h r0 = r11.k0(r0)
            goto L18b
        L17b:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            kotlin.reflect.jvm.internal.calls.g r1 = r11.W()
            boolean r1 = r1.a()
            kotlin.reflect.jvm.internal.calls.g r0 = r11.l0(r0, r1)
            goto L18b
        L18a:
            r0 = r3
        L18b:
            if (r0 == 0) goto L196
            kotlin.reflect.jvm.internal.impl.descriptors.y r11 = r11.M0()
            kotlin.reflect.jvm.internal.calls.g r11 = kotlin.reflect.jvm.internal.calls.n.i(r0, r11, r4)
            return r11
        L196:
            return r3
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.y K0(kotlin.reflect.jvm.internal.m1 r1, java.lang.String r2) {
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r1.X()
            java.lang.String r1 = r1.h
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r0.I(r2, r1)
            return r1
    }

    private final java.lang.Object L0() {
            r2 = this;
            java.lang.Object r0 = r2.i
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r2.M0()
            java.lang.Object r0 = kotlin.reflect.jvm.internal.calls.n.h(r0, r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.y N0(kotlin.reflect.jvm.internal.impl.descriptors.y r6) {
            r5 = this;
            java.util.List r0 = r6.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L1a
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1a
            goto L32
        L1a:
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            boolean r2 = r2.Q()
            if (r2 == 0) goto L1e
            goto La2
        L32:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r6.b()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r0)
            if (r0 == 0) goto La2
            kotlin.reflect.jvm.internal.calls.g r0 = r5.W()
            java.lang.reflect.Member r0 = r0.c()
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto La2
            r0 = 0
            kotlin.sequences.m r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.z(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r6.next()
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            java.util.List r2 = r2.g()
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L83
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L83
            goto L5f
        L83:
            java.util.Iterator r2 = r2.iterator()
        L87:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            boolean r4 = r4.Q()
            if (r4 == 0) goto L87
            goto L9b
        L9a:
            r0 = r3
        L9b:
            boolean r6 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r6 == 0) goto La2
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            return r0
        La2:
            return r3
    }

    private final boolean O0(java.lang.reflect.Method r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r2.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.c0()
            if (r0 == 0) goto L2f
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            if (r0 == 0) goto L2f
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.c(r0)
            r1 = 1
            if (r0 != r1) goto L2f
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.lang.String r0 = "getParameterTypes(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.lang.Object r3 = kotlin.collections.n.Fc(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L2f
            boolean r3 = r3.isInterface()
            if (r3 != r1) goto L2f
            return r1
        L2f:
            r3 = 0
            return r3
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y e0(kotlin.reflect.jvm.internal.m1 r0, java.lang.String r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = K0(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.calls.g f0(kotlin.reflect.jvm.internal.m1 r0) {
            kotlin.reflect.jvm.internal.calls.g r0 = h0(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.calls.g g0(kotlin.reflect.jvm.internal.m1 r0) {
            kotlin.reflect.jvm.internal.calls.g r0 = J0(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.calls.g h0(kotlin.reflect.jvm.internal.m1 r11) {
            kotlin.reflect.jvm.internal.k3 r0 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.r r0 = r0.g(r1)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.r.d
            r2 = 10
            if (r1 == 0) goto L66
            boolean r1 = r11.b0()
            if (r1 == 0) goto L56
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r11.X()
            java.lang.Class r4 = r0.c()
            java.util.List r11 = r11.getParameters()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = kotlin.collections.f0.d0(r11, r2)
            r5.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L31:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r11.next()
            kotlin.reflect.KParameter r0 = (kotlin.reflect.KParameter) r0
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.g0.m(r0)
            r5.add(r0)
            goto L31
        L48:
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r6 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r7 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r3 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
            r8 = 0
            r9 = 16
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L56:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r11.X()
            kotlin.reflect.jvm.internal.r$d r0 = (kotlin.reflect.jvm.internal.r.d) r0
            java.lang.String r0 = r0.b()
            java.lang.reflect.Constructor r0 = r1.F(r0)
            goto Lda
        L66:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.r.e
            if (r1 == 0) goto Lbd
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r1.b()
            java.lang.String r3 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.d(r2)
            if (r2 == 0) goto Laa
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            if (r2 == 0) goto Laa
            kotlin.reflect.jvm.internal.impl.descriptors.j r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r1
            boolean r1 = r1.m0()
            if (r1 == 0) goto Laa
            kotlin.reflect.jvm.internal.calls.m$b r1 = new kotlin.reflect.jvm.internal.calls.m$b
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r11.M0()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r3 = r11.X()
            kotlin.reflect.jvm.internal.r$e r0 = (kotlin.reflect.jvm.internal.r.e) r0
            java.lang.String r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.y r11 = r11.M0()
            java.util.List r11 = r11.g()
            java.lang.String r4 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r11, r4)
            r1.<init>(r2, r3, r0, r11)
            return r1
        Laa:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r11.X()
            kotlin.reflect.jvm.internal.r$e r0 = (kotlin.reflect.jvm.internal.r.e) r0
            java.lang.String r2 = r0.c()
            java.lang.String r0 = r0.b()
            java.lang.reflect.Method r0 = r1.K(r2, r0)
            goto Lda
        Lbd:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.r.c
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.reflect.Member"
            if (r1 == 0) goto Lcd
            kotlin.reflect.jvm.internal.r$c r0 = (kotlin.reflect.jvm.internal.r.c) r0
            java.lang.reflect.Method r0 = r0.b()
            kotlin.jvm.internal.g0.n(r0, r3)
            goto Lda
        Lcd:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.r.b
            if (r1 == 0) goto L14d
            kotlin.reflect.jvm.internal.r$b r0 = (kotlin.reflect.jvm.internal.r.b) r0
            java.lang.reflect.Constructor r0 = r0.d()
            kotlin.jvm.internal.g0.n(r0, r3)
        Lda:
            boolean r1 = r0 instanceof java.lang.reflect.Constructor
            r2 = 0
            if (r1 == 0) goto Lea
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.calls.h r0 = r11.i0(r0, r1, r2)
            goto L11a
        Lea:
            boolean r1 = r0 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L125
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto Lff
            kotlin.reflect.jvm.internal.calls.h$h r0 = r11.j0(r0)
            goto L11a
        Lff:
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r11.M0()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.p3.l()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r1.b(r3)
            if (r1 == 0) goto L116
            kotlin.reflect.jvm.internal.calls.h$h r0 = r11.k0(r0)
            goto L11a
        L116:
            kotlin.reflect.jvm.internal.calls.g r0 = r11.l0(r0, r2)
        L11a:
            kotlin.reflect.jvm.internal.impl.descriptors.y r11 = r11.M0()
            r1 = 2
            r3 = 0
            kotlin.reflect.jvm.internal.calls.g r11 = kotlin.reflect.jvm.internal.calls.n.j(r0, r11, r2, r1, r3)
            return r11
        L125:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r1 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not compute caller for function: "
            r2.append(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.y r11 = r11.M0()
            r2.append(r11)
            java.lang.String r11 = " (member = "
            r2.append(r11)
            r2.append(r0)
            r11 = 41
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r1.<init>(r11)
            throw r1
        L14d:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.r.a
            if (r1 == 0) goto L18d
            kotlin.reflect.jvm.internal.r$a r0 = (kotlin.reflect.jvm.internal.r.a) r0
            java.util.List r8 = r0.d()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r11 = r11.X()
            java.lang.Class r4 = r11.c()
            r11 = r8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = kotlin.collections.f0.d0(r11, r2)
            r5.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L16f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L183
            java.lang.Object r0 = r11.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r0 = r0.getName()
            r5.add(r0)
            goto L16f
        L183:
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r6 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r7 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r3 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L18d:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
    }

    private final kotlin.reflect.jvm.internal.calls.h<java.lang.reflect.Constructor<?>> i0(java.lang.reflect.Constructor<?> r1, kotlin.reflect.jvm.internal.impl.descriptors.y r2, boolean r3) {
            r0 = this;
            if (r3 != 0) goto L1e
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.b.f(r2)
            if (r2 == 0) goto L1e
            boolean r2 = r0.c0()
            if (r2 == 0) goto L18
            kotlin.reflect.jvm.internal.calls.h$a r2 = new kotlin.reflect.jvm.internal.calls.h$a
            java.lang.Object r3 = r0.L0()
            r2.<init>(r1, r3)
            return r2
        L18:
            kotlin.reflect.jvm.internal.calls.h$b r2 = new kotlin.reflect.jvm.internal.calls.h$b
            r2.<init>(r1)
            return r2
        L1e:
            boolean r2 = r0.c0()
            if (r2 == 0) goto L2e
            kotlin.reflect.jvm.internal.calls.h$c r2 = new kotlin.reflect.jvm.internal.calls.h$c
            java.lang.Object r3 = r0.L0()
            r2.<init>(r1, r3)
            return r2
        L2e:
            kotlin.reflect.jvm.internal.calls.h$e r2 = new kotlin.reflect.jvm.internal.calls.h$e
            r2.<init>(r1)
            return r2
    }

    private final kotlin.reflect.jvm.internal.calls.h.AbstractC0025h j0(java.lang.reflect.Method r3) {
            r2 = this;
            boolean r0 = r2.c0()
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.calls.h$h$a r0 = new kotlin.reflect.jvm.internal.calls.h$h$a
            java.lang.Object r1 = r2.L0()
            r0.<init>(r3, r1)
            return r0
        L10:
            kotlin.reflect.jvm.internal.calls.h$h$e r0 = new kotlin.reflect.jvm.internal.calls.h$h$e
            r0.<init>(r3)
            return r0
    }

    private final kotlin.reflect.jvm.internal.calls.h.AbstractC0025h k0(java.lang.reflect.Method r2) {
            r1 = this;
            boolean r0 = r1.c0()
            if (r0 == 0) goto Lc
            kotlin.reflect.jvm.internal.calls.h$h$b r0 = new kotlin.reflect.jvm.internal.calls.h$h$b
            r0.<init>(r2)
            return r0
        Lc:
            kotlin.reflect.jvm.internal.calls.h$h$f r0 = new kotlin.reflect.jvm.internal.calls.h$h$f
            r0.<init>(r2)
            return r0
    }

    private final kotlin.reflect.jvm.internal.calls.g<?> l0(java.lang.reflect.Method r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.c0()
            if (r0 == 0) goto L19
            kotlin.reflect.jvm.internal.calls.h$h$c r0 = new kotlin.reflect.jvm.internal.calls.h$h$c
            boolean r1 = r2.O0(r3)
            if (r1 == 0) goto L11
            java.lang.Object r1 = r2.i
            goto L15
        L11:
            java.lang.Object r1 = r2.L0()
        L15:
            r0.<init>(r3, r4, r1)
            return r0
        L19:
            kotlin.reflect.jvm.internal.calls.h$h$g r4 = new kotlin.reflect.jvm.internal.calls.h$h$g
            r4.<init>(r3)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object A0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
            r2 = this;
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object B0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
            r2 = this;
            r0 = 15
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object C0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
            r2 = this;
            r0 = 16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object D0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
            r2 = this;
            r0 = 17
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object E0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            r2 = this;
            r0 = 18
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object F0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
            r2 = this;
            r0 = 19
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object G0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r2 = this;
            r0 = 20
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            r3 = 19
            r0[r3] = r22
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object H0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
            r2 = this;
            r0 = 21
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            r3 = 19
            r0[r3] = r22
            r3 = 20
            r0[r3] = r23
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object I0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
            r2 = this;
            r0 = 22
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            r3 = 13
            r0[r3] = r16
            r3 = 14
            r0[r3] = r17
            r3 = 15
            r0[r3] = r18
            r3 = 16
            r0[r3] = r19
            r3 = 17
            r0[r3] = r20
            r3 = 18
            r0[r3] = r21
            r3 = 19
            r0[r3] = r22
            r3 = 20
            r0[r3] = r23
            r3 = 21
            r0[r3] = r24
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y M0() {
            r3 = this;
            kotlin.reflect.jvm.internal.f3$a r0 = r3.j
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.m1.m
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.b(r3, r1)
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.e0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.calls.g<?> W() {
            r1 = this;
            kotlin.s r0 = r1.k
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.calls.g r0 = (kotlin.reflect.jvm.internal.calls.g) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.e0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.KDeclarationContainerImpl X() {
            r1 = this;
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.e0
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.calls.g<?> Y() {
            r1 = this;
            kotlin.s r0 = r1.l
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.calls.g r0 = (kotlin.reflect.jvm.internal.calls.g) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.e0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor Z() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.M0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.e0
    public boolean c0() {
            r2 = this;
            java.lang.Object r0 = r2.i
            java.lang.Object r1 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.m1 r4 = kotlin.reflect.jvm.internal.p3.c(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r3.X()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2 = r4.X()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L3a
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = r4.getName()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L3a
            java.lang.String r1 = r3.h
            java.lang.String r2 = r4.h
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.i
            java.lang.Object r4 = r4.i
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 == 0) goto L3a
            r4 = 1
            return r4
        L3a:
            return r0
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
            r1 = this;
            kotlin.reflect.jvm.internal.calls.g r0 = r1.W()
            int r0 = kotlin.reflect.jvm.internal.calls.i.a(r0)
            return r0
    }

    @Override // kotlin.reflect.c
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r2.M0()
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r2.X()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.h
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke() {
            r1 = this;
            java.lang.Object r0 = r1.m0()
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.n0(r1)
            return r1
    }

    @Override // kotlin.jvm.functions.Function2
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r0.o0(r1, r2)
            return r1
    }

    @Override // kotlin.jvm.functions.Function3
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = r0.p0(r1, r2, r3)
            return r1
    }

    @Override // kotlin.jvm.functions.Function4
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r0 = this;
            java.lang.Object r1 = r0.q0(r1, r2, r3, r4)
            return r1
    }

    @Override // kotlin.jvm.functions.Function5
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r0 = this;
            java.lang.Object r1 = r0.r0(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // kotlin.jvm.functions.Function6
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r0 = this;
            java.lang.Object r1 = r0.s0(r1, r2, r3, r4, r5, r6)
            return r1
    }

    @Override // kotlin.jvm.functions.Function7
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7) {
            r0 = this;
            java.lang.Object r1 = r0.t0(r1, r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // kotlin.jvm.functions.Function8
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r0 = this;
            java.lang.Object r1 = r0.u0(r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // kotlin.jvm.functions.Function9
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9) {
            r0 = this;
            java.lang.Object r1 = r0.v0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @Override // kotlin.jvm.functions.Function10
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10) {
            r0 = this;
            java.lang.Object r1 = r0.w0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    @Override // kotlin.jvm.functions.Function11
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11) {
            r0 = this;
            java.lang.Object r1 = r0.x0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
    }

    @Override // kotlin.jvm.functions.Function12
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12) {
            r0 = this;
            java.lang.Object r1 = r0.y0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    @Override // kotlin.jvm.functions.Function13
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13) {
            r0 = this;
            java.lang.Object r1 = r0.z0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
    }

    @Override // kotlin.jvm.functions.Function14
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14) {
            r0 = this;
            java.lang.Object r1 = r0.A0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    @Override // kotlin.jvm.functions.Function15
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15) {
            r0 = this;
            java.lang.Object r1 = r0.B0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
    }

    @Override // kotlin.jvm.functions.Function16
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15, @org.jetbrains.annotations.Nullable java.lang.Object r16) {
            r0 = this;
            java.lang.Object r1 = r0.C0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
    }

    @Override // kotlin.jvm.functions.Function17
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15, @org.jetbrains.annotations.Nullable java.lang.Object r16, @org.jetbrains.annotations.Nullable java.lang.Object r17) {
            r0 = this;
            java.lang.Object r1 = r0.D0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
    }

    @Override // kotlin.jvm.functions.Function18
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15, @org.jetbrains.annotations.Nullable java.lang.Object r16, @org.jetbrains.annotations.Nullable java.lang.Object r17, @org.jetbrains.annotations.Nullable java.lang.Object r18) {
            r0 = this;
            java.lang.Object r1 = r0.E0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
    }

    @Override // kotlin.jvm.functions.Function19
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15, @org.jetbrains.annotations.Nullable java.lang.Object r16, @org.jetbrains.annotations.Nullable java.lang.Object r17, @org.jetbrains.annotations.Nullable java.lang.Object r18, @org.jetbrains.annotations.Nullable java.lang.Object r19) {
            r0 = this;
            java.lang.Object r1 = r0.F0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
    }

    @Override // kotlin.jvm.functions.Function20
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15, @org.jetbrains.annotations.Nullable java.lang.Object r16, @org.jetbrains.annotations.Nullable java.lang.Object r17, @org.jetbrains.annotations.Nullable java.lang.Object r18, @org.jetbrains.annotations.Nullable java.lang.Object r19, @org.jetbrains.annotations.Nullable java.lang.Object r20) {
            r0 = this;
            java.lang.Object r1 = r0.G0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
    }

    @Override // kotlin.jvm.functions.Function21
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15, @org.jetbrains.annotations.Nullable java.lang.Object r16, @org.jetbrains.annotations.Nullable java.lang.Object r17, @org.jetbrains.annotations.Nullable java.lang.Object r18, @org.jetbrains.annotations.Nullable java.lang.Object r19, @org.jetbrains.annotations.Nullable java.lang.Object r20, @org.jetbrains.annotations.Nullable java.lang.Object r21) {
            r0 = this;
            java.lang.Object r1 = r0.H0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
    }

    @Override // kotlin.jvm.functions.Function22
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.Nullable java.lang.Object r14, @org.jetbrains.annotations.Nullable java.lang.Object r15, @org.jetbrains.annotations.Nullable java.lang.Object r16, @org.jetbrains.annotations.Nullable java.lang.Object r17, @org.jetbrains.annotations.Nullable java.lang.Object r18, @org.jetbrains.annotations.Nullable java.lang.Object r19, @org.jetbrains.annotations.Nullable java.lang.Object r20, @org.jetbrains.annotations.Nullable java.lang.Object r21, @org.jetbrains.annotations.Nullable java.lang.Object r22) {
            r0 = this;
            java.lang.Object r1 = r0.I0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
    }

    @Override // kotlin.reflect.i
    public boolean isExternal() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.M0()
            boolean r0 = r0.isExternal()
            return r0
    }

    @Override // kotlin.reflect.i
    public boolean isInfix() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.M0()
            boolean r0 = r0.isInfix()
            return r0
    }

    @Override // kotlin.reflect.i
    public boolean isInline() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.M0()
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // kotlin.reflect.i
    public boolean isOperator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.M0()
            boolean r0 = r0.isOperator()
            return r0
    }

    @Override // kotlin.reflect.c
    public boolean isSuspend() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.M0()
            boolean r0 = r0.isSuspend()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object m0() {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = r1.call(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object n0(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object o0(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object p0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object q0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r2 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object r0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r2 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object s0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
            r2 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object t0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r2 = this;
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.jvm.internal.j3 r0 = kotlin.reflect.jvm.internal.j3.a
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r2.M0()
            java.lang.String r0 = r0.f(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object u0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            r2 = this;
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object v0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r2 = this;
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object w0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r2 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object x0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r2 = this;
            r0 = 11
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object y0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            r2 = this;
            r0 = 12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            java.lang.Object r3 = r2.call(r0)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object z0(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r2 = this;
            r0 = 13
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            r3 = 4
            r0[r3] = r7
            r3 = 5
            r0[r3] = r8
            r3 = 6
            r0[r3] = r9
            r3 = 7
            r0[r3] = r10
            r3 = 8
            r0[r3] = r11
            r3 = 9
            r0[r3] = r12
            r3 = 10
            r0[r3] = r13
            r3 = 11
            r0[r3] = r14
            r3 = 12
            r0[r3] = r15
            java.lang.Object r3 = r2.call(r0)
            return r3
    }
}
