package androidx.lifecycle.viewmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> void initializer(androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder r2, kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends VM> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 4
            java.lang.String r1 = "VM"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            r2.addInitializer(r0, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder, kotlin.n1> r1) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
            r0.<init>()
            r1.invoke(r0)
            androidx.lifecycle.ViewModelProvider$Factory r1 = r0.build()
            return r1
    }
}
