package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EncodedDataImpl implements androidx.camera.video.internal.encoder.EncodedData {
    private final int mBufferIndex;
    private final android.media.MediaCodec.BufferInfo mBufferInfo;
    private final java.nio.ByteBuffer mByteBuffer;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mClosedCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mClosedFuture;
    private final android.media.MediaCodec mMediaCodec;

    EncodedDataImpl(@androidx.annotation.NonNull android.media.MediaCodec r3, int r4, @androidx.annotation.NonNull android.media.MediaCodec.BufferInfo r5) throws android.media.MediaCodec.CodecException {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mClosed = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r3)
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            r2.mMediaCodec = r0
            r2.mBufferIndex = r4
            java.nio.ByteBuffer r3 = r3.getOutputBuffer(r4)
            r2.mByteBuffer = r3
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r5)
            android.media.MediaCodec$BufferInfo r3 = (android.media.MediaCodec.BufferInfo) r3
            r2.mBufferInfo = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            androidx.camera.video.internal.encoder.b r4 = new androidx.camera.video.internal.encoder.b
            r4.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r4)
            r2.mClosedFuture = r4
            java.lang.Object r3 = r3.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r3 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r3
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r3 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r3
            r2.mClosedCompleter = r3
            return
    }

    public static /* synthetic */ java.lang.Object a(java.util.concurrent.atomic.AtomicReference r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.set(r1)
            java.lang.String r0 = "Data closed"
            return r0
    }

    private void throwIfClosed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mClosed
            boolean r0 = r0.get()
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "encoded data is closed."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mClosed
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            android.media.MediaCodec r0 = r3.mMediaCodec     // Catch: java.lang.IllegalStateException -> L19
            int r1 = r3.mBufferIndex     // Catch: java.lang.IllegalStateException -> L19
            r2 = 0
            r0.releaseOutputBuffer(r1, r2)     // Catch: java.lang.IllegalStateException -> L19
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r3.mClosedCompleter
            r1 = 0
            r0.set(r1)
            return
        L19:
            r0 = move-exception
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r3.mClosedCompleter
            r1.setException(r0)
            return
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @androidx.annotation.NonNull
    public android.media.MediaCodec.BufferInfo getBufferInfo() {
            r1 = this;
            android.media.MediaCodec$BufferInfo r0 = r1.mBufferInfo
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @androidx.annotation.NonNull
    public java.nio.ByteBuffer getByteBuffer() {
            r3 = this;
            r3.throwIfClosed()
            java.nio.ByteBuffer r0 = r3.mByteBuffer
            android.media.MediaCodec$BufferInfo r1 = r3.mBufferInfo
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r3.mByteBuffer
            android.media.MediaCodec$BufferInfo r1 = r3.mBufferInfo
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
            java.nio.ByteBuffer r0 = r3.mByteBuffer
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getClosedFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mClosedFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
            r2 = this;
            android.media.MediaCodec$BufferInfo r0 = r2.mBufferInfo
            long r0 = r0.presentationTimeUs
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
            r2 = this;
            android.media.MediaCodec$BufferInfo r0 = r2.mBufferInfo
            int r0 = r0.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
            r2 = this;
            android.media.MediaCodec$BufferInfo r0 = r2.mBufferInfo
            int r0 = r0.size
            long r0 = (long) r0
            return r0
    }
}
