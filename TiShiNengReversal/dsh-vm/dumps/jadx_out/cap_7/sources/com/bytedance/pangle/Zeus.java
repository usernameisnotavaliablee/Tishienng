package com.bytedance.pangle;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Zeus {
    private static android.app.Application sApplication;
    private static final java.util.HashMap<java.lang.String, android.content.pm.ProviderInfo> serverManagerHashMap = null;
    static final java.lang.Object wait = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.Zeus.serverManagerHashMap = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.pangle.Zeus.wait = r0
            return
    }

    public Zeus() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addExternalAssetsForPlugin(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L24
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L24
        Ld:
            com.bytedance.pangle.plugin.Plugin r2 = getPlugin(r2)
            if (r2 == 0) goto L24
            android.content.res.Resources r2 = r2.mResources
            if (r2 == 0) goto L24
            android.content.res.AssetManager r2 = r2.getAssets()
            com.bytedance.pangle.res.j r0 = new com.bytedance.pangle.res.j
            r0.<init>()
            r1 = 0
            r0.j(r2, r3, r1)
        L24:
            return
    }

    public static void addPackageDexManager(java.lang.String r2, org.json.JSONObject r3) {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            java.util.Map r0 = r0.up()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L19
            if (r3 == 0) goto L19
            int r1 = r3.length()
            if (r1 <= 0) goto L19
            r0.put(r2, r3)
        L19:
            return
    }

    public static void addPluginEventCallback(com.bytedance.pangle.ZeusPluginEventCallback r1) {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            r0.j(r1)
            return
    }

    public static android.app.Application getAppApplication() {
            android.app.Application r0 = com.bytedance.pangle.Zeus.sApplication
            if (r0 != 0) goto L18
            com.bytedance.pangle.xt.j()
            java.lang.Object r0 = com.bytedance.pangle.up.j.j()
            java.lang.String r1 = "getApplication"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L18
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L18
            com.bytedance.pangle.Zeus.sApplication = r0     // Catch: java.lang.Throwable -> L18
        L18:
            android.app.Application r0 = com.bytedance.pangle.Zeus.sApplication
            return r0
    }

    public static java.lang.String getHostAbi() {
            java.lang.String r0 = com.bytedance.pangle.up.xt.j()
            return r0
    }

    public static int getHostAbiBit() {
            int r0 = com.bytedance.pangle.up.xt.xt()
            return r0
    }

    public static int getInstalledPluginVersion(java.lang.String r3) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r0 = r0.getPlugin(r3)
            if (r0 != 0) goto Lc
            r3 = -1
            return r3
        Lc:
            int r0 = r0.getVersion()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " getInstalledPluginVersion, "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " = "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "Zeus/download_pangle"
            com.bytedance.pangle.log.ZeusLogger.d(r1, r3)
            return r0
    }

    public static int getMaxInstallVer(java.lang.String r1) {
            android.app.Application r0 = getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 == 0) goto L13
            com.bytedance.pangle.plugin.Plugin r1 = getPlugin(r1)
            int r1 = r1.getInstalledMaxVer()
            return r1
        L13:
            r1 = -1
            return r1
    }

    public static com.bytedance.pangle.plugin.Plugin getPlugin(java.lang.String r1) {
            r0 = 1
            com.bytedance.pangle.plugin.Plugin r1 = getPlugin(r1, r0)
            return r1
    }

    public static com.bytedance.pangle.plugin.Plugin getPlugin(java.lang.String r1, boolean r2) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r1 = r0.getPlugin(r1, r2)
            return r1
    }

    public static java.util.HashMap<java.lang.String, android.content.pm.ProviderInfo> getServerManagerHashMap() {
            java.util.HashMap<java.lang.String, android.content.pm.ProviderInfo> r0 = com.bytedance.pangle.Zeus.serverManagerHashMap
            return r0
    }

    public static boolean hasInit() {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            boolean r0 = r0.xt()
            return r0
    }

    public static void hookHuaWeiVerifier(android.app.Application r0) {
            com.bytedance.pangle.receiver.j.j(r0)
            return
    }

    public static void init(android.app.Application r3) {
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "zeus_stage_common"
            java.lang.String r2 = "start init"
            r0.saveRecord(r1, r2)
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            r0.j(r3)
            java.lang.Object r3 = com.bytedance.pangle.Zeus.wait
            monitor-enter(r3)
            r3.notifyAll()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            com.bytedance.pangle.service.j.j r3 = com.bytedance.pangle.service.j.j.xt()
            r3.cw()
            return
        L25:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    public static void installFromDownloadDir() {
            android.app.Application r0 = getAppApplication()
            boolean r0 = com.bytedance.pangle.up.r.xt(r0)
            if (r0 == 0) goto L11
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            r0.installFromDownloadDir()
        L11:
            return
    }

    public static boolean isPluginInstalled(java.lang.String r1) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r1 = r0.getPlugin(r1)
            if (r1 == 0) goto L12
            boolean r1 = r1.isInstalled()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static boolean isPluginInstalled(java.lang.String r1, boolean r2) {
            com.bytedance.pangle.plugin.PluginManager r2 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            r0 = 0
            com.bytedance.pangle.plugin.Plugin r1 = r2.getPlugin(r1, r0)
            if (r1 == 0) goto L13
            boolean r1 = r1.isInstalled()
            if (r1 == 0) goto L13
            r1 = 1
            return r1
        L13:
            return r0
    }

    public static boolean isPluginLoaded(java.lang.String r1) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            boolean r1 = r0.isLoaded(r1)
            return r1
    }

    public static boolean loadPlugin(java.lang.String r1) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            boolean r1 = r0.loadPlugin(r1)
            return r1
    }

    public static void registerPluginInstallListener(com.bytedance.pangle.ZeusPluginInstallListener r3) {
            com.bytedance.pangle.cw r0 = com.bytedance.pangle.servermanager.xt.j()     // Catch: android.os.RemoteException -> L13
            if (r0 == 0) goto L12
            int r1 = r3.hashCode()     // Catch: android.os.RemoteException -> L13
            com.bytedance.pangle.ae.xt r2 = new com.bytedance.pangle.ae.xt     // Catch: android.os.RemoteException -> L13
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L13
            r0.j(r1, r2)     // Catch: android.os.RemoteException -> L13
        L12:
            return
        L13:
            r3 = move-exception
            java.lang.String r0 = "Zeus/install_pangle"
            java.lang.String r1 = "registerPluginInstallListener error."
            com.bytedance.pangle.log.ZeusLogger.w(r0, r1, r3)
            return
    }

    public static void registerPluginStateListener(com.bytedance.pangle.ZeusPluginStateListener r1) {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            r0.j(r1)
            return
    }

    public static void removePluginEventCallback(com.bytedance.pangle.ZeusPluginEventCallback r1) {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            r0.xt(r1)
            return
    }

    public static void setAllowDownloadPlugin(java.lang.String r1, int r2, boolean r3) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            r0.setAllowDownloadPlugin(r1, r2, r3)
            return
    }

    public static void setAppContext(android.app.Application r2) {
            if (r2 == 0) goto L1d
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "PluginApplicationWrapper"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "mOriginApplication"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r2, r0)     // Catch: java.lang.Throwable -> L1d
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L1d
            com.bytedance.pangle.Zeus.sApplication = r0     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            com.bytedance.pangle.Zeus.sApplication = r2
            return
    }

    public static void setDecodeCallback(com.bytedance.pangle.ZeusPluginDecodeCallback r1) {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            r0.j(r1)
            return
    }

    public static boolean syncInstallPlugin(java.lang.String r3, java.lang.String r4) {
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "zeus_stage_plugin_install"
            java.lang.String r2 = "start"
            r0.saveRecord(r1, r2)
            com.bytedance.pangle.cw r0 = com.bytedance.pangle.servermanager.xt.j()
            if (r0 == 0) goto L22
            boolean r3 = r0.j(r3, r4)     // Catch: android.os.RemoteException -> L1a
            return r3
        L1a:
            r3 = move-exception
            java.lang.String r4 = "Zeus/install_pangle"
            java.lang.String r0 = "syncInstallPlugin error."
            com.bytedance.pangle.log.ZeusLogger.w(r4, r0, r3)
        L22:
            r3 = 0
            return r3
    }

    public static void triggerBgDexOpt() {
            com.bytedance.pangle.m.m.j()
            return
    }

    public static void unInstallPlugin(java.lang.String r1) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            r0.unInstallPackage(r1)
            return
    }

    public static void unregisterPluginStateListener(com.bytedance.pangle.ZeusPluginStateListener r1) {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            r0.xt(r1)
            return
    }

    public static boolean waitInit(int r3) {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            boolean r0 = r0.xt()
            if (r0 == 0) goto Lc
            r3 = 1
            return r3
        Lc:
            java.lang.Object r0 = com.bytedance.pangle.Zeus.wait
            monitor-enter(r0)
            com.bytedance.pangle.oq r1 = com.bytedance.pangle.oq.j()     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.xt()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L26
            r1 = -1
            if (r3 != r1) goto L22
            r0.wait()     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L26
            goto L26
        L20:
            r3 = move-exception
            goto L30
        L22:
            long r1 = (long) r3     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L26
            r0.wait(r1)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L26
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            com.bytedance.pangle.oq r3 = com.bytedance.pangle.oq.j()
            boolean r3 = r3.xt()
            return r3
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public void unregisterPluginInstallListener(com.bytedance.pangle.ZeusPluginInstallListener r3) {
            r2 = this;
            com.bytedance.pangle.cw r0 = com.bytedance.pangle.servermanager.xt.j()     // Catch: android.os.RemoteException -> Le
            if (r0 == 0) goto L10
            int r3 = r3.hashCode()     // Catch: android.os.RemoteException -> Le
            r0.j(r3)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            goto L11
        L10:
            return
        L11:
            java.lang.String r0 = "Zeus/install_pangle"
            java.lang.String r1 = "unregisterPluginInstallListener error."
            com.bytedance.pangle.log.ZeusLogger.w(r0, r1, r3)
            return
    }
}
