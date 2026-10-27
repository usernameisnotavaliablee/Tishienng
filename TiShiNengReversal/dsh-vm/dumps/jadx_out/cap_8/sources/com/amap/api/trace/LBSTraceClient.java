package com.amap.api.trace;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LBSTraceClient {
    public static final java.lang.String LOCATE_TIMEOUT_ERROR = "定位超时";
    public static final java.lang.String MIN_GRASP_POINT_ERROR = "轨迹点太少或距离太近,轨迹纠偏失败";
    public static final java.lang.String TRACE_SUCCESS = "纠偏成功";
    public static final int TYPE_AMAP = 1;
    public static final int TYPE_BAIDU = 3;
    public static final int TYPE_GPS = 2;
    private static com.amap.api.trace.LBSTraceBase a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.amap.api.trace.LBSTraceClient f5648b;

    private LBSTraceClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public LBSTraceClient(android.content.Context r1) throws java.lang.Exception {
            r0 = this;
            r0.<init>()
            a(r1)
            return
    }

    private static void a() {
            r0 = 0
            com.amap.api.trace.LBSTraceClient.a = r0
            com.amap.api.trace.LBSTraceClient.f5648b = r0
            return
    }

    private static void a(android.content.Context r3) throws java.lang.Exception {
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r0 = com.amap.api.col.p0003l.ft.a(r3, r0)
            com.amap.api.col.3l.ft$c r1 = r0.a
            com.amap.api.col.3l.ft$c r2 = com.amap.api.col.3l.ft.c.a
            if (r1 != r2) goto L20
            if (r3 == 0) goto L1f
            com.amap.api.col.3l.c4 r0 = new com.amap.api.col.3l.c4
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r0.<init>(r3)
            com.amap.api.trace.LBSTraceClient.a = r0
        L1f:
            return
        L20:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = r0.f3702b
            r3.<init>(r0)
            throw r3
    }

    public static com.amap.api.trace.LBSTraceClient getInstance(android.content.Context r2) throws java.lang.Exception {
            com.amap.api.trace.LBSTraceClient r0 = com.amap.api.trace.LBSTraceClient.f5648b
            if (r0 != 0) goto L1c
            java.lang.Class<com.amap.api.trace.LBSTraceClient> r0 = com.amap.api.trace.LBSTraceClient.class
            monitor-enter(r0)
            com.amap.api.trace.LBSTraceClient r1 = com.amap.api.trace.LBSTraceClient.f5648b     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            a(r2)     // Catch: java.lang.Throwable -> L16
            com.amap.api.trace.LBSTraceClient r2 = new com.amap.api.trace.LBSTraceClient     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            com.amap.api.trace.LBSTraceClient.f5648b = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
        L1c:
            com.amap.api.trace.LBSTraceClient r2 = com.amap.api.trace.LBSTraceClient.f5648b
            return r2
    }

    public void destroy() {
            r1 = this;
            com.amap.api.trace.LBSTraceBase r0 = com.amap.api.trace.LBSTraceClient.a
            if (r0 == 0) goto La
            r0.destroy()
            a()
        La:
            return
    }

    public void queryProcessedTrace(int r2, java.util.List<com.amap.api.trace.TraceLocation> r3, int r4, com.amap.api.trace.TraceListener r5) {
            r1 = this;
            com.amap.api.trace.LBSTraceBase r0 = com.amap.api.trace.LBSTraceClient.a
            if (r0 == 0) goto L7
            r0.queryProcessedTrace(r2, r3, r4, r5)
        L7:
            return
    }

    public void startTrace(com.amap.api.trace.TraceStatusListener r2) {
            r1 = this;
            com.amap.api.trace.LBSTraceBase r0 = com.amap.api.trace.LBSTraceClient.a
            if (r0 == 0) goto L7
            r0.startTrace(r2)
        L7:
            return
    }

    public void stopTrace() {
            r1 = this;
            com.amap.api.trace.LBSTraceBase r0 = com.amap.api.trace.LBSTraceClient.a
            if (r0 == 0) goto L7
            r0.stopTrace()
        L7:
            return
    }
}
