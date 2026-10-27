package com.bytedance.pangle.transform;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ZeusTransformUtils {
    private static final java.lang.String TAG = "PluginContextUtils";
    static java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> contextCache;
    public static java.lang.Class fragmentClazz;
    static boolean hasEnsure;
    private static boolean sCanThrowException;
    static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<android.view.View>> sConstructorMap;
    private static boolean sSupportFragmentWrapper;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.transform.ZeusTransformUtils.contextCache = r0
            r0 = 0
            com.bytedance.pangle.transform.ZeusTransformUtils.hasEnsure = r0
            r0 = 0
            com.bytedance.pangle.transform.ZeusTransformUtils.sConstructorMap = r0
            return
    }

    public ZeusTransformUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.app.Activity _getActivity(java.lang.Object r2, java.lang.String r3) {
            java.lang.String r0 = "getActivity"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            android.content.Context r0 = wrapperContext(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            boolean r1 = r0 instanceof com.bytedance.pangle.activity.GenerateProxyActivity     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            if (r1 == 0) goto L1a
            com.bytedance.pangle.activity.GenerateProxyActivity r0 = (com.bytedance.pangle.activity.GenerateProxyActivity) r0     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            com.bytedance.pangle.activity.GeneratePluginActivity r2 = r0.mTargetActivity     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            return r2
        L1a:
            isSupportLibIso(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            android.content.Context r2 = wrapperContext(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2e
            return r2
        L24:
            r2 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r2)
            goto L32
        L29:
            r2 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r2)
            goto L32
        L2e:
            r2 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r2)
        L32:
            r2 = 0
            return r2
    }

    public static boolean bindService(java.lang.Object r7, android.content.Intent r8, android.content.ServiceConnection r9, int r10, java.lang.String r11) {
            boolean r0 = r7 instanceof android.content.Context
            if (r0 == 0) goto L14
            com.bytedance.pangle.service.client.ServiceManagerNative r1 = com.bytedance.pangle.service.client.ServiceManagerNative.getInstance()
            r2 = r7
            android.content.Context r2 = (android.content.Context) r2
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            boolean r7 = r1.bindServiceNative(r2, r3, r4, r5, r6)
            return r7
        L14:
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.String r8 = "bindService"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L42
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L42
            r0 = 0
            r11[r0] = r3     // Catch: java.lang.Exception -> L42
            r1 = 1
            r11[r1] = r4     // Catch: java.lang.Exception -> L42
            r2 = 2
            r11[r2] = r9     // Catch: java.lang.Exception -> L42
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L42
            java.lang.Class<android.content.Intent> r10 = android.content.Intent.class
            r9[r0] = r10     // Catch: java.lang.Exception -> L42
            java.lang.Class<android.content.ServiceConnection> r10 = android.content.ServiceConnection.class
            r9[r1] = r10     // Catch: java.lang.Exception -> L42
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L42
            r9[r2] = r10     // Catch: java.lang.Exception -> L42
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r8, r11, r9)     // Catch: java.lang.Exception -> L42
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L42
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L42
            return r7
        L42:
            r0 = move-exception
            r7 = r0
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }

    public static void canThrowException(boolean r0) {
            com.bytedance.pangle.transform.ZeusTransformUtils.sCanThrowException = r0
            return
    }

    public static void clearConstructorCache() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 > r1) goto L57
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<android.view.View>> r0 = com.bytedance.pangle.transform.ZeusTransformUtils.sConstructorMap     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L16
            java.lang.Class<android.view.LayoutInflater> r0 = android.view.LayoutInflater.class
            java.lang.String r1 = "sConstructorMap"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readStaticField(r0, r1)     // Catch: java.lang.Throwable -> L57
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L57
            com.bytedance.pangle.transform.ZeusTransformUtils.sConstructorMap = r0     // Catch: java.lang.Throwable -> L57
        L16:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L57
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<android.view.View>> r1 = com.bytedance.pangle.transform.ZeusTransformUtils.sConstructorMap     // Catch: java.lang.Throwable -> L57
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L57
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L57
        L25:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "android.view."
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L25
            java.lang.String r2 = "android.widget."
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L25
            java.lang.String r2 = "android.webkit."
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L25
            java.lang.String r2 = "."
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L25
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<android.view.View>> r2 = com.bytedance.pangle.transform.ZeusTransformUtils.sConstructorMap     // Catch: java.lang.Throwable -> L57
            r2.remove(r1)     // Catch: java.lang.Throwable -> L57
            goto L25
        L57:
            return
    }

    private static android.content.Context convertProxy2PluginActivity(android.content.Context r3) {
            boolean r0 = r3 instanceof com.bytedance.pangle.activity.GenerateProxyActivity     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            java.lang.String r0 = "mTargetActivity"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r3, r0)     // Catch: java.lang.Throwable -> Ld
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            goto L10
        Lf:
            return r3
        L10:
            java.lang.String r1 = "Zeus/load_pangle"
            java.lang.String r2 = "convertProxy2PluginActivity failed."
            com.bytedance.pangle.log.ZeusLogger.w(r1, r2, r0)
            return r3
    }

    private static void ensureFragmentActivity() {
            java.lang.String r0 = "androidx.fragment.app.FragmentActivity"
            java.lang.Class<com.bytedance.pangle.Zeus> r1 = com.bytedance.pangle.Zeus.class
            boolean r2 = com.bytedance.pangle.transform.ZeusTransformUtils.hasEnsure
            if (r2 == 0) goto L9
            return
        L9:
            java.lang.ClassLoader r2 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L14
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.Throwable -> L14
            com.bytedance.pangle.transform.ZeusTransformUtils.fragmentClazz = r2     // Catch: java.lang.Throwable -> L14
            goto L1e
        L14:
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Throwable -> L1e
            com.bytedance.pangle.transform.ZeusTransformUtils.fragmentClazz = r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = 1
            com.bytedance.pangle.transform.ZeusTransformUtils.hasEnsure = r0
            return
    }

    private static boolean equalsFragmentActivity(java.lang.Class r2) {
            ensureFragmentActivity()
            java.lang.Class r0 = com.bytedance.pangle.transform.ZeusTransformUtils.fragmentClazz
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            if (r2 != r0) goto Ld
            r2 = 1
            return r2
        Ld:
            return r1
    }

    public static java.lang.Class forName(java.lang.String r0, java.lang.String r1) throws java.lang.ClassNotFoundException {
            com.bytedance.pangle.plugin.Plugin r1 = com.bytedance.pangle.Zeus.getPlugin(r1)
            com.bytedance.pangle.PluginClassLoader r1 = r1.mClassLoader
            java.lang.Class r0 = r1.loadClass(r0)
            return r0
    }

    public static android.app.Activity getActivity(java.lang.Object r0, java.lang.String r1) {
            android.app.Activity r0 = _getActivity(r0, r1)
            return r0
    }

    public static java.lang.String getAssetPaths(android.content.res.AssetManager r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r7 != 0) goto La
            java.lang.String r7 = ""
            return r7
        La:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1c
            r2 = 28
            r3 = 0
            if (r1 >= r2) goto L4e
            r2 = 27
            if (r1 != r2) goto L1e
            int r1 = com.bytedance.pangle.transform.c.a()     // Catch: java.lang.Throwable -> L1c
            if (r1 <= 0) goto L1e
            goto L4e
        L1c:
            r7 = move-exception
            goto L73
        L1e:
            java.lang.String r1 = "getStringBlockCount"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L1c
            r2 = 0
        L2d:
            if (r2 >= r1) goto L7a
            java.lang.String r4 = "getCookieName"
            int r5 = r2 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1c java.lang.IndexOutOfBoundsException -> L4b
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1c java.lang.IndexOutOfBoundsException -> L4b
            r6[r3] = r5     // Catch: java.lang.Throwable -> L1c java.lang.IndexOutOfBoundsException -> L4b
            java.lang.Object r4 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r4, r6)     // Catch: java.lang.Throwable -> L1c java.lang.IndexOutOfBoundsException -> L4b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1c java.lang.IndexOutOfBoundsException -> L4b
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1c java.lang.IndexOutOfBoundsException -> L4b
            if (r5 != 0) goto L4b
            r0.append(r4)     // Catch: java.lang.Throwable -> L1c java.lang.IndexOutOfBoundsException -> L4b
        L4b:
            int r2 = r2 + 1
            goto L2d
        L4e:
            java.lang.String r1 = "getApkAssets"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch: java.lang.Throwable -> L1c
            if (r7 == 0) goto L7a
            int r1 = r7.length     // Catch: java.lang.Throwable -> L1c
            if (r1 <= 0) goto L7a
            int r1 = r7.length     // Catch: java.lang.Throwable -> L1c
            r2 = 0
        L5f:
            if (r2 >= r1) goto L7a
            r4 = r7[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "getAssetPath"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1c
            r0.append(r4)     // Catch: java.lang.Throwable -> L1c
            int r2 = r2 + 1
            goto L5f
        L73:
            java.lang.String r1 = "Zeus/resources_pangle"
            java.lang.String r2 = "TransformUtils GetAssetsPaths error. "
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r7)
        L7a:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public static android.content.Context getContext(java.lang.Object r2, java.lang.String r3) {
            java.lang.String r0 = "getContext"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r0, r1)     // Catch: java.lang.Exception -> L38
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Exception -> L38
            boolean r0 = isSupportLibIso(r3)
            if (r0 != 0) goto L1c
            boolean r0 = instanceOfFragmentActivity(r2)
            if (r0 == 0) goto L1c
            android.content.Context r2 = wrapperContext(r2, r3)
            return r2
        L1c:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L25
            android.content.Context r2 = wrapperContext(r2, r3)
            return r2
        L25:
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L2e
            android.content.Context r2 = wrapperContext(r2, r3)
            return r2
        L2e:
            boolean r0 = r2 instanceof com.bytedance.pangle.PluginContext
            if (r0 == 0) goto L33
            return r2
        L33:
            android.content.Context r2 = wrapperContext(r2, r3)
            return r2
        L38:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    private static android.content.Context getContextIfNeedWrap(android.content.Context r3, android.content.Context r4, java.lang.String r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.bytedance.pangle.activity.IPluginActivity
            if (r1 == 0) goto L17
            com.bytedance.pangle.activity.IPluginActivity r4 = (com.bytedance.pangle.activity.IPluginActivity) r4
            java.lang.String r4 = r4.getPluginPkgName()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L16
            goto Lbc
        L16:
            return r0
        L17:
            boolean r1 = r4 instanceof com.bytedance.pangle.PluginContext
            if (r1 == 0) goto L2b
            com.bytedance.pangle.PluginContext r4 = (com.bytedance.pangle.PluginContext) r4
            com.bytedance.pangle.plugin.Plugin r3 = r4.mPlugin
            java.lang.String r3 = r3.mPkgName
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L28
            return r0
        L28:
            android.content.Context r3 = r4.mOriginContext
            return r3
        L2b:
            boolean r1 = r4 instanceof com.bytedance.pangle.wrapper.PluginActivityWrapper
            if (r1 == 0) goto L41
            com.bytedance.pangle.wrapper.PluginActivityWrapper r4 = (com.bytedance.pangle.wrapper.PluginActivityWrapper) r4
            com.bytedance.pangle.PluginContext r3 = r4.pluginContext
            com.bytedance.pangle.plugin.Plugin r3 = r3.mPlugin
            java.lang.String r3 = r3.mPkgName
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L3e
            return r0
        L3e:
            android.app.Activity r3 = r4.mOriginActivity
            return r3
        L41:
            isSupportLibIso(r5)
            boolean r1 = r4 instanceof com.bytedance.pangle.wrapper.PluginApplicationWrapper
            if (r1 == 0) goto L5a
            com.bytedance.pangle.wrapper.PluginApplicationWrapper r4 = (com.bytedance.pangle.wrapper.PluginApplicationWrapper) r4
            com.bytedance.pangle.PluginContext r3 = r4.mPluginContext
            com.bytedance.pangle.plugin.Plugin r3 = r3.mPlugin
            java.lang.String r3 = r3.mPkgName
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L57
            return r0
        L57:
            android.app.Application r3 = r4.mOriginApplication
            return r3
        L5a:
            android.content.res.Resources r1 = r4.getResources()
            boolean r1 = r1 instanceof com.bytedance.pangle.res.PluginResources
            if (r1 == 0) goto La5
            android.content.res.Resources r4 = r4.getResources()
            com.bytedance.pangle.res.PluginResources r4 = (com.bytedance.pangle.res.PluginResources) r4
            java.lang.String r1 = "pluginPkg"
            java.lang.Object r1 = com.bytedance.pangle.util.FieldUtils.readField(r4, r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L98
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L9a
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = getAssetPaths(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "/"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L98
            r1.append(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = "/version"
            r1.append(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L98
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto La4
            goto Lbc
        L98:
            r3 = move-exception
            goto La1
        L9a:
            boolean r4 = android.text.TextUtils.equals(r1, r5)     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto La4
            goto Lbc
        La1:
            com.bytedance.sdk.openadsdk.api.m.j(r3)
        La4:
            return r0
        La5:
            boolean r0 = r4 instanceof android.content.ContextWrapper
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "mBase"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r4, r0)     // Catch: java.lang.Throwable -> Lb2
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> Lb2
            goto Lb8
        Lb2:
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r0 = r4.getBaseContext()
        Lb8:
            android.content.Context r3 = getContextIfNeedWrap(r3, r0, r5)
        Lbc:
            return r3
    }

    public static int getIdentifier(java.lang.Object r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = r2 instanceof android.content.res.Resources
            if (r0 == 0) goto L15
            android.content.res.Resources r2 = (android.content.res.Resources) r2
            java.lang.String r0 = "android"
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r5 = r6
        L10:
            int r2 = r2.getIdentifier(r3, r4, r5)
            return r2
        L15:
            java.lang.String r6 = "getIdentifier"
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2e
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L2e
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L2e
            r3 = 2
            r0[r3] = r5     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r6, r0)     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L2e
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L2e
            return r2
        L2e:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.res.Resources getResources(java.lang.Object r3, java.lang.String r4) {
            java.lang.String r0 = "getResources"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L55
            java.lang.Object r3 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r0, r1)     // Catch: java.lang.Exception -> L55
            android.content.res.Resources r3 = (android.content.res.Resources) r3     // Catch: java.lang.Exception -> L55
            if (r3 != 0) goto Lf
            r3 = 0
            return r3
        Lf:
            boolean r0 = r3 instanceof com.bytedance.pangle.res.PluginResources     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L4a
            java.lang.String r0 = "pluginPkg"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r3, r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L55
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L55
            if (r1 == 0) goto L43
            android.content.res.AssetManager r0 = r3.getAssets()     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = getAssetPaths(r0)     // Catch: java.lang.Exception -> L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = "/"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L55
            r1.append(r4)     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = "/version"
            r1.append(r2)     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L55
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L4a
            goto L49
        L43:
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L4a
        L49:
            return r3
        L4a:
            com.bytedance.pangle.plugin.PluginManager r3 = com.bytedance.pangle.plugin.PluginManager.getInstance()     // Catch: java.lang.Exception -> L55
            com.bytedance.pangle.plugin.Plugin r3 = r3.getPlugin(r4)     // Catch: java.lang.Exception -> L55
            android.content.res.Resources r3 = r3.mResources     // Catch: java.lang.Exception -> L55
            return r3
        L55:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static android.net.Uri getUriForFile(android.content.Context r0, java.lang.String r1, java.io.File r2, java.lang.String r3) {
            android.net.Uri r0 = com.bytedance.pangle.FileProvider.getUriForFile(r2)     // Catch: java.lang.NoClassDefFoundError -> L5
            return r0
        L5:
            java.lang.String r0 = ""
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    public static android.view.Window getWindow(android.app.Activity r1, java.lang.String r2) {
            android.view.Window r2 = r1.getWindow()
            if (r2 != 0) goto L19
            java.lang.String r2 = "getWindow"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r1, r2, r0)     // Catch: java.lang.Throwable -> L12
            android.view.Window r1 = (android.view.Window) r1     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L19:
            return r2
    }

    private static android.content.Context getWrapperFromCache(java.lang.Object r2, java.lang.String r3) {
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> r0 = com.bytedance.pangle.transform.ZeusTransformUtils.contextCache
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            int r2 = java.lang.System.identityHashCode(r2)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L24
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            return r2
        L24:
            r2 = 0
            return r2
    }

    private static void handleAttrAfter(android.content.res.TypedArray r5, int[] r6, int[] r7) {
            boolean r0 = java.util.Arrays.equals(r6, r7)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            r2 = 0
        Le:
            int r3 = r6.length
            if (r2 >= r3) goto L21
            r3 = r6[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r4)
            int r2 = r2 + 1
            goto Le
        L21:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r2 = 0
        L27:
            int r3 = r7.length
            if (r2 >= r3) goto L40
            r3 = r7[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6.put(r3, r4)
            int r2 = r2 + 1
            goto L27
        L40:
            java.lang.String r7 = "mData"
            java.lang.Object r5 = com.bytedance.pangle.util.FieldUtils.readField(r5, r7)     // Catch: java.lang.IllegalAccessException -> L83
            int[] r5 = (int[]) r5     // Catch: java.lang.IllegalAccessException -> L83
            int r7 = r5.length     // Catch: java.lang.IllegalAccessException -> L83
            int[] r7 = java.util.Arrays.copyOf(r5, r7)     // Catch: java.lang.IllegalAccessException -> L83
            java.util.Set r0 = r6.keySet()     // Catch: java.lang.IllegalAccessException -> L83
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L83
        L55:
            boolean r2 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L83
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r0.next()     // Catch: java.lang.IllegalAccessException -> L83
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.IllegalAccessException -> L83
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.IllegalAccessException -> L83
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.IllegalAccessException -> L83
            boolean r4 = r2.equals(r3)     // Catch: java.lang.IllegalAccessException -> L83
            if (r4 != 0) goto L55
            int r2 = r2.intValue()     // Catch: java.lang.IllegalAccessException -> L83
            r4 = 7
            int r2 = r2 * 7
            int r3 = r3.intValue()     // Catch: java.lang.IllegalAccessException -> L83
            int r3 = r3 * 7
            java.lang.System.arraycopy(r5, r2, r7, r3, r4)     // Catch: java.lang.IllegalAccessException -> L83
            goto L55
        L7e:
            int r6 = r5.length     // Catch: java.lang.IllegalAccessException -> L83
            java.lang.System.arraycopy(r7, r1, r5, r1, r6)     // Catch: java.lang.IllegalAccessException -> L83
            return
        L83:
            java.lang.String r5 = "Zeus/resources_pangle"
            java.lang.String r6 = "read mData failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r5, r6)
            return
    }

    private static int[] handleAttrBefore(int[] r1) {
            int r0 = r1.length
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.util.Arrays.sort(r1)
            return r1
    }

    public static android.view.View inflate(android.content.Context r1, int r2, android.view.ViewGroup r3, java.lang.String r4) {
            boolean r0 = r1 instanceof com.bytedance.pangle.PluginContext
            if (r0 != 0) goto L13
            boolean r0 = r1 instanceof com.bytedance.pangle.wrapper.PluginActivityWrapper
            if (r0 != 0) goto L13
            isSupportLibIso(r4)
            boolean r0 = r1 instanceof com.bytedance.pangle.wrapper.PluginApplicationWrapper
            if (r0 != 0) goto L13
            android.content.Context r1 = wrapperContext(r1, r4)
        L13:
            java.lang.String r4 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r4)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            clearConstructorCache()
            android.view.View r1 = r1.inflate(r2, r3)
            clearConstructorCache()
            return r1
    }

    public static android.view.View inflate(android.view.LayoutInflater r1, int r2, android.view.ViewGroup r3, java.lang.String r4) {
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            android.view.View r1 = inflate(r1, r2, r3, r0, r4)
            return r1
    }

    public static android.view.View inflate(android.view.LayoutInflater r3, int r4, android.view.ViewGroup r5, boolean r6, java.lang.String r7) {
            android.content.Context r0 = r3.getContext()
            boolean r1 = r0 instanceof com.bytedance.pangle.PluginContext
            if (r1 != 0) goto L4a
            boolean r1 = r0 instanceof com.bytedance.pangle.wrapper.PluginActivityWrapper
            if (r1 != 0) goto L4a
            isSupportLibIso(r7)
            boolean r1 = r0 instanceof com.bytedance.pangle.wrapper.PluginApplicationWrapper
            if (r1 != 0) goto L4a
            android.content.Context r0 = wrapperContext(r0, r7)
            android.view.LayoutInflater$Factory r1 = r3.getFactory()
            android.view.LayoutInflater$Factory2 r3 = r3.getFactory2()
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            boolean r7 = isSupportLibIso(r7)
            if (r7 == 0) goto L49
            java.lang.String r7 = "Zeus/resources_pangle"
            if (r1 == 0) goto L3c
            java.lang.String r2 = "mFactory"
            com.bytedance.pangle.util.FieldUtils.writeField(r0, r2, r1)     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            java.lang.String r1 = "set Factory failed."
            com.bytedance.pangle.log.ZeusLogger.w(r7, r1)
        L3c:
            if (r3 == 0) goto L49
            java.lang.String r1 = "mFactory2"
            com.bytedance.pangle.util.FieldUtils.writeField(r0, r1, r3)     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            java.lang.String r3 = "set Factory2 failed."
            com.bytedance.pangle.log.ZeusLogger.w(r7, r3)
        L49:
            r3 = r0
        L4a:
            clearConstructorCache()
            android.view.View r3 = r3.inflate(r4, r5, r6)
            clearConstructorCache()
            return r3
    }

    public static android.view.View inflate(android.view.LayoutInflater r1, org.xmlpull.v1.XmlPullParser r2, android.view.ViewGroup r3, java.lang.String r4) {
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            android.view.View r1 = inflate(r1, r2, r3, r0, r4)
            return r1
    }

    public static android.view.View inflate(android.view.LayoutInflater r1, org.xmlpull.v1.XmlPullParser r2, android.view.ViewGroup r3, boolean r4, java.lang.String r5) {
            android.content.Context r1 = r1.getContext()
            boolean r0 = r1 instanceof com.bytedance.pangle.PluginContext
            if (r0 != 0) goto L17
            boolean r0 = r1 instanceof com.bytedance.pangle.wrapper.PluginActivityWrapper
            if (r0 != 0) goto L17
            isSupportLibIso(r5)
            boolean r0 = r1 instanceof com.bytedance.pangle.wrapper.PluginApplicationWrapper
            if (r0 != 0) goto L17
            android.content.Context r1 = wrapperContext(r1, r5)
        L17:
            java.lang.String r5 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            clearConstructorCache()
            android.view.View r1 = r1.inflate(r2, r3, r4)
            clearConstructorCache()
            return r1
    }

    public static boolean instanceOf(java.lang.Class r0, java.lang.Object r1) {
            boolean r0 = instanceOf(r1, r0)
            return r0
    }

    public static boolean instanceOf(java.lang.Object r1, java.lang.Class r2) {
            boolean r0 = r1 instanceof com.bytedance.pangle.PluginContext
            if (r0 == 0) goto Ld
            com.bytedance.pangle.PluginContext r1 = (com.bytedance.pangle.PluginContext) r1
            android.content.Context r1 = r1.mOriginContext
            boolean r1 = r2.isInstance(r1)
            return r1
        Ld:
            boolean r0 = r1 instanceof com.bytedance.pangle.wrapper.PluginActivityWrapper
            if (r0 == 0) goto L1a
            com.bytedance.pangle.wrapper.PluginActivityWrapper r1 = (com.bytedance.pangle.wrapper.PluginActivityWrapper) r1
            android.app.Activity r1 = r1.mOriginActivity
            boolean r1 = r2.isInstance(r1)
            return r1
        L1a:
            boolean r0 = r1 instanceof com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper
            if (r0 == 0) goto L38
            r0 = r1
            com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper r0 = (com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper) r0     // Catch: java.lang.Throwable -> L26
            android.app.Activity r1 = r0.getOriginActivity()     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            java.lang.String r0 = "mOriginActivity"
            java.lang.Object r1 = com.bytedance.pangle.util.FieldUtils.readField(r1, r0)     // Catch: java.lang.Throwable -> L31
        L2c:
            boolean r1 = r2.isInstance(r1)
            return r1
        L31:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L38:
            boolean r0 = r1 instanceof com.bytedance.pangle.wrapper.PluginApplicationWrapper
            if (r0 == 0) goto L45
            com.bytedance.pangle.wrapper.PluginApplicationWrapper r1 = (com.bytedance.pangle.wrapper.PluginApplicationWrapper) r1
            android.app.Application r1 = r1.mOriginApplication
            boolean r1 = r2.isInstance(r1)
            return r1
        L45:
            boolean r0 = r1 instanceof com.bytedance.pangle.activity.GenerateProxyActivity
            if (r0 == 0) goto L52
            com.bytedance.pangle.activity.GenerateProxyActivity r1 = (com.bytedance.pangle.activity.GenerateProxyActivity) r1
            com.bytedance.pangle.activity.GeneratePluginActivity r1 = r1.mTargetActivity
            boolean r1 = r2.isInstance(r1)
            return r1
        L52:
            boolean r1 = r2.isInstance(r1)
            return r1
    }

    private static boolean instanceOfFragmentActivity(java.lang.Object r1) {
            ensureFragmentActivity()
            java.lang.Class r0 = com.bytedance.pangle.transform.ZeusTransformUtils.fragmentClazz
            if (r0 != 0) goto L9
            r1 = 0
            return r1
        L9:
            boolean r1 = r0.isInstance(r1)
            return r1
    }

    private static boolean isSupportLibIso(java.lang.String r1) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()     // Catch: java.lang.Throwable -> Lb
            com.bytedance.pangle.plugin.Plugin r1 = r0.getPlugin(r1)     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.mIsSupportLibIso     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static int mapRes(int r3, java.lang.String r4, java.lang.String r5) {
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            if (r3 >= r0) goto L5
            return r3
        L5:
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.res.Resources r0 = r0.getResources()
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r1 = r1.getPackageName()
            int r0 = r0.getIdentifier(r5, r4, r1)
            if (r0 != 0) goto L37
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "_"
            java.lang.String r2 = "."
            java.lang.String r1 = r5.replace(r1, r2)
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r2 = r2.getPackageName()
            int r0 = r0.getIdentifier(r1, r4, r2)
        L37:
            if (r0 != 0) goto L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Cant find res, resName = "
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r5 = ", pluginResId = "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "Zeus/resources_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r4, r3)
        L54:
            return r0
    }

    public static android.content.res.TypedArray obtainAttributes(java.lang.Object r2, android.util.AttributeSet r3, int[] r4, java.lang.String r5) {
            boolean r5 = r2 instanceof android.content.res.Resources
            if (r5 == 0) goto L12
            int[] r5 = handleAttrBefore(r4)
            android.content.res.Resources r2 = (android.content.res.Resources) r2
            android.content.res.TypedArray r2 = r2.obtainAttributes(r3, r5)
            handleAttrAfter(r2, r5, r4)
            return r2
        L12:
            java.lang.String r5 = "obtainAttributes"
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L24
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L24
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r5, r0)     // Catch: java.lang.Exception -> L24
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2     // Catch: java.lang.Exception -> L24
            return r2
        L24:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.res.TypedArray obtainStyledAttributes(java.lang.Object r2, int r3, int[] r4, java.lang.String r5) {
            boolean r5 = r2 instanceof android.content.Context
            if (r5 == 0) goto L12
            int[] r5 = handleAttrBefore(r4)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r5)
            handleAttrAfter(r2, r5, r4)
            return r2
        L12:
            boolean r5 = r2 instanceof android.content.res.Resources.Theme
            if (r5 == 0) goto L24
            int[] r5 = handleAttrBefore(r4)
            android.content.res.Resources$Theme r2 = (android.content.res.Resources.Theme) r2
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r5)
            handleAttrAfter(r2, r5, r4)
            return r2
        L24:
            java.lang.String r5 = "obtainStyledAttributes"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L3a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L3a
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L3a
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L3a
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r5, r0)     // Catch: java.lang.Exception -> L3a
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2     // Catch: java.lang.Exception -> L3a
            return r2
        L3a:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.res.TypedArray obtainStyledAttributes(java.lang.Object r2, android.util.AttributeSet r3, int[] r4, int r5, int r6, java.lang.String r7) {
            boolean r7 = r2 instanceof android.content.Context
            if (r7 == 0) goto L12
            int[] r5 = handleAttrBefore(r4)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r5)
            handleAttrAfter(r2, r5, r4)
            return r2
        L12:
            boolean r7 = r2 instanceof android.content.res.Resources.Theme
            if (r7 == 0) goto L24
            int[] r7 = handleAttrBefore(r4)
            android.content.res.Resources$Theme r2 = (android.content.res.Resources.Theme) r2
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r7, r5, r6)
            handleAttrAfter(r2, r7, r4)
            return r2
        L24:
            java.lang.String r7 = "obtainStyledAttributes"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L44
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L44
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L44
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L44
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L44
            r3 = 2
            r0[r3] = r5     // Catch: java.lang.Exception -> L44
            r3 = 3
            r0[r3] = r6     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r7, r0)     // Catch: java.lang.Exception -> L44
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2     // Catch: java.lang.Exception -> L44
            return r2
        L44:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.res.TypedArray obtainStyledAttributes(java.lang.Object r2, android.util.AttributeSet r3, int[] r4, java.lang.String r5) {
            boolean r5 = r2 instanceof android.content.Context
            if (r5 == 0) goto L12
            int[] r5 = handleAttrBefore(r4)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r5)
            handleAttrAfter(r2, r5, r4)
            return r2
        L12:
            java.lang.String r5 = "obtainStyledAttributes"
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L24
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L24
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r5, r0)     // Catch: java.lang.Exception -> L24
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2     // Catch: java.lang.Exception -> L24
            return r2
        L24:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.res.TypedArray obtainStyledAttributes(java.lang.Object r4, int[] r5, java.lang.String r6) {
            boolean r6 = r4 instanceof android.content.Context
            if (r6 == 0) goto L12
            int[] r6 = handleAttrBefore(r5)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r6)
            handleAttrAfter(r4, r6, r5)
            return r4
        L12:
            boolean r6 = r4 instanceof android.content.res.Resources.Theme
            if (r6 == 0) goto L24
            int[] r6 = handleAttrBefore(r5)
            android.content.res.Resources$Theme r4 = (android.content.res.Resources.Theme) r4
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r6)
            handleAttrAfter(r4, r6, r5)
            return r4
        L24:
            java.lang.String r6 = "obtainStyledAttributes"
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L3c
            java.lang.Class<int[]> r2 = int[].class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L3c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3c
            r2[r3] = r5     // Catch: java.lang.Exception -> L3c
            r2[r0] = r1     // Catch: java.lang.Exception -> L3c
            java.lang.Object r4 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r4, r6, r2)     // Catch: java.lang.Exception -> L3c
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4     // Catch: java.lang.Exception -> L3c
            return r4
        L3c:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    public static java.lang.Object preCheckCast(java.lang.Object r2, java.lang.Class r3, java.lang.String r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof android.content.Context
            if (r0 != 0) goto L9
            goto L71
        L9:
            boolean r0 = r3.isInstance(r2)
            boolean r1 = equalsFragmentActivity(r3)
            if (r1 == 0) goto L18
            java.lang.Object r2 = wrapperContext2FragmentActivity(r2, r4)
            return r2
        L18:
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            if (r3 != r1) goto L21
            android.app.Activity r2 = wrapperContext2Activity(r2, r4)
            return r2
        L21:
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            if (r3 != r1) goto L2a
            android.app.Application r2 = wrapperContext2Application(r2, r4)
            return r2
        L2a:
            boolean r3 = r2 instanceof com.bytedance.pangle.PluginContext
            if (r3 == 0) goto L35
            if (r0 != 0) goto L35
            com.bytedance.pangle.PluginContext r2 = (com.bytedance.pangle.PluginContext) r2
            android.content.Context r2 = r2.mOriginContext
            return r2
        L35:
            boolean r3 = r2 instanceof com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper
            if (r3 == 0) goto L51
            if (r0 != 0) goto L51
            r3 = r2
            com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper r3 = (com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper) r3     // Catch: java.lang.Throwable -> L43
            android.app.Activity r2 = r3.getOriginActivity()     // Catch: java.lang.Throwable -> L43
            return r2
        L43:
            java.lang.String r3 = "mOriginActivity"
            java.lang.Object r2 = com.bytedance.pangle.util.FieldUtils.readField(r2, r3)     // Catch: java.lang.Throwable -> L4a
            return r2
        L4a:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L51:
            boolean r3 = r2 instanceof com.bytedance.pangle.wrapper.PluginActivityWrapper
            if (r3 == 0) goto L5c
            if (r0 != 0) goto L5c
            com.bytedance.pangle.wrapper.PluginActivityWrapper r2 = (com.bytedance.pangle.wrapper.PluginActivityWrapper) r2
            android.app.Activity r2 = r2.mOriginActivity
            return r2
        L5c:
            boolean r3 = r2 instanceof com.bytedance.pangle.wrapper.PluginApplicationWrapper
            if (r3 == 0) goto L67
            if (r0 != 0) goto L67
            com.bytedance.pangle.wrapper.PluginApplicationWrapper r2 = (com.bytedance.pangle.wrapper.PluginApplicationWrapper) r2
            android.app.Application r2 = r2.mOriginApplication
            return r2
        L67:
            boolean r3 = r2 instanceof com.bytedance.pangle.activity.GenerateProxyActivity
            if (r3 == 0) goto L71
            if (r0 != 0) goto L71
            com.bytedance.pangle.activity.GenerateProxyActivity r2 = (com.bytedance.pangle.activity.GenerateProxyActivity) r2
            com.bytedance.pangle.activity.GeneratePluginActivity r2 = r2.mTargetActivity
        L71:
            return r2
    }

    public static android.content.Intent registerReceiver(java.lang.Object r2, com.bytedance.pangle.receiver.PluginBroadcastReceiver r3, android.content.IntentFilter r4, int r5, java.lang.String r6) {
            boolean r0 = r2 instanceof android.content.Context
            if (r0 == 0) goto Lb
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r2 = com.bytedance.pangle.ComponentManager.registerReceiver(r2, r3, r4, r5, r6)
            return r2
        Lb:
            java.lang.String r6 = "registerReceiver"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L24
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L24
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L24
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L24
            r3 = 2
            r0[r3] = r5     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r6, r0)     // Catch: java.lang.Exception -> L24
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Exception -> L24
            return r2
        L24:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.Intent registerReceiver(java.lang.Object r2, com.bytedance.pangle.receiver.PluginBroadcastReceiver r3, android.content.IntentFilter r4, java.lang.String r5) {
            boolean r0 = r2 instanceof android.content.Context
            if (r0 == 0) goto Lb
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r2 = com.bytedance.pangle.ComponentManager.registerReceiver(r2, r3, r4, r5)
            return r2
        Lb:
            java.lang.String r5 = "registerReceiver"
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1d
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L1d
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L1d
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r5, r0)     // Catch: java.lang.Exception -> L1d
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Exception -> L1d
            return r2
        L1d:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.Intent registerReceiver(java.lang.Object r2, com.bytedance.pangle.receiver.PluginBroadcastReceiver r3, android.content.IntentFilter r4, java.lang.String r5, android.os.Handler r6, int r7, java.lang.String r8) {
            boolean r0 = r2 instanceof android.content.Context
            if (r0 == 0) goto Lb
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r2 = com.bytedance.pangle.ComponentManager.registerReceiver(r2, r3, r4, r5, r6, r7, r8)
            return r2
        Lb:
            java.lang.String r8 = "registerReceiver"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L2a
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2a
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L2a
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L2a
            r3 = 2
            r0[r3] = r5     // Catch: java.lang.Exception -> L2a
            r3 = 3
            r0[r3] = r6     // Catch: java.lang.Exception -> L2a
            r3 = 4
            r0[r3] = r7     // Catch: java.lang.Exception -> L2a
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r8, r0)     // Catch: java.lang.Exception -> L2a
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Exception -> L2a
            return r2
        L2a:
            r0 = move-exception
            r2 = r0
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.Intent registerReceiver(java.lang.Object r2, com.bytedance.pangle.receiver.PluginBroadcastReceiver r3, android.content.IntentFilter r4, java.lang.String r5, android.os.Handler r6, java.lang.String r7) {
            boolean r0 = r2 instanceof android.content.Context
            if (r0 == 0) goto L12
            java.lang.String r0 = "Zeus/receiver_pangle"
            java.lang.String r1 = "ZeusTransformUtils-registerReceiver-execute[4 params]"
            com.bytedance.pangle.log.ZeusLogger.d(r0, r1)
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r2 = com.bytedance.pangle.ComponentManager.registerReceiver(r2, r3, r4, r5, r6, r7)
            return r2
        L12:
            java.lang.String r7 = "registerReceiver"
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2a
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L2a
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L2a
            r3 = 2
            r0[r3] = r5     // Catch: java.lang.Exception -> L2a
            r3 = 3
            r0[r3] = r6     // Catch: java.lang.Exception -> L2a
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r7, r0)     // Catch: java.lang.Exception -> L2a
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Exception -> L2a
            return r2
        L2a:
            r0 = move-exception
            r2 = r0
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static void registerZeusActivityStub(java.lang.String r0, java.lang.String[] r1, java.lang.String r2) {
            com.bytedance.pangle.ComponentManager.registerActivity(r2, r0, r1)
            return
    }

    public static void requestPermissions(java.lang.Object r2, java.lang.String[] r3, int r4, java.lang.String r5) {
            boolean r5 = r2 instanceof com.bytedance.pangle.activity.IPluginActivity
            if (r5 == 0) goto La
            com.bytedance.pangle.activity.IPluginActivity r2 = (com.bytedance.pangle.activity.IPluginActivity) r2
            r2._requestPermissions(r3, r4)
            return
        La:
            boolean r5 = r2 instanceof android.app.Activity
            if (r5 == 0) goto L19
            java.lang.String r5 = "mOriginActivity"
            java.lang.Object r5 = com.bytedance.pangle.util.FieldUtils.readField(r2, r5)     // Catch: java.lang.IllegalAccessException -> L15
            goto L16
        L15:
            r5 = 0
        L16:
            if (r5 == 0) goto L19
            r2 = r5
        L19:
            java.lang.String r5 = "requestPermissions"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L2c
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2c
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L2c
            r3 = 1
            r0[r3] = r4     // Catch: java.lang.Exception -> L2c
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r5, r0)     // Catch: java.lang.Exception -> L2c
            return
        L2c:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static void setComponentEnabledSetting(android.content.pm.PackageManager r0, android.content.ComponentName r1, int r2, int r3) {
            r0.setComponentEnabledSetting(r1, r2, r3)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    public static void setResult(java.lang.Object r6, int r7, android.content.Intent r8, java.lang.String r9) {
            boolean r9 = r6 instanceof android.app.Activity
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.String r3 = "setResult"
            if (r9 == 0) goto L27
            java.lang.String r9 = "mProxyActivity"
            java.lang.Object r9 = com.bytedance.pangle.util.FieldUtils.readField(r6, r9)     // Catch: java.lang.Exception -> L27
            if (r9 != 0) goto L17
            java.lang.String r9 = "mOriginActivity"
            java.lang.Object r9 = com.bytedance.pangle.util.FieldUtils.readField(r6, r9)     // Catch: java.lang.Exception -> L27
        L17:
            if (r9 == 0) goto L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L27
            r5[r1] = r4     // Catch: java.lang.Exception -> L27
            r5[r0] = r8     // Catch: java.lang.Exception -> L27
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r9, r3, r5)     // Catch: java.lang.Exception -> L27
            return
        L27:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L35
            r9[r1] = r7     // Catch: java.lang.Exception -> L35
            r9[r0] = r8     // Catch: java.lang.Exception -> L35
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r6, r3, r9)     // Catch: java.lang.Exception -> L35
            return
        L35:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
    }

    public static void setResult(java.lang.Object r5, int r6, java.lang.String r7) {
            boolean r7 = r5 instanceof android.app.Activity
            r0 = 0
            r1 = 1
            java.lang.String r2 = "setResult"
            if (r7 == 0) goto L2b
            java.lang.String r7 = "mProxyActivity"
            java.lang.Object r7 = com.bytedance.pangle.util.FieldUtils.readField(r5, r7)     // Catch: java.lang.Exception -> L1c
            if (r7 == 0) goto L2b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L1c
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1c
            r4[r0] = r3     // Catch: java.lang.Exception -> L1c
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r2, r4)     // Catch: java.lang.Exception -> L1c
            return
        L1c:
            java.lang.String r7 = "Cant find mProxyActivity, obj = "
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r7 = r7.concat(r3)
            java.lang.String r3 = "Zeus/activity_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r3, r7)
        L2b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L37
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L37
            r7[r0] = r6     // Catch: java.lang.Exception -> L37
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r5, r2, r7)     // Catch: java.lang.Exception -> L37
            return
        L37:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
    }

    public static void startActivity(java.lang.Object r4, android.content.Intent r5, android.os.Bundle r6, java.lang.String r7) {
            com.bytedance.pangle.ComponentManager.startActivity(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            boolean r1 = r4 instanceof android.content.Context
            if (r1 == 0) goto Lf
            android.content.Context r4 = (android.content.Context) r4
            com.bytedance.pangle.ComponentManager.startActivity(r4, r5, r6, r7)
            return
        Lf:
            java.lang.String r7 = "startActivity"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L28
            r5 = 1
            r2[r5] = r6     // Catch: java.lang.Throwable -> L28
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L28
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r6[r3] = r1     // Catch: java.lang.Throwable -> L28
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r6[r5] = r1     // Catch: java.lang.Throwable -> L28
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r4, r7, r2, r6)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r4 = move-exception
            r4.addSuppressed(r0)
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    public static void startActivity(java.lang.Object r1, android.content.Intent r2, java.lang.String r3) {
            r0 = 0
            startActivity(r1, r2, r0, r3)
            return
    }

    public static void startActivityForResult(java.lang.Object r4, android.content.Intent r5, int r6, android.os.Bundle r7, java.lang.String r8) {
            com.bytedance.pangle.ComponentManager.startActivityForResult(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            boolean r1 = r4 instanceof android.app.Activity
            if (r1 == 0) goto Lf
            android.app.Activity r4 = (android.app.Activity) r4
            com.bytedance.pangle.ComponentManager.startActivityForResult(r4, r5, r6, r7, r8)
            return
        Lf:
            java.lang.String r8 = "startActivityForResult"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L33
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L33
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L33
            r5 = 1
            r2[r5] = r6     // Catch: java.lang.Throwable -> L33
            r6 = 2
            r2[r6] = r7     // Catch: java.lang.Throwable -> L33
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L33
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r7[r3] = r1     // Catch: java.lang.Throwable -> L33
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L33
            r7[r5] = r1     // Catch: java.lang.Throwable -> L33
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7[r6] = r5     // Catch: java.lang.Throwable -> L33
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r4, r8, r2, r7)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r4 = move-exception
            r4.addSuppressed(r0)
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    public static void startActivityForResult(java.lang.Object r1, android.content.Intent r2, int r3, java.lang.String r4) {
            r0 = 0
            startActivityForResult(r1, r2, r3, r0, r4)
            return
    }

    public static android.content.ComponentName startService(java.lang.Object r2, android.content.Intent r3, java.lang.String r4) {
            boolean r0 = r2 instanceof android.content.Context
            if (r0 == 0) goto Lf
            com.bytedance.pangle.service.client.ServiceManagerNative r0 = com.bytedance.pangle.service.client.ServiceManagerNative.getInstance()
            android.content.Context r2 = (android.content.Context) r2
            android.content.ComponentName r2 = r0.startServiceNative(r2, r3, r4)
            return r2
        Lf:
            java.lang.String r4 = "startService"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1e
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L1e
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r4, r0)     // Catch: java.lang.Exception -> L1e
            android.content.ComponentName r2 = (android.content.ComponentName) r2     // Catch: java.lang.Exception -> L1e
            return r2
        L1e:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static boolean stopService(java.lang.Object r2, android.content.Intent r3, java.lang.String r4) {
            boolean r0 = r2 instanceof android.content.Context
            if (r0 == 0) goto Lf
            com.bytedance.pangle.service.client.ServiceManagerNative r0 = com.bytedance.pangle.service.client.ServiceManagerNative.getInstance()
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = r0.stopServiceNative(r2, r3, r4)
            return r2
        Lf:
            java.lang.String r4 = "stopService"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L22
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L22
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r4, r0)     // Catch: java.lang.Exception -> L22
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L22
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L22
            return r2
        L22:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static void supportFragmentWrapper(boolean r0) {
            com.bytedance.pangle.transform.ZeusTransformUtils.sSupportFragmentWrapper = r0
            return
    }

    public static void unbindService(java.lang.Object r2, android.content.ServiceConnection r3, java.lang.String r4) {
            boolean r4 = r2 instanceof android.content.Context
            if (r4 == 0) goto Lc
            com.bytedance.pangle.service.client.ServiceManagerNative r2 = com.bytedance.pangle.service.client.ServiceManagerNative.getInstance()
            r2.unbindServiceNative(r3)
            return
        Lc:
            java.lang.String r4 = "unbindService"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L18
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L18
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r4, r0)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static void unregisterReceiver(java.lang.Object r2, com.bytedance.pangle.receiver.PluginBroadcastReceiver r3, java.lang.String r4) {
            boolean r4 = r2 instanceof android.content.Context
            if (r4 == 0) goto La
            android.content.Context r2 = (android.content.Context) r2
            com.bytedance.pangle.ComponentManager.unregisterReceiver(r2, r3)
            return
        La:
            java.lang.String r4 = "unregisterReceiver"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L16
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Exception -> L16
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r2, r4, r0)     // Catch: java.lang.Exception -> L16
            return
        L16:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public static android.content.Context wrapperContext(java.lang.Object r1, java.lang.String r2) {
            r0 = 0
            android.content.Context r1 = wrapperContext(r1, r2, r0)
            return r1
    }

    public static android.content.Context wrapperContext(java.lang.Object r6, java.lang.String r7, java.lang.StringBuilder r8) {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            if (r0 != 0) goto L18
            r0 = r6
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.app.Application r0 = (android.app.Application) r0
            if (r0 == 0) goto L18
            com.bytedance.pangle.Zeus.setAppContext(r0)
        L18:
            if (r6 != 0) goto L23
            if (r8 == 0) goto L21
            java.lang.String r6 = "context1 == null"
            r8.append(r6)
        L21:
            r6 = 0
            return r6
        L23:
            android.content.Context r0 = getWrapperFromCache(r6, r7)
            if (r0 == 0) goto L34
            if (r8 == 0) goto L33
            java.lang.String r6 = "cache1:"
            r8.append(r6)
            r8.append(r0)
        L33:
            return r0
        L34:
            r0 = r6
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = getContextIfNeedWrap(r0, r0, r7)
            if (r1 != 0) goto L48
            if (r8 == 0) goto L47
            java.lang.String r7 = "context2 == null"
            r8.append(r7)
            r8.append(r6)
        L47:
            return r0
        L48:
            boolean r6 = isSupportLibIso(r7)
            r0 = 1
            r2 = 0
            if (r6 != 0) goto Lc2
            boolean r6 = instanceOfFragmentActivity(r1)
            if (r6 == 0) goto Lc2
            boolean r6 = com.bytedance.pangle.transform.ZeusTransformUtils.sSupportFragmentWrapper
            if (r6 == 0) goto Lc2
            android.os.Looper r6 = android.os.Looper.myLooper()
            if (r6 != 0) goto L63
            android.os.Looper.prepare()
        L63:
            com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper r6 = new com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper     // Catch: java.lang.Throwable -> L84
            r3 = r1
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L84
            com.bytedance.pangle.PluginContext r4 = new com.bytedance.pangle.PluginContext     // Catch: java.lang.Throwable -> L84
            com.bytedance.pangle.plugin.PluginManager r5 = com.bytedance.pangle.plugin.PluginManager.getInstance()     // Catch: java.lang.Throwable -> L84
            com.bytedance.pangle.plugin.Plugin r5 = r5.getPlugin(r7)     // Catch: java.lang.Throwable -> L84
            r4.<init>(r1, r5, r2)     // Catch: java.lang.Throwable -> L84
            r6.<init>(r3, r4)     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L12a
            java.lang.String r3 = "new PluginFragmentActivityWrapper:"
            r8.append(r3)     // Catch: java.lang.Throwable -> L84
            r8.append(r6)     // Catch: java.lang.Throwable -> L84
            goto L12a
        L84:
            java.lang.Class<com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper> r6 = com.bytedance.pangle.wrapper.PluginFragmentActivityWrapper.class
            com.bytedance.pangle.PluginContext r3 = new com.bytedance.pangle.PluginContext     // Catch: java.lang.Throwable -> Lb6
            com.bytedance.pangle.plugin.PluginManager r4 = com.bytedance.pangle.plugin.PluginManager.getInstance()     // Catch: java.lang.Throwable -> Lb6
            com.bytedance.pangle.plugin.Plugin r4 = r4.getPlugin(r7)     // Catch: java.lang.Throwable -> Lb6
            r3.<init>(r1, r4, r2)     // Catch: java.lang.Throwable -> Lb6
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lb6
            r5[r2] = r1     // Catch: java.lang.Throwable -> Lb6
            r5[r0] = r3     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r4 = com.bytedance.pangle.transform.ZeusTransformUtils.fragmentClazz     // Catch: java.lang.Throwable -> Lb6
            r3[r2] = r4     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<com.bytedance.pangle.PluginContext> r2 = com.bytedance.pangle.PluginContext.class
            r3[r0] = r2     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r6 = com.bytedance.pangle.util.MethodUtils.invokeConstructor(r6, r5, r3)     // Catch: java.lang.Throwable -> Lb6
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> Lb6
            if (r8 == 0) goto L12a
            java.lang.String r0 = "new invokeConstructor:"
            r8.append(r0)     // Catch: java.lang.Throwable -> Lb6
            r8.append(r6)     // Catch: java.lang.Throwable -> Lb6
            goto L12a
        Lb6:
            if (r8 == 0) goto Lc1
            java.lang.String r6 = "context3 == null"
            r8.append(r6)
            r8.append(r1)
        Lc1:
            return r1
        Lc2:
            boolean r6 = r1 instanceof android.app.Activity
            if (r6 == 0) goto Lef
            android.os.Looper r6 = android.os.Looper.myLooper()
            if (r6 != 0) goto Lcf
            android.os.Looper.prepare()
        Lcf:
            com.bytedance.pangle.wrapper.PluginActivityWrapper r6 = new com.bytedance.pangle.wrapper.PluginActivityWrapper
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            com.bytedance.pangle.PluginContext r3 = new com.bytedance.pangle.PluginContext
            com.bytedance.pangle.plugin.PluginManager r4 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r4 = r4.getPlugin(r7)
            r3.<init>(r1, r4, r2)
            r6.<init>(r0, r3)
            if (r8 == 0) goto L12a
            java.lang.String r0 = "new PluginActivityWrapper:"
            r8.append(r0)
            r8.append(r6)
            goto L12a
        Lef:
            boolean r6 = r1 instanceof android.app.Application
            if (r6 == 0) goto L113
            com.bytedance.pangle.wrapper.PluginApplicationWrapper r6 = new com.bytedance.pangle.wrapper.PluginApplicationWrapper
            r2 = r1
            android.app.Application r2 = (android.app.Application) r2
            com.bytedance.pangle.PluginContext r3 = new com.bytedance.pangle.PluginContext
            com.bytedance.pangle.plugin.PluginManager r4 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r4 = r4.getPlugin(r7)
            r3.<init>(r1, r4, r0)
            r6.<init>(r2, r3)
            if (r8 == 0) goto L12a
            java.lang.String r0 = "new PluginApplicationWrapper:"
            r8.append(r0)
            r8.append(r6)
            goto L12a
        L113:
            com.bytedance.pangle.PluginContext r6 = new com.bytedance.pangle.PluginContext
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r0 = r0.getPlugin(r7)
            r6.<init>(r1, r0, r2)
            if (r8 == 0) goto L12a
            java.lang.String r0 = "new PluginContext:"
            r8.append(r0)
            r8.append(r6)
        L12a:
            if (r6 == 0) goto L149
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> r0 = com.bytedance.pangle.transform.ZeusTransformUtils.contextCache
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            int r7 = java.lang.System.identityHashCode(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r6)
            r0.put(r7, r1)
        L149:
            if (r8 == 0) goto L153
            java.lang.String r7 = "cache2:"
            r8.append(r7)
            r8.append(r6)
        L153:
            return r6
    }

    public static android.app.Activity wrapperContext2Activity(java.lang.Object r4, java.lang.String r5) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = wrapperContext(r4, r5, r0)
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L14
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L14:
            boolean r2 = r1 instanceof com.bytedance.pangle.PluginContext
            if (r2 == 0) goto L21
            com.bytedance.pangle.PluginContext r1 = (com.bytedance.pangle.PluginContext) r1
            android.content.Context r4 = r1.mOriginContext
            android.app.Activity r4 = wrapperContext2Activity(r4, r5)
            return r4
        L21:
            java.lang.String r5 = "SupportFragment="
            r0.append(r5)
            boolean r5 = com.bytedance.pangle.transform.ZeusTransformUtils.sSupportFragmentWrapper
            r0.append(r5)
            boolean r5 = com.bytedance.pangle.transform.ZeusTransformUtils.sCanThrowException
            if (r5 != 0) goto L32
            android.app.Activity r4 = (android.app.Activity) r4
            return r4
        L32:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "强转失败 context:"
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = " wrapperContext:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = " log:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r5.<init>(r4)
            throw r5
    }

    public static android.app.Application wrapperContext2Application(java.lang.Object r4, java.lang.String r5) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = wrapperContext(r4, r5, r0)
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L14
            android.app.Application r1 = (android.app.Application) r1
            return r1
        L14:
            boolean r2 = r1 instanceof com.bytedance.pangle.PluginContext
            if (r2 == 0) goto L21
            com.bytedance.pangle.PluginContext r1 = (com.bytedance.pangle.PluginContext) r1
            android.content.Context r4 = r1.mOriginContext
            android.app.Application r4 = wrapperContext2Application(r4, r5)
            return r4
        L21:
            java.lang.String r5 = "SupportFragment="
            r0.append(r5)
            boolean r5 = com.bytedance.pangle.transform.ZeusTransformUtils.sSupportFragmentWrapper
            r0.append(r5)
            boolean r5 = com.bytedance.pangle.transform.ZeusTransformUtils.sCanThrowException
            if (r5 != 0) goto L32
            android.app.Application r4 = (android.app.Application) r4
            return r4
        L32:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "强转失败 context:"
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = " wrapperContext:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = " log:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r5.<init>(r4)
            throw r5
    }

    private static java.lang.Object wrapperContext2FragmentActivity(java.lang.Object r4, java.lang.String r5) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = wrapperContext(r4, r5, r0)
            boolean r2 = isSupportLibIso(r5)
            if (r2 != 0) goto L1a
            boolean r2 = instanceOfFragmentActivity(r1)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            boolean r2 = r1 instanceof com.bytedance.pangle.PluginContext
            if (r2 == 0) goto L27
            com.bytedance.pangle.PluginContext r1 = (com.bytedance.pangle.PluginContext) r1
            android.content.Context r4 = r1.mOriginContext
            java.lang.Object r4 = wrapperContext2FragmentActivity(r4, r5)
            return r4
        L27:
            java.lang.String r5 = "SupportFragment="
            r0.append(r5)
            boolean r5 = com.bytedance.pangle.transform.ZeusTransformUtils.sSupportFragmentWrapper
            r0.append(r5)
            boolean r5 = com.bytedance.pangle.transform.ZeusTransformUtils.sCanThrowException
            if (r5 != 0) goto L36
            return r4
        L36:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "强转失败 context:"
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = " wrapperContext:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = " log:"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r5.<init>(r4)
            throw r5
    }

    public static java.lang.Object wrapperContextForParams(java.lang.Object r1, java.lang.Class r2, java.lang.String r3) {
            boolean r0 = r1 instanceof com.bytedance.pangle.service.PluginService
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof com.bytedance.pangle.service.PluginIntentService
            if (r0 == 0) goto L9
            return r1
        L9:
            boolean r0 = r1 instanceof android.content.Context
            if (r0 == 0) goto L1c
            android.content.Context r3 = wrapperContext(r1, r3)
            android.content.Context r3 = convertProxy2PluginActivity(r3)
            boolean r2 = r2.isInstance(r3)
            if (r2 == 0) goto L1c
            return r3
        L1c:
            return r1
    }
}
