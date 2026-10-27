package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m3 {
    public static final java.lang.String a = "QikuUtils";

    public m3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.app.Activity r3, int r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.android.settings"
            java.lang.String r2 = "com.android.settings.Settings$OverlaySettingsActivity"
            r0.setClassName(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)
            boolean r1 = a(r0, r3)
            if (r1 == 0) goto L1b
            r3.startActivityForResult(r0, r4)
            return
        L1b:
            java.lang.String r1 = "com.qihoo360.mobilesafe"
            java.lang.String r2 = "com.qihoo360.mobilesafe.ui.index.AppEnterActivity"
            r0.setClassName(r1, r2)
            boolean r1 = a(r0, r3)
            if (r1 == 0) goto L2c
            r3.startActivityForResult(r0, r4)
            return
        L2c:
            java.lang.String r3 = "QikuUtils"
            java.lang.String r4 = "can't open permission page with particular name, please use \"adb shell dumpsys activity\" command and tell me the name of the float window permission page"
            com.acse.ottn.h2.b(r3, r4)
            return
    }

    public static boolean a(android.content.Context r1) {
            r0 = 24
            boolean r1 = a(r1, r0)
            return r1
    }

    @android.annotation.TargetApi(19)
    public static boolean a(android.content.Context r8, int r9) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = "appops"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.String r2 = "checkOp"
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4f
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4f
            r4[r1] = r5     // Catch: java.lang.Exception -> L4f
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Exception -> L4f
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r7 = 2
            r4[r7] = r5     // Catch: java.lang.Exception -> L4f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L4f
            int r2 = android.os.Binder.getCallingUid()     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L4f
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L4f
            r3[r1] = r9     // Catch: java.lang.Exception -> L4f
            r3[r6] = r2     // Catch: java.lang.Exception -> L4f
            java.lang.String r9 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L4f
            r3[r7] = r9     // Catch: java.lang.Exception -> L4f
            java.lang.Object r8 = r0.invoke(r8, r3)     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L4f
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L4f
            if (r8 != 0) goto L4e
            return r6
        L4e:
            return r1
        L4f:
            r8 = move-exception
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            java.lang.String r9 = "QikuUtils"
            com.acse.ottn.h2.b(r9, r8)
            return r1
    }

    public static boolean a(android.content.Intent r2, android.content.Context r3) {
            r0 = 0
            if (r2 == 0) goto L18
            if (r3 != 0) goto L6
            goto L18
        L6:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r1 = 65536(0x10000, float:9.1835E-41)
            java.util.List r2 = r3.queryIntentActivities(r2, r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }
}
