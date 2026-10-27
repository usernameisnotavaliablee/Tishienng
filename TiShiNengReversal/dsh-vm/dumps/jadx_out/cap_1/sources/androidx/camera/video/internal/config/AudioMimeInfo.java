package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AudioMimeInfo extends androidx.camera.video.internal.config.MimeInfo {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder extends androidx.camera.video.internal.config.MimeInfo.Builder<androidx.camera.video.internal.config.AudioMimeInfo.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.config.AudioMimeInfo build();

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.camera.video.internal.config.MimeInfo build() {
                r1 = this;
                androidx.camera.video.internal.config.AudioMimeInfo r0 = r1.build()
                return r0
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.video.internal.config.AudioMimeInfo.Builder setCompatibleAudioProfile(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy r1);
    }

    public AudioMimeInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.config.AudioMimeInfo.Builder builder(@androidx.annotation.NonNull java.lang.String r1) {
            androidx.camera.video.internal.config.AutoValue_AudioMimeInfo$Builder r0 = new androidx.camera.video.internal.config.AutoValue_AudioMimeInfo$Builder
            r0.<init>()
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r1 = r0.setMimeType(r1)
            r0 = -1
            java.lang.Object r1 = r1.setProfile(r0)
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r1 = (androidx.camera.video.internal.config.AudioMimeInfo.Builder) r1
            return r1
    }

    @androidx.annotation.Nullable
    public abstract androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getCompatibleAudioProfile();
}
