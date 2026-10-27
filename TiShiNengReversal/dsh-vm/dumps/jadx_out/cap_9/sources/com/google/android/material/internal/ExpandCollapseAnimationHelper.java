package com.google.android.material.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ExpandCollapseAnimationHelper {

    @androidx.annotation.Nullable
    private android.animation.ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    private final android.view.View collapsedView;
    private int collapsedViewOffsetY;
    private long duration;
    private final java.util.List<android.view.View> endAnchoredViews;
    private final android.view.View expandedView;
    private int expandedViewOffsetY;
    private final java.util.List<android.animation.AnimatorListenerAdapter> listeners;



    public ExpandCollapseAnimationHelper(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.collapsedView = r1
            r0.expandedView = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.listeners = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.endAnchoredViews = r1
            return
    }

    public static /* synthetic */ void a(com.google.android.material.internal.ExpandCollapseAnimationHelper r0, android.graphics.Rect r1, android.animation.ValueAnimator r2) {
            android.view.View r0 = r0.expandedView
            com.google.android.material.internal.ViewUtils.setBoundsFromRect(r0, r1)
            return
    }

    static /* synthetic */ android.view.View access$000(com.google.android.material.internal.ExpandCollapseAnimationHelper r0) {
            android.view.View r0 = r0.expandedView
            return r0
    }

    private void addListeners(android.animation.Animator r2, java.util.List<android.animation.AnimatorListenerAdapter> r3) {
            r1 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.next()
            android.animation.AnimatorListenerAdapter r0 = (android.animation.AnimatorListenerAdapter) r0
            r2.addListener(r0)
            goto L4
        L14:
            return
    }

    private android.animation.AnimatorSet getAnimatorSet(boolean r6) {
            r5 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.animation.Animator r1 = r5.getExpandCollapseAnimator(r6)
            android.animation.Animator r2 = r5.getExpandedViewChildrenAlphaAnimator(r6)
            android.animation.Animator r6 = r5.getEndAnchoredViewsTranslateAnimator(r6)
            r3 = 3
            android.animation.Animator[] r3 = new android.animation.Animator[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r1 = 2
            r3[r1] = r6
            r0.playTogether(r3)
            return r0
    }

    private android.animation.Animator getEndAnchoredViewsTranslateAnimator(boolean r4) {
            r3 = this;
            android.view.View r0 = r3.expandedView
            int r0 = r0.getLeft()
            android.view.View r1 = r3.collapsedView
            int r1 = r1.getLeft()
            int r0 = r0 - r1
            android.view.View r1 = r3.collapsedView
            int r1 = r1.getRight()
            android.view.View r2 = r3.expandedView
            int r2 = r2.getRight()
            int r1 = r1 - r2
            int r0 = r0 + r1
            float r0 = (float) r0
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 0
            r2 = 1
            r1[r2] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
            java.util.List<android.view.View> r1 = r3.endAnchoredViews
            com.google.android.material.internal.MultiViewUpdateListener r1 = com.google.android.material.internal.MultiViewUpdateListener.translationXListener(r1)
            r0.addUpdateListener(r1)
            long r1 = r3.duration
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r4 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r4, r1)
            r0.setInterpolator(r4)
            return r0
    }

    private android.animation.Animator getExpandCollapseAnimator(boolean r7) {
            r6 = this;
            android.view.View r0 = r6.collapsedView
            int r1 = r6.collapsedViewOffsetY
            android.graphics.Rect r0 = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(r0, r1)
            android.view.View r1 = r6.expandedView
            int r2 = r6.expandedViewOffsetY
            android.graphics.Rect r1 = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(r1, r2)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r0)
            com.google.android.material.internal.RectEvaluator r3 = new com.google.android.material.internal.RectEvaluator
            r3.<init>(r2)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r3, r4)
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r6, r2)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r6.additionalUpdateListener
            if (r1 == 0) goto L36
            r0.addUpdateListener(r1)
        L36:
            long r1 = r6.duration
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r7 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r7, r1)
            r0.setInterpolator(r7)
            return r0
    }

    private android.animation.Animator getExpandedViewChildrenAlphaAnimator(boolean r5) {
            r4 = this;
            android.view.View r0 = r4.expandedView
            java.util.List r0 = com.google.android.material.internal.ViewUtils.getChildren(r0)
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0026: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            com.google.android.material.internal.MultiViewUpdateListener r0 = com.google.android.material.internal.MultiViewUpdateListener.alphaListener(r0)
            r1.addUpdateListener(r0)
            long r2 = r4.duration
            r1.setDuration(r2)
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r5 = com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(r5, r0)
            r1.setInterpolator(r5)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper addEndAnchoredViews(@androidx.annotation.NonNull java.util.Collection<android.view.View> r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.endAnchoredViews
            r0.addAll(r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper addEndAnchoredViews(@androidx.annotation.NonNull android.view.View... r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.endAnchoredViews
            java.util.Collections.addAll(r0, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper addListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            java.util.List<android.animation.AnimatorListenerAdapter> r0 = r1.listeners
            r0.add(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public android.animation.Animator getCollapseAnimator() {
            r2 = this;
            r0 = 0
            android.animation.AnimatorSet r0 = r2.getAnimatorSet(r0)
            com.google.android.material.internal.ExpandCollapseAnimationHelper$2 r1 = new com.google.android.material.internal.ExpandCollapseAnimationHelper$2
            r1.<init>(r2)
            r0.addListener(r1)
            java.util.List<android.animation.AnimatorListenerAdapter> r1 = r2.listeners
            r2.addListeners(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public android.animation.Animator getExpandAnimator() {
            r2 = this;
            r0 = 1
            android.animation.AnimatorSet r0 = r2.getAnimatorSet(r0)
            com.google.android.material.internal.ExpandCollapseAnimationHelper$1 r1 = new com.google.android.material.internal.ExpandCollapseAnimationHelper$1
            r1.<init>(r2)
            r0.addListener(r1)
            java.util.List<android.animation.AnimatorListenerAdapter> r1 = r2.listeners
            r2.addListeners(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setAdditionalUpdateListener(@androidx.annotation.Nullable android.animation.ValueAnimator.AnimatorUpdateListener r1) {
            r0 = this;
            r0.additionalUpdateListener = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int r1) {
            r0 = this;
            r0.collapsedViewOffsetY = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setDuration(long r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.ExpandCollapseAnimationHelper setExpandedViewOffsetY(int r1) {
            r0 = this;
            r0.expandedViewOffsetY = r1
            return r0
    }
}
