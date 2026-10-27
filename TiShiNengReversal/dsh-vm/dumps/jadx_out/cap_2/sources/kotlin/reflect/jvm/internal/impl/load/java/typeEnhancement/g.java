package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1#2:262\n3544#3,7:263\n1740#3,3:270\n3544#3,7:273\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:263,7\n143#1:270,3\n155#1:273,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.e a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @org.jetbrains.annotations.Nullable
        private final kotlin.reflect.jvm.internal.impl.types.t0 a;
        private final int b;

        public a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public final int a() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.types.t0 getType() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {

        @org.jetbrains.annotations.Nullable
        private final kotlin.reflect.jvm.internal.impl.types.e1 a;
        private final int b;
        private final boolean c;

        public b(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.e1 r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public final boolean a() {
                r1 = this;
                boolean r0 = r1.c
                return r0
        }

        public final int b() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.types.e1 getType() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.a
                return r0
        }
    }

    public g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.e r2) {
            r1 = this;
            java.lang.String r0 = "javaResolverSettings"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g.b b(kotlin.reflect.jvm.internal.impl.types.e1 r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r22, int r23, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r24, boolean r25, boolean r26) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r24
            r3 = r26
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m1.a(r2)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L15
            if (r25 != 0) goto L13
            goto L15
        L13:
            r7 = 0
            goto L16
        L15:
            r7 = 1
        L16:
            r8 = 0
            if (r4 != 0) goto L29
            java.util.List r4 = r21.G0()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b
            r1.<init>(r8, r6, r5)
            return r1
        L29:
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r21.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.c()
            if (r4 != 0) goto L39
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b
            r1.<init>(r8, r6, r5)
            return r1
        L39:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)
            java.lang.Object r9 = r1.invoke(r9)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r9 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r9
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.b(r4, r9, r2)
            java.lang.Boolean r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.d(r9, r2)
            if (r4 == 0) goto L56
            kotlin.reflect.jvm.internal.impl.types.w1 r10 = r4.o()
            if (r10 != 0) goto L54
            goto L56
        L54:
            r12 = r10
            goto L5b
        L56:
            kotlin.reflect.jvm.internal.impl.types.w1 r10 = r21.I0()
            goto L54
        L5b:
            int r10 = r23 + 1
            java.util.List r11 = r21.G0()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r13 = r12.getParameters()
            java.lang.String r14 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r13, r14)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r14 = r11.iterator()
            java.util.Iterator r15 = r13.iterator()
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r11 = kotlin.collections.f0.d0(r11, r5)
            int r13 = kotlin.collections.f0.d0(r13, r5)
            int r11 = java.lang.Math.min(r11, r13)
            r6.<init>(r11)
        L89:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L14c
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L14c
            java.lang.Object r11 = r14.next()
            java.lang.Object r13 = r15.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r13 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r13
            kotlin.reflect.jvm.internal.impl.types.c2 r11 = (kotlin.reflect.jvm.internal.impl.types.c2) r11
            if (r7 != 0) goto Lac
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a
            r25 = r2
            r2 = 0
            r5.<init>(r8, r2)
            goto Lfe
        Lac:
            r25 = r2
            boolean r2 = r11.b()
            if (r2 != 0) goto Lc1
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r11.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r5 = r0.d(r2, r1, r10, r3)
            goto Lfe
        Lc1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r1.invoke(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = r2.f()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            if (r2 != r5) goto Lf7
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r11.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = kotlin.reflect.jvm.internal.impl.types.n0.c(r2)
            r1 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r8.P0(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.n0.d(r2)
            r2 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.P0(r2)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = kotlin.reflect.jvm.internal.impl.types.w0.e(r8, r1)
            r5.<init>(r1, r2)
            goto Lfe
        Lf7:
            r2 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a
            r1 = 0
            r5.<init>(r1, r2)
        Lfe:
            int r1 = r5.a()
            int r10 = r10 + r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r5.getType()
            java.lang.String r2 = "getProjectionKind(...)"
            if (r1 == 0) goto L11b
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r11.c()
            kotlin.jvm.internal.g0.o(r5, r2)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.l(r1, r5, r13)
            goto L140
        L11b:
            if (r4 == 0) goto L138
            boolean r1 = r11.b()
            if (r1 != 0) goto L138
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r11.getType()
            java.lang.String r5 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r5)
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r11.c()
            kotlin.jvm.internal.g0.o(r5, r2)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.l(r1, r5, r13)
            goto L140
        L138:
            if (r4 == 0) goto L13f
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = kotlin.reflect.jvm.internal.impl.types.j2.s(r13)
            goto L140
        L13f:
            r1 = 0
        L140:
            r6.add(r1)
            r1 = r22
            r2 = r25
            r5 = 10
            r8 = 0
            goto L89
        L14c:
            r25 = r2
            int r10 = r10 - r23
            if (r4 != 0) goto L16e
            if (r25 != 0) goto L16e
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L15b
            goto L170
        L15b:
            java.util.Iterator r1 = r6.iterator()
        L15f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L170
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
            if (r2 != 0) goto L16e
            goto L15f
        L16e:
            r2 = 0
            goto L178
        L170:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b
            r2 = 0
            r3 = 0
            r1.<init>(r2, r10, r3)
            return r1
        L178:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r21.getAnnotations()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.c()
            if (r4 == 0) goto L183
            goto L184
        L183:
            r3 = r2
        L184:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.g()
            if (r25 == 0) goto L18c
            r8 = r4
            goto L18d
        L18c:
            r8 = r2
        L18d:
            r2 = 3
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[] r2 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[r2]
            r19 = 0
            r2[r19] = r1
            r18 = 1
            r2[r18] = r3
            r1 = 2
            r2[r1] = r8
            java.util.List r1 = kotlin.collections.f0.S(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.a(r1)
            kotlin.reflect.jvm.internal.impl.types.t1 r11 = kotlin.reflect.jvm.internal.impl.types.u1.b(r1)
            java.util.List r1 = r21.G0()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r3 = r1.iterator()
            java.util.ArrayList r13 = new java.util.ArrayList
            r4 = 10
            int r5 = kotlin.collections.f0.d0(r6, r4)
            int r1 = kotlin.collections.f0.d0(r1, r4)
            int r1 = java.lang.Math.min(r5, r1)
            r13.<init>(r1)
        L1c8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1e8
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1e8
            java.lang.Object r1 = r2.next()
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = (kotlin.reflect.jvm.internal.impl.types.c2) r1
            if (r1 != 0) goto L1e3
            goto L1e4
        L1e3:
            r4 = r1
        L1e4:
            r13.add(r4)
            goto L1c8
        L1e8:
            if (r25 == 0) goto L1f0
            boolean r1 = r25.booleanValue()
        L1ee:
            r14 = r1
            goto L1f5
        L1f0:
            boolean r1 = r21.J0()
            goto L1ee
        L1f5:
            r16 = 16
            r17 = 0
            r15 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.w0.m(r11, r12, r13, r14, r15, r16, r17)
            boolean r2 = r9.d()
            if (r2 == 0) goto L208
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.e(r1)
        L208:
            if (r25 == 0) goto L212
            boolean r2 = r9.g()
            if (r2 == 0) goto L212
            r5 = 1
            goto L213
        L212:
            r5 = 0
        L213:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b
            r2.<init>(r1, r10, r5)
            return r2
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g.b c(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g r1, kotlin.reflect.jvm.internal.impl.types.e1 r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r5, boolean r6, boolean r7, int r8, java.lang.Object r9) {
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L6
            r6 = 0
        L6:
            r8 = r8 & 16
            if (r8 == 0) goto Lb
            r7 = 0
        Lb:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r1 = r1.b(r2, r3, r4, r5, r6, r7)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g.a d(kotlin.reflect.jvm.internal.impl.types.m2 r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r22, int r23, boolean r24) {
            r20 = this;
            r0 = r21
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.x0.a(r0)
            r2 = 0
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L10:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r1 == 0) goto Lb2
            boolean r8 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.d1
            r1 = r0
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r1.Q0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r10 = r3.b(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r1.R0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r4 = r3.b(r4, r5, r6, r7, r8, r9)
            r10.b()
            r4.b()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r10.getType()
            if (r3 != 0) goto L48
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r4.getType()
            if (r3 != 0) goto L48
            goto La8
        L48:
            boolean r2 = r10.a()
            if (r2 != 0) goto L8a
            boolean r2 = r4.a()
            if (r2 == 0) goto L55
            goto L8a
        L55:
            if (r8 == 0) goto L71
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r10.getType()
            if (r0 != 0) goto L63
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.Q0()
        L63:
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r4.getType()
            if (r3 != 0) goto L6d
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.R0()
        L6d:
            r2.<init>(r0, r3)
            goto La8
        L71:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r10.getType()
            if (r0 != 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.Q0()
        L7b:
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r4.getType()
            if (r2 != 0) goto L85
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r1.R0()
        L85:
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = kotlin.reflect.jvm.internal.impl.types.w0.e(r0, r2)
            goto La8
        L8a:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r4.getType()
            if (r1 == 0) goto L9d
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r10.getType()
            if (r2 != 0) goto L97
            r2 = r1
        L97:
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = kotlin.reflect.jvm.internal.impl.types.w0.e(r2, r1)
            if (r1 != 0) goto La4
        L9d:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r10.getType()
            kotlin.jvm.internal.g0.m(r1)
        La4:
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = kotlin.reflect.jvm.internal.impl.types.l2.d(r0, r1)
        La8:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a
            int r1 = r10.b()
            r0.<init>(r2, r1)
            return r0
        Lb2:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r1 == 0) goto Lea
            r12 = r0
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = (kotlin.reflect.jvm.internal.impl.types.e1) r12
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r15 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r18 = 8
            r19 = 0
            r16 = 0
            r11 = r20
            r13 = r22
            r14 = r23
            r17 = r24
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b r1 = c(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a
            boolean r3 = r1.a()
            if (r3 == 0) goto Lde
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.l2.d(r0, r3)
            goto Le2
        Lde:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.getType()
        Le2:
            int r1 = r1.b()
            r2.<init>(r0, r1)
            return r2
        Lea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 e(kotlin.reflect.jvm.internal.impl.types.e1 r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.e r0 = r1.a
            boolean r0 = r0.a()
            if (r0 == 0) goto Le
            r0 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = kotlin.reflect.jvm.internal.impl.types.i1.h(r2, r0)
            return r2
        Le:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            r0.<init>(r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.types.t0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "qualifiers"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            r0 = 0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$a r2 = r1.d(r2, r3, r0, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            return r2
    }
}
