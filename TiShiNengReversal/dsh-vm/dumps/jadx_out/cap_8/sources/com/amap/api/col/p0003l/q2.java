package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class q2 {
    public q2() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(byte[] r3, int r4) {
            r0 = r3[r4]
            int r1 = r4 + 1
            r1 = r3[r1]
            int r2 = r4 + 2
            r2 = r3[r2]
            int r4 = r4 + 3
            r3 = r3[r4]
            r4 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 << 8
            r4 = r4 | r0
            int r0 = r2 << 16
            r4 = r4 | r0
            int r3 = r3 << 24
            r3 = r3 | r4
            return r3
    }

    private static android.graphics.Bitmap b(java.io.InputStream r6) throws java.lang.Exception {
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)
            byte[] r0 = h(r6)
            boolean r1 = android.graphics.NinePatch.isNinePatchChunk(r0)
            if (r1 == 0) goto L55
            int r1 = r6.getWidth()
            int r1 = r1 + (-2)
            int r2 = r6.getHeight()
            int r2 = r2 + (-2)
            r3 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r6, r3, r3, r1, r2)
            com.amap.api.col.p0003l.b3.B(r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r6 < r2) goto L44
            java.lang.Class r6 = r1.getClass()
            java.lang.Class[] r2 = new java.lang.Class[r3]
            java.lang.Class<byte[]> r4 = byte[].class
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "setNinePatchChunk"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r4, r2)
            r6.setAccessible(r3)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r5] = r0
            r6.invoke(r1, r2)
            return r1
        L44:
            java.lang.Class r6 = r1.getClass()
            java.lang.String r2 = "mNinePatchChunk"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r2)
            r6.setAccessible(r3)
            r6.set(r1, r0)
            return r1
        L55:
            return r6
    }

    public static android.graphics.drawable.Drawable c(android.content.Context r6, java.lang.String r7) throws java.lang.Exception {
            android.graphics.Bitmap r2 = i(r6, r7)
            byte[] r7 = r2.getNinePatchChunk()
            if (r7 != 0) goto L14
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            r7.<init>(r6, r2)
            return r7
        L14:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            byte[] r7 = r2.getNinePatchChunk()
            g(r7, r4)
            android.graphics.drawable.NinePatchDrawable r0 = new android.graphics.drawable.NinePatchDrawable
            android.content.res.Resources r1 = r6.getResources()
            byte[] r3 = r2.getNinePatchChunk()
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    private static void d(android.graphics.Bitmap r18, byte[] r19) {
            r0 = r19
            int r1 = r18.getWidth()
            int r5 = r1 + (-2)
            int[] r3 = new int[r5]
            int r2 = r18.getHeight()
            int r7 = r2 + (-1)
            r9 = 1
            r4 = 0
            r6 = 1
            r8 = r5
            r2 = r18
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r4 = 0
        L1b:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r4 >= r5) goto L2c
            r7 = r3[r4]
            if (r6 != r7) goto L29
            r7 = 12
            f(r0, r7, r4)
            goto L2c
        L29:
            int r4 = r4 + 1
            goto L1b
        L2c:
            int r1 = r1 + (-3)
        L2e:
            if (r1 < 0) goto L40
            r4 = r3[r1]
            if (r6 != r4) goto L3d
            int r5 = r5 - r1
            int r5 = r5 + (-2)
            r1 = 16
            f(r0, r1, r5)
            goto L40
        L3d:
            int r1 = r1 + (-1)
            goto L2e
        L40:
            int r1 = r18.getHeight()
            int r3 = r1 + (-2)
            int[] r11 = new int[r3]
            int r4 = r18.getWidth()
            int r14 = r4 + (-1)
            r15 = 0
            r16 = 1
            r12 = 0
            r13 = 1
            r10 = r18
            r17 = r3
            r10.getPixels(r11, r12, r13, r14, r15, r16, r17)
        L5a:
            if (r2 >= r3) goto L69
            r4 = r11[r2]
            if (r6 != r4) goto L66
            r4 = 20
            f(r0, r4, r2)
            goto L69
        L66:
            int r2 = r2 + 1
            goto L5a
        L69:
            int r1 = r1 + (-3)
        L6b:
            if (r1 < 0) goto L7d
            r2 = r11[r1]
            if (r6 != r2) goto L7a
            int r3 = r3 - r1
            int r3 = r3 + (-2)
            r1 = 24
            f(r0, r1, r3)
            return
        L7a:
            int r1 = r1 + (-1)
            goto L6b
        L7d:
            return
    }

    private static void e(java.io.OutputStream r1, int r2) throws java.io.IOException {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    private static void f(byte[] r2, int r3, int r4) {
            byte r0 = (byte) r4
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            int r4 = r4 >> 24
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    private static void g(byte[] r1, android.graphics.Rect r2) {
            r0 = 12
            int r0 = a(r1, r0)
            r2.left = r0
            r0 = 16
            int r0 = a(r1, r0)
            r2.right = r0
            r0 = 20
            int r0 = a(r1, r0)
            r2.top = r0
            r0 = 24
            int r1 = a(r1, r0)
            r2.bottom = r1
            return
    }

    private static byte[] h(android.graphics.Bitmap r19) throws java.io.IOException {
            int r3 = r19.getWidth()
            int r8 = r19.getHeight()
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r10 = 0
            r0 = 0
        Lf:
            r1 = 32
            if (r0 >= r1) goto L19
            r9.write(r10)
            int r0 = r0 + 1
            goto Lf
        L19:
            int r6 = r3 + (-2)
            int[] r1 = new int[r6]
            r5 = 0
            r7 = 1
            r2 = 0
            r4 = 1
            r0 = r19
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            r0 = r1[r10]
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 != r2) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            r5 = 3
            int r3 = r3 - r5
            r3 = r1[r3]
            if (r3 != r2) goto L37
            r3 = 1
            goto L38
        L37:
            r3 = 0
        L38:
            r7 = 0
            r11 = 0
            r12 = 0
        L3b:
            if (r7 >= r6) goto L4b
            r13 = r1[r7]
            if (r11 == r13) goto L48
            int r12 = r12 + 1
            e(r9, r7)
            r11 = r1[r7]
        L48:
            int r7 = r7 + 1
            goto L3b
        L4b:
            if (r3 == 0) goto L52
            int r12 = r12 + 1
            e(r9, r6)
        L52:
            r1 = r12
            int r6 = r1 + 1
            if (r0 == 0) goto L58
            r6 = r1
        L58:
            if (r3 == 0) goto L5c
            int r6 = r6 + (-1)
        L5c:
            int r0 = r8 + (-2)
            int[] r12 = new int[r0]
            r16 = 1
            r17 = 1
            r13 = 0
            r14 = 1
            r15 = 0
            r11 = r19
            r18 = r0
            r11.getPixels(r12, r13, r14, r15, r16, r17, r18)
            r3 = r12[r10]
            if (r3 != r2) goto L74
            r3 = 1
            goto L75
        L74:
            r3 = 0
        L75:
            int r8 = r8 - r5
            r7 = r12[r8]
            if (r7 != r2) goto L7c
            r2 = 1
            goto L7d
        L7c:
            r2 = 0
        L7d:
            r7 = 0
            r8 = 0
            r11 = 0
        L80:
            if (r7 >= r0) goto L90
            r13 = r12[r7]
            if (r8 == r13) goto L8d
            int r11 = r11 + 1
            e(r9, r7)
            r8 = r12[r7]
        L8d:
            int r7 = r7 + 1
            goto L80
        L90:
            if (r2 == 0) goto L97
            int r11 = r11 + 1
            e(r9, r0)
        L97:
            int r0 = r11 + 1
            if (r3 == 0) goto L9c
            r0 = r11
        L9c:
            if (r2 == 0) goto La0
            int r0 = r0 + (-1)
        La0:
            r2 = 0
        La1:
            int r3 = r6 * r0
            if (r2 >= r3) goto Lab
            e(r9, r4)
            int r2 = r2 + 1
            goto La1
        Lab:
            byte[] r0 = r9.toByteArray()
            r0[r10] = r4
            byte r1 = (byte) r1
            r0[r4] = r1
            byte r1 = (byte) r11
            r2 = 2
            r0[r2] = r1
            byte r1 = (byte) r3
            r0[r5] = r1
            r11 = r19
            d(r11, r0)
            return r0
    }

    private static android.graphics.Bitmap i(android.content.Context r0, java.lang.String r1) throws java.lang.Exception {
            android.content.res.AssetManager r0 = com.amap.api.col.p0003l.v2.b(r0)
            java.io.InputStream r0 = r0.open(r1)
            android.graphics.Bitmap r1 = b(r0)
            r0.close()
            return r1
    }
}
