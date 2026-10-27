package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraControlInternal extends androidx.camera.core.CameraControl {
    public static final androidx.camera.core.impl.CameraControlInternal DEFAULT_EMPTY_INSTANCE = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CameraControlException extends java.lang.Exception {

        @androidx.annotation.NonNull
        private androidx.camera.core.impl.CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure r1) {
                r0 = this;
                r0.<init>()
                r0.mCameraCaptureFailure = r1
                return
        }

        public CameraControlException(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r2)
                r0.mCameraCaptureFailure = r1
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.CameraCaptureFailure getCameraCaptureFailure() {
                r1 = this;
                androidx.camera.core.impl.CameraCaptureFailure r0 = r1.mCameraCaptureFailure
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r1);

        void onCameraControlUpdateSessionConfig();
    }

    static {
            androidx.camera.core.impl.CameraControlInternal$1 r0 = new androidx.camera.core.impl.CameraControlInternal$1
            r0.<init>()
            androidx.camera.core.impl.CameraControlInternal.DEFAULT_EMPTY_INSTANCE = r0
            return
    }

    void addInteropConfig(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1);

    void addZslConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r1);

    void clearInteropConfig();

    int getFlashMode();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraControlInternal getImplementation();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.Config getInteropConfig();

    @androidx.annotation.NonNull
    android.graphics.Rect getSensorRect();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig getSessionConfig();

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int r1);

    void setZslDisabledByUserCaseConfig(boolean r1);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r1, int r2, int r3);
}
