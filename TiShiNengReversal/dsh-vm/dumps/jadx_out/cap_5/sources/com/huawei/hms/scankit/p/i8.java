package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i8 {
    public i8() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r3) {
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r0 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r2 = "navigation_bar_height"
            int r0 = r3.getIdentifier(r2, r0, r1)
            int r3 = r3.getDimensionPixelSize(r0)
            return r3
    }

    public static int a(android.content.Context r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static android.graphics.Point b(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getSize(r0)
            return r0
    }
}
