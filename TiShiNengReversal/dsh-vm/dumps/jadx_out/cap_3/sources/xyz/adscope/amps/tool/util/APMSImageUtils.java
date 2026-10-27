package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class APMSImageUtils {
    public APMSImageUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int[] calculateHistogram(android.graphics.Bitmap r10) {
            int r3 = r10.getWidth()
            int r7 = r10.getHeight()
            r0 = 64
            int[] r8 = new int[r0]
            int r9 = r3 * r7
            int[] r1 = new int[r9]
            r4 = 0
            r5 = 0
            r2 = 0
            r6 = r3
            r0 = r10
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            r10 = 0
        L19:
            if (r10 >= r9) goto L3c
            r0 = r1[r10]
            int r2 = r0 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> 6
            int r3 = r3 >> 6
            int r0 = r0 >> 6
            int r2 = r2 << 4
            int r3 = r3 << 2
            r2 = r2 | r3
            r0 = r0 | r2
            r2 = r8[r0]
            int r2 = r2 + 1
            r8[r0] = r2
            int r10 = r10 + 1
            goto L19
        L3c:
            return r8
    }

    private static int calculateInSampleSize(android.graphics.BitmapFactory.Options r3, int r4, int r5) {
            int r0 = r3.outHeight
            int r3 = r3.outWidth
            r1 = 1
            if (r0 > r5) goto Lb
            if (r3 <= r4) goto La
            goto Lb
        La:
            return r1
        Lb:
            int r0 = r0 / 2
            int r3 = r3 / 2
        Lf:
            int r2 = r0 / r1
            if (r2 < r5) goto L1a
            int r2 = r3 / r1
            if (r2 < r4) goto L1a
            int r1 = r1 * 2
            goto Lf
        L1a:
            return r1
    }

    public static float calculateSimilarityBalanced(android.graphics.Bitmap r1, android.graphics.Bitmap r2) {
            r0 = 64
            android.graphics.Bitmap r1 = createThumbnail(r1, r0)
            android.graphics.Bitmap r2 = createThumbnail(r2, r0)
            int[] r1 = calculateHistogram(r1)
            int[] r2 = calculateHistogram(r2)
            float r1 = compareHistograms(r1, r2)
            return r1
    }

    public static float calculateSimilarityFast(android.graphics.Bitmap r1, android.graphics.Bitmap r2) {
            r0 = 32
            android.graphics.Bitmap r1 = createThumbnail(r1, r0)
            android.graphics.Bitmap r2 = createThumbnail(r2, r0)
            float r1 = comparePixels(r1, r2)
            return r1
    }

    private static float compareHistograms(int[] r12, int[] r13) {
            r0 = 0
            r2 = 0
            r4 = r0
            r6 = r4
            r3 = 0
        L6:
            int r8 = r12.length
            if (r3 >= r8) goto L14
            r8 = r12[r3]
            double r8 = (double) r8
            double r4 = r4 + r8
            r8 = r13[r3]
            double r8 = (double) r8
            double r6 = r6 + r8
            int r3 = r3 + 1
            goto L6
        L14:
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L34
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 != 0) goto L1d
            goto L34
        L1d:
            int r3 = r12.length
            if (r2 >= r3) goto L32
            r3 = r12[r2]
            double r8 = (double) r3
            double r8 = r8 / r4
            r3 = r13[r2]
            double r10 = (double) r3
            double r10 = r10 / r6
            double r8 = r8 * r10
            double r8 = java.lang.Math.sqrt(r8)
            double r0 = r0 + r8
            int r2 = r2 + 1
            goto L1d
        L32:
            float r12 = (float) r0
            return r12
        L34:
            r12 = 0
            return r12
    }

    private static float comparePixels(android.graphics.Bitmap r10, android.graphics.Bitmap r11) {
            int r3 = r10.getWidth()
            int r7 = r10.getHeight()
            int r8 = r3 * r7
            int r0 = r11.getWidth()
            if (r3 != r0) goto L66
            int r0 = r11.getHeight()
            if (r7 == r0) goto L17
            goto L66
        L17:
            int[] r1 = new int[r8]
            int[] r9 = new int[r8]
            r4 = 0
            r5 = 0
            r2 = 0
            r6 = r3
            r0 = r10
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            r10 = r1
            r0 = r11
            r1 = r9
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            r11 = 0
            r0 = 0
        L2b:
            if (r11 >= r8) goto L5f
            r2 = r10[r11]
            int r3 = r2 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r5 = r1[r11]
            int r6 = r5 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r5 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r3 = r3 - r6
            int r3 = java.lang.Math.abs(r3)
            int r4 = r4 - r7
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            int r3 = r3 + r2
            r2 = 25
            if (r3 <= r2) goto L5c
            int r0 = r0 + 1
        L5c:
            int r11 = r11 + 1
            goto L2b
        L5f:
            float r10 = (float) r0
            float r11 = (float) r8
            float r10 = r10 / r11
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 - r10
            return r11
        L66:
            r10 = 0
            return r10
    }

    private static android.graphics.Bitmap createThumbnail(android.graphics.Bitmap r7, int r8) {
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            float r8 = (float) r8
            float r0 = (float) r3
            float r0 = r8 / r0
            float r1 = (float) r4
            float r8 = r8 / r1
            float r8 = java.lang.Math.min(r0, r8)
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r8, r8)
            r2 = 0
            r6 = 1
            r1 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static android.graphics.Bitmap decodeSampledBitmap(java.io.File r3) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            r1 = 1
            r0.inJustDecodeBounds = r1     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L29
            android.graphics.BitmapFactory.decodeFile(r1, r0)     // Catch: java.lang.Throwable -> L29
            r1 = 1024(0x400, float:1.435E-42)
            int r1 = calculateInSampleSize(r0, r1, r1)     // Catch: java.lang.Throwable -> L29
            r0.inSampleSize = r1     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r0.inJustDecodeBounds = r1     // Catch: java.lang.Throwable -> L29
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L29
            r0.inPreferredConfig = r2     // Catch: java.lang.Throwable -> L29
            r0.inMutable = r1     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L29
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch: java.lang.Throwable -> L29
            return r3
        L29:
            r3 = 0
            return r3
    }
}
