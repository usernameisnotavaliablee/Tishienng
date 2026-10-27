package com.bytedance.android.openliveplugin;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LivePluginHelper {
    public static final java.lang.String LIVE_PLUGIN_PACKAGE_NAME = "com.byted.live.lite";
    public static final java.lang.String PLAYER_PLUGIN_PACKAGE_NAME = "com.byted.ttm.player";
    private static volatile boolean hasLiveInitFinish;
    private static java.lang.ref.WeakReference<android.app.Activity> hostActivity;
    private static com.bytedance.android.live.base.api.IOuterLiveService liveRoomService;
    private static final com.bytedance.android.live.base.api.ILiveInitCallback loadingLiveInitCallback = null;
    private static java.util.ArrayList<com.bytedance.android.live.base.api.ILiveInitCallback> mLiveInitListeners;
    private static boolean runInLiveProcess;
    public static final java.util.concurrent.ScheduledExecutorService sExecutor = null;
    private static com.bytedance.android.live.base.api.callback.EmptyCallback sInstallCallback;
    private static boolean stopAppLogOnEnterBackground;








    private static class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private final java.lang.ThreadGroup group;
        private final java.lang.String namePrefix;
        private final java.util.concurrent.atomic.AtomicInteger threadNumber;

        DefaultThreadFactory() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.threadNumber = r0
                java.lang.ThreadGroup r0 = new java.lang.ThreadGroup
                java.lang.String r1 = "tob_douyin_live_group"
                r0.<init>(r1)
                r2.group = r0
                java.lang.String r0 = "tob_douyin_live_thread_init"
                r2.namePrefix = r0
                return
        }

        DefaultThreadFactory(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.threadNumber = r0
                java.lang.ThreadGroup r0 = new java.lang.ThreadGroup
                java.lang.String r1 = "tob_douyin_live_group"
                r0.<init>(r1)
                r2.group = r0
                r2.namePrefix = r3
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r7) {
                r6 = this;
                com.bytedance.sdk.component.oq.r.cw r0 = new com.bytedance.sdk.component.oq.r.cw
                java.lang.ThreadGroup r1 = r6.group
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r6.namePrefix
                r2.append(r3)
                java.util.concurrent.atomic.AtomicInteger r3 = r6.threadNumber
                int r3 = r3.getAndIncrement()
                r2.append(r3)
                java.lang.String r3 = r2.toString()
                r4 = 0
                r2 = r7
                r0.<init>(r1, r2, r3, r4)
                boolean r7 = r0.isDaemon()
                if (r7 == 0) goto L2b
                r7 = 0
                r0.setDaemon(r7)
            L2b:
                int r7 = r0.getPriority()
                r1 = 10
                if (r7 == r1) goto L36
                r0.setPriority(r1)
            L36:
                return r0
        }
    }

    public static class LiveInitCallback implements com.bytedance.android.live.base.api.ILiveInitCallback {
        public static com.bytedance.android.openliveplugin.LivePluginHelper.LiveInitCallback INSTANCE;

        static {
                com.bytedance.android.openliveplugin.LivePluginHelper$LiveInitCallback r0 = new com.bytedance.android.openliveplugin.LivePluginHelper$LiveInitCallback
                r0.<init>()
                com.bytedance.android.openliveplugin.LivePluginHelper.LiveInitCallback.INSTANCE = r0
                return
        }

        private LiveInitCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.android.live.base.api.ILiveInitCallback
        public void onLiveInitFailed(java.lang.String r3) {
                r2 = this;
                java.util.ArrayList r0 = com.bytedance.android.openliveplugin.LivePluginHelper.access$200()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                com.bytedance.android.live.base.api.ILiveInitCallback r1 = (com.bytedance.android.live.base.api.ILiveInitCallback) r1
                if (r1 == 0) goto L8
                r1.onLiveInitFailed(r3)     // Catch: java.lang.Throwable -> L1a
                goto L8
            L1a:
                r1 = move-exception
                com.bytedance.sdk.openadsdk.api.m.j(r1)
                goto L8
            L1f:
                return
        }

        @Override // com.bytedance.android.live.base.api.ILiveInitCallback
        public void onLiveInitFinish() {
                r2 = this;
                com.bytedance.android.openliveplugin.LivePluginHelper.access$000()
                java.lang.String r0 = "live init : LiveInitCallbackWrapper onLiveInitFinish called."
                com.bytedance.android.openliveplugin.stub.logger.TTLogger.d(r0)
                com.bytedance.android.openliveplugin.LivePluginHelper.initLiveCommerce()
                r0 = 1
                com.bytedance.android.openliveplugin.LivePluginHelper.access$102(r0)
                java.util.ArrayList r0 = com.bytedance.android.openliveplugin.LivePluginHelper.access$200()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                com.bytedance.android.live.base.api.ILiveInitCallback r1 = (com.bytedance.android.live.base.api.ILiveInitCallback) r1
                if (r1 == 0) goto L17
                r1.onLiveInitFinish()     // Catch: java.lang.Throwable -> L29
                goto L17
            L29:
                r1 = move-exception
                com.bytedance.sdk.openadsdk.api.m.j(r1)
                goto L17
            L2e:
                return
        }
    }

    static {
            com.bytedance.android.openliveplugin.LivePluginHelper$DefaultThreadFactory r0 = new com.bytedance.android.openliveplugin.LivePluginHelper$DefaultThreadFactory
            r0.<init>()
            java.util.concurrent.ScheduledExecutorService r0 = com.bytedance.sdk.component.oq.cw.cw(r0)
            com.bytedance.android.openliveplugin.LivePluginHelper.sExecutor = r0
            r0 = 0
            com.bytedance.android.openliveplugin.LivePluginHelper.hasLiveInitFinish = r0
            com.bytedance.android.openliveplugin.LivePluginHelper.runInLiveProcess = r0
            com.bytedance.android.openliveplugin.LivePluginHelper.stopAppLogOnEnterBackground = r0
            r0 = 0
            com.bytedance.android.openliveplugin.LivePluginHelper.hostActivity = r0
            com.bytedance.android.openliveplugin.LivePluginHelper$6 r0 = new com.bytedance.android.openliveplugin.LivePluginHelper$6
            r0.<init>()
            com.bytedance.android.openliveplugin.LivePluginHelper.loadingLiveInitCallback = r0
            return
    }

    public LivePluginHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000() {
            logVersionInfo()
            return
    }

    static /* synthetic */ boolean access$102(boolean r0) {
            com.bytedance.android.openliveplugin.LivePluginHelper.hasLiveInitFinish = r0
            return r0
    }

    static /* synthetic */ java.util.ArrayList access$200() {
            java.util.ArrayList<com.bytedance.android.live.base.api.ILiveInitCallback> r0 = com.bytedance.android.openliveplugin.LivePluginHelper.mLiveInitListeners
            return r0
    }

    static /* synthetic */ void access$300(android.app.Application r0, java.lang.String r1, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r2, com.bytedance.android.live.base.api.ILiveInitCallback r3, boolean r4) {
            realInitLivePlugin(r0, r1, r2, r3, r4)
            return
    }

    static /* synthetic */ boolean access$400(java.lang.Runnable r0) {
            boolean r0 = prepare(r0)
            return r0
    }

    static /* synthetic */ com.bytedance.android.live.base.api.callback.EmptyCallback access$500() {
            com.bytedance.android.live.base.api.callback.EmptyCallback r0 = com.bytedance.android.openliveplugin.LivePluginHelper.sInstallCallback
            return r0
    }

    static /* synthetic */ java.lang.ref.WeakReference access$600() {
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.bytedance.android.openliveplugin.LivePluginHelper.hostActivity
            return r0
    }

    static /* synthetic */ com.bytedance.android.live.base.api.IOuterLiveService access$700() {
            com.bytedance.android.live.base.api.IOuterLiveService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService
            return r0
    }

    private static void adaptEventBus() {
            java.lang.String r0 = "com.byted.live.lite"
            java.lang.ClassLoader r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r0)
            java.lang.String r1 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getZeusActivityString()
            java.lang.String r2 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getZeusWrapperString()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "com.bytedance.android.openlive.OpenLiveBackdoor"
            java.lang.String r2 = "tryAdaptEventBus"
            com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r1, r2, r0, r3)
            return
    }

    public static void addCustomTag(java.lang.String r0, java.lang.String r1) {
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.addCustomTag(r0, r1)
            return
    }

    public static void addInitListener(com.bytedance.android.live.base.api.ILiveInitCallback r1) {
            java.util.ArrayList<com.bytedance.android.live.base.api.ILiveInitCallback> r0 = com.bytedance.android.openliveplugin.LivePluginHelper.mLiveInitListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.android.openliveplugin.LivePluginHelper.mLiveInitListeners = r0
        Lb:
            com.bytedance.android.openliveplugin.LivePluginHelper$LiveInitCallback r0 = com.bytedance.android.openliveplugin.LivePluginHelper.LiveInitCallback.INSTANCE
            if (r1 != r0) goto L10
            goto L20
        L10:
            java.util.ArrayList<com.bytedance.android.live.base.api.ILiveInitCallback> r0 = com.bytedance.android.openliveplugin.LivePluginHelper.mLiveInitListeners
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L19
            goto L20
        L19:
            if (r1 == 0) goto L20
            java.util.ArrayList<com.bytedance.android.live.base.api.ILiveInitCallback> r0 = com.bytedance.android.openliveplugin.LivePluginHelper.mLiveInitListeners
            r0.add(r1)
        L20:
            return
    }

    public static void enterCommerceOrderList(android.app.Activity r2) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            com.bytedance.android.openliveplugin.LivePluginHelper.hostActivity = r0
            boolean r2 = isLiveInited()
            if (r2 == 0) goto L11
            trulyEnterCommerceOrderList()
            return
        L11:
            com.bytedance.android.openliveplugin.LivePluginHelper$5 r2 = new com.bytedance.android.openliveplugin.LivePluginHelper$5
            r2.<init>()
            java.lang.String r0 = "com.byted.live.lite"
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.registerZeusPluginLoadStateListener(r0, r2)
            com.bytedance.android.live.base.api.ILiveInitCallback r2 = com.bytedance.android.openliveplugin.LivePluginHelper.loadingLiveInitCallback
            addInitListener(r2)
            java.lang.ref.WeakReference<android.app.Activity> r2 = com.bytedance.android.openliveplugin.LivePluginHelper.hostActivity
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            com.bytedance.android.openliveplugin.LiveLoadingDialog.show(r2)
            com.bytedance.android.live.base.api.IOuterLiveService r2 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService
            if (r2 != 0) goto L32
            getLiveRoomService()
        L32:
            com.bytedance.android.live.base.api.IOuterLiveService r2 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService
            if (r2 == 0) goto L3e
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "initSDKCoreLogic"
            r2.callExpandMethod(r1, r0)
        L3e:
            return
    }

    public static boolean getApmEnable() {
            boolean r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getApmEnable()
            return r0
    }

    public static java.lang.String getLiveArgsJsonStr() {
            java.lang.String r0 = "com.byted.live.lite"
            java.lang.ClassLoader r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r0)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "com.bytedance.android.openlive.OpenLiveBackdoor"
            java.lang.String r3 = "getLiveArgsJsonStr"
            java.lang.Object r0 = com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r2, r3, r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static com.bytedance.android.live.base.api.IOuterLiveService getLiveRoomService() {
            com.bytedance.android.live.base.api.IOuterLiveService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService
            if (r0 != 0) goto La
            com.bytedance.android.live.base.api.IOuterLiveService r0 = com.bytedance.android.openliveplugin.LiveReflectFacade.getOuterLiveService()
            com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService = r0
        La:
            com.bytedance.android.live.base.api.IOuterLiveService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService
            return r0
    }

    public static boolean getStopAppLogOnEnterBackground() {
            boolean r0 = com.bytedance.android.openliveplugin.LivePluginHelper.stopAppLogOnEnterBackground
            return r0
    }

    public static void init(android.app.Application r1, java.lang.String r2, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r3, com.bytedance.android.live.base.api.ILiveInitCallback r4) {
            r0 = 1
            init(r1, r2, r3, r4, r0)
            return
    }

    public static void init(android.app.Application r6, java.lang.String r7, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r8, com.bytedance.android.live.base.api.ILiveInitCallback r9, boolean r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            init(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void init(android.app.Application r2, java.lang.String r3, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r4, com.bytedance.android.live.base.api.ILiveInitCallback r5, boolean r6, boolean r7) {
            boolean r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.hasInitZeus
            java.lang.String r1 = "com.byted.live.lite"
            if (r0 != 0) goto La
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.initZeus(r2, r6, r1)
            goto Lf
        La:
            if (r6 == 0) goto Lf
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.fetchPlugin(r1)
        Lf:
            initLive(r2, r3, r4, r5, r7)
            return
    }

    public static void initLive(android.app.Application r7, java.lang.String r8, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r9, com.bytedance.android.live.base.api.ILiveInitCallback r10, boolean r11) {
            com.bytedance.android.openliveplugin.LivePluginHelper.runInLiveProcess = r11
            java.util.concurrent.ScheduledExecutorService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.sExecutor
            com.bytedance.android.openliveplugin.LivePluginHelper$2 r1 = new com.bytedance.android.openliveplugin.LivePluginHelper$2
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    public static void initLiveCommerce() {
            adaptEventBus()     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = "com.bytedance.android.ecom.live.adapter.ECLiveAdapter"
            java.lang.String r1 = "init"
            java.lang.String r2 = "com.byted.live.lite"
            java.lang.ClassLoader r2 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r2)     // Catch: java.lang.Exception -> L14
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L14
            com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L14
            return
        L14:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            return
    }

    public static boolean isLiveInited() {
            boolean r0 = com.bytedance.android.openliveplugin.LivePluginHelper.hasLiveInitFinish
            return r0
    }

    public static boolean isRunInLiveProcess() {
            boolean r0 = com.bytedance.android.openliveplugin.LivePluginHelper.runInLiveProcess
            return r0
    }

    public static void logEventV3(java.lang.String r3, org.json.JSONObject r4) {
            java.lang.String r0 = "com.byted.live.lite"
            java.lang.ClassLoader r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "com.bytedance.android.openlive.OpenLiveBackdoor"
            java.lang.String r4 = "onEventV3"
            com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r3, r4, r0, r1)
            return
    }

    private static void logVersionInfo() {
            java.lang.String r0 = "2.1.1.4-tob-tob-61440787"
            java.lang.String r1 = "com.byted.live.lite"
            java.lang.ClassLoader r1 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r1)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "com.bytedance.android.openlive.plugin.LivePluginApplication"
            java.lang.String r4 = "getPluginVersion"
            java.lang.Object r1 = com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r3, r4, r1, r2)
            if (r1 != 0) goto L16
            return
        L16:
            android.util.Pair r1 = (android.util.Pair) r1     // Catch: java.lang.Throwable -> L50
            java.lang.Object r2 = r1.first     // Catch: java.lang.Throwable -> L50
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L50
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r1.second     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "live init"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "version_info: lib_version_name="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L50
            r5.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "; sdkApiVersionName="
            r5.append(r6)     // Catch: java.lang.Throwable -> L50
            r5.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "; pluginVersionCode="
            r5.append(r0)     // Catch: java.lang.Throwable -> L50
            r5.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "; pluginVersionName="
            r5.append(r0)     // Catch: java.lang.Throwable -> L50
            r5.append(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L50
            com.bytedance.sdk.openadsdk.api.m.cw(r4, r0)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            return
    }

    private static boolean prepare(java.lang.Runnable r2) {
            java.lang.String r0 = "live init : prepare ---- "
            com.bytedance.android.openliveplugin.stub.logger.TTLogger.d(r0)
            com.bytedance.android.openliveplugin.LivePluginHelper$4 r0 = new com.bytedance.android.openliveplugin.LivePluginHelper$4
            r0.<init>()
            java.lang.String r1 = "com.byted.live.lite"
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.registerZeusPluginLoadStateListener(r1, r0)
            boolean r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.isPluginInstalled(r1)
            if (r0 == 0) goto L1c
            com.bytedance.android.live.base.api.callback.EmptyCallback r0 = com.bytedance.android.openliveplugin.LivePluginHelper.sInstallCallback
            if (r0 == 0) goto L1c
            r0.invoke()
        L1c:
            boolean r2 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.checkPluginState(r2, r1)
            return r2
    }

    private static void preparePlayer(java.lang.Runnable r1) {
            com.bytedance.android.openliveplugin.LivePluginHelper$3 r0 = new com.bytedance.android.openliveplugin.LivePluginHelper$3
            r0.<init>(r1)
            java.lang.String r1 = "com.byted.ttm.player"
            boolean r1 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.checkPluginState(r0, r1)
            if (r1 != 0) goto Le
            return
        Le:
            r0.run()
            return
    }

    private static void realInitLivePlugin(android.app.Application r7, java.lang.String r8, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r9, com.bytedance.android.live.base.api.ILiveInitCallback r10, boolean r11) {
            java.util.concurrent.ScheduledExecutorService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.sExecutor
            com.bytedance.android.openliveplugin.LivePluginHelper$1 r1 = new com.bytedance.android.openliveplugin.LivePluginHelper$1
            r4 = r7
            r5 = r8
            r3 = r9
            r2 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    public static void setApmEnable(boolean r0) {
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.setApmEnable(r0)
            return
    }

    public static void setBoeValue(java.lang.String r3) {
            java.lang.String r0 = "com.byted.live.lite"
            java.lang.ClassLoader r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "com.bytedance.android.openlive.OpenLiveBackdoor"
            java.lang.String r2 = "setBoeValue"
            com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r3, r2, r0, r1)
            return
    }

    public static void setHostVersionCodeTag(long r0) {
            com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.setHostVersionCodeTag(r0)
            return
    }

    public static void setInstallCallback(com.bytedance.android.live.base.api.callback.EmptyCallback r0) {
            com.bytedance.android.openliveplugin.LivePluginHelper.sInstallCallback = r0
            return
    }

    public static void setPpeValue(java.lang.String r3) {
            java.lang.String r0 = "com.byted.live.lite"
            java.lang.ClassLoader r0 = com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils.getPluginClassloader(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "com.bytedance.android.openlive.OpenLiveBackdoor"
            java.lang.String r2 = "setPpeValue"
            com.bytedance.android.live.base.api.JavaCallsUtils.callStaticMethodWithClassLoader(r3, r2, r0, r1)
            return
    }

    public static void setStopAppLogOnEnterBackground(boolean r0) {
            com.bytedance.android.openliveplugin.LivePluginHelper.stopAppLogOnEnterBackground = r0
            return
    }

    public static void trulyEnterCommerceOrderList() {
            java.lang.String r0 = "trulyEnterCommerceOrderList start"
            com.bytedance.android.openliveplugin.stub.logger.TTLogger.d(r0)
            com.bytedance.android.live.base.api.IOuterLiveService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService
            if (r0 != 0) goto Lc
            getLiveRoomService()
        Lc:
            com.bytedance.android.live.base.api.IOuterLiveService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService
            if (r0 != 0) goto L11
            return
        L11:
            java.lang.String r0 = "callExpandMethod enterCommercePage"
            com.bytedance.android.openliveplugin.stub.logger.TTLogger.d(r0)     // Catch: org.json.JSONException -> L42
            com.bytedance.android.live.base.api.IOuterLiveService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.liveRoomService     // Catch: org.json.JSONException -> L42
            java.lang.String r1 = "enterCommercePage"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L42
            r2.<init>()     // Catch: org.json.JSONException -> L42
            java.lang.String r3 = "request_page"
            java.lang.String r4 = "order_list"
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch: org.json.JSONException -> L42
            com.bytedance.android.openliveplugin.LivePluginHelper$7 r3 = new com.bytedance.android.openliveplugin.LivePluginHelper$7     // Catch: org.json.JSONException -> L42
            r3.<init>()     // Catch: org.json.JSONException -> L42
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: org.json.JSONException -> L42
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: org.json.JSONException -> L42
            r6 = 0
            r5[r6] = r2     // Catch: org.json.JSONException -> L42
            r2 = 1
            r5[r2] = r3     // Catch: org.json.JSONException -> L42
            r2 = 2
            r5[r2] = r4     // Catch: org.json.JSONException -> L42
            r0.callExpandMethod(r1, r5)     // Catch: org.json.JSONException -> L42
            return
        L42:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
            return
    }
}
