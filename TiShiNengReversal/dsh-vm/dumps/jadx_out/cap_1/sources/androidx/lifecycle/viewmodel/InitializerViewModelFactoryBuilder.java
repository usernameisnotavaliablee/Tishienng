package androidx.lifecycle.viewmodel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.lifecycle.viewmodel.ViewModelFactoryDsl
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class InitializerViewModelFactoryBuilder {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> initializers;

    public InitializerViewModelFactoryBuilder() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.initializers = r0
            return
    }

    public final <T extends androidx.lifecycle.ViewModel> void addInitializer(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r4) {
            r2 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r0 = r2.initializers
            androidx.lifecycle.viewmodel.ViewModelInitializer r1 = new androidx.lifecycle.viewmodel.ViewModelInitializer
            java.lang.Class r3 = k3.a.e(r3)
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory build() {
            r3 = this;
            androidx.lifecycle.viewmodel.InitializerViewModelFactory r0 = new androidx.lifecycle.viewmodel.InitializerViewModelFactory
            java.util.List<androidx.lifecycle.viewmodel.ViewModelInitializer<?>> r1 = r3.initializers
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r2 = new androidx.lifecycle.viewmodel.ViewModelInitializer[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            androidx.lifecycle.viewmodel.ViewModelInitializer[] r1 = (androidx.lifecycle.viewmodel.ViewModelInitializer[]) r1
            r0.<init>(r1)
            return r0
    }
}
