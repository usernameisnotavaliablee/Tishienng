package androidx.camera.video.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class VideoValidatedEncoderProfilesProxy implements androidx.camera.core.impl.EncoderProfilesProxy {
    public VideoValidatedEncoderProfilesProxy() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy create(int r9, int r10, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> r11, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> r12) {
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r1 = "Should contain at least one VideoProfile."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            r0 = 0
            java.lang.Object r1 = r12.get(r0)
            r8 = r1
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r8 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r8
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L21
            java.lang.Object r0 = r11.get(r0)
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r0 = (androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy) r0
        L1f:
            r7 = r0
            goto L23
        L21:
            r0 = 0
            goto L1f
        L23:
            androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy r2 = new androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r12)
            java.util.List r6 = java.util.Collections.unmodifiableList(r11)
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy from(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy r3) {
            int r0 = r3.getDefaultDurationSeconds()
            int r1 = r3.getRecommendedFileFormat()
            java.util.List r2 = r3.getAudioProfiles()
            java.util.List r3 = r3.getVideoProfiles()
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r3 = create(r0, r1, r2, r3)
            return r3
    }

    @androidx.annotation.Nullable
    public abstract androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile();

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile();
}
