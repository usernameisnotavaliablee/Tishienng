package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.z {
    static final /* synthetic */ boolean f = false;
    private final kotlin.reflect.jvm.internal.impl.name.f b;
    protected final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.e1> c;
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.k> d;
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.descriptors.z0> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a, reason: collision with other inner class name */
    class C0031a implements kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.e1> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.a a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a$a, reason: collision with other inner class name */
        class C0032a implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.types.e1> {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.a.C0031a a;

            C0032a(kotlin.reflect.jvm.internal.impl.descriptors.impl.a.C0031a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public kotlin.reflect.jvm.internal.impl.types.e1 a(kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
                    r2 = this;
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a r0 = r2.a
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.a r0 = r0.a
                    kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r3.f(r0)
                    if (r0 != 0) goto L17
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a r3 = r2.a
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.a r3 = r3.a
                    kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.e1> r3 = r3.c
                    java.lang.Object r3 = r3.invoke()
                    kotlin.reflect.jvm.internal.impl.types.e1 r3 = (kotlin.reflect.jvm.internal.impl.types.e1) r3
                    return r3
                L17:
                    boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
                    if (r1 == 0) goto L2f
                    r3 = r0
                    kotlin.reflect.jvm.internal.impl.descriptors.i1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r3
                    kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
                    java.util.List r0 = r0.getParameters()
                    java.util.List r0 = kotlin.reflect.jvm.internal.impl.types.j2.g(r0)
                    kotlin.reflect.jvm.internal.impl.types.e1 r3 = kotlin.reflect.jvm.internal.impl.types.w0.c(r3, r0)
                    return r3
                L2f:
                    boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.z
                    if (r1 == 0) goto L46
                    kotlin.reflect.jvm.internal.impl.types.w1 r1 = r0.o()
                    kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.a(r3)
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.z r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.z) r0
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r0.o0(r3)
                    kotlin.reflect.jvm.internal.impl.types.e1 r3 = kotlin.reflect.jvm.internal.impl.types.j2.v(r1, r3, r2)
                    return r3
                L46:
                    kotlin.reflect.jvm.internal.impl.types.e1 r3 = r0.s()
                    return r3
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 invoke(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
                    r0 = this;
                    kotlin.reflect.jvm.internal.impl.types.checker.g r1 = (kotlin.reflect.jvm.internal.impl.types.checker.g) r1
                    kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.a(r1)
                    return r1
            }
        }

        C0031a(kotlin.reflect.jvm.internal.impl.descriptors.impl.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.types.e1 a() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.a r0 = r3.a
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r0.H()
                kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a$a r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a$a
                r2.<init>(r3)
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.j2.u(r0, r1, r2)
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 invoke() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.k> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.a a;

        b(kotlin.reflect.jvm.internal.impl.descriptors.impl.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.resolve.scopes.k a() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.resolve.scopes.g r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.g
                kotlin.reflect.jvm.internal.impl.descriptors.impl.a r1 = r2.a
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r1.H()
                r0.<init>(r1)
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k invoke() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.z0> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.a a;

        c(kotlin.reflect.jvm.internal.impl.descriptors.impl.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.z0 a() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.t r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.t
                kotlin.reflect.jvm.internal.impl.descriptors.impl.a r1 = r2.a
                r0.<init>(r1)
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.z0 invoke() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r1.a()
                return r0
        }
    }

    static {
            return
    }

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            p0(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            p0(r0)
        Lc:
            r1.<init>()
            r1.b = r3
            kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r2.e(r3)
            r1.c = r3
            kotlin.reflect.jvm.internal.impl.descriptors.impl.a$b r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.a$b
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r2.e(r3)
            r1.d = r3
            kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.e = r2
            return
    }

    private static /* synthetic */ void p0(int r19) {
            r0 = r19
            r1 = 20
            r2 = 19
            r3 = 17
            r4 = 16
            r5 = 14
            r6 = 12
            r7 = 9
            r8 = 6
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            if (r0 == r12) goto L30
            if (r0 == r11) goto L30
            if (r0 == r10) goto L30
            if (r0 == r9) goto L30
            if (r0 == r8) goto L30
            if (r0 == r7) goto L30
            if (r0 == r6) goto L30
            if (r0 == r5) goto L30
            if (r0 == r4) goto L30
            if (r0 == r3) goto L30
            if (r0 == r2) goto L30
            if (r0 == r1) goto L30
            java.lang.String r13 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L32
        L30:
            java.lang.String r13 = "@NotNull method %s.%s must not return null"
        L32:
            if (r0 == r12) goto L4c
            if (r0 == r11) goto L4c
            if (r0 == r10) goto L4c
            if (r0 == r9) goto L4c
            if (r0 == r8) goto L4c
            if (r0 == r7) goto L4c
            if (r0 == r6) goto L4c
            if (r0 == r5) goto L4c
            if (r0 == r4) goto L4c
            if (r0 == r3) goto L4c
            if (r0 == r2) goto L4c
            if (r0 == r1) goto L4c
            r14 = 3
            goto L4d
        L4c:
            r14 = 2
        L4d:
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor"
            r16 = 0
            switch(r0) {
                case 1: goto L72;
                case 2: goto L6f;
                case 3: goto L6f;
                case 4: goto L6f;
                case 5: goto L6f;
                case 6: goto L6f;
                case 7: goto L6a;
                case 8: goto L65;
                case 9: goto L6f;
                case 10: goto L60;
                case 11: goto L65;
                case 12: goto L6f;
                case 13: goto L6a;
                case 14: goto L6f;
                case 15: goto L60;
                case 16: goto L6f;
                case 17: goto L6f;
                case 18: goto L5b;
                case 19: goto L6f;
                case 20: goto L6f;
                default: goto L56;
            }
        L56:
            java.lang.String r17 = "storageManager"
            r14[r16] = r17
            goto L76
        L5b:
            java.lang.String r17 = "substitutor"
            r14[r16] = r17
            goto L76
        L60:
            java.lang.String r17 = "typeSubstitution"
            r14[r16] = r17
            goto L76
        L65:
            java.lang.String r17 = "kotlinTypeRefiner"
            r14[r16] = r17
            goto L76
        L6a:
            java.lang.String r17 = "typeArguments"
            r14[r16] = r17
            goto L76
        L6f:
            r14[r16] = r15
            goto L76
        L72:
            java.lang.String r17 = "name"
            r14[r16] = r17
        L76:
            java.lang.String r16 = "getMemberScope"
            java.lang.String r17 = "substitute"
            r18 = 1
            if (r0 == r12) goto Lbb
            if (r0 == r11) goto Lb6
            if (r0 == r10) goto Lb1
            if (r0 == r9) goto Lac
            if (r0 == r8) goto La7
            if (r0 == r7) goto La4
            if (r0 == r6) goto La4
            if (r0 == r5) goto La4
            if (r0 == r4) goto La4
            if (r0 == r3) goto L9f
            if (r0 == r2) goto L9c
            if (r0 == r1) goto L97
            r14[r18] = r15
            goto Lbf
        L97:
            java.lang.String r15 = "getDefaultType"
            r14[r18] = r15
            goto Lbf
        L9c:
            r14[r18] = r17
            goto Lbf
        L9f:
            java.lang.String r15 = "getUnsubstitutedMemberScope"
            r14[r18] = r15
            goto Lbf
        La4:
            r14[r18] = r16
            goto Lbf
        La7:
            java.lang.String r15 = "getContextReceivers"
            r14[r18] = r15
            goto Lbf
        Lac:
            java.lang.String r15 = "getThisAsReceiverParameter"
            r14[r18] = r15
            goto Lbf
        Lb1:
            java.lang.String r15 = "getUnsubstitutedInnerClassesScope"
            r14[r18] = r15
            goto Lbf
        Lb6:
            java.lang.String r15 = "getOriginal"
            r14[r18] = r15
            goto Lbf
        Lbb:
            java.lang.String r15 = "getName"
            r14[r18] = r15
        Lbf:
            switch(r0) {
                case 2: goto Lcc;
                case 3: goto Lcc;
                case 4: goto Lcc;
                case 5: goto Lcc;
                case 6: goto Lcc;
                case 7: goto Lca;
                case 8: goto Lca;
                case 9: goto Lcc;
                case 10: goto Lca;
                case 11: goto Lca;
                case 12: goto Lcc;
                case 13: goto Lca;
                case 14: goto Lcc;
                case 15: goto Lca;
                case 16: goto Lcc;
                case 17: goto Lcc;
                case 18: goto Lc7;
                case 19: goto Lcc;
                case 20: goto Lcc;
                default: goto Lc2;
            }
        Lc2:
            java.lang.String r15 = "<init>"
            r14[r12] = r15
            goto Lcc
        Lc7:
            r14[r12] = r17
            goto Lcc
        Lca:
            r14[r12] = r16
        Lcc:
            java.lang.String r13 = java.lang.String.format(r13, r14)
            if (r0 == r12) goto Lee
            if (r0 == r11) goto Lee
            if (r0 == r10) goto Lee
            if (r0 == r9) goto Lee
            if (r0 == r8) goto Lee
            if (r0 == r7) goto Lee
            if (r0 == r6) goto Lee
            if (r0 == r5) goto Lee
            if (r0 == r4) goto Lee
            if (r0 == r3) goto Lee
            if (r0 == r2) goto Lee
            if (r0 == r1) goto Lee
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r13)
            goto Lf3
        Lee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
        Lf3:
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d E0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 18
            p0(r0)
        L7:
            boolean r0 = r2.k()
            if (r0 == 0) goto Le
            return r1
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.y r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.y
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k G() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r0 = r2.d
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r0
            if (r0 != 0) goto Le
            r1 = 4
            p0(r1)
        Le:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k H() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r2)
            kotlin.reflect.jvm.internal.impl.types.checker.g r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.r(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r2.o0(r0)
            if (r0 != 0) goto L13
            r1 = 17
            p0(r1)
        L13:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 10
            p0(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 11
            p0(r0)
        Le:
            boolean r0 = r2.f()
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r1.o0(r3)
            if (r2 != 0) goto L1f
            r3 = 12
            p0(r3)
        L1f:
            return r2
        L20:
            kotlin.reflect.jvm.internal.impl.types.h2 r2 = kotlin.reflect.jvm.internal.impl.types.h2.g(r2)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.t r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.t
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r1.o0(r3)
            r0.<init>(r3, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 V() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.descriptors.z0> r0 = r2.e
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r0
            if (r0 != 0) goto Le
            r1 = 5
            p0(r1)
        Le:
            return r0
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
            r0 = this;
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.E0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.b
            if (r0 != 0) goto L8
            r1 = 2
            p0(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> j0() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L8
            r1 = 6
            p0(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 s() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.e1> r0 = r2.c
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            if (r0 != 0) goto Lf
            r1 = 20
            p0(r1)
        Lf:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k v0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 15
            p0(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r1)
            kotlin.reflect.jvm.internal.impl.types.checker.g r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.r(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r1.T(r2, r0)
            if (r2 != 0) goto L1a
            r0 = 16
            p0(r0)
        L1a:
            return r2
    }
}
