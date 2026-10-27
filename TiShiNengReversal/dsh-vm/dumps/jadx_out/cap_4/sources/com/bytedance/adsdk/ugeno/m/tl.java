package com.bytedance.adsdk.ugeno.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl {
    private static android.util.TypedValue cw;
    public static android.os.Handler j;
    private static final java.lang.Object xt = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.adsdk.ugeno.m.tl.xt = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.bytedance.adsdk.ugeno.m.tl.j = r0
            return
    }

    public tl() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float j(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            return r1
    }

    public static float j(android.content.Context r0, java.lang.String r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            return r1
    }

    public static int j(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            return r0
    }

    public static android.graphics.Bitmap j(android.content.Context r4, android.graphics.Bitmap r5, int r6) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4f
            r2 = 26
            if (r1 >= r2) goto L8
            return r0
        L8:
            int r1 = r5.getWidth()     // Catch: java.lang.Throwable -> L4f
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L4f
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> L4f
            int r3 = r5.getHeight()     // Catch: java.lang.Throwable -> L4f
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L4f
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r1, r2, r3)     // Catch: java.lang.Throwable -> L4f
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5)     // Catch: java.lang.Throwable -> L4f
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r4)     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L31
            return r0
        L31:
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r4)     // Catch: java.lang.Throwable -> L4f
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r4, r2)     // Catch: java.lang.Throwable -> L4f
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createFromBitmap(r4, r5)     // Catch: java.lang.Throwable -> L4f
            android.renderscript.Allocation r4 = android.renderscript.Allocation.createFromBitmap(r4, r1)     // Catch: java.lang.Throwable -> L4f
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L4f
            r2.setRadius(r6)     // Catch: java.lang.Throwable -> L4f
            r2.setInput(r5)     // Catch: java.lang.Throwable -> L4f
            r2.forEach(r4)     // Catch: java.lang.Throwable -> L4f
            r4.copyTo(r1)     // Catch: java.lang.Throwable -> L4f
            return r1
        L4f:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r0
    }

    public static android.graphics.drawable.Drawable j(android.content.Context r0, int r1) {
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            return r0
    }

    public static void j(java.lang.Runnable r1) {
            boolean r0 = j()
            if (r0 == 0) goto La
            r1.run()
            return
        La:
            android.os.Handler r0 = com.bytedance.adsdk.ugeno.m.tl.j
            r0.post(r1)
            return
    }

    public static boolean j() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static int xt(android.content.Context r1, float r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L11
            r1 = 1065353216(0x3f800000, float:1.0)
        L11:
            float r2 = r2 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r1 = (int) r2
            return r1
    }
}
