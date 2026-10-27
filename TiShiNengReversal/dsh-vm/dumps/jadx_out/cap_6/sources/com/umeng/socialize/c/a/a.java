package com.umeng.socialize.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(com.umeng.socialize.media.UMImage r2) {
            int r0 = r2.getImageStyle()
            int r1 = com.umeng.socialize.media.UMImage.FILE_IMAGE
            if (r0 != r1) goto L11
            java.io.File r2 = r2.asFileImage()
            int r2 = a(r2)
            return r2
        L11:
            byte[] r2 = r2.asBinImage()
            int r2 = e(r2)
            return r2
    }

    private static int a(java.io.File r1) {
            if (r1 == 0) goto L12
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            int r1 = r0.available()     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.GET_IMAGE_SCALE_ERROR
            com.umeng.socialize.utils.SLog.error(r0, r1)
        L12:
            r1 = 0
            return r1
    }

    private static android.graphics.Bitmap a(android.graphics.drawable.Drawable r5) {
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r5.getOpacity()
            r3 = -1
            if (r2 == r3) goto L12
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L14
        L12:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L14:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            r4 = 0
            r5.setBounds(r4, r4, r0, r1)
            r5.draw(r3)
            return r2
    }

    public static android.graphics.Bitmap a(byte[] r2) {
            if (r2 == 0) goto L9
            r0 = 0
            int r1 = r2.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
            return r2
        L9:
            r2 = 0
            return r2
    }

    private static java.io.File a(byte[] r3, java.io.File r4) {
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r2.write(r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            r2.close()     // Catch: java.io.IOException -> L12
            return r4
        L12:
            r3 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r3)
            goto L2c
        L19:
            r3 = move-exception
            r0 = r2
            goto L2d
        L1c:
            r3 = move-exception
            r0 = r2
            goto L22
        L1f:
            r3 = move-exception
            goto L2d
        L21:
            r3 = move-exception
        L22:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.GET_FILE_FROM_BINARY     // Catch: java.lang.Throwable -> L1f
            com.umeng.socialize.utils.SLog.error(r1, r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L2c
            r0.close()     // Catch: java.io.IOException -> L12
        L2c:
            return r4
        L2d:
            if (r0 == 0) goto L39
            r0.close()     // Catch: java.io.IOException -> L33
            goto L39
        L33:
            r4 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r4)
        L39:
            throw r3
    }

    public static byte[] a(android.content.Context r5, int r6, boolean r7, android.graphics.Bitmap.CompressFormat r8) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 100
            r2 = 0
            if (r7 != 0) goto L20
            android.content.res.Resources r5 = r5.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6, r2)
            android.graphics.Bitmap r5 = a(r5)
            if (r5 == 0) goto L1b
            r5.compress(r8, r1, r0)
        L1b:
            byte[] r5 = r0.toByteArray()
            return r5
        L20:
            r7 = 0
            byte[] r7 = new byte[r7]
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Error -> L3e
            r3.<init>()     // Catch: java.lang.Error -> L3e
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Error -> L3e
            r3.inPreferredConfig = r4     // Catch: java.lang.Error -> L3e
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Error -> L3e
            java.io.InputStream r5 = r5.openRawResource(r6)     // Catch: java.lang.Error -> L3e
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5, r2, r3)     // Catch: java.lang.Error -> L3e
            if (r5 == 0) goto L40
            r5.compress(r8, r1, r0)     // Catch: java.lang.Error -> L3e
            goto L40
        L3e:
            r5 = move-exception
            goto L45
        L40:
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Error -> L3e
            return r5
        L45:
            java.lang.String r6 = com.umeng.socialize.utils.UmengText.IMAGE.TOOBIG
            com.umeng.socialize.utils.SLog.error(r6, r5)
            return r7
    }

    public static byte[] a(android.graphics.Bitmap r0, android.graphics.Bitmap.CompressFormat r1) {
            byte[] r0 = b(r0, r1)
            return r0
    }

    public static byte[] a(com.umeng.socialize.media.UMImage r9, int r10) {
            if (r9 != 0) goto L7
            byte[] r9 = com.umeng.socialize.utils.DefaultClass.getBytes()
            return r9
        L7:
            byte[] r0 = r9.asBinImage()
            if (r0 == 0) goto L90
            int r0 = a(r9)
            if (r0 >= r10) goto L15
            goto L90
        L15:
            com.umeng.socialize.media.UMImage$CompressStyle r0 = r9.compressStyle
            com.umeng.socialize.media.UMImage$CompressStyle r1 = com.umeng.socialize.media.UMImage.CompressStyle.QUALITY
            if (r0 == r1) goto L85
            byte[] r0 = r9.asBinImage()     // Catch: java.lang.Throwable -> L7c
            r1 = 1
            if (r0 != 0) goto L25
            byte[] r9 = new byte[r1]     // Catch: java.lang.Throwable -> L7c
            return r9
        L25:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L7c
            if (r2 > 0) goto L2d
            byte[] r9 = r9.asBinImage()     // Catch: java.lang.Throwable -> L7c
            return r9
        L2d:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r2)     // Catch: java.lang.Throwable -> L7c
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            int r5 = r0.length     // Catch: java.lang.Throwable -> L7c
            r4.write(r0, r3, r5)     // Catch: java.lang.Throwable -> L7c
        L3c:
            byte[] r3 = r4.toByteArray()     // Catch: java.lang.Throwable -> L7c
            int r3 = r3.length     // Catch: java.lang.Throwable -> L7c
            if (r3 <= r10) goto L72
            int r3 = r0.length     // Catch: java.lang.Throwable -> L7c
            double r5 = (double) r3     // Catch: java.lang.Throwable -> L7c
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 * r7
            double r7 = (double) r10     // Catch: java.lang.Throwable -> L7c
            double r5 = r5 / r7
            double r5 = java.lang.Math.sqrt(r5)     // Catch: java.lang.Throwable -> L7c
            int r3 = r2.getWidth()     // Catch: java.lang.Throwable -> L7c
            double r7 = (double) r3     // Catch: java.lang.Throwable -> L7c
            double r7 = r7 / r5
            int r3 = (int) r7     // Catch: java.lang.Throwable -> L7c
            int r7 = r2.getHeight()     // Catch: java.lang.Throwable -> L7c
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L7c
            double r7 = r7 / r5
            int r5 = (int) r7     // Catch: java.lang.Throwable -> L7c
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r2, r3, r5, r1)     // Catch: java.lang.Throwable -> L7c
            r4.reset()     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L3c
            android.graphics.Bitmap$CompressFormat r0 = r9.compressFormat     // Catch: java.lang.Throwable -> L7c
            r3 = 100
            r2.compress(r0, r3, r4)     // Catch: java.lang.Throwable -> L7c
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L7c
            goto L3c
        L72:
            byte[] r9 = r4.toByteArray()     // Catch: java.lang.Throwable -> L7c
            int r9 = r9.length     // Catch: java.lang.Throwable -> L7c
            if (r9 <= r10) goto L7b
            r9 = 0
            return r9
        L7b:
            return r0
        L7c:
            r9 = move-exception
            com.umeng.socialize.utils.SLog.error(r9)
            byte[] r9 = com.umeng.socialize.utils.DefaultClass.getBytes()
            return r9
        L85:
            byte[] r0 = r9.asBinImage()
            android.graphics.Bitmap$CompressFormat r9 = r9.compressFormat
            byte[] r9 = a(r0, r10, r9)
            return r9
        L90:
            byte[] r9 = r9.asBinImage()
            return r9
    }

    public static byte[] a(java.io.File r0, android.graphics.Bitmap.CompressFormat r1) {
            byte[] r0 = b(r0, r1)
            return r0
    }

    public static byte[] a(java.lang.String r0) {
            byte[] r0 = com.umeng.socialize.net.utils.SocializeNetUtils.getNetData(r0)
            return r0
    }

    public static byte[] a(byte[] r8, int r9, android.graphics.Bitmap.CompressFormat r10) {
            if (r8 == 0) goto L52
            int r0 = r8.length
            if (r0 < r9) goto L52
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r2, r1)
            r1 = 1
            r3 = 1
        L12:
            if (r2 != 0) goto L3a
            r4 = 10
            if (r3 > r4) goto L3a
            r4 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r6 = (double) r3
            double r4 = java.lang.Math.pow(r4, r6)
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            int r4 = (int) r4
            if (r8 == 0) goto L2c
            r8.compress(r10, r4, r0)
        L2c:
            int r4 = r0.size()
            if (r4 >= r9) goto L34
            r2 = 1
            goto L12
        L34:
            r0.reset()
            int r3 = r3 + 1
            goto L12
        L3a:
            byte[] r9 = r0.toByteArray()
            boolean r10 = r8.isRecycled()
            if (r10 != 0) goto L47
            r8.recycle()
        L47:
            if (r9 == 0) goto L51
            int r8 = r9.length
            if (r8 > 0) goto L51
            java.lang.String r8 = com.umeng.socialize.utils.UmengText.IMAGE.THUMB_ERROR
            com.umeng.socialize.utils.SLog.E(r8)
        L51:
            return r9
        L52:
            return r8
    }

    private static byte[] a(byte[] r4, android.graphics.Bitmap.CompressFormat r5) {
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = d(r4)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            int r2 = r4.length     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r3 = 0
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r4, r3, r2, r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r4 == 0) goto L23
            r2 = 100
            r4.compress(r5, r2, r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            r4.recycle()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            goto L23
        L1e:
            r4 = move-exception
            r0 = r1
            goto L3f
        L21:
            r4 = move-exception
            goto L36
        L23:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
        L27:
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L3e
        L2b:
            r4 = move-exception
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r5, r4)
            goto L3e
        L32:
            r4 = move-exception
            goto L3f
        L34:
            r4 = move-exception
            r1 = r0
        L36:
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.IMAGE.FILE_TO_BINARY_ERROR     // Catch: java.lang.Throwable -> L1e
            com.umeng.socialize.utils.SLog.error(r5, r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L3e
            goto L27
        L3e:
            return r0
        L3f:
            if (r0 == 0) goto L4b
            r0.close()     // Catch: java.io.IOException -> L45
            goto L4b
        L45:
            r5 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r5)
        L4b:
            throw r4
    }

    public static java.io.File b(byte[] r1) {
            com.umeng.socialize.c.b.b r0 = com.umeng.socialize.c.b.b.a()     // Catch: java.io.IOException -> Ld
            java.io.File r0 = r0.b()     // Catch: java.io.IOException -> Ld
            java.io.File r1 = a(r1, r0)     // Catch: java.io.IOException -> Ld
            return r1
        Ld:
            r1 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.BINARYTOFILE
            com.umeng.socialize.utils.SLog.error(r0, r1)
            r1 = 0
            return r1
    }

    private static byte[] b(android.graphics.Bitmap r5, android.graphics.Bitmap.CompressFormat r6) {
            r0 = 0
            if (r5 == 0) goto L67
            boolean r1 = r5.isRecycled()
            if (r1 == 0) goto La
            goto L67
        La:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            int r0 = r5.getRowBytes()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r2 = r5.getHeight()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r0 = r0 * r2
            int r0 = r0 / 1024
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            float r2 = com.umeng.socialize.c.b.c.b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r3 = 100
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L29
            float r2 = r2 / r0
            float r0 = (float) r3     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            float r2 = r2 * r0
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
        L29:
            r5.compress(r6, r3, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r1.close()     // Catch: java.io.IOException -> L34
            return r5
        L34:
            r6 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r6)
            return r5
        L3b:
            r5 = move-exception
            r0 = r1
            goto L5a
        L3e:
            r5 = move-exception
            r0 = r1
            goto L44
        L41:
            r5 = move-exception
            goto L5a
        L43:
            r5 = move-exception
        L44:
            java.lang.String r6 = com.umeng.socialize.utils.UmengText.IMAGE.BITMAOTOBINARY     // Catch: java.lang.Throwable -> L41
            com.umeng.socialize.utils.SLog.error(r6, r5)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L4f
            goto L55
        L4f:
            r5 = move-exception
            java.lang.String r6 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r6, r5)
        L55:
            byte[] r5 = com.umeng.socialize.utils.DefaultClass.getBytes()
            return r5
        L5a:
            if (r0 == 0) goto L66
            r0.close()     // Catch: java.io.IOException -> L60
            goto L66
        L60:
            r6 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r6)
        L66:
            throw r5
        L67:
            return r0
    }

    private static byte[] b(java.io.File r3, android.graphics.Bitmap.CompressFormat r4) {
            r0 = 0
            if (r3 == 0) goto L31
            java.io.File r1 = r3.getAbsoluteFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto Le
            goto L31
        Le:
            com.umeng.socialize.c.b.b r1 = com.umeng.socialize.c.b.b.a()
            byte[] r3 = r1.a(r3)
            boolean r1 = com.umeng.socialize.utils.SocializeUtils.assertBinaryInvalid(r3)
            if (r1 == 0) goto L31
            java.lang.String r0 = com.umeng.socialize.c.b.d.a(r3)
            java.lang.String[] r1 = com.umeng.socialize.c.b.d.m
            r2 = 1
            r1 = r1[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            return r3
        L2c:
            byte[] r3 = a(r3, r4)
            return r3
        L31:
            return r0
    }

    public static java.lang.String c(byte[] r0) {
            java.lang.String r0 = com.umeng.socialize.c.b.d.a(r0)
            return r0
    }

    private static android.graphics.BitmapFactory.Options d(byte[] r6) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            int r2 = r6.length
            r3 = 0
            android.graphics.BitmapFactory.decodeByteArray(r6, r3, r2, r0)
            int r6 = r0.outWidth
            int r2 = com.umeng.socialize.media.UMImage.MAX_WIDTH
            int r6 = r6 / r2
            double r4 = (double) r6
            double r4 = java.lang.Math.ceil(r4)
            int r6 = (int) r4
            int r2 = r0.outHeight
            int r4 = com.umeng.socialize.media.UMImage.MAX_HEIGHT
            int r2 = r2 / r4
            double r4 = (double) r2
            double r4 = java.lang.Math.ceil(r4)
            int r2 = (int) r4
            if (r2 <= r1) goto L2f
            if (r6 <= r1) goto L2f
            if (r2 <= r6) goto L2c
            r0.inSampleSize = r2
            goto L39
        L2c:
            r0.inSampleSize = r6
            goto L39
        L2f:
            r1 = 2
            if (r2 <= r1) goto L35
            r0.inSampleSize = r2
            goto L39
        L35:
            if (r6 <= r1) goto L39
            r0.inSampleSize = r6
        L39:
            r0.inJustDecodeBounds = r3
            return r0
    }

    private static int e(byte[] r0) {
            if (r0 == 0) goto L4
            int r0 = r0.length
            return r0
        L4:
            r0 = 0
            return r0
    }
}
