package com.umeng.umzid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    public static java.lang.String[] a;

    static {
            java.lang.String r5 = "com.lody.virtual"
            java.lang.String r6 = "com.qihoo.magic"
            java.lang.String r0 = "com.bly.dkplat"
            java.lang.String r1 = "com.by.chaos"
            java.lang.String r2 = "com.lbe.parallel"
            java.lang.String r3 = "com.excelliance.dualaid"
            java.lang.String r4 = "com.excelliance.multiaccounts"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            com.umeng.umzid.d.a = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r6) {
            java.lang.String r0 = "com.umeng.commonsdk.statistics.common.DeviceConfig"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "getAndroidId"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            r2[r5] = r6     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L2a
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2a
            return r6
        L2a:
            java.lang.String r6 = ""
            return r6
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L11
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L11
            r1 = 2
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> L11
            r0.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> L11
            return r0
        L11:
            java.lang.String r2 = ""
            return r2
    }

    public static void a(android.content.Context r1, java.lang.String r2) {
            java.lang.String r2 = b(r2)
            if (r1 == 0) goto L23
            if (r2 == 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L23
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r1)
            if (r1 == 0) goto L23
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L23
            java.lang.String r0 = "mac"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.commit()
        L23:
            return
    }

    public static java.lang.String b(android.content.Context r2) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L1b
            android.content.SharedPreferences r2 = com.umeng.umzid.a.a(r2)
            if (r2 == 0) goto L1b
            java.lang.String r1 = "inputDomain"
            java.lang.String r2 = r2.getString(r1, r0)
            boolean r0 = c(r2)
            if (r0 == 0) goto L1a
            java.lang.String r2 = a(r2)
        L1a:
            return r2
        L1b:
            return r0
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> Lc
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r1
        Lc:
            java.lang.String r1 = ""
            return r1
    }

    public static void b(android.content.Context r1, java.lang.String r2) {
            java.lang.String r2 = b(r2)
            if (r1 == 0) goto L23
            if (r2 == 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L23
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r1)
            if (r1 == 0) goto L23
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L23
            java.lang.String r0 = "oaid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.commit()
        L23:
            return
    }

    public static java.lang.String c(android.content.Context r2) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L11
            android.content.SharedPreferences r2 = com.umeng.umzid.a.a(r2)
            if (r2 == 0) goto L11
            java.lang.String r1 = "uabc"
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L11:
            return r0
    }

    public static void c(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L1d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1d
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r1)
            if (r1 == 0) goto L1d
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L1d
            java.lang.String r0 = "resetToken"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.commit()
        L1d:
            return
    }

    public static boolean c(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = a(r2)
            java.lang.String r0 = b(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            return r1
    }

    public static java.lang.String d(android.content.Context r2) {
            r0 = 0
            if (r2 == 0) goto L10
            android.content.SharedPreferences r2 = com.umeng.umzid.a.a(r2)
            if (r2 == 0) goto L10
            java.lang.String r1 = "aaid"
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L10:
            return r0
    }

    public static void d(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L1d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1d
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r1)
            if (r1 == 0) goto L1d
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L1d
            java.lang.String r0 = "uabc"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.commit()
        L1d:
            return
    }

    public static java.lang.String e(android.content.Context r6) {
            java.lang.String r0 = "com.umeng.commonsdk.statistics.common.DeviceConfig"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "getMac"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            r2[r5] = r6     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L2a
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2a
            return r6
        L2a:
            java.lang.String r6 = ""
            return r6
    }

    public static void e(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r1)
            if (r1 == 0) goto L1f
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L1f
            java.lang.String r0 = "aaid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.commit()
        L1f:
            return
    }

    public static java.lang.String f(android.content.Context r6) {
            java.lang.String r0 = "com.umeng.commonsdk.statistics.common.DeviceConfig"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "getOaid"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            r2[r5] = r6     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L2a
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2a
            return r6
        L2a:
            java.lang.String r6 = ""
            return r6
    }

    public static void f(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r1)
            if (r1 == 0) goto L1f
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L1f
            java.lang.String r0 = "zdata"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.commit()
        L1f:
            return
    }

    public static boolean g(android.content.Context r5) {
            r0 = 0
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L1c
            java.lang.String[] r1 = com.umeng.umzid.d.a     // Catch: java.lang.Throwable -> L1c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L1c
            r3 = 0
        Ld:
            if (r3 >= r2) goto L1c
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L1c
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L19
            r5 = 1
            return r5
        L19:
            int r3 = r3 + 1
            goto Ld
        L1c:
            return r0
    }

    public static boolean h(android.content.Context r6) {
            java.lang.String r0 = "com.umeng.commonsdk.utils.UMUtils"
            r1 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "isMainProgress"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L28
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L28
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            r3[r5] = r6     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L28
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L28
            return r6
        L28:
            return r1
    }

    public static boolean i(android.content.Context r1) {
            if (r1 == 0) goto L19
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L19
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L19
            r0 = 17
            android.net.NetworkInfo r1 = r1.getNetworkInfo(r0)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L19
            boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = 0
            return r1
    }

    public static boolean j(android.content.Context r2) {
            r2 = 0
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "http.proxyPort"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L10
            goto L12
        L10:
            java.lang.String r1 = "-1"
        L12:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L20
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L20
            r0 = -1
            if (r1 == r0) goto L20
            r2 = 1
        L20:
            return r2
    }
}
