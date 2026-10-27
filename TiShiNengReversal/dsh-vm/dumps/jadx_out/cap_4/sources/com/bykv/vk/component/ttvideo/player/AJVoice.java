package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AJVoice implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {
    private static final int DISCONTINGUNITY_MS = 200;
    private static final int ERROR_FORMAT_ILLEGAL = -12;
    private static final int ERROR_NULL_BUFFER = -10;
    private static final int ERROR_SIZE_ILLEGAL = -11;
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final int MAX_LATENCY_MS = 5000;
    private static final int MIN_LATENCY_CHECK_MS = 500;
    private static final int MS_UNIT = 1000;
    private static final long RELEASE_WORKAROUND_TIME_MS = 80;
    private static final int SDK_INT = 0;
    private static final int START_NO_SET = -1;
    private static final int S_FAIL = -1;
    private static final int S_OK = 0;
    private static final java.lang.String TAG = "AJVoice";
    private static final long TIME_UNSET = -9223372036854775807L;
    private static final int kNoSettingVolume = -1;
    private static java.lang.String mDeviceName;
    private static boolean mNeedReleaseWorkAround;
    private com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker audioTrackPositionTracker;
    private long forceResetWorkaroundTimeMs;
    private java.lang.reflect.Method getLatencyMethod;
    private long lastRawPlaybackHeadPosition;
    private int mAudioFormat;
    private android.media.AudioManager mAudioManager;
    private android.media.AudioTrack mAudioTrack;
    private int mBlockSize;
    private int mBufferSizeMs;
    private int mChannels;
    private int mChannelsLayout;
    private int mEnableAudioTrackSmoothClock;
    private int mFrameSamples;
    private long mLastGetLatencyMs;
    private int mLatencyMs;
    private float mLeftVolume;
    private int mMaxVolume;
    private byte[] mMinBytes;

    @com.bykv.vk.component.ttvideo.player.Keep
    private long mNativeObject;
    private com.bykv.vk.component.ttvideo.player.TTPlayer mPlayer;
    private android.os.ConditionVariable mReleasingConditionVariable;
    private int mSampleBytes;
    private int mSampleFormat;
    private int mSampleRate;
    private int mSerial;
    private int mStartMediaTimeMs;
    private long mStartTime;
    private volatile boolean mStoped;
    private int mStreamType;
    private int mTrackBufferSize;
    private long mWrittenPcmBytes;



    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            com.bykv.vk.component.ttvideo.player.AJVoice.SDK_INT = r0
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public AJVoice() {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.mAudioTrack = r0
            r8.mPlayer = r0
            r1 = 2048(0x800, float:2.87E-42)
            r8.mBlockSize = r1
            r1 = 44100(0xac44, float:6.1797E-41)
            r8.mSampleRate = r1
            r1 = 2
            r8.mChannels = r1
            r8.mSampleBytes = r1
            r2 = 0
            r8.mSampleFormat = r2
            r8.mFrameSamples = r2
            r8.mAudioManager = r0
            r8.mChannelsLayout = r2
            r8.mAudioFormat = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.mLeftVolume = r1
            r8.mMaxVolume = r2
            r1 = 1
            r8.mStoped = r1
            r3 = -1
            r8.mSerial = r3
            r8.getLatencyMethod = r0
            r8.mTrackBufferSize = r2
            r8.mLatencyMs = r2
            r8.mBufferSizeMs = r2
            r4 = 0
            r8.mLastGetLatencyMs = r4
            r8.mWrittenPcmBytes = r4
            r8.lastRawPlaybackHeadPosition = r4
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.forceResetWorkaroundTimeMs = r6
            r8.mStartTime = r4
            r0 = 3
            r8.mStreamType = r0
            r8.mEnableAudioTrackSmoothClock = r2
            r8.mNativeObject = r4
            r8.mStartMediaTimeMs = r3
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.mDeviceName
            if (r0 != 0) goto L61
            java.lang.String r0 = android.os.Build.DEVICE
            com.bykv.vk.component.ttvideo.player.AJVoice.mDeviceName = r0
            java.lang.String r2 = "OnePlus6T"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L61
            com.bykv.vk.component.ttvideo.player.AJVoice.mNeedReleaseWorkAround = r1
        L61:
            return
    }

    static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            return r0
    }

    static /* synthetic */ android.os.ConditionVariable access$100(com.bykv.vk.component.ttvideo.player.AJVoice r0) {
            android.os.ConditionVariable r0 = r0.mReleasingConditionVariable
            return r0
    }

    public static int getAudioTrackChannelConfig(int r0) {
            switch(r0) {
                case 1: goto L1a;
                case 2: goto L17;
                case 3: goto L14;
                case 4: goto L11;
                case 5: goto Le;
                case 6: goto Lb;
                case 7: goto L8;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 6396(0x18fc, float:8.963E-42)
            return r0
        L8:
            r0 = 1276(0x4fc, float:1.788E-42)
            return r0
        Lb:
            r0 = 252(0xfc, float:3.53E-43)
            return r0
        Le:
            r0 = 220(0xdc, float:3.08E-43)
            return r0
        L11:
            r0 = 204(0xcc, float:2.86E-43)
            return r0
        L14:
            r0 = 28
            return r0
        L17:
            r0 = 12
            return r0
        L1a:
            r0 = 4
            return r0
    }

    public static int getPcmFrameSize(int r1, int r2) {
            r0 = 2
            if (r1 == r0) goto Ld
            r0 = 3
            if (r1 != r0) goto L7
            return r2
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        Ld:
            int r2 = r2 * 2
            return r2
    }

    private long getPlaybackBytes() {
            r4 = this;
            long r0 = r4.getPlaybackHeadPosition()
            int r2 = r4.mAudioFormat
            int r3 = r4.mChannels
            int r2 = getPcmFrameSize(r2, r3)
            long r2 = (long) r2
            long r0 = r0 * r2
            return r0
    }

    private long getPlaybackHeadPosition() {
            r10 = this;
            android.media.AudioTrack r0 = r10.mAudioTrack
            int r0 = r0.getPlayState()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto Lc
            return r2
        Lc:
            android.media.AudioTrack r1 = r10.mAudioTrack
            int r1 = r1.getPlaybackHeadPosition()
            long r4 = (long) r1
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L3a
            long r8 = r10.lastRawPlaybackHeadPosition
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3a
            r1 = 3
            if (r0 != r1) goto L3a
            long r0 = r10.forceResetWorkaroundTimeMs
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L37
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.forceResetWorkaroundTimeMs = r0
        L37:
            long r0 = r10.lastRawPlaybackHeadPosition
            return r0
        L3a:
            r10.forceResetWorkaroundTimeMs = r6
            r10.lastRawPlaybackHeadPosition = r4
            return r4
    }

    private long getPlaybackPositionMs() {
            r4 = this;
            long r0 = r4.getPlaybackHeadPosition()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            int r2 = r4.mSampleRate
            long r2 = (long) r2
            long r0 = r0 / r2
            return r0
    }

    private long getWrittenDurationMs() {
            r4 = this;
            long r0 = r4.mWrittenPcmBytes
            int r2 = r4.mAudioFormat
            int r3 = r4.mChannels
            int r2 = getPcmFrameSize(r2, r3)
            long r2 = (long) r2
            long r0 = r0 / r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            int r2 = r4.mSampleRate
            long r2 = (long) r2
            long r0 = r0 / r2
            return r0
    }

    private boolean needsReset() {
            r5 = this;
            long r0 = r5.forceResetWorkaroundTimeMs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            long r0 = r5.mWrittenPcmBytes
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.forceResetWorkaroundTimeMs
            long r0 = r0 - r2
            r2 = 200(0xc8, double:9.9E-322)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    private int reconfigure() {
            r14 = this;
            java.lang.String r0 = "create audiotrack but failed to initialize"
            com.bykv.vk.component.ttvideo.player.TTPlayer r1 = r14.mPlayer
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "audio"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r14.mAudioManager = r1
            if (r1 == 0) goto L1c
            int r2 = r14.mStreamType
            int r1 = r1.getStreamMaxVolume(r2)
            r14.mMaxVolume = r1
        L1c:
            int r1 = r14.mChannels
            int r1 = getAudioTrackChannelConfig(r1)
            r14.mChannelsLayout = r1
            r2 = 0
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L41
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.util.Locale r1 = java.util.Locale.US
            int r5 = r14.mChannels
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r5
            java.lang.String r2 = "not supoort channel:%d"
            java.lang.String r1 = java.lang.String.format(r1, r2, r3)
            com.bykv.vk.component.ttvideo.utils.AVLogger.k(r0, r1)
            return r4
        L41:
            int r5 = r14.mSampleBytes
            if (r5 != r3) goto L49
            r5 = 3
            r14.mAudioFormat = r5
            goto L4e
        L49:
            r6 = 2
            if (r5 != r6) goto Lda
            r14.mAudioFormat = r6
        L4e:
            int r5 = r14.mSampleRate
            int r6 = r14.mAudioFormat
            int r12 = android.media.AudioTrack.getMinBufferSize(r5, r1, r6)
            if (r12 > 0) goto L82
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getMinBufferSize failed, trace: sampleRate = "
            r1.<init>(r2)
            int r2 = r14.mSampleRate
            r1.append(r2)
            java.lang.String r2 = ", mChannelsLayout = "
            r1.append(r2)
            int r2 = r14.mChannelsLayout
            r1.append(r2)
            java.lang.String r2 = ", mAudioFormat = "
            r1.append(r2)
            int r2 = r14.mAudioFormat
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            return r12
        L82:
            r14.mTrackBufferSize = r12
            byte[] r1 = new byte[r12]     // Catch: java.lang.OutOfMemoryError -> Ld0
            r14.mMinBytes = r1     // Catch: java.lang.OutOfMemoryError -> Ld0
            int r1 = r14.mAudioFormat
            int r5 = r14.mChannels
            int r1 = getPcmFrameSize(r1, r5)
            int r1 = r12 / r1
            int r1 = r1 * 1000
            int r5 = r14.mSampleRate
            int r1 = r1 / r5
            r14.mBufferSizeMs = r1
            android.media.AudioTrack r7 = new android.media.AudioTrack     // Catch: java.lang.Throwable -> Lbf
            int r8 = r14.mStreamType     // Catch: java.lang.Throwable -> Lbf
            int r9 = r14.mSampleRate     // Catch: java.lang.Throwable -> Lbf
            int r10 = r14.mChannelsLayout     // Catch: java.lang.Throwable -> Lbf
            int r11 = r14.mAudioFormat     // Catch: java.lang.Throwable -> Lbf
            r13 = 1
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lbf
            r14.mAudioTrack = r7     // Catch: java.lang.Throwable -> Lbf
            int r1 = r7.getState()
            if (r1 == r3) goto Lbe
            r1 = -3
            r2 = 0
            android.media.AudioTrack r3 = r14.mAudioTrack     // Catch: java.lang.Throwable -> Lb6
            r3.release()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r14.mAudioTrack = r2
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            return r1
        Lbe:
            return r2
        Lbf:
            r0 = move-exception
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r2 = "create audio track failed ,detail = "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            com.bytedance.sdk.component.utils.vl.r(r1, r0)
            return r4
        Ld0:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r1 = "out of memory error when new audio buffer for audiotrack"
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            r0 = -10
            return r0
        Lda:
            r0 = -12
            return r0
    }

    private int reset() {
            r4 = this;
            r0 = 0
            r4.mWrittenPcmBytes = r0
            r2 = 0
            r4.mLatencyMs = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.forceResetWorkaroundTimeMs = r2
            r4.mLastGetLatencyMs = r0
            r4.lastRawPlaybackHeadPosition = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mLeftVolume = r0
            android.media.AudioTrack r0 = r4.mAudioTrack
            r1 = 0
            r4.mAudioTrack = r1
            r0.flush()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            r0.release()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            int r0 = r4.reconfigure()
            return r0
        L26:
            r0 = move-exception
            r4.reconfigure()
            throw r0
        L2b:
            int r0 = r4.reconfigure()
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void close() {
            r4 = this;
            android.media.AudioTrack r0 = r4.mAudioTrack
            if (r0 == 0) goto L23
            r1 = 0
            r4.mAudioTrack = r1
            com.bykv.vk.component.ttvideo.player.AJVoice$1 r1 = new com.bykv.vk.component.ttvideo.player.AJVoice$1     // Catch: java.lang.Throwable -> L10
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L10
            com.bykv.vk.component.ttvideo.player.AVThreadPool.addTask(r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            java.lang.String r2 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r3 = "create close thread fail = "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            com.bytedance.sdk.component.utils.vl.xt(r2, r1)
            r4.releaseTrack(r0)
        L23:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void flush() {
            r5 = this;
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r5.audioTrackPositionTracker     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.reset()     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r0 = move-exception
            goto L1d
        La:
            r0 = -1
            r5.mStartMediaTimeMs = r0     // Catch: java.lang.Throwable -> L8
            android.media.AudioTrack r0 = r5.mAudioTrack     // Catch: java.lang.Throwable -> L8
            r0.flush()     // Catch: java.lang.Throwable -> L8
            long r0 = r5.mWrittenPcmBytes     // Catch: java.lang.Throwable -> L8
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            r5.mWrittenPcmBytes = r2     // Catch: java.lang.Throwable -> L8
        L1c:
            return
        L1d:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getCurrentPositionMs() {
            r5 = this;
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r5.audioTrackPositionTracker
            r1 = 0
            if (r0 == 0) goto L11
            int r2 = r5.mStartMediaTimeMs
            long r0 = r0.getCurrentPositionUs(r1)
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            int r1 = (int) r0
            int r2 = r2 + r1
            return r2
        L11:
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getEOSDelayMs() {
            r6 = this;
            long r0 = r6.getWrittenDurationMs()
            long r2 = r6.getPlaybackPositionMs()
            int r4 = r6.getLatency()
            if (r4 <= 0) goto L15
            int r4 = r6.mLatencyMs
            int r5 = r6.mBufferSizeMs
            int r4 = r4 - r5
            long r4 = (long) r4
            goto L17
        L15:
            r4 = 0
        L17:
            long r0 = r0 - r2
            long r0 = r0 + r4
            int r1 = (int) r0
            return r1
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getLatency() {
            r7 = this;
            r7.getPlaybackHeadPosition()
            java.lang.reflect.Method r0 = r7.getLatencyMethod
            if (r0 == 0) goto L51
            long r0 = java.lang.System.nanoTime()
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            long r2 = r7.mLastGetLatencyMs
            long r2 = r0 - r2
            r4 = 500(0x1f4, double:2.47E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L51
            r2 = 0
            java.lang.reflect.Method r3 = r7.getLatencyMethod     // Catch: java.lang.Exception -> L4d
            android.media.AudioTrack r4 = r7.mAudioTrack     // Catch: java.lang.Exception -> L4d
            java.lang.Object r3 = r3.invoke(r4, r2)     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L4d
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L4d
            r7.mLatencyMs = r3     // Catch: java.lang.Exception -> L4d
            r4 = 0
            int r3 = java.lang.Math.max(r3, r4)     // Catch: java.lang.Exception -> L4d
            r7.mLatencyMs = r3     // Catch: java.lang.Exception -> L4d
            r5 = 5000(0x1388, float:7.006E-42)
            if (r3 <= r5) goto L4f
            java.lang.String r3 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG     // Catch: java.lang.Exception -> L4d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
            java.lang.String r6 = "Ignoring impossibly large audio latency: "
            r5.<init>(r6)     // Catch: java.lang.Exception -> L4d
            int r6 = r7.mLatencyMs     // Catch: java.lang.Exception -> L4d
            r5.append(r6)     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4d
            com.bytedance.sdk.component.utils.vl.xt(r3, r5)     // Catch: java.lang.Exception -> L4d
            r7.mLatencyMs = r4     // Catch: java.lang.Exception -> L4d
            goto L4f
        L4d:
            r7.getLatencyMethod = r2
        L4f:
            r7.mLastGetLatencyMs = r0
        L51:
            int r0 = r7.mLatencyMs
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getMaxVolume() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getMaxVolume:"
            r0.<init>(r1)
            int r1 = r2.mMaxVolume
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ttmn"
            com.bytedance.sdk.component.utils.vl.j(r1, r0)
            int r0 = r2.mMaxVolume
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getTrackBufferSize() {
            r1 = this;
            int r0 = r1.mTrackBufferSize
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public float getVolume() {
            r4 = this;
            com.bykv.vk.component.ttvideo.player.TTPlayer r0 = r4.mPlayer
            r1 = 0
            if (r0 == 0) goto L23
            float r0 = r4.mLeftVolume
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            android.media.AudioManager r0 = r4.mAudioManager
            if (r0 == 0) goto L23
            int r2 = r4.mStreamType     // Catch: java.lang.Exception -> L22
            int r0 = r0.getStreamMaxVolume(r2)     // Catch: java.lang.Exception -> L22
            android.media.AudioManager r2 = r4.mAudioManager     // Catch: java.lang.Exception -> L20
            int r3 = r4.mStreamType     // Catch: java.lang.Exception -> L20
            int r1 = r2.getStreamVolume(r3)     // Catch: java.lang.Exception -> L20
            goto L24
        L20:
            goto L24
        L22:
        L23:
            r0 = 0
        L24:
            if (r1 < 0) goto L28
            float r0 = (float) r1
            return r0
        L28:
            if (r0 <= 0) goto L2e
            int r0 = r0 / 4
            float r0 = (float) r0
            return r0
        L2e:
            r0 = 1092616192(0x41200000, float:10.0)
            return r0
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(android.media.AudioTrack r1) {
            r0 = this;
            return
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioTrack r1) {
            r0 = this;
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int open(long r2, com.bykv.vk.component.ttvideo.player.TTPlayer r4) {
            r1 = this;
            r1.mPlayer = r4
            int r2 = r1.reconfigure()
            if (r2 != 0) goto L1e
            float r3 = r1.mLeftVolume
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L13
            r1.setVolume(r3, r3)
        L13:
            java.lang.Class<android.media.AudioTrack> r3 = android.media.AudioTrack.class
            java.lang.String r4 = "getLatency"
            r0 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L1e
            r1.getLatencyMethod = r3     // Catch: java.lang.NoSuchMethodException -> L1e
        L1e:
            return r2
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void pause() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r1.audioTrackPositionTracker     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.pause()     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r0 = move-exception
            goto L10
        La:
            android.media.AudioTrack r0 = r1.mAudioTrack     // Catch: java.lang.Throwable -> L8
            r0.pause()     // Catch: java.lang.Throwable -> L8
            return
        L10:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public void releaseTrack(android.media.AudioTrack r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L1b
        L3:
            boolean r0 = com.bykv.vk.component.ttvideo.player.AJVoice.mNeedReleaseWorkAround     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L18
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L18
            long r2 = r5.mStartTime     // Catch: java.lang.Exception -> L18
            long r0 = r0 - r2
            r2 = 80
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L18
            long r2 = r2 - r0
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Exception -> L18
        L18:
            r6.release()     // Catch: java.lang.Exception -> L1c
        L1b:
            return
        L1c:
            r6 = move-exception
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r1 = "release in invalid state = "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
            com.bytedance.sdk.component.utils.vl.xt(r0, r6)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void resume() {
            r5 = this;
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r5.audioTrackPositionTracker     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            android.media.AudioTrack r1 = r5.mAudioTrack     // Catch: java.lang.Throwable -> L19
            int r2 = r5.mAudioFormat     // Catch: java.lang.Throwable -> L19
            int r3 = r5.mChannels     // Catch: java.lang.Throwable -> L19
            int r3 = getPcmFrameSize(r2, r3)     // Catch: java.lang.Throwable -> L19
            int r4 = r5.mTrackBufferSize     // Catch: java.lang.Throwable -> L19
            r0.setAudioTrack(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L19
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r5.audioTrackPositionTracker     // Catch: java.lang.Throwable -> L19
            r0.start()     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L21
        L1b:
            android.media.AudioTrack r0 = r5.mAudioTrack     // Catch: java.lang.Throwable -> L19
            r0.play()     // Catch: java.lang.Throwable -> L19
            return
        L21:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void setAudioTrackSmoothClock(int r3) {
            r2 = this;
            int r0 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto L1a
            r2.mEnableAudioTrackSmoothClock = r3
            if (r3 <= 0) goto L1a
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r3 = new com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker
            r0 = 0
            r3.<init>(r0)
            r2.audioTrackPositionTracker = r3
            android.os.ConditionVariable r3 = new android.os.ConditionVariable
            r0 = 1
            r3.<init>(r0)
            r2.mReleasingConditionVariable = r3
        L1a:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void setSampleInfo(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.mSampleRate = r2
            r0.mChannels = r3
            r0.mBlockSize = r4
            r0.mSampleBytes = r6
            r0.mSampleFormat = r1
            r0.mFrameSamples = r5
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void setStreamType(int r1) {
            r0 = this;
            r0.mStreamType = r1
            com.bykv.vk.component.ttvideo.player.TTPlayer r1 = r0.mPlayer
            if (r1 != 0) goto L7
            goto L10
        L7:
            int r1 = r0.reset()
            if (r1 != 0) goto L10
            r0.start()
        L10:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void setTrackVolume(float r2, float r3) {
            r1 = this;
            android.media.AudioTrack r0 = r1.mAudioTrack
            if (r0 == 0) goto L7
            r0.setStereoVolume(r2, r3)
        L7:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void setVolume(float r4, float r5) {
            r3 = this;
            int r0 = r3.mMaxVolume     // Catch: java.lang.Exception -> L24
            float r1 = (float) r0     // Catch: java.lang.Exception -> L24
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L8
            float r4 = (float) r0     // Catch: java.lang.Exception -> L24
        L8:
            r0 = -914358288(0xffffffffc97ffff0, float:-1048575.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L17
            android.media.AudioTrack r0 = r3.mAudioTrack     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L17
            r0.setStereoVolume(r4, r5)     // Catch: java.lang.Exception -> L24
            goto L22
        L17:
            android.media.AudioManager r5 = r3.mAudioManager     // Catch: java.lang.Exception -> L24
            if (r5 == 0) goto L22
            int r0 = r3.mStreamType     // Catch: java.lang.Exception -> L24
            int r1 = (int) r4     // Catch: java.lang.Exception -> L24
            r2 = 0
            r5.setStreamVolume(r0, r1, r2)     // Catch: java.lang.Exception -> L24
        L22:
            r3.mLeftVolume = r4     // Catch: java.lang.Exception -> L24
        L24:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int start() {
            r6 = this;
            android.media.AudioTrack r0 = r6.mAudioTrack
            if (r0 != 0) goto Ld
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r1 = "audiotrack start before created"
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            r0 = -2
            return r0
        Ld:
            r0 = 0
            r6.mStoped = r0
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r1 = r6.audioTrackPositionTracker     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            android.media.AudioTrack r2 = r6.mAudioTrack     // Catch: java.lang.Throwable -> L24
            int r3 = r6.mAudioFormat     // Catch: java.lang.Throwable -> L24
            int r4 = r6.mChannels     // Catch: java.lang.Throwable -> L24
            int r4 = getPcmFrameSize(r3, r4)     // Catch: java.lang.Throwable -> L24
            int r5 = r6.mTrackBufferSize     // Catch: java.lang.Throwable -> L24
            r1.setAudioTrack(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r0 = move-exception
            goto L39
        L26:
            android.media.AudioTrack r1 = r6.mAudioTrack     // Catch: java.lang.Throwable -> L24
            r1.play()     // Catch: java.lang.Throwable -> L24
            r1 = -1
            r6.mSerial = r1     // Catch: java.lang.Throwable -> L24
            boolean r1 = com.bykv.vk.component.ttvideo.player.AJVoice.mNeedReleaseWorkAround
            if (r1 == 0) goto L38
            long r1 = android.os.SystemClock.elapsedRealtime()
            r6.mStartTime = r1
        L38:
            return r0
        L39:
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r2 = "audioTrack start failed = "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            com.bytedance.sdk.component.utils.vl.r(r1, r0)
            r0 = -3
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void stop() {
            r1 = this;
            boolean r0 = r1.mStoped
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.mStoped = r0
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r1.audioTrackPositionTracker     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            r0.pause()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L18
        L12:
            android.media.AudioTrack r0 = r1.mAudioTrack     // Catch: java.lang.Throwable -> L10
            r0.pause()     // Catch: java.lang.Throwable -> L10
            return
        L18:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public int write(java.nio.ByteBuffer r4, int r5) {
            r3 = this;
            r5 = -1
            if (r4 != 0) goto Lb
            java.lang.String r4 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r0 = "buffer is nullpoint"
            com.bykv.vk.component.ttvideo.utils.AVLogger.e(r4, r0)
            return r5
        Lb:
            android.media.AudioTrack r0 = r3.mAudioTrack
            int r1 = r4.capacity()
            r2 = 0
            int r0 = r0.write(r4, r2, r1)
            int r1 = r4.capacity()
            if (r0 == r1) goto L1d
            return r5
        L1d:
            r4.flip()
            return r2
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int write(byte[] r7, int r8, int r9, int r10) {
            r6 = this;
            if (r7 == 0) goto L63
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L63
        L6:
            boolean r0 = r6.mStoped
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            int r0 = r6.mSerial
            if (r0 == r10) goto L1f
            r6.mSerial = r10
            long r2 = r6.mWrittenPcmBytes
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L1f
            android.media.AudioTrack r10 = r6.mAudioTrack
            r10.flush()
        L1f:
            android.media.AudioTrack r10 = r6.mAudioTrack     // Catch: java.lang.Exception -> L5d
            int r7 = r10.write(r7, r8, r9)     // Catch: java.lang.Exception -> L5d
            if (r7 >= 0) goto L43
            java.lang.String r8 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "write failed : ret: "
            r10.<init>(r0)
            r10.append(r7)
            java.lang.String r0 = ", size = "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.bytedance.sdk.component.utils.vl.r(r8, r9)
            return r7
        L43:
            long r8 = r6.mWrittenPcmBytes
            long r2 = (long) r7
            long r8 = r8 + r2
            r6.mWrittenPcmBytes = r8
            boolean r8 = r6.needsReset()
            if (r8 == 0) goto L59
            int r8 = r6.reset()
            if (r8 != 0) goto L59
            int r1 = r6.start()
        L59:
            if (r1 != 0) goto L5c
            return r7
        L5c:
            return r1
        L5d:
            r7 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r7)
            r7 = -1
            return r7
        L63:
            java.lang.String r7 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r8 = "buffer is nullpoint"
            com.bykv.vk.component.ttvideo.utils.AVLogger.e(r7, r8)
            r7 = -10
            return r7
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int write(byte[] r10, int r11, int r12, int r13, long r14) {
            r9 = this;
            if (r10 == 0) goto Lee
            int r0 = r10.length
            if (r0 != 0) goto L7
            goto Lee
        L7:
            boolean r0 = r9.mStoped
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            int r0 = r9.mSerial
            r2 = -1
            r3 = 0
            if (r0 == r13) goto L63
            r9.mSerial = r13
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r9.audioTrackPositionTracker
            if (r0 == 0) goto L58
            android.os.ConditionVariable r5 = r9.mReleasingConditionVariable
            if (r5 == 0) goto L58
            long r5 = r9.mWrittenPcmBytes
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L63
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L2f
            android.media.AudioTrack r0 = r9.mAudioTrack
            r0.pause()
        L2f:
            com.bykv.vk.component.ttvideo.player.AudioTrackPositionTracker r0 = r9.audioTrackPositionTracker
            r0.reset()
            r9.mStartMediaTimeMs = r2
            android.os.ConditionVariable r0 = r9.mReleasingConditionVariable
            r0.close()
            r9.mWrittenPcmBytes = r3
            android.media.AudioTrack r0 = r9.mAudioTrack
            r5 = 0
            r9.mAudioTrack = r5
            com.bykv.vk.component.ttvideo.player.AJVoice$2 r5 = new com.bykv.vk.component.ttvideo.player.AJVoice$2
            r5.<init>(r9, r0)
            com.bykv.vk.component.ttvideo.player.AVThreadPool.addTask(r5)
            android.os.ConditionVariable r0 = r9.mReleasingConditionVariable
            r0.block()
            r9.reconfigure()
            r9.start()
            r9.mSerial = r13
            goto L63
        L58:
            long r5 = r9.mWrittenPcmBytes
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L63
            android.media.AudioTrack r0 = r9.mAudioTrack
            r0.flush()
        L63:
            int r0 = r9.mStartMediaTimeMs
            if (r0 != r2) goto L6f
            long r14 = java.lang.Math.max(r3, r14)
            int r15 = (int) r14
            r9.mStartMediaTimeMs = r15
            goto La9
        L6f:
            long r3 = (long) r0
            long r5 = r9.getWrittenDurationMs()
            long r3 = r3 + r5
            long r5 = r3 - r14
            long r5 = java.lang.Math.abs(r5)
            r7 = 200(0xc8, double:9.9E-322)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto La9
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Discontinuity detected [expected "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r6 = ", got "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r6 = "]"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r5)
            long r14 = r14 - r3
            int r0 = r9.mStartMediaTimeMs
            long r3 = (long) r0
            long r3 = r3 + r14
            int r14 = (int) r3
            r9.mStartMediaTimeMs = r14
        La9:
            android.media.AudioTrack r14 = r9.mAudioTrack     // Catch: java.lang.Exception -> Le9
            int r10 = r14.write(r10, r11, r12)     // Catch: java.lang.Exception -> Le9
            if (r10 >= 0) goto Lcd
            java.lang.String r11 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "write failed : ret: "
            r13.<init>(r14)
            r13.append(r10)
            java.lang.String r14 = ", size = "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.bytedance.sdk.component.utils.vl.r(r11, r12)
            return r10
        Lcd:
            long r11 = r9.mWrittenPcmBytes
            long r14 = (long) r10
            long r11 = r11 + r14
            r9.mWrittenPcmBytes = r11
            boolean r11 = r9.needsReset()
            if (r11 == 0) goto Le5
            int r11 = r9.reset()
            if (r11 != 0) goto Le5
            int r1 = r9.start()
            r9.mSerial = r13
        Le5:
            if (r1 != 0) goto Le8
            return r10
        Le8:
            return r1
        Le9:
            r10 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r10)
            return r2
        Lee:
            java.lang.String r10 = com.bykv.vk.component.ttvideo.player.AJVoice.TAG
            java.lang.String r11 = "buffer is nullpoint"
            com.bykv.vk.component.ttvideo.utils.AVLogger.e(r10, r11)
            r10 = -10
            return r10
    }
}
