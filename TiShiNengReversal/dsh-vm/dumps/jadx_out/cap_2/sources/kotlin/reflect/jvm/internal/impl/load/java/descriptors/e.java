package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class e extends kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.a {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<kotlin.reflect.jvm.internal.impl.descriptors.q1> G = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<java.lang.Boolean> H = null;
    static final /* synthetic */ boolean I = false;
    private kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c E;
    private final boolean F;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<kotlin.reflect.jvm.internal.impl.descriptors.q1> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<java.lang.Boolean> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum c extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c> {
        public static final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c c = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c d = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c e = null;
        public static final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c f = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c[] g = null;
        public final boolean a;
        public final boolean b;

        static {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r0 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c
                java.lang.String r1 = "NON_STABLE_DECLARED"
                r2 = 0
                r0.<init>(r1, r2, r2, r2)
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.c = r0
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r1 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c
                java.lang.String r3 = "STABLE_DECLARED"
                r4 = 1
                r1.<init>(r3, r4, r4, r2)
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.d = r1
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r3 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c
                java.lang.String r5 = "NON_STABLE_SYNTHESIZED"
                r6 = 2
                r3.<init>(r5, r6, r2, r4)
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.e = r3
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r5 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c
                java.lang.String r7 = "STABLE_SYNTHESIZED"
                r8 = 3
                r5.<init>(r7, r8, r4, r4)
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.f = r5
                r7 = 4
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c[] r7 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.g = r7
                return
        }

        c(java.lang.String r1, int r2, boolean r3, boolean r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                r0.b = r4
                return
        }

        private static /* synthetic */ void a(int r2) {
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus"
                r1 = 0
                r2[r1] = r0
                java.lang.String r0 = "get"
                r1 = 1
                r2[r1] = r0
                java.lang.String r0 = "@NotNull method %s.%s must not return null"
                java.lang.String r2 = java.lang.String.format(r0, r2)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r2)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c b(boolean r0, boolean r1) {
                if (r0 == 0) goto La
                if (r1 == 0) goto L7
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.f
                goto L11
            L7:
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.d
                goto L11
            La:
                if (r1 == 0) goto Lf
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.e
                goto L11
            Lf:
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.c
            L11:
                if (r0 != 0) goto L17
                r1 = 0
                a(r1)
            L17:
                return r0
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c> r0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r1 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c[] values() {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c[] r0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.g
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c[] r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c[]) r0
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.G = r0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$b r0 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$b
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.H = r0
            return
    }

    protected e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d1 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r7, boolean r8) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r4 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r5 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r6 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            if (r7 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = r1
            r3 = 0
            r2.E = r3
            r2.F = r8
            return
    }

    private static /* synthetic */ void T(int r11) {
            r0 = 21
            r1 = 18
            r2 = 13
            if (r11 == r2) goto Lf
            if (r11 == r1) goto Lf
            if (r11 == r0) goto Lf
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L11
        Lf:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L11:
            r4 = 2
            if (r11 == r2) goto L1a
            if (r11 == r1) goto L1a
            if (r11 == r0) goto L1a
            r5 = 3
            goto L1b
        L1a:
            r5 = 2
        L1b:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor"
            r7 = 0
            switch(r11) {
                case 1: goto L5d;
                case 2: goto L58;
                case 3: goto L53;
                case 4: goto L4e;
                case 5: goto L23;
                case 6: goto L5d;
                case 7: goto L58;
                case 8: goto L4e;
                case 9: goto L49;
                case 10: goto L44;
                case 11: goto L3f;
                case 12: goto L3a;
                case 13: goto L37;
                case 14: goto L32;
                case 15: goto L53;
                case 16: goto L5d;
                case 17: goto L4e;
                case 18: goto L37;
                case 19: goto L2d;
                case 20: goto L28;
                case 21: goto L37;
                default: goto L23;
            }
        L23:
            java.lang.String r8 = "containingDeclaration"
            r5[r7] = r8
            goto L61
        L28:
            java.lang.String r8 = "enhancedReturnType"
            r5[r7] = r8
            goto L61
        L2d:
            java.lang.String r8 = "enhancedValueParameterTypes"
            r5[r7] = r8
            goto L61
        L32:
            java.lang.String r8 = "newOwner"
            r5[r7] = r8
            goto L61
        L37:
            r5[r7] = r6
            goto L61
        L3a:
            java.lang.String r8 = "visibility"
            r5[r7] = r8
            goto L61
        L3f:
            java.lang.String r8 = "unsubstitutedValueParameters"
            r5[r7] = r8
            goto L61
        L44:
            java.lang.String r8 = "typeParameters"
            r5[r7] = r8
            goto L61
        L49:
            java.lang.String r8 = "contextReceiverParameters"
            r5[r7] = r8
            goto L61
        L4e:
            java.lang.String r8 = "source"
            r5[r7] = r8
            goto L61
        L53:
            java.lang.String r8 = "kind"
            r5[r7] = r8
            goto L61
        L58:
            java.lang.String r8 = "name"
            r5[r7] = r8
            goto L61
        L5d:
            java.lang.String r8 = "annotations"
            r5[r7] = r8
        L61:
            java.lang.String r7 = "initialize"
            java.lang.String r8 = "createSubstitutedCopy"
            java.lang.String r9 = "enhance"
            r10 = 1
            if (r11 == r2) goto L77
            if (r11 == r1) goto L74
            if (r11 == r0) goto L71
            r5[r10] = r6
            goto L79
        L71:
            r5[r10] = r9
            goto L79
        L74:
            r5[r10] = r8
            goto L79
        L77:
            r5[r10] = r7
        L79:
            switch(r11) {
                case 5: goto L8a;
                case 6: goto L8a;
                case 7: goto L8a;
                case 8: goto L8a;
                case 9: goto L87;
                case 10: goto L87;
                case 11: goto L87;
                case 12: goto L87;
                case 13: goto L8e;
                case 14: goto L84;
                case 15: goto L84;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L8e;
                case 19: goto L81;
                case 20: goto L81;
                case 21: goto L8e;
                default: goto L7c;
            }
        L7c:
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L8e
        L81:
            r5[r4] = r9
            goto L8e
        L84:
            r5[r4] = r8
            goto L8e
        L87:
            r5[r4] = r7
            goto L8e
        L8a:
            java.lang.String r6 = "createJavaMethod"
            r5[r4] = r6
        L8e:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r11 == r2) goto L9e
            if (r11 == r1) goto L9e
            if (r11 == r0) goto L9e
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r3)
            goto La3
        L9e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r3)
        La3:
            throw r11
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.e k1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r12, boolean r13) {
            if (r9 != 0) goto L6
            r0 = 5
            T(r0)
        L6:
            if (r10 != 0) goto Lc
            r0 = 6
            T(r0)
        Lc:
            if (r11 != 0) goto L12
            r0 = 7
            T(r0)
        L12:
            if (r12 != 0) goto L19
            r0 = 8
            T(r0)
        L19:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r1 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r2 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o0, kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    protected /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r1 = r0.l1(r1, r2, r3, r4, r5, r6)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    public boolean L0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r0 = r1.E
            boolean r0 = r0.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 j1(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r4, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r7, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.Modality r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r9, @org.jetbrains.annotations.Nullable java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> r10) {
            r1 = this;
            if (r4 != 0) goto L7
            r0 = 9
            T(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 10
            T(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 11
            T(r0)
        L15:
            if (r9 != 0) goto L1c
            r0 = 12
            T(r0)
        L1c:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r2 = super.j1(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = r1
            kotlin.reflect.jvm.internal.impl.util.s r4 = kotlin.reflect.jvm.internal.impl.util.s.a
            kotlin.reflect.jvm.internal.impl.util.g r4 = r4.a(r2)
            boolean r4 = r4.a()
            r1.a1(r4)
            if (r2 != 0) goto L35
            r4 = 13
            T(r4)
        L35:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.a k0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull java.util.List r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.Nullable kotlin.Pair r4) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r1 = r0.m1(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.descriptors.e l1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r12, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r15) {
            r9 = this;
            if (r10 != 0) goto L7
            r0 = 14
            T(r0)
        L7:
            if (r12 != 0) goto Le
            r0 = 15
            T(r0)
        Le:
            if (r14 != 0) goto L15
            r0 = 16
            T(r0)
        L15:
            if (r15 != 0) goto L1c
            r0 = 17
            T(r0)
        L1c:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r1 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.e
            r3 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r3
            if (r13 == 0) goto L25
        L23:
            r5 = r13
            goto L2a
        L25:
            kotlin.reflect.jvm.internal.impl.name.f r13 = r9.getName()
            goto L23
        L2a:
            boolean r8 = r9.F
            r2 = r10
            r6 = r12
            r4 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            boolean r10 = r9.L0()
            boolean r11 = r9.n0()
            r1.n1(r10, r11)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.e m1(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4, @org.jetbrains.annotations.Nullable kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> r5) {
            r1 = this;
            if (r3 != 0) goto L7
            r0 = 19
            T(r0)
        L7:
            if (r4 != 0) goto Le
            r0 = 20
            T(r0)
        Le:
            java.util.List r0 = r1.g()
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a(r3, r0, r1)
            if (r2 != 0) goto L1a
            r2 = 0
            goto L24
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = kotlin.reflect.jvm.internal.impl.resolve.h.i(r1, r2, r0)
        L24:
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r0 = r1.n()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r0.n(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r3.h(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r3.b(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.m()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.g()
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r2.build()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) r2
            if (r5 == 0) goto L51
            java.lang.Object r3 = r5.getFirst()
            kotlin.reflect.jvm.internal.impl.descriptors.a$a r3 = (kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a) r3
            java.lang.Object r4 = r5.getSecond()
            r2.P0(r3, r4)
        L51:
            if (r2 != 0) goto L58
            r3 = 21
            T(r3)
        L58:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean n0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r0 = r1.E
            boolean r0 = r0.b
            return r0
    }

    public void n1(boolean r1, boolean r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e$c r1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.c.b(r1, r2)
            r0.E = r1
            return
    }
}
