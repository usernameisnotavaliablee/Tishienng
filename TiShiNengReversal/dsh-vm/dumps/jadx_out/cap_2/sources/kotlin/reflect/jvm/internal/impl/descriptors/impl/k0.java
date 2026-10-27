package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class k0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.x0 implements kotlin.reflect.jvm.internal.impl.descriptors.w0 {
    private kotlin.reflect.jvm.internal.impl.descriptors.y0 A;
    private boolean B;
    private kotlin.reflect.jvm.internal.impl.descriptors.v C;
    private kotlin.reflect.jvm.internal.impl.descriptors.v D;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality k;
    private kotlin.reflect.jvm.internal.impl.descriptors.s l;
    private java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w0> m;
    private final kotlin.reflect.jvm.internal.impl.descriptors.w0 n;
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> v;
    private kotlin.reflect.jvm.internal.impl.descriptors.z0 w;
    private kotlin.reflect.jvm.internal.impl.descriptors.z0 x;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> y;
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a {
        private kotlin.reflect.jvm.internal.impl.descriptors.k a;
        private kotlin.reflect.jvm.internal.impl.descriptors.Modality b;
        private kotlin.reflect.jvm.internal.impl.descriptors.s c;
        private kotlin.reflect.jvm.internal.impl.descriptors.w0 d;
        private boolean e;
        private kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind f;
        private kotlin.reflect.jvm.internal.impl.types.f2 g;
        private boolean h;
        private kotlin.reflect.jvm.internal.impl.descriptors.z0 i;
        private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> j;
        private kotlin.reflect.jvm.internal.impl.name.f k;
        private kotlin.reflect.jvm.internal.impl.types.t0 l;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 m;

        public a(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r3) {
                r2 = this;
                r2.m = r3
                r2.<init>()
                kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r3.b()
                r2.a = r0
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r3.i()
                r2.b = r0
                kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r3.getVisibility()
                r2.c = r0
                r0 = 0
                r2.d = r0
                r1 = 0
                r2.e = r1
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = r3.h()
                r2.f = r1
                kotlin.reflect.jvm.internal.impl.types.f2 r1 = kotlin.reflect.jvm.internal.impl.types.f2.b
                r2.g = r1
                r1 = 1
                r2.h = r1
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.I0(r3)
                r2.i = r1
                r2.j = r0
                kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
                r2.k = r0
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
                r2.l = r3
                return
        }

        private static /* synthetic */ void a(int r24) {
                r0 = r24
                r1 = 17
                r2 = 16
                r3 = 14
                r4 = 13
                r5 = 19
                r6 = 11
                r7 = 9
                r8 = 7
                r9 = 5
                r10 = 3
                r11 = 2
                r12 = 1
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
                java.lang.String r15 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration"
                r16 = 0
                switch(r0) {
                    case 1: goto L7e;
                    case 2: goto L7e;
                    case 3: goto L7e;
                    case 4: goto L79;
                    case 5: goto L7e;
                    case 6: goto L74;
                    case 7: goto L7e;
                    case 8: goto L6f;
                    case 9: goto L7e;
                    case 10: goto L6a;
                    case 11: goto L7e;
                    case 12: goto L65;
                    case 13: goto L7e;
                    case 14: goto L7e;
                    case 15: goto L60;
                    case 16: goto L7e;
                    case 17: goto L7e;
                    case 18: goto L5b;
                    case 19: goto L7e;
                    default: goto L56;
                }
            L56:
                java.lang.String r17 = "owner"
                r14[r16] = r17
                goto L80
            L5b:
                java.lang.String r17 = "name"
                r14[r16] = r17
                goto L80
            L60:
                java.lang.String r17 = "substitution"
                r14[r16] = r17
                goto L80
            L65:
                java.lang.String r17 = "typeParameters"
                r14[r16] = r17
                goto L80
            L6a:
                java.lang.String r17 = "kind"
                r14[r16] = r17
                goto L80
            L6f:
                java.lang.String r17 = "visibility"
                r14[r16] = r17
                goto L80
            L74:
                java.lang.String r17 = "modality"
                r14[r16] = r17
                goto L80
            L79:
                java.lang.String r17 = "type"
                r14[r16] = r17
                goto L80
            L7e:
                r14[r16] = r15
            L80:
                java.lang.String r16 = "setOwner"
                java.lang.String r17 = "setReturnType"
                java.lang.String r18 = "setModality"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "setKind"
                java.lang.String r21 = "setTypeParameters"
                java.lang.String r22 = "setSubstitution"
                java.lang.String r23 = "setName"
                if (r0 == r12) goto Ld4
                if (r0 == r11) goto Lcf
                if (r0 == r10) goto Lca
                if (r0 == r9) goto Lc7
                if (r0 == r8) goto Lc4
                if (r0 == r7) goto Lc1
                if (r0 == r6) goto Lbe
                if (r0 == r5) goto Lbb
                if (r0 == r4) goto Lb8
                if (r0 == r3) goto Lb3
                if (r0 == r2) goto Lb0
                if (r0 == r1) goto Lab
                r14[r12] = r15
                goto Ld6
            Lab:
                java.lang.String r15 = "setCopyOverrides"
                r14[r12] = r15
                goto Ld6
            Lb0:
                r14[r12] = r22
                goto Ld6
            Lb3:
                java.lang.String r15 = "setDispatchReceiverParameter"
                r14[r12] = r15
                goto Ld6
            Lb8:
                r14[r12] = r21
                goto Ld6
            Lbb:
                r14[r12] = r23
                goto Ld6
            Lbe:
                r14[r12] = r20
                goto Ld6
            Lc1:
                r14[r12] = r19
                goto Ld6
            Lc4:
                r14[r12] = r18
                goto Ld6
            Lc7:
                r14[r12] = r17
                goto Ld6
            Lca:
                java.lang.String r15 = "setPreserveSourceElement"
                r14[r12] = r15
                goto Ld6
            Lcf:
                java.lang.String r15 = "setOriginal"
                r14[r12] = r15
                goto Ld6
            Ld4:
                r14[r12] = r16
            Ld6:
                switch(r0) {
                    case 1: goto Lf0;
                    case 2: goto Lf0;
                    case 3: goto Lf0;
                    case 4: goto Lee;
                    case 5: goto Lf0;
                    case 6: goto Leb;
                    case 7: goto Lf0;
                    case 8: goto Le8;
                    case 9: goto Lf0;
                    case 10: goto Le5;
                    case 11: goto Lf0;
                    case 12: goto Le2;
                    case 13: goto Lf0;
                    case 14: goto Lf0;
                    case 15: goto Ldf;
                    case 16: goto Lf0;
                    case 17: goto Lf0;
                    case 18: goto Ldc;
                    case 19: goto Lf0;
                    default: goto Ld9;
                }
            Ld9:
                r14[r11] = r16
                goto Lf0
            Ldc:
                r14[r11] = r23
                goto Lf0
            Ldf:
                r14[r11] = r22
                goto Lf0
            Le2:
                r14[r11] = r21
                goto Lf0
            Le5:
                r14[r11] = r20
                goto Lf0
            Le8:
                r14[r11] = r19
                goto Lf0
            Leb:
                r14[r11] = r18
                goto Lf0
            Lee:
                r14[r11] = r17
            Lf0:
                java.lang.String r13 = java.lang.String.format(r13, r14)
                if (r0 == r12) goto L112
                if (r0 == r11) goto L112
                if (r0 == r10) goto L112
                if (r0 == r9) goto L112
                if (r0 == r8) goto L112
                if (r0 == r7) goto L112
                if (r0 == r6) goto L112
                if (r0 == r5) goto L112
                if (r0 == r4) goto L112
                if (r0 == r3) goto L112
                if (r0 == r2) goto L112
                if (r0 == r1) goto L112
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r13)
                goto L117
            L112:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r13)
            L117:
                throw r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k b(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.a
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 c(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.l
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.z0 d(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.i
                return r0
        }

        static /* synthetic */ boolean e(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                boolean r0 = r0.h
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.Modality f(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r0.b
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.s g(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r0.c
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.w0 h(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.d
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind i(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r0.f
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f j(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.name.f r0 = r0.k
                return r0
        }

        static /* synthetic */ boolean k(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                boolean r0 = r0.e
                return r0
        }

        static /* synthetic */ java.util.List l(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r0.j
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.f2 m(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r0) {
                kotlin.reflect.jvm.internal.impl.types.f2 r0 = r0.g
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.w0 n() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r0 = r1.m
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.M0(r1)
                return r0
        }

        kotlin.reflect.jvm.internal.impl.descriptors.x0 o() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.d
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r0.getGetter()
                return r0
        }

        kotlin.reflect.jvm.internal.impl.descriptors.y0 p() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.d
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r0.getSetter()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a q(boolean r1) {
                r0 = this;
                r0.h = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 10
                a(r0)
            L7:
                r1.f = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 6
                a(r0)
            L6:
                r1.b = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a t(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r1
                r0.d = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                r1.a = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 15
                a(r0)
            L7:
                r1.g = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
                r1 = this;
                if (r2 != 0) goto L7
                r0 = 8
                a(r0)
            L7:
                r1.c = r2
                return r1
        }
    }

    protected k0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r9, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.w0 r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23) {
            r8 = this;
            r7 = r16
            if (r9 != 0) goto L8
            r0 = 0
            T(r0)
        L8:
            if (r11 != 0) goto Le
            r0 = 1
            T(r0)
        Le:
            if (r12 != 0) goto L14
            r0 = 2
            T(r0)
        L14:
            if (r13 != 0) goto L1a
            r0 = 3
            T(r0)
        L1a:
            if (r15 != 0) goto L20
            r0 = 4
            T(r0)
        L20:
            if (r7 != 0) goto L26
            r0 = 5
            T(r0)
        L26:
            if (r17 != 0) goto L2c
            r0 = 6
            T(r0)
        L2c:
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r11
            r5 = r14
            r3 = r15
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = 0
            r8.m = r1
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r8.v = r1
            r8.k = r12
            r8.l = r13
            if (r10 != 0) goto L46
            r1 = r8
            goto L47
        L46:
            r1 = r10
        L47:
            r8.n = r1
            r8.o = r7
            r1 = r18
            r8.p = r1
            r1 = r19
            r8.q = r1
            r1 = r20
            r8.r = r1
            r1 = r21
            r8.s = r1
            r1 = r22
            r8.t = r1
            r1 = r23
            r8.u = r1
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.z0 I0(kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.w
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 K0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r20, boolean r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30) {
            if (r17 != 0) goto L6
            r0 = 7
            T(r0)
        L6:
            if (r18 != 0) goto Ld
            r0 = 8
            T(r0)
        Ld:
            if (r19 != 0) goto L14
            r0 = 9
            T(r0)
        L14:
            if (r20 != 0) goto L1b
            r0 = 10
            T(r0)
        L1b:
            if (r22 != 0) goto L22
            r0 = 11
            T(r0)
        L22:
            if (r23 != 0) goto L29
            r0 = 12
            T(r0)
        L29:
            if (r24 != 0) goto L30
            r0 = 13
            T(r0)
        L30:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0
            r3 = 0
            r2 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.descriptors.e1 O0(boolean r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.w0 r2) {
            r0 = this;
            if (r1 == 0) goto Le
            if (r2 == 0) goto L5
            goto L9
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = r0.a()
        L9:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = r2.getSource()
            goto L10
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
        L10:
            if (r1 != 0) goto L17
            r2 = 28
            T(r2)
        L17:
            return r1
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.y P0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.v0 r2) {
            if (r1 != 0) goto L7
            r0 = 30
            T(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 31
            T(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r2.x0()
            if (r0 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r2.x0()
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r2.c(r1)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    private static /* synthetic */ void T(int r11) {
            r0 = 42
            r1 = 41
            r2 = 39
            r3 = 38
            r4 = 28
            if (r11 == r4) goto L1a
            if (r11 == r3) goto L1a
            if (r11 == r2) goto L1a
            if (r11 == r1) goto L1a
            if (r11 == r0) goto L1a
            switch(r11) {
                case 21: goto L1a;
                case 22: goto L1a;
                case 23: goto L1a;
                case 24: goto L1a;
                case 25: goto L1a;
                case 26: goto L1a;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L1c
        L1a:
            java.lang.String r5 = "@NotNull method %s.%s must not return null"
        L1c:
            r6 = 2
            if (r11 == r4) goto L2c
            if (r11 == r3) goto L2c
            if (r11 == r2) goto L2c
            if (r11 == r1) goto L2c
            if (r11 == r0) goto L2c
            switch(r11) {
                case 21: goto L2c;
                case 22: goto L2c;
                case 23: goto L2c;
                case 24: goto L2c;
                case 25: goto L2c;
                case 26: goto L2c;
                default: goto L2a;
            }
        L2a:
            r7 = 3
            goto L2d
        L2c:
            r7 = 2
        L2d:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl"
            r9 = 0
            switch(r11) {
                case 1: goto L99;
                case 2: goto L94;
                case 3: goto L8f;
                case 4: goto L8a;
                case 5: goto L85;
                case 6: goto L80;
                case 7: goto L35;
                case 8: goto L99;
                case 9: goto L94;
                case 10: goto L8f;
                case 11: goto L8a;
                case 12: goto L85;
                case 13: goto L80;
                case 14: goto L7b;
                case 15: goto L76;
                case 16: goto L71;
                case 17: goto L76;
                case 18: goto L71;
                case 19: goto L6c;
                case 20: goto L8f;
                case 21: goto L69;
                case 22: goto L69;
                case 23: goto L69;
                case 24: goto L69;
                case 25: goto L69;
                case 26: goto L69;
                case 27: goto L64;
                case 28: goto L69;
                case 29: goto L5f;
                case 30: goto L5a;
                case 31: goto L55;
                case 32: goto L50;
                case 33: goto L4b;
                case 34: goto L46;
                case 35: goto L85;
                case 36: goto L41;
                case 37: goto L80;
                case 38: goto L69;
                case 39: goto L69;
                case 40: goto L3b;
                case 41: goto L69;
                case 42: goto L69;
                default: goto L35;
            }
        L35:
            java.lang.String r10 = "containingDeclaration"
            r7[r9] = r10
            goto L9d
        L3b:
            java.lang.String r10 = "overriddenDescriptors"
            r7[r9] = r10
            goto L9d
        L41:
            java.lang.String r10 = "newName"
            r7[r9] = r10
            goto L9d
        L46:
            java.lang.String r10 = "newVisibility"
            r7[r9] = r10
            goto L9d
        L4b:
            java.lang.String r10 = "newModality"
            r7[r9] = r10
            goto L9d
        L50:
            java.lang.String r10 = "newOwner"
            r7[r9] = r10
            goto L9d
        L55:
            java.lang.String r10 = "accessorDescriptor"
            r7[r9] = r10
            goto L9d
        L5a:
            java.lang.String r10 = "substitutor"
            r7[r9] = r10
            goto L9d
        L5f:
            java.lang.String r10 = "copyConfiguration"
            r7[r9] = r10
            goto L9d
        L64:
            java.lang.String r10 = "originalSubstitutor"
            r7[r9] = r10
            goto L9d
        L69:
            r7[r9] = r8
            goto L9d
        L6c:
            java.lang.String r10 = "contextReceiverParameters"
            r7[r9] = r10
            goto L9d
        L71:
            java.lang.String r10 = "typeParameters"
            r7[r9] = r10
            goto L9d
        L76:
            java.lang.String r10 = "outType"
            r7[r9] = r10
            goto L9d
        L7b:
            java.lang.String r10 = "inType"
            r7[r9] = r10
            goto L9d
        L80:
            java.lang.String r10 = "source"
            r7[r9] = r10
            goto L9d
        L85:
            java.lang.String r10 = "kind"
            r7[r9] = r10
            goto L9d
        L8a:
            java.lang.String r10 = "name"
            r7[r9] = r10
            goto L9d
        L8f:
            java.lang.String r10 = "visibility"
            r7[r9] = r10
            goto L9d
        L94:
            java.lang.String r10 = "modality"
            r7[r9] = r10
            goto L9d
        L99:
            java.lang.String r10 = "annotations"
            r7[r9] = r10
        L9d:
            r9 = 1
            if (r11 == r4) goto Le0
            if (r11 == r3) goto Ldb
            if (r11 == r2) goto Ld6
            if (r11 == r1) goto Ld1
            if (r11 == r0) goto Lcc
            switch(r11) {
                case 21: goto Lc7;
                case 22: goto Lc2;
                case 23: goto Lbd;
                case 24: goto Lb8;
                case 25: goto Lb3;
                case 26: goto Lae;
                default: goto Lab;
            }
        Lab:
            r7[r9] = r8
            goto Le4
        Lae:
            java.lang.String r8 = "getAccessors"
            r7[r9] = r8
            goto Le4
        Lb3:
            java.lang.String r8 = "getVisibility"
            r7[r9] = r8
            goto Le4
        Lb8:
            java.lang.String r8 = "getModality"
            r7[r9] = r8
            goto Le4
        Lbd:
            java.lang.String r8 = "getReturnType"
            r7[r9] = r8
            goto Le4
        Lc2:
            java.lang.String r8 = "getContextReceiverParameters"
            r7[r9] = r8
            goto Le4
        Lc7:
            java.lang.String r8 = "getTypeParameters"
            r7[r9] = r8
            goto Le4
        Lcc:
            java.lang.String r8 = "copy"
            r7[r9] = r8
            goto Le4
        Ld1:
            java.lang.String r8 = "getOverriddenDescriptors"
            r7[r9] = r8
            goto Le4
        Ld6:
            java.lang.String r8 = "getKind"
            r7[r9] = r8
            goto Le4
        Ldb:
            java.lang.String r8 = "getOriginal"
            r7[r9] = r8
            goto Le4
        Le0:
            java.lang.String r8 = "getSourceToUseForCopy"
            r7[r9] = r8
        Le4:
            switch(r11) {
                case 7: goto L114;
                case 8: goto L114;
                case 9: goto L114;
                case 10: goto L114;
                case 11: goto L114;
                case 12: goto L114;
                case 13: goto L114;
                case 14: goto L10f;
                case 15: goto L10a;
                case 16: goto L10a;
                case 17: goto L10a;
                case 18: goto L10a;
                case 19: goto L10a;
                case 20: goto L105;
                case 21: goto L118;
                case 22: goto L118;
                case 23: goto L118;
                case 24: goto L118;
                case 25: goto L118;
                case 26: goto L118;
                case 27: goto L100;
                case 28: goto L118;
                case 29: goto Lfb;
                case 30: goto Lf6;
                case 31: goto Lf6;
                case 32: goto Lf1;
                case 33: goto Lf1;
                case 34: goto Lf1;
                case 35: goto Lf1;
                case 36: goto Lf1;
                case 37: goto Lf1;
                case 38: goto L118;
                case 39: goto L118;
                case 40: goto Lec;
                case 41: goto L118;
                case 42: goto L118;
                default: goto Le7;
            }
        Le7:
            java.lang.String r8 = "<init>"
            r7[r6] = r8
            goto L118
        Lec:
            java.lang.String r8 = "setOverriddenDescriptors"
            r7[r6] = r8
            goto L118
        Lf1:
            java.lang.String r8 = "createSubstitutedCopy"
            r7[r6] = r8
            goto L118
        Lf6:
            java.lang.String r8 = "getSubstitutedInitialSignatureDescriptor"
            r7[r6] = r8
            goto L118
        Lfb:
            java.lang.String r8 = "doSubstitute"
            r7[r6] = r8
            goto L118
        L100:
            java.lang.String r8 = "substitute"
            r7[r6] = r8
            goto L118
        L105:
            java.lang.String r8 = "setVisibility"
            r7[r6] = r8
            goto L118
        L10a:
            java.lang.String r8 = "setType"
            r7[r6] = r8
            goto L118
        L10f:
            java.lang.String r8 = "setInType"
            r7[r6] = r8
            goto L118
        L114:
            java.lang.String r8 = "create"
            r7[r6] = r8
        L118:
            java.lang.String r5 = java.lang.String.format(r5, r7)
            if (r11 == r4) goto L12f
            if (r11 == r3) goto L12f
            if (r11 == r2) goto L12f
            if (r11 == r1) goto L12f
            if (r11 == r0) goto L12f
            switch(r11) {
                case 21: goto L12f;
                case 22: goto L12f;
                case 23: goto L12f;
                case 24: goto L12f;
                case 25: goto L12f;
                case 26: goto L12f;
                default: goto L129;
            }
        L129:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            goto L134
        L12f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r5)
        L134:
            throw r11
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.s U0(kotlin.reflect.jvm.internal.impl.descriptors.s r1, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r2) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r2 != r0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r1.f()
            boolean r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.g(r2)
            if (r2 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.h
        L10:
            return r1
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.z0 Z0(kotlin.reflect.jvm.internal.impl.types.h2 r4, kotlin.reflect.jvm.internal.impl.descriptors.w0 r5, kotlin.reflect.jvm.internal.impl.descriptors.z0 r6) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r6.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.p(r0, r1)
            if (r4 != 0) goto Le
            r4 = 0
            return r4
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c r1 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r2 = r6.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f r2 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.a()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3 = r6.getValue()
            r1.<init>(r5, r4, r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r6.getAnnotations()
            r0.<init>(r5, r1, r4)
            return r0
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.z0 a1(kotlin.reflect.jvm.internal.impl.types.h2 r3, kotlin.reflect.jvm.internal.impl.descriptors.w0 r4, kotlin.reflect.jvm.internal.impl.descriptors.z0 r5) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.p(r0, r1)
            if (r3 != 0) goto Le
            r3 = 0
            return r3
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d r1 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r2 = r5.getValue()
            r1.<init>(r4, r3, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r5.getAnnotations()
            r0.<init>(r4, r1, r3)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> A0() {
            r2 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r0 = r2.v
            if (r0 != 0) goto L9
            r1 = 22
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s1
    public boolean B0() {
            r1 = this;
            boolean r0 = r1.p
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w0
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.v D() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v r0 = r1.D
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.s1 E0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.a()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.w0 J0(kotlin.reflect.jvm.internal.impl.descriptors.k r2, kotlin.reflect.jvm.internal.impl.descriptors.Modality r3, kotlin.reflect.jvm.internal.impl.descriptors.s r4, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r5, boolean r6) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r0 = r1.T0()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r0.u(r2)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r2.t(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r2.s(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r2.w(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r2.r(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r2.q(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = r2.n()
            if (r2 != 0) goto L28
            r3 = 42
            T(r3)
        L28:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 L0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r20, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.w0 r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r24) {
            r17 = this;
            if (r18 != 0) goto L7
            r0 = 32
            T(r0)
        L7:
            if (r19 != 0) goto Le
            r0 = 33
            T(r0)
        Le:
            if (r20 != 0) goto L15
            r0 = 34
            T(r0)
        L15:
            if (r22 != 0) goto L1c
            r0 = 35
            T(r0)
        L1c:
            if (r23 != 0) goto L23
            r0 = 36
            T(r0)
        L23:
            if (r24 != 0) goto L2a
            r0 = 37
            T(r0)
        L2a:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r17.getAnnotations()
            boolean r7 = r17.C()
            boolean r11 = r17.B0()
            boolean r12 = r17.isConst()
            boolean r13 = r17.q0()
            boolean r14 = r17.i0()
            boolean r15 = r17.isExternal()
            boolean r16 = r17.X()
            r2 = r18
            r5 = r19
            r6 = r20
            r3 = r21
            r9 = r22
            r8 = r23
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.descriptors.w0 M0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a r21) {
            r20 = this;
            r0 = r20
            if (r21 != 0) goto L9
            r1 = 29
            T(r1)
        L9:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.b(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.f(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.g(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.h(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.i(r21)
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.j(r21)
            boolean r7 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.k(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r8 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.h(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r0.O0(r7, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r9 = r0.L0(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.l(r21)
            if (r1 != 0) goto L3c
            java.util.List r1 = r0.getTypeParameters()
            goto L40
        L3c:
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.l(r21)
        L40:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = r1.size()
            r10.<init>(r2)
            kotlin.reflect.jvm.internal.impl.types.f2 r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.m(r21)
            kotlin.reflect.jvm.internal.impl.types.h2 r5 = kotlin.reflect.jvm.internal.impl.types.d0.b(r1, r2, r9, r10)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.c(r21)
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r5.p(r1, r2)
            r19 = 0
            if (r2 != 0) goto L60
            return r19
        L60:
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r5.p(r1, r3)
            if (r1 == 0) goto L6b
            r9.V0(r1)
        L6b:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.d(r21)
            if (r1 == 0) goto L7a
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r1.c(r5)
            if (r1 != 0) goto L78
            return r19
        L78:
            r11 = r1
            goto L7c
        L7a:
            r11 = r19
        L7c:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r0.x
            if (r1 == 0) goto L86
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = a1(r5, r9, r1)
            r12 = r1
            goto L88
        L86:
            r12 = r19
        L88:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r1 = r0.v
            java.util.Iterator r1 = r1.iterator()
        L93:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La9
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = Z0(r5, r9, r3)
            if (r3 == 0) goto L93
            r13.add(r3)
            goto L93
        La9:
            r8 = r9
            r9 = r2
            r8.X0(r9, r10, r11, r12, r13)
            r9 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = r0.z
            if (r1 != 0) goto Lb6
            r1 = r19
            goto Lf0
        Lb6:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r8 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = r0.z
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r11 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.f(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = r0.z
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r1.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.i(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.s r12 = U0(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = r0.z
            boolean r13 = r1.Y()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = r0.z
            boolean r14 = r1.isExternal()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = r0.z
            boolean r15 = r1.isInline()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r16 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.i(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r17 = r21.o()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r18 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r8
        Lf0:
            if (r1 == 0) goto L10f
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r2 = r0.z
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getReturnType()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r3 = r0.z
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = P0(r5, r3)
            r1.I0(r3)
            if (r2 == 0) goto L10a
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r5.p(r2, r3)
            goto L10c
        L10a:
            r2 = r19
        L10c:
            r1.L0(r2)
        L10f:
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r0.A
            if (r2 != 0) goto L116
            r3 = r19
            goto L150
        L116:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r8 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m0
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r0.A
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10 = r2.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r11 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.f(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r0.A
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r2.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.i(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.s r12 = U0(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r0.A
            boolean r13 = r2.Y()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r0.A
            boolean r14 = r2.isExternal()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r0.A
            boolean r15 = r2.isInline()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r16 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.i(r21)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r17 = r21.p()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r18 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r8
        L150:
            if (r3 == 0) goto L1a9
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r0.A
            java.util.List r4 = r2.g()
            r7 = 0
            r8 = 0
            r6 = 0
            java.util.List r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.K0(r3, r4, r5, r6, r7, r8)
            r4 = 0
            r6 = 1
            if (r2 != 0) goto L18a
            r9.W0(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.b(r21)
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.I()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r7 = r0.A
            java.util.List r7 = r7.g()
            java.lang.Object r7 = r7.get(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r7
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r7.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.m0.K0(r3, r2, r7)
            java.util.List r2 = java.util.Collections.singletonList(r2)
        L18a:
            int r7 = r2.size()
            if (r7 != r6) goto L1a3
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r6 = r0.A
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = P0(r5, r6)
            r3.I0(r6)
            java.lang.Object r2 = r2.get(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            r3.M0(r2)
            goto L1a9
        L1a3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L1a9:
            kotlin.reflect.jvm.internal.impl.descriptors.v r2 = r0.C
            if (r2 != 0) goto L1b0
            r4 = r19
            goto L1b9
        L1b0:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.r r4 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.r
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            r4.<init>(r2, r9)
        L1b9:
            kotlin.reflect.jvm.internal.impl.descriptors.v r2 = r0.D
            if (r2 != 0) goto L1c0
            r6 = r19
            goto L1c9
        L1c0:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.r r6 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.r
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            r6.<init>(r2, r9)
        L1c9:
            r9.R0(r1, r3, r4, r6)
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a.e(r21)
            if (r1 == 0) goto L1f5
            kotlin.reflect.jvm.internal.impl.utils.k r1 = kotlin.reflect.jvm.internal.impl.utils.k.a()
            java.util.Collection r2 = r0.e()
            java.util.Iterator r2 = r2.iterator()
        L1de:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1f2
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = r3.c(r5)
            r1.add(r3)
            goto L1de
        L1f2:
            r9.R(r1)
        L1f5:
            boolean r1 = r0.isConst()
            if (r1 == 0) goto L204
            kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> r1 = r0.i
            if (r1 == 0) goto L204
            kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2 = r0.h
            r9.G0(r2, r1)
        L204:
            return r9
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public <V> V N(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 N0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r0 = r1.z
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w0
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.v O() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v r0 = r1.C
            return r0
    }

    public void Q0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y0 r3) {
            r1 = this;
            r0 = 0
            r1.R0(r2, r3, r0, r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void R(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 40
            T(r0)
        L7:
            r1.m = r2
            return
    }

    public void R0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.v r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.v r4) {
            r0 = this;
            r0.z = r1
            r0.A = r2
            r0.C = r3
            r0.D = r4
            return
    }

    public boolean S0() {
            r1 = this;
            boolean r0 = r1.B
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.a T0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a
            r0.<init>(r1)
            return r0
    }

    public void V0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 14
            T(r1)
        L7:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.c(r0, r2)
            return r1
    }

    public void W0(boolean r1) {
            r0 = this;
            r0.B = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.t1
    public boolean X() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    public void X0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r6) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 17
            T(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 18
            T(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 19
            T(r0)
        L15:
            r1.F0(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.y = r2
            r1.x = r5
            r1.w = r4
            r1.v = r6
            return
    }

    public void Y0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 20
            T(r0)
        L7:
            r1.l = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.w0 a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r2.n
            if (r0 != r2) goto L6
            r0 = r2
            goto La
        L6:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.a()
        La:
            if (r0 != 0) goto L11
            r1 = 38
            T(r1)
        L11:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.s1 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public kotlin.reflect.jvm.internal.impl.descriptors.w0 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 27
            T(r0)
        L7:
            boolean r0 = r2.k()
            if (r0 == 0) goto Le
            return r1
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r0 = r1.T0()
            kotlin.reflect.jvm.internal.impl.types.f2 r2 = r2.j()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r0.v(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.a()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0$a r2 = r2.t(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = r2.n()
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 c0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r1.w
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w0> e() {
            r2 = this;
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w0> r0 = r2.m
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L7:
            if (r0 != 0) goto Le
            r1 = 41
            T(r1)
        Le:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor e0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r0.J0(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 f0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r1.x
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w0
    @org.jetbrains.annotations.Nullable
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.x0 getGetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r0 = r1.N0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getReturnType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getType()
            if (r0 != 0) goto Lb
            r1 = 23
            T(r1)
        Lb:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w0
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.y0 getSetter() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r1.A
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getTypeParameters() {
            r3 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r3.y
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "typeParameters == null for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r2.l
            if (r0 != 0) goto L9
            r1 = 25
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind h() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r2.o
            if (r0 != 0) goto L9
            r1 = 39
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r2.k
            if (r0 != 0) goto L9
            r1 = 24
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean i0() {
            r1 = this;
            boolean r0 = r1.s
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.s1
    public boolean isConst() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r1 = this;
            boolean r0 = r1.t
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean q0() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.v0> x() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = r2.z
            if (r1 == 0) goto Ld
            r0.add(r1)
        Ld:
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r1 = r2.A
            if (r1 == 0) goto L14
            r0.add(r1)
        L14:
            return r0
    }
}
