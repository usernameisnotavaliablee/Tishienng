package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class BitmapUtils {
    private static final java.lang.String TAG = "BitmapUtils";

    public BitmapUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap cut(android.graphics.Bitmap r12, android.graphics.Point[] r13, int r14) {
            r0 = 0
            if (r12 == 0) goto L89
            if (r13 == 0) goto L89
            int r1 = r13.length
            r2 = 4
            if (r1 == r2) goto Lb
            goto L89
        Lb:
            int r1 = r13.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L18
            r4 = r13[r3]
            if (r4 != 0) goto L15
            return r0
        L15:
            int r3 = r3 + 1
            goto Le
        L18:
            r5 = r13[r2]
            r0 = 1
            r1 = r13[r0]
            r2 = 2
            r6 = r13[r2]
            int r13 = r1.y
            int r2 = r5.y
            int r13 = r13 - r2
            double r2 = (double) r13
            int r13 = r1.x
            int r1 = r5.x
            int r13 = r13 - r1
            double r7 = (double) r13
            double r1 = java.lang.Math.atan2(r2, r7)
            double r3 = java.lang.Math.toDegrees(r1)
            float r13 = (float) r3
            int r3 = (int) r13
            int r3 = java.lang.Math.abs(r3)
            if (r3 > 0) goto L45
            r7 = 0
            r8 = 0
            r4 = r12
            r9 = r14
            android.graphics.Bitmap r12 = cutPaddingExtendRect(r4, r5, r6, r7, r8, r9)
            return r12
        L45:
            r3 = r12
            r12 = r14
            r14 = r5
            r10 = r6
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Point r11 = new android.graphics.Point
            int r4 = r6 >> 1
            int r5 = r7 >> 1
            r11.<init>(r4, r5)
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            float r13 = -r13
            float r4 = (float) r4
            float r5 = (float) r5
            r8.setRotate(r13, r4, r5)
            r5 = 0
            r9 = 1
            r4 = 0
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            int r4 = r13.getWidth()
            int r5 = r13.getHeight()
            int r4 = r4 - r6
            int r6 = r4 >> 1
            int r5 = r5 - r7
            int r7 = r5 >> 1
            android.graphics.Point r4 = rotateCoordinate(r3, r11, r14, r1)
            android.graphics.Point r5 = rotateCoordinate(r3, r11, r10, r1)
            r8 = r12
            r3 = r13
            android.graphics.Bitmap r12 = cutPaddingExtendRect(r3, r4, r5, r6, r7, r8)
            return r12
        L89:
            return r0
    }

    private static android.graphics.Bitmap cutPaddingExtendRect(android.graphics.Bitmap r4, android.graphics.Point r5, android.graphics.Point r6, int r7, int r8, int r9) {
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            int r2 = r5.x
            int r2 = r2 + r7
            int r2 = r2 - r9
            r3 = 0
            if (r2 >= 0) goto L10
            r2 = 0
        L10:
            int r5 = r5.y
            int r5 = r5 + r8
            int r5 = r5 - r9
            if (r5 >= 0) goto L17
            goto L18
        L17:
            r3 = r5
        L18:
            int r5 = r6.x
            int r5 = r5 + r7
            int r5 = r5 + r9
            if (r5 <= r0) goto L1f
            goto L20
        L1f:
            r0 = r5
        L20:
            int r5 = r6.y
            int r5 = r5 + r8
            int r5 = r5 + r9
            if (r5 <= r1) goto L27
            goto L28
        L27:
            r1 = r5
        L28:
            int r0 = r0 - r2
            int r1 = r1 - r3
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r2, r3, r0, r1)
            return r4
    }

    public static android.graphics.Bitmap getBitmap(java.nio.ByteBuffer r10, com.huawei.hms.mlsdk.common.MLFrame.Property r11) {
            r1 = 1
            r2 = 0
            r3 = 0
            r10.rewind()     // Catch: java.lang.Throwable -> L56
            int r0 = r10.limit()     // Catch: java.lang.Throwable -> L56
            byte[] r5 = new byte[r0]     // Catch: java.lang.Throwable -> L56
            r10.get(r5, r2, r0)     // Catch: java.lang.Throwable -> L56
            android.graphics.YuvImage r4 = new android.graphics.YuvImage     // Catch: java.lang.Throwable -> L56
            int r7 = r11.getWidth()     // Catch: java.lang.Throwable -> L56
            int r8 = r11.getHeight()     // Catch: java.lang.Throwable -> L56
            r9 = 0
            r6 = 17
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L56
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L56
            r10.<init>()     // Catch: java.lang.Throwable -> L56
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L52
            int r3 = r11.getWidth()     // Catch: java.lang.Throwable -> L52
            int r5 = r11.getHeight()     // Catch: java.lang.Throwable -> L52
            r0.<init>(r2, r2, r3, r5)     // Catch: java.lang.Throwable -> L52
            r3 = 100
            r4.compressToJpeg(r0, r3, r10)     // Catch: java.lang.Throwable -> L52
            byte[] r0 = r10.toByteArray()     // Catch: java.lang.Throwable -> L52
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L52
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r3)     // Catch: java.lang.Throwable -> L52
            int r11 = r11.getQuadrant()     // Catch: java.lang.Throwable -> L52
            android.graphics.Bitmap r11 = rotateBitmap(r0, r11)     // Catch: java.lang.Throwable -> L52
            java.io.Closeable[] r0 = new java.io.Closeable[r1]
            r0[r2] = r10
            com.huawei.hms.ml.common.utils.StreamUtils.closeStreams(r0)
            return r11
        L52:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto L58
        L56:
            r0 = move-exception
            r11 = r0
        L58:
            java.io.Closeable[] r10 = new java.io.Closeable[r1]
            r10[r2] = r3
            com.huawei.hms.ml.common.utils.StreamUtils.closeStreams(r10)
            throw r11
    }

    public static android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap r7, int r8) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r0 = 1
            if (r8 == r0) goto L16
            r0 = 2
            if (r8 == r0) goto L13
            r0 = 3
            if (r8 == r0) goto L10
            r8 = 0
            goto L18
        L10:
            r8 = 270(0x10e, float:3.78E-43)
            goto L18
        L13:
            r8 = 180(0xb4, float:2.52E-43)
            goto L18
        L16:
            r8 = 90
        L18:
            float r8 = (float) r8
            r5.postRotate(r8)
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static android.graphics.Point rotateCoordinate(android.graphics.Bitmap r10, android.graphics.Point r11, android.graphics.Point r12, double r13) {
            int r10 = r10.getHeight()
            int r0 = r12.x
            int r12 = r12.y
            int r12 = r10 - r12
            int r1 = r11.x
            int r11 = r11.y
            int r11 = r10 - r11
            int r0 = r0 - r1
            double r2 = (double) r0
            double r4 = java.lang.Math.cos(r13)
            double r4 = r4 * r2
            int r12 = r12 - r11
            double r6 = (double) r12
            double r8 = java.lang.Math.sin(r13)
            double r8 = r8 * r6
            double r4 = r4 - r8
            double r0 = (double) r1
            double r4 = r4 + r0
            int r12 = (int) r4
            double r0 = java.lang.Math.sin(r13)
            double r2 = r2 * r0
            double r13 = java.lang.Math.cos(r13)
            double r6 = r6 * r13
            double r2 = r2 + r6
            double r13 = (double) r11
            double r2 = r2 + r13
            int r11 = (int) r2
            android.graphics.Point r13 = new android.graphics.Point
            int r10 = r10 - r11
            r13.<init>(r12, r10)
            return r13
    }
}
