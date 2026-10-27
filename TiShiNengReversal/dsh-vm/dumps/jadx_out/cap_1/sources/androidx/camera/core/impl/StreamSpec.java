package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class StreamSpec {
    public static final android.util.Range<java.lang.Integer> FRAME_RATE_RANGE_UNSPECIFIED = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.impl.StreamSpec build();

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.impl.StreamSpec.Builder setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.impl.StreamSpec.Builder setExpectedFrameRateRange(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.impl.StreamSpec.Builder setImplementationOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1);

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.impl.StreamSpec.Builder setResolution(@androidx.annotation.NonNull android.util.Size r1);
    }

    static {
            android.util.Range r0 = new android.util.Range
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r1)
            androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED = r0
            return
    }

    public StreamSpec() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.StreamSpec.Builder builder(@androidx.annotation.NonNull android.util.Size r1) {
            androidx.camera.core.impl.AutoValue_StreamSpec$Builder r0 = new androidx.camera.core.impl.AutoValue_StreamSpec$Builder
            r0.<init>()
            androidx.camera.core.impl.StreamSpec$Builder r1 = r0.setResolution(r1)
            android.util.Range<java.lang.Integer> r0 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            androidx.camera.core.impl.StreamSpec$Builder r1 = r1.setExpectedFrameRateRange(r0)
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
            androidx.camera.core.impl.StreamSpec$Builder r1 = r1.setDynamicRange(r0)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.DynamicRange getDynamicRange();

    @androidx.annotation.NonNull
    public abstract android.util.Range<java.lang.Integer> getExpectedFrameRateRange();

    @androidx.annotation.Nullable
    public abstract androidx.camera.core.impl.Config getImplementationOptions();

    @androidx.annotation.NonNull
    public abstract android.util.Size getResolution();

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.StreamSpec.Builder toBuilder();
}
