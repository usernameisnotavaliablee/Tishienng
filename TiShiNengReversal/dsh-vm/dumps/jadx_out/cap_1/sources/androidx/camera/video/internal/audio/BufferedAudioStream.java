package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BufferedAudioStream implements androidx.camera.video.internal.audio.AudioStream {
    private static final int DATA_WAITING_TIME_MILLIS = 1;
    private static final int DEFAULT_BUFFER_SIZE_IN_FRAME = 1024;
    private static final int DEFAULT_QUEUE_SIZE = 500;
    private static final java.lang.String TAG = "BufferedAudioStream";

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.video.internal.audio.BufferedAudioStream.AudioData mAudioDataNotFullyRead;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.Queue<androidx.camera.video.internal.audio.BufferedAudioStream.AudioData> mAudioDataQueue;
    private final androidx.camera.video.internal.audio.AudioStream mAudioStream;
    private int mBufferSize;
    private final int mBytesPerFrame;
    private final java.util.concurrent.atomic.AtomicBoolean mIsCollectingAudioData;
    private final java.util.concurrent.atomic.AtomicBoolean mIsReleased;
    private final java.util.concurrent.atomic.AtomicBoolean mIsStarted;
    private final java.lang.Object mLock;
    private final java.util.concurrent.Executor mProducerExecutor;
    private final int mQueueMaxSize;
    private final int mSampleRate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static class AudioData {
        private final java.nio.ByteBuffer mByteBuffer;
        private final int mBytesPerFrame;
        private final int mSampleRate;
        private long mTimestampNs;

        AudioData(@androidx.annotation.NonNull java.nio.ByteBuffer r3, @androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioStream.PacketInfo r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                r3.rewind()
                int r0 = r3.limit()
                int r1 = r3.position()
                int r0 = r0 - r1
                int r1 = r4.getSizeInBytes()
                if (r0 != r1) goto L22
                r2.mBytesPerFrame = r5
                r2.mSampleRate = r6
                r2.mByteBuffer = r3
                long r3 = r4.getTimestampNs()
                r2.mTimestampNs = r3
                return
            L22:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Byte buffer size is not match with packet info: "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = " != "
                r5.append(r6)
                int r4 = r4.getSizeInBytes()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r3.<init>(r4)
                throw r3
        }

        public int getRemainingBufferSizeInBytes() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.mByteBuffer
                int r0 = r0.remaining()
                return r0
        }

        public androidx.camera.video.internal.audio.AudioStream.PacketInfo read(@androidx.annotation.NonNull java.nio.ByteBuffer r10) {
                r9 = this;
                long r0 = r9.mTimestampNs
                java.nio.ByteBuffer r2 = r9.mByteBuffer
                int r2 = r2.position()
                int r3 = r10.position()
                java.nio.ByteBuffer r4 = r9.mByteBuffer
                int r4 = r4.remaining()
                int r5 = r10.remaining()
                if (r4 <= r5) goto L4b
                int r4 = r10.remaining()
                long r5 = (long) r4
                int r7 = r9.mBytesPerFrame
                long r5 = androidx.camera.video.internal.audio.AudioUtils.sizeToFrameCount(r5, r7)
                int r7 = r9.mSampleRate
                long r5 = androidx.camera.video.internal.audio.AudioUtils.frameCountToDurationNs(r5, r7)
                long r7 = r9.mTimestampNs
                long r7 = r7 + r5
                r9.mTimestampNs = r7
                java.nio.ByteBuffer r5 = r9.mByteBuffer
                java.nio.ByteBuffer r5 = r5.duplicate()
                java.nio.Buffer r6 = r5.position(r2)
                int r7 = r2 + r4
                r6.limit(r7)
                java.nio.ByteBuffer r10 = r10.put(r5)
                int r5 = r3 + r4
                java.nio.Buffer r10 = r10.limit(r5)
                r10.position(r3)
                goto L60
            L4b:
                java.nio.ByteBuffer r4 = r9.mByteBuffer
                int r4 = r4.remaining()
                java.nio.ByteBuffer r5 = r9.mByteBuffer
                java.nio.ByteBuffer r10 = r10.put(r5)
                int r5 = r3 + r4
                java.nio.Buffer r10 = r10.limit(r5)
                r10.position(r3)
            L60:
                java.nio.ByteBuffer r10 = r9.mByteBuffer
                int r2 = r2 + r4
                r10.position(r2)
                androidx.camera.video.internal.audio.AudioStream$PacketInfo r10 = androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(r4, r0)
                return r10
        }
    }

    public BufferedAudioStream(@androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioStream r8, @androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r9) {
            r7 = this;
            r7.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r7.mIsStarted = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r7.mIsReleased = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r7.mAudioDataQueue = r0
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.audioExecutor()
            java.util.concurrent.Executor r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(r0)
            r7.mProducerExecutor = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.mLock = r0
            r0 = 0
            r7.mAudioDataNotFullyRead = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r7.mIsCollectingAudioData = r0
            r7.mAudioStream = r8
            int r8 = r9.getBytesPerFrame()
            r7.mBytesPerFrame = r8
            int r9 = r9.getSampleRate()
            r7.mSampleRate = r9
            long r2 = (long) r8
            r0 = 1
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4c
            r2 = 1
            goto L4d
        L4c:
            r2 = 0
        L4d:
            java.lang.String r3 = "mBytesPerFrame must be greater than 0."
            androidx.core.util.Preconditions.checkArgument(r2, r3)
            long r2 = (long) r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L58
            r1 = 1
        L58:
            java.lang.String r9 = "mSampleRate must be greater than 0."
            androidx.core.util.Preconditions.checkArgument(r1, r9)
            r9 = 500(0x1f4, float:7.0E-43)
            r7.mQueueMaxSize = r9
            int r8 = r8 * 1024
            r7.mBufferSize = r8
            return
    }

    public static /* synthetic */ void a(androidx.camera.video.internal.audio.BufferedAudioStream r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsCollectingAudioData
            r1 = 0
            r0.set(r1)
            androidx.camera.video.internal.audio.AudioStream r0 = r2.mAudioStream
            r0.stop()
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 0
            r2.mAudioDataNotFullyRead = r1     // Catch: java.lang.Throwable -> L18
            java.util.Queue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r2 = r2.mAudioDataQueue     // Catch: java.lang.Throwable -> L18
            r2.clear()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
    }

    public static /* synthetic */ void b(androidx.camera.video.internal.audio.BufferedAudioStream r1) {
            r1.getClass()
            androidx.camera.video.internal.audio.AudioStream r0 = r1.mAudioStream     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> Lc
            r0.start()     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> Lc
            r1.startCollectingAudioData()     // Catch: androidx.camera.video.internal.audio.AudioStream.AudioStreamException -> Lc
            return
        Lc:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void c(androidx.camera.video.internal.audio.BufferedAudioStream r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsCollectingAudioData
            r1 = 0
            r0.set(r1)
            androidx.camera.video.internal.audio.AudioStream r0 = r2.mAudioStream
            r0.release()
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            r1 = 0
            r2.mAudioDataNotFullyRead = r1     // Catch: java.lang.Throwable -> L18
            java.util.Queue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r2 = r2.mAudioDataQueue     // Catch: java.lang.Throwable -> L18
            r2.clear()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
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

    private void collectAudioData() {
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.mIsCollectingAudioData
            boolean r0 = r0.get()
            if (r0 != 0) goto L9
            goto L52
        L9:
            int r0 = r5.mBufferSize
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            androidx.camera.video.internal.audio.AudioStream r1 = r5.mAudioStream
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r1 = r1.read(r0)
            androidx.camera.video.internal.audio.BufferedAudioStream$AudioData r2 = new androidx.camera.video.internal.audio.BufferedAudioStream$AudioData
            int r3 = r5.mBytesPerFrame
            int r4 = r5.mSampleRate
            r2.<init>(r0, r1, r3, r4)
            int r0 = r5.mQueueMaxSize
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            java.util.Queue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r3 = r5.mAudioDataQueue     // Catch: java.lang.Throwable -> L3d
            r3.offer(r2)     // Catch: java.lang.Throwable -> L3d
        L28:
            java.util.Queue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r2 = r5.mAudioDataQueue     // Catch: java.lang.Throwable -> L3d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L3d
            if (r2 <= r0) goto L3f
            java.util.Queue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r2 = r5.mAudioDataQueue     // Catch: java.lang.Throwable -> L3d
            r2.poll()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "BufferedAudioStream"
            java.lang.String r3 = "Drop audio data due to full of queue."
            androidx.camera.core.Logger.w(r2, r3)     // Catch: java.lang.Throwable -> L3d
            goto L28
        L3d:
            r0 = move-exception
            goto L53
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.mIsCollectingAudioData
            boolean r0 = r0.get()
            if (r0 == 0) goto L52
            java.util.concurrent.Executor r0 = r5.mProducerExecutor
            androidx.camera.video.internal.audio.u r1 = new androidx.camera.video.internal.audio.u
            r1.<init>(r5)
            r0.execute(r1)
        L52:
            return
        L53:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3d
            throw r0
    }

    public static /* synthetic */ void d(androidx.camera.video.internal.audio.BufferedAudioStream r0, int r1) {
            r0.updateCollectionBufferSize(r1)
            return
    }

    public static /* synthetic */ void e(androidx.camera.video.internal.audio.BufferedAudioStream r0, androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback r1, java.util.concurrent.Executor r2) {
            androidx.camera.video.internal.audio.AudioStream r0 = r0.mAudioStream
            r0.setCallback(r1, r2)
            return
    }

    public static /* synthetic */ void f(androidx.camera.video.internal.audio.BufferedAudioStream r0) {
            r0.collectAudioData()
            return
    }

    private void startCollectingAudioData() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsCollectingAudioData
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            r2.collectAudioData()
            return
    }

    private void updateCollectionBufferSize(int r3) {
            r2 = this;
            int r0 = r2.mBufferSize
            if (r0 != r3) goto L5
            return
        L5:
            int r1 = r2.mBytesPerFrame
            int r3 = r3 / r1
            int r3 = r3 * r1
            r2.mBufferSize = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Update buffer size from "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " to "
            r3.append(r0)
            int r0 = r2.mBufferSize
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "BufferedAudioStream"
            androidx.camera.core.Logger.d(r0, r3)
            return
    }

    private void updateCollectionBufferSizeAsync(int r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mProducerExecutor
            androidx.camera.video.internal.audio.v r1 = new androidx.camera.video.internal.audio.v
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"BanThreadSleep"})
    public androidx.camera.video.internal.audio.AudioStream.PacketInfo read(@androidx.annotation.NonNull java.nio.ByteBuffer r6) {
            r5 = this;
            r5.checkNotReleasedOrThrow()
            r5.checkStartedOrThrow()
            int r0 = r6.remaining()
            r5.updateCollectionBufferSizeAsync(r0)
            r0 = 0
            r2 = 0
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r0 = androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(r2, r0)
        L14:
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            androidx.camera.video.internal.audio.BufferedAudioStream$AudioData r3 = r5.mAudioDataNotFullyRead     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r5.mAudioDataNotFullyRead = r4     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L29
            java.util.Queue<androidx.camera.video.internal.audio.BufferedAudioStream$AudioData> r3 = r5.mAudioDataQueue     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L27
            androidx.camera.video.internal.audio.BufferedAudioStream$AudioData r3 = (androidx.camera.video.internal.audio.BufferedAudioStream.AudioData) r3     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r6 = move-exception
            goto L65
        L29:
            if (r3 == 0) goto L37
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r0 = r3.read(r6)     // Catch: java.lang.Throwable -> L27
            int r4 = r3.getRemainingBufferSizeInBytes()     // Catch: java.lang.Throwable -> L27
            if (r4 <= 0) goto L37
            r5.mAudioDataNotFullyRead = r3     // Catch: java.lang.Throwable -> L27
        L37:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            int r1 = r0.getSizeInBytes()
            if (r1 > 0) goto L50
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.mIsStarted
            boolean r1 = r1.get()
            if (r1 == 0) goto L50
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.mIsReleased
            boolean r1 = r1.get()
            if (r1 != 0) goto L50
            r1 = 1
            goto L51
        L50:
            r1 = 0
        L51:
            if (r1 == 0) goto L62
            r3 = 1
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L59
            goto L62
        L59:
            r6 = move-exception
            java.lang.String r1 = "BufferedAudioStream"
            java.lang.String r2 = "Interruption while waiting for audio data"
            androidx.camera.core.Logger.w(r1, r2, r6)
            return r0
        L62:
            if (r1 != 0) goto L14
            return r0
        L65:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r6
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
            java.util.concurrent.Executor r0 = r2.mProducerExecutor
            androidx.camera.video.internal.audio.w r1 = new androidx.camera.video.internal.audio.w
            r1.<init>(r2)
            r0.execute(r1)
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
            java.util.concurrent.Executor r0 = r3.mProducerExecutor
            androidx.camera.video.internal.audio.s r1 = new androidx.camera.video.internal.audio.s
            r1.<init>(r3, r4, r5)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws androidx.camera.video.internal.audio.AudioStream.AudioStreamException, java.lang.IllegalStateException {
            r3 = this;
            r3.checkNotReleasedOrThrow()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mIsStarted
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Ld
            return
        Ld:
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            androidx.camera.video.internal.audio.t r1 = new androidx.camera.video.internal.audio.t
            r1.<init>(r3)
            r2 = 0
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r1 = r3.mProducerExecutor
            r1.execute(r0)
            r0.get()     // Catch: java.util.concurrent.ExecutionException -> L21 java.lang.InterruptedException -> L23
            return
        L21:
            r0 = move-exception
            goto L24
        L23:
            r0 = move-exception
        L24:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.mIsStarted
            r2 = 0
            r1.set(r2)
            androidx.camera.video.internal.audio.AudioStream$AudioStreamException r1 = new androidx.camera.video.internal.audio.AudioStream$AudioStreamException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() throws java.lang.IllegalStateException {
            r2 = this;
            r2.checkNotReleasedOrThrow()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsStarted
            r1 = 0
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.Executor r0 = r2.mProducerExecutor
            androidx.camera.video.internal.audio.r r1 = new androidx.camera.video.internal.audio.r
            r1.<init>(r2)
            r0.execute(r1)
            return
    }
}
