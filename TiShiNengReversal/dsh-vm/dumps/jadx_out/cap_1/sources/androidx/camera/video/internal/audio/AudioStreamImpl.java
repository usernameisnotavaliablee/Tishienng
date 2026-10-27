package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AudioStreamImpl implements androidx.camera.video.internal.audio.AudioStream {
    private static final java.lang.String TAG = "AudioStreamImpl";
    final android.media.AudioRecord mAudioRecord;

    @androidx.annotation.Nullable
    private android.media.AudioManager.AudioRecordingCallback mAudioRecordingCallback;

    @androidx.annotation.Nullable
    private androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBufferSize;
    private final int mBytesPerFrame;

    @androidx.annotation.Nullable
    private java.util.concurrent.Executor mCallbackExecutor;
    private final java.util.concurrent.atomic.AtomicBoolean mIsReleased;
    private final java.util.concurrent.atomic.AtomicBoolean mIsStarted;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> mNotifiedSilenceState;
    private final androidx.camera.video.internal.audio.AudioSettings mSettings;
    private long mTotalFramesRead;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    class AudioRecordingApi29Callback extends android.media.AudioManager.AudioRecordingCallback {
        final /* synthetic */ androidx.camera.video.internal.audio.AudioStreamImpl this$0;

        AudioRecordingApi29Callback(androidx.camera.video.internal.audio.AudioStreamImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> r4) {
                r3 = this;
                java.util.Iterator r4 = r4.iterator()
            L4:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L29
                java.lang.Object r0 = r4.next()
                android.media.AudioRecordingConfiguration r0 = androidx.camera.video.internal.audio.q.a(r0)
                int r1 = androidx.camera.video.internal.compat.Api24Impl.getClientAudioSessionId(r0)
                androidx.camera.video.internal.audio.AudioStreamImpl r2 = r3.this$0
                android.media.AudioRecord r2 = r2.mAudioRecord
                int r2 = r2.getAudioSessionId()
                if (r1 != r2) goto L4
                boolean r4 = androidx.camera.video.internal.compat.Api29Impl.isClientSilenced(r0)
                androidx.camera.video.internal.audio.AudioStreamImpl r0 = r3.this$0
                r0.notifySilenced(r4)
            L29:
                return
        }
    }

    @androidx.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioStreamImpl(@androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r11, @androidx.annotation.Nullable android.content.Context r12) throws java.lang.IllegalArgumentException, androidx.camera.video.internal.audio.AudioStream.AudioStreamException {
            r10 = this;
            r10.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r10.mIsReleased = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r10.mIsStarted = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r0.<init>(r2)
            r10.mNotifiedSilenceState = r0
            int r0 = r11.getSampleRate()
            int r2 = r11.getChannelCount()
            int r3 = r11.getAudioFormat()
            boolean r0 = isSettingsSupported(r0, r2, r3)
            r2 = 2
            r3 = 1
            if (r0 == 0) goto Lcd
            r10.mSettings = r11
            int r0 = r11.getBytesPerFrame()
            r10.mBytesPerFrame = r0
            int r0 = r11.getSampleRate()
            int r4 = r11.getChannelCount()
            int r5 = r11.getAudioFormat()
            int r0 = getMinBufferSize(r0, r4, r5)
            if (r0 <= 0) goto L49
            r1 = 1
        L49:
            androidx.core.util.Preconditions.checkState(r1)
            int r9 = r0 * 2
            r10.mBufferSize = r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9c
            android.media.AudioFormat$Builder r1 = new android.media.AudioFormat$Builder
            r1.<init>()
            int r2 = r11.getSampleRate()
            android.media.AudioFormat$Builder r1 = r1.setSampleRate(r2)
            int r2 = r11.getChannelCount()
            int r2 = androidx.camera.video.internal.audio.AudioUtils.channelCountToChannelMask(r2)
            android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
            int r2 = r11.getAudioFormat()
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r2)
            android.media.AudioFormat r1 = r1.build()
            android.media.AudioRecord$Builder r2 = androidx.camera.video.internal.compat.Api23Impl.createAudioRecordBuilder()
            r4 = 31
            if (r0 < r4) goto L88
            if (r12 == 0) goto L88
            androidx.camera.video.internal.compat.Api31Impl.setContext(r2, r12)
        L88:
            int r11 = r11.getAudioSource()
            androidx.camera.video.internal.compat.Api23Impl.setAudioSource(r2, r11)
            androidx.camera.video.internal.compat.Api23Impl.setAudioFormat(r2, r1)
            androidx.camera.video.internal.compat.Api23Impl.setBufferSizeInBytes(r2, r9)
            android.media.AudioRecord r11 = androidx.camera.video.internal.compat.Api23Impl.build(r2)
            r10.mAudioRecord = r11
            goto Lb7
        L9c:
            android.media.AudioRecord r4 = new android.media.AudioRecord
            int r5 = r11.getAudioSource()
            int r6 = r11.getSampleRate()
            int r12 = r11.getChannelCount()
            int r7 = androidx.camera.video.internal.audio.AudioUtils.channelCountToChannelConfig(r12)
            int r8 = r11.getAudioFormat()
            r4.<init>(r5, r6, r7, r8, r9)
            r10.mAudioRecord = r4
        Lb7:
            android.media.AudioRecord r11 = r10.mAudioRecord
            int r11 = r11.getState()
            if (r11 != r3) goto Lc0
            return
        Lc0:
            android.media.AudioRecord r11 = r10.mAudioRecord
            r11.release()
            androidx.camera.video.internal.audio.AudioStream$AudioStreamException r11 = new androidx.camera.video.internal.audio.AudioStream$AudioStreamException
            java.lang.String r12 = "Unable to initialize AudioRecord"
            r11.<init>(r12)
            throw r11
        Lcd:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            int r0 = r11.getSampleRate()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = r11.getChannelCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r11 = r11.getAudioFormat()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r0
            r5[r3] = r4
            r5[r2] = r11
            java.lang.String r11 = "The combination of sample rate %d, channel count %d and audio format %d is not supported."
            java.lang.String r11 = java.lang.String.format(r11, r5)
            r12.<init>(r11)
            throw r12
    }

    public static /* synthetic */ void a(androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback r0, boolean r1) {
            r0.onSilenceStateChanged(r1)
            return
    }

    private void checkNotReleasedOrThrow() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsReleased
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            java.lang.String r1 = "AudioStream has been released."
            androidx.core.util.Preconditions.checkState(r0, r1)
            return
    }

    private void checkStartedOrThrow() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsStarted
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            androidx.core.util.Preconditions.checkState(r0, r1)
            return
    }

    private static long computeInterpolatedTimeNs(int r2, long r3, @androidx.annotation.NonNull android.media.AudioTimestamp r5) {
            long r0 = r5.framePosition
            long r3 = r3 - r0
            long r2 = androidx.camera.video.internal.audio.AudioUtils.frameCountToDurationNs(r3, r2)
            long r4 = r5.nanoTime
            long r4 = r4 + r2
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L11
            return r2
        L11:
            return r4
    }

    private long generatePresentationTimeNs() {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = -1
            if (r0 < r1) goto L30
            boolean r0 = hasAudioTimestampQuirk()
            if (r0 != 0) goto L30
            android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
            r0.<init>()
            android.media.AudioRecord r1 = r6.mAudioRecord
            r4 = 0
            int r1 = androidx.camera.video.internal.compat.Api24Impl.getTimestamp(r1, r0, r4)
            if (r1 != 0) goto L29
            androidx.camera.video.internal.audio.AudioSettings r1 = r6.mSettings
            int r1 = r1.getSampleRate()
            long r4 = r6.mTotalFramesRead
            long r0 = computeInterpolatedTimeNs(r1, r4, r0)
            goto L31
        L29:
            java.lang.String r0 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            androidx.camera.core.Logger.w(r0, r1)
        L30:
            r0 = r2
        L31:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L39
            long r0 = java.lang.System.nanoTime()
        L39:
            return r0
    }

    private static int getMinBufferSize(int r0, int r1, int r2) {
            int r1 = androidx.camera.video.internal.audio.AudioUtils.channelCountToChannelConfig(r1)
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r1, r2)
            return r0
    }

    private static boolean hasAudioTimestampQuirk() {
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk> r0 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean isSettingsSupported(int r1, int r2, int r3) {
            r0 = 0
            if (r1 <= 0) goto Le
            if (r2 > 0) goto L6
            goto Le
        L6:
            int r1 = getMinBufferSize(r1, r2, r3)
            if (r1 <= 0) goto Le
            r1 = 1
            return r1
        Le:
            return r0
    }

    void notifySilenced(boolean r5) {
            r4 = this;
            java.util.concurrent.Executor r0 = r4.mCallbackExecutor
            androidx.camera.video.internal.audio.AudioStream$AudioStreamCallback r1 = r4.mAudioStreamCallback
            if (r0 == 0) goto L24
            if (r1 == 0) goto L24
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r2 = r4.mNotifiedSilenceState
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r2 = r2.getAndSet(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L24
            androidx.camera.video.internal.audio.p r2 = new androidx.camera.video.internal.audio.p
            r2.<init>(r1, r5)
            r0.execute(r2)
        L24:
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.audio.AudioStream.PacketInfo read(@androidx.annotation.NonNull java.nio.ByteBuffer r8) {
            r7 = this;
            r7.checkNotReleasedOrThrow()
            r7.checkStartedOrThrow()
            android.media.AudioRecord r0 = r7.mAudioRecord
            int r1 = r7.mBufferSize
            int r0 = r0.read(r8, r1)
            if (r0 <= 0) goto L24
            r8.limit(r0)
            long r1 = r7.generatePresentationTimeNs()
            long r3 = r7.mTotalFramesRead
            long r5 = (long) r0
            int r8 = r7.mBytesPerFrame
            long r5 = androidx.camera.video.internal.audio.AudioUtils.sizeToFrameCount(r5, r8)
            long r3 = r3 + r5
            r7.mTotalFramesRead = r3
            goto L26
        L24:
            r1 = 0
        L26:
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r8 = androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(r0, r1)
            return r8
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsReleased
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L19
            android.media.AudioManager$AudioRecordingCallback r0 = r2.mAudioRecordingCallback
            if (r0 == 0) goto L19
            android.media.AudioRecord r1 = r2.mAudioRecord
            androidx.camera.video.internal.compat.Api29Impl.unregisterAudioRecordingCallback(r1, r0)
        L19:
            android.media.AudioRecord r0 = r2.mAudioRecord
            r0.release()
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@androidx.annotation.Nullable androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback r4, @androidx.annotation.Nullable java.util.concurrent.Executor r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mIsStarted
            boolean r0 = r0.get()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "AudioStream can not be started when setCallback."
            androidx.core.util.Preconditions.checkState(r0, r2)
            r3.checkNotReleasedOrThrow()
            if (r4 == 0) goto L16
            if (r5 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.String r0 = "executor can't be null with non-null callback."
            androidx.core.util.Preconditions.checkArgument(r1, r0)
            r3.mAudioStreamCallback = r4
            r3.mCallbackExecutor = r5
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L43
            android.media.AudioManager$AudioRecordingCallback r0 = r3.mAudioRecordingCallback
            if (r0 == 0) goto L2e
            android.media.AudioRecord r1 = r3.mAudioRecord
            androidx.camera.video.internal.compat.Api29Impl.unregisterAudioRecordingCallback(r1, r0)
        L2e:
            if (r4 != 0) goto L31
            goto L43
        L31:
            android.media.AudioManager$AudioRecordingCallback r4 = r3.mAudioRecordingCallback
            if (r4 != 0) goto L3c
            androidx.camera.video.internal.audio.AudioStreamImpl$AudioRecordingApi29Callback r4 = new androidx.camera.video.internal.audio.AudioStreamImpl$AudioRecordingApi29Callback
            r4.<init>(r3)
            r3.mAudioRecordingCallback = r4
        L3c:
            android.media.AudioRecord r4 = r3.mAudioRecord
            android.media.AudioManager$AudioRecordingCallback r0 = r3.mAudioRecordingCallback
            androidx.camera.video.internal.compat.Api29Impl.registerAudioRecordingCallback(r4, r5, r0)
        L43:
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws androidx.camera.video.internal.audio.AudioStream.AudioStreamException {
            r6 = this;
            r6.checkNotReleasedOrThrow()
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mIsStarted
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Ld
            return
        Ld:
            android.media.AudioRecord r0 = r6.mAudioRecord
            r0.startRecording()
            android.media.AudioRecord r0 = r6.mAudioRecord
            int r0 = r0.getRecordingState()
            r2 = 3
            r3 = 0
            if (r0 != r2) goto L41
            r4 = 0
            r6.mTotalFramesRead = r4
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r6.mNotifiedSilenceState
            r2 = 0
            r0.set(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 < r2) goto L3d
            android.media.AudioRecord r0 = r6.mAudioRecord
            android.media.AudioRecordingConfiguration r0 = androidx.camera.video.internal.compat.Api29Impl.getActiveRecordingConfiguration(r0)
            if (r0 == 0) goto L3b
            boolean r0 = androidx.camera.video.internal.compat.Api29Impl.isClientSilenced(r0)
            if (r0 == 0) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            r3 = r1
        L3d:
            r6.notifySilenced(r3)
            return
        L41:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.mIsStarted
            r0.set(r3)
            androidx.camera.video.internal.audio.AudioStream$AudioStreamException r0 = new androidx.camera.video.internal.audio.AudioStream$AudioStreamException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to start AudioRecord with state: "
            r1.append(r2)
            android.media.AudioRecord r2 = r6.mAudioRecord
            int r2 = r2.getRecordingState()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
            r2 = this;
            r2.checkNotReleasedOrThrow()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsStarted
            r1 = 0
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto Ld
            goto L37
        Ld:
            android.media.AudioRecord r0 = r2.mAudioRecord
            r0.stop()
            android.media.AudioRecord r0 = r2.mAudioRecord
            int r0 = r0.getRecordingState()
            r1 = 1
            if (r0 == r1) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to stop AudioRecord with state: "
            r0.append(r1)
            android.media.AudioRecord r1 = r2.mAudioRecord
            int r1 = r1.getRecordingState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AudioStreamImpl"
            androidx.camera.core.Logger.w(r1, r0)
        L37:
            return
    }
}
