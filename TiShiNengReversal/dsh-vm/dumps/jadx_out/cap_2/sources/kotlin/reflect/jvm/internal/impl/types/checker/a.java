package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState a(boolean r9, boolean r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.b r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.f r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r13) {
            java.lang.String r0 = "typeSystemContext"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "kotlinTypePreparator"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1 = new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
            r4 = 0
            r5 = 1
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState b(boolean r0, boolean r1, kotlin.reflect.jvm.internal.impl.types.checker.b r2, kotlin.reflect.jvm.internal.impl.types.checker.f r3, kotlin.reflect.jvm.internal.impl.types.checker.g r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r1 = 1
        L5:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.types.checker.u r2 = kotlin.reflect.jvm.internal.impl.types.checker.u.a
        Lb:
            r6 = r5 & 8
            if (r6 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.types.checker.f$a r3 = kotlin.reflect.jvm.internal.impl.types.checker.f.a.a
        L11:
            r5 = r5 & 16
            if (r5 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.types.checker.g$a r4 = kotlin.reflect.jvm.internal.impl.types.checker.g.a.a
        L17:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0 = a(r0, r1, r2, r3, r4)
            return r0
    }
}
