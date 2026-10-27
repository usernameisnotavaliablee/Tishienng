package com.bytedance.pangle.plugin;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PluginManager {
    private static final java.lang.String TAG = "PluginManager";
    private static volatile com.bytedance.pangle.plugin.PluginManager sInstance;
    private volatile boolean hasInstallFromDownloadDir;
    private volatile boolean mIsParsePluginConfig;
    private volatile java.util.Map<java.lang.String, com.bytedance.pangle.plugin.Plugin> mPlugins;
    private final com.bytedance.pangle.plugin.r pluginLoader;

    private PluginManager() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mPlugins = r0
            com.bytedance.pangle.plugin.r r0 = new com.bytedance.pangle.plugin.r
            r0.<init>()
            r1.pluginLoader = r0
            return
    }

    private void ensurePluginFileExist(com.bytedance.pangle.plugin.Plugin r3) {
            r2 = this;
            if (r3 == 0) goto L22
            boolean r0 = r3.isInstalled()
            if (r0 == 0) goto L22
            java.lang.String r0 = r3.mPkgName
            int r1 = r3.getVersion()
            java.lang.String r0 = com.bytedance.pangle.up.cw.xt(r0, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L22
            java.lang.String r3 = r3.mPkgName
            r2.unInstallPackage(r3)
        L22:
            return
    }

    public static com.bytedance.pangle.plugin.PluginManager getInstance() {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.sInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.pangle.plugin.PluginManager> r0 = com.bytedance.pangle.plugin.PluginManager.class
            monitor-enter(r0)
            com.bytedance.pangle.plugin.PluginManager r1 = com.bytedance.pangle.plugin.PluginManager.sInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.pangle.plugin.PluginManager r1 = new com.bytedance.pangle.plugin.PluginManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.pangle.plugin.PluginManager.sInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.sInstance
            return r0
    }

    private synchronized void parsePluginConfig() {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mIsParsePluginConfig     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return
        L7:
            java.lang.String r0 = "Zeus/init_pangle"
            java.lang.String r1 = "PluginManager parsePluginsJson"
            com.bytedance.pangle.log.ZeusLogger.v(r0, r1)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            r0.<init>()     // Catch: java.lang.Throwable -> L5a
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L170
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L170
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L170
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L170
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L170
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L170
            android.os.Bundle r1 = r1.metaData     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L170
            java.util.Set r2 = r1.keySet()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
        L35:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r3 == 0) goto L76
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r4 = com.bytedance.pangle.g.up     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r5 = "PANGLE_"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r5 == 0) goto L68
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r4 != 0) goto L60
            java.lang.String r4 = "ZEUS_PLUGIN_"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r4 == 0) goto L35
            goto L60
        L5a:
            r0 = move-exception
            goto L17a
        L5d:
            r0 = move-exception
            goto L167
        L60:
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r0.add(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            goto L35
        L68:
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r4 == 0) goto L35
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r0.add(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            goto L35
        L76:
            r1 = 1
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            r2.<init>()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
        L80:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            if (r3 == 0) goto Le4
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            java.lang.String r5 = "isDexPlugin"
            boolean r5 = r4.has(r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            if (r5 == 0) goto Lac
            java.lang.String r5 = "isDexPlugin"
            int r5 = r4.optInt(r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            if (r5 != r1) goto Lac
            com.bytedance.pangle.plugin.j r5 = new com.bytedance.pangle.plugin.j     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            goto Lb1
        La7:
            r0 = move-exception
            goto L15c
        Laa:
            r4 = move-exception
            goto Lcc
        Lac:
            com.bytedance.pangle.plugin.Plugin r5 = new com.bytedance.pangle.plugin.Plugin     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
        Lb1:
            java.lang.String r4 = r5.mPkgName     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            java.lang.String r4 = "Zeus/init_pangle"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            java.lang.String r7 = "PluginManager parsePluginsJson. find "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            java.lang.String r5 = r5.mPkgName     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            r6.append(r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            com.bytedance.pangle.log.ZeusLogger.i(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7 org.json.JSONException -> Laa
            goto L80
        Lcc:
            java.lang.String r5 = "Zeus/init_pangle"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r7 = "PluginManager parsePluginsJson failed. "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            r6.append(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            com.bytedance.pangle.log.ZeusLogger.errReport(r5, r3, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            goto L80
        Le4:
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.util.Map r0 = r0.up()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            if (r0 == 0) goto L152
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            if (r3 <= 0) goto L152
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
        Lfc:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            if (r3 == 0) goto L152
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            if (r4 != 0) goto Lfc
            if (r3 == 0) goto Lfc
            java.lang.String r4 = "isDexPlugin"
            boolean r4 = r3.has(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            if (r4 == 0) goto L132
            java.lang.String r4 = "isDexPlugin"
            int r4 = r3.optInt(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            if (r4 != r1) goto L132
            com.bytedance.pangle.plugin.j r4 = new com.bytedance.pangle.plugin.j     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            goto L137
        L132:
            com.bytedance.pangle.plugin.Plugin r4 = new com.bytedance.pangle.plugin.Plugin     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
        L137:
            java.lang.String r3 = r4.mPkgName     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r3 = "Zeus/init_pangle"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r6 = "PluginManager getPluginsJson. find "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r4 = r4.mPkgName     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            r5.append(r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            com.bytedance.pangle.log.ZeusLogger.i(r3, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            goto Lfc
        L152:
            r8.mPlugins = r2     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            java.lang.String r0 = "Zeus/init_pangle"
            java.lang.String r2 = "PluginManager parsePluginsJson success"
            com.bytedance.pangle.log.ZeusLogger.i(r0, r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> La7
            goto L163
        L15c:
            java.lang.String r2 = "Zeus/init_pangle"
            java.lang.String r3 = "PluginManager parsePluginsJson failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r2, r3, r0)     // Catch: java.lang.Throwable -> L5a
        L163:
            r8.mIsParsePluginConfig = r1     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r8)
            return
        L167:
            java.lang.String r1 = "Zeus/init_pangle"
            java.lang.String r2 = "PluginManager iterator metaData failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r0)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r8)
            return
        L170:
            r0 = move-exception
            java.lang.String r1 = "Zeus/init_pangle"
            java.lang.String r2 = "PluginManager parsePluginsJson failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r0)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r8)
            return
        L17a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            throw r0
    }

    public void asyncInstall(java.lang.String r4, java.io.File r5) {
            r3 = this;
            java.lang.String r0 = "Zeus/install_pangle"
            if (r5 == 0) goto L1a
            com.bytedance.pangle.plugin.xt r1 = new com.bytedance.pangle.plugin.xt
            r1.<init>(r4, r5)
            com.bytedance.pangle.up.up.xt(r1)
            java.lang.String r4 = "PluginManager asyncInstall, file="
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            com.bytedance.pangle.log.ZeusLogger.i(r0, r4)
            return
        L1a:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = "asyncInstall apk is null !"
            r2 = 0
            r5[r2] = r1
            r1 = 7
            com.bytedance.pangle.ZeusPluginStateListener.postStateChange(r4, r1, r5)
            java.lang.String r4 = "PluginManager asyncInstall apk is null !"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r4)
            return
    }

    public boolean checkPluginInstalled(java.lang.String r4) {
            r3 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r3.getPlugin(r4)
            r3.ensurePluginFileExist(r0)
            if (r0 == 0) goto L11
            boolean r0 = r0.isInstalled()
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PluginManager checkPluginInstalled, "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " = "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "Zeus/ppm_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r1, r4)
            return r0
    }

    public com.bytedance.pangle.plugin.Plugin getPlugin(java.lang.String r2) {
            r1 = this;
            r0 = 1
            com.bytedance.pangle.plugin.Plugin r2 = r1.getPlugin(r2, r0)
            return r2
    }

    public com.bytedance.pangle.plugin.Plugin getPlugin(java.lang.String r2, boolean r3) {
            r1 = this;
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            if (r0 != 0) goto L15
            boolean r0 = com.bytedance.pangle.util.xt.j()
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Please init Zeus first!"
            r2.<init>(r3)
            throw r2
        L15:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L1d
            r2 = 0
            return r2
        L1d:
            boolean r0 = r1.mIsParsePluginConfig
            if (r0 != 0) goto L24
            r1.parsePluginConfig()
        L24:
            java.util.Map<java.lang.String, com.bytedance.pangle.plugin.Plugin> r0 = r1.mPlugins
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.pangle.plugin.Plugin r2 = (com.bytedance.pangle.plugin.Plugin) r2
            if (r3 == 0) goto L33
            if (r2 == 0) goto L33
            r2.init()
        L33:
            return r2
    }

    public synchronized void installFromDownloadDir() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasInstallFromDownloadDir     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            java.lang.String r0 = "Zeus/init_pangle"
            java.lang.String r1 = "PluginManager zeus has been installFromDownloadDir!"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r0 = move-exception
            goto L27
        L10:
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Le
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L22
            com.bytedance.pangle.plugin.up r0 = new com.bytedance.pangle.plugin.up     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            com.bytedance.pangle.up.up.xt(r0)     // Catch: java.lang.Throwable -> Le
        L22:
            r0 = 1
            r2.hasInstallFromDownloadDir = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public boolean isLoaded(java.lang.String r1) {
            r0 = this;
            com.bytedance.pangle.plugin.Plugin r1 = r0.getPlugin(r1)
            if (r1 == 0) goto Le
            boolean r1 = r1.isLoaded()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public boolean loadPlugin(java.lang.String r4) {
            r3 = this;
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "start load plugin:"
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "zeus_stage_common"
            r0.saveRecord(r2, r1)
            com.bytedance.pangle.plugin.r r0 = r3.pluginLoader
            boolean r4 = r0.j(r4)
            return r4
    }

    public void setAllowDownloadPlugin(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PluginManager setAllowDownloadPlugin, "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Zeus/ppm_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r1, r0)
            com.bytedance.pangle.plugin.Plugin r0 = r2.getPlugin(r3)
            if (r0 == 0) goto L30
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            r5 = r5 ^ 1
            r0.j(r3, r4, r5)
        L30:
            return
    }

    public boolean syncInstall(java.lang.String r3, java.io.File r4) {
            r2 = this;
            java.lang.String r0 = "PluginManager syncInstall, file="
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "Zeus/install_pangle"
            com.bytedance.pangle.log.ZeusLogger.i(r1, r0)
            com.bytedance.pangle.plugin.xt r0 = new com.bytedance.pangle.plugin.xt
            r0.<init>(r3, r4)
            boolean r3 = r0.j()
            return r3
    }

    public void tryOfflineInternalPlugin(java.lang.String r4, int r5) {
            r3 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r3.getPlugin(r4)
            if (r0 == 0) goto L3e
            int r1 = r0.getInternalVersionCode()
            if (r1 != r5) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PluginManager offlineInternalPlugin, pkgName:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " pluginVer:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " apiVer:"
            r1.append(r5)
            int r5 = r0.getApiVersionCode()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "Zeus/ppm_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r1, r5)
            com.bytedance.pangle.util.jy r5 = com.bytedance.pangle.util.jy.j()
            int r0 = r0.getApiVersionCode()
            r5.up(r4, r0)
        L3e:
            return
    }

    public void unInstallPackage(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "PluginManager unInstallPackage, "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "Zeus/ppm_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r1, r0)
            com.bytedance.pangle.plugin.Plugin r0 = r2.getPlugin(r3)
            if (r0 == 0) goto L1c
            com.bytedance.pangle.util.jy r0 = com.bytedance.pangle.util.jy.j()
            r0.ae(r3)
        L1c:
            return
    }
}
