package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h implements java.lang.Thread.UncaughtExceptionHandler {
    private static cn.jiguang.aj.h a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.Thread.UncaughtExceptionHandler f505b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f506c;

    /* renamed from: d, reason: collision with root package name */
    private cn.jiguang.aj.g f507d;




    static {
            cn.jiguang.aj.h r0 = new cn.jiguang.aj.h
            r0.<init>()
            cn.jiguang.aj.h.a = r0
            return
    }

    private h() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f505b = r0
            cn.jiguang.aj.g r0 = new cn.jiguang.aj.g
            r0.<init>()
            r1.f507d = r0
            return
    }

    static /* synthetic */ cn.jiguang.aj.g a(cn.jiguang.aj.h r0) {
            cn.jiguang.aj.g r0 = r0.f507d
            return r0
    }

    public static cn.jiguang.aj.h a() {
            cn.jiguang.aj.h r0 = cn.jiguang.aj.h.a
            return r0
    }

    static /* synthetic */ java.lang.String a(cn.jiguang.aj.h r0, java.lang.String r1) {
            r0.f506c = r1
            return r1
    }

    private org.json.JSONObject a(android.content.Context r10, java.lang.Throwable r11) {
            r9 = this;
            java.lang.String r0 = "sentry_envelope_item"
            java.lang.String r1 = "sentry_envelope_item_header"
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "type"
            java.lang.String r5 = "sentry_crash_log"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L6c
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6c
            r4.<init>()     // Catch: java.lang.Throwable -> L6c
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            org.json.JSONObject r11 = cn.jiguang.aj.d.a(r10, r11)     // Catch: java.lang.Throwable -> L6c
            if (r11 == 0) goto L6e
            int r6 = r11.length()     // Catch: java.lang.Throwable -> L6c
            if (r6 != 0) goto L28
            goto L6e
        L28:
            java.lang.String r6 = "event"
            org.json.JSONObject r6 = cn.jiguang.aj.d.a(r6)     // Catch: java.lang.Throwable -> L6c
            r5.put(r1, r6)     // Catch: java.lang.Throwable -> L6c
            r5.put(r0, r11)     // Catch: java.lang.Throwable -> L6c
            r4.put(r5)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r11 = "sentry_envelope_header"
            r5 = 1
            org.json.JSONObject r6 = cn.jiguang.aj.d.a(r5)     // Catch: java.lang.Throwable -> L6c
            r3.put(r11, r6)     // Catch: java.lang.Throwable -> L6c
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            r11.<init>()     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.aj.g r6 = r9.f507d     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.ak.i r6 = r6.a()     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.ak.i$a r7 = cn.jiguang.ak.i.a.f560c     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = ""
            r6.a(r7, r8, r5)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "session"
            org.json.JSONObject r5 = cn.jiguang.aj.d.a(r5)     // Catch: java.lang.Throwable -> L6c
            r11.put(r1, r5)     // Catch: java.lang.Throwable -> L6c
            org.json.JSONObject r10 = cn.jiguang.aj.d.a(r10, r6)     // Catch: java.lang.Throwable -> L6c
            r11.put(r0, r10)     // Catch: java.lang.Throwable -> L6c
            r4.put(r11)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r10 = "sentry_envelope_items"
            r3.put(r10, r4)     // Catch: java.lang.Throwable -> L6c
            return r3
        L6c:
            r10 = move-exception
            goto L6f
        L6e:
            return r2
        L6f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "generalJSONLog error : "
            r11.append(r0)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "SentryCrashHandler"
            cn.jiguang.w.f.l(r11, r10)
            return r2
    }

    static /* synthetic */ java.lang.String b(cn.jiguang.aj.h r0) {
            java.lang.String r0 = r0.c()
            return r0
    }

    private java.lang.Throwable b(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            cn.jiguang.ak.c r0 = new cn.jiguang.ak.c
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.a(r1)
            java.lang.String r1 = "UncaughtExceptionHandler"
            r0.a(r1)
            cn.jiguang.aj.c r1 = new cn.jiguang.aj.c
            r1.<init>(r0, r4, r3)
            return r1
    }

    private java.lang.String c() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sentry"
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = cn.jiguang.av.e.a()
            r0.append(r1)
            java.lang.String r1 = ".envelope"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static /* synthetic */ java.lang.String c(cn.jiguang.aj.h r0) {
            java.lang.String r0 = r0.f506c
            return r0
    }

    public void a(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "SentryCrashHandler"
            java.lang.String r1 = "init"
            cn.jiguang.w.f.c(r0, r1)
            cn.jiguang.aj.g r0 = r2.f507d
            r0.b()
            cn.jiguang.aj.h$1 r0 = new cn.jiguang.aj.h$1
            r0.<init>(r2, r3)
            java.lang.String r3 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r3, r0)
            return
    }

    public void a(android.content.Context r4, org.json.JSONObject r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "SentryCrashHandler"
            if (r4 != 0) goto La
            java.lang.String r4 = "Action - reportCrashLog context is null"
            cn.jiguang.w.f.i(r0, r4)
            return
        La:
            boolean r1 = cn.jiguang.d.b.a(r4)
            if (r1 != 0) goto L11
            return
        L11:
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.aj.h$3 r2 = new cn.jiguang.aj.h$3     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            cn.jiguang.au.d.a(r1, r2)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "report crash e:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.w.f.l(r0, r4)
            return
    }

    public void a(java.lang.Thread r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r2 = "SentryCrashHandler"
            java.lang.String r0 = "handleException catch exception"
            cn.jiguang.w.f.c(r2, r0)
            r1.a(r3)
            return
    }

    public void a(java.lang.Throwable r5) {
            r4 = this;
            r0 = 0
            android.content.Context r0 = cn.jiguang.av.c.a(r0)
            java.lang.String r1 = "SentryCrashHandler"
            if (r0 != 0) goto Lf
            java.lang.String r5 = "handleException context is null"
            cn.jiguang.w.f.i(r1, r5)
            return
        Lf:
            cn.jiguang.aj.d.b(r0, r5)
            boolean r2 = cn.jiguang.aj.i.a()
            if (r2 == 0) goto L45
            org.json.JSONObject r5 = r4.a(r0, r5)     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L1f
            goto L45
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "crash log is : "
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L45
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r4.c()     // Catch: java.lang.Throwable -> L45
            r4.f506c = r1     // Catch: java.lang.Throwable -> L45
            cn.jiguang.av.i.a(r1, r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r4.f506c     // Catch: java.lang.Throwable -> L45
            r4.a(r0, r5, r1)     // Catch: java.lang.Throwable -> L45
        L45:
            return
    }

    public void b() {
            r2 = this;
            java.lang.String r0 = "SentryCrashHandler"
            java.lang.String r1 = "setUncaughtExceptionHandler"
            cn.jiguang.w.f.c(r0, r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f505b
            if (r0 != 0) goto L11
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r2.f505b = r0
        L11:
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)
            return
    }

    public void b(android.content.Context r4) {
            r3 = this;
            cn.jiguang.aj.h$2 r0 = new cn.jiguang.aj.h$2
            r0.<init>(r3, r4)
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "DELAY_TASK"
            cn.jiguang.au.d.a(r4, r0, r1)
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.String r0 = "SentryCrashHandler"
            java.lang.String r1 = "uncaughtException"
            cn.jiguang.w.f.c(r0, r1)
            java.lang.Throwable r0 = r2.b(r3, r4)
            r2.a(r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f505b
            if (r0 == r2) goto L17
            if (r0 == 0) goto L17
            r0.uncaughtException(r3, r4)
        L17:
            return
    }
}
