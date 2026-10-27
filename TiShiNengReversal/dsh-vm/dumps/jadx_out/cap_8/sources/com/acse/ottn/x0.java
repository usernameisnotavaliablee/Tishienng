package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class x0 {
    public static int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f2883b = -1;

    static {
            return
    }

    public x0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r2) {
            int r0 = com.acse.ottn.x0.f2883b
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r2 = r0.heightPixels
            com.acse.ottn.x0.f2883b = r2
            int r0 = r0.widthPixels
            com.acse.ottn.x0.a = r0
            return r2
    }

    public static int a(android.content.Context r0, float r1) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static int a(android.content.Context r0, int r1) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            int r0 = r0.getWidth()
            return r0
    }

    public static int b(android.content.Context r2) {
            int r0 = com.acse.ottn.x0.a
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r2 = r0.widthPixels
            com.acse.ottn.x0.a = r2
            int r0 = r0.heightPixels
            com.acse.ottn.x0.f2883b = r0
            return r2
    }

    public static int b(android.content.Context r0, float r1) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static int c(android.content.Context r4) {
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            if (r0 <= 0) goto L29
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r0)
            return r4
        L29:
            r4 = 0
            return r4
    }

    public static int c(android.content.Context r0, float r1) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static int d(android.content.Context r0, float r1) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }
}
