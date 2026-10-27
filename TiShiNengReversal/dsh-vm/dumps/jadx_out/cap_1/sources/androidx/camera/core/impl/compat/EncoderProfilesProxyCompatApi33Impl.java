package androidx.camera.core.impl.compat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(33)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class EncoderProfilesProxyCompatApi33Impl {
    private EncoderProfilesProxyCompatApi33Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.EncoderProfilesProxy from(@androidx.annotation.NonNull android.media.EncoderProfiles r3) {
            int r0 = r3.getDefaultDurationSeconds()
            int r1 = r3.getRecommendedFileFormat()
            java.util.List r2 = r3.getAudioProfiles()
            java.util.List r2 = fromAudioProfiles(r2)
            java.util.List r3 = r3.getVideoProfiles()
            java.util.List r3 = fromVideoProfiles(r3)
            androidx.camera.core.impl.EncoderProfilesProxy$ImmutableEncoderProfilesProxy r3 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(r0, r1, r2, r3)
            return r3
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> fromAudioProfiles(@androidx.annotation.NonNull java.util.List<android.media.EncoderProfiles.AudioProfile> r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r8.next()
            android.media.EncoderProfiles$AudioProfile r1 = (android.media.EncoderProfiles.AudioProfile) r1
            int r2 = r1.getCodec()
            java.lang.String r3 = r1.getMediaType()
            int r4 = r1.getBitrate()
            int r5 = r1.getSampleRate()
            int r6 = r1.getChannels()
            int r7 = r1.getProfile()
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r1 = androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.create(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
            goto L9
        L35:
            return r0
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> fromVideoProfiles(@androidx.annotation.NonNull java.util.List<android.media.EncoderProfiles.VideoProfile> r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L9:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r12.next()
            android.media.EncoderProfiles$VideoProfile r1 = (android.media.EncoderProfiles.VideoProfile) r1
            int r2 = r1.getCodec()
            java.lang.String r3 = r1.getMediaType()
            int r4 = r1.getBitrate()
            int r5 = r1.getFrameRate()
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            int r8 = r1.getProfile()
            int r9 = r1.getBitDepth()
            int r10 = r1.getChromaSubsampling()
            int r11 = r1.getHdrFormat()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.add(r1)
            goto L9
        L45:
            return r0
    }
}
