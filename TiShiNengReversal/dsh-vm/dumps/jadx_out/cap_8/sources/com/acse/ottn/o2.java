package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o2 {
    public static final java.lang.String a = "MeizuUtils";

    public o2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(androidx.appcompat.app.AppCompatActivity r4, int r5) {
            java.lang.String r0 = "MeizuUtils"
            java.lang.String r1 = com.acse.ottn.l0.w
            java.lang.String r2 = ""
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Ld
            goto L5a
        Ld:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = "com.meizu.safe.security.SHOW_APPSEC"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = "packageName"
            java.lang.String r3 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L24
            r1.putExtra(r2, r3)     // Catch: java.lang.Exception -> L24
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r2)     // Catch: java.lang.Exception -> L24
            r4.startActivityForResult(r1, r5)     // Catch: java.lang.Exception -> L24
            return
        L24:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            r2.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "获取悬浮窗权限, 打开AppSecActivity失败, "
            r2.append(r3)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)     // Catch: java.lang.Exception -> L41
            r2.append(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L41
            com.acse.ottn.h2.b(r0, r1)     // Catch: java.lang.Exception -> L41
            com.acse.ottn.i1.e(r4, r5)     // Catch: java.lang.Exception -> L41
            goto L5a
        L41:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "获取悬浮窗权限失败, 通用获取方法失败, "
            r5.append(r1)
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.acse.ottn.h2.b(r0, r4)
        L5a:
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
            java.lang.String r9 = "MeizuUtils"
            com.acse.ottn.h2.b(r9, r8)
            return r1
    }
}
