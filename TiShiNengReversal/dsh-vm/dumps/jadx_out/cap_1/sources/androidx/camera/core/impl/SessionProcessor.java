package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SessionProcessor {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CaptureCallback {
        void onCaptureCompleted(long r1, int r3, @androidx.annotation.NonNull java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> r4);

        void onCaptureFailed(int r1);

        void onCaptureProcessStarted(int r1);

        void onCaptureSequenceAborted(int r1);

        void onCaptureSequenceCompleted(int r1);

        void onCaptureStarted(int r1, long r2);
    }

    void abortCapture(int r1);

    void deInitSession();

    @androidx.annotation.Nullable
    android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeCaptureLatency();

    @androidx.annotation.NonNull
    @androidx.camera.core.impl.RestrictedCameraControl.CameraOperation
    java.util.Set<java.lang.Integer> getSupportedCameraOperations();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.SessionConfig initSession(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1, @androidx.annotation.NonNull androidx.camera.core.impl.OutputSurface r2, @androidx.annotation.NonNull androidx.camera.core.impl.OutputSurface r3, @androidx.annotation.Nullable androidx.camera.core.impl.OutputSurface r4);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor r1);

    void setParameters(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1);

    int startCapture(@androidx.annotation.NonNull androidx.camera.core.impl.SessionProcessor.CaptureCallback r1);

    int startRepeating(@androidx.annotation.NonNull androidx.camera.core.impl.SessionProcessor.CaptureCallback r1);

    int startTrigger(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1, @androidx.annotation.NonNull androidx.camera.core.impl.SessionProcessor.CaptureCallback r2);

    void stopRepeating();
}
