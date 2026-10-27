package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CropRegionZoomImpl implements androidx.camera.camera2.internal.ZoomControl.ZoomImpl {
    public static final float MIN_DIGITAL_ZOOM = 1.0f;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private android.graphics.Rect mCurrentCropRect;
    private android.graphics.Rect mPendingZoomCropRegion;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mPendingZoomRatioCompleter;

    CropRegionZoomImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCurrentCropRect = r0
            r1.mPendingZoomCropRegion = r0
            r1.mCameraCharacteristics = r2
            return
    }

    @androidx.annotation.NonNull
    private static android.graphics.Rect getCropRectByRatio(@androidx.annotation.NonNull android.graphics.Rect r5, float r6) {
            int r0 = r5.width()
            float r0 = (float) r0
            float r0 = r0 / r6
            int r1 = r5.height()
            float r1 = (float) r1
            float r1 = r1 / r6
            int r6 = r5.width()
            float r6 = (float) r6
            float r6 = r6 - r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r2
            int r5 = r5.height()
            float r5 = (float) r5
            float r5 = r5 - r1
            float r5 = r5 / r2
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = (int) r6
            int r4 = (int) r5
            float r6 = r6 + r0
            int r6 = (int) r6
            float r5 = r5 + r1
            int r5 = (int) r5
            r2.<init>(r3, r4, r6, r5)
            return r2
    }

    private android.graphics.Rect getSensorRect() {
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
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    public void addRequestOption(@androidx.annotation.NonNull androidx.camera.camera2.impl.Camera2ImplConfig.Builder r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.mCurrentCropRect
            if (r0 == 0) goto L9
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            r3.setCaptureRequestOption(r1, r0)
        L9:
            return
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    @androidx.annotation.NonNull
    public android.graphics.Rect getCropSensorRegion() {
            r1 = this;
            android.graphics.Rect r0 = r1.mCurrentCropRect
            if (r0 == 0) goto L5
            return r0
        L5:
            android.graphics.Rect r0 = r1.getSensorRect()
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
            r3 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r3.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 != 0) goto Lf
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        Lf:
            float r1 = r0.floatValue()
            float r2 = r3.getMinZoom()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L20
            float r0 = r3.getMinZoom()
            return r0
        L20:
            float r0 = r0.floatValue()
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(@androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r3) {
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mPendingZoomRatioCompleter
            if (r0 == 0) goto L28
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            r0 = 0
            if (r3 != 0) goto Ld
            r3 = r0
            goto L15
        Ld:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            java.lang.Object r3 = r3.get(r1)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
        L15:
            android.graphics.Rect r1 = r2.mPendingZoomCropRegion
            if (r1 == 0) goto L28
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L28
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mPendingZoomRatioCompleter
            r3.set(r0)
            r2.mPendingZoomRatioCompleter = r0
            r2.mPendingZoomCropRegion = r0
        L28:
            return
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
            r4 = this;
            r0 = 0
            r4.mPendingZoomCropRegion = r0
            r4.mCurrentCropRect = r0
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r4.mPendingZoomRatioCompleter
            if (r1 == 0) goto L15
            androidx.camera.core.CameraControl$OperationCanceledException r2 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r3 = "Camera is not active."
            r2.<init>(r3)
            r1.setException(r2)
            r4.mPendingZoomRatioCompleter = r0
        L15:
            return
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float r3, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r4) {
            r2 = this;
            android.graphics.Rect r0 = r2.getSensorRect()
            android.graphics.Rect r3 = getCropRectByRatio(r0, r3)
            r2.mCurrentCropRect = r3
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mPendingZoomRatioCompleter
            if (r3 == 0) goto L18
            androidx.camera.core.CameraControl$OperationCanceledException r0 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "There is a new zoomRatio being set"
            r0.<init>(r1)
            r3.setException(r0)
        L18:
            android.graphics.Rect r3 = r2.mCurrentCropRect
            r2.mPendingZoomCropRegion = r3
            r2.mPendingZoomRatioCompleter = r4
            return
    }
}
