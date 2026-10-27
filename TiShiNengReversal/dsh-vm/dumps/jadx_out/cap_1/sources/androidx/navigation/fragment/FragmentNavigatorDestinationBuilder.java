package androidx.navigation.fragment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.NavDestinationDsl
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentNavigatorDestinationBuilder extends androidx.navigation.NavDestinationBuilder<androidx.navigation.fragment.FragmentNavigator.Destination> {
    private final kotlin.reflect.d<? extends androidx.fragment.app.Fragment> fragmentClass;

    public FragmentNavigatorDestinationBuilder(@org.jetbrains.annotations.NotNull androidx.navigation.fragment.FragmentNavigator r2, @androidx.annotation.IdRes int r3, @org.jetbrains.annotations.NotNull kotlin.reflect.d<? extends androidx.fragment.app.Fragment> r4) {
            r1 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "fragmentClass"
            kotlin.jvm.internal.g0.q(r4, r0)
            r1.<init>(r2, r3)
            r1.fragmentClass = r4
            return
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public /* bridge */ /* synthetic */ androidx.navigation.fragment.FragmentNavigator.Destination build() {
            r1 = this;
            androidx.navigation.fragment.FragmentNavigator$Destination r0 = r1.build2()
            return r0
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @org.jetbrains.annotations.NotNull
    /* renamed from: build, reason: avoid collision after fix types in other method */
    public androidx.navigation.fragment.FragmentNavigator.Destination build2() {
            r2 = this;
            androidx.navigation.NavDestination r0 = super.build()
            androidx.navigation.fragment.FragmentNavigator$Destination r0 = (androidx.navigation.fragment.FragmentNavigator.Destination) r0
            kotlin.reflect.d<? extends androidx.fragment.app.Fragment> r1 = r2.fragmentClass
            java.lang.Class r1 = k3.a.e(r1)
            java.lang.String r1 = r1.getName()
            r0.setClassName(r1)
            return r0
    }
}
