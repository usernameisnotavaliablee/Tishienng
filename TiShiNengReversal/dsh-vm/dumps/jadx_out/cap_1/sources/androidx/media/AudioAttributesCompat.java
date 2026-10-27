package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AudioAttributesCompat implements androidx.versionedparcelable.VersionedParcelable {
    static final java.lang.String AUDIO_ATTRIBUTES_CONTENT_TYPE = "androidx.media.audio_attrs.CONTENT_TYPE";
    static final java.lang.String AUDIO_ATTRIBUTES_FLAGS = "androidx.media.audio_attrs.FLAGS";
    static final java.lang.String AUDIO_ATTRIBUTES_FRAMEWORKS = "androidx.media.audio_attrs.FRAMEWORKS";
    static final java.lang.String AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";
    static final java.lang.String AUDIO_ATTRIBUTES_USAGE = "androidx.media.audio_attrs.USAGE";
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    static final int FLAG_ALL = 1023;
    static final int FLAG_ALL_PUBLIC = 273;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    static final int FLAG_BEACON = 8;
    static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
    static final int FLAG_BYPASS_MUTE = 128;
    static final int FLAG_DEEP_BUFFER = 512;
    public static final int FLAG_HW_AV_SYNC = 16;
    static final int FLAG_HW_HOTWORD = 32;
    static final int FLAG_LOW_LATENCY = 256;
    static final int FLAG_SCO = 4;
    static final int FLAG_SECURE = 2;
    static final int INVALID_STREAM_TYPE = -1;
    private static final int[] SDK_USAGES = null;
    private static final int SUPPRESSIBLE_CALL = 2;
    private static final int SUPPRESSIBLE_NOTIFICATION = 1;
    private static final android.util.SparseIntArray SUPPRESSIBLE_USAGES = null;
    private static final java.lang.String TAG = "AudioAttributesCompat";
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    private static final int USAGE_VIRTUAL_SOURCE = 15;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    static boolean sForceLegacyBehavior;
    androidx.media.AudioAttributesImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AttributeContentType {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AttributeUsage {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class AudioManagerHidden {
        public static final int STREAM_ACCESSIBILITY = 10;
        public static final int STREAM_BLUETOOTH_SCO = 6;
        public static final int STREAM_SYSTEM_ENFORCED = 7;
        public static final int STREAM_TTS = 9;

        private AudioManagerHidden() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private int mContentType;
        private int mFlags;
        private int mLegacyStream;
        private int mUsage;

        public Builder() {
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

        public Builder(androidx.media.AudioAttributesCompat r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mUsage = r0
                r1.mContentType = r0
                r1.mFlags = r0
                r0 = -1
                r1.mLegacyStream = r0
                int r0 = r2.getUsage()
                r1.mUsage = r0
                int r0 = r2.getContentType()
                r1.mContentType = r0
                int r0 = r2.getFlags()
                r1.mFlags = r0
                int r2 = r2.getRawLegacyStreamType()
                r1.mLegacyStream = r2
                return
        }

        public androidx.media.AudioAttributesCompat build() {
                r5 = this;
                boolean r0 = androidx.media.AudioAttributesCompat.sForceLegacyBehavior
                if (r0 != 0) goto L2f
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                int r1 = r5.mContentType
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                int r1 = r5.mFlags
                android.media.AudioAttributes$Builder r0 = r0.setFlags(r1)
                int r1 = r5.mUsage
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                int r1 = r5.mLegacyStream
                r2 = -1
                if (r1 == r2) goto L23
                r0.setLegacyStreamType(r1)
            L23:
                androidx.media.AudioAttributesImplApi21 r1 = new androidx.media.AudioAttributesImplApi21
                android.media.AudioAttributes r0 = r0.build()
                int r2 = r5.mLegacyStream
                r1.<init>(r0, r2)
                goto L3c
            L2f:
                androidx.media.AudioAttributesImplBase r1 = new androidx.media.AudioAttributesImplBase
                int r0 = r5.mContentType
                int r2 = r5.mFlags
                int r3 = r5.mUsage
                int r4 = r5.mLegacyStream
                r1.<init>(r0, r2, r3, r4)
            L3c:
                androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
                r0.<init>(r1)
                return r0
        }

        public androidx.media.AudioAttributesCompat.Builder setContentType(int r2) {
                r1 = this;
                if (r2 == 0) goto L12
                r0 = 1
                if (r2 == r0) goto L12
                r0 = 2
                if (r2 == r0) goto L12
                r0 = 3
                if (r2 == r0) goto L12
                r0 = 4
                if (r2 == r0) goto L12
                r2 = 0
                r1.mUsage = r2
                return r1
            L12:
                r1.mContentType = r2
                return r1
        }

        public androidx.media.AudioAttributesCompat.Builder setFlags(int r2) {
                r1 = this;
                r2 = r2 & 1023(0x3ff, float:1.434E-42)
                int r0 = r1.mFlags
                r2 = r2 | r0
                r1.mFlags = r2
                return r1
        }

        androidx.media.AudioAttributesCompat.Builder setInternalLegacyStreamType(int r4) {
                r3 = this;
                r0 = 1
                r1 = 4
                switch(r4) {
                    case 0: goto L2d;
                    case 1: goto L2a;
                    case 2: goto L27;
                    case 3: goto L23;
                    case 4: goto L20;
                    case 5: goto L1d;
                    case 6: goto L15;
                    case 7: goto Lf;
                    case 8: goto Lc;
                    case 9: goto L9;
                    case 10: goto L6;
                    default: goto L5;
                }
            L5:
                goto L2f
            L6:
                r3.mContentType = r0
                goto L2f
            L9:
                r3.mContentType = r1
                goto L2f
            Lc:
                r3.mContentType = r1
                goto L2f
            Lf:
                int r2 = r3.mFlags
                r0 = r0 | r2
                r3.mFlags = r0
                goto L2a
            L15:
                r3.mContentType = r0
                int r0 = r3.mFlags
                r0 = r0 | r1
                r3.mFlags = r0
                goto L2f
            L1d:
                r3.mContentType = r1
                goto L2f
            L20:
                r3.mContentType = r1
                goto L2f
            L23:
                r0 = 2
                r3.mContentType = r0
                goto L2f
            L27:
                r3.mContentType = r1
                goto L2f
            L2a:
                r3.mContentType = r1
                goto L2f
            L2d:
                r3.mContentType = r0
            L2f:
                int r4 = androidx.media.AudioAttributesCompat.usageForStreamType(r4)
                r3.mUsage = r4
                return r3
        }

        public androidx.media.AudioAttributesCompat.Builder setLegacyStreamType(int r2) {
                r1 = this;
                r0 = 10
                if (r2 == r0) goto Lb
                r1.mLegacyStream = r2
                androidx.media.AudioAttributesCompat$Builder r2 = r1.setInternalLegacyStreamType(r2)
                return r2
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback"
                r2.<init>(r0)
                throw r2
        }

        public androidx.media.AudioAttributesCompat.Builder setUsage(int r3) {
                r2 = this;
                switch(r3) {
                    case 0: goto L19;
                    case 1: goto L19;
                    case 2: goto L19;
                    case 3: goto L19;
                    case 4: goto L19;
                    case 5: goto L19;
                    case 6: goto L19;
                    case 7: goto L19;
                    case 8: goto L19;
                    case 9: goto L19;
                    case 10: goto L19;
                    case 11: goto L19;
                    case 12: goto L19;
                    case 13: goto L19;
                    case 14: goto L19;
                    case 15: goto L19;
                    case 16: goto L7;
                    default: goto L3;
                }
            L3:
                r3 = 0
                r2.mUsage = r3
                return r2
            L7:
                boolean r0 = androidx.media.AudioAttributesCompat.sForceLegacyBehavior
                if (r0 != 0) goto L14
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 25
                if (r0 <= r1) goto L14
                r2.mUsage = r3
                return r2
            L14:
                r3 = 12
                r2.mUsage = r3
                return r2
            L19:
                r2.mUsage = r3
                return r2
        }
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            androidx.media.AudioAttributesCompat.SUPPRESSIBLE_USAGES = r0
            r1 = 5
            r2 = 1
            r0.put(r1, r2)
            r1 = 6
            r3 = 2
            r0.put(r1, r3)
            r1 = 7
            r0.put(r1, r3)
            r1 = 8
            r0.put(r1, r2)
            r1 = 9
            r0.put(r1, r2)
            r1 = 10
            r0.put(r1, r2)
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16} // fill-array
            androidx.media.AudioAttributesCompat.SDK_USAGES = r0
            return
    }

    AudioAttributesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    AudioAttributesCompat(androidx.media.AudioAttributesImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.media.AudioAttributesCompat fromBundle(android.os.Bundle r1) {
            androidx.media.AudioAttributesImpl r1 = androidx.media.AudioAttributesImplApi21.fromBundle(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static void setForceLegacyBehavior(boolean r0) {
            androidx.media.AudioAttributesCompat.sForceLegacyBehavior = r0
            return
    }

    static int toVolumeStreamType(boolean r3, int r4, int r5) {
            r0 = r4 & 1
            r1 = 1
            if (r0 != r1) goto La
            if (r3 == 0) goto L8
            return r1
        L8:
            r3 = 7
            return r3
        La:
            r0 = 4
            r4 = r4 & r0
            r2 = 0
            if (r4 != r0) goto L14
            if (r3 == 0) goto L12
            return r2
        L12:
            r3 = 6
            return r3
        L14:
            r4 = 3
            switch(r5) {
                case 0: goto L48;
                case 1: goto L47;
                case 2: goto L46;
                case 3: goto L40;
                case 4: goto L3f;
                case 5: goto L3d;
                case 6: goto L3b;
                case 7: goto L3d;
                case 8: goto L3d;
                case 9: goto L3d;
                case 10: goto L3d;
                case 11: goto L38;
                case 12: goto L47;
                case 13: goto L37;
                case 14: goto L47;
                case 15: goto L18;
                case 16: goto L47;
                default: goto L18;
            }
        L18:
            if (r3 != 0) goto L1b
            return r4
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unknown usage value "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = " in audio attributes"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            return r1
        L38:
            r3 = 10
            return r3
        L3b:
            r3 = 2
            return r3
        L3d:
            r3 = 5
            return r3
        L3f:
            return r0
        L40:
            if (r3 == 0) goto L43
            return r2
        L43:
            r3 = 8
            return r3
        L46:
            return r2
        L47:
            return r4
        L48:
            if (r3 == 0) goto L4d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        L4d:
            return r4
    }

    static int toVolumeStreamType(boolean r1, androidx.media.AudioAttributesCompat r2) {
            int r0 = r2.getFlags()
            int r2 = r2.getUsage()
            int r1 = toVolumeStreamType(r1, r0, r2)
            return r1
    }

    static int usageForStreamType(int r1) {
            r0 = 2
            switch(r1) {
                case 0: goto L17;
                case 1: goto L14;
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto Lb;
                case 7: goto L14;
                case 8: goto L9;
                case 9: goto L4;
                case 10: goto L6;
                default: goto L4;
            }
        L4:
            r1 = 0
            return r1
        L6:
            r1 = 11
            return r1
        L9:
            r1 = 3
            return r1
        Lb:
            return r0
        Lc:
            r1 = 5
            return r1
        Le:
            r1 = 4
            return r1
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 6
            return r1
        L14:
            r1 = 13
            return r1
        L17:
            return r0
    }

    static java.lang.String usageToString(int r2) {
            switch(r2) {
                case 0: goto L42;
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L30;
                case 7: goto L2d;
                case 8: goto L2a;
                case 9: goto L27;
                case 10: goto L24;
                case 11: goto L21;
                case 12: goto L1e;
                case 13: goto L1b;
                case 14: goto L18;
                case 15: goto L3;
                case 16: goto L15;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown usage "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L15:
            java.lang.String r2 = "USAGE_ASSISTANT"
            return r2
        L18:
            java.lang.String r2 = "USAGE_GAME"
            return r2
        L1b:
            java.lang.String r2 = "USAGE_ASSISTANCE_SONIFICATION"
            return r2
        L1e:
            java.lang.String r2 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"
            return r2
        L21:
            java.lang.String r2 = "USAGE_ASSISTANCE_ACCESSIBILITY"
            return r2
        L24:
            java.lang.String r2 = "USAGE_NOTIFICATION_EVENT"
            return r2
        L27:
            java.lang.String r2 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"
            return r2
        L2a:
            java.lang.String r2 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"
            return r2
        L2d:
            java.lang.String r2 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"
            return r2
        L30:
            java.lang.String r2 = "USAGE_NOTIFICATION_RINGTONE"
            return r2
        L33:
            java.lang.String r2 = "USAGE_NOTIFICATION"
            return r2
        L36:
            java.lang.String r2 = "USAGE_ALARM"
            return r2
        L39:
            java.lang.String r2 = "USAGE_VOICE_COMMUNICATION_SIGNALLING"
            return r2
        L3c:
            java.lang.String r2 = "USAGE_VOICE_COMMUNICATION"
            return r2
        L3f:
            java.lang.String r2 = "USAGE_MEDIA"
            return r2
        L42:
            java.lang.String r2 = "USAGE_UNKNOWN"
            return r2
    }

    @androidx.annotation.Nullable
    public static androidx.media.AudioAttributesCompat wrap(@androidx.annotation.NonNull java.lang.Object r1) {
            boolean r0 = androidx.media.AudioAttributesCompat.sForceLegacyBehavior
            if (r0 != 0) goto L13
            androidx.media.AudioAttributesImplApi21 r0 = new androidx.media.AudioAttributesImplApi21
            android.media.AudioAttributes r1 = (android.media.AudioAttributes) r1
            r0.<init>(r1)
            androidx.media.AudioAttributesCompat r1 = new androidx.media.AudioAttributesCompat
            r1.<init>()
            r1.mImpl = r0
            return r1
        L13:
            r1 = 0
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.media.AudioAttributesCompat
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.media.AudioAttributesCompat r3 = (androidx.media.AudioAttributesCompat) r3
            androidx.media.AudioAttributesImpl r0 = r2.mImpl
            if (r0 != 0) goto L13
            androidx.media.AudioAttributesImpl r3 = r3.mImpl
            if (r3 != 0) goto L12
            r3 = 1
            return r3
        L12:
            return r1
        L13:
            androidx.media.AudioAttributesImpl r3 = r3.mImpl
            boolean r3 = r0.equals(r3)
            return r3
    }

    public int getContentType() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getContentType()
            return r0
    }

    public int getFlags() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getFlags()
            return r0
    }

    public int getLegacyStreamType() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getLegacyStreamType()
            return r0
    }

    int getRawLegacyStreamType() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getRawLegacyStreamType()
            return r0
    }

    public int getUsage() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getUsage()
            return r0
    }

    public int getVolumeControlStream() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getVolumeControlStream()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.os.Bundle toBundle() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.toBundle()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object unwrap() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getAudioAttributes()
            return r0
    }
}
