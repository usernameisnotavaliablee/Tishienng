package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ProcessLifecycleOwner implements androidx.lifecycle.LifecycleOwner {

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.ProcessLifecycleOwner.Companion Companion = null;
    public static final long TIMEOUT_MS = 700;

    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.ProcessLifecycleOwner newInstance = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Runnable delayedPauseRunnable;

    @org.jetbrains.annotations.Nullable
    private android.os.Handler handler;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.ReportFragment.ActivityInitializationListener initializationListener;
    private boolean pauseSent;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleRegistry registry;
    private int resumedCounter;
    private int startedCounter;
    private boolean stopSent;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    public static final class Api29Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.ProcessLifecycleOwner.Api29Impl INSTANCE = null;

        static {
                androidx.lifecycle.ProcessLifecycleOwner$Api29Impl r0 = new androidx.lifecycle.ProcessLifecycleOwner$Api29Impl
                r0.<init>()
                androidx.lifecycle.ProcessLifecycleOwner.Api29Impl.INSTANCE = r0
                return
        }

        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.DoNotInline
        public static final void registerActivityLifecycleCallbacks(@org.jetbrains.annotations.NotNull android.app.Activity r1, @org.jetbrains.annotations.NotNull android.app.Application.ActivityLifecycleCallbacks r2) {
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.registerActivityLifecycleCallbacks(r2)
                return
        }
    }

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

        @androidx.annotation.VisibleForTesting
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.LifecycleOwner get() {
                r1 = this;
                androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.access$getNewInstance$cp()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final void init$lifecycle_process_release(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.access$getNewInstance$cp()
                r0.attach$lifecycle_process_release(r2)
                return
        }
    }

    static {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = new androidx.lifecycle.ProcessLifecycleOwner$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.ProcessLifecycleOwner.Companion = r0
            androidx.lifecycle.ProcessLifecycleOwner r0 = new androidx.lifecycle.ProcessLifecycleOwner
            r0.<init>()
            androidx.lifecycle.ProcessLifecycleOwner.newInstance = r0
            return
    }

    private ProcessLifecycleOwner() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.pauseSent = r0
            r1.stopSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.registry = r0
            androidx.lifecycle.i r0 = new androidx.lifecycle.i
            r0.<init>(r1)
            r1.delayedPauseRunnable = r0
            androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1 r0 = new androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
            r0.<init>(r1)
            r1.initializationListener = r0
            return
    }

    public static /* synthetic */ void a(androidx.lifecycle.ProcessLifecycleOwner r0) {
            delayedPauseRunnable$lambda$0(r0)
            return
    }

    public static final /* synthetic */ androidx.lifecycle.ReportFragment.ActivityInitializationListener access$getInitializationListener$p(androidx.lifecycle.ProcessLifecycleOwner r0) {
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r0.initializationListener
            return r0
    }

    public static final /* synthetic */ androidx.lifecycle.ProcessLifecycleOwner access$getNewInstance$cp() {
            androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.newInstance
            return r0
    }

    private static final void delayedPauseRunnable$lambda$0(androidx.lifecycle.ProcessLifecycleOwner r1) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.dispatchPauseIfNeeded$lifecycle_process_release()
            r1.dispatchStopIfNeeded$lifecycle_process_release()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LifecycleOwner get() {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            androidx.lifecycle.LifecycleOwner r0 = r0.get()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final void init$lifecycle_process_release(@org.jetbrains.annotations.NotNull android.content.Context r1) {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            r0.init$lifecycle_process_release(r1)
            return
    }

    public final void activityPaused$lifecycle_process_release() {
            r4 = this;
            int r0 = r4.resumedCounter
            int r0 = r0 + (-1)
            r4.resumedCounter = r0
            if (r0 != 0) goto L14
            android.os.Handler r0 = r4.handler
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Runnable r1 = r4.delayedPauseRunnable
            r2 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r1, r2)
        L14:
            return
    }

    public final void activityResumed$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.resumedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.resumedCounter = r0
            if (r0 != r1) goto L21
            boolean r0 = r2.pauseSent
            if (r0 == 0) goto L17
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.pauseSent = r0
            return
        L17:
            android.os.Handler r0 = r2.handler
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Runnable r1 = r2.delayedPauseRunnable
            r0.removeCallbacks(r1)
        L21:
            return
    }

    public final void activityStarted$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.startedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.startedCounter = r0
            if (r0 != r1) goto L16
            boolean r0 = r2.stopSent
            if (r0 == 0) goto L16
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.stopSent = r0
        L16:
            return
    }

    public final void activityStopped$lifecycle_process_release() {
            r1 = this;
            int r0 = r1.startedCounter
            int r0 = r0 + (-1)
            r1.startedCounter = r0
            r1.dispatchStopIfNeeded$lifecycle_process_release()
            return
    }

    public final void attach$lifecycle_process_release(@org.jetbrains.annotations.NotNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.handler = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            kotlin.jvm.internal.g0.n(r3, r0)
            android.app.Application r3 = (android.app.Application) r3
            androidx.lifecycle.ProcessLifecycleOwner$attach$1 r0 = new androidx.lifecycle.ProcessLifecycleOwner$attach$1
            r0.<init>(r2)
            r3.registerActivityLifecycleCallbacks(r0)
            return
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.resumedCounter
            if (r0 != 0) goto Le
            r0 = 1
            r2.pauseSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
        Le:
            return
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.startedCounter
            if (r0 != 0) goto L12
            boolean r0 = r2.pauseSent
            if (r0 == 0) goto L12
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            r0 = 1
            r2.stopSent = r0
        L12:
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.registry
            return r0
    }
}
