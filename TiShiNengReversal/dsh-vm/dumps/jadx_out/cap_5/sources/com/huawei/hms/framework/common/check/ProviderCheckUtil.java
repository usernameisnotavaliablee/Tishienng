package com.huawei.hms.framework.common.check;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ProviderCheckUtil {
    private static final java.lang.String a = "ProviderCheckUtil";

    public ProviderCheckUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(android.content.pm.PackageManager r3, java.lang.String r4) {
            java.lang.String r0 = "com.huawei.hwid"
            int r0 = r3.checkSignatures(r0, r4)
            r1 = 1
            java.lang.String r2 = "ProviderCheckUtil"
            if (r0 != 0) goto L11
            java.lang.String r3 = "Valid Provider"
            com.huawei.hms.framework.common.Logger.v(r2, r3)
            return r1
        L11:
            java.lang.String r0 = "com.huawei.hwid.tv"
            int r3 = r3.checkSignatures(r0, r4)
            if (r3 != 0) goto L1f
            java.lang.String r3 = "Valid Provider in tv"
            com.huawei.hms.framework.common.Logger.v(r2, r3)
            return r1
        L1f:
            r3 = 0
            return r3
    }

    public static boolean isValid(android.net.Uri r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r5 = r5.getAuthority()
            android.content.pm.ProviderInfo r5 = r1.resolveContentProvider(r5, r0)
            java.lang.String r2 = "ProviderCheckUtil"
            if (r5 == 0) goto L40
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            if (r5 != 0) goto L1d
            goto L40
        L1d:
            java.lang.String r5 = r5.packageName
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Target provider service's package name is : "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.framework.common.Logger.v(r2, r3)
            if (r5 != 0) goto L3b
            java.lang.String r5 = "Invalid packageName"
            com.huawei.hms.framework.common.Logger.w(r2, r5)
            return r0
        L3b:
            boolean r5 = a(r1, r5)
            return r5
        L40:
            java.lang.String r5 = "Invalid param"
            com.huawei.hms.framework.common.Logger.w(r2, r5)
            return r0
    }
}
