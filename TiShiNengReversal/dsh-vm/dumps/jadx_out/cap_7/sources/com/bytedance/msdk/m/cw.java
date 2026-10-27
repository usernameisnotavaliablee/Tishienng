package com.bytedance.msdk.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private static long ae;
    private static boolean cw;
    static java.lang.Runnable j;
    private static long m;
    private static java.util.concurrent.atomic.AtomicBoolean r;
    private static final android.content.ComponentCallbacks up = null;
    private static long xt;






    private static class j extends android.content.BroadcastReceiver {
        private j() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ j(com.bytedance.msdk.m.cw.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
                r3 = this;
                if (r5 != 0) goto L3
                goto L34
            L3:
                com.bytedance.sdk.openadsdk.core.oq r0 = com.bytedance.sdk.openadsdk.core.oq.i()
                boolean r0 = r0.la()
                if (r0 == 0) goto Le
                goto L34
            Le:
                java.lang.String r0 = "--==-- event multi receiver"
                java.lang.String r1 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                java.lang.String r0 = "b_msg_id"
                r2 = -1
                int r5 = r5.getIntExtra(r0, r2)
                r0 = 1
                if (r5 != r0) goto L34
                boolean r4 = com.bytedance.msdk.tl.s.j(r4)     // Catch: java.lang.Throwable -> L29
                if (r4 == 0) goto L2b
                com.bytedance.msdk.up.cw.cw()     // Catch: java.lang.Throwable -> L29
                return
            L29:
                r4 = move-exception
                goto L31
            L2b:
                java.lang.String r4 = "--==-- event multi receiver not in main proc"
                com.bytedance.msdk.j.up.cw.j(r1, r4)     // Catch: java.lang.Throwable -> L29
                return
            L31:
                com.bytedance.sdk.component.utils.vl.j(r4)
            L34:
                return
        }
    }

    interface xt {
        public static final java.lang.String j = null;

        static {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = com.bytedance.msdk.tl.rn.j()
                r0.append(r1)
                java.lang.String r1 = ".openadsdk.permission.TT_PANGOLIN"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.bytedance.msdk.m.cw.xt.j = r0
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.bytedance.msdk.m.cw.r = r0
            com.bytedance.msdk.m.cw$2 r0 = new com.bytedance.msdk.m.cw$2
            r0.<init>()
            com.bytedance.msdk.m.cw.j = r0
            com.bytedance.msdk.m.cw$3 r0 = new com.bytedance.msdk.m.cw$3
            r0.<init>()
            com.bytedance.msdk.m.cw.up = r0
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ void ae() {
            ws()
            return
    }

    private static void av() {
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 == 0) goto L2b
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = com.bytedance.msdk.tl.rn.j()     // Catch: java.lang.Throwable -> L27
            r0.setPackage(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "com.bytedance.msdk.sdkinit.EventMultiFlushReceiver"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "b_msg_id"
            r2 = 1
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L27
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = com.bytedance.msdk.m.cw.xt.j     // Catch: java.lang.Throwable -> L27
            r1.sendBroadcast(r0, r2)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L2b:
            return
    }

    private static void az() {
            java.lang.String r0 = "AppStateListener开始注册"
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            com.bytedance.sdk.openadsdk.core.oq r0 = com.bytedance.sdk.openadsdk.core.oq.i()
            com.bytedance.sdk.openadsdk.core.rn.j r0 = r0.r()
            if (r0 == 0) goto L1e
            java.lang.String r2 = "AppStateListener注册成功"
            com.bytedance.msdk.j.up.cw.j(r1, r2)
            com.bytedance.msdk.m.cw$4 r1 = new com.bytedance.msdk.m.cw$4
            r1.<init>()
            r0.j(r1)
        L1e:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.jy()
            if (r0 == 0) goto L43
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "com.bytedance.msdk.sdkinit.EventMultiFlushReceiver"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.m.cw$j r2 = new com.bytedance.msdk.m.cw$j     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = com.bytedance.msdk.m.cw.xt.j     // Catch: java.lang.Throwable -> L3f
            r1.registerReceiver(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L43:
            return
    }

    public static java.lang.String cw() {
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "pangle"
            com.bytedance.msdk.j.j.r r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.cw()     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            java.lang.String r0 = ""
            return r0
    }

    private static void cw(android.content.Context r0) {
            com.bytedance.msdk.up.cw.j(r0)
            com.bytedance.msdk.up.cw.j()
            return
    }

    static /* synthetic */ long g() {
            long r0 = com.bytedance.msdk.m.cw.m
            return r0
    }

    private static void i() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.j(r1)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "InitHelper-->initSetting->loadData Exception="
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            return
    }

    public static long j() {
            long r0 = com.bytedance.msdk.m.cw.xt
            return r0
    }

    static /* synthetic */ long j(long r0) {
            com.bytedance.msdk.m.cw.m = r0
            return r0
    }

    public static void j(android.content.Context r0) {
            if (r0 == 0) goto L5
            com.bytedance.msdk.core.xt.j(r0)
        L5:
            return
    }

    static /* synthetic */ void j(android.content.Context r0, long r1) {
            xt(r0, r1)
            return
    }

    public static void j(android.util.SparseArray<java.lang.Object> r3) {
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()
            java.util.Collection r0 = r0.cw()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.j.j.r r1 = (com.bytedance.msdk.j.j.r) r1
            if (r1 == 0) goto Lc
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L26
            com.bytedance.msdk.api.r.ws r2 = r2.p()     // Catch: java.lang.Throwable -> L26
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L26
            goto Lc
        L26:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            goto Lc
        L2b:
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    private static void j(com.bytedance.msdk.api.r.j r3) {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r3.az()
            r0.j(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            long r1 = java.lang.System.currentTimeMillis()
            r0.j(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r3.j()
            r0.cw(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r3.xt()
            r0.m(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r3.av()
            r0.cw(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            boolean r1 = r1.cw()
            r0.up(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            boolean r1 = r1.r()
            r0.m(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            int r1 = r1.xt()
            r0.j(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            int[] r1 = r1.up()
            r0.j(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            java.lang.String[] r1 = r1.m()
            r0.j(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            boolean r1 = r1.j()
            r0.r(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r3.r()
            r0.r(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r3.up()
            r0.xt(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            java.lang.String r1 = r1.ae()
            r0.up(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            java.util.Map r1 = r1.tl()
            r0.j(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.m r1 = r3.g()
            r2 = 1
            r0.j(r1, r2)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.vl r1 = r3.m()
            java.lang.String r1 = r1.g()
            r0.ae(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.util.Map r1 = r3.oq()
            r0.xt(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.util.Map r1 = r3.ws()
            r0.cw(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r3.qv()
            r0.ae(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r3.vl()
            r0.tl(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            org.json.JSONObject r1 = r3.jy()
            r0.j(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.tl r1 = r3.ae()
            boolean r1 = r1.xt()
            r0.g(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.tl r1 = r3.ae()
            java.lang.String r1 = r1.j()
            r0.tl(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.tl r1 = r3.ae()
            boolean r1 = r1.cw()
            r0.oq(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.tl r1 = r3.ae()
            boolean r1 = r1.r()
            r0.qv(r1)
            java.util.Map r0 = r3.ws()
            if (r0 == 0) goto L16e
            java.util.Map r0 = r3.ws()
            java.lang.String r1 = "primeRitList"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L16d
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L16d
            r1.j(r0)     // Catch: java.lang.Throwable -> L16d
            goto L16e
        L16d:
        L16e:
            com.bytedance.msdk.api.r.r r0 = r3.tl()
            if (r0 == 0) goto L183
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.r r3 = r3.tl()
            java.lang.String r3 = r3.j()
            r0.xt(r3)
        L183:
            return
    }

    public static void j(@androidx.annotation.NonNull com.bytedance.msdk.api.r.j r0, android.content.Context r1) {
            j(r1)
            j(r0)
            xt(r1)
            return
    }

    private static void j(boolean r0) {
            com.bytedance.msdk.m.cw.cw = r0
            jy()
            return
    }

    private static void jy() {
            boolean r0 = com.bytedance.msdk.m.cw.cw
            if (r0 == 0) goto L19
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.api.r.j.g.j r0 = r0.hh()
            if (r0 == 0) goto L19
            r0.j()
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            r1 = 0
            r0.j(r1)
        L19:
            return
    }

    private static void kt() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.la()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r0 = r0.gq()
            java.lang.String r1 = com.bytedance.msdk.tl.mi.j()
            r2 = 1
            r3 = 0
            com.bytedance.msdk.up.m.j(r3, r3, r1, r2)
            java.lang.String r0 = com.bytedance.msdk.tl.mi.j(r0)
            com.bytedance.msdk.up.m.j(r0)
            return
    }

    static /* synthetic */ long m() {
            long r0 = com.bytedance.msdk.m.cw.xt
            return r0
    }

    private static void mi() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.l()
            if (r0 == 0) goto Le
            kt()
            return
        Le:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.bytedance.msdk.m.cw$5 r1 = new com.bytedance.msdk.m.cw$5
            r1.<init>()
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.postDelayed(r1, r2)
            return
    }

    static /* synthetic */ long oq() {
            long r0 = com.bytedance.msdk.m.cw.ae
            return r0
    }

    static /* synthetic */ void qv() {
            av()
            return
    }

    public static void r() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.bytedance.msdk.m.cw.r
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L35
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "初始化TNC initTTAdNetTNC：supportTNC："
            r0.<init>(r1)
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.h()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TNCManager_GroMore"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.h()
            if (r0 != 0) goto L2f
            goto L35
        L2f:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 != 0) goto L36
        L35:
            return
        L36:
            r1 = 1
            com.bytedance.msdk.r.xt r2 = com.bytedance.msdk.r.xt.j()     // Catch: java.lang.Exception -> L47
            com.bytedance.sdk.component.g.j r2 = r2.xt()     // Catch: java.lang.Exception -> L47
            com.bytedance.msdk.r.j r3 = new com.bytedance.msdk.r.j     // Catch: java.lang.Exception -> L47
            r3.<init>(r0)     // Catch: java.lang.Exception -> L47
            r2.j(r0, r1, r3)     // Catch: java.lang.Exception -> L47
        L47:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.bytedance.msdk.m.cw.r
            r0.set(r1)
            return
    }

    static /* synthetic */ void tl() {
            mi()
            return
    }

    public static void up() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            r1 = 1
            r0.xt(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = com.bytedance.msdk.m.cw.r
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            r()
        L13:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 != 0) goto L1a
            goto L2d
        L1a:
            java.lang.String r1 = "TNCManager_GroMore"
            java.lang.String r2 = "尝试刷新TNC tryRefreshTNCConfig"
            com.bytedance.msdk.j.up.cw.xt(r1, r2)     // Catch: java.lang.Exception -> L2d
            com.bytedance.msdk.r.xt r1 = com.bytedance.msdk.r.xt.j()     // Catch: java.lang.Exception -> L2d
            com.bytedance.sdk.component.g.j r1 = r1.xt()     // Catch: java.lang.Exception -> L2d
            r2 = 0
            r1.j(r0, r2)     // Catch: java.lang.Exception -> L2d
        L2d:
            return
    }

    static /* synthetic */ void vl() {
            kt()
            return
    }

    private static void w() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.ws.xt r0 = com.bytedance.msdk.core.ws.xt.j(r0)
            r1 = 0
            r0.j(r1)
            return
    }

    private static void ws() {
            android.app.Application r0 = com.bytedance.msdk.core.xt.j.j()
            java.lang.String r1 = "TTMediationSDK"
            if (r0 != 0) goto Le
            java.lang.String r0 = "lowMemoryListener注册失败, app = null"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            return
        Le:
            java.lang.String r2 = "lowMemoryListener注册成功"
            com.bytedance.msdk.j.up.cw.j(r1, r2)
            android.content.ComponentCallbacks r1 = com.bytedance.msdk.m.cw.up
            r0.unregisterComponentCallbacks(r1)
            r0.registerComponentCallbacks(r1)
            return
    }

    static /* synthetic */ long xt(long r0) {
            com.bytedance.msdk.m.cw.ae = r0
            return r0
    }

    private static void xt(android.content.Context r7) {
            java.lang.String r0 = "TTMediationSDK_SDK_Init"
            java.lang.String r1 = "msdk_init v1............."
            com.bytedance.msdk.j.up.cw.r(r0, r1)
            r0 = 1
            j(r0)
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.bytedance.msdk.m.cw.xt = r1
            az()
            android.content.Context r1 = r7.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.bytedance.msdk.m.r.j(r1)
            com.bytedance.msdk.tl.tl r1 = com.bytedance.msdk.tl.tl.j()
            r1.cw()
            long r1 = android.os.SystemClock.elapsedRealtime()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "pre_time"
            long r5 = com.bytedance.msdk.m.cw.xt     // Catch: java.lang.Throwable -> L38
            long r5 = r1 - r5
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L38
        L38:
            i()
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r1
            java.lang.String r1 = "cfg_time"
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L45
        L45:
            cw(r7)
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.m.cw$1 r2 = new com.bytedance.msdk.m.cw$1
            r2.<init>(r7)
            r1.j(r0, r3, r2)
            w()
            return
    }

    private static void xt(android.content.Context r1, long r2) {
            boolean r1 = com.bytedance.msdk.m.r.j()
            java.lang.String r0 = "TMe"
            if (r1 != 0) goto L11
            java.lang.String r1 = "-----==---- 延时上报sdk_init"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            com.bytedance.msdk.m.r.j(r2)
            return
        L11:
            java.lang.String r1 = "-----==---- 正常上报sdk_init"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            com.bytedance.msdk.m.r.xt(r2)
            return
    }

    public static boolean xt() {
            boolean r0 = com.bytedance.msdk.m.cw.cw
            return r0
    }
}
