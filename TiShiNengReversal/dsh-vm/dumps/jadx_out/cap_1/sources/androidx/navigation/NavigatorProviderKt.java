package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavigatorProviderKt {
    @org.jetbrains.annotations.NotNull
    public static final <T extends androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>> T get(@org.jetbrains.annotations.NotNull androidx.navigation.NavigatorProvider r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "$this$get"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.q(r2, r0)
            androidx.navigation.Navigator r1 = r1.getNavigator(r2)
            java.lang.String r2 = "getNavigator(name)"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>> T get(@org.jetbrains.annotations.NotNull androidx.navigation.NavigatorProvider r1, @org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2) {
            java.lang.String r0 = "$this$get"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.Class r2 = k3.a.e(r2)
            androidx.navigation.Navigator r1 = r1.getNavigator(r2)
            java.lang.String r2 = "getNavigator(clazz.java)"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }

    public static final void plusAssign(@org.jetbrains.annotations.NotNull androidx.navigation.NavigatorProvider r1, @org.jetbrains.annotations.NotNull androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> r2) {
            java.lang.String r0 = "$this$plusAssign"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1.addNavigator(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> set(@org.jetbrains.annotations.NotNull androidx.navigation.NavigatorProvider r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.navigation.Navigator<? extends androidx.navigation.NavDestination> r3) {
            java.lang.String r0 = "$this$set"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.Navigator r1 = r1.addNavigator(r2, r3)
            return r1
    }
}
