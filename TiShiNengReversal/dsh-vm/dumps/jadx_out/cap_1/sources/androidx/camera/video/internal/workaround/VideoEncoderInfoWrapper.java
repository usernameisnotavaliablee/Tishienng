package androidx.camera.video.internal.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VideoEncoderInfoWrapper implements androidx.camera.video.internal.encoder.VideoEncoderInfo {
    private static final int HEIGHT_4KDCI = 2160;
    private static final java.lang.String TAG = "VideoEncoderInfoWrapper";
    private static final int WIDTH_4KDCI = 4096;
    private final java.util.Set<android.util.Size> mExtraSupportedSizes;
    private final android.util.Range<java.lang.Integer> mSupportedHeights;
    private final android.util.Range<java.lang.Integer> mSupportedWidths;
    private final androidx.camera.video.internal.encoder.VideoEncoderInfo mVideoEncoderInfo;

    VideoEncoderInfoWrapper(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.VideoEncoderInfo r7, @androidx.annotation.Nullable android.util.Size r8) {
            r6 = this;
            r6.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.mExtraSupportedSizes = r0
            r6.mVideoEncoderInfo = r7
            int r1 = r7.getWidthAlignment()
            r2 = 4661225614328463360(0x40b0000000000000, double:4096.0)
            double r4 = (double) r1
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            int r2 = r2 * r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Range r1 = android.util.Range.create(r1, r2)
            r6.mSupportedWidths = r1
            int r7 = r7.getHeightAlignment()
            r1 = 4656968305305714688(0x40a0e00000000000, double:2160.0)
            double r3 = (double) r7
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            int r1 = r1 * r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Range r7 = android.util.Range.create(r7, r1)
            r6.mSupportedHeights = r7
            if (r8 == 0) goto L4e
            r0.add(r8)
        L4e:
            java.util.Set r7 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.getExtraSupportedSizes()
            r0.addAll(r7)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.VideoEncoderInfo from(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.VideoEncoderInfo r4, @androidx.annotation.Nullable android.util.Size r5) {
            boolean r0 = r4 instanceof androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper
            if (r0 == 0) goto L5
            return r4
        L5:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk> r0 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto Le
            goto L3d
        Le:
            if (r5 == 0) goto L43
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            boolean r0 = r4.isSizeSupported(r0, r1)
            if (r0 != 0) goto L43
            android.util.Range r0 = r4.getSupportedWidths()
            android.util.Range r1 = r4.getSupportedHeights()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r0
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = "Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r1 = "VideoEncoderInfoWrapper"
            androidx.camera.core.Logger.w(r1, r0)
        L3d:
            androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper r0 = new androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper
            r0.<init>(r4, r5)
            return r0
        L43:
            return r4
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
            r1 = this;
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r1.mVideoEncoderInfo
            int r0 = r0.getHeightAlignment()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    @androidx.annotation.NonNull
    public java.lang.String getName() {
            r1 = this;
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r1.mVideoEncoderInfo
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedBitrateRange() {
            r1 = this;
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r1.mVideoEncoderInfo
            android.util.Range r0 = r0.getSupportedBitrateRange()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedHeights() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.mSupportedHeights
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedHeightsFor(int r4) {
            r3 = this;
            android.util.Range<java.lang.Integer> r0 = r3.mSupportedWidths
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L18
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r3.mVideoEncoderInfo
            int r0 = r0.getWidthAlignment()
            int r0 = r4 % r0
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not supported width: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " which is not in "
            r1.append(r4)
            android.util.Range<java.lang.Integer> r4 = r3.mSupportedWidths
            r1.append(r4)
            java.lang.String r4 = " or can not be divided by alignment "
            r1.append(r4)
            androidx.camera.video.internal.encoder.VideoEncoderInfo r4 = r3.mVideoEncoderInfo
            int r4 = r4.getWidthAlignment()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r4)
            android.util.Range<java.lang.Integer> r4 = r3.mSupportedHeights
            return r4
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedWidths() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.mSupportedWidths
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getSupportedWidthsFor(int r4) {
            r3 = this;
            android.util.Range<java.lang.Integer> r0 = r3.mSupportedHeights
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L18
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r3.mVideoEncoderInfo
            int r0 = r0.getHeightAlignment()
            int r0 = r4 % r0
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not supported height: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " which is not in "
            r1.append(r4)
            android.util.Range<java.lang.Integer> r4 = r3.mSupportedHeights
            r1.append(r4)
            java.lang.String r4 = " or can not be divided by alignment "
            r1.append(r4)
            androidx.camera.video.internal.encoder.VideoEncoderInfo r4 = r3.mVideoEncoderInfo
            int r4 = r4.getHeightAlignment()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r4)
            android.util.Range<java.lang.Integer> r4 = r3.mSupportedWidths
            return r4
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
            r1 = this;
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r1.mVideoEncoderInfo
            int r0 = r0.getWidthAlignment()
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int r4, int r5) {
            r3 = this;
            java.util.Set<android.util.Size> r0 = r3.mExtraSupportedSizes
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L17
            java.util.Set<android.util.Size> r0 = r3.mExtraSupportedSizes
            android.util.Size r2 = new android.util.Size
            r2.<init>(r4, r5)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L17
            return r1
        L17:
            android.util.Range<java.lang.Integer> r0 = r3.mSupportedWidths
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L42
            android.util.Range<java.lang.Integer> r0 = r3.mSupportedHeights
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L42
            androidx.camera.video.internal.encoder.VideoEncoderInfo r0 = r3.mVideoEncoderInfo
            int r0 = r0.getWidthAlignment()
            int r4 = r4 % r0
            if (r4 != 0) goto L42
            androidx.camera.video.internal.encoder.VideoEncoderInfo r4 = r3.mVideoEncoderInfo
            int r4 = r4.getHeightAlignment()
            int r5 = r5 % r4
            if (r5 != 0) goto L42
            return r1
        L42:
            r4 = 0
            return r4
    }
}
