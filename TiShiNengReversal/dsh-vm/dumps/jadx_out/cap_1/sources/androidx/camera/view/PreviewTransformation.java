package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PreviewTransformation {
    private static final androidx.camera.view.PreviewView.ScaleType DEFAULT_SCALE_TYPE = null;
    private static final java.lang.String TAG = "PreviewTransform";
    private boolean mHasCameraTransform;
    private boolean mIsFrontCamera;
    private int mPreviewRotationDegrees;
    private android.util.Size mResolution;
    private androidx.camera.view.PreviewView.ScaleType mScaleType;
    private android.graphics.Matrix mSensorToBufferTransform;
    private android.graphics.Rect mSurfaceCropRect;
    private int mTargetRotation;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.view.PreviewTransformation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$view$PreviewView$ScaleType = null;

        static {
                androidx.camera.view.PreviewView$ScaleType[] r0 = androidx.camera.view.PreviewView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType = r0
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_END     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_START     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    static {
            androidx.camera.view.PreviewView$ScaleType r0 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER
            androidx.camera.view.PreviewTransformation.DEFAULT_SCALE_TYPE = r0
            return
    }

    PreviewTransformation() {
            r1 = this;
            r1.<init>()
            androidx.camera.view.PreviewView$ScaleType r0 = androidx.camera.view.PreviewTransformation.DEFAULT_SCALE_TYPE
            r1.mScaleType = r0
            return
    }

    private static android.graphics.RectF flipHorizontally(android.graphics.RectF r4, float r5) {
            android.graphics.RectF r0 = new android.graphics.RectF
            float r5 = r5 + r5
            float r1 = r4.right
            float r1 = r5 - r1
            float r2 = r4.top
            float r3 = r4.left
            float r5 = r5 - r3
            float r4 = r4.bottom
            r0.<init>(r1, r2, r5, r4)
            return r0
    }

    private int getRemainingRotationDegrees() {
            r1 = this;
            boolean r0 = r1.mHasCameraTransform
            if (r0 != 0) goto L7
            int r0 = r1.mPreviewRotationDegrees
            return r0
        L7:
            int r0 = r1.mTargetRotation
            int r0 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r0)
            int r0 = -r0
            return r0
    }

    private android.util.Size getRotatedViewportSize() {
            r3 = this;
            int r0 = r3.mPreviewRotationDegrees
            boolean r0 = androidx.camera.core.impl.utils.TransformUtils.is90or270(r0)
            if (r0 == 0) goto L1a
            android.util.Size r0 = new android.util.Size
            android.graphics.Rect r1 = r3.mSurfaceCropRect
            int r1 = r1.height()
            android.graphics.Rect r2 = r3.mSurfaceCropRect
            int r2 = r2.width()
            r0.<init>(r1, r2)
            return r0
        L1a:
            android.util.Size r0 = new android.util.Size
            android.graphics.Rect r1 = r3.mSurfaceCropRect
            int r1 = r1.width()
            android.graphics.Rect r2 = r3.mSurfaceCropRect
            int r2 = r2.height()
            r0.<init>(r1, r2)
            return r0
    }

    private android.graphics.RectF getTransformedSurfaceRect(android.util.Size r4, int r5) {
            r3 = this;
            boolean r0 = r3.isTransformationInfoReady()
            androidx.core.util.Preconditions.checkState(r0)
            android.graphics.Matrix r4 = r3.getSurfaceToPreviewViewMatrix(r4, r5)
            android.graphics.RectF r5 = new android.graphics.RectF
            android.util.Size r0 = r3.mResolution
            int r0 = r0.getWidth()
            float r0 = (float) r0
            android.util.Size r1 = r3.mResolution
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2 = 0
            r5.<init>(r2, r2, r0, r1)
            r4.mapRect(r5)
            return r5
    }

    private boolean isTransformationInfoReady() {
            r4 = this;
            boolean r0 = r4.mHasCameraTransform
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            int r0 = r4.mTargetRotation
            r3 = -1
            if (r0 == r3) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            android.graphics.Rect r3 = r4.mSurfaceCropRect
            if (r3 == 0) goto L1a
            android.util.Size r3 = r4.mResolution
            if (r3 == 0) goto L1a
            if (r0 == 0) goto L1a
            return r1
        L1a:
            return r2
    }

    private static void setMatrixRectToRect(android.graphics.Matrix r2, android.graphics.RectF r3, android.graphics.RectF r4, androidx.camera.view.PreviewView.ScaleType r5) {
            int[] r0 = androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2a;
                case 2: goto L2a;
                case 3: goto L27;
                case 4: goto L27;
                case 5: goto L24;
                case 6: goto L24;
                default: goto Lb;
            }
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected crop rect: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PreviewTransform"
            androidx.camera.core.Logger.e(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            goto L2c
        L24:
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.START
            goto L2c
        L27:
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.END
            goto L2c
        L2a:
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER
        L2c:
            androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER
            if (r5 == r1) goto L40
            androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START
            if (r5 == r1) goto L40
            androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END
            if (r5 != r1) goto L39
            goto L40
        L39:
            r2.setRectToRect(r4, r3, r0)
            r2.invert(r2)
            return
        L40:
            r2.setRectToRect(r3, r4, r0)
            return
    }

    android.graphics.Bitmap createTransformedBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r6, android.util.Size r7, int r8) {
            r5 = this;
            boolean r0 = r5.isTransformationInfoReady()
            if (r0 != 0) goto L7
            return r6
        L7:
            android.graphics.Matrix r0 = r5.getTextureViewCorrectionMatrix()
            android.graphics.RectF r8 = r5.getTransformedSurfaceRect(r7, r8)
            int r1 = r7.getWidth()
            int r7 = r7.getHeight()
            android.graphics.Bitmap$Config r2 = r6.getConfig()
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r7, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r7)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r2.postConcat(r0)
            float r0 = r8.width()
            android.util.Size r3 = r5.mResolution
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            float r3 = r8.height()
            android.util.Size r4 = r5.mResolution
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            r2.postScale(r0, r3)
            float r0 = r8.left
            float r8 = r8.top
            r2.postTranslate(r0, r8)
            android.graphics.Paint r8 = new android.graphics.Paint
            r0 = 7
            r8.<init>(r0)
            r1.drawBitmap(r6, r2, r8)
            return r7
    }

    @androidx.annotation.Nullable
    android.graphics.Matrix getPreviewViewToNormalizedSurfaceMatrix(android.util.Size r5, int r6) {
            r4 = this;
            boolean r0 = r4.isTransformationInfoReady()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.Matrix r5 = r4.getSurfaceToPreviewViewMatrix(r5, r6)
            r5.invert(r0)
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            android.graphics.RectF r6 = new android.graphics.RectF
            android.util.Size r1 = r4.mResolution
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.util.Size r2 = r4.mResolution
            int r2 = r2.getHeight()
            float r2 = (float) r2
            r3 = 0
            r6.<init>(r3, r3, r1, r2)
            android.graphics.RectF r1 = new android.graphics.RectF
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3, r3, r2, r2)
            android.graphics.Matrix$ScaleToFit r2 = android.graphics.Matrix.ScaleToFit.FILL
            r5.setRectToRect(r6, r1, r2)
            r0.postConcat(r5)
            return r0
    }

    android.graphics.RectF getPreviewViewViewportRectForMismatchedAspectRatios(android.util.Size r6, int r7) {
            r5 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r6.getWidth()
            float r1 = (float) r1
            int r2 = r6.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            android.util.Size r1 = r5.getRotatedViewportSize()
            android.graphics.RectF r2 = new android.graphics.RectF
            int r4 = r1.getWidth()
            float r4 = (float) r4
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2.<init>(r3, r3, r4, r1)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            androidx.camera.view.PreviewView$ScaleType r3 = r5.mScaleType
            setMatrixRectToRect(r1, r2, r0, r3)
            r1.mapRect(r2)
            r0 = 1
            if (r7 != r0) goto L40
            int r6 = r6.getWidth()
            float r6 = (float) r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            android.graphics.RectF r6 = flipHorizontally(r2, r6)
            return r6
        L40:
            return r2
    }

    androidx.camera.view.PreviewView.ScaleType getScaleType() {
            r1 = this;
            androidx.camera.view.PreviewView$ScaleType r0 = r1.mScaleType
            return r0
    }

    @androidx.annotation.Nullable
    android.graphics.Matrix getSensorToViewTransform(@androidx.annotation.NonNull android.util.Size r3, int r4) {
            r2 = this;
            boolean r0 = r2.isTransformationInfoReady()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r1 = r2.mSensorToBufferTransform
            r0.<init>(r1)
            android.graphics.Matrix r3 = r2.getSurfaceToPreviewViewMatrix(r3, r4)
            r0.postConcat(r3)
            return r0
    }

    @androidx.annotation.Nullable
    android.graphics.Rect getSurfaceCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.mSurfaceCropRect
            return r0
    }

    android.graphics.Matrix getSurfaceToPreviewViewMatrix(android.util.Size r4, int r5) {
            r3 = this;
            boolean r0 = r3.isTransformationInfoReady()
            androidx.core.util.Preconditions.checkState(r0)
            boolean r0 = r3.isViewportAspectRatioMatchPreviewView(r4)
            if (r0 == 0) goto L1e
            android.graphics.RectF r5 = new android.graphics.RectF
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r1 = 0
            r5.<init>(r1, r1, r0, r4)
            goto L22
        L1e:
            android.graphics.RectF r5 = r3.getPreviewViewViewportRectForMismatchedAspectRatios(r4, r5)
        L22:
            android.graphics.RectF r4 = new android.graphics.RectF
            android.graphics.Rect r0 = r3.mSurfaceCropRect
            r4.<init>(r0)
            int r0 = r3.mPreviewRotationDegrees
            android.graphics.Matrix r4 = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(r4, r5, r0)
            boolean r5 = r3.mIsFrontCamera
            if (r5 == 0) goto L66
            boolean r5 = r3.mHasCameraTransform
            if (r5 == 0) goto L66
            int r5 = r3.mPreviewRotationDegrees
            boolean r5 = androidx.camera.core.impl.utils.TransformUtils.is90or270(r5)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L55
            android.graphics.Rect r5 = r3.mSurfaceCropRect
            int r5 = r5.centerX()
            float r5 = (float) r5
            android.graphics.Rect r2 = r3.mSurfaceCropRect
            int r2 = r2.centerY()
            float r2 = (float) r2
            r4.preScale(r1, r0, r5, r2)
            return r4
        L55:
            android.graphics.Rect r5 = r3.mSurfaceCropRect
            int r5 = r5.centerX()
            float r5 = (float) r5
            android.graphics.Rect r2 = r3.mSurfaceCropRect
            int r2 = r2.centerY()
            float r2 = (float) r2
            r4.preScale(r0, r1, r5, r2)
        L66:
            return r4
    }

    @androidx.annotation.VisibleForTesting
    android.graphics.Matrix getTextureViewCorrectionMatrix() {
            r4 = this;
            boolean r0 = r4.isTransformationInfoReady()
            androidx.core.util.Preconditions.checkState(r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            android.util.Size r1 = r4.mResolution
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.util.Size r2 = r4.mResolution
            int r2 = r2.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            int r1 = r4.getRemainingRotationDegrees()
            android.graphics.Matrix r0 = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(r0, r0, r1)
            return r0
    }

    @androidx.annotation.VisibleForTesting
    boolean isViewportAspectRatioMatchPreviewView(android.util.Size r4) {
            r3 = this;
            android.util.Size r0 = r3.getRotatedViewportSize()
            r1 = 1
            r2 = 0
            boolean r4 = androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(r4, r1, r0, r2)
            return r4
    }

    void overrideWithDisplayRotation(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.mHasCameraTransform
            if (r0 != 0) goto L5
            return
        L5:
            r1.mPreviewRotationDegrees = r2
            r1.mTargetRotation = r3
            return
    }

    void setScaleType(androidx.camera.view.PreviewView.ScaleType r1) {
            r0 = this;
            r0.mScaleType = r1
            return
    }

    void setTransformationInfo(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest.TransformationInfo r3, android.util.Size r4, boolean r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Transformation info set: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PreviewTransform"
            androidx.camera.core.Logger.d(r1, r0)
            android.graphics.Rect r0 = r3.getCropRect()
            r2.mSurfaceCropRect = r0
            int r0 = r3.getRotationDegrees()
            r2.mPreviewRotationDegrees = r0
            int r0 = r3.getTargetRotation()
            r2.mTargetRotation = r0
            r2.mResolution = r4
            r2.mIsFrontCamera = r5
            boolean r4 = r3.hasCameraTransform()
            r2.mHasCameraTransform = r4
            android.graphics.Matrix r3 = r3.getSensorToBufferTransform()
            r2.mSensorToBufferTransform = r3
            return
    }

    void transformView(android.util.Size r6, int r7, @androidx.annotation.NonNull android.view.View r8) {
            r5 = this;
            int r0 = r6.getHeight()
            java.lang.String r1 = "PreviewTransform"
            if (r0 == 0) goto L91
            int r0 = r6.getWidth()
            if (r0 != 0) goto L10
            goto L91
        L10:
            boolean r0 = r5.isTransformationInfoReady()
            if (r0 != 0) goto L17
            return
        L17:
            boolean r0 = r8 instanceof android.view.TextureView
            if (r0 == 0) goto L26
            r0 = r8
            android.view.TextureView r0 = (android.view.TextureView) r0
            android.graphics.Matrix r1 = r5.getTextureViewCorrectionMatrix()
            r0.setTransform(r1)
            goto L51
        L26:
            android.view.Display r0 = r8.getDisplay()
            boolean r2 = r5.mHasCameraTransform
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r0 == 0) goto L3c
            int r0 = r0.getRotation()
            int r2 = r5.mTargetRotation
            if (r0 == r2) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            boolean r2 = r5.mHasCameraTransform
            if (r2 != 0) goto L48
            int r2 = r5.getRemainingRotationDegrees()
            if (r2 == 0) goto L48
            r3 = 1
        L48:
            if (r0 != 0) goto L4c
            if (r3 == 0) goto L51
        L4c:
            java.lang.String r0 = "Custom rotation not supported with SurfaceView/PERFORMANCE mode."
            androidx.camera.core.Logger.e(r1, r0)
        L51:
            android.graphics.RectF r6 = r5.getTransformedSurfaceRect(r6, r7)
            r7 = 0
            r8.setPivotX(r7)
            r8.setPivotY(r7)
            float r7 = r6.width()
            android.util.Size r0 = r5.mResolution
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r7 = r7 / r0
            r8.setScaleX(r7)
            float r7 = r6.height()
            android.util.Size r0 = r5.mResolution
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            r8.setScaleY(r7)
            float r7 = r6.left
            int r0 = r8.getLeft()
            float r0 = (float) r0
            float r7 = r7 - r0
            r8.setTranslationX(r7)
            float r6 = r6.top
            int r7 = r8.getTop()
            float r7 = (float) r7
            float r6 = r6 - r7
            r8.setTranslationY(r6)
            return
        L91:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Transform not applied due to PreviewView size: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            androidx.camera.core.Logger.w(r1, r6)
            return
    }
}
