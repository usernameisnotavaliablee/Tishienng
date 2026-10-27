package com.bytedance.msdk.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae {
    private static float cw = -1.0f;
    private static float j = -1.0f;
    private static int r = -1;
    private static int up = -1;
    private static int xt = -1;

    static {
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            j(r0)
            return
    }

    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int cw(android.content.Context r0) {
            j(r0)
            int r0 = com.bytedance.msdk.j.up.ae.up
            return r0
    }

    public static int j(android.content.Context r1, float r2) {
            j(r1)
            float r1 = r(r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto Le
            r1 = 1065353216(0x3f800000, float:1.0)
        Le:
            float r2 = r2 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r1 = (int) r2
            return r1
    }

    public static void j(android.content.Context r2) {
            if (r2 != 0) goto L7
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            goto L8
        L7:
            r0 = r2
        L8:
            if (r0 != 0) goto Lb
            goto L5b
        Lb:
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            com.bytedance.msdk.j.up.ae.j = r1
            int r1 = r0.densityDpi
            com.bytedance.msdk.j.up.ae.xt = r1
            float r1 = r0.scaledDensity
            com.bytedance.msdk.j.up.ae.cw = r1
            int r1 = r0.widthPixels
            com.bytedance.msdk.j.up.ae.r = r1
            int r0 = r0.heightPixels
            com.bytedance.msdk.j.up.ae.up = r0
            if (r2 == 0) goto L5b
            android.content.res.Resources r0 = r2.getResources()
            if (r0 == 0) goto L5b
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L5b
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            r0 = 1
            if (r2 != r0) goto L51
            int r2 = com.bytedance.msdk.j.up.ae.r
            int r0 = com.bytedance.msdk.j.up.ae.up
            if (r2 <= r0) goto L5b
            com.bytedance.msdk.j.up.ae.r = r0
            com.bytedance.msdk.j.up.ae.up = r2
            return
        L51:
            int r2 = com.bytedance.msdk.j.up.ae.r
            int r0 = com.bytedance.msdk.j.up.ae.up
            if (r2 >= r0) goto L5b
            com.bytedance.msdk.j.up.ae.r = r0
            com.bytedance.msdk.j.up.ae.up = r2
        L5b:
            return
    }

    public static float r(android.content.Context r0) {
            j(r0)
            float r0 = com.bytedance.msdk.j.up.ae.j
            return r0
    }

    public static int up(android.content.Context r0) {
            j(r0)
            int r0 = com.bytedance.msdk.j.up.ae.xt
            return r0
    }

    public static int xt(android.content.Context r0) {
            j(r0)
            int r0 = com.bytedance.msdk.j.up.ae.r
            return r0
    }

    public static int xt(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }
}
