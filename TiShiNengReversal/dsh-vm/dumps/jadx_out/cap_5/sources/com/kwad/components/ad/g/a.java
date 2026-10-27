package com.kwad.components.ad.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {


    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.util.Map<java.lang.String, com.kwad.sdk.app.AppPackageInfo> P(android.content.Context r8) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r8 != 0) goto L9
            goto Led
        L9:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            boolean r2 = com.kwad.sdk.utils.bc.readInstalledPackagesDisable()
            r3 = 0
            if (r2 == 0) goto L49
            java.util.List r2 = com.kwad.sdk.utils.bc.getDevInstalledPackages()     // Catch: java.lang.Exception -> Led
            if (r2 == 0) goto Led
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Exception -> Led
            if (r4 != 0) goto Led
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Led
            r4.<init>(r2)     // Catch: java.lang.Exception -> Led
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Exception -> Led
        L29:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> Led
            if (r4 == 0) goto Led
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> Led
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Led
            android.content.pm.PackageInfo r4 = com.kwad.sdk.utils.y.getPackageInfo(r8, r4, r3)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L3c
            goto L29
        L3c:
            com.kwad.sdk.app.AppPackageInfo r4 = a(r4, r1)     // Catch: java.lang.Throwable -> L29
            r5 = 3
            r4.reportMethod = r5     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r4.packageName     // Catch: java.lang.Throwable -> L29
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L29
            goto L29
        L49:
            java.lang.Class<com.kwad.sdk.service.a.h> r2 = com.kwad.sdk.service.a.h.class
            java.lang.Object r2 = com.kwad.sdk.service.ServiceProvider.get(r2)
            com.kwad.sdk.service.a.h r2 = (com.kwad.sdk.service.a.h) r2
            if (r2 == 0) goto Led
            boolean r4 = com.kwad.sdk.utils.s.PW()
            if (r4 != 0) goto L5b
            goto Led
        L5b:
            java.util.List r4 = com.kwad.sdk.utils.br.ec(r8)     // Catch: java.lang.Exception -> Le2
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> Le2
            java.lang.String r6 = "android.intent.action.MAIN"
            r7 = 0
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> Le2
            java.lang.String r6 = "android.intent.category.LAUNCHER"
            r5.addCategory(r6)     // Catch: java.lang.Exception -> Le2
            android.content.pm.PackageManager r6 = r8.getPackageManager()     // Catch: java.lang.Exception -> Le2
            r7 = 32
            java.util.List r5 = r6.queryIntentActivities(r5, r7)     // Catch: java.lang.Exception -> Le2
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> Le2
        L7a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> Le2
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> Le2
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6     // Catch: java.lang.Exception -> Le2
            if (r6 == 0) goto L7a
            android.content.pm.ActivityInfo r7 = r6.activityInfo     // Catch: java.lang.Exception -> Le2
            if (r7 == 0) goto L7a
            java.lang.String r7 = r7.packageName     // Catch: java.lang.Exception -> Le2
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> Le2
            if (r7 != 0) goto L7a
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch: java.lang.Exception -> Le2
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Exception -> Le2
            if (r4 == 0) goto La3
            boolean r7 = r4.isEmpty()     // Catch: java.lang.Exception -> Le2
            if (r7 != 0) goto La3
            r4.remove(r6)     // Catch: java.lang.Exception -> Le2
        La3:
            android.content.pm.PackageInfo r6 = com.kwad.sdk.utils.y.getPackageInfo(r8, r6, r3)     // Catch: java.lang.Exception -> Le2
            if (r6 == 0) goto L7a
            com.kwad.sdk.app.AppPackageInfo r6 = a(r6, r1)     // Catch: java.lang.Exception -> Le2
            r7 = 1
            r6.reportMethod = r7     // Catch: java.lang.Exception -> Le2
            java.lang.String r7 = r6.packageName     // Catch: java.lang.Exception -> Le2
            r0.put(r7, r6)     // Catch: java.lang.Exception -> Le2
            goto L7a
        Lb6:
            if (r4 == 0) goto Le2
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Exception -> Le2
            if (r5 != 0) goto Le2
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> Le2
        Lc2:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> Le2
            if (r5 == 0) goto Le2
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> Le2
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Le2
            android.content.pm.PackageInfo r5 = com.kwad.sdk.utils.y.getPackageInfo(r8, r5, r3)     // Catch: java.lang.Throwable -> Lc2
            if (r5 != 0) goto Ld5
            goto Lc2
        Ld5:
            com.kwad.sdk.app.AppPackageInfo r5 = a(r5, r1)     // Catch: java.lang.Throwable -> Lc2
            r6 = 2
            r5.reportMethod = r6     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = r5.packageName     // Catch: java.lang.Throwable -> Lc2
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> Lc2
            goto Lc2
        Le2:
            java.util.List r1 = r2.BB()
            java.util.Map r8 = c(r8, r1)
            r0.putAll(r8)
        Led:
            return r0
    }

    public static com.kwad.sdk.app.AppPackageInfo a(@androidx.annotation.NonNull android.content.pm.PackageInfo r3, @androidx.annotation.Nullable android.content.pm.PackageManager r4) {
            com.kwad.sdk.app.AppPackageInfo r0 = new com.kwad.sdk.app.AppPackageInfo
            r0.<init>()
            java.lang.String r1 = r3.packageName
            r0.packageName = r1
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            if (r1 == 0) goto L21
            boolean r1 = a(r1)
            if (r1 != 0) goto L1e
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            boolean r1 = b(r1)
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r1 = 0
            goto L1f
        L1e:
            r1 = 1
        L1f:
            r0.isSystemApp = r1
        L21:
            java.lang.String r1 = r3.versionName
            r0.versionName = r1
            long r1 = r3.firstInstallTime
            r0.firstInstallTime = r1
            long r1 = r3.lastUpdateTime
            r0.lastUpdateTime = r1
            if (r4 == 0) goto L50
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            if (r1 == 0) goto L50
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r2 = r3.packageName
            boolean r1 = com.kwad.sdk.utils.as.ap(r1, r2)
            if (r1 == 0) goto L50
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Throwable -> L4c
            java.lang.CharSequence r3 = r3.loadLabel(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            r0.appName = r3     // Catch: java.lang.Throwable -> L4c
            return r0
        L4c:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L50:
            return r0
    }

    public static org.json.JSONObject a(com.kwad.sdk.app.AppPackageInfo r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "pkgName"
            java.lang.String r2 = r4.packageName
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "system_app"
            boolean r2 = r4.isSystemApp
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "appVersion"
            java.lang.String r2 = r4.versionName
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "firstInstallTime"
            long r2 = r4.firstInstallTime
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "lastUpdateTime"
            long r2 = r4.lastUpdateTime
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "reportMethod"
            int r2 = r4.reportMethod
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "appName"
            java.lang.String r4 = r4.appName
            com.kwad.sdk.utils.aa.putValue(r0, r1, r4)
            return r0
    }

    public static void a(android.content.Context r1, com.kwad.sdk.g.a<org.json.JSONArray> r2) {
            com.kwad.components.ad.g.a$1 r0 = new com.kwad.components.ad.g.a$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.h.execute(r0)
            return
    }

    private static boolean a(android.content.pm.ApplicationInfo r1) {
            int r1 = r1.flags
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    private static boolean b(android.content.pm.ApplicationInfo r0) {
            int r0 = r0.flags
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public static org.json.JSONArray[] b(android.content.Context r6, java.util.List<java.lang.String> r7) {
            r0 = 2
            org.json.JSONArray[] r0 = new org.json.JSONArray[r0]
            java.lang.Class<com.kwad.sdk.service.a.h> r1 = com.kwad.sdk.service.a.h.class
            java.lang.Object r1 = com.kwad.sdk.service.ServiceProvider.get(r1)
            com.kwad.sdk.service.a.h r1 = (com.kwad.sdk.service.a.h) r1
            if (r6 == 0) goto L71
            if (r7 == 0) goto L71
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L71
            if (r1 != 0) goto L18
            goto L71
        L18:
            boolean r1 = com.kwad.sdk.utils.s.PW()
            if (r1 != 0) goto L1f
            goto L71
        L1f:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r3 = r7.hasNext()
            r4 = 0
            if (r3 == 0) goto L64
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            android.content.pm.PackageManager r5 = r6.getPackageManager()     // Catch: java.lang.Exception -> L59
            android.content.pm.PackageInfo r4 = com.kwad.sdk.utils.y.getPackageInfo(r6, r3, r4)     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L4e
            com.kwad.sdk.app.AppPackageInfo r4 = a(r4, r5)     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = r4.packageName     // Catch: java.lang.Exception -> L59
            r1.put(r5, r4)     // Catch: java.lang.Exception -> L59
            goto L2d
        L4e:
            com.kwad.sdk.app.AppPackageInfo r4 = new com.kwad.sdk.app.AppPackageInfo     // Catch: java.lang.Exception -> L59
            r4.<init>()     // Catch: java.lang.Exception -> L59
            r4.packageName = r3     // Catch: java.lang.Exception -> L59
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L59
            goto L2d
        L59:
            com.kwad.sdk.app.AppPackageInfo r4 = new com.kwad.sdk.app.AppPackageInfo
            r4.<init>()
            r4.packageName = r3
            r2.put(r3, r4)
            goto L2d
        L64:
            org.json.JSONArray r6 = c(r1)
            r0[r4] = r6
            r6 = 1
            org.json.JSONArray r7 = c(r2)
            r0[r6] = r7
        L71:
            return r0
    }

    @androidx.annotation.NonNull
    private static java.util.Map<java.lang.String, com.kwad.sdk.app.AppPackageInfo> c(android.content.Context r4, java.util.List<java.lang.String> r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r4 == 0) goto L31
            if (r5 != 0) goto La
            goto L31
        La:
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Exception -> L2f
            r3 = 0
            android.content.pm.PackageInfo r1 = com.kwad.sdk.utils.y.getPackageInfo(r4, r1, r3)     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto Le
            com.kwad.sdk.app.AppPackageInfo r1 = a(r1, r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r1.packageName     // Catch: java.lang.Exception -> L2f
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L2f
            goto Le
        L2f:
            goto Le
        L31:
            return r0
    }

    @androidx.annotation.NonNull
    public static org.json.JSONArray c(@androidx.annotation.NonNull java.util.Map<java.lang.String, com.kwad.sdk.app.AppPackageInfo> r4) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Set r1 = r4.keySet()     // Catch: java.lang.Exception -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L31
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L31
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Exception -> L31
            com.kwad.sdk.app.AppPackageInfo r2 = (com.kwad.sdk.app.AppPackageInfo) r2     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto Ld
            java.lang.String r3 = r2.packageName     // Catch: java.lang.Exception -> L31
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto Ld
            org.json.JSONObject r2 = a(r2)     // Catch: java.lang.Exception -> L31
            com.kwad.sdk.utils.aa.a(r0, r2)     // Catch: java.lang.Exception -> L31
            goto Ld
        L31:
            r4 = move-exception
            goto L34
        L33:
            return r0
        L34:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r4)
            return r0
    }
}
