package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }









    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {

        @androidx.annotation.Nullable
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation r1, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mLoadedAnim = r1
                r0.mIsPop = r3
                return
        }

        @androidx.annotation.Nullable
        androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(@androidx.annotation.NonNull android.content.Context r5) {
                r4 = this;
                boolean r0 = r4.mLoadedAnim
                if (r0 == 0) goto L7
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = r4.mAnimation
                return r5
            L7:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L1e
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                boolean r2 = r4.mIsPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r4.mAnimation = r5
                r4.mLoadedAnim = r3
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SpecialEffectsInfo {

        @androidx.annotation.NonNull
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;

        @androidx.annotation.NonNull
        private final androidx.core.os.CancellationSignal mSignal;

        SpecialEffectsInfo(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation r1, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r2) {
                r0 = this;
                r0.<init>()
                r0.mOperation = r1
                r0.mSignal = r2
                return
        }

        void completeSpecialEffect() {
                r2 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.mOperation
                androidx.core.os.CancellationSignal r1 = r2.mSignal
                r0.completeSpecialEffect(r1)
                return
        }

        @androidx.annotation.NonNull
        androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.mOperation
                return r0
        }

        @androidx.annotation.NonNull
        androidx.core.os.CancellationSignal getSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.mSignal
                return r0
        }

        boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.mOperation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.mOperation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L1b
                if (r1 == r2) goto L1b
                goto L1d
            L1b:
                r0 = 0
                return r0
            L1d:
                r0 = 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;

        @androidx.annotation.Nullable
        private final java.lang.Object mSharedElementTransition;

        @androidx.annotation.Nullable
        private final java.lang.Object mTransition;

        TransitionInfo(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation r2, @androidx.annotation.NonNull androidx.core.os.CancellationSignal r3, boolean r4, boolean r5) {
                r1 = this;
                r1.<init>(r2, r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r2.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r3 != r0) goto L36
                if (r4 == 0) goto L16
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReenterTransition()
                goto L1e
            L16:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getEnterTransition()
            L1e:
                r1.mTransition = r3
                if (r4 == 0) goto L2b
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowReturnTransitionOverlap()
                goto L33
            L2b:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowEnterTransitionOverlap()
            L33:
                r1.mOverlapAllowed = r3
                goto L4e
            L36:
                if (r4 == 0) goto L41
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReturnTransition()
                goto L49
            L41:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getExitTransition()
            L49:
                r1.mTransition = r3
                r3 = 1
                r1.mOverlapAllowed = r3
            L4e:
                if (r5 == 0) goto L68
                if (r4 == 0) goto L5d
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementReturnTransition()
                r1.mSharedElementTransition = r2
                return
            L5d:
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementEnterTransition()
                r1.mSharedElementTransition = r2
                return
            L68:
                r2 = 0
                r1.mSharedElementTransition = r2
                return
        }

        @androidx.annotation.Nullable
        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto Lf
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto Lf
                return r0
            Lf:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L1a
                boolean r1 = r0.canHandle(r4)
                if (r1 == 0) goto L1a
                return r0
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " for fragment "
                r1.append(r4)
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r3.getOperation()
                androidx.fragment.app.Fragment r4 = r4.getFragment()
                r1.append(r4)
                java.lang.String r4 = " is not a valid framework Transition or AndroidX Transition"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @androidx.annotation.Nullable
        androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r3 = this;
                java.lang.Object r0 = r3.mTransition
                androidx.fragment.app.FragmentTransitionImpl r0 = r3.getHandlingImpl(r0)
                java.lang.Object r1 = r3.mSharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r3.getHandlingImpl(r1)
                if (r0 == 0) goto L46
                if (r1 == 0) goto L46
                if (r0 != r1) goto L13
                goto L46
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                r1.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                r1.append(r2)
                java.lang.String r2 = " returned Transition "
                r1.append(r2)
                java.lang.Object r2 = r3.mTransition
                r1.append(r2)
                java.lang.String r2 = " which uses a different Transition  type than its shared element transition "
                r1.append(r2)
                java.lang.Object r2 = r3.mSharedElementTransition
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L46:
                if (r0 == 0) goto L49
                return r0
            L49:
                return r1
        }

        @androidx.annotation.Nullable
        public java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                return r0
        }

        @androidx.annotation.Nullable
        java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mTransition
                return r0
        }

        public boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.mOverlapAllowed
                return r0
        }
    }

    DefaultSpecialEffectsController(@androidx.annotation.NonNull android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void startAnimations(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r16, @androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r17, boolean r18, @androidx.annotation.NonNull java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> r19) {
            r15 = this;
            android.view.ViewGroup r2 = r15.getContainer()
            android.content.Context r7 = r2.getContext()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r16.iterator()
            r10 = 0
            r0 = 0
        L13:
            boolean r1 = r9.hasNext()
            r3 = 2
            if (r1 == 0) goto L98
            java.lang.Object r1 = r9.next()
            r6 = r1
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r6
            boolean r1 = r6.isVisibilityUnchanged()
            if (r1 == 0) goto L2d
            r6.completeSpecialEffect()
        L2a:
            r12 = r19
            goto L13
        L2d:
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r1 = r6.getAnimation(r7)
            if (r1 != 0) goto L37
            r6.completeSpecialEffect()
            goto L2a
        L37:
            android.animation.Animator r11 = r1.animator
            if (r11 != 0) goto L3f
            r8.add(r6)
            goto L2a
        L3f:
            androidx.fragment.app.SpecialEffectsController$Operation r5 = r6.getOperation()
            androidx.fragment.app.Fragment r1 = r5.getFragment()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r12 = r19
            java.lang.Object r13 = r12.get(r5)
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L62
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L5e
            java.util.Objects.toString(r1)
        L5e:
            r6.completeSpecialEffect()
            goto L13
        L62:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r5.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            r13 = 1
            if (r0 != r3) goto L6d
            r4 = 1
            goto L6e
        L6d:
            r4 = 0
        L6e:
            r14 = r17
            if (r4 == 0) goto L75
            r14.remove(r5)
        L75:
            android.view.View r3 = r1.mView
            r2.startViewTransition(r3)
            androidx.fragment.app.DefaultSpecialEffectsController$2 r0 = new androidx.fragment.app.DefaultSpecialEffectsController$2
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.addListener(r0)
            r11.setTarget(r3)
            r11.start()
            androidx.core.os.CancellationSignal r0 = r6.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$3 r3 = new androidx.fragment.app.DefaultSpecialEffectsController$3
            r3.<init>(r15, r11)
            r0.setOnCancelListener(r3)
            r0 = 1
            goto L13
        L98:
            java.util.Iterator r4 = r8.iterator()
        L9c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L111
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r5
            androidx.fragment.app.SpecialEffectsController$Operation r6 = r5.getOperation()
            androidx.fragment.app.Fragment r8 = r6.getFragment()
            if (r18 == 0) goto Lbf
            boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r6 == 0) goto Lbb
            java.util.Objects.toString(r8)
        Lbb:
            r5.completeSpecialEffect()
            goto L9c
        Lbf:
            if (r0 == 0) goto Lce
            boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r6 == 0) goto Lca
            java.util.Objects.toString(r8)
        Lca:
            r5.completeSpecialEffect()
            goto L9c
        Lce:
            android.view.View r8 = r8.mView
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r9 = r5.getAnimation(r7)
            java.lang.Object r9 = androidx.core.util.Preconditions.checkNotNull(r9)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r9 = (androidx.fragment.app.FragmentAnim.AnimationOrAnimator) r9
            android.view.animation.Animation r9 = r9.animation
            java.lang.Object r9 = androidx.core.util.Preconditions.checkNotNull(r9)
            android.view.animation.Animation r9 = (android.view.animation.Animation) r9
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r6.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r6 == r10) goto Lf1
            r8.startAnimation(r9)
            r5.completeSpecialEffect()
            goto L104
        Lf1:
            r2.startViewTransition(r8)
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r6 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            r6.<init>(r9, r2, r8)
            androidx.fragment.app.DefaultSpecialEffectsController$4 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$4
            r9.<init>(r15, r2, r8, r5)
            r6.setAnimationListener(r9)
            r8.startAnimation(r6)
        L104:
            androidx.core.os.CancellationSignal r6 = r5.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$5 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$5
            r9.<init>(r15, r8, r2, r5)
            r6.setOnCancelListener(r9)
            goto L9c
        L111:
            return
    }

    @androidx.annotation.NonNull
    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r28, @androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r29, boolean r30, @androidx.annotation.Nullable androidx.fragment.app.SpecialEffectsController.Operation r31, @androidx.annotation.Nullable androidx.fragment.app.SpecialEffectsController.Operation r32) {
            r27 = this;
            r1 = r27
            r4 = r30
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r0 = r28.iterator()
            r8 = 0
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
            boolean r3 = r2.isVisibilityUnchanged()
            if (r3 == 0) goto L21
            goto Le
        L21:
            androidx.fragment.app.FragmentTransitionImpl r3 = r2.getHandlingImpl()
            if (r8 != 0) goto L29
            r8 = r3
            goto Le
        L29:
            if (r3 == 0) goto Le
            if (r8 != r3) goto L2e
            goto Le
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r3.append(r4)
            androidx.fragment.app.SpecialEffectsController$Operation r4 = r2.getOperation()
            androidx.fragment.app.Fragment r4 = r4.getFragment()
            r3.append(r4)
            java.lang.String r4 = " returned Transition "
            r3.append(r4)
            java.lang.Object r2 = r2.getTransition()
            r3.append(r2)
            java.lang.String r2 = " which uses a different Transition  type than other Fragments."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L5e:
            if (r8 != 0) goto L7d
            java.util.Iterator r0 = r28.iterator()
        L64:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L491
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r2.getOperation()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r6.put(r3, r4)
            r2.completeSpecialEffect()
            goto L64
        L7d:
            android.view.View r9 = new android.view.View
            android.view.ViewGroup r0 = r1.getContainer()
            android.content.Context r0 = r0.getContext()
            r9.<init>(r0)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            androidx.collection.ArrayMap r12 = new androidx.collection.ArrayMap
            r12.<init>()
            java.util.Iterator r16 = r28.iterator()
            r0 = 0
            r14 = 0
            r17 = 0
        La6:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L2e0
            java.lang.Object r2 = r16.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
            boolean r5 = r2.hasSharedElementTransition()
            if (r5 == 0) goto L2c8
            if (r31 == 0) goto L2c8
            if (r32 == 0) goto L2c8
            java.lang.Object r0 = r2.getSharedElementTransition()
            java.lang.Object r0 = r8.cloneTransition(r0)
            java.lang.Object r0 = r8.wrapTransitionInSet(r0)
            androidx.fragment.app.Fragment r2 = r32.getFragment()
            java.util.ArrayList r2 = r2.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r5 = r31.getFragment()
            java.util.ArrayList r5 = r5.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r18 = r31.getFragment()
            java.util.ArrayList r7 = r18.getSharedElementTargetNames()
            r13 = 0
            r19 = 1
        Le3:
            int r3 = r7.size()
            if (r13 >= r3) goto L102
            java.lang.Object r3 = r7.get(r13)
            int r3 = r2.indexOf(r3)
            r20 = r0
            r0 = -1
            if (r3 == r0) goto Lfd
            java.lang.Object r0 = r5.get(r13)
            r2.set(r3, r0)
        Lfd:
            int r13 = r13 + 1
            r0 = r20
            goto Le3
        L102:
            r20 = r0
            androidx.fragment.app.Fragment r0 = r32.getFragment()
            java.util.ArrayList r7 = r0.getSharedElementTargetNames()
            if (r4 != 0) goto L11f
            androidx.fragment.app.Fragment r0 = r31.getFragment()
            androidx.core.app.SharedElementCallback r0 = r0.getExitTransitionCallback()
            androidx.fragment.app.Fragment r3 = r32.getFragment()
            androidx.core.app.SharedElementCallback r3 = r3.getEnterTransitionCallback()
            goto L12f
        L11f:
            androidx.fragment.app.Fragment r0 = r31.getFragment()
            androidx.core.app.SharedElementCallback r0 = r0.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r3 = r32.getFragment()
            androidx.core.app.SharedElementCallback r3 = r3.getExitTransitionCallback()
        L12f:
            int r5 = r2.size()
            r13 = 0
        L134:
            if (r13 >= r5) goto L152
            java.lang.Object r21 = r2.get(r13)
            r22 = r5
            r5 = r21
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r21 = r7.get(r13)
            r23 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            r12.put(r5, r13)
            int r13 = r23 + 1
            r5 = r22
            goto L134
        L152:
            androidx.collection.ArrayMap r13 = new androidx.collection.ArrayMap
            r13.<init>()
            androidx.fragment.app.Fragment r5 = r31.getFragment()
            android.view.View r5 = r5.mView
            r1.findNamedViews(r13, r5)
            r13.retainAll(r2)
            if (r0 == 0) goto L1a0
            r0.onMapSharedElements(r2, r13)
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L16e:
            if (r0 < 0) goto L1a7
            java.lang.Object r5 = r2.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r21 = r13.get(r5)
            android.view.View r21 = (android.view.View) r21
            if (r21 != 0) goto L184
            r12.remove(r5)
            r22 = r0
            goto L19d
        L184:
            r22 = r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r21)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L19d
            java.lang.Object r0 = r12.remove(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r21)
            r12.put(r5, r0)
        L19d:
            int r0 = r22 + (-1)
            goto L16e
        L1a0:
            java.util.Set r0 = r13.keySet()
            r12.retainAll(r0)
        L1a7:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            androidx.fragment.app.Fragment r0 = r32.getFragment()
            android.view.View r0 = r0.mView
            r1.findNamedViews(r5, r0)
            r5.retainAll(r7)
            java.util.Collection r0 = r12.values()
            r5.retainAll(r0)
            if (r3 == 0) goto L202
            r3.onMapSharedElements(r7, r5)
            int r0 = r7.size()
            int r0 = r0 + (-1)
        L1ca:
            if (r0 < 0) goto L205
            java.lang.Object r3 = r7.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r21 = r5.get(r3)
            android.view.View r21 = (android.view.View) r21
            if (r21 != 0) goto L1e6
            java.lang.String r3 = androidx.fragment.app.FragmentTransition.findKeyForValue(r12, r3)
            if (r3 == 0) goto L1e3
            r12.remove(r3)
        L1e3:
            r22 = r0
            goto L1ff
        L1e6:
            r22 = r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r21)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1ff
            java.lang.String r0 = androidx.fragment.app.FragmentTransition.findKeyForValue(r12, r3)
            if (r0 == 0) goto L1ff
            java.lang.String r3 = androidx.core.view.ViewCompat.getTransitionName(r21)
            r12.put(r0, r3)
        L1ff:
            int r0 = r22 + (-1)
            goto L1ca
        L202:
            androidx.fragment.app.FragmentTransition.retainValues(r12, r5)
        L205:
            java.util.Set r0 = r12.keySet()
            r1.retainMatchingViews(r13, r0)
            java.util.Collection r0 = r12.values()
            r1.retainMatchingViews(r5, r0)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L22d
            r11.clear()
            r15.clear()
            r3 = r31
            r2 = r32
            r5 = r9
            r7 = r10
            r10 = r11
            r19 = r12
            r9 = r15
            r0 = 0
            r4 = 0
            goto L2d6
        L22d:
            androidx.fragment.app.Fragment r0 = r32.getFragment()
            androidx.fragment.app.Fragment r3 = r31.getFragment()
            r1 = 1
            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r0, r3, r4, r13, r1)
            android.view.ViewGroup r0 = r27.getContainer()
            r3 = r0
            androidx.fragment.app.DefaultSpecialEffectsController$6 r0 = new androidx.fragment.app.DefaultSpecialEffectsController$6
            r1 = r27
            r19 = r12
            r21 = r14
            r12 = r20
            r22 = 1
            r20 = r2
            r14 = r3
            r3 = r31
            r2 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.core.view.OneShotPreDrawListener.add(r14, r0)
            java.util.Collection r0 = r13.values()
            r11.addAll(r0)
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L27a
            r0 = r20
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.get(r0)
            r14 = r0
            android.view.View r14 = (android.view.View) r14
            r8.setEpicenter(r12, r14)
            r21 = r14
            goto L27b
        L27a:
            r4 = 0
        L27b:
            java.util.Collection r0 = r5.values()
            r15.addAll(r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L2a4
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L2a4
            android.view.ViewGroup r5 = r1.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$7 r7 = new androidx.fragment.app.DefaultSpecialEffectsController$7
            r7.<init>(r1, r8, r0, r10)
            androidx.core.view.OneShotPreDrawListener.add(r5, r7)
            r17 = 1
        L2a4:
            r8.setSharedElementTargets(r12, r9, r11)
            r20 = r12
            r12 = 0
            r13 = 0
            r0 = r10
            r10 = 0
            r5 = r11
            r11 = 0
            r14 = r20
            r7 = r0
            r0 = r5
            r5 = r9
            r9 = r20
            r8.scheduleRemoveTargets(r9, r10, r11, r12, r13, r14, r15)
            r9 = r15
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r6.put(r3, r10)
            r6.put(r2, r10)
            r10 = r0
            r0 = r20
        L2c5:
            r14 = r21
            goto L2d6
        L2c8:
            r3 = r31
            r2 = r32
            r5 = r9
            r7 = r10
            r10 = r11
            r19 = r12
            r21 = r14
            r9 = r15
            r4 = 0
            goto L2c5
        L2d6:
            r4 = r30
            r15 = r9
            r11 = r10
            r12 = r19
            r9 = r5
            r10 = r7
            goto La6
        L2e0:
            r3 = r31
            r2 = r32
            r5 = r9
            r7 = r10
            r10 = r11
            r19 = r12
            r21 = r14
            r9 = r15
            r4 = 0
            r22 = 1
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r16 = r28.iterator()
            r12 = 0
            r13 = 0
        L2fa:
            boolean r14 = r16.hasNext()
            if (r14 == 0) goto L418
            java.lang.Object r14 = r16.next()
            r18 = r14
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r18 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r18
            boolean r14 = r18.isVisibilityUnchanged()
            if (r14 == 0) goto L31b
            androidx.fragment.app.SpecialEffectsController$Operation r14 = r18.getOperation()
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r6.put(r14, r15)
            r18.completeSpecialEffect()
            goto L2fa
        L31b:
            java.lang.Object r14 = r18.getTransition()
            java.lang.Object r14 = r8.cloneTransition(r14)
            androidx.fragment.app.SpecialEffectsController$Operation r15 = r18.getOperation()
            if (r0 == 0) goto L330
            if (r15 == r3) goto L32d
            if (r15 != r2) goto L330
        L32d:
            r20 = 1
            goto L332
        L330:
            r20 = 0
        L332:
            if (r14 != 0) goto L34c
            if (r20 != 0) goto L33e
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r6.put(r15, r14)
            r18.completeSpecialEffect()
        L33e:
            r20 = r5
            r26 = r10
            r4 = r11
            r5 = r21
            r11 = 0
            r10 = r29
            r21 = r9
            goto L408
        L34c:
            r23 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            androidx.fragment.app.Fragment r4 = r15.getFragment()
            android.view.View r4 = r4.mView
            r1.captureTransitioningViews(r11, r4)
            if (r20 == 0) goto L367
            if (r15 != r3) goto L364
            r11.removeAll(r10)
            goto L367
        L364:
            r11.removeAll(r9)
        L367:
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L381
            r8.addTarget(r14, r5)
            r20 = r5
            r26 = r10
            r2 = r12
            r3 = r13
            r12 = r15
            r5 = r21
            r4 = r23
            r10 = r29
            r21 = r9
            r9 = r14
            goto L3db
        L381:
            r8.addTargets(r14, r11)
            r4 = r9
            r9 = r14
            r14 = 0
            r20 = r15
            r15 = 0
            r24 = r12
            r12 = 0
            r25 = r13
            r13 = 0
            r26 = r10
            r10 = r9
            r30 = r20
            r2 = r24
            r3 = r25
            r20 = r5
            r5 = r21
            r21 = r4
            r4 = r23
            r8.scheduleRemoveTargets(r9, r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = r30.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r10 != r12) goto L3d7
            r10 = r29
            r12 = r30
            r10.remove(r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r11)
            androidx.fragment.app.Fragment r14 = r12.getFragment()
            android.view.View r14 = r14.mView
            r13.remove(r14)
            androidx.fragment.app.Fragment r14 = r12.getFragment()
            android.view.View r14 = r14.mView
            r8.scheduleHideFragmentView(r9, r14, r13)
            android.view.ViewGroup r13 = r1.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$8 r14 = new androidx.fragment.app.DefaultSpecialEffectsController$8
            r14.<init>(r1, r11)
            androidx.core.view.OneShotPreDrawListener.add(r13, r14)
            goto L3db
        L3d7:
            r10 = r29
            r12 = r30
        L3db:
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = r12.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r13 != r14) goto L3ec
            r4.addAll(r11)
            if (r17 == 0) goto L3ef
            r8.setEpicenter(r9, r7)
            goto L3ef
        L3ec:
            r8.setEpicenter(r9, r5)
        L3ef:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r6.put(r12, r11)
            boolean r11 = r18.isOverlapAllowed()
            if (r11 == 0) goto L402
            r11 = 0
            java.lang.Object r2 = r8.mergeTransitionsTogether(r2, r9, r11)
        L3ff:
            r12 = r2
            r13 = r3
            goto L408
        L402:
            r11 = 0
            java.lang.Object r3 = r8.mergeTransitionsTogether(r3, r9, r11)
            goto L3ff
        L408:
            r3 = r31
            r2 = r32
            r11 = r4
            r9 = r21
            r10 = r26
            r4 = 0
            r21 = r5
            r5 = r20
            goto L2fa
        L418:
            r21 = r9
            r26 = r10
            r4 = r11
            r2 = r12
            r3 = r13
            java.lang.Object r2 = r8.mergeTransitionsInSequence(r2, r3, r0)
            java.util.Iterator r3 = r28.iterator()
        L427:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L487
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r5
            boolean r7 = r5.isVisibilityUnchanged()
            if (r7 == 0) goto L43a
            goto L427
        L43a:
            java.lang.Object r7 = r5.getTransition()
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r5.getOperation()
            r10 = r31
            r11 = r32
            if (r0 == 0) goto L44e
            if (r9 == r10) goto L44c
            if (r9 != r11) goto L44e
        L44c:
            r13 = 1
            goto L44f
        L44e:
            r13 = 0
        L44f:
            if (r7 != 0) goto L453
            if (r13 == 0) goto L427
        L453:
            android.view.ViewGroup r7 = r1.getContainer()
            boolean r7 = androidx.core.view.ViewCompat.isLaidOut(r7)
            if (r7 != 0) goto L472
            r7 = 2
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)
            if (r7 == 0) goto L46e
            android.view.ViewGroup r7 = r1.getContainer()
            java.util.Objects.toString(r7)
            java.util.Objects.toString(r9)
        L46e:
            r5.completeSpecialEffect()
            goto L427
        L472:
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.getOperation()
            androidx.fragment.app.Fragment r7 = r7.getFragment()
            androidx.core.os.CancellationSignal r9 = r5.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$9 r12 = new androidx.fragment.app.DefaultSpecialEffectsController$9
            r12.<init>(r1, r5)
            r8.setListenerForTransitionEnd(r7, r2, r9, r12)
            goto L427
        L487:
            android.view.ViewGroup r3 = r1.getContainer()
            boolean r3 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r3 != 0) goto L492
        L491:
            return r6
        L492:
            r3 = 4
            androidx.fragment.app.FragmentTransition.setViewVisibility(r4, r3)
            r11 = r21
            java.util.ArrayList r12 = r8.prepareSetNameOverridesReordered(r11)
            android.view.ViewGroup r3 = r1.getContainer()
            r8.beginDelayedTransition(r3, r2)
            android.view.ViewGroup r9 = r1.getContainer()
            r13 = r19
            r10 = r26
            r8.setNameOverridesReordered(r9, r10, r11, r12, r13)
            r2 = 0
            androidx.fragment.app.FragmentTransition.setViewVisibility(r4, r2)
            r8.swapSharedElementTargets(r0, r10, r11)
            return r6
    }

    void applyContainerChanges(@androidx.annotation.NonNull androidx.fragment.app.SpecialEffectsController.Operation r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r2.getFragment()
            android.view.View r0 = r0.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r2.getFinalState()
            r2.applyState(r0)
            return
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
            if (r1 == 0) goto L17
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L37
            r5.add(r0)
            return
        L17:
            int r6 = r0.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r6) goto L37
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L2b
            r4.captureTransitioningViews(r5, r2)
        L2b:
            int r1 = r1 + 1
            goto L1c
        L2e:
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L37
            r5.add(r6)
        L37:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r11, boolean r12) {
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r8 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r2 = r2.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r2)
            int[] r3 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r1.getFinalState()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r8) goto L3c
            r4 = 2
            if (r3 == r4) goto L3c
            r4 = 3
            if (r3 == r4) goto L3c
            r4 = 4
            if (r3 == r4) goto L36
            goto L7
        L36:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r2 == r3) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r2 != r3) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r11.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.core.os.CancellationSignal r2 = new androidx.core.os.CancellationSignal
            r2.<init>()
            r1.markStartedSpecialEffect(r2)
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r5.<init>(r1, r2, r12)
            r0.add(r5)
            androidx.core.os.CancellationSignal r2 = new androidx.core.os.CancellationSignal
            r2.<init>()
            r1.markStartedSpecialEffect(r2)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r9 = 0
            if (r12 == 0) goto L84
            if (r1 != r6) goto L87
        L82:
            r9 = 1
            goto L87
        L84:
            if (r1 != r7) goto L87
            goto L82
        L87:
            r5.<init>(r1, r2, r12, r9)
            r3.add(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$1 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$1
            r2.<init>(r10, r4, r1)
            r1.addCompletionListener(r2)
            goto L57
        L96:
            r2 = r10
            r5 = r12
            java.util.Map r11 = r2.startTransitions(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.startAnimations(r0, r4, r12, r11)
            java.util.Iterator r11 = r4.iterator()
        La9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.SpecialEffectsController$Operation r12 = (androidx.fragment.app.SpecialEffectsController.Operation) r12
            r10.applyContainerChanges(r12)
            goto La9
        Lb9:
            r4.clear()
            return
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r0 == 0) goto L9
            r5.put(r0, r6)
        L9:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L26
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L23
            r4.findNamedViews(r5, r2)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return
    }

    void retainMatchingViews(@androidx.annotation.NonNull androidx.collection.ArrayMap<java.lang.String, android.view.View> r2, @androidx.annotation.NonNull java.util.Collection<java.lang.String> r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L8
            r2.remove()
            goto L8
        L28:
            return
    }
}
