package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static final java.lang.String a = "BitmapUtils";

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(android.media.Image.Plane[] r5, int r6, int r7) {
            int r6 = r6 * r7
            r7 = 1
            r0 = r5[r7]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            r1 = 2
            r5 = r5[r1]
            java.nio.ByteBuffer r5 = r5.getBuffer()
            int r2 = r5.position()
            int r3 = r0.limit()
            int r4 = r2 + 1
            r5.position(r4)
            int r4 = r3 + (-1)
            r0.limit(r4)
            int r4 = r5.remaining()
            int r6 = r6 * 2
            int r6 = r6 / 4
            int r6 = r6 - r1
            if (r4 != r6) goto L34
            int r6 = r5.compareTo(r0)
            if (r6 != 0) goto L34
            goto L35
        L34:
            r7 = 0
        L35:
            r5.position(r2)
            r0.limit(r3)
            return r7
    }

    @androidx.annotation.Nullable
    @androidx.camera.core.ExperimentalGetImage
    @androidx.annotation.RequiresApi(21)
    public static android.graphics.Bitmap b(androidx.camera.core.ImageProxy r3) {
            com.bxkj.student.v2.ai.fitness.camera.f$a r0 = new com.bxkj.student.v2.ai.fitness.camera.f$a
            r0.<init>()
            int r1 = r3.getWidth()
            com.bxkj.student.v2.ai.fitness.camera.f$a r0 = r0.d(r1)
            int r1 = r3.getHeight()
            com.bxkj.student.v2.ai.fitness.camera.f$a r0 = r0.b(r1)
            androidx.camera.core.ImageInfo r1 = r3.getImageInfo()
            int r1 = r1.getRotationDegrees()
            com.bxkj.student.v2.ai.fitness.camera.f$a r0 = r0.c(r1)
            com.bxkj.student.v2.ai.fitness.camera.f r0 = r0.a()
            android.media.Image r1 = r3.getImage()
            android.media.Image$Plane[] r1 = r1.getPlanes()
            int r2 = r3.getWidth()
            int r3 = r3.getHeight()
            java.nio.ByteBuffer r3 = h(r1, r2, r3)
            android.graphics.Bitmap r3 = c(r3, r0)
            return r3
    }

    @androidx.annotation.Nullable
    public static android.graphics.Bitmap c(java.nio.ByteBuffer r8, com.bxkj.student.v2.ai.fitness.camera.f r9) {
            r8.rewind()
            int r0 = r8.limit()
            byte[] r2 = new byte[r0]
            r7 = 0
            r8.get(r2, r7, r0)
            android.graphics.YuvImage r1 = new android.graphics.YuvImage     // Catch: java.lang.Exception -> L4c
            int r4 = r9.c()     // Catch: java.lang.Exception -> L4c
            int r5 = r9.a()     // Catch: java.lang.Exception -> L4c
            r6 = 0
            r3 = 17
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L4c
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L4c
            r8.<init>()     // Catch: java.lang.Exception -> L4c
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> L4c
            int r2 = r9.c()     // Catch: java.lang.Exception -> L4c
            int r3 = r9.a()     // Catch: java.lang.Exception -> L4c
            r0.<init>(r7, r7, r2, r3)     // Catch: java.lang.Exception -> L4c
            r2 = 80
            r1.compressToJpeg(r0, r2, r8)     // Catch: java.lang.Exception -> L4c
            byte[] r0 = r8.toByteArray()     // Catch: java.lang.Exception -> L4c
            int r1 = r8.size()     // Catch: java.lang.Exception -> L4c
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r7, r1)     // Catch: java.lang.Exception -> L4c
            r8.close()     // Catch: java.lang.Exception -> L4c
            int r8 = r9.b()     // Catch: java.lang.Exception -> L4c
            android.graphics.Bitmap r8 = f(r0, r8, r7, r7)     // Catch: java.lang.Exception -> L4c
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            r8.getMessage()
            r8 = 0
            return r8
    }

    @androidx.annotation.Nullable
    public static android.graphics.Bitmap d(android.content.ContentResolver r4, android.net.Uri r5) throws java.io.IOException {
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r4, r5)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            int r4 = e(r4, r5)
            r5 = 90
            r1 = -90
            r2 = 0
            r3 = 1
            switch(r4) {
                case 2: goto L24;
                case 3: goto L21;
                case 4: goto L1f;
                case 5: goto L1d;
                case 6: goto L16;
                case 7: goto L1b;
                case 8: goto L18;
                default: goto L15;
            }
        L15:
            r5 = 0
        L16:
            r3 = 0
            goto L26
        L18:
            r5 = -90
            goto L16
        L1b:
            r5 = -90
        L1d:
            r2 = 1
            goto L16
        L1f:
            r5 = 0
            goto L26
        L21:
            r5 = 180(0xb4, float:2.52E-43)
            goto L16
        L24:
            r5 = 0
            goto L1d
        L26:
            android.graphics.Bitmap r4 = f(r0, r5, r2, r3)
            return r4
    }

    private static int e(android.content.ContentResolver r3, android.net.Uri r4) {
            java.lang.String r0 = "content"
            java.lang.String r1 = r4.getScheme()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L1a
            java.lang.String r0 = "file"
            java.lang.String r2 = r4.getScheme()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.io.IOException -> L40
            if (r3 != 0) goto L26
            if (r3 == 0) goto L25
            r3.close()     // Catch: java.io.IOException -> L40
        L25:
            return r1
        L26:
            androidx.exifinterface.media.ExifInterface r0 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L36
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L36
            r3.close()     // Catch: java.io.IOException -> L40
            java.lang.String r3 = "Orientation"
            r4 = 1
            int r3 = r0.getAttributeInt(r3, r4)
            return r3
        L36:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.io.IOException -> L40
        L3f:
            throw r0     // Catch: java.io.IOException -> L40
        L40:
            r4.toString()
            return r1
    }

    private static android.graphics.Bitmap f(android.graphics.Bitmap r7, int r8, boolean r9, boolean r10) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r8 = (float) r8
            r5.postRotate(r8)
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L12
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L14
        L12:
            r9 = 1065353216(0x3f800000, float:1.0)
        L14:
            if (r10 == 0) goto L18
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L18:
            r5.postScale(r9, r8)
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            if (r7 == r0) goto L30
            r0.recycle()
        L30:
            return r7
    }

    private static void g(android.media.Image.Plane r7, int r8, int r9, byte[] r10, int r11, int r12) {
            java.nio.ByteBuffer r0 = r7.getBuffer()
            r0.rewind()
            int r1 = r0.limit()
            int r2 = r7.getRowStride()
            int r1 = r1 + r2
            int r1 = r1 + (-1)
            int r2 = r7.getRowStride()
            int r1 = r1 / r2
            if (r1 != 0) goto L1a
            goto L3c
        L1a:
            int r9 = r9 / r1
            int r8 = r8 / r9
            r9 = 0
            r2 = 0
            r3 = 0
        L1f:
            if (r2 >= r1) goto L3c
            r5 = r3
            r4 = 0
        L23:
            if (r4 >= r8) goto L34
            byte r6 = r0.get(r5)
            r10[r11] = r6
            int r11 = r11 + r12
            int r6 = r7.getPixelStride()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L23
        L34:
            int r4 = r7.getRowStride()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L1f
        L3c:
            return
    }

    private static java.nio.ByteBuffer h(android.media.Image.Plane[] r11, int r12, int r13) {
            int r4 = r12 * r13
            int r0 = r4 / 4
            r1 = 2
            int r0 = r0 * 2
            int r0 = r0 + r4
            byte[] r8 = new byte[r0]
            boolean r0 = a(r11, r12, r13)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L35
            r12 = r11[r2]
            java.nio.ByteBuffer r12 = r12.getBuffer()
            r12.get(r8, r2, r4)
            r12 = r11[r3]
            java.nio.ByteBuffer r12 = r12.getBuffer()
            r11 = r11[r1]
            java.nio.ByteBuffer r11 = r11.getBuffer()
            r11.get(r8, r4, r3)
            int r11 = r4 + 1
            int r4 = r4 * 2
            int r4 = r4 / 4
            int r4 = r4 - r3
            r12.get(r8, r11, r4)
            goto L4f
        L35:
            r5 = r11[r2]
            r9 = 0
            r10 = 1
            r6 = r12
            r7 = r13
            g(r5, r6, r7, r8, r9, r10)
            r5 = r11[r3]
            int r9 = r4 + 1
            r10 = 2
            g(r5, r6, r7, r8, r9, r10)
            r0 = r11[r1]
            r5 = 2
            r1 = r6
            r2 = r7
            r3 = r8
            g(r0, r1, r2, r3, r4, r5)
        L4f:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r8)
            return r11
    }
}
