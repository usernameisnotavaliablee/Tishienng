package com.huawei.hms.ml.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ImageConvertUtils {
    public static final int INDEX_PLANE_U = 1;
    public static final int INDEX_PLANE_V = 2;
    public static final int INDEX_PLANE_Y = 0;
    private static final com.huawei.hms.ml.common.utils.ImageConvertUtils INSTANCE = null;
    public static final int YUV_FORMAT_I420 = 1;
    public static final int YUV_FORMAT_NV21 = 2;

    static {
            com.huawei.hms.ml.common.utils.ImageConvertUtils r0 = new com.huawei.hms.ml.common.utils.ImageConvertUtils
            r0.<init>()
            com.huawei.hms.ml.common.utils.ImageConvertUtils.INSTANCE = r0
            return
    }

    private ImageConvertUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static byte[] argbToNv21(int[] r17, int r18, int r19) {
            r0 = r18
            r1 = r19
            int r2 = r0 * r1
            int r3 = r2 * 3
            int r3 = r3 / 2
            byte[] r4 = new byte[r3]
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L10:
            if (r6 >= r1) goto L8d
            r9 = 0
        L13:
            if (r9 >= r0) goto L8a
            r10 = r17[r8]
            r11 = 16711680(0xff0000, float:2.3418052E-38)
            r11 = r11 & r10
            int r11 = r11 >> 16
            r12 = 65280(0xff00, float:9.1477E-41)
            r12 = r12 & r10
            int r12 = r12 >> 8
            r13 = 255(0xff, float:3.57E-43)
            r10 = r10 & r13
            int r14 = r11 * 66
            int r15 = r12 * 129
            int r14 = r14 + r15
            int r15 = r10 * 25
            int r14 = r14 + r15
            int r14 = r14 + 128
            int r14 = r14 >> 8
            int r14 = r14 + 16
            int r15 = r11 * (-38)
            int r16 = r12 * 74
            int r15 = r15 - r16
            int r16 = r10 * 112
            int r15 = r15 + r16
            int r15 = r15 + 128
            int r15 = r15 >> 8
            int r15 = r15 + 128
            int r11 = r11 * 112
            int r12 = r12 * 94
            int r11 = r11 - r12
            int r10 = r10 * 18
            int r11 = r11 - r10
            int r11 = r11 + 128
            int r10 = r11 >> 8
            int r10 = r10 + 128
            int r11 = r7 + 1
            if (r14 >= 0) goto L57
            r14 = 0
            goto L5b
        L57:
            if (r14 <= r13) goto L5b
            r14 = 255(0xff, float:3.57E-43)
        L5b:
            byte r12 = (byte) r14
            r4[r7] = r12
            int r7 = r6 % 2
            if (r7 != 0) goto L84
            int r7 = r8 % 2
            if (r7 != 0) goto L84
            int r7 = r3 + (-2)
            if (r2 >= r7) goto L84
            int r7 = r2 + 1
            if (r10 >= 0) goto L70
            r10 = 0
            goto L74
        L70:
            if (r10 <= r13) goto L74
            r10 = 255(0xff, float:3.57E-43)
        L74:
            byte r10 = (byte) r10
            r4[r2] = r10
            int r2 = r2 + 2
            if (r15 >= 0) goto L7d
            r13 = 0
            goto L81
        L7d:
            if (r15 <= r13) goto L80
            goto L81
        L80:
            r13 = r15
        L81:
            byte r10 = (byte) r13
            r4[r7] = r10
        L84:
            int r8 = r8 + 1
            int r9 = r9 + 1
            r7 = r11
            goto L13
        L8a:
            int r6 = r6 + 1
            goto L10
        L8d:
            return r4
    }

    public static byte[] bitmap2Jpeg(android.graphics.Bitmap r2, int r3) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L1e
            r0.<init>()     // Catch: java.io.IOException -> L1e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L12
            r2.compress(r1, r3, r0)     // Catch: java.lang.Throwable -> L12
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L12
            r0.close()     // Catch: java.io.IOException -> L1e
            return r2
        L12:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L1e
        L1d:
            throw r3     // Catch: java.io.IOException -> L1e
        L1e:
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }

    public static byte[] bitmapToNv21(android.graphics.Bitmap r9, int r10, int r11) {
            if (r9 == 0) goto L21
            int r0 = r9.getWidth()
            if (r0 < r10) goto L21
            int r0 = r9.getHeight()
            if (r0 < r11) goto L21
            int r0 = r10 * r11
            int[] r2 = new int[r0]
            r5 = 0
            r6 = 0
            r3 = 0
            r7 = r10
            r1 = r9
            r4 = r10
            r8 = r11
            r1.getPixels(r2, r3, r4, r5, r6, r7, r8)
            byte[] r9 = argbToNv21(r2, r4, r8)
            return r9
        L21:
            r9 = 0
            byte[] r9 = new byte[r9]
            return r9
    }

    public static byte[] buffer2Byte(java.nio.ByteBuffer r3) {
            r3.rewind()
            int r0 = r3.limit()
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.get(r1, r2, r0)
            return r1
    }

    public static byte[] byteToNv21(byte[] r8) {
            int r0 = r8.length
            int r1 = r0 * 2
            int r1 = r1 / 3
            int r2 = r0 - r1
            int r3 = r0 / 6
            byte[] r0 = new byte[r0]
            r4 = 0
            java.lang.System.arraycopy(r8, r4, r0, r4, r1)
        Lf:
            if (r4 >= r2) goto L2d
            int r5 = r4 % 2
            if (r5 != 0) goto L1f
            int r5 = r1 + r4
            int r6 = r4 / 2
            int r6 = r6 + r1
            r6 = r8[r6]
            r0[r5] = r6
            goto L2a
        L1f:
            int r5 = r1 + r4
            int r6 = r1 + r3
            int r7 = r4 / 2
            int r6 = r6 + r7
            r6 = r8[r6]
            r0[r5] = r6
        L2a:
            int r4 = r4 + 1
            goto Lf
        L2d:
            return r0
    }

    private static void checkFormat(android.media.Image r2, int r3) {
            r0 = 1
            if (r3 == r0) goto Lf
            r0 = 2
            if (r3 != r0) goto L7
            goto Lf
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "only support YUV_FORMAT_I420 and YUV_FORMAT_NV21"
            r2.<init>(r3)
            throw r2
        Lf:
            boolean r3 = isImageFormatSupported(r2)
            if (r3 == 0) goto L16
            return
        L16:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "can't convert Image to byte array, format "
            r0.append(r1)
            int r2 = r2.getFormat()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    private static int getChannelOffset(int r2, int r3, int r4) {
            if (r2 == 0) goto L13
            r0 = 1
            if (r2 == r0) goto Le
            if (r3 != r0) goto L10
            double r2 = (double) r4
            r0 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r2 = r2 * r0
            int r2 = (int) r2
            return r2
        Le:
            if (r3 != r0) goto L11
        L10:
            return r4
        L11:
            int r4 = r4 + r0
            return r4
        L13:
            r2 = 0
            return r2
    }

    @android.annotation.TargetApi(21)
    public static byte[] getDataFromImage(android.media.Image r20, int r21) {
            r0 = r21
            checkFormat(r20, r21)
            android.graphics.Rect r1 = r20.getCropRect()
            int r2 = r20.getFormat()
            int r3 = r1.width()
            int r4 = r1.height()
            android.media.Image$Plane[] r5 = r20.getPlanes()
            int r6 = r3 * r4
            int r2 = android.graphics.ImageFormat.getBitsPerPixel(r2)
            int r2 = r2 * r6
            int r2 = r2 / 8
            byte[] r2 = new byte[r2]
            r7 = 0
            r8 = r5[r7]
            int r8 = r8.getRowStride()
            byte[] r8 = new byte[r8]
            r9 = 0
        L2f:
            int r10 = r5.length
            if (r9 >= r10) goto Lb8
            r10 = r5[r9]
            java.nio.ByteBuffer r10 = r10.getBuffer()
            r11 = r5[r9]
            int r11 = r11.getRowStride()
            r12 = r5[r9]
            int r12 = r12.getPixelStride()
            int r13 = getChannelOffset(r9, r0, r6)
            int r14 = getOutputStride(r9, r0)
            if (r9 != 0) goto L51
            r16 = 0
            goto L53
        L51:
            r16 = 1
        L53:
            int r7 = r3 >> r16
            int r15 = r4 >> r16
            int r0 = r1.top
            int r0 = r0 >> r16
            int r0 = r0 * r11
            r18 = r0
            int r0 = r1.left
            int r0 = r0 >> r16
            int r0 = r0 * r12
            int r0 = r18 + r0
            r10.position(r0)
            r0 = 0
        L6b:
            if (r0 >= r15) goto Lad
            r16 = r1
            r1 = 1
            if (r12 != r1) goto L7f
            if (r14 == r1) goto L75
            goto L7f
        L75:
            r10.get(r2, r13, r7)
            int r13 = r13 + r7
            r17 = r2
            r1 = r7
            r18 = 1
            goto L99
        L7f:
            int r17 = r7 + (-1)
            int r17 = r17 * r12
            r18 = 1
            int r1 = r17 + 1
            r17 = r2
            r2 = 0
            r10.get(r8, r2, r1)
        L8d:
            if (r2 >= r7) goto L99
            int r19 = r2 * r12
            r19 = r8[r19]
            r17[r13] = r19
            int r13 = r13 + r14
            int r2 = r2 + 1
            goto L8d
        L99:
            int r2 = r15 + (-1)
            if (r0 >= r2) goto La6
            int r2 = r10.position()
            int r2 = r2 + r11
            int r2 = r2 - r1
            r10.position(r2)
        La6:
            int r0 = r0 + 1
            r1 = r16
            r2 = r17
            goto L6b
        Lad:
            r16 = r1
            r17 = r2
            int r9 = r9 + 1
            r0 = r21
            r7 = 0
            goto L2f
        Lb8:
            r17 = r2
            return r17
    }

    public static com.huawei.hms.ml.common.utils.ImageConvertUtils getInstance() {
            com.huawei.hms.ml.common.utils.ImageConvertUtils r0 = com.huawei.hms.ml.common.utils.ImageConvertUtils.INSTANCE
            return r0
    }

    private static int getOutputStride(int r1, int r2) {
            r0 = 1
            if (r1 != 0) goto L4
            return r0
        L4:
            if (r2 != r0) goto L7
            return r0
        L7:
            r1 = 2
            return r1
    }

    private static boolean isImageFormatSupported(android.media.Image r1) {
            int r1 = r1.getFormat()
            r0 = 35
            if (r1 == r0) goto L14
            r0 = 17
            if (r1 == r0) goto L14
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 != r0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static byte[] nv21ToGray(byte[] r2, int r3, int r4) {
            int r3 = r3 * r4
            int r4 = r3 / 2
            byte[] r0 = new byte[r4]
            r1 = -128(0xffffffffffffff80, float:NaN)
            java.util.Arrays.fill(r0, r1)
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            return r2
    }

    public static byte[] nv21ToJpeg(byte[] r9, int r10, int r11) {
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L32
            r2.<init>()     // Catch: java.io.IOException -> L32
            android.graphics.YuvImage r3 = new android.graphics.YuvImage     // Catch: java.lang.Throwable -> L23
            r5 = 17
            r8 = 0
            r4 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L23
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L23
            r9.<init>(r1, r1, r6, r7)     // Catch: java.lang.Throwable -> L23
            r10 = 100
            r3.compressToJpeg(r9, r10, r2)     // Catch: java.lang.Throwable -> L23
            byte[] r9 = r2.toByteArray()     // Catch: java.lang.Throwable -> L23
            r2.close()     // Catch: java.io.IOException -> L32
            return r9
        L23:
            r0 = move-exception
            r9 = r0
            throw r9     // Catch: java.lang.Throwable -> L26
        L26:
            r0 = move-exception
            r10 = r0
            r2.close()     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r0 = move-exception
            r11 = r0
            r9.addSuppressed(r11)     // Catch: java.io.IOException -> L32
        L31:
            throw r10     // Catch: java.io.IOException -> L32
        L32:
            byte[] r9 = new byte[r1]
            return r9
    }

    public static byte[] yuv2Buffer(android.media.Image r8) {
            android.media.Image$Plane[] r8 = r8.getPlanes()
            r0 = 0
            r1 = r8[r0]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            r2 = 1
            r2 = r8[r2]
            java.nio.ByteBuffer r2 = r2.getBuffer()
            r3 = 2
            r8 = r8[r3]
            java.nio.ByteBuffer r8 = r8.getBuffer()
            int r3 = r1.remaining()
            int r4 = r2.remaining()
            int r5 = r8.remaining()
            int r6 = r3 + r4
            int r6 = r6 + r5
            byte[] r7 = new byte[r6]
            r1.get(r7, r0, r3)
            r8.get(r7, r3, r5)
            int r6 = r6 - r4
            r2.get(r7, r6, r4)
            return r7
    }
}
