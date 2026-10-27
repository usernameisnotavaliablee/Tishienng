package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class TakePictureRequest {
    private int mRemainingRetires;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface RetryControl {
        void retryRequest(@androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r1);
    }

    public TakePictureRequest() {
            r1 = this;
            r1.<init>()
            androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler r0 = new androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler
            r0.<init>()
            int r0 = r0.getRetryCount()
            r1.mRemainingRetires = r0
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.imagecapture.TakePictureRequest r4, androidx.camera.core.ImageCaptureException r5) {
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r0 = r4.getInMemoryCallback()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            androidx.camera.core.ImageCapture$OnImageSavedCallback r3 = r4.getOnDiskCallback()
            if (r3 == 0) goto L12
            r1 = 1
        L12:
            if (r0 == 0) goto L21
            if (r1 != 0) goto L21
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r4 = r4.getInMemoryCallback()
            java.util.Objects.requireNonNull(r4)
            r4.onError(r5)
            return
        L21:
            if (r1 == 0) goto L30
            if (r0 != 0) goto L30
            androidx.camera.core.ImageCapture$OnImageSavedCallback r4 = r4.getOnDiskCallback()
            java.util.Objects.requireNonNull(r4)
            r4.onError(r5)
            return
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "One and only one callback is allowed."
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ void b(androidx.camera.core.imagecapture.TakePictureRequest r0, androidx.camera.core.ImageCapture.OutputFileResults r1) {
            androidx.camera.core.ImageCapture$OnImageSavedCallback r0 = r0.getOnDiskCallback()
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.onImageSaved(r1)
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.imagecapture.TakePictureRequest r0, androidx.camera.core.ImageProxy r1) {
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r0 = r0.getInMemoryCallback()
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.onCaptureSuccess(r1)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.imagecapture.TakePictureRequest of(@androidx.annotation.NonNull java.util.concurrent.Executor r13, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageCapturedCallback r14, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageSavedCallback r15, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OutputFileOptions r16, @androidx.annotation.NonNull android.graphics.Rect r17, @androidx.annotation.NonNull android.graphics.Matrix r18, int r19, int r20, int r21, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r22) {
            r0 = 0
            r1 = 1
            if (r15 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r16 != 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r2 != r3) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            java.lang.String r3 = "onDiskCallback and outputFileOptions should be both null or both non-null."
            androidx.core.util.Preconditions.checkArgument(r2, r3)
            if (r15 != 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r14 != 0) goto L1e
            r0 = 1
        L1e:
            r0 = r0 ^ r2
            java.lang.String r1 = "One and only one on-disk or in-memory callback should be present."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            androidx.camera.core.imagecapture.AutoValue_TakePictureRequest r2 = new androidx.camera.core.imagecapture.AutoValue_TakePictureRequest
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
    }

    @androidx.annotation.MainThread
    boolean decrementRetryCounter() {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            int r0 = r2.mRemainingRetires
            if (r0 <= 0) goto Lc
            r1 = 1
            int r0 = r0 - r1
            r2.mRemainingRetires = r0
            return r1
        Lc:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    abstract java.util.concurrent.Executor getAppExecutor();

    abstract int getCaptureMode();

    @androidx.annotation.NonNull
    abstract android.graphics.Rect getCropRect();

    @androidx.annotation.Nullable
    abstract androidx.camera.core.ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    @androidx.annotation.IntRange(from = 1, to = 100)
    abstract int getJpegQuality();

    @androidx.annotation.Nullable
    abstract androidx.camera.core.ImageCapture.OnImageSavedCallback getOnDiskCallback();

    @androidx.annotation.Nullable
    abstract androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions();

    @androidx.annotation.MainThread
    @androidx.annotation.VisibleForTesting
    int getRemainingRetries() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            int r0 = r1.mRemainingRetires
            return r0
    }

    abstract int getRotationDegrees();

    @androidx.annotation.NonNull
    abstract android.graphics.Matrix getSensorToBufferTransform();

    @androidx.annotation.NonNull
    abstract java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    @androidx.annotation.MainThread
    void incrementRetryCounter() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            int r0 = r1.mRemainingRetires
            int r0 = r0 + 1
            r1.mRemainingRetires = r0
            return
    }

    void onError(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getAppExecutor()
            androidx.camera.core.imagecapture.t r1 = new androidx.camera.core.imagecapture.t
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    void onResult(@androidx.annotation.Nullable androidx.camera.core.ImageCapture.OutputFileResults r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getAppExecutor()
            androidx.camera.core.imagecapture.s r1 = new androidx.camera.core.imagecapture.s
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    void onResult(@androidx.annotation.Nullable androidx.camera.core.ImageProxy r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getAppExecutor()
            androidx.camera.core.imagecapture.r r1 = new androidx.camera.core.imagecapture.r
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }
}
