package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.AbstractSavedStateViewModelFactory.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    @org.jetbrains.annotations.Nullable
    private android.os.Bundle defaultArgs;

    @org.jetbrains.annotations.Nullable
    private androidx.lifecycle.Lifecycle lifecycle;

    @org.jetbrains.annotations.Nullable
    private androidx.savedstate.SavedStateRegistry savedStateRegistry;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.lifecycle.AbstractSavedStateViewModelFactory$Companion r0 = new androidx.lifecycle.AbstractSavedStateViewModelFactory$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.AbstractSavedStateViewModelFactory.Companion = r0
            return
    }

    public AbstractSavedStateViewModelFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractSavedStateViewModelFactory(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r2, @org.jetbrains.annotations.Nullable android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            r1.savedStateRegistry = r0
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.lifecycle = r2
            r1.defaultArgs = r3
            return
    }

    private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r4, java.lang.Class<T> r5) {
            r3 = this;
            androidx.savedstate.SavedStateRegistry r0 = r3.savedStateRegistry
            kotlin.jvm.internal.g0.m(r0)
            androidx.lifecycle.Lifecycle r1 = r3.lifecycle
            kotlin.jvm.internal.g0.m(r1)
            android.os.Bundle r2 = r3.defaultArgs
            androidx.lifecycle.SavedStateHandleController r0 = androidx.lifecycle.LegacySavedStateHandleController.create(r0, r1, r4, r2)
            androidx.lifecycle.SavedStateHandle r1 = r0.getHandle()
            androidx.lifecycle.ViewModel r4 = r3.create(r4, r5, r1)
            java.lang.String r5 = "androidx.lifecycle.savedstate.vm.tag"
            r4.setTagIfAbsent(r5, r0)
            return r4
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r3) {
            r2 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = r3.getCanonicalName()
            if (r0 == 0) goto L1c
            androidx.lifecycle.Lifecycle r1 = r2.lifecycle
            if (r1 == 0) goto L14
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3)
            return r3
        L14:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r3.<init>(r0)
            throw r3
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.Class<T> r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r4) {
            r2 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L26
            androidx.savedstate.SavedStateRegistry r1 = r2.savedStateRegistry
            if (r1 == 0) goto L1d
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3)
            return r3
        L1d:
            androidx.lifecycle.SavedStateHandle r4 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r4)
            androidx.lifecycle.ViewModel r3 = r2.create(r0, r3, r4)
            return r3
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r3.<init>(r4)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    protected abstract <T extends androidx.lifecycle.ViewModel> T create(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.SavedStateHandle r3);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModel r3) {
            r2 = this;
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.savedstate.SavedStateRegistry r0 = r2.savedStateRegistry
            if (r0 == 0) goto L15
            kotlin.jvm.internal.g0.m(r0)
            androidx.lifecycle.Lifecycle r1 = r2.lifecycle
            kotlin.jvm.internal.g0.m(r1)
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
        L15:
            return
    }
}
