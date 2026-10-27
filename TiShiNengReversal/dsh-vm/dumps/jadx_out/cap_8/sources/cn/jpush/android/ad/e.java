package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r6, int r7) {
            int r0 = r6 % 2
            r1 = 1
            if (r0 != r1) goto L7
            int r6 = r6 + 1
        L7:
            int r0 = r7 % 2
            if (r0 != r1) goto Ld
            int r7 = r7 + 1
        Ld:
            int r0 = java.lang.Math.max(r6, r7)
            int r6 = java.lang.Math.min(r6, r7)
            float r6 = (float) r6
            float r7 = (float) r0
            float r6 = r6 / r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r2 = 4603241769126068224(0x3fe2000000000000, double:0.5625)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L3e
            double r4 = (double) r6
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 <= 0) goto L3e
            r6 = 1664(0x680, float:2.332E-42)
            if (r0 >= r6) goto L2a
            return r1
        L2a:
            r6 = 4990(0x137e, float:6.992E-42)
            if (r0 >= r6) goto L30
            r6 = 2
            return r6
        L30:
            if (r0 <= r6) goto L38
            r6 = 10240(0x2800, float:1.4349E-41)
            if (r0 >= r6) goto L38
            r6 = 4
            return r6
        L38:
            int r0 = r0 / 1280
            if (r0 != 0) goto L3d
            return r1
        L3d:
            return r0
        L3e:
            double r6 = (double) r6
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L4f
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4f
            int r0 = r0 / 1280
            if (r0 != 0) goto L4e
            return r1
        L4e:
            return r0
        L4f:
            double r0 = (double) r0
            r2 = 4653344314980564992(0x4094000000000000, double:1280.0)
            double r2 = r2 / r6
            double r0 = r0 / r2
            double r6 = java.lang.Math.ceil(r0)
            int r6 = (int) r6
            return r6
    }

    private static android.graphics.Bitmap.CompressFormat a(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "image/png"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Le
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            return r1
        Le:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            return r1
    }

    public static android.graphics.Bitmap a(java.lang.String r0, int r1, int r2) {
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r1)
            return r0
    }

    public static void a(java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "ImageUtils"
            if (r5 == 0) goto L100
            if (r6 != 0) goto L8
            goto L100
        L8:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            r1.inSampleSize = r2
            android.graphics.BitmapFactory.decodeFile(r5, r1)
            int r2 = r1.outWidth
            int r1 = r1.outHeight
            int r1 = a(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "compressImage computeSize="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r0, r2)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inSampleSize = r1
            r1 = 0
            r2.inJustDecodeBounds = r1
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r5, r2)
            if (r1 != 0) goto L47
            java.lang.String r5 = "compressImage tagBitmap is null"
        L43:
            cn.jpush.android.helper.Logger.d(r0, r5)
            return
        L47:
            java.lang.String r6 = cn.jpush.android.ad.a.a(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "compressImage file type="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r0, r2)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            android.graphics.Bitmap$CompressFormat r6 = a(r6)     // Catch: java.lang.Throwable -> Lb5
            r3 = 60
            boolean r6 = r1.compress(r6, r3, r2)     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r3.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "compressImage compress="
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb5
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lb5
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> Lb5
            if (r6 != 0) goto L8f
            r2.close()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r1.recycle()
            return
        L8b:
            r5 = move-exception
            goto Lfc
        L8d:
            r5 = move-exception
            goto Le0
        L8f:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Lb5
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r6.exists()     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto Lb7
            boolean r6 = r6.delete()     // Catch: java.lang.Throwable -> Lb5
            if (r6 != 0) goto Lb7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r6.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = "Failed to delete original file: "
            r6.append(r3)     // Catch: java.lang.Throwable -> Lb5
            r6.append(r5)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb5
            cn.jpush.android.helper.Logger.d(r0, r6)     // Catch: java.lang.Throwable -> Lb5
            goto Lb7
        Lb5:
            r5 = move-exception
            goto Ld7
        Lb7:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb5
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lb5
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> Lcd
            r6.write(r5)     // Catch: java.lang.Throwable -> Lcd
            r6.close()     // Catch: java.lang.Throwable -> Lb5
            r2.close()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r1.recycle()
            return
        Lcd:
            r5 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> Ld2
            goto Ld6
        Ld2:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> Lb5
        Ld6:
            throw r5     // Catch: java.lang.Throwable -> Lb5
        Ld7:
            r2.close()     // Catch: java.lang.Throwable -> Ldb
            goto Ldf
        Ldb:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
        Ldf:
            throw r5     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
        Le0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r6.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "compressImage IOException="
            r6.append(r2)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L8b
            r6.append(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L8b
            cn.jpush.android.helper.Logger.d(r0, r5)     // Catch: java.lang.Throwable -> L8b
            r1.recycle()
            return
        Lfc:
            r1.recycle()
            throw r5
        L100:
            java.lang.String r5 = "File path or URL is null."
            goto L43
    }
}
