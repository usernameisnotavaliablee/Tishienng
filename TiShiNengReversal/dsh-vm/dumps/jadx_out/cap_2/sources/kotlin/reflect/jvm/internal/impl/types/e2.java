package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class e2 extends kotlin.reflect.jvm.internal.impl.types.d2 {
    private final kotlin.reflect.jvm.internal.impl.types.Variance a;
    private final kotlin.reflect.jvm.internal.impl.types.t0 b;

    public e2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            d(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            d(r0)
        Lc:
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public e2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 2
            d(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            r1.<init>(r0, r2)
            return
    }

    private static /* synthetic */ void d(int r9) {
            r0 = 5
            r1 = 4
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
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl"
            r7 = 0
            switch(r9) {
                case 1: goto L29;
                case 2: goto L29;
                case 3: goto L29;
                case 4: goto L26;
                case 5: goto L26;
                case 6: goto L21;
                default: goto L1c;
            }
        L1c:
            java.lang.String r8 = "projection"
            r5[r7] = r8
            goto L2d
        L21:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L2d
        L26:
            r5[r7] = r6
            goto L2d
        L29:
            java.lang.String r8 = "type"
            r5[r7] = r8
        L2d:
            r7 = 1
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L35
            r5[r7] = r6
            goto L3e
        L35:
            java.lang.String r6 = "getType"
            r5[r7] = r6
            goto L3e
        L3a:
            java.lang.String r6 = "getProjectionKind"
            r5[r7] = r6
        L3e:
            if (r9 == r3) goto L51
            if (r9 == r1) goto L55
            if (r9 == r0) goto L55
            r3 = 6
            if (r9 == r3) goto L4c
            java.lang.String r3 = "<init>"
            r5[r4] = r3
            goto L55
        L4c:
            java.lang.String r3 = "refine"
            r5[r4] = r3
            goto L55
        L51:
            java.lang.String r3 = "replaceType"
            r5[r4] = r3
        L55:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L63
            if (r9 == r0) goto L63
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L68
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L68:
            throw r9
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.c2 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r0 = 6
            d(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r3.a
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.b
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.h(r2)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    public boolean b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.Variance c() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r2.a
            if (r0 != 0) goto L8
            r1 = 4
            d(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.b
            if (r0 != 0) goto L8
            r1 = 5
            d(r1)
        L8:
            return r0
    }
}
