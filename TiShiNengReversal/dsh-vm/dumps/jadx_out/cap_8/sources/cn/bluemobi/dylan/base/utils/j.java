package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap a(android.content.Context r5, java.lang.String r6) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.BitmapFactory.decodeFile(r6, r0)
            int r2 = r0.outWidth
            int r3 = r0.outHeight
            java.lang.String r4 = "window"
            java.lang.Object r5 = r5.getSystemService(r4)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            android.view.Display r5 = r5.getDefaultDisplay()
            int r4 = r5.getWidth()
            int r5 = r5.getHeight()
            r0.inSampleSize = r1
            if (r2 <= r3) goto L2e
            if (r2 <= r4) goto L33
            int r2 = r2 / r4
            r0.inSampleSize = r2
            goto L33
        L2e:
            if (r3 <= r5) goto L33
            int r3 = r3 / r5
            r0.inSampleSize = r3
        L33:
            r5 = 0
            r0.inJustDecodeBounds = r5
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r6, r0)
            return r5
    }

    public static int b(java.lang.String r2) {
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

    public static android.graphics.Bitmap c(android.graphics.Bitmap r7) {
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r0 = 1119092736(0x42b40000, float:90.0)
            r5.postRotate(r0)
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r2 = 0
            r6 = 1
            r1 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }
}
