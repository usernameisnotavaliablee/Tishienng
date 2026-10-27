package cn.jiguang.e;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static android.content.SharedPreferences a;

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = f(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "log_ref_count"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r2)
            r1.apply()
            return
    }

    public static void a(android.content.Context r1, long r2) {
            android.content.SharedPreferences r1 = f(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "log_last_timestamp"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r0, r2)
            r1.apply()
            return
    }

    public static void a(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = f(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "external_log_enabled"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean a(android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            java.lang.String r0 = "external_log_enabled"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static long b(android.content.Context r3) {
            android.content.SharedPreferences r3 = f(r3)
            java.lang.String r0 = "log_last_timestamp"
            r1 = 0
            long r0 = r3.getLong(r0, r1)
            return r0
    }

    public static void b(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = f(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "server_upload_state"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r2)
            r1.apply()
            return
    }

    public static void b(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = f(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "local_upload_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static int c(android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            java.lang.String r0 = "log_ref_count"
            r1 = 0
            int r2 = r2.getInt(r0, r1)
            return r2
    }

    public static boolean d(android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            java.lang.String r0 = "local_upload_enable"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static int e(android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            java.lang.String r0 = "server_upload_state"
            r1 = 2
            int r2 = r2.getInt(r0, r1)
            return r2
    }

    private static synchronized android.content.SharedPreferences f(android.content.Context r6) {
            java.lang.Class<cn.jiguang.e.c> r0 = cn.jiguang.e.c.class
            monitor-enter(r0)
            r1 = 0
            java.lang.String r2 = cn.jiguang.av.a.a(r6)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L40
            java.lang.String r3 = r6.getPackageName()     // Catch: java.lang.Throwable -> L3e
            boolean r3 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L19
            goto L40
        L19:
            java.lang.String r3 = ":"
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> L3e
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L3e
            android.content.SharedPreferences r3 = cn.jiguang.e.c.a     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L70
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "cn.jiguang.sdk.log_config_"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L3e
        L37:
            android.content.SharedPreferences r2 = r6.getSharedPreferences(r2, r1)     // Catch: java.lang.Throwable -> L3e
            cn.jiguang.e.c.a = r2     // Catch: java.lang.Throwable -> L3e
            goto L70
        L3e:
            r2 = move-exception
            goto L47
        L40:
            android.content.SharedPreferences r2 = cn.jiguang.e.c.a     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L70
            java.lang.String r2 = "cn.jiguang.sdk.log_config"
            goto L37
        L47:
            java.lang.String r3 = "SpConfig"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r4.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = "getSharedPreferences failed, e: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L6e
            r4.append(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L6e
            cn.jiguang.w.f.i(r3, r2)     // Catch: java.lang.Throwable -> L6e
            android.content.SharedPreferences r2 = cn.jiguang.e.c.a     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L70
            java.lang.String r2 = "cn.jiguang.sdk.log_config"
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r2, r1)     // Catch: java.lang.Throwable -> L6e
            cn.jiguang.e.c.a = r6     // Catch: java.lang.Throwable -> L6e
            goto L70
        L6e:
            r6 = move-exception
            goto L74
        L70:
            android.content.SharedPreferences r6 = cn.jiguang.e.c.a     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)
            return r6
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r6
    }
}
