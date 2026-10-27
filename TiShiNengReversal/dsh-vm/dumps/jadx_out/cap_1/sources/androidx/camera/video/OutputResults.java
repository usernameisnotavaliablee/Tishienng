package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class OutputResults {
    public OutputResults() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.OutputResults of(@androidx.annotation.NonNull android.net.Uri r1) {
            java.lang.String r0 = "OutputUri cannot be null."
            androidx.core.util.Preconditions.checkNotNull(r1, r0)
            androidx.camera.video.AutoValue_OutputResults r0 = new androidx.camera.video.AutoValue_OutputResults
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public abstract android.net.Uri getOutputUri();
}
