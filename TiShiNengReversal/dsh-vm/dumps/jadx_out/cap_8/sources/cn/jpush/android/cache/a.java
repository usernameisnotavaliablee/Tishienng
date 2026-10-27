package cn.jpush.android.cache;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static android.content.SharedPreferences a;

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r2) {
            java.lang.String r0 = "cn.jpush.config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            cn.jpush.android.cache.a.a = r2
            return
    }

    public static void a(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "service_stoped"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r2)
            r1.apply()
            return
    }

    public static void a(android.content.Context r4, long r5) {
            r0 = 0
            java.lang.String r2 = "PushConfig"
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto Le
            java.lang.String r4 = "freeze end time was incorrect!"
            cn.jpush.android.helper.Logger.w(r2, r4)
            return
        Le:
            r0 = 1800(0x708, double:8.893E-321)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1a
            java.lang.String r5 = "freeze end time was greate than half an hour"
            cn.jpush.android.helper.Logger.i(r2, r5)
            r5 = r0
        L1a:
            android.content.SharedPreferences r4 = v(r4)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r0 = "TAFreezeSetTime"
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r4 = r4.putLong(r0, r1)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            java.lang.String r0 = "TAFreezeEndTime"
            android.content.SharedPreferences$Editor r4 = r4.putLong(r0, r5)
            r4.apply()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            java.lang.String r0 = cn.jpush.android.ad.m.a
            java.lang.String r2 = cn.jpush.android.ad.l.a(r2, r0)
        Lc:
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "mobile_number"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.SharedPreferences r2 = v(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "jpush_save_custom_builder"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)
            r2.apply()
            return
    }

    public static void a(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "ups_state"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static int b(android.content.Context r3) {
            java.lang.String r0 = "cn.jpush.config"
            android.content.SharedPreferences r0 = cn.jpush.android.cache.Sp.reload(r3, r0)
            if (r0 != 0) goto Lc
            android.content.SharedPreferences r0 = v(r3)
        Lc:
            r1 = -1
            java.lang.String r2 = "service_stoped"
            int r0 = r0.getInt(r2, r1)
            if (r0 >= 0) goto L23
            java.lang.String r0 = "cn.jpush.android.user.profile"
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)
            int r0 = r0.getInt(r2, r1)
            a(r3, r0)
        L23:
            return r0
    }

    public static void b(android.content.Context r1, long r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "geofence_interval"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r0, r2)
            r1.apply()
            return
    }

    public static void b(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "setting_push_time"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void b(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.JAppKey(r2)
            cn.jpush.android.cache.Key r2 = r2.set(r3)
            r3 = 1
            cn.jpush.android.cache.Key[] r3 = new cn.jpush.android.cache.Key[r3]
            r0 = 0
            r3[r0] = r2
            cn.jpush.android.cache.Sp.set(r1, r3)
            return
    }

    public static void b(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "tcp_state"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean b(android.content.Context r3, int r4) {
            java.lang.String r0 = "PushConfig"
            r1 = 1
            if (r4 == 0) goto L11
            int r2 = b(r3)
            if (r2 < r1) goto L11
            java.lang.String r3 = "The service is stopped, it will give up all the actions until you call resumePush method to resume the service."
        Ld:
            cn.jpush.android.helper.Logger.ww(r0, r3)
            return r1
        L11:
            if (r4 == r1) goto L1c
            boolean r2 = c(r3)
            if (r2 != 0) goto L1c
            java.lang.String r3 = "The service is stopped, it will give up all the actions until you call JPushUPSManager.trunOn method to resume the service."
            goto Ld
        L1c:
            r2 = 2
            if (r4 == r2) goto L32
            cn.jpush.android.cache.Key r4 = cn.jpush.android.cache.Key.UPSRegister()
            java.lang.Object r3 = cn.jpush.android.cache.Sp.get(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L32
            java.lang.String r3 = "The service is stopped, it will give up all the actions until you call JPushUPSManager.registerToken method to resume the service."
            goto Ld
        L32:
            r3 = 0
            return r3
    }

    public static long c(android.content.Context r6, long r7) {
            android.content.SharedPreferences r0 = v(r6)
            java.lang.String r1 = "geofence_interval"
            r2 = -1
            long r4 = r0.getLong(r1, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L22
            java.lang.String r0 = "cn.jpush.android.user.profile"
            r4 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r4)
            long r4 = r0.getLong(r1, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L22
            b(r6, r4)
        L22:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L27
            return r7
        L27:
            return r4
    }

    public static void c(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "notification_num"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r2)
            r1.apply()
            return
    }

    public static void c(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "setting_silence_push_time"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void c(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.MAppKey(r2)
            cn.jpush.android.cache.Key r2 = r2.set(r3)
            r3 = 1
            cn.jpush.android.cache.Key[] r3 = new cn.jpush.android.cache.Key[r3]
            r0 = 0
            r3[r0] = r2
            cn.jpush.android.cache.Sp.set(r1, r3)
            return
    }

    public static void c(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "notification_enabled"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean c(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "ups_state"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static java.lang.String d(android.content.Context r4, java.lang.String r5) {
            android.content.SharedPreferences r0 = v(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "jpush_save_custom_builder"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r1, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L3e
            java.lang.String r0 = "cn.jpush.android.user.profile"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.getString(r1, r3)
            a(r4, r5, r0)
        L3e:
            return r0
    }

    public static void d(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "geofence_max_num"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r2)
            r1.apply()
            return
    }

    public static void d(android.content.Context r1, long r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "p_last_time"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r0, r2)
            r1.apply()
            return
    }

    public static void d(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.MAppId(r2)
            cn.jpush.android.cache.Key r2 = r2.set(r3)
            r3 = 1
            cn.jpush.android.cache.Key[] r3 = new cn.jpush.android.cache.Key[r3]
            r0 = 0
            r3[r0] = r2
            cn.jpush.android.cache.Sp.set(r1, r3)
            return
    }

    public static void d(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "geofence_pull_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean d(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "tcp_state"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static int e(android.content.Context r4, int r5) {
            android.content.SharedPreferences r0 = v(r4)
            java.lang.String r1 = "geofence_max_num"
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            if (r0 != r2) goto L1d
            java.lang.String r0 = "cn.jpush.android.user.profile"
            r3 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r3)
            int r0 = r0.getInt(r1, r2)
            if (r0 == r2) goto L1d
            d(r4, r0)
        L1d:
            if (r0 != r2) goto L20
            return r5
        L20:
            return r0
    }

    public static void e(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "geofence_pull_limit"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void e(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.MAppSecret(r2)
            cn.jpush.android.cache.Key r2 = r2.set(r3)
            r3 = 1
            cn.jpush.android.cache.Key[] r3 = new cn.jpush.android.cache.Key[r3]
            r0 = 0
            r3[r0] = r2
            cn.jpush.android.cache.Sp.set(r1, r3)
            return
    }

    public static void e(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "push_geofence_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean e(android.content.Context r3) {
            int r0 = b(r3)
            java.lang.String r1 = "PushConfig"
            r2 = 1
            if (r0 >= r2) goto L31
            boolean r0 = d(r3)
            if (r0 == 0) goto L10
            goto L31
        L10:
            boolean r0 = c(r3)
            if (r0 != 0) goto L1c
            java.lang.String r3 = "The service is stopped, it will give up all the actions until you call JPushUPSManager.trunOn method to resume the service."
        L18:
            cn.jpush.android.helper.Logger.dd(r1, r3)
            return r2
        L1c:
            cn.jpush.android.cache.Key r0 = cn.jpush.android.cache.Key.UPSRegister()
            java.lang.Object r3 = cn.jpush.android.cache.Sp.get(r3, r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L2f
            java.lang.String r3 = "The service is stopped, it will give up all the actions until you call JPushUPSManager.registerToken method to resume the service."
            goto L18
        L2f:
            r3 = 0
            return r3
        L31:
            java.lang.String r3 = "The service is stopped, it will give up all the actions until you call resumePush method to resume the service."
            goto L18
    }

    public static java.lang.String f(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "mobile_number"
            r1 = 0
            java.lang.String r2 = r2.getString(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L17
            java.lang.String r0 = cn.jpush.android.ad.m.a
            java.lang.String r2 = cn.jpush.android.ad.l.b(r2, r0)
        L17:
            return r2
    }

    public static void f(android.content.Context r2, int r3) {
            cn.jpush.android.cache.Key r0 = cn.jpush.android.cache.Key.registerType()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            cn.jpush.android.cache.Key r3 = r0.set(r3)
            r0 = 1
            cn.jpush.android.cache.Key[] r0 = new cn.jpush.android.cache.Key[r0]
            r1 = 0
            r0[r1] = r3
            cn.jpush.android.cache.Sp.set(r2, r0)
            return
    }

    public static void f(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "geofence_last_pull_state"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void f(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "push_link_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static java.lang.String g(android.content.Context r0, java.lang.String r1) {
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.JAppKey(r1)
            java.lang.Object r0 = cn.jpush.android.cache.Sp.get(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static void g(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "push_data_insights_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean g(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "notification_enabled"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static java.lang.String h(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "setting_push_time"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    public static java.lang.String h(android.content.Context r0, java.lang.String r1) {
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.MAppKey(r1)
            java.lang.Object r0 = cn.jpush.android.cache.Sp.get(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static void h(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "push_notification_callback_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static java.lang.String i(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "setting_silence_push_time"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    public static java.lang.String i(android.content.Context r0, java.lang.String r1) {
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.MAppId(r1)
            java.lang.Object r0 = cn.jpush.android.cache.Sp.get(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static void i(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = v(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "push_smart_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static int j(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "notification_num"
            int r1 = cn.jpush.android.api.JPushInterface.DEFAULT_NOTIFICATION_NUM
            int r2 = r2.getInt(r0, r1)
            return r2
    }

    public static java.lang.String j(android.content.Context r0, java.lang.String r1) {
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.MAppSecret(r1)
            java.lang.Object r0 = cn.jpush.android.cache.Sp.get(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static boolean k(android.content.Context r14) {
            android.content.SharedPreferences r0 = v(r14)
            java.lang.String r1 = "TAFreezeEndTime"
            r2 = -1
            long r4 = r0.getLong(r1, r2)
            r6 = 1800(0x708, double:8.893E-321)
            r8 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L15
            r4 = r8
        L15:
            android.content.SharedPreferences r0 = v(r14)
            java.lang.String r6 = "TAFreezeSetTime"
            long r10 = r0.getLong(r6, r2)
            r0 = 0
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L59
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 != 0) goto L29
            goto L59
        L29:
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 < 0) goto L3d
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r10
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L3c
            goto L3d
        L3c:
            return r0
        L3d:
            android.content.SharedPreferences r14 = v(r14)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            android.content.SharedPreferences$Editor r14 = r14.putLong(r6, r2)
            android.content.SharedPreferences$Editor r14 = r14.putLong(r1, r2)
            r14.apply()
            java.lang.String r14 = "PushConfig"
            java.lang.String r0 = "incorrect timestamp"
            cn.jpush.android.helper.Logger.w(r14, r0)
            r14 = 1
            return r14
        L59:
            return r0
    }

    public static boolean l(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "geofence_pull_enable"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static java.lang.String m(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "geofence_pull_limit"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    public static java.lang.String n(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "geofence_last_pull_state"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    public static boolean o(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "push_geofence_enable"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean p(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "push_link_enable"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean q(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "push_data_insights_enable"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean r(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "push_notification_callback_enable"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean s(android.content.Context r2) {
            android.content.SharedPreferences r2 = v(r2)
            java.lang.String r0 = "push_smart_enable"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static long t(android.content.Context r3) {
            android.content.SharedPreferences r3 = v(r3)
            java.lang.String r0 = "p_last_time"
            r1 = 0
            long r0 = r3.getLong(r0, r1)
            return r0
    }

    public static int u(android.content.Context r1) {
            cn.jpush.android.cache.Key r0 = cn.jpush.android.cache.Key.registerType()
            java.lang.Object r1 = cn.jpush.android.cache.Sp.get(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    private static android.content.SharedPreferences v(android.content.Context r1) {
            android.content.SharedPreferences r0 = cn.jpush.android.cache.a.a
            if (r0 != 0) goto L7
            a(r1)
        L7:
            android.content.SharedPreferences r1 = cn.jpush.android.cache.a.a
            return r1
    }
}
