package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.MainThread
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LifecycleController {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.DispatchQueue dispatchQueue;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Lifecycle lifecycle;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Lifecycle.State minState;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleEventObserver observer;

    public LifecycleController(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.DispatchQueue r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r5) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "minState"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "dispatchQueue"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "parentJob"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.lifecycle = r2
            r1.minState = r3
            r1.dispatchQueue = r4
            androidx.lifecycle.g r3 = new androidx.lifecycle.g
            r3.<init>(r1, r5)
            r1.observer = r3
            androidx.lifecycle.Lifecycle$State r4 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 != r0) goto L35
            r2 = 1
            r3 = 0
            kotlinx.coroutines.e2.a.b(r5, r3, r2, r3)
            r1.finish()
            return
        L35:
            r2.addObserver(r3)
            return
    }

    public static /* synthetic */ void a(androidx.lifecycle.LifecycleController r0, kotlinx.coroutines.e2 r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            observer$lambda$0(r0, r1, r2, r3)
            return
    }

    private final void handleDestroy(kotlinx.coroutines.e2 r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.e2.a.b(r3, r0, r1, r0)
            r2.finish()
            return
    }

    private static final void observer$lambda$0(androidx.lifecycle.LifecycleController r1, kotlinx.coroutines.e2 r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "$parentJob"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "<anonymous parameter 1>"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.Lifecycle r4 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r4 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 != r0) goto L29
            r3 = 1
            r4 = 0
            kotlinx.coroutines.e2.a.b(r2, r4, r3, r4)
            r1.finish()
            return
        L29:
            androidx.lifecycle.Lifecycle r2 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = r1.minState
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L3f
            androidx.lifecycle.DispatchQueue r1 = r1.dispatchQueue
            r1.pause()
            return
        L3f:
            androidx.lifecycle.DispatchQueue r1 = r1.dispatchQueue
            r1.resume()
            return
    }

    @androidx.annotation.MainThread
    public final void finish() {
            r2 = this;
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            androidx.lifecycle.LifecycleEventObserver r1 = r2.observer
            r0.removeObserver(r1)
            androidx.lifecycle.DispatchQueue r0 = r2.dispatchQueue
            r0.finish()
            return
    }
}
