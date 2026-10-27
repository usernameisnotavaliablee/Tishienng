package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
abstract class SpecialEffectsController {
    private final android.view.ViewGroup mContainer;
    boolean mIsContainerPostponed;
    boolean mOperationDirectionIsPop;
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mPendingOperations;
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mRunningOperations;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.fragment.app.SpecialEffectsController$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L43
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L4d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L58
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class FragmentStateManagerOperation extends androidx.fragment.app.SpecialEffectsController.Operation {

        @androidx.annotation.NonNull
        private final androidx.fragment.app.FragmentStateManager mFragmentStateManager;

        FragmentStateManagerOperation(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r2, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r4, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r5) {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r4.getFragment()
                r1.<init>(r2, r3, r0, r5)
                r1.mFragmentStateManager = r4
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
                r1 = this;
                super.complete()
                androidx.fragment.app.FragmentStateManager r0 = r1.mFragmentStateManager
                r0.moveToExpectedState()
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        void onStart() {
                r4 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r4.getLifecycleImpact()
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                if (r0 != r1) goto L56
                androidx.fragment.app.FragmentStateManager r0 = r4.mFragmentStateManager
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r1 = r0.mView
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L26
                r0.setFocusedView(r1)
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L26
                r1.toString()
                r0.toString()
            L26:
                androidx.fragment.app.Fragment r1 = r4.getFragment()
                android.view.View r1 = r1.requireView()
                android.view.ViewParent r2 = r1.getParent()
                r3 = 0
                if (r2 != 0) goto L3d
                androidx.fragment.app.FragmentStateManager r2 = r4.mFragmentStateManager
                r2.addViewToContainer()
                r1.setAlpha(r3)
            L3d:
                float r2 = r1.getAlpha()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L4f
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L4f
                r2 = 4
                r1.setVisibility(r2)
            L4f:
                float r0 = r0.getPostOnViewCreatedAlpha()
                r1.setAlpha(r0)
            L56:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Operation {

        @androidx.annotation.NonNull
        private final java.util.List<java.lang.Runnable> mCompletionListeners;

        @androidx.annotation.NonNull
        private androidx.fragment.app.SpecialEffectsController.Operation.State mFinalState;

        @androidx.annotation.NonNull
        private final androidx.fragment.app.Fragment mFragment;
        private boolean mIsCanceled;
        private boolean mIsComplete;

        @androidx.annotation.NonNull
        private androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact mLifecycleImpact;

        @androidx.annotation.NonNull
        private final java.util.HashSet<androidx.core.os.CancellationSignal> mSpecialEffectsSignals;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum LifecycleImpact extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact ADDING = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact NONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact REMOVING = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r3 = "ADDING"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING = r1
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r5 = "REMOVING"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING = r3
                    r5 = 3
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r5 = new androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES = r5
                    return
            }

            LifecycleImpact(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact> r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact) r1
                    return r1
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[]) r0
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        enum State extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.State> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.State[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State GONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State INVISIBLE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State REMOVED = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State VISIBLE = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r3 = "VISIBLE"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE = r1
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r5 = "GONE"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.GONE = r3
                    androidx.fragment.app.SpecialEffectsController$Operation$State r5 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r7 = "INVISIBLE"
                    r8 = 3
                    r5.<init>(r7, r8)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE = r5
                    r7 = 4
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r7 = new androidx.fragment.app.SpecialEffectsController.Operation.State[r7]
                    r7[r2] = r0
                    r7[r4] = r1
                    r7[r6] = r3
                    r7[r8] = r5
                    androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES = r7
                    return
            }

            State(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @androidx.annotation.NonNull
            static androidx.fragment.app.SpecialEffectsController.Operation.State from(int r3) {
                    if (r3 == 0) goto L26
                    r0 = 4
                    if (r3 == r0) goto L23
                    r0 = 8
                    if (r3 != r0) goto Lc
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                    return r3
                Lc:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unknown visibility "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r3 = r1.toString()
                    r0.<init>(r3)
                    throw r0
                L23:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r3
                L26:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                    return r3
            }

            @androidx.annotation.NonNull
            static androidx.fragment.app.SpecialEffectsController.Operation.State from(@androidx.annotation.NonNull android.view.View r2) {
                    float r0 = r2.getAlpha()
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L12
                    int r0 = r2.getVisibility()
                    if (r0 != 0) goto L12
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r2
                L12:
                    int r2 = r2.getVisibility()
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = from(r2)
                    return r2
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$State> r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = (androidx.fragment.app.SpecialEffectsController.Operation.State) r1
                    return r1
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.State[]) r0
                    return r0
            }

            void applyState(@androidx.annotation.NonNull android.view.View r4) {
                    r3 = this;
                    int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State
                    int r1 = r3.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    r2 = 2
                    if (r0 == r1) goto L3f
                    if (r0 == r2) goto L31
                    r1 = 3
                    if (r0 == r1) goto L22
                    r1 = 4
                    if (r0 == r1) goto L15
                    goto L56
                L15:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                    if (r0 == 0) goto L1e
                    java.util.Objects.toString(r4)
                L1e:
                    r4.setVisibility(r1)
                    return
                L22:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                    if (r0 == 0) goto L2b
                    java.util.Objects.toString(r4)
                L2b:
                    r0 = 8
                    r4.setVisibility(r0)
                    return
                L31:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                    if (r0 == 0) goto L3a
                    java.util.Objects.toString(r4)
                L3a:
                    r0 = 0
                    r4.setVisibility(r0)
                    return
                L3f:
                    android.view.ViewParent r0 = r4.getParent()
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    if (r0 == 0) goto L56
                    boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                    if (r1 == 0) goto L53
                    r4.toString()
                    r0.toString()
                L53:
                    r0.removeView(r4)
                L56:
                    return
            }
        }

        Operation(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r2, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, @androidx.annotation.NonNull androidx.fragment.app.Fragment r4, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r5) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCompletionListeners = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mSpecialEffectsSignals = r0
                r0 = 0
                r1.mIsCanceled = r0
                r1.mIsComplete = r0
                r1.mFinalState = r2
                r1.mLifecycleImpact = r3
                r1.mFragment = r4
                androidx.fragment.app.SpecialEffectsController$Operation$1 r2 = new androidx.fragment.app.SpecialEffectsController$Operation$1
                r2.<init>(r1)
                r5.setOnCancelListener(r2)
                return
        }

        final void addCompletionListener(@androidx.annotation.NonNull java.lang.Runnable r2) {
                r1 = this;
                java.util.List<java.lang.Runnable> r0 = r1.mCompletionListeners
                r0.add(r2)
                return
        }

        final void cancel() {
                r2 = this;
                boolean r0 = r2.isCanceled()
                if (r0 == 0) goto L7
                goto L31
            L7:
                r0 = 1
                r2.mIsCanceled = r0
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r2.mSpecialEffectsSignals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                r2.complete()
                return
            L16:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.HashSet<androidx.core.os.CancellationSignal> r1 = r2.mSpecialEffectsSignals
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L21:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                androidx.core.os.CancellationSignal r1 = (androidx.core.os.CancellationSignal) r1
                r1.cancel()
                goto L21
            L31:
                return
        }

        @androidx.annotation.CallSuper
        public void complete() {
                r2 = this;
                boolean r0 = r2.mIsComplete
                if (r0 == 0) goto L5
                goto L28
            L5:
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto Lf
                r2.toString()
            Lf:
                r0 = 1
                r2.mIsComplete = r0
                java.util.List<java.lang.Runnable> r0 = r2.mCompletionListeners
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L28
                java.lang.Object r1 = r0.next()
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r1.run()
                goto L18
            L28:
                return
        }

        public final void completeSpecialEffect(@androidx.annotation.NonNull androidx.core.os.CancellationSignal r2) {
                r1 = this;
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L13
                java.util.HashSet<androidx.core.os.CancellationSignal> r2 = r1.mSpecialEffectsSignals
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L13
                r1.complete()
            L13:
                return
        }

        @androidx.annotation.NonNull
        public androidx.fragment.app.SpecialEffectsController.Operation.State getFinalState() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r1.mFinalState
                return r0
        }

        @androidx.annotation.NonNull
        public final androidx.fragment.app.Fragment getFragment() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.mFragment
                return r0
        }

        @androidx.annotation.NonNull
        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r1.mLifecycleImpact
                return r0
        }

        final boolean isCanceled() {
                r1 = this;
                boolean r0 = r1.mIsCanceled
                return r0
        }

        final boolean isComplete() {
                r1 = this;
                boolean r0 = r1.mIsComplete
                return r0
        }

        public final void markStartedSpecialEffect(@androidx.annotation.NonNull androidx.core.os.CancellationSignal r2) {
                r1 = this;
                r1.onStart()
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                r0.add(r2)
                return
        }

        final void mergeWith(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r3, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4) {
                r2 = this;
                int[] r0 = androidx.fragment.app.SpecialEffectsController.AnonymousClass3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact
                int r4 = r4.ordinal()
                r4 = r0[r4]
                r0 = 1
                r1 = 2
                if (r4 == r0) goto L4c
                if (r4 == r1) goto L2e
                r0 = 3
                if (r4 == r0) goto L12
                goto L6a
            L12:
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r2.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r4 == r0) goto L6a
                boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
                if (r4 == 0) goto L2b
                androidx.fragment.app.Fragment r4 = r2.mFragment
                java.util.Objects.toString(r4)
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r2.mFinalState
                java.util.Objects.toString(r4)
                java.util.Objects.toString(r3)
            L2b:
                r2.mFinalState = r3
                return
            L2e:
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
                if (r3 == 0) goto L43
                androidx.fragment.app.Fragment r3 = r2.mFragment
                java.util.Objects.toString(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r2.mFinalState
                java.util.Objects.toString(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r2.mLifecycleImpact
                java.util.Objects.toString(r3)
            L43:
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                r2.mFinalState = r3
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                r2.mLifecycleImpact = r3
                return
            L4c:
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r2.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r3 != r4) goto L6a
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
                if (r3 == 0) goto L62
                androidx.fragment.app.Fragment r3 = r2.mFragment
                java.util.Objects.toString(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r2.mLifecycleImpact
                java.util.Objects.toString(r3)
            L62:
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r2.mFinalState = r3
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                r2.mLifecycleImpact = r3
            L6a:
                return
        }

        void onStart() {
                r0 = this;
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Operation "
                r0.append(r1)
                java.lang.String r1 = "{"
                r0.append(r1)
                int r2 = java.lang.System.identityHashCode(r4)
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r0.append(r2)
                java.lang.String r2 = "} "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mFinalState = "
                r0.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r4.mFinalState
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mLifecycleImpact = "
                r0.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r4.mLifecycleImpact
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "mFragment = "
                r0.append(r1)
                androidx.fragment.app.Fragment r1 = r4.mFragment
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    SpecialEffectsController(@androidx.annotation.NonNull android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingOperations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRunningOperations = r0
            r0 = 0
            r1.mOperationDirectionIsPop = r0
            r1.mIsContainerPostponed = r0
            r1.mContainer = r2
            return
    }

    private void enqueue(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r4, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r5, @androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r6) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mPendingOperations
            monitor-enter(r0)
            androidx.core.os.CancellationSignal r1 = new androidx.core.os.CancellationSignal     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            androidx.fragment.app.Fragment r2 = r6.getFragment()     // Catch: java.lang.Throwable -> L17
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.findPendingOperation(r2)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2.mergeWith(r4, r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r4 = move-exception
            goto L35
        L19:
            androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation r2 = new androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation     // Catch: java.lang.Throwable -> L17
            r2.<init>(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r3.mPendingOperations     // Catch: java.lang.Throwable -> L17
            r4.add(r2)     // Catch: java.lang.Throwable -> L17
            androidx.fragment.app.SpecialEffectsController$1 r4 = new androidx.fragment.app.SpecialEffectsController$1     // Catch: java.lang.Throwable -> L17
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L17
            r2.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L17
            androidx.fragment.app.SpecialEffectsController$2 r4 = new androidx.fragment.app.SpecialEffectsController$2     // Catch: java.lang.Throwable -> L17
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L17
            r2.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.SpecialEffectsController.Operation findPendingOperation(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L6
            return r1
        L23:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.SpecialEffectsController.Operation findRunningOperation(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mRunningOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L6
            return r1
        L23:
            r4 = 0
            return r4
    }

    @androidx.annotation.NonNull
    static androidx.fragment.app.SpecialEffectsController getOrCreateController(@androidx.annotation.NonNull android.view.ViewGroup r0, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r1) {
            androidx.fragment.app.SpecialEffectsControllerFactory r1 = r1.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r0 = getOrCreateController(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.fragment.app.SpecialEffectsController getOrCreateController(@androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsControllerFactory r4) {
            int r0 = androidx.fragment.R.id.special_effects_controller_view_tag
            java.lang.Object r1 = r3.getTag(r0)
            boolean r2 = r1 instanceof androidx.fragment.app.SpecialEffectsController
            if (r2 == 0) goto Ld
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            return r1
        Ld:
            androidx.fragment.app.SpecialEffectsController r4 = r4.createController(r3)
            r3.setTag(r0, r4)
            return r4
    }

    private void updateFinalState() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r4.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = r1.getLifecycleImpact()
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r2 != r3) goto L6
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r2 = r2.requireView()
            int r2 = r2.getVisibility()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r2)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r1.mergeWith(r2, r3)
            goto L6
        L30:
            return
    }

    void enqueueAdd(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation.State r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r1 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Le
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            java.util.Objects.toString(r0)
        Le:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            r1.enqueue(r2, r0, r3)
            return
    }

    void enqueueHide(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Le
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            java.util.Objects.toString(r0)
        Le:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    void enqueueRemove(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Le
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            java.util.Objects.toString(r0)
        Le:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            r2.enqueue(r0, r1, r3)
            return
    }

    void enqueueShow(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto Le
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            java.util.Objects.toString(r0)
        Le:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    abstract void executeOperations(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r1, boolean r2);

    void executePendingOperations() {
            r5 = this;
            boolean r0 = r5.mIsContainerPostponed
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r5.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            r1 = 0
            if (r0 != 0) goto L14
            r5.forceCompleteAllOperations()
            r5.mOperationDirectionIsPop = r1
            return
        L14:
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r5.mPendingOperations
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r5.mPendingOperations     // Catch: java.lang.Throwable -> L46
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L86
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r5.mRunningOperations     // Catch: java.lang.Throwable -> L46
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r5.mRunningOperations     // Catch: java.lang.Throwable -> L46
            r3.clear()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L46
        L2f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L46
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> L46
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L48
            java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L88
        L48:
            r3.cancel()     // Catch: java.lang.Throwable -> L46
            boolean r4 = r3.isComplete()     // Catch: java.lang.Throwable -> L46
            if (r4 != 0) goto L2f
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r5.mRunningOperations     // Catch: java.lang.Throwable -> L46
            r4.add(r3)     // Catch: java.lang.Throwable -> L46
            goto L2f
        L57:
            r5.updateFinalState()     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r5.mPendingOperations     // Catch: java.lang.Throwable -> L46
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r5.mPendingOperations     // Catch: java.lang.Throwable -> L46
            r3.clear()     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r5.mRunningOperations     // Catch: java.lang.Throwable -> L46
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L46
        L6f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L46
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4     // Catch: java.lang.Throwable -> L46
            r4.onStart()     // Catch: java.lang.Throwable -> L46
            goto L6f
        L7f:
            boolean r3 = r5.mOperationDirectionIsPop     // Catch: java.lang.Throwable -> L46
            r5.executeOperations(r2, r3)     // Catch: java.lang.Throwable -> L46
            r5.mOperationDirectionIsPop = r1     // Catch: java.lang.Throwable -> L46
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r1
    }

    void forceCompleteAllOperations() {
            r7 = this;
            android.view.ViewGroup r0 = r7.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r7.mPendingOperations
            monitor-enter(r1)
            r7.updateFinalState()     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L22
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L22
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> L22
            r3.onStart()     // Catch: java.lang.Throwable -> L22
            goto L12
        L22:
            r0 = move-exception
            goto L9e
        L25:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L22
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L22
            r4 = 2
            if (r3 == 0) goto L61
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L22
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> L22
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L5d
            if (r0 == 0) goto L46
            goto L5a
        L46:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r4.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "Container "
            r4.append(r5)     // Catch: java.lang.Throwable -> L22
            android.view.ViewGroup r5 = r7.mContainer     // Catch: java.lang.Throwable -> L22
            r4.append(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = " is not attached to window. "
            r4.append(r5)     // Catch: java.lang.Throwable -> L22
        L5a:
            java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L22
        L5d:
            r3.cancel()     // Catch: java.lang.Throwable -> L22
            goto L30
        L61:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L22
        L6c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L22
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> L22
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L98
            if (r0 == 0) goto L81
            goto L95
        L81:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r5.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = "Container "
            r5.append(r6)     // Catch: java.lang.Throwable -> L22
            android.view.ViewGroup r6 = r7.mContainer     // Catch: java.lang.Throwable -> L22
            r5.append(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = " is not attached to window. "
            r5.append(r6)     // Catch: java.lang.Throwable -> L22
        L95:
            java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L22
        L98:
            r3.cancel()     // Catch: java.lang.Throwable -> L22
            goto L6c
        L9c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            return
        L9e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    void forcePostponedExecutePendingOperations() {
            r1 = this;
            boolean r0 = r1.mIsContainerPostponed
            if (r0 == 0) goto La
            r0 = 0
            r1.mIsContainerPostponed = r0
            r1.executePendingOperations()
        La:
            return
    }

    @androidx.annotation.Nullable
    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@androidx.annotation.NonNull androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.findPendingOperation(r0)
            if (r0 == 0) goto Lf
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r0.getLifecycleImpact()
            goto L10
        Lf:
            r0 = 0
        L10:
            androidx.fragment.app.Fragment r3 = r3.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r2.findRunningOperation(r3)
            if (r3 == 0) goto L25
            if (r0 == 0) goto L20
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            if (r0 != r1) goto L25
        L20:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r3.getLifecycleImpact()
            return r3
        L25:
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.ViewGroup getContainer() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mContainer
            return r0
    }

    void markPostponedState() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r6.mPendingOperations
            monitor-enter(r0)
            r6.updateFinalState()     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            r6.mIsContainerPostponed = r1     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L3a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L3f
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.Fragment r3 = r2.getFragment()     // Catch: java.lang.Throwable -> L3a
            android.view.View r3 = r3.mView     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r3)     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r2.getFinalState()     // Catch: java.lang.Throwable -> L3a
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L3a
            if (r4 != r5) goto L3c
            if (r3 == r5) goto L3c
            androidx.fragment.app.Fragment r1 = r2.getFragment()     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.isPostponed()     // Catch: java.lang.Throwable -> L3a
            r6.mIsContainerPostponed = r1     // Catch: java.lang.Throwable -> L3a
            goto L3f
        L3a:
            r1 = move-exception
            goto L41
        L3c:
            int r1 = r1 + (-1)
            goto L11
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    void updateOperationDirection(boolean r1) {
            r0 = this;
            r0.mOperationDirectionIsPop = r1
            return
    }
}
