package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KClasses")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,46:1\n9#2:47\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n25#1:47\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    @kotlin.internal.LowPriorityInOverloadResolution
    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> T a(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.C(r3)
            if (r0 == 0) goto L11
            java.lang.String r2 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast"
            kotlin.jvm.internal.g0.n(r3, r2)
            return r3
        L11:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value cannot be cast to "
            r0.append(r1)
            java.lang.String r2 = r2.x()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @kotlin.internal.LowPriorityInOverloadResolution
    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T> T b(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.C(r2)
            if (r1 == 0) goto L11
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast"
            kotlin.jvm.internal.g0.n(r2, r1)
            return r2
        L11:
            r1 = 0
            return r1
    }
}
