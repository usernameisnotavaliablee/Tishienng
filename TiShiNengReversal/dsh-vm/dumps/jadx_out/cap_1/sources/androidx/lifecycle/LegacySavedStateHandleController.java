package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LegacySavedStateHandleController {

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LegacySavedStateHandleController INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        public OnRecreation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r6) {
                r5 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.g0.p(r6, r0)
                boolean r0 = r6 instanceof androidx.lifecycle.ViewModelStoreOwner
                if (r0 == 0) goto L47
                r0 = r6
                androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                androidx.savedstate.SavedStateRegistry r1 = r6.getSavedStateRegistry()
                java.util.Set r2 = r0.keys()
                java.util.Iterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L37
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.lifecycle.ViewModel r3 = r0.get(r3)
                kotlin.jvm.internal.g0.m(r3)
                androidx.lifecycle.Lifecycle r4 = r6.getLifecycle()
                androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r1, r4)
                goto L1c
            L37:
                java.util.Set r6 = r0.keys()
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L46
                java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r6 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
                r1.runOnNextRecreation(r6)
            L46:
                return
            L47:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
                r6.<init>(r0)
                throw r6
        }
    }

    static {
            androidx.lifecycle.LegacySavedStateHandleController r0 = new androidx.lifecycle.LegacySavedStateHandleController
            r0.<init>()
            androidx.lifecycle.LegacySavedStateHandleController.INSTANCE = r0
            return
    }

    private LegacySavedStateHandleController() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void attachHandleIfNeeded(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModel r1, @org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3) {
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.Object r1 = r1.getTag(r0)
            androidx.lifecycle.SavedStateHandleController r1 = (androidx.lifecycle.SavedStateHandleController) r1
            if (r1 == 0) goto L28
            boolean r0 = r1.isAttached()
            if (r0 != 0) goto L28
            r1.attachToLifecycle(r2, r3)
            androidx.lifecycle.LegacySavedStateHandleController r1 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r1.tryToAddRecreator(r2, r3)
        L28:
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandleController create(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable android.os.Bundle r5) {
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.jvm.internal.g0.m(r4)
            android.os.Bundle r0 = r2.consumeRestoredStateForKey(r4)
            androidx.lifecycle.SavedStateHandle$Companion r1 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r5 = r1.createHandle(r0, r5)
            androidx.lifecycle.SavedStateHandleController r0 = new androidx.lifecycle.SavedStateHandleController
            r0.<init>(r4, r5)
            r0.attachToLifecycle(r2, r3)
            androidx.lifecycle.LegacySavedStateHandleController r4 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r4.tryToAddRecreator(r2, r3)
            return r0
    }

    private final void tryToAddRecreator(androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L11
            goto L1a
        L11:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r0 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r0.<init>(r4, r3)
            r4.addObserver(r0)
            return
        L1a:
            java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r4 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
            r3.runOnNextRecreation(r4)
            return
    }
}
