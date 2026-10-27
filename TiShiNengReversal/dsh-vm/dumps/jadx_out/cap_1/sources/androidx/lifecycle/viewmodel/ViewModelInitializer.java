package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewModelInitializer<T extends androidx.lifecycle.ViewModel> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<T> clazz;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T> initializer;

    public ViewModelInitializer(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.clazz = r2
            r1.initializer = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Class<T> getClazz$lifecycle_viewmodel_release() {
            r1 = this;
            java.lang.Class<T extends androidx.lifecycle.ViewModel> r0 = r1.clazz
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
            r1 = this;
            kotlin.jvm.functions.Function1<androidx.lifecycle.viewmodel.CreationExtras, T extends androidx.lifecycle.ViewModel> r0 = r1.initializer
            return r0
    }
}
