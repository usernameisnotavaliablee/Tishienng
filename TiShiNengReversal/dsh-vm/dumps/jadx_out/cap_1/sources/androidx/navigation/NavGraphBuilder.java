package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavDestinationDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavGraphBuilder extends androidx.navigation.NavDestinationBuilder<androidx.navigation.NavGraph> {
    private final java.util.List<androidx.navigation.NavDestination> destinations;

    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavigatorProvider provider;
    private int startDestination;

    public NavGraphBuilder(@org.jetbrains.annotations.NotNull androidx.navigation.NavigatorProvider r3, @androidx.annotation.IdRes int r4, @androidx.annotation.IdRes int r5) {
            r2 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.lang.Class<androidx.navigation.NavGraphNavigator> r0 = androidx.navigation.NavGraphNavigator.class
            androidx.navigation.Navigator r0 = r3.getNavigator(r0)
            java.lang.String r1 = "getNavigator(clazz.java)"
            kotlin.jvm.internal.g0.h(r0, r1)
            r2.<init>(r0, r4)
            r2.provider = r3
            r2.startDestination = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.destinations = r3
            return
    }

    public final void addDestination(@org.jetbrains.annotations.NotNull androidx.navigation.NavDestination r2) {
            r1 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.util.List<androidx.navigation.NavDestination> r0 = r1.destinations
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r2)
            return
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public /* bridge */ /* synthetic */ androidx.navigation.NavGraph build() {
            r1 = this;
            androidx.navigation.NavGraph r0 = r1.build2()
            return r0
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @org.jetbrains.annotations.NotNull
    /* renamed from: build, reason: avoid collision after fix types in other method */
    public androidx.navigation.NavGraph build2() {
            r2 = this;
            androidx.navigation.NavDestination r0 = super.build()
            androidx.navigation.NavGraph r0 = (androidx.navigation.NavGraph) r0
            java.util.List<androidx.navigation.NavDestination> r1 = r2.destinations
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addDestinations(r1)
            int r1 = r2.startDestination
            if (r1 == 0) goto L15
            r0.setStartDestination(r1)
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must set a startDestination"
            r0.<init>(r1)
            throw r0
    }

    public final <D extends androidx.navigation.NavDestination> void destination(@org.jetbrains.annotations.NotNull androidx.navigation.NavDestinationBuilder<? extends D> r2) {
            r1 = this;
            java.lang.String r0 = "navDestination"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.util.List<androidx.navigation.NavDestination> r0 = r1.destinations
            java.util.Collection r0 = (java.util.Collection) r0
            androidx.navigation.NavDestination r2 = r2.build()
            r0.add(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavigatorProvider getProvider() {
            r1 = this;
            androidx.navigation.NavigatorProvider r0 = r1.provider
            return r0
    }

    public final void unaryPlus(@org.jetbrains.annotations.NotNull androidx.navigation.NavDestination r2) {
            r1 = this;
            java.lang.String r0 = "$this$unaryPlus"
            kotlin.jvm.internal.g0.q(r2, r0)
            r1.addDestination(r2)
            return
    }
}
