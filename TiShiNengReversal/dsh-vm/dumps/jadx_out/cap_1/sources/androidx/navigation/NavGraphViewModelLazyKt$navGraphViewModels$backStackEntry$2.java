package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.navigation.NavBackStackEntry> {
    final /* synthetic */ int $navGraphId;
    final /* synthetic */ androidx.fragment.app.Fragment $this_navGraphViewModels;

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(androidx.fragment.app.Fragment r1, int r2) {
            r0 = this;
            r0.$this_navGraphViewModels = r1
            r0.$navGraphId = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavBackStackEntry invoke() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.$this_navGraphViewModels
            androidx.navigation.NavController r0 = androidx.navigation.fragment.FragmentKt.findNavController(r0)
            int r1 = r2.$navGraphId
            androidx.navigation.NavBackStackEntry r0 = r0.getBackStackEntry(r1)
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m70invoke() {
            r1 = this;
            androidx.navigation.NavBackStackEntry r0 = r1.invoke()
            return r0
    }
}
