package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PM {
    public static final int CALL_START_BY_DEV = 1;
    private static final java.util.Map<java.lang.Class<?>, java.lang.String> s = null;
    final java.util.concurrent.ExecutorService a;
    private final android.content.Context b;
    private java.lang.String c;
    private java.io.File d;
    private volatile int e;
    private dalvik.system.DexClassLoader f;
    private java.io.RandomAccessFile g;
    private java.nio.channels.FileLock h;
    private boolean i;
    private volatile com.qq.e.comm.pi.POFactory j;
    private int k;
    private int l;
    private java.util.concurrent.Future<java.lang.Boolean> m;
    private boolean n;
    private boolean o;
    private java.lang.String p;
    private org.json.JSONObject q;
    private int r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.concurrent.Callable<java.lang.Boolean> {
        final /* synthetic */ com.qq.e.comm.managers.plugin.PM a;

        a(com.qq.e.comm.managers.plugin.PM r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean a() throws java.lang.Exception {
                r5 = this;
                long r0 = java.lang.System.currentTimeMillis()
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                android.content.Context r2 = com.qq.e.comm.managers.plugin.PM.a(r2)
                com.qq.e.comm.managers.plugin.h.b(r2)
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                com.qq.e.comm.managers.plugin.PM.b(r2)
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                boolean r2 = com.qq.e.comm.managers.plugin.PM.c(r2)
                if (r2 != 0) goto L23
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                boolean r3 = r2.tryLockUpdate()
                com.qq.e.comm.managers.plugin.PM.a(r2, r3)
            L23:
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                boolean r2 = com.qq.e.comm.managers.plugin.PM.d(r2)
                if (r2 == 0) goto L3b
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                int r4 = (int) r3
                com.qq.e.comm.managers.plugin.PM.a(r2, r4)
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                com.qq.e.comm.managers.plugin.PM.e(r2)
            L3b:
                com.qq.e.comm.managers.plugin.PM r2 = r5.a
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                int r0 = (int) r3
                com.qq.e.comm.managers.plugin.PM.b(r2, r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                r1 = this;
                java.lang.Boolean r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends java.util.HashMap<java.lang.Class<?>, java.lang.String> {
        b() {
                r2 = this;
                r2.<init>()
                java.lang.Class<com.qq.e.comm.pi.POFactory> r0 = com.qq.e.comm.pi.POFactory.class
                java.lang.String r1 = "com.qq.e.comm.plugin.POFactoryImpl"
                r2.put(r0, r1)
                return
        }
    }

    static {
            com.qq.e.comm.managers.plugin.PM$b r0 = new com.qq.e.comm.managers.plugin.PM$b
            r0.<init>()
            com.qq.e.comm.managers.plugin.PM.s = r0
            return
    }

    public PM(android.content.Context r1, com.qq.e.comm.managers.plugin.f r2) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.a = r2
            r2 = 0
            r0.n = r2
            android.content.Context r2 = r1.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r0.b = r2
            com.qq.e.comm.managers.plugin.i.a(r1)
            r0.g()
            return
    }

    static /* synthetic */ int a(com.qq.e.comm.managers.plugin.PM r0, int r1) {
            r0.l = r1
            return r1
    }

    static /* synthetic */ android.content.Context a(com.qq.e.comm.managers.plugin.PM r0) {
            android.content.Context r0 = r0.b
            return r0
    }

    private org.json.JSONObject a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r4.getPluginVersion()     // Catch: org.json.JSONException -> L54
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 <= r2) goto L14
            java.lang.String r2 = "vas"
            java.lang.String r3 = r4.p     // Catch: org.json.JSONException -> L54
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L54
        L14:
            java.lang.String r2 = "pv"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "sig"
            java.lang.String r2 = r4.c     // Catch: org.json.JSONException -> L54
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "appId"
            com.qq.e.comm.managers.a r2 = com.qq.e.comm.managers.a.b()     // Catch: org.json.JSONException -> L54
            java.lang.String r2 = r2.a()     // Catch: org.json.JSONException -> L54
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "pn"
            android.content.Context r2 = r4.b     // Catch: org.json.JSONException -> L54
            java.lang.String r2 = com.qq.e.comm.managers.plugin.i.a(r2)     // Catch: org.json.JSONException -> L54
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "ict"
            int r2 = r4.k     // Catch: org.json.JSONException -> L54
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "mup"
            boolean r2 = r4.i     // Catch: org.json.JSONException -> L54
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "ifg"
            int r2 = r4.r     // Catch: org.json.JSONException -> L54
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
            java.lang.String r1 = "pct"
            int r2 = r4.l     // Catch: org.json.JSONException -> L54
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L54
        L54:
            return r0
    }

    static /* synthetic */ boolean a(com.qq.e.comm.managers.plugin.PM r0, boolean r1) {
            r0.i = r1
            return r1
    }

    static /* synthetic */ int b(com.qq.e.comm.managers.plugin.PM r0, int r1) {
            r0.k = r1
            return r1
    }

    private void b() {
            r0 = this;
            return
    }

    static /* synthetic */ void b(com.qq.e.comm.managers.plugin.PM r0) {
            r0.i()
            return
    }

    private java.lang.ClassLoader c() {
            r1 = this;
            java.lang.String r0 = com.qq.e.comm.constants.Sig.ASSET_PLUGIN_SIG
            if (r0 != 0) goto Ld
            java.lang.Class r0 = r1.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
        Ld:
            dalvik.system.DexClassLoader r0 = r1.f
            return r0
    }

    static /* synthetic */ boolean c(com.qq.e.comm.managers.plugin.PM r0) {
            boolean r0 = r0.i
            return r0
    }

    private boolean d() {
            r5 = this;
            boolean r0 = r5.i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            r5.r = r0     // Catch: java.lang.Throwable -> L2b
            android.content.Context r2 = r5.b     // Catch: java.lang.Throwable -> L2b
            java.io.File r3 = com.qq.e.comm.managers.plugin.h.h(r2)     // Catch: java.lang.Throwable -> L2b
            android.content.Context r4 = r5.b     // Catch: java.lang.Throwable -> L2b
            java.io.File r4 = com.qq.e.comm.managers.plugin.h.i(r4)     // Catch: java.lang.Throwable -> L2b
            com.qq.e.comm.managers.plugin.b.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = com.qq.e.comm.constants.Sig.ASSET_PLUGIN_SIG     // Catch: java.lang.Throwable -> L2b
            r5.c = r2     // Catch: java.lang.Throwable -> L2b
            android.content.Context r2 = r5.b     // Catch: java.lang.Throwable -> L2b
            java.io.File r2 = com.qq.e.comm.managers.plugin.h.h(r2)     // Catch: java.lang.Throwable -> L2b
            r5.d = r2     // Catch: java.lang.Throwable -> L2b
            int r2 = com.qq.e.comm.managers.status.SDKStatus.getBuildInPluginVersion()     // Catch: java.lang.Throwable -> L2b
            r5.e = r2     // Catch: java.lang.Throwable -> L2b
            return r0
        L2b:
            r0 = move-exception
            java.lang.String r2 = "插件初始化失败 "
            com.qq.e.comm.util.GDTLogger.e(r2)
            java.lang.String r2 = r0.getMessage()
            com.qq.e.comm.managers.plugin.a.a(r0, r2)
            return r1
    }

    static /* synthetic */ boolean d(com.qq.e.comm.managers.plugin.PM r0) {
            boolean r0 = r0.h()
            return r0
    }

    private void e() {
            r5 = this;
            java.io.File r0 = r5.d
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0.getAbsolutePath()
        L8:
            java.lang.String r0 = r5.c
            r1 = 0
            if (r0 == 0) goto L45
            java.io.File r0 = r5.d
            if (r0 == 0) goto L45
            dalvik.system.DexClassLoader r0 = new dalvik.system.DexClassLoader     // Catch: java.lang.Throwable -> L34
            java.io.File r2 = r5.d     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L34
            android.content.Context r3 = r5.b     // Catch: java.lang.Throwable -> L34
            java.io.File r3 = com.qq.e.comm.managers.plugin.h.c(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L34
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L34
            r0.<init>(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L34
            r5.f = r0     // Catch: java.lang.Throwable -> L34
            r5.j()     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r0 = move-exception
            java.lang.String r1 = "插件ClassLoader构造发生异常"
            com.qq.e.comm.util.GDTLogger.e(r1, r0)
            r5.b()
            java.lang.String r1 = r0.getMessage()
            com.qq.e.comm.managers.plugin.a.a(r0, r1)
            return
        L45:
            r5.f = r1
            return
    }

    static /* synthetic */ void e(com.qq.e.comm.managers.plugin.PM r0) {
            r0.e()
            return
    }

    private boolean f() {
            r5 = this;
            boolean r0 = r5.o
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r5.i
            if (r0 == 0) goto L3c
            com.qq.e.comm.managers.plugin.g r0 = new com.qq.e.comm.managers.plugin.g
            android.content.Context r2 = r5.b
            java.io.File r2 = com.qq.e.comm.managers.plugin.h.e(r2)
            android.content.Context r3 = r5.b
            java.io.File r3 = com.qq.e.comm.managers.plugin.h.f(r3)
            r0.<init>(r2, r3)
            android.content.Context r2 = r5.b
            boolean r2 = r0.a(r2, r1)
            if (r2 == 0) goto L3c
            r2 = 3
            r5.r = r2
            android.content.Context r2 = r5.b
            com.qq.e.comm.managers.plugin.h.a(r2)
            android.content.Context r2 = r5.b
            java.io.File r2 = com.qq.e.comm.managers.plugin.h.h(r2)
            android.content.Context r3 = r5.b
            java.io.File r3 = com.qq.e.comm.managers.plugin.h.i(r3)
            android.content.Context r4 = r5.b
            r0.a(r2, r3, r4)
        L3c:
            com.qq.e.comm.managers.plugin.g r0 = new com.qq.e.comm.managers.plugin.g
            android.content.Context r2 = r5.b
            java.io.File r2 = com.qq.e.comm.managers.plugin.h.h(r2)
            android.content.Context r3 = r5.b
            java.io.File r3 = com.qq.e.comm.managers.plugin.h.i(r3)
            r0.<init>(r2, r3)
            android.content.Context r2 = r5.b
            r3 = 1
            boolean r2 = r0.a(r2, r3)
            if (r2 == 0) goto L88
            int r2 = r0.b()
            int r4 = com.qq.e.comm.managers.status.SDKStatus.getBuildInPluginVersion()
            if (r2 >= r4) goto L64
            com.qq.e.comm.managers.status.SDKStatus.getBuildInPluginVersion()
            return r1
        L64:
            int r1 = r5.r
            if (r1 != 0) goto L6b
            r1 = 2
            r5.r = r1
        L6b:
            java.lang.String r1 = r0.a()
            r5.c = r1
            int r1 = r0.b()
            r5.e = r1
            android.content.Context r1 = r5.b
            java.io.File r1 = com.qq.e.comm.managers.plugin.h.h(r1)
            r5.d = r1
            java.lang.String r0 = r0.c()
            r5.p = r0
            r5.n = r3
            return r3
        L88:
            return r1
    }

    private void g() {
            r2 = this;
            r0 = 0
            r2.n = r0
            java.util.concurrent.ExecutorService r0 = r2.a
            com.qq.e.comm.managers.plugin.PM$a r1 = new com.qq.e.comm.managers.plugin.PM$a
            r1.<init>(r2)
            java.util.concurrent.Future r0 = r0.submit(r1)
            r2.m = r0
            return
    }

    private boolean h() {
            r3 = this;
            r0 = 0
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11
            boolean r1 = r3.f()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            boolean r1 = r3.d()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L14
            goto L13
        L11:
            r1 = move-exception
            goto L18
        L13:
            r0 = 1
        L14:
            java.lang.System.currentTimeMillis()
            return r0
        L18:
            java.lang.String r2 = "插件加载出现异常"
            com.qq.e.comm.util.GDTLogger.e(r2, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r1.getMessage()     // Catch: java.lang.Throwable -> L28
            com.qq.e.comm.managers.plugin.a.a(r1, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.System.currentTimeMillis()
            return r0
        L28:
            r0 = move-exception
            java.lang.System.currentTimeMillis()
            throw r0
    }

    private void i() {
            r4 = this;
            android.content.Context r0 = r4.b
            java.lang.String r1 = "start_crash"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "crash_count"
            int r2 = r0.getInt(r1, r2)
            r3 = 2
            if (r2 < r3) goto L25
            r2 = 1
            r4.o = r2
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.commit()
            java.lang.String r0 = "加载本地插件"
            com.qq.e.comm.util.GDTLogger.e(r0)
        L25:
            return
    }

    private void j() {
            r0 = this;
            return
    }

    private void k() {
            r1 = this;
            java.util.concurrent.Future<java.lang.Boolean> r0 = r1.m
            if (r0 == 0) goto L7
            r0.get()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public <T> T getFactory(java.lang.Class<T> r8) throws com.qq.e.comm.managers.plugin.e {
            r7 = this;
            r7.k()
            java.util.Objects.toString(r8)
            java.lang.ClassLoader r0 = r7.c()
            java.lang.Class r1 = r7.getClass()
            r1.getClassLoader()
            if (r0 == 0) goto L88
            java.util.Map<java.lang.Class<?>, java.lang.String> r1 = com.qq.e.comm.managers.plugin.PM.s     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L50
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L52
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "getInstance"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L50
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L50
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L50
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L50
            android.content.Context r3 = r7.b     // Catch: java.lang.Throwable -> L50
            org.json.JSONObject r4 = r7.a()     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L50
            r2[r5] = r3     // Catch: java.lang.Throwable -> L50
            r2[r6] = r4     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r8.cast(r0)     // Catch: java.lang.Throwable -> L50
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L50
            return r0
        L50:
            r0 = move-exception
            goto L6d
        L52:
            com.qq.e.comm.managers.plugin.e r0 = new com.qq.e.comm.managers.plugin.e     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "factory  implemention name is not specified for interface:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r8.getName()     // Catch: java.lang.Throwable -> L50
            r1.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L50
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L6d:
            com.qq.e.comm.managers.plugin.e r1 = new com.qq.e.comm.managers.plugin.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fail to getfactory implement instance for interface:"
            r2.append(r3)
            java.lang.String r8 = r8.getName()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        L88:
            com.qq.e.comm.managers.plugin.e r0 = new com.qq.e.comm.managers.plugin.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fail to init GDTADPLugin,PluginClassLoader == null;while loading factory impl for:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    public com.qq.e.comm.pi.POFactory getPOFactory() throws com.qq.e.comm.managers.plugin.e {
            r2 = this;
            r0 = 1
            r1 = 0
            com.qq.e.comm.pi.POFactory r0 = r2.getPOFactory(r0, r1)
            return r0
    }

    public com.qq.e.comm.pi.POFactory getPOFactory(boolean r3, boolean r4) throws com.qq.e.comm.managers.plugin.e {
            r2 = this;
            com.qq.e.comm.pi.POFactory r0 = r2.j
            if (r0 != 0) goto L36
            monitor-enter(r2)
            com.qq.e.comm.pi.POFactory r0 = r2.j     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L32
            java.lang.Class<com.qq.e.comm.pi.POFactory> r0 = com.qq.e.comm.pi.POFactory.class
            java.lang.Object r0 = r2.getFactory(r0)     // Catch: java.lang.Throwable -> L14 com.qq.e.comm.managers.plugin.e -> L16
            com.qq.e.comm.pi.POFactory r0 = (com.qq.e.comm.pi.POFactory) r0     // Catch: java.lang.Throwable -> L14 com.qq.e.comm.managers.plugin.e -> L16
            r2.j = r0     // Catch: java.lang.Throwable -> L14 com.qq.e.comm.managers.plugin.e -> L16
            goto L32
        L14:
            r3 = move-exception
            goto L34
        L16:
            r0 = move-exception
            boolean r1 = r2.n     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L31
            java.lang.String r0 = "插件加载错误，回退到内置版本"
            com.qq.e.comm.util.GDTLogger.e(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 1
            r2.o = r0     // Catch: java.lang.Throwable -> L14
            r2.g()     // Catch: java.lang.Throwable -> L14
            java.lang.Class<com.qq.e.comm.pi.POFactory> r0 = com.qq.e.comm.pi.POFactory.class
            java.lang.Object r0 = r2.getFactory(r0)     // Catch: java.lang.Throwable -> L14
            com.qq.e.comm.pi.POFactory r0 = (com.qq.e.comm.pi.POFactory) r0     // Catch: java.lang.Throwable -> L14
            r2.j = r0     // Catch: java.lang.Throwable -> L14
            goto L32
        L31:
            throw r0     // Catch: java.lang.Throwable -> L14
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            goto L36
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
        L36:
            if (r3 == 0) goto L4b
            com.qq.e.comm.pi.POFactory r3 = r2.j
            if (r3 == 0) goto L4b
            com.qq.e.comm.pi.POFactory r3 = r2.j
            if (r4 == 0) goto L49
            r4 = 0
        L41:
            org.json.JSONObject r4 = r2.getStartCaller(r4)
            r3.start(r4)
            goto L4b
        L49:
            r4 = 2
            goto L41
        L4b:
            com.qq.e.comm.pi.POFactory r3 = r2.j
            return r3
    }

    public int getPluginVersion() {
            r1 = this;
            r1.k()
            int r0 = r1.e
            return r0
    }

    public org.json.JSONObject getStartCaller(int r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.q
            if (r0 != 0) goto Lb
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r2.q = r0
        Lb:
            org.json.JSONObject r0 = r2.q     // Catch: org.json.JSONException -> L12
            java.lang.String r1 = "scr"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L12
        L12:
            org.json.JSONObject r3 = r2.q
            return r3
    }

    public boolean tryLockUpdate() {
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.b     // Catch: java.lang.Throwable -> L39
            java.io.File r1 = com.qq.e.comm.managers.plugin.h.d(r1)     // Catch: java.lang.Throwable -> L39
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L15
            r1.createNewFile()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "lock"
            com.qq.e.comm.managers.plugin.h.a(r2, r1)     // Catch: java.lang.Throwable -> L39
        L15:
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L1c
            return r0
        L1c:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L39
            r4.g = r2     // Catch: java.lang.Throwable -> L39
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L39
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch: java.lang.Throwable -> L39
            r4.h = r1     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L39
            java.io.RandomAccessFile r1 = r4.g     // Catch: java.lang.Throwable -> L39
            r2 = 37
            r1.writeByte(r2)     // Catch: java.lang.Throwable -> L39
            r0 = 1
        L39:
            return r0
    }
}
