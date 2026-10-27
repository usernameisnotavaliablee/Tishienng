package androidx.camera.video.internal.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EncoderFinder {
    private static final java.lang.String TAG = "EncoderFinder";
    private final boolean mShouldRemoveKeyFrameRate;

    public EncoderFinder() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk> r0 = androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk r0 = (androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk) r0
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r1.mShouldRemoveKeyFrameRate = r0
            return
    }

    @androidx.annotation.Nullable
    private java.lang.String findEncoderWithNearestCompatibleBitrate(@androidx.annotation.NonNull android.media.MediaFormat r14, @androidx.annotation.NonNull android.media.MediaCodecInfo[] r15) {
            r13 = this;
            java.lang.String r0 = "bitrate"
            java.lang.String r1 = "mime"
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r2 = "EncoderFinder"
            r3 = 0
            if (r1 != 0) goto L13
            java.lang.String r14 = "MediaFormat does not contain mime info."
            androidx.camera.core.Logger.w(r2, r14)
            return r3
        L13:
            int r4 = r15.length
            r5 = 0
            r6 = 0
        L16:
            if (r6 >= r4) goto Lae
            r7 = r15[r6]
            boolean r8 = r7.isEncoder()
            if (r8 != 0) goto L22
            goto Laa
        L22:
            android.media.MediaCodecInfo$CodecCapabilities r8 = r7.getCapabilitiesForType(r1)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalArgumentException -> L66
            r9 = 1
            if (r8 == 0) goto L2b
            r10 = 1
            goto L2c
        L2b:
            r10 = 0
        L2c:
            java.lang.String r11 = "MIME type is not supported"
            androidx.core.util.Preconditions.checkArgument(r10, r11)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalArgumentException -> L66
            boolean r10 = r14.containsKey(r0)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalArgumentException -> L66
            if (r10 == 0) goto L69
            android.media.MediaCodecInfo$VideoCapabilities r10 = r8.getVideoCapabilities()     // Catch: java.lang.Throwable -> L64 java.lang.IllegalArgumentException -> L66
            if (r10 == 0) goto L3f
            r11 = 1
            goto L40
        L3f:
            r11 = 0
        L40:
            java.lang.String r12 = "Not video codec"
            androidx.core.util.Preconditions.checkArgument(r11, r12)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalArgumentException -> L66
            int r11 = r14.getInteger(r0)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalArgumentException -> L66
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalArgumentException -> L66
            android.util.Range r10 = r10.getBitrateRange()     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            java.lang.Comparable r10 = r10.clamp(r11)     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            r14.setInteger(r0, r10)     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            goto L6b
        L5f:
            r15 = move-exception
            r3 = r11
            goto L9d
        L62:
            goto La7
        L64:
            r15 = move-exception
            goto L9d
        L66:
            r11 = r3
            goto La7
        L69:
            r10 = -1
            r11 = r3
        L6b:
            boolean r8 = r8.isFormatSupported(r14)     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            if (r8 == 0) goto L93
            java.lang.String r8 = "No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            r12[r5] = r11     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            r12[r9] = r10     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            java.lang.String r8 = java.lang.String.format(r8, r12)     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            androidx.camera.core.Logger.w(r2, r8)     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            java.lang.String r15 = r7.getName()     // Catch: java.lang.Throwable -> L5f java.lang.IllegalArgumentException -> L62
            if (r11 == 0) goto L92
            int r1 = r11.intValue()
            r14.setInteger(r0, r1)
        L92:
            return r15
        L93:
            if (r11 == 0) goto Laa
        L95:
            int r7 = r11.intValue()
            r14.setInteger(r0, r7)
            goto Laa
        L9d:
            if (r3 == 0) goto La6
            int r1 = r3.intValue()
            r14.setInteger(r0, r1)
        La6:
            throw r15
        La7:
            if (r11 == 0) goto Laa
            goto L95
        Laa:
            int r6 = r6 + 1
            goto L16
        Lae:
            return r3
    }

    private boolean shouldCreateCodecByType(@androidx.annotation.NonNull android.media.MediaFormat r2) {
            r1 = this;
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk> r0 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk r0 = (androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk) r0
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            boolean r2 = r0.isUnSupportMediaCodecInfo(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public android.media.MediaCodec findEncoder(@androidx.annotation.NonNull android.media.MediaFormat r10) throws androidx.camera.video.internal.encoder.InvalidConfigException {
            r9 = this;
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r1 = 1
            r0.<init>(r1)
            java.lang.String r2 = r9.findEncoderForFormat(r10, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            if (r3 == 0) goto L38
            java.lang.String r3 = "mime"
            java.lang.String r3 = r10.getString(r3)     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            android.media.MediaCodec r4 = android.media.MediaCodec.createEncoderByType(r3)     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            java.lang.String r3 = androidx.camera.video.internal.DebugUtils.dumpCodecCapabilities(r3, r4, r10)     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            java.lang.String r5 = "EncoderFinder"
            java.lang.String r6 = "No encoder found that supports requested MediaFormat %s. Create encoder by MIME type. Dump codec info:\n%s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            r8 = 0
            r7[r8] = r10     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            r7[r1] = r3     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            java.lang.String r1 = java.lang.String.format(r6, r7)     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            androidx.camera.core.Logger.w(r5, r1)     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            return r4
        L32:
            r1 = move-exception
            goto L3d
        L34:
            r1 = move-exception
            goto L3d
        L36:
            r1 = move-exception
            goto L3d
        L38:
            android.media.MediaCodec r10 = android.media.MediaCodec.createByCodecName(r2)     // Catch: java.lang.IllegalArgumentException -> L32 java.lang.NullPointerException -> L34 java.io.IOException -> L36
            return r10
        L3d:
            boolean r3 = r9.shouldCreateCodecByType(r10)
            java.lang.String r10 = androidx.camera.video.internal.DebugUtils.dumpMediaCodecListForFormat(r0, r10)
            androidx.camera.video.internal.encoder.InvalidConfigException r0 = new androidx.camera.video.internal.encoder.InvalidConfigException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Encoder cannot created: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", isMediaFormatInQuirk: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "\n"
            r4.append(r2)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            r0.<init>(r10, r1)
            throw r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    java.lang.String findEncoderForFormat(@androidx.annotation.NonNull android.media.MediaFormat r7, @androidx.annotation.NonNull android.media.MediaCodecList r8) {
            r6 = this;
            java.lang.String r0 = "aac-profile"
            java.lang.String r1 = "frame-rate"
            r2 = 0
            boolean r3 = r6.mShouldRemoveKeyFrameRate     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L22
            boolean r3 = r7.containsKey(r1)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L22
            int r3 = r7.getInteger(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            r7.setString(r1, r2)     // Catch: java.lang.Throwable -> L1b
            goto L23
        L1b:
            r8 = move-exception
            r4 = r2
        L1d:
            r2 = r3
            goto L5f
        L1f:
            r8 = move-exception
            r4 = r2
            goto L5f
        L22:
            r3 = r2
        L23:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r5 = 23
            if (r4 > r5) goto L3e
            boolean r4 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L3e
            int r4 = r7.getInteger(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1b
            r7.setString(r0, r2)     // Catch: java.lang.Throwable -> L3c
            r2 = r4
            goto L3e
        L3c:
            r8 = move-exception
            goto L1d
        L3e:
            java.lang.String r4 = r8.findEncoderForFormat(r7)     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L4c
            android.media.MediaCodecInfo[] r8 = r8.getCodecInfos()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = r6.findEncoderWithNearestCompatibleBitrate(r7, r8)     // Catch: java.lang.Throwable -> L1b
        L4c:
            if (r3 == 0) goto L55
            int r8 = r3.intValue()
            r7.setInteger(r1, r8)
        L55:
            if (r2 == 0) goto L5e
            int r8 = r2.intValue()
            r7.setInteger(r0, r8)
        L5e:
            return r4
        L5f:
            if (r2 == 0) goto L68
            int r2 = r2.intValue()
            r7.setInteger(r1, r2)
        L68:
            if (r4 == 0) goto L71
            int r1 = r4.intValue()
            r7.setInteger(r0, r1)
        L71:
            throw r8
    }
}
