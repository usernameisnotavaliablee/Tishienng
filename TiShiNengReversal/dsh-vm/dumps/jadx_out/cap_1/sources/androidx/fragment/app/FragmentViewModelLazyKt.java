package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FragmentViewModelLazyKt {
    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.s<VM> activityViewModels(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r3) {
            java.lang.String r0 = "$this$activityViewModels"
            kotlin.jvm.internal.g0.q(r2, r0)
            r0 = 4
            java.lang.String r1 = "VM"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 r1 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1
            r1.<init>(r2)
            if (r3 == 0) goto L19
            goto L1e
        L19:
            androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 r3 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2
            r3.<init>(r2)
        L1e:
            kotlin.s r2 = createViewModelLazy(r2, r0, r1, r3)
            return r2
    }

    public static /* synthetic */ kotlin.s activityViewModels$default(androidx.fragment.app.Fragment r0, kotlin.jvm.functions.Function0 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r2 = "$this$activityViewModels"
            kotlin.jvm.internal.g0.q(r0, r2)
            r2 = 4
            java.lang.String r3 = "VM"
            kotlin.jvm.internal.g0.y(r2, r3)
            java.lang.Class<androidx.lifecycle.ViewModel> r2 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
            androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 r3 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1
            r3.<init>(r0)
            if (r1 == 0) goto L1e
            goto L23
        L1e:
            androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 r1 = new androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2
            r1.<init>(r0)
        L23:
            kotlin.s r0 = createViewModelLazy(r0, r2, r3, r1)
            return r0
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public static final <VM extends androidx.lifecycle.ViewModel> kotlin.s<VM> createViewModelLazy(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r1, @org.jetbrains.annotations.NotNull kotlin.reflect.d<VM> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStore> r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r4) {
            java.lang.String r0 = "$this$createViewModelLazy"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "viewModelClass"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "storeProducer"
            kotlin.jvm.internal.g0.q(r3, r0)
            if (r4 == 0) goto L13
            goto L18
        L13:
            androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 r4 = new androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
            r4.<init>(r1)
        L18:
            androidx.lifecycle.ViewModelLazy r1 = new androidx.lifecycle.ViewModelLazy
            r1.<init>(r2, r3, r4)
            return r1
    }

    public static /* synthetic */ kotlin.s createViewModelLazy$default(androidx.fragment.app.Fragment r0, kotlin.reflect.d r1, kotlin.jvm.functions.Function0 r2, kotlin.jvm.functions.Function0 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlin.s r0 = createViewModelLazy(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.s<VM> viewModels(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r4) {
            java.lang.String r0 = "$this$viewModels"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "ownerProducer"
            kotlin.jvm.internal.g0.q(r3, r0)
            r0 = 4
            java.lang.String r1 = "VM"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<androidx.lifecycle.ViewModel> r0 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 r1 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2
            r1.<init>(r3)
            kotlin.s r2 = createViewModelLazy(r2, r0, r1, r4)
            return r2
    }

    public static /* synthetic */ kotlin.s viewModels$default(androidx.fragment.app.Fragment r0, kotlin.jvm.functions.Function0 r1, kotlin.jvm.functions.Function0 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L9
            androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1 r1 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1
            r1.<init>(r0)
        L9:
            r3 = r3 & 2
            if (r3 == 0) goto Le
            r2 = 0
        Le:
            java.lang.String r3 = "$this$viewModels"
            kotlin.jvm.internal.g0.q(r0, r3)
            java.lang.String r3 = "ownerProducer"
            kotlin.jvm.internal.g0.q(r1, r3)
            r3 = 4
            java.lang.String r4 = "VM"
            kotlin.jvm.internal.g0.y(r3, r4)
            java.lang.Class<androidx.lifecycle.ViewModel> r3 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
            androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 r4 = new androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2
            r4.<init>(r1)
            kotlin.s r0 = createViewModelLazy(r0, r3, r4, r2)
            return r0
    }
}
