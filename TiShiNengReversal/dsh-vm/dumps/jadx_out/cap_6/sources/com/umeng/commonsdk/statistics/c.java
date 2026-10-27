package com.umeng.commonsdk.statistics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final java.lang.String o = "thtstart";
    private static final java.lang.String p = "gkvc";

    /* renamed from: q, reason: collision with root package name */
    private static final java.lang.String f38q = "ekvc";
    java.lang.String a;
    private final int e;
    private com.umeng.commonsdk.statistics.internal.c f;
    private com.umeng.commonsdk.statistics.idtracking.ImprintHandler g;
    private com.umeng.commonsdk.statistics.idtracking.e h;
    private com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a i;
    private com.umeng.commonsdk.statistics.noise.ABTest j;
    private com.umeng.commonsdk.statistics.noise.Defcon k;
    private long l;
    private int m;
    private int n;
    private android.content.Context r;


    public c(android.content.Context r6) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.e = r0
            r0 = 0
            r5.h = r0
            r5.i = r0
            r5.j = r0
            r5.k = r0
            r1 = 0
            r5.l = r1
            r3 = 0
            r5.m = r3
            r5.n = r3
            r5.a = r0
            r5.r = r6
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r6)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r6 = r6.c()
            r5.i = r6
            android.content.Context r6 = r5.r
            com.umeng.commonsdk.statistics.noise.Defcon r6 = com.umeng.commonsdk.statistics.noise.Defcon.getService(r6)
            r5.k = r6
            android.content.Context r6 = r5.r
            android.content.SharedPreferences r6 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r6)
            java.lang.String r4 = "thtstart"
            long r1 = r6.getLong(r4, r1)
            r5.l = r1
            java.lang.String r1 = "gkvc"
            int r1 = r6.getInt(r1, r3)
            r5.m = r1
            java.lang.String r1 = "ekvc"
            int r6 = r6.getInt(r1, r3)
            r5.n = r6
            android.content.Context r6 = r5.r
            java.lang.String r1 = "track_list"
            java.lang.String r6 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r6, r1, r0)
            r5.a = r6
            android.content.Context r6 = r5.r
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r6)
            r5.g = r6
            com.umeng.commonsdk.statistics.c$1 r0 = new com.umeng.commonsdk.statistics.c$1
            r0.<init>(r5)
            r6.a(r0)
            android.content.Context r6 = r5.r
            boolean r6 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r6)
            if (r6 != 0) goto L76
            android.content.Context r6 = r5.r
            com.umeng.commonsdk.statistics.idtracking.e r6 = com.umeng.commonsdk.statistics.idtracking.e.a(r6)
            r5.h = r6
        L76:
            com.umeng.commonsdk.statistics.internal.c r6 = new com.umeng.commonsdk.statistics.internal.c
            android.content.Context r0 = r5.r
            r6.<init>(r0)
            r5.f = r6
            android.content.Context r0 = r5.r
            com.umeng.commonsdk.statistics.internal.StatTracer r0 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r0)
            r6.a(r0)
            return
    }

    private int a(byte[] r4) {
            r3 = this;
            com.umeng.commonsdk.statistics.proto.Response r0 = new com.umeng.commonsdk.statistics.proto.Response
            r0.<init>()
            com.umeng.analytics.pro.bu r1 = new com.umeng.analytics.pro.bu
            com.umeng.analytics.pro.cj$a r2 = new com.umeng.analytics.pro.cj$a
            r2.<init>()
            r1.<init>(r2)
            r2 = 1
            r1.a(r0, r4)     // Catch: java.lang.Throwable -> L26
            int r4 = r0.resp_code     // Catch: java.lang.Throwable -> L26
            if (r4 != r2) goto L2c
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r4 = r3.g     // Catch: java.lang.Throwable -> L26
            com.umeng.commonsdk.statistics.proto.d r1 = r0.getImprint()     // Catch: java.lang.Throwable -> L26
            r4.b(r1)     // Catch: java.lang.Throwable -> L26
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r4 = r3.g     // Catch: java.lang.Throwable -> L26
            r4.d()     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r4 = move-exception
            android.content.Context r1 = r3.r
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r4)
        L2c:
            int r4 = r0.resp_code
            if (r4 != r2) goto L32
            r4 = 2
            return r4
        L32:
            r4 = 3
            return r4
    }

    static /* synthetic */ com.umeng.commonsdk.statistics.noise.Defcon a(com.umeng.commonsdk.statistics.c r0) {
            com.umeng.commonsdk.statistics.noise.Defcon r0 = r0.k
            return r0
    }

    static /* synthetic */ android.content.Context b(com.umeng.commonsdk.statistics.c r0) {
            android.content.Context r0 = r0.r
            return r0
    }

    public boolean a(java.io.File r10) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r10.getPath()     // Catch: java.lang.Throwable -> L42
            byte[] r1 = com.umeng.commonsdk.framework.UMFrUtils.toByteArray(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> L42
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L1a
            return r0
        L1a:
            android.content.Context r2 = r9.r     // Catch: java.lang.Throwable -> L42
            com.umeng.commonsdk.statistics.internal.a r2 = com.umeng.commonsdk.statistics.internal.a.a(r2)     // Catch: java.lang.Throwable -> L42
            r2.e(r10)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r2.a(r10)     // Catch: java.lang.Throwable -> L42
            boolean r4 = r2.b(r10)     // Catch: java.lang.Throwable -> L42
            boolean r5 = r2.c(r10)     // Catch: java.lang.Throwable -> L42
            boolean r2 = r2.d(r10)     // Catch: java.lang.Throwable -> L42
            java.lang.String r10 = com.umeng.commonsdk.stateless.d.d(r10)     // Catch: java.lang.Throwable -> L42
            boolean r6 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L45
            java.lang.String r10 = com.umeng.commonsdk.stateless.d.c(r10)     // Catch: java.lang.Throwable -> L42
            goto L51
        L42:
            r10 = move-exception
            goto L12a
        L45:
            if (r2 == 0) goto L4a
            java.lang.String r10 = com.umeng.commonsdk.statistics.UMServerURL.SILENT_HEART_BEAT     // Catch: java.lang.Throwable -> L42
            goto L51
        L4a:
            if (r5 == 0) goto L4f
            java.lang.String r10 = com.umeng.commonsdk.statistics.UMServerURL.ZCFG_PATH     // Catch: java.lang.Throwable -> L42
            goto L51
        L4f:
            java.lang.String r10 = com.umeng.commonsdk.statistics.UMServerURL.PATH_ANALYTICS     // Catch: java.lang.Throwable -> L42
        L51:
            com.umeng.commonsdk.statistics.internal.c r6 = r9.f     // Catch: java.lang.Throwable -> L42
            byte[] r10 = r6.a(r1, r3, r5, r10)     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r10 != 0) goto L5c
            r10 = 1
            goto L60
        L5c:
            int r10 = r9.a(r10)     // Catch: java.lang.Throwable -> L42
        L60:
            boolean r6 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L42
            r7 = 2
            java.lang.String r8 = "MobclickRT"
            if (r6 == 0) goto La2
            if (r2 == 0) goto L73
            if (r10 != r7) goto L73
            java.lang.String r3 = "heart beat req: succeed."
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r3)     // Catch: java.lang.Throwable -> L42
            goto La2
        L73:
            if (r5 == 0) goto L7d
            if (r10 != r7) goto L7d
            java.lang.String r3 = "Zero req: succeed."
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r3)     // Catch: java.lang.Throwable -> L42
            goto La2
        L7d:
            if (r4 == 0) goto L8c
            if (r10 != r7) goto L8c
            java.lang.String r3 = "本次启动数据: 发送成功!"
            com.umeng.commonsdk.statistics.common.MLog.d(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "Send instant data: succeed."
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r3)     // Catch: java.lang.Throwable -> L42
            goto La2
        L8c:
            if (r3 == 0) goto L9b
            if (r10 != r7) goto L9b
            java.lang.String r3 = "普通统计数据: 发送成功!"
            com.umeng.commonsdk.statistics.common.MLog.d(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "Send analytics data: succeed."
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r3)     // Catch: java.lang.Throwable -> L42
            goto La2
        L9b:
            if (r10 != r7) goto La2
            java.lang.String r3 = "Inner req: succeed."
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r3)     // Catch: java.lang.Throwable -> L42
        La2:
            if (r10 == r7) goto Ld4
            r2 = 3
            if (r10 == r2) goto La9
            goto L126
        La9:
            android.content.Context r2 = r9.r     // Catch: java.lang.Throwable -> L42
            com.umeng.commonsdk.statistics.internal.StatTracer r2 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r2)     // Catch: java.lang.Throwable -> L42
            r2.saveSate()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L126
            com.umeng.commonsdk.config.FieldManager r10 = com.umeng.commonsdk.config.FieldManager.a()     // Catch: java.lang.Throwable -> L42
            android.content.Context r2 = r9.r     // Catch: java.lang.Throwable -> L42
            r10.a(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r10 = "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。"
            com.umeng.commonsdk.debug.UMRTLog.e(r8, r10)     // Catch: java.lang.Throwable -> L42
            android.content.Context r10 = r9.r     // Catch: java.lang.Throwable -> L42
            com.umeng.commonsdk.internal.b r2 = com.umeng.commonsdk.internal.b.a(r10)     // Catch: java.lang.Throwable -> L42
            com.umeng.commonsdk.internal.c r2 = r2.a()     // Catch: java.lang.Throwable -> L42
            r3 = 0
            r4 = 32784(0x8010, float:4.594E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r10, r4, r2, r3)     // Catch: java.lang.Throwable -> L42
            return r1
        Ld4:
            com.umeng.commonsdk.statistics.idtracking.e r3 = r9.h     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto Ldb
            r3.e()     // Catch: java.lang.Throwable -> L42
        Ldb:
            android.content.Context r3 = r9.r     // Catch: java.lang.Throwable -> L42
            com.umeng.commonsdk.statistics.internal.StatTracer r3 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r3)     // Catch: java.lang.Throwable -> L42
            r3.saveSate()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L126
            android.content.Context r2 = r9.r     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "iss"
            java.lang.String r4 = ""
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r2, r3, r4)     // Catch: java.lang.Throwable -> L42
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L126
            java.lang.String r3 = "1"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L10d
            java.lang.String r2 = "--->>> 更新静默心跳最后一次成功请求时间."
            com.umeng.commonsdk.debug.UMRTLog.e(r8, r2)     // Catch: java.lang.Throwable -> L42
            android.content.Context r2 = r9.r     // Catch: java.lang.Throwable -> L42
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42
            com.umeng.commonsdk.utils.c.a(r2, r3)     // Catch: java.lang.Throwable -> L42
            goto L126
        L10d:
            java.lang.String r3 = "0"
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L126
            java.lang.String r2 = "--->>> 静默模式 -> 正常模式。重置 last req time"
            com.umeng.commonsdk.debug.UMRTLog.e(r8, r2)     // Catch: java.lang.Throwable -> L42
            android.content.Context r2 = r9.r     // Catch: java.lang.Throwable -> L42
            r3 = 0
            com.umeng.commonsdk.utils.c.a(r2, r3)     // Catch: java.lang.Throwable -> L42
            android.content.Context r2 = r9.r     // Catch: java.lang.Throwable -> L42
            com.umeng.commonsdk.utils.c.d(r2)     // Catch: java.lang.Throwable -> L42
        L126:
            if (r10 != r7) goto L129
            return r1
        L129:
            return r0
        L12a:
            android.content.Context r1 = r9.r
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r10)
            return r0
    }
}
