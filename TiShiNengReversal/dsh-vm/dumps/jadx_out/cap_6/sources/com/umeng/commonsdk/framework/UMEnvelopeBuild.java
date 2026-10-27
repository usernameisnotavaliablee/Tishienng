package com.umeng.commonsdk.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMEnvelopeBuild {
    public static boolean transmissionSendFlag;

    static {
            return
    }

    public UMEnvelopeBuild() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONObject add2CacheTable(android.content.Context r8, org.json.JSONObject r9, org.json.JSONObject r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            java.lang.String r0 = "share"
            java.lang.String r1 = "MobclickRT"
            if (r9 == 0) goto Lee
            if (r10 != 0) goto La
            goto Lee
        La:
            com.umeng.analytics.pro.i r2 = com.umeng.analytics.pro.i.a(r8)
            long r3 = java.lang.System.currentTimeMillis()
            java.util.UUID r5 = java.util.UUID.randomUUID()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "_tp"
            r6.put(r7, r12)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r2.c(r9)
            java.lang.String r7 = "_hd"
            r6.put(r7, r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = r2.c(r9)
            java.lang.String r2 = "_bd"
            r6.put(r2, r9)
            java.lang.String r9 = "_ts"
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r6.put(r9, r2)
            java.lang.String r9 = "_uuid"
            java.lang.String r2 = r5.toString()
            r6.put(r9, r2)
            java.lang.String r9 = "_re1"
            r6.put(r9, r11)
            java.lang.String r9 = "_re2"
            r6.put(r9, r13)
            com.umeng.analytics.pro.bk r8 = com.umeng.analytics.pro.bk.a(r8)
            java.lang.String r9 = "stf"
            r8.a(r9, r6)
            java.lang.String r8 = "i"
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 == 0) goto L6d
            java.lang.String r8 = "--->>> [有状态]inner业务，返回空 JSONObject。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r8)
            goto L99
        L6d:
            java.lang.String r8 = "s"
            boolean r8 = r8.equalsIgnoreCase(r12)
            java.lang.String r9 = "header"
            if (r8 == 0) goto L91
            java.lang.String r8 = "--->>> [有状态]分享业务 返回body。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: org.json.JSONException -> L99
            r11.<init>()     // Catch: org.json.JSONException -> L99
            r8.put(r9, r11)     // Catch: org.json.JSONException -> L99
            org.json.JSONObject r9 = r10.getJSONObject(r0)     // Catch: org.json.JSONException -> L99
            r8.put(r0, r9)     // Catch: org.json.JSONException -> L99
            return r8
        L91:
            java.lang.String r8 = "p"
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 == 0) goto L9f
        L99:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            return r8
        L9f:
            java.lang.String r8 = "t"
            boolean r8 = r8.equalsIgnoreCase(r12)
            java.lang.String r11 = "analytics"
            if (r8 == 0) goto Lcb
            java.lang.String r8 = "--->>> [有状态]统计业务 半开报文，返回body。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: org.json.JSONException -> Led
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> Led
            r12.<init>()     // Catch: org.json.JSONException -> Led
            r8.put(r9, r12)     // Catch: org.json.JSONException -> Led
            java.lang.String r9 = com.umeng.commonsdk.statistics.b.a(r11)     // Catch: org.json.JSONException -> Led
            org.json.JSONObject r11 = r10.getJSONObject(r11)     // Catch: org.json.JSONException -> Led
            r8.put(r9, r11)     // Catch: org.json.JSONException -> Led
            return r8
        Lcb:
            java.lang.String r8 = "--->>> [有状态]统计业务 闭合报文，返回body。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: org.json.JSONException -> Led
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> Led
            r12.<init>()     // Catch: org.json.JSONException -> Led
            r8.put(r9, r12)     // Catch: org.json.JSONException -> Led
            java.lang.String r9 = com.umeng.commonsdk.statistics.b.a(r11)     // Catch: org.json.JSONException -> Led
            org.json.JSONObject r11 = r10.getJSONObject(r11)     // Catch: org.json.JSONException -> Led
            r8.put(r9, r11)     // Catch: org.json.JSONException -> Led
            return r8
        Led:
            return r10
        Lee:
            java.lang.String r8 = "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r8)
            r8 = 0
            return r8
    }

    public static org.json.JSONObject buildEnvelopeWithExtHeader(android.content.Context r7, org.json.JSONObject r8, org.json.JSONObject r9) {
            java.lang.String r0 = "st"
            boolean r0 = r8.has(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "t"
        La:
            r5 = r0
            goto L1a
        Lc:
            java.lang.String r0 = "inner"
            boolean r0 = r9.has(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = "i"
            goto La
        L17:
            java.lang.String r0 = "a"
            goto La
        L1a:
            java.lang.String r4 = com.umeng.commonsdk.statistics.UMServerURL.PATH_ANALYTICS
            java.lang.String r6 = "9.6.5"
            r1 = r7
            r2 = r8
            r3 = r9
            org.json.JSONObject r7 = buildEnvelopeWithExtHeader(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static org.json.JSONObject buildEnvelopeWithExtHeader(android.content.Context r9, org.json.JSONObject r10, org.json.JSONObject r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            java.lang.String r0 = "--->>> [有状态]业务发起构建普通有状态信封请求。"
            java.lang.String r1 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r2 = "exception"
            r3 = 0
            if (r0 == 0) goto L1d
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1c
            r9.<init>()     // Catch: org.json.JSONException -> L1c
            r10 = 121(0x79, float:1.7E-43)
            r9.put(r2, r10)     // Catch: org.json.JSONException -> L1b
            return r9
        L1b:
            r3 = r9
        L1c:
            return r3
        L1d:
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r9)
            if (r0 != 0) goto L30
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2f
            r9.<init>()     // Catch: org.json.JSONException -> L2f
            r10 = 120(0x78, float:1.68E-43)
            r9.put(r2, r10)     // Catch: org.json.JSONException -> L2e
            return r9
        L2e:
            r3 = r9
        L2f:
            return r3
        L30:
            boolean r0 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r9)
            if (r0 == 0) goto L40
            java.lang.String r0 = "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            org.json.JSONObject r9 = add2CacheTable(r9, r10, r11, r12, r13, r14)
            return r9
        L40:
            java.lang.String r0 = "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            com.umeng.analytics.pro.bk r0 = com.umeng.analytics.pro.bk.a(r9)
            boolean r0 = r0.c()
            if (r0 == 0) goto L6b
            java.lang.String r0 = "--->>> [有状态]二级缓存为空，直接打信封"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            com.umeng.commonsdk.statistics.b r2 = new com.umeng.commonsdk.statistics.b
            r2.<init>()
            android.content.Context r3 = r9.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            org.json.JSONObject r9 = r2.a(r3, r4, r5, r6, r7, r8)
            return r9
        L6b:
            java.lang.String r0 = "--->>> [有状态]二级缓存不为空，写入二级缓存"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            org.json.JSONObject r10 = add2CacheTable(r9, r10, r11, r12, r13, r14)
            r11 = 32785(0x8011, float:4.5942E-41)
            boolean r12 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist(r11)
            if (r12 != 0) goto L88
            com.umeng.commonsdk.internal.b r12 = com.umeng.commonsdk.internal.b.a(r9)
            com.umeng.commonsdk.internal.c r12 = r12.a()
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r9, r11, r12, r3)
        L88:
            return r10
    }

    public static org.json.JSONObject buildSilentEnvelopeWithExtHeader(android.content.Context r1, org.json.JSONObject r2, org.json.JSONObject r3, java.lang.String r4) {
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r1)
            if (r0 != 0) goto L16
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15
            r2.<init>()     // Catch: org.json.JSONException -> L15
            java.lang.String r1 = "exception"
            r3 = 120(0x78, float:1.68E-43)
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L14
            return r2
        L14:
            r1 = r2
        L15:
            return r1
        L16:
            com.umeng.commonsdk.statistics.b r0 = new com.umeng.commonsdk.statistics.b
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            org.json.JSONObject r1 = r0.a(r1, r2, r3, r4)
            return r1
    }

    public static org.json.JSONObject buildZeroEnvelopeWithExtHeader(android.content.Context r1, org.json.JSONObject r2, org.json.JSONObject r3, java.lang.String r4) {
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r1)
            if (r0 != 0) goto L16
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15
            r2.<init>()     // Catch: org.json.JSONException -> L15
            java.lang.String r1 = "exception"
            r3 = 120(0x78, float:1.68E-43)
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L14
            return r2
        L14:
            r1 = r2
        L15:
            return r1
        L16:
            com.umeng.commonsdk.statistics.b r0 = new com.umeng.commonsdk.statistics.b
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            org.json.JSONObject r1 = r0.b(r1, r2, r3, r4)
            return r1
    }

    public static long getLastInstantBuildTime(android.content.Context r2) {
            if (r2 != 0) goto L5
            r0 = 0
            return r0
        L5:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            long r0 = com.umeng.commonsdk.framework.UMFrUtils.getLastInstantBuildTime(r2)
            return r0
    }

    public static long getLastSuccessfulBuildTime(android.content.Context r2) {
            if (r2 != 0) goto L5
            r0 = 0
            return r0
        L5:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            long r0 = com.umeng.commonsdk.framework.UMFrUtils.getLastSuccessfulBuildTime(r2)
            return r0
    }

    public static synchronized boolean getTransmissionSendFlag() {
            java.lang.Class<com.umeng.commonsdk.framework.UMEnvelopeBuild> r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.class
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.transmissionSendFlag     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static java.lang.String imprintProperty(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            if (r0 != 0) goto L3
            return r2
        L3:
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r0)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r0.c()
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    public static boolean isOnline(android.content.Context r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r1)
            boolean r1 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r1)
            if (r1 == 0) goto Le
            if (r0 != 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean isReadyBuild(android.content.Context r1, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r2) {
            com.umeng.commonsdk.framework.a.a(r1)
            r0 = 0
            boolean r1 = isRet(r1, r2, r0)
            return r1
    }

    public static boolean isReadyBuildNew(android.content.Context r2, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r3) {
            boolean r0 = getTransmissionSendFlag()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = isRet(r2, r3, r1)
            return r2
    }

    public static boolean isReadyBuildStateless() {
            boolean r0 = getTransmissionSendFlag()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    private static boolean isRet(android.content.Context r5, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r6, boolean r7) {
            if (r5 == 0) goto L47
            android.content.Context r0 = r5.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            boolean r1 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r0)
            int r2 = com.umeng.commonsdk.framework.UMFrUtils.envelopeFileNumber(r0)
            if (r1 == 0) goto L40
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r7 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            r3 = 1
            r4 = 0
            if (r6 != r7) goto L24
            boolean r5 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r5 == 0) goto L22
        L20:
            r7 = 0
            goto L40
        L22:
            r7 = 1
            goto L40
        L24:
            boolean r7 = com.umeng.commonsdk.framework.a.a()
            if (r7 == 0) goto L33
            int r5 = com.umeng.commonsdk.framework.a.b()
            long r5 = (long) r5
            com.umeng.commonsdk.framework.UMWorkDispatch.sendDelayProcessMsg(r5)
            goto L20
        L33:
            boolean r6 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r0, r6)
            if (r6 != 0) goto L20
            boolean r5 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r5)
            if (r5 == 0) goto L22
            goto L20
        L40:
            if (r1 == 0) goto L47
            if (r2 <= 0) goto L47
            com.umeng.commonsdk.framework.a.d()
        L47:
            return r7
    }

    public static long maxDataSpace(android.content.Context r2) {
            if (r2 != 0) goto L5
            r0 = 0
            return r0
        L5:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            long r0 = com.umeng.commonsdk.statistics.b.a(r2)
            return r0
    }

    public static void registerNetReceiver(android.content.Context r0) {
            com.umeng.commonsdk.framework.a.b(r0)
            return
    }

    public static void sendProcessNextMsgOnce() {
            com.umeng.commonsdk.framework.a.d()
            return
    }

    public static synchronized void setTransmissionSendFlag(boolean r1) {
            java.lang.Class<com.umeng.commonsdk.framework.UMEnvelopeBuild> r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.class
            monitor-enter(r0)
            com.umeng.commonsdk.framework.UMEnvelopeBuild.transmissionSendFlag = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
