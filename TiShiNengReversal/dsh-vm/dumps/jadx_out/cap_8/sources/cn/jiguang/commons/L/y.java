package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class y {
    private static final java.lang.String[] a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String[] f929c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String[] f930d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f931e = null;

    static {
            java.lang.String r16 = "/system/etc/.installed_su_daemon"
            java.lang.String r17 = "/dev/.mount_rw/"
            java.lang.String r1 = "/system/app/Superuser.apk"
            java.lang.String r2 = "/sbin/su"
            java.lang.String r3 = "/system/bin/su"
            java.lang.String r4 = "/system/xbin/su"
            java.lang.String r5 = "/data/local/xbin/su"
            java.lang.String r6 = "/data/local/bin/su"
            java.lang.String r7 = "/system/sd/xbin/su"
            java.lang.String r8 = "/system/bin/failsafe/su"
            java.lang.String r9 = "/data/local/su"
            java.lang.String r10 = "/su/bin/su"
            java.lang.String r11 = "/su/bin"
            java.lang.String r12 = "/system/xbin/daemonsu"
            java.lang.String r13 = "/system/etc/init.d/99SuperSUDaemon"
            java.lang.String r14 = "/dev/com.koushikdutta.superuser.daemon/"
            java.lang.String r15 = "/system/etc/.has_su_daemon"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            cn.jiguang.commons.L.y.a = r0
            java.lang.String r10 = "com.kingo.root"
            java.lang.String r11 = "com.alephzain.framaroot"
            java.lang.String r1 = "com.devadvance.rootcloak"
            java.lang.String r2 = "com.devadvance.rootcloakplus"
            java.lang.String r3 = "com.koushikdutta.superuser"
            java.lang.String r4 = "com.thirdparty.superuser"
            java.lang.String r5 = "eu.chainfire.supersu"
            java.lang.String r6 = "com.noshufou.android.su"
            java.lang.String r7 = "com.yellowes.su"
            java.lang.String r8 = "com.topjohnwu.magisk"
            java.lang.String r9 = "com.kingroot.kinguser"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            cn.jiguang.commons.L.y.f929c = r0
            java.lang.String r0 = "android.permission.WRITE_SECURE_SETTINGS"
            java.lang.String r1 = "android.permission.WRITE_SETTINGS"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            cn.jiguang.commons.L.y.f930d = r0
            r0 = 18
            byte[] r0 = new byte[r0]
            r0 = {x0058: FILL_ARRAY_DATA , data: [15, 106, 113, 101, 101, 85, 77, 54, 112, 116, 120, 94, 15, 110, 96, 127, 114, 88} // fill-array
            cn.jiguang.commons.L.y.f931e = r0
            return
    }

    public y() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean a() {
            java.lang.String r0 = "ro.build.type"
            java.lang.String r1 = "ro.secure"
            java.lang.String r2 = "ro.debuggable"
            java.lang.String r3 = "RootUtils"
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Exception -> L2e
            r6 = 0
        Le:
            r7 = 3
            if (r6 >= r7) goto L74
            r7 = r5[r6]     // Catch: java.lang.Exception -> L2e
            java.lang.String r8 = cn.jiguang.commons.L.ad.f(r7)     // Catch: java.lang.Exception -> L2e
            if (r8 == 0) goto L59
            boolean r9 = r7.equals(r2)     // Catch: java.lang.Exception -> L2e
            r10 = 1
            if (r9 == 0) goto L30
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Exception -> L2e
            if (r9 == 0) goto L30
            java.lang.String r0 = "Device is debuggable"
            cn.jiguang.commons.w.a.a(r3, r0)     // Catch: java.lang.Exception -> L2e
            return r10
        L2e:
            r0 = move-exception
            goto L5c
        L30:
            boolean r9 = r7.equals(r1)     // Catch: java.lang.Exception -> L2e
            if (r9 == 0) goto L44
            java.lang.String r9 = "0"
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Exception -> L2e
            if (r9 == 0) goto L44
            java.lang.String r0 = "Device is not secure"
            cn.jiguang.commons.w.a.a(r3, r0)     // Catch: java.lang.Exception -> L2e
            return r10
        L44:
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L2e
            if (r7 == 0) goto L59
            java.lang.String r7 = "userdebug"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L2e
            if (r7 == 0) goto L59
            java.lang.String r0 = "Build type is userdebug"
            cn.jiguang.commons.w.a.a(r3, r0)     // Catch: java.lang.Exception -> L2e
            return r10
        L59:
            int r6 = r6 + 1
            goto Le
        L5c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error checking build properties: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.f(r3, r0)
        L74:
            return r4
    }

    private static boolean c() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r1 = 0
            java.lang.String r2 = "RootUtils"
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Context is null, cannot check dangerous permissions"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
        Lf:
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            java.lang.String[] r4 = cn.jiguang.commons.L.y.f930d
            int r5 = r4.length
            r6 = 0
        L17:
            if (r6 >= r5) goto L5f
            r7 = r4[r6]
            java.lang.String r8 = r0.getPackageName()     // Catch: java.lang.Exception -> L3b
            int r8 = r3.checkPermission(r7, r8)     // Catch: java.lang.Exception -> L3b
            if (r8 != 0) goto L5c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r8.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r9 = "Dangerous permission granted: "
            r8.append(r9)     // Catch: java.lang.Exception -> L3b
            r8.append(r7)     // Catch: java.lang.Exception -> L3b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L3b
            cn.jiguang.commons.w.a.a(r2, r8)     // Catch: java.lang.Exception -> L3b
            r0 = 1
            return r0
        L3b:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Error checking permission "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = ": "
            r9.append(r7)
            java.lang.String r7 = r8.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            cn.jiguang.commons.w.a.f(r2, r7)
        L5c:
            int r6 = r6 + 1
            goto L17
        L5f:
            return r1
    }

    private static boolean d() {
            java.lang.String r1 = "RootUtils"
            java.lang.String r9 = "/data"
            java.lang.String r10 = "/dev"
            java.lang.String r2 = "/system"
            java.lang.String r3 = "/system/bin"
            java.lang.String r4 = "/system/sbin"
            java.lang.String r5 = "/system/xbin"
            java.lang.String r6 = "/vendor/bin"
            java.lang.String r7 = "/sbin"
            java.lang.String r8 = "/cache"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            r3 = 0
            r4 = 0
        L1a:
            r0 = 9
            if (r4 >= r0) goto L6b
            r5 = r2[r4]
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L47
            r0.<init>(r5)     // Catch: java.lang.Exception -> L47
            boolean r6 = r0.exists()     // Catch: java.lang.Exception -> L47
            if (r6 == 0) goto L68
            boolean r0 = r0.canWrite()     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r0.<init>()     // Catch: java.lang.Exception -> L47
            java.lang.String r6 = "Writable system path found: "
            r0.append(r6)     // Catch: java.lang.Exception -> L47
            r0.append(r5)     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L47
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L47
            r0 = 1
            return r0
        L47:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Error checking path "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = ": "
            r6.append(r5)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            cn.jiguang.commons.w.a.f(r1, r0)
        L68:
            int r4 = r4 + 1
            goto L1a
        L6b:
            return r3
    }

    private static boolean e() {
            java.lang.String r0 = ": "
            java.lang.String r1 = "RootUtils"
            java.lang.String[] r2 = cn.jiguang.commons.L.y.a
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L9:
            if (r5 >= r3) goto L5c
            r6 = r2[r5]
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            boolean r7 = r7.exists()     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            if (r7 == 0) goto L59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            r7.<init>()     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            java.lang.String r8 = "Root file found: "
            r7.append(r8)     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            r7.append(r6)     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Exception -> L2e java.lang.SecurityException -> L30
            r0 = 1
            return r0
        L2e:
            r7 = move-exception
            goto L32
        L30:
            r7 = move-exception
            goto L51
        L32:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Error checking root file "
        L39:
            r8.append(r9)
            r8.append(r6)
            r8.append(r0)
            java.lang.String r6 = r7.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            cn.jiguang.commons.w.a.f(r1, r6)
            goto L59
        L51:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Security exception checking root file "
            goto L39
        L59:
            int r5 = r5 + 1
            goto L9
        L5c:
            return r4
    }

    private static boolean f() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            java.lang.String r1 = "RootUtils"
            r2 = 0
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Context null, cannot check root packages"
            cn.jiguang.commons.w.a.f(r1, r0)
            return r2
        Lf:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r3 = cn.jiguang.commons.L.y.f929c
            int r4 = r3.length
            r5 = 0
        L17:
            if (r5 >= r4) goto L58
            r6 = r3[r5]
            r0.getPackageInfo(r6, r2)     // Catch: java.lang.Exception -> L34 android.content.pm.PackageManager.NameNotFoundException -> L55
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L34 android.content.pm.PackageManager.NameNotFoundException -> L55
            r7.<init>()     // Catch: java.lang.Exception -> L34 android.content.pm.PackageManager.NameNotFoundException -> L55
            java.lang.String r8 = "Root package found: "
            r7.append(r8)     // Catch: java.lang.Exception -> L34 android.content.pm.PackageManager.NameNotFoundException -> L55
            r7.append(r6)     // Catch: java.lang.Exception -> L34 android.content.pm.PackageManager.NameNotFoundException -> L55
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L34 android.content.pm.PackageManager.NameNotFoundException -> L55
            cn.jiguang.commons.w.a.a(r1, r7)     // Catch: java.lang.Exception -> L34 android.content.pm.PackageManager.NameNotFoundException -> L55
            r0 = 1
            return r0
        L34:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Error checking package "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = ": "
            r8.append(r6)
            java.lang.String r6 = r7.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            cn.jiguang.commons.w.a.f(r1, r6)
        L55:
            int r5 = r5 + 1
            goto L17
        L58:
            return r2
    }

    private static boolean g() {
            java.lang.String r0 = "Error destroying process: "
            java.lang.String r1 = "RootUtils"
            byte[] r2 = cn.jiguang.commons.L.y.f931e
            java.lang.String r2 = cn.jiguang.commons.L.n.c(r2)
            java.lang.String r3 = "su"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            r3 = 0
            java.lang.Process r3 = cn.jiguang.commons.L.aa.a(r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            if (r3 == 0) goto L7b
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            java.io.InputStream r5 = r3.getInputStream()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            java.lang.String r6 = "UTF-8"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L6c
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L6e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "SU binary found at: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.commons.w.a.a(r1, r4)     // Catch: java.lang.Throwable -> L6c
            r2.close()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            r2 = 1
            r3.destroy()     // Catch: java.lang.Exception -> L4d
            return r2
        L4d:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r3.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            cn.jiguang.commons.w.a.f(r1, r0)
            return r2
        L65:
            r2 = move-exception
            goto Le5
        L68:
            r2 = move-exception
            goto L99
        L6a:
            r2 = move-exception
            goto Lbe
        L6c:
            r4 = move-exception
            goto L72
        L6e:
            r2.close()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
            goto L7b
        L72:
            r2.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
        L7a:
            throw r4     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68 java.io.IOException -> L6a
        L7b:
            if (r3 == 0) goto Le3
            r3.destroy()     // Catch: java.lang.Exception -> L81
            goto Le3
        L81:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L87:
            r3.append(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r0)
            goto Le3
        L99:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "Error checking SU binary: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L65
            r4.append(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L65
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto Le3
            r3.destroy()     // Catch: java.lang.Exception -> Lb7
            goto Le3
        Lb7:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L87
        Lbe:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "SU binary not found: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L65
            r4.append(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L65
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto Le3
            r3.destroy()     // Catch: java.lang.Exception -> Ldc
            goto Le3
        Ldc:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L87
        Le3:
            r0 = 0
            return r0
        Le5:
            if (r3 == 0) goto L102
            r3.destroy()     // Catch: java.lang.Exception -> Leb
            goto L102
        Leb:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r3.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            cn.jiguang.commons.w.a.f(r1, r0)
        L102:
            throw r2
    }

    private static boolean h() {
            java.lang.String r0 = android.os.Build.TAGS
            if (r0 == 0) goto Le
            java.lang.String r1 = "test-keys"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean i() {
            boolean r0 = h()
            if (r0 != 0) goto L2d
            boolean r0 = e()
            if (r0 != 0) goto L2d
            boolean r0 = g()
            if (r0 != 0) goto L2d
            boolean r0 = f()
            if (r0 != 0) goto L2d
            boolean r0 = c()
            if (r0 != 0) goto L2d
            boolean r0 = a()
            if (r0 != 0) goto L2d
            boolean r0 = d()
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r0 = 0
            return r0
        L2d:
            r0 = 1
            return r0
    }
}
