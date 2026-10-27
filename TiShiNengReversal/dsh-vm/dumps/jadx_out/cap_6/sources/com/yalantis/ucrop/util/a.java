package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static final java.lang.String a = "BitmapLoadUtils";

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(@androidx.annotation.NonNull android.graphics.BitmapFactory.Options r3, int r4, int r5) {
            int r0 = r3.outHeight
            int r3 = r3.outWidth
            r1 = 1
            if (r0 > r5) goto Lb
            if (r3 <= r4) goto La
            goto Lb
        La:
            return r1
        Lb:
            int r2 = r0 / r1
            if (r2 > r5) goto L15
            int r2 = r3 / r1
            if (r2 <= r4) goto L14
            goto L15
        L14:
            return r1
        L15:
            int r1 = r1 * 2
            goto Lb
    }

    public static int b(@androidx.annotation.NonNull android.content.Context r7) {
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            if (r7 == 0) goto L16
            android.view.Display r7 = r7.getDefaultDisplay()
            r7.getSize(r0)
        L16:
            int r7 = r0.x
            int r0 = r0.y
            double r1 = (double) r7
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = java.lang.Math.pow(r1, r3)
            double r5 = (double) r0
            double r3 = java.lang.Math.pow(r5, r3)
            double r1 = r1 + r3
            double r0 = java.lang.Math.sqrt(r1)
            int r7 = (int) r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            int r1 = r0.getMaximumBitmapWidth()
            int r0 = r0.getMaximumBitmapHeight()
            int r0 = java.lang.Math.min(r1, r0)
            if (r0 <= 0) goto L43
            int r7 = java.lang.Math.min(r7, r0)
        L43:
            int r0 = com.yalantis.ucrop.util.c.c()
            if (r0 <= 0) goto L4d
            int r7 = java.lang.Math.min(r7, r0)
        L4d:
            return r7
    }

    public static void c(@androidx.annotation.Nullable java.io.Closeable r1) {
            if (r1 == 0) goto L9
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto L9
            r1.close()     // Catch: java.io.IOException -> L9
        L9:
            return
    }

    public static void d(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull android.net.Uri r8, @androidx.annotation.Nullable android.net.Uri r9, int r10, int r11, e3.b r12) {
            com.yalantis.ucrop.task.b r0 = new com.yalantis.ucrop.task.b
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = 0
            java.lang.Void[] r7 = new java.lang.Void[r7]
            r0.execute(r7)
            return
    }

    public static int e(int r0) {
            switch(r0) {
                case 3: goto Lb;
                case 4: goto Lb;
                case 5: goto L8;
                case 6: goto L8;
                case 7: goto L5;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L8:
            r0 = 90
            return r0
        Lb:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
    }

    public static int f(int r1) {
            r0 = 2
            if (r1 == r0) goto Le
            r0 = 7
            if (r1 == r0) goto Le
            r0 = 4
            if (r1 == r0) goto Le
            r0 = 5
            if (r1 == r0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = -1
            return r1
    }

    public static int g(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.net.Uri r3) {
            r0 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.io.IOException -> L19
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch: java.io.IOException -> L19
            if (r2 != 0) goto Lc
            return r0
        Lc:
            com.yalantis.ucrop.util.f r1 = new com.yalantis.ucrop.util.f     // Catch: java.io.IOException -> L19
            r1.<init>(r2)     // Catch: java.io.IOException -> L19
            int r0 = r1.c()     // Catch: java.io.IOException -> L19
            c(r2)     // Catch: java.io.IOException -> L19
            return r0
        L19:
            r3.toString()
            return r0
    }

    public static android.graphics.Bitmap h(@androidx.annotation.NonNull android.graphics.Bitmap r7, @androidx.annotation.NonNull android.graphics.Matrix r8) {
            int r3 = r7.getWidth()     // Catch: java.lang.OutOfMemoryError -> L19
            int r4 = r7.getHeight()     // Catch: java.lang.OutOfMemoryError -> L19
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            r5 = r8
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.OutOfMemoryError -> L1a
            boolean r8 = r0.sameAs(r7)     // Catch: java.lang.OutOfMemoryError -> L1a
            if (r8 != 0) goto L18
            return r7
        L18:
            return r0
        L19:
            r0 = r7
        L1a:
            return r0
    }
}
