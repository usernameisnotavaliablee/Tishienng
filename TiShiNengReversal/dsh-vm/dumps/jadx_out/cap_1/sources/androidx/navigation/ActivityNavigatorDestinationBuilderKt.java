package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    public static final void activity(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraphBuilder r2, @androidx.annotation.IdRes int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.ActivityNavigatorDestinationBuilder, kotlin.n1> r4) {
            java.lang.String r0 = "$this$activity"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.q(r4, r0)
            androidx.navigation.NavigatorProvider r0 = r2.getProvider()
            java.lang.Class<androidx.navigation.ActivityNavigator> r1 = androidx.navigation.ActivityNavigator.class
            androidx.navigation.Navigator r0 = r0.getNavigator(r1)
            java.lang.String r1 = "getNavigator(clazz.java)"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.navigation.ActivityNavigator r0 = (androidx.navigation.ActivityNavigator) r0
            androidx.navigation.ActivityNavigatorDestinationBuilder r1 = new androidx.navigation.ActivityNavigatorDestinationBuilder
            r1.<init>(r0, r3)
            r4.invoke(r1)
            r2.destination(r1)
            return
    }
}
