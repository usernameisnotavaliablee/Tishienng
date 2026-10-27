package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavBackStackEntry implements androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner {
    private android.os.Bundle mArgs;
    private final android.content.Context mContext;
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.navigation.NavDestination mDestination;
    private androidx.lifecycle.Lifecycle.State mHostLifecycle;

    @androidx.annotation.NonNull
    final java.util.UUID mId;
    private final androidx.lifecycle.LifecycleRegistry mLifecycle;
    private androidx.lifecycle.Lifecycle.State mMaxLifecycle;
    private androidx.navigation.NavControllerViewModel mNavControllerViewModel;
    private androidx.lifecycle.SavedStateHandle mSavedStateHandle;
    private final androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.navigation.NavBackStackEntry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event = null;

        static {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class NavResultSavedStateFactory extends androidx.lifecycle.AbstractSavedStateViewModelFactory {
        NavResultSavedStateFactory(@androidx.annotation.NonNull androidx.savedstate.SavedStateRegistryOwner r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        @androidx.annotation.NonNull
        protected <T extends androidx.lifecycle.ViewModel> T create(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2, @androidx.annotation.NonNull androidx.lifecycle.SavedStateHandle r3) {
                r0 = this;
                androidx.navigation.NavBackStackEntry$SavedStateViewModel r1 = new androidx.navigation.NavBackStackEntry$SavedStateViewModel
                r1.<init>(r3)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SavedStateViewModel extends androidx.lifecycle.ViewModel {
        private androidx.lifecycle.SavedStateHandle mHandle;

        SavedStateViewModel(androidx.lifecycle.SavedStateHandle r1) {
                r0 = this;
                r0.<init>()
                r0.mHandle = r1
                return
        }

        public androidx.lifecycle.SavedStateHandle getHandle() {
                r1 = this;
                androidx.lifecycle.SavedStateHandle r0 = r1.mHandle
                return r0
        }
    }

    NavBackStackEntry(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull androidx.navigation.NavDestination r10, @androidx.annotation.Nullable android.os.Bundle r11, @androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r12, @androidx.annotation.Nullable androidx.navigation.NavControllerViewModel r13) {
            r8 = this;
            java.util.UUID r6 = java.util.UUID.randomUUID()
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    NavBackStackEntry(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.navigation.NavDestination r4, @androidx.annotation.Nullable android.os.Bundle r5, @androidx.annotation.Nullable androidx.lifecycle.LifecycleOwner r6, @androidx.annotation.Nullable androidx.navigation.NavControllerViewModel r7, @androidx.annotation.NonNull java.util.UUID r8, @androidx.annotation.Nullable android.os.Bundle r9) {
            r2 = this;
            r2.<init>()
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r2)
            r2.mLifecycle = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r2)
            r2.mSavedStateRegistryController = r0
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r2.mHostLifecycle = r1
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
            r2.mMaxLifecycle = r1
            r2.mContext = r3
            r2.mId = r8
            r2.mDestination = r4
            r2.mArgs = r5
            r2.mNavControllerViewModel = r7
            r0.performRestore(r9)
            if (r6 == 0) goto L31
            androidx.lifecycle.Lifecycle r3 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.getCurrentState()
            r2.mHostLifecycle = r3
        L31:
            return
    }

    @androidx.annotation.NonNull
    private static androidx.lifecycle.Lifecycle.State getStateAfter(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r3) {
            int[] r0 = androidx.navigation.NavBackStackEntry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L2b;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L25;
                case 6: goto L22;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected event value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
            return r3
        L25:
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.RESUMED
            return r3
        L28:
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
            return r3
        L2b:
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED
            return r3
    }

    @androidx.annotation.Nullable
    public android.os.Bundle getArguments() {
            r1 = this;
            android.os.Bundle r0 = r1.mArgs
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public /* synthetic */ androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r1 = this;
            androidx.lifecycle.viewmodel.CreationExtras r0 = androidx.lifecycle.f.a(r1)
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @androidx.annotation.NonNull
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L15
            androidx.lifecycle.SavedStateViewModelFactory r0 = new androidx.lifecycle.SavedStateViewModelFactory
            android.content.Context r1 = r3.mContext
            android.content.Context r1 = r1.getApplicationContext()
            android.app.Application r1 = (android.app.Application) r1
            android.os.Bundle r2 = r3.mArgs
            r0.<init>(r1, r3, r2)
            r3.mDefaultFactory = r0
        L15:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.navigation.NavDestination getDestination() {
            r1 = this;
            androidx.navigation.NavDestination r0 = r1.mDestination
            return r0
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @androidx.annotation.NonNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycle
            return r0
    }

    @androidx.annotation.NonNull
    androidx.lifecycle.Lifecycle.State getMaxLifecycle() {
            r1 = this;
            androidx.lifecycle.Lifecycle$State r0 = r1.mMaxLifecycle
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.SavedStateHandle getSavedStateHandle() {
            r3 = this;
            androidx.lifecycle.SavedStateHandle r0 = r3.mSavedStateHandle
            if (r0 != 0) goto L1d
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.navigation.NavBackStackEntry$NavResultSavedStateFactory r1 = new androidx.navigation.NavBackStackEntry$NavResultSavedStateFactory
            r2 = 0
            r1.<init>(r3, r2)
            r0.<init>(r3, r1)
            java.lang.Class<androidx.navigation.NavBackStackEntry$SavedStateViewModel> r1 = androidx.navigation.NavBackStackEntry.SavedStateViewModel.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            androidx.navigation.NavBackStackEntry$SavedStateViewModel r0 = (androidx.navigation.NavBackStackEntry.SavedStateViewModel) r0
            androidx.lifecycle.SavedStateHandle r0 = r0.getHandle()
            r3.mSavedStateHandle = r0
        L1d:
            androidx.lifecycle.SavedStateHandle r0 = r3.mSavedStateHandle
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @androidx.annotation.NonNull
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @androidx.annotation.NonNull
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            androidx.navigation.NavControllerViewModel r0 = r2.mNavControllerViewModel
            if (r0 == 0) goto Lb
            java.util.UUID r1 = r2.mId
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore(r1)
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph."
            r0.<init>(r1)
            throw r0
    }

    void handleLifecycleEvent(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r1) {
            r0 = this;
            androidx.lifecycle.Lifecycle$State r1 = getStateAfter(r1)
            r0.mHostLifecycle = r1
            r0.updateState()
            return
    }

    void replaceArguments(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            r0.mArgs = r1
            return
    }

    void saveState(@androidx.annotation.NonNull android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performSave(r2)
            return
    }

    void setMaxLifecycle(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r1) {
            r0 = this;
            r0.mMaxLifecycle = r1
            r0.updateState()
            return
    }

    void updateState() {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r2.mHostLifecycle
            int r0 = r0.ordinal()
            androidx.lifecycle.Lifecycle$State r1 = r2.mMaxLifecycle
            int r1 = r1.ordinal()
            if (r0 >= r1) goto L16
            androidx.lifecycle.LifecycleRegistry r0 = r2.mLifecycle
            androidx.lifecycle.Lifecycle$State r1 = r2.mHostLifecycle
            r0.setCurrentState(r1)
            return
        L16:
            androidx.lifecycle.LifecycleRegistry r0 = r2.mLifecycle
            androidx.lifecycle.Lifecycle$State r1 = r2.mMaxLifecycle
            r0.setCurrentState(r1)
            return
    }
}
