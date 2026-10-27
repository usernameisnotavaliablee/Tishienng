package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeWithEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1563#2:170\n1634#2,3:171\n1740#2,3:174\n*S KotlinDebug\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n*L\n97#1:170\n97#1:171,3\n112#1:174,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l2 {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.t0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k2
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.k2 r1 = (kotlin.reflect.jvm.internal.impl.types.k2) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.o0()
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.m2 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = a(r2)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = d(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.m2 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.t0, ? extends kotlin.reflect.jvm.internal.impl.types.t0> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = a(r2)
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r3.invoke(r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            goto L1d
        L1c:
            r2 = 0
        L1d:
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = d(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.m2 d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k2
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.types.k2 r1 = (kotlin.reflect.jvm.internal.impl.types.k2) r1
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.T()
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = d(r1, r2)
            return r1
        L14:
            if (r2 == 0) goto L3b
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r1)
            if (r0 == 0) goto L1d
            goto L3b
        L1d:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.types.h1 r0 = new kotlin.reflect.jvm.internal.impl.types.h1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            r0.<init>(r1, r2)
            return r0
        L29:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = new kotlin.reflect.jvm.internal.impl.types.m0
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
            r0.<init>(r1, r2)
            return r0
        L35:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L3b:
            return r1
    }
}
