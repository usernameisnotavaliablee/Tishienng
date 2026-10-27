package androidx.camera.video.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_VideoValidatedEncoderProfilesProxy extends androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy {
    private final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> audioProfiles;
    private final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy defaultAudioProfile;
    private final int defaultDurationSeconds;
    private final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile;
    private final int recommendedFileFormat;
    private final java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles;

    AutoValue_VideoValidatedEncoderProfilesProxy(int r1, int r2, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> r3, java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> r4, @androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy r5, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r6) {
            r0 = this;
            r0.<init>()
            r0.defaultDurationSeconds = r1
            r0.recommendedFileFormat = r2
            if (r3 == 0) goto L26
            r0.audioProfiles = r3
            if (r4 == 0) goto L1e
            r0.videoProfiles = r4
            r0.defaultAudioProfile = r5
            if (r6 == 0) goto L16
            r0.defaultVideoProfile = r6
            return
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null defaultVideoProfile"
            r1.<init>(r2)
            throw r1
        L1e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null videoProfiles"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null audioProfiles"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
            r2 = 0
            if (r1 == 0) goto L55
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r5 = (androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy) r5
            int r1 = r4.defaultDurationSeconds
            int r3 = r5.getDefaultDurationSeconds()
            if (r1 != r3) goto L55
            int r1 = r4.recommendedFileFormat
            int r3 = r5.getRecommendedFileFormat()
            if (r1 != r3) goto L55
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy> r1 = r4.audioProfiles
            java.util.List r3 = r5.getAudioProfiles()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L55
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy> r1 = r4.videoProfiles
            java.util.List r3 = r5.getVideoProfiles()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L55
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r1 = r4.defaultAudioProfile
            if (r1 != 0) goto L3e
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r1 = r5.getDefaultAudioProfile()
            if (r1 != 0) goto L55
            goto L48
        L3e:
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r3 = r5.getDefaultAudioProfile()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L55
        L48:
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = r4.defaultVideoProfile
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r5 = r5.getDefaultVideoProfile()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L55
            return r0
        L55:
            return r2
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy> r0 = r1.audioProfiles
            return r0
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile() {
            r1 = this;
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r0 = r1.defaultAudioProfile
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getDefaultDurationSeconds() {
            r1 = this;
            int r0 = r1.defaultDurationSeconds
            return r0
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile() {
            r1 = this;
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r0 = r1.defaultVideoProfile
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getRecommendedFileFormat() {
            r1 = this;
            int r0 = r1.recommendedFileFormat
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy> r0 = r1.videoProfiles
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.defaultDurationSeconds
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.recommendedFileFormat
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy> r2 = r3.audioProfiles
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy> r2 = r3.videoProfiles
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r2 = r3.defaultAudioProfile
            if (r2 != 0) goto L25
            r2 = 0
            goto L29
        L25:
            int r2 = r2.hashCode()
        L29:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = r3.defaultVideoProfile
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds="
            r0.append(r1)
            int r1 = r2.defaultDurationSeconds
            r0.append(r1)
            java.lang.String r1 = ", recommendedFileFormat="
            r0.append(r1)
            int r1 = r2.recommendedFileFormat
            r0.append(r1)
            java.lang.String r1 = ", audioProfiles="
            r0.append(r1)
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy> r1 = r2.audioProfiles
            r0.append(r1)
            java.lang.String r1 = ", videoProfiles="
            r0.append(r1)
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy> r1 = r2.videoProfiles
            r0.append(r1)
            java.lang.String r1 = ", defaultAudioProfile="
            r0.append(r1)
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r1 = r2.defaultAudioProfile
            r0.append(r1)
            java.lang.String r1 = ", defaultVideoProfile="
            r0.append(r1)
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = r2.defaultVideoProfile
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
