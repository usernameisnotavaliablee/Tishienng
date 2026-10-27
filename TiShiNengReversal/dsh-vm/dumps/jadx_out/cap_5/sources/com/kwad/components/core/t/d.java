package com.kwad.components.core.t;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(@androidx.annotation.NonNull android.app.Activity r0, int r1, boolean r2) {
            r1 = 0
            r2 = 1
            a(r0, r1, r2, r2)
            return
    }

    public static void a(@androidx.annotation.NonNull android.app.Activity r1, int r2, boolean r3, boolean r4) {
            boolean r0 = tc()
            if (r0 != 0) goto L7
            goto L1b
        L7:
            b(r1, r2, r3)
            if (r4 != 0) goto L1b
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r1.findViewById(r2)
            int r1 = com.kwad.sdk.c.a.a.getStatusBarHeight(r1)
            r3 = 0
            r2.setPadding(r3, r1, r3, r3)
        L1b:
            return
    }

    private static boolean a(@androidx.annotation.NonNull android.app.Activity r4, boolean r5) {
            r5 = 0
            java.lang.String r0 = "android.view.MiuiWindowManager$LayoutParams"
            java.lang.String r1 = "EXTRA_FLAG_STATUS_BAR_DARK_MODE"
            java.lang.Object r0 = com.kwad.sdk.utils.z.ar(r0, r1)     // Catch: java.lang.Exception -> L20
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L20
            r0.intValue()     // Catch: java.lang.Exception -> L20
            android.view.Window r4 = r4.getWindow()     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = "setExtraFlags"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L20
            r2[r5] = r0     // Catch: java.lang.Exception -> L20
            r3 = 1
            r2[r3] = r0     // Catch: java.lang.Exception -> L20
            com.kwad.sdk.utils.z.callMethod(r4, r1, r2)     // Catch: java.lang.Exception -> L20
            return r3
        L20:
            return r5
    }

    private static void b(@androidx.annotation.NonNull android.app.Activity r2, int r3, boolean r4) {
            android.view.Window r0 = r2.getWindow()
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r4 == 0) goto L2d
            r4 = 23
            if (r1 < r4) goto L2d
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r4)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r4)
            boolean r4 = com.kwad.sdk.utils.bb.Rl()
            r1 = 1
            if (r4 == 0) goto L21
            a(r2, r1)
            goto L2a
        L21:
            boolean r4 = com.kwad.sdk.utils.bb.Rm()
            if (r4 == 0) goto L2a
            com.kwad.components.core.t.l.b(r2, r1)
        L2a:
            r2 = 9472(0x2500, float:1.3273E-41)
            goto L2f
        L2d:
            r2 = 1280(0x500, float:1.794E-42)
        L2f:
            android.view.View r4 = r0.getDecorView()
            r4.setSystemUiVisibility(r2)
            r0.setStatusBarColor(r3)
            int r2 = r0.getNavigationBarColor()
            r0.setNavigationBarColor(r2)
            return
    }

    public static boolean tc() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
