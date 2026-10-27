package com.google.android.material.transition.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class TransitionUtils {

    @androidx.annotation.AttrRes
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final android.graphics.RectF transformAlphaRectF = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface CornerSizeBinaryOperator {
        @androidx.annotation.NonNull
        com.google.android.material.shape.CornerSize apply(@androidx.annotation.NonNull com.google.android.material.shape.CornerSize r1, @androidx.annotation.NonNull com.google.android.material.shape.CornerSize r2);
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            com.google.android.material.transition.platform.TransitionUtils.transformAlphaRectF = r0
            return
    }

    private TransitionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.google.android.material.shape.CornerSize a(android.graphics.RectF r0, com.google.android.material.shape.CornerSize r1) {
            com.google.android.material.shape.RelativeCornerSize r0 = com.google.android.material.shape.RelativeCornerSize.createFromCornerSize(r0, r1)
            return r0
    }

    static float calculateArea(@androidx.annotation.NonNull android.graphics.RectF r1) {
            float r0 = r1.width()
            float r1 = r1.height()
            float r0 = r0 * r1
            return r0
    }

    static com.google.android.material.shape.ShapeAppearanceModel convertToRelativeCornerSizes(com.google.android.material.shape.ShapeAppearanceModel r1, android.graphics.RectF r2) {
            com.google.android.material.transition.platform.a r0 = new com.google.android.material.transition.platform.a
            r0.<init>(r2)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.withTransformedCornerSizes(r0)
            return r1
    }

    static android.graphics.Shader createColorShader(@androidx.annotation.ColorInt int r8) {
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            r4 = 0
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r1 = 0
            r2 = 0
            r3 = 0
            r6 = r8
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @androidx.annotation.NonNull
    static <T> T defaultIfNull(@androidx.annotation.Nullable T r0, @androidx.annotation.NonNull T r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            return r1
    }

    static android.view.View findAncestorById(android.view.View r2, @androidx.annotation.IdRes int r3) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r0 = r0.getResourceName(r3)
        L8:
            if (r2 == 0) goto L1c
            int r1 = r2.getId()
            if (r1 != r3) goto L11
            return r2
        L11:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L1c
            android.view.View r2 = (android.view.View) r2
            goto L8
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " is not a valid ancestor"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static android.view.View findDescendantOrAncestorById(android.view.View r1, @androidx.annotation.IdRes int r2) {
            android.view.View r0 = r1.findViewById(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            android.view.View r1 = findAncestorById(r1, r2)
            return r1
    }

    static android.graphics.RectF getLocationOnScreen(android.view.View r4) {
            r0 = 2
            int[] r0 = new int[r0]
            r4.getLocationOnScreen(r0)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            int r2 = r4.getWidth()
            int r2 = r2 + r1
            int r4 = r4.getHeight()
            int r4 = r4 + r0
            android.graphics.RectF r3 = new android.graphics.RectF
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = (float) r2
            float r4 = (float) r4
            r3.<init>(r1, r0, r2, r4)
            return r3
    }

    static android.graphics.RectF getRelativeBounds(android.view.View r4) {
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r4.getLeft()
            float r1 = (float) r1
            int r2 = r4.getTop()
            float r2 = (float) r2
            int r3 = r4.getRight()
            float r3 = (float) r3
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    static android.graphics.Rect getRelativeBoundsRect(android.view.View r4) {
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.getLeft()
            int r2 = r4.getTop()
            int r3 = r4.getRight()
            int r4 = r4.getBottom()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private static boolean isShapeAppearanceSignificant(com.google.android.material.shape.ShapeAppearanceModel r2, android.graphics.RectF r3) {
            com.google.android.material.shape.CornerSize r0 = r2.getTopLeftCornerSize()
            float r0 = r0.getCornerSize(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r0 = r2.getTopRightCornerSize()
            float r0 = r0.getCornerSize(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r0 = r2.getBottomRightCornerSize()
            float r0 = r0.getCornerSize(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r2 = r2.getBottomLeftCornerSize()
            float r2 = r2.getCornerSize(r3)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L32
            goto L34
        L32:
            r2 = 0
            return r2
        L34:
            r2 = 1
            return r2
    }

    static float lerp(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r2 = r2 * r1
            float r0 = r0 + r2
            return r0
    }

    static float lerp(float r6, float r7, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r8, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r9, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            float r6 = lerp(r0, r1, r2, r3, r4, r5)
            return r6
    }

    static float lerp(float r0, float r1, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, @androidx.annotation.FloatRange(from = 0.0d) float r4, boolean r5) {
            if (r5 == 0) goto L12
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto Ld
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L12
        Ld:
            float r0 = lerp(r0, r1, r4)
            return r0
        L12:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L17
            return r0
        L17:
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1c
            return r1
        L1c:
            float r4 = r4 - r2
            float r3 = r3 - r2
            float r4 = r4 / r3
            float r0 = lerp(r0, r1, r4)
            return r0
    }

    static int lerp(int r1, int r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r1
        L5:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto La
            return r2
        La:
            float r1 = (float) r1
            float r2 = (float) r2
            float r5 = r5 - r3
            float r4 = r4 - r3
            float r5 = r5 / r4
            float r1 = lerp(r1, r2, r5)
            int r1 = (int) r1
            return r1
    }

    static com.google.android.material.shape.ShapeAppearanceModel lerp(com.google.android.material.shape.ShapeAppearanceModel r7, com.google.android.material.shape.ShapeAppearanceModel r8, android.graphics.RectF r9, android.graphics.RectF r10, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r11, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r12, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r13) {
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r7
        L5:
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 <= 0) goto La
            return r8
        La:
            com.google.android.material.transition.platform.TransitionUtils$1 r1 = new com.google.android.material.transition.platform.TransitionUtils$1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.material.shape.ShapeAppearanceModel r7 = transformCornerSizes(r7, r8, r2, r1)
            return r7
    }

    static void maybeAddTransition(android.transition.TransitionSet r0, @androidx.annotation.Nullable android.transition.Transition r1) {
            if (r1 == 0) goto L5
            r0.addTransition(r1)
        L5:
            return
    }

    static boolean maybeApplyThemeDuration(android.transition.Transition r5, android.content.Context r6, @androidx.annotation.AttrRes int r7) {
            if (r7 == 0) goto L19
            long r0 = r5.getDuration()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L19
            r0 = -1
            int r6 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r6, r7, r0)
            if (r6 == r0) goto L19
            long r6 = (long) r6
            r5.setDuration(r6)
            r5 = 1
            return r5
        L19:
            r5 = 0
            return r5
    }

    static boolean maybeApplyThemeInterpolator(android.transition.Transition r1, android.content.Context r2, @androidx.annotation.AttrRes int r3, android.animation.TimeInterpolator r4) {
            if (r3 == 0) goto L11
            android.animation.TimeInterpolator r0 = r1.getInterpolator()
            if (r0 != 0) goto L11
            android.animation.TimeInterpolator r2 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r2, r3, r4)
            r1.setInterpolator(r2)
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    static boolean maybeApplyThemePath(android.transition.Transition r0, android.content.Context r1, @androidx.annotation.AttrRes int r2) {
            if (r2 == 0) goto Ld
            android.transition.PathMotion r1 = resolveThemePath(r1, r2)
            if (r1 == 0) goto Ld
            r0.setPathMotion(r1)
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    static void maybeRemoveTransition(android.transition.TransitionSet r0, @androidx.annotation.Nullable android.transition.Transition r1) {
            if (r1 == 0) goto L5
            r0.removeTransition(r1)
        L5:
            return
    }

    @androidx.annotation.Nullable
    static android.transition.PathMotion resolveThemePath(android.content.Context r3, @androidx.annotation.AttrRes int r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r1 = 1
            boolean r3 = r3.resolveAttribute(r4, r0, r1)
            r4 = 0
            if (r3 == 0) goto L56
            int r3 = r0.type
            r2 = 16
            if (r3 != r2) goto L3b
            int r3 = r0.data
            if (r3 != 0) goto L1c
            return r4
        L1c:
            if (r3 != r1) goto L24
            com.google.android.material.transition.platform.MaterialArcMotion r3 = new com.google.android.material.transition.platform.MaterialArcMotion
            r3.<init>()
            return r3
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid motion path type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3b:
            r4 = 3
            if (r3 != r4) goto L4e
            java.lang.CharSequence r3 = r0.string
            java.lang.String r3 = java.lang.String.valueOf(r3)
            android.transition.PatternPathMotion r4 = new android.transition.PatternPathMotion
            android.graphics.Path r3 = androidx.core.graphics.PathParser.createPathFromPathData(r3)
            r4.<init>(r3)
            return r4
        L4e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Motion path theme attribute must either be an enum value or path data string"
            r3.<init>(r4)
            throw r3
        L56:
            return r4
    }

    private static int saveLayerAlphaCompat(android.graphics.Canvas r1, android.graphics.Rect r2, int r3) {
            android.graphics.RectF r0 = com.google.android.material.transition.platform.TransitionUtils.transformAlphaRectF
            r0.set(r2)
            int r1 = r1.saveLayerAlpha(r0, r3)
            return r1
    }

    static void transform(android.graphics.Canvas r1, android.graphics.Rect r2, float r3, float r4, float r5, int r6, com.google.android.material.canvas.CanvasCompat.CanvasOperation r7) {
            if (r6 > 0) goto L3
            return
        L3:
            int r0 = r1.save()
            r1.translate(r3, r4)
            r1.scale(r5, r5)
            r3 = 255(0xff, float:3.57E-43)
            if (r6 >= r3) goto L14
            saveLayerAlphaCompat(r1, r2, r6)
        L14:
            r7.run(r1)
            r1.restoreToCount(r0)
            return
    }

    static com.google.android.material.shape.ShapeAppearanceModel transformCornerSizes(com.google.android.material.shape.ShapeAppearanceModel r2, com.google.android.material.shape.ShapeAppearanceModel r3, android.graphics.RectF r4, com.google.android.material.transition.platform.TransitionUtils.CornerSizeBinaryOperator r5) {
            boolean r4 = isShapeAppearanceSignificant(r2, r4)
            if (r4 == 0) goto L8
            r4 = r2
            goto L9
        L8:
            r4 = r3
        L9:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.toBuilder()
            com.google.android.material.shape.CornerSize r0 = r2.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r0 = r5.apply(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setTopLeftCornerSize(r0)
            com.google.android.material.shape.CornerSize r0 = r2.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r0 = r5.apply(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setTopRightCornerSize(r0)
            com.google.android.material.shape.CornerSize r0 = r2.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r0 = r5.apply(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setBottomLeftCornerSize(r0)
            com.google.android.material.shape.CornerSize r2 = r2.getBottomRightCornerSize()
            com.google.android.material.shape.CornerSize r3 = r3.getBottomRightCornerSize()
            com.google.android.material.shape.CornerSize r2 = r5.apply(r2, r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r4.setBottomRightCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
    }
}
