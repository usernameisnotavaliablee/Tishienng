package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k {
    private static final int a = 0;

    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(@androidx.annotation.ColorInt int r6, int r7) {
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
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r7 = r7 << 16
            r7 = r7 | r0
            int r0 = r1 << 8
            r7 = r7 | r0
            r6 = r6 | r7
            return r6
    }

    @android.annotation.TargetApi(23)
    private static void b(android.view.Window r1, boolean r2) {
            boolean r0 = e()
            if (r0 == 0) goto La
            l(r1, r2)
            goto L13
        La:
            boolean r0 = f()
            if (r0 == 0) goto L13
            m(r1, r2)
        L13:
            c(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(23)
    private static void c(android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1c
            android.view.View r0 = r2.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            if (r3 == 0) goto L13
            r3 = r0 | 8192(0x2000, float:1.148E-41)
            goto L15
        L13:
            r3 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
        L15:
            android.view.View r2 = r2.getDecorView()
            r2.setSystemUiVisibility(r3)
        L1c:
            return
    }

    private static int d(android.content.Context r4) {
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r0)
            return r4
    }

    private static boolean e() {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "Flyme_OS_4"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L28
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L28
            java.lang.String r0 = "Flyme OS [4|5]"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r1 = android.os.Build.DISPLAY
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.find()
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            return r0
        L28:
            r0 = 1
            return r0
    }

    private static boolean f() {
            r0 = 0
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L31
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L31
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = "ro.miui.ui.version.name"
            r2[r0] = r4     // Catch: java.lang.Exception -> L31
            r4 = 0
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "[vV]"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.replaceAll(r2, r4)     // Catch: java.lang.Exception -> L31
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L31
            r2 = 6
            if (r1 < r2) goto L31
            return r3
        L31:
            return r0
    }

    public static void g(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.ColorInt int r2) {
            r0 = 0
            h(r1, r2, r0)
            return
    }

    public static void h(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.ColorInt int r3, @androidx.annotation.IntRange(from = 0, to = 255) int r4) {
            android.view.Window r0 = r2.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r1)
            android.view.Window r0 = r2.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r1)
            android.view.Window r2 = r2.getWindow()
            int r3 = a(r3, r4)
            r2.setStatusBarColor(r3)
            return
    }

    public static void i(@androidx.annotation.NonNull android.app.Activity r1) {
            android.view.Window r1 = r1.getWindow()
            r0 = 1
            b(r1, r0)
            return
    }

    public static void j(@androidx.annotation.NonNull android.app.Activity r2, android.view.View r3) {
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 16908331(0x102002b, float:2.387735E-38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L16
            r0.removeView(r1)
        L16:
            r0 = 0
            o(r2, r0)
            q(r2)
            n(r2, r3)
            return
    }

    public static void k(@androidx.annotation.NonNull android.app.Activity r1) {
            android.view.Window r1 = r1.getWindow()
            r0 = 0
            b(r1, r0)
            return
    }

    private static void l(android.view.Window r4, boolean r5) {
            java.lang.Class<android.view.WindowManager$LayoutParams> r0 = android.view.WindowManager.LayoutParams.class
            android.view.WindowManager$LayoutParams r1 = r4.getAttributes()     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "MEIZU_FLAG_DARK_STATUS_BAR_ICON"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = "meizuFlags"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Exception -> L2f
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L2f
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L2f
            r3 = 0
            int r2 = r2.getInt(r3)     // Catch: java.lang.Exception -> L2f
            int r3 = r0.getInt(r1)     // Catch: java.lang.Exception -> L2f
            if (r5 == 0) goto L27
            r5 = r3 | r2
            goto L29
        L27:
            int r5 = ~r2     // Catch: java.lang.Exception -> L2f
            r5 = r5 & r3
        L29:
            r0.setInt(r1, r5)     // Catch: java.lang.Exception -> L2f
            r4.setAttributes(r1)     // Catch: java.lang.Exception -> L2f
        L2f:
            return
    }

    private static void m(android.view.Window r8, boolean r9) {
            java.lang.Class r0 = r8.getClass()
            java.lang.String r1 = "android.view.MiuiWindowManager$LayoutParams"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = "EXTRA_FLAG_STATUS_BAR_DARK_MODE"
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Exception -> L3b
            int r1 = r2.getInt(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = "setExtraFlags"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3b
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L3b
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L3b
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Exception -> L3b
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch: java.lang.Exception -> L3b
            if (r9 == 0) goto L29
            r9 = r1
            goto L2a
        L29:
            r9 = 0
        L2a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L3b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3b
            r2[r6] = r9     // Catch: java.lang.Exception -> L3b
            r2[r7] = r1     // Catch: java.lang.Exception -> L3b
            r0.invoke(r8, r2)     // Catch: java.lang.Exception -> L3b
        L3b:
            return
    }

    public static void n(android.content.Context r3, @androidx.annotation.NonNull android.view.View r4) {
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 == 0) goto L31
            int r1 = r0.height
            if (r1 <= 0) goto L31
            int r1 = r4.getPaddingTop()
            if (r1 != 0) goto L31
            int r1 = r0.height
            int r2 = d(r3)
            int r1 = r1 + r2
            r0.height = r1
            int r0 = r4.getPaddingLeft()
            int r1 = r4.getPaddingTop()
            int r3 = d(r3)
            int r1 = r1 + r3
            int r3 = r4.getPaddingRight()
            int r2 = r4.getPaddingBottom()
            r4.setPadding(r0, r1, r3, r2)
        L31:
            return
    }

    private static void o(android.app.Activity r4, boolean r5) {
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        Le:
            if (r1 >= r0) goto L23
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L20
            r2.setFitsSystemWindows(r5)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipToPadding(r5)
        L20:
            int r1 = r1 + 1
            goto Le
        L23:
            return
    }

    private static void p(android.view.ViewGroup r3, @androidx.annotation.ColorInt int r4, @androidx.annotation.IntRange(from = 0, to = 255) int r5) {
            int r4 = a(r4, r5)
            r5 = 16908331(0x102002b, float:2.387735E-38)
            android.view.View r0 = r3.findViewById(r5)
            if (r0 != 0) goto L2c
            if (r4 == 0) goto L2c
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r0.setId(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            android.content.Context r1 = r3.getContext()
            int r1 = d(r1)
            r2 = -1
            r5.<init>(r2, r1)
            r3.addView(r0, r5)
        L2c:
            if (r0 == 0) goto L31
            r0.setBackgroundColor(r4)
        L31:
            return
    }

    public static void q(@androidx.annotation.NonNull android.app.Activity r2) {
            android.view.Window r0 = r2.getWindow()
            r1 = 0
            r0.setStatusBarColor(r1)
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r0 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r0)
            return
    }
}
