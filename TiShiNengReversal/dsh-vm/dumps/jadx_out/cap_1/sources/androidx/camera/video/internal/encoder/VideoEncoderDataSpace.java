package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class VideoEncoderDataSpace {
    public static final androidx.camera.video.internal.encoder.VideoEncoderDataSpace ENCODER_DATA_SPACE_BT2020_HLG = null;
    public static final androidx.camera.video.internal.encoder.VideoEncoderDataSpace ENCODER_DATA_SPACE_BT2020_PQ = null;
    public static final androidx.camera.video.internal.encoder.VideoEncoderDataSpace ENCODER_DATA_SPACE_BT709 = null;
    public static final androidx.camera.video.internal.encoder.VideoEncoderDataSpace ENCODER_DATA_SPACE_UNSPECIFIED = null;
    public static final int VIDEO_COLOR_RANGE_UNSPECIFIED = 0;
    public static final int VIDEO_COLOR_STANDARD_UNSPECIFIED = 0;
    public static final int VIDEO_COLOR_TRANSFER_UNSPECIFIED = 0;

    static {
            r0 = 0
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r0 = create(r0, r0, r0)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED = r0
            r0 = 3
            r1 = 2
            r2 = 1
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r0 = create(r2, r0, r1)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT709 = r0
            r0 = 7
            r1 = 6
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r0 = create(r1, r0, r2)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG = r0
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r0 = create(r1, r1, r2)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ = r0
            return
    }

    VideoEncoderDataSpace() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.VideoEncoderDataSpace create(int r1, int r2, int r3) {
            androidx.camera.video.internal.encoder.AutoValue_VideoEncoderDataSpace r0 = new androidx.camera.video.internal.encoder.AutoValue_VideoEncoderDataSpace
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract int getRange();

    public abstract int getStandard();

    public abstract int getTransfer();
}
