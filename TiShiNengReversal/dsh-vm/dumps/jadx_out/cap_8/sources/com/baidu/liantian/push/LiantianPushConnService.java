package com.baidu.liantian.push;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LiantianPushConnService extends android.app.Service {
    private static final int ERROR_CODE_KILL = 2;
    public static final java.lang.String PUSH_SERVICE_ACTION = "com.baidu.liantian.push.service.action";
    private static int sPushPluginId = -1;
    private com.baidu.liantian.ac.Callback dataServerCallback;
    private android.os.IBinder mBinder;
    private com.baidu.liantian.core.d mFha;
    private java.lang.String mPushPluginVersion;




    static {
            return
    }

    public LiantianPushConnService() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.mPushPluginVersion = r0
            com.baidu.liantian.push.LiantianPushConnService$2 r0 = new com.baidu.liantian.push.LiantianPushConnService$2
            r0.<init>(r1)
            r1.dataServerCallback = r0
            com.baidu.liantian.push.LiantianPushConnService$3 r0 = new com.baidu.liantian.push.LiantianPushConnService$3
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    static /* synthetic */ com.baidu.liantian.core.d access$000(com.baidu.liantian.push.LiantianPushConnService r0) {
            com.baidu.liantian.core.d r0 = r0.mFha
            return r0
    }

    static /* synthetic */ java.lang.String access$102(com.baidu.liantian.push.LiantianPushConnService r0, java.lang.String r1) {
            r0.mPushPluginVersion = r1
            return r1
    }

    static /* synthetic */ int access$200() {
            int r0 = com.baidu.liantian.push.LiantianPushConnService.sPushPluginId
            return r0
    }

    static /* synthetic */ int access$202(int r0) {
            com.baidu.liantian.push.LiantianPushConnService.sPushPluginId = r0
            return r0
    }

    static /* synthetic */ android.util.Pair access$300(com.baidu.liantian.push.LiantianPushConnService r0, int r1) {
            android.util.Pair r0 = r0.startDataServer(r1)
            return r0
    }

    private android.util.Pair<java.lang.Integer, java.lang.Object> startDataServer(int r7) {
            r6 = this;
            java.lang.String r0 = "startDataServer"
            com.baidu.liantian.core.d r1 = r6.mFha     // Catch: java.lang.Throwable -> L35
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.baidu.liantian.ac.Callback> r4 = com.baidu.liantian.ac.Callback.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L35
            com.baidu.liantian.ac.Callback r4 = r6.dataServerCallback     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L35
            r2[r5] = r4     // Catch: java.lang.Throwable -> L35
            android.util.Pair r7 = r1.a(r7, r0, r3, r2)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r7.first     // Catch: java.lang.Throwable -> L35
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r7.second     // Catch: java.lang.Throwable -> L35
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L35
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r7.first     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L35
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L34
            java.lang.Object r1 = r7.first     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L35
            r6.reportMethodFail(r0, r1)     // Catch: java.lang.Throwable -> L35
        L34:
            return r7
        L35:
            com.baidu.liantian.b.e.a()
            r7 = 0
            return r7
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            r1.getPackageName()     // Catch: java.lang.Throwable -> L18
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "com.baidu.liantian.push.service.action"
            java.lang.String r2 = r2.getAction()     // Catch: java.lang.Throwable -> L18
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1b
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L18
            android.os.IBinder r2 = r1.mBinder     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            com.baidu.liantian.b.e.a()
        L1b:
            r2 = 0
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()     // Catch: java.lang.Throwable -> L25
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L25
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L25
            com.baidu.liantian.core.d r0 = com.baidu.liantian.core.d.a(r0)     // Catch: java.lang.Throwable -> L25
            r2.mFha = r0     // Catch: java.lang.Throwable -> L25
            r2.getPackageName()     // Catch: java.lang.Throwable -> L25
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L25
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L25
            com.baidu.liantian.push.LiantianPushConnService$1 r1 = new com.baidu.liantian.push.LiantianPushConnService$1     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25
            r0.start()     // Catch: java.lang.Throwable -> L25
            return
        L25:
            com.baidu.liantian.b.e.a()
            return
    }

    protected void reportInitPushModuleResult(boolean r5) {
            r4 = this;
            com.baidu.liantian.b.a()
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "0"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L49
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "1"
            java.lang.String r2 = "3.1.6.7"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "2"
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L49
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = com.baidu.liantian.b.g.c(r2)     // Catch: java.lang.Throwable -> L49
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "3"
            if (r5 == 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 2
        L34:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L49
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L49
            android.content.Context r5 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L49
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "1003130"
            com.baidu.liantian.b.e.a(r5, r1, r0)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            com.baidu.liantian.b.e.a()
            return
    }

    protected void reportKillSelf(int r5) {
            r4 = this;
            com.baidu.liantian.b.a()
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "0"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "1"
            java.lang.String r2 = "3.1.6.7"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "2"
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L4b
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = com.baidu.liantian.b.g.c(r2)     // Catch: java.lang.Throwable -> L4b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "3"
            java.lang.String r2 = r4.mPushPluginVersion     // Catch: java.lang.Throwable -> L4b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "4"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L4b
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L4b
            android.content.Context r5 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L4b
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "1003133"
            com.baidu.liantian.b.e.a(r5, r1, r0)     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            com.baidu.liantian.b.e.a()
            return
    }

    protected void reportMethodFail(java.lang.String r5, java.lang.Integer r6) {
            r4 = this;
            com.baidu.liantian.b.a()
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4c
            r0.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "0"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "1"
            java.lang.String r2 = "3.1.6.7"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "2"
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L4c
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = com.baidu.liantian.b.g.c(r2)     // Catch: java.lang.Throwable -> L4c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "3"
            java.lang.String r2 = r4.mPushPluginVersion     // Catch: java.lang.Throwable -> L4c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "4"
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "5"
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L4c
            android.content.Context r5 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L4c
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "1003131"
            com.baidu.liantian.b.e.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L4c
            return
        L4c:
            com.baidu.liantian.b.e.a()
            return
    }
}
