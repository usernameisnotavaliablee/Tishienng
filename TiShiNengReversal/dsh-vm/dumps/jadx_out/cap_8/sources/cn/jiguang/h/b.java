package cn.jiguang.h;

@android.annotation.SuppressLint({"CommitPrefEdits"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.util.List<java.lang.Integer> a;

    /* renamed from: b, reason: collision with root package name */
    private static android.content.SharedPreferences f1286b;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.lang.Long> f1287c;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.h.b.a = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static void a() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.h.b.f1287c = r0
            java.lang.String r1 = "JWakeReport"
            java.lang.String r2 = "_ri"
            java.lang.String r1 = a(r1, r2)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    public static void a(android.content.Context r0) {
            android.content.SharedPreferences r0 = h(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "_blc"
            java.lang.String r2 = a(r2, r0)
            android.content.SharedPreferences r1 = h(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putInt(r2, r3)
            r1.apply()
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4, long r5) {
            java.lang.String r0 = "_blt"
            java.lang.String r0 = a(r4, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " lastBusinessTime:"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "JCommonConfig"
            cn.jiguang.w.f.f(r1, r4)
            android.content.SharedPreferences r3 = h(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putLong(r0, r5)
            r3.apply()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "JType"
            java.lang.String r2 = a(r0, r2)
            android.content.SharedPreferences r1 = h(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            r1.apply()
            return
    }

    public static void a(android.content.Context r2, boolean r3) {
            java.lang.String r0 = "user_wake"
            java.lang.String r1 = "_aue"
            java.lang.String r0 = a(r0, r1)
            android.content.SharedPreferences r2 = h(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r3)
            r2.apply()
            return
    }

    public static boolean a(android.content.Context r8, java.lang.String r9) {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = f(r8, r9)
            long r4 = g(r8, r9)
            long r6 = r0 - r2
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L14
            r8 = 1
            goto L15
        L14:
            r8 = 0
        L15:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "is "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r9 = " reportTime:"
            r6.append(r9)
            r6.append(r8)
            java.lang.String r9 = ",curTime:"
            r6.append(r9)
            r6.append(r0)
            java.lang.String r9 = ",lastReportTime:"
            r6.append(r9)
            r6.append(r2)
            java.lang.String r9 = ",reportInterval:"
            r6.append(r9)
            r6.append(r4)
            java.lang.String r9 = r6.toString()
            java.lang.String r0 = "JCommonConfig"
            cn.jiguang.w.f.f(r0, r9)
            return r8
    }

    private static long b(java.lang.String r1, java.lang.String r2) {
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = cn.jiguang.h.b.f1287c     // Catch: java.lang.NullPointerException -> L11
            java.lang.String r1 = a(r1, r2)     // Catch: java.lang.NullPointerException -> L11
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.NullPointerException -> L11
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.NullPointerException -> L11
            long r1 = r1.longValue()     // Catch: java.lang.NullPointerException -> L11
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static void b(android.content.Context r3) {
            java.lang.String r0 = i(r3)
            android.content.SharedPreferences r1 = h(r3)
            r2 = 0
            int r1 = r1.getInt(r0, r2)
            android.content.SharedPreferences r3 = h(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r3 = r3.putInt(r0, r1)
            r3.apply()
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3) {
            long r0 = java.lang.System.currentTimeMillis()
            a(r2, r3, r0)
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ktsv_"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JType"
            java.lang.String r3 = a(r0, r3)
            android.content.SharedPreferences r2 = h(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putInt(r3, r4)
            r2.apply()
            return
    }

    public static void b(android.content.Context r3, java.lang.String r4, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return
        L7:
            java.lang.String r0 = "_ri"
            java.lang.String r0 = a(r4, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " reportInterval:"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "JCommonConfig"
            cn.jiguang.w.f.f(r1, r4)
            android.content.SharedPreferences r3 = h(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putLong(r0, r5)
            r3.apply()
            return
    }

    public static void b(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setFirstWReported:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCommonConfig"
            cn.jiguang.w.f.f(r1, r0)
            android.content.SharedPreferences r2 = h(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "key_first_w_reported"
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r3)
            r2.apply()
            return
    }

    public static int c(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "_blc"
            java.lang.String r2 = a(r2, r0)
            android.content.SharedPreferences r1 = h(r1)
            r0 = 0
            int r1 = r1.getInt(r2, r0)
            return r1
    }

    public static boolean c(android.content.Context r2) {
            java.lang.String r0 = "user_wake"
            java.lang.String r1 = "_aue"
            java.lang.String r0 = a(r0, r1)
            android.content.SharedPreferences r2 = h(r2)
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static long d(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "_blt"
            java.lang.String r3 = a(r3, r0)
            android.content.SharedPreferences r2 = h(r2)
            r0 = 0
            long r2 = r2.getLong(r3, r0)
            return r2
    }

    public static java.lang.String d(android.content.Context r2) {
            android.content.SharedPreferences r2 = h(r2)
            java.lang.String r0 = "JWakeLocalState"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    public static java.lang.String e(android.content.Context r2) {
            android.content.SharedPreferences r2 = h(r2)
            java.lang.String r0 = "JNotificationState"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    public static void e(android.content.Context r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " lastReportTime"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCommonConfig"
            cn.jiguang.w.f.f(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "_rlt"
            java.lang.String r4 = a(r4, r2)
            android.content.SharedPreferences r3 = h(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putLong(r4, r0)
            r3.apply()
            return
    }

    public static long f(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "_rlt"
            java.lang.String r3 = a(r3, r0)
            android.content.SharedPreferences r2 = h(r2)
            r0 = 0
            long r2 = r2.getLong(r3, r0)
            return r2
    }

    public static boolean f(android.content.Context r2) {
            android.content.SharedPreferences r2 = h(r2)
            java.lang.String r0 = "key_first_w_reported"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static long g(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "_ri"
            java.lang.String r1 = a(r5, r0)
            long r2 = b(r5, r0)
            android.content.SharedPreferences r4 = h(r4)
            long r4 = r4.getLong(r1, r2)
            return r4
    }

    private static void g(android.content.Context r2) {
            java.lang.String r0 = "cn.jiguang.common"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            cn.jiguang.h.b.f1286b = r2
            a()
            return
    }

    private static android.content.SharedPreferences h(android.content.Context r1) {
            android.content.SharedPreferences r0 = cn.jiguang.h.b.f1286b
            if (r0 != 0) goto L7
            g(r1)
        L7:
            android.content.SharedPreferences r1 = cn.jiguang.h.b.f1286b
            return r1
    }

    public static void h(android.content.Context r2, java.lang.String r3) {
            boolean r0 = cn.jiguang.av.v.a(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = i(r2)
            if (r0 == 0) goto L22
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L22
            android.content.SharedPreferences r1 = h(r2)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
        L22:
            android.content.SharedPreferences r2 = h(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "current_time_key"
            android.content.SharedPreferences$Editor r2 = r2.putString(r0, r3)
            r2.apply()
            return
    }

    public static int i(android.content.Context r1, java.lang.String r2) {
            boolean r0 = cn.jiguang.av.v.a(r2)
            if (r0 == 0) goto La
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
        La:
            android.content.SharedPreferences r1 = h(r1)
            r0 = 0
            int r1 = r1.getInt(r2, r0)
            return r1
    }

    private static java.lang.String i(android.content.Context r2) {
            android.content.SharedPreferences r2 = h(r2)
            java.lang.String r0 = "current_time_key"
            r1 = 0
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    public static void j(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = h(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "JWakeLocalState"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static java.lang.String k(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "JType"
            java.lang.String r2 = a(r0, r2)
            android.content.SharedPreferences r1 = h(r1)
            java.lang.String r0 = "-1,-1"
            java.lang.String r1 = r1.getString(r2, r0)
            return r1
    }

    public static int l(android.content.Context r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ktsv_"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JType"
            java.lang.String r3 = a(r0, r3)
            android.content.SharedPreferences r2 = h(r2)
            r0 = 0
            int r2 = r2.getInt(r3, r0)
            return r2
    }

    public static void m(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = h(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "JNotificationState"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }
}
