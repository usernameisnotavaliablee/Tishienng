package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ReportFragment extends android.app.Fragment {

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.ReportFragment.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    @org.jetbrains.annotations.Nullable
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener processListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
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

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void get$annotations(android.app.Activity r0) {
                return
        }

        @kotlin.jvm.JvmStatic
        public final void dispatch$lifecycle_runtime_release(@org.jetbrains.annotations.NotNull android.app.Activity r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r2 instanceof androidx.lifecycle.LifecycleRegistryOwner
                if (r0 == 0) goto L18
                androidx.lifecycle.LifecycleRegistryOwner r2 = (androidx.lifecycle.LifecycleRegistryOwner) r2
                androidx.lifecycle.LifecycleRegistry r2 = r2.getLifecycle()
                r2.handleLifecycleEvent(r3)
                return
            L18:
                boolean r0 = r2 instanceof androidx.lifecycle.LifecycleOwner
                if (r0 == 0) goto L2b
                androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
                androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
                boolean r0 = r2 instanceof androidx.lifecycle.LifecycleRegistry
                if (r0 == 0) goto L2b
                androidx.lifecycle.LifecycleRegistry r2 = (androidx.lifecycle.LifecycleRegistry) r2
                r2.handleLifecycleEvent(r3)
            L2b:
                return
        }

        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.ReportFragment get(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                android.app.FragmentManager r2 = r2.getFragmentManager()
                java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
                android.app.Fragment r2 = r2.findFragmentByTag(r0)
                java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"
                kotlin.jvm.internal.g0.n(r2, r0)
                androidx.lifecycle.ReportFragment r2 = (androidx.lifecycle.ReportFragment) r2
                return r2
        }

        @kotlin.jvm.JvmStatic
        public final void injectIfNeededIn(@org.jetbrains.annotations.NotNull android.app.Activity r4) {
                r3 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L10
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion
                r0.registerIn(r4)
            L10:
                android.app.FragmentManager r4 = r4.getFragmentManager()
                java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
                android.app.Fragment r1 = r4.findFragmentByTag(r0)
                if (r1 != 0) goto L2f
                android.app.FragmentTransaction r1 = r4.beginTransaction()
                androidx.lifecycle.ReportFragment r2 = new androidx.lifecycle.ReportFragment
                r2.<init>()
                android.app.FragmentTransaction r0 = r1.add(r2, r0)
                r0.commit()
                r4.executePendingTransactions()
            L2f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    public static final class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {

        @org.jetbrains.annotations.NotNull
        public static final androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion Companion = null;

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
            public final void registerIn(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
                    r1 = this;
                    java.lang.String r0 = "activity"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    androidx.lifecycle.ReportFragment$LifecycleCallbacks r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks
                    r0.<init>()
                    androidx.lifecycle.j.a(r2, r0)
                    return
            }
        }

        static {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion = r0
                return
        }

        public LifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public static final void registerIn(@org.jetbrains.annotations.NotNull android.app.Activity r1) {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion
                r0.registerIn(r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@org.jetbrains.annotations.NotNull android.app.Activity r1, @org.jetbrains.annotations.Nullable android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "activity"
                kotlin.jvm.internal.g0.p(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@org.jetbrains.annotations.NotNull android.app.Activity r2, @org.jetbrains.annotations.Nullable android.os.Bundle r3) {
                r1 = this;
                java.lang.String r3 = "activity"
                kotlin.jvm.internal.g0.p(r2, r3)
                androidx.lifecycle.ReportFragment$Companion r3 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                r3.dispatch$lifecycle_runtime_release(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull android.app.Activity r2, @org.jetbrains.annotations.NotNull android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "bundle"
                kotlin.jvm.internal.g0.p(r3, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }
    }

    static {
            androidx.lifecycle.ReportFragment$Companion r0 = new androidx.lifecycle.ReportFragment$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.ReportFragment.Companion = r0
            return
    }

    public ReportFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void dispatch(androidx.lifecycle.Lifecycle.Event r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L14
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            android.app.Activity r1 = r3.getActivity()
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.dispatch$lifecycle_runtime_release(r1, r4)
        L14:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void dispatch$lifecycle_runtime_release(@org.jetbrains.annotations.NotNull android.app.Activity r1, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r2) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r0.dispatch$lifecycle_runtime_release(r1, r2)
            return
    }

    private final void dispatchCreate(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onCreate()
        L5:
            return
    }

    private final void dispatchResume(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onResume()
        L5:
            return
    }

    private final void dispatchStart(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onStart()
        L5:
            return
    }

    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.ReportFragment get(@org.jetbrains.annotations.NotNull android.app.Activity r1) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            androidx.lifecycle.ReportFragment r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final void injectIfNeededIn(@org.jetbrains.annotations.NotNull android.app.Activity r1) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r0.injectIfNeededIn(r1)
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@org.jetbrains.annotations.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r1 = r0.processListener
            r0.dispatchCreate(r1)
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.dispatch(r1)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r1.dispatch(r0)
            r0 = 0
            r1.processListener = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.processListener
            r1.dispatchResume(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.processListener
            r1.dispatchStart(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r1.dispatch(r0)
            return
    }

    public final void setProcessListener(@org.jetbrains.annotations.Nullable androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            r0.processListener = r1
            return
    }
}
