package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.descriptors.impl.n implements kotlin.reflect.jvm.internal.impl.descriptors.j1 {
    private final kotlin.reflect.jvm.internal.impl.types.Variance e;
    private final boolean f;
    private final int g;
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.w1> h;
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.e1> i;
    private final kotlin.reflect.jvm.internal.impl.storage.n j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.w1> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.n a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h1 b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.h c;

        a(kotlin.reflect.jvm.internal.impl.descriptors.impl.h r1, kotlin.reflect.jvm.internal.impl.storage.n r2, kotlin.reflect.jvm.internal.impl.descriptors.h1 r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.types.w1 a() {
                r4 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h$c r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h$c
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r1 = r4.c
                kotlin.reflect.jvm.internal.impl.storage.n r2 = r4.a
                kotlin.reflect.jvm.internal.impl.descriptors.h1 r3 = r4.b
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.w1 invoke() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.e1> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.h b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.k> {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.h.b a;

            a(kotlin.reflect.jvm.internal.impl.descriptors.impl.h.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public kotlin.reflect.jvm.internal.impl.resolve.scopes.k a() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Scope for type parameter "
                    r0.append(r1)
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.h$b r1 = r2.a
                    kotlin.reflect.jvm.internal.impl.name.f r1 = r1.a
                    java.lang.String r1 = r1.b()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.h$b r1 = r2.a
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.h r1 = r1.b
                    java.util.List r1 = r1.getUpperBounds()
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.x.n(r0, r1)
                    return r0
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k invoke() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.a()
                    return r0
            }
        }

        b(kotlin.reflect.jvm.internal.impl.descriptors.impl.h r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.types.e1 a() {
                r5 = this;
                kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
                kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.k()
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r1 = r5.b
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.o()
                java.util.List r2 = java.util.Collections.EMPTY_LIST
                kotlin.reflect.jvm.internal.impl.resolve.scopes.i r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.i
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h$b$a r4 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h$b$a
                r4.<init>(r5)
                r3.<init>(r4)
                r4 = 0
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.w0.o(r0, r1, r2, r4, r3)
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
    private class c extends kotlin.reflect.jvm.internal.impl.types.q {
        private final kotlin.reflect.jvm.internal.impl.descriptors.h1 d;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.h e;

        public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.h r2, kotlin.reflect.jvm.internal.impl.storage.n r3, kotlin.reflect.jvm.internal.impl.descriptors.h1 r4) {
                r1 = this;
                if (r3 != 0) goto L6
                r0 = 0
                H(r0)
            L6:
                r1.e = r2
                r1.<init>(r3)
                r1.d = r4
                return
        }

        private static /* synthetic */ void H(int r11) {
                r0 = 8
                r1 = 5
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r11 == r5) goto L16
                if (r11 == r4) goto L16
                if (r11 == r3) goto L16
                if (r11 == r2) goto L16
                if (r11 == r1) goto L16
                if (r11 == r0) goto L16
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L18
            L16:
                java.lang.String r6 = "@NotNull method %s.%s must not return null"
            L18:
                if (r11 == r5) goto L26
                if (r11 == r4) goto L26
                if (r11 == r3) goto L26
                if (r11 == r2) goto L26
                if (r11 == r1) goto L26
                if (r11 == r0) goto L26
                r7 = 3
                goto L27
            L26:
                r7 = 2
            L27:
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor"
                r9 = 0
                switch(r11) {
                    case 1: goto L43;
                    case 2: goto L43;
                    case 3: goto L43;
                    case 4: goto L43;
                    case 5: goto L43;
                    case 6: goto L3e;
                    case 7: goto L39;
                    case 8: goto L43;
                    case 9: goto L34;
                    default: goto L2f;
                }
            L2f:
                java.lang.String r10 = "storageManager"
                r7[r9] = r10
                goto L45
            L34:
                java.lang.String r10 = "classifier"
                r7[r9] = r10
                goto L45
            L39:
                java.lang.String r10 = "supertypes"
                r7[r9] = r10
                goto L45
            L3e:
                java.lang.String r10 = "type"
                r7[r9] = r10
                goto L45
            L43:
                r7[r9] = r8
            L45:
                java.lang.String r9 = "processSupertypesWithoutCycles"
                if (r11 == r5) goto L6d
                if (r11 == r4) goto L68
                if (r11 == r3) goto L63
                if (r11 == r2) goto L5e
                if (r11 == r1) goto L59
                if (r11 == r0) goto L56
                r7[r5] = r8
                goto L71
            L56:
                r7[r5] = r9
                goto L71
            L59:
                java.lang.String r8 = "getSupertypeLoopChecker"
                r7[r5] = r8
                goto L71
            L5e:
                java.lang.String r8 = "getBuiltIns"
                r7[r5] = r8
                goto L71
            L63:
                java.lang.String r8 = "getDeclarationDescriptor"
                r7[r5] = r8
                goto L71
            L68:
                java.lang.String r8 = "getParameters"
                r7[r5] = r8
                goto L71
            L6d:
                java.lang.String r8 = "computeSupertypes"
                r7[r5] = r8
            L71:
                switch(r11) {
                    case 1: goto L85;
                    case 2: goto L85;
                    case 3: goto L85;
                    case 4: goto L85;
                    case 5: goto L85;
                    case 6: goto L81;
                    case 7: goto L7e;
                    case 8: goto L85;
                    case 9: goto L79;
                    default: goto L74;
                }
            L74:
                java.lang.String r8 = "<init>"
                r7[r4] = r8
                goto L85
            L79:
                java.lang.String r8 = "isSameClassifier"
                r7[r4] = r8
                goto L85
            L7e:
                r7[r4] = r9
                goto L85
            L81:
                java.lang.String r8 = "reportSupertypeLoopError"
                r7[r4] = r8
            L85:
                java.lang.String r6 = java.lang.String.format(r6, r7)
                if (r11 == r5) goto L9b
                if (r11 == r4) goto L9b
                if (r11 == r3) goto L9b
                if (r11 == r2) goto L9b
                if (r11 == r1) goto L9b
                if (r11 == r0) goto L9b
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                r11.<init>(r6)
                goto La0
            L9b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r11.<init>(r6)
            La0:
                throw r11
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w, kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.f c() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r0 = r2.e
                if (r0 != 0) goto L8
                r1 = 3
                H(r1)
            L8:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public boolean d() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w
        protected boolean g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r4) {
                r3 = this;
                if (r4 != 0) goto L7
                r0 = 9
                H(r0)
            L7:
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r0 == 0) goto L19
                kotlin.reflect.jvm.internal.impl.resolve.g r0 = kotlin.reflect.jvm.internal.impl.resolve.g.a
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r1 = r3.e
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
                r2 = 1
                boolean r4 = r0.m(r1, r4, r2)
                if (r4 == 0) goto L19
                return r2
            L19:
                r4 = 0
                return r4
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
                r2 = this;
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                if (r0 != 0) goto L8
                r1 = 2
                H(r1)
            L8:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.builtins.j p() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r0 = r2.e
                kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r0)
                if (r0 != 0) goto Lc
                r1 = 4
                H(r1)
            Lc:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q
        @org.jetbrains.annotations.NotNull
        protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r0 = r2.e
                java.util.List r0 = r0.G0()
                if (r0 != 0) goto Lc
                r1 = 1
                H(r1)
            Lc:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q
        @org.jetbrains.annotations.Nullable
        protected kotlin.reflect.jvm.internal.impl.types.t0 s() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CYCLIC_UPPER_BOUNDS
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                kotlin.reflect.jvm.internal.impl.types.error.g r0 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r1)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r0 = r1.e
                kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q
        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.descriptors.h1 v() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.h1 r0 = r2.d
                if (r0 != 0) goto L8
                r1 = 5
                H(r1)
            L8:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q
        @org.jetbrains.annotations.NotNull
        protected java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> x(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 7
                H(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r0 = r1.e
                java.util.List r2 = r0.E0(r2)
                if (r2 != 0) goto L13
                r0 = 8
                H(r0)
            L13:
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q
        protected void z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 6
                H(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.descriptors.impl.h r0 = r1.e
                r0.F0(r2)
                return
        }
    }

    protected h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r6, boolean r7, int r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.h1 r10) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r5 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            if (r6 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            if (r9 != 0) goto L24
            r0 = 5
            T(r0)
        L24:
            if (r10 != 0) goto L2a
            r0 = 6
            T(r0)
        L2a:
            r1.<init>(r3, r4, r5, r9)
            r1.e = r6
            r1.f = r7
            r1.g = r8
            kotlin.reflect.jvm.internal.impl.descriptors.impl.h$a r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h$a
            r3.<init>(r1, r2, r10)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r2.e(r3)
            r1.h = r3
            kotlin.reflect.jvm.internal.impl.descriptors.impl.h$b r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h$b
            r3.<init>(r1, r5)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r2.e(r3)
            r1.i = r3
            r1.j = r2
            return
    }

    private static /* synthetic */ void T(int r6) {
            switch(r6) {
                case 7: goto L6;
                case 8: goto L6;
                case 9: goto L6;
                case 10: goto L6;
                case 11: goto L6;
                case 12: goto L3;
                case 13: goto L6;
                case 14: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r0 = "@NotNull method %s.%s must not return null"
        L8:
            r1 = 2
            switch(r6) {
                case 7: goto Le;
                case 8: goto Le;
                case 9: goto Le;
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Lc;
                case 13: goto Le;
                case 14: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor"
            r4 = 0
            switch(r6) {
                case 1: goto L3d;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L29;
                case 6: goto L24;
                case 7: goto L21;
                case 8: goto L21;
                case 9: goto L21;
                case 10: goto L21;
                case 11: goto L21;
                case 12: goto L1c;
                case 13: goto L21;
                case 14: goto L21;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "storageManager"
            r2[r4] = r5
            goto L41
        L1c:
            java.lang.String r5 = "bounds"
            r2[r4] = r5
            goto L41
        L21:
            r2[r4] = r3
            goto L41
        L24:
            java.lang.String r5 = "supertypeLoopChecker"
            r2[r4] = r5
            goto L41
        L29:
            java.lang.String r5 = "source"
            r2[r4] = r5
            goto L41
        L2e:
            java.lang.String r5 = "variance"
            r2[r4] = r5
            goto L41
        L33:
            java.lang.String r5 = "name"
            r2[r4] = r5
            goto L41
        L38:
            java.lang.String r5 = "annotations"
            r2[r4] = r5
            goto L41
        L3d:
            java.lang.String r5 = "containingDeclaration"
            r2[r4] = r5
        L41:
            java.lang.String r4 = "processBoundsWithoutCycles"
            r5 = 1
            switch(r6) {
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L5c;
                case 10: goto L57;
                case 11: goto L52;
                case 12: goto L47;
                case 13: goto L4f;
                case 14: goto L4a;
                default: goto L47;
            }
        L47:
            r2[r5] = r3
            goto L6a
        L4a:
            java.lang.String r3 = "getStorageManager"
            r2[r5] = r3
            goto L6a
        L4f:
            r2[r5] = r4
            goto L6a
        L52:
            java.lang.String r3 = "getOriginal"
            r2[r5] = r3
            goto L6a
        L57:
            java.lang.String r3 = "getDefaultType"
            r2[r5] = r3
            goto L6a
        L5c:
            java.lang.String r3 = "getTypeConstructor"
            r2[r5] = r3
            goto L6a
        L61:
            java.lang.String r3 = "getUpperBounds"
            r2[r5] = r3
            goto L6a
        L66:
            java.lang.String r3 = "getVariance"
            r2[r5] = r3
        L6a:
            switch(r6) {
                case 7: goto L74;
                case 8: goto L74;
                case 9: goto L74;
                case 10: goto L74;
                case 11: goto L74;
                case 12: goto L72;
                case 13: goto L74;
                case 14: goto L74;
                default: goto L6d;
            }
        L6d:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
            goto L74
        L72:
            r2[r1] = r4
        L74:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r6) {
                case 7: goto L81;
                case 8: goto L81;
                case 9: goto L81;
                case 10: goto L81;
                case 11: goto L81;
                case 12: goto L7b;
                case 13: goto L81;
                case 14: goto L81;
                default: goto L7b;
            }
        L7b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            goto L86
        L81:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
        L86:
            throw r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean E() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> E0(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 12
            T(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 13
            T(r0)
        Le:
            return r2
    }

    protected abstract void F0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1);

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> G0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.h(r0, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.j1 a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.n r0 = super.p0()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            if (r0 != 0) goto Ld
            r1 = 11
            T(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.storage.n d0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r2.j
            if (r0 != 0) goto L9
            r1 = 14
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public int getIndex() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> getUpperBounds() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.o()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.h$c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.h.c) r0
            java.util.List r0 = r0.w()
            if (r0 != 0) goto L11
            r1 = 8
            T(r1)
        L11:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean j() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.Variance l() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r2.e
            if (r0 != 0) goto L8
            r1 = 7
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j1, kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.w1 o() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.w1> r0 = r2.h
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = (kotlin.reflect.jvm.internal.impl.types.w1) r0
            if (r0 != 0) goto Lf
            r1 = 9
            T(r1)
        Lf:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 s() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.e1> r0 = r2.i
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            if (r0 != 0) goto Lf
            r1 = 10
            T(r1)
        Lf:
            return r0
    }
}
