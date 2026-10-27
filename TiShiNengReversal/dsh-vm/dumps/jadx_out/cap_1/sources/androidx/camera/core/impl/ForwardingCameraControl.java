package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ForwardingCameraControl implements androidx.camera.core.impl.CameraControlInternal {
    private final androidx.camera.core.impl.CameraControlInternal mCameraControlInternal;

    public ForwardingCameraControl(@androidx.annotation.NonNull androidx.camera.core.impl.CameraControlInternal r1) {
            r0 = this;
            r0.<init>()
            r0.mCameraControlInternal = r1
            return
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            r0.addInteropConfig(r2)
            return
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            r0.addZslConfig(r2)
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            com.google.common.util.concurrent.ListenableFuture r0 = r0.cancelFocusAndMetering()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            r0.clearInteropConfig()
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            com.google.common.util.concurrent.ListenableFuture r2 = r0.enableTorch(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            int r0 = r0.getFlashMode()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraControlInternal getImplementation() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            androidx.camera.core.impl.CameraControlInternal r0 = r0.getImplementation()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Config getInteropConfig() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            androidx.camera.core.impl.Config r0 = r0.getInteropConfig()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public android.graphics.Rect getSensorRect() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            android.graphics.Rect r0 = r0.getSensorRect()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            androidx.camera.core.impl.SessionConfig r0 = r0.getSessionConfig()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            boolean r0 = r0.isZslDisabledByByUserCaseConfig()
            return r0
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setExposureCompensationIndex(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            r0.setFlashMode(r2)
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setLinearZoom(r2)
            return r2
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            com.google.common.util.concurrent.ListenableFuture r2 = r0.setZoomRatio(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            r0.setZslDisabledByUserCaseConfig(r2)
            return
    }

    @Override // androidx.camera.core.CameraControl
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r2) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            com.google.common.util.concurrent.ListenableFuture r2 = r0.startFocusAndMetering(r2)
            return r2
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r2, int r3, int r4) {
            r1 = this;
            androidx.camera.core.impl.CameraControlInternal r0 = r1.mCameraControlInternal
            com.google.common.util.concurrent.ListenableFuture r2 = r0.submitStillCaptureRequests(r2, r3, r4)
            return r2
    }
}
