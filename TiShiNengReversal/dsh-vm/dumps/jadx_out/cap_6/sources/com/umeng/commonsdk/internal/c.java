package com.umeng.commonsdk.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c implements com.umeng.commonsdk.framework.UMLogDataProtocol {
    public static final java.lang.String a = null;
    public static final java.lang.String b = "preInitInvokedFlag";
    public static final java.lang.String c = "policyGrantInvokedFlag";
    public static final java.lang.String d = "policyGrantResult";
    private static int f = 1;
    private static java.lang.Class<?> g;
    private static java.lang.reflect.Method h;
    private static java.lang.reflect.Method i;
    private static java.lang.reflect.Method j;
    private static volatile java.lang.String k;
    private static volatile java.lang.String l;
    private static boolean m;
    private android.content.Context e;







    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "upg"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.internal.c.a = r0
            r0 = 0
            com.umeng.commonsdk.internal.c.g = r0
            com.umeng.commonsdk.internal.c.h = r0
            com.umeng.commonsdk.internal.c.i = r0
            com.umeng.commonsdk.internal.c.j = r0
            java.lang.String r0 = ""
            com.umeng.commonsdk.internal.c.k = r0
            com.umeng.commonsdk.internal.c.l = r0
            r0 = 0
            com.umeng.commonsdk.internal.c.m = r0
            c()
            return
    }

    public c(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.e = r1
        Lf:
            return
    }

    static /* synthetic */ android.content.Context a(com.umeng.commonsdk.internal.c r0) {
            android.content.Context r0 = r0.e
            return r0
    }

    private static java.lang.Class<?> a(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private void a(android.content.Context r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "appkey"
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L50
            com.umeng.commonsdk.service.UMGlobalContext r2 = com.umeng.commonsdk.service.UMGlobalContext.getInstance(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r2.getAppkey()     // Catch: java.lang.Throwable -> L50
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "app_version"
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L50
            com.umeng.commonsdk.service.UMGlobalContext r2 = com.umeng.commonsdk.service.UMGlobalContext.getInstance(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r2.getAppVersion()     // Catch: java.lang.Throwable -> L50
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "os"
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "Android"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = com.umeng.commonsdk.statistics.UMServerURL.ZCFG_PATH     // Catch: java.lang.Throwable -> L50
            r2 = 0
            org.json.JSONObject r4 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(r4, r0, r2, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "MobclickRT"
            if (r4 == 0) goto L4b
            java.lang.String r1 = "exception"
            boolean r4 = r4.has(r1)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L4b
            java.lang.String r4 = "--->>> 构建零号报文失败."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r4)     // Catch: java.lang.Throwable -> L50
            return
        L4b:
            java.lang.String r4 = "--->>> 构建零号报文 成功!!!"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r4)     // Catch: java.lang.Throwable -> L50
        L50:
            return
    }

    private static void a(android.content.Context r2, com.umeng.commonsdk.listener.OnGetOaidListener r3) {
            if (r2 != 0) goto L3
            return
        L3:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.Thread r0 = new java.lang.Thread
            com.umeng.commonsdk.internal.c$2 r1 = new com.umeng.commonsdk.internal.c$2
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    public static void a(android.content.Context r2, boolean r3) {
            java.lang.Thread r0 = new java.lang.Thread
            com.umeng.commonsdk.internal.c$1 r1 = new com.umeng.commonsdk.internal.c$1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    public static java.lang.String b() {
            java.lang.String r0 = com.umeng.commonsdk.internal.c.l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.umeng.commonsdk.internal.c.l
            return r0
        Lb:
            java.lang.Class<?> r0 = com.umeng.commonsdk.internal.c.g
            java.lang.String r1 = ""
            if (r0 == 0) goto L2c
            java.lang.reflect.Method r2 = com.umeng.commonsdk.internal.c.h
            if (r2 == 0) goto L2c
            java.lang.reflect.Method r3 = com.umeng.commonsdk.internal.c.j
            if (r3 == 0) goto L2c
            r3 = 0
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            java.lang.reflect.Method r2 = com.umeng.commonsdk.internal.c.j     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2c
            com.umeng.commonsdk.internal.c.l = r0     // Catch: java.lang.Throwable -> L2b
            return r0
        L2b:
            r1 = r0
        L2c:
            return r1
    }

    private void b(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "umid"
            java.lang.String r1 = ""
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r6, r0, r1)     // Catch: java.lang.Throwable -> L43
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "appkey"
            java.lang.String r3 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Throwable -> L43
            com.umeng.commonsdk.service.UMGlobalContext r4 = com.umeng.commonsdk.service.UMGlobalContext.getInstance(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r4.getAppkey()     // Catch: java.lang.Throwable -> L43
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r0)     // Catch: java.lang.Throwable -> L43
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = com.umeng.commonsdk.statistics.UMServerURL.SILENT_HEART_BEAT     // Catch: java.lang.Throwable -> L43
            r1 = 0
            org.json.JSONObject r6 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(r6, r2, r1, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "MobclickRT"
            if (r6 == 0) goto L3e
            java.lang.String r1 = "exception"
            boolean r6 = r6.has(r1)     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L3e
            java.lang.String r6 = "--->>> 构建心跳报文失败."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)     // Catch: java.lang.Throwable -> L43
            return
        L3e:
            java.lang.String r6 = "--->>> 构建心跳报文 成功!!!"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)     // Catch: java.lang.Throwable -> L43
        L43:
            return
    }

    private static void c() {
            java.lang.Class<com.umeng.umzid.ZIDManager> r0 = com.umeng.umzid.ZIDManager.class
            com.umeng.commonsdk.internal.c.g = r0     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "getInstance"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto Lf
            com.umeng.commonsdk.internal.c.h = r0     // Catch: java.lang.Throwable -> L2f
        Lf:
            java.lang.Class<?> r0 = com.umeng.commonsdk.internal.c.g     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "getZID"
            r3 = 1
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L23
            com.umeng.commonsdk.internal.c.i = r0     // Catch: java.lang.Throwable -> L2f
        L23:
            java.lang.Class<?> r0 = com.umeng.commonsdk.internal.c.g     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "getSDKVersion"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2f
            com.umeng.commonsdk.internal.c.j = r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            return
    }

    private static void c(android.content.Context r1) {
            java.lang.String r0 = "header_device_oaid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L10
            com.umeng.commonsdk.internal.c$3 r0 = new com.umeng.commonsdk.internal.c$3
            r0.<init>(r1)
            a(r1, r0)
        L10:
            return
    }

    private void d() {
            r12 = this;
            android.content.Context r0 = r12.e
            com.umeng.analytics.pro.bk r0 = com.umeng.analytics.pro.bk.a(r0)
            java.lang.String r1 = "stf"
            com.umeng.analytics.pro.bl r2 = r0.a(r1)
            if (r2 == 0) goto L59
            java.lang.String r3 = "--->>> [有状态]二级缓存记录构建成真正信封。"
            java.lang.String r4 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r3)
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = r2.b     // Catch: java.lang.Throwable -> L59
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r2.c     // Catch: java.lang.Throwable -> L59
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L59
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r2.d     // Catch: java.lang.Throwable -> L59
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.String r9 = r2.e     // Catch: java.lang.Throwable -> L59
            java.lang.String r11 = r2.f     // Catch: java.lang.Throwable -> L59
            com.umeng.commonsdk.statistics.b r5 = new com.umeng.commonsdk.statistics.b     // Catch: java.lang.Throwable -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L59
            android.content.Context r2 = r12.e     // Catch: java.lang.Throwable -> L59
            android.content.Context r6 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L59
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)     // Catch: java.lang.Throwable -> L59
            org.json.JSONObject r2 = r5.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L4e
            java.lang.String r5 = "exception"
            boolean r2 = r2.has(r5)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L4e
            java.lang.String r2 = "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录"
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r2)     // Catch: java.lang.Throwable -> L59
            goto L53
        L4e:
            java.lang.String r2 = "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。"
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r2)     // Catch: java.lang.Throwable -> L59
        L53:
            r0.a(r1, r3)     // Catch: java.lang.Throwable -> L59
            r0.b()     // Catch: java.lang.Throwable -> L59
        L59:
            return
    }

    private void d(android.content.Context r11) {
            r10 = this;
            if (r11 != 0) goto L4
            goto L90
        L4:
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            java.lang.String r1 = "debugkey"
            java.lang.String r2 = com.umeng.common.b.a(r11, r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L90
            java.lang.String r3 = "startTime"
            java.lang.String r3 = com.umeng.common.b.a(r11, r0, r3)
            java.lang.String r4 = "period"
            java.lang.String r0 = com.umeng.common.b.a(r11, r0, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L30
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2f
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
        L30:
            r3 = r5
        L31:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L41
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L40
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
        L41:
            r7 = r5
        L42:
            java.lang.String r0 = "MobclickRT"
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L86
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L4d
            goto L86
        L4d:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            r3 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 * r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L6f
            java.lang.String r1 = "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
            boolean r11 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r11 == 0) goto L90
            com.umeng.analytics.AnalyticsConfig.turnOffRealTimeDebug()
            goto L90
        L6f:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r11.put(r1, r2)
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r1 != 0) goto L90
            java.lang.String r1 = "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r11)
            goto L90
        L86:
            java.lang.String r1 = "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
        L90:
            return
    }

    private void e() {
            r2 = this;
            boolean r0 = com.umeng.commonsdk.internal.c.m
            java.lang.String r1 = "header_device_oaid"
            if (r0 != 0) goto L1a
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r1)
            if (r0 == 0) goto L23
            r0 = 1
            com.umeng.commonsdk.internal.c.m = r0
            com.umeng.commonsdk.internal.c$4 r0 = new com.umeng.commonsdk.internal.c$4
            r0.<init>(r2)
            android.content.Context r1 = r2.e
            a(r1, r0)
            return
        L1a:
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r1)
            if (r0 != 0) goto L23
            r0 = 0
            com.umeng.commonsdk.internal.c.m = r0
        L23:
            return
    }

    private void e(android.content.Context r12) {
            r11 = this;
            android.content.Context r0 = r12.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r12 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r12)
            java.lang.String r1 = "com.umeng.umzid.ZIDManager"
            java.lang.Class r1 = a(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "getInstance"
            r3 = 0
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L4a
            java.lang.String r4 = "com.umeng.umzid.IZIDCompletionCallback"
            java.lang.Class r4 = a(r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "init"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r10 = 1
            r7[r10] = r8     // Catch: java.lang.Throwable -> L4a
            r8 = 2
            r7[r8] = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r7)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L4a
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L4a
            r4[r9] = r0     // Catch: java.lang.Throwable -> L4a
            r4[r10] = r12     // Catch: java.lang.Throwable -> L4a
            r4[r8] = r3     // Catch: java.lang.Throwable -> L4a
            r1.invoke(r2, r4)     // Catch: java.lang.Throwable -> L4a
        L4a:
            return
    }

    private void f() {
            r3 = this;
            java.lang.String r0 = "header_device_oaid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L2c
            r0 = 1
            com.umeng.commonsdk.internal.c.m = r0
            com.umeng.commonsdk.UMConfigureImpl.registerInterruptFlag()
            android.content.Context r1 = r3.e
            com.umeng.commonsdk.UMConfigureImpl.init(r1)
            int r1 = com.umeng.commonsdk.internal.c.f
            int r1 = r1 + r0
            com.umeng.commonsdk.internal.c.f = r1
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>> 要读取 oaid，需等待读取结果."
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r2)
            com.umeng.commonsdk.internal.c$5 r1 = new com.umeng.commonsdk.internal.c$5
            r1.<init>(r3)
            com.umeng.commonsdk.UMConfigureImpl.registerMessageSendListener(r1)
            android.content.Context r1 = r3.e
            a(r1, r0)
        L2c:
            return
    }

    private static void f(android.content.Context r2) {
            java.io.File r2 = r2.getFilesDir()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = com.umeng.analytics.pro.bm.l
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L2c
            r0.createNewFile()     // Catch: java.lang.Throwable -> L2c
        L2c:
            return
    }

    private void g() {
            r1 = this;
            int r0 = com.umeng.commonsdk.internal.c.f
            if (r0 > 0) goto Lc
            r1.h()
            android.content.Context r0 = r1.e
            r1.e(r0)
        Lc:
            return
    }

    private void h() {
            r7 = this;
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>> 真实构建条件满足，开始构建业务信封。"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)
            android.content.Context r0 = r7.e
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 == 0) goto L5c
            android.content.Context r0 = r7.e
            f(r0)
            android.content.Context r0 = r7.e
            com.umeng.commonsdk.UMInnerManager.sendInnerPackage(r0)
            java.lang.String r0 = "ccg_switch"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 != 0) goto L40
            int r0 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            if (r0 != 0) goto L40
            android.content.Context r0 = r7.e
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            if (r0 == 0) goto L40
            android.content.Context r1 = r7.e
            com.umeng.commonsdk.internal.b r0 = com.umeng.commonsdk.internal.b.a(r1)
            com.umeng.commonsdk.internal.c r3 = r0.a()
            r4 = 0
            r5 = 5000(0x1388, double:2.4703E-320)
            r2 = 32805(0x8025, float:4.597E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r1, r2, r3, r4, r5)
        L40:
            android.content.Context r0 = r7.e
            r1 = 8208(0x2010, float:1.1502E-41)
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r0)
            r3 = 0
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r1, r2, r3)
            android.content.Context r0 = r7.e
            com.umeng.commonsdk.internal.b r1 = com.umeng.commonsdk.internal.b.a(r0)
            com.umeng.commonsdk.internal.c r1 = r1.a()
            r2 = 32785(0x8011, float:4.5942E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r2, r1, r3)
        L5c:
            return
    }

    public java.lang.String a() {
            r6 = this;
            java.lang.String r0 = com.umeng.commonsdk.internal.c.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.umeng.commonsdk.internal.c.k
            return r0
        Lb:
            java.lang.Class<?> r0 = com.umeng.commonsdk.internal.c.g
            java.lang.String r1 = ""
            if (r0 == 0) goto L34
            java.lang.reflect.Method r2 = com.umeng.commonsdk.internal.c.h
            if (r2 == 0) goto L34
            java.lang.reflect.Method r3 = com.umeng.commonsdk.internal.c.i
            if (r3 == 0) goto L34
            r3 = 0
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L34
            java.lang.reflect.Method r2 = com.umeng.commonsdk.internal.c.i     // Catch: java.lang.Throwable -> L34
            android.content.Context r3 = r6.e     // Catch: java.lang.Throwable -> L34
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L34
            r5 = 0
            r4[r5] = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r2.invoke(r0, r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L34
            com.umeng.commonsdk.internal.c.k = r0     // Catch: java.lang.Throwable -> L33
            return r0
        L33:
            r1 = r0
        L34:
            return r1
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public org.json.JSONObject setupReportData(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(java.lang.Object r13, int r14) {
            r12 = this;
            java.lang.String r0 = "cl_count"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "[internal] workEvent"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "walle"
            com.umeng.commonsdk.statistics.common.ULog.i(r3, r2)
            boolean r2 = com.umeng.commonsdk.utils.c.a()
            java.lang.String r5 = "MobclickRT"
            if (r2 == 0) goto L72
            r13 = 32802(0x8022, float:4.5965E-41)
            if (r13 != r14) goto L428
            java.lang.String r13 = "--->>> 静默模式：进入心跳处理逻辑!"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            long r13 = java.lang.System.currentTimeMillis()
            android.content.Context r0 = r12.e
            long r0 = com.umeng.commonsdk.utils.c.b(r0)
            android.content.Context r2 = r12.e
            boolean r2 = com.umeng.commonsdk.utils.c.e(r2)
            android.content.Context r3 = r12.e
            int r3 = com.umeng.commonsdk.utils.c.a(r3)
            boolean r13 = com.umeng.commonsdk.utils.c.a(r0, r13, r3)
            if (r13 == 0) goto L5c
            android.content.Context r13 = r12.e
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r14 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_Silent
            boolean r13 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r13, r14)
            if (r13 != 0) goto L52
            java.lang.String r13 = "--->>> 构建静默心跳信封."
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            android.content.Context r13 = r12.e
            r12.b(r13)
            goto L57
        L52:
            java.lang.String r13 = "--->>> 静默心跳信封文件已存在，尝试发送之!"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
        L57:
            android.content.Context r13 = r12.e
            com.umeng.commonsdk.framework.UMEnvelopeBuild.registerNetReceiver(r13)
        L5c:
            if (r2 != 0) goto L428
            java.lang.String r13 = "--->>> send REBUILD_DB msg in silent mode."
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r13)
            android.content.Context r6 = r12.e
            com.umeng.analytics.CoreProtocol r8 = com.umeng.analytics.CoreProtocol.getInstance(r6)
            r9 = 0
            r10 = 2000(0x7d0, double:9.88E-321)
            r7 = 4357(0x1105, float:6.105E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r6, r7, r8, r9, r10)
            return
        L72:
            r2 = 2
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.String r7 = "[internal] workEvent send envelope"
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            java.lang.String r9 = "policyGrantResult"
            switch(r14) {
                case 32769: goto L40c;
                case 32770: goto L7e;
                case 32771: goto L3a3;
                case 32772: goto L7e;
                case 32773: goto L7e;
                case 32774: goto L7e;
                case 32775: goto L387;
                case 32776: goto L7e;
                case 32777: goto L34b;
                case 32778: goto L7e;
                case 32779: goto L343;
                case 32780: goto L7e;
                case 32781: goto L328;
                case 32782: goto L7e;
                case 32783: goto L7e;
                case 32784: goto L314;
                case 32785: goto L2e2;
                case 32786: goto L2dc;
                case 32787: goto L27b;
                case 32788: goto L236;
                case 32789: goto L7e;
                case 32790: goto L228;
                case 32791: goto L1ee;
                case 32792: goto L1c1;
                case 32793: goto L148;
                case 32794: goto L7e;
                case 32795: goto L7e;
                case 32796: goto L7e;
                case 32797: goto L7e;
                case 32798: goto L7e;
                case 32799: goto L7e;
                case 32800: goto L118;
                case 32801: goto L112;
                case 32802: goto L7e;
                case 32803: goto Lbe;
                case 32804: goto Lb8;
                case 32805: goto L80;
                default: goto L7e;
            }
        L7e:
            goto L428
        L80:
            java.lang.String r13 = "recv CLOUD_CONFIG_TRIGGER msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r13)
            com.umeng.commonsdk.internal.c$6 r13 = new com.umeng.commonsdk.internal.c$6
            r13.<init>(r12)
            com.umeng.ccg.CcgAgent.registerConfigListener(r13)
            android.content.Context r13 = r12.e     // Catch: java.lang.Throwable -> L428
            android.content.SharedPreferences r13 = com.umeng.analytics.pro.ar.a(r13)     // Catch: java.lang.Throwable -> L428
            if (r13 == 0) goto Lb2
            r1 = 0
            long r1 = r13.getLong(r0, r1)     // Catch: java.lang.Throwable -> L428
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 >= 0) goto La7
            r3 = 1
            long r1 = r1 + r3
        La7:
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch: java.lang.Throwable -> L428
            android.content.SharedPreferences$Editor r13 = r13.putLong(r0, r1)     // Catch: java.lang.Throwable -> L428
            r13.commit()     // Catch: java.lang.Throwable -> L428
        Lb2:
            android.content.Context r13 = r12.e     // Catch: java.lang.Throwable -> L428
            com.umeng.ccg.CcgAgent.init(r13)     // Catch: java.lang.Throwable -> L428
            return
        Lb8:
            android.content.Context r13 = r12.e
            r12.d(r13)
            return
        Lbe:
            android.content.Context r13 = r12.e
            java.lang.String r14 = "connectivity"
            java.lang.Object r13 = r13.getSystemService(r14)
            android.net.ConnectivityManager r13 = (android.net.ConnectivityManager) r13
            if (r13 == 0) goto L105
            android.net.NetworkInfo r13 = r13.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> Lfd
            if (r13 == 0) goto Lf0
            boolean r13 = r13.isAvailable()     // Catch: java.lang.Throwable -> Lfd
            if (r13 == 0) goto Le3
            java.lang.String r13 = "--->>> network state changed: Available"
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r13)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.commonsdk.framework.a.a(r1)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.commonsdk.stateless.b.a(r1)     // Catch: java.lang.Throwable -> Lfd
            goto L428
        Le3:
            java.lang.String r13 = "--->>> network state changed: unAvailable"
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r13)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.commonsdk.framework.a.a(r4)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.commonsdk.stateless.b.a(r4)     // Catch: java.lang.Throwable -> Lfd
            goto L428
        Lf0:
            java.lang.String r13 = "--->>> NetworkInfo is null!"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.commonsdk.framework.a.a(r4)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.commonsdk.stateless.b.a(r4)     // Catch: java.lang.Throwable -> Lfd
            goto L428
        Lfd:
            com.umeng.commonsdk.framework.a.a(r4)
            com.umeng.commonsdk.stateless.b.a(r4)
            goto L428
        L105:
            java.lang.String r13 = "--->>> ConnectivityManager is null!"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            com.umeng.commonsdk.framework.a.a(r4)
            com.umeng.commonsdk.stateless.b.a(r4)
            goto L428
        L112:
            android.content.Context r13 = r12.e     // Catch: java.lang.Throwable -> L428
            com.umeng.commonsdk.debug.SelfChecker.doCheck(r13)     // Catch: java.lang.Throwable -> L428
            return
        L118:
            android.content.Context r13 = r12.e
            java.io.File r13 = r13.getFilesDir()
            java.io.File r14 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r13.getAbsolutePath()
            r0.append(r13)
            java.lang.String r13 = java.io.File.separator
            r0.append(r13)
            java.lang.String r13 = com.umeng.analytics.pro.bm.m
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            boolean r13 = r14.exists()
            if (r13 == 0) goto L428
            r14.delete()     // Catch: java.lang.Throwable -> L428
            goto L428
        L148:
            java.lang.String r14 = "--->>> 保存preInit执行结果及授权API是否调用结果."
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r14)
            boolean r14 = r13 instanceof org.json.JSONObject
            if (r14 == 0) goto L428
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            java.lang.String r14 = "preInitInvoked"
            boolean r0 = r13.has(r14)
            if (r0 == 0) goto L428
            int r14 = r13.getInt(r14)     // Catch: java.lang.Throwable -> L428
            java.lang.String r0 = "policyGrantInvoked"
            int r0 = r13.getInt(r0)     // Catch: java.lang.Throwable -> L428
            int r13 = r13.getInt(r9)     // Catch: java.lang.Throwable -> L428
            android.content.Context r1 = r12.e     // Catch: java.lang.Throwable -> L428
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L428
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L428
            java.lang.String r2 = com.umeng.commonsdk.internal.c.a     // Catch: java.lang.Throwable -> L428
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r4)     // Catch: java.lang.Throwable -> L428
            if (r1 == 0) goto L191
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L428
            if (r1 == 0) goto L191
            java.lang.String r2 = "preInitInvokedFlag"
            r1.putInt(r2, r14)     // Catch: java.lang.Throwable -> L428
            java.lang.String r14 = "policyGrantInvokedFlag"
            r1.putInt(r14, r0)     // Catch: java.lang.Throwable -> L428
            r1.putInt(r9, r13)     // Catch: java.lang.Throwable -> L428
            r1.commit()     // Catch: java.lang.Throwable -> L428
        L191:
            android.content.Context r13 = r12.e     // Catch: java.lang.Throwable -> L428
            java.io.File r13 = r13.getFilesDir()     // Catch: java.lang.Throwable -> L428
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L428
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L428
            r0.<init>()     // Catch: java.lang.Throwable -> L428
            java.lang.String r13 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L428
            r0.append(r13)     // Catch: java.lang.Throwable -> L428
            java.lang.String r13 = java.io.File.separator     // Catch: java.lang.Throwable -> L428
            r0.append(r13)     // Catch: java.lang.Throwable -> L428
            java.lang.String r13 = com.umeng.analytics.pro.bm.m     // Catch: java.lang.Throwable -> L428
            r0.append(r13)     // Catch: java.lang.Throwable -> L428
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L428
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L428
            boolean r13 = r14.exists()     // Catch: java.lang.Throwable -> L428
            if (r13 != 0) goto L428
            r14.createNewFile()     // Catch: java.lang.Throwable -> L428
            goto L428
        L1c1:
            java.lang.String r14 = "--->>> 保存隐私授权结果."
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r14)
            boolean r14 = r13 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L428
            if (r14 == 0) goto L428
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch: java.lang.Throwable -> L428
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L428
            android.content.Context r14 = r12.e     // Catch: java.lang.Throwable -> L428
            android.content.Context r14 = r14.getApplicationContext()     // Catch: java.lang.Throwable -> L428
            android.content.Context r14 = com.stub.StubApp.getOrigApplicationContext(r14)     // Catch: java.lang.Throwable -> L428
            java.lang.String r0 = com.umeng.commonsdk.internal.c.a     // Catch: java.lang.Throwable -> L428
            android.content.SharedPreferences r14 = r14.getSharedPreferences(r0, r4)     // Catch: java.lang.Throwable -> L428
            if (r14 == 0) goto L428
            android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch: java.lang.Throwable -> L428
            android.content.SharedPreferences$Editor r13 = r14.putInt(r9, r13)     // Catch: java.lang.Throwable -> L428
            r13.commit()     // Catch: java.lang.Throwable -> L428
            return
        L1ee:
            java.lang.String r13 = "--->>> 正常冷启动流程，接收到云控配置加载成功通知。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            android.content.Context r13 = r12.e
            com.umeng.commonsdk.UMInnerManager.sendInnerPackage(r13)
            java.lang.String r13 = "ccg_switch"
            boolean r13 = com.umeng.commonsdk.config.FieldManager.allow(r13)
            if (r13 != 0) goto L21f
            int r13 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            if (r13 != 0) goto L21f
            android.content.Context r13 = r12.e
            boolean r13 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r13)
            if (r13 == 0) goto L21f
            android.content.Context r0 = r12.e
            com.umeng.commonsdk.internal.b r13 = com.umeng.commonsdk.internal.b.a(r0)
            com.umeng.commonsdk.internal.c r2 = r13.a()
            r3 = 0
            r4 = 5000(0x1388, double:2.4703E-320)
            r1 = 32805(0x8025, float:4.597E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r1, r2, r3, r4)
        L21f:
            android.content.Context r13 = r12.e
            r12.e(r13)
            com.umeng.commonsdk.utils.UMUtils.saveSDKComponent()
            return
        L228:
            java.lang.String r13 = "--->>> 成功接收到(OAID)读取结束通知。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            int r13 = com.umeng.commonsdk.internal.c.f
            int r13 = r13 - r1
            com.umeng.commonsdk.internal.c.f = r13
            r12.g()
            return
        L236:
            java.lang.String r13 = "--->>> 云控下发参数更新，触发 伪冷启动。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            com.umeng.commonsdk.statistics.b.a()
            r12.e()
            java.lang.String r13 = "header_foreground_count"
            boolean r13 = com.umeng.commonsdk.config.FieldManager.allow(r13)
            if (r13 == 0) goto L262
            boolean r13 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist()
            if (r13 != 0) goto L262
            java.lang.String r13 = "--->>> 云控下发参数更新 前台计数器功能 打开，触发 5秒周期检查机制"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            android.content.Context r6 = r12.e
            com.umeng.analytics.CoreProtocol r8 = com.umeng.analytics.CoreProtocol.getInstance(r6)
            r9 = 0
            r10 = 5000(0x1388, double:2.4703E-320)
            r7 = 8213(0x2015, float:1.1509E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEventEx(r6, r7, r8, r9, r10)
        L262:
            java.lang.String r13 = "header_first_resume"
            boolean r13 = com.umeng.commonsdk.config.FieldManager.allow(r13)
            if (r13 == 0) goto L428
            java.lang.String r13 = "--->>> 云控下发参数更新 FirstResume功能 打开，触发 trigger"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            android.content.Context r13 = r12.e
            com.umeng.analytics.pro.l r13 = com.umeng.analytics.pro.l.a(r13)
            android.content.Context r14 = r12.e
            r13.b(r14)
            return
        L27b:
            java.lang.String r13 = "--->>> 触发2号仓遗留信封检查动作。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)     // Catch: java.lang.Throwable -> L428
            android.content.Context r13 = r12.e     // Catch: java.lang.Throwable -> L428
            java.lang.String r13 = com.umeng.commonsdk.stateless.d.a(r13, r4)     // Catch: java.lang.Throwable -> L428
            android.content.Context r14 = r12.e     // Catch: java.lang.Throwable -> L428
            java.lang.String r14 = com.umeng.commonsdk.stateless.d.a(r14, r1)     // Catch: java.lang.Throwable -> L428
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L428
            if (r0 != 0) goto L2a4
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L428
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L428
            boolean r13 = r0.exists()     // Catch: java.lang.Throwable -> L428
            if (r13 == 0) goto L2a4
            boolean r13 = r0.isDirectory()     // Catch: java.lang.Throwable -> L428
            if (r13 == 0) goto L2a4
            r4 = 1
        L2a4:
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L428
            if (r13 != 0) goto L2bc
            java.io.File r13 = new java.io.File     // Catch: java.lang.Throwable -> L428
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L428
            boolean r14 = r13.exists()     // Catch: java.lang.Throwable -> L428
            if (r14 == 0) goto L2bc
            boolean r13 = r13.isDirectory()     // Catch: java.lang.Throwable -> L428
            if (r13 == 0) goto L2bc
            goto L2bd
        L2bc:
            r1 = r4
        L2bd:
            if (r1 == 0) goto L2d6
            boolean r13 = com.umeng.commonsdk.stateless.b.a()     // Catch: java.lang.Throwable -> L428
            if (r13 != 0) goto L2d0
            com.umeng.commonsdk.stateless.b r13 = new com.umeng.commonsdk.stateless.b     // Catch: java.lang.Throwable -> L428
            android.content.Context r14 = r12.e     // Catch: java.lang.Throwable -> L428
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L428
            com.umeng.commonsdk.stateless.b.b()     // Catch: java.lang.Throwable -> L428
            return
        L2d0:
            java.lang.String r13 = "--->>> 触发2号仓遗留信封检查，Sender已创建，不需要处理。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)     // Catch: java.lang.Throwable -> L428
            return
        L2d6:
            java.lang.String r13 = "--->>> 触发2号仓遗留信封检查，没有需要处理的目录，不需要处理。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)     // Catch: java.lang.Throwable -> L428
            return
        L2dc:
            android.content.Context r14 = r12.e
            com.umeng.commonsdk.internal.crash.UMCrashManager.buildEnvelope(r14, r13)
            return
        L2e2:
            java.lang.String r13 = "--->>> [有状态]接收到消费二级缓存数据通知."
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            android.content.Context r13 = r12.e
            com.umeng.analytics.pro.bk r13 = com.umeng.analytics.pro.bk.a(r13)
            boolean r13 = r13.c()
            if (r13 == 0) goto L2f9
            java.lang.String r13 = "--->>> [有状态]已消费完毕,二级缓存数据库为空."
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            return
        L2f9:
            r12.d()
            r13 = 32785(0x8011, float:4.5942E-41)
            boolean r14 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist(r13)
            if (r14 != 0) goto L428
            android.content.Context r14 = r12.e
            com.umeng.commonsdk.internal.b r0 = com.umeng.commonsdk.internal.b.a(r14)
            com.umeng.commonsdk.internal.c r0 = r0.a()
            r1 = 0
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r14, r13, r0, r1)
            return
        L314:
            java.lang.String r13 = "--->>> 零号报文流程，接收到云控配置加载成功通知(成功收到零号报文应答)。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            r12.f()
            int r13 = com.umeng.commonsdk.internal.c.f
            int r13 = r13 - r1
            com.umeng.commonsdk.internal.c.f = r13
            r12.g()
            com.umeng.commonsdk.utils.UMUtils.saveSDKComponent()
            return
        L328:
            android.content.Context r13 = r12.e
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r14 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_ZeroEnv
            boolean r13 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r13, r14)
            if (r13 != 0) goto L33d
            java.lang.String r13 = "--->>> 构建零号报文"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            android.content.Context r13 = r12.e
            r12.a(r13)
            return
        L33d:
            java.lang.String r13 = "--->>> 零号报文信封文件已存在，尝试发送之!"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r13)
            return
        L343:
            com.umeng.commonsdk.vchannel.b r13 = (com.umeng.commonsdk.vchannel.b) r13
            android.content.Context r14 = r12.e
            com.umeng.commonsdk.vchannel.Sender.handleEvent(r14, r13)
            return
        L34b:
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r4] = r7
            com.umeng.commonsdk.statistics.common.ULog.i(r3, r13)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r14 = "i_sdk_v"
            java.lang.String r0 = "1.2.0"
            r13.put(r14, r0)
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "inner"
            r14.put(r2, r0)
            android.content.Context r0 = r12.e
            org.json.JSONObject r13 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r0, r13, r14)
            if (r13 == 0) goto L428
            java.lang.String r14 = "exception"
            boolean r13 = r13.has(r14)
            if (r13 != 0) goto L428
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.String r14 = "[internal] workEvent send envelope back, result is ok"
            r13[r4] = r14
            com.umeng.commonsdk.statistics.common.ULog.i(r3, r13)
            return
        L387:
            java.lang.Class<com.umeng.commonsdk.internal.utils.InfoPreferenceAgent> r14 = com.umeng.commonsdk.internal.utils.InfoPreferenceAgent.class
            java.lang.String r0 = "saveUA"
            java.lang.Class[] r3 = new java.lang.Class[r2]
            r3[r4] = r8
            r3[r1] = r6
            java.lang.reflect.Method r0 = r14.getMethod(r0, r3)
            java.lang.String r13 = (java.lang.String) r13
            android.content.Context r3 = r12.e
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r3
            r2[r1] = r13
            r0.invoke(r14, r2)
            return
        L3a3:
            if (r13 == 0) goto L428
            boolean r14 = r13 instanceof com.umeng.commonsdk.internal.utils.b
            if (r14 == 0) goto L428
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            com.umeng.commonsdk.internal.utils.b r13 = (com.umeng.commonsdk.internal.utils.b) r13
            java.lang.String r0 = "le"
            int r3 = r13.a     // Catch: java.lang.Throwable -> L3da
            r14.put(r0, r3)     // Catch: java.lang.Throwable -> L3da
            java.lang.String r0 = "vol"
            int r3 = r13.b     // Catch: java.lang.Throwable -> L3da
            r14.put(r0, r3)     // Catch: java.lang.Throwable -> L3da
            java.lang.String r0 = "temp"
            int r3 = r13.c     // Catch: java.lang.Throwable -> L3da
            r14.put(r0, r3)     // Catch: java.lang.Throwable -> L3da
            java.lang.String r0 = "st"
            int r3 = r13.d     // Catch: java.lang.Throwable -> L3da
            r14.put(r0, r3)     // Catch: java.lang.Throwable -> L3da
            java.lang.String r0 = "ct"
            int r3 = r13.e     // Catch: java.lang.Throwable -> L3da
            r14.put(r0, r3)     // Catch: java.lang.Throwable -> L3da
            java.lang.String r0 = "ts"
            long r9 = r13.f     // Catch: java.lang.Throwable -> L3da
            r14.put(r0, r9)     // Catch: java.lang.Throwable -> L3da
        L3da:
            java.lang.String r13 = r14.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "battery info: "
            r14.append(r0)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r14)
            java.lang.Class<com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent> r14 = com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent.class
            java.lang.String r0 = "saveBattery"
            java.lang.Class[] r3 = new java.lang.Class[r2]
            r3[r4] = r8
            r3[r1] = r6
            java.lang.reflect.Method r0 = r14.getMethod(r0, r3)
            android.content.Context r3 = r12.e
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r3
            r2[r1] = r13
            r0.invoke(r14, r2)
            goto L428
        L40c:
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r4] = r7
            com.umeng.commonsdk.statistics.common.ULog.i(r3, r13)
            java.lang.Class<com.umeng.commonsdk.internal.UMInternalManagerAgent> r13 = com.umeng.commonsdk.internal.UMInternalManagerAgent.class
            java.lang.String r14 = "sendInternalEnvelopeByStateful2"
            java.lang.Class[] r0 = new java.lang.Class[r1]
            r0[r4] = r8
            java.lang.reflect.Method r14 = r13.getMethod(r14, r0)
            android.content.Context r0 = r12.e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            r14.invoke(r13, r1)
        L428:
            return
    }
}
