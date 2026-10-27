package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(30)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AndroidRZoomImpl implements androidx.camera.camera2.internal.ZoomControl.ZoomImpl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private float mCurrentZoomRatio;
    private float mPendingZoomRatio;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mPendingZoomRatioCompleter;
    private final android.util.Range<java.lang.Float> mZoomRatioRange;

    AndroidRZoomImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mCurrentZoomRatio = r0
            r1.mPendingZoomRatio = r0
            r1.mCameraCharacteristics = r2
            android.hardware.camera2.CameraCharacteristics$Key r0 = androidx.camera.camera2.internal.b.a()
            java.lang.Object r2 = r2.get(r0)
            android.util.Range r2 = (android.util.Range) r2
            r1.mZoomRatioRange = r2
            return
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void addRequestOption(@androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r3) {
            r2 = this;
            android.hardware.camera2.CaptureRequest$Key r0 = androidx.camera.camera2.internal.a.a()
            float r1 = r2.mCurrentZoomRatio
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.setCaptureRequestOption(r0, r1)
            return
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropSensorRegion() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
            r1 = this;
            android.util.Range<java.lang.Float> r0 = r1.mZoomRatioRange
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
            r1 = this;
            android.util.Range<java.lang.Float> r0 = r1.mZoomRatioRange
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(@androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r3) {
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mPendingZoomRatioCompleter
            if (r0 == 0) goto L2b
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            r0 = 0
            if (r3 != 0) goto Ld
            r3 = r0
            goto L17
        Ld:
            android.hardware.camera2.CaptureRequest$Key r1 = androidx.camera.camera2.internal.a.a()
            java.lang.Object r3 = r3.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
        L17:
            if (r3 != 0) goto L1a
            goto L2b
        L1a:
            float r3 = r3.floatValue()
            float r1 = r2.mPendingZoomRatio
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L2b
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mPendingZoomRatioCompleter
            r3.set(r0)
            r2.mPendingZoomRatioCompleter = r0
        L2b:
            return
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mCurrentZoomRatio = r0
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r3.mPendingZoomRatioCompleter
            if (r0 == 0) goto L15
            androidx.camera.core.CameraControl$OperationCanceledException r1 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r2 = "Camera is not active."
            r1.<init>(r2)
            r0.setException(r1)
            r0 = 0
            r3.mPendingZoomRatioCompleter = r0
        L15:
            return
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float r3, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r4) {
            r2 = this;
            r2.mCurrentZoomRatio = r3
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mPendingZoomRatioCompleter
            if (r3 == 0) goto L10
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "There is a new zoomRatio being set"
            r0.<init>(r1)
            r3.setException(r0)
        L10:
            float r3 = r2.mCurrentZoomRatio
            r2.mPendingZoomRatio = r3
            r2.mPendingZoomRatioCompleter = r4
            return
    }
}
