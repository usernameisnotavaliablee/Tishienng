package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeSpUtils {
    public SocializeSpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getInt(android.content.Context r0, java.lang.String r1, int r2) {
            android.content.SharedPreferences r0 = getSharedPreferences(r0)
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.lang.String getMac(android.content.Context r2) {
            android.content.SharedPreferences r2 = getSharedPreferences(r2)
            r0 = 0
            if (r2 == 0) goto Le
            java.lang.String r1 = "mac"
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        Le:
            return r0
    }

    public static synchronized java.lang.String getShareBoardConfig(android.content.Context r3) {
            java.lang.Class<com.umeng.socialize.utils.SocializeSpUtils> r0 = com.umeng.socialize.utils.SocializeSpUtils.class
            monitor-enter(r0)
            android.content.SharedPreferences r3 = getSharedPreferences(r3)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            if (r3 != 0) goto Lc
            monitor-exit(r0)
            return r1
        Lc:
            java.lang.String r2 = "shareboardconfig"
            java.lang.String r3 = r3.getString(r2, r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    private static android.content.SharedPreferences getSharedPreferences(android.content.Context r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "umeng_socialize"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static java.lang.String getString(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = getSharedPreferences(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r2, r0)
            return r1
    }

    public static long getTime(android.content.Context r3) {
            android.content.SharedPreferences r3 = getSharedPreferences(r3)
            r0 = 0
            if (r3 == 0) goto Le
            java.lang.String r2 = "request_time"
            long r0 = r3.getLong(r2, r0)
        Le:
            return r0
    }

    public static java.lang.String getUMEk(android.content.Context r2) {
            android.content.SharedPreferences r2 = getSharedPreferences(r2)
            r0 = 0
            if (r2 == 0) goto Le
            java.lang.String r1 = "ek"
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        Le:
            return r0
    }

    public static java.lang.String getUMId(android.content.Context r2) {
            android.content.SharedPreferences r2 = getSharedPreferences(r2)
            r0 = 0
            if (r2 == 0) goto Le
            java.lang.String r1 = "uid"
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        Le:
            return r0
    }

    public static void putInt(android.content.Context r0, java.lang.String r1, int r2) {
            android.content.SharedPreferences r0 = getSharedPreferences(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            r0.commit()
            return
    }

    public static boolean putMac(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = getSharedPreferences(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = ""
        L10:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "mac"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            boolean r1 = r1.commit()
            return r1
    }

    public static synchronized boolean putShareBoardConfig(android.content.Context r2, java.lang.String r3) {
            java.lang.Class<com.umeng.socialize.utils.SocializeSpUtils> r0 = com.umeng.socialize.utils.SocializeSpUtils.class
            monitor-enter(r0)
            android.content.SharedPreferences r2 = getSharedPreferences(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto Lc
            monitor-exit(r0)
            r2 = 0
            return r2
        Lc:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "shareboardconfig"
            android.content.SharedPreferences$Editor r2 = r2.putString(r1, r3)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r2.commit()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r2
        L1c:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r2
    }

    public static void putString(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = getSharedPreferences(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.commit()
            return
    }

    public static boolean putTime(android.content.Context r3) {
            android.content.SharedPreferences r3 = getSharedPreferences(r3)
            if (r3 == 0) goto L1c
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = "request_time"
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r3 = r3.putLong(r0, r1)
            boolean r3 = r3.commit()
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public static boolean putUMEk(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = getSharedPreferences(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = ""
        L10:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "ek"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            boolean r1 = r1.commit()
            return r1
    }

    public static boolean putUMId(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = getSharedPreferences(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = ""
        L10:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "uid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            boolean r1 = r1.commit()
            return r1
    }

    public static void remove(android.content.Context r0, java.lang.String r1) {
            android.content.SharedPreferences r0 = getSharedPreferences(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.commit()
            return
    }
}
