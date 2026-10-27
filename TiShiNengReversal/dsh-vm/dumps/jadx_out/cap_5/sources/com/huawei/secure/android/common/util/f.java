package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    private static final java.lang.String a = "PermissionUtil";

    static {
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r2, java.lang.String r3, java.lang.String r4) throws com.huawei.secure.android.common.exception.NoPermissionCheckerException {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lc
            r2 = 0
            return r2
        Lc:
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Binder.getCallingUid()
            boolean r2 = b(r2, r3, r0, r1, r4)
            return r2
    }

    public static boolean b(android.content.Context r4, java.lang.String r5, int r6, int r7, java.lang.String r8) throws com.huawei.secure.android.common.exception.NoPermissionCheckerException {
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.targetSdkVersion     // Catch: java.lang.Throwable -> L1c
            r1 = 23
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L14
            int r4 = r4.checkPermission(r5, r6, r7)     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L13
            return r3
        L13:
            return r2
        L14:
            int r4 = androidx.core.content.PermissionChecker.checkPermission(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L1b
            return r3
        L1b:
            return r2
        L1c:
            r4 = move-exception
            r4.getMessage()
            com.huawei.secure.android.common.exception.NoPermissionCheckerException r4 = new com.huawei.secure.android.common.exception.NoPermissionCheckerException
            java.lang.String r5 = "you should implementation support library or androidx library"
            r4.<init>(r5)
            throw r4
    }

    public static boolean c(android.content.Context r3, java.lang.String r4) throws com.huawei.secure.android.common.exception.NoPermissionCheckerException {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            boolean r3 = b(r3, r4, r0, r1, r2)
            return r3
    }
}
