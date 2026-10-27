package com.tencent.open.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h {
    protected static com.tencent.open.b.h a;
    protected java.util.Random b;
    protected java.util.List<java.io.Serializable> c;
    protected java.util.List<java.io.Serializable> d;
    protected android.os.HandlerThread e;
    protected android.os.Handler f;
    protected java.util.concurrent.Executor g;
    protected java.util.concurrent.Executor h;





    private h() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.e = r0
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r3.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r3.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r3.c = r0
            java.util.concurrent.Executor r0 = com.tencent.open.utils.l.b()
            r3.g = r0
            java.util.concurrent.Executor r0 = com.tencent.open.utils.l.b()
            r3.h = r0
            android.os.HandlerThread r0 = r3.e
            if (r0 != 0) goto L41
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "opensdk.report.handlerthread"
            r2 = 10
            r0.<init>(r1, r2)
            r3.e = r0
            r0.start()
        L41:
            android.os.HandlerThread r0 = r3.e
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L5e
            android.os.HandlerThread r0 = r3.e
            android.os.Looper r0 = r0.getLooper()
            if (r0 == 0) goto L5e
            com.tencent.open.b.h$1 r0 = new com.tencent.open.b.h$1
            android.os.HandlerThread r1 = r3.e
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r3, r1)
            r3.f = r0
        L5e:
            return
    }

    public static synchronized com.tencent.open.b.h a() {
            java.lang.Class<com.tencent.open.b.h> r0 = com.tencent.open.b.h.class
            monitor-enter(r0)
            com.tencent.open.b.h r1 = com.tencent.open.b.h.a     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.open.b.h r1 = new com.tencent.open.b.h     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.tencent.open.b.h.a = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.tencent.open.b.h r1 = com.tencent.open.b.h.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    protected int a(int r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L16
            android.content.Context r2 = com.tencent.open.utils.g.a()
            com.tencent.open.utils.i r2 = com.tencent.open.utils.i.a(r2, r0)
            java.lang.String r0 = "Common_CGIReportFrequencySuccess"
            int r2 = r2.a(r0)
            if (r2 != 0) goto L15
            r2 = 10
        L15:
            return r2
        L16:
            android.content.Context r2 = com.tencent.open.utils.g.a()
            com.tencent.open.utils.i r2 = com.tencent.open.utils.i.a(r2, r0)
            java.lang.String r0 = "Common_CGIReportFrequencyFailed"
            int r2 = r2.a(r0)
            if (r2 != 0) goto L28
            r2 = 100
        L28:
            return r2
    }

    public void a(android.os.Bundle r3, java.lang.String r4, boolean r5) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L27
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->reportVia, bundle: "
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.ReportManager"
            com.tencent.open.log.SLog.v(r1, r0)
            java.lang.String r0 = "report_via"
            boolean r4 = r2.a(r0, r4)
            if (r4 != 0) goto L28
            if (r5 != 0) goto L28
        L27:
            return
        L28:
            java.util.concurrent.Executor r4 = r2.g
            com.tencent.open.b.h$2 r0 = new com.tencent.open.b.h$2
            r0.<init>(r2, r3, r5)
            r4.execute(r0)
            return
    }

    public void a(java.lang.String r12, long r13, long r15, long r17, int r19) {
            r11 = this;
            java.lang.String r9 = ""
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r4 = r15
            r6 = r17
            r8 = r19
            r0.a(r1, r2, r4, r6, r8, r9, r10)
            return
    }

    public void a(java.lang.String r2, long r3, long r5, long r7, int r9, java.lang.String r10, boolean r11) {
            r1 = this;
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "-->reportCgi, command: "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r2 = " | startTime: "
            r11.append(r2)
            r11.append(r3)
            java.lang.String r2 = " | reqSize:"
            r11.append(r2)
            r11.append(r5)
            java.lang.String r2 = " | rspSize: "
            r11.append(r2)
            r11.append(r7)
            java.lang.String r2 = " | responseCode: "
            r11.append(r2)
            r11.append(r9)
            java.lang.String r2 = " | detail: "
            r11.append(r2)
            r11.append(r10)
            java.lang.String r2 = r11.toString()
            java.lang.String r3 = "openSDK_LOG.ReportManager"
            com.tencent.open.log.SLog.v(r3, r2)
            return
    }

    public void a(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            android.content.Context r0 = com.tencent.open.utils.g.a()
            boolean r0 = com.tencent.open.utils.m.b(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            com.tencent.open.b.h$4 r0 = new com.tencent.open.b.h$4
            r0.<init>(r1, r2, r3)
            com.tencent.open.utils.l.b(r0)
            return
    }

    protected boolean a(java.lang.String r5, int r6) {
            r4 = this;
            java.lang.String r0 = "report_cgi"
            boolean r0 = r5.equals(r0)
            r1 = 5
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1e
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r2)
            java.lang.String r2 = "Common_CGIReportMaxcount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L1c
            goto L38
        L1c:
            r1 = r0
            goto L38
        L1e:
            java.lang.String r0 = "report_via"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r2)
            java.lang.String r2 = "Agent_ReportBatchCount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L1c
            goto L38
        L37:
            r1 = 0
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "-->availableCount, report: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = " | dataSize: "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = " | maxcount: "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "openSDK_LOG.ReportManager"
            com.tencent.open.log.SLog.d(r0, r5)
            if (r6 < r1) goto L62
            r5 = 1
            return r5
        L62:
            return r3
    }

    protected boolean a(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->availableFrequency, report: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " | ext: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.ReportManager"
            com.tencent.open.log.SLog.d(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r0 == 0) goto L26
            return r2
        L26:
            java.lang.String r0 = "report_cgi"
            boolean r0 = r6.equals(r0)
            r3 = 1
            r4 = 100
            if (r0 == 0) goto L45
            int r6 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L44
            int r6 = r5.a(r6)
            java.util.Random r7 = r5.b
            int r7 = r7.nextInt(r4)
            if (r7 >= r6) goto L42
            r2 = 1
        L42:
            r4 = r6
            goto L5b
        L44:
            return r2
        L45:
            java.lang.String r0 = "report_via"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L5b
            int r6 = com.tencent.open.b.f.a(r7)
            java.util.Random r7 = r5.b
            int r7 = r7.nextInt(r4)
            if (r7 >= r6) goto L42
            r4 = r6
            r2 = 1
        L5b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "-->availableFrequency, result: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " | frequency: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.open.log.SLog.d(r1, r6)
            return r2
    }

    protected void b() {
            r0 = this;
            return
    }

    protected java.util.Map<java.lang.String, java.lang.String> c() {
            r11 = this;
            java.lang.String r0 = "data"
            java.lang.String r1 = "report_via"
            java.util.List r1 = com.tencent.open.b.g.b(r1)
            if (r1 == 0) goto Lf
            java.util.List<java.io.Serializable> r2 = r11.d
            r2.addAll(r1)
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "-->prepareViaData, mViaList size: "
            r1.append(r2)
            java.util.List<java.io.Serializable> r2 = r11.d
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "openSDK_LOG.ReportManager"
            com.tencent.open.log.SLog.d(r2, r1)
            java.util.List<java.io.Serializable> r1 = r11.d
            int r1 = r1.size()
            r3 = 0
            if (r1 != 0) goto L35
            return r3
        L35:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List<java.io.Serializable> r4 = r11.d
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r5 = r4.hasNext()
            java.lang.String r6 = "-->prepareViaData, put bundle to json array exception"
            if (r5 == 0) goto L86
            java.lang.Object r5 = r4.next()
            java.io.Serializable r5 = (java.io.Serializable) r5
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            com.tencent.open.b.c r5 = (com.tencent.open.b.c) r5
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r5.a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L5f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L82
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r5.a     // Catch: org.json.JSONException -> L78
            java.lang.Object r10 = r10.get(r9)     // Catch: org.json.JSONException -> L78
            java.lang.String r10 = (java.lang.String) r10     // Catch: org.json.JSONException -> L78
            if (r10 != 0) goto L7a
            java.lang.String r10 = ""
            goto L7a
        L78:
            r9 = move-exception
            goto L7e
        L7a:
            r7.put(r9, r10)     // Catch: org.json.JSONException -> L78
            goto L5f
        L7e:
            com.tencent.open.log.SLog.e(r2, r6, r9)
            goto L5f
        L82:
            r1.put(r7)
            goto L40
        L86:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "-->prepareViaData, JSONArray array: "
            r4.append(r5)
            java.lang.String r5 = r1.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.open.log.SLog.v(r2, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb3
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = r4.toString()
            r1.put(r0, r2)
            return r1
        Lb3:
            r0 = move-exception
            com.tencent.open.log.SLog.e(r2, r6, r0)
            return r3
    }

    protected void d() {
            r2 = this;
            android.content.Context r0 = com.tencent.open.utils.g.a()
            boolean r0 = com.tencent.open.utils.m.b(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.concurrent.Executor r0 = r2.g
            com.tencent.open.b.h$3 r1 = new com.tencent.open.b.h$3
            r1.<init>(r2)
            r0.execute(r1)
            return
    }
}
