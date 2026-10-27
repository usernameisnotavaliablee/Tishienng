package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageUtil {
    public static final int DEFAULT_RGBA_PIXEL_STRIDE = 4;
    private static final java.lang.String TAG = "ImageUtil";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CodecFailedException extends java.lang.Exception {
        private final androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType mFailureType;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public enum FailureType extends java.lang.Enum<androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType> {
            private static final /* synthetic */ androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType[] $VALUES = null;
            public static final androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType DECODE_FAILED = null;
            public static final androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType ENCODE_FAILED = null;
            public static final androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType UNKNOWN = null;

            private static /* synthetic */ androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType[] $values() {
                    r0 = 3
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType[] r0 = new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType[r0]
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED
                    r2 = 0
                    r0[r2] = r1
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED
                    r2 = 1
                    r0[r2] = r1
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.UNKNOWN
                    r2 = 2
                    r0[r2] = r1
                    return r0
            }

            static {
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r0 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType
                    java.lang.String r1 = "ENCODE_FAILED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED = r0
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r0 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType
                    java.lang.String r1 = "DECODE_FAILED"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED = r0
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r0 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType
                    java.lang.String r1 = "UNKNOWN"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.UNKNOWN = r0
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType[] r0 = $values()
                    androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.$VALUES = r0
                    return
            }

            FailureType(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType> r0 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = (androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType) r1
                    return r1
            }

            public static androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType[] values() {
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType[] r0 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType[] r0 = (androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType[]) r0
                    return r0
            }
        }

        CodecFailedException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.UNKNOWN
                r0.mFailureType = r1
                return
        }

        CodecFailedException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mFailureType = r2
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType getFailureType() {
                r1 = this;
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r0 = r1.mFailureType
                return r0
        }
    }

    private ImageUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.Rect computeCropRectFromAspectRatio(@androidx.annotation.NonNull android.util.Size r8, @androidx.annotation.NonNull android.util.Rational r9) {
            boolean r0 = isAspectRatioValid(r9)
            if (r0 != 0) goto Lf
            java.lang.String r8 = "ImageUtil"
            java.lang.String r9 = "Invalid view ratio."
            androidx.camera.core.Logger.w(r8, r9)
            r8 = 0
            return r8
        Lf:
            int r0 = r8.getWidth()
            int r8 = r8.getHeight()
            float r1 = (float) r0
            float r2 = (float) r8
            float r3 = r1 / r2
            int r4 = r9.getNumerator()
            int r5 = r9.getDenominator()
            float r9 = r9.floatValue()
            r6 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L3c
            float r9 = (float) r4
            float r1 = r1 / r9
            float r9 = (float) r5
            float r1 = r1 * r9
            int r9 = java.lang.Math.round(r1)
            int r8 = r8 - r9
            int r8 = r8 / 2
            r7 = r9
            r9 = r8
            r8 = r7
            goto L4b
        L3c:
            float r9 = (float) r5
            float r2 = r2 / r9
            float r9 = (float) r4
            float r2 = r2 * r9
            int r9 = java.lang.Math.round(r2)
            int r0 = r0 - r9
            int r0 = r0 / 2
            r6 = r0
            r0 = r9
            r9 = 0
        L4b:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r0 = r0 + r6
            int r8 = r8 + r9
            r1.<init>(r6, r9, r0, r8)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.graphics.Rect computeCropRectFromDispatchInfo(@androidx.annotation.NonNull android.graphics.Rect r4, int r5, @androidx.annotation.NonNull android.util.Size r6, int r7) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r7 = r7 - r5
            float r5 = (float) r7
            r0.setRotate(r5)
            float[] r5 = sizeToVertexes(r6)
            r0.mapPoints(r5)
            r6 = 0
            r6 = r5[r6]
            r7 = 2
            r7 = r5[r7]
            r1 = 4
            r1 = r5[r1]
            r2 = 6
            r2 = r5[r2]
            float r6 = min(r6, r7, r1, r2)
            r7 = 1
            r7 = r5[r7]
            r1 = 3
            r1 = r5[r1]
            r2 = 5
            r2 = r5[r2]
            r3 = 7
            r5 = r5[r3]
            float r5 = min(r7, r1, r2, r5)
            float r6 = -r6
            float r5 = -r5
            r0.postTranslate(r6, r5)
            r0.invert(r0)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r4)
            r0.mapRect(r5, r6)
            r5.sort()
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r5.round(r4)
            return r4
    }

    @androidx.annotation.NonNull
    public static android.graphics.Bitmap createBitmapFromImageProxy(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            int r0 = r3.getFormat()
            r1 = 1
            if (r0 == r1) goto L39
            r1 = 35
            if (r0 == r1) goto L34
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L14
            android.graphics.Bitmap r3 = createBitmapFromJpegImage(r3)
            return r3
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect image format of the input image proxy: "
            r1.append(r2)
            int r3 = r3.getFormat()
            r1.append(r3)
            java.lang.String r3 = ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L34:
            android.graphics.Bitmap r3 = androidx.camera.core.ImageProcessingUtil.convertYUVToBitmap(r3)
            return r3
        L39:
            android.graphics.Bitmap r3 = createBitmapFromRgbaImage(r3)
            return r3
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap createBitmapFromJpegImage(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            byte[] r3 = jpegImageToJpegByteArray(r3)
            int r0 = r3.length
            r1 = 0
            r2 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r2, r0, r1)
            if (r3 == 0) goto Le
            return r3
        Le:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Decode jpeg byte array failed"
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.NonNull
    public static android.graphics.Bitmap createBitmapFromPlane(@androidx.annotation.NonNull androidx.camera.core.ImageProxy.PlaneProxy[] r4, int r5, int r6) {
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r3 = "Expect a single plane"
            androidx.core.util.Preconditions.checkArgument(r0, r3)
            r0 = r4[r1]
            int r0 = r0.getPixelStride()
            r3 = 4
            if (r0 != r3) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            java.lang.String r3 = "Expect pixelStride=4"
            androidx.core.util.Preconditions.checkArgument(r0, r3)
            r0 = r4[r1]
            int r0 = r0.getRowStride()
            int r3 = r5 * 4
            if (r0 != r3) goto L29
            goto L2a
        L29:
            r2 = 0
        L2a:
            java.lang.String r0 = "Expect rowStride=width*4"
            androidx.core.util.Preconditions.checkArgument(r2, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r0)
            r6 = r4[r1]
            java.nio.ByteBuffer r6 = r6.getBuffer()
            r6.rewind()
            r6 = r4[r1]
            java.nio.ByteBuffer r6 = r6.getBuffer()
            r4 = r4[r1]
            int r4 = r4.getRowStride()
            androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(r5, r6, r4)
            return r5
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap createBitmapFromRgbaImage(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r3.getPlanes()
            r2 = 0
            r1 = r1[r2]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            r1.rewind()
            androidx.camera.core.ImageProxy$PlaneProxy[] r1 = r3.getPlanes()
            r1 = r1[r2]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            androidx.camera.core.ImageProxy$PlaneProxy[] r3 = r3.getPlanes()
            r3 = r3[r2]
            int r3 = r3.getRowStride()
            androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(r0, r1, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.nio.ByteBuffer createDirectByteBuffer(@androidx.annotation.NonNull android.graphics.Bitmap r2) {
            android.graphics.Bitmap$Config r0 = r2.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "Only accept Bitmap with ARGB_8888 format for now."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            int r0 = r2.getAllocationByteCount()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            int r1 = r2.getRowBytes()
            androidx.camera.core.ImageProcessingUtil.copyBitmapToByteBuffer(r2, r0, r1)
            r0.rewind()
            return r0
    }

    @androidx.annotation.NonNull
    private static byte[] cropJpegByteArray(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull android.graphics.Rect r4, @androidx.annotation.IntRange(from = 1, to = 100) int r5) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
            java.lang.String r0 = "Decode byte array failed."
            int r1 = r3.length     // Catch: java.io.IOException -> L3d java.lang.IllegalArgumentException -> L45
            r2 = 0
            android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r3, r2, r1, r2)     // Catch: java.io.IOException -> L3d java.lang.IllegalArgumentException -> L45
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> L3d java.lang.IllegalArgumentException -> L45
            r1.<init>()     // Catch: java.io.IOException -> L3d java.lang.IllegalArgumentException -> L45
            android.graphics.Bitmap r4 = r3.decodeRegion(r4, r1)     // Catch: java.io.IOException -> L3d java.lang.IllegalArgumentException -> L45
            r3.recycle()     // Catch: java.io.IOException -> L3d java.lang.IllegalArgumentException -> L45
            if (r4 == 0) goto L35
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r5 = r4.compress(r0, r5, r3)
            if (r5 == 0) goto L2b
            r4.recycle()
            byte[] r3 = r3.toByteArray()
            return r3
        L2b:
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException r3 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException
            java.lang.String r4 = "Encode bitmap failed."
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r5 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED
            r3.<init>(r4, r5)
            throw r3
        L35:
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException r3 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r4 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED
            r3.<init>(r0, r4)
            throw r3
        L3d:
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException r3 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r4 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED
            r3.<init>(r0, r4)
            throw r3
        L45:
            r3 = move-exception
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException r4 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Decode byte array failed with illegal argument."
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r5 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED
            r4.<init>(r3, r5)
            throw r4
    }

    @androidx.annotation.NonNull
    public static android.util.Rational getRotatedAspectRatio(@androidx.annotation.IntRange(from = 0, to = 359) int r1, @androidx.annotation.NonNull android.util.Rational r2) {
            r0 = 90
            if (r1 == r0) goto L17
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L9
            goto L17
        L9:
            android.util.Rational r1 = new android.util.Rational
            int r0 = r2.getNumerator()
            int r2 = r2.getDenominator()
            r1.<init>(r0, r2)
            return r1
        L17:
            android.util.Rational r1 = inverseRational(r2)
            return r1
    }

    private static android.util.Rational inverseRational(@androidx.annotation.Nullable android.util.Rational r2) {
            if (r2 != 0) goto L3
            return r2
        L3:
            android.util.Rational r0 = new android.util.Rational
            int r1 = r2.getDenominator()
            int r2 = r2.getNumerator()
            r0.<init>(r1, r2)
            return r0
    }

    public static boolean isAspectRatioValid(@androidx.annotation.Nullable android.util.Rational r2) {
            if (r2 == 0) goto L13
            float r0 = r2.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L13
            boolean r2 = r2.isNaN()
            if (r2 != 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public static boolean isAspectRatioValid(@androidx.annotation.NonNull android.util.Size r2, @androidx.annotation.Nullable android.util.Rational r3) {
            if (r3 == 0) goto L19
            float r0 = r3.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
            boolean r2 = isCropAspectRatioHasEffect(r2, r3)
            if (r2 == 0) goto L19
            boolean r2 = r3.isNaN()
            if (r2 != 0) goto L19
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    private static boolean isCropAspectRatioHasEffect(@androidx.annotation.NonNull android.util.Size r3, @androidx.annotation.NonNull android.util.Rational r4) {
            int r0 = r3.getWidth()
            int r3 = r3.getHeight()
            int r1 = r4.getNumerator()
            int r4 = r4.getDenominator()
            float r2 = (float) r0
            float r1 = (float) r1
            float r2 = r2 / r1
            float r4 = (float) r4
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            if (r3 != r2) goto L29
            float r3 = (float) r3
            float r3 = r3 / r4
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            if (r0 == r3) goto L27
            goto L29
        L27:
            r3 = 0
            return r3
        L29:
            r3 = 1
            return r3
    }

    @androidx.annotation.NonNull
    public static byte[] jpegImageToJpegByteArray(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            int r0 = r3.getFormat()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L20
            androidx.camera.core.ImageProxy$PlaneProxy[] r3 = r3.getPlanes()
            r0 = 0
            r3 = r3[r0]
            java.nio.ByteBuffer r3 = r3.getBuffer()
            int r0 = r3.capacity()
            byte[] r0 = new byte[r0]
            r3.rewind()
            r3.get(r0)
            return r0
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect image format of the input image proxy: "
            r1.append(r2)
            int r3 = r3.getFormat()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    public static byte[] jpegImageToJpegByteArray(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2, @androidx.annotation.NonNull android.graphics.Rect r3, @androidx.annotation.IntRange(from = 1, to = 100) int r4) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
            int r0 = r2.getFormat()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L11
            byte[] r2 = jpegImageToJpegByteArray(r2)
            byte[] r2 = cropJpegByteArray(r2, r3, r4)
            return r2
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Incorrect image format of the input image proxy: "
            r4.append(r0)
            int r2 = r2.getFormat()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    public static float min(float r0, float r1, float r2, float r3) {
            float r0 = java.lang.Math.min(r0, r1)
            float r1 = java.lang.Math.min(r2, r3)
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    public static boolean shouldCropImage(int r0, int r1, int r2, int r3) {
            if (r0 != r2) goto L7
            if (r1 == r3) goto L5
            goto L7
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 1
            return r0
    }

    public static boolean shouldCropImage(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Rect r2 = r3.getCropRect()
            int r2 = r2.width()
            android.graphics.Rect r3 = r3.getCropRect()
            int r3 = r3.height()
            boolean r3 = shouldCropImage(r0, r1, r2, r3)
            return r3
    }

    @androidx.annotation.NonNull
    public static float[] sizeToVertexes(@androidx.annotation.NonNull android.util.Size r6) {
            int r0 = r6.getWidth()
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            int r2 = r6.getHeight()
            float r2 = (float) r2
            int r6 = r6.getHeight()
            float r6 = (float) r6
            r3 = 8
            float[] r3 = new float[r3]
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r4 = 1
            r3[r4] = r5
            r4 = 2
            r3[r4] = r0
            r0 = 3
            r3[r0] = r5
            r0 = 4
            r3[r0] = r1
            r0 = 5
            r3[r0] = r2
            r0 = 6
            r3[r0] = r5
            r0 = 7
            r3[r0] = r6
            return r3
    }

    @androidx.annotation.NonNull
    public static byte[] yuvImageToJpegByteArray(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r8, @androidx.annotation.Nullable android.graphics.Rect r9, @androidx.annotation.IntRange(from = 1, to = 100) int r10, int r11) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
            int r0 = r8.getFormat()
            r1 = 35
            if (r0 != r1) goto L4f
            byte[] r3 = yuv_420_888toNv21(r8)
            android.graphics.YuvImage r2 = new android.graphics.YuvImage
            int r5 = r8.getWidth()
            int r6 = r8.getHeight()
            r7 = 0
            r4 = 17
            r2.<init>(r3, r4, r5, r6, r7)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            androidx.camera.core.impl.utils.ExifOutputStream r1 = new androidx.camera.core.impl.utils.ExifOutputStream
            androidx.camera.core.impl.utils.ExifData r11 = androidx.camera.core.impl.utils.ExifData.create(r8, r11)
            r1.<init>(r0, r11)
            if (r9 != 0) goto L3a
            android.graphics.Rect r9 = new android.graphics.Rect
            int r11 = r8.getWidth()
            int r8 = r8.getHeight()
            r3 = 0
            r9.<init>(r3, r3, r11, r8)
        L3a:
            boolean r8 = r2.compressToJpeg(r9, r10, r1)
            if (r8 == 0) goto L45
            byte[] r8 = r0.toByteArray()
            return r8
        L45:
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException r8 = new androidx.camera.core.internal.utils.ImageUtil$CodecFailedException
            java.lang.String r9 = "YuvImage failed to encode jpeg."
            androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r10 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED
            r8.<init>(r9, r10)
            throw r8
        L4f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Incorrect image format of the input image proxy: "
            r10.append(r11)
            int r8 = r8.getFormat()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
    }

    @androidx.annotation.NonNull
    public static byte[] yuv_420_888toNv21(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r19) {
            androidx.camera.core.ImageProxy$PlaneProxy[] r0 = r19.getPlanes()
            r1 = 0
            r0 = r0[r1]
            androidx.camera.core.ImageProxy$PlaneProxy[] r2 = r19.getPlanes()
            r3 = 1
            r2 = r2[r3]
            androidx.camera.core.ImageProxy$PlaneProxy[] r3 = r19.getPlanes()
            r4 = 2
            r3 = r3[r4]
            java.nio.ByteBuffer r5 = r0.getBuffer()
            java.nio.ByteBuffer r6 = r2.getBuffer()
            java.nio.ByteBuffer r7 = r3.getBuffer()
            r5.rewind()
            r6.rewind()
            r7.rewind()
            int r8 = r5.remaining()
            int r9 = r19.getWidth()
            int r10 = r19.getHeight()
            int r9 = r9 * r10
            int r9 = r9 / r4
            int r9 = r9 + r8
            byte[] r9 = new byte[r9]
            r10 = 0
            r11 = 0
        L3e:
            int r12 = r19.getHeight()
            if (r10 >= r12) goto L68
            int r12 = r19.getWidth()
            r5.get(r9, r11, r12)
            int r12 = r19.getWidth()
            int r11 = r11 + r12
            int r12 = r5.position()
            int r13 = r19.getWidth()
            int r12 = r12 - r13
            int r13 = r0.getRowStride()
            int r12 = r12 + r13
            int r12 = java.lang.Math.min(r8, r12)
            r5.position(r12)
            int r10 = r10 + 1
            goto L3e
        L68:
            int r0 = r19.getHeight()
            int r0 = r0 / r4
            int r5 = r19.getWidth()
            int r5 = r5 / r4
            int r4 = r3.getRowStride()
            int r8 = r2.getRowStride()
            int r3 = r3.getPixelStride()
            int r2 = r2.getPixelStride()
            byte[] r10 = new byte[r4]
            byte[] r12 = new byte[r8]
            r13 = 0
        L87:
            if (r13 >= r0) goto Lba
            int r14 = r7.remaining()
            int r14 = java.lang.Math.min(r4, r14)
            r7.get(r10, r1, r14)
            int r14 = r6.remaining()
            int r14 = java.lang.Math.min(r8, r14)
            r6.get(r12, r1, r14)
            r14 = 0
            r15 = 0
            r16 = 0
        La3:
            if (r14 >= r5) goto Lb7
            int r17 = r11 + 1
            r18 = r10[r15]
            r9[r11] = r18
            int r11 = r11 + 2
            r18 = r12[r16]
            r9[r17] = r18
            int r15 = r15 + r3
            int r16 = r16 + r2
            int r14 = r14 + 1
            goto La3
        Lb7:
            int r13 = r13 + 1
            goto L87
        Lba:
            return r9
    }
}
