package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ScrollToTopBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<android.view.View> {



    public ScrollToTopBehavior(android.content.Context r1, android.util.AttributeSet r2) {
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
            com.bxkj.student.common.view.ScrollToTopBehavior$2 r1 = new com.bxkj.student.common.view.ScrollToTopBehavior$2
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
            com.bxkj.student.common.view.ScrollToTopBehavior$1 r1 = new com.bxkj.student.common.view.ScrollToTopBehavior$1
            r1.<init>(r3, r4)
            r0.setListener(r1)
            return
    }

    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            super.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
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

    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6) {
            r1 = this;
            r0 = 2
            if (r6 == r0) goto Lc
            boolean r2 = super.onStartNestedScroll(r2, r3, r4, r5, r6)
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
