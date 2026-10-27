package com.baidu.idl.main.facesdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PreferencesUtil {
    private static final java.lang.String LEFT_MOUNT = "[";
    private static final java.lang.String LENGTH_SUFFIX = "#LENGTH";
    private static final java.lang.String RIGHT_MOUNT = "]";
    private static android.content.SharedPreferences mPrefs;

    public PreferencesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean contains(java.lang.String r1) {
            android.content.SharedPreferences r0 = getPreferences()
            boolean r1 = r0.contains(r1)
            return r1
    }

    public static java.util.Map<java.lang.String, ?> getAll() {
            android.content.SharedPreferences r0 = getPreferences()
            java.util.Map r0 = r0.getAll()
            return r0
    }

    public static boolean getBoolean(java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r0 = getPreferences()
            boolean r1 = r0.getBoolean(r1, r2)
            return r1
    }

    public static float getFloat(java.lang.String r1, float r2) {
            android.content.SharedPreferences r0 = getPreferences()
            float r1 = r0.getFloat(r1, r2)
            return r1
    }

    public static int getInt(java.lang.String r1, int r2) {
            android.content.SharedPreferences r0 = getPreferences()
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    public static long getLong(java.lang.String r1, long r2) {
            android.content.SharedPreferences r0 = getPreferences()
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    public static android.content.SharedPreferences getPreferences() {
            android.content.SharedPreferences r0 = com.baidu.idl.main.facesdk.utils.PreferencesUtil.mPrefs
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "please call iniPrefs(context) in the Application class onCreate."
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String getString(java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            java.lang.String r1 = r0.getString(r1, r2)
            return r1
    }

    @android.annotation.TargetApi(11)
    public static java.util.Set<java.lang.String> getStringSet(java.lang.String r1, java.util.Set<java.lang.String> r2) {
            android.content.SharedPreferences r0 = getPreferences()
            java.util.Set r1 = r0.getStringSet(r1, r2)
            return r1
    }

    public static void initPrefs(android.content.Context r2) {
            android.content.SharedPreferences r0 = com.baidu.idl.main.facesdk.utils.PreferencesUtil.mPrefs
            if (r0 != 0) goto L1a
            java.lang.String r0 = r2.getPackageName()
            if (r0 == 0) goto L12
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            com.baidu.idl.main.facesdk.utils.PreferencesUtil.mPrefs = r2
            return
        L12:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Prefs key may not be null"
            r2.<init>(r0)
            throw r2
        L1a:
            return
    }

    public static void putBoolean(java.lang.String r1, boolean r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r1, r2)
            r0.apply()
            return
    }

    public static void putFloat(java.lang.String r1, float r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putFloat(r1, r2)
            r0.apply()
            return
    }

    public static void putInt(java.lang.String r1, int r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putInt(r1, r2)
            r0.apply()
            return
    }

    public static void putLong(java.lang.String r1, long r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putLong(r1, r2)
            r0.apply()
            return
    }

    public static void putString(java.lang.String r1, java.lang.String r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r1, r2)
            r0.apply()
            return
    }

    @android.annotation.TargetApi(11)
    public static void putStringSet(java.lang.String r1, java.util.Set<java.lang.String> r2) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putStringSet(r1, r2)
            r0.apply()
            return
    }

    @java.lang.Deprecated
    public static void reInit(android.content.Context r2) {
            if (r2 == 0) goto L18
            java.lang.String r0 = r2.getPackageName()
            if (r0 == 0) goto L10
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            com.baidu.idl.main.facesdk.utils.PreferencesUtil.mPrefs = r2
            return
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Prefs key may not be null"
            r2.<init>(r0)
            throw r2
        L18:
            return
    }

    public static void remove(java.lang.String r5) {
            android.content.SharedPreferences r0 = getPreferences()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = "#LENGTH"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4 = -1
            int r0 = r0.getInt(r2, r4)
            if (r0 < 0) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.remove(r2)
            r2 = 0
        L48:
            if (r2 >= r0) goto L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r4 = "["
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.remove(r3)
            int r2 = r2 + 1
            goto L48
        L69:
            r1.remove(r5)
            r1.apply()
            return
    }
}
