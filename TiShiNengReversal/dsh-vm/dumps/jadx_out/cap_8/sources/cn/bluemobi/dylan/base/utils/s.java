package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s {
    public s() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.view.Window r5, boolean r6) {
            java.lang.Class<android.view.WindowManager$LayoutParams> r0 = android.view.WindowManager.LayoutParams.class
            if (r5 == 0) goto L32
            android.view.WindowManager$LayoutParams r1 = r5.getAttributes()     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "MEIZU_FLAG_DARK_STATUS_BAR_ICON"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L32
            java.lang.String r3 = "meizuFlags"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Exception -> L32
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L32
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L32
            r4 = 0
            int r2 = r2.getInt(r4)     // Catch: java.lang.Exception -> L32
            int r4 = r0.getInt(r1)     // Catch: java.lang.Exception -> L32
            if (r6 == 0) goto L29
            r6 = r4 | r2
            goto L2b
        L29:
            int r6 = ~r2     // Catch: java.lang.Exception -> L32
            r6 = r6 & r4
        L2b:
            r0.setInt(r1, r6)     // Catch: java.lang.Exception -> L32
            r5.setAttributes(r1)     // Catch: java.lang.Exception -> L32
            return r3
        L32:
            r5 = 0
            return r5
    }

    public static boolean b(android.view.Window r8, boolean r9) {
            r0 = 0
            if (r8 == 0) goto L4d
            java.lang.Class r1 = r8.getClass()
            java.lang.String r2 = "android.view.MiuiWindowManager$LayoutParams"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = "EXTRA_FLAG_STATUS_BAR_DARK_MODE"
            java.lang.reflect.Field r3 = r2.getField(r3)     // Catch: java.lang.Exception -> L4d
            int r2 = r3.getInt(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = "setExtraFlags"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r5[r0] = r6     // Catch: java.lang.Exception -> L4d
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Method r1 = r1.getMethod(r3, r5)     // Catch: java.lang.Exception -> L4d
            if (r9 == 0) goto L3b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L4d
            r3[r0] = r9     // Catch: java.lang.Exception -> L4d
            r3[r7] = r2     // Catch: java.lang.Exception -> L4d
            r1.invoke(r8, r3)     // Catch: java.lang.Exception -> L4d
            goto L4c
        L3b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L4d
            r3[r0] = r9     // Catch: java.lang.Exception -> L4d
            r3[r7] = r2     // Catch: java.lang.Exception -> L4d
            r1.invoke(r8, r3)     // Catch: java.lang.Exception -> L4d
        L4c:
            return r7
        L4d:
            return r0
    }

    public static void c(android.app.Activity r2, int r3) {
            r0 = 1
            r1 = 0
            if (r3 != r0) goto Lc
            android.view.Window r2 = r2.getWindow()
            b(r2, r1)
            return
        Lc:
            r0 = 2
            if (r3 != r0) goto L17
            android.view.Window r2 = r2.getWindow()
            a(r2, r1)
            return
        L17:
            r0 = 3
            if (r3 != r0) goto L25
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r2.setSystemUiVisibility(r1)
        L25:
            return
    }

    public static int d(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            android.view.Window r1 = r3.getWindow()
            r2 = 1
            boolean r1 = b(r1, r2)
            if (r1 == 0) goto Le
            return r2
        Le:
            android.view.Window r1 = r3.getWindow()
            boolean r1 = a(r1, r2)
            if (r1 == 0) goto L1a
            r3 = 2
            return r3
        L1a:
            r1 = 23
            if (r0 < r1) goto L2d
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r0 = 8448(0x2100, float:1.1838E-41)
            r3.setSystemUiVisibility(r0)
            r3 = 3
            return r3
        L2d:
            r3 = 0
            return r3
    }

    public static void e(android.app.Activity r2, int r3) {
            r0 = 1
            if (r3 != r0) goto Lb
            android.view.Window r2 = r2.getWindow()
            b(r2, r0)
            return
        Lb:
            r1 = 2
            if (r3 != r1) goto L16
            android.view.Window r2 = r2.getWindow()
            a(r2, r0)
            return
        L16:
            r0 = 3
            if (r3 != r0) goto L26
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r3 = 9216(0x2400, float:1.2914E-41)
            r2.setSystemUiVisibility(r3)
        L26:
            return
    }

    public static void f(android.app.Activity r1, int r2) {
            android.view.Window r0 = r1.getWindow()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setStatusBarColor(r1)
            return
    }

    @android.annotation.TargetApi(19)
    public static void g(android.app.Activity r2) {
            android.view.Window r2 = r2.getWindow()
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.clearFlags(r0)
            android.view.View r0 = r2.getDecorView()
            r1 = 1280(0x500, float:1.794E-42)
            r0.setSystemUiVisibility(r1)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)
            r0 = 0
            r2.setStatusBarColor(r0)
            return
    }
}
