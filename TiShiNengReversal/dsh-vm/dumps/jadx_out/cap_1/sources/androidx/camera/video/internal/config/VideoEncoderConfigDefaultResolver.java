package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VideoEncoderConfigDefaultResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.encoder.VideoEncoderConfig> {
    private static final java.lang.String TAG = "VidEncCfgDefaultRslvr";
    private static final android.util.Range<java.lang.Integer> VALID_FRAME_RATE_RANGE = null;
    private static final int VIDEO_BITRATE_BASE = 14000000;
    private static final int VIDEO_BIT_DEPTH_BASE = 8;
    private static final int VIDEO_FRAME_RATE_BASE = 30;
    static final int VIDEO_FRAME_RATE_FIXED_DEFAULT = 30;
    private static final android.util.Size VIDEO_SIZE_BASE = null;
    private final androidx.camera.core.DynamicRange mDynamicRange;
    private final android.util.Range<java.lang.Integer> mExpectedFrameRateRange;
    private final androidx.camera.core.impl.Timebase mInputTimebase;
    private final java.lang.String mMimeType;
    private final android.util.Size mSurfaceSize;
    private final androidx.camera.video.VideoSpec mVideoSpec;

    static {
            android.util.Size r0 = new android.util.Size
            r1 = 1280(0x500, float:1.794E-42)
            r2 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r1, r2)
            androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver.VIDEO_SIZE_BASE = r0
            android.util.Range r0 = new android.util.Range
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 60
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
            androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver.VALID_FRAME_RATE_RANGE = r0
            return
    }

    public VideoEncoderConfigDefaultResolver(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r2, @androidx.annotation.NonNull androidx.camera.video.VideoSpec r3, @androidx.annotation.NonNull android.util.Size r4, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r5, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r6) {
            r0 = this;
            r0.<init>()
            r0.mMimeType = r1
            r0.mInputTimebase = r2
            r0.mVideoSpec = r3
            r0.mSurfaceSize = r4
            r0.mDynamicRange = r5
            r0.mExpectedFrameRateRange = r6
            return
    }

    private int resolveFrameRate() {
            r5 = this;
            android.util.Range<java.lang.Integer> r0 = r5.mExpectedFrameRateRange
            android.util.Range<java.lang.Integer> r1 = androidx.camera.core.SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 != 0) goto L1f
            android.util.Range<java.lang.Integer> r0 = androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver.VALID_FRAME_RATE_RANGE
            android.util.Range<java.lang.Integer> r2 = r5.mExpectedFrameRateRange
            java.lang.Comparable r2 = r2.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Comparable r0 = r0.clamp(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L21
        L1f:
            r0 = 30
        L21:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.util.Range<java.lang.Integer> r3 = r5.mExpectedFrameRateRange
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 == 0) goto L30
            android.util.Range<java.lang.Integer> r1 = r5.mExpectedFrameRateRange
            goto L32
        L30:
            java.lang.String r1 = "<UNSPECIFIED>"
        L32:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r2 = 1
            r3[r2] = r1
            java.lang.String r1 = "Default resolved frame rate: %dfps. [Expected operating range: %s]"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            java.lang.String r2 = "VidEncCfgDefaultRslvr"
            androidx.camera.core.Logger.d(r2, r1)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.encoder.VideoEncoderConfig get() {
            r10 = this;
            int r3 = r10.resolveFrameRate()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Resolved VIDEO frame rate: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "fps"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VidEncCfgDefaultRslvr"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.VideoSpec r0 = r10.mVideoSpec
            android.util.Range r9 = r0.getBitrate()
            java.lang.String r0 = "Using fallback VIDEO bitrate"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.core.DynamicRange r0 = r10.mDynamicRange
            int r1 = r0.getBitDepth()
            android.util.Size r0 = r10.mSurfaceSize
            int r5 = r0.getWidth()
            android.util.Size r0 = androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver.VIDEO_SIZE_BASE
            int r6 = r0.getWidth()
            android.util.Size r2 = r10.mSurfaceSize
            int r7 = r2.getHeight()
            int r8 = r0.getHeight()
            r0 = 14000000(0xd59f80, float:1.9618179E-38)
            r2 = 8
            r4 = 30
            int r0 = androidx.camera.video.internal.config.VideoConfigUtil.scaleAndClampBitrate(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = r10.mMimeType
            androidx.camera.core.DynamicRange r2 = r10.mDynamicRange
            int r1 = androidx.camera.video.internal.utils.DynamicRangeUtil.dynamicRangeToCodecProfileLevelForMime(r1, r2)
            java.lang.String r2 = r10.mMimeType
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r2 = androidx.camera.video.internal.config.VideoConfigUtil.mimeAndProfileToEncoderDataSpace(r2, r1)
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r4 = androidx.camera.video.internal.encoder.VideoEncoderConfig.builder()
            java.lang.String r5 = r10.mMimeType
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r4 = r4.setMimeType(r5)
            androidx.camera.core.impl.Timebase r5 = r10.mInputTimebase
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r4 = r4.setInputTimebase(r5)
            android.util.Size r5 = r10.mSurfaceSize
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r4 = r4.setResolution(r5)
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r4.setBitrate(r0)
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setFrameRate(r3)
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setProfile(r1)
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setDataSpace(r2)
            androidx.camera.video.internal.encoder.VideoEncoderConfig r0 = r0.build()
            return r0
    }

    @Override // androidx.core.util.Supplier
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.video.internal.encoder.VideoEncoderConfig get() {
            r1 = this;
            androidx.camera.video.internal.encoder.VideoEncoderConfig r0 = r1.get()
            return r0
    }
}
