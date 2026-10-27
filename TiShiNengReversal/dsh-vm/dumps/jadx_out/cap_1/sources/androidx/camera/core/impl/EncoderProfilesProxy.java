package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface EncoderProfilesProxy {
    public static final int CODEC_PROFILE_NONE = -1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class AudioProfileProxy {
        public static final java.lang.String MEDIA_TYPE_NONE = "audio/none";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        public AudioProfileProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy create(int r7, @androidx.annotation.NonNull java.lang.String r8, int r9, int r10, int r11, int r12) {
                androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy r0 = new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        @androidx.annotation.NonNull
        public abstract java.lang.String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class ImmutableEncoderProfilesProxy implements androidx.camera.core.impl.EncoderProfilesProxy {
        public ImmutableEncoderProfilesProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy create(int r2, int r3, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> r4, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> r5) {
                androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy r0 = new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r4)
                java.util.List r4 = java.util.Collections.unmodifiableList(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r5)
                java.util.List r5 = java.util.Collections.unmodifiableList(r1)
                r0.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class VideoProfileProxy {
        public static final int BIT_DEPTH_10 = 10;
        public static final int BIT_DEPTH_8 = 8;
        public static final java.lang.String MEDIA_TYPE_NONE = "video/none";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        public VideoProfileProxy() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy create(int r11, @androidx.annotation.NonNull java.lang.String r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
                androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy r0 = new androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r8 = r18
                r9 = r19
                r10 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        @androidx.annotation.NonNull
        public abstract java.lang.String getMediaType();

        public abstract int getProfile();

        public abstract int getWidth();
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles();
}
