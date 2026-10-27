package com.umeng.analytics.vshelper;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements com.umeng.analytics.pro.bn {
    private static final java.lang.String a = "RealTimeDebugSwitch";
    private static volatile int b;

    static {
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean d() {
            int r0 = com.umeng.analytics.vshelper.b.b
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.umeng.analytics.pro.bn
    public void a() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void a(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void a(android.app.Activity r11, android.os.Bundle r12) {
            r10 = this;
            int r12 = com.umeng.analytics.vshelper.b.b
            if (r12 != 0) goto L136
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "MobclickRT"
            if (r12 == 0) goto L122
            android.net.Uri r12 = r12.getData()
            if (r12 == 0) goto L10d
            java.lang.String r1 = r12.getScheme()
            if (r1 == 0) goto Lf8
            java.lang.String r2 = "um."
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto Lf8
            java.lang.String r1 = "debugkey"
            java.lang.String r2 = r12.getQueryParameter(r1)
            java.lang.String r3 = "sendaging"
            java.lang.String r12 = r12.getQueryParameter(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L136
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            r4 = 0
            if (r3 != 0) goto L44
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L43
            long r6 = r12.longValue()     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
        L44:
            r6 = r4
        L45:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            r12.put(r1, r2)
            r3 = 0
            r8 = 8215(0x2017, float:1.1512E-41)
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L7a
            boolean r12 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r12 == 0) goto L73
            java.lang.String r12 = "--->>> call turnOffRealTimeDebug because sendaging < 0"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r12)
            com.umeng.analytics.AnalyticsConfig.turnOffRealTimeDebug()
            android.content.Context r11 = r11.getApplicationContext()
            android.content.Context r11 = com.stub.StubApp.getOrigApplicationContext(r11)
            com.umeng.analytics.CoreProtocol r12 = com.umeng.analytics.CoreProtocol.getInstance(r11)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r11, r8, r12, r3)
            goto L136
        L73:
            java.lang.String r11 = "--->>> Not currently in RealTimeDebug mode and doing nothing."
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r11)
            goto L136
        L7a:
            if (r9 <= 0) goto Ld1
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r12)
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r3 = "startTime"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La3
            r12.put(r3, r4)     // Catch: java.lang.Throwable -> La3
            r3 = 60
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L94
            r6 = r3
        L94:
            r3 = 240(0xf0, double:1.186E-321)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L9b
            r6 = r3
        L9b:
            java.lang.String r3 = "period"
            r12.put(r3, r6)     // Catch: java.lang.Throwable -> La3
            r12.put(r1, r2)     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r11 = r11.getApplicationContext()
            android.content.Context r11 = com.stub.StubApp.getOrigApplicationContext(r11)
            r1 = 8214(0x2016, float:1.151E-41)
            com.umeng.analytics.CoreProtocol r3 = com.umeng.analytics.CoreProtocol.getInstance(r11)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r11, r1, r3, r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "--->>> turnOnRealTimeDebug[persistent] dk: "
            r11.append(r12)
            r11.append(r2)
            java.lang.String r12 = "; period: "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r11)
            goto L136
        Ld1:
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r12)
            android.content.Context r11 = r11.getApplicationContext()
            android.content.Context r11 = com.stub.StubApp.getOrigApplicationContext(r11)
            com.umeng.analytics.CoreProtocol r12 = com.umeng.analytics.CoreProtocol.getInstance(r11)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r11, r8, r12, r3)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "--->>> turnOnRealTimeDebug[non-persistent] dk: "
            r11.append(r12)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r11)
            goto L136
        Lf8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "--->>> scheme: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r11)
            goto L136
        L10d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "--->>> uri: "
            r11.append(r1)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r11)
            goto L136
        L122:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "--->>> intent: "
            r11.append(r1)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r11)
        L136:
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void b() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void b(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void b(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void c() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void c(android.app.Activity r1) {
            r0 = this;
            int r1 = com.umeng.analytics.vshelper.b.b
            int r1 = r1 + 1
            com.umeng.analytics.vshelper.b.b = r1
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void d(android.app.Activity r1) {
            r0 = this;
            int r1 = com.umeng.analytics.vshelper.b.b
            int r1 = r1 + (-1)
            com.umeng.analytics.vshelper.b.b = r1
            return
    }

    @Override // com.umeng.analytics.pro.bn
    public void e(android.app.Activity r1) {
            r0 = this;
            return
    }
}
