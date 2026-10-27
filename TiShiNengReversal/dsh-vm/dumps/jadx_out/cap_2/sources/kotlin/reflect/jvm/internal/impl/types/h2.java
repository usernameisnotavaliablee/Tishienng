package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class h2 {
    public static final kotlin.reflect.jvm.internal.impl.types.h2 b = null;
    static final /* synthetic */ boolean c = false;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.f2 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.c, java.lang.Boolean> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ void a(int r2) {
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "name"
                r1 = 0
                r2[r1] = r0
                java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1"
                r1 = 1
                r2[r1] = r0
                java.lang.String r0 = "invoke"
                r1 = 2
                r2[r1] = r0
                java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r2 = java.lang.String.format(r0, r2)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r2)
                throw r0
        }

        public java.lang.Boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.Q
                boolean r2 = r2.equals(r0)
                r2 = r2 ^ 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.name.c r1 = (kotlin.reflect.jvm.internal.impl.name.c) r1
                java.lang.Boolean r1 = r0.b(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.h2$d[] r0 = kotlin.reflect.jvm.internal.impl.types.h2.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.types.h2.b.a = r0
                kotlin.reflect.jvm.internal.impl.types.h2$d r1 = kotlin.reflect.jvm.internal.impl.types.h2.d.c     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = kotlin.reflect.jvm.internal.impl.types.h2.b.a     // Catch: java.lang.NoSuchFieldError -> L1d
                kotlin.reflect.jvm.internal.impl.types.h2$d r1 = kotlin.reflect.jvm.internal.impl.types.h2.d.b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = kotlin.reflect.jvm.internal.impl.types.h2.b.a     // Catch: java.lang.NoSuchFieldError -> L28
                kotlin.reflect.jvm.internal.impl.types.h2$d r1 = kotlin.reflect.jvm.internal.impl.types.h2.d.a     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c extends java.lang.Exception {
        public c(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum d extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.types.h2.d> {
        public static final kotlin.reflect.jvm.internal.impl.types.h2.d a = null;
        public static final kotlin.reflect.jvm.internal.impl.types.h2.d b = null;
        public static final kotlin.reflect.jvm.internal.impl.types.h2.d c = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h2.d[] d = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.h2$d r0 = new kotlin.reflect.jvm.internal.impl.types.h2$d
                java.lang.String r1 = "NO_CONFLICT"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.h2.d.a = r0
                kotlin.reflect.jvm.internal.impl.types.h2$d r1 = new kotlin.reflect.jvm.internal.impl.types.h2$d
                java.lang.String r3 = "IN_IN_OUT_POSITION"
                r4 = 1
                r1.<init>(r3, r4)
                kotlin.reflect.jvm.internal.impl.types.h2.d.b = r1
                kotlin.reflect.jvm.internal.impl.types.h2$d r3 = new kotlin.reflect.jvm.internal.impl.types.h2$d
                java.lang.String r5 = "OUT_IN_IN_POSITION"
                r6 = 2
                r3.<init>(r5, r6)
                kotlin.reflect.jvm.internal.impl.types.h2.d.c = r3
                r5 = 3
                kotlin.reflect.jvm.internal.impl.types.h2$d[] r5 = new kotlin.reflect.jvm.internal.impl.types.h2.d[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                kotlin.reflect.jvm.internal.impl.types.h2.d.d = r5
                return
        }

        d(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.types.h2.d valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.types.h2$d> r0 = kotlin.reflect.jvm.internal.impl.types.h2.d.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.types.h2$d r1 = (kotlin.reflect.jvm.internal.impl.types.h2.d) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.types.h2.d[] values() {
                kotlin.reflect.jvm.internal.impl.types.h2$d[] r0 = kotlin.reflect.jvm.internal.impl.types.h2.d.d
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.types.h2$d[] r0 = (kotlin.reflect.jvm.internal.impl.types.h2.d[]) r0
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = kotlin.reflect.jvm.internal.impl.types.f2.b
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = g(r0)
            kotlin.reflect.jvm.internal.impl.types.h2.b = r0
            return
    }

    protected h2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 7
            a(r0)
        L6:
            r1.<init>()
            r1.a = r2
            return
    }

    private static /* synthetic */ void a(int r13) {
            r0 = 37
            r1 = 34
            r2 = 8
            r3 = 2
            r4 = 1
            if (r13 == r4) goto L21
            if (r13 == r3) goto L21
            if (r13 == r2) goto L21
            if (r13 == r1) goto L21
            if (r13 == r0) goto L21
            switch(r13) {
                case 11: goto L21;
                case 12: goto L21;
                case 13: goto L21;
                default: goto L15;
            }
        L15:
            switch(r13) {
                case 19: goto L21;
                case 20: goto L21;
                case 21: goto L21;
                case 22: goto L21;
                case 23: goto L21;
                case 24: goto L21;
                case 25: goto L21;
                default: goto L18;
            }
        L18:
            switch(r13) {
                case 29: goto L21;
                case 30: goto L21;
                case 31: goto L21;
                case 32: goto L21;
                default: goto L1b;
            }
        L1b:
            switch(r13) {
                case 40: goto L21;
                case 41: goto L21;
                case 42: goto L21;
                default: goto L1e;
            }
        L1e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L23
        L21:
            java.lang.String r5 = "@NotNull method %s.%s must not return null"
        L23:
            if (r13 == r4) goto L3b
            if (r13 == r3) goto L3b
            if (r13 == r2) goto L3b
            if (r13 == r1) goto L3b
            if (r13 == r0) goto L3b
            switch(r13) {
                case 11: goto L3b;
                case 12: goto L3b;
                case 13: goto L3b;
                default: goto L30;
            }
        L30:
            switch(r13) {
                case 19: goto L3b;
                case 20: goto L3b;
                case 21: goto L3b;
                case 22: goto L3b;
                case 23: goto L3b;
                case 24: goto L3b;
                case 25: goto L3b;
                default: goto L33;
            }
        L33:
            switch(r13) {
                case 29: goto L3b;
                case 30: goto L3b;
                case 31: goto L3b;
                case 32: goto L3b;
                default: goto L36;
            }
        L36:
            switch(r13) {
                case 40: goto L3b;
                case 41: goto L3b;
                case 42: goto L3b;
                default: goto L39;
            }
        L39:
            r6 = 3
            goto L3c
        L3b:
            r6 = 2
        L3c:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor"
            r8 = 0
            switch(r13) {
                case 1: goto L8a;
                case 2: goto L8a;
                case 3: goto L85;
                case 4: goto L80;
                case 5: goto L7b;
                case 6: goto L76;
                case 7: goto L44;
                case 8: goto L8a;
                case 9: goto L71;
                case 10: goto L6c;
                case 11: goto L8a;
                case 12: goto L8a;
                case 13: goto L8a;
                case 14: goto L71;
                case 15: goto L6c;
                case 16: goto L67;
                case 17: goto L67;
                case 18: goto L62;
                case 19: goto L8a;
                case 20: goto L8a;
                case 21: goto L8a;
                case 22: goto L8a;
                case 23: goto L8a;
                case 24: goto L8a;
                case 25: goto L8a;
                case 26: goto L5d;
                case 27: goto L58;
                case 28: goto L62;
                case 29: goto L8a;
                case 30: goto L8a;
                case 31: goto L8a;
                case 32: goto L8a;
                case 33: goto L53;
                case 34: goto L8a;
                case 35: goto L4e;
                case 36: goto L67;
                case 37: goto L8a;
                case 38: goto L4e;
                case 39: goto L49;
                case 40: goto L8a;
                case 41: goto L8a;
                case 42: goto L8a;
                default: goto L44;
            }
        L44:
            java.lang.String r9 = "substitution"
            r6[r8] = r9
            goto L8c
        L49:
            java.lang.String r9 = "projectionKind"
            r6[r8] = r9
            goto L8c
        L4e:
            java.lang.String r9 = "typeParameterVariance"
            r6[r8] = r9
            goto L8c
        L53:
            java.lang.String r9 = "annotations"
            r6[r8] = r9
            goto L8c
        L58:
            java.lang.String r9 = "substituted"
            r6[r8] = r9
            goto L8c
        L5d:
            java.lang.String r9 = "originalType"
            r6[r8] = r9
            goto L8c
        L62:
            java.lang.String r9 = "originalProjection"
            r6[r8] = r9
            goto L8c
        L67:
            java.lang.String r9 = "typeProjection"
            r6[r8] = r9
            goto L8c
        L6c:
            java.lang.String r9 = "howThisTypeIsUsed"
            r6[r8] = r9
            goto L8c
        L71:
            java.lang.String r9 = "type"
            r6[r8] = r9
            goto L8c
        L76:
            java.lang.String r9 = "context"
            r6[r8] = r9
            goto L8c
        L7b:
            java.lang.String r9 = "substitutionContext"
            r6[r8] = r9
            goto L8c
        L80:
            java.lang.String r9 = "second"
            r6[r8] = r9
            goto L8c
        L85:
            java.lang.String r9 = "first"
            r6[r8] = r9
            goto L8c
        L8a:
            r6[r8] = r7
        L8c:
            java.lang.String r8 = "safeSubstitute"
            java.lang.String r9 = "unsafeSubstitute"
            java.lang.String r10 = "projectedTypeForConflictedTypeWithUnsafeVariance"
            java.lang.String r11 = "filterOutUnsafeVariance"
            java.lang.String r12 = "combine"
            if (r13 == r4) goto Lc8
            if (r13 == r3) goto Lc3
            if (r13 == r2) goto Lbe
            if (r13 == r1) goto Lbb
            if (r13 == r0) goto Lb8
            switch(r13) {
                case 11: goto Lb5;
                case 12: goto Lb5;
                case 13: goto Lb5;
                default: goto La3;
            }
        La3:
            switch(r13) {
                case 19: goto Lb2;
                case 20: goto Lb2;
                case 21: goto Lb2;
                case 22: goto Lb2;
                case 23: goto Lb2;
                case 24: goto Lb2;
                case 25: goto Lb2;
                default: goto La6;
            }
        La6:
            switch(r13) {
                case 29: goto Laf;
                case 30: goto Laf;
                case 31: goto Laf;
                case 32: goto Laf;
                default: goto La9;
            }
        La9:
            switch(r13) {
                case 40: goto Lb8;
                case 41: goto Lb8;
                case 42: goto Lb8;
                default: goto Lac;
            }
        Lac:
            r6[r4] = r7
            goto Lcc
        Laf:
            r6[r4] = r10
            goto Lcc
        Lb2:
            r6[r4] = r9
            goto Lcc
        Lb5:
            r6[r4] = r8
            goto Lcc
        Lb8:
            r6[r4] = r12
            goto Lcc
        Lbb:
            r6[r4] = r11
            goto Lcc
        Lbe:
            java.lang.String r7 = "getSubstitution"
            r6[r4] = r7
            goto Lcc
        Lc3:
            java.lang.String r7 = "replaceWithContravariantApproximatingSubstitution"
            r6[r4] = r7
            goto Lcc
        Lc8:
            java.lang.String r7 = "replaceWithNonApproximatingSubstitution"
            r6[r4] = r7
        Lcc:
            switch(r13) {
                case 1: goto Lf6;
                case 2: goto Lf6;
                case 3: goto Lf2;
                case 4: goto Lf2;
                case 5: goto Lcf;
                case 6: goto Lcf;
                case 7: goto Led;
                case 8: goto Lf6;
                case 9: goto Lea;
                case 10: goto Lea;
                case 11: goto Lf6;
                case 12: goto Lf6;
                case 13: goto Lf6;
                case 14: goto Le5;
                case 15: goto Le5;
                case 16: goto Le5;
                case 17: goto Le0;
                case 18: goto Ldd;
                case 19: goto Lf6;
                case 20: goto Lf6;
                case 21: goto Lf6;
                case 22: goto Lf6;
                case 23: goto Lf6;
                case 24: goto Lf6;
                case 25: goto Lf6;
                case 26: goto Lda;
                case 27: goto Lda;
                case 28: goto Lda;
                case 29: goto Lf6;
                case 30: goto Lf6;
                case 31: goto Lf6;
                case 32: goto Lf6;
                case 33: goto Ld7;
                case 34: goto Lf6;
                case 35: goto Ld4;
                case 36: goto Ld4;
                case 37: goto Lf6;
                case 38: goto Ld4;
                case 39: goto Ld4;
                case 40: goto Lf6;
                case 41: goto Lf6;
                case 42: goto Lf6;
                default: goto Lcf;
            }
        Lcf:
            java.lang.String r7 = "create"
            r6[r3] = r7
            goto Lf6
        Ld4:
            r6[r3] = r12
            goto Lf6
        Ld7:
            r6[r3] = r11
            goto Lf6
        Lda:
            r6[r3] = r10
            goto Lf6
        Ldd:
            r6[r3] = r9
            goto Lf6
        Le0:
            java.lang.String r7 = "substituteWithoutApproximation"
            r6[r3] = r7
            goto Lf6
        Le5:
            java.lang.String r7 = "substitute"
            r6[r3] = r7
            goto Lf6
        Lea:
            r6[r3] = r8
            goto Lf6
        Led:
            java.lang.String r7 = "<init>"
            r6[r3] = r7
            goto Lf6
        Lf2:
            java.lang.String r7 = "createChainedSubstitutor"
            r6[r3] = r7
        Lf6:
            java.lang.String r5 = java.lang.String.format(r5, r6)
            if (r13 == r4) goto L116
            if (r13 == r3) goto L116
            if (r13 == r2) goto L116
            if (r13 == r1) goto L116
            if (r13 == r0) goto L116
            switch(r13) {
                case 11: goto L116;
                case 12: goto L116;
                case 13: goto L116;
                default: goto L107;
            }
        L107:
            switch(r13) {
                case 19: goto L116;
                case 20: goto L116;
                case 21: goto L116;
                case 22: goto L116;
                case 23: goto L116;
                case 24: goto L116;
                case 25: goto L116;
                default: goto L10a;
            }
        L10a:
            switch(r13) {
                case 29: goto L116;
                case 30: goto L116;
                case 31: goto L116;
                case 32: goto L116;
                default: goto L10d;
            }
        L10d:
            switch(r13) {
                case 40: goto L116;
                case 41: goto L116;
                case 42: goto L116;
                default: goto L110;
            }
        L110:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r5)
            goto L11b
        L116:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r5)
        L11b:
            throw r13
    }

    private static void b(int r2, kotlin.reflect.jvm.internal.impl.types.c2 r3, kotlin.reflect.jvm.internal.impl.types.f2 r4) {
            r0 = 100
            if (r2 > r0) goto L5
            return
        L5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Recursion too deep. Most likely infinite loop while substituting "
            r0.append(r1)
            java.lang.String r3 = o(r3)
            r0.append(r3)
            java.lang.String r3 = "; substitution: "
            r0.append(r3)
            java.lang.String r3 = o(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.Variance c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r2) {
            if (r1 != 0) goto L7
            r0 = 35
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 36
            a(r0)
        Le:
            boolean r0 = r2.b()
            if (r0 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r1 != 0) goto L1d
            r2 = 37
            a(r2)
        L1d:
            return r1
        L1e:
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = d(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.Variance d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r4) {
            if (r3 != 0) goto L7
            r0 = 38
            a(r0)
        L7:
            if (r4 != 0) goto Le
            r0 = 39
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r3 != r0) goto L1a
            if (r4 != 0) goto L19
            r3 = 40
            a(r3)
        L19:
            return r4
        L1a:
            if (r4 != r0) goto L24
            if (r3 != 0) goto L23
            r4 = 41
            a(r4)
        L23:
            return r3
        L24:
            if (r3 != r4) goto L2e
            if (r4 != 0) goto L2d
            r3 = 42
            a(r3)
        L2d:
            return r4
        L2e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Variance conflict: type parameter variance '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "' and projection kind '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "' cannot be combined"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static kotlin.reflect.jvm.internal.impl.types.h2.d e(kotlin.reflect.jvm.internal.impl.types.Variance r2, kotlin.reflect.jvm.internal.impl.types.Variance r3) {
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r2 != r0) goto Lb
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r3 != r1) goto Lb
            kotlin.reflect.jvm.internal.impl.types.h2$d r2 = kotlin.reflect.jvm.internal.impl.types.h2.d.c
            return r2
        Lb:
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r2 != r1) goto L14
            if (r3 != r0) goto L14
            kotlin.reflect.jvm.internal.impl.types.h2$d r2 = kotlin.reflect.jvm.internal.impl.types.h2.d.b
            return r2
        L14:
            kotlin.reflect.jvm.internal.impl.types.h2$d r2 = kotlin.reflect.jvm.internal.impl.types.h2.d.a
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.h2 f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L6
            r0 = 6
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r1.I0()
            java.util.List r1 = r1.G0()
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = kotlin.reflect.jvm.internal.impl.types.x1.i(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = g(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.h2 g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r1) {
            if (r1 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = new kotlin.reflect.jvm.internal.impl.types.h2
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.h2 h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
            if (r1 != 0) goto L6
            r0 = 3
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 4
            a(r0)
        Lc:
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = kotlin.reflect.jvm.internal.impl.types.e0.i(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = g(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            if (r2 != 0) goto L7
            r0 = 33
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.Q
            boolean r0 = r2.l(r0)
            if (r0 != 0) goto L10
            return r2
        L10:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.o r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.o
            kotlin.reflect.jvm.internal.impl.types.h2$a r1 = new kotlin.reflect.jvm.internal.impl.types.h2$a
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private static kotlin.reflect.jvm.internal.impl.types.c2 l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j1 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r5) {
            if (r2 != 0) goto L7
            r0 = 26
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 27
            a(r0)
        Le:
            if (r5 != 0) goto L15
            r0 = 28
            a(r0)
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.Q
            boolean r2 = r2.l(r0)
            if (r2 != 0) goto L29
            if (r3 != 0) goto L28
            r2 = 29
            a(r2)
        L28:
            return r3
        L29:
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.n
            if (r0 != 0) goto L36
            goto L6c
        L36:
            kotlin.reflect.jvm.internal.impl.types.checker.n r2 = (kotlin.reflect.jvm.internal.impl.types.checker.n) r2
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r2.getProjection()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r2.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r5.c()
            kotlin.reflect.jvm.internal.impl.types.h2$d r5 = e(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.h2$d r1 = kotlin.reflect.jvm.internal.impl.types.h2.d.c
            if (r5 != r1) goto L56
            kotlin.reflect.jvm.internal.impl.types.e2 r3 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            r3.<init>(r2)
            return r3
        L56:
            if (r4 != 0) goto L59
            goto L6c
        L59:
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r4.l()
            kotlin.reflect.jvm.internal.impl.types.h2$d r4 = e(r4, r0)
            if (r4 != r1) goto L6c
            kotlin.reflect.jvm.internal.impl.types.e2 r3 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            r3.<init>(r2)
        L6c:
            return r3
    }

    private static java.lang.String o(java.lang.Object r2) {
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            boolean r0 = kotlin.reflect.jvm.internal.impl.utils.c.a(r2)
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[Exception while computing toString(): "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L23:
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
    }

    private kotlin.reflect.jvm.internal.impl.types.c2 r(kotlin.reflect.jvm.internal.impl.types.c2 r5, int r6) throws kotlin.reflect.jvm.internal.impl.types.h2.c {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r5.c()
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r2 == 0) goto L15
            return r5
        L15:
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = kotlin.reflect.jvm.internal.impl.types.i1.b(r0)
            if (r5 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.types.h2 r2 = r4.m()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r2.p(r5, r3)
            goto L27
        L26:
            r5 = 0
        L27:
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r0.I0()
            java.util.List r2 = r2.getParameters()
            java.util.List r3 = r0.G0()
            java.util.List r6 = r4.s(r2, r3, r6)
            kotlin.reflect.jvm.internal.impl.types.f2 r2 = r4.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.d(r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = kotlin.reflect.jvm.internal.impl.types.g2.b(r0, r6, r2)
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L55
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = (kotlin.reflect.jvm.internal.impl.types.e1) r6
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = (kotlin.reflect.jvm.internal.impl.types.e1) r5
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = kotlin.reflect.jvm.internal.impl.types.i1.j(r6, r5)
        L55:
            kotlin.reflect.jvm.internal.impl.types.e2 r5 = new kotlin.reflect.jvm.internal.impl.types.e2
            r5.<init>(r1, r6)
            return r5
    }

    private java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> s(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r11, java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> r12, int r13) throws kotlin.reflect.jvm.internal.impl.types.h2.c {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r11.size()
            if (r1 >= r3) goto L67
            java.lang.Object r3 = r11.get(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r3
            java.lang.Object r4 = r12.get(r1)
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            r5 = 1
            int r6 = r13 + 1
            kotlin.reflect.jvm.internal.impl.types.c2 r6 = r10.u(r4, r3, r6)
            int[] r7 = kotlin.reflect.jvm.internal.impl.types.h2.b.a
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = r3.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = r6.c()
            kotlin.reflect.jvm.internal.impl.types.h2$d r8 = e(r8, r9)
            int r8 = r8.ordinal()
            r7 = r7[r8]
            if (r7 == r5) goto L5a
            r8 = 2
            if (r7 == r8) goto L5a
            r8 = 3
            if (r7 == r8) goto L41
            goto L5e
        L41:
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r3.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r3 == r7) goto L5e
            boolean r3 = r6.b()
            if (r3 != 0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.e2 r3 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.getType()
            r3.<init>(r7, r6)
            r6 = r3
            goto L5e
        L5a:
            kotlin.reflect.jvm.internal.impl.types.c2 r6 = kotlin.reflect.jvm.internal.impl.types.j2.s(r3)
        L5e:
            if (r6 == r4) goto L61
            r2 = 1
        L61:
            r0.add(r6)
            int r1 = r1 + 1
            goto Lb
        L67:
            if (r2 != 0) goto L6a
            return r12
        L6a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.types.c2 u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r8, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j1 r9, int r10) throws kotlin.reflect.jvm.internal.impl.types.h2.c {
            r7 = this;
            if (r8 != 0) goto L7
            r0 = 18
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r7.a
            b(r10, r8, r0)
            boolean r0 = r8.b()
            if (r0 == 0) goto L14
            goto L190
        L14:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r8.getType()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.k2
            r2 = 1
            if (r1 == 0) goto L5a
            kotlin.reflect.jvm.internal.impl.types.k2 r0 = (kotlin.reflect.jvm.internal.impl.types.k2) r0
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r0.T()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.o0()
            kotlin.reflect.jvm.internal.impl.types.e2 r3 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r8.c()
            r3.<init>(r4, r1)
            int r10 = r10 + r2
            kotlin.reflect.jvm.internal.impl.types.c2 r9 = r7.u(r3, r9, r10)
            boolean r10 = r9.b()
            if (r10 == 0) goto L3c
            return r9
        L3c:
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = r8.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r7.p(r0, r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = r9.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = r10.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = kotlin.reflect.jvm.internal.impl.types.l2.d(r10, r8)
            kotlin.reflect.jvm.internal.impl.types.e2 r10 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = r9.c()
            r10.<init>(r9, r8)
            return r10
        L5a:
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.g0.a(r0)
            if (r1 != 0) goto L190
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r0.L0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.d1
            if (r1 == 0) goto L6a
            goto L190
        L6a:
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r7.a
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r1.e(r0)
            if (r1 == 0) goto L77
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = l(r0, r1, r9, r8)
            goto L78
        L77:
            r1 = 0
        L78:
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r8.c()
            if (r1 != 0) goto Ldd
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.n0.b(r0)
            if (r4 == 0) goto Ldd
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.v1.b(r0)
            if (r4 != 0) goto Ldd
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = kotlin.reflect.jvm.internal.impl.types.n0.a(r0)
            kotlin.reflect.jvm.internal.impl.types.e2 r1 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r0.Q0()
            r1.<init>(r3, r4)
            int r10 = r10 + r2
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r7.u(r1, r9, r10)
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r0.R0()
            r2.<init>(r3, r4)
            kotlin.reflect.jvm.internal.impl.types.c2 r9 = r7.u(r2, r9, r10)
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = r1.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r0.Q0()
            if (r2 != r3) goto Lc3
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r9.getType()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.R0()
            if (r2 != r0) goto Lc3
            goto L190
        Lc3:
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = kotlin.reflect.jvm.internal.impl.types.g2.a(r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r9.getType()
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = kotlin.reflect.jvm.internal.impl.types.g2.a(r9)
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = kotlin.reflect.jvm.internal.impl.types.w0.e(r8, r9)
            kotlin.reflect.jvm.internal.impl.types.e2 r9 = new kotlin.reflect.jvm.internal.impl.types.e2
            r9.<init>(r10, r8)
            return r9
        Ldd:
            boolean r9 = kotlin.reflect.jvm.internal.impl.builtins.j.o0(r0)
            if (r9 != 0) goto L190
            boolean r9 = kotlin.reflect.jvm.internal.impl.types.x0.a(r0)
            if (r9 == 0) goto Leb
            goto L190
        Leb:
            if (r1 == 0) goto L185
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = r1.c()
            kotlin.reflect.jvm.internal.impl.types.h2$d r8 = e(r3, r8)
            boolean r9 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e.f(r0)
            r10 = 2
            if (r9 != 0) goto L125
            int[] r9 = kotlin.reflect.jvm.internal.impl.types.h2.b.a
            int r4 = r8.ordinal()
            r9 = r9[r4]
            if (r9 == r2) goto L11d
            if (r9 == r10) goto L109
            goto L125
        L109:
            kotlin.reflect.jvm.internal.impl.types.e2 r8 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.w1 r10 = r0.I0()
            kotlin.reflect.jvm.internal.impl.builtins.j r10 = r10.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r10.J()
            r8.<init>(r9, r10)
            return r8
        L11d:
            kotlin.reflect.jvm.internal.impl.types.h2$c r8 = new kotlin.reflect.jvm.internal.impl.types.h2$c
            java.lang.String r9 = "Out-projection in in-position"
            r8.<init>(r9)
            throw r8
        L125:
            kotlin.reflect.jvm.internal.impl.types.x r9 = kotlin.reflect.jvm.internal.impl.types.v1.a(r0)
            boolean r4 = r1.b()
            if (r4 == 0) goto L130
            return r1
        L130:
            if (r9 == 0) goto L13b
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r9.p0(r4)
            goto L147
        L13b:
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r1.getType()
            boolean r4 = r0.J0()
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = kotlin.reflect.jvm.internal.impl.types.j2.q(r9, r4)
        L147:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.getAnnotations()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L173
            kotlin.reflect.jvm.internal.impl.types.f2 r4 = r7.a
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r4.d(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = i(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.n r4 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.n
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r9.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[] r10 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[r10]
            r6 = 0
            r10[r6] = r5
            r10[r2] = r0
            r4.<init>(r10)
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.D(r9, r4)
        L173:
            kotlin.reflect.jvm.internal.impl.types.h2$d r10 = kotlin.reflect.jvm.internal.impl.types.h2.d.a
            if (r8 != r10) goto L17f
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = r1.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = d(r3, r8)
        L17f:
            kotlin.reflect.jvm.internal.impl.types.e2 r8 = new kotlin.reflect.jvm.internal.impl.types.e2
            r8.<init>(r3, r9)
            return r8
        L185:
            kotlin.reflect.jvm.internal.impl.types.c2 r8 = r7.r(r8, r10)
            if (r8 != 0) goto L190
            r9 = 25
            a(r9)
        L190:
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.f2 j() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r2.a
            if (r0 != 0) goto L9
            r1 = 8
            a(r1)
        L9:
            return r0
    }

    public boolean k() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.a
            boolean r0 = r0.f()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.h2 m() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r5.a
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.o0
            if (r1 == 0) goto L29
            boolean r0 = r0.b()
            if (r0 != 0) goto Ld
            goto L29
        Ld:
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = new kotlin.reflect.jvm.internal.impl.types.h2
            kotlin.reflect.jvm.internal.impl.types.o0 r1 = new kotlin.reflect.jvm.internal.impl.types.o0
            kotlin.reflect.jvm.internal.impl.types.f2 r2 = r5.a
            kotlin.reflect.jvm.internal.impl.types.o0 r2 = (kotlin.reflect.jvm.internal.impl.types.o0) r2
            kotlin.reflect.jvm.internal.impl.descriptors.j1[] r2 = r2.j()
            kotlin.reflect.jvm.internal.impl.types.f2 r3 = r5.a
            kotlin.reflect.jvm.internal.impl.types.o0 r3 = (kotlin.reflect.jvm.internal.impl.types.o0) r3
            kotlin.reflect.jvm.internal.impl.types.c2[] r3 = r3.i()
            r4 = 0
            r1.<init>(r2, r3, r4)
            r0.<init>(r1)
            return r0
        L29:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r3) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 9
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 10
            a(r0)
        Le:
            boolean r0 = r1.k()
            if (r0 == 0) goto L1c
            if (r2 != 0) goto L1b
            r3 = 11
            a(r3)
        L1b:
            return r2
        L1c:
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2     // Catch: kotlin.reflect.jvm.internal.impl.types.h2.c -> L33
            r0.<init>(r3, r2)     // Catch: kotlin.reflect.jvm.internal.impl.types.h2.c -> L33
            r2 = 0
            r3 = 0
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r1.u(r0, r2, r3)     // Catch: kotlin.reflect.jvm.internal.impl.types.h2.c -> L33
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()     // Catch: kotlin.reflect.jvm.internal.impl.types.h2.c -> L33
            if (r2 != 0) goto L32
            r3 = 12
            a(r3)
        L32:
            return r2
        L33:
            r2 = move-exception
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r3 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE
            java.lang.String r2 = r2.getMessage()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            kotlin.reflect.jvm.internal.impl.types.error.g r2 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r3, r2)
            if (r2 != 0) goto L49
            r3 = 13
            a(r3)
        L49:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.t0 p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r4) {
            r2 = this;
            if (r3 != 0) goto L7
            r0 = 14
            a(r0)
        L7:
            if (r4 != 0) goto Le
            r0 = 15
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r2.j()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r1.g(r3, r4)
            r0.<init>(r4, r3)
            kotlin.reflect.jvm.internal.impl.types.c2 r3 = r2.q(r0)
            if (r3 != 0) goto L23
            r3 = 0
            return r3
        L23:
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.c2 q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 16
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r1.t(r2)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.a
            boolean r0 = r0.a()
            if (r0 != 0) goto L1c
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.a
            boolean r0 = r0.b()
            if (r0 != 0) goto L1c
            return r2
        L1c:
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.a
            boolean r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.d.e(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.c2 t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r3) {
            r2 = this;
            if (r3 != 0) goto L7
            r0 = 17
            a(r0)
        L7:
            boolean r0 = r2.k()
            if (r0 == 0) goto Le
            return r3
        Le:
            r0 = 0
            r1 = 0
            kotlin.reflect.jvm.internal.impl.types.c2 r3 = r2.u(r3, r1, r0)     // Catch: kotlin.reflect.jvm.internal.impl.types.h2.c -> L15
            return r3
        L15:
            return r1
    }
}
