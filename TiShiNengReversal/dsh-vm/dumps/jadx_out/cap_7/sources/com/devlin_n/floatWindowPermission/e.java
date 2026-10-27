package com.devlin_n.floatWindowPermission;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class e {
    private static final java.lang.String a = "MiuiUtils";

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r2) {
            int r0 = d()
            r1 = 5
            if (r0 != r1) goto Lb
            e(r2)
            return
        Lb:
            r1 = 6
            if (r0 != r1) goto L12
            f(r2)
            return
        L12:
            r1 = 7
            if (r0 != r1) goto L19
            g(r2)
            return
        L19:
            r1 = 8
            if (r0 != r1) goto L20
            h(r2)
        L20:
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

    public static int d() {
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = com.devlin_n.floatWindowPermission.g.g(r0)
            if (r0 == 0) goto L16
            r1 = 1
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L12
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L12
            return r0
        L12:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
        L16:
            r0 = -1
            return r0
    }

    public static void e(android.content.Context r4) {
            java.lang.String r0 = r4.getPackageName()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r1.<init>(r2)
            java.lang.String r2 = "package"
            r3 = 0
            android.net.Uri r0 = android.net.Uri.fromParts(r2, r0, r3)
            r1.setData(r0)
            boolean r0 = i(r1, r4)
            if (r0 == 0) goto L23
            android.app.Activity r4 = com.devlin_n.floatWindowPermission.h.a(r4)
            r0 = 1
            r4.startActivityForResult(r1, r0)
        L23:
            return
    }

    public static void f(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "miui.intent.action.APP_PERM_EDITOR"
            r0.<init>(r1)
            java.lang.String r1 = "com.miui.securitycenter"
            java.lang.String r2 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "extra_pkgname"
            java.lang.String r2 = r3.getPackageName()
            r0.putExtra(r1, r2)
            boolean r1 = i(r0, r3)
            if (r1 == 0) goto L25
            android.app.Activity r3 = com.devlin_n.floatWindowPermission.h.a(r3)
            r1 = 1
            r3.startActivityForResult(r0, r1)
        L25:
            return
    }

    public static void g(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "miui.intent.action.APP_PERM_EDITOR"
            r0.<init>(r1)
            java.lang.String r1 = "com.miui.securitycenter"
            java.lang.String r2 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "extra_pkgname"
            java.lang.String r2 = r3.getPackageName()
            r0.putExtra(r1, r2)
            boolean r1 = i(r0, r3)
            if (r1 == 0) goto L25
            android.app.Activity r3 = com.devlin_n.floatWindowPermission.h.a(r3)
            r1 = 1
            r3.startActivityForResult(r0, r1)
        L25:
            return
    }

    public static void h(android.content.Context r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "miui.intent.action.APP_PERM_EDITOR"
            r0.<init>(r1)
            java.lang.String r2 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            java.lang.String r3 = "com.miui.securitycenter"
            r0.setClassName(r3, r2)
            java.lang.String r2 = r5.getPackageName()
            java.lang.String r4 = "extra_pkgname"
            r0.putExtra(r4, r2)
            boolean r2 = i(r0, r5)
            if (r2 == 0) goto L21
            r5.startActivity(r0)
            return
        L21:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r0.setPackage(r3)
            java.lang.String r1 = r5.getPackageName()
            r0.putExtra(r4, r1)
            boolean r1 = i(r0, r5)
            if (r1 == 0) goto L3e
            android.app.Activity r5 = com.devlin_n.floatWindowPermission.h.a(r5)
            r1 = 1
            r5.startActivityForResult(r0, r1)
        L3e:
            return
    }

    private static boolean i(android.content.Intent r2, android.content.Context r3) {
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
