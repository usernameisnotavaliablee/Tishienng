package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {
    private static final boolean a = false;

    static {
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "android.os.Build"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> Ld
            goto L18
        Ld:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
        L18:
            kotlin.Result.m18isSuccessimpl(r0)
            return
    }

    public static final boolean a() {
            r0 = 1
            return r0
    }
}
