package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavOptionsBuilderKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.NavOptions navOptions(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.NavOptionsBuilder, kotlin.n1> r1) {
            java.lang.String r0 = "optionsBuilder"
            kotlin.jvm.internal.g0.q(r1, r0)
            androidx.navigation.NavOptionsBuilder r0 = new androidx.navigation.NavOptionsBuilder
            r0.<init>()
            r1.invoke(r0)
            androidx.navigation.NavOptions r1 = r0.build$navigation_common_ktx_release()
            return r1
    }
}
