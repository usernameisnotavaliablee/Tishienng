package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MaterialContainerTransform extends androidx.transition.Transition {
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = null;
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = null;
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS = null;
    private static final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC = null;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final java.lang.String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final java.lang.String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final java.lang.String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private static final java.lang.String[] TRANSITION_PROPS = null;
    private boolean appliedThemeValues;

    @androidx.annotation.ColorInt
    private int containerColor;
    private boolean drawDebugEnabled;

    @androidx.annotation.IdRes
    private int drawingViewId;
    private boolean elevationShadowEnabled;

    @androidx.annotation.ColorInt
    private int endContainerColor;
    private float endElevation;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.ShapeAppearanceModel endShapeAppearanceModel;

    @androidx.annotation.Nullable
    private android.view.View endView;

    @androidx.annotation.IdRes
    private int endViewId;
    private int fadeMode;

    @androidx.annotation.Nullable
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;

    @androidx.annotation.Nullable
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scaleMaskProgressThresholds;

    @androidx.annotation.Nullable
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scaleProgressThresholds;

    @androidx.annotation.ColorInt
    private int scrimColor;

    @androidx.annotation.Nullable
    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds shapeMaskProgressThresholds;

    @androidx.annotation.ColorInt
    private int startContainerColor;
    private float startElevation;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.ShapeAppearanceModel startShapeAppearanceModel;

    @androidx.annotation.Nullable
    private android.view.View startView;

    @androidx.annotation.IdRes
    private int startViewId;
    private int transitionDirection;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FadeMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FitMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ProgressThresholds {

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        private final float end;

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        private final float start;

        public ProgressThresholds(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.end = r2
                return
        }

        static /* synthetic */ float access$1000(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r0) {
                float r0 = r0.start
                return r0
        }

        static /* synthetic */ float access$1100(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r0) {
                float r0 = r0.end
                return r0
        }

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        public float getEnd() {
                r1 = this;
                float r0 = r1.end
                return r0
        }

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        public float getStart() {
                r1 = this;
                float r0 = r1.start
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ProgressThresholdsGroup {

        @androidx.annotation.NonNull
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds fade;

        @androidx.annotation.NonNull
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scale;

        @androidx.annotation.NonNull
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds scaleMask;

        @androidx.annotation.NonNull
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds shapeMask;

        private ProgressThresholdsGroup(@androidx.annotation.NonNull com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1, @androidx.annotation.NonNull com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r2, @androidx.annotation.NonNull com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r3, @androidx.annotation.NonNull com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r4) {
                r0 = this;
                r0.<init>()
                r0.fade = r1
                r0.scale = r2
                r0.scaleMask = r3
                r0.shapeMask = r4
                return
        }

        /* synthetic */ ProgressThresholdsGroup(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r2, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r3, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r4, com.google.android.material.transition.MaterialContainerTransform.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$400(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.fade
                return r0
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$500(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.scale
                return r0
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$600(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.scaleMask
                return r0
        }

        static /* synthetic */ com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds access$700(com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r0) {
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r0.shapeMask
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TransitionDirection {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TransitionDrawable extends android.graphics.drawable.Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final com.google.android.material.shape.MaterialShapeDrawable compatShadowDrawable;
        private final android.graphics.Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final android.graphics.RectF currentEndBounds;
        private final android.graphics.RectF currentEndBoundsMasked;
        private android.graphics.RectF currentMaskBounds;
        private final android.graphics.RectF currentStartBounds;
        private final android.graphics.RectF currentStartBoundsMasked;
        private final android.graphics.Paint debugPaint;
        private final android.graphics.Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final android.graphics.RectF endBounds;
        private final android.graphics.Paint endContainerPaint;
        private final float endElevation;
        private final com.google.android.material.shape.ShapeAppearanceModel endShapeAppearanceModel;
        private final android.view.View endView;
        private final boolean entering;
        private final com.google.android.material.transition.FadeModeEvaluator fadeModeEvaluator;
        private com.google.android.material.transition.FadeModeResult fadeModeResult;
        private final com.google.android.material.transition.FitModeEvaluator fitModeEvaluator;
        private com.google.android.material.transition.FitModeResult fitModeResult;
        private final com.google.android.material.transition.MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final android.graphics.PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup progressThresholds;
        private final android.graphics.Paint scrimPaint;
        private final android.graphics.Paint shadowPaint;
        private final android.graphics.RectF startBounds;
        private final android.graphics.Paint startContainerPaint;
        private final float startElevation;
        private final com.google.android.material.shape.ShapeAppearanceModel startShapeAppearanceModel;
        private final android.view.View startView;



        private TransitionDrawable(androidx.transition.PathMotion r11, android.view.View r12, android.graphics.RectF r13, com.google.android.material.shape.ShapeAppearanceModel r14, float r15, android.view.View r16, android.graphics.RectF r17, com.google.android.material.shape.ShapeAppearanceModel r18, float r19, @androidx.annotation.ColorInt int r20, @androidx.annotation.ColorInt int r21, @androidx.annotation.ColorInt int r22, int r23, boolean r24, boolean r25, com.google.android.material.transition.FadeModeEvaluator r26, com.google.android.material.transition.FitModeEvaluator r27, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r28, boolean r29) {
                r10 = this;
                r10.<init>()
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r10.containerPaint = r0
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r10.startContainerPaint = r1
                android.graphics.Paint r2 = new android.graphics.Paint
                r2.<init>()
                r10.endContainerPaint = r2
                android.graphics.Paint r3 = new android.graphics.Paint
                r3.<init>()
                r10.shadowPaint = r3
                android.graphics.Paint r3 = new android.graphics.Paint
                r3.<init>()
                r10.scrimPaint = r3
                com.google.android.material.transition.MaskEvaluator r4 = new com.google.android.material.transition.MaskEvaluator
                r4.<init>()
                r10.maskEvaluator = r4
                r4 = 2
                float[] r5 = new float[r4]
                r10.motionPathPosition = r5
                com.google.android.material.shape.MaterialShapeDrawable r6 = new com.google.android.material.shape.MaterialShapeDrawable
                r6.<init>()
                r10.compatShadowDrawable = r6
                android.graphics.Paint r7 = new android.graphics.Paint
                r7.<init>()
                r10.debugPaint = r7
                android.graphics.Path r8 = new android.graphics.Path
                r8.<init>()
                r10.debugPath = r8
                r10.startView = r12
                r10.startBounds = r13
                r10.startShapeAppearanceModel = r14
                r10.startElevation = r15
                r8 = r16
                r10.endView = r8
                r8 = r17
                r10.endBounds = r8
                r9 = r18
                r10.endShapeAppearanceModel = r9
                r9 = r19
                r10.endElevation = r9
                r9 = r24
                r10.entering = r9
                r9 = r25
                r10.elevationShadowEnabled = r9
                r9 = r26
                r10.fadeModeEvaluator = r9
                r9 = r27
                r10.fitModeEvaluator = r9
                r9 = r28
                r10.progressThresholds = r9
                r9 = r29
                r10.drawDebugEnabled = r9
                android.content.Context r12 = r12.getContext()
                java.lang.String r9 = "window"
                java.lang.Object r12 = r12.getSystemService(r9)
                android.view.WindowManager r12 = (android.view.WindowManager) r12
                android.util.DisplayMetrics r9 = new android.util.DisplayMetrics
                r9.<init>()
                android.view.Display r12 = r12.getDefaultDisplay()
                r12.getMetrics(r9)
                int r12 = r9.widthPixels
                float r12 = (float) r12
                r10.displayWidth = r12
                int r12 = r9.heightPixels
                float r12 = (float) r12
                r10.displayHeight = r12
                r12 = r20
                r0.setColor(r12)
                r12 = r21
                r1.setColor(r12)
                r12 = r22
                r2.setColor(r12)
                r12 = 0
                android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r12)
                r6.setFillColor(r0)
                r6.setShadowCompatibilityMode(r4)
                r6.setShadowBitmapDrawingEnable(r12)
                r0 = -7829368(0xffffffffff888888, float:NaN)
                r6.setShadowColor(r0)
                android.graphics.RectF r0 = new android.graphics.RectF
                r0.<init>(r13)
                r10.currentStartBounds = r0
                android.graphics.RectF r1 = new android.graphics.RectF
                r1.<init>(r0)
                r10.currentStartBoundsMasked = r1
                android.graphics.RectF r1 = new android.graphics.RectF
                r1.<init>(r0)
                r10.currentEndBounds = r1
                android.graphics.RectF r0 = new android.graphics.RectF
                r0.<init>(r1)
                r10.currentEndBoundsMasked = r0
                android.graphics.PointF r0 = getMotionPathPoint(r13)
                android.graphics.PointF r1 = getMotionPathPoint(r8)
                float r2 = r0.x
                float r0 = r0.y
                float r4 = r1.x
                float r1 = r1.y
                android.graphics.Path r11 = r11.getPath(r2, r0, r4, r1)
                android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
                r0.<init>(r11, r12)
                r10.motionPathMeasure = r0
                float r11 = r0.getLength()
                r10.motionPathLength = r11
                float r11 = r13.centerX()
                r5[r12] = r11
                r11 = 1
                float r12 = r13.top
                r5[r11] = r12
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
                r3.setStyle(r11)
                android.graphics.Shader r11 = com.google.android.material.transition.TransitionUtils.createColorShader(r23)
                r3.setShader(r11)
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
                r7.setStyle(r11)
                r11 = 1092616192(0x41200000, float:10.0)
                r7.setStrokeWidth(r11)
                r11 = 0
                r10.updateProgress(r11)
                return
        }

        /* synthetic */ TransitionDrawable(androidx.transition.PathMotion r1, android.view.View r2, android.graphics.RectF r3, com.google.android.material.shape.ShapeAppearanceModel r4, float r5, android.view.View r6, android.graphics.RectF r7, com.google.android.material.shape.ShapeAppearanceModel r8, float r9, int r10, int r11, int r12, int r13, boolean r14, boolean r15, com.google.android.material.transition.FadeModeEvaluator r16, com.google.android.material.transition.FitModeEvaluator r17, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r18, boolean r19, com.google.android.material.transition.MaterialContainerTransform.AnonymousClass1 r20) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
        }

        static /* synthetic */ void access$200(com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable r0, float r1) {
                r0.setProgress(r1)
                return
        }

        static /* synthetic */ android.view.View access$800(com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable r0) {
                android.view.View r0 = r0.startView
                return r0
        }

        static /* synthetic */ android.view.View access$900(com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable r0) {
                android.view.View r0 = r0.endView
                return r0
        }

        private static float calculateElevationDxMultiplier(android.graphics.RectF r1, float r2) {
                float r1 = r1.centerX()
                r0 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 / r0
                float r1 = r1 / r2
                r2 = 1065353216(0x3f800000, float:1.0)
                float r1 = r1 - r2
                r2 = 1050253722(0x3e99999a, float:0.3)
                float r1 = r1 * r2
                return r1
        }

        private static float calculateElevationDyMultiplier(android.graphics.RectF r0, float r1) {
                float r0 = r0.centerY()
                float r0 = r0 / r1
                r1 = 1069547520(0x3fc00000, float:1.5)
                float r0 = r0 * r1
                return r0
        }

        private void drawDebugCumulativePath(android.graphics.Canvas r3, android.graphics.RectF r4, android.graphics.Path r5, @androidx.annotation.ColorInt int r6) {
                r2 = this;
                android.graphics.PointF r4 = getMotionPathPoint(r4)
                float r0 = r2.progress
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L16
                r5.reset()
                float r3 = r4.x
                float r4 = r4.y
                r5.moveTo(r3, r4)
                return
            L16:
                float r0 = r4.x
                float r4 = r4.y
                r5.lineTo(r0, r4)
                android.graphics.Paint r4 = r2.debugPaint
                r4.setColor(r6)
                android.graphics.Paint r4 = r2.debugPaint
                r3.drawPath(r5, r4)
                return
        }

        private void drawDebugRect(android.graphics.Canvas r2, android.graphics.RectF r3, @androidx.annotation.ColorInt int r4) {
                r1 = this;
                android.graphics.Paint r0 = r1.debugPaint
                r0.setColor(r4)
                android.graphics.Paint r4 = r1.debugPaint
                r2.drawRect(r3, r4)
                return
        }

        private void drawElevationShadow(android.graphics.Canvas r3) {
                r2 = this;
                r3.save()
                com.google.android.material.transition.MaskEvaluator r0 = r2.maskEvaluator
                android.graphics.Path r0 = r0.getPath()
                android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
                r3.clipPath(r0, r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 <= r1) goto L18
                r2.drawElevationShadowWithPaintShadowLayer(r3)
                goto L1b
            L18:
                r2.drawElevationShadowWithMaterialShapeDrawable(r3)
            L1b:
                r3.restore()
                return
        }

        private void drawElevationShadowWithMaterialShapeDrawable(android.graphics.Canvas r6) {
                r5 = this;
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                android.graphics.RectF r1 = r5.currentMaskBounds
                float r2 = r1.left
                int r2 = (int) r2
                float r3 = r1.top
                int r3 = (int) r3
                float r4 = r1.right
                int r4 = (int) r4
                float r1 = r1.bottom
                int r1 = (int) r1
                r0.setBounds(r2, r3, r4, r1)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                float r1 = r5.currentElevation
                r0.setElevation(r1)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                float r1 = r5.currentElevationDy
                int r1 = (int) r1
                r0.setShadowVerticalOffset(r1)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                com.google.android.material.transition.MaskEvaluator r1 = r5.maskEvaluator
                com.google.android.material.shape.ShapeAppearanceModel r1 = r1.getCurrentShapeAppearanceModel()
                r0.setShapeAppearanceModel(r1)
                com.google.android.material.shape.MaterialShapeDrawable r0 = r5.compatShadowDrawable
                r0.draw(r6)
                return
        }

        private void drawElevationShadowWithPaintShadowLayer(android.graphics.Canvas r4) {
                r3 = this;
                com.google.android.material.transition.MaskEvaluator r0 = r3.maskEvaluator
                com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getCurrentShapeAppearanceModel()
                android.graphics.RectF r1 = r3.currentMaskBounds
                boolean r1 = r0.isRoundRect(r1)
                if (r1 == 0) goto L20
                com.google.android.material.shape.CornerSize r0 = r0.getTopLeftCornerSize()
                android.graphics.RectF r1 = r3.currentMaskBounds
                float r0 = r0.getCornerSize(r1)
                android.graphics.RectF r1 = r3.currentMaskBounds
                android.graphics.Paint r2 = r3.shadowPaint
                r4.drawRoundRect(r1, r0, r0, r2)
                return
            L20:
                com.google.android.material.transition.MaskEvaluator r0 = r3.maskEvaluator
                android.graphics.Path r0 = r0.getPath()
                android.graphics.Paint r1 = r3.shadowPaint
                r4.drawPath(r0, r1)
                return
        }

        private void drawEndView(android.graphics.Canvas r9) {
                r8 = this;
                android.graphics.Paint r0 = r8.endContainerPaint
                r8.maybeDrawContainerColor(r9, r0)
                android.graphics.Rect r2 = r8.getBounds()
                android.graphics.RectF r0 = r8.currentEndBounds
                float r3 = r0.left
                float r4 = r0.top
                com.google.android.material.transition.FitModeResult r0 = r8.fitModeResult
                float r5 = r0.endScale
                com.google.android.material.transition.FadeModeResult r0 = r8.fadeModeResult
                int r6 = r0.endAlpha
                com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$2 r7 = new com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$2
                r7.<init>(r8)
                r1 = r9
                com.google.android.material.transition.TransitionUtils.transform(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private void drawStartView(android.graphics.Canvas r9) {
                r8 = this;
                android.graphics.Paint r0 = r8.startContainerPaint
                r8.maybeDrawContainerColor(r9, r0)
                android.graphics.Rect r2 = r8.getBounds()
                android.graphics.RectF r0 = r8.currentStartBounds
                float r3 = r0.left
                float r4 = r0.top
                com.google.android.material.transition.FitModeResult r0 = r8.fitModeResult
                float r5 = r0.startScale
                com.google.android.material.transition.FadeModeResult r0 = r8.fadeModeResult
                int r6 = r0.startAlpha
                com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$1 r7 = new com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$1
                r7.<init>(r8)
                r1 = r9
                com.google.android.material.transition.TransitionUtils.transform(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private static android.graphics.PointF getMotionPathPoint(android.graphics.RectF r2) {
                android.graphics.PointF r0 = new android.graphics.PointF
                float r1 = r2.centerX()
                float r2 = r2.top
                r0.<init>(r1, r2)
                return r0
        }

        private void maybeDrawContainerColor(android.graphics.Canvas r2, android.graphics.Paint r3) {
                r1 = this;
                int r0 = r3.getColor()
                if (r0 == 0) goto L13
                int r0 = r3.getAlpha()
                if (r0 <= 0) goto L13
                android.graphics.Rect r0 = r1.getBounds()
                r2.drawRect(r0, r3)
            L13:
                return
        }

        private void setProgress(float r2) {
                r1 = this;
                float r0 = r1.progress
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L9
                r1.updateProgress(r2)
            L9:
                return
        }

        private void updateProgress(float r14) {
                r13 = this;
                r13.progress = r14
                android.graphics.Paint r0 = r13.scrimPaint
                boolean r2 = r13.entering
                r3 = 1132396544(0x437f0000, float:255.0)
                r8 = 0
                if (r2 == 0) goto L10
                float r2 = com.google.android.material.transition.TransitionUtils.lerp(r8, r3, r14)
                goto L14
            L10:
                float r2 = com.google.android.material.transition.TransitionUtils.lerp(r3, r8, r14)
            L14:
                int r2 = (int) r2
                r0.setAlpha(r2)
                android.graphics.PathMeasure r0 = r13.motionPathMeasure
                float r2 = r13.motionPathLength
                float r2 = r2 * r14
                float[] r3 = r13.motionPathPosition
                r4 = 0
                r0.getPosTan(r2, r3, r4)
                float[] r0 = r13.motionPathPosition
                r2 = 0
                r3 = r0[r2]
                r5 = 1
                r6 = r0[r5]
                r9 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r7 > 0) goto L3a
                int r10 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                if (r10 >= 0) goto L37
                goto L3a
            L37:
                r10 = r3
                r11 = r6
                goto L69
            L3a:
                if (r7 <= 0) goto L46
                float r7 = r14 - r9
                r10 = 1008981760(0x3c23d700, float:0.00999999)
                float r7 = r7 / r10
                r10 = 1065185444(0x3f7d70a4, float:0.99)
                goto L4f
            L46:
                r10 = 1008981770(0x3c23d70a, float:0.01)
                float r7 = r14 / r10
                r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                float r7 = r7 * r11
            L4f:
                android.graphics.PathMeasure r11 = r13.motionPathMeasure
                float r12 = r13.motionPathLength
                float r12 = r12 * r10
                r11.getPosTan(r12, r0, r4)
                float[] r0 = r13.motionPathPosition
                r2 = r0[r2]
                r0 = r0[r5]
                float r2 = r3 - r2
                float r2 = r2 * r7
                float r3 = r3 + r2
                float r0 = r6 - r0
                float r0 = r0 * r7
                float r6 = r6 + r0
                goto L37
            L69:
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r13.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$500(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1000(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r2 = r0.floatValue()
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r13.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$500(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1100(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r3 = r0.floatValue()
                com.google.android.material.transition.FitModeEvaluator r0 = r13.fitModeEvaluator
                android.graphics.RectF r4 = r13.startBounds
                float r4 = r4.width()
                android.graphics.RectF r5 = r13.startBounds
                float r5 = r5.height()
                android.graphics.RectF r6 = r13.endBounds
                float r6 = r6.width()
                android.graphics.RectF r7 = r13.endBounds
                float r7 = r7.height()
                r1 = r14
                com.google.android.material.transition.FitModeResult r0 = r0.evaluate(r1, r2, r3, r4, r5, r6, r7)
                r13.fitModeResult = r0
                android.graphics.RectF r2 = r13.currentStartBounds
                float r3 = r0.currentStartWidth
                r4 = 1073741824(0x40000000, float:2.0)
                float r5 = r3 / r4
                float r5 = r10 - r5
                float r3 = r3 / r4
                float r3 = r3 + r10
                float r0 = r0.currentStartHeight
                float r0 = r0 + r11
                r2.set(r5, r11, r3, r0)
                android.graphics.RectF r0 = r13.currentEndBounds
                com.google.android.material.transition.FitModeResult r2 = r13.fitModeResult
                float r3 = r2.currentEndWidth
                float r5 = r3 / r4
                float r5 = r10 - r5
                float r3 = r3 / r4
                float r10 = r10 + r3
                float r2 = r2.currentEndHeight
                float r2 = r2 + r11
                r0.set(r5, r11, r10, r2)
                android.graphics.RectF r0 = r13.currentStartBoundsMasked
                android.graphics.RectF r2 = r13.currentStartBounds
                r0.set(r2)
                android.graphics.RectF r0 = r13.currentEndBoundsMasked
                android.graphics.RectF r2 = r13.currentEndBounds
                r0.set(r2)
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r13.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$600(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1000(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r0 = r0.floatValue()
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r2 = r13.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r2 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$600(r2)
                float r2 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1100(r2)
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.google.android.material.transition.FitModeEvaluator r3 = r13.fitModeEvaluator
                com.google.android.material.transition.FitModeResult r4 = r13.fitModeResult
                boolean r3 = r3.shouldMaskStartBounds(r4)
                if (r3 == 0) goto L129
                android.graphics.RectF r4 = r13.currentStartBoundsMasked
                goto L12b
            L129:
                android.graphics.RectF r4 = r13.currentEndBoundsMasked
            L12b:
                float r0 = com.google.android.material.transition.TransitionUtils.lerp(r8, r9, r0, r2, r14)
                if (r3 == 0) goto L132
                goto L134
            L132:
                float r0 = r9 - r0
            L134:
                com.google.android.material.transition.FitModeEvaluator r2 = r13.fitModeEvaluator
                com.google.android.material.transition.FitModeResult r3 = r13.fitModeResult
                r2.applyMask(r4, r0, r3)
                android.graphics.RectF r0 = new android.graphics.RectF
                android.graphics.RectF r2 = r13.currentStartBoundsMasked
                float r2 = r2.left
                android.graphics.RectF r3 = r13.currentEndBoundsMasked
                float r3 = r3.left
                float r2 = java.lang.Math.min(r2, r3)
                android.graphics.RectF r3 = r13.currentStartBoundsMasked
                float r3 = r3.top
                android.graphics.RectF r4 = r13.currentEndBoundsMasked
                float r4 = r4.top
                float r3 = java.lang.Math.min(r3, r4)
                android.graphics.RectF r4 = r13.currentStartBoundsMasked
                float r4 = r4.right
                android.graphics.RectF r5 = r13.currentEndBoundsMasked
                float r5 = r5.right
                float r4 = java.lang.Math.max(r4, r5)
                android.graphics.RectF r5 = r13.currentStartBoundsMasked
                float r5 = r5.bottom
                android.graphics.RectF r6 = r13.currentEndBoundsMasked
                float r6 = r6.bottom
                float r5 = java.lang.Math.max(r5, r6)
                r0.<init>(r2, r3, r4, r5)
                r13.currentMaskBounds = r0
                com.google.android.material.transition.MaskEvaluator r0 = r13.maskEvaluator
                com.google.android.material.shape.ShapeAppearanceModel r2 = r13.startShapeAppearanceModel
                com.google.android.material.shape.ShapeAppearanceModel r3 = r13.endShapeAppearanceModel
                android.graphics.RectF r4 = r13.currentStartBounds
                android.graphics.RectF r5 = r13.currentStartBoundsMasked
                android.graphics.RectF r6 = r13.currentEndBoundsMasked
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r7 = r13.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r7 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$700(r7)
                r1 = r14
                r0.evaluate(r1, r2, r3, r4, r5, r6, r7)
                float r0 = r13.startElevation
                float r2 = r13.endElevation
                float r0 = com.google.android.material.transition.TransitionUtils.lerp(r0, r2, r14)
                r13.currentElevation = r0
                android.graphics.RectF r0 = r13.currentMaskBounds
                float r2 = r13.displayWidth
                float r0 = calculateElevationDxMultiplier(r0, r2)
                android.graphics.RectF r2 = r13.currentMaskBounds
                float r3 = r13.displayHeight
                float r2 = calculateElevationDyMultiplier(r2, r3)
                float r3 = r13.currentElevation
                float r0 = r0 * r3
                int r0 = (int) r0
                float r0 = (float) r0
                float r2 = r2 * r3
                int r2 = (int) r2
                float r2 = (float) r2
                r13.currentElevationDy = r2
                android.graphics.Paint r4 = r13.shadowPaint
                r5 = 754974720(0x2d000000, float:7.275958E-12)
                r4.setShadowLayer(r3, r0, r2, r5)
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = r13.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$400(r0)
                float r0 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1000(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                java.lang.Float r0 = (java.lang.Float) r0
                float r0 = r0.floatValue()
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r2 = r13.progressThresholds
                com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r2 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$400(r2)
                float r2 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds.access$1100(r2)
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.google.android.material.transition.FadeModeEvaluator r3 = r13.fadeModeEvaluator
                r4 = 1051931443(0x3eb33333, float:0.35)
                com.google.android.material.transition.FadeModeResult r0 = r3.evaluate(r14, r0, r2, r4)
                r13.fadeModeResult = r0
                android.graphics.Paint r0 = r13.startContainerPaint
                int r0 = r0.getColor()
                if (r0 == 0) goto L201
                android.graphics.Paint r0 = r13.startContainerPaint
                com.google.android.material.transition.FadeModeResult r1 = r13.fadeModeResult
                int r1 = r1.startAlpha
                r0.setAlpha(r1)
            L201:
                android.graphics.Paint r0 = r13.endContainerPaint
                int r0 = r0.getColor()
                if (r0 == 0) goto L212
                android.graphics.Paint r0 = r13.endContainerPaint
                com.google.android.material.transition.FadeModeResult r1 = r13.fadeModeResult
                int r1 = r1.endAlpha
                r0.setAlpha(r1)
            L212:
                r13.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@androidx.annotation.NonNull android.graphics.Canvas r4) {
                r3 = this;
                android.graphics.Paint r0 = r3.scrimPaint
                int r0 = r0.getAlpha()
                if (r0 <= 0) goto L11
                android.graphics.Rect r0 = r3.getBounds()
                android.graphics.Paint r1 = r3.scrimPaint
                r4.drawRect(r0, r1)
            L11:
                boolean r0 = r3.drawDebugEnabled
                if (r0 == 0) goto L1a
                int r0 = r4.save()
                goto L1b
            L1a:
                r0 = -1
            L1b:
                boolean r1 = r3.elevationShadowEnabled
                if (r1 == 0) goto L29
                float r1 = r3.currentElevation
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L29
                r3.drawElevationShadow(r4)
            L29:
                com.google.android.material.transition.MaskEvaluator r1 = r3.maskEvaluator
                r1.clip(r4)
                android.graphics.Paint r1 = r3.containerPaint
                r3.maybeDrawContainerColor(r4, r1)
                com.google.android.material.transition.FadeModeResult r1 = r3.fadeModeResult
                boolean r1 = r1.endOnTop
                if (r1 == 0) goto L40
                r3.drawStartView(r4)
                r3.drawEndView(r4)
                goto L46
            L40:
                r3.drawEndView(r4)
                r3.drawStartView(r4)
            L46:
                boolean r1 = r3.drawDebugEnabled
                if (r1 == 0) goto L76
                r4.restoreToCount(r0)
                android.graphics.RectF r0 = r3.currentStartBounds
                android.graphics.Path r1 = r3.debugPath
                r2 = -65281(0xffffffffffff00ff, float:NaN)
                r3.drawDebugCumulativePath(r4, r0, r1, r2)
                android.graphics.RectF r0 = r3.currentStartBoundsMasked
                r1 = -256(0xffffffffffffff00, float:NaN)
                r3.drawDebugRect(r4, r0, r1)
                android.graphics.RectF r0 = r3.currentStartBounds
                r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                r3.drawDebugRect(r4, r0, r1)
                android.graphics.RectF r0 = r3.currentEndBoundsMasked
                r1 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
                r3.drawDebugRect(r4, r0, r1)
                android.graphics.RectF r0 = r3.currentEndBounds
                r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                r3.drawDebugRect(r4, r0, r1)
            L76:
                return
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
                r1 = this;
                r0 = -3
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Setting alpha on is not supported"
                r2.<init>(r0)
                throw r2
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@androidx.annotation.Nullable android.graphics.ColorFilter r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Setting a color filter is not supported"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            java.lang.String r0 = "materialContainerTransition:bounds"
            java.lang.String r1 = "materialContainerTransition:shapeAppearance"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.material.transition.MaterialContainerTransform.TRANSITION_PROPS = r0
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r2 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r0 = 1048576000(0x3e800000, float:0.25)
            r7 = 0
            r2.<init>(r7, r0)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r3 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r7, r0)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r4 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r4.<init>(r7, r0)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r5 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r6 = 1061158912(0x3f400000, float:0.75)
            r5.<init>(r7, r6)
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS = r1
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r8 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r1 = 1058642330(0x3f19999a, float:0.6)
            r2 = 1063675494(0x3f666666, float:0.9)
            r9.<init>(r1, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r10 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r10.<init>(r7, r0)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r11 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r11.<init>(r7, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r12 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r3 = 1050253722(0x3e99999a, float:0.3)
            r12.<init>(r3, r2)
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS = r8
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r9 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r10 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r3 = 1053609165(0x3ecccccd, float:0.4)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r10.<init>(r4, r3)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r11 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r11.<init>(r4, r0)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r12 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r12.<init>(r4, r0)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r13 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r13.<init>(r4, r2)
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS_ARC = r9
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r10 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r11 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r11.<init>(r1, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r12 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r12.<init>(r7, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r13 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r13.<init>(r7, r2)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r14 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r14.<init>(r0, r2)
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS_ARC = r10
            return
    }

    public MaterialContainerTransform() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.drawDebugEnabled = r0
            r3.holdAtEndEnabled = r0
            r3.pathMotionCustom = r0
            r3.appliedThemeValues = r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            r3.drawingViewId = r1
            r1 = -1
            r3.startViewId = r1
            r3.endViewId = r1
            r3.containerColor = r0
            r3.startContainerColor = r0
            r3.endContainerColor = r0
            r1 = 1375731712(0x52000000, float:1.3743895E11)
            r3.scrimColor = r1
            r3.transitionDirection = r0
            r3.fadeMode = r0
            r3.fitMode = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L2d
            r0 = 1
        L2d:
            r3.elevationShadowEnabled = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.startElevation = r0
            r3.endElevation = r0
            return
    }

    public MaterialContainerTransform(@androidx.annotation.NonNull android.content.Context r5, boolean r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.drawDebugEnabled = r0
            r4.holdAtEndEnabled = r0
            r4.pathMotionCustom = r0
            r4.appliedThemeValues = r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            r4.drawingViewId = r1
            r1 = -1
            r4.startViewId = r1
            r4.endViewId = r1
            r4.containerColor = r0
            r4.startContainerColor = r0
            r4.endContainerColor = r0
            r1 = 1375731712(0x52000000, float:1.3743895E11)
            r4.scrimColor = r1
            r4.transitionDirection = r0
            r4.fadeMode = r0
            r4.fitMode = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            r3 = 1
            if (r1 < r2) goto L2e
            r0 = 1
        L2e:
            r4.elevationShadowEnabled = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.startElevation = r0
            r4.endElevation = r0
            r4.maybeApplyThemeValues(r5, r6)
            r4.appliedThemeValues = r3
            return
    }

    static /* synthetic */ boolean access$300(com.google.android.material.transition.MaterialContainerTransform r0) {
            boolean r0 = r0.holdAtEndEnabled
            return r0
    }

    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup buildThresholdsGroup(boolean r3) {
            r2 = this;
            androidx.transition.PathMotion r0 = r2.getPathMotion()
            boolean r1 = r0 instanceof androidx.transition.ArcMotion
            if (r1 != 0) goto L16
            boolean r0 = r0 instanceof com.google.android.material.transition.MaterialArcMotion
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r3 = r2.getThresholdsOrDefault(r3, r0, r1)
            return r3
        L16:
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_ENTER_THRESHOLDS_ARC
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r1 = com.google.android.material.transition.MaterialContainerTransform.DEFAULT_RETURN_THRESHOLDS_ARC
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r3 = r2.getThresholdsOrDefault(r3, r0, r1)
            return r3
    }

    private static android.graphics.RectF calculateDrawableBounds(android.view.View r0, @androidx.annotation.Nullable android.view.View r1, float r2, float r3) {
            if (r1 == 0) goto La
            android.graphics.RectF r0 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r1)
            r0.offset(r2, r3)
            return r0
        La:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r3 = 0
            r1.<init>(r3, r3, r2, r0)
            return r1
    }

    private static com.google.android.material.shape.ShapeAppearanceModel captureShapeAppearance(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull android.graphics.RectF r1, @androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r2) {
            com.google.android.material.shape.ShapeAppearanceModel r0 = getShapeAppearance(r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r0 = com.google.android.material.transition.TransitionUtils.convertToRelativeCornerSizes(r0, r1)
            return r0
    }

    private static void captureValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r2, @androidx.annotation.Nullable android.view.View r3, @androidx.annotation.IdRes int r4, @androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r5) {
            r0 = -1
            if (r4 == r0) goto Lc
            android.view.View r3 = r2.view
            android.view.View r3 = com.google.android.material.transition.TransitionUtils.findDescendantOrAncestorById(r3, r4)
            r2.view = r3
            goto L2d
        Lc:
            if (r3 == 0) goto L11
            r2.view = r3
            goto L2d
        L11:
            android.view.View r3 = r2.view
            int r4 = com.google.android.material.R.id.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L2d
            android.view.View r3 = r2.view
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r0 = r2.view
            r1 = 0
            r0.setTag(r4, r1)
            r2.view = r3
        L2d:
            android.view.View r3 = r2.view
            boolean r4 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r4 != 0) goto L43
            int r4 = r3.getWidth()
            if (r4 != 0) goto L43
            int r4 = r3.getHeight()
            if (r4 == 0) goto L42
            goto L43
        L42:
            return
        L43:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L4e
            android.graphics.RectF r4 = com.google.android.material.transition.TransitionUtils.getRelativeBounds(r3)
            goto L52
        L4e:
            android.graphics.RectF r4 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r3)
        L52:
            java.util.Map r0 = r2.values
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map r2 = r2.values
            java.lang.String r0 = "materialContainerTransition:shapeAppearance"
            com.google.android.material.shape.ShapeAppearanceModel r3 = captureShapeAppearance(r3, r4, r5)
            r2.put(r0, r3)
            return
    }

    private static float getElevationOrDefault(float r1, android.view.View r2) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L7
            return r1
        L7:
            float r1 = androidx.core.view.ViewCompat.getElevation(r2)
            return r1
    }

    private static com.google.android.material.shape.ShapeAppearanceModel getShapeAppearance(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r3) {
            if (r3 == 0) goto L3
            return r3
        L3:
            int r3 = com.google.android.material.R.id.mtrl_motion_snapshot_view
            java.lang.Object r0 = r2.getTag(r3)
            boolean r0 = r0 instanceof com.google.android.material.shape.ShapeAppearanceModel
            if (r0 == 0) goto L14
            java.lang.Object r2 = r2.getTag(r3)
            com.google.android.material.shape.ShapeAppearanceModel r2 = (com.google.android.material.shape.ShapeAppearanceModel) r2
            return r2
        L14:
            android.content.Context r3 = r2.getContext()
            int r0 = getTransitionShapeAppearanceResId(r3)
            r1 = -1
            if (r0 == r1) goto L29
            r2 = 0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder(r3, r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
        L29:
            boolean r3 = r2 instanceof com.google.android.material.shape.Shapeable
            if (r3 == 0) goto L34
            com.google.android.material.shape.Shapeable r2 = (com.google.android.material.shape.Shapeable) r2
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.getShapeAppearanceModel()
            return r2
        L34:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
    }

    private com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup getThresholdsOrDefault(boolean r7, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r8, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup r9) {
            r6 = this;
            if (r7 == 0) goto L3
            goto L4
        L3:
            r8 = r9
        L4:
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r0 = new com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r7 = r6.fadeProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$400(r8)
            java.lang.Object r7 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r7, r9)
            r1 = r7
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r1 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r1
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r7 = r6.scaleProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$500(r8)
            java.lang.Object r7 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r7, r9)
            r2 = r7
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r2 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r2
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r7 = r6.scaleMaskProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r9 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$600(r8)
            java.lang.Object r7 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r7, r9)
            r3 = r7
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r3 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r3
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r7 = r6.shapeMaskProgressThresholds
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r8 = com.google.android.material.transition.MaterialContainerTransform.ProgressThresholdsGroup.access$700(r8)
            java.lang.Object r7 = com.google.android.material.transition.TransitionUtils.defaultIfNull(r7, r8)
            r4 = r7
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r4 = (com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds) r4
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @androidx.annotation.StyleRes
    private static int getTransitionShapeAppearanceResId(android.content.Context r2) {
            int r0 = com.google.android.material.R.attr.transitionShapeAppearance
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r0)
            r0 = 0
            r1 = -1
            int r0 = r2.getResourceId(r0, r1)
            r2.recycle()
            return r0
    }

    private boolean isEntering(@androidx.annotation.NonNull android.graphics.RectF r4, @androidx.annotation.NonNull android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.transitionDirection
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L25
            r4 = 2
            if (r0 != r4) goto Lc
            return r1
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Invalid transition direction: "
            r5.append(r0)
            int r0 = r3.transitionDirection
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L25:
            return r2
        L26:
            float r5 = com.google.android.material.transition.TransitionUtils.calculateArea(r5)
            float r4 = com.google.android.material.transition.TransitionUtils.calculateArea(r4)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L33
            return r2
        L33:
            return r1
    }

    private void maybeApplyThemeValues(android.content.Context r3, boolean r4) {
            r2 = this;
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            com.google.android.material.transition.TransitionUtils.maybeApplyThemeInterpolator(r2, r3, r0, r1)
            if (r4 == 0) goto Lc
            int r4 = com.google.android.material.R.attr.motionDurationLong2
            goto Le
        Lc:
            int r4 = com.google.android.material.R.attr.motionDurationMedium4
        Le:
            com.google.android.material.transition.TransitionUtils.maybeApplyThemeDuration(r2, r3, r4)
            boolean r4 = r2.pathMotionCustom
            if (r4 != 0) goto L1a
            int r4 = com.google.android.material.R.attr.motionPath
            com.google.android.material.transition.TransitionUtils.maybeApplyThemePath(r2, r3, r4)
        L1a:
            return
    }

    public void captureEndValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r3.endView
            int r1 = r3.endViewId
            com.google.android.material.shape.ShapeAppearanceModel r2 = r3.endShapeAppearanceModel
            captureValues(r4, r0, r1, r2)
            return
    }

    public void captureStartValues(@androidx.annotation.NonNull androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r3.startView
            int r1 = r3.startViewId
            com.google.android.material.shape.ShapeAppearanceModel r2 = r3.startShapeAppearanceModel
            captureValues(r4, r0, r1, r2)
            return
    }

    @androidx.annotation.Nullable
    public android.animation.Animator createAnimator(@androidx.annotation.NonNull android.view.ViewGroup r28, @androidx.annotation.Nullable androidx.transition.TransitionValues r29, @androidx.annotation.Nullable androidx.transition.TransitionValues r30) {
            r27 = this;
            r1 = r27
            r0 = r29
            r2 = r30
            r3 = 0
            if (r0 == 0) goto L101
            if (r2 != 0) goto Ld
            goto L101
        Ld:
            java.util.Map r4 = r0.values
            java.lang.String r5 = "materialContainerTransition:bounds"
            java.lang.Object r4 = r4.get(r5)
            r9 = r4
            android.graphics.RectF r9 = (android.graphics.RectF) r9
            java.util.Map r4 = r0.values
            java.lang.String r6 = "materialContainerTransition:shapeAppearance"
            java.lang.Object r4 = r4.get(r6)
            r10 = r4
            com.google.android.material.shape.ShapeAppearanceModel r10 = (com.google.android.material.shape.ShapeAppearanceModel) r10
            if (r9 == 0) goto L101
            if (r10 != 0) goto L29
            goto L101
        L29:
            java.util.Map r4 = r2.values
            java.lang.Object r4 = r4.get(r5)
            r13 = r4
            android.graphics.RectF r13 = (android.graphics.RectF) r13
            java.util.Map r4 = r2.values
            java.lang.Object r4 = r4.get(r6)
            r14 = r4
            com.google.android.material.shape.ShapeAppearanceModel r14 = (com.google.android.material.shape.ShapeAppearanceModel) r14
            if (r13 == 0) goto L101
            if (r14 != 0) goto L41
            goto L101
        L41:
            android.view.View r4 = r0.view
            android.view.View r12 = r2.view
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L4d
            r0 = r12
            goto L4e
        L4d:
            r0 = r4
        L4e:
            int r2 = r1.drawingViewId
            int r5 = r0.getId()
            if (r2 != r5) goto L5e
            android.view.ViewParent r2 = r0.getParent()
            android.view.View r2 = (android.view.View) r2
            r3 = r0
            goto L64
        L5e:
            int r2 = r1.drawingViewId
            android.view.View r2 = com.google.android.material.transition.TransitionUtils.findAncestorById(r0, r2)
        L64:
            android.graphics.RectF r5 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r2)
            float r6 = r5.left
            float r6 = -r6
            float r5 = r5.top
            float r5 = -r5
            android.graphics.RectF r3 = calculateDrawableBounds(r2, r3, r6, r5)
            r9.offset(r6, r5)
            r13.offset(r6, r5)
            boolean r5 = r1.isEntering(r9, r13)
            boolean r6 = r1.appliedThemeValues
            if (r6 != 0) goto L87
            android.content.Context r0 = r0.getContext()
            r1.maybeApplyThemeValues(r0, r5)
        L87:
            com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable r6 = new com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable
            androidx.transition.PathMotion r7 = r1.getPathMotion()
            float r0 = r1.startElevation
            float r11 = getElevationOrDefault(r0, r4)
            float r0 = r1.endElevation
            float r15 = getElevationOrDefault(r0, r12)
            int r0 = r1.containerColor
            int r8 = r1.startContainerColor
            r16 = r0
            int r0 = r1.endContainerColor
            r18 = r0
            int r0 = r1.scrimColor
            r19 = r0
            boolean r0 = r1.elevationShadowEnabled
            r21 = r0
            int r0 = r1.fadeMode
            com.google.android.material.transition.FadeModeEvaluator r22 = com.google.android.material.transition.FadeModeEvaluators.get(r0, r5)
            int r0 = r1.fitMode
            com.google.android.material.transition.FitModeEvaluator r23 = com.google.android.material.transition.FitModeEvaluators.get(r0, r5, r9, r13)
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholdsGroup r24 = r1.buildThresholdsGroup(r5)
            boolean r0 = r1.drawDebugEnabled
            r26 = 0
            r25 = r0
            r20 = r5
            r17 = r8
            r8 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float r0 = r3.left
            int r0 = java.lang.Math.round(r0)
            float r5 = r3.top
            int r5 = java.lang.Math.round(r5)
            float r7 = r3.right
            int r7 = java.lang.Math.round(r7)
            float r3 = r3.bottom
            int r3 = java.lang.Math.round(r3)
            r6.setBounds(r0, r5, r7, r3)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0102: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            com.google.android.material.transition.MaterialContainerTransform$1 r0 = new com.google.android.material.transition.MaterialContainerTransform$1
            r0.<init>(r1, r6)
            r7.addUpdateListener(r0)
            com.google.android.material.transition.MaterialContainerTransform$2 r0 = new com.google.android.material.transition.MaterialContainerTransform$2
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r1.addListener(r0)
            return r7
        L101:
            return r3
    }

    @androidx.annotation.ColorInt
    public int getContainerColor() {
            r1 = this;
            int r0 = r1.containerColor
            return r0
    }

    @androidx.annotation.IdRes
    public int getDrawingViewId() {
            r1 = this;
            int r0 = r1.drawingViewId
            return r0
    }

    @androidx.annotation.ColorInt
    public int getEndContainerColor() {
            r1 = this;
            int r0 = r1.endContainerColor
            return r0
    }

    public float getEndElevation() {
            r1 = this;
            float r0 = r1.endElevation
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.shape.ShapeAppearanceModel getEndShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.endShapeAppearanceModel
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View getEndView() {
            r1 = this;
            android.view.View r0 = r1.endView
            return r0
    }

    @androidx.annotation.IdRes
    public int getEndViewId() {
            r1 = this;
            int r0 = r1.endViewId
            return r0
    }

    public int getFadeMode() {
            r1 = this;
            int r0 = r1.fadeMode
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getFadeProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.fadeProgressThresholds
            return r0
    }

    public int getFitMode() {
            r1 = this;
            int r0 = r1.fitMode
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getScaleMaskProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.scaleMaskProgressThresholds
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getScaleProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.scaleProgressThresholds
            return r0
    }

    @androidx.annotation.ColorInt
    public int getScrimColor() {
            r1 = this;
            int r0 = r1.scrimColor
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds getShapeMaskProgressThresholds() {
            r1 = this;
            com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds r0 = r1.shapeMaskProgressThresholds
            return r0
    }

    @androidx.annotation.ColorInt
    public int getStartContainerColor() {
            r1 = this;
            int r0 = r1.startContainerColor
            return r0
    }

    public float getStartElevation() {
            r1 = this;
            float r0 = r1.startElevation
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.shape.ShapeAppearanceModel getStartShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.startShapeAppearanceModel
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View getStartView() {
            r1 = this;
            android.view.View r0 = r1.startView
            return r0
    }

    @androidx.annotation.IdRes
    public int getStartViewId() {
            r1 = this;
            int r0 = r1.startViewId
            return r0
    }

    public int getTransitionDirection() {
            r1 = this;
            int r0 = r1.transitionDirection
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = com.google.android.material.transition.MaterialContainerTransform.TRANSITION_PROPS
            return r0
    }

    public boolean isDrawDebugEnabled() {
            r1 = this;
            boolean r0 = r1.drawDebugEnabled
            return r0
    }

    public boolean isElevationShadowEnabled() {
            r1 = this;
            boolean r0 = r1.elevationShadowEnabled
            return r0
    }

    public boolean isHoldAtEndEnabled() {
            r1 = this;
            boolean r0 = r1.holdAtEndEnabled
            return r0
    }

    public void setAllContainerColors(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.containerColor = r1
            r0.startContainerColor = r1
            r0.endContainerColor = r1
            return
    }

    public void setContainerColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.containerColor = r1
            return
    }

    public void setDrawDebugEnabled(boolean r1) {
            r0 = this;
            r0.drawDebugEnabled = r1
            return
    }

    public void setDrawingViewId(@androidx.annotation.IdRes int r1) {
            r0 = this;
            r0.drawingViewId = r1
            return
    }

    public void setElevationShadowEnabled(boolean r1) {
            r0 = this;
            r0.elevationShadowEnabled = r1
            return
    }

    public void setEndContainerColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.endContainerColor = r1
            return
    }

    public void setEndElevation(float r1) {
            r0 = this;
            r0.endElevation = r1
            return
    }

    public void setEndShapeAppearanceModel(@androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r1) {
            r0 = this;
            r0.endShapeAppearanceModel = r1
            return
    }

    public void setEndView(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            r0.endView = r1
            return
    }

    public void setEndViewId(@androidx.annotation.IdRes int r1) {
            r0 = this;
            r0.endViewId = r1
            return
    }

    public void setFadeMode(int r1) {
            r0 = this;
            r0.fadeMode = r1
            return
    }

    public void setFadeProgressThresholds(@androidx.annotation.Nullable com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.fadeProgressThresholds = r1
            return
    }

    public void setFitMode(int r1) {
            r0 = this;
            r0.fitMode = r1
            return
    }

    public void setHoldAtEndEnabled(boolean r1) {
            r0 = this;
            r0.holdAtEndEnabled = r1
            return
    }

    public void setPathMotion(@androidx.annotation.Nullable androidx.transition.PathMotion r1) {
            r0 = this;
            super.setPathMotion(r1)
            r1 = 1
            r0.pathMotionCustom = r1
            return
    }

    public void setScaleMaskProgressThresholds(@androidx.annotation.Nullable com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.scaleMaskProgressThresholds = r1
            return
    }

    public void setScaleProgressThresholds(@androidx.annotation.Nullable com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.scaleProgressThresholds = r1
            return
    }

    public void setScrimColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.scrimColor = r1
            return
    }

    public void setShapeMaskProgressThresholds(@androidx.annotation.Nullable com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds r1) {
            r0 = this;
            r0.shapeMaskProgressThresholds = r1
            return
    }

    public void setStartContainerColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.startContainerColor = r1
            return
    }

    public void setStartElevation(float r1) {
            r0 = this;
            r0.startElevation = r1
            return
    }

    public void setStartShapeAppearanceModel(@androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r1) {
            r0 = this;
            r0.startShapeAppearanceModel = r1
            return
    }

    public void setStartView(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            r0.startView = r1
            return
    }

    public void setStartViewId(@androidx.annotation.IdRes int r1) {
            r0 = this;
            r0.startViewId = r1
            return
    }

    public void setTransitionDirection(int r1) {
            r0 = this;
            r0.transitionDirection = r1
            return
    }
}
