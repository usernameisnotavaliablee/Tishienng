package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SilentAudioStream implements androidx.camera.video.internal.audio.AudioStream {
    private static final java.lang.String TAG = "SilentAudioStream";

    @androidx.annotation.Nullable
    private androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBytesPerFrame;

    @androidx.annotation.Nullable
    private java.util.concurrent.Executor mCallbackExecutor;
    private long mCurrentReadTimeNs;
    private final java.util.concurrent.atomic.AtomicBoolean mIsReleased;
    private final java.util.concurrent.atomic.AtomicBoolean mIsStarted;
    private final int mSampleRate;

    @androidx.annotation.Nullable
    private byte[] mZeroBytes;

    public SilentAudioStream(@androidx.annotation.NonNull androidx.camera.video.internal.audio.AudioSettings r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mIsStarted = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.mIsReleased = r0
            int r0 = r3.getBytesPerFrame()
            r2.mBytesPerFrame = r0
            int r3 = r3.getSampleRate()
            r2.mSampleRate = r3
            return
    }

    public static /* synthetic */ void a(androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback r1) {
            r0 = 1
            r1.onSilenceStateChanged(r0)
            return
    }

    private static void blockUntilSystemTimeReached(long r3) {
            long r0 = currentSystemTimeNs()
            long r3 = r3 - r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L15
            long r3 = r0.toMillis(r3)     // Catch: java.lang.InterruptedException -> L15
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L15
            return
        L15:
            r3 = move-exception
            java.lang.String r4 = "SilentAudioStream"
            java.lang.String r0 = "Ignore interruption"
            androidx.camera.core.Logger.w(r4, r0, r3)
        L1d:
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

    private static long currentSystemTimeNs() {
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    private void notifySilenced() {
            r3 = this;
            androidx.camera.video.internal.audio.AudioStream$AudioStreamCallback r0 = r3.mAudioStreamCallback
            java.util.concurrent.Executor r1 = r3.mCallbackExecutor
            if (r0 == 0) goto L10
            if (r1 == 0) goto L10
            androidx.camera.video.internal.audio.x r2 = new androidx.camera.video.internal.audio.x
            r2.<init>(r0)
            r1.execute(r2)
        L10:
            return
    }

    private void writeSilenceToBuffer(@androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 0
            if (r5 > r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            androidx.core.util.Preconditions.checkState(r0)
            byte[] r0 = r3.mZeroBytes
            if (r0 == 0) goto L14
            int r0 = r0.length
            if (r0 >= r5) goto L18
        L14:
            byte[] r0 = new byte[r5]
            r3.mZeroBytes = r0
        L18:
            int r0 = r4.position()
            byte[] r2 = r3.mZeroBytes
            java.nio.ByteBuffer r4 = r4.put(r2, r1, r5)
            int r5 = r5 + r0
            java.nio.Buffer r4 = r4.limit(r5)
            r4.position(r0)
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @androidx.annotation.NonNull
    public androidx.camera.video.internal.audio.AudioStream.PacketInfo read(@androidx.annotation.NonNull java.nio.ByteBuffer r7) {
            r6 = this;
            r6.checkNotReleasedOrThrow()
            r6.checkStartedOrThrow()
            int r0 = r7.remaining()
            long r0 = (long) r0
            int r2 = r6.mBytesPerFrame
            long r0 = androidx.camera.video.internal.audio.AudioUtils.sizeToFrameCount(r0, r2)
            int r2 = r6.mBytesPerFrame
            long r2 = androidx.camera.video.internal.audio.AudioUtils.frameCountToSize(r0, r2)
            int r3 = (int) r2
            if (r3 > 0) goto L22
            r7 = 0
            long r0 = r6.mCurrentReadTimeNs
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r7 = androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(r7, r0)
            return r7
        L22:
            int r2 = r6.mSampleRate
            long r0 = androidx.camera.video.internal.audio.AudioUtils.frameCountToDurationNs(r0, r2)
            long r4 = r6.mCurrentReadTimeNs
            long r4 = r4 + r0
            blockUntilSystemTimeReached(r4)
            r6.writeSilenceToBuffer(r7, r3)
            long r0 = r6.mCurrentReadTimeNs
            androidx.camera.video.internal.audio.AudioStream$PacketInfo r7 = androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(r3, r0)
            r6.mCurrentReadTimeNs = r4
            return r7
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsReleased
            r1 = 1
            r0.getAndSet(r1)
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
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
            r2 = this;
            r2.checkNotReleasedOrThrow()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsStarted
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Ld
            return
        Ld:
            long r0 = currentSystemTimeNs()
            r2.mCurrentReadTimeNs = r0
            r2.notifySilenced()
            return
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
            r2 = this;
            r2.checkNotReleasedOrThrow()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsStarted
            r1 = 0
            r0.set(r1)
            return
    }
}
