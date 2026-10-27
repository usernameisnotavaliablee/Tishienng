package com.qq.e.comm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r4) {
            r0 = 0
            boolean r1 = b(r4)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L53
            java.lang.String r1 = com.qq.e.comm.constants.CustomPkgConstants.getADActivityName()     // Catch: java.lang.Throwable -> L51
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L51
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L51
            r3[r0] = r1     // Catch: java.lang.Throwable -> L51
            boolean r1 = a(r4, r3)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L53
            java.lang.String r1 = com.qq.e.comm.constants.CustomPkgConstants.getPortraitADActivityName()     // Catch: java.lang.Throwable -> L51
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L51
            r3[r0] = r1     // Catch: java.lang.Throwable -> L51
            boolean r1 = a(r4, r3)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L53
            java.lang.String r1 = com.qq.e.comm.constants.CustomPkgConstants.getLandscapeADActivityName()     // Catch: java.lang.Throwable -> L51
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L51
            r3[r0] = r1     // Catch: java.lang.Throwable -> L51
            boolean r1 = a(r4, r3)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L53
            java.lang.String r1 = com.qq.e.comm.constants.CustomPkgConstants.getDownLoadServiceName()     // Catch: java.lang.Throwable -> L51
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L51
            r3[r0] = r1     // Catch: java.lang.Throwable -> L51
            boolean r4 = b(r4, r3)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L53
            return r2
        L51:
            r4 = move-exception
            goto L54
        L53:
            return r0
        L54:
            java.lang.String r1 = "检查AndroidManifest.xml时发生异常"
            com.qq.e.comm.util.GDTLogger.e(r1, r4)
            return r0
    }

    private static boolean a(android.content.Context r6, java.lang.Class<?>... r7) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r7.length     // Catch: java.lang.Throwable -> L30
            r3 = 1
            if (r1 >= r2) goto L35
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r4 = r7[r1]     // Catch: java.lang.Throwable -> L30
            r2.setClass(r6, r4)     // Catch: java.lang.Throwable -> L30
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L30
            r5 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r2 = r4.resolveActivity(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L32
            java.lang.String r6 = "Activity[%s]需要在AndroidManifest.xml中声明"
            r7 = r7[r1]     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L30
            r1[r0] = r7     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch: java.lang.Throwable -> L30
            com.qq.e.comm.util.GDTLogger.e(r6)     // Catch: java.lang.Throwable -> L30
            return r0
        L30:
            r6 = move-exception
            goto L36
        L32:
            int r1 = r1 + 1
            goto L2
        L35:
            return r3
        L36:
            java.lang.String r7 = "检查Activity时发生异常"
            com.qq.e.comm.util.GDTLogger.e(r7, r6)
            return r0
    }

    private static boolean b(android.content.Context r7) {
            java.lang.String r0 = "android.permission.INTERNET"
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
        La:
            r3 = 1
            r4 = 2
            if (r2 >= r4) goto L30
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L25
            int r5 = r7.checkCallingOrSelfPermission(r4)     // Catch: java.lang.Throwable -> L25
            r6 = -1
            if (r5 != r6) goto L27
            java.lang.String r7 = "Permission[%s]需要在AndroidManifest.xml中声明"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L25
            r0[r1] = r4     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = java.lang.String.format(r7, r0)     // Catch: java.lang.Throwable -> L25
            com.qq.e.comm.util.GDTLogger.e(r7)     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r7 = move-exception
            goto L2a
        L27:
            int r2 = r2 + 1
            goto La
        L2a:
            java.lang.String r0 = "检查权限时发生异常"
            com.qq.e.comm.util.GDTLogger.e(r0, r7)
            return r1
        L30:
            return r3
    }

    private static boolean b(android.content.Context r8, java.lang.Class<?>... r9) {
            r0 = 0
            int r1 = r9.length     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        L3:
            r3 = 1
            if (r2 >= r1) goto L33
            r4 = r9[r2]     // Catch: java.lang.Throwable -> L2e
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            r5.<init>()     // Catch: java.lang.Throwable -> L2e
            r5.setClass(r8, r4)     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r6 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            r7 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r5 = r6.resolveService(r5, r7)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L30
            java.lang.String r8 = "Service[%s]需要在AndroidManifest.xml中声明"
            java.lang.String r9 = r4.getName()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2e
            r1[r0] = r9     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = java.lang.String.format(r8, r1)     // Catch: java.lang.Throwable -> L2e
            com.qq.e.comm.util.GDTLogger.e(r8)     // Catch: java.lang.Throwable -> L2e
            return r0
        L2e:
            r8 = move-exception
            goto L34
        L30:
            int r2 = r2 + 1
            goto L3
        L33:
            return r3
        L34:
            java.lang.String r9 = "检查Service时发生异常"
            com.qq.e.comm.util.GDTLogger.e(r9, r8)
            return r0
    }
}
