package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class InputBufferImpl implements androidx.camera.video.internal.encoder.InputBuffer {
    private final int mBufferIndex;
    private final java.nio.ByteBuffer mByteBuffer;
    private boolean mIsEndOfStream;
    private final android.media.MediaCodec mMediaCodec;
    private long mPresentationTimeUs;
    private final java.util.concurrent.atomic.AtomicBoolean mTerminated;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mTerminationCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mTerminationFuture;

    InputBufferImpl(@androidx.annotation.NonNull android.media.MediaCodec r5, @androidx.annotation.IntRange(from = 0) int r6) throws android.media.MediaCodec.CodecException {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.mTerminated = r0
            r2 = 0
            r4.mPresentationTimeUs = r2
            r4.mIsEndOfStream = r1
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r5)
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            r4.mMediaCodec = r0
            int r0 = androidx.core.util.Preconditions.checkArgumentNonnegative(r6)
            r4.mBufferIndex = r0
            java.nio.ByteBuffer r5 = r5.getInputBuffer(r6)
            r4.mByteBuffer = r5
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            androidx.camera.video.internal.encoder.r0 r6 = new androidx.camera.video.internal.encoder.r0
            r6.<init>(r5)
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r6)
            r4.mTerminationFuture = r6
            java.lang.Object r5 = r5.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r5 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r5
            java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r5 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r5
            r4.mTerminationCompleter = r5
            return
    }

    public static /* synthetic */ java.lang.Object a(java.util.concurrent.atomic.AtomicReference r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.set(r1)
            java.lang.String r0 = "Terminate InputBuffer"
            return r0
    }

    private void throwIfTerminated() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mTerminated
            boolean r0 = r0.get()
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The buffer is submitted or canceled."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean cancel() {
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.mTerminated
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            r0 = 0
            return r0
        Lb:
            android.media.MediaCodec r2 = r9.mMediaCodec     // Catch: java.lang.IllegalStateException -> L1e
            int r3 = r9.mBufferIndex     // Catch: java.lang.IllegalStateException -> L1e
            r6 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.IllegalStateException -> L1e
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r9.mTerminationCompleter     // Catch: java.lang.IllegalStateException -> L1e
            r2 = 0
            r0.set(r2)     // Catch: java.lang.IllegalStateException -> L1e
            goto L24
        L1e:
            r0 = move-exception
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r2 = r9.mTerminationCompleter
            r2.setException(r0)
        L24:
            return r1
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    @androidx.annotation.NonNull
    public java.nio.ByteBuffer getByteBuffer() {
            r1 = this;
            r1.throwIfTerminated()
            java.nio.ByteBuffer r0 = r1.mByteBuffer
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getTerminationFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mTerminationFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setEndOfStream(boolean r1) {
            r0 = this;
            r0.throwIfTerminated()
            r0.mIsEndOfStream = r1
            return
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setPresentationTimeUs(long r4) {
            r3 = this;
            r3.throwIfTerminated()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            androidx.core.util.Preconditions.checkArgument(r0)
            r3.mPresentationTimeUs = r4
            return
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean submit() {
            r10 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.mTerminated
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            r2 = 0
            if (r0 == 0) goto Lb
            return r2
        Lb:
            android.media.MediaCodec r3 = r10.mMediaCodec     // Catch: java.lang.IllegalStateException -> L2f
            int r4 = r10.mBufferIndex     // Catch: java.lang.IllegalStateException -> L2f
            java.nio.ByteBuffer r0 = r10.mByteBuffer     // Catch: java.lang.IllegalStateException -> L2f
            int r5 = r0.position()     // Catch: java.lang.IllegalStateException -> L2f
            java.nio.ByteBuffer r0 = r10.mByteBuffer     // Catch: java.lang.IllegalStateException -> L2f
            int r6 = r0.limit()     // Catch: java.lang.IllegalStateException -> L2f
            long r7 = r10.mPresentationTimeUs     // Catch: java.lang.IllegalStateException -> L2f
            boolean r0 = r10.mIsEndOfStream     // Catch: java.lang.IllegalStateException -> L2f
            if (r0 == 0) goto L24
            r0 = 4
            r9 = 4
            goto L25
        L24:
            r9 = 0
        L25:
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.IllegalStateException -> L2f
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r10.mTerminationCompleter     // Catch: java.lang.IllegalStateException -> L2f
            r3 = 0
            r0.set(r3)     // Catch: java.lang.IllegalStateException -> L2f
            return r1
        L2f:
            r0 = move-exception
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r10.mTerminationCompleter
            r1.setException(r0)
            return r2
    }
}
