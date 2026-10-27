package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BitmapUtils {
    public static final int IMAGEBOUND = 128;
    public static final int MAXLENTH = 1024;
    public static final int PIC_COMPRESS_SIZE = 4;
    private static final int QUALITY = 100;
    public static final int ROTATE0 = 0;
    public static final int ROTATE180 = 180;
    public static final int ROTATE270 = 270;
    public static final int ROTATE360 = 360;
    public static final int ROTATE90 = 90;
    private static final java.lang.String TAG = "ImageUtils";

    private BitmapUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap BGR2Bitmap(byte[] r6, int r7, int r8) {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r7, r8, r0)
            int r7 = r7 * r8
            int r8 = r7 * 4
            byte[] r8 = new byte[r8]
            r1 = 0
        Ld:
            if (r1 >= r7) goto L2f
            int r2 = r1 * 3
            r3 = r6[r2]
            int r4 = r2 + 1
            r4 = r6[r4]
            int r2 = r2 + 2
            r2 = r6[r2]
            int r5 = r1 * 4
            r8[r5] = r2
            int r2 = r5 + 1
            r8[r2] = r4
            int r2 = r5 + 2
            r8[r2] = r3
            int r5 = r5 + 3
            r2 = -1
            r8[r5] = r2
            int r1 = r1 + 1
            goto Ld
        L2f:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r8)
            r0.copyPixelsFromBuffer(r6)
            return r0
    }

    public static android.graphics.Bitmap Depth2Bitmap(byte[] r9, int r10, int r11) {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r10, r11, r0)
            int r0 = r10 * r11
            int[] r2 = new int[r0]
            r3 = 0
        Lb:
            if (r3 >= r0) goto L38
            int r4 = r3 * 2
            r5 = r9[r4]
            int r4 = r4 + 1
            r4 = r9[r4]
            int r6 = r4 * 256
            int r6 = r6 + r5
            int r6 = r6 / 10
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r4 * 256
            int r7 = r7 + r5
            int r7 = r7 / 10
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r4 = r4 * 256
            int r5 = r5 + r4
            int r5 = r5 / 10
            r4 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r4 = r4 | r6
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 | r5
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L38:
            r5 = 0
            r6 = 0
            r3 = 0
            r7 = r10
            r4 = r10
            r8 = r11
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public static byte[] bitmapCompress(android.graphics.Bitmap r3, int r4) {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
            r3.compress(r2, r4, r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L16
            r1.close()     // Catch: java.io.IOException -> L12
        L12:
            return r3
        L13:
            r3 = move-exception
            r0 = r1
            goto L1d
        L16:
            goto L23
        L18:
            r3 = move-exception
            goto L1d
        L1a:
            r1 = r0
            goto L23
        L1d:
            if (r0 == 0) goto L22
            r0.close()     // Catch: java.io.IOException -> L22
        L22:
            throw r3
        L23:
            if (r1 == 0) goto L28
            r1.close()     // Catch: java.io.IOException -> L28
        L28:
            return r0
    }

    public static java.lang.String bitmapToJpegBase64(android.graphics.Bitmap r2, int r3, float r4) {
            int r0 = r2.getWidth()     // Catch: java.lang.Exception -> L2f
            int r1 = r2.getHeight()     // Catch: java.lang.Exception -> L2f
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Exception -> L2f
            float r0 = (float) r0     // Catch: java.lang.Exception -> L2f
            float r4 = r4 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L18
            android.graphics.Bitmap r2 = scale(r2, r4)     // Catch: java.lang.Exception -> L2f
        L18:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L2f
            r4.<init>()     // Catch: java.lang.Exception -> L2f
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L2f
            r2.compress(r0, r3, r4)     // Catch: java.lang.Exception -> L2f
            byte[] r2 = r4.toByteArray()     // Catch: java.lang.Exception -> L2f
            r4.close()     // Catch: java.lang.Exception -> L2f
            r3 = 2
            java.lang.String r2 = com.baidu.idl.face.platform.utils.Base64Utils.encodeToString(r2, r3)     // Catch: java.lang.Exception -> L2f
            return r2
        L2f:
            r2 = 0
            return r2
    }

    public static android.graphics.Bitmap calculateInSampleSize(android.graphics.Bitmap r2, int r3, int r4) {
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            if (r1 > r4) goto Le
            if (r0 <= r3) goto Ld
            goto Le
        Ld:
            return r2
        Le:
            float r4 = (float) r4
            float r1 = (float) r1
            float r4 = r4 / r1
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L19
            goto L1a
        L19:
            r4 = r3
        L1a:
            android.graphics.Bitmap r2 = scale(r2, r4)
            return r2
    }

    public static int computeInitialSampleSize(android.graphics.BitmapFactory.Options r9, int r10, int r11) {
            int r0 = r9.outWidth
            double r0 = (double) r0
            int r9 = r9.outHeight
            double r2 = (double) r9
            r9 = 1
            r4 = -1
            if (r11 != r4) goto Lc
            r5 = 1
            goto L19
        Lc:
            double r5 = r0 * r2
            double r7 = (double) r11
            double r5 = r5 / r7
            double r5 = java.lang.Math.sqrt(r5)
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
        L19:
            if (r10 != r4) goto L1e
            r0 = 128(0x80, float:1.8E-43)
            goto L2e
        L1e:
            double r6 = (double) r10
            double r0 = r0 / r6
            double r0 = java.lang.Math.floor(r0)
            double r2 = r2 / r6
            double r2 = java.lang.Math.floor(r2)
            double r0 = java.lang.Math.min(r0, r2)
            int r0 = (int) r0
        L2e:
            if (r0 >= r5) goto L31
            goto L38
        L31:
            if (r11 != r4) goto L36
            if (r10 != r4) goto L36
            return r9
        L36:
            if (r10 != r4) goto L39
        L38:
            return r5
        L39:
            return r0
    }

    public static int computeSampleSize(android.graphics.BitmapFactory.Options r0, int r1, int r2) {
            int r0 = computeInitialSampleSize(r0, r1, r2)
            r1 = 8
            if (r0 > r1) goto Lf
            r1 = 1
        L9:
            if (r1 >= r0) goto Le
            int r1 = r1 << 1
            goto L9
        Le:
            return r1
        Lf:
            int r0 = r0 + 7
            int r0 = r0 / r1
            int r0 = r0 * 8
            return r0
    }

    public static android.graphics.Bitmap createBitmap(android.content.Context r3, int r4, int r5, int[] r6) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 0
            int r2 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayWidth(r3)     // Catch: java.lang.OutOfMemoryError -> L1b
            int r3 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayHeight(r3)     // Catch: java.lang.OutOfMemoryError -> L1b
            java.lang.Math.min(r2, r3)     // Catch: java.lang.OutOfMemoryError -> L1b
            r3 = 0
            r0.inJustDecodeBounds = r3     // Catch: java.lang.OutOfMemoryError -> L1b
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.OutOfMemoryError -> L1b
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r6, r4, r5, r3)     // Catch: java.lang.OutOfMemoryError -> L1b
            goto L1d
        L1b:
            r3 = r1
        L1d:
            if (r3 == 0) goto L24
            if (r3 == 0) goto L24
            r3.recycle()
        L24:
            return r1
    }

    public static android.graphics.Bitmap createBitmap(android.content.Context r5, java.lang.String r6, int r7) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayWidth(r5)     // Catch: java.lang.OutOfMemoryError -> L2d
            int r5 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayHeight(r5)     // Catch: java.lang.OutOfMemoryError -> L2d
            int r5 = java.lang.Math.min(r4, r5)     // Catch: java.lang.OutOfMemoryError -> L2d
            r0.inJustDecodeBounds = r2     // Catch: java.lang.OutOfMemoryError -> L2d
            android.graphics.BitmapFactory.decodeFile(r6, r0)     // Catch: java.lang.OutOfMemoryError -> L2d
            r4 = 1048576(0x100000, float:1.469368E-39)
            int r5 = computeSampleSize(r0, r5, r4)     // Catch: java.lang.OutOfMemoryError -> L2d
            r0.inSampleSize = r5     // Catch: java.lang.OutOfMemoryError -> L2d
            r0.inJustDecodeBounds = r1     // Catch: java.lang.OutOfMemoryError -> L2d
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r6, r0)     // Catch: java.lang.OutOfMemoryError -> L2d
            float r5 = (float) r7     // Catch: java.lang.OutOfMemoryError -> L2d
            android.graphics.Bitmap r5 = rotateBitmap(r5, r3)     // Catch: java.lang.OutOfMemoryError -> L2d
            goto L52
        L2d:
            if (r3 == 0) goto L33
            r3.recycle()
        L33:
            r0.inJustDecodeBounds = r2
            android.graphics.BitmapFactory.decodeFile(r6, r0)
            int r5 = r0.outWidth
            int r2 = r0.outHeight
            int r5 = r5 * r2
            int r5 = r5 / 4
            r2 = -1
            int r5 = computeSampleSize(r0, r2, r5)
            r0.inSampleSize = r5
            r0.inJustDecodeBounds = r1
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r6, r0)
            float r5 = (float) r7
            android.graphics.Bitmap r5 = rotateBitmap(r5, r3)
        L52:
            if (r5 == r3) goto L59
            if (r3 == 0) goto L59
            r3.recycle()
        L59:
            return r5
    }

    public static android.graphics.Bitmap createBitmap(android.content.Context r5, byte[] r6, float r7) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
            int r4 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayWidth(r5)     // Catch: java.lang.OutOfMemoryError -> L2e
            int r5 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayHeight(r5)     // Catch: java.lang.OutOfMemoryError -> L2e
            int r5 = java.lang.Math.min(r4, r5)     // Catch: java.lang.OutOfMemoryError -> L2e
            r0.inJustDecodeBounds = r1     // Catch: java.lang.OutOfMemoryError -> L2e
            int r4 = r6.length     // Catch: java.lang.OutOfMemoryError -> L2e
            android.graphics.BitmapFactory.decodeByteArray(r6, r2, r4, r0)     // Catch: java.lang.OutOfMemoryError -> L2e
            r4 = 1048576(0x100000, float:1.469368E-39)
            int r5 = computeSampleSize(r0, r5, r4)     // Catch: java.lang.OutOfMemoryError -> L2e
            r0.inSampleSize = r5     // Catch: java.lang.OutOfMemoryError -> L2e
            r0.inJustDecodeBounds = r2     // Catch: java.lang.OutOfMemoryError -> L2e
            int r5 = r6.length     // Catch: java.lang.OutOfMemoryError -> L2e
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r6, r2, r5, r0)     // Catch: java.lang.OutOfMemoryError -> L2e
            android.graphics.Bitmap r5 = rotateBitmap(r7, r3)     // Catch: java.lang.OutOfMemoryError -> L2e
            goto L5a
        L2e:
            if (r3 == 0) goto L3a
            boolean r5 = r3.isRecycled()
            if (r5 != 0) goto L3a
            r3.recycle()
        L3a:
            r0.inJustDecodeBounds = r1
            int r5 = r6.length
            android.graphics.BitmapFactory.decodeByteArray(r6, r2, r5, r0)
            int r5 = r0.outWidth
            int r1 = r0.outHeight
            int r5 = r5 * r1
            int r5 = r5 / 4
            r1 = -1
            int r5 = computeSampleSize(r0, r1, r5)
            r0.inSampleSize = r5
            r0.inJustDecodeBounds = r2
            int r5 = r6.length
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r6, r2, r5, r0)
            android.graphics.Bitmap r5 = rotateBitmap(r7, r3)
        L5a:
            if (r5 == r3) goto L61
            if (r3 == 0) goto L61
            r3.recycle()
        L61:
            return r5
    }

    public static android.graphics.Bitmap createBitmap(android.content.Context r4, byte[] r5, int r6) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 0
            r2 = 0
            int r3 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayWidth(r4)     // Catch: java.lang.OutOfMemoryError -> L1f
            int r4 = com.baidu.idl.face.platform.utils.DensityUtils.getDisplayHeight(r4)     // Catch: java.lang.OutOfMemoryError -> L1f
            java.lang.Math.min(r3, r4)     // Catch: java.lang.OutOfMemoryError -> L1f
            r0.inJustDecodeBounds = r1     // Catch: java.lang.OutOfMemoryError -> L1f
            int r4 = r5.length     // Catch: java.lang.OutOfMemoryError -> L1f
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r5, r1, r4)     // Catch: java.lang.OutOfMemoryError -> L1f
            float r4 = (float) r6     // Catch: java.lang.OutOfMemoryError -> L1f
            android.graphics.Bitmap r4 = rotateBitmap(r4, r2)     // Catch: java.lang.OutOfMemoryError -> L1f
            goto L47
        L1f:
            if (r2 == 0) goto L25
            r2.recycle()
        L25:
            r4 = 1
            r0.inJustDecodeBounds = r4
            int r4 = r5.length
            android.graphics.BitmapFactory.decodeByteArray(r5, r1, r4, r0)
            int r4 = r0.outWidth
            int r2 = r0.outHeight
            int r4 = r4 * r2
            int r4 = r4 / 4
            r2 = -1
            int r4 = computeSampleSize(r0, r2, r4)
            r0.inSampleSize = r4
            r0.inJustDecodeBounds = r1
            int r4 = r5.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r5, r1, r4, r0)
            float r4 = (float) r6
            android.graphics.Bitmap r4 = rotateBitmap(r4, r2)
        L47:
            if (r4 == r2) goto L4e
            if (r2 == 0) goto L4e
            r2.recycle()
        L4e:
            return r4
    }

    public static int decodeImageDegree(java.lang.String r3) {
            r0 = 0
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch: java.lang.Exception -> L21
            r1.<init>(r3)     // Catch: java.lang.Exception -> L21
            java.lang.String r3 = "Orientation"
            r2 = 1
            int r3 = r1.getAttributeInt(r3, r2)     // Catch: java.lang.Exception -> L21
            r1 = 3
            if (r3 == r1) goto L1e
            r1 = 6
            if (r3 == r1) goto L1b
            r1 = 8
            if (r3 == r1) goto L18
            return r0
        L18:
            r3 = 270(0x10e, float:3.78E-43)
            return r3
        L1b:
            r3 = 90
            return r3
        L1e:
            r3 = 180(0xb4, float:2.52E-43)
            return r3
        L21:
            return r0
    }

    public static android.graphics.Bitmap getInstaceBmp(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r3) {
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r0 = r3.imageType
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_RGBA
            if (r0 != r1) goto L1a
            int r0 = r3.width
            int r1 = r3.height
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            byte[] r3 = r3.data
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r0.copyPixelsFromBuffer(r3)
            return r0
        L1a:
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_BGR
            if (r0 != r1) goto L29
            byte[] r0 = r3.data
            int r1 = r3.width
            int r3 = r3.height
            android.graphics.Bitmap r3 = BGR2Bitmap(r0, r1, r3)
            return r3
        L29:
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_YUV_NV21
            if (r0 != r1) goto L38
            byte[] r0 = r3.data
            int r1 = r3.width
            int r3 = r3.height
            android.graphics.Bitmap r3 = yuv2Bitmap(r0, r1, r3)
            return r3
        L38:
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_GRAY
            if (r0 != r1) goto L47
            byte[] r0 = r3.data
            int r1 = r3.width
            int r3 = r3.height
            android.graphics.Bitmap r3 = Depth2Bitmap(r0, r1, r3)
            return r3
        L47:
            r3 = 0
            return r3
    }

    public static android.graphics.Bitmap rotateBitmap(float r7, android.graphics.Bitmap r8) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r8
        Lb:
            r5.setRotate(r7)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r8
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean saveBitmap(java.io.File r2, android.graphics.Bitmap r3) {
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            r0 = 100
            r3.compress(r2, r0, r1)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L15
            r2 = 1
            r1.close()     // Catch: java.lang.Exception -> L11
        L11:
            return r2
        L12:
            r2 = move-exception
            r0 = r1
            goto L1c
        L15:
            r0 = r1
            goto L22
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            goto L22
        L1c:
            if (r0 == 0) goto L21
            r0.close()     // Catch: java.lang.Exception -> L21
        L21:
            throw r2
        L22:
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.lang.Exception -> L27
        L27:
            r2 = 0
            return r2
    }

    public static android.graphics.Bitmap scale(android.graphics.Bitmap r7, float r8) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r8, r8)
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            r0.recycle()
            return r7
    }

    public static android.graphics.Bitmap scale(android.graphics.Bitmap r7, int r8, int r9) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r8 = (float) r8
            float r0 = (float) r3
            float r8 = r8 / r0
            float r9 = (float) r9
            float r0 = (float) r4
            float r9 = r9 / r0
            r5.postScale(r8, r9)
            r2 = 0
            r6 = 1
            r1 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static android.graphics.Bitmap yuv2Bitmap(byte[] r13, int r14, int r15) {
            int r0 = r14 * r15
            int[] r2 = new int[r0]
            r1 = 0
            r3 = 0
        L6:
            if (r3 >= r15) goto L83
            r4 = 0
        L9:
            if (r4 >= r14) goto L80
            int r5 = r3 * r14
            int r5 = r5 + r4
            r6 = r13[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            int r8 = r3 >> 1
            int r8 = r8 * r14
            int r8 = r8 + r0
            r9 = r4 & (-2)
            int r8 = r8 + r9
            r9 = r13[r8]
            r9 = r9 & r7
            int r8 = r8 + 1
            r8 = r13[r8]
            r8 = r8 & r7
            r10 = 16
            if (r6 >= r10) goto L29
            r6 = 16
        L29:
            int r6 = r6 - r10
            float r6 = (float) r6
            r11 = 1066728948(0x3f94fdf4, float:1.164)
            float r6 = r6 * r11
            int r8 = r8 + (-128)
            float r8 = (float) r8
            r11 = 1070352826(0x3fcc49ba, float:1.596)
            float r11 = r11 * r8
            float r11 = r11 + r6
            int r11 = java.lang.Math.round(r11)
            r12 = 1062215877(0x3f5020c5, float:0.813)
            float r8 = r8 * r12
            float r8 = r6 - r8
            int r9 = r9 + (-128)
            float r9 = (float) r9
            r12 = 1053307175(0x3ec83127, float:0.391)
            float r12 = r12 * r9
            float r8 = r8 - r12
            int r8 = java.lang.Math.round(r8)
            r12 = 1073817321(0x400126e9, float:2.018)
            float r9 = r9 * r12
            float r6 = r6 + r9
            int r6 = java.lang.Math.round(r6)
            if (r11 >= 0) goto L5f
            r11 = 0
            goto L63
        L5f:
            if (r11 <= r7) goto L63
            r11 = 255(0xff, float:3.57E-43)
        L63:
            if (r8 >= 0) goto L67
            r8 = 0
            goto L6b
        L67:
            if (r8 <= r7) goto L6b
            r8 = 255(0xff, float:3.57E-43)
        L6b:
            if (r6 >= 0) goto L6f
            r7 = 0
            goto L73
        L6f:
            if (r6 <= r7) goto L72
            goto L73
        L72:
            r7 = r6
        L73:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r7 = r7 << r10
            int r7 = r7 + r6
            int r6 = r8 << 8
            int r7 = r7 + r6
            int r7 = r7 + r11
            r2[r5] = r7
            int r4 = r4 + 1
            goto L9
        L80:
            int r3 = r3 + 1
            goto L6
        L83:
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r14, r15, r13)
            r5 = 0
            r6 = 0
            r3 = 0
            r7 = r14
            r4 = r14
            r8 = r15
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }
}
