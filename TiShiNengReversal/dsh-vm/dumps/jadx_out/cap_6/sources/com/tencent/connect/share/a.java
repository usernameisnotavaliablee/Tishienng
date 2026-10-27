package com.tencent.connect.share;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {



    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final int a(android.graphics.BitmapFactory.Options r0, int r1, int r2) {
            int r0 = b(r0, r1, r2)
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

    private static android.graphics.Bitmap a(android.graphics.Bitmap r7, int r8) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            if (r0 <= r1) goto L10
            goto L11
        L10:
            r0 = r1
        L11:
            float r8 = (float) r8
            float r0 = (float) r0
            float r8 = r8 / r0
            r5.postScale(r8, r8)
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final android.graphics.Bitmap a(java.lang.String r6, int r7) {
            java.lang.String r0 = "openSDK_LOG.AsynScaleCompressImage"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r3 = 1
            r1.inJustDecodeBounds = r3
            android.graphics.BitmapFactory.decodeFile(r6, r1)     // Catch: java.lang.OutOfMemoryError -> L16
            goto L1c
        L16:
            r3 = move-exception
            java.lang.String r4 = "scaleBitmap exception1:"
            com.tencent.open.log.SLog.e(r0, r4, r3)
        L1c:
            int r3 = r1.outWidth
            int r4 = r1.outHeight
            boolean r5 = r1.mCancel
            if (r5 != 0) goto L69
            r5 = -1
            if (r3 == r5) goto L69
            if (r4 != r5) goto L2a
            goto L69
        L2a:
            if (r3 <= r4) goto L2d
            goto L2e
        L2d:
            r3 = r4
        L2e:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r4
            if (r3 <= r7) goto L3c
            int r3 = r7 * r7
            int r3 = a(r1, r5, r3)
            r1.inSampleSize = r3
        L3c:
            r3 = 0
            r1.inJustDecodeBounds = r3
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6, r1)     // Catch: java.lang.OutOfMemoryError -> L44 java.lang.Exception -> L4b
            goto L52
        L44:
            r6 = move-exception
            java.lang.String r3 = "scaleBitmap OutOfMemoryError:"
            com.tencent.open.log.SLog.e(r0, r3, r6)
            goto L51
        L4b:
            r6 = move-exception
            java.lang.String r3 = "scaleBitmap exception2:"
            com.tencent.open.log.SLog.e(r0, r3, r6)
        L51:
            r6 = r2
        L52:
            if (r6 != 0) goto L5a
            java.lang.String r6 = "scaleBitmap return null"
            com.tencent.open.log.SLog.e(r0, r6)
            return r2
        L5a:
            int r0 = r1.outWidth
            int r1 = r1.outHeight
            if (r0 <= r1) goto L61
            goto L62
        L61:
            r0 = r1
        L62:
            if (r0 <= r7) goto L68
            android.graphics.Bitmap r6 = a(r6, r7)
        L68:
            return r6
        L69:
            return r2
    }

    protected static final java.lang.String a(android.graphics.Bitmap r2, java.lang.String r3, java.lang.String r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Le
            r0.mkdirs()
        Le:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L28
            r4.delete()
        L28:
            if (r2 == 0) goto L40
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L40
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L40
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L40
            r1 = 80
            r2.compress(r4, r1, r0)     // Catch: java.lang.Throwable -> L40
            r0.flush()     // Catch: java.lang.Throwable -> L40
            r0.close()     // Catch: java.lang.Throwable -> L40
            r2.recycle()     // Catch: java.lang.Throwable -> L40
            return r3
        L40:
            r2 = 0
            return r2
    }

    public static final void a(android.content.Context r2, java.lang.String r3, com.tencent.open.utils.d r4) {
            java.lang.String r0 = "openSDK_LOG.AsynScaleCompressImage"
            java.lang.String r1 = "scaleCompressImage()"
            com.tencent.open.log.SLog.i(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L13
            r2 = 1
            r4.a(r2, r1)
            return
        L13:
            boolean r0 = com.tencent.open.utils.m.a()
            if (r0 != 0) goto L1e
            r2 = 2
            r4.a(r2, r1)
            return
        L1e:
            com.tencent.connect.share.a$1 r0 = new com.tencent.connect.share.a$1
            android.os.Looper r1 = r2.getMainLooper()
            r0.<init>(r1, r4)
            java.lang.Thread r4 = new java.lang.Thread
            com.tencent.connect.share.a$2 r1 = new com.tencent.connect.share.a$2
            r1.<init>(r3, r0, r2)
            r4.<init>(r1)
            r4.start()
            return
    }

    static /* synthetic */ boolean a(java.lang.String r0, int r1, int r2) {
            boolean r0 = b(r0, r1, r2)
            return r0
    }

    private static int b(android.graphics.BitmapFactory.Options r9, int r10, int r11) {
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

    private static final boolean b(java.lang.String r7, int r8, int r9) {
            java.lang.String r0 = "openSDK_LOG.AsynScaleCompressImage"
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r3 = 1
            r1.inJustDecodeBounds = r3
            android.graphics.BitmapFactory.decodeFile(r7, r1)     // Catch: java.lang.OutOfMemoryError -> L16
            goto L1c
        L16:
            r7 = move-exception
            java.lang.String r4 = "isBitMapNeedToCompress exception:"
            com.tencent.open.log.SLog.e(r0, r4, r7)
        L1c:
            int r7 = r1.outWidth
            int r4 = r1.outHeight
            boolean r5 = r1.mCancel
            if (r5 != 0) goto L5a
            r5 = -1
            if (r7 == r5) goto L5a
            if (r4 != r5) goto L2a
            goto L5a
        L2a:
            if (r7 <= r4) goto L2e
            r5 = r7
            goto L2f
        L2e:
            r5 = r4
        L2f:
            if (r7 >= r4) goto L32
            goto L33
        L32:
            r7 = r4
        L33:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "longSide="
            r4.append(r6)
            r4.append(r5)
            java.lang.String r6 = "shortSide="
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.open.log.SLog.d(r0, r4)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r0
            if (r5 > r9) goto L59
            if (r7 <= r8) goto L58
            goto L59
        L58:
            return r2
        L59:
            return r3
        L5a:
            return r2
    }
}
