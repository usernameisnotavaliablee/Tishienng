package androidx.camera.video.internal.encoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BufferCopiedEncodedData implements androidx.camera.video.internal.encoder.EncodedData {
    private final android.media.MediaCodec.BufferInfo mBufferInfo;
    private final java.nio.ByteBuffer mByteBuffer;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mClosedCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mClosedFuture;

    public BufferCopiedEncodedData(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodedData r2) {
            r1 = this;
            r1.<init>()
            android.media.MediaCodec$BufferInfo r0 = r1.generateCopiedByteInfo(r2)
            r1.mBufferInfo = r0
            java.nio.ByteBuffer r2 = r1.generateCopiedByteBuffer(r2)
            r1.mByteBuffer = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            androidx.camera.video.internal.encoder.a r0 = new androidx.camera.video.internal.encoder.a
            r0.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r1.mClosedFuture = r0
            java.lang.Object r2 = r2.get()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r2 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r2
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r2 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r2
            r1.mClosedCompleter = r2
            return
    }

    public static /* synthetic */ java.lang.Object a(java.util.concurrent.atomic.AtomicReference r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.set(r1)
            java.lang.String r0 = "Data closed"
            return r0
    }

    @androidx.annotation.NonNull
    private java.nio.ByteBuffer generateCopiedByteBuffer(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodedData r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r4.getByteBuffer()
            android.media.MediaCodec$BufferInfo r4 = r4.getBufferInfo()
            int r1 = r4.offset
            r0.position(r1)
            int r1 = r4.offset
            int r2 = r4.size
            int r1 = r1 + r2
            r0.limit(r1)
            int r4 = r4.size
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteOrder r1 = r0.order()
            r4.order(r1)
            r4.put(r0)
            r4.flip()
            return r4
    }

    @androidx.annotation.NonNull
    private android.media.MediaCodec.BufferInfo generateCopiedByteInfo(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.EncodedData r7) {
            r6 = this;
            android.media.MediaCodec$BufferInfo r7 = r7.getBufferInfo()
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
            r0.<init>()
            int r2 = r7.size
            long r3 = r7.presentationTimeUs
            int r5 = r7.flags
            r1 = 0
            r0.set(r1, r2, r3, r5)
            return r0
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mClosedCompleter
            r1 = 0
            r0.set(r1)
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
            r1 = this;
            java.nio.ByteBuffer r0 = r1.mByteBuffer
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
