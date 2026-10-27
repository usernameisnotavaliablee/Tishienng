package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface RequestProcessor {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Callback {
        void onCaptureBufferLost(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r1, long r2, int r4);

        void onCaptureCompleted(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r1, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r2);

        void onCaptureFailed(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r1, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure r2);

        void onCaptureProgressed(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r1, @androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r2);

        void onCaptureSequenceAborted(int r1);

        void onCaptureSequenceCompleted(int r1, long r2);

        void onCaptureStarted(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r1, long r2, long r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Request {
        @androidx.annotation.NonNull
        androidx.camera.core.impl.Config getParameters();

        @androidx.annotation.NonNull
        java.util.List<java.lang.Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r1, @androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Callback r2);

    void stopRepeating();

    int submit(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r1, @androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Callback r2);

    int submit(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.RequestProcessor.Request> r1, @androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Callback r2);
}
