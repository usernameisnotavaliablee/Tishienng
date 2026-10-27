package com.devlin_n.floatWindowPermission;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class c {
    private static final java.lang.String a = "HuaweiUtils";

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r8) {
            java.lang.String r0 = "com.huawei.systemmanager"
            r1 = 1
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            java.lang.String r4 = "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"
            r3.<init>(r0, r4)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            r2.setComponent(r3)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            double r3 = com.devlin_n.floatWindowPermission.g.e()     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            r5 = 4614162998222441677(0x4008cccccccccccd, double:3.1)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2d
            android.app.Activity r3 = com.devlin_n.floatWindowPermission.h.a(r8)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            r3.startActivityForResult(r2, r1)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            return
        L27:
            r0 = move-exception
            goto L3f
        L29:
            r0 = move-exception
            goto L4c
        L2b:
            r2 = move-exception
            goto L68
        L2d:
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            java.lang.String r4 = "com.huawei.notificationmanager.ui.NotificationManagmentActivity"
            r3.<init>(r0, r4)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            r2.setComponent(r3)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            android.app.Activity r3 = com.devlin_n.floatWindowPermission.h.a(r8)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            r3.startActivityForResult(r2, r1)     // Catch: java.lang.Exception -> L27 android.content.ActivityNotFoundException -> L29 java.lang.SecurityException -> L2b
            return
        L3f:
            java.lang.String r2 = "进入设置页面失败，请手动设置"
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r2, r1)
            r8.show()
            android.util.Log.getStackTraceString(r0)
            goto L81
        L4c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.Android.settings"
            java.lang.String r5 = "com.android.settings.permission.TabItem"
            r3.<init>(r4, r5)
            r2.setComponent(r3)
            android.app.Activity r8 = com.devlin_n.floatWindowPermission.h.a(r8)
            r8.startActivityForResult(r2, r1)
            android.util.Log.getStackTraceString(r0)
            goto L81
        L68:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = "com.huawei.permissionmanager.ui.MainActivity"
            r4.<init>(r0, r5)
            r3.setComponent(r4)
            android.app.Activity r8 = com.devlin_n.floatWindowPermission.h.a(r8)
            r8.startActivityForResult(r3, r1)
            android.util.Log.getStackTraceString(r2)
        L81:
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
}
