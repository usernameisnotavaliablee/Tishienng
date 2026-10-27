package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LifecycleDispatcher {

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LifecycleDispatcher INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    public static final class DispatcherActivityCallback extends androidx.lifecycle.EmptyActivityLifecycleCallbacks {
        public DispatcherActivityCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@org.jetbrains.annotations.NotNull android.app.Activity r1, @org.jetbrains.annotations.Nullable android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "activity"
                kotlin.jvm.internal.g0.p(r1, r2)
                androidx.lifecycle.ReportFragment$Companion r2 = androidx.lifecycle.ReportFragment.Companion
                r2.injectIfNeededIn(r1)
                return
        }
    }

    static {
            androidx.lifecycle.LifecycleDispatcher r0 = new androidx.lifecycle.LifecycleDispatcher
            r0.<init>()
            androidx.lifecycle.LifecycleDispatcher.INSTANCE = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.LifecycleDispatcher.initialized = r0
            return
    }

    private LifecycleDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void init(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.lifecycle.LifecycleDispatcher.initialized
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            kotlin.jvm.internal.g0.n(r2, r0)
            android.app.Application r2 = (android.app.Application) r2
            androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback r0 = new androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback
            r0.<init>()
            r2.registerActivityLifecycleCallbacks(r0)
            return
    }
}
