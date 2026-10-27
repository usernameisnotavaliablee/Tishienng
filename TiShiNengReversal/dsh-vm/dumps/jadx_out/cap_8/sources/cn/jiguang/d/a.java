package cn.jiguang.d;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static cn.jiguang.analytics.page.ActivityLifecycle a;


    static {
            cn.jiguang.analytics.page.ActivityLifecycle r0 = new cn.jiguang.analytics.page.ActivityLifecycle
            r0.<init>()
            cn.jiguang.d.a.a = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jiguang.analytics.page.ActivityLifecycle a() {
            cn.jiguang.analytics.page.ActivityLifecycle r0 = cn.jiguang.d.a.a
            return r0
    }

    public static org.json.JSONObject a(android.content.Context r3, org.json.JSONObject r4, java.lang.String r5) {
            if (r4 != 0) goto L7
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L7:
            java.lang.String r0 = "app_list"
            boolean r0 = android.text.TextUtils.equals(r5, r0)     // Catch: org.json.JSONException -> L19
            if (r0 == 0) goto L1b
            java.lang.String r0 = "it"
        L11:
            long r1 = cn.jiguang.d.b.b(r3)     // Catch: org.json.JSONException -> L19
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L19
            goto L1e
        L19:
            r3 = move-exception
            goto L39
        L1b:
            java.lang.String r0 = "itime"
            goto L11
        L1e:
            java.lang.String r0 = "type"
            r4.put(r0, r5)     // Catch: org.json.JSONException -> L19
            cn.jiguang.e.a r5 = cn.jiguang.e.a.aa()     // Catch: org.json.JSONException -> L19
            java.lang.Object r3 = cn.jiguang.e.b.a(r3, r5)     // Catch: org.json.JSONException -> L19
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L19
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L19
            if (r5 != 0) goto L38
            java.lang.String r5 = "account_id"
            r4.put(r5, r3)     // Catch: org.json.JSONException -> L19
        L38:
            return r4
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "fillBase exception:"
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "JBridgeHelper"
            cn.jiguang.w.f.i(r5, r3)
            return r4
    }

    public static void a(android.app.Application.ActivityLifecycleCallbacks r1) {
            cn.jiguang.analytics.page.ActivityLifecycle r0 = cn.jiguang.d.a.a
            r0.addActivityLifecycleCallbacks(r1)
            return
    }

    public static synchronized void a(android.content.Context r2) {
            java.lang.Class<cn.jiguang.d.a> r0 = cn.jiguang.d.a.class
            monitor-enter(r0)
            r1 = 1
            a(r2, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public static void a(android.content.Context r7, java.lang.Object r8) {
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            java.lang.String r2 = "JCore"
            r3 = 14
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void a(android.content.Context r1, org.json.JSONObject r2) {
            r0 = 0
            a(r1, r2, r0)
            return
    }

    public static void a(android.content.Context r10, org.json.JSONObject r11, boolean r12) {
            java.lang.String r0 = "JBridgeHelper"
            java.lang.String r1 = "content"
            org.json.JSONObject r11 = r11.optJSONObject(r1)     // Catch: java.lang.Throwable -> L49
            if (r11 == 0) goto L109
            java.lang.String r1 = "log_enable"
            int r1 = r11.optInt(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "log_print"
            int r2 = r11.optInt(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "upload_enable"
            int r3 = r11.optInt(r3)     // Catch: java.lang.Throwable -> L49
            r4 = 1
            if (r12 == 0) goto L4c
            java.lang.String r5 = "server_upload_state"
            int r5 = r11.optInt(r5, r4)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.c.b(r10, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r6.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = "server_upload_state: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L49
            r6.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = ", sp state: "
            r6.append(r5)     // Catch: java.lang.Throwable -> L49
            int r5 = cn.jiguang.e.c.e(r10)     // Catch: java.lang.Throwable -> L49
            r6.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r10 = move-exception
            goto L10a
        L4c:
            cn.jiguang.e.a r5 = cn.jiguang.e.a.aL()     // Catch: java.lang.Throwable -> L49
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a[] r6 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L49
            r7 = 0
            r6[r7] = r5     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.b.a(r10, r6)     // Catch: java.lang.Throwable -> L49
            if (r2 != r4) goto L64
            r5 = 1
            goto L65
        L64:
            r5 = 0
        L65:
            cn.jiguang.internal.JConstants.CMD_TO_PRINT_ALL_LOG = r5     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r5 = cn.jiguang.e.a.aM()     // Catch: java.lang.Throwable -> L49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L49
            r5[r7] = r2     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.b.a(r10, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "expire"
            int r2 = r11.optInt(r2)     // Catch: java.lang.Throwable -> L49
            if (r2 <= 0) goto L83
            goto L84
        L83:
            r2 = 7
        L84:
            cn.jiguang.e.a r5 = cn.jiguang.e.a.aN()     // Catch: java.lang.Throwable -> L49
            long r8 = cn.jiguang.av.e.a(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L49
            r5[r7] = r2     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.b.a(r10, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r2.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "dealCommandInternalDebug: content: "
            r2.append(r5)     // Catch: java.lang.Throwable -> L49
            r2.append(r11)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = ", fromCmd: "
            r2.append(r5)     // Catch: java.lang.Throwable -> L49
            r2.append(r12)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L49
            if (r1 != r4) goto Lf0
            cn.jiguang.a.a.f241h = r4     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "delay_upload"
            int r11 = r11.optInt(r1)     // Catch: java.lang.Throwable -> L49
            r1 = 10
            int r11 = java.lang.Math.max(r11, r1)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aO()     // Catch: java.lang.Throwable -> L49
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a r11 = r1.a(r11)     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L49
            r1[r7] = r11     // Catch: java.lang.Throwable -> L49
            cn.jiguang.e.b.a(r10, r1)     // Catch: java.lang.Throwable -> L49
            if (r3 != r4) goto Ldf
            cn.jiguang.w.b.a(r10)     // Catch: java.lang.Throwable -> L49
        Ldf:
            if (r12 == 0) goto L109
            int r11 = cn.jiguang.e.c.e(r10)     // Catch: java.lang.Throwable -> L49
            if (r11 != r4) goto L109
            java.lang.String r11 = "dealCommandInternalDebug: server cmd upload log to server"
            cn.jiguang.w.f.c(r0, r11)     // Catch: java.lang.Throwable -> L49
        Lec:
            cn.jiguang.w.b.b(r10)     // Catch: java.lang.Throwable -> L49
            return
        Lf0:
            cn.jiguang.a.a.f241h = r7     // Catch: java.lang.Throwable -> L49
            boolean r11 = cn.jiguang.w.d.c(r10)     // Catch: java.lang.Throwable -> L49
            if (r11 == 0) goto L109
            boolean r11 = cn.jiguang.e.c.d(r10)     // Catch: java.lang.Throwable -> L49
            if (r11 == 0) goto Lff
            goto Lec
        Lff:
            java.lang.String r10 = "FUTURE_TASK"
            cn.jiguang.d.a$1 r11 = new cn.jiguang.d.a$1     // Catch: java.lang.Throwable -> L49
            r11.<init>()     // Catch: java.lang.Throwable -> L49
            cn.jiguang.au.d.a(r10, r11)     // Catch: java.lang.Throwable -> L49
        L109:
            return
        L10a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "dealCommandInternalDebug failed: "
            r11.append(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.l(r0, r10)
            return
    }

    public static synchronized void a(android.content.Context r4, boolean r5) {
            java.lang.Class<cn.jiguang.d.a> r0 = cn.jiguang.d.a.class
            monitor-enter(r0)
            boolean r1 = cn.jiguang.internal.JConstants.isInstrumentationHookFailed     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L81
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r4.getPackageName()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L1c
            java.lang.String r5 = cn.jiguang.av.a.a(r4)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r4 = move-exception
            goto L86
        L1c:
            r5 = r1
        L1d:
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L6a
            boolean r2 = android.text.TextUtils.equals(r1, r5)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L6a
            r2 = 0
            cn.jiguang.internal.JConstants.isInstrumentationHookFailed = r2     // Catch: java.lang.Throwable -> L52
            android.app.Application r4 = (android.app.Application) r4     // Catch: java.lang.Throwable -> L52
            cn.jiguang.analytics.page.ActivityLifecycle r2 = cn.jiguang.d.a.a     // Catch: java.lang.Throwable -> L52
            r4.registerActivityLifecycleCallbacks(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "JBridgeHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "registerActivityLifecycleCallbacks in main process,packageName:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            r2.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = ",currentProcessName:"
            r2.append(r1)     // Catch: java.lang.Throwable -> L52
            r2.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L52
            cn.jiguang.w.f.c(r4, r5)     // Catch: java.lang.Throwable -> L52
            goto L9f
        L52:
            r4 = move-exception
            java.lang.String r5 = "JBridgeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "initPageLifecycle throwable="
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            r1.append(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            cn.jiguang.w.f.j(r5, r4)     // Catch: java.lang.Throwable -> L1a
            goto L9f
        L6a:
            java.lang.String r4 = "JBridgeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "need not registerActivityLifecycleCallbacks in other process :"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            r1.append(r5)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L1a
        L7d:
            cn.jiguang.w.f.c(r4, r5)     // Catch: java.lang.Throwable -> L1a
            goto L9f
        L81:
            java.lang.String r4 = "JBridgeHelper"
            java.lang.String r5 = "need not registerActivityLifecycleCallbacks"
            goto L7d
        L86:
            java.lang.String r5 = "JBridgeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r1.<init>()     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "registerActivityLifecycleCallbacks failed:"
            r1.append(r2)     // Catch: java.lang.Throwable -> La1
            r1.append(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> La1
            cn.jiguang.w.f.j(r5, r4)     // Catch: java.lang.Throwable -> La1
            r4 = 1
            cn.jiguang.internal.JConstants.isInstrumentationHookFailed = r4     // Catch: java.lang.Throwable -> La1
        L9f:
            monitor-exit(r0)
            return
        La1:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            throw r4
    }

    public static void a(java.lang.String r0, java.lang.String r1) {
            cn.jiguang.internal.ActionManager.addAction(r0, r1)
            return
    }

    public static boolean a(java.lang.String r1) {
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            boolean r1 = r0.a(r1)
            return r1
    }

    public static java.lang.Object b() {
            java.util.HashMap r0 = cn.jiguang.internal.ActionManager.getActionMap()
            return r0
    }

    public static java.lang.String b(android.content.Context r1) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.N()
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = cn.jiguang.h.c.a.f1296j
            java.lang.String r1 = cn.jiguang.av.t.a(r1, r0)
            return r1
    }

    public static void b(android.app.Application.ActivityLifecycleCallbacks r1) {
            cn.jiguang.analytics.page.ActivityLifecycle r0 = cn.jiguang.d.a.a
            r0.removeActivityLifecycleCallbacks(r1)
            return
    }

    public static int c() {
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jiguang.ad.b r1 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L44
            java.util.Map r1 = r1.d()     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "JBridgeHelper"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "map is "
            r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L44
            r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L44
            cn.jiguang.w.f.c(r2, r3)     // Catch: java.lang.Throwable -> L44
            boolean r2 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L44
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L44
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "code"
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L44
            boolean r1 = android.text.TextUtils.isDigitsOnly(r0)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L44
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L44
            return r0
        L44:
            r0 = 0
            return r0
    }

    public static java.lang.String c(android.content.Context r1) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.Z()
            java.lang.Object r1 = cn.jiguang.e.b.b(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static java.lang.String c(java.lang.String r1) {
            java.lang.String r0 = cn.jiguang.h.c.a.f1296j
            java.lang.String r1 = cn.jiguang.av.t.b(r1, r0)
            return r1
    }

    public static java.lang.String d(android.content.Context r1) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aa()
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static java.lang.String e(android.content.Context r0) {
            java.lang.String r0 = cn.jiguang.v.a.a(r0)
            return r0
    }

    public static long f(android.content.Context r2) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.M()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
    }

    public static long g(android.content.Context r2) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.O()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
    }

    public static java.lang.String h(android.content.Context r0) {
            java.lang.String r0 = cn.jiguang.v.a.c(r0)
            return r0
    }

    public static java.lang.String i(android.content.Context r0) {
            java.lang.String r0 = cn.jiguang.av.g.b(r0)
            return r0
    }

    public static java.lang.String j(android.content.Context r2) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.P()
            java.lang.Object r0 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1b
            cn.jiguang.e.a r0 = cn.jiguang.e.a.Q()
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L1b:
            return r0
    }

    public static int k(android.content.Context r1) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.R()
            java.lang.Object r1 = cn.jiguang.e.b.a(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    public static boolean l(android.content.Context r9) {
            java.lang.String r0 = "canShowLbsPermissionDialog"
            java.lang.String r1 = "JBridgeHelper"
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ap()
            java.lang.Object r0 = cn.jiguang.e.b.a(r9, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r2 = 0
            if (r0 == 0) goto L20
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
            java.lang.String r9 = "lbs disable"
            cn.jiguang.w.f.d(r1, r9)
            return r2
        L20:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ao()
            java.lang.Object r0 = cn.jiguang.e.b.a(r9, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            cn.jiguang.e.a r0 = cn.jiguang.e.a.am()
            java.lang.Object r0 = cn.jiguang.e.b.a(r9, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "lbs permission dialog shield, firstInit="
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = ", delay="
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            r0 = 1
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L6f
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L6e
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r5 + r3
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L6d
            return r0
        L6d:
            return r2
        L6e:
            return r0
        L6f:
            cn.jiguang.e.a r1 = cn.jiguang.e.a.am()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            cn.jiguang.e.a r1 = r1.a(r5)
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r0]
            r5[r2] = r1
            cn.jiguang.e.b.a(r9, r5)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L8b
            return r0
        L8b:
            return r2
    }

    public static java.lang.Integer m(android.content.Context r3) {
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            java.lang.String r1 = "JPUSH"
            r2 = 30006(0x7536, float:4.2047E-41)
            java.lang.Object r3 = r0.a(r3, r1, r2)
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L13
            java.lang.Integer r3 = (java.lang.Integer) r3
            return r3
        L13:
            r3 = 0
            return r3
    }
}
