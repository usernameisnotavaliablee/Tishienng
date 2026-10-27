package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_TakePictureRequest extends androidx.camera.core.imagecapture.TakePictureRequest {
    private final java.util.concurrent.Executor appExecutor;
    private final int captureMode;
    private final android.graphics.Rect cropRect;
    private final androidx.camera.core.ImageCapture.OnImageCapturedCallback inMemoryCallback;
    private final int jpegQuality;
    private final androidx.camera.core.ImageCapture.OnImageSavedCallback onDiskCallback;
    private final androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions;
    private final int rotationDegrees;
    private final android.graphics.Matrix sensorToBufferTransform;
    private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> sessionConfigCameraCaptureCallbacks;

    AutoValue_TakePictureRequest(java.util.concurrent.Executor r1, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageCapturedCallback r2, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OnImageSavedCallback r3, @androidx.annotation.Nullable androidx.camera.core.ImageCapture.OutputFileOptions r4, android.graphics.Rect r5, android.graphics.Matrix r6, int r7, int r8, int r9, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r10) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L38
            r0.appExecutor = r1
            r0.inMemoryCallback = r2
            r0.onDiskCallback = r3
            r0.outputFileOptions = r4
            if (r5 == 0) goto L30
            r0.cropRect = r5
            if (r6 == 0) goto L28
            r0.sensorToBufferTransform = r6
            r0.rotationDegrees = r7
            r0.jpegQuality = r8
            r0.captureMode = r9
            if (r10 == 0) goto L20
            r0.sessionConfigCameraCaptureCallbacks = r10
            return
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null sessionConfigCameraCaptureCallbacks"
            r1.<init>(r2)
            throw r1
        L28:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null sensorToBufferTransform"
            r1.<init>(r2)
            throw r1
        L30:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null cropRect"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null appExecutor"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.imagecapture.TakePictureRequest
            r2 = 0
            if (r1 == 0) goto L93
            androidx.camera.core.imagecapture.TakePictureRequest r5 = (androidx.camera.core.imagecapture.TakePictureRequest) r5
            java.util.concurrent.Executor r1 = r4.appExecutor
            java.util.concurrent.Executor r3 = r5.getAppExecutor()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L93
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r1 = r4.inMemoryCallback
            if (r1 != 0) goto L22
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r1 = r5.getInMemoryCallback()
            if (r1 != 0) goto L93
            goto L2c
        L22:
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r3 = r5.getInMemoryCallback()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L93
        L2c:
            androidx.camera.core.ImageCapture$OnImageSavedCallback r1 = r4.onDiskCallback
            if (r1 != 0) goto L37
            androidx.camera.core.ImageCapture$OnImageSavedCallback r1 = r5.getOnDiskCallback()
            if (r1 != 0) goto L93
            goto L41
        L37:
            androidx.camera.core.ImageCapture$OnImageSavedCallback r3 = r5.getOnDiskCallback()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L93
        L41:
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r4.outputFileOptions
            if (r1 != 0) goto L4c
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r5.getOutputFileOptions()
            if (r1 != 0) goto L93
            goto L56
        L4c:
            androidx.camera.core.ImageCapture$OutputFileOptions r3 = r5.getOutputFileOptions()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L93
        L56:
            android.graphics.Rect r1 = r4.cropRect
            android.graphics.Rect r3 = r5.getCropRect()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L93
            android.graphics.Matrix r1 = r4.sensorToBufferTransform
            android.graphics.Matrix r3 = r5.getSensorToBufferTransform()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L93
            int r1 = r4.rotationDegrees
            int r3 = r5.getRotationDegrees()
            if (r1 != r3) goto L93
            int r1 = r4.jpegQuality
            int r3 = r5.getJpegQuality()
            if (r1 != r3) goto L93
            int r1 = r4.captureMode
            int r3 = r5.getCaptureMode()
            if (r1 != r3) goto L93
            java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r4.sessionConfigCameraCaptureCallbacks
            java.util.List r5 = r5.getSessionConfigCameraCaptureCallbacks()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L93
            return r0
        L93:
            return r2
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.NonNull
    java.util.concurrent.Executor getAppExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.appExecutor
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    int getCaptureMode() {
            r1 = this;
            int r0 = r1.captureMode
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.NonNull
    android.graphics.Rect getCropRect() {
            r1 = this;
            android.graphics.Rect r0 = r1.cropRect
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.Nullable
    androidx.camera.core.ImageCapture.OnImageCapturedCallback getInMemoryCallback() {
            r1 = this;
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r0 = r1.inMemoryCallback
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.IntRange(from = 1, to = 100)
    int getJpegQuality() {
            r1 = this;
            int r0 = r1.jpegQuality
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.Nullable
    androidx.camera.core.ImageCapture.OnImageSavedCallback getOnDiskCallback() {
            r1 = this;
            androidx.camera.core.ImageCapture$OnImageSavedCallback r0 = r1.onDiskCallback
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.Nullable
    androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions() {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.outputFileOptions
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    int getRotationDegrees() {
            r1 = this;
            int r0 = r1.rotationDegrees
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.NonNull
    android.graphics.Matrix getSensorToBufferTransform() {
            r1 = this;
            android.graphics.Matrix r0 = r1.sensorToBufferTransform
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    @androidx.annotation.NonNull
    java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.sessionConfigCameraCaptureCallbacks
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.util.concurrent.Executor r0 = r4.appExecutor
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r2 = r4.inMemoryCallback
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.ImageCapture$OnImageSavedCallback r2 = r4.onDiskCallback
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.ImageCapture$OutputFileOptions r2 = r4.outputFileOptions
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r3 = r2.hashCode()
        L30:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            android.graphics.Rect r2 = r4.cropRect
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Matrix r2 = r4.sensorToBufferTransform
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r4.rotationDegrees
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r4.jpegQuality
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r4.captureMode
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r4.sessionConfigCameraCaptureCallbacks
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TakePictureRequest{appExecutor="
            r0.append(r1)
            java.util.concurrent.Executor r1 = r2.appExecutor
            r0.append(r1)
            java.lang.String r1 = ", inMemoryCallback="
            r0.append(r1)
            androidx.camera.core.ImageCapture$OnImageCapturedCallback r1 = r2.inMemoryCallback
            r0.append(r1)
            java.lang.String r1 = ", onDiskCallback="
            r0.append(r1)
            androidx.camera.core.ImageCapture$OnImageSavedCallback r1 = r2.onDiskCallback
            r0.append(r1)
            java.lang.String r1 = ", outputFileOptions="
            r0.append(r1)
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r2.outputFileOptions
            r0.append(r1)
            java.lang.String r1 = ", cropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.cropRect
            r0.append(r1)
            java.lang.String r1 = ", sensorToBufferTransform="
            r0.append(r1)
            android.graphics.Matrix r1 = r2.sensorToBufferTransform
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r2.rotationDegrees
            r0.append(r1)
            java.lang.String r1 = ", jpegQuality="
            r0.append(r1)
            int r1 = r2.jpegQuality
            r0.append(r1)
            java.lang.String r1 = ", captureMode="
            r0.append(r1)
            int r1 = r2.captureMode
            r0.append(r1)
            java.lang.String r1 = ", sessionConfigCameraCaptureCallbacks="
            r0.append(r1)
            java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r2.sessionConfigCameraCaptureCallbacks
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
