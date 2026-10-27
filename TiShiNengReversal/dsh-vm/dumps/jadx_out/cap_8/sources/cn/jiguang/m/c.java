package cn.jiguang.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static org.json.JSONObject a(java.lang.String r2, boolean r3) {
            if (r3 != 0) goto L14
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "result"
            java.lang.String r1 = "1_0"
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "s_type"
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r2 = 0
            return r2
    }

    public static void a(android.content.Context r9) {
            java.lang.String r0 = cn.jiguang.h.b.d(r9)
            boolean r1 = cn.jiguang.h.b.c(r9)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "OFF"
            java.lang.String r4 = "ON"
            java.lang.String r5 = "JWakeLocalState"
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L1a
            if (r1 != 0) goto L39
        L18:
            r7 = 1
            goto L39
        L1a:
            boolean r2 = android.text.TextUtils.equals(r4, r0)
            if (r2 == 0) goto L23
            r2 = 0
        L21:
            r8 = 1
            goto L2e
        L23:
            boolean r2 = android.text.TextUtils.equals(r3, r0)
            if (r2 == 0) goto L2c
            r2 = 0
            r8 = 0
            goto L2e
        L2c:
            r2 = 1
            goto L21
        L2e:
            if (r2 != 0) goto L33
            if (r8 == r1) goto L39
            goto L18
        L33:
            java.lang.String r7 = "local wake state do not changed"
            cn.jiguang.w.f.c(r5, r7)
            r7 = r2
        L39:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "lastCacheWakeState:"
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = ",userWakeupEnable:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ",isNeedReport:"
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.c(r5, r0)
            if (r7 == 0) goto L93
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "status"
            if (r1 == 0) goto L69
            goto L6a
        L69:
            r6 = 2
        L6a:
            r0.put(r2, r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "aals"
            cn.jiguang.z.b.a(r9, r0, r2)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L75
            r3 = r4
        L75:
            cn.jiguang.h.b.j(r9, r3)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "report local wake state failed, error:"
            r0.append(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            cn.jiguang.w.f.i(r5, r9)
            return
        L93:
            java.lang.String r9 = "do not need report local wake state"
            cn.jiguang.w.f.c(r5, r9)
            return
    }

    public static void a(android.content.Context r11, long r12) {
            java.lang.String r0 = "provider"
            java.lang.String r1 = "service"
            java.lang.String r2 = "activity"
            java.lang.String r3 = "JWakeLocalState"
            java.lang.String r4 = "reportWake"
            long r5 = cn.jiguang.h.b.f(r11, r4)     // Catch: java.lang.Throwable -> L2c
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            long r7 = r7 - r5
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 >= 0) goto L2f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r11.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "not report component status business time, interval: "
            r11.append(r0)     // Catch: java.lang.Throwable -> L2c
            r11.append(r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2c
            cn.jiguang.w.f.c(r3, r11)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r11 = move-exception
            goto Lda
        L2f:
            java.util.HashMap r12 = b(r11)     // Catch: java.lang.Throwable -> L2c
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c
            r13.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r5 = r12.get(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r2 = a(r2, r5)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L4c
            org.json.JSONArray r13 = r13.put(r2)     // Catch: java.lang.Throwable -> L2c
        L4c:
            java.lang.Object r2 = r12.get(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r1 = a(r1, r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L60
            org.json.JSONArray r13 = r13.put(r1)     // Catch: java.lang.Throwable -> L2c
        L60:
            java.lang.Object r12 = r12.get(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L2c
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r12 = a(r0, r12)     // Catch: java.lang.Throwable -> L2c
            if (r12 == 0) goto L74
            org.json.JSONArray r13 = r13.put(r12)     // Catch: java.lang.Throwable -> L2c
        L74:
            int r12 = r13.length()     // Catch: java.lang.Throwable -> L2c
            if (r12 <= 0) goto Ld9
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c
            r12.<init>()     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            r7 = 1000(0x3e8, double:4.94E-321)
            long r9 = r5 / r7
            r1.put(r9)     // Catch: java.lang.Throwable -> L2c
            long r5 = r5 / r7
            r7 = 1
            long r5 = r5 + r7
            r1.put(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "duration"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "statistics"
            r0.put(r1, r13)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "c_type"
            java.lang.String r1 = "aacs"
            r0.put(r13, r1)     // Catch: java.lang.Throwable -> L2c
            r12.put(r0)     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c
            r13.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "slice_index"
            r1 = 1
            r13.put(r0, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "slice_count"
            r13.put(r0, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "data"
            r13.put(r0, r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = "sequence"
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2c
            r13.put(r12, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = "collect_statistic"
            cn.jiguang.z.b.a(r11, r13, r12)     // Catch: java.lang.Throwable -> L2c
            cn.jiguang.h.b.e(r11, r4)     // Catch: java.lang.Throwable -> L2c
        Ld9:
            return
        Lda:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "reportWakeComponentsState failed, "
            r12.append(r13)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            cn.jiguang.w.f.i(r3, r11)
            return
    }

    private static java.util.HashMap<java.lang.String, java.lang.Boolean> b(android.content.Context r9) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r9.getPackageName()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "cn.jpush.android.service.DActivity"
            r2.setClassName(r1, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "cn.jpush.android.service.BActivity"
            r3.setClassName(r1, r4)
            r4 = 0
            boolean r2 = cn.jiguang.p.a.a(r9, r1, r2, r4)
            boolean r3 = cn.jiguang.p.a.a(r9, r1, r3, r4)
            r2 = r2 | r3
            java.lang.String r3 = "activity"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r0.put(r3, r5)
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.setPackage(r1)
            java.lang.String r5 = "cn.jpush.android.intent.DaemonService"
            r3.setAction(r5)
            r5 = 512(0x200, float:7.17E-43)
            android.content.pm.ResolveInfo r3 = r9.resolveService(r3, r5)
            r6 = 1
            if (r3 == 0) goto L52
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            boolean r3 = r3.exported
            if (r3 == 0) goto L52
            r3 = 1
            goto L53
        L52:
            r3 = 0
        L53:
            java.lang.String r7 = "service"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r0.put(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r1 = ".DownloadProvider"
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            android.content.pm.ProviderInfo r9 = r9.resolveContentProvider(r1, r5)
            if (r9 == 0) goto L78
            boolean r9 = r9.exported
            if (r9 == 0) goto L78
            r4 = 1
        L78:
            java.lang.String r9 = "provider"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.put(r9, r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "check w component status, activity["
            r9.append(r1)
            r9.append(r2)
            java.lang.String r1 = "]-service["
            r9.append(r1)
            r9.append(r3)
            java.lang.String r1 = "]-provider["
            r9.append(r1)
            r9.append(r4)
            java.lang.String r1 = "]"
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "JWakeLocalState"
            cn.jiguang.w.f.c(r1, r9)
            return r0
    }
}
