package q1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = "7.0.2.301"
            return r0
    }

    public static java.lang.String b(android.content.Context r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            android.content.Context r1 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            if (r1 != 0) goto Lc
            goto L10
        Lc:
            android.content.Context r3 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
        L10:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            r2 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            java.lang.String r3 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            return r3
        L21:
            r3 = move-exception
            java.lang.String r1 = "AgentUtil"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r3)
            return r0
    }

    public static java.lang.String c(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L24
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "/%s"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = a()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7, r1)
            return r6
        L24:
            android.content.Context r2 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            if (r2 != 0) goto L2c
            r2 = r6
            goto L30
        L2c:
            android.content.Context r2 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
        L30:
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r6 = b(r6)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "%s/%s (Linux; Android %s; %s) "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r7 = "/%s %s"
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = a()
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L5c
            java.lang.String r8 = "no_service_name"
        L5c:
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r2
            r5[r1] = r6
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            r0 = 2
            r5[r0] = r6
            java.lang.String r6 = android.os.Build.MODEL
            r0 = 3
            r5[r0] = r6
            r6 = 4
            r5[r6] = r4
            r6 = 5
            r5[r6] = r8
            java.lang.String r6 = java.lang.String.format(r3, r7, r5)
            return r6
    }

    public static java.lang.String d(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = c(r0, r1, r2)
            return r0
    }
}
