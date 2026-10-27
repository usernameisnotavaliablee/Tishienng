package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    private com.bykv.vk.component.ttvideo.player.AudioTimestampPoller audioTimestampPoller;
    private android.media.AudioTrack audioTrack;
    private int bufferSize;
    private long bufferSizeUs;
    private long endPlaybackHeadPosition;
    private long forceResetWorkaroundTimeMs;
    private java.lang.reflect.Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastRawPlaybackHeadPosition;
    private long latencyUs;
    private final com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker.Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;

    public interface Listener {
        void onInvalidLatency(long r1);

        void onPositionFramesMismatch(long r1, long r3, long r5, long r7);

        void onSystemTimeUsMismatch(long r1, long r3, long r5, long r7);

        void onUnderrun(int r1, long r2);
    }

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private @interface PlayState {
    }

    public AudioTrackPositionTracker(com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker.Listener r3) {
            r2 = this;
            r2.<init>()
            r2.listener = r3
            int r3 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r0 = 18
            if (r3 < r0) goto L16
            java.lang.Class<android.media.AudioTrack> r3 = android.media.AudioTrack.class
            java.lang.String r0 = "getLatency"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L16
            r2.getLatencyMethod = r3     // Catch: java.lang.NoSuchMethodException -> L16
        L16:
            r3 = 10
            long[] r3 = new long[r3]
            r2.playheadOffsets = r3
            return
    }

    private boolean forceHasPendingData() {
            r5 = this;
            boolean r0 = r5.needsPassthroughWorkarounds
            if (r0 == 0) goto L19
            android.media.AudioTrack r0 = r5.audioTrack
            int r0 = r0.getPlayState()
            r1 = 2
            if (r0 != r1) goto L19
            long r0 = r5.getPlaybackHeadPosition()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    private long framesToDurationUs(long r3) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            int r0 = r2.outputSampleRate
            long r0 = (long) r0
            long r3 = r3 / r0
            return r3
    }

    private long getPlaybackHeadPosition() {
            r11 = this;
            android.media.AudioTrack r0 = r11.audioTrack
            long r1 = r11.stopTimestampUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2b
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = r11.stopTimestampUs
            long r0 = r0 - r2
            int r2 = r11.outputSampleRate
            long r2 = (long) r2
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            long r2 = r11.endPlaybackHeadPosition
            long r4 = r11.stopPlaybackHeadPosition
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2b:
            int r1 = r0.getPlayState()
            r2 = 1
            r5 = 0
            if (r1 != r2) goto L35
            return r5
        L35:
            int r0 = r0.getPlaybackHeadPosition()
            long r7 = (long) r0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            boolean r0 = r11.needsPassthroughWorkarounds
            if (r0 == 0) goto L52
            r0 = 2
            if (r1 != r0) goto L4f
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L4f
            long r9 = r11.lastRawPlaybackHeadPosition
            r11.passthroughWorkaroundPauseOffset = r9
        L4f:
            long r9 = r11.passthroughWorkaroundPauseOffset
            long r7 = r7 + r9
        L52:
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r2 = 28
            if (r0 > r2) goto L76
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L74
            long r9 = r11.lastRawPlaybackHeadPosition
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L74
            r0 = 3
            if (r1 != r0) goto L74
            long r0 = r11.forceResetWorkaroundTimeMs
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L71
            long r0 = android.os.SystemClock.elapsedRealtime()
            r11.forceResetWorkaroundTimeMs = r0
        L71:
            long r0 = r11.lastRawPlaybackHeadPosition
            return r0
        L74:
            r11.forceResetWorkaroundTimeMs = r3
        L76:
            long r0 = r11.lastRawPlaybackHeadPosition
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L83
            long r0 = r11.rawPlaybackHeadWrapCount
            r2 = 1
            long r0 = r0 + r2
            r11.rawPlaybackHeadWrapCount = r0
        L83:
            r11.lastRawPlaybackHeadPosition = r7
            long r0 = r11.rawPlaybackHeadWrapCount
            r2 = 32
            long r0 = r0 << r2
            long r7 = r7 + r0
            return r7
    }

    private long getPlaybackHeadPositionUs() {
            r2 = this;
            long r0 = r2.getPlaybackHeadPosition()
            long r0 = r2.framesToDurationUs(r0)
            return r0
    }

    public static boolean isEncodingLinearPcm(int r1) {
            r0 = 3
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 == r0) goto L14
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L14
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L14
            r0 = 4
            if (r1 != r0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    private void maybePollAndCheckTimestamp(long r12, long r14) {
            r11 = this;
            com.bykv.vk.component.ttvideo.player.AudioTimestampPoller r0 = r11.audioTimestampPoller
            boolean r1 = r0.maybePollTimestamp(r12)
            if (r1 != 0) goto L9
            return
        L9:
            long r5 = r0.getTimestampSystemTimeUs()
            long r3 = r0.getTimestampPositionFrames()
            long r1 = r5 - r12
            long r1 = java.lang.Math.abs(r1)
            r7 = 5000000(0x4c4b40, double:2.470328E-317)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 <= 0) goto L29
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker$Listener r2 = r11.listener
            r7 = r12
            r9 = r14
            r2.onSystemTimeUsMismatch(r3, r5, r7, r9)
            r0.rejectTimestamp()
            return
        L29:
            r9 = r7
            r7 = r12
            r12 = r9
            r9 = r14
            long r14 = r11.framesToDurationUs(r3)
            long r14 = r14 - r9
            long r14 = java.lang.Math.abs(r14)
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 <= 0) goto L43
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker$Listener r2 = r11.listener
            r2.onPositionFramesMismatch(r3, r5, r7, r9)
            r0.rejectTimestamp()
            return
        L43:
            r0.acceptTimestamp()
            return
    }

    private void maybeSampleSyncParams() {
            r13 = this;
            long r0 = r13.getPlaybackHeadPositionUs()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            goto L4e
        Lb:
            long r4 = java.lang.System.nanoTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            long r6 = r13.lastPlayheadSampleTimeUs
            long r6 = r4 - r6
            r8 = 30000(0x7530, double:1.4822E-319)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L4a
            long[] r6 = r13.playheadOffsets
            int r7 = r13.nextPlayheadOffsetIndex
            long r8 = r0 - r4
            r6[r7] = r8
            int r7 = r7 + 1
            r6 = 10
            int r7 = r7 % r6
            r13.nextPlayheadOffsetIndex = r7
            int r7 = r13.playheadOffsetCount
            if (r7 >= r6) goto L33
            int r7 = r7 + 1
            r13.playheadOffsetCount = r7
        L33:
            r13.lastPlayheadSampleTimeUs = r4
            r13.smoothedPlayheadOffsetUs = r2
            r2 = 0
        L38:
            int r3 = r13.playheadOffsetCount
            if (r2 >= r3) goto L4a
            long r6 = r13.smoothedPlayheadOffsetUs
            long[] r8 = r13.playheadOffsets
            r9 = r8[r2]
            long r11 = (long) r3
            long r9 = r9 / r11
            long r6 = r6 + r9
            r13.smoothedPlayheadOffsetUs = r6
            int r2 = r2 + 1
            goto L38
        L4a:
            boolean r2 = r13.needsPassthroughWorkarounds
            if (r2 == 0) goto L4f
        L4e:
            return
        L4f:
            r13.maybePollAndCheckTimestamp(r4, r0)
            r13.maybeUpdateLatency(r4)
            return
    }

    private void maybeUpdateLatency(long r9) {
            r8 = this;
            boolean r0 = r8.isOutputPcm
            if (r0 == 0) goto L45
            java.lang.reflect.Method r0 = r8.getLatencyMethod
            if (r0 == 0) goto L45
            long r1 = r8.lastLatencySampleTimeUs
            long r1 = r9 - r1
            r3 = 500000(0x7a120, double:2.47033E-318)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L45
            r1 = 0
            android.media.AudioTrack r2 = r8.audioTrack     // Catch: java.lang.Exception -> L41
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L41
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L41
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L41
            long r2 = (long) r0     // Catch: java.lang.Exception -> L41
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r4 = r8.bufferSizeUs     // Catch: java.lang.Exception -> L41
            long r2 = r2 - r4
            r8.latencyUs = r2     // Catch: java.lang.Exception -> L41
            r4 = 0
            long r2 = java.lang.Math.max(r2, r4)     // Catch: java.lang.Exception -> L41
            r8.latencyUs = r2     // Catch: java.lang.Exception -> L41
            r6 = 5000000(0x4c4b40, double:2.470328E-317)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L43
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker$Listener r0 = r8.listener     // Catch: java.lang.Exception -> L41
            r0.onInvalidLatency(r2)     // Catch: java.lang.Exception -> L41
            r8.latencyUs = r4     // Catch: java.lang.Exception -> L41
            goto L43
        L41:
            r8.getLatencyMethod = r1
        L43:
            r8.lastLatencySampleTimeUs = r9
        L45:
            return
    }

    private static boolean needsPassthroughWorkarounds(int r2) {
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r1 = 23
            if (r0 >= r1) goto Le
            r0 = 5
            if (r2 == r0) goto Lc
            r0 = 6
            if (r2 != r0) goto Le
        Lc:
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private void resetSyncParams() {
            r3 = this;
            r0 = 0
            r3.smoothedPlayheadOffsetUs = r0
            r2 = 0
            r3.playheadOffsetCount = r2
            r3.nextPlayheadOffsetIndex = r2
            r3.lastPlayheadSampleTimeUs = r0
            return
    }

    public int getAvailableBufferSize(long r5) {
            r4 = this;
            long r0 = r4.getPlaybackHeadPosition()
            int r2 = r4.outputPcmFrameSize
            long r2 = (long) r2
            long r0 = r0 * r2
            long r5 = r5 - r0
            int r6 = (int) r5
            int r5 = r4.bufferSize
            int r5 = r5 - r6
            return r5
    }

    public long getCurrentPositionUs(boolean r8) {
            r7 = this;
            android.media.AudioTrack r0 = r7.audioTrack
            int r0 = r0.getPlayState()
            r1 = 3
            if (r0 != r1) goto Lc
            r7.maybeSampleSyncParams()
        Lc:
            long r0 = java.lang.System.nanoTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            com.bykv.vk.component.ttvideo.player.AudioTimestampPoller r2 = r7.audioTimestampPoller
            boolean r3 = r2.hasTimestamp()
            if (r3 == 0) goto L31
            long r3 = r2.getTimestampPositionFrames()
            long r3 = r7.framesToDurationUs(r3)
            boolean r8 = r2.isTimestampAdvancing()
            if (r8 != 0) goto L2a
            return r3
        L2a:
            long r5 = r2.getTimestampSystemTimeUs()
            long r0 = r0 - r5
            long r3 = r3 + r0
            return r3
        L31:
            int r2 = r7.playheadOffsetCount
            if (r2 != 0) goto L3a
            long r0 = r7.getPlaybackHeadPositionUs()
            goto L3d
        L3a:
            long r2 = r7.smoothedPlayheadOffsetUs
            long r0 = r0 + r2
        L3d:
            if (r8 != 0) goto L42
            long r2 = r7.latencyUs
            long r0 = r0 - r2
        L42:
            return r0
    }

    public void handleEndOfStream(long r5) {
            r4 = this;
            long r0 = r4.getPlaybackHeadPosition()
            r4.stopPlaybackHeadPosition = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.stopTimestampUs = r0
            r4.endPlaybackHeadPosition = r5
            return
    }

    public boolean hasPendingData(long r4) {
            r3 = this;
            long r0 = r3.getPlaybackHeadPosition()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            boolean r4 = r3.forceHasPendingData()
            if (r4 == 0) goto Lf
            goto L11
        Lf:
            r4 = 0
            return r4
        L11:
            r4 = 1
            return r4
    }

    public boolean isPlaying() {
            r2 = this;
            android.media.AudioTrack r0 = r2.audioTrack
            int r0 = r0.getPlayState()
            r1 = 3
            if (r0 != r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean isStalled(long r6) {
            r5 = this;
            long r0 = r5.forceResetWorkaroundTimeMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L20
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.forceResetWorkaroundTimeMs
            long r6 = r6 - r0
            r0 = 200(0xc8, double:9.9E-322)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L20
            r6 = 1
            return r6
        L20:
            r6 = 0
            return r6
    }

    public boolean mayHandleBuffer(long r9) {
            r8 = this;
            android.media.AudioTrack r0 = r8.audioTrack
            int r0 = r0.getPlayState()
            boolean r1 = r8.needsPassthroughWorkarounds
            r2 = 1
            if (r1 == 0) goto L1f
            r1 = 2
            r3 = 0
            if (r0 != r1) goto L12
            r8.hasData = r3
            return r3
        L12:
            if (r0 != r2) goto L1f
            long r4 = r8.getPlaybackHeadPosition()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L1f
            return r3
        L1f:
            boolean r1 = r8.hasData
            boolean r9 = r8.hasPendingData(r9)
            r8.hasData = r9
            if (r1 == 0) goto L3b
            if (r9 != 0) goto L3b
            if (r0 == r2) goto L3b
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker$Listener r9 = r8.listener
            if (r9 == 0) goto L3b
            int r10 = r8.bufferSize
            long r0 = r8.bufferSizeUs
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r9.onUnderrun(r10, r0)
        L3b:
            return r2
    }

    public boolean pause() {
            r5 = this;
            r5.resetSyncParams()
            long r0 = r5.stopTimestampUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            com.bykv.vk.component.ttvideo.player.AudioTimestampPoller r0 = r5.audioTimestampPoller
            r0.reset()
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public void reset() {
            r1 = this;
            r1.resetSyncParams()
            r0 = 0
            r1.audioTrack = r0
            r1.audioTimestampPoller = r0
            return
    }

    public void setAudioTrack(android.media.AudioTrack r3, int r4, int r5, int r6) {
            r2 = this;
            r2.audioTrack = r3
            r2.outputPcmFrameSize = r5
            r2.bufferSize = r6
            com.bykv.vk.component.ttvideo.player.AudioTimestampPoller r0 = new com.bykv.vk.component.ttvideo.player.AudioTimestampPoller
            r0.<init>(r3)
            r2.audioTimestampPoller = r0
            int r3 = r3.getSampleRate()
            r2.outputSampleRate = r3
            boolean r3 = needsPassthroughWorkarounds(r4)
            r2.needsPassthroughWorkarounds = r3
            boolean r3 = isEncodingLinearPcm(r4)
            r2.isOutputPcm = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L2d
            int r6 = r6 / r5
            long r3 = (long) r6
            long r3 = r2.framesToDurationUs(r3)
            goto L2e
        L2d:
            r3 = r0
        L2e:
            r2.bufferSizeUs = r3
            r3 = 0
            r2.lastRawPlaybackHeadPosition = r3
            r2.rawPlaybackHeadWrapCount = r3
            r2.passthroughWorkaroundPauseOffset = r3
            r5 = 0
            r2.hasData = r5
            r2.stopTimestampUs = r0
            r2.forceResetWorkaroundTimeMs = r0
            r2.latencyUs = r3
            return
    }

    public void start() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.AudioTimestampPoller r0 = r1.audioTimestampPoller
            r0.reset()
            return
    }
}
