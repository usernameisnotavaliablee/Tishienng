package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ServiceLifecycleDispatcher {

    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler;

    @org.jetbrains.annotations.Nullable
    private androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable lastDispatchRunnable;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleRegistry registry;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class DispatchRunnable implements java.lang.Runnable {

        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.Lifecycle.Event event;

        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleRegistry r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                java.lang.String r0 = "registry"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.registry = r2
                r1.event = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.Lifecycle.Event getEvent() {
                r1 = this;
                androidx.lifecycle.Lifecycle$Event r0 = r1.event
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.wasExecuted
                if (r0 != 0) goto Le
                androidx.lifecycle.LifecycleRegistry r0 = r2.registry
                androidx.lifecycle.Lifecycle$Event r1 = r2.event
                r0.handleLifecycleEvent(r1)
                r0 = 1
                r2.wasExecuted = r0
            Le:
                return
        }
    }

    public ServiceLifecycleDispatcher(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r2)
            r1.registry = r0
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.handler = r2
            return
    }

    private final void postDispatchRunnable(androidx.lifecycle.Lifecycle.Event r3) {
            r2 = this;
            androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable r0 = r2.lastDispatchRunnable
            if (r0 == 0) goto L7
            r0.run()
        L7:
            androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable r0 = new androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable
            androidx.lifecycle.LifecycleRegistry r1 = r2.registry
            r0.<init>(r1, r3)
            r2.lastDispatchRunnable = r0
            android.os.Handler r3 = r2.handler
            kotlin.jvm.internal.g0.m(r0)
            r3.postAtFrontOfQueue(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.registry
            return r0
    }

    public void onServicePreSuperOnBind() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.postDispatchRunnable(r0)
            return
    }

    public void onServicePreSuperOnCreate() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r1.postDispatchRunnable(r0)
            return
    }

    public void onServicePreSuperOnDestroy() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r1.postDispatchRunnable(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r1.postDispatchRunnable(r0)
            return
    }

    public void onServicePreSuperOnStart() {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.postDispatchRunnable(r0)
            return
    }
}
