package com.umeng.commonsdk.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k {
    public static final java.lang.String a = null;
    public static final java.lang.String b = "_dsk_s";
    public static final java.lang.String c = "_thm_z";
    public static final java.lang.String d = "_gdf_r";
    private static java.lang.Object e;


    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "probe"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.internal.utils.k.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.internal.utils.k.e = r0
            return
    }

    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = -1
            if (r0 <= r1) goto L8
            return r2
        L8:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            java.lang.Process r3 = r0.exec(r3)
            java.io.InputStream r0 = r3.getInputStream()
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1)
        L1e:
            java.lang.String r1 = r0.readLine()
            if (r1 == 0) goto L2c
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L1e
            r4 = 1
            goto L2d
        L2c:
            r4 = -1
        L2d:
            int r3 = r3.waitFor()     // Catch: java.lang.InterruptedException -> L35
            if (r3 == 0) goto L34
            return r2
        L34:
            return r4
        L35:
            return r2
    }

    public static java.lang.String a() {
            java.lang.String r0 = "thermal_zone"
            java.lang.String r1 = "ls /sys/class/thermal"
            int r1 = a(r1, r0)     // Catch: java.lang.Throwable -> L9
            goto La
        L9:
            r1 = -1
        La:
            if (r1 <= 0) goto Ld
            goto L14
        Ld:
            if (r1 >= 0) goto L12
            java.lang.String r0 = "noper"
            goto L14
        L12:
            java.lang.String r0 = "unknown"
        L14:
            return r0
    }

    public static java.lang.String a(android.content.Context r7) {
            r0 = 0
            android.content.Context r1 = r7.getApplicationContext()     // Catch: java.lang.Exception -> L47
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = com.umeng.commonsdk.internal.utils.k.a     // Catch: java.lang.Exception -> L47
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L4c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L47
            r2.<init>()     // Catch: java.lang.Exception -> L47
            java.lang.Object r3 = com.umeng.commonsdk.internal.utils.k.e     // Catch: java.lang.Exception -> L47
            monitor-enter(r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r4 = "_dsk_s"
            java.lang.String r5 = "_dsk_s"
            java.lang.String r6 = ""
            java.lang.String r5 = r1.getString(r5, r6)     // Catch: java.lang.Throwable -> L49
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "_thm_z"
            java.lang.String r5 = "_thm_z"
            java.lang.String r6 = ""
            java.lang.String r5 = r1.getString(r5, r6)     // Catch: java.lang.Throwable -> L49
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "_gdf_r"
            java.lang.String r5 = "_gdf_r"
            java.lang.String r6 = ""
            java.lang.String r1 = r1.getString(r5, r6)     // Catch: java.lang.Throwable -> L49
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L47
            return r7
        L47:
            r1 = move-exception
            goto L4d
        L49:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Exception -> L47
        L4c:
            return r0
        L4d:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r1)
            return r0
    }

    static /* synthetic */ void a(android.content.Context r0, java.lang.String[] r1) {
            b(r0, r1)
            return
    }

    public static java.lang.String b() {
            java.lang.String r0 = "goldfish"
            java.lang.String r1 = "ls /"
            int r1 = a(r1, r0)     // Catch: java.lang.Throwable -> L9
            goto La
        L9:
            r1 = -1
        La:
            if (r1 <= 0) goto Ld
            goto L14
        Ld:
            if (r1 >= 0) goto L12
            java.lang.String r0 = "noper"
            goto L14
        L12:
            java.lang.String r0 = "unknown"
        L14:
            return r0
    }

    public static void b(android.content.Context r2) {
            boolean r0 = c(r2)
            if (r0 != 0) goto L14
            java.lang.String r0 = "unknown"
            java.lang.String[] r0 = new java.lang.String[]{r0, r0, r0}
            com.umeng.commonsdk.internal.utils.k$1 r1 = new com.umeng.commonsdk.internal.utils.k$1
            r1.<init>(r0, r2)
            r1.start()
        L14:
            return
    }

    private static void b(android.content.Context r3, java.lang.String[] r4) {
            if (r3 != 0) goto L3
            goto L3d
        L3:
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r0 = com.umeng.commonsdk.internal.utils.k.a
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            if (r3 == 0) goto L3d
            java.lang.Object r0 = com.umeng.commonsdk.internal.utils.k.e
            monitor-enter(r0)
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "_dsk_s"
            r1 = r4[r1]     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences$Editor r3 = r3.putString(r2, r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "_thm_z"
            r2 = 1
            r2 = r4[r2]     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences$Editor r3 = r3.putString(r1, r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "_gdf_r"
            r2 = 2
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences$Editor r3 = r3.putString(r1, r4)     // Catch: java.lang.Throwable -> L3a
            r3.commit()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r3
        L3d:
            return
    }

    public static java.lang.String c() {
            java.lang.String r0 = "mtd"
            java.lang.String r1 = "sda"
            java.lang.String r2 = "mmcblk"
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L35
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = "/proc/diskstats"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L35
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L35
        L13:
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            boolean r5 = r3.contains(r2)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L21
            r0 = r2
            goto L38
        L21:
            boolean r5 = r3.contains(r1)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L29
            r0 = r1
            goto L38
        L29:
            boolean r3 = r3.contains(r0)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L13
            goto L38
        L30:
            r3 = r4
            goto L35
        L32:
            java.lang.String r0 = "unknown"
            goto L38
        L35:
            java.lang.String r0 = "noper"
            r4 = r3
        L38:
            if (r4 == 0) goto L3d
            r4.close()     // Catch: java.lang.Throwable -> L3d
        L3d:
            return r0
    }

    public static boolean c(android.content.Context r3) {
            r0 = 0
            if (r3 == 0) goto L23
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r1 = com.umeng.commonsdk.internal.utils.k.a
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r0)
            if (r3 == 0) goto L23
            java.lang.String r1 = "_dsk_s"
            java.lang.String r2 = ""
            java.lang.String r3 = r3.getString(r1, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L23
            r3 = 1
            return r3
        L23:
            return r0
    }
}
