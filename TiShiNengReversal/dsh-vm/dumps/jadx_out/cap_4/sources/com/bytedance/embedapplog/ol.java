package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class ol extends com.bytedance.embedapplog.l {

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.embedapplog.rn f2090m;
    private final android.content.Context up;

    ol(android.content.Context r2, com.bytedance.embedapplog.rn r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            r1.up = r2
            r1.f2090m = r3
            return
    }

    @Override // com.bytedance.embedapplog.l
    protected boolean j(org.json.JSONObject r7) {
            r6 = this;
            android.content.Context r0 = r6.up
            java.lang.String r0 = r0.getPackageName()
            com.bytedance.embedapplog.rn r1 = r6.f2090m
            java.lang.CharSequence r1 = r1.z()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            java.lang.String r3 = "package"
            if (r1 == 0) goto L19
            r7.put(r3, r0)
            goto L30
        L19:
            boolean r1 = com.bytedance.embedapplog.uc.xt
            if (r1 == 0) goto L22
            java.lang.String r1 = "has zijie pkg"
            com.bytedance.embedapplog.uc.j(r1, r2)
        L22:
            com.bytedance.embedapplog.rn r1 = r6.f2090m
            java.lang.CharSequence r1 = r1.z()
            r7.put(r3, r1)
            java.lang.String r1 = "real_package_name"
            r7.put(r1, r0)
        L30:
            r1 = 0
            android.content.Context r3 = r6.up     // Catch: java.lang.Throwable -> L3c
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L3c
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r0, r1)     // Catch: java.lang.Throwable -> L3c
            goto L3d
        L3c:
        L3d:
            if (r2 == 0) goto L45
            int r0 = r2.versionCode     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r7 = move-exception
            goto L10e
        L45:
            r0 = 0
        L46:
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.gq()     // Catch: java.lang.Throwable -> L42
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = ""
            java.lang.String r5 = "app_version"
            if (r3 != 0) goto L60
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.gq()     // Catch: java.lang.Throwable -> L42
            r7.put(r5, r3)     // Catch: java.lang.Throwable -> L42
            goto L69
        L60:
            if (r2 == 0) goto L65
            java.lang.String r3 = r2.versionName     // Catch: java.lang.Throwable -> L42
            goto L66
        L65:
            r3 = r4
        L66:
            r7.put(r5, r3)     // Catch: java.lang.Throwable -> L42
        L69:
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L42
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "app_version_minor"
            if (r3 != 0) goto L81
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L42
            r7.put(r5, r3)     // Catch: java.lang.Throwable -> L42
            goto L84
        L81:
            r7.put(r5, r4)     // Catch: java.lang.Throwable -> L42
        L84:
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            int r3 = r3.p()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "version_code"
            if (r3 == 0) goto L98
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            int r3 = r3.p()     // Catch: java.lang.Throwable -> L42
            r7.put(r4, r3)     // Catch: java.lang.Throwable -> L42
            goto L9b
        L98:
            r7.put(r4, r0)     // Catch: java.lang.Throwable -> L42
        L9b:
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            int r3 = r3.h()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "update_version_code"
            if (r3 == 0) goto Laf
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            int r3 = r3.h()     // Catch: java.lang.Throwable -> L42
            r7.put(r4, r3)     // Catch: java.lang.Throwable -> L42
            goto Lb2
        Laf:
            r7.put(r4, r0)     // Catch: java.lang.Throwable -> L42
        Lb2:
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            int r3 = r3.la()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "manifest_version_code"
            if (r3 == 0) goto Lc6
            com.bytedance.embedapplog.rn r0 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            int r0 = r0.la()     // Catch: java.lang.Throwable -> L42
            r7.put(r4, r0)     // Catch: java.lang.Throwable -> L42
            goto Lc9
        Lc6:
            r7.put(r4, r0)     // Catch: java.lang.Throwable -> L42
        Lc9:
            com.bytedance.embedapplog.rn r0 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.l()     // Catch: java.lang.Throwable -> L42
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto Le0
            java.lang.String r0 = "app_name"
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.l()     // Catch: java.lang.Throwable -> L42
            r7.put(r0, r3)     // Catch: java.lang.Throwable -> L42
        Le0:
            com.bytedance.embedapplog.rn r0 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.rn()     // Catch: java.lang.Throwable -> L42
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto Lf7
            java.lang.String r0 = "tweaked_channel"
            com.bytedance.embedapplog.rn r3 = r6.f2090m     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = r3.rn()     // Catch: java.lang.Throwable -> L42
            r7.put(r0, r3)     // Catch: java.lang.Throwable -> L42
        Lf7:
            if (r2 == 0) goto L10c
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L10c
            int r0 = r0.labelRes     // Catch: java.lang.Throwable -> L42
            if (r0 <= 0) goto L10c
            java.lang.String r2 = "display_name"
            android.content.Context r3 = r6.up     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L42
            r7.put(r2, r0)     // Catch: java.lang.Throwable -> L42
        L10c:
            r7 = 1
            return r7
        L10e:
            com.bytedance.embedapplog.uc.xt(r7)
            return r1
    }
}
