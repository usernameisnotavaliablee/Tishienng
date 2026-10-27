package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b0 {
    private static final java.lang.String a = "/MyPhoto";
    public static final java.lang.String b = "yyyyMMddHHmmss";
    public static final java.lang.String c = ".png";

    private b0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1, android.content.Context r2) {
            int r0 = e(r1)
            android.graphics.Bitmap r1 = b(r1)
            android.graphics.Bitmap r1 = f(r0, r1)
            java.lang.String r1 = h(r1, r2)
            return r1
    }

    public static android.graphics.Bitmap b(java.lang.String r2) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 0
            r0.inJustDecodeBounds = r1
            r1 = 10
            r0.inSampleSize = r1
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2, r0)
            return r2
    }

    private static java.lang.String c(android.content.Context r2) {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            boolean r0 = android.os.Environment.isExternalStorageRemovable()
            if (r0 != 0) goto L13
            goto L1c
        L13:
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r2 = r2.getPath()
            return r2
        L1c:
            java.io.File r2 = r2.getExternalCacheDir()
            java.lang.String r2 = r2.getPath()
            return r2
    }

    public static java.lang.String d(android.content.Context r4) {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = c(r4)
            r1.append(r4)
            java.lang.String r4 = "/MyPhoto"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L23
            r0.mkdirs()
        L23:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMddHHmmss"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r4.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r4 = r4.format(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ".png"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static int e(java.lang.String r2) {
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

    public static android.graphics.Bitmap f(int r7, android.graphics.Bitmap r8) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r7 = (float) r7
            r5.postRotate(r7)
            int r3 = r8.getWidth()     // Catch: java.lang.OutOfMemoryError -> L1a
            int r4 = r8.getHeight()     // Catch: java.lang.OutOfMemoryError -> L1a
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r8
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.OutOfMemoryError -> L1b
            goto L1c
        L1a:
            r0 = r8
        L1b:
            r7 = 0
        L1c:
            if (r7 != 0) goto L1f
            r7 = r0
        L1f:
            if (r0 == r7) goto L24
            r0.recycle()
        L24:
            return r7
    }

    public static java.lang.String g(java.lang.String r4, android.graphics.Bitmap r5) {
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L17
            r3 = 100
            r5.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L17
            r1.close()     // Catch: java.lang.Exception -> L13
            r5.recycle()     // Catch: java.lang.Exception -> L13
        L13:
            return r4
        L14:
            r4 = move-exception
            r0 = r1
            goto L1e
        L17:
            goto L29
        L19:
            r4 = move-exception
            goto L1e
        L1b:
            r1 = r0
            goto L29
        L1e:
            if (r0 == 0) goto L23
            r0.close()     // Catch: java.lang.Exception -> L28
        L23:
            if (r5 == 0) goto L28
            r5.recycle()     // Catch: java.lang.Exception -> L28
        L28:
            throw r4
        L29:
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.lang.Exception -> L33
        L2e:
            if (r5 == 0) goto L33
            r5.recycle()     // Catch: java.lang.Exception -> L33
        L33:
            return r0
    }

    public static java.lang.String h(android.graphics.Bitmap r4, android.content.Context r5) {
            java.lang.String r5 = d(r5)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r1.close()     // Catch: java.lang.Exception -> L17
            r4.recycle()     // Catch: java.lang.Exception -> L17
        L17:
            return r5
        L18:
            r5 = move-exception
            r0 = r1
            goto L22
        L1b:
            goto L2d
        L1d:
            r5 = move-exception
            goto L22
        L1f:
            r1 = r0
            goto L2d
        L22:
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.lang.Exception -> L2c
        L27:
            if (r4 == 0) goto L2c
            r4.recycle()     // Catch: java.lang.Exception -> L2c
        L2c:
            throw r5
        L2d:
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.lang.Exception -> L37
        L32:
            if (r4 == 0) goto L37
            r4.recycle()     // Catch: java.lang.Exception -> L37
        L37:
            return r0
    }
}
