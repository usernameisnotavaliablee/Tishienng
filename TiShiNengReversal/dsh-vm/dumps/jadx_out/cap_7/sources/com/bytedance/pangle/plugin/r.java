package com.bytedance.pangle.plugin;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {
    private static final com.bytedance.pangle.oq j = null;





    static {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            com.bytedance.pangle.plugin.r.j = r0
            return
    }

    r() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.pm.PackageInfo j(com.bytedance.pangle.plugin.r r0, java.lang.String r1, com.bytedance.pangle.plugin.Plugin r2, java.lang.StringBuilder r3, java.lang.String r4, java.io.File r5) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageInfo r0 = r0.j(r1, r2, r3, r4, r5)
            return r0
    }

    private android.content.pm.PackageInfo j(java.lang.String r6, com.bytedance.pangle.plugin.Plugin r7, java.lang.StringBuilder r8, java.lang.String r9, java.io.File r10) throws android.content.pm.PackageManager.NameNotFoundException {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r3 = 143(0x8f, float:2.0E-43)
            android.content.pm.PackageInfo r2 = r2.getPackageArchiveInfo(r9, r3)
            android.app.Application r3 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r4 = r7.mPkgName
            android.app.Application r3 = com.bytedance.pangle.transform.ZeusTransformUtils.wrapperContext2Application(r3, r4)
            com.bytedance.pangle.wrapper.PluginApplicationWrapper r3 = (com.bytedance.pangle.wrapper.PluginApplicationWrapper) r3
            r7.mHostApplication = r3
            android.content.pm.ApplicationInfo r3 = new android.content.pm.ApplicationInfo
            android.app.Application r4 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            r3.<init>(r4)
            r7.mHostApplicationInfoHookSomeField = r3
            java.lang.String r10 = r10.getAbsolutePath()
            r3.nativeLibraryDir = r10
            android.content.pm.ApplicationInfo r10 = r7.mHostApplicationInfoHookSomeField
            com.bytedance.pangle.wrapper.PluginApplicationWrapper r3 = r7.mHostApplication
            java.io.File r3 = r3.getDataDir()
            java.lang.String r3 = r3.getAbsolutePath()
            r10.dataDir = r3
            android.content.pm.ApplicationInfo r10 = r7.mHostApplicationInfoHookSomeField
            r10.sourceDir = r9
            android.content.pm.ApplicationInfo r10 = r2.applicationInfo
            java.lang.String r10 = r10.sourceDir
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L55
            android.content.pm.ApplicationInfo r10 = r2.applicationInfo
            r10.sourceDir = r9
        L55:
            android.content.pm.ApplicationInfo r10 = r2.applicationInfo
            java.lang.String r10 = r10.publicSourceDir
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L63
            android.content.pm.ApplicationInfo r10 = r2.applicationInfo
            r10.publicSourceDir = r9
        L63:
            com.bytedance.pangle.res.PluginResources r9 = new com.bytedance.pangle.res.PluginResources
            android.app.Application r10 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo
            android.content.res.Resources r10 = r10.getResourcesForApplication(r3)
            r9.<init>(r10, r6)
            r7.mResources = r9
            android.app.Application r6 = com.bytedance.pangle.Zeus.getAppApplication()
            com.bytedance.pangle.plugin.r$3 r9 = new com.bytedance.pangle.plugin.r$3
            r9.<init>(r5, r7)
            r6.registerComponentCallbacks(r9)
            java.lang.String r6 = "makeResources cost:"
            r8.append(r6)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r0
            r8.append(r6)
            java.lang.String r6 = ";"
            r8.append(r6)
            return r2
    }

    private java.io.File j(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r2 = com.bytedance.pangle.up.cw.cw(r2, r3)
            r0.<init>(r2)
            boolean r2 = com.bytedance.pangle.util.g.ae()
            if (r2 == 0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = com.bytedance.pangle.m.xt.j(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            boolean r2 = com.bytedance.pangle.m.xt.j(r2)
            if (r2 == 0) goto L32
            goto L33
        L32:
            r0 = 0
        L33:
            if (r0 == 0) goto L3e
            boolean r2 = r0.exists()
            if (r2 != 0) goto L3e
            r0.mkdirs()
        L3e:
            return r0
    }

    private static void j(com.bytedance.pangle.plugin.Plugin r8, java.lang.String r9) throws org.json.JSONException {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto Ld3
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r9)
            java.lang.String r9 = "mapping"
            org.json.JSONObject r1 = r0.optJSONObject(r9)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r1 == 0) goto L30
            java.util.Iterator r3 = r1.keys()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r1.getString(r4)
            r2.put(r4, r5)
            goto L1c
        L30:
            java.lang.String r1 = "forceMappings"
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            if (r0 == 0) goto L7c
            r1 = 0
            r3 = 0
        L3a:
            int r4 = r0.length()
            if (r3 >= r4) goto L7c
            org.json.JSONObject r4 = r0.getJSONObject(r3)
            java.lang.String r5 = "minApi"
            int r5 = r4.optInt(r5, r1)
            java.lang.String r6 = "maxApi"
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r6 = r4.optInt(r6, r7)
            int r7 = r8.getApiVersionCode()
            if (r7 > r6) goto L79
            if (r7 < r5) goto L79
            org.json.JSONObject r4 = r4.optJSONObject(r9)
            if (r4 == 0) goto L79
            java.util.Iterator r5 = r4.keys()
        L65:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r4.getString(r6)
            r2.put(r6, r7)
            goto L65
        L79:
            int r3 = r3 + 1
            goto L3a
        L7c:
            java.util.Set r9 = r2.keySet()
            java.util.Iterator r9 = r9.iterator()
        L84:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = r8.mPkgName
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "."
            if (r1 == 0) goto Laa
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto Laa
            java.lang.String r1 = ""
            goto Lbb
        Laa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = r8.mPkgName
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
        Lbb:
            r4.append(r1)
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.bytedance.pangle.ComponentManager.registerActivity(r3, r1, r0)
            goto L84
        Ld3:
            return
    }

    private void j(com.bytedance.pangle.plugin.Plugin r10, java.lang.String r11, java.io.File r12, java.io.File r13) throws java.lang.Exception {
            r9 = this;
            boolean r0 = j()
            java.lang.String r1 = ""
            r2 = 0
            if (r0 == 0) goto L18
            com.bytedance.pangle.PluginClassLoader r0 = new com.bytedance.pangle.PluginClassLoader
            java.lang.String r12 = r12.getAbsolutePath()
            r0.<init>(r1, r13, r12, r2)
            r10.mClassLoader = r0
            j(r0, r11)
            return
        L18:
            boolean r0 = com.bytedance.pangle.util.g.cw()
            if (r0 == 0) goto L6c
            java.lang.String r11 = r10.mPkgName
            int r0 = r10.getVersion()
            java.lang.String r11 = com.bytedance.pangle.m.ae.j(r11, r0)
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r11.split(r0)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = r13.getAbsolutePath()
            boolean r0 = com.bytedance.pangle.m.xt.j(r5, r0)
            r5 = r0 ^ 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "useDirect:"
            r6.<init>(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            r6.append(r7)
            java.lang.String r3 = " "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "Zeus/load_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r4, r3)
            if (r0 != 0) goto L5f
            goto L60
        L5f:
            r1 = r11
        L60:
            com.bytedance.pangle.PluginClassLoader r11 = new com.bytedance.pangle.PluginClassLoader
            java.lang.String r12 = r12.getAbsolutePath()
            r11.<init>(r1, r13, r12, r2)
            r10.mClassLoader = r11
            return
        L6c:
            com.bytedance.pangle.PluginClassLoader r0 = new com.bytedance.pangle.PluginClassLoader
            java.lang.String r12 = r12.getAbsolutePath()
            r0.<init>(r11, r13, r12, r2)
            r10.mClassLoader = r0
            return
    }

    private void j(com.bytedance.pangle.plugin.Plugin r5, java.lang.String r6, java.io.File r7, java.io.File r8, java.lang.StringBuilder r9) throws java.lang.Throwable {
            r4 = this;
            java.lang.String r0 = ";"
            java.lang.String r1 = "actStubV1 cost:"
            long r2 = java.lang.System.currentTimeMillis()
            r4.j(r5, r6, r7, r8)
            java.lang.String r6 = "classLoader cost:"
            r9.append(r6)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            r9.append(r6)
            java.lang.String r6 = " ;"
            r9.append(r6)
            boolean r6 = r5.mOpenLoadClassOpt
            if (r6 == 0) goto L29
            com.bytedance.pangle.plugin.r$4 r6 = new com.bytedance.pangle.plugin.r$4
            r6.<init>(r4, r5)
            com.bytedance.pangle.up.up.j(r6)
        L29:
            long r6 = java.lang.System.currentTimeMillis()
            com.bytedance.pangle.PluginClassLoader r8 = r5.mClassLoader     // Catch: java.lang.Throwable -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.String r2 = "com.volcengine.StubConfig"
            java.lang.Class r8 = r8.loadClass(r2)     // Catch: java.lang.Throwable -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.String r2 = "actStubV1"
            java.lang.Object r8 = com.bytedance.pangle.util.FieldUtils.readStaticField(r8, r2)     // Catch: java.lang.Throwable -> L43 java.lang.ClassNotFoundException -> L45
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L43 java.lang.ClassNotFoundException -> L45
            if (r8 == 0) goto L45
            j(r5, r8)     // Catch: java.lang.Throwable -> L43 java.lang.ClassNotFoundException -> L45
            goto L45
        L43:
            r5 = move-exception
            goto L54
        L45:
            r9.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r9.append(r1)
            r9.append(r0)
            return
        L54:
            r9.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r9.append(r1)
            r9.append(r0)
            throw r5
    }

    private void j(com.bytedance.pangle.plugin.Plugin r11, java.lang.StringBuilder r12, android.content.pm.PackageInfo r13) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
            r10 = this;
            android.content.pm.ActivityInfo[] r0 = r13.activities
            java.lang.String r1 = "main"
            r2 = 0
            r3 = 1
            java.lang.String r4 = ":"
            if (r0 == 0) goto L38
            int r5 = r0.length
            r6 = 0
        Lc:
            if (r6 >= r5) goto L38
            r7 = r0[r6]
            java.lang.String r8 = r7.processName
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L2c
            java.lang.String r8 = r7.processName
            boolean r8 = r8.contains(r4)
            if (r8 != 0) goto L21
            goto L2c
        L21:
            java.lang.String r8 = r7.processName
            java.lang.String[] r8 = r8.split(r4)
            r8 = r8[r3]
            r7.processName = r8
            goto L2e
        L2c:
            r7.processName = r1
        L2e:
            java.util.HashMap<java.lang.String, android.content.pm.ActivityInfo> r8 = r11.pluginActivities
            java.lang.String r9 = r7.name
            r8.put(r9, r7)
            int r6 = r6 + 1
            goto Lc
        L38:
            android.content.pm.ServiceInfo[] r0 = r13.services
            if (r0 == 0) goto L6a
            int r5 = r0.length
            r6 = 0
        L3e:
            if (r6 >= r5) goto L6a
            r7 = r0[r6]
            java.lang.String r8 = r7.processName
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L5e
            java.lang.String r8 = r7.processName
            boolean r8 = r8.contains(r4)
            if (r8 != 0) goto L53
            goto L5e
        L53:
            java.lang.String r8 = r7.processName
            java.lang.String[] r8 = r8.split(r4)
            r8 = r8[r3]
            r7.processName = r8
            goto L60
        L5e:
            r7.processName = r1
        L60:
            java.util.HashMap<java.lang.String, android.content.pm.ServiceInfo> r8 = r11.pluginServices
            java.lang.String r9 = r7.name
            r8.put(r9, r7)
            int r6 = r6 + 1
            goto L3e
        L6a:
            android.content.pm.ActivityInfo[] r0 = r13.receivers
            if (r0 == 0) goto L9c
            int r5 = r0.length
            r6 = 0
        L70:
            if (r6 >= r5) goto L9c
            r7 = r0[r6]
            java.lang.String r8 = r7.processName
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L90
            java.lang.String r8 = r7.processName
            boolean r8 = r8.contains(r4)
            if (r8 != 0) goto L85
            goto L90
        L85:
            java.lang.String r8 = r7.processName
            java.lang.String[] r8 = r8.split(r4)
            r8 = r8[r3]
            r7.processName = r8
            goto L92
        L90:
            r7.processName = r1
        L92:
            java.util.HashMap<java.lang.String, android.content.pm.ActivityInfo> r8 = r11.pluginReceiver
            java.lang.String r9 = r7.name
            r8.put(r9, r7)
            int r6 = r6 + 1
            goto L70
        L9c:
            android.content.pm.ProviderInfo[] r0 = r13.providers
            if (r0 == 0) goto Lcd
            int r5 = r0.length
        La1:
            if (r2 >= r5) goto Lcd
            r6 = r0[r2]
            java.lang.String r7 = r6.processName
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lc1
            java.lang.String r7 = r6.processName
            boolean r7 = r7.contains(r4)
            if (r7 != 0) goto Lb6
            goto Lc1
        Lb6:
            java.lang.String r7 = r6.processName
            java.lang.String[] r7 = r7.split(r4)
            r7 = r7[r3]
            r6.processName = r7
            goto Lc3
        Lc1:
            r6.processName = r1
        Lc3:
            java.util.HashMap<java.lang.String, android.content.pm.ProviderInfo> r7 = r11.pluginProvider
            java.lang.String r8 = r6.name
            r7.put(r8, r6)
            int r2 = r2 + 1
            goto La1
        Lcd:
            long r0 = java.lang.System.currentTimeMillis()
            java.util.HashMap<java.lang.String, android.content.pm.ProviderInfo> r2 = r11.pluginProvider
            if (r2 == 0) goto Le8
            int r2 = r2.size()
            if (r2 <= 0) goto Le8
            com.bytedance.pangle.provider.ContentProviderManager r2 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            java.util.HashMap<java.lang.String, android.content.pm.ProviderInfo> r3 = r11.pluginProvider
            java.util.Collection r3 = r3.values()
            r2.installContentProviders(r3, r11)
        Le8:
            java.lang.String r2 = "installProvider cost:"
            r12.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r12.append(r2)
            java.lang.String r0 = ";"
            r12.append(r0)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.pm.ApplicationInfo r3 = r13.applicationInfo
            java.lang.String r3 = r3.className
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L121
            com.bytedance.pangle.PluginClassLoader r3 = r11.mClassLoader
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            java.lang.String r13 = r13.className
            java.lang.Class r13 = r3.loadClass(r13)
            java.lang.Object r13 = r13.newInstance()
            com.bytedance.pangle.ZeusApplication r13 = (com.bytedance.pangle.ZeusApplication) r13
            r11.mApplication = r13
            android.app.Application r3 = com.bytedance.pangle.Zeus.getAppApplication()
            r13.attach(r11, r3)
        L121:
            java.lang.String r11 = "makeApplication cost:"
            r12.append(r11)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r12.append(r3)
            r12.append(r0)
            return
    }

    static /* synthetic */ void j(com.bytedance.pangle.plugin.r r0, com.bytedance.pangle.plugin.Plugin r1, java.lang.String r2, java.io.File r3, java.io.File r4, java.lang.StringBuilder r5) throws java.lang.Throwable {
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    public static void j(java.lang.String r4, int r5, @androidx.annotation.NonNull java.lang.String r6, int r7, long r8, java.lang.String r10) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "status_code"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = com.bytedance.pangle.log.xt.j(r5)     // Catch: org.json.JSONException -> L4d
            r0.putOpt(r3, r5)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "plugin_package_name"
            java.lang.String r6 = com.bytedance.pangle.log.xt.j(r6)     // Catch: org.json.JSONException -> L4d
            r0.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "version_code"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: org.json.JSONException -> L4d
            java.lang.String r6 = com.bytedance.pangle.log.xt.j(r6)     // Catch: org.json.JSONException -> L4d
            r0.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "duration"
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: org.json.JSONException -> L4d
            int r6 = com.bytedance.pangle.log.xt.xt(r6)     // Catch: org.json.JSONException -> L4d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: org.json.JSONException -> L4d
            r2.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "message"
            java.lang.String r6 = com.bytedance.pangle.log.xt.j(r10)     // Catch: org.json.JSONException -> L4d
            r1.putOpt(r5, r6)     // Catch: org.json.JSONException -> L4d
            goto L51
        L4d:
            r5 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r5)
        L51:
            com.bytedance.pangle.r.xt r5 = com.bytedance.pangle.r.xt.j()
            r5.j(r4, r0, r2, r1)
            return
    }

    private static boolean j() {
            boolean r0 = com.bytedance.pangle.util.g.mi()
            return r0
    }

    public static boolean j(java.lang.Object r7, java.lang.String r8) {
            java.lang.String r0 = "Zeus/load_pangle"
            r1 = 0
            if (r8 == 0) goto L1e
            java.lang.String r2 = java.io.File.pathSeparator     // Catch: java.lang.Throwable -> L1c
            java.lang.String[] r2 = r8.split(r2)     // Catch: java.lang.Throwable -> L1c
            int r3 = r2.length     // Catch: java.lang.Throwable -> L1c
            r4 = 0
        Ld:
            if (r4 >= r3) goto L1e
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L1c
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1c
            r6.setReadOnly()     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + 1
            goto Ld
        L1c:
            r7 = move-exception
            goto L42
        L1e:
            java.lang.Class<dalvik.system.BaseDexClassLoader> r2 = dalvik.system.BaseDexClassLoader.class
            java.lang.String r3 = "addDexPath"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Method r2 = com.bytedance.pangle.util.MethodUtils.getAccessibleMethod(r2, r3, r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1c
            r3[r1] = r8     // Catch: java.lang.Throwable -> L1c
            r2.invoke(r7, r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "PluginLoader createPluginClassLoader#addDexPath success >>>"
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = r7.concat(r2)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.pangle.log.ZeusLogger.i(r0, r7)     // Catch: java.lang.Throwable -> L1c
            return r4
        L42:
            com.bytedance.sdk.openadsdk.api.m.j(r7)
            java.lang.String r2 = "PluginLoader createPluginClassLoader#addDexPath fail >>>"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r2.concat(r8)
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r8, r7)
            return r1
    }

    private boolean j(java.lang.String r16, com.bytedance.pangle.plugin.Plugin r17, java.lang.StringBuilder r18) {
            r15 = this;
            r2 = r16
            r3 = r17
            r4 = r18
            java.lang.String r10 = "PluginLoader loadPluginInternal, plugin["
            java.lang.String r11 = "Zeus/load_pangle"
            r12 = 0
            if (r3 != 0) goto L2b
            java.lang.String r0 = "loadPluginInternal, plugin == null;"
            r4.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L27
            r0.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "] not exist !!!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            com.bytedance.pangle.log.ZeusLogger.w(r11, r0)     // Catch: java.lang.Throwable -> L27
            return r12
        L27:
            r0 = move-exception
            r13 = 0
            goto L12c
        L2b:
            boolean r0 = r3.isInstalled()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L4b
            java.lang.String r0 = "loadPluginInternal, !plugin.isInstalled();"
            r4.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L27
            r0.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "] not installed !!!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            com.bytedance.pangle.log.ZeusLogger.w(r11, r0)     // Catch: java.lang.Throwable -> L27
            return r12
        L4b:
            java.lang.String r0 = r3.mPkgName     // Catch: java.lang.Throwable -> L27
            int r1 = r3.getVersion()     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = com.bytedance.pangle.up.cw.xt(r0, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "PluginLoaderfind Apk: sourceApk:"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            r0.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = " ; pkgName:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r3.mPkgName     // Catch: java.lang.Throwable -> L27
            r0.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = " ; "
            r0.append(r1)     // Catch: java.lang.Throwable -> L27
            int r1 = r3.getVersion()     // Catch: java.lang.Throwable -> L27
            r0.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            com.bytedance.pangle.log.ZeusLogger.w(r11, r0)     // Catch: java.lang.Throwable -> L27
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto La1
            java.lang.String r0 = "loadPluginInternal, sourceApk not exist;"
            r4.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L27
            r0.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "] file not exist !!!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27
            com.bytedance.pangle.log.ZeusLogger.w(r11, r0)     // Catch: java.lang.Throwable -> L27
            return r12
        La1:
            boolean r13 = r15.xt(r6, r3, r4)     // Catch: java.lang.Throwable -> L27
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L122
            java.lang.String r0 = r3.mPkgName     // Catch: java.lang.Throwable -> L122
            int r1 = r3.getVersion()     // Catch: java.lang.Throwable -> L122
            java.lang.String r0 = com.bytedance.pangle.up.cw.r(r0, r1)     // Catch: java.lang.Throwable -> L122
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L122
            java.lang.String r0 = r3.mPkgName     // Catch: java.lang.Throwable -> L122
            int r1 = r3.getVersion()     // Catch: java.lang.Throwable -> L122
            java.io.File r5 = r15.j(r0, r1, r6)     // Catch: java.lang.Throwable -> L122
            r14 = 1
            android.content.pm.PackageInfo[] r2 = new android.content.pm.PackageInfo[r14]     // Catch: java.lang.Throwable -> L12a
            boolean r0 = com.bytedance.pangle.util.g.mi()     // Catch: java.lang.Throwable -> L12a
            if (r0 == 0) goto Lf9
            com.bytedance.pangle.plugin.r$1 r3 = new com.bytedance.pangle.plugin.r$1     // Catch: java.lang.Throwable -> Lf1
            r9 = r4
            r8 = r5
            r4 = r15
            r5 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lf1
            r8 = r3
            com.bytedance.pangle.plugin.r$2 r0 = new com.bytedance.pangle.plugin.r$2     // Catch: java.lang.Throwable -> Lf1
            r1 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lf1
            r1 = r0
            r0 = r2
            r2 = 2
            com.bytedance.pangle.j.j$j[] r2 = new com.bytedance.pangle.j.j.InterfaceC0007j[r2]     // Catch: java.lang.Throwable -> Lf1
            r2[r12] = r8     // Catch: java.lang.Throwable -> Lf1
            r2[r14] = r1     // Catch: java.lang.Throwable -> Lf1
            com.bytedance.pangle.j.j.j(r14, r2)     // Catch: java.lang.Throwable -> Lf1
            r2 = r16
            r3 = r17
            r4 = r18
            goto L11c
        Lf1:
            r0 = move-exception
            r2 = r16
            r3 = r17
            r4 = r18
            goto L12c
        Lf9:
            r1 = r15
            r0 = r2
            r2 = r3
            r3 = r6
            r6 = r4
            r4 = r7
            r1.j(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L124
            r6 = r3
            java.lang.String r1 = "PluginLoader before makeResources"
            com.bytedance.pangle.log.ZeusLogger.w(r11, r1)     // Catch: java.lang.Throwable -> Lf1
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r6
            r6 = r7
            android.content.pm.PackageInfo r5 = r1.j(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L122
            r0[r12] = r5     // Catch: java.lang.Throwable -> L122
            java.lang.String r5 = "PluginLoader after makeResources"
            com.bytedance.pangle.log.ZeusLogger.w(r11, r5)     // Catch: java.lang.Throwable -> L122
        L11c:
            r0 = r0[r12]     // Catch: java.lang.Throwable -> L122
            r15.j(r3, r4, r0)     // Catch: java.lang.Throwable -> L122
            return r14
        L122:
            r0 = move-exception
            goto L12c
        L124:
            r0 = move-exception
            r3 = r2
            r4 = r6
        L127:
            r2 = r16
            goto L12c
        L12a:
            r0 = move-exception
            goto L127
        L12c:
            com.bytedance.pangle.GlobalParam r5 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r5 = r5.getReporter()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "loadPluginInternal stack:"
            r6.<init>(r7)
            java.lang.StackTraceElement[] r7 = r0.getStackTrace()
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "zeus_stage_error"
            r5.saveRecord(r7, r6)
            com.bytedance.pangle.GlobalParam r5 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r5 = r5.getReporter()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "loadLog:"
            r6.<init>(r8)
            java.lang.String r8 = r4.toString()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.saveRecord(r7, r6)
            java.lang.String r5 = "loadPluginInternal "
            r4.append(r5)
            java.lang.String r5 = r0.getMessage()
            r4.append(r5)
            java.lang.String r5 = ";"
            r4.append(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r10)
            r4.append(r2)
            java.lang.String r5 = "] "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r11, r4, r0)
            if (r13 == 0) goto L1b2
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            int r4 = r3.getVersion()
            java.lang.String r5 = "load"
            r0.j(r2, r4, r5)
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            int r3 = r3.getVersion()
            int r0 = r0.xt(r2, r3, r5)
            r3 = 3
            if (r0 <= r3) goto L1b2
            com.bytedance.pangle.Zeus.unInstallPlugin(r2)
        L1b2:
            return r12
    }

    private boolean xt(java.lang.String r12, com.bytedance.pangle.plugin.Plugin r13, java.lang.StringBuilder r14) {
            r11 = this;
            boolean r0 = com.bytedance.pangle.util.g.cw()
            r1 = 0
            if (r0 != 0) goto La3
            boolean r0 = com.bytedance.pangle.util.g.tl()
            if (r0 != 0) goto La3
            boolean r0 = com.bytedance.pangle.util.g.mi()
            if (r0 == 0) goto L15
            goto La3
        L15:
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r2 = r13.mPkgName
            int r3 = r13.getVersion()
            int r0 = r0.g(r2, r3)
            r2 = 1
            r0 = r0 & r2
            if (r0 == 0) goto L9d
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            com.bytedance.pangle.util.jy r3 = com.bytedance.pangle.util.jy.j()
            java.lang.String r4 = r13.mPkgName
            int r5 = r13.getVersion()
            boolean r3 = r3.ae(r4, r5)
            java.lang.String r4 = ";"
            if (r0 == 0) goto L89
            if (r3 == 0) goto L89
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r3 = r13.mPkgName
            int r5 = r13.getVersion()
            boolean r0 = r0.tl(r3, r5)
            if (r0 != 0) goto L83
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = r13.mPkgName
            int r9 = r13.getVersion()
            r10 = 2
            r6 = 1
            r7 = 0
            r5 = r12
            boolean r12 = com.bytedance.pangle.util.xt.xt.j(r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = "removeEntry cost:"
            r14.append(r3)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r14.append(r5)
            r14.append(r4)
            com.bytedance.pangle.util.jy r14 = com.bytedance.pangle.util.jy.j()
            java.lang.String r0 = r13.mPkgName
            int r13 = r13.getVersion()
            r14.r(r0, r13, r2)
            return r12
        L83:
            java.lang.String r12 = "removeEntry skip 3;"
            r14.append(r12)
            return r1
        L89:
            java.lang.String r12 = "removeEntry skip 4 "
            r14.append(r12)
            r14.append(r0)
            java.lang.String r12 = " "
            r14.append(r12)
            r14.append(r3)
            r14.append(r4)
            return r1
        L9d:
            java.lang.String r12 = "removeEntry skip 2;"
            r14.append(r12)
            return r1
        La3:
            java.lang.String r12 = "removeEntry skip 1;"
            r14.append(r12)
            return r1
    }

    boolean j(java.lang.String r15) {
            r14 = this;
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r1 = r0.getPlugin(r15)
            r0 = 0
            if (r1 != 0) goto L1b
            java.lang.String r1 = "Zeus/load_pangle"
            java.lang.String r2 = "PluginLoader loadPlugin, plugin == null, pkg = "
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r15 = r2.concat(r15)
            com.bytedance.pangle.log.ZeusLogger.w(r1, r15)
            return r0
        L1b:
            boolean r2 = r1.isInstalled()
            if (r2 != 0) goto L31
            java.lang.String r1 = "Zeus/load_pangle"
            java.lang.String r2 = "PluginLoader loadPlugin, UN_INSTALLED, "
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r15 = r2.concat(r15)
            com.bytedance.pangle.log.ZeusLogger.w(r1, r15)
            return r0
        L31:
            boolean r2 = r1.isLoading()
            if (r2 == 0) goto L38
            return r0
        L38:
            boolean r2 = r1.isLoaded()
            r3 = 1
            if (r2 == 0) goto L40
            return r3
        L40:
            monitor-enter(r1)
            boolean r2 = r1.isLoaded()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r3
        L49:
            r0 = move-exception
            r15 = r0
            goto L15e
        L4d:
            r2 = 4
            r1.setLifeCycle(r2)     // Catch: java.lang.Throwable -> L49
            com.bytedance.pangle.oq r4 = com.bytedance.pangle.plugin.r.j     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            int r8 = r1.getVersion()     // Catch: java.lang.Throwable -> L49
            r9 = 0
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 0
            r4.j(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "Zeus/load_pangle"
            java.lang.String r5 = "PluginLoader"
            java.lang.String r6 = "loadPlugin:"
            java.lang.String r7 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> L49
            com.bytedance.pangle.log.j r2 = com.bytedance.pangle.log.j.j(r2, r5, r6)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = com.bytedance.pangle.r.xt.tl     // Catch: java.lang.Throwable -> L49
            int r6 = com.bytedance.pangle.r.xt.j.h     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            int r8 = r1.getVersion()     // Catch: java.lang.Throwable -> L49
            r9 = -1
            r11 = 0
            j(r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L49
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L49
            r6 = 8
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r15, r6, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>()     // Catch: java.lang.Throwable -> L49
            boolean r6 = r1.isIsDexPlugin()     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L99
            boolean r6 = com.bytedance.pangle.cw.xt.j(r1, r5)     // Catch: java.lang.Throwable -> L49
            goto L9d
        L99:
            boolean r6 = r14.j(r15, r1, r5)     // Catch: java.lang.Throwable -> L49
        L9d:
            boolean r7 = r1 instanceof com.bytedance.pangle.plugin.j     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto Lad
            boolean r7 = r1.isIsDexPlugin()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto Lad
            r7 = r1
            com.bytedance.pangle.plugin.j r7 = (com.bytedance.pangle.plugin.j) r7     // Catch: java.lang.Throwable -> L49
            r7.j()     // Catch: java.lang.Throwable -> L49
        Lad:
            java.lang.String r7 = "loadPluginInternal:"
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.Throwable -> L49
            r2.j(r7)     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto Lea
            r6 = 3
            r1.setLifeCycle(r6)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = com.bytedance.pangle.r.xt.g     // Catch: java.lang.Throwable -> L49
            int r8 = com.bytedance.pangle.r.xt.j.la     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            int r10 = r1.getVersion()     // Catch: java.lang.Throwable -> L49
            long r11 = r2.j()     // Catch: java.lang.Throwable -> L49
            java.lang.String r13 = r5.toString()     // Catch: java.lang.Throwable -> L49
            j(r7, r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L49
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L49
            r5 = 9
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r15, r5, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            int r8 = r1.getVersion()     // Catch: java.lang.Throwable -> L49
            r9 = 0
            r5 = 2100(0x834, float:2.943E-42)
            r6 = 0
            r4.j(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49
            goto L130
        Lea:
            r2 = 2
            r1.setLifeCycle(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "plugin:"
            r5.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            r5.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = " versionCode:"
            r5.append(r2)     // Catch: java.lang.Throwable -> L49
            int r2 = r1.getVersion()     // Catch: java.lang.Throwable -> L49
            r5.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "load failed;"
            r5.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = com.bytedance.pangle.r.xt.g     // Catch: java.lang.Throwable -> L49
            int r7 = com.bytedance.pangle.r.xt.j.gq     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            int r9 = r1.getVersion()     // Catch: java.lang.Throwable -> L49
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> L49
            r10 = -1
            j(r6, r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L49
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L49
            r5 = 10
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r15, r5, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            int r8 = r1.getVersion()     // Catch: java.lang.Throwable -> L49
            r9 = 0
            r5 = 2100(0x834, float:2.943E-42)
            r6 = -1
            r4.j(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49
        L130:
            java.lang.String r15 = "Zeus/load_pangle"
            java.lang.String r2 = "PluginLoader loadFinished, "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r2.concat(r4)     // Catch: java.lang.Throwable -> L49
            com.bytedance.pangle.log.ZeusLogger.i(r15, r2)     // Catch: java.lang.Throwable -> L49
            boolean r15 = r1.isLoaded()     // Catch: java.lang.Throwable -> L49
            if (r15 == 0) goto L15c
            java.lang.String r15 = "Zeus/load_pangle"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "PluginLoader postResult, LOADED "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r1.mPkgName     // Catch: java.lang.Throwable -> L49
            r0.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L49
            com.bytedance.pangle.log.ZeusLogger.d(r15, r0)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r3
        L15c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return r0
        L15e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r15
    }
}
