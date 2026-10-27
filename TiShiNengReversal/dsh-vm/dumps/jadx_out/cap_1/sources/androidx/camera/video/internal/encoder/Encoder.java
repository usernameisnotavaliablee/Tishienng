package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Encoder {
    public static final long NO_TIMESTAMP = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ByteBufferInput extends androidx.camera.video.internal.encoder.Encoder.EncoderInput, androidx.camera.video.internal.BufferProvider<androidx.camera.video.internal.encoder.InputBuffer> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface EncoderInput {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SurfaceInput extends androidx.camera.video.internal.encoder.Encoder.EncoderInput {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public interface OnSurfaceUpdateListener {
            void onSurfaceUpdate(@androidx.annotation.NonNull android.view.Surface r1);
        }

        void setOnSurfaceUpdateListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener r2);
    }

    int getConfiguredBitrate();

    @androidx.annotation.NonNull
    androidx.camera.video.internal.encoder.EncoderInfo getEncoderInfo();

    @androidx.annotation.NonNull
    androidx.camera.video.internal.encoder.Encoder.EncoderInput getInput();

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getReleasedFuture();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncoderCallback r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2);

    void start();

    void stop();

    void stop(long r1);
}
