package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static java.lang.reflect.Method Zb;
    private static java.lang.reflect.Method Zc;
    private static java.lang.reflect.Field Zd;

    static {
            java.lang.String r0 = "setStatusBarDarkIcon"
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r2 = 0
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L12
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L12
            r4[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L12
            java.lang.reflect.Method r4 = r1.getMethod(r0, r4)     // Catch: java.lang.NoSuchMethodException -> L12
            com.kwad.components.core.t.l.Zb = r4     // Catch: java.lang.NoSuchMethodException -> L12
        L12:
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1e
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1e
            r3[r2] = r4     // Catch: java.lang.NoSuchMethodException -> L1e
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch: java.lang.NoSuchMethodException -> L1e
            com.kwad.components.core.t.l.Zc = r0     // Catch: java.lang.NoSuchMethodException -> L1e
        L1e:
            java.lang.Class<android.view.WindowManager$LayoutParams> r0 = android.view.WindowManager.LayoutParams.class
            java.lang.String r1 = "statusBarColor"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.NoSuchFieldException -> L28
            com.kwad.components.core.t.l.Zd = r0     // Catch: java.lang.NoSuchFieldException -> L28
        L28:
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR"
            java.lang.Object r0 = com.kwad.sdk.utils.z.c(r0, r1)     // Catch: java.lang.Exception -> L38
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L38
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L38
            com.kwad.components.core.t.l.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = r0     // Catch: java.lang.Exception -> L38
        L38:
            return
    }

    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(android.app.Activity r2, boolean r3, boolean r4) {
            java.lang.reflect.Method r4 = com.kwad.components.core.t.l.Zc
            if (r4 == 0) goto L12
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L11
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L11
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Throwable -> L11
            r4.invoke(r2, r0)     // Catch: java.lang.Throwable -> L11
        L11:
            return
        L12:
            android.view.Window r2 = r2.getWindow()
            a(r2, r3)
            return
    }

    private static void a(android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L10
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()
            java.lang.String r0 = "MEIZU_FLAG_DARK_STATUS_BAR_ICON"
            a(r2, r0, r3)
            return
        L10:
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L1d
            g(r0, r3)
            r3 = 0
            setStatusBarColor(r2, r3)
        L1d:
            return
    }

    private static boolean a(android.view.WindowManager.LayoutParams r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = "meizuFlags"
            java.lang.Object r3 = com.kwad.sdk.utils.z.getField(r2, r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L27
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = com.kwad.sdk.utils.z.getField(r2, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L27
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L1a
            r3 = r3 | r1
            goto L1c
        L1a:
            int r3 = ~r3     // Catch: java.lang.Throwable -> L27
            r3 = r3 & r1
        L1c:
            if (r1 == r3) goto L27
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L27
            com.kwad.sdk.utils.z.a(r2, r0, r3)     // Catch: java.lang.Throwable -> L27
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }

    public static void b(android.app.Activity r0, boolean r1) {
            r1 = 1
            a(r0, r1, r1)
            return
    }

    private static void g(android.view.View r1, boolean r2) {
            int r0 = r1.getSystemUiVisibility()
            if (r2 == 0) goto La
            int r2 = com.kwad.components.core.t.l.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            r2 = r2 | r0
            goto Le
        La:
            int r2 = com.kwad.components.core.t.l.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            int r2 = ~r2
            r2 = r2 & r0
        Le:
            if (r2 == r0) goto L13
            r1.setSystemUiVisibility(r2)
        L13:
            return
    }

    private static void setStatusBarColor(android.view.Window r2, int r3) {
            android.view.WindowManager$LayoutParams r3 = r2.getAttributes()
            java.lang.reflect.Field r0 = com.kwad.components.core.t.l.Zd
            if (r0 == 0) goto L1b
            int r0 = r0.getInt(r3)     // Catch: java.lang.IllegalAccessException -> L1b
            if (r0 == 0) goto L1b
            java.lang.reflect.Field r0 = com.kwad.components.core.t.l.Zd     // Catch: java.lang.IllegalAccessException -> L1b
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> L1b
            r0.set(r3, r1)     // Catch: java.lang.IllegalAccessException -> L1b
            r2.setAttributes(r3)     // Catch: java.lang.IllegalAccessException -> L1b
        L1b:
            return
    }
}
