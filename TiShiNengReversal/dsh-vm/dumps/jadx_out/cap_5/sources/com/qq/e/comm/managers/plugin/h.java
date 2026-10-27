package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class h {
    private static java.lang.String a;
    private static java.lang.String b;

    static {
            java.lang.String r0 = "e_qq_com_plugin"
            java.lang.String r0 = com.qq.e.comm.managers.plugin.i.a(r0)
            com.qq.e.comm.managers.plugin.h.a = r0
            java.lang.String r0 = "e_qq_com_dex"
            java.lang.String r0 = com.qq.e.comm.managers.plugin.i.a(r0)
            com.qq.e.comm.managers.plugin.h.b = r0
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String a() {
            java.lang.String r0 = "gdt_plugin"
            return r0
    }

    static java.lang.String a(java.io.File r4) throws java.io.IOException {
            r0 = 0
            if (r4 == 0) goto L46
            boolean r1 = r4.exists()
            if (r1 != 0) goto La
            goto L46
        La:
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.lang.String r4 = "UTF-8"
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
        L20:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            if (r1 == 0) goto L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            goto L20
        L2a:
            r0 = move-exception
            goto L40
        L2c:
            r0 = move-exception
            goto L3f
        L2e:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r4.close()     // Catch: java.lang.Exception -> L35
        L35:
            return r0
        L36:
            r4 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L40
        L3b:
            r4 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L3f:
            throw r0     // Catch: java.lang.Throwable -> L2a
        L40:
            if (r4 == 0) goto L45
            r4.close()     // Catch: java.lang.Exception -> L45
        L45:
            throw r0
        L46:
            return r0
    }

    static void a(android.content.Context r3) {
            java.io.File r0 = g(r3)     // Catch: java.lang.Throwable -> L25
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "disdoat"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L25
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L12
            return
        L12:
            java.io.File r3 = c(r3)     // Catch: java.lang.Throwable -> L25
            r1 = 0
            a(r3, r1)     // Catch: java.lang.Throwable -> L25
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "oat"
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L25
            a(r3, r1)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            com.qq.e.comm.util.GDTLogger.w(r0, r3)
            return
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    private static void a(java.io.File r5, boolean r6) {
            if (r5 == 0) goto L2b
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L2b
            java.io.File[] r0 = r5.listFiles()
            if (r0 != 0) goto Lf
            goto L2b
        Lf:
            int r1 = r0.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L26
            r3 = r0[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L20
            r4 = 1
            a(r3, r4)
            goto L23
        L20:
            r3.delete()
        L23:
            int r2 = r2 + 1
            goto L11
        L26:
            if (r6 == 0) goto L2b
            r5.delete()
        L2b:
            return
    }

    static void a(java.lang.String r3, java.io.File r4) throws java.io.IOException {
            if (r4 == 0) goto L2d
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L11
            boolean r1 = r0.exists()
            if (r1 != 0) goto L11
            r0.mkdirs()
        L11:
            r0 = 0
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L28
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "UTF-8"
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L28
            r1.write(r3)     // Catch: java.lang.Throwable -> L25
            a(r1)
            return
        L25:
            r3 = move-exception
            r0 = r1
            goto L29
        L28:
            r3 = move-exception
        L29:
            a(r0)
            throw r3
        L2d:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Target File Can not be null in StringUtil.writeTo"
            r3.<init>(r4)
            throw r3
    }

    static boolean a(java.io.File r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1c
            if (r3 == 0) goto L1c
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
            if (r0 == 0) goto L1c
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 >= r1) goto L17
            goto L1c
        L17:
            boolean r2 = r2.setReadOnly()
            return r2
        L1c:
            r2 = 1
            return r2
    }

    public static boolean a(java.io.File r3, java.io.File r4, android.content.Context r5, boolean r6) {
            r0 = 0
            if (r3 == 0) goto L32
            if (r4 == 0) goto L32
            boolean r1 = r3.exists()
            if (r1 != 0) goto Lc
            goto L32
        Lc:
            boolean r1 = r3.renameTo(r4)
            r2 = 1
            if (r1 != 0) goto L2a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L29
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L29
            boolean r3 = a(r1, r4)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L28
            if (r3 == 0) goto L27
            boolean r3 = a(r4, r5)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L27
            return r2
        L27:
            return r0
        L28:
            return r3
        L29:
            return r0
        L2a:
            if (r6 == 0) goto L31
            boolean r3 = a(r4, r5)
            return r3
        L31:
            return r2
        L32:
            return r0
    }

    public static boolean a(java.io.InputStream r4, java.io.File r5) throws java.lang.Throwable {
            r0 = 0
            if (r4 == 0) goto L6f
            if (r5 != 0) goto L6
            goto L6f
        L6:
            r1 = 0
            java.io.File r2 = r5.getParentFile()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L3a
            boolean r3 = r2.mkdirs()     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L3a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "parent dir not exists "
            r5.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L38
            r5.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L38
            com.qq.e.comm.util.GDTLogger.e(r5)     // Catch: java.lang.Throwable -> L38
            a(r4)
            a(r1)
            return r0
        L38:
            r5 = move-exception
            goto L61
        L3a:
            boolean r2 = r5.canWrite()     // Catch: java.lang.Throwable -> L38
            r3 = 1
            if (r2 != 0) goto L44
            r5.setWritable(r3)     // Catch: java.lang.Throwable -> L38
        L44:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L38
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L38
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L57
        L4d:
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L57
            if (r1 <= 0) goto L59
            r2.write(r5, r0, r1)     // Catch: java.lang.Throwable -> L57
            goto L4d
        L57:
            r5 = move-exception
            goto L60
        L59:
            a(r4)
            a(r2)
            return r3
        L60:
            r1 = r2
        L61:
            java.lang.String r0 = "Exception while copy from InputStream to File"
            com.qq.e.comm.util.GDTLogger.e(r0, r5)     // Catch: java.lang.Throwable -> L67
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r5 = move-exception
            a(r4)
            a(r1)
            throw r5
        L6f:
            return r0
    }

    static java.lang.String b() {
            java.lang.String r0 = "gdtadv2.jar"
            return r0
    }

    public static void b(android.content.Context r3) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L25
            java.io.File r1 = g(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "stub_ver"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = a(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = com.qq.e.comm.managers.status.SDKStatus.getSDKVersion()     // Catch: java.lang.Throwable -> L25
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L1a
            return
        L1a:
            java.lang.String r1 = com.qq.e.comm.managers.status.SDKStatus.getSDKVersion()     // Catch: java.lang.Throwable -> L25
            a(r1, r0)     // Catch: java.lang.Throwable -> L25
            a(r3)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            com.qq.e.comm.util.GDTLogger.w(r0, r3)
            return
    }

    static java.io.File c(android.content.Context r2) {
            java.lang.String r0 = com.qq.e.comm.managers.plugin.h.b
            r1 = 0
            java.io.File r2 = r2.getDir(r0, r1)
            return r2
    }

    static java.io.File d(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = g(r2)
            java.lang.String r1 = "update_lc"
            r0.<init>(r2, r1)
            return r0
    }

    static java.io.File e(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = g(r2)
            java.lang.String r1 = "gdt_plugin.next"
            r0.<init>(r2, r1)
            return r0
    }

    static java.io.File f(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = g(r2)
            java.lang.String r1 = "gdt_plugin.next.sig"
            r0.<init>(r2, r1)
            return r0
    }

    static java.io.File g(android.content.Context r2) {
            java.lang.String r0 = com.qq.e.comm.managers.plugin.h.a
            r1 = 0
            java.io.File r2 = r2.getDir(r0, r1)
            return r2
    }

    static java.io.File h(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = g(r2)
            java.lang.String r1 = "gdt_plugin.jar"
            r0.<init>(r2, r1)
            return r0
    }

    static java.io.File i(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = g(r2)
            java.lang.String r1 = "gdt_plugin.jar.sig"
            r0.<init>(r2, r1)
            return r0
    }
}
