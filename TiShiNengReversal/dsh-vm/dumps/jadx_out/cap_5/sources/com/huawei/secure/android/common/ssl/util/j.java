package com.huawei.secure.android.common.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j {
    private static final java.lang.String a = "aegis";
    private static android.content.SharedPreferences b;

    static {
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.lang.String r0, int r1, android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            int r0 = r2.getInt(r0, r1)
            return r0
    }

    public static long b(java.lang.String r0, long r1, android.content.Context r3) {
            android.content.SharedPreferences r3 = f(r3)
            long r0 = r3.getLong(r0, r1)
            return r0
    }

    public static java.lang.String c(java.lang.String r0, java.lang.String r1, android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            java.lang.String r0 = r2.getString(r0, r1)
            return r0
    }

    public static void d(android.content.Context r0) {
            android.content.SharedPreferences r0 = f(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            return
    }

    public static void e(java.lang.String r0, android.content.Context r1) {
            android.content.SharedPreferences r1 = f(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            return
    }

    public static synchronized android.content.SharedPreferences f(android.content.Context r4) {
            java.lang.Class<com.huawei.secure.android.common.ssl.util.j> r0 = com.huawei.secure.android.common.ssl.util.j.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = com.huawei.secure.android.common.ssl.util.j.b     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L2d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r2 = 24
            r3 = 0
            if (r1 < r2) goto L1d
            android.content.Context r4 = androidx.profileinstaller.a.a(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "aegis"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r3)     // Catch: java.lang.Throwable -> L1b
            com.huawei.secure.android.common.ssl.util.j.b = r4     // Catch: java.lang.Throwable -> L1b
            goto L2d
        L1b:
            r4 = move-exception
            goto L31
        L1d:
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "aegis"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r3)     // Catch: java.lang.Throwable -> L1b
            com.huawei.secure.android.common.ssl.util.j.b = r4     // Catch: java.lang.Throwable -> L1b
        L2d:
            android.content.SharedPreferences r4 = com.huawei.secure.android.common.ssl.util.j.b     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return r4
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    public static void g(java.lang.String r0, int r1, android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r1)
            r0.apply()
            return
    }

    public static void h(java.lang.String r0, long r1, android.content.Context r3) {
            android.content.SharedPreferences r3 = f(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            r0.apply()
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, android.content.Context r2) {
            android.content.SharedPreferences r2 = f(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)
            r0.apply()
            return
    }
}
