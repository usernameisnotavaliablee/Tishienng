package com.bytedance.pangle.plugin;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Plugin {
    public static final int LIFE_INSTALLED = 2;
    public static final int LIFE_LOADED = 3;
    public static final int LIFE_LOADING = 4;
    public static final int LIFE_PENDING = 1;
    private static final java.lang.String TAG = "Plugin";
    final java.lang.Object initializeLock;
    final java.lang.Object installLock;
    protected int mApiVersionCode;
    public final java.lang.String mAppKey;
    public final java.lang.String mAppSecretKey;
    public com.bytedance.pangle.ZeusApplication mApplication;
    public com.bytedance.pangle.PluginClassLoader mClassLoader;
    public com.bytedance.pangle.wrapper.PluginApplicationWrapper mHostApplication;
    public android.content.pm.ApplicationInfo mHostApplicationInfoHookSomeField;
    protected volatile boolean mInitialized;
    private java.lang.String mInternalPath;
    private int mInternalVersionCode;
    public boolean mIsDexPlugin;
    public boolean mIsSupportLibIso;
    protected volatile int mLifeCycle;
    public int mMaxVersionCode;
    public int mMinVersionCode;
    public final boolean mOpenLoadClassOpt;
    private java.lang.String mPackageDir;
    public java.lang.String mPkgName;
    public final boolean mReInstallInternalPluginByMd5;
    public android.content.res.Resources mResources;
    public final java.util.List<java.lang.String> mSharedHostSos;
    public java.lang.String mSignature;
    public final boolean mUnInstallPluginWhenHostChange;
    public final boolean mUseMemoryForActivityIntent;
    protected int mVersionCode;
    public java.util.HashMap<java.lang.String, android.content.pm.ActivityInfo> pluginActivities;
    public java.util.HashMap<java.lang.String, android.content.pm.ProviderInfo> pluginProvider;
    public java.util.HashMap<java.lang.String, android.content.pm.ActivityInfo> pluginReceiver;
    public java.util.HashMap<java.lang.String, android.content.pm.ServiceInfo> pluginServices;
    public java.lang.String response;





    public Plugin(org.json.JSONObject r6) throws org.json.JSONException {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.pluginActivities = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.pluginServices = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.pluginReceiver = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.pluginProvider = r0
            r0 = -1
            r5.mInternalVersionCode = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5.mMaxVersionCode = r1
            r2 = 1
            r5.mLifeCycle = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.mSharedHostSos = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r5.installLock = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r5.initializeLock = r3
            r3 = 0
            r5.mIsDexPlugin = r3
            java.lang.String r4 = "packageName"
            java.lang.String r4 = r6.getString(r4)
            r5.mPkgName = r4
            java.lang.String r4 = "minPluginVersion"
            int r4 = r6.optInt(r4, r3)
            r5.mMinVersionCode = r4
            java.lang.String r4 = "maxPluginVersion"
            int r1 = r6.optInt(r4, r1)
            r5.mMaxVersionCode = r1
            java.lang.String r1 = "apiVersionCode"
            int r1 = r6.getInt(r1)
            r5.mApiVersionCode = r1
            java.lang.String r1 = "isDexPlugin"
            boolean r4 = r6.has(r1)
            if (r4 == 0) goto L74
            int r1 = r6.getInt(r1)
            if (r1 != r2) goto L71
            goto L72
        L71:
            r2 = 0
        L72:
            r5.mIsDexPlugin = r2
        L74:
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()
            java.lang.String r2 = r5.mPkgName
            java.lang.String r1 = r1.getSignature(r2)
            r5.mSignature = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = ""
            if (r1 == 0) goto L90
            java.lang.String r1 = "signature"
            java.lang.String r1 = r6.optString(r1, r2)
            r5.mSignature = r1
        L90:
            java.lang.String r1 = "isSupportLibIsolate"
            boolean r1 = r6.optBoolean(r1, r3)
            r5.mIsSupportLibIso = r1
            java.lang.String r1 = "internalPath"
            java.lang.String r1 = r6.optString(r1, r2)
            r5.mInternalPath = r1
            java.lang.String r1 = "internalVersionCode"
            int r0 = r6.optInt(r1, r0)
            r5.mInternalVersionCode = r0
            java.lang.String r0 = "appKey"
            java.lang.String r0 = r6.optString(r0, r2)
            r5.mAppKey = r0
            java.lang.String r0 = "appSecretKey"
            java.lang.String r0 = r6.optString(r0, r2)
            r5.mAppSecretKey = r0
            java.lang.String r0 = "loadClassOpt"
            boolean r0 = r6.optBoolean(r0, r3)
            r5.mOpenLoadClassOpt = r0
            java.lang.String r0 = "unInstallPluginWhenHostChange"
            boolean r0 = r6.optBoolean(r0, r3)
            r5.mUnInstallPluginWhenHostChange = r0
            java.lang.String r0 = "useMemoryForActivityIntent"
            boolean r0 = r6.optBoolean(r0, r3)
            r5.mUseMemoryForActivityIntent = r0
            java.lang.String r0 = "reInstallInternalPluginByMd5"
            boolean r0 = r6.optBoolean(r0, r3)
            r5.mReInstallInternalPluginByMd5 = r0
            java.lang.String r0 = "sharedHostSo"
            org.json.JSONArray r6 = r6.optJSONArray(r0)
            if (r6 == 0) goto Lf4
        Le0:
            int r0 = r6.length()
            if (r3 >= r0) goto Lf4
            java.util.List<java.lang.String> r0 = r5.mSharedHostSos
            java.lang.Object r1 = r6.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            int r3 = r3 + 1
            goto Le0
        Lf4:
            r5.setupInternalPlugin()
            return
    }

    static /* synthetic */ java.lang.String access$000(com.bytedance.pangle.plugin.Plugin r0) {
            java.lang.String r0 = r0.mInternalPath
            return r0
    }

    private boolean checkValid(java.io.File r8, java.lang.String r9, int r10) {
            r7 = this;
            java.lang.String r0 = r7.mPkgName
            boolean r0 = android.text.TextUtils.equals(r0, r9)
            r1 = 0
            java.lang.String r2 = "Plugin checkValid "
            java.lang.String r3 = "Zeus/install_pangle"
            if (r0 != 0) goto L22
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r9)
            java.lang.String r9 = " package name not match !!!"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r3, r8)
            return r1
        L22:
            int r0 = r7.mMinVersionCode
            r4 = 2
            r5 = 1
            if (r10 < r0) goto Lc9
            int r0 = r7.mMaxVersionCode
            if (r10 <= r0) goto L2e
            goto Lc9
        L2e:
            int r0 = r7.mVersionCode
            if (r10 >= r0) goto L61
            boolean r0 = r7.isInstalled()
            if (r0 == 0) goto L61
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            int r10 = r7.mVersionCode
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r1] = r8
            r0[r5] = r10
            java.lang.String r8 = " pluginApk ver[%s] lower than installed plugin[%s]."
            java.lang.String r8 = java.lang.String.format(r8, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r2)
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r3, r8)
            return r1
        L61:
            if (r8 == 0) goto Lb4
            boolean r0 = r8.exists()
            if (r0 != 0) goto L6a
            goto Lb4
        L6a:
            int r0 = r7.mVersionCode
            if (r10 != r0) goto L97
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r0 = r0.oq(r9)
            java.lang.String[] r8 = com.bytedance.pangle.util.cw.j(r8)
            r8 = r8[r1]
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L97
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r9)
            java.lang.String r9 = " pluginApk with the same identity has already installed."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r3, r8)
            return r1
        L97:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r9)
            java.lang.String r9 = ":"
            r8.append(r9)
            r8.append(r10)
            java.lang.String r9 = " true"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r3, r8)
            return r5
        Lb4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r9)
            java.lang.String r9 = " pluginApk not exist."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r3, r8)
            return r1
        Lc9:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            int r10 = r7.mMinVersionCode
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r0 = r7.mMaxVersionCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r8
            r6[r5] = r10
            r6[r4] = r0
            java.lang.String r8 = " pluginApk ver[%s] not match plugin VerRange[%s, %s]."
            java.lang.String r8 = java.lang.String.format(r8, r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r2)
            r10.append(r9)
            java.lang.String r9 = " "
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r3, r8)
            return r1
    }

    private boolean checkVersionValid(int r12, int r13, boolean r14) {
            r11 = this;
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r11.mPkgName
            int r0 = r0.up(r1)
            r1 = 3
            r2 = 2
            r3 = 1
            java.lang.String r4 = "Plugin"
            java.lang.String r5 = "Zeus/init_pangle"
            r6 = 0
            if (r0 <= r13) goto L34
            java.lang.String r12 = r11.mPkgName
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r6] = r12
            r0[r3] = r14
            r0[r2] = r13
            java.lang.String r12 = " checkVersionValid %s apiVersion downgrade , lastApiVersion=%s , currentApiVersion=%s"
            java.lang.String r12 = java.lang.String.format(r12, r0)
            java.lang.String r12 = r4.concat(r12)
            com.bytedance.pangle.log.ZeusLogger.w(r5, r12)
            return r6
        L34:
            if (r12 < 0) goto L40
            int r0 = r11.mMinVersionCode
            if (r12 < r0) goto L40
            int r0 = r11.mMaxVersionCode
            if (r12 > r0) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 == 0) goto L8e
            r7 = -1
            if (r13 == r7) goto L8e
            com.bytedance.pangle.util.jy r7 = com.bytedance.pangle.util.jy.j()
            java.lang.String r8 = r11.mPkgName
            int r7 = r7.xt(r8, r12)
            com.bytedance.pangle.util.jy r8 = com.bytedance.pangle.util.jy.j()
            java.lang.String r9 = r11.mPkgName
            int r8 = r8.cw(r9, r12)
            if (r13 < r7) goto L5e
            if (r13 <= r8) goto L8e
        L5e:
            java.lang.String r0 = r11.mPkgName
            int r9 = r11.mVersionCode
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r6] = r0
            r10[r3] = r9
            r10[r2] = r13
            r10[r1] = r7
            r13 = 4
            r10[r13] = r8
            java.lang.String r13 = " checkVersionValid plugin[%s, ver=%s] is not compatible with api[ver_code=%s], apiCompatibleVer=[%s,%s]"
            java.lang.String r13 = java.lang.String.format(r13, r10)
            java.lang.String r13 = r4.concat(r13)
            com.bytedance.pangle.log.ZeusLogger.w(r5, r13)
            r0 = 0
        L8e:
            if (r0 == 0) goto Lbd
            if (r14 == 0) goto Lbd
            java.io.File r13 = new java.io.File
            java.lang.String r14 = r11.mPkgName
            java.lang.String r14 = com.bytedance.pangle.up.cw.xt(r14, r12)
            r13.<init>(r14)
            boolean r13 = com.bytedance.pangle.up.xt.xt(r13)
            if (r13 == 0) goto Lbd
            java.lang.String r13 = r11.mPkgName
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r6] = r13
            r14[r3] = r12
            java.lang.String r12 = " checkVersionValid plugin[%s, ver=%s] not match hostAbi"
            java.lang.String r12 = java.lang.String.format(r12, r14)
            java.lang.String r12 = r4.concat(r12)
            com.bytedance.pangle.log.ZeusLogger.w(r5, r12)
            goto Lbe
        Lbd:
            r6 = r0
        Lbe:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Plugin checkVersionValid, pkg="
            r12.<init>(r13)
            java.lang.String r13 = r11.mPkgName
            r12.append(r13)
            java.lang.String r13 = ", ver="
            r12.append(r13)
            int r13 = r11.mVersionCode
            r12.append(r13)
            java.lang.String r13 = ", valid="
            r12.append(r13)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r5, r12)
            return r6
    }

    private void deleteInstalledPlugin() {
            r2 = this;
            java.lang.String r0 = r2.mPackageDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = r2.mPkgName
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r0)
            r2.mPackageDir = r0
        L10:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.mPackageDir
            r0.<init>(r1)
            com.bytedance.pangle.plugin.Plugin$3 r1 = new com.bytedance.pangle.plugin.Plugin$3
            r1.<init>(r2)
            r0.listFiles(r1)
            java.lang.String r0 = r2.mPackageDir
            com.bytedance.pangle.util.ae.j(r0)
            return
    }

    private void deleteOtherExpiredVer(int r3) {
            r2 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 == 0) goto L33
            java.lang.String r0 = r2.mPackageDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.mPkgName
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r0)
            r2.mPackageDir = r0
        L1a:
            java.lang.String r0 = "version-"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r0.concat(r3)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.mPackageDir
            r0.<init>(r1)
            com.bytedance.pangle.plugin.Plugin$4 r1 = new com.bytedance.pangle.plugin.Plugin$4
            r1.<init>(r2, r3)
            r0.listFiles(r1)
        L33:
            return
    }

    private void installInternalPlugin() {
            r2 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 == 0) goto L30
            boolean r0 = r2.mReInstallInternalPluginByMd5
            if (r0 == 0) goto L17
            int r0 = r2.getVersion()
            int r1 = r2.mInternalVersionCode
            if (r0 <= r1) goto L1f
            goto L30
        L17:
            int r0 = r2.getVersion()
            int r1 = r2.mInternalVersionCode
            if (r0 >= r1) goto L30
        L1f:
            java.lang.String r0 = r2.mInternalPath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L28
            goto L30
        L28:
            com.bytedance.pangle.plugin.Plugin$1 r0 = new com.bytedance.pangle.plugin.Plugin$1
            r0.<init>(r2)
            com.bytedance.pangle.up.up.j(r0)
        L30:
            return
    }

    private int modifyResIfNeed(int r6) {
            r5 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r0 = com.bytedance.pangle.util.xt.j(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()
            java.lang.String r2 = r5.mPkgName
            java.lang.String r1 = r1.m(r2)
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L71
        L1e:
            boolean r0 = r5.mUnInstallPluginWhenHostChange
            r1 = 0
            java.lang.String r2 = " "
            java.lang.String r3 = "Zeus/init_pangle"
            if (r0 != 0) goto L72
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            java.lang.String r4 = r5.mPkgName
            boolean r0 = r0.unInstallPluginWhenHostChange(r4)
            if (r0 == 0) goto L34
            goto L72
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "modifyRes by init. "
            r0.<init>(r4)
            java.lang.String r4 = r5.mPkgName
            r0.append(r4)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.d(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.pangle.res.j.cw r2 = new com.bytedance.pangle.res.j.cw
            r2.<init>()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r5.mPkgName
            java.lang.String r4 = com.bytedance.pangle.up.cw.xt(r4, r6)
            r3.<init>(r4)
            r4 = 1
            int r0 = r2.j(r3, r4, r0)
            r2 = 100
            if (r0 == r2) goto L71
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L70
            goto L71
        L70:
            return r1
        L71:
            return r6
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "uninstall plugin by host update. "
            r0.<init>(r4)
            java.lang.String r4 = r5.mPkgName
            r0.append(r4)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.d(r3, r6)
            return r1
    }

    private void setupInternalPlugin() {
            r8 = this;
            java.lang.String r0 = "_"
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()
            java.lang.String r2 = r8.mPkgName
            int r3 = r8.mApiVersionCode
            boolean r1 = r1.m(r2, r3)
            if (r1 == 0) goto L11
            goto L77
        L11:
            java.lang.String r1 = r8.mInternalPath
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = -1
            if (r1 != 0) goto L1f
            int r1 = r8.mInternalVersionCode
            if (r1 == r2) goto L1f
            goto L77
        L1f:
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.io.IOException -> L72
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.io.IOException -> L72
            java.lang.String r3 = com.bytedance.pangle.g.r     // Catch: java.io.IOException -> L72
            java.lang.String[] r1 = r1.list(r3)     // Catch: java.io.IOException -> L72
            int r3 = r1.length     // Catch: java.io.IOException -> L72
            r4 = 0
        L2f:
            if (r4 >= r3) goto L77
            r5 = r1[r4]     // Catch: java.io.IOException -> L72
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L72
            r6.<init>()     // Catch: java.io.IOException -> L72
            java.lang.String r7 = r8.mPkgName     // Catch: java.io.IOException -> L72
            r6.append(r7)     // Catch: java.io.IOException -> L72
            r6.append(r0)     // Catch: java.io.IOException -> L72
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L72
            boolean r6 = r5.startsWith(r6)     // Catch: java.io.IOException -> L72
            if (r6 == 0) goto L74
            java.lang.String[] r6 = r5.split(r0)     // Catch: java.io.IOException -> L72
            r7 = 1
            r6 = r6[r7]     // Catch: java.io.IOException -> L72
            int r6 = com.bytedance.pangle.util.vl.j(r6, r2)     // Catch: java.io.IOException -> L72
            if (r6 == r2) goto L74
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L72
            r0.<init>()     // Catch: java.io.IOException -> L72
            java.lang.String r1 = com.bytedance.pangle.g.r     // Catch: java.io.IOException -> L72
            r0.append(r1)     // Catch: java.io.IOException -> L72
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch: java.io.IOException -> L72
            r0.append(r5)     // Catch: java.io.IOException -> L72
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L72
            r8.mInternalPath = r0     // Catch: java.io.IOException -> L72
            r8.mInternalVersionCode = r6     // Catch: java.io.IOException -> L72
            return
        L72:
            r0 = move-exception
            goto L78
        L74:
            int r4 = r4 + 1
            goto L2f
        L77:
            return
        L78:
            java.lang.String r1 = "Zeus/install_pangle"
            java.lang.String r2 = "setupInternalPlugin failed."
            com.bytedance.pangle.log.ZeusLogger.w(r1, r2, r0)
            return
    }

    protected void deleteIfNeeded() {
            r2 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 == 0) goto L37
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r2.mPkgName
            boolean r0 = r0.g(r1)
            if (r0 == 0) goto L37
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r2.mPkgName
            r0.tl(r1)
            r2.deleteInstalledPlugin()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Plugin deleteIfNeeded "
            r0.<init>(r1)
            java.lang.String r1 = r2.mPkgName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
        L37:
            return
    }

    public int getApiVersionCode() {
            r1 = this;
            int r0 = r1.mApiVersionCode
            return r0
    }

    public int getInstalledMaxVer() {
            r7 = this;
            java.lang.String r0 = r7.mPackageDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = r7.mPkgName
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r0)
            r7.mPackageDir = r0
        L10:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r7.mPackageDir
            r0.<init>(r1)
            com.bytedance.pangle.plugin.Plugin$2 r1 = new com.bytedance.pangle.plugin.Plugin$2
            r1.<init>(r7)
            java.io.File[] r0 = r0.listFiles(r1)
            r1 = -1
            if (r0 == 0) goto L60
            int r2 = r0.length
            if (r2 <= 0) goto L60
            int r2 = r0.length
            r3 = 0
        L28:
            if (r3 >= r2) goto L60
            r4 = r0[r3]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "-"
            java.lang.String[] r4 = r4.split(r5)
            r5 = 1
            r4 = r4[r5]
            int r4 = java.lang.Integer.parseInt(r4)
            if (r4 <= r1) goto L5d
            com.bytedance.pangle.util.jy r5 = com.bytedance.pangle.util.jy.j()
            java.lang.String r6 = r7.mPkgName
            boolean r5 = r5.r(r6, r4)
            if (r5 == 0) goto L5d
            java.lang.String r5 = r7.mPkgName
            java.lang.String r5 = com.bytedance.pangle.up.cw.xt(r5, r4)
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L5d
            r1 = r4
        L5d:
            int r3 = r3 + 1
            goto L28
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Plugin getInstalledMaxVersion, pkg="
            r0.<init>(r2)
            java.lang.String r2 = r7.mPkgName
            r0.append(r2)
            java.lang.String r2 = ", maxVer="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r2, r0)
            return r1
    }

    public java.lang.String getInternalPath() {
            r1 = this;
            java.lang.String r0 = r1.mInternalPath
            return r0
    }

    public int getInternalVersionCode() {
            r1 = this;
            int r0 = r1.mInternalVersionCode
            return r0
    }

    public org.json.JSONObject getJsonConfig() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getLifeCycle() {
            r1 = this;
            r1.updateInstallStateFromMainProcess()
            int r0 = r1.mLifeCycle
            return r0
    }

    public java.lang.String getNativeLibraryDir() {
            r2 = this;
            int r0 = r2.mVersionCode
            if (r0 <= 0) goto Lb
            java.lang.String r1 = r2.mPkgName
            java.lang.String r0 = com.bytedance.pangle.up.cw.r(r1, r0)
            return r0
        Lb:
            java.lang.String r0 = r2.mPkgName
            java.lang.String r0 = com.bytedance.pangle.up.cw.j(r0)
            return r0
    }

    public int getVersion() {
            r1 = this;
            r1.updateInstallStateFromMainProcess()
            int r0 = r1.mVersionCode
            return r0
    }

    void init() {
            r5 = this;
            boolean r0 = r5.mInitialized
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r5.initializeLock
            monitor-enter(r0)
            boolean r1 = r5.mInitialized     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            goto L96
        L11:
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Le
            boolean r1 = com.bytedance.pangle.up.r.xt(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8b
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r5.mPkgName     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.xt(r2)     // Catch: java.lang.Throwable -> Le
            r2 = 0
            if (r1 == 0) goto L33
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r5.mPkgName     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.cw(r3)     // Catch: java.lang.Throwable -> Le
            goto L34
        L33:
            r1 = 0
        L34:
            r5.deleteIfNeeded()     // Catch: java.lang.Throwable -> Le
            int r3 = r5.getInstalledMaxVer()     // Catch: java.lang.Throwable -> Le
            int r4 = r5.mApiVersionCode     // Catch: java.lang.Throwable -> Le
            boolean r1 = r5.checkVersionValid(r3, r4, r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L4a
            int r2 = r5.modifyResIfNeed(r3)     // Catch: java.lang.Throwable -> Le
            r5.updateToInstalled(r2)     // Catch: java.lang.Throwable -> Le
        L4a:
            r5.deleteOtherExpiredVer(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "Zeus/init_pangle"
            java.lang.String r2 = "Plugin initPlugins result="
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Le
            com.bytedance.pangle.log.ZeusLogger.i(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r5.mPkgName     // Catch: java.lang.Throwable -> Le
            r1.j(r2)     // Catch: java.lang.Throwable -> Le
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r5.mPkgName     // Catch: java.lang.Throwable -> Le
            r1.r(r2)     // Catch: java.lang.Throwable -> Le
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r5.mPkgName     // Catch: java.lang.Throwable -> Le
            android.app.Application r3 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = com.bytedance.pangle.util.xt.j(r3)     // Catch: java.lang.Throwable -> Le
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> Le
            com.bytedance.pangle.util.jy r1 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r5.mPkgName     // Catch: java.lang.Throwable -> Le
            int r3 = r5.mApiVersionCode     // Catch: java.lang.Throwable -> Le
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> Le
            goto L8e
        L8b:
            r5.updateInstallStateFromMainProcess()     // Catch: java.lang.Throwable -> Le
        L8e:
            r1 = 1
            r5.mInitialized = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r5.installInternalPlugin()
            return
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public void injectResponse(java.lang.String r1) {
            r0 = this;
            r0.response = r1
            return
    }

    boolean install(java.io.File r9, com.bytedance.pangle.ae.j.up r10) {
            r8 = this;
            r0 = 0
            java.lang.String r1 = "Zeus/install_pangle"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = "Plugin install from local file "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L131
            r2.append(r9)     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch: java.lang.Throwable -> L131
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L131
            r2.append(r3)     // Catch: java.lang.Throwable -> L131
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L131
            com.bytedance.pangle.log.ZeusLogger.i(r1, r2)     // Catch: java.lang.Throwable -> L131
            java.lang.String r1 = r10.j     // Catch: java.lang.Throwable -> L131
            int r10 = r10.xt     // Catch: java.lang.Throwable -> L131
            java.lang.Object r2 = r8.installLock     // Catch: java.lang.Throwable -> L131
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = "Zeus/install_pangle"
            java.lang.String r4 = "Plugin synchronized begin, plugin="
            java.lang.String r5 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L88
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)     // Catch: java.lang.Throwable -> L88
            boolean r3 = r8.checkValid(r9, r1, r10)     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto L8b
            java.lang.String[] r4 = com.bytedance.pangle.util.cw.j(r9)     // Catch: java.lang.Throwable -> L88
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L88
            boolean r0 = com.bytedance.pangle.plugin.cw.j(r9, r1, r10)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L8b
            com.bytedance.pangle.util.jy r5 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = r8.mPkgName     // Catch: java.lang.Throwable -> L88
            r5.xt(r6, r4)     // Catch: java.lang.Throwable -> L88
            com.bytedance.pangle.util.jy r5 = com.bytedance.pangle.util.jy.j()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = r8.mPkgName     // Catch: java.lang.Throwable -> L88
            r7 = 1
            r5.xt(r6, r10, r7)     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = "Zeus/install_pangle"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = "Plugin markPluginInstalled, "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = r8.mPkgName     // Catch: java.lang.Throwable -> L88
            r6.append(r7)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = ":"
            r6.append(r7)     // Catch: java.lang.Throwable -> L88
            r6.append(r10)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = " identity="
            r6.append(r7)     // Catch: java.lang.Throwable -> L88
            r6.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L88
            com.bytedance.pangle.log.ZeusLogger.i(r5, r4)     // Catch: java.lang.Throwable -> L88
            com.bytedance.pangle.util.ae.j(r9)     // Catch: java.lang.Throwable -> L88
            goto L8b
        L88:
            r9 = move-exception
            goto L12f
        L8b:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto L10c
            int r3 = r8.mLifeCycle     // Catch: java.lang.Throwable -> Lb4
            r4 = 3
            if (r3 == r4) goto Lf0
            if (r0 == 0) goto Lb6
            r8.updateToInstalled(r10)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = "Plugin INSTALLED "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r10)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.pangle.log.ZeusLogger.i(r9, r10)     // Catch: java.lang.Throwable -> Lb4
            goto L12a
        Lb4:
            r9 = move-exception
            goto L12d
        Lb6:
            java.lang.String r3 = "Zeus/install_pangle"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "Plugin INSTALL_FAILED"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r10)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.pangle.util.ae.j(r9)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = "Plugin delete file by failedCount > 0 "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r10)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.pangle.log.ZeusLogger.w(r9, r10)     // Catch: java.lang.Throwable -> Lb4
            goto L12a
        Lf0:
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = "Plugin LIFE_LOADED, valid next restart "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r10)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.pangle.log.ZeusLogger.w(r9, r10)     // Catch: java.lang.Throwable -> Lb4
            goto L12a
        L10c:
            com.bytedance.pangle.util.ae.j(r9)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = "Zeus/install_pangle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = "Plugin deleting invalid "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r10)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.pangle.log.ZeusLogger.w(r9, r10)     // Catch: java.lang.Throwable -> Lb4
        L12a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            return r0
        L12d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb4
            throw r9     // Catch: java.lang.Throwable -> L88
        L12f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L131
        L131:
            r9 = move-exception
            java.lang.String r10 = "Zeus/install_pangle"
            java.lang.String r1 = "Plugin IMPOSSIBLE!!!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r10, r1, r9)
            return r0
    }

    public boolean isInstalled() {
            r2 = this;
            r2.updateInstallStateFromMainProcess()
            int r0 = r2.mLifeCycle
            r1 = 2
            if (r0 < r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean isIsDexPlugin() {
            r1 = this;
            boolean r0 = r1.mIsDexPlugin
            return r0
    }

    public boolean isLoaded() {
            r2 = this;
            int r0 = r2.mLifeCycle
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isLoading() {
            r2 = this;
            int r0 = r2.mLifeCycle
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isVersionInstalled(int r3) {
            r2 = this;
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r2.mPkgName
            boolean r3 = r0.r(r1, r3)
            return r3
    }

    public void setApiCompatVersion(int r3, int r4, int r5) {
            r2 = this;
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            java.lang.String r1 = r2.mPkgName
            r0.j(r1, r3, r4, r5)
            return
    }

    public void setLifeCycle(int r1) {
            r0 = this;
            r0.mLifeCycle = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Plugin{pkg="
            r0.<init>(r1)
            java.lang.String r1 = r2.mPkgName
            r0.append(r1)
            java.lang.String r1 = ", ver="
            r0.append(r1)
            int r1 = r2.mVersionCode
            r0.append(r1)
            java.lang.String r1 = ", life="
            r0.append(r1)
            int r1 = r2.mLifeCycle
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected void updateInstallStateFromMainProcess() {
            r3 = this;
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L27
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            int r0 = r3.mLifeCycle     // Catch: java.lang.Throwable -> L27
            r1 = 2
            if (r0 >= r1) goto L29
            com.bytedance.pangle.cw r0 = com.bytedance.pangle.servermanager.xt.j()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            java.lang.String r1 = r3.mPkgName     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.j(r1)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            java.lang.String r1 = r3.mPkgName     // Catch: java.lang.Throwable -> L27
            int r0 = r0.xt(r1)     // Catch: java.lang.Throwable -> L27
            r3.updateToInstalled(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r0 = move-exception
            goto L2a
        L29:
            return
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "updateInstallStateFromMainProcess error. process = "
            r1.<init>(r2)
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r2 = com.bytedance.pangle.up.r.j(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Zeus/ppm_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r2, r1, r0)
            return
    }

    protected void updateToInstalled(int r1) {
            r0 = this;
            r0.mVersionCode = r1
            r1 = 2
            r0.mLifeCycle = r1
            return
    }
}
