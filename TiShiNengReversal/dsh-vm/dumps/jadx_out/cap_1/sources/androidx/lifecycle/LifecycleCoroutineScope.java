package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class LifecycleCoroutineScope implements kotlinx.coroutines.r0 {
    public LifecycleCoroutineScope() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.Lifecycle getLifecycle$lifecycle_common();

    @kotlin.Deprecated(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.e2 launchWhenCreated(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r8) {
            r7 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 r4 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            kotlinx.coroutines.e2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @kotlin.Deprecated(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.e2 launchWhenResumed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r8) {
            r7 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 r4 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            kotlinx.coroutines.e2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @kotlin.Deprecated(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.e2 launchWhenStarted(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r8) {
            r7 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 r4 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            kotlinx.coroutines.e2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return r8
    }
}
