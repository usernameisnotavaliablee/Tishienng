package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;

    @org.jetbrains.annotations.Nullable
    private androidx.activity.OnBackPressedCallback inProgressCallback;

    @org.jetbrains.annotations.Nullable
    private android.window.OnBackInvokedDispatcher invokedDispatcher;

    @org.jetbrains.annotations.Nullable
    private android.window.OnBackInvokedCallback onBackInvokedCallback;

    @org.jetbrains.annotations.NotNull
    private final kotlin.collections.m<androidx.activity.OnBackPressedCallback> onBackPressedCallbacks;

    @org.jetbrains.annotations.Nullable
    private final androidx.core.util.Consumer<java.lang.Boolean> onHasEnabledCallbacksChanged;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    public static final class Api33Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.OnBackPressedDispatcher.Api33Impl INSTANCE = null;

        static {
                androidx.activity.OnBackPressedDispatcher$Api33Impl r0 = new androidx.activity.OnBackPressedDispatcher$Api33Impl
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE = r0
                return
        }

        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(kotlin.jvm.functions.Function0 r0) {
                createOnBackInvokedCallback$lambda$0(r0)
                return
        }

        private static final void createOnBackInvokedCallback$lambda$0(kotlin.jvm.functions.Function0 r1) {
                java.lang.String r0 = "$onBackInvoked"
                kotlin.jvm.internal.g0.p(r1, r0)
                r1.invoke()
                return
        }

        @androidx.annotation.DoNotInline
        @org.jetbrains.annotations.NotNull
        public final android.window.OnBackInvokedCallback createOnBackInvokedCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r2) {
                r1 = this;
                java.lang.String r0 = "onBackInvoked"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.activity.l r0 = new androidx.activity.l
                r0.<init>(r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public final void registerOnBackInvokedCallback(@org.jetbrains.annotations.NotNull java.lang.Object r2, int r3, @org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r4, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r4 = (android.window.OnBackInvokedCallback) r4
                r2.registerOnBackInvokedCallback(r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public final void unregisterOnBackInvokedCallback(@org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r3, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r3 = (android.window.OnBackInvokedCallback) r3
                r2.unregisterOnBackInvokedCallback(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    public static final class Api34Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.activity.OnBackPressedDispatcher.Api34Impl INSTANCE = null;

        static {
                androidx.activity.OnBackPressedDispatcher$Api34Impl r0 = new androidx.activity.OnBackPressedDispatcher$Api34Impl
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.Api34Impl.INSTANCE = r0
                return
        }

        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        @org.jetbrains.annotations.NotNull
        public final android.window.OnBackInvokedCallback createOnBackAnimationCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.activity.BackEventCompat, kotlin.n1> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.activity.BackEventCompat, kotlin.n1> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r5) {
                r1 = this;
                java.lang.String r0 = "onBackStarted"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "onBackProgressed"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "onBackInvoked"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "onBackCancelled"
                kotlin.jvm.internal.g0.p(r5, r0)
                androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1 r0 = new androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                r0.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {

        @org.jetbrains.annotations.Nullable
        private androidx.activity.Cancellable currentCancellable;

        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.Lifecycle lifecycle;

        @org.jetbrains.annotations.NotNull
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(@org.jetbrains.annotations.NotNull androidx.activity.OnBackPressedDispatcher r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3, androidx.activity.OnBackPressedCallback r4) {
                r1 = this;
                java.lang.String r0 = "lifecycle"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "onBackPressedCallback"
                kotlin.jvm.internal.g0.p(r4, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.lifecycle = r3
                r1.onBackPressedCallback = r4
                r3.addObserver(r1)
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.lifecycle
                r0.removeObserver(r1)
                androidx.activity.OnBackPressedCallback r0 = r1.onBackPressedCallback
                r0.removeCancellable(r1)
                androidx.activity.Cancellable r0 = r1.currentCancellable
                if (r0 == 0) goto L11
                r0.cancel()
            L11:
                r0 = 0
                r1.currentCancellable = r0
                return
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "event"
                kotlin.jvm.internal.g0.p(r3, r2)
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
                if (r3 != r2) goto L19
                androidx.activity.OnBackPressedDispatcher r2 = r1.this$0
                androidx.activity.OnBackPressedCallback r3 = r1.onBackPressedCallback
                androidx.activity.Cancellable r2 = r2.addCancellableCallback$activity_release(r3)
                r1.currentCancellable = r2
                return
            L19:
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                if (r3 != r2) goto L25
                androidx.activity.Cancellable r2 = r1.currentCancellable
                if (r2 == 0) goto L2c
                r2.cancel()
                return
            L25:
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                if (r3 != r2) goto L2c
                r1.cancel()
            L2c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class OnBackPressedCancellable implements androidx.activity.Cancellable {

        @org.jetbrains.annotations.NotNull
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(@org.jetbrains.annotations.NotNull androidx.activity.OnBackPressedDispatcher r2, androidx.activity.OnBackPressedCallback r3) {
                r1 = this;
                java.lang.String r0 = "onBackPressedCallback"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.onBackPressedCallback = r3
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r2 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                kotlin.collections.m r0 = androidx.activity.OnBackPressedDispatcher.access$getOnBackPressedCallbacks$p(r0)
                androidx.activity.OnBackPressedCallback r1 = r2.onBackPressedCallback
                r0.remove(r1)
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                androidx.activity.OnBackPressedCallback r0 = androidx.activity.OnBackPressedDispatcher.access$getInProgressCallback$p(r0)
                androidx.activity.OnBackPressedCallback r1 = r2.onBackPressedCallback
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                r1 = 0
                if (r0 == 0) goto L24
                androidx.activity.OnBackPressedCallback r0 = r2.onBackPressedCallback
                r0.handleOnBackCancelled()
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                androidx.activity.OnBackPressedDispatcher.access$setInProgressCallback$p(r0, r1)
            L24:
                androidx.activity.OnBackPressedCallback r0 = r2.onBackPressedCallback
                r0.removeCancellable(r2)
                androidx.activity.OnBackPressedCallback r0 = r2.onBackPressedCallback
                kotlin.jvm.functions.Function0 r0 = r0.getEnabledChangedCallback$activity_release()
                if (r0 == 0) goto L34
                r0.invoke()
            L34:
                androidx.activity.OnBackPressedCallback r0 = r2.onBackPressedCallback
                r0.setEnabledChangedCallback$activity_release(r1)
                return
        }
    }

    @kotlin.jvm.JvmOverloads
    public OnBackPressedDispatcher() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public OnBackPressedDispatcher(@org.jetbrains.annotations.Nullable java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ OnBackPressedDispatcher(java.lang.Runnable r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public OnBackPressedDispatcher(@org.jetbrains.annotations.Nullable java.lang.Runnable r4, @org.jetbrains.annotations.Nullable androidx.core.util.Consumer<java.lang.Boolean> r5) {
            r3 = this;
            r3.<init>()
            r3.fallbackOnBackPressed = r4
            r3.onHasEnabledCallbacksChanged = r5
            kotlin.collections.m r4 = new kotlin.collections.m
            r4.<init>()
            r3.onBackPressedCallbacks = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L40
            r5 = 34
            if (r4 < r5) goto L33
            androidx.activity.OnBackPressedDispatcher$Api34Impl r4 = androidx.activity.OnBackPressedDispatcher.Api34Impl.INSTANCE
            androidx.activity.OnBackPressedDispatcher$1 r5 = new androidx.activity.OnBackPressedDispatcher$1
            r5.<init>(r3)
            androidx.activity.OnBackPressedDispatcher$2 r0 = new androidx.activity.OnBackPressedDispatcher$2
            r0.<init>(r3)
            androidx.activity.OnBackPressedDispatcher$3 r1 = new androidx.activity.OnBackPressedDispatcher$3
            r1.<init>(r3)
            androidx.activity.OnBackPressedDispatcher$4 r2 = new androidx.activity.OnBackPressedDispatcher$4
            r2.<init>(r3)
            android.window.OnBackInvokedCallback r4 = r4.createOnBackAnimationCallback(r5, r0, r1, r2)
            goto L3e
        L33:
            androidx.activity.OnBackPressedDispatcher$Api33Impl r4 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            androidx.activity.OnBackPressedDispatcher$5 r5 = new androidx.activity.OnBackPressedDispatcher$5
            r5.<init>(r3)
            android.window.OnBackInvokedCallback r4 = r4.createOnBackInvokedCallback(r5)
        L3e:
            r3.onBackInvokedCallback = r4
        L40:
            return
    }

    public static final /* synthetic */ androidx.activity.OnBackPressedCallback access$getInProgressCallback$p(androidx.activity.OnBackPressedDispatcher r0) {
            androidx.activity.OnBackPressedCallback r0 = r0.inProgressCallback
            return r0
    }

    public static final /* synthetic */ kotlin.collections.m access$getOnBackPressedCallbacks$p(androidx.activity.OnBackPressedDispatcher r0) {
            kotlin.collections.m<androidx.activity.OnBackPressedCallback> r0 = r0.onBackPressedCallbacks
            return r0
    }

    public static final /* synthetic */ void access$onBackCancelled(androidx.activity.OnBackPressedDispatcher r0) {
            r0.onBackCancelled()
            return
    }

    public static final /* synthetic */ void access$onBackProgressed(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.BackEventCompat r1) {
            r0.onBackProgressed(r1)
            return
    }

    public static final /* synthetic */ void access$onBackStarted(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.BackEventCompat r1) {
            r0.onBackStarted(r1)
            return
    }

    public static final /* synthetic */ void access$setInProgressCallback$p(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.OnBackPressedCallback r1) {
            r0.inProgressCallback = r1
            return
    }

    public static final /* synthetic */ void access$updateEnabledCallbacks(androidx.activity.OnBackPressedDispatcher r0) {
            r0.updateEnabledCallbacks()
            return
    }

    @androidx.annotation.MainThread
    private final void onBackCancelled() {
            r4 = this;
            kotlin.collections.m<androidx.activity.OnBackPressedCallback> r0 = r4.onBackPressedCallbacks
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.previous()
            r3 = r1
            androidx.activity.OnBackPressedCallback r3 = (androidx.activity.OnBackPressedCallback) r3
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto La
            goto L20
        L1f:
            r1 = r2
        L20:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r4.inProgressCallback = r2
            if (r1 == 0) goto L29
            r1.handleOnBackCancelled()
        L29:
            return
    }

    @androidx.annotation.MainThread
    private final void onBackProgressed(androidx.activity.BackEventCompat r4) {
            r3 = this;
            kotlin.collections.m<androidx.activity.OnBackPressedCallback> r0 = r3.onBackPressedCallbacks
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto La
            goto L1f
        L1e:
            r1 = 0
        L1f:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            if (r1 == 0) goto L26
            r1.handleOnBackProgressed(r4)
        L26:
            return
    }

    @androidx.annotation.MainThread
    private final void onBackStarted(androidx.activity.BackEventCompat r4) {
            r3 = this;
            kotlin.collections.m<androidx.activity.OnBackPressedCallback> r0 = r3.onBackPressedCallbacks
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto La
            goto L1f
        L1e:
            r1 = 0
        L1f:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r3.inProgressCallback = r1
            if (r1 == 0) goto L28
            r1.handleOnBackStarted(r4)
        L28:
            return
    }

    @androidx.annotation.RequiresApi(33)
    private final void updateBackInvokedCallbackState(boolean r5) {
            r4 = this;
            android.window.OnBackInvokedDispatcher r0 = r4.invokedDispatcher
            android.window.OnBackInvokedCallback r1 = r4.onBackInvokedCallback
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
            r2 = 0
            if (r5 == 0) goto L18
            boolean r3 = r4.backInvokedCallbackRegistered
            if (r3 != 0) goto L18
            androidx.activity.OnBackPressedDispatcher$Api33Impl r5 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            r5.registerOnBackInvokedCallback(r0, r2, r1)
            r5 = 1
            r4.backInvokedCallbackRegistered = r5
            return
        L18:
            if (r5 != 0) goto L25
            boolean r5 = r4.backInvokedCallbackRegistered
            if (r5 == 0) goto L25
            androidx.activity.OnBackPressedDispatcher$Api33Impl r5 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            r5.unregisterOnBackInvokedCallback(r0, r1)
            r4.backInvokedCallbackRegistered = r2
        L25:
            return
    }

    private final void updateEnabledCallbacks() {
            r4 = this;
            boolean r0 = r4.hasEnabledCallbacks
            kotlin.collections.m<androidx.activity.OnBackPressedCallback> r1 = r4.onBackPressedCallbacks
            boolean r2 = androidx.activity.k.a(r1)
            r3 = 0
            if (r2 == 0) goto L12
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L12
            goto L29
        L12:
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L16
            r3 = 1
        L29:
            r4.hasEnabledCallbacks = r3
            if (r3 == r0) goto L41
            androidx.core.util.Consumer<java.lang.Boolean> r0 = r4.onHasEnabledCallbacksChanged
            if (r0 == 0) goto L38
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.accept(r1)
        L38:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L41
            r4.updateBackInvokedCallbackState(r3)
        L41:
            return
    }

    @androidx.annotation.MainThread
    public final void addCallback(@org.jetbrains.annotations.NotNull androidx.activity.OnBackPressedCallback r2) {
            r1 = this;
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.addCancellableCallback$activity_release(r2)
            return
    }

    @androidx.annotation.MainThread
    public final void addCallback(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r3, @org.jetbrains.annotations.NotNull androidx.activity.OnBackPressedCallback r4) {
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L17
            return
        L17:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            r4.addCancellable(r0)
            r2.updateEnabledCallbacks()
            androidx.activity.OnBackPressedDispatcher$addCallback$1 r3 = new androidx.activity.OnBackPressedDispatcher$addCallback$1
            r3.<init>(r2)
            r4.setEnabledChangedCallback$activity_release(r3)
            return
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.Cancellable addCancellableCallback$activity_release(@org.jetbrains.annotations.NotNull androidx.activity.OnBackPressedCallback r3) {
            r2 = this;
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.collections.m<androidx.activity.OnBackPressedCallback> r0 = r2.onBackPressedCallbacks
            r0.add(r3)
            androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable
            r0.<init>(r2, r3)
            r3.addCancellable(r0)
            r2.updateEnabledCallbacks()
            androidx.activity.OnBackPressedDispatcher$addCancellableCallback$1 r1 = new androidx.activity.OnBackPressedDispatcher$addCancellableCallback$1
            r1.<init>(r2)
            r3.setEnabledChangedCallback$activity_release(r1)
            return r0
    }

    @androidx.annotation.MainThread
    @androidx.annotation.VisibleForTesting
    public final void dispatchOnBackCancelled() {
            r0 = this;
            r0.onBackCancelled()
            return
    }

    @androidx.annotation.MainThread
    @androidx.annotation.VisibleForTesting
    public final void dispatchOnBackProgressed(@org.jetbrains.annotations.NotNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.onBackProgressed(r2)
            return
    }

    @androidx.annotation.MainThread
    @androidx.annotation.VisibleForTesting
    public final void dispatchOnBackStarted(@org.jetbrains.annotations.NotNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.onBackStarted(r2)
            return
    }

    @androidx.annotation.MainThread
    public final boolean hasEnabledCallbacks() {
            r1 = this;
            boolean r0 = r1.hasEnabledCallbacks
            return r0
    }

    @androidx.annotation.MainThread
    public final void onBackPressed() {
            r4 = this;
            kotlin.collections.m<androidx.activity.OnBackPressedCallback> r0 = r4.onBackPressedCallbacks
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.previous()
            r3 = r1
            androidx.activity.OnBackPressedCallback r3 = (androidx.activity.OnBackPressedCallback) r3
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto La
            goto L20
        L1f:
            r1 = r2
        L20:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r4.inProgressCallback = r2
            if (r1 == 0) goto L2a
            r1.handleOnBackPressed()
            return
        L2a:
            java.lang.Runnable r0 = r4.fallbackOnBackPressed
            if (r0 == 0) goto L31
            r0.run()
        L31:
            return
    }

    @androidx.annotation.RequiresApi(33)
    public final void setOnBackInvokedDispatcher(@org.jetbrains.annotations.NotNull android.window.OnBackInvokedDispatcher r2) {
            r1 = this;
            java.lang.String r0 = "invoker"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.invokedDispatcher = r2
            boolean r2 = r1.hasEnabledCallbacks
            r1.updateBackInvokedCallbackState(r2)
            return
    }
}
