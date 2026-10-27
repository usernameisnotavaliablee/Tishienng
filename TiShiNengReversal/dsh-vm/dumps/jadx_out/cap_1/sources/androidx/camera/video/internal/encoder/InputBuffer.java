package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface InputBuffer {
    boolean cancel();

    @androidx.annotation.NonNull
    java.nio.ByteBuffer getByteBuffer();

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getTerminationFuture();

    void setEndOfStream(boolean r1);

    void setPresentationTimeUs(long r1);

    boolean submit();
}
