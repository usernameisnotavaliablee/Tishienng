package com.google.android.material.transformation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF1;
    private final android.graphics.RectF tmpRectF2;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class FabTransformationSpec {
        public com.google.android.material.animation.Positioning positioning;

        @androidx.annotation.Nullable
        public com.google.android.material.animation.MotionSpec timings;

        protected FabTransformationSpec() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public FabTransformationBehavior() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.tmpRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.tmpRectF1 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.tmpRectF2 = r0
            r0 = 2
            int[] r0 = new int[r0]
            r1.tmpArray = r0
            return
    }

    public FabTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF2 = r1
            r1 = 2
            int[] r1 = new int[r1]
            r0.tmpArray = r1
            return
    }

    @androidx.annotation.Nullable
    private android.view.ViewGroup calculateChildContentContainer(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            int r0 = com.google.android.material.R.id.mtrl_child_content_container
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto Ld
            android.view.ViewGroup r2 = r1.toViewGroupOrNull(r0)
            return r2
        Ld:
            boolean r0 = r2 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r0 != 0) goto L1b
            boolean r0 = r2 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r0 == 0) goto L16
            goto L1b
        L16:
            android.view.ViewGroup r2 = r1.toViewGroupOrNull(r2)
            return r2
        L1b:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            android.view.ViewGroup r2 = r1.toViewGroupOrNull(r2)
            return r2
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r2, @androidx.annotation.NonNull com.google.android.material.animation.MotionTiming r3, @androidx.annotation.NonNull com.google.android.material.animation.MotionTiming r4, float r5, float r6, float r7, float r8, @androidx.annotation.NonNull android.graphics.RectF r9) {
            r0 = this;
            float r3 = r0.calculateValueOfAnimationAtEndOfExpansion(r2, r3, r5, r7)
            float r2 = r0.calculateValueOfAnimationAtEndOfExpansion(r2, r4, r6, r8)
            android.graphics.Rect r4 = r0.tmpRect
            r1.getWindowVisibleDisplayFrame(r4)
            android.graphics.RectF r5 = r0.tmpRectF1
            r5.set(r4)
            android.graphics.RectF r4 = r0.tmpRectF2
            r0.calculateWindowBounds(r1, r4)
            r4.offset(r3, r2)
            r4.intersect(r5)
            r9.set(r4)
            return
    }

    private void calculateDependencyWindowBounds(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.RectF r3) {
            r1 = this;
            r1.calculateWindowBounds(r2, r3)
            float r2 = r1.dependencyOriginalTranslationX
            float r0 = r1.dependencyOriginalTranslationY
            r3.offset(r2, r0)
            return
    }

    @androidx.annotation.NonNull
    private android.util.Pair<com.google.android.material.animation.MotionTiming, com.google.android.material.animation.MotionTiming> calculateMotionTiming(float r2, float r3, boolean r4, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r5) {
            r1 = this;
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L36
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L36
        La:
            if (r4 == 0) goto L10
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L14
        L10:
            if (r4 != 0) goto L25
            if (r2 <= 0) goto L25
        L14:
            com.google.android.material.animation.MotionSpec r2 = r5.timings
            java.lang.String r3 = "translationXCurveUpwards"
            com.google.android.material.animation.MotionTiming r2 = r2.getTiming(r3)
            com.google.android.material.animation.MotionSpec r3 = r5.timings
            java.lang.String r4 = "translationYCurveUpwards"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            goto L46
        L25:
            com.google.android.material.animation.MotionSpec r2 = r5.timings
            java.lang.String r3 = "translationXCurveDownwards"
            com.google.android.material.animation.MotionTiming r2 = r2.getTiming(r3)
            com.google.android.material.animation.MotionSpec r3 = r5.timings
            java.lang.String r4 = "translationYCurveDownwards"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            goto L46
        L36:
            com.google.android.material.animation.MotionSpec r2 = r5.timings
            java.lang.String r3 = "translationXLinear"
            com.google.android.material.animation.MotionTiming r2 = r2.getTiming(r3)
            com.google.android.material.animation.MotionSpec r3 = r5.timings
            java.lang.String r4 = "translationYLinear"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
        L46:
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r2, r3)
            return r4
    }

    private float calculateRevealCenterX(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            float r3 = r2.calculateTranslationX(r3, r4, r5)
            float r3 = -r3
            r4 = 0
            r1.offset(r3, r4)
            float r3 = r0.centerX()
            float r4 = r1.left
            float r3 = r3 - r4
            return r3
    }

    private float calculateRevealCenterY(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            float r3 = r2.calculateTranslationY(r3, r4, r5)
            r4 = 0
            float r3 = -r3
            r1.offset(r4, r3)
            float r3 = r0.centerY()
            float r4 = r1.top
            float r3 = r3 - r4
            return r3
    }

    private float calculateTranslationX(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            int r3 = r5.gravity
            r3 = r3 & 7
            r4 = 1
            if (r3 == r4) goto L24
            r4 = 3
            if (r3 == r4) goto L1f
            r4 = 5
            if (r3 == r4) goto L19
            r3 = 0
            goto L2d
        L19:
            float r3 = r1.right
            float r4 = r0.right
        L1d:
            float r3 = r3 - r4
            goto L2d
        L1f:
            float r3 = r1.left
            float r4 = r0.left
            goto L1d
        L24:
            float r3 = r1.centerX()
            float r4 = r0.centerX()
            goto L1d
        L2d:
            float r4 = r5.xAdjustment
            float r3 = r3 + r4
            return r3
    }

    private float calculateTranslationY(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            int r3 = r5.gravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 16
            if (r3 == r4) goto L27
            r4 = 48
            if (r3 == r4) goto L22
            r4 = 80
            if (r3 == r4) goto L1c
            r3 = 0
            goto L30
        L1c:
            float r3 = r1.bottom
            float r4 = r0.bottom
        L20:
            float r3 = r3 - r4
            goto L30
        L22:
            float r3 = r1.top
            float r4 = r0.top
            goto L20
        L27:
            float r3 = r1.centerY()
            float r4 = r0.centerY()
            goto L20
        L30:
            float r4 = r5.yAdjustment
            float r3 = r3 + r4
            return r3
    }

    private float calculateValueOfAnimationAtEndOfExpansion(@androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r9, @androidx.annotation.NonNull com.google.android.material.animation.MotionTiming r10, float r11, float r12) {
            r8 = this;
            long r0 = r10.getDelay()
            long r2 = r10.getDuration()
            com.google.android.material.animation.MotionSpec r9 = r9.timings
            java.lang.String r4 = "expansion"
            com.google.android.material.animation.MotionTiming r9 = r9.getTiming(r4)
            long r4 = r9.getDelay()
            long r6 = r9.getDuration()
            long r4 = r4 + r6
            r6 = 17
            long r4 = r4 + r6
            long r4 = r4 - r0
            float r9 = (float) r4
            float r0 = (float) r2
            float r9 = r9 / r0
            android.animation.TimeInterpolator r10 = r10.getInterpolator()
            float r9 = r10.getInterpolation(r9)
            float r9 = com.google.android.material.animation.AnimationUtils.lerp(r11, r12, r9)
            return r9
    }

    private void calculateWindowBounds(@androidx.annotation.NonNull android.view.View r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r1 = r4.getHeight()
            float r1 = (float) r1
            r2 = 0
            r5.set(r2, r2, r0, r1)
            int[] r0 = r3.tmpArray
            r4.getLocationInWindow(r0)
            r1 = 0
            r1 = r0[r1]
            float r1 = (float) r1
            r2 = 1
            r0 = r0[r2]
            float r0 = (float) r0
            r5.offsetTo(r1, r0)
            float r0 = r4.getTranslationX()
            float r0 = -r0
            int r0 = (int) r0
            float r0 = (float) r0
            float r4 = r4.getTranslationY()
            float r4 = -r4
            int r4 = (int) r4
            float r4 = (float) r4
            r5.offset(r0, r4)
            return
    }

    private void createChildrenFadeAnimation(android.view.View r2, android.view.View r3, boolean r4, boolean r5, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r6, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r1 = this;
            boolean r2 = r3 instanceof android.view.ViewGroup
            if (r2 != 0) goto L5
            goto L14
        L5:
            boolean r2 = r3 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r2 == 0) goto Le
            int r2 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r2 != 0) goto Le
            goto L14
        Le:
            android.view.ViewGroup r2 = r1.calculateChildContentContainer(r3)
            if (r2 != 0) goto L15
        L14:
            return
        L15:
            r3 = 0
            r8 = 1
            r0 = 0
            if (r4 == 0) goto L32
            if (r5 != 0) goto L25
            android.util.Property<android.view.ViewGroup, java.lang.Float> r4 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r4.set(r2, r5)
        L25:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r4 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            float[] r5 = new float[r8]
            r8 = 1065353216(0x3f800000, float:1.0)
            r5[r3] = r8
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r5)
            goto L3c
        L32:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r4 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            float[] r5 = new float[r8]
            r5[r3] = r0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r5)
        L3c:
            com.google.android.material.animation.MotionSpec r3 = r6.timings
            java.lang.String r4 = "contentFade"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            r3.apply(r2)
            r7.add(r2)
            return
    }

    private void createColorAnimation(@androidx.annotation.NonNull android.view.View r1, android.view.View r2, boolean r3, boolean r4, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r5, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r6, java.util.List<android.animation.Animator.AnimatorListener> r7) {
            r0 = this;
            boolean r7 = r2 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r7 != 0) goto L5
            return
        L5:
            com.google.android.material.circularreveal.CircularRevealWidget r2 = (com.google.android.material.circularreveal.CircularRevealWidget) r2
            int r1 = r0.getBackgroundTint(r1)
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            r7 = r7 & r1
            if (r3 == 0) goto L21
            if (r4 != 0) goto L16
            r2.setCircularRevealScrimColor(r1)
        L16:
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> r1 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR
            int[] r3 = new int[]{r7}
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r2, r1, r3)
            goto L2b
        L21:
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> r3 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR
            int[] r1 = new int[]{r1}
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r2, r3, r1)
        L2b:
            com.google.android.material.animation.ArgbEvaluatorCompat r2 = com.google.android.material.animation.ArgbEvaluatorCompat.getInstance()
            r1.setEvaluator(r2)
            com.google.android.material.animation.MotionSpec r2 = r5.timings
            java.lang.String r3 = "color"
            com.google.android.material.animation.MotionTiming r2 = r2.getTiming(r3)
            r2.apply(r1)
            r6.add(r1)
            return
    }

    private void createDependencyTranslationAnimation(@androidx.annotation.NonNull android.view.View r7, @androidx.annotation.NonNull android.view.View r8, boolean r9, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r10, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r11) {
            r6 = this;
            com.google.android.material.animation.Positioning r0 = r10.positioning
            float r0 = r6.calculateTranslationX(r7, r8, r0)
            com.google.android.material.animation.Positioning r1 = r10.positioning
            float r8 = r6.calculateTranslationY(r7, r8, r1)
            android.util.Pair r10 = r6.calculateMotionTiming(r0, r8, r9, r10)
            java.lang.Object r1 = r10.first
            com.google.android.material.animation.MotionTiming r1 = (com.google.android.material.animation.MotionTiming) r1
            java.lang.Object r10 = r10.second
            com.google.android.material.animation.MotionTiming r10 = (com.google.android.material.animation.MotionTiming) r10
            android.util.Property r2 = android.view.View.TRANSLATION_X
            if (r9 == 0) goto L1d
            goto L1f
        L1d:
            float r0 = r6.dependencyOriginalTranslationX
        L1f:
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r2, r4)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            if (r9 == 0) goto L2e
            goto L30
        L2e:
            float r8 = r6.dependencyOriginalTranslationY
        L30:
            float[] r9 = new float[r3]
            r9[r5] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r2, r9)
            r1.apply(r0)
            r10.apply(r7)
            r11.add(r0)
            r11.add(r7)
            return
    }

    @android.annotation.TargetApi(21)
    private void createElevationAnimation(android.view.View r2, @androidx.annotation.NonNull android.view.View r3, boolean r4, boolean r5, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r6, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r1 = this;
            float r8 = androidx.core.view.ViewCompat.getElevation(r3)
            float r2 = androidx.core.view.ViewCompat.getElevation(r2)
            float r8 = r8 - r2
            r2 = 0
            r0 = 1
            if (r4 == 0) goto L1f
            if (r5 != 0) goto L13
            float r4 = -r8
            r3.setTranslationZ(r4)
        L13:
            android.util.Property r4 = android.view.View.TRANSLATION_Z
            float[] r5 = new float[r0]
            r8 = 0
            r5[r2] = r8
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r4, r5)
            goto L2a
        L1f:
            android.util.Property r4 = android.view.View.TRANSLATION_Z
            float r5 = -r8
            float[] r8 = new float[r0]
            r8[r2] = r5
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r4, r8)
        L2a:
            com.google.android.material.animation.MotionSpec r3 = r6.timings
            java.lang.String r4 = "elevation"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            r3.apply(r2)
            r7.add(r2)
            return
    }

    private void createExpansionAnimation(@androidx.annotation.NonNull android.view.View r16, android.view.View r17, boolean r18, boolean r19, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r20, float r21, float r22, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r23, @androidx.annotation.NonNull java.util.List<android.animation.Animator.AnimatorListener> r24) {
            r15 = this;
            r0 = r16
            r1 = r17
            r8 = r20
            boolean r2 = r1 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r2 != 0) goto Lb
            return
        Lb:
            r12 = r1
            com.google.android.material.circularreveal.CircularRevealWidget r12 = (com.google.android.material.circularreveal.CircularRevealWidget) r12
            com.google.android.material.animation.Positioning r2 = r8.positioning
            float r3 = r15.calculateRevealCenterX(r0, r1, r2)
            com.google.android.material.animation.Positioning r2 = r8.positioning
            float r4 = r15.calculateRevealCenterY(r0, r1, r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            android.graphics.Rect r2 = r15.tmpRect
            r0.getContentRect(r2)
            android.graphics.Rect r0 = r15.tmpRect
            int r0 = r0.width()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r10 = r0 / r2
            com.google.android.material.animation.MotionSpec r0 = r8.timings
            java.lang.String r2 = "expansion"
            com.google.android.material.animation.MotionTiming r13 = r0.getTiming(r2)
            if (r18 == 0) goto L6e
            if (r19 != 0) goto L40
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r0.<init>(r3, r4, r10)
            r12.setRevealInfo(r0)
        L40:
            if (r19 == 0) goto L48
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r12.getRevealInfo()
            float r10 = r0.radius
        L48:
            r5 = 0
            r6 = 0
            r7 = r21
            r8 = r22
            float r0 = com.google.android.material.math.MathUtils.distanceToFurthestCorner(r3, r4, r5, r6, r7, r8)
            android.animation.Animator r8 = com.google.android.material.circularreveal.CircularRevealCompat.createCircularReveal(r12, r3, r4, r0)
            com.google.android.material.transformation.FabTransformationBehavior$4 r0 = new com.google.android.material.transformation.FabTransformationBehavior$4
            r0.<init>(r15, r12)
            r8.addListener(r0)
            long r5 = r13.getDelay()
            int r0 = (int) r3
            r2 = r5
            int r5 = (int) r4
            r7 = r23
            r4 = r0
            r6 = r10
            r0 = r15
            r0.createPreFillRadialExpansion(r1, r2, r4, r5, r6, r7)
            goto La2
        L6e:
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r12.getRevealInfo()
            float r6 = r0.radius
            android.animation.Animator r14 = com.google.android.material.circularreveal.CircularRevealCompat.createCircularReveal(r12, r3, r4, r10)
            long r0 = r13.getDelay()
            int r2 = (int) r3
            int r9 = (int) r4
            r7 = r23
            r4 = r2
            r5 = r9
            r2 = r0
            r0 = r15
            r1 = r17
            r0.createPreFillRadialExpansion(r1, r2, r4, r5, r6, r7)
            long r2 = r13.getDelay()
            r0 = r4
            long r4 = r13.getDuration()
            com.google.android.material.animation.MotionSpec r1 = r8.timings
            long r6 = r1.getTotalDuration()
            r1 = r17
            r11 = r23
            r8 = r0
            r0 = r15
            r0.createPostFillRadialExpansion(r1, r2, r4, r6, r8, r9, r10, r11)
            r8 = r14
        La2:
            r13.apply(r8)
            r7 = r23
            r7.add(r8)
            android.animation.Animator$AnimatorListener r0 = com.google.android.material.circularreveal.CircularRevealCompat.createCircularRevealListener(r12)
            r1 = r24
            r1.add(r0)
            return
    }

    private void createIconFadeAnimation(android.view.View r3, android.view.View r4, boolean r5, boolean r6, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r7, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r8, @androidx.annotation.NonNull java.util.List<android.animation.Animator.AnimatorListener> r9) {
            r2 = this;
            boolean r0 = r4 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r0 == 0) goto L55
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 != 0) goto L9
            goto L55
        L9:
            r0 = r4
            com.google.android.material.circularreveal.CircularRevealWidget r0 = (com.google.android.material.circularreveal.CircularRevealWidget) r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            if (r3 != 0) goto L15
            goto L55
        L15:
            r3.mutate()
            r1 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L2d
            if (r6 != 0) goto L21
            r3.setAlpha(r1)
        L21:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r5 = com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT
            r6 = 0
            int[] r6 = new int[]{r6}
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofInt(r3, r5, r6)
            goto L37
        L2d:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r5 = com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT
            int[] r6 = new int[]{r1}
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofInt(r3, r5, r6)
        L37:
            com.google.android.material.transformation.FabTransformationBehavior$2 r6 = new com.google.android.material.transformation.FabTransformationBehavior$2
            r6.<init>(r2, r4)
            r5.addUpdateListener(r6)
            com.google.android.material.animation.MotionSpec r4 = r7.timings
            java.lang.String r6 = "iconFade"
            com.google.android.material.animation.MotionTiming r4 = r4.getTiming(r6)
            r4.apply(r5)
            r8.add(r5)
            com.google.android.material.transformation.FabTransformationBehavior$3 r4 = new com.google.android.material.transformation.FabTransformationBehavior$3
            r4.<init>(r2, r0, r3)
            r9.add(r4)
        L55:
            return
    }

    private void createPostFillRadialExpansion(android.view.View r1, long r2, long r4, long r6, int r8, int r9, float r10, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r11) {
            r0 = this;
            long r2 = r2 + r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L13
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r1, r8, r9, r10, r10)
            r1.setStartDelay(r2)
            long r6 = r6 - r2
            r1.setDuration(r6)
            r11.add(r1)
        L13:
            return
    }

    private void createPreFillRadialExpansion(android.view.View r4, long r5, int r7, int r8, float r9, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r10) {
            r3 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            android.animation.Animator r4 = android.view.ViewAnimationUtils.createCircularReveal(r4, r7, r8, r9, r9)
            r4.setStartDelay(r0)
            r4.setDuration(r5)
            r10.add(r4)
        L13:
            return
    }

    private void createTranslationAnimation(@androidx.annotation.NonNull android.view.View r14, @androidx.annotation.NonNull android.view.View r15, boolean r16, boolean r17, @androidx.annotation.NonNull com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r18, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r19, java.util.List<android.animation.Animator.AnimatorListener> r20, @androidx.annotation.NonNull android.graphics.RectF r21) {
            r13 = this;
            r0 = r16
            r2 = r18
            r10 = r19
            com.google.android.material.animation.Positioning r1 = r2.positioning
            float r1 = r13.calculateTranslationX(r14, r15, r1)
            com.google.android.material.animation.Positioning r3 = r2.positioning
            float r14 = r13.calculateTranslationY(r14, r15, r3)
            android.util.Pair r3 = r13.calculateMotionTiming(r1, r14, r0, r2)
            java.lang.Object r4 = r3.first
            com.google.android.material.animation.MotionTiming r4 = (com.google.android.material.animation.MotionTiming) r4
            java.lang.Object r3 = r3.second
            com.google.android.material.animation.MotionTiming r3 = (com.google.android.material.animation.MotionTiming) r3
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L4f
            if (r17 != 0) goto L2c
            float r0 = -r1
            r15.setTranslationX(r0)
            float r0 = -r14
            r15.setTranslationY(r0)
        L2c:
            android.util.Property r0 = android.view.View.TRANSLATION_X
            float[] r7 = new float[r6]
            r8 = 0
            r7[r5] = r8
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r15, r0, r7)
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            float[] r6 = new float[r6]
            r6[r5] = r8
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r15, r0, r6)
            float r5 = -r1
            float r6 = -r14
            r7 = 0
            r0 = r4
            r4 = r3
            r3 = r0
            r0 = r13
            r1 = r15
            r9 = r21
            r0.calculateChildVisibleBoundsAtEndOfExpansion(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L69
        L4f:
            r0 = r4
            r4 = r3
            r3 = r0
            r0 = r15
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float r1 = -r1
            float[] r7 = new float[r6]
            r7[r5] = r1
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r15, r2, r7)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float r14 = -r14
            float[] r2 = new float[r6]
            r2[r5] = r14
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r15, r1, r2)
        L69:
            r3.apply(r11)
            r4.apply(r12)
            r10.add(r11)
            r10.add(r12)
            return
    }

    private int getBackgroundTint(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.getBackgroundTintList(r3)
            if (r0 == 0) goto L13
            int[] r3 = r3.getDrawableState()
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            return r3
        L13:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private android.view.ViewGroup toViewGroupOrNull(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L7
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @androidx.annotation.CallSuper
    public boolean layoutDependsOn(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4) {
            r1 = this;
            int r2 = r3.getVisibility()
            r0 = 8
            if (r2 == r0) goto L20
            boolean r2 = r4 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            r0 = 0
            if (r2 == 0) goto L1f
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            int r2 = r4.getExpandedComponentIdHint()
            if (r2 == 0) goto L1d
            int r3 = r3.getId()
            if (r2 != r3) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            r2 = 1
            return r2
        L1f:
            return r0
        L20:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.CallSuper
    public void onAttachedToLayoutParams(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r2) {
            r1 = this;
            int r0 = r2.dodgeInsetEdges
            if (r0 != 0) goto L8
            r0 = 80
            r2.dodgeInsetEdges = r0
        L8:
            return
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @androidx.annotation.NonNull
    protected android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(@androidx.annotation.NonNull android.view.View r12, @androidx.annotation.NonNull android.view.View r13, boolean r14, boolean r15) {
            r11 = this;
            android.content.Context r0 = r13.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$FabTransformationSpec r6 = r11.onCreateMotionSpec(r0, r14)
            if (r14 == 0) goto L16
            float r0 = r12.getTranslationX()
            r11.dependencyOriginalTranslationX = r0
            float r0 = r12.getTranslationY()
            r11.dependencyOriginalTranslationY = r0
        L16:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r1.createElevationAnimation(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.RectF r9 = r1.tmpRectF1
            r1.createTranslationAnimation(r2, r3, r4, r5, r6, r7, r8, r9)
            r12 = r5
            float r13 = r9.width()
            float r14 = r9.height()
            r5 = r6
            r6 = r7
            r1.createDependencyTranslationAnimation(r2, r3, r4, r5, r6)
            r6 = r5
            r5 = r12
            r1.createIconFadeAnimation(r2, r3, r4, r5, r6, r7, r8)
            r9 = r7
            r10 = r8
            r7 = r13
            r8 = r14
            r1.createExpansionAnimation(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r7 = r9
            r8 = r10
            r1.createColorAnimation(r2, r3, r4, r5, r6, r7, r8)
            r1.createChildrenFadeAnimation(r2, r3, r4, r5, r6, r7, r8)
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r12, r7)
            com.google.android.material.transformation.FabTransformationBehavior$1 r13 = new com.google.android.material.transformation.FabTransformationBehavior$1
            r13.<init>(r11, r4, r3, r2)
            r12.addListener(r13)
            int r13 = r8.size()
            r14 = 0
        L64:
            if (r14 >= r13) goto L72
            java.lang.Object r15 = r8.get(r14)
            android.animation.Animator$AnimatorListener r15 = (android.animation.Animator.AnimatorListener) r15
            r12.addListener(r15)
            int r14 = r14 + 1
            goto L64
        L72:
            return r12
    }

    protected abstract com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(android.content.Context r1, boolean r2);
}
