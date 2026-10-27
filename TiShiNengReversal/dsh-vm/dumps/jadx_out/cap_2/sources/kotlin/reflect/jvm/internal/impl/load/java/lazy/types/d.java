package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJavaTypeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1#2:322\n19#3:323\n1563#4:324\n1634#4,3:325\n1563#4:328\n1634#4,3:329\n1563#4:332\n1634#4,3:333\n*S KotlinDebug\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n*L\n144#1:323\n205#1:324\n205#1:325,3\n263#1:328\n263#1:329,3\n267#1:332\n267#1:333,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.p b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.b2 d;

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.p r4) {
            r2 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeParameterResolver"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.a = r3
            r2.b = r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f
            r3.<init>()
            r2.c = r3
            kotlin.reflect.jvm.internal.impl.types.b2 r4 = new kotlin.reflect.jvm.internal.impl.types.b2
            r0 = 0
            r1 = 2
            r4.<init>(r3, r0, r1, r0)
            r2.d = r4
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 a(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r0, kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r2, kotlin.reflect.jvm.internal.impl.types.w1 r3, x3.j r4) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = e(r0, r1, r2, r3, r4)
            return r0
    }

    private final boolean b(x3.j r2, kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            r1 = this;
            java.util.List r2 = r2.p()
            java.lang.Object r2 = kotlin.collections.f0.A3(r2)
            x3.x r2 = (x3.x) r2
            boolean r2 = x3.a0.a(r2)
            r0 = 0
            if (r2 != 0) goto L12
            return r0
        L12:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.b(r3)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
            java.util.List r2 = r2.getParameters()
            java.lang.String r3 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Object r2 = kotlin.collections.f0.A3(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            if (r2 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = r2.l()
            if (r2 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r2 == r3) goto L39
            r2 = 1
            return r2
        L39:
            return r0
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> c(x3.j r10, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r11, kotlin.reflect.jvm.internal.impl.types.w1 r12) {
            r9 = this;
            boolean r0 = r10.C()
            java.lang.String r1 = "getParameters(...)"
            if (r0 != 0) goto L24
            java.util.List r0 = r10.p()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.g0.o(r2, r1)
            if (r0 == 0) goto L33
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L33:
            int r11 = r2.size()
            java.util.List r12 = r10.p()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L7e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.f0.d0(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L52:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L79
            java.lang.Object r12 = r11.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r12 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r12
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            kotlin.reflect.jvm.internal.impl.name.f r12 = r12.getName()
            java.lang.String r12 = r12.b()
            java.lang.String[] r12 = new java.lang.String[]{r12}
            kotlin.reflect.jvm.internal.impl.types.error.g r12 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L52
        L79:
            java.util.List r10 = kotlin.collections.f0.a6(r10)
            return r10
        L7e:
            java.util.List r10 = r10.p()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = kotlin.collections.f0.m6(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.f0.d0(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L95:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lca
            java.lang.Object r12 = r10.next()
            kotlin.collections.a1 r12 = (kotlin.collections.a1) r12
            int r0 = r12.a()
            java.lang.Object r12 = r12.b()
            x3.x r12 = (x3.x) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r3 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.types.c2 r12 = r9.q(r12, r1, r0)
            r11.add(r12)
            goto L95
        Lca:
            java.util.List r10 = kotlin.collections.f0.a6(r11)
            return r10
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> d(x3.j r10, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r11, kotlin.reflect.jvm.internal.impl.types.w1 r12, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r13) {
            r9 = this;
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L11:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r11.next()
            r4 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            r1 = 0
            java.util.Set r2 = r13.c()
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.r(r4, r1, r2)
            if (r1 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = kotlin.reflect.jvm.internal.impl.types.j2.t(r4, r13)
            r3 = r9
            r7 = r10
            r6 = r12
            r5 = r13
            goto L56
        L32:
            kotlin.reflect.jvm.internal.impl.types.z0 r1 = new kotlin.reflect.jvm.internal.impl.types.z0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r9.a
            kotlin.reflect.jvm.internal.impl.storage.n r8 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c
            r3 = r9
            r7 = r10
            r6 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r1.<init>(r8, r2)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f r10 = r3.c
            boolean r12 = r7.C()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r12 = r5.j(r12)
            kotlin.reflect.jvm.internal.impl.types.b2 r13 = r3.d
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r10.a(r4, r12, r13, r1)
        L56:
            r0.add(r1)
            r13 = r5
            r12 = r6
            r10 = r7
            goto L11
        L5d:
            r3 = r9
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 e(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r0, kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r2, kotlin.reflect.jvm.internal.impl.types.w1 r3, x3.j r4) {
            kotlin.reflect.jvm.internal.impl.types.b2 r0 = r0.d
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.c()
            if (r3 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.s()
            goto Le
        Ld:
            r3 = 0
        Le:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r2 = r2.k(r3)
            boolean r3 = r4.C()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r2 = r2.j(r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.e(r1, r2)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 f(x3.j r9, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r10, kotlin.reflect.jvm.internal.impl.types.e1 r11) {
            r8 = this;
            if (r11 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r11.H0()
            if (r0 != 0) goto L9
            goto Lc
        L9:
            r3 = r9
        La:
            r1 = r0
            goto L1c
        Lc:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.g
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r8.a
            r5 = 4
            r6 = 0
            r4 = 0
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = kotlin.reflect.jvm.internal.impl.types.u1.b(r1)
            goto La
        L1c:
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r8.g(r3, r10)
            r9 = 0
            if (r2 != 0) goto L24
            return r9
        L24:
            boolean r4 = r8.j(r10)
            if (r11 == 0) goto L2e
            kotlin.reflect.jvm.internal.impl.types.w1 r9 = r11.I0()
        L2e:
            boolean r9 = kotlin.jvm.internal.g0.g(r9, r2)
            if (r9 == 0) goto L42
            boolean r9 = r3.C()
            if (r9 != 0) goto L42
            if (r4 == 0) goto L42
            r9 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = r11.P0(r9)
            return r9
        L42:
            java.util.List r3 = r8.c(r3, r10, r2)
            r6 = 16
            r7 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = kotlin.reflect.jvm.internal.impl.types.w0.m(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private final kotlin.reflect.jvm.internal.impl.types.w1 g(x3.j r4, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r5) {
            r3 = this;
            x3.i r0 = r4.n()
            if (r0 != 0) goto Lb
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r3.h(r4)
            return r4
        Lb:
            boolean r1 = r0 instanceof x3.g
            if (r1 == 0) goto L52
            r1 = r0
            x3.g r1 = (x3.g) r1
            kotlin.reflect.jvm.internal.impl.name.c r2 = r1.d()
            if (r2 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.descriptors.d r5 = r3.k(r4, r5, r2)
            if (r5 != 0) goto L2c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5 = r3.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r5 = r5.a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.n r5 = r5.n()
            kotlin.reflect.jvm.internal.impl.descriptors.d r5 = r5.a(r1)
        L2c:
            if (r5 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r5.o()
            if (r5 != 0) goto L35
            goto L36
        L35:
            return r5
        L36:
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r3.h(r4)
            return r4
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Class type should have a FQ name: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
        L52:
            boolean r4 = r0 instanceof x3.y
            if (r4 == 0) goto L67
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r4 = r3.b
            x3.y r0 = (x3.y) r0
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = r4.a(r0)
            if (r4 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.o()
            return r4
        L65:
            r4 = 0
            return r4
        L67:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Unknown classifier kind: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private final kotlin.reflect.jvm.internal.impl.types.w1 h(x3.j r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.b$a r0 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r3 = r3.v()
            r1.<init>(r3)
            kotlin.reflect.jvm.internal.impl.name.b r3 = r0.c(r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.f()
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r0 = r0.r()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.List r1 = kotlin.collections.f0.l(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r0.d(r3, r1)
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.o()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
    }

    private final boolean i(kotlin.reflect.jvm.internal.impl.types.Variance r4, kotlin.reflect.jvm.internal.impl.descriptors.j1 r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r5.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            r2 = 0
            if (r0 != r1) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r5.l()
            if (r4 == r5) goto L12
            r4 = 1
            return r4
        L12:
            return r2
    }

    private final boolean j(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r0 = r4.g()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND
            r2 = 0
            if (r0 != r1) goto La
            return r2
        La:
            boolean r0 = r4.h()
            if (r0 != 0) goto L1a
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE
            if (r4 == r0) goto L1a
            r4 = 1
            return r4
        L1a:
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d k(x3.j r7, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r8, kotlin.reflect.jvm.internal.impl.name.c r9) {
            r6 = this;
            boolean r0 = r8.h()
            if (r0 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.a()
            boolean r0 = kotlin.jvm.internal.g0.g(r9, r0)
            if (r0 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r7 = r6.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r7 = r7.a()
            kotlin.reflect.jvm.internal.impl.builtins.n r7 = r7.p()
            kotlin.reflect.jvm.internal.impl.descriptors.d r7 = r7.d()
            return r7
        L1f:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r6.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = r1.p()
            r4 = 4
            r5 = 0
            r3 = 0
            r1 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.d r9 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(r0, r1, r2, r3, r4, r5)
            if (r9 != 0) goto L37
            r7 = 0
            return r7
        L37:
            boolean r1 = r0.d(r9)
            if (r1 == 0) goto L58
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = r8.g()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND
            if (r1 == r2) goto L53
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r8 = r8.b()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r1 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE
            if (r8 == r1) goto L53
            boolean r7 = r6.b(r7, r9)
            if (r7 == 0) goto L58
        L53:
            kotlin.reflect.jvm.internal.impl.descriptors.d r7 = r0.b(r9)
            return r7
        L58:
            return r9
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 m(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r0, x3.f r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.l(r1, r2, r3)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.types.t0 n(x3.j r4, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r5) {
            r3 = this;
            boolean r0 = r5.h()
            if (r0 != 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = r5.b()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r1 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r1 = r4.C()
            r2 = 0
            if (r1 != 0) goto L26
            if (r0 != 0) goto L26
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = r3.f(r4, r5, r2)
            if (r5 == 0) goto L21
            return r5
        L21:
            kotlin.reflect.jvm.internal.impl.types.error.g r4 = o(r4)
            return r4
        L26:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r0 = r5.l(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.f(r4, r0, r2)
            if (r0 != 0) goto L37
            kotlin.reflect.jvm.internal.impl.types.error.g r4 = o(r4)
            return r4
        L37:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r5 = r5.l(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = r3.f(r4, r5, r0)
            if (r5 != 0) goto L48
            kotlin.reflect.jvm.internal.impl.types.error.g r4 = o(r4)
            return r4
        L48:
            if (r1 == 0) goto L50
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j
            r4.<init>(r0, r5)
            return r4
        L50:
            kotlin.reflect.jvm.internal.impl.types.m2 r4 = kotlin.reflect.jvm.internal.impl.types.w0.e(r0, r5)
            return r4
    }

    private static final kotlin.reflect.jvm.internal.impl.types.error.g o(x3.j r1) {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNRESOLVED_JAVA_CLASS
            java.lang.String r1 = r1.t()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r1)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.c2 q(x3.x r9, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r10, kotlin.reflect.jvm.internal.impl.descriptors.j1 r11) {
            r8 = this;
            boolean r0 = r9 instanceof x3.c0
            if (r0 == 0) goto L56
            x3.c0 r9 = (x3.c0) r9
            x3.x r0 = r9.getBound()
            boolean r1 = r9.J()
            if (r1 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L15
        L13:
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L15:
            if (r0 == 0) goto L4c
            boolean r2 = r8.i(r1, r11)
            if (r2 == 0) goto L1e
            goto L4c
        L1e:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r10 = r8.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r9 = kotlin.reflect.jvm.internal.impl.load.java.s0.a(r10, r9)
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r2 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r10 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = r8.p(r0, r10)
            if (r9 == 0) goto L47
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r10.getAnnotations()
            java.util.List r9 = kotlin.collections.f0.F4(r2, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9 = r0.a(r9)
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.D(r10, r9)
        L47:
            kotlin.reflect.jvm.internal.impl.types.c2 r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.l(r10, r1, r11)
            return r9
        L4c:
            kotlin.reflect.jvm.internal.impl.types.c2 r9 = kotlin.reflect.jvm.internal.impl.types.j2.t(r11, r10)
            java.lang.String r10 = "makeStarProjection(...)"
            kotlin.jvm.internal.g0.o(r9, r10)
            return r9
        L56:
            kotlin.reflect.jvm.internal.impl.types.e2 r11 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r8.p(r9, r10)
            r11.<init>(r0, r9)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 l(@org.jetbrains.annotations.NotNull x3.f r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r13, boolean r14) {
            r11 = this;
            java.lang.String r0 = "arrayType"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "attr"
            kotlin.jvm.internal.g0.p(r13, r0)
            x3.x r0 = r12.j()
            boolean r1 = r0 instanceof x3.v
            r2 = 0
            if (r1 == 0) goto L17
            r1 = r0
            x3.v r1 = (x3.v) r1
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2 = r1.getType()
        L1e:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.g
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r11.a
            r4 = 1
            r1.<init>(r3, r12, r4)
            if (r2 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r12 = r11.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r12 = r12.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r12 = r12.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = r12.P(r2)
            kotlin.jvm.internal.g0.m(r12)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.n r14 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.n
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r12.getAnnotations()
            r2 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[] r2 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[r2]
            r3 = 0
            r2[r3] = r0
            r2[r4] = r1
            r14.<init>(r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.D(r12, r14)
            java.lang.String r14 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.g0.n(r12, r14)
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = (kotlin.reflect.jvm.internal.impl.types.e1) r12
            boolean r13 = r13.h()
            if (r13 == 0) goto L5c
            return r12
        L5c:
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = r12.P0(r4)
            kotlin.reflect.jvm.internal.impl.types.m2 r12 = kotlin.reflect.jvm.internal.impl.types.w0.e(r12, r13)
            return r12
        L65:
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r5 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            boolean r6 = r13.h()
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r12 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r5, r6, r7, r8, r9, r10)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = r11.p(r0, r12)
            boolean r13 = r13.h()
            java.lang.String r0 = "getArrayType(...)"
            if (r13 == 0) goto L98
            if (r14 == 0) goto L84
            kotlin.reflect.jvm.internal.impl.types.Variance r13 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L86
        L84:
            kotlin.reflect.jvm.internal.impl.types.Variance r13 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L86:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r14 = r11.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r14 = r14.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r14 = r14.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = r14.n(r13, r12, r1)
            kotlin.jvm.internal.g0.o(r12, r0)
            return r12
        L98:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r13 = r11.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r13 = r13.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r13 = r13.p()
            kotlin.reflect.jvm.internal.impl.types.Variance r14 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = r13.n(r14, r12, r1)
            kotlin.jvm.internal.g0.o(r13, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r14 = r11.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r14 = r14.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r14 = r14.p()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = r14.n(r0, r12, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = r12.P0(r4)
            kotlin.reflect.jvm.internal.impl.types.m2 r12 = kotlin.reflect.jvm.internal.impl.types.w0.e(r13, r12)
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 p(@org.jetbrains.annotations.Nullable x3.x r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r9) {
            r7 = this;
            java.lang.String r0 = "attr"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r8 instanceof x3.v
            if (r0 == 0) goto L32
            x3.v r8 = (x3.v) r8
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r8 = r8.getType()
            if (r8 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r9 = r7.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r9 = r9.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r9 = r9.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r9.S(r8)
            goto L2e
        L20:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r8 = r7.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r8 = r8.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r8 = r8.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r8.a0()
        L2e:
            kotlin.jvm.internal.g0.m(r8)
            return r8
        L32:
            boolean r0 = r8 instanceof x3.j
            if (r0 == 0) goto L3d
            x3.j r8 = (x3.j) r8
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r7.n(r8, r9)
            return r8
        L3d:
            boolean r0 = r8 instanceof x3.f
            if (r0 == 0) goto L4e
            r2 = r8
            x3.f r2 = (x3.f) r2
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r3 = r9
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = m(r1, r2, r3, r4, r5, r6)
            return r8
        L4e:
            r1 = r7
            r3 = r9
            boolean r9 = r8 instanceof x3.c0
            java.lang.String r0 = "getDefaultBound(...)"
            if (r9 == 0) goto L78
            x3.c0 r8 = (x3.c0) r8
            x3.x r8 = r8.getBound()
            if (r8 == 0) goto L66
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r7.p(r8, r3)
            if (r8 != 0) goto L65
            goto L66
        L65:
            return r8
        L66:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r8 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r8 = r8.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r8 = r8.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r8.z()
            kotlin.jvm.internal.g0.o(r8, r0)
            return r8
        L78:
            if (r8 != 0) goto L8c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r8 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r8 = r8.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r8 = r8.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r8.z()
            kotlin.jvm.internal.g0.o(r8, r0)
            return r8
        L8c:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported type: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }
}
