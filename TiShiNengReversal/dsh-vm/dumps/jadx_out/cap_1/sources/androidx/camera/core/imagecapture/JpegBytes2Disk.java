package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class JpegBytes2Disk implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final java.lang.String TEMP_FILE_PREFIX = "CameraX";
    private static final java.lang.String TEMP_FILE_SUFFIX = ".tmp";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class In {
        In() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.imagecapture.JpegBytes2Disk.In of(@androidx.annotation.NonNull androidx.camera.core.processing.Packet<byte[]> r1, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r2) {
                androidx.camera.core.imagecapture.AutoValue_JpegBytes2Disk_In r0 = new androidx.camera.core.imagecapture.AutoValue_JpegBytes2Disk_In
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        abstract androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions();

        @androidx.annotation.NonNull
        abstract androidx.camera.core.processing.Packet<byte[]> getPacket();
    }

    JpegBytes2Disk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.net.Uri copyFileToFile(@androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull java.io.File r3) throws androidx.camera.core.ImageCaptureException {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L9
            r3.delete()
        L9:
            boolean r2 = r2.renameTo(r3)
            if (r2 == 0) goto L14
            android.net.Uri r2 = android.net.Uri.fromFile(r3)
            return r2
        L14:
            androidx.camera.core.ImageCaptureException r2 = new androidx.camera.core.ImageCaptureException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to overwrite the file: "
            r0.append(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r1 = 1
            r2.<init>(r1, r3, r0)
            throw r2
    }

    private static android.net.Uri copyFileToMediaStore(@androidx.annotation.NonNull java.io.File r6, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r7) throws androidx.camera.core.ImageCaptureException {
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.util.Objects.requireNonNull(r0)
            android.content.ContentValues r1 = r7.getContentValues()
            if (r1 == 0) goto L17
            android.content.ContentValues r1 = new android.content.ContentValues
            android.content.ContentValues r2 = r7.getContentValues()
            r1.<init>(r2)
            goto L1c
        L17:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
        L1c:
            r2 = 1
            setContentValuePendingFlag(r1, r2)
            r3 = 0
            r4 = 0
            android.net.Uri r7 = r7.getSaveCollection()     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            android.net.Uri r7 = r0.insert(r7, r1)     // Catch: java.lang.Throwable -> L43 java.lang.SecurityException -> L45 java.io.IOException -> L47
            if (r7 == 0) goto L3b
            copyTempFileToUri(r6, r7, r0)     // Catch: java.lang.Throwable -> L33 java.lang.SecurityException -> L36 java.io.IOException -> L39
            updateUriPendingStatus(r7, r0, r3)
            return r7
        L33:
            r6 = move-exception
            r4 = r7
            goto L5f
        L36:
            r6 = move-exception
        L37:
            r4 = r7
            goto L48
        L39:
            r6 = move-exception
            goto L37
        L3b:
            androidx.camera.core.ImageCaptureException r6 = new androidx.camera.core.ImageCaptureException     // Catch: java.lang.Throwable -> L33 java.lang.SecurityException -> L36 java.io.IOException -> L39
            java.lang.String r1 = "Failed to insert a MediaStore URI."
            r6.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L33 java.lang.SecurityException -> L36 java.io.IOException -> L39
            throw r6     // Catch: java.lang.Throwable -> L33 java.lang.SecurityException -> L36 java.io.IOException -> L39
        L43:
            r6 = move-exception
            goto L5f
        L45:
            r6 = move-exception
            goto L48
        L47:
            r6 = move-exception
        L48:
            androidx.camera.core.ImageCaptureException r7 = new androidx.camera.core.ImageCaptureException     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "Failed to write to MediaStore URI: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L43
            r1.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L43
            r7.<init>(r2, r1, r6)     // Catch: java.lang.Throwable -> L43
            throw r7     // Catch: java.lang.Throwable -> L43
        L5f:
            if (r4 == 0) goto L64
            updateUriPendingStatus(r4, r0, r3)
        L64:
            throw r6
    }

    private static void copyFileToOutputStream(@androidx.annotation.NonNull java.io.File r3, @androidx.annotation.NonNull java.io.OutputStream r4) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L14
        L9:
            int r1 = r0.read(r3)     // Catch: java.lang.Throwable -> L14
            if (r1 <= 0) goto L16
            r2 = 0
            r4.write(r3, r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L9
        L14:
            r3 = move-exception
            goto L1a
        L16:
            r0.close()
            return
        L1a:
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r4 = move-exception
            r3.addSuppressed(r4)
        L22:
            throw r3
    }

    private static void copyTempFileToUri(@androidx.annotation.NonNull java.io.File r1, @androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.NonNull android.content.ContentResolver r3) throws java.io.IOException {
            java.io.OutputStream r3 = r3.openOutputStream(r2)
            if (r3 == 0) goto Lf
            copyFileToOutputStream(r1, r3)     // Catch: java.lang.Throwable -> Ld
            r3.close()
            return
        Ld:
            r1 = move-exception
            goto L26
        Lf:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = " cannot be resolved."
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            throw r1     // Catch: java.lang.Throwable -> Ld
        L26:
            if (r3 == 0) goto L30
            r3.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r2 = move-exception
            r1.addSuppressed(r2)
        L30:
            throw r1
    }

    @androidx.annotation.NonNull
    private static java.io.File createTempFile(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r4) throws androidx.camera.core.ImageCaptureException {
            java.io.File r4 = r4.getFile()     // Catch: java.io.IOException -> L37
            java.lang.String r0 = "CameraX"
            if (r4 == 0) goto L30
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L37
            java.lang.String r2 = r4.getParent()     // Catch: java.io.IOException -> L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L37
            r3.<init>()     // Catch: java.io.IOException -> L37
            r3.append(r0)     // Catch: java.io.IOException -> L37
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.io.IOException -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L37
            r3.append(r0)     // Catch: java.io.IOException -> L37
            java.lang.String r4 = getFileExtensionWithDot(r4)     // Catch: java.io.IOException -> L37
            r3.append(r4)     // Catch: java.io.IOException -> L37
            java.lang.String r4 = r3.toString()     // Catch: java.io.IOException -> L37
            r1.<init>(r2, r4)     // Catch: java.io.IOException -> L37
            return r1
        L30:
            java.lang.String r4 = ".tmp"
            java.io.File r4 = java.io.File.createTempFile(r0, r4)     // Catch: java.io.IOException -> L37
            return r4
        L37:
            r4 = move-exception
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
            r1 = 1
            java.lang.String r2 = "Failed to create temp file."
            r0.<init>(r1, r2, r4)
            throw r0
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

    private static boolean isSaveToFile(androidx.camera.core.ImageCapture.OutputFileOptions r0) {
            java.io.File r0 = r0.getFile()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static boolean isSaveToMediaStore(androidx.camera.core.ImageCapture.OutputFileOptions r1) {
            android.net.Uri r0 = r1.getSaveCollection()
            if (r0 == 0) goto L14
            android.content.ContentResolver r0 = r1.getContentResolver()
            if (r0 == 0) goto L14
            android.content.ContentValues r1 = r1.getContentValues()
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    private static boolean isSaveToOutputStream(androidx.camera.core.ImageCapture.OutputFileOptions r0) {
            java.io.OutputStream r0 = r0.getOutputStream()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    static android.net.Uri moveFileToTarget(@androidx.annotation.NonNull java.io.File r3, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r4) throws androidx.camera.core.ImageCaptureException {
            r0 = 0
            boolean r1 = isSaveToMediaStore(r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            if (r1 == 0) goto Le
            android.net.Uri r0 = copyFileToMediaStore(r3, r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            goto L30
        Lc:
            r4 = move-exception
            goto L3d
        Le:
            boolean r1 = isSaveToOutputStream(r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            if (r1 == 0) goto L1f
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            copyFileToOutputStream(r3, r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            goto L30
        L1f:
            boolean r1 = isSaveToFile(r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            if (r1 == 0) goto L30
            java.io.File r4 = r4.getFile()     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
            android.net.Uri r0 = copyFileToFile(r3, r4)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L34
        L30:
            r3.delete()
            return r0
        L34:
            androidx.camera.core.ImageCaptureException r4 = new androidx.camera.core.ImageCaptureException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "Failed to write to OutputStream."
            r2 = 1
            r4.<init>(r2, r1, r0)     // Catch: java.lang.Throwable -> Lc
            throw r4     // Catch: java.lang.Throwable -> Lc
        L3d:
            r3.delete()
            throw r4
    }

    private static void setContentValuePendingFlag(@androidx.annotation.NonNull android.content.ContentValues r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            java.lang.String r0 = "is_pending"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r0, r3)
        Lf:
            return
    }

    private static void updateFileExif(@androidx.annotation.NonNull java.io.File r0, @androidx.annotation.NonNull androidx.camera.core.impl.utils.Exif r1, @androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileOptions r2, int r3) throws androidx.camera.core.ImageCaptureException {
            androidx.camera.core.impl.utils.Exif r0 = androidx.camera.core.impl.utils.Exif.createFromFile(r0)     // Catch: java.io.IOException -> L39
            r1.copyToCroppedImage(r0)     // Catch: java.io.IOException -> L39
            int r1 = r0.getRotation()     // Catch: java.io.IOException -> L39
            if (r1 != 0) goto L12
            if (r3 == 0) goto L12
            r0.rotate(r3)     // Catch: java.io.IOException -> L39
        L12:
            androidx.camera.core.ImageCapture$Metadata r1 = r2.getMetadata()     // Catch: java.io.IOException -> L39
            boolean r2 = r1.isReversedHorizontal()     // Catch: java.io.IOException -> L39
            if (r2 == 0) goto L1f
            r0.flipHorizontally()     // Catch: java.io.IOException -> L39
        L1f:
            boolean r2 = r1.isReversedVertical()     // Catch: java.io.IOException -> L39
            if (r2 == 0) goto L28
            r0.flipVertically()     // Catch: java.io.IOException -> L39
        L28:
            android.location.Location r2 = r1.getLocation()     // Catch: java.io.IOException -> L39
            if (r2 == 0) goto L35
            android.location.Location r1 = r1.getLocation()     // Catch: java.io.IOException -> L39
            r0.attachLocation(r1)     // Catch: java.io.IOException -> L39
        L35:
            r0.save()     // Catch: java.io.IOException -> L39
            return
        L39:
            r0 = move-exception
            androidx.camera.core.ImageCaptureException r1 = new androidx.camera.core.ImageCaptureException
            r2 = 1
            java.lang.String r3 = "Failed to update Exif data"
            r1.<init>(r2, r3, r0)
            throw r1
    }

    private static void updateUriPendingStatus(@androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.NonNull android.content.ContentResolver r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            setContentValuePendingFlag(r0, r4)
            r4 = 0
            r3.update(r2, r0, r4, r4)
        L12:
            return
    }

    private static void writeBytesToFile(@androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull byte[] r3) throws androidx.camera.core.ImageCaptureException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L20
            r0.<init>(r2)     // Catch: java.io.IOException -> L20
            androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser r2 = new androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            int r2 = r2.getValidDataLength(r3)     // Catch: java.lang.Throwable -> L16
            r1 = 0
            r0.write(r3, r1, r2)     // Catch: java.lang.Throwable -> L16
            r0.close()     // Catch: java.io.IOException -> L20
            return
        L16:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L20
        L1f:
            throw r2     // Catch: java.io.IOException -> L20
        L20:
            r2 = move-exception
            androidx.camera.core.ImageCaptureException r3 = new androidx.camera.core.ImageCaptureException
            r0 = 1
            java.lang.String r1 = "Failed to write to temp file"
            r3.<init>(r0, r1, r2)
            throw r3
    }

    @androidx.annotation.NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public androidx.camera.core.ImageCapture.OutputFileResults apply2(@androidx.annotation.NonNull androidx.camera.core.imagecapture.JpegBytes2Disk.In r4) throws androidx.camera.core.ImageCaptureException {
            r3 = this;
            androidx.camera.core.processing.Packet r0 = r4.getPacket()
            androidx.camera.core.ImageCapture$OutputFileOptions r4 = r4.getOutputFileOptions()
            java.io.File r1 = createTempFile(r4)
            java.lang.Object r2 = r0.getData()
            byte[] r2 = (byte[]) r2
            writeBytesToFile(r1, r2)
            androidx.camera.core.impl.utils.Exif r2 = r0.getExif()
            java.util.Objects.requireNonNull(r2)
            int r0 = r0.getRotationDegrees()
            updateFileExif(r1, r2, r4, r0)
            android.net.Uri r4 = moveFileToTarget(r1, r4)
            androidx.camera.core.ImageCapture$OutputFileResults r0 = new androidx.camera.core.ImageCapture$OutputFileResults
            r0.<init>(r4)
            return r0
    }

    @Override // androidx.camera.core.processing.Operation
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.ImageCapture.OutputFileResults apply(@androidx.annotation.NonNull androidx.camera.core.imagecapture.JpegBytes2Disk.In r1) throws androidx.camera.core.ImageCaptureException {
            r0 = this;
            androidx.camera.core.imagecapture.JpegBytes2Disk$In r1 = (androidx.camera.core.imagecapture.JpegBytes2Disk.In) r1
            androidx.camera.core.ImageCapture$OutputFileResults r1 = r0.apply2(r1)
            return r1
    }
}
