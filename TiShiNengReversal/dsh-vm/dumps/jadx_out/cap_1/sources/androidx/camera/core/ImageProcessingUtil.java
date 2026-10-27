package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageProcessingUtil {
    private static final java.lang.String TAG = "ImageProcessingUtil";
    private static int sImageCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Result extends java.lang.Enum<androidx.camera.core.ImageProcessingUtil.Result> {
        private static final /* synthetic */ androidx.camera.core.ImageProcessingUtil.Result[] $VALUES = null;
        public static final androidx.camera.core.ImageProcessingUtil.Result ERROR_CONVERSION = null;
        public static final androidx.camera.core.ImageProcessingUtil.Result SUCCESS = null;
        public static final androidx.camera.core.ImageProcessingUtil.Result UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.ImageProcessingUtil.Result[] $values() {
                r0 = 3
                androidx.camera.core.ImageProcessingUtil$Result[] r0 = new androidx.camera.core.ImageProcessingUtil.Result[r0]
                androidx.camera.core.ImageProcessingUtil$Result r1 = androidx.camera.core.ImageProcessingUtil.Result.UNKNOWN
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.ImageProcessingUtil$Result r1 = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS
                r2 = 1
                r0[r2] = r1
                androidx.camera.core.ImageProcessingUtil$Result r1 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.ImageProcessingUtil$Result r0 = new androidx.camera.core.ImageProcessingUtil$Result
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProcessingUtil.Result.UNKNOWN = r0
                androidx.camera.core.ImageProcessingUtil$Result r0 = new androidx.camera.core.ImageProcessingUtil$Result
                java.lang.String r1 = "SUCCESS"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProcessingUtil.Result.SUCCESS = r0
                androidx.camera.core.ImageProcessingUtil$Result r0 = new androidx.camera.core.ImageProcessingUtil$Result
                java.lang.String r1 = "ERROR_CONVERSION"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION = r0
                androidx.camera.core.ImageProcessingUtil$Result[] r0 = $values()
                androidx.camera.core.ImageProcessingUtil.Result.$VALUES = r0
                return
        }

        Result(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.ImageProcessingUtil.Result valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.ImageProcessingUtil$Result> r0 = androidx.camera.core.ImageProcessingUtil.Result.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.ImageProcessingUtil$Result r1 = (androidx.camera.core.ImageProcessingUtil.Result) r1
                return r1
        }

        public static androidx.camera.core.ImageProcessingUtil.Result[] values() {
                androidx.camera.core.ImageProcessingUtil$Result[] r0 = androidx.camera.core.ImageProcessingUtil.Result.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.ImageProcessingUtil$Result[] r0 = (androidx.camera.core.ImageProcessingUtil.Result[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "image_processing_util_jni"
            java.lang.System.loadLibrary(r0)
            return
    }

    private ImageProcessingUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.ImageProxy r0, androidx.camera.core.ImageProxy r1, androidx.camera.core.ImageProxy r2) {
            if (r0 == 0) goto L7
            if (r1 == 0) goto L7
            r1.close()
        L7:
            return
    }

    public static boolean applyPixelShiftForYUV(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            boolean r0 = isSupportedYUVFormat(r3)
            r1 = 0
            java.lang.String r2 = "ImageProcessingUtil"
            if (r0 != 0) goto Lf
            java.lang.String r3 = "Unsupported format for YUV to RGB"
            androidx.camera.core.Logger.e(r2, r3)
            return r1
        Lf:
            androidx.camera.core.ImageProcessingUtil$Result r3 = applyPixelShiftInternal(r3)
            androidx.camera.core.ImageProcessingUtil$Result r0 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            if (r3 != r0) goto L1d
            java.lang.String r3 = "One pixel shift for YUV failure"
            androidx.camera.core.Logger.e(r2, r3)
            return r1
        L1d:
            r3 = 1
            return r3
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.ImageProcessingUtil.Result applyPixelShiftInternal(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r13) {
            int r8 = r13.getWidth()
            int r9 = r13.getHeight()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r13.getPlanes()
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r2 = r13.getPlanes()
            r3 = 1
            r2 = r2[r3]
            int r2 = r2.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r4 = r13.getPlanes()
            r5 = 2
            r4 = r4[r5]
            int r4 = r4.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r6 = r13.getPlanes()
            r6 = r6[r1]
            int r6 = r6.getPixelStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r7 = r13.getPlanes()
            r7 = r7[r3]
            int r7 = r7.getPixelStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r10 = r13.getPlanes()
            r1 = r10[r1]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r10 = r13.getPlanes()
            r3 = r10[r3]
            java.nio.ByteBuffer r3 = r3.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r13 = r13.getPlanes()
            r13 = r13[r5]
            java.nio.ByteBuffer r13 = r13.getBuffer()
            r10 = r6
            r11 = r7
            r12 = r7
            r5 = r1
            r1 = r0
            r0 = r5
            r5 = r3
            r3 = r2
            r2 = r5
            r5 = r4
            r4 = r13
            int r13 = nativeShiftPixel(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 == 0) goto L6f
            androidx.camera.core.ImageProcessingUtil$Result r13 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            return r13
        L6f:
            androidx.camera.core.ImageProcessingUtil$Result r13 = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS
            return r13
    }

    public static /* synthetic */ void b(androidx.camera.core.ImageProxy r0, androidx.camera.core.ImageProxy r1, androidx.camera.core.ImageProxy r2) {
            if (r0 == 0) goto L7
            if (r1 == 0) goto L7
            r1.close()
        L7:
            return
    }

    @androidx.annotation.Nullable
    public static androidx.camera.core.ImageProxy convertJpegBytesToImage(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r2, @androidx.annotation.NonNull byte[] r3) {
            int r0 = r2.getImageFormat()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            androidx.core.util.Preconditions.checkArgument(r0)
            androidx.core.util.Preconditions.checkNotNull(r3)
            android.view.Surface r0 = r2.getSurface()
            androidx.core.util.Preconditions.checkNotNull(r0)
            int r3 = nativeWriteJpegToSurface(r3, r0)
            java.lang.String r0 = "ImageProcessingUtil"
            if (r3 == 0) goto L27
            java.lang.String r2 = "Failed to enqueue JPEG image."
            androidx.camera.core.Logger.e(r0, r2)
            r2 = 0
            return r2
        L27:
            androidx.camera.core.ImageProxy r2 = r2.acquireLatestImage()
            if (r2 != 0) goto L32
            java.lang.String r3 = "Failed to get acquire JPEG image."
            androidx.camera.core.Logger.e(r0, r3)
        L32:
            return r2
    }

    @androidx.annotation.NonNull
    public static android.graphics.Bitmap convertYUVToBitmap(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r14) {
            int r0 = r14.getFormat()
            r1 = 35
            if (r0 != r1) goto L86
            int r12 = r14.getWidth()
            int r13 = r14.getHeight()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r14.getPlanes()
            r1 = 0
            r0 = r0[r1]
            int r3 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r14.getPlanes()
            r2 = 1
            r0 = r0[r2]
            int r5 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r14.getPlanes()
            r4 = 2
            r0 = r0[r4]
            int r7 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r14.getPlanes()
            r0 = r0[r1]
            int r8 = r0.getPixelStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r14.getPlanes()
            r0 = r0[r2]
            int r9 = r0.getPixelStride()
            int r0 = r14.getWidth()
            int r6 = r14.getHeight()
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r0, r6, r10)
            int r11 = r10.getRowBytes()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r14.getPlanes()
            r0 = r0[r1]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r14.getPlanes()
            r1 = r1[r2]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r14 = r14.getPlanes()
            r14 = r14[r4]
            java.nio.ByteBuffer r6 = r14.getBuffer()
            r2 = r0
            r4 = r1
            int r14 = nativeConvertAndroid420ToBitmap(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r14 != 0) goto L7e
            return r10
        L7e:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "YUV to RGB conversion failed"
            r14.<init>(r0)
            throw r14
        L86:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Input image format must be YUV_420_888"
            r14.<init>(r0)
            throw r14
    }

    @androidx.annotation.Nullable
    public static androidx.camera.core.ImageProxy convertYUVToRGB(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r5, @androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r6, @androidx.annotation.Nullable java.nio.ByteBuffer r7, @androidx.annotation.IntRange(from = 0, to = 359) int r8, boolean r9) {
            boolean r0 = isSupportedYUVFormat(r5)
            r1 = 0
            java.lang.String r2 = "ImageProcessingUtil"
            if (r0 != 0) goto Lf
            java.lang.String r5 = "Unsupported format for YUV to RGB"
            androidx.camera.core.Logger.e(r2, r5)
            return r1
        Lf:
            long r3 = java.lang.System.currentTimeMillis()
            boolean r0 = isSupportedRotationDegrees(r8)
            if (r0 != 0) goto L1f
            java.lang.String r5 = "Unsupported rotation degrees for rotate RGB"
            androidx.camera.core.Logger.e(r2, r5)
            return r1
        L1f:
            android.view.Surface r0 = r6.getSurface()
            androidx.camera.core.ImageProcessingUtil$Result r7 = convertYUVToRGBInternal(r5, r0, r7, r8, r9)
            androidx.camera.core.ImageProcessingUtil$Result r8 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            if (r7 != r8) goto L31
            java.lang.String r5 = "YUV to RGB conversion failure"
            androidx.camera.core.Logger.e(r2, r5)
            return r1
        L31:
            java.lang.String r7 = "MH"
            r8 = 3
            boolean r7 = android.util.Log.isLoggable(r7, r8)
            if (r7 == 0) goto L62
            java.util.Locale r7 = java.util.Locale.US
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r9 = androidx.camera.core.ImageProcessingUtil.sImageCount
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r8
            r8 = 1
            r0[r8] = r9
            java.lang.String r9 = "Image processing performance profiling, duration: [%d], image count: %d"
            java.lang.String r7 = java.lang.String.format(r7, r9, r0)
            androidx.camera.core.Logger.d(r2, r7)
            int r7 = androidx.camera.core.ImageProcessingUtil.sImageCount
            int r7 = r7 + r8
            androidx.camera.core.ImageProcessingUtil.sImageCount = r7
        L62:
            androidx.camera.core.ImageProxy r6 = r6.acquireLatestImage()
            if (r6 != 0) goto L6e
            java.lang.String r5 = "YUV to RGB acquireLatestImage failure"
            androidx.camera.core.Logger.e(r2, r5)
            return r1
        L6e:
            androidx.camera.core.SingleCloseImageProxy r7 = new androidx.camera.core.SingleCloseImageProxy
            r7.<init>(r6)
            androidx.camera.core.d0 r8 = new androidx.camera.core.d0
            r8.<init>(r6, r5)
            r7.addOnImageCloseListener(r8)
            return r7
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.ImageProcessingUtil.Result convertYUVToRGBInternal(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r17, @androidx.annotation.NonNull android.view.Surface r18, @androidx.annotation.Nullable java.nio.ByteBuffer r19, int r20, boolean r21) {
            int r11 = r17.getWidth()
            int r12 = r17.getHeight()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r1 = 0
            r0 = r0[r1]
            int r2 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r3 = 1
            r0 = r0[r3]
            int r4 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r5 = 2
            r0 = r0[r5]
            int r6 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r0 = r0[r1]
            int r7 = r0.getPixelStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r0 = r0[r3]
            int r8 = r0.getPixelStride()
            if (r21 == 0) goto L41
            r13 = r7
            goto L42
        L41:
            r13 = 0
        L42:
            if (r21 == 0) goto L46
            r14 = r8
            goto L47
        L46:
            r14 = 0
        L47:
            if (r21 == 0) goto L4b
            r15 = r8
            goto L4c
        L4b:
            r15 = 0
        L4c:
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r0 = r0[r1]
            java.nio.ByteBuffer r1 = r0.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r0 = r0[r3]
            java.nio.ByteBuffer r3 = r0.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r17.getPlanes()
            r0 = r0[r5]
            java.nio.ByteBuffer r5 = r0.getBuffer()
            r9 = r18
            r10 = r19
            r16 = r20
            int r0 = nativeConvertAndroid420ToABGR(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L79
            androidx.camera.core.ImageProcessingUtil$Result r0 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            return r0
        L79:
            androidx.camera.core.ImageProcessingUtil$Result r0 = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS
            return r0
    }

    public static boolean convertYuvToJpegBytesIntoSurface(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1, @androidx.annotation.IntRange(from = 1, to = 100) int r2, int r3, @androidx.annotation.NonNull android.view.Surface r4) {
            r0 = 0
            byte[] r1 = androidx.camera.core.internal.utils.ImageUtil.yuvImageToJpegByteArray(r1, r0, r2, r3)     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> La
            boolean r1 = writeJpegBytesToSurface(r4, r1)     // Catch: androidx.camera.core.internal.utils.ImageUtil.CodecFailedException -> La
            return r1
        La:
            r1 = move-exception
            java.lang.String r2 = "ImageProcessingUtil"
            java.lang.String r3 = "Failed to encode YUV to JPEG"
            androidx.camera.core.Logger.e(r2, r3, r1)
            r1 = 0
            return r1
    }

    public static void copyBitmapToByteBuffer(@androidx.annotation.NonNull android.graphics.Bitmap r7, @androidx.annotation.NonNull java.nio.ByteBuffer r8, int r9) {
            int r2 = r7.getRowBytes()
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r6 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            nativeCopyBetweenByteBufferAndBitmap(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void copyByteBufferToBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r7, @androidx.annotation.NonNull java.nio.ByteBuffer r8, int r9) {
            int r3 = r7.getRowBytes()
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            nativeCopyBetweenByteBufferAndBitmap(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    private static boolean isSupportedRotationDegrees(@androidx.annotation.IntRange(from = 0, to = 359) int r1) {
            if (r1 == 0) goto L11
            r0 = 90
            if (r1 == r0) goto L11
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L11
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    private static boolean isSupportedYUVFormat(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            int r0 = r2.getFormat()
            r1 = 35
            if (r0 != r1) goto L12
            androidx.camera.core.ImageProxy$PlaneProxy[] r2 = r2.getPlanes()
            int r2 = r2.length
            r0 = 3
            if (r2 != r0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private static native int nativeConvertAndroid420ToABGR(@androidx.annotation.NonNull java.nio.ByteBuffer r0, int r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, @androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5, int r6, int r7, @androidx.annotation.Nullable android.view.Surface r8, @androidx.annotation.Nullable java.nio.ByteBuffer r9, int r10, int r11, int r12, int r13, int r14, int r15);

    private static native int nativeConvertAndroid420ToBitmap(@androidx.annotation.NonNull java.nio.ByteBuffer r0, int r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, @androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5, int r6, int r7, @androidx.annotation.NonNull android.graphics.Bitmap r8, int r9, int r10, int r11);

    private static native int nativeCopyBetweenByteBufferAndBitmap(android.graphics.Bitmap r0, java.nio.ByteBuffer r1, int r2, int r3, int r4, int r5, boolean r6);

    private static native int nativeRotateYUV(@androidx.annotation.NonNull java.nio.ByteBuffer r0, int r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, @androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5, int r6, @androidx.annotation.NonNull java.nio.ByteBuffer r7, int r8, int r9, @androidx.annotation.NonNull java.nio.ByteBuffer r10, int r11, int r12, @androidx.annotation.NonNull java.nio.ByteBuffer r13, int r14, int r15, @androidx.annotation.NonNull java.nio.ByteBuffer r16, @androidx.annotation.NonNull java.nio.ByteBuffer r17, @androidx.annotation.NonNull java.nio.ByteBuffer r18, int r19, int r20, int r21);

    private static native int nativeShiftPixel(@androidx.annotation.NonNull java.nio.ByteBuffer r0, int r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, @androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12);

    private static native int nativeWriteJpegToSurface(@androidx.annotation.NonNull byte[] r0, @androidx.annotation.NonNull android.view.Surface r1);

    @androidx.annotation.Nullable
    public static androidx.camera.core.ImageProxy rotateYUV(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r11, @androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r12, @androidx.annotation.NonNull android.media.ImageWriter r13, @androidx.annotation.NonNull java.nio.ByteBuffer r14, @androidx.annotation.NonNull java.nio.ByteBuffer r15, @androidx.annotation.NonNull java.nio.ByteBuffer r16, @androidx.annotation.IntRange(from = 0, to = 359) int r17) {
            boolean r0 = isSupportedYUVFormat(r11)
            r1 = 0
            java.lang.String r2 = "ImageProcessingUtil"
            if (r0 != 0) goto Lf
            java.lang.String r11 = "Unsupported format for rotate YUV"
            androidx.camera.core.Logger.e(r2, r11)
            return r1
        Lf:
            boolean r0 = isSupportedRotationDegrees(r17)
            if (r0 != 0) goto L1b
            java.lang.String r11 = "Unsupported rotation degrees for rotate YUV"
            androidx.camera.core.Logger.e(r2, r11)
            return r1
        L1b:
            androidx.camera.core.ImageProcessingUtil$Result r0 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L32
            if (r17 <= 0) goto L32
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            androidx.camera.core.ImageProcessingUtil$Result r13 = rotateYUVInternal(r5, r6, r7, r8, r9, r10)
            goto L33
        L32:
            r13 = r0
        L33:
            if (r13 != r0) goto L3b
            java.lang.String r11 = "rotate YUV failure"
            androidx.camera.core.Logger.e(r2, r11)
            return r1
        L3b:
            androidx.camera.core.ImageProxy r12 = r12.acquireLatestImage()
            if (r12 != 0) goto L47
            java.lang.String r11 = "YUV rotation acquireLatestImage failure"
            androidx.camera.core.Logger.e(r2, r11)
            return r1
        L47:
            androidx.camera.core.SingleCloseImageProxy r13 = new androidx.camera.core.SingleCloseImageProxy
            r13.<init>(r12)
            androidx.camera.core.e0 r14 = new androidx.camera.core.e0
            r14.<init>(r12, r11)
            r13.addOnImageCloseListener(r14)
            return r13
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(23)
    private static androidx.camera.core.ImageProcessingUtil.Result rotateYUVInternal(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r23, @androidx.annotation.NonNull android.media.ImageWriter r24, @androidx.annotation.NonNull java.nio.ByteBuffer r25, @androidx.annotation.NonNull java.nio.ByteBuffer r26, @androidx.annotation.NonNull java.nio.ByteBuffer r27, int r28) {
            int r20 = r23.getWidth()
            int r21 = r23.getHeight()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r23.getPlanes()
            r1 = 0
            r0 = r0[r1]
            int r2 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r23.getPlanes()
            r3 = 1
            r0 = r0[r3]
            int r4 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r23.getPlanes()
            r5 = 2
            r0 = r0[r5]
            int r6 = r0.getRowStride()
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r23.getPlanes()
            r0 = r0[r3]
            int r7 = r0.getPixelStride()
            android.media.Image r0 = androidx.camera.core.internal.compat.ImageWriterCompat.dequeueInputImage(r24)
            if (r0 != 0) goto L3c
            androidx.camera.core.ImageProcessingUtil$Result r0 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            return r0
        L3c:
            androidx.camera.core.ImageProxy$PlaneProxy[] r8 = r23.getPlanes()
            r8 = r8[r1]
            java.nio.ByteBuffer r8 = r8.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r9 = r23.getPlanes()
            r9 = r9[r3]
            java.nio.ByteBuffer r9 = r9.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r10 = r23.getPlanes()
            r10 = r10[r5]
            java.nio.ByteBuffer r10 = r10.getBuffer()
            android.media.Image$Plane[] r11 = r0.getPlanes()
            r11 = r11[r1]
            java.nio.ByteBuffer r11 = r11.getBuffer()
            android.media.Image$Plane[] r12 = r0.getPlanes()
            r12 = r12[r1]
            int r12 = r12.getRowStride()
            android.media.Image$Plane[] r13 = r0.getPlanes()
            r1 = r13[r1]
            int r1 = r1.getPixelStride()
            android.media.Image$Plane[] r13 = r0.getPlanes()
            r13 = r13[r3]
            java.nio.ByteBuffer r13 = r13.getBuffer()
            android.media.Image$Plane[] r14 = r0.getPlanes()
            r14 = r14[r3]
            int r14 = r14.getRowStride()
            android.media.Image$Plane[] r15 = r0.getPlanes()
            r3 = r15[r3]
            int r3 = r3.getPixelStride()
            android.media.Image$Plane[] r15 = r0.getPlanes()
            r15 = r15[r5]
            java.nio.ByteBuffer r15 = r15.getBuffer()
            android.media.Image$Plane[] r16 = r0.getPlanes()
            r16 = r16[r5]
            int r16 = r16.getRowStride()
            android.media.Image$Plane[] r17 = r0.getPlanes()
            r5 = r17[r5]
            int r5 = r5.getPixelStride()
            r17 = r10
            r10 = r1
            r1 = r8
            r8 = r11
            r11 = r13
            r13 = r3
            r3 = r9
            r9 = r12
            r12 = r14
            r14 = r15
            r15 = r16
            r16 = r5
            r5 = r17
            r17 = r25
            r18 = r26
            r19 = r27
            r22 = r28
            int r1 = nativeRotateYUV(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto Ld6
            androidx.camera.core.ImageProcessingUtil$Result r0 = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION
            return r0
        Ld6:
            r1 = r24
            androidx.camera.core.internal.compat.ImageWriterCompat.queueInputImage(r1, r0)
            androidx.camera.core.ImageProcessingUtil$Result r0 = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS
            return r0
    }

    public static boolean writeJpegBytesToSurface(@androidx.annotation.NonNull android.view.Surface r0, @androidx.annotation.NonNull byte[] r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.util.Preconditions.checkNotNull(r0)
            int r0 = nativeWriteJpegToSurface(r1, r0)
            if (r0 == 0) goto L15
            java.lang.String r0 = "ImageProcessingUtil"
            java.lang.String r1 = "Failed to enqueue JPEG image."
            androidx.camera.core.Logger.e(r0, r1)
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }
}
