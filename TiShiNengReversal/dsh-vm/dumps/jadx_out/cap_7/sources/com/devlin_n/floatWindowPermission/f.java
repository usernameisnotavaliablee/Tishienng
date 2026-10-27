package com.devlin_n.floatWindowPermission;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class f {
    private static final java.lang.String a = "QikuUtils";

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.android.settings"
            java.lang.String r2 = "com.android.settings.Settings$OverlaySettingsActivity"
            r0.setClassName(r1, r2)
            boolean r1 = d(r0, r3)
            if (r1 == 0) goto L16
            r3.startActivity(r0)
            return
        L16:
            java.lang.String r1 = "com.qihoo360.mobilesafe"
            java.lang.String r2 = "com.qihoo360.mobilesafe.ui.index.AppEnterActivity"
            r0.setClassName(r1, r2)
            boolean r1 = d(r0, r3)
            if (r1 == 0) goto L2b
            android.app.Activity r3 = com.devlin_n.floatWindowPermission.h.a(r3)
            r1 = 1
            r3.startActivityForResult(r0, r1)
        L2b:
            return
    }

    public static boolean b(android.content.Context r1) {
            r0 = 24
            boolean r1 = c(r1, r0)
            return r1
    }

    @android.annotation.TargetApi(19)
    private static boolean c(android.content.Context r9, int r10) {
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            r1 = 0
            java.lang.Class<android.app.AppOpsManager> r2 = android.app.AppOpsManager.class
            java.lang.String r3 = "checkOp"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L46
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L46
            r5[r1] = r6     // Catch: java.lang.Exception -> L46
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Exception -> L46
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r8 = 2
            r5[r8] = r6     // Catch: java.lang.Exception -> L46
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L46
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L46
            int r3 = android.os.Binder.getCallingUid()     // Catch: java.lang.Exception -> L46
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L46
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Exception -> L46
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L46
            r4[r1] = r10     // Catch: java.lang.Exception -> L46
            r4[r7] = r3     // Catch: java.lang.Exception -> L46
            r4[r8] = r9     // Catch: java.lang.Exception -> L46
            java.lang.Object r9 = r2.invoke(r0, r4)     // Catch: java.lang.Exception -> L46
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Exception -> L46
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L46
            if (r9 != 0) goto L45
            return r7
        L45:
            return r1
        L46:
            r9 = move-exception
            android.util.Log.getStackTraceString(r9)
            return r1
    }

    private static boolean d(android.content.Intent r2, android.content.Context r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r1 = 65536(0x10000, float:9.1835E-41)
            java.util.List r2 = r3.queryIntentActivities(r2, r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L16
            r2 = 1
            return r2
        L16:
            return r0
    }
}
