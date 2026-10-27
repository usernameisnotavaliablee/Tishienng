package com.ss.android.socialbase.appdownloader.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static java.lang.Boolean a;

    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.WorkerThread
    public static boolean a() {
            java.lang.String r0 = "3132372e302e302e31"
            java.lang.String r1 = c(r0)     // Catch: java.io.IOException -> L1e
            java.net.InetAddress.getByName(r1)     // Catch: java.io.IOException -> L1e
            java.net.Socket r1 = new java.net.Socket     // Catch: java.io.IOException -> L1e
            java.lang.String r0 = c(r0)     // Catch: java.io.IOException -> L1e
            java.lang.String r2 = "3237303432"
            java.lang.String r2 = c(r2)     // Catch: java.io.IOException -> L1e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.io.IOException -> L1e
            r1.<init>(r0, r2)     // Catch: java.io.IOException -> L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public static boolean b(android.content.Context r3) {
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            r1 = 0
            android.content.Intent r3 = r3.registerReceiver(r1, r0)
            r0 = 0
            if (r3 != 0) goto L10
            return r0
        L10:
            java.lang.String r1 = "plugged"
            r2 = -1
            int r3 = r3.getIntExtra(r1, r2)
            r1 = 2
            if (r3 != r1) goto L1c
            r3 = 1
            return r3
        L1c:
            return r0
    }

    private static java.lang.String c(@androidx.annotation.NonNull java.lang.String r0) {
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.j(r0)
            return r0
    }

    @androidx.annotation.WorkerThread
    public static synchronized void d(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.Class<com.ss.android.socialbase.appdownloader.m.c> r0 = com.ss.android.socialbase.appdownloader.m.c.class
            monitor-enter(r0)
            java.lang.Boolean r1 = com.ss.android.socialbase.appdownloader.m.c.a     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L36
            boolean r1 = l()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            boolean r1 = m(r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            boolean r1 = b(r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            boolean r1 = i(r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2f
            boolean r1 = a()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            boolean r2 = k(r2)     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L2f
            r2 = 1
            goto L30
        L2d:
            r2 = move-exception
            goto L38
        L2f:
            r2 = 0
        L30:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2d
            com.ss.android.socialbase.appdownloader.m.c.a = r2     // Catch: java.lang.Throwable -> L2d
        L36:
            monitor-exit(r0)
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r2
    }

    public static boolean e() {
            java.lang.Boolean r0 = com.ss.android.socialbase.appdownloader.m.c.a
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static boolean f() {
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Exception -> L86
            r0.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "/proc/"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L86
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L86
            r1.append(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "/maps"
            r1.append(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L86
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L86
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Exception -> L86
            r3.<init>(r1)     // Catch: java.lang.Exception -> L86
            r2.<init>(r3)     // Catch: java.lang.Exception -> L86
        L26:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Exception -> L86
            r3 = 1
            if (r1 == 0) goto L4c
            java.lang.String r4 = ".so"
            boolean r4 = r1.endsWith(r4)     // Catch: java.lang.Exception -> L86
            if (r4 != 0) goto L3d
            java.lang.String r4 = ".jar"
            boolean r4 = r1.endsWith(r4)     // Catch: java.lang.Exception -> L86
            if (r4 == 0) goto L26
        L3d:
            java.lang.String r4 = " "
            int r4 = r1.lastIndexOf(r4)     // Catch: java.lang.Exception -> L86
            int r4 = r4 + r3
            java.lang.String r1 = r1.substring(r4)     // Catch: java.lang.Exception -> L86
            r0.add(r1)     // Catch: java.lang.Exception -> L86
            goto L26
        L4c:
            r2.close()     // Catch: java.lang.Exception -> L86
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L86
        L53:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L86
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "636f6d2e73617572696b2e737562737472617465"
            java.lang.String r2 = c(r2)     // Catch: java.lang.Exception -> L86
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L86
            if (r2 == 0) goto L6c
            return r3
        L6c:
            java.lang.String r2 = "58706f7365644272696467652e6a6172"
            java.lang.String r2 = c(r2)     // Catch: java.lang.Exception -> L86
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L86
            if (r2 == 0) goto L79
            return r3
        L79:
            java.lang.String r2 = "6c696273616e64686f6f6b2e656478702e736f"
            java.lang.String r2 = c(r2)     // Catch: java.lang.Exception -> L86
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L86
            if (r1 == 0) goto L53
            return r3
        L86:
            r0 = 0
            return r0
    }

    private static boolean g(android.content.Context r8) {
            java.lang.String r0 = "64652e726f62762e616e64726f69642e78706f736564"
            java.lang.String r1 = c(r0)
            java.lang.String r0 = "636f6d2e746f706a6f686e77752e6d616769736b"
            java.lang.String r2 = c(r0)
            java.lang.String r0 = "696f2e76612e6578706f736564"
            java.lang.String r3 = c(r0)
            java.lang.String r0 = "636f6d2e77696e642e636f74746572"
            java.lang.String r4 = c(r0)
            java.lang.String r0 = "6f72672e6d656f776361742e656478706f7365642e6d616e61676572"
            java.lang.String r5 = c(r0)
            java.lang.String r0 = "6d652e7765697368752e657870"
            java.lang.String r6 = c(r0)
            java.lang.String r0 = "636f6d2e73617572696b2e737562737472617465"
            java.lang.String r7 = c(r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.util.Iterator r1 = r0.iterator()
        L3a:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            android.content.pm.PackageInfo r0 = r8.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r0 == 0) goto L3a
            r8 = 1
            return r8
        L4f:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            goto L3a
        L54:
            return r2
    }

    private static int h() {
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L29
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch: java.lang.Exception -> L29
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = "726f2e736563757265"
            java.lang.String r4 = c(r4)     // Catch: java.lang.Exception -> L29
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L29
            r5[r0] = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r3 = r3.invoke(r2, r5)     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L2a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L29
            r2 = r3
            goto L2a
        L29:
        L2a:
            if (r2 == 0) goto L35
            java.lang.String r3 = "0"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L35
            goto L36
        L35:
            r0 = 1
        L36:
            return r0
    }

    public static boolean i(android.content.Context r2) {
            r0 = 0
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L13
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L13
            int r2 = r2.getSimState()     // Catch: java.lang.Throwable -> L13
            r1 = 1
            if (r2 == r1) goto L13
            if (r2 == 0) goto L13
            return r1
        L13:
            return r0
    }

    private static boolean j() {
            java.lang.String r0 = "2f7362696e2f7375"
            java.lang.String r1 = c(r0)
            java.lang.String r0 = "2f73797374656d2f62696e2f7375"
            java.lang.String r2 = c(r0)
            java.lang.String r0 = "2f73797374656d2f7862696e2f7375"
            java.lang.String r3 = c(r0)
            java.lang.String r0 = "2f646174612f6c6f63616c2f7862696e2f7375"
            java.lang.String r4 = c(r0)
            java.lang.String r0 = "2f646174612f6c6f63616c2f62696e2f7375"
            java.lang.String r5 = c(r0)
            java.lang.String r0 = "2f73797374656d2f73642f7862696e2f7375"
            java.lang.String r6 = c(r0)
            java.lang.String r0 = "2f73797374656d2f62696e2f6661696c736166652f7375"
            java.lang.String r7 = c(r0)
            java.lang.String r0 = "2f646174612f6c6f63616c2f7375"
            java.lang.String r8 = c(r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            r1 = 0
            r2 = 0
        L36:
            r3 = 8
            if (r2 >= r3) goto L4c
            r3 = r0[r2]
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L49
            r0 = 1
            return r0
        L49:
            int r2 = r2 + 1
            goto L36
        L4c:
            return r1
    }

    @androidx.annotation.WorkerThread
    public static boolean k(android.content.Context r1) {
            boolean r0 = f()
            if (r0 != 0) goto Lf
            boolean r1 = g(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static boolean l() {
            int r0 = h()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            boolean r0 = j()
            return r0
    }

    public static boolean m(android.content.Context r1) {
            r0 = 0
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Exception -> Ld
            int r1 = r1.flags     // Catch: java.lang.Exception -> Ld
            r1 = r1 & 2
            if (r1 == 0) goto Ld
            r1 = 1
            return r1
        Ld:
            return r0
    }
}
