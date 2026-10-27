package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class y extends kotlin.reflect.jvm.internal.impl.descriptors.impl.z {
    static final /* synthetic */ boolean h = false;
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.z b;
    private final kotlin.reflect.jvm.internal.impl.types.h2 c;
    private kotlin.reflect.jvm.internal.impl.types.h2 d;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> e;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> f;
    private kotlin.reflect.jvm.internal.impl.types.w1 g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.j1, java.lang.Boolean> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.y a;

        a(kotlin.reflect.jvm.internal.impl.descriptors.impl.y r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean a(kotlin.reflect.jvm.internal.impl.descriptors.j1 r1) {
                r0 = this;
                boolean r1 = r1.E()
                r1 = r1 ^ 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.j1 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.e1, kotlin.reflect.jvm.internal.impl.types.e1> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.y a;

        b(kotlin.reflect.jvm.internal.impl.descriptors.impl.y r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.types.e1 a(kotlin.reflect.jvm.internal.impl.types.e1 r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.y r0 = r1.a
                kotlin.reflect.jvm.internal.impl.types.e1 r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.y.E0(r0, r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 invoke(kotlin.reflect.jvm.internal.impl.types.e1 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.a(r1)
                return r1
        }
    }

    static {
            return
    }

    public y(kotlin.reflect.jvm.internal.impl.descriptors.impl.z r1, kotlin.reflect.jvm.internal.impl.types.h2 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 E0(kotlin.reflect.jvm.internal.impl.descriptors.impl.y r0, kotlin.reflect.jvm.internal.impl.types.e1 r1) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.H0(r1)
            return r0
    }

    private kotlin.reflect.jvm.internal.impl.types.h2 F0() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r3.d
            if (r0 != 0) goto L41
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r3.c
            boolean r0 = r0.k()
            if (r0 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r3.c
            r3.d = r0
            goto L41
        L11:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r3.b
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.util.List r0 = r0.getParameters()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r3.e = r1
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = r3.c
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r1.j()
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r2 = r3.e
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.d0.b(r0, r1, r3, r2)
            r3.d = r0
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r3.e
            kotlin.reflect.jvm.internal.impl.descriptors.impl.y$a r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.y$a
            r1.<init>(r3)
            java.util.List r0 = kotlin.collections.f0.r2(r0, r1)
            r3.f = r0
        L41:
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r3.d
            return r0
    }

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.types.e1 H0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r2 = this;
            if (r3 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r2.c
            boolean r0 = r0.k()
            if (r0 == 0) goto Lb
            goto L17
        Lb:
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r2.F0()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r0.p(r3, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = (kotlin.reflect.jvm.internal.impl.types.e1) r3
        L17:
            return r3
    }

    private static /* synthetic */ void p0(int r15) {
            r0 = 23
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L1f
            if (r15 == r6) goto L1f
            if (r15 == r5) goto L1f
            if (r15 == r4) goto L1f
            if (r15 == r3) goto L1f
            if (r15 == r2) goto L1f
            if (r15 == r1) goto L1f
            if (r15 == r0) goto L1f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L21
        L1f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L21:
            if (r15 == r7) goto L33
            if (r15 == r6) goto L33
            if (r15 == r5) goto L33
            if (r15 == r4) goto L33
            if (r15 == r3) goto L33
            if (r15 == r2) goto L33
            if (r15 == r1) goto L33
            if (r15 == r0) goto L33
            r9 = 2
            goto L34
        L33:
            r9 = 3
        L34:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L5b
            if (r15 == r6) goto L56
            if (r15 == r5) goto L51
            if (r15 == r4) goto L56
            if (r15 == r3) goto L5b
            if (r15 == r2) goto L51
            if (r15 == r1) goto L56
            if (r15 == r0) goto L4c
            r9[r11] = r10
            goto L5f
        L4c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L5f
        L51:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L5f
        L56:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L5f
        L5b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L5f:
            java.lang.String r11 = "getMemberScope"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "substitute"
            r14 = 1
            switch(r15) {
                case 2: goto Lc2;
                case 3: goto Lc2;
                case 4: goto Lbf;
                case 5: goto Lc2;
                case 6: goto Lc2;
                case 7: goto Lbf;
                case 8: goto Lc2;
                case 9: goto Lbf;
                case 10: goto Lc2;
                case 11: goto Lbf;
                case 12: goto Lbc;
                case 13: goto Lc2;
                case 14: goto Lbc;
                case 15: goto Lb7;
                case 16: goto Lb2;
                case 17: goto Lad;
                case 18: goto La8;
                case 19: goto La3;
                case 20: goto L9e;
                case 21: goto L99;
                case 22: goto L94;
                case 23: goto Lc2;
                case 24: goto L91;
                case 25: goto L8c;
                case 26: goto L87;
                case 27: goto L82;
                case 28: goto L7d;
                case 29: goto L78;
                case 30: goto L73;
                case 31: goto L6e;
                default: goto L69;
            }
        L69:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto Lc4
        L6e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto Lc4
        L73:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto Lc4
        L78:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto Lc4
        L7d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto Lc4
        L82:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto Lc4
        L87:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto Lc4
        L8c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto Lc4
        L91:
            r9[r14] = r13
            goto Lc4
        L94:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto Lc4
        L99:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto Lc4
        L9e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto Lc4
        La3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto Lc4
        La8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto Lc4
        Lad:
            java.lang.String r10 = "getContextReceivers"
            r9[r14] = r10
            goto Lc4
        Lb2:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto Lc4
        Lb7:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto Lc4
        Lbc:
            r9[r14] = r12
            goto Lc4
        Lbf:
            r9[r14] = r11
            goto Lc4
        Lc2:
            r9[r14] = r10
        Lc4:
            if (r15 == r7) goto Ldb
            if (r15 == r6) goto Ldb
            if (r15 == r5) goto Ldb
            if (r15 == r4) goto Ldb
            if (r15 == r3) goto Ldb
            if (r15 == r2) goto Ldb
            if (r15 == r1) goto Ld8
            if (r15 == r0) goto Ld5
            goto Ldd
        Ld5:
            r9[r7] = r13
            goto Ldd
        Ld8:
            r9[r7] = r12
            goto Ldd
        Ldb:
            r9[r7] = r11
        Ldd:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto Lf7
            if (r15 == r6) goto Lf7
            if (r15 == r5) goto Lf7
            if (r15 == r4) goto Lf7
            if (r15 == r3) goto Lf7
            if (r15 == r2) goto Lf7
            if (r15 == r1) goto Lf7
            if (r15 == r0) goto Lf7
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto Lfc
        Lf7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        Lfc:
            throw r15
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k G() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.G()
            if (r0 != 0) goto Ld
            r1 = 28
            p0(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r3) {
            r2 = this;
            if (r3 != 0) goto L7
            r0 = 23
            p0(r0)
        L7:
            boolean r0 = r3.k()
            if (r0 == 0) goto Le
            return r2
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.y r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.y
            kotlin.reflect.jvm.internal.impl.types.f2 r3 = r3.j()
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = r2.F0()
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r1.j()
            kotlin.reflect.jvm.internal.impl.types.h2 r3 = kotlin.reflect.jvm.internal.impl.types.h2.h(r3, r1)
            r0.<init>(r2, r3)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k H() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r0)
            kotlin.reflect.jvm.internal.impl.types.checker.g r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.r(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r2.o0(r0)
            if (r0 != 0) goto L15
            r1 = 12
            p0(r1)
        L15:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 5
            p0(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 6
            p0(r0)
        Lc:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r0.T(r2, r3)
            kotlin.reflect.jvm.internal.impl.types.h2 r3 = r1.c
            boolean r3 = r3.k()
            if (r3 == 0) goto L21
            if (r2 != 0) goto L20
            r3 = 7
            p0(r3)
        L20:
            return r2
        L21:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.t r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.t
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r1.F0()
            r3.<init>(r2, r0)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 V() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.a(r0, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.a()
            if (r0 != 0) goto Ld
            r1 = 21
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
            if (r0 != 0) goto Ld
            r1 = 22
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.G0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> f() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r5.b
            java.util.Collection r0 = r0.f()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r2
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r2.n()
            kotlin.reflect.jvm.internal.impl.descriptors.c r4 = r2.a()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r3.i(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r2.i()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r3.q(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.s r4 = r2.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r3.p(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r2 = r2.h()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r3.s(r2)
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.j(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r2.build()
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r2
            kotlin.reflect.jvm.internal.impl.types.h2 r3 = r5.F0()
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = r2.c(r3)
            r1.add(r2)
            goto L13
        L5a:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.o1<kotlin.reflect.jvm.internal.impl.types.e1> g0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = r0.g0()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.y$b r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.y$b
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = r0.b(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            if (r0 != 0) goto Ld
            r1 = 19
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            if (r0 != 0) goto Ld
            r1 = 20
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            if (r0 != 0) goto L9
            r1 = 29
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0, kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r0.getVisibility()
            if (r0 != 0) goto Ld
            r1 = 27
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind h() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r0.h()
            if (r0 != 0) goto Ld
            r1 = 25
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r0.i()
            if (r0 != 0) goto Ld
            r1 = 26
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean i0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.i0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.isExternal()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean isInline() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> j0() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L9
            r1 = 17
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean k() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean l0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.l0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 o() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r5.b
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = r5.c
            boolean r1 = r1.k()
            if (r1 == 0) goto L15
            if (r0 != 0) goto L14
            r1 = 0
            p0(r1)
        L14:
            return r0
        L15:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r5.g
            if (r1 != 0) goto L4f
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = r5.F0()
            java.util.Collection r0 = r0.i()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r1.p(r3, r4)
            r2.add(r3)
            goto L2e
        L44:
            kotlin.reflect.jvm.internal.impl.types.v r0 = new kotlin.reflect.jvm.internal.impl.types.v
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r1 = r5.e
            kotlin.reflect.jvm.internal.impl.storage.n r3 = kotlin.reflect.jvm.internal.impl.storage.f.e
            r0.<init>(r5, r1, r2, r3)
            r5.g = r0
        L4f:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r5.g
            if (r0 != 0) goto L57
            r1 = 1
            p0(r1)
        L57:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
            r2 = this;
            if (r3 != 0) goto L7
            r0 = 13
            p0(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r0.o0(r3)
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = r2.c
            boolean r0 = r0.k()
            if (r0 == 0) goto L1d
            if (r3 != 0) goto L1c
            r0 = 14
            p0(r0)
        L1c:
            return r3
        L1d:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.t r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.t
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = r2.F0()
            r0.<init>(r3, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean q0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.q0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r2.b
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r0()
            if (r0 != 0) goto Ld
            r1 = 15
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 s() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r5.o()
            java.util.List r0 = r0.getParameters()
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.types.j2.g(r0)
            kotlin.reflect.jvm.internal.impl.types.y r1 = kotlin.reflect.jvm.internal.impl.types.y.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r5.getAnnotations()
            r3 = 0
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r1.a(r2, r3, r3)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r5.o()
            r3 = 0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = r5.H()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.w0.o(r1, r2, r0, r3, r4)
            if (r0 != 0) goto L2b
            r1 = 16
            p0(r1)
        L2b:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d s0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.s0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> t() {
            r2 = this;
            r2.F0()
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r2.f
            if (r0 != 0) goto Lc
            r1 = 30
            p0(r1)
        Lc:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean u() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.u()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean v() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.v()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k v0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 10
            p0(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r1)
            kotlin.reflect.jvm.internal.impl.types.checker.g r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.r(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r1.T(r2, r0)
            if (r2 != 0) goto L1a
            r0 = 11
            p0(r0)
        L1a:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean w() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            boolean r0 = r0.w()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.c z() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r0.z()
            return r0
    }
}
