package top.zibin.luban;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class b {
    private android.media.ExifInterface a;
    private java.io.File b;
    private java.io.File c;
    private int d;
    private int e;

    b(java.io.File r3, java.io.File r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            boolean r0 = r2.c(r3)
            if (r0 == 0) goto L14
            android.media.ExifInterface r0 = new android.media.ExifInterface
            java.lang.String r1 = r3.getAbsolutePath()
            r0.<init>(r1)
            r2.a = r0
        L14:
            r2.c = r4
            r2.b = r3
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r0 = 1
            r4.inJustDecodeBounds = r0
            r4.inSampleSize = r0
            java.lang.String r3 = r3.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r3, r4)
            int r3 = r4.outWidth
            r2.d = r3
            int r3 = r4.outHeight
            r2.e = r3
            return
    }

    private int b() {
            r9 = this;
            int r0 = r9.d
            int r1 = r0 % 2
            r2 = 1
            if (r1 != r2) goto L9
            int r0 = r0 + 1
        L9:
            r9.d = r0
            int r1 = r9.e
            int r3 = r1 % 2
            if (r3 != r2) goto L13
            int r1 = r1 + 1
        L13:
            r9.e = r1
            if (r0 <= r1) goto L18
            r0 = r1
        L18:
            r9.d = r0
            if (r0 <= r1) goto L1d
            r1 = r0
        L1d:
            r9.e = r1
            double r3 = (double) r0
            double r5 = (double) r1
            double r3 = r3 / r5
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7 = 4603241769126068224(0x3fe2000000000000, double:0.5625)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L4b
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4b
            r0 = 1664(0x680, float:2.332E-42)
            if (r1 >= r0) goto L33
            return r2
        L33:
            r3 = 4990(0x137e, float:6.992E-42)
            if (r1 < r0) goto L3b
            if (r1 >= r3) goto L3b
            r0 = 2
            return r0
        L3b:
            if (r1 < r3) goto L43
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 >= r0) goto L43
            r0 = 4
            return r0
        L43:
            int r0 = r1 / 1280
            if (r0 != 0) goto L48
            return r2
        L48:
            int r1 = r1 / 1280
            return r1
        L4b:
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L5d
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L5d
            int r0 = r1 / 1280
            if (r0 != 0) goto L5a
            return r2
        L5a:
            int r1 = r1 / 1280
            return r1
        L5d:
            double r0 = (double) r1
            r5 = 4653344314980564992(0x4094000000000000, double:1280.0)
            double r5 = r5 / r3
            double r0 = r0 / r5
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            return r0
    }

    private boolean c(java.io.File r3) {
            r2 = this;
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r1 = "jpeg"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1b
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r0 = "jpg"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            return r3
        L1b:
            r3 = 1
            return r3
    }

    private android.graphics.Bitmap d(android.graphics.Bitmap r9) {
            r8 = this;
            android.media.ExifInterface r0 = r8.a
            if (r0 != 0) goto L5
            return r9
        L5:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            android.media.ExifInterface r0 = r8.a
            java.lang.String r1 = "Orientation"
            r2 = 1
            int r0 = r0.getAttributeInt(r1, r2)
            r1 = 3
            if (r0 == r1) goto L25
            r1 = 6
            if (r0 == r1) goto L22
            r1 = 8
            if (r0 == r1) goto L1f
            r0 = 0
            goto L27
        L1f:
            r0 = 270(0x10e, float:3.78E-43)
            goto L27
        L22:
            r0 = 90
            goto L27
        L25:
            r0 = 180(0xb4, float:2.52E-43)
        L27:
            float r0 = (float) r0
            r6.postRotate(r0)
            int r4 = r9.getWidth()
            int r5 = r9.getHeight()
            r7 = 1
            r2 = 0
            r3 = 0
            r1 = r9
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    java.io.File a() throws java.io.IOException {
            r4 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            int r1 = r4.b()
            r0.inSampleSize = r1
            java.io.File r1 = r4.b
            java.lang.String r1 = r1.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r1, r0)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            android.graphics.Bitmap r0 = r4.d(r0)
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            r3 = 50
            r0.compress(r2, r3, r1)
            r0.recycle()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r2 = r4.c
            r0.<init>(r2)
            byte[] r2 = r1.toByteArray()
            r0.write(r2)
            r0.flush()
            r0.close()
            r1.close()
            java.io.File r0 = r4.c
            return r0
    }
}
