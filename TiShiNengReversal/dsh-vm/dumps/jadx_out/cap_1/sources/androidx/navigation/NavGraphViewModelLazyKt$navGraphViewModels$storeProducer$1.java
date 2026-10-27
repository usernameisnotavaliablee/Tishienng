package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
    final /* synthetic */ kotlin.s $backStackEntry;
    final /* synthetic */ kotlin.reflect.n $backStackEntry$metadata;

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(kotlin.s r1, kotlin.reflect.n r2) {
            r0 = this;
            r0.$backStackEntry = r1
            r0.$backStackEntry$metadata = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelStore invoke() {
            r2 = this;
            kotlin.s r0 = r2.$backStackEntry
            java.lang.Object r0 = r0.getValue()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            java.lang.String r1 = "backStackEntry"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            java.lang.String r1 = "backStackEntry.viewModelStore"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m71invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelStore r0 = r1.invoke()
            return r0
    }
}
