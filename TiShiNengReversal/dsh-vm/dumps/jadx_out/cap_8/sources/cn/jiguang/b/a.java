package cn.jiguang.b;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    private static int f734b = 1048576;
    public boolean a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.Thread.UncaughtExceptionHandler f735c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.Object f736d;

    /* renamed from: cn.jiguang.b.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: cn.jiguang.b.a$a, reason: collision with other inner class name */
    private static final class C0018a {
        private static final cn.jiguang.b.a a = null;

        static {
                cn.jiguang.b.a r0 = new cn.jiguang.b.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.b.a.C0018a.a = r0
                return
        }

        public C0018a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.b.a a() {
                cn.jiguang.b.a r0 = cn.jiguang.b.a.C0018a.a
                return r0
        }
    }

    static {
            return
    }

    private a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f735c = r0
            r1 = 1
            r2.a = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.f736d = r1
            android.content.Context r0 = cn.jiguang.av.c.a(r0)
            boolean r0 = f(r0)
            r2.a = r0
            return
    }

    /* synthetic */ a(cn.jiguang.b.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.b.a a() {
            cn.jiguang.b.a r0 = cn.jiguang.b.a.C0018a.a()
            return r0
    }

    private org.json.JSONArray a(android.content.Context r5, java.lang.Throwable r6) {
            r4 = this;
            java.lang.String r0 = "jpush_uncaughtexception_file"
            java.lang.String r0 = cn.jiguang.av.i.e(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L18
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L18
            r1.<init>(r0)     // Catch: org.json.JSONException -> L18
            int r3 = r0.length()     // Catch: org.json.JSONException -> L17
        L17:
            r2 = r1
        L18:
            org.json.JSONArray r5 = r4.a(r5, r2, r3, r6)
            return r5
    }

    private org.json.JSONArray a(android.content.Context r12, org.json.JSONArray r13, int r14, java.lang.Throwable r15) {
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = cn.jiguang.d.b.c(r12)
            long r0 = r0 + r2
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r2)
            r15.getClass()
            java.lang.String r2 = r2.toString()
            if (r13 != 0) goto L21
            org.json.JSONArray r13 = new org.json.JSONArray
            r13.<init>()
        L21:
            r3 = 0
            r4 = 0
        L23:
            int r5 = r13.length()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r6 = "stacktrace"
            java.lang.String r7 = "crashtime"
            java.lang.String r8 = "count"
            r9 = 1
            if (r4 >= r5) goto L4f
            org.json.JSONObject r5 = r13.optJSONObject(r4)     // Catch: java.lang.Throwable -> Ld2
            if (r5 == 0) goto L4c
            java.lang.String r10 = r5.getString(r6)     // Catch: java.lang.Throwable -> Ld2
            boolean r10 = r2.equals(r10)     // Catch: java.lang.Throwable -> Ld2
            if (r10 == 0) goto L4c
            int r4 = r5.getInt(r8)     // Catch: java.lang.Throwable -> Ld2
            int r4 = r4 + r9
            r5.put(r8, r4)     // Catch: java.lang.Throwable -> Ld2
            r5.put(r7, r0)     // Catch: java.lang.Throwable -> Ld2
            goto L50
        L4c:
            int r4 = r4 + 1
            goto L23
        L4f:
            r5 = 0
        L50:
            if (r5 != 0) goto Ld2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld2
            r4.<init>()     // Catch: java.lang.Throwable -> Ld2
            r4.put(r7, r0)     // Catch: java.lang.Throwable -> Ld2
            r4.put(r6, r2)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r0 = "message"
            java.lang.String r15 = r11.b(r15)     // Catch: java.lang.Throwable -> Ld2
            r4.put(r0, r15)     // Catch: java.lang.Throwable -> Ld2
            r4.put(r8, r9)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r15 = "networktype"
            java.lang.String r0 = cn.jiguang.av.n.c(r12)     // Catch: java.lang.Throwable -> Ld2
            r4.put(r15, r0)     // Catch: java.lang.Throwable -> Ld2
            android.content.pm.PackageInfo r12 = cn.jiguang.av.o.a(r12, r9)     // Catch: java.lang.Throwable -> Ld2
            if (r12 == 0) goto L9d
            java.lang.String r15 = r12.versionName     // Catch: java.lang.Throwable -> Ld2
            if (r15 != 0) goto L7e
            java.lang.String r15 = "null"
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld2
            r0.<init>()     // Catch: java.lang.Throwable -> Ld2
            int r12 = r12.versionCode     // Catch: java.lang.Throwable -> Ld2
            r0.append(r12)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r12 = ""
            r0.append(r12)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r0 = "versionname"
            r4.put(r0, r15)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r15 = "versioncode"
            r4.put(r15, r12)     // Catch: java.lang.Throwable -> Ld2
        L9d:
            java.lang.String r12 = r4.toString()     // Catch: java.lang.Throwable -> Ld2
            int r12 = r12.length()     // Catch: java.lang.Throwable -> Ld2
            int r14 = r14 + r12
            int r12 = cn.jiguang.b.a.f734b     // Catch: java.lang.Throwable -> Ld2
            if (r14 >= r12) goto Lae
            r13.put(r4)     // Catch: java.lang.Throwable -> Ld2
            return r13
        Lae:
            r14 = -1
            r0 = r14
            r12 = 0
        Lb2:
            int r2 = r13.length()     // Catch: java.lang.Throwable -> Ld2
            if (r3 >= r2) goto Lcf
            org.json.JSONObject r2 = r13.optJSONObject(r3)     // Catch: java.lang.Throwable -> Ld2
            if (r2 == 0) goto Lcc
            long r5 = r2.optLong(r7)     // Catch: java.lang.Throwable -> Ld2
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto Lca
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lcc
        Lca:
            r12 = r3
            r0 = r5
        Lcc:
            int r3 = r3 + 1
            goto Lb2
        Lcf:
            r13.put(r12, r4)     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            return r13
    }

    private static void a(android.content.Context r2, boolean r3) {
            java.lang.String r0 = "cn.jiguang.crash"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "KEY_IS_INIT"
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r3)     // Catch: java.lang.Throwable -> L14
            r2.apply()     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    private void a(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            android.content.Context r0 = cn.jiguang.av.c.a(r0)
            if (r0 == 0) goto L16
            org.json.JSONArray r2 = r1.a(r0, r2)
            java.lang.String r0 = "jpush_uncaughtexception_file"
            cn.jiguang.av.i.a(r0, r2)
            return
        L16:
            java.lang.String r2 = "JPushCrashHandler"
            java.lang.String r0 = "handleException failed: context is null"
            cn.jiguang.w.f.l(r2, r0)
            return
    }

    private java.lang.String b(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r5.split(r0)     // Catch: java.lang.Throwable -> L2c
            int r1 = r0.length     // Catch: java.lang.Throwable -> L2c
            r2 = 1
            if (r1 <= r2) goto L2c
            int r1 = r0.length     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 - r2
        L10:
            if (r1 < 0) goto L2c
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Exception"
            boolean r2 = r2.endsWith(r3)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L2a
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error"
            boolean r2 = r2.endsWith(r3)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L27
            goto L2a
        L27:
            int r1 = r1 + (-1)
            goto L10
        L2a:
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L2c
        L2c:
            return r5
    }

    public static org.json.JSONArray c(android.content.Context r0) {
            java.lang.String r0 = "jpush_uncaughtexception_file"
            org.json.JSONArray r0 = cn.jiguang.av.i.b(r0)
            return r0
    }

    public static void d(android.content.Context r0) {
            java.lang.String r0 = "jpush_uncaughtexception_file"
            cn.jiguang.av.i.d(r0)
            return
    }

    private static boolean f(android.content.Context r3) {
            r0 = 0
            java.lang.String r1 = "cn.jiguang.crash"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "KEY_IS_INIT"
            r2 = 1
            boolean r3 = r3.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            return r0
    }

    public final void a(long r9) {
            r8 = this;
            java.lang.Object r0 = r8.f736d
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L3c
            if (r5 != 0) goto L1f
        Lf:
            java.lang.String r9 = "FUTURE_TASK"
            boolean r9 = cn.jiguang.au.d.b(r9)     // Catch: java.lang.Throwable -> L1d
            if (r9 == 0) goto L3a
            java.lang.Object r9 = r8.f736d     // Catch: java.lang.Throwable -> L1d
            r9.wait(r3)     // Catch: java.lang.Throwable -> L1d
            goto Lf
        L1d:
            r9 = move-exception
            goto L44
        L1f:
            r5 = r3
        L20:
            java.lang.String r7 = "FUTURE_TASK"
            boolean r7 = cn.jiguang.au.d.b(r7)     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L3a
            long r5 = r9 - r5
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L2f
            goto L3a
        L2f:
            java.lang.Object r7 = r8.f736d     // Catch: java.lang.Throwable -> L1d
            r7.wait(r5)     // Catch: java.lang.Throwable -> L1d
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d
            long r5 = r5 - r1
            goto L20
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L3c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r10 = "timeout value is negative"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L1d
            throw r9     // Catch: java.lang.Throwable -> L1d
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r9
    }

    public void a(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.a
            if (r0 != 0) goto L17
            r0 = 1
            r2.a = r0
            java.lang.String r0 = "JPushCrashHandler"
            java.lang.String r1 = "init caughtException"
            cn.jiguang.w.f.c(r0, r1)
            android.content.Context r3 = cn.jiguang.av.c.a(r3)
            boolean r0 = r2.a
            a(r3, r0)
        L17:
            return
    }

    public void b() {
            r1 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.f735c
            if (r0 != 0) goto La
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r1.f735c = r0
        La:
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            return
    }

    public void b(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.a
            if (r0 == 0) goto L17
            java.lang.String r0 = "JPushCrashHandler"
            java.lang.String r1 = "stop caughtException"
            cn.jiguang.w.f.c(r0, r1)
            r0 = 0
            r2.a = r0
            android.content.Context r3 = cn.jiguang.av.c.a(r3)
            boolean r0 = r2.a
            a(r3, r0)
        L17:
            return
    }

    public void e(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "JPushCrashHandler"
            if (r4 != 0) goto La
            java.lang.String r4 = "Action - reportCrashLog context is null"
            cn.jiguang.w.f.i(r0, r4)
            return
        La:
            boolean r4 = cn.jiguang.d.b.a(r4)
            if (r4 != 0) goto L11
            return
        L11:
            cn.jiguang.b.b r4 = new cn.jiguang.b.b     // Catch: java.lang.Throwable -> L1c
            r4.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r1, r4)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "report crash e:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.l(r0, r4)
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
            r4 = this;
            boolean r0 = r4.a
            java.lang.String r1 = "JPushCrashHandler"
            if (r0 == 0) goto L34
            java.lang.String r0 = "enable crash report"
            cn.jiguang.w.f.a(r1, r0)
            r4.a(r6)
            cn.jiguang.b.b r0 = new cn.jiguang.b.b     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r2, r0)     // Catch: java.lang.Throwable -> L1e
            r2 = 2000(0x7d0, double:9.88E-321)
            r4.a(r2)     // Catch: java.lang.Throwable -> L1e
            goto L39
        L1e:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "report crash e:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.l(r1, r0)
            goto L39
        L34:
            java.lang.String r0 = "disable crash report"
            cn.jiguang.w.f.a(r1, r0)
        L39:
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.f735c
            if (r0 == r4) goto L42
            if (r0 == 0) goto L42
            r0.uncaughtException(r5, r6)
        L42:
            return
    }
}
