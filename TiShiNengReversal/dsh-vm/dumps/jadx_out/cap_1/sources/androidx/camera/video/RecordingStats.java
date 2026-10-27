package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RecordingStats {
    RecordingStats() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.RecordingStats of(long r8, long r10, @androidx.annotation.NonNull androidx.camera.video.AudioStats r12) {
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            java.lang.String r5 = "duration must be positive value."
            androidx.core.util.Preconditions.checkArgument(r4, r5)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto L15
            r0 = 1
        L15:
            java.lang.String r1 = "bytes must be positive value."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            androidx.camera.video.AutoValue_RecordingStats r2 = new androidx.camera.video.AutoValue_RecordingStats
            r3 = r8
            r5 = r10
            r7 = r12
            r2.<init>(r3, r5, r7)
            return r2
    }

    @androidx.annotation.NonNull
    public abstract androidx.camera.video.AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();
}
