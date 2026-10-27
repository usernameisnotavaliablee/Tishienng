package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r4.compress(r1, r2, r0)
            r1 = 100
        Le:
            byte[] r3 = r0.toByteArray()
            int r3 = r3.length
            int r3 = r3 / 1024
            if (r3 <= r2) goto L22
            r0.reset()
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
            r4.compress(r3, r1, r0)
            int r1 = r1 + (-10)
            goto Le
        L22:
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.toByteArray()
            r4.<init>(r0)
            r0 = 0
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4, r0, r0)
            return r4
    }

    public static android.graphics.BitmapFactory.Options b(int r2) {
            java.lang.System.gc()
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inPurgeable = r1
            r0.inSampleSize = r2
            return r0
    }

    public static int c(java.lang.String r2) {
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch: java.io.IOException -> L20
            r0.<init>(r2)     // Catch: java.io.IOException -> L20
            java.lang.String r2 = "Orientation"
            r1 = 1
            int r2 = r0.getAttributeInt(r2, r1)     // Catch: java.io.IOException -> L20
            r0 = 3
            if (r2 == r0) goto L1d
            r0 = 6
            if (r2 == r0) goto L1a
            r0 = 8
            if (r2 == r0) goto L17
            goto L20
        L17:
            r2 = 270(0x10e, float:3.78E-43)
            return r2
        L1a:
            r2 = 90
            return r2
        L1d:
            r2 = 180(0xb4, float:2.52E-43)
            return r2
        L20:
            r2 = 0
            return r2
    }

    public static android.graphics.Bitmap d(int r7, android.graphics.Bitmap r8) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r7 = (float) r7
            r5.postRotate(r7)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r8
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static void e(java.lang.String r2, android.graphics.Bitmap r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L1f
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L1f
            r1.<init>(r0)     // Catch: java.io.IOException -> L1f
            r2.<init>(r1)     // Catch: java.io.IOException -> L1f
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L1f
            r1 = 100
            r3.compress(r0, r1, r2)     // Catch: java.io.IOException -> L1f
            r2.flush()     // Catch: java.io.IOException -> L1f
            r2.close()     // Catch: java.io.IOException -> L1f
            r3.recycle()     // Catch: java.io.IOException -> L1f
        L1f:
            return
    }
}
