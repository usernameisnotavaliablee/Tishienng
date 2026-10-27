package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DefaultSurfaceProcessor implements androidx.camera.core.processing.SurfaceProcessorInternal, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "DefaultSurfaceProcessor";
    private final java.util.concurrent.Executor mGlExecutor;

    @androidx.annotation.VisibleForTesting
    final android.os.Handler mGlHandler;
    private final androidx.camera.core.processing.OpenGlRenderer mGlRenderer;

    @androidx.annotation.VisibleForTesting
    final android.os.HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final java.util.concurrent.atomic.AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> mOutputSurfaces;
    private final java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> mPendingSnapshots;
    private final float[] mSurfaceOutputMatrix;
    private final float[] mTextureMatrix;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Factory {
        private static androidx.arch.core.util.Function<androidx.camera.core.DynamicRange, androidx.camera.core.processing.SurfaceProcessorInternal> sSupplier;

        static {
                androidx.camera.core.processing.o r0 = new androidx.camera.core.processing.o
                r0.<init>()
                androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.sSupplier = r0
                return
        }

        private Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.processing.SurfaceProcessorInternal newInstance(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
                androidx.arch.core.util.Function<androidx.camera.core.DynamicRange, androidx.camera.core.processing.SurfaceProcessorInternal> r0 = androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.sSupplier
                java.lang.Object r1 = r0.apply(r1)
                androidx.camera.core.processing.SurfaceProcessorInternal r1 = (androidx.camera.core.processing.SurfaceProcessorInternal) r1
                return r1
        }

        @androidx.annotation.VisibleForTesting
        public static void setSupplier(@androidx.annotation.NonNull androidx.arch.core.util.Function<androidx.camera.core.DynamicRange, androidx.camera.core.processing.SurfaceProcessorInternal> r0) {
                androidx.camera.core.processing.DefaultSurfaceProcessor.Factory.sSupplier = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class PendingSnapshot {
        PendingSnapshot() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot of(@androidx.annotation.IntRange(from = 0, to = 100) int r1, @androidx.annotation.IntRange(from = 0, to = 359) int r2, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> r3) {
                androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot r0 = new androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        abstract androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getCompleter();

        @androidx.annotation.IntRange(from = 0, to = 100)
        abstract int getJpegQuality();

        @androidx.annotation.IntRange(from = 0, to = 359)
        abstract int getRotationDegrees();
    }

    DefaultSurfaceProcessor(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            r1 = this;
            androidx.camera.core.processing.ShaderProvider r0 = androidx.camera.core.processing.ShaderProvider.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    DefaultSurfaceProcessor(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r4, @androidx.annotation.NonNull androidx.camera.core.processing.ShaderProvider r5) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.mIsReleaseRequested = r0
            r0 = 16
            float[] r2 = new float[r0]
            r3.mTextureMatrix = r2
            float[] r0 = new float[r0]
            r3.mSurfaceOutputMatrix = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.mOutputSurfaces = r0
            r3.mInputSurfaceCount = r1
            r3.mIsReleased = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mPendingSnapshots = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "GL Thread"
            r0.<init>(r1)
            r3.mGlThread = r0
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r3.mGlHandler = r1
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(r1)
            r3.mGlExecutor = r0
            androidx.camera.core.processing.OpenGlRenderer r0 = new androidx.camera.core.processing.OpenGlRenderer
            r0.<init>()
            r3.mGlRenderer = r0
            r3.initGlRenderer(r4, r5)     // Catch: java.lang.RuntimeException -> L4f
            return
        L4f:
            r4 = move-exception
            r3.release()
            throw r4
    }

    public static /* synthetic */ void a() {
            return
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.core.processing.DefaultSurfaceProcessor r0, int r1, int r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            r0.getClass()
            androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot r1 = androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot.of(r1, r2, r3)
            androidx.camera.core.processing.c r2 = new androidx.camera.core.processing.c
            r2.<init>(r0, r1)
            androidx.camera.core.processing.d r1 = new androidx.camera.core.processing.d
            r1.<init>(r3)
            r0.executeSafely(r2, r1)
            java.lang.String r0 = "DefaultSurfaceProcessor#snapshot"
            return r0
    }

    public static /* synthetic */ void c(androidx.camera.core.processing.DefaultSurfaceProcessor r0, androidx.camera.core.SurfaceOutput r1, androidx.camera.core.SurfaceOutput.Event r2) {
            r0.getClass()
            r1.close()
            java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> r2 = r0.mOutputSurfaces
            java.lang.Object r1 = r2.remove(r1)
            android.view.Surface r1 = (android.view.Surface) r1
            if (r1 == 0) goto L15
            androidx.camera.core.processing.OpenGlRenderer r0 = r0.mGlRenderer
            r0.unregisterOutputSurface(r1)
        L15:
            return
    }

    @androidx.annotation.WorkerThread
    private void checkReadyToRelease() {
            r4 = this;
            boolean r0 = r4.mIsReleased
            if (r0 == 0) goto L52
            int r0 = r4.mInputSurfaceCount
            if (r0 != 0) goto L52
            java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> r0 = r4.mOutputSurfaces
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.camera.core.SurfaceOutput r1 = (androidx.camera.core.SurfaceOutput) r1
            r1.close()
            goto L12
        L22:
            java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot> r0 = r4.mPendingSnapshots
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot r1 = (androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot) r1
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r1 = r1.getCompleter()
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Failed to snapshot: DefaultSurfaceProcessor is released."
            r2.<init>(r3)
            r1.setException(r2)
            goto L28
        L43:
            java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> r0 = r4.mOutputSurfaces
            r0.clear()
            androidx.camera.core.processing.OpenGlRenderer r0 = r4.mGlRenderer
            r0.release()
            android.os.HandlerThread r0 = r4.mGlThread
            r0.quit()
        L52:
            return
    }

    public static /* synthetic */ void d(androidx.camera.core.processing.DefaultSurfaceProcessor r4, androidx.camera.core.SurfaceRequest r5) {
            int r0 = r4.mInputSurfaceCount
            int r0 = r0 + 1
            r4.mInputSurfaceCount = r0
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            androidx.camera.core.processing.OpenGlRenderer r1 = r4.mGlRenderer
            int r1 = r1.getTextureName()
            r0.<init>(r1)
            android.util.Size r1 = r5.getResolution()
            int r1 = r1.getWidth()
            android.util.Size r2 = r5.getResolution()
            int r2 = r2.getHeight()
            r0.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r0)
            java.util.concurrent.Executor r2 = r4.mGlExecutor
            androidx.camera.core.processing.m r3 = new androidx.camera.core.processing.m
            r3.<init>(r4, r0, r1)
            r5.provideSurface(r1, r2, r3)
            android.os.Handler r5 = r4.mGlHandler
            r0.setOnFrameAvailableListener(r4, r5)
            return
    }

    public static /* synthetic */ void e(androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Failed to snapshot: OpenGLRenderer not ready."
            r0.<init>(r1)
            r2.setException(r0)
            return
    }

    private void executeSafely(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            androidx.camera.core.processing.h r0 = new androidx.camera.core.processing.h
            r0.<init>()
            r1.executeSafely(r2, r0)
            return
    }

    private void executeSafely(@androidx.annotation.NonNull java.lang.Runnable r3, @androidx.annotation.NonNull java.lang.Runnable r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mGlExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            androidx.camera.core.processing.k r1 = new androidx.camera.core.processing.k     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r1.<init>(r2, r4, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r0 = "DefaultSurfaceProcessor"
            java.lang.String r1 = "Unable to executor runnable"
            androidx.camera.core.Logger.w(r0, r1, r3)
            r4.run()
            return
    }

    public static /* synthetic */ void f(androidx.camera.core.processing.DefaultSurfaceProcessor r0, androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot r1) {
            java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot> r0 = r0.mPendingSnapshots
            r0.add(r1)
            return
    }

    private void failAllPendingSnapshots(@androidx.annotation.NonNull java.lang.Throwable r3) {
            r2 = this;
            java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot> r0 = r2.mPendingSnapshots
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot r1 = (androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot) r1
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r1 = r1.getCompleter()
            r1.setException(r3)
            goto L6
        L1a:
            java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot> r3 = r2.mPendingSnapshots
            r3.clear()
            return
    }

    public static /* synthetic */ java.lang.Object g(androidx.camera.core.processing.DefaultSurfaceProcessor r1, androidx.camera.core.DynamicRange r2, androidx.camera.core.processing.ShaderProvider r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            r1.getClass()
            androidx.camera.core.processing.l r0 = new androidx.camera.core.processing.l
            r0.<init>(r1, r2, r3, r4)
            r1.executeSafely(r0)
            java.lang.String r1 = "Init GlRenderer"
            return r1
    }

    @androidx.annotation.NonNull
    private android.graphics.Bitmap getBitmap(@androidx.annotation.NonNull android.util.Size r8, @androidx.annotation.NonNull float[] r9, int r10) {
            r7 = this;
            r0 = 16
            float[] r1 = new float[r0]
            r0 = 0
            android.opengl.Matrix.setIdentityM(r1, r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(r1, r0)
            float r2 = (float) r10
            androidx.camera.core.impl.utils.MatrixExt.preRotate(r1, r2, r0, r0)
            r4 = 0
            r6 = 0
            r2 = 0
            r3 = r1
            r5 = r9
            android.opengl.Matrix.multiplyMM(r1, r2, r3, r4, r5, r6)
            android.util.Size r8 = androidx.camera.core.impl.utils.TransformUtils.rotateSize(r8, r10)
            androidx.camera.core.processing.OpenGlRenderer r9 = r7.mGlRenderer
            android.graphics.Bitmap r8 = r9.snapshot(r8, r1)
            return r8
    }

    public static /* synthetic */ void h(androidx.camera.core.processing.DefaultSurfaceProcessor r1) {
            r0 = 1
            r1.mIsReleased = r0
            r1.checkReadyToRelease()
            return
    }

    public static /* synthetic */ void i(androidx.camera.core.processing.DefaultSurfaceProcessor r0, androidx.camera.core.DynamicRange r1, androidx.camera.core.processing.ShaderProvider r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            r0.getClass()
            androidx.camera.core.processing.OpenGlRenderer r0 = r0.mGlRenderer     // Catch: java.lang.RuntimeException -> Ld
            r0.init(r1, r2)     // Catch: java.lang.RuntimeException -> Ld
            r0 = 0
            r3.set(r0)     // Catch: java.lang.RuntimeException -> Ld
            return
        Ld:
            r0 = move-exception
            r3.setException(r0)
            return
    }

    private void initGlRenderer(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2, @androidx.annotation.NonNull androidx.camera.core.processing.ShaderProvider r3) {
            r1 = this;
            androidx.camera.core.processing.b r0 = new androidx.camera.core.processing.b
            r0.<init>(r1, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r2.get()     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            return
        Ld:
            r2 = move-exception
            goto L10
        Lf:
            r2 = move-exception
        L10:
            boolean r3 = r2 instanceof java.util.concurrent.ExecutionException
            if (r3 == 0) goto L18
            java.lang.Throwable r2 = r2.getCause()
        L18:
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L1f
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to create DefaultSurfaceProcessor"
            r3.<init>(r0, r2)
            throw r3
    }

    public static /* synthetic */ void j(androidx.camera.core.processing.DefaultSurfaceProcessor r0, android.graphics.SurfaceTexture r1, android.view.Surface r2, androidx.camera.core.SurfaceRequest.Result r3) {
            r0.getClass()
            r3 = 0
            r1.setOnFrameAvailableListener(r3)
            r1.release()
            r2.release()
            int r1 = r0.mInputSurfaceCount
            int r1 = r1 + (-1)
            r0.mInputSurfaceCount = r1
            r0.checkReadyToRelease()
            return
    }

    public static /* synthetic */ void k(androidx.camera.core.processing.DefaultSurfaceProcessor r2, androidx.camera.core.SurfaceOutput r3) {
            java.util.concurrent.Executor r0 = r2.mGlExecutor
            androidx.camera.core.processing.a r1 = new androidx.camera.core.processing.a
            r1.<init>(r2, r3)
            android.view.Surface r0 = r3.getSurface(r0, r1)
            androidx.camera.core.processing.OpenGlRenderer r1 = r2.mGlRenderer
            r1.registerOutputSurface(r0)
            java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> r2 = r2.mOutputSurfaces
            r2.put(r3, r0)
            return
    }

    public static /* synthetic */ void l(androidx.camera.core.processing.DefaultSurfaceProcessor r0, java.lang.Runnable r1, java.lang.Runnable r2) {
            boolean r0 = r0.mIsReleased
            if (r0 == 0) goto L8
            r1.run()
            return
        L8:
            r2.run()
            return
    }

    @androidx.annotation.WorkerThread
    private void takeSnapshotAndDrawJpeg(@androidx.annotation.Nullable kotlin.Triple<android.view.Surface, android.util.Size, float[]> r12) {
            r11 = this;
            java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot> r0 = r11.mPendingSnapshots
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            if (r12 != 0) goto L16
            java.lang.Exception r12 = new java.lang.Exception
            java.lang.String r0 = "Failed to snapshot: no JPEG Surface."
            r12.<init>(r0)
            r11.failAllPendingSnapshots(r12)
            return
        L16:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L8c
            r0.<init>()     // Catch: java.io.IOException -> L8c
            java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot> r1 = r11.mPendingSnapshots     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L45
            r2 = -1
            r3 = 0
            r5 = r3
            r7 = r5
            r4 = -1
            r6 = -1
        L27:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r8 == 0) goto L88
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L45
            androidx.camera.core.processing.DefaultSurfaceProcessor$PendingSnapshot r8 = (androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot) r8     // Catch: java.lang.Throwable -> L45
            int r9 = r8.getRotationDegrees()     // Catch: java.lang.Throwable -> L45
            if (r4 != r9) goto L3b
            if (r5 != 0) goto L58
        L3b:
            int r4 = r8.getRotationDegrees()     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L47
            r5.recycle()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r12 = move-exception
            goto L8e
        L47:
            java.lang.Object r5 = r12.getSecond()     // Catch: java.lang.Throwable -> L45
            android.util.Size r5 = (android.util.Size) r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r6 = r12.getThird()     // Catch: java.lang.Throwable -> L45
            float[] r6 = (float[]) r6     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap r5 = r11.getBitmap(r5, r6, r4)     // Catch: java.lang.Throwable -> L45
            r6 = -1
        L58:
            int r9 = r8.getJpegQuality()     // Catch: java.lang.Throwable -> L45
            if (r6 == r9) goto L6e
            r0.reset()     // Catch: java.lang.Throwable -> L45
            int r6 = r8.getJpegQuality()     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L45
            r5.compress(r7, r6, r0)     // Catch: java.lang.Throwable -> L45
            byte[] r7 = r0.toByteArray()     // Catch: java.lang.Throwable -> L45
        L6e:
            java.lang.Object r9 = r12.getFirst()     // Catch: java.lang.Throwable -> L45
            android.view.Surface r9 = (android.view.Surface) r9     // Catch: java.lang.Throwable -> L45
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L45
            r10 = r7
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L45
            androidx.camera.core.ImageProcessingUtil.writeJpegBytesToSurface(r9, r10)     // Catch: java.lang.Throwable -> L45
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r8 = r8.getCompleter()     // Catch: java.lang.Throwable -> L45
            r8.set(r3)     // Catch: java.lang.Throwable -> L45
            r1.remove()     // Catch: java.lang.Throwable -> L45
            goto L27
        L88:
            r0.close()     // Catch: java.io.IOException -> L8c
            return
        L8c:
            r12 = move-exception
            goto L97
        L8e:
            r0.close()     // Catch: java.lang.Throwable -> L92
            goto L96
        L92:
            r0 = move-exception
            r12.addSuppressed(r0)     // Catch: java.io.IOException -> L8c
        L96:
            throw r12     // Catch: java.io.IOException -> L8c
        L97:
            r11.failAllPendingSnapshots(r12)
            return
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@androidx.annotation.NonNull android.graphics.SurfaceTexture r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.mIsReleaseRequested
            boolean r0 = r0.get()
            if (r0 == 0) goto La
            goto La0
        La:
            r10.updateTexImage()
            float[] r0 = r9.mTextureMatrix
            r10.getTransformMatrix(r0)
            java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> r0 = r9.mOutputSurfaces
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            android.view.Surface r3 = (android.view.Surface) r3
            java.lang.Object r2 = r2.getKey()
            androidx.camera.core.SurfaceOutput r2 = (androidx.camera.core.SurfaceOutput) r2
            float[] r4 = r9.mSurfaceOutputMatrix
            float[] r5 = r9.mTextureMatrix
            r2.updateTransformMatrix(r4, r5)
            int r4 = r2.getFormat()
            r5 = 34
            if (r4 != r5) goto L59
            androidx.camera.core.processing.OpenGlRenderer r2 = r9.mGlRenderer     // Catch: java.lang.RuntimeException -> L50
            long r4 = r10.getTimestamp()     // Catch: java.lang.RuntimeException -> L50
            float[] r6 = r9.mSurfaceOutputMatrix     // Catch: java.lang.RuntimeException -> L50
            r2.render(r4, r6, r3)     // Catch: java.lang.RuntimeException -> L50
            goto L1d
        L50:
            r2 = move-exception
            java.lang.String r3 = "DefaultSurfaceProcessor"
            java.lang.String r4 = "Failed to render with OpenGL."
            androidx.camera.core.Logger.e(r3, r4, r2)
            goto L1d
        L59:
            int r4 = r2.getFormat()
            r5 = 256(0x100, float:3.59E-43)
            r6 = 0
            r7 = 1
            if (r4 != r5) goto L65
            r4 = 1
            goto L66
        L65:
            r4 = 0
        L66:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Unsupported format: "
            r5.append(r8)
            int r8 = r2.getFormat()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            androidx.core.util.Preconditions.checkState(r4, r5)
            if (r1 != 0) goto L81
            r6 = 1
        L81:
            java.lang.String r1 = "Only one JPEG output is supported."
            androidx.core.util.Preconditions.checkState(r6, r1)
            kotlin.Triple r1 = new kotlin.Triple
            android.util.Size r2 = r2.getSize()
            float[] r4 = r9.mSurfaceOutputMatrix
            java.lang.Object r4 = r4.clone()
            float[] r4 = (float[]) r4
            r1.<init>(r3, r2, r4)
            goto L1d
        L98:
            r9.takeSnapshotAndDrawJpeg(r1)     // Catch: java.lang.RuntimeException -> L9c
            goto La0
        L9c:
            r10 = move-exception
            r9.failAllPendingSnapshots(r10)
        La0:
            return
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsReleaseRequested
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc
            r3.willNotProvideSurface()
            return
        Lc:
            androidx.camera.core.processing.i r0 = new androidx.camera.core.processing.i
            r0.<init>(r2, r3)
            java.util.Objects.requireNonNull(r3)
            androidx.camera.core.processing.j r1 = new androidx.camera.core.processing.j
            r1.<init>(r3)
            r2.executeSafely(r0, r1)
            return
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@androidx.annotation.NonNull androidx.camera.core.SurfaceOutput r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsReleaseRequested
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc
            r3.close()
            return
        Lc:
            androidx.camera.core.processing.f r0 = new androidx.camera.core.processing.f
            r0.<init>(r2, r3)
            java.util.Objects.requireNonNull(r3)
            androidx.camera.core.processing.g r1 = new androidx.camera.core.processing.g
            r1.<init>(r3)
            r2.executeSafely(r0, r1)
            return
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mIsReleaseRequested
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            androidx.camera.core.processing.n r0 = new androidx.camera.core.processing.n
            r0.<init>(r2)
            r2.executeSafely(r0)
            return
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> snapshot(@androidx.annotation.IntRange(from = 0, to = 100) int r2, @androidx.annotation.IntRange(from = 0, to = 359) int r3) {
            r1 = this;
            androidx.camera.core.processing.e r0 = new androidx.camera.core.processing.e
            r0.<init>(r1, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r2)
            return r2
    }
}
