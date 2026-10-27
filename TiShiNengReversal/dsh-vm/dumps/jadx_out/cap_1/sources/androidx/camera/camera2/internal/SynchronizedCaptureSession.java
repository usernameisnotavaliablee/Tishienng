package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SynchronizedCaptureSession {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class StateCallback {
        public StateCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        void onActive(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        @androidx.annotation.RequiresApi(api = 26)
        void onCaptureQueueEmpty(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        public void onClosed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        public void onConfigureFailed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        void onConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        void onReady(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        void onSessionFinished(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        @androidx.annotation.RequiresApi(api = 23)
        void onSurfacePrepared(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1, @androidx.annotation.NonNull android.view.Surface r2) {
                r0 = this;
                return
        }
    }

    void abortCaptures() throws android.hardware.camera2.CameraAccessException;

    int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r1, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) throws android.hardware.camera2.CameraAccessException;

    int captureBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

    int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) throws android.hardware.camera2.CameraAccessException;

    int captureSingleRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

    void close();

    void finishClose();

    @androidx.annotation.NonNull
    android.hardware.camera2.CameraDevice getDevice();

    @androidx.annotation.Nullable
    android.view.Surface getInputSurface();

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOpeningBlocker();

    @androidx.annotation.NonNull
    androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback getStateCallback();

    int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r1, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) throws android.hardware.camera2.CameraAccessException;

    int setRepeatingBurstRequests(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CaptureRequest> r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

    int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r2) throws android.hardware.camera2.CameraAccessException;

    int setSingleRepeatingRequest(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback r3) throws android.hardware.camera2.CameraAccessException;

    void stopRepeating() throws android.hardware.camera2.CameraAccessException;

    @androidx.annotation.NonNull
    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat();
}
