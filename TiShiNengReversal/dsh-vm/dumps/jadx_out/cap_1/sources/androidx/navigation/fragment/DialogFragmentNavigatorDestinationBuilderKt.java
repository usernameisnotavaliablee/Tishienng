package androidx.navigation.fragment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DialogFragmentNavigatorDestinationBuilderKt {
    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment> void dialog(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraphBuilder r3, @androidx.annotation.IdRes int r4) {
            java.lang.String r0 = "$this$dialog"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.NavigatorProvider r0 = r3.getProvider()
            java.lang.Class<androidx.navigation.fragment.DialogFragmentNavigator> r1 = androidx.navigation.fragment.DialogFragmentNavigator.class
            androidx.navigation.Navigator r0 = r0.getNavigator(r1)
            java.lang.String r1 = "getNavigator(clazz.java)"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.navigation.fragment.DialogFragmentNavigator r0 = (androidx.navigation.fragment.DialogFragmentNavigator) r0
            r1 = 4
            java.lang.String r2 = "F"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.fragment.app.DialogFragment> r1 = androidx.fragment.app.DialogFragment.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            androidx.navigation.fragment.DialogFragmentNavigatorDestinationBuilder r2 = new androidx.navigation.fragment.DialogFragmentNavigatorDestinationBuilder
            r2.<init>(r0, r4, r1)
            r3.destination(r2)
            return
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment> void dialog(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraphBuilder r3, @androidx.annotation.IdRes int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.navigation.fragment.DialogFragmentNavigatorDestinationBuilder, kotlin.n1> r5) {
            java.lang.String r0 = "$this$dialog"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.q(r5, r0)
            androidx.navigation.NavigatorProvider r0 = r3.getProvider()
            java.lang.Class<androidx.navigation.fragment.DialogFragmentNavigator> r1 = androidx.navigation.fragment.DialogFragmentNavigator.class
            androidx.navigation.Navigator r0 = r0.getNavigator(r1)
            java.lang.String r1 = "getNavigator(clazz.java)"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.navigation.fragment.DialogFragmentNavigator r0 = (androidx.navigation.fragment.DialogFragmentNavigator) r0
            r1 = 4
            java.lang.String r2 = "F"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.fragment.app.DialogFragment> r1 = androidx.fragment.app.DialogFragment.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            androidx.navigation.fragment.DialogFragmentNavigatorDestinationBuilder r2 = new androidx.navigation.fragment.DialogFragmentNavigatorDestinationBuilder
            r2.<init>(r0, r4, r1)
            r5.invoke(r2)
            r3.destination(r2)
            return
    }
}
