package com.qq.e.comm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DownloadService extends android.app.Service {
    private com.qq.e.comm.pi.SVSD a;
    private boolean b;
    private java.util.LinkedList<com.qq.e.comm.DownloadService.b> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.qq.e.comm.managers.a a;
        final /* synthetic */ com.qq.e.comm.DownloadService b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.qq.e.comm.DownloadService$a$a, reason: collision with other inner class name */
        class RunnableC0177a implements java.lang.Runnable {
            final /* synthetic */ com.qq.e.comm.pi.SVSD a;
            final /* synthetic */ com.qq.e.comm.DownloadService.a b;

            RunnableC0177a(com.qq.e.comm.DownloadService.a r1, com.qq.e.comm.pi.SVSD r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.qq.e.comm.pi.SVSD r0 = r4.a
                    r0.onCreate()
                L5:
                    com.qq.e.comm.DownloadService$a r0 = r4.b
                    com.qq.e.comm.DownloadService r0 = r0.b
                    java.util.LinkedList r0 = com.qq.e.comm.DownloadService.a(r0)
                    java.lang.Object r0 = r0.poll()
                    com.qq.e.comm.DownloadService$b r0 = (com.qq.e.comm.DownloadService.b) r0
                    if (r0 == 0) goto L27
                    com.qq.e.comm.pi.SVSD r1 = r4.a
                    android.content.Intent r2 = com.qq.e.comm.DownloadService.b.a(r0)
                    int r3 = com.qq.e.comm.DownloadService.b.b(r0)
                    int r0 = com.qq.e.comm.DownloadService.b.c(r0)
                    r1.onStartCommand(r2, r3, r0)
                    goto L5
                L27:
                    com.qq.e.comm.DownloadService$a r0 = r4.b
                    com.qq.e.comm.DownloadService r0 = r0.b
                    com.qq.e.comm.pi.SVSD r1 = r4.a
                    com.qq.e.comm.DownloadService.a(r0, r1)
                    return
            }
        }

        a(com.qq.e.comm.DownloadService r1, com.qq.e.comm.managers.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = "DownloadService初始化异常"
                com.qq.e.comm.managers.a r1 = r4.a     // Catch: java.lang.Throwable -> L18
                com.qq.e.comm.managers.plugin.PM r1 = r1.c()     // Catch: java.lang.Throwable -> L18
                com.qq.e.comm.pi.POFactory r1 = r1.getPOFactory()     // Catch: java.lang.Throwable -> L18
                com.qq.e.comm.DownloadService r2 = r4.b     // Catch: java.lang.Throwable -> L18
                com.qq.e.comm.pi.SVSD r1 = r1.getAPKDownloadServiceDelegate(r2)     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L1a
                com.qq.e.comm.util.GDTLogger.w(r0)     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r1 = move-exception
                goto L2c
            L1a:
                android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L18
                android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L18
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L18
                com.qq.e.comm.DownloadService$a$a r3 = new com.qq.e.comm.DownloadService$a$a     // Catch: java.lang.Throwable -> L18
                r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L18
                r2.post(r3)     // Catch: java.lang.Throwable -> L18
                return
            L2c:
                com.qq.e.comm.util.GDTLogger.w(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private final android.content.Intent a;
        private final int b;
        private final int c;

        private b(android.content.Intent r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        /* synthetic */ b(android.content.Intent r1, int r2, int r3, com.qq.e.comm.DownloadService.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ android.content.Intent a(com.qq.e.comm.DownloadService.b r0) {
                android.content.Intent r0 = r0.a
                return r0
        }

        static /* synthetic */ int b(com.qq.e.comm.DownloadService.b r0) {
                int r0 = r0.b
                return r0
        }

        static /* synthetic */ int c(com.qq.e.comm.DownloadService.b r0) {
                int r0 = r0.c
                return r0
        }
    }

    public DownloadService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.c = r0
            return
    }

    static /* synthetic */ com.qq.e.comm.pi.SVSD a(com.qq.e.comm.DownloadService r0, com.qq.e.comm.pi.SVSD r1) {
            r0.a = r1
            return r1
    }

    static /* synthetic */ java.util.LinkedList a(com.qq.e.comm.DownloadService r0) {
            java.util.LinkedList<com.qq.e.comm.DownloadService$b> r0 = r0.c
            return r0
    }

    private boolean a(boolean r5) {
            r4 = this;
            com.qq.e.comm.pi.SVSD r0 = r4.a
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            com.qq.e.comm.managers.a r0 = com.qq.e.comm.managers.a.b()
            boolean r2 = r0.d()
            r3 = 0
            if (r2 != 0) goto L12
            return r3
        L12:
            if (r5 == 0) goto L2d
            com.qq.e.comm.managers.plugin.PM r5 = r0.c()     // Catch: java.lang.Throwable -> L26
            com.qq.e.comm.pi.POFactory r5 = r5.getPOFactory()     // Catch: java.lang.Throwable -> L26
            com.qq.e.comm.pi.SVSD r5 = r5.getAPKDownloadServiceDelegate(r4)     // Catch: java.lang.Throwable -> L26
            r4.a = r5     // Catch: java.lang.Throwable -> L26
            r5.onCreate()     // Catch: java.lang.Throwable -> L26
            return r1
        L26:
            r5 = move-exception
            java.lang.String r0 = "DownloadService初始化异常"
            com.qq.e.comm.util.GDTLogger.w(r0, r5)
            return r3
        L2d:
            boolean r5 = r4.b
            if (r5 == 0) goto L32
            return r3
        L32:
            r4.b = r1
            java.util.concurrent.ExecutorService r5 = com.qq.e.comm.managers.a.g
            com.qq.e.comm.DownloadService$a r1 = new com.qq.e.comm.DownloadService$a
            r1.<init>(r4, r0)
            r5.submit(r1)
            return r3
    }

    public static void enterAPPDownloadListPage(android.content.Context r3) {
            if (r3 != 0) goto L8
            java.lang.String r3 = "enterAPPDownloadListPage 调用异常，context为空"
            com.qq.e.comm.util.GDTLogger.e(r3)
            return
        L8:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.qq.e.comm.DownloadService> r1 = com.qq.e.comm.DownloadService.class
            r0.<init>(r3, r1)
            com.qq.e.comm.managers.a r1 = com.qq.e.comm.managers.a.b()
            java.lang.String r1 = r1.a()
            java.lang.String r2 = "GDT_APPID"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "com.qq.e.comm.ACTION_DOWNLOAD_LIST"
            r0.setAction(r1)
            r3.startService(r0)
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L9
            android.os.IBinder r2 = r0.onBind(r2)
            return r2
        L9:
            java.lang.String r0 = "GDT_APPID"
            java.lang.String r0 = r2.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            r0 = 1
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L23
            com.qq.e.comm.pi.SVSD r0 = r1.a
            android.os.IBinder r2 = r0.onBind(r2)
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onConfigurationChanged(r2)
        L7:
            return
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onDestroy()
        L7:
            return
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onLowMemory()
        L7:
            return
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent r2) {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onRebind(r2)
        L7:
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
            r4 = this;
            r0 = 2
            if (r5 != 0) goto L7
            r4.stopSelf(r7)
            return r0
        L7:
            java.lang.String r1 = "GDT_APPID"
            java.lang.String r1 = r5.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L19
            java.lang.String r5 = "Service onStartCommand 出现异常"
            com.qq.e.comm.util.GDTLogger.w(r5)
            return r0
        L19:
            r1 = 0
            boolean r1 = r4.a(r1)
            if (r1 == 0) goto L27
            com.qq.e.comm.pi.SVSD r0 = r4.a
            int r5 = r0.onStartCommand(r5, r6, r7)
            return r5
        L27:
            java.util.LinkedList<com.qq.e.comm.DownloadService$b> r1 = r4.c
            com.qq.e.comm.DownloadService$b r2 = new com.qq.e.comm.DownloadService$b
            r3 = 0
            r2.<init>(r5, r6, r7, r3)
            r1.add(r2)
            return r0
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent r2) {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onTaskRemoved(r2)
        L7:
            return
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int r2) {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onTrimMemory(r2)
        L7:
            return
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r2) {
            r1 = this;
            com.qq.e.comm.pi.SVSD r0 = r1.a
            if (r0 == 0) goto L9
            boolean r2 = r0.onUnbind(r2)
            return r2
        L9:
            boolean r2 = super.onUnbind(r2)
            return r2
    }
}
