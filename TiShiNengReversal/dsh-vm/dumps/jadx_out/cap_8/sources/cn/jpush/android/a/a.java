package cn.jpush.android.a;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    private static android.content.SharedPreferences a;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r2) {
            android.content.SharedPreferences r0 = cn.jpush.android.a.a.a
            if (r0 != 0) goto Ld
            java.lang.String r0 = "asus_push_sdk_preferences"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            cn.jpush.android.a.a.a = r2
        Ld:
            return
    }

    protected static void a(java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = cn.jpush.android.a.a.a
            if (r0 == 0) goto Le
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r1, r2)
            r0.apply()
        Le:
            return
    }

    protected static void a(java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r2 = cn.jpush.android.a.a.a
            if (r2 == 0) goto Lf
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 0
            r2.putBoolean(r1, r0)
            r2.apply()
        Lf:
            return
    }

    protected static java.lang.Boolean b(java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r2 = cn.jpush.android.a.a.a
            if (r2 == 0) goto Le
            r0 = 1
            boolean r1 = r2.getBoolean(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        Le:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
    }

    protected static java.lang.String b(java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = cn.jpush.android.a.a.a
            if (r0 == 0) goto L9
            java.lang.String r1 = r0.getString(r1, r2)
            return r1
        L9:
            return r2
    }
}
