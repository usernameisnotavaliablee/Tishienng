package com.umeng.commonsdk.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.internal.utils.a$a, reason: collision with other inner class name */
    public static class C0049a {
        public java.lang.String a;
        public java.lang.String b;

        public C0049a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float a(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L17
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Exception -> L17
            r1.updateFrom(r3)     // Catch: java.lang.Exception -> L17
            float r3 = r1.fontScale     // Catch: java.lang.Exception -> L17
            return r3
        L17:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getFontSize:"
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r3)
            return r0
    }

    public static long a(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            if (r4 != 0) goto L5
            return r0
        L5:
            com.umeng.commonsdk.utils.b r2 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L14
            r3 = 64
            android.content.pm.PackageInfo r5 = r2.a(r4, r5, r3)     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto L16
            long r4 = r5.firstInstallTime     // Catch: java.lang.Throwable -> L14
            return r4
        L14:
            r5 = move-exception
            goto L17
        L16:
            return r0
        L17:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "getAppFirstInstallTime"
            r4.append(r2)
            java.lang.String r5 = r5.getMessage()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r4)
            return r0
    }

    public static boolean a() {
            boolean r0 = com.umeng.commonsdk.internal.utils.h.a()
            return r0
    }

    public static long b(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            if (r4 != 0) goto L5
            return r0
        L5:
            com.umeng.commonsdk.utils.b r2 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L14
            r3 = 64
            android.content.pm.PackageInfo r5 = r2.a(r4, r5, r3)     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto L16
            long r4 = r5.lastUpdateTime     // Catch: java.lang.Throwable -> L14
            return r4
        L14:
            r5 = move-exception
            goto L17
        L16:
            return r0
        L17:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "getAppLastUpdateTime:"
            r4.append(r2)
            java.lang.String r5 = r5.getMessage()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r4)
            return r0
    }

    public static java.lang.String b() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static void b(android.content.Context r0) {
            return
    }

    public static int c(android.content.Context r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r0 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r2 = "status_bar_height"
            int r0 = r3.getIdentifier(r2, r0, r1)
            int r3 = r3.getDimensionPixelSize(r0)
            return r3
    }

    public static long c() {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r2
            return r0
    }

    public static java.lang.String c(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch: java.lang.Exception -> L9
            java.lang.String r1 = r0.getInstallerPackageName(r2)     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r2 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "getAppInstaller:"
            r1.append(r0)
            java.lang.String r2 = r2.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r1)
            r1 = 0
            return r1
    }

    public static int d(android.content.Context r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r0 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r2 = "navigation_bar_height"
            int r0 = r3.getIdentifier(r2, r0, r1)
            int r3 = r3.getDimensionPixelSize(r0)
            return r3
    }

    public static int d(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.umeng.commonsdk.utils.b r1 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L17
            r2 = 64
            android.content.pm.PackageInfo r4 = r1.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L19
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L19
            int r3 = r4.uid     // Catch: java.lang.Throwable -> L17
            return r3
        L17:
            r4 = move-exception
            goto L1a
        L19:
            return r0
        L1a:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "getAppUid:"
            r3.append(r1)
            java.lang.String r4 = r4.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r3)
            return r0
    }

    public static java.lang.String d() {
            r0 = 0
            java.lang.Class<android.os.Build> r1 = android.os.Build.class
            java.lang.String r2 = "getString"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L31
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L31
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L31
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "net.hostname"
            r2[r6] = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L33
            java.lang.String r1 = ""
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L31
            if (r1 != 0) goto L33
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.HelperUtils.getUmengMD5(r0)     // Catch: java.lang.Exception -> L31
            return r0
        L31:
            r1 = move-exception
            goto L34
        L33:
            return r0
        L34:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getHostName:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r1)
            return r0
    }

    public static android.util.DisplayMetrics e(android.content.Context r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            return r0
    }

    private static java.lang.String e(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Exception -> L1b
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r4, r2)     // Catch: java.lang.Exception -> L1b
            if (r4 == 0) goto L1d
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L1b
            java.lang.CharSequence r3 = r4.loadLabel(r3)     // Catch: java.lang.Exception -> L1b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1b
            return r3
        L1b:
            r3 = move-exception
            goto L1e
        L1d:
            return r0
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "getLabel:"
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r3)
            return r0
    }

    public static java.util.List<android.view.inputmethod.InputMethodInfo> f(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            if (r2 != 0) goto Lf
            return r0
        Lf:
            java.util.List r2 = r2.getInputMethodList()
            return r2
    }

    public static java.util.List<com.umeng.commonsdk.internal.utils.a.C0049a> g(android.content.Context r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L53
            r2.<init>()     // Catch: java.lang.Exception -> L53
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L53
            r2.append(r3)     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "/Android/data/"
            r2.append(r3)     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L53
            r1.<init>(r2)     // Catch: java.lang.Exception -> L53
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Exception -> L53
            if (r2 == 0) goto L58
            java.lang.String[] r1 = r1.list()     // Catch: java.lang.Exception -> L53
            if (r1 == 0) goto L58
            int r2 = r1.length     // Catch: java.lang.Exception -> L53
            if (r2 <= 0) goto L58
            int r2 = r1.length     // Catch: java.lang.Exception -> L53
            r3 = 0
        L34:
            if (r3 >= r2) goto L58
            r4 = r1[r3]     // Catch: java.lang.Exception -> L53
            if (r4 == 0) goto L55
            java.lang.String r5 = "."
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Exception -> L53
            if (r5 != 0) goto L55
            com.umeng.commonsdk.internal.utils.a$a r5 = new com.umeng.commonsdk.internal.utils.a$a     // Catch: java.lang.Exception -> L53
            r5.<init>()     // Catch: java.lang.Exception -> L53
            r5.a = r4     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = e(r6, r4)     // Catch: java.lang.Exception -> L53
            r5.b = r4     // Catch: java.lang.Exception -> L53
            r0.add(r5)     // Catch: java.lang.Exception -> L53
            goto L55
        L53:
            r6 = move-exception
            goto L59
        L55:
            int r3 = r3 + 1
            goto L34
        L58:
            return r0
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getAppList:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.umeng.commonsdk.statistics.common.ULog.e(r6)
            return r0
    }

    public static android.app.ActivityManager.MemoryInfo h(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "activity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            if (r2 != 0) goto Lf
            return r0
        Lf:
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r2.getMemoryInfo(r0)
            return r0
    }

    public static java.lang.String i(android.content.Context r0) {
            r0 = 0
            return r0
    }

    public static java.lang.String j(android.content.Context r0) {
            r0 = 0
            return r0
    }
}
