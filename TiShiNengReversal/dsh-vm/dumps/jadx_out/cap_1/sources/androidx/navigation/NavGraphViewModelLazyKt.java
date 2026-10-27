package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavGraphViewModelLazyKt {
    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.s<VM> navGraphViewModels(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r4, @androidx.annotation.IdRes int r5, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r6) {
            java.lang.String r0 = "$this$navGraphViewModels"
            kotlin.jvm.internal.g0.q(r4, r0)
            androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 r0 = new androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2
            r0.<init>(r4, r5)
            kotlin.s r5 = kotlin.t.c(r0)
            androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 r0 = new androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1
            r1 = 0
            r0.<init>(r5, r1)
            r2 = 4
            java.lang.String r3 = "VM"
            kotlin.jvm.internal.g0.y(r2, r3)
            java.lang.Class<androidx.lifecycle.ViewModel> r2 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
            androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1 r3 = new androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1
            r3.<init>(r6, r5, r1)
            kotlin.s r4 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r4, r2, r0, r3)
            return r4
    }

    public static /* synthetic */ kotlin.s navGraphViewModels$default(androidx.fragment.app.Fragment r2, int r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            r6 = 0
            if (r5 == 0) goto L6
            r4 = r6
        L6:
            java.lang.String r5 = "$this$navGraphViewModels"
            kotlin.jvm.internal.g0.q(r2, r5)
            androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 r5 = new androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2
            r5.<init>(r2, r3)
            kotlin.s r3 = kotlin.t.c(r5)
            androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 r5 = new androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1
            r5.<init>(r3, r6)
            r0 = 4
            java.lang.String r1 = "VM"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1 r1 = new androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1
            r1.<init>(r4, r3, r6)
            kotlin.s r2 = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(r2, r0, r5, r1)
            return r2
    }
}
