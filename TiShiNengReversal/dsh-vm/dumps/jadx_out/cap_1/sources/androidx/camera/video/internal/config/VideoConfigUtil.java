package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class VideoConfigUtil {
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.Integer, androidx.camera.video.internal.encoder.VideoEncoderDataSpace>> MIME_TO_DATA_SPACE_MAP = null;
    private static final java.lang.String TAG = "VideoConfigUtil";

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.video.internal.config.VideoConfigUtil.MIME_TO_DATA_SPACE_MAP = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r3 = androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED
            r1.put(r2, r3)
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r5 = androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG
            r1.put(r4, r5)
            r6 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r7 = androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ
            r1.put(r6, r7)
            r8 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.put(r8, r7)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r9.put(r2, r3)
            r9.put(r4, r5)
            r9.put(r6, r7)
            r9.put(r8, r7)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r10.put(r2, r3)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.put(r2, r5)
            r10.put(r6, r7)
            r2 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.put(r2, r7)
            r10.put(r4, r3)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.put(r2, r5)
            r10.put(r8, r7)
            r2 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.put(r2, r7)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 256(0x100, float:3.59E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r5)
            r3 = 512(0x200, float:7.17E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r4 = androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT709
            r2.put(r3, r4)
            java.lang.String r3 = "video/hevc"
            r0.put(r3, r1)
            java.lang.String r1 = "video/av01"
            r0.put(r1, r9)
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            r0.put(r1, r10)
            java.lang.String r1 = "video/dolby-vision"
            r0.put(r1, r2)
            return
    }

    private VideoConfigUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private static java.lang.String getDynamicRangeDefaultMime(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
            int r0 = r3.getEncoding()
            r1 = 1
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L33
            r1 = 4
            if (r0 == r1) goto L33
            r1 = 5
            if (r0 == r1) goto L33
            r1 = 6
            if (r0 != r1) goto L17
            java.lang.String r3 = "video/dolby-vision"
            return r3
        L17:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported dynamic range: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "\nNo supported default mime type available."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L33:
            java.lang.String r3 = "video/hevc"
            return r3
        L37:
            java.lang.String r3 = "video/avc"
            return r3
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            java.util.Map<java.lang.String, java.util.Map<java.lang.Integer, androidx.camera.video.internal.encoder.VideoEncoderDataSpace>> r0 = androidx.camera.video.internal.config.VideoConfigUtil.MIME_TO_DATA_SPACE_MAP
            java.lang.Object r0 = r0.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r0 = (androidx.camera.video.internal.encoder.VideoEncoderDataSpace) r0
            if (r0 == 0) goto L17
            return r0
        L17:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.lang.String r2 = "Unsupported mime type %s or profile level %d. Data space is unspecified."
            java.lang.String r2 = java.lang.String.format(r2, r0)
            java.lang.String r3 = "VideoConfigUtil"
            androidx.camera.core.Logger.w(r3, r2)
            androidx.camera.video.internal.encoder.VideoEncoderDataSpace r2 = androidx.camera.video.internal.encoder.VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.encoder.VideoEncoderConfig resolveVideoEncoderConfig(@androidx.annotation.NonNull androidx.camera.video.internal.config.VideoMimeInfo r8, @androidx.annotation.NonNull androidx.camera.core.impl.Timebase r9, @androidx.annotation.NonNull androidx.camera.video.VideoSpec r10, @androidx.annotation.NonNull android.util.Size r11, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r12, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r13) {
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r5 = r8.getCompatibleVideoProfile()
            if (r5 == 0) goto L15
            androidx.camera.video.internal.config.VideoEncoderConfigVideoProfileResolver r0 = new androidx.camera.video.internal.config.VideoEncoderConfigVideoProfileResolver
            java.lang.String r1 = r8.getMimeType()
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L28
        L15:
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r13
            androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver r1 = new androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver
            java.lang.String r8 = r8.getMimeType()
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = r1
        L28:
            java.lang.Object r8 = r0.get()
            androidx.camera.video.internal.encoder.VideoEncoderConfig r8 = (androidx.camera.video.internal.encoder.VideoEncoderConfig) r8
            return r8
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.internal.config.VideoMimeInfo resolveVideoMimeInfo(@androidx.annotation.NonNull androidx.camera.video.MediaSpec r11, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r12, @androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r13) {
            boolean r0 = r12.isFullySpecified()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Dynamic range must be a fully specified dynamic range [provided dynamic range: "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkState(r0, r1)
            int r0 = r11.getOutputFormat()
            java.lang.String r0 = androidx.camera.video.MediaSpec.outputFormatToVideoMime(r0)
            r1 = -1
            java.lang.String r3 = ", dynamic range: "
            java.lang.String r4 = "VideoConfigUtil"
            if (r13 == 0) goto Lac
            java.util.Set r5 = androidx.camera.video.internal.utils.DynamicRangeUtil.dynamicRangeToVideoProfileHdrFormats(r12)
            java.util.Set r6 = androidx.camera.video.internal.utils.DynamicRangeUtil.dynamicRangeToVideoProfileBitDepth(r12)
            java.util.List r7 = r13.getVideoProfiles()
            java.util.Iterator r7 = r7.iterator()
        L3c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lac
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r8 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r8
            int r9 = r8.getHdrFormat()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto L3c
            int r9 = r8.getBitDepth()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r6.contains(r9)
            if (r9 != 0) goto L65
            goto L3c
        L65:
            java.lang.String r9 = r8.getMediaType()
            boolean r10 = java.util.Objects.equals(r0, r9)
            if (r10 == 0) goto L87
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: "
            r5.append(r6)
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            androidx.camera.core.Logger.d(r4, r0)
            goto Laa
        L87:
            int r10 = r11.getOutputFormat()
            if (r10 != r1) goto L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: "
            r5.append(r6)
            r5.append(r0)
            r5.append(r3)
            r5.append(r12)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            androidx.camera.core.Logger.d(r4, r0)
        Laa:
            r0 = r9
            goto Lad
        Lac:
            r8 = 0
        Lad:
            if (r8 != 0) goto Lf6
            int r11 = r11.getOutputFormat()
            if (r11 != r1) goto Lb9
            java.lang.String r0 = getDynamicRangeDefaultMime(r12)
        Lb9:
            if (r13 != 0) goto Ld9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: "
            r11.append(r13)
            r11.append(r0)
            r11.append(r3)
            r11.append(r12)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            androidx.camera.core.Logger.d(r4, r11)
            goto Lf6
        Ld9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: "
            r11.append(r13)
            r11.append(r0)
            r11.append(r3)
            r11.append(r12)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            androidx.camera.core.Logger.d(r4, r11)
        Lf6:
            androidx.camera.video.internal.config.VideoMimeInfo$Builder r11 = androidx.camera.video.internal.config.VideoMimeInfo.builder(r0)
            if (r8 == 0) goto Lff
            r11.setCompatibleVideoProfile(r8)
        Lff:
            androidx.camera.video.internal.config.VideoMimeInfo r11 = r11.build()
            return r11
    }

    static int scaleAndClampBitrate(int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r27) {
            r0 = r27
            android.util.Rational r1 = new android.util.Rational
            r2 = r19
            r3 = r20
            r1.<init>(r2, r3)
            android.util.Rational r4 = new android.util.Rational
            r5 = r21
            r6 = r22
            r4.<init>(r5, r6)
            android.util.Rational r7 = new android.util.Rational
            r8 = r23
            r9 = r24
            r7.<init>(r8, r9)
            android.util.Rational r10 = new android.util.Rational
            r11 = r25
            r12 = r26
            r10.<init>(r11, r12)
            r13 = r18
            double r14 = (double) r13
            double r16 = r1.doubleValue()
            double r14 = r14 * r16
            double r16 = r4.doubleValue()
            double r14 = r14 * r16
            double r16 = r7.doubleValue()
            double r14 = r14 * r16
            double r16 = r10.doubleValue()
            double r14 = r14 * r16
            int r1 = (int) r14
            java.lang.String r4 = "VideoConfigUtil"
            boolean r7 = androidx.camera.core.Logger.isDebugEnabled(r4)
            r10 = 2
            r15 = 0
            if (r7 == 0) goto L9e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r16 = 1
            r14 = 10
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r15] = r7
            r14[r16] = r2
            r14[r10] = r3
            r2 = 3
            r14[r2] = r5
            r2 = 4
            r14[r2] = r6
            r2 = 5
            r14[r2] = r8
            r2 = 6
            r14[r2] = r9
            r2 = 7
            r14[r2] = r11
            r2 = 8
            r14[r2] = r12
            r2 = 9
            r14[r2] = r13
            java.lang.String r2 = "Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d"
            java.lang.String r2 = java.lang.String.format(r2, r14)
            goto La2
        L9e:
            r16 = 1
            java.lang.String r2 = ""
        La2:
            android.util.Range<java.lang.Integer> r3 = androidx.camera.video.VideoSpec.BITRATE_RANGE_AUTO
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lda
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Comparable r1 = r0.clamp(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            boolean r5 = androidx.camera.core.Logger.isDebugEnabled(r4)
            if (r5 == 0) goto Ld9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r15] = r0
            r2[r16] = r1
            java.lang.String r0 = "\nClamped to range %s -> %dbps"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r5.append(r0)
            java.lang.String r2 = r5.toString()
        Ld9:
            r1 = r3
        Lda:
            androidx.camera.core.Logger.d(r4, r2)
            return r1
    }
}
