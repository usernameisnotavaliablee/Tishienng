package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m4 {
    public static final int a = 112;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2486b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2487c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2488d = -123;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout a;

        public a(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.a
                r0.requestLayout()
                return
        }
    }

    static {
            int r0 = com.acse.ottn.R.id.statusbarutil_fake_status_bar_view
            com.acse.ottn.m4.f2486b = r0
            int r0 = com.acse.ottn.R.id.statusbarutil_translucent_view
            com.acse.ottn.m4.f2487c = r0
            return
    }

    public m4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(@androidx.annotation.ColorInt int r6, int r7) {
            if (r7 != 0) goto L3
            return r6
        L3:
            float r7 = (float) r7
            r0 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            int r7 = r6 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r1 = r6 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 * r0
            double r2 = (double) r7
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r4
            int r7 = (int) r2
            float r1 = (float) r1
            float r1 = r1 * r0
            double r1 = (double) r1
            double r1 = r1 + r4
            int r1 = (int) r1
            float r6 = (float) r6
            float r6 = r6 * r0
            double r2 = (double) r6
            double r2 = r2 + r4
            int r6 = (int) r2
            int r7 = r7 << 16
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = r7 | r0
            int r0 = r1 << 8
            r7 = r7 | r0
            r6 = r6 | r7
            return r6
    }

    public static int a(android.content.Context r4) {
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r0)
            return r4
    }

    public static android.view.View a(android.app.Activity r3, @androidx.annotation.ColorInt int r4, int r5) {
            android.view.View r0 = new android.view.View
            r0.<init>(r3)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r3 = a(r3)
            r2 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            int r3 = a(r4, r5)
            r0.setBackgroundColor(r3)
            int r3 = com.acse.ottn.m4.f2486b
            r0.setId(r3)
            return r0
    }

    @android.annotation.TargetApi(19)
    public static void a(android.app.Activity r2) {
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = com.acse.ottn.m4.f2486b
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L28
            r0.removeView(r1)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setPadding(r0, r0, r0, r0)
        L28:
            return
    }

    public static void a(android.app.Activity r3, @androidx.annotation.IntRange(from = 0, to = 255) int r4) {
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = com.acse.ottn.m4.f2487c
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L25
            int r3 = r1.getVisibility()
            r0 = 8
            r2 = 0
            if (r3 != r0) goto L1d
            r1.setVisibility(r2)
        L1d:
            int r3 = android.graphics.Color.argb(r4, r2, r2, r2)
            r1.setBackgroundColor(r3)
            return
        L25:
            android.view.View r3 = c(r3, r4)
            r0.addView(r3)
            return
    }

    public static void a(android.app.Activity r4, @androidx.annotation.IntRange(from = 0, to = 255) int r5, android.view.View r6) {
            g(r4)
            a(r4, r5)
            if (r6 == 0) goto L34
            r5 = -123(0xffffffffffffff85, float:NaN)
            java.lang.Object r0 = r6.getTag(r5)
            if (r0 == 0) goto L19
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L19
            goto L34
        L19:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            int r2 = r0.topMargin
            int r4 = a(r4)
            int r2 = r2 + r4
            int r4 = r0.rightMargin
            int r3 = r0.bottomMargin
            r0.setMargins(r1, r2, r4, r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r6.setTag(r5, r4)
        L34:
            return
    }

    public static void a(android.app.Activity r1, android.view.View r2) {
            r0 = 112(0x70, float:1.57E-43)
            a(r1, r0, r2)
            return
    }

    public static void a(android.app.Activity r1, androidx.drawerlayout.widget.DrawerLayout r2) {
            r0 = 112(0x70, float:1.57E-43)
            d(r1, r2, r0)
            return
    }

    public static void a(android.app.Activity r1, androidx.drawerlayout.widget.DrawerLayout r2, @androidx.annotation.ColorInt int r3) {
            r0 = 112(0x70, float:1.57E-43)
            a(r1, r2, r3, r0)
            return
    }

    public static void a(android.app.Activity r5, androidx.drawerlayout.widget.DrawerLayout r6, @androidx.annotation.ColorInt int r7, @androidx.annotation.IntRange(from = 0, to = 255) int r8) {
            android.view.Window r0 = r5.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            android.view.Window r0 = r5.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r1)
            android.view.Window r0 = r5.getWindow()
            r1 = 0
            r0.setStatusBarColor(r1)
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = com.acse.ottn.m4.f2486b
            android.view.View r2 = r0.findViewById(r2)
            if (r2 == 0) goto L37
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L33
            r2.setVisibility(r1)
        L33:
            r2.setBackgroundColor(r7)
            goto L3e
        L37:
            android.view.View r7 = b(r5, r7)
            r0.addView(r7, r1)
        L3e:
            boolean r7 = r0 instanceof android.widget.LinearLayout
            if (r7 != 0) goto L65
            r7 = 1
            android.view.View r1 = r0.getChildAt(r7)
            if (r1 == 0) goto L65
            android.view.View r7 = r0.getChildAt(r7)
            int r1 = r0.getPaddingLeft()
            int r2 = a(r5)
            int r3 = r0.getPaddingTop()
            int r2 = r2 + r3
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingBottom()
            r7.setPadding(r1, r2, r3, r4)
        L65:
            a(r6, r0)
            a(r5, r8)
            return
    }

    public static void a(androidx.drawerlayout.widget.DrawerLayout r3, android.view.ViewGroup r4) {
            r0 = 1
            android.view.View r1 = r3.getChildAt(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 0
            r3.setFitsSystemWindows(r2)
            r4.setFitsSystemWindows(r2)
            r4.setClipToPadding(r0)
            r1.setFitsSystemWindows(r2)
            return
    }

    public static android.view.View b(android.app.Activity r1, @androidx.annotation.ColorInt int r2) {
            r0 = 0
            android.view.View r1 = a(r1, r2, r0)
            return r1
    }

    public static void b(android.app.Activity r2) {
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r0 = com.acse.ottn.m4.f2486b
            android.view.View r0 = r2.findViewById(r0)
            r1 = 8
            if (r0 == 0) goto L17
            r0.setVisibility(r1)
        L17:
            int r0 = com.acse.ottn.m4.f2487c
            android.view.View r2 = r2.findViewById(r0)
            if (r2 == 0) goto L22
            r2.setVisibility(r1)
        L22:
            return
    }

    public static void b(android.app.Activity r2, @androidx.annotation.ColorInt int r3, @androidx.annotation.IntRange(from = 0, to = 255) int r4) {
            android.view.Window r0 = r2.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            android.view.Window r0 = r2.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r1)
            android.view.Window r2 = r2.getWindow()
            int r3 = a(r3, r4)
            r2.setStatusBarColor(r3)
            return
    }

    public static void b(android.app.Activity r0, @androidx.annotation.IntRange(from = 0, to = 255) int r1, android.view.View r2) {
            a(r0, r1, r2)
            return
    }

    public static void b(android.app.Activity r1, android.view.View r2) {
            r0 = 112(0x70, float:1.57E-43)
            b(r1, r0, r2)
            return
    }

    @java.lang.Deprecated
    public static void b(android.app.Activity r2, androidx.drawerlayout.widget.DrawerLayout r3) {
            android.view.Window r2 = r2.getWindow()
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r0)
            r2 = 0
            android.view.View r0 = r3.getChildAt(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 1
            r0.setFitsSystemWindows(r1)
            r0.setClipToPadding(r1)
            android.view.View r0 = r3.getChildAt(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setFitsSystemWindows(r2)
            r3.setFitsSystemWindows(r2)
            return
    }

    @java.lang.Deprecated
    public static void b(android.app.Activity r5, androidx.drawerlayout.widget.DrawerLayout r6, @androidx.annotation.ColorInt int r7) {
            android.view.Window r0 = r5.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r0 = 0
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = com.acse.ottn.m4.f2486b
            android.view.View r2 = r1.findViewById(r2)
            if (r2 == 0) goto L2d
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L23
            r2.setVisibility(r0)
        L23:
            r3 = 112(0x70, float:1.57E-43)
            int r7 = a(r7, r3)
            r2.setBackgroundColor(r7)
            goto L34
        L2d:
            android.view.View r7 = b(r5, r7)
            r1.addView(r7, r0)
        L34:
            boolean r7 = r1 instanceof android.widget.LinearLayout
            if (r7 != 0) goto L4a
            r7 = 1
            android.view.View r2 = r1.getChildAt(r7)
            if (r2 == 0) goto L4a
            android.view.View r7 = r1.getChildAt(r7)
            int r5 = a(r5)
            r7.setPadding(r0, r5, r0, r0)
        L4a:
            a(r6, r1)
            return
    }

    public static android.view.View c(android.app.Activity r3, int r4) {
            android.view.View r0 = new android.view.View
            r0.<init>(r3)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r3 = a(r3)
            r2 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r3 = 0
            int r3 = android.graphics.Color.argb(r4, r3, r3, r3)
            r0.setBackgroundColor(r3)
            int r3 = com.acse.ottn.m4.f2487c
            r0.setId(r3)
            return r0
    }

    public static void c(android.app.Activity r4) {
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        Le:
            if (r1 >= r0) goto L24
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L21
            r3 = 1
            r2.setFitsSystemWindows(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipToPadding(r3)
        L21:
            int r1 = r1 + 1
            goto Le
        L24:
            return
    }

    public static void c(android.app.Activity r5, @androidx.annotation.ColorInt int r6, @androidx.annotation.IntRange(from = 0, to = 255) int r7) {
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = a(r5)
            if (r2 == 0) goto L22
            boolean r4 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r4 == 0) goto L22
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r2
            int r6 = a(r6, r7)
            r2.setStatusBarBackgroundColor(r6)
            goto L2c
        L22:
            r0.setPadding(r1, r3, r1, r1)
            int r6 = a(r6, r7)
            r0.setBackgroundColor(r6)
        L2c:
            g(r5)
            return
    }

    public static void c(android.app.Activity r1, android.view.View r2) {
            r0 = 0
            a(r1, r0, r2)
            return
    }

    public static void c(android.app.Activity r4, androidx.drawerlayout.widget.DrawerLayout r5) {
            android.view.Window r0 = r4.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            android.view.Window r0 = r4.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r1)
            android.view.Window r0 = r4.getWindow()
            r1 = 0
            r0.setStatusBarColor(r1)
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r2 = r0 instanceof android.widget.LinearLayout
            if (r2 != 0) goto L36
            r2 = 1
            android.view.View r3 = r0.getChildAt(r2)
            if (r3 == 0) goto L36
            android.view.View r2 = r0.getChildAt(r2)
            int r4 = a(r4)
            r2.setPadding(r1, r4, r1, r1)
        L36:
            a(r5, r0)
            return
    }

    public static void c(android.app.Activity r1, androidx.drawerlayout.widget.DrawerLayout r2, @androidx.annotation.ColorInt int r3) {
            r0 = 0
            a(r1, r2, r3, r0)
            return
    }

    public static void d(android.app.Activity r1) {
            r0 = 112(0x70, float:1.57E-43)
            h(r1, r0)
            return
    }

    public static void d(android.app.Activity r1, @androidx.annotation.ColorInt int r2) {
            r0 = 112(0x70, float:1.57E-43)
            b(r1, r2, r0)
            return
    }

    public static void d(android.app.Activity r1, android.view.View r2) {
            r0 = 0
            b(r1, r0, r2)
            return
    }

    public static void d(android.app.Activity r0, androidx.drawerlayout.widget.DrawerLayout r1, @androidx.annotation.IntRange(from = 0, to = 255) int r2) {
            c(r0, r1)
            a(r0, r2)
            return
    }

    @java.lang.Deprecated
    public static void e(android.app.Activity r2) {
            android.view.Window r0 = r2.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            c(r2)
            return
    }

    @java.lang.Deprecated
    public static void e(android.app.Activity r3, @androidx.annotation.ColorInt int r4) {
            h(r3)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = com.acse.ottn.m4.f2486b
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L24
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 != r2) goto L20
            r0 = 0
            r1.setVisibility(r0)
        L20:
            r1.setBackgroundColor(r4)
            goto L2b
        L24:
            android.view.View r4 = b(r3, r4)
            r0.addView(r4)
        L2b:
            c(r3)
            return
    }

    public static void f(android.app.Activity r0) {
            h(r0)
            c(r0)
            return
    }

    public static void f(android.app.Activity r1, int r2) {
            r0 = 112(0x70, float:1.57E-43)
            c(r1, r2, r0)
            return
    }

    public static void g(android.app.Activity r2) {
            android.view.Window r0 = r2.getWindow()
            r1 = 0
            r0.setStatusBarColor(r1)
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r0 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r0)
            return
    }

    public static void g(android.app.Activity r1, @androidx.annotation.ColorInt int r2) {
            r0 = 0
            b(r1, r2, r0)
            return
    }

    @android.annotation.TargetApi(19)
    public static void h(android.app.Activity r2) {
            android.view.Window r0 = r2.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            android.view.Window r0 = r2.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r1)
            android.view.Window r0 = r2.getWindow()
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0.addFlags(r1)
            android.view.Window r2 = r2.getWindow()
            r0 = 0
            r2.setStatusBarColor(r0)
            return
    }

    public static void h(android.app.Activity r0, @androidx.annotation.IntRange(from = 0, to = 255) int r1) {
            f(r0)
            a(r0, r1)
            return
    }

    public static void i(android.app.Activity r0, @androidx.annotation.IntRange(from = 0, to = 255) int r1) {
            h(r0)
            a(r0, r1)
            return
    }
}
