package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final java.io.File a(android.content.Context r1) {
            java.io.File r1 = b(r1)
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "/Beizi/download/"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L29
            r0.mkdirs()
        L29:
            return r0
        L2a:
            r1 = 0
            return r1
    }

    public static java.lang.String a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "/"
            r1 = 0
            if (r3 != 0) goto L6
            return r1
        L6:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L7c
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L13
            goto L7c
        L13:
            java.io.File r3 = f(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L6f
            r2.append(r3)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            r2.append(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r4.exists()     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L3c
            return r1
        L3c:
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r3.ready()     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L4b
            r3.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            return r1
        L4b:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r5.<init>()     // Catch: java.lang.Throwable -> L5f
        L55:
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L61
            r5.append(r0)     // Catch: java.lang.Throwable -> L5f
            goto L55
        L5f:
            goto L72
        L61:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5f
            r4.close()     // Catch: java.lang.Throwable -> L6b
            r3.close()     // Catch: java.lang.Throwable -> L6b
        L6b:
            return r5
        L6c:
            r4 = r1
            goto L72
        L6f:
            r3 = r1
            r4 = r3
        L72:
            if (r4 == 0) goto L77
            r4.close()     // Catch: java.lang.Throwable -> L7c
        L77:
            if (r3 == 0) goto L7c
            r3.close()     // Catch: java.lang.Throwable -> L7c
        L7c:
            return r1
    }

    public static void a(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Le
            r0.mkdirs()
        Le:
            return
    }

    public static boolean a(android.content.Context r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            return r1
    }

    public static boolean a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = "/"
            r1 = 0
            if (r4 != 0) goto L6
            return r1
        L6:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L71
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L71
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L19
            goto L71
        L19:
            r2 = 0
            java.io.File r4 = f(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r3.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Throwable -> L46
            r3.append(r4)     // Catch: java.lang.Throwable -> L46
            r3.append(r0)     // Catch: java.lang.Throwable -> L46
            r3.append(r5)     // Catch: java.lang.Throwable -> L46
            r3.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L46
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L46
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L46
            boolean r4 = r5.exists()     // Catch: java.lang.Throwable -> L46
            if (r4 != 0) goto L49
            r5.mkdirs()     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r5 = r2
            goto L67
        L49:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L46
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L46
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L46
            r5.<init>(r4, r1)     // Catch: java.lang.Throwable -> L46
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L66
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L66
            r4.write(r7)     // Catch: java.lang.Throwable -> L63
            r6 = 1
            r4.close()     // Catch: java.lang.Throwable -> L62
            r5.close()     // Catch: java.lang.Throwable -> L62
        L62:
            return r6
        L63:
            r2 = r4
            goto L67
        L66:
        L67:
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.lang.Throwable -> L71
        L6c:
            if (r5 == 0) goto L71
            r5.close()     // Catch: java.lang.Throwable -> L71
        L71:
            return r1
    }

    public static java.io.File b(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L22
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto L16
            boolean r1 = android.os.Environment.isExternalStorageRemovable()     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto L1a
        L16:
            java.io.File r0 = r3.getExternalFilesDir(r0)     // Catch: java.lang.Exception -> L22
        L1a:
            if (r0 != 0) goto L21
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Exception -> L22
            return r3
        L21:
            return r0
        L22:
            java.io.File r3 = r3.getFilesDir()
            return r3
    }

    public static void b(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: android.content.ActivityNotFoundException -> L13
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r3)     // Catch: android.content.ActivityNotFoundException -> L13
            if (r0 == 0) goto L12
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)     // Catch: android.content.ActivityNotFoundException -> L13
            r2.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L13
        L12:
            return
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "启动失败:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "/"
            if (r2 != 0) goto L5
            goto L4b
        L5:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L4b
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L12
            goto L4b
        L12:
            java.io.File r2 = f(r2)     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4b
            boolean r1 = r2.isDirectory()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L23
            goto L4b
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L4b
            r1.append(r2)     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            r1.append(r3)     // Catch: java.lang.Throwable -> L4b
            r1.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L4b
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L4b
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L48
            goto L4b
        L48:
            r3.delete()     // Catch: java.lang.Throwable -> L4b
        L4b:
            return
    }

    public static java.io.File c(android.content.Context r0) {
            java.io.File r0 = r0.getCacheDir()
            return r0
    }

    public static java.io.File d(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "/beizi/material/"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L27
            r0.mkdirs()
        L27:
            return r0
    }

    public static void e(android.content.Context r7) {
            java.io.File r7 = d(r7)     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r7.exists()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4c
            java.io.File[] r7 = r7.listFiles()     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L4c
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L4c
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            r4 = 1296000000(0x4d3f6400, double:6.40309077E-315)
            long r2 = r2 - r4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            int r2 = r7.length     // Catch: java.lang.Throwable -> L4c
            r3 = 0
        L26:
            if (r3 >= r2) goto L4c
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r4.isFile()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L49
            long r5 = r4.lastModified()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L4c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L4c
            java.lang.String r5 = r0.format(r5)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L4c
            java.util.Date r5 = r0.parse(r5)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L4c
            boolean r5 = r5.before(r1)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L4c
            if (r5 == 0) goto L49
            r4.delete()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L4c
        L49:
            int r3 = r3 + 1
            goto L26
        L4c:
            return
    }

    public static java.io.File f(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "/beizi/ad/"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L27
            r0.mkdirs()
        L27:
            return r0
    }

    public static void g(android.content.Context r11) {
            if (r11 != 0) goto L4
            goto L71
        L4:
            java.io.File r11 = f(r11)     // Catch: java.lang.Throwable -> L71
            boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L71
            boolean r0 = r11.isDirectory()     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L15
            goto L71
        L15:
            java.io.File[] r11 = r11.listFiles()     // Catch: java.lang.Throwable -> L71
            if (r11 != 0) goto L1c
            goto L71
        L1c:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L71
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L71
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L71
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L71
            int r2 = r11.length     // Catch: java.lang.Throwable -> L71
            r3 = 0
            r4 = 0
        L33:
            if (r4 >= r2) goto L71
            r5 = r11[r4]     // Catch: java.lang.Throwable -> L71
            boolean r6 = r5.isDirectory()     // Catch: java.lang.Throwable -> L71
            if (r6 != 0) goto L3e
            goto L6e
        L3e:
            java.io.File[] r5 = r5.listFiles()     // Catch: java.lang.Throwable -> L71
            if (r5 != 0) goto L45
            goto L6e
        L45:
            int r6 = r5.length     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            r7 = 0
        L47:
            if (r7 >= r6) goto L6e
            r8 = r5[r7]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            boolean r9 = r8.isFile()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            if (r9 != 0) goto L52
            goto L6b
        L52:
            long r9 = r8.lastModified()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            java.lang.String r9 = r0.format(r9)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            java.util.Date r9 = r0.parse(r9)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            boolean r9 = r9.before(r1)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
            if (r9 == 0) goto L6b
            r8.delete()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L71
        L6b:
            int r7 = r7 + 1
            goto L47
        L6e:
            int r4 = r4 + 1
            goto L33
        L71:
            return
    }
}
