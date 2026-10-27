package androidx.lifecycle;

import androidx.lifecycle.ViewModel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewModelLazy<VM extends androidx.lifecycle.ViewModel> implements kotlin.s<VM> {

    @org.jetbrains.annotations.Nullable
    private VM cached;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> extrasProducer;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> factoryProducer;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> storeProducer;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.d<VM> viewModelClass;


    @kotlin.jvm.JvmOverloads
    public ViewModelLazy(@org.jetbrains.annotations.NotNull kotlin.reflect.d<VM> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStore> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r11) {
            r8 = this;
            java.lang.String r0 = "viewModelClass"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "storeProducer"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "factoryProducer"
            kotlin.jvm.internal.g0.p(r11, r0)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ViewModelLazy(@org.jetbrains.annotations.NotNull kotlin.reflect.d<VM> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStore> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> r5) {
            r1 = this;
            java.lang.String r0 = "viewModelClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "storeProducer"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "factoryProducer"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "extrasProducer"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.viewModelClass = r2
            r1.storeProducer = r3
            r1.factoryProducer = r4
            r1.extrasProducer = r5
            return
    }

    public /* synthetic */ ViewModelLazy(kotlin.reflect.d r1, kotlin.jvm.functions.Function0 r2, kotlin.jvm.functions.Function0 r3, kotlin.jvm.functions.Function0 r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L6
            androidx.lifecycle.ViewModelLazy$1 r4 = androidx.lifecycle.ViewModelLazy.AnonymousClass1.INSTANCE
        L6:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public VM getValue() {
            r4 = this;
            VM extends androidx.lifecycle.ViewModel r0 = r4.cached
            if (r0 != 0) goto L2d
            kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider$Factory> r0 = r4.factoryProducer
            java.lang.Object r0 = r0.invoke()
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> r1 = r4.storeProducer
            java.lang.Object r1 = r1.invoke()
            androidx.lifecycle.ViewModelStore r1 = (androidx.lifecycle.ViewModelStore) r1
            androidx.lifecycle.ViewModelProvider r2 = new androidx.lifecycle.ViewModelProvider
            kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> r3 = r4.extrasProducer
            java.lang.Object r3 = r3.invoke()
            androidx.lifecycle.viewmodel.CreationExtras r3 = (androidx.lifecycle.viewmodel.CreationExtras) r3
            r2.<init>(r1, r0, r3)
            kotlin.reflect.d<VM extends androidx.lifecycle.ViewModel> r0 = r4.viewModelClass
            java.lang.Class r0 = k3.a.e(r0)
            androidx.lifecycle.ViewModel r0 = r2.get(r0)
            r4.cached = r0
        L2d:
            return r0
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m65getValue() {
            r1 = this;
            androidx.lifecycle.ViewModel r0 = r1.getValue()
            return r0
    }

    public boolean isInitialized() {
            r1 = this;
            VM extends androidx.lifecycle.ViewModel r0 = r1.cached
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
