package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ProcessingNode implements androidx.camera.core.processing.Node<androidx.camera.core.imagecapture.ProcessingNode.In, java.lang.Void> {
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Bitmap2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> mBitmap2JpegBytes;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> mBitmapEffect;

    @androidx.annotation.NonNull
    final java.util.concurrent.Executor mBlockingExecutor;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> mImage2JpegBytes;

    @androidx.annotation.Nullable
    final androidx.camera.core.processing.InternalImageProcessor mImageProcessor;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> mInput2Packet;
    private androidx.camera.core.imagecapture.ProcessingNode.In mInputEdge;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> mJpegBytes2CroppedBitmap;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> mJpegBytes2Image;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, androidx.camera.core.ImageProxy> mJpegImage2Result;
    private final androidx.camera.core.impl.Quirks mQuirks;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class In {
        In() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.camera.core.imagecapture.ProcessingNode.In of(int r2, int r3) {
                androidx.camera.core.imagecapture.AutoValue_ProcessingNode_In r0 = new androidx.camera.core.imagecapture.AutoValue_ProcessingNode_In
                androidx.camera.core.processing.Edge r1 = new androidx.camera.core.processing.Edge
                r1.<init>()
                r0.<init>(r1, r2, r3)
                return r0
        }

        abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getEdge();

        abstract int getInputFormat();

        abstract int getOutputFormat();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class InputPacket {
        InputPacket() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.camera.core.imagecapture.ProcessingNode.InputPacket of(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r1, @androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
                androidx.camera.core.imagecapture.AutoValue_ProcessingNode_InputPacket r0 = new androidx.camera.core.imagecapture.AutoValue_ProcessingNode_InputPacket
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        abstract androidx.camera.core.ImageProxy getImageProxy();

        @androidx.annotation.NonNull
        abstract androidx.camera.core.imagecapture.ProcessingRequest getProcessingRequest();
    }

    @androidx.annotation.VisibleForTesting
    ProcessingNode(@androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            r2 = this;
            r0 = 0
            androidx.camera.core.impl.Quirks r1 = androidx.camera.core.internal.compat.quirk.DeviceQuirks.getAll()
            r2.<init>(r3, r0, r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    ProcessingNode(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    ProcessingNode(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.Nullable androidx.camera.core.processing.InternalImageProcessor r3) {
            r1 = this;
            androidx.camera.core.impl.Quirks r0 = androidx.camera.core.internal.compat.quirk.DeviceQuirks.getAll()
            r1.<init>(r2, r3, r0)
            return
    }

    ProcessingNode(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.Nullable androidx.camera.core.processing.InternalImageProcessor r3, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r4) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LowMemoryQuirk> r0 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto L12
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(r2)
            r1.mBlockingExecutor = r2
            goto L14
        L12:
            r1.mBlockingExecutor = r2
        L14:
            r1.mImageProcessor = r3
            r1.mQuirks = r4
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r2 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            boolean r2 = r4.contains(r2)
            r1.mHasIncorrectJpegMetadataQuirk = r2
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.imagecapture.ProcessingNode r2, androidx.camera.core.imagecapture.ProcessingNode.InputPacket r3) {
            r2.getClass()
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r3.getProcessingRequest()
            boolean r0 = r0.isAborted()
            if (r0 == 0) goto Le
            return
        Le:
            java.util.concurrent.Executor r0 = r2.mBlockingExecutor
            androidx.camera.core.imagecapture.j r1 = new androidx.camera.core.imagecapture.j
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.imagecapture.ProcessingRequest r0, androidx.camera.core.ImageProxy r1) {
            r0.onFinalResult(r1)
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.imagecapture.ProcessingRequest r0, androidx.camera.core.ImageCapture.OutputFileResults r1) {
            r0.onFinalResult(r1)
            return
    }

    private androidx.camera.core.processing.Packet<byte[]> cropAndMaybeApplyEffect(androidx.camera.core.processing.Packet<byte[]> r3, int r4) throws androidx.camera.core.ImageCaptureException {
            r2 = this;
            int r0 = r3.getFormat()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            androidx.core.util.Preconditions.checkState(r0)
            androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> r0 = r2.mJpegBytes2CroppedBitmap
            java.lang.Object r3 = r0.apply(r3)
            androidx.camera.core.processing.Packet r3 = (androidx.camera.core.processing.Packet) r3
            androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> r0 = r2.mBitmapEffect
            if (r0 == 0) goto L20
            java.lang.Object r3 = r0.apply(r3)
            androidx.camera.core.processing.Packet r3 = (androidx.camera.core.processing.Packet) r3
        L20:
            androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Bitmap2JpegBytes$In, androidx.camera.core.processing.Packet<byte[]>> r0 = r2.mBitmap2JpegBytes
            androidx.camera.core.imagecapture.Bitmap2JpegBytes$In r3 = androidx.camera.core.imagecapture.Bitmap2JpegBytes.In.of(r3, r4)
            java.lang.Object r3 = r0.apply(r3)
            androidx.camera.core.processing.Packet r3 = (androidx.camera.core.processing.Packet) r3
            return r3
    }

    public static /* synthetic */ void d(androidx.camera.core.imagecapture.ProcessingNode r0, androidx.camera.core.imagecapture.ProcessingNode.InputPacket r1) {
            r0.processInputPacket(r1)
            return
    }

    public static /* synthetic */ void e(androidx.camera.core.imagecapture.ProcessingRequest r0, androidx.camera.core.ImageCaptureException r1) {
            r0.onProcessFailure(r1)
            return
    }

    private static void sendError(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r2, @androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r3) {
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.imagecapture.g r1 = new androidx.camera.core.imagecapture.g
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    void injectProcessingInput2Packet(@androidx.annotation.NonNull androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> r1) {
            r0 = this;
            r0.mInput2Packet = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    androidx.camera.core.ImageProxy processInMemoryCapture(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingNode.InputPacket r4) throws androidx.camera.core.ImageCaptureException {
            r3 = this;
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r4.getProcessingRequest()
            androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode$InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> r1 = r3.mInput2Packet
            java.lang.Object r4 = r1.apply(r4)
            androidx.camera.core.processing.Packet r4 = (androidx.camera.core.processing.Packet) r4
            int r1 = r4.getFormat()
            r2 = 35
            if (r1 == r2) goto L1c
            androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> r1 = r3.mBitmapEffect
            if (r1 != 0) goto L1c
            boolean r1 = r3.mHasIncorrectJpegMetadataQuirk
            if (r1 == 0) goto L4a
        L1c:
            androidx.camera.core.imagecapture.ProcessingNode$In r1 = r3.mInputEdge
            int r1 = r1.getOutputFormat()
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != r2) goto L4a
            androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes$In, androidx.camera.core.processing.Packet<byte[]>> r1 = r3.mImage2JpegBytes
            int r2 = r0.getJpegQuality()
            androidx.camera.core.imagecapture.Image2JpegBytes$In r4 = androidx.camera.core.imagecapture.Image2JpegBytes.In.of(r4, r2)
            java.lang.Object r4 = r1.apply(r4)
            androidx.camera.core.processing.Packet r4 = (androidx.camera.core.processing.Packet) r4
            androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> r1 = r3.mBitmapEffect
            if (r1 == 0) goto L42
            int r0 = r0.getJpegQuality()
            androidx.camera.core.processing.Packet r4 = r3.cropAndMaybeApplyEffect(r4, r0)
        L42:
            androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> r0 = r3.mJpegBytes2Image
            java.lang.Object r4 = r0.apply(r4)
            androidx.camera.core.processing.Packet r4 = (androidx.camera.core.processing.Packet) r4
        L4a:
            androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, androidx.camera.core.ImageProxy> r0 = r3.mJpegImage2Result
            java.lang.Object r4 = r0.apply(r4)
            androidx.camera.core.ImageProxy r4 = (androidx.camera.core.ImageProxy) r4
            return r4
    }

    @androidx.annotation.WorkerThread
    void processInputPacket(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingNode.InputPacket r5) {
            r4 = this;
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r5.getProcessingRequest()
            r1 = 0
            androidx.camera.core.imagecapture.ProcessingRequest r2 = r5.getProcessingRequest()     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            boolean r2 = r2.isInMemoryCapture()     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            if (r2 == 0) goto L26
            androidx.camera.core.ImageProxy r5 = r4.processInMemoryCapture(r5)     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            java.util.concurrent.ScheduledExecutorService r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            androidx.camera.core.imagecapture.h r3 = new androidx.camera.core.imagecapture.h     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            r3.<init>(r0, r5)     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            r2.execute(r3)     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            return
        L20:
            r5 = move-exception
            goto L37
        L22:
            r5 = move-exception
            goto L42
        L24:
            r5 = move-exception
            goto L4d
        L26:
            androidx.camera.core.ImageCapture$OutputFileResults r5 = r4.processOnDiskCapture(r5)     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            java.util.concurrent.ScheduledExecutorService r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            androidx.camera.core.imagecapture.i r3 = new androidx.camera.core.imagecapture.i     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            r3.<init>(r0, r5)     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            r2.execute(r3)     // Catch: java.lang.RuntimeException -> L20 java.lang.OutOfMemoryError -> L22 androidx.camera.core.ImageCaptureException -> L24
            return
        L37:
            androidx.camera.core.ImageCaptureException r2 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed."
            r2.<init>(r1, r3, r5)
            sendError(r0, r2)
            goto L50
        L42:
            androidx.camera.core.ImageCaptureException r2 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed due to low memory."
            r2.<init>(r1, r3, r5)
            sendError(r0, r2)
            goto L50
        L4d:
            sendError(r0, r5)
        L50:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    androidx.camera.core.ImageCapture.OutputFileResults processOnDiskCapture(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingNode.InputPacket r5) throws androidx.camera.core.ImageCaptureException {
            r4 = this;
            androidx.camera.core.imagecapture.ProcessingNode$In r0 = r4.mInputEdge
            int r0 = r0.getOutputFormat()
            r1 = 256(0x100, float:3.59E-43)
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            androidx.camera.core.imagecapture.ProcessingNode$In r1 = r4.mInputEdge
            int r1 = r1.getOutputFormat()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r1 = "On-disk capture only support JPEG output format. Output format: %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r5.getProcessingRequest()
            androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode$InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> r1 = r4.mInput2Packet
            java.lang.Object r5 = r1.apply(r5)
            androidx.camera.core.processing.Packet r5 = (androidx.camera.core.processing.Packet) r5
            androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes$In, androidx.camera.core.processing.Packet<byte[]>> r1 = r4.mImage2JpegBytes
            int r2 = r0.getJpegQuality()
            androidx.camera.core.imagecapture.Image2JpegBytes$In r5 = androidx.camera.core.imagecapture.Image2JpegBytes.In.of(r5, r2)
            java.lang.Object r5 = r1.apply(r5)
            androidx.camera.core.processing.Packet r5 = (androidx.camera.core.processing.Packet) r5
            boolean r1 = r5.hasCropping()
            if (r1 != 0) goto L4c
            androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> r1 = r4.mBitmapEffect
            if (r1 == 0) goto L54
        L4c:
            int r1 = r0.getJpegQuality()
            androidx.camera.core.processing.Packet r5 = r4.cropAndMaybeApplyEffect(r5, r1)
        L54:
            androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk$In, androidx.camera.core.ImageCapture$OutputFileResults> r1 = r4.mJpegBytes2Disk
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r0.getOutputFileOptions()
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.imagecapture.JpegBytes2Disk$In r5 = androidx.camera.core.imagecapture.JpegBytes2Disk.In.of(r5, r0)
            java.lang.Object r5 = r1.apply(r5)
            androidx.camera.core.ImageCapture$OutputFileResults r5 = (androidx.camera.core.ImageCapture.OutputFileResults) r5
            return r5
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
            r0 = this;
            return
    }

    @Override // androidx.camera.core.processing.Node
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Void transform(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingNode.In r1) {
            r0 = this;
            androidx.camera.core.imagecapture.ProcessingNode$In r1 = (androidx.camera.core.imagecapture.ProcessingNode.In) r1
            java.lang.Void r1 = r0.transform2(r1)
            return r1
    }

    @androidx.annotation.NonNull
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public java.lang.Void transform2(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingNode.In r3) {
            r2 = this;
            r2.mInputEdge = r3
            androidx.camera.core.processing.Edge r0 = r3.getEdge()
            androidx.camera.core.imagecapture.f r1 = new androidx.camera.core.imagecapture.f
            r1.<init>(r2)
            r0.setListener(r1)
            androidx.camera.core.imagecapture.ProcessingInput2Packet r0 = new androidx.camera.core.imagecapture.ProcessingInput2Packet
            r0.<init>()
            r2.mInput2Packet = r0
            androidx.camera.core.imagecapture.Image2JpegBytes r0 = new androidx.camera.core.imagecapture.Image2JpegBytes
            androidx.camera.core.impl.Quirks r1 = r2.mQuirks
            r0.<init>(r1)
            r2.mImage2JpegBytes = r0
            androidx.camera.core.imagecapture.JpegBytes2CroppedBitmap r0 = new androidx.camera.core.imagecapture.JpegBytes2CroppedBitmap
            r0.<init>()
            r2.mJpegBytes2CroppedBitmap = r0
            androidx.camera.core.imagecapture.Bitmap2JpegBytes r0 = new androidx.camera.core.imagecapture.Bitmap2JpegBytes
            r0.<init>()
            r2.mBitmap2JpegBytes = r0
            androidx.camera.core.imagecapture.JpegBytes2Disk r0 = new androidx.camera.core.imagecapture.JpegBytes2Disk
            r0.<init>()
            r2.mJpegBytes2Disk = r0
            androidx.camera.core.imagecapture.JpegImage2Result r0 = new androidx.camera.core.imagecapture.JpegImage2Result
            r0.<init>()
            r2.mJpegImage2Result = r0
            int r3 = r3.getInputFormat()
            r0 = 35
            if (r3 == r0) goto L4a
            androidx.camera.core.processing.InternalImageProcessor r3 = r2.mImageProcessor
            if (r3 != 0) goto L4a
            boolean r3 = r2.mHasIncorrectJpegMetadataQuirk
            if (r3 == 0) goto L51
        L4a:
            androidx.camera.core.imagecapture.JpegBytes2Image r3 = new androidx.camera.core.imagecapture.JpegBytes2Image
            r3.<init>()
            r2.mJpegBytes2Image = r3
        L51:
            androidx.camera.core.processing.InternalImageProcessor r3 = r2.mImageProcessor
            if (r3 == 0) goto L5c
            androidx.camera.core.imagecapture.BitmapEffect r0 = new androidx.camera.core.imagecapture.BitmapEffect
            r0.<init>(r3)
            r2.mBitmapEffect = r0
        L5c:
            r3 = 0
            return r3
    }
}
