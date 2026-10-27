package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface AudioStream {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AudioStreamCallback {
        void onSilenceStateChanged(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AudioStreamException extends java.lang.Exception {
        public AudioStreamException() {
                r0 = this;
                r0.<init>()
                return
        }

        public AudioStreamException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public AudioStreamException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public AudioStreamException(@androidx.annotation.NonNull java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class PacketInfo {
        public PacketInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.video.internal.audio.AudioStream.PacketInfo of(int r1, long r2) {
                androidx.camera.video.internal.audio.AutoValue_AudioStream_PacketInfo r0 = new androidx.camera.video.internal.audio.AutoValue_AudioStream_PacketInfo
                r0.<init>(r1, r2)
                return r0
        }

        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();
    }

    @androidx.annotation.NonNull
    androidx.camera.video.internal.audio.AudioStream.PacketInfo read(@androidx.annotation.NonNull java.nio.ByteBuffer r1);

    void release();

    void setCallback(@androidx.annotation.Nullable androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback r1, @androidx.annotation.Nullable java.util.concurrent.Executor r2);

    void start() throws androidx.camera.video.internal.audio.AudioStream.AudioStreamException, java.lang.IllegalStateException;

    void stop() throws java.lang.IllegalStateException;
}
