package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VideoEncoderConfigVideoProfileResolver implements androidx.core.util.Supplier<androidx.camera.video.internal.encoder.VideoEncoderConfig> {
    private static final java.lang.String TAG = "VidEncVdPrflRslvr";
    private final androidx.camera.core.DynamicRange mDynamicRange;
    private final android.util.Range<java.lang.Integer> mExpectedFrameRateRange;
    private final androidx.camera.core.impl.Timebase mInputTimebase;
    private final java.lang.String mMimeType;
    private final android.util.Size mSurfaceSize;
    private final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy mVideoProfile;
    private final androidx.camera.video.VideoSpec mVideoSpec;

    public VideoEncoderConfigVideoProfileResolver(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r2, @androidx.annotation.NonNull androidx.camera.video.VideoSpec r3, @androidx.annotation.NonNull android.util.Size r4, @androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r5, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r6, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r7) {
            r0 = this;
            r0.<init>()
            r0.mMimeType = r1
            r0.mInputTimebase = r2
            r0.mVideoSpec = r3
            r0.mSurfaceSize = r4
            r0.mVideoProfile = r5
            r0.mDynamicRange = r6
            r0.mExpectedFrameRateRange = r7
            return
    }

    private int resolveFrameRate() {
            r6 = this;
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r0 = r6.mVideoProfile
            int r0 = r0.getFrameRate()
            android.util.Range<java.lang.Integer> r1 = r6.mExpectedFrameRateRange
            android.util.Range<java.lang.Integer> r2 = androidx.camera.core.SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 != 0) goto L21
            android.util.Range<java.lang.Integer> r1 = r6.mExpectedFrameRateRange
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Comparable r1 = r1.clamp(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L22
        L21:
            r1 = r0
        L22:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range<java.lang.Integer> r4 = r6.mExpectedFrameRateRange
            boolean r2 = java.util.Objects.equals(r4, r2)
            if (r2 == 0) goto L35
            android.util.Range<java.lang.Integer> r2 = r6.mExpectedFrameRateRange
            goto L37
        L35:
            java.lang.String r2 = "<UNSPECIFIED>"
        L37:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r4[r3] = r0
            r0 = 2
            r4[r0] = r2
            java.lang.String r0 = "Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            java.lang.String r2 = "VidEncVdPrflRslvr"
            androidx.camera.core.Logger.d(r2, r0)
            return r1
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
            java.lang.String r1 = "VidEncVdPrflRslvr"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.VideoSpec r0 = r10.mVideoSpec
            android.util.Range r9 = r0.getBitrate()
            java.lang.String r0 = "Using resolved VIDEO bitrate from EncoderProfiles"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r0 = r10.mVideoProfile
            int r0 = r0.getBitrate()
            androidx.camera.core.DynamicRange r1 = r10.mDynamicRange
            int r1 = r1.getBitDepth()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r2 = r10.mVideoProfile
            int r2 = r2.getBitDepth()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r4 = r10.mVideoProfile
            int r4 = r4.getFrameRate()
            android.util.Size r5 = r10.mSurfaceSize
            int r5 = r5.getWidth()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r6 = r10.mVideoProfile
            int r6 = r6.getWidth()
            android.util.Size r7 = r10.mSurfaceSize
            int r7 = r7.getHeight()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r8 = r10.mVideoProfile
            int r8 = r8.getHeight()
            int r0 = androidx.camera.video.internal.config.VideoConfigUtil.scaleAndClampBitrate(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = r10.mVideoProfile
            int r1 = r1.getProfile()
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
