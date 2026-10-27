package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityViewModelLazyKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @androidx.annotation.MainThread
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.s<VM> viewModels(androidx.activity.ComponentActivity r4, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r5) {
            if (r5 != 0) goto L7
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1 r5 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1
            r5.<init>(r4)
        L7:
            androidx.lifecycle.ViewModelLazy r0 = new androidx.lifecycle.ViewModelLazy
            r1 = 4
            java.lang.String r2 = "VM"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.lifecycle.ViewModel> r1 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            androidx.activity.ActivityViewModelLazyKt$viewModels$1 r2 = new androidx.activity.ActivityViewModelLazyKt$viewModels$1
            r2.<init>(r4)
            androidx.activity.ActivityViewModelLazyKt$viewModels$2 r3 = new androidx.activity.ActivityViewModelLazyKt$viewModels$2
            r3.<init>(r4)
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    @androidx.annotation.MainThread
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.s<VM> viewModels(androidx.activity.ComponentActivity r4, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> r5, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> r6) {
            if (r6 != 0) goto L7
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2 r6 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2
            r6.<init>(r4)
        L7:
            androidx.lifecycle.ViewModelLazy r0 = new androidx.lifecycle.ViewModelLazy
            r1 = 4
            java.lang.String r2 = "VM"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.lifecycle.ViewModel> r1 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            androidx.activity.ActivityViewModelLazyKt$viewModels$3 r2 = new androidx.activity.ActivityViewModelLazyKt$viewModels$3
            r2.<init>(r4)
            androidx.activity.ActivityViewModelLazyKt$viewModels$4 r3 = new androidx.activity.ActivityViewModelLazyKt$viewModels$4
            r3.<init>(r5, r4)
            r0.<init>(r1, r2, r6, r3)
            return r0
    }

    public static /* synthetic */ kotlin.s viewModels$default(androidx.activity.ComponentActivity r2, kotlin.jvm.functions.Function0 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 1
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            if (r3 != 0) goto Lc
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1 r3 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1
            r3.<init>(r2)
        Lc:
            androidx.lifecycle.ViewModelLazy r4 = new androidx.lifecycle.ViewModelLazy
            r5 = 4
            java.lang.String r0 = "VM"
            kotlin.jvm.internal.g0.y(r5, r0)
            java.lang.Class<androidx.lifecycle.ViewModel> r5 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r5 = kotlin.jvm.internal.o0.d(r5)
            androidx.activity.ActivityViewModelLazyKt$viewModels$1 r0 = new androidx.activity.ActivityViewModelLazyKt$viewModels$1
            r0.<init>(r2)
            androidx.activity.ActivityViewModelLazyKt$viewModels$2 r1 = new androidx.activity.ActivityViewModelLazyKt$viewModels$2
            r1.<init>(r2)
            r4.<init>(r5, r0, r3, r1)
            return r4
    }

    public static /* synthetic */ kotlin.s viewModels$default(androidx.activity.ComponentActivity r2, kotlin.jvm.functions.Function0 r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            if (r4 != 0) goto L12
            androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2 r4 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2
            r4.<init>(r2)
        L12:
            androidx.lifecycle.ViewModelLazy r5 = new androidx.lifecycle.ViewModelLazy
            r6 = 4
            java.lang.String r0 = "VM"
            kotlin.jvm.internal.g0.y(r6, r0)
            java.lang.Class<androidx.lifecycle.ViewModel> r6 = androidx.lifecycle.ViewModel.class
            kotlin.reflect.d r6 = kotlin.jvm.internal.o0.d(r6)
            androidx.activity.ActivityViewModelLazyKt$viewModels$3 r0 = new androidx.activity.ActivityViewModelLazyKt$viewModels$3
            r0.<init>(r2)
            androidx.activity.ActivityViewModelLazyKt$viewModels$4 r1 = new androidx.activity.ActivityViewModelLazyKt$viewModels$4
            r1.<init>(r3, r2)
            r5.<init>(r6, r0, r4, r1)
            return r5
    }
}
