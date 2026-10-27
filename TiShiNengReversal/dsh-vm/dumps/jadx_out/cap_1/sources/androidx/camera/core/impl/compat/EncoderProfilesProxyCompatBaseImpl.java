package androidx.camera.core.impl.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class EncoderProfilesProxyCompatBaseImpl {
    private EncoderProfilesProxyCompatBaseImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.EncoderProfilesProxy from(@androidx.annotation.NonNull android.media.CamcorderProfile r3) {
            int r0 = r3.duration
            int r1 = r3.fileFormat
            java.util.List r2 = toAudioProfiles(r3)
            java.util.List r3 = toVideoProfiles(r3)
            androidx.camera.core.impl.EncoderProfilesProxy$ImmutableEncoderProfilesProxy r3 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(r0, r1, r2, r3)
            return r3
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> toAudioProfiles(@androidx.annotation.NonNull android.media.CamcorderProfile r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.audioCodec
            java.lang.String r2 = androidx.camera.core.impl.x.a(r1)
            int r3 = r7.audioBitRate
            int r4 = r7.audioSampleRate
            int r5 = r7.audioChannels
            int r7 = r7.audioCodec
            int r6 = androidx.camera.core.impl.x.b(r7)
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r7 = androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.create(r1, r2, r3, r4, r5, r6)
            r0.add(r7)
            return r0
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> toVideoProfiles(@androidx.annotation.NonNull android.media.CamcorderProfile r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.videoCodec
            java.lang.String r2 = androidx.camera.core.impl.x.c(r1)
            int r3 = r11.videoBitRate
            int r4 = r11.videoFrameRate
            int r5 = r11.videoFrameWidth
            int r6 = r11.videoFrameHeight
            r9 = 0
            r10 = 0
            r7 = -1
            r8 = 8
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r11 = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.add(r11)
            return r0
    }
}
