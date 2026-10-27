package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ForwardingCameraInfo implements androidx.camera.core.impl.CameraInfoInternal {
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfoInternal;

    public ForwardingCameraInfo(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInfoInternal r1) {
            r0 = this;
            r0.<init>()
            r0.mCameraInfoInternal = r1
            return
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r3) {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            r0.addSessionCaptureCallback(r2, r3)
            return
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.lang.String getCameraId() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            java.lang.String r0 = r0.getCameraId()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Quirks getCameraQuirks() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.camera.core.impl.Quirks r0 = r0.getCameraQuirks()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.CameraSelector getCameraSelector() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.camera.core.CameraSelector r0 = r0.getCameraSelector()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.core.CameraState> getCameraState() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.lifecycle.LiveData r0 = r0.getCameraState()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.EncoderProfilesProvider getEncoderProfilesProvider() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r0.getEncoderProfilesProvider()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.camera.core.ExposureState getExposureState() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.camera.core.ExposureState r0 = r0.getExposureState()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraInfoInternal getImplementation() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.camera.core.impl.CameraInfoInternal r0 = r0.getImplementation()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public java.lang.String getImplementationType() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            java.lang.String r0 = r0.getImplementationType()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public float getIntrinsicZoomRatio() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            float r0 = r0.getIntrinsicZoomRatio()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            int r0 = r0.getLensFacing()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            int r0 = r0.getSensorRotationDegrees()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            int r2 = r0.getSensorRotationDegrees(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            java.util.Set r0 = r0.getSupportedDynamicRanges()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            java.util.Set r0 = r0.getSupportedFrameRateRanges()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> getSupportedHighResolutions(int r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            java.util.List r2 = r0.getSupportedHighResolutions(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public java.util.List<android.util.Size> getSupportedResolutions(int r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            java.util.List r2 = r0.getSupportedResolutions(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Timebase getTimebase() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.camera.core.impl.Timebase r0 = r0.getTimebase()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<java.lang.Integer> getTorchState() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.lifecycle.LiveData r0 = r0.getTorchState()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            androidx.lifecycle.LiveData r0 = r0.getZoomState()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            boolean r0 = r0.hasFlashUnit()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            boolean r2 = r0.isFocusMeteringSupported(r2)
            return r2
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            boolean r0 = r0.isPrivateReprocessingSupported()
            return r0
    }

    @Override // androidx.camera.core.CameraInfo
    @androidx.camera.core.ExperimentalZeroShutterLag
    public boolean isZslSupported() {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            boolean r0 = r0.isZslSupported()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInfoInternal r0 = r1.mCameraInfoInternal
            r0.removeSessionCaptureCallback(r2)
            return
    }
}
