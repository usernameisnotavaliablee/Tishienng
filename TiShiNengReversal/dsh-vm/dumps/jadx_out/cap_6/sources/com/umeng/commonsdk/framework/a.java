package com.umeng.commonsdk.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback {
    private static android.os.HandlerThread a = null;
    private static android.os.Handler b = null;
    private static android.os.Handler c = null;
    private static final int d = 200;
    private static final int e = 273;
    private static final int f = 274;
    private static final int g = 512;
    private static final int h = 769;
    private static com.umeng.commonsdk.framework.a.FileObserverC0048a i = null;
    private static android.net.ConnectivityManager j = null;
    private static android.content.IntentFilter k = null;
    private static volatile boolean l = false;
    private static java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> m = null;
    private static java.lang.Object n = null;
    private static java.util.concurrent.locks.ReentrantLock o = null;
    private static final java.lang.String p = "report_policy";

    /* renamed from: q, reason: collision with root package name */
    private static final java.lang.String f36q = "report_interval";
    private static boolean r = false;
    private static final int s = 15;
    private static final int t = 3;
    private static final int u = 90;
    private static int v;
    private static java.lang.Object w;
    private static android.content.BroadcastReceiver x;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.framework.a$a, reason: collision with other inner class name */
    static class FileObserverC0048a extends android.os.FileObserver {
        public FileObserverC0048a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.FileObserver
        public void onEvent(int r2, java.lang.String r3) {
                r1 = this;
                r0 = 8
                r2 = r2 & r0
                if (r2 == r0) goto L6
                return
            L6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "--->>> envelope file created >>> "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.umeng.commonsdk.statistics.common.ULog.d(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MobclickRT"
                com.umeng.commonsdk.debug.UMRTLog.i(r3, r2)
                r2 = 273(0x111, float:3.83E-43)
                com.umeng.commonsdk.framework.a.a(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.framework.a.n = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            com.umeng.commonsdk.framework.a.o = r0
            r0 = 0
            com.umeng.commonsdk.framework.a.r = r0
            r0 = 15
            com.umeng.commonsdk.framework.a.v = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.framework.a.w = r0
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            if (r0 == 0) goto L2c
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            com.umeng.commonsdk.framework.a.j = r0
        L2c:
            com.umeng.commonsdk.framework.a$2 r0 = new com.umeng.commonsdk.framework.a$2
            r0.<init>()
            com.umeng.commonsdk.framework.a.x = r0
            return
    }

    public a(android.content.Context r3, android.os.Handler r4) {
            r2 = this;
            r2.<init>()
            android.net.ConnectivityManager r0 = com.umeng.commonsdk.framework.a.j
            if (r0 != 0) goto L19
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            android.net.ConnectivityManager r1 = com.umeng.commonsdk.framework.a.j
            if (r1 == 0) goto L19
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            com.umeng.commonsdk.framework.a.j = r0
        L19:
            com.umeng.commonsdk.framework.a.c = r4
            android.os.HandlerThread r4 = com.umeng.commonsdk.framework.a.a     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L6b
            android.os.HandlerThread r4 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "NetWorkSender"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L43
            com.umeng.commonsdk.framework.a.a = r4     // Catch: java.lang.Throwable -> L43
            r4.start()     // Catch: java.lang.Throwable -> L43
            com.umeng.commonsdk.framework.a$a r4 = com.umeng.commonsdk.framework.a.i     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L45
            com.umeng.commonsdk.framework.a$a r4 = new com.umeng.commonsdk.framework.a$a     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getEnvelopeDirPath(r3)     // Catch: java.lang.Throwable -> L43
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L43
            com.umeng.commonsdk.framework.a.i = r4     // Catch: java.lang.Throwable -> L43
            r4.startWatching()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "--->>> FileMonitor has already started!"
            com.umeng.commonsdk.statistics.common.ULog.d(r4)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r4 = move-exception
            goto L6c
        L45:
            r2.j()     // Catch: java.lang.Throwable -> L43
            android.os.Handler r4 = com.umeng.commonsdk.framework.a.b     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L59
            com.umeng.commonsdk.framework.a$3 r4 = new com.umeng.commonsdk.framework.a$3     // Catch: java.lang.Throwable -> L43
            android.os.HandlerThread r0 = com.umeng.commonsdk.framework.a.a     // Catch: java.lang.Throwable -> L43
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L43
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L43
            com.umeng.commonsdk.framework.a.b = r4     // Catch: java.lang.Throwable -> L43
        L59:
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r4 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "report_policy"
            r4.registImprintCallback(r0, r2)     // Catch: java.lang.Throwable -> L43
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r4 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "report_interval"
            r4.registImprintCallback(r0, r2)     // Catch: java.lang.Throwable -> L43
        L6b:
            return
        L6c:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r4)
            return
    }

    static /* synthetic */ void a(int r0) {
            c(r0)
            return
    }

    private static void a(int r3, int r4) {
            boolean r0 = com.umeng.commonsdk.framework.a.l
            if (r0 == 0) goto L19
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.b
            if (r0 == 0) goto L19
            r0.removeMessages(r3)
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.b
            android.os.Message r0 = r0.obtainMessage()
            r0.what = r3
            android.os.Handler r3 = com.umeng.commonsdk.framework.a.b
            long r1 = (long) r4
            r3.sendMessageDelayed(r0, r1)
        L19:
            return
    }

    private static void a(int r2, long r3) {
            boolean r0 = com.umeng.commonsdk.framework.a.l
            if (r0 == 0) goto L29
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.b
            if (r0 == 0) goto L29
            android.os.Message r0 = r0.obtainMessage()
            r0.what = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "--->>> sendMsgDelayed: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)
            android.os.Handler r2 = com.umeng.commonsdk.framework.a.b
            r2.sendMessageDelayed(r0, r3)
        L29:
            return
    }

    public static void a(android.content.Context r2) {
            android.net.ConnectivityManager r0 = com.umeng.commonsdk.framework.a.j
            if (r0 != 0) goto L1c
            if (r2 == 0) goto L1c
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            com.umeng.commonsdk.framework.a.j = r0
            if (r0 == 0) goto L1c
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>> createCMIfNeeded:注册网络状态监听器。"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            b(r2)
        L1c:
            return
    }

    public static void a(com.umeng.commonsdk.framework.UMSenderStateNotify r3) {
            java.lang.Object r0 = com.umeng.commonsdk.framework.a.n
            monitor-enter(r0)
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r1 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.umeng.commonsdk.framework.a.m = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L38
        L11:
            if (r3 == 0) goto L3f
            r1 = 0
        L14:
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r2 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> Lf
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lf
            if (r1 >= r2) goto L32
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r2 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> Lf
            if (r3 != r2) goto L2f
            java.lang.String r3 = "MobclickRT"
            java.lang.String r1 = "--->>> addConnStateObserver: input item has exist."
            com.umeng.commonsdk.debug.UMRTLog.i(r3, r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r3 = move-exception
            goto L41
        L2f:
            int r1 = r1 + 1
            goto L14
        L32:
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r1 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> Lf
            r1.add(r3)     // Catch: java.lang.Throwable -> Lf
            goto L3f
        L38:
            android.content.Context r1 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()     // Catch: java.lang.Throwable -> L2d
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r3)     // Catch: java.lang.Throwable -> L2d
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r3
    }

    public static void a(boolean r3) {
            com.umeng.commonsdk.framework.a.l = r3
            r0 = 0
            if (r3 == 0) goto L32
            java.lang.Object r3 = com.umeng.commonsdk.framework.a.n
            monitor-enter(r3)
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r1 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            if (r1 <= 0) goto L24
        L12:
            if (r0 >= r1) goto L24
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r2 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L22
            com.umeng.commonsdk.framework.UMSenderStateNotify r2 = (com.umeng.commonsdk.framework.UMSenderStateNotify) r2     // Catch: java.lang.Throwable -> L22
            r2.onConnectionAvailable()     // Catch: java.lang.Throwable -> L22
            int r0 = r0 + 1
            goto L12
        L22:
            r0 = move-exception
            goto L30
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "MobclickRT"
            java.lang.String r0 = "网络状态通知：尝试发送 MSG_PROCESS_NEXT"
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r0)
            d()
            return
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
        L32:
            java.lang.String r3 = "--->>> network disconnected."
            com.umeng.commonsdk.statistics.common.ULog.i(r3)
            com.umeng.commonsdk.framework.a.l = r0
            return
    }

    public static boolean a() {
            java.lang.Object r0 = com.umeng.commonsdk.framework.a.w
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.framework.a.r     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static int b() {
            java.lang.Object r0 = com.umeng.commonsdk.framework.a.w
            monitor-enter(r0)
            int r1 = com.umeng.commonsdk.framework.a.v     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static void b(int r1) {
            boolean r0 = com.umeng.commonsdk.framework.a.l
            if (r0 == 0) goto L1b
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.b
            if (r0 == 0) goto L1b
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L1b
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.b
            android.os.Message r0 = r0.obtainMessage()
            r0.what = r1
            android.os.Handler r1 = com.umeng.commonsdk.framework.a.b
            r1.sendMessage(r0)
        L1b:
            return
    }

    @android.annotation.SuppressLint({"NewApi", "MissingPermission"})
    public static void b(android.content.Context r5) {
            java.lang.String r0 = "MobclickRT"
            if (r5 != 0) goto La
            java.lang.String r5 = "--->>> registerNetReceiver: context is null, registerNetReceiver failed."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r5)
            return
        La:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.String r3 = "--->>> ACCESS_NETWORK_STATE permission access denied."
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            if (r1 < r2) goto L4d
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(r5, r4)
            if (r1 == 0) goto L49
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r2 = 0
            android.net.NetworkRequest$Builder r1 = r1.addTransportType(r2)
            r2 = 1
            android.net.NetworkRequest$Builder r1 = r1.addTransportType(r2)
            android.net.NetworkRequest r1 = r1.build()
            android.net.ConnectivityManager r2 = com.umeng.commonsdk.framework.a.j
            if (r2 == 0) goto L77
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            java.lang.String r2 = "--->>> 注册网络状态监听器:registerNetworkCallback"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r2)
            android.net.ConnectivityManager r0 = com.umeng.commonsdk.framework.a.j
            com.umeng.commonsdk.framework.a$1 r2 = new com.umeng.commonsdk.framework.a$1
            r2.<init>(r5)
            r0.registerNetworkCallback(r1, r2)
            return
        L49:
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r3)
            return
        L4d:
            boolean r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(r5, r4)
            if (r1 == 0) goto L78
            android.net.ConnectivityManager r1 = com.umeng.commonsdk.framework.a.j
            if (r1 == 0) goto L77
            android.content.IntentFilter r1 = com.umeng.commonsdk.framework.a.k
            if (r1 != 0) goto L77
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            com.umeng.commonsdk.framework.a.k = r1
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.addAction(r2)
            android.content.BroadcastReceiver r1 = com.umeng.commonsdk.framework.a.x
            if (r1 == 0) goto L77
            java.lang.String r1 = "--->>> 注册网络状态监听器:registerReceiver"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            android.content.BroadcastReceiver r0 = com.umeng.commonsdk.framework.a.x
            android.content.IntentFilter r1 = com.umeng.commonsdk.framework.a.k
            r5.registerReceiver(r0, r1)
        L77:
            return
        L78:
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r3)
            return
    }

    public static void c() {
            return
    }

    private static void c(int r1) {
            boolean r0 = com.umeng.commonsdk.framework.a.l
            if (r0 == 0) goto L13
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.b
            if (r0 == 0) goto L13
            android.os.Message r0 = r0.obtainMessage()
            r0.what = r1
            android.os.Handler r1 = com.umeng.commonsdk.framework.a.b
            r1.sendMessage(r0)
        L13:
            return
    }

    public static void d() {
            java.util.concurrent.locks.ReentrantLock r0 = com.umeng.commonsdk.framework.a.o
            boolean r0 = r0.tryLock()
            if (r0 == 0) goto L1a
            r0 = 273(0x111, float:3.83E-43)
            b(r0)     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.locks.ReentrantLock r0 = com.umeng.commonsdk.framework.a.o
            r0.unlock()
            return
        L13:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = com.umeng.commonsdk.framework.a.o
            r1.unlock()
            throw r0
        L1a:
            return
    }

    public static void e() {
            r0 = 274(0x112, float:3.84E-43)
            r1 = 3000(0xbb8, float:4.204E-42)
            a(r0, r1)
            return
    }

    static /* synthetic */ java.util.concurrent.locks.ReentrantLock f() {
            java.util.concurrent.locks.ReentrantLock r0 = com.umeng.commonsdk.framework.a.o
            return r0
    }

    static /* synthetic */ void g() {
            n()
            return
    }

    static /* synthetic */ void h() {
            m()
            return
    }

    static /* synthetic */ void i() {
            l()
            return
    }

    private void j() {
            r6 = this;
            java.lang.Object r0 = com.umeng.commonsdk.framework.a.w
            monitor-enter(r0)
            android.content.Context r1 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "report_policy"
            java.lang.String r3 = ""
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r2, r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "11"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L61
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> switch to report_policy 11"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)     // Catch: java.lang.Throwable -> L5c
            r1 = 1
            com.umeng.commonsdk.framework.a.r = r1     // Catch: java.lang.Throwable -> L5c
            r1 = 15
            com.umeng.commonsdk.framework.a.v = r1     // Catch: java.lang.Throwable -> L5c
            android.content.Context r2 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "report_interval"
            java.lang.String r4 = "15"
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r2, r3, r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5c
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "MobclickRT"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "--->>> set report_interval value to: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            r4.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5c
            com.umeng.commonsdk.debug.UMRTLog.i(r3, r4)     // Catch: java.lang.Throwable -> L5c
            r3 = 3
            if (r2 < r3) goto L5e
            r3 = 90
            if (r2 <= r3) goto L57
            goto L5e
        L57:
            int r2 = r2 * 1000
            com.umeng.commonsdk.framework.a.v = r2     // Catch: java.lang.Throwable -> L5c
            goto L64
        L5c:
            r1 = move-exception
            goto L66
        L5e:
            com.umeng.commonsdk.framework.a.v = r1     // Catch: java.lang.Throwable -> L5c
            goto L64
        L61:
            r1 = 0
            com.umeng.commonsdk.framework.a.r = r1     // Catch: java.lang.Throwable -> L5c
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            return
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            throw r1
    }

    private static void k() {
            android.os.HandlerThread r0 = com.umeng.commonsdk.framework.a.a
            r1 = 0
            if (r0 == 0) goto L7
            com.umeng.commonsdk.framework.a.a = r1
        L7:
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.b
            if (r0 == 0) goto Ld
            com.umeng.commonsdk.framework.a.b = r1
        Ld:
            android.os.Handler r0 = com.umeng.commonsdk.framework.a.c
            if (r0 == 0) goto L13
            com.umeng.commonsdk.framework.a.c = r1
        L13:
            return
    }

    private static void l() {
            java.lang.Object r0 = com.umeng.commonsdk.framework.a.n
            monitor-enter(r0)
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r1 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 <= 0) goto L20
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            java.util.ArrayList<com.umeng.commonsdk.framework.UMSenderStateNotify> r3 = com.umeng.commonsdk.framework.a.m     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L1e
            com.umeng.commonsdk.framework.UMSenderStateNotify r3 = (com.umeng.commonsdk.framework.UMSenderStateNotify) r3     // Catch: java.lang.Throwable -> L1e
            r3.onSenderIdle()     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + 1
            goto Le
        L1e:
            r1 = move-exception
            goto L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    private static void m() {
            return
    }

    private static void n() {
            java.lang.String r0 = "]."
            java.lang.String r1 = "--->>> handleProcessNext: Enter..."
            com.umeng.commonsdk.statistics.common.ULog.d(r1)
            boolean r1 = com.umeng.commonsdk.framework.a.l
            if (r1 != 0) goto Lc
            return
        Lc:
            android.content.Context r1 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
            int r2 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r1)     // Catch: java.lang.Throwable -> L2c
            if (r2 <= 0) goto L92
            java.lang.String r2 = "--->>> The envelope file exists."
            com.umeng.commonsdk.statistics.common.ULog.d(r2)     // Catch: java.lang.Throwable -> L2c
            int r2 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r1)     // Catch: java.lang.Throwable -> L2c
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 <= r3) goto L2e
            java.lang.String r2 = "--->>> Number of envelope files is greater than 200, remove old files first."
            com.umeng.commonsdk.statistics.common.ULog.d(r2)     // Catch: java.lang.Throwable -> L2c
            com.umeng.commonsdk.framework.UMFrUtils.removeRedundantEnvelopeFiles(r1, r3)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L96
        L2e:
            java.io.File r2 = com.umeng.commonsdk.framework.UMFrUtils.getEnvelopeFile(r1)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L92
            java.lang.String r3 = r2.getPath()     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r4.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "--->>> Ready to send envelope file ["
            r4.append(r5)     // Catch: java.lang.Throwable -> L2c
            r4.append(r3)     // Catch: java.lang.Throwable -> L2c
            r4.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            com.umeng.commonsdk.statistics.common.ULog.d(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r5.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = "--->>> send envelope file [ "
            r5.append(r6)     // Catch: java.lang.Throwable -> L2c
            r5.append(r3)     // Catch: java.lang.Throwable -> L2c
            r5.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L2c
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r0)     // Catch: java.lang.Throwable -> L2c
            com.umeng.commonsdk.statistics.c r0 = new com.umeng.commonsdk.statistics.c     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L8c
            java.lang.String r0 = "--->>> Send envelope file success, delete it."
            com.umeng.commonsdk.statistics.common.ULog.d(r0)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = com.umeng.commonsdk.framework.UMFrUtils.removeEnvelopeFile(r2)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L86
            java.lang.String r0 = "--->>> Failed to delete already processed file. We try again after delete failed."
            com.umeng.commonsdk.statistics.common.ULog.d(r0)     // Catch: java.lang.Throwable -> L2c
            com.umeng.commonsdk.framework.UMFrUtils.removeEnvelopeFile(r2)     // Catch: java.lang.Throwable -> L2c
        L86:
            r0 = 273(0x111, float:3.83E-43)
            c(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L8c:
            java.lang.String r0 = "--->>> Send envelope file failed, abandon and wait next trigger!"
            com.umeng.commonsdk.statistics.common.ULog.d(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L92:
            e()     // Catch: java.lang.Throwable -> L2c
            return
        L96:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
            return
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.Object r0 = com.umeng.commonsdk.framework.a.w
            monitor-enter(r0)
            java.lang.String r1 = "report_policy"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L23
            java.lang.String r1 = "11"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> switch to report_policy 11"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            com.umeng.commonsdk.framework.a.r = r1     // Catch: java.lang.Throwable -> L1e
            goto L23
        L1e:
            r4 = move-exception
            goto L74
        L20:
            r1 = 0
            com.umeng.commonsdk.framework.a.r = r1     // Catch: java.lang.Throwable -> L1e
        L23:
            java.lang.String r1 = "report_interval"
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L72
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1e
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "--->>> set report_interval value to: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1e
            r1.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r1)     // Catch: java.lang.Throwable -> L1e
            r5 = 3
            if (r4 < r5) goto L56
            r5 = 90
            if (r4 <= r5) goto L51
            goto L56
        L51:
            int r4 = r4 * 1000
            com.umeng.commonsdk.framework.a.v = r4     // Catch: java.lang.Throwable -> L1e
            goto L5a
        L56:
            r4 = 15000(0x3a98, float:2.102E-41)
            com.umeng.commonsdk.framework.a.v = r4     // Catch: java.lang.Throwable -> L1e
        L5a:
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r5.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "--->>> really set report_interval value to: "
            r5.append(r1)     // Catch: java.lang.Throwable -> L1e
            int r1 = com.umeng.commonsdk.framework.a.v     // Catch: java.lang.Throwable -> L1e
            r5.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1e
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r5)     // Catch: java.lang.Throwable -> L1e
        L72:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }
}
