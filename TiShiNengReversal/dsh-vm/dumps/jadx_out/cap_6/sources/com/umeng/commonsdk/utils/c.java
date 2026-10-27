package com.umeng.commonsdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static final java.lang.String a = null;
    private static final java.lang.String b = "lastReqTime";
    private static final int c = 48;
    private static final int d = 1;
    private static final int e = 720;
    private static final java.lang.String f = "iss";
    private static final java.lang.String g = "sinr";
    private static final java.lang.String h = "clean";
    private static boolean i;
    private static int j;
    private static java.lang.Object k;

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "sli"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.utils.c.a = r0
            r0 = 0
            com.umeng.commonsdk.utils.c.i = r0
            r0 = 720(0x2d0, float:1.009E-42)
            com.umeng.commonsdk.utils.c.j = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.utils.c.k = r0
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            if (r0 == 0) goto L61
            java.lang.String r1 = "iss"
            java.lang.String r2 = ""
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L61
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L61
            java.lang.Object r2 = com.umeng.commonsdk.utils.c.k
            monitor-enter(r2)
            r3 = 1
            com.umeng.commonsdk.utils.c.i = r3     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "sinr"
            java.lang.String r3 = ""
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r2, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 48
            if (r1 != 0) goto L5b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L58
            int r0 = a(r0)     // Catch: java.lang.Throwable -> L58
            com.umeng.commonsdk.utils.c.j = r0     // Catch: java.lang.Throwable -> L58
            return
        L58:
            com.umeng.commonsdk.utils.c.j = r2
            return
        L5b:
            com.umeng.commonsdk.utils.c.j = r2
            return
        L5e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            throw r0
        L61:
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(int r1) {
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 <= r0) goto L5
            return r0
        L5:
            r0 = 1
            if (r1 >= r0) goto L9
            return r0
        L9:
            return r1
    }

    public static int a(android.content.Context r1) {
            java.lang.Object r1 = com.umeng.commonsdk.utils.c.k
            monitor-enter(r1)
            int r0 = com.umeng.commonsdk.utils.c.j     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    public static void a(android.content.Context r2, long r3) {
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = com.umeng.commonsdk.utils.c.a
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 == 0) goto L1e
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "lastReqTime"
            android.content.SharedPreferences$Editor r2 = r2.putLong(r0, r3)
            r2.commit()
        L1e:
            return
    }

    public static boolean a() {
            java.lang.Object r0 = com.umeng.commonsdk.utils.c.k
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.utils.c.i     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static boolean a(long r1, long r3, int r5) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            java.util.Date r4 = new java.util.Date
            r4.<init>(r1)
            r3.setTime(r4)
            r1 = 10
            r3.add(r1, r5)
            java.util.Date r1 = r3.getTime()
            boolean r1 = r0.after(r1)
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    public static long b(android.content.Context r3) {
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r0 = com.umeng.commonsdk.utils.c.a
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r0 = 0
            if (r3 == 0) goto L19
            java.lang.String r2 = "lastReqTime"
            long r0 = r3.getLong(r2, r0)
        L19:
            return r0
    }

    public static void c(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = com.umeng.commonsdk.utils.c.a
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 == 0) goto L1f
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "clean"
            r1 = 1
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r1)
            r2.commit()
        L1f:
            return
    }

    public static void d(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = com.umeng.commonsdk.utils.c.a
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 == 0) goto L1e
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "clean"
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r1)
            r2.commit()
        L1e:
            return
    }

    public static boolean e(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = com.umeng.commonsdk.utils.c.a
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 == 0) goto L18
            java.lang.String r0 = "clean"
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
        L18:
            return r1
    }
}
