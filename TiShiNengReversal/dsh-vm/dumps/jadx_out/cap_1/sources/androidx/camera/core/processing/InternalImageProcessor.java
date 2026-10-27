package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class InternalImageProcessor {

    @androidx.annotation.NonNull
    private final androidx.core.util.Consumer<java.lang.Throwable> mErrorListener;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mExecutor;

    @androidx.annotation.NonNull
    private final androidx.camera.core.ImageProcessor mImageProcessor;

    public InternalImageProcessor(@androidx.annotation.NonNull androidx.camera.core.CameraEffect r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.getTargets()
            r1 = 4
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            androidx.core.util.Preconditions.checkArgument(r0)
            java.util.concurrent.Executor r0 = r3.getExecutor()
            r2.mExecutor = r0
            androidx.camera.core.ImageProcessor r0 = r3.getImageProcessor()
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.ImageProcessor r0 = (androidx.camera.core.ImageProcessor) r0
            r2.mImageProcessor = r0
            androidx.core.util.Consumer r3 = r3.getErrorListener()
            r2.mErrorListener = r3
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.core.processing.InternalImageProcessor r2, androidx.camera.core.ImageProcessor.Request r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            java.util.concurrent.Executor r0 = r2.mExecutor
            androidx.camera.core.processing.p r1 = new androidx.camera.core.processing.p
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "InternalImageProcessor#process "
            r2.append(r4)
            int r3 = r3.hashCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static /* synthetic */ void b(androidx.camera.core.processing.InternalImageProcessor r1, androidx.camera.core.ImageProcessor.Request r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            r1.getClass()
            androidx.camera.core.ImageProcessor r0 = r1.mImageProcessor     // Catch: androidx.camera.core.ProcessingException -> Ld
            androidx.camera.core.ImageProcessor$Response r1 = r0.process(r2)     // Catch: androidx.camera.core.ProcessingException -> Ld
            r3.set(r1)
            return
        Ld:
            r2 = move-exception
            androidx.core.util.Consumer<java.lang.Throwable> r1 = r1.mErrorListener
            r1.accept(r2)
            r3.setException(r2)
            return
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.ImageProcessor.Response safeProcess(@androidx.annotation.NonNull androidx.camera.core.ImageProcessor.Request r4) throws androidx.camera.core.ImageCaptureException {
            r3 = this;
            androidx.camera.core.processing.q r0 = new androidx.camera.core.processing.q     // Catch: java.lang.Exception -> L10
            r0.<init>(r3, r4)     // Catch: java.lang.Exception -> L10
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)     // Catch: java.lang.Exception -> L10
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L10
            androidx.camera.core.ImageProcessor$Response r4 = (androidx.camera.core.ImageProcessor.Response) r4     // Catch: java.lang.Exception -> L10
            return r4
        L10:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L1b
            java.lang.Throwable r4 = r4.getCause()
        L1b:
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
            r1 = 0
            java.lang.String r2 = "Failed to invoke ImageProcessor."
            r0.<init>(r1, r2, r4)
            throw r0
    }
}
