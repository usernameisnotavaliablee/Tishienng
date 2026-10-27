package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SurfaceProcessorWithExecutor implements androidx.camera.core.processing.SurfaceProcessorInternal {
    private static final java.lang.String TAG = "SurfaceProcessor";

    @androidx.annotation.NonNull
    private final androidx.core.util.Consumer<java.lang.Throwable> mErrorListener;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.NonNull
    private final androidx.camera.core.SurfaceProcessor mSurfaceProcessor;

    public SurfaceProcessorWithExecutor(@androidx.annotation.NonNull androidx.camera.core.CameraEffect r2) {
            r1 = this;
            r1.<init>()
            androidx.camera.core.SurfaceProcessor r0 = r2.getSurfaceProcessor()
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.SurfaceProcessor r0 = (androidx.camera.core.SurfaceProcessor) r0
            r1.mSurfaceProcessor = r0
            java.util.concurrent.Executor r0 = r2.getExecutor()
            r1.mExecutor = r0
            androidx.core.util.Consumer r2 = r2.getErrorListener()
            r1.mErrorListener = r2
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.processing.SurfaceProcessorWithExecutor r2, androidx.camera.core.SurfaceOutput r3) {
            r2.getClass()
            androidx.camera.core.SurfaceProcessor r0 = r2.mSurfaceProcessor     // Catch: androidx.camera.core.ProcessingException -> L9
            r0.onOutputSurface(r3)     // Catch: androidx.camera.core.ProcessingException -> L9
            return
        L9:
            r3 = move-exception
            java.lang.String r0 = "SurfaceProcessor"
            java.lang.String r1 = "Failed to setup SurfaceProcessor output."
            androidx.camera.core.Logger.e(r0, r1, r3)
            androidx.core.util.Consumer<java.lang.Throwable> r2 = r2.mErrorListener
            r2.accept(r3)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.processing.SurfaceProcessorWithExecutor r2, androidx.camera.core.SurfaceRequest r3) {
            r2.getClass()
            androidx.camera.core.SurfaceProcessor r0 = r2.mSurfaceProcessor     // Catch: androidx.camera.core.ProcessingException -> L9
            r0.onInputSurface(r3)     // Catch: androidx.camera.core.ProcessingException -> L9
            return
        L9:
            r3 = move-exception
            java.lang.String r0 = "SurfaceProcessor"
            java.lang.String r1 = "Failed to setup SurfaceProcessor input."
            androidx.camera.core.Logger.e(r0, r1, r3)
            androidx.core.util.Consumer<java.lang.Throwable> r2 = r2.mErrorListener
            r2.accept(r3)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public androidx.camera.core.SurfaceProcessor getProcessor() {
            r1 = this;
            androidx.camera.core.SurfaceProcessor r0 = r1.mSurfaceProcessor
            return r0
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.core.processing.h0 r1 = new androidx.camera.core.processing.h0
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@androidx.annotation.NonNull androidx.camera.core.SurfaceOutput r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.core.processing.i0 r1 = new androidx.camera.core.processing.i0
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
            r0 = this;
            return
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> snapshot(@androidx.annotation.IntRange(from = 0, to = 100) int r1, @androidx.annotation.IntRange(from = 0, to = 359) int r2) {
            r0 = this;
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "Snapshot not supported by external SurfaceProcessor"
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r1)
            return r1
    }
}
