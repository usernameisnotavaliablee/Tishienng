package com.huawei.hms.ml.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PermissionUtils {
    public PermissionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkPermission(android.content.Context r0, java.lang.String r1) {
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r0 = checkPermissions(r0, r1)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static java.util.List<java.lang.Boolean> checkPermissions(android.content.Context r4, java.util.List<java.lang.String> r5) {
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r0.checkPermission(r2, r4)
            r3 = -1
            if (r2 == r3) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.add(r2)
            goto L11
        L2f:
            return r1
    }
}
