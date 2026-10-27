package com.bytedance.pangle.activity;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.Class j() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Class[] r0 = r0.getDeclaredClasses()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L9:
            if (r3 >= r1) goto L1d
            r4 = r0[r3]
            java.lang.String r5 = r4.getSimpleName()
            java.lang.String r6 = "TranslucentConversionListener"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L1a
            r2 = r4
        L1a:
            int r3 = r3 + 1
            goto L9
        L1d:
            return r2
    }

    private static void j(android.app.Activity r9) {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "getActivityOptions"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r1 = com.bytedance.pangle.util.MethodUtils.getAccessibleMethod(r0, r1, r3)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            java.lang.Object r1 = r1.invoke(r9, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "convertToTranslucent"
            java.lang.Class r5 = j()     // Catch: java.lang.Throwable -> L2d
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L2d
            r7[r2] = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Class<android.app.ActivityOptions> r5 = android.app.ActivityOptions.class
            r8 = 1
            r7[r8] = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r0 = com.bytedance.pangle.util.MethodUtils.getAccessibleMethod(r0, r4, r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L2d
            r4[r2] = r3     // Catch: java.lang.Throwable -> L2d
            r4[r8] = r1     // Catch: java.lang.Throwable -> L2d
            r0.invoke(r9, r4)     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    static void j(android.app.Activity r4, android.view.View r5) {
            if (r5 != 0) goto L4
            goto L76
        L4:
            java.lang.String r0 = "mListenerInfo"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r5, r0)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L5e
            java.lang.String r1 = "mOnClickListener"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r0, r1)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L5e
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L35
            java.lang.Class<androidx.appcompat.app.AppCompatViewInflater> r2 = androidx.appcompat.app.AppCompatViewInflater.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L35
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Exception -> L35
            if (r2 != 0) goto L37
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L35
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L5e
            goto L37
        L35:
            r0 = move-exception
            goto L4c
        L37:
            com.bytedance.pangle.activity.j r1 = new com.bytedance.pangle.activity.j     // Catch: java.lang.Exception -> L35
            int r2 = r5.getId()     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = "mMethodName"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r0, r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L35
            r1.<init>(r4, r2, r0)     // Catch: java.lang.Exception -> L35
            r5.setOnClickListener(r1)     // Catch: java.lang.Exception -> L35
            goto L5e
        L4c:
            java.lang.String r1 = "checkOnClickListener failed!"
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "Zeus/activity_pangle"
            com.bytedance.pangle.log.ZeusLogger.errReport(r2, r1)
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        L5e:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L76
            r0 = 0
        L63:
            r1 = r5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L76
            android.view.View r1 = r1.getChildAt(r0)
            j(r4, r1)
            int r0 = r0 + 1
            goto L63
        L76:
            return
    }

    static void j(com.bytedance.pangle.activity.xt r3, android.content.Context r4) {
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            if (r0 != 0) goto L11
            java.lang.String r0 = "Zeus/init_pangle"
            java.lang.String r1 = "ProxyActivityUtils.attachBaseContext. AppApplication == null."
            com.bytedance.sdk.openadsdk.api.m.up(r0, r1)
            r3.zeusSuperAttachBaseContext(r4)
            return
        L11:
            java.lang.String r0 = r3.getPluginPkgName()
            com.bytedance.pangle.plugin.PluginManager r1 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            boolean r1 = r1.loadPlugin(r0)
            com.bytedance.pangle.plugin.PluginManager r2 = com.bytedance.pangle.plugin.PluginManager.getInstance()     // Catch: java.lang.Exception -> L3c
            com.bytedance.pangle.plugin.Plugin r2 = r2.getPlugin(r0)     // Catch: java.lang.Exception -> L3c
            r3.setPlugin(r2)     // Catch: java.lang.Exception -> L3c
            if (r1 == 0) goto L38
            android.content.Context r4 = com.bytedance.pangle.transform.ZeusTransformUtils.wrapperContext(r4, r0)     // Catch: java.lang.Exception -> L3c
            r3.zeusSuperAttachBaseContext(r4)     // Catch: java.lang.Exception -> L3c
            java.lang.String r4 = "mResources"
            r0 = 0
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r4, r0)     // Catch: java.lang.Exception -> L3c
            return
        L38:
            r3.zeusSuperAttachBaseContext(r4)     // Catch: java.lang.Exception -> L3c
            return
        L3c:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    static void j(com.bytedance.pangle.activity.xt r10, android.os.Bundle r11) {
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            java.lang.String r1 = "Zeus/init_pangle"
            r2 = 0
            if (r0 != 0) goto L15
            java.lang.String r11 = "ProxyActivityUtils.onCreate finish. AppApplication == null."
            com.bytedance.sdk.openadsdk.api.m.up(r1, r11)
            r10.zeusSuperOnCreate(r2)
            r10.finish()
            return
        L15:
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r3 = r10.getPluginPkgName()
            com.bytedance.pangle.plugin.Plugin r4 = r10.getPlugin()
            if (r4 != 0) goto L2f
            java.lang.String r11 = "ProxyActivityUtils.onCreate finish. plugin == null"
            com.bytedance.sdk.openadsdk.api.m.up(r1, r11)
            r10.zeusSuperOnCreate(r2)
            r10.finish()
            return
        L2f:
            com.bytedance.pangle.PluginClassLoader r1 = r4.mClassLoader
            r0.setExtrasClassLoader(r1)
            com.bytedance.pangle.activity.IntentUtils.j(r0)
            java.lang.String r1 = "targetPlugin"
            java.lang.String r5 = r0.getStringExtra(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r7 = 0
            if (r6 == 0) goto L66
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r6 = com.bytedance.pangle.ComponentManager.stubActivity2TargetActivities
            java.lang.Class r8 = r10.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.Object r6 = r6.get(r8)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L66
            int r8 = r6.size()
            r9 = 1
            if (r8 != r9) goto L66
            java.lang.Object r5 = r6.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            r0.putExtra(r1, r5)
        L66:
            boolean r0 = r4.isLoaded()
            java.lang.String r1 = "Zeus/activity_pangle"
            if (r0 == 0) goto L117
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L76
            goto L117
        L76:
            java.util.HashMap<java.lang.String, android.content.pm.ActivityInfo> r0 = r4.pluginActivities
            java.lang.Object r0 = r0.get(r5)
            android.content.pm.ActivityInfo r0 = (android.content.pm.ActivityInfo) r0
            if (r0 != 0) goto L9c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Have you declared "
            r3.<init>(r6)
            r3.append(r5)
            java.lang.String r6 = " in plugin's AndroidManifest.xml!"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r1, r3)
            r10.zeusSuperOnCreate(r2)
            r10.finish()
        L9c:
            r1 = -1
            com.bytedance.pangle.PluginClassLoader r2 = r4.mClassLoader     // Catch: java.lang.Exception -> Le0
            java.lang.Class r2 = r2.loadClass(r5)     // Catch: java.lang.Exception -> Le0
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> Le0
            com.bytedance.pangle.activity.IPluginActivity r2 = (com.bytedance.pangle.activity.IPluginActivity) r2     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "mApplication"
            android.app.Application r5 = r10.getApplication()     // Catch: java.lang.Exception -> Le0
            com.bytedance.pangle.util.FieldUtils.writeField(r2, r3, r5)     // Catch: java.lang.Exception -> Le0
            r10.setTargetActivity(r2)     // Catch: java.lang.Exception -> Le0
            r2.setPluginProxyActivity(r10, r4)     // Catch: java.lang.Exception -> Le0
            int r1 = r0.theme     // Catch: java.lang.Exception -> Le0
            r10.zeusSuperSetTheme(r1)     // Catch: java.lang.Exception -> Le0
            r3 = r10
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Exception -> Le0
            android.content.res.Resources$Theme r3 = r3.getTheme()     // Catch: java.lang.Exception -> Le0
            r4 = 16842840(0x1010058, float:2.3693805E-38)
            int[] r4 = new int[]{r4}     // Catch: java.lang.Exception -> Le0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)     // Catch: java.lang.Exception -> Le0
            int r4 = r3.getIndex(r7)     // Catch: java.lang.Exception -> Le0
            boolean r4 = r3.getBoolean(r4, r7)     // Catch: java.lang.Exception -> Le0
            if (r4 == 0) goto Le2
            r4 = r10
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Exception -> Le0
            j(r4)     // Catch: java.lang.Exception -> Le0
            goto Le2
        Le0:
            r10 = move-exception
            goto L100
        Le2:
            r3.recycle()     // Catch: java.lang.Exception -> Le0
            android.content.Context r3 = r10.getBaseContext()     // Catch: java.lang.Exception -> Le0
            r2.attachBaseContext(r3)     // Catch: java.lang.Exception -> Le0
            r3 = r10
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Exception -> Le0 java.lang.IllegalStateException -> Lfc
            int r3 = r3.getRequestedOrientation()     // Catch: java.lang.Exception -> Le0 java.lang.IllegalStateException -> Lfc
            int r0 = r0.screenOrientation     // Catch: java.lang.Exception -> Le0 java.lang.IllegalStateException -> Lfc
            if (r3 == r0) goto Lfc
            android.app.Activity r10 = (android.app.Activity) r10     // Catch: java.lang.Exception -> Le0 java.lang.IllegalStateException -> Lfc
            r10.setRequestedOrientation(r0)     // Catch: java.lang.Exception -> Le0 java.lang.IllegalStateException -> Lfc
        Lfc:
            r2.onCreate(r11)     // Catch: java.lang.Exception -> Le0
            return
        L100:
            boolean r11 = r10 instanceof java.lang.IllegalStateException
            if (r11 == 0) goto L10f
            java.lang.String r11 = "activityTheme:"
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r11 = r11.concat(r0)
            goto L111
        L10f:
            java.lang.String r11 = ""
        L111:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r11, r10)
            throw r0
        L117:
            r10.zeusSuperOnCreate(r2)     // Catch: java.lang.Exception -> L137
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L137
            java.lang.String r0 = "Cant start pluginActivity, plugin load failed! pluginPkgName: "
            r11.<init>(r0)     // Catch: java.lang.Exception -> L137
            r11.append(r3)     // Catch: java.lang.Exception -> L137
            java.lang.String r0 = " targetActivity: "
            r11.append(r0)     // Catch: java.lang.Exception -> L137
            r11.append(r5)     // Catch: java.lang.Exception -> L137
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L137
            com.bytedance.pangle.log.ZeusLogger.w(r1, r11)     // Catch: java.lang.Exception -> L137
            r10.finish()     // Catch: java.lang.Exception -> L137
            return
        L137:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
    }
}
