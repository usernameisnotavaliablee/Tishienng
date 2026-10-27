package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SystemPropUtils {
    private static final java.lang.String a = "SystemPropUtils";

    static {
            return
    }

    public SystemPropUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getProperty(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L3c
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L3c
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L13
            goto L3c
        L13:
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Exception -> L33
            r0 = 2
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L33
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L33
            r4 = 1
            r1[r4] = r2     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Method r5 = r7.getMethod(r5, r1)     // Catch: java.lang.Exception -> L33
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L33
            r0[r3] = r6     // Catch: java.lang.Exception -> L33
            r0[r4] = r8     // Catch: java.lang.Exception -> L33
            java.lang.Object r5 = r5.invoke(r7, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L33
            return r5
        L33:
            r5 = move-exception
            java.lang.String r6 = com.huawei.hms.framework.common.SystemPropUtils.a
            java.lang.String r7 = "getProperty catch exception: "
            com.huawei.hms.framework.common.Logger.e(r6, r7, r5)
            return r8
        L3c:
            java.lang.String r5 = com.huawei.hms.framework.common.SystemPropUtils.a
            java.lang.String r6 = "reflect class for method has exception."
            com.huawei.hms.framework.common.Logger.w(r5, r6)
            return r8
    }
}
