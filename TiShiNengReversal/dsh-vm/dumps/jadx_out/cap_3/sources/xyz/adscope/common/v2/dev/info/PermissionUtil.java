package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class PermissionUtil {
    public static final int PERMISSION_REQ_CODE = 100;

    private PermissionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkAlertWindowPermission(android.content.Context r11) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 1
            if (r0 >= r1) goto L8
            return r2
        L8:
            r1 = 27
            if (r0 < r1) goto L11
            boolean r11 = l.q.a(r11)
            return r11
        L11:
            boolean r1 = l.q.a(r11)
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = 0
            java.lang.String r3 = "window"
            java.lang.Object r3 = r11.getSystemService(r3)     // Catch: java.lang.Exception -> L4a
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch: java.lang.Exception -> L4a
            if (r3 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = new android.view.View     // Catch: java.lang.Exception -> L4a
            r4.<init>(r11)     // Catch: java.lang.Exception -> L4a
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams     // Catch: java.lang.Exception -> L4a
            r11 = 26
            if (r0 < r11) goto L34
            r11 = 2038(0x7f6, float:2.856E-42)
            r8 = 2038(0x7f6, float:2.856E-42)
            goto L38
        L34:
            r11 = 2003(0x7d3, float:2.807E-42)
            r8 = 2003(0x7d3, float:2.807E-42)
        L38:
            r9 = 24
            r10 = -2
            r6 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L4a
            r4.setLayoutParams(r5)     // Catch: java.lang.Exception -> L4a
            r3.addView(r4, r5)     // Catch: java.lang.Exception -> L4a
            r3.removeView(r4)     // Catch: java.lang.Exception -> L4a
            return r2
        L4a:
            return r1
    }

    private static boolean isPermissionDeclare(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            int r1 = r0.checkPermission(r2, r1)
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean isPermissionGranted(android.content.Context r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L10
            int r2 = androidx.core.content.ContextCompat.checkSelfPermission(r2, r3)
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
        L10:
            boolean r2 = isPermissionDeclare(r2, r3)
            return r2
    }
}
