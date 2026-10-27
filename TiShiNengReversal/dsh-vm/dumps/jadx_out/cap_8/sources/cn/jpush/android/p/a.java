package cn.jpush.android.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static android.content.SharedPreferences a;

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(android.content.Context r3) {
            android.content.SharedPreferences r3 = c(r3)
            java.lang.String r0 = "key_in_app_last_show_time"
            r1 = -1
            long r0 = r3.getLong(r0, r1)
            return r0
    }

    public static void a(android.content.Context r1, long r2) {
            android.content.SharedPreferences r1 = c(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "key_in_app_last_show_time"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r0, r2)
            r1.apply()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = c(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "notify_inapp_latest_state"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static java.lang.String b(android.content.Context r2) {
            android.content.SharedPreferences r2 = c(r2)
            java.lang.String r0 = "top_banner_latest_state"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            return r2
    }

    private static android.content.SharedPreferences c(android.content.Context r2) {
            android.content.SharedPreferences r0 = cn.jpush.android.p.a.a
            if (r0 != 0) goto L15
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = "cn.jiguang.union.ads.core.common.prefs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            cn.jpush.android.p.a.a = r2
        L15:
            android.content.SharedPreferences r2 = cn.jpush.android.p.a.a
            return r2
    }
}
