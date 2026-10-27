package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a() {
            java.io.File r0 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Exception -> L9
            long r0 = d(r0)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    private static long b(android.content.Context r2) {
            boolean r0 = f()     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            r0 = 0
            java.io.File r2 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r2, r0)     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L16
            java.io.File r2 = r2.getParentFile()     // Catch: java.lang.Exception -> L16
            long r0 = c(r2)     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static long c(java.io.File r6) {
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto L9
            return r0
        L9:
            int r2 = r6.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L23
            r4 = r6[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L1b
            long r4 = c(r4)
        L19:
            long r0 = r0 + r4
            goto L20
        L1b:
            long r4 = r4.length()
            goto L19
        L20:
            int r3 = r3 + 1
            goto Lb
        L23:
            return r0
    }

    public static long d(java.io.File r2) {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Le
            long r0 = r0.getTotalBytes()     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static org.json.JSONObject e(android.content.Context r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "inner_app_used"
            long r2 = j(r4)     // Catch: java.lang.Exception -> L3b
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "inner_free"
            long r2 = i()     // Catch: java.lang.Exception -> L3b
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "inner_total"
            long r2 = a()     // Catch: java.lang.Exception -> L3b
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "sdcard_app_used"
            long r2 = b(r4)     // Catch: java.lang.Exception -> L3b
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = "sdcard_free"
            long r1 = g()     // Catch: java.lang.Exception -> L3b
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = "sdcard_total"
            long r1 = h()     // Catch: java.lang.Exception -> L3b
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L3b
        L3b:
            return r0
    }

    public static boolean f() {
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static long g() {
            boolean r0 = f()     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto Lf
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> Lf
            long r0 = r0.getFreeSpace()     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private static long h() {
            boolean r0 = f()     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto Lf
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> Lf
            long r0 = r0.getTotalSpace()     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private static long i() {
            java.io.File r0 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Exception -> L9
            long r0 = k(r0)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    private static long j(android.content.Context r2) {
            java.io.File r2 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r2)     // Catch: java.lang.Exception -> Ld
            java.io.File r2 = r2.getParentFile()     // Catch: java.lang.Exception -> Ld
            long r0 = c(r2)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static long k(java.io.File r2) {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Le
            long r0 = r0.getFreeBytes()     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r0 = 0
            return r0
    }
}
