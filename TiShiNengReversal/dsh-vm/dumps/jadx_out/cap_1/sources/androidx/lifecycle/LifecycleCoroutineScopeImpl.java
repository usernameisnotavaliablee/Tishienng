package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LifecycleCoroutineScopeImpl extends androidx.lifecycle.LifecycleCoroutineScope implements androidx.lifecycle.LifecycleEventObserver {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i coroutineContext;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "coroutineContext"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.lifecycle = r2
            r1.coroutineContext = r3
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r2 != r3) goto L26
            kotlin.coroutines.i r2 = r1.getCoroutineContext()
            r3 = 1
            r0 = 0
            kotlinx.coroutines.h2.i(r2, r0, r3, r0)
        L26:
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.coroutineContext
            return r0
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle$lifecycle_common() {
            r1 = this;
            androidx.lifecycle.Lifecycle r0 = r1.lifecycle
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.g0.p(r3, r2)
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L2a
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle$lifecycle_common()
            r2.removeObserver(r1)
            kotlin.coroutines.i r2 = r1.getCoroutineContext()
            r3 = 1
            r0 = 0
            kotlinx.coroutines.h2.i(r2, r0, r3, r0)
        L2a:
            return
    }

    public final void register() {
            r7 = this;
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r2 = r0.t()
            androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r4 = new androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }
}
