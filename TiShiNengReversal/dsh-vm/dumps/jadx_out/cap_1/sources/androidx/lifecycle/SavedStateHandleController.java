package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.SavedStateHandle handle;
    private boolean isAttached;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    public SavedStateHandleController(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.SavedStateHandle r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "handle"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.key = r2
            r1.handle = r3
            return
    }

    public final void attachToLifecycle(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3) {
            r1 = this;
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r1.isAttached
            if (r0 != 0) goto L20
            r0 = 1
            r1.isAttached = r0
            r3.addObserver(r1)
            java.lang.String r3 = r1.key
            androidx.lifecycle.SavedStateHandle r0 = r1.handle
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r0.savedStateProvider()
            r2.registerSavedStateProvider(r3, r0)
            return
        L20:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already attached to lifecycleOwner"
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.SavedStateHandle getHandle() {
            r1 = this;
            androidx.lifecycle.SavedStateHandle r0 = r1.handle
            return r0
    }

    public final boolean isAttached() {
            r1 = this;
            boolean r0 = r1.isAttached
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r0) goto L18
            r3 = 0
            r1.isAttached = r3
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
        L18:
            return
    }
}
