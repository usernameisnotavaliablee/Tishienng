package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ProcessingRequest {

    @androidx.annotation.NonNull
    private final androidx.camera.core.imagecapture.TakePictureCallback mCallback;

    @androidx.annotation.NonNull
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mCaptureFuture;

    @androidx.annotation.NonNull
    private final android.graphics.Rect mCropRect;
    private final int mJpegQuality;

    @androidx.annotation.Nullable
    private final androidx.camera.core.ImageCapture.OutputFileOptions mOutputFileOptions;
    private final int mRotationDegrees;

    @androidx.annotation.NonNull
    private final android.graphics.Matrix mSensorToBufferTransform;

    @androidx.annotation.NonNull
    private final java.util.List<java.lang.Integer> mStageIds;

    @androidx.annotation.NonNull
    private final java.lang.String mTagBundleKey;

    ProcessingRequest(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureBundle r1, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OutputFileOptions r2, @androidx.annotation.NonNull android.graphics.Rect r3, int r4, int r5, @androidx.annotation.NonNull android.graphics.Matrix r6, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureCallback r7, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r8) {
            r0 = this;
            r0.<init>()
            r0.mOutputFileOptions = r2
            r0.mJpegQuality = r5
            r0.mRotationDegrees = r4
            r0.mCropRect = r3
            r0.mSensorToBufferTransform = r6
            r0.mCallback = r7
            int r2 = r1.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.mTagBundleKey = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mStageIds = r2
            java.util.List r1 = r1.getCaptureStages()
            java.util.Objects.requireNonNull(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.CaptureStage r2 = (androidx.camera.core.impl.CaptureStage) r2
            java.util.List<java.lang.Integer> r3 = r0.mStageIds
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            goto L2d
        L47:
            r0.mCaptureFuture = r8
            return
    }

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getCaptureFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mCaptureFuture
            return r0
    }

    @androidx.annotation.NonNull
    android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.mCropRect
            return r0
    }

    int getJpegQuality() {
            r1 = this;
            int r0 = r1.mJpegQuality
            return r0
    }

    @androidx.annotation.Nullable
    androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions() {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.mOutputFileOptions
            return r0
    }

    int getRotationDegrees() {
            r1 = this;
            int r0 = r1.mRotationDegrees
            return r0
    }

    @androidx.annotation.NonNull
    android.graphics.Matrix getSensorToBufferTransform() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mSensorToBufferTransform
            return r0
    }

    @androidx.annotation.NonNull
    java.util.List<java.lang.Integer> getStageIds() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.mStageIds
            return r0
    }

    @androidx.annotation.NonNull
    java.lang.String getTagBundleKey() {
            r1 = this;
            java.lang.String r0 = r1.mTagBundleKey
            return r0
    }

    boolean isAborted() {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureCallback r0 = r1.mCallback
            boolean r0 = r0.isAborted()
            return r0
    }

    boolean isInMemoryCapture() {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.getOutputFileOptions()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @androidx.annotation.MainThread
    void onCaptureFailure(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r2) {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureCallback r0 = r1.mCallback
            r0.onCaptureFailure(r2)
            return
    }

    @androidx.annotation.MainThread
    void onFinalResult(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileResults r2) {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureCallback r0 = r1.mCallback
            r0.onFinalResult(r2)
            return
    }

    @androidx.annotation.MainThread
    void onFinalResult(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureCallback r0 = r1.mCallback
            r0.onFinalResult(r2)
            return
    }

    @androidx.annotation.MainThread
    void onImageCaptured() {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureCallback r0 = r1.mCallback
            r0.onImageCaptured()
            return
    }

    @androidx.annotation.MainThread
    void onProcessFailure(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r2) {
            r1 = this;
            androidx.camera.core.imagecapture.TakePictureCallback r0 = r1.mCallback
            r0.onProcessFailure(r2)
            return
    }
}
