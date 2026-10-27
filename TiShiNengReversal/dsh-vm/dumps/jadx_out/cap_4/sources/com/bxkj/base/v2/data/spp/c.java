package com.bxkj.base.v2.data.spp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            boolean r1 = b(r1, r2, r3, r0)
            return r1
    }

    public static boolean b(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            boolean r1 = r1.getBoolean(r3, r4)
            return r1
    }

    public static android.content.SharedPreferences.Editor c(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            return r1
    }

    public static float d(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = e(r1, r2, r3, r0)
            return r1
    }

    public static float e(android.content.Context r1, java.lang.String r2, java.lang.String r3, float r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            float r1 = r1.getFloat(r3, r4)
            return r1
    }

    public static int f(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = -1
            int r1 = g(r1, r2, r3, r0)
            return r1
    }

    public static int g(android.content.Context r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            int r1 = r1.getInt(r3, r4)
            return r1
    }

    public static long h(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r0 = -1
            long r2 = i(r2, r3, r4, r0)
            return r2
    }

    public static long i(android.content.Context r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            long r1 = r1.getLong(r3, r4)
            return r1
    }

    public static java.lang.String j(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.lang.String r1 = k(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String k(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            java.lang.String r1 = r1.getString(r3, r4)
            return r1
    }

    public static boolean l(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putBoolean(r3, r4)
            boolean r1 = r1.commit()
            return r1
    }

    public static boolean m(android.content.Context r1, java.lang.String r2, java.lang.String r3, float r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putFloat(r3, r4)
            boolean r1 = r1.commit()
            return r1
    }

    public static boolean n(android.content.Context r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putInt(r3, r4)
            boolean r1 = r1.commit()
            return r1
    }

    public static boolean o(android.content.Context r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putLong(r3, r4)
            boolean r1 = r1.commit()
            return r1
    }

    public static boolean p(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r3, r4)
            boolean r1 = r1.commit()
            return r1
    }

    public static boolean q(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.remove(r3)
            boolean r1 = r1.commit()
            return r1
    }
}
