package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_EncoderProfilesProxy_AudioProfileProxy extends androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy {
    private final int bitrate;
    private final int channels;
    private final int codec;
    private final java.lang.String mediaType;
    private final int profile;
    private final int sampleRate;

    AutoValue_EncoderProfilesProxy_AudioProfileProxy(int r1, java.lang.String r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.codec = r1
            if (r2 == 0) goto L12
            r0.mediaType = r2
            r0.bitrate = r3
            r0.sampleRate = r4
            r0.channels = r5
            r0.profile = r6
            return
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null mediaType"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
            r2 = 0
            if (r1 == 0) goto L40
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r5 = (androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy) r5
            int r1 = r4.codec
            int r3 = r5.getCodec()
            if (r1 != r3) goto L40
            java.lang.String r1 = r4.mediaType
            java.lang.String r3 = r5.getMediaType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L40
            int r1 = r4.bitrate
            int r3 = r5.getBitrate()
            if (r1 != r3) goto L40
            int r1 = r4.sampleRate
            int r3 = r5.getSampleRate()
            if (r1 != r3) goto L40
            int r1 = r4.channels
            int r3 = r5.getChannels()
            if (r1 != r3) goto L40
            int r1 = r4.profile
            int r5 = r5.getProfile()
            if (r1 != r5) goto L40
            return r0
        L40:
            return r2
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getBitrate() {
            r1 = this;
            int r0 = r1.bitrate
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getChannels() {
            r1 = this;
            int r0 = r1.channels
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getCodec() {
            r1 = this;
            int r0 = r1.codec
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    @androidx.annotation.NonNull
    public java.lang.String getMediaType() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getProfile() {
            r1 = this;
            int r0 = r1.profile
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getSampleRate() {
            r1 = this;
            int r0 = r1.sampleRate
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.codec
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.mediaType
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.bitrate
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.sampleRate
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.channels
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.profile
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioProfileProxy{codec="
            r0.append(r1)
            int r1 = r2.codec
            r0.append(r1)
            java.lang.String r1 = ", mediaType="
            r0.append(r1)
            java.lang.String r1 = r2.mediaType
            r0.append(r1)
            java.lang.String r1 = ", bitrate="
            r0.append(r1)
            int r1 = r2.bitrate
            r0.append(r1)
            java.lang.String r1 = ", sampleRate="
            r0.append(r1)
            int r1 = r2.sampleRate
            r0.append(r1)
            java.lang.String r1 = ", channels="
            r0.append(r1)
            int r1 = r2.channels
            r0.append(r1)
            java.lang.String r1 = ", profile="
            r0.append(r1)
            int r1 = r2.profile
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
