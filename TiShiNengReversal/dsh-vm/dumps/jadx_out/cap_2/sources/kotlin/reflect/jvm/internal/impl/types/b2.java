package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1193#2,2:159\n1267#2,4:161\n1563#2:166\n1634#2,3:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n*L\n77#1:159,2\n77#1:161,4\n100#1:166\n100#1:167,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b2 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.b2.a f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.h0 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.y1 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.f c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.types.b2.b, kotlin.reflect.jvm.internal.impl.types.t0> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n245#2,14:159\n260#2:177\n1563#3:173\n1634#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"})
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

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.t0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r18, @org.jetbrains.annotations.Nullable java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r19, boolean r20) {
                r16 = this;
                r0 = r18
                r1 = r19
                java.lang.String r2 = "<this>"
                r3 = r17
                kotlin.jvm.internal.g0.p(r3, r2)
                java.lang.String r2 = "substitutor"
                kotlin.jvm.internal.g0.p(r0, r2)
                kotlin.reflect.jvm.internal.impl.types.m2 r2 = r3.L0()
                boolean r4 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.k0
                r5 = 2
                java.lang.String r6 = "getType(...)"
                r9 = 10
                java.lang.String r10 = "getParameters(...)"
                r11 = 0
                if (r4 == 0) goto L14d
                r4 = r2
                kotlin.reflect.jvm.internal.impl.types.k0 r4 = (kotlin.reflect.jvm.internal.impl.types.k0) r4
                kotlin.reflect.jvm.internal.impl.types.e1 r12 = r4.Q0()
                kotlin.reflect.jvm.internal.impl.types.w1 r13 = r12.I0()
                java.util.List r13 = r13.getParameters()
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto Lb5
                kotlin.reflect.jvm.internal.impl.types.w1 r13 = r12.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r13 = r13.c()
                if (r13 != 0) goto L41
                goto Lb5
            L41:
                kotlin.reflect.jvm.internal.impl.types.w1 r13 = r12.I0()
                java.util.List r13 = r13.getParameters()
                kotlin.jvm.internal.g0.o(r13, r10)
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.ArrayList r14 = new java.util.ArrayList
                int r15 = kotlin.collections.f0.d0(r13, r9)
                r14.<init>(r15)
                java.util.Iterator r13 = r13.iterator()
            L5b:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto Lb1
                java.lang.Object r15 = r13.next()
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r15 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r15
                java.util.List r7 = r3.G0()
                int r8 = r15.getIndex()
                java.lang.Object r7 = kotlin.collections.f0.b3(r7, r8)
                kotlin.reflect.jvm.internal.impl.types.c2 r7 = (kotlin.reflect.jvm.internal.impl.types.c2) r7
                if (r20 == 0) goto L86
                if (r7 == 0) goto L86
                kotlin.reflect.jvm.internal.impl.types.t0 r8 = r7.getType()
                if (r8 == 0) goto L86
                boolean r8 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.j(r8)
                if (r8 != 0) goto L86
                goto Lab
            L86:
                if (r1 == 0) goto L90
                boolean r8 = r1.contains(r15)
                if (r8 == 0) goto L90
                r8 = 1
                goto L91
            L90:
                r8 = 0
            L91:
                if (r7 == 0) goto La6
                if (r8 != 0) goto La6
                kotlin.reflect.jvm.internal.impl.types.f2 r8 = r0.j()
                kotlin.reflect.jvm.internal.impl.types.t0 r9 = r7.getType()
                kotlin.jvm.internal.g0.o(r9, r6)
                kotlin.reflect.jvm.internal.impl.types.c2 r8 = r8.e(r9)
                if (r8 != 0) goto Lab
            La6:
                kotlin.reflect.jvm.internal.impl.types.l1 r7 = new kotlin.reflect.jvm.internal.impl.types.l1
                r7.<init>(r15)
            Lab:
                r14.add(r7)
                r9 = 10
                goto L5b
            Lb1:
                kotlin.reflect.jvm.internal.impl.types.e1 r12 = kotlin.reflect.jvm.internal.impl.types.g2.f(r12, r14, r11, r5, r11)
            Lb5:
                kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.R0()
                kotlin.reflect.jvm.internal.impl.types.w1 r7 = r4.I0()
                java.util.List r7 = r7.getParameters()
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L147
                kotlin.reflect.jvm.internal.impl.types.w1 r7 = r4.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r7 = r7.c()
                if (r7 != 0) goto Ld3
                goto L147
            Ld3:
                kotlin.reflect.jvm.internal.impl.types.w1 r7 = r4.I0()
                java.util.List r7 = r7.getParameters()
                kotlin.jvm.internal.g0.o(r7, r10)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.f0.d0(r7, r9)
                r8.<init>(r9)
                java.util.Iterator r7 = r7.iterator()
            Lef:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L143
                java.lang.Object r9 = r7.next()
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r9 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r9
                java.util.List r10 = r3.G0()
                int r13 = r9.getIndex()
                java.lang.Object r10 = kotlin.collections.f0.b3(r10, r13)
                kotlin.reflect.jvm.internal.impl.types.c2 r10 = (kotlin.reflect.jvm.internal.impl.types.c2) r10
                if (r20 == 0) goto L11a
                if (r10 == 0) goto L11a
                kotlin.reflect.jvm.internal.impl.types.t0 r13 = r10.getType()
                if (r13 == 0) goto L11a
                boolean r13 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.j(r13)
                if (r13 != 0) goto L11a
                goto L13f
            L11a:
                if (r1 == 0) goto L124
                boolean r13 = r1.contains(r9)
                if (r13 == 0) goto L124
                r13 = 1
                goto L125
            L124:
                r13 = 0
            L125:
                if (r10 == 0) goto L13a
                if (r13 != 0) goto L13a
                kotlin.reflect.jvm.internal.impl.types.f2 r13 = r0.j()
                kotlin.reflect.jvm.internal.impl.types.t0 r14 = r10.getType()
                kotlin.jvm.internal.g0.o(r14, r6)
                kotlin.reflect.jvm.internal.impl.types.c2 r13 = r13.e(r14)
                if (r13 != 0) goto L13f
            L13a:
                kotlin.reflect.jvm.internal.impl.types.l1 r10 = new kotlin.reflect.jvm.internal.impl.types.l1
                r10.<init>(r9)
            L13f:
                r8.add(r10)
                goto Lef
            L143:
                kotlin.reflect.jvm.internal.impl.types.e1 r4 = kotlin.reflect.jvm.internal.impl.types.g2.f(r4, r8, r11, r5, r11)
            L147:
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = kotlin.reflect.jvm.internal.impl.types.w0.e(r12, r4)
                goto L1e4
            L14d:
                boolean r4 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
                if (r4 == 0) goto L1f4
                r4 = r2
                kotlin.reflect.jvm.internal.impl.types.e1 r4 = (kotlin.reflect.jvm.internal.impl.types.e1) r4
                kotlin.reflect.jvm.internal.impl.types.w1 r7 = r4.I0()
                java.util.List r7 = r7.getParameters()
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L1e3
                kotlin.reflect.jvm.internal.impl.types.w1 r7 = r4.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r7 = r7.c()
                if (r7 != 0) goto L16e
                goto L1e3
            L16e:
                kotlin.reflect.jvm.internal.impl.types.w1 r7 = r4.I0()
                java.util.List r7 = r7.getParameters()
                kotlin.jvm.internal.g0.o(r7, r10)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.f0.d0(r7, r9)
                r8.<init>(r9)
                java.util.Iterator r7 = r7.iterator()
            L18a:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L1de
                java.lang.Object r9 = r7.next()
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r9 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r9
                java.util.List r10 = r3.G0()
                int r12 = r9.getIndex()
                java.lang.Object r10 = kotlin.collections.f0.b3(r10, r12)
                kotlin.reflect.jvm.internal.impl.types.c2 r10 = (kotlin.reflect.jvm.internal.impl.types.c2) r10
                if (r20 == 0) goto L1b5
                if (r10 == 0) goto L1b5
                kotlin.reflect.jvm.internal.impl.types.t0 r12 = r10.getType()
                if (r12 == 0) goto L1b5
                boolean r12 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.j(r12)
                if (r12 != 0) goto L1b5
                goto L1da
            L1b5:
                if (r1 == 0) goto L1bf
                boolean r12 = r1.contains(r9)
                if (r12 == 0) goto L1bf
                r12 = 1
                goto L1c0
            L1bf:
                r12 = 0
            L1c0:
                if (r10 == 0) goto L1d5
                if (r12 != 0) goto L1d5
                kotlin.reflect.jvm.internal.impl.types.f2 r12 = r0.j()
                kotlin.reflect.jvm.internal.impl.types.t0 r13 = r10.getType()
                kotlin.jvm.internal.g0.o(r13, r6)
                kotlin.reflect.jvm.internal.impl.types.c2 r12 = r12.e(r13)
                if (r12 != 0) goto L1da
            L1d5:
                kotlin.reflect.jvm.internal.impl.types.l1 r10 = new kotlin.reflect.jvm.internal.impl.types.l1
                r10.<init>(r9)
            L1da:
                r8.add(r10)
                goto L18a
            L1de:
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.g2.f(r4, r8, r11, r5, r11)
                goto L1e4
            L1e3:
                r1 = r4
            L1e4:
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = kotlin.reflect.jvm.internal.impl.types.l2.b(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.n(r1, r2)
                java.lang.String r1 = "safeSubstitute(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
            L1f4:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.descriptors.j1 a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.types.i0 b;

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.i0 r3) {
                r1 = this;
                java.lang.String r0 = "typeParameter"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "typeAttr"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.i0 a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.i0 r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.j1 b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.b2.b
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                kotlin.reflect.jvm.internal.impl.types.b2$b r4 = (kotlin.reflect.jvm.internal.impl.types.b2.b) r4
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r4.a
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = r3.a
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L1e
                kotlin.reflect.jvm.internal.impl.types.i0 r4 = r4.b
                kotlin.reflect.jvm.internal.impl.types.i0 r0 = r3.b
                boolean r4 = kotlin.jvm.internal.g0.g(r4, r0)
                if (r4 == 0) goto L1e
                r4 = 1
                return r4
            L1e:
                return r1
        }

        public int hashCode() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r3.a
                int r0 = r0.hashCode()
                int r1 = r0 * 31
                kotlin.reflect.jvm.internal.impl.types.i0 r2 = r3.b
                int r2 = r2.hashCode()
                int r1 = r1 + r2
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DataToEraseUpperBound(typeParameter="
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", typeAttr="
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.types.i0 r1 = r2.b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.b2$a r0 = new kotlin.reflect.jvm.internal.impl.types.b2$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.b2.f = r0
            return
    }

    public b2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.y1 r3) {
            r1 = this;
            java.lang.String r0 = "projectionComputer"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            kotlin.reflect.jvm.internal.impl.storage.f r2 = new kotlin.reflect.jvm.internal.impl.storage.f
            java.lang.String r3 = "Type parameter upper bound erasure results"
            r2.<init>(r3)
            r1.c = r2
            kotlin.reflect.jvm.internal.impl.types.z1 r3 = new kotlin.reflect.jvm.internal.impl.types.z1
            r3.<init>(r1)
            kotlin.s r3 = kotlin.t.c(r3)
            r1.d = r3
            kotlin.reflect.jvm.internal.impl.types.a2 r3 = new kotlin.reflect.jvm.internal.impl.types.a2
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.g r2 = r2.i(r3)
            java.lang.String r3 = "createMemoizedFunction(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.e = r2
            return
    }

    public /* synthetic */ b2(kotlin.reflect.jvm.internal.impl.types.h0 r1, kotlin.reflect.jvm.internal.impl.types.y1 r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto La
            kotlin.reflect.jvm.internal.impl.types.y1 r2 = new kotlin.reflect.jvm.internal.impl.types.y1
            r3 = 0
            r2.<init>(r3, r3)
        La:
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.error.g a(kotlin.reflect.jvm.internal.impl.types.b2 r0) {
            kotlin.reflect.jvm.internal.impl.types.error.g r0 = c(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 b(kotlin.reflect.jvm.internal.impl.types.b2 r0, kotlin.reflect.jvm.internal.impl.types.b2.b r1) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = f(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.error.g c(kotlin.reflect.jvm.internal.impl.types.b2 r1) {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND
            java.lang.String r1 = r1.toString()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r1)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.types.i0 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.a()
            if (r1 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.E(r1)
            if (r1 != 0) goto Ld
            goto Le
        Ld:
            return r1
        Le:
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = r0.h()
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 f(kotlin.reflect.jvm.internal.impl.types.b2 r1, kotlin.reflect.jvm.internal.impl.types.b2.b r2) {
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.b()
            kotlin.reflect.jvm.internal.impl.types.i0 r2 = r2.a()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.g(r0, r2)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.t0 g(kotlin.reflect.jvm.internal.impl.descriptors.j1 r8, kotlin.reflect.jvm.internal.impl.types.i0 r9) {
            r7 = this;
            java.util.Set r0 = r9.c()
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = r8.a()
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r7.d(r9)
            return r8
        L15:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r8.s()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.util.Set r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.m(r1, r0)
            r2 = 10
            int r3 = kotlin.collections.f0.d0(r1, r2)
            int r3 = kotlin.collections.i1.j(r3)
            r4 = 16
            int r3 = kotlin.ranges.t.u(r3, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r3
            if (r0 == 0) goto L5a
            boolean r5 = r0.contains(r3)
            if (r5 != 0) goto L50
            goto L5a
        L50:
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = kotlin.reflect.jvm.internal.impl.types.j2.t(r3, r9)
            java.lang.String r6 = "makeStarProjection(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            goto L68
        L5a:
            kotlin.reflect.jvm.internal.impl.types.h0 r5 = r7.a
            kotlin.reflect.jvm.internal.impl.types.i0 r6 = r9.d(r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r7.e(r3, r6)
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = r5.a(r3, r9, r7, r6)
        L68:
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.o()
            kotlin.Pair r3 = kotlin.o0.a(r3, r5)
            java.lang.Object r5 = r3.getFirst()
            java.lang.Object r3 = r3.getSecond()
            r4.put(r5, r3)
            goto L3b
        L7c:
            kotlin.reflect.jvm.internal.impl.types.x1$a r0 = kotlin.reflect.jvm.internal.impl.types.x1.c
            r1 = 2
            r3 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.types.x1 r0 = kotlin.reflect.jvm.internal.impl.types.x1.a.e(r0, r4, r5, r1, r3)
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.g(r0)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r8 = r8.getUpperBounds()
            java.lang.String r1 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r8, r1)
            java.util.Set r8 = r7.i(r0, r8, r9)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Leb
            kotlin.reflect.jvm.internal.impl.types.y1 r9 = r7.b
            boolean r9 = r9.a()
            if (r9 != 0) goto Lbf
            int r9 = r8.size()
            r0 = 1
            if (r9 != r0) goto Lb7
            java.lang.Object r8 = kotlin.collections.f0.k5(r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = (kotlin.reflect.jvm.internal.impl.types.t0) r8
            return r8
        Lb7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Should only be one computed upper bound if no need to intersect all bounds"
            r8.<init>(r9)
            throw r8
        Lbf:
            java.util.List r8 = kotlin.collections.f0.a6(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = kotlin.collections.f0.d0(r8, r2)
            r9.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        Ld2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Le6
            java.lang.Object r0 = r8.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r0.L0()
            r9.add(r0)
            goto Ld2
        Le6:
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = kotlin.reflect.jvm.internal.impl.types.checker.d.a(r9)
            return r8
        Leb:
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r7.d(r9)
            return r8
    }

    private final kotlin.reflect.jvm.internal.impl.types.error.g h() {
            r1 = this;
            kotlin.s r0 = r1.d
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.types.error.g r0 = (kotlin.reflect.jvm.internal.impl.types.error.g) r0
            return r0
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.types.t0> i(kotlin.reflect.jvm.internal.impl.types.h2 r6, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r7, kotlin.reflect.jvm.internal.impl.types.i0 r8) {
            r5 = this;
            java.util.Set r0 = kotlin.collections.u1.d()
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L34
            kotlin.reflect.jvm.internal.impl.types.b2$a r2 = kotlin.reflect.jvm.internal.impl.types.b2.f
            java.util.Set r3 = r8.c()
            kotlin.reflect.jvm.internal.impl.types.y1 r4 = r5.b
            boolean r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.a(r1, r6, r3, r4)
            r0.add(r1)
            goto L5f
        L34:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r1 == 0) goto L5f
            java.util.Set r1 = r8.c()
            if (r1 == 0) goto L4d
            boolean r1 = r1.contains(r2)
            r3 = 1
            if (r1 != r3) goto L4d
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r5.d(r8)
            r0.add(r1)
            goto L5f
        L4d:
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            java.util.List r1 = r2.getUpperBounds()
            java.lang.String r2 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.util.Set r1 = r5.i(r6, r1, r8)
            r0.addAll(r1)
        L5f:
            kotlin.reflect.jvm.internal.impl.types.y1 r1 = r5.b
            boolean r1 = r1.a()
            if (r1 != 0) goto L8
        L67:
            java.util.Set r6 = kotlin.collections.u1.a(r0)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.i0 r4) {
            r2 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeAttr"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.types.b2$b, kotlin.reflect.jvm.internal.impl.types.t0> r0 = r2.e
            kotlin.reflect.jvm.internal.impl.types.b2$b r1 = new kotlin.reflect.jvm.internal.impl.types.b2$b
            r1.<init>(r3, r4)
            java.lang.Object r3 = r0.invoke(r1)
            java.lang.String r4 = "invoke(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            return r3
    }
}
