package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FragmentAnim {




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.Animator animator;

        AnimationOrAnimator(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.animation = r0
                r1.animator = r2
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animator cannot be null"
                r2.<init>(r0)
                throw r2
        }

        AnimationOrAnimator(android.view.animation.Animation r2) {
                r1 = this;
                r1.<init>()
                r1.animation = r2
                r0 = 0
                r1.animator = r0
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animation cannot be null"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(@androidx.annotation.NonNull android.view.animation.Animation r2, @androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.mAnimating = r0
                r1.mParent = r3
                r1.mChild = r4
                r1.addAnimation(r2)
                r3.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, @androidx.annotation.NonNull android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, @androidx.annotation.NonNull android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.mEnded
                if (r0 != 0) goto L11
                boolean r0 = r2.mAnimating
                if (r0 == 0) goto L11
                r0 = 0
                r2.mAnimating = r0
                android.view.ViewGroup r0 = r2.mParent
                r0.post(r2)
                return
            L11:
                android.view.ViewGroup r0 = r2.mParent
                android.view.View r1 = r2.mChild
                r0.endViewTransition(r1)
                r0 = 1
                r2.mTransitionEnded = r0
                return
        }
    }

    private FragmentAnim() {
            r0 = this;
            r0.<init>()
            return
    }

    static void animateRemoveFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r6, @androidx.annotation.NonNull androidx.fragment.app.FragmentAnim.AnimationOrAnimator r7, @androidx.annotation.NonNull androidx.fragment.app.FragmentTransition.Callback r8) {
            android.view.View r2 = r6.mView
            android.view.ViewGroup r1 = r6.mContainer
            r1.startViewTransition(r2)
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            androidx.fragment.app.FragmentAnim$1 r0 = new androidx.fragment.app.FragmentAnim$1
            r0.<init>(r6)
            r5.setOnCancelListener(r0)
            r8.onStart(r6, r5)
            android.view.animation.Animation r0 = r7.animation
            if (r0 == 0) goto L35
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r0 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            android.view.animation.Animation r7 = r7.animation
            r0.<init>(r7, r1, r2)
            android.view.View r7 = r6.mView
            r6.setAnimatingAway(r7)
            androidx.fragment.app.FragmentAnim$2 r7 = new androidx.fragment.app.FragmentAnim$2
            r7.<init>(r1, r6, r8, r5)
            r0.setAnimationListener(r7)
            android.view.View r6 = r6.mView
            r6.startAnimation(r0)
            return
        L35:
            android.animation.Animator r7 = r7.animator
            r6.setAnimator(r7)
            androidx.fragment.app.FragmentAnim$3 r0 = new androidx.fragment.app.FragmentAnim$3
            r3 = r6
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.addListener(r0)
            android.view.View r6 = r3.mView
            r7.setTarget(r6)
            r7.start()
            return
    }

    private static int getNextAnim(androidx.fragment.app.Fragment r0, boolean r1, boolean r2) {
            if (r2 == 0) goto Le
            if (r1 == 0) goto L9
            int r0 = r0.getPopEnterAnim()
            return r0
        L9:
            int r0 = r0.getPopExitAnim()
            return r0
        Le:
            if (r1 == 0) goto L15
            int r0 = r0.getEnterAnim()
            return r0
        L15:
            int r0 = r0.getExitAnim()
            return r0
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.fragment.app.Fragment r5, boolean r6, boolean r7) {
            int r0 = r5.getNextTransition()
            int r7 = getNextAnim(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L1e
            int r3 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L1e
            android.view.ViewGroup r1 = r5.mContainer
            r1.setTag(r3, r2)
        L1e:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L29
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L29
            return r2
        L29:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L35
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r4 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r4.<init>(r1)
            return r4
        L35:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L41
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r4 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r4.<init>(r5)
            return r4
        L41:
            if (r7 != 0) goto L49
            if (r0 == 0) goto L49
            int r7 = transitToAnimResourceId(r0, r6)
        L49:
            if (r7 == 0) goto L85
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L69
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            if (r6 == 0) goto L85
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            return r0
        L67:
            r4 = move-exception
            throw r4
        L69:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L75
            if (r6 == 0) goto L85
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L75
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L75
            return r0
        L75:
            r6 = move-exception
            if (r5 != 0) goto L84
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L85
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r5.<init>(r4)
            return r5
        L84:
            throw r6
        L85:
            return r2
    }

    @androidx.annotation.AnimRes
    private static int transitToAnimResourceId(int r1, boolean r2) {
            r0 = 4097(0x1001, float:5.741E-42)
            if (r1 == r0) goto L1e
            r0 = 4099(0x1003, float:5.744E-42)
            if (r1 == r0) goto L16
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r0) goto Le
            r1 = -1
            return r1
        Le:
            if (r2 == 0) goto L13
            int r1 = androidx.fragment.R.animator.fragment_close_enter
            return r1
        L13:
            int r1 = androidx.fragment.R.animator.fragment_close_exit
            return r1
        L16:
            if (r2 == 0) goto L1b
            int r1 = androidx.fragment.R.animator.fragment_fade_enter
            return r1
        L1b:
            int r1 = androidx.fragment.R.animator.fragment_fade_exit
            return r1
        L1e:
            if (r2 == 0) goto L23
            int r1 = androidx.fragment.R.animator.fragment_open_enter
            return r1
        L23:
            int r1 = androidx.fragment.R.animator.fragment_open_exit
            return r1
    }
}
