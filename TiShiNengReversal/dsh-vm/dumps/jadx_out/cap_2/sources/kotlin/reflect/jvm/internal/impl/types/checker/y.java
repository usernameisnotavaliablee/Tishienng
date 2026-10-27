package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class y {
    static final /* synthetic */ boolean a = false;

    static {
            return
    }

    private static /* synthetic */ void a(int r9) {
            r0 = 10
            r1 = 7
            if (r9 == r1) goto La
            if (r9 == r0) goto La
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lc
        La:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lc:
            r3 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r4 = 3
            goto L14
        L13:
            r4 = 2
        L14:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure"
            r6 = 0
            switch(r9) {
                case 1: goto L5b;
                case 2: goto L1c;
                case 3: goto L5b;
                case 4: goto L56;
                case 5: goto L51;
                case 6: goto L4c;
                case 7: goto L49;
                case 8: goto L51;
                case 9: goto L4c;
                case 10: goto L49;
                case 11: goto L44;
                case 12: goto L3f;
                case 13: goto L3a;
                case 14: goto L35;
                case 15: goto L30;
                case 16: goto L2b;
                case 17: goto L1c;
                case 18: goto L5b;
                case 19: goto L1c;
                case 20: goto L5b;
                case 21: goto L26;
                case 22: goto L21;
                case 23: goto L51;
                default: goto L1c;
            }
        L1c:
            java.lang.String r7 = "subtype"
            r4[r6] = r7
            goto L5f
        L21:
            java.lang.String r7 = "supertypeArgumentProjection"
            r4[r6] = r7
            goto L5f
        L26:
            java.lang.String r7 = "subtypeArgumentProjection"
            r4[r6] = r7
            goto L5f
        L2b:
            java.lang.String r7 = "typeArgumentVariance"
            r4[r6] = r7
            goto L5f
        L30:
            java.lang.String r7 = "typeParameterVariance"
            r4[r6] = r7
            goto L5f
        L35:
            java.lang.String r7 = "typeArgument"
            r4[r6] = r7
            goto L5f
        L3a:
            java.lang.String r7 = "typeParameter"
            r4[r6] = r7
            goto L5f
        L3f:
            java.lang.String r7 = "type2"
            r4[r6] = r7
            goto L5f
        L44:
            java.lang.String r7 = "type1"
            r4[r6] = r7
            goto L5f
        L49:
            r4[r6] = r5
            goto L5f
        L4c:
            java.lang.String r7 = "argument"
            r4[r6] = r7
            goto L5f
        L51:
            java.lang.String r7 = "parameter"
            r4[r6] = r7
            goto L5f
        L56:
            java.lang.String r7 = "typeCheckingProcedureCallbacks"
            r4[r6] = r7
            goto L5f
        L5b:
            java.lang.String r7 = "supertype"
            r4[r6] = r7
        L5f:
            java.lang.String r6 = "getOutType"
            java.lang.String r7 = "getInType"
            r8 = 1
            if (r9 == r1) goto L6e
            if (r9 == r0) goto L6b
            r4[r8] = r5
            goto L70
        L6b:
            r4[r8] = r7
            goto L70
        L6e:
            r4[r8] = r6
        L70:
            switch(r9) {
                case 5: goto L94;
                case 6: goto L94;
                case 7: goto L96;
                case 8: goto L91;
                case 9: goto L91;
                case 10: goto L96;
                case 11: goto L8c;
                case 12: goto L8c;
                case 13: goto L87;
                case 14: goto L87;
                case 15: goto L87;
                case 16: goto L87;
                case 17: goto L82;
                case 18: goto L82;
                case 19: goto L7d;
                case 20: goto L7d;
                case 21: goto L78;
                case 22: goto L78;
                case 23: goto L78;
                default: goto L73;
            }
        L73:
            java.lang.String r5 = "findCorrespondingSupertype"
            r4[r3] = r5
            goto L96
        L78:
            java.lang.String r5 = "capture"
            r4[r3] = r5
            goto L96
        L7d:
            java.lang.String r5 = "checkSubtypeForTheSameConstructor"
            r4[r3] = r5
            goto L96
        L82:
            java.lang.String r5 = "isSubtypeOf"
            r4[r3] = r5
            goto L96
        L87:
            java.lang.String r5 = "getEffectiveProjectionKind"
            r4[r3] = r5
            goto L96
        L8c:
            java.lang.String r5 = "equalTypes"
            r4[r3] = r5
            goto L96
        L91:
            r4[r3] = r7
            goto L96
        L94:
            r4[r3] = r6
        L96:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r9 == r1) goto La4
            if (r9 == r0) goto La4
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto La9
        La4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        La9:
            throw r9
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.types.t0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            if (r1 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 1
            a(r0)
        Lc:
            kotlin.reflect.jvm.internal.impl.types.checker.x r0 = new kotlin.reflect.jvm.internal.impl.types.checker.x
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = c(r1, r2, r0)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.types.t0 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.z r3) {
            if (r1 != 0) goto L6
            r0 = 2
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 3
            a(r0)
        Lc:
            if (r3 != 0) goto L12
            r0 = 4
            a(r0)
        L12:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.checker.d0.d(r1, r2, r3)
            return r1
    }
}
