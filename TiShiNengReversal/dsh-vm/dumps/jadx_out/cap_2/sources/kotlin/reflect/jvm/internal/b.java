package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/CacheByClassKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    private static final boolean a = false;

    static {
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "java.lang.ClassValue"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> Ld
            goto L18
        Ld:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
        L18:
            boolean r1 = kotlin.Result.m18isSuccessimpl(r0)
            if (r1 == 0) goto L24
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L24:
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.Result.m17isFailureimpl(r0)
            if (r2 == 0) goto L31
            r0 = r1
        L31:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <V> kotlin.reflect.jvm.internal.a<V> a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> r1) {
            java.lang.String r0 = "compute"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.m r0 = new kotlin.reflect.jvm.internal.m
            r0.<init>(r1)
            return r0
    }
}
