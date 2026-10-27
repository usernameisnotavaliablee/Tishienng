package com.bytedance.msdk.core.vl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private static final java.lang.String j = "xt";

    static {
            return
    }

    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean cw(android.content.Context r1, java.lang.String r2) {
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

    public static boolean j(android.content.Context r0, java.lang.String r1) {
            boolean r0 = xt(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(api = 19)
    private static boolean xt(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = com.bytedance.msdk.core.vl.xt.j
            java.lang.String r1 = "checkPermissinKITKATNew，permission："
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r1.concat(r2)
            com.bytedance.msdk.j.up.cw.r(r0, r1)
            r1 = 1
            int r2 = r5.hashCode()     // Catch: java.lang.Exception -> L2f
            r3 = -1888586689(0xffffffff8f6e743f, float:-1.1756694E-29)
            if (r2 == r3) goto L3c
            r3 = -63024214(0xfffffffffc3e53aa, float:-3.9529332E36)
            if (r2 == r3) goto L31
            r3 = -5573545(0xffffffffffaaf457, float:NaN)
            if (r2 == r3) goto L24
            goto L47
        L24:
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L47
            java.lang.String r5 = "android:read_phone_state"
            goto L53
        L2f:
            r4 = move-exception
            goto L91
        L31:
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L47
            java.lang.String r5 = "android:coarse_location"
            goto L53
        L3c:
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L47
            java.lang.String r5 = "android:fine_location"
            goto L53
        L47:
            java.lang.String r2 = "android.permission."
            java.lang.String r3 = "android:"
            java.lang.String r5 = r5.replaceFirst(r2, r3)     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Exception -> L2f
        L53:
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch: java.lang.Exception -> L2f
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch: java.lang.Exception -> L2f
            int r3 = android.os.Binder.getCallingUid()     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L2f
            int r4 = r2.checkOp(r5, r3, r4)     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = "checkPermissinKITKATNew，locationOp,permission："
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2f
            r2.append(r4)     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = ","
            r2.append(r3)     // Catch: java.lang.Exception -> L2f
            r2.append(r5)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2f
            com.bytedance.msdk.j.up.cw.r(r0, r2)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L90
            r1 = 0
            java.lang.String r4 = "checkPermissinKITKATNew，false,permission："
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Exception -> L2f
            com.bytedance.msdk.j.up.cw.r(r0, r4)     // Catch: java.lang.Exception -> L2f
        L90:
            return r1
        L91:
            java.lang.String r5 = com.bytedance.msdk.core.vl.xt.j
            java.lang.String r0 = "权限检查出错时默认返回有权限，异常代码："
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            com.bytedance.msdk.j.up.cw.r(r5, r4)
            return r1
    }
}
