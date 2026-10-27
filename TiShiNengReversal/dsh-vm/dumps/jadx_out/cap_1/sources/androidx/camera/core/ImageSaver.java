package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageSaver implements java.lang.Runnable {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final java.lang.String TAG = "ImageSaver";
    private static final java.lang.String TEMP_FILE_PREFIX = "CameraX";
    private static final java.lang.String TEMP_FILE_SUFFIX = ".tmp";

    @androidx.annotation.NonNull
    private final androidx.camera.core.ImageSaver.OnImageSavedCallback mCallback;
    private final androidx.camera.core.ImageProxy mImage;
    private final int mJpegQuality;
    private final int mOrientation;

    @androidx.annotation.NonNull
    private final androidx.camera.core.ImageCapture.OutputFileOptions mOutputFileOptions;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mSequentialIoExecutor;

    @androidx.annotation.NonNull
    private final java.util.concurrent.Executor mUserCallbackExecutor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.core.ImageSaver$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType = null;

        static {
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType[] r0 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.core.ImageSaver.AnonymousClass1.$SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType = r0
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.core.ImageSaver.AnonymousClass1.$SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.core.ImageSaver.AnonymousClass1.$SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnImageSavedCallback {
        void onError(@androidx.annotation.NonNull androidx.camera.core.ImageSaver.SaveError r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.Throwable r3);

        void onImageSaved(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileResults r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SaveError extends java.lang.Enum<androidx.camera.core.ImageSaver.SaveError> {
        private static final /* synthetic */ androidx.camera.core.ImageSaver.SaveError[] $VALUES = null;
        public static final androidx.camera.core.ImageSaver.SaveError CROP_FAILED = null;
        public static final androidx.camera.core.ImageSaver.SaveError ENCODE_FAILED = null;
        public static final androidx.camera.core.ImageSaver.SaveError FILE_IO_FAILED = null;
        public static final androidx.camera.core.ImageSaver.SaveError UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.ImageSaver.SaveError[] $values() {
                r0 = 4
                androidx.camera.core.ImageSaver$SaveError[] r0 = new androidx.camera.core.ImageSaver.SaveError[r0]
                androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.ENCODE_FAILED
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.CROP_FAILED
                r2 = 2
                r0[r2] = r1
                androidx.camera.core.ImageSaver$SaveError r1 = androidx.camera.core.ImageSaver.SaveError.UNKNOWN
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.ImageSaver$SaveError r0 = new androidx.camera.core.ImageSaver$SaveError
                java.lang.String r1 = "FILE_IO_FAILED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED = r0
                androidx.camera.core.ImageSaver$SaveError r0 = new androidx.camera.core.ImageSaver$SaveError
                java.lang.String r1 = "ENCODE_FAILED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.ImageSaver.SaveError.ENCODE_FAILED = r0
                androidx.camera.core.ImageSaver$SaveError r0 = new androidx.camera.core.ImageSaver$SaveError
                java.lang.String r1 = "CROP_FAILED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.ImageSaver.SaveError.CROP_FAILED = r0
                androidx.camera.core.ImageSaver$SaveError r0 = new androidx.camera.core.ImageSaver$SaveError
                java.lang.String r1 = "UNKNOWN"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.core.ImageSaver.SaveError.UNKNOWN = r0
                androidx.camera.core.ImageSaver$SaveError[] r0 = $values()
                androidx.camera.core.ImageSaver.SaveError.$VALUES = r0
                return
        }

        SaveError(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.ImageSaver.SaveError valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.ImageSaver$SaveError> r0 = androidx.camera.core.ImageSaver.SaveError.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.ImageSaver$SaveError r1 = (androidx.camera.core.ImageSaver.SaveError) r1
                return r1
        }

        public static androidx.camera.core.ImageSaver.SaveError[] values() {
                androidx.camera.core.ImageSaver$SaveError[] r0 = androidx.camera.core.ImageSaver.SaveError.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.ImageSaver$SaveError[] r0 = (androidx.camera.core.ImageSaver.SaveError[]) r0
                return r0
        }
    }

    ImageSaver(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r2, int r3, @androidx.annotation.IntRange(from = 1, to = 100) int r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5, @androidx.annotation.NonNull java.util.concurrent.Executor r6, @androidx.annotation.NonNull androidx.camera.core.ImageSaver.OnImageSavedCallback r7) {
            r0 = this;
            r0.<init>()
            r0.mImage = r1
            r0.mOutputFileOptions = r2
            r0.mOrientation = r3
            r0.mJpegQuality = r4
            r0.mCallback = r7
            r0.mUserCallbackExecutor = r5
            r0.mSequentialIoExecutor = r6
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.ImageSaver r0, java.io.File r1) {
            r0.copyTempFileToDestination(r1)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.ImageSaver r0, androidx.camera.core.ImageSaver.SaveError r1, java.lang.String r2, java.lang.Throwable r3) {
            androidx.camera.core.ImageSaver$OnImageSavedCallback r0 = r0.mCallback
            r0.onError(r1, r2, r3)
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.ImageSaver r1, android.net.Uri r2) {
            androidx.camera.core.ImageSaver$OnImageSavedCallback r1 = r1.mCallback
            androidx.camera.core.ImageCapture$OutputFileResults r0 = new androidx.camera.core.ImageCapture$OutputFileResults
            r0.<init>(r2)
            r1.onImageSaved(r0)
            return
    }

    private void copyTempFileToOutputStream(@androidx.annotation.NonNull java.io.File r4, @androidx.annotation.NonNull java.io.OutputStream r5) throws java.io.IOException {
            r3 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L14
        L9:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L14
            if (r1 <= 0) goto L16
            r2 = 0
            r5.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L9
        L14:
            r4 = move-exception
            goto L1a
        L16:
            r0.close()
            return
        L1a:
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r5 = move-exception
            r4.addSuppressed(r5)
        L22:
            throw r4
    }

    private boolean copyTempFileToUri(@androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull android.net.Uri r3) throws java.io.IOException {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.mOutputFileOptions
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.OutputStream r3 = r0.openOutputStream(r3)
            if (r3 != 0) goto L13
            r2 = 0
            if (r3 == 0) goto L12
            r3.close()
        L12:
            return r2
        L13:
            r1.copyTempFileToOutputStream(r2, r3)     // Catch: java.lang.Throwable -> L1b
            r3.close()
            r2 = 1
            return r2
        L1b:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r3 = move-exception
            r2.addSuppressed(r3)
        L24:
            throw r2
    }

    private static java.lang.String getFileExtensionWithDot(java.io.File r1) {
            java.lang.String r1 = r1.getName()
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L11
            java.lang.String r1 = r1.substring(r0)
            return r1
        L11:
            java.lang.String r1 = ""
            return r1
    }

    @androidx.annotation.NonNull
    private byte[] imageToJpegByteArray(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r5, @androidx.annotation.IntRange(from = 1, to = 100) int r6) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
            r4 = this;
            boolean r0 = androidx.camera.core.internal.utils.ImageUtil.shouldCropImage(r5)
            int r1 = r5.getFormat()
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != r2) goto L1c
            if (r0 != 0) goto L13
            byte[] r5 = androidx.camera.core.internal.utils.ImageUtil.jpegImageToJpegByteArray(r5)
            return r5
        L13:
            android.graphics.Rect r0 = r5.getCropRect()
            byte[] r5 = androidx.camera.core.internal.utils.ImageUtil.jpegImageToJpegByteArray(r5, r0, r6)
            return r5
        L1c:
            r2 = 35
            r3 = 0
            if (r1 != r2) goto L2d
            if (r0 == 0) goto L27
            android.graphics.Rect r3 = r5.getCropRect()
        L27:
            r0 = 0
            byte[] r5 = androidx.camera.core.internal.utils.ImageUtil.yuvImageToJpegByteArray(r5, r3, r6, r0)
            return r5
        L2d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unrecognized image format: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ImageSaver"
            androidx.camera.core.Logger.w(r6, r5)
            return r3
    }

    private boolean isSaveToFile() {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.mOutputFileOptions
            java.io.File r0 = r0.getFile()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private boolean isSaveToMediaStore() {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.mOutputFileOptions
            android.net.Uri r0 = r0.getSaveCollection()
            if (r0 == 0) goto L1a
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.mOutputFileOptions
            android.content.ContentResolver r0 = r0.getContentResolver()
            if (r0 == 0) goto L1a
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.mOutputFileOptions
            android.content.ContentValues r0 = r0.getContentValues()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    private boolean isSaveToOutputStream() {
            r1 = this;
            androidx.camera.core.ImageCapture$OutputFileOptions r0 = r1.mOutputFileOptions
            java.io.OutputStream r0 = r0.getOutputStream()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private void postError(androidx.camera.core.ImageSaver.SaveError r3, java.lang.String r4, @androidx.annotation.Nullable java.lang.Throwable r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mUserCallbackExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            androidx.camera.core.g0 r1 = new androidx.camera.core.g0     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r1.<init>(r2, r3, r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            return
        Lb:
            java.lang.String r3 = "ImageSaver"
            java.lang.String r4 = "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping."
            androidx.camera.core.Logger.e(r3, r4)
            return
    }

    private void postSuccess(@androidx.annotation.Nullable android.net.Uri r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mUserCallbackExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            androidx.camera.core.i0 r1 = new androidx.camera.core.i0     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r1.<init>(r2, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            return
        Lb:
            java.lang.String r3 = "ImageSaver"
            java.lang.String r0 = "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping."
            androidx.camera.core.Logger.e(r3, r0)
            return
    }

    @androidx.annotation.Nullable
    private java.io.File saveImageToTempFile() {
            r7 = this;
            r0 = 0
            boolean r1 = r7.isSaveToFile()     // Catch: java.io.IOException -> L3d
            java.lang.String r2 = "CameraX"
            if (r1 == 0) goto L40
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L3d
            androidx.camera.core.ImageCapture$OutputFileOptions r3 = r7.mOutputFileOptions     // Catch: java.io.IOException -> L3d
            java.io.File r3 = r3.getFile()     // Catch: java.io.IOException -> L3d
            java.lang.String r3 = r3.getParent()     // Catch: java.io.IOException -> L3d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3d
            r4.<init>()     // Catch: java.io.IOException -> L3d
            r4.append(r2)     // Catch: java.io.IOException -> L3d
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.io.IOException -> L3d
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L3d
            r4.append(r2)     // Catch: java.io.IOException -> L3d
            androidx.camera.core.ImageCapture$OutputFileOptions r2 = r7.mOutputFileOptions     // Catch: java.io.IOException -> L3d
            java.io.File r2 = r2.getFile()     // Catch: java.io.IOException -> L3d
            java.lang.String r2 = getFileExtensionWithDot(r2)     // Catch: java.io.IOException -> L3d
            r4.append(r2)     // Catch: java.io.IOException -> L3d
            java.lang.String r2 = r4.toString()     // Catch: java.io.IOException -> L3d
            r1.<init>(r3, r2)     // Catch: java.io.IOException -> L3d
            goto L46
        L3d:
            r1 = move-exception
            goto L107
        L40:
            java.lang.String r1 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r2, r1)     // Catch: java.io.IOException -> L3d
        L46:
            androidx.camera.core.ImageProxy r2 = r7.mImage     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> Lb1 java.lang.IllegalArgumentException -> Lb3 java.io.IOException -> Lb5 java.lang.OutOfMemoryError -> Lb7
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lbd
            androidx.camera.core.ImageProxy r4 = r7.mImage     // Catch: java.lang.Throwable -> L78
            int r5 = r7.mJpegQuality     // Catch: java.lang.Throwable -> L78
            byte[] r4 = r7.imageToJpegByteArray(r4, r5)     // Catch: java.lang.Throwable -> L78
            r3.write(r4)     // Catch: java.lang.Throwable -> L78
            androidx.camera.core.impl.utils.Exif r4 = androidx.camera.core.impl.utils.Exif.createFromFile(r1)     // Catch: java.lang.Throwable -> L78
            androidx.camera.core.ImageProxy r5 = r7.mImage     // Catch: java.lang.Throwable -> L78
            androidx.camera.core.impl.utils.Exif r5 = androidx.camera.core.impl.utils.Exif.createFromImageProxy(r5)     // Catch: java.lang.Throwable -> L78
            r5.copyToCroppedImage(r4)     // Catch: java.lang.Throwable -> L78
            androidx.camera.core.internal.compat.workaround.ExifRotationAvailability r5 = new androidx.camera.core.internal.compat.workaround.ExifRotationAvailability     // Catch: java.lang.Throwable -> L78
            r5.<init>()     // Catch: java.lang.Throwable -> L78
            androidx.camera.core.ImageProxy r6 = r7.mImage     // Catch: java.lang.Throwable -> L78
            boolean r5 = r5.shouldUseExifOrientation(r6)     // Catch: java.lang.Throwable -> L78
            if (r5 != 0) goto L7a
            int r5 = r7.mOrientation     // Catch: java.lang.Throwable -> L78
            r4.rotate(r5)     // Catch: java.lang.Throwable -> L78
            goto L7a
        L78:
            r4 = move-exception
            goto Lbf
        L7a:
            androidx.camera.core.ImageCapture$OutputFileOptions r5 = r7.mOutputFileOptions     // Catch: java.lang.Throwable -> L78
            androidx.camera.core.ImageCapture$Metadata r5 = r5.getMetadata()     // Catch: java.lang.Throwable -> L78
            boolean r6 = r5.isReversedHorizontal()     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L89
            r4.flipHorizontally()     // Catch: java.lang.Throwable -> L78
        L89:
            boolean r6 = r5.isReversedVertical()     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L92
            r4.flipVertically()     // Catch: java.lang.Throwable -> L78
        L92:
            android.location.Location r5 = r5.getLocation()     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto La5
            androidx.camera.core.ImageCapture$OutputFileOptions r5 = r7.mOutputFileOptions     // Catch: java.lang.Throwable -> L78
            androidx.camera.core.ImageCapture$Metadata r5 = r5.getMetadata()     // Catch: java.lang.Throwable -> L78
            android.location.Location r5 = r5.getLocation()     // Catch: java.lang.Throwable -> L78
            r4.attachLocation(r5)     // Catch: java.lang.Throwable -> L78
        La5:
            r4.save()     // Catch: java.lang.Throwable -> L78
            r3.close()     // Catch: java.lang.Throwable -> Lbd
            if (r2 == 0) goto Lb9
            r2.close()     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> Lb1 java.lang.IllegalArgumentException -> Lb3 java.io.IOException -> Lb5 java.lang.OutOfMemoryError -> Lb7
            goto Lb9
        Lb1:
            r2 = move-exception
            goto Ld3
        Lb3:
            r2 = move-exception
            goto Lf4
        Lb5:
            r2 = move-exception
            goto Lf4
        Lb7:
            r2 = move-exception
            goto Lf9
        Lb9:
            r2 = r0
            r3 = r2
            r4 = r3
            goto Lfd
        Lbd:
            r3 = move-exception
            goto Lc8
        Lbf:
            r3.close()     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc3:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> Lbd
        Lc7:
            throw r4     // Catch: java.lang.Throwable -> Lbd
        Lc8:
            if (r2 == 0) goto Ld2
            r2.close()     // Catch: java.lang.Throwable -> Lce
            goto Ld2
        Lce:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> Lb1 java.lang.IllegalArgumentException -> Lb3 java.io.IOException -> Lb5 java.lang.OutOfMemoryError -> Lb7
        Ld2:
            throw r3     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> Lb1 java.lang.IllegalArgumentException -> Lb3 java.io.IOException -> Lb5 java.lang.OutOfMemoryError -> Lb7
        Ld3:
            int[] r3 = androidx.camera.core.ImageSaver.AnonymousClass1.$SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r4 = r2.getFailureType()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto Lef
            r4 = 2
            if (r3 == r4) goto Lea
            androidx.camera.core.ImageSaver$SaveError r3 = androidx.camera.core.ImageSaver.SaveError.UNKNOWN
            java.lang.String r4 = "Failed to transcode mImage"
            goto Lfd
        Lea:
            androidx.camera.core.ImageSaver$SaveError r3 = androidx.camera.core.ImageSaver.SaveError.CROP_FAILED
            java.lang.String r4 = "Failed to crop mImage"
            goto Lfd
        Lef:
            androidx.camera.core.ImageSaver$SaveError r3 = androidx.camera.core.ImageSaver.SaveError.ENCODE_FAILED
            java.lang.String r4 = "Failed to encode mImage"
            goto Lfd
        Lf4:
            androidx.camera.core.ImageSaver$SaveError r3 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED
            java.lang.String r4 = "Failed to write temp file"
            goto Lfd
        Lf9:
            androidx.camera.core.ImageSaver$SaveError r3 = androidx.camera.core.ImageSaver.SaveError.UNKNOWN
            java.lang.String r4 = "Processing failed due to low memory."
        Lfd:
            if (r3 == 0) goto L106
            r7.postError(r3, r4, r2)
            r1.delete()
            return r0
        L106:
            return r1
        L107:
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED
            java.lang.String r3 = "Failed to create temp file"
            r7.postError(r2, r3, r1)
            return r0
    }

    private void setContentValuePending(@androidx.annotation.NonNull android.content.ContentValues r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            java.lang.String r0 = "is_pending"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r0, r4)
        Lf:
            return
    }

    private void setUriNotPending(@androidx.annotation.NonNull android.net.Uri r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L19
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 0
            r3.setContentValuePending(r0, r1)
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r3.mOutputFileOptions
            android.content.ContentResolver r1 = r1.getContentResolver()
            r2 = 0
            r1.update(r4, r0, r2, r2)
        L19:
            return
    }

    void copyTempFileToDestination(@androidx.annotation.NonNull java.io.File r6) {
            r5 = this;
            androidx.core.util.Preconditions.checkNotNull(r6)
            r0 = 0
            boolean r1 = r5.isSaveToMediaStore()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            if (r1 == 0) goto L62
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r5.mOutputFileOptions     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            android.content.ContentValues r1 = r1.getContentValues()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            if (r1 == 0) goto L2b
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            androidx.camera.core.ImageCapture$OutputFileOptions r2 = r5.mOutputFileOptions     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            android.content.ContentValues r2 = r2.getContentValues()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            goto L30
        L1e:
            r0 = move-exception
            goto Laf
        L21:
            r1 = move-exception
        L22:
            r4 = r1
            r1 = r0
            r0 = r4
            goto La0
        L27:
            r1 = move-exception
            goto L22
        L29:
            r1 = move-exception
            goto L22
        L2b:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
        L30:
            r2 = 1
            r5.setContentValuePending(r1, r2)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            androidx.camera.core.ImageCapture$OutputFileOptions r2 = r5.mOutputFileOptions     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            androidx.camera.core.ImageCapture$OutputFileOptions r3 = r5.mOutputFileOptions     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            android.net.Uri r3 = r3.getSaveCollection()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            android.net.Uri r1 = r2.insert(r3, r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            if (r1 != 0) goto L51
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L4b java.lang.IllegalArgumentException -> L4d java.io.IOException -> L4f
            java.lang.String r3 = "Failed to insert URI."
            goto L9c
        L4b:
            r0 = move-exception
            goto La0
        L4d:
            r0 = move-exception
            goto La0
        L4f:
            r0 = move-exception
            goto La0
        L51:
            boolean r2 = r5.copyTempFileToUri(r6, r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L4b java.lang.IllegalArgumentException -> L4d java.io.IOException -> L4f
            if (r2 != 0) goto L5c
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L4b java.lang.IllegalArgumentException -> L4d java.io.IOException -> L4f
            java.lang.String r3 = "Failed to save to URI."
            goto L5e
        L5c:
            r2 = r0
            r3 = r2
        L5e:
            r5.setUriNotPending(r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L4b java.lang.IllegalArgumentException -> L4d java.io.IOException -> L4f
            goto L9c
        L62:
            boolean r1 = r5.isSaveToOutputStream()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            if (r1 == 0) goto L72
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r5.mOutputFileOptions     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            java.io.OutputStream r1 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            r5.copyTempFileToOutputStream(r6, r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            goto L99
        L72:
            boolean r1 = r5.isSaveToFile()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            if (r1 == 0) goto L99
            androidx.camera.core.ImageCapture$OutputFileOptions r1 = r5.mOutputFileOptions     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            java.io.File r1 = r1.getFile()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            if (r2 == 0) goto L87
            r1.delete()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
        L87:
            boolean r2 = r6.renameTo(r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            if (r2 != 0) goto L92
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            java.lang.String r3 = "Failed to rename file."
            goto L94
        L92:
            r2 = r0
            r3 = r2
        L94:
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L21 java.lang.IllegalArgumentException -> L27 java.io.IOException -> L29
            goto L9c
        L99:
            r1 = r0
            r2 = r1
            r3 = r2
        L9c:
            r6.delete()
            goto La5
        La0:
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "Failed to write destination file."
            goto L9c
        La5:
            if (r2 == 0) goto Lab
            r5.postError(r2, r3, r0)
            goto Lae
        Lab:
            r5.postSuccess(r1)
        Lae:
            return
        Laf:
            r6.delete()
            throw r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            java.io.File r0 = r3.saveImageToTempFile()
            if (r0 == 0) goto L10
            java.util.concurrent.Executor r1 = r3.mSequentialIoExecutor
            androidx.camera.core.h0 r2 = new androidx.camera.core.h0
            r2.<init>(r3, r0)
            r1.execute(r2)
        L10:
            return
    }
}
