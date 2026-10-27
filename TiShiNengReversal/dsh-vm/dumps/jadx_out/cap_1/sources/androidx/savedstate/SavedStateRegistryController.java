package androidx.savedstate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateRegistryController {

    @org.jetbrains.annotations.NotNull
    public static final androidx.savedstate.SavedStateRegistryController.Companion Companion = null;
    private boolean attached;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistryOwner owner;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;

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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.savedstate.SavedStateRegistryController create(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r3) {
                r2 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.savedstate.SavedStateRegistryController r0 = new androidx.savedstate.SavedStateRegistryController
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            androidx.savedstate.SavedStateRegistryController$Companion r0 = new androidx.savedstate.SavedStateRegistryController$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.SavedStateRegistryController.Companion = r0
            return
    }

    private SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner r1) {
            r0 = this;
            r0.<init>()
            r0.owner = r1
            androidx.savedstate.SavedStateRegistry r1 = new androidx.savedstate.SavedStateRegistry
            r1.<init>()
            r0.savedStateRegistry = r1
            return
    }

    public /* synthetic */ SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.savedstate.SavedStateRegistryController create(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r1) {
            androidx.savedstate.SavedStateRegistryController$Companion r0 = androidx.savedstate.SavedStateRegistryController.Companion
            androidx.savedstate.SavedStateRegistryController r1 = r0.create(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry r0 = r1.savedStateRegistry
            return r0
    }

    @androidx.annotation.MainThread
    public final void performAttach() {
            r3 = this;
            androidx.savedstate.SavedStateRegistryOwner r0 = r3.owner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r1 != r2) goto L21
            androidx.savedstate.Recreator r1 = new androidx.savedstate.Recreator
            androidx.savedstate.SavedStateRegistryOwner r2 = r3.owner
            r1.<init>(r2)
            r0.addObserver(r1)
            androidx.savedstate.SavedStateRegistry r1 = r3.savedStateRegistry
            r1.performAttach$savedstate_release(r0)
            r0 = 1
            r3.attached = r0
            return
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Restarter must be created only during owner's initialization stage"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.MainThread
    public final void performRestore(@org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.attached
            if (r0 != 0) goto L7
            r3.performAttach()
        L7:
            androidx.savedstate.SavedStateRegistryOwner r0 = r3.owner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 != 0) goto L1f
            androidx.savedstate.SavedStateRegistry r0 = r3.savedStateRegistry
            r0.performRestore$savedstate_release(r4)
            return
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "performRestore cannot be called when owner is "
            r4.append(r1)
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @androidx.annotation.MainThread
    public final void performSave(@org.jetbrains.annotations.NotNull android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "outBundle"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.savedstate.SavedStateRegistry r0 = r1.savedStateRegistry
            r0.performSave(r2)
            return
    }
}
