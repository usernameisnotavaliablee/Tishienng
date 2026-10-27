package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AudioAttributesImplBase implements androidx.media.AudioAttributesImpl {
    int mContentType;
    int mFlags;
    int mLegacyStream;
    int mUsage;

    AudioAttributesImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mUsage = r0
            r1.mContentType = r0
            r1.mFlags = r0
            r0 = -1
            r1.mLegacyStream = r0
            return
    }

    AudioAttributesImplBase(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.mContentType = r1
            r0.mFlags = r2
            r0.mUsage = r3
            r0.mLegacyStream = r4
            return
    }

    public static androidx.media.AudioAttributesImpl fromBundle(android.os.Bundle r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.String r0 = "androidx.media.audio_attrs.USAGE"
            r1 = 0
            int r0 = r5.getInt(r0, r1)
            java.lang.String r2 = "androidx.media.audio_attrs.CONTENT_TYPE"
            int r2 = r5.getInt(r2, r1)
            java.lang.String r3 = "androidx.media.audio_attrs.FLAGS"
            int r1 = r5.getInt(r3, r1)
            java.lang.String r3 = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE"
            r4 = -1
            int r5 = r5.getInt(r3, r4)
            androidx.media.AudioAttributesImplBase r3 = new androidx.media.AudioAttributesImplBase
            r3.<init>(r2, r1, r0, r5)
            return r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.media.AudioAttributesImplBase
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.media.AudioAttributesImplBase r4 = (androidx.media.AudioAttributesImplBase) r4
            int r0 = r3.mContentType
            int r2 = r4.getContentType()
            if (r0 != r2) goto L28
            int r0 = r3.mFlags
            int r2 = r4.getFlags()
            if (r0 != r2) goto L28
            int r0 = r3.mUsage
            int r2 = r4.getUsage()
            if (r0 != r2) goto L28
            int r0 = r3.mLegacyStream
            int r4 = r4.mLegacyStream
            if (r0 != r4) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    @Override // androidx.media.AudioAttributesImpl
    public java.lang.Object getAudioAttributes() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
            r1 = this;
            int r0 = r1.mContentType
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
            r3 = this;
            int r0 = r3.mFlags
            int r1 = r3.getLegacyStreamType()
            r2 = 6
            if (r1 != r2) goto Lc
            r0 = r0 | 4
            goto L11
        Lc:
            r2 = 7
            if (r1 != r2) goto L11
            r0 = r0 | 1
        L11:
            r0 = r0 & 273(0x111, float:3.83E-43)
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
            r3 = this;
            int r0 = r3.mLegacyStream
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r3.mFlags
            int r1 = r3.mUsage
            r2 = 0
            int r0 = androidx.media.AudioAttributesCompat.toVolumeStreamType(r2, r0, r1)
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
            r1 = this;
            int r0 = r1.mLegacyStream
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
            r1 = this;
            int r0 = r1.mUsage
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
            r3 = this;
            int r0 = r3.mFlags
            int r1 = r3.mUsage
            r2 = 1
            int r0 = androidx.media.AudioAttributesCompat.toVolumeStreamType(r2, r0, r1)
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.mContentType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r6.mFlags
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r6.mUsage
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.mLegacyStream
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            int r0 = java.util.Arrays.hashCode(r4)
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    @androidx.annotation.NonNull
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "androidx.media.audio_attrs.USAGE"
            int r2 = r3.mUsage
            r0.putInt(r1, r2)
            java.lang.String r1 = "androidx.media.audio_attrs.CONTENT_TYPE"
            int r2 = r3.mContentType
            r0.putInt(r1, r2)
            java.lang.String r1 = "androidx.media.audio_attrs.FLAGS"
            int r2 = r3.mFlags
            r0.putInt(r1, r2)
            int r1 = r3.mLegacyStream
            r2 = -1
            if (r1 == r2) goto L24
            java.lang.String r2 = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE"
            r0.putInt(r2, r1)
        L24:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AudioAttributesCompat:"
            r0.<init>(r1)
            int r1 = r3.mLegacyStream
            r2 = -1
            if (r1 == r2) goto L1b
            java.lang.String r1 = " stream="
            r0.append(r1)
            int r1 = r3.mLegacyStream
            r0.append(r1)
            java.lang.String r1 = " derived"
            r0.append(r1)
        L1b:
            java.lang.String r1 = " usage="
            r0.append(r1)
            int r1 = r3.mUsage
            java.lang.String r1 = androidx.media.AudioAttributesCompat.usageToString(r1)
            r0.append(r1)
            java.lang.String r1 = " content="
            r0.append(r1)
            int r1 = r3.mContentType
            r0.append(r1)
            java.lang.String r1 = " flags=0x"
            r0.append(r1)
            int r1 = r3.mFlags
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = r1.toUpperCase()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
