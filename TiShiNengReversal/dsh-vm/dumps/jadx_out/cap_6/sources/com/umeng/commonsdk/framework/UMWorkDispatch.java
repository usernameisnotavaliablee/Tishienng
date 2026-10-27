package com.umeng.commonsdk.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMWorkDispatch {
    public static final java.lang.String GENERAL_CONTENT = "content";
    public static final java.lang.String GENERAL_HEADER = "header";
    public static final java.lang.String KEY_EXCEPTION = "exception";
    private static final int MSG_AUTO_PROCESS = 769;
    private static final int MSG_CHECKER_TIMER = 771;
    private static final int MSG_DELAY_PROCESS = 770;
    private static final int MSG_QUIT = 784;
    private static final int MSG_SEND_EVENT = 768;
    private static android.os.HandlerThread mNetTask;
    private static com.umeng.commonsdk.framework.a mSender;
    private static java.lang.Object mSenderInitLock;
    private static android.os.Handler mTaskHandler;


    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.framework.UMWorkDispatch.mSenderInitLock = r0
            return
    }

    private UMWorkDispatch() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void Quit() {
            android.os.Handler r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler
            if (r0 == 0) goto L11
            android.os.Message r0 = r0.obtainMessage()
            r1 = 784(0x310, float:1.099E-42)
            r0.what = r1
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler
            r1.sendMessage(r0)
        L11:
            return
    }

    static /* synthetic */ void access$000(android.os.Message r0) {
            handleEvent(r0)
            return
    }

    static /* synthetic */ void access$100() {
            delayProcess()
            return
    }

    static /* synthetic */ void access$200() {
            handleQuit()
            return
    }

    private static void delayProcess() {
            java.lang.String r0 = "exception"
            java.lang.String r1 = "--->>> delayProcess Enter..."
            com.umeng.commonsdk.statistics.common.ULog.d(r1)
            java.lang.String r2 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r1)
            android.content.Context r1 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
            if (r1 == 0) goto L80
            boolean r3 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r1)
            if (r3 != 0) goto L19
            goto L80
        L19:
            long r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.maxDataSpace(r1)
            java.lang.String r5 = "analytics"
            com.umeng.commonsdk.framework.UMLogDataProtocol r5 = com.umeng.commonsdk.framework.UMModuleRegister.getCallbackFromModuleName(r5)
            if (r5 == 0) goto L33
            org.json.JSONObject r3 = r5.setupReportData(r3)     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L34
            java.lang.String r0 = "--->>> analyticsCB.setupReportData() return null"
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r0 = move-exception
            goto L7d
        L33:
            r3 = 0
        L34:
            if (r3 == 0) goto L80
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L31
            if (r4 <= 0) goto L80
            java.lang.String r4 = "header"
            java.lang.Object r4 = r3.opt(r4)     // Catch: java.lang.Throwable -> L31
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "content"
            java.lang.Object r3 = r3.opt(r6)     // Catch: java.lang.Throwable -> L31
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L80
            if (r3 == 0) goto L80
            org.json.JSONObject r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r1, r4, r3)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L80
            boolean r4 = r3.has(r0)     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r4.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "--->>> autoProcess: Build envelope error code: "
            r4.append(r6)     // Catch: java.lang.Throwable -> L74
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L74
            r4.append(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L74
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> L74
        L74:
            java.lang.String r0 = "--->>> autoProcess: removeCacheData ... "
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> L31
            r5.removeCacheData(r3)     // Catch: java.lang.Throwable -> L31
            goto L80
        L7d:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
        L80:
            return
    }

    public static synchronized boolean eventHasExist() {
            java.lang.Class<com.umeng.commonsdk.framework.UMWorkDispatch> r0 = com.umeng.commonsdk.framework.UMWorkDispatch.class
            monitor-enter(r0)
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto La
            monitor-exit(r0)
            r0 = 0
            return r0
        La:
            r2 = 771(0x303, float:1.08E-42)
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public static synchronized boolean eventHasExist(int r2) {
            java.lang.Class<com.umeng.commonsdk.framework.UMWorkDispatch> r0 = com.umeng.commonsdk.framework.UMWorkDispatch.class
            monitor-enter(r0)
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto La
            monitor-exit(r0)
            r2 = 0
            return r2
        La:
            boolean r2 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    private static void handleEvent(android.os.Message r4) {
            int r0 = r4.arg1
            java.lang.Object r4 = r4.obj
            java.lang.String r1 = com.umeng.commonsdk.framework.UMModuleRegister.eventType2ModuleName(r0)
            com.umeng.commonsdk.framework.UMLogDataProtocol r1 = com.umeng.commonsdk.framework.UMModuleRegister.getCallbackFromModuleName(r1)
            if (r1 == 0) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r0)
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.umeng.commonsdk.statistics.common.ULog.d(r2)
            r1.workEvent(r4, r0)
        L2e:
            return
    }

    private static void handleQuit() {
            com.umeng.commonsdk.framework.a r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mSender
            if (r0 == 0) goto L18
            android.os.HandlerThread r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask
            if (r0 == 0) goto L18
            com.umeng.commonsdk.framework.a.c()
            java.lang.String r0 = "--->>> handleQuit: Quit dispatch thread."
            com.umeng.commonsdk.statistics.common.ULog.d(r0)
            android.os.HandlerThread r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask
            r0.quit()
            teardown()
        L18:
            return
    }

    private static synchronized void init() {
            java.lang.Class<com.umeng.commonsdk.framework.UMWorkDispatch> r0 = com.umeng.commonsdk.framework.UMWorkDispatch.class
            monitor-enter(r0)
            java.lang.String r1 = "--->>> Dispatch: init Enter..."
            com.umeng.commonsdk.statistics.common.ULog.d(r1)     // Catch: java.lang.Throwable -> L39
            android.os.HandlerThread r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L32
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "work_thread"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask = r1     // Catch: java.lang.Throwable -> L2a
            r1.start()     // Catch: java.lang.Throwable -> L2a
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L32
            com.umeng.commonsdk.framework.UMWorkDispatch$1 r1 = new com.umeng.commonsdk.framework.UMWorkDispatch$1     // Catch: java.lang.Throwable -> L2a
            android.os.HandlerThread r2 = com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask     // Catch: java.lang.Throwable -> L2a
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler = r1     // Catch: java.lang.Throwable -> L2a
            goto L32
        L2a:
            r1 = move-exception
            android.content.Context r2 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()     // Catch: java.lang.Throwable -> L39
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r1)     // Catch: java.lang.Throwable -> L39
        L32:
            java.lang.String r1 = "--->>> Dispatch: init Exit..."
            com.umeng.commonsdk.statistics.common.ULog.d(r1)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            return
        L39:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    public static void registerConnStateObserver(com.umeng.commonsdk.framework.UMSenderStateNotify r1) {
            com.umeng.commonsdk.framework.a r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mSender
            if (r0 == 0) goto L7
            com.umeng.commonsdk.framework.a.a(r1)
        L7:
            return
    }

    public static synchronized void removeEvent() {
            java.lang.Class<com.umeng.commonsdk.framework.UMWorkDispatch> r0 = com.umeng.commonsdk.framework.UMWorkDispatch.class
            monitor-enter(r0)
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r2 = 771(0x303, float:1.08E-42)
            r1.removeMessages(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public static synchronized void removeEvent(int r2) {
            java.lang.Class<com.umeng.commonsdk.framework.UMWorkDispatch> r0 = com.umeng.commonsdk.framework.UMWorkDispatch.class
            monitor-enter(r0)
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1.removeMessages(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public static void sendDelayProcessMsg(long r3) {
            android.os.Handler r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler
            if (r0 == 0) goto L26
            r1 = 770(0x302, float:1.079E-42)
            boolean r0 = r0.hasMessages(r1)
            java.lang.String r2 = "MobclickRT"
            if (r0 == 0) goto L14
            java.lang.String r3 = "--->>> MSG_DELAY_PROCESS has exist. do nothing."
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r3)
            return
        L14:
            java.lang.String r0 = "--->>> MSG_DELAY_PROCESS not exist. send it."
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)
            android.os.Handler r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler
            android.os.Message r0 = r0.obtainMessage()
            r0.what = r1
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler
            r1.sendMessageDelayed(r0, r3)
        L26:
            return
    }

    public static void sendEvent(android.content.Context r7, int r8, com.umeng.commonsdk.framework.UMLogDataProtocol r9, java.lang.Object r10) {
            r1 = 768(0x300, float:1.076E-42)
            r5 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            sendEventInternal(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void sendEvent(android.content.Context r7, int r8, com.umeng.commonsdk.framework.UMLogDataProtocol r9, java.lang.Object r10, long r11) {
            r1 = 768(0x300, float:1.076E-42)
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            sendEventInternal(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void sendEventEx(android.content.Context r7, int r8, com.umeng.commonsdk.framework.UMLogDataProtocol r9, java.lang.Object r10, long r11) {
            r1 = 771(0x303, float:1.08E-42)
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            sendEventInternal(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void sendEventInternal(android.content.Context r2, int r3, int r4, com.umeng.commonsdk.framework.UMLogDataProtocol r5, java.lang.Object r6, long r7) {
            if (r2 == 0) goto L61
            if (r5 != 0) goto L5
            goto L61
        L5:
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.commonsdk.framework.UMModuleRegister.registerAppContext(r0)
            boolean r5 = com.umeng.commonsdk.framework.UMModuleRegister.registerCallback(r4, r5)
            if (r5 != 0) goto L17
            goto L57
        L17:
            android.os.HandlerThread r5 = com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask
            if (r5 == 0) goto L1f
            android.os.Handler r5 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler
            if (r5 != 0) goto L22
        L1f:
            init()
        L22:
            android.os.Handler r5 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L57
            boolean r5 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r2)     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L46
            java.lang.Object r5 = com.umeng.commonsdk.framework.UMWorkDispatch.mSenderInitLock     // Catch: java.lang.Throwable -> L58
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L58
            com.umeng.commonsdk.framework.a r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mSender     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L42
            com.umeng.commonsdk.framework.UMFrUtils.syncLegacyEnvelopeIfNeeded(r2)     // Catch: java.lang.Throwable -> L40
            com.umeng.commonsdk.framework.a r0 = new com.umeng.commonsdk.framework.a     // Catch: java.lang.Throwable -> L40
            android.os.Handler r1 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L40
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L40
            com.umeng.commonsdk.framework.UMWorkDispatch.mSender = r0     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r2 = move-exception
            goto L44
        L42:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
            goto L46
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L58
        L46:
            android.os.Handler r2 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L58
            android.os.Message r2 = r2.obtainMessage()     // Catch: java.lang.Throwable -> L58
            r2.what = r3     // Catch: java.lang.Throwable -> L58
            r2.arg1 = r4     // Catch: java.lang.Throwable -> L58
            r2.obj = r6     // Catch: java.lang.Throwable -> L58
            android.os.Handler r3 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler     // Catch: java.lang.Throwable -> L58
            r3.sendMessageDelayed(r2, r7)     // Catch: java.lang.Throwable -> L58
        L57:
            return
        L58:
            r2 = move-exception
            android.content.Context r3 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r2)
            return
        L61:
            java.lang.String r2 = "--->>> Context or UMLogDataProtocol parameter cannot be null!"
            com.umeng.commonsdk.statistics.common.ULog.d(r2)
            return
    }

    private static void teardown() {
            android.os.HandlerThread r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask
            r1 = 0
            if (r0 == 0) goto L7
            com.umeng.commonsdk.framework.UMWorkDispatch.mNetTask = r1
        L7:
            android.os.Handler r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler
            if (r0 == 0) goto Ld
            com.umeng.commonsdk.framework.UMWorkDispatch.mTaskHandler = r1
        Ld:
            com.umeng.commonsdk.framework.a r0 = com.umeng.commonsdk.framework.UMWorkDispatch.mSender
            if (r0 == 0) goto L13
            com.umeng.commonsdk.framework.UMWorkDispatch.mSender = r1
        L13:
            return
    }
}
