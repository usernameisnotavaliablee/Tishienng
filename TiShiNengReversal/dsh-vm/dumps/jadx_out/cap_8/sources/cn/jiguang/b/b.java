package cn.jiguang.b;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jiguang.au.b implements cn.jiguang.api.ReportCallBack {
    public b() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "ReportCrashLogDirect"
            r1.f668h = r0
            return
    }

    private org.json.JSONObject a(android.content.Context r5) {
            r4 = this;
            org.json.JSONArray r0 = cn.jiguang.b.a.c(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "crashlogs"
            r2.put(r3, r0)     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = "network_type"
            java.lang.String r3 = cn.jiguang.av.n.c(r5)     // Catch: java.lang.Exception -> L3e
            r2.put(r0, r3)     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = "crash_log"
            cn.jiguang.d.a.a(r5, r2, r0)     // Catch: java.lang.Exception -> L3e
            cn.jiguang.v.g r5 = cn.jiguang.v.g.a()     // Catch: java.lang.Exception -> L3e
            r0 = 68
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Exception -> L3e
            boolean r0 = r5 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L31
            r1 = r5
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L3e
        L31:
            if (r1 == 0) goto L3e
            int r5 = r1.length()     // Catch: java.lang.Exception -> L3e
            if (r5 <= 0) goto L3e
            java.lang.String r5 = "device_info"
            r2.put(r5, r1)     // Catch: java.lang.Exception -> L3e
        L3e:
            return r2
    }

    @Override // cn.jiguang.au.b
    public void a() {
            r4 = this;
            java.lang.String r0 = "ReportCrashLogDirect"
            r1 = 0
            android.content.Context r1 = cn.jiguang.av.c.a(r1)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            java.lang.String r1 = "ReportDirect context is null"
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            goto L1b
        L11:
            org.json.JSONObject r2 = r4.a(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L1a
            cn.jiguang.y.g.a(r1, r2, r4)     // Catch: java.lang.Throwable -> Lf
        L1a:
            return
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "run report crash e:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.l(r0, r1)
            return
    }

    @Override // cn.jiguang.api.ReportCallBack
    public void onFinish(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ReportDirect finish : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReportCrashLogDirect"
            cn.jiguang.w.f.i(r1, r0)
            if (r3 != 0) goto L20
            r3 = 0
            android.content.Context r3 = cn.jiguang.av.c.a(r3)
            cn.jiguang.b.a.d(r3)
        L20:
            return
    }
}
