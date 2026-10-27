package androidx.camera.video.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DebugUtils {
    private static final java.lang.String AUDIO_CAPS_PREFIX = "[AudioCaps] ";
    private static final java.lang.String CODEC_CAPS_PREFIX = "[CodecCaps] ";
    private static final java.lang.String ENCODER_CAPS_PREFIX = "[EncoderCaps] ";
    private static final java.lang.String TAG = "DebugUtils";
    private static final java.lang.String VIDEO_CAPS_PREFIX = "[VideoCaps] ";

    private DebugUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void dumpAudioCapabilities(@androidx.annotation.NonNull java.lang.StringBuilder r2, @androidx.annotation.NonNull android.media.MediaCodecInfo.AudioCapabilities r3, @androidx.annotation.NonNull android.media.MediaFormat r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[AudioCaps] getBitrateRange = "
            r0.append(r1)
            android.util.Range r1 = r3.getBitrateRange()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[AudioCaps] getMaxInputChannelCount = "
            r0.append(r1)
            int r1 = r3.getMaxInputChannelCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[AudioCaps] getMinInputChannelCount = "
            r0.append(r1)
            int r1 = androidx.camera.video.internal.compat.Api31Impl.getMinInputChannelCount(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[AudioCaps] getInputChannelCountRanges = "
            r0.append(r1)
            android.util.Range[] r1 = androidx.camera.video.internal.compat.Api31Impl.getInputChannelCountRanges(r3)
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[AudioCaps] getSupportedSampleRateRanges = "
            r0.append(r1)
            android.util.Range[] r1 = r3.getSupportedSampleRateRanges()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[AudioCaps] getSupportedSampleRates = "
            r0.append(r1)
            int[] r1 = r3.getSupportedSampleRates()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
            java.lang.String r0 = "sample-rate"
            int r4 = r4.getInteger(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r0.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = "[AudioCaps] isSampleRateSupported for "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lc9
            r0.append(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = " = "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = r3.isSampleRateSupported(r4)     // Catch: java.lang.Throwable -> Lc9
            r0.append(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> Lc9
            logToString(r2, r3)     // Catch: java.lang.Throwable -> Lc9
            return
        Lc9:
            java.lang.String r3 = "[AudioCaps] mediaFormat does not contain sample rate"
            logToString(r2, r3)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String dumpCodecCapabilities(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.media.MediaCodec r4, @androidx.annotation.NonNull android.media.MediaFormat r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.media.MediaCodecInfo r1 = r4.getCodecInfo()     // Catch: java.lang.IllegalArgumentException -> L19
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r3)     // Catch: java.lang.IllegalArgumentException -> L19
            if (r1 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            androidx.core.util.Preconditions.checkArgument(r2)     // Catch: java.lang.IllegalArgumentException -> L19
            dumpCodecCapabilities(r0, r1, r5)     // Catch: java.lang.IllegalArgumentException -> L19
            goto L39
        L19:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "["
            r5.append(r1)
            java.lang.String r4 = r4.getName()
            r5.append(r4)
            java.lang.String r4 = "] does not support mime "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            logToString(r0, r3)
        L39:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static void dumpCodecCapabilities(@androidx.annotation.NonNull java.lang.StringBuilder r6, @androidx.annotation.NonNull android.media.MediaCodecInfo.CodecCapabilities r7, @androidx.annotation.NonNull android.media.MediaFormat r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L19
            r0.<init>()     // Catch: java.lang.ClassCastException -> L19
            java.lang.String r1 = "[CodecCaps] isFormatSupported = "
            r0.append(r1)     // Catch: java.lang.ClassCastException -> L19
            boolean r1 = r7.isFormatSupported(r8)     // Catch: java.lang.ClassCastException -> L19
            r0.append(r1)     // Catch: java.lang.ClassCastException -> L19
            java.lang.String r0 = r0.toString()     // Catch: java.lang.ClassCastException -> L19
            logToString(r6, r0)     // Catch: java.lang.ClassCastException -> L19
            goto L1e
        L19:
            java.lang.String r0 = "[CodecCaps] isFormatSupported=false"
            logToString(r6, r0)
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[CodecCaps] getDefaultFormat = "
            r0.append(r1)
            android.media.MediaFormat r1 = r7.getDefaultFormat()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r6, r0)
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r7.profileLevels
            if (r0 == 0) goto L7a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.media.MediaCodecInfo$CodecProfileLevel[] r2 = r7.profileLevels
            int r3 = r2.length
            r4 = 0
        L4a:
            if (r4 >= r3) goto L58
            r5 = r2[r4]
            java.lang.String r5 = toString(r5)
            r1.add(r5)
            int r4 = r4 + 1
            goto L4a
        L58:
            java.lang.String r2 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[CodecCaps] profileLevels = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            logToString(r6, r0)
        L7a:
            int[] r0 = r7.colorFormats
            if (r0 == 0) goto L98
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[CodecCaps] colorFormats = "
            r0.append(r1)
            int[] r1 = r7.colorFormats
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r6, r0)
        L98:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r7.getVideoCapabilities()
            if (r0 == 0) goto La1
            dumpVideoCapabilities(r6, r0, r8)
        La1:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r7.getAudioCapabilities()
            if (r0 == 0) goto Laa
            dumpAudioCapabilities(r6, r0, r8)
        Laa:
            android.media.MediaCodecInfo$EncoderCapabilities r7 = r7.getEncoderCapabilities()
            if (r7 == 0) goto Lb3
            dumpEncoderCapabilities(r6, r7, r8)
        Lb3:
            return
    }

    private static void dumpEncoderCapabilities(@androidx.annotation.NonNull java.lang.StringBuilder r2, @androidx.annotation.NonNull android.media.MediaCodecInfo.EncoderCapabilities r3, @androidx.annotation.NonNull android.media.MediaFormat r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[EncoderCaps] getComplexityRange = "
            r0.append(r1)
            android.util.Range r1 = r3.getComplexityRange()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[EncoderCaps] getQualityRange = "
            r0.append(r1)
            android.util.Range r1 = androidx.camera.video.internal.compat.Api28Impl.getQualityRange(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r2, r0)
        L36:
            java.lang.String r0 = "bitrate-mode"
            int r4 = r4.getInteger(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "[EncoderCaps] isBitrateModeSupported = "
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            boolean r3 = r3.isBitrateModeSupported(r4)     // Catch: java.lang.Throwable -> L55
            r0.append(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L55
            logToString(r2, r3)     // Catch: java.lang.Throwable -> L55
            return
        L55:
            java.lang.String r3 = "[EncoderCaps] mediaFormat does not contain bitrate mode"
            logToString(r2, r3)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String dumpMediaCodecListForFormat(@androidx.annotation.NonNull android.media.MediaCodecList r10, @androidx.annotation.NonNull android.media.MediaFormat r11) {
            java.lang.String r0 = "]"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[Start] Dump MediaCodecList for mediaFormat "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            logToString(r1, r2)
            java.lang.String r2 = "mime"
            java.lang.String r2 = r11.getString(r2)
            android.media.MediaCodecInfo[] r10 = r10.getCodecInfos()
            int r3 = r10.length
            r4 = 0
            r5 = 0
        L28:
            if (r5 >= r3) goto La4
            r6 = r10[r5]
            boolean r7 = r6.isEncoder()
            if (r7 != 0) goto L33
            goto La1
        L33:
            r7 = 1
            if (r2 == 0) goto L38
            r8 = 1
            goto L39
        L38:
            r8 = 0
        L39:
            androidx.core.util.Preconditions.checkArgument(r8)     // Catch: java.lang.IllegalArgumentException -> L81
            android.media.MediaCodecInfo$CodecCapabilities r8 = r6.getCapabilitiesForType(r2)     // Catch: java.lang.IllegalArgumentException -> L81
            if (r8 == 0) goto L43
            goto L44
        L43:
            r7 = 0
        L44:
            androidx.core.util.Preconditions.checkArgument(r7)     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L81
            r7.<init>()     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.String r9 = "[Start] ["
            r7.append(r9)     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.String r9 = r6.getName()     // Catch: java.lang.IllegalArgumentException -> L81
            r7.append(r9)     // Catch: java.lang.IllegalArgumentException -> L81
            r7.append(r0)     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.String r7 = r7.toString()     // Catch: java.lang.IllegalArgumentException -> L81
            logToString(r1, r7)     // Catch: java.lang.IllegalArgumentException -> L81
            dumpCodecCapabilities(r1, r8, r11)     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L81
            r7.<init>()     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.String r8 = "[End] ["
            r7.append(r8)     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.String r8 = r6.getName()     // Catch: java.lang.IllegalArgumentException -> L81
            r7.append(r8)     // Catch: java.lang.IllegalArgumentException -> L81
            r7.append(r0)     // Catch: java.lang.IllegalArgumentException -> L81
            java.lang.String r7 = r7.toString()     // Catch: java.lang.IllegalArgumentException -> L81
            logToString(r1, r7)     // Catch: java.lang.IllegalArgumentException -> L81
            goto La1
        L81:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "["
            r7.append(r8)
            java.lang.String r6 = r6.getName()
            r7.append(r6)
            java.lang.String r6 = "] does not support mime "
            r7.append(r6)
            r7.append(r2)
            java.lang.String r6 = r7.toString()
            logToString(r1, r6)
        La1:
            int r5 = r5 + 1
            goto L28
        La4:
            java.lang.String r10 = "[End] Dump MediaCodecList"
            logToString(r1, r10)
            java.lang.String r10 = r1.toString()
            stringToLog(r10)
            return r10
    }

    private static void dumpVideoCapabilities(@androidx.annotation.NonNull java.lang.StringBuilder r9, @androidx.annotation.NonNull android.media.MediaCodecInfo.VideoCapabilities r10, @androidx.annotation.NonNull android.media.MediaFormat r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[VideoCaps] getBitrateRange = "
            r0.append(r1)
            android.util.Range r1 = r10.getBitrateRange()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[VideoCaps] getSupportedWidths = "
            r0.append(r1)
            android.util.Range r1 = r10.getSupportedWidths()
            r0.append(r1)
            java.lang.String r1 = ", getWidthAlignment = "
            r0.append(r1)
            int r1 = r10.getWidthAlignment()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[VideoCaps] getSupportedHeights = "
            r0.append(r1)
            android.util.Range r1 = r10.getSupportedHeights()
            r0.append(r1)
            java.lang.String r1 = ", getHeightAlignment = "
            r0.append(r1)
            int r1 = r10.getHeightAlignment()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            logToString(r9, r0)
            r0 = 0
            r1 = 1
            java.lang.String r2 = "width"
            int r2 = r11.getInteger(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "height"
            int r3 = r11.getInteger(r3)     // Catch: java.lang.Throwable -> L7b
            if (r2 <= 0) goto L75
            if (r3 <= 0) goto L75
            r4 = 1
            goto L76
        L75:
            r4 = 0
        L76:
            androidx.core.util.Preconditions.checkArgument(r4)     // Catch: java.lang.Throwable -> L7b
            r4 = 1
            goto L83
        L7b:
            java.lang.String r2 = "[VideoCaps] mediaFormat does not contain valid width and height"
            logToString(r9, r2)
            r2 = 0
            r3 = 0
            r4 = 0
        L83:
            java.lang.String r5 = "x"
            java.lang.String r6 = " = "
            if (r4 == 0) goto L114
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> La9
            r7.<init>()     // Catch: java.lang.IllegalArgumentException -> La9
            java.lang.String r8 = "[VideoCaps] getSupportedHeightsFor "
            r7.append(r8)     // Catch: java.lang.IllegalArgumentException -> La9
            r7.append(r2)     // Catch: java.lang.IllegalArgumentException -> La9
            r7.append(r6)     // Catch: java.lang.IllegalArgumentException -> La9
            android.util.Range r8 = r10.getSupportedHeightsFor(r2)     // Catch: java.lang.IllegalArgumentException -> La9
            r7.append(r8)     // Catch: java.lang.IllegalArgumentException -> La9
            java.lang.String r7 = r7.toString()     // Catch: java.lang.IllegalArgumentException -> La9
            logToString(r9, r7)     // Catch: java.lang.IllegalArgumentException -> La9
            goto Lbd
        La9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[VideoCaps] could not getSupportedHeightsFor "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            logToString(r9, r7)
        Lbd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> Ldc
            r7.<init>()     // Catch: java.lang.IllegalArgumentException -> Ldc
            java.lang.String r8 = "[VideoCaps] getSupportedWidthsFor "
            r7.append(r8)     // Catch: java.lang.IllegalArgumentException -> Ldc
            r7.append(r3)     // Catch: java.lang.IllegalArgumentException -> Ldc
            r7.append(r6)     // Catch: java.lang.IllegalArgumentException -> Ldc
            android.util.Range r8 = r10.getSupportedWidthsFor(r3)     // Catch: java.lang.IllegalArgumentException -> Ldc
            r7.append(r8)     // Catch: java.lang.IllegalArgumentException -> Ldc
            java.lang.String r7 = r7.toString()     // Catch: java.lang.IllegalArgumentException -> Ldc
            logToString(r9, r7)     // Catch: java.lang.IllegalArgumentException -> Ldc
            goto Lf0
        Ldc:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[VideoCaps] could not getSupportedWidthsFor "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            logToString(r9, r7)
        Lf0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[VideoCaps] isSizeSupported for "
            r7.append(r8)
            r7.append(r2)
            r7.append(r5)
            r7.append(r3)
            r7.append(r6)
            boolean r8 = r10.isSizeSupported(r2, r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            logToString(r9, r7)
        L114:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[VideoCaps] getSupportedFrameRates = "
            r7.append(r8)
            android.util.Range r8 = r10.getSupportedFrameRates()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            logToString(r9, r7)
            java.lang.String r7 = "frame-rate"
            int r11 = r11.getInteger(r7)     // Catch: java.lang.Throwable -> L13b
            if (r11 <= 0) goto L135
            goto L136
        L135:
            r1 = 0
        L136:
            androidx.core.util.Preconditions.checkArgument(r1)     // Catch: java.lang.Throwable -> L13b
            r0 = r11
            goto L140
        L13b:
            java.lang.String r11 = "[VideoCaps] mediaFormat does not contain frame rate"
            logToString(r9, r11)
        L140:
            if (r4 == 0) goto L166
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "[VideoCaps] getSupportedFrameRatesFor "
            r11.append(r1)
            r11.append(r2)
            r11.append(r5)
            r11.append(r3)
            r11.append(r6)
            android.util.Range r1 = r10.getSupportedFrameRatesFor(r2, r3)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            logToString(r9, r11)
        L166:
            if (r4 == 0) goto L197
            if (r0 <= 0) goto L197
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "[VideoCaps] areSizeAndRateSupported for "
            r11.append(r1)
            r11.append(r2)
            r11.append(r5)
            r11.append(r3)
            java.lang.String r1 = ", "
            r11.append(r1)
            r11.append(r0)
            r11.append(r6)
            double r0 = (double) r0
            boolean r10 = r10.areSizeAndRateSupported(r2, r3, r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            logToString(r9, r10)
        L197:
            return
    }

    private static java.lang.String formatInterval(long r11) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toHours(r11)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.HOURS
            long r4 = r3.toMillis(r1)
            long r4 = r11 - r4
            long r4 = r0.toMinutes(r4)
            long r6 = r3.toMillis(r1)
            long r6 = r11 - r6
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            long r9 = r8.toMillis(r4)
            long r6 = r6 - r9
            long r6 = r0.toSeconds(r6)
            long r9 = r3.toMillis(r1)
            long r11 = r11 - r9
            long r8 = r8.toMillis(r4)
            long r11 = r11 - r8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r0.toMillis(r6)
            long r11 = r11 - r8
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r4 = 0
            r12[r4] = r1
            r1 = 1
            r12[r1] = r2
            r1 = 2
            r12[r1] = r3
            r1 = 3
            r12[r1] = r11
            java.lang.String r11 = "%02d:%02d:%02d.%03d"
            java.lang.String r11 = java.lang.String.format(r0, r11, r12)
            return r11
    }

    private static void logToString(@androidx.annotation.NonNull java.lang.StringBuilder r0, @androidx.annotation.NonNull java.lang.String r1) {
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String readableBufferInfo(@androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Dump BufferInfo: "
            r1.append(r2)
            java.lang.String r2 = r5.toString()
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\toffset: "
            r1.append(r3)
            int r3 = r5.offset
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\tsize: "
            r1.append(r3)
            int r3 = r5.size
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\tflag: "
            r1.append(r3)
            int r3 = r5.flags
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r5.flags
            r3 = r3 & 4
            if (r3 == 0) goto L7a
            java.lang.String r3 = "EOS"
            r1.add(r3)
        L7a:
            int r3 = r5.flags
            r3 = r3 & 2
            if (r3 == 0) goto L85
            java.lang.String r3 = "CODEC_CONFIG"
            r1.add(r3)
        L85:
            int r3 = r5.flags
            r3 = r3 & 1
            if (r3 == 0) goto L90
            java.lang.String r3 = "KEY_FRAME"
            r1.add(r3)
        L90:
            int r3 = r5.flags
            r3 = r3 & 8
            if (r3 == 0) goto L9b
            java.lang.String r3 = "PARTIAL_FRAME"
            r1.add(r3)
        L9b:
            boolean r3 = r1.isEmpty()
            java.lang.String r4 = " ("
            if (r3 != 0) goto Lb4
            r0.append(r4)
            java.lang.String r3 = " | "
            java.lang.String r1 = android.text.TextUtils.join(r3, r1)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
        Lb4:
            r0.append(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\tpresentationTime: "
            r1.append(r2)
            long r2 = r5.presentationTimeUs
            r1.append(r2)
            r1.append(r4)
            long r2 = r5.presentationTimeUs
            java.lang.String r5 = readableUs(r2)
            r1.append(r5)
            java.lang.String r5 = ")\n"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @androidx.annotation.NonNull
    public static java.lang.String readableMs(long r0) {
            java.lang.String r0 = formatInterval(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String readableUs(long r1) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r1 = r0.toMillis(r1)
            java.lang.String r1 = readableMs(r1)
            return r1
    }

    private static void stringToLog(@androidx.annotation.NonNull java.lang.String r2) {
            java.lang.String r0 = "DebugUtils"
            boolean r1 = androidx.camera.core.Logger.isInfoEnabled(r0)
            if (r1 == 0) goto L1b
            java.util.Scanner r1 = new java.util.Scanner
            r1.<init>(r2)
        Ld:
            boolean r2 = r1.hasNextLine()
            if (r2 == 0) goto L1b
            java.lang.String r2 = r1.nextLine()
            androidx.camera.core.Logger.i(r0, r2)
            goto Ld
        L1b:
            return
    }

    @androidx.annotation.NonNull
    private static java.lang.String toString(@androidx.annotation.Nullable android.media.MediaCodecInfo.CodecProfileLevel r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = "null"
            return r3
        L5:
            int r0 = r3.level
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r3.profile
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            java.lang.String r3 = "{level=%d, profile=%d}"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            return r3
    }
}
