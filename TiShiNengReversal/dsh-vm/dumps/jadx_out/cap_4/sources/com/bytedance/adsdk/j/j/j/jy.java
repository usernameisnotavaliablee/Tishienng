package com.bytedance.adsdk.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class jy extends com.bytedance.adsdk.j.j.j.tl<com.bytedance.adsdk.j.j.xt.j, com.bytedance.adsdk.j.j.xt.xt> {
    static final /* synthetic */ boolean j = true;

    static {
            return
    }

    public jy(com.bytedance.adsdk.j.j.xt.j r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.adsdk.j.j.j.tl
    public /* bridge */ /* synthetic */ android.graphics.Bitmap j(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, android.graphics.Bitmap r4, com.bytedance.adsdk.j.j.xt.xt r5) {
            r0 = this;
            com.bytedance.adsdk.j.j.xt.xt r5 = (com.bytedance.adsdk.j.j.xt.xt) r5
            android.graphics.Bitmap r1 = r0.j2(r1, r2, r3, r4, r5)
            return r1
    }

    /* renamed from: j, reason: avoid collision after fix types in other method */
    public android.graphics.Bitmap j2(android.graphics.Canvas r4, android.graphics.Paint r5, int r6, android.graphics.Bitmap r7, com.bytedance.adsdk.j.j.xt.xt r8) {
            r3 = this;
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r0 = 0
            r8.inJustDecodeBounds = r0
            r8.inSampleSize = r6
            r1 = 1
            r8.inMutable = r1
            r8.inBitmap = r7
            r7 = 0
            R extends com.bytedance.adsdk.j.j.xt.m r2 = r3.ae     // Catch: java.io.IOException -> L24
            com.bytedance.adsdk.j.j.xt.j r2 = (com.bytedance.adsdk.j.j.xt.j) r2     // Catch: java.io.IOException -> L24
            r2.d_()     // Catch: java.io.IOException -> L24
            R extends com.bytedance.adsdk.j.j.xt.m r2 = r3.ae     // Catch: java.io.IOException -> L24 java.lang.IllegalArgumentException -> L26
            com.bytedance.adsdk.j.j.xt.j r2 = (com.bytedance.adsdk.j.j.xt.j) r2     // Catch: java.io.IOException -> L24 java.lang.IllegalArgumentException -> L26
            java.io.InputStream r2 = r2.up()     // Catch: java.io.IOException -> L24 java.lang.IllegalArgumentException -> L26
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r2, r7, r8)     // Catch: java.io.IOException -> L24 java.lang.IllegalArgumentException -> L26
            goto L3d
        L24:
            r4 = move-exception
            goto L55
        L26:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> L24
            r8.<init>()     // Catch: java.io.IOException -> L24
            r8.inJustDecodeBounds = r0     // Catch: java.io.IOException -> L24
            r8.inSampleSize = r6     // Catch: java.io.IOException -> L24
            r8.inMutable = r1     // Catch: java.io.IOException -> L24
            R extends com.bytedance.adsdk.j.j.xt.m r6 = r3.ae     // Catch: java.io.IOException -> L24
            com.bytedance.adsdk.j.j.xt.j r6 = (com.bytedance.adsdk.j.j.xt.j) r6     // Catch: java.io.IOException -> L24
            java.io.InputStream r6 = r6.up()     // Catch: java.io.IOException -> L24
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6, r7, r8)     // Catch: java.io.IOException -> L24
        L3d:
            boolean r8 = com.bytedance.adsdk.j.j.j.jy.j     // Catch: java.io.IOException -> L4a
            if (r8 != 0) goto L4d
            if (r6 == 0) goto L44
            goto L4d
        L44:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.io.IOException -> L4a
            r4.<init>()     // Catch: java.io.IOException -> L4a
            throw r4     // Catch: java.io.IOException -> L4a
        L4a:
            r4 = move-exception
            r7 = r6
            goto L55
        L4d:
            r5.setXfermode(r7)     // Catch: java.io.IOException -> L4a
            r7 = 0
            r4.drawBitmap(r6, r7, r7, r5)     // Catch: java.io.IOException -> L4a
            goto L59
        L55:
            com.bytedance.sdk.component.utils.vl.j(r4)
            r6 = r7
        L59:
            return r6
    }
}
