package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PausingDispatcherKt {
    @kotlin.Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object whenCreated(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            java.lang.Object r1 = whenStateAtLeast(r1, r0, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object whenCreated(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.Object r0 = whenCreated(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object whenResumed(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            java.lang.Object r1 = whenStateAtLeast(r1, r0, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object whenResumed(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.Object r0 = whenResumed(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object whenStarted(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            java.lang.Object r1 = whenStateAtLeast(r1, r0, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object whenStarted(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.Object r0 = whenStarted(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object whenStateAtLeast(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r6) {
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r0 = r0.t()
            androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r1 = new androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2
            r2 = 0
            r1.<init>(r3, r4, r5, r2)
            java.lang.Object r3 = kotlinx.coroutines.i.h(r0, r1, r6)
            return r3
    }
}
