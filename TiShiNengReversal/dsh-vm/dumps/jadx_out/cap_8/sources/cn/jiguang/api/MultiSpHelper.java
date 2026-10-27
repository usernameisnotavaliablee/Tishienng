package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MultiSpHelper {
    private static final java.lang.String SP_FILE = "cn.jpush.android.user.profile";
    private static final java.lang.String TAG = "MultiSpHelper";
    private static android.content.SharedPreferences sharedPref;

    private MultiSpHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void commitBoolean(android.content.Context r0, java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r0 = getSp(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.apply()
            return
    }

    public static void commitInt(android.content.Context r0, java.lang.String r1, int r2) {
            android.content.SharedPreferences r0 = getSp(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            r0.apply()
            return
    }

    public static void commitLong(android.content.Context r0, java.lang.String r1, long r2) {
            android.content.SharedPreferences r0 = getSp(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.apply()
            return
    }

    public static void commitString(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = getSp(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.apply()
            return
    }

    public static boolean getBoolean(android.content.Context r0, java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r0 = getSp(r0)
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public static int getInt(android.content.Context r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "jpush_register_code"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L10
            java.lang.String r0 = "service_stoped"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1b
        L10:
            android.content.SharedPreferences r0 = reload(r1)
            if (r0 == 0) goto L1b
            int r1 = r0.getInt(r2, r3)
            return r1
        L1b:
            android.content.SharedPreferences r1 = getSp(r1)
            int r1 = r1.getInt(r2, r3)
            return r1
    }

    public static long getLong(android.content.Context r0, java.lang.String r1, long r2) {
            android.content.SharedPreferences r0 = getSp(r0)
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    private static android.content.SharedPreferences getSp(android.content.Context r1) {
            android.content.SharedPreferences r0 = cn.jiguang.api.MultiSpHelper.sharedPref
            if (r0 != 0) goto L7
            init(r1)
        L7:
            android.content.SharedPreferences r1 = cn.jiguang.api.MultiSpHelper.sharedPref
            return r1
    }

    public static java.lang.String getString(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = getSp(r0)
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    private static void init(android.content.Context r2) {
            java.lang.String r0 = "cn.jpush.android.user.profile"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            cn.jiguang.api.MultiSpHelper.sharedPref = r2
            return
    }

    private static android.content.SharedPreferences reload(android.content.Context r2) {
            if (r2 == 0) goto Le
            r0 = 4
            java.lang.String r1 = "cn.jpush.android.user.profile"
            r2.getSharedPreferences(r1, r0)
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r1, r0)
            return r2
        Le:
            r2 = 0
            return r2
    }
}
