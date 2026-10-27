package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,276:1\n230#2,5:277\n230#2,5:282\n230#2,5:287\n230#2,5:292\n230#2,2:302\n232#2,3:308\n1#3:297\n1563#4:298\n1634#4,3:299\n1011#4,2:311\n1563#4:313\n1634#4,3:314\n1788#4,4:317\n1869#4,2:321\n1761#4,3:323\n37#5:304\n36#5,3:305\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n107#1:277,5\n158#1:282,5\n206#1:287,5\n214#1:292,5\n248#1:302,2\n248#1:308,3\n234#1:298\n234#1:299,3\n65#1:311,2\n85#1:313\n85#1:314,3\n124#1:317,4\n132#1:321,2\n220#1:323,3\n249#1:304\n249#1:305,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e0<R> implements kotlin.reflect.c<R>, kotlin.reflect.jvm.internal.c3 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a<java.util.List<java.lang.annotation.Annotation>> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a<java.util.ArrayList<kotlin.reflect.KParameter>> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a<kotlin.reflect.jvm.internal.z2> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a<java.util.List<kotlin.reflect.jvm.internal.b3>> d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a<java.lang.Object[]> e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<java.lang.Boolean> f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n1#1,328:1\n65#2:329\n*E\n"})
    public static final class a<T> implements java.util.Comparator {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                kotlin.reflect.KParameter r1 = (kotlin.reflect.KParameter) r1
                java.lang.String r1 = r1.getName()
                kotlin.reflect.KParameter r2 = (kotlin.reflect.KParameter) r2
                java.lang.String r2 = r2.getName()
                int r1 = kotlin.comparisons.a.l(r1, r2)
                return r1
        }
    }

    public e0() {
            r2 = this;
            r2.<init>()
            kotlin.reflect.jvm.internal.u r0 = new kotlin.reflect.jvm.internal.u
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.f3$a r0 = kotlin.reflect.jvm.internal.f3.c(r0)
            java.lang.String r1 = "lazySoft(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.a = r0
            kotlin.reflect.jvm.internal.v r0 = new kotlin.reflect.jvm.internal.v
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.f3$a r0 = kotlin.reflect.jvm.internal.f3.c(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.b = r0
            kotlin.reflect.jvm.internal.w r0 = new kotlin.reflect.jvm.internal.w
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.f3$a r0 = kotlin.reflect.jvm.internal.f3.c(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.c = r0
            kotlin.reflect.jvm.internal.x r0 = new kotlin.reflect.jvm.internal.x
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.f3$a r0 = kotlin.reflect.jvm.internal.f3.c(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.d = r0
            kotlin.reflect.jvm.internal.y r0 = new kotlin.reflect.jvm.internal.y
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.f3$a r0 = kotlin.reflect.jvm.internal.f3.c(r0)
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.e = r0
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.z r1 = new kotlin.reflect.jvm.internal.z
            r1.<init>(r2)
            kotlin.s r0 = kotlin.t.b(r0, r1)
            r2.f = r0
            return
    }

    private static final kotlin.reflect.jvm.internal.z2 E(kotlin.reflect.jvm.internal.e0 r3) {
            kotlin.reflect.jvm.internal.z2 r0 = new kotlin.reflect.jvm.internal.z2
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r3.Z()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getReturnType()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.d0 r2 = new kotlin.reflect.jvm.internal.d0
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.lang.reflect.Type F(kotlin.reflect.jvm.internal.e0 r1) {
            java.lang.reflect.Type r0 = r1.U()
            if (r0 != 0) goto Lf
            kotlin.reflect.jvm.internal.calls.g r1 = r1.W()
            java.lang.reflect.Type r1 = r1.getReturnType()
            return r1
        Lf:
            return r0
    }

    private static final java.util.List G(kotlin.reflect.jvm.internal.e0 r4) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r4.Z()
            java.util.List r0 = r0.getTypeParameters()
            java.lang.String r1 = "getTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            kotlin.reflect.jvm.internal.b3 r3 = new kotlin.reflect.jvm.internal.b3
            kotlin.jvm.internal.g0.m(r2)
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L1e
        L36:
            return r1
    }

    static /* synthetic */ java.util.List H(kotlin.reflect.jvm.internal.e0 r0) {
            java.util.List r0 = j(r0)
            return r0
    }

    static /* synthetic */ java.util.ArrayList I(kotlin.reflect.jvm.internal.e0 r0) {
            java.util.ArrayList r0 = l(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.z2 J(kotlin.reflect.jvm.internal.e0 r0) {
            kotlin.reflect.jvm.internal.z2 r0 = E(r0)
            return r0
    }

    static /* synthetic */ java.util.List K(kotlin.reflect.jvm.internal.e0 r0) {
            java.util.List r0 = G(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object[] L(kotlin.reflect.jvm.internal.e0 r0) {
            java.lang.Object[] r0 = d(r0)
            return r0
    }

    static /* synthetic */ boolean M(kotlin.reflect.jvm.internal.e0 r0) {
            boolean r0 = d0(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.t0 N(kotlin.reflect.jvm.internal.impl.descriptors.z0 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.t0 O(kotlin.reflect.jvm.internal.impl.descriptors.z0 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = s(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.t0 P(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0, int r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = t(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.reflect.Type Q(kotlin.reflect.jvm.internal.e0 r0) {
            java.lang.reflect.Type r0 = F(r0)
            return r0
    }

    private final R R(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r5) {
            r4 = this;
            java.util.List r0 = r4.getParameters()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r0.next()
            kotlin.reflect.KParameter r2 = (kotlin.reflect.KParameter) r2
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r5.get(r2)
            if (r3 == 0) goto L2e
            goto L60
        L2e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Annotation argument value cannot be null ("
            r0.append(r1)
            r0.append(r2)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L4a:
            boolean r3 = r2.p()
            if (r3 == 0) goto L52
            r3 = 0
            goto L60
        L52:
            boolean r3 = r2.a()
            if (r3 == 0) goto L64
            kotlin.reflect.r r2 = r2.getType()
            java.lang.Object r3 = r4.T(r2)
        L60:
            r1.add(r3)
            goto L15
        L64:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No argument provided for a required parameter: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L7b:
            kotlin.reflect.jvm.internal.calls.g r5 = r4.Y()
            if (r5 == 0) goto L94
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.IllegalAccessException -> L8d
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.IllegalAccessException -> L8d
            java.lang.Object r5 = r5.call(r0)     // Catch: java.lang.IllegalAccessException -> L8d
            return r5
        L8d:
            r5 = move-exception
            kotlin.reflect.full.IllegalCallableAccessException r0 = new kotlin.reflect.full.IllegalCallableAccessException
            r0.<init>(r5)
            throw r0
        L94:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r5 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "This callable does not support a default call: "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r4.Z()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    private final java.lang.Object T(kotlin.reflect.r r4) {
            r3 = this;
            kotlin.reflect.d r4 = kotlin.reflect.jvm.c.b(r4)
            java.lang.Class r4 = k3.a.e(r4)
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L1d
            java.lang.Class r4 = r4.getComponentType()
            r0 = 0
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.String r0 = "run(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
        L1d:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot instantiate the default empty array of type "
            r1.append(r2)
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            java.lang.String r4 = ", because it is not an array type"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private final java.lang.reflect.Type U() {
            r4 = this;
            boolean r0 = r4.isSuspend()
            r1 = 0
            if (r0 == 0) goto L4f
            kotlin.reflect.jvm.internal.calls.g r0 = r4.W()
            java.util.List r0 = r0.b()
            java.lang.Object r0 = kotlin.collections.f0.A3(r0)
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L1a
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L22
            java.lang.reflect.Type r2 = r0.getRawType()
            goto L23
        L22:
            r2 = r1
        L23:
            java.lang.Class<kotlin.coroutines.e> r3 = kotlin.coroutines.e.class
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L4f
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            java.lang.String r2 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.Object r0 = kotlin.collections.n.At(r0)
            boolean r2 = r0 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto L3f
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            goto L40
        L3f:
            r0 = r1
        L40:
            if (r0 == 0) goto L4f
            java.lang.reflect.Type[] r0 = r0.getLowerBounds()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = kotlin.collections.n.jc(r0)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
        L4f:
            return r1
    }

    private final java.lang.Object[] V() {
            r1 = this;
            kotlin.reflect.jvm.internal.f3$a<java.lang.Object[]> r0 = r1.e
            java.lang.Object r0 = r0.invoke()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    private final int a0(kotlin.reflect.KParameter r2) {
            r1 = this;
            kotlin.s<java.lang.Boolean> r0 = r1.f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L39
            kotlin.reflect.r r0 = r2.getType()
            boolean r0 = kotlin.reflect.jvm.internal.p3.m(r0)
            if (r0 == 0) goto L37
            kotlin.reflect.r r2 = r2.getType()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            kotlin.jvm.internal.g0.n(r2, r0)
            kotlin.reflect.jvm.internal.z2 r2 = (kotlin.reflect.jvm.internal.z2) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = kotlin.reflect.jvm.internal.impl.types.g2.a(r2)
            java.util.List r2 = kotlin.reflect.jvm.internal.calls.n.n(r2)
            kotlin.jvm.internal.g0.m(r2)
            int r2 = r2.size()
            return r2
        L37:
            r2 = 1
            return r2
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Check if parametersNeedMFVCFlattening is true before"
            r2.<init>(r0)
            throw r2
    }

    private static final java.lang.Object[] d(kotlin.reflect.jvm.internal.e0 r8) {
            java.util.List r0 = r8.getParameters()
            int r1 = r0.size()
            boolean r2 = r8.isSuspend()
            int r1 = r1 + r2
            kotlin.s<java.lang.Boolean> r2 = r8.f
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L40
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L24:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r2.next()
            kotlin.reflect.KParameter r5 = (kotlin.reflect.KParameter) r5
            kotlin.reflect.KParameter$Kind r6 = r5.h()
            kotlin.reflect.KParameter$Kind r7 = kotlin.reflect.KParameter.Kind.VALUE
            if (r6 != r7) goto L3d
            int r5 = r8.a0(r5)
            goto L3e
        L3d:
            r5 = 0
        L3e:
            int r4 = r4 + r5
            goto L24
        L40:
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L52
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L52
            r4 = 0
            goto L73
        L52:
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L57:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r2.next()
            kotlin.reflect.KParameter r5 = (kotlin.reflect.KParameter) r5
            kotlin.reflect.KParameter$Kind r5 = r5.h()
            kotlin.reflect.KParameter$Kind r6 = kotlin.reflect.KParameter.Kind.VALUE
            if (r5 != r6) goto L57
            int r4 = r4 + 1
            if (r4 >= 0) goto L57
            kotlin.collections.f0.a0()
            goto L57
        L73:
            int r4 = r4 + 31
            int r4 = r4 / 32
            int r2 = r1 + r4
            int r2 = r2 + 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L83:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lc7
            java.lang.Object r5 = r0.next()
            kotlin.reflect.KParameter r5 = (kotlin.reflect.KParameter) r5
            boolean r6 = r5.p()
            if (r6 == 0) goto Lb2
            kotlin.reflect.r r6 = r5.getType()
            boolean r6 = kotlin.reflect.jvm.internal.p3.n(r6)
            if (r6 != 0) goto Lb2
            int r6 = r5.getIndex()
            kotlin.reflect.r r5 = r5.getType()
            java.lang.reflect.Type r5 = kotlin.reflect.jvm.d.i(r5)
            java.lang.Object r5 = kotlin.reflect.jvm.internal.p3.g(r5)
            r2[r6] = r5
            goto L83
        Lb2:
            boolean r6 = r5.a()
            if (r6 == 0) goto L83
            int r6 = r5.getIndex()
            kotlin.reflect.r r5 = r5.getType()
            java.lang.Object r5 = r8.T(r5)
            r2[r6] = r5
            goto L83
        Lc7:
            r8 = 0
        Lc8:
            if (r8 >= r4) goto Ld5
            int r0 = r1 + r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2[r0] = r5
            int r8 = r8 + 1
            goto Lc8
        Ld5:
            return r2
    }

    private static final boolean d0(kotlin.reflect.jvm.internal.e0 r2) {
            java.util.List r2 = r2.getParameters()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r0 = r2 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            return r1
        L15:
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.next()
            kotlin.reflect.KParameter r0 = (kotlin.reflect.KParameter) r0
            kotlin.reflect.r r0 = r0.getType()
            boolean r0 = kotlin.reflect.jvm.internal.p3.m(r0)
            if (r0 == 0) goto L19
            r2 = 1
            return r2
        L31:
            return r1
    }

    private static final java.util.List j(kotlin.reflect.jvm.internal.e0 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r0.Z()
            java.util.List r0 = kotlin.reflect.jvm.internal.p3.e(r0)
            return r0
    }

    private static final java.util.ArrayList l(kotlin.reflect.jvm.internal.e0 r10) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r10.Z()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r10.c0()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = kotlin.reflect.jvm.internal.p3.k(r0)
            if (r2 == 0) goto L28
            kotlin.reflect.jvm.internal.d2 r5 = new kotlin.reflect.jvm.internal.d2
            kotlin.reflect.KParameter$Kind r6 = kotlin.reflect.KParameter.Kind.INSTANCE
            kotlin.reflect.jvm.internal.a0 r7 = new kotlin.reflect.jvm.internal.a0
            r7.<init>(r2)
            r5.<init>(r10, r4, r6, r7)
            r1.add(r5)
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r5 = r0.f0()
            if (r5 == 0) goto L43
            kotlin.reflect.jvm.internal.d2 r6 = new kotlin.reflect.jvm.internal.d2
            int r7 = r2 + 1
            kotlin.reflect.KParameter$Kind r8 = kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER
            kotlin.reflect.jvm.internal.b0 r9 = new kotlin.reflect.jvm.internal.b0
            r9.<init>(r5)
            r6.<init>(r10, r2, r8, r9)
            r1.add(r6)
            r2 = r7
            goto L43
        L42:
            r2 = 0
        L43:
            java.util.List r5 = r0.g()
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
        L4d:
            if (r4 >= r5) goto L64
            kotlin.reflect.jvm.internal.d2 r6 = new kotlin.reflect.jvm.internal.d2
            int r7 = r2 + 1
            kotlin.reflect.KParameter$Kind r8 = kotlin.reflect.KParameter.Kind.VALUE
            kotlin.reflect.jvm.internal.c0 r9 = new kotlin.reflect.jvm.internal.c0
            r9.<init>(r0, r4)
            r6.<init>(r10, r2, r8, r9)
            r1.add(r6)
            int r4 = r4 + 1
            r2 = r7
            goto L4d
        L64:
            boolean r10 = r10.b0()
            if (r10 == 0) goto L7c
            boolean r10 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
            if (r10 == 0) goto L7c
            int r10 = r1.size()
            if (r10 <= r3) goto L7c
            kotlin.reflect.jvm.internal.e0$a r10 = new kotlin.reflect.jvm.internal.e0$a
            r10.<init>()
            kotlin.collections.f0.r0(r1, r10)
        L7c:
            r1.trimToSize()
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.t0 r(kotlin.reflect.jvm.internal.impl.descriptors.z0 r0) {
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.t0 s(kotlin.reflect.jvm.internal.impl.descriptors.z0 r0) {
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.t0 t(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0, int r1) {
            java.util.List r0 = r0.g()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.t0) r0
            return r0
    }

    public final R S(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r14, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<?> r15) {
            r13 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.util.List r0 = r13.getParameters()
            boolean r1 = r0.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            kotlin.reflect.jvm.internal.calls.g r14 = r13.W()     // Catch: java.lang.IllegalAccessException -> L27
            boolean r0 = r13.isSuspend()     // Catch: java.lang.IllegalAccessException -> L27
            if (r0 == 0) goto L20
            kotlin.coroutines.e[] r0 = new kotlin.coroutines.e[r3]     // Catch: java.lang.IllegalAccessException -> L27
            r0[r2] = r15     // Catch: java.lang.IllegalAccessException -> L27
            goto L22
        L20:
            kotlin.coroutines.e[] r0 = new kotlin.coroutines.e[r2]     // Catch: java.lang.IllegalAccessException -> L27
        L22:
            java.lang.Object r14 = r14.call(r0)     // Catch: java.lang.IllegalAccessException -> L27
            return r14
        L27:
            r14 = move-exception
            kotlin.reflect.full.IllegalCallableAccessException r15 = new kotlin.reflect.full.IllegalCallableAccessException
            r15.<init>(r14)
            throw r15
        L2e:
            int r1 = r0.size()
            boolean r4 = r13.isSuspend()
            int r1 = r1 + r4
            java.lang.Object[] r4 = r13.V()
            boolean r5 = r13.isSuspend()
            if (r5 == 0) goto L47
            int r5 = r0.size()
            r4[r5] = r15
        L47:
            kotlin.s<java.lang.Boolean> r15 = r13.f
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L58:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lea
            java.lang.Object r6 = r0.next()
            kotlin.reflect.KParameter r6 = (kotlin.reflect.KParameter) r6
            if (r15 == 0) goto L6b
            int r7 = r13.a0(r6)
            goto L6c
        L6b:
            r7 = 1
        L6c:
            boolean r8 = r14.containsKey(r6)
            if (r8 == 0) goto L7d
            int r8 = r6.getIndex()
            java.lang.Object r9 = r14.get(r6)
            r4[r8] = r9
            goto Lc9
        L7d:
            boolean r8 = r6.p()
            if (r8 == 0) goto Lc3
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            if (r15 == 0) goto La8
            int r8 = r5 + r7
            r9 = r5
        L8a:
            if (r9 >= r8) goto Lc1
            int r10 = r9 / 32
            int r10 = r10 + r1
            r11 = r4[r10]
            kotlin.jvm.internal.g0.n(r11, r2)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r12 = r9 % 32
            int r12 = r3 << r12
            r11 = r11 | r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4[r10] = r11
            int r9 = r9 + 1
            goto L8a
        La8:
            int r8 = r5 / 32
            int r8 = r8 + r1
            r9 = r4[r8]
            kotlin.jvm.internal.g0.n(r9, r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r2 = r9.intValue()
            int r9 = r5 % 32
            int r9 = r3 << r9
            r2 = r2 | r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r8] = r2
        Lc1:
            r2 = 1
            goto Lc9
        Lc3:
            boolean r8 = r6.a()
            if (r8 == 0) goto Ld3
        Lc9:
            kotlin.reflect.KParameter$Kind r6 = r6.h()
            kotlin.reflect.KParameter$Kind r8 = kotlin.reflect.KParameter.Kind.VALUE
            if (r6 != r8) goto L58
            int r5 = r5 + r7
            goto L58
        Ld3:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "No argument provided for a required parameter: "
            r15.append(r0)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        Lea:
            if (r2 != 0) goto L105
            kotlin.reflect.jvm.internal.calls.g r14 = r13.W()     // Catch: java.lang.IllegalAccessException -> Lfe
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.IllegalAccessException -> Lfe
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r15, r0)     // Catch: java.lang.IllegalAccessException -> Lfe
            java.lang.Object r14 = r14.call(r15)     // Catch: java.lang.IllegalAccessException -> Lfe
            return r14
        Lfe:
            r14 = move-exception
            kotlin.reflect.full.IllegalCallableAccessException r15 = new kotlin.reflect.full.IllegalCallableAccessException
            r15.<init>(r14)
            throw r15
        L105:
            kotlin.reflect.jvm.internal.calls.g r14 = r13.Y()
            if (r14 == 0) goto L117
            java.lang.Object r14 = r14.call(r4)     // Catch: java.lang.IllegalAccessException -> L110
            return r14
        L110:
            r14 = move-exception
            kotlin.reflect.full.IllegalCallableAccessException r15 = new kotlin.reflect.full.IllegalCallableAccessException
            r15.<init>(r14)
            throw r15
        L117:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r14 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "This callable does not support a default call: "
            r15.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r13.Z()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.calls.g<?> W();

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.KDeclarationContainerImpl X();

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.calls.g<?> Y();

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor Z();

    protected final boolean b0() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "<init>"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L1c
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r2.X()
            java.lang.Class r0 = r0.c()
            boolean r0 = r0.isAnnotation()
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public abstract boolean c0();

    @Override // kotlin.reflect.c
    public R call(@org.jetbrains.annotations.NotNull java.lang.Object... r2) {
            r1 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.calls.g r0 = r1.W()     // Catch: java.lang.IllegalAccessException -> Le
            java.lang.Object r2 = r0.call(r2)     // Catch: java.lang.IllegalAccessException -> Le
            return r2
        Le:
            r2 = move-exception
            kotlin.reflect.full.IllegalCallableAccessException r0 = new kotlin.reflect.full.IllegalCallableAccessException
            r0.<init>(r2)
            throw r0
    }

    @Override // kotlin.reflect.c
    public R callBy(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.b0()
            if (r0 == 0) goto L10
            java.lang.Object r2 = r1.R(r2)
            return r2
        L10:
            r0 = 0
            java.lang.Object r2 = r1.S(r2, r0)
            return r2
    }

    @Override // kotlin.reflect.b
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r2 = this;
            kotlin.reflect.jvm.internal.f3$a<java.util.List<java.lang.annotation.Annotation>> r0 = r2.a
            java.lang.Object r0 = r0.invoke()
            java.lang.String r1 = "invoke(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // kotlin.reflect.c
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.KParameter> getParameters() {
            r2 = this;
            kotlin.reflect.jvm.internal.f3$a<java.util.ArrayList<kotlin.reflect.KParameter>> r0 = r2.b
            java.lang.Object r0 = r0.invoke()
            java.lang.String r1 = "invoke(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // kotlin.reflect.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.r getReturnType() {
            r2 = this;
            kotlin.reflect.jvm.internal.f3$a<kotlin.reflect.jvm.internal.z2> r0 = r2.c
            java.lang.Object r0 = r0.invoke()
            java.lang.String r1 = "invoke(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.r r0 = (kotlin.reflect.r) r0
            return r0
    }

    @Override // kotlin.reflect.c
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.s> getTypeParameters() {
            r2 = this;
            kotlin.reflect.jvm.internal.f3$a<java.util.List<kotlin.reflect.jvm.internal.b3>> r0 = r2.d
            java.lang.Object r0 = r0.invoke()
            java.lang.String r1 = "invoke(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // kotlin.reflect.c
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.KVisibility getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r2.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r0.getVisibility()
            java.lang.String r1 = "getVisibility(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.KVisibility r0 = kotlin.reflect.jvm.internal.p3.t(r0)
            return r0
    }

    @Override // kotlin.reflect.c
    public boolean isAbstract() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r2.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r0 != r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.c
    public boolean isFinal() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r2.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r0 != r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.c
    public boolean isOpen() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r2.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            if (r0 != r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
