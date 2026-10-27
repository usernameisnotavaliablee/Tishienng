package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class j2 {
    public static final kotlin.reflect.jvm.internal.impl.types.e1 a = null;
    public static final kotlin.reflect.jvm.internal.impl.types.e1 b = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 c = null;
    public static final kotlin.reflect.jvm.internal.impl.types.e1 d = null;
    static final /* synthetic */ boolean e = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends kotlin.reflect.jvm.internal.impl.types.b0 {
        private final java.lang.String b;

        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        private static /* synthetic */ void U0(int r9) {
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = 3
                goto L14
            L13:
                r5 = 2
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.t0
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.j2$a r1 = r0.V0(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.m2
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.P0(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.m2
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.j2$a r1 = r0.V0(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.m2
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 O0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.Q0(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.e1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r1.b
                r2.<init>(r0)
                throw r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.e1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r2 = 0
                U0(r2)
            L6:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r1.b
                r2.<init>(r0)
                throw r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b0
        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.types.e1 R0() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = r2.b
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b0
        @org.jetbrains.annotations.NotNull
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.j2$a r1 = r0.V0(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b0
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.b0 T0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r2 = 2
                U0(r2)
            L6:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = r1.b
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.j2.a V0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 3
                U0(r1)
            L6:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.e1
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.b
                if (r0 != 0) goto L8
                r1 = 1
                U0(r1)
            L8:
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.DONT_CARE
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            kotlin.reflect.jvm.internal.impl.types.error.g r0 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.j2.a = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE
            java.lang.String[] r1 = new java.lang.String[r1]
            kotlin.reflect.jvm.internal.impl.types.error.g r0 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.j2.b = r0
            kotlin.reflect.jvm.internal.impl.types.j2$a r0 = new kotlin.reflect.jvm.internal.impl.types.j2$a
            java.lang.String r1 = "NO_EXPECTED_TYPE"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.j2.c = r0
            kotlin.reflect.jvm.internal.impl.types.j2$a r0 = new kotlin.reflect.jvm.internal.impl.types.j2$a
            java.lang.String r1 = "UNIT_EXPECTED_TYPE"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.j2.d = r0
            return
    }

    public j2() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ void a(int r24) {
            r0 = r24
            r1 = 7
            r2 = 6
            r3 = 53
            r4 = 48
            r5 = 35
            r6 = 26
            r7 = 19
            r8 = 17
            r9 = 15
            r10 = 11
            r11 = 9
            r12 = 4
            if (r0 == r12) goto L35
            if (r0 == r11) goto L35
            if (r0 == r10) goto L35
            if (r0 == r9) goto L35
            if (r0 == r8) goto L35
            if (r0 == r7) goto L35
            if (r0 == r6) goto L35
            if (r0 == r5) goto L35
            if (r0 == r4) goto L35
            if (r0 == r3) goto L35
            if (r0 == r2) goto L35
            if (r0 == r1) goto L35
            switch(r0) {
                case 56: goto L35;
                case 57: goto L35;
                case 58: goto L35;
                case 59: goto L35;
                default: goto L32;
            }
        L32:
            java.lang.String r13 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L37
        L35:
            java.lang.String r13 = "@NotNull method %s.%s must not return null"
        L37:
            r14 = 2
            if (r0 == r12) goto L55
            if (r0 == r11) goto L55
            if (r0 == r10) goto L55
            if (r0 == r9) goto L55
            if (r0 == r8) goto L55
            if (r0 == r7) goto L55
            if (r0 == r6) goto L55
            if (r0 == r5) goto L55
            if (r0 == r4) goto L55
            if (r0 == r3) goto L55
            if (r0 == r2) goto L55
            if (r0 == r1) goto L55
            switch(r0) {
                case 56: goto L55;
                case 57: goto L55;
                case 58: goto L55;
                case 59: goto L55;
                default: goto L53;
            }
        L53:
            r15 = 3
            goto L56
        L55:
            r15 = 2
        L56:
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r16 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils"
            r17 = 0
            switch(r0) {
                case 4: goto Ld7;
                case 5: goto L5f;
                case 6: goto Ld7;
                case 7: goto Ld7;
                case 8: goto L5f;
                case 9: goto Ld7;
                case 10: goto L5f;
                case 11: goto Ld7;
                case 12: goto Ld2;
                case 13: goto Lcd;
                case 14: goto Lc8;
                case 15: goto Ld7;
                case 16: goto Lc3;
                case 17: goto Ld7;
                case 18: goto L5f;
                case 19: goto Ld7;
                case 20: goto Lbe;
                case 21: goto Lb9;
                case 22: goto Lb4;
                case 23: goto L5f;
                case 24: goto Laf;
                case 25: goto L5f;
                case 26: goto Ld7;
                case 27: goto L5f;
                case 28: goto L5f;
                case 29: goto L5f;
                case 30: goto L5f;
                case 31: goto Laa;
                case 32: goto La5;
                case 33: goto Laa;
                case 34: goto La0;
                case 35: goto Ld7;
                case 36: goto L9b;
                case 37: goto L96;
                case 38: goto L5f;
                case 39: goto L91;
                case 40: goto L5f;
                case 41: goto L8c;
                case 42: goto L87;
                case 43: goto L82;
                case 44: goto L82;
                case 45: goto L7d;
                case 46: goto L7d;
                case 47: goto L77;
                case 48: goto Ld7;
                case 49: goto L71;
                case 50: goto L71;
                case 51: goto L77;
                case 52: goto L6b;
                case 53: goto Ld7;
                case 54: goto L65;
                case 55: goto L6b;
                case 56: goto Ld7;
                case 57: goto Ld7;
                case 58: goto Ld7;
                case 59: goto Ld7;
                default: goto L5f;
            }
        L5f:
            java.lang.String r18 = "type"
            r15[r17] = r18
            goto Ld9
        L65:
            java.lang.String r18 = "literalTypeConstructor"
            r15[r17] = r18
            goto Ld9
        L6b:
            java.lang.String r18 = "expectedType"
            r15[r17] = r18
            goto Ld9
        L71:
            java.lang.String r18 = "supertypes"
            r15[r17] = r18
            goto Ld9
        L77:
            java.lang.String r18 = "numberValueTypeConstructor"
            r15[r17] = r18
            goto Ld9
        L7d:
            java.lang.String r18 = "parameterDescriptor"
            r15[r17] = r18
            goto Ld9
        L82:
            java.lang.String r18 = "isSpecialType"
            r15[r17] = r18
            goto Ld9
        L87:
            java.lang.String r18 = "specialType"
            r15[r17] = r18
            goto Ld9
        L8c:
            java.lang.String r18 = "typeParameterConstructors"
            r15[r17] = r18
            goto Ld9
        L91:
            java.lang.String r18 = "typeParameters"
            r15[r17] = r18
            goto Ld9
        L96:
            java.lang.String r18 = "b"
            r15[r17] = r18
            goto Ld9
        L9b:
            java.lang.String r18 = "a"
            r15[r17] = r18
            goto Ld9
        La0:
            java.lang.String r18 = "projections"
            r15[r17] = r18
            goto Ld9
        La5:
            java.lang.String r18 = "typeArguments"
            r15[r17] = r18
            goto Ld9
        Laa:
            java.lang.String r18 = "clazz"
            r15[r17] = r18
            goto Ld9
        Laf:
            java.lang.String r18 = "result"
            r15[r17] = r18
            goto Ld9
        Lb4:
            java.lang.String r18 = "substitutor"
            r15[r17] = r18
            goto Ld9
        Lb9:
            java.lang.String r18 = "superType"
            r15[r17] = r18
            goto Ld9
        Lbe:
            java.lang.String r18 = "subType"
            r15[r17] = r18
            goto Ld9
        Lc3:
            java.lang.String r18 = "parameters"
            r15[r17] = r18
            goto Ld9
        Lc8:
            java.lang.String r18 = "refinedTypeFactory"
            r15[r17] = r18
            goto Ld9
        Lcd:
            java.lang.String r18 = "unsubstitutedMemberScope"
            r15[r17] = r18
            goto Ld9
        Ld2:
            java.lang.String r18 = "typeConstructor"
            r15[r17] = r18
            goto Ld9
        Ld7:
            r15[r17] = r16
        Ld9:
            java.lang.String r17 = "getDefaultTypeProjections"
            java.lang.String r18 = "getImmediateSupertypes"
            java.lang.String r19 = "getAllSupertypes"
            java.lang.String r20 = "substituteProjectionsForParameters"
            java.lang.String r21 = "getDefaultPrimitiveNumberType"
            java.lang.String r22 = "getPrimitiveNumberType"
            r23 = 1
            if (r0 == r12) goto L121
            if (r0 == r11) goto L11c
            if (r0 == r10) goto L117
            if (r0 == r9) goto L117
            if (r0 == r8) goto L114
            if (r0 == r7) goto L111
            if (r0 == r6) goto L10e
            if (r0 == r5) goto L10b
            if (r0 == r4) goto L108
            if (r0 == r3) goto L105
            if (r0 == r2) goto L11c
            if (r0 == r1) goto L11c
            switch(r0) {
                case 56: goto L105;
                case 57: goto L105;
                case 58: goto L105;
                case 59: goto L105;
                default: goto L102;
            }
        L102:
            r15[r23] = r16
            goto L125
        L105:
            r15[r23] = r22
            goto L125
        L108:
            r15[r23] = r21
            goto L125
        L10b:
            r15[r23] = r20
            goto L125
        L10e:
            r15[r23] = r19
            goto L125
        L111:
            r15[r23] = r18
            goto L125
        L114:
            r15[r23] = r17
            goto L125
        L117:
            java.lang.String r16 = "makeUnsubstitutedType"
            r15[r23] = r16
            goto L125
        L11c:
            java.lang.String r16 = "makeNullableIfNeeded"
            r15[r23] = r16
            goto L125
        L121:
            java.lang.String r16 = "makeNullableAsSpecified"
            r15[r23] = r16
        L125:
            switch(r0) {
                case 1: goto L1b7;
                case 2: goto L1b2;
                case 3: goto L1ad;
                case 4: goto L1bb;
                case 5: goto L1a8;
                case 6: goto L1bb;
                case 7: goto L1bb;
                case 8: goto L1a8;
                case 9: goto L1bb;
                case 10: goto L1a3;
                case 11: goto L1bb;
                case 12: goto L19e;
                case 13: goto L19e;
                case 14: goto L19e;
                case 15: goto L1bb;
                case 16: goto L19b;
                case 17: goto L1bb;
                case 18: goto L198;
                case 19: goto L1bb;
                case 20: goto L193;
                case 21: goto L193;
                case 22: goto L193;
                case 23: goto L18e;
                case 24: goto L18e;
                case 25: goto L18b;
                case 26: goto L1bb;
                case 27: goto L186;
                case 28: goto L181;
                case 29: goto L17c;
                case 30: goto L177;
                case 31: goto L172;
                case 32: goto L172;
                case 33: goto L16f;
                case 34: goto L16f;
                case 35: goto L1bb;
                case 36: goto L16a;
                case 37: goto L16a;
                case 38: goto L165;
                case 39: goto L165;
                case 40: goto L160;
                case 41: goto L160;
                case 42: goto L15a;
                case 43: goto L15a;
                case 44: goto L15a;
                case 45: goto L154;
                case 46: goto L154;
                case 47: goto L150;
                case 48: goto L1bb;
                case 49: goto L150;
                case 50: goto L14a;
                case 51: goto L146;
                case 52: goto L146;
                case 53: goto L1bb;
                case 54: goto L146;
                case 55: goto L146;
                case 56: goto L1bb;
                case 57: goto L1bb;
                case 58: goto L1bb;
                case 59: goto L1bb;
                case 60: goto L140;
                case 61: goto L13a;
                case 62: goto L134;
                case 63: goto L12e;
                default: goto L128;
            }
        L128:
            java.lang.String r16 = "noExpectedType"
            r15[r14] = r16
            goto L1bb
        L12e:
            java.lang.String r16 = "getTypeParameterDescriptorOrNull"
            r15[r14] = r16
            goto L1bb
        L134:
            java.lang.String r16 = "isNonReifiedTypeParameter"
            r15[r14] = r16
            goto L1bb
        L13a:
            java.lang.String r16 = "isReifiedTypeParameter"
            r15[r14] = r16
            goto L1bb
        L140:
            java.lang.String r16 = "isTypeParameter"
            r15[r14] = r16
            goto L1bb
        L146:
            r15[r14] = r22
            goto L1bb
        L14a:
            java.lang.String r16 = "findByFqName"
            r15[r14] = r16
            goto L1bb
        L150:
            r15[r14] = r21
            goto L1bb
        L154:
            java.lang.String r16 = "makeStarProjection"
            r15[r14] = r16
            goto L1bb
        L15a:
            java.lang.String r16 = "contains"
            r15[r14] = r16
            goto L1bb
        L160:
            java.lang.String r16 = "dependsOnTypeConstructors"
            r15[r14] = r16
            goto L1bb
        L165:
            java.lang.String r16 = "dependsOnTypeParameters"
            r15[r14] = r16
            goto L1bb
        L16a:
            java.lang.String r16 = "equalTypes"
            r15[r14] = r16
            goto L1bb
        L16f:
            r15[r14] = r20
            goto L1bb
        L172:
            java.lang.String r16 = "substituteParameters"
            r15[r14] = r16
            goto L1bb
        L177:
            java.lang.String r16 = "getClassDescriptor"
            r15[r14] = r16
            goto L1bb
        L17c:
            java.lang.String r16 = "hasNullableSuperType"
            r15[r14] = r16
            goto L1bb
        L181:
            java.lang.String r16 = "acceptsNullable"
            r15[r14] = r16
            goto L1bb
        L186:
            java.lang.String r16 = "isNullableType"
            r15[r14] = r16
            goto L1bb
        L18b:
            r15[r14] = r19
            goto L1bb
        L18e:
            java.lang.String r16 = "collectAllSupertypes"
            r15[r14] = r16
            goto L1bb
        L193:
            java.lang.String r16 = "createSubstitutedSupertype"
            r15[r14] = r16
            goto L1bb
        L198:
            r15[r14] = r18
            goto L1bb
        L19b:
            r15[r14] = r17
            goto L1bb
        L19e:
            java.lang.String r16 = "makeUnsubstitutedType"
            r15[r14] = r16
            goto L1bb
        L1a3:
            java.lang.String r16 = "canHaveSubtypes"
            r15[r14] = r16
            goto L1bb
        L1a8:
            java.lang.String r16 = "makeNullableIfNeeded"
            r15[r14] = r16
            goto L1bb
        L1ad:
            java.lang.String r16 = "makeNullableAsSpecified"
            r15[r14] = r16
            goto L1bb
        L1b2:
            java.lang.String r16 = "makeNotNullable"
            r15[r14] = r16
            goto L1bb
        L1b7:
            java.lang.String r16 = "makeNullable"
            r15[r14] = r16
        L1bb:
            java.lang.String r13 = java.lang.String.format(r13, r15)
            if (r0 == r12) goto L1e0
            if (r0 == r11) goto L1e0
            if (r0 == r10) goto L1e0
            if (r0 == r9) goto L1e0
            if (r0 == r8) goto L1e0
            if (r0 == r7) goto L1e0
            if (r0 == r6) goto L1e0
            if (r0 == r5) goto L1e0
            if (r0 == r4) goto L1e0
            if (r0 == r3) goto L1e0
            if (r0 == r2) goto L1e0
            if (r0 == r1) goto L1e0
            switch(r0) {
                case 56: goto L1e0;
                case 57: goto L1e0;
                case 58: goto L1e0;
                case 59: goto L1e0;
                default: goto L1da;
            }
        L1da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r13)
            goto L1e5
        L1e0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
        L1e5:
            throw r0
    }

    public static boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            if (r2 != 0) goto L7
            r0 = 28
            a(r0)
        L7:
            boolean r0 = r2.J0()
            r1 = 1
            if (r0 == 0) goto Lf
            return r1
        Lf:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.n0.b(r2)
            if (r0 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.types.k0 r2 = kotlin.reflect.jvm.internal.impl.types.n0.a(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.R0()
            boolean r2 = b(r2)
            if (r2 == 0) goto L24
            return r1
        L24:
            r2 = 0
            return r2
    }

    public static boolean c(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.m2, java.lang.Boolean> r2) {
            if (r2 != 0) goto L7
            r0 = 43
            a(r0)
        L7:
            r0 = 0
            boolean r1 = d(r1, r2, r0)
            return r1
    }

    private static boolean d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.m2, java.lang.Boolean> r6, kotlin.reflect.jvm.internal.impl.utils.k<kotlin.reflect.jvm.internal.impl.types.t0> r7) {
            if (r6 != 0) goto L7
            r0 = 44
            a(r0)
        L7:
            r0 = 0
            if (r5 != 0) goto Lb
            return r0
        Lb:
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r5.L0()
            boolean r2 = w(r5)
            if (r2 == 0) goto L20
            java.lang.Object r5 = r6.invoke(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L20:
            if (r7 == 0) goto L29
            boolean r2 = r7.contains(r5)
            if (r2 == 0) goto L29
            return r0
        L29:
            java.lang.Object r2 = r6.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 1
            if (r2 == 0) goto L37
            return r3
        L37:
            if (r7 != 0) goto L3d
            kotlin.reflect.jvm.internal.impl.utils.k r7 = kotlin.reflect.jvm.internal.impl.utils.k.a()
        L3d:
            r7.add(r5)
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r2 == 0) goto L48
            r2 = r1
            kotlin.reflect.jvm.internal.impl.types.k0 r2 = (kotlin.reflect.jvm.internal.impl.types.k0) r2
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r2.Q0()
            boolean r4 = d(r4, r6, r7)
            if (r4 != 0) goto L5f
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.R0()
            boolean r2 = d(r2, r6, r7)
            if (r2 == 0) goto L60
        L5f:
            return r3
        L60:
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.z
            if (r2 == 0) goto L71
            kotlin.reflect.jvm.internal.impl.types.z r1 = (kotlin.reflect.jvm.internal.impl.types.z) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.U0()
            boolean r1 = d(r1, r6, r7)
            if (r1 == 0) goto L71
            return r3
        L71:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r5.I0()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.s0
            if (r2 == 0) goto L97
            kotlin.reflect.jvm.internal.impl.types.s0 r1 = (kotlin.reflect.jvm.internal.impl.types.s0) r1
            java.util.Collection r5 = r1.i()
            java.util.Iterator r5 = r5.iterator()
        L83:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
            boolean r1 = d(r1, r6, r7)
            if (r1 == 0) goto L83
            return r3
        L96:
            return r0
        L97:
            java.util.List r5 = r5.G0()
            java.util.Iterator r5 = r5.iterator()
        L9f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = (kotlin.reflect.jvm.internal.impl.types.c2) r1
            boolean r2 = r1.b()
            if (r2 == 0) goto Lb2
            goto L9f
        Lb2:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            boolean r1 = d(r1, r6, r7)     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto L9f
            return r3
        Lbd:
            r5 = move-exception
            throw r5
        Lbf:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.types.t0 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r3) {
            if (r1 != 0) goto L7
            r0 = 20
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 21
            a(r0)
        Le:
            if (r3 != 0) goto L15
            r0 = 22
            a(r0)
        L15:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.p(r2, r0)
            if (r2 == 0) goto L26
            boolean r1 = r1.J0()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = q(r2, r1)
            return r1
        L26:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.d f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 30
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            return r1
        L16:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> g(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r3) {
            if (r3 != 0) goto L7
            r0 = 16
            a(r0)
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.s()
            r2.<init>(r1)
            r0.add(r2)
            goto L14
        L2d:
            java.util.List r3 = kotlin.collections.f0.a6(r0)
            if (r3 != 0) goto L38
            r0 = 17
            a(r0)
        L38:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            if (r4 != 0) goto L7
            r0 = 18
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.f(r4)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r4.I0()
            java.util.Collection r1 = r1.i()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = e(r4, r3, r0)
            if (r3 == 0) goto L20
            r2.add(r3)
            goto L20
        L36:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.j1 i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 63
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static boolean j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            if (r2 != 0) goto L7
            r0 = 29
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r1 = 0
            if (r0 == 0) goto L15
            return r1
        L15:
            java.util.List r2 = h(r2)
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            boolean r0 = l(r0)
            if (r0 == 0) goto L1d
            r2 = 1
            return r2
        L31:
            return r1
    }

    public static boolean k(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.j2.a
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            if (r1 != r0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            if (r3 != 0) goto L7
            r0 = 27
            a(r0)
        L7:
            boolean r0 = r3.J0()
            r1 = 1
            if (r0 == 0) goto Lf
            return r1
        Lf:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.n0.b(r3)
            if (r0 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = kotlin.reflect.jvm.internal.impl.types.n0.a(r3)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.R0()
            boolean r0 = l(r0)
            if (r0 == 0) goto L24
            return r1
        L24:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.i1.c(r3)
            r2 = 0
            if (r0 == 0) goto L2c
            return r2
        L2c:
            boolean r0 = m(r3)
            if (r0 == 0) goto L37
            boolean r3 = j(r3)
            return r3
        L37:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.e
            if (r0 == 0) goto L54
            kotlin.reflect.jvm.internal.impl.types.e r3 = (kotlin.reflect.jvm.internal.impl.types.e) r3
            kotlin.reflect.jvm.internal.impl.types.checker.r r3 = r3.R0()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = r3.b()
            if (r3 == 0) goto L53
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.s()
            boolean r3 = j(r3)
            if (r3 == 0) goto L52
            goto L53
        L52:
            return r2
        L53:
            return r1
        L54:
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.I0()
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.s0
            if (r0 == 0) goto L77
            java.util.Collection r3 = r3.i()
            java.util.Iterator r3 = r3.iterator()
        L64:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            boolean r0 = l(r0)
            if (r0 == 0) goto L64
            return r1
        L77:
            return r2
    }

    public static boolean m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 60
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = i(r1)
            if (r0 != 0) goto L18
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.checker.r
            if (r1 == 0) goto L16
            goto L18
        L16:
            r1 = 0
            return r1
        L18:
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.t0 n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L6
            r0 = 2
            a(r0)
        L6:
            r0 = 0
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = p(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.t0 o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            r0 = 1
            if (r1 != 0) goto L6
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = p(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.t0 p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, boolean r2) {
            if (r1 != 0) goto L6
            r0 = 3
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.M0(r2)
            if (r1 != 0) goto L14
            r2 = 4
            a(r2)
        L14:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.t0 q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, boolean r2) {
            if (r1 != 0) goto L7
            r0 = 8
            a(r0)
        L7:
            if (r2 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = o(r1)
            return r1
        Le:
            if (r1 != 0) goto L15
            r2 = 9
            a(r2)
        L15:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.e1 r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r1, boolean r2) {
            if (r1 != 0) goto L6
            r0 = 5
            a(r0)
        L6:
            if (r2 == 0) goto L14
            r2 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.P0(r2)
            if (r1 != 0) goto L13
            r2 = 6
            a(r2)
        L13:
            return r1
        L14:
            if (r1 != 0) goto L1a
            r2 = 7
            a(r2)
        L1a:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.c2 s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r1) {
            if (r1 != 0) goto L7
            r0 = 45
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = new kotlin.reflect.jvm.internal.impl.types.l1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.c2 t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, kotlin.reflect.jvm.internal.impl.types.i0 r2) {
            if (r1 != 0) goto L7
            r0 = 46
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE
            if (r2 != r0) goto L19
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.m1.b(r1)
            r2.<init>(r1)
            return r2
        L19:
            kotlin.reflect.jvm.internal.impl.types.l1 r2 = new kotlin.reflect.jvm.internal.impl.types.l1
            r2.<init>(r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.e1 u(kotlin.reflect.jvm.internal.impl.descriptors.f r1, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.types.e1> r3) {
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r1)
            if (r0 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE
            java.lang.String r1 = r1.toString()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r2, r1)
            if (r1 != 0) goto L1b
            r2 = 11
            a(r2)
        L1b:
            return r1
        L1c:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.o()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = v(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.types.e1 v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.types.e1> r9) {
            if (r7 != 0) goto L7
            r0 = 12
            a(r0)
        L7:
            if (r8 != 0) goto Le
            r0 = 13
            a(r0)
        Le:
            if (r9 != 0) goto L15
            r0 = 14
            a(r0)
        L15:
            java.util.List r0 = r7.getParameters()
            java.util.List r3 = g(r0)
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r0.k()
            r4 = 0
            r2 = r7
            r5 = r8
            r6 = r9
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = kotlin.reflect.jvm.internal.impl.types.w0.p(r1, r2, r3, r4, r5, r6)
            if (r7 != 0) goto L32
            r8 = 15
            a(r8)
        L32:
            return r7
    }

    public static boolean w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r0 = 0
            if (r2 != 0) goto L6
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.j2.c
            if (r2 == r1) goto L10
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.j2.d
            if (r2 != r1) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            r2 = 1
            return r2
    }
}
