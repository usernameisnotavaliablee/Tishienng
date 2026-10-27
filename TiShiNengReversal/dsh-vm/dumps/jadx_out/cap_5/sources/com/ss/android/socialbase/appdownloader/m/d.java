package com.ss.android.socialbase.appdownloader.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static java.lang.String a;
    private static java.lang.String b;
    private static java.lang.String c;
    private static java.lang.String d;
    private static java.lang.Boolean e;

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = "com.huawei.system.BuildEx"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "getOsBrand"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            java.lang.String r0 = ""
            return r0
    }

    public static int b(android.content.Context r4) {
            r0 = 1
            if (r4 == 0) goto L29
            java.lang.String r1 = m()
            java.lang.String r2 = e()
            boolean r1 = o(r1, r2)
            r2 = 0
            java.lang.String r3 = "pure_mode_state"
            if (r1 == 0) goto L20
            android.content.ContentResolver r4 = r4.getContentResolver()
            int r4 = android.provider.Settings.Secure.getInt(r4, r3, r0)
            if (r4 != 0) goto L1f
            return r2
        L1f:
            return r0
        L20:
            android.content.ContentResolver r4 = r4.getContentResolver()
            int r4 = android.provider.Settings.Secure.getInt(r4, r3, r2)
            return r4
        L29:
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.c
            if (r0 != 0) goto Lc
            java.lang.String r0 = "getReleaseType"
            java.lang.String r0 = f(r0)
            com.ss.android.socialbase.appdownloader.m.d.c = r0
        Lc:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.c
            return r0
    }

    private static int d(int r6) {
            r0 = 1
            java.lang.String r1 = "com.huawei.android.os.UserHandleEx"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "getUserId"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L27
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L27
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L27
            r3[r5] = r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L27
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L27
            return r6
        L27:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
            return r0
    }

    public static java.lang.String e() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.a
            if (r0 != 0) goto Lc
            java.lang.String r0 = "getApiVersion"
            java.lang.String r0 = f(r0)
            com.ss.android.socialbase.appdownloader.m.d.a = r0
        Lc:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.a
            return r0
    }

    private static java.lang.String f(java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = "ohos.system.version.SystemVersion"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r2 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.invoke(r1, r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            return r0
    }

    private static java.lang.String g(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "com.huawei.android.os.SystemPropertiesEx"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L26
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26
            r2[r5] = r7     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = "unknown"
            r2[r6] = r7     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L26
            return r7
        L26:
            return r8
    }

    public static boolean h(android.content.Context r0) {
            if (r0 == 0) goto L10
            int r0 = b(r0)
            if (r0 != 0) goto L10
            boolean r0 = l()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static boolean i() {
            boolean r0 = l()
            if (r0 == 0) goto L20
            java.lang.String r0 = m()
            java.lang.String r1 = e()
            boolean r0 = o(r0, r1)
            if (r0 == 0) goto L20
            int r0 = android.os.Process.myUid()
            int r0 = d(r0)
            if (r0 != 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }

    public static int j(android.content.Context r2) {
            r0 = 1
            if (r2 == 0) goto L11
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r1 = "pure_enhanced_mode_state"
            int r2 = android.provider.Settings.Secure.getInt(r2, r1, r0)
            if (r2 != 0) goto L11
            r2 = 0
            return r2
        L11:
            return r0
    }

    public static java.lang.String k() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.d
            if (r0 != 0) goto Lc
            java.lang.String r0 = "getBuildVersion"
            java.lang.String r0 = f(r0)
            com.ss.android.socialbase.appdownloader.m.d.d = r0
        Lc:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.d
            return r0
    }

    public static boolean l() {
            java.lang.Boolean r0 = com.ss.android.socialbase.appdownloader.m.d.e
            if (r0 != 0) goto L31
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.ss.android.socialbase.appdownloader.m.d.e = r0
            java.lang.String r0 = "156"
            java.lang.String r1 = "ro.config.hw_optb"
            java.lang.String r2 = "0"
            java.lang.String r1 = g(r1, r2)     // Catch: java.lang.Exception -> L31
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L2a
            java.lang.String r0 = "true"
            java.lang.String r1 = "hw_mc.pure_mode.enable"
            java.lang.String r2 = "false"
            java.lang.String r1 = g(r1, r2)     // Catch: java.lang.Exception -> L31
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L31
            com.ss.android.socialbase.appdownloader.m.d.e = r0     // Catch: java.lang.Exception -> L31
        L31:
            java.lang.Boolean r0 = com.ss.android.socialbase.appdownloader.m.d.e
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static java.lang.String m() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.b
            if (r0 != 0) goto Lc
            java.lang.String r0 = "getVersion"
            java.lang.String r0 = f(r0)
            com.ss.android.socialbase.appdownloader.m.d.b = r0
        Lc:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.b
            return r0
    }

    public static boolean n(android.content.Context r0) {
            if (r0 == 0) goto L10
            int r0 = j(r0)
            if (r0 != 0) goto L10
            boolean r0 = i()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private static boolean o(java.lang.String r0, java.lang.String r1) {
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L10
            java.lang.String r1 = "3"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }
}
