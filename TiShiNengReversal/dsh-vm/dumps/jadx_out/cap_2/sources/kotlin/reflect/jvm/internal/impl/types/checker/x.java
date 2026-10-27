package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class x implements kotlin.reflect.jvm.internal.impl.types.checker.z {
    x() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ void b(int r3) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            switch(r3) {
                case 1: goto L25;
                case 2: goto L20;
                case 3: goto L7;
                case 4: goto L25;
                case 5: goto L1b;
                case 6: goto L16;
                case 7: goto L20;
                case 8: goto L11;
                case 9: goto Lc;
                case 10: goto L1b;
                case 11: goto L16;
                default: goto L7;
            }
        L7:
            java.lang.String r2 = "a"
            r0[r1] = r2
            goto L29
        Lc:
            java.lang.String r2 = "typeProjection"
            r0[r1] = r2
            goto L29
        L11:
            java.lang.String r2 = "type"
            r0[r1] = r2
            goto L29
        L16:
            java.lang.String r2 = "supertype"
            r0[r1] = r2
            goto L29
        L1b:
            java.lang.String r2 = "subtype"
            r0[r1] = r2
            goto L29
        L20:
            java.lang.String r2 = "typeCheckingProcedure"
            r0[r1] = r2
            goto L29
        L25:
            java.lang.String r2 = "b"
            r0[r1] = r2
        L29:
            r1 = 1
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl"
            r0[r1] = r2
            r1 = 2
            switch(r3) {
                case 3: goto L46;
                case 4: goto L46;
                case 5: goto L41;
                case 6: goto L41;
                case 7: goto L41;
                case 8: goto L3c;
                case 9: goto L3c;
                case 10: goto L37;
                case 11: goto L37;
                default: goto L32;
            }
        L32:
            java.lang.String r3 = "assertEqualTypes"
            r0[r1] = r3
            goto L4a
        L37:
            java.lang.String r3 = "noCorrespondingSupertype"
            r0[r1] = r3
            goto L4a
        L3c:
            java.lang.String r3 = "capture"
            r0[r1] = r3
            goto L4a
        L41:
            java.lang.String r3 = "assertSubtype"
            r0[r1] = r3
            goto L4a
        L46:
            java.lang.String r3 = "assertEqualTypeConstructors"
            r0[r1] = r3
        L4a:
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.z
    public boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 3
            b(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 4
            b(r0)
        Lc:
            boolean r2 = r2.equals(r3)
            return r2
    }
}
