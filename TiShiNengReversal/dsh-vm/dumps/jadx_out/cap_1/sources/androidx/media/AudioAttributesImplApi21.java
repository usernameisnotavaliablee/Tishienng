package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {
    private static final java.lang.String TAG = "AudioAttributesCompat21";
    static java.lang.reflect.Method sAudioAttributesToLegacyStreamType;
    android.media.AudioAttributes mAudioAttributes;
    int mLegacyStreamType;

    AudioAttributesImplApi21() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mLegacyStreamType = r0
            return
    }

    AudioAttributesImplApi21(android.media.AudioAttributes r2) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    AudioAttributesImplApi21(android.media.AudioAttributes r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mAudioAttributes = r1
            r0.mLegacyStreamType = r2
            return
    }

    public static androidx.media.AudioAttributesImpl fromBundle(android.os.Bundle r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "androidx.media.audio_attrs.FRAMEWORKS"
            android.os.Parcelable r1 = r3.getParcelable(r1)
            android.media.AudioAttributes r1 = (android.media.AudioAttributes) r1
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE"
            r2 = -1
            int r3 = r3.getInt(r0, r2)
            androidx.media.AudioAttributesImplApi21 r0 = new androidx.media.AudioAttributesImplApi21
            r0.<init>(r1, r3)
            return r0
    }

    static java.lang.reflect.Method getAudioAttributesToLegacyStreamTypeMethod() {
            java.lang.Class<android.media.AudioAttributes> r0 = android.media.AudioAttributes.class
            java.lang.reflect.Method r1 = androidx.media.AudioAttributesImplApi21.sAudioAttributesToLegacyStreamType     // Catch: java.lang.NoSuchMethodException -> L17
            if (r1 != 0) goto L14
            java.lang.String r1 = "toLegacyStreamType"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L17
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L17
            androidx.media.AudioAttributesImplApi21.sAudioAttributesToLegacyStreamType = r0     // Catch: java.lang.NoSuchMethodException -> L17
        L14:
            java.lang.reflect.Method r0 = androidx.media.AudioAttributesImplApi21.sAudioAttributesToLegacyStreamType
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.media.AudioAttributesImplApi21
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.media.AudioAttributesImplApi21 r2 = (androidx.media.AudioAttributesImplApi21) r2
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            android.media.AudioAttributes r2 = r2.mAudioAttributes
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // androidx.media.AudioAttributesImpl
    public java.lang.Object getAudioAttributes() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.getContentType()
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.getFlags()
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
            r5 = this;
            int r0 = r5.mLegacyStreamType
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            java.lang.reflect.Method r0 = getAudioAttributesToLegacyStreamTypeMethod()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            android.media.AudioAttributes r2 = r5.mAudioAttributes     // Catch: java.lang.Throwable -> L21
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L21
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Throwable -> L21
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L21
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            return r1
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
            r1 = this;
            int r0 = r1.mLegacyStreamType
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.getUsage()
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.media.AudioAttributes r0 = r3.mAudioAttributes
            int r0 = androidx.media.a.a(r0)
            return r0
        Ld:
            int r0 = r3.getFlags()
            int r1 = r3.getUsage()
            r2 = 1
            int r0 = androidx.media.AudioAttributesCompat.toVolumeStreamType(r2, r0, r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    @androidx.annotation.NonNull
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "androidx.media.audio_attrs.FRAMEWORKS"
            android.media.AudioAttributes r2 = r3.mAudioAttributes
            r0.putParcelable(r1, r2)
            int r1 = r3.mLegacyStreamType
            r2 = -1
            if (r1 == r2) goto L16
            java.lang.String r2 = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE"
            r0.putInt(r2, r1)
        L16:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioAttributesCompat: audioattributes="
            r0.append(r1)
            android.media.AudioAttributes r1 = r2.mAudioAttributes
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
