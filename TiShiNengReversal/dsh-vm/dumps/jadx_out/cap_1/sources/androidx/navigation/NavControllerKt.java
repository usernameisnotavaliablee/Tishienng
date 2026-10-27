package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavControllerKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.NavGraph createGraph(@org.jetbrains.annotations.NotNull androidx.navigation.NavController r1, @androidx.annotation.IdRes int r2, @androidx.annotation.IdRes int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.NavGraphBuilder, kotlin.n1> r4) {
            java.lang.String r0 = "$this$createGraph"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.q(r4, r0)
            androidx.navigation.NavigatorProvider r1 = r1.getNavigatorProvider()
            java.lang.String r0 = "navigatorProvider"
            kotlin.jvm.internal.g0.h(r1, r0)
            androidx.navigation.NavGraphBuilder r0 = new androidx.navigation.NavGraphBuilder
            r0.<init>(r1, r2, r3)
            r4.invoke(r0)
            androidx.navigation.NavGraph r1 = r0.build2()
            return r1
    }

    public static /* synthetic */ androidx.navigation.NavGraph createGraph$default(androidx.navigation.NavController r0, int r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r4 = "$this$createGraph"
            kotlin.jvm.internal.g0.q(r0, r4)
            java.lang.String r4 = "builder"
            kotlin.jvm.internal.g0.q(r3, r4)
            androidx.navigation.NavigatorProvider r0 = r0.getNavigatorProvider()
            java.lang.String r4 = "navigatorProvider"
            kotlin.jvm.internal.g0.h(r0, r4)
            androidx.navigation.NavGraphBuilder r4 = new androidx.navigation.NavGraphBuilder
            r4.<init>(r0, r1, r2)
            r3.invoke(r4)
            androidx.navigation.NavGraph r0 = r4.build2()
            return r0
    }
}
