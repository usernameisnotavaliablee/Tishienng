package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_EncoderProfilesProxy_VideoProfileProxy extends androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy {
    private final int bitDepth;
    private final int bitrate;
    private final int chromaSubsampling;
    private final int codec;
    private final int frameRate;
    private final int hdrFormat;
    private final int height;
    private final java.lang.String mediaType;
    private final int profile;
    private final int width;

    AutoValue_EncoderProfilesProxy_VideoProfileProxy(int r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.codec = r1
            if (r2 == 0) goto L1a
            r0.mediaType = r2
            r0.bitrate = r3
            r0.frameRate = r4
            r0.width = r5
            r0.height = r6
            r0.profile = r7
            r0.bitDepth = r8
            r0.chromaSubsampling = r9
            r0.hdrFormat = r10
            return
        L1a:
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
            boolean r1 = r5 instanceof androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
            r2 = 0
            if (r1 == 0) goto L60
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r5 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r5
            int r1 = r4.codec
            int r3 = r5.getCodec()
            if (r1 != r3) goto L60
            java.lang.String r1 = r4.mediaType
            java.lang.String r3 = r5.getMediaType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            int r1 = r4.bitrate
            int r3 = r5.getBitrate()
            if (r1 != r3) goto L60
            int r1 = r4.frameRate
            int r3 = r5.getFrameRate()
            if (r1 != r3) goto L60
            int r1 = r4.width
            int r3 = r5.getWidth()
            if (r1 != r3) goto L60
            int r1 = r4.height
            int r3 = r5.getHeight()
            if (r1 != r3) goto L60
            int r1 = r4.profile
            int r3 = r5.getProfile()
            if (r1 != r3) goto L60
            int r1 = r4.bitDepth
            int r3 = r5.getBitDepth()
            if (r1 != r3) goto L60
            int r1 = r4.chromaSubsampling
            int r3 = r5.getChromaSubsampling()
            if (r1 != r3) goto L60
            int r1 = r4.hdrFormat
            int r5 = r5.getHdrFormat()
            if (r1 != r5) goto L60
            return r0
        L60:
            return r2
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitDepth() {
            r1 = this;
            int r0 = r1.bitDepth
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitrate() {
            r1 = this;
            int r0 = r1.bitrate
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getChromaSubsampling() {
            r1 = this;
            int r0 = r1.chromaSubsampling
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getCodec() {
            r1 = this;
            int r0 = r1.codec
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getFrameRate() {
            r1 = this;
            int r0 = r1.frameRate
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHdrFormat() {
            r1 = this;
            int r0 = r1.hdrFormat
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    @androidx.annotation.NonNull
    public java.lang.String getMediaType() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getProfile() {
            r1 = this;
            int r0 = r1.profile
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getWidth() {
            r1 = this;
            int r0 = r1.width
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
            int r2 = r3.frameRate
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.width
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.height
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.profile
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.bitDepth
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.chromaSubsampling
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.hdrFormat
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoProfileProxy{codec="
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
            java.lang.String r1 = ", frameRate="
            r0.append(r1)
            int r1 = r2.frameRate
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.width
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.height
            r0.append(r1)
            java.lang.String r1 = ", profile="
            r0.append(r1)
            int r1 = r2.profile
            r0.append(r1)
            java.lang.String r1 = ", bitDepth="
            r0.append(r1)
            int r1 = r2.bitDepth
            r0.append(r1)
            java.lang.String r1 = ", chromaSubsampling="
            r0.append(r1)
            int r1 = r2.chromaSubsampling
            r0.append(r1)
            java.lang.String r1 = ", hdrFormat="
            r0.append(r1)
            int r1 = r2.hdrFormat
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
