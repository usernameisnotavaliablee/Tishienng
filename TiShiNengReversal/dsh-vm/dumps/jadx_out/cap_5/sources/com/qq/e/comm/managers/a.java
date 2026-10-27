package com.qq.e.comm.managers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements com.qq.e.comm.managers.IGDTAdManager {
    public static final java.util.concurrent.ExecutorService g = null;
    private volatile boolean a;
    private volatile boolean b;
    private volatile android.content.Context c;
    private volatile com.qq.e.comm.managers.plugin.PM d;
    private volatile com.qq.e.comm.managers.devtool.DevTools e;
    private volatile java.lang.String f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.qq.e.comm.managers.a$a, reason: collision with other inner class name */
    class RunnableC0178a implements java.lang.Runnable {
        final /* synthetic */ com.qq.e.comm.managers.GDTAdSdk.OnStartListener a;
        final /* synthetic */ com.qq.e.comm.managers.a b;

        RunnableC0178a(com.qq.e.comm.managers.a r1, com.qq.e.comm.managers.GDTAdSdk.OnStartListener r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.qq.e.comm.managers.a r0 = r3.b     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                com.qq.e.comm.managers.plugin.PM r0 = com.qq.e.comm.managers.a.a(r0)     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                r1 = 0
                com.qq.e.comm.pi.POFactory r0 = r0.getPOFactory(r1, r1)     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                if (r0 == 0) goto L25
                com.qq.e.comm.managers.a r1 = r3.b     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                com.qq.e.comm.managers.plugin.PM r1 = com.qq.e.comm.managers.a.a(r1)     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                r2 = 1
                org.json.JSONObject r1 = r1.getStartCaller(r2)     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                r0.start(r1)     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                com.qq.e.comm.managers.GDTAdSdk$OnStartListener r0 = r3.a     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                if (r0 == 0) goto L42
                r0.onStartSuccess()     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                return
            L23:
                r0 = move-exception
                goto L34
            L25:
                com.qq.e.comm.managers.GDTAdSdk$OnStartListener r0 = r3.a     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                if (r0 == 0) goto L42
                java.lang.Exception r1 = new java.lang.Exception     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                java.lang.String r2 = "GDTAdSdk start异常"
                r1.<init>(r2)     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                r0.onStartFailed(r1)     // Catch: com.qq.e.comm.managers.plugin.e -> L23
                return
            L34:
                java.lang.String r1 = r0.getMessage()
                com.qq.e.comm.util.GDTLogger.e(r1, r0)
                com.qq.e.comm.managers.GDTAdSdk$OnStartListener r1 = r3.a
                if (r1 == 0) goto L42
                r1.onStartFailed(r0)
            L42:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.qq.e.comm.managers.a b;

        b(com.qq.e.comm.managers.a r1, boolean r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.qq.e.comm.managers.a r0 = r3.b     // Catch: com.qq.e.comm.managers.plugin.e -> L12
                com.qq.e.comm.managers.plugin.PM r0 = com.qq.e.comm.managers.a.a(r0)     // Catch: com.qq.e.comm.managers.plugin.e -> L12
                boolean r1 = r3.a     // Catch: com.qq.e.comm.managers.plugin.e -> L12
                r2 = 1
                r0.getPOFactory(r1, r2)     // Catch: com.qq.e.comm.managers.plugin.e -> L12
                com.qq.e.comm.managers.a r0 = r3.b     // Catch: com.qq.e.comm.managers.plugin.e -> L12
                com.qq.e.comm.managers.a.a(r0, r2)     // Catch: com.qq.e.comm.managers.plugin.e -> L12
                return
            L12:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                com.qq.e.comm.util.GDTLogger.e(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c {
        private static com.qq.e.comm.managers.a a;

        static {
                com.qq.e.comm.managers.a r0 = new com.qq.e.comm.managers.a
                r1 = 0
                r0.<init>(r1)
                com.qq.e.comm.managers.a.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.qq.e.comm.managers.a a() {
                com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.c.a
                return r0
        }
    }

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.qq.e.comm.managers.a.g = r0
            return
    }

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            return
    }

    /* synthetic */ a(com.qq.e.comm.managers.a.RunnableC0178a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.qq.e.comm.managers.plugin.PM a(com.qq.e.comm.managers.a r0) {
            com.qq.e.comm.managers.plugin.PM r0 = r0.d
            return r0
    }

    private void a(android.content.Context r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.f = r3
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.c = r2
            com.qq.e.comm.managers.plugin.PM r2 = new com.qq.e.comm.managers.plugin.PM
            android.content.Context r3 = r1.c
            r0 = 0
            r2.<init>(r3, r0)
            r1.d = r2
            java.util.concurrent.ExecutorService r2 = com.qq.e.comm.managers.a.g
            com.qq.e.comm.managers.a$b r3 = new com.qq.e.comm.managers.a$b
            r3.<init>(r1, r4)
            r2.submit(r3)
            return
    }

    static /* synthetic */ boolean a(com.qq.e.comm.managers.a r0, boolean r1) {
            r0.b = r1
            return r1
    }

    public static com.qq.e.comm.managers.a b() {
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.c.a()
            return r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    synchronized void a(com.qq.e.comm.managers.GDTAdSdk.OnStartListener r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.a     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L19
            java.lang.String r0 = "在调用start方法前请先调用initWithoutStart方法"
            com.qq.e.comm.util.GDTLogger.e(r0)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L17
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L15
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r3.onStartFailed(r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L25
        L17:
            monitor-exit(r2)
            return
        L19:
            java.util.concurrent.ExecutorService r0 = com.qq.e.comm.managers.a.g     // Catch: java.lang.Throwable -> L15
            com.qq.e.comm.managers.a$a r1 = new com.qq.e.comm.managers.a$a     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L15
            r0.submit(r1)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    synchronized boolean b(android.content.Context r4, java.lang.String r5, boolean r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.a     // Catch: java.lang.Throwable -> L21
            r1 = 1
            if (r0 == 0) goto L8
            monitor-exit(r3)
            return r1
        L8:
            r0 = 0
            if (r4 == 0) goto L23
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L12
            goto L23
        L12:
            r3.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L19
            r3.a = r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            return r1
        L19:
            r4 = move-exception
            java.lang.String r5 = "GDTADManager初始化错误"
            com.qq.e.comm.util.GDTLogger.e(r5, r4)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)
            return r0
        L21:
            r4 = move-exception
            goto L2a
        L23:
            java.lang.String r4 = "GDTADManager初始化错误，context和appId不能为空"
            com.qq.e.comm.util.GDTLogger.e(r4)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)
            return r0
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    public com.qq.e.comm.managers.plugin.PM c() {
            r1 = this;
            com.qq.e.comm.managers.plugin.PM r0 = r1.d
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 != 0) goto Lb
            java.lang.String r0 = "SDK 尚未初始化，请在 Application 中调用 GDTAdSdk.initWithoutStart() 初始化"
            com.qq.e.comm.util.GDTLogger.e(r0)
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public java.lang.String getBuyerId(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            boolean r0 = r2.d()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            com.qq.e.comm.managers.plugin.PM r0 = r2.d     // Catch: java.lang.Exception -> L14
            com.qq.e.comm.pi.POFactory r0 = r0.getPOFactory()     // Catch: java.lang.Exception -> L14
            java.lang.String r3 = r0.getBuyerId(r3)     // Catch: java.lang.Exception -> L14
            return r3
        L14:
            r3 = move-exception
            java.lang.String r0 = "SDK 初始化异常"
            com.qq.e.comm.util.GDTLogger.e(r0, r3)
            return r1
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public com.qq.e.comm.managers.devtool.DevTools getDevTools() {
            r1 = this;
            com.qq.e.comm.managers.devtool.DevTools r0 = r1.e
            if (r0 != 0) goto Lb
            com.qq.e.comm.managers.devtool.DevTools r0 = new com.qq.e.comm.managers.devtool.DevTools
            r0.<init>()
            r1.e = r0
        Lb:
            com.qq.e.comm.managers.devtool.DevTools r0 = r1.e
            return r0
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public java.lang.String getSDKInfo(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.d()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            com.qq.e.comm.managers.plugin.PM r0 = r2.d     // Catch: java.lang.Exception -> L14
            com.qq.e.comm.pi.POFactory r0 = r0.getPOFactory()     // Catch: java.lang.Exception -> L14
            java.lang.String r3 = r0.getSDKInfo(r3)     // Catch: java.lang.Exception -> L14
            return r3
        L14:
            r3 = move-exception
            java.lang.String r0 = "SDK 初始化异常"
            com.qq.e.comm.util.GDTLogger.e(r0, r3)
            return r1
    }

    @Override // com.qq.e.comm.managers.IGDTAdManager
    public int showOpenOrInstallAppDialog(com.qq.e.ads.dfa.GDTAppDialogClickListener r3) {
            r2 = this;
            boolean r0 = r2.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.qq.e.comm.managers.plugin.PM r0 = r2.d     // Catch: java.lang.Exception -> L11
            com.qq.e.comm.pi.POFactory r0 = r0.getPOFactory()     // Catch: java.lang.Exception -> L11
            int r3 = r0.showOpenOrInstallAppDialog(r3)     // Catch: java.lang.Exception -> L11
            return r3
        L11:
            r3 = move-exception
            java.lang.String r0 = "SDK 初始化异常"
            com.qq.e.comm.util.GDTLogger.e(r0, r3)
            return r1
    }
}
