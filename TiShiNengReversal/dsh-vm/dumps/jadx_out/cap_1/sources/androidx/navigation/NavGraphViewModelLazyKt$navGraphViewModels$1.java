package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
    final /* synthetic */ kotlin.s $backStackEntry;
    final /* synthetic */ kotlin.reflect.n $backStackEntry$metadata;
    final /* synthetic */ kotlin.jvm.functions.Function0 $factoryProducer;

    public NavGraphViewModelLazyKt$navGraphViewModels$1(kotlin.jvm.functions.Function0 r1, kotlin.s r2, kotlin.reflect.n r3) {
            r0 = this;
            r0.$factoryProducer = r1
            r0.$backStackEntry = r2
            r0.$backStackEntry$metadata = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            r2 = this;
            kotlin.jvm.functions.Function0 r0 = r2.$factoryProducer
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.invoke()
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            kotlin.s r0 = r2.$backStackEntry
            java.lang.Object r0 = r0.getValue()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            java.lang.String r1 = "backStackEntry"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            java.lang.String r1 = "backStackEntry.defaultViewModelProviderFactory"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m69invoke() {
            r1 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r1.invoke()
            return r0
    }
}
