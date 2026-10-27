package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ScrollAwareFABBehavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ android.view.View a;
        final /* synthetic */ com.bxkj.base.util.ScrollAwareFABBehavior b;

        a(com.bxkj.base.util.ScrollAwareFABBehavior r1, android.view.View r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.a
                r0 = 0
                r2.setVisibility(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.animation.AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ android.view.View b;
        final /* synthetic */ com.bxkj.base.util.ScrollAwareFABBehavior c;

        b(com.bxkj.base.util.ScrollAwareFABBehavior r1, android.view.View r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.a
                if (r2 != 0) goto La
                android.view.View r2 = r1.b
                r0 = 4
                r2.setVisibility(r0)
            La:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.b
                r0 = 0
                r2.setVisibility(r0)
                r1.a = r0
                return
        }
    }

    public ScrollAwareFABBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>()
            return
    }

    private void hide(android.view.View r4) {
            r3 = this;
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            androidx.interpolator.view.animation.FastOutLinearInInterpolator r1 = new androidx.interpolator.view.animation.FastOutLinearInInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            com.bxkj.base.util.ScrollAwareFABBehavior$b r1 = new com.bxkj.base.util.ScrollAwareFABBehavior$b
            r1.<init>(r3, r4)
            r0.setListener(r1)
            return
    }

    private void show(android.view.View r4) {
            r3 = this;
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            r0 = 0
            r4.setAlpha(r0)
            r4.setScaleY(r0)
            r4.setScaleX(r0)
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            androidx.interpolator.view.animation.LinearOutSlowInInterpolator r1 = new androidx.interpolator.view.animation.LinearOutSlowInInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            com.bxkj.base.util.ScrollAwareFABBehavior$a r1 = new com.bxkj.base.util.ScrollAwareFABBehavior$a
            r1.<init>(r3, r4)
            r0.setListener(r1)
            return
    }

    public /* bridge */ /* synthetic */ void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.floatingactionbutton.FloatingActionButton r2, android.view.View r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            super/*androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior*/.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            r1 = r0
            r3 = 10
            if (r5 <= r3) goto L12
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L12
            r0.hide(r2)
            return
        L12:
            r3 = -10
            if (r5 >= r3) goto L1f
            int r3 = r2.getVisibility()
            if (r3 == 0) goto L1f
            r0.show(r2)
        L1f:
            return
    }

    public /* bridge */ /* synthetic */ boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, android.view.View r4, int r5) {
            r0 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5)
            return r1
    }

    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.floatingactionbutton.FloatingActionButton r3, android.view.View r4, android.view.View r5, int r6) {
            r1 = this;
            r0 = 2
            if (r6 == r0) goto Lc
            boolean r2 = super/*androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior*/.onStartNestedScroll(r2, r3, r4, r5, r6)
            if (r2 == 0) goto La
            goto Lc
        La:
            r2 = 0
            return r2
        Lc:
            r2 = 1
            return r2
    }
}
