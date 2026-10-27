package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n295#2:175\n1740#2,3:176\n296#2:179\n1563#2:180\n1634#2,3:181\n1563#2:184\n1634#2,3:185\n*S KotlinDebug\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n*L\n50#1:175\n51#1:176,3\n50#1:179\n62#1:180\n62#1:181,3\n65#1:184\n65#1:185,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n0 {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.k0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
            return r1
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.Q0()
            return r1
        L14:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            return r1
        L1b:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.R0()
            return r1
        L14:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            return r1
        L1b:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
    }
}
